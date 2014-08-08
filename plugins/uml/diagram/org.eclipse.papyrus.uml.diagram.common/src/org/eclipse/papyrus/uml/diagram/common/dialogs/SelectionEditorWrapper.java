/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.common.dialogs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.papyrus.infra.widgets.editors.SelectionEditor;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;


/**
 * Wrapper for both selection editor.
 * <ul>
 * <li>SelectionEditor</li>
 * <li>ExtendedSelectionEditor</li>
 * </ul>
 * 
 * @author Gabriel Pascual (ALL4TEC)
 *
 */
public class SelectionEditorWrapper implements SelectionListener {

	/** The wrapped selection editor. */
	private SelectionListener wrappedSelectionEditor = null;

	/** The wrapped editor class. */
	private Class<?> wrappedEditorClass = null;

	/**
	 * Instantiates a new selection editor wrapper.
	 *
	 * @param selectionEditor
	 *        the selection editor
	 * @param editorClass
	 *        the editor class
	 */
	public SelectionEditorWrapper(SelectionListener selectionEditor, Class<?> editorClass) {
		wrappedSelectionEditor = selectionEditor;
		wrappedEditorClass = editorClass;
	}

	/**
	 * Creates the.
	 */
	public void create() {
		if(SelectionEditor.class.equals(wrappedEditorClass)) {
			((SelectionEditor)wrappedSelectionEditor).create();
		} else if(ExtendedSelectionEditor.class.equals(wrappedEditorClass)) {
			((ExtendedSelectionEditor)wrappedSelectionEditor).create();
		}

	}

	/**
	 * Sets the layout data.
	 *
	 * @param layoutData
	 *        the new layout data
	 */
	public void setLayoutData(Object layoutData) {
		if(SelectionEditor.class.equals(wrappedEditorClass)) {
			((SelectionEditor)wrappedSelectionEditor).setLayoutData(layoutData);
		} else if(ExtendedSelectionEditor.class.equals(wrappedEditorClass)) {
			((ExtendedSelectionEditor)wrappedSelectionEditor).setLayoutData(layoutData);
		}

	}

	/**
	 * Gets the selected elements.
	 *
	 * @return the selected elements
	 */
	public Collection<?> getSelectedElements() {

		Collection<?> selectedElements = null;
		if(SelectionEditor.class.equals(wrappedEditorClass)) {
			selectedElements = ((SelectionEditor)wrappedSelectionEditor).getSelectedElements();
		} else if(ExtendedSelectionEditor.class.equals(wrappedEditorClass)) {
			selectedElements = ((ExtendedSelectionEditor)wrappedSelectionEditor).getSelectedElements();
		}

		return selectedElements;
	}

	/**
	 * Gets the element to remove.
	 *
	 * @return the element to remove
	 */
	public List<Object> getElementToRemove() {
		List<Object> elementsToRemove = null;
		if(SelectionEditor.class.equals(wrappedEditorClass)) {
			elementsToRemove = ((SelectionEditor)wrappedSelectionEditor).getElementToRemove();
		} else if(ExtendedSelectionEditor.class.equals(wrappedEditorClass)) {
			elementsToRemove = ((ExtendedSelectionEditor)wrappedSelectionEditor).getElementToRemove();
		} else {
			elementsToRemove = new ArrayList<Object>();
		}

		return elementsToRemove;
	}

	/**
	 * Gets the element to add.
	 *
	 * @return the element to add
	 */
	public List<Object> getElementToAdd() {
		List<Object> elementsToAdd = null;
		if(SelectionEditor.class.equals(wrappedEditorClass)) {
			elementsToAdd = ((SelectionEditor)wrappedSelectionEditor).getElementToAdd();
		} else if(ExtendedSelectionEditor.class.equals(wrappedEditorClass)) {
			elementsToAdd = ((ExtendedSelectionEditor)wrappedSelectionEditor).getElementToAdd();
		} else {
			elementsToAdd = new ArrayList<Object>();
		}

		return elementsToAdd;
	}

	/**
	 * Gets the selection.
	 *
	 * @return the selection
	 */
	public ISelection getSelection() {
		if(ExtendedSelectionEditor.class.equals(wrappedEditorClass)) {
			return ((ExtendedSelectionEditor)wrappedSelectionEditor).getSelectedElementsViewer().getSelection();
		}
		return null;
	}

	/**
	 * Refresh.
	 */
	public void refresh() {
		if(ExtendedSelectionEditor.class.equals(wrappedEditorClass)) {
			((ExtendedSelectionEditor)wrappedSelectionEditor).getSelectedElementsViewer().refresh();
		}

	}

	/**
	 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	 *
	 * @param e
	 */
	@Override
	public void widgetSelected(SelectionEvent e) {
		wrappedSelectionEditor.widgetSelected(e);

	}

	/**
	 * Widget default selected.
	 *
	 * @param e
	 *        the e
	 * @see org.eclipse.swt.events.SelectionListener#widgetDefaultSelected(org.eclipse.swt.events.SelectionEvent)
	 */
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		wrappedSelectionEditor.widgetDefaultSelected(e);

	}
}
