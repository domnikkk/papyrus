/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *  
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.menu.handlers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.commands.util.NonDirtyingUtils;
import org.eclipse.papyrus.commands.wrappers.EMFtoGEFCommandWrapper;
import org.eclipse.papyrus.commands.wrappers.GMFtoGEFCommandWrapper;
import org.eclipse.papyrus.infra.core.clipboard.PapyrusClipboard;
import org.eclipse.papyrus.infra.gmfdiag.common.commands.DefaultDiagramCopyCommand;
import org.eclipse.papyrus.infra.gmfdiag.common.strategy.IStrategy;
import org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy;
import org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.PasteStrategyManager;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.DiagramEditPartsUtil;
import org.eclipse.papyrus.infra.gmfdiag.menu.handlers.CopyInDiagramHandler.MyCopyImageCommand;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * Handler for the Cut Action in Diagram : it's a copy followed by a delete
 */
public class CutInDiagramHandler extends AbstractGraphicalCommandHandler {

	private static final String ACTIVE_SHELL = "activeShell"; //$NON-NLS-1$
	private static final String ACTIVE_FOCUS_CONTROL = "activeFocusControl";  //$NON-NLS-1$

	@Override
	protected Command getCommand() {
		CompoundCommand cutInDiagramCommand = new CompoundCommand("Cut in Diagram Command"); //$NON-NLS-1$
		Command buildCopy = buildCopyCommand();
		cutInDiagramCommand.add(buildCopy);
		Command buildDelete = buildDeleteCommand();
		cutInDiagramCommand.add(buildDelete);
		return cutInDiagramCommand;
	}

	/**
	 * Construct a copy command with the cut selection
	 * @return the copy command
	 */
	protected Command buildCopyCommand() {
		PapyrusClipboard<Object> papyrusClipboard = PapyrusClipboard.getNewInstance();
		List<IGraphicalEditPart> selectedElements = getSelectedElements();
		TransactionalEditingDomain editingDomain = getEditingDomain();
		Command copyCommand;
		DefaultDiagramCopyCommand defaultDiagramCopyCommand = new DefaultDiagramCopyCommand(editingDomain, papyrusClipboard, selectedElements);
		copyCommand = EMFtoGEFCommandWrapper.wrap(defaultDiagramCopyCommand);
		IDiagramWorkbenchPart activeDiagramWorkbenchPart = DiagramEditPartsUtil.getActiveDiagramWorkbenchPart();
		Diagram diagram = activeDiagramWorkbenchPart.getDiagram();
		DiagramEditPart diagramEditPart = activeDiagramWorkbenchPart.getDiagramEditPart();
		List<Object> selectedElementModels = new ArrayList<Object>();
		for(IGraphicalEditPart iGraphicalEditPart : selectedElements) {
			selectedElementModels.add(iGraphicalEditPart.getModel());
		}
		MyCopyImageCommand copyImageCommand = new MyCopyImageCommand("Create image to allow paste on system", diagram, selectedElementModels, diagramEditPart); //$NON-NLS-1$
		if(copyImageCommand.canExecute()) {
			Command gmFtoGEFCommandWrapper = GMFtoGEFCommandWrapper.wrap(copyImageCommand);
			copyCommand = NonDirtyingUtils.chain(copyCommand, gmFtoGEFCommandWrapper);
		} else {
			copyImageCommand.dispose();
		}

		List<IStrategy> allStrategies = PasteStrategyManager.getInstance().getAllStrategies();
		for(IStrategy iStrategy : allStrategies) {
			IPasteStrategy iIPasteStrategy = (IPasteStrategy)iStrategy;
			iIPasteStrategy.prepare(papyrusClipboard);
		}

		return copyCommand;
	}

	/**
	 * Construct a delete command with the cut selection
	 * @return the delete command
	 */	
	protected Command buildDeleteCommand() {

		TransactionalEditingDomain editingDomain = getEditingDomain();

		if(editingDomain == null) {
			return UnexecutableCommand.INSTANCE;
		}

		// Retrieve currently selected IGraphicalEditPart(s)
		List<IGraphicalEditPart> editParts = getSelectedElements();
		if(editParts.isEmpty()) {
			return UnexecutableCommand.INSTANCE;
		}

		// Iterate over selection and retrieve the deletion command from each
		// edit part
		// Add each returned command to the composite command
		CompositeTransactionalCommand command = new CompositeTransactionalCommand(editingDomain, "Delete From Model"); //$NON-NLS-1$

		Iterator<IGraphicalEditPart> it = editParts.iterator();
		while(it.hasNext()) {
			IGraphicalEditPart editPart = it.next();

			if(!(editPart instanceof DiagramEditPart)) {
				// Look for the GMF deletion command
				Command curCommand = editPart.getCommand(new EditCommandRequestWrapper(new DestroyElementRequest(false)));
				if(curCommand != null) {
					command.compose(new CommandProxy(curCommand));
				}
			}
		}

		if(command.isEmpty()) {
			return UnexecutableCommand.INSTANCE;
		}

		return new ICommandProxy(command);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.papyrus.infra.gmfdiag.menu.handlers.
	 * AbstractGraphicalCommandHandler#setEnabled(java.lang.Object)
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		if(evaluationContext instanceof IEvaluationContext) {
			IEvaluationContext iEvaluationContext = (IEvaluationContext)evaluationContext;
			Object activeFocusControl = iEvaluationContext.getVariable(ACTIVE_FOCUS_CONTROL); 
			Object activeShell = iEvaluationContext.getVariable(ACTIVE_SHELL);
			Control focusControl = null;
			if(activeShell instanceof Shell) {
				Shell shell = (Shell)activeShell;
				Display display = shell.getDisplay();
				if(display != null) {
					focusControl = display.getFocusControl();
				}
			}
			if(activeFocusControl instanceof StyledText || focusControl instanceof Text) { // true if the focus is
																							// on an internal xtext
																							// editor or a text edit
				setBaseEnabled(false);
			} else {
				PapyrusClipboard<Object> instance = PapyrusClipboard.getInstance();
				super.setEnabled(evaluationContext);
				PapyrusClipboard.setInstance(instance);
			}
		}
	}

}
