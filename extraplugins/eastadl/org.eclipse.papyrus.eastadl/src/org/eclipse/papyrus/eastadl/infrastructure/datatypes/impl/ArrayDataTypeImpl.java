/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.ArrayDataType;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.ArrayDataTypeImpl#getMaxLenght <em>Max Lenght</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.ArrayDataTypeImpl#getMinLenght <em>Min Lenght</em>}</li>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.ArrayDataTypeImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayDataTypeImpl extends EADatatypeImpl implements ArrayDataType {
	/**
	 * The default value of the '{@link #getMaxLenght() <em>Max Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getMaxLenght()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_LENGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxLenght() <em>Max Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getMaxLenght()
	 * @generated
	 * @ordered
	 */
	protected int maxLenght = MAX_LENGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinLenght() <em>Min Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getMinLenght()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_LENGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinLenght() <em>Min Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getMinLenght()
	 * @generated
	 * @ordered
	 */
	protected int minLenght = MIN_LENGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected EADatatype elementType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ArrayDataTypeImpl() {
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
		return DatatypesPackage.Literals.ARRAY_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int getMaxLenght() {
		return maxLenght;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setMaxLenght(int newMaxLenght) {
		int oldMaxLenght = maxLenght;
		maxLenght = newMaxLenght;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.ARRAY_DATA_TYPE__MAX_LENGHT, oldMaxLenght, maxLenght));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int getMinLenght() {
		return minLenght;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setMinLenght(int newMinLenght) {
		int oldMinLenght = minLenght;
		minLenght = newMinLenght;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.ARRAY_DATA_TYPE__MIN_LENGHT, oldMinLenght, minLenght));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EADatatype getElementType() {
		if (elementType != null && elementType.eIsProxy()) {
			InternalEObject oldElementType = (InternalEObject) elementType;
			elementType = (EADatatype) eResolveProxy(oldElementType);
			if (elementType != oldElementType) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.ARRAY_DATA_TYPE__ELEMENT_TYPE, oldElementType, elementType));
				}
			}
		}
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EADatatype basicGetElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setElementType(EADatatype newElementType) {
		EADatatype oldElementType = elementType;
		elementType = newElementType;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.ARRAY_DATA_TYPE__ELEMENT_TYPE, oldElementType, elementType));
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
		case DatatypesPackage.ARRAY_DATA_TYPE__MAX_LENGHT:
			return getMaxLenght();
		case DatatypesPackage.ARRAY_DATA_TYPE__MIN_LENGHT:
			return getMinLenght();
		case DatatypesPackage.ARRAY_DATA_TYPE__ELEMENT_TYPE:
			if (resolve) {
				return getElementType();
			}
			return basicGetElementType();
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
		case DatatypesPackage.ARRAY_DATA_TYPE__MAX_LENGHT:
			setMaxLenght((Integer) newValue);
			return;
		case DatatypesPackage.ARRAY_DATA_TYPE__MIN_LENGHT:
			setMinLenght((Integer) newValue);
			return;
		case DatatypesPackage.ARRAY_DATA_TYPE__ELEMENT_TYPE:
			setElementType((EADatatype) newValue);
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
		case DatatypesPackage.ARRAY_DATA_TYPE__MAX_LENGHT:
			setMaxLenght(MAX_LENGHT_EDEFAULT);
			return;
		case DatatypesPackage.ARRAY_DATA_TYPE__MIN_LENGHT:
			setMinLenght(MIN_LENGHT_EDEFAULT);
			return;
		case DatatypesPackage.ARRAY_DATA_TYPE__ELEMENT_TYPE:
			setElementType((EADatatype) null);
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
		case DatatypesPackage.ARRAY_DATA_TYPE__MAX_LENGHT:
			return maxLenght != MAX_LENGHT_EDEFAULT;
		case DatatypesPackage.ARRAY_DATA_TYPE__MIN_LENGHT:
			return minLenght != MIN_LENGHT_EDEFAULT;
		case DatatypesPackage.ARRAY_DATA_TYPE__ELEMENT_TYPE:
			return elementType != null;
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
		result.append(" (maxLenght: ");
		result.append(maxLenght);
		result.append(", minLenght: ");
		result.append(minLenght);
		result.append(')');
		return result.toString();
	}

} // ArrayDataTypeImpl
