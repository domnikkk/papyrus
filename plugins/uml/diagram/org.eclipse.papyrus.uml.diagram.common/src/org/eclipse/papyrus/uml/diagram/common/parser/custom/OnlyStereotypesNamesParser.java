/*
 *
 */
package org.eclipse.papyrus.uml.diagram.common.parser.custom;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

public class OnlyStereotypesNamesParser implements IParser {

	@Override
	public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
		return null;
	}

	@Override
	public String getEditString(IAdaptable element, int flags) {
		return "";
	}

	@Override
	public ICommand getParseCommand(IAdaptable element, String newString, int flags) {
		return null;
	}

	@Override
	public String getPrintString(IAdaptable element, int flags) {

		Element el = (Element) element.getAdapter(Element.class);

		if (el != null) {
			EList<Stereotype> stereotypes = el.getAppliedStereotypes();

			if (stereotypes == null) {
				return null;
			}

			if (stereotypes.size() <= 0) {
				return null;
			}

			String pString = "" + ((char) 171);

			for (java.util.Iterator<Stereotype> it = stereotypes.iterator(); it.hasNext();) {
				pString += it.next().getName();

				if (it.hasNext()) {
					pString += ", ";
				}
			}

			pString += ((char) 187);

			return pString;
		}

		return null;

	}

	@Override
	public boolean isAffectingEvent(Object event, int flags) {
		return false;
	}

	@Override
	public IParserEditStatus isValidEditString(IAdaptable element, String editString) {
		// always return
		return new ParserEditStatusimpl();
	}

	class ParserEditStatusimpl implements IParserEditStatus {

		@Override
		public IStatus[] getChildren() {
			return new IStatus[0];
		}

		@Override
		public int getCode() {
			return 0;
		}

		@Override
		public Throwable getException() {
			return null;
		}

		@Override
		public String getMessage() {
			return "Non editable.";
		}

		@Override
		public String getPlugin() {
			return null;
		}

		@Override
		public int getSeverity() {
			return IStatus.OK;
		}

		@Override
		public boolean isMultiStatus() {
			return false;
		}

		@Override
		public boolean isOK() {
			return false;
		}

		@Override
		public boolean matches(int severityMask) {
			return false;
		}

	}

}
