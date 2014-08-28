/**
 */
package org.eclipse.papyrus.eastadl.requirements.requirements.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.papyrus.eastadl.infrastructure.RefineInstanceRef;
import org.eclipse.papyrus.eastadl.requirements.requirements.Refine;
import org.eclipse.papyrus.eastadl.requirements.requirements.Requirement;
import org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.profile.standard.StandardPackage;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RefineImpl#getBase_Abstraction <em>Base Abstraction</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RefineImpl#getRefinedRequirement <em>Refined Requirement</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RefineImpl#getBase_Dependency <em>Base Dependency</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RefineImpl#getRefinedBy <em>Refined By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefineImpl extends RequirementsRelationshipImpl implements Refine {
	/**
	 * The cached value of the '{@link #getBase_Abstraction() <em>Base Abstraction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_Abstraction()
	 * @generated
	 * @ordered
	 */
	protected Abstraction base_Abstraction;

	/**
	 * The cached value of the '{@link #getBase_Dependency() <em>Base Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_Dependency()
	 * @generated
	 * @ordered
	 */
	protected Dependency base_Dependency;

	/**
	 * The cached value of the '{@link #getRefinedBy() <em>Refined By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getRefinedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RefineInstanceRef> refinedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected RefineImpl() {
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
		return RequirementsPackage.Literals.REFINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Abstraction getBase_Abstraction() {
		if (base_Abstraction != null && base_Abstraction.eIsProxy()) {
			InternalEObject oldBase_Abstraction = (InternalEObject) base_Abstraction;
			base_Abstraction = (Abstraction) eResolveProxy(oldBase_Abstraction);
			if (base_Abstraction != oldBase_Abstraction) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.REFINE__BASE_ABSTRACTION, oldBase_Abstraction, base_Abstraction));
				}
			}
		}
		return base_Abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Abstraction basicGetBase_Abstraction() {
		return base_Abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBase_Abstraction(Abstraction newBase_Abstraction) {
		Abstraction oldBase_Abstraction = base_Abstraction;
		base_Abstraction = newBase_Abstraction;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REFINE__BASE_ABSTRACTION, oldBase_Abstraction, base_Abstraction));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<Requirement> getRefinedRequirement() {
		EList<Requirement> results = new BasicEList<Requirement>();
		Requirement requirement;

		if (getBase_Dependency() != null) {
			// Parse owned Properties
			Iterator<Element> it = getBase_Dependency().getTargets().iterator();
			while (it.hasNext()) {
				Element current = it.next();

				// Test if current is stereotyped Requirement
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
	public EList<RefineInstanceRef> getRefinedBy() {
		if (refinedBy == null) {
			refinedBy = new EObjectContainmentEList<RefineInstanceRef>(RefineInstanceRef.class, this, RequirementsPackage.REFINE__REFINED_BY);
		}
		return refinedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Dependency getBase_Dependency() {
		if (base_Dependency != null && base_Dependency.eIsProxy()) {
			InternalEObject oldBase_Dependency = (InternalEObject) base_Dependency;
			base_Dependency = (Dependency) eResolveProxy(oldBase_Dependency);
			if (base_Dependency != oldBase_Dependency) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.REFINE__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
				}
			}
		}
		return base_Dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Dependency basicGetBase_Dependency() {
		return base_Dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBase_Dependency(Dependency newBase_Dependency) {
		Dependency oldBase_Dependency = base_Dependency;
		base_Dependency = newBase_Dependency;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REFINE__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RequirementsPackage.REFINE__REFINED_BY:
			return ((InternalEList<?>) getRefinedBy()).basicRemove(otherEnd, msgs);
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
		switch (featureID) {
		case RequirementsPackage.REFINE__BASE_ABSTRACTION:
			if (resolve) {
				return getBase_Abstraction();
			}
			return basicGetBase_Abstraction();
		case RequirementsPackage.REFINE__REFINED_REQUIREMENT:
			return getRefinedRequirement();
		case RequirementsPackage.REFINE__BASE_DEPENDENCY:
			if (resolve) {
				return getBase_Dependency();
			}
			return basicGetBase_Dependency();
		case RequirementsPackage.REFINE__REFINED_BY:
			return getRefinedBy();
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
		case RequirementsPackage.REFINE__BASE_ABSTRACTION:
			setBase_Abstraction((Abstraction) newValue);
			return;
		case RequirementsPackage.REFINE__BASE_DEPENDENCY:
			setBase_Dependency((Dependency) newValue);
			return;
		case RequirementsPackage.REFINE__REFINED_BY:
			getRefinedBy().clear();
			getRefinedBy().addAll((Collection<? extends RefineInstanceRef>) newValue);
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
		case RequirementsPackage.REFINE__BASE_ABSTRACTION:
			setBase_Abstraction((Abstraction) null);
			return;
		case RequirementsPackage.REFINE__BASE_DEPENDENCY:
			setBase_Dependency((Dependency) null);
			return;
		case RequirementsPackage.REFINE__REFINED_BY:
			getRefinedBy().clear();
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
		case RequirementsPackage.REFINE__BASE_ABSTRACTION:
			return base_Abstraction != null;
		case RequirementsPackage.REFINE__REFINED_REQUIREMENT:
			return !getRefinedRequirement().isEmpty();
		case RequirementsPackage.REFINE__BASE_DEPENDENCY:
			return base_Dependency != null;
		case RequirementsPackage.REFINE__REFINED_BY:
			return refinedBy != null && !refinedBy.isEmpty();
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == org.eclipse.uml2.uml.profile.standard.Refine.class) {
			switch (derivedFeatureID) {
			case RequirementsPackage.REFINE__BASE_ABSTRACTION:
				return StandardPackage.REFINE__BASE_ABSTRACTION;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == org.eclipse.uml2.uml.profile.standard.Refine.class) {
			switch (baseFeatureID) {
			case StandardPackage.REFINE__BASE_ABSTRACTION:
				return RequirementsPackage.REFINE__BASE_ABSTRACTION;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // RefineImpl
