/*
 * Copyright (c) 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.papyrus.junit.utils.rules;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.sasheditor.DiModel;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationModel;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.io.ByteStreams;


/**
 * Abstract superclass for JUnit test fixture rules that provide:
 * <ul>
 * <li>an editing domain of some kind (subclasses must create it)</li>
 * <li>a test project in the workspace, exposed via a nested {@link ProjectFixture} rule</li>
 * <li>a test {@link Package} loaded from a resource in the plug-in and saved as <tt>model.uml</tt> in the test project. This model is specified using
 * an annotation on the test, as described below</li>
 * </ul>
 * The test model template to load into the editing domain and project must be specified by one of the following annotations:
 * <ul>
 * <li>{@link JavaResource @JavaResource}: specifies the path to a resource to be loaded from the test class's classpath, using the
 * {@link Class#getResource(String)} API</li>
 * <li>{@link PluginResource @PluginResource}: specifies a path relative to the root of the OSGi bundle containing the test class, to be loaded via
 * the {@link Bundle#getEntry(String)} API</li>
 * </ul>
 * The resource annotation may be specified either on the test method, in which case it applies to that test case, or on the test
 * class, in which case it applies to all test methods in the class that do not have a resource annotation of their own (method
 * annotations take precedence over the class annotation).
 */
public abstract class AbstractModelFixture<T extends EditingDomain> extends TestWatcher {

	private final ProjectFixture project = new ProjectFixture();

	private T domain;

	private Package model;

	private Class<?> testClass;

	private Iterable<URI> initialResourceURIs;

	public AbstractModelFixture() {
		super();
	}

	public Statement apply(Statement base, Description description) {
		testClass = description.getTestClass();

		// Wrap myself in the project rule so that the project exists when I start
		Statement result = super.apply(base, description);
		result = project.apply(result, description);
		return result;
	}

	/**
	 * Obtains the nested project fixture rule. If stored in a field of the test class, it must not be annotated as a {@link Rule @Rule} because that
	 * would result in double initialization of the rule.
	 * 
	 * @return the nested project fixture
	 */
	public ProjectFixture getProject() {
		return project;
	}

	public T getEditingDomain() {
		return domain;
	}

	public ResourceSet getResourceSet() {
		EditingDomain domain = getEditingDomain();
		return (domain == null) ? null : domain.getResourceSet();
	}

	/**
	 * Obtains the test model, which is resident in the <tt>model.uml</tt> file in the test project (as indicated by its
	 * {@linkplain #getModelResourceURI() URI}).
	 * 
	 * @return the test model
	 */
	public Package getModel() {
		return model;
	}

	public Resource getModelResource() {
		return getModel().eResource();
	}

	public URI getModelResourceURI() {
		return getModelResource().getURI();
	}

	public URI getModelURI() {
		return EcoreUtil.getURI(getModel());
	}

	protected abstract T createEditingDomain();

	@Override
	protected void starting(Description description) {
		domain = createEditingDomain();
		model = (Package)Iterables.getFirst(initModelResources(description), null).getContents().get(0);
		
		// We have finished initializing
		initialResourceURIs = null;
	}

	protected Iterable<Resource> initModelResources(Description description) {
		List<Resource> result;

		// Don't initialize the resources more than once (subclasses such as PapyrusEditorFixture can repeat this)
		if(initialResourceURIs == null) {
			Annotation resourceAnnotation = getResourceAnnotation(description);
			ResourceKind kind = ResourceKind.getResourceKind(resourceAnnotation);

			final String[] paths = kind.getResourcePaths(resourceAnnotation);
			result = Lists.newArrayListWithCapacity(paths.length);

			for(String path : paths) {
				result.add(initModelResource(new Path(path), kind));
			}

			List<URI> uris = Lists.newArrayListWithCapacity(result.size());
			for(Resource next : result) {
				uris.add(next.getURI());
			}
			initialResourceURIs = uris;
		} else {
			ResourceSet rset = getResourceSet();
			result = Lists.newArrayList();
			for(URI next : initialResourceURIs) {
				result.add(rset.getResource(next, true));
			}
		}

		return result;
	}

	private Resource initModelResource(IPath resourcePath, ResourceKind kind) {
		String targetResourceName = "model";
		if(isDIModel(resourcePath)) {
			// We will be initializing all three resources, and they have cross-references, so must not change
			// resource name
			targetResourceName = resourcePath.removeFileExtension().lastSegment();
		}

		return initModelResource(targetResourceName, kind, resourcePath.toString());
	}

	protected boolean isDIModel(IPath path) {
		String fileExtension = path.getFileExtension();
		return DiModel.DI_FILE_EXTENSION.equals(fileExtension);
	}

	protected Resource initModelResource(String targetPath, ResourceKind resourceKind, String resourcePath) {
		Resource result;

		ResourceSet resourceSet = getResourceSet();
		final boolean bootstrapResourceSet = resourceSet == null;
		if(bootstrapResourceSet) {
			// Bootstrap the initialization of the test model with a plain resource set
			resourceSet = new ResourceSetImpl();
			resourceSet.getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, true);
			resourceSet.getLoadOptions().put(XMLResource.OPTION_LAX_FEATURE_PROCESSING, true);
		}

		try {
			IPath resourceIPath = new Path(resourcePath);
			if(isDIModel(resourceIPath)) {
				// Try to initialize the triumvirate of files
				resourceIPath = resourceIPath.removeFileExtension();

				// The UML resource must exist for any sane test
				result = doInitModelResource(resourceSet, targetPath, resourceKind, resourceIPath.addFileExtension(UmlModel.UML_FILE_EXTENSION));

				// Both of these are optional
				IPath notationPath = resourceIPath.addFileExtension(NotationModel.NOTATION_FILE_EXTENSION);
				if(resourceKind.exists(testClass, notationPath)) {
					doInitModelResource(resourceSet, targetPath, resourceKind, notationPath);
				}
				IPath diPath = resourceIPath.addFileExtension(DiModel.DI_FILE_EXTENSION);
				if(resourceKind.exists(testClass, diPath)) {
					doInitModelResource(resourceSet, targetPath, resourceKind, diPath);
				}
			} else {
				result = doInitModelResource(resourceSet, targetPath, resourceKind, resourceIPath);
			}

			// Look for any other dependencies (libraries, profiles, etc.) that also need to be copied
			Queue<Resource> dependents = new LinkedList<Resource>();
			Set<Resource> scanned = new HashSet<Resource>();
			dependents.add(result);
			boolean loadedProfiles = false;
			for(Resource dependent = dependents.poll(); dependent != null; dependent = dependents.poll()) {
				if(scanned.add(dependent)) {
					URI baseURI = result.getURI().trimSegments(1);
					if(!baseURI.isPrefix()) {
						baseURI = baseURI.appendSegment("");
					}

					for(EObject proxy : EcoreUtil.UnresolvedProxyCrossReferencer.find(dependent).keySet()) {
						URI dependencyURI = EcoreUtil.getURI(proxy).trimFragment();
						if(dependencyURI.toString().startsWith(baseURI.toString())) {
							Resource dependency = resourceSet.getResource(dependencyURI, false);
							if((dependency == null) || !dependency.isLoaded() || !dependency.getErrors().isEmpty()) {
								// It should be available in the test bundle. Try to get it
								URI relative = dependencyURI.deresolve(baseURI);
								IPath depPath = resourceIPath.removeLastSegments(1).append(URI.decode(relative.toString()));
								if(resourceKind.exists(testClass, depPath)) {
									if(dependency == null) {
										dependency = resourceSet.createResource(dependencyURI);
									} else {
										dependency.unload();
									}

									dependency = doInitModelResource(resourceSet, URI.decode(relative.toString()), resourceKind, depPath);
									loadedProfiles = loadedProfiles || Iterables.any(dependency.getContents(), Predicates.instanceOf(Profile.class));

									// Enqueue this for recursive dependency processing
									dependents.add(dependency);
								}
							}
						}
					}
				}
			}

			// If we depend on profiles, then we may have stereotype applications that need to resolve against that schema.
			// In such case, re-load the model resource to resolve the stereotype schema
			if(loadedProfiles && Iterables.any(result.getContents(), Predicates.instanceOf(AnyType.class))) {
				try {
					result.unload();
					result.load(null);
				} catch (Exception e) {
					e.printStackTrace();
					fail("Error re-loading resource to resolve stereotype schema: " + e.getLocalizedMessage());
				}
			}
		} finally {
			if(bootstrapResourceSet) {
				EMFHelper.unload(resourceSet);
			}
		}

		return result;
	}

	private Resource doInitModelResource(ResourceSet resourceSet, String targetPath, ResourceKind resourceKind, IPath resourceIPath) {
		IPath targetIPath = new Path(targetPath);
		if(!resourceIPath.getFileExtension().equals(targetIPath.getFileExtension())) {
			targetIPath = targetIPath.addFileExtension(resourceIPath.getFileExtension());
		}

		final URI modelURI = project.getURI(targetIPath);
		Resource result = resourceSet.getResource(modelURI, false);

		if(result == null) {
			result = resourceSet.createResource(modelURI);
		}

		if(!result.isLoaded()) {
			if(resourceSet instanceof ModelSet) {
				ModelSet modelSet = (ModelSet)resourceSet;
				if(modelSet.getURIWithoutExtension() == null) {
					modelSet.getInternal().setPrimaryModelResourceURI(modelURI);
				}
			}

			try {
				InputStream input = resourceKind.getResourceURL(testClass, resourceIPath).openStream();
				OutputStream output = resourceSet.getURIConverter().createOutputStream(result.getURI());

				try {
					ByteStreams.copy(input, output);
				} finally {
					input.close();
					output.close();
				}

				result.load(null);
			} catch (Exception e) {
				e.printStackTrace();
				fail("Failed to load test resource: " + e.getLocalizedMessage());
			}
		}

		return result;
	}

	@Override
	protected void finished(Description description) {
		final ResourceSet resourceSet = getResourceSet();

		initialResourceURIs = null;
		model = null;

		if(domain instanceof TransactionalEditingDomain) {
			((TransactionalEditingDomain)domain).dispose();
		}
		domain = null;

		if(resourceSet != null) {
			EMFHelper.unload(resourceSet);
		}
	}

	private Annotation getResourceAnnotation(Description description) {
		Annotation result = null;

		Class<?> testClass = description.getTestClass();

		Method testMethod = null;
		try {
			testMethod = testClass.getDeclaredMethod(description.getMethodName());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Could not access test method via JUnit framework.");
		}

		if(testMethod.isAnnotationPresent(JavaResource.class)) {
			result = testMethod.getAnnotation(JavaResource.class);
		} else if(testMethod.isAnnotationPresent(PluginResource.class)) {
			result = testMethod.getAnnotation(PluginResource.class);
		} else {
			// The class must have an annotation
			if(testClass.isAnnotationPresent(JavaResource.class)) {
				result = testClass.getAnnotation(JavaResource.class);
			} else if(testClass.isAnnotationPresent(PluginResource.class)) {
				result = testClass.getAnnotation(PluginResource.class);
			}
		}

		assertThat("No JavaResource or PluginResource annotation found on test.", result, notNullValue());

		return result;
	}

	public static enum ResourceKind {
		JAVA, BUNDLE;

		static ResourceKind getResourceKind(Annotation resourceAnnotation) {
			return (resourceAnnotation instanceof JavaResource) ? JAVA : (resourceAnnotation instanceof PluginResource) ? BUNDLE : null;
		}

		String[] getResourcePaths(Annotation resourceAnnotation) {
			switch(this) {
			case JAVA:
				return ((JavaResource)resourceAnnotation).value();
			case BUNDLE:
				return ((PluginResource)resourceAnnotation).value();
			}

			fail("Not a resource annotation: " + resourceAnnotation);
			return null; // Not reachable
		}

		boolean exists(Class<?> context, IPath path) {
			return getResourceURL(context, path) != null;
		}

		URL getResourceURL(Class<?> context, IPath path) {
			URL result = null;

			switch(this) {
			case JAVA:
				result = context.getResource(path.toString());
				break;
			case BUNDLE:
				result = getBundleURL(context, path);
				break;
			}

			return result;
		}

		private URL getBundleURL(Class<?> testClass, IPath resourcePath) {
			URL result = null;

			String pattern = resourcePath.lastSegment();
			IPath search;
			if(resourcePath.segmentCount() > 1) {
				search = resourcePath.removeLastSegments(1);
			} else {
				search = Path.ROOT;
			}
			Enumeration<URL> urls = FrameworkUtil.getBundle(testClass).findEntries(search.toPortableString(), pattern, false);
			if((urls != null) && urls.hasMoreElements()) {
				result = urls.nextElement();
			}

			return result;
		}
	}
}
