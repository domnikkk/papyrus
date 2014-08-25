package org.eclipse.papyrus.eastadl.nattable.menu.handlers;

import org.eclipse.emf.common.command.Command;
import org.eclipse.papyrus.eastadl.service.types.handlers.AbstractEastadlCreateCommandHandler;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.utils.INattableModelManagerUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.uml.nattable.menu.util.TableMenuUtils;
import org.eclipse.papyrus.uml.service.types.utils.ICommandContext;

public abstract class AbstractEastadlNattableCreateCommandHandler extends
		AbstractEastadlCreateCommandHandler {

	/**
	 * <pre>
	 *
	 * Build the create command for an element creation in the selected container.
	 * The create command is given by the {@link IElementEditService} of selected
	 * element.
	 *
	 * @return the composite creation command for current selection
	 *
	 * </pre>
	 */
	@Override
	protected Command buildCommand() {
		Command createCmd = super.buildCommand();

		return TableMenuUtils.buildNattableCreationCommand(createCmd,
				this.createRequest);
	}

	/**
	 * Obtain the context of the active table editor.
	 *
	 * @see org.eclipse.papyrus.uml.service.types.handlers.AbstractCommandHandler#getCommandContext()
	 *
	 * @return
	 */
	@Override
	protected ICommandContext getCommandContext() {
		return TableMenuUtils.getTableCommandContext(INattableModelManagerUtils
				.getTableManagerFromWorkbenchPart(getActiveWorkbenchPart()));

	}

	/**
	 * Verify if this handler is currently active and the command can execute.
	 * Additionally, verify if this table can add this type of element.
	 *
	 * @see org.eclipse.papyrus.uml.service.types.handlers.AbstractCreateCommandHandler#setEnabled(java.lang.Object)
	 *
	 * @param evaluationContext
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		INattableModelManager tableManager = INattableModelManagerUtils
				.getTableManagerFromWorkbenchPart(getActiveWorkbenchPart());
		boolean isEnabled = tableManager
				.canCreateRowElement(getElementTypeToCreate().getId());
		if (isEnabled) {
			// we test the enable of the super implementation
			super.setEnabled(evaluationContext);
			isEnabled = super.isEnabled();
		}
		setBaseEnabled(isEnabled);

	}

}
