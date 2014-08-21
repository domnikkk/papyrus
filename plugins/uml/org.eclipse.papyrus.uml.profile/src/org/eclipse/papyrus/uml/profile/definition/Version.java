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
 * Representation of the version number for a profile
 *
 * @deprecated API was moved to the plugin org.eclipse.papyrus.uml.tools for Bug 435995.
 *             It was preserved for standard releases of Papyrus 1.0.0
 * @see org.eclipse.papyrus.uml.tools.profile.definition.Version
 */
@Deprecated
public class Version extends org.eclipse.papyrus.uml.tools.profile.definition.Version {


	/** The empty version "0.0.0". Equivalent to calling <code>new Version(0,0,0)</code> */
	@Deprecated
	public static final Version emptyVersion = new Version(0, 0, 0);

	/**
	 * Instantiates a new version.
	 *
	 * @param major
	 *            the major
	 * @param minor
	 *            the minor
	 * @param micro
	 *            the micro
	 */
	public Version(int major, int minor, int micro) {
		super(major, minor, micro);
	}

	/** Copy constructor for legacy support. */
	Version(org.eclipse.papyrus.uml.tools.profile.definition.Version version) {
		this(version.getMajor(), version.getMinor(), version.getMicro());
	}

	/**
	 * Instantiates a new version.
	 *
	 * @param value
	 *            the value
	 */
	public Version(String value) {
		super(value);
	}

	/**
	 * Creates a version given the specific String
	 *
	 * @param version
	 *            the string to parse
	 * @return the version value corresponding to the String
	 */
	@Deprecated
	public static Version parseVersion(String version) throws IllegalArgumentException {
		return new Version(org.eclipse.papyrus.uml.tools.profile.definition.Version.parseVersion(version));
	}





}
