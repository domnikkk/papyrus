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

package org.eclipse.papyrus.infra.nattable.tests.tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.papyrus.infra.nattable.utils.PasteTreeUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author VL222926
 *
 */
public class PasteTreeUtils_Tests {


	// ----------------- tests with a configuration for the 0 level
	@Test
	public void getDepth_H1_H1_H1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		hiddenColumns.add(Integer.valueOf(0));
		hiddenColumns.add(Integer.valueOf(1));
		hiddenColumns.add(Integer.valueOf(2));
		int maxDepth = 2; // because we start to depth=0;
		Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		resultMap.put(Integer.valueOf(0), Integer.valueOf(0));
		resultMap.put(Integer.valueOf(1), Integer.valueOf(1));
		resultMap.put(Integer.valueOf(2), Integer.valueOf(2));
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {// because read char start to 1
			int result = PasteTreeUtils.getDepth(i, maxDepth, hiddenColumns, true);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)).intValue(), result);
		}
	}

	@Test
	public void getDepth_H1_H1_V1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		hiddenColumns.add(Integer.valueOf(0));
		hiddenColumns.add(Integer.valueOf(1));
		int maxDepth = 2;
		Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		resultMap.put(Integer.valueOf(0), Integer.valueOf(0));
		resultMap.put(Integer.valueOf(1), Integer.valueOf(1));
		resultMap.put(Integer.valueOf(2), Integer.valueOf(2));
		resultMap.put(Integer.valueOf(3), Integer.valueOf(2));
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {
			int result = PasteTreeUtils.getDepth(i, maxDepth, hiddenColumns, true);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)).intValue(), result);
		}
	}

	@Test
	public void getDepth_H1_V1_H1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		hiddenColumns.add(Integer.valueOf(0));
		hiddenColumns.add(Integer.valueOf(2));
		int maxDepth = 2;
		Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		resultMap.put(Integer.valueOf(0), Integer.valueOf(0));
		resultMap.put(Integer.valueOf(1), Integer.valueOf(1));
		resultMap.put(Integer.valueOf(2), Integer.valueOf(1));
		resultMap.put(Integer.valueOf(3), Integer.valueOf(2));
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {
			int result = PasteTreeUtils.getDepth(i, maxDepth, hiddenColumns, true);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)).intValue(), result);
		}
	}

	@Test
	public void getDepth_H1_V1_V1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		hiddenColumns.add(Integer.valueOf(0));
		int maxDepth = 2;
		Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		resultMap.put(Integer.valueOf(0), Integer.valueOf(0));
		resultMap.put(Integer.valueOf(1), Integer.valueOf(1));
		resultMap.put(Integer.valueOf(2), Integer.valueOf(1));
		resultMap.put(Integer.valueOf(3), Integer.valueOf(2));
		resultMap.put(Integer.valueOf(4), Integer.valueOf(2));
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {
			int result = PasteTreeUtils.getDepth(i, maxDepth, hiddenColumns, true);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)).intValue(), result);
		}
	}

	@Test
	public void getDepth_V1_H1_H1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		hiddenColumns.add(Integer.valueOf(1));
		hiddenColumns.add(Integer.valueOf(2));
		int maxDepth = 2;
		Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		resultMap.put(Integer.valueOf(0), Integer.valueOf(0));
		resultMap.put(Integer.valueOf(1), Integer.valueOf(0));
		resultMap.put(Integer.valueOf(2), Integer.valueOf(1));
		resultMap.put(Integer.valueOf(3), Integer.valueOf(2));
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {
			int result = PasteTreeUtils.getDepth(i, maxDepth, hiddenColumns, true);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)).intValue(), result);
		}
	}

	@Test
	public void getDepth_V1_H1_V1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		hiddenColumns.add(Integer.valueOf(1));
		int maxDepth = 2;
		Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		resultMap.put(Integer.valueOf(0), Integer.valueOf(0));
		resultMap.put(Integer.valueOf(1), Integer.valueOf(0));
		resultMap.put(Integer.valueOf(2), Integer.valueOf(1));
		resultMap.put(Integer.valueOf(3), Integer.valueOf(2));
		resultMap.put(Integer.valueOf(4), Integer.valueOf(2));
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {
			int result = PasteTreeUtils.getDepth(i, maxDepth, hiddenColumns, true);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)).intValue(), result);
		}
	}

	@Test
	public void getDepth_V1_V1_H1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		hiddenColumns.add(Integer.valueOf(2));
		int maxDepth = 2;
		Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		resultMap.put(Integer.valueOf(0), Integer.valueOf(0));
		resultMap.put(Integer.valueOf(1), Integer.valueOf(0));
		resultMap.put(Integer.valueOf(2), Integer.valueOf(1));
		resultMap.put(Integer.valueOf(3), Integer.valueOf(1));
		resultMap.put(Integer.valueOf(4), Integer.valueOf(2));
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {
			int result = PasteTreeUtils.getDepth(i, maxDepth, hiddenColumns, true);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)).intValue(), result);
		}
	}

	@Test
	public void getDepth_V1_V1_V1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		int maxDepth = 2;
		Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		resultMap.put(Integer.valueOf(0), Integer.valueOf(0));
		resultMap.put(Integer.valueOf(1), Integer.valueOf(0));
		resultMap.put(Integer.valueOf(2), Integer.valueOf(1));
		resultMap.put(Integer.valueOf(3), Integer.valueOf(1));
		resultMap.put(Integer.valueOf(4), Integer.valueOf(2));
		resultMap.put(Integer.valueOf(5), Integer.valueOf(2));
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {
			int result = PasteTreeUtils.getDepth(i, maxDepth, hiddenColumns, true);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)).intValue(), result);
		}
	}

	// tests with no configuration for the 0 level
	@Test
	public void getDepth_Empty_H1_H1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		hiddenColumns.add(Integer.valueOf(1));
		hiddenColumns.add(Integer.valueOf(2));
		int maxDepth = 2; // because we start to depth=0;
		Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		resultMap.put(Integer.valueOf(0), Integer.valueOf(0));
		resultMap.put(Integer.valueOf(1), Integer.valueOf(1));
		resultMap.put(Integer.valueOf(2), Integer.valueOf(2));
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {// because read char start to 1
			int result = PasteTreeUtils.getDepth(i, maxDepth, hiddenColumns, false);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)).intValue(), result);
		}
	}

	@Test
	public void getDepth_Empty_H1_V1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		hiddenColumns.add(Integer.valueOf(1));
		int maxDepth = 2;
		Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		resultMap.put(Integer.valueOf(0), Integer.valueOf(0));
		resultMap.put(Integer.valueOf(1), Integer.valueOf(1));
		resultMap.put(Integer.valueOf(2), Integer.valueOf(2));
		resultMap.put(Integer.valueOf(3), Integer.valueOf(2));
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {
			int result = PasteTreeUtils.getDepth(i, maxDepth, hiddenColumns, false);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)).intValue(), result);
		}
	}

	@Test
	public void getDepth_Empty_V1_H1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		hiddenColumns.add(Integer.valueOf(2));
		int maxDepth = 2;
		Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		resultMap.put(Integer.valueOf(0), Integer.valueOf(0));
		resultMap.put(Integer.valueOf(1), Integer.valueOf(1));
		resultMap.put(Integer.valueOf(2), Integer.valueOf(1));
		resultMap.put(Integer.valueOf(3), Integer.valueOf(2));
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {
			int result = PasteTreeUtils.getDepth(i, maxDepth, hiddenColumns, false);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)).intValue(), result);
		}
	}

	@Test
	public void getDepth_Empty_V1_V1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		int maxDepth = 2;
		Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		resultMap.put(Integer.valueOf(0), Integer.valueOf(0));
		resultMap.put(Integer.valueOf(1), Integer.valueOf(1));
		resultMap.put(Integer.valueOf(2), Integer.valueOf(1));
		resultMap.put(Integer.valueOf(3), Integer.valueOf(2));
		resultMap.put(Integer.valueOf(4), Integer.valueOf(2));
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {
			int result = PasteTreeUtils.getDepth(i, maxDepth, hiddenColumns, false);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)).intValue(), result);
		}
	}


	// ----------------- tests with a configuration for the 0 level
	@Test
	public void isCategory_H1_H1_H1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		hiddenColumns.add(Integer.valueOf(0));
		hiddenColumns.add(Integer.valueOf(1));
		hiddenColumns.add(Integer.valueOf(2));
		int maxDepth = 2; // because we start to depth=0;
		Map<Integer, Boolean> resultMap = new HashMap<Integer, Boolean>();
		resultMap.put(Integer.valueOf(0), Boolean.FALSE);
		resultMap.put(Integer.valueOf(1),Boolean.FALSE);
		resultMap.put(Integer.valueOf(2), Boolean.FALSE);
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {// because read char start to 1
			boolean result = PasteTreeUtils.isCategory(i, maxDepth, hiddenColumns, true);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)), Boolean.valueOf(result));
		}
	}

	@Test
	public void isCategory_H1_H1_V1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		hiddenColumns.add(Integer.valueOf(0));
		hiddenColumns.add(Integer.valueOf(1));
		int maxDepth = 2;
		Map<Integer, Boolean> resultMap = new HashMap<Integer, Boolean>();
		resultMap.put(Integer.valueOf(0), Boolean.FALSE);
		resultMap.put(Integer.valueOf(1), Boolean.FALSE);
		resultMap.put(Integer.valueOf(2), Boolean.TRUE);
		resultMap.put(Integer.valueOf(3), Boolean.FALSE);
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {
			boolean result = PasteTreeUtils.isCategory(i, maxDepth, hiddenColumns, true);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)), Boolean.valueOf(result));
		}
	}

	@Test
	public void isCategory_H1_V1_H1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		hiddenColumns.add(Integer.valueOf(0));
		hiddenColumns.add(Integer.valueOf(2));
		int maxDepth = 2;
		Map<Integer, Boolean> resultMap = new HashMap<Integer, Boolean>();
		resultMap.put(Integer.valueOf(0), Boolean.FALSE);
		resultMap.put(Integer.valueOf(1), Boolean.TRUE);
		resultMap.put(Integer.valueOf(2), Boolean.FALSE);
		resultMap.put(Integer.valueOf(3), Boolean.FALSE);
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {
			boolean result = PasteTreeUtils.isCategory(i, maxDepth, hiddenColumns, true);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)), Boolean.valueOf(result));
		}
	}

	@Test
	public void isCategory_H1_V1_V1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		hiddenColumns.add(Integer.valueOf(0));
		int maxDepth = 2;
		Map<Integer, Boolean> resultMap = new HashMap<Integer, Boolean>();
		resultMap.put(Integer.valueOf(0), Boolean.FALSE);
		resultMap.put(Integer.valueOf(1), Boolean.TRUE);
		resultMap.put(Integer.valueOf(2), Boolean.FALSE);
		resultMap.put(Integer.valueOf(3), Boolean.TRUE);
		resultMap.put(Integer.valueOf(4), Boolean.FALSE);
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {
			boolean result = PasteTreeUtils.isCategory(i, maxDepth, hiddenColumns, true);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)), Boolean.valueOf(result));
		}
	}

	@Test
	public void isCategory_V1_H1_H1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		hiddenColumns.add(Integer.valueOf(1));
		hiddenColumns.add(Integer.valueOf(2));
		int maxDepth = 2;
		Map<Integer, Boolean> resultMap = new HashMap<Integer, Boolean>();
		resultMap.put(Integer.valueOf(0), Boolean.TRUE);
		resultMap.put(Integer.valueOf(1), Boolean.FALSE);
		resultMap.put(Integer.valueOf(2), Boolean.FALSE);
		resultMap.put(Integer.valueOf(3), Boolean.FALSE);
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {
			boolean result = PasteTreeUtils.isCategory(i, maxDepth, hiddenColumns, true);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)), Boolean.valueOf(result));
		}
	}

	@Test
	public void isCategory_V1_H1_V1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		hiddenColumns.add(Integer.valueOf(1));
		int maxDepth = 2;
		Map<Integer, Boolean> resultMap = new HashMap<Integer, Boolean>();
		resultMap.put(Integer.valueOf(0), Boolean.TRUE);
		resultMap.put(Integer.valueOf(1), Boolean.FALSE);
		resultMap.put(Integer.valueOf(2), Boolean.FALSE);
		resultMap.put(Integer.valueOf(3), Boolean.TRUE);
		resultMap.put(Integer.valueOf(4), Boolean.FALSE);
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {
			boolean result = PasteTreeUtils.isCategory(i, maxDepth, hiddenColumns, true);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)), Boolean.valueOf(result));
		}
	}

	@Test
	public void isCategory_V1_V1_H1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		hiddenColumns.add(Integer.valueOf(2));
		int maxDepth = 2;
		Map<Integer, Boolean> resultMap = new HashMap<Integer, Boolean>();
		resultMap.put(Integer.valueOf(0), Boolean.TRUE);
		resultMap.put(Integer.valueOf(1), Boolean.FALSE);
		resultMap.put(Integer.valueOf(2), Boolean.TRUE);
		resultMap.put(Integer.valueOf(3), Boolean.FALSE);
		resultMap.put(Integer.valueOf(4), Boolean.FALSE);
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {
			boolean result = PasteTreeUtils.isCategory(i, maxDepth, hiddenColumns, true);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)), Boolean.valueOf(result));
		}
	}

	@Test
	public void isCategory_V1_V1_V1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		int maxDepth = 2;
		Map<Integer, Boolean> resultMap = new HashMap<Integer, Boolean>();
		resultMap.put(Integer.valueOf(0), Boolean.TRUE);
		resultMap.put(Integer.valueOf(1), Boolean.FALSE);
		resultMap.put(Integer.valueOf(2), Boolean.TRUE);
		resultMap.put(Integer.valueOf(3), Boolean.FALSE);
		resultMap.put(Integer.valueOf(4), Boolean.TRUE);
		resultMap.put(Integer.valueOf(5), Boolean.FALSE);
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {
			boolean result = PasteTreeUtils.isCategory(i, maxDepth, hiddenColumns, true);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)), Boolean.valueOf(result));
		}
	}

	// tests with no configuration for the 0 level
	@Test
	public void isCategory_Empty_H1_H1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		hiddenColumns.add(Integer.valueOf(1));
		hiddenColumns.add(Integer.valueOf(2));
		int maxDepth = 2; // because we start to depth=0;
		Map<Integer, Boolean> resultMap = new HashMap<Integer, Boolean>();
		resultMap.put(Integer.valueOf(0), Boolean.FALSE);
		resultMap.put(Integer.valueOf(1), Boolean.FALSE);
		resultMap.put(Integer.valueOf(2), Boolean.FALSE);
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {// because read char start to 1
			boolean result = PasteTreeUtils.isCategory(i, maxDepth, hiddenColumns, false);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)), Boolean.valueOf(result));
		}
	}

	@Test
	public void isCategory_Empty_H1_V1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		hiddenColumns.add(Integer.valueOf(1));
		int maxDepth = 2;
		Map<Integer, Boolean> resultMap = new HashMap<Integer, Boolean>();
		resultMap.put(Integer.valueOf(0), Boolean.FALSE);
		resultMap.put(Integer.valueOf(1), Boolean.FALSE);
		resultMap.put(Integer.valueOf(2), Boolean.TRUE);
		resultMap.put(Integer.valueOf(3), Boolean.FALSE);
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {
			boolean result = PasteTreeUtils.isCategory(i, maxDepth, hiddenColumns, false);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)), Boolean.valueOf(result));
		}
	}

	@Test
	public void isCategory_Empty_V1_H1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		hiddenColumns.add(Integer.valueOf(2));
		int maxDepth = 2;
		Map<Integer, Boolean> resultMap = new HashMap<Integer, Boolean>();
		resultMap.put(Integer.valueOf(0), Boolean.FALSE);
		resultMap.put(Integer.valueOf(1), Boolean.TRUE);
		resultMap.put(Integer.valueOf(2), Boolean.FALSE);
		resultMap.put(Integer.valueOf(3), Boolean.FALSE);
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {
			boolean result = PasteTreeUtils.isCategory(i, maxDepth, hiddenColumns, false);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)), Boolean.valueOf(result));
		}
	}

	@Test
	public void isCategory_Empty_V1_V1_Test() {
		List<Integer> hiddenColumns = new ArrayList<Integer>();
		int maxDepth = 2;
		Map<Integer, Boolean> resultMap = new HashMap<Integer, Boolean>();
		resultMap.put(Integer.valueOf(0), Boolean.FALSE);
		resultMap.put(Integer.valueOf(1), Boolean.TRUE);
		resultMap.put(Integer.valueOf(2), Boolean.FALSE);
		resultMap.put(Integer.valueOf(3), Boolean.TRUE);
		resultMap.put(Integer.valueOf(4), Boolean.FALSE);
		int nbColumns = resultMap.size();
		for (int i = 1; i <= nbColumns; i++) {
			boolean result = PasteTreeUtils.isCategory(i, maxDepth, hiddenColumns, false);
			Assert.assertEquals(resultMap.get(Integer.valueOf(i - 1)), Boolean.valueOf(result));
		}
	}


}
