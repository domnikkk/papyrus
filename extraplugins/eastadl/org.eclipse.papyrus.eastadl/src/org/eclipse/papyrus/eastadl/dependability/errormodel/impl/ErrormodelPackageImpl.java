/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Sara TUCCI (CEA LIST) sara.tucci@cea.fr - Initial API and implementation
 *  Chokri MRAIDHA (CEA LIST) chokri.mraidha@cea.fr - Initial API and implementation
 *  David SERVAT (CEA LIST) david.servat@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.eastadl.dependability.errormodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.papyrus.eastadl.EastadlPackage;
import org.eclipse.papyrus.eastadl.annex.AnnexPackage;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributequantificationconstraintPackageImpl;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.BehaviordescriptionPackage;
import org.eclipse.papyrus.eastadl.annex.behaviordescription.impl.BehaviordescriptionPackageImpl;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.ComputationconstraintPackageImpl;
import org.eclipse.papyrus.eastadl.annex.impl.AnnexPackageImpl;
import org.eclipse.papyrus.eastadl.annex.needs.NeedsPackage;
import org.eclipse.papyrus.eastadl.annex.needs.impl.NeedsPackageImpl;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.TemporalconstraintPackage;
import org.eclipse.papyrus.eastadl.annex.temporalconstraint.impl.TemporalconstraintPackageImpl;
import org.eclipse.papyrus.eastadl.behavior.BehaviorPackage;
import org.eclipse.papyrus.eastadl.behavior.impl.BehaviorPackageImpl;
import org.eclipse.papyrus.eastadl.dependability.DependabilityPackage;
import org.eclipse.papyrus.eastadl.dependability.errormodel.Anomaly;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrorBehavior;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrorBehaviorKind;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrorModelPrototype;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrorModelType;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrormodelFactory;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrormodelPackage;
import org.eclipse.papyrus.eastadl.dependability.errormodel.FailureOutPort;
import org.eclipse.papyrus.eastadl.dependability.errormodel.FaultFailurePort;
import org.eclipse.papyrus.eastadl.dependability.errormodel.FaultFailurePropagationLink;
import org.eclipse.papyrus.eastadl.dependability.errormodel.FaultInPort;
import org.eclipse.papyrus.eastadl.dependability.errormodel.InternalFaultPrototype;
import org.eclipse.papyrus.eastadl.dependability.errormodel.ProcessFaultPrototype;
import org.eclipse.papyrus.eastadl.dependability.impl.DependabilityPackageImpl;
import org.eclipse.papyrus.eastadl.dependability.safetycase.SafetycasePackage;
import org.eclipse.papyrus.eastadl.dependability.safetycase.impl.SafetycasePackageImpl;
import org.eclipse.papyrus.eastadl.dependability.safetyconstraints.SafetyconstraintsPackage;
import org.eclipse.papyrus.eastadl.dependability.safetyconstraints.impl.SafetyconstraintsPackageImpl;
import org.eclipse.papyrus.eastadl.dependability.safetyrequirement.SafetyrequirementPackage;
import org.eclipse.papyrus.eastadl.dependability.safetyrequirement.impl.SafetyrequirementPackageImpl;
import org.eclipse.papyrus.eastadl.environment.EnvironmentPackage;
import org.eclipse.papyrus.eastadl.environment.impl.EnvironmentPackageImpl;
import org.eclipse.papyrus.eastadl.genericconstraints.GenericconstraintsPackage;
import org.eclipse.papyrus.eastadl.genericconstraints.impl.GenericconstraintsPackageImpl;
import org.eclipse.papyrus.eastadl.impl.EastadlPackageImpl;
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl;
import org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl;
import org.eclipse.papyrus.eastadl.infrastructure.impl.InfrastructurePackageImpl;
import org.eclipse.papyrus.eastadl.infrastructure.userattributes.UserattributesPackage;
import org.eclipse.papyrus.eastadl.infrastructure.userattributes.impl.UserattributesPackageImpl;
import org.eclipse.papyrus.eastadl.infrastructure.values.ValuesPackage;
import org.eclipse.papyrus.eastadl.infrastructure.values.impl.ValuesPackageImpl;
import org.eclipse.papyrus.eastadl.requirements.RequirementsPackage;
import org.eclipse.papyrus.eastadl.requirements.impl.RequirementsPackageImpl;
import org.eclipse.papyrus.eastadl.requirements.usecases.UsecasesPackage;
import org.eclipse.papyrus.eastadl.requirements.usecases.impl.UsecasesPackageImpl;
import org.eclipse.papyrus.eastadl.requirements.verificationvalidation.VerificationvalidationPackage;
import org.eclipse.papyrus.eastadl.requirements.verificationvalidation.impl.VerificationvalidationPackageImpl;
import org.eclipse.papyrus.eastadl.structure.StructurePackage;
import org.eclipse.papyrus.eastadl.structure.featuremodeling.FeaturemodelingPackage;
import org.eclipse.papyrus.eastadl.structure.featuremodeling.impl.FeaturemodelingPackageImpl;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.FunctionmodelingPackage;
import org.eclipse.papyrus.eastadl.structure.functionmodeling.impl.FunctionmodelingPackageImpl;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.HardwaremodelingPackage;
import org.eclipse.papyrus.eastadl.structure.hardwaremodeling.impl.HardwaremodelingPackageImpl;
import org.eclipse.papyrus.eastadl.structure.impl.StructurePackageImpl;
import org.eclipse.papyrus.eastadl.structure.systemmodeling.SystemmodelingPackage;
import org.eclipse.papyrus.eastadl.structure.systemmodeling.impl.SystemmodelingPackageImpl;
import org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage;
import org.eclipse.papyrus.eastadl.structure.vehiclefeaturemodeling.impl.VehiclefeaturemodelingPackageImpl;
import org.eclipse.papyrus.eastadl.timing.TimingPackage;
import org.eclipse.papyrus.eastadl.timing.events.EventsPackage;
import org.eclipse.papyrus.eastadl.timing.events.impl.EventsPackageImpl;
import org.eclipse.papyrus.eastadl.timing.impl.TimingPackageImpl;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl;
import org.eclipse.papyrus.eastadl.variability.VariabilityPackage;
import org.eclipse.papyrus.eastadl.variability.impl.VariabilityPackageImpl;
import org.eclipse.papyrus.sysml.SysmlPackage;
import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.uml.UMLPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ErrormodelPackageImpl extends EPackageImpl implements ErrormodelPackage {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass errorBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass anomalyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass internalFaultPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass errorModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass faultFailurePropagationLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass faultFailurePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass errorModelPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass processFaultPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass failureOutPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass faultInPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EEnum errorBehaviorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>
	 * This method is used to initialize {@link ErrormodelPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ErrormodelPackage init() {
		if (isInited) {
			return (ErrormodelPackage) EPackage.Registry.INSTANCE.getEPackage(ErrormodelPackage.eNS_URI);
		}

		// Obtain or create and register package
		ErrormodelPackageImpl theErrormodelPackage = (ErrormodelPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ErrormodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ErrormodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SysmlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		EastadlPackageImpl theEastadlPackage = (EastadlPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(EastadlPackage.eNS_URI) instanceof EastadlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EastadlPackage.eNS_URI) : EastadlPackage.eINSTANCE);
		VariabilityPackageImpl theVariabilityPackage = (VariabilityPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(VariabilityPackage.eNS_URI) instanceof VariabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariabilityPackage.eNS_URI)
				: VariabilityPackage.eINSTANCE);
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl) (EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI) instanceof InfrastructurePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(InfrastructurePackage.eNS_URI) : InfrastructurePackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI)
				: DatatypesPackage.eINSTANCE);
		UserattributesPackageImpl theUserattributesPackage = (UserattributesPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(UserattributesPackage.eNS_URI) instanceof UserattributesPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(UserattributesPackage.eNS_URI) : UserattributesPackage.eINSTANCE);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) : ValuesPackage.eINSTANCE);
		ElementsPackageImpl theElementsPackage = (ElementsPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(ElementsPackage.eNS_URI) instanceof ElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ElementsPackage.eNS_URI)
				: ElementsPackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl) (EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI)
				: StructurePackage.eINSTANCE);
		FunctionmodelingPackageImpl theFunctionmodelingPackage = (FunctionmodelingPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(FunctionmodelingPackage.eNS_URI) instanceof FunctionmodelingPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(FunctionmodelingPackage.eNS_URI) : FunctionmodelingPackage.eINSTANCE);
		FeaturemodelingPackageImpl theFeaturemodelingPackage = (FeaturemodelingPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(FeaturemodelingPackage.eNS_URI) instanceof FeaturemodelingPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(FeaturemodelingPackage.eNS_URI) : FeaturemodelingPackage.eINSTANCE);
		SystemmodelingPackageImpl theSystemmodelingPackage = (SystemmodelingPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(SystemmodelingPackage.eNS_URI) instanceof SystemmodelingPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(SystemmodelingPackage.eNS_URI) : SystemmodelingPackage.eINSTANCE);
		VehiclefeaturemodelingPackageImpl theVehiclefeaturemodelingPackage = (VehiclefeaturemodelingPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(VehiclefeaturemodelingPackage.eNS_URI) instanceof VehiclefeaturemodelingPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(VehiclefeaturemodelingPackage.eNS_URI)
				: VehiclefeaturemodelingPackage.eINSTANCE);
		HardwaremodelingPackageImpl theHardwaremodelingPackage = (HardwaremodelingPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(HardwaremodelingPackage.eNS_URI) instanceof HardwaremodelingPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(HardwaremodelingPackage.eNS_URI) : HardwaremodelingPackage.eINSTANCE);
		DependabilityPackageImpl theDependabilityPackage = (DependabilityPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(DependabilityPackage.eNS_URI) instanceof DependabilityPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(DependabilityPackage.eNS_URI) : DependabilityPackage.eINSTANCE);
		SafetyrequirementPackageImpl theSafetyrequirementPackage = (SafetyrequirementPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(SafetyrequirementPackage.eNS_URI) instanceof SafetyrequirementPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(SafetyrequirementPackage.eNS_URI) : SafetyrequirementPackage.eINSTANCE);
		SafetyconstraintsPackageImpl theSafetyconstraintsPackage = (SafetyconstraintsPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(SafetyconstraintsPackage.eNS_URI) instanceof SafetyconstraintsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(SafetyconstraintsPackage.eNS_URI) : SafetyconstraintsPackage.eINSTANCE);
		SafetycasePackageImpl theSafetycasePackage = (SafetycasePackageImpl) (EPackage.Registry.INSTANCE.getEPackage(SafetycasePackage.eNS_URI) instanceof SafetycasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SafetycasePackage.eNS_URI)
				: SafetycasePackage.eINSTANCE);
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) instanceof RequirementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI)
				: RequirementsPackage.eINSTANCE);
		UsecasesPackageImpl theUsecasesPackage = (UsecasesPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(UsecasesPackage.eNS_URI) instanceof UsecasesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UsecasesPackage.eNS_URI)
				: UsecasesPackage.eINSTANCE);
		VerificationvalidationPackageImpl theVerificationvalidationPackage = (VerificationvalidationPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(VerificationvalidationPackage.eNS_URI) instanceof VerificationvalidationPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(VerificationvalidationPackage.eNS_URI)
				: VerificationvalidationPackage.eINSTANCE);
		org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl theRequirementsPackage_1 = (org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage.eNS_URI) instanceof org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage.eNS_URI) : org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI)
				: BehaviorPackage.eINSTANCE);
		TimingPackageImpl theTimingPackage = (TimingPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(TimingPackage.eNS_URI) instanceof TimingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimingPackage.eNS_URI) : TimingPackage.eINSTANCE);
		TimingconstraintsPackageImpl theTimingconstraintsPackage = (TimingconstraintsPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(TimingconstraintsPackage.eNS_URI) instanceof TimingconstraintsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TimingconstraintsPackage.eNS_URI) : TimingconstraintsPackage.eINSTANCE);
		EventsPackageImpl theEventsPackage = (EventsPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) instanceof EventsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) : EventsPackage.eINSTANCE);
		EnvironmentPackageImpl theEnvironmentPackage = (EnvironmentPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI) instanceof EnvironmentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI)
				: EnvironmentPackage.eINSTANCE);
		AnnexPackageImpl theAnnexPackage = (AnnexPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(AnnexPackage.eNS_URI) instanceof AnnexPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnnexPackage.eNS_URI) : AnnexPackage.eINSTANCE);
		NeedsPackageImpl theNeedsPackage = (NeedsPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(NeedsPackage.eNS_URI) instanceof NeedsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NeedsPackage.eNS_URI) : NeedsPackage.eINSTANCE);
		BehaviordescriptionPackageImpl theBehaviordescriptionPackage = (BehaviordescriptionPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(BehaviordescriptionPackage.eNS_URI) instanceof BehaviordescriptionPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(BehaviordescriptionPackage.eNS_URI) : BehaviordescriptionPackage.eINSTANCE);
		AttributequantificationconstraintPackageImpl theAttributequantificationconstraintPackage = (AttributequantificationconstraintPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(AttributequantificationconstraintPackage.eNS_URI) instanceof AttributequantificationconstraintPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(AttributequantificationconstraintPackage.eNS_URI)
				: AttributequantificationconstraintPackage.eINSTANCE);
		TemporalconstraintPackageImpl theTemporalconstraintPackage = (TemporalconstraintPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(TemporalconstraintPackage.eNS_URI) instanceof TemporalconstraintPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TemporalconstraintPackage.eNS_URI) : TemporalconstraintPackage.eINSTANCE);
		ComputationconstraintPackageImpl theComputationconstraintPackage = (ComputationconstraintPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(ComputationconstraintPackage.eNS_URI) instanceof ComputationconstraintPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ComputationconstraintPackage.eNS_URI)
				: ComputationconstraintPackage.eINSTANCE);
		GenericconstraintsPackageImpl theGenericconstraintsPackage = (GenericconstraintsPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(GenericconstraintsPackage.eNS_URI) instanceof GenericconstraintsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(GenericconstraintsPackage.eNS_URI) : GenericconstraintsPackage.eINSTANCE);

		// Create package meta-data objects
		theErrormodelPackage.createPackageContents();
		theEastadlPackage.createPackageContents();
		theVariabilityPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theUserattributesPackage.createPackageContents();
		theValuesPackage.createPackageContents();
		theElementsPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theFunctionmodelingPackage.createPackageContents();
		theFeaturemodelingPackage.createPackageContents();
		theSystemmodelingPackage.createPackageContents();
		theVehiclefeaturemodelingPackage.createPackageContents();
		theHardwaremodelingPackage.createPackageContents();
		theDependabilityPackage.createPackageContents();
		theSafetyrequirementPackage.createPackageContents();
		theSafetyconstraintsPackage.createPackageContents();
		theSafetycasePackage.createPackageContents();
		theRequirementsPackage.createPackageContents();
		theUsecasesPackage.createPackageContents();
		theVerificationvalidationPackage.createPackageContents();
		theRequirementsPackage_1.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theTimingPackage.createPackageContents();
		theTimingconstraintsPackage.createPackageContents();
		theEventsPackage.createPackageContents();
		theEnvironmentPackage.createPackageContents();
		theAnnexPackage.createPackageContents();
		theNeedsPackage.createPackageContents();
		theBehaviordescriptionPackage.createPackageContents();
		theAttributequantificationconstraintPackage.createPackageContents();
		theTemporalconstraintPackage.createPackageContents();
		theComputationconstraintPackage.createPackageContents();
		theGenericconstraintsPackage.createPackageContents();

		// Initialize created meta-data
		theErrormodelPackage.initializePackageContents();
		theEastadlPackage.initializePackageContents();
		theVariabilityPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theUserattributesPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		theElementsPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theFunctionmodelingPackage.initializePackageContents();
		theFeaturemodelingPackage.initializePackageContents();
		theSystemmodelingPackage.initializePackageContents();
		theVehiclefeaturemodelingPackage.initializePackageContents();
		theHardwaremodelingPackage.initializePackageContents();
		theDependabilityPackage.initializePackageContents();
		theSafetyrequirementPackage.initializePackageContents();
		theSafetyconstraintsPackage.initializePackageContents();
		theSafetycasePackage.initializePackageContents();
		theRequirementsPackage.initializePackageContents();
		theUsecasesPackage.initializePackageContents();
		theVerificationvalidationPackage.initializePackageContents();
		theRequirementsPackage_1.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theTimingPackage.initializePackageContents();
		theTimingconstraintsPackage.initializePackageContents();
		theEventsPackage.initializePackageContents();
		theEnvironmentPackage.initializePackageContents();
		theAnnexPackage.initializePackageContents();
		theNeedsPackage.initializePackageContents();
		theBehaviordescriptionPackage.initializePackageContents();
		theAttributequantificationconstraintPackage.initializePackageContents();
		theTemporalconstraintPackage.initializePackageContents();
		theComputationconstraintPackage.initializePackageContents();
		theGenericconstraintsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theErrormodelPackage.freeze();


		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ErrormodelPackage.eNS_URI, theErrormodelPackage);
		return theErrormodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the package, or returns the registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.eastadl.dependability.errormodel.ErrormodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ErrormodelPackageImpl() {
		super(eNS_URI, ErrormodelFactory.eINSTANCE);
	}

	/**
	 * Creates the meta-model objects for the package. This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		anomalyEClass = createEClass(ANOMALY);
		createEReference(anomalyEClass, ANOMALY__BASE_PROPERTY);
		createEReference(anomalyEClass, ANOMALY__TYPE);

		errorModelPrototypeEClass = createEClass(ERROR_MODEL_PROTOTYPE);
		createEReference(errorModelPrototypeEClass, ERROR_MODEL_PROTOTYPE__TYPE);
		createEReference(errorModelPrototypeEClass, ERROR_MODEL_PROTOTYPE__TARGET);
		createEReference(errorModelPrototypeEClass, ERROR_MODEL_PROTOTYPE__FUNCTION_TARGET);
		createEReference(errorModelPrototypeEClass, ERROR_MODEL_PROTOTYPE__HW_TARGET);

		errorModelTypeEClass = createEClass(ERROR_MODEL_TYPE);
		createEReference(errorModelTypeEClass, ERROR_MODEL_TYPE__FAULT_FAILURE_CONNECTOR);
		createEReference(errorModelTypeEClass, ERROR_MODEL_TYPE__PART);
		createEReference(errorModelTypeEClass, ERROR_MODEL_TYPE__ERROR_BEHAVIOR_DESCRIPTION);
		createEReference(errorModelTypeEClass, ERROR_MODEL_TYPE__FAILURE);
		createEReference(errorModelTypeEClass, ERROR_MODEL_TYPE__EXTERNAL_FAULT);
		createEReference(errorModelTypeEClass, ERROR_MODEL_TYPE__INTERNAL_FAULT);
		createEReference(errorModelTypeEClass, ERROR_MODEL_TYPE__PROCESS_FAULT);
		createEReference(errorModelTypeEClass, ERROR_MODEL_TYPE__TARGET);
		createEReference(errorModelTypeEClass, ERROR_MODEL_TYPE__HW_TARGET);

		faultFailurePropagationLinkEClass = createEClass(FAULT_FAILURE_PROPAGATION_LINK);
		createEAttribute(faultFailurePropagationLinkEClass, FAULT_FAILURE_PROPAGATION_LINK__IMMEDIATE_PROPAGATION);
		createEReference(faultFailurePropagationLinkEClass, FAULT_FAILURE_PROPAGATION_LINK__TO_PORT);
		createEReference(faultFailurePropagationLinkEClass, FAULT_FAILURE_PROPAGATION_LINK__FROM_PORT);

		errorBehaviorEClass = createEClass(ERROR_BEHAVIOR);
		createEReference(errorBehaviorEClass, ERROR_BEHAVIOR__BASE_BEHAVIOR);
		createEAttribute(errorBehaviorEClass, ERROR_BEHAVIOR__FAILURE_LOGIC);
		createEAttribute(errorBehaviorEClass, ERROR_BEHAVIOR__TYPE);
		createEReference(errorBehaviorEClass, ERROR_BEHAVIOR__INTERNAL_FAULT);
		createEReference(errorBehaviorEClass, ERROR_BEHAVIOR__EXTERNAL_FAILURE);
		createEReference(errorBehaviorEClass, ERROR_BEHAVIOR__EXTERNAL_FAULT);
		createEReference(errorBehaviorEClass, ERROR_BEHAVIOR__PROCESS_FAULT);
		createEReference(errorBehaviorEClass, ERROR_BEHAVIOR__INTERNAL_FAILURE);

		internalFaultPrototypeEClass = createEClass(INTERNAL_FAULT_PROTOTYPE);
		createEReference(internalFaultPrototypeEClass, INTERNAL_FAULT_PROTOTYPE__BASE_CLASS);
		createEReference(internalFaultPrototypeEClass, INTERNAL_FAULT_PROTOTYPE__BASE_EVENT);

		failureOutPortEClass = createEClass(FAILURE_OUT_PORT);

		faultInPortEClass = createEClass(FAULT_IN_PORT);

		processFaultPrototypeEClass = createEClass(PROCESS_FAULT_PROTOTYPE);
		createEReference(processFaultPrototypeEClass, PROCESS_FAULT_PROTOTYPE__BASE_EVENT);

		faultFailurePortEClass = createEClass(FAULT_FAILURE_PORT);
		createEReference(faultFailurePortEClass, FAULT_FAILURE_PORT__FUNCTION_TARGET);
		createEReference(faultFailurePortEClass, FAULT_FAILURE_PORT__HW_TARGET);

		// Create enums
		errorBehaviorKindEEnum = createEEnum(ERROR_BEHAVIOR_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getAnomaly() {
		return anomalyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getAnomaly_Base_Property() {
		return (EReference) anomalyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getAnomaly_Type() {
		return (EReference) anomalyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getErrorBehavior() {
		return errorBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorBehavior_Base_Behavior() {
		return (EReference) errorBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorBehavior_ExternalFailure() {
		return (EReference) errorBehaviorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorBehavior_ExternalFault() {
		return (EReference) errorBehaviorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getErrorBehavior_FailureLogic() {
		return (EAttribute) errorBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorBehavior_InternalFault() {
		return (EReference) errorBehaviorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorBehavior_ProcessFault() {
		return (EReference) errorBehaviorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorBehavior_InternalFailure() {
		return (EReference) errorBehaviorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getErrorBehavior_Type() {
		return (EAttribute) errorBehaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEnum getErrorBehaviorKind() {
		return errorBehaviorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ErrormodelFactory getErrormodelFactory() {
		return (ErrormodelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getErrorModelPrototype() {
		return errorModelPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorModelPrototype_FunctionTarget() {
		return (EReference) errorModelPrototypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorModelPrototype_HwTarget() {
		return (EReference) errorModelPrototypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorModelPrototype_Target() {
		return (EReference) errorModelPrototypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorModelPrototype_Type() {
		return (EReference) errorModelPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getErrorModelType() {
		return errorModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorModelType_ErrorBehaviorDescription() {
		return (EReference) errorModelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorModelType_ExternalFault() {
		return (EReference) errorModelTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorModelType_Failure() {
		return (EReference) errorModelTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorModelType_FaultFailureConnector() {
		return (EReference) errorModelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorModelType_HwTarget() {
		return (EReference) errorModelTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorModelType_InternalFault() {
		return (EReference) errorModelTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorModelType_Part() {
		return (EReference) errorModelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorModelType_ProcessFault() {
		return (EReference) errorModelTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorModelType_Target() {
		return (EReference) errorModelTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getFailureOutPort() {
		return failureOutPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getFaultFailurePort() {
		return faultFailurePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getFaultFailurePort_FunctionTarget() {
		return (EReference) faultFailurePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getFaultFailurePort_HwTarget() {
		return (EReference) faultFailurePortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getFaultFailurePropagationLink() {
		return faultFailurePropagationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getFaultFailurePropagationLink_FromPort() {
		return (EReference) faultFailurePropagationLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getFaultFailurePropagationLink_ImmediatePropagation() {
		return (EAttribute) faultFailurePropagationLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getFaultFailurePropagationLink_ToPort() {
		return (EReference) faultFailurePropagationLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getFaultInPort() {
		return faultInPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getInternalFaultPrototype() {
		return internalFaultPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getInternalFaultPrototype_Base_Class() {
		return (EReference) internalFaultPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getInternalFaultPrototype_Base_Event() {
		return (EReference) internalFaultPrototypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getProcessFaultPrototype() {
		return processFaultPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getProcessFaultPrototype_Base_Event() {
		return (EReference) processFaultPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ElementsPackage theElementsPackage = (ElementsPackage) EPackage.Registry.INSTANCE.getEPackage(ElementsPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage) EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		DatatypesPackage theDatatypesPackage = (DatatypesPackage) EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage) EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		FunctionmodelingPackage theFunctionmodelingPackage = (FunctionmodelingPackage) EPackage.Registry.INSTANCE.getEPackage(FunctionmodelingPackage.eNS_URI);
		HardwaremodelingPackage theHardwaremodelingPackage = (HardwaremodelingPackage) EPackage.Registry.INSTANCE.getEPackage(HardwaremodelingPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		anomalyEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		errorModelPrototypeEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		errorModelPrototypeEClass.getESuperTypes().add(theElementsPackage.getEAPrototype());
		errorModelTypeEClass.getESuperTypes().add(theElementsPackage.getTraceableSpecification());
		errorModelTypeEClass.getESuperTypes().add(theElementsPackage.getEAType());
		faultFailurePropagationLinkEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		faultFailurePropagationLinkEClass.getESuperTypes().add(theElementsPackage.getEAConnector());
		errorBehaviorEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		internalFaultPrototypeEClass.getESuperTypes().add(this.getAnomaly());
		failureOutPortEClass.getESuperTypes().add(this.getFaultFailurePort());
		faultInPortEClass.getESuperTypes().add(this.getFaultFailurePort());
		processFaultPrototypeEClass.getESuperTypes().add(this.getAnomaly());
		faultFailurePortEClass.getESuperTypes().add(this.getAnomaly());
		faultFailurePortEClass.getESuperTypes().add(theElementsPackage.getEAPort());

		// Initialize classes, features, and operations; add parameters
		initEClass(anomalyEClass, Anomaly.class, "Anomaly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnomaly_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, Anomaly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getAnomaly_Type(), theDatatypesPackage.getEADatatype(), null, "type", null, 1, 1, Anomaly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(errorModelPrototypeEClass, ErrorModelPrototype.class, "ErrorModelPrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorModelPrototype_Type(), this.getErrorModelType(), null, "type", null, 1, 1, ErrorModelPrototype.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
				!IS_ORDERED);
		initEReference(getErrorModelPrototype_Target(), theUMLPackage.getNamedElement(), null, "target", null, 1, 1, ErrorModelPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorModelPrototype_FunctionTarget(), theInfrastructurePackage.getErrorModelPrototype_functionTargetInstanceRef(), null, "functionTarget", null, 0, -1, ErrorModelPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorModelPrototype_HwTarget(), theInfrastructurePackage.getErrorModelPrototype_hwTargetInstanceRef(), null, "hwTarget", null, 0, -1, ErrorModelPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(errorModelTypeEClass, ErrorModelType.class, "ErrorModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorModelType_FaultFailureConnector(), this.getFaultFailurePropagationLink(), null, "faultFailureConnector", null, 0, -1, ErrorModelType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorModelType_Part(), this.getErrorModelPrototype(), null, "part", null, 0, -1, ErrorModelType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorModelType_ErrorBehaviorDescription(), this.getErrorBehavior(), null, "errorBehaviorDescription", null, 1, -1, ErrorModelType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorModelType_Failure(), this.getFailureOutPort(), null, "failure", null, 0, -1, ErrorModelType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorModelType_ExternalFault(), this.getFaultInPort(), null, "externalFault", null, 0, -1, ErrorModelType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
				!IS_ORDERED);
		initEReference(getErrorModelType_InternalFault(), this.getInternalFaultPrototype(), null, "internalFault", null, 0, -1, ErrorModelType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorModelType_ProcessFault(), this.getProcessFaultPrototype(), null, "processFault", null, 0, -1, ErrorModelType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorModelType_Target(), theFunctionmodelingPackage.getFunctionType(), null, "target", null, 0, -1, ErrorModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorModelType_HwTarget(), theHardwaremodelingPackage.getHardwareComponentType(), null, "hwTarget", null, 0, -1, ErrorModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(faultFailurePropagationLinkEClass, FaultFailurePropagationLink.class, "FaultFailurePropagationLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFaultFailurePropagationLink_ImmediatePropagation(), theTypesPackage.getBoolean(), "immediatePropagation", "true", 1, 1, FaultFailurePropagationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFaultFailurePropagationLink_ToPort(), theInfrastructurePackage.getFaultFailurePropagationLink_toPortInstanceRef(), null, "toPort", null, 1, 1, FaultFailurePropagationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFaultFailurePropagationLink_FromPort(), theInfrastructurePackage.getFaultFailurePropagationLink_fromPortInstanceRef(), null, "fromPort", null, 1, 1, FaultFailurePropagationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(errorBehaviorEClass, ErrorBehavior.class, "ErrorBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorBehavior_Base_Behavior(), theUMLPackage.getBehavior(), null, "base_Behavior", null, 1, 1, ErrorBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getErrorBehavior_FailureLogic(), theTypesPackage.getString(), "failureLogic", null, 0, 1, ErrorBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getErrorBehavior_Type(), this.getErrorBehaviorKind(), "type", null, 1, 1, ErrorBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorBehavior_InternalFault(), this.getInternalFaultPrototype(), null, "internalFault", null, 0, -1, ErrorBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorBehavior_ExternalFailure(), this.getFailureOutPort(), null, "externalFailure", null, 1, -1, ErrorBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorBehavior_ExternalFault(), this.getFaultInPort(), null, "externalFault", null, 0, -1, ErrorBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getErrorBehavior_ProcessFault(), this.getProcessFaultPrototype(), null, "processFault", null, 0, -1, ErrorBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getErrorBehavior_InternalFailure(), this.getFailureOutPort(), null, "internalFailure", null, 1, 1, ErrorBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(internalFaultPrototypeEClass, InternalFaultPrototype.class, "InternalFaultPrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalFaultPrototype_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, InternalFaultPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getInternalFaultPrototype_Base_Event(), theUMLPackage.getEvent(), null, "base_Event", null, 0, 1, InternalFaultPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(failureOutPortEClass, FailureOutPort.class, "FailureOutPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(faultInPortEClass, FaultInPort.class, "FaultInPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processFaultPrototypeEClass, ProcessFaultPrototype.class, "ProcessFaultPrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessFaultPrototype_Base_Event(), theUMLPackage.getEvent(), null, "base_Event", null, 0, 1, ProcessFaultPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(faultFailurePortEClass, FaultFailurePort.class, "FaultFailurePort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFaultFailurePort_FunctionTarget(), theInfrastructurePackage.getFaultFailurePort_functionTargetInstanceRef(), null, "functionTarget", null, 0, -1, FaultFailurePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFaultFailurePort_HwTarget(), theInfrastructurePackage.getFaultFailurePort_hwTargetInstanceRef(), null, "hwTarget", null, 0, -1, FaultFailurePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(errorBehaviorKindEEnum, ErrorBehaviorKind.class, "ErrorBehaviorKind");
		addEEnumLiteral(errorBehaviorKindEEnum, ErrorBehaviorKind.HIP_HOPS);
		addEEnumLiteral(errorBehaviorKindEEnum, ErrorBehaviorKind.ALTARICA);
		addEEnumLiteral(errorBehaviorKindEEnum, ErrorBehaviorKind.AADL);
		addEEnumLiteral(errorBehaviorKindEEnum, ErrorBehaviorKind.OTHER);
	}

} // ErrormodelPackageImpl
