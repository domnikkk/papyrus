/*****************************************************************************
 * Copyright (c) 2010, 2014 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mickael ADAM (ALL4TEC) mickael.adam@all4tec.net - Initial API and Implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.common.helper;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.IMaskManagedLabelEditPolicy;
import org.eclipse.papyrus.infra.gmfdiag.common.editpolicies.IndirectMaskLabelEditPolicy;
import org.eclipse.papyrus.uml.tools.utils.CollaborationUseUtil;
import org.eclipse.papyrus.uml.tools.utils.ICustomAppearance;
import org.eclipse.papyrus.uml.tools.utils.InstanceSpecificationUtil;
import org.eclipse.papyrus.uml.tools.utils.MultiplicityElementUtil;
import org.eclipse.papyrus.uml.tools.utils.NamedElementUtil;
import org.eclipse.papyrus.uml.tools.utils.OperationUtil;
import org.eclipse.papyrus.uml.tools.utils.ParameterUtil;
import org.eclipse.papyrus.uml.tools.utils.PortUtil;
import org.eclipse.papyrus.uml.tools.utils.PropertyUtil;
import org.eclipse.papyrus.uml.tools.utils.SignalUtil;
import org.eclipse.papyrus.uml.tools.utils.TypeUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TypedElement;

//TODO Check for usefull property to display

/**
 * Helper for labels displaying {@link NamedElement}.
 */
public class FloatingLabelHelper extends StereotypedElementLabelHelper {

	// Einstance
	/** The label helper. */
	private static FloatingLabelHelper labelHelper;

	/**
	 * Gets the single instance of FloatingLabelHelper.
	 *
	 * @return single instance of FloatingLabelHelper
	 */
	public static FloatingLabelHelper getInstance() {
		if (labelHelper == null) {
			labelHelper = new FloatingLabelHelper();
		}
		return labelHelper;
	}

	/** Map for masks. */
	protected final Map<String, String> masks = new HashMap<String, String>();

	/**
	 * Instantiates a new floating label helper.
	 */
	protected FloatingLabelHelper() {
		// initialize the map

		/**
		 * Style constant for visibility display in labels.
		 */
		masks.put(ICustomAppearance.DISP_VISIBILITY, "Visibility");

		/**
		 * Style constant for isDerive display in labels.
		 */
		masks.put(ICustomAppearance.DISP_DERIVE, "Derived");

		/**
		 * Style constant for name display in labels.
		 */
		masks.put(ICustomAppearance.DISP_NAME, "Name");

		/**
		 * Style constant for type display in labels.
		 */
		masks.put(ICustomAppearance.DISP_TYPE, "Type");

		/**
		 * Style constant for multiplicity display in labels.
		 */
		masks.put(ICustomAppearance.DISP_MULTIPLICITY, "Multiplicity");

		/**
		 * Style constant for default value display in labels.
		 */
		masks.put(ICustomAppearance.DISP_DEFAULT_VALUE, "Default  Value");

		/**
		 * Style constant for modifiers display in labels.
		 */
		masks.put(ICustomAppearance.DISP_MODIFIERS, "Modifiers");

		/** Style constant for carriage return in labels */
		masks.put(ICustomAppearance.DISP_MULTI_LINE, "Multiline");

		/** Style constant for operation#parameter direction display in labels */
		masks.put(ICustomAppearance.DISP_PARAMETER_DIRECTION, "Parameters Direction");

		/** Style constant for direction display in labels */
		masks.put(ICustomAppearance.DISP_DIRECTION, "Direction");

		/** Style constant for operation#parameter name display in labels */
		masks.put(ICustomAppearance.DISP_PARAMETER_NAME, "Parameters Name");

		/** Style constant for operation#parameter type display in labels */
		masks.put(ICustomAppearance.DISP_PARAMETER_TYPE, "Parameters Type");

		/** Style constant for operation#parameter multiplicity display in labels */
		masks.put(ICustomAppearance.DISP_PARAMETER_MULTIPLICITY, "Parameters Multiplicity");

		/** Style constant for operation#parameter default value display in labels */
		masks.put(ICustomAppearance.DISP_PARAMETER_DEFAULT, "Parameters Default");

		/** Style constant for operation#parameter modifiers display in labels */
		masks.put(ICustomAppearance.DISP_PARAMETER_MODIFIERS, "Parameters Modifiers");

		/** Style constant for return type display in labels */
		masks.put(ICustomAppearance.DISP_RT_TYPE, "returnType");

		/** Style constant for return multiplicity display in labels */
		masks.put(ICustomAppearance.DISP_RT_MULTIPLICITY, "Return Multiplicity");

		/** Style constant for conjugated labels */
		masks.put(ICustomAppearance.DISP_CONJUGATED, "Conjugated");
	}

	/**
	 * Computes the label that should be displayed by the figure managed by this
	 * edit part.
	 *
	 * @param editPart
	 *            the edit part that controls the {@link NamedElement} to be
	 *            displayed
	 * @return the label corresponding to the specific display of the property
	 *         ("default" display given by preferences or specific display given
	 *         by eAnnotation).
	 */
	@Override
	protected String elementLabel(GraphicalEditPart editPart) {
		IMaskManagedLabelEditPolicy policy = (IMaskManagedLabelEditPolicy) editPart.getEditPolicy(IMaskManagedLabelEditPolicy.MASK_MANAGED_LABEL_EDIT_POLICY);
		if (policy == null) {
			policy = (IMaskManagedLabelEditPolicy) editPart.getEditPolicy(IndirectMaskLabelEditPolicy.INDRIRECT_MASK_MANAGED_LABEL);
		}

		Collection<String> displayValue = Collections.emptySet();

		if (policy != null) {
			displayValue = policy.getCurrentDisplayValue();
		}

		return parseString(editPart, displayValue);
	}

	/**
	 * Parses the string.
	 *
	 * @param editPart
	 *            the edit part
	 * @param displayValue
	 *            the display value
	 * @return the string
	 */
	protected String parseString(GraphicalEditPart editPart, Collection<String> displayValue) {
		NamedElement namedElement = getUMLElement(editPart);

		if (namedElement != null) {
			return getCustomLabel(namedElement, displayValue);
		}

		return "";
	}


	/**
	 * Returns the map of masks used to display a {@link NamedElement}.
	 *
	 * @return the {@link Map} of masks used to display a {@link NamedElement}
	 */
	public Map<String, String> getMasks() {
		return masks;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NamedElement getUMLElement(GraphicalEditPart editPart) {
		if (editPart.getModel() instanceof View) {
			View view = (View) editPart.getModel();
			if (view.getElement() instanceof NamedElement) {
				return (NamedElement) view.getElement();
			}
		}
		return null;
	}

	/**
	 * return the custom label of the property, given UML2 specification and a custom style.
	 *
	 * @param namedElement
	 *            the integer representing the style of the label
	 * @param maskValues
	 *            the mask values
	 * @return the string corresponding to the label of the property
	 */
	public static String getCustomLabel(NamedElement namedElement, Collection<String> maskValues) {

		// Use of specific existing custom label

		// use CollaborationUse custom label
		if (namedElement instanceof CollaborationUse) {
			return CollaborationUseUtil.getCustomLabel((CollaborationUse) namedElement, maskValues);
		}

		// use InstanceSpecification custom label
		if (namedElement instanceof InstanceSpecification) {
			return InstanceSpecificationUtil.getCustomLabel((InstanceSpecification) namedElement, maskValues);
		}

		// use Operation custom label
		if (namedElement instanceof Operation) {
			return OperationUtil.getCustomLabel((Operation) namedElement, maskValues);
		}

		// use Parameter custom label
		if (namedElement instanceof Parameter) {
			return ParameterUtil.getCustomLabel((Parameter) namedElement, maskValues);
		}

		// use Signal custom label
		if (namedElement instanceof Signal) {
			return SignalUtil.getCustomLabel((Signal) namedElement, maskValues);
		}

		// use Port custom label
		if (namedElement instanceof Port) {
			return PortUtil.getCustomLabel((Port) namedElement, maskValues);
		}

		// use Property custom label
		if (namedElement instanceof Property) {
			return PropertyUtil.getCustomLabel((Property) namedElement, maskValues);
		}
		// TODO add others usefull properties

		// default custom label
		StringBuffer buffer = new StringBuffer();

		// visibility
		if (maskValues.contains(ICustomAppearance.DISP_VISIBILITY)) {
			buffer.append(" ");
			buffer.append(NamedElementUtil.getVisibilityAsSign(namedElement));
		}

		// derived property for association
		if (namedElement instanceof Association) {
			if (maskValues.contains(ICustomAppearance.DISP_DERIVE)) {
				if (((Association) namedElement).isDerived()) {
					buffer.append("/");
				}
			}
		}
		// name
		if (maskValues.contains(ICustomAppearance.DISP_NAME)) {
			buffer.append(" ");
			buffer.append(namedElement.getName());
		}

		// Type of TypedElement
		if (namedElement instanceof TypedElement) {
			if (maskValues.contains(ICustomAppearance.DISP_TYPE)) {
				// type
				if (((TypedElement) namedElement).getType() != null) {
					buffer.append(": " + ((TypedElement) namedElement).getType().getName());
				} else {
					buffer.append(": " + TypeUtil.UNDEFINED_TYPE_NAME);
				}
			}
		}

		// Multiplicity
		if (namedElement instanceof MultiplicityElement) {
			if (maskValues.contains(ICustomAppearance.DISP_MULTIPLICITY)) {
				// multiplicity -> do not display [1]
				String multiplicity = MultiplicityElementUtil.getMultiplicityAsString((MultiplicityElement) namedElement);
				buffer.append(multiplicity);
			}
		}

		// Template Parameter(not sure of the uml element
		if (namedElement instanceof TemplateParameter) {
			if (maskValues.contains(ICustomAppearance.DISP_DEFAULT_VALUE)) {
				// default value
				if (((TemplateParameter) namedElement).getDefault() != null) {
					buffer.append(" = ");
					buffer.append(((TemplateParameter) namedElement).getDefault());
				}
			}
		}

		return buffer.toString();
	}
}
