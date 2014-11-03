/*****************************************************************************
 * Copyright (c) 2014 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.papyrus.infra.services.controlmode.ControlModeRequest;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.PackageRefactoringContext;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.messages.Messages;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.updaters.AbstractDecoratorModelUpdater;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.updaters.CrossReferenceUpdater;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.updaters.LoadedDecoratorModelUpdaterDelegate;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.updaters.PostControlDecoratorModelUpdater;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.updaters.PostUncontrolDecoratorModelUpdater;
import org.eclipse.papyrus.uml.decoratormodel.internal.controlmode.updaters.UnloadedDecoratorModelUpdaterDelegate;

/**
 * Factory for control-mode participant commands that refactor loaded and unloaded decorator model resources
 * according to the changing URIs of referenced objects.
 */
public class DecoratorModelRefactoringCommandFactory {
	private DecoratorModelRefactoringCommandFactory() {
		super();
	}

	public static ICommand createPreCommand(ControlModeRequest request) throws CoreException {
		PackageRefactoringContext context = PackageRefactoringContext.getInstance(request);
		if (context == null) {
			return null;
		}

		boolean needsSave = false;
		CompositeTransactionalCommand result = new CompositeTransactionalCommand(context.getEditingDomain(), Messages.DecoratorModelRefactoringCommandFactory_0);

		// Gather up all the loaded decorator models and create a command for each
		for (URI decoratorModel : context.getAffectedLoadedDecoratorModels()) {
			ICommand refactoringCommand = request.isControlRequest() ?
					createPreControlLoaded(context, decoratorModel) :
					createPreUncontrolLoaded(context, decoratorModel);
			if (refactoringCommand != null) {
				result.add(refactoringCommand);
			}
		}

		// Gather up all the unloaded decorator models and create a command for each
		for (URI decoratorModel : context.getAffectedUnloadedDecoratorModels()) {
			ICommand refactoringCommand = request.isControlRequest() ?
					createPreControlUnloaded(context, decoratorModel) :
					createPreUncontrolUnloaded(context, decoratorModel);
			if (refactoringCommand != null) {
				result.add(refactoringCommand);
				needsSave = true;
			}
		}

		if (result.isEmpty()) {
			// Didn't need any command after all. Fine
			result = null;
		} else if (needsSave) {
			// Must save the model to ensure that the refactoring of unloaded resources is consistent
			result.add(new SaveModelCommand(context));
		}

		context.autoRelease();

		return result;
	}

	private static RefactoringStepStore getStore(PackageRefactoringContext context, URI decoratorModel) {
		RefactoringStepStore result = (RefactoringStepStore) context.getContextData().get(decoratorModel);
		if (result == null) {
			result = new RefactoringStepStore();
			context.getContextData().put(decoratorModel, result);
		}
		return result;
	}

	static CrossReferenceUpdater getCrossReferenceUpdater(PackageRefactoringContext context, URI decoratorModel) {
		RefactoringStepStore store = getStore(context, decoratorModel);
		if (store.crossReferences == null) {
			store.crossReferences = new CrossReferenceUpdater(context, decoratorModel);
		}
		return store.crossReferences;
	}

	static AbstractDecoratorModelUpdater getProfileApplicationsUpdater(PackageRefactoringContext context, URI decoratorModel) {
		RefactoringStepStore store = getStore(context, decoratorModel);
		return store.profileApplications;
	}

	static void setProfileApplicationsUpdater(PackageRefactoringContext context, URI decoratorModel, AbstractDecoratorModelUpdater updater) {
		RefactoringStepStore store = getStore(context, decoratorModel);
		store.profileApplications = updater;
	}

	static AbstractDecoratorModelRefactoringCommand createPreControlLoaded(PackageRefactoringContext context, URI decoratorModel) {
		return null;
	}

	static AbstractDecoratorModelRefactoringCommand createPreControlUnloaded(PackageRefactoringContext context, URI decoratorModel) {
		// We need to undo an control refactoring *after* doing the base refactoring, which means that
		// we must be a pre-refactoring participant for that purpose
		CrossReferenceUpdater crossReferenceUpdater = getCrossReferenceUpdater(context, decoratorModel);
		AbstractDecoratorModelUpdater profileApplicationUpdater = getProfileApplicationsUpdater(context, decoratorModel);
		if (profileApplicationUpdater == null) {
			profileApplicationUpdater = new PostControlDecoratorModelUpdater(new UnloadedDecoratorModelUpdaterDelegate(context.getPackage()), context, decoratorModel);
			setProfileApplicationsUpdater(context, decoratorModel, profileApplicationUpdater);
		}
		// Steps in reverse order relative to the execute/redo direction!
		return new UnloadedDecoratorModelRefactoringCommand(context, decoratorModel, DirectionConstraint.UNREFACTOR_ONLY).addStep(profileApplicationUpdater).addStep(crossReferenceUpdater);
	}

	static AbstractDecoratorModelRefactoringCommand createPreUncontrolLoaded(PackageRefactoringContext context, URI decoratorModel) {
		return null;
	}

	static AbstractDecoratorModelRefactoringCommand createPreUncontrolUnloaded(PackageRefactoringContext context, URI decoratorModel) {
		// We need to undo an uncontrol refactoring *after* undoing the base refactoring, which means that
		// we must actually be a pre-refactoring participant for that purpose
		CrossReferenceUpdater crossReferenceUpdater = getCrossReferenceUpdater(context, decoratorModel);
		AbstractDecoratorModelUpdater profileApplicationUpdater = getProfileApplicationsUpdater(context, decoratorModel);
		if (profileApplicationUpdater == null) {
			profileApplicationUpdater = new PostUncontrolDecoratorModelUpdater(new UnloadedDecoratorModelUpdaterDelegate(context.getPackage()), context, decoratorModel);
			setProfileApplicationsUpdater(context, decoratorModel, profileApplicationUpdater);
		}
		// Steps in reverse order relative to the execute/redo direction!
		return new UnloadedDecoratorModelRefactoringCommand(context, decoratorModel, DirectionConstraint.UNREFACTOR_ONLY).addStep(profileApplicationUpdater).addStep(crossReferenceUpdater);
	}

	public static ICommand createPostCommand(ControlModeRequest request) throws CoreException {
		PackageRefactoringContext context = PackageRefactoringContext.getInstance(request);
		if (context == null) {
			return null;
		}

		boolean needsSave = false;
		CompositeTransactionalCommand result = new CompositeTransactionalCommand(context.getEditingDomain(), Messages.DecoratorModelRefactoringCommandFactory_0);

		// Gather up all the loaded decorator models and create a command for each
		for (URI decoratorModel : context.getAffectedLoadedDecoratorModels()) {
			ICommand refactoringCommand = request.isControlRequest() ?
					createPostControlLoaded(context, decoratorModel) :
					createPostUncontrolLoaded(context, decoratorModel);
			if (refactoringCommand != null) {
				result.add(refactoringCommand);
			}
		}

		// Gather up all the unloaded decorator models and create a command for each
		for (URI decoratorModel : context.getAffectedUnloadedDecoratorModels()) {
			ICommand refactoringCommand = request.isControlRequest() ?
					createPostControlUnloaded(context, decoratorModel) :
					createPostUncontrolUnloaded(context, decoratorModel);
			if (refactoringCommand != null) {
				result.add(refactoringCommand);
				needsSave = true;
			}
		}

		if (result.isEmpty()) {
			// Didn't need any command after all. Fine
			result = null;
		} else if (needsSave) {
			// Must save the model to ensure that the refactoring of unloaded resources is consistent
			result.add(new SaveModelCommand(context));
		}

		context.autoRelease();

		return result;
	}

	static AbstractDecoratorModelRefactoringCommand createPostControlLoaded(PackageRefactoringContext context, URI decoratorModel) {
		AbstractDecoratorModelUpdater profileApplicationUpdater = getProfileApplicationsUpdater(context, decoratorModel);
		if (profileApplicationUpdater == null) {
			profileApplicationUpdater = new PostControlDecoratorModelUpdater(new LoadedDecoratorModelUpdaterDelegate(context.getPackage()), context, decoratorModel);
			setProfileApplicationsUpdater(context, decoratorModel, profileApplicationUpdater);
		}
		return new LoadedDecoratorModelRefactoringCommand(context, decoratorModel).addStep(profileApplicationUpdater);
	}

	static AbstractDecoratorModelRefactoringCommand createPostControlUnloaded(PackageRefactoringContext context, URI decoratorModel) {
		// We need to execute/redo an control refactoring *after* doing the base refactoring, which means that
		// we must be a post-refactoring participant for that purpose
		CrossReferenceUpdater crossReferenceUpdater = getCrossReferenceUpdater(context, decoratorModel);
		AbstractDecoratorModelUpdater profileApplicationUpdater = getProfileApplicationsUpdater(context, decoratorModel);
		if (profileApplicationUpdater == null) {
			profileApplicationUpdater = new PostControlDecoratorModelUpdater(new UnloadedDecoratorModelUpdaterDelegate(context.getPackage()), context, decoratorModel);
			setProfileApplicationsUpdater(context, decoratorModel, profileApplicationUpdater);
		}
		return new UnloadedDecoratorModelRefactoringCommand(context, decoratorModel, DirectionConstraint.REFACTOR_ONLY).addStep(crossReferenceUpdater).addStep(profileApplicationUpdater);
	}

	static AbstractDecoratorModelRefactoringCommand createPostUncontrolLoaded(PackageRefactoringContext context, URI decoratorModel) {
		AbstractDecoratorModelUpdater profileApplicationUpdater = getProfileApplicationsUpdater(context, decoratorModel);
		if (profileApplicationUpdater == null) {
			profileApplicationUpdater = new PostUncontrolDecoratorModelUpdater(new LoadedDecoratorModelUpdaterDelegate(context.getPackage()), context, decoratorModel);
			setProfileApplicationsUpdater(context, decoratorModel, profileApplicationUpdater);
		}
		return new LoadedDecoratorModelRefactoringCommand(context, decoratorModel).addStep(profileApplicationUpdater);
	}

	static AbstractDecoratorModelRefactoringCommand createPostUncontrolUnloaded(PackageRefactoringContext context, URI decoratorModel) {
		// We need to execute/redo an uncontrol refactoring *after* doing the base refactoring, which means that
		// we must be a post-refactoring participant for that purpose
		CrossReferenceUpdater crossReferenceUpdater = getCrossReferenceUpdater(context, decoratorModel);
		AbstractDecoratorModelUpdater profileApplicationUpdater = getProfileApplicationsUpdater(context, decoratorModel);
		if (profileApplicationUpdater == null) {
			profileApplicationUpdater = new PostUncontrolDecoratorModelUpdater(new UnloadedDecoratorModelUpdaterDelegate(context.getPackage()), context, decoratorModel);
			setProfileApplicationsUpdater(context, decoratorModel, profileApplicationUpdater);
		}
		return new UnloadedDecoratorModelRefactoringCommand(context, decoratorModel, DirectionConstraint.REFACTOR_ONLY).addStep(crossReferenceUpdater).addStep(profileApplicationUpdater);
	}

	//
	// Nested types
	//

	private static class RefactoringStepStore {
		CrossReferenceUpdater crossReferences;
		AbstractDecoratorModelUpdater profileApplications;
	}
}
