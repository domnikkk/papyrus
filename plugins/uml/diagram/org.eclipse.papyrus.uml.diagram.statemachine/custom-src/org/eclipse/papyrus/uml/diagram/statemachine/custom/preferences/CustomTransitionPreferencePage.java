package org.eclipse.papyrus.uml.diagram.statemachine.custom.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.papyrus.infra.gmfdiag.common.helper.DiagramHelper;
import org.eclipse.papyrus.uml.diagram.statemachine.part.UMLDiagramEditorPlugin;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class CustomTransitionPreferencePage extends FieldEditorPreferencePage
		implements IWorkbenchPreferencePage
{
	public CustomTransitionPreferencePage() {
		super(GRID);
		setPreferenceStore(UMLDiagramEditorPlugin.getInstance().getPreferenceStore());
		setDescription("This preference page allows to customize label appearance on transitions");
	}

	boolean updatePending;

	/**
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors()
	 *
	 */
	@Override
	protected void createFieldEditors() {
		addField(new BooleanFieldEditor(
				PreferenceConstants.INDICATE_PARAMETERS, "Indicate parameters", //$NON-NLS-1$
				getFieldEditorParent()));

		addField(new BooleanFieldEditor(
				PreferenceConstants.LINEBREAK_BEFORE_EFFECT, "Line break before effect label", //$NON-NLS-1$
				getFieldEditorParent()));

		addField(new IntegerFieldEditor(
				PreferenceConstants.BODY_CUT_LENGTH, "Shown number of lines for opaque expressions/behaviors", //$NON-NLS-1$
				getFieldEditorParent()));

	}

	@Override
	public boolean performOk() {
		if (!updatePending) {
			Display.getDefault().asyncExec(new Runnable() {

				@Override
				public void run() {
					DiagramHelper.setNeedsRefresh();
					DiagramHelper.refreshDiagrams();
					updatePending = false;
				}
			});
		}
		updatePending = true;

		return super.performOk();
	}


	/**
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 *
	 * @param workbench
	 */
	public void init(IWorkbench workbench) {
	}
}