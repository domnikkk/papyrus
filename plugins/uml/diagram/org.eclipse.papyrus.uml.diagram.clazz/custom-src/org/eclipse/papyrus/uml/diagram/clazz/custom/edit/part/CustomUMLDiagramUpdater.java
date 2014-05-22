/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.clazz.custom.edit.part;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.AssociationEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.clazz.part.UMLLinkDescriptor;
import org.eclipse.papyrus.uml.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Type;


public class CustomUMLDiagramUpdater extends UMLDiagramUpdater {
	
	public static final CustomUMLDiagramUpdater INSTANCE = new CustomUMLDiagramUpdater();
	
	private CustomUMLDiagramUpdater(){
		//to prevent instantiation
		super();
	}
	
	@Override
	protected Collection<UMLLinkDescriptor> getContainedTypeModelFacetLinks_Association_4001(Package container) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for(Iterator<?> links = container.getPackagedElements().iterator(); links.hasNext();) {
			EObject linkObject = (EObject)links.next();
			if(false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association)linkObject;
			if(AssociationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List<?> targets = link.getEndTypes();
			Object theTarget = targets.size() >= 2 ? targets.get(1) : null;
			if(false == theTarget instanceof Type) {
				continue;
			}
			Type dst = (Type)theTarget;
			List<?> sources = link.getEndTypes();
			Object theSource = sources.size() >=2 ? sources.get(0) : null;
			if(false == theSource instanceof Type) {
				continue;
			}
			Type src = (Type)theSource;
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Association_4001, AssociationEditPart.VISUAL_ID));
		}
		return result;
	}
}
