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

package org.eclipse.papyrus.sysml.nattable.requirement.tests.paste.without.service.edit;

import java.util.List;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.papyrus.infra.emf.nattable.dataprovider.EEnumComboBoxDataProvider;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxis.IAxis;
import org.eclipse.papyrus.infra.nattable.utils.AxisUtils;
import org.eclipse.papyrus.uml.nattable.dataprovider.UMLStereotypeSingleEnumerationComboBoxDataProvider;
import org.eclipse.papyrus.uml.nattable.utils.UMLTableUtils;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author VL222926
 *
 */
public class Bug443814_Enumeration extends AbstractPasteTests {

	/**
	 * @see org.eclipse.papyrus.sysml.nattable.requirement.tests.paste.without.service.edit.AbstractPasteTests#getSourcePath()
	 *
	 * @return
	 */
	@Override
	protected String getSourcePath() {
		return "/resources/paste_tests/without_service_edit/bug443814/"; //$NON-NLS-1$
	}

	@Test
	public void availableColorTest() throws Exception {
		
		StringBuilder builder = new StringBuilder(UMLTableUtils.PROPERTY_OF_STEREOTYPE_PREFIX);
		builder.append("profile::Task::color"); //$NON-NLS-1$
		String wantedProperty = builder.toString();
		testOpenExistingTable("classTreeTable", " openTest"); //$NON-NLS-1$ //$NON-NLS-2$
		List<IAxis> iAxis = getTable().getCurrentColumnAxisProvider().getAxis();
		IAxis colorAxis = null;
		Object representedElement = null;
	
		for (IAxis current : iAxis) {
			representedElement = AxisUtils.getRepresentedElement(current);
			if (wantedProperty.equals(representedElement)){
				colorAxis = current;
				break;
			}
		}
		Assert.assertNotNull(colorAxis);
		Assert.assertNotNull(representedElement);
		
		UMLStereotypeSingleEnumerationComboBoxDataProvider provider = new UMLStereotypeSingleEnumerationComboBoxDataProvider(colorAxis, getTableManager());
		List<?> values = provider.getValues(iAxis.indexOf(colorAxis), 0);
		boolean findBlack  = false;
		boolean findRed = false;
		boolean findBlue = false;
		for(Object current : values){
			Assert.assertTrue(current instanceof EEnumLiteral);
			EEnumLiteral lit = (EEnumLiteral) current;
			if(lit.getLiteral().equals("black")){ //$NON-NLS-1$
				findBlack = true;
			}
			if(lit.getLiteral().equals("red")){ //$NON-NLS-1$
				findRed = true;
			}
			if(lit.getLiteral().equals("blue")){ //$NON-NLS-1$
				findBlue = true;
			}
		}
		
		
		Assert.assertTrue(findBlack);
		Assert.assertTrue(findRed);
		Assert.assertTrue(findBlue);
	}

	@Test
	public void availablePriorityTest() throws Exception {
		StringBuilder builder = new StringBuilder(UMLTableUtils.PROPERTY_OF_STEREOTYPE_PREFIX);
		builder.append("profile::Task::p"); //$NON-NLS-1$
		String wantedProperty = builder.toString();
		testOpenExistingTable("classTreeTable", " openTest"); //$NON-NLS-1$ //$NON-NLS-2$
		List<IAxis> iAxis = getTable().getCurrentColumnAxisProvider().getAxis();
		IAxis priorityAxis = null;
		Object representedElement = null;
	
		for (IAxis current : iAxis) {
			representedElement = AxisUtils.getRepresentedElement(current);
			if (wantedProperty.equals(representedElement)){
				priorityAxis = current;
				break;
			}
		}
		Assert.assertNotNull(priorityAxis);
		Assert.assertNotNull(representedElement);
		
		UMLStereotypeSingleEnumerationComboBoxDataProvider provider = new UMLStereotypeSingleEnumerationComboBoxDataProvider(priorityAxis, getTableManager());
		List<?> values = provider.getValues(iAxis.indexOf(priorityAxis), 0);
		boolean findHight  = false;
		boolean findMedium = false;
		boolean findLow = false;
		for(Object current : values){
			Assert.assertTrue(current instanceof EEnumLiteral);
			EEnumLiteral lit = (EEnumLiteral) current;
			if(lit.getLiteral().equals("hight")){ //$NON-NLS-1$
				findHight = true;
			}
			if(lit.getLiteral().equals("medium")){ //$NON-NLS-1$
				findMedium = true;
			}
			if(lit.getLiteral().equals("low")){ //$NON-NLS-1$
				findLow = true;
			}
		}
		
		
		Assert.assertTrue(findHight);
		Assert.assertTrue(findMedium);
		Assert.assertTrue(findLow);
	}

	@Test
	public void availableVisibilityTest() throws Exception {
		testOpenExistingTable("classTreeTable", " openTest"); //$NON-NLS-1$ //$NON-NLS-2$
		List<IAxis> iAxis = getTable().getCurrentColumnAxisProvider().getAxis();
		IAxis visibilityAxis = null;
		Object representedElement = null;
		for (IAxis current : iAxis) {
			representedElement = AxisUtils.getRepresentedElement(current);
			if (UMLPackage.eINSTANCE.getNamedElement_Visibility() == representedElement) {
				visibilityAxis = current;
				break;
			}
		}
		Assert.assertNotNull(visibilityAxis);
		Assert.assertNotNull(representedElement);
		EEnumComboBoxDataProvider provider = new EEnumComboBoxDataProvider((EEnum) UMLPackage.eINSTANCE.getNamedElement_Visibility().getEType());
		List<?> values = provider.getValues(iAxis.indexOf(visibilityAxis), 0);
		Assert.assertEquals(4, values.size());
		Assert.assertTrue(values.contains(VisibilityKind.PACKAGE_LITERAL));
		Assert.assertTrue(values.contains(VisibilityKind.PUBLIC_LITERAL));
		Assert.assertTrue(values.contains(VisibilityKind.PRIVATE_LITERAL));
		Assert.assertTrue(values.contains(VisibilityKind.PROTECTED_LITERAL));

	}

}
