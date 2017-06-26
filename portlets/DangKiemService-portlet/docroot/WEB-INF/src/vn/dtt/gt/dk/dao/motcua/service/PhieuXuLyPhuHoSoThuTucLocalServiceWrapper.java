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

package vn.dtt.gt.dk.dao.motcua.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PhieuXuLyPhuHoSoThuTucLocalService}.
 *
 * @author huymq
 * @see PhieuXuLyPhuHoSoThuTucLocalService
 * @generated
 */
public class PhieuXuLyPhuHoSoThuTucLocalServiceWrapper
	implements PhieuXuLyPhuHoSoThuTucLocalService,
		ServiceWrapper<PhieuXuLyPhuHoSoThuTucLocalService> {
	public PhieuXuLyPhuHoSoThuTucLocalServiceWrapper(
		PhieuXuLyPhuHoSoThuTucLocalService phieuXuLyPhuHoSoThuTucLocalService) {
		_phieuXuLyPhuHoSoThuTucLocalService = phieuXuLyPhuHoSoThuTucLocalService;
	}

	/**
	* Adds the phieu xu ly phu ho so thu tuc to the database. Also notifies the appropriate model listeners.
	*
	* @param phieuXuLyPhuHoSoThuTuc the phieu xu ly phu ho so thu tuc
	* @return the phieu xu ly phu ho so thu tuc that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc addPhieuXuLyPhuHoSoThuTuc(
		vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc phieuXuLyPhuHoSoThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieuXuLyPhuHoSoThuTucLocalService.addPhieuXuLyPhuHoSoThuTuc(phieuXuLyPhuHoSoThuTuc);
	}

	/**
	* Creates a new phieu xu ly phu ho so thu tuc with the primary key. Does not add the phieu xu ly phu ho so thu tuc to the database.
	*
	* @param id the primary key for the new phieu xu ly phu ho so thu tuc
	* @return the new phieu xu ly phu ho so thu tuc
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc createPhieuXuLyPhuHoSoThuTuc(
		long id) {
		return _phieuXuLyPhuHoSoThuTucLocalService.createPhieuXuLyPhuHoSoThuTuc(id);
	}

	/**
	* Deletes the phieu xu ly phu ho so thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the phieu xu ly phu ho so thu tuc
	* @return the phieu xu ly phu ho so thu tuc that was removed
	* @throws PortalException if a phieu xu ly phu ho so thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc deletePhieuXuLyPhuHoSoThuTuc(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phieuXuLyPhuHoSoThuTucLocalService.deletePhieuXuLyPhuHoSoThuTuc(id);
	}

	/**
	* Deletes the phieu xu ly phu ho so thu tuc from the database. Also notifies the appropriate model listeners.
	*
	* @param phieuXuLyPhuHoSoThuTuc the phieu xu ly phu ho so thu tuc
	* @return the phieu xu ly phu ho so thu tuc that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc deletePhieuXuLyPhuHoSoThuTuc(
		vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc phieuXuLyPhuHoSoThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieuXuLyPhuHoSoThuTucLocalService.deletePhieuXuLyPhuHoSoThuTuc(phieuXuLyPhuHoSoThuTuc);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _phieuXuLyPhuHoSoThuTucLocalService.dynamicQuery();
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
		return _phieuXuLyPhuHoSoThuTucLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.PhieuXuLyPhuHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _phieuXuLyPhuHoSoThuTucLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.PhieuXuLyPhuHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _phieuXuLyPhuHoSoThuTucLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _phieuXuLyPhuHoSoThuTucLocalService.dynamicQueryCount(dynamicQuery);
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
		return _phieuXuLyPhuHoSoThuTucLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc fetchPhieuXuLyPhuHoSoThuTuc(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _phieuXuLyPhuHoSoThuTucLocalService.fetchPhieuXuLyPhuHoSoThuTuc(id);
	}

	/**
	* Returns the phieu xu ly phu ho so thu tuc with the primary key.
	*
	* @param id the primary key of the phieu xu ly phu ho so thu tuc
	* @return the phieu xu ly phu ho so thu tuc
	* @throws PortalException if a phieu xu ly phu ho so thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc getPhieuXuLyPhuHoSoThuTuc(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phieuXuLyPhuHoSoThuTucLocalService.getPhieuXuLyPhuHoSoThuTuc(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phieuXuLyPhuHoSoThuTucLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the phieu xu ly phu ho so thu tucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.PhieuXuLyPhuHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phieu xu ly phu ho so thu tucs
	* @param end the upper bound of the range of phieu xu ly phu ho so thu tucs (not inclusive)
	* @return the range of phieu xu ly phu ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc> getPhieuXuLyPhuHoSoThuTucs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieuXuLyPhuHoSoThuTucLocalService.getPhieuXuLyPhuHoSoThuTucs(start,
			end);
	}

	/**
	* Returns the number of phieu xu ly phu ho so thu tucs.
	*
	* @return the number of phieu xu ly phu ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPhieuXuLyPhuHoSoThuTucsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieuXuLyPhuHoSoThuTucLocalService.getPhieuXuLyPhuHoSoThuTucsCount();
	}

	/**
	* Updates the phieu xu ly phu ho so thu tuc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param phieuXuLyPhuHoSoThuTuc the phieu xu ly phu ho so thu tuc
	* @return the phieu xu ly phu ho so thu tuc that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc updatePhieuXuLyPhuHoSoThuTuc(
		vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTuc phieuXuLyPhuHoSoThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieuXuLyPhuHoSoThuTucLocalService.updatePhieuXuLyPhuHoSoThuTuc(phieuXuLyPhuHoSoThuTuc);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _phieuXuLyPhuHoSoThuTucLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_phieuXuLyPhuHoSoThuTucLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _phieuXuLyPhuHoSoThuTucLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PhieuXuLyPhuHoSoThuTucLocalService getWrappedPhieuXuLyPhuHoSoThuTucLocalService() {
		return _phieuXuLyPhuHoSoThuTucLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPhieuXuLyPhuHoSoThuTucLocalService(
		PhieuXuLyPhuHoSoThuTucLocalService phieuXuLyPhuHoSoThuTucLocalService) {
		_phieuXuLyPhuHoSoThuTucLocalService = phieuXuLyPhuHoSoThuTucLocalService;
	}

	@Override
	public PhieuXuLyPhuHoSoThuTucLocalService getWrappedService() {
		return _phieuXuLyPhuHoSoThuTucLocalService;
	}

	@Override
	public void setWrappedService(
		PhieuXuLyPhuHoSoThuTucLocalService phieuXuLyPhuHoSoThuTucLocalService) {
		_phieuXuLyPhuHoSoThuTucLocalService = phieuXuLyPhuHoSoThuTucLocalService;
	}

	private PhieuXuLyPhuHoSoThuTucLocalService _phieuXuLyPhuHoSoThuTucLocalService;
}