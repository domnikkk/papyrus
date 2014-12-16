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
package org.eclipse.papyrus.revision.tool.ui;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.papyrus.infra.core.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.revision.tool.core.ReviewResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;

/**
 *  This class is the review editor that displays reviews or comments. This is an instance of a eclipse view. It references a content and label provider to display reviews. 
 *
 */
public class ReviewsEditor extends ViewPart implements ITabbedPropertySheetPageContributor{

	protected static final String ORG_ECLIPSE_PAPYRUS_REVISIONTOOL = "org.eclipse.papyrus.revisiontool";
	protected ReviewResourceManager reviewResourceManager= new ReviewResourceManager();
	private TreeViewer viewer;
	protected List<IPropertySheetPage> propertySheetPages = new ArrayList<IPropertySheetPage>();
	protected ResourceSetListenerImpl reviewEditorResourceListener=null;

	private static FontData[] getModifiedFontData(FontData[] originalData, int additionalStyle) {
		FontData[] styleData = new FontData[originalData.length];
		for (int i = 0; i < styleData.length; i++) {
			FontData base = originalData[i];
			styleData[i] = new FontData(base.getName(), base.getHeight(), base.getStyle() | additionalStyle);
		}
		return styleData;
	}
	/**
	 * only his class can create it
	 * @return review resource manger
	 */
	public ReviewResourceManager getReviewResourceManager(){
		return reviewResourceManager;
	}


	@Override
	public void dispose() {
		reviewResourceManager.getDomain().removeResourceSetListener(getResourceListener());
		reviewResourceManager.dispose();
		reviewResourceManager=null;
		super.dispose();

	}
	/**
	 * create the contextual menu
	 */
	protected  void createContextMenu() {
		// Create menu manager.
		MenuManager menuMgr = new MenuManager("#PopMenu");
		menuMgr.setRemoveAllWhenShown(true);
		// Register menu for extension.
		getSite().registerContextMenu(menuMgr, viewer);
		menuMgr.addMenuListener(new IMenuListener() {
			@Override
			public void menuAboutToShow(IMenuManager manager) {
				filterContextMenu(manager);
			}
		});

		// Create menu.
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().setSelectionProvider(viewer);


	}
	/**
	 * filter contextual menu
	 * @param mgr the menumanager
	 */
	protected void filterContextMenu(IMenuManager mgr) {
		IContributionItem[] contributionItems=mgr.getItems();
		for (int i = 0; i < contributionItems.length; i++) {
			if(!(contributionItems[i].getId().startsWith(ORG_ECLIPSE_PAPYRUS_REVISIONTOOL))){
				mgr.remove(contributionItems[i]);
			}
		}

	}

	/**
	 * 
	 * @return listener to refresh the editor
	 */
	public ResourceSetListener getResourceListener(){
		if(reviewEditorResourceListener==null){
			reviewEditorResourceListener= new ResourceSetListenerImpl(){

				@Override
				public void resourceSetChanged(ResourceSetChangeEvent event) {
					HashSet<Resource> notifiers=new HashSet<Resource>();
					boolean closeSignal=false;

					for (Notification notification : event.getNotifications()) {
						if(notification.getNotifier() instanceof EObject){
							notifiers.add(((EObject)notification.getNotifier()).eResource());
						}
						if((notification.getNotifier()) instanceof Resource){
							if(((reviewResourceManager.getWorkingModel().eResource()==null)&&notification.getEventType()==Notification.REMOVE_MANY)){
								closeSignal=true;
							}
						}
					}
					for ( Resource currentResource : notifiers) {
						if(reviewResourceManager.getCurrentReviewModel().eResource().equals(currentResource)){
							viewer.setInput(reviewResourceManager.getCurrentReviewModel());
						}
					}
					if (closeSignal){
						IViewPart part=(IViewPart)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("org.eclipse.papyrus.revisiontool.commentview");
						PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().hideView(part);
					}
				}
				@Override
				public boolean isPostcommitOnly() {
					return true;
				}

			};
		}
		return reviewEditorResourceListener;
	}

	/**
	 * add a review
	 * @param container
	 */
	public void addAReview(Element container) {
		reviewResourceManager.addAReview(container);
		viewer.setInput(reviewResourceManager.getCurrentReviewModel());
		reviewResourceManager.getDomain().addResourceSetListener(getResourceListener());
	}
	/**
	 * create action in the view
	 */
	public void createActions() {
		Action	loadReview = new Action("Load a review model") {
			@Override
			public void run() {
				Model reviewModel=reviewResourceManager.loadReviewModel();
				viewer.setInput(reviewModel);
				reviewResourceManager.getDomain().addResourceSetListener(getResourceListener());
			}
			@Override
			public String getDescription() {
				return "Load a review Model";
			}
		};

		Action	addReview = new Action("Add a review") {
			@Override
			public void run() {
				addAReview(null);	
			}

			@Override
			public String getDescription() {
				return "Add a review";
			}
		};

		try {
			loadReview.setImageDescriptor( ImageDescriptor.createFromURL(new URL("platform:/plugin/org.eclipse.papyrus.revisiontool/img/load.png")));
			addReview.setImageDescriptor( ImageDescriptor.createFromURL(new URL("platform:/plugin/org.eclipse.papyrus.revisiontool/img/Add.png")));

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		IToolBarManager mgr = getViewSite().getActionBars().getToolBarManager();
		mgr.add(loadReview);
		mgr.add(addReview);
	}


	@Override
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent,  SWT.MULTI | SWT.FULL_SELECTION);
		viewer.setContentProvider(new ReviewsTreeContentProvider());
		FontData[] boldFontData= getModifiedFontData(viewer.getTree().getFont().getFontData(), SWT.BOLD);
		FontData[] italicFontData= getModifiedFontData(viewer.getTree().getFont().getFontData(), SWT.ITALIC);
		Font boldFont = new Font(Display.getCurrent(), boldFontData);
		Font italicFont = new Font(Display.getCurrent(), italicFontData);
		viewer.setLabelProvider(new ReviewsTreeLabelProvider(boldFont,  italicFont));
		createContextMenu();
		createActions();


		// this code comes from eclipse  in oder to display multi line in a tree
		Listener paintListener = new Listener() {
			public void handleEvent(Event event) {
				switch(event.type) {       
				case SWT.MeasureItem: {
					TreeItem item = (TreeItem)event.item;
					String text = item.getText();
					Point size = event.gc.textExtent(text);
					event.width = size.x+20;
					event.height = Math.max(event.height, size.y);
					break;
				}
				case SWT.PaintItem: {
					TreeItem item = (TreeItem)event.item;
					String text = item.getText();
					Point size = event.gc.textExtent(text);                
					int offset2 = event.index == 0 ? Math.max(0, (event.height - size.y) / 2) : 0;
					event.gc.drawText(text, event.x, event.y + offset2, true);
					break;
				}
				case SWT.EraseItem: {  
					event.detail &= ~SWT.FOREGROUND;
					break;
				}
				}
			}
		};
		viewer.getTree().addListener(SWT.MeasureItem, paintListener);
		viewer.getTree().addListener(SWT.EraseItem, paintListener);
		getSite().setSelectionProvider(viewer);



	}
	/**
	 * launch the model revision and load review model in the editor
	 */
	public void startModeRevision(){
		viewer.setInput(reviewResourceManager.getCurrentReviewModel());
		reviewResourceManager.getDomain().addResourceSetListener(getResourceListener());
		reviewResourceManager.startModeRevision();
	}
	/**
	 * stop the model revision and load review model in the editor
	 */
	public void stopModelRevision(){
		viewer.setInput(reviewResourceManager.getCurrentReviewModel());
		reviewResourceManager.getDomain().addResourceSetListener(getResourceListener());
		reviewResourceManager.stopModelRevision();
		
	}
	/**
	 * Retrieves the {@link IPropertySheetPage} that his Model Explorer uses.
	 *
	 * @return
	 */
	private IPropertySheetPage getPropertySheetPage() {
		try {
			final IMultiDiagramEditor multiDiagramEditor = getReviewResourceManager().getServiceRegistry().getService(IMultiDiagramEditor.class);

			if (multiDiagramEditor != null) {
				if (multiDiagramEditor instanceof ITabbedPropertySheetPageContributor) {
					ITabbedPropertySheetPageContributor contributor = (ITabbedPropertySheetPageContributor) multiDiagramEditor;
					IPropertySheetPage propertySheetPage = new TabbedPropertySheetPage(contributor);
					this.propertySheetPages.add(propertySheetPage);
					return propertySheetPage;
				}
			}
		} catch (ServiceException ex) {
			System.err.println(ex);
		}
		return null;
	}

	public Object getAdapter(Class adapter) {
		if ((IPropertySheetPage.class.equals(adapter))) {
			return getPropertySheetPage();
		}

		else {
			return super.getAdapter(adapter);
		}
	}
	
	@Override
	public void setFocus() {


	}

	@Override
	public String getContributorId() {
		return "TreeOutlinePage";
	}

}
