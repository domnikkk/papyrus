package org.eclipse.papyrus.modelexplorer;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.common.core.command.ICommand;

public interface IGreeter {
	 void greet();
	 public boolean match(Diagram diagram);
	 public ICommand getCommand(Diagram diagram);
}
