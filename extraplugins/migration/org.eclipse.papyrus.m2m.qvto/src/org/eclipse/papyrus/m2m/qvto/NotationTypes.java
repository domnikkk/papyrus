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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;


public class NotationTypes {

	@Operation(contextual = true, kind = Kind.HELPER)
	public static void copyBendpoints(final RelativeBendpoints source, RelativeBendpoints target, boolean convertToPixels) {
		List<RelativeBendpoint> result = new LinkedList<RelativeBendpoint>();

		for(Object point : source.getPoints()) {
			if(point instanceof RelativeBendpoint) {
				RelativeBendpoint pointCopy = new RelativeBendpoint(((RelativeBendpoint)point).convertToString());
				result.add(pointCopy);
			}
		}

		if(convertToPixels) {

			List<RelativeBendpoint> convertedResult = new LinkedList<RelativeBendpoint>();

			for(RelativeBendpoint point : result) {
				convertedResult.add(convertToPixels(point));
			}

			result = convertedResult;
		}

		target.setPoints(result);
	}

	private static RelativeBendpoint convertToPixels(RelativeBendpoint bendpoint) {
		int newSourceX, newSourceY, newTargetX, newTargetY;

		newSourceX = convertToPixels(bendpoint.getSourceX());
		newSourceY = convertToPixels(bendpoint.getSourceY());
		newTargetX = convertToPixels(bendpoint.getTargetX());
		newTargetY = convertToPixels(bendpoint.getTargetY());

		return new RelativeBendpoint(newSourceX, newSourceY, newTargetX, newTargetY);
	}

	private static int convertToPixels(int source) {
		return source / 25;
	}
}
