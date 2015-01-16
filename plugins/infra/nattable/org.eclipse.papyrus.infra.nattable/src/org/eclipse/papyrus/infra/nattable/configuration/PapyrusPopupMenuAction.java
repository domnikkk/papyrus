/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.nattable.configuration;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.style.DisplayMode;
import org.eclipse.nebula.widgets.nattable.ui.menu.PopupMenuAction;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.infra.nattable.Activator;
import org.eclipse.papyrus.infra.nattable.handler.TreeRowHideShowCategoryHandler;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.messages.Messages;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.utils.Constants;
import org.eclipse.papyrus.infra.nattable.utils.FillingConfigurationUtils;
import org.eclipse.papyrus.infra.nattable.utils.NattableConfigAttributes;
import org.eclipse.papyrus.infra.nattable.utils.StyleUtils;
import org.eclipse.papyrus.infra.tools.util.EclipseCommandUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.IHandlerService;

/**
 * PopupAction for Papyrus -> The contents of the popup is builded for each right click and not builded only one time as in NatTable
 *
 * @author vl222926
 *
 */
public class PapyrusPopupMenuAction extends PopupMenuAction {

	/** the category of the commands to add to this menu */
	private final String category;

	/**
	 *
	 * Constructor.
	 *
	 * @param categoryId
	 *            the category of the commands to add to this menu
	 */
	public PapyrusPopupMenuAction(final String categoryId) {
		super(null);// because we create the menu for each run
		this.category = categoryId;
	}

	/**
	 *
	 * @see org.eclipse.nebula.widgets.nattable.ui.menu.PopupMenuAction#run(org.eclipse.nebula.widgets.nattable.NatTable, org.eclipse.swt.events.MouseEvent)
	 *
	 * @param natTable
	 * @param event
	 */
	@Override
	public void run(NatTable natTable, MouseEvent event) {
		// we need to recreate the menu each time (we need to verify for each action if it is enabled or not
		Menu menu = new Menu(natTable.getShell());
		buildMenu(menu, natTable, event.data);
		menu.setData(event.data);
		// PopupMenuBuilder builder = new PopupMenuBuilder(natTable, menu).withHideRowMenuItem();
		// builder.withShowAllRowsMenuItem();
		menu.setVisible(true);
	}

	/**
	 *
	 * @param popupMenu
	 * @param eventData
	 */
	private void buildMenu(final Menu popupMenu, final NatTable natTable, final Object eventData) {
		final Collection<Command> commands = EclipseCommandUtils.getAllExistingCommandsInCategory(category);

		// TODO : we should use the EclipseContext to transfert the eventData from here to the handler, but currently we can't have dependency on e4 plugins
		// final IEclipseContext eclipseContext = (IEclipseContext)PlatformUI.getWorkbench().getService(IEclipseContext.class);
		// eclipseContext.set(AbstractTableHandler.NAT_EVENT_DATA_PARAMETER_ID, eventData);

		for (final Command command : commands) {
			final IHandler handler = command.getHandler();
			if (handler == null || !(handler instanceof AbstractHandler)) {
				continue;
			}
			// TODO : we should use the EclipseContext to transfert the eventData from here to the handler, but currently we can't have dependency on e4 plugins
			// ((AbstractHandler)handler).setEnabled(eclipseContext);
			((AbstractHandler) handler).setEnabled(null);
			boolean isEnabled = handler.isEnabled();

			if (isEnabled) {
				if (this.category.equals(Constants.ROW_HEADER_COMMANDS_CATEGORY) && TreeRowHideShowCategoryHandler.COMMAND_ID.equals(command.getId())) {
					addShowHideCategoryCommandToMenu(popupMenu, command, natTable, eventData);
					continue;
				}
				MenuItem item = new MenuItem(popupMenu, SWT.PUSH);
				item.setEnabled(true);
				ImageDescriptor imageDescriptor = EclipseCommandUtils.getCommandIcon(command);
				if (imageDescriptor != null) {
					item.setImage(imageDescriptor.createImage());
				}
				try {
					item.setText(command.getName());
				} catch (NotDefinedException e) {
					Activator.log.error(e);
				}
				item.addSelectionListener(new SelectionListener() {

					@Override
					public void widgetSelected(SelectionEvent e) {
						executeCommand(command.getId());
					}

					@Override
					public void widgetDefaultSelected(SelectionEvent e) {
						// nothing do to
					}
				});
			}
		}
	}

	/**
	 * execute the command
	 */
	private void executeCommand(String commandId) {
		IHandlerService handlerService = PlatformUI.getWorkbench().getService(IHandlerService.class);
		if (handlerService == null) {
			Activator.log.warn("Handler service not found"); //$NON-NLS-1$
			return;
		}
		try {
			handlerService.executeCommand(commandId, new Event());
		} catch (ExecutionException e) {
			Activator.log.error(e);
		} catch (NotDefinedException e) {
			Activator.log.error(e);
		} catch (NotEnabledException e) {
			Activator.log.error(e);
		} catch (NotHandledException e) {
			Activator.log.error(e);
		}
	}


	/**
	 *
	 * @param menu
	 * @param command
	 * @param natTable
	 * @param eventData
	 */
	// TODO we should refactor code to create a new class PapyrusTreePopupMenu
	private void addShowHideCategoryCommandToMenu(final Menu menu, final Command command, final NatTable natTable, final Object eventData) {
		Table table = getTable(natTable);
		int maxDepth = FillingConfigurationUtils.getMaxDepthForTree(table);
		int min = 0;
		if (!FillingConfigurationUtils.hasTreeFillingConfigurationForDepth(table, 0)) {
			min++;
		}
		final IHandler handler = command.getHandler();
		for (int depth = min; depth <= maxDepth; depth++) {
			MenuItem item = new MenuItem(menu, SWT.CHECK);
			final boolean isHidden = isHidden(table, depth);
			item.setSelection(!isHidden);
			String text = null;
			text = NLS.bind(Messages.PapyrusPopupMenuAction_ShowCategoriesOnDepth, depth);
			item.setText(text);
			final Integer index = depth;
			item.addSelectionListener(new SelectionListener() {

				@Override
				public void widgetSelected(SelectionEvent arg0) {
					// TODO : we must be able to give the SelectionEvent to the handler using EclispeContext
					Map<Object, Object> parameters = new HashMap<Object, Object>();
					parameters.put(TreeRowHideShowCategoryHandler.DEPTH_PARAMETER_KEY, index);
					parameters.put(TreeRowHideShowCategoryHandler.HIDE_CATEGORY_PARAMETER_KEY, Boolean.valueOf(!isHidden));
					try {
						handler.execute(new ExecutionEvent(command, parameters, null, null));
					} catch (ExecutionException e) {
						Activator.log.error(e);
					}
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent arg0) {
				}
			});
		}
	}

	private boolean isHidden(Table table, int depth) {
		return StyleUtils.getHiddenDepths(table).contains(Integer.valueOf(depth));
	}

	/**
	 *
	 * @param natTable
	 *            the natTable widget
	 * @return
	 *         the table
	 */
	private Table getTable(NatTable natTable) {
		IConfigRegistry configRegistry = natTable.getConfigRegistry();
		INattableModelManager modelManager = configRegistry.getConfigAttribute(NattableConfigAttributes.NATTABLE_MODEL_MANAGER_CONFIG_ATTRIBUTE, DisplayMode.NORMAL, NattableConfigAttributes.NATTABLE_MODEL_MANAGER_ID);
		return modelManager.getTable();
	}
}
