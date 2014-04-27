/**
 */
package org.eclipse.papyrus.eastadl.requirements.requirements.impl;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.TraceableSpecificationImpl;
import org.eclipse.papyrus.eastadl.requirements.requirements.Requirement;
import org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsHierarchy;
import org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsHierarchyImpl#getChildHierarchy <em>Child Hierarchy</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsHierarchyImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsHierarchyImpl#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsHierarchyImpl#getContainedRequirement <em>Contained Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementsHierarchyImpl extends TraceableSpecificationImpl implements RequirementsHierarchy {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getBase_Package() <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Package()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Package base_Package;

	/**
	 * The cached value of the '{@link #getContainedRequirement() <em>Contained Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedRequirement()
	 * @generated
	 * @ordered
	 */
	protected Requirement containedRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsHierarchyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.REQUIREMENTS_HIERARCHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<RequirementsHierarchy> getChildHierarchy() {
		EList<RequirementsHierarchy> results = new BasicEList<RequirementsHierarchy>();
		RequirementsHierarchy adlRequirementsHierarchy = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();
			
			while (it.hasNext()) {
				Element element = it.next();
				adlRequirementsHierarchy = (RequirementsHierarchy )UMLUtil.getStereotypeApplication(element, RequirementsHierarchy.class);
				if (adlRequirementsHierarchy != null)
					results.add(adlRequirementsHierarchy);
			}
		}
		
		return new BasicInternalEList<RequirementsHierarchy>(RequirementsHierarchy.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.REQUIREMENTS_HIERARCHY__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENTS_HIERARCHY__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getBase_Package() {
		if (base_Package != null && base_Package.eIsProxy()) {
			InternalEObject oldBase_Package = (InternalEObject)base_Package;
			base_Package = (org.eclipse.uml2.uml.Package)eResolveProxy(oldBase_Package);
			if (base_Package != oldBase_Package) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.REQUIREMENTS_HIERARCHY__BASE_PACKAGE, oldBase_Package, base_Package));
			}
		}
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetBase_Package() {
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Package(org.eclipse.uml2.uml.Package newBase_Package) {
		org.eclipse.uml2.uml.Package oldBase_Package = base_Package;
		base_Package = newBase_Package;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENTS_HIERARCHY__BASE_PACKAGE, oldBase_Package, base_Package));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getContainedRequirement() {
		if (containedRequirement != null && containedRequirement.eIsProxy()) {
			InternalEObject oldContainedRequirement = (InternalEObject)containedRequirement;
			containedRequirement = (Requirement)eResolveProxy(oldContainedRequirement);
			if (containedRequirement != oldContainedRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.REQUIREMENTS_HIERARCHY__CONTAINED_REQUIREMENT, oldContainedRequirement, containedRequirement));
			}
		}
		return containedRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetContainedRequirement() {
		return containedRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedRequirement(Requirement newContainedRequirement) {
		Requirement oldContainedRequirement = containedRequirement;
		containedRequirement = newContainedRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENTS_HIERARCHY__CONTAINED_REQUIREMENT, oldContainedRequirement, containedRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENTS_HIERARCHY__CHILD_HIERARCHY:
				return getChildHierarchy();
			case RequirementsPackage.REQUIREMENTS_HIERARCHY__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case RequirementsPackage.REQUIREMENTS_HIERARCHY__BASE_PACKAGE:
				if (resolve) return getBase_Package();
				return basicGetBase_Package();
			case RequirementsPackage.REQUIREMENTS_HIERARCHY__CONTAINED_REQUIREMENT:
				if (resolve) return getContainedRequirement();
				return basicGetContainedRequirement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENTS_HIERARCHY__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case RequirementsPackage.REQUIREMENTS_HIERARCHY__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)newValue);
				return;
			case RequirementsPackage.REQUIREMENTS_HIERARCHY__CONTAINED_REQUIREMENT:
				setContainedRequirement((Requirement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENTS_HIERARCHY__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case RequirementsPackage.REQUIREMENTS_HIERARCHY__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)null);
				return;
			case RequirementsPackage.REQUIREMENTS_HIERARCHY__CONTAINED_REQUIREMENT:
				setContainedRequirement((Requirement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENTS_HIERARCHY__CHILD_HIERARCHY:
				return !getChildHierarchy().isEmpty();
			case RequirementsPackage.REQUIREMENTS_HIERARCHY__BASE_CLASS:
				return base_Class != null;
			case RequirementsPackage.REQUIREMENTS_HIERARCHY__BASE_PACKAGE:
				return base_Package != null;
			case RequirementsPackage.REQUIREMENTS_HIERARCHY__CONTAINED_REQUIREMENT:
				return containedRequirement != null;
		}
		return super.eIsSet(featureID);
	}

} //RequirementsHierarchyImpl
