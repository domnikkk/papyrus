/*****************************************************************************
 * Copyright (c) 2011 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos - Initial API and implementation
 *   Bug 366159 - [ActivityDiagram] Activity Diagram should be able to handle correctly Interruptible Edge
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.activity.edit.helper.advice;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.papyrus.diagram.activity.edit.commands.InputPinInRemoveStructuralFeatureValueActionAsObjectCreateCommand;
import org.eclipse.papyrus.diagram.activity.edit.commands.InputPinInRemoveStructuralFeatureValueActionAsValueCreateCommand;
import org.eclipse.papyrus.diagram.activity.edit.commands.OutputPinInRemoveStructuralFeatureValueActionAsResultCreateCommand;
import org.eclipse.papyrus.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * Delete all incoming and outgoing edges of an activity node when this node is deleted
 * 
 * @author adaussy
 * 
 */
public class RemoveStructuralFeatureValueActionEditHelperAdvice extends AbstractEditHelperAdvice {

	@Override
	protected ICommand getAfterConfigureCommand(final ConfigureRequest request) {
		EObject elementToConfigure = request.getElementToConfigure();
		if(elementToConfigure instanceof RemoveStructuralFeatureValueAction) {
			RemoveStructuralFeatureValueAction rmSFVAction = (RemoveStructuralFeatureValueAction)elementToConfigure;
			CompositeTransactionalCommand cc = new CompositeTransactionalCommand(request.getEditingDomain(), "Create Remove Structural Feature Value Action Pins");
			//Object pin
			CreateElementRequest createObjectPinReq = new CreateElementRequest(rmSFVAction, UMLElementTypes.InputPin_3117);
			InputPinInRemoveStructuralFeatureValueActionAsObjectCreateCommand createObjectPin = new InputPinInRemoveStructuralFeatureValueActionAsObjectCreateCommand(createObjectPinReq) {

				@Override
				protected void doConfigure(InputPin newElement, IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
					super.doConfigure(newElement, monitor, info);
					newElement.setName("object");
					LiteralInteger literalInteger = UMLFactory.eINSTANCE.createLiteralInteger();
					literalInteger.setName("");
					literalInteger.setValue(1);
					newElement.setUpperBound(literalInteger);
				}
			};
			cc.compose(createObjectPin);
			//value pin
			CreateElementRequest createValuePinReq = new CreateElementRequest(rmSFVAction, UMLElementTypes.InputPin_3119);
			InputPinInRemoveStructuralFeatureValueActionAsValueCreateCommand createValuePin = new InputPinInRemoveStructuralFeatureValueActionAsValueCreateCommand(createValuePinReq) {

				@Override
				protected void doConfigure(InputPin newElement, IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
					super.doConfigure(newElement, monitor, info);
					newElement.setName("value");
					LiteralInteger literalInteger = UMLFactory.eINSTANCE.createLiteralInteger();
					literalInteger.setName("");
					literalInteger.setValue(1);
					newElement.setUpperBound(literalInteger);
				}
			};
			cc.compose(createValuePin);
			//Result pin
			CreateElementRequest createResultPinReq = new CreateElementRequest(rmSFVAction, UMLElementTypes.OutputPin_3120);
			OutputPinInRemoveStructuralFeatureValueActionAsResultCreateCommand createResultPin = new OutputPinInRemoveStructuralFeatureValueActionAsResultCreateCommand(createResultPinReq) {

				@Override
				protected void doConfigure(OutputPin newElement, IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
					super.doConfigure(newElement, monitor, info);
					newElement.setName("result");
					LiteralInteger literalInteger = UMLFactory.eINSTANCE.createLiteralInteger();
					literalInteger.setName("");
					literalInteger.setValue(1);
					newElement.setUpperBound(literalInteger);
				}
			};
			cc.compose(createResultPin);
			return cc;
		}
		return null;
	}
}
