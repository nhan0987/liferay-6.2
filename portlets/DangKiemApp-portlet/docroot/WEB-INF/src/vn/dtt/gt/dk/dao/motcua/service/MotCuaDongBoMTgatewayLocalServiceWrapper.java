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
 * Provides a wrapper for {@link MotCuaDongBoMTgatewayLocalService}.
 *
 * @author win_64
 * @see MotCuaDongBoMTgatewayLocalService
 * @generated
 */
public class MotCuaDongBoMTgatewayLocalServiceWrapper
	implements MotCuaDongBoMTgatewayLocalService,
		ServiceWrapper<MotCuaDongBoMTgatewayLocalService> {
	public MotCuaDongBoMTgatewayLocalServiceWrapper(
		MotCuaDongBoMTgatewayLocalService motCuaDongBoMTgatewayLocalService) {
		_motCuaDongBoMTgatewayLocalService = motCuaDongBoMTgatewayLocalService;
	}

	/**
	* Adds the mot cua dong bo m tgateway to the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaDongBoMTgateway the mot cua dong bo m tgateway
	* @return the mot cua dong bo m tgateway that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway addMotCuaDongBoMTgateway(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway motCuaDongBoMTgateway)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaDongBoMTgatewayLocalService.addMotCuaDongBoMTgateway(motCuaDongBoMTgateway);
	}

	/**
	* Creates a new mot cua dong bo m tgateway with the primary key. Does not add the mot cua dong bo m tgateway to the database.
	*
	* @param id the primary key for the new mot cua dong bo m tgateway
	* @return the new mot cua dong bo m tgateway
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway createMotCuaDongBoMTgateway(
		long id) {
		return _motCuaDongBoMTgatewayLocalService.createMotCuaDongBoMTgateway(id);
	}

	/**
	* Deletes the mot cua dong bo m tgateway with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua dong bo m tgateway
	* @return the mot cua dong bo m tgateway that was removed
	* @throws PortalException if a mot cua dong bo m tgateway with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway deleteMotCuaDongBoMTgateway(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _motCuaDongBoMTgatewayLocalService.deleteMotCuaDongBoMTgateway(id);
	}

	/**
	* Deletes the mot cua dong bo m tgateway from the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaDongBoMTgateway the mot cua dong bo m tgateway
	* @return the mot cua dong bo m tgateway that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway deleteMotCuaDongBoMTgateway(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway motCuaDongBoMTgateway)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaDongBoMTgatewayLocalService.deleteMotCuaDongBoMTgateway(motCuaDongBoMTgateway);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _motCuaDongBoMTgatewayLocalService.dynamicQuery();
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
		return _motCuaDongBoMTgatewayLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDongBoMTgatewayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _motCuaDongBoMTgatewayLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDongBoMTgatewayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _motCuaDongBoMTgatewayLocalService.dynamicQuery(dynamicQuery,
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
		return _motCuaDongBoMTgatewayLocalService.dynamicQueryCount(dynamicQuery);
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
		return _motCuaDongBoMTgatewayLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway fetchMotCuaDongBoMTgateway(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaDongBoMTgatewayLocalService.fetchMotCuaDongBoMTgateway(id);
	}

	/**
	* Returns the mot cua dong bo m tgateway with the primary key.
	*
	* @param id the primary key of the mot cua dong bo m tgateway
	* @return the mot cua dong bo m tgateway
	* @throws PortalException if a mot cua dong bo m tgateway with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway getMotCuaDongBoMTgateway(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _motCuaDongBoMTgatewayLocalService.getMotCuaDongBoMTgateway(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _motCuaDongBoMTgatewayLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the mot cua dong bo m tgatewaies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDongBoMTgatewayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua dong bo m tgatewaies
	* @param end the upper bound of the range of mot cua dong bo m tgatewaies (not inclusive)
	* @return the range of mot cua dong bo m tgatewaies
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway> getMotCuaDongBoMTgatewaies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaDongBoMTgatewayLocalService.getMotCuaDongBoMTgatewaies(start,
			end);
	}

	/**
	* Returns the number of mot cua dong bo m tgatewaies.
	*
	* @return the number of mot cua dong bo m tgatewaies
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getMotCuaDongBoMTgatewaiesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaDongBoMTgatewayLocalService.getMotCuaDongBoMTgatewaiesCount();
	}

	/**
	* Updates the mot cua dong bo m tgateway in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param motCuaDongBoMTgateway the mot cua dong bo m tgateway
	* @return the mot cua dong bo m tgateway that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway updateMotCuaDongBoMTgateway(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway motCuaDongBoMTgateway)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaDongBoMTgatewayLocalService.updateMotCuaDongBoMTgateway(motCuaDongBoMTgateway);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _motCuaDongBoMTgatewayLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_motCuaDongBoMTgatewayLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _motCuaDongBoMTgatewayLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway> findHoSoByPhieuXuLyChinh(
		long phieuXuLyChinhId, int start, int end) {
		return _motCuaDongBoMTgatewayLocalService.findHoSoByPhieuXuLyChinh(phieuXuLyChinhId,
			start, end);
	}

	@Override
	public int countByPhieuXuLyChinh(long phieuXuLyChinhId) {
		return _motCuaDongBoMTgatewayLocalService.countByPhieuXuLyChinh(phieuXuLyChinhId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway> findByTrangthaiDongbo(
		java.lang.String trangthai, int start, int end) {
		return _motCuaDongBoMTgatewayLocalService.findByTrangthaiDongbo(trangthai,
			start, end);
	}

	@Override
	public int countByDienbienHosoIdandPhieuXuLyChinhId(long dienBienHoSoId,
		long phieuXuLyChinhId) {
		return _motCuaDongBoMTgatewayLocalService.countByDienbienHosoIdandPhieuXuLyChinhId(dienBienHoSoId,
			phieuXuLyChinhId);
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway findLatestHosoDongboByHosothutucId(
		long phieuXuLyChinhId) {
		return _motCuaDongBoMTgatewayLocalService.findLatestHosoDongboByHosothutucId(phieuXuLyChinhId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MotCuaDongBoMTgatewayLocalService getWrappedMotCuaDongBoMTgatewayLocalService() {
		return _motCuaDongBoMTgatewayLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMotCuaDongBoMTgatewayLocalService(
		MotCuaDongBoMTgatewayLocalService motCuaDongBoMTgatewayLocalService) {
		_motCuaDongBoMTgatewayLocalService = motCuaDongBoMTgatewayLocalService;
	}

	@Override
	public MotCuaDongBoMTgatewayLocalService getWrappedService() {
		return _motCuaDongBoMTgatewayLocalService;
	}

	@Override
	public void setWrappedService(
		MotCuaDongBoMTgatewayLocalService motCuaDongBoMTgatewayLocalService) {
		_motCuaDongBoMTgatewayLocalService = motCuaDongBoMTgatewayLocalService;
	}

	private MotCuaDongBoMTgatewayLocalService _motCuaDongBoMTgatewayLocalService;
}