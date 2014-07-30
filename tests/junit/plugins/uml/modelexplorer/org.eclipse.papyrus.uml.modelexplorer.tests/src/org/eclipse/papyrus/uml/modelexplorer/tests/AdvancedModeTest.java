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

package org.eclipse.papyrus.uml.modelexplorer.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.papyrus.emf.facet.custom.core.ICustomizationCatalogManager;
import org.eclipse.papyrus.emf.facet.custom.core.ICustomizationCatalogManagerFactory;
import org.eclipse.papyrus.emf.facet.custom.core.ICustomizationManager;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.junit.utils.rules.PapyrusEditorFixture;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.junit.utils.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.views.modelexplorer.Activator;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerView;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


/**
 * Automated tests for the <em>Advanced Mode</em> of the Model Explorer view.
 */
@PluginResource("resources/adv_mode.di")
public class AdvancedModeTest extends AbstractPapyrusTest {

	private static final String SIMPLE_UML_CUSTOMIZATION = "SimpleUML"; //$NON-NLS-1$ 

	@Rule
	public final PapyrusEditorFixture editor = new PapyrusEditorFixture();

	private boolean wasAdvancedMode;

	public AdvancedModeTest() {
		super();
	}

	@Test
	public void advancedModeDoesNotCollapseItself() {
		ParameterableElement parameteredClass = ((TemplateableElement)editor.getModel().getOwnedType("Container")).getOwnedTemplateSignature().getOwnedParameters().get(0).getOwnedParameteredElement();

		// "reveal" actually does a "select and reveal"
		ModelExplorerView.reveal(new StructuredSelection(parameteredClass), editor.getModelExplorerView().getCommonViewer());

		editor.flushDisplayEvents();

		// Rename the parametered class
		EditingDomain domain = TransactionUtil.getEditingDomain(parameteredClass);
		domain.getCommandStack().execute(SetCommand.create(domain, parameteredClass, UMLPackage.Literals.NAMED_ELEMENT__NAME, "E"));

		editor.flushDisplayEvents();

		// Verify that the class is still selected
		IStructuredSelection selection = (IStructuredSelection)editor.getModelExplorerView().getSite().getSelectionProvider().getSelection();
		assertThat(selection.size(), is(1));
		assertThat(EMFHelper.getEObject(selection.getFirstElement()), is((EObject)parameteredClass));
	}

	//
	// Test framework
	//

	@Before
	public void ensureAdvancedMode() {
		setAdvancedMode(true);
	}

	@After
	public void restoreAdvancedMode() {
		setAdvancedMode(wasAdvancedMode);
	}

	private void setAdvancedMode(boolean advancedMode) {
		ICustomizationManager customizationManager = Activator.getDefault().getCustomizationManager();
		if(customizationManager != null) {
			ICustomizationCatalogManager customCatalog = ICustomizationCatalogManagerFactory.DEFAULT.getOrCreateCustomizationCatalogManager(customizationManager.getResourceSet());
			Customization simpleUMLCustomization = null;

			//look for SIMPLE UML Customization
			for(Customization customization : customCatalog.getRegisteredCustomizations()) {
				if(SIMPLE_UML_CUSTOMIZATION.equals(customization.getName())) {
					simpleUMLCustomization = customization;
					break;
				}
			}

			if(simpleUMLCustomization != null) {
				List<Customization> registeredCustomizations = new ArrayList<Customization>(customizationManager.getManagedCustomizations());
				wasAdvancedMode = !registeredCustomizations.contains(simpleUMLCustomization);

				if(advancedMode) {
					if(registeredCustomizations.remove(simpleUMLCustomization)) {
						customizationManager.getManagedCustomizations().clear();
						for(Customization customization : registeredCustomizations) {
							customizationManager.getManagedCustomizations().add(customization);
						}
					}
				} else {
					if(!customizationManager.getManagedCustomizations().contains(simpleUMLCustomization)) {
						customizationManager.getManagedCustomizations().add(0, simpleUMLCustomization);
					}
				}
			}

			editor.getModelExplorerView().getCommonViewer().refresh();
			editor.flushDisplayEvents();
		}
	}
}
