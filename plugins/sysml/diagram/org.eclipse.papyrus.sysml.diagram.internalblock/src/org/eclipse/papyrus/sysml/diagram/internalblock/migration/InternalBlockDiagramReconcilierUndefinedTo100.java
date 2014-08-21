/*****************************************************************************
 * Copyright (c) 2014 CEA LIST
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.diagram.internalblock.migration;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.commands.wrappers.EMFtoGMFCommandWrapper;
import org.eclipse.papyrus.infra.gmfdiag.common.reconciler.DiagramReconciler;
import org.eclipse.papyrus.sysml.diagram.common.utils.SysMLGraphicalTypes;
import org.eclipse.papyrus.sysml.diagram.internalblock.Activator;
import org.eclipse.papyrus.sysml.service.types.element.SysMLElementTypes;
import org.eclipse.papyrus.uml.diagram.common.util.ViewServiceUtil;
import org.eclipse.papyrus.uml.diagram.common.utils.UMLGraphicalTypes;

/**
 * Internal Block Diagram Reconciler from undefined to 1.0.0
 */
public class InternalBlockDiagramReconcilierUndefinedTo100 extends DiagramReconciler {

	@Override
	public ICommand getReconcileCommand(Diagram diagram) {
		try {

			CompoundCommand cc = new CompoundCommand("Update Internal Block Diagram From Undefined To 1.0.0");

			Command updateCommandFromUndefinedTo_081 = getUpdateCommandFromUndefinedTo_081(diagram);
			Command updateCommandFrom081To_091 = getUpdateCommandFrom081To_091(diagram);
			cc.append(updateCommandFromUndefinedTo_081);
			cc.append(updateCommandFrom081To_091);

			return EMFtoGMFCommandWrapper.wrap(cc);
		} catch (Exception e) {
			Activator.log.error(e);
			return UnexecutableCommand.INSTANCE;
		}
	}


	public static Command getUpdateCommandFromUndefinedTo_081(final Diagram diagram) throws Exception {

		Command command = new RecordingCommand(TransactionUtil.getEditingDomain(diagram), "Diagram version updater (from undefined to 0.8.1)") {

			private Map<String, String> conversionMapping = new HashMap<String, String>();

			private void initializeMappings() {

				conversionMapping.put(OldElementTypes.CLASS.getSemanticHint(), SysMLGraphicalTypes.SHAPE_SYSML_BLOCK_AS_COMPOSITE_ID);
				conversionMapping.put(OldElementTypes.CLASS_LABEL_COMPOSITE_NAME_HINT, SysMLGraphicalTypes.LABEL_SYSML_BLOCK_NAME_ID);
				conversionMapping.put(OldElementTypes.CLASS_COMPARTMENT_STRUCTURE_HINT, SysMLGraphicalTypes.COMPARTMENT_SYSML_STRUCTURE_ID);

				conversionMapping.put(OldElementTypes.PROPERTY_CN.getSemanticHint(), SysMLGraphicalTypes.SHAPE_SYSML_BLOCKPROPERTY_AS_COMPOSITE_ID);
				conversionMapping.put(OldElementTypes.PROPERTY_CN_LABEL_PART_NAME_HINT, UMLGraphicalTypes.LABEL_UML_PROPERTY_LABEL_ID);
				conversionMapping.put(OldElementTypes.PROPERTY_CN_COMPARTMENT_STRUCTURE_HINT, SysMLGraphicalTypes.COMPARTMENT_SYSML_BLOCKPROPERTY_STRUCTURE_ID);

				conversionMapping.put(OldElementTypes.PORT_CN_LABEL_APPLIED_STEREOTYPE_HINT, UMLGraphicalTypes.AFFIXEDLABEL_UML_APPLIEDSTEREOTYPE_ID);

				conversionMapping.put(OldElementTypes.CONNECTOR.getSemanticHint(), UMLGraphicalTypes.LINK_UML_CONNECTOR_ID);
				conversionMapping.put(OldElementTypes.CONNECTOR_LABEL_APPLIED_STEREOTYPE_HINT, UMLGraphicalTypes.LINKLABEL_UML_APPLIEDSTEREOTYPE_ID);
				conversionMapping.put(OldElementTypes.CONNECTOR_LABEL_NAME_HINT, UMLGraphicalTypes.LINKLABEL_UML_CONNECTOR_LABEL_ID);
				conversionMapping.put(OldElementTypes.CONNECTOR_LABEL_MULTIPLICITY_SOURCE_HINT, UMLGraphicalTypes.LINKLABEL_UML_CONNECTOR_SOURCE_MULTIPLICITY_ID);
				conversionMapping.put(OldElementTypes.CONNECTOR_LABEL_MULTIPLICITY_TARGET_HINT, UMLGraphicalTypes.LINKLABEL_UML_CONNECTOR_TARGET_MULTIPLICITY_ID);

			}

			@Override
			protected void doExecute() {
				initializeMappings();

				List<View> blockViews = new ArrayList<View>();
				List<View> portViews = new ArrayList<View>();

				// Update diagram compatibility version
				// DiagramVersioningUtils.setCompatibilityVersion(diagram, "0.8.1");

				// Update view types
				Iterator<EObject> it = diagram.eAllContents();
				while (it.hasNext()) {
					EObject currentEObject = it.next();
					if (currentEObject instanceof View) {
						View currentView = (View) currentEObject;

						if (conversionMapping.containsKey(currentView.getType())) {
							if (currentView.getType().equals(OldElementTypes.CLASS.getSemanticHint())) {
								blockViews.add(currentView);
							}

							currentView.setType(conversionMapping.get(currentView.getType()));
						}

						// Port require specific conversion
						if (currentView.getType().equals(OldElementTypes.PORT_CN.getSemanticHint()) || currentView.getType().equals(OldElementTypes.PORT_CN_LABEL_NAME_HINT)) {
							portViews.add(currentView);
						}
					}
				}

				// Specific conversion cases
				for (View portView : portViews) {
					EObject eObject = portView.getElement();

					if (((ISpecializationType) SysMLElementTypes.FLOW_PORT).getMatcher().matches(eObject)) {

						if (portView.getType().equals(OldElementTypes.PORT_CN.getSemanticHint())) {
							portView.setType(SysMLGraphicalTypes.SHAPE_SYSML_FLOWPORT_AS_AFFIXED_ID);
						}

						if (portView.getType().equals(OldElementTypes.PORT_CN_LABEL_NAME_HINT)) {
							portView.setType(SysMLGraphicalTypes.AFFIXEDLABEL_SYSML_FLOWPORT_LABEL_ID);
						}

					} else { // if (eObject instanceof Port)

						if (portView.getType().equals(OldElementTypes.PORT_CN.getSemanticHint())) {
							portView.setType(UMLGraphicalTypes.SHAPE_UML_PORT_AS_AFFIXED_ID);
						}

						if (portView.getType().equals(OldElementTypes.PORT_CN_LABEL_NAME_HINT)) {
							portView.setType(UMLGraphicalTypes.AFFIXEDLABEL_UML_PORT_LABEL_ID);
						}
					}
				}

				// Update settings
				for (View blockView : blockViews) {
					EAnnotation stereotypeAnnotation = blockView.getEAnnotation("Stereotype_Annotation");
					blockView.getEAnnotations().remove(stereotypeAnnotation);
				}
			}

			@Override
			public boolean canUndo() {
				return false;
			}
		};

		return command;
	}

	public static Command getUpdateCommandFrom081To_091(final Diagram diagram) throws Exception {

		Command command = new RecordingCommand(TransactionUtil.getEditingDomain(diagram), "Diagram version updater (from 0.8.1 to 0.9.1)") {

			private Map<String, String> conversionMapping = new HashMap<String, String>();

			private List<IStatus> results = new ArrayList<IStatus>();

			private void initializeMappings() {

				conversionMapping.put(OldElementTypes.SHAPE_SYSML_NESTEDBLOCKPROPERTY_AS_COMPOSITE_ID, SysMLGraphicalTypes.SHAPE_SYSML_BLOCKPROPERTY_AS_COMPOSITE_ID);

			}

			@Override
			protected void doExecute() {
				initializeMappings();
				ViewServiceUtil.forceLoad();
				List<View> nestedPropertyViews = new ArrayList<View>();
				List<View> failedPropertyUpdates = new ArrayList<View>();

				// Update diagram compatibility version
				// DiagramVersioningUtils.setCompatibilityVersion(diagram, "0.8.1");

				// Update view types
				Iterator<EObject> it = diagram.eAllContents();
				while (it.hasNext()) {
					EObject currentEObject = it.next();
					if (currentEObject instanceof View) {
						View currentView = (View) currentEObject;
						String currentViewType = currentView.getType();
						if (conversionMapping.containsKey(currentViewType)) {

							// update nested properties
							if (OldElementTypes.SHAPE_SYSML_NESTEDBLOCKPROPERTY_AS_COMPOSITE_ID.equals(currentViewType)) {
								currentView.setType(conversionMapping.get(currentView.getType()));
								nestedPropertyViews.add(currentView);
								// need to create child structure compartment, enven not visible

								Node compartment = ViewService.createNode(currentView, SysMLGraphicalTypes.COMPARTMENT_SYSML_BLOCKPROPERTY_STRUCTURE_ID, PreferencesHint.USE_DEFAULTS);
								if (compartment == null) {
									failedPropertyUpdates.add(currentView);
								}
							}
						}
					}
				}

				if (!failedPropertyUpdates.isEmpty()) {
					org.eclipse.papyrus.sysml.diagram.internalblock.Activator.log.warn("Impossible to create a compartment for the properties: " + failedPropertyUpdates);
				}

			}

			@Override
			public boolean canUndo() {
				return false;
			}

			@Override
			public java.util.Collection<IStatus> getResult() {
				return results;
			};
		};

		return command;
	}

}
