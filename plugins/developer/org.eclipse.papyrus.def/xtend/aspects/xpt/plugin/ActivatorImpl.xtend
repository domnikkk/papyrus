package aspects.xpt.plugin

import com.google.inject.Inject
import com.google.inject.Singleton
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator
import org.eclipse.gmf.codegen.gmfgen.GenExpressionInterpreter
import org.eclipse.gmf.codegen.gmfgen.GenPlugin
import plugin.Activator
import xpt.Common
import xpt.editor.DocumentProvider
import xpt.providers.ElementInitializers
import xpt.expressions.getExpression

@Singleton class ActivatorImpl extends xpt.plugin.ActivatorImpl {
	@Inject extension Common;
	
	@Inject Activator xptActivator;
	@Inject DocumentProvider xptDocProvider;
	@Inject ElementInitializers xptElementInitializers;
	@Inject getExpression xptExpr;
	
	override ActivatorImpl(GenPlugin it)'''
		ﾫcopyright(editorGen)ﾻ
		package ﾫxptActivator.packageName(it)ﾻ;

		ﾫgeneratedClassCommentﾻ
		public class ﾫxptActivator.className(it)ﾻ extends org.eclipse.ui.plugin.AbstractUIPlugin {

		ﾫattrs(it)ﾻ
		ﾫconstructor(it)ﾻ
		ﾫstart(it)ﾻ
		ﾫstop(editorGen)ﾻ
		ﾫgetInstance(it)ﾻ
		
		ﾫgetPreferenceStoreﾻ

		ﾫgetItemProvidersAdaptorFactory(it)ﾻ
		ﾫgetItemImageDescriptor(it)ﾻ
		ﾫgetBundleDescriptorImage(it)ﾻ
		ﾫfindImageDescriptor(it)ﾻ
		ﾫgetBundleImage(it)ﾻ
		ﾫgetString(it)ﾻ
		ﾫdocumentProviderGetter(editorGen.diagram)ﾻ
		ﾫlinkConstraint(editorGen.diagram)ﾻ
		ﾫinitializerGetter(editorGen.diagram)ﾻ
		ﾫinitializerSetter(editorGen.diagram)ﾻ
		ﾫprovidersAccessMethods(it)ﾻ
		ﾫlogError(it)ﾻ
		ﾫlogInfo(it)ﾻ
		ﾫgetLogError(it)ﾻ
		ﾫadditions(it)ﾻ
	}
'''

override attrs(GenPlugin it)'''
	ﾫgeneratedMemberCommentﾻ
	public static final String ID = "ﾫIDﾻ"; //$NON-NLS-1$

	ﾫgeneratedMemberCommentﾻ
	private org.eclipse.papyrus.infra.core.log.LogHelper myLogHelper;

	ﾫgeneratedMemberCommentﾻ
	public static final org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint DIAGRAM_PREFERENCES_HINT =
			new org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint(ID);

	ﾫgeneratedMemberCommentﾻ
	private static ﾫxptActivator.className(it)ﾻ instance;

	ﾫgeneratedMemberCommentﾻ
	private org.eclipse.emf.edit.provider.ComposedAdapterFactory adapterFactory;	

	ﾫgeneratedMemberCommentﾻ
	private ﾫxptDocProvider.qualifiedClassName(editorGen.diagram)ﾻ documentProvider;

	ﾫIF editorGen.diagram.links.exists(l| !l.sansDomain)ﾻ
		ﾫgeneratedMemberCommentﾻ
		private ﾫeditorGen.diagram.getLinkCreationConstraintsQualifiedClassName()ﾻ linkConstraints;
	ﾫENDIFﾻ

	ﾫgeneratedMemberCommentﾻ
	private ﾫxptElementInitializers.qualifiedClassName(editorGen.diagram)ﾻ initializers;

	ﾫIF it.editorGen.expressionProviders != nullﾻ
		ﾫFOR p : it.editorGen.expressionProviders.providers.filter(typeof(GenExpressionInterpreter))ﾻ
			ﾫgeneratedMemberCommentﾻ
			private ﾫxptExpr.getExpressionInterpriterQualifiedClassName(p)ﾻ ﾫp.languageﾻFactory;
		ﾫENDFORﾻ
	ﾫENDIFﾻ
'''

override attrs(GenPlugin it)'''
    ﾫgeneratedMemberCommentﾻ
    public static final String ID = "ﾫIDﾻ"; //$NON-NLS-1$

    ﾫgeneratedMemberCommentﾻ
    public static final org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint DIAGRAM_PREFERENCES_HINT =
            new org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint(ID);

    ﾫgeneratedMemberCommentﾻ
    private static ﾫxptActivator.className(it)ﾻ instance;

    ﾫgeneratedMemberCommentﾻ
    private org.eclipse.emf.common.notify.AdapterFactory adapterFactory;    

    ﾫgeneratedMemberCommentﾻ
    private ﾫxptDocProvider.qualifiedClassName(editorGen.diagram)ﾻ documentProvider;

    ﾫIF editorGen.diagram.links.exists(l| !l.sansDomain)ﾻ
        ﾫgeneratedMemberCommentﾻ
        private ﾫeditorGen.diagram.getLinkCreationConstraintsQualifiedClassName()ﾻ linkConstraints;
    ﾫENDIFﾻ

    ﾫgeneratedMemberCommentﾻ
    private ﾫxptElementInitializers.qualifiedClassName(editorGen.diagram)ﾻ initializers;

    ﾫIF it.editorGen.expressionProviders != nullﾻ
        ﾫFOR p : it.editorGen.expressionProviders.providers.filter(typeof(GenExpressionInterpreter))ﾻ
            ﾫgeneratedMemberCommentﾻ
            private ﾫxptExpr.getExpressionInterpriterQualifiedClassName(p)ﾻ ﾫp.languageﾻFactory;
        ﾫENDFORﾻ
    ﾫENDIFﾻ
'''


override start(GenPlugin it)'''
	ﾫgeneratedMemberCommentﾻ
	public void start(org.osgi.framework.BundleContext context) throws Exception {
		super.start(context);
		instance = this;
		myLogHelper = new org.eclipse.papyrus.infra.core.log.LogHelper(this);
		org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint.registerPreferenceStore(DIAGRAM_PREFERENCES_HINT, getPreferenceStore());
		adapterFactory = org.eclipse.papyrus.infra.gmfdiag.common.Activator.getInstance().getItemProvidersAdapterFactory();
		ﾫit.editorGen.diagram.preferencesPackageNameﾻ.DiagramPreferenceInitializer diagramPreferenceInitializer = new ﾫit.editorGen.diagram.preferencesPackageNameﾻ.DiagramPreferenceInitializer();
		diagramPreferenceInitializer.initializeDefaultPreferences();
		
	}
'''

override stop(GenEditorGenerator it)'''
    ﾫgeneratedMemberCommentﾻ
    public void stop(org.osgi.framework.BundleContext context) throws Exception {
        adapterFactory = null;
        ﾫIF diagram.links.exists(l| !l.sansDomain)ﾻ
            linkConstraints = null;
        ﾫENDIFﾻ
        initializers = null;
        ﾫIF expressionProviders != nullﾻ
            ﾫFOR p : expressionProviders.providers.filter(typeof(GenExpressionInterpreter))ﾻ
                ﾫp.languageﾻFactory = null;
            ﾫENDFORﾻ
        ﾫENDIFﾻ
        instance = null;
        super.stop(context);
    }
'''

def getPreferenceStore()'''
	ﾫgeneratedMemberCommentﾻ
	 public org.eclipse.jface.preference.IPreferenceStore getPreferenceStore() {
	 	org.eclipse.jface.preference.IPreferenceStore store=org.eclipse.papyrus.infra.gmfdiag.preferences.Activator.getDefault().getPreferenceStore();
	     return store;
	    }

'''

	override logError(GenPlugin it) '''
		ﾫgeneratedMemberCommentﾻ
		public void logError(String error) {
			getLogHelper().warn(error);
		}
		
		ﾫgeneratedMemberCommentﾻ
		public void logError(String error, Throwable throwable) {
			getLogHelper().error(error, throwable);
		}
	'''

	override logInfo(GenPlugin it) '''
		ﾫgeneratedMemberCommentﾻ
		public void logInfo(String message) {
			getLogHelper().info(message);
		}
		
		ﾫgeneratedMemberCommentﾻ
		public void logInfo(String message, Throwable throwable) {
			getLogHelper().error(message, throwable);
		}
	'''

	override getLogError(GenPlugin it) '''
		ﾫgeneratedMemberCommentﾻ
		public org.eclipse.papyrus.infra.core.log.LogHelper getLogHelper() {
			return myLogHelper;
		}
	'''
}