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
 * mist of constant included in the IDM process profile
 *
 */
public interface I_DeveloperIDMStereotype {

	/** Qualified name of the stereotype Project */
	public static final String PROJECT_STEREOTYPE = "DeveloperProcess::structure::Project"; //$NON-NLS-1$

	/** name of property author of the stereotype Project */
	public static final String PROJECT_AUTHOR_ATT = "author"; //$NON-NLS-1$

	/** name of property title of the stereotype Project */
	public static final String PROJECT_TITLE_ATT = "title"; //$NON-NLS-1$

	/** name of property version of the stereotype Project */
	public static final String PROJECT_VERSION_ATT = "version"; //$NON-NLS-1$

	/** name of property base_Model of the stereotype Project */
	public static final String PROJECT_BASE_MODEL_ATT = "base_Model"; //$NON-NLS-1$

	/** Qualified name of the stereotype UserDoc */
	public static final String USERDOC_STEREOTYPE = "DeveloperProcess::structure::UserDoc"; //$NON-NLS-1$

	/** name of property base_Comment of the stereotype UserDoc */
	public static final String USERDOC_BASE_COMMENT_ATT = "base_Comment"; //$NON-NLS-1$

	/** Qualified name of the stereotype DeveloperDoc */
	public static final String DEVELOPERDOC_STEREOTYPE = "DeveloperProcess::structure::DeveloperDoc"; //$NON-NLS-1$

	/** name of property base_Comment of the stereotype DeveloperDoc */
	public static final String DEVELOPERDOC_BASE_COMMENT_ATT = "base_Comment"; //$NON-NLS-1$

	/** Qualified name of the stereotype Requirements */
	public static final String REQUIREMENTS_STEREOTYPE = "DeveloperProcess::structure::Requirements"; //$NON-NLS-1$

	/** name of property base_Model of the stereotype Requirements */
	public static final String REQUIREMENTS_BASE_MODEL_ATT = "base_Model"; //$NON-NLS-1$

	/** Qualified name of the stereotype Design */
	public static final String DESIGN_STEREOTYPE = "DeveloperProcess::structure::Design"; //$NON-NLS-1$

	/** name of property base_Model of the stereotype Design */
	public static final String DESIGN_BASE_MODEL_ATT = "base_Model"; //$NON-NLS-1$

	/** Qualified name of the stereotype UseCases */
	public static final String USECASES_STEREOTYPE = "DeveloperProcess::structure::UseCases"; //$NON-NLS-1$

	/** name of property base_Model of the stereotype UseCases */
	public static final String USECASES_BASE_MODEL_ATT = "base_Model"; //$NON-NLS-1$

	/** Qualified name of the stereotype Tests */
	public static final String TESTS_STEREOTYPE = "DeveloperProcess::structure::Tests"; //$NON-NLS-1$

	/** name of property base_Model of the stereotype Tests */
	public static final String TESTS_BASE_MODEL_ATT = "base_Model"; //$NON-NLS-1$

	/** Qualified name of the stereotype UseCaseTest */
	public static final String USECASETEST_STEREOTYPE = "DeveloperProcess::trace::UseCaseTest"; //$NON-NLS-1$

	/** name of property base_UseCase of the stereotype UseCaseTest */
	public static final String USECASETEST_BASE_USECASE_ATT = "base_UseCase"; //$NON-NLS-1$

	/** Qualified name of the stereotype ManualTest */
	public static final String MANUALTEST_STEREOTYPE = "DeveloperProcess::trace::ManualTest"; //$NON-NLS-1$

	/** name of property path of the stereotype ManualTest */
	public static final String MANUALTEST_PATH_ATT = "path"; //$NON-NLS-1$

	/** name of property base_Model of the stereotype ManualTest */
	public static final String MANUALTEST_BASE_MODEL_ATT = "base_Model"; //$NON-NLS-1$

	/** Qualified name of the stereotype ExecutableTest */
	public static final String EXECUTABLETEST_STEREOTYPE = "DeveloperProcess::trace::ExecutableTest"; //$NON-NLS-1$

	/** name of property base_Class of the stereotype ExecutableTest */
	public static final String EXECUTABLETEST_BASE_CLASS_ATT = "base_Class"; //$NON-NLS-1$

	/** name of property base_Model of the stereotype ExecutableTest */
	public static final String EXECUTABLETEST_BASE_MODEL_ATT = "base_Model"; //$NON-NLS-1$
}
