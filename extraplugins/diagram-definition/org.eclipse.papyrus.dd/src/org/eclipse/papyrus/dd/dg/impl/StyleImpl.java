/**
 * Copyright (c) 2014 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.dd.dg.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.dd.dg.DGPackage;
import org.eclipse.papyrus.dd.dg.FontDecoration;
import org.eclipse.papyrus.dd.dg.Paint;
import org.eclipse.papyrus.dd.dg.Style;

import org.eclipse.papyrus.dd.dg.util.DGValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Style</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.papyrus.dd.dg.impl.StyleImpl#getFill <em>Fill</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.impl.StyleImpl#getFillOpacity <em>Fill Opacity</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.impl.StyleImpl#getStroke <em>Stroke</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.impl.StyleImpl#getStrokeWidth <em>Stroke Width</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.impl.StyleImpl#getStrokeOpacity <em>Stroke Opacity</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.impl.StyleImpl#getStrokeDashLengths <em>Stroke Dash Length</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.impl.StyleImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.impl.StyleImpl#getFontName <em>Font Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.impl.StyleImpl#isFontItalic <em>Font Italic</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.impl.StyleImpl#isFontBold <em>Font Bold</em>}</li>
 *   <li>{@link org.eclipse.papyrus.dd.dg.impl.StyleImpl#getFontDecoration <em>Font Decoration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StyleImpl extends MinimalEObjectImpl.Container implements Style {
	/**
	 * The cached value of the '{@link #getFill() <em>Fill</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFill()
	 * @generated
	 * @ordered
	 */
	protected Paint fill;

	/**
	 * This is true if the Fill containment reference has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean fillESet;

	/**
	 * The default value of the '{@link #getFillOpacity() <em>Fill Opacity</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFillOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final double FILL_OPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFillOpacity() <em>Fill Opacity</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFillOpacity()
	 * @generated
	 * @ordered
	 */
	protected double fillOpacity = FILL_OPACITY_EDEFAULT;

	/**
	 * This is true if the Fill Opacity attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean fillOpacityESet;

	/**
	 * The cached value of the '{@link #getStroke() <em>Stroke</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected Paint stroke;

	/**
	 * This is true if the Stroke containment reference has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean strokeESet;

	/**
	 * The default value of the '{@link #getStrokeWidth() <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double STROKE_WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStrokeWidth() <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected double strokeWidth = STROKE_WIDTH_EDEFAULT;

	/**
	 * This is true if the Stroke Width attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean strokeWidthESet;

	/**
	 * The default value of the '{@link #getStrokeOpacity() <em>Stroke Opacity</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getStrokeOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final double STROKE_OPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStrokeOpacity() <em>Stroke Opacity</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getStrokeOpacity()
	 * @generated
	 * @ordered
	 */
	protected double strokeOpacity = STROKE_OPACITY_EDEFAULT;

	/**
	 * This is true if the Stroke Opacity attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean strokeOpacityESet;

	/**
	 * The cached value of the '{@link #getStrokeDashLengths() <em>Stroke Dash Length</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDashLengths()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> strokeDashLengths;

	/**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final double FONT_SIZE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected double fontSize = FONT_SIZE_EDEFAULT;

	/**
	 * This is true if the Font Size attribute has been set.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontSizeESet;

	/**
	 * The default value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
	protected String fontName = FONT_NAME_EDEFAULT;

	/**
	 * This is true if the Font Name attribute has been set.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontNameESet;

	/**
	 * The default value of the '{@link #isFontItalic() <em>Font Italic</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isFontItalic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FONT_ITALIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFontItalic() <em>Font Italic</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isFontItalic()
	 * @generated
	 * @ordered
	 */
	protected boolean fontItalic = FONT_ITALIC_EDEFAULT;

	/**
	 * This is true if the Font Italic attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean fontItalicESet;

	/**
	 * The default value of the '{@link #isFontBold() <em>Font Bold</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isFontBold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FONT_BOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFontBold() <em>Font Bold</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isFontBold()
	 * @generated
	 * @ordered
	 */
	protected boolean fontBold = FONT_BOLD_EDEFAULT;

	/**
	 * This is true if the Font Bold attribute has been set.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontBoldESet;

	/**
	 * The default value of the '{@link #getFontDecoration() <em>Font Decoration</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getFontDecoration()
	 * @generated
	 * @ordered
	 */
	protected static final FontDecoration FONT_DECORATION_EDEFAULT = FontDecoration.UNDERLINE;

	/**
	 * The cached value of the '{@link #getFontDecoration() <em>Font Decoration</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getFontDecoration()
	 * @generated
	 * @ordered
	 */
	protected FontDecoration fontDecoration = FONT_DECORATION_EDEFAULT;

	/**
	 * This is true if the Font Decoration attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean fontDecorationESet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DGPackage.Literals.STYLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Paint getFill() {
		return fill;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFill(Paint newFill, NotificationChain msgs) {
		Paint oldFill = fill;
		fill = newFill;
		boolean oldFillESet = fillESet;
		fillESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.STYLE__FILL, oldFill, newFill, !oldFillESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill(Paint newFill) {
		if (newFill != fill) {
			NotificationChain msgs = null;
			if (fill != null)
				msgs = ((InternalEObject)fill).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.STYLE__FILL, null, msgs);
			if (newFill != null)
				msgs = ((InternalEObject)newFill).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.STYLE__FILL, null, msgs);
			msgs = basicSetFill(newFill, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFillESet = fillESet;
			fillESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.STYLE__FILL, newFill, newFill, !oldFillESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetFill(NotificationChain msgs) {
		Paint oldFill = fill;
		fill = null;
		boolean oldFillESet = fillESet;
		fillESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, DGPackage.STYLE__FILL, oldFill, null, oldFillESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFill() {
		if (fill != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)fill).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.STYLE__FILL, null, msgs);
			msgs = basicUnsetFill(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFillESet = fillESet;
			fillESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, DGPackage.STYLE__FILL, null, null, oldFillESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFill() {
		return fillESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getFillOpacity() {
		return fillOpacity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillOpacity(double newFillOpacity) {
		double oldFillOpacity = fillOpacity;
		fillOpacity = newFillOpacity;
		boolean oldFillOpacityESet = fillOpacityESet;
		fillOpacityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.STYLE__FILL_OPACITY, oldFillOpacity, fillOpacity, !oldFillOpacityESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFillOpacity() {
		double oldFillOpacity = fillOpacity;
		boolean oldFillOpacityESet = fillOpacityESet;
		fillOpacity = FILL_OPACITY_EDEFAULT;
		fillOpacityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DGPackage.STYLE__FILL_OPACITY, oldFillOpacity, FILL_OPACITY_EDEFAULT, oldFillOpacityESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFillOpacity() {
		return fillOpacityESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Paint getStroke() {
		return stroke;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStroke(Paint newStroke,
			NotificationChain msgs) {
		Paint oldStroke = stroke;
		stroke = newStroke;
		boolean oldStrokeESet = strokeESet;
		strokeESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGPackage.STYLE__STROKE, oldStroke, newStroke, !oldStrokeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStroke(Paint newStroke) {
		if (newStroke != stroke) {
			NotificationChain msgs = null;
			if (stroke != null)
				msgs = ((InternalEObject)stroke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.STYLE__STROKE, null, msgs);
			if (newStroke != null)
				msgs = ((InternalEObject)newStroke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGPackage.STYLE__STROKE, null, msgs);
			msgs = basicSetStroke(newStroke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldStrokeESet = strokeESet;
			strokeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.STYLE__STROKE, newStroke, newStroke, !oldStrokeESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetStroke(NotificationChain msgs) {
		Paint oldStroke = stroke;
		stroke = null;
		boolean oldStrokeESet = strokeESet;
		strokeESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, DGPackage.STYLE__STROKE, oldStroke, null, oldStrokeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStroke() {
		if (stroke != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)stroke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGPackage.STYLE__STROKE, null, msgs);
			msgs = basicUnsetStroke(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldStrokeESet = strokeESet;
			strokeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, DGPackage.STYLE__STROKE, null, null, oldStrokeESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStroke() {
		return strokeESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getStrokeWidth() {
		return strokeWidth;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeWidth(double newStrokeWidth) {
		double oldStrokeWidth = strokeWidth;
		strokeWidth = newStrokeWidth;
		boolean oldStrokeWidthESet = strokeWidthESet;
		strokeWidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.STYLE__STROKE_WIDTH, oldStrokeWidth, strokeWidth, !oldStrokeWidthESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeWidth() {
		double oldStrokeWidth = strokeWidth;
		boolean oldStrokeWidthESet = strokeWidthESet;
		strokeWidth = STROKE_WIDTH_EDEFAULT;
		strokeWidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DGPackage.STYLE__STROKE_WIDTH, oldStrokeWidth, STROKE_WIDTH_EDEFAULT, oldStrokeWidthESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeWidth() {
		return strokeWidthESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getStrokeOpacity() {
		return strokeOpacity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeOpacity(double newStrokeOpacity) {
		double oldStrokeOpacity = strokeOpacity;
		strokeOpacity = newStrokeOpacity;
		boolean oldStrokeOpacityESet = strokeOpacityESet;
		strokeOpacityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.STYLE__STROKE_OPACITY, oldStrokeOpacity, strokeOpacity, !oldStrokeOpacityESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeOpacity() {
		double oldStrokeOpacity = strokeOpacity;
		boolean oldStrokeOpacityESet = strokeOpacityESet;
		strokeOpacity = STROKE_OPACITY_EDEFAULT;
		strokeOpacityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DGPackage.STYLE__STROKE_OPACITY, oldStrokeOpacity, STROKE_OPACITY_EDEFAULT, oldStrokeOpacityESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeOpacity() {
		return strokeOpacityESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getStrokeDashLengths() {
		if (strokeDashLengths == null) {
			strokeDashLengths = new EDataTypeEList.Unsettable<Double>(Double.class, this, DGPackage.STYLE__STROKE_DASH_LENGTH);
		}
		return strokeDashLengths;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeDashLengths() {
		if (strokeDashLengths != null) ((InternalEList.Unsettable<?>)strokeDashLengths).unset();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeDashLengths() {
		return strokeDashLengths != null && ((InternalEList.Unsettable<?>)strokeDashLengths).isSet();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getFontSize() {
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(double newFontSize) {
		double oldFontSize = fontSize;
		fontSize = newFontSize;
		boolean oldFontSizeESet = fontSizeESet;
		fontSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.STYLE__FONT_SIZE, oldFontSize, fontSize, !oldFontSizeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontSize() {
		double oldFontSize = fontSize;
		boolean oldFontSizeESet = fontSizeESet;
		fontSize = FONT_SIZE_EDEFAULT;
		fontSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DGPackage.STYLE__FONT_SIZE, oldFontSize, FONT_SIZE_EDEFAULT, oldFontSizeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontSize() {
		return fontSizeESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontName() {
		return fontName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontName(String newFontName) {
		String oldFontName = fontName;
		fontName = newFontName;
		boolean oldFontNameESet = fontNameESet;
		fontNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.STYLE__FONT_NAME, oldFontName, fontName, !oldFontNameESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontName() {
		String oldFontName = fontName;
		boolean oldFontNameESet = fontNameESet;
		fontName = FONT_NAME_EDEFAULT;
		fontNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DGPackage.STYLE__FONT_NAME, oldFontName, FONT_NAME_EDEFAULT, oldFontNameESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontName() {
		return fontNameESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFontItalic() {
		return fontItalic;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontItalic(boolean newFontItalic) {
		boolean oldFontItalic = fontItalic;
		fontItalic = newFontItalic;
		boolean oldFontItalicESet = fontItalicESet;
		fontItalicESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.STYLE__FONT_ITALIC, oldFontItalic, fontItalic, !oldFontItalicESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontItalic() {
		boolean oldFontItalic = fontItalic;
		boolean oldFontItalicESet = fontItalicESet;
		fontItalic = FONT_ITALIC_EDEFAULT;
		fontItalicESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DGPackage.STYLE__FONT_ITALIC, oldFontItalic, FONT_ITALIC_EDEFAULT, oldFontItalicESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontItalic() {
		return fontItalicESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFontBold() {
		return fontBold;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontBold(boolean newFontBold) {
		boolean oldFontBold = fontBold;
		fontBold = newFontBold;
		boolean oldFontBoldESet = fontBoldESet;
		fontBoldESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.STYLE__FONT_BOLD, oldFontBold, fontBold, !oldFontBoldESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontBold() {
		boolean oldFontBold = fontBold;
		boolean oldFontBoldESet = fontBoldESet;
		fontBold = FONT_BOLD_EDEFAULT;
		fontBoldESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DGPackage.STYLE__FONT_BOLD, oldFontBold, FONT_BOLD_EDEFAULT, oldFontBoldESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontBold() {
		return fontBoldESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FontDecoration getFontDecoration() {
		return fontDecoration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontDecoration(FontDecoration newFontDecoration) {
		FontDecoration oldFontDecoration = fontDecoration;
		fontDecoration = newFontDecoration == null ? FONT_DECORATION_EDEFAULT : newFontDecoration;
		boolean oldFontDecorationESet = fontDecorationESet;
		fontDecorationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DGPackage.STYLE__FONT_DECORATION, oldFontDecoration, fontDecoration, !oldFontDecorationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontDecoration() {
		FontDecoration oldFontDecoration = fontDecoration;
		boolean oldFontDecorationESet = fontDecorationESet;
		fontDecoration = FONT_DECORATION_EDEFAULT;
		fontDecorationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DGPackage.STYLE__FONT_DECORATION, oldFontDecoration, FONT_DECORATION_EDEFAULT, oldFontDecorationESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontDecoration() {
		return fontDecorationESet;
	}

	/**
	 * The cached validation expression for the '{@link #validFontSize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Font Size</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validFontSize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_FONT_SIZE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "fontSize >=  0";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validFontSize(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return
			DGValidator.validate
				(DGPackage.Literals.STYLE,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 DGPackage.Literals.STYLE___VALID_FONT_SIZE__DIAGNOSTICCHAIN_MAP,
				 VALID_FONT_SIZE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DGValidator.DIAGNOSTIC_SOURCE,
				 DGValidator.STYLE__VALID_FONT_SIZE);
	}

	/**
	 * The cached validation expression for the '{@link #validFillOpacity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Fill Opacity</em>}' invariant operation.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #validFillOpacity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_FILL_OPACITY_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "fillOpacity >=  0 and fillOpacity <=1";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validFillOpacity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return
			DGValidator.validate
				(DGPackage.Literals.STYLE,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 DGPackage.Literals.STYLE___VALID_FILL_OPACITY__DIAGNOSTICCHAIN_MAP,
				 VALID_FILL_OPACITY_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DGValidator.DIAGNOSTIC_SOURCE,
				 DGValidator.STYLE__VALID_FILL_OPACITY);
	}

	/**
	 * The cached validation expression for the '{@link #validStrokeWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Stroke Width</em>}' invariant operation.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #validStrokeWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_STROKE_WIDTH_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "strokeWidth >=  0";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validStrokeWidth(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return
			DGValidator.validate
				(DGPackage.Literals.STYLE,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 DGPackage.Literals.STYLE___VALID_STROKE_WIDTH__DIAGNOSTICCHAIN_MAP,
				 VALID_STROKE_WIDTH_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DGValidator.DIAGNOSTIC_SOURCE,
				 DGValidator.STYLE__VALID_STROKE_WIDTH);
	}

	/**
	 * The cached validation expression for the '
	 * {@link #validDashLengthSize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Valid Dash Length Size</em>}' invariant operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validDashLengthSize(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_DASH_LENGTH_SIZE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "strokeDashLength->size().mod(2) = 0";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validDashLengthSize(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return
			DGValidator.validate
				(DGPackage.Literals.STYLE,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 DGPackage.Literals.STYLE___VALID_DASH_LENGTH_SIZE__DIAGNOSTICCHAIN_MAP,
				 VALID_DASH_LENGTH_SIZE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DGValidator.DIAGNOSTIC_SOURCE,
				 DGValidator.STYLE__VALID_DASH_LENGTH_SIZE);
	}

	/**
	 * The cached validation expression for the '{@link #validStrokeOpacity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Stroke Opacity</em>}' invariant operation.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #validStrokeOpacity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_STROKE_OPACITY_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "strokeOpacity >=  0 and strokeOpacity <=1";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validStrokeOpacity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return
			DGValidator.validate
				(DGPackage.Literals.STYLE,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 DGPackage.Literals.STYLE___VALID_STROKE_OPACITY__DIAGNOSTICCHAIN_MAP,
				 VALID_STROKE_OPACITY_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DGValidator.DIAGNOSTIC_SOURCE,
				 DGValidator.STYLE__VALID_STROKE_OPACITY);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DGPackage.STYLE__FILL:
				return basicUnsetFill(msgs);
			case DGPackage.STYLE__STROKE:
				return basicUnsetStroke(msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DGPackage.STYLE__FILL:
				return getFill();
			case DGPackage.STYLE__FILL_OPACITY:
				return getFillOpacity();
			case DGPackage.STYLE__STROKE:
				return getStroke();
			case DGPackage.STYLE__STROKE_WIDTH:
				return getStrokeWidth();
			case DGPackage.STYLE__STROKE_OPACITY:
				return getStrokeOpacity();
			case DGPackage.STYLE__STROKE_DASH_LENGTH:
				return getStrokeDashLengths();
			case DGPackage.STYLE__FONT_SIZE:
				return getFontSize();
			case DGPackage.STYLE__FONT_NAME:
				return getFontName();
			case DGPackage.STYLE__FONT_ITALIC:
				return isFontItalic();
			case DGPackage.STYLE__FONT_BOLD:
				return isFontBold();
			case DGPackage.STYLE__FONT_DECORATION:
				return getFontDecoration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DGPackage.STYLE__FILL:
				setFill((Paint)newValue);
				return;
			case DGPackage.STYLE__FILL_OPACITY:
				setFillOpacity((Double)newValue);
				return;
			case DGPackage.STYLE__STROKE:
				setStroke((Paint)newValue);
				return;
			case DGPackage.STYLE__STROKE_WIDTH:
				setStrokeWidth((Double)newValue);
				return;
			case DGPackage.STYLE__STROKE_OPACITY:
				setStrokeOpacity((Double)newValue);
				return;
			case DGPackage.STYLE__STROKE_DASH_LENGTH:
				getStrokeDashLengths().clear();
				getStrokeDashLengths().addAll((Collection<? extends Double>)newValue);
				return;
			case DGPackage.STYLE__FONT_SIZE:
				setFontSize((Double)newValue);
				return;
			case DGPackage.STYLE__FONT_NAME:
				setFontName((String)newValue);
				return;
			case DGPackage.STYLE__FONT_ITALIC:
				setFontItalic((Boolean)newValue);
				return;
			case DGPackage.STYLE__FONT_BOLD:
				setFontBold((Boolean)newValue);
				return;
			case DGPackage.STYLE__FONT_DECORATION:
				setFontDecoration((FontDecoration)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DGPackage.STYLE__FILL:
				unsetFill();
				return;
			case DGPackage.STYLE__FILL_OPACITY:
				unsetFillOpacity();
				return;
			case DGPackage.STYLE__STROKE:
				unsetStroke();
				return;
			case DGPackage.STYLE__STROKE_WIDTH:
				unsetStrokeWidth();
				return;
			case DGPackage.STYLE__STROKE_OPACITY:
				unsetStrokeOpacity();
				return;
			case DGPackage.STYLE__STROKE_DASH_LENGTH:
				unsetStrokeDashLengths();
				return;
			case DGPackage.STYLE__FONT_SIZE:
				unsetFontSize();
				return;
			case DGPackage.STYLE__FONT_NAME:
				unsetFontName();
				return;
			case DGPackage.STYLE__FONT_ITALIC:
				unsetFontItalic();
				return;
			case DGPackage.STYLE__FONT_BOLD:
				unsetFontBold();
				return;
			case DGPackage.STYLE__FONT_DECORATION:
				unsetFontDecoration();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DGPackage.STYLE__FILL:
				return isSetFill();
			case DGPackage.STYLE__FILL_OPACITY:
				return isSetFillOpacity();
			case DGPackage.STYLE__STROKE:
				return isSetStroke();
			case DGPackage.STYLE__STROKE_WIDTH:
				return isSetStrokeWidth();
			case DGPackage.STYLE__STROKE_OPACITY:
				return isSetStrokeOpacity();
			case DGPackage.STYLE__STROKE_DASH_LENGTH:
				return isSetStrokeDashLengths();
			case DGPackage.STYLE__FONT_SIZE:
				return isSetFontSize();
			case DGPackage.STYLE__FONT_NAME:
				return isSetFontName();
			case DGPackage.STYLE__FONT_ITALIC:
				return isSetFontItalic();
			case DGPackage.STYLE__FONT_BOLD:
				return isSetFontBold();
			case DGPackage.STYLE__FONT_DECORATION:
				return isSetFontDecoration();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case DGPackage.STYLE___VALID_FONT_SIZE__DIAGNOSTICCHAIN_MAP:
				return validFontSize((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DGPackage.STYLE___VALID_FILL_OPACITY__DIAGNOSTICCHAIN_MAP:
				return validFillOpacity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DGPackage.STYLE___VALID_STROKE_WIDTH__DIAGNOSTICCHAIN_MAP:
				return validStrokeWidth((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DGPackage.STYLE___VALID_DASH_LENGTH_SIZE__DIAGNOSTICCHAIN_MAP:
				return validDashLengthSize((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case DGPackage.STYLE___VALID_STROKE_OPACITY__DIAGNOSTICCHAIN_MAP:
				return validStrokeOpacity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fillOpacity: ");
		if (fillOpacityESet) result.append(fillOpacity); else result.append("<unset>");
		result.append(", strokeWidth: ");
		if (strokeWidthESet) result.append(strokeWidth); else result.append("<unset>");
		result.append(", strokeOpacity: ");
		if (strokeOpacityESet) result.append(strokeOpacity); else result.append("<unset>");
		result.append(", strokeDashLength: ");
		result.append(strokeDashLengths);
		result.append(", fontSize: ");
		if (fontSizeESet) result.append(fontSize); else result.append("<unset>");
		result.append(", fontName: ");
		if (fontNameESet) result.append(fontName); else result.append("<unset>");
		result.append(", fontItalic: ");
		if (fontItalicESet) result.append(fontItalic); else result.append("<unset>");
		result.append(", fontBold: ");
		if (fontBoldESet) result.append(fontBold); else result.append("<unset>");
		result.append(", fontDecoration: ");
		if (fontDecorationESet) result.append(fontDecoration); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // StyleImpl
