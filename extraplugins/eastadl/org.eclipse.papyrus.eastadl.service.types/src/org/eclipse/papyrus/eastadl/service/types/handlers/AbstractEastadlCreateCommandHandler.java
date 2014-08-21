package org.eclipse.papyrus.eastadl.service.types.handlers;

import org.eclipse.papyrus.eastadl.service.types.filter.EastadlCommandFilter;
import org.eclipse.papyrus.uml.service.types.filter.ICommandFilter;
import org.eclipse.papyrus.uml.service.types.handlers.AbstractCreateCommandHandler;

public abstract class AbstractEastadlCreateCommandHandler extends
		AbstractCreateCommandHandler {

	private static final ICommandFilter filter = EastadlCommandFilter.INSTANCE;

	@Override
	public ICommandFilter getCommandFilter() {
		return filter;
	}
}
