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

package vn.dtt.gt.dk.dao.common.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for TthcThanhPhanHoSo. This utility wraps
 * {@link vn.dtt.gt.dk.dao.common.service.impl.TthcThanhPhanHoSoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author win_64
 * @see TthcThanhPhanHoSoLocalService
 * @see vn.dtt.gt.dk.dao.common.service.base.TthcThanhPhanHoSoLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.common.service.impl.TthcThanhPhanHoSoLocalServiceImpl
 * @generated
 */
public class TthcThanhPhanHoSoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.common.service.impl.TthcThanhPhanHoSoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the tthc thanh phan ho so to the database. Also notifies the appropriate model listeners.
	*
	* @param tthcThanhPhanHoSo the tthc thanh phan ho so
	* @return the tthc thanh phan ho so that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo addTthcThanhPhanHoSo(
		vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo tthcThanhPhanHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTthcThanhPhanHoSo(tthcThanhPhanHoSo);
	}

	/**
	* Creates a new tthc thanh phan ho so with the primary key. Does not add the tthc thanh phan ho so to the database.
	*
	* @param Id the primary key for the new tthc thanh phan ho so
	* @return the new tthc thanh phan ho so
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo createTthcThanhPhanHoSo(
		long Id) {
		return getService().createTthcThanhPhanHoSo(Id);
	}

	/**
	* Deletes the tthc thanh phan ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the tthc thanh phan ho so
	* @return the tthc thanh phan ho so that was removed
	* @throws PortalException if a tthc thanh phan ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo deleteTthcThanhPhanHoSo(
		long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTthcThanhPhanHoSo(Id);
	}

	/**
	* Deletes the tthc thanh phan ho so from the database. Also notifies the appropriate model listeners.
	*
	* @param tthcThanhPhanHoSo the tthc thanh phan ho so
	* @return the tthc thanh phan ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo deleteTthcThanhPhanHoSo(
		vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo tthcThanhPhanHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTthcThanhPhanHoSo(tthcThanhPhanHoSo);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcThanhPhanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcThanhPhanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo fetchTthcThanhPhanHoSo(
		long Id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTthcThanhPhanHoSo(Id);
	}

	/**
	* Returns the tthc thanh phan ho so with the primary key.
	*
	* @param Id the primary key of the tthc thanh phan ho so
	* @return the tthc thanh phan ho so
	* @throws PortalException if a tthc thanh phan ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo getTthcThanhPhanHoSo(
		long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTthcThanhPhanHoSo(Id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tthc thanh phan ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcThanhPhanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc thanh phan ho sos
	* @param end the upper bound of the range of tthc thanh phan ho sos (not inclusive)
	* @return the range of tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo> getTthcThanhPhanHoSos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTthcThanhPhanHoSos(start, end);
	}

	/**
	* Returns the number of tthc thanh phan ho sos.
	*
	* @return the number of tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int getTthcThanhPhanHoSosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTthcThanhPhanHoSosCount();
	}

	/**
	* Updates the tthc thanh phan ho so in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tthcThanhPhanHoSo the tthc thanh phan ho so
	* @return the tthc thanh phan ho so that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo updateTthcThanhPhanHoSo(
		vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo tthcThanhPhanHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTthcThanhPhanHoSo(tthcThanhPhanHoSo);
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

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo> findByLinhVuc(
		long thuTucHanhChinhId) {
		return getService().findByLinhVuc(thuTucHanhChinhId);
	}

	public static vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo findByThuTucHanhChinhIdAndBieuMauHoSoId(
		long ThuTucHanhChinhId, long BieuMauHoSoId) {
		return getService()
				   .findByThuTucHanhChinhIdAndBieuMauHoSoId(ThuTucHanhChinhId,
			BieuMauHoSoId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo> findByThuTucHanhChinhIdAndMauTrucTuyen(
		long thuTucHanhChinhId, java.lang.String mauTrucTuyen) {
		return getService()
				   .findByThuTucHanhChinhIdAndMauTrucTuyen(thuTucHanhChinhId,
			mauTrucTuyen);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo> searchTthcThanhPhanHoSo(
		long thutuchanhchinhid, long bieumauhosoid, int thutuhienthi,
		int loaithanhphan, java.lang.String mautructuyen,
		long sotailieudinhkem, int start, int end) {
		return getService()
				   .searchTthcThanhPhanHoSo(thutuchanhchinhid, bieumauhosoid,
			thutuhienthi, loaithanhphan, mautructuyen, sotailieudinhkem, start,
			end);
	}

	public static int countTthcThanhPhanHoSo(long thutuchanhchinhid,
		long bieumauhosoid, int thutuhienthi, int loaithanhphan,
		java.lang.String mautructuyen, long sotailieudinhkem) {
		return getService()
				   .countTthcThanhPhanHoSo(thutuchanhchinhid, bieumauhosoid,
			thutuhienthi, loaithanhphan, mautructuyen, sotailieudinhkem);
	}

	public static void clearService() {
		_service = null;
	}

	public static TthcThanhPhanHoSoLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TthcThanhPhanHoSoLocalService.class.getName());

			if (invokableLocalService instanceof TthcThanhPhanHoSoLocalService) {
				_service = (TthcThanhPhanHoSoLocalService)invokableLocalService;
			}
			else {
				_service = new TthcThanhPhanHoSoLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(TthcThanhPhanHoSoLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(TthcThanhPhanHoSoLocalService service) {
	}

	private static TthcThanhPhanHoSoLocalService _service;
}