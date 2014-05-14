package org.xtext.example.mydsl

import org.eclipse.emf.mwe.utils.DirectoryCleaner
import org.eclipse.emf.mwe.utils.StandaloneSetup
import org.eclipse.xtext.generator.Generator
import org.eclipse.xtext.generator.LanguageConfig
import org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
import org.eclipse.xtext.generator.ecore.EcoreGeneratorFragment
import org.eclipse.xtext.generator.exporting.QualifiedNamesFragment
import org.eclipse.xtext.generator.formatting.FormatterFragment
import org.eclipse.xtext.generator.generator.GeneratorFragment
import org.eclipse.xtext.generator.grammarAccess.GrammarAccessFragment
import org.eclipse.xtext.generator.junit.Junit4Fragment
import org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
import org.eclipse.xtext.generator.parser.antlr.XtextAntlrUiGeneratorFragment
import org.eclipse.xtext.generator.resourceFactory.ResourceFactoryFragment
import org.eclipse.xtext.generator.scoping.ImportNamespacesScopingFragment
import org.eclipse.xtext.generator.serializer.SerializerFragment
import org.eclipse.xtext.generator.types.TypesGeneratorFragment
import org.eclipse.xtext.generator.validation.ValidatorFragment
import org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
import org.eclipse.xtext.ui.generator.compare.CompareFragment
import org.eclipse.xtext.ui.generator.contentAssist.ContentAssistFragment
import org.eclipse.xtext.ui.generator.labeling.LabelProviderFragment
import org.eclipse.xtext.ui.generator.outline.OutlineTreeProviderFragment
import org.eclipse.xtext.ui.generator.refactoring.RefactorElementNameFragment
import org.eclipse.xtext.ui.generator.templates.CodetemplatesGeneratorFragment

class GenerateMyDsl extends XtendWorkflow {

  val grammarURI = "classpath:/org/xtext/example/mydsl/MyDsl.xtext"
  val fileExtensions = "mydsl"
  val projectName = "org.xtext.example.mydsl"
  val String runtimeProject = '''../«projectName»'''
  val generateXtendStub = true

  new() {
    beans += new StandaloneSetup => [
      scanClassPath = true
      platformUri = '''«runtimeProject»/..'''
      // The following two lines can be removed, if Xbase is not used.
      addRegisterGeneratedEPackage("org.eclipse.xtext.xbase.XbasePackage")
      addRegisterGenModelFile("platform:/resource/org.eclipse.xtext.xbase/model/Xbase.genmodel")
    ]

    components += new DirectoryCleaner => [
      directory = '''«runtimeProject»/src-gen'''
    ]

    components += new DirectoryCleaner => [
      directory = '''«runtimeProject».ui/src-gen'''
    ]

    components += new Generator => [
      pathRtProject = runtimeProject
      pathUiProject = '''«runtimeProject».ui'''
      pathTestProject = '''«runtimeProject».tests'''
      projectNameRt = projectName
      projectNameUi = '''«projectName».ui'''
      addLanguage(
        new LanguageConfig => [
          autoInject
          uri = grammarURI
          // Java API to access grammar elements (required by several other fragments)
          fragments += typeof(GrammarAccessFragment).getInstance
          // generates Java API for the generated EPackages
          fragments += typeof(EcoreGeneratorFragment).getInstance => [
            // referencedGenModels = "
            //  platform:/resource/org.eclipse.xtext.xbase/model/Xbase.genmodel,
            //  platform:/resource/org.eclipse.xtext.common.types/model/JavaVMTypes.genmodel
            // "
          ]
          // the old serialization component
          // fragments += typeof(ParseTreeConstructorFragment).getInstance   
          // serializer 2.0
          fragments += typeof(SerializerFragment).getInstance => [
            generateStub = false
          ]
          // a custom ResourceFactory for use with EMF
          fragments += typeof(ResourceFactoryFragment).getInstance
          // The antlr parser generator fragment.
          fragments += typeof(XtextAntlrGeneratorFragment).getInstance => [
          // options = new AntlrOptions => [
          //   backtrack = true
          // ]
          ]
          // Xtend-based API for validation
          fragments += typeof(ValidatorFragment).getInstance => [
            // addComposedCheck("org.eclipse.xtext.validation.ImportUriValidator")
            // addComposedCheck("org.eclipse.xtext.validation.NamesAreUniqueValidator")
          ]
          // old scoping and exporting API
          // fragments += typeof(ImportURIScopingFragment).getInstance
          // fragments += typeof(SimpleNamesFragment).getInstance
          // scoping and exporting API
          fragments += typeof(ImportNamespacesScopingFragment).getInstance
          fragments += typeof(QualifiedNamesFragment).getInstance
          fragments += typeof(BuilderIntegrationFragment).getInstance
          // generator API
          fragments += typeof(GeneratorFragment).getInstance
          // formatter API
          fragments += typeof(FormatterFragment).getInstance
          // labeling API
          fragments += typeof(LabelProviderFragment).getInstance
          // outline API
          fragments += typeof(OutlineTreeProviderFragment).getInstance
          fragments += typeof(ContentAssistFragment).getInstance
          // quickfix API
          fragments += typeof(ContentAssistFragment).getInstance
          // content assist API
          fragments += typeof(ContentAssistFragment).getInstance
          // generates a more lightweight Antlr parser and lexer tailored for content assist
          fragments += typeof(XtextAntlrUiGeneratorFragment).getInstance
          // generates junit test support classes into Generator#pathTestProject
          fragments += typeof(Junit4Fragment).getInstance
          // project wizard (optional)
          // fragments += typeof(SimpleProjectWizardFragment).getInstance => [
          //	  generatorProjectName = '''«projectName»'''
          // ]
          // rename refactoring
          fragments += typeof(RefactorElementNameFragment).getInstance
          // provides the necessary bindings for java types integration
          fragments += typeof(TypesGeneratorFragment).getInstance
          // generates the required bindings only if the grammar inherits from Xbase
          fragments += typeof(XbaseGeneratorFragment).getInstance
          // provides a preference page for template proposals
          fragments += typeof(CodetemplatesGeneratorFragment).getInstance
          // provides a compare view
          fragments += typeof(CompareFragment).getInstance
        ])
    ]
  }

  def static void main(String[] args) {
    new GenerateMyDsl().run(null)
  }

}
