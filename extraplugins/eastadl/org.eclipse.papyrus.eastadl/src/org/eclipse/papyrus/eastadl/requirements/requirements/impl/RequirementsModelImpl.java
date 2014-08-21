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
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ContextImpl;
import org.eclipse.papyrus.eastadl.requirements.requirements.OperationalSituation;
import org.eclipse.papyrus.eastadl.requirements.requirements.Requirement;
import org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsHierarchy;
import org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsModel;
import org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage;
import org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsRelationshipGroup;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsModelImpl#getUseCase <em>Use Case</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsModelImpl#getRequirementsHierachy <em>Requirements Hierachy</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsModelImpl#getOperationalSituation <em>Operational Situation</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsModelImpl#getBase_Package <em>Base Package</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsModelImpl#getRequirementsRelationshipGroup <em>Requirements Relationship Group</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsModelImpl#getRequirement <em>Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementsModelImpl extends ContextImpl implements RequirementsModel {
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
	protected RequirementsModelImpl() {
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
		return RequirementsPackage.Literals.REQUIREMENTS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<UseCase> getUseCase() {
		EList<UseCase> results = new BasicEList<UseCase>();
		UseCase useCase = null;

		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element current = it.next();
				useCase = UMLUtil.getStereotypeApplication(current, UseCase.class);

				if (useCase != null) {
					results.add(useCase);
				}
			}
		}
		// Convert to InternalEList<?>
		return new BasicInternalEList<UseCase>(UseCase.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<RequirementsHierarchy> getRequirementsHierachy() {
		EList<RequirementsHierarchy> results = new BasicEList<RequirementsHierarchy>();
		RequirementsHierarchy requirementsHierarchy = null;

		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element current = it.next();
				requirementsHierarchy = UMLUtil.getStereotypeApplication(current, RequirementsHierarchy.class);

				if (requirementsHierarchy != null) {
					results.add(requirementsHierarchy);
				}
			}
		}
		// Convert to InternalEList<?>
		return new BasicInternalEList<RequirementsHierarchy>(RequirementsHierarchy.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<OperationalSituation> getOperationalSituation() {
		EList<OperationalSituation> results = new BasicEList<OperationalSituation>();
		OperationalSituation adlOperationalSituation = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				adlOperationalSituation = UMLUtil.getStereotypeApplication(element, OperationalSituation.class);
				if (adlOperationalSituation != null) {
					results.add(adlOperationalSituation);
				}
			}
		}

		return new BasicInternalEList<OperationalSituation>(OperationalSituation.class, results.size(), results.toArray());
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
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.REQUIREMENTS_MODEL__BASE_PACKAGE, oldBase_Package, base_Package));
				}
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
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENTS_MODEL__BASE_PACKAGE, oldBase_Package, base_Package));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<RequirementsRelationshipGroup> getRequirementsRelationshipGroup() {
		EList<RequirementsRelationshipGroup> results = new BasicEList<RequirementsRelationshipGroup>();
		RequirementsRelationshipGroup operationalSituation = null;

		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element current = it.next();
				operationalSituation = UMLUtil.getStereotypeApplication(current, RequirementsRelationshipGroup.class);

				if (operationalSituation != null) {
					results.add(operationalSituation);
				}
			}
		}
		// Convert to InternalEList<?>
		return new BasicInternalEList<RequirementsRelationshipGroup>(RequirementsRelationshipGroup.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<Requirement> getRequirement() {
		EList<Requirement> results = new BasicEList<Requirement>();
		Requirement requirement = null;

		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element current = it.next();
				requirement = UMLUtil.getStereotypeApplication(current, Requirement.class);

				if (requirement != null) {
					results.add(requirement);
				}
			}
		}
		// Convert to InternalEList<?>
		return new BasicInternalEList<Requirement>(Requirement.class, results.size(), results.toArray());
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
		case RequirementsPackage.REQUIREMENTS_MODEL__USE_CASE:
			return getUseCase();
		case RequirementsPackage.REQUIREMENTS_MODEL__REQUIREMENTS_HIERACHY:
			return getRequirementsHierachy();
		case RequirementsPackage.REQUIREMENTS_MODEL__OPERATIONAL_SITUATION:
			return getOperationalSituation();
		case RequirementsPackage.REQUIREMENTS_MODEL__BASE_PACKAGE:
			if (resolve) {
				return getBase_Package();
			}
			return basicGetBase_Package();
		case RequirementsPackage.REQUIREMENTS_MODEL__REQUIREMENTS_RELATIONSHIP_GROUP:
			return getRequirementsRelationshipGroup();
		case RequirementsPackage.REQUIREMENTS_MODEL__REQUIREMENT:
			return getRequirement();
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
		switch (featureID) {
		case RequirementsPackage.REQUIREMENTS_MODEL__BASE_PACKAGE:
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
		case RequirementsPackage.REQUIREMENTS_MODEL__BASE_PACKAGE:
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
		case RequirementsPackage.REQUIREMENTS_MODEL__USE_CASE:
			return !getUseCase().isEmpty();
		case RequirementsPackage.REQUIREMENTS_MODEL__REQUIREMENTS_HIERACHY:
			return !getRequirementsHierachy().isEmpty();
		case RequirementsPackage.REQUIREMENTS_MODEL__OPERATIONAL_SITUATION:
			return !getOperationalSituation().isEmpty();
		case RequirementsPackage.REQUIREMENTS_MODEL__BASE_PACKAGE:
			return base_Package != null;
		case RequirementsPackage.REQUIREMENTS_MODEL__REQUIREMENTS_RELATIONSHIP_GROUP:
			return !getRequirementsRelationshipGroup().isEmpty();
		case RequirementsPackage.REQUIREMENTS_MODEL__REQUIREMENT:
			return !getRequirement().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // RequirementsModelImpl
