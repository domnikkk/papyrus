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
 *  Mickaël ADAM (ALL4TEC) mickael.adam@all4tec.net - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.gmfdiag.common.editpolicies;

import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.gmf.runtime.gef.ui.internal.editpolicies.GraphicalEditPolicyEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.gmfdiag.common.databinding.custom.CustomStringStyleObservableValue;

/**
 * this edit policy has in charge to refresh the edit part when text alignment change.
 */
public class RefreshTextAlignmentEditPolicy extends GraphicalEditPolicyEx implements IChangeListener {

	/** The Constant TEXT_ALIGNMENT. */
	public static final String TEXT_ALIGNMENT = "textAlignment";//$NON-NLS-N$

	/** key for this edit policy. */
	public final static String REFRESH_TEXT_ALIGNMENT_EDITPOLICY = "Refresh text alignment edit policy";//$NON-NLS-N$

	/** The style observable. */
	protected IObservableValue styleObservable;

	protected IObservableValue positionObservable;

	/**
	 *
	 * {@inheritDoc}
	 */
	@Override
	public void activate() {
		// retrieve the view and the element managed by the edit part
		View view = (View) getHost().getModel();
		if (view == null) {
			return;
		}
		// add style observable value
		styleObservable = new CustomStringStyleObservableValue(view, EMFHelper.resolveEditingDomain(view), TEXT_ALIGNMENT);
		styleObservable.addChangeListener(this);

		getHost().refresh();
	}

	/**
	 *
	 * {@inheritDoc}
	 */
	@Override
	public void deactivate() {
		if (styleObservable != null) {
			styleObservable.removeChangeListener(this);
			styleObservable.dispose();
			styleObservable = null;
		}
	}

	/**
	 * @see org.eclipse.core.databinding.observable.IChangeListener#handleChange(org.eclipse.core.databinding.observable.ChangeEvent)
	 *
	 * @param event
	 */
	@Override
	public void handleChange(ChangeEvent event) {
		getHost().refresh();
	}

}
