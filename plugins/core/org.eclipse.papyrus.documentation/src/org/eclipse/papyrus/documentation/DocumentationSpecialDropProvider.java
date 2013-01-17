/*****************************************************************************
 * Copyright (c) 2013 Atos
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mathieu Velten (Atos) mathieu.velten@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.documentation;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.papyrus.commands.wrappers.EMFtoGMFCommandWrapper;
import org.eclipse.papyrus.diagram.common.specialdrop.ISpecialDropProvider;

import com.google.common.collect.Lists;


public class DocumentationSpecialDropProvider implements ISpecialDropProvider {

	protected IPath workspacePath = ResourcesPlugin.getWorkspace().getRoot().getLocation();
	protected URI workspaceUri = URI.createFileURI(workspacePath.toOSString() + File.separator);

	public List<ICommand> getDropObjectsCommands(TransactionalEditingDomain editingDomain, EObject obj, List<Object> droppedObjs) {

		List<ICommand> addUriCommands = Lists.newArrayList();

		for (Object o : droppedObjs) {
			URI uri = null;
			if (o instanceof URI) {
				uri = (URI)o;
			} else if (o instanceof IFile) {
				IFile f = (IFile)o;
				uri = getURI(f.getLocation());
			} else if (o instanceof File) {
				File f = (File)o;
				uri = getURI(Path.fromOSString(f.getAbsolutePath()));
			} else if (o instanceof String) {
				IPath path = Path.fromOSString((String)o);
				uri = getURI(path);
			}

			if (uri != null) {
				addUriCommands.add(new EMFtoGMFCommandWrapper(DocumentationManager.getInstance().getAddAssociatedResourceCommand(obj, uri)));
			}
		}

		if (addUriCommands.isEmpty()) {
			return null;
		} else {
			return new ArrayList<ICommand>(Collections.singletonList(new CompositeTransactionalCommand(editingDomain, "Add dropped files to documentation resources", addUriCommands)));
		}
	}

	protected URI getURI(IPath path) {
		URI uri = URI.createFileURI(path.toOSString());
		if (workspacePath.isPrefixOf(path)) {
			URI deresolved = uri.deresolve(workspaceUri);
			uri = URI.createPlatformResourceURI("/" + deresolved.toFileString(), true);
		}
		return uri;
	}

	public List<ICommand> getSetFeatureCommands(TransactionalEditingDomain editingDomain, EObject obj, EStructuralFeature f, List<EObject> values, String featureLabel) {
		return null;
	}
}
