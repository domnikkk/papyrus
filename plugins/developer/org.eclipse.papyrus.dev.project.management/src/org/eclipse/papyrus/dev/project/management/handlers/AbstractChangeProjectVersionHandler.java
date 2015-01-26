package org.eclipse.papyrus.dev.project.management.handlers;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.window.Window;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.dev.project.management.Activator;
import org.eclipse.papyrus.dev.project.management.dialog.InputDialogWithCheckBox;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.progress.IProgressService;
import org.eclipse.ui.statushandlers.StatusManager;


public abstract class AbstractChangeProjectVersionHandler extends AbstractHandler {

	private static final String TITLE = "Enter the new version number for Papyrus plugin.";

	private static final String MESSAGE = "Enter the new version number.";

	private static final String INITIAL_VALUE = "0.0.0.qualifier";

	private static final String CHECKBOX_MESSAGE = "Only projects beginning with 'org.eclipse.papyrus.*'";

	private static final String WARNING_DIALOG_TITLE = "Change Version Name Report";

	private static final String WARNING_DIALOG_MESSAGE = "The following project were NOT managed : ";

	private static final String WARNING_DIALOG_MESSAGE2 = "Done.";

	private static final String PAPYRUS_NAME = "org.eclipse.papyrus";


	public Object execute(final ExecutionEvent event) throws ExecutionException {

		final IInputValidator validator = new IInputValidator() {

			public String isValid(final String newText) {
				final boolean match = newText.matches("[0-9]+\\.[0-9]+\\.[0-9]+\\.qualifier");
				if(!match) {
					return NLS.bind("The version number should be : something like this : {0}.", INITIAL_VALUE);
				}
				return null;
			}
		};


		final InputDialogWithCheckBox dialog = new InputDialogWithCheckBox(Display.getCurrent().getActiveShell(), TITLE, MESSAGE, INITIAL_VALUE, CHECKBOX_MESSAGE, true, validator);
		if(dialog.open() == Window.OK) {
			WorkspaceModifyOperation workspaceOperation = new WorkspaceModifyOperation(){
				protected void execute(IProgressMonitor monitor) throws CoreException ,InvocationTargetException ,InterruptedException {
					IStatus result = runAsJob(dialog.getValue(), dialog.isChecked(), monitor);
					StatusManager.getManager().handle(result, StatusManager.SHOW);
				}
			};
			
			try {
				IProgressService service = PlatformUI.getWorkbench().getProgressService();
				service.run(true, true, workspaceOperation);
			} catch (InvocationTargetException e) {
				Activator.log.error(e);
			} catch (InterruptedException e) {
				Activator.log.error(e);
			}
		
		}

		return null;
	}

	protected IStatus runAsJob(final String newVersion, final boolean papyrusProjectsOnly, IProgressMonitor monitor) {
		String notManagedProjectNames = "";
		final IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();

		monitor.beginTask("Update version numbers", projects.length);
		
		for(final IProject current : projects) {
			
			if (monitor.isCanceled()){
				return new Status(IStatus.CANCEL, Activator.PLUGIN_ID, "Operation canceled");
			}
			
			final String name = current.getName();
			if(papyrusProjectsOnly) {
				if(name.startsWith(PAPYRUS_NAME)) {//we test the project name
					setVersionNumber(current, newVersion, notManagedProjectNames);
				} else {
					notManagedProjectNames += NLS.bind("- {0} \n", current.getName());
				}
			} else {
				setVersionNumber(current, newVersion, notManagedProjectNames);
			}

			monitor.worked(1);
		}

		if ("".equals(notManagedProjectNames)){
			return Status.OK_STATUS;
		} else {
			return new Status(IStatus.WARNING, Activator.PLUGIN_ID, WARNING_DIALOG_MESSAGE + "\n" + notManagedProjectNames);
		}

	}

	/**
	 * 
	 * @param project
	 *        the project to manage
	 * @param newVersion
	 *        the new version for the project
	 * @param notManagedProjectNames
	 *        a String used to build the message with the not managed projects
	 */
	protected abstract void setVersionNumber(final IProject project, final String newVersion, String notManagedProjectNames);



}
