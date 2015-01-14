package fr.cea.list.lise.emfgen.maven;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;


import org.apache.maven.plugins.annotations.Execute;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

import fr.cea.list.lise.emfgen.core.EmfGenerator;
import fr.cea.list.lise.emfgen.core.EmfGeneratorAppOptions;
/**
 *  @author CEA Tech - Francois Le Fevre
 * 2014
 * @goal emfgen
**/
public class EmfGenMojo extends AbstractMojo
{

    public void execute() throws MojoExecutionException
    {
    	getLog().info("Welcome to EmfGen");
    	getLog().info("dealing with "+genModel+" output: "+ outputDirectory);
    	EmfGeneratorAppOptions emfGeneratorAppOptions = new EmfGeneratorAppOptions(genModel,ecoreModel, outputDirectory,isRelocate, isGenModel, isGenEdit,isGenEditor,isGenTests);
		EmfGenerator myEmfGenerator = new EmfGenerator();
		myEmfGenerator.execute(emfGeneratorAppOptions.getEmfModel(), emfGeneratorAppOptions.getEmfGeneratorOptions());
    }
    
    /**
     * Output directory
     * @parameter property="${outputDirectory}"
     * @required
     */
    private String outputDirectory = null;

    /**
     * Ecore path
     * @parameter property="${ecoreModel}"
     * @required
     */
    private String ecoreModel = null;
    
    /**
     * genModel path
     * @parameter property="${genModel}"
     * @required
     */
    private String genModel = null;
    
    /**
     * isRelocate
     * @parameter property="${isRelocate}"
     * @required
     */
    private Boolean isRelocate = null;
    
    /**
     * isGenModel
     * @parameter property="${isGenModel}"
     * @required
     */
    private Boolean isGenModel = null;
    
    /**
     * isGenEdit
     * @parameter property="${isGenEdit}"
     * @required
     */
    private Boolean isGenEdit = null;
    
    /**
     * isGenEditor
     * @parameter property="${isGenEditor}"
     * @required
     */
    private Boolean isGenEditor = null;
    
    /**
     * isGenTests
     * @parameter property="${isGenTests}"
     * @required
     */
    private Boolean isGenTests = null;

	public String getOutputDirectory() {
		return outputDirectory;
	}

	public String getEcoreModel() {
		return ecoreModel;
	}

	public String getGenModel() {
		return genModel;
	}

	public void setOutputDirectory(String outputDirectory) {
		this.outputDirectory = outputDirectory;
	}

	public void setEcoreModel(String ecoreModel) {
		this.ecoreModel = ecoreModel;
	}

	public void setGenModel(String genModel) {
		this.genModel = genModel;
	}

	public Boolean getIsGenModel() {
		return isGenModel;
	}

	public void setIsGenModel(Boolean isGenModel) {
		this.isGenModel = isGenModel;
	}

	public Boolean getIsGenEdit() {
		return isGenEdit;
	}

	public void setIsGenEdit(Boolean isGenEdit) {
		this.isGenEdit = isGenEdit;
	}

	public Boolean getIsGenEditor() {
		return isGenEditor;
	}

	public void setIsGenEditor(Boolean isGenEditor) {
		this.isGenEditor = isGenEditor;
	}

	public Boolean getIsGenTests() {
		return isGenTests;
	}

	public void setIsGenTests(Boolean isGenTests) {
		this.isGenTests = isGenTests;
	}

	public Boolean getIsRelocate() {
		return isRelocate;
	}

	public void setIsRelocate(Boolean isRelocate) {
		this.isRelocate = isRelocate;
	}
}
