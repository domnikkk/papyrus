/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.revision.tool.dialogs;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.papyrus.revision.tool.core.ReviewResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.FormDialog;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;

/**  This dialog is used to select or create a review model
 * **/
public class CreateOrSelectReviewModelDialog extends FormDialog {


	/**
	 * list of apllied local profile
	 */
	protected ArrayList<Profile> appliedLocalProfiles;

	protected Button creationRadio;
	protected Text newTypeNameText;
	protected Label newProfileLabel;
	protected Button selectionRadio;
	protected Label profileSelectionLabel;
	protected Section lSection;
	protected String resultReviewName;
	protected Button reviewSeletion;
	protected ReviewResourceManager reviewResourceManager;

	/**
	 * 
	 * Constructor.
	 *
	 * @param shell
	 * @param reviewResourceManager the resource manager of reviews
	 */
	public CreateOrSelectReviewModelDialog(Shell shell, ReviewResourceManager reviewResourceManager) {
		super(shell);
		this.reviewResourceManager= reviewResourceManager;
	}



	protected void createFormContent(IManagedForm pForm) {
		pForm.getForm().setText("Review Model Selection");
		ScrolledForm scrolledForm = pForm.getForm();
		FormToolkit toolkit = pForm.getToolkit();
		Composite parent = scrolledForm.getBody();
		parent.setLayout(new GridLayout());

		createFormCreationSection(scrolledForm.getBody(), toolkit);
		createFormSelectionSection(scrolledForm.getBody(), toolkit);

		refreshSectionsEnable(false);
		addListeners();

		scrolledForm.reflow(true);
	}

	/**
	 * make enable sections
	 * @param selectionEnable if the the selection section must be enable
	 */
	protected void refreshSectionsEnable(boolean selectionEnable) {
		creationRadio.setSelection(false);
		selectionRadio.setSelection(false);
		//creationSection
		creationRadio.setSelection(!selectionEnable);
		newTypeNameText.setEnabled(!selectionEnable);
		newProfileLabel.setEnabled(!selectionEnable);
		if(!selectionEnable){
			newTypeNameText.setFocus();
		}
		//selectionSection
		selectionRadio.setSelection(selectionEnable);
		profileSelectionLabel.setEnabled(selectionEnable);
		reviewSeletion.setEnabled(selectionEnable);
		if(selectionEnable){
			reviewSeletion.setFocus();
		}
	}

	/**
	 * Add listeners to widgets
	 */
	protected void addListeners() {
		// listener to choose active section
		SelectionListener selectCreateListener = new SelectionAdapter() {

			/**
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(creationRadio.equals(e.getSource())) {
					refreshSectionsEnable(false);
				} else {
					refreshSectionsEnable(true);
				}
				refreshOkButton();
			}
		};
		SelectionListener ChooseListener = new SelectionAdapter() {

			/**
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(reviewSeletion.equals(e.getSource())) {
					reviewResourceManager.loadReviewModel();
					Model reviewModel=reviewResourceManager.getCurrentReviewModel();
					reviewSeletion.setText("Choose "+reviewModel.getName());
				}
				refreshOkButton();
			}
		};
		selectionRadio.addSelectionListener(selectCreateListener);
		creationRadio.addSelectionListener(selectCreateListener);
		reviewSeletion.addSelectionListener(ChooseListener);
		




		// listener to new element name
		ModifyListener lNewNameListener = new ModifyListener() {

			/**
			 * @see org.eclipse.swt.events.ModifyListener#modifyText(org.eclipse.swt.events.ModifyEvent)
			 */
			public void modifyText(ModifyEvent e) {
				refreshOkButton();
			}
		};
		newTypeNameText.addModifyListener(lNewNameListener);
	}

	/** Refresh the OK button activation */
	protected void refreshOkButton() {
		boolean isSelectionSelected = selectionRadio.getSelection();
		if(!isSelectionSelected){
			//creation
			if (newTypeNameText.getText().trim().equals("")){
				getButton(IDialogConstants.OK_ID).setEnabled(false);
			}
			else{
				getButton(IDialogConstants.OK_ID).setEnabled(true);
			}
		}
	}

	/**
	 * Create the section to ask the user to create an invoked element.
	 * 
	 * @param pParent
	 *        the section's parent widget
	 * @param pToolkit
	 *        the form toolkit
	 */
	protected void createFormCreationSection(Composite pParent, FormToolkit pToolkit) {
		// create the section
		String lSectionTitle = "Create a new Review Model";
		Section lSection = pToolkit.createSection(pParent, Section.EXPANDED | Section.TITLE_BAR);
		lSection.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		if(lSectionTitle != null) {
			lSection.setText(lSectionTitle);
		}

		ScrolledForm lInsideScrolledForm = pToolkit.createScrolledForm(lSection);
		lInsideScrolledForm.setExpandHorizontal(true);
		lInsideScrolledForm.setExpandVertical(true);
		Composite lBody = lInsideScrolledForm.getBody();

		GridLayout lLayout = new GridLayout();
		lLayout.numColumns = 3;
		lBody.setLayout(lLayout);

		creationRadio = pToolkit.createButton(lBody, "Review Model creation", SWT.RADIO);
		creationRadio.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));

		newProfileLabel = pToolkit.createLabel(lBody, "Set name of the new review model", SWT.NONE);
		newTypeNameText = pToolkit.createText(lBody, "", SWT.BORDER);
		newTypeNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		newTypeNameText.setFocus();



		lInsideScrolledForm.reflow(true);
		lSection.setClient(lInsideScrolledForm);
	}

	/**
	 * Create the section to ask the user to choose an existing element.
	 * 
	 * @param pParent
	 *        the section's parent widget
	 * @param pToolkit
	 *        the form toolkit
	 */
	protected void createFormSelectionSection(Composite pParent, FormToolkit pToolkit) {
		// create the section
		String lSectionTitle = "Select an existing Review Model";
		lSection = pToolkit.createSection(pParent, Section.EXPANDED | Section.TITLE_BAR);
		lSection.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		if(lSectionTitle != null) {
			lSection.setText(lSectionTitle);
		}

		ScrolledForm lInsideScrolledForm = pToolkit.createScrolledForm(lSection);
		lInsideScrolledForm.setExpandHorizontal(true);
		lInsideScrolledForm.setExpandVertical(true);
		Composite lBody = lInsideScrolledForm.getBody();

		GridLayout lLayout = new GridLayout();
		lLayout.numColumns = 3;
		lBody.setLayout(lLayout);

		selectionRadio = pToolkit.createButton(lBody, "Selection Review Model mode", SWT.RADIO);
		selectionRadio.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));

		profileSelectionLabel = pToolkit.createLabel(lBody, "Review:", SWT.NONE);
		reviewSeletion = pToolkit.createButton(lBody, "Choose...                                        ", SWT.BUTTON1);
		ImageDescriptor imfDesc;
		try {
			imfDesc = ImageDescriptor.createFromURL(new URL("platform:/plugin/org.eclipse.papyrus.revisiontool/img/load.png"));
			reviewSeletion.setImage(imfDesc.createImage());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//		profileSelectionCombo = new Combo (lBody, SWT.READ_ONLY);
		//		for(Profile profile : appliedLocalProfiles) {
		//			profileSelectionCombo.add(profile.getName());
		//		}
		pToolkit.adapt(reviewSeletion, true, true);


		lInsideScrolledForm.reflow(true);
		lSection.setClient(lInsideScrolledForm);
	}

	@Override
	protected void okPressed() {
		resultReviewName = null;
		boolean isSelectionSelected = selectionRadio.getSelection();
		if(!isSelectionSelected){
			//creation
			if (!(newTypeNameText.getText().trim().equals(""))){
				resultReviewName=newTypeNameText.getText().trim();
			
				reviewResourceManager.createReviewModel(resultReviewName);
				
			}
		}
		super.okPressed();
	}

}
