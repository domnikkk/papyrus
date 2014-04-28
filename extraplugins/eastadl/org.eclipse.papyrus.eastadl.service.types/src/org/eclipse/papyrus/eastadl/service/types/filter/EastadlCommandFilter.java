package org.eclipse.papyrus.eastadl.service.types.filter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.papyrus.eastadl.service.types.elements.EastadlElementTypes;
import org.eclipse.papyrus.uml.service.types.element.UMLElementTypes;
import org.eclipse.papyrus.uml.service.types.filter.ICommandFilter;

public class EastadlCommandFilter implements ICommandFilter {

	public static final EastadlCommandFilter INSTANCE = new EastadlCommandFilter();
	private EastadlCommandFilter() {
		
	}
	private List<IElementType> visibleCommands;
	@Override
	public List<IElementType> getVisibleCommands() {
		if (visibleCommands == null) {
			List<IElementType> localVisibleCommands = new ArrayList<IElementType>();

			localVisibleCommands = new ArrayList<IElementType>();
			
			localVisibleCommands.add(EastadlElementTypes.FUNCTION_ALLOCATE);
			
			localVisibleCommands.add(UMLElementTypes.PROPERTY);
			
			this.visibleCommands = Collections.unmodifiableList(localVisibleCommands);
		}
		return visibleCommands;
	}

}
