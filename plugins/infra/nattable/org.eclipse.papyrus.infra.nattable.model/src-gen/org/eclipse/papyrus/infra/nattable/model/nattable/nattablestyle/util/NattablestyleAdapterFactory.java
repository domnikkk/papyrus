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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage
 * @generated
 */
public class NattablestyleAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static NattablestylePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NattablestyleAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NattablestylePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 *
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected NattablestyleSwitch<Adapter> modelSwitch =
			new NattablestyleSwitch<Adapter>() {
				@Override
				public Adapter caseStyle(Style object) {
					return createStyleAdapter();
				}

				@Override
				public Adapter caseNamedStyle(NamedStyle object) {
					return createNamedStyleAdapter();
				}

				@Override
				public Adapter caseFontStyle(FontStyle object) {
					return createFontStyleAdapter();
				}

				@Override
				public Adapter caseCellTextStyle(CellTextStyle object) {
					return createCellTextStyleAdapter();
				}

				@Override
				public Adapter caseIntValueStyle(IntValueStyle object) {
					return createIntValueStyleAdapter();
				}

				@Override
				public Adapter caseIntListValueStyle(IntListValueStyle object) {
					return createIntListValueStyleAdapter();
				}

				@Override
				public Adapter caseBooleanValueStyle(BooleanValueStyle object) {
					return createBooleanValueStyleAdapter();
				}

				@Override
				public Adapter caseBooleanListValueStyle(BooleanListValueStyle object) {
					return createBooleanListValueStyleAdapter();
				}

				@Override
				public Adapter caseDoubleValueStyle(DoubleValueStyle object) {
					return createDoubleValueStyleAdapter();
				}

				@Override
				public Adapter caseDoubleListValueStyle(DoubleListValueStyle object) {
					return createDoubleListValueStyleAdapter();
				}

				@Override
				public Adapter caseStringValueStyle(StringValueStyle object) {
					return createStringValueStyleAdapter();
				}

				@Override
				public Adapter caseStringListValueStyle(StringListValueStyle object) {
					return createStringListValueStyleAdapter();
				}

				@Override
				public Adapter caseStyledElement(StyledElement object) {
					return createStyledElementAdapter();
				}

				@Override
				public Adapter caseTableDisplayStyle(TableDisplayStyle object) {
					return createTableDisplayStyleAdapter();
				}

				@Override
				public Adapter caseEModelElement(EModelElement object) {
					return createEModelElementAdapter();
				}

				@Override
				public Adapter defaultCase(EObject object) {
					return createEObjectAdapter();
				}
			};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.Style
	 * @generated
	 */
	public Adapter createStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NamedStyle <em>Named Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NamedStyle
	 * @generated
	 */
	public Adapter createNamedStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle
	 * @generated
	 */
	public Adapter createFontStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextStyle <em>Cell Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextStyle
	 * @generated
	 */
	public Adapter createCellTextStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntValueStyle <em>Int Value Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntValueStyle
	 * @generated
	 */
	public Adapter createIntValueStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntListValueStyle <em>Int List Value Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntListValueStyle
	 * @generated
	 */
	public Adapter createIntListValueStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanValueStyle <em>Boolean Value Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanValueStyle
	 * @generated
	 */
	public Adapter createBooleanValueStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanListValueStyle <em>Boolean List Value Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanListValueStyle
	 * @generated
	 */
	public Adapter createBooleanListValueStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DoubleValueStyle <em>Double Value Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DoubleValueStyle
	 * @generated
	 */
	public Adapter createDoubleValueStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DoubleListValueStyle <em>Double List Value Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DoubleListValueStyle
	 * @generated
	 */
	public Adapter createDoubleListValueStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StringValueStyle <em>String Value Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StringValueStyle
	 * @generated
	 */
	public Adapter createStringValueStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StringListValueStyle <em>String List Value Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StringListValueStyle
	 * @generated
	 */
	public Adapter createStringListValueStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StyledElement <em>Styled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StyledElement
	 * @generated
	 */
	public Adapter createStyledElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.TableDisplayStyle <em>Table Display Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.TableDisplayStyle
	 * @generated
	 */
	public Adapter createTableDisplayStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EModelElement
	 * @generated
	 */
	public Adapter createEModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // NattablestyleAdapterFactory
