package org.eclipse.papyrus.uml.diagram.usecase.figure;

import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;
import org.eclipse.papyrus.uml.diagram.common.figure.node.NodeNamedElementFigure;

public class UseCaseSubjectFigure extends NodeNamedElementFigure {

	static final org.eclipse.swt.graphics.Color THIS_BACK = new org.eclipse.swt.graphics.Color(null, 245, 245, 245);

	static final org.eclipse.swt.graphics.Font FUSECASESUBJECTFIGURE_NAME_FONT = new org.eclipse.swt.graphics.Font(org.eclipse.swt.widgets.Display.getCurrent(), org.eclipse.swt.widgets.Display.getDefault().getSystemFont().getFontData()[0].getName(), 9,
			org.eclipse.swt.SWT.NORMAL);

	private org.eclipse.draw2d.RectangleFigure fUseCaseSubjectFigure_contents;

	private org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel fUseCaseSubjectFigure_name;

	public UseCaseSubjectFigure() {
		org.eclipse.papyrus.uml.diagram.common.draw2d.PileLayout layoutThis = new org.eclipse.papyrus.uml.diagram.common.draw2d.PileLayout();
		layoutThis.setStretchBottom(true);
		this.setLayoutManager(layoutThis);
		this.setLineWidth(1);
		this.setBackgroundColor(THIS_BACK);
		createContents();
	}

	private void createContents() {
		org.eclipse.draw2d.RectangleFigure useCaseSubjectFigure_header0 = new org.eclipse.draw2d.RectangleFigure();
		useCaseSubjectFigure_header0.setLineWidth(1);
		this.add(useCaseSubjectFigure_header0);
		org.eclipse.papyrus.uml.diagram.common.draw2d.CenterLayout layoutUseCaseSubjectFigure_header0 = new org.eclipse.papyrus.uml.diagram.common.draw2d.CenterLayout();
		useCaseSubjectFigure_header0.setLayoutManager(layoutUseCaseSubjectFigure_header0);
		fUseCaseSubjectFigure_name = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel();
		fUseCaseSubjectFigure_name.setText("");
		fUseCaseSubjectFigure_name.setFont(FUSECASESUBJECTFIGURE_NAME_FONT);
		fUseCaseSubjectFigure_name.setBorder(new org.eclipse.draw2d.MarginBorder(MapModeUtil.getMapMode().DPtoLP(0), MapModeUtil.getMapMode().DPtoLP(5), MapModeUtil.getMapMode().DPtoLP(5), MapModeUtil.getMapMode().DPtoLP(5)));
		useCaseSubjectFigure_header0.add(fUseCaseSubjectFigure_name);
		fUseCaseSubjectFigure_contents = new org.eclipse.draw2d.RectangleFigure();
		fUseCaseSubjectFigure_contents.setLineWidth(1);
		this.add(fUseCaseSubjectFigure_contents);
		fUseCaseSubjectFigure_contents.setLayoutManager(new org.eclipse.draw2d.StackLayout());
	}

	private boolean myUseLocalCoordinates = false;

	protected boolean useLocalCoordinates() {
		return myUseLocalCoordinates;
	}

	protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
		myUseLocalCoordinates = useLocalCoordinates;
	}

	public org.eclipse.draw2d.RectangleFigure getUseCaseSubjectFigure_contents() {
		return fUseCaseSubjectFigure_contents;
	}

	public org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel getUseCaseSubjectFigure_name() {
		return fUseCaseSubjectFigure_name;
	}
}
