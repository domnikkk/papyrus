package org.eclipse.papyrus.uml.profile.drafter.ui.dialog;

import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.beans.IBeanValueProperty;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.databinding.viewers.ObservableValueEditingSupport;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.papyrus.uml.profile.drafter.ui.model.AccessibleTypeCatalog;
import org.eclipse.papyrus.uml.profile.drafter.ui.model.ITypeCatalog;
import org.eclipse.papyrus.uml.profile.drafter.ui.model.MemberKind;
import org.eclipse.papyrus.uml.profile.drafter.ui.model.PropertyModel;
import org.eclipse.papyrus.uml.profile.drafter.ui.model.StateKind;
import org.eclipse.papyrus.uml.profile.drafter.ui.providers.TypeLabelProvider;
import org.eclipse.papyrus.uml.profile.drafter.utils.UMLPrimitiveTypesModel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;

/**
 * A widget used to edit a list of {@link PropertyModel}.
 * @author dumoulin
 *
 */
public class PropertiesEditorWidget {
	private DataBindingContext m_bindingContext;

	private Composite contentArea;
//	private List<PropertyModel> properties;
	private WritableList properties;
	private NamedElement selectedElement;
	
	private TableViewer treeViewer;
	private TableViewerColumn nameViewerColumn;
	private TableViewerColumn typeViewerColumn;
	private TableViewerColumn statusViewerColumn;
	private TableViewerColumn valueViewerColumn;

	private TableViewerColumn memberViewerColumn;

	private TableViewerColumn deletedViewerColumn;

	/**
	 * Label provider associated to this class. Lazy creation.
	 */
	private ILabelProvider typeLabelProvider;

	/**
	 * The catalog of type associated to this class. Lazy creation.
	 */
	private ITypeCatalog typeCatalog;
	
	/**
	 * Library of UML Primitive types. Lazy loading.
	 */
	private UMLPrimitiveTypesModel umlPrimitiveTypesLibrary;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param stereotype The stereotype defining the taggedValues
	 * @param selectedElement The uml {@link NamedElement} for which taggedValue are edited
	 * 
	 * @wbp.parser.entryPoint
	 */
	public PropertiesEditorWidget(Composite parent, List<PropertyModel> properties, NamedElement selectedElement) {

//		this.properties = Properties.selfList(PropertyModel.class).observe(properties);
		if( properties instanceof WritableList) {
			this.properties = (WritableList)properties;
		}
		else {
			this.properties = new WritableList(properties, PropertyModel.class);
		}
		this.selectedElement = selectedElement;
		createContent(parent);
	}

	
	/**
	 * @param stereotype the stereotype to set
	 */
	public void setProperties( List<PropertyModel> properties) {
//		this.properties = Properties.selfList(PropertyModel.class).observe(properties);
		if( properties instanceof WritableList) {
			this.properties = (WritableList)properties;
		}
		else {
			this.properties = new WritableList(properties, PropertyModel.class);
		}
//		treeViewer.setInput(properties);
	}


	/**
	 * Create the overall component.
	 * @param parent
	 */
	protected void createContent(Composite parent) {

		contentArea = createContentArea(parent);
		
		// now lets bind the values
	    // No extra label provider / content provider / setInput required
//		WritableList input;
//		if( properties instanceof WritableList ) {
//			input = (WritableList)properties;
//		}
//		else {
//			input = new WritableList(properties, PropertyModel.class);
//		}
//	    ViewerSupport.bind(treeViewer,
//	        input,
//	        BeanProperties.values(new String[] { "proposedName", "type", "modelStatus", "value" }));

		
//		fillContentArea();
//		createDialogContents();

	}
	
	/**
	 * Create the content area.
	 * 
	 * @param parent
	 * @return
	 */
	protected Composite createContentArea(Composite parent) {
		// create a composite with standard margins and spacing
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.makeColumnsEqualWidth = true;
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite tableTitle = new Composite(composite, SWT.NONE);
		tableTitle.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		tableTitle.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Label label = new Label(tableTitle, SWT.NONE);
		label.setText("Properties");
		
		Button addPropertyButton = new Button(tableTitle, SWT.NONE);
		addPropertyButton.setText("+");
		addPropertyButton.addSelectionListener(new SelectionAdapter() {

		      @Override
		      public void widgetSelected(SelectionEvent e) {
		        addPropertyPressed(e);
		      }

		    });
		
		
		Button removePropertyButton = new Button(tableTitle, SWT.NONE);
		removePropertyButton.setText("-");
		removePropertyButton.addSelectionListener(new SelectionAdapter() {

		      @Override
		      public void widgetSelected(SelectionEvent e) {
		        removePropertyPressed(e);
		      }

		    });
		
		treeViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION );
		Table tree = treeViewer.getTable();
		GridData gd_tree = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_tree.minimumHeight = 100;
		tree.setLayoutData(gd_tree);
		
		nameViewerColumn = new TableViewerColumn(treeViewer, SWT.NONE);
		TableColumn NameTableColumn = nameViewerColumn.getColumn();
		NameTableColumn.setWidth(100);
		NameTableColumn.setText("name");
//		treeViewerColumn.setLabelProvider( new TaggedValueNameColumnLabelProvider() );

		// Type column
		typeViewerColumn = new TableViewerColumn(treeViewer, SWT.NONE);
		TableColumn typeTableColumn = typeViewerColumn.getColumn();
		typeTableColumn.setWidth(100);
		typeTableColumn.setText("type");
		
		statusViewerColumn = new TableViewerColumn(treeViewer, SWT.NONE);
		TableColumn statusTableColumn = statusViewerColumn.getColumn();
		statusTableColumn.setWidth(67);
		statusTableColumn.setText("status");
		
		memberViewerColumn = new TableViewerColumn(treeViewer, SWT.NONE);
		TableColumn memberTableColumn = memberViewerColumn.getColumn();
		memberTableColumn.setWidth(64);
		memberTableColumn.setText("member");
		
		deletedViewerColumn = new TableViewerColumn(treeViewer, SWT.NONE);
		TableColumn deletedTableColumn = deletedViewerColumn.getColumn();
		deletedTableColumn.setWidth(37);
		deletedTableColumn.setText("deleted");
//		treeViewerColumn_1.setLabelProvider( new TaggedValueNameColumnLabelProvider() );
		
		valueViewerColumn = new TableViewerColumn(treeViewer, SWT.NONE);
		TableColumn valueTableColumn = valueViewerColumn.getColumn();
		valueTableColumn.setWidth(100);
		valueTableColumn.setText("value");
//		treeViewerColumn_2.setLabelProvider( new TaggedValueValueColumnLabelProvider() );

		tree.setHeaderVisible(true);
		m_bindingContext = initDataBindings();
//		initManualDataBindings(m_bindingContext);
		
		return composite;

	}	
	
	/**
	 * The add button has been pressed.
	 * @param e
	 */
	private void addPropertyPressed(SelectionEvent e) {
		// Create PropertyModem
		PropertyModel model;
		try {
			model = new PropertyModel(MemberKind.owned, "newProperty", getUMLPrimitiveTypeLibrary().getDefaultType());
		} catch (NullPointerException e1) {
			// Provide a Property with no type.
			model = new PropertyModel(MemberKind.owned, "newProperty");
		}

		properties.add(model);
	}

	/**
	 * The remove button has been pressed.
	 * @param e
	 */
	private void removePropertyPressed(SelectionEvent e) {
		ISelection selection = treeViewer.getSelection();
		if( selection instanceof IStructuredSelection ) {
			IStructuredSelection structSelection = (IStructuredSelection)selection;
			removeProperty((PropertyModel)structSelection.getFirstElement());
		}
	}

	/**
	 * remove the specified property from the property list.
	 * 
	 * @param propertyModel model to remove. Can be null.
	 */
	private void removeProperty(PropertyModel propertyModel) {
		if(propertyModel == null) {
			return;
		}
		
		if(propertyModel.getStateKind() == StateKind.created) {
			// We just created it. So we can safely remove
			properties.remove(propertyModel);
		}
		else if( propertyModel.getMemberKind() == MemberKind.owned) {
			// We just change the status of the model.
			// This is done by sending the delete event
			propertyModel.deleteModelEvent();
		}
		else {
			// We do not allow removal of other MemberKind
		}
		
	}


	private void createDialogContents() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Fill the content area with values found in stereotype.
	 */
	private void fillContentArea() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Get the name of the taggedValue
	 * @author dumoulin
	 *
	 */
	public class TaggedValueNameColumnLabelProvider extends ColumnLabelProvider {
		
		@Override
		public String getText(Object element) {
			
			Property property = (Property)element;
			return property.getName();
		}
	}
	
	/**
	 * Get the value of the taggedValue
	 *
	 */
	public class TaggedValueValueColumnLabelProvider extends ColumnLabelProvider {
		
		@Override
		public String getText(Object element) {
			
			Property property = (Property)element;
			Object value = selectedElement.getValue((Stereotype)property.getOwner(), property.getName());
			
			if(value instanceof NamedElement) {
				return ((NamedElement)value).getName();
			}
			// TODO
			// collections and arrays
			// dynamic objects
			return value.toString();
		}
	}
	
	/**
	 * Content Provider for TaggedValues hierarchy
	 *
	 */
	private class MyContentProvider implements ITreeContentProvider {

		private Object[] EMPTY_ARRAY = new Object[]{};
		
		@Override
		public void dispose() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			// TODO Auto-generated method stub
			
		}

		/**
		 * 
		 * @see org.eclipse.jface.viewers.ITreeContentProvider#getElements(java.lang.Object)
		 *
		 * @param inputElement
		 * @return
		 */
		@Override
		public Object[] getElements(Object inputElement) {


			Stereotype stereotype = (Stereotype)inputElement;
			// Return the stereotype's Properties
			return stereotype.getAllAttributes().toArray();
		}

		/**
		 * 
		 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
		 *
		 * @param parentElement
		 * @return
		 */
		@Override
		public Object[] getChildren(Object parentElement) {
			return EMPTY_ARRAY;
		}

		
		/**
		 * 
		 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
		 *
		 * @param element
		 * @return
		 */
		@Override
		public Object getParent(Object element) {
			Property property = (Property)element;
			return property.getOwner();
		}

		@Override
		public boolean hasChildren(Object element) {
			return false;
		}
		
	}
	
	/**
	 * Returns an ObservableValueEditingSupport instance which binds the given
	 * cell editor property to the given element property.
	 * 
	 * @param viewer
	 *            the column viewer
	 * @param dbc
	 *            the DataBindingContext used for binding between the cell
	 *            editor and the viewer element.
	 * @param cellEditor
	 *            the cell editor
	 * @param cellEditorProperty
	 *            the cell editor property to be bound to the element.
	 * @param elementProperty
	 *            the element property to be bound to the cell editor.
	 * @return an ObservableValueEditingSupport instance using the given
	 *         arguments.
	 * copied from org.eclipse.jface.databinding.viewers.ObservableValueEditingSupport.create(ColumnViewer, DataBindingContext, CellEditor, IValueProperty, IValueProperty)
	 */
	protected static EditingSupport create(ColumnViewer viewer, DataBindingContext dbc, final CellEditor cellEditor,
			final IValueProperty cellEditorProperty,
			final IValueProperty elementProperty) {

		return new ObservableValueEditingSupport(viewer, dbc) {
			protected IObservableValue doCreateCellEditorObservable( CellEditor cellEditor) {
				//WidgetProperties.text(SWT.Modify).observe(cellEditor.getControl());
				if( cellEditor instanceof ComboBoxViewerCellEditor) {
					return cellEditorProperty.observe(((ComboBoxViewerCellEditor)cellEditor).getViewer() );
				}
				
				return cellEditorProperty.observe(cellEditor.getControl());
			}

			protected IObservableValue doCreateElementObservable( Object element, ViewerCell cell) {
				return elementProperty.observe(element);
			}

			protected CellEditor getCellEditor(Object element) {
				return cellEditor;
			}
			
			
		};
	}

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
		IObservableMap[] observeMaps = BeansObservables.observeMaps(listContentProvider.getKnownElements(), PropertyModel.class, new String[]{"proposedName", "type", "stateKind", "memberKind", "lifeStatusKind", "value"});
		treeViewer.setLabelProvider(new ObservableMapLabelProvider(observeMaps) {
			/**
			 * Handle Type
			 * @see org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider#getColumnText(java.lang.Object, int)
			 *
			 * @param element
			 * @param columnIndex
			 * @return
			 */
			@Override
			public String getColumnText(Object element, int columnIndex) {
				
				if (columnIndex < attributeMaps.length) {
					Object result = attributeMaps[columnIndex].get(element);
					if(result instanceof Type) {
						return getTypeLabelProvider().getText(result);
					}
					return result == null ? "" : result.toString(); //$NON-NLS-1$
				}
				return null;
			}
		});
		
		
		
		
		
		
		treeViewer.setContentProvider(listContentProvider);
		//
		treeViewer.setInput(properties);
		
		// Set Cell Editors
		//
		CellEditor cellEditor_0 = new TextCellEditor(treeViewer.getTable());
		IValueProperty cellEditorProperty_0 = WidgetProperties.text(SWT.Modify);
		IBeanValueProperty valueProperty_0 = BeanProperties.value("proposedName");
		nameViewerColumn.setEditingSupport(create(treeViewer, bindingContext, cellEditor_0, cellEditorProperty_0, valueProperty_0));
		//
		// Type column
//		CellEditor cellEditor_1 = new TextCellEditor(treeViewer.getTable());
//		IValueProperty cellEditorProperty =  WidgetProperties.text(SWT.Modify);
//		IBeanValueProperty valueProperty_1 = BeanProperties.value("type");
//		treeViewerColumn_1.setEditingSupport(create(treeViewer, bindingContext, cellEditor_1, cellEditorProperty, valueProperty_1));
		// Use a dedicated ComboBox CellEditor for type
		ComboBoxViewerCellEditor typeCellEditor = new ComboBoxViewerCellEditor(treeViewer.getTable());
		typeCellEditor.setContentProvider(ArrayContentProvider.getInstance());
		typeCellEditor.setLabelProvider(getTypeLabelProvider());
		typeCellEditor.setInput(getTypeCatalog().getTypes());
		// Use a special label provider
		
		IValueProperty typeCellEditorBindAnchor =  ViewerProperties.singleSelection();
		WidgetProperties.text(SWT.Modify);
		IBeanValueProperty typeModelPropertyBindAnchor = BeanProperties.value("type");
		typeViewerColumn.setEditingSupport(create(treeViewer, bindingContext, typeCellEditor, typeCellEditorBindAnchor, typeModelPropertyBindAnchor));

		//
		CellEditor cellEditor_2 = new TextCellEditor(treeViewer.getTable());
		IValueProperty cellEditorProperty_1 =  WidgetProperties.text(SWT.Modify);
		IBeanValueProperty valueProperty_2 = BeanProperties.value("stateKind");
		statusViewerColumn.setEditingSupport(create(treeViewer, bindingContext, cellEditor_2, cellEditorProperty_1, valueProperty_2));
		//
		CellEditor cellEditor_3 = new TextCellEditor(treeViewer.getTable());
		IValueProperty cellEditorProperty_2 =  WidgetProperties.text(SWT.Modify);
		IBeanValueProperty valueProperty_3 = BeanProperties.value("value");
		valueViewerColumn.setEditingSupport(create(treeViewer, bindingContext, cellEditor_3, cellEditorProperty_2, valueProperty_3));
		//
		//
		CellEditor cellEditor_member = new TextCellEditor(treeViewer.getTable());
		IValueProperty cellEditorPropertyMember =  WidgetProperties.text(SWT.Modify);
		IBeanValueProperty valuePropertyMember = BeanProperties.value("memberKind");
		memberViewerColumn.setEditingSupport(create(treeViewer, bindingContext, cellEditor_member, cellEditorPropertyMember, valuePropertyMember));
		//
		CellEditor cellEditor_del = new TextCellEditor(treeViewer.getTable());
		IValueProperty cellEditorPropertyDel =  WidgetProperties.text(SWT.Modify);
		IBeanValueProperty valuePropertyDel = BeanProperties.value("lifeStatusKind");
		memberViewerColumn.setEditingSupport(create(treeViewer, bindingContext, cellEditor_del, cellEditorPropertyDel, valuePropertyDel));

		
		
		
		return bindingContext;
	}
	
	/**
	 * Return the {@link TypeLabelProvider} associated to this class.
	 * 
	 * @return
	 */
	private ILabelProvider getTypeLabelProvider() {
		if( typeLabelProvider == null) {
			typeLabelProvider = new TypeLabelProvider();
		}
		return typeLabelProvider;
	}

	/**
	 * Return the {@link ITypeCatalog} associated to this class.
	 * 
	 * @return
	 */
	private ITypeCatalog getTypeCatalog() {
		if( typeCatalog == null) {
			typeCatalog = new AccessibleTypeCatalog(selectedElement, getUMLPrimitiveTypeLibrary());
		}
		return typeCatalog;
	}

	/**
	 * Get the Library of UML Primitive types. Lookup in the {@link ResourceSet} associated to the selected NamedElement.
	 * 
	 * @return the library found.
	 * 
	 * @throws UnsupportedOperationException If the Library can't be found in the associated {@link ResourceSet}.
	 */
	private UMLPrimitiveTypesModel getUMLPrimitiveTypeLibrary() {
		if( umlPrimitiveTypesLibrary == null) {
			// Create primitiveTypeModel from the ResourceSet associated to the element.
			// It will be used to add such types.
			try {
				umlPrimitiveTypesLibrary = new UMLPrimitiveTypesModel(selectedElement.eResource().getResourceSet());
			} catch (UnsupportedOperationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return umlPrimitiveTypesLibrary;
	}


	/**
	 * Additional databinding done manually.
	 * @param bindingContext
	 * @return
	 */
	protected DataBindingContext initManualDataBindings(DataBindingContext bindingContext) {
		//
		//
		CellEditor cellEditor_0 = new TextCellEditor(treeViewer.getTable());
		IValueProperty cellEditorProperty_0 = WidgetProperties.text(SWT.Modify);
		IBeanValueProperty valueProperty_0 = BeanProperties.value("proposedName");
		nameViewerColumn.setEditingSupport(create(treeViewer, bindingContext, cellEditor_0, cellEditorProperty_0, valueProperty_0));
		//
		CellEditor cellEditor_1 = new TextCellEditor(treeViewer.getTable());
		IValueProperty cellEditorProperty =  WidgetProperties.text(SWT.Modify);
		IBeanValueProperty valueProperty_1 = BeanProperties.value("type");
		typeViewerColumn.setEditingSupport(create(treeViewer, bindingContext, cellEditor_1, cellEditorProperty, valueProperty_1));
		//
		CellEditor cellEditor_2 = new TextCellEditor(treeViewer.getTable());
		IValueProperty cellEditorProperty_1 =  WidgetProperties.text(SWT.Modify);
		IBeanValueProperty valueProperty_2 = BeanProperties.value("modelStatus");
		statusViewerColumn.setEditingSupport(create(treeViewer, bindingContext, cellEditor_2, cellEditorProperty_1, valueProperty_2));
		//
		CellEditor cellEditor_3 = new TextCellEditor(treeViewer.getTable());
		IValueProperty cellEditorProperty_2 =  WidgetProperties.text(SWT.Modify);
		IBeanValueProperty valueProperty_3 = BeanProperties.value("value");
		valueViewerColumn.setEditingSupport(create(treeViewer, bindingContext, cellEditor_3, cellEditorProperty_2, valueProperty_3));
		//
		return bindingContext;
	}
}
