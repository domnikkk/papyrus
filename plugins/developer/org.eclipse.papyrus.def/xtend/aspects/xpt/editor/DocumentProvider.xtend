/**
 * Copyright (c) 2007, 2010, 2013 Borland Software Corporation and others
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alexander Shatalin (Borland) - initial API and implementation
 *    Michael Golubev (Montages) - #386838 - migrate to Xtend2
 */
package aspects.xpt.editor

import com.google.inject.Inject
import com.google.inject.Singleton
import org.eclipse.gmf.codegen.gmfgen.GenDiagram
import plugin.Activator
import xpt.Common
import xpt.Externalizer
import xpt.CodeStyle
import xpt.editor.DiagramEditorUtil

@Singleton class DocumentProvider extends xpt.editor.DocumentProvider {
	@Inject extension Common;
	@Inject extension CodeStyle
	
	@Inject Activator xptActivator;
	@Inject Externalizer xptExternalizer;
	@Inject DiagramEditorUtil xptDiagramEditorUtil

	

	override setDocumentContent(GenDiagram it) '''
		«generatedMemberComment»
		protected void setDocumentContent(org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument document, org.eclipse.ui.IEditorInput element) throws org.eclipse.core.runtime.CoreException {
			org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument diagramDocument = (org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument) document;
			org.eclipse.emf.transaction.TransactionalEditingDomain domain = diagramDocument.getEditingDomain();
			«IF null == it.editorGen.application»if (element instanceof «fileEditorInputClassFQName(it)») {
				org.eclipse.core.resources.IStorage storage = ((«fileEditorInputClassFQName(it)») element).getStorage();
				org.eclipse.gmf.runtime.notation.Diagram diagram = org.eclipse.gmf.runtime.diagram.ui.resources.editor.internal.util.DiagramIOUtil.load(domain, storage, true, getProgressMonitor());
				document.setContent(diagram);
			} else «ENDIF»if(element instanceof «uriEditorInputClassFQName(it)») {
				org.eclipse.emf.common.util.URI uri = ((«uriEditorInputClassFQName(it)») element).getURI();
				org.eclipse.emf.ecore.resource.Resource resource = null;
				try {
					resource = domain.getResourceSet().getResource(uri.trimFragment(), false);
					if (resource == null) {
						resource = domain.getResourceSet().createResource(uri.trimFragment());
					}
					if (!resource.isLoaded()) {
						try {
							@SuppressWarnings({ "rawtypes", "unchecked" })
							java.util.Map<?,?> options = new java.util.HashMap(org.eclipse.gmf.runtime.emf.core.resources.GMFResourceFactory.getDefaultLoadOptions());
							// @see 171060 
							// options.put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
							resource.load(options);
						} catch (java.io.IOException e) {
							resource.unload();
							throw e;
						}
					}
					if (uri.fragment() != null) {
						org.eclipse.emf.ecore.EObject rootElement = resource.getEObject(uri.fragment());
						if (rootElement instanceof org.eclipse.gmf.runtime.notation.Diagram) {
							document.setContent(rootElement);
							return;
						}
					} else {
						for (java.util.Iterator<org.eclipse.emf.ecore.EObject> it = resource.getContents().iterator(); it.hasNext();) {
							Object rootElement = it.next();
							if (rootElement instanceof org.eclipse.gmf.runtime.notation.Diagram) {
								document.setContent(rootElement);
								return;
							}
						}
					}
					throw new RuntimeException(«xptExternalizer.accessorCall(editorGen, i18nKeyForDocumentProviderNoDiagramInResourceError(it))»);
				} catch (Exception e) {
					org.eclipse.core.runtime.CoreException thrownExcp = null;
					if (e instanceof org.eclipse.core.runtime.CoreException) {
						thrownExcp = (org.eclipse.core.runtime.CoreException) e;
					} else {
						String msg = e.getLocalizedMessage();
						thrownExcp = new org.eclipse.core.runtime.CoreException(new org.eclipse.core.runtime.Status(org.eclipse.core.runtime.IStatus.ERROR, «xptActivator.qualifiedClassName(it.editorGen.plugin)».ID, 0, 
						msg != null ? msg : «xptExternalizer.accessorCall(editorGen, i18nKeyForDocumentProviderDiagramLoadingError(it))», e));
					}
					throw thrownExcp;
				}
			} else {
			«throwIncorrectInputException(it)»
			}	
		}
	'''
	
	override createEditingDomain(GenDiagram it) '''
		«generatedMemberComment»
		private org.eclipse.emf.transaction.TransactionalEditingDomain createEditingDomain() {
			org.eclipse.emf.transaction.TransactionalEditingDomain editingDomain = org.eclipse.gmf.runtime.diagram.core.DiagramEditingDomainFactory.getInstance().createEditingDomain();
			editingDomain.setID("«editingDomainID»"); «nonNLS(1)»
			final org.eclipse.emf.transaction.NotificationFilter diagramResourceModifiedFilter = org.eclipse.emf.transaction.NotificationFilter.createNotifierFilter(editingDomain.getResourceSet()).and(org.eclipse.emf.transaction.NotificationFilter.createEventTypeFilter(org.eclipse.emf.common.notify.Notification.ADD)).and(org.eclipse.emf.transaction.NotificationFilter.createFeatureFilter(org.eclipse.emf.ecore.resource.ResourceSet.class, org.eclipse.emf.ecore.resource.ResourceSet.RESOURCE_SET__RESOURCES));
			editingDomain.getResourceSet().eAdapters().add(new org.eclipse.emf.common.notify.Adapter() {
		
				private org.eclipse.emf.common.notify.Notifier myTarger;
		
				«overrideI»
				public org.eclipse.emf.common.notify.Notifier getTarget() {
					return myTarger;
				}
		
				«overrideI»
				public boolean isAdapterForType(Object type) {
					return false;
				}
		
				«overrideI»
				public void notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
					if (diagramResourceModifiedFilter.matches(notification)) {
						Object value = notification.getNewValue();
						if (value instanceof org.eclipse.emf.ecore.resource.Resource) {
							((org.eclipse.emf.ecore.resource.Resource) value).setTrackingModification(true);
						}
					}
				}
		
				«overrideI»
				public void setTarget(org.eclipse.emf.common.notify.Notifier newTarget) {
					myTarger = newTarget;
				}
					
			});	
			
			return editingDomain;
		}
	'''
	
	override doSaveDocument(GenDiagram it) '''
		«generatedMemberComment»
		protected void doSaveDocument(org.eclipse.core.runtime.IProgressMonitor monitor, Object element, org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument document, boolean overwrite) throws org.eclipse.core.runtime.CoreException {
			ResourceSetInfo info = getResourceSetInfo(element);
			if (info != null) {
				if (!overwrite && !info.isSynchronized()) {
					throw new org.eclipse.core.runtime.CoreException(new org.eclipse.core.runtime.Status(org.eclipse.core.runtime.IStatus.ERROR, «xptActivator.qualifiedClassName(editorGen.plugin)».ID, 
						«IF null == editorGen.application»org.eclipse.core.resources.IResourceStatus.OUT_OF_SYNC_LOCAL«ELSE»org.eclipse.core.runtime.IStatus.ERROR«ENDIF», 
						«xptExternalizer.accessorCall(editorGen, i18nKeyForDocumentUnsynchronizedFileSaveError(it))», 
						null));
				}
			«IF null == editorGen.application»
				info.stopResourceListening();
			«ENDIF»
				fireElementStateChanging(element);
				try {
					monitor.beginTask(«xptExternalizer.accessorCall(editorGen, i18nKeyForDocumentSaveDiagramTask(it))», info.getResourceSet().getResources().size() + 1); //"Saving diagram"
					for (java.util.Iterator<org.eclipse.emf.ecore.resource.Resource> it = info.getLoadedResourcesIterator(); it.hasNext();) {
						org.eclipse.emf.ecore.resource.Resource nextResource = it.next();
						monitor.setTaskName(org.eclipse.osgi.util.NLS.bind(
								«xptExternalizer.accessorCall(editorGen, i18nKeyForDocumentSaveNextResourceTask(it))», 
								nextResource.getURI()));
						if (nextResource.isLoaded() && !info.getEditingDomain().isReadOnly(nextResource)) {
							try {
								nextResource.save(«xptDiagramEditorUtil.callGetSaveOptions(it)»);
							} catch (java.io.IOException e) {
								fireElementStateChangeFailed(element);
								throw new org.eclipse.core.runtime.CoreException(new org.eclipse.core.runtime.Status(org.eclipse.core.runtime.IStatus.ERROR, «xptActivator.qualifiedClassName(editorGen.plugin)».ID, org.eclipse.gmf.runtime.diagram.ui.resources.editor.internal.EditorStatusCodes.RESOURCE_FAILURE, e.getLocalizedMessage(), null));
							}
						}
						monitor.worked(1);
					}
					monitor.done();
					info.setModificationStamp(computeModificationStamp(info));
				} catch (RuntimeException x) {
					fireElementStateChangeFailed(element);
					throw x;
				} «IF null == editorGen.application» finally {
					info.startResourceListening();
				} «ENDIF»
			} else {
				org.eclipse.emf.common.util.URI newResoruceURI;
				java.util.List<org.eclipse.core.resources.IFile> affectedFiles = null;
				«IF null == editorGen.application»if (element instanceof «fileEditorInputClassFQName(it)») {
					org.eclipse.core.resources.IFile newFile = ((«fileEditorInputClassFQName(it)») element).getFile();
					affectedFiles = java.util.Collections.singletonList(newFile);
					newResoruceURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI(newFile.getFullPath().toString(), true);
				} else «ENDIF»if(element instanceof «uriEditorInputClassFQName(it)») {
					newResoruceURI = ((«uriEditorInputClassFQName(it)») element).getURI();
				} else {
					fireElementStateChangeFailed(element);
					«throwIncorrectInputException(it)»
				}
				if (false == document instanceof org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument) {
					fireElementStateChangeFailed(element);
					throw new org.eclipse.core.runtime.CoreException(new org.eclipse.core.runtime.Status(org.eclipse.core.runtime.IStatus.ERROR, «xptActivator.qualifiedClassName(editorGen.plugin)».ID, 0,
					"Incorrect document used: " + document + " instead of org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument", null)); «nonNLS(1)» «nonNLS(2)»
				}
				org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument diagramDocument = (org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument) document;
				final org.eclipse.emf.ecore.resource.Resource newResource = diagramDocument.getEditingDomain().getResourceSet().createResource(newResoruceURI);
				final org.eclipse.gmf.runtime.notation.Diagram diagramCopy = org.eclipse.emf.ecore.util.EcoreUtil.copy(diagramDocument.getDiagram());
				try {
					new org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand(diagramDocument.getEditingDomain(), org.eclipse.osgi.util.NLS.bind(«xptExternalizer.accessorCall(editorGen, i18nKeyForDocumentSaveAs(it))», diagramCopy.getName()), affectedFiles) {
						«overrideC»
						protected org.eclipse.gmf.runtime.common.core.command.CommandResult doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info) throws org.eclipse.core.commands.ExecutionException {
							newResource.getContents().add(diagramCopy);					
							return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult();
						}
					}.execute(monitor, null);
					newResource.save(«xptDiagramEditorUtil.callGetSaveOptions(it)»);
				} catch (org.eclipse.core.commands.ExecutionException e) {
					fireElementStateChangeFailed(element);
					throw new org.eclipse.core.runtime.CoreException(new org.eclipse.core.runtime.Status(org.eclipse.core.runtime.IStatus.ERROR, «xptActivator.qualifiedClassName(editorGen.plugin)».ID, 0, e.getLocalizedMessage(), null));
				} catch (java.io.IOException e) {
					fireElementStateChangeFailed(element);
					throw new org.eclipse.core.runtime.CoreException(new org.eclipse.core.runtime.Status(org.eclipse.core.runtime.IStatus.ERROR, «xptActivator.qualifiedClassName(editorGen.plugin)».ID, 0, e.getLocalizedMessage(), null));
				}
				newResource.unload();
			}
		}
	'''
	
	override computeSchedulingRule(GenDiagram it) '''
		«generatedMemberComment»
		private org.eclipse.core.runtime.jobs.ISchedulingRule computeSchedulingRule(org.eclipse.core.resources.IResource toCreateOrModify) {
			if (toCreateOrModify.exists()) {
				return org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRuleFactory().modifyRule(toCreateOrModify);
			}
			org.eclipse.core.resources.IResource parent = toCreateOrModify;
			do {«/*FIXME [MG] the bug is closed long ago, still need? */»
				/*
				 * XXX This is a workaround for
				 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=67601
				 * IResourceRuleFactory.createRule should iterate the hierarchy
				 * itself.
				 */
				toCreateOrModify = parent;
				parent = toCreateOrModify.getParent();
			} while (parent != null && !parent.exists());
		
			return org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRuleFactory().createRule(toCreateOrModify);
		}
	'''
	
	override doValidateState(GenDiagram it) '''
		«generatedMemberComment»
		protected void doValidateState(Object element, Object computationContext) throws org.eclipse.core.runtime.CoreException {
			ResourceSetInfo info = getResourceSetInfo(element);
			if (info != null) {
				java.util.LinkedList<org.eclipse.core.resources.IFile> files2Validate = new java.util.LinkedList<org.eclipse.core.resources.IFile>();
				for (java.util.Iterator<org.eclipse.emf.ecore.resource.Resource> it = info.getLoadedResourcesIterator(); it.hasNext();) {
					org.eclipse.emf.ecore.resource.Resource nextResource = it.next();
					org.eclipse.core.resources.IFile file = org.eclipse.emf.workspace.util.WorkspaceSynchronizer.getFile(nextResource);
					if (file != null && file.isReadOnly()) {
						files2Validate.add(file);
					}
				}
				org.eclipse.core.resources.ResourcesPlugin.getWorkspace().validateEdit(files2Validate.toArray(new org.eclipse.core.resources.IFile[files2Validate.size()]), computationContext);
			}
			
			super.doValidateState(element, computationContext);
		}
	'''
	
	override getResetRule(GenDiagram it) '''
		«generatedMemberComment»
		protected org.eclipse.core.runtime.jobs.ISchedulingRule getResetRule(Object element) {
			ResourceSetInfo info = getResourceSetInfo(element);
			if (info != null) {
				java.util.LinkedList<org.eclipse.core.runtime.jobs.ISchedulingRule> rules = new java.util.LinkedList<org.eclipse.core.runtime.jobs.ISchedulingRule>();
				for (java.util.Iterator<org.eclipse.emf.ecore.resource.Resource> it = info.getLoadedResourcesIterator(); it.hasNext();) {
					org.eclipse.emf.ecore.resource.Resource nextResource = it.next();
					org.eclipse.core.resources.IFile file = org.eclipse.emf.workspace.util.WorkspaceSynchronizer.getFile(nextResource);
					if (file != null) {
						rules.add(org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRuleFactory().modifyRule(file));
					}
				}
				return new org.eclipse.core.runtime.jobs.MultiRule(rules.toArray(new org.eclipse.core.runtime.jobs.ISchedulingRule[rules.size()]));
			}
			return null;
		}
	'''
	
	override getSaveRule(GenDiagram it) '''
		«generatedMemberComment»
		protected org.eclipse.core.runtime.jobs.ISchedulingRule getSaveRule(Object element) {
			ResourceSetInfo info = getResourceSetInfo(element);
			if (info != null) {
				java.util.LinkedList<org.eclipse.core.runtime.jobs.ISchedulingRule> rules = new java.util.LinkedList<org.eclipse.core.runtime.jobs.ISchedulingRule>();
				for (java.util.Iterator<org.eclipse.emf.ecore.resource.Resource> it = info.getLoadedResourcesIterator(); it.hasNext();) {
					org.eclipse.emf.ecore.resource.Resource nextResource = it.next();
					org.eclipse.core.resources.IFile file = org.eclipse.emf.workspace.util.WorkspaceSynchronizer.getFile(nextResource);
					if (file != null) {
						rules.add(computeSchedulingRule(file));
					}
				}
				return new org.eclipse.core.runtime.jobs.MultiRule(rules.toArray(new org.eclipse.core.runtime.jobs.ISchedulingRule[rules.size()]));
			}
			return null;
		}
	'''
	
	override getSynchronizeRule(GenDiagram it) '''
		«generatedMemberComment»
		protected org.eclipse.core.runtime.jobs.ISchedulingRule getSynchronizeRule(Object element) {
			ResourceSetInfo info = getResourceSetInfo(element);
			if (info != null) {
				java.util.LinkedList<org.eclipse.core.runtime.jobs.ISchedulingRule> rules = new java.util.LinkedList<org.eclipse.core.runtime.jobs.ISchedulingRule>();
				for (java.util.Iterator<org.eclipse.emf.ecore.resource.Resource> it = info.getLoadedResourcesIterator(); it.hasNext();) {
					org.eclipse.emf.ecore.resource.Resource nextResource = it.next();
					org.eclipse.core.resources.IFile file = org.eclipse.emf.workspace.util.WorkspaceSynchronizer.getFile(nextResource);
					if (file != null) {
						rules.add(org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRuleFactory().refreshRule(file));
					}
				}
				return new org.eclipse.core.runtime.jobs.MultiRule(rules.toArray(new org.eclipse.core.runtime.jobs.ISchedulingRule[rules.size()]));
			}
			return null;
		}
	'''
	
	override getValidateStateRule(GenDiagram it) '''
		«generatedMemberComment»
		protected org.eclipse.core.runtime.jobs.ISchedulingRule getValidateStateRule(Object element) {
			ResourceSetInfo info = getResourceSetInfo(element);
			if (info != null) {«/*FIXME: [MG] bad copy paste here, files should be <IFile>, its a miracle that it does not fail in runtime at toArray stage */»
				java.util.LinkedList<org.eclipse.core.runtime.jobs.ISchedulingRule> files = new java.util.LinkedList<org.eclipse.core.runtime.jobs.ISchedulingRule>();
				for (java.util.Iterator<org.eclipse.emf.ecore.resource.Resource> it = info.getLoadedResourcesIterator(); it.hasNext();) {
					org.eclipse.emf.ecore.resource.Resource nextResource = it.next();
					org.eclipse.core.resources.IFile file = org.eclipse.emf.workspace.util.WorkspaceSynchronizer.getFile(nextResource);
					if (file != null) {
						files.add(file);
					}
				}
				return org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRuleFactory().validateEditRule(files.toArray(new org.eclipse.core.resources.IFile[files.size()]));
			}
			return null;
		}
	'''
}