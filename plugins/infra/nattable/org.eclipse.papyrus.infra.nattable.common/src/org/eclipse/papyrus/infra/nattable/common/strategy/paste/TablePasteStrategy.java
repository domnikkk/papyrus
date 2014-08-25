/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.nattable.common.strategy.paste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.clipboard.IClipboardAdditionalData;
import org.eclipse.papyrus.infra.core.clipboard.PapyrusClipboard;
import org.eclipse.papyrus.infra.gmfdiag.common.Activator;
import org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.AbstractPasteStrategy;
import org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.DefaultPasteStrategy;
import org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy;
import org.eclipse.papyrus.infra.nattable.common.commands.InsertTableCommand;
import org.eclipse.papyrus.infra.nattable.common.utils.TableUtil;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;


/**
 * Offer a strategy for copying tables.
 */
public class TablePasteStrategy extends AbstractPasteStrategy implements IPasteStrategy {

	/** key to store tables with no owner */
	protected static final String TABLE_WITH_NO_OWNER = "TABLE_WITH_NO_OWNER"; //$NON-NLS-1$

	/** The instance. */
	private static IPasteStrategy instance = new TablePasteStrategy();

	/**
	 * Gets the single instance of TablePasteStrategy.
	 *
	 * @return single instance of TablePasteStrategy
	 */
	public static IPasteStrategy getInstance() {
		return instance;
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy#getLabel()
	 */
	@Override
	public String getLabel() {
		return "Table Strategy"; //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy#getID()
	 */
	@Override
	public String getID() {
		return Activator.ID + ".TableStrategy"; //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy#getDescription()
	 */
	@Override
	public String getDescription() {
		return "Copy Table"; //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy#getSemanticCommand(org.eclipse.emf.edit.domain.EditingDomain,
	 * org.eclipse.emf.ecore.EObject, org.eclipse.papyrus.infra.core.clipboard.PapyrusClipboard)
	 */
	@Override
	public org.eclipse.emf.common.command.Command getSemanticCommand(final EditingDomain domain, final EObject targetOwner, PapyrusClipboard<Object> papyrusClipboard) {
		CompoundCommand compoundCommand = new CompoundCommand("Copy all tables"); //$NON-NLS-1$

		Map internalClipboardToTargetCopy = papyrusClipboard.getInternalClipboardToTargetCopy();
		Map<Object, ?> additionalDataMap = papyrusClipboard.getAdditionalDataForStrategy(getID());

		if (additionalDataMap != null) {
			Object additionalData = additionalDataMap.get(TABLE_WITH_NO_OWNER);
			if (additionalData instanceof TableClipboardAdditionalData) {
				TableClipboardAdditionalData tableAdditionalData = (TableClipboardAdditionalData) additionalData;
				Collection<Table> duplicateTables = tableAdditionalData.getDuplicatedTables(internalClipboardToTargetCopy);
				for (final Table table : duplicateTables) {
					org.eclipse.emf.common.command.Command command = new InsertTableCommand((TransactionalEditingDomain) domain, "Insert a table whit no source owner", table, targetOwner); //$NON-NLS-1$
					compoundCommand.append(command);
				}
			}

			for (Iterator<Object> iterator = papyrusClipboard.iterator(); iterator.hasNext();) {
				Object object = iterator.next();
				// get target Element
				EObject target = papyrusClipboard.getTragetCopyFromInternalClipboardCopy(object);
				if (target != null && target instanceof EObject) {
					// get affiliate additionalDataMap

					additionalData = additionalDataMap.get(object);
					if (additionalData instanceof TableClipboardAdditionalData) {
						TableClipboardAdditionalData tableAdditionalData = (TableClipboardAdditionalData) additionalData;
						Collection<Table> duplicateTables = tableAdditionalData.getDuplicatedTables(internalClipboardToTargetCopy);
						for (final Table table : duplicateTables) {
							org.eclipse.emf.common.command.Command command = new InsertTableCommand((TransactionalEditingDomain) domain, "InsertTableCommand", table, target); //$NON-NLS-1$
							compoundCommand.append(command);
						}
					}
				}
			}
		}

		// An empty compound Command can't be executed
		if (compoundCommand.getCommandList().isEmpty()) {
			return null;
		}
		return compoundCommand;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy#dependsOn()
	 */
	@Override
	public IPasteStrategy dependsOn() {
		return DefaultPasteStrategy.getInstance();
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.papyrus.infra.gmfdiag.common.strategy.paste.IPasteStrategy#prepare(org.eclipse.papyrus.infra.core.clipboard.PapyrusClipboard)
	 */
	@Override
	public void prepare(PapyrusClipboard<Object> papyrusClipboard, Collection<EObject> selection) {
		Map sourceToInternalClipboard = papyrusClipboard.getSourceToInternalClipboard();
		Map<Object, IClipboardAdditionalData> mapCopyToClipboardAdditionalData = new HashMap<Object, IClipboardAdditionalData>();

		List<Table> extractSelectedWithoutOwner = extractTableWithoutOwner(selection);
		if (extractSelectedWithoutOwner != null && !extractSelectedWithoutOwner.isEmpty()) {
			TableClipboardAdditionalData diagramAdditionnalData = new TableClipboardAdditionalData(extractSelectedWithoutOwner, sourceToInternalClipboard);
			mapCopyToClipboardAdditionalData.put(TABLE_WITH_NO_OWNER, diagramAdditionnalData);
		}

		for (Iterator<EObject> iterator = papyrusClipboard.iterateOnSource(); iterator.hasNext();) {
			EObject eObjectSource = iterator.next();
			ResourceSet resourceSet = eObjectSource.eResource().getResourceSet();
			List<Table> associatedTables = TableUtil.getAssociatedTables(eObjectSource, resourceSet);
			if (associatedTables != null) {
				TableClipboardAdditionalData tabledAdditionalData = new TableClipboardAdditionalData(associatedTables, sourceToInternalClipboard);
				Object copy = papyrusClipboard.getCopyFromSource(eObjectSource);
				mapCopyToClipboardAdditionalData.put(copy, tabledAdditionalData);
			}
		}
		papyrusClipboard.pushAdditionalData(getID(), mapCopyToClipboardAdditionalData);
	}



	/**
	 * Extract Table in which owner is not in the selection
	 *
	 * @param selection
	 * @return
	 */
	protected List<Table> extractTableWithoutOwner(Collection<EObject> selection) {
		List<Table> tableWithoutOwnerInSelection = new ArrayList<Table>();
		if (selection != null) {
			for (EObject eObject : selection) {
				if (eObject instanceof Table) {
					Table table = (Table) eObject;
					EObject element = table.getOwner();
					if (!selection.contains(element)) {
						tableWithoutOwnerInSelection.add(table);
					}
				}
			}
		}
		return tableWithoutOwnerInSelection;
	}



	protected class TableClipboardAdditionalData implements IClipboardAdditionalData {

		/** The internal copies of tables */
		protected Collection<Table> tables;

		/**
		 * @param diagramCopier
		 * @param tables
		 */
		public TableClipboardAdditionalData(Collection<Table> tables, Map<? extends EObject, ? extends EObject> alreadyCopied) {
			this.tables = duplicateTables(tables, alreadyCopied);
		}

		/**
		 * @return
		 */
		public Collection<Table> getDuplicatedTables(Map<? extends EObject, ? extends EObject> alreadyCopied) {
			return duplicateTables(this.tables, alreadyCopied);
		}

		/**
		 * @param tables
		 *            to duplicate
		 * @param alreadyCopied
		 * @return duplicated tables
		 */
		protected Collection<Table> duplicateTables(Collection<Table> tables, Map<? extends EObject, ? extends EObject> alreadyCopied) {
			Collection<Table> duplicatedTables = new ArrayList<Table>();
			EcoreUtil.Copier copier = new EcoreUtil.Copier();
			copier.putAll(alreadyCopied);
			for (Table table : tables) {
				copier.copy(table);
				copier.copyReferences();
				EObject copy = copier.get(table);
				if (copy instanceof Table) {
					duplicatedTables.add((Table) copy);
				}
			}
			return duplicatedTables;
		}


	}

}
