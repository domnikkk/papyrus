/**
 * Copyright (c) 2014 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.dd.di;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Diagram Element</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> DiagramElement is the abstract super type of all
 * elements in diagrams, including diagrams themselves. When contained in a
 * diagram, diagram elements are laid out relative to the diagram?s origin. <!--
 * end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.di.DiagramElement#getModelElement <em>Model
 * Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.di.DiagramElement#getOwningElement <em>
 * Owning Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.di.DiagramElement#getOwnedElement <em>Owned
 * Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.di.DiagramElement#getLocalStyle <em>Local
 * Style</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.di.DiagramElement#getSharedStyle <em>Shared
 * Style</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.di.DIPackage#getDiagramElement()
 * @model abstract="true"
 * @generated
 */
public interface DiagramElement extends EObject {

	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference. This
	 * feature is a derived union. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc --> a reference to a depicted model element, which
	 * can be any MOF-based element <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Model Element</em>' reference.
	 * @see org.eclipse.papyrus.dd.di.DIPackage#getDiagramElement_ModelElement()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        ordered="false"
	 * @generated
	 */
	EObject getModelElement();

	/**
	 * Returns the value of the '<em><b>Owning Element</b></em>' reference. It
	 * is bidirectional and its opposite is '
	 * {@link org.eclipse.papyrus.dd.di.DiagramElement#getOwnedElement
	 * <em>Owned Element</em>}'. This feature is a derived union. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a
	 * reference to the diagram element that directly owns this diagram element.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Owning Element</em>' reference.
	 * @see org.eclipse.papyrus.dd.di.DIPackage#getDiagramElement_OwningElement()
	 * @see org.eclipse.papyrus.dd.di.DiagramElement#getOwnedElement
	 * @model opposite="ownedElement" transient="true" changeable="false"
	 *        volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	DiagramElement getOwningElement();

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list.
	 * The list contents are of type
	 * {@link org.eclipse.papyrus.dd.di.DiagramElement}. It is bidirectional and
	 * its opposite is '
	 * {@link org.eclipse.papyrus.dd.di.DiagramElement#getOwningElement
	 * <em>Owning Element</em>}'. This feature is a derived union. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a
	 * collection of diagram elements that are directly owned by this diagram
	 * element. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Owned Element</em>' reference list.
	 * @see org.eclipse.papyrus.dd.di.DIPackage#getDiagramElement_OwnedElement()
	 * @see org.eclipse.papyrus.dd.di.DiagramElement#getOwningElement
	 * @model opposite="owningElement" transient="true" changeable="false"
	 *        volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<DiagramElement> getOwnedElement();

	/**
	 * Returns the value of the '<em><b>Local Style</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> a reference to an optional locally-owned style for
	 * this diagram element. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Local Style</em>' containment reference.
	 * @see #setLocalStyle(Style)
	 * @see org.eclipse.papyrus.dd.di.DIPackage#getDiagramElement_LocalStyle()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Style getLocalStyle();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.di.DiagramElement#getLocalStyle
	 * <em>Local Style</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Local Style</em>' containment
	 *            reference.
	 * @see #getLocalStyle()
	 * @generated
	 */
	void setLocalStyle(Style value);

	/**
	 * Returns the value of the '<em><b>Shared Style</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> a
	 * reference to an optional shared style element for this diagram element.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Shared Style</em>' reference.
	 * @see #setSharedStyle(Style)
	 * @see org.eclipse.papyrus.dd.di.DIPackage#getDiagramElement_SharedStyle()
	 * @model ordered="false"
	 * @generated
	 */
	Style getSharedStyle();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.di.DiagramElement#getSharedStyle
	 * <em>Shared Style</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Shared Style</em>' reference.
	 * @see #getSharedStyle()
	 * @generated
	 */
	void setSharedStyle(Style value);

} // DiagramElement
