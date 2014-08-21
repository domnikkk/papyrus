/**
 */
package org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint;

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
 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributequantificationconstraintFactory
 * @model kind="package"
 * @generated
 */
public interface AttributequantificationconstraintPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "attributequantificationconstraint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.papyrusuml.org/EAST-ADL2/Annex/AttributeQuantificationConstraint/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "AttributeQuantificationConstraint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	AttributequantificationconstraintPackage eINSTANCE = org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributequantificationconstraintPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributeQuantificationconstraintImpl <em>Attribute Quantificationconstraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributeQuantificationconstraintImpl
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributequantificationconstraintPackageImpl#getAttributeQuantificationconstraint()
	 * @generated
	 */
	int ATTRIBUTE_QUANTIFICATIONCONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_QUANTIFICATIONCONSTRAINT__BASE_NAMED_ELEMENT = ElementsPackage.EA_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_QUANTIFICATIONCONSTRAINT__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_QUANTIFICATIONCONSTRAINT__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_QUANTIFICATIONCONSTRAINT__ATTRIBUTE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_QUANTIFICATIONCONSTRAINT__QUANTIFICATION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Quantificationconstraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_QUANTIFICATIONCONSTRAINT_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute Quantificationconstraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_QUANTIFICATIONCONSTRAINT_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.QuantificationImpl <em>Quantification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.QuantificationImpl
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributequantificationconstraintPackageImpl#getQuantification()
	 * @generated
	 */
	int QUANTIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__BASE_NAMED_ELEMENT = ElementsPackage.EA_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__TYPE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Value Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__BASE_VALUE_SPECIFICATION = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__OPERAND = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Quantification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Quantification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.BehaviorAttributeBindingImpl <em>Behavior Attribute Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.BehaviorAttributeBindingImpl
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributequantificationconstraintPackageImpl#getBehaviorAttributeBinding()
	 * @generated
	 */
	int BEHAVIOR_ATTRIBUTE_BINDING = 2;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ATTRIBUTE_BINDING__BASE_NAMED_ELEMENT = ElementsPackage.RELATIONSHIP__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ATTRIBUTE_BINDING__NAME = ElementsPackage.RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ATTRIBUTE_BINDING__OWNED_COMMENT = ElementsPackage.RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Visible Through Function Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_FUNCTION_PORT = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visible Through Hardware Pin</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_HARDWARE_PIN = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visible Through Hardware Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_HARDWARE_PORT = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ATTRIBUTE_BINDING__ATTRIBUTE = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Visible Through Anomaly</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_ANOMALY = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Behavior Attribute Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ATTRIBUTE_BINDING_FEATURE_COUNT = ElementsPackage.RELATIONSHIP_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Behavior Attribute Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ATTRIBUTE_BINDING_OPERATION_COUNT = ElementsPackage.RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.LogicalEventImpl <em>Logical Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.LogicalEventImpl
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributequantificationconstraintPackageImpl#getLogicalEvent()
	 * @generated
	 */
	int LOGICAL_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EVENT__BASE_NAMED_ELEMENT = QUANTIFICATION__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EVENT__NAME = QUANTIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EVENT__OWNED_COMMENT = QUANTIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EVENT__TYPE = QUANTIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Base Value Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EVENT__BASE_VALUE_SPECIFICATION = QUANTIFICATION__BASE_VALUE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EVENT__OPERAND = QUANTIFICATION__OPERAND;

	/**
	 * The feature id for the '<em><b>Is Extern Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EVENT__IS_EXTERN_VISIBLE = QUANTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visible Through Function Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EVENT__VISIBLE_THROUGH_FUNCTION_PORT = QUANTIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EVENT_FEATURE_COUNT = QUANTIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Logical Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EVENT_OPERATION_COUNT = QUANTIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributeImpl
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributequantificationconstraintPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__BASE_NAMED_ELEMENT = ElementsPackage.EA_ELEMENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = ElementsPackage.EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__OWNED_COMMENT = ElementsPackage.EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Extern Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_EXTERN_VISIBLE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = ElementsPackage.EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = ElementsPackage.EA_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributeQuantificationconstraint <em>Attribute Quantificationconstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Attribute Quantificationconstraint</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributeQuantificationconstraint
	 * @generated
	 */
	EClass getAttributeQuantificationconstraint();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributeQuantificationconstraint#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Attribute</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributeQuantificationconstraint#getAttribute()
	 * @see #getAttributeQuantificationconstraint()
	 * @generated
	 */
	EReference getAttributeQuantificationconstraint_Attribute();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributeQuantificationconstraint#getQuantification <em>Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Quantification</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.AttributeQuantificationconstraint#getQuantification()
	 * @see #getAttributeQuantificationconstraint()
	 * @generated
	 */
	EReference getAttributeQuantificationconstraint_Quantification();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification <em>Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Quantification</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification
	 * @generated
	 */
	EClass getQuantification();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Operand</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Quantification#getOperand()
	 * @see #getQuantification()
	 * @generated
	 */
	EReference getQuantification_Operand();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.BehaviorAttributeBinding <em>Behavior Attribute Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Behavior Attribute Binding</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.BehaviorAttributeBinding
	 * @generated
	 */
	EClass getBehaviorAttributeBinding();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.BehaviorAttributeBinding#getVisibleThroughFunctionPort <em>Visible Through Function Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Visible Through Function Port</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.BehaviorAttributeBinding#getVisibleThroughFunctionPort()
	 * @see #getBehaviorAttributeBinding()
	 * @generated
	 */
	EReference getBehaviorAttributeBinding_VisibleThroughFunctionPort();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.BehaviorAttributeBinding#getVisibleThroughHardwarePin <em>Visible Through Hardware Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Visible Through Hardware Pin</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.BehaviorAttributeBinding#getVisibleThroughHardwarePin()
	 * @see #getBehaviorAttributeBinding()
	 * @generated
	 */
	EReference getBehaviorAttributeBinding_VisibleThroughHardwarePin();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.BehaviorAttributeBinding#getVisibleThroughHardwarePort <em>Visible Through Hardware Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Visible Through Hardware Port</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.BehaviorAttributeBinding#getVisibleThroughHardwarePort()
	 * @see #getBehaviorAttributeBinding()
	 * @generated
	 */
	EReference getBehaviorAttributeBinding_VisibleThroughHardwarePort();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.BehaviorAttributeBinding#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Attribute</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.BehaviorAttributeBinding#getAttribute()
	 * @see #getBehaviorAttributeBinding()
	 * @generated
	 */
	EReference getBehaviorAttributeBinding_Attribute();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.BehaviorAttributeBinding#getVisibleThroughAnomaly <em>Visible Through Anomaly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Visible Through Anomaly</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.BehaviorAttributeBinding#getVisibleThroughAnomaly()
	 * @see #getBehaviorAttributeBinding()
	 * @generated
	 */
	EReference getBehaviorAttributeBinding_VisibleThroughAnomaly();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.LogicalEvent <em>Logical Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Logical Event</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.LogicalEvent
	 * @generated
	 */
	EClass getLogicalEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.LogicalEvent#isIsExternVisible <em>Is Extern Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Extern Visible</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.LogicalEvent#isIsExternVisible()
	 * @see #getLogicalEvent()
	 * @generated
	 */
	EAttribute getLogicalEvent_IsExternVisible();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.LogicalEvent#getVisibleThroughFunctionPort <em>Visible Through Function Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Visible Through Function Port</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.LogicalEvent#getVisibleThroughFunctionPort()
	 * @see #getLogicalEvent()
	 * @generated
	 */
	EReference getLogicalEvent_VisibleThroughFunctionPort();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute#isIsExternVisible <em>Is Extern Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Extern Visible</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute#isIsExternVisible()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsExternVisible();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AttributequantificationconstraintFactory getAttributequantificationconstraintFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributeQuantificationconstraintImpl <em>Attribute Quantificationconstraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributeQuantificationconstraintImpl
		 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributequantificationconstraintPackageImpl#getAttributeQuantificationconstraint()
		 * @generated
		 */
		EClass ATTRIBUTE_QUANTIFICATIONCONSTRAINT = eINSTANCE.getAttributeQuantificationconstraint();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ATTRIBUTE_QUANTIFICATIONCONSTRAINT__ATTRIBUTE = eINSTANCE.getAttributeQuantificationconstraint_Attribute();

		/**
		 * The meta object literal for the '<em><b>Quantification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ATTRIBUTE_QUANTIFICATIONCONSTRAINT__QUANTIFICATION = eINSTANCE.getAttributeQuantificationconstraint_Quantification();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.QuantificationImpl <em>Quantification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.QuantificationImpl
		 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributequantificationconstraintPackageImpl#getQuantification()
		 * @generated
		 */
		EClass QUANTIFICATION = eINSTANCE.getQuantification();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference QUANTIFICATION__OPERAND = eINSTANCE.getQuantification_Operand();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.BehaviorAttributeBindingImpl <em>Behavior Attribute Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.BehaviorAttributeBindingImpl
		 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributequantificationconstraintPackageImpl#getBehaviorAttributeBinding()
		 * @generated
		 */
		EClass BEHAVIOR_ATTRIBUTE_BINDING = eINSTANCE.getBehaviorAttributeBinding();

		/**
		 * The meta object literal for the '<em><b>Visible Through Function Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_FUNCTION_PORT = eINSTANCE.getBehaviorAttributeBinding_VisibleThroughFunctionPort();

		/**
		 * The meta object literal for the '<em><b>Visible Through Hardware Pin</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_HARDWARE_PIN = eINSTANCE.getBehaviorAttributeBinding_VisibleThroughHardwarePin();

		/**
		 * The meta object literal for the '<em><b>Visible Through Hardware Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_HARDWARE_PORT = eINSTANCE.getBehaviorAttributeBinding_VisibleThroughHardwarePort();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BEHAVIOR_ATTRIBUTE_BINDING__ATTRIBUTE = eINSTANCE.getBehaviorAttributeBinding_Attribute();

		/**
		 * The meta object literal for the '<em><b>Visible Through Anomaly</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BEHAVIOR_ATTRIBUTE_BINDING__VISIBLE_THROUGH_ANOMALY = eINSTANCE.getBehaviorAttributeBinding_VisibleThroughAnomaly();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.LogicalEventImpl <em>Logical Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.LogicalEventImpl
		 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributequantificationconstraintPackageImpl#getLogicalEvent()
		 * @generated
		 */
		EClass LOGICAL_EVENT = eINSTANCE.getLogicalEvent();

		/**
		 * The meta object literal for the '<em><b>Is Extern Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LOGICAL_EVENT__IS_EXTERN_VISIBLE = eINSTANCE.getLogicalEvent_IsExternVisible();

		/**
		 * The meta object literal for the '<em><b>Visible Through Function Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LOGICAL_EVENT__VISIBLE_THROUGH_FUNCTION_PORT = eINSTANCE.getLogicalEvent_VisibleThroughFunctionPort();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributeImpl
		 * @see org.eclipse.papyrus.eastadl.annex.attributequantificationconstraint.impl.AttributequantificationconstraintPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Is Extern Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_EXTERN_VISIBLE = eINSTANCE.getAttribute_IsExternVisible();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

	}

} // AttributequantificationconstraintPackage
