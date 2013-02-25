/*****************************************************************************
 * Copyright (c) 2010 Atos.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Emilien Perico (Atos Origin) emilien.perico@atosorigin.com - Initial API and implementation
 *  Arthur Daussy (Atos Origin) arthur.daussy@atos.net - Improvements
 *
 *****************************************************************************/
package org.eclipse.papyrus.controlmode.commands;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.EditingDomainUndoContext;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.controlmode.ControlModePlugin;
import org.eclipse.papyrus.controlmode.commands.IControlCommand.STATE_CONTROL;
import org.eclipse.papyrus.controlmode.history.HistoryModel;
import org.eclipse.papyrus.controlmode.history.utils.HistoryUtils;
import org.eclipse.papyrus.controlmode.mm.history.ControledResource;
import org.eclipse.papyrus.controlmode.mm.history.historyFactory;
import org.eclipse.papyrus.controlmode.mm.history.historyPackage;
import org.eclipse.papyrus.core.modelsetquery.ModelSetQuery;
import org.eclipse.papyrus.core.utils.EditorUtils;
import org.eclipse.papyrus.resource.ModelSet;
import org.eclipse.papyrus.resource.notation.NotationModel;
import org.eclipse.papyrus.resource.notation.NotationUtils;
import org.eclipse.papyrus.resource.sasheditor.DiModel;
import org.eclipse.papyrus.resource.sasheditor.SashModelUtils;
import org.eclipse.papyrus.resource.uml.UmlUtils;
import org.eclipse.papyrus.sashwindows.di.PageRef;
import org.eclipse.papyrus.sashwindows.di.SashWindowsMngr;
import org.eclipse.papyrus.sashwindows.di.exception.SashEditorException;
import org.eclipse.papyrus.sashwindows.di.util.DiUtils;

/**
 * Version 2 of the command to control a part of a model
 * This one is able to use an IAdatable to locate the target resource.
 * @author adaussy
 *
 */
public class AdvanceControlCommand extends AbstractTransactionalCommand
{
    /** extension point ID for custom control command */
    private static final String CONTROL_EXTENSION_POINT_ID = "org.eclipse.papyrus.controlmode.customControlCommand";

    /** attribute ID for the custom command class. */
    private static final String CONTROL_CMD_ATTRIBUTE_EXTENSION_POINT = "controlCommand";

    /** element ID for the custom command class. */
    private static final String CONTROL_CMD_ELEMENT_EXTENSION_POINT = "customControlCommand";

    protected EObject eObject;

    private ModelSet modelSet;

    private Resource controlledModel;

    private Resource controlledNotation;

    private Resource controlledDI;

    protected List<IControlCommand> commands;

    protected IAdaptable controlModelAdaptable;

    /**
     * Instantiates a new control command.
     * 
     * @param domain
     * @param label
     * @param affectedFiles
     */
    public AdvanceControlCommand(TransactionalEditingDomain domain, Resource model, EObject selectedObject, String label)
    {
        super(domain, label, getWorkspaceFiles(selectedObject));
        this.eObject = selectedObject;
        this.setControlledModel(model);
        // Add an undo context to allow the editor to react to that change
        addContext(new EditingDomainUndoContext(domain));
        ResourceSet set = domain.getResourceSet();
        if (set instanceof ModelSet)
        {
            setModelSet((ModelSet) set);
        }
    }

    /**
     * Instantiates a new control command.
     * 
     * @param domain
     * @param label
     * @param affectedFiles
     */
    public AdvanceControlCommand(TransactionalEditingDomain domain, EObject selectedObject, IAdaptable model, String label)
    {
        this(domain, null, selectedObject, label);
        setControlledModel(null);
        controlModelAdaptable = model;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException
    {
        commands = getCommandExtensions();
        IStatus status = doRedo(monitor, info);
        CommandResult result;
        if (status.equals(Status.OK_STATUS))
        {
            result = CommandResult.newOKCommandResult();
        }
        else if (status.equals(Status.CANCEL_STATUS))
        {
            result = CommandResult.newErrorCommandResult("Unable to execute control command");
        }
        else
        {
            result = CommandResult.newCancelledCommandResult();
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected IStatus doUndo(IProgressMonitor monitor, IAdaptable info) throws ExecutionException
    {
        // execute uncontrol command
        UncontrolCommand transactionalCommand = new UncontrolCommand(getEditingDomain(), eObject, "Uncontrol", null, true);
        getEditingDomain().getCommandStack().execute(new GMFtoEMFCommandWrapper(transactionalCommand));
        return Status.OK_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected IStatus doRedo(IProgressMonitor monitor, IAdaptable info) throws ExecutionException
    {
        if (getModelSet() == null)
        {
            try
            {
                setModelSet(EditorUtils.getServiceRegistry().getService(ModelSet.class));
            }
            catch (Exception e)
            {
            }
        }
        if (getModelSet() == null)
        {
            return new Status(IStatus.ERROR, ControlModePlugin.PLUGIN_ID, "no ModelSet has been found");
        }
        if (!getEditingDomain().getResourceSet().getResources().contains(getControlledModel()))
        {
            getEditingDomain().getResourceSet().getResources().add(getControlledModel());
        }
        // Create the URI from models that will be created
        final URI newNotationURI = URI.createURI(getControlledModel().getURI().trimFileExtension().appendFileExtension(NotationModel.NOTATION_FILE_EXTENSION).toString());
        this.setControlledNotation(getResource(newNotationURI));
        final URI newDiURI = URI.createURI(getControlledModel().getURI().trimFileExtension().appendFileExtension(DiModel.DI_FILE_EXTENSION).toString());
        this.setControlledDI(getResource(newDiURI));
        final List<Diagram> diagrams = getDiagrams(eObject);
        // compound command that executes whole control action
        CompoundCommand compoundCommand = new CompoundCommand();
        controlModel(compoundCommand);
        controlNotation(compoundCommand, diagrams);
        try
        {
            controlDi(compoundCommand, diagrams);
        }
        catch (SashEditorException exception)
        {
            EMFEditUIPlugin.INSTANCE.log(exception);
            return Status.CANCEL_STATUS;
        }
        // Ensure that all proxies are resolved so that references into the controlled object will be saved to reference
        // the new resource
        EcoreUtil.resolveAll(getEditingDomain().getResourceSet());
        if (compoundCommand.canExecute())
        {
            compoundCommand.execute();
            return Status.OK_STATUS;
        }
        else
        {
            return Status.CANCEL_STATUS;
        }
    }

    /**
     * Search for diagrams in corresponding notation resource of the eObject model resource
     * 
     * @param eObject
     * @return
     */
    protected List<Diagram> getDiagrams(EObject eObject)
    {
        Resource notationResource = getModelSet().getAssociatedResource(eObject, NotationModel.NOTATION_FILE_EXTENSION);
        return NotationUtils.getAllDescendantDiagramsInResource(eObject, notationResource);
    }

    // /**
    // * Search for diagrams in all the resources
    // *
    // * @param eObject
    // * @return
    // */
    // private List<Diagram> getDiagrams(EObject eObject) {
    // List<Diagram> diagrams = new LinkedList<Diagram>();
    // for(Resource r : diResourceSet.getResources()) {
    // if(NotationModel.NOTATION_FILE_EXTENSION.equals(r.getURI().fileExtension())) {
    // diagrams.addAll(NotationUtils.getDiagrams(r, eObject));
    // }
    // }
    // return diagrams;
    // }
    /**
     * Control the model resource
     * 
     * @param compoundCommand
     */
    protected void controlModel(CompoundCommand compoundCommand)
    {
        // PRE control operation
        control(getEditingDomain(), eObject, UmlUtils.getUmlModel(getModelSet()).getResource(), getControlledModel(), compoundCommand, STATE_CONTROL.PRE_MODEL);
        // Control the Model
        compoundCommand.append(new AddCommand(getEditingDomain(), getControlledModel().getContents(), eObject));
        // update history
        assignControlledResourceOfCurrentElement(getEditingDomain(), compoundCommand, getHistoryResource(eObject), eObject.eResource().getURI().toString(), getControlledModel().getURI().toString());
        // POST control operation
        control(getEditingDomain(), eObject, UmlUtils.getUmlModel(getModelSet()).getResource(), getControlledModel(), compoundCommand, STATE_CONTROL.POST_MODEL);
    }

    /**
     * Control the notation resource
     * 
     * @param compoundCommand
     * @param diagrams list
     */
    protected void controlNotation(CompoundCommand compoundCommand, List<Diagram> diagrams)
    {
        // PRE control operation
        for (Diagram diag : diagrams)
        {
            control(getEditingDomain(), diag, getNotationResourceForCurrent(eObject), getControlledNotation(), compoundCommand, STATE_CONTROL.PRE_NOTATION);
        }
        if (!diagrams.isEmpty())
        {
            // Control the Notation model
            compoundCommand.append(new AddCommand(getEditingDomain(), getControlledNotation().getContents(), diagrams));
        }
        // update history
        Set<Resource> resources = new HashSet<Resource>(diagrams.size());
        for (Diagram d : diagrams)
        {
            resources.add(d.eResource());
        }
        for (Resource r : resources)
        {
            assignControlledResourceOfCurrentElement(getEditingDomain(), compoundCommand, getHistoryResource(eObject), r.getURI().toString(), getControlledNotation().getURI().toString());
        }
        // POST control operation
        for (Diagram diag : diagrams)
        {
            control(getEditingDomain(), diag, getNotationResourceForCurrent(eObject), getControlledNotation(), compoundCommand, STATE_CONTROL.POST_NOTATION);
        }
    }

    /**
     * Control the di resource
     * 
     * @param compoundCommand
     * @param diagrams
     * @throws SashEditorException
     */
    protected void controlDi(CompoundCommand compoundCommand, final List<Diagram> diagrams) throws SashEditorException
    {
        // Create a new SashWindowManager
        SashWindowsMngr windowsMngr = DiUtils.createDefaultSashWindowsMngr();
        Resource diResource = SashModelUtils.getSashModel(getModelSet()).getResource();
        // add pages to the page list
        for (Diagram diagram : diagrams)
        {
            PageRef pageRef = DiUtils.getPageRef(diResource, diagram);
            if (pageRef != null)
            {
                windowsMngr.getPageList().addPage(pageRef.getPageIdentifier());
                DiUtils.addPageToTabFolder(windowsMngr, pageRef);
            }
        }
        // PRE control operation
        control(getEditingDomain(), eObject, diResource, getControlledDI(), compoundCommand, STATE_CONTROL.PRE_DI);
        // Control the DI model
        compoundCommand.append(new AddCommand(getEditingDomain(), getControlledDI().getContents(), windowsMngr, 0));
        // POST control operation
        control(getEditingDomain(), eObject, diResource, getControlledDI(), compoundCommand, STATE_CONTROL.POST_DI);
    }

    /**
     * Analyze the history model to update the controlled children
     * 
     * @param domain
     * @param compoundCommand
     * @param model
     * @param currentURL
     * @param newURL
     */
    protected void assignControlledResourceOfCurrentElement(EditingDomain domain, CompoundCommand compoundCommand, Resource model, String currentURL, String newURL)
    {
        if (model == null)
        {
            return;
        }
        // create relative path
        URI uriPath = HistoryUtils.getURIFullPath(currentURL);
        String currentURLResolved = HistoryUtils.resolve(uriPath, currentURL);
        String newURLResolved = HistoryUtils.resolve(uriPath, newURL);
        ControledResource child = historyFactory.eINSTANCE.createControledResource();
        child.setResourceURL(newURLResolved);
        ControledResource resource = getControledResource(model);
        Resource parentResource = null;
        // create the controlled resource according to the control action
        ControledResource parent = null;
        if (resource == null)
        {
            parent = historyFactory.eINSTANCE.createControledResource();
            parent.setResourceURL(currentURLResolved);
            parent.getChildren().add(child);
            parentResource = model;
            compoundCommand.append(new AddCommand(domain, parentResource.getContents(), Collections.singleton(parent)));
        }
        else
        {
            if (isCurrentURL(currentURLResolved, resource))
            {
                parent = resource;
            }
            if (parent == null)
            {
                EObject modelRoot = getControledResource(model);
                Collection<EObject> controled = ModelSetQuery.getObjectsOfType(modelRoot, historyPackage.Literals.CONTROLED_RESOURCE);
                for (EObject next : controled)
                {
                    if (next instanceof ControledResource)
                    {
                        ControledResource tmp = (ControledResource) next;
                        if (isCurrentURL(currentURLResolved, tmp))
                        {
                            parent = tmp;
                            break;
                        }
                    }
                }
            }
            if (parent == null)
            {
                parent = historyFactory.eINSTANCE.createControledResource();
                parent.setResourceURL(currentURLResolved);
                parentResource = resource.eResource();
                // add controlled resource command for notation is done in assignToChildExistingControledResources
                if (!currentURLResolved.endsWith(NotationModel.NOTATION_FILE_EXTENSION))
                {
                    compoundCommand.append(new AddCommand(domain, parentResource.getContents(), Collections.singleton(parent)));
                }
            }
            if (parent != null)
            {
                compoundCommand.append(AddCommand.create(domain, parent, historyPackage.Literals.CONTROLED_RESOURCE__CHILDREN, Collections.singleton(child)));
            }
        }
        List<ControledResource> controledFromParent = new LinkedList<ControledResource>();
        if (parentResource == null)
        {
            parentResource = model;
        }
        if (parentResource != null)
        {
            for (EObject e : parentResource.getContents())
            {
                if (e instanceof ControledResource)
                {
                    ControledResource aControled = (ControledResource) e;
                    controledFromParent.add(aControled);
                    for (Iterator<EObject> i = aControled.eAllContents(); i.hasNext();)
                    {
                        EObject tmp = i.next();
                        if (tmp instanceof ControledResource)
                        {
                            controledFromParent.add((ControledResource) tmp);
                        }
                    }
                }
            }
        }
        // manage move of existing controlled resources
        if (!newURL.endsWith(NotationModel.NOTATION_FILE_EXTENSION))
        {
            assignToChildExistingControledResources(domain, compoundCommand, child, newURL, controledFromParent, currentURL, URI.createURI(newURL), uriPath);
        }
    }

    /**
     * Manage move of existing controlled resources
     * 
     * @param domain
     * @param compoundCommand
     * @param child
     * @param controledResourceURL
     * @param controledFromParent
     * @param parentURL
     * @param controledURIFullPath
     * @param parentURIFullPath
     */
    protected void assignToChildExistingControledResources(EditingDomain domain, CompoundCommand compoundCommand, ControledResource child, String controledResourceURL,
            List<ControledResource> controledFromParent, String parentURL, URI controledURIFullPath, URI parentURIFullPath)
    {
        for (ControledResource r : controledFromParent)
        {
            if (r.getResourceURL() != null)
            {
                URI fullPathParent = URI.createURI(r.getResourceURL()).resolve(parentURIFullPath);
                Resource resourceLoaded = getModelSet().getResource(fullPathParent, false);
                if (resourceLoaded != null && !resourceLoaded.getContents().isEmpty())
                {
                    EObject top = resourceLoaded.getContents().get(0);
                    if (isInRootHierarchy(top, eObject))
                    {
                        // manage model
                        URI newResolvedURIFromChild = fullPathParent.deresolve(controledURIFullPath, false, true, true);
                        ControledResource aNewOne = historyFactory.eINSTANCE.createControledResource();
                        aNewOne.setResourceURL(newResolvedURIFromChild.toString());
                        // add new control resource to the new history
                        compoundCommand.append(new AddCommand(domain, getControledResource(getControlledDI(), URI.createURI(controledResourceURL).lastSegment(), compoundCommand, getEditingDomain()),
                                historyPackage.Literals.CONTROLED_RESOURCE__CHILDREN, aNewOne));
                        // remove old controlled resource from the parent resource
                        compoundCommand.append(RemoveCommand.create(domain, r.eContainer(), historyPackage.Literals.CONTROLED_RESOURCE__CHILDREN, r));
                        // manage notation
                        URI newNotation = newResolvedURIFromChild.trimFileExtension().appendFileExtension(NotationModel.NOTATION_FILE_EXTENSION);
                        ControledResource aNewOneNotation = historyFactory.eINSTANCE.createControledResource();
                        aNewOneNotation.setResourceURL(newNotation.toString());
                        // add new control resource to the new history
                        compoundCommand.append(new AddCommand(domain, getControledResource(getControlledDI(),
                                URI.createURI(URI.createURI(controledResourceURL).trimFileExtension().appendFileExtension(NotationModel.NOTATION_FILE_EXTENSION).toString()).lastSegment(),
                                compoundCommand, getEditingDomain()), historyPackage.Literals.CONTROLED_RESOURCE__CHILDREN, aNewOneNotation));
                        // remove old controlled resource from the parent resource
                        URI notationParentURL = URI.createURI(r.getParent().getResourceURL()).trimFileExtension().appendFileExtension(NotationModel.NOTATION_FILE_EXTENSION);
                        ControledResource notationParent = getControledResource(r.eResource(), notationParentURL.toString(), compoundCommand, domain);
                        for (ControledResource notationChild : notationParent.getChildren())
                        {
                            // URI notationURI =
                            // newResolvedURIFromChild.trimFileExtension().appendFileExtension(NotationModel.NOTATION_FILE_EXTENSION);
                            URI notationURI = URI.createURI(r.getResourceURL()).trimFileExtension().appendFileExtension(NotationModel.NOTATION_FILE_EXTENSION);
                            if (notationChild.getResourceURL().equals(notationURI.toString()))
                            {
                                compoundCommand.append(RemoveCommand.create(domain, notationParent, historyPackage.Literals.CONTROLED_RESOURCE__CHILDREN, notationChild));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Get the controlled resource in a specified resource
     */
    protected ControledResource getControledResource(Resource resource)
    {
        for (EObject e : resource.getContents())
        {
            if (e instanceof ControledResource)
            {
                return (ControledResource) e;
            }
        }
        return null;
    }

    /**
     * Get the controlled resource for the specified URL, create it if it doesn't exist
     * 
     * @param resource
     * @param controledResourceURL
     * @param command
     * @param domain
     * @return
     */
    protected ControledResource getControledResource(Resource resource, String controledResourceURL, CompoundCommand command, EditingDomain domain)
    {
        ControledResource result = null;
        for (EObject e : resource.getContents())
        {
            if (e instanceof ControledResource)
            {
                ControledResource controled = (ControledResource) e;
                if (controledResourceURL != null && controledResourceURL.equals(controled.getResourceURL()))
                {
                    result = controled;
                }
            }
        }
        if (result == null)
        {
            result = historyFactory.eINSTANCE.createControledResource();
            result.setResourceURL(controledResourceURL);
            command.append(new AddCommand(domain, resource.getContents(), result, 0));
        }
        return result;
    }

    /**
     * Check if an EObject start is in root hierarchy of another eObject search
     * 
     * @param start
     * @param search
     * @return
     */
    protected boolean isInRootHierarchy(EObject start, EObject search)
    {
        while (start != null && start != search)
        {
            start = start.eContainer();
        }
        return start != null;
    }

    /**
     * Check if an URL is the current one of the specified resource
     * 
     * @param currentURL
     * @param resource
     * @return
     */
    protected boolean isCurrentURL(String currentURL, ControledResource resource)
    {
        return resource.getResourceURL() != null && resource.getResourceURL().equals(currentURL);
    }

    /**
     * Get the notation resource for the specified eObject
     * 
     * @param eObject
     * @return
     */
    protected Resource getNotationResourceForCurrent(EObject eObject)
    {
        return getModelSet().getResource(eObject.eResource().getURI().trimFileExtension().appendFileExtension(NotationModel.NOTATION_FILE_EXTENSION), true);
    }

    /**
     * Get the history resource of the specified eObject
     * 
     * @param eObject
     * @return
     */
    protected Resource getHistoryResource(EObject eObject)
    {
        if (eObject.eResource() != null)
        {
            return getModelSet().getResource(eObject.eResource().getURI().trimFileExtension().appendFileExtension(HistoryModel.MODEL_FILE_EXTENSION), true);
        }
        return null;
    }

    /**
     * Control action applied on the specified selection
     * 
     * @param domain
     * @param selection
     * @param source
     * @param target
     * @param command
     * @param state
     */
    public void control(EditingDomain domain, EObject selection, Resource source, Resource target, CompoundCommand command, STATE_CONTROL state)
    {
        for (IControlCommand cmd : commands)
        {
            if (cmd.provides(selection, state, source, target))
            {
                cmd.control(domain, selection, state, source, target, command);
            }
        }
    }

    /**
     * Gets the custom command extensions that will be executed with the default control action.
     * 
     * @return the command extensions
     */
    private List<IControlCommand> getCommandExtensions()
    {
        List<IControlCommand> commands = new LinkedList<IControlCommand>();
        IConfigurationElement[] extensions = Platform.getExtensionRegistry().getConfigurationElementsFor(CONTROL_EXTENSION_POINT_ID);
        for (IConfigurationElement e : extensions)
        {
            if (CONTROL_CMD_ELEMENT_EXTENSION_POINT.equals(e.getName()))
            {
                try
                {
                    IControlCommand controlCmd = (IControlCommand) e.createExecutableExtension(CONTROL_CMD_ATTRIBUTE_EXTENSION_POINT);
                    commands.add(controlCmd);
                }
                catch (CoreException exception)
                {
                    exception.printStackTrace();
                }
            }
        }
        return commands;
    }

    /**
     * Gets the resource from the URI, create it if not exists
     * 
     * @param uri
     * 
     * @return the resource
     */
    protected Resource getResource(URI uri)
    {
        Resource res = getEditingDomain().getResourceSet().getResource(uri, false);
        if (res == null)
        {
            res = getEditingDomain().getResourceSet().createResource(uri);
        }
        return res;
    }

    /**
     * Get the model set
     * 
     * @return
     */
    protected ModelSet getModelSet()
    {
        return modelSet;
    }

    /**
     * Set the model set
     * 
     * @param modelSet
     */
    protected void setModelSet(ModelSet modelSet)
    {
        this.modelSet = modelSet;
    }

    /**
     * Get the control model (Either for field or from adaptable)
     * 
     * @return
     */
    protected Resource getControlledModel()
    {
        if (controlledModel != null)
        {
            return controlledModel;
        }
        if (controlModelAdaptable != null)
        {
            controlledModel = (Resource) controlModelAdaptable.getAdapter(Resource.class);
            return controlledModel;
        }
        return null;
    }

    /**
     * Set the controlled model
     * 
     * @param controlledModel
     */
    protected void setControlledModel(Resource controlledModel)
    {
        this.controlledModel = controlledModel;
    }

    protected Resource getControlledNotation()
    {
        return controlledNotation;
    }

    protected void setControlledNotation(Resource controlledNotation)
    {
        this.controlledNotation = controlledNotation;
    }

    protected Resource getControlledDI()
    {
        return controlledDI;
    }

    protected void setControlledDI(Resource controlledDI)
    {
        this.controlledDI = controlledDI;
    }
}