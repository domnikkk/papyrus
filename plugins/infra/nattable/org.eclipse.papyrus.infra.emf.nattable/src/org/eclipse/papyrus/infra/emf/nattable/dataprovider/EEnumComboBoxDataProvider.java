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

package org.eclipse.papyrus.infra.emf.nattable.dataprovider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.nebula.widgets.nattable.edit.editor.IComboBoxDataProvider;
import org.eclipse.papyrus.infra.nattable.utils.AxisUtils;

/**
 * @author VL222926
 *
 */
public class EEnumComboBoxDataProvider implements IComboBoxDataProvider {

	/**
	 * the enumeration for which we want the literals
	 */
	private final EEnum eenum;

	/**
	 *
	 * Constructor.
	 *
	 * @param eenum
	 *            the enumeration for which we want the literals
	 */
	public EEnumComboBoxDataProvider(EEnum eenum) {
		this.eenum = eenum;
	}

	/**
	 * Constructor.
	 *
	 */
	public EEnumComboBoxDataProvider(Object axisElement) {
		Object object = AxisUtils.getRepresentedElement(axisElement);
		Assert.isTrue(object instanceof EStructuralFeature);
		EStructuralFeature feature = (EStructuralFeature) object;
		EClassifier type = feature.getEType();
		Assert.isTrue(type instanceof EEnum);
		this.eenum = (EEnum) type;
	}

	/**
	 *
	 * @see org.eclipse.nebula.widgets.nattable.edit.editor.IComboBoxDataProvider#getValues(int, int)
	 *
	 * @param columnIndex
	 * @param rowIndex
	 * @return
	 */
	@Override
	public List<?> getValues(int columnIndex, int rowIndex) {
		final List<Object> literals = new ArrayList<Object>();
		for (final EEnumLiteral instances : this.eenum.getELiterals()) {
			literals.add(instances.getInstance());
		}
		return literals;
	}
}
