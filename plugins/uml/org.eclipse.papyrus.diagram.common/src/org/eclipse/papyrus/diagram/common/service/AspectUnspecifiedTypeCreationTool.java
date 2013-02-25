/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) remi.schnekenburger@cea.fr - Initial API and implementation
 *  Philippe ROLAND (Atos) philippe.roland@atos.net - Implemented PreActions
 *****************************************************************************/

package org.eclipse.papyrus.diagram.common.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedAdapter;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest.ViewAndElementDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.diagram.ui.util.INotationType;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.core.services.ServiceException;
import org.eclipse.papyrus.core.utils.EditorUtils;
import org.eclipse.papyrus.diagram.common.Activator;
import org.eclipse.papyrus.diagram.common.service.palette.AspectToolService;
import org.eclipse.papyrus.diagram.common.service.palette.IAspectAction;
import org.eclipse.papyrus.diagram.common.service.palette.IAspectActionProvider;
import org.eclipse.papyrus.diagram.common.service.palette.IFeatureSetterAspectAction;
import org.eclipse.papyrus.diagram.common.service.palette.IPostAction;
import org.eclipse.papyrus.diagram.common.service.palette.IPreAction;
import org.w3c.dom.NodeList;

/**
 * Creation tool that adds stereotype application after creation actions.
 */
public class AspectUnspecifiedTypeCreationTool extends UnspecifiedTypeCreationTool {

	/**
	 * List of element types of which one will be created (of type <code>IElementType</code>).
	 */
	protected List<IElementType> elementTypes;

	/** post action list */
	protected List<IPostAction> postActions = new ArrayList<IPostAction>();

	/** preaction list */
	protected List<IPreAction> preActions = new ArrayList<IPreAction>();

	private static String ID_ASPECT_ACTION = "palette_aspect_actions";

	/**
	 * Creates an AspectUnspecifiedTypeCreationTool
	 * 
	 * @param elementTypes
	 *        List of element types of which one will be created (of type <code>IElementType</code>).
	 */
	public AspectUnspecifiedTypeCreationTool(List<IElementType> elementTypes) {
		super(elementTypes);
		this.elementTypes = elementTypes;

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void performCreation(int button) {
		antiScroll = true;
		boolean requiresPostAction = requiresPostCommitRun();
		// EObject to listen
		View eObject = (View)getTargetEditPart().getAdapter(View.class);
		DiagramEventBroker eventBroker = null;
		NotificationListener listener = null;
		if(requiresPostAction) {
			// register a listener to have information about element creation
			// retrieves editing domain
			TransactionalEditingDomain domain;
			try {
				domain = EditorUtils.getServiceRegistry().getService(TransactionalEditingDomain.class);
				eventBroker = DiagramEventBroker.getInstance(domain);

				if(eventBroker == null) {
					return;
				}
				listener = new NotificationListener() {

					public void notifyChanged(Notification notification) {
						Object newValue = notification.getNewValue();
						EditPartViewer viewer = getCurrentViewer();
						if(viewer == null) {
							viewer = (getTargetEditPart() != null) ? getTargetEditPart().getViewer() : null;
						}
						if(viewer != null) {
							EditPart editPart = (EditPart)getCurrentViewer().getEditPartRegistry().get(newValue);

							for(IPostAction action : postActions) {
								action.runInPostCommit(editPart);
							}
						} else {
							Activator.log.error("Impossible to find the current viewer", null);
						}
					}
				};

				eventBroker.addNotificationListener(eObject, listener);
			} catch (ServiceException e) {
				Activator.log.error(e);
			}
		}

		Command command = getCurrentCommand();

		if(command != null) {
			ICommand completeCommand = getCompleteCommand(command);

			setCurrentCommand(new ICommandProxy(completeCommand));

			executeCurrentCommand();
		}

		if(requiresPostAction) {
			if(eventBroker != null) {
				eventBroker.removeNotificationListener(eObject, listener);
			}
		}

		selectAddedObject(getCurrentViewer(), DiagramCommandStack.getReturnValues(command));

		antiScroll = false;
	}

	protected ICommand getCompleteCommand(Command createCommand) {
		final TransactionalEditingDomain editingDomain = org.eclipse.papyrus.core.utils.EditorUtils.getTransactionalEditingDomain();
		CompositeTransactionalCommand compositeCmd = new CompositeTransactionalCommand(editingDomain, "Create Element");

		for(IPreAction preAction : preActions) {
			Object context = getTargetEditPart().getModel();
			if(context instanceof View) {
				ICommand cmd = preAction.getNodePreCommand((View)context);
				if(cmd != null) {
					compositeCmd.add(cmd);
				}
			}
		}
		
		compositeCmd.add(new CommandProxy(createCommand));
		CreateUnspecifiedAdapter viewAdapter = new CreateUnspecifiedAdapter();
		viewAdapter.add(getCreateRequest());

		for(IPostAction action : postActions) {
			ICommand cmd = action.getPostCommand(viewAdapter);
			if(cmd != null) {
				compositeCmd.add(cmd);
			}
		}

		return compositeCmd;
	}

	/**
	 * checks if this tool realizes post actions
	 * 
	 * @return <code>true</code> if post actions must be executed
	 */
	protected boolean requiresPostCommitRun() {
		for(IPostAction action : postActions) {
			if(action.needsPostCommitRun()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void applyProperty(Object key, Object value) {
		if(IPapyrusPaletteConstant.ASPECT_ACTION_KEY.equals(key)) {
			// initialize the pre and post actions
			// the value should be a NodeList
			if(value instanceof NodeList) {
				NodeList nodeList = ((NodeList)value);
				for(int i = 0; i < nodeList.getLength(); i++) {
					org.w3c.dom.Node childNode = nodeList.item(i);
					String childName = childNode.getNodeName();
					if(IPapyrusPaletteConstant.POST_ACTION.equals(childName)) {
						// node is a post action => retrieve the id of the
						// factory in charge of this configuration
						IAspectActionProvider provider = AspectToolService.getInstance().getProvider(AspectToolService.getProviderId(childNode));
						if(provider != null) {
							IAspectAction action = provider.createAction(childNode);
							if(action instanceof IPostAction) {
								postActions.add((IPostAction)action);
							}
						} else {
							Activator.log.error("impossible to find factory with id: " + AspectToolService.getProviderId(childNode), null);
						}
					} else if(IPapyrusPaletteConstant.PRE_ACTION.equals(childName)) {
						IAspectActionProvider provider = AspectToolService.getInstance().getProvider(AspectToolService.getProviderId(childNode));
						if(provider != null) {
							IAspectAction action = provider.createAction(childNode);
							preActions.add((IPreAction)action);
						} else {
							Activator.log.error("impossible to find factory with id: " + AspectToolService.getProviderId(childNode), null);
						}
					}
				}
			}
			return;
		}
		super.applyProperty(key, value);
	}

	/**
	 * Returns the list of element types
	 * 
	 * @return the list of element types
	 */
	public List<IElementType> getElementTypes() {
		return elementTypes;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Request createTargetRequest() {
		CreateAspectUnspecifiedTypeRequest request = new CreateAspectUnspecifiedTypeRequest(getElementTypes(), getPreferencesHint());
		request.getExtendedData().put(ID_ASPECT_ACTION, postActions);
		return request;
	}

	@SuppressWarnings("unchecked")
	public static List<IAspectAction> getAspectActions(Request request) {
		return (List<IAspectAction>)(request == null ? Collections.emptyList() : getAspectActions(request.getExtendedData()));
	}

	@SuppressWarnings("unchecked")
	public static List<IAspectAction> getAspectActions(Map map) {
		return (List<IAspectAction>)(map == null ? Collections.emptyList() : map.get(ID_ASPECT_ACTION));
	}

	public String createPrePostActionRepresentation() {
		StringBuffer buffer = new StringBuffer();
		boolean flag = false;
		for(IAspectAction post : postActions) {
			if(post instanceof IFeatureSetterAspectAction) {
				IFeatureSetterAspectAction featureSetter = (IFeatureSetterAspectAction)post;
				if(flag) {
					buffer.append("|");
					for(EStructuralFeature f : featureSetter.getAllImpactedFeatures()) {
						EClass eClass = f.eClass();
						buffer.append(eClass.getEPackage().getNsURI());
						buffer.append(",");
						buffer.append(eClass.getName());
						buffer.append(",");
						buffer.append(f.getName());
					}
				}
				flag = true;
			}
		}
		return buffer.toString();
	}

	public class CreateAspectUnspecifiedTypeRequest extends CreateUnspecifiedTypeRequest {

		/**
		 * Constructor.
		 * 
		 * @param elementTypes
		 * @param preferencesHint
		 */
		public CreateAspectUnspecifiedTypeRequest(List<IElementType> elementTypes, PreferencesHint preferencesHint) {
			super(elementTypes, preferencesHint);
		}

		/**
		 * Creates a <code>CreateViewRequest</code> or <code>CreateViewAndElementRequest</code> for each creation hint and
		 * adds it to the map of requests.
		 */
		protected void createRequests() {
			for(Iterator<IElementType> iter = elementTypes.iterator(); iter.hasNext();) {
				IElementType elementType = iter.next();

				Request request = null;
				if(elementType instanceof INotationType) {
					ViewDescriptor viewDescriptor = new ViewDescriptor(null, Node.class, ((INotationType)elementType).getSemanticHint(), getPreferencesHint());
					request = new CreateViewRequest(viewDescriptor);
				} else if(elementType instanceof IHintedType) {
					ViewAndElementDescriptor viewDescriptor = new ViewAndElementDescriptor(new CreateElementRequestAdapter(new CreateElementRequest(elementType)), Node.class, getGraphicalHint((IHintedType)elementType), getPreferencesHint());
					request = new CreateViewAndElementRequest(viewDescriptor);
					request.setExtendedData(getExtendedData());
				} else {
					ViewAndElementDescriptor viewDescriptor = new ViewAndElementDescriptor(new CreateElementRequestAdapter(new CreateElementRequest(elementType)), Node.class, getPreferencesHint());
					request = new CreateViewAndElementRequest(viewDescriptor);
					request.setExtendedData(getExtendedData());
				}

				request.setType(getType());
				requests.put(elementType, request);
			}
		}

		/**
		 * Returns the semantic hint for the given type. In case of extended
		 * type, it returns the hint of the super type
		 * 
		 * @param elementType
		 *        the hinted element type from which hint is retrieved
		 * @return
		 */
		protected String getGraphicalHint(IHintedType elementType) {
			String hint = ((IHintedType)elementType).getSemanticHint();
			return hint;
		}

	}

}