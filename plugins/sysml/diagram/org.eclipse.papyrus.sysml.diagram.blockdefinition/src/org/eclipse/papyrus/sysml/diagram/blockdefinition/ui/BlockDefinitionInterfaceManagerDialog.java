/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.sysml.diagram.blockdefinition.ui;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.papyrus.sysml.portandflows.FlowSpecification;
import org.eclipse.papyrus.uml.diagram.common.dialogs.InterfaceManagerDialog;
import org.eclipse.papyrus.uml.diagram.common.util.Visitor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * <pre>
 * This class provides a Dialog to manage easily the provided and 
 * the required Interfaces for a {@link Port}.
 * </pre>
 */
public class BlockDefinitionInterfaceManagerDialog extends InterfaceManagerDialog {


	/**
	 * Instantiates a new block definition interface manager dialog.
	 *
	 * @param parentShell
	 *        the parent shell
	 * @param port
	 *        the port
	 */
	public BlockDefinitionInterfaceManagerDialog(Shell parentShell, Port port) {
		super(parentShell, port);

	}


	/**
	 * Gets the all available interfaces.
	 *
	 * @param pack
	 *        the pack
	 * @return the all available interfaces
	 * @see org.eclipse.papyrus.uml.diagram.common.dialogs.InterfaceManagerDialog#getAllAvailableInterfaces(org.eclipse.uml2.uml.Package)
	 */
	protected List<Interface> getAllAvailableInterfaces(Package pack) {
		Set<Interface> otherInterfaces = new HashSet<Interface>();
		List<Element> interfaces = Visitor.getOwnedAndImportedElement(pack, Interface.class);
		for(Namespace namespace : Visitor.getOwnedAndImportedNamespaces(pack)) {
			interfaces.addAll(Visitor.getOwnedAndImportedElement(namespace, Interface.class));

		}

		for(Element element : interfaces) {
			// Test if the interface is a FlowSpecification
			FlowSpecification flowSpec = UMLUtil.getStereotypeApplication(element, FlowSpecification.class);
			if(flowSpec == null) {
				otherInterfaces.add((Interface)element);
			}
		}

		return Arrays.asList(otherInterfaces.toArray(new Interface[otherInterfaces.size()]));
	}


}
