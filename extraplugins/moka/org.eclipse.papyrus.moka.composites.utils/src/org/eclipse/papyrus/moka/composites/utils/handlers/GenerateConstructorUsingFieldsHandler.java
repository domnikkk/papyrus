package org.eclipse.papyrus.moka.composites.utils.handlers;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.moka.composites.utils.ui.GenerateConstructorUsingFieldsDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.Class;


public class GenerateConstructorUsingFieldsHandler extends AbstractCompositeUtilsHandler {
	
	@Override
	public RecordingCommand getUpdateCommand(Class context, TransactionalEditingDomain domain) {
		return new GenerateConstructorUsingFieldsCommand(context, domain);
	}

	/**
	 * A command that generates a Constructor for a Class, from a dialog box.
	 * @see GenerateConstructorUsingFieldsDialog
	 *
	 */
	protected class GenerateConstructorUsingFieldsCommand extends RecordingCommand {

		protected Class context ;
		
		public GenerateConstructorUsingFieldsCommand(Class context, TransactionalEditingDomain domain) {
			super(domain) ;
			this.context = context ;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor
		 * , org.eclipse.core.runtime.IAdaptable)
		 */
		@Override
		protected void doExecute() {
			GenerateConstructorUsingFieldsDialog dialog = new GenerateConstructorUsingFieldsDialog(Display.getCurrent().getActiveShell(), context);
			dialog.open();
		}
	}

}
