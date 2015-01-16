package aspects.xpt.diagram.editpolicies

import org.eclipse.gmf.codegen.gmfgen.GenDiagram
import com.google.inject.Inject
import xpt.Common
import com.google.inject.Singleton
import xpt.CodeStyle

@Singleton class TextSelectionEditPolicy extends xpt.diagram.editpolicies.TextSelectionEditPolicy {
	
	@Inject extension Common
	@Inject extension CodeStyle
	
	override textFeedback_createFocusFeedbackFigure(GenDiagram it) '''
		«generatedMemberComment»
		protected org.eclipse.draw2d.IFigure createFocusFeedbackFigure() {
			return new org.eclipse.draw2d.Figure() {
		
			«overrideC»
			protected void paintFigure(org.eclipse.draw2d.Graphics graphics) {
				graphics.drawFocus(getBounds().getResized(-1, -1));
			}
			};
		}
	'''
	
	override textFeedback_getHostPositionListener(GenDiagram it) '''
		«generatedMemberComment»
		private org.eclipse.draw2d.FigureListener getHostPositionListener() {
			if (hostPositionListener == null) {
				hostPositionListener = new org.eclipse.draw2d.FigureListener() {
					«overrideI»
					public void figureMoved(org.eclipse.draw2d.IFigure source) {
						refreshFeedback();
					}
				};
			}
			return hostPositionListener;
		}
	'''
	
}