/**
 * Copyright (c) 2014 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.umldi.presentation;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.papyrus.dd.presentation.DDEditor;
import org.eclipse.papyrus.dd.presentation.DDModelPage;
import org.eclipse.ui.statushandlers.StatusManager;

/**
 * This is a page that shows a model tree for a UML DI editor
 */
public class UMLDIModelPage extends DDModelPage {

	public UMLDIModelPage(DDEditor editor) {
		super(editor);
	}

	@Override
	public void setupActions(IToolBarManager manager) {
		super.setupActions(manager);
		Action action;
		action = new Action(UMLDIEditorPlugin.INSTANCE.getString("TransformAction.title")) {

			public void run() {
				EditingDomain editingDomain = getDDEditor().getEditingDomain();
				Resource inResource = editingDomain.getResourceSet().getResources().get(0);
				EList<EObject> inObjects = inResource.getContents();
				ModelExtent input = new BasicModelExtent(inObjects);
				ModelExtent output = new BasicModelExtent();
				ExecutionContextImpl context = new ExecutionContextImpl();
				context.setConfigProperty("keepModeling", true);
				URI transformationURI = URI.createURI("platform:/plugin/org.eclipse.papyrus.umldi2dg/transforms/UmlDiToDg.qvto");
				TransformationExecutor executor = new TransformationExecutor(transformationURI);
				ExecutionDiagnostic result = executor.execute(context, input, output);
				if(result.getSeverity() == Diagnostic.OK) {
					try {
						List<EObject> outObjects = output.getContents();
						ResourceSet outResourceSet = new ResourceSetImpl();
						Resource outResource = outResourceSet.createResource(inResource.getURI().trimFileExtension().appendFileExtension("dg"));
						outResource.getContents().addAll(outObjects);
						outResource.save(Collections.emptyMap());
					} catch (IOException e) {
						UMLDIEditorPlugin.getPlugin().log(e);
					}
				} else {
					IStatus status = BasicDiagnostic.toIStatus(result);
					UMLDIEditorPlugin.getPlugin().getLog().log(status);
					StatusManager.getManager().handle(status, StatusManager.BLOCK);
				}
			}
		};
		action.setToolTipText(UMLDIEditorPlugin.INSTANCE.getString("TransformAction.title"));
		action.setImageDescriptor(UMLDIEditorPlugin.getImageDescriptor(UMLDIEditorPlugin.IMAGE_TRANSFORM));
		manager.appendToGroup("Page", action);
	}
}
