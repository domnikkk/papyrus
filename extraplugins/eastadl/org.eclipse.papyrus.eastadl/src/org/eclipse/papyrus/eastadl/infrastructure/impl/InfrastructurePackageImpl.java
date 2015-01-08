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
package org.eclipse.papyrus.eastadl.infrastructure.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
import org.eclipse.papyrus.eastadl.infrastructure.AllocatedElementInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_errorModelTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_functionTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.ClampConnectorInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_functionTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.ErrorModelPrototype_hwTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.EventFunctionClientServerPortInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.EventFunctionFlowPortInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.EventFunctionInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_functionTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePort_hwTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_fromPortInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.FaultFailurePropagationLink_toPortInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.FaultFailure_anomalyInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.FunctionConnectorPortInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.HardwareConnectorInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.HardwarePortConnectorInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructureFactory;
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage;
import org.eclipse.papyrus.eastadl.infrastructure.InstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_precedingInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.PrecedenceConstraint_successiveInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedByInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.Realization_realizedInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.RefineInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.SatisfyInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.TargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.VVCaseInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.VVTargetInstanceRef;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl.DatatypesPackageImpl;
import org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage;
import org.eclipse.papyrus.eastadl.infrastructure.elements.impl.ElementsPackageImpl;
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
public class InfrastructurePackageImpl extends EPackageImpl implements InfrastructurePackage {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass instanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass targetInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass functionConnectorPortInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass hardwareConnectorInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass hardwarePortConnectorInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass allocatedElementInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass clampConnectorInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass refineInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass satisfyInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass vvCaseInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass vvTargetInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass realization_realizedInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass realization_realizedByInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eventFunctionInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eventFunctionClientServerPortInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eventFunctionFlowPortInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass precedenceConstraint_precedingInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass precedenceConstraint_successiveInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass errorModelPrototype_functionTargetInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass errorModelPrototype_hwTargetInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass faultFailurePort_hwTargetInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass faultFailurePort_functionTargetInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass faultFailurePropagationLink_fromPortInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass faultFailure_anomalyInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass faultFailurePropagationLink_toPortInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass behaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass behaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass behaviorConstraintPrototype_functionTargetInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass behaviorConstraintPrototype_hardwareComponentTargetInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass behaviorConstraintPrototype_errorModelTargetInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EDataType dummyEDataType = null;

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
	 * This method is used to initialize {@link InfrastructurePackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InfrastructurePackage init() {
		if (isInited)
			return (InfrastructurePackage) EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);

		// Obtain or create and register package
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InfrastructurePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InfrastructurePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SysmlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		EastadlPackageImpl theEastadlPackage = (EastadlPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(EastadlPackage.eNS_URI) instanceof EastadlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EastadlPackage.eNS_URI) : EastadlPackage.eINSTANCE);
		VariabilityPackageImpl theVariabilityPackage = (VariabilityPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(VariabilityPackage.eNS_URI) instanceof VariabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariabilityPackage.eNS_URI)
				: VariabilityPackage.eINSTANCE);
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
		EventsPackageImpl theEventsPackage = (EventsPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) instanceof EventsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) : EventsPackage.eINSTANCE);
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
		theInfrastructurePackage.createPackageContents();
		theEastadlPackage.createPackageContents();
		theVariabilityPackage.createPackageContents();
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
		theInfrastructurePackage.initializePackageContents();
		theEastadlPackage.initializePackageContents();
		theVariabilityPackage.initializePackageContents();
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
		theInfrastructurePackage.freeze();


		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InfrastructurePackage.eNS_URI, theInfrastructurePackage);
		return theInfrastructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getInstanceRef() {
		return instanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getTargetInstanceRef() {
		return targetInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getTargetInstanceRef_AllocationTarget() {
		return (EReference) targetInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getTargetInstanceRef_AllocationTarget_context() {
		return (EReference) targetInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getTargetInstanceRef_IntAttribute() {
		return (EAttribute) targetInstanceRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getFunctionConnectorPortInstanceRef() {
		return functionConnectorPortInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getFunctionConnectorPortInstanceRef_FunctionPort() {
		return (EReference) functionConnectorPortInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getFunctionConnectorPortInstanceRef_FunctionPrototype() {
		return (EReference) functionConnectorPortInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getHardwareConnectorInstanceRef() {
		return hardwareConnectorInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getHardwareConnectorInstanceRef_HardwarePin() {
		return (EReference) hardwareConnectorInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getHardwareConnectorInstanceRef_HardwareComponentPrototype() {
		return (EReference) hardwareConnectorInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getHardwarePortConnectorInstanceRef() {
		return hardwarePortConnectorInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getHardwarePortConnectorInstanceRef_HardwarePort() {
		return (EReference) hardwarePortConnectorInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getHardwarePortConnectorInstanceRef_HardwareComponentPrototype() {
		return (EReference) hardwarePortConnectorInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getAllocatedElementInstanceRef() {
		return allocatedElementInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getAllocatedElementInstanceRef_AllocateableElement() {
		return (EReference) allocatedElementInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getAllocatedElementInstanceRef_AllocateableElement_context() {
		return (EReference) allocatedElementInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getClampConnectorInstanceRef() {
		return clampConnectorInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getClampConnectorInstanceRef_FunctionPort() {
		return (EReference) clampConnectorInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getClampConnectorInstanceRef_FunctionPrototype() {
		return (EReference) clampConnectorInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getRefineInstanceRef() {
		return refineInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getRefineInstanceRef_Identifiable_target() {
		return (EReference) refineInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getRefineInstanceRef_Identifiable_context() {
		return (EReference) refineInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getSatisfyInstanceRef() {
		return satisfyInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getSatisfyInstanceRef_Identifiable_target() {
		return (EReference) satisfyInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getSatisfyInstanceRef_Identifiable_context() {
		return (EReference) satisfyInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getVVCaseInstanceRef() {
		return vvCaseInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getVVCaseInstanceRef_Identifiable_target() {
		return (EReference) vvCaseInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getVVCaseInstanceRef_Identifiable_context() {
		return (EReference) vvCaseInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getVVTargetInstanceRef() {
		return vvTargetInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getVVTargetInstanceRef_Identifiable_target() {
		return (EReference) vvTargetInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getVVTargetInstanceRef_Identifiable_context() {
		return (EReference) vvTargetInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getRealization_realizedInstanceRef() {
		return realization_realizedInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getRealization_realizedInstanceRef_Identifiable_target() {
		return (EReference) realization_realizedInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getRealization_realizedInstanceRef_Identifiable_context() {
		return (EReference) realization_realizedInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getRealization_realizedByInstanceRef() {
		return realization_realizedByInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getRealization_realizedByInstanceRef_Identifiable_target() {
		return (EReference) realization_realizedByInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getRealization_realizedByInstanceRef_Identifiable_context() {
		return (EReference) realization_realizedByInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEventFunctionInstanceRef() {
		return eventFunctionInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEventFunctionInstanceRef_FunctionPrototype_target() {
		return (EReference) eventFunctionInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEventFunctionInstanceRef_FunctionPrototype_context() {
		return (EReference) eventFunctionInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEventFunctionClientServerPortInstanceRef() {
		return eventFunctionClientServerPortInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEventFunctionClientServerPortInstanceRef_FunctionClientServerPort() {
		return (EReference) eventFunctionClientServerPortInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEventFunctionClientServerPortInstanceRef_FunctionPrototype() {
		return (EReference) eventFunctionClientServerPortInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEventFunctionFlowPortInstanceRef() {
		return eventFunctionFlowPortInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEventFunctionFlowPortInstanceRef_FunctionFlowPort() {
		return (EReference) eventFunctionFlowPortInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEventFunctionFlowPortInstanceRef_FunctionPrototype() {
		return (EReference) eventFunctionFlowPortInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getPrecedenceConstraint_precedingInstanceRef() {
		return precedenceConstraint_precedingInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getPrecedenceConstraint_precedingInstanceRef_FunctionPrototype_target() {
		return (EReference) precedenceConstraint_precedingInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getPrecedenceConstraint_precedingInstanceRef_FunctionPrototype_context() {
		return (EReference) precedenceConstraint_precedingInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getPrecedenceConstraint_successiveInstanceRef() {
		return precedenceConstraint_successiveInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getPrecedenceConstraint_successiveInstanceRef_FunctionPrototype_target() {
		return (EReference) precedenceConstraint_successiveInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getPrecedenceConstraint_successiveInstanceRef_FunctionPrototype_context() {
		return (EReference) precedenceConstraint_successiveInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getErrorModelPrototype_functionTargetInstanceRef() {
		return errorModelPrototype_functionTargetInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorModelPrototype_functionTargetInstanceRef_FunctionPrototype() {
		return (EReference) errorModelPrototype_functionTargetInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorModelPrototype_functionTargetInstanceRef_FunctionPrototype_context() {
		return (EReference) errorModelPrototype_functionTargetInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getErrorModelPrototype_hwTargetInstanceRef() {
		return errorModelPrototype_hwTargetInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorModelPrototype_hwTargetInstanceRef_HardwareComponentProtype() {
		return (EReference) errorModelPrototype_hwTargetInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getErrorModelPrototype_hwTargetInstanceRef_HardwareComponentProtype_context() {
		return (EReference) errorModelPrototype_hwTargetInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getFaultFailurePort_hwTargetInstanceRef() {
		return faultFailurePort_hwTargetInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getFaultFailurePort_hwTargetInstanceRef_HardwarePort() {
		return (EReference) faultFailurePort_hwTargetInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getFaultFailurePort_hwTargetInstanceRef_HardwareComponentProtype() {
		return (EReference) faultFailurePort_hwTargetInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getFaultFailurePort_functionTargetInstanceRef() {
		return faultFailurePort_functionTargetInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getFaultFailurePort_functionTargetInstanceRef_FunctionPort() {
		return (EReference) faultFailurePort_functionTargetInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getFaultFailurePort_functionTargetInstanceRef_FunctionPrototype() {
		return (EReference) faultFailurePort_functionTargetInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getFaultFailurePropagationLink_fromPortInstanceRef() {
		return faultFailurePropagationLink_fromPortInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getFaultFailurePropagationLink_fromPortInstanceRef_FaultFairelurePort() {
		return (EReference) faultFailurePropagationLink_fromPortInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getFaultFailurePropagationLink_fromPortInstanceRef_ErrorModelPrototype() {
		return (EReference) faultFailurePropagationLink_fromPortInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getFaultFailure_anomalyInstanceRef() {
		return faultFailure_anomalyInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getFaultFailure_anomalyInstanceRef_Anomaly() {
		return (EReference) faultFailure_anomalyInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getFaultFailure_anomalyInstanceRef_ErrorModelPrototype() {
		return (EReference) faultFailure_anomalyInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getFaultFailurePropagationLink_toPortInstanceRef() {
		return faultFailurePropagationLink_toPortInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getFaultFailurePropagationLink_toPortInstanceRef_FaultFairelurePort() {
		return (EReference) faultFailurePropagationLink_toPortInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getFaultFailurePropagationLink_toPortInstanceRef_ErrorModelPrototype() {
		return (EReference) faultFailurePropagationLink_toPortInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef() {
		return behaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef_FunctionConnector() {
		return (EReference) behaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef_FunctionPrototype() {
		return (EReference) behaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef() {
		return behaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef_HardwareConnector() {
		return (EReference) behaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef_HardwareComponentPrototype() {
		return (EReference) behaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getBehaviorConstraintPrototype_functionTargetInstanceRef() {
		return behaviorConstraintPrototype_functionTargetInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getBehaviorConstraintPrototype_functionTargetInstanceRef_FunctionPrototype_target() {
		return (EReference) behaviorConstraintPrototype_functionTargetInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getBehaviorConstraintPrototype_functionTargetInstanceRef_FunctionPrototype_context() {
		return (EReference) behaviorConstraintPrototype_functionTargetInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef() {
		return behaviorConstraintPrototype_hardwareComponentTargetInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef_HardwareComponentProtype_target() {
		return (EReference) behaviorConstraintPrototype_hardwareComponentTargetInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef_HardwareComponentPrototype_context() {
		return (EReference) behaviorConstraintPrototype_hardwareComponentTargetInstanceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getBehaviorConstraintPrototype_errorModelTargetInstanceRef() {
		return behaviorConstraintPrototype_errorModelTargetInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getBehaviorConstraintPrototype_errorModelTargetInstanceRef_ErrorModelPrototype_target() {
		return (EReference) behaviorConstraintPrototype_errorModelTargetInstanceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getBehaviorConstraintPrototype_errorModelTargetInstanceRef_ErrorModelPrototype_context() {
		return (EReference) behaviorConstraintPrototype_errorModelTargetInstanceRefEClass.getEStructuralFeatures().get(1);
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
	 * @see org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InfrastructurePackageImpl() {
		super(eNS_URI, InfrastructureFactory.eINSTANCE);
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
		instanceRefEClass = createEClass(INSTANCE_REF);

		targetInstanceRefEClass = createEClass(TARGET_INSTANCE_REF);
		createEReference(targetInstanceRefEClass, TARGET_INSTANCE_REF__ALLOCATION_TARGET);
		createEReference(targetInstanceRefEClass, TARGET_INSTANCE_REF__ALLOCATION_TARGET_CONTEXT);
		createEAttribute(targetInstanceRefEClass, TARGET_INSTANCE_REF__INT_ATTRIBUTE);

		functionConnectorPortInstanceRefEClass = createEClass(FUNCTION_CONNECTOR_PORT_INSTANCE_REF);
		createEReference(functionConnectorPortInstanceRefEClass, FUNCTION_CONNECTOR_PORT_INSTANCE_REF__FUNCTION_PORT);
		createEReference(functionConnectorPortInstanceRefEClass, FUNCTION_CONNECTOR_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE);

		hardwareConnectorInstanceRefEClass = createEClass(HARDWARE_CONNECTOR_INSTANCE_REF);
		createEReference(hardwareConnectorInstanceRefEClass, HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_PIN);
		createEReference(hardwareConnectorInstanceRefEClass, HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE);

		hardwarePortConnectorInstanceRefEClass = createEClass(HARDWARE_PORT_CONNECTOR_INSTANCE_REF);
		createEReference(hardwarePortConnectorInstanceRefEClass, HARDWARE_PORT_CONNECTOR_INSTANCE_REF__HARDWARE_PORT);
		createEReference(hardwarePortConnectorInstanceRefEClass, HARDWARE_PORT_CONNECTOR_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE);

		allocatedElementInstanceRefEClass = createEClass(ALLOCATED_ELEMENT_INSTANCE_REF);
		createEReference(allocatedElementInstanceRefEClass, ALLOCATED_ELEMENT_INSTANCE_REF__ALLOCATEABLE_ELEMENT);
		createEReference(allocatedElementInstanceRefEClass, ALLOCATED_ELEMENT_INSTANCE_REF__ALLOCATEABLE_ELEMENT_CONTEXT);

		clampConnectorInstanceRefEClass = createEClass(CLAMP_CONNECTOR_INSTANCE_REF);
		createEReference(clampConnectorInstanceRefEClass, CLAMP_CONNECTOR_INSTANCE_REF__FUNCTION_PORT);
		createEReference(clampConnectorInstanceRefEClass, CLAMP_CONNECTOR_INSTANCE_REF__FUNCTION_PROTOTYPE);

		refineInstanceRefEClass = createEClass(REFINE_INSTANCE_REF);
		createEReference(refineInstanceRefEClass, REFINE_INSTANCE_REF__IDENTIFIABLE_TARGET);
		createEReference(refineInstanceRefEClass, REFINE_INSTANCE_REF__IDENTIFIABLE_CONTEXT);

		satisfyInstanceRefEClass = createEClass(SATISFY_INSTANCE_REF);
		createEReference(satisfyInstanceRefEClass, SATISFY_INSTANCE_REF__IDENTIFIABLE_TARGET);
		createEReference(satisfyInstanceRefEClass, SATISFY_INSTANCE_REF__IDENTIFIABLE_CONTEXT);

		vvCaseInstanceRefEClass = createEClass(VV_CASE_INSTANCE_REF);
		createEReference(vvCaseInstanceRefEClass, VV_CASE_INSTANCE_REF__IDENTIFIABLE_TARGET);
		createEReference(vvCaseInstanceRefEClass, VV_CASE_INSTANCE_REF__IDENTIFIABLE_CONTEXT);

		vvTargetInstanceRefEClass = createEClass(VV_TARGET_INSTANCE_REF);
		createEReference(vvTargetInstanceRefEClass, VV_TARGET_INSTANCE_REF__IDENTIFIABLE_TARGET);
		createEReference(vvTargetInstanceRefEClass, VV_TARGET_INSTANCE_REF__IDENTIFIABLE_CONTEXT);

		realization_realizedInstanceRefEClass = createEClass(REALIZATION_REALIZED_INSTANCE_REF);
		createEReference(realization_realizedInstanceRefEClass, REALIZATION_REALIZED_INSTANCE_REF__IDENTIFIABLE_TARGET);
		createEReference(realization_realizedInstanceRefEClass, REALIZATION_REALIZED_INSTANCE_REF__IDENTIFIABLE_CONTEXT);

		realization_realizedByInstanceRefEClass = createEClass(REALIZATION_REALIZED_BY_INSTANCE_REF);
		createEReference(realization_realizedByInstanceRefEClass, REALIZATION_REALIZED_BY_INSTANCE_REF__IDENTIFIABLE_TARGET);
		createEReference(realization_realizedByInstanceRefEClass, REALIZATION_REALIZED_BY_INSTANCE_REF__IDENTIFIABLE_CONTEXT);

		eventFunctionInstanceRefEClass = createEClass(EVENT_FUNCTION_INSTANCE_REF);
		createEReference(eventFunctionInstanceRefEClass, EVENT_FUNCTION_INSTANCE_REF__FUNCTION_PROTOTYPE_TARGET);
		createEReference(eventFunctionInstanceRefEClass, EVENT_FUNCTION_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT);

		eventFunctionClientServerPortInstanceRefEClass = createEClass(EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF);
		createEReference(eventFunctionClientServerPortInstanceRefEClass, EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF__FUNCTION_CLIENT_SERVER_PORT);
		createEReference(eventFunctionClientServerPortInstanceRefEClass, EVENT_FUNCTION_CLIENT_SERVER_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE);

		eventFunctionFlowPortInstanceRefEClass = createEClass(EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF);
		createEReference(eventFunctionFlowPortInstanceRefEClass, EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF__FUNCTION_FLOW_PORT);
		createEReference(eventFunctionFlowPortInstanceRefEClass, EVENT_FUNCTION_FLOW_PORT_INSTANCE_REF__FUNCTION_PROTOTYPE);

		precedenceConstraint_precedingInstanceRefEClass = createEClass(PRECEDENCE_CONSTRAINT_PRECEDING_INSTANCE_REF);
		createEReference(precedenceConstraint_precedingInstanceRefEClass, PRECEDENCE_CONSTRAINT_PRECEDING_INSTANCE_REF__FUNCTION_PROTOTYPE_TARGET);
		createEReference(precedenceConstraint_precedingInstanceRefEClass, PRECEDENCE_CONSTRAINT_PRECEDING_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT);

		precedenceConstraint_successiveInstanceRefEClass = createEClass(PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF);
		createEReference(precedenceConstraint_successiveInstanceRefEClass, PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF__FUNCTION_PROTOTYPE_TARGET);
		createEReference(precedenceConstraint_successiveInstanceRefEClass, PRECEDENCE_CONSTRAINT_SUCCESSIVE_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT);

		errorModelPrototype_functionTargetInstanceRefEClass = createEClass(ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF);
		createEReference(errorModelPrototype_functionTargetInstanceRefEClass, ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE);
		createEReference(errorModelPrototype_functionTargetInstanceRefEClass, ERROR_MODEL_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT);

		errorModelPrototype_hwTargetInstanceRefEClass = createEClass(ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF);
		createEReference(errorModelPrototype_hwTargetInstanceRefEClass, ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE);
		createEReference(errorModelPrototype_hwTargetInstanceRefEClass, ERROR_MODEL_PROTOTYPE_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE_CONTEXT);

		faultFailurePort_hwTargetInstanceRefEClass = createEClass(FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF);
		createEReference(faultFailurePort_hwTargetInstanceRefEClass, FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF__HARDWARE_PORT);
		createEReference(faultFailurePort_hwTargetInstanceRefEClass, FAULT_FAILURE_PORT_HW_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE);

		faultFailurePort_functionTargetInstanceRefEClass = createEClass(FAULT_FAILURE_PORT_FUNCTION_TARGET_INSTANCE_REF);
		createEReference(faultFailurePort_functionTargetInstanceRefEClass, FAULT_FAILURE_PORT_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PORT);
		createEReference(faultFailurePort_functionTargetInstanceRefEClass, FAULT_FAILURE_PORT_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE);

		faultFailurePropagationLink_fromPortInstanceRefEClass = createEClass(FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF);
		createEReference(faultFailurePropagationLink_fromPortInstanceRefEClass, FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF__FAULT_FAIRELURE_PORT);
		createEReference(faultFailurePropagationLink_fromPortInstanceRefEClass, FAULT_FAILURE_PROPAGATION_LINK_FROM_PORT_INSTANCE_REF__ERROR_MODEL_PROTOTYPE);

		faultFailure_anomalyInstanceRefEClass = createEClass(FAULT_FAILURE_ANOMALY_INSTANCE_REF);
		createEReference(faultFailure_anomalyInstanceRefEClass, FAULT_FAILURE_ANOMALY_INSTANCE_REF__ANOMALY);
		createEReference(faultFailure_anomalyInstanceRefEClass, FAULT_FAILURE_ANOMALY_INSTANCE_REF__ERROR_MODEL_PROTOTYPE);

		faultFailurePropagationLink_toPortInstanceRefEClass = createEClass(FAULT_FAILURE_PROPAGATION_LINK_TO_PORT_INSTANCE_REF);
		createEReference(faultFailurePropagationLink_toPortInstanceRefEClass, FAULT_FAILURE_PROPAGATION_LINK_TO_PORT_INSTANCE_REF__FAULT_FAIRELURE_PORT);
		createEReference(faultFailurePropagationLink_toPortInstanceRefEClass, FAULT_FAILURE_PROPAGATION_LINK_TO_PORT_INSTANCE_REF__ERROR_MODEL_PROTOTYPE);

		behaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefEClass = createEClass(BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF);
		createEReference(behaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefEClass, BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF__FUNCTION_CONNECTOR);
		createEReference(behaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefEClass, BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_FUNCTION_CONNECTOR_INSTANCE_REF__FUNCTION_PROTOTYPE);

		behaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefEClass = createEClass(BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF);
		createEReference(behaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefEClass, BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_CONNECTOR);
		createEReference(behaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefEClass, BEHAVIOR_CONSTRAINT_INTERNAL_BINDING_THROUGH_HARDWARE_CONNECTOR_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE);

		behaviorConstraintPrototype_functionTargetInstanceRefEClass = createEClass(BEHAVIOR_CONSTRAINT_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF);
		createEReference(behaviorConstraintPrototype_functionTargetInstanceRefEClass, BEHAVIOR_CONSTRAINT_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE_TARGET);
		createEReference(behaviorConstraintPrototype_functionTargetInstanceRefEClass, BEHAVIOR_CONSTRAINT_PROTOTYPE_FUNCTION_TARGET_INSTANCE_REF__FUNCTION_PROTOTYPE_CONTEXT);

		behaviorConstraintPrototype_hardwareComponentTargetInstanceRefEClass = createEClass(BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF);
		createEReference(behaviorConstraintPrototype_hardwareComponentTargetInstanceRefEClass, BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTYPE_TARGET);
		createEReference(behaviorConstraintPrototype_hardwareComponentTargetInstanceRefEClass, BEHAVIOR_CONSTRAINT_PROTOTYPE_HARDWARE_COMPONENT_TARGET_INSTANCE_REF__HARDWARE_COMPONENT_PROTOTYPE_CONTEXT);

		behaviorConstraintPrototype_errorModelTargetInstanceRefEClass = createEClass(BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF);
		createEReference(behaviorConstraintPrototype_errorModelTargetInstanceRefEClass, BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF__ERROR_MODEL_PROTOTYPE_TARGET);
		createEReference(behaviorConstraintPrototype_errorModelTargetInstanceRefEClass, BEHAVIOR_CONSTRAINT_PROTOTYPE_ERROR_MODEL_TARGET_INSTANCE_REF__ERROR_MODEL_PROTOTYPE_CONTEXT);

		// Create data types
		dummyEDataType = createEDataType(DUMMY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EDataType getDummy() {
		return dummyEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public InfrastructureFactory getInfrastructureFactory() {
		return (InfrastructureFactory) getEFactoryInstance();
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
		DatatypesPackage theDatatypesPackage = (DatatypesPackage) EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);
		UserattributesPackage theUserattributesPackage = (UserattributesPackage) EPackage.Registry.INSTANCE.getEPackage(UserattributesPackage.eNS_URI);
		ValuesPackage theValuesPackage = (ValuesPackage) EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
		ElementsPackage theElementsPackage = (ElementsPackage) EPackage.Registry.INSTANCE.getEPackage(ElementsPackage.eNS_URI);
		HardwaremodelingPackage theHardwaremodelingPackage = (HardwaremodelingPackage) EPackage.Registry.INSTANCE.getEPackage(HardwaremodelingPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		FunctionmodelingPackage theFunctionmodelingPackage = (FunctionmodelingPackage) EPackage.Registry.INSTANCE.getEPackage(FunctionmodelingPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage) EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		ErrormodelPackage theErrormodelPackage = (ErrormodelPackage) EPackage.Registry.INSTANCE.getEPackage(ErrormodelPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDatatypesPackage);
		getESubpackages().add(theUserattributesPackage);
		getESubpackages().add(theValuesPackage);
		getESubpackages().add(theElementsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		targetInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		functionConnectorPortInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		hardwareConnectorInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		hardwarePortConnectorInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		allocatedElementInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		clampConnectorInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		refineInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		satisfyInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		vvCaseInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		vvTargetInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		realization_realizedInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		realization_realizedByInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		eventFunctionInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		eventFunctionClientServerPortInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		eventFunctionFlowPortInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		precedenceConstraint_precedingInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		precedenceConstraint_successiveInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		errorModelPrototype_functionTargetInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		errorModelPrototype_hwTargetInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		faultFailurePort_hwTargetInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		faultFailurePort_functionTargetInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		faultFailurePropagationLink_fromPortInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		faultFailure_anomalyInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		faultFailurePropagationLink_toPortInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		behaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		behaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		behaviorConstraintPrototype_functionTargetInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		behaviorConstraintPrototype_hardwareComponentTargetInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());
		behaviorConstraintPrototype_errorModelTargetInstanceRefEClass.getESuperTypes().add(this.getInstanceRef());

		// Initialize classes, features, and operations; add parameters
		initEClass(instanceRefEClass, InstanceRef.class, "InstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(targetInstanceRefEClass, TargetInstanceRef.class, "TargetInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTargetInstanceRef_AllocationTarget(), theHardwaremodelingPackage.getAllocationTarget(), null,
				"allocationTarget", null, 1, 1, TargetInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getTargetInstanceRef_AllocationTarget_context(), theHardwaremodelingPackage.getAllocationTarget(), null,
				"allocationTarget_context", null, 0, -1, TargetInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getTargetInstanceRef_IntAttribute(), theTypesPackage.getInteger(), "intAttribute", null, 1, 1, TargetInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(functionConnectorPortInstanceRefEClass, FunctionConnectorPortInstanceRef.class, "FunctionConnectorPortInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFunctionConnectorPortInstanceRef_FunctionPort(), theFunctionmodelingPackage.getFunctionPort(), null,
				"functionPort", null, 1, 1, FunctionConnectorPortInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getFunctionConnectorPortInstanceRef_FunctionPrototype(), theFunctionmodelingPackage.getFunctionPrototype(), null,
				"functionPrototype", null, 1, 1, FunctionConnectorPortInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(hardwareConnectorInstanceRefEClass, HardwareConnectorInstanceRef.class, "HardwareConnectorInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getHardwareConnectorInstanceRef_HardwarePin(), theHardwaremodelingPackage.getHardwarePin(), null,
				"hardwarePin", null, 1, 1, HardwareConnectorInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getHardwareConnectorInstanceRef_HardwareComponentPrototype(), theHardwaremodelingPackage.getHardwareComponentPrototype(), null,
				"hardwareComponentPrototype", null, 1, 1, HardwareConnectorInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(hardwarePortConnectorInstanceRefEClass, HardwarePortConnectorInstanceRef.class, "HardwarePortConnectorInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getHardwarePortConnectorInstanceRef_HardwarePort(), theHardwaremodelingPackage.getHardwarePort(), null,
				"hardwarePort", null, 1, 1, HardwarePortConnectorInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getHardwarePortConnectorInstanceRef_HardwareComponentPrototype(), theHardwaremodelingPackage.getHardwareComponentPrototype(), null,
				"hardwareComponentPrototype", null, 1, 1, HardwarePortConnectorInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(allocatedElementInstanceRefEClass, AllocatedElementInstanceRef.class, "AllocatedElementInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAllocatedElementInstanceRef_AllocateableElement(), theFunctionmodelingPackage.getAllocateableElement(), null,
				"allocateableElement", null, 1, 1, AllocatedElementInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAllocatedElementInstanceRef_AllocateableElement_context(), theFunctionmodelingPackage.getAllocateableElement(), null,
				"allocateableElement_context", null, 0, -1, AllocatedElementInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(clampConnectorInstanceRefEClass, ClampConnectorInstanceRef.class, "ClampConnectorInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getClampConnectorInstanceRef_FunctionPort(), theFunctionmodelingPackage.getFunctionPort(), null,
				"functionPort", null, 1, 1, ClampConnectorInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getClampConnectorInstanceRef_FunctionPrototype(), theFunctionmodelingPackage.getFunctionPrototype(), null,
				"functionPrototype", null, 0, -1, ClampConnectorInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(refineInstanceRefEClass, RefineInstanceRef.class, "RefineInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRefineInstanceRef_Identifiable_target(), theUMLPackage.getNamedElement(), null,
				"identifiable_target", null, 1, 1, RefineInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRefineInstanceRef_Identifiable_context(), theUMLPackage.getNamedElement(), null,
				"identifiable_context", null, 0, -1, RefineInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(satisfyInstanceRefEClass, SatisfyInstanceRef.class, "SatisfyInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSatisfyInstanceRef_Identifiable_target(), theUMLPackage.getNamedElement(), null,
				"identifiable_target", null, 1, 1, SatisfyInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getSatisfyInstanceRef_Identifiable_context(), theUMLPackage.getNamedElement(), null,
				"identifiable_context", null, 0, -1, SatisfyInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(vvCaseInstanceRefEClass, VVCaseInstanceRef.class, "VVCaseInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getVVCaseInstanceRef_Identifiable_target(), theUMLPackage.getNamedElement(), null,
				"identifiable_target", null, 1, 1, VVCaseInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getVVCaseInstanceRef_Identifiable_context(), theUMLPackage.getNamedElement(), null,
				"identifiable_context", null, 0, -1, VVCaseInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(vvTargetInstanceRefEClass, VVTargetInstanceRef.class, "VVTargetInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getVVTargetInstanceRef_Identifiable_target(), theUMLPackage.getNamedElement(), null,
				"identifiable_target", null, 1, 1, VVTargetInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getVVTargetInstanceRef_Identifiable_context(), theUMLPackage.getNamedElement(), null,
				"identifiable_context", null, 0, -1, VVTargetInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(realization_realizedInstanceRefEClass, Realization_realizedInstanceRef.class, "Realization_realizedInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRealization_realizedInstanceRef_Identifiable_target(), theUMLPackage.getNamedElement(), null,
				"identifiable_target", null, 1, 1, Realization_realizedInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRealization_realizedInstanceRef_Identifiable_context(), theUMLPackage.getNamedElement(), null,
				"identifiable_context", null, 0, -1, Realization_realizedInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(realization_realizedByInstanceRefEClass, Realization_realizedByInstanceRef.class, "Realization_realizedByInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRealization_realizedByInstanceRef_Identifiable_target(), theUMLPackage.getNamedElement(), null,
				"identifiable_target", null, 1, 1, Realization_realizedByInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRealization_realizedByInstanceRef_Identifiable_context(), theUMLPackage.getNamedElement(), null,
				"identifiable_context", null, 0, -1, Realization_realizedByInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(eventFunctionInstanceRefEClass, EventFunctionInstanceRef.class, "EventFunctionInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEventFunctionInstanceRef_FunctionPrototype_target(), theFunctionmodelingPackage.getFunctionPrototype(), null,
				"functionPrototype_target", null, 1, 1, EventFunctionInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEventFunctionInstanceRef_FunctionPrototype_context(), theFunctionmodelingPackage.getFunctionPrototype(), null,
				"functionPrototype_context", null, 0, -1, EventFunctionInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(eventFunctionClientServerPortInstanceRefEClass, EventFunctionClientServerPortInstanceRef.class, "EventFunctionClientServerPortInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEventFunctionClientServerPortInstanceRef_FunctionClientServerPort(), theFunctionmodelingPackage.getFunctionClientServerPort(), null,
				"functionClientServerPort", null, 1, 1, EventFunctionClientServerPortInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEventFunctionClientServerPortInstanceRef_FunctionPrototype(), theFunctionmodelingPackage.getFunctionPrototype(), null,
				"functionPrototype", null, 0, -1, EventFunctionClientServerPortInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(eventFunctionFlowPortInstanceRefEClass, EventFunctionFlowPortInstanceRef.class, "EventFunctionFlowPortInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEventFunctionFlowPortInstanceRef_FunctionFlowPort(), theFunctionmodelingPackage.getFunctionFlowPort(), null,
				"functionFlowPort", null, 1, 1, EventFunctionFlowPortInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEventFunctionFlowPortInstanceRef_FunctionPrototype(), theFunctionmodelingPackage.getFunctionPrototype(), null,
				"functionPrototype", null, 0, -1, EventFunctionFlowPortInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(precedenceConstraint_precedingInstanceRefEClass, PrecedenceConstraint_precedingInstanceRef.class, "PrecedenceConstraint_precedingInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPrecedenceConstraint_precedingInstanceRef_FunctionPrototype_target(), theFunctionmodelingPackage.getFunctionPrototype(), null,
				"functionPrototype_target", null, 1, 1, PrecedenceConstraint_precedingInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPrecedenceConstraint_precedingInstanceRef_FunctionPrototype_context(), theFunctionmodelingPackage.getFunctionPrototype(), null,
				"functionPrototype_context", null, 0, -1, PrecedenceConstraint_precedingInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(precedenceConstraint_successiveInstanceRefEClass, PrecedenceConstraint_successiveInstanceRef.class, "PrecedenceConstraint_successiveInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPrecedenceConstraint_successiveInstanceRef_FunctionPrototype_target(), theFunctionmodelingPackage.getFunctionPrototype(), null,
				"functionPrototype_target", null, 1, 1, PrecedenceConstraint_successiveInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPrecedenceConstraint_successiveInstanceRef_FunctionPrototype_context(), theFunctionmodelingPackage.getFunctionPrototype(), null,
				"functionPrototype_context", null, 0, -1, PrecedenceConstraint_successiveInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(errorModelPrototype_functionTargetInstanceRefEClass, ErrorModelPrototype_functionTargetInstanceRef.class, "ErrorModelPrototype_functionTargetInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getErrorModelPrototype_functionTargetInstanceRef_FunctionPrototype(), theFunctionmodelingPackage.getFunctionPrototype(), null,
				"functionPrototype", null, 1, 1, ErrorModelPrototype_functionTargetInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getErrorModelPrototype_functionTargetInstanceRef_FunctionPrototype_context(), theFunctionmodelingPackage.getFunctionPrototype(), null,
				"functionPrototype_context", null, 0, -1, ErrorModelPrototype_functionTargetInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(errorModelPrototype_hwTargetInstanceRefEClass, ErrorModelPrototype_hwTargetInstanceRef.class, "ErrorModelPrototype_hwTargetInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getErrorModelPrototype_hwTargetInstanceRef_HardwareComponentProtype(), theHardwaremodelingPackage.getHardwareComponentPrototype(), null,
				"hardwareComponentProtype", null, 1, 1, ErrorModelPrototype_hwTargetInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getErrorModelPrototype_hwTargetInstanceRef_HardwareComponentProtype_context(), theHardwaremodelingPackage.getHardwareComponentPrototype(), null,
				"hardwareComponentProtype_context", null, 0, -1, ErrorModelPrototype_hwTargetInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(faultFailurePort_hwTargetInstanceRefEClass, FaultFailurePort_hwTargetInstanceRef.class, "FaultFailurePort_hwTargetInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFaultFailurePort_hwTargetInstanceRef_HardwarePort(), theHardwaremodelingPackage.getHardwarePin(), null,
				"hardwarePort", null, 1, 1, FaultFailurePort_hwTargetInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getFaultFailurePort_hwTargetInstanceRef_HardwareComponentProtype(), theHardwaremodelingPackage.getHardwareComponentPrototype(), null,
				"hardwareComponentProtype", null, 0, -1, FaultFailurePort_hwTargetInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(faultFailurePort_functionTargetInstanceRefEClass, FaultFailurePort_functionTargetInstanceRef.class, "FaultFailurePort_functionTargetInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFaultFailurePort_functionTargetInstanceRef_FunctionPort(), theFunctionmodelingPackage.getFunctionPort(), null,
				"functionPort", null, 1, 1, FaultFailurePort_functionTargetInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getFaultFailurePort_functionTargetInstanceRef_FunctionPrototype(), theFunctionmodelingPackage.getFunctionPrototype(), null,
				"functionPrototype", null, 0, -1, FaultFailurePort_functionTargetInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(faultFailurePropagationLink_fromPortInstanceRefEClass, FaultFailurePropagationLink_fromPortInstanceRef.class, "FaultFailurePropagationLink_fromPortInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFaultFailurePropagationLink_fromPortInstanceRef_FaultFairelurePort(), theErrormodelPackage.getFaultFailurePort(), null,
				"faultFairelurePort", null, 1, 1, FaultFailurePropagationLink_fromPortInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getFaultFailurePropagationLink_fromPortInstanceRef_ErrorModelPrototype(), theErrormodelPackage.getErrorModelPrototype(), null,
				"errorModelPrototype", null, 0, -1, FaultFailurePropagationLink_fromPortInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(faultFailure_anomalyInstanceRefEClass, FaultFailure_anomalyInstanceRef.class, "FaultFailure_anomalyInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFaultFailure_anomalyInstanceRef_Anomaly(), theErrormodelPackage.getAnomaly(), null,
				"anomaly", null, 1, 1, FaultFailure_anomalyInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getFaultFailure_anomalyInstanceRef_ErrorModelPrototype(), theErrormodelPackage.getErrorModelPrototype(), null,
				"errorModelPrototype", null, 0, -1, FaultFailure_anomalyInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(faultFailurePropagationLink_toPortInstanceRefEClass, FaultFailurePropagationLink_toPortInstanceRef.class, "FaultFailurePropagationLink_toPortInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFaultFailurePropagationLink_toPortInstanceRef_FaultFairelurePort(), theErrormodelPackage.getFaultFailurePort(), null,
				"faultFairelurePort", null, 1, 1, FaultFailurePropagationLink_toPortInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getFaultFailurePropagationLink_toPortInstanceRef_ErrorModelPrototype(), theErrormodelPackage.getErrorModelPrototype(), null,
				"errorModelPrototype", null, 0, -1, FaultFailurePropagationLink_toPortInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(behaviorConstraintInternalBinding_throughFunctionConnectorInstanceRefEClass, BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef.class,
				"BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef_FunctionConnector(), theFunctionmodelingPackage.getFunctionConnector(), null,
				"functionConnector", null, 1, 1, BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef_FunctionPrototype(), theFunctionmodelingPackage.getFunctionPrototype(), null,
				"functionPrototype", null, 0, -1, BehaviorConstraintInternalBinding_throughFunctionConnectorInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(behaviorConstraintInternalBinding_throughHardwareConnectorInstanceRefEClass, BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef.class,
				"BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef_HardwareConnector(), theHardwaremodelingPackage.getHardwareConnector(), null,
				"hardwareConnector", null, 1, 1, BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getBehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef_HardwareComponentPrototype(),
				theHardwaremodelingPackage.getHardwareComponentPrototype(),
				null,
				"hardwareComponentPrototype", null, 0, -1, BehaviorConstraintInternalBinding_throughHardwareConnectorInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(behaviorConstraintPrototype_functionTargetInstanceRefEClass, BehaviorConstraintPrototype_functionTargetInstanceRef.class, "BehaviorConstraintPrototype_functionTargetInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBehaviorConstraintPrototype_functionTargetInstanceRef_FunctionPrototype_target(), theFunctionmodelingPackage.getFunctionPrototype(), null,
				"functionPrototype_target", null, 1, 1, BehaviorConstraintPrototype_functionTargetInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehaviorConstraintPrototype_functionTargetInstanceRef_FunctionPrototype_context(), theFunctionmodelingPackage.getFunctionPrototype(), null,
				"functionPrototype_context", null, 0, -1, BehaviorConstraintPrototype_functionTargetInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(behaviorConstraintPrototype_hardwareComponentTargetInstanceRefEClass, BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef.class,
				"BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef_HardwareComponentProtype_target(),
				theHardwaremodelingPackage.getHardwareComponentPrototype(),
				null,
				"hardwareComponentProtype_target", null, 1, 1, BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getBehaviorConstraintPrototype_hardwareComponentTargetInstanceRef_HardwareComponentPrototype_context(),
				theHardwaremodelingPackage.getHardwareComponentPrototype(),
				null,
				"hardwareComponentPrototype_context", null, 0, -1, BehaviorConstraintPrototype_hardwareComponentTargetInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(behaviorConstraintPrototype_errorModelTargetInstanceRefEClass, BehaviorConstraintPrototype_errorModelTargetInstanceRef.class,
				"BehaviorConstraintPrototype_errorModelTargetInstanceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBehaviorConstraintPrototype_errorModelTargetInstanceRef_ErrorModelPrototype_target(), theErrormodelPackage.getErrorModelPrototype(), null,
				"errorModelPrototype_target", null, 1, 1, BehaviorConstraintPrototype_errorModelTargetInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getBehaviorConstraintPrototype_errorModelTargetInstanceRef_ErrorModelPrototype_context(), theErrormodelPackage.getErrorModelPrototype(), null,
				"errorModelPrototype_context", null, 0, -1, BehaviorConstraintPrototype_errorModelTargetInstanceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		// Initialize data types
		initEDataType(dummyEDataType, String.class, "Dummy", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

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
				new String[] { "originalName", "Infrastructure" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

} // InfrastructurePackageImpl
