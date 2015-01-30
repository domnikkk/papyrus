package fr.cea.list.lise.emfgen.core;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * @author CEA Tech - Francois Le Fevre
 * 2014
 */
public class EmfGenerator {
	private static Logger logger = Logger.getLogger(EmfGenerator.class);

	static{
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("genmodel", new XMIResourceFactoryImpl()); 

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		//Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl()); 
	}

	private ResourceSet resourceSet;

	public void execute(EmfModel emfModel, EmfGeneratorOptions emfGeneratorOptions ) { 
		URIConverter converter = new ExtensibleURIConverterImpl(); 

		logger.info("Dealing with genmodel ini: "+emfModel.getGenModel());
		URI genModelURI = URI.createURI(emfModel.getGenModel()); 

		URI genmodelNormalized = converter.normalize(genModelURI); 

		ResourceSet resourceSet = new ResourceSetImpl(); 
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE); 
		resourceSet.getPackageRegistry().put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE); 

		//Dealing with outdir uri
		URI outdir = URI.createFileURI(emfGeneratorOptions.getOutputDirectory());
		logger.info("outdir emfgen: "+outdir);
		URI outdirNormalized = converter.normalize(outdir); 
		resourceSet.getURIConverter().getURIMap().put(URI.createURI("platform:/resource/"), outdirNormalized);

		//Managing Ecore uri
		logger.warn("By default load ecore environment but no code to load additional ecore model inside your initial model");
		URI ecoreEcoreUri= URI.createURI("jar:"+EcorePlugin.INSTANCE.getBaseURL().getFile());
		URI ecoreEcoreNormalized = converter.normalize(ecoreEcoreUri);
		URI ecoreGenUri= URI.createURI("jar:"+EcorePlugin.INSTANCE.getBaseURL().getFile()+"/model/Ecore.genmodel");
		URI ecoreGenNormalized = converter.normalize(ecoreGenUri);
		logger.debug("ecoreEcoreUri="+ecoreEcoreUri);
		logger.debug("ecoreEcoreNormalized="+ecoreEcoreNormalized);
		logger.debug("ecoreGenUri="+ecoreGenUri);
		logger.debug("ecoreGenNormalized="+ecoreGenNormalized);
		resourceSet.getURIConverter().getURIMap().put(URI.createURI("platform:/plugin/org.eclipse.emf.ecore/"),ecoreEcoreNormalized );
		resourceSet.getURIConverter().getURIMap().put(URI.createURI("platform:/plugin/org.eclipse.emf.ecore/model/Ecore.genmodel#//ecore"),ecoreGenNormalized );

		try {
			Resource resource = resourceSet.getResource(genmodelNormalized, true); 
			resource.load(null);

			URI ecoreUri = URI.createURI(emfModel.getEcore());
			logger.info("ecoreUri: "+ecoreUri);
			URI ecoreUriNormalized = converter.normalize(ecoreUri); 
			logger.info("ecoreUri normalized: "+ecoreUriNormalized);
			Resource ecoreResource = resourceSet.getResource(ecoreUriNormalized, true); 
			ecoreResource.load(null); 

			logger.info("resource.getContents().size() : "+resource.getContents().size() );
			if (resource.getContents().size() != 1) { 
				System.out.println("Resource has " + 
						resource.getContents().size() 
						+ " loaded objects"); 
			} else { 
				Object o =  resource.getContents().get(0); 
				logger.info("o: "+o.getClass() );
				GenModel genModel = (GenModel) resource.getContents().get(0); 
				genModel.validate();
				genModel.reconcile();

				List<GenPackage> genPackages = genModel.getAllGenAndUsedGenPackagesWithClassifiers();
				for(GenPackage genPackage : genPackages){
					logger.info("genPackage: "+genPackage.getPackageName() );
				}

				logger.info("genModel.getModelDirectory(): "+genModel.getModelDirectory() );
				logger.info("genModel.getEditDirectory(): "+genModel.getEditDirectory() );
				logger.info("genModel.getEditorDirectory(): "+genModel.getEditorDirectory() );
				logger.info("genModel.getTestsDirectory(): "+genModel.getTestsDirectory() );

				if(emfGeneratorOptions.isRelocate()){
					logger.info("relocate: active");
					genModel.setModelDirectory("/");
					genModel.setEditDirectory("/");
					genModel.setEditorDirectory("/");
				}

				genModel.setValidateModel(true); // The more checks the better
				genModel.setCodeFormatting(true); // Normalize layout
				genModel.setForceOverwrite(false); // Don't overwrite read-only files
				genModel.setCanGenerate(true);
				// genModel.setFacadeHelperClass(null); // Non-null gives JDT default NPEs
				//genModel.setFacadeHelperClass(StandaloneASTFacadeHelper.class.getName()); // Bug 308069
				genModel.setBundleManifest(false); // New manifests should be generated manually
				genModel.setUpdateClasspath(false); // New class-paths should be generated manually
				if (genModel.getComplianceLevel().compareTo(GenJDKLevel.JDK50_LITERAL) < 0) {
					genModel.setComplianceLevel(GenJDKLevel.JDK50_LITERAL);
				}
				// genModel.setRootExtendsClass("org.eclipse.emf.ecore.impl.MinimalEObjectImpl$Container");
				/*
				 * JavaModelManager.getJavaModelManager().initializePreferences();
				 * new
				 * JavaCorePreferenceInitializer().initializeDefaultPreferences();
				 * 
				 * GenJDKLevel genSDKcomplianceLevel =
				 * genModel.getComplianceLevel(); String complianceLevel =
				 * JavaCore.VERSION_1_5; switch (genSDKcomplianceLevel) { case
				 * JDK60_LITERAL: complianceLevel = JavaCore.VERSION_1_6; case
				 * JDK14_LITERAL: complianceLevel = JavaCore.VERSION_1_4; default:
				 * complianceLevel = JavaCore.VERSION_1_5; } // Hashtable<?,?>
				 * defaultOptions = JavaCore.getDefaultOptions(); //
				 * JavaCore.setComplianceOptions(complianceLevel, defaultOptions);
				 * // JavaCore.setOptions(defaultOptions);
				 */

				Diagnostic diagnostic = genModel.diagnose();
				// Globally register the default generator adapter factory for 
				// GenModel 
				// elements (only needed in standalone). 
				// 
				GeneratorAdapterFactory.Descriptor.Registry.INSTANCE.addDescriptor(GenModelPackage.eNS_URI,GenModelGeneratorAdapterFactory.DESCRIPTOR); 

				/**
				 * have a look to https://eclipse.googlesource.com/emf/org.eclipse.mwe/+/v2.5.1/plugins/org.eclipse.emf.mwe2.lib/src/org/eclipse/emf/mwe2/ecore/EcoreGenerator.java
				 */
				// Create the generator and set the model-level input object. 
				// 
				Generator generator = setup();//new Generator(); 
				generator.setInput(genModel); 
				generator.getAdapterFactoryDescriptorRegistry().addDescriptor(GenModelPackage.eNS_URI,GenModelGeneratorAdapterFactory.DESCRIPTOR);
				
				// Generator model code. 
				if(emfGeneratorOptions.isProjectTypeModel()){
					logger.info("Generating Model");
					generator.generate(genModel, 
							GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, 
							new BasicMonitor.Printing(System.out)); 
					System.out.println("diagnostic="+diagnostic.getMessage());


					if (diagnostic.getSeverity() != Diagnostic.OK){
						logger.info(diagnostic);
					}
				}

				if(emfGeneratorOptions.isProjectTypeEdit()){
					logger.info("Generating Edit");
					Diagnostic editDiag = generator.generate(genModel, GenBaseGeneratorAdapter.EDIT_PROJECT_TYPE,
							new BasicMonitor());
					if (editDiag.getSeverity() != Diagnostic.OK)
						logger.info(editDiag);
				}

				if(emfGeneratorOptions.isProjectTypeEditor()){
					logger.info("Generating Editor");
					Diagnostic editorDiag = generator.generate(genModel, GenBaseGeneratorAdapter.EDITOR_PROJECT_TYPE,
							new BasicMonitor());
					if (editorDiag.getSeverity() != Diagnostic.OK)
						logger.info(editorDiag);
				}


				if(emfGeneratorOptions.isProjectTypeTests()){
					logger.info("Generating Tests");
					logger.warn("Tests generation is not taken into account for this version");
					/*
					Diagnostic editorDiag = generator.generate(genModel, GenBaseGeneratorAdapter.TESTS_PROJECT_TYPE,
							new BasicMonitor());
					if (editorDiag.getSeverity() != Diagnostic.OK)
						logger.info(editorDiag);
					 */
				}


			} 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

	private static Generator setup(
			) {
		GenModelPackage.eINSTANCE.getGenAnnotation();
		EcorePackage.eINSTANCE.getEFactoryInstance();
		GenModelPackage.eINSTANCE.getEFactoryInstance();
		//PlatformInitializer platformInitializer = new PlatformInitializer();
		//platformInitializer.setPlatformUri(platform);
		if (!Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().containsKey("genmodel"))
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("genmodel",
					new org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl());
		org.eclipse.emf.codegen.ecore.generator.Generator generator = new org.eclipse.emf.codegen.ecore.generator.Generator(){
			@Override
			public JControlModel getJControlModel() {
				if (jControlModel == null) {
					jControlModel = new JControlModel();
					jControlModel.initialize(null, options.mergeRulesURI);
				}
				return jControlModel;
			}
		};
		generator.getAdapterFactoryDescriptorRegistry().addDescriptor(GenModelPackage.eNS_URI,org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory.DESCRIPTOR);
		return generator;
	}

}