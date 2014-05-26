/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Thibault Le Ouay t.leouay@sherpa-eng.com - Add binding implementation
 *  Christian W. Damus (CEA) - bug 402525
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.profile.drafter.ui.dialog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.papyrus.infra.widgets.Activator;
import org.eclipse.papyrus.infra.widgets.creation.ReferenceValueFactory;
import org.eclipse.papyrus.infra.widgets.editors.IElementSelectionListener;
import org.eclipse.papyrus.infra.widgets.editors.IElementSelector;
import org.eclipse.papyrus.infra.widgets.messages.Messages;
import org.eclipse.papyrus.infra.widgets.providers.CollectionContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Tree;

/**
 * Object Chooser. Defines a standard popup for selecting
 * multiple values. If this dialog is used to select or create model
 * elements to be added to or removed from some element that is being
 * edited, then it is important to {@linkplain #setContextElement(Object) set that contextual element} in this dialog.
 *
 * TODO 
 *  - regler l'initiailisation des elements de depart (fait dans open() ds l'original)
 *  - regler la construction du result (fait dans okPressed() dans l'original)
 * 
 * @author Camille Letavernier
 * @author cedric dumoulin
 * Copied from /org.eclipse.papyrus.infra.widgets/src/org/eclipse/papyrus/infra/widgets/editors/MultipleValueSelectorDialog.java
 *
 * @see #setContextElement(Object)
 */
public class MultipleValueSelectorWidget  implements ISelectionChangedListener, IDoubleClickListener, IElementSelectionListener, SelectionListener {

	public static int MANY = -1;

	/**
	 * The content area. This is the root parent of this widget.
	 * It is created by the widget.
	 */
	protected Composite contentArea;
	
	/**
	 * The object selector
	 */
	protected IElementSelector selector;

	/**
	 * The SWT Composite in which the selector is drawn
	 */
	protected Composite selectorSection;

	/**
	 * The add/remove/addAll buttons section
	 */
	protected Composite buttonsSection;

	/**
	 * The up/down buttons section
	 */
	protected Composite rightButtonsSection;

	/**
	 * The listViewer for chosen elements
	 */
	protected StructuredViewer selectedElementsViewer;

	/**
	 * The list for chosen elements
	 */
	protected Tree selectedElements;

	/**
	 * The add action button
	 */
	protected Button add;

	/**
	 * The create action button
	 */
	protected Button create;

	/**
	 * The delete action button
	 */
	protected Button delete;

	/**
	 * The remove action button
	 */
	protected Button remove;

	/**
	 * The add all action button
	 */
	protected Button addAll;

	/**
	 * The remove all action button
	 */
	protected Button removeAll;

	/**
	 * the up action button
	 */
	protected Button up;

	/**
	 * the down action button
	 */
	protected Button down;

	/**
	 * The label provider for the listViewer of chosen elements
	 */
	protected ILabelProvider labelProvider;

	/**
	 * The currently chosen elements
	 */
	protected final Collection<Object> allElements;

	/**
	 * a collection of the initially-selected elements
	 */
	private List initialSelections = new ArrayList();

	/**
	 * Indicates if the values should be unique (according to Object.equals())
	 */
	protected boolean unique;

	/**
	 * Indicates if the list is ordered
	 */
	protected boolean ordered;

	/**
	 * The factory for creating new elements
	 */
	protected ReferenceValueFactory factory;

	/**
	 * The model element being edited (if any), to which elements are to be added or removed.
	 */
	protected Object contextElement;

	/**
	 * The list of newly created objects
	 */
	protected Set<Object> newObjects = new HashSet<Object>();


	/**
	 * The maximum number of values selected.
	 */
	protected int upperBound;

	/**
	 *  the final collection of selected elements, or null if this dialog was
	 * canceled
	 */
	private Object[] result;


	/**
	 * Constructor.
	 *
	 * @param parentShell
	 *        The shell in which this dialog should be opened
	 * @param selector
	 *        The element selector used by this dialog
	 *  
	 *  @wbp.parser.constructor
	 */
	public MultipleValueSelectorWidget(Composite parentShell, IElementSelector selector) {
		this(parentShell, selector, null, false, false);
	}

	/**
	 * Constructor.
	 *
	 * @param parentShell
	 *        The shell in which this dialog should be opened
	 * @param selector
	 *        The element selector used by this dialog
	 * @param title
	 *        The title of this dialog
	 */
	public MultipleValueSelectorWidget(Composite parentShell, IElementSelector selector, String title) {
		this(parentShell, selector, title, false, false);
	}

	/**
	 *
	 * Constructor.
	 *
	 * @param parentShell
	 *        The shell in which this dialog should be opened
	 * @param selector
	 *        The element selector used by this dialog
	 * @param unique
	 *        True if the values returned by this dialog should be unique
	 */
	public MultipleValueSelectorWidget(Composite parentShell, IElementSelector selector, boolean unique) {
		this(parentShell, selector, null, unique, false);
	}

	/**
	 *
	 * Constructor.
	 *
	 * @param parentShell
	 *        The shell in which this dialog should be opened
	 * @param selector
	 *        The element selector used by this dialog
	 * @param title
	 *        The title of this dialog
	 * @param unique
	 *        True if the values returned by this dialog should be unique
	 */
	public MultipleValueSelectorWidget(Composite parentShell, IElementSelector selector, String title, boolean unique, boolean ordered) {
		this(parentShell, selector, title, unique, false, MANY);
	}

	/**
	 *
	 * Constructor.
	 *
	 * @param parentShell
	 *        The shell in which this dialog should be opened
	 * @param selector
	 *        The element selector used by this dialog
	 * @param title
	 *        The title of this dialog
	 * @param unique
	 *        True if the values returned by this dialog should be unique
	 * @param upperBound
	 *        The maximum number of values selected.
	 */
	public MultipleValueSelectorWidget(Composite parent, IElementSelector selector, String title, boolean unique, boolean ordered, int upperBound) {
		Assert.isNotNull(selector, "The element selector should be defined"); //$NON-NLS-1$
		this.selector = selector;
		allElements = unique ? new LinkedHashSet<Object>() : new LinkedList<Object>();
//		setHelpAvailable(false);
//		setTitle(title);
		this.unique = unique;
		this.ordered = ordered;
		this.upperBound = upperBound;
		selector.addElementSelectionListener(this);
		
		// Create the Composite
		createContent(parent);
		
		// finalize init
		updateControls();
		hookControl();
	}

//	@Override
//	protected void configureShell(Shell shell) {
//		super.configureShell(shell);
//		shell.setImage(Activator.getDefault().getImage("/icons/papyrus.png")); //$NON-NLS-1$
//	}
//
	/**
	 * Create the content of the widget
	 * 
	 * @param parent
	 */
	protected void createContent( Composite parent ) {
		// create the content area
		contentArea = createContentArea(parent);
		createDialogContents();
		
	}
	protected Composite createContentArea(Composite parent) {
		// create a composite with standard margins and spacing
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
//		layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
//		layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
//		layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
//		layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
		layout.numColumns = 2;
		layout.makeColumnsEqualWidth = true;
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		return composite;
		
				
	}
	
	/**
	 * Create the contents of the dialog
	 */
	protected void createDialogContents() {
		Composite parent = contentArea;

		Composite selectorPane = new Composite(parent, SWT.NONE);
		selectorPane.setLayout(new GridLayout(2, false));
		selectorPane.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Composite selectedPane = new Composite(parent, SWT.NONE);
		selectedPane.setLayout(new GridLayout(2, false));
		selectedPane.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		createSelectorSection(selectorPane);
		createControlsSection(selectorPane);
		createListSection(selectedPane);
		createRightButtonsSection(selectedPane);
	}

	/**
	 * Creates the selector section
	 *
	 * @param parent
	 *        The composite in which the section is created
	 */
	private void createSelectorSection(Composite parent) {
		selectorSection = new Composite(parent, SWT.NONE);
		selectorSection.setLayout(new FillLayout());
		selectorSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		selector.createControls(selectorSection);
	}

	/**
	 * Creates the main controls section (Add, remove, Add all, remove all)
	 *
	 * @param parent
	 *        The composite in which the section is created
	 */
	private void createControlsSection(Composite parent) {
		buttonsSection = new Composite(parent, SWT.NONE);
		buttonsSection.setLayout(new GridLayout(1, true));

		add = new Button(buttonsSection, SWT.PUSH);
		add.setImage(Activator.getDefault().getImage("/icons/arrow_right.gif")); //$NON-NLS-1$
		add.addSelectionListener(this);
		add.setToolTipText(Messages.MultipleValueSelectorDialog_AddSelectedElements);

		remove = new Button(buttonsSection, SWT.PUSH);
		remove.setImage(Activator.getDefault().getImage("/icons/arrow_left.gif")); //$NON-NLS-1$
		remove.addSelectionListener(this);
		remove.setToolTipText(Messages.MultipleValueEditor_RemoveSelectedElements);

		addAll = new Button(buttonsSection, SWT.PUSH);
		addAll.setImage(Activator.getDefault().getImage("/icons/arrow_double.gif")); //$NON-NLS-1$
		addAll.addSelectionListener(this);
		addAll.setToolTipText(Messages.MultipleValueSelectorDialog_AddAllElements);

		/* Disable the bouton 'addAll' if currently chosen elements is greater than the maximum number of values selected */
		if(this.upperBound != MANY && allElements.size() > this.upperBound) {
			addAll.setEnabled(false);
		}


		removeAll = new Button(buttonsSection, SWT.PUSH);
		removeAll.setImage(Activator.getDefault().getImage("/icons/arrow_left_double.gif")); //$NON-NLS-1$
		removeAll.addSelectionListener(this);
		removeAll.setToolTipText(Messages.MultipleValueSelectorDialog_RemoveAllElements);
	}

	/**
	 * Creates the list displaying the currently selected elements
	 *
	 * @param parent
	 *        The composite in which the section is created
	 */
	private void createListSection(Composite parent) {

		selectedElements = new Tree(parent, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		//		selectedElements.addSelectionListener(this);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		selectedElements.setLayoutData(data);
		selectedElementsViewer = new TreeViewer(selectedElements);

		selectedElementsViewer.addSelectionChangedListener(this);
		selectedElementsViewer.addDoubleClickListener(this);

		selectedElementsViewer.setContentProvider(CollectionContentProvider.instance);

		if(labelProvider != null) {
			selectedElementsViewer.setLabelProvider(labelProvider);
		}

		selectedElementsViewer.setInput(allElements);
		selector.setSelectedElements(allElements.toArray());
	}

	/**
	 * Creates the up/down controls section
	 *
	 * @param parent
	 *        The composite in which the section is created
	 */
	private void createRightButtonsSection(Composite parent) {
		rightButtonsSection = new Composite(parent, SWT.NONE);
		rightButtonsSection.setLayout(new GridLayout(1, true));

		up = new Button(rightButtonsSection, SWT.PUSH);
		up.setImage(Activator.getDefault().getImage("/icons/Up_12x12.gif")); //$NON-NLS-1$
		up.addSelectionListener(this);
		up.setToolTipText(Messages.MultipleValueEditor_MoveSelectedElementsUp);

		down = new Button(rightButtonsSection, SWT.PUSH);
		down.setImage(Activator.getDefault().getImage("/icons/Down_12x12.gif")); //$NON-NLS-1$
		down.addSelectionListener(this);
		down.setToolTipText(Messages.MultipleValueEditor_MoveSelectedElementsDown);

		create = new Button(rightButtonsSection, SWT.PUSH);
		create.setImage(Activator.getDefault().getImage("/icons/Add_12x12.gif")); //$NON-NLS-1$
		create.addSelectionListener(this);
		create.setToolTipText(Messages.MultipleValueSelectorDialog_CreateNewElement);

		delete = new Button(rightButtonsSection, SWT.PUSH);
		delete.setImage(Activator.getDefault().getImage("/icons/Delete_12x12.gif")); //$NON-NLS-1$
		delete.addSelectionListener(this);
		delete.setToolTipText(Messages.MultipleValueSelectorDialog_DeleteNewElement);
		delete.setEnabled(false);
	}

	/**
	 * Sets the label provider used to display the selected elements
	 *
	 * @param labelProvider
	 */
	public void setLabelProvider(ILabelProvider labelProvider) {
		this.labelProvider = labelProvider;
		// Set the selectedElementsViewer, like this it can display elements correctly.
		if(selectedElementsViewer != null) {
			selectedElementsViewer.setLabelProvider(labelProvider);
		}

	}

	/**
	 * {@inheritDoc} Handles the events on one of the control buttons
	 *
	 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	 *
	 * @param e
	 *        The event that occurred
	 */
	@Override
	public void widgetSelected(SelectionEvent e) {
		if(e.widget == add) {
			addAction();
		} else if(e.widget == remove) {
			removeAction();
		} else if(e.widget == addAll) {
			addAllAction();
		} else if(e.widget == removeAll) {
			removeAllAction();
		} else if(e.widget == up) {
			upAction();
		} else if(e.widget == down) {
			downAction();
		} else if(e.widget == create) {
			createAction();
		}

		updateControls();
	}

	/**
	 * Sets the {@link ReferenceValueFactory} for this editor. The {@link ReferenceValueFactory} is used to create
	 * new instances and edit existing ones.
	 *
	 * @param factory
	 *        The {@link ReferenceValueFactory} to be used by this editor
	 */
	public void setFactory(ReferenceValueFactory factory) {
		this.factory = factory;
		updateControls();
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	protected void initAllElements() {
		allElements.clear();
		allElements.addAll(getInitialElementSelections());
	}

	/**
	 * Handles the "Add" action
	 */
	protected void addAction() {
		Object[] elements = selector.getSelectedElements();
		addElements(elements);
	}

	/**
	 * Handles the "Up" action
	 */
	protected void upAction() {
		IStructuredSelection selection = (IStructuredSelection)selectedElementsViewer.getSelection();

		//We need a list to move objects. LinkedHashSet can't do that
		java.util.List<Object> list = new LinkedList<Object>(allElements);
		for(Object o : selection.toArray()) {
			int oldIndex = list.indexOf(o);
			if(oldIndex > 0) {
				move(list, oldIndex, oldIndex - 1);
			}
		}

		allElements.clear();
		allElements.addAll(list);

		IStructuredSelection selectionCopy = new StructuredSelection(selection.toArray());
		selectedElementsViewer.setSelection(selectionCopy);
		selectedElementsViewer.refresh();
	}

	/**
	 * Handles the "Down" action
	 */
	protected void downAction() {
		IStructuredSelection selection = (IStructuredSelection)selectedElementsViewer.getSelection();

		//We need a list to move objects. LinkedHashSet can't do that
		java.util.List<Object> list = new LinkedList<Object>(allElements);

		int maxIndex = list.size() - 1;

		Object[] selectionArray = selection.toArray();
		for(int i = selectionArray.length - 1; i >= 0; i--) {
			Object o = selectionArray[i];
			int oldIndex = list.indexOf(o);
			if(oldIndex < maxIndex) {
				move(list, oldIndex, oldIndex + 1);
			}
		}

		allElements.clear();
		allElements.addAll(list);

		IStructuredSelection selectionCopy = new StructuredSelection(selection.toArray());
		selectedElementsViewer.setSelection(selectionCopy);
		selectedElementsViewer.refresh();
	}

	/**
	 * Handles the "Create" action
	 */
	protected void createAction() {
		if(factory == null) {
			return;
		}

		Object newObject;

		try {
			newObject = factory.createObject(this.create, contextElement);
		} catch (OperationCanceledException e) {
			// The user cancelled and we rolled back pending model changes
			newObject = null;
		}

		if(newObject == null) {
			return;
		}

		newObjects.add(newObject);
		selector.newObjectCreated(newObject);

		Object[] createdObjects = new Object[]{ newObject };
		addElements(createdObjects);

		selector.setSelectedElements(allElements.toArray());
	}

	/**
	 * Moves an element from oldIndex to newIndex
	 *
	 * @param list
	 *        The list in which to move the object
	 * @param oldIndex
	 * @param newIndex
	 */
	private void move(java.util.List<Object> list, int oldIndex, int newIndex) {
		int size = list.size();

		if(oldIndex < 0 || oldIndex >= size) {
			throw new IndexOutOfBoundsException("oldIndex: " + oldIndex + ", size:" + size); //$NON-NLS-1$ //$NON-NLS-2$
		}
		if(newIndex < 0 || newIndex >= size) {
			throw new IndexOutOfBoundsException("newIndex: " + newIndex + ", size:" + size); //$NON-NLS-1$ //$NON-NLS-2$
		}
		Object element = list.remove(oldIndex);
		list.add(newIndex, element);
	}

	/**
	 * Handles the "Remove" action
	 */
	protected void removeAction() {
		IStructuredSelection selection = (IStructuredSelection)selectedElementsViewer.getSelection();
		if(selection.isEmpty()) {
			return;
		}

		for(Object element : selection.toArray()) {
			allElements.remove(element);
		}

		selector.setSelectedElements(allElements.toArray());
		selectedElementsViewer.setSelection(null);
		selectedElementsViewer.refresh();
	}

	/**
	 * Handles the "Delete" action
	 */
	protected void deleteAction() {
		//TODO
	}

	/**
	 * Handles the "Remove all" action
	 */
	protected void removeAllAction() {
		allElements.clear();
		selector.setSelectedElements(new Object[0]);
		selectedElementsViewer.setSelection(null);
		selectedElementsViewer.refresh();
	}

	/**
	 * Handles the "Add All" action
	 */
	protected void addAllAction() {
		Object[] elements = selector.getAllElements();
		addElements(elements);
	}

	/**
	 * Adds the specified elements to the currently selected elements (For
	 * "Add" and "Add all" actions)
	 *
	 * @param elements
	 *        The elements to be added
	 */
	@Override
	public void addElements(Object[] elements) {
		if(elements != null) {
			allElements.addAll(Arrays.asList(elements));
			selectedElementsViewer.refresh();
		}
	}

	/**
	 * Fetch the Result from effectively selected element.
	 * <br>
	 * Was okPressed() in original class.
	 */
	protected void prepareResult() {
		if(factory != null) {
			java.util.List<Object> objectsToValidate = new LinkedList<Object>();
			for(Object object : newObjects) {
				if(allElements.contains(object)) {
					objectsToValidate.add(object);
				}
			}
			factory.validateObjects(objectsToValidate);
			selector.clearTemporaryElements();
		}

		setResult(new LinkedList<Object>(allElements));
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		//Nothing (see #doubleClick())
	}

	/**
	 * Indicates if the selected values should be unique (According to Object.equals())
	 *
	 * @param unique
	 */
	public void setUnique(boolean unique) {
		this.unique = unique;
		updateControls();
	}

	/**
	 * Indicates if the selected elements should be ordered
	 *
	 * @param ordered
	 */
	public void setOrdered(boolean ordered) {
		this.ordered = ordered;
		updateControls();
	}

	private void updateControls() {
		updateControl(up, ordered);
		updateControl(down, ordered);
		updateControl(create, this.factory != null && this.factory.canCreateObject());

		/* Disable the bouton 'add' if the upperBound is reached */
		boolean canAdd = true;
		if(this.upperBound != MANY) {
			if(allElements.size() >= this.upperBound) {
				canAdd = false;
			}
		}

		updateControl(add, canAdd);
	}

	private void updateControl(Control control, boolean enabled) {
		if(control != null) {
			control.setEnabled(enabled);
		}
	}

	public void setSelector(IElementSelector selector) {
		this.selector = selector;
	}

	/**
	 * Set the maximum number of values selected.
	 *
	 * @param upperBound
	 */
	public void setUpperBound(int upperBound) {
		this.upperBound = upperBound;
	}

	/**
	 * Sets the optional context of the element that is being edited, in which others will be added and removed.
	 *
	 * @param contextElement
	 *        the model element that is being edited
	 */
	public void setContextElement(Object contextElement) {
		this.contextElement = contextElement;
	}

	/**
	 * Queries the optional context of the element that is being edited, in which others will be added and removed.
	 *
	 * @return the model element that is being edited
	 */
	public Object getContextElement() {
		return contextElement;
	}

	/**
	 * Listen on events from the main parent.
	 * @param control
	 */
	protected void hookControl() {
		// Listen to close event
		if ((contentArea.getStyle() & SWT.VIRTUAL) != 0) {
			contentArea.addDisposeListener(new DisposeListener() {
				@Override
				public void widgetDisposed(DisposeEvent e) {
					dispose();
				}
			});
		}
	}


	/**
	 * Main {@link Composite} is disposed. 
	 * Cleanup this widget.
	 * 
	 * @return
	 */
	public void dispose() {
		selector.removeElementSelectionListener(this);
	}

	/**
	 * {@inheritDoc}
	 *
	 * Handles double click event on the right-panel tree viewer {@link #selectedElementsViewer}
	 *
	 */
	@Override
	public void doubleClick(DoubleClickEvent event) {
		removeAction();
	}

	/**
	 * {@inheritDoc}
	 *
	 * Handles selection change event on the right-panel tree viewer {@link #selectedElementsViewer}
	 */
	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		updateControls();
	}

	/**
	 * Returns the list of initial element selections.
	 * 
	 * @return List
	 */
	protected List getInitialElementSelections() {
		return initialSelections;
	}

	/**
	 * Sets the initial selection in this selection dialog to the given
	 * elements.
	 * 
	 * @param selectedElements
	 *            the array of elements to select
	 */
	public void setInitialSelections(Object[] selectedElements) {
		initialSelections = new ArrayList(selectedElements.length);
		for (int i = 0; i < selectedElements.length; i++) {
			initialSelections.add(selectedElements[i]);
		}
		
		initAllElements();
		refreshSourceAndTargetTrees();
	}

	/**
	 * Sets the initial selection in this selection dialog to the given
	 * elements.
	 * 
	 * @param selectedElements
	 *            the List of elements to select
	 */
	public void setInitialElementSelections(List selectedElements) {
		initialSelections = selectedElements;
		
		initAllElements();
		refreshSourceAndTargetTrees();
	}

	/**
	 * Synchronize the source and target trees with the selection.
	 */
	private void refreshSourceAndTargetTrees() {
		
		selectedElementsViewer.refresh();
		// Remove selected element from the source tree
		selector.setSelectedElements(allElements.toArray());
	}

	/**
	 * Returns the list of selections made by the user, or <code>null</code>
	 * if the selection was canceled.
	 * 
	 * @return the array of selected elements, or <code>null</code> if Cancel
	 *         was pressed
	 */
	public Object[] getResult() {
		prepareResult();
		return result;
	}
	
	/**
	 * Set the selections made by the user, or <code>null</code> if the
	 * selection was canceled.
	 * 
	 * @param newResult
	 *            list of selected elements, or <code>null</code> if Cancel
	 *            was pressed
	 */
	protected void setResult(List newResult) {
		if (newResult == null) {
			result = null;
		} else {
			result = new Object[newResult.size()];
			newResult.toArray(result);
		}
	}

	/**
	 * Set the selections made by the user, or <code>null</code> if the
	 * selection was canceled.
	 * <p>
	 * The selections may accessed using <code>getResult</code>.
	 * </p>
	 * 
	 * @param newResult -
	 *            the new values
	 * @since 2.0
	 */
	protected void setSelectionResult(Object[] newResult) {
		result = newResult;
	}




}
