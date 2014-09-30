/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.releng.tools.internal.handler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.b3.aggregator.Aggregation;
import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.b3.aggregator.MappedRepository;
import org.eclipse.b3.aggregator.transformer.TransformationManager;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.oomph.base.Annotation;
import org.eclipse.oomph.base.BaseFactory;
import org.eclipse.oomph.p2.Repository;
import org.eclipse.oomph.p2.RepositoryList;
import org.eclipse.oomph.targlets.Targlet;
import org.eclipse.papyrus.releng.tools.internal.Activator;
import org.eclipse.papyrus.releng.tools.internal.popup.actions.OomphSetupUpdater;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISources;
import org.eclipse.ui.dialogs.FilteredItemsSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * @author damus
 *
 */
public class AddSetupRepositoryUpdateAnnotationHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Collection<? extends Repository> repositories = getSelectedRepositories(event);

		if (!repositories.isEmpty()) {
			Shell activeShell = HandlerUtil.getActiveShell(event);

			try {
				IFile aggrFile = AbstractDependencyHandler.chooseAggregationBuildFile(AbstractDependencyHandler.findAggregationBuildFiles(), activeShell);
				if (aggrFile != null) {
					ResourceSet rset = new ResourceSetImpl();

					List<IAggregationElementProxy> elements = loadContributionsAndRepositories(rset, URI.createPlatformResourceURI(aggrFile.getFullPath().toString(), true));

					Map<Repository, IAggregationElementProxy> updates = new HashMap<Repository, AddSetupRepositoryUpdateAnnotationHandler.IAggregationElementProxy>();
					for (Repository repo : repositories) {
						FilteredItemsSelectionDialog dlg = createSelectionDialog(activeShell, repo, elements);
						if (dlg.open() == Window.OK) {
							IAggregationElementProxy selected = (IAggregationElementProxy) dlg.getFirstResult();
							if (selected != null) {
								updates.put(repo, selected);
							}
						}
					}

					if (!updates.isEmpty()) {
						createOrUpdateAnnotations(updates);
					}
				}
			} catch (CoreException e) {
				throw new ExecutionException("Failed to set the repository update annotation.", e);
			}
		}

		return null;
	}

	@Override
	public void setEnabled(Object evaluationContext) {
		setBaseEnabled(!getSelectedRepositories(evaluationContext).isEmpty());
	}

	private Collection<Repository> getSelectedRepositories(Object context) {
		List<Repository> result = new ArrayList<Repository>();

		Object variable = null;
		if (context instanceof ExecutionEvent) {
			variable = HandlerUtil.getCurrentSelection((ExecutionEvent) context);
		} else {
			variable = HandlerUtil.getVariable(context, ISources.ACTIVE_CURRENT_SELECTION_NAME);
		}

		if (variable instanceof IStructuredSelection) {
			for (Iterator<?> iter = ((IStructuredSelection) variable).iterator(); iter.hasNext();) {
				Object selected = iter.next();
				if (selected instanceof Repository) {
					Repository repo = (Repository) selected;
					if ((repo.eContainer() instanceof RepositoryList) && (repo.eContainer().eContainer() instanceof Targlet)) {
						result.add(repo);
					}
				}
			}
		}

		return result;
	}

	protected List<IAggregationElementProxy> loadContributionsAndRepositories(ResourceSet rset, URI uri) throws CoreException {
		// Ensure that the Aggregator model is loaded because the model plug-in doesn't register it
		AggregatorPackage.eINSTANCE.eClass();

		List<IAggregationElementProxy> result = new ArrayList<AddSetupRepositoryUpdateAnnotationHandler.IAggregationElementProxy>();
		Resource resource;

		try {
			resource = rset.getResource(uri, true);
		} catch (Exception e) {
			try {
				TransformationManager transformationManager = new TransformationManager(uri);
				resource = transformationManager.transformResource(true);
			} catch (Exception e1) {
				throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error loading b3aggr. Make sure you have the latest version of B3 installed: " + e.getLocalizedMessage(), e1)); //$NON-NLS-1$
			}
		}

		if (resource.getContents().size() == 0) {
			throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "The b3aggr resource is empty")); //$NON-NLS-1$
		}

		Aggregation aggregation = (Aggregation) EcoreUtil.getObjectByType(resource.getContents(), AggregatorPackage.Literals.AGGREGATION);
		if (aggregation != null) {
			List<Contribution> contributions = aggregation.getAllContributions(true);
			for (Contribution next : contributions) {
				List<MappedRepository> repositories = next.getRepositories(true);
				switch (repositories.size()) {
				case 0:
					break;
				case 1:
					result.add(new ContributionProxy(next)); // Add the contribution, itself
					break;
				default:
					// User must select a specific repository
					int index = 0;
					for (MappedRepository repo : repositories) {
						result.add(new RepositoryProxy(next, repo, index++));
					}
					break;
				}
			}
		}

		return result;
	}

	protected void createOrUpdateAnnotations(final Map<Repository, IAggregationElementProxy> selection) {
		EObject context = EcoreUtil.getRootContainer(selection.keySet().iterator().next());
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(context);
		if (domain == null) {
			doCreateOrUpdateAnnotation(selection);
		} else {
			domain.getCommandStack().execute(new ChangeCommand(context) {
				{
					setLabel("Set Update Annotation"); //$NON-NLS-1$
				}

				@Override
				protected void doExecute() {
					doCreateOrUpdateAnnotation(selection);
				}
			});
		}
	}

	protected void doCreateOrUpdateAnnotation(Map<Repository, IAggregationElementProxy> selection) {
		for (Map.Entry<Repository, IAggregationElementProxy> next : selection.entrySet()) {
			Repository repo = next.getKey();
			IAggregationElementProxy aggr = next.getValue();

			Annotation annotation = repo.getAnnotation(OomphSetupUpdater.ANNOTATION_SOURCE);
			if (annotation == null) {
				annotation = BaseFactory.eINSTANCE.createAnnotation(OomphSetupUpdater.ANNOTATION_SOURCE);
				repo.getAnnotations().add(annotation);
			}

			annotation.getDetails().put(OomphSetupUpdater.UPDATE_KEY, aggr.getUpdateSpec());

			// And, while we're at it, update the repository
			repo.setURL(aggr.getRepositoryURL());
		}
	}

	protected FilteredItemsSelectionDialog createSelectionDialog(Shell parentShell, Repository repo, final Collection<? extends IAggregationElementProxy> contents) {
		FilteredItemsSelectionDialog result = new FilteredItemsSelectionDialog(parentShell) {

			@Override
			protected IStatus validateItem(Object item) {
				return Status.OK_STATUS;
			}

			@SuppressWarnings("rawtypes")
			@Override
			protected Comparator getItemsComparator() {
				return new Comparator() {
					@Override
					public int compare(Object o1, Object o2) {
						if ((o1.getClass() != o2.getClass()) || (o1 instanceof ContributionProxy)) {
							String label1 = ((IAggregationElementProxy) o1).getLabel();
							String label2 = ((IAggregationElementProxy) o2).getLabel();
							return label1.compareTo(label2);
						} else {
							RepositoryProxy repo1 = (RepositoryProxy) o1;
							RepositoryProxy repo2 = (RepositoryProxy) o2;
							if (repo1.getContribution() == repo2.getContribution()) {
								// Use the ordered in which they are defined in the contribution
								return repo1.getIndex() - repo2.getIndex();
							} else {
								// Sort by contribution
								String label1 = repo1.getContribution().getLabel();
								String label2 = repo2.getContribution().getLabel();
								return label1.compareTo(label2);
							}
						}
					}
				};
			}

			@Override
			public String getElementName(Object item) {
				return ((IAggregationElementProxy) item).getContribution().getLabel();
			}

			@Override
			protected IDialogSettings getDialogSettings() {
				return DialogSettings.getOrCreateSection(Activator.getDefault().getDialogSettings(), "AddSetupRepositoryUpdateAnnotation"); //$NON-NLS-1$
			}

			@Override
			protected void fillContentProvider(AbstractContentProvider contentProvider, ItemsFilter itemsFilter, IProgressMonitor progressMonitor) throws CoreException {
				for (Object next : contents) {
					contentProvider.add(next, itemsFilter);
				}
				if (progressMonitor != null) {
					progressMonitor.done();
				}
			}

			@Override
			protected ItemsFilter createFilter() {
				return new ItemsFilter() {

					@Override
					public boolean matchItem(Object item) {
						return matches(((IAggregationElementProxy) item).getLabel());
					}

					@Override
					public boolean isConsistentItem(Object item) {
						return true; // The aggregation model is not editable in this context
					}
				};
			}

			@Override
			protected Control createExtendedContentArea(Composite parent) {
				return null;
			}
		};


		result.setTitle("Select Aggregation Component");
		result.setMessage(String.format("Select an aggregation component or repository for \"%s\".", repo.getURL()));

		result.setListLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				return (element == null) ? "" : ((IAggregationElementProxy) element).getLabel(); //$NON-NLS-1$
			}
		});

		result.setDetailsLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				return ((IAggregationElementProxy) element).getDetails();
			}
		});

		result.setInitialPattern("**", FilteredItemsSelectionDialog.FULL_SELECTION); //$NON-NLS-1$

		return result;
	}

	protected interface IAggregationElementProxy {
		Contribution getContribution();

		String getLabel();

		String getDetails();

		String getUpdateSpec();

		String getRepositoryURL();
	}

	protected static final class ContributionProxy implements IAggregationElementProxy {
		private final Contribution contribution;

		public ContributionProxy(Contribution contribution) {
			this.contribution = contribution;
		}

		@Override
		public Contribution getContribution() {
			return contribution;
		}

		@Override
		public String getLabel() {
			String result = contribution.getLabel();
			return (result == null) ? "" : result;
		}

		@Override
		public String getDetails() {
			if ((contribution.getDescription() != null) && (contribution.getDescription().length() > 0)) {
				return String.format("%s - %s", contribution.getLabel(), contribution.getDescription());
			} else {
				return contribution.getLabel();
			}
		}

		@Override
		public String getUpdateSpec() {
			return contribution.getLabel();
		}

		@Override
		public String getRepositoryURL() {
			return contribution.getRepositories(true).get(0).getLocation();
		}
	}

	protected static final class RepositoryProxy implements IAggregationElementProxy {
		private final Contribution contribution;
		private final MappedRepository repository;
		private final int index;

		public RepositoryProxy(Contribution contribution, MappedRepository repository, int index) {
			this.contribution = contribution;
			this.repository = repository;
			this.index = index;
		}

		public Contribution getContribution() {
			return contribution;
		}

		public MappedRepository getRepository() {
			return repository;
		}

		public int getIndex() {
			return index;
		}

		public String getLabel() {
			return String.format("%s - %s", contribution.getLabel(), repository.getLocation());
		}

		public String getDetails() {
			if ((contribution.getDescription() != null) && (contribution.getDescription().length() > 0)) {
				return String.format("%s (%s) - %s", contribution.getLabel(), contribution.getDescription(), repository.getLocation());
			} else {
				return getLabel();
			}
		}

		@Override
		public String getUpdateSpec() {
			return String.format("%s:%s", contribution.getLabel(), index);
		}

		@Override
		public String getRepositoryURL() {
			return repository.getLocation();
		}
	}
}
