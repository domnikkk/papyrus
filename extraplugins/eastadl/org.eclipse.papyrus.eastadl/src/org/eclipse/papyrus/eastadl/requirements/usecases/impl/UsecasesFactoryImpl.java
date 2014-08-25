/**
 */
package org.eclipse.papyrus.eastadl.requirements.usecases.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.papyrus.eastadl.requirements.usecases.Actor;
import org.eclipse.papyrus.eastadl.requirements.usecases.Extend;
import org.eclipse.papyrus.eastadl.requirements.usecases.ExtensionPoint;
import org.eclipse.papyrus.eastadl.requirements.usecases.Include;
import org.eclipse.papyrus.eastadl.requirements.usecases.UseCase;
import org.eclipse.papyrus.eastadl.requirements.usecases.UsecasesFactory;
import org.eclipse.papyrus.eastadl.requirements.usecases.UsecasesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UsecasesFactoryImpl extends EFactoryImpl implements UsecasesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static UsecasesFactory init() {
		try {
			UsecasesFactory theUsecasesFactory = (UsecasesFactory) EPackage.Registry.INSTANCE.getEFactory(UsecasesPackage.eNS_URI);
			if (theUsecasesFactory != null) {
				return theUsecasesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UsecasesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public UsecasesFactoryImpl() {
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
		case UsecasesPackage.EXTEND:
			return createExtend();
		case UsecasesPackage.EXTENSION_POINT:
			return createExtensionPoint();
		case UsecasesPackage.USE_CASE:
			return createUseCase();
		case UsecasesPackage.INCLUDE:
			return createInclude();
		case UsecasesPackage.ACTOR:
			return createActor();
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
	public Extend createExtend() {
		ExtendImpl extend = new ExtendImpl();
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ExtensionPoint createExtensionPoint() {
		ExtensionPointImpl extensionPoint = new ExtensionPointImpl();
		return extensionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public UseCase createUseCase() {
		UseCaseImpl useCase = new UseCaseImpl();
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Include createInclude() {
		IncludeImpl include = new IncludeImpl();
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public UsecasesPackage getUsecasesPackage() {
		return (UsecasesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UsecasesPackage getPackage() {
		return UsecasesPackage.eINSTANCE;
	}

} // UsecasesFactoryImpl
