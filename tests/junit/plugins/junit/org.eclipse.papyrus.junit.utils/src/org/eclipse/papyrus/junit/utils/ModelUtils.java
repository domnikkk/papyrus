/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 437052
 *  
 *****************************************************************************/
package org.eclipse.papyrus.junit.utils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.lang.reflect.Field;
import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.resource.IReadOnlyHandler2;
import org.eclipse.papyrus.infra.core.resource.ModelMultiException;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.ReadOnlyAxis;
import org.eclipse.papyrus.infra.core.utils.DiResourceSet;

/**
 * Helper class for manipulating Papyrus ModelSets
 * 
 * @author Camille Letavernier
 * 
 */
public class ModelUtils {

	/**
	 * Loads a ModelSet and associates a TransactionalEditingDomain to it
	 * 
	 * Use {@link #getEditingDomain(ModelSet)} to retrieve the EditingDomain
	 * 
	 * @param uri
	 * @param resolveAll
	 * @return
	 * @throws ModelMultiException
	 */
	public static ModelSet loadModelSet(URI uri, boolean resolveAll) throws ModelMultiException {
		ModelSet modelSet = new DiResourceSet();
		TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(modelSet);

		modelSet.loadModels(uri);

		if(resolveAll) {
			EcoreUtil.resolveAll(modelSet);
		}

		return modelSet;
	}

	public static ModelSet loadModelSet(IPath workspacePath, boolean resolveAll) throws ModelMultiException {
		URI workspaceURI = URI.createPlatformResourceURI(workspacePath.toString(), true);
		return loadModelSet(workspaceURI, resolveAll);
	}

	public static TransactionalEditingDomain getEditingDomain(ModelSet modelSet) {
		return TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(modelSet);
	}

	/**
	 * Attempts to set the specified resource URIs as writable according to the referenced-model handler.
	 * 
	 * @param modelSet
	 *        a model set
	 * @param uri
	 *        referenced-model resource URIs to make writable
	 */
	public static void makeReferencedModelsWritable(ModelSet modelSet, URI... uris) {
		IReadOnlyHandler2 handler = modelSet.getReadOnlyHandler();
		if(handler != null) {
			try {
				// It will have this field if it's a ReadOnlyManager
				Field orderedHandlersByAxisField = handler.getClass().getDeclaredField("orderedHandlersByAxis"); //$NON-NLS-1$
				orderedHandlersByAxisField.setAccessible(true);

				// Find the referenced-model handler and make it non-interactive so that we don't attempt to pop up a user dialog
				@SuppressWarnings("unchecked")
				Map<ReadOnlyAxis, IReadOnlyHandler2[]> orderedHandlersByAxis = (Map<ReadOnlyAxis, IReadOnlyHandler2[]>)orderedHandlersByAxisField.get(handler);
				for(IReadOnlyHandler2 next : orderedHandlersByAxis.get(ReadOnlyAxis.DISCRETION)) {
					// If this handler supports user interaction, try to suppress it
					Duck nextHandler = new Duck(next);
					if(nextHandler.understands("setInteractive", false)) {
						nextHandler.quack("setInteractive", false);
					}

					// And make the resources writable in this handler
					if(next.canMakeWritable(ReadOnlyAxis.discretionAxes(), uris).or(false)) {
						next.makeWritable(ReadOnlyAxis.discretionAxes(), uris);
					}
				}
			} catch (Exception e) {
				// OK, didn't work. Fine.  It's expected for non-ReadOnlyManager
			}

			assertThat("Could not make referenced models writable: " + uris, handler.anyReadOnly(ReadOnlyAxis.discretionAxes(), uris).or(true), is(false));
		}
	}
}
