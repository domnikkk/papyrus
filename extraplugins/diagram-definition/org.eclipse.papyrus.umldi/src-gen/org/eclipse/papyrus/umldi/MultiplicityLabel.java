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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Label</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.MultiplicityLabel#getPropertyEdge <em>Property Edge</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.MultiplicityLabel#getAssociationEdge <em>Association Edge</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getMultiplicityLabel()
 * @model
 * @generated
 */
public interface MultiplicityLabel extends UmlLabel {

	/**
	 * Returns the value of the '<em><b>Property Edge</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.PropertyEdge#getMultiplicityLabel <em>Multiplicity Label</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement() <em>Owning Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Edge</em>' container reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Property Edge</em>' container reference.
	 * @see #setPropertyEdge(PropertyEdge)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getMultiplicityLabel_PropertyEdge()
	 * @see org.eclipse.papyrus.umldi.PropertyEdge#getMultiplicityLabel
	 * @model opposite="multiplicityLabel" transient="false" ordered="false"
	 * @generated
	 */
	PropertyEdge getPropertyEdge();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.MultiplicityLabel#getPropertyEdge <em>Property Edge</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Property Edge</em>' container reference.
	 * @see #getPropertyEdge()
	 * @generated
	 */
	void setPropertyEdge(PropertyEdge value);

	/**
	 * Returns the value of the '<em><b>Association Edge</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.AssociationEdge#getEndMultiplicityLabel
	 * <em>End Multiplicity Label</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement() <em>Owning Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Edge</em>' container reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Association Edge</em>' container reference.
	 * @see #setAssociationEdge(AssociationEdge)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getMultiplicityLabel_AssociationEdge()
	 * @see org.eclipse.papyrus.umldi.AssociationEdge#getEndMultiplicityLabel
	 * @model opposite="endMultiplicityLabel" transient="false" ordered="false"
	 * @generated
	 */
	AssociationEdge getAssociationEdge();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.MultiplicityLabel#getAssociationEdge <em>Association Edge</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Association Edge</em>' container reference.
	 * @see #getAssociationEdge()
	 * @generated
	 */
	void setAssociationEdge(AssociationEdge value);
} // MultiplicityLabel
