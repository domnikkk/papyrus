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
package org.eclipse.papyrus.eastadl.timing.events.impl;

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
import org.eclipse.papyrus.eastadl.dependability.errormodel.ErrormodelPackage;
import org.eclipse.papyrus.eastadl.dependability.errormodel.impl.ErrormodelPackageImpl;
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
import org.eclipse.papyrus.eastadl.timing.events.AUTOSAREvent;
import org.eclipse.papyrus.eastadl.timing.events.EventFaultFailure;
import org.eclipse.papyrus.eastadl.timing.events.EventFeatureFlaw;
import org.eclipse.papyrus.eastadl.timing.events.EventFunction;
import org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPort;
import org.eclipse.papyrus.eastadl.timing.events.EventFunctionClientServerPortKind;
import org.eclipse.papyrus.eastadl.timing.events.EventFunctionFlowPort;
import org.eclipse.papyrus.eastadl.timing.events.EventsFactory;
import org.eclipse.papyrus.eastadl.timing.events.EventsPackage;
import org.eclipse.papyrus.eastadl.timing.events.ExternalEvent;
import org.eclipse.papyrus.eastadl.timing.events.ModeEvent;
import org.eclipse.papyrus.eastadl.timing.impl.TimingPackageImpl;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl;
import org.eclipse.papyrus.eastadl.variability.VariabilityPackage;
import org.eclipse.papyrus.eastadl.variability.impl.VariabilityPackageImpl;
import org.eclipse.papyrus.sysml.SysmlPackage;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EventsPackageImpl extends EPackageImpl implements EventsPackage {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eventFunctionFlowPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eventFunctionClientServerPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eventFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass autosarEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eventFaultFailureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eventFeatureFlawEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass externalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass modeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EEnum eventFunctionClientServerPortKindEEnum = null;

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
	 * This method is used to initialize {@link EventsPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EventsPackage init() {
		if (isInited)
			return (EventsPackage) EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI);

		// Obtain or create and register package
		EventsPackageImpl theEventsPackage = (EventsPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EventsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EventsPackageImpl());

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
				.getEPackage(VehiclefeaturemodelingPackage.eNS_URI) : VehiclefeaturemodelingPackage.eINSTANCE);
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
		ErrormodelPackageImpl theErrormodelPackage = (ErrormodelPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(ErrormodelPackage.eNS_URI) instanceof ErrormodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ErrormodelPackage.eNS_URI)
				: ErrormodelPackage.eINSTANCE);
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) instanceof RequirementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI)
				: RequirementsPackage.eINSTANCE);
		UsecasesPackageImpl theUsecasesPackage = (UsecasesPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(UsecasesPackage.eNS_URI) instanceof UsecasesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UsecasesPackage.eNS_URI)
				: UsecasesPackage.eINSTANCE);
		VerificationvalidationPackageImpl theVerificationvalidationPackage = (VerificationvalidationPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(VerificationvalidationPackage.eNS_URI) instanceof VerificationvalidationPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(VerificationvalidationPackage.eNS_URI) : VerificationvalidationPackage.eINSTANCE);
		org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl theRequirementsPackage_1 = (org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage.eNS_URI) instanceof org.eclipse.papyrus.eastadl.requirements.requirements.impl.RequirementsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage.eNS_URI) : org.eclipse.papyrus.eastadl.requirements.requirements.RequirementsPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI)
				: BehaviorPackage.eINSTANCE);
		TimingPackageImpl theTimingPackage = (TimingPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(TimingPackage.eNS_URI) instanceof TimingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimingPackage.eNS_URI) : TimingPackage.eINSTANCE);
		TimingconstraintsPackageImpl theTimingconstraintsPackage = (TimingconstraintsPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(TimingconstraintsPackage.eNS_URI) instanceof TimingconstraintsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TimingconstraintsPackage.eNS_URI) : TimingconstraintsPackage.eINSTANCE);
		EnvironmentPackageImpl theEnvironmentPackage = (EnvironmentPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI) instanceof EnvironmentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvironmentPackage.eNS_URI)
				: EnvironmentPackage.eINSTANCE);
		AnnexPackageImpl theAnnexPackage = (AnnexPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(AnnexPackage.eNS_URI) instanceof AnnexPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnnexPackage.eNS_URI) : AnnexPackage.eINSTANCE);
		NeedsPackageImpl theNeedsPackage = (NeedsPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(NeedsPackage.eNS_URI) instanceof NeedsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NeedsPackage.eNS_URI) : NeedsPackage.eINSTANCE);
		BehaviordescriptionPackageImpl theBehaviordescriptionPackage = (BehaviordescriptionPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(BehaviordescriptionPackage.eNS_URI) instanceof BehaviordescriptionPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(BehaviordescriptionPackage.eNS_URI) : BehaviordescriptionPackage.eINSTANCE);
		AttributequantificationconstraintPackageImpl theAttributequantificationconstraintPackage = (AttributequantificationconstraintPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(AttributequantificationconstraintPackage.eNS_URI) instanceof AttributequantificationconstraintPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(AttributequantificationconstraintPackage.eNS_URI) : AttributequantificationconstraintPackage.eINSTANCE);
		TemporalconstraintPackageImpl theTemporalconstraintPackage = (TemporalconstraintPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(TemporalconstraintPackage.eNS_URI) instanceof TemporalconstraintPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TemporalconstraintPackage.eNS_URI) : TemporalconstraintPackage.eINSTANCE);
		ComputationconstraintPackageImpl theComputationconstraintPackage = (ComputationconstraintPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(ComputationconstraintPackage.eNS_URI) instanceof ComputationconstraintPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ComputationconstraintPackage.eNS_URI) : ComputationconstraintPackage.eINSTANCE);
		GenericconstraintsPackageImpl theGenericconstraintsPackage = (GenericconstraintsPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(GenericconstraintsPackage.eNS_URI) instanceof GenericconstraintsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(GenericconstraintsPackage.eNS_URI) : GenericconstraintsPackage.eINSTANCE);

		// Create package meta-data objects
		theEventsPackage.createPackageContents();
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
		theErrormodelPackage.createPackageContents();
		theRequirementsPackage.createPackageContents();
		theUsecasesPackage.createPackageContents();
		theVerificationvalidationPackage.createPackageContents();
		theRequirementsPackage_1.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theTimingPackage.createPackageContents();
		theTimingconstraintsPackage.createPackageContents();
		theEnvironmentPackage.createPackageContents();
		theAnnexPackage.createPackageContents();
		theNeedsPackage.createPackageContents();
		theBehaviordescriptionPackage.createPackageContents();
		theAttributequantificationconstraintPackage.createPackageContents();
		theTemporalconstraintPackage.createPackageContents();
		theComputationconstraintPackage.createPackageContents();
		theGenericconstraintsPackage.createPackageContents();

		// Initialize created meta-data
		theEventsPackage.initializePackageContents();
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
		theErrormodelPackage.initializePackageContents();
		theRequirementsPackage.initializePackageContents();
		theUsecasesPackage.initializePackageContents();
		theVerificationvalidationPackage.initializePackageContents();
		theRequirementsPackage_1.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theTimingPackage.initializePackageContents();
		theTimingconstraintsPackage.initializePackageContents();
		theEnvironmentPackage.initializePackageContents();
		theAnnexPackage.initializePackageContents();
		theNeedsPackage.initializePackageContents();
		theBehaviordescriptionPackage.initializePackageContents();
		theAttributequantificationconstraintPackage.initializePackageContents();
		theTemporalconstraintPackage.initializePackageContents();
		theComputationconstraintPackage.initializePackageContents();
		theGenericconstraintsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEventsPackage.freeze();


		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EventsPackage.eNS_URI, theEventsPackage);
		return theEventsPackage;
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
	 * @see org.eclipse.papyrus.eastadl.timing.events.EventsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EventsPackageImpl() {
		super(eNS_URI, EventsFactory.eINSTANCE);
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		eventFunctionFlowPortEClass = createEClass(EVENT_FUNCTION_FLOW_PORT);
		createEReference(eventFunctionFlowPortEClass, EVENT_FUNCTION_FLOW_PORT__PORT);

		eventFunctionClientServerPortEClass = createEClass(EVENT_FUNCTION_CLIENT_SERVER_PORT);
		createEAttribute(eventFunctionClientServerPortEClass, EVENT_FUNCTION_CLIENT_SERVER_PORT__EVENT_KIND);
		createEReference(eventFunctionClientServerPortEClass, EVENT_FUNCTION_CLIENT_SERVER_PORT__PORT);

		eventFunctionEClass = createEClass(EVENT_FUNCTION);
		createEReference(eventFunctionEClass, EVENT_FUNCTION__FUNCTION);
		createEReference(eventFunctionEClass, EVENT_FUNCTION__FUNCTION_TYPE);

		autosarEventEClass = createEClass(AUTOSAR_EVENT);
		createEReference(autosarEventEClass, AUTOSAR_EVENT__REF);

		eventFaultFailureEClass = createEClass(EVENT_FAULT_FAILURE);
		createEReference(eventFaultFailureEClass, EVENT_FAULT_FAILURE__FAULT_FAILURE);

		eventFeatureFlawEClass = createEClass(EVENT_FEATURE_FLAW);
		createEReference(eventFeatureFlawEClass, EVENT_FEATURE_FLAW__FEATURE_FLAW);

		externalEventEClass = createEClass(EXTERNAL_EVENT);

		modeEventEClass = createEClass(MODE_EVENT);
		createEReference(modeEventEClass, MODE_EVENT__START);
		createEReference(modeEventEClass, MODE_EVENT__END);

		// Create enums
		eventFunctionClientServerPortKindEEnum = createEEnum(EVENT_FUNCTION_CLIENT_SERVER_PORT_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEventFunction() {
		return eventFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEventFunction_Function() {
		return (EReference) eventFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEventFunction_FunctionType() {
		return (EReference) eventFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getAUTOSAREvent() {
		return autosarEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getAUTOSAREvent_Ref() {
		return (EReference) autosarEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEventFaultFailure() {
		return eventFaultFailureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEventFaultFailure_FaultFailure() {
		return (EReference) eventFaultFailureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEventFeatureFlaw() {
		return eventFeatureFlawEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEventFeatureFlaw_FeatureFlaw() {
		return (EReference) eventFeatureFlawEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getExternalEvent() {
		return externalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getModeEvent() {
		return modeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getModeEvent_Start() {
		return (EReference) modeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getModeEvent_End() {
		return (EReference) modeEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEventFunctionClientServerPort() {
		return eventFunctionClientServerPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEventFunctionClientServerPort_EventKind() {
		return (EAttribute) eventFunctionClientServerPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEventFunctionClientServerPort_Port() {
		return (EReference) eventFunctionClientServerPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEnum getEventFunctionClientServerPortKind() {
		return eventFunctionClientServerPortKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEventFunctionFlowPort() {
		return eventFunctionFlowPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEventFunctionFlowPort_Port() {
		return (EReference) eventFunctionFlowPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EventsFactory getEventsFactory() {
		return (EventsFactory) getEFactoryInstance();
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TimingPackage theTimingPackage = (TimingPackage) EPackage.Registry.INSTANCE.getEPackage(TimingPackage.eNS_URI);
		ValuesPackage theValuesPackage = (ValuesPackage) EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage) EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		FunctionmodelingPackage theFunctionmodelingPackage = (FunctionmodelingPackage) EPackage.Registry.INSTANCE.getEPackage(FunctionmodelingPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage) EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		SafetyconstraintsPackage theSafetyconstraintsPackage = (SafetyconstraintsPackage) EPackage.Registry.INSTANCE.getEPackage(SafetyconstraintsPackage.eNS_URI);
		DependabilityPackage theDependabilityPackage = (DependabilityPackage) EPackage.Registry.INSTANCE.getEPackage(DependabilityPackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage) EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eventFunctionFlowPortEClass.getESuperTypes().add(theTimingPackage.getEvent());
		eventFunctionFlowPortEClass.getESuperTypes().add(theValuesPackage.getEAExpression());
		eventFunctionClientServerPortEClass.getESuperTypes().add(theTimingPackage.getEvent());
		eventFunctionClientServerPortEClass.getESuperTypes().add(theValuesPackage.getEAExpression());
		eventFunctionEClass.getESuperTypes().add(theTimingPackage.getEvent());
		autosarEventEClass.getESuperTypes().add(theTimingPackage.getEvent());
		eventFaultFailureEClass.getESuperTypes().add(theTimingPackage.getEvent());
		eventFeatureFlawEClass.getESuperTypes().add(theTimingPackage.getEvent());
		externalEventEClass.getESuperTypes().add(theTimingPackage.getEvent());
		modeEventEClass.getESuperTypes().add(theTimingPackage.getEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(eventFunctionFlowPortEClass, EventFunctionFlowPort.class, "EventFunctionFlowPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEventFunctionFlowPort_Port(), theInfrastructurePackage.getEventFunctionFlowPortInstanceRef(), null,
				"port", null, 1, 1, EventFunctionFlowPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(eventFunctionClientServerPortEClass, EventFunctionClientServerPort.class, "EventFunctionClientServerPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEventFunctionClientServerPort_EventKind(), this.getEventFunctionClientServerPortKind(),
				"eventKind", null, 1, 1, EventFunctionClientServerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEventFunctionClientServerPort_Port(), theInfrastructurePackage.getEventFunctionClientServerPortInstanceRef(), null,
				"port", null, 1, 1, EventFunctionClientServerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(eventFunctionEClass, EventFunction.class, "EventFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEventFunction_Function(), theInfrastructurePackage.getEventFunctionInstanceRef(), null,
				"function", null, 1, 1, EventFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEventFunction_FunctionType(), theFunctionmodelingPackage.getFunctionType(), null,
				"functionType", null, 0, 1, EventFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(autosarEventEClass, AUTOSAREvent.class, "AUTOSAREvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAUTOSAREvent_Ref(), theUMLPackage.getTimeEvent(), null, "ref", null, 1, 1, AUTOSAREvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(eventFaultFailureEClass, EventFaultFailure.class, "EventFaultFailure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEventFaultFailure_FaultFailure(), theSafetyconstraintsPackage.getFaultFailure(), null,
				"faultFailure", null, 1, 1, EventFaultFailure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(eventFeatureFlawEClass, EventFeatureFlaw.class, "EventFeatureFlaw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEventFeatureFlaw_FeatureFlaw(), theDependabilityPackage.getFeatureFlaw(), null,
				"featureFlaw", null, 1, 1, EventFeatureFlaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(externalEventEClass, ExternalEvent.class, "ExternalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(modeEventEClass, ModeEvent.class, "ModeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getModeEvent_Start(), theBehaviorPackage.getMode(), null, "start", null, 0, -1, ModeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getModeEvent_End(), theBehaviorPackage.getMode(), null, "end", null, 0, -1, ModeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(eventFunctionClientServerPortKindEEnum, EventFunctionClientServerPortKind.class, "EventFunctionClientServerPortKind"); //$NON-NLS-1$
		addEEnumLiteral(eventFunctionClientServerPortKindEEnum, EventFunctionClientServerPortKind.RECEIVED_REQUEST);
		addEEnumLiteral(eventFunctionClientServerPortKindEEnum, EventFunctionClientServerPortKind.SENT_RESPONSE);
		addEEnumLiteral(eventFunctionClientServerPortKindEEnum, EventFunctionClientServerPortKind.SENT_REQUEST);
		addEEnumLiteral(eventFunctionClientServerPortKindEEnum, EventFunctionClientServerPortKind.RECEIVED_RESPONSE);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML"; //$NON-NLS-1$
		addAnnotation(this,
				source,
				new String[] { "originalName", "Events" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

} // EventsPackageImpl
