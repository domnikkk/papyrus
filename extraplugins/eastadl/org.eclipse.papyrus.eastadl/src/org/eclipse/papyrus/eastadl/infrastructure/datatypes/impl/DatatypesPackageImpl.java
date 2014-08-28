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
package org.eclipse.papyrus.eastadl.infrastructure.datatypes.impl;

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
import org.eclipse.papyrus.eastadl.infrastructure.InfrastructurePackage;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.ArrayDataType;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.CompositeDatatype;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesFactory;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EABoolean;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatype;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EADatatypePrototype;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EANumerical;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EAString;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.Enumeration;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EnumerationLiteral;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.Quantity;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.RangeableValueType;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.Unit;
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
public class DatatypesPackageImpl extends EPackageImpl implements DatatypesPackage {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eaDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eaDatatypePrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eaNumericalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass quantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass rangeableValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass compositeDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eaStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eaBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass arrayDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EDataType numericalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EDataType javalangFloatEDataType = null;

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
	 * This method is used to initialize {@link DatatypesPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatatypesPackage init() {
		if (isInited) {
			return (DatatypesPackage) EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);
		}

		// Obtain or create and register package
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatatypesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SysmlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		EastadlPackageImpl theEastadlPackage = (EastadlPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(EastadlPackage.eNS_URI) instanceof EastadlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EastadlPackage.eNS_URI) : EastadlPackage.eINSTANCE);
		VariabilityPackageImpl theVariabilityPackage = (VariabilityPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(VariabilityPackage.eNS_URI) instanceof VariabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariabilityPackage.eNS_URI)
				: VariabilityPackage.eINSTANCE);
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl) (EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI) instanceof InfrastructurePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(InfrastructurePackage.eNS_URI) : InfrastructurePackage.eINSTANCE);
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
		ErrormodelPackageImpl theErrormodelPackage = (ErrormodelPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(ErrormodelPackage.eNS_URI) instanceof ErrormodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ErrormodelPackage.eNS_URI)
				: ErrormodelPackage.eINSTANCE);
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
		theDatatypesPackage.createPackageContents();
		theEastadlPackage.createPackageContents();
		theVariabilityPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
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
		theDatatypesPackage.initializePackageContents();
		theEastadlPackage.initializePackageContents();
		theVariabilityPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
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
		theDatatypesPackage.freeze();


		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatatypesPackage.eNS_URI, theDatatypesPackage);
		return theDatatypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEADatatype() {
		return eaDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEADatatype_Base_DataType() {
		return (EReference) eaDatatypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEADatatypePrototype() {
		return eaDatatypePrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEADatatypePrototype_Type() {
		return (EReference) eaDatatypePrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEADatatypePrototype_Base_Property() {
		return (EReference) eaDatatypePrototypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEADatatypePrototype_Base_Parameter() {
		return (EReference) eaDatatypePrototypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEANumerical() {
		return eaNumericalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEANumerical_Max() {
		return (EAttribute) eaNumericalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEANumerical_Min() {
		return (EAttribute) eaNumericalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEANumerical_Unit() {
		return (EReference) eaNumericalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getUnit_Factor() {
		return (EAttribute) unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getUnit_Offset() {
		return (EAttribute) unitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getUnit_Symbol() {
		return (EAttribute) unitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getUnit_Quantity() {
		return (EReference) unitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getUnit_Reference() {
		return (EReference) unitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getQuantity() {
		return quantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getQuantity_AmountOfSubstanceExp() {
		return (EAttribute) quantityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getQuantity_ElectricCurrentExp() {
		return (EAttribute) quantityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getQuantity_LenghtExp() {
		return (EAttribute) quantityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getQuantity_LuminousIntensityExp() {
		return (EAttribute) quantityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getQuantity_MassExp() {
		return (EAttribute) quantityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getQuantity_ThermodynamicTemperatureExp() {
		return (EAttribute) quantityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getQuantity_TimeExp() {
		return (EAttribute) quantityEClass.getEStructuralFeatures().get(6);
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
	 * @see org.eclipse.papyrus.eastadl.infrastructure.datatypes.DatatypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatatypesPackageImpl() {
		super(eNS_URI, DatatypesFactory.eINSTANCE);
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
		eaDatatypeEClass = createEClass(EA_DATATYPE);
		createEReference(eaDatatypeEClass, EA_DATATYPE__BASE_DATA_TYPE);

		eaDatatypePrototypeEClass = createEClass(EA_DATATYPE_PROTOTYPE);
		createEReference(eaDatatypePrototypeEClass, EA_DATATYPE_PROTOTYPE__TYPE);
		createEReference(eaDatatypePrototypeEClass, EA_DATATYPE_PROTOTYPE__BASE_PROPERTY);
		createEReference(eaDatatypePrototypeEClass, EA_DATATYPE_PROTOTYPE__BASE_PARAMETER);

		eaNumericalEClass = createEClass(EA_NUMERICAL);
		createEAttribute(eaNumericalEClass, EA_NUMERICAL__MAX);
		createEAttribute(eaNumericalEClass, EA_NUMERICAL__MIN);
		createEReference(eaNumericalEClass, EA_NUMERICAL__UNIT);

		unitEClass = createEClass(UNIT);
		createEAttribute(unitEClass, UNIT__FACTOR);
		createEAttribute(unitEClass, UNIT__OFFSET);
		createEAttribute(unitEClass, UNIT__SYMBOL);
		createEReference(unitEClass, UNIT__QUANTITY);
		createEReference(unitEClass, UNIT__REFERENCE);

		quantityEClass = createEClass(QUANTITY);
		createEAttribute(quantityEClass, QUANTITY__AMOUNT_OF_SUBSTANCE_EXP);
		createEAttribute(quantityEClass, QUANTITY__ELECTRIC_CURRENT_EXP);
		createEAttribute(quantityEClass, QUANTITY__LENGHT_EXP);
		createEAttribute(quantityEClass, QUANTITY__LUMINOUS_INTENSITY_EXP);
		createEAttribute(quantityEClass, QUANTITY__MASS_EXP);
		createEAttribute(quantityEClass, QUANTITY__THERMODYNAMIC_TEMPERATURE_EXP);
		createEAttribute(quantityEClass, QUANTITY__TIME_EXP);

		rangeableValueTypeEClass = createEClass(RANGEABLE_VALUE_TYPE);
		createEAttribute(rangeableValueTypeEClass, RANGEABLE_VALUE_TYPE__ACCURACY);
		createEAttribute(rangeableValueTypeEClass, RANGEABLE_VALUE_TYPE__RESOLUTION);
		createEAttribute(rangeableValueTypeEClass, RANGEABLE_VALUE_TYPE__SIGNIFICANT_DIGITS);
		createEReference(rangeableValueTypeEClass, RANGEABLE_VALUE_TYPE__BASE_RANGEABLE);

		compositeDatatypeEClass = createEClass(COMPOSITE_DATATYPE);
		createEReference(compositeDatatypeEClass, COMPOSITE_DATATYPE__DATATYPE_PROTOTYPE);

		eaStringEClass = createEClass(EA_STRING);

		eaBooleanEClass = createEClass(EA_BOOLEAN);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__LITERAL);
		createEAttribute(enumerationEClass, ENUMERATION__IS_MULTI_VALUED);

		arrayDataTypeEClass = createEClass(ARRAY_DATA_TYPE);
		createEAttribute(arrayDataTypeEClass, ARRAY_DATA_TYPE__MAX_LENGHT);
		createEAttribute(arrayDataTypeEClass, ARRAY_DATA_TYPE__MIN_LENGHT);
		createEReference(arrayDataTypeEClass, ARRAY_DATA_TYPE__ELEMENT_TYPE);

		// Create data types
		numericalEDataType = createEDataType(NUMERICAL);
		javalangFloatEDataType = createEDataType(JAVALANG_FLOAT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getCompositeDatatype() {
		return compositeDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getCompositeDatatype_DatatypePrototype() {
		return (EReference) compositeDatatypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEAString() {
		return eaStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEABoolean() {
		return eaBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DatatypesFactory getDatatypesFactory() {
		return (DatatypesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEnumeration_Literal() {
		return (EReference) enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEnumeration_IsMultiValued() {
		return (EAttribute) enumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getArrayDataType() {
		return arrayDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getArrayDataType_MaxLenght() {
		return (EAttribute) arrayDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getArrayDataType_MinLenght() {
		return (EAttribute) arrayDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getArrayDataType_ElementType() {
		return (EReference) arrayDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EDataType getNumerical() {
		return numericalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EDataType getjavalangFloat() {
		return javalangFloatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getRangeableValueType() {
		return rangeableValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getRangeableValueType_Accuracy() {
		return (EAttribute) rangeableValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getRangeableValueType_Resolution() {
		return (EAttribute) rangeableValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getRangeableValueType_SignificantDigits() {
		return (EAttribute) rangeableValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getRangeableValueType_BaseRangeable() {
		return (EReference) rangeableValueTypeEClass.getEStructuralFeatures().get(3);
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
		TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eaDatatypeEClass.getESuperTypes().add(theElementsPackage.getTraceableSpecification());
		eaDatatypePrototypeEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		eaNumericalEClass.getESuperTypes().add(this.getEADatatype());
		unitEClass.getESuperTypes().add(theElementsPackage.getEAPackageableElement());
		quantityEClass.getESuperTypes().add(theElementsPackage.getEAPackageableElement());
		rangeableValueTypeEClass.getESuperTypes().add(this.getEADatatype());
		compositeDatatypeEClass.getESuperTypes().add(this.getEADatatype());
		eaStringEClass.getESuperTypes().add(this.getEADatatype());
		eaBooleanEClass.getESuperTypes().add(this.getEADatatype());
		enumerationLiteralEClass.getESuperTypes().add(theElementsPackage.getEAElement());
		enumerationEClass.getESuperTypes().add(this.getEADatatype());
		arrayDataTypeEClass.getESuperTypes().add(this.getEADatatype());

		// Initialize classes, features, and operations; add parameters
		initEClass(eaDatatypeEClass, EADatatype.class, "EADatatype", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEADatatype_Base_DataType(), theUMLPackage.getDataType(), null, "base_DataType", null, 1, 1, EADatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(eaDatatypePrototypeEClass, EADatatypePrototype.class, "EADatatypePrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEADatatypePrototype_Type(), this.getEADatatype(), null, "type", null, 1, 1, EADatatypePrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getEADatatypePrototype_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, EADatatypePrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEADatatypePrototype_Base_Parameter(), theUMLPackage.getParameter(), null, "base_Parameter", null, 0, 1, EADatatypePrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eaNumericalEClass, EANumerical.class, "EANumerical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEANumerical_Max(), this.getNumerical(), "max", null, 0, 1, EANumerical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEANumerical_Min(), this.getNumerical(), "min", null, 0, 1, EANumerical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEANumerical_Unit(), this.getUnit(), null, "unit", null, 0, 1, EANumerical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnit_Factor(), this.getjavalangFloat(), "factor", null, 1, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnit_Offset(), this.getjavalangFloat(), "offset", null, 1, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnit_Symbol(), theTypesPackage.getString(), "symbol", null, 1, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUnit_Quantity(), this.getQuantity(), null, "quantity", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUnit_Reference(), this.getUnit(), null, "reference", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(quantityEClass, Quantity.class, "Quantity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantity_AmountOfSubstanceExp(), theTypesPackage.getInteger(), "amountOfSubstanceExp", "0", 1, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getQuantity_ElectricCurrentExp(), theTypesPackage.getInteger(), "electricCurrentExp", "0", 1, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getQuantity_LenghtExp(), theTypesPackage.getInteger(), "lenghtExp", "0", 1, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getQuantity_LuminousIntensityExp(), theTypesPackage.getInteger(), "luminousIntensityExp", "0", 1, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getQuantity_MassExp(), theTypesPackage.getInteger(), "massExp", "0", 1, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getQuantity_ThermodynamicTemperatureExp(), theTypesPackage.getInteger(), "thermodynamicTemperatureExp", "0", 1, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getQuantity_TimeExp(), theTypesPackage.getInteger(), "timeExp", "0", 1, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rangeableValueTypeEClass, RangeableValueType.class, "RangeableValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRangeableValueType_Accuracy(), this.getjavalangFloat(), "accuracy", null, 1, 1, RangeableValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRangeableValueType_Resolution(), this.getjavalangFloat(), "resolution", null, 1, 1, RangeableValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRangeableValueType_SignificantDigits(), theTypesPackage.getInteger(), "significantDigits", null, 0, 1, RangeableValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRangeableValueType_BaseRangeable(), this.getEANumerical(), null, "baseRangeable", null, 1, 1, RangeableValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(compositeDatatypeEClass, CompositeDatatype.class, "CompositeDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeDatatype_DatatypePrototype(), this.getEADatatypePrototype(), null, "datatypePrototype", null, 1, -1, CompositeDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaStringEClass, EAString.class, "EAString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eaBooleanEClass, EABoolean.class, "EABoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_Literal(), this.getEnumerationLiteral(), null, "literal", null, 2, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEnumeration_IsMultiValued(), theTypesPackage.getBoolean(), "isMultiValued", null, 1, 1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(arrayDataTypeEClass, ArrayDataType.class, "ArrayDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrayDataType_MaxLenght(), theTypesPackage.getInteger(), "maxLenght", null, 0, 1, ArrayDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArrayDataType_MinLenght(), theTypesPackage.getInteger(), "minLenght", null, 0, 1, ArrayDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArrayDataType_ElementType(), this.getEADatatype(), null, "elementType", null, 1, 1, ArrayDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		// Initialize data types
		initEDataType(numericalEDataType, Float.class, "Numerical", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javalangFloatEDataType, Float.class, "javalangFloat", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} // DatatypesPackageImpl
