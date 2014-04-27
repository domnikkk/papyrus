/**
 */
package org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributeQuantificationconstraint;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.EAElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Quantificationconstraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributeQuantificationconstraintImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributeQuantificationconstraintImpl#getQuantification <em>Quantification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeQuantificationconstraintImpl extends EAElementImpl implements AttributeQuantificationconstraint {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The cached value of the '{@link #getQuantification() <em>Quantification</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantification()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantification> quantification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeQuantificationconstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributequantificationconstraintPackage.Literals.ATTRIBUTE_QUANTIFICATIONCONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectResolvingEList<Attribute>(Attribute.class, this, AttributequantificationconstraintPackage.ATTRIBUTE_QUANTIFICATIONCONSTRAINT__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Quantification> getQuantification() {
		if (quantification == null) {
			quantification = new EObjectResolvingEList<Quantification>(Quantification.class, this, AttributequantificationconstraintPackage.ATTRIBUTE_QUANTIFICATIONCONSTRAINT__QUANTIFICATION);
		}
		return quantification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AttributequantificationconstraintPackage.ATTRIBUTE_QUANTIFICATIONCONSTRAINT__ATTRIBUTE:
				return getAttribute();
			case AttributequantificationconstraintPackage.ATTRIBUTE_QUANTIFICATIONCONSTRAINT__QUANTIFICATION:
				return getQuantification();
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
			case AttributequantificationconstraintPackage.ATTRIBUTE_QUANTIFICATIONCONSTRAINT__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case AttributequantificationconstraintPackage.ATTRIBUTE_QUANTIFICATIONCONSTRAINT__QUANTIFICATION:
				getQuantification().clear();
				getQuantification().addAll((Collection<? extends Quantification>)newValue);
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
			case AttributequantificationconstraintPackage.ATTRIBUTE_QUANTIFICATIONCONSTRAINT__ATTRIBUTE:
				getAttribute().clear();
				return;
			case AttributequantificationconstraintPackage.ATTRIBUTE_QUANTIFICATIONCONSTRAINT__QUANTIFICATION:
				getQuantification().clear();
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
			case AttributequantificationconstraintPackage.ATTRIBUTE_QUANTIFICATIONCONSTRAINT__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case AttributequantificationconstraintPackage.ATTRIBUTE_QUANTIFICATIONCONSTRAINT__QUANTIFICATION:
				return quantification != null && !quantification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AttributeQuantificationconstraintImpl
