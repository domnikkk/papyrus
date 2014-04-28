/**
 */
package org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatype;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAExpression;
import org.eclipse.papyrus.eastadl.infrastructure.values.EAValue;
import org.eclipse.papyrus.eastadl.infrastructure.values.ValuesPackage;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.QuantificationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.QuantificationImpl#getBase_ValueSpecification <em>Base Value Specification</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.QuantificationImpl#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuantificationImpl extends EAElementImpl implements Quantification {
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
	 * The cached value of the '{@link #getBase_ValueSpecification() <em>Base Value Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ValueSpecification()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification base_ValueSpecification;

	/**
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> operand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributequantificationconstraintPackage.Literals.QUANTIFICATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AttributequantificationconstraintPackage.QUANTIFICATION__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AttributequantificationconstraintPackage.QUANTIFICATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getBase_ValueSpecification() {
		if (base_ValueSpecification != null && base_ValueSpecification.eIsProxy()) {
			InternalEObject oldBase_ValueSpecification = (InternalEObject)base_ValueSpecification;
			base_ValueSpecification = (ValueSpecification)eResolveProxy(oldBase_ValueSpecification);
			if (base_ValueSpecification != oldBase_ValueSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AttributequantificationconstraintPackage.QUANTIFICATION__BASE_VALUE_SPECIFICATION, oldBase_ValueSpecification, base_ValueSpecification));
			}
		}
		return base_ValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetBase_ValueSpecification() {
		return base_ValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ValueSpecification(ValueSpecification newBase_ValueSpecification) {
		ValueSpecification oldBase_ValueSpecification = base_ValueSpecification;
		base_ValueSpecification = newBase_ValueSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AttributequantificationconstraintPackage.QUANTIFICATION__BASE_VALUE_SPECIFICATION, oldBase_ValueSpecification, base_ValueSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getOperand() {
		if (operand == null) {
			operand = new EObjectResolvingEList<Attribute>(Attribute.class, this, AttributequantificationconstraintPackage.QUANTIFICATION__OPERAND);
		}
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AttributequantificationconstraintPackage.QUANTIFICATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case AttributequantificationconstraintPackage.QUANTIFICATION__BASE_VALUE_SPECIFICATION:
				if (resolve) return getBase_ValueSpecification();
				return basicGetBase_ValueSpecification();
			case AttributequantificationconstraintPackage.QUANTIFICATION__OPERAND:
				return getOperand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AttributequantificationconstraintPackage.QUANTIFICATION__TYPE:
				setType((EADatatype)newValue);
				return;
			case AttributequantificationconstraintPackage.QUANTIFICATION__BASE_VALUE_SPECIFICATION:
				setBase_ValueSpecification((ValueSpecification)newValue);
				return;
			case AttributequantificationconstraintPackage.QUANTIFICATION__OPERAND:
				getOperand().clear();
				getOperand().addAll((Collection<? extends Attribute>)newValue);
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
			case AttributequantificationconstraintPackage.QUANTIFICATION__TYPE:
				setType((EADatatype)null);
				return;
			case AttributequantificationconstraintPackage.QUANTIFICATION__BASE_VALUE_SPECIFICATION:
				setBase_ValueSpecification((ValueSpecification)null);
				return;
			case AttributequantificationconstraintPackage.QUANTIFICATION__OPERAND:
				getOperand().clear();
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
			case AttributequantificationconstraintPackage.QUANTIFICATION__TYPE:
				return type != null;
			case AttributequantificationconstraintPackage.QUANTIFICATION__BASE_VALUE_SPECIFICATION:
				return base_ValueSpecification != null;
			case AttributequantificationconstraintPackage.QUANTIFICATION__OPERAND:
				return operand != null && !operand.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EAValue.class) {
			switch (derivedFeatureID) {
				case AttributequantificationconstraintPackage.QUANTIFICATION__TYPE: return ValuesPackage.EA_VALUE__TYPE;
				case AttributequantificationconstraintPackage.QUANTIFICATION__BASE_VALUE_SPECIFICATION: return ValuesPackage.EA_VALUE__BASE_VALUE_SPECIFICATION;
				default: return -1;
			}
		}
		if (baseClass == EAExpression.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EAValue.class) {
			switch (baseFeatureID) {
				case ValuesPackage.EA_VALUE__TYPE: return AttributequantificationconstraintPackage.QUANTIFICATION__TYPE;
				case ValuesPackage.EA_VALUE__BASE_VALUE_SPECIFICATION: return AttributequantificationconstraintPackage.QUANTIFICATION__BASE_VALUE_SPECIFICATION;
				default: return -1;
			}
		}
		if (baseClass == EAExpression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //QuantificationImpl
