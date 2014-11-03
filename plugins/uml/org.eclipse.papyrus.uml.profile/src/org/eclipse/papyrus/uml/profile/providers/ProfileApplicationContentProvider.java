/*****************************************************************************
 * Copyright (c) 2012, 2014 CEA LIST, Christian W. Damus, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Gabriel Pascual	(ALL4TEC) gabriel.pascual@all4tec.net	- Initial API and implementation
 *  Christian W. Damus - bug 399859
 *  
 *****************************************************************************/
package org.eclipse.papyrus.uml.profile.providers;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.papyrus.infra.widgets.providers.AbstractStaticContentProvider;
import org.eclipse.papyrus.uml.tools.helper.IProfileApplicationDelegate;
import org.eclipse.papyrus.uml.tools.helper.ProfileApplicationDelegateRegistry;
import org.eclipse.papyrus.uml.tools.utils.ProfileUtil;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.ProfileApplication;


/**
 * Content provider for dialogs of profile application migration.
 * <p>
 * Give Packages and Profile Application of dirty profile starting from a root Package.
 * </p>
 */
public class ProfileApplicationContentProvider extends AbstractStaticContentProvider implements ITreeContentProvider {

	/** The root package. */
	protected Package rootPackage = null;

	/**
	 * Instantiates a new profile application content provider.
	 *
	 * @param rootPackage
	 *            the root package
	 */
	public ProfileApplicationContentProvider(Package rootPackage) {
		super();

		this.rootPackage = rootPackage;
	}

	/**
	 * @see org.eclipse.papyrus.infra.widgets.providers.IStaticContentProvider#getElements()
	 *
	 * @return
	 */
	public Object[] getElements() {
		return new Package[] { rootPackage };
	}

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 *
	 * @param parentElement
	 * @return
	 */
	public Object[] getChildren(Object parentElement) {
		Object[] children = null;

		// Case 1 : Element is a Profile then stop exploration
		if (parentElement instanceof ProfileApplication) {
			children = new Object[0];
		} else if (parentElement instanceof Package) {
			// Case 2 : Element is Package
			Package parentPackage = (Package) parentElement;

			List<Object> childrenList = new LinkedList<Object>();


			// Parse applied profiles of parent to find dirty ones and get profile application
			for (ProfileApplication profileApplication : getDelegate(parentPackage).getProfileApplications(parentPackage)) {
				if ((profileApplication != null) && ProfileUtil.isDirty(parentPackage, profileApplication.getAppliedProfile())) {
					childrenList.add(profileApplication);
				}
			}

			// Get nested packages
			childrenList.addAll(parentPackage.getNestedPackages());

			children = childrenList.toArray();
		} else {
			// Default : no child
			children = new Object[0];
		}

		return children;
	}

	protected IProfileApplicationDelegate getDelegate(Package package_) {
		return ProfileApplicationDelegateRegistry.INSTANCE.getDelegate(package_);
	}

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 *
	 * @param element
	 * @return
	 */
	public Object getParent(Object element) {
		Object parent = null;

		if (element instanceof Package) {
			parent = ((Package) element).getNestingPackage();
		} else if (element instanceof ProfileApplication) {
			parent = ((ProfileApplication) element).getApplyingPackage();
		}

		return parent;
	}

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 *
	 * @param element
	 * @return
	 */
	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}

}
