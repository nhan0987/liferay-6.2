/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.dtt.gt.dk.dao.nghiepvu.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ImportedXCDLocalService}.
 *
 * @author win_64
 * @see ImportedXCDLocalService
 * @generated
 */
public class ImportedXCDLocalServiceWrapper implements ImportedXCDLocalService,
	ServiceWrapper<ImportedXCDLocalService> {
	public ImportedXCDLocalServiceWrapper(
		ImportedXCDLocalService importedXCDLocalService) {
		_importedXCDLocalService = importedXCDLocalService;
	}

	/**
	* Adds the imported x c d to the database. Also notifies the appropriate model listeners.
	*
	* @param importedXCD the imported x c d
	* @return the imported x c d that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD addImportedXCD(
		vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD importedXCD)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _importedXCDLocalService.addImportedXCD(importedXCD);
	}

	/**
	* Creates a new imported x c d with the primary key. Does not add the imported x c d to the database.
	*
	* @param id the primary key for the new imported x c d
	* @return the new imported x c d
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD createImportedXCD(
		long id) {
		return _importedXCDLocalService.createImportedXCD(id);
	}

	/**
	* Deletes the imported x c d with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the imported x c d
	* @return the imported x c d that was removed
	* @throws PortalException if a imported x c d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD deleteImportedXCD(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _importedXCDLocalService.deleteImportedXCD(id);
	}

	/**
	* Deletes the imported x c d from the database. Also notifies the appropriate model listeners.
	*
	* @param importedXCD the imported x c d
	* @return the imported x c d that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD deleteImportedXCD(
		vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD importedXCD)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _importedXCDLocalService.deleteImportedXCD(importedXCD);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _importedXCDLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _importedXCDLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _importedXCDLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _importedXCDLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _importedXCDLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _importedXCDLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD fetchImportedXCD(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _importedXCDLocalService.fetchImportedXCD(id);
	}

	/**
	* Returns the imported x c d with the primary key.
	*
	* @param id the primary key of the imported x c d
	* @return the imported x c d
	* @throws PortalException if a imported x c d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD getImportedXCD(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _importedXCDLocalService.getImportedXCD(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _importedXCDLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the imported x c ds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @return the range of imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> getImportedXCDs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _importedXCDLocalService.getImportedXCDs(start, end);
	}

	/**
	* Returns the number of imported x c ds.
	*
	* @return the number of imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getImportedXCDsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _importedXCDLocalService.getImportedXCDsCount();
	}

	/**
	* Updates the imported x c d in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param importedXCD the imported x c d
	* @return the imported x c d that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD updateImportedXCD(
		vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD importedXCD)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _importedXCDLocalService.updateImportedXCD(importedXCD);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _importedXCDLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_importedXCDLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _importedXCDLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findByTrangthaiDongbo(
		java.lang.String trangthai, int start, int end) {
		return _importedXCDLocalService.findByTrangthaiDongbo(trangthai, start,
			end);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findByIDGCN(
		java.lang.String IDGCN, long trangthai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _importedXCDLocalService.findByIDGCN(IDGCN, trangthai);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoDangKy(
		java.lang.String SoDangKy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _importedXCDLocalService.findBySoDangKy(SoDangKy);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoBienBan(
		java.lang.String SoBienBan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _importedXCDLocalService.findBySoBienBan(SoBienBan);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoToKhai(
		java.lang.String SoToKhai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _importedXCDLocalService.findBySoToKhai(SoToKhai);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ImportedXCDLocalService getWrappedImportedXCDLocalService() {
		return _importedXCDLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedImportedXCDLocalService(
		ImportedXCDLocalService importedXCDLocalService) {
		_importedXCDLocalService = importedXCDLocalService;
	}

	@Override
	public ImportedXCDLocalService getWrappedService() {
		return _importedXCDLocalService;
	}

	@Override
	public void setWrappedService(
		ImportedXCDLocalService importedXCDLocalService) {
		_importedXCDLocalService = importedXCDLocalService;
	}

	private ImportedXCDLocalService _importedXCDLocalService;
}