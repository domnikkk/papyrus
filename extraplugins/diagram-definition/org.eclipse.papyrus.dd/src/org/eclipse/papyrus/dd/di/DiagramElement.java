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
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Diagram Element</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DiagramElement is the abstract super type of all elements in diagrams, including diagrams themselves. When contained in a diagram, diagram elements
 * are laid out relative to the diagram?s origin.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.di.DiagramElement#getModelElement <em>Model Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.di.DiagramElement#getOwningDiagramElement <em>Owning Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.di.DiagramElement#getOwnedDiagramElement <em>Owned Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.di.DiagramElement#getLocalStyle <em>Local Style</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.di.DiagramElement#getSharedStyle <em>Shared Style</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.di.DiagramElement#getTargetEdge <em>Target Edge</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.di.DiagramElement#getSourceEdge <em>Source Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.dd.di.DIPackage#getDiagramElement()
 * @model abstract="true"
 * @generated
 */
public interface DiagramElement extends EObject {

	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * This feature is a derived union.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a reference to a depicted model element, which can be any MOF-based element
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Model Element</em>' reference list.
	 * @see org.eclipse.papyrus.dd.di.DIPackage#getDiagramElement_ModelElement()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EObject> getModelElement();

	/**
	 * Returns the value of the '<em><b>Owning Diagram Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.dd.di.DiagramElement#getOwnedDiagramElement <em>Owned Diagram Element</em>} '.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a reference to the diagram element that directly owns this diagram element.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Owning Diagram Element</em>' reference.
	 * @see org.eclipse.papyrus.dd.di.DIPackage#getDiagramElement_OwningDiagramElement()
	 * @see org.eclipse.papyrus.dd.di.DiagramElement#getOwnedDiagramElement
	 * @model opposite="ownedDiagramElement" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	DiagramElement getOwningDiagramElement();

	/**
	 * Returns the value of the '<em><b>Owned Diagram Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.dd.di.DiagramElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.dd.di.DiagramElement#getOwningDiagramElement
	 * <em>Owning Diagram Element</em>}'.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a collection of diagram elements that are directly owned by this diagram element.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Owned Diagram Element</em>' reference list.
	 * @see org.eclipse.papyrus.dd.di.DIPackage#getDiagramElement_OwnedDiagramElement()
	 * @see org.eclipse.papyrus.dd.di.DiagramElement#getOwningDiagramElement
	 * @model opposite="owningDiagramElement" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<DiagramElement> getOwnedDiagramElement();

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
	 * Returns the value of the '<em><b>Target Edge</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.dd.di.Edge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.dd.di.Edge#getTargetDiagramElement <em>Target Diagram Element</em>}'.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a collection of edges that reference this diagram element as a target.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Target Edge</em>' reference list.
	 * @see org.eclipse.papyrus.dd.di.DIPackage#getDiagramElement_TargetEdge()
	 * @see org.eclipse.papyrus.dd.di.Edge#getTargetDiagramElement
	 * @model opposite="targetDiagramElement" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Edge> getTargetEdge();

	/**
	 * Returns the value of the '<em><b>Source Edge</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.dd.di.Edge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.dd.di.Edge#getSourceDiagramElement <em>Source Diagram Element</em>}'.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a collection of edges that reference this diagram element as a source.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Source Edge</em>' reference list.
	 * @see org.eclipse.papyrus.dd.di.DIPackage#getDiagramElement_SourceEdge()
	 * @see org.eclipse.papyrus.dd.di.Edge#getSourceDiagramElement
	 * @model opposite="sourceDiagramElement" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Edge> getSourceEdge();
} // DiagramElement
