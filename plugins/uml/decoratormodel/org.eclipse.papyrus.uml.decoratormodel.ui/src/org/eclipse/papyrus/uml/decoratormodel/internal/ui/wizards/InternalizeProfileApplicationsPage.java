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

package org.eclipse.papyrus.uml.decoratormodel.internal.ui.wizards;

import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.internal.ui.messages.Messages;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;

import com.google.common.collect.Lists;

/**
 * @author damus
 *
 */
public class InternalizeProfileApplicationsPage extends AbstractProfileApplicationsPage {

	public InternalizeProfileApplicationsPage() {
		super("internalize", Messages.InternalizeProfileApplicationsPage_0, null); //$NON-NLS-1$
	}

	@Override
	protected IStructuredContentProvider createProfilesContentProvider() {
		return new IStructuredContentProvider() {

			@Override
			public Object[] getElements(Object inputElement) {
				Object[] result = null;

				if (inputElement instanceof Package) {
					Package package_ = (Package) inputElement;
					List<ProfileApplication> profileApplications = Lists.newArrayList();

					for (ProfileApplication next : DecoratorModelUtils.getDecoratorModelProfileApplications(package_)) {
						Profile profile = next.getAppliedProfile();

						if ((profile != null) && !profile.eIsProxy()) {
							profileApplications.add(next);
						}
					}

					result = profileApplications.toArray();
				}

				return (result == null) ? new Object[0] : result;
			}

			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
				// Pass
			}

			@Override
			public void dispose() {
				// Pass
			}
		};
	}

}
