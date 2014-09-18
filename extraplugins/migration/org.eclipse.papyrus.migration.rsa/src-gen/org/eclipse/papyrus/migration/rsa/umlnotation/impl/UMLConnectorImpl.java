/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.migration.rsa.umlnotation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.impl.ConnectorImpl;
import org.eclipse.papyrus.migration.rsa.umlnotation.PapyrusUMLNotationPackage;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLConnector;
import org.eclipse.papyrus.migration.rsa.umlnotation.UMLView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLConnectorImpl#getFontColor <em>Font Color</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLConnectorImpl#getFontName <em>Font Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLConnectorImpl#getFontHeight <em>Font Height</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLConnectorImpl#isBold <em>Bold</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLConnectorImpl#isItalic <em>Italic</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLConnectorImpl#isUnderline <em>Underline</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLConnectorImpl#isStrikeThrough <em>Strike Through</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLConnectorImpl#getShowStereotype <em>Show Stereotype</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLConnectorImpl#getShowListVisibility <em>Show List Visibility</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLConnectorImpl#isShowListSignature <em>Show List Signature</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLConnectorImpl#getAlignment <em>Alignment</em>}</li>
 * <li>{@link org.eclipse.papyrus.migration.rsa.umlnotation.impl.UMLConnectorImpl#getShowStereotypeAttributeCompartment <em>Show Stereotype Attribute Compartment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLConnectorImpl extends ConnectorImpl implements UMLConnector {

	/**
	 * The default value of the '{@link #getFontColor() <em>Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFontColor()
	 * @generated
	 * @ordered
	 */
	protected static final int FONT_COLOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFontColor() <em>Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFontColor()
	 * @generated
	 * @ordered
	 */
	protected int fontColor = FONT_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_NAME_EDEFAULT = "Tahoma";

	/**
	 * The cached value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
	protected String fontName = FONT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontHeight() <em>Font Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFontHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int FONT_HEIGHT_EDEFAULT = 9;

	/**
	 * The cached value of the '{@link #getFontHeight() <em>Font Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getFontHeight()
	 * @generated
	 * @ordered
	 */
	protected int fontHeight = FONT_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #isBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isBold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isBold()
	 * @generated
	 * @ordered
	 */
	protected boolean bold = BOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #isItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isItalic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ITALIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isItalic()
	 * @generated
	 * @ordered
	 */
	protected boolean italic = ITALIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnderline() <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isUnderline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNDERLINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnderline() <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isUnderline()
	 * @generated
	 * @ordered
	 */
	protected boolean underline = UNDERLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStrikeThrough() <em>Strike Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isStrikeThrough()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRIKE_THROUGH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStrikeThrough() <em>Strike Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isStrikeThrough()
	 * @generated
	 * @ordered
	 */
	protected boolean strikeThrough = STRIKE_THROUGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getShowStereotype() <em>Show Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getShowStereotype()
	 * @generated
	 * @ordered
	 */
	protected static final String SHOW_STEREOTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShowStereotype() <em>Show Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getShowStereotype()
	 * @generated
	 * @ordered
	 */
	protected String showStereotype = SHOW_STEREOTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShowListVisibility() <em>Show List Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getShowListVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final String SHOW_LIST_VISIBILITY_EDEFAULT = "None";

	/**
	 * The cached value of the '{@link #getShowListVisibility() <em>Show List Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getShowListVisibility()
	 * @generated
	 * @ordered
	 */
	protected String showListVisibility = SHOW_LIST_VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowListSignature() <em>Show List Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isShowListSignature()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_LIST_SIGNATURE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowListSignature() <em>Show List Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isShowListSignature()
	 * @generated
	 * @ordered
	 */
	protected boolean showListSignature = SHOW_LIST_SIGNATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected String alignment = ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getShowStereotypeAttributeCompartment() <em>Show Stereotype Attribute Compartment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getShowStereotypeAttributeCompartment()
	 * @generated
	 * @ordered
	 */
	protected static final String SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShowStereotypeAttributeCompartment() <em>Show Stereotype Attribute Compartment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getShowStereotypeAttributeCompartment()
	 * @generated
	 * @ordered
	 */
	protected String showStereotypeAttributeCompartment = SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected UMLConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PapyrusUMLNotationPackage.Literals.UML_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int getFontColor() {
		return fontColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setFontColor(int newFontColor) {
		int oldFontColor = fontColor;
		fontColor = newFontColor;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusUMLNotationPackage.UML_CONNECTOR__FONT_COLOR, oldFontColor, fontColor));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getFontName() {
		return fontName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setFontName(String newFontName) {
		String oldFontName = fontName;
		fontName = newFontName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusUMLNotationPackage.UML_CONNECTOR__FONT_NAME, oldFontName, fontName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int getFontHeight() {
		return fontHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setFontHeight(int newFontHeight) {
		int oldFontHeight = fontHeight;
		fontHeight = newFontHeight;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusUMLNotationPackage.UML_CONNECTOR__FONT_HEIGHT, oldFontHeight, fontHeight));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isBold() {
		return bold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setBold(boolean newBold) {
		boolean oldBold = bold;
		bold = newBold;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusUMLNotationPackage.UML_CONNECTOR__BOLD, oldBold, bold));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isItalic() {
		return italic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setItalic(boolean newItalic) {
		boolean oldItalic = italic;
		italic = newItalic;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusUMLNotationPackage.UML_CONNECTOR__ITALIC, oldItalic, italic));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isUnderline() {
		return underline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setUnderline(boolean newUnderline) {
		boolean oldUnderline = underline;
		underline = newUnderline;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusUMLNotationPackage.UML_CONNECTOR__UNDERLINE, oldUnderline, underline));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isStrikeThrough() {
		return strikeThrough;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setStrikeThrough(boolean newStrikeThrough) {
		boolean oldStrikeThrough = strikeThrough;
		strikeThrough = newStrikeThrough;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusUMLNotationPackage.UML_CONNECTOR__STRIKE_THROUGH, oldStrikeThrough, strikeThrough));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getShowStereotype() {
		return showStereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setShowStereotype(String newShowStereotype) {
		String oldShowStereotype = showStereotype;
		showStereotype = newShowStereotype;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_STEREOTYPE, oldShowStereotype, showStereotype));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getShowListVisibility() {
		return showListVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setShowListVisibility(String newShowListVisibility) {
		String oldShowListVisibility = showListVisibility;
		showListVisibility = newShowListVisibility;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_LIST_VISIBILITY, oldShowListVisibility, showListVisibility));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isShowListSignature() {
		return showListSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setShowListSignature(boolean newShowListSignature) {
		boolean oldShowListSignature = showListSignature;
		showListSignature = newShowListSignature;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_LIST_SIGNATURE, oldShowListSignature, showListSignature));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setAlignment(String newAlignment) {
		String oldAlignment = alignment;
		alignment = newAlignment;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusUMLNotationPackage.UML_CONNECTOR__ALIGNMENT, oldAlignment, alignment));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getShowStereotypeAttributeCompartment() {
		return showStereotypeAttributeCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setShowStereotypeAttributeCompartment(String newShowStereotypeAttributeCompartment) {
		String oldShowStereotypeAttributeCompartment = showStereotypeAttributeCompartment;
		showStereotypeAttributeCompartment = newShowStereotypeAttributeCompartment;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT, oldShowStereotypeAttributeCompartment, showStereotypeAttributeCompartment));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PapyrusUMLNotationPackage.UML_CONNECTOR__FONT_COLOR:
			return getFontColor();
		case PapyrusUMLNotationPackage.UML_CONNECTOR__FONT_NAME:
			return getFontName();
		case PapyrusUMLNotationPackage.UML_CONNECTOR__FONT_HEIGHT:
			return getFontHeight();
		case PapyrusUMLNotationPackage.UML_CONNECTOR__BOLD:
			return isBold();
		case PapyrusUMLNotationPackage.UML_CONNECTOR__ITALIC:
			return isItalic();
		case PapyrusUMLNotationPackage.UML_CONNECTOR__UNDERLINE:
			return isUnderline();
		case PapyrusUMLNotationPackage.UML_CONNECTOR__STRIKE_THROUGH:
			return isStrikeThrough();
		case PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_STEREOTYPE:
			return getShowStereotype();
		case PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_LIST_VISIBILITY:
			return getShowListVisibility();
		case PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_LIST_SIGNATURE:
			return isShowListSignature();
		case PapyrusUMLNotationPackage.UML_CONNECTOR__ALIGNMENT:
			return getAlignment();
		case PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT:
			return getShowStereotypeAttributeCompartment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PapyrusUMLNotationPackage.UML_CONNECTOR__FONT_COLOR:
			setFontColor((Integer) newValue);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__FONT_NAME:
			setFontName((String) newValue);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__FONT_HEIGHT:
			setFontHeight((Integer) newValue);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__BOLD:
			setBold((Boolean) newValue);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__ITALIC:
			setItalic((Boolean) newValue);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__UNDERLINE:
			setUnderline((Boolean) newValue);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__STRIKE_THROUGH:
			setStrikeThrough((Boolean) newValue);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_STEREOTYPE:
			setShowStereotype((String) newValue);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_LIST_VISIBILITY:
			setShowListVisibility((String) newValue);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_LIST_SIGNATURE:
			setShowListSignature((Boolean) newValue);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__ALIGNMENT:
			setAlignment((String) newValue);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT:
			setShowStereotypeAttributeCompartment((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PapyrusUMLNotationPackage.UML_CONNECTOR__FONT_COLOR:
			setFontColor(FONT_COLOR_EDEFAULT);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__FONT_NAME:
			setFontName(FONT_NAME_EDEFAULT);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__FONT_HEIGHT:
			setFontHeight(FONT_HEIGHT_EDEFAULT);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__BOLD:
			setBold(BOLD_EDEFAULT);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__ITALIC:
			setItalic(ITALIC_EDEFAULT);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__UNDERLINE:
			setUnderline(UNDERLINE_EDEFAULT);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__STRIKE_THROUGH:
			setStrikeThrough(STRIKE_THROUGH_EDEFAULT);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_STEREOTYPE:
			setShowStereotype(SHOW_STEREOTYPE_EDEFAULT);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_LIST_VISIBILITY:
			setShowListVisibility(SHOW_LIST_VISIBILITY_EDEFAULT);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_LIST_SIGNATURE:
			setShowListSignature(SHOW_LIST_SIGNATURE_EDEFAULT);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__ALIGNMENT:
			setAlignment(ALIGNMENT_EDEFAULT);
			return;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT:
			setShowStereotypeAttributeCompartment(SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PapyrusUMLNotationPackage.UML_CONNECTOR__FONT_COLOR:
			return fontColor != FONT_COLOR_EDEFAULT;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__FONT_NAME:
			return FONT_NAME_EDEFAULT == null ? fontName != null : !FONT_NAME_EDEFAULT.equals(fontName);
		case PapyrusUMLNotationPackage.UML_CONNECTOR__FONT_HEIGHT:
			return fontHeight != FONT_HEIGHT_EDEFAULT;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__BOLD:
			return bold != BOLD_EDEFAULT;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__ITALIC:
			return italic != ITALIC_EDEFAULT;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__UNDERLINE:
			return underline != UNDERLINE_EDEFAULT;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__STRIKE_THROUGH:
			return strikeThrough != STRIKE_THROUGH_EDEFAULT;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_STEREOTYPE:
			return SHOW_STEREOTYPE_EDEFAULT == null ? showStereotype != null : !SHOW_STEREOTYPE_EDEFAULT.equals(showStereotype);
		case PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_LIST_VISIBILITY:
			return SHOW_LIST_VISIBILITY_EDEFAULT == null ? showListVisibility != null : !SHOW_LIST_VISIBILITY_EDEFAULT.equals(showListVisibility);
		case PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_LIST_SIGNATURE:
			return showListSignature != SHOW_LIST_SIGNATURE_EDEFAULT;
		case PapyrusUMLNotationPackage.UML_CONNECTOR__ALIGNMENT:
			return ALIGNMENT_EDEFAULT == null ? alignment != null : !ALIGNMENT_EDEFAULT.equals(alignment);
		case PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT:
			return SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT_EDEFAULT == null ? showStereotypeAttributeCompartment != null : !SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT_EDEFAULT.equals(showStereotypeAttributeCompartment);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == FontStyle.class) {
			switch (derivedFeatureID) {
			case PapyrusUMLNotationPackage.UML_CONNECTOR__FONT_COLOR:
				return NotationPackage.FONT_STYLE__FONT_COLOR;
			case PapyrusUMLNotationPackage.UML_CONNECTOR__FONT_NAME:
				return NotationPackage.FONT_STYLE__FONT_NAME;
			case PapyrusUMLNotationPackage.UML_CONNECTOR__FONT_HEIGHT:
				return NotationPackage.FONT_STYLE__FONT_HEIGHT;
			case PapyrusUMLNotationPackage.UML_CONNECTOR__BOLD:
				return NotationPackage.FONT_STYLE__BOLD;
			case PapyrusUMLNotationPackage.UML_CONNECTOR__ITALIC:
				return NotationPackage.FONT_STYLE__ITALIC;
			case PapyrusUMLNotationPackage.UML_CONNECTOR__UNDERLINE:
				return NotationPackage.FONT_STYLE__UNDERLINE;
			case PapyrusUMLNotationPackage.UML_CONNECTOR__STRIKE_THROUGH:
				return NotationPackage.FONT_STYLE__STRIKE_THROUGH;
			default:
				return -1;
			}
		}
		if (baseClass == UMLView.class) {
			switch (derivedFeatureID) {
			case PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_STEREOTYPE:
				return PapyrusUMLNotationPackage.UML_VIEW__SHOW_STEREOTYPE;
			case PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_LIST_VISIBILITY:
				return PapyrusUMLNotationPackage.UML_VIEW__SHOW_LIST_VISIBILITY;
			case PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_LIST_SIGNATURE:
				return PapyrusUMLNotationPackage.UML_VIEW__SHOW_LIST_SIGNATURE;
			case PapyrusUMLNotationPackage.UML_CONNECTOR__ALIGNMENT:
				return PapyrusUMLNotationPackage.UML_VIEW__ALIGNMENT;
			case PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT:
				return PapyrusUMLNotationPackage.UML_VIEW__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == FontStyle.class) {
			switch (baseFeatureID) {
			case NotationPackage.FONT_STYLE__FONT_COLOR:
				return PapyrusUMLNotationPackage.UML_CONNECTOR__FONT_COLOR;
			case NotationPackage.FONT_STYLE__FONT_NAME:
				return PapyrusUMLNotationPackage.UML_CONNECTOR__FONT_NAME;
			case NotationPackage.FONT_STYLE__FONT_HEIGHT:
				return PapyrusUMLNotationPackage.UML_CONNECTOR__FONT_HEIGHT;
			case NotationPackage.FONT_STYLE__BOLD:
				return PapyrusUMLNotationPackage.UML_CONNECTOR__BOLD;
			case NotationPackage.FONT_STYLE__ITALIC:
				return PapyrusUMLNotationPackage.UML_CONNECTOR__ITALIC;
			case NotationPackage.FONT_STYLE__UNDERLINE:
				return PapyrusUMLNotationPackage.UML_CONNECTOR__UNDERLINE;
			case NotationPackage.FONT_STYLE__STRIKE_THROUGH:
				return PapyrusUMLNotationPackage.UML_CONNECTOR__STRIKE_THROUGH;
			default:
				return -1;
			}
		}
		if (baseClass == UMLView.class) {
			switch (baseFeatureID) {
			case PapyrusUMLNotationPackage.UML_VIEW__SHOW_STEREOTYPE:
				return PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_STEREOTYPE;
			case PapyrusUMLNotationPackage.UML_VIEW__SHOW_LIST_VISIBILITY:
				return PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_LIST_VISIBILITY;
			case PapyrusUMLNotationPackage.UML_VIEW__SHOW_LIST_SIGNATURE:
				return PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_LIST_SIGNATURE;
			case PapyrusUMLNotationPackage.UML_VIEW__ALIGNMENT:
				return PapyrusUMLNotationPackage.UML_CONNECTOR__ALIGNMENT;
			case PapyrusUMLNotationPackage.UML_VIEW__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT:
				return PapyrusUMLNotationPackage.UML_CONNECTOR__SHOW_STEREOTYPE_ATTRIBUTE_COMPARTMENT;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fontColor: ");
		result.append(fontColor);
		result.append(", fontName: ");
		result.append(fontName);
		result.append(", fontHeight: ");
		result.append(fontHeight);
		result.append(", bold: ");
		result.append(bold);
		result.append(", italic: ");
		result.append(italic);
		result.append(", underline: ");
		result.append(underline);
		result.append(", strikeThrough: ");
		result.append(strikeThrough);
		result.append(", showStereotype: ");
		result.append(showStereotype);
		result.append(", showListVisibility: ");
		result.append(showListVisibility);
		result.append(", showListSignature: ");
		result.append(showListSignature);
		result.append(", alignment: ");
		result.append(alignment);
		result.append(", showStereotypeAttributeCompartment: ");
		result.append(showStereotypeAttributeCompartment);
		result.append(')');
		return result.toString();
	}

} // UMLConnectorImpl
