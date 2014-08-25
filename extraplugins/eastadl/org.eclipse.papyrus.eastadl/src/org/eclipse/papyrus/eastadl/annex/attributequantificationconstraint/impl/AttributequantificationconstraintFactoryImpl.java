/**
 */
package org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributeQuantificationconstraint;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintFactory;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.BehaviorAttributeBinding;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.LogicalEvent;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AttributequantificationconstraintFactoryImpl extends EFactoryImpl implements AttributequantificationconstraintFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static AttributequantificationconstraintFactory init() {
		try {
			AttributequantificationconstraintFactory theAttributequantificationconstraintFactory = (AttributequantificationconstraintFactory) EPackage.Registry.INSTANCE.getEFactory(AttributequantificationconstraintPackage.eNS_URI);
			if (theAttributequantificationconstraintFactory != null) {
				return theAttributequantificationconstraintFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AttributequantificationconstraintFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public AttributequantificationconstraintFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AttributequantificationconstraintPackage.ATTRIBUTE_QUANTIFICATIONCONSTRAINT:
			return createAttributeQuantificationconstraint();
		case AttributequantificationconstraintPackage.QUANTIFICATION:
			return createQuantification();
		case AttributequantificationconstraintPackage.BEHAVIOR_ATTRIBUTE_BINDING:
			return createBehaviorAttributeBinding();
		case AttributequantificationconstraintPackage.LOGICAL_EVENT:
			return createLogicalEvent();
		case AttributequantificationconstraintPackage.ATTRIBUTE:
			return createAttribute();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public AttributeQuantificationconstraint createAttributeQuantificationconstraint() {
		AttributeQuantificationconstraintImpl attributeQuantificationconstraint = new AttributeQuantificationconstraintImpl();
		return attributeQuantificationconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Quantification createQuantification() {
		QuantificationImpl quantification = new QuantificationImpl();
		return quantification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public BehaviorAttributeBinding createBehaviorAttributeBinding() {
		BehaviorAttributeBindingImpl behaviorAttributeBinding = new BehaviorAttributeBindingImpl();
		return behaviorAttributeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public LogicalEvent createLogicalEvent() {
		LogicalEventImpl logicalEvent = new LogicalEventImpl();
		return logicalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public AttributequantificationconstraintPackage getAttributequantificationconstraintPackage() {
		return (AttributequantificationconstraintPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AttributequantificationconstraintPackage getPackage() {
		return AttributequantificationconstraintPackage.eINSTANCE;
	}

} // AttributequantificationconstraintFactoryImpl
