package org.xtext.example.mydsl;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class GenerateMyDsl /* implements XtendWorkflow  */{
  private final String grammarURI = "classpath:/org/xtext/example/mydsl/MyDsl.xtext";
  
  private final String fileExtensions = "mydsl";
  
  private final String projectName = "org.xtext.example.mydsl";
  
  private final String runtimeProject = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("../");
      _builder.append(GenerateMyDsl.this.projectName, "");
      return _builder.toString();
    }
  }.apply();
  
  private final boolean generateXtendStub = true;
  
  public GenerateMyDsl() {
    throw new Error("Unresolved compilation problems:"
      + "\nGrammarAccessFragment cannot be resolved to a type."
      + "\nEcoreGeneratorFragment cannot be resolved to a type."
      + "\nSerializerFragment cannot be resolved to a type."
      + "\nResourceFactoryFragment cannot be resolved to a type."
      + "\nXtextAntlrGeneratorFragment cannot be resolved to a type."
      + "\nValidatorFragment cannot be resolved to a type."
      + "\nImportNamespacesScopingFragment cannot be resolved to a type."
      + "\nQualifiedNamesFragment cannot be resolved to a type."
      + "\nBuilderIntegrationFragment cannot be resolved to a type."
      + "\nGeneratorFragment cannot be resolved to a type."
      + "\nFormatterFragment cannot be resolved to a type."
      + "\nLabelProviderFragment cannot be resolved to a type."
      + "\nOutlineTreeProviderFragment cannot be resolved to a type."
      + "\nContentAssistFragment cannot be resolved to a type."
      + "\nContentAssistFragment cannot be resolved to a type."
      + "\nContentAssistFragment cannot be resolved to a type."
      + "\nXtextAntlrUiGeneratorFragment cannot be resolved to a type."
      + "\nJunit4Fragment cannot be resolved to a type."
      + "\nRefactorElementNameFragment cannot be resolved to a type."
      + "\nTypesGeneratorFragment cannot be resolved to a type."
      + "\nXbaseGeneratorFragment cannot be resolved to a type."
      + "\nCodetemplatesGeneratorFragment cannot be resolved to a type."
      + "\nCompareFragment cannot be resolved to a type."
      + "\nThe method or field beans is undefined for the type GenerateMyDsl"
      + "\nStandaloneSetup cannot be resolved."
      + "\nThe method or field scanClassPath is undefined for the type GenerateMyDsl"
      + "\nThe method or field platformUri is undefined for the type GenerateMyDsl"
      + "\nThe method addRegisterGeneratedEPackage is undefined for the type GenerateMyDsl"
      + "\nThe method addRegisterGenModelFile is undefined for the type GenerateMyDsl"
      + "\nThe method or field components is undefined for the type GenerateMyDsl"
      + "\nDirectoryCleaner cannot be resolved."
      + "\nThe method or field directory is undefined for the type GenerateMyDsl"
      + "\nThe method or field components is undefined for the type GenerateMyDsl"
      + "\nDirectoryCleaner cannot be resolved."
      + "\nThe method or field directory is undefined for the type GenerateMyDsl"
      + "\nThe method or field components is undefined for the type GenerateMyDsl"
      + "\nGenerator cannot be resolved."
      + "\nThe method or field pathRtProject is undefined for the type GenerateMyDsl"
      + "\nThe method or field pathUiProject is undefined for the type GenerateMyDsl"
      + "\nThe method or field pathTestProject is undefined for the type GenerateMyDsl"
      + "\nThe method or field projectNameRt is undefined for the type GenerateMyDsl"
      + "\nThe method or field projectNameUi is undefined for the type GenerateMyDsl"
      + "\nThe method addLanguage is undefined for the type GenerateMyDsl"
      + "\nLanguageConfig cannot be resolved."
      + "\nThe method or field autoInject is undefined for the type GenerateMyDsl"
      + "\nThe method or field uri is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field generateStub is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\nThe method or field fragments is undefined for the type GenerateMyDsl"
      + "\nThe method getInstance is undefined for the type GenerateMyDsl"
      + "\n+= cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  public static void main(final String[] args) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method run is undefined for the type GenerateMyDsl");
  }
}
