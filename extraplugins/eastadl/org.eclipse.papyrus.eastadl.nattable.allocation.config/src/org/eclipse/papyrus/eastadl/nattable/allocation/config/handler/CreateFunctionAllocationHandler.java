/**
 * 
 */
package org.eclipse.papyrus.eastadl.nattable.allocation.config.handler;

import org.eclipse.emf.common.command.Command;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.papyrus.eastadl.nattable.menu.handlers.FunctionAllocationHandler;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.utils.INattableModelManagerUtils;

public class CreateFunctionAllocationHandler extends FunctionAllocationHandler {

	/**
	 * the id used for the Papyrus SysML Allocation Table
	 */
	public static final String TABLE_ALLOCATION_TYPE = "EAST-ADLFunctionAllocationTable"; //$NON-NLS-1$

	/**
	 * 
	 * @see org.eclipse.papyrus.sysml.nattable.menu.handlers.AbstractSysmlNattableCreateCommandHandler#setEnabled(java.lang.Object)
	 * 
	 * @param evaluationContext
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		Command command = getCommand();
		boolean isEnabled = command.canExecute();
		INattableModelManager tableManager = INattableModelManagerUtils.getTableManagerFromWorkbenchPart(getActiveWorkbenchPart());
		isEnabled = isEnabled && tableManager.getTable().getTableConfiguration().getType().equals(TABLE_ALLOCATION_TYPE);
		if(isEnabled) {
			IElementType newElementType = getElementTypeToCreate();
			String id = newElementType.getId();
			isEnabled = tableManager.canCreateRowElement(id);
		}
		setBaseEnabled(isEnabled);

	}

}