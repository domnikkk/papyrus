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
package org.eclipse.papyrus.eastadl.variability.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
import org.eclipse.papyrus.eastadl.timing.events.EventsPackage;
import org.eclipse.papyrus.eastadl.timing.events.impl.EventsPackageImpl;
import org.eclipse.papyrus.eastadl.timing.impl.TimingPackageImpl;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.TimingconstraintsPackage;
import org.eclipse.papyrus.eastadl.timing.timingconstraints.impl.TimingconstraintsPackageImpl;
import org.eclipse.papyrus.eastadl.variability.ConfigurableContainer;
import org.eclipse.papyrus.eastadl.variability.ConfigurationDecision;
import org.eclipse.papyrus.eastadl.variability.ConfigurationDecisionFolder;
import org.eclipse.papyrus.eastadl.variability.ConfigurationDecisionModel;
import org.eclipse.papyrus.eastadl.variability.ConfigurationDecisionModelEntry;
import org.eclipse.papyrus.eastadl.variability.ContainerConfiguration;
import org.eclipse.papyrus.eastadl.variability.FeatureConfiguration;
import org.eclipse.papyrus.eastadl.variability.InternalBinding;
import org.eclipse.papyrus.eastadl.variability.PrivateContent;
import org.eclipse.papyrus.eastadl.variability.ReuseMetaInformation;
import org.eclipse.papyrus.eastadl.variability.SelectionCriterion;
import org.eclipse.papyrus.eastadl.variability.Variability;
import org.eclipse.papyrus.eastadl.variability.VariabilityFactory;
import org.eclipse.papyrus.eastadl.variability.VariabilityPackage;
import org.eclipse.papyrus.eastadl.variability.VariableElement;
import org.eclipse.papyrus.eastadl.variability.VariationGroup;
import org.eclipse.papyrus.eastadl.variability.VehicleLevelBinding;
import org.eclipse.papyrus.sysml.SysmlPackage;
import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.uml.UMLPackage;


/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class VariabilityPackageImpl extends EPackageImpl implements VariabilityPackage {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>
	 * This method is used to initialize {@link VariabilityPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VariabilityPackage init() {
		if (isInited)
			return (VariabilityPackage) EPackage.Registry.INSTANCE.getEPackage(VariabilityPackage.eNS_URI);

		// Obtain or create and register package
		VariabilityPackageImpl theVariabilityPackage = (VariabilityPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VariabilityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VariabilityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SysmlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		EastadlPackageImpl theEastadlPackage = (EastadlPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(EastadlPackage.eNS_URI) instanceof EastadlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EastadlPackage.eNS_URI) : EastadlPackage.eINSTANCE);
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
		theVariabilityPackage.createPackageContents();
		theEastadlPackage.createPackageContents();
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
		theVariabilityPackage.initializePackageContents();
		theEastadlPackage.initializePackageContents();
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
		theVariabilityPackage.freeze();


		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VariabilityPackage.eNS_URI, theVariabilityPackage);
		return theVariabilityPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass variationGroupEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass reuseMetaInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass variabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass featureConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass vehicleLevelBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass configurationDecisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass selectionCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass configurationDecisionFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass containerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass privateContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass configurableContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass internalBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass configurationDecisionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass configurationDecisionModelEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass variableElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * @see org.eclipse.papyrus.eastadl.variability.VariabilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VariabilityPackageImpl() {
		super(eNS_URI, VariabilityFactory.eINSTANCE);
	}

	/**
	 * Creates the meta-model objects for the package. This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		variationGroupEClass = createEClass(VARIATION_GROUP);
		createEAttribute(variationGroupEClass, VARIATION_GROUP__CONSTRAINT);
		createEAttribute(variationGroupEClass, VARIATION_GROUP__KIND);
		createEReference(variationGroupEClass, VARIATION_GROUP__BASE_CLASS);
		createEReference(variationGroupEClass, VARIATION_GROUP__VARIABLE_ELEMENT);

		variableElementEClass = createEClass(VARIABLE_ELEMENT);
		createEReference(variableElementEClass, VARIABLE_ELEMENT__REQUIRED_BINDING_TIME);
		createEReference(variableElementEClass, VARIABLE_ELEMENT__ACTUAL_BINDING_TIME);
		createEReference(variableElementEClass, VARIABLE_ELEMENT__REUSE_META_INFORMATION);
		createEReference(variableElementEClass, VARIABLE_ELEMENT__OPTIONAL_ELEMENT);
		createEReference(variableElementEClass, VARIABLE_ELEMENT__BASE_CLASS);

		reuseMetaInformationEClass = createEClass(REUSE_META_INFORMATION);
		createEAttribute(reuseMetaInformationEClass, REUSE_META_INFORMATION__INFORMATION);
		createEAttribute(reuseMetaInformationEClass, REUSE_META_INFORMATION__IS_REUSABLE);
		createEReference(reuseMetaInformationEClass, REUSE_META_INFORMATION__BASE_CLASS);

		configurableContainerEClass = createEClass(CONFIGURABLE_CONTAINER);
		createEReference(configurableContainerEClass, CONFIGURABLE_CONTAINER__INTERNAL_BINDING);
		createEReference(configurableContainerEClass, CONFIGURABLE_CONTAINER__VARIATION_GROUP);
		createEReference(configurableContainerEClass, CONFIGURABLE_CONTAINER__BASE_CLASS);
		createEReference(configurableContainerEClass, CONFIGURABLE_CONTAINER__BASE_PACKAGE);
		createEReference(configurableContainerEClass, CONFIGURABLE_CONTAINER__CONFIGURABLE_ELEMENT);
		createEReference(configurableContainerEClass, CONFIGURABLE_CONTAINER__PUBLIC_FEATURE_MODEL);
		createEReference(configurableContainerEClass, CONFIGURABLE_CONTAINER__PRIVATE_CONTENT);

		internalBindingEClass = createEClass(INTERNAL_BINDING);

		configurationDecisionModelEClass = createEClass(CONFIGURATION_DECISION_MODEL);
		createEReference(configurationDecisionModelEClass, CONFIGURATION_DECISION_MODEL__BASE_PACKAGE);
		createEReference(configurationDecisionModelEClass, CONFIGURATION_DECISION_MODEL__BASE_CLASS);
		createEReference(configurationDecisionModelEClass, CONFIGURATION_DECISION_MODEL__ROOT_ENTRY);

		configurationDecisionModelEntryEClass = createEClass(CONFIGURATION_DECISION_MODEL_ENTRY);
		createEAttribute(configurationDecisionModelEntryEClass, CONFIGURATION_DECISION_MODEL_ENTRY__IS_ACTIVE);
		createEReference(configurationDecisionModelEntryEClass, CONFIGURATION_DECISION_MODEL_ENTRY__BASE_CLASS);

		privateContentEClass = createEClass(PRIVATE_CONTENT);
		createEReference(privateContentEClass, PRIVATE_CONTENT__BASE_CLASS);
		createEReference(privateContentEClass, PRIVATE_CONTENT__PRIVATE_ELEMENT);

		variabilityEClass = createEClass(VARIABILITY);
		createEReference(variabilityEClass, VARIABILITY__BASE_CLASS);
		createEReference(variabilityEClass, VARIABILITY__BASE_PACKAGE);
		createEReference(variabilityEClass, VARIABILITY__CONFIGURABLE_CONTAINER);
		createEReference(variabilityEClass, VARIABILITY__CONFIGURATION);
		createEReference(variabilityEClass, VARIABILITY__PRODUCT_FEATURE_MODEL);
		createEReference(variabilityEClass, VARIABILITY__DECISION_MODEL);
		createEReference(variabilityEClass, VARIABILITY__VARIABLE_ELEMENT);

		featureConfigurationEClass = createEClass(FEATURE_CONFIGURATION);
		createEReference(featureConfigurationEClass, FEATURE_CONFIGURATION__CONFIGURED_FEATURE_MODEL);

		vehicleLevelBindingEClass = createEClass(VEHICLE_LEVEL_BINDING);
		createEReference(vehicleLevelBindingEClass, VEHICLE_LEVEL_BINDING__SOURCE_VEHICLE_FEATURE_MODEL);
		createEReference(vehicleLevelBindingEClass, VEHICLE_LEVEL_BINDING__TARGET_FEATURE_MODEL);

		configurationDecisionEClass = createEClass(CONFIGURATION_DECISION);
		createEAttribute(configurationDecisionEClass, CONFIGURATION_DECISION__EFFECT);
		createEAttribute(configurationDecisionEClass, CONFIGURATION_DECISION__CRITERION);
		createEAttribute(configurationDecisionEClass, CONFIGURATION_DECISION__IS_EQUIVALENCE);
		createEReference(configurationDecisionEClass, CONFIGURATION_DECISION__TARGET);
		createEReference(configurationDecisionEClass, CONFIGURATION_DECISION__SELECTION_CRITERION);

		selectionCriterionEClass = createEClass(SELECTION_CRITERION);
		createEReference(selectionCriterionEClass, SELECTION_CRITERION__SOURCE);
		createEReference(selectionCriterionEClass, SELECTION_CRITERION__BASE_CLASS);

		configurationDecisionFolderEClass = createEClass(CONFIGURATION_DECISION_FOLDER);
		createEReference(configurationDecisionFolderEClass, CONFIGURATION_DECISION_FOLDER__CHILD_ENTRY);

		containerConfigurationEClass = createEClass(CONTAINER_CONFIGURATION);
		createEReference(containerConfigurationEClass, CONTAINER_CONFIGURATION__CONFIGURED_CONTAINER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getConfigurableContainer() {
		return configurableContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getConfigurableContainer_ConfigurableElement() {
		return (EReference) configurableContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getConfigurableContainer_InternalBinding() {
		return (EReference) configurableContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getConfigurableContainer_PublicFeatureModel() {
		return (EReference) configurableContainerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getConfigurableContainer_PrivateContent() {
		return (EReference) configurableContainerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getConfigurableContainer_VariationGroup() {
		return (EReference) configurableContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getConfigurableContainer_Base_Class() {
		return (EReference) configurableContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getConfigurableContainer_Base_Package() {
		return (EReference) configurableContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getConfigurationDecision() {
		return configurationDecisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getConfigurationDecision_Criterion() {
		return (EAttribute) configurationDecisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getConfigurationDecision_Effect() {
		return (EAttribute) configurationDecisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getConfigurationDecision_IsEquivalence() {
		return (EAttribute) configurationDecisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getConfigurationDecision_SelectionCriterion() {
		return (EReference) configurationDecisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getConfigurationDecision_Target() {
		return (EReference) configurationDecisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getConfigurationDecisionFolder() {
		return configurationDecisionFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getConfigurationDecisionFolder_ChildEntry() {
		return (EReference) configurationDecisionFolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getConfigurationDecisionModel() {
		return configurationDecisionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getConfigurationDecisionModel_Base_Package() {
		return (EReference) configurationDecisionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getConfigurationDecisionModel_Base_Class() {
		return (EReference) configurationDecisionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getConfigurationDecisionModel_RootEntry() {
		return (EReference) configurationDecisionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getConfigurationDecisionModelEntry() {
		return configurationDecisionModelEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getConfigurationDecisionModelEntry_IsActive() {
		return (EAttribute) configurationDecisionModelEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getConfigurationDecisionModelEntry_Base_Class() {
		return (EReference) configurationDecisionModelEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getContainerConfiguration() {
		return containerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getContainerConfiguration_ConfiguredContainer() {
		return (EReference) containerConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getFeatureConfiguration() {
		return featureConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getFeatureConfiguration_ConfiguredFeatureModel() {
		return (EReference) featureConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getVehicleLevelBinding() {
		return vehicleLevelBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getVehicleLevelBinding_SourceVehicleFeatureModel() {
		return (EReference) vehicleLevelBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getVehicleLevelBinding_TargetFeatureModel() {
		return (EReference) vehicleLevelBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getInternalBinding() {
		return internalBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getPrivateContent() {
		return privateContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getPrivateContent_Base_Class() {
		return (EReference) privateContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getPrivateContent_PrivateElement() {
		return (EReference) privateContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getReuseMetaInformation() {
		return reuseMetaInformationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getReuseMetaInformation_Information() {
		return (EAttribute) reuseMetaInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getReuseMetaInformation_IsReusable() {
		return (EAttribute) reuseMetaInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getReuseMetaInformation_Base_Class() {
		return (EReference) reuseMetaInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getSelectionCriterion() {
		return selectionCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getSelectionCriterion_Source() {
		return (EReference) selectionCriterionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getSelectionCriterion_Base_Class() {
		return (EReference) selectionCriterionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getVariability() {
		return variabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getVariability_Base_Class() {
		return (EReference) variabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getVariability_Base_Package() {
		return (EReference) variabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getVariability_ConfigurableContainer() {
		return (EReference) variabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getVariability_Configuration() {
		return (EReference) variabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getVariability_DecisionModel() {
		return (EReference) variabilityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getVariability_ProductFeatureModel() {
		return (EReference) variabilityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getVariability_VariableElement() {
		return (EReference) variabilityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public VariabilityFactory getVariabilityFactory() {
		return (VariabilityFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getVariableElement() {
		return variableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getVariableElement_ActualBindingTime() {
		return (EReference) variableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getVariableElement_OptionalElement() {
		return (EReference) variableElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getVariableElement_Base_Class() {
		return (EReference) variableElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getVariableElement_RequiredBindingTime() {
		return (EReference) variableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getVariableElement_ReuseMetaInformation() {
		return (EReference) variableElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getVariationGroup() {
		return variationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getVariationGroup_Constraint() {
		return (EAttribute) variationGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getVariationGroup_Kind() {
		return (EAttribute) variationGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getVariationGroup_Base_Class() {
		return (EReference) variationGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getVariationGroup_VariableElement() {
		return (EReference) variationGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		ElementsPackage theElementsPackage = (ElementsPackage) EPackage.Registry.INSTANCE.getEPackage(ElementsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		FeaturemodelingPackage theFeaturemodelingPackage = (FeaturemodelingPackage) EPackage.Registry.INSTANCE.getEPackage(FeaturemodelingPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage) EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		ValuesPackage theValuesPackage = (ValuesPackage) EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		variationGroupEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		variableElementEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		reuseMetaInformationEClass.getESuperTypes().add(theElementsPackage.getTraceableSpecification());
		configurableContainerEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		internalBindingEClass.getESuperTypes().add(this.getConfigurationDecisionModel());
		configurationDecisionModelEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		configurationDecisionModelEntryEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		privateContentEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		variabilityEClass.getESuperTypes().add(theElementsPackage.getContext());
		featureConfigurationEClass.getESuperTypes().add(this.getConfigurationDecisionModel());
		vehicleLevelBindingEClass.getESuperTypes().add(this.getConfigurationDecisionModel());
		configurationDecisionEClass.getESuperTypes().add(this.getConfigurationDecisionModelEntry());
		selectionCriterionEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		selectionCriterionEClass.getESuperTypes().add(theValuesPackage.getEAExpression());
		configurationDecisionFolderEClass.getESuperTypes().add(this.getConfigurationDecisionModelEntry());
		containerConfigurationEClass.getESuperTypes().add(this.getConfigurationDecisionModel());

		// Initialize classes, features, and operations; add parameters
		initEClass(variationGroupEClass, VariationGroup.class, "VariationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getVariationGroup_Constraint(), theTypesPackage.getString(), "constraint", null, 1, 1, VariationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getVariationGroup_Kind(), theFeaturemodelingPackage.getVariabilityDependencyKind(), "kind", null, 1, 1, VariationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getVariationGroup_Base_Class(), theUMLPackage.getClass_(), null,
				"base_Class", null, 1, 1, VariationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getVariationGroup_VariableElement(), this.getVariableElement(), null,
				"variableElement", null, 1, -1, VariationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(variableElementEClass, VariableElement.class, "VariableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getVariableElement_RequiredBindingTime(), theFeaturemodelingPackage.getBindingTime(), null,
				"requiredBindingTime", null, 0, 1, VariableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getVariableElement_ActualBindingTime(), theFeaturemodelingPackage.getBindingTime(), null,
				"actualBindingTime", null, 1, 1, VariableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getVariableElement_ReuseMetaInformation(), this.getReuseMetaInformation(), null,
				"reuseMetaInformation", null, 0, 1, VariableElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getVariableElement_OptionalElement(), theUMLPackage.getNamedElement(), null,
				"optionalElement", null, 1, -1, VariableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getVariableElement_Base_Class(), theUMLPackage.getClass_(), null,
				"base_Class", null, 1, 1, VariableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(reuseMetaInformationEClass, ReuseMetaInformation.class, "ReuseMetaInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getReuseMetaInformation_Information(), theTypesPackage.getString(), "information", null, 1, 1, ReuseMetaInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getReuseMetaInformation_IsReusable(), theTypesPackage.getBoolean(), "isReusable", "true", 1, 1, ReuseMetaInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getReuseMetaInformation_Base_Class(), theUMLPackage.getClass_(), null,
				"base_Class", null, 1, 1, ReuseMetaInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(configurableContainerEClass, ConfigurableContainer.class, "ConfigurableContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getConfigurableContainer_InternalBinding(), this.getInternalBinding(), null,
				"internalBinding", null, 0, 1, ConfigurableContainer.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getConfigurableContainer_VariationGroup(), this.getVariationGroup(), null,
				"variationGroup", null, 0, -1, ConfigurableContainer.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getConfigurableContainer_Base_Class(), theUMLPackage.getClass_(), null,
				"base_Class", null, 0, 1, ConfigurableContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getConfigurableContainer_Base_Package(), theUMLPackage.getPackage(), null,
				"base_Package", null, 0, 1, ConfigurableContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getConfigurableContainer_ConfigurableElement(), theUMLPackage.getNamedElement(), null,
				"configurableElement", null, 1, 1, ConfigurableContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getConfigurableContainer_PublicFeatureModel(), theFeaturemodelingPackage.getFeatureModel(), null,
				"publicFeatureModel", null, 0, 1, ConfigurableContainer.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getConfigurableContainer_PrivateContent(), this.getPrivateContent(), null,
				"privateContent", null, 0, -1, ConfigurableContainer.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(internalBindingEClass, InternalBinding.class, "InternalBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(configurationDecisionModelEClass, ConfigurationDecisionModel.class, "ConfigurationDecisionModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getConfigurationDecisionModel_Base_Package(), theUMLPackage.getPackage(), null,
				"base_Package", null, 0, 1, ConfigurationDecisionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getConfigurationDecisionModel_Base_Class(), theUMLPackage.getClass_(), null,
				"base_Class", null, 0, 1, ConfigurationDecisionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getConfigurationDecisionModel_RootEntry(), this.getConfigurationDecisionModelEntry(), null,
				"rootEntry", null, 0, -1, ConfigurationDecisionModel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(configurationDecisionModelEntryEClass, ConfigurationDecisionModelEntry.class, "ConfigurationDecisionModelEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getConfigurationDecisionModelEntry_IsActive(), theTypesPackage.getBoolean(),
				"isActive", "true", 1, 1, ConfigurationDecisionModelEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getConfigurationDecisionModelEntry_Base_Class(), theUMLPackage.getClass_(), null,
				"base_Class", null, 1, 1, ConfigurationDecisionModelEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(privateContentEClass, PrivateContent.class, "PrivateContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPrivateContent_Base_Class(), theUMLPackage.getClass_(), null,
				"base_Class", null, 1, 1, PrivateContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPrivateContent_PrivateElement(), theUMLPackage.getNamedElement(), null,
				"privateElement", null, 1, 1, PrivateContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(variabilityEClass, Variability.class, "Variability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getVariability_Base_Class(), theUMLPackage.getClass_(), null,
				"base_Class", null, 0, 1, Variability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getVariability_Base_Package(), theUMLPackage.getPackage(), null,
				"base_Package", null, 0, 1, Variability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getVariability_ConfigurableContainer(), this.getConfigurableContainer(), null,
				"configurableContainer", null, 0, -1, Variability.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getVariability_Configuration(), this.getFeatureConfiguration(), null,
				"configuration", null, 0, -1, Variability.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getVariability_ProductFeatureModel(), theFeaturemodelingPackage.getFeatureModel(), null,
				"productFeatureModel", null, 0, -1, Variability.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getVariability_DecisionModel(), this.getVehicleLevelBinding(), null,
				"decisionModel", null, 0, -1, Variability.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getVariability_VariableElement(), this.getVariableElement(), null,
				"variableElement", null, 0, -1, Variability.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(featureConfigurationEClass, FeatureConfiguration.class, "FeatureConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFeatureConfiguration_ConfiguredFeatureModel(), theFeaturemodelingPackage.getFeatureModel(), null,
				"configuredFeatureModel", null, 1, 1, FeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(vehicleLevelBindingEClass, VehicleLevelBinding.class, "VehicleLevelBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getVehicleLevelBinding_SourceVehicleFeatureModel(), theFeaturemodelingPackage.getFeatureModel(), null,
				"sourceVehicleFeatureModel", null, 0, -1, VehicleLevelBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getVehicleLevelBinding_TargetFeatureModel(), theFeaturemodelingPackage.getFeatureModel(), null,
				"targetFeatureModel", null, 0, -1, VehicleLevelBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(configurationDecisionEClass, ConfigurationDecision.class, "ConfigurationDecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getConfigurationDecision_Effect(), theTypesPackage.getString(), "effect", null, 1, 1, ConfigurationDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConfigurationDecision_Criterion(), theTypesPackage.getString(), "criterion", null, 0, 1, ConfigurationDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConfigurationDecision_IsEquivalence(), theTypesPackage.getBoolean(), "isEquivalence", null, 1, 1, ConfigurationDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getConfigurationDecision_Target(), theUMLPackage.getNamedElement(), null,
				"target", null, 0, -1, ConfigurationDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConfigurationDecision_SelectionCriterion(), this.getSelectionCriterion(), null,
				"selectionCriterion", null, 0, 1, ConfigurationDecision.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(selectionCriterionEClass, SelectionCriterion.class, "SelectionCriterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSelectionCriterion_Source(), theUMLPackage.getNamedElement(), null,
				"source", null, 0, -1, SelectionCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSelectionCriterion_Base_Class(), theUMLPackage.getClass_(), null,
				"base_Class", null, 1, 1, SelectionCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(configurationDecisionFolderEClass, ConfigurationDecisionFolder.class, "ConfigurationDecisionFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getConfigurationDecisionFolder_ChildEntry(), this.getConfigurationDecisionModelEntry(), null,
				"childEntry", null, 0, -1, ConfigurationDecisionFolder.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(containerConfigurationEClass, ContainerConfiguration.class, "ContainerConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getContainerConfiguration_ConfiguredContainer(), this.getConfigurableContainer(), null,
				"configuredContainer", null, 1, 1, ContainerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

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
				new String[] { "originalName", "Variability" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

} // VariabilityPackageImpl
