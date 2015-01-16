/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.revision.tool.core;
/**
 * This interface contains all string about name of stereotypes attributes of the versioning profile 
 *
 */
public interface I_VersioningStereotype {
/** Qualified name of the stereotype VersioningElement */
public static final String VERSIONINGELEMENT_STEREOTYPE = "PapyrusVersioningExtensions::VersioningElement";
/**  name of property base_Element of the stereotype VersioningElement */
public static final String VERSIONINGELEMENT_BASE_ELEMENT_ATT = "base_Element";
/**  name of property generator of the stereotype VersioningElement */
public static final String VERSIONINGELEMENT_GENERATOR_ATT = "generator";
/**  name of property description of the stereotype VersioningElement */
public static final String VERSIONINGELEMENT_DESCRIPTION_ATT = "description";
/**  name of property keyword of the stereotype VersioningElement */
public static final String VERSIONINGELEMENT_KEYWORD_ATT = "keyword";
/**  name of property subject of the stereotype VersioningElement */
public static final String VERSIONINGELEMENT_SUBJECT_ATT = "subject";
/**  name of property creationDate of the stereotype VersioningElement */
public static final String VERSIONINGELEMENT_CREATIONDATE_ATT = "creationDate";
/**  name of property date of the stereotype VersioningElement */
public static final String VERSIONINGELEMENT_DATE_ATT = "date";
/**  name of property language of the stereotype VersioningElement */
public static final String VERSIONINGELEMENT_LANGUAGE_ATT = "language";
/**  name of property editingCycles of the stereotype VersioningElement */
public static final String VERSIONINGELEMENT_EDITINGCYCLES_ATT = "editingCycles";
/**  name of property author of the stereotype VersioningElement */
public static final String VERSIONINGELEMENT_AUTHOR_ATT = "author";
/** Qualified name of the stereotype Author */
public static final String AUTHOR_STEREOTYPE = "PapyrusVersioningExtensions::Author";
/**  name of property language of the stereotype Author */
public static final String AUTHOR_LANGUAGE_ATT = "language";
/**  name of property color of the stereotype Author */
public static final String AUTHOR_COLOR_ATT = "color";
/**  name of property reviews of the stereotype Author */
public static final String AUTHOR_REVIEWS_ATT = "reviews";
/**  name of property base_Actor of the stereotype Author */
public static final String AUTHOR_BASE_ACTOR_ATT = "base_Actor";
/**  name of property versioningElements of the stereotype Author */
public static final String AUTHOR_VERSIONINGELEMENTS_ATT = "versioningElements";
}