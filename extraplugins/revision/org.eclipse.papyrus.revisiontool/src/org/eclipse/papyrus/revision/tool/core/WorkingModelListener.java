package org.eclipse.papyrus.revision.tool.core;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;


public class WorkingModelListener extends EContentAdapter {
	
	@Override
	public void notifyChanged(Notification notification) {
		// TODO Auto-generated method stub
		super.notifyChanged(notification);
		System.err.println("J'ecoute "+ notification);
	}

}
