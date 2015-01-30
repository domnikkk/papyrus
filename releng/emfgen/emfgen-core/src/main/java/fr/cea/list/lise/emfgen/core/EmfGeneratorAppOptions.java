package fr.cea.list.lise.emfgen.core;

/**
 * @author CEA Tech - Francois Le Fevre
 * 2014
 */
public class EmfGeneratorAppOptions {
	
	private final EmfModel emfModel;
	private final EmfGeneratorOptions emfGeneratorOptions;
	

	public EmfGeneratorAppOptions(String genModel, String ecore, String outputDirectory, boolean isRelocate, boolean isProjectTypeModel, boolean isProjectTypeEdit,
			boolean isProjectTypeEditor, boolean isProjectTypeTests) {
		super();

		this.emfGeneratorOptions = new EmfGeneratorOptions(outputDirectory, isRelocate, isProjectTypeModel, isProjectTypeEdit,isProjectTypeEditor, isProjectTypeTests);
		this.emfModel= new EmfModel(genModel,ecore); 
	}

	public EmfModel getEmfModel() {
		return emfModel;
	}

	public EmfGeneratorOptions getEmfGeneratorOptions() {
		return emfGeneratorOptions;
	}

}
