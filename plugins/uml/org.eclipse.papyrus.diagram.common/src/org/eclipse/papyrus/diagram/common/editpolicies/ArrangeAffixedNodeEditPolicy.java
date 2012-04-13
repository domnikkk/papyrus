/*****************************************************************************
 * Copyright (c) 2011 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Arthur Daussy (Atos) - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.diagram.common.editpolicies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.diagram.common.locator.PortPositionLocatorUtils;
import org.eclipse.papyrus.diagram.common.requests.ArrangeAffixedNodeRequest;
import org.eclipse.papyrus.diagram.common.util.AffixedNodeDispatcher;
import org.eclipse.papyrus.diagram.common.util.functions.EObjectToViewFunction;
import org.eclipse.papyrus.diagram.common.util.functions.SettingToEObjectFunction;
import org.eclipse.papyrus.diagram.common.util.predicates.ReferencingViewPredicate;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multimap;

/**
 * This policy is base policy for polocies whichcan graphically arrange affixed nodes such as {@link Pin} or {@link Port}
 */
/**
 * @author adaussy
 * 
 */
public abstract class ArrangeAffixedNodeEditPolicy extends GraphicalEditPolicy {

	/**
	 * Iterator which will return points along one side of the host figure
	 */
	protected class BoundaryIterator implements Iterator<Point> {

		private static final int MINUS_OFFSET_CONSTANT = -10;

		/**
		 * bounds of the host figure
		 */
		private Rectangle hostBounds;

		/**
		 * Side on the figure to get the points. {@see AffixedNodeDispatcher}
		 */
		private Integer side;

		/**
		 * Number of point needed
		 */
		private int numberOfElement;

		/**
		 * List of all points
		 */
		private List<Point> points;

		/**
		 * Current index of the points
		 */
		private int index = 0;


		/**
		 * Constructor
		 * 
		 * @param hostBounds
		 *        Bounds of the host figure
		 * @param side
		 *        Side on which the point will be calculated
		 * @param numberOfElement
		 *        Number of element needed
		 */
		public BoundaryIterator(Rectangle hostBounds, Integer side, int numberOfElement) {
			super();
			this.hostBounds = hostBounds;
			this.side = side;
			this.numberOfElement = numberOfElement;
			points = new ArrayList<Point>(numberOfElement);
			computePoint();
		}

		/**
		 * Compute all needed point along the side of the host figure
		 */
		private void computePoint() {
			for(int i = 1; i <= (numberOfElement + 2); i++) {
				if(i == 1 || i == (numberOfElement + 2)) {
					continue;
				}
				Point point = new Point(getX(i), getY(i));
				points.add(point);
			}
		}

		/**
		 * Compute Y coordinate
		 */
		private int getY(int i) {
			switch(side) {
			case AffixedNodeDispatcher.NORTH:
				return MINUS_OFFSET_CONSTANT;
			case AffixedNodeDispatcher.SOUTH:
				return hostBounds.getBottom().y();
			case AffixedNodeDispatcher.EAST:
				return (i * hostBounds.height()) / (numberOfElement + 2);
			case AffixedNodeDispatcher.WEST:
				return (i * hostBounds.height()) / (numberOfElement + 2);
			case AffixedNodeDispatcher.ERROR:
				return MINUS_OFFSET_CONSTANT;
			default:
				return 0;
			}
		}

		/**
		 * Compute Y coordinate
		 */
		private int getX(int i) {
			switch(side) {
			case AffixedNodeDispatcher.NORTH:
				return (i * hostBounds.width()) / (numberOfElement + 2);
			case AffixedNodeDispatcher.SOUTH:
				return (i * hostBounds.width()) / (numberOfElement + 2);
			case AffixedNodeDispatcher.EAST:
				return hostBounds.getRight().x();
			case AffixedNodeDispatcher.WEST:
				return MINUS_OFFSET_CONSTANT;
			case AffixedNodeDispatcher.ERROR:
				return MINUS_OFFSET_CONSTANT;
			default:
				return 0;
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.util.Iterator#hasNext()
		 */
		public boolean hasNext() {
			return index < numberOfElement;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.util.Iterator#next()
		 */
		public Point next() {
			Point result = points.get(index);
			index++;
			return result;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.util.Iterator#remove()
		 */
		public void remove() {
		}
	}

	/**
	 * {@link AffixedNodeDispatcher} which will sort affixed node among each side of the host figure
	 */
	protected abstract AffixedNodeDispatcher getDispatcher();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editpolicies.AbstractEditPolicy#getCommand(org.eclipse.gef.Request)
	 */
	@Override
	public Command getCommand(Request request) {
		if(ArrangeAffixedNodeRequest.ARRANGE_AFFIXED_NODE.equals(request.getType())) {
			return arrangeChildrenCommand((ArrangeAffixedNodeRequest)request);
		}
		return super.getCommand(request);
	}


	/**
	 * Compute node {@link SetBoundsCommand} in order to arrange affixed node
	 * 
	 * @param request
	 *        {@link ArrangeAffixedNodeRequest}
	 * @return
	 */
	protected Command arrangeChildrenCommand(ArrangeAffixedNodeRequest request) {
		List<View> affixedNodeView = getViewToArrange(request);
		Multimap<Integer, View> dispachesViews = getDispatcher().dispatch(affixedNodeView);
		CompositeTransactionalCommand cc = new CompositeTransactionalCommand(getEditingDomain(), "Arrange all affixed node");////$NON-NLS-1$
		for(int side : dispachesViews.keySet()) {
			BoundaryIterator pointIterator = new BoundaryIterator(getHostFigure().getBounds(), side, dispachesViews.get(side).size());
			Iterator<View> viewIterator = dispachesViews.get(side).iterator();
			while(pointIterator.hasNext() && viewIterator.hasNext()) {
				Point newPoint = pointIterator.next();
				Rectangle newBounds = new Rectangle(newPoint, new Dimension(20, 20));
				newBounds = PortPositionLocatorUtils.getBorderLocation(getHostFigure().getBounds().getCopy(), newBounds, 10);
				View view = viewIterator.next();
				StringBuilder stringBuilder = new StringBuilder();
				stringBuilder.append("Set bounds of ");
				stringBuilder.append(getCorrectLabel(view));
				stringBuilder.append("at ");
				stringBuilder.append(newBounds);
				String label = stringBuilder.toString();
				SetBoundsCommand setBoundsCommand = new SetBoundsCommand(getEditingDomain(), label, new EObjectAdapter(view), newBounds.getLocation());////$NON-NLS-1$
				if(setBoundsCommand.canExecute()) {
					cc.compose(setBoundsCommand);
				}
			}
		}
		return new ICommandProxy(cc);
	}

	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart)getHost()).getEditingDomain();
	}

	public static String getCorrectLabel(View v) {
		ComposedAdapterFactory factory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		AdapterFactoryLabelProvider provider = new AdapterFactoryLabelProvider(factory);
		EObject element = v.getElement();
		if(element != null) {
			return provider.getText(element);
		}
		return "";////$NON-NLS-1$
	}

	protected abstract List<View> getViewToArrange(ArrangeAffixedNodeRequest request);


	/**
	 * Get the first referencing view of the element which is in the diagram passed in argument
	 * 
	 * @param element
	 *        Element you want to get the view from
	 * @param diag
	 *        Diagram where the view is stored
	 * @return Iterable<View> or Empty colelction
	 */
	public static Iterable<View> getReferencingView(EObject element) {
		if(element != null) {
			Resource eResource = element.eResource();
			if(eResource != null) {
				ECrossReferenceAdapter adapter = ECrossReferenceAdapter.getCrossReferenceAdapter(eResource.getResourceSet());
				if(adapter == null) {
					adapter = new ECrossReferenceAdapter();
				}
				Collection<Setting> inverseReferences = adapter.getInverseReferences(element);
				Iterable<EObject> settings = Iterables.transform(inverseReferences, new SettingToEObjectFunction());
				Iterable<EObject> eObjects = Iterables.filter(settings, new ReferencingViewPredicate(element));
				Iterable<View> views = Iterables.transform(eObjects, new EObjectToViewFunction());
				return views;
			}
		}
		return Collections.emptyList();
	}

	/**
	 * Get the first Referencing view which correspond to all criteria passed in arguments
	 * 
	 * @param element
	 *        Element you want to get the view from
	 * @param criterias
	 *        Criteria that the view has to respect
	 * @return
	 */
	public static Iterable<View> getFirstReferencingViewWithCriteria(EObject element, Predicate<View>... criterias) {
		Predicate<View> globalPredicate = null;
		for(Predicate<View> pre : criterias) {
			if(globalPredicate == null) {
				globalPredicate = pre;
			} else {
				globalPredicate = Predicates.and(globalPredicate, pre);
			}
		}
		Iterable<View> initialItererable = getReferencingView(element);
		return Iterables.filter(initialItererable, globalPredicate);
	}

	/**
	 * Get the first referencing view of the element which is in the parent passed in argument
	 * 
	 * @param element
	 *        Element you want to get the view from
	 * @param parent
	 *        Rooting searching point
	 * @return The {@link View} or null
	 */
	public static View getFirstReferencingViewInPartent(EObject element, View parent) {
		Iterable<View> views = getReferencingView(element);
		if(views != null) {
			Iterator<View> ite = views.iterator();
			/*
			 * Take the first view which in the in the diagram
			 */
			while(ite.hasNext()) {
				View v = ite.next();
				if(EcoreUtil.isAncestor(parent, v)) {
					return v;
				}
			}
		}
		return null;

	}



}
