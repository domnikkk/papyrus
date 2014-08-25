/**
 */
package org.eclipse.papyrus.eastadl.annex.computationconstraint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.papyrus.eastadl.infrastructure.elements.ElementsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationconstraintFactory
 * @model kind="package"
 * @generated
 */
public interface ComputationconstraintPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "computationconstraint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.papyrusuml.org/EAST-ADL2/Annex/ComputationConstraint/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "ComputationConstraint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	ComputationconstraintPackage eINSTANCE = org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.ComputationconstraintPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.ComputationConstraintImpl <em>Computation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.ComputationConstraintImpl
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.ComputationconstraintPackageImpl#getComputationConstraint()
	 * @generated
	 */
	int COMPUTATION_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPUTATION_CONSTRAINT__BASE_NAMED_ELEMENT = ElementsPackage.EA_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPUTATION_CONSTRAINT__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPUTATION_CONSTRAINT__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Logical Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPUTATION_CONSTRAINT__LOGICAL_PATH = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logical Transformation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPUTATION_CONSTRAINT__LOGICAL_TRANSFORMATION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Computation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPUTATION_CONSTRAINT_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Computation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPUTATION_CONSTRAINT_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalPathImpl <em>Logical Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalPathImpl
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.ComputationconstraintPackageImpl#getLogicalPath()
	 * @generated
	 */
	int LOGICAL_PATH = 1;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PATH__BASE_NAMED_ELEMENT = ElementsPackage.EA_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PATH__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PATH__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Strand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PATH__STRAND = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Segment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PATH__SEGMENT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transformation Occurrence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PATH__TRANSFORMATION_OCCURRENCE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Preceding Execution Event Chain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PATH__PRECEDING_EXECUTION_EVENT_CHAIN = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Succeeding Execution Event Chain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PATH__SUCCEEDING_EXECUTION_EVENT_CHAIN = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Corresponding Execution Event Chain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PATH__CORRESPONDING_EXECUTION_EVENT_CHAIN = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Logical Response</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PATH__LOGICAL_RESPONSE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Logical Stimulus</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PATH__LOGICAL_STIMULUS = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Logical Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PATH_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Logical Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PATH_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalTransformationImpl <em>Logical Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalTransformationImpl
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.ComputationconstraintPackageImpl#getLogicalTransformation()
	 * @generated
	 */
	int LOGICAL_TRANSFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION__BASE_NAMED_ELEMENT = ElementsPackage.EA_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Client Server Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION__IS_CLIENT_SERVER_INTERFACE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Client Serverinterface Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION__CLIENT_SERVERINTERFACE_OPERATION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION__CONTAINED = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION__OUT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION__IN = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION__EXPRESSION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Quantification Invariant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION__QUANTIFICATION_INVARIANT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION__PRE_CONDITION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION__POST_CONDITION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Time Invariant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION__TIME_INVARIANT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Logical Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Logical Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TRANSFORMATION_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.TransformationOccurrenceImpl <em>Transformation Occurrence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.TransformationOccurrenceImpl
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.ComputationconstraintPackageImpl#getTransformationOccurrence()
	 * @generated
	 */
	int TRANSFORMATION_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OCCURRENCE__BASE_NAMED_ELEMENT = ElementsPackage.EA_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OCCURRENCE__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OCCURRENCE__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>In Quantification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OCCURRENCE__IN_QUANTIFICATION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Quantification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OCCURRENCE__OUT_QUANTIFICATION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invoked Logical Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OCCURRENCE__INVOKED_LOGICAL_TRANSFORMATION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OCCURRENCE__TIME_CONDITION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transformation Occurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OCCURRENCE_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Transformation Occurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OCCURRENCE_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationConstraint <em>Computation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Computation Constraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationConstraint
	 * @generated
	 */
	EClass getComputationConstraint();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationConstraint#getLogicalPath <em>Logical Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Logical Path</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationConstraint#getLogicalPath()
	 * @see #getComputationConstraint()
	 * @generated
	 */
	EReference getComputationConstraint_LogicalPath();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationConstraint#getLogicalTransformation <em>Logical Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Logical Transformation</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.ComputationConstraint#getLogicalTransformation()
	 * @see #getComputationConstraint()
	 * @generated
	 */
	EReference getComputationConstraint_LogicalTransformation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath <em>Logical Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Logical Path</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath
	 * @generated
	 */
	EClass getLogicalPath();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getStrand <em>Strand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Strand</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getStrand()
	 * @see #getLogicalPath()
	 * @generated
	 */
	EReference getLogicalPath_Strand();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getSegment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Segment</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getSegment()
	 * @see #getLogicalPath()
	 * @generated
	 */
	EReference getLogicalPath_Segment();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getTransformationOccurrence <em>Transformation Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Transformation Occurrence</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getTransformationOccurrence()
	 * @see #getLogicalPath()
	 * @generated
	 */
	EReference getLogicalPath_TransformationOccurrence();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getPrecedingExecutionEventChain <em>Preceding Execution Event Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Preceding Execution Event Chain</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getPrecedingExecutionEventChain()
	 * @see #getLogicalPath()
	 * @generated
	 */
	EReference getLogicalPath_PrecedingExecutionEventChain();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getSucceedingExecutionEventChain <em>Succeeding Execution Event Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Succeeding Execution Event Chain</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getSucceedingExecutionEventChain()
	 * @see #getLogicalPath()
	 * @generated
	 */
	EReference getLogicalPath_SucceedingExecutionEventChain();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getCorrespondingExecutionEventChain <em>Corresponding Execution Event Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Corresponding Execution Event Chain</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getCorrespondingExecutionEventChain()
	 * @see #getLogicalPath()
	 * @generated
	 */
	EReference getLogicalPath_CorrespondingExecutionEventChain();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getLogicalResponse <em>Logical Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Logical Response</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getLogicalResponse()
	 * @see #getLogicalPath()
	 * @generated
	 */
	EReference getLogicalPath_LogicalResponse();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getLogicalStimulus <em>Logical Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Logical Stimulus</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalPath#getLogicalStimulus()
	 * @see #getLogicalPath()
	 * @generated
	 */
	EReference getLogicalPath_LogicalStimulus();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation <em>Logical Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Logical Transformation</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation
	 * @generated
	 */
	EClass getLogicalTransformation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#isIsClientServerInterface <em>Is Client Server Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Is Client Server Interface</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#isIsClientServerInterface()
	 * @see #getLogicalTransformation()
	 * @generated
	 */
	EAttribute getLogicalTransformation_IsClientServerInterface();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getClientServerinterfaceOperation <em>Client Serverinterface Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Client Serverinterface Operation</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getClientServerinterfaceOperation()
	 * @see #getLogicalTransformation()
	 * @generated
	 */
	EReference getLogicalTransformation_ClientServerinterfaceOperation();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getContained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Contained</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getContained()
	 * @see #getLogicalTransformation()
	 * @generated
	 */
	EReference getLogicalTransformation_Contained();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Out</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getOut()
	 * @see #getLogicalTransformation()
	 * @generated
	 */
	EReference getLogicalTransformation_Out();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>In</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getIn()
	 * @see #getLogicalTransformation()
	 * @generated
	 */
	EReference getLogicalTransformation_In();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getExpression()
	 * @see #getLogicalTransformation()
	 * @generated
	 */
	EReference getLogicalTransformation_Expression();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getQuantificationInvariant <em>Quantification Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Quantification Invariant</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getQuantificationInvariant()
	 * @see #getLogicalTransformation()
	 * @generated
	 */
	EReference getLogicalTransformation_QuantificationInvariant();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getPreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Pre Condition</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getPreCondition()
	 * @see #getLogicalTransformation()
	 * @generated
	 */
	EReference getLogicalTransformation_PreCondition();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getPostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Post Condition</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getPostCondition()
	 * @see #getLogicalTransformation()
	 * @generated
	 */
	EReference getLogicalTransformation_PostCondition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getTimeInvariant <em>Time Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Time Invariant</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.LogicalTransformation#getTimeInvariant()
	 * @see #getLogicalTransformation()
	 * @generated
	 */
	EReference getLogicalTransformation_TimeInvariant();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence <em>Transformation Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Transformation Occurrence</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence
	 * @generated
	 */
	EClass getTransformationOccurrence();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence#getInQuantification <em>In Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>In Quantification</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence#getInQuantification()
	 * @see #getTransformationOccurrence()
	 * @generated
	 */
	EReference getTransformationOccurrence_InQuantification();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence#getOutQuantification <em>Out Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Out Quantification</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence#getOutQuantification()
	 * @see #getTransformationOccurrence()
	 * @generated
	 */
	EReference getTransformationOccurrence_OutQuantification();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence#getInvokedLogicalTransformation <em>Invoked Logical Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Invoked Logical Transformation</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence#getInvokedLogicalTransformation()
	 * @see #getTransformationOccurrence()
	 * @generated
	 */
	EReference getTransformationOccurrence_InvokedLogicalTransformation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence#getTimeCondition <em>Time Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Time Condition</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.TransformationOccurrence#getTimeCondition()
	 * @see #getTransformationOccurrence()
	 * @generated
	 */
	EReference getTransformationOccurrence_TimeCondition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComputationconstraintFactory getComputationconstraintFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.ComputationConstraintImpl <em>Computation Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.ComputationConstraintImpl
		 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.ComputationconstraintPackageImpl#getComputationConstraint()
		 * @generated
		 */
		EClass COMPUTATION_CONSTRAINT = eINSTANCE.getComputationConstraint();

		/**
		 * The meta object literal for the '<em><b>Logical Path</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference COMPUTATION_CONSTRAINT__LOGICAL_PATH = eINSTANCE.getComputationConstraint_LogicalPath();

		/**
		 * The meta object literal for the '<em><b>Logical Transformation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference COMPUTATION_CONSTRAINT__LOGICAL_TRANSFORMATION = eINSTANCE.getComputationConstraint_LogicalTransformation();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalPathImpl <em>Logical Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalPathImpl
		 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.ComputationconstraintPackageImpl#getLogicalPath()
		 * @generated
		 */
		EClass LOGICAL_PATH = eINSTANCE.getLogicalPath();

		/**
		 * The meta object literal for the '<em><b>Strand</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference LOGICAL_PATH__STRAND = eINSTANCE.getLogicalPath_Strand();

		/**
		 * The meta object literal for the '<em><b>Segment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference LOGICAL_PATH__SEGMENT = eINSTANCE.getLogicalPath_Segment();

		/**
		 * The meta object literal for the '<em><b>Transformation Occurrence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference LOGICAL_PATH__TRANSFORMATION_OCCURRENCE = eINSTANCE.getLogicalPath_TransformationOccurrence();

		/**
		 * The meta object literal for the '<em><b>Preceding Execution Event Chain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference LOGICAL_PATH__PRECEDING_EXECUTION_EVENT_CHAIN = eINSTANCE.getLogicalPath_PrecedingExecutionEventChain();

		/**
		 * The meta object literal for the '<em><b>Succeeding Execution Event Chain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference LOGICAL_PATH__SUCCEEDING_EXECUTION_EVENT_CHAIN = eINSTANCE.getLogicalPath_SucceedingExecutionEventChain();

		/**
		 * The meta object literal for the '<em><b>Corresponding Execution Event Chain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference LOGICAL_PATH__CORRESPONDING_EXECUTION_EVENT_CHAIN = eINSTANCE.getLogicalPath_CorrespondingExecutionEventChain();

		/**
		 * The meta object literal for the '<em><b>Logical Response</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference LOGICAL_PATH__LOGICAL_RESPONSE = eINSTANCE.getLogicalPath_LogicalResponse();

		/**
		 * The meta object literal for the '<em><b>Logical Stimulus</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference LOGICAL_PATH__LOGICAL_STIMULUS = eINSTANCE.getLogicalPath_LogicalStimulus();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalTransformationImpl <em>Logical Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.LogicalTransformationImpl
		 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.ComputationconstraintPackageImpl#getLogicalTransformation()
		 * @generated
		 */
		EClass LOGICAL_TRANSFORMATION = eINSTANCE.getLogicalTransformation();

		/**
		 * The meta object literal for the '<em><b>Is Client Server Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute LOGICAL_TRANSFORMATION__IS_CLIENT_SERVER_INTERFACE = eINSTANCE.getLogicalTransformation_IsClientServerInterface();

		/**
		 * The meta object literal for the '<em><b>Client Serverinterface Operation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference LOGICAL_TRANSFORMATION__CLIENT_SERVERINTERFACE_OPERATION = eINSTANCE.getLogicalTransformation_ClientServerinterfaceOperation();

		/**
		 * The meta object literal for the '<em><b>Contained</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference LOGICAL_TRANSFORMATION__CONTAINED = eINSTANCE.getLogicalTransformation_Contained();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference LOGICAL_TRANSFORMATION__OUT = eINSTANCE.getLogicalTransformation_Out();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference LOGICAL_TRANSFORMATION__IN = eINSTANCE.getLogicalTransformation_In();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference LOGICAL_TRANSFORMATION__EXPRESSION = eINSTANCE.getLogicalTransformation_Expression();

		/**
		 * The meta object literal for the '<em><b>Quantification Invariant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference LOGICAL_TRANSFORMATION__QUANTIFICATION_INVARIANT = eINSTANCE.getLogicalTransformation_QuantificationInvariant();

		/**
		 * The meta object literal for the '<em><b>Pre Condition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference LOGICAL_TRANSFORMATION__PRE_CONDITION = eINSTANCE.getLogicalTransformation_PreCondition();

		/**
		 * The meta object literal for the '<em><b>Post Condition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference LOGICAL_TRANSFORMATION__POST_CONDITION = eINSTANCE.getLogicalTransformation_PostCondition();

		/**
		 * The meta object literal for the '<em><b>Time Invariant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference LOGICAL_TRANSFORMATION__TIME_INVARIANT = eINSTANCE.getLogicalTransformation_TimeInvariant();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.TransformationOccurrenceImpl <em>Transformation Occurrence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.TransformationOccurrenceImpl
		 * @see org.eclipse.papyrus.eastadl.annex.computationconstraint.impl.ComputationconstraintPackageImpl#getTransformationOccurrence()
		 * @generated
		 */
		EClass TRANSFORMATION_OCCURRENCE = eINSTANCE.getTransformationOccurrence();

		/**
		 * The meta object literal for the '<em><b>In Quantification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference TRANSFORMATION_OCCURRENCE__IN_QUANTIFICATION = eINSTANCE.getTransformationOccurrence_InQuantification();

		/**
		 * The meta object literal for the '<em><b>Out Quantification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference TRANSFORMATION_OCCURRENCE__OUT_QUANTIFICATION = eINSTANCE.getTransformationOccurrence_OutQuantification();

		/**
		 * The meta object literal for the '<em><b>Invoked Logical Transformation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference TRANSFORMATION_OCCURRENCE__INVOKED_LOGICAL_TRANSFORMATION = eINSTANCE.getTransformationOccurrence_InvokedLogicalTransformation();

		/**
		 * The meta object literal for the '<em><b>Time Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference TRANSFORMATION_OCCURRENCE__TIME_CONDITION = eINSTANCE.getTransformationOccurrence_TimeCondition();

	}

} // ComputationconstraintPackage
