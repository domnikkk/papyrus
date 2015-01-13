/**
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.util;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanListValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DoubleListValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DoubleValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntListValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NamedStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StringListValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StringValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.Style;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StyledElement;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.TableDisplayStyle;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage
 * @generated
 */
public class NattablestyleSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static NattablestylePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NattablestyleSwitch() {
		if (modelPackage == null) {
			modelPackage = NattablestylePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case NattablestylePackage.STYLE: {
			Style style = (Style) theEObject;
			T result = caseStyle(style);
			if (result == null) {
				result = caseEModelElement(style);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattablestylePackage.NAMED_STYLE: {
			NamedStyle namedStyle = (NamedStyle) theEObject;
			T result = caseNamedStyle(namedStyle);
			if (result == null) {
				result = caseStyle(namedStyle);
			}
			if (result == null) {
				result = caseEModelElement(namedStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattablestylePackage.FONT_STYLE: {
			FontStyle fontStyle = (FontStyle) theEObject;
			T result = caseFontStyle(fontStyle);
			if (result == null) {
				result = caseStyle(fontStyle);
			}
			if (result == null) {
				result = caseEModelElement(fontStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattablestylePackage.CELL_TEXT_STYLE: {
			CellTextStyle cellTextStyle = (CellTextStyle) theEObject;
			T result = caseCellTextStyle(cellTextStyle);
			if (result == null) {
				result = caseStyle(cellTextStyle);
			}
			if (result == null) {
				result = caseEModelElement(cellTextStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattablestylePackage.INT_VALUE_STYLE: {
			IntValueStyle intValueStyle = (IntValueStyle) theEObject;
			T result = caseIntValueStyle(intValueStyle);
			if (result == null) {
				result = caseNamedStyle(intValueStyle);
			}
			if (result == null) {
				result = caseStyle(intValueStyle);
			}
			if (result == null) {
				result = caseEModelElement(intValueStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattablestylePackage.INT_LIST_VALUE_STYLE: {
			IntListValueStyle intListValueStyle = (IntListValueStyle) theEObject;
			T result = caseIntListValueStyle(intListValueStyle);
			if (result == null) {
				result = caseNamedStyle(intListValueStyle);
			}
			if (result == null) {
				result = caseStyle(intListValueStyle);
			}
			if (result == null) {
				result = caseEModelElement(intListValueStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattablestylePackage.BOOLEAN_VALUE_STYLE: {
			BooleanValueStyle booleanValueStyle = (BooleanValueStyle) theEObject;
			T result = caseBooleanValueStyle(booleanValueStyle);
			if (result == null) {
				result = caseNamedStyle(booleanValueStyle);
			}
			if (result == null) {
				result = caseStyle(booleanValueStyle);
			}
			if (result == null) {
				result = caseEModelElement(booleanValueStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattablestylePackage.BOOLEAN_LIST_VALUE_STYLE: {
			BooleanListValueStyle booleanListValueStyle = (BooleanListValueStyle) theEObject;
			T result = caseBooleanListValueStyle(booleanListValueStyle);
			if (result == null) {
				result = caseNamedStyle(booleanListValueStyle);
			}
			if (result == null) {
				result = caseStyle(booleanListValueStyle);
			}
			if (result == null) {
				result = caseEModelElement(booleanListValueStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattablestylePackage.DOUBLE_VALUE_STYLE: {
			DoubleValueStyle doubleValueStyle = (DoubleValueStyle) theEObject;
			T result = caseDoubleValueStyle(doubleValueStyle);
			if (result == null) {
				result = caseNamedStyle(doubleValueStyle);
			}
			if (result == null) {
				result = caseStyle(doubleValueStyle);
			}
			if (result == null) {
				result = caseEModelElement(doubleValueStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattablestylePackage.DOUBLE_LIST_VALUE_STYLE: {
			DoubleListValueStyle doubleListValueStyle = (DoubleListValueStyle) theEObject;
			T result = caseDoubleListValueStyle(doubleListValueStyle);
			if (result == null) {
				result = caseNamedStyle(doubleListValueStyle);
			}
			if (result == null) {
				result = caseStyle(doubleListValueStyle);
			}
			if (result == null) {
				result = caseEModelElement(doubleListValueStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattablestylePackage.STRING_VALUE_STYLE: {
			StringValueStyle stringValueStyle = (StringValueStyle) theEObject;
			T result = caseStringValueStyle(stringValueStyle);
			if (result == null) {
				result = caseNamedStyle(stringValueStyle);
			}
			if (result == null) {
				result = caseStyle(stringValueStyle);
			}
			if (result == null) {
				result = caseEModelElement(stringValueStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattablestylePackage.STRING_LIST_VALUE_STYLE: {
			StringListValueStyle stringListValueStyle = (StringListValueStyle) theEObject;
			T result = caseStringListValueStyle(stringListValueStyle);
			if (result == null) {
				result = caseNamedStyle(stringListValueStyle);
			}
			if (result == null) {
				result = caseStyle(stringListValueStyle);
			}
			if (result == null) {
				result = caseEModelElement(stringListValueStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattablestylePackage.STYLED_ELEMENT: {
			StyledElement styledElement = (StyledElement) theEObject;
			T result = caseStyledElement(styledElement);
			if (result == null) {
				result = caseEModelElement(styledElement);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattablestylePackage.TABLE_DISPLAY_STYLE: {
			TableDisplayStyle tableDisplayStyle = (TableDisplayStyle) theEObject;
			T result = caseTableDisplayStyle(tableDisplayStyle);
			if (result == null) {
				result = caseStyle(tableDisplayStyle);
			}
			if (result == null) {
				result = caseEModelElement(tableDisplayStyle);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyle(Style object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedStyle(NamedStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontStyle(FontStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Text Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Text Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellTextStyle(CellTextStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Value Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntValueStyle(IntValueStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int List Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int List Value Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntListValueStyle(IntListValueStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValueStyle(BooleanValueStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean List Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean List Value Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanListValueStyle(BooleanListValueStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Value Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleValueStyle(DoubleValueStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double List Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double List Value Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleListValueStyle(DoubleListValueStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValueStyle(StringValueStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String List Value Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String List Value Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringListValueStyle(StringListValueStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Styled Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Styled Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyledElement(StyledElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Display Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Display Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableDisplayStyle(TableDisplayStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEModelElement(EModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // NattablestyleSwitch
