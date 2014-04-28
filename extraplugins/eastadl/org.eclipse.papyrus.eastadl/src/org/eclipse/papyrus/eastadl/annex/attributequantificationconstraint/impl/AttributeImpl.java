/**
 */
package org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatype;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributeImpl#isIsExternVisible <em>Is Extern Visible</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends EAElementImpl implements Attribute {
	/**
	 * The default value of the '{@link #isIsExternVisible() <em>Is Extern Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXTERN_VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExternVisible() <em>Is Extern Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean isExternVisible = IS_EXTERN_VISIBLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EADatatype type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributequantificationconstraintPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsExternVisible() {
		return isExternVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExternVisible(boolean newIsExternVisible) {
		boolean oldIsExternVisible = isExternVisible;
		isExternVisible = newIsExternVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AttributequantificationconstraintPackage.ATTRIBUTE__IS_EXTERN_VISIBLE, oldIsExternVisible, isExternVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EADatatype getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (EADatatype)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AttributequantificationconstraintPackage.ATTRIBUTE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EADatatype basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EADatatype newType) {
		EADatatype oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AttributequantificationconstraintPackage.ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AttributequantificationconstraintPackage.ATTRIBUTE__IS_EXTERN_VISIBLE:
				return isIsExternVisible();
			case AttributequantificationconstraintPackage.ATTRIBUTE__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case AttributequantificationconstraintPackage.ATTRIBUTE__IS_EXTERN_VISIBLE:
				setIsExternVisible((Boolean)newValue);
				return;
			case AttributequantificationconstraintPackage.ATTRIBUTE__TYPE:
				setType((EADatatype)newValue);
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
			case AttributequantificationconstraintPackage.ATTRIBUTE__IS_EXTERN_VISIBLE:
				setIsExternVisible(IS_EXTERN_VISIBLE_EDEFAULT);
				return;
			case AttributequantificationconstraintPackage.ATTRIBUTE__TYPE:
				setType((EADatatype)null);
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
			case AttributequantificationconstraintPackage.ATTRIBUTE__IS_EXTERN_VISIBLE:
				return isExternVisible != IS_EXTERN_VISIBLE_EDEFAULT;
			case AttributequantificationconstraintPackage.ATTRIBUTE__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isExternVisible: ");
		result.append(isExternVisible);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
