/**
 */
package org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Region;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RT Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTRegion#getBase_Region <em>Base Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.UMLRealTimeStateMachPackage#getRTRegion()
 * @model
 * @generated
 */
public interface RTRegion extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Region</em>' reference.
	 * @see #setBase_Region(Region)
	 * @see org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.UMLRealTimeStateMachPackage#getRTRegion_Base_Region()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Region getBase_Region();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.umlrt.statemachine.UMLRealTimeStateMach.RTRegion#getBase_Region <em>Base Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Region</em>' reference.
	 * @see #getBase_Region()
	 * @generated
	 */
	void setBase_Region(Region value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * base_Region.subvertex->forAll
	 *       (v | not v.oclIsKindOf(FinalState))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Regions in RT state machines cannot have a final state'"
	 * @generated
	 */
	boolean RegionsinRTstatemachinescannothaveafinalstate(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RTRegion
