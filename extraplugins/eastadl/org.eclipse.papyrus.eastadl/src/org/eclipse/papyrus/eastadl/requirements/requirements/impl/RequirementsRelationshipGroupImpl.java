/**
 */
package org.eclipse.papyrus.eastadl.requirements.requirements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.TraceableSpecificationImpl;
import org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage;
import org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationship;
import org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationshipGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsRelationshipGroupImpl#getRequirementsRelationship <em>Requirements Relationship</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsRelationshipGroupImpl#getBase_Class <em>Base Class</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsRelationshipGroupImpl#getBase_Package <em>Base Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementsRelationshipGroupImpl extends TraceableSpecificationImpl implements RequirementsRelationshipGroup {
	/**
	 * The cached value of the '{@link #getRequirementsRelationship() <em>Requirements Relationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getRequirementsRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementsRelationship> requirementsRelationship;

	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getBase_Package() <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_Package()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Package base_Package;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected RequirementsRelationshipGroupImpl() {
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
		return RequirementsPackage.Literals.REQUIREMENTS_RELATIONSHIP_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<RequirementsRelationship> getRequirementsRelationship() {
		if (requirementsRelationship == null) {
			requirementsRelationship = new EObjectResolvingEList<RequirementsRelationship>(RequirementsRelationship.class, this, RequirementsPackage.REQUIREMENTS_RELATIONSHIP_GROUP__REQUIREMENTS_RELATIONSHIP);
		}
		return requirementsRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject) base_Class;
			base_Class = (org.eclipse.uml2.uml.Class) eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.REQUIREMENTS_RELATIONSHIP_GROUP__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENTS_RELATIONSHIP_GROUP__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public org.eclipse.uml2.uml.Package getBase_Package() {
		if (base_Package != null && base_Package.eIsProxy()) {
			InternalEObject oldBase_Package = (InternalEObject) base_Package;
			base_Package = (org.eclipse.uml2.uml.Package) eResolveProxy(oldBase_Package);
			if (base_Package != oldBase_Package) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.REQUIREMENTS_RELATIONSHIP_GROUP__BASE_PACKAGE, oldBase_Package, base_Package));
			}
		}
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetBase_Package() {
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBase_Package(org.eclipse.uml2.uml.Package newBase_Package) {
		org.eclipse.uml2.uml.Package oldBase_Package = base_Package;
		base_Package = newBase_Package;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENTS_RELATIONSHIP_GROUP__BASE_PACKAGE, oldBase_Package, base_Package));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RequirementsPackage.REQUIREMENTS_RELATIONSHIP_GROUP__REQUIREMENTS_RELATIONSHIP:
			return getRequirementsRelationship();
		case RequirementsPackage.REQUIREMENTS_RELATIONSHIP_GROUP__BASE_CLASS:
			if (resolve)
				return getBase_Class();
			return basicGetBase_Class();
		case RequirementsPackage.REQUIREMENTS_RELATIONSHIP_GROUP__BASE_PACKAGE:
			if (resolve)
				return getBase_Package();
			return basicGetBase_Package();
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
		switch (featureID) {
		case RequirementsPackage.REQUIREMENTS_RELATIONSHIP_GROUP__REQUIREMENTS_RELATIONSHIP:
			getRequirementsRelationship().clear();
			getRequirementsRelationship().addAll((Collection<? extends RequirementsRelationship>) newValue);
			return;
		case RequirementsPackage.REQUIREMENTS_RELATIONSHIP_GROUP__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) newValue);
			return;
		case RequirementsPackage.REQUIREMENTS_RELATIONSHIP_GROUP__BASE_PACKAGE:
			setBase_Package((org.eclipse.uml2.uml.Package) newValue);
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
		switch (featureID) {
		case RequirementsPackage.REQUIREMENTS_RELATIONSHIP_GROUP__REQUIREMENTS_RELATIONSHIP:
			getRequirementsRelationship().clear();
			return;
		case RequirementsPackage.REQUIREMENTS_RELATIONSHIP_GROUP__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) null);
			return;
		case RequirementsPackage.REQUIREMENTS_RELATIONSHIP_GROUP__BASE_PACKAGE:
			setBase_Package((org.eclipse.uml2.uml.Package) null);
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
		switch (featureID) {
		case RequirementsPackage.REQUIREMENTS_RELATIONSHIP_GROUP__REQUIREMENTS_RELATIONSHIP:
			return requirementsRelationship != null && !requirementsRelationship.isEmpty();
		case RequirementsPackage.REQUIREMENTS_RELATIONSHIP_GROUP__BASE_CLASS:
			return base_Class != null;
		case RequirementsPackage.REQUIREMENTS_RELATIONSHIP_GROUP__BASE_PACKAGE:
			return base_Package != null;
		}
		return super.eIsSet(featureID);
	}

} // RequirementsRelationshipGroupImpl
