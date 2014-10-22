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

package org.eclipse.papyrus.infra.extendedtypes.invariantcontainerconfiguration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * Utility class for Invariant Container rules
 */
public class InvariantContainerUtils {
	
	public static boolean isContainerValid(IElementType[] containerTypes, boolean baseIsValid, List<HierarchyPermission> permissions) {
		boolean isValid = baseIsValid;
		for (HierarchyPermission permission : permissions) {
			boolean isPermitted = permission.isIsPermitted();
			String childType = permission.getChildType();
			boolean isStrict = permission.isIsStrict();
			IElementType type = ElementTypeRegistry.getInstance().getType(childType);
			if (type != null) {
				if (isStrict) {
					if (containerTypes[0].equals(type)) {
						if (isPermitted) {
							isValid = true;
						}
					} else if (!isPermitted) {
						isValid = false;
					}
				} else {
					// not strict. The super types of typeToCreate should contain the permission type if permitted, or not contain the permission type if not permitted
					List<IElementType> allTypes = new ArrayList<IElementType>(Arrays.asList(containerTypes));
					if (allTypes.contains(type)) {
						if (isPermitted) {
							isValid = true;
						}
					} else if (!isPermitted) {
						isValid = false;
					}
				}
			}
		}
		return isValid;
	}
}
