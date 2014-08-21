package org.eclipse.papyrus.eastadl.nattable.menu.handlers;

import org.eclipse.papyrus.eastadl.service.types.menu.AbstractCreateEastadlChildMenu;
import org.eclipse.papyrus.infra.nattable.utils.NattableWidgetPropertyTester;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.menus.IContributionRoot;
import org.eclipse.ui.services.IServiceLocator;

public class EastAdlNattableCreateMenu extends AbstractCreateEastadlChildMenu {

	private NattableWidgetPropertyTester tester = new NattableWidgetPropertyTester();

	@Override
	public void createContributionItems(IServiceLocator serviceLocator, IContributionRoot additions) {
		IWorkbenchPart part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart();
		if (tester.test(part, NattableWidgetPropertyTester.IS_NATTABLE_WIDGET, null, Boolean.TRUE)) {
			super.createContributionItems(serviceLocator, additions);
		}
	}
}
