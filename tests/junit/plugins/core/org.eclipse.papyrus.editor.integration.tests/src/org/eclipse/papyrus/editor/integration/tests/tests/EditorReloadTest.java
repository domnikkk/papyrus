/*
 * Copyright (c) 2014 CEA and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.papyrus.editor.integration.tests.tests;

import static org.eclipse.papyrus.junit.matchers.DiagramMatchers.collapsedIn;
import static org.eclipse.papyrus.junit.matchers.DiagramMatchers.editPartSelected;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteStack;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.ui.palette.PaletteViewer;
import org.eclipse.gef.ui.views.palette.PaletteView;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.IService;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.junit.utils.Duck;
import org.eclipse.papyrus.junit.utils.classification.ExpensiveTest;
import org.eclipse.papyrus.junit.utils.rules.PapyrusEditorFixture;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.junit.utils.rules.ShowView;
import org.eclipse.papyrus.junit.utils.rules.ShowView.Location;
import org.eclipse.papyrus.junit.utils.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerPageBookView;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.part.IPage;
import org.eclipse.ui.part.PageBookView;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.google.common.base.Splitter;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;


/**
 * Test cases checking that various different scenarios in Papyrus editor re-loading for changes in resource dependencies.
 * 
 * @see <a href="https://bugs.eclipse.org/bugs/show_bug.cgi?id=437217">bug 437217</a>
 */
@ExpensiveTest
@PluginResource({ EditorReloadTest.EMPLOYMENT_MODEL, EditorReloadTest.BANKING_MODEL, EditorReloadTest.LIBRARY_MODEL })
public class EditorReloadTest extends AbstractPapyrusTest {

	static final String PROPERTY_SHEET_VIEW_ID = "org.eclipse.ui.views.PropertySheet";

	static final String EMPLOYMENT_MODEL = "model/reload/employment.di";

	static final String BANKING_MODEL = "model/reload/banking.di";

	static final String LIBRARY_MODEL = "model/reload/library.di";

	@Rule
	public final PapyrusEditorFixture editorFixture = new PapyrusEditorFixture();

	private IMultiDiagramEditor employmentEditor;

	private IMultiDiagramEditor bankingEditor;

	private IMultiDiagramEditor libraryEditor;

	public EditorReloadTest() {
		super();
	}

	/**
	 * Verify that dependent editors are not re-loaded immediately (this is deferred until they are activated).
	 */
	@Test
	public void testReloadIsDeferred() {
		final ReloadAssertion reload = new ReloadAssertion(employmentEditor, bankingEditor);

		pokeLibraryModel();
		editorFixture.save(libraryEditor);

		reload.assertNotReloaded();
	}

	/**
	 * Verify that re-loading two dependent editors doesn't mess up the perspective layout.
	 */
	@Test
	public void testPerspectiveLayoutUnperturbed() {
		final ReloadAssertion reload = new ReloadAssertion(employmentEditor, bankingEditor);

		pokeLibraryModel();
		reload.save(libraryEditor);

		// The ordering and separation of editor stacks is unchanged
		assertThat(editorFixture.getPartStack(employmentEditor), is(Arrays.<IWorkbenchPart> asList(employmentEditor, libraryEditor)));
		assertThat(editorFixture.getPartStack(bankingEditor), is(Arrays.<IWorkbenchPart> asList(bankingEditor)));
	}

	/**
	 * Verify that, after a <em>Save All</em> action that saves a non-active editor causing the active editor to re-load in place,
	 * the originally active editor is active once again.
	 */
	@Test
	public void testActiveEditorRestoredSaveAll() {
		final ReloadAssertion reload = new ReloadAssertion(employmentEditor);

		pokeLibraryModel();
		editorFixture.activate(employmentEditor);
		editorFixture.saveAll();

		reload.assertReloaded(); // The editor is reloaded immediately because it is already active

		assertThat(employmentEditor.getSite().getPage().getActiveEditor(), is((IEditorPart)employmentEditor));
	}

	/**
	 * Verify that the nested editor that was active is active again after the re-load.
	 */
	@Test
	public void testActiveDiagramRestored() {
		final String diagramTitle = "ActivityDiagram";
		final ReloadAssertion reload = new ReloadAssertion(employmentEditor);

		editorFixture.activate(employmentEditor);
		editorFixture.activateDiagram(employmentEditor, diagramTitle);

		pokeLibraryModel();
		reload.save(libraryEditor);

		editorFixture.activate(employmentEditor);
		assertThat(employmentEditor.getActiveEditor(), notNullValue());
		assertThat(employmentEditor.getActiveEditor().getTitle(), is(diagramTitle));
	}

	/**
	 * Verify that edit-part selections in a diagram are restored after the re-load.
	 */
	@Test
	public void testEditPartSelectionRestored() {
		final String diagramTitle = "ActivityDiagram";
		final String nodeName = "do work";
		final ReloadAssertion reload = new ReloadAssertion(employmentEditor);

		EditPart activityNode = editorFixture.activateDiagram(employmentEditor, diagramTitle).findEditPart(nodeName, OpaqueAction.class);
		editorFixture.select(activityNode);

		pokeLibraryModel();
		reload.save(libraryEditor);

		activityNode = editorFixture.activateDiagram(employmentEditor, diagramTitle).findEditPart(nodeName, OpaqueAction.class);

		assertThat(activityNode, notNullValue());
		assertThat(activityNode, editPartSelected());
	}

	/**
	 * Verify that drawer, stack, and tool state in the palette is restored after editor re-load.
	 */
	@Test
	public void testPaletteStateRestored() {
		doTestPaletteStateRestored();
	}

	/**
	 * Verify that drawer, stack, and tool state in the <em>Palette View</em> is restored after editor re-load.
	 */
	@ShowView(PaletteView.ID)
	@Test
	public void testPaletteStateRestored_paletteView() {
		doTestPaletteStateRestored();
	}

	void doTestPaletteStateRestored() {
		final String diagramTitle = "ActivityDiagram";
		final String drawerLabel = "Edges";
		final String stackLabel = "ControlNodes";
		final String stackEntryLabel = "Activity final";
		final String activeToolLabel = "Comment";
		final ReloadAssertion reload = new ReloadAssertion(employmentEditor);

		PaletteViewer palette = editorFixture.activateDiagram(employmentEditor, diagramTitle).getPalette();

		// Collapse the Edges drawer
		PaletteDrawer edges = find(palette.getPaletteRoot(), drawerLabel, PaletteDrawer.class);
		new Duck(palette.getEditPartRegistry().get(edges)).quack("setExpanded", false);

		// Select the Activity Final Node in the control nodes stack
		PaletteStack stack = find(palette.getPaletteRoot(), stackLabel, PaletteStack.class);
		stack.setActiveEntry(find(stack, stackEntryLabel, ToolEntry.class));

		// And make the Comment tool active
		palette.setActiveTool(find(palette.getPaletteRoot(), activeToolLabel, ToolEntry.class));

		editorFixture.flushDisplayEvents();

		pokeLibraryModel();
		reload.save(libraryEditor);

		palette = editorFixture.activateDiagram(employmentEditor, diagramTitle).getPalette();

		// Verify the Edges drawer
		edges = find(palette.getPaletteRoot(), drawerLabel, PaletteDrawer.class);
		assertThat(edges, collapsedIn(palette));

		// Verify Activity Final Node selection in its stack
		stack = find(palette.getPaletteRoot(), stackLabel, PaletteStack.class);
		assertThat(stack.getActiveEntry().getLabel(), is(stackEntryLabel));

		// Verify the active tool
		assertThat(palette.getActiveTool().getLabel(), is(activeToolLabel));
	}

	@ShowView(value = ModelExplorerPageBookView.VIEW_ID, location = Location.LEFT)
	@Test
	public void testModelExplorerSelectionRestored() {
		final ReloadAssertion reload = new ReloadAssertion(employmentEditor);

		editorFixture.activate(employmentEditor);

		Set<String> selectedLabels = ImmutableSet.of("employment::Company", "types::Name::firstName");

		reload.verifySelection(modelExplorerSupplier(), selectedLabels);
	}

	@ShowView(value = ModelExplorerPageBookView.VIEW_ID, location = Location.LEFT)
	@Test
	public void testModelExplorerExpansionRestored() {
		final ReloadAssertion reload = new ReloadAssertion(employmentEditor);

		editorFixture.activate(employmentEditor);

		Set<String> expandedLabels = ImmutableSet.of("employment::A_company_person_1", "types::UML Primitive Types::PrimitiveTypes::Real");

		reload.verifyExpansion(modelExplorerSupplier(), expandedLabels);
	}

	@ShowView(value = ModelExplorerPageBookView.VIEW_ID, location = Location.LEFT)
	@Test
	public void testModelExplorerReferencedLibrariesRestored() {
		final ReloadAssertion reload = new ReloadAssertion(employmentEditor);

		editorFixture.activate(employmentEditor);

		// Load something we haven't loaded before
		editorFixture.getModelSet(employmentEditor).getResource(URI.createURI(UMLResource.JAVA_PRIMITIVE_TYPES_LIBRARY_URI), true);
		editorFixture.flushDisplayEvents();

		Set<String> selectedLabels = ImmutableSet.of("Java Primitive Types::Long");

		reload.verifySelection(modelExplorerSupplier(), selectedLabels);
	}

	@ShowView(value = { ModelExplorerPageBookView.VIEW_ID, PROPERTY_SHEET_VIEW_ID }, location = { Location.LEFT, Location.BELOW })
	@Test
	public void testPropertySheetRestoredShowingCorrectInput() {
		final ReloadAssertion reload = new ReloadAssertion(employmentEditor);

		pokeLibraryModel();
		pokeEmploymentModel(); // And this one, too!
		
		EditPart companyClassEP = editorFixture.activateDiagram(employmentEditor, "classes").findEditPart("Company", org.eclipse.uml2.uml.Class.class);
		assertThat(companyClassEP, notNullValue());
		editorFixture.select(companyClassEP);
		editorFixture.flushDisplayEvents();

		EObject propertySheetSelection = getPropertySheetSelection();
		assertThat(propertySheetSelection, is(EMFHelper.getEObject(companyClassEP)));

		editorFixture.activate(editorFixture.getView(ModelExplorerPageBookView.VIEW_ID, false));
		Set<String> selectedLabels = ImmutableSet.of("employment::Person");
		reload.select(modelExplorerSupplier(), selectedLabels);
		editorFixture.flushDisplayEvents();

		editorFixture.saveAll();

		reload.assertReloaded(); // The editor is reloaded immediately because it is already active

		editorFixture.flushDisplayEvents();

		// The property sheet still has the Person class selected, not Company
		propertySheetSelection = getPropertySheetSelection();
		assertThat(propertySheetSelection, instanceOf(org.eclipse.uml2.uml.Class.class));
		assertThat(((org.eclipse.uml2.uml.Class)propertySheetSelection).getName(), is("Person"));
	}

	//
	// Test framework
	//

	@Before
	public void layOutWorkbenchPage() {
		employmentEditor = editorFixture.getEditor(EMPLOYMENT_MODEL);
		bankingEditor = editorFixture.getEditor(BANKING_MODEL);
		libraryEditor = editorFixture.getEditor(LIBRARY_MODEL);

		// Move the banking editor into its own part of the editor area
		editorFixture.splitEditorArea(bankingEditor, false);
	}

	void pokeLibraryModel() {
		// First, make sure that the library editor is active (user can't edit it, otherwise!)
		editorFixture.activate(libraryEditor);

		Package library = editorFixture.getModel(libraryEditor);
		Type ssn = library.getOwnedType("SSN");
		EditingDomain domain = editorFixture.getEditingDomain(libraryEditor);
		domain.getCommandStack().execute(domain.createCommand(SetCommand.class, new CommandParameter(ssn, UMLPackage.Literals.NAMED_ELEMENT__NAME, "SocialSecurityNumber")));
	}

	void pokeEmploymentModel() {
		// First, make sure that the library editor is active (user can't edit it, otherwise!)
		editorFixture.activate(employmentEditor);

		Package employment = editorFixture.getModel(employmentEditor);
		Type person = employment.getOwnedType("Person");
		EditingDomain domain = editorFixture.getEditingDomain(employmentEditor);
		domain.getCommandStack().execute(domain.createCommand(SetCommand.class, new CommandParameter(person, UMLPackage.Literals.NAMED_ELEMENT__VISIBILITY, VisibilityKind.PUBLIC_LITERAL)));
	}

	<P extends PaletteEntry> P find(PaletteContainer container, String label, Class<P> type) {
		P result = null;

		for(P next : Iterables.filter(container.getChildren(), type)) {
			if(label.equalsIgnoreCase(next.getLabel())) {
				result = next;
				break;
			}
		}

		if(result == null) {
			for(PaletteContainer next : Iterables.filter(container.getChildren(), PaletteContainer.class)) {
				result = find(next, label, type);
				if(result != null) {
					break;
				}
			}
		}

		return result;
	}

	Set<String> getLabels(Item... items) {
		Set<String> result = Sets.newHashSet();

		for(Item next : items) {
			result.add(getLabel(next));
		}

		return result;
	}

	TreeItem[] getItems(AbstractTreeViewer tree, Collection<String> labels) {
		List<TreeItem> result = Lists.newArrayListWithCapacity(labels.size());

		for(String next : labels) {
			Widget search = tree.getControl();
			for(String part : Splitter.on(NamedElement.SEPARATOR).split(next)) {
				search = findItem(tree, search, part);
			}

			if(search instanceof TreeItem) {
				result.add((TreeItem)search);
			}
		}

		return Iterables.toArray(result, TreeItem.class);
	}

	static final Pattern METACLASS_QUALIFIER = Pattern.compile("<.+>");

	static final Pattern STEREOTYPE_QUALIFIER = Pattern.compile("«.+»");

	static String getLabel(Item item) {
		String result = item.getText();

		if(result != null) {
			result = METACLASS_QUALIFIER.matcher(result).replaceAll("");
			result = STEREOTYPE_QUALIFIER.matcher(result).replaceAll("");
			result = result.trim();
		}

		return result;
	}

	private Item findItem(AbstractTreeViewer tree, Widget parent, String label) {
		Item result = null;

		if(parent != null) {
			if(parent instanceof TreeItem) {
				tree.expandToLevel(parent.getData(), 1);
			}

			for(Item next : (Item[])new Duck(parent).quack("getItems")) {
				if(label.equals(getLabel(next))) {
					result = next;
					break;
				}
			}
		}

		return result;
	}

	Supplier<CommonViewer> modelExplorerSupplier() {
		return new Supplier<CommonViewer>() {

			public CommonViewer get() {
				return editorFixture.getModelExplorerView().getCommonViewer();
			}
		};
	}

	EObject getPropertySheetSelection() {
		IViewPart propertySheet = editorFixture.getView(PROPERTY_SHEET_VIEW_ID, true);
		assertThat(propertySheet, instanceOf(PageBookView.class));
		IPage currentPage = ((PageBookView)propertySheet).getCurrentPage();
		assertThat(currentPage, instanceOf(TabbedPropertySheetPage.class));
		TabbedPropertySheetPage tabbed = (TabbedPropertySheetPage)currentPage;

		IStructuredSelection result = null;

		try {
			Method getCurrentSelection = TabbedPropertySheetPage.class.getDeclaredMethod("getCurrentSelection");
			getCurrentSelection.setAccessible(true);
			result = (IStructuredSelection)getCurrentSelection.invoke(tabbed);
			assertThat("Nothing selected in property sheet", (result == null) || result.isEmpty(), is(false));
		} catch (Exception e) {
			e.printStackTrace();
			fail("Failed to get property sheet selection: " + e.getLocalizedMessage());
		}

		return EMFHelper.getEObject(result.getFirstElement());
	}

	private class ReloadAssertion {

		private final Set<IMultiDiagramEditor> editors;

		private final Set<IMultiDiagramEditor> unloaded = Sets.newHashSet();

		ReloadAssertion(IMultiDiagramEditor... editor) {
			this.editors = Sets.newHashSet(editor);

			for(IMultiDiagramEditor next : editors) {
				ServicesRegistry services = next.getServicesRegistry();

				try {
					services.add(Canary.class, 1, new Canary(next));
					services.startServicesByClassKeys(Canary.class);
				} catch (ServiceException e) {
					e.printStackTrace();
					fail("Failed to start Canary service: " + e.getLocalizedMessage());
				}
			}
		}

		/**
		 * Saves the specified editor, kicks the registered dependent editors by activating them, and asserts that they were re-loaded.
		 */
		void save(IMultiDiagramEditor editor) {
			editorFixture.save(editor);
			kick();
			assertReloaded();
		}

		void kick() {
			if(!editors.isEmpty()) {
				IWorkbenchPage page = Iterables.getFirst(editors, null).getSite().getPage();
				IEditorPart active = page.getActiveEditor();

				for(IEditorPart next : editors) {
					// Activate this editor to trigger reload
					page.activate(next);
				}

				if(active != null) {
					// Restore the active editor
					page.activate(active);
				}

				editorFixture.flushDisplayEvents();
			}
		}

		void verifySelection(Supplier<? extends org.eclipse.jface.viewers.TreeViewer> viewerSupplier, Set<String> selectedLabels) {
			assertThat("Must have exactly one dependent editor registered for test.", editors.size(), is(1));

			final IMultiDiagramEditor dependent = Iterables.getOnlyElement(editors);

			Set<URI> selectedObjects = select(viewerSupplier, selectedLabels);

			editorFixture.activate(dependent);

			Set<URI> selectedAgain = getSelection(viewerSupplier);

			assertThat(selectedAgain, is(selectedObjects));
		}

		Set<URI> select(Supplier<? extends org.eclipse.jface.viewers.TreeViewer> viewerSupplier, Set<String> selectedLabels) {
			org.eclipse.jface.viewers.TreeViewer viewer = viewerSupplier.get();

			Set<URI> result = Sets.newHashSet();
			List<Object> selection = Lists.newArrayListWithCapacity(selectedLabels.size());
			for(TreeItem item : getItems(viewer, selectedLabels)) {
				selection.add(item.getData());
				EObject object = EMFHelper.getEObject(item.getData());
				result.add(EcoreUtil.getURI(object));
			}

			viewer.setSelection(new StructuredSelection(selection));

			return result;
		}

		Set<URI> getSelection(Supplier<? extends org.eclipse.jface.viewers.TreeViewer> viewerSupplier) {
			org.eclipse.jface.viewers.TreeViewer viewer = viewerSupplier.get();
			Set<URI> result = Sets.newHashSet();
			for(Object next : ((IStructuredSelection)viewer.getSelection()).toList()) {
				EObject object = EMFHelper.getEObject(next);
				result.add(EcoreUtil.getURI(object));
			}
			return result;
		}

		void verifyExpansion(Supplier<? extends TreeViewer> viewerSupplier, Set<String> expandedLabels) {
			assertThat("Must have exactly one dependent editor registered for test.", editors.size(), is(1));

			final IMultiDiagramEditor dependent = Iterables.getOnlyElement(editors);
			org.eclipse.jface.viewers.TreeViewer viewer = viewerSupplier.get();

			for(TreeItem next : getItems(viewer, expandedLabels)) {
				next.setExpanded(true);
			}
			Set<URI> expandedObjects = Sets.newHashSet();
			for(Object next : viewer.getExpandedElements()) {
				EObject object = EMFHelper.getEObject(next);
				expandedObjects.add(EcoreUtil.getURI(object));
			}

			pokeLibraryModel();
			save(libraryEditor);

			editorFixture.activate(dependent);

			viewer = viewerSupplier.get();
			Set<URI> expandedAgain = Sets.newHashSet();
			for(Object next : viewer.getExpandedElements()) {
				EObject object = EMFHelper.getEObject(next);
				expandedAgain.add(EcoreUtil.getURI(object));
			}
			assertThat(expandedAgain, is(expandedObjects));

		}

		void assertUnloaded() {
			assertThat("Some editors were not unloaded", unloaded, is(editors));
		}

		void assertLoaded() {
			for(IMultiDiagramEditor next : editors) {
				try {
					boolean loaded = next.getServicesRegistry().isStarted(ModelSet.class.getName());
					assertThat("Editor not loaded: " + next.getTitle(), loaded, is(true));
				} catch (ServiceException e) {
					e.printStackTrace();
					fail("Editor not loaded: " + next.getTitle());
				}
			}
		}

		void assertReloaded() {
			assertUnloaded();
			assertLoaded();
		}

		void assertNotUnloaded() {
			assertThat("Some editors were unloaded", Sets.difference(editors, unloaded), is(editors));
		}

		void assertNotReloaded() {
			assertNotUnloaded();
			assertLoaded();
		}

		private class Canary implements IService {

			private final IMultiDiagramEditor editor;

			private ServicesRegistry services;

			Canary(IMultiDiagramEditor editor) {
				this.editor = editor;
			}

			public void init(ServicesRegistry servicesRegistry) throws ServiceException {
				services = servicesRegistry;

				// For symmetry only; this never actually has any effect
				unloaded.remove(editor);
			}

			public void disposeService() throws ServiceException {
				unloaded.add(editor);
				services = null;
			}

			public void startService() throws ServiceException {
				// Load everything in the resource set so that we are sure to know of the dependency on the library model
				EcoreUtil.resolveAll(services.getService(ModelSet.class));
			}
		}

	}
}
