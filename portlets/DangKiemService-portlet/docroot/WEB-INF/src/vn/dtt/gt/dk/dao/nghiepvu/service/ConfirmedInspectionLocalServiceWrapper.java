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
 * Provides a wrapper for {@link ConfirmedInspectionLocalService}.
 *
 * @author huymq
 * @see ConfirmedInspectionLocalService
 * @generated
 */
public class ConfirmedInspectionLocalServiceWrapper
	implements ConfirmedInspectionLocalService,
		ServiceWrapper<ConfirmedInspectionLocalService> {
	public ConfirmedInspectionLocalServiceWrapper(
		ConfirmedInspectionLocalService confirmedInspectionLocalService) {
		_confirmedInspectionLocalService = confirmedInspectionLocalService;
	}

	/**
	* Adds the confirmed inspection to the database. Also notifies the appropriate model listeners.
	*
	* @param confirmedInspection the confirmed inspection
	* @return the confirmed inspection that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection addConfirmedInspection(
		vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection confirmedInspection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _confirmedInspectionLocalService.addConfirmedInspection(confirmedInspection);
	}

	/**
	* Creates a new confirmed inspection with the primary key. Does not add the confirmed inspection to the database.
	*
	* @param id the primary key for the new confirmed inspection
	* @return the new confirmed inspection
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection createConfirmedInspection(
		long id) {
		return _confirmedInspectionLocalService.createConfirmedInspection(id);
	}

	/**
	* Deletes the confirmed inspection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the confirmed inspection
	* @return the confirmed inspection that was removed
	* @throws PortalException if a confirmed inspection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection deleteConfirmedInspection(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _confirmedInspectionLocalService.deleteConfirmedInspection(id);
	}

	/**
	* Deletes the confirmed inspection from the database. Also notifies the appropriate model listeners.
	*
	* @param confirmedInspection the confirmed inspection
	* @return the confirmed inspection that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection deleteConfirmedInspection(
		vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection confirmedInspection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _confirmedInspectionLocalService.deleteConfirmedInspection(confirmedInspection);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _confirmedInspectionLocalService.dynamicQuery();
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
		return _confirmedInspectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _confirmedInspectionLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _confirmedInspectionLocalService.dynamicQuery(dynamicQuery,
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
		return _confirmedInspectionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _confirmedInspectionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchConfirmedInspection(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _confirmedInspectionLocalService.fetchConfirmedInspection(id);
	}

	/**
	* Returns the confirmed inspection with the primary key.
	*
	* @param id the primary key of the confirmed inspection
	* @return the confirmed inspection
	* @throws PortalException if a confirmed inspection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection getConfirmedInspection(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _confirmedInspectionLocalService.getConfirmedInspection(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _confirmedInspectionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the confirmed inspections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of confirmed inspections
	* @param end the upper bound of the range of confirmed inspections (not inclusive)
	* @return the range of confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> getConfirmedInspections(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _confirmedInspectionLocalService.getConfirmedInspections(start,
			end);
	}

	/**
	* Returns the number of confirmed inspections.
	*
	* @return the number of confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getConfirmedInspectionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _confirmedInspectionLocalService.getConfirmedInspectionsCount();
	}

	/**
	* Updates the confirmed inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param confirmedInspection the confirmed inspection
	* @return the confirmed inspection that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection updateConfirmedInspection(
		vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection confirmedInspection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _confirmedInspectionLocalService.updateConfirmedInspection(confirmedInspection);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _confirmedInspectionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_confirmedInspectionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _confirmedInspectionLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByPhieuXuLyPhuId(
		long phieuXuLyPhuId) {
		return _confirmedInspectionLocalService.findByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByCorporationId(
		java.lang.String corporationId) {
		return _confirmedInspectionLocalService.findByCorporationId(corporationId);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByCorporationId(
		java.lang.String corporationId) {
		return _confirmedInspectionLocalService.fetchByCorporationId(corporationId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByRegisteredInspectionId(
		long registeredInspectionId) {
		return _confirmedInspectionLocalService.findByRegisteredInspectionId(registeredInspectionId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByProvinceCode(
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia) {
		return _confirmedInspectionLocalService.findByProvinceCode(quanHuyen,
			tinhThanh, quocGia);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByPhieuXuLyPhuIdAndCorporationId(
		long idPhieuXuLyPhu, java.lang.String idCorporation) {
		return _confirmedInspectionLocalService.findByPhieuXuLyPhuIdAndCorporationId(idPhieuXuLyPhu,
			idCorporation);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> getListConfirmedInspection(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber, long hoSoThuTucId) {
		return _confirmedInspectionLocalService.getListConfirmedInspection(codeNumber,
			chassisNumber, engineNumber, hoSoThuTucId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByInspectorIdAndNgayKiemTra(
		long inspectorId, java.lang.String corporationid,
		java.lang.String ngayKiemTra) {
		return _confirmedInspectionLocalService.findByInspectorIdAndNgayKiemTra(inspectorId,
			corporationid, ngayKiemTra);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByCorporationIdAndNgayKiemTra(
		java.lang.String corporationid, java.lang.String ngayKiemTra) {
		return _confirmedInspectionLocalService.findByCorporationIdAndNgayKiemTra(corporationid,
			ngayKiemTra);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findConfirmedGroupByInspectorId(
		java.lang.String corporationid, java.lang.String ngayKiemTra) {
		return _confirmedInspectionLocalService.findConfirmedGroupByInspectorId(corporationid,
			ngayKiemTra);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection getByR_G(
		long registeredInspectionId, long confirmationCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _confirmedInspectionLocalService.getByR_G(registeredInspectionId,
			confirmationCode);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ConfirmedInspectionLocalService getWrappedConfirmedInspectionLocalService() {
		return _confirmedInspectionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedConfirmedInspectionLocalService(
		ConfirmedInspectionLocalService confirmedInspectionLocalService) {
		_confirmedInspectionLocalService = confirmedInspectionLocalService;
	}

	@Override
	public ConfirmedInspectionLocalService getWrappedService() {
		return _confirmedInspectionLocalService;
	}

	@Override
	public void setWrappedService(
		ConfirmedInspectionLocalService confirmedInspectionLocalService) {
		_confirmedInspectionLocalService = confirmedInspectionLocalService;
	}

	private ConfirmedInspectionLocalService _confirmedInspectionLocalService;
}