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
package org.eclipse.papyrus.infra.services.edit.tests.edit.advice;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.services.edit.internal.advice.MarkerDeletionAdvice;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.infra.services.validation.EcoreDiagnostician;
import org.eclipse.papyrus.infra.services.validation.IPapyrusDiagnostician;
import org.eclipse.papyrus.infra.services.validation.ValidationTool;
import org.eclipse.papyrus.junit.utils.rules.HouseKeeper;
import org.eclipse.papyrus.junit.utils.rules.PapyrusEditorFixture;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.junit.utils.tests.AbstractPapyrusTest;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.LoopNode;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


/**
 * Test suite for the {@link MarkerDeletionAdvice} class.
 */
@PluginResource("model/MarkerDeletionModel.di")
public class MarkerDeletionAdviceTest extends AbstractPapyrusTest {

	@Rule
	public final HouseKeeper houseKeeper = new HouseKeeper();

	@Rule
	public final PapyrusEditorFixture editor = new PapyrusEditorFixture();

	public MarkerDeletionAdviceTest() {
		super();
	}

	@Test
	public void testDeleteMarkers() {
		MarkerAssertion markers = new MarkerAssertion().add(markerIs("required feature '[^']+' of '<Loop Node> LoopNode'", IMarker.SEVERITY_ERROR));

		LoopNode loopNode = findElement(LoopNode.class);
		IEditCommandRequest request = new DestroyElementRequest(loopNode, false);

		execute(new MarkerDeletionAdvice().getBeforeEditCommand(request));

		markers.assertMarkersRemoved();

		undo();

		markers.assertMarkersAdded();

		redo();

		markers.assertMarkersRemoved();
	}

	@Test
	public void testDeleteMarkers_integration() {
		MarkerAssertion markers = new MarkerAssertion().add(markerIs("required feature '[^']+' of '<Loop Node> LoopNode'", IMarker.SEVERITY_ERROR));

		LoopNode loopNode = findElement(LoopNode.class);

		execute(getDestroyCommand(loopNode));

		markers.assertMarkersRemoved();

		undo();

		markers.assertMarkersAdded();

		redo();

		markers.assertMarkersRemoved();
	}

	@Test
	@PluginResource("model/AssociationModel.di")
	public void testDeleteMarkers_relatedElements() {
		MarkerAssertion markers = new MarkerAssertion().add(markerIs("Subsetting property '<Property> employer : Company'", IMarker.SEVERITY_WARNING));

		// This is a class-owned association end (not association-owned), so deleting it
		// deletes the association as a dependent element
		Property associationEnd = findElement(Property.class, "employee");

		execute(getDestroyCommand(associationEnd));

		markers.assertMarkersRemoved();

		undo();

		markers.assertMarkersAdded();

		redo();

		markers.assertMarkersRemoved();
	}

	@Test
	public void testDeleteMarkers_relatedElements_diagram() {
		MarkerAssertion markers = new MarkerAssertion().add(markerIs("subsetting property '<Property> employee : Person \\Q[0..*]\\E'", IMarker.SEVERITY_WARNING));

		Association association = findElement(Association.class, "A_employer_employee");
		EditPart editPart = editor.activateDiagram("classes").findEditPart(association);

		execute(new CommandProxy(editPart.getCommand(new EditCommandRequestWrapper(new DestroyElementRequest(false)))));

		markers.assertMarkersRemoved();

		undo();

		markers.assertMarkersAdded();

		redo();

		markers.assertMarkersRemoved();
	}

	//
	// Test framework
	//

	@Before
	public void validateModel() {
		// Open the editor
		editor.open();

		// Validate the model
		IPapyrusDiagnostician diagnostician = new EcoreDiagnostician();
		diagnostician.initialize(((AdapterFactoryEditingDomain)editor.getEditingDomain()).getAdapterFactory(), new NullProgressMonitor());
		BasicDiagnostic diagnostic = diagnostician.createDefaultDiagnostic(editor.getModel());
		diagnostician.validate(editor.getModel(), diagnostic, diagnostician.createDefaultContext());

		// Create the markers
		ValidationTool tool = new ValidationTool(editor.getModel());
		tool.createMarkers(diagnostic, new NullProgressMonitor());
	}

	<T extends NamedElement> T findElement(Class<T> type) {
		return findElement(type, null);
	}

	<T extends NamedElement> T findElement(Class<T> type, String name) {
		T result = null;

		for(Iterator<?> iter = editor.getModelResource().getAllContents(); iter.hasNext();) {
			Object next = iter.next();
			if(type.isInstance(next) && ((name == null) || name.equals(((NamedElement)next).getName()))) {
				result = type.cast(next);
				break;
			}
		}

		return result;
	}

	ICommand getDestroyCommand(EObject object) {
		IElementEditService edit = ElementEditServiceUtils.getCommandProvider(object);
		DestroyElementRequest req = new DestroyElementRequest(object, false);

		return edit.getEditCommand(req);
	}

	void execute(ICommand command) {
		editor.getEditingDomain().getCommandStack().execute(GMFtoEMFCommandWrapper.wrap(command));
		letMarkerCacheClearOut();
	}

	void undo() {
		editor.getEditingDomain().getCommandStack().undo();
		letMarkerCacheClearOut();
	}

	void redo() {
		editor.getEditingDomain().getCommandStack().redo();
		letMarkerCacheClearOut();
	}

	private void letMarkerCacheClearOut() {
		Display display = Display.getCurrent();
		if(display != null) {
			while(display.readAndDispatch()) {
				// Pass
			}
		}
	}

	Matcher<IMarkerDelta> markerIs(String messageRegex, int severity) {
		final int markerSeverity = severity;
		final Pattern messagePattern = Pattern.compile(messageRegex, Pattern.CASE_INSENSITIVE);

		return new BaseMatcher<IMarkerDelta>() {

			public void describeTo(Description description) {
				description.appendText("marker of ");

				switch(markerSeverity) {
				case IMarker.SEVERITY_INFO:
					description.appendText("INFO");
					break;
				case IMarker.SEVERITY_WARNING:
					description.appendText("WARNING");
					break;
				default:
					description.appendText("ERROR");
					break;
				}
				description.appendText(" severity with message like '");
				description.appendText(messagePattern.pattern());
				description.appendText("'");
			}

			public boolean matches(Object item) {
				boolean result = item instanceof IMarkerDelta;

				if(result) {
					IMarkerDelta markerDelta = (IMarkerDelta)item;
					result = (markerDelta.getAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR) == markerSeverity) //
						&& messagePattern.matcher(markerDelta.getAttribute(IMarker.MESSAGE, "")).find();
				}

				return result;
			}
		};
	}

	public class MarkerAssertion implements IResourceChangeListener {

		private final IWorkspace ws = ResourcesPlugin.getWorkspace();

		private IFile file;

		private Collection<Matcher<? super IMarkerDelta>> markerAssertions = new ArrayList<Matcher<? super IMarkerDelta>>();

		boolean markersRemoved;

		boolean markersAdded;

		MarkerAssertion() {
			super();

			ws.addResourceChangeListener(this);
			houseKeeper.cleanUpLater(this);

			file = editor.getProject().getFile(editor.getModelResourceURI());

			try {
				IMarker[] markers = file.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_ZERO);
				assertThat("No problem markers on model", markers.length > 0, is(true));
			} catch (CoreException e) {
				e.printStackTrace();
				fail("Could not access model resource markers: " + e.getLocalizedMessage());
			}
		}

		public void dispose() {
			ws.removeResourceChangeListener(this);
		}

		MarkerAssertion add(Matcher<? super IMarkerDelta> assertion) {
			markerAssertions.add(assertion);
			return this;
		}

		public void resourceChanged(IResourceChangeEvent event) {
			try {
				event.getDelta().accept(new IResourceDeltaVisitor() {

					public boolean visit(IResourceDelta delta) throws CoreException {
						if(file.equals(delta.getResource()) && ((delta.getFlags() & IResourceDelta.MARKERS) != 0)) {
							for(IMarkerDelta markerDelta : delta.getMarkerDeltas()) {
								switch(markerDelta.getKind()) {
								case IResourceDelta.ADDED:
									markersAdded = markersAdded || anyAssertionMatches(markerDelta);
									break;
								case IResourceDelta.REMOVED:
									markersRemoved = markersRemoved || anyAssertionMatches(markerDelta);
									break;
								}
							}
						}
						return true;
					}
				});
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

		void reset() {
			markersRemoved = false;
			markersAdded = false;
		}

		void assertMarkersRemoved() {
			boolean test = markersRemoved;
			reset();
			assertThat("No markers were removed", test, is(true));
		}

		void assertMarkersAdded() {
			boolean test = markersAdded;
			reset();
			assertThat("No markers were added", test, is(true));
		}

		private boolean anyAssertionMatches(IMarkerDelta markerDelta) {
			boolean result = false;

			for(Matcher<? super IMarkerDelta> next : markerAssertions) {
				result = next.matches(markerDelta);
				if(result) {
					break;
				}
			}

			return result;
		}
	}
}
