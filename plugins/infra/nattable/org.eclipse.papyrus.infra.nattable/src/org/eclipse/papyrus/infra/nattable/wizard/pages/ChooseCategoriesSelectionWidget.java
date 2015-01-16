/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.nattable.wizard.pages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.infra.nattable.messages.Messages;
import org.eclipse.papyrus.infra.nattable.model.factory.IAxisFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IdTreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TreeFillingConfiguration;
import org.eclipse.papyrus.infra.nattable.wizard.CategoriesWizardUtils;
import org.eclipse.papyrus.infra.widgets.creation.ReferenceValueFactory;
import org.eclipse.papyrus.infra.widgets.editors.IElementSelector;
import org.eclipse.papyrus.infra.widgets.editors.InputDialog;
import org.eclipse.papyrus.infra.widgets.widgets.MultipleValueEditAndSelectionWidget;
import org.eclipse.swt.widgets.Control;

/**
 * @author VL222926
 *
 *         This widget allows to choose the categories to listen in the table
 *         In the left part, we display multivalued features
 *         In the right part, we display a tree :
 *         <ul>
 *         <li>first level : the root of the table</li>
 *         <li>the depth</li>
 *         <li>the feature to listen</li>
 *         <li></li>
 *         </ul>
 *
 *         The create action allows to create new depth
 */
public class ChooseCategoriesSelectionWidget extends MultipleValueEditAndSelectionWidget {

	/**
	 * Constructor.
	 *
	 * @param selector
	 */
	public ChooseCategoriesSelectionWidget(IElementSelector selector) {
		super(selector);
	}

	/**
	 * Constructor.
	 *
	 * @param selector
	 * @param unique
	 */
	public ChooseCategoriesSelectionWidget(IElementSelector selector, boolean unique) {
		super(selector, unique);
	}

	/**
	 * Constructor.
	 *
	 * @param selector
	 * @param unique
	 * @param ordered
	 */
	public ChooseCategoriesSelectionWidget(IElementSelector selector, boolean unique, boolean ordered) {
		super(selector, unique, ordered);
	}

	/**
	 * Constructor.
	 *
	 * @param selector
	 * @param unique
	 * @param ordered
	 * @param upperBound
	 */
	public ChooseCategoriesSelectionWidget(IElementSelector selector, boolean unique, boolean ordered, int upperBound) {
		super(selector, unique, ordered, upperBound);
	}

	/**
	 * @see org.eclipse.papyrus.infra.widgets.widgets.MultipleValueSelectionWidget#init()
	 *
	 */
	@Override
	protected void init() {
		setFactory(new CategoriesValueFactory());
		setAllowEdition(true);
	}

	/**
	 * @see org.eclipse.papyrus.infra.widgets.widgets.MultipleValueSelectionWidget#getSelection()
	 *
	 * @return
	 */
	@Override
	public List<Object> getSelection() {
		return new ArrayList<Object>(this.initialSelection);
	}

	/**
	 *
	 * @return
	 *         the context object to use
	 */
	protected Object getContextForCreateAction() {
		if (this.selectedElementsViewer != null) {
			ISelection selection = this.selectedElementsViewer.getSelection();
			if (selection instanceof IStructuredSelection) {
				Object first = ((IStructuredSelection) selection).getFirstElement();
				if (first instanceof ITreeItemAxis) {
					ITreeItemAxis context = (ITreeItemAxis) first;
					while (context.getParent() != null) {
						context = context.getParent();
					}
					return context;
				}
			}
		}
		return null;
	}

	/**
	 * @see org.eclipse.papyrus.infra.widgets.widgets.MultipleValueSelectionWidget#createAction()
	 *
	 */
	@Override
	protected void createAction() {
		Object context = getContextForCreateAction();
		if (factory == null || context == null) {
			return;
		}
		try {
			factory.createObject(this.create, context);
		} catch (OperationCanceledException e) {
			// The user cancelled and we rolled back pending model changes
		}
		if (!this.selectedElementsViewer.getExpandedState(context)) {
			this.selectedElementsViewer.setExpandedElements(new Object[] { context });
		}
		this.selectedElementsViewer.refresh();
	}

	/**
	 * @see org.eclipse.papyrus.infra.widgets.widgets.MultipleValueEditAndSelectionWidget#edit()
	 *
	 */
	@Override
	protected void edit() {
		List<ITreeItemAxis> selectedAxis = getSelectedAxisInSelectedElementsViewer();
		if (selectedAxis.size() == 1 && CategoriesWizardUtils.isCategoryItem(selectedAxis.get(0))) {
			this.factory.edit(this.edit, selectedAxis.get(0));
		}
	}

	/**
	 * @see org.eclipse.papyrus.infra.widgets.widgets.MultipleValueEditAndSelectionWidget#canEdit()
	 *
	 * @return
	 */
	@Override
	protected boolean canEdit() {
		List<ITreeItemAxis> selectedAxis = getSelectedAxisInSelectedElementsViewer();
		if (selectedAxis.size() == 1) {
			return CategoriesWizardUtils.isCategoryItem(selectedAxis.get(0));
		}
		return false;

	}

	/**
	 * @see org.eclipse.papyrus.infra.widgets.widgets.MultipleValueSelectionWidget#createListSectionContentProvider()
	 *
	 * @return
	 */
	@Override
	protected IContentProvider createListSectionContentProvider() {
		return new ITreeItemContentProvider() {
			/**
			 * @see org.eclipse.papyrus.infra.nattable.wizard.pages.ITreeItemContentProvider#getChildren(java.lang.Object)
			 *
			 * @param arg0
			 * @return
			 */
			@Override
			public Object[] getChildren(Object arg0) {
				return super.getChildren(arg0);
			}

			/**
			 * @see org.eclipse.papyrus.infra.nattable.wizard.pages.ITreeItemContentProvider#hasChildren(java.lang.Object)
			 *
			 * @param arg0
			 * @return
			 */
			@Override
			public boolean hasChildren(Object arg0) {
				if (arg0 instanceof ITreeItemAxis && CategoriesWizardUtils.isCategoryItem((ITreeItemAxis) arg0)) {
					return false;
				}
				return super.hasChildren(arg0);
			}
		};
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.wizard.pages.MultipleValueSelectionWizard#upAction()
	 *
	 */
	@Override
	protected void upAction() {
		moveAction(true);
	}


	/**
	 *
	 * @return
	 *         the selected axis in the selectedElementsViewer
	 */
	protected List<ITreeItemAxis> getSelectedAxisInSelectedElementsViewer() {
		if (selectedElementsViewer != null && selectedElementsViewer.getSelection() instanceof IStructuredSelection) {
			List<ITreeItemAxis> selection = new ArrayList<ITreeItemAxis>();
			for (Object curr : ((IStructuredSelection) selectedElementsViewer.getSelection()).toList()) {
				if (curr instanceof ITreeItemAxis) {
					selection.add((ITreeItemAxis) curr);
				}
			}
			return selection;
		}
		return Collections.emptyList();
	}


	/**
	 *
	 * @return
	 *         the list with the current selection in the viewer.
	 *         <ul>
	 *         <li>if roots are in the selection, we returns only axis representing roots</li>
	 *         <li>we returns only axis representing FillingCategories</li>
	 *
	 *         </ul>
	 *
	 */
	protected List<ITreeItemAxis> getConsistentSelectionInSelectedElementsViewer() {
		if (selectedElementsViewer == null) {
			return Collections.emptyList();
		}
		ISelection tmp = selectedElementsViewer.getSelection();
		if (tmp instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) tmp;
			List<ITreeItemAxis> fillingAxis = new ArrayList<ITreeItemAxis>();
			List<ITreeItemAxis> rootAxis = new ArrayList<ITreeItemAxis>();
			for (Object current : selection.toList()) {
				if (current instanceof ITreeItemAxis) {
					ITreeItemAxis axis = (ITreeItemAxis) current;
					if (axis.getParent() == null) {
						rootAxis.add(axis);
					} else if (rootAxis.isEmpty() && axis.getElement() instanceof String) {
						fillingAxis.add(axis);
					}
				}
			}
			if (rootAxis.isEmpty()) {
				return fillingAxis;
			}
			return rootAxis;

		}
		return Collections.emptyList();
	}

	/**
	 *
	 * @param wantedClass
	 *            the class represented the wanted type of the encapsulated element
	 * @return
	 *         the list of wanted {@link ITreeItemAxis} which encapsulate elements instance of the wanted class
	 */
	protected List<ITreeItemAxis> getSelectedFillingConfigurantionInSelectedElementsViewer() {
		List<ITreeItemAxis> axis = getConsistentSelectionInSelectedElementsViewer();
		if (!axis.isEmpty() && axis.get(0).getElement() instanceof TreeFillingConfiguration) {
			return axis;
		}
		return Collections.emptyList();
	}




	/**
	 * @see org.eclipse.papyrus.infra.nattable.wizard.pages.MultipleValueSelectionWizard#deleteAction()
	 *
	 */
	@Override
	protected void deleteAction() {
		List<ITreeItemAxis> axis = getSelectionInSelectedElementsViewer();
		label: for (ITreeItemAxis current : axis) {
			if (CategoriesWizardUtils.isDepthItem(current)) {
				int depth = Integer.valueOf((String) current.getElement());
				if (depth == 0) {
					continue label;
				}
			}
			if (current.getParent() != null) {
				current.setParent(null);
				EcoreUtil.delete(current);
			}
		}
		selectedElementsViewer.refresh();
	}


	/**
	 * @see org.eclipse.papyrus.infra.widgets.widgets.MultipleValueSelectionWidget#canRemove()
	 *
	 * @return
	 */
	@Override
	protected boolean canRemove() {
		List<ITreeItemAxis> axis = getSelectionInSelectedElementsViewer();
		for (ITreeItemAxis current : axis) {
			if (!CategoriesWizardUtils.isCategoryItem(current)) {
				return false;
			}
		}
		return super.canRemove();
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.wizard.pages.MultipleValueSelectionWizard#canDelete()
	 *
	 * @return
	 */
	@Override
	protected boolean canDelete() {
		for (ITreeItemAxis curr : getSelectionInSelectedElementsViewer()) {
			if (!(CategoriesWizardUtils.isDepthItem(curr) || CategoriesWizardUtils.isCategoryItem(curr))) {
				return false;
			}
			// we can't delete the 0 depth
			if (CategoriesWizardUtils.isDepthItem(curr)) {
				int depth = Integer.valueOf((String) curr.getElement());
				if (depth == 0) {
					return false;
				}
			}
		}
		return true;
	}


	/**
	 * @see org.eclipse.papyrus.infra.nattable.wizard.pages.MultipleValueSelectionWizard#canAdd()
	 *
	 * @return
	 */
	@Override
	protected boolean canAdd() {
		return isCategorySelection() || isRootSelection();
	}

	protected boolean isRootSelection() {
		List<ITreeItemAxis> axis = getSelectedAxisInSelectedElementsViewer();
		for (ITreeItemAxis curr : axis) {
			if (!CategoriesWizardUtils.isRootItem(curr)) {
				return false;
			}
		}
		return true;
	}

	protected boolean isCategorySelection() {
		List<ITreeItemAxis> axis = getSelectedAxisInSelectedElementsViewer();
		for (ITreeItemAxis curr : axis) {
			if (!CategoriesWizardUtils.isDepthItem(curr)) {
				return false;
			}
		}
		return true;
	}


	/**
	 *
	 * @return
	 *         <ul>
	 *         <li>a list with the selected categories only when all selected elements are categories AND they have the same parent (a {@link IdTreeItemAxis} (which represents the depth))</li>
	 *         <li>an empty list in all others case</li>
	 *         </ul>
	 *
	 */
	protected List<ITreeItemAxis> getSelectedCategoriesInSelectedElementsViewer() {
		List<ITreeItemAxis> selection = getSelectedAxisInSelectedElementsViewer();
		ITreeItemAxis parent = null;
		List<ITreeItemAxis> returnedSelection = new ArrayList<ITreeItemAxis>();
		for (ITreeItemAxis curr : selection) {
			ITreeItemAxis tmp = curr.getParent();
			if (tmp == null) {
				return Collections.emptyList();
			}
			if (parent == null && tmp instanceof IdTreeItemAxis) {
				parent = tmp;
				returnedSelection.add(curr);
			} else if (parent != null && parent == tmp) {
				returnedSelection.add(curr);
			} else {
				return Collections.emptyList();
			}
		}
		return returnedSelection;
	}

	/**
	 *
	 * @author VL222926
	 *
	 *         This comparator allows to sort comparator
	 *
	 */
	public static final class CategoriesComparator implements Comparator<ITreeItemAxis> {

		private List<ITreeItemAxis> children;

		/**
		 * Constructor.
		 *
		 */
		public CategoriesComparator(List<ITreeItemAxis> children) {
			this.children = Collections.unmodifiableList(children);
		}

		/**
		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
		 *
		 * @param o1
		 * @param o2
		 * @return
		 */
		@Override
		public int compare(ITreeItemAxis o1, ITreeItemAxis o2) {
			int index1 = children.indexOf(o1);
			int index2 = children.indexOf(o2);
			if (index1 < index2) {
				return -1;
			}
			return 1;
		}
	}


	/**
	 * @see org.eclipse.papyrus.infra.nattable.wizard.pages.MultipleValueSelectionWizard#downAction()
	 *
	 */
	@Override
	protected void downAction() {
		moveAction(false);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.widgets.widgets.MultipleValueSelectionWidget#canMove(boolean)
	 *
	 * @param up
	 * @return
	 */
	protected boolean canMove(boolean up) {
		List<ITreeItemAxis> categories = getSelectedCategoriesInSelectedElementsViewer();
		if (categories.isEmpty()) {
			return false;
		}
		ITreeItemAxis parent = categories.get(0).getParent();
		List<ITreeItemAxis> children = parent.getChildren();
		int forbiddenIndex = up ? 0 : children.size() - 1;

		for (ITreeItemAxis child : categories) {
			if (children.indexOf(child) == forbiddenIndex) {
				return false;
			}
		}
		return true;
	}

	/**
	 *
	 * @param up
	 *            <code>true</code> if the elements must be move to up
	 */
	protected void moveAction(boolean up) {
		List<ITreeItemAxis> categories = getSelectedCategoriesInSelectedElementsViewer();

		ITreeItemAxis parent = categories.get(0).getParent();
		final List<ITreeItemAxis> children = Collections.unmodifiableList(parent.getChildren());
		if (categories.isEmpty()) {
			return;
		}

		Collections.sort(categories, new CategoriesComparator(children));
		if (!up) {
			Collections.reverse(categories);
		}
		for (ITreeItemAxis child : categories) {
			int index = parent.getChildren().indexOf(child);
			index = up ? index - 1 : index + 1;
			parent.getChildren().move(index, child);
		}
		selectedElementsViewer.refresh();
	}


	/**
	 * @see org.eclipse.papyrus.infra.nattable.wizard.pages.MultipleValueSelectionWizard#addElements(java.lang.Object[])
	 *
	 * @param elements
	 */
	@Override
	public void addElements(Object[] elements) {
		List<ITreeItemAxis> selectedElements = getSelectedAxisInSelectedElementsViewer();
		if (selectedElements.isEmpty()) {
			return;
		}

		// 1. verify if the root is selected
		ITreeItemAxis root = null;
		for (ITreeItemAxis current : selectedElements) {
			if (CategoriesWizardUtils.isRootItem(current)) {
				root = current;
				break;
			}
		}
		// 2. find the categories to edit
		List<ITreeItemAxis> depthToEdit = new ArrayList<ITreeItemAxis>();
		if (root != null) {
			depthToEdit.addAll(root.getChildren());
		} else {
			for (ITreeItemAxis current : selectedElements) {
				if (CategoriesWizardUtils.isDepthItem(current)) {
					depthToEdit.add(current);
				}
			}
		}

		// 3. edit the categories
		for (ITreeItemAxis curr : depthToEdit) {
			List<Object> alreadyManagedObject = new ArrayList<Object>();
			for (ITreeItemAxis category : curr.getChildren()) {
				alreadyManagedObject.add(category.getElement());
			}

			for (Object el : elements) {
				if (!alreadyManagedObject.contains(el)) {
					IAxisFactory.createITreeItemAxis(curr, el, null, null);
				}

			}
		}
		selectedElementsViewer.refresh();
	}

	/**
	 * @see org.eclipse.papyrus.infra.widgets.widgets.MultipleValueSelectionWidget#removeAllAction()
	 *
	 */
	@Override
	protected void removeAllAction() {
		Object input = this.selectedElementsViewer.getInput();
		if (input instanceof List<?>) {
			for (Object curr : (List<?>) input) {
				if (curr instanceof ITreeItemAxis) {
					destroyCategoriesAxis((ITreeItemAxis) curr);
				}
			}
			this.selectedElementsViewer.refresh();
		}
	}

	/**
	 * Destroy recursively all categories axis
	 *
	 * @param axis
	 *            an axis
	 */
	protected void destroyCategoriesAxis(ITreeItemAxis axis) {
		for (ITreeItemAxis child : axis.getChildren()) {
			destroyCategoriesAxis(child);
		}
		if (CategoriesWizardUtils.isCategoryItem(axis)) {
			axis.setParent(null);
			EcoreUtil.delete(axis);
		}
	}

	/**
	 * @see org.eclipse.papyrus.infra.nattable.wizard.pages.MultipleValueSelectionWizard#removeAction()
	 *
	 */
	@Override
	protected void removeAction() {
		IStructuredSelection selection = (IStructuredSelection) this.selectedElementsViewer.getSelection();
		for (Object current : selection.toList()) {
			if (current instanceof ITreeItemAxis && ((ITreeItemAxis) current).getParent() != null) {
				ITreeItemAxis axis = (ITreeItemAxis) current;
				axis.setParent(null);
				EcoreUtil.delete(axis);
			}
		}
		this.selectedElementsViewer.refresh();
	}

	/**
	 *
	 * @return
	 *         the list of the selected element in the selection viewer
	 */
	protected List<ITreeItemAxis> getSelectionInSelectedElementsViewer() {
		if (this.selectedElementsViewer != null) {
			ISelection selection = this.selectedElementsViewer.getSelection();
			if (selection instanceof IStructuredSelection) {
				List<ITreeItemAxis> returnedValues = new ArrayList<ITreeItemAxis>();
				for (Object current : ((IStructuredSelection) selection).toList()) {
					if (current instanceof ITreeItemAxis) {
						returnedValues.add((ITreeItemAxis) current);
					}
				}
				return returnedValues;
			}
		}
		return Collections.emptyList();
	}

	/**
	 *
	 * @author VL222926
	 *         This class is the factory used to create new ITreeItemAxis in the viewer of selected element
	 *         It creates only {@link ITreeItemAxis} to represents depth to configure and its allows to edit only alias of categories
	 */
	public class CategoriesValueFactory implements ReferenceValueFactory {
		/**
		 *
		 * @see org.eclipse.papyrus.infra.widgets.creation.ReferenceValueFactory#validateObjects(java.util.Collection)
		 *
		 * @param objectsToValidate
		 * @return
		 */
		@Override
		public Collection<Object> validateObjects(Collection<Object> objectsToValidate) {
			return null;
		}

		/**
		 *
		 * @see org.eclipse.papyrus.infra.widgets.creation.ReferenceValueFactory#edit(org.eclipse.swt.widgets.Control, java.lang.Object)
		 *
		 * @param widget
		 * @param object
		 * @return
		 */
		@Override
		public Object edit(Control widget, Object object) {
			String existingAlias = ((IAxis) object).getAlias();
			InputDialog dialog = new InputDialog(widget.getShell(), Messages.ChooseCategoriesSelectionWidget_EditAlias, Messages.ChooseCategoriesSelectionWidget_EnterAliasToUseForTheCategory, existingAlias, null);

			int result = dialog.open();
			if (result == Window.OK) {
				String newValue = dialog.getText();
				((IAxis) object).setAlias(newValue);
			}

			return object;
		}

		@Override
		public Object createObject(Control widget, Object context) {
			Assert.isTrue(context instanceof ITreeItemAxis);
			ITreeItemAxis rootItem = (ITreeItemAxis) context;
			Assert.isTrue(rootItem.getParent() == null);

			// find the maxDepth
			int maxDepth = -1;
			for (ITreeItemAxis axis : rootItem.getChildren()) {
				Assert.isTrue(axis instanceof IdTreeItemAxis);
				maxDepth = Math.max(maxDepth, Integer.parseInt((String) axis.getElement()));
			}
			int nextDepth = maxDepth + 1;
			return IAxisFactory.createITreeItemAxis(rootItem, Integer.valueOf(nextDepth), null, null);
		}

		/**
		 *
		 * @return
		 */
		@Override
		public boolean canEdit() {
			List<ITreeItemAxis> selectedAxis = getSelectedAxisInSelectedElementsViewer();
			if (selectedAxis.size() == 1) {
				return CategoriesWizardUtils.isCategoryItem(selectedAxis.get(0));
			}
			return false;
		}

		/**
		 *
		 * @return
		 */
		@Override
		public boolean canCreateObject() {
			return getContextForCreateAction() != null;
		}
	}
}
