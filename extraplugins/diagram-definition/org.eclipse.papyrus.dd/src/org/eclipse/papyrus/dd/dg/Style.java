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
package org.eclipse.papyrus.dd.dg;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Style</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc --> Style contains formatting properties that affect the
 * appearance or style of graphical elements. <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.papyrus.dd.dg.Style#getFill <em>Fill</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Style#getFillOpacity <em>Fill Opacity
 * </em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Style#getStroke <em>Stroke</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Style#getStrokeWidth <em>Stroke Width
 * </em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Style#getStrokeOpacity <em>Stroke
 * Opacity</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Style#getStrokeDashLengths <em>Stroke
 * Dash Length</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Style#getFontSize <em>Font Size</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Style#getFontName <em>Font Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Style#isFontItalic <em>Font Italic</em>}
 * </li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Style#isFontBold <em>Font Bold</em>}</li>
 * <li>{@link org.eclipse.papyrus.dd.dg.Style#getFontDecoration <em>Font
 * Decoration</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyle()
 * @model
 * @generated
 */
public interface Style extends EObject {
	/**
	 * Returns the value of the '<em><b>Fill</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A
	 * paint that is used to fill the enclosed regions of a graphical element.
	 * The default is a black paint. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Fill</em>' containment reference.
	 * @see #isSetFill()
	 * @see #unsetFill()
	 * @see #setFill(Paint)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyle_Fill()
	 * @model containment="true" unsettable="true" ordered="false"
	 * @generated
	 */
	Paint getFill();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Style#getFill
	 * <em>Fill</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Fill</em>' containment reference.
	 * @see #isSetFill()
	 * @see #unsetFill()
	 * @see #getFill()
	 * @generated
	 */
	void setFill(Paint value);

	/**
	 * Unsets the value of the '{@link org.eclipse.papyrus.dd.dg.Style#getFill
	 * <em>Fill</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isSetFill()
	 * @see #getFill()
	 * @see #setFill(Paint)
	 * @generated
	 */
	void unsetFill();

	/**
	 * Returns whether the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getFill <em>Fill</em>}'
	 * containment reference is set. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return whether the value of the '<em>Fill</em>' containment reference is
	 *         set.
	 * @see #unsetFill()
	 * @see #getFill()
	 * @see #setFill(Paint)
	 * @generated
	 */
	boolean isSetFill();

	/**
	 * Returns the value of the '<em><b>Fill Opacity</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A real
	 * number (>=0 and <=1) representing the opacity of the fill used to paint a
	 * graphical element. A value of 0 means totally transparent, while a value
	 * of 1 means totally opaque. The default is 1. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Fill Opacity</em>' attribute.
	 * @see #isSetFillOpacity()
	 * @see #unsetFillOpacity()
	 * @see #setFillOpacity(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyle_FillOpacity()
	 * @model unsettable="true" dataType="org.eclipse.papyrus.dd.dc.Real"
	 *        ordered="false"
	 * @generated
	 */
	double getFillOpacity();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getFillOpacity
	 * <em>Fill Opacity</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Fill Opacity</em>' attribute.
	 * @see #isSetFillOpacity()
	 * @see #unsetFillOpacity()
	 * @see #getFillOpacity()
	 * @generated
	 */
	void setFillOpacity(double value);

	/**
	 * Unsets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getFillOpacity
	 * <em>Fill Opacity</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isSetFillOpacity()
	 * @see #getFillOpacity()
	 * @see #setFillOpacity(double)
	 * @generated
	 */
	void unsetFillOpacity();

	/**
	 * Returns whether the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getFillOpacity
	 * <em>Fill Opacity</em>}' attribute is set. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Fill Opacity</em>' attribute is
	 *         set.
	 * @see #unsetFillOpacity()
	 * @see #getFillOpacity()
	 * @see #setFillOpacity(double)
	 * @generated
	 */
	boolean isSetFillOpacity();

	/**
	 * Returns the value of the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A
	 * paint that is used to stroke a graphical element. The default is no
	 * paint. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Stroke</em>' containment reference.
	 * @see #isSetStroke()
	 * @see #unsetStroke()
	 * @see #setStroke(Paint)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyle_Stroke()
	 * @model containment="true" unsettable="true" ordered="false"
	 * @generated
	 */
	Paint getStroke();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Style#getStroke
	 * <em>Stroke</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Stroke</em>' containment reference.
	 * @see #isSetStroke()
	 * @see #unsetStroke()
	 * @see #getStroke()
	 * @generated
	 */
	void setStroke(Paint value);

	/**
	 * Unsets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getStroke <em>Stroke</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSetStroke()
	 * @see #getStroke()
	 * @see #setStroke(Paint)
	 * @generated
	 */
	void unsetStroke();

	/**
	 * Returns whether the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getStroke <em>Stroke</em>}'
	 * containment reference is set. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return whether the value of the '<em>Stroke</em>' containment reference
	 *         is set.
	 * @see #unsetStroke()
	 * @see #getStroke()
	 * @see #setStroke(Paint)
	 * @generated
	 */
	boolean isSetStroke();

	/**
	 * Returns the value of the '<em><b>Stroke Width</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A real
	 * number (>=0) representing the width of the stroke of a graphical element.
	 * A value of 0 specifies no stroke is painted. The default is 1. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Stroke Width</em>' attribute.
	 * @see #isSetStrokeWidth()
	 * @see #unsetStrokeWidth()
	 * @see #setStrokeWidth(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyle_StrokeWidth()
	 * @model unsettable="true" dataType="org.eclipse.papyrus.dd.dc.Real"
	 *        ordered="false"
	 * @generated
	 */
	double getStrokeWidth();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getStrokeWidth
	 * <em>Stroke Width</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Stroke Width</em>' attribute.
	 * @see #isSetStrokeWidth()
	 * @see #unsetStrokeWidth()
	 * @see #getStrokeWidth()
	 * @generated
	 */
	void setStrokeWidth(double value);

	/**
	 * Unsets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getStrokeWidth
	 * <em>Stroke Width</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isSetStrokeWidth()
	 * @see #getStrokeWidth()
	 * @see #setStrokeWidth(double)
	 * @generated
	 */
	void unsetStrokeWidth();

	/**
	 * Returns whether the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getStrokeWidth
	 * <em>Stroke Width</em>}' attribute is set. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Stroke Width</em>' attribute is
	 *         set.
	 * @see #unsetStrokeWidth()
	 * @see #getStrokeWidth()
	 * @see #setStrokeWidth(double)
	 * @generated
	 */
	boolean isSetStrokeWidth();

	/**
	 * Returns the value of the '<em><b>Stroke Opacity</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A real
	 * number (>=0 and <=1) representing the opacity of the stroke of a
	 * graphical element. A value of 0 means totally transparent, while a value
	 * of 1 means totally opaque. The default is 1. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Stroke Opacity</em>' attribute.
	 * @see #isSetStrokeOpacity()
	 * @see #unsetStrokeOpacity()
	 * @see #setStrokeOpacity(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyle_StrokeOpacity()
	 * @model unsettable="true" dataType="org.eclipse.papyrus.dd.dc.Real"
	 *        ordered="false"
	 * @generated
	 */
	double getStrokeOpacity();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getStrokeOpacity
	 * <em>Stroke Opacity</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Stroke Opacity</em>' attribute.
	 * @see #isSetStrokeOpacity()
	 * @see #unsetStrokeOpacity()
	 * @see #getStrokeOpacity()
	 * @generated
	 */
	void setStrokeOpacity(double value);

	/**
	 * Unsets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getStrokeOpacity
	 * <em>Stroke Opacity</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isSetStrokeOpacity()
	 * @see #getStrokeOpacity()
	 * @see #setStrokeOpacity(double)
	 * @generated
	 */
	void unsetStrokeOpacity();

	/**
	 * Returns whether the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getStrokeOpacity
	 * <em>Stroke Opacity</em>}' attribute is set. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Stroke Opacity</em>' attribute is
	 *         set.
	 * @see #unsetStrokeOpacity()
	 * @see #getStrokeOpacity()
	 * @see #setStrokeOpacity(double)
	 * @generated
	 */
	boolean isSetStrokeOpacity();

	/**
	 * Returns the value of the '<em><b>Stroke Dash Length</b></em>' attribute
	 * list. The list contents are of type {@link java.lang.Double}. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A list
	 * of real numbers specifying a pattern of alternating dash and gap lengths
	 * used in stroking the outline of a graphical element with the first one
	 * specifying a dash length. The size of the list is expected to be even. If
	 * the list is empty, the stroke is drawn solid. The default is empty list.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Stroke Dash Length</em>' attribute list.
	 * @see #isSetStrokeDashLengths()
	 * @see #unsetStrokeDashLengths()
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyle_StrokeDashLength()
	 * @model unique="false" unsettable="true"
	 *        dataType="org.eclipse.papyrus.dd.dc.Real"
	 * @generated
	 */
	EList<Double> getStrokeDashLengths();

	/**
	 * Unsets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getStrokeDashLengths
	 * <em>Stroke Dash Length</em>}' attribute list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetStrokeDashLengths()
	 * @see #getStrokeDashLengths()
	 * @generated
	 */
	void unsetStrokeDashLengths();

	/**
	 * Returns whether the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getStrokeDashLengths
	 * <em>Stroke Dash Length</em>}' attribute list is set. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Stroke Dash Length</em>' attribute
	 *         list is set.
	 * @see #unsetStrokeDashLengths()
	 * @see #getStrokeDashLengths()
	 * @generated
	 */
	boolean isSetStrokeDashLengths();

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A real
	 * number (>=0) representing the size (in unit of length) of the font used
	 * to render a text element. The default is 10. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #isSetFontSize()
	 * @see #unsetFontSize()
	 * @see #setFontSize(double)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyle_FontSize()
	 * @model unsettable="true" dataType="org.eclipse.papyrus.dd.dc.Real"
	 *        ordered="false"
	 * @generated
	 */
	double getFontSize();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getFontSize <em>Font Size</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Font Size</em>' attribute.
	 * @see #isSetFontSize()
	 * @see #unsetFontSize()
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(double value);

	/**
	 * Unsets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getFontSize <em>Font Size</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSetFontSize()
	 * @see #getFontSize()
	 * @see #setFontSize(double)
	 * @generated
	 */
	void unsetFontSize();

	/**
	 * Returns whether the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getFontSize <em>Font Size</em>}'
	 * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Font Size</em>' attribute is set.
	 * @see #unsetFontSize()
	 * @see #getFontSize()
	 * @see #setFontSize(double)
	 * @generated
	 */
	boolean isSetFontSize();

	/**
	 * Returns the value of the '<em><b>Font Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
	 * name of the font used to render a text element (e.g. "Times New Roman",
	 * "Arial" or "Helvetica"). The default is "Arial". <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Font Name</em>' attribute.
	 * @see #isSetFontName()
	 * @see #unsetFontName()
	 * @see #setFontName(String)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyle_FontName()
	 * @model unsettable="true" dataType="org.eclipse.papyrus.dd.dc.String"
	 *        ordered="false"
	 * @generated
	 */
	String getFontName();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getFontName <em>Font Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Font Name</em>' attribute.
	 * @see #isSetFontName()
	 * @see #unsetFontName()
	 * @see #getFontName()
	 * @generated
	 */
	void setFontName(String value);

	/**
	 * Unsets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getFontName <em>Font Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSetFontName()
	 * @see #getFontName()
	 * @see #setFontName(String)
	 * @generated
	 */
	void unsetFontName();

	/**
	 * Returns whether the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getFontName <em>Font Name</em>}'
	 * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Font Name</em>' attribute is set.
	 * @see #unsetFontName()
	 * @see #getFontName()
	 * @see #setFontName(String)
	 * @generated
	 */
	boolean isSetFontName();

	/**
	 * Returns the value of the '<em><b>Font Italic</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Whether
	 * the font used to render a text element has an italic style. The default
	 * is false. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Font Italic</em>' attribute.
	 * @see #isSetFontItalic()
	 * @see #unsetFontItalic()
	 * @see #setFontItalic(boolean)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyle_FontItalic()
	 * @model unsettable="true" dataType="org.eclipse.papyrus.dd.dc.Boolean"
	 *        ordered="false"
	 * @generated
	 */
	boolean isFontItalic();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#isFontItalic <em>Font Italic</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Font Italic</em>' attribute.
	 * @see #isSetFontItalic()
	 * @see #unsetFontItalic()
	 * @see #isFontItalic()
	 * @generated
	 */
	void setFontItalic(boolean value);

	/**
	 * Unsets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#isFontItalic <em>Font Italic</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSetFontItalic()
	 * @see #isFontItalic()
	 * @see #setFontItalic(boolean)
	 * @generated
	 */
	void unsetFontItalic();

	/**
	 * Returns whether the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#isFontItalic <em>Font Italic</em>}
	 * ' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Font Italic</em>' attribute is set.
	 * @see #unsetFontItalic()
	 * @see #isFontItalic()
	 * @see #setFontItalic(boolean)
	 * @generated
	 */
	boolean isSetFontItalic();

	/**
	 * Returns the value of the '<em><b>Font Bold</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Whether
	 * the font used to render a text element has a bold style. The default is
	 * false. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Font Bold</em>' attribute.
	 * @see #isSetFontBold()
	 * @see #unsetFontBold()
	 * @see #setFontBold(boolean)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyle_FontBold()
	 * @model unsettable="true" dataType="org.eclipse.papyrus.dd.dc.Boolean"
	 *        ordered="false"
	 * @generated
	 */
	boolean isFontBold();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.dd.dg.Style#isFontBold
	 * <em>Font Bold</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Font Bold</em>' attribute.
	 * @see #isSetFontBold()
	 * @see #unsetFontBold()
	 * @see #isFontBold()
	 * @generated
	 */
	void setFontBold(boolean value);

	/**
	 * Unsets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#isFontBold <em>Font Bold</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSetFontBold()
	 * @see #isFontBold()
	 * @see #setFontBold(boolean)
	 * @generated
	 */
	void unsetFontBold();

	/**
	 * Returns whether the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#isFontBold <em>Font Bold</em>}'
	 * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Font Bold</em>' attribute is set.
	 * @see #unsetFontBold()
	 * @see #isFontBold()
	 * @see #setFontBold(boolean)
	 * @generated
	 */
	boolean isSetFontBold();

	/**
	 * Returns the value of the '<em><b>Font Decoration</b></em>' attribute. The
	 * literals are from the enumeration
	 * {@link org.eclipse.papyrus.dd.dg.FontDecoration}. <!-- begin-user-doc -->
	 * <!-- end-user-doc --> <!-- begin-model-doc --> The decoration of the font
	 * used to render a text element. The default is no decoration. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Font Decoration</em>' attribute.
	 * @see org.eclipse.papyrus.dd.dg.FontDecoration
	 * @see #isSetFontDecoration()
	 * @see #unsetFontDecoration()
	 * @see #setFontDecoration(FontDecoration)
	 * @see org.eclipse.papyrus.dd.dg.DGPackage#getStyle_FontDecoration()
	 * @model unsettable="true" ordered="false"
	 * @generated
	 */
	FontDecoration getFontDecoration();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getFontDecoration
	 * <em>Font Decoration</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Font Decoration</em>' attribute.
	 * @see org.eclipse.papyrus.dd.dg.FontDecoration
	 * @see #isSetFontDecoration()
	 * @see #unsetFontDecoration()
	 * @see #getFontDecoration()
	 * @generated
	 */
	void setFontDecoration(FontDecoration value);

	/**
	 * Unsets the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getFontDecoration
	 * <em>Font Decoration</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isSetFontDecoration()
	 * @see #getFontDecoration()
	 * @see #setFontDecoration(FontDecoration)
	 * @generated
	 */
	void unsetFontDecoration();

	/**
	 * Returns whether the value of the '
	 * {@link org.eclipse.papyrus.dd.dg.Style#getFontDecoration
	 * <em>Font Decoration</em>}' attribute is set. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Font Decoration</em>' attribute is
	 *         set.
	 * @see #unsetFontDecoration()
	 * @see #getFontDecoration()
	 * @see #setFontDecoration(FontDecoration)
	 * @generated
	 */
	boolean isSetFontDecoration();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the font size is non-negative
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/Ecore/OCL body='fontSize >=  0'"
	 * @generated
	 */
	boolean validFontSize(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the stroke width is non-negative
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/Ecore/OCL body='fillOpacity >=  0 and fillOpacity <=1'"
	 * @generated
	 */
	boolean validFillOpacity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the stroke width is non-negative
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/Ecore/OCL body='strokeWidth >=  0'"
	 * @generated
	 */
	boolean validStrokeWidth(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the size of the stroke dash length list must be even.
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/Ecore/OCL body='strokeDashLength->size().mod(2) = 0'"
	 * @generated
	 */
	boolean validDashLengthSize(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * the opacity of the fill is non-negative
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/Ecore/OCL body='strokeOpacity >=  0 and strokeOpacity <=1'"
	 * @generated
	 */
	boolean validStrokeOpacity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

} // Style
