/**
 */
package org.eclipse.papyrus.eastadl.infrastructure.values;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.eastadl.infrastructure.datatypes.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Enumeration Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.eastadl.infrastructure.values.EAEnumerationValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.papyrus.eastadl.infrastructure.values.ValuesPackage#getEAEnumerationValue()
 * @model
 * @generated
 */
public interface EAEnumerationValue extends EAValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.eastadl.infrastructure.datatypes.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference list.
	 * @see org.eclipse.papyrus.eastadl.infrastructure.values.ValuesPackage#getEAEnumerationValue_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<EnumerationLiteral> getValue();

} // EAEnumerationValue
