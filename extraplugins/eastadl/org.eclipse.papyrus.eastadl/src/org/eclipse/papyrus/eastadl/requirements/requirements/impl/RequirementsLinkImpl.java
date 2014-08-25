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
import org.eclipse.papyrus.eastadl.requirements.requirements.Requirement;
import org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsLink;
import org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsLinkImpl#isIsBidirectional <em>Is Bidirectional</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsLinkImpl#getSource <em>Source</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsLinkImpl#getTarget <em>Target</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsLinkImpl#getBase_Dependency <em>Base Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementsLinkImpl extends RequirementsRelationshipImpl implements RequirementsLink {
	/**
	 * The default value of the '{@link #isIsBidirectional() <em>Is Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isIsBidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BIDIRECTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBidirectional() <em>Is Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isIsBidirectional()
	 * @generated
	 * @ordered
	 */
	protected boolean isBidirectional = IS_BIDIRECTIONAL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected RequirementsLinkImpl() {
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
		return RequirementsPackage.Literals.REQUIREMENTS_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isIsBidirectional() {
		return isBidirectional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setIsBidirectional(boolean newIsBidirectional) {
		boolean oldIsBidirectional = isBidirectional;
		isBidirectional = newIsBidirectional;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENTS_LINK__IS_BIDIRECTIONAL, oldIsBidirectional, isBidirectional));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<Requirement> getSource() {
		EList<Requirement> results = new BasicEList<Requirement>();
		Requirement adlRequirement = null;
		if (getBase_Dependency() != null) {
			Iterator<Element> it = getBase_Dependency().getSources().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				adlRequirement = UMLUtil.getStereotypeApplication(element, Requirement.class);
				if (adlRequirement != null) {
					results.add(adlRequirement);
				}
			}
		}

		return new BasicInternalEList<Requirement>(Requirement.class, results.size(), results.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<Requirement> getTarget() {
		EList<Requirement> results = new BasicEList<Requirement>();
		Requirement adlRequirement = null;
		if (getBase_Dependency() != null) {
			Iterator<Element> it = getBase_Dependency().getTargets().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				adlRequirement = UMLUtil.getStereotypeApplication(element, Requirement.class);
				if (adlRequirement != null) {
					results.add(adlRequirement);
				}
			}
		}

		return new BasicInternalEList<Requirement>(Requirement.class, results.size(), results.toArray());
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.REQUIREMENTS_LINK__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENTS_LINK__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
		}
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
		case RequirementsPackage.REQUIREMENTS_LINK__IS_BIDIRECTIONAL:
			return isIsBidirectional();
		case RequirementsPackage.REQUIREMENTS_LINK__SOURCE:
			return getSource();
		case RequirementsPackage.REQUIREMENTS_LINK__TARGET:
			return getTarget();
		case RequirementsPackage.REQUIREMENTS_LINK__BASE_DEPENDENCY:
			if (resolve) {
				return getBase_Dependency();
			}
			return basicGetBase_Dependency();
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
		case RequirementsPackage.REQUIREMENTS_LINK__IS_BIDIRECTIONAL:
			setIsBidirectional((Boolean) newValue);
			return;
		case RequirementsPackage.REQUIREMENTS_LINK__BASE_DEPENDENCY:
			setBase_Dependency((Dependency) newValue);
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
		case RequirementsPackage.REQUIREMENTS_LINK__IS_BIDIRECTIONAL:
			setIsBidirectional(IS_BIDIRECTIONAL_EDEFAULT);
			return;
		case RequirementsPackage.REQUIREMENTS_LINK__BASE_DEPENDENCY:
			setBase_Dependency((Dependency) null);
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
		case RequirementsPackage.REQUIREMENTS_LINK__IS_BIDIRECTIONAL:
			return isBidirectional != IS_BIDIRECTIONAL_EDEFAULT;
		case RequirementsPackage.REQUIREMENTS_LINK__SOURCE:
			return !getSource().isEmpty();
		case RequirementsPackage.REQUIREMENTS_LINK__TARGET:
			return !getTarget().isEmpty();
		case RequirementsPackage.REQUIREMENTS_LINK__BASE_DEPENDENCY:
			return base_Dependency != null;
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
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isBidirectional: ");
		result.append(isBidirectional);
		result.append(')');
		return result.toString();
	}

} // RequirementsLinkImpl
