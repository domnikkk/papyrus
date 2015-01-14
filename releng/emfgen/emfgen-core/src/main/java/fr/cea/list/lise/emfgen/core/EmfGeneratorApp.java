package fr.cea.list.lise.emfgen.core;

import org.apache.log4j.Logger;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

/**
 * @author CEA Tech - Francois Le Fevre
 * 2014
 */
public class EmfGeneratorApp {
	private static Logger logger = Logger.getLogger(EmfGeneratorApp.class);	

	@Option(name = "-e", usage="Required")
	public String ecore;

	@Option(name = "-g", required = true, usage="Required")
	public String genModel;

	@Option(name = "-o", required = true, usage="Required")
	public String outputDirectory;
	
	@Option(name = "-r", required = false, usage="Required")
	public Boolean relocate;
	
	@Option(name = "-model", required = false, usage="Required")
	public Boolean model;
	
	@Option(name = "-edit", required = false, usage="Required")
	public Boolean edit;
	
	@Option(name = "-editor", required = false, usage="Required")
	public Boolean editor;
	
	@Option(name = "-tests", required = false, usage="Required")
	public Boolean tests;

	public static void main(String[] args) {
		System.exit(new EmfGeneratorApp().run(args));
	}

	private int run(String[] args) {
		CmdLineParser p = new CmdLineParser(this);
		try {
			p.parseArgument(args);
			run();
			return 0;
		} catch (CmdLineException e) {
			System.err.println(e.getMessage());
			p.printUsage(System.err);
			return 1;
		}
	}

	private void run() {
		logger.info("Welcome to EmfGenerator");       
		EmfGeneratorAppOptions emfGeneratorAppOptions = new EmfGeneratorAppOptions(genModel,ecore,outputDirectory,relocate,model,edit,editor,tests);
		EmfGenerator emfGenerator = new EmfGenerator();
		emfGenerator.execute(emfGeneratorAppOptions.getEmfModel(), emfGeneratorAppOptions.getEmfGeneratorOptions());

	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		EmfGeneratorApp.logger = logger;
	}

	public String getEcore() {
		return ecore;
	}

	public void setEcore(String ecore) {
		this.ecore = ecore;
	}

	public String getGenModel() {
		return genModel;
	}

	public void setGenModel(String genModel) {
		this.genModel = genModel;
	}

	public String getOutputDirectory() {
		return outputDirectory;
	}

	public void setOutputDirectory(String outputDirectory) {
		this.outputDirectory = outputDirectory;
	}

	public Boolean getRelocate() {
		return relocate;
	}

	public void setRelocate(Boolean relocate) {
		this.relocate = relocate;
	}

	public Boolean getModel() {
		return model;
	}

	public void setModel(Boolean model) {
		this.model = model;
	}

	public Boolean getEdit() {
		return edit;
	}

	public void setEdit(Boolean edit) {
		this.edit = edit;
	}

	public Boolean getEditor() {
		return editor;
	}

	public void setEditor(Boolean editor) {
		this.editor = editor;
	}

	public Boolean getTests() {
		return tests;
	}

	public void setTests(Boolean tests) {
		this.tests = tests;
	}
}