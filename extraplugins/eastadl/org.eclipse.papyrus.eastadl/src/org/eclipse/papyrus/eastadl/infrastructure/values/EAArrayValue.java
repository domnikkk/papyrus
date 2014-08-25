/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.values;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Array Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.eastadl.infrastructure.values.EAArrayValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.values.ValuesPackage#getEAArrayValue()
 * @model
 * @generated
 */
public interface EAArrayValue extends EAValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.infrastructure.values.EAValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Value</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.ValuesPackage#getEAArrayValue_Value()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EAValue> getValue();

} // EAArrayValue
