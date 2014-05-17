/**
 */
package org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.UMLRealTimeStateMachFactory
 * @model kind="package"
 * @generated
 */
public interface UMLRealTimeStateMachPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UMLRealTimeStateMach";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/umlrt/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "umlrtsm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UMLRealTimeStateMachPackage eINSTANCE = org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.UMLRealTimeStateMachPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTStateMachineImpl <em>RT State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTStateMachineImpl
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.UMLRealTimeStateMachPackageImpl#getRTStateMachine()
	 * @generated
	 */
	int RT_STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Base State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_STATE_MACHINE__BASE_STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Is Passive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_STATE_MACHINE__IS_PASSIVE = 1;

	/**
	 * The number of structural features of the '<em>RT State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>An RTstatemachinehasexactlyoneregion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_STATE_MACHINE___AN_RTSTATEMACHINEHASEXACTLYONEREGION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>An RTstatemachineisneverreentrant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_STATE_MACHINE___AN_RTSTATEMACHINEISNEVERREENTRANT__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>RTstatemachinesdonothaveparametersorparametersets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_STATE_MACHINE___RTSTATEMACHINESDONOTHAVEPARAMETERSORPARAMETERSETS__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>RTstatemachinesmusthaveacontextanditmustbea Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_STATE_MACHINE___RTSTATEMACHINESMUSTHAVEACONTEXTANDITMUSTBEA_CLASS__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Passivestatemachineareonlyallowedonpassivedataclasses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_STATE_MACHINE___PASSIVESTATEMACHINEAREONLYALLOWEDONPASSIVEDATACLASSES__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The number of operations of the '<em>RT State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_STATE_MACHINE_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTRegionImpl <em>RT Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTRegionImpl
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.UMLRealTimeStateMachPackageImpl#getRTRegion()
	 * @generated
	 */
	int RT_REGION = 1;

	/**
	 * The feature id for the '<em><b>Base Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_REGION__BASE_REGION = 0;

	/**
	 * The number of structural features of the '<em>RT Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_REGION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Regionsin RTstatemachinescannothaveafinalstate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_REGION___REGIONSIN_RTSTATEMACHINESCANNOTHAVEAFINALSTATE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>RT Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_REGION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTStateImpl <em>RT State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTStateImpl
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.UMLRealTimeStateMachPackageImpl#getRTState()
	 * @generated
	 */
	int RT_STATE = 2;

	/**
	 * The feature id for the '<em><b>Base State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_STATE__BASE_STATE = 0;

	/**
	 * The number of structural features of the '<em>RT State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_STATE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Acomposte RTstatehasexactlyoneregion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_STATE___ACOMPOSTE_RTSTATEHASEXACTLYONEREGION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>RTdoesnotsupportsubmachinestates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_STATE___RTDOESNOTSUPPORTSUBMACHINESTATES__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>RTstatemachinesdonotsupportdoactivities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_STATE___RTSTATEMACHINESDONOTSUPPORTDOACTIVITIES__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>RTstatemachinescannothaveanydeferredtriggers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_STATE___RTSTATEMACHINESCANNOTHAVEANYDEFERREDTRIGGERS__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Constraint5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_STATE___CONSTRAINT5__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The number of operations of the '<em>RT State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_STATE_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTPseudostateImpl <em>RT Pseudostate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTPseudostateImpl
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.UMLRealTimeStateMachPackageImpl#getRTPseudostate()
	 * @generated
	 */
	int RT_PSEUDOSTATE = 3;

	/**
	 * The feature id for the '<em><b>Base Pseudostate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PSEUDOSTATE__BASE_PSEUDOSTATE = 0;

	/**
	 * The number of structural features of the '<em>RT Pseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PSEUDOSTATE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>RTstatemachinesdonotsupportconcurrencyorshallowhistory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PSEUDOSTATE___RTSTATEMACHINESDONOTSUPPORTCONCURRENCYORSHALLOWHISTORY__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>RT Pseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PSEUDOSTATE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTTriggerImpl <em>RT Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTTriggerImpl
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.UMLRealTimeStateMachPackageImpl#getRTTrigger()
	 * @generated
	 */
	int RT_TRIGGER = 4;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_TRIGGER__BASE_OPERATION = 0;

	/**
	 * The number of structural features of the '<em>RT Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_TRIGGER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>RT Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_TRIGGER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine <em>RT State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RT State Machine</em>'.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine
	 * @generated
	 */
	EClass getRTStateMachine();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine#getBase_StateMachine <em>Base State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base State Machine</em>'.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine#getBase_StateMachine()
	 * @see #getRTStateMachine()
	 * @generated
	 */
	EReference getRTStateMachine_Base_StateMachine();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine#isPassive <em>Is Passive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Passive</em>'.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine#isPassive()
	 * @see #getRTStateMachine()
	 * @generated
	 */
	EAttribute getRTStateMachine_IsPassive();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine#AnRTstatemachinehasexactlyoneregion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>An RTstatemachinehasexactlyoneregion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>An RTstatemachinehasexactlyoneregion</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine#AnRTstatemachinehasexactlyoneregion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRTStateMachine__AnRTstatemachinehasexactlyoneregion__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine#AnRTstatemachineisneverreentrant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>An RTstatemachineisneverreentrant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>An RTstatemachineisneverreentrant</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine#AnRTstatemachineisneverreentrant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRTStateMachine__AnRTstatemachineisneverreentrant__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine#RTstatemachinesdonothaveparametersorparametersets(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>RTstatemachinesdonothaveparametersorparametersets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>RTstatemachinesdonothaveparametersorparametersets</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine#RTstatemachinesdonothaveparametersorparametersets(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRTStateMachine__RTstatemachinesdonothaveparametersorparametersets__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine#RTstatemachinesmusthaveacontextanditmustbeaClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>RTstatemachinesmusthaveacontextanditmustbea Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>RTstatemachinesmusthaveacontextanditmustbea Class</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine#RTstatemachinesmusthaveacontextanditmustbeaClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRTStateMachine__RTstatemachinesmusthaveacontextanditmustbeaClass__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine#Passivestatemachineareonlyallowedonpassivedataclasses(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Passivestatemachineareonlyallowedonpassivedataclasses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Passivestatemachineareonlyallowedonpassivedataclasses</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTStateMachine#Passivestatemachineareonlyallowedonpassivedataclasses(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRTStateMachine__Passivestatemachineareonlyallowedonpassivedataclasses__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTRegion <em>RT Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RT Region</em>'.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTRegion
	 * @generated
	 */
	EClass getRTRegion();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTRegion#getBase_Region <em>Base Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Region</em>'.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTRegion#getBase_Region()
	 * @see #getRTRegion()
	 * @generated
	 */
	EReference getRTRegion_Base_Region();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTRegion#RegionsinRTstatemachinescannothaveafinalstate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Regionsin RTstatemachinescannothaveafinalstate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Regionsin RTstatemachinescannothaveafinalstate</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTRegion#RegionsinRTstatemachinescannothaveafinalstate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRTRegion__RegionsinRTstatemachinescannothaveafinalstate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTState <em>RT State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RT State</em>'.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTState
	 * @generated
	 */
	EClass getRTState();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTState#getBase_State <em>Base State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base State</em>'.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTState#getBase_State()
	 * @see #getRTState()
	 * @generated
	 */
	EReference getRTState_Base_State();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTState#AcomposteRTstatehasexactlyoneregion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Acomposte RTstatehasexactlyoneregion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acomposte RTstatehasexactlyoneregion</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTState#AcomposteRTstatehasexactlyoneregion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRTState__AcomposteRTstatehasexactlyoneregion__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTState#RTdoesnotsupportsubmachinestates(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>RTdoesnotsupportsubmachinestates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>RTdoesnotsupportsubmachinestates</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTState#RTdoesnotsupportsubmachinestates(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRTState__RTdoesnotsupportsubmachinestates__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTState#RTstatemachinesdonotsupportdoactivities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>RTstatemachinesdonotsupportdoactivities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>RTstatemachinesdonotsupportdoactivities</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTState#RTstatemachinesdonotsupportdoactivities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRTState__RTstatemachinesdonotsupportdoactivities__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTState#RTstatemachinescannothaveanydeferredtriggers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>RTstatemachinescannothaveanydeferredtriggers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>RTstatemachinescannothaveanydeferredtriggers</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTState#RTstatemachinescannothaveanydeferredtriggers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRTState__RTstatemachinescannothaveanydeferredtriggers__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTState#Constraint5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint5</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint5</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTState#Constraint5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRTState__Constraint5__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTPseudostate <em>RT Pseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RT Pseudostate</em>'.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTPseudostate
	 * @generated
	 */
	EClass getRTPseudostate();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTPseudostate#getBase_Pseudostate <em>Base Pseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Pseudostate</em>'.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTPseudostate#getBase_Pseudostate()
	 * @see #getRTPseudostate()
	 * @generated
	 */
	EReference getRTPseudostate_Base_Pseudostate();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTPseudostate#RTstatemachinesdonotsupportconcurrencyorshallowhistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>RTstatemachinesdonotsupportconcurrencyorshallowhistory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>RTstatemachinesdonotsupportconcurrencyorshallowhistory</em>' operation.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTPseudostate#RTstatemachinesdonotsupportconcurrencyorshallowhistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRTPseudostate__RTstatemachinesdonotsupportconcurrencyorshallowhistory__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTTrigger <em>RT Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RT Trigger</em>'.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTTrigger
	 * @generated
	 */
	EClass getRTTrigger();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTTrigger#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTTrigger#getBase_Operation()
	 * @see #getRTTrigger()
	 * @generated
	 */
	EReference getRTTrigger_Base_Operation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UMLRealTimeStateMachFactory getUMLRealTimeStateMachFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTStateMachineImpl <em>RT State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTStateMachineImpl
		 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.UMLRealTimeStateMachPackageImpl#getRTStateMachine()
		 * @generated
		 */
		EClass RT_STATE_MACHINE = eINSTANCE.getRTStateMachine();

		/**
		 * The meta object literal for the '<em><b>Base State Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RT_STATE_MACHINE__BASE_STATE_MACHINE = eINSTANCE.getRTStateMachine_Base_StateMachine();

		/**
		 * The meta object literal for the '<em><b>Is Passive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RT_STATE_MACHINE__IS_PASSIVE = eINSTANCE.getRTStateMachine_IsPassive();

		/**
		 * The meta object literal for the '<em><b>An RTstatemachinehasexactlyoneregion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RT_STATE_MACHINE___AN_RTSTATEMACHINEHASEXACTLYONEREGION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRTStateMachine__AnRTstatemachinehasexactlyoneregion__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>An RTstatemachineisneverreentrant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RT_STATE_MACHINE___AN_RTSTATEMACHINEISNEVERREENTRANT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRTStateMachine__AnRTstatemachineisneverreentrant__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>RTstatemachinesdonothaveparametersorparametersets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RT_STATE_MACHINE___RTSTATEMACHINESDONOTHAVEPARAMETERSORPARAMETERSETS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRTStateMachine__RTstatemachinesdonothaveparametersorparametersets__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>RTstatemachinesmusthaveacontextanditmustbea Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RT_STATE_MACHINE___RTSTATEMACHINESMUSTHAVEACONTEXTANDITMUSTBEA_CLASS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRTStateMachine__RTstatemachinesmusthaveacontextanditmustbeaClass__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Passivestatemachineareonlyallowedonpassivedataclasses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RT_STATE_MACHINE___PASSIVESTATEMACHINEAREONLYALLOWEDONPASSIVEDATACLASSES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRTStateMachine__Passivestatemachineareonlyallowedonpassivedataclasses__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTRegionImpl <em>RT Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTRegionImpl
		 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.UMLRealTimeStateMachPackageImpl#getRTRegion()
		 * @generated
		 */
		EClass RT_REGION = eINSTANCE.getRTRegion();

		/**
		 * The meta object literal for the '<em><b>Base Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RT_REGION__BASE_REGION = eINSTANCE.getRTRegion_Base_Region();

		/**
		 * The meta object literal for the '<em><b>Regionsin RTstatemachinescannothaveafinalstate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RT_REGION___REGIONSIN_RTSTATEMACHINESCANNOTHAVEAFINALSTATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRTRegion__RegionsinRTstatemachinescannothaveafinalstate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTStateImpl <em>RT State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTStateImpl
		 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.UMLRealTimeStateMachPackageImpl#getRTState()
		 * @generated
		 */
		EClass RT_STATE = eINSTANCE.getRTState();

		/**
		 * The meta object literal for the '<em><b>Base State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RT_STATE__BASE_STATE = eINSTANCE.getRTState_Base_State();

		/**
		 * The meta object literal for the '<em><b>Acomposte RTstatehasexactlyoneregion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RT_STATE___ACOMPOSTE_RTSTATEHASEXACTLYONEREGION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRTState__AcomposteRTstatehasexactlyoneregion__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>RTdoesnotsupportsubmachinestates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RT_STATE___RTDOESNOTSUPPORTSUBMACHINESTATES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRTState__RTdoesnotsupportsubmachinestates__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>RTstatemachinesdonotsupportdoactivities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RT_STATE___RTSTATEMACHINESDONOTSUPPORTDOACTIVITIES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRTState__RTstatemachinesdonotsupportdoactivities__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>RTstatemachinescannothaveanydeferredtriggers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RT_STATE___RTSTATEMACHINESCANNOTHAVEANYDEFERREDTRIGGERS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRTState__RTstatemachinescannothaveanydeferredtriggers__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Constraint5</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RT_STATE___CONSTRAINT5__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRTState__Constraint5__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTPseudostateImpl <em>RT Pseudostate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTPseudostateImpl
		 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.UMLRealTimeStateMachPackageImpl#getRTPseudostate()
		 * @generated
		 */
		EClass RT_PSEUDOSTATE = eINSTANCE.getRTPseudostate();

		/**
		 * The meta object literal for the '<em><b>Base Pseudostate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RT_PSEUDOSTATE__BASE_PSEUDOSTATE = eINSTANCE.getRTPseudostate_Base_Pseudostate();

		/**
		 * The meta object literal for the '<em><b>RTstatemachinesdonotsupportconcurrencyorshallowhistory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RT_PSEUDOSTATE___RTSTATEMACHINESDONOTSUPPORTCONCURRENCYORSHALLOWHISTORY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRTPseudostate__RTstatemachinesdonotsupportconcurrencyorshallowhistory__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTTriggerImpl <em>RT Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.RTTriggerImpl
		 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.impl.UMLRealTimeStateMachPackageImpl#getRTTrigger()
		 * @generated
		 */
		EClass RT_TRIGGER = eINSTANCE.getRTTrigger();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RT_TRIGGER__BASE_OPERATION = eINSTANCE.getRTTrigger_Base_Operation();

	}

} //UMLRealTimeStateMachPackage
