package org.eclipse.papyrus.infra.gmfdiag.common.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.PapyrusLabelEditPart;

public class AlignLabelCommand extends AbstractAlignLabelCommand {
	
	private Rectangle constraint;
	
	private PapyrusLabelEditPart label;
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		//super.execute();
		
		System.out.println("____J'execute la commande");
	}
	
		

}
