package org.eclipse.papyrus.infra.services.controlmode.commands;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.IParameterValues;



public class ControlModeCommandParameterValues implements IParameterValues {

	private  HashMap<String, Boolean> parameterValues = new HashMap<String, Boolean>();

	public Map<String, Boolean> getParameterValues() {
		return parameterValues;
	}

	public  Boolean get(Object key) {
		return parameterValues.get(key);
	}

	public  Boolean put(String key, Boolean value) {
		return parameterValues.put(key, value);
	}

}
