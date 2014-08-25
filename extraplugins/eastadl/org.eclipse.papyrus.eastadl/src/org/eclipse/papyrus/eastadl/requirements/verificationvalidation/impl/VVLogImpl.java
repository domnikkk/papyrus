/**
 */
package org.eclipse.papyrus.eastadl.requirements.verificationvalidation.impl;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.TraceableSpecificationImpl;
import org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VVActualOutcome;
import org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VVLog;
import org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VVProcedure;
import org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VerificationvalidationPackage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VV Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.impl.VVLogImpl#getDate <em>Date</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.impl.VVLogImpl#getVvActualOutcome <em>Vv Actual Outcome</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.impl.VVLogImpl#getBase_Class <em>Base Class</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.requirements.verificationvalidation.impl.VVLogImpl#getPerformedVVProcedure <em>Performed VV Procedure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VVLogImpl extends TraceableSpecificationImpl implements VVLog {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getPerformedVVProcedure() <em>Performed VV Procedure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getPerformedVVProcedure()
	 * @generated
	 * @ordered
	 */
	protected VVProcedure performedVVProcedure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected VVLogImpl() {
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
		return VerificationvalidationPackage.Literals.VV_LOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, VerificationvalidationPackage.VV_LOG__DATE, oldDate, date));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<VVActualOutcome> getVvActualOutcome() {
		EList<VVActualOutcome> results = new BasicEList<VVActualOutcome>();
		VVActualOutcome adlVVActualOutcome = null;
		if (getBase_NamedElement() != null) {
			Iterator<Element> it = getBase_NamedElement().getOwnedElements().iterator();

			while (it.hasNext()) {
				Element element = it.next();
				adlVVActualOutcome = UMLUtil.getStereotypeApplication(element, VVActualOutcome.class);
				if (adlVVActualOutcome != null) {
					results.add(adlVVActualOutcome);
				}
			}
		}

		return new BasicInternalEList<VVActualOutcome>(VVActualOutcome.class, results.size(), results.toArray());
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
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VerificationvalidationPackage.VV_LOG__BASE_CLASS, oldBase_Class, base_Class));
				}
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
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, VerificationvalidationPackage.VV_LOG__BASE_CLASS, oldBase_Class, base_Class));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public VVProcedure getPerformedVVProcedure() {
		if (performedVVProcedure != null && performedVVProcedure.eIsProxy()) {
			InternalEObject oldPerformedVVProcedure = (InternalEObject) performedVVProcedure;
			performedVVProcedure = (VVProcedure) eResolveProxy(oldPerformedVVProcedure);
			if (performedVVProcedure != oldPerformedVVProcedure) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VerificationvalidationPackage.VV_LOG__PERFORMED_VV_PROCEDURE, oldPerformedVVProcedure, performedVVProcedure));
				}
			}
		}
		return performedVVProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public VVProcedure basicGetPerformedVVProcedure() {
		return performedVVProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setPerformedVVProcedure(VVProcedure newPerformedVVProcedure) {
		VVProcedure oldPerformedVVProcedure = performedVVProcedure;
		performedVVProcedure = newPerformedVVProcedure;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, VerificationvalidationPackage.VV_LOG__PERFORMED_VV_PROCEDURE, oldPerformedVVProcedure, performedVVProcedure));
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
		case VerificationvalidationPackage.VV_LOG__DATE:
			return getDate();
		case VerificationvalidationPackage.VV_LOG__VV_ACTUAL_OUTCOME:
			return getVvActualOutcome();
		case VerificationvalidationPackage.VV_LOG__BASE_CLASS:
			if (resolve) {
				return getBase_Class();
			}
			return basicGetBase_Class();
		case VerificationvalidationPackage.VV_LOG__PERFORMED_VV_PROCEDURE:
			if (resolve) {
				return getPerformedVVProcedure();
			}
			return basicGetPerformedVVProcedure();
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
		case VerificationvalidationPackage.VV_LOG__DATE:
			setDate((String) newValue);
			return;
		case VerificationvalidationPackage.VV_LOG__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) newValue);
			return;
		case VerificationvalidationPackage.VV_LOG__PERFORMED_VV_PROCEDURE:
			setPerformedVVProcedure((VVProcedure) newValue);
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
		case VerificationvalidationPackage.VV_LOG__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case VerificationvalidationPackage.VV_LOG__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) null);
			return;
		case VerificationvalidationPackage.VV_LOG__PERFORMED_VV_PROCEDURE:
			setPerformedVVProcedure((VVProcedure) null);
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
		case VerificationvalidationPackage.VV_LOG__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case VerificationvalidationPackage.VV_LOG__VV_ACTUAL_OUTCOME:
			return !getVvActualOutcome().isEmpty();
		case VerificationvalidationPackage.VV_LOG__BASE_CLASS:
			return base_Class != null;
		case VerificationvalidationPackage.VV_LOG__PERFORMED_VV_PROCEDURE:
			return performedVVProcedure != null;
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
		result.append(" (date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} // VVLogImpl
