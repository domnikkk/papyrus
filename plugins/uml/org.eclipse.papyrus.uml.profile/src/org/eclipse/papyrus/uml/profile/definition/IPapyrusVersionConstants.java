/*****************************************************************************
 * Copyright (c) 2008 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Chokri Mraidha (CEA LIST) Chokri.Mraidha@cea.fr - Initial API and implementation
 *  Patrick Tessier (CEA LIST) Patrick.Tessier@cea.fr - modification
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.profile.definition;

/**
 * Constant fields for papyrus profile version
 *
 *
 * @deprecated API was moved to the plugin org.eclipse.papyrus.uml.tools for Bug 435995.
 *             It was preserved for standard releases of Papyrus 1.0.0
 * @see org.eclipse.papyrus.uml.tools.profile.definition.IPapyrusVersionConstants
 */
@Deprecated
public interface IPapyrusVersionConstants extends org.eclipse.papyrus.uml.tools.profile.definition.IPapyrusVersionConstants {

	/** source for eAnnotation that qualifies the profile definition */
	@Deprecated
	public final String PAPYRUS_EANNOTATION_SOURCE = "PapyrusVersion";

	/** key for version detail */
	@Deprecated
	public final String PAPYRUS_VERSION_KEY = "Version";

	/** key for author detail */
	@Deprecated
	public final String PAPYRUS_AUTHOR_KEY = "Author";

	/** key for copyright detail */
	@Deprecated
	public final String PAPYRUS_COPYRIGHT_KEY = "Copyright";

	/** key for date detail */
	@Deprecated
	public final String PAPYRUS_DATE_KEY = "Date";

	/** key for comment detail */
	@Deprecated
	public final String PAPYRUS_COMMENT_KEY = "Comment";
}
