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
 * This interface contains all string about name of stereotypes attributes of the review profile 
 *
 */
public interface I_ReviewStereotype {
/** Qualified name of the stereotype ReviewRepository */
public static final String REVIEWREPOSITORY_STEREOTYPE = "ReviewProfile::ReviewRepository";
/**  name of property base_Model of the stereotype ReviewRepository */
public static final String REVIEWREPOSITORY_BASE_MODEL_ATT = "base_Model";
/** Qualified name of the stereotype Comment */
public static final String COMMENT_STEREOTYPE = "ReviewProfile::Comment";
/**  name of property base_Comment of the stereotype Comment */
public static final String COMMENT_BASE_COMMENT_ATT = "base_Comment";
/**  name of property status of the stereotype Comment */
public static final String COMMENT_STATUS_ATT = "status";
/**  name of property diffRef of the stereotype Comment */
public static final String COMMENT_DIFFREF_ATT = "diffRef";
/**  name of property subject of the stereotype Comment */
public static final String COMMENT_SUBJECT_ATT = "subject";
/**  name of literal NoStatus of the Enumeration CommentStatusKind */
public static final String COMMENTSTATUSKIND_NOSTATUS_ENUM = "NoStatus";
/**  name of literal Accepted of the Enumeration CommentStatusKind */
public static final String COMMENTSTATUSKIND_ACCEPTED_ENUM = "Accepted";
/**  name of literal Canceled of the Enumeration CommentStatusKind */
public static final String COMMENTSTATUSKIND_CANCELED_ENUM = "Canceled";
/**  name of literal Closed of the Enumeration CommentStatusKind */
public static final String COMMENTSTATUSKIND_CLOSED_ENUM = "Closed";
/**  name of literal Declined of the Enumeration CommentStatusKind */
public static final String COMMENTSTATUSKIND_DECLINED_ENUM = "Declined";
/** Qualified name of the stereotype Review */
public static final String REVIEW_STEREOTYPE = "ReviewProfile::Review";
/** Qualified name of the stereotype Question */
public static final String QUESTION_STEREOTYPE = "ReviewProfile::Question";
/** Qualified name of the stereotype Answer */
public static final String ANSWER_STEREOTYPE = "ReviewProfile::Answer";
/** Qualified name of the stereotype Todo */
public static final String TODO_STEREOTYPE = "ReviewProfile::Todo";
}