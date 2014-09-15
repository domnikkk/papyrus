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
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.databinding.viewers.ObservableValueEditingSupport;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.papyrus.uml.profile.drafter.ui.model.PropertyModel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

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
	private TableViewerColumn treeViewerColumn;
	private TableViewerColumn treeViewerColumn_1;
	private TableViewerColumn tableViewerColumn;
	private TableViewerColumn treeViewerColumn_2;
	
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
		
		treeViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION );
		Table tree = treeViewer.getTable();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		treeViewerColumn = new TableViewerColumn(treeViewer, SWT.NONE);
		TableColumn trclmnName = treeViewerColumn.getColumn();
		trclmnName.setWidth(100);
		trclmnName.setText("name");
//		treeViewerColumn.setLabelProvider( new TaggedValueNameColumnLabelProvider() );

		
		treeViewerColumn_1 = new TableViewerColumn(treeViewer, SWT.NONE);
		TableColumn trclmnType = treeViewerColumn_1.getColumn();
		trclmnType.setWidth(100);
		trclmnType.setText("type");
		
		tableViewerColumn = new TableViewerColumn(treeViewer, SWT.NONE);
		TableColumn tblclmnStatus = tableViewerColumn.getColumn();
		tblclmnStatus.setWidth(100);
		tblclmnStatus.setText("status");
//		treeViewerColumn_1.setLabelProvider( new TaggedValueNameColumnLabelProvider() );
		
		treeViewerColumn_2 = new TableViewerColumn(treeViewer, SWT.NONE);
		TableColumn trclmnValue = treeViewerColumn_2.getColumn();
		trclmnValue.setWidth(100);
		trclmnValue.setText("value");
//		treeViewerColumn_2.setLabelProvider( new TaggedValueValueColumnLabelProvider() );

		tree.setHeaderVisible(true);
		m_bindingContext = initDataBindings();
		
		return composite;

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
		IObservableMap[] observeMaps = BeansObservables.observeMaps(listContentProvider.getKnownElements(), PropertyModel.class, new String[]{"proposedName", "type", "modelStatus", "value"});
		treeViewer.setLabelProvider(new ObservableMapLabelProvider(observeMaps));
		treeViewer.setContentProvider(listContentProvider);
		//
		treeViewer.setInput(properties);
		//
		CellEditor cellEditor_0 = new TextCellEditor(treeViewer.getTable());
		IValueProperty cellEditorProperty_0 = WidgetProperties.text(SWT.Modify);
		IBeanValueProperty valueProperty_0 = BeanProperties.value("proposedName");
		treeViewerColumn.setEditingSupport(create(treeViewer, bindingContext, cellEditor_0, cellEditorProperty_0, valueProperty_0));
		//
		CellEditor cellEditor_1 = new TextCellEditor(treeViewer.getTable());
		IValueProperty cellEditorProperty =  WidgetProperties.text(SWT.Modify);
		IBeanValueProperty valueProperty_1 = BeanProperties.value("type");
		treeViewerColumn_1.setEditingSupport(create(treeViewer, bindingContext, cellEditor_1, cellEditorProperty, valueProperty_1));
		//
		CellEditor cellEditor_2 = new TextCellEditor(treeViewer.getTable());
		IValueProperty cellEditorProperty_1 =  WidgetProperties.text(SWT.Modify);
		IBeanValueProperty valueProperty_2 = BeanProperties.value("modelStatus");
		tableViewerColumn.setEditingSupport(create(treeViewer, bindingContext, cellEditor_2, cellEditorProperty_1, valueProperty_2));
		//
		CellEditor cellEditor_3 = new TextCellEditor(treeViewer.getTable());
		IValueProperty cellEditorProperty_2 =  WidgetProperties.text(SWT.Modify);
		IBeanValueProperty valueProperty_3 = BeanProperties.value("value");
		treeViewerColumn_2.setEditingSupport(create(treeViewer, bindingContext, cellEditor_3, cellEditorProperty_2, valueProperty_3));
		//
		return bindingContext;
	}
}
