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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.common.tests.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.gmfdiag.common.figure.edge.PapyrusEdgeFigure;
import org.eclipse.papyrus.infra.widgets.util.IRevealSemanticElement;
import org.eclipse.papyrus.junit.utils.tests.AbstractEditorTest;
import org.eclipse.papyrus.uml.diagram.common.tests.Activator;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.Bundle;

/**
 * 
 * @author VL222926
 * 
 */
public class CommonBendpointsTest extends AbstractEditorTest {

	protected Resource di;

	protected Resource notation;

	protected Resource uml;

	protected Diagram diag;

	protected Model root;

	/**
	 * 
	 * Constructor.
	 * This plugin test the ModelExplorerView
	 */
	public CommonBendpointsTest() {
		super();
	}


	@Before
	public void initTests() throws CoreException, IOException {
		try {
			initModel("testBendpoints", "model", getBundle()); //$NON-NLS-1$ //$NON-NLS-2$
		} catch (Exception e) {
			e.printStackTrace();
		}

		ResourceSet set = null;
		try {
			set = getModelSet();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		//		IEditorInput input = this.editor.getEditorInput();
		List<Resource> resources = set.getResources();
		for(Resource current : resources) {
			//			current.load(null);
			if(current.getURI().lastSegment().equals("model.uml")) { //$NON-NLS-1$
				this.uml = current;
			} else if(current.getURI().lastSegment().equals("model.notation")) { //$NON-NLS-1$
				this.notation = current;
			} else if(current.getURI().lastSegment().equals("model.di")) { //$NON-NLS-1$
				this.di = current;
			}


		}
		this.diag = (Diagram)this.notation.getAllContents().next();
		this.root = (Model)this.uml.getContents().get(0);
	}

	protected void verifyCommonBendpoints(final List<Point> wantedPoints, final Collection<Point> pointsFound1) {
		List<Point> pointsFound = new ArrayList<Point>(pointsFound1);
		Assert.assertEquals(wantedPoints.size(), pointsFound.size());
		for(Point current : pointsFound) {
			Assert.assertTrue(wantedPoints.contains(current));
		}

	}

	/**
	 * 
	 * @param name
	 *        the name of a uml element
	 * @return
	 *         the link figure for the element
	 */
	protected PapyrusEdgeFigure getLinkFigureFor(final String name) {
		final NamedElement element = this.root.getMember(name);
		Assert.assertTrue(this.editor.getActiveEditor() instanceof IRevealSemanticElement);
		((IRevealSemanticElement)this.editor.getActiveEditor()).revealSemanticElement(Collections.singletonList(element));
		final ISelection selection = getSelectionService().getSelection();
		Assert.assertTrue(selection instanceof IStructuredSelection);
		Object current = ((IStructuredSelection)selection).getFirstElement();
		Assert.assertTrue(current instanceof IGraphicalEditPart);
		final IFigure fig = ((IGraphicalEditPart)current).getFigure();
		Assert.assertTrue(fig instanceof PapyrusEdgeFigure);
		return (PapyrusEdgeFigure)fig;
	}

	@Test
	public void commonBendpoints_Test1() {
		List<Point> wantedResult = new ArrayList<Point>();
		wantedResult.add(new Point(300, 140));

		PapyrusEdgeFigure fig = getLinkFigureFor("Association1"); //$NON-NLS-1$
		Collection<Point> res = fig.getCommonBendpointsToDraw();
		verifyCommonBendpoints(wantedResult, res);


		fig = getLinkFigureFor("Association2"); //$NON-NLS-1$
		res = fig.getCommonBendpointsToDraw();
		verifyCommonBendpoints(wantedResult, res);


	}

	//no common bendpoints when the link do not share their source or their target
	@Test
	public void commonBendpoints_Test2() {
		List<Point> wantedResult = new ArrayList<Point>();

		PapyrusEdgeFigure fig = getLinkFigureFor("Association3"); //$NON-NLS-1$
		Collection<Point> res = fig.getCommonBendpointsToDraw();
		verifyCommonBendpoints(wantedResult, res);


		fig = getLinkFigureFor("Association4"); //$NON-NLS-1$
		res = fig.getCommonBendpointsToDraw();
		verifyCommonBendpoints(wantedResult, res);
	}

	@Test
	public void commonBendpoints_Test3() {
		List<Point> wantedResult = new ArrayList<Point>();
		wantedResult.add(new Point(280, 840));
		wantedResult.add(new Point(280, 920));

		PapyrusEdgeFigure fig = getLinkFigureFor("Association6"); //$NON-NLS-1$
		Collection<Point> res = fig.getCommonBendpointsToDraw();
		verifyCommonBendpoints(wantedResult, res);


		fig = getLinkFigureFor("Association7"); //$NON-NLS-1$
		res = fig.getCommonBendpointsToDraw();
		verifyCommonBendpoints(wantedResult, res);
	}

	//no common bendpoints between 2 kind of uml link 
	@Test
	public void testCommonbendpoints_Test4() {
		List<Point> wantedResult = new ArrayList<Point>();

		PapyrusEdgeFigure fig = getLinkFigureFor("Association5"); //$NON-NLS-1$
		Collection<Point> res = fig.getCommonBendpointsToDraw();
		verifyCommonBendpoints(wantedResult, res);


		fig = getLinkFigureFor("Dependency1"); //$NON-NLS-1$
		res = fig.getCommonBendpointsToDraw();
		verifyCommonBendpoints(wantedResult, res);
	}

	@Test
	public void commonBendpoints_Test5() {
		List<Point> wantedResult = new ArrayList<Point>();
		wantedResult.add(new Point(1000, 940));
		PapyrusEdgeFigure fig = getLinkFigureFor("Association8"); //$NON-NLS-1$
		Collection<Point> res = fig.getCommonBendpointsToDraw();
		verifyCommonBendpoints(wantedResult, res);


		fig = getLinkFigureFor("Association9"); //$NON-NLS-1$
		res = fig.getCommonBendpointsToDraw();
		verifyCommonBendpoints(wantedResult, res);
	}

	@Test
	public void commonBendpoints_Test6() {
		List<Point> wantedResult = new ArrayList<Point>();
		wantedResult.add(new Point(260, 1200));
		wantedResult.add(new Point(360, 1280));
		wantedResult.add(new Point(380, 1220));
		PapyrusEdgeFigure fig = getLinkFigureFor("Association10"); //$NON-NLS-1$
		Collection<Point> res = fig.getCommonBendpointsToDraw();
		verifyCommonBendpoints(wantedResult, res);


		fig = getLinkFigureFor("Association1&"); //$NON-NLS-1$
		res = fig.getCommonBendpointsToDraw();
		verifyCommonBendpoints(wantedResult, res);
	}

	@Test
	public void testCommonbendpoints_Test7() {
		List<Point> wantedResult = new ArrayList<Point>();

		PapyrusEdgeFigure fig = getLinkFigureFor("Association12"); //$NON-NLS-1$
		Collection<Point> res = fig.getCommonBendpointsToDraw();
		verifyCommonBendpoints(wantedResult, res);


		fig = getLinkFigureFor("Association13"); //$NON-NLS-1$
		res = fig.getCommonBendpointsToDraw();
		verifyCommonBendpoints(wantedResult, res);
	}

	@Test
	public void testCommonbendpoints_Test8() {
		List<Point> wantedResult = new ArrayList<Point>();

		PapyrusEdgeFigure fig = getLinkFigureFor("Association14"); //$NON-NLS-1$
		Collection<Point> res = fig.getCommonBendpointsToDraw();
		verifyCommonBendpoints(wantedResult, res);


		fig = getLinkFigureFor("Association15"); //$NON-NLS-1$
		res = fig.getCommonBendpointsToDraw();
		verifyCommonBendpoints(wantedResult, res);
	}

	@Test
	public void testCommonbendpoints_Test9() {
		List<Point> wantedResult = new ArrayList<Point>();

		PapyrusEdgeFigure fig = getLinkFigureFor("Association22"); //$NON-NLS-1$
		Collection<Point> res = fig.getCommonBendpointsToDraw();
		verifyCommonBendpoints(wantedResult, res);


		fig = getLinkFigureFor("Association23"); //$NON-NLS-1$
		res = fig.getCommonBendpointsToDraw();
		verifyCommonBendpoints(wantedResult, res);
	}

	@Test
	public void testCommonbendpoints_Test10() {
		List<Point> wantedResult = new ArrayList<Point>();
		wantedResult.add(new Point(280, 1900));
		wantedResult.add(new Point(280, 1940));
		wantedResult.add(new Point(280, 2000));
		wantedResult.add(new Point(280, 2040));

		PapyrusEdgeFigure fig = getLinkFigureFor("Association16"); //$NON-NLS-1$
		Collection<Point> res = fig.getCommonBendpointsToDraw();
		verifyCommonBendpoints(wantedResult, res);


		fig = getLinkFigureFor("Association17"); //$NON-NLS-1$
		res = fig.getCommonBendpointsToDraw();
		verifyCommonBendpoints(wantedResult, res);
	}

	@Test
	public void testCommonbendpoints_Test11() {

		PapyrusEdgeFigure fig = getLinkFigureFor("Association19"); //$NON-NLS-1$
		Collection<Point> res = fig.getCommonBendpointsToDraw();
		List<Point> wantedResult = new ArrayList<Point>();
		wantedResult.add(new Point(740, 1980));
		verifyCommonBendpoints(wantedResult, res);


		fig = getLinkFigureFor("Association20"); //$NON-NLS-1$
		res = fig.getCommonBendpointsToDraw();
		wantedResult = new ArrayList<Point>();
		wantedResult.add(new Point(740, 1980));
		wantedResult.add(new Point(780, 2020));
		wantedResult.add(new Point(780, 2060));
		verifyCommonBendpoints(wantedResult, res);


		fig = getLinkFigureFor("Association21"); //$NON-NLS-1$
		res = fig.getCommonBendpointsToDraw();
		wantedResult = new ArrayList<Point>();
		wantedResult.add(new Point(780, 2020));
		wantedResult.add(new Point(780, 2060));
		verifyCommonBendpoints(wantedResult, res);
	}

	protected ISelectionService getSelectionService() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
	}

	protected IStructuredSelection getCurrentSelection() {
		ISelectionService serv = getSelectionService();
		ISelection selection = serv.getSelection();
		return (IStructuredSelection)selection;
	}


	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected String getSourcePath() {
		return "resources/"; //$NON-NLS-1$
	}
}
