/*****************************************************************************
 * Copyright (c) 2012, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 *  Christian W. Damus (CEA) - bug 434993
 *  Christian W. Damus (CEA) - bug 436047
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.stereotypeproperty;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.commands.ICreationCommand;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ExtensionServicesRegistry;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.DiResourceSet;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.eclipse.papyrus.junit.utils.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.uml.diagram.clazz.CreateClassDiagramCommand;
import org.eclipse.papyrus.uml.diagram.clazz.part.UMLDiagramEditor;
import org.eclipse.papyrus.uml.diagram.common.commands.CreateUMLModelCommand;
import org.eclipse.uml2.uml.Element;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;


/**
 * The Class AbstractPapyrusTestCase.
 */
@SuppressWarnings("deprecation")
public abstract class AbstractPapyrusTestCase extends AbstractPapyrusTest {

	@Rule
	public final HouseKeeper houseKeeper = new HouseKeeper();

	/** The Constant CREATION. */
	protected static final String CREATION = "CREATION:";

	/** The Constant CONTAINER_CREATION. */
	protected static final String CONTAINER_CREATION = "CONTAINER CREATION: ";

	/** The Constant DROP. */
	protected static final String DROP = "DROP: ";

	/** The Constant DESTROY_DELETION. */
	protected static final String DESTROY_DELETION = "DESTROY DELETION: ";

	/** The Constant COMMAND_NULL. */
	protected static final String COMMAND_NULL = " command null";

	/** The Constant VIEW_DELETION. */
	protected static final String VIEW_DELETION = "VIEW DELETION: ";

	/** The Constant TEST_THE_REDO. */
	protected static final String TEST_THE_REDO = "test the redo";

	/** The Constant TEST_THE_UNDO. */
	protected static final String TEST_THE_UNDO = "test the undo";

	/** The Constant TEST_THE_EXECUTION. */
	protected static final String TEST_THE_EXECUTION = "test the execution";

	/** The Constant TEST_IF_THE_COMMAND_CAN_BE_EXECUTED. */
	protected static final String TEST_IF_THE_COMMAND_CAN_BE_EXECUTED = "test if the command can be executed";

	/** The Constant TEST_IF_THE_COMMAND_IS_CREATED. */
	protected static final String TEST_IF_THE_COMMAND_IS_CREATED = "test if the command is created";

	/** The Constant INITIALIZATION_TEST. */
	protected static final String INITIALIZATION_TEST = "Intitial State";

	/** The Constant CHANGE_CONTAINER. */
	protected static final String CHANGE_CONTAINER = "CHANGE CONTAINER";

	/** The papyrus editor. */
	protected IMultiDiagramEditor papyrusEditor;

	/** The di resource set. */
	protected ModelSet diResourceSet;

	/** The project. */
	protected IProject project;

	/** The file. */
	protected IFile file;

	/** The diagram editor. */
	protected UMLDiagramEditor diagramEditor = null;

	/** The clazzdiagramedit part. */
	protected DiagramEditPart clazzdiagrameditPart;


	/**
	 * @see junit.framework.TestCase#setUp()
	 *
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		projectCreation();

		//		while( !(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor()instanceof IMultiDiagramEditor)){}
		//		IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		//		papyrusEditor=((PapyrusMultiDiagramEditor)editorPart);
	}

	/**
	 * Gets the root view.
	 *
	 * @return the root view
	 */
	protected View getRootView() {
		return getDiagramEditPart().getDiagramView();
	}

	/**
	 * Gets the root semantic model.
	 *
	 * @return the root semantic model
	 */
	protected Element getRootSemanticModel() {
		return (Element)getRootView().getElement();
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 *
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		papyrusEditor.doSave(new NullProgressMonitor());
		//diResourceSet.save( new NullProgressMonitor());
		//diagramEditor.close(true);
		papyrusEditor = null;
	}

	/**
	 * Gets the diagram edit part.
	 *
	 * @return the diagram edit part
	 */
	protected DiagramEditPart getDiagramEditPart() {
		if(clazzdiagrameditPart == null) {
			diagramEditor = (UMLDiagramEditor)papyrusEditor.getActiveEditor();
			clazzdiagrameditPart = (DiagramEditPart)papyrusEditor.getAdapter(DiagramEditPart.class);
			Assert.assertNotNull("Cannot find the diagram editor", diagramEditor);
			Assert.assertNotNull("Cannot find the Diagram edit part", clazzdiagrameditPart);
		}
		return clazzdiagrameditPart;
	}

	/**
	 * Project creation.
	 */
	protected void projectCreation() throws Exception {
		project = houseKeeper.createProject("StereotypePropertyTests");
		file = project.getFile("StereotypePropertyTests.di");
		this.diResourceSet = houseKeeper.cleanUpLater(new DiResourceSet());

		//at this point, no resources have been created
		if(file.exists()) {
			file.delete(true, new NullProgressMonitor());
		}

		if(!file.exists()) {
			// Don't create a zero-byte file. Create an empty XMI document
			Resource diResource = diResourceSet.createResource(URI.createPlatformResourceURI(file.getFullPath().toString(), true));
			diResource.save(null);
			diResource.unload();
			diResourceSet.createsModels(file);
			new CreateUMLModelCommand().createModel(this.diResourceSet);
			ServicesRegistry registry = new ExtensionServicesRegistry(org.eclipse.papyrus.infra.core.Activator.PLUGIN_ID);
			try {
				registry.add(ModelSet.class, Integer.MAX_VALUE, diResourceSet); //High priority to override all contributions
				registry.startRegistry();
			} catch (ServiceException ex) {
				//Ignore exceptions
			}
			// diResourceSet.createsModels(file);
			ICreationCommand command = new CreateClassDiagramCommand();
			command.createDiagram(diResourceSet, null, "ClazzDiagram");
			diResourceSet.save(new NullProgressMonitor());
		}

		papyrusEditor = houseKeeper.openPapyrusEditor(file);
		Assert.assertNotNull(papyrusEditor);
	}

}
