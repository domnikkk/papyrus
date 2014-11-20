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
	public static final String SECTION_STEREOTYPE = "Document::Section"; //$NON-NLS-1$

	/** name of property base_Package of the stereotype Section */
	public static final String SECTION_BASE_PACKAGE_ATT = "base_Package"; //$NON-NLS-1$
	
	public static final String TABLE_STEREOTYPE = "Document::Table";
	
	public static final String TABLE_BASE_PACKAGE_ATT = "base_Element";
	
	public static final String TABLE_CAPTION_ATT = "caption";

	/** Qualified name of the stereotype Document */
	public static final String DOCUMENT_STEREOTYPE = "Document::Document"; //$NON-NLS-1$

	/** name of property base_Model of the stereotype Document */
	public static final String DOCUMENT_BASE_MODEL_ATT = "base_Model"; //$NON-NLS-1$

	/** name of property author of the stereotype Document */
	public static final String DOCUMENT_AUTHOR_ATT = "author"; //$NON-NLS-1$

	/** name of property version of the stereotype Document */
	public static final String DOCUMENT_VERSION_ATT = "version"; //$NON-NLS-1$

	/** Qualified name of the stereotype ImageRef */
	public static final String IMAGEREF_STEREOTYPE = "Document::ImageRef"; //$NON-NLS-1$

	/** name of property base_Comment of the stereotype ImageRef */
	public static final String IMAGEREF_BASE_COMMENT_ATT = "base_Comment"; //$NON-NLS-1$

	/** name of property ref of the stereotype ImageRef */
	public static final String IMAGEREF_REF_ATT = "ref"; //$NON-NLS-1$

	/** Qualified name of the stereotype Content */
	public static final String CONTENT_STEREOTYPE = "Document::Content"; //$NON-NLS-1$

	/** name of property base_Comment of the stereotype Content */
	public static final String CONTENT_BASE_COMMENT_ATT = "base_Comment"; //$NON-NLS-1$
	
	public static final String LINE_STEREOTYPE = "Document::Line";
	
	public static final String LINE_BASE_PACKAGE_ATT = "base_Comment";
	
	public static final String CELL_STEREOTYPE = "Document::Cell";
	
	public static final String CELL_BASE_PACKAGE_ATT = "base_Comment";
	
	public static final String REF_CONTENT_STEREOTYPE = "Document::RefContent";
	
	public static final String REF_CONTENT_BASE_PACKAGE_ATT = "base_Comment";
	
	public static final String REF_CONTENT_REF_ATT = "ref";

	/** Qualified name of the stereotype TableOfContent */
	public static final String TABLEOFCONTENT_STEREOTYPE = "Document::TableOfContent"; //$NON-NLS-1$

	/** name of property base_Comment of the stereotype TableOfContent */
	public static final String TABLEOFCONTENT_BASE_COMMENT_ATT = "base_Comment"; //$NON-NLS-1$
}
