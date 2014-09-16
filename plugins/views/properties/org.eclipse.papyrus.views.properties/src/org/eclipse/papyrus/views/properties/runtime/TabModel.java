/*
 * Copyright (c) 2014 CEA and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus (CEA) - Initial API and implementation
 *
 */
package org.eclipse.papyrus.views.properties.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.papyrus.views.properties.contexts.Section;


/**
 * An encapsulation of the hierarchical tab structure of the property sheets managed by a {@link DisplayEngine}.
 * It supports distinction of repeated {@code Section}s via proxies that combine section instances with
 * arbitrary {@linkplain SectionDiscriminator discriminators}.
 */
class TabModel<V> {

	private final Map<Path, V> model = new HashMap<Path, V>();

	TabModel() {
		super();
	}

	public Set<String> tabIDs() {
		Set<String> result = new HashSet<String>();

		for (Path next : model.keySet()) {
			result.add(next.tabID);
		}

		return Collections.unmodifiableSet(result);
	}

	public V get(Section section) {
		return model.get(new Path(section));
	}

	public V get(String tabID, String sectionID) {
		return model.get(new Path(tabID, sectionID));
	}

	public Collection<V> get(String tabID) {
		List<V> result = new ArrayList<V>(4);

		Path key = new Path(tabID);
		for (Map.Entry<Path, V> next : model.entrySet()) {
			if (next.getKey().equals(key)) {
				result.add(next.getValue());
			}
		}

		return Collections.unmodifiableList(result);
	}

	public V put(Section section, V value) {
		return model.put(new Path(section), value);
	}

	public V put(String tabID, String sectionID, V value) {
		return model.put(new Path(tabID, sectionID), value);
	}

	public V remove(Section section) {
		return model.remove(new Path(section));
	}

	public V remove(String tabID, String sectionID) {
		return model.remove(new Path(tabID, sectionID));
	}

	public Collection<V> remove(String tabID) {
		List<V> result = new ArrayList<V>(4);

		Path key = new Path(tabID);
		for (V next = model.remove(key); next != null; next = model.remove(key)) {
			result.add(next);
		}

		return Collections.unmodifiableList(result);
	}

	public Collection<V> clear() {
		List<V> result = new ArrayList<V>(model.values());

		model.clear();

		return Collections.unmodifiableList(result);
	}

	@Override
	public String toString() {
		return String.format("TabModel%s", model.toString()); //$NON-NLS-1$
	}

	//
	// Nested types
	//

	final static class Path {

		// Do not intern this string! Deliberately constructing a new String instance
		private static final String WILDCARD = new String("*"); //$NON-NLS-1$

		final String tabID;

		final String sectionID;

		final Object discriminator;

		Path(String tabID, String sectionID, Object discriminator) {
			checkWildcard(tabID);
			checkWildcard(sectionID);

			this.tabID = tabID;
			this.sectionID = sectionID;
			this.discriminator = (discriminator == null) ? WILDCARD : discriminator;
		}

		Path(String tabID, String sectionID) {
			this(tabID, sectionID, WILDCARD);
		}

		/**
		 * Create a wildcard path for all sections in a tab.
		 */
		Path(String tabID) {
			checkWildcard(tabID);

			this.tabID = tabID;
			this.sectionID = WILDCARD;
			this.discriminator = WILDCARD;
		}

		/**
		 * Create a path for a specific section.
		 */
		Path(Section section) {
			this(section.getTab().getId(), section.getName(), SectionDiscriminator.getDiscriminator(section));
		}

		static void checkWildcard(String id) {
			// Deliberately testing for identity of non-interned string
			if ((id == null) || (id == WILDCARD)) {
				throw new IllegalArgumentException("Attempt to create a wildcard path explicitly"); //$NON-NLS-1$
			}
		}

		@Override
		public String toString() {
			return String.format("(%s, %s)", tabID, sectionID); //$NON-NLS-1$
		}

		@Override
		public int hashCode() {
			// This isn't great for hash-map performance, but wildcards have to have the same hash as the keys they
			// match, otherwise using them to access the map won't work
			return tabID.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (!(obj instanceof Path)) {
				return false;
			}

			Path other = (Path) obj;
			return equals(tabID, other.tabID) && equals(sectionID, other.sectionID) && equals(discriminator, other.discriminator);
		}

		private static boolean equals(Object anID, Object anotherID) {
			// Deliberately testing for identity of non-interned string
			return (anID == WILDCARD) || (anotherID == WILDCARD) || anID.equals(anotherID);
		}

	}

}
