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

package org.eclipse.papyrus.uml.decoratormodel.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.junit.utils.rules.ModelSetFixture;
import org.eclipse.papyrus.junit.utils.rules.ServiceRegistryModelSetFixture;
import org.eclipse.papyrus.uml.decoratormodel.helper.DecoratorModelUtils;
import org.eclipse.papyrus.uml.decoratormodel.model.DecoratorModel;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.rules.TestName;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * Common test infrastructure for profile application externalization tests.
 */
public abstract class AbstractProfileExternalizationTest extends AbstractPapyrusTest {

	@Rule
	public final ModelSetFixture modelSet = new ServiceRegistryModelSetFixture();

	@Rule
	public final TestName testName = new TestName();

	private EditingDomain testContext;

	public AbstractProfileExternalizationTest() {
		super();
	}

	protected URI createDecoratorModelURI(String resourceKey) {
		return createDecoratorModelURI(modelSet.getModelResourceURI(), resourceKey);
	}

	protected URI createDecoratorModelURI(URI modelURI, String resourceKey) {
		return modelURI.trimSegments(1).appendSegment(resourceKey + ".decorator.uml");
	}

	protected Resource loadDecoratorModel(String resourceKey) {
		Resource result = null;
		ResourceSet context = getTestContextResourceSet();

		if (context instanceof ModelSet) {
			DecoratorModel model = DecoratorModel.getInstance((ModelSet) context);
			if (model != null) {
				result = model.loadDecoratorModel(createDecoratorModelURI(modelSet.getModelResourceURI(), resourceKey));
			}
		} else {
			URI resourceURI = createDecoratorModelURI(resourceKey);
			if (context.getURIConverter().exists(resourceURI, null)) {
				result = context.getResource(resourceURI, true);
			} else {
				result = context.createResource(resourceURI, UMLPackage.eCONTENT_TYPE);
			}
		}

		// Ensure that proxies are resolved so that, e.g., refactoring of sub-units can be reflected in this resource's cross-references
		EcoreUtil.resolveAll(result);

		return result;
	}

	protected void unloadDecoratorModel(String resourceKey) {
		Resource resource = getTestContextResourceSet().getResource(createDecoratorModelURI(resourceKey), false);
		assertThat(resource, notNullValue());
		assertThat(resource.isLoaded(), is(true));

		resource.unload();
		resource.getResourceSet().getResources().remove(resource);
		resource.eAdapters().clear();
	}

	protected URI externalize(Package applyingPackage, Profile appliedProfile, String resourceKey) {
		final URI result = createDecoratorModelURI(resourceKey);

		ProfileApplication application = applyingPackage.getProfileApplication(appliedProfile);
		assertThat(application, notNullValue());
		Command command = DecoratorModelUtils.createSeparateProfileApplicationsCommand(Collections.singleton(application), result, testName.getMethodName());
		assertThat(command.canExecute(), is(true));

		try {
			execute(command);
		} catch (Exception e) {
			e.printStackTrace();
			fail("Failed to externalize profile application: " + e.getLocalizedMessage());
		}

		return result;
	}

	protected void internalize(Package applyingPackage, Profile appliedProfile) {
		ProfileApplication application = applyingPackage.getProfileApplication(appliedProfile, true);
		assertThat(application, notNullValue());
		Command command = DecoratorModelUtils.createReclaimProfileApplicationsCommand(Collections.singleton(application));
		assertThat(command.canExecute(), is(true));

		try {
			execute(command);
		} catch (Exception e) {
			e.printStackTrace();
			fail("Failed to internalize profile application: " + e.getLocalizedMessage());
		}
	}

	protected Resource control(final Package package_) {
		final ResourceSet rset = EMFHelper.getResourceSet(package_);

		return execute(new Callable<Resource>() {

			@Override
			public Resource call() throws Exception {
				URI uri = package_.eResource().getURI();
				uri = uri.trimSegments(1).appendSegment(package_.getName()).appendFileExtension(UmlModel.UML_FILE_EXTENSION);
				Resource result = rset.createResource(uri);
				result.getContents().add(package_);
				return result;
			}
		});
	}

	protected void execute(final Runnable write) {
		Command command;

		if (getTestContext() instanceof TransactionalEditingDomain) {
			command = new RecordingCommand((TransactionalEditingDomain) getTestContext()) {

				@Override
				protected void doExecute() {
					write.run();
				}
			};
		} else {
			command = new ChangeCommand(getTestContextResourceSet()) {
				@Override
				protected void doExecute() {
					write.run();
				}
			};
		}

		execute(command);
	}

	protected <V> V execute(final Callable<V> write) {
		final List<V> result = Lists.newArrayListWithCapacity(1);
		Command command;

		if (getTestContext() instanceof TransactionalEditingDomain) {
			command = new RecordingCommand((TransactionalEditingDomain) getTestContext()) {

				@Override
				protected void doExecute() {
					try {
						result.add(write.call());
					} catch (Exception e) {
						e.printStackTrace();
						fail("Exception in write operation: " + e.getLocalizedMessage());
					}
				}
			};
		} else {
			command = new ChangeCommand(getTestContextResourceSet()) {
				@Override
				protected void doExecute() {
					try {
						result.add(write.call());
					} catch (Exception e) {
						e.printStackTrace();
						fail("Exception in write operation: " + e.getLocalizedMessage());
					}
				}
			};
		}

		execute(command);

		return result.get(0);
	}

	protected void execute(Command command) {
		getTestContext().getCommandStack().execute(command);
	}

	protected void undo() {
		getTestContext().getCommandStack().undo();
	}

	protected void redo() {
		getTestContext().getCommandStack().redo();
	}

	protected void save() {
		ResourceSet context = getTestContextResourceSet();

		try {
			if (context instanceof ModelSet) {
				((ModelSet) context).save(new NullProgressMonitor());
			} else {
				Map<String, Object> options = Maps.newHashMap();
				options.put(XMLResource.OPTION_SAVE_ONLY_IF_CHANGED, XMLResource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);

				for (Resource next : context.getResources()) {
					if (next.getURI().isPlatformResource()) {
						next.save(options);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail("Failed to save test model: " + e.getLocalizedMessage());
		}
	}

	private EditingDomain getTestContext() {
		return (testContext != null) ? testContext : modelSet.getEditingDomain();
	}

	private ResourceSet getTestContextResourceSet() {
		return (testContext != null) ? testContext.getResourceSet() : modelSet.getResourceSet();
	}

	protected final void setTestContext(EditingDomain context) {
		this.testContext = context;
	}

	protected Profile getProfileExternalizationProfile() {
		return (Profile) getTestContextResourceSet().getEObject(DecoratorModelUtils.PROFILE_URI, true);
	}

	protected Profile getTestProfile() {
		URI uri = modelSet.getModelResourceURI().trimSegments(1).appendSegment("profile").appendSegment("profile1.profile.uml");
		return (Profile) UML2Util.load(getTestContextResourceSet(), uri, UMLPackage.Literals.PROFILE);
	}

	protected Package getModel() {
		return (Package) getTestContextResourceSet().getEObject(modelSet.getModelURI(), true);
	}

	protected Package getPackage1() {
		return getModel().getNestedPackage("package1");
	}

	protected Class getEntity1() {
		return (Class) getPackage1().getOwnedType("Entity1");
	}

	protected Operation getEntity1Find() {
		return getEntity1().getOwnedOperation("find", null, null);
	}

	protected Dependency getEntity1Import() {
		return getEntity1().getClientDependencies().get(0);
	}

	protected Class getBusinessRules() {
		return (Class) getPackage1().getOwnedType("BusinessRules");
	}

	protected Package getPackage2() {
		return getModel().getNestedPackage("package2");
	}

	protected Class getBean2() {
		return (Class) getPackage2().getOwnedType("Bean2");
	}

	protected Dependency getBean2Import() {
		return getBean2().getClientDependencies().get(0);
	}

	protected Class getMessageProcessor() {
		return (Class) getPackage2().getOwnedType("MessageProcessor");
	}

	protected Stereotype getBeanStereotype() {
		return getTestProfile().getOwnedStereotype("Bean");
	}

	protected Stereotype getImportStereotype() {
		return getTestProfile().getNestedPackage("relationships").getOwnedStereotype("Import");
	}

	protected Stereotype getFinderStereotype() {
		return getTestProfile().getOwnedStereotype("Finder");
	}

	protected Enumeration getBeanKindEnumeration() {
		return (Enumeration) getTestProfile().getOwnedType("BeanKind");
	}

	protected EnumerationLiteral getEntityLiteral() {
		return getBeanKindEnumeration().getOwnedLiteral("entity");
	}

	protected EnumerationLiteral getSessionLiteral() {
		return getBeanKindEnumeration().getOwnedLiteral("session");
	}

	protected EnumerationLiteral getMessageDrivenLiteral() {
		return getBeanKindEnumeration().getOwnedLiteral("messagedriven");
	}

	protected Stereotype getApplyProfilesStereotype() {
		return getProfileExternalizationProfile().getOwnedStereotype("ApplyProfiles");
	}

	protected boolean isDefinedIn(Stereotype stereotype, Profile profile) {
		return EcoreUtil.isAncestor(profile, stereotype);
	}

	protected <V> V get(Future<V> future, boolean first) {
		try {
			// Time out faster on subsequent accesses because the index shouldn't have churned in the mean-time
			return future.get(1L, first ? TimeUnit.MINUTES : TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
			fail("Failed to get future result: " + e.getLocalizedMessage());
			return null; // Unreachable
		}
	}

	protected void assertNotApplied(Package package_, Profile profile) {
		assertThat(package_.getProfileApplication(profile, true), nullValue());

		for (Iterator<Element> iter = Iterators.filter(UML2Util.getAllContents(package_, true, false), Element.class); iter.hasNext();) {
			for (EObject application : iter.next().getStereotypeApplications()) {
				Stereotype stereotype = UMLUtil.getStereotype(application);
				assertThat(stereotype, notNullValue());
				assertThat(isDefinedIn(stereotype, profile), is(false));
			}
		}
	}

	protected void assertInternalApplication(Package applyingPackage, Profile appliedProfile, int stereotypeCount) {
		Resource resource = applyingPackage.eResource();
		assertThat(resource, notNullValue());

		assertApplication(applyingPackage, appliedProfile, stereotypeCount, resource);
	}

	private void assertApplication(Package applyingPackage, Profile appliedProfile, int stereotypeCount, Resource expectedResource) {
		ProfileApplication profileApplication = applyingPackage.getProfileApplication(appliedProfile, true);
		assertThat("Profile not applied", profileApplication, notNullValue());

		assertThat(profileApplication.eResource(), is(expectedResource));

		int stereotypesFound = 0;
		for (Iterator<Element> iter = Iterators.filter(UML2Util.getAllContents(applyingPackage, true, false), Element.class); iter.hasNext();) {
			for (EObject application : iter.next().getStereotypeApplications()) {
				Stereotype stereotype = UMLUtil.getStereotype(application);
				assertThat(stereotype, notNullValue());
				if (isDefinedIn(stereotype, appliedProfile)) {
					assertThat(application.eResource(), is(expectedResource));
					stereotypesFound++;
				}
			}
		}

		assertThat("Wrong number of stereotypes found", stereotypesFound, is(stereotypeCount));
	}

	protected void assertExternalApplication(Package applyingPackage, Profile appliedProfile, String resourceKey, int stereotypeCount) {
		URI uri = createDecoratorModelURI(applyingPackage.eResource().getURI(), resourceKey);
		Resource resource = getTestContextResourceSet().getResource(uri, false);
		assertThat(resource, notNullValue());
		assertThat(resource.isLoaded(), is(true));

		assertApplication(applyingPackage, appliedProfile, stereotypeCount, resource);
	}

	protected <E> Set<E> set(E... elements) {
		return ImmutableSet.copyOf(elements);
	}

	protected Matcher<Element> isApplied(final Stereotype stereotype) {
		return new BaseMatcher<Element>() {
			@Override
			public boolean matches(Object item) {
				return ((Element) item).isStereotypeApplied(stereotype);
			}

			@Override
			public void describeTo(Description description) {
				description.appendText(String.format("has stereotype <<%s>> applied", stereotype.getName()));
			}
		};
	}

	protected Matcher<Element> isApplicable(final Stereotype stereotype) {
		return new BaseMatcher<Element>() {
			@Override
			public boolean matches(Object item) {
				return ((Element) item).isStereotypeApplicable(stereotype);
			}

			@Override
			public void describeTo(Description description) {
				description.appendText(String.format("can apply stereotype <<%s>>", stereotype.getName()));
			}
		};
	}

	protected Matcher<URI> exists() {
		return new BaseMatcher<URI>() {
			@Override
			public boolean matches(Object item) {
				return getTestContextResourceSet().getURIConverter().exists((URI) item, null);
			}

			@Override
			public void describeTo(Description description) {
				description.appendText("exists");
			}
		};
	}
}
