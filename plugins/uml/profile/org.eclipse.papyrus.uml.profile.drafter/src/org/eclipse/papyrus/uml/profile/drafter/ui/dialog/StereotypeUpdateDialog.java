package org.eclipse.papyrus.uml.profile.drafter.ui.dialog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.infra.widgets.selectors.ReferenceSelector;
import org.eclipse.papyrus.uml.profile.drafter.Activator;
import org.eclipse.papyrus.uml.tools.providers.UMLMetaclassContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;

public class StereotypeUpdateDialog extends Dialog {
	private Text quickSetText;
	private Text stereotypeText;
	private Text profileText;
	private String title;
	private StereotypeUpdateArgs value;
	private MultipleValueSelectorWidget extendedMetaclassSelector;
	
	/**
	 * An UML Element used to get the associated Resource.
	 */
	private Element anyUmlElement;
	private List<Class> selectedMetaclasses;

	/**
	 * Create the dialog.
	 * @param parentShell
	 * @param selectedElement Any UML element that can be used to discover the ResourceSet.
	 * @param metaclassesToSelect Metaclasses that should be selected in the dialog.
	 * 
	 */
	public StereotypeUpdateDialog(Shell parentShell, String title, Element selectedElement, List<Class> metaclassesToSelect ) {
		super(parentShell);
		// Allows dialog resize
		setShellStyle(getShellStyle() | SWT.RESIZE);
		this.title = title;
		this.anyUmlElement = selectedElement;
		this.selectedMetaclasses = metaclassesToSelect;
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		
		Composite namesContainer = new Composite(container, SWT.NONE);
		namesContainer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		namesContainer.setLayout(new GridLayout(2, false));
		
		Label quickSetLabel = new Label(namesContainer, SWT.NONE);
		quickSetLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		quickSetLabel.setText("Quick Set");
		
		quickSetText = new Text(namesContainer, SWT.BORDER);
		quickSetText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label profileNameLabel = new Label(namesContainer, SWT.NONE);
		profileNameLabel.setSize(43, 20);
		profileNameLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		profileNameLabel.setText("Profile");
		
		profileText = new Text(namesContainer, SWT.BORDER);
		profileText.setSize(201, 26);
		profileText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label stereotypeNameLabel = new Label(namesContainer, SWT.NONE);
		stereotypeNameLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		stereotypeNameLabel.setText("Stereotype");
		
		stereotypeText = new Text(namesContainer, SWT.BORDER);
		stereotypeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
//		Composite extendedMetaclassesContainer = new Composite(container, SWT.NONE);
//		extendedMetaclassesContainer.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
//		extendedMetaclassesContainer.setLayout(new GridLayout(1, false));
		createExtendedMetaclassArea(container);
		
		Composite extendedStereotypeContainer = new Composite(container, SWT.NONE);
		extendedStereotypeContainer.setLayout(new GridLayout(1, false));
		extendedStereotypeContainer.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Composite taggedValuesContainer = new Composite(container, SWT.NONE);
		taggedValuesContainer.setLayout(new GridLayout(1, false));
		taggedValuesContainer.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		// Use the first applied stereotype for tests
		Stereotype stereotype;
		List<Stereotype> appliedStereotypes = anyUmlElement.getAppliedStereotypes();
		if( !appliedStereotypes.isEmpty()) {
			TaggedValuesEditorWidget taggedValuesEditorWidget = new TaggedValuesEditorWidget(taggedValuesContainer, appliedStereotypes.get(0), (NamedElement)anyUmlElement);
		}
		return container;
	}

	private void createExtendedMetaclassArea(Composite parent) {
		// TODO Auto-generated method stub
		ReferenceSelector selector = new ReferenceSelector(true);
		selector.setContentProvider(new UMLMetaclassContentProvider(anyUmlElement));
		LabelProviderService serv = null;
		try {
			serv = ServiceUtilsForEObject.getInstance().getService(LabelProviderService.class, anyUmlElement);
		} catch (ServiceException e) {
			Activator.log.error("Can't get LabelProviderService.", e);
		}
		ILabelProvider labelProvider = serv.getLabelProvider();
		selector.setLabelProvider(labelProvider);

		//		EList<PackageableElement> importedElement = profile.getImportedElements();
		//we don't set initial selection to allows to draw new instance of imported metaclass
//		final List<EObject> alreadyImportedElement = new ArrayList<EObject>();
//		for(final PackageableElement current : selectedMetaclasses){
//			if(current instanceof Class && ((Class)current).isMetaclass()){
//				alreadyImportedElement.add(current);
//			}
//		}
		// Create the selector widget
		extendedMetaclassSelector = new MultipleValueSelectorWidget(parent, selector);
//		final MultipleValueSelectorDialog dialog = new MultipleValueSelectorDialog(Display.getDefault().getActiveShell(), selector, Messages.CustomSemanticCreateCommand_SelectMetaclass, true, false, -1);
		// Do not need a context element: no operations allowed.
//		extendedMetaclassSelector.setContextElement(profile);
		extendedMetaclassSelector.setLabelProvider(labelProvider);
		extendedMetaclassSelector.setInitialElementSelections(selectedMetaclasses);
		
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}
	
    /**
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
     */
    @Override
	protected void configureShell(Shell shell) {
        super.configureShell(shell);
        if (title != null) {
			shell.setText(title);
		}
    }


	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
//		return super.getInitialSize();
		return new Point(900, 900);
	}

	/**
	 * Collect user data when the ok button is pressed.
	 * 
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 *
	 */
	@Override
	protected void okPressed() {
		collectInput();
		super.okPressed();
	}
	
	/**
	 * Collect data from the dialog.
	 * 
	 */
	private void collectInput() {
		value = new StereotypeUpdateArgs();
		value.setProfileName(profileText.getText());
		value.setStereotypeName(stereotypeText.getText());
		
		// Copy the result (to bypass cast pb)
		List<Class> result = new ArrayList<Class>();
		for(Object obj : extendedMetaclassSelector.getResult()) {
			result.add((Class)obj);	
		}
		value.setExtendedMetaclasses(result);
		
	}

	/**
	 * return the update args collected by the dialog.
	 * @return
	 */
	public IStereotypeUpdateArgs getUpdateArgs() {
		return value;
	}

}
