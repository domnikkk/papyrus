/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.emf.facet.queries.parametric;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.facet.infra.query.ModelQuery;
import org.eclipse.emf.facet.infra.query.ModelQueryParameter;
import org.eclipse.emf.facet.infra.query.QueryFactory;
import org.eclipse.emf.facet.infra.query.core.AbstractModelQuery;
import org.eclipse.emf.facet.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.emf.facet.infra.query.core.exception.ModelQueryException;
import org.eclipse.emf.facet.infra.query.runtime.ModelQueryContext;
import org.eclipse.emf.facet.infra.query.runtime.ModelQueryParameterValue;
import org.eclipse.emf.facet.infra.query.runtime.ModelQueryResult;
import org.eclipse.emf.facet.infra.query.runtime.RuntimeFactory;
import org.eclipse.papyrus.infra.emf.facet.queries.parametricquery.Argument;
import org.eclipse.papyrus.infra.emf.facet.queries.parametricquery.EStructuralFeatureArgument;
import org.eclipse.papyrus.infra.emf.facet.queries.parametricquery.ParametricQuery;
import org.eclipse.papyrus.infra.emf.facet.queries.parametricquery.StringArgument;


public class FacetParametricQuery extends AbstractModelQuery {

	protected ParametricQuery parametricModelQuery;

	public FacetParametricQuery(ParametricQuery modelQuery) {
		super(modelQuery);
		this.parametricModelQuery = modelQuery;
	}

	@Override
	public Object basicEvaluate(EObject context, List<ModelQueryParameterValue> parameterValues) throws ModelQueryException {
		ModelQuery calledQuery = parametricModelQuery.getCalledQuery();
		List<Argument> arguments = parametricModelQuery.getArguments();

		final ModelQuerySetCatalog querySetCatalog = ModelQuerySetCatalog.getSingleton();
		if(calledQuery != null) {
			final AbstractModelQuery modelQueryImpl = querySetCatalog.getModelQueryImpl(calledQuery);
			ModelQueryContext modelQueryContext = RuntimeFactory.eINSTANCE.createModelQueryContext();
			modelQueryContext.getSelectedModelElements().add(context);

			List<ModelQueryParameterValue> calledParameterValues = getParameterValues(calledQuery, arguments);

			return modelQueryImpl.basicEvaluate(context, calledParameterValues);
		}

		return Collections.emptyList();
	}

	private List<ModelQueryParameterValue> getParameterValues(ModelQuery calledQuery, List<Argument> arguments) {
		List<ModelQueryParameterValue> result = new LinkedList<ModelQueryParameterValue>();

		for(Argument argument : arguments) {
			ModelQueryParameterValue parameterValue = RuntimeFactory.eINSTANCE.createModelQueryParameterValue();
			ModelQueryParameter modelQueryParameter = QueryFactory.eINSTANCE.createModelQueryParameter();

			Object value = null;
			final String name = argument.getArgumentName();
			if(argument instanceof StringArgument) {
				value = ((StringArgument)argument).getValue();
			} else if(argument instanceof EStructuralFeatureArgument) {
				value = ((EStructuralFeatureArgument)argument).getValue();
			}
			modelQueryParameter.setName(name);
			parameterValue.setParameter(modelQueryParameter);
			parameterValue.setValue(value);
			result.add(parameterValue);
		}
		return result;
	}
}