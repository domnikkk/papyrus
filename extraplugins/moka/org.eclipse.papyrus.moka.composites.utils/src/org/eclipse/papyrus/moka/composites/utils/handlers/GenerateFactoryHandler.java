package org.eclipse.papyrus.moka.composites.utils.handlers;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.uml2.uml.Class;


public class GenerateFactoryHandler extends AbstractCompositeUtilsHandler {
	
	@Override
	public RecordingCommand getUpdateCommand(Class context, TransactionalEditingDomain domain) {
		return new GenerateFactoryCommand(context, domain);
	}

	/**
	 * Command that generate factory for a given class.
	 * @see Utils.getFactory
	 */
	protected class GenerateFactoryCommand extends RecordingCommand {

		protected Class context ;

		public GenerateFactoryCommand(Class context, TransactionalEditingDomain domain) {
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
			Utils.getFactory(context);
		}
	}
}
