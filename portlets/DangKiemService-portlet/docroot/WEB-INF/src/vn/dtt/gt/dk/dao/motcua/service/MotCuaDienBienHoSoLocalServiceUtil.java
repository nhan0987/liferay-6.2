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
 * Provides the local service utility for MotCuaDienBienHoSo. This utility wraps
 * {@link vn.dtt.gt.dk.dao.motcua.service.impl.MotCuaDienBienHoSoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author huymq
 * @see MotCuaDienBienHoSoLocalService
 * @see vn.dtt.gt.dk.dao.motcua.service.base.MotCuaDienBienHoSoLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.motcua.service.impl.MotCuaDienBienHoSoLocalServiceImpl
 * @generated
 */
public class MotCuaDienBienHoSoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.motcua.service.impl.MotCuaDienBienHoSoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the mot cua dien bien ho so to the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaDienBienHoSo the mot cua dien bien ho so
	* @return the mot cua dien bien ho so that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo addMotCuaDienBienHoSo(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo motCuaDienBienHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addMotCuaDienBienHoSo(motCuaDienBienHoSo);
	}

	/**
	* Creates a new mot cua dien bien ho so with the primary key. Does not add the mot cua dien bien ho so to the database.
	*
	* @param id the primary key for the new mot cua dien bien ho so
	* @return the new mot cua dien bien ho so
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo createMotCuaDienBienHoSo(
		long id) {
		return getService().createMotCuaDienBienHoSo(id);
	}

	/**
	* Deletes the mot cua dien bien ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua dien bien ho so
	* @return the mot cua dien bien ho so that was removed
	* @throws PortalException if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo deleteMotCuaDienBienHoSo(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMotCuaDienBienHoSo(id);
	}

	/**
	* Deletes the mot cua dien bien ho so from the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaDienBienHoSo the mot cua dien bien ho so
	* @return the mot cua dien bien ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo deleteMotCuaDienBienHoSo(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo motCuaDienBienHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMotCuaDienBienHoSo(motCuaDienBienHoSo);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchMotCuaDienBienHoSo(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMotCuaDienBienHoSo(id);
	}

	/**
	* Returns the mot cua dien bien ho so with the primary key.
	*
	* @param id the primary key of the mot cua dien bien ho so
	* @return the mot cua dien bien ho so
	* @throws PortalException if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo getMotCuaDienBienHoSo(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMotCuaDienBienHoSo(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the mot cua dien bien ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @return the range of mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> getMotCuaDienBienHoSos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMotCuaDienBienHoSos(start, end);
	}

	/**
	* Returns the number of mot cua dien bien ho sos.
	*
	* @return the number of mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int getMotCuaDienBienHoSosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMotCuaDienBienHoSosCount();
	}

	/**
	* Updates the mot cua dien bien ho so in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param motCuaDienBienHoSo the mot cua dien bien ho so
	* @return the mot cua dien bien ho so that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo updateMotCuaDienBienHoSo(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo motCuaDienBienHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMotCuaDienBienHoSo(motCuaDienBienHoSo);
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

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByTrangThaiTruocId(
		long trangThaiTruocId) {
		return getService().findByTrangThaiTruocId(trangThaiTruocId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findMotCuaDienBienHoSoByPhieuXuLyChinh(
		long phieuXuLyChinhId, int start, int end) {
		return getService()
				   .findMotCuaDienBienHoSoByPhieuXuLyChinh(phieuXuLyChinhId,
			start, end);
	}

	public static int countMotCuaDienBienHoSoByPhieuXuLyChinh(
		long phieuXuLyChinhId) {
		return getService()
				   .countMotCuaDienBienHoSoByPhieuXuLyChinh(phieuXuLyChinhId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByTrangThaiSauId(
		long trangThaiSauId) {
		return getService().findByTrangThaiSauId(trangThaiSauId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId) {
		return getService().findByPhieuXuLyChinhId(phieuXuLyChinhId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId) {
		return getService().findByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhIdTrangThaiTruocId(
		long phieuXuLyChinhId, long trangThaiTruocId) {
		return getService()
				   .findByPhieuXuLyChinhIdTrangThaiTruocId(phieuXuLyChinhId,
			trangThaiTruocId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhIdTrangThaiSauId(
		long phieuXuLyChinhId, long trangThaiSauId) {
		return getService()
				   .findByPhieuXuLyChinhIdTrangThaiSauId(phieuXuLyChinhId,
			trangThaiSauId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauId(
		long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId) {
		return getService()
				   .findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauId(phieuXuLyChinhId,
			trangThaiSauId, phieuXuLyPhuId);
	}

	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy(
		long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId,
		long nguoiXuLy) {
		return getService()
				   .fetchByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy(phieuXuLyChinhId,
			trangThaiSauId, phieuXuLyPhuId, nguoiXuLy);
	}

	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy(
		long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId,
		long nguoiXuLy) {
		return getService()
				   .findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy(phieuXuLyChinhId,
			trangThaiSauId, phieuXuLyPhuId, nguoiXuLy);
	}

	public static void clearService() {
		_service = null;
	}

	public static MotCuaDienBienHoSoLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MotCuaDienBienHoSoLocalService.class.getName());

			if (invokableLocalService instanceof MotCuaDienBienHoSoLocalService) {
				_service = (MotCuaDienBienHoSoLocalService)invokableLocalService;
			}
			else {
				_service = new MotCuaDienBienHoSoLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(MotCuaDienBienHoSoLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(MotCuaDienBienHoSoLocalService service) {
	}

	private static MotCuaDienBienHoSoLocalService _service;
}