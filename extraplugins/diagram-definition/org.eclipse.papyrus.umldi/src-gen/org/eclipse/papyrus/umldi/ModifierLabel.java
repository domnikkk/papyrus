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
 * A representation of the model object '<em><b>Modifier Label</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.ModifierLabel#getAssociationEdge <em>Association Edge</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.ModifierLabel#getGeneralizationSetEdge <em>Generalization Set Edge</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.ModifierLabel#getPropertyEdge <em>Property Edge</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getModifierLabel()
 * @model
 * @generated
 */
public interface ModifierLabel extends UmlLabel {

	/**
	 * Returns the value of the '<em><b>Association Edge</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.AssociationEdge#getEndModifierLabel <em>End Modifier Label</em>}'.
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
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getModifierLabel_AssociationEdge()
	 * @see org.eclipse.papyrus.umldi.AssociationEdge#getEndModifierLabel
	 * @model opposite="endModifierLabel" transient="false" ordered="false"
	 * @generated
	 */
	AssociationEdge getAssociationEdge();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.ModifierLabel#getAssociationEdge <em>Association Edge</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Association Edge</em>' container reference.
	 * @see #getAssociationEdge()
	 * @generated
	 */
	void setAssociationEdge(AssociationEdge value);

	/**
	 * Returns the value of the '<em><b>Generalization Set Edge</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.GeneralizationSetEdge#getModifierLabel <em>Modifier Label</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwningUmlDiagramElement() <em>Owning Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization Set Edge</em>' container reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Generalization Set Edge</em>' container reference.
	 * @see #setGeneralizationSetEdge(GeneralizationSetEdge)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getModifierLabel_GeneralizationSetEdge()
	 * @see org.eclipse.papyrus.umldi.GeneralizationSetEdge#getModifierLabel
	 * @model opposite="modifierLabel" transient="false" ordered="false"
	 * @generated
	 */
	GeneralizationSetEdge getGeneralizationSetEdge();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.ModifierLabel#getGeneralizationSetEdge <em>Generalization Set Edge</em>}' container
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Generalization Set Edge</em>' container reference.
	 * @see #getGeneralizationSetEdge()
	 * @generated
	 */
	void setGeneralizationSetEdge(GeneralizationSetEdge value);

	/**
	 * Returns the value of the '<em><b>Property Edge</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.PropertyEdge#getModifierLabel <em>Modifier Label</em>}'.
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
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getModifierLabel_PropertyEdge()
	 * @see org.eclipse.papyrus.umldi.PropertyEdge#getModifierLabel
	 * @model opposite="modifierLabel" transient="false" ordered="false"
	 * @generated
	 */
	PropertyEdge getPropertyEdge();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.ModifierLabel#getPropertyEdge <em>Property Edge</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Property Edge</em>' container reference.
	 * @see #getPropertyEdge()
	 * @generated
	 */
	void setPropertyEdge(PropertyEdge value);
} // ModifierLabel
