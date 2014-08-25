/**
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.uml.diagram.timing.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.common.parser.stereotype.AppliedStereotypeParser;
import org.eclipse.papyrus.uml.diagram.timing.custom.parsers.ConstraintParser;
import org.eclipse.papyrus.uml.diagram.timing.custom.parsers.StateDefinitionParser;
import org.eclipse.papyrus.uml.diagram.timing.custom.parsers.TickParser;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.CompactLifelineNameEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.CompactStateInvariantNameEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DestructionOccurrenceSpecificationAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DestructionOccurrenceSpecificationLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DurationConstraintSpecificationEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.DurationObservationNameEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FullLifelineNameEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.FullStateInvariantAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.GateLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.GeneralOrderingNameEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.InteractionNameEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageAsyncAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageAsyncNameLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageCreateAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageCreateNameLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageDeleteAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageDeleteNameLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageFoundAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageFoundNameLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageLostAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageLostNameLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageOccurrenceSpecificationAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageOccurrenceSpecificationLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageReplyAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageReplyNameLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageSyncAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.MessageSyncNameLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.OccurrenceSpecificationAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.OccurrenceSpecificationLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.StateDefinitionLabelEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.StateInvariantAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TickNameEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimeConstraintAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimeConstraintSpecificationEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimeObservationAppliedStereotypeEditPart;
import org.eclipse.papyrus.uml.diagram.timing.edit.parts.TimeObservationNameEditPart;
import org.eclipse.papyrus.uml.diagram.timing.parsers.MessageFormatParser;
import org.eclipse.papyrus.uml.diagram.timing.part.UMLVisualIDRegistry;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class UMLParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser interactionName_37Parser;

	/**
	 * @generated
	 */
	private IParser getInteractionName_37Parser() {
		if (interactionName_37Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			interactionName_37Parser = parser;
		}
		return interactionName_37Parser;
	}

	/**
	 * @generated
	 */
	private IParser lifelineName_21Parser;

	/**
	 * @generated
	 */
	private IParser getLifelineName_21Parser() {
		if (lifelineName_21Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			lifelineName_21Parser = parser;
		}
		return lifelineName_21Parser;
	}

	/**
	 * @generated
	 */
	private IParser lifelineName_22Parser;

	/**
	 * @generated
	 */
	private IParser getLifelineName_22Parser() {
		if (lifelineName_22Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			lifelineName_22Parser = parser;
		}
		return lifelineName_22Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser stateInvariantName_62Parser;

	/**
	 * @generated
	 */
	private IParser getStateInvariantName_62Parser() {
		if (stateInvariantName_62Parser == null) {
			stateInvariantName_62Parser = new AppliedStereotypeParser();
		}
		return stateInvariantName_62Parser;
	}

	/**
	 * @generated
	 */
	private IParser stateInvariantName_31Parser;

	/**
	 * @generated
	 */
	private IParser getStateInvariantName_31Parser() {
		if (stateInvariantName_31Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			stateInvariantName_31Parser = parser;
		}
		return stateInvariantName_31Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser stateInvariantName_64Parser;

	/**
	 * @generated
	 */
	private IParser getStateInvariantName_64Parser() {
		if (stateInvariantName_64Parser == null) {
			stateInvariantName_64Parser = new AppliedStereotypeParser();
		}
		return stateInvariantName_64Parser;
	}

	/**
	 * @generated
	 */
	private IParser occurrenceSpecificationName_10Parser;

	/**
	 * @generated
	 */
	private IParser getOccurrenceSpecificationName_10Parser() {
		if (occurrenceSpecificationName_10Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			occurrenceSpecificationName_10Parser = parser;
		}
		return occurrenceSpecificationName_10Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser occurrenceSpecificationName_58Parser;

	/**
	 * @generated
	 */
	private IParser getOccurrenceSpecificationName_58Parser() {
		if (occurrenceSpecificationName_58Parser == null) {
			occurrenceSpecificationName_58Parser = new AppliedStereotypeParser();
		}
		return occurrenceSpecificationName_58Parser;
	}

	/**
	 * @generated
	 */
	private IParser messageOccurrenceSpecificationName_14Parser;

	/**
	 * @generated
	 */
	private IParser getMessageOccurrenceSpecificationName_14Parser() {
		if (messageOccurrenceSpecificationName_14Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			messageOccurrenceSpecificationName_14Parser = parser;
		}
		return messageOccurrenceSpecificationName_14Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser messageOccurrenceSpecificationName_59Parser;

	/**
	 * @generated
	 */
	private IParser getMessageOccurrenceSpecificationName_59Parser() {
		if (messageOccurrenceSpecificationName_59Parser == null) {
			messageOccurrenceSpecificationName_59Parser = new AppliedStereotypeParser();
		}
		return messageOccurrenceSpecificationName_59Parser;
	}

	/**
	 * @generated
	 */
	private StateDefinitionParser nodeLabel_38Parser;

	/**
	 * @generated
	 */
	private IParser getNodeLabel_38Parser() {
		if (nodeLabel_38Parser == null) {
			nodeLabel_38Parser = new StateDefinitionParser();
		}
		return nodeLabel_38Parser;
	}

	/**
	 * @generated
	 */
	private ConstraintParser timeConstraintSpecification_30Parser;

	/**
	 * @generated
	 */
	private IParser getTimeConstraintSpecification_30Parser() {
		if (timeConstraintSpecification_30Parser == null) {
			timeConstraintSpecification_30Parser = new ConstraintParser();
		}
		return timeConstraintSpecification_30Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser timeConstraintName_65Parser;

	/**
	 * @generated
	 */
	private IParser getTimeConstraintName_65Parser() {
		if (timeConstraintName_65Parser == null) {
			timeConstraintName_65Parser = new AppliedStereotypeParser();
		}
		return timeConstraintName_65Parser;
	}

	/**
	 * @generated
	 */
	private IParser timeObservationName_34Parser;

	/**
	 * @generated
	 */
	private IParser getTimeObservationName_34Parser() {
		if (timeObservationName_34Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			timeObservationName_34Parser = parser;
		}
		return timeObservationName_34Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser timeObservationName_66Parser;

	/**
	 * @generated
	 */
	private IParser getTimeObservationName_66Parser() {
		if (timeObservationName_66Parser == null) {
			timeObservationName_66Parser = new AppliedStereotypeParser();
		}
		return timeObservationName_66Parser;
	}

	/**
	 * @generated
	 */
	private ConstraintParser durationConstraintSpecification_33Parser;

	/**
	 * @generated
	 */
	private IParser getDurationConstraintSpecification_33Parser() {
		if (durationConstraintSpecification_33Parser == null) {
			durationConstraintSpecification_33Parser = new ConstraintParser();
		}
		return durationConstraintSpecification_33Parser;
	}

	/**
	 * @generated
	 */
	private IParser durationObservationName_35Parser;

	/**
	 * @generated
	 */
	private IParser getDurationObservationName_35Parser() {
		if (durationObservationName_35Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			durationObservationName_35Parser = parser;
		}
		return durationObservationName_35Parser;
	}

	/**
	 * @generated
	 */
	private IParser generalOrderingName_68Parser;

	/**
	 * @generated
	 */
	private IParser getGeneralOrderingName_68Parser() {
		if (generalOrderingName_68Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			generalOrderingName_68Parser = parser;
		}
		return generalOrderingName_68Parser;
	}

	/**
	 * @generated
	 */
	private TickParser nodeLabel_36Parser;

	/**
	 * @generated
	 */
	private IParser getNodeLabel_36Parser() {
		if (nodeLabel_36Parser == null) {
			nodeLabel_36Parser = new TickParser();
		}
		return nodeLabel_36Parser;
	}

	/**
	 * @generated
	 */
	private IParser destructionOccurrenceSpecificationName_32Parser;

	/**
	 * @generated
	 */
	private IParser getDestructionOccurrenceSpecificationName_32Parser() {
		if (destructionOccurrenceSpecificationName_32Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			destructionOccurrenceSpecificationName_32Parser = parser;
		}
		return destructionOccurrenceSpecificationName_32Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser destructionOccurrenceSpecificationName_63Parser;

	/**
	 * @generated
	 */
	private IParser getDestructionOccurrenceSpecificationName_63Parser() {
		if (destructionOccurrenceSpecificationName_63Parser == null) {
			destructionOccurrenceSpecificationName_63Parser = new AppliedStereotypeParser();
		}
		return destructionOccurrenceSpecificationName_63Parser;
	}

	/**
	 * @generated
	 */
	private IParser gateName_70Parser;

	/**
	 * @generated
	 */
	private IParser getGateName_70Parser() {
		if (gateName_70Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			gateName_70Parser = parser;
		}
		return gateName_70Parser;
	}

	/**
	 * @generated
	 */
	private IParser messageName_56Parser;

	/**
	 * @generated
	 */
	private IParser getMessageName_56Parser() {
		if (messageName_56Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			messageName_56Parser = parser;
		}
		return messageName_56Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser messageLabel_57Parser;

	/**
	 * @generated
	 */
	private IParser getMessageLabel_57Parser() {
		if (messageLabel_57Parser == null) {
			messageLabel_57Parser = new AppliedStereotypeParser();
		}
		return messageLabel_57Parser;
	}

	/**
	 * @generated
	 */
	private IParser messageName_60Parser;

	/**
	 * @generated
	 */
	private IParser getMessageName_60Parser() {
		if (messageName_60Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			messageName_60Parser = parser;
		}
		return messageName_60Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser messageLabel_61Parser;

	/**
	 * @generated
	 */
	private IParser getMessageLabel_61Parser() {
		if (messageLabel_61Parser == null) {
			messageLabel_61Parser = new AppliedStereotypeParser();
		}
		return messageLabel_61Parser;
	}

	/**
	 * @generated
	 */
	private IParser messageName_42Parser;

	/**
	 * @generated
	 */
	private IParser getMessageName_42Parser() {
		if (messageName_42Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			messageName_42Parser = parser;
		}
		return messageName_42Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser messageLabel_43Parser;

	/**
	 * @generated
	 */
	private IParser getMessageLabel_43Parser() {
		if (messageLabel_43Parser == null) {
			messageLabel_43Parser = new AppliedStereotypeParser();
		}
		return messageLabel_43Parser;
	}

	/**
	 * @generated
	 */
	private IParser messageName_45Parser;

	/**
	 * @generated
	 */
	private IParser getMessageName_45Parser() {
		if (messageName_45Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			messageName_45Parser = parser;
		}
		return messageName_45Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser messageLabel_46Parser;

	/**
	 * @generated
	 */
	private IParser getMessageLabel_46Parser() {
		if (messageLabel_46Parser == null) {
			messageLabel_46Parser = new AppliedStereotypeParser();
		}
		return messageLabel_46Parser;
	}

	/**
	 * @generated
	 */
	private IParser messageName_48Parser;

	/**
	 * @generated
	 */
	private IParser getMessageName_48Parser() {
		if (messageName_48Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			messageName_48Parser = parser;
		}
		return messageName_48Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser messageLabel_49Parser;

	/**
	 * @generated
	 */
	private IParser getMessageLabel_49Parser() {
		if (messageLabel_49Parser == null) {
			messageLabel_49Parser = new AppliedStereotypeParser();
		}
		return messageLabel_49Parser;
	}

	/**
	 * @generated
	 */
	private IParser messageName_51Parser;

	/**
	 * @generated
	 */
	private IParser getMessageName_51Parser() {
		if (messageName_51Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			messageName_51Parser = parser;
		}
		return messageName_51Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser messageLabel_52Parser;

	/**
	 * @generated
	 */
	private IParser getMessageLabel_52Parser() {
		if (messageLabel_52Parser == null) {
			messageLabel_52Parser = new AppliedStereotypeParser();
		}
		return messageLabel_52Parser;
	}

	/**
	 * @generated
	 */
	private IParser messageName_54Parser;

	/**
	 * @generated
	 */
	private IParser getMessageName_54Parser() {
		if (messageName_54Parser == null) {
			EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			messageName_54Parser = parser;
		}
		return messageName_54Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser messageLabel_55Parser;

	/**
	 * @generated
	 */
	private IParser getMessageLabel_55Parser() {
		if (messageLabel_55Parser == null) {
			messageLabel_55Parser = new AppliedStereotypeParser();
		}
		return messageLabel_55Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case InteractionNameEditPart.VISUAL_ID:
			return getInteractionName_37Parser();
		case FullLifelineNameEditPart.VISUAL_ID:
			return getLifelineName_21Parser();
		case CompactLifelineNameEditPart.VISUAL_ID:
			return getLifelineName_22Parser();
		case FullStateInvariantAppliedStereotypeEditPart.VISUAL_ID:
			return getStateInvariantName_62Parser();
		case CompactStateInvariantNameEditPart.VISUAL_ID:
			return getStateInvariantName_31Parser();
		case StateInvariantAppliedStereotypeEditPart.VISUAL_ID:
			return getStateInvariantName_64Parser();
		case OccurrenceSpecificationLabelEditPart.VISUAL_ID:
			return getOccurrenceSpecificationName_10Parser();
		case OccurrenceSpecificationAppliedStereotypeEditPart.VISUAL_ID:
			return getOccurrenceSpecificationName_58Parser();
		case MessageOccurrenceSpecificationLabelEditPart.VISUAL_ID:
			return getMessageOccurrenceSpecificationName_14Parser();
		case MessageOccurrenceSpecificationAppliedStereotypeEditPart.VISUAL_ID:
			return getMessageOccurrenceSpecificationName_59Parser();
		case StateDefinitionLabelEditPart.VISUAL_ID:
			return getNodeLabel_38Parser();
		case TimeConstraintSpecificationEditPart.VISUAL_ID:
			return getTimeConstraintSpecification_30Parser();
		case TimeConstraintAppliedStereotypeEditPart.VISUAL_ID:
			return getTimeConstraintName_65Parser();
		case TimeObservationNameEditPart.VISUAL_ID:
			return getTimeObservationName_34Parser();
		case TimeObservationAppliedStereotypeEditPart.VISUAL_ID:
			return getTimeObservationName_66Parser();
		case DurationConstraintSpecificationEditPart.VISUAL_ID:
			return getDurationConstraintSpecification_33Parser();
		case DurationObservationNameEditPart.VISUAL_ID:
			return getDurationObservationName_35Parser();
		case GeneralOrderingNameEditPart.VISUAL_ID:
			return getGeneralOrderingName_68Parser();
		case TickNameEditPart.VISUAL_ID:
			return getNodeLabel_36Parser();
		case DestructionOccurrenceSpecificationLabelEditPart.VISUAL_ID:
			return getDestructionOccurrenceSpecificationName_32Parser();
		case DestructionOccurrenceSpecificationAppliedStereotypeEditPart.VISUAL_ID:
			return getDestructionOccurrenceSpecificationName_63Parser();
		case GateLabelEditPart.VISUAL_ID:
			return getGateName_70Parser();
		case MessageSyncNameLabelEditPart.VISUAL_ID:
			return getMessageName_56Parser();
		case MessageSyncAppliedStereotypeEditPart.VISUAL_ID:
			return getMessageLabel_57Parser();
		case MessageAsyncNameLabelEditPart.VISUAL_ID:
			return getMessageName_60Parser();
		case MessageAsyncAppliedStereotypeEditPart.VISUAL_ID:
			return getMessageLabel_61Parser();
		case MessageReplyNameLabelEditPart.VISUAL_ID:
			return getMessageName_42Parser();
		case MessageReplyAppliedStereotypeEditPart.VISUAL_ID:
			return getMessageLabel_43Parser();
		case MessageCreateNameLabelEditPart.VISUAL_ID:
			return getMessageName_45Parser();
		case MessageCreateAppliedStereotypeEditPart.VISUAL_ID:
			return getMessageLabel_46Parser();
		case MessageDeleteNameLabelEditPart.VISUAL_ID:
			return getMessageName_48Parser();
		case MessageDeleteAppliedStereotypeEditPart.VISUAL_ID:
			return getMessageLabel_49Parser();
		case MessageLostNameLabelEditPart.VISUAL_ID:
			return getMessageName_51Parser();
		case MessageLostAppliedStereotypeEditPart.VISUAL_ID:
			return getMessageLabel_52Parser();
		case MessageFoundNameLabelEditPart.VISUAL_ID:
			return getMessageName_54Parser();
		case MessageFoundAppliedStereotypeEditPart.VISUAL_ID:
			return getMessageLabel_55Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 *
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	@Override
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(UMLVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(UMLVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	@Override
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (UMLElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		@Override
		public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}
}
