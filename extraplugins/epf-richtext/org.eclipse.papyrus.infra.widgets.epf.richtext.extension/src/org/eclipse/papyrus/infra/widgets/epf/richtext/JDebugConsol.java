/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) patrick.tessier@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.widgets.epf.richtext;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


/**
 * This class turns 'e' characters red using a LineStyleListener
 */
public class JDebugConsol {
	// Color for the StyleRanges

	private JTextArea label;

	/**
	 * Runs the application
	 */
	public void run() {
		JFrame frame = new JFrame("Sequoia Console");
		frame.setSize(300, 200);


		// Get color for style ranges
		createContents(frame);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.pack();
        frame.setVisible(true);
		//while (!shell.isDisposed()) {
		//	if (!display.readAndDispatch()) {
		//		display.sleep();
		//	}
		//}
		//display.dispose();
	}

	/**
	 * Creates the main window contents
	 * 
	 * @param shell the main window
	 */
	private void createContents(JFrame frame) {
		label = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(label);

	        
	        frame.getContentPane().add(scrollPane);

	        



	}
	public void write(String print){
		if(label!=null){
			label.setText(label.getText()+"\n"+print);
		}

	}

	/**
	 * The application entry point
	 * 
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		JDebugConsol consol= new JDebugConsol();
		consol.run();
		consol.write("text");
		consol.write("uu\ntext");
		JDebugConsol consol1= new JDebugConsol();
		consol1.run();
		consol1.write("text");
		consol1.write("uu\ntextuu\ntextuu\ntextuu\ntextuu\ntextuu\ntextuu\ntextuu\ntextuu\ntextuu\ntextuu\ntextuu\ntext");
	}
}
