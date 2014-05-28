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

import org.eclipse.emf.ecore.EAnnotation;




/**
 * Class that defines various information about a profile definition (author,
 * version, etc.)
 * 
 * 
 * @deprecated API was moved to the plugin org.eclipse.papyrus.uml.tools for Bug 435995.
 *             It was preserved for standard releases of Papyrus 1.0.0
 * @see org.eclipse.papyrus.uml.tools.profile.definition.PapyrusDefinitionAnnotation
 */
@Deprecated
public class PapyrusDefinitionAnnotation extends org.eclipse.papyrus.uml.tools.profile.definition.PapyrusDefinitionAnnotation {

	/** undefined PapyrusDefinitionAnnotation */
	public static PapyrusDefinitionAnnotation UNDEFINED_ANNOTATION = new PapyrusDefinitionAnnotation(Version.emptyVersion, "<undefined>", "", "", "<undefined>");

	/**
	 * Instantiates a new papyrus definition annotation.
	 *
	 * @param version
	 *        the version
	 * @param comment
	 *        the comment
	 * @param copyright
	 *        the copyright
	 * @param date
	 *        the date
	 * @param author
	 *        the author
	 */
	public PapyrusDefinitionAnnotation(Version version, String comment, String copyright, String date, String author) {
		super(version, comment, copyright, date, author);
	}
	
	/** Copy constructor for legacy support. */
	PapyrusDefinitionAnnotation(org.eclipse.papyrus.uml.tools.profile.definition.PapyrusDefinitionAnnotation annotation) {
		this(new Version(annotation.getVersion()), annotation.getComment(), annotation.getCopyright(), annotation.getDate(), annotation.getAuthor());
	}

	/**
	 * Return the PapyrusDefinitionAnnotation corresponding to the given
	 * EAnnotation
	 * 
	 * @param annotation
	 *        the annotation to parse
	 * @return a image of the given annotation, with default values if needed.
	 */
	@Deprecated
	public static PapyrusDefinitionAnnotation parseEAnnotation(EAnnotation annotation) {
		return new PapyrusDefinitionAnnotation(org.eclipse.papyrus.uml.tools.profile.definition.PapyrusDefinitionAnnotation.parseEAnnotation(annotation));
	}

}
