/**
 */
package org.eclipse.papyrus.eastadl.annex.behaviordescription.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintBindingAttribute;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintBindingEvent;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintPrototype;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintTargetBinding;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviorConstraintType;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionFactory;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BehaviordescriptionFactoryImpl extends EFactoryImpl implements BehaviordescriptionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static BehaviordescriptionFactory init() {
		try {
			BehaviordescriptionFactory theBehaviordescriptionFactory = (BehaviordescriptionFactory) EPackage.Registry.INSTANCE.getEFactory(BehaviordescriptionPackage.eNS_URI);
			if (theBehaviordescriptionFactory != null) {
				return theBehaviordescriptionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviordescriptionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public BehaviordescriptionFactoryImpl() {
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
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_BINDING_ATTRIBUTE:
			return createBehaviorConstraintBindingAttribute();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_BINDING_EVENT:
			return createBehaviorConstraintBindingEvent();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_PROTOTYPE:
			return createBehaviorConstraintPrototype();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TYPE:
			return createBehaviorConstraintType();
		case BehaviordescriptionPackage.BEHAVIOR_CONSTRAINT_TARGET_BINDING:
			return createBehaviorConstraintTargetBinding();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public BehaviorConstraintBindingAttribute createBehaviorConstraintBindingAttribute() {
		BehaviorConstraintBindingAttributeImpl behaviorConstraintBindingAttribute = new BehaviorConstraintBindingAttributeImpl();
		return behaviorConstraintBindingAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public BehaviorConstraintBindingEvent createBehaviorConstraintBindingEvent() {
		BehaviorConstraintBindingEventImpl behaviorConstraintBindingEvent = new BehaviorConstraintBindingEventImpl();
		return behaviorConstraintBindingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public BehaviorConstraintPrototype createBehaviorConstraintPrototype() {
		BehaviorConstraintPrototypeImpl behaviorConstraintPrototype = new BehaviorConstraintPrototypeImpl();
		return behaviorConstraintPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public BehaviorConstraintType createBehaviorConstraintType() {
		BehaviorConstraintTypeImpl behaviorConstraintType = new BehaviorConstraintTypeImpl();
		return behaviorConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public BehaviorConstraintTargetBinding createBehaviorConstraintTargetBinding() {
		BehaviorConstraintTargetBindingImpl behaviorConstraintTargetBinding = new BehaviorConstraintTargetBindingImpl();
		return behaviorConstraintTargetBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public BehaviordescriptionPackage getBehaviordescriptionPackage() {
		return (BehaviordescriptionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviordescriptionPackage getPackage() {
		return BehaviordescriptionPackage.eINSTANCE;
	}

} // BehaviordescriptionFactoryImpl
