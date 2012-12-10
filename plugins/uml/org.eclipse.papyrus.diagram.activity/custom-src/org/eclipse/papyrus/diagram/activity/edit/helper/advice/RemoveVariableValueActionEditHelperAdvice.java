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
import org.eclipse.papyrus.diagram.activity.edit.commands.InputPinInRemoveVariableValueActionAsRemoveAtCreateCommand;
import org.eclipse.papyrus.diagram.activity.edit.commands.InputPinInRemoveVariableValueActionAsValueCreateCommand;
import org.eclipse.papyrus.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.RemoveVariableValueAction;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * Delete all incoming and outgoing edges of an activity node when this node is deleted
 * 
 * @author adaussy
 * 
 */
public class RemoveVariableValueActionEditHelperAdvice extends AbstractEditHelperAdvice {

	@Override
	protected ICommand getAfterConfigureCommand(final ConfigureRequest request) {
		EObject elementToConfigure = request.getElementToConfigure();
		if(elementToConfigure instanceof RemoveVariableValueAction) {
			RemoveVariableValueAction rmVAction = (RemoveVariableValueAction)elementToConfigure;
			CompositeTransactionalCommand cc = new CompositeTransactionalCommand(request.getEditingDomain(), "Create Remove Variable Pins");
			//Remove At pin
			CreateElementRequest createRemoveAtPinReq = new CreateElementRequest(rmVAction, UMLElementTypes.InputPin_3114);
			InputPinInRemoveVariableValueActionAsRemoveAtCreateCommand createRemoveAtPin = new InputPinInRemoveVariableValueActionAsRemoveAtCreateCommand(createRemoveAtPinReq) {

				@Override
				protected void doConfigure(InputPin newElement, IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
					super.doConfigure(newElement, monitor, info);
					newElement.setName("removeAt");
					LiteralInteger literalInteger = UMLFactory.eINSTANCE.createLiteralInteger();
					literalInteger.setName("");
					literalInteger.setValue(1);
					newElement.setUpperBound(literalInteger);
				}
			};
			cc.compose(createRemoveAtPin);
			//value pin
			CreateElementRequest createValuePinReq = new CreateElementRequest(rmVAction, UMLElementTypes.InputPin_3115);
			InputPinInRemoveVariableValueActionAsValueCreateCommand createValuePin = new InputPinInRemoveVariableValueActionAsValueCreateCommand(createValuePinReq) {

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
			return cc;
		}
		return null;
	}
}
