/*****************************************************************************
 * Copyright (c) 2009-2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) - Initial API and implementation
 *  Camille Letavernier (CEA LIST) - Bug 427419: Problems with DataTypes whose properties are typed by Stereotypes
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.tools.utils;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * this class contains util methods about UML DataType
 *
 */
public class DataTypeUtil extends UMLUtil {

	/**
	 * test if the eclass is a definition of a dataType
	 *
	 * @param eclass
	 *            the eclass that will be tested
	 * @return true if this is a definition of a DataType else false
	 *
	 * @deprecated This method only works for dynamically-defined profiles. Use {@link #isDataTypeInstance(EObject)} or {@link #isDataTypeDefinition(EClass, EObject)} instead
	 */
	@Deprecated
	public static boolean isDataTypeDefinition(EClass eclass) {
		return getNamedElement(eclass) instanceof DataType;
	}

	/**
	 * test if the eclass is a definition of a dataType
	 *
	 * @param eclass
	 *            the eclass that will be tested
	 * @param context
	 *            the context is used for loading the UML profile is necessary (Especially for statically-defined profiles)
	 *            It can be the (potential) instance of the DataType, or its owner, or any other object
	 * @return true if this is a definition of a DataType else false
	 *
	 */
	public static boolean isDataTypeDefinition(EClass eClass, EObject context) {
		return getNamedElement(eClass, context) instanceof DataType;
	}

	/**
	 * test if the element is an instance of DataType
	 *
	 * @param eclass
	 *            the eclass that will be tested
	 * @param context
	 *            the context is used for loading the UML profile is necessary (Especially for statically-defined profiles)
	 *            It can be the (potential) instance of the DataType, or its owner, or any other object
	 * @return true if this is a definition of a DataType else false
	 *
	 */
	public static boolean isDataTypeInstance(EObject element) {
		EClass eClass = element.eClass();
		return isDataTypeDefinition(eClass, element);
	}

}
