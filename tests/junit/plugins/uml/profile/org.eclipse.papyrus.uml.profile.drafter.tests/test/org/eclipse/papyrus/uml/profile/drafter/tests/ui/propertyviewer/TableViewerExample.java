package org.eclipse.papyrus.uml.profile.drafter.tests.ui.propertyviewer;

import java.util.List;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

/**
 * Example of a Table with editable cells.
 * To be run as Java code
 *  
 * @author cedric dumoulin
 *
 */
public class TableViewerExample {

    static String[] COLUMN_NAMES = new String[] { "names", "types", "types2", "owner" };
    static int[] COLUMN_WIDTHS = new int[] { 300, 200, 200, 100 };
    static String[] COLUMNS_PROPERTIES = new String[] { "names_prop", "types_prop", "types2_prop", "owner_prop" };
    
     static class ModelContentProvider implements IStructuredContentProvider {

        @SuppressWarnings("unchecked")
        @Override
        public Object[] getElements(Object inputElement) {
            // The inputElement comes from view.setInput()
            if (inputElement instanceof List) {
                List models = (List) inputElement;
                return models.toArray();
            }
            return new Object[0];
        }

        @Override
        public void dispose() {
        }

        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        }

    }

    static class ModelLabelProvider extends LabelProvider implements ITableLabelProvider {

        @Override
        public Image getColumnImage(Object element, int columnIndex) {
            // no image to show
            return null;
        }

        @Override
        public String getColumnText(Object element, int columnIndex) {
            // each element comes from the ContentProvider.getElements(Object)
            if (!(element instanceof PropertyModel)) {
                return "";
            }
            PropertyModel model = (PropertyModel) element;
            switch (columnIndex) {
            case 0:
                return model.getName();
            case 1:
                return model.getType().getName();
            case 2:
                return model.getType().getName();
            case 3:
                return model.getOwnerKind().toString();
            default:
                break;
            }
            return "";
        }
    }
    
    static class ModelCellModifier implements ICellModifier {
        TableViewer viewer;

        public ModelCellModifier(TableViewer viewer) {
            this.viewer = viewer;
        }

        @Override
        public boolean canModify(Object element, String property) {
            // property is defined by viewer.setColumnProperties()
            // allow the FOO column can be modified.
            return ("names_prop".equals(property)
               		|| "types_prop".equals(property)
               		|| "types2_prop".equals(property)
               	            		);
            
        }

        @Override
        public Object getValue(Object element, String property) {
            if ("names_prop".equals(property)) {
                return ((PropertyModel) element).getName();
            }
            if ("types_prop".equals(property)) {
                return ((PropertyModel) element).getType();
            }
            if ("types2_prop".equals(property)) {
                return ((PropertyModel) element).getType();
            }
            return "";
        }

        @Override
        public void modify(Object element, String property, Object value) {
            if ("names_prop".equals(property)) {
                TableItem item = (TableItem) element;
                ((PropertyModel) item.getData()).setName("" + value);
                
                // refresh the viewer to show the changes to our user.
                viewer.refresh();
            }
            else if ("types_prop".equals(property)) {
                TableItem item = (TableItem) element;
                System.out.println("modify.type(" + value + ")");
                if( value instanceof Type) {
                	((PropertyModel) item.getData()).setType((Type)value); 
                }
                // refresh the viewer to show the changes to our user.
                viewer.refresh();
            }
            else if ("types2_prop".equals(property)) {
                TableItem item = (TableItem) element;
                System.out.println("modify.type2(" + value + ")");
                if( value instanceof Type) {
                	((PropertyModel) item.getData()).setType((Type)value); 
                }
                // refresh the viewer to show the changes to our user.
                viewer.refresh();
            }
        }
    }

    public static void main(String[] args) {
    	
    	final TypeLibrary typeLibrary = new TypeLibrary();
    	final PropertyCatalog propertyCatalog = new PropertyCatalog(typeLibrary);
    	final TypeLabelProvider typeLabelProvider = new TypeLabelProvider();
    	

        final ApplicationWindow app = new ApplicationWindow(null) {
            @Override
            protected Control createContents(Composite parent) {
                TableViewer tableViewer = new TableViewer(parent, SWT.SINGLE | SWT.FULL_SELECTION);
                Table table = tableViewer.getTable();
                table.setHeaderVisible(true);
                table.setLinesVisible(true);
                
                for (int i = 0; i < COLUMN_NAMES.length; i++) {
                    TableColumn tableColumn = new TableColumn(table, SWT.LEFT);
                    tableColumn.setText(COLUMN_NAMES[i]);
                    tableColumn.setWidth(COLUMN_WIDTHS[i]);
                }

                tableViewer.setContentProvider(new ModelContentProvider());
                tableViewer.setLabelProvider(new ModelLabelProvider());

                // Create a ComboBoxViewerCellEditor for types
                // 
                ComboBoxViewerCellEditor comboBoxViewerCellEditor = new ComboBoxViewerCellEditor(table);
                comboBoxViewerCellEditor.setContentProvider(ArrayContentProvider.getInstance());
                comboBoxViewerCellEditor.setLabelProvider(typeLabelProvider);
                comboBoxViewerCellEditor.setInput(typeLibrary.getTypes());
                // Create editor support
                tableViewer.setColumnProperties(COLUMNS_PROPERTIES);
                tableViewer.setCellEditors(new CellEditor[] {
                        new TextCellEditor(table), 
                        new TypeSelectorCellEditor(table, typeLibrary, typeLabelProvider),
                        comboBoxViewerCellEditor
                        });
                tableViewer.setCellModifier(new ModelCellModifier(tableViewer));

                tableViewer.setInput(propertyCatalog.getProperties());
                return parent;
            }
        };

        Realm.runWithDefault(SWTObservables.getRealm(Display.getDefault()),
                new Runnable() {
                    @Override
                    public void run() {
                        app.setBlockOnOpen(true);
                        app.open();
                        Display.getDefault().dispose();
                    }
                });

    }
}
