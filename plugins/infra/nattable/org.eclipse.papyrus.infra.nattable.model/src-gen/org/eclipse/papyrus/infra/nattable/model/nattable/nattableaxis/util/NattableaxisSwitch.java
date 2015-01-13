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
package org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.util;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.AxisGroup;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EObjectAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EObjectTreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EStructuralFeatureAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EStructuralFeatureTreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureIdAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureIdTreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureTreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IdAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IdTreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.NattableaxisPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ObjectAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ObjectIdAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ObjectIdTreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ObjectTreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StyledElement;

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
 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.NattableaxisPackage
 * @generated
 */
public class NattableaxisSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static NattableaxisPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NattableaxisSwitch() {
		if (modelPackage == null) {
			modelPackage = NattableaxisPackage.eINSTANCE;
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
		case NattableaxisPackage.IAXIS: {
			IAxis iAxis = (IAxis) theEObject;
			T result = caseIAxis(iAxis);
			if (result == null) {
				result = caseStyledElement(iAxis);
			}
			if (result == null) {
				result = caseEModelElement(iAxis);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattableaxisPackage.ITREE_ITEM_AXIS: {
			ITreeItemAxis iTreeItemAxis = (ITreeItemAxis) theEObject;
			T result = caseITreeItemAxis(iTreeItemAxis);
			if (result == null) {
				result = caseIAxis(iTreeItemAxis);
			}
			if (result == null) {
				result = caseStyledElement(iTreeItemAxis);
			}
			if (result == null) {
				result = caseEModelElement(iTreeItemAxis);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattableaxisPackage.ID_AXIS: {
			IdAxis idAxis = (IdAxis) theEObject;
			T result = caseIdAxis(idAxis);
			if (result == null) {
				result = caseIAxis(idAxis);
			}
			if (result == null) {
				result = caseStyledElement(idAxis);
			}
			if (result == null) {
				result = caseEModelElement(idAxis);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattableaxisPackage.ID_TREE_ITEM_AXIS: {
			IdTreeItemAxis idTreeItemAxis = (IdTreeItemAxis) theEObject;
			T result = caseIdTreeItemAxis(idTreeItemAxis);
			if (result == null) {
				result = caseIdAxis(idTreeItemAxis);
			}
			if (result == null) {
				result = caseITreeItemAxis(idTreeItemAxis);
			}
			if (result == null) {
				result = caseIAxis(idTreeItemAxis);
			}
			if (result == null) {
				result = caseStyledElement(idTreeItemAxis);
			}
			if (result == null) {
				result = caseEModelElement(idTreeItemAxis);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattableaxisPackage.EOBJECT_AXIS: {
			EObjectAxis eObjectAxis = (EObjectAxis) theEObject;
			T result = caseEObjectAxis(eObjectAxis);
			if (result == null) {
				result = caseObjectAxis(eObjectAxis);
			}
			if (result == null) {
				result = caseIAxis(eObjectAxis);
			}
			if (result == null) {
				result = caseStyledElement(eObjectAxis);
			}
			if (result == null) {
				result = caseEModelElement(eObjectAxis);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattableaxisPackage.EOBJECT_TREE_ITEM_AXIS: {
			EObjectTreeItemAxis eObjectTreeItemAxis = (EObjectTreeItemAxis) theEObject;
			T result = caseEObjectTreeItemAxis(eObjectTreeItemAxis);
			if (result == null) {
				result = caseEObjectAxis(eObjectTreeItemAxis);
			}
			if (result == null) {
				result = caseITreeItemAxis(eObjectTreeItemAxis);
			}
			if (result == null) {
				result = caseObjectAxis(eObjectTreeItemAxis);
			}
			if (result == null) {
				result = caseIAxis(eObjectTreeItemAxis);
			}
			if (result == null) {
				result = caseStyledElement(eObjectTreeItemAxis);
			}
			if (result == null) {
				result = caseEModelElement(eObjectTreeItemAxis);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattableaxisPackage.FEATURE_AXIS: {
			FeatureAxis featureAxis = (FeatureAxis) theEObject;
			T result = caseFeatureAxis(featureAxis);
			if (result == null) {
				result = caseIAxis(featureAxis);
			}
			if (result == null) {
				result = caseStyledElement(featureAxis);
			}
			if (result == null) {
				result = caseEModelElement(featureAxis);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattableaxisPackage.FEATURE_TREE_ITEM_AXIS: {
			FeatureTreeItemAxis featureTreeItemAxis = (FeatureTreeItemAxis) theEObject;
			T result = caseFeatureTreeItemAxis(featureTreeItemAxis);
			if (result == null) {
				result = caseFeatureAxis(featureTreeItemAxis);
			}
			if (result == null) {
				result = caseITreeItemAxis(featureTreeItemAxis);
			}
			if (result == null) {
				result = caseIAxis(featureTreeItemAxis);
			}
			if (result == null) {
				result = caseStyledElement(featureTreeItemAxis);
			}
			if (result == null) {
				result = caseEModelElement(featureTreeItemAxis);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattableaxisPackage.OBJECT_AXIS: {
			ObjectAxis objectAxis = (ObjectAxis) theEObject;
			T result = caseObjectAxis(objectAxis);
			if (result == null) {
				result = caseIAxis(objectAxis);
			}
			if (result == null) {
				result = caseStyledElement(objectAxis);
			}
			if (result == null) {
				result = caseEModelElement(objectAxis);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattableaxisPackage.OBJECT_TREE_ITEM_AXIS: {
			ObjectTreeItemAxis objectTreeItemAxis = (ObjectTreeItemAxis) theEObject;
			T result = caseObjectTreeItemAxis(objectTreeItemAxis);
			if (result == null) {
				result = caseObjectAxis(objectTreeItemAxis);
			}
			if (result == null) {
				result = caseITreeItemAxis(objectTreeItemAxis);
			}
			if (result == null) {
				result = caseIAxis(objectTreeItemAxis);
			}
			if (result == null) {
				result = caseStyledElement(objectTreeItemAxis);
			}
			if (result == null) {
				result = caseEModelElement(objectTreeItemAxis);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattableaxisPackage.FEATURE_ID_AXIS: {
			FeatureIdAxis featureIdAxis = (FeatureIdAxis) theEObject;
			T result = caseFeatureIdAxis(featureIdAxis);
			if (result == null) {
				result = caseIdAxis(featureIdAxis);
			}
			if (result == null) {
				result = caseFeatureAxis(featureIdAxis);
			}
			if (result == null) {
				result = caseIAxis(featureIdAxis);
			}
			if (result == null) {
				result = caseStyledElement(featureIdAxis);
			}
			if (result == null) {
				result = caseEModelElement(featureIdAxis);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattableaxisPackage.FEATURE_ID_TREE_ITEM_AXIS: {
			FeatureIdTreeItemAxis featureIdTreeItemAxis = (FeatureIdTreeItemAxis) theEObject;
			T result = caseFeatureIdTreeItemAxis(featureIdTreeItemAxis);
			if (result == null) {
				result = caseFeatureIdAxis(featureIdTreeItemAxis);
			}
			if (result == null) {
				result = caseITreeItemAxis(featureIdTreeItemAxis);
			}
			if (result == null) {
				result = caseIdAxis(featureIdTreeItemAxis);
			}
			if (result == null) {
				result = caseFeatureAxis(featureIdTreeItemAxis);
			}
			if (result == null) {
				result = caseIAxis(featureIdTreeItemAxis);
			}
			if (result == null) {
				result = caseStyledElement(featureIdTreeItemAxis);
			}
			if (result == null) {
				result = caseEModelElement(featureIdTreeItemAxis);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattableaxisPackage.ESTRUCTURAL_FEATURE_AXIS: {
			EStructuralFeatureAxis eStructuralFeatureAxis = (EStructuralFeatureAxis) theEObject;
			T result = caseEStructuralFeatureAxis(eStructuralFeatureAxis);
			if (result == null) {
				result = caseFeatureAxis(eStructuralFeatureAxis);
			}
			if (result == null) {
				result = caseIAxis(eStructuralFeatureAxis);
			}
			if (result == null) {
				result = caseStyledElement(eStructuralFeatureAxis);
			}
			if (result == null) {
				result = caseEModelElement(eStructuralFeatureAxis);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattableaxisPackage.ESTRUCTURAL_FEATURE_TREE_ITEM_AXIS: {
			EStructuralFeatureTreeItemAxis eStructuralFeatureTreeItemAxis = (EStructuralFeatureTreeItemAxis) theEObject;
			T result = caseEStructuralFeatureTreeItemAxis(eStructuralFeatureTreeItemAxis);
			if (result == null) {
				result = caseEStructuralFeatureAxis(eStructuralFeatureTreeItemAxis);
			}
			if (result == null) {
				result = caseITreeItemAxis(eStructuralFeatureTreeItemAxis);
			}
			if (result == null) {
				result = caseFeatureAxis(eStructuralFeatureTreeItemAxis);
			}
			if (result == null) {
				result = caseIAxis(eStructuralFeatureTreeItemAxis);
			}
			if (result == null) {
				result = caseStyledElement(eStructuralFeatureTreeItemAxis);
			}
			if (result == null) {
				result = caseEModelElement(eStructuralFeatureTreeItemAxis);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattableaxisPackage.OBJECT_ID_AXIS: {
			ObjectIdAxis objectIdAxis = (ObjectIdAxis) theEObject;
			T result = caseObjectIdAxis(objectIdAxis);
			if (result == null) {
				result = caseIdAxis(objectIdAxis);
			}
			if (result == null) {
				result = caseObjectAxis(objectIdAxis);
			}
			if (result == null) {
				result = caseIAxis(objectIdAxis);
			}
			if (result == null) {
				result = caseStyledElement(objectIdAxis);
			}
			if (result == null) {
				result = caseEModelElement(objectIdAxis);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattableaxisPackage.OBJECT_ID_TREE_ITEM_AXIS: {
			ObjectIdTreeItemAxis objectIdTreeItemAxis = (ObjectIdTreeItemAxis) theEObject;
			T result = caseObjectIdTreeItemAxis(objectIdTreeItemAxis);
			if (result == null) {
				result = caseObjectIdAxis(objectIdTreeItemAxis);
			}
			if (result == null) {
				result = caseITreeItemAxis(objectIdTreeItemAxis);
			}
			if (result == null) {
				result = caseIdAxis(objectIdTreeItemAxis);
			}
			if (result == null) {
				result = caseObjectAxis(objectIdTreeItemAxis);
			}
			if (result == null) {
				result = caseIAxis(objectIdTreeItemAxis);
			}
			if (result == null) {
				result = caseStyledElement(objectIdTreeItemAxis);
			}
			if (result == null) {
				result = caseEModelElement(objectIdTreeItemAxis);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case NattableaxisPackage.AXIS_GROUP: {
			AxisGroup axisGroup = (AxisGroup) theEObject;
			T result = caseAxisGroup(axisGroup);
			if (result == null) {
				result = caseIAxis(axisGroup);
			}
			if (result == null) {
				result = caseStyledElement(axisGroup);
			}
			if (result == null) {
				result = caseEModelElement(axisGroup);
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
	 * Returns the result of interpreting the object as an instance of '<em>IAxis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAxis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAxis(IAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITree Item Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITree Item Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITreeItemAxis(ITreeItemAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdAxis(IdAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id Tree Item Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id Tree Item Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdTreeItemAxis(IdTreeItemAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEObjectAxis(EObjectAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject Tree Item Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject Tree Item Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEObjectTreeItemAxis(EObjectTreeItemAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureAxis(FeatureAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Tree Item Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Tree Item Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureTreeItemAxis(FeatureTreeItemAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectAxis(ObjectAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Tree Item Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Tree Item Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectTreeItemAxis(ObjectTreeItemAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Id Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Id Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureIdAxis(FeatureIdAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Id Tree Item Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Id Tree Item Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureIdTreeItemAxis(FeatureIdTreeItemAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EStructural Feature Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EStructural Feature Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStructuralFeatureAxis(EStructuralFeatureAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EStructural Feature Tree Item Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EStructural Feature Tree Item Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStructuralFeatureTreeItemAxis(EStructuralFeatureTreeItemAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Id Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Id Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectIdAxis(ObjectIdAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Id Tree Item Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Id Tree Item Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectIdTreeItemAxis(ObjectIdTreeItemAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axis Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axis Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxisGroup(AxisGroup object) {
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

} // NattableaxisSwitch
