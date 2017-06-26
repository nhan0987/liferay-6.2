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
 * Provides the local service utility for MotCuaChuyenDichTrangThai. This utility wraps
 * {@link vn.dtt.gt.dk.dao.motcua.service.impl.MotCuaChuyenDichTrangThaiLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author huymq
 * @see MotCuaChuyenDichTrangThaiLocalService
 * @see vn.dtt.gt.dk.dao.motcua.service.base.MotCuaChuyenDichTrangThaiLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.motcua.service.impl.MotCuaChuyenDichTrangThaiLocalServiceImpl
 * @generated
 */
public class MotCuaChuyenDichTrangThaiLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.motcua.service.impl.MotCuaChuyenDichTrangThaiLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the mot cua chuyen dich trang thai to the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaChuyenDichTrangThai the mot cua chuyen dich trang thai
	* @return the mot cua chuyen dich trang thai that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai addMotCuaChuyenDichTrangThai(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addMotCuaChuyenDichTrangThai(motCuaChuyenDichTrangThai);
	}

	/**
	* Creates a new mot cua chuyen dich trang thai with the primary key. Does not add the mot cua chuyen dich trang thai to the database.
	*
	* @param id the primary key for the new mot cua chuyen dich trang thai
	* @return the new mot cua chuyen dich trang thai
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai createMotCuaChuyenDichTrangThai(
		long id) {
		return getService().createMotCuaChuyenDichTrangThai(id);
	}

	/**
	* Deletes the mot cua chuyen dich trang thai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua chuyen dich trang thai
	* @return the mot cua chuyen dich trang thai that was removed
	* @throws PortalException if a mot cua chuyen dich trang thai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai deleteMotCuaChuyenDichTrangThai(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMotCuaChuyenDichTrangThai(id);
	}

	/**
	* Deletes the mot cua chuyen dich trang thai from the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaChuyenDichTrangThai the mot cua chuyen dich trang thai
	* @return the mot cua chuyen dich trang thai that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai deleteMotCuaChuyenDichTrangThai(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteMotCuaChuyenDichTrangThai(motCuaChuyenDichTrangThai);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai fetchMotCuaChuyenDichTrangThai(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMotCuaChuyenDichTrangThai(id);
	}

	/**
	* Returns the mot cua chuyen dich trang thai with the primary key.
	*
	* @param id the primary key of the mot cua chuyen dich trang thai
	* @return the mot cua chuyen dich trang thai
	* @throws PortalException if a mot cua chuyen dich trang thai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai getMotCuaChuyenDichTrangThai(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMotCuaChuyenDichTrangThai(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the mot cua chuyen dich trang thais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua chuyen dich trang thais
	* @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	* @return the range of mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> getMotCuaChuyenDichTrangThais(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMotCuaChuyenDichTrangThais(start, end);
	}

	/**
	* Returns the number of mot cua chuyen dich trang thais.
	*
	* @return the number of mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public static int getMotCuaChuyenDichTrangThaisCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMotCuaChuyenDichTrangThaisCount();
	}

	/**
	* Updates the mot cua chuyen dich trang thai in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param motCuaChuyenDichTrangThai the mot cua chuyen dich trang thai
	* @return the mot cua chuyen dich trang thai that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai updateMotCuaChuyenDichTrangThai(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateMotCuaChuyenDichTrangThai(motCuaChuyenDichTrangThai);
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

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByTrangThaiDichId(
		long trangThaiDichId) {
		return getService().findByTrangThaiDichId(trangThaiDichId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByDieuKienChuyenDich(
		java.lang.String dieuKienChuyenDich) {
		return getService().findByDieuKienChuyenDich(dieuKienChuyenDich);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByTrangThaiNguonId(
		long trangThaiNguonId) {
		return getService().findByTrangThaiNguonId(trangThaiNguonId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByDieuKienChuyenDichAndTrangThaiNguonId(
		java.lang.String dieuKienChuyenDich, long trangThaiNguonId) {
		return getService()
				   .findByDieuKienChuyenDichAndTrangThaiNguonId(dieuKienChuyenDich,
			trangThaiNguonId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findChuyenDichTrangThai(
		java.lang.String dieuKienDichchuyen, int start, int end) {
		return getService()
				   .findChuyenDichTrangThai(dieuKienDichchuyen, start, end);
	}

	public static int countChuyenDichTrangThai(
		java.lang.String dieuKienDichchuyen) {
		return getService().countChuyenDichTrangThai(dieuKienDichchuyen);
	}

	public static void clearService() {
		_service = null;
	}

	public static MotCuaChuyenDichTrangThaiLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MotCuaChuyenDichTrangThaiLocalService.class.getName());

			if (invokableLocalService instanceof MotCuaChuyenDichTrangThaiLocalService) {
				_service = (MotCuaChuyenDichTrangThaiLocalService)invokableLocalService;
			}
			else {
				_service = new MotCuaChuyenDichTrangThaiLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(MotCuaChuyenDichTrangThaiLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(MotCuaChuyenDichTrangThaiLocalService service) {
	}

	private static MotCuaChuyenDichTrangThaiLocalService _service;
}