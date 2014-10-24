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

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.umldi.AssociationEdge;
import org.eclipse.papyrus.umldi.ModifierLabel;
import org.eclipse.papyrus.umldi.MultiplicityLabel;
import org.eclipse.papyrus.umldi.RoleLabel;
import org.eclipse.papyrus.umldi.UMLDIPackage;
import org.eclipse.papyrus.umldi.UmlDiagramElement;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.umldi.impl.AssociationEdgeImpl#getOwnedUmlDiagramElement <em>Owned Uml Diagram Element</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.AssociationEdgeImpl#getEndMultiplicityLabel <em>End Multiplicity Label</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.AssociationEdgeImpl#getEndModifierLabel <em>End Modifier Label</em>}</li>
 * <li>{@link org.eclipse.papyrus.umldi.impl.AssociationEdgeImpl#getEndRoleLabel <em>End Role Label</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AssociationEdgeImpl extends NamedEdgeImpl implements AssociationEdge {

	/**
	 * The cached value of the '{@link #getEndMultiplicityLabel() <em>End Multiplicity Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEndMultiplicityLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<MultiplicityLabel> endMultiplicityLabel;

	/**
	 * The cached value of the '{@link #getEndModifierLabel() <em>End Modifier Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEndModifierLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifierLabel> endModifierLabel;

	/**
	 * The cached value of the '{@link #getEndRoleLabel() <em>End Role Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEndRoleLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleLabel> endRoleLabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AssociationEdgeImpl() {
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
		return UMLDIPackage.Literals.ASSOCIATION_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<UmlDiagramElement> getOwnedUmlDiagramElement() {
		return new DerivedUnionEObjectEList<UmlDiagramElement>(UmlDiagramElement.class, this, UMLDIPackage.ASSOCIATION_EDGE__OWNED_UML_DIAGRAM_ELEMENT, OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS);
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
	protected static final int[] OWNED_UML_DIAGRAM_ELEMENT_ESUBSETS = new int[]{ UMLDIPackage.ASSOCIATION_EDGE__NAME_LABEL, UMLDIPackage.ASSOCIATION_EDGE__END_MULTIPLICITY_LABEL, UMLDIPackage.ASSOCIATION_EDGE__END_MODIFIER_LABEL, UMLDIPackage.ASSOCIATION_EDGE__END_ROLE_LABEL };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<MultiplicityLabel> getEndMultiplicityLabel() {
		if(endMultiplicityLabel == null) {
			endMultiplicityLabel = new EObjectContainmentWithInverseEList<MultiplicityLabel>(MultiplicityLabel.class, this, UMLDIPackage.ASSOCIATION_EDGE__END_MULTIPLICITY_LABEL, UMLDIPackage.MULTIPLICITY_LABEL__ASSOCIATION_EDGE);
		}
		return endMultiplicityLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ModifierLabel> getEndModifierLabel() {
		if(endModifierLabel == null) {
			endModifierLabel = new EObjectContainmentWithInverseEList<ModifierLabel>(ModifierLabel.class, this, UMLDIPackage.ASSOCIATION_EDGE__END_MODIFIER_LABEL, UMLDIPackage.MODIFIER_LABEL__ASSOCIATION_EDGE);
		}
		return endModifierLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<RoleLabel> getEndRoleLabel() {
		if(endRoleLabel == null) {
			endRoleLabel = new EObjectContainmentWithInverseEList<RoleLabel>(RoleLabel.class, this, UMLDIPackage.ASSOCIATION_EDGE__END_ROLE_LABEL, UMLDIPackage.ROLE_LABEL__ASSOCIATION_EDGE);
		}
		return endRoleLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
		case UMLDIPackage.ASSOCIATION_EDGE__END_MULTIPLICITY_LABEL:
			return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndMultiplicityLabel()).basicAdd(otherEnd, msgs);
		case UMLDIPackage.ASSOCIATION_EDGE__END_MODIFIER_LABEL:
			return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndModifierLabel()).basicAdd(otherEnd, msgs);
		case UMLDIPackage.ASSOCIATION_EDGE__END_ROLE_LABEL:
			return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndRoleLabel()).basicAdd(otherEnd, msgs);
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
		case UMLDIPackage.ASSOCIATION_EDGE__END_MULTIPLICITY_LABEL:
			return ((InternalEList<?>)getEndMultiplicityLabel()).basicRemove(otherEnd, msgs);
		case UMLDIPackage.ASSOCIATION_EDGE__END_MODIFIER_LABEL:
			return ((InternalEList<?>)getEndModifierLabel()).basicRemove(otherEnd, msgs);
		case UMLDIPackage.ASSOCIATION_EDGE__END_ROLE_LABEL:
			return ((InternalEList<?>)getEndRoleLabel()).basicRemove(otherEnd, msgs);
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
		case UMLDIPackage.ASSOCIATION_EDGE__END_MULTIPLICITY_LABEL:
			return getEndMultiplicityLabel();
		case UMLDIPackage.ASSOCIATION_EDGE__END_MODIFIER_LABEL:
			return getEndModifierLabel();
		case UMLDIPackage.ASSOCIATION_EDGE__END_ROLE_LABEL:
			return getEndRoleLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
		case UMLDIPackage.ASSOCIATION_EDGE__END_MULTIPLICITY_LABEL:
			getEndMultiplicityLabel().clear();
			getEndMultiplicityLabel().addAll((Collection<? extends MultiplicityLabel>)newValue);
			return;
		case UMLDIPackage.ASSOCIATION_EDGE__END_MODIFIER_LABEL:
			getEndModifierLabel().clear();
			getEndModifierLabel().addAll((Collection<? extends ModifierLabel>)newValue);
			return;
		case UMLDIPackage.ASSOCIATION_EDGE__END_ROLE_LABEL:
			getEndRoleLabel().clear();
			getEndRoleLabel().addAll((Collection<? extends RoleLabel>)newValue);
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
		case UMLDIPackage.ASSOCIATION_EDGE__END_MULTIPLICITY_LABEL:
			getEndMultiplicityLabel().clear();
			return;
		case UMLDIPackage.ASSOCIATION_EDGE__END_MODIFIER_LABEL:
			getEndModifierLabel().clear();
			return;
		case UMLDIPackage.ASSOCIATION_EDGE__END_ROLE_LABEL:
			getEndRoleLabel().clear();
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
		case UMLDIPackage.ASSOCIATION_EDGE__OWNED_UML_DIAGRAM_ELEMENT:
			return isSetOwnedUmlDiagramElement();
		case UMLDIPackage.ASSOCIATION_EDGE__END_MULTIPLICITY_LABEL:
			return endMultiplicityLabel != null && !endMultiplicityLabel.isEmpty();
		case UMLDIPackage.ASSOCIATION_EDGE__END_MODIFIER_LABEL:
			return endModifierLabel != null && !endModifierLabel.isEmpty();
		case UMLDIPackage.ASSOCIATION_EDGE__END_ROLE_LABEL:
			return endRoleLabel != null && !endRoleLabel.isEmpty();
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
		return super.isSetOwnedUmlDiagramElement() || eIsSet(UMLDIPackage.ASSOCIATION_EDGE__END_MULTIPLICITY_LABEL) || eIsSet(UMLDIPackage.ASSOCIATION_EDGE__END_MODIFIER_LABEL) || eIsSet(UMLDIPackage.ASSOCIATION_EDGE__END_ROLE_LABEL);
	}
} //AssociationEdgeImpl
