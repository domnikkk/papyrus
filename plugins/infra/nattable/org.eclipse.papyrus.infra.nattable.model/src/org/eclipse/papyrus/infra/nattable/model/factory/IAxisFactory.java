/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.infra.nattable.model.factory;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EObjectTreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EStructuralFeatureAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EStructuralFeatureTreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.FeatureIdAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IdTreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.NattableaxisFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AxisManagerRepresentation;

/**
 * @author VL222926
 *
 */
public class IAxisFactory {

	/**
	 * Constructor.
	 *
	 */
	private IAxisFactory() {
		// to prevent instanciation
	}

	/**
	 *
	 * @param parent
	 *            the parent for the tree axis item
	 * @param object
	 *            the object to represent with a ITreeItemAxis
	 * @param manager
	 *            the axis manager representation for the new axis
	 * @return
	 *         the created ITreeAxisItem for the object
	 */
	public static final ITreeItemAxis createITreeItemAxis(ITreeItemAxis parent, Object object, AxisManagerRepresentation manager, String alias) {
		ITreeItemAxis createdAxis = null;

		if (object instanceof Integer || object instanceof Float || object instanceof Boolean) {
			object = object.toString();
		}
		if (object instanceof String) {
			IdTreeItemAxis newAxis = NattableaxisFactory.eINSTANCE.createIdTreeItemAxis();
			newAxis.setElement((String) object);
			createdAxis = newAxis;
		} else if (object instanceof EStructuralFeature) {
			EStructuralFeatureTreeItemAxis newAxis = NattableaxisFactory.eINSTANCE.createEStructuralFeatureTreeItemAxis();
			newAxis.setElement((EStructuralFeature) object);
			createdAxis = newAxis;
		} else if (object instanceof EObject) {
			EObjectTreeItemAxis newAxis = NattableaxisFactory.eINSTANCE.createEObjectTreeItemAxis();
			newAxis.setElement((EObject) object);
			createdAxis = newAxis;
		}

		if (createdAxis == null) {
			throw new UnsupportedOperationException(NLS.bind("The creation for {0} is not yet implemented", object)); //$NON-NLS-1$
		} else {
			createdAxis.setParent(parent);
			createdAxis.setManager(manager);
			createdAxis.setAlias(alias);
		}
		return createdAxis;
	}

	/**
	 *
	 * @param object
	 *            an object representing a feature
	 * @return
	 *         a feature axis to represent it
	 */
	public static final FeatureAxis createAxisForFeature(Object object, AxisManagerRepresentation manager, String alias) {
		if (object instanceof String) {
			FeatureIdAxis axis = NattableaxisFactory.eINSTANCE.createFeatureIdAxis();
			axis.setElement((String) object);
			return axis;
		}
		if (object instanceof EStructuralFeature) {
			EStructuralFeatureAxis axis = NattableaxisFactory.eINSTANCE.createEStructuralFeatureAxis();
			axis.setElement((EStructuralFeature) object);
			return axis;
		}
		throw new UnsupportedOperationException(NLS.bind("The creation for {0} is not yet implemented", object)); //$NON-NLS-1$
	}
}
