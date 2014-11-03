/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.decoratormodel.internal.expressions;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;

/**
 * A core-expressions property tester for {@link IFile}s.
 */
public class FilePropertyTester extends PropertyTester {
	public static final String PROPERTY_IS_DECORATOR_MODEL = "isDecoratorModel"; //$NON-NLS-1$

	public FilePropertyTester() {
		super();
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		boolean result = false;
		if (receiver instanceof IFile) {
			IFile file = (IFile) receiver;

			if (PROPERTY_IS_DECORATOR_MODEL.equals(property)) {
				result = expectBoolean(expectedValue) == isDecoratorModel(file);
			}
		}

		return result;
	}

	private static boolean expectBoolean(Object expectedValue) {
		return (expectedValue == null) || ((expectedValue instanceof Boolean) && ((Boolean) expectedValue).booleanValue());
	}

	boolean isDecoratorModel(IFile file) {
		URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		return DecoratorModelUtils.isDecoratorModel(uri);
	}

}
