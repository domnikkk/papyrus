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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EModelElementImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.FontStyle;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.NattablestylePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.FontStyleImpl#getFontColor <em>Font Color</em>}</li>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.FontStyleImpl#getFontName <em>Font Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.FontStyleImpl#getFontHeight <em>Font Height</em>}</li>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.FontStyleImpl#isBold <em>Bold</em>}</li>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.FontStyleImpl#isItalic <em>Italic</em>}</li>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.FontStyleImpl#isUnderline <em>Underline</em>}</li>
 * <li>{@link org.eclipse.papyrus.infra.nattable.model.nattable.nattablestyle.impl.FontStyleImpl#isStrikeThrough <em>Strike Through</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FontStyleImpl extends EModelElementImpl implements FontStyle {
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
	protected static final String FONT_NAME_EDEFAULT = "Tahoma"; //$NON-NLS-1$

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected FontStyleImpl() {
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
		return NattablestylePackage.Literals.FONT_STYLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NattablestylePackage.FONT_STYLE__FONT_COLOR, oldFontColor, fontColor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NattablestylePackage.FONT_STYLE__FONT_NAME, oldFontName, fontName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NattablestylePackage.FONT_STYLE__FONT_HEIGHT, oldFontHeight, fontHeight));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NattablestylePackage.FONT_STYLE__BOLD, oldBold, bold));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NattablestylePackage.FONT_STYLE__ITALIC, oldItalic, italic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NattablestylePackage.FONT_STYLE__UNDERLINE, oldUnderline, underline));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NattablestylePackage.FONT_STYLE__STRIKE_THROUGH, oldStrikeThrough, strikeThrough));
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
		case NattablestylePackage.FONT_STYLE__FONT_COLOR:
			return getFontColor();
		case NattablestylePackage.FONT_STYLE__FONT_NAME:
			return getFontName();
		case NattablestylePackage.FONT_STYLE__FONT_HEIGHT:
			return getFontHeight();
		case NattablestylePackage.FONT_STYLE__BOLD:
			return isBold();
		case NattablestylePackage.FONT_STYLE__ITALIC:
			return isItalic();
		case NattablestylePackage.FONT_STYLE__UNDERLINE:
			return isUnderline();
		case NattablestylePackage.FONT_STYLE__STRIKE_THROUGH:
			return isStrikeThrough();
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
		case NattablestylePackage.FONT_STYLE__FONT_COLOR:
			setFontColor((Integer) newValue);
			return;
		case NattablestylePackage.FONT_STYLE__FONT_NAME:
			setFontName((String) newValue);
			return;
		case NattablestylePackage.FONT_STYLE__FONT_HEIGHT:
			setFontHeight((Integer) newValue);
			return;
		case NattablestylePackage.FONT_STYLE__BOLD:
			setBold((Boolean) newValue);
			return;
		case NattablestylePackage.FONT_STYLE__ITALIC:
			setItalic((Boolean) newValue);
			return;
		case NattablestylePackage.FONT_STYLE__UNDERLINE:
			setUnderline((Boolean) newValue);
			return;
		case NattablestylePackage.FONT_STYLE__STRIKE_THROUGH:
			setStrikeThrough((Boolean) newValue);
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
		case NattablestylePackage.FONT_STYLE__FONT_COLOR:
			setFontColor(FONT_COLOR_EDEFAULT);
			return;
		case NattablestylePackage.FONT_STYLE__FONT_NAME:
			setFontName(FONT_NAME_EDEFAULT);
			return;
		case NattablestylePackage.FONT_STYLE__FONT_HEIGHT:
			setFontHeight(FONT_HEIGHT_EDEFAULT);
			return;
		case NattablestylePackage.FONT_STYLE__BOLD:
			setBold(BOLD_EDEFAULT);
			return;
		case NattablestylePackage.FONT_STYLE__ITALIC:
			setItalic(ITALIC_EDEFAULT);
			return;
		case NattablestylePackage.FONT_STYLE__UNDERLINE:
			setUnderline(UNDERLINE_EDEFAULT);
			return;
		case NattablestylePackage.FONT_STYLE__STRIKE_THROUGH:
			setStrikeThrough(STRIKE_THROUGH_EDEFAULT);
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
		case NattablestylePackage.FONT_STYLE__FONT_COLOR:
			return fontColor != FONT_COLOR_EDEFAULT;
		case NattablestylePackage.FONT_STYLE__FONT_NAME:
			return FONT_NAME_EDEFAULT == null ? fontName != null : !FONT_NAME_EDEFAULT.equals(fontName);
		case NattablestylePackage.FONT_STYLE__FONT_HEIGHT:
			return fontHeight != FONT_HEIGHT_EDEFAULT;
		case NattablestylePackage.FONT_STYLE__BOLD:
			return bold != BOLD_EDEFAULT;
		case NattablestylePackage.FONT_STYLE__ITALIC:
			return italic != ITALIC_EDEFAULT;
		case NattablestylePackage.FONT_STYLE__UNDERLINE:
			return underline != UNDERLINE_EDEFAULT;
		case NattablestylePackage.FONT_STYLE__STRIKE_THROUGH:
			return strikeThrough != STRIKE_THROUGH_EDEFAULT;
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
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fontColor: "); //$NON-NLS-1$
		result.append(fontColor);
		result.append(", fontName: "); //$NON-NLS-1$
		result.append(fontName);
		result.append(", fontHeight: "); //$NON-NLS-1$
		result.append(fontHeight);
		result.append(", bold: "); //$NON-NLS-1$
		result.append(bold);
		result.append(", italic: "); //$NON-NLS-1$
		result.append(italic);
		result.append(", underline: "); //$NON-NLS-1$
		result.append(underline);
		result.append(", strikeThrough: "); //$NON-NLS-1$
		result.append(strikeThrough);
		result.append(')');
		return result.toString();
	}

} // FontStyleImpl
