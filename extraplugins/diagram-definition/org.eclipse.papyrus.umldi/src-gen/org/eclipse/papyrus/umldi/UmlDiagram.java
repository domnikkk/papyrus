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
import org.eclipse.papyrus.dd.di.Diagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uml Diagram</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * The most general class for UML diagrams.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.UmlDiagram#getTopUmlDiagramElement <em>Top Uml Diagram Element</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getUmlDiagram()
 * @model abstract="true"
 * @generated
 */
public interface UmlDiagram extends UmlDiagramElement, Diagram {

	/**
	 * Returns the value of the '<em><b>Top Uml Diagram Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.umldi.TopUmlDiagramElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.TopUmlDiagramElement#getUmlDiagram <em>Uml Diagram</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Uml Diagram Element</em>' containment reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Top Uml Diagram Element</em>' containment reference list.
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getUmlDiagram_TopUmlDiagramElement()
	 * @see org.eclipse.papyrus.umldi.TopUmlDiagramElement#getUmlDiagram
	 * @model opposite="umlDiagram" containment="true" ordered="false"
	 * @generated
	 */
	EList<TopUmlDiagramElement> getTopUmlDiagramElement();
} // UmlDiagram
