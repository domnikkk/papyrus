/**
 *  Copyright (c) 2011 Atos.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *  Atos - Initial API and implementation
 *  
 *  Anass RADOUANI (Atos) anass.radouani@atos.net - Order Diagrams by type and by name
 * 
 */
package org.eclipse.papyrus.uml.modelexplorer.queries;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.facet.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.emf.facet.infra.query.core.java.IJavaModelQuery;
import org.eclipse.emf.facet.infra.query.core.java.ParameterValueList;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.modelexplorer.queries.AbstractEditorContainerQuery;
import org.eclipse.papyrus.resource.notation.NotationUtils;
import org.eclipse.uml2.uml.Element;

/** Get the collection of all contained diagrams */
public class GetContainedDiagrams extends AbstractEditorContainerQuery implements IJavaModelQuery<Element, Collection<org.eclipse.gmf.runtime.notation.Diagram>> {

	public static Pattern PATTERN_NUMBERS = Pattern.compile("(.*(?:\\D|^))(\\d+)");


	public Collection<Diagram> evaluate(final Element context, final ParameterValueList parameterValues) throws ModelQueryExecutionException {
		List<Diagram> associatedDiagrams = NotationUtils.getAssociatedDiagrams(context);


		Collections.sort(associatedDiagrams, new Comparator<Diagram>() {

			public int compare(Diagram d1, Diagram d2) {
				String d1type = d1.getType();
				String d2Type = d2.getType();
				if(d1type.equals(d2Type)) {
					String string1 = d1.getName();
					String string2 = d2.getName();
					return compareNaturalOrder(string1, string2);
				} else {
					return d1type.compareTo(d2Type);
				}

			}
		});
		return associatedDiagrams;
	}

		public static int compareNaturalOrder(String string1, String string2) {
        	if (string1 == null) {
        		string1 = "";
        	}
        	if (string2 == null) {
        		string2 = "";
        	}
			Matcher m1 = PATTERN_NUMBERS.matcher(string1);
			Matcher m2 = PATTERN_NUMBERS.matcher(string2);
			if(!m1.matches() || !m2.matches()) {
				return string1.compareTo(string2);
			}
			if(m1.groupCount() == 1) {
				return string1.compareTo(string2);
			} else if(m1.groupCount() == 2) {
				if(m2.groupCount() == 1) {
					return string1.compareTo(string2);
				} else {
					String group1 = m1.group(1);
					String group2 = m2.group(1);
					if(group1.equals(group2)) {
						try {
							Integer val1 = Integer.valueOf(m1.group(2));
							Integer val2 = Integer.valueOf(m2.group(2));
							return val1.compareTo(val2);
						} catch (NumberFormatException e) {
						}
					} else {
						return string1.compareTo(string2);
					}
				}
			}
			return string1.compareTo(string2);
		}
}
