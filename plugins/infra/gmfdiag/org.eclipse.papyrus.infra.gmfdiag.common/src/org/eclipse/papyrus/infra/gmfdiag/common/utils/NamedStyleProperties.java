/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mickael ADAM (ALL4TEC) mickael.adam@all4tec.net - Initial API and Implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.common.utils;


/**
 * Contains constants for the CSS-specific NameStyle, use to customize figure.
 */
public interface NamedStyleProperties {

	/* NamedStyle used on PapyrusRoundedEditPartHelper for generic figure */

	/**
	 * The NamedStyle property controlling whether the header have to be display or not.
	 */
	public static final String DISPLAY_HEADER = "displayHeader";//$NON-NLS-N$

	/**
	 * The NamedStyle property controlling whether the svg picture use the original color or the color can be chosen by the user.
	 */
	public static final String USE_ORIGINAL_COLORS = "useOriginalColors";//$NON-NLS-N$

	/**
	 * The NamedStyle property to select the border style of the figure.
	 */
	public static final String BORDER_STYLE = "borderStyle"; //$NON-NLS-N$

	/**
	 * The NamedStyle property controlling whether the floating label is constrained or not.
	 */
	public static final String FLOATING_LABEL_CONSTRAINED = "isFloatingLabelConstrained";//$NON-NLS-N$

	/**
	 * The NamedStyle property to select the offset height of the floating label when it is not constrained.
	 */
	public static final String FLOATING_LABEL_OFFSET_HEIGHT = "floatingLabelOffsetHeight";//$NON-NLS-N$

	/**
	 * The NamedStyle property to select the offset width of the floating label when it is not constrained.
	 */
	public static final String FLOATING_LABEL_OFFSET_WIDTH = "floatingLabelOffsetWidth";//$NON-NLS-N$

	/**
	 * The NamedStyle property controlling whether the figure will be oval or not.
	 */
	public static final String IS_OVAL = "isOval";//$NON-NLS-N$

	/**
	 * The NamedStyle property to select the offset height of the corner radius.
	 */
	public static final String RADIUS_HEIGHT = "radiusHeight";//$NON-NLS-N$

	/**
	 * The NamedStyle property to select the offset width of the corner radius.
	 */
	public static final String RADIUS_WIDTH = "radiusWidth";//$NON-NLS-N$

	/**
	 * The NamedStyle property to select the custom dash when the style of the line is set to custom.
	 */
	public static final String LINE_CUSTOM_VALUE = "customDash";//$NON-NLS-N$

	/* NamedStyle use on PapyrusLabelEditPart */

	/**
	 * NamedStyle property to define the horizontal Label Margin
	 */
	public static final String TOP_MARGIN_PROPERTY = "topMarginLabel"; //$NON-NLS-1$

	/**
	 * NamedStyle property to define the vertical Label Margin
	 */
	public static final String LEFT_MARGIN_PROPERTY = "leftMarginLabel"; //$NON-NLS-1$

	/**
	 * NamedStyle property to define the horizontal Label Margin
	 */
	public static final String BOTTOM_MARGIN_PROPERTY = "bottomMarginLabel"; //$NON-NLS-1$

	/**
	 * NamedStyle property to define the vertical Label Margin
	 */
	public static final String RIGHT_MARGIN_PROPERTY = "rightMarginLabel"; //$NON-NLS-1$

	/** The NamedStyle property to define the text alignment. */
	public static final String TEXT_ALIGNMENT = "textAlignment"; //$NON-NLS-1$

	/** NamedStyle property to define the label offset on Y. */
	public static final String LABEL_OFFSET_Y = "labelOffsetY"; //$NON-NLS-1$

	/** NamedStyle property to define the label offset on X. */
	public static final String LABEL_OFFSET_X = "labelOffsetX"; //$NON-NLS-1$

	/** NamedStyle property controlling whether the label is constrained or not. */
	public static final String LABEL_CONSTRAINED = "labelConstrained"; //$NON-NLS-1$

	/* NamedStyle used on floatingLabelEditPart */

	/** NamedStyle property to display floating name. */
	public static final String DISPLAY_FLOATING_LABEL = "visible"; //$NON-NLS-1$

	/** NamedStyle property to define the position for External Label */
	public static final String POSITION = "position"; //$NON-NLS-1$

	/* NamedStyle properties used for border display. */

	/** The notation NameStyle property to define line position from compartment. */
	public static final String LINE_POSITION = "linePosition"; //$NON-NLS-1$

	/** The notation NameStyle property to define the line length ratio of compartment's topLine. */
	public static final String LINE_LENGTH_RATIO = "lineLengthRatio"; //$NON-NLS-1$

	/** The notation NameStyle property to define the line length of compartment's topLine. */
	public static final String LENGTH = "lineLength"; //$NON-NLS-1$

	/** The notation NameStyle property to display. */
	public static final String DISPLAY_BORDER = "displayBorder"; //$NON-NLS-1$

	/* Positions used for the name, the topLine and the Floating label. */
	interface PositionAsString {
		/** The Constant NORTH as String. */
		public static final String NORTH = "NORTH"; //$NON-NLS-1$

		/** The Constant SOUTH as String. */
		public static final String SOUTH = "SOUTH"; //$NON-NLS-1$

		/** The Constant EAST as String. */
		public static final String EAST = "EAST"; //$NON-NLS-1$

		/** The Constant WEST as String. */
		public static final String WEST = "WEST"; //$NON-NLS-1$

		/** The Constant NONE as String. */
		public static final String NONE = "NONE"; //$NON-NLS-1$

		/** The Constant AUTO as String. */
		public static final String AUTO = "AUTO"; //$NON-NLS-1$

		/** The Constant LEFT as String. */
		public static final String LEFT = "LEFT"; //$NON-NLS-1$

		/** The Constant RIGHT as String. */
		public static final String RIGHT = "RIGHT"; //$NON-NLS-1$

		/** The Constant CENTER as String. */
		public static final String CENTER = "CENTER"; //$NON-NLS-1$
	}

	/* Border style */
	interface BorderStyle {

		/** The Constant DASH as String. */
		public static final String DASH = "dash"; //$NON-NLS-1$

		/** The Constant DASH_DOT as String. */
		public static final String DASH_DOT = "dashDot"; //$NON-NLS-1$

		/** The Constant DASH_DOT_DOT as String. */
		public static final String DASH_DOT_DOT = "dashDotDot"; //$NON-NLS-1$

		/** The Constant DOT as String. */
		public static final String DOT = "dot"; //$NON-NLS-1$

		/** The Constant SOLID as String. */
		public static final String SOLID = "solid"; //$NON-NLS-1$

		/** The Constant CUSTOM as String. */
		public static final String CUSTOM = "custom"; //$NON-NLS-1$
	}
}
