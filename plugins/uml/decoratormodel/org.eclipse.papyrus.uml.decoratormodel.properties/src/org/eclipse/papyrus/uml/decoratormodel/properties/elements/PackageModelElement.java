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

package org.eclipse.papyrus.uml.decoratormodel.properties.elements;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.uml.properties.modelelement.UMLModelElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * Properties model element for packages.
 */
public class PackageModelElement extends UMLModelElement {
	static final String DECORATOR_MODEL_PROPERTY = "externalProfileApplication"; //$NON-NLS-1$

	public PackageModelElement(Package source, TransactionalEditingDomain domain) {
		super(source, domain);
	}

	protected final Package getPackage() {
		return (Package) getSource();
	}

	@Override
	public IObservable doGetObservable(String propertyPath) {
		if (propertyPath.equals(UMLPackage.Literals.PACKAGE__PROFILE_APPLICATION.getName())) {
			return new AppliedProfilesObservableList(getPackage(), domain);
		} else if (propertyPath.equals(DECORATOR_MODEL_PROPERTY)) {
			return new DecoratorModelsObservableList(getPackage(), (TransactionalEditingDomain) domain);
		}

		return super.doGetObservable(propertyPath);
	}
}
