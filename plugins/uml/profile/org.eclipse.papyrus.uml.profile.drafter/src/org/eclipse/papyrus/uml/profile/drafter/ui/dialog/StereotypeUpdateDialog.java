package org.eclipse.papyrus.uml.profile.drafter.ui.dialog;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.infra.widgets.selectors.ReferenceSelector;
import org.eclipse.papyrus.uml.profile.drafter.Activator;
import org.eclipse.papyrus.uml.profile.drafter.ProfileCatalog;
import org.eclipse.papyrus.uml.profile.drafter.ui.contentassist.PossibleStereotypeContentProposalProvider;
import org.eclipse.papyrus.uml.profile.drafter.ui.contentassist.StereotypeContentProposalProvider;
import org.eclipse.papyrus.uml.profile.drafter.ui.model.MetaclassesModel;
import org.eclipse.papyrus.uml.profile.drafter.ui.model.StereoptypeModel;
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

/**
 * 
 * @author cedric dumoulin
 *
 */
public class StereotypeUpdateDialog extends Dialog {
	private Binding stereotypeNameBinding;
	private Binding profileNameBinding;
	private Binding stereotypeBinding;
	private DataBindingContext m_bindingContext;
	private org.eclipse.core.databinding.Binding profileBinding;
	private Text quickSetText;
	private Text stereotypeText;
	private Text profileText;
	private String title;
	private StereotypeUpdateArgs value;
	private MultipleValueSelectorWidget extendedMetaclassSelector;
	private PropertiesEditorWidget propertiesEditorWidget;
	
	/**
	 * An UML Element used to get the associated Resource.
	 */
	private Element anyUmlElement;
	private List<Class> selectedMetaclasses;
	
//	private StereotypeNameToProfileSynchronizer stereotypeNameToProfileSynchronizer;
	private StereoptypeModel stereotypeModel;

	private ProfileCatalog profileCatalog;
	private Label quickSetLabel;
	private Label profileNameLabel;
	
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
		this.profileCatalog = new ProfileCatalog(selectedElement);
		stereotypeModel = new StereoptypeModel(profileCatalog, selectedElement);
//		stereotypeNameToProfileSynchronizer = new StereotypeNameToProfileSynchronizer(profileCatalog);
		
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
		
		quickSetLabel = new Label(namesContainer, SWT.NONE);
		quickSetLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		quickSetLabel.setText("Qualified Name");
		
		quickSetText = new Text(namesContainer, SWT.BORDER);
		quickSetText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		installContentAssistantProvider(quickSetText, new PossibleStereotypeContentProposalProvider(anyUmlElement));
		
		profileNameLabel = new Label(namesContainer, SWT.NONE);
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
		installContentAssistantProvider(stereotypeText, new StereotypeContentProposalProvider(anyUmlElement.getApplicableStereotypes()));
		
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
		propertiesEditorWidget = new PropertiesEditorWidget(taggedValuesContainer, stereotypeModel.getProperties(), (NamedElement)anyUmlElement);

		return container;
	}

	/**
	 * Install content assistant provider.
	 * 
	 * @param control The control to which content assist is installed.
	 *
	 * @param contentProposalProvider The associated {@link ContentProposalAdapter}.
	 */
	protected void installContentAssistantProvider(Text control, IContentProposalProvider contentProposalProvider) {
//		KeyStroke keyStroke = KeyStroke.getInstance("Ctrl+Space");
		KeyStroke keyStroke = null;
		char[] autoActivationCharacters = null;
		int autoActivationDelay = 500;

		ContentProposalAdapter adapter = new ContentProposalAdapter(control, new TextContentAdapter(), contentProposalProvider, keyStroke, autoActivationCharacters);
		adapter.setAutoActivationDelay(autoActivationDelay);

		// filter proposals as keys are pressed and proposals popup is present
		adapter.setFilterStyle(ContentProposalAdapter.FILTER_NONE);

		// replace all text
		adapter.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_REPLACE);

		//this listener is activated when a stereotype item in popup menu is selected and
		//the popup menu is closed. It is used to add the selected stereotype in to the right hand side part
		//of the dialog, so that uers can economize one key hit.
		//cf. proposalAccepted() operation in KeyTextListener
//		adapter.addContentProposalListener(keyTextListener);

	}

	/**
	 * 
	 * @param parent
	 */
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
		m_bindingContext = initDataBindings();
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
		
		// Old fashion
		value = new StereotypeUpdateArgs();
		value.setProfileName(profileText.getText());
		value.setStereotypeName(stereotypeText.getText());
		
		// Copy the result (to bypass cast pb)
		List<Class> result = new ArrayList<Class>();
		for(Object obj : extendedMetaclassSelector.getResult()) {
			result.add((Class)obj);	
		}
		value.setExtendedMetaclasses(result);
		
		// New fashion
		// Stereotype and profile names are already set in model.
		// Need to collect metaclasses
		MetaclassesModel metaclassesModel = stereotypeModel.getMetaclassesCollection();
		for(Object obj : extendedMetaclassSelector.getResult()) {
			metaclassesModel.getSelectedMetaclasses().add((Class)obj);	
		}
	}

	/**
	 * return the update args collected by the dialog.
	 * @return
	 */
	public IStereotypeUpdateArgs getUpdateArgs() {
		return value;
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextQuickSetTextObserveWidget = WidgetProperties.text(SWT.Modify).observe(quickSetText);
		IObservableValue qualifiedNameStereotypeModelObserveValue = BeanProperties.value("qualifiedName").observe(stereotypeModel);
		bindingContext.bindValue(observeTextQuickSetTextObserveWidget, qualifiedNameStereotypeModelObserveValue, null, null);
		//
		IObservableValue observeTextProfileTextObserveWidget = WidgetProperties.text(SWT.Modify).observe(profileText);
		IObservableValue profileNameStereotypeModelObserveValue = BeanProperties.value("profileName").observe(stereotypeModel);
		bindingContext.bindValue(observeTextProfileTextObserveWidget, profileNameStereotypeModelObserveValue, null, null);
		//
		IObservableValue observeTextStereotypeTextObserveWidget = WidgetProperties.text(SWT.Modify).observe(stereotypeText);
		IObservableValue stereotypeNameStereotypeModelObserveValue = BeanProperties.value("stereotypeName").observe(stereotypeModel);
		bindingContext.bindValue(observeTextStereotypeTextObserveWidget, stereotypeNameStereotypeModelObserveValue, null, null);
		//
		return bindingContext;
	}

	
	/**
	 * @return the stereotypeModel
	 */
	public StereoptypeModel getStereotypeModel() {
		return stereotypeModel;
	}
}
