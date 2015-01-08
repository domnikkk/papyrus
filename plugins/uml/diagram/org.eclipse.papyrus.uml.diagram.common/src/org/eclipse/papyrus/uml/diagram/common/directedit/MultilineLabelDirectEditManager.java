/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 *  Benoit Maggi  benoit.maggi@cea.fr - Bug 444063
 *
 *****************************************************************************/

package org.eclipse.papyrus.uml.diagram.common.directedit;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.common.ui.contentassist.ContentAssistantHelper;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.label.ILabelDelegate;
import org.eclipse.gmf.runtime.diagram.ui.tools.DirectEditManagerBase;
import org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager;
import org.eclipse.gmf.runtime.gef.ui.internal.parts.TextCellEditorEx;
import org.eclipse.gmf.runtime.gef.ui.internal.parts.WrapTextCellEditor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.PapyrusLabelEditPart;
import org.eclipse.papyrus.uml.diagram.common.figure.node.IMultilineEditableFigure;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.part.CellEditorActionHandler;

/**
 * Inspired from {@link org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager} but use static to avoid concurrency problem on restore (Bug 444063)
 */
public class MultilineLabelDirectEditManager extends DirectEditManagerBase {

	private static IAction copy, cut, paste, undo, redo, find, selectAll, delete;

	private static IActionBars actionBars;

	private CellEditorActionHandler actionHandler;

	protected boolean multiLine = false;

	private GraphicalEditPart source;

	/**
	 * Constructor.
	 *
	 * @param source
	 * @param editorType
	 * @param locator
	 */
	public MultilineLabelDirectEditManager(GraphicalEditPart source, Class editorType, CellEditorLocator locator) {
		super(source, editorType, locator);
		this.source = source;

		if (editorType != null && MultiLineCellEditor.class.isAssignableFrom(editorType)) {
			multiLine = true;
		}

	}

	/**
	 * @param source
	 *            the <code>GraphicalEditPart</code> that is used to determine
	 *            which <code>CellEditor</code> class to use.
	 * @return the <code>Class</code> of the <code>CellEditor</code> to use for
	 *         the text editing.
	 */
	public static Class getTextCellEditorClass(GraphicalEditPart source) {
		IFigure figure = source.getFigure();

		if (figure instanceof IMultilineEditableFigure) {
			return MultiLineCellEditor.class;
		} else {
			return TextDirectEditManager.getTextCellEditorClass(source);
		}
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager#createCellEditorOn(org.eclipse.swt.widgets.Composite)
	 *
	 * @param composite
	 *            the editor on which to create the direct editor
	 * @return the cell editor
	 */
	@Override
	protected CellEditor createCellEditorOn(Composite composite) {
		if (multiLine) {
			// creates a new TextCell Editor, but with multiline support
			return new TextCellEditor(composite, SWT.MULTI | SWT.WRAP);
		}
		return super.createCellEditorOn(composite);
	}

	/**
	 * constructor
	 *
	 * @param source
	 *            <code>GraphicalEditPart</code> to support direct edit of. The
	 *            figure of the <code>source</code> edit part must be of type <code>WrapLabel</code>.
	 */
	public MultilineLabelDirectEditManager(ITextAwareEditPart source) {
		super(source);
	}

	/**
	 * @param source
	 *            the <code>ITextAwareEditPart</code> to determine the cell
	 *            editor for
	 * @return the <code>CellEditorLocator</code> that is appropriate for the
	 *         source <code>EditPart</code>
	 */
	public static CellEditorLocator getTextCellEditorLocator(final ITextAwareEditPart source) {
		return getCellEditorLocator(source);
	}

	@Override
	protected CellEditor doCreateCellEditorOn(Composite composite) {

		ILabelDelegate label = (ILabelDelegate) getEditPart().getAdapter(ILabelDelegate.class);
		if (label != null && label.isTextWrapOn()) {
			int style = SWT.WRAP | SWT.MULTI;

			switch (label.getTextJustification()) {
			case PositionConstants.LEFT:
				style = style | SWT.LEAD;
				break;
			case PositionConstants.RIGHT:
				style = style | SWT.TRAIL;
				break;
			case PositionConstants.CENTER:
				style = style | SWT.CENTER;
				break;
			default:
				break;
			}
			return new WrapTextCellEditor(composite, style);
		} else {
			return new TextCellEditorEx(composite);
		}
	}

	/**
	 * This method is used to set the cell editors text
	 *
	 * @param toEdit
	 *            String to be set in the cell editor
	 */
	@Override
	public void setEditText(String toEdit) {
		super.setEditText(toEdit);

		// Get the cell editor
		CellEditor cellEditor = getCellEditor();

		// IF the cell editor doesn't exist yet...
		if (cellEditor == null) {
			// Do nothing
			return;
		}

		// Get the Text control
		Text textControl = (Text) cellEditor.getControl();

		// Set the controls text and position the caret at the end of the text
		textControl.setSelection(toEdit.length());
	}

	@Override
	protected void createContentAssistant(Control control, Color proposalPopupForegroundColor, Color proposalPopupBackgroundColor, IContentAssistProcessor processor) {
		ContentAssistantHelper.createTextContentAssistant((Text) control, proposalPopupForegroundColor, proposalPopupBackgroundColor, processor);
	}

	@Override
	protected void initCellEditor() {
		super.initCellEditor();

		if (source instanceof PapyrusLabelEditPart) {
			int alignment = ((PapyrusLabelEditPart) source).getTextAlignment();
			Text text = (Text) getCellEditor().getControl();
			switch (alignment) {
			case PositionConstants.RIGHT:
				text.setOrientation(SWT.RIGHT_TO_LEFT);
				break;
			case PositionConstants.LEFT:
				text.setOrientation(SWT.LEFT_TO_RIGHT);
				break;
			default:
				text.setOrientation(SWT.LEFT_TO_RIGHT);
				break;
			}
		}

		// Hook the cell editor's copy/paste actions to the actionBars so that they can
		// be invoked via keyboard shortcuts.

		IActionBars editorActionBars = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor()
				.getEditorSite().getActionBars();
		if (actionBars != null) {
			restoreSavedActions(editorActionBars);
		}
		saveCurrentActions(editorActionBars);
		actionBars = editorActionBars;
		actionHandler = new CellEditorActionHandler(actionBars);
		actionHandler.addCellEditor(getCellEditor());
		actionBars.updateActionBars();

	}

	/**
	 * @see org.eclipse.gef.tools.DirectEditManager#bringDown()
	 */
	@Override
	protected void bringDown() {
		super.bringDown();

		if (actionHandler != null) {
			actionHandler.dispose();
			actionHandler = null;
		}
		if (actionBars != null) {
			restoreSavedActions(actionBars);
			actionBars.updateActionBars();
			actionBars = null;
		}
	}

	private void saveCurrentActions(IActionBars _actionBars) {
		copy = _actionBars.getGlobalActionHandler(ActionFactory.COPY.getId());
		paste = _actionBars.getGlobalActionHandler(ActionFactory.PASTE.getId());
		delete = _actionBars.getGlobalActionHandler(ActionFactory.DELETE.getId());
		selectAll = _actionBars.getGlobalActionHandler(ActionFactory.SELECT_ALL.getId());
		cut = _actionBars.getGlobalActionHandler(ActionFactory.CUT.getId());
		find = _actionBars.getGlobalActionHandler(ActionFactory.FIND.getId());
		undo = _actionBars.getGlobalActionHandler(ActionFactory.UNDO.getId());
		redo = _actionBars.getGlobalActionHandler(ActionFactory.REDO.getId());
	}

	private void restoreSavedActions(IActionBars _actionBars) {
		_actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(), copy);
		_actionBars.setGlobalActionHandler(ActionFactory.PASTE.getId(), paste);
		_actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(), delete);
		_actionBars.setGlobalActionHandler(ActionFactory.SELECT_ALL.getId(), selectAll);
		_actionBars.setGlobalActionHandler(ActionFactory.CUT.getId(), cut);
		_actionBars.setGlobalActionHandler(ActionFactory.FIND.getId(), find);
		_actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(), undo);
		_actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(), redo);
	}

}