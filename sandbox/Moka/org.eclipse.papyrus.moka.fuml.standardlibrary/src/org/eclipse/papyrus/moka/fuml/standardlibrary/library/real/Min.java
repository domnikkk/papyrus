package org.eclipse.papyrus.moka.fuml.standardlibrary.library.real;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.papyrus.infra.core.Activator;
import org.eclipse.papyrus.moka.fuml.Semantics.Classes.Kernel.RealValue;
import org.eclipse.papyrus.moka.fuml.Semantics.Classes.Kernel.Value;
import org.eclipse.papyrus.moka.fuml.Semantics.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution;
import org.eclipse.papyrus.moka.fuml.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;

public class Min extends OpaqueBehaviorExecution {

	@Override
	public void doBody(List<ParameterValue> inputParameters, List<ParameterValue> outputParameters) {
		try {
			Double x = ((RealValue)inputParameters.get(0).values.get(0)).value;
			Double y = ((RealValue)inputParameters.get(1).values.get(0)).value;
			RealValue result = new RealValue();
			result.value = Math.min(x, y);
			List<Value> outputs = new ArrayList<Value>();
	    	result.type = this.locus.factory.getBuiltInType("Real");
			outputs.add(result);
			outputParameters.get(0).values = outputs;
		} catch (Exception e) {
			Activator.log.error("An error occured during the execution of Min " + e.getMessage(), e);
		}
	}

	@Override
	public Value new_() {
		return new Min();
	}
}
