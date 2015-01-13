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

package org.eclipse.papyrus.uml.nattable.provider;

import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.ITreeItemAxis;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TreeFillingConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattablelabelprovider.ILabelProviderConfiguration;
import org.eclipse.papyrus.infra.nattable.utils.AxisUtils;
import org.eclipse.papyrus.infra.nattable.utils.ILabelProviderContextElementWrapper;
import org.eclipse.papyrus.infra.nattable.utils.LabelProviderCellContextElementWrapper;
import org.eclipse.papyrus.uml.nattable.utils.UMLTableUtils;

/**
 * @author VL222926
 *
 */
public class TreeFillingStereotypePropertyLabelProvider extends StereotypePropertyHeaderLabelProvider {

	/**
	 * @see org.eclipse.papyrus.uml.nattable.provider.StereotypePropertyHeaderLabelProvider#accept(java.lang.Object)
	 *
	 * @param element
	 * @return
	 */
	@Override
	public boolean accept(Object element) {
		if (element instanceof ILabelProviderContextElementWrapper) {
			final Object object = ((ILabelProviderContextElementWrapper) element).getObject();
			if (object instanceof ITreeItemAxis) {
				ITreeItemAxis curr = (ITreeItemAxis) object;
				Object el = curr.getElement();
				if (el instanceof TreeFillingConfiguration) {
					final IAxis axis =((TreeFillingConfiguration) el).getAxisUsedAsAxisProvider();
					String id = AxisUtils.getPropertyId(axis);
					return (id != null && id.startsWith(UMLTableUtils.PROPERTY_OF_STEREOTYPE_PREFIX));
				}
			}
		}
		return false;
	}
	
	/**
	 * @see org.eclipse.papyrus.infra.nattable.provider.AbstractNattableCellLabelProvider#getLabelConfiguration(org.eclipse.papyrus.infra.nattable.utils.LabelProviderCellContextElementWrapper)
	 *
	 * @param element
	 * @return
	 */
	@Override
	protected ILabelProviderConfiguration getLabelConfiguration(LabelProviderCellContextElementWrapper element) {
		if (element instanceof ILabelProviderContextElementWrapper) {
			final Object object = ((ILabelProviderContextElementWrapper) element).getObject();
			if (object instanceof IAxis && ((IAxis)object).getElement() instanceof TreeFillingConfiguration) {
				return ((TreeFillingConfiguration) ((IAxis)object).getElement()).getLabelProvider();
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @param wrapper
	 * @return
	 *         the wrapped value to use to calculate the label
	 */
	@Override
	protected Object getWrappedValue(final ILabelProviderContextElementWrapper wrapper) {
		Object value = wrapper.getObject();
		if (value instanceof IAxis && ((IAxis)value).getElement() instanceof TreeFillingConfiguration) {
			return ((TreeFillingConfiguration) ((IAxis)value).getElement()).getAxisUsedAsAxisProvider();
		}
		return super.getWrappedValue(wrapper);
	}
}
