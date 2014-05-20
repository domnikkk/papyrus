/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.junit.utils;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.core.resource.AbstractBaseModel;
import org.eclipse.papyrus.infra.core.resource.IModel;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationModel;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.junit.Assert;

/**
 * Utility class for diagrams
 */
public class TableUtils {

	/**
	 * Return the first table found with the specified name
	 * @param modelSet
	 * @param tableName
	 * @return
	 */
	public static Table getNotationFirstTable(ModelSet modelSet, String tableName) {
		IModel notationModel = modelSet.getModel(NotationModel.MODEL_ID);

		AbstractBaseModel notationBaseModel = null;
		if (notationModel instanceof AbstractBaseModel) {
			notationBaseModel = (AbstractBaseModel) notationModel;
		} else {
			Assert.fail("notation model is not an abstract base model");
			return null;
		}
		Assert.assertTrue("notation resource contains nothing", notationBaseModel.getResource().getContents().size() >= 1);
		for (EObject eObject : notationBaseModel.getResource().getContents()) {
			if (eObject instanceof Table && tableName.equals(((Table) eObject).getName())) {
				return (Table) eObject;
			}
		}
		return null;
	}

	/**
	 * Return the all tables found with the specified name
	 * @param modelSet
	 * @param tableName
	 * @return
	 */
	public static Collection<Table> getAllNotationTable(ModelSet modelSet, String tableName) {
		IModel notationModel = modelSet.getModel(NotationModel.MODEL_ID);
		Collection<Table> tableList = new ArrayList<Table>();
		AbstractBaseModel notationBaseModel = null;
		if (notationModel instanceof AbstractBaseModel) {
			notationBaseModel = (AbstractBaseModel) notationModel;
		} else {
			Assert.fail("notation model is not an abstract base model");
			return null;
		}
		Assert.assertTrue("notation resource contains nothing", notationBaseModel.getResource().getContents().size() >= 1);
		for (EObject eObject : notationBaseModel.getResource().getContents()) {
			if (eObject instanceof Table && tableName.equals(((Table) eObject).getName())) {
				tableList.add((Table) eObject);
			}
		}
		return tableList;
	}

}
