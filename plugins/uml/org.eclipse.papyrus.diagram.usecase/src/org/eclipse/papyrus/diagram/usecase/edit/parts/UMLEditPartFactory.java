/*****************************************************************************
 * Copyright (c) 2009 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Emilien Perico (Atos Origin) emilien.perico@atosorigin.com - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.usecase.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.papyrus.diagram.usecase.part.UMLVisualIDRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class UMLEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if(model instanceof View) {
			View view = (View)model;
			switch(UMLVisualIDRegistry.getVisualID(view)) {

			case UseCaseDiagramEditPart.VISUAL_ID:
				return new UseCaseDiagramEditPart(view);

			case ActorEditPart.VISUAL_ID:
				return new ActorEditPart(view);

			case ActorNameEditPart.VISUAL_ID:
				return new ActorNameEditPart(view);

			case Actor2EditPart.VISUAL_ID:
				return new Actor2EditPart(view);

			case ActorName2EditPart.VISUAL_ID:
				return new ActorName2EditPart(view);

			case UseCaseEditPart.VISUAL_ID:
				return new UseCaseEditPart(view);

			case UseCaseNameEditPart.VISUAL_ID:
				return new UseCaseNameEditPart(view);

			case UseCase2EditPart.VISUAL_ID:
				return new UseCase2EditPart(view);

			case UseCaseName2EditPart.VISUAL_ID:
				return new UseCaseName2EditPart(view);

			case ComponentEditPart.VISUAL_ID:
				return new ComponentEditPart(view);

			case ComponentNameEditPart.VISUAL_ID:
				return new ComponentNameEditPart(view);

			case PackageEditPartTN.VISUAL_ID:
				return new PackageEditPartTN(view);

			case PackageNameEditPartTN.VISUAL_ID:
				return new PackageNameEditPartTN(view);

			case ConstraintEditPart.VISUAL_ID:
				return new ConstraintEditPart(view);

			case ConstraintNameEditPart.VISUAL_ID:
				return new ConstraintNameEditPart(view);

			case CommentEditPart.VISUAL_ID:
				return new CommentEditPart(view);

			case CommentBodyEditPart.VISUAL_ID:
				return new CommentBodyEditPart(view);

			case ShortCutDiagramEditPart.VISUAL_ID:
				return new ShortCutDiagramEditPart(view);

			case DiagramNameEditPart.VISUAL_ID:
				return new DiagramNameEditPart(view);

			case ExtensionPointEditPart.VISUAL_ID:
				return new ExtensionPointEditPart(view);

			case ExtensionPoint2EditPart.VISUAL_ID:
				return new ExtensionPoint2EditPart(view);

			case UseCase3EditPart.VISUAL_ID:
				return new UseCase3EditPart(view);

			case UseCaseName3EditPart.VISUAL_ID:
				return new UseCaseName3EditPart(view);

			case Component2EditPart.VISUAL_ID:
				return new Component2EditPart(view);

			case ComponentName2EditPart.VISUAL_ID:
				return new ComponentName2EditPart(view);

			case Comment2EditPart.VISUAL_ID:
				return new Comment2EditPart(view);

			case CommentBody2EditPart.VISUAL_ID:
				return new CommentBody2EditPart(view);

			case Constraint2EditPart.VISUAL_ID:
				return new Constraint2EditPart(view);

			case ConstraintName2EditPart.VISUAL_ID:
				return new ConstraintName2EditPart(view);

			case Actor4EditPart.VISUAL_ID:
				return new Actor4EditPart(view);

			case ActorName4EditPart.VISUAL_ID:
				return new ActorName4EditPart(view);

			case Constraint3EditPart.VISUAL_ID:
				return new Constraint3EditPart(view);

			case ConstraintName3EditPart.VISUAL_ID:
				return new ConstraintName3EditPart(view);

			case Actor3EditPart.VISUAL_ID:
				return new Actor3EditPart(view);

			case ActorName3EditPart.VISUAL_ID:
				return new ActorName3EditPart(view);

			case UseCase4EditPart.VISUAL_ID:
				return new UseCase4EditPart(view);

			case UseCaseName4EditPart.VISUAL_ID:
				return new UseCaseName4EditPart(view);

			case Component3EditPart.VISUAL_ID:
				return new Component3EditPart(view);

			case ComponentName3EditPart.VISUAL_ID:
				return new ComponentName3EditPart(view);

			case PackageEditPartCN.VISUAL_ID:
				return new PackageEditPartCN(view);

			case PackageNameEditPartCN.VISUAL_ID:
				return new PackageNameEditPartCN(view);

			case UseCasePointsEditPart.VISUAL_ID:
				return new UseCasePointsEditPart(view);

			case UseCaseExtensionpointsEditPart.VISUAL_ID:
				return new UseCaseExtensionpointsEditPart(view);

			case ComponentUsecasesEditPart.VISUAL_ID:
				return new ComponentUsecasesEditPart(view);

			case UseCasePoints2EditPart.VISUAL_ID:
				return new UseCasePoints2EditPart(view);

			case ComponentUsecases2EditPart.VISUAL_ID:
				return new ComponentUsecases2EditPart(view);

			case UseCasePoints3EditPart.VISUAL_ID:
				return new UseCasePoints3EditPart(view);

			case ComponentUsecases3EditPart.VISUAL_ID:
				return new ComponentUsecases3EditPart(view);

			case PackagePackageableElementCompartment2EditPart.VISUAL_ID:
				return new PackagePackageableElementCompartment2EditPart(view);

			case PackagePackageableElementCompartmentEditPart.VISUAL_ID:
				return new PackagePackageableElementCompartmentEditPart(view);

			case IncludeEditPart.VISUAL_ID:
				return new IncludeEditPart(view);

			case IncludeLink_fixedEditPart.VISUAL_ID:
				return new IncludeLink_fixedEditPart(view);

			case ExtendEditPart.VISUAL_ID:
				return new ExtendEditPart(view);

			case ExtendsLink_fixedEditPart.VISUAL_ID:
				return new ExtendsLink_fixedEditPart(view);

			case GeneralizationEditPart.VISUAL_ID:
				return new GeneralizationEditPart(view);

			case AssociationEditPart.VISUAL_ID:
				return new AssociationEditPart(view);

			case AssociationNameEditPart.VISUAL_ID:
				return new AssociationNameEditPart(view);

			case ConstraintConstrainedElementEditPart.VISUAL_ID:
				return new ConstraintConstrainedElementEditPart(view);

			case DependencyEditPart.VISUAL_ID:
				return new DependencyEditPart(view);

			case DependencyNameEditPart.VISUAL_ID:
				return new DependencyNameEditPart(view);

			case CommentAnnotatedElementEditPart.VISUAL_ID:
				return new CommentAnnotatedElementEditPart(view);

			case AbstractionEditPart.VISUAL_ID:
				return new AbstractionEditPart(view);

			case AbstractionNameEditPart.VISUAL_ID:
				return new AbstractionNameEditPart(view);

			case AppliedStereotypeAbstractionEditPart.VISUAL_ID:
				return new AppliedStereotypeAbstractionEditPart(view);

			case UsageEditPart.VISUAL_ID:
				return new UsageEditPart(view);

			case UsageNameEditPart.VISUAL_ID:
				return new UsageNameEditPart(view);

			case AppliedStereotypeUsageEditPart.VISUAL_ID:
				return new AppliedStereotypeUsageEditPart(view);

			case RealizationEditPart.VISUAL_ID:
				return new RealizationEditPart(view);

			case RealizationNameEditPart.VISUAL_ID:
				return new RealizationNameEditPart(view);

			case AppliedStereotypeRealizationEditPart.VISUAL_ID:
				return new AppliedStereotypeRealizationEditPart(view);

			case PackageMergeEditPart.VISUAL_ID:
				return new PackageMergeEditPart(view);

			case AppliedStereotypePackageMergeEditPart.VISUAL_ID:
				return new AppliedStereotypePackageMergeEditPart(view);

			case PackageImportEditPart.VISUAL_ID:
				return new PackageImportEditPart(view);

			case AppliedStereotypePackageImportEditPart.VISUAL_ID:
				return new AppliedStereotypePackageImportEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		if(source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel)source.getFigure());
		else {
			return new LabelCellEditorLocator((Label)source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text)celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if(getWrapLabel().isTextWrapOn() && getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width, SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if(!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text)celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2, 0));
			if(!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
