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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for VehicleRecord. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author huymq
 * @see VehicleRecordLocalServiceUtil
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.VehicleRecordLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.impl.VehicleRecordLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VehicleRecordLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VehicleRecordLocalServiceUtil} to access the vehicle record local service. Add custom service methods to {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.VehicleRecordLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the vehicle record to the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleRecord the vehicle record
	* @return the vehicle record that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord addVehicleRecord(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord vehicleRecord)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new vehicle record with the primary key. Does not add the vehicle record to the database.
	*
	* @param id the primary key for the new vehicle record
	* @return the new vehicle record
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord createVehicleRecord(
		long id);

	/**
	* Deletes the vehicle record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vehicle record
	* @return the vehicle record that was removed
	* @throws PortalException if a vehicle record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord deleteVehicleRecord(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the vehicle record from the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleRecord the vehicle record
	* @return the vehicle record that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord deleteVehicleRecord(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord vehicleRecord)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchVehicleRecord(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle record with the primary key.
	*
	* @param id the primary key of the vehicle record
	* @return the vehicle record
	* @throws PortalException if a vehicle record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord getVehicleRecord(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> getVehicleRecords(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicle records.
	*
	* @return the number of vehicle records
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVehicleRecordsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the vehicle record in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vehicleRecord the vehicle record
	* @return the vehicle record that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord updateVehicleRecord(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord vehicleRecord)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByCodeNumber(
		long codeNumber);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByCertificateRecordId(
		long certificateRecordId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByConfirmedInspectionId(
		long confirmedInspectionId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDraftCertificateId(
		long draftCertificateId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findVehicleRecordHasSafetestrequirement(
		java.lang.String inspectionRecordId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findVehicleRecordHasEmissiontestrequirement(
		java.lang.String inspectionRecordId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findVehicleRecordHasControlrequirement(
		java.lang.String inspectionRecordId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findVehicleRecordByPhieuXuLyPhuId(
		long phieuXuLyPhuId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDossierId(
		long dossierId, long codeNumber);

	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup findVehicleGroupByInspectionRecordId(
		long inspectionRecordId);

	public int countVehicleRecord(long inspectionRecordId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByInspectionRecordIdOrderbyAsc(
		long inspectionRecordId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByInspectionRecordId(
		long inspectionRecordId);

	public long tongChungChiDaCap(long vehiclegroupId);

	public long tongDuThaoChungChi(long vehiclegroupId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByVehicleGroupId(
		long vehicleGroupId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDossierId(
		long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByArrayId(
		java.lang.String arrayId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByCodeNumberAndRegisteredNumber(
		long codeNumber, java.lang.String registeredNumber);

	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByCodeNumberAndDossierId(
		long codeNumber, long dossierId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByConfirmedInspectionIdAndBienBanKiemTra(
		long confirmedInspectionId);

	public int countByInspectionRecordId(long inspectionRecordId);

	public long countByConfirmedInspectionIdAndInspectionRecordId(
		long confirmedInspectionId);

	public long countByConfirmedInspectionIdAndMarkUpStatus(
		long confirmedInspectionId);

	public int countByConfirmedInspectionId(long confirmedInspectionId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByInspectionRecordNumber(
		java.lang.String inspectionRecordNumber);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDebitNoteId(
		long debitNoteId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDebitNoteid(
		long debitNoteid);

	public long checkConfirmedInspection(long registeredinspectionid,
		java.lang.String technicalspeccode);

	public long checkHoanKiemTra(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord getVehicleRecord(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber);

	public long checkHoanKiemTraDoDaLapBienBanKiemTra(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber,
		long hoSoThuTucId);

	public long checkChuaPhanCongDonViKiemTra(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber,
		long hoSoThuTucId);

	public long checkDaPhanCongDonViKiemTra(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber);

	public boolean updateVehicleRecordWithConfirmInspection(
		long confirmInspectionId);

	public boolean updateVehicleRecordWithConfirmedInspectionId(
		long confirmedInspectionId);

	public boolean updateVehicleRecordWithInspectionId(long inspectionId);

	public long checkKeHoachKiemTra(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber,
		long hoSoThuTucId);

	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByDossierId(
		long dossierId, long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> searchVehicleRecord(
		java.lang.String vehicleclass, long trangThaiCuaXe,
		java.lang.String soKhung, java.lang.String soDongCo,
		java.lang.String mauSon, java.lang.String tinhTrangPhuongTien,
		java.lang.String namSanXuat, java.lang.String queryViewTimKiemHS,
		int start, int end);

	public long countSearchVehicleRecord(java.lang.String vehicleclass,
		long trangThaiCuaXe, java.lang.String soKhung,
		java.lang.String soDongCo, java.lang.String mauSon,
		java.lang.String tinhTrangPhuongTien, java.lang.String namSanXuat,
		java.lang.String queryViewTimKiemHS);

	public long countVehicleRecordWithInspectionId(long inspectionId);

	public long countBySoLuongPT(java.lang.String phieuxulyphuid);

	public long countBySoNhomPT(java.lang.String phieuxulyphuid);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByConfirmedInspectionIdAndVehicleGroupId(
		java.lang.String confirmedInspectionId,
		java.lang.String lstVehicleGroupId);

	public boolean deleteVehicleRecordWithVehicleGroupId(long vehicleGroupId);

	public long countByIdVehicleGroupAndIdHoSoThuTuc(long idVehicleGroup,
		long idHoSoThuTuc);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByIdVehicleGroupAndIdHoSoThuTuc(
		long idVehicleGroup, long idHoSoThuTuc);

	public long checkKyDuyetChungChi(long verhicleGroupId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findVehicleRecordByDebitNoteIdGroupbyCertificateRecord(
		long debitNoteid);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord getByCN_CHN_EN(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}