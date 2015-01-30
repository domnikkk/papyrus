package fr.cea.list.lise.emfgen.core;

/**
 * @author CEA Tech - Francois Le Fevre
 * 2014
 */
public class EmfGeneratorOptions {
	
	private final boolean isRelocate;
	private final boolean isProjectTypeModel;
	private final boolean isProjectTypeEdit;
	private final boolean isProjectTypeEditor;
	private final boolean isProjectTypeTests;
	private final String outputDirectory;

	public EmfGeneratorOptions(String outputDirectory, boolean isRelocate, boolean isProjectTypeModel, boolean isProjectTypeEdit,
			boolean isProjectTypeEditor, boolean isProjectTypeTests) {
		super();
		this.isRelocate = isRelocate;
		this.isProjectTypeModel = isProjectTypeModel;
		this.isProjectTypeEdit = isProjectTypeEdit;
		this.isProjectTypeEditor = isProjectTypeEditor;
		this.isProjectTypeTests = isProjectTypeTests;
		
		if(outputDirectory.contains("\\")){
			outputDirectory = outputDirectory.replace("\\\\", "/");
		}
		if(!outputDirectory.endsWith("/")){
			outputDirectory=outputDirectory.concat("/");
		}
		this.outputDirectory=outputDirectory;
	}
	
	public boolean isProjectTypeModel() {
		return isProjectTypeModel;
	}
	public boolean isProjectTypeEdit() {
		return isProjectTypeEdit;
	}
	public boolean isProjectTypeEditor() {
		return isProjectTypeEditor;
	}
	public boolean isProjectTypeTests() {
		return isProjectTypeTests;
	}

	public boolean isRelocate() {
		return isRelocate;
	}

	public String getOutputDirectory() {
		return outputDirectory;
	}

}
