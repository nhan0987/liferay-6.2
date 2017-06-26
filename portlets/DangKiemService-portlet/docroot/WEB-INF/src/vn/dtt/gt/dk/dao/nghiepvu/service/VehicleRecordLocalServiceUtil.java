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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for VehicleRecord. This utility wraps
 * {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.VehicleRecordLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author huymq
 * @see VehicleRecordLocalService
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.VehicleRecordLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.impl.VehicleRecordLocalServiceImpl
 * @generated
 */
public class VehicleRecordLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.VehicleRecordLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vehicle record to the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleRecord the vehicle record
	* @return the vehicle record that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord addVehicleRecord(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord vehicleRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addVehicleRecord(vehicleRecord);
	}

	/**
	* Creates a new vehicle record with the primary key. Does not add the vehicle record to the database.
	*
	* @param id the primary key for the new vehicle record
	* @return the new vehicle record
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord createVehicleRecord(
		long id) {
		return getService().createVehicleRecord(id);
	}

	/**
	* Deletes the vehicle record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vehicle record
	* @return the vehicle record that was removed
	* @throws PortalException if a vehicle record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord deleteVehicleRecord(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteVehicleRecord(id);
	}

	/**
	* Deletes the vehicle record from the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleRecord the vehicle record
	* @return the vehicle record that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord deleteVehicleRecord(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord vehicleRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteVehicleRecord(vehicleRecord);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchVehicleRecord(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchVehicleRecord(id);
	}

	/**
	* Returns the vehicle record with the primary key.
	*
	* @param id the primary key of the vehicle record
	* @return the vehicle record
	* @throws PortalException if a vehicle record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord getVehicleRecord(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getVehicleRecord(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the vehicle records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @return the range of vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> getVehicleRecords(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVehicleRecords(start, end);
	}

	/**
	* Returns the number of vehicle records.
	*
	* @return the number of vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static int getVehicleRecordsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVehicleRecordsCount();
	}

	/**
	* Updates the vehicle record in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vehicleRecord the vehicle record
	* @return the vehicle record that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord updateVehicleRecord(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord vehicleRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateVehicleRecord(vehicleRecord);
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

	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByCodeNumber(
		long codeNumber) {
		return getService().findByCodeNumber(codeNumber);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByCertificateRecordId(
		long certificateRecordId) {
		return getService().findByCertificateRecordId(certificateRecordId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByConfirmedInspectionId(
		long confirmedInspectionId) {
		return getService().findByConfirmedInspectionId(confirmedInspectionId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDraftCertificateId(
		long draftCertificateId) {
		return getService().findByDraftCertificateId(draftCertificateId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findVehicleRecordHasSafetestrequirement(
		java.lang.String inspectionRecordId) {
		return getService()
				   .findVehicleRecordHasSafetestrequirement(inspectionRecordId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findVehicleRecordHasEmissiontestrequirement(
		java.lang.String inspectionRecordId) {
		return getService()
				   .findVehicleRecordHasEmissiontestrequirement(inspectionRecordId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findVehicleRecordHasControlrequirement(
		java.lang.String inspectionRecordId) {
		return getService()
				   .findVehicleRecordHasControlrequirement(inspectionRecordId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findVehicleRecordByPhieuXuLyPhuId(
		long phieuXuLyPhuId) {
		return getService().findVehicleRecordByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDossierId(
		long dossierId, long codeNumber) {
		return getService().findByDossierId(dossierId, codeNumber);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup findVehicleGroupByInspectionRecordId(
		long inspectionRecordId) {
		return getService()
				   .findVehicleGroupByInspectionRecordId(inspectionRecordId);
	}

	public static int countVehicleRecord(long inspectionRecordId) {
		return getService().countVehicleRecord(inspectionRecordId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByInspectionRecordIdOrderbyAsc(
		long inspectionRecordId) {
		return getService()
				   .findByInspectionRecordIdOrderbyAsc(inspectionRecordId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByInspectionRecordId(
		long inspectionRecordId) {
		return getService().findByInspectionRecordId(inspectionRecordId);
	}

	public static long tongChungChiDaCap(long vehiclegroupId) {
		return getService().tongChungChiDaCap(vehiclegroupId);
	}

	public static long tongDuThaoChungChi(long vehiclegroupId) {
		return getService().tongDuThaoChungChi(vehiclegroupId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByVehicleGroupId(
		long vehicleGroupId) {
		return getService().findByVehicleGroupId(vehicleGroupId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDossierId(
		long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDossierId(dossierId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByArrayId(
		java.lang.String arrayId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByArrayId(arrayId);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByCodeNumberAndRegisteredNumber(
		long codeNumber, java.lang.String registeredNumber) {
		return getService()
				   .findByCodeNumberAndRegisteredNumber(codeNumber,
			registeredNumber);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByCodeNumberAndDossierId(
		long codeNumber, long dossierId) {
		return getService().findByCodeNumberAndDossierId(codeNumber, dossierId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByConfirmedInspectionIdAndBienBanKiemTra(
		long confirmedInspectionId) {
		return getService()
				   .findByConfirmedInspectionIdAndBienBanKiemTra(confirmedInspectionId);
	}

	public static int countByInspectionRecordId(long inspectionRecordId) {
		return getService().countByInspectionRecordId(inspectionRecordId);
	}

	public static long countByConfirmedInspectionIdAndInspectionRecordId(
		long confirmedInspectionId) {
		return getService()
				   .countByConfirmedInspectionIdAndInspectionRecordId(confirmedInspectionId);
	}

	public static long countByConfirmedInspectionIdAndMarkUpStatus(
		long confirmedInspectionId) {
		return getService()
				   .countByConfirmedInspectionIdAndMarkUpStatus(confirmedInspectionId);
	}

	public static int countByConfirmedInspectionId(long confirmedInspectionId) {
		return getService().countByConfirmedInspectionId(confirmedInspectionId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByInspectionRecordNumber(
		java.lang.String inspectionRecordNumber) {
		return getService().findByInspectionRecordNumber(inspectionRecordNumber);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDebitNoteId(
		long debitNoteId) {
		return getService().findByDebitNoteId(debitNoteId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDebitNoteid(
		long debitNoteid) {
		return getService().findByDebitNoteid(debitNoteid);
	}

	public static long checkConfirmedInspection(long registeredinspectionid,
		java.lang.String technicalspeccode) {
		return getService()
				   .checkConfirmedInspection(registeredinspectionid,
			technicalspeccode);
	}

	public static long checkHoanKiemTra(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber) {
		return getService()
				   .checkHoanKiemTra(codeNumber, chassisNumber, engineNumber);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord getVehicleRecord(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber) {
		return getService()
				   .getVehicleRecord(codeNumber, chassisNumber, engineNumber);
	}

	public static long checkHoanKiemTraDoDaLapBienBanKiemTra(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber,
		long hoSoThuTucId) {
		return getService()
				   .checkHoanKiemTraDoDaLapBienBanKiemTra(codeNumber,
			chassisNumber, engineNumber, hoSoThuTucId);
	}

	public static long checkChuaPhanCongDonViKiemTra(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber,
		long hoSoThuTucId) {
		return getService()
				   .checkChuaPhanCongDonViKiemTra(codeNumber, chassisNumber,
			engineNumber, hoSoThuTucId);
	}

	public static long checkDaPhanCongDonViKiemTra(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber) {
		return getService()
				   .checkDaPhanCongDonViKiemTra(codeNumber, chassisNumber,
			engineNumber);
	}

	public static boolean updateVehicleRecordWithConfirmInspection(
		long confirmInspectionId) {
		return getService()
				   .updateVehicleRecordWithConfirmInspection(confirmInspectionId);
	}

	public static boolean updateVehicleRecordWithConfirmedInspectionId(
		long confirmedInspectionId) {
		return getService()
				   .updateVehicleRecordWithConfirmedInspectionId(confirmedInspectionId);
	}

	public static boolean updateVehicleRecordWithInspectionId(long inspectionId) {
		return getService().updateVehicleRecordWithInspectionId(inspectionId);
	}

	public static long checkKeHoachKiemTra(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber,
		long hoSoThuTucId) {
		return getService()
				   .checkKeHoachKiemTra(codeNumber, chassisNumber,
			engineNumber, hoSoThuTucId);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByDossierId(
		long dossierId, long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber) {
		return getService()
				   .findByDossierId(dossierId, codeNumber, chassisNumber,
			engineNumber);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> searchVehicleRecord(
		java.lang.String vehicleclass, long trangThaiCuaXe,
		java.lang.String soKhung, java.lang.String soDongCo,
		java.lang.String mauSon, java.lang.String tinhTrangPhuongTien,
		java.lang.String namSanXuat, java.lang.String queryViewTimKiemHS,
		int start, int end) {
		return getService()
				   .searchVehicleRecord(vehicleclass, trangThaiCuaXe, soKhung,
			soDongCo, mauSon, tinhTrangPhuongTien, namSanXuat,
			queryViewTimKiemHS, start, end);
	}

	public static long countSearchVehicleRecord(java.lang.String vehicleclass,
		long trangThaiCuaXe, java.lang.String soKhung,
		java.lang.String soDongCo, java.lang.String mauSon,
		java.lang.String tinhTrangPhuongTien, java.lang.String namSanXuat,
		java.lang.String queryViewTimKiemHS) {
		return getService()
				   .countSearchVehicleRecord(vehicleclass, trangThaiCuaXe,
			soKhung, soDongCo, mauSon, tinhTrangPhuongTien, namSanXuat,
			queryViewTimKiemHS);
	}

	public static long countVehicleRecordWithInspectionId(long inspectionId) {
		return getService().countVehicleRecordWithInspectionId(inspectionId);
	}

	public static long countBySoLuongPT(java.lang.String phieuxulyphuid) {
		return getService().countBySoLuongPT(phieuxulyphuid);
	}

	public static long countBySoNhomPT(java.lang.String phieuxulyphuid) {
		return getService().countBySoNhomPT(phieuxulyphuid);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByConfirmedInspectionIdAndVehicleGroupId(
		java.lang.String confirmedInspectionId,
		java.lang.String lstVehicleGroupId) {
		return getService()
				   .findByConfirmedInspectionIdAndVehicleGroupId(confirmedInspectionId,
			lstVehicleGroupId);
	}

	public static boolean deleteVehicleRecordWithVehicleGroupId(
		long vehicleGroupId) {
		return getService().deleteVehicleRecordWithVehicleGroupId(vehicleGroupId);
	}

	public static long countByIdVehicleGroupAndIdHoSoThuTuc(
		long idVehicleGroup, long idHoSoThuTuc) {
		return getService()
				   .countByIdVehicleGroupAndIdHoSoThuTuc(idVehicleGroup,
			idHoSoThuTuc);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByIdVehicleGroupAndIdHoSoThuTuc(
		long idVehicleGroup, long idHoSoThuTuc) {
		return getService()
				   .findByIdVehicleGroupAndIdHoSoThuTuc(idVehicleGroup,
			idHoSoThuTuc);
	}

	public static long checkKyDuyetChungChi(long verhicleGroupId) {
		return getService().checkKyDuyetChungChi(verhicleGroupId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findVehicleRecordByDebitNoteIdGroupbyCertificateRecord(
		long debitNoteid) {
		return getService()
				   .findVehicleRecordByDebitNoteIdGroupbyCertificateRecord(debitNoteid);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord getByCN_CHN_EN(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByCN_CHN_EN(codeNumber, chassisNumber, engineNumber);
	}

	public static void clearService() {
		_service = null;
	}

	public static VehicleRecordLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					VehicleRecordLocalService.class.getName());

			if (invokableLocalService instanceof VehicleRecordLocalService) {
				_service = (VehicleRecordLocalService)invokableLocalService;
			}
			else {
				_service = new VehicleRecordLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(VehicleRecordLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(VehicleRecordLocalService service) {
	}

	private static VehicleRecordLocalService _service;
}