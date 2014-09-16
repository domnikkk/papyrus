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
package org.eclipse.papyrus.umldi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.dd.di.DiagramElement;

import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uml Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The most general class for UML diagram interchange.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getUmlModelElement <em>Uml Model Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getSharedUmlStyle <em>Shared Uml Style</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getLocalUmlStyle <em>Local Uml Style</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement <em>Owning Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement <em>Owned Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getTargetUmlEdge <em>Target Uml Edge</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getSourceUmlEdge <em>Source Uml Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getUmlDiagramElement()
 * @model abstract="true"
 * @generated
 */
public interface UmlDiagramElement extends DiagramElement {

	/**
	 * Returns the value of the '<em><b>Uml Model Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Element}.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.dd.di.DiagramElement#getModelElement() <em>Model Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restricts UMLDiagramElements to show UML Elements, rather than other language elements.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Uml Model Element</em>' reference list.
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getUmlDiagramElement_UmlModelElement()
	 * @model
	 * @generated
	 */
	EList<Element> getUmlModelElement();

	/**
	 * Returns the value of the '<em><b>Shared Uml Style</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.dd.di.DiagramElement#getSharedStyle() <em>Shared Style</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restricts shared styles to UMLStyles.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Shared Uml Style</em>' reference.
	 * @see #setSharedUmlStyle(UmlStyle)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getUmlDiagramElement_SharedUmlStyle()
	 * @model ordered="false"
	 * @generated
	 */
	UmlStyle getSharedUmlStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getSharedUmlStyle <em>Shared Uml Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *        the new value of the '<em>Shared Uml Style</em>' reference.
	 * @see #getSharedUmlStyle()
	 * @generated
	 */
	void setSharedUmlStyle(UmlStyle value);

	/**
	 * Returns the value of the '<em><b>Local Uml Style</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.dd.di.DiagramElement#getLocalStyle() <em>Local Style</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restricts owned styles to UMLStyles.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Local Uml Style</em>' containment reference.
	 * @see #setLocalUmlStyle(UmlStyle)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getUmlDiagramElement_LocalUmlStyle()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	UmlStyle getLocalUmlStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getLocalUmlStyle <em>Local Uml Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *        the new value of the '<em>Local Uml Style</em>' containment reference.
	 * @see #getLocalUmlStyle()
	 * @generated
	 */
	void setLocalUmlStyle(UmlStyle value);

	/**
	 * Returns the value of the '<em><b>Owning Uml Diagram Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement
	 * <em>Owned Uml Diagram Element</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.dd.di.DiagramElement#getOwningDiagramElement() <em>Owning Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restricts UMLDiagramElements to be owned by only UMLDiagramElements.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Owning Uml Diagram Element</em>' container reference.
	 * @see #setOwningUmlDiagramElement(UmlDiagramElement)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getUmlDiagramElement_OwningUmlDiagramElement()
	 * @see org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement
	 * @model opposite="ownedUmlDiagramElement" transient="false" ordered="false"
	 * @generated
	 */
	UmlDiagramElement getOwningUmlDiagramElement();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement <em>Owning Uml Diagram Element</em>}'
	 * container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *        the new value of the '<em>Owning Uml Diagram Element</em>' container reference.
	 * @see #getOwningUmlDiagramElement()
	 * @generated
	 */
	void setOwningUmlDiagramElement(UmlDiagramElement value);

	/**
	 * Returns the value of the '<em><b>Owned Uml Diagram Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.umldi.UmlDiagramElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement
	 * <em>Owning Uml Diagram Element</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.dd.di.DiagramElement#getOwnedDiagramElement() <em>Owned Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restricts UMLDiagramElements to own only UMLDiagramElements.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Owned Uml Diagram Element</em>' containment reference list.
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getUmlDiagramElement_OwnedUmlDiagramElement()
	 * @see org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement
	 * @model opposite="owningUmlDiagramElement" containment="true"
	 * @generated
	 */
	EList<UmlDiagramElement> getOwnedUmlDiagramElement();

	/**
	 * Returns the value of the '<em><b>Target Uml Edge</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.umldi.UmlEdge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.UmlEdge#getTargetUmlDiagramElement
	 * <em>Target Uml Diagram Element</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.dd.di.DiagramElement#getTargetEdge() <em>Target Edge</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Uml Edge</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Target Uml Edge</em>' reference list.
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getUmlDiagramElement_TargetUmlEdge()
	 * @see org.eclipse.papyrus.umldi.UmlEdge#getTargetUmlDiagramElement
	 * @model opposite="targetUmlDiagramElement"
	 * @generated
	 */
	EList<UmlEdge> getTargetUmlEdge();

	/**
	 * Returns the value of the '<em><b>Source Uml Edge</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.umldi.UmlEdge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.UmlEdge#getSourceUmlDiagramElement
	 * <em>Source Uml Diagram Element</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.dd.di.DiagramElement#getSourceEdge() <em>Source Edge</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Uml Edge</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Source Uml Edge</em>' reference list.
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getUmlDiagramElement_SourceUmlEdge()
	 * @see org.eclipse.papyrus.umldi.UmlEdge#getSourceUmlDiagramElement
	 * @model opposite="sourceUmlDiagramElement"
	 * @generated
	 */
	EList<UmlEdge> getSourceUmlEdge();
} // UmlDiagramElement
