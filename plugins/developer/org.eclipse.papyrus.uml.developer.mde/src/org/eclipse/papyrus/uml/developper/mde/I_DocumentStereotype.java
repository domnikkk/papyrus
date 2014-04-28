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
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.developper.mde;

/**
 * list of constant contained in the document profile
 *
 */
public interface I_DocumentStereotype {

	/** Qualified name of the stereotype Section */
	public static final String SECTION_STEREOTYPE = "Document::Section";

	/** name of property base_Package of the stereotype Section */
	public static final String SECTION_BASE_PACKAGE_ATT = "base_Package";

	/** Qualified name of the stereotype Document */
	public static final String DOCUMENT_STEREOTYPE = "Document::Document";

	/** name of property base_Model of the stereotype Document */
	public static final String DOCUMENT_BASE_MODEL_ATT = "base_Model";

	/** name of property author of the stereotype Document */
	public static final String DOCUMENT_AUTHOR_ATT = "author";

	/** name of property version of the stereotype Document */
	public static final String DOCUMENT_VERSION_ATT = "version";

	/** Qualified name of the stereotype ImageRef */
	public static final String IMAGEREF_STEREOTYPE = "Document::ImageRef";

	/** name of property base_Comment of the stereotype ImageRef */
	public static final String IMAGEREF_BASE_COMMENT_ATT = "base_Comment";

	/** name of property ref of the stereotype ImageRef */
	public static final String IMAGEREF_REF_ATT = "ref";

	/** Qualified name of the stereotype Content */
	public static final String CONTENT_STEREOTYPE = "Document::Content";

	/** name of property base_Comment of the stereotype Content */
	public static final String CONTENT_BASE_COMMENT_ATT = "base_Comment";

	/** Qualified name of the stereotype TableOfContent */
	public static final String TABLEOFCONTENT_STEREOTYPE = "Document::TableOfContent";

	/** name of property base_Comment of the stereotype TableOfContent */
	public static final String TABLEOFCONTENT_BASE_COMMENT_ATT = "base_Comment";
}
