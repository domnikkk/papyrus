/*****************************************************************************
 * Copyright (c) 2013, 2015 CEA LIST, Christian W. Damus, and others.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) - Initial API and implementation
 *  Christian W. Damus - bug 399859
 *  Christian W. Damus - bug 458655
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.decoratormodel.model;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.InternalTransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.papyrus.infra.core.resource.AbstractBaseModel;
import org.eclipse.papyrus.infra.core.resource.AbstractModel;
import org.eclipse.papyrus.infra.core.resource.IModelSnippet;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.ModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.Activator;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * A Papyrus Model managing loaded decorator models for the model being edited.
 */
public class DecoratorModel extends AbstractModel {

	/** identifier of this IModel */
	public static final String ID = "org.eclipse.papyrus.uml.decoratormodel.DecoratorModel"; //$NON-NLS-1$

	// URI of an as-yet-empty resource that we are creating to put profile applications into, so that it will
	// be known to be a decorator model resource
	private URI creatingDecoratorModelURI;

	@Override
	public String getIdentifier() {
		return ID;
	}

	@Override
	public void init(ModelSet modelSet) {
		super.init(modelSet);

		DecoratorModelUtils.configure(modelSet);
	}

	/*
	 * Overridden to make it visible in this package.
	 */
	@Override
	protected ModelSet getModelManager() {
		return super.getModelManager();
	}

	@Override
	public void loadModel(IPath path) {
		loadModel(getPlatformURI(path));
	}

	/**
	 * Returns a platform resource URI of the given path
	 * 
	 * @param path
	 *            the path
	 * @return the uri
	 */
	protected URI getPlatformURI(IPath path) {
		return URI.createPlatformResourceURI(path.toString(), true);
	}

	@Override
	public void loadModel(URI uri) {
		List<Resource> resources = getResources();
		for (Resource resource : resources) {
			try {
				if (!resource.isLoaded()) {
					resource.load(null);
				}
				EcoreUtil.resolveAll(resource); // Ensure that models applying the profiles are loaded
				configureResource(resource);
			} catch (IOException e) {
				Activator.log.error(e);
			}
		}
		// call registered snippets
		snippets.performStart(this);
	}

	/**
	 * Returns the dynamically computed list of resources that are loaded decorator models.
	 * 
	 * @return the loaded decorator models
	 */
	protected List<Resource> getResources() {
		List<Resource> result = Lists.newArrayListWithExpectedSize(0);

		for (Resource next : ImmutableList.copyOf(getModelManager().getResources())) {
			if (isDecoratorModelResource(next)) {
				URI trimmed = next.getURI().trimFileExtension();
				if (trimmed.equals(getModelManager().getURIWithoutExtension())) {
					// This is one of ours
					result.add(next);
				}
			}
		}

		return result;
	}

	public boolean isDecoratorModelResource(Resource resource) {
		return isDecoratorModel(resource) || resource.getURI().equals(creatingDecoratorModelURI);
	}

	protected void configureResource(Resource resource) {
		if (resource instanceof XMIResource) {
			((XMIResource) resource).getDefaultSaveOptions().putAll(getSaveOptions());
			((XMIResource) resource).setEncoding(AbstractBaseModel.ENCODING);
		}
	}

	public Map<Object, Object> getSaveOptions() {
		return AbstractBaseModel.getDefaultSaveOptions();
	}

	@Override
	public void saveModel() throws IOException {
		List<Resource> resources = getResources();
		for (Resource resource : resources) {
			if (!getModelManager().getTransactionalEditingDomain().isReadOnly(resource) && !ModelUtils.resourceFailedOnLoad(resource)) {
				resource.save(getSaveOptions());
			}
		}
	}

	@Override
	public void unload() {
		// call registered snippets
		snippets.performDispose(this);
		List<Resource> resources = getResources();
		for (Resource resource : resources) {
			resource.unload();
		}
	}

	@Override
	public void addModelSnippet(IModelSnippet snippet) {
		snippets.add(snippet);
	}

	@Override
	public Set<URI> getModifiedURIs() {
		Set<URI> result = Sets.newHashSet();

		for (Resource resource : getResources()) {
			if (!getModelManager().isTrackingModification() || resource.isModified()) {
				result.add(resource.getURI());
			}
		}

		return result;
	}

	public Resource loadDecoratorModel(URI uri) {
		final ResourceSet resourceSet = getModelManager();

		Resource result = resourceSet.getResource(uri, false);
		if (result == null) {
			// Use the UML resource implementation to ensure consistent handling of the UML metamodel and profiles
			creatingDecoratorModelURI = uri;
			try {
				result = resourceSet.createResource(uri, UMLPackage.eCONTENT_TYPE);
			} finally {
				creatingDecoratorModelURI = null;
			}
		}

		if (!result.isLoaded()) {
			try {
				// First, ensure that the transaction's change-recorder is attached to the resource and gets all notifications
				// ahead of anything but the CacheAdapter so that it will propagate first to elements as they are loaded and
				// will, therefore, have an opportunity to catch the base_Xyz reference proxy resolution events that trigger
				// eventual diagram updates.
				ensureTransactionChangeRecorder(result);

				// Now load it
				result.load(resourceSet.getLoadOptions());

				// Ensure that references to base elements resolve so that the diagrams
				// and property sheets etc. may all update
				EcoreUtil.resolveAll(result);
			} catch (Exception e) {
				// Fine, we couldn't load it all. Will recover whatever we did manage to load
			}
		}

		return result;
	}

	private void ensureTransactionChangeRecorder(Resource resource) {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(resource);
		if (domain != null) {
			Adapter recorder = ((InternalTransactionalEditingDomain) domain).getChangeRecorder();
			if (recorder != null) {
				int afterCacheAdapter = resource.eAdapters().indexOf(CacheAdapter.getCacheAdapter(resource)) + 1;
				int index = resource.eAdapters().indexOf(recorder);
				if (index < 0) {
					resource.eAdapters().add(afterCacheAdapter, recorder);
				} else {
					resource.eAdapters().move(afterCacheAdapter, index);
				}
			}
		}
	}

	public static boolean isDecoratorModel(Resource resource) {
		boolean result = false;

		if (resource.isLoaded()) {
			Package root = (Package) EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.Literals.PACKAGE);
			if (root != null) {
				result = DecoratorModelUtils.hasExternalizationProfile(root);
			}
		}

		return result;
	}

	public static DecoratorModel getInstance(ModelSet modelSet) {
		return (DecoratorModel) modelSet.getModel(ID);
	}

	//
	// No-ops. I am like the AdditionalResourcesModel: I don't manage an aspect of the model being edited, rather, other models
	//

	@Override
	public void createModel(IPath fullPath) {
		// Pass
	}

	@Override
	public void createModel(URI uri) {
		// Pass
	}

	@Override
	public void importModel(IPath path) {
		// Pass
	}

	@Override
	public void importModel(URI uri) {
		// Pass
	}

	@Override
	public void changeModelPath(IPath fullPath) {
		// Pass
	}

	@Override
	public void setModelURI(URI uri) {
		// Pass
	}
}
