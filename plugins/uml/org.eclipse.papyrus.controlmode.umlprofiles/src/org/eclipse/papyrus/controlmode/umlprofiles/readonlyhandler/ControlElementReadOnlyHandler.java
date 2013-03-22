/*****************************************************************************
 * Copyright (c) 2013 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Arthur Daussy (Atos) arthur.daussy@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.controlmode.umlprofiles.readonlyhandler;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.papyrus.readonly.IReadOnlyHandler;
import org.eclipse.papyrus.resource.ModelSet;
import org.eclipse.papyrus.resource.uml.UmlModel;
import org.eclipse.papyrus.ui.toolbox.notification.builders.NotificationBuilder;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;


/**
 * Read only handler that will prevent model fragment to be modified it the root element is not a package
 * This restriction is dued to UML2 implementation which delete stereotype applications if the current model can not find the correxpoding profile
 * application
 * 
 * @author adaussy
 * 
 */
public class ControlElementReadOnlyHandler implements IReadOnlyHandler {

	/**
	 * 
	 */
	public ControlElementReadOnlyHandler() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.readonly.IReadOnlyHandler#isReadOnly(org.eclipse.emf.common.util.URI[], org.eclipse.emf.edit.domain.EditingDomain)
	 */
	public boolean isReadOnly(URI[] uris, EditingDomain editingDomain) {
		if(editingDomain == null) {
			return false;
		}
		ResourceSet resourceSet = editingDomain.getResourceSet();
		if(resourceSet instanceof ModelSet) {
			ModelSet modelSet = (ModelSet)resourceSet;
			if(resourceSet != null) {
				for(int i = 0; i < uris.length; i++) {
					URI uri = uris[i];
					Resource resource = resourceSet.getResource(uri, false);
					if(UmlModel.UML_FILE_EXTENSION.equals(uri.fileExtension())) {
						if(resource != null) {
							EList<EObject> contents = resource.getContents();
							if(contents != null && !contents.isEmpty()) {
								//A sub model can only be writable if the root element is package or if the root is contained by another loaded resource
								EObject root = contents.get(0);
								if(root instanceof Package) {
									return false;
								} else if(root instanceof Element) {
									return ((Element)root).getNearestPackage() == null;
								}
							}
						}
					} else {
						Resource umlResource = modelSet.getAssociatedResource(resource, UmlModel.UML_FILE_EXTENSION, false);
						//						Resource umlResource = modelSet.getResource(resource.getURI().trimFileExtension().appendFileExtension(UmlModel.UML_FILE_EXTENSION), false);
						if(umlResource != null) {
							return isReadOnly(new URI[]{ umlResource.getURI() }, editingDomain);
						}
					}
				}
		}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.readonly.IReadOnlyHandler#enableWrite(org.eclipse.emf.common.util.URI[], org.eclipse.emf.edit.domain.EditingDomain)
	 */
	public boolean enableWrite(URI[] uris, EditingDomain editingDomain) {
		//Never authorize write
		NotificationBuilder.createErrorPopup("This model fragment can not be modified independently from the rest of the model").run();
		return false;
	}

}
