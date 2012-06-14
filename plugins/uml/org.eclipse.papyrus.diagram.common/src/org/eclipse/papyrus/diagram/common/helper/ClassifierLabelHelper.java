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
 *   Arthur Daussy  -382605: 382610: [ClassDiagram] Display  stereotype and Mask for nested classifier label
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.common.helper;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.common.editpolicies.IMaskManagedLabelEditPolicy;
import org.eclipse.papyrus.umlutils.ClassifierUtils;
import org.eclipse.papyrus.umlutils.ICustomAppearence;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;


public class ClassifierLabelHelper extends StereotypedElementLabelHelper {

	
	 protected ClassifierLabelHelper() {
			// initialize the map
			masks.put(ICustomAppearence.DISP_VISIBILITY, "Visibility");
			masks.put(ICustomAppearence.DISP_NAME, "Name");
	}
	 
	 private static class SingletonHolder {
		 private static ClassifierLabelHelper INSTANCE = new ClassifierLabelHelper();
	 }
	 
	 public static ClassifierLabelHelper getInstance(){
		 return SingletonHolder.INSTANCE;
	 }
	 
		/** Map for masks */
	protected final Map<Integer, String> masks = new HashMap<Integer, String>(7);
	
	@Override
	protected String elementLabel(GraphicalEditPart editPart) {
		int displayValue = ICustomAppearence.DEFAULT_UML_CLASSIFIER;

		IMaskManagedLabelEditPolicy policy = (IMaskManagedLabelEditPolicy)editPart.getEditPolicy(IMaskManagedLabelEditPolicy.MASK_MANAGED_LABEL_EDIT_POLICY);
		if(policy != null) {
			displayValue = policy.getCurrentDisplayValue();
		}
		Classifier elem = getUMLElement(editPart);
		if(elem != null) {
			return ClassifierUtils.getCustomLabel(elem, displayValue);
		}
		return "";
	}
	
	/**
	 * {@inheritDoc}
	 */
	public Classifier getUMLElement(GraphicalEditPart editPart) {
		if(editPart.getModel() instanceof View) {
			View view = (View)editPart.getModel();
			if(view.getElement() instanceof Classifier) {
				return (Classifier)view.getElement();
			}
		}
		return null;
	}
	
	/**
	 * Returns the mask name given the value of the mask
	 * 
	 * @return the mask name or <code>null</code> if no masks has been found
	 */
	public String getMaskLabel(int value) {
		return masks.get(value);
	}

	/**
	 * Returns the collection of mask names
	 * 
	 * @return the collection of mask names
	 */
	public Collection<String> getMaskLabels() {
		return masks.values();
	}

	/**
	 * Returns the map of masks used to display a {@link Property}
	 * 
	 * @return the {@link Map} of masks used to display a {@link Property}
	 */
	public Map<Integer, String> getMasks() {
		return masks;
	}

	/**
	 * Returns the collection of mask values
	 * 
	 * @return the collection of mask values
	 */
	public Set<Integer> getMaskValues() {
		return masks.keySet();
	}
	
}
