package org.eclipse.papyrus.codegen.extensionpoints;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.papyrus.codegen.extensionpoints.messages"; //$NON-NLS-1$
	public static String LanguageSupport_LanguageNotSupported;
	public static String ModelElementsCreator_UnsupportedModelElement;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
