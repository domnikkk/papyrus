/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.uml.diagram.clazz.custom.parsers;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.NamedElement;

/**
 * The Enum for kind of End member.
 */
public enum EndMemberKind {
	SOURCE(0), TARGET(1), UNKNOWN(-1);

	/** The kind index. */
	private final int kindIndex;

	/**
	 * Instantiates a new classifier member kind.
	 *
	 * @param index
	 *            the index
	 */
	private EndMemberKind(int index) {
		kindIndex = index;
	}

	/**
	 * Extract named element.
	 *
	 * @param classifier
	 *            the classifier
	 * @return the named element
	 */
	public NamedElement extractNamedElement(Classifier classifier) {
		if (kindIndex < 0) {
			return null;
		}
		return classifier.getMembers().get(kindIndex);
	}

	/**
	 * Gets the index.
	 *
	 * @return the index
	 */
	public int getIndex() {
		return kindIndex;
	}
}