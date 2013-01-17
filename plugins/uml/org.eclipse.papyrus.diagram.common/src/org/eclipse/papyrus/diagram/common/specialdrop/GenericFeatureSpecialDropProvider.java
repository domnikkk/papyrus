/*****************************************************************************
 * Copyright (c) 2013 Atos
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Mathieu Velten (Atos) mathieu.velten@atos.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.common.specialdrop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.diagram.common.commands.SetOrAddValueCommand;
import org.eclipse.uml2.uml.Element;

import com.google.common.collect.Lists;


public class GenericFeatureSpecialDropProvider implements ISpecialDropProvider {

	protected EObject getAssociatedInstance(EObject o, EStructuralFeature f) {
		EClassifier type = f.getEType();
		if (type.isInstance(o)) {
			return o;
		}
		if (o instanceof Element) {
			for (EObject application : ((Element)o).getStereotypeApplications()) {
				if (type.isInstance(application)) {
					return application;
				}
			}
		}
		return null;
	}

	public List<ICommand> getSetFeatureCommands(TransactionalEditingDomain editingDomain, EObject obj, EStructuralFeature f, List<EObject> values, String featureLabel) {
		if (f.isChangeable() && !f.isDerived() && !f.isTransient() && !f.isVolatile() && f.getEType() != null) {
			// ignore container features and invalid cardinality
			if ((f instanceof EReference && ((EReference)f).isContainer()) ||
				(!f.isMany() && values.size() > 1)) {
				return null;
			}
			List<EObject> associatedValues = Lists.newArrayList();

			for (EObject o : values) {
				EObject associatedObj = getAssociatedInstance(o, f);
				if (associatedObj != null) {
					associatedValues.add(associatedObj);
				} else {
					return null;
				}
			}

			SetRequest setReq = new SetRequest(editingDomain, obj, f, f.isMany() ? associatedValues : associatedValues.get(0));

			if (f.isMany()) {
				setReq.setLabel("Add to " + featureLabel);
			} else {
				setReq.setLabel("Assign to " + featureLabel);
			}

			return new ArrayList<ICommand>(Collections.singletonList(new SetOrAddValueCommand(setReq, true)));
		}
		return null;
	}

	public List<ICommand> getDropObjectsCommands(TransactionalEditingDomain editingDomain, EObject obj, List<Object> droppedObjs) {
		return null;
	}
}
