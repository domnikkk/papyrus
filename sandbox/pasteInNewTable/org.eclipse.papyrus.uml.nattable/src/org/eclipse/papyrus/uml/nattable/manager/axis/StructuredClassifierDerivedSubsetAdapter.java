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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.nattable.manager.axis;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLDerivedUnionAdapter;

/**
 * @see for generation see {@link PapyrusUMLDerivedSubsetAdapter} This adapter allows to receive the notifications of the following derived subset
 *      features :
 *      <ul>
 *      <li>UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT</li>
 *      *
 *      </ul>
 * 
 * @author vl222926
 * @see PapyrusUMLDerivedSubsetAdapter
 */
//FIXME : move me in oep.uml.tools or others uml plugin
public class StructuredClassifierDerivedSubsetAdapter extends UMLDerivedUnionAdapter {

	@Override
	protected void notifyStereotypeChanged(Notification notification, EClass eClass) {
		super.notifyStereotypeChanged(notification, eClass);
		switch(notification.getFeatureID(org.eclipse.uml2.uml.Stereotype.class)) {

		case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
			notifyChanged(notification, eClass, UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
			break;
		default:
		}
	}

	@Override
	protected void notifyClassChanged(Notification notification, EClass eClass) {
		super.notifyClassChanged(notification, eClass);
		switch(notification.getFeatureID(org.eclipse.uml2.uml.Class.class)) {

		case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
			notifyChanged(notification, eClass, UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
			break;
		default:
		}
	}

	@Override
	protected void notifyProtocolStateMachineChanged(Notification notification, EClass eClass) {
		super.notifyProtocolStateMachineChanged(notification, eClass);
		switch(notification.getFeatureID(org.eclipse.uml2.uml.ProtocolStateMachine.class)) {

		case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
			notifyChanged(notification, eClass, UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
			break;
		default:
		}
	}

	@Override
	protected void notifyStateMachineChanged(Notification notification, EClass eClass) {
		super.notifyStateMachineChanged(notification, eClass);
		switch(notification.getFeatureID(org.eclipse.uml2.uml.StateMachine.class)) {

		case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
			notifyChanged(notification, eClass, UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
			break;
		default:
		}
	}

	@Override
	protected void notifyCollaborationChanged(Notification notification, EClass eClass) {
		super.notifyCollaborationChanged(notification, eClass);
		switch(notification.getFeatureID(org.eclipse.uml2.uml.Collaboration.class)) {

		case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
			notifyChanged(notification, eClass, UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
			break;
		default:
		}
	}

	@Override
	protected void notifyActivityChanged(Notification notification, EClass eClass) {
		super.notifyActivityChanged(notification, eClass);
		switch(notification.getFeatureID(org.eclipse.uml2.uml.Activity.class)) {

		case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
			notifyChanged(notification, eClass, UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
			break;
		default:
		}
	}

	@Override
	protected void notifyInteractionChanged(Notification notification, EClass eClass) {
		super.notifyInteractionChanged(notification, eClass);
		switch(notification.getFeatureID(org.eclipse.uml2.uml.Interaction.class)) {

		case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
			notifyChanged(notification, eClass, UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
			break;
		default:
		}
	}

	@Override
	protected void notifyAssociationClassChanged(Notification notification, EClass eClass) {
		super.notifyAssociationClassChanged(notification, eClass);
		switch(notification.getFeatureID(org.eclipse.uml2.uml.AssociationClass.class)) {

		case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
			notifyChanged(notification, eClass, UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
			break;
		default:
		}
	}

	@Override
	protected void notifyComponentChanged(Notification notification, EClass eClass) {
		super.notifyComponentChanged(notification, eClass);
		switch(notification.getFeatureID(org.eclipse.uml2.uml.Component.class)) {

		case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
			notifyChanged(notification, eClass, UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
			break;
		default:
		}
	}

	@Override
	protected void notifyDeviceChanged(Notification notification, EClass eClass) {
		super.notifyDeviceChanged(notification, eClass);
		switch(notification.getFeatureID(org.eclipse.uml2.uml.Device.class)) {

		case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
			notifyChanged(notification, eClass, UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
			break;
		default:
		}
	}

	@Override
	protected void notifyNodeChanged(Notification notification, EClass eClass) {
		super.notifyNodeChanged(notification, eClass);
		switch(notification.getFeatureID(org.eclipse.uml2.uml.Node.class)) {

		case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
			notifyChanged(notification, eClass, UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
			break;
		default:
		}
	}

	@Override
	protected void notifyExecutionEnvironmentChanged(Notification notification, EClass eClass) {
		super.notifyExecutionEnvironmentChanged(notification, eClass);
		switch(notification.getFeatureID(org.eclipse.uml2.uml.ExecutionEnvironment.class)) {

		case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
			notifyChanged(notification, eClass, UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
			break;
		default:
		}
	}

	@Override
	protected void notifyFunctionBehaviorChanged(Notification notification, EClass eClass) {
		super.notifyFunctionBehaviorChanged(notification, eClass);
		switch(notification.getFeatureID(org.eclipse.uml2.uml.FunctionBehavior.class)) {

		case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
			notifyChanged(notification, eClass, UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
			break;
		default:
		}
	}

	@Override
	protected void notifyOpaqueBehaviorChanged(Notification notification, EClass eClass) {
		super.notifyOpaqueBehaviorChanged(notification, eClass);
		switch(notification.getFeatureID(org.eclipse.uml2.uml.OpaqueBehavior.class)) {

		case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
			notifyChanged(notification, eClass, UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT);
			break;
		default:
		}
	}


}
