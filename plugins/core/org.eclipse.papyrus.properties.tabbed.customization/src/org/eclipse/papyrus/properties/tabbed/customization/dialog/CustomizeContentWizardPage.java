/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) remi.schnekenburger@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.properties.tabbed.customization.dialog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.model.ModelElementItem;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.papyrus.core.utils.EditorUtils;
import org.eclipse.papyrus.properties.runtime.controller.descriptor.ControllerDescriptorState;
import org.eclipse.papyrus.properties.runtime.dialogs.PropertyDialog;
import org.eclipse.papyrus.properties.runtime.state.IFragmentDescriptorState;
import org.eclipse.papyrus.properties.runtime.state.IState;
import org.eclipse.papyrus.properties.runtime.view.DialogDescriptor;
import org.eclipse.papyrus.properties.runtime.view.FragmentDescriptorState;
import org.eclipse.papyrus.properties.runtime.view.PredefinedFragmentDescriptorState;
import org.eclipse.papyrus.properties.runtime.view.PropertyViewService;
import org.eclipse.papyrus.properties.runtime.view.XMLParseException;
import org.eclipse.papyrus.properties.runtime.view.constraints.ConstraintDescriptorState;
import org.eclipse.papyrus.properties.runtime.view.constraints.ObjectTypeConstraintDescriptor;
import org.eclipse.papyrus.properties.runtime.view.content.ContainerDescriptorState;
import org.eclipse.papyrus.properties.tabbed.core.view.DynamicTabDescriptor;
import org.eclipse.papyrus.properties.tabbed.core.view.PropertyServiceUtil;
import org.eclipse.papyrus.properties.tabbed.core.view.SectionDescriptorState;
import org.eclipse.papyrus.properties.tabbed.core.view.SectionDescriptorState.ReplacedSectionState;
import org.eclipse.papyrus.properties.tabbed.core.view.SectionSetDescriptorState;
import org.eclipse.papyrus.properties.tabbed.customization.Activator;
import org.eclipse.papyrus.properties.tabbed.customization.dialog.actions.ContainerMenuCreator;
import org.eclipse.papyrus.properties.tabbed.customization.dialog.actions.ContentHolderMenuCreator;
import org.eclipse.papyrus.properties.tabbed.customization.dialog.actions.ControllerMenuCreator;
import org.eclipse.papyrus.properties.tabbed.customization.dialog.actions.EClassifierMenuCreator;
import org.eclipse.papyrus.properties.tabbed.customization.dialog.actions.FragmentMenuCreator;
import org.eclipse.papyrus.properties.tabbed.customization.dialog.actions.PredefinedFragmentMenuCreator;
import org.eclipse.papyrus.properties.tabbed.customization.dialog.actions.ReplacedSectionMenuCreator;
import org.eclipse.papyrus.properties.tabbed.customization.dialog.actions.SectionMenuCreator;
import org.eclipse.papyrus.properties.tabbed.customization.dialog.actions.SectionSetMenuCreator;
import org.eclipse.papyrus.properties.tabbed.customization.state.StatePropertyTabViewProviderParser;
import org.eclipse.papyrus.umlutils.PackageUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.MenuDetectEvent;
import org.eclipse.swt.events.MenuDetectListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.views.properties.tabbed.ITabDescriptor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * Wizard page where user can customize the content of the property view
 */
@SuppressWarnings("restriction")
public class CustomizeContentWizardPage extends WizardPage {

	/** initial content */
	protected Document document;

	/** UML metamodel label for the metamodel selection combo */
	protected static final String UML_METAMODEL = "UML";

	/** available section states for this wizard page */
	protected List<SectionSetDescriptorState> sectionSetDescriptorStates;

	/** tree viewer on the metamodel and the set of available section sets descriptors */
	protected TreeViewer metamodelViewer;

	/** current selection of section set */
	protected SectionSetDescriptorState currentSectionSetDescriptorState;

	/** current selection of metaclass */
	protected EClassifier currentMetaClass;

	/** tree viewer for the configuration area */
	protected TreeViewer configurationViewer;

	/** viewer for tabs */
	protected TableViewer tabViewer;

	/** current tab selection */
	protected DynamicTabDescriptor selectedTab;

	/** preview area */
	protected Composite previewArea;

	/** widget factory for preview area */
	protected TabbedPropertySheetWidgetFactory factory = new TabbedPropertySheetWidgetFactory();

	/** current selection size for the preview */
	private int currentSelectionsize = 1;

	/** area displaying the current selection size */
	protected Combo sizeArea;

	/** values in the selection size combo */
	private final static List<String> sizeValues = Arrays.asList("1", "-1");

	/**
	 * Creates a new CustomizeContentWizardPage.
	 */
	public CustomizeContentWizardPage() {
		super("Customize Property View", "Customize property view Wizard", null);
	}

	/**
	 * {@inheritDoc}
	 */
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
		layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
		layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
		layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		SashForm sashForm = new SashForm(composite, SWT.HORIZONTAL);
		sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		createContentExplorer(sashForm);
		createConfigurationArea(sashForm);

		sashForm.setWeights(new int[]{ 40, 60 });

		setControl(composite);
	}

	/**
	 * Sets the initial content for this page
	 * 
	 * @param initialContent
	 *        the initial content for this page, i.e. the document
	 */
	public void setInitialContent(Document document) {
		this.document = document;

		// parses the content of the document to create the SectionSetDescriptors states
		List<ITabDescriptor> tabDescriptors = new ArrayList<ITabDescriptor>();
		for(List<ITabDescriptor> descriptors : PropertyServiceUtil.getTabDescriptors()) {
			tabDescriptors.addAll(descriptors);
		}
		StatePropertyTabViewProviderParser parser = new StatePropertyTabViewProviderParser(tabDescriptors);
		try {
			parser.parseXMLfile(document, PropertyViewService.getInstance().getAllFragmentDescriptors(), new HashMap<String, DialogDescriptor>());
			sectionSetDescriptorStates = parser.getSectionSetDescriptorStates();
			metamodelViewer.setContentProvider(new MetamodelContentProvider(sectionSetDescriptorStates));
			metamodelViewer.setLabelProvider(new MetamodelLabelProvider());

			// load by default the metamodel
			metamodelViewer.setInput(UMLPackage.eINSTANCE.eContents());

			tabViewer.setInput(PropertyServiceUtil.getTabDescriptors());
		} catch (XMLParseException e) {
			Activator.log.error(e);
		}
	}

	/**
	 * Returns the final content for this page
	 * 
	 * @return the final content for this page
	 */
	public Document getFinalContent() {

		return createFinalDocument();
	}

	/**
	 * Creates the final document, serializing the existing section set descriptor states
	 * 
	 * @return the final document created
	 */
	protected Document createFinalDocument() {
		// remove existing elements on the current document
		Node topNode = retrieveTopNode(document);

		if(topNode == null) {
			return document;
		}

		removeAllExistingSectionSetDescriptors(topNode);

		// add all new section set descriptors using states 
		for(SectionSetDescriptorState state : sectionSetDescriptorStates) {
			topNode.appendChild(state.generateNode(document));
		}

		return document;
	}

	/**
	 * Retrieves the top node for this document
	 * 
	 * @param document
	 *        the document to look in
	 */
	protected Node retrieveTopNode(Document document) {
		NodeList childNodes = document.getChildNodes();
		for(int i = 0; i < childNodes.getLength(); i++) {
			Node childNode = childNodes.item(i);
			// be sure child node is the propertyTabView node
			if("propertyTabView".equals(childNode.getNodeName())) {
				return childNode;
			}
		}
		Activator.log.error("no propertyTabView node was found for this document", null);
		return null;
	}

	/**
	 * Removes all section set descriptors child of the specified node
	 * 
	 * @param topNode
	 *        the node that contains the element to remove
	 */
	protected void removeAllExistingSectionSetDescriptors(Node topNode) {
		NodeList children = topNode.getChildNodes();
		for(int i = 0; i < children.getLength(); i++) {
			Node child = children.item(i);
			if("sectionSet".equals(child.getNodeName())) {
				topNode.removeChild(child);
				child = null;
			}
		}
	}

	/**
	 * Creates the configuration area, where the configuration for one model element is displayed.
	 * This is the part on the right.
	 * 
	 * @param composite
	 *        the parent composite for the controls created in this area
	 */
	protected void createConfigurationArea(Composite composite) {
		SashForm configurationAreaSashForm = new SashForm(composite, SWT.VERTICAL);
		configurationAreaSashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		createConfigurationEditor(configurationAreaSashForm);
		createPreviewArea(configurationAreaSashForm);

		configurationAreaSashForm.setWeights(new int[]{ 50, 50 });
	}

	/**
	 * Creates the configuration editor, where the configuration for one model element can be edited
	 * 
	 * @param composite
	 *        the parent composite for the controls created in this area
	 */
	protected void createConfigurationEditor(Composite composite) {
		Composite configurationAreaComposite = new Composite(composite, SWT.NONE);
		configurationAreaComposite.setLayout(new GridLayout(1, false));

		// title of this area
		Label titleLabel = new Label(configurationAreaComposite, SWT.NONE);
		titleLabel.setText("Configuration:");

		// content tree and viewer on this tree
		Tree configurationTree = new Tree(configurationAreaComposite, SWT.BORDER);
		configurationTree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		configurationViewer = new TreeViewer(configurationTree);
		configurationViewer.setContentProvider(new ConfigurationContentProvider());
		configurationViewer.setLabelProvider(new ConfigurationLabelProvider());
		configurationViewer.addDoubleClickListener(new IDoubleClickListener() {

			/**
			 * {@inheritDoc}
			 */
			public void doubleClick(DoubleClickEvent event) {
				// edit element on which double click occurs => open edit dialog
				ITreeSelection selection = (ITreeSelection)event.getSelection();
				Object selectedElement = selection.getFirstElement();

				// if element is a state, opens the dialog on this state
				if(selectedElement instanceof IState) {
					openEditionDialog(((IState)selectedElement));
				}
			}
		});
		configurationViewer.getTree().addMenuDetectListener(new MenuDetectListener() {

			/**
			 * {@inheritDoc}
			 */
			public void menuDetected(MenuDetectEvent e) {
				// retrieve current selection, this should be a state or a contentHolder/constraintholder
				ITreeSelection selection = (ITreeSelection)configurationViewer.getSelection();
				if(selection == null || selection.size() < 1) {
					Activator.log.warn("Impossible to find the selection to create the menu");
					return;
				}

				Object selectedObject = selection.getFirstElement();
				Menu menu = null;
				// awful code, should delegate to each state which menu should be created
				if(selectedObject instanceof SectionDescriptorState) {
					menu = new SectionMenuCreator(((SectionDescriptorState)selectedObject)).getMenu(configurationViewer.getTree());
				} else if(selectedObject instanceof FragmentDescriptorState) {
					menu = new FragmentMenuCreator(((FragmentDescriptorState)selectedObject)).getMenu(configurationViewer.getTree());
				} else if(selectedObject instanceof PredefinedFragmentDescriptorState) {
					menu = new PredefinedFragmentMenuCreator(((PredefinedFragmentDescriptorState)selectedObject)).getMenu(configurationViewer.getTree());
				} else if(selectedObject instanceof ContainerDescriptorState) {
					menu = new ContainerMenuCreator(((ContainerDescriptorState)selectedObject)).getMenu(configurationViewer.getTree());
				} else if(selectedObject instanceof ControllerDescriptorState) {
					menu = new ControllerMenuCreator(((ControllerDescriptorState)selectedObject)).getMenu(configurationViewer.getTree());
				} else if(selectedObject instanceof ContentHolder) {
					menu = new ContentHolderMenuCreator(((ContentHolder)selectedObject)).getMenu(configurationViewer.getTree());
				} else if(selectedObject instanceof ReplacedSectionState) {
					menu = new ReplacedSectionMenuCreator(((ReplacedSectionState)selectedObject)).getMenu(configurationViewer.getTree());
				}

				if(menu != null) {
					// creates the menu, depending on the selection
					menu.setVisible(true);
				}
			}
		});
	}

	/**
	 * Opens an edition dialog on the given state
	 * 
	 * @param iState
	 *        the state to edit
	 */
	protected void openEditionDialog(IState iState) {
		// find editor descriptor...
		DialogDescriptor descriptor = PropertyViewService.getInstance().getDialogDescriptor(iState.getEditionDialogId());
		List<Object> objectsToEdit = new ArrayList<Object>();
		objectsToEdit.add(iState);

		if(descriptor != null) {
			Shell parentShell = getShell();
			PropertyDialog dialog = new PropertyDialog(parentShell, descriptor, objectsToEdit, new TabbedPropertySheetWidgetFactory());
			dialog.open();
		} else {
			Activator.log.warn("impossible to find an editor for element: " + iState);
		}
	}

	/**
	 * Creates the area where the preview of the property view is displayed.
	 * This is the part in the lower right.
	 * 
	 * @param composite
	 *        the parent composite for the controls created in this area
	 */
	protected void createPreviewArea(Composite composite) {
		Composite previewAreaComposite = new Composite(composite, SWT.NONE);
		previewAreaComposite.setLayout(new GridLayout(2, false));
		// previewAreaComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

		Composite titleArea = new Composite(previewAreaComposite, SWT.NONE);
		GridLayout layout = new GridLayout(3, false);
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		titleArea.setLayout(layout);
		titleArea.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));

		// title of this area
		Label titleLabel = new Label(titleArea, SWT.NONE);
		titleLabel.setText("Preview:");
		titleLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		Composite selectionSize = new Composite(titleArea, SWT.NONE);
		layout = new GridLayout(2, false);
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		selectionSize.setLayout(layout);
		GridData data = new GridData(SWT.FILL, SWT.CENTER, false, false);
		selectionSize.setLayoutData(data);

		Label sizeLabel = new Label(selectionSize, SWT.NONE);
		sizeLabel.setText("Size:");

		sizeArea = new Combo(selectionSize, SWT.BORDER | SWT.READ_ONLY);
		sizeArea.setItems(sizeValues.toArray(new String[0]));
		sizeArea.addSelectionListener(new SelectionListener() {

			/**
			 * {@inheritDoc}
			 */
			public void widgetSelected(SelectionEvent e) {
				int index = sizeArea.getSelectionIndex();
				if(index >= 0) {
					setCurrentSelectionsize(Integer.parseInt(sizeValues.get(index)));
				} else {
					Activator.log.error("Wrong index for selection size", null);
				}
			}

			/**
			 * {@inheritDoc}
			 */
			public void widgetDefaultSelected(SelectionEvent e) {
				// nothing to do here
			}
		});
		updateSizeArea();

		Button button = new Button(titleArea, SWT.NONE);
		button.setImage(Activator.getImage("/icons/Refresh.gif"));
		button.setToolTipText("Refresh the content of the preview area");
		button.addSelectionListener(new SelectionListener() {

			/**
			 * {@inheritDoc}
			 */
			public void widgetSelected(SelectionEvent e) {
				updatePreview();
			}

			/**
			 * {@inheritDoc}
			 */
			public void widgetDefaultSelected(SelectionEvent e) {
				// nothing to do here
			}
		});

		Table table = new Table(previewAreaComposite, SWT.BORDER);
		GridData data2 = new GridData(SWT.FILL, SWT.FILL, false, true);
		data2.widthHint = 60;
		data2.minimumWidth = 60;
		table.setLayoutData(data2);
		tabViewer = new TableViewer(table);
		tabViewer.setLabelProvider(new LabelProvider() {

			/**
			 * {@inheritDoc}
			 */
			@Override
			public String getText(Object element) {
				if(element instanceof DynamicTabDescriptor) {
					return ((DynamicTabDescriptor)element).getLabel();
				}
				return super.getText(element);
			}
		});
		tabViewer.setContentProvider(new IStructuredContentProvider() {

			/**
			 * {@inheritDoc}
			 */
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

			}

			/**
			 * {@inheritDoc}
			 */
			public void dispose() {

			}

			/**
			 * {@inheritDoc}
			 */
			public Object[] getElements(Object inputElement) {
				List<Object> results = new ArrayList<Object>();
				if(inputElement instanceof List<?>) {
					List<?> elements = (List<?>)inputElement;
					for(Object o : elements) {
						if(o instanceof List<?>) {
							results.addAll((List<?>)o);
						}
					}
					return results.toArray();
				}
				return new Object[0];
			}
		});

		tabViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				selectedTab = (DynamicTabDescriptor)((IStructuredSelection)event.getSelection()).getFirstElement();
				updatePreview();
			}
		});

		// real preview area
		previewArea = factory.createComposite(previewAreaComposite, SWT.BORDER);
		previewArea.setLayout(new GridLayout(1, true));
		previewArea.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	}

	/**
	 * updates the content of the size area
	 */
	private void updateSizeArea() {
		if(sizeArea != null && !sizeArea.isDisposed()) {
			sizeArea.select(sizeValues.indexOf("" + currentSelectionsize));
		}
		updatePreview();

	}

	protected boolean isSectionSetDescriptorStateValid(SectionSetDescriptorState state) {
		// check size
		if(state.getSelectionSize() > getCurrentSelectionsize()) {
			return false;
		}
		List<ConstraintDescriptorState> constraintDescriptorStates = state.getConstraintDescriptorStates();
		for(ConstraintDescriptorState constraintDescriptorState : constraintDescriptorStates) {
			if(constraintDescriptorState instanceof ObjectTypeConstraintDescriptor.ObjectTypeConstraintDescriptorState) {
				Class<?> elementClass = ((ObjectTypeConstraintDescriptor.ObjectTypeConstraintDescriptorState)constraintDescriptorState).getElementClassState();
				if(elementClass.isAssignableFrom(getCurrentMetaClass().getInstanceClass())) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * update the preview area
	 */
	protected void updatePreview() {
		if(selectedTab != null && getCurrentMetaClass() != null && previewArea != null && !previewArea.isDisposed()) {
			List<SectionDescriptorState> displayedSections = new ArrayList<SectionDescriptorState>();
			String selectedTabName = selectedTab.getId();
			Composite parent = previewArea.getParent();
			previewArea.dispose();
			previewArea = factory.createComposite(parent, SWT.BORDER);
			previewArea.setLayout(new GridLayout(1, true));
			previewArea.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			for(SectionSetDescriptorState sectionSetDescriptorState : sectionSetDescriptorStates) {
				if(isSectionSetDescriptorStateValid(sectionSetDescriptorState)) {
					// check the content of this section set: sections give the constraints 
					for(SectionDescriptorState state : sectionSetDescriptorState.getSectionDescriptorStates()) {
						if(selectedTabName.equals(state.getTargetTab())) {
							displayedSections.add(state);
						}
					}
				}
			}

			List<SectionDescriptorState> filteredSectionstates = new ArrayList<SectionDescriptorState>();
			for(SectionDescriptorState sectionDescriptorState : displayedSections) {
				boolean isRemoved = false;
				String currentId = sectionDescriptorState.getId();
				// is this descriptor removed by another one ?
				for(SectionDescriptorState state : displayedSections) {
					for(ReplacedSectionState replacedSectionState : state.getReplacedSectionStates()) {
						if(replacedSectionState.getId().equals(currentId)) {
							isRemoved = true;
						}
					}
				}

				if(!isRemoved) {
					filteredSectionstates.add(sectionDescriptorState);
				}
			}

			for(SectionDescriptorState state : filteredSectionstates) {
				for(IFragmentDescriptorState fragmentDescriptorState : state.getFragmentDescriptorStates()) {
					for(ContainerDescriptorState containerDescriptorState : fragmentDescriptorState.getContainerDescriptorStates()) {
						containerDescriptorState.createPreview(previewArea);
					}
				}
			}
			// previewArea.redraw();
			previewArea.getParent().layout(true);
		}
	}

	/**
	 * Creates the area where the metamodel elements, the available views and controllers are displayed.
	 * This is the part on the upper left.
	 * 
	 * @param composite
	 *        the parent composite for the controls created in this area
	 */
	protected void createContentExplorer(Composite composite) {
		Composite mainContentAreaComposite = new Composite(composite, SWT.NONE);
		mainContentAreaComposite.setLayout(new GridLayout(1, false));

		// title of this area
		Label contentLabel = new Label(mainContentAreaComposite, SWT.NONE);
		contentLabel.setText("Content:");

		CCombo metamodelSelectionCombo = new CCombo(mainContentAreaComposite, SWT.BORDER | SWT.READ_ONLY);
		metamodelSelectionCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		metamodelSelectionCombo.setItems(retrieveAvailableMetamodels());
		metamodelSelectionCombo.addSelectionListener(new SelectionListener() {

			/**
			 * {@inheritDoc}
			 */
			public void widgetSelected(SelectionEvent e) {
				// update the input of the content view

			}

			/**
			 * {@inheritDoc}
			 */
			public void widgetDefaultSelected(SelectionEvent e) {
				// nothing here
			}
		});

		// content tree and viewer on this tree
		Tree contentTree = new Tree(mainContentAreaComposite, SWT.BORDER);
		contentTree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		contentTree.addMenuDetectListener(new MenuDetectListener() {

			/**
			 * {@inheritDoc}
			 */
			public void menuDetected(MenuDetectEvent e) {
				// retrieve current selection, this should be an EObject or a SectionSetDescriptorState
				ITreeSelection selection = (ITreeSelection)metamodelViewer.getSelection();
				if(selection == null || selection.size() < 1) {
					Activator.log.warn("Impossible to find the selection to create the menu");
					return;
				}

				Object selectedObject = selection.getFirstElement();
				Menu menu = null;
				// awful code, should delegate to each state which menu should be created
				if(selectedObject instanceof SectionSetDescriptorState) {
					menu = new SectionSetMenuCreator((SectionSetDescriptorState)selectedObject, sectionSetDescriptorStates, metamodelViewer).getMenu(metamodelViewer.getTree());
				} else if(selectedObject instanceof ModelElementItem) {
					menu = new EClassifierMenuCreator((ModelElementItem)selectedObject, sectionSetDescriptorStates, metamodelViewer).getMenu(metamodelViewer.getTree());
				}

				if(menu != null) {
					// creates the menu, depending on the selection
					menu.setVisible(true);
				}
			}
		});
		metamodelViewer = new TreeViewer(contentTree);
		metamodelViewer.addPostSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				//update the current section set selection
				TreeSelection selection = ((TreeSelection)event.getSelection());
				Object selectedElement = selection.getFirstElement();
				// this can be a metaclass or a section set descriptor.
				if(selectedElement instanceof ModelElementItem) {
					setCurrentSectionSetDescriptorState(null);
					setCurrentMetaClass((EClassifier)((ModelElementItem)selectedElement).getEObject());
				} else if(selectedElement instanceof SectionSetDescriptorState) {
					// retrieve the metaclass using the TreePath of the selection
					TreePath[] paths = selection.getPathsFor(selectedElement);
					// metaclass should be the first element in the table
					if(paths.length > 0) {
						TreePath treePath = paths[0];
						Object firstSegment = treePath.getSegment(0);
						if(firstSegment instanceof ModelElementItem) {
							setCurrentMetaClass((EClassifier)((ModelElementItem)firstSegment).getEObject());
						}
					}
					currentSectionSetDescriptorState = (SectionSetDescriptorState)selectedElement;
				}
				updateConfigurationArea();
			}
		});
		metamodelViewer.addDoubleClickListener(new IDoubleClickListener() {

			/**
			 * {@inheritDoc}
			 */
			public void doubleClick(DoubleClickEvent event) {
				// edit element on which double click occurs => open edit dialog
				ITreeSelection selection = (ITreeSelection)event.getSelection();
				Object selectedElement = selection.getFirstElement();

				// if element is a state, opens the dialog on this state
				if(selectedElement instanceof IState) {
					openEditionDialog(((IState)selectedElement));
				}
			}
		});

	}

	/**
	 * Updates the configuration area
	 */
	protected void updateConfigurationArea() {
		configurationViewer.setInput(currentSectionSetDescriptorState);
		configurationViewer.expandAll();
	}

	/**
	 * Returns the list of metamodels for which a configuration of property view could be done.
	 * 
	 * @return the list of metamodels, never <code>null</code>.
	 */
	protected String[] retrieveAvailableMetamodels() {
		List<String> availableMetamodels = new ArrayList<String>();
		// retrieve current editor, and current resources
		DiagramEditor editor = EditorUtils.lookupActiveDiagramEditor();
		if(editor == null) {
			Activator.log.warn("Impossible to find the active diagram editor");
			return new String[0];
		}
		EObject eObject = editor.getDiagram().getElement();
		if(eObject == null) {
			Activator.log.warn("Impossible to find the active diagram object");
			return new String[0];
		}

		if(eObject instanceof Element) {
			// retrieve the top package, and the applied profiles
			availableMetamodels.add(UML_METAMODEL);

			org.eclipse.uml2.uml.Package rootPackage = PackageUtil.getRootPackage(((Element)eObject));
			List<Profile> profilesApplied = rootPackage.getAllAppliedProfiles();
			for(Profile profile : profilesApplied) {
				availableMetamodels.add(getProfileDisplayName(profile));
			}
		}
		return availableMetamodels.toArray(new String[]{});
	}

	/**
	 * Returns a human readable name for the given profile. This name will also be used to identify which currently selection has been done
	 * 
	 * @param profile
	 *        the profile to display
	 * @return the name of the profile
	 */
	protected String getProfileDisplayName(Profile profile) {
		return profile.getQualifiedName();
	}


	/**
	 * Returns the currentSectionSetDescriptorState
	 * 
	 * @return the currentSectionSetDescriptorState
	 */
	public SectionSetDescriptorState getCurrentSectionSetDescriptorState() {
		return currentSectionSetDescriptorState;
	}


	/**
	 * Sets the currentSectionSetDescriptorState
	 * 
	 * @param currentSectionSetDescriptorState
	 *        the currentSectionSetDescriptorState to set
	 */
	public void setCurrentSectionSetDescriptorState(SectionSetDescriptorState currentSectionSetDescriptorState) {
		this.currentSectionSetDescriptorState = currentSectionSetDescriptorState;
	}


	/**
	 * Returns the current selected MetaClass
	 * 
	 * @return the current selected MetaClass
	 */
	public EClassifier getCurrentMetaClass() {
		return currentMetaClass;
	}


	/**
	 * Sets the current selected MetaClass
	 * 
	 * @param currentMetaClass
	 *        the current MetaClass to set
	 */
	public void setCurrentMetaClass(EClassifier currentMetaClass) {
		this.currentMetaClass = currentMetaClass;
		updatePreview();
	}

	/**
	 * Sets the currentSelectionsize and updates the size area
	 * 
	 * @param currentSelectionsize
	 *        the currentSelectionsize to set
	 */
	protected void setCurrentSelectionsize(int currentSelectionsize) {
		this.currentSelectionsize = currentSelectionsize;
		if(sizeArea != null && !sizeArea.isDisposed()) {
			sizeArea.select(sizeValues.indexOf(currentSelectionsize));
		}
		updateSizeArea();
	}

	/**
	 * Returns the currentSelectionsize
	 * 
	 * @return the currentSelectionsize
	 */
	public int getCurrentSelectionsize() {
		return currentSelectionsize;
	}
}
