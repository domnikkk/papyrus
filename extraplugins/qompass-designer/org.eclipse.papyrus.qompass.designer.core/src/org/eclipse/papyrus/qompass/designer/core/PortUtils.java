/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Ansgar Radermacher  ansgar.radermacher@cea.fr  
 *
 *****************************************************************************/

package org.eclipse.papyrus.qompass.designer.core;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.FCM.PortKind;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;

public class PortUtils {

	/**
	 * Return the provided interface associated with the UML port, i.e.
	 * the derived attribute of the FCM profile
	 * 
	 * @param port
	 *        the UML port
	 * @return the provided interface
	 */
	public static Interface getProvided(Port port) {
		org.eclipse.papyrus.FCM.Port fcmPort = getFCMport(port);
		if(fcmPort != null) {
			return fcmPort.getProvidedInterface();
		} else if(port.getProvideds().size() > 0) {
			// return first standard UML provided port
			return port.getProvideds().get(0);
		}
		return null;
	}

	/**
	 * Return the required interface associated with the UML port, i.e.
	 * the derived attribute of the FCM profile
	 * 
	 * @param port
	 *        the UML port
	 * @return the required interface
	 */
	public static Interface getRequired(Port port) {
		org.eclipse.papyrus.FCM.Port fcmPort = getFCMport(port);
		if(fcmPort != null) {
			return fcmPort.getRequiredInterface();
		} else if(port.getRequireds().size() > 0) {
			// return first standard UML required port
			return port.getRequireds().get(0);
		}
		return null;
	}

	/**
	 * Return the FCM port (static profile) from a given UML port
	 * 
	 * @param port
	 * @return
	 */
	public static org.eclipse.papyrus.FCM.Port getFCMport(Port port) {
		return StUtils.getApplication(port, org.eclipse.papyrus.FCM.Port.class);
	}

	/**
	 * Returns all ports (including inherited ones) for an encapsulated classifier
	 * 
	 * @param ec
	 * @return
	 */
	public static EList<Port> getAllPorts(EncapsulatedClassifier ec) {
		EList<Port> ports = new BasicEList<Port>();
		for(Property attribute : ec.getAllAttributes()) {
			if(attribute instanceof Port) {
				ports.addAll(flattenExtendedPort((Port) attribute));
			}
		}
		
		// TODO: for the moment, don't add aggregated port to list.
		/*
		 * ComponentType compType = = StUtils.getApplication (ec, ComponentType.class);
		 * for (ContainerRule rule : compType.getContainerRule ())
		 * {
		 * if ((rule.getExtensionKind () == ContainerExtKind.AGGREGATION) &&
		 * (rule.getExtension () != null)) {
		 * ports.addAll (getAllPorts (rule.getExtension ().getBase_Class ()));
		 * }
		 * }
		 */

		return ports;
	}

	/**
	 * Returns all ports for an encapsulated classifier. Inherited ports are
	 * included, except if the superclass is already a component implementation.
	 * The motivation for this function is that ports inherited by a
	 * component implementation have already corresponding operations/attributes,
	 * only ports inherited by types need these definitions in subclasses.
	 * TODO: support for abstract implementations that partially implement ports
	 * 
	 * @param ec
	 * @return
	 */
	public static EList<Port> getAllPorts2(EncapsulatedClassifier ec) {
		EList<Port> ports = new BasicEList<Port>();

		for(Port port : ec.getOwnedPorts()) {
			ports.addAll(flattenExtendedPort(port));
		}
		
		for(Classifier general : ec.getGenerals()) {
			if((general instanceof EncapsulatedClassifier) && (!Utils.isCompImpl(general))) {
				ports.addAll(getAllPorts2((EncapsulatedClassifier)general));
			}
		}
		return ports;
	}

	public static EList<Port> flattenExtendedPort(Port port) {
		org.eclipse.papyrus.FCM.Port fcmPort = getFCMport(port);
		if ((fcmPort != null) && (fcmPort.getKind() != null)) {
			org.eclipse.uml2.uml.Class cl = fcmPort.getKind().getBase_Class();
			if ((cl != null) && (getAllPorts(cl).size() > 0)) {
				return getAllPorts(cl);
			}
		}
		EList<Port> ports = new BasicEList<Port>();
		ports.add(port);
		return ports;
	}
	
	/**
	 * Return true, if the passed port is an extended port
	 * @param port
	 * @return
	 */
	public static boolean isExtendedPort(Port port) {
		org.eclipse.papyrus.FCM.Port fcmPort = getFCMport(port);
		if ((fcmPort != null) && (fcmPort.getKind() != null)) {
			org.eclipse.uml2.uml.Class cl = fcmPort.getKind().getBase_Class();
			return ((cl != null) && (getAllPorts(cl).size() > 0));
		}
		return false;
	}
	/**
	 * Return the port kind, an element of the static profile
	 * 
	 * @param port
	 * @return
	 */
	public static PortKind getKind(Port port) {
		org.eclipse.papyrus.FCM.Port fcmPort = getFCMport(port);
		if(fcmPort != null) {
			return fcmPort.getKind();
		}
		return null;
	}

	/**
	 * Check whether two ports have the same port kind. Since different models apparently
	 * use different Java instances for the same port kind, the check is therefore based
	 * on the equality of full qualified name.
	 * 
	 * @param portA
	 * @param portB
	 * @return true, if port kinds are identical
	 */
	public static boolean sameKinds(Port portA, Port portB) {
		PortKind kindA = getKind(portA);
		PortKind kindB = getKind(portB);
		if((kindA == null) && (kindB == null)) {
			return true;
		} else if((kindA == null) || (kindB == null)) {
			return false;
		} else {
			// 	better use eClass?
			boolean tst = kindA == kindB;
			boolean tst2 =
				kindA.getBase_Class().getQualifiedName().equals(
					kindB.getBase_Class().getQualifiedName());
			if(tst != tst2) {
				Log.log(Log.ERROR_MSG, Log.UTILS, "different instances of same kind??" + kindA.getBase_Class());
			}
			return kindA.getBase_Class().getQualifiedName().equals(
				kindB.getBase_Class().getQualifiedName());
		}
	}

	/**
	 * Check whether two ports match, i.e. have the same kind but different conjugation (assembly)
	 * or same (delegation)
	 * 
	 * @param portA
	 *        first port
	 * @param portB
	 *        second port
	 * @param isAssembly
	 *        true, if the ports should be connected by an assembly connector (i.e. no delegation)
	 * @return true, if ports match
	 */
	public static boolean matches(Port portA, Port portB, boolean isAssembly) {
		if(isAssembly) {
			return (sameKinds(portA, portB) && (portA.isConjugated() != portB.isConjugated()));
		} else {
			// delegation
			return (sameKinds(portA, portB) && (portA.isConjugated() == portB.isConjugated()));
		}
	}

	/**
	 * Check whether two ports are compatible. i.e. either match or are compatible interface wise
	 * 
	 * @param portA
	 * @param portB
	 * @param isAssembly
	 *        true, if the ports should be connected by an assembly connector (i.e. no delegation)
	 * @return
	 */
	public static boolean isCompatible(Port portA, Port portB, boolean isAssembly) {
		if(matches(portA, portB, isAssembly)) {
			return true;
		}
		// no match found, try weaker condition: find 1st match for provided ...
		// TODO: check not only for identical interfaces but allow a superclass on the required interface
		// TODO: should be used by template binding checker
		if(isAssembly) {
			return (PortUtils.getProvided(portA) == PortUtils.getRequired(portB)) &&
				(PortUtils.getProvided(portB) == PortUtils.getRequired(portA));
		} else {
			return (PortUtils.getProvided(portA) == PortUtils.getProvided(portB)) &&
				(PortUtils.getRequired(portB) == PortUtils.getRequired(portA));
		}
	}
}
