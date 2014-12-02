/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.m2m.qvto;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;


public class EMFResourceUtils {

	/**
	 * Returns the URI of the selected element as a String
	 *
	 * @param target
	 * @return
	 */
	@Operation(contextual = true, kind = Kind.QUERY)
	public String getURI(EObject target) {
		if (target == null) {
			return "";
		}
		return EcoreUtil.getURI(target).toString();
	}

	/**
	 * Deletes the selected element, ensuring that it is also removed from the
	 * CrossReference (Especially useful for UML Models to avoid memory leaks)
	 *
	 * If delete incoming references is true, the operation may take a longer time
	 * to complete
	 *
	 * @param target
	 * @param deleteIncomingReferences
	 */
	@Operation(contextual = true, kind = Kind.HELPER)
	public void forceDelete(EObject target, boolean deleteIncomingReferences) {
		if (target == null) {
			return;
		}

		ECrossReferenceAdapter adapter = ECrossReferenceAdapter.getCrossReferenceAdapter(target);

		if (deleteIncomingReferences) {
			EcoreUtil.delete(target);
		} else {
			EcoreUtil.remove(target);
		}

		if (adapter != null) {
			adapter.unsetTarget(target);
		}
	}
}
