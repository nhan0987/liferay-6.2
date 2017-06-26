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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for MotCuaTrangThaiHoSo. This utility wraps
 * {@link vn.dtt.gt.dk.dao.motcua.service.impl.MotCuaTrangThaiHoSoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author huymq
 * @see MotCuaTrangThaiHoSoLocalService
 * @see vn.dtt.gt.dk.dao.motcua.service.base.MotCuaTrangThaiHoSoLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.motcua.service.impl.MotCuaTrangThaiHoSoLocalServiceImpl
 * @generated
 */
public class MotCuaTrangThaiHoSoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.motcua.service.impl.MotCuaTrangThaiHoSoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the mot cua trang thai ho so to the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaTrangThaiHoSo the mot cua trang thai ho so
	* @return the mot cua trang thai ho so that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo addMotCuaTrangThaiHoSo(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo motCuaTrangThaiHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addMotCuaTrangThaiHoSo(motCuaTrangThaiHoSo);
	}

	/**
	* Creates a new mot cua trang thai ho so with the primary key. Does not add the mot cua trang thai ho so to the database.
	*
	* @param id the primary key for the new mot cua trang thai ho so
	* @return the new mot cua trang thai ho so
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo createMotCuaTrangThaiHoSo(
		long id) {
		return getService().createMotCuaTrangThaiHoSo(id);
	}

	/**
	* Deletes the mot cua trang thai ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua trang thai ho so
	* @return the mot cua trang thai ho so that was removed
	* @throws PortalException if a mot cua trang thai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo deleteMotCuaTrangThaiHoSo(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMotCuaTrangThaiHoSo(id);
	}

	/**
	* Deletes the mot cua trang thai ho so from the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaTrangThaiHoSo the mot cua trang thai ho so
	* @return the mot cua trang thai ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo deleteMotCuaTrangThaiHoSo(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo motCuaTrangThaiHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMotCuaTrangThaiHoSo(motCuaTrangThaiHoSo);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo fetchMotCuaTrangThaiHoSo(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMotCuaTrangThaiHoSo(id);
	}

	/**
	* Returns the mot cua trang thai ho so with the primary key.
	*
	* @param id the primary key of the mot cua trang thai ho so
	* @return the mot cua trang thai ho so
	* @throws PortalException if a mot cua trang thai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo getMotCuaTrangThaiHoSo(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMotCuaTrangThaiHoSo(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the mot cua trang thai ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua trang thai ho sos
	* @param end the upper bound of the range of mot cua trang thai ho sos (not inclusive)
	* @return the range of mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> getMotCuaTrangThaiHoSos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMotCuaTrangThaiHoSos(start, end);
	}

	/**
	* Returns the number of mot cua trang thai ho sos.
	*
	* @return the number of mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int getMotCuaTrangThaiHoSosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMotCuaTrangThaiHoSosCount();
	}

	/**
	* Updates the mot cua trang thai ho so in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param motCuaTrangThaiHoSo the mot cua trang thai ho so
	* @return the mot cua trang thai ho so that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo updateMotCuaTrangThaiHoSo(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo motCuaTrangThaiHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMotCuaTrangThaiHoSo(motCuaTrangThaiHoSo);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucId(
		long quyTrinhThuTucId) {
		return getService().findByQuyTrinhThuTucId(quyTrinhThuTucId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> getAllTrangThaiHoSoByKieuTrangThai(
		int kieuTrangThai) {
		return getService().getAllTrangThaiHoSoByKieuTrangThai(kieuTrangThai);
	}

	public static void clearService() {
		_service = null;
	}

	public static MotCuaTrangThaiHoSoLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MotCuaTrangThaiHoSoLocalService.class.getName());

			if (invokableLocalService instanceof MotCuaTrangThaiHoSoLocalService) {
				_service = (MotCuaTrangThaiHoSoLocalService)invokableLocalService;
			}
			else {
				_service = new MotCuaTrangThaiHoSoLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(MotCuaTrangThaiHoSoLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(MotCuaTrangThaiHoSoLocalService service) {
	}

	private static MotCuaTrangThaiHoSoLocalService _service;
}