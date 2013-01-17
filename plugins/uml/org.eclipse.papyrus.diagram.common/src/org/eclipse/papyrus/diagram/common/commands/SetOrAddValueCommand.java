/******************************************************************************
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 *    Mathieu Velten (Atos) mathieu.velten@atos.net
 ****************************************************************************/

package org.eclipse.papyrus.diagram.common.commands;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;

/**
 * Copy-paste of SetValueCommand (thanks to the private final fields...)
 * to handle the case when we want to add the values instead of replacing them
 * in multi valuable feature
 * 
 * @author mvelten
 *
 */
public class SetOrAddValueCommand extends EditElementCommand {
	
	protected boolean addIfMany;
	
	/**
	 * The feature whose value should be set.
	 */
	protected EStructuralFeature feature;

	/**
	 * The new value.
	 */
	protected Object value;


	/**
	 * Constructs a new command to set the value of a feature of a model
	 * element.
	 * 
	 * @param request
	 *            the set value request
	 */
	public SetOrAddValueCommand(SetRequest request, boolean addIfMany) {
		super(request.getLabel(), request.getElementToEdit(), request);

		this.feature = request.getFeature();
		this.value = request.getValue();
		this.addIfMany = addIfMany;
	}

	public SetOrAddValueCommand(SetRequest request) {
		this(request, false);
	}

	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
	    throws ExecutionException {

        EObject elementToEdit = getElementToEdit();
        boolean many = FeatureMapUtil.isMany(elementToEdit,feature);
        if (many) {
            Collection collection = ((Collection)elementToEdit.eGet(feature));
            if (value instanceof List){
                List values = (List)value;
                if (!addIfMany) {
                	collection.clear();
                }
                collection.addAll(values);
            }else {
                collection.add(value);
            }
        } else {
            getElementToEdit().eSet(feature, value);
        }
        return CommandResult.newOKCommandResult();
	}

    /**
     * Checks that the feature is a modifiable feature of the element whose
     * value will be set by this command. Also checks that the new value is of
     * the correct type for the feature.
     */
    public boolean canExecute() {
        EObject elementToEdit = getElementToEdit();
        if (elementToEdit == null || !super.canExecute()) {
            return false;
        }
        boolean many = FeatureMapUtil.isMany(elementToEdit, feature);
        if (value == null && many) {
            return false;
        }
        List allFeatures = getElementToEdit().eClass()
            .getEAllStructuralFeatures();
        if (allFeatures.contains(feature) && feature.isChangeable()){
            if (!many && (value==null || feature.getEType().isInstance(value)))
                return true;
            else {
                return verifyMany();
            }
        }
        return false;
    }

    protected boolean verifyMany() {
        if (value instanceof List){
            List values = (List)value;
            for (Iterator iter = values.iterator(); iter.hasNext();) {
                Object element = iter.next();
                if (!feature.getEType().isInstance(element))
                    return false;
            }
            return true;
        }
        return feature.getEType().isInstance(value);
    }
}
