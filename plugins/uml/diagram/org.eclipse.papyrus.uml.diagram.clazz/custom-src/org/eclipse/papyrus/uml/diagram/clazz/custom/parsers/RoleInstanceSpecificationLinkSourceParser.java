/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
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
package org.eclipse.papyrus.uml.diagram.clazz.custom.parsers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Slot;



public class RoleInstanceSpecificationLinkSourceParser extends RoleInstanceSpecificationLinkParser {

	public RoleInstanceSpecificationLinkSourceParser() {
		super();
	}

	@Override
	public boolean isAffectingEvent(Object event, int flags) {
		return true;
	}

	private String getPrintString(IAdaptable element) {
		InstanceSpecification instanceSpecification = ((InstanceSpecification) ((EObjectAdapter) element).getRealObject());
		if (instanceSpecification.getClassifiers().size() > 0) {
			Classifier classifier = instanceSpecification.getClassifiers().get(0);
			if (classifier instanceof Association && instanceSpecification.getSlots().size() > 0) {
				Slot slotSource = instanceSpecification.getSlots().get(0);
				if (slotSource.getValues().size() > 0) {
					return slotSource.getValues().get(0).getType().getName().toLowerCase();
				}
			}
		}
		return UNSPECIFIED_LABEL;
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.clazz.custom.parsers.RoleInstanceSpecificationLinkParser#getClissifierMemberKind()
	 *
	 * @return
	 */
	@Override
	protected ClassifierMemberKind getClissifierMemberKind() {
		return ClassifierMemberKind.UNKNOWN;
	}
}
