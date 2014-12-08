package aspects.xpt.editor

import com.google.inject.Inject
import xpt.Common
import xpt.CodeStyle
import org.eclipse.gmf.codegen.gmfgen.GenDiagram
import com.google.inject.Singleton

@Singleton class ResourceSetInfo extends xpt.editor.ResourceSetInfo {
	
	@Inject extension Common
	@Inject extension CodeStyle
	
	override handleResourceChangedSD(GenDiagram it) '''
		«generatedMemberComment»
		public boolean handleResourceChanged(final org.eclipse.emf.ecore.resource.Resource resource) {
			«updateSynchStateSD(it)»
			org.eclipse.swt.widgets.Display.getDefault().asyncExec(new java.lang.Runnable() {
				«overrideI»
				public void run() {
					handleElementChanged(ResourceSetInfo.this, resource, null);
				}
			});
			return true;
		}
	'''

	override handleResourceDeletedSD(GenDiagram it) '''
		«generatedMemberComment»
		public boolean handleResourceDeleted(org.eclipse.emf.ecore.resource.Resource resource) {
			«updateSynchStateSD(it)»
			org.eclipse.swt.widgets.Display.getDefault().asyncExec(new java.lang.Runnable() {
				«overrideI»
				public void run() {
					fireElementDeleted(ResourceSetInfo.this.getEditorInput());
				}
			});
			return true;
		}
	'''

	override handleResourceMovedSD(GenDiagram it) '''
		«generatedMemberComment»
		public boolean handleResourceMoved(org.eclipse.emf.ecore.resource.Resource resource, final org.eclipse.emf.common.util.URI newURI) {
			«updateSynchStateSD(it)»
			if (myDocument.getDiagram().eResource() == resource) {
				org.eclipse.swt.widgets.Display.getDefault().asyncExec(new java.lang.Runnable() {
					«overrideI»
					public void run() {
						handleElementMoved(ResourceSetInfo.this.getEditorInput(), newURI);
					}
				});
			} else {
				handleResourceDeleted(resource);
			}
			return true;
		}
	'''
	
}