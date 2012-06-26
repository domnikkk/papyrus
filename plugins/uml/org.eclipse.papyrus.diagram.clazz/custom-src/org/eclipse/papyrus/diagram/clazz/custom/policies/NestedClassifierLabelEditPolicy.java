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
package org.eclipse.papyrus.diagram.clazz.custom.policies;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.papyrus.diagram.clazz.custom.preferences.IPapyrusClassifierPreferencesConstant;
import org.eclipse.papyrus.diagram.clazz.part.UMLDiagramEditorPlugin;
import org.eclipse.papyrus.diagram.common.editpolicies.AbstractMaskManagedEditPolicy;
import org.eclipse.papyrus.diagram.common.helper.ClassifierLabelHelper;
import org.eclipse.papyrus.umlutils.ICustomAppearence;
import org.eclipse.papyrus.umlutils.ui.VisualInformationPapyrusConstant;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Operation;


public class NestedClassifierLabelEditPolicy extends AbstractMaskManagedEditPolicy {

	
	public String getMaskLabel(int value) {
		return ClassifierLabelHelper.getInstance().getMaskLabel(value);
	}

	public Collection<String> getMaskLabels() {
		return ClassifierLabelHelper.getInstance().getMaskLabels();
	}

	public Collection<Integer> getMaskValues() {
		return ClassifierLabelHelper.getInstance().getMaskValues();
	}

	public Map<Integer, String> getMasks() {
		return ClassifierLabelHelper.getInstance().getMasks();
	}
	
	
	
	

	@Override
	public void notifyChanged(Notification notification) {
		Object object = notification.getNotifier();
		Element element = getUMLElement();

		if(object == null) {
			return;
		}

		if(object.equals(element)) {
			refreshDisplay();
		}
		super.notifyChanged(notification);
	}

	public int getCurrentDisplayValue() {
		EAnnotation classifierDisplay = ((View)getHost().getModel()).getEAnnotation(VisualInformationPapyrusConstant.CUSTOM_APPEARENCE_ANNOTATION);
		int displayValue = getDefaultDisplayValue();
		if(classifierDisplay != null) {
			displayValue = Integer.parseInt(classifierDisplay.getDetails().get(VisualInformationPapyrusConstant.CUSTOM_APPEARANCE_MASK_VALUE));
		} else {
			// no specific information => look in preferences
			IPreferenceStore store = UMLDiagramEditorPlugin.getInstance().getPreferenceStore();
			int displayValueTemp = store.getInt(IPapyrusClassifierPreferencesConstant.CLASSIFIER_LABEL_DISPLAY_PREFERENCE);
			if(displayValueTemp != 0) {
				displayValue = displayValueTemp;
			}
		}
		return displayValue;
	}

	public int getDefaultDisplayValue() {
		return ICustomAppearence.DEFAULT_UML_CLASSIFIER;
	}

	public String getPreferencePageID() {
		return "org.eclipse.papyrus.diagram.clazz.custom.preferences.ClassifierPreferencePage";
	}
	

	@Override
	public void refreshDisplay() {
		// calls the helper for this edit Part
		ClassifierLabelHelper.getInstance().refreshEditPartDisplay((GraphicalEditPart)getHost());
	}
}
