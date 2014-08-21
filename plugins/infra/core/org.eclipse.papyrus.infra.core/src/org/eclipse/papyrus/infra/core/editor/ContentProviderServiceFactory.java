/**
 *
 */
package org.eclipse.papyrus.infra.core.editor;

import org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.DiSashModelManager;
import org.eclipse.papyrus.infra.core.services.IServiceFactory;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;

/**
 * A service factory to create the {@link ISashWindowsContentProvider} service.
 * This service depends on {@link DiSashModelMngrServiceFactory}.
 *
 * @author cedric dumoulin
 *
 */
public class ContentProviderServiceFactory implements IServiceFactory {

	/**
	 * The sashModelMangr.
	 */
	private DiSashModelManager sashModelMngr;

	/**
	 * @see org.eclipse.papyrus.infra.core.services.IService#init(org.eclipse.papyrus.infra.core.services.ServicesRegistry)
	 *
	 * @param servicesRegistry
	 * @throws ServiceException
	 */
	@Override
	public void init(ServicesRegistry servicesRegistry) throws ServiceException {
		// Get required services
		sashModelMngr = servicesRegistry.getService(DiSashModelManager.class);

	}

	/**
	 * @see org.eclipse.papyrus.infra.core.services.IService#startService()
	 *
	 * @throws ServiceException
	 */
	@Override
	public void startService() throws ServiceException {
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.services.IService#disposeService()
	 *
	 * @throws ServiceException
	 */
	@Override
	public void disposeService() throws ServiceException {
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.services.IServiceFactory#createServiceInstance()
	 *
	 * @return
	 * @throws ServiceException
	 */
	@Override
	public Object createServiceInstance() throws ServiceException {
		return sashModelMngr.getISashWindowsContentProvider();
	}

}
