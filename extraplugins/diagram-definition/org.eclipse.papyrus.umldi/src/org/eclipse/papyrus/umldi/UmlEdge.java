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

import org.eclipse.papyrus.dd.di.Edge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uml Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The most general class for UML diagram elements that are rendered as lines.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.UmlEdge#getSourceUmlDiagramElement <em>Source Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.UmlEdge#getTargetUmlDiagramElement <em>Target Uml Diagram Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getUmlEdge()
 * @model
 * @generated
 */
public interface UmlEdge extends UmlDiagramElement, Edge {

	/**
	 * Returns the value of the '<em><b>Source Uml Diagram Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getSourceUmlEdge <em>Source Uml Edge</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.dd.di.Edge#getSourceDiagramElement() <em>Source Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restricts the sources of UMLEdges to UMLDiagramElements.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Source Uml Diagram Element</em>' reference.
	 * @see #setSourceUmlDiagramElement(UmlDiagramElement)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getUmlEdge_SourceUmlDiagramElement()
	 * @see org.eclipse.papyrus.umldi.UmlDiagramElement#getSourceUmlEdge
	 * @model opposite="sourceUmlEdge" required="true" ordered="false"
	 * @generated
	 */
	UmlDiagramElement getSourceUmlDiagramElement();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.UmlEdge#getSourceUmlDiagramElement <em>Source Uml Diagram Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Source Uml Diagram Element</em>' reference.
	 * @see #getSourceUmlDiagramElement()
	 * @generated
	 */
	void setSourceUmlDiagramElement(UmlDiagramElement value);

	/**
	 * Returns the value of the '<em><b>Target Uml Diagram Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getTargetUmlEdge <em>Target Uml Edge</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.dd.di.Edge#getTargetDiagramElement() <em>Target Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restricts the targets of UMLEdges to UMLDiagramElements.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Target Uml Diagram Element</em>' reference.
	 * @see #setTargetUmlDiagramElement(UmlDiagramElement)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getUmlEdge_TargetUmlDiagramElement()
	 * @see org.eclipse.papyrus.umldi.UmlDiagramElement#getTargetUmlEdge
	 * @model opposite="targetUmlEdge" required="true" ordered="false"
	 * @generated
	 */
	UmlDiagramElement getTargetUmlDiagramElement();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.UmlEdge#getTargetUmlDiagramElement <em>Target Uml Diagram Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Target Uml Diagram Element</em>' reference.
	 * @see #getTargetUmlDiagramElement()
	 * @generated
	 */
	void setTargetUmlDiagramElement(UmlDiagramElement value);
} // UmlEdge
