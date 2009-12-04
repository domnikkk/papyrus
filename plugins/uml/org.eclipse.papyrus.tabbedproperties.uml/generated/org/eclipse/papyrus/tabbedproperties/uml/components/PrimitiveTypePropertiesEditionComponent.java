/*******************************************************************************
 * Copyright (c) 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.papyrus.tabbedproperties.uml.components;

// Start of user code for imports

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.papyrus.tabbedproperties.uml.parts.PrimitiveTypePropertiesEditionPart;
import org.eclipse.papyrus.tabbedproperties.uml.parts.UMLViewsRepository;
import org.eclipse.uml2.uml.PrimitiveType;

// End of user code

/**
 * @author <a href="mailto:jerome.benois@obeo.fr">Jerome Benois</a>
 */
public class PrimitiveTypePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Base part
	 */
	private PrimitiveTypePropertiesEditionPart basePart;

	/**
	 * The PrimitiveTypeBasePropertiesEditionComponent sub component
	 */
	protected PrimitiveTypeBasePropertiesEditionComponent primitiveTypeBasePropertiesEditionComponent;

	/**
	 * The ElementPropertiesEditionComponent sub component
	 */
	protected ElementPropertiesEditionComponent elementPropertiesEditionComponent;

	/**
	 * Parameterized constructor
	 * 
	 * @param primitiveType
	 *        the EObject to edit
	 */
	public PrimitiveTypePropertiesEditionComponent(EObject primitiveType, String editing_mode) {
		super(editing_mode);
		if(primitiveType instanceof PrimitiveType) {
			primitiveTypeBasePropertiesEditionComponent = new PrimitiveTypeBasePropertiesEditionComponent(primitiveType, editing_mode);
			addSubComponent(primitiveTypeBasePropertiesEditionComponent);
			elementPropertiesEditionComponent = new ElementPropertiesEditionComponent(primitiveType, editing_mode);
			addSubComponent(elementPropertiesEditionComponent);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent# getPropertiesEditionPart(int, java.lang.String)
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if("Base".equals(key)) {
			basePart = (PrimitiveTypePropertiesEditionPart)primitiveTypeBasePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)basePart;
		}
		return super.getPropertiesEditionPart(kind, key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent# setPropertiesEditionPart(java.lang.Class, int,
	 *      org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart)
	 */
	public void setPropertiesEditionPart(java.lang.Class key, int kind, IPropertiesEditionPart propertiesEditionPart) {
		if(UMLViewsRepository.PrimitiveType.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			basePart = (PrimitiveTypePropertiesEditionPart)propertiesEditionPart;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent #initPart(java.lang.Class, int,
	 *      org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	public void initPart(java.lang.Class key, int kind, EObject element, ResourceSet allResource) {
		if(key == UMLViewsRepository.PrimitiveType.class) {
			super.initPart(key, kind, element, allResource);
		}
		if(key == UMLViewsRepository.Comments.class) {
			super.initPart(key, kind, element, allResource);

		}
	}
}
