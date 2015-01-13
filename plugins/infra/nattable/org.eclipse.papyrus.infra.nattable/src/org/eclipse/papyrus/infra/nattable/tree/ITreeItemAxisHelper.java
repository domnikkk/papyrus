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

package org.eclipse.papyrus.infra.nattable.tree;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.GMFUnsafe;
import org.eclipse.papyrus.infra.nattable.Activator;
import org.eclipse.papyrus.infra.nattable.manager.axis.ITreeItemAxisManagerForEventList;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.EObjectTreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.NattableaxisFactory;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AxisManagerRepresentation;

/**
 * @author VL222926
 *
 */
// TODO : refactore me to use IAxisFactory ?
public class ITreeItemAxisHelper {

	private ITreeItemAxisHelper() {
		// to prevent instanciation
	}

	/**
	 *
	 * @param editingDomain
	 *            the editing domain to use to create the ITreeItemAxis
	 * @param parentAxis
	 *            the parent axis to use for the created ITreeItemAxis
	 * @param child
	 *            the object to wrap in the created ITreeItemAxis
	 * @param axisRepresentation
	 *            the axis representation of the axis manager providing its ITreeItemAxis
	 * @return
	 *         the created {@link ITreeItemAxis}
	 */
	public static ITreeItemAxis createITreeItemAxis(final TransactionalEditingDomain editingDomain, final ITreeItemAxis parentAxis, final Object child, final AxisManagerRepresentation axisRepresentation) {
		final ITreeItemAxis axis;
		if (child instanceof EObject) {
			axis = NattableaxisFactory.eINSTANCE.createEObjectTreeItemAxis();
			((EObjectTreeItemAxis) axis).setElement((EObject) child);
		} else {
			axis = null;
			throw new UnsupportedOperationException("The only managed case is EObject, others cases are not yet managed"); //$NON-NLS-1$
		}

		try {
			GMFUnsafe.write(editingDomain, new Runnable() {

				@Override
				public void run() {
					if (parentAxis != null) {
						axis.setParent(parentAxis);
					}
					axis.setManager(axisRepresentation);
				}
			});
		} catch (InterruptedException e) {
			Activator.log.error(e);
		} catch (RollbackException e) {
			Activator.log.error(e);
		}
		return axis;
	}

	/**
	 * This method to destroy an {@link ITreeItemAxis} from the model
	 *
	 * @param domain
	 *            the editing domain to use to drestoy the {@link ITreeItemAxis}
	 * @param axisToDestroy
	 *            the {@link ITreeItemAxis} to destroy
	 */
	public static void destroyITreeItemAxis(final TransactionalEditingDomain domain, final ITreeItemAxis axisToDestroy) {
		try {
			GMFUnsafe.write(domain, new Runnable() {

				@Override
				public void run() {
					axisToDestroy.setParent(null);
				}
			});
		} catch (InterruptedException e) {
			Activator.log.error(e);
		} catch (RollbackException e) {
			Activator.log.error(e);
		}
	}

	/**
	 * Does the linkage between semantic element and IAxis inside a map used by an {@link ITreeItemAxisManagerForEventList}
	 *
	 * @param managedElements
	 *            a map owning elements managed by an {@link ITreeItemAxisManagerForEventListt} : keys are semantic element and values are {@link ITreeItemAxis} representation for the semantic element
	 * @param axis
	 *            the axis
	 */
	public static final void linkITreeItemAxisToSemanticElement(final Map<Object, Set<ITreeItemAxis>> managedElements, final ITreeItemAxis axis) {
		final Object object = axis.getElement();
		Set<ITreeItemAxis> value = managedElements.get(object);
		if (value == null) {
			value = new HashSet<ITreeItemAxis>();
			managedElements.put(object, value);
		}
		value.add(axis);
	}

	/**
	 * Undoes the linkage between semantic element and IAxis inside a map used by an {@link ITreeItemAxisManagerForEventList}
	 *
	 * @param managedElements
	 *            a map owning elements managed by an {@link ITreeItemAxisManagerForEventListt} : keys are semantic element and values are {@link ITreeItemAxis} representation for the semantic element
	 * @param axis
	 *            the axis
	 */
	public static final void unlinkITreeItemAxisToSemanticElement(final Map<Object, Set<ITreeItemAxis>> managedElements, final ITreeItemAxis axis) {
		final Object element = axis.getElement();
		Set<ITreeItemAxis> values = managedElements.get(element);
		if (values != null) {
			values.remove(axis);
		}
		if (values == null || values.size() == 0) {
			managedElements.remove(element);
		}
	}
}
