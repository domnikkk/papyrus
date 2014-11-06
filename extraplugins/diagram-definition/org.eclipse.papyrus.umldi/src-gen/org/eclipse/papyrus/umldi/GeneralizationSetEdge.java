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
 * A representation of the model object '<em><b>Generalization Set Edge</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.GeneralizationSetEdge#getPowerLabel <em>Power Label</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.GeneralizationSetEdge#getModifierLabel <em>Modifier Label</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getGeneralizationSetEdge()
 * @model
 * @generated
 */
public interface GeneralizationSetEdge extends NamedEdge {

	/**
	 * Returns the value of the '<em><b>Power Label</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.PowerLabel#getGeneralizationSetEdge <em>Generalization Set Edge</em>}
	 * '.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Label</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Power Label</em>' containment reference.
	 * @see #setPowerLabel(PowerLabel)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getGeneralizationSetEdge_PowerLabel()
	 * @see org.eclipse.papyrus.umldi.PowerLabel#getGeneralizationSetEdge
	 * @model opposite="generalizationSetEdge" containment="true" ordered="false"
	 * @generated
	 */
	PowerLabel getPowerLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.GeneralizationSetEdge#getPowerLabel <em>Power Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Power Label</em>' containment reference.
	 * @see #getPowerLabel()
	 * @generated
	 */
	void setPowerLabel(PowerLabel value);

	/**
	 * Returns the value of the '<em><b>Modifier Label</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.papyrus.umldi.ModifierLabel#getGeneralizationSetEdge
	 * <em>Generalization Set Edge</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * <ul>
	 * <li>'{@link org.eclipse.papyrus.umldi.UmlDiagramElement#getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}'</li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier Label</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Modifier Label</em>' containment reference.
	 * @see #setModifierLabel(ModifierLabel)
	 * @see org.eclipse.papyrus.umldi.UMLDIPackage#getGeneralizationSetEdge_ModifierLabel()
	 * @see org.eclipse.papyrus.umldi.ModifierLabel#getGeneralizationSetEdge
	 * @model opposite="generalizationSetEdge" containment="true" ordered="false"
	 * @generated
	 */
	ModifierLabel getModifierLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umldi.GeneralizationSetEdge#getModifierLabel <em>Modifier Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *        the new value of the '<em>Modifier Label</em>' containment reference.
	 * @see #getModifierLabel()
	 * @generated
	 */
	void setModifierLabel(ModifierLabel value);
} // GeneralizationSetEdge
