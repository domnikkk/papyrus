/*****************************************************************************
 * Copyright (c) 2013 CEA LIST.
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
package org.eclipse.papyrus.infra.nattable.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AbstractHeaderAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AxisManagerConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.AxisManagerRepresentation;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.IAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.IFillingConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.LocalTableHeaderAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.PasteEObjectConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TableHeaderAxisConfiguration;
import org.eclipse.papyrus.infra.nattable.model.nattable.nattableaxisconfiguration.TreeFillingConfiguration;

/**
 *
 * Util class used to get FillingConfigruation for the table
 *
 */
public class FillingConfigurationUtils {


	private FillingConfigurationUtils() {
		// to prevent instanciation
	}

	/**
	 * error message for developper
	 */
	private static final String INVERT_AXIS_CASE_NOT_YET_MANAGED_FOR_TREE_TABLE = "Invert axis not yet managed -> probably impossible with tree table"; //$NON-NLS-1$

	/**
	 *
	 * @param table
	 *            a table
	 * @param rep
	 *            an axis manager representation
	 * @param onColumn
	 *            a boolean indicating than we are on column
	 * @return
	 *         the list of {@link TreeFillingConfiguration} to use for the representedAxisManager
	 */
	public static final List<TreeFillingConfiguration> getTreeFillingConfiguration(final Table table, final AxisManagerRepresentation representedAxisManager) {
		Assert.isTrue(!table.isInvertAxis(), INVERT_AXIS_CASE_NOT_YET_MANAGED_FOR_TREE_TABLE);
		List<TreeFillingConfiguration> confs = new ArrayList<TreeFillingConfiguration>();
		LocalTableHeaderAxisConfiguration local = table.getLocalRowHeaderAxisConfiguration();
		if (local != null && local.getAxisManagerConfigurations().size() > 0) {
			for (AxisManagerConfiguration currentRep : local.getAxisManagerConfigurations()) {
				if (currentRep.getAxisManager() == representedAxisManager) {
					for (final IAxisConfiguration current : currentRep.getLocalSpecificConfigurations()) {
						if (current instanceof TreeFillingConfiguration) {
							confs.add((TreeFillingConfiguration) current);
						}
					}
					return confs;
				}
			}
		} else {
			for (final IAxisConfiguration current : representedAxisManager.getSpecificAxisConfigurations()) {
				if (current instanceof TreeFillingConfiguration) {
					confs.add((TreeFillingConfiguration) current);
				}
			}
		}
		return confs;
	}

	/**
	 *
	 * @param table
	 *            a table
	 * @param wantedDepth
	 *            the depth for which we want all TreeFillingConfiguration
	 * @return
	 *         the list of {@link TreeFillingConfiguration} to use for the representedAxisManager
	 */
	public static final List<TreeFillingConfiguration> getAllTreeFillingConfigurationForDepth(final Table table, final int wantedDepth) {
		Assert.isTrue(!table.isInvertAxis(), INVERT_AXIS_CASE_NOT_YET_MANAGED_FOR_TREE_TABLE);
		List<TreeFillingConfiguration> confs = new ArrayList<TreeFillingConfiguration>();
		LocalTableHeaderAxisConfiguration local = table.getLocalRowHeaderAxisConfiguration();
		if (local != null && local.getAxisManagerConfigurations().size() > 0) {
			for (AxisManagerConfiguration currentRep : local.getAxisManagerConfigurations()) {
				for (final IAxisConfiguration current : currentRep.getLocalSpecificConfigurations()) {
					if (current instanceof TreeFillingConfiguration) {
						if (((TreeFillingConfiguration) current).getDepth() == wantedDepth) {
							confs.add((TreeFillingConfiguration) current);
						}
					}
				}
				return confs;
			}

		}

		TableHeaderAxisConfiguration rowConfig = table.getTableConfiguration().getRowHeaderAxisConfiguration();
		List<AxisManagerRepresentation> axisManagers = rowConfig.getAxisManagers();
		for (AxisManagerRepresentation axisManagerRepresentation : axisManagers) {
			for (IAxisConfiguration current : axisManagerRepresentation.getSpecificAxisConfigurations()) {
				if (current instanceof TreeFillingConfiguration) {
					if (((TreeFillingConfiguration) current).getDepth() == wantedDepth) {
						confs.add((TreeFillingConfiguration) current);
					}
				}
			}
		}
		return confs;
	}

	/**
	 *
	 * @param table
	 *            a table
	 * @return
	 *         all {@link TreeFillingConfiguration} used in the table
	 */
	public static final List<TreeFillingConfiguration> getAllTreeFillingConfiguration(final Table table) {
		Assert.isTrue(!table.isInvertAxis(), INVERT_AXIS_CASE_NOT_YET_MANAGED_FOR_TREE_TABLE);
		List<TreeFillingConfiguration> confs = new ArrayList<TreeFillingConfiguration>();
		LocalTableHeaderAxisConfiguration local = table.getLocalRowHeaderAxisConfiguration();
		if (local != null) {
			for (AxisManagerConfiguration currentRep : local.getAxisManagerConfigurations()) {
				for (final IAxisConfiguration current : currentRep.getLocalSpecificConfigurations()) {
					if (current instanceof TreeFillingConfiguration) {
						confs.add((TreeFillingConfiguration) current);
					}
				}
			}
		} else {
			for (AxisManagerRepresentation axisManager : table.getTableConfiguration().getRowHeaderAxisConfiguration().getAxisManagers()) {
				for (IAxisConfiguration axisConf : axisManager.getSpecificAxisConfigurations()) {
					if (axisConf instanceof TreeFillingConfiguration) {
						confs.add((TreeFillingConfiguration) axisConf);
					}
				}
			}
		}
		return confs;
	}


	/**
	 *
	 * @param table
	 *            a table
	 * @param representedAxisManager
	 *            the represented axis manager for which we want TreeFillingConfiguration
	 * @param depth
	 *            the depth for which we want tree filling configuration
	 * @return
	 *         <code>true</code> is the representedAxisManager has TreeFillingConfiguration
	 *
	 */
	public static final boolean hasTreeFillingConfiguration(final Table table, final AxisManagerRepresentation representedAxisManager) {
		Assert.isTrue(!table.isInvertAxis(), INVERT_AXIS_CASE_NOT_YET_MANAGED_FOR_TREE_TABLE);
		LocalTableHeaderAxisConfiguration local = table.getLocalRowHeaderAxisConfiguration();
		if (local != null) {
			for (AxisManagerConfiguration currentRep : local.getAxisManagerConfigurations()) {
				if (currentRep.getAxisManager() == representedAxisManager) {
					for (final IAxisConfiguration current : currentRep.getLocalSpecificConfigurations()) {
						if (current instanceof TreeFillingConfiguration) {
							return true;
						}
					}
				}
			}
		} else {
			for (final IAxisConfiguration current : representedAxisManager.getSpecificAxisConfigurations()) {
				if (current instanceof TreeFillingConfiguration) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 *
	 * @param table
	 *            a table
	 * @param representedAxisManager
	 *            the represented axis manager for which we want TreeFillingConfiguration
	 * @param depth
	 *            the depth for which we want tree filling configuration
	 * @return
	 *         a list of @link TreeFillingConfiguration} for the wanted depth
	 *
	 */
	public static final List<TreeFillingConfiguration> getTreeFillingConfigurationForDepth(final Table table, final AxisManagerRepresentation representedAxisManager, final int depth) {
		// duplicate code getTreeFillingConfiguration to avoid to iterate twice on the same list
		List<TreeFillingConfiguration> confs = getTreeFillingConfiguration(table, representedAxisManager);
		Iterator<TreeFillingConfiguration> iter = confs.listIterator();
		while (iter.hasNext()) {
			if (iter.next().getDepth() != depth) {
				iter.remove();
			}
		}
		return confs;
	}

	/**
	 *
	 * @param table
	 *            a table
	 * @param representedAxisManager
	 *            the represented axis manager for which we want TreeFillingConfiguration
	 * @param depth
	 *            the depth for which we want tree filling configuration
	 * @return
	 *         <code>true</code> if we found {@link TreeFillingConfiguration} for the wanted depth
	 *
	 */
	public static final boolean hasTreeFillingConfigurationForDepth(final Table table, final AxisManagerRepresentation representedAxisManager, final int depth) {
		Iterator<TreeFillingConfiguration> iter = getTreeFillingConfigurationForDepth(table, representedAxisManager, depth).iterator();
		while (iter.hasNext()) {
			if (iter.next().getDepth() == depth) {
				return true;
			}
		}
		return false;
	}

	/**
	 *
	 * @param table
	 *            the table
	 * @param onColumn
	 *            <code>true</code> if the user is working on column and false if not
	 * @return
	 *         the list of the filling configuration used by the table
	 */
	// TODO : doesn't yet manage the local filling configuration
	public static final Collection<IFillingConfiguration> getFillingConfigurationUsedInTable(final Table table, final boolean onColumn) {
		final Collection<IFillingConfiguration> confs = new ArrayList<IFillingConfiguration>();


		AbstractHeaderAxisConfiguration tableHeaderAxisConfiguration;
		if (onColumn) {
			tableHeaderAxisConfiguration = HeaderAxisConfigurationManagementUtils.getColumnAbstractHeaderAxisInTableConfiguration(table);
		} else {
			tableHeaderAxisConfiguration = HeaderAxisConfigurationManagementUtils.getRowAbstractHeaderAxisInTableConfiguration(table);
		}

		for (final IAxisConfiguration currentConfiguration : tableHeaderAxisConfiguration.getOwnedAxisConfigurations()) {
			if (currentConfiguration instanceof IFillingConfiguration) {
				confs.add((IFillingConfiguration) currentConfiguration);
			}
		}

		return confs;
	}

	/**
	 *
	 * @param table
	 *            the table
	 * @param onColumn
	 *            true if we are working on column
	 * @return
	 *         the element type id to create or <code>null</code> if not found
	 */
	public static String getElementTypeIdToCreate(final Table table, final boolean onColumn) {
		final Collection<IFillingConfiguration> fillingConfiguration = FillingConfigurationUtils.getFillingConfigurationUsedInTable(table, onColumn);
		for (IFillingConfiguration iFillingConfiguration : fillingConfiguration) {
			if (iFillingConfiguration instanceof PasteEObjectConfiguration) {
				return ((PasteEObjectConfiguration) fillingConfiguration).getPastedElementId();
			}
		}
		return null;
	}

	/**
	 *
	 * @param table
	 *            the table
	 * @param onColumn
	 *            true if we are working on column
	 * @return
	 *         the containment feature to use for created element
	 */
	public static EStructuralFeature getContainmentFeature(final Table table, final boolean onColumn) {
		final Collection<IFillingConfiguration> fillingConfiguration = FillingConfigurationUtils.getFillingConfigurationUsedInTable(table, onColumn);
		for (IFillingConfiguration iFillingConfiguration : fillingConfiguration) {
			if (iFillingConfiguration instanceof PasteEObjectConfiguration) {
				return ((PasteEObjectConfiguration) fillingConfiguration).getPasteElementContainementFeature();
			}
		}
		return null;
	}

	/**
	 *
	 * @param table
	 *            a table
	 * @param depth
	 *            a wanted depth
	 * @return
	 *         <code>true</code> if the table has tree filling configuration declared on the wanted depth
	 */
	public static boolean hasTreeFillingConfigurationForDepth(final Table table, final int depth) {
		Assert.isTrue(!table.isInvertAxis(), INVERT_AXIS_CASE_NOT_YET_MANAGED_FOR_TREE_TABLE);
		LocalTableHeaderAxisConfiguration local = table.getLocalRowHeaderAxisConfiguration();
		if (local != null) {
			List<AxisManagerConfiguration> localReps = local.getAxisManagerConfigurations();
			if (!localReps.isEmpty()) {
				for (AxisManagerConfiguration currentRep : localReps) {
					for (final IAxisConfiguration current : currentRep.getLocalSpecificConfigurations()) {
						if (current instanceof TreeFillingConfiguration && ((TreeFillingConfiguration) current).getDepth() == depth) {
							return true;
						}
					}
				}
				return false;
			}
		}
		final List<AxisManagerRepresentation> representation = table.getTableConfiguration().getRowHeaderAxisConfiguration().getAxisManagers();
		for (final AxisManagerRepresentation currentRep : representation) {
			for (final IAxisConfiguration current : currentRep.getSpecificAxisConfigurations()) {
				if (current instanceof TreeFillingConfiguration && ((TreeFillingConfiguration) current).getDepth() == depth) {
					return true;
				}
			}

		}
		return false;
	}

	/**
	 *
	 * @param table
	 *            a table
	 * @return
	 *         the maximum depth displayed in the table. This method check than all hidden depth are consecutive and start to 0 (or 1)
	 */
	public static int getMaxDepthForTree(final Table table) {
		Assert.isTrue(!table.isInvertAxis(), INVERT_AXIS_CASE_NOT_YET_MANAGED_FOR_TREE_TABLE);
		TreeSet<Integer> hiddenLevels = new TreeSet<Integer>();
		LocalTableHeaderAxisConfiguration local = table.getLocalRowHeaderAxisConfiguration();
		if (local != null && !local.getAxisManagerConfigurations().isEmpty()) {
			for (AxisManagerConfiguration currentRep : local.getAxisManagerConfigurations()) {
				for (final IAxisConfiguration current : currentRep.getLocalSpecificConfigurations()) {
					if (current instanceof TreeFillingConfiguration) {
						int depth = ((TreeFillingConfiguration) current).getDepth();
						if (depth >= 0) {
							hiddenLevels.add(Integer.valueOf(depth));
						}
					}
				}
			}
		} else {
			final List<AxisManagerRepresentation> representation = table.getTableConfiguration().getRowHeaderAxisConfiguration().getAxisManagers();
			for (final AxisManagerRepresentation currentRep : representation) {
				for (final IAxisConfiguration current : currentRep.getSpecificAxisConfigurations()) {
					if (current instanceof TreeFillingConfiguration) {
						int depth = ((TreeFillingConfiguration) current).getDepth();
						if (depth >= 0) {
							hiddenLevels.add(Integer.valueOf(depth));
						}
					}
				}
			}
		}
		if (hiddenLevels.size() > 0) {
			Iterator<Integer> iter = hiddenLevels.iterator();
			int previousValue = iter.next().intValue();
			if (previousValue == 0 || previousValue == 1) {
				while (iter.hasNext()) {
					int nextValue = iter.next();
					if (nextValue == previousValue + 1) {
						previousValue = nextValue;
					} else {
						return previousValue;
					}
				}
				return previousValue;
			}

		}
		return 0;

	}
}
