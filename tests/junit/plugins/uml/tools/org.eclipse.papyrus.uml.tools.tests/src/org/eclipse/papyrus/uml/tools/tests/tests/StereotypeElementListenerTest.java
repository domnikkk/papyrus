/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	Gabriel Pascual (ALL4TEC) gabriel.pascual@all4tec.net - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.uml.tools.tests.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;
import org.eclipse.papyrus.junit.utils.rules.ModelSetFixture;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.uml.tools.commands.ApplyStereotypeCommand;
import org.eclipse.papyrus.uml.tools.commands.UnapplyProfileCommand;
import org.eclipse.papyrus.uml.tools.commands.UnapplyStereotypeCommand;
import org.eclipse.papyrus.uml.tools.listeners.StereotypeElementListener;
import org.eclipse.papyrus.uml.tools.listeners.StereotypeElementListener.StereotypeExtensionNotification;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;



/**
 * 
 * Test class for stereotype actions listener of UML element.
 * 
 * @author Gabriel Pascual
 *
 */
public class StereotypeElementListenerTest extends AbstractPapyrusTest {

	/** Model set rule to have an editing domain. */
	@Rule
	public final ModelSetFixture modelSetFixture = new ModelSetFixture();

	/** Assert for stereotype application notification. */
	private AssertNotificationAdapter assertAppliedStereotypeNotification = null;

	/** Assert for stereotype unapplication notification. */
	private AssertNotificationAdapter assertUnappliedStereotypeNotification = null;

	/** UML element listen by class under test. */
	private Element element = null;

	/** Profile used to provide of stereotypes. */
	private Profile profile = null;

	/** SysML profile used to provide static stereotypes. */
	private Profile sysmlProfile = null;

	/** The under test. */
	private StereotypeElementListener underTest = null;

	/**
	 * Sets the up.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Before
	public void setUp() throws Exception {
		assertAppliedStereotypeNotification = new AssertNotificationAdapter(StereotypeExtensionNotification.STEREOTYPE_APPLIED_TO_ELEMENT);
		assertUnappliedStereotypeNotification = new AssertNotificationAdapter(StereotypeExtensionNotification.STEREOTYPE_UNAPPLIED_FROM_ELEMENT);
		underTest = new StereotypeElementListener(modelSetFixture.getEditingDomain());
		modelSetFixture.getEditingDomain().addResourceSetListener(underTest);
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@After
	public void tearDown() throws Exception {
		assertAppliedStereotypeNotification = null;
		assertUnappliedStereotypeNotification = null;
		// underTest = null;
	}

	/**
	 * Test add stereotype.
	 */
	@Test
	@PluginResource("/resources/stereotypeListenerTest/profileApplicationTest.di")
	public void testAddStereotype() {

		initialiseTestCase();

		element.eAdapters().add(assertAppliedStereotypeNotification);

		TransactionalEditingDomain editingDomain = modelSetFixture.getEditingDomain();
		Stereotype stereotype = profile.getOwnedStereotype("First");
		editingDomain.getCommandStack().execute(new ApplyStereotypeCommand(element, stereotype, editingDomain));
		assertAppliedStereotypeNotification.assertNotification(element);
		assertAppliedStereotypeNotification.assertNotification(element, stereotype);
	}

	/**
	 * Test remove stereotype.
	 */
	@Test
	@PluginResource("/resources/stereotypeListenerTest/profileApplicationTest.di")
	public void testRemoveStereotype() {

		initialiseTestCase();

		element.eAdapters().add(assertUnappliedStereotypeNotification);

		Stereotype member = (Stereotype) profile.getMember("First");
		TransactionalEditingDomain editingDomain = modelSetFixture.getEditingDomain();
		editingDomain.getCommandStack().execute(new ApplyStereotypeCommand(element, (Stereotype) profile.getMember("First"), editingDomain));
		editingDomain.getCommandStack().execute(new UnapplyStereotypeCommand(element, member, editingDomain));
		assertUnappliedStereotypeNotification.assertNotification(element);
		assertUnappliedStereotypeNotification.assertNotification(element, member);
	}

	/**
	 * Test undo action on stereotype application.
	 */
	@Test
	@PluginResource("/resources/stereotypeListenerTest/profileApplicationTest.di")
	public void testUndoAddStereotype() {

		initialiseTestCase();

		TransactionalEditingDomain editingDomain = modelSetFixture.getEditingDomain();
		element.eAdapters().add(assertAppliedStereotypeNotification);
		element.eAdapters().add(assertUnappliedStereotypeNotification);

		Stereotype member = profile.getOwnedStereotype("First");
		editingDomain.getCommandStack().execute(new ApplyStereotypeCommand(element, member, editingDomain));
		assertAppliedStereotypeNotification.assertNotification(element);

		editingDomain.getCommandStack().undo();
		assertUnappliedStereotypeNotification.assertNotification(element);
	}

	/**
	 * Test undo action on stereotype unapplication.
	 */
	@Test
	@PluginResource("/resources/stereotypeListenerTest/profileApplicationTest.di")
	public void testUndoRemoveStereotype() {

		initialiseTestCase();

		TransactionalEditingDomain editingDomain = modelSetFixture.getEditingDomain();
		element.eAdapters().add(assertAppliedStereotypeNotification);
		element.eAdapters().add(assertUnappliedStereotypeNotification);

		Stereotype member = profile.getOwnedStereotype("First");

		editingDomain.getCommandStack().execute(new ApplyStereotypeCommand(element, member, editingDomain));
		assertAppliedStereotypeNotification.assertNotification(element);

		editingDomain.getCommandStack().execute(new UnapplyStereotypeCommand(element, member, editingDomain));
		assertUnappliedStereotypeNotification.assertNotification(element);


		editingDomain.getCommandStack().undo();
		assertAppliedStereotypeNotification.assertNotification(2, element);
	}

	/**
	 * Test of unapplication Profile.
	 */
	@Test
	@PluginResource("/resources/stereotypeListenerTest/profileApplicationTest.di")
	public void testUnapplyProfile() {

		initialiseTestCase();

		Assert.assertFalse(modelSetFixture.getModel().getProfileApplications().isEmpty());
		TransactionalEditingDomain editingDomain = modelSetFixture.getEditingDomain();
		element.eAdapters().add(assertUnappliedStereotypeNotification);
		element.eAdapters().add(assertAppliedStereotypeNotification);

		Stereotype member = profile.getOwnedStereotype("First");

		editingDomain.getCommandStack().execute(new ApplyStereotypeCommand(element, member, editingDomain));
		assertAppliedStereotypeNotification.assertNotification(element);
		assertAppliedStereotypeNotification.assertNotification(element, member);

		editingDomain.getCommandStack().execute(new UnapplyProfileCommand(modelSetFixture.getModel(), profile, editingDomain));
		assertUnappliedStereotypeNotification.assertNotification(element);
		assertUnappliedStereotypeNotification.assertNotification(element, member);


	}

	/**
	 * Test of unapplication Profile.
	 */
	@Test
	@PluginResource("/resources/stereotypeListenerTest/profileApplicationTest.di")
	public void testUndoUnapplyProfile() {

		initialiseTestCase();

		TransactionalEditingDomain editingDomain = modelSetFixture.getEditingDomain();
		element.eAdapters().add(assertUnappliedStereotypeNotification);
		element.eAdapters().add(assertAppliedStereotypeNotification);

		Stereotype member = profile.getOwnedStereotype("First");

		editingDomain.getCommandStack().execute(new ApplyStereotypeCommand(element, member, editingDomain));
		assertAppliedStereotypeNotification.assertNotification(element);

		editingDomain.getCommandStack().execute(new UnapplyProfileCommand(modelSetFixture.getModel(), profile, editingDomain));
		assertUnappliedStereotypeNotification.assertNotification(element);

		editingDomain.getCommandStack().undo();
		assertAppliedStereotypeNotification.assertNotification(2, element);


	}


	/**
	 * Test add several stereotypes.
	 */
	@Test
	@PluginResource("/resources/stereotypeListenerTest/profileApplicationTest.di")
	public void testAddStereotypeOnSeveralElements() {
		initialiseTestCase();

		final Element secondElement = modelSetFixture.getModel().getMember("SecondUnderTest");
		final Stereotype stereotype = (Stereotype) profile.getMember("First");
		element.eAdapters().add(assertAppliedStereotypeNotification);
		secondElement.eAdapters().add(assertAppliedStereotypeNotification);

		TransactionalEditingDomain editingDomain = modelSetFixture.getEditingDomain();


		RecordingCommand command = new RecordingCommand(editingDomain) {

			@Override
			protected void doExecute() {
				element.applyStereotype(stereotype);
				secondElement.applyStereotype(stereotype);

			}
		};

		editingDomain.getCommandStack().execute(command);

		assertAppliedStereotypeNotification.assertNotification(element);
		assertAppliedStereotypeNotification.assertNotification(secondElement);

	}


	/**
	 * Test undo of stereotype's addition on different element.
	 */
	@Test
	@PluginResource("/resources/stereotypeListenerTest/profileApplicationTest.di")
	public void testUndoAddStereotypeOnSeveralElements() {
		initialiseTestCase();

		final Element secondElement = modelSetFixture.getModel().getMember("SecondUnderTest");
		final Stereotype stereotype = (Stereotype) profile.getMember("First");
		element.eAdapters().add(assertAppliedStereotypeNotification);
		element.eAdapters().add(assertUnappliedStereotypeNotification);
		secondElement.eAdapters().add(assertAppliedStereotypeNotification);
		secondElement.eAdapters().add(assertUnappliedStereotypeNotification);

		TransactionalEditingDomain editingDomain = modelSetFixture.getEditingDomain();


		RecordingCommand command = new RecordingCommand(editingDomain) {

			@Override
			protected void doExecute() {
				element.applyStereotype(stereotype);
				secondElement.applyStereotype(stereotype);

			}
		};

		editingDomain.getCommandStack().execute(command);

		assertAppliedStereotypeNotification.assertNotification(element);
		assertAppliedStereotypeNotification.assertNotification(secondElement);

		editingDomain.getCommandStack().undo();
		assertUnappliedStereotypeNotification.assertNotification(element);
		assertUnappliedStereotypeNotification.assertNotification(secondElement);

	}

	/**
	 * Test add several stereotypes on one element.
	 */
	@Test
	@PluginResource("/resources/stereotypeListenerTest/profileApplicationTest.di")
	public void testAddStereotypes() {
		initialiseTestCase();

		element.eAdapters().add(assertAppliedStereotypeNotification);

		TransactionalEditingDomain editingDomain = modelSetFixture.getEditingDomain();
		Stereotype first = profile.getOwnedStereotype("First");
		Stereotype second = profile.getOwnedStereotype("Second");
		editingDomain.getCommandStack().execute(new ApplyStereotypeCommand(element, Arrays.asList(first, second), editingDomain));

		assertAppliedStereotypeNotification.assertNotification(2, element);
		assertAppliedStereotypeNotification.assertNotification(element, first, second);

	}


	/**
	 * Test undo of several stereotype's application.
	 */
	@Test
	@PluginResource("/resources/stereotypeListenerTest/profileApplicationTest.di")
	public void testUndoAddStereotypes() {
		initialiseTestCase();

		element.eAdapters().add(assertAppliedStereotypeNotification);
		element.eAdapters().add(assertUnappliedStereotypeNotification);

		TransactionalEditingDomain editingDomain = modelSetFixture.getEditingDomain();
		editingDomain.getCommandStack().execute(new ApplyStereotypeCommand(element, Arrays.asList((Stereotype) profile.getMember("First"), (Stereotype) profile.getMember("Second")), editingDomain));

		assertAppliedStereotypeNotification.assertNotification(2, element);

		editingDomain.getCommandStack().undo();
		assertUnappliedStereotypeNotification.assertNotification(2, element);


	}


	/**
	 * Test that changes to non-extension-end properties named <tt>base_Xyz</tt> are not
	 * interpreted as stereotype (un)applications.
	 */
	@Test
	@PluginResource("/resources/stereotypeListenerTest/profileApplicationTest.di")
	public void testFakeBasedProperty() {
		initialiseTestCase();

		TransactionalEditingDomain editingDomain = modelSetFixture.getEditingDomain();
		final Stereotype testSuite = profile.getOwnedStereotype("TestSuite");
		editingDomain.getCommandStack().execute(new ApplyStereotypeCommand(element, testSuite, editingDomain));

		element.eAdapters().add(assertAppliedStereotypeNotification);
		element.eAdapters().add(assertUnappliedStereotypeNotification);

		// Change a property whose name starts with 'base_' that isn't a metaclass extension
		editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {

			@Override
			protected void doExecute() {
				element.setValue(testSuite, "base_timeout", "600");
			}
		});

		assertAppliedStereotypeNotification.assertNoNotification(element);
		assertUnappliedStereotypeNotification.assertNoNotification(element);
	}


	/**
	 * Test add stereotype with static profile.
	 */
	@Test
	@PluginResource("/resources/stereotypeListenerTest/profileApplicationTest.di")
	public void testAddSysMLStereotype() {

		initialiseTestCase();

		element.eAdapters().add(assertAppliedStereotypeNotification);

		TransactionalEditingDomain editingDomain = modelSetFixture.getEditingDomain();
		Stereotype stereotype = sysmlProfile.getOwnedStereotype("Allocated");
		editingDomain.getCommandStack().execute(new ApplyStereotypeCommand(element, stereotype, editingDomain));
		assertAppliedStereotypeNotification.assertNotification(element);
		assertAppliedStereotypeNotification.assertNotification(element, stereotype);
	}

	/**
	 * Test remove stereotype with static profile.
	 */
	@Test
	@PluginResource("/resources/stereotypeListenerTest/profileApplicationTest.di")
	public void testRemoveSysMLStereotype() {

		initialiseTestCase();

		element.eAdapters().add(assertUnappliedStereotypeNotification);

		Stereotype stereotype = (Stereotype) sysmlProfile.getMember("Allocated");
		TransactionalEditingDomain editingDomain = modelSetFixture.getEditingDomain();
		editingDomain.getCommandStack().execute(new ApplyStereotypeCommand(element, stereotype, editingDomain));
		editingDomain.getCommandStack().execute(new UnapplyStereotypeCommand(element, stereotype, editingDomain));
		assertUnappliedStereotypeNotification.assertNotification(element);
		assertUnappliedStereotypeNotification.assertNotification(element, stereotype);
	}

	/**
	 * Test undo action on stereotype application with static Profile.
	 */
	@Test
	@PluginResource("/resources/stereotypeListenerTest/profileApplicationTest.di")
	public void testUndoAddSysMLStereotype() {

		initialiseTestCase();

		TransactionalEditingDomain editingDomain = modelSetFixture.getEditingDomain();
		element.eAdapters().add(assertAppliedStereotypeNotification);
		element.eAdapters().add(assertUnappliedStereotypeNotification);

		Stereotype member = sysmlProfile.getOwnedStereotype("Allocated");
		editingDomain.getCommandStack().execute(new ApplyStereotypeCommand(element, member, editingDomain));
		assertAppliedStereotypeNotification.assertNotification(element);

		editingDomain.getCommandStack().undo();
		assertUnappliedStereotypeNotification.assertNotification(element);
	}

	/**
	 * Test undo action on stereotype unapplication with static Profile.
	 */
	@Test
	@PluginResource("/resources/stereotypeListenerTest/profileApplicationTest.di")
	public void testUndoRemoveSysMLStereotype() {

		initialiseTestCase();

		TransactionalEditingDomain editingDomain = modelSetFixture.getEditingDomain();
		element.eAdapters().add(assertAppliedStereotypeNotification);
		element.eAdapters().add(assertUnappliedStereotypeNotification);

		Stereotype member = sysmlProfile.getOwnedStereotype("Allocated");

		editingDomain.getCommandStack().execute(new ApplyStereotypeCommand(element, member, editingDomain));
		assertAppliedStereotypeNotification.assertNotification(element);

		editingDomain.getCommandStack().execute(new UnapplyStereotypeCommand(element, member, editingDomain));
		assertUnappliedStereotypeNotification.assertNotification(element);


		editingDomain.getCommandStack().undo();
		assertAppliedStereotypeNotification.assertNotification(2, element);
	}

	/**
	 * Load and apply profile to model resource.
	 */
	private void initialiseTestCase() {

		// Verify if profile is correctly imported
		Assert.assertFalse(modelSetFixture.getModel().getProfileApplications().isEmpty());

		// Initialise data for test case
		element = modelSetFixture.getModel().getMember("FirstUnderTest");
		profile = modelSetFixture.getModel().getAppliedProfile("Profile");
		sysmlProfile = modelSetFixture.getModel().getAppliedProfile("SysML::Allocations");

	}

	/**
	 * Notification assertion adapter.
	 * Verify if event type was notified.
	 * 
	 * @author Gabriel Pascual
	 *
	 */
	public class AssertNotificationAdapter extends AdapterImpl {

		/** Event type. */
		private int eventType = -1;

		/** Map of event type and associated notifcation numbers of a notifier. */
		private Map<Object, Map<Integer, Integer>> notifiedEventList = new HashMap<Object, Map<Integer, Integer>>();

		/** Map of event type and associated stereotypes of a notifier. */
		private Map<Object, Map<Integer, List<Stereotype>>> notifiedStereotypeList = new HashMap<Object, Map<Integer, List<Stereotype>>>();


		/**
		 * Constructor.
		 *
		 * @param eventType
		 *            the event type
		 */
		public AssertNotificationAdapter(int eventType) {
			this.eventType = eventType;
		}

		/**
		 * Notify changed.
		 *
		 * @param msg
		 *            the msg
		 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#notifyChanged(org.eclipse.emf.common.notify.Notification)
		 */
		@Override
		public void notifyChanged(Notification msg) {
			int notificationEventType = msg.getEventType();

			// Ignore notifications that we are not interested in
			if (!(msg instanceof StereotypeExtensionNotification) || (notificationEventType != eventType)) {
				return;
			}

			Object eventNotifier = msg.getNotifier();

			// Check if notifier is known
			Map<Integer, Integer> notifierEventMap = notifiedEventList.get(eventNotifier);
			if (notifierEventMap == null) {
				notifierEventMap = new HashMap<Integer, Integer>();
			}
			Map<Integer, List<Stereotype>> notifierStereotypeMap = notifiedStereotypeList.get(eventNotifier);
			if (notifierStereotypeMap == null) {
				notifierStereotypeMap = new HashMap<Integer, List<Stereotype>>();
			}

			// Check if event is known
			Integer eventCount = notifierEventMap.get(notificationEventType);
			if (eventCount == null) {
				eventCount = 1;
			} else {
				eventCount = eventCount.intValue() + 1;
			}
			List<Stereotype> stereotypes = notifierStereotypeMap.get(notificationEventType);
			if (stereotypes == null) {
				stereotypes = new ArrayList<Stereotype>(3);
			}

			// Record the stereotype applied/unapplied
			switch (notificationEventType) {
			case StereotypeExtensionNotification.STEREOTYPE_APPLIED_TO_ELEMENT:
				stereotypes.add((Stereotype) msg.getNewValue());
				break;
			case StereotypeExtensionNotification.STEREOTYPE_UNAPPLIED_FROM_ELEMENT:
				stereotypes.add((Stereotype) msg.getOldValue());
				break;
			}

			// Save notification
			notifierEventMap.put(notificationEventType, eventCount);
			notifiedEventList.put(eventNotifier, notifierEventMap);
			notifierStereotypeMap.put(notificationEventType, stereotypes);
			notifiedStereotypeList.put(eventNotifier, notifierStereotypeMap);
		}

		/**
		 * Assert no notification.
		 *
		 * @param notifier
		 *            the notifier
		 */
		public void assertNoNotification(Object notifier) {
			Map<Integer, Integer> eventTypeTimesNumberMap = notifiedEventList.get(notifier);
			Assert.assertNull(eventTypeTimesNumberMap);
		}

		/**
		 * Assert one notification for this event type.
		 *
		 * @param notifier
		 *            the notifier
		 */
		public void assertNotification(Object notifier) {
			assertNotification(1, notifier);
		}

		/**
		 * Assert several notification for this event type.
		 *
		 * @param timesNumber
		 *            Amount of notification to verify
		 * @param notifier
		 *            the notifier
		 */
		public void assertNotification(int timesNumber, Object notifier) {

			Map<Integer, Integer> eventTypeTimesNumberMap = notifiedEventList.get(notifier);
			Assert.assertNotNull(eventTypeTimesNumberMap);
			Assert.assertFalse(eventTypeTimesNumberMap.isEmpty());

			Integer eventTimesNumber = eventTypeTimesNumberMap.get(eventType);
			Assert.assertTrue(eventTimesNumber != null);
			Assert.assertEquals("Number of times that event was notified", Integer.valueOf(timesNumber), eventTimesNumber);

		}

		/**
		 * Assert the particular stereotype (un)applied.
		 * 
		 * @param notifier
		 *            the notifier on which to assert
		 * @param stereotype
		 *            the stereotype to assert
		 */
		public void assertNotification(Object notifier, Stereotype stereotype) {

			Map<Integer, List<Stereotype>> stereotypeMap = notifiedStereotypeList.get(notifier);
			Assert.assertNotNull(stereotypeMap);
			Assert.assertFalse(stereotypeMap.isEmpty());

			List<Stereotype> stereotypes = stereotypeMap.get(eventType);
			Assert.assertNotNull(stereotypes);
			Assert.assertFalse(stereotypes.isEmpty());
			Assert.assertTrue(String.format("Stereotype was not %sapplied", (eventType == StereotypeExtensionNotification.STEREOTYPE_UNAPPLIED_FROM_ELEMENT) ? "un" : ""), stereotypes.contains(stereotype));

		}

		/**
		 * Assert the particular stereotypes (un)applied, in order.
		 * 
		 * @param notifier
		 *            the notifier on which to assert
		 * @param first
		 *            the first stereotype to assert
		 * @param second
		 *            the second stereotype to assert
		 * @param rest
		 *            additional stereotypes to assert, in order, if any
		 */
		public void assertNotification(Object notifier, Stereotype first, Stereotype second, Stereotype... rest) {

			Map<Integer, List<Stereotype>> stereotypeMap = notifiedStereotypeList.get(notifier);
			Assert.assertNotNull(stereotypeMap);
			Assert.assertFalse(stereotypeMap.isEmpty());

			List<Stereotype> stereotypes = stereotypeMap.get(eventType);
			Assert.assertNotNull(stereotypes);
			Assert.assertFalse(stereotypes.isEmpty());

			List<Stereotype> expected = new ArrayList<Stereotype>(2 + rest.length);
			expected.add(first);
			expected.add(second);
			expected.addAll(Arrays.asList(rest));
			Assert.assertEquals(String.format("Stereotypes were not %sapplied", (eventType == StereotypeExtensionNotification.STEREOTYPE_UNAPPLIED_FROM_ELEMENT) ? "un" : ""), expected, stereotypes);

		}
	}

}
