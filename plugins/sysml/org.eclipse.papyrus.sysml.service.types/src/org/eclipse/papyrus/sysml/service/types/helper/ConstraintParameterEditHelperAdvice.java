/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.service.types.helper;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.papyrus.sysml.constraints.ConstraintBlock;
import org.eclipse.papyrus.sysml.constraints.ConstraintProperty;
import org.eclipse.papyrus.uml.service.types.utils.NamedElementHelper;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Specific advice for Property creation owned by a {@link ConstraintBlock} ConstraintParameter are defined in ConstraintProperty but really owned by ConstraintBlock
 */
public class ConstraintParameterEditHelperAdvice extends AbstractEditHelperAdvice {

	/** root name */
	private static final String PARAMETER = "parameter";

	@Override
	public ICommand getBeforeEditCommand(IEditCommandRequest request) {
		if (request instanceof ConfigureRequest) {
			EObject elementToConfigure = ((ConfigureRequest) request).getElementToConfigure();
			if (elementToConfigure != null && elementToConfigure instanceof Property) {
				EObject container = elementToConfigure.eContainer();
				if (container != null && container instanceof Property) {
					Property constraintProperty = (Property) container;
					if (UMLUtil.getStereotypeApplication(constraintProperty, ConstraintProperty.class) != null) {
						Type type = constraintProperty.getType();
						if (type != null && type instanceof Class && UMLUtil.getStereotypeApplication(type, ConstraintBlock.class) != null) {
							((Class) type).getOwnedAttributes().add((Property) elementToConfigure);
							((Property) elementToConfigure).setAggregation(AggregationKind.COMPOSITE_LITERAL);
						}
					}
				}
			}
		}
		return super.getBeforeEditCommand(request);
	}

	@Override
	protected ICommand getBeforeConfigureCommand(final ConfigureRequest request) {
		// check this advice has to propose something. If element is not a constraint parameter, do not change the name
		EObject p = request.getElementToConfigure();
		if (p instanceof Property) {
			// check this is a constraint parameter, not another kind of property
			EObject container = ((Property) p).eContainer();
			if (container != null && container instanceof Property) {
				Property constraintProperty = (Property) container;
				if (UMLUtil.getStereotypeApplication(constraintProperty, ConstraintProperty.class) != null) {
					Type type = constraintProperty.getType();
					if (type != null && type instanceof Class && UMLUtil.getStereotypeApplication(type, ConstraintBlock.class) != null) {
						return new ConfigureElementCommand(request) {

							protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
								NamedElement element = (NamedElement) request.getElementToConfigure();
								if (element != null) {
									// Set default name
									// Initialize the element name based on the created IElementType
									String initializedName = NamedElementHelper.getDefaultNameWithIncrementFromBase(PARAMETER, element.eContainer().eContents());
									element.setName(initializedName);
								}
								return CommandResult.newOKCommandResult(element);
							}
						};
					}
				}
			}
		}
		return null;
	}
}
