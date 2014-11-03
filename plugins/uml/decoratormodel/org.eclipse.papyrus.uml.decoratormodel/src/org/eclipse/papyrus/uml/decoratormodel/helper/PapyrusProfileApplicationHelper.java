/*****************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST, Christian W. Damus, and others.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) - Initial API and implementation
 *  Christian W. Damus - bug 399859
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.decoratormodel.helper;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.util.UMLUtil.ProfileApplicationHelper;

import com.google.common.collect.Iterables;


/**
 * Extended profile application helper for Papyrus tool.
 * <P>
 * When this helper is activated, profiles are located in external resources
 * </P>
 */
public class PapyrusProfileApplicationHelper extends ProfileApplicationHelper {

	@Override
	public Iterable<Package> getOtherApplyingPackages(Package package_) {
		Iterable<Package> result = super.getOtherApplyingPackages(package_);
		Set<Package> combined = null;

		for (Package parent : Iterables.concat(Collections.singleton(package_), result)) {
			Iterator<Package> externalized = DecoratorModelUtils.getDecoratorPackages(parent).iterator();
			if (externalized.hasNext()) {
				if (combined == null) {
					combined = new LinkedHashSet<Package>();

					Iterables.addAll(combined, result);
				}

				while (externalized.hasNext()) {
					combined.add(externalized.next());
				}
			}
		}

		if (combined != null) {
			result = combined;
		}

		return result;
	}
}
