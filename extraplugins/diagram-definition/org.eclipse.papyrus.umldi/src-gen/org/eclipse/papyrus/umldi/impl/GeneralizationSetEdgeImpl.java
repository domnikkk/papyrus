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
package org.eclipse.papyrus.umldi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.umldi.GeneralizationSetEdge;
import org.eclipse.papyrus.umldi.ModifierLabel;
import org.eclipse.papyrus.umldi.PowerLabel;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization Set Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.GeneralizationSetEdgeImpl#getOwnedUmlDiagramElement <em>Owned Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.GeneralizationSetEdgeImpl#getPowerLabel <em>Power Label</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.GeneralizationSetEdgeImpl#getModifierLabel <em>Modifier Label</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class GeneralizationSetEdgeImpl extends NamedEdgeImpl implements GeneralizationSetEdge {

	/**
	 * The cached value of the '{@link #getPowerLabel() <em>Power Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPowerLabel()
	 * @generated
	 * @ordered
	 */
	protected PowerLabel powerLabel;

	/**
	 * The cached value of the '{@link #getModifierLabel() <em>Modifier Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getModifierLabel()
	 * @generated
	 * @ordered
	 */
	protected ModifierLabel modifierLabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GeneralizationSetEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLDIPackage.Literals.GENERALIZATION_SET_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<UmlDiagramElement> getOwnedUmlDiagramElement() {
		return new DerivedUnionEObjectEList<UmlDiagramElement>(UmlDiagramElement.class, this, UMLDIPackage.GENERALIZATION_SET_EDGE__OWNED_UML_DIAGRAM_ELEMENT, OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedUmlDiagramElement() <em>Owned Uml Diagram Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOwnedUmlDiagramElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS = new int[]{ UMLDIPackage.GENERALIZATION_SET_EDGE__NAME_LABEL, UMLDIPackage.GENERALIZATION_SET_EDGE__POWER_LABEL, UMLDIPackage.GENERALIZATION_SET_EDGE__MODIFIER_LABEL };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PowerLabel getPowerLabel() {
		return powerLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPowerLabel(PowerLabel newPowerLabel, NotificationChain msgs) {
		PowerLabel oldPowerLabel = powerLabel;
		powerLabel = newPowerLabel;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLDIPackage.GENERALIZATION_SET_EDGE__POWER_LABEL, oldPowerLabel, newPowerLabel);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPowerLabel(PowerLabel newPowerLabel) {
		if(newPowerLabel != powerLabel) {
			NotificationChain msgs = null;
			if(powerLabel != null)
				msgs = ((InternalEObject)powerLabel).eInverseRemove(this, UMLDIPackage.POWER_LABEL__GENERALIZATION_SET_EDGE, PowerLabel.class, msgs);
			if(newPowerLabel != null)
				msgs = ((InternalEObject)newPowerLabel).eInverseAdd(this, UMLDIPackage.POWER_LABEL__GENERALIZATION_SET_EDGE, PowerLabel.class, msgs);
			msgs = basicSetPowerLabel(newPowerLabel, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.GENERALIZATION_SET_EDGE__POWER_LABEL, newPowerLabel, newPowerLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModifierLabel getModifierLabel() {
		return modifierLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetModifierLabel(ModifierLabel newModifierLabel, NotificationChain msgs) {
		ModifierLabel oldModifierLabel = modifierLabel;
		modifierLabel = newModifierLabel;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLDIPackage.GENERALIZATION_SET_EDGE__MODIFIER_LABEL, oldModifierLabel, newModifierLabel);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setModifierLabel(ModifierLabel newModifierLabel) {
		if(newModifierLabel != modifierLabel) {
			NotificationChain msgs = null;
			if(modifierLabel != null)
				msgs = ((InternalEObject)modifierLabel).eInverseRemove(this, UMLDIPackage.MODIFIER_LABEL__GENERALIZATION_SET_EDGE, ModifierLabel.class, msgs);
			if(newModifierLabel != null)
				msgs = ((InternalEObject)newModifierLabel).eInverseAdd(this, UMLDIPackage.MODIFIER_LABEL__GENERALIZATION_SET_EDGE, ModifierLabel.class, msgs);
			msgs = basicSetModifierLabel(newModifierLabel, msgs);
			if(msgs != null)
				msgs.dispatch();
		} else if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDIPackage.GENERALIZATION_SET_EDGE__MODIFIER_LABEL, newModifierLabel, newModifierLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
		case UMLDIPackage.GENERALIZATION_SET_EDGE__POWER_LABEL:
			if(powerLabel != null)
				msgs = ((InternalEObject)powerLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLDIPackage.GENERALIZATION_SET_EDGE__POWER_LABEL, null, msgs);
			return basicSetPowerLabel((PowerLabel)otherEnd, msgs);
		case UMLDIPackage.GENERALIZATION_SET_EDGE__MODIFIER_LABEL:
			if(modifierLabel != null)
				msgs = ((InternalEObject)modifierLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLDIPackage.GENERALIZATION_SET_EDGE__MODIFIER_LABEL, null, msgs);
			return basicSetModifierLabel((ModifierLabel)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
		case UMLDIPackage.GENERALIZATION_SET_EDGE__POWER_LABEL:
			return basicSetPowerLabel(null, msgs);
		case UMLDIPackage.GENERALIZATION_SET_EDGE__MODIFIER_LABEL:
			return basicSetModifierLabel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
		case UMLDIPackage.GENERALIZATION_SET_EDGE__POWER_LABEL:
			return getPowerLabel();
		case UMLDIPackage.GENERALIZATION_SET_EDGE__MODIFIER_LABEL:
			return getModifierLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
		case UMLDIPackage.GENERALIZATION_SET_EDGE__POWER_LABEL:
			setPowerLabel((PowerLabel)newValue);
			return;
		case UMLDIPackage.GENERALIZATION_SET_EDGE__MODIFIER_LABEL:
			setModifierLabel((ModifierLabel)newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
		case UMLDIPackage.GENERALIZATION_SET_EDGE__POWER_LABEL:
			setPowerLabel((PowerLabel)null);
			return;
		case UMLDIPackage.GENERALIZATION_SET_EDGE__MODIFIER_LABEL:
			setModifierLabel((ModifierLabel)null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
		case UMLDIPackage.GENERALIZATION_SET_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			return isSetOwnedUmlDiagramElement();
		case UMLDIPackage.GENERALIZATION_SET_EDGE__POWER_LABEL:
			return powerLabel != null;
		case UMLDIPackage.GENERALIZATION_SET_EDGE__MODIFIER_LABEL:
			return modifierLabel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetOwnedUmlDiagramElement() {
		return super.isSetOwnedUmlDiagramElement() || eIsSet(UMLDIPackage.GENERALIZATION_SET_EDGE__POWER_LABEL) || eIsSet(UMLDIPackage.GENERALIZATION_SET_EDGE__MODIFIER_LABEL);
	}
} //GeneralizationSetEdgeImpl
