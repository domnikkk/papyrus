package org.eclipse.papyrus.adl4eclipsetool.table;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.papyrus.adl4eclipsetool.table.messages"; //$NON-NLS-1$
	
	public static String TableArchitectureCreationTester_MissingNamedProfile;
	
	public static String TableArchitectureCreationTester_MissingRequiredProfiles;
	
	public static String TableArchitectureCreationTester_NotAPackage;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
