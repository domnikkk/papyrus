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
package org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.papyrus.infra.nattable.model.nattable.NattablePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.impl.NattablePackageImpl;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.NattableaxisPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.impl.NattableaxisPackageImpl;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.NattableaxisconfigurationPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.impl.NattableaxisconfigurationPackageImpl;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisprovider.NattableaxisproviderPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisprovider.impl.NattableaxisproviderPackageImpl;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablecell.NattablecellPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablecell.impl.NattablecellPackageImpl;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableconfiguration.NattableconfigurationPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableconfiguration.impl.NattableconfigurationPackageImpl;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablelabelprovider.NattablelabelproviderPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablelabelprovider.impl.NattablelabelproviderPackageImpl;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableproblem.NattableproblemPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableproblem.impl.NattableproblemPackageImpl;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanListValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.BooleanValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextAlignment;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.CellTextStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DisplayStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DoubleListValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.DoubleValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntListValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.IntValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NamedStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestyleFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StringListValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StringValueStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.Style;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.StyledElement;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.TableDisplayStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattabletester.NattabletesterPackage;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattabletester.impl.NattabletesterPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NattablestylePackageImpl extends EPackageImpl implements NattablestylePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass styleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass namedStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass fontStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass cellTextStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass intValueStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass intListValueStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass booleanValueStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass booleanListValueStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass doubleValueStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass doubleListValueStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass stringValueStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass stringListValueStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass styledElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass tableDisplayStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EEnum cellTextAlignmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EEnum displayStyleEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the package, or returns the registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NattablestylePackageImpl() {
		super(eNS_URI, NattablestyleFactory.eINSTANCE);
	}

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
	 * This method is used to initialize {@link NattablestylePackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NattablestylePackage init() {
		if (isInited) {
			return (NattablestylePackage) EPackage.Registry.INSTANCE.getEPackage(NattablestylePackage.eNS_URI);
		}

		// Obtain or create and register package
		NattablestylePackageImpl theNattablestylePackage = (NattablestylePackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NattablestylePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NattablestylePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		NattablePackageImpl theNattablePackage = (NattablePackageImpl) (EPackage.Registry.INSTANCE.getEPackage(NattablePackage.eNS_URI) instanceof NattablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NattablePackage.eNS_URI)
				: NattablePackage.eINSTANCE);
		NattableconfigurationPackageImpl theNattableconfigurationPackage = (NattableconfigurationPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(NattableconfigurationPackage.eNS_URI) instanceof NattableconfigurationPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(NattableconfigurationPackage.eNS_URI)
				: NattableconfigurationPackage.eINSTANCE);
		NattableaxisproviderPackageImpl theNattableaxisproviderPackage = (NattableaxisproviderPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(NattableaxisproviderPackage.eNS_URI) instanceof NattableaxisproviderPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(NattableaxisproviderPackage.eNS_URI) : NattableaxisproviderPackage.eINSTANCE);
		NattablelabelproviderPackageImpl theNattablelabelproviderPackage = (NattablelabelproviderPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(NattablelabelproviderPackage.eNS_URI) instanceof NattablelabelproviderPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(NattablelabelproviderPackage.eNS_URI)
				: NattablelabelproviderPackage.eINSTANCE);
		NattableaxisconfigurationPackageImpl theNattableaxisconfigurationPackage = (NattableaxisconfigurationPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(NattableaxisconfigurationPackage.eNS_URI) instanceof NattableaxisconfigurationPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(NattableaxisconfigurationPackage.eNS_URI)
				: NattableaxisconfigurationPackage.eINSTANCE);
		NattabletesterPackageImpl theNattabletesterPackage = (NattabletesterPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(NattabletesterPackage.eNS_URI) instanceof NattabletesterPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(NattabletesterPackage.eNS_URI) : NattabletesterPackage.eINSTANCE);
		NattableaxisPackageImpl theNattableaxisPackage = (NattableaxisPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(NattableaxisPackage.eNS_URI) instanceof NattableaxisPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NattableaxisPackage.eNS_URI)
				: NattableaxisPackage.eINSTANCE);
		NattablecellPackageImpl theNattablecellPackage = (NattablecellPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(NattablecellPackage.eNS_URI) instanceof NattablecellPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NattablecellPackage.eNS_URI)
				: NattablecellPackage.eINSTANCE);
		NattableproblemPackageImpl theNattableproblemPackage = (NattableproblemPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(NattableproblemPackage.eNS_URI) instanceof NattableproblemPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(NattableproblemPackage.eNS_URI) : NattableproblemPackage.eINSTANCE);

		// Create package meta-data objects
		theNattablestylePackage.createPackageContents();
		theNattablePackage.createPackageContents();
		theNattableconfigurationPackage.createPackageContents();
		theNattableaxisproviderPackage.createPackageContents();
		theNattablelabelproviderPackage.createPackageContents();
		theNattableaxisconfigurationPackage.createPackageContents();
		theNattabletesterPackage.createPackageContents();
		theNattableaxisPackage.createPackageContents();
		theNattablecellPackage.createPackageContents();
		theNattableproblemPackage.createPackageContents();

		// Initialize created meta-data
		theNattablestylePackage.initializePackageContents();
		theNattablePackage.initializePackageContents();
		theNattableconfigurationPackage.initializePackageContents();
		theNattableaxisproviderPackage.initializePackageContents();
		theNattablelabelproviderPackage.initializePackageContents();
		theNattableaxisconfigurationPackage.initializePackageContents();
		theNattabletesterPackage.initializePackageContents();
		theNattableaxisPackage.initializePackageContents();
		theNattablecellPackage.initializePackageContents();
		theNattableproblemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNattablestylePackage.freeze();


		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NattablestylePackage.eNS_URI, theNattablestylePackage);
		return theNattablestylePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStyle() {
		return styleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getNamedStyle() {
		return namedStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getNamedStyle_Name() {
		return (EAttribute) namedStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getFontStyle() {
		return fontStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getFontStyle_FontColor() {
		return (EAttribute) fontStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getFontStyle_FontName() {
		return (EAttribute) fontStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getFontStyle_FontHeight() {
		return (EAttribute) fontStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getFontStyle_Bold() {
		return (EAttribute) fontStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getFontStyle_Italic() {
		return (EAttribute) fontStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getFontStyle_Underline() {
		return (EAttribute) fontStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getFontStyle_StrikeThrough() {
		return (EAttribute) fontStyleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getCellTextStyle() {
		return cellTextStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getCellTextStyle_Alignment() {
		return (EAttribute) cellTextStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getIntValueStyle() {
		return intValueStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getIntValueStyle_IntValue() {
		return (EAttribute) intValueStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getIntListValueStyle() {
		return intListValueStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getIntListValueStyle_IntListValue() {
		return (EAttribute) intListValueStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getBooleanValueStyle() {
		return booleanValueStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getBooleanValueStyle_BooleanValue() {
		return (EAttribute) booleanValueStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getBooleanListValueStyle() {
		return booleanListValueStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getBooleanListValueStyle_BooleanListValue() {
		return (EAttribute) booleanListValueStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getDoubleValueStyle() {
		return doubleValueStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getDoubleValueStyle_DoubleValue() {
		return (EAttribute) doubleValueStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getDoubleListValueStyle() {
		return doubleListValueStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getDoubleListValueStyle_DoubleListValue() {
		return (EAttribute) doubleListValueStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStringValueStyle() {
		return stringValueStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getStringValueStyle_StringValue() {
		return (EAttribute) stringValueStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStringListValueStyle() {
		return stringListValueStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getStringListValueStyle_StringListValue() {
		return (EAttribute) stringListValueStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStyledElement() {
		return styledElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getStyledElement_Styles() {
		return (EReference) styledElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getStyledElement__GetNamedStyle__EClass_String() {
		return styledElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getStyledElement__GetStyle__EClass() {
		return styledElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getStyledElement__CreateStyle__EClass() {
		return styledElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getTableDisplayStyle() {
		return tableDisplayStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getTableDisplayStyle_DisplayStyle() {
		return (EAttribute) tableDisplayStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEnum getCellTextAlignment() {
		return cellTextAlignmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEnum getDisplayStyle() {
		return displayStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NattablestyleFactory getNattablestyleFactory() {
		return (NattablestyleFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isCreated = false;

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
		styleEClass = createEClass(STYLE);

		namedStyleEClass = createEClass(NAMED_STYLE);
		createEAttribute(namedStyleEClass, NAMED_STYLE__NAME);

		fontStyleEClass = createEClass(FONT_STYLE);
		createEAttribute(fontStyleEClass, FONT_STYLE__FONT_COLOR);
		createEAttribute(fontStyleEClass, FONT_STYLE__FONT_NAME);
		createEAttribute(fontStyleEClass, FONT_STYLE__FONT_HEIGHT);
		createEAttribute(fontStyleEClass, FONT_STYLE__BOLD);
		createEAttribute(fontStyleEClass, FONT_STYLE__ITALIC);
		createEAttribute(fontStyleEClass, FONT_STYLE__UNDERLINE);
		createEAttribute(fontStyleEClass, FONT_STYLE__STRIKE_THROUGH);

		cellTextStyleEClass = createEClass(CELL_TEXT_STYLE);
		createEAttribute(cellTextStyleEClass, CELL_TEXT_STYLE__ALIGNMENT);

		intValueStyleEClass = createEClass(INT_VALUE_STYLE);
		createEAttribute(intValueStyleEClass, INT_VALUE_STYLE__INT_VALUE);

		intListValueStyleEClass = createEClass(INT_LIST_VALUE_STYLE);
		createEAttribute(intListValueStyleEClass, INT_LIST_VALUE_STYLE__INT_LIST_VALUE);

		booleanValueStyleEClass = createEClass(BOOLEAN_VALUE_STYLE);
		createEAttribute(booleanValueStyleEClass, BOOLEAN_VALUE_STYLE__BOOLEAN_VALUE);

		booleanListValueStyleEClass = createEClass(BOOLEAN_LIST_VALUE_STYLE);
		createEAttribute(booleanListValueStyleEClass, BOOLEAN_LIST_VALUE_STYLE__BOOLEAN_LIST_VALUE);

		doubleValueStyleEClass = createEClass(DOUBLE_VALUE_STYLE);
		createEAttribute(doubleValueStyleEClass, DOUBLE_VALUE_STYLE__DOUBLE_VALUE);

		doubleListValueStyleEClass = createEClass(DOUBLE_LIST_VALUE_STYLE);
		createEAttribute(doubleListValueStyleEClass, DOUBLE_LIST_VALUE_STYLE__DOUBLE_LIST_VALUE);

		stringValueStyleEClass = createEClass(STRING_VALUE_STYLE);
		createEAttribute(stringValueStyleEClass, STRING_VALUE_STYLE__STRING_VALUE);

		stringListValueStyleEClass = createEClass(STRING_LIST_VALUE_STYLE);
		createEAttribute(stringListValueStyleEClass, STRING_LIST_VALUE_STYLE__STRING_LIST_VALUE);

		styledElementEClass = createEClass(STYLED_ELEMENT);
		createEReference(styledElementEClass, STYLED_ELEMENT__STYLES);
		createEOperation(styledElementEClass, STYLED_ELEMENT___GET_NAMED_STYLE__ECLASS_STRING);
		createEOperation(styledElementEClass, STYLED_ELEMENT___GET_STYLE__ECLASS);
		createEOperation(styledElementEClass, STYLED_ELEMENT___CREATE_STYLE__ECLASS);

		tableDisplayStyleEClass = createEClass(TABLE_DISPLAY_STYLE);
		createEAttribute(tableDisplayStyleEClass, TABLE_DISPLAY_STYLE__DISPLAY_STYLE);

		// Create enums
		cellTextAlignmentEEnum = createEEnum(CELL_TEXT_ALIGNMENT);
		displayStyleEEnum = createEEnum(DISPLAY_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isInitialized = false;

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
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		styleEClass.getESuperTypes().add(theEcorePackage.getEModelElement());
		namedStyleEClass.getESuperTypes().add(this.getStyle());
		fontStyleEClass.getESuperTypes().add(this.getStyle());
		cellTextStyleEClass.getESuperTypes().add(this.getStyle());
		intValueStyleEClass.getESuperTypes().add(this.getNamedStyle());
		intListValueStyleEClass.getESuperTypes().add(this.getNamedStyle());
		booleanValueStyleEClass.getESuperTypes().add(this.getNamedStyle());
		booleanListValueStyleEClass.getESuperTypes().add(this.getNamedStyle());
		doubleValueStyleEClass.getESuperTypes().add(this.getNamedStyle());
		doubleListValueStyleEClass.getESuperTypes().add(this.getNamedStyle());
		stringValueStyleEClass.getESuperTypes().add(this.getNamedStyle());
		stringListValueStyleEClass.getESuperTypes().add(this.getNamedStyle());
		styledElementEClass.getESuperTypes().add(theEcorePackage.getEModelElement());
		tableDisplayStyleEClass.getESuperTypes().add(this.getStyle());

		// Initialize classes, features, and operations; add parameters
		initEClass(styleEClass, Style.class, "Style", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(namedStyleEClass, NamedStyle.class, "NamedStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getNamedStyle_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(fontStyleEClass, FontStyle.class, "FontStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getFontStyle_FontColor(), ecorePackage.getEInt(), "fontColor", "0", 0, 1, FontStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getFontStyle_FontName(), ecorePackage.getEString(), "fontName", "Tahoma", 0, 1, FontStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getFontStyle_FontHeight(), ecorePackage.getEInt(), "fontHeight", "9", 0, 1, FontStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getFontStyle_Bold(), ecorePackage.getEBoolean(), "bold", "false", 0, 1, FontStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getFontStyle_Italic(), ecorePackage.getEBoolean(), "italic", "false", 0, 1, FontStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getFontStyle_Underline(), ecorePackage.getEBoolean(), "underline", "false", 0, 1, FontStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getFontStyle_StrikeThrough(), ecorePackage.getEBoolean(), "strikeThrough", "false", 0, 1, FontStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(cellTextStyleEClass, CellTextStyle.class, "CellTextStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCellTextStyle_Alignment(), this.getCellTextAlignment(), "alignment", "MIDDLE_LEFT", 0, 1, CellTextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(intValueStyleEClass, IntValueStyle.class, "IntValueStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getIntValueStyle_IntValue(), ecorePackage.getEInt(), "intValue", null, 0, 1, IntValueStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(intListValueStyleEClass, IntListValueStyle.class, "IntListValueStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getIntListValueStyle_IntListValue(), ecorePackage.getEInt(), "intListValue", null, 0, -1, IntListValueStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(booleanValueStyleEClass, BooleanValueStyle.class, "BooleanValueStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getBooleanValueStyle_BooleanValue(), ecorePackage.getEBoolean(), "booleanValue", null, 0, 1, BooleanValueStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(booleanListValueStyleEClass, BooleanListValueStyle.class, "BooleanListValueStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getBooleanListValueStyle_BooleanListValue(), ecorePackage.getEBooleanObject(),
				"booleanListValue", null, 0, -1, BooleanListValueStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(doubleValueStyleEClass, DoubleValueStyle.class, "DoubleValueStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDoubleValueStyle_DoubleValue(), ecorePackage.getEDouble(), "doubleValue", null, 0, 1, DoubleValueStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(doubleListValueStyleEClass, DoubleListValueStyle.class, "DoubleListValueStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDoubleListValueStyle_DoubleListValue(), ecorePackage.getEDoubleObject(),
				"doubleListValue", null, 0, -1, DoubleListValueStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(stringValueStyleEClass, StringValueStyle.class, "StringValueStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStringValueStyle_StringValue(), ecorePackage.getEString(), "stringValue", null, 0, 1, StringValueStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(stringListValueStyleEClass, StringListValueStyle.class, "StringListValueStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStringListValueStyle_StringListValue(), ecorePackage.getEString(), "stringListValue", null, 0, -1, StringListValueStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(styledElementEClass, StyledElement.class, "StyledElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getStyledElement_Styles(), this.getStyle(), null, "styles", null, 0, -1, StyledElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		EOperation op = initEOperation(getStyledElement__GetNamedStyle__EClass_String(), this.getNamedStyle(), "getNamedStyle", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEClass(), "eClass", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getStyledElement__GetStyle__EClass(), this.getStyle(), "getStyle", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEClass(), "eClass", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getStyledElement__CreateStyle__EClass(), this.getStyle(), "createStyle", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEClass(), "eClass", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(tableDisplayStyleEClass, TableDisplayStyle.class, "TableDisplayStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTableDisplayStyle_DisplayStyle(), this.getDisplayStyle(), "displayStyle", "NORMAL", 1, 1, TableDisplayStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		// Initialize enums and add enum literals
		initEEnum(cellTextAlignmentEEnum, CellTextAlignment.class, "CellTextAlignment"); //$NON-NLS-1$
		addEEnumLiteral(cellTextAlignmentEEnum, CellTextAlignment.TOP_LEFT);
		addEEnumLiteral(cellTextAlignmentEEnum, CellTextAlignment.TOP_CENTER);
		addEEnumLiteral(cellTextAlignmentEEnum, CellTextAlignment.TOP_RIGHT);
		addEEnumLiteral(cellTextAlignmentEEnum, CellTextAlignment.MIDDLE_LEFT);
		addEEnumLiteral(cellTextAlignmentEEnum, CellTextAlignment.MIDDLE_CENTER);
		addEEnumLiteral(cellTextAlignmentEEnum, CellTextAlignment.MIDDLE_RIGHT);
		addEEnumLiteral(cellTextAlignmentEEnum, CellTextAlignment.BOTTOM_LEFT);
		addEEnumLiteral(cellTextAlignmentEEnum, CellTextAlignment.BOTTOM_CENTER);
		addEEnumLiteral(cellTextAlignmentEEnum, CellTextAlignment.BOTTOM_RIGHT);

		initEEnum(displayStyleEEnum, DisplayStyle.class, "DisplayStyle"); //$NON-NLS-1$
		addEEnumLiteral(displayStyleEEnum, DisplayStyle.NORMAL);
		addEEnumLiteral(displayStyleEEnum, DisplayStyle.HIERARCHIC_SINGLE_TREE_COLUMN);
		addEEnumLiteral(displayStyleEEnum, DisplayStyle.HIERARCHIC_MULTI_TREE_COLUMN);
	}

} // NattablestylePackageImpl
