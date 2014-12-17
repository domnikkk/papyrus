/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mickaël ADAM (ALL4TEC) mickael.adam@all4tec.net - Initial API and Implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.common.utils;

/**
 * Contains constants for the CSS-specific NameStyle, use to customize figure.
 *
 */
public interface ICSSNamedStyles {

	/**
	 * The name of the NamedStyle controlling whether the header have to be display or not.
	 */
	public static final String DISPLAY_HEADER = "displayHeader";//$NON-NLS-N$

	/**
	 * The name of the NamedStyle controlling whether the svg picture use the original color or the color can be chosen by the user.
	 */
	public static final String USE_ORIGINAL_COLORS = "useOriginalColors";//$NON-NLS-N$

	/**
	 * The name of the NamedStyle to select the border style of the figure.
	 */
	public static final String BORDER_STYLE = "borderStyle"; //$NON-NLS-N$

	/**
	 * The name of the NamedStyle controlling whether the floating label is constrained or not.
	 */
	public static final String FLOATING_LABEL_CONSTRAINED = "isFloatingLabelConstrained";//$NON-NLS-N$

	/**
	 * The name of the NamedStyle to select the offset height of the floating label when it is not constrained.
	 */
	public static final String FLOATING_LABEL_OFFSET_HEIGHT = "floatingLabelOffsetHeight";//$NON-NLS-N$

	/**
	 * The name of the NamedStyle to select the offset width of the floating label when it is not constrained.
	 */
	public static final String FLOATING_LABEL_OFFSET_WIDTH = "floatingLabelOffsetWidth";//$NON-NLS-N$

	/**
	 * The name of the NamedStyle controlling whether the figure will be oval or not.
	 */
	public static final String IS_OVAL = "isOval";//$NON-NLS-N$

	/**
	 * The name of the NamedStyle to select the offset height of the corner radius.
	 */
	public static final String RADIUS_HEIGHT = "radiusHeight";//$NON-NLS-N$

	/**
	 * The name of the NamedStyle to select the offset width of the corner radius.
	 */
	public static final String RADIUS_WIDTH = "radiusWidth";//$NON-NLS-N$

	/**
	 * The name of the NamedStyle to select the custom dash when the style of the line is set to custom.
	 */
	public static final String LINE_CUSTOM_VALUE = "customDash";//$NON-NLS-N$

}
