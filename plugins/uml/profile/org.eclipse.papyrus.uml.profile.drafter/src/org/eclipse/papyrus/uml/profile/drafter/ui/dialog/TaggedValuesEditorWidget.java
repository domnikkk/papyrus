package org.eclipse.papyrus.uml.profile.drafter.ui.dialog;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

public class TaggedValuesEditorWidget {

	private Composite contentArea;
	private Stereotype stereotype;
	private NamedElement selectedElement;
	
	private TreeViewer treeViewer;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param stereotype The stereotype defining the taggedValues
	 * @param selectedElement The uml {@link NamedElement} for which taggedValue are edited
	 * 
	 * @wbp.parser.entryPoint
	 */
	public TaggedValuesEditorWidget(Composite parent, Stereotype stereotype, NamedElement selectedElement) {

		this.stereotype = stereotype;
		this.selectedElement = selectedElement;
		createContent(parent);
	}


	
	/**
	 * @return the stereotype
	 */
	public Stereotype getStereotype() {
		return stereotype;
	}


	
	/**
	 * @param stereotype the stereotype to set
	 */
	public void setStereotype(Stereotype stereotype) {
//		System.err.println(this.getClass().getSimpleName() 
//				+ ".setStereotype(" + (stereotype!=null?stereotype.getName():"null") + ")");
		this.stereotype = stereotype;
		treeViewer.setInput(stereotype);
	}


	/**
	 * Create the overall component.
	 * @param parent
	 */
	protected void createContent(Composite parent) {
		// TODO Auto-generated method stub



		contentArea = createContentArea(parent);
		
		treeViewer.setContentProvider(new MyContentProvider());
		// We provide the Stereotype's attributes
		treeViewer.setInput(stereotype);

		
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
		
		treeViewer = new TreeViewer(composite, SWT.BORDER);
		Tree tree = treeViewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		TreeViewerColumn treeViewerColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnName = treeViewerColumn.getColumn();
		trclmnName.setWidth(100);
		trclmnName.setText("name");
		treeViewerColumn.setLabelProvider( new TaggedValueNameColumnLabelProvider() );

		
		TreeViewerColumn treeViewerColumn_1 = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnType = treeViewerColumn_1.getColumn();
		trclmnType.setWidth(100);
		trclmnType.setText("type");
		treeViewerColumn_1.setLabelProvider( new TaggedValueNameColumnLabelProvider() );
		
		TreeViewerColumn treeViewerColumn_2 = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnValue = treeViewerColumn_2.getColumn();
		trclmnValue.setWidth(100);
		trclmnValue.setText("value");
		treeViewerColumn_2.setLabelProvider( new TaggedValueValueColumnLabelProvider() );

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

}
