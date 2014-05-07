package org.eclipse.papyrus.cpp.cdtproject;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.codegen.extensionpoints.ILangSupport;
import org.eclipse.papyrus.cpp.codegen.preferences.CppCodeGenConstants;

/**
 * C language support (largely untested)
 * 
 * @author ansgar
 */
public class CLanguageSupport extends C_CppLanguageSupport implements ILangSupport {

	@Override
	public void setProject(IProject project) {
		super.setProject(project);
		
		IPreferenceStore store = org.eclipse.papyrus.cpp.codegen.Activator.getDefault().getPreferenceStore();
		String prefix = store.getString(CppCodeGenConstants.P_COMMENT_HEADER) + "\n\n"; //$NON-NLS-1$
		// creator = new CModelElementsCreator(project, prefix);
	}

}
