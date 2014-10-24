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
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;

/**
 * The base class of InstanceSpecification link edge parser
 * 
 * @see the getClissifierMemberType() method for specify the type of end
 * 
 */

public abstract class RoleInstanceSpecificationLinkParser implements IParser {

	protected static final String UNSPECIFIED_LABEL = "<UNSPECIFIED>";

	public RoleInstanceSpecificationLinkParser() {
	}

	@Override
	public String getEditString(IAdaptable element, int flags) {
		return "";
	}

	@Override
	public IParserEditStatus isValidEditString(IAdaptable element, String editString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICommand getParseCommand(IAdaptable element, String newString, int flags) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPrintString(IAdaptable element, int flags) {
		return getPrintString(element);
	}

	@Override
	public boolean isAffectingEvent(Object event, int flags) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
		// TODO Auto-generated method stub
		return null;
	}

	protected abstract ClassifierMemberKind getClissifierMemberKind();

	private String getPrintString(IAdaptable element) {
		String namedNodeType = getNamedNodeType(element);
		return (namedNodeType == null || namedNodeType.isEmpty()) ? UNSPECIFIED_LABEL : namedNodeType;
	}

	private String getNamedNodeType(IAdaptable element) {
		InstanceSpecification instanceSpecification = ((InstanceSpecification) ((EObjectAdapter) element).getRealObject());
		if (instanceSpecification.getClassifiers().size() <= 0) {
			return null;
		}
		Classifier classifier = instanceSpecification.getClassifiers().get(0);
		if (classifier.getMembers().size() < 2) {
			return null;
		}
		NamedElement namedElement = getClissifierMemberKind().extractNamedElement(classifier);
		if (namedElement == null) {
			return null;
		}
		if (!(namedElement instanceof Property)) {
			return null;
		}
		return ((Property) namedElement).getName();
	}

	public static enum ClassifierMemberKind {
		SOURCE(1), TARGET(0), UNKNOWN(-1);

		private final int myIndex;

		private ClassifierMemberKind(int index) {
			myIndex = index;
		}

		public NamedElement extractNamedElement(Classifier classifier) {
			if (myIndex < 0) {
				return null;
			}
			return classifier.getMembers().get(myIndex);
		}
	}
}
