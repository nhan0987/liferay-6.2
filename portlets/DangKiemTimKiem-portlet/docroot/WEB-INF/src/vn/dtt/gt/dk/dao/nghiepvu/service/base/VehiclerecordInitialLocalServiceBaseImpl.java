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

package vn.dtt.gt.dk.dao.nghiepvu.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalService;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CertificateCircularPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CertificateRecordPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CertificateRecordSpecPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CfgTechnicalspecPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ConfirmedInspectionPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ControlReportPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ControlRequestPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ControlRequirementPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CopReportPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CorporationAttendeePersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CorporationInspectorPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CorporationTeamPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CorporationViewPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CustomsDeclarationPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.DebitNoteDetailsPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.DebitNotePersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.DraftCertificatePersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.DraftCertificateSpecPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.EmissionTestReportPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.EmissionTestRequestPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.EmissionTestRequirementPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ExchangeRatePersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.InspectionCommonStatusPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.InspectionRecordAttachPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.InspectionRecordPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.InspectionRecordSpecPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.PaymentStatusPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ProductionCountryPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.RegisteredInspectionPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.SafetestRequirementPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.SafetyTestReportPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.SafetyTestRequestPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.SatetyTestReportSpecPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehicleGroupInitialPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehicleGroupPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehicleGroupSpecPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehicleRecordPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehicleSpecificationPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehicleStatisticsPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehiclerecordInitialPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ViewDangKiemTimKiemFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ViewDangKiemTimKiemPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ViewTrungSoKhungDongCoPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the vehiclerecord initial local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.VehiclerecordInitialLocalServiceImpl}.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.impl.VehiclerecordInitialLocalServiceImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalServiceUtil
 * @generated
 */
public abstract class VehiclerecordInitialLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements VehiclerecordInitialLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalServiceUtil} to access the vehiclerecord initial local service.
	 */

	/**
	 * Adds the vehiclerecord initial to the database. Also notifies the appropriate model listeners.
	 *
	 * @param vehiclerecordInitial the vehiclerecord initial
	 * @return the vehiclerecord initial that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public VehiclerecordInitial addVehiclerecordInitial(
		VehiclerecordInitial vehiclerecordInitial) throws SystemException {
		vehiclerecordInitial.setNew(true);

		return vehiclerecordInitialPersistence.update(vehiclerecordInitial);
	}

	/**
	 * Creates a new vehiclerecord initial with the primary key. Does not add the vehiclerecord initial to the database.
	 *
	 * @param id the primary key for the new vehiclerecord initial
	 * @return the new vehiclerecord initial
	 */
	@Override
	public VehiclerecordInitial createVehiclerecordInitial(long id) {
		return vehiclerecordInitialPersistence.create(id);
	}

	/**
	 * Deletes the vehiclerecord initial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vehiclerecord initial
	 * @return the vehiclerecord initial that was removed
	 * @throws PortalException if a vehiclerecord initial with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public VehiclerecordInitial deleteVehiclerecordInitial(long id)
		throws PortalException, SystemException {
		return vehiclerecordInitialPersistence.remove(id);
	}

	/**
	 * Deletes the vehiclerecord initial from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vehiclerecordInitial the vehiclerecord initial
	 * @return the vehiclerecord initial that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public VehiclerecordInitial deleteVehiclerecordInitial(
		VehiclerecordInitial vehiclerecordInitial) throws SystemException {
		return vehiclerecordInitialPersistence.remove(vehiclerecordInitial);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(VehiclerecordInitial.class,
			clazz.getClassLoader());
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
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return vehiclerecordInitialPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehiclerecordInitialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return vehiclerecordInitialPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehiclerecordInitialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return vehiclerecordInitialPersistence.findWithDynamicQuery(dynamicQuery,
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return vehiclerecordInitialPersistence.countWithDynamicQuery(dynamicQuery);
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return vehiclerecordInitialPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public VehiclerecordInitial fetchVehiclerecordInitial(long id)
		throws SystemException {
		return vehiclerecordInitialPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the vehiclerecord initial with the primary key.
	 *
	 * @param id the primary key of the vehiclerecord initial
	 * @return the vehiclerecord initial
	 * @throws PortalException if a vehiclerecord initial with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehiclerecordInitial getVehiclerecordInitial(long id)
		throws PortalException, SystemException {
		return vehiclerecordInitialPersistence.findByPrimaryKey(id);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return vehiclerecordInitialPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the vehiclerecord initials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehiclerecordInitialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehiclerecord initials
	 * @param end the upper bound of the range of vehiclerecord initials (not inclusive)
	 * @return the range of vehiclerecord initials
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehiclerecordInitial> getVehiclerecordInitials(int start,
		int end) throws SystemException {
		return vehiclerecordInitialPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of vehiclerecord initials.
	 *
	 * @return the number of vehiclerecord initials
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getVehiclerecordInitialsCount() throws SystemException {
		return vehiclerecordInitialPersistence.countAll();
	}

	/**
	 * Updates the vehiclerecord initial in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param vehiclerecordInitial the vehiclerecord initial
	 * @return the vehiclerecord initial that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public VehiclerecordInitial updateVehiclerecordInitial(
		VehiclerecordInitial vehiclerecordInitial) throws SystemException {
		return vehiclerecordInitialPersistence.update(vehiclerecordInitial);
	}

	/**
	 * Returns the certificate circular local service.
	 *
	 * @return the certificate circular local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CertificateCircularLocalService getCertificateCircularLocalService() {
		return certificateCircularLocalService;
	}

	/**
	 * Sets the certificate circular local service.
	 *
	 * @param certificateCircularLocalService the certificate circular local service
	 */
	public void setCertificateCircularLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CertificateCircularLocalService certificateCircularLocalService) {
		this.certificateCircularLocalService = certificateCircularLocalService;
	}

	/**
	 * Returns the certificate circular remote service.
	 *
	 * @return the certificate circular remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CertificateCircularService getCertificateCircularService() {
		return certificateCircularService;
	}

	/**
	 * Sets the certificate circular remote service.
	 *
	 * @param certificateCircularService the certificate circular remote service
	 */
	public void setCertificateCircularService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CertificateCircularService certificateCircularService) {
		this.certificateCircularService = certificateCircularService;
	}

	/**
	 * Returns the certificate circular persistence.
	 *
	 * @return the certificate circular persistence
	 */
	public CertificateCircularPersistence getCertificateCircularPersistence() {
		return certificateCircularPersistence;
	}

	/**
	 * Sets the certificate circular persistence.
	 *
	 * @param certificateCircularPersistence the certificate circular persistence
	 */
	public void setCertificateCircularPersistence(
		CertificateCircularPersistence certificateCircularPersistence) {
		this.certificateCircularPersistence = certificateCircularPersistence;
	}

	/**
	 * Returns the certificate record local service.
	 *
	 * @return the certificate record local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalService getCertificateRecordLocalService() {
		return certificateRecordLocalService;
	}

	/**
	 * Sets the certificate record local service.
	 *
	 * @param certificateRecordLocalService the certificate record local service
	 */
	public void setCertificateRecordLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalService certificateRecordLocalService) {
		this.certificateRecordLocalService = certificateRecordLocalService;
	}

	/**
	 * Returns the certificate record remote service.
	 *
	 * @return the certificate record remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordService getCertificateRecordService() {
		return certificateRecordService;
	}

	/**
	 * Sets the certificate record remote service.
	 *
	 * @param certificateRecordService the certificate record remote service
	 */
	public void setCertificateRecordService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordService certificateRecordService) {
		this.certificateRecordService = certificateRecordService;
	}

	/**
	 * Returns the certificate record persistence.
	 *
	 * @return the certificate record persistence
	 */
	public CertificateRecordPersistence getCertificateRecordPersistence() {
		return certificateRecordPersistence;
	}

	/**
	 * Sets the certificate record persistence.
	 *
	 * @param certificateRecordPersistence the certificate record persistence
	 */
	public void setCertificateRecordPersistence(
		CertificateRecordPersistence certificateRecordPersistence) {
		this.certificateRecordPersistence = certificateRecordPersistence;
	}

	/**
	 * Returns the certificate record spec local service.
	 *
	 * @return the certificate record spec local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecLocalService getCertificateRecordSpecLocalService() {
		return certificateRecordSpecLocalService;
	}

	/**
	 * Sets the certificate record spec local service.
	 *
	 * @param certificateRecordSpecLocalService the certificate record spec local service
	 */
	public void setCertificateRecordSpecLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecLocalService certificateRecordSpecLocalService) {
		this.certificateRecordSpecLocalService = certificateRecordSpecLocalService;
	}

	/**
	 * Returns the certificate record spec remote service.
	 *
	 * @return the certificate record spec remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecService getCertificateRecordSpecService() {
		return certificateRecordSpecService;
	}

	/**
	 * Sets the certificate record spec remote service.
	 *
	 * @param certificateRecordSpecService the certificate record spec remote service
	 */
	public void setCertificateRecordSpecService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecService certificateRecordSpecService) {
		this.certificateRecordSpecService = certificateRecordSpecService;
	}

	/**
	 * Returns the certificate record spec persistence.
	 *
	 * @return the certificate record spec persistence
	 */
	public CertificateRecordSpecPersistence getCertificateRecordSpecPersistence() {
		return certificateRecordSpecPersistence;
	}

	/**
	 * Sets the certificate record spec persistence.
	 *
	 * @param certificateRecordSpecPersistence the certificate record spec persistence
	 */
	public void setCertificateRecordSpecPersistence(
		CertificateRecordSpecPersistence certificateRecordSpecPersistence) {
		this.certificateRecordSpecPersistence = certificateRecordSpecPersistence;
	}

	/**
	 * Returns the cfg technicalspec local service.
	 *
	 * @return the cfg technicalspec local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecLocalService getCfgTechnicalspecLocalService() {
		return cfgTechnicalspecLocalService;
	}

	/**
	 * Sets the cfg technicalspec local service.
	 *
	 * @param cfgTechnicalspecLocalService the cfg technicalspec local service
	 */
	public void setCfgTechnicalspecLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecLocalService cfgTechnicalspecLocalService) {
		this.cfgTechnicalspecLocalService = cfgTechnicalspecLocalService;
	}

	/**
	 * Returns the cfg technicalspec remote service.
	 *
	 * @return the cfg technicalspec remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecService getCfgTechnicalspecService() {
		return cfgTechnicalspecService;
	}

	/**
	 * Sets the cfg technicalspec remote service.
	 *
	 * @param cfgTechnicalspecService the cfg technicalspec remote service
	 */
	public void setCfgTechnicalspecService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecService cfgTechnicalspecService) {
		this.cfgTechnicalspecService = cfgTechnicalspecService;
	}

	/**
	 * Returns the cfg technicalspec persistence.
	 *
	 * @return the cfg technicalspec persistence
	 */
	public CfgTechnicalspecPersistence getCfgTechnicalspecPersistence() {
		return cfgTechnicalspecPersistence;
	}

	/**
	 * Sets the cfg technicalspec persistence.
	 *
	 * @param cfgTechnicalspecPersistence the cfg technicalspec persistence
	 */
	public void setCfgTechnicalspecPersistence(
		CfgTechnicalspecPersistence cfgTechnicalspecPersistence) {
		this.cfgTechnicalspecPersistence = cfgTechnicalspecPersistence;
	}

	/**
	 * Returns the confirmed inspection local service.
	 *
	 * @return the confirmed inspection local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalService getConfirmedInspectionLocalService() {
		return confirmedInspectionLocalService;
	}

	/**
	 * Sets the confirmed inspection local service.
	 *
	 * @param confirmedInspectionLocalService the confirmed inspection local service
	 */
	public void setConfirmedInspectionLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalService confirmedInspectionLocalService) {
		this.confirmedInspectionLocalService = confirmedInspectionLocalService;
	}

	/**
	 * Returns the confirmed inspection remote service.
	 *
	 * @return the confirmed inspection remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionService getConfirmedInspectionService() {
		return confirmedInspectionService;
	}

	/**
	 * Sets the confirmed inspection remote service.
	 *
	 * @param confirmedInspectionService the confirmed inspection remote service
	 */
	public void setConfirmedInspectionService(
		vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionService confirmedInspectionService) {
		this.confirmedInspectionService = confirmedInspectionService;
	}

	/**
	 * Returns the confirmed inspection persistence.
	 *
	 * @return the confirmed inspection persistence
	 */
	public ConfirmedInspectionPersistence getConfirmedInspectionPersistence() {
		return confirmedInspectionPersistence;
	}

	/**
	 * Sets the confirmed inspection persistence.
	 *
	 * @param confirmedInspectionPersistence the confirmed inspection persistence
	 */
	public void setConfirmedInspectionPersistence(
		ConfirmedInspectionPersistence confirmedInspectionPersistence) {
		this.confirmedInspectionPersistence = confirmedInspectionPersistence;
	}

	/**
	 * Returns the control report local service.
	 *
	 * @return the control report local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.ControlReportLocalService getControlReportLocalService() {
		return controlReportLocalService;
	}

	/**
	 * Sets the control report local service.
	 *
	 * @param controlReportLocalService the control report local service
	 */
	public void setControlReportLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.ControlReportLocalService controlReportLocalService) {
		this.controlReportLocalService = controlReportLocalService;
	}

	/**
	 * Returns the control report remote service.
	 *
	 * @return the control report remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.ControlReportService getControlReportService() {
		return controlReportService;
	}

	/**
	 * Sets the control report remote service.
	 *
	 * @param controlReportService the control report remote service
	 */
	public void setControlReportService(
		vn.dtt.gt.dk.dao.nghiepvu.service.ControlReportService controlReportService) {
		this.controlReportService = controlReportService;
	}

	/**
	 * Returns the control report persistence.
	 *
	 * @return the control report persistence
	 */
	public ControlReportPersistence getControlReportPersistence() {
		return controlReportPersistence;
	}

	/**
	 * Sets the control report persistence.
	 *
	 * @param controlReportPersistence the control report persistence
	 */
	public void setControlReportPersistence(
		ControlReportPersistence controlReportPersistence) {
		this.controlReportPersistence = controlReportPersistence;
	}

	/**
	 * Returns the control request local service.
	 *
	 * @return the control request local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequestLocalService getControlRequestLocalService() {
		return controlRequestLocalService;
	}

	/**
	 * Sets the control request local service.
	 *
	 * @param controlRequestLocalService the control request local service
	 */
	public void setControlRequestLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequestLocalService controlRequestLocalService) {
		this.controlRequestLocalService = controlRequestLocalService;
	}

	/**
	 * Returns the control request remote service.
	 *
	 * @return the control request remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequestService getControlRequestService() {
		return controlRequestService;
	}

	/**
	 * Sets the control request remote service.
	 *
	 * @param controlRequestService the control request remote service
	 */
	public void setControlRequestService(
		vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequestService controlRequestService) {
		this.controlRequestService = controlRequestService;
	}

	/**
	 * Returns the control request persistence.
	 *
	 * @return the control request persistence
	 */
	public ControlRequestPersistence getControlRequestPersistence() {
		return controlRequestPersistence;
	}

	/**
	 * Sets the control request persistence.
	 *
	 * @param controlRequestPersistence the control request persistence
	 */
	public void setControlRequestPersistence(
		ControlRequestPersistence controlRequestPersistence) {
		this.controlRequestPersistence = controlRequestPersistence;
	}

	/**
	 * Returns the control requirement local service.
	 *
	 * @return the control requirement local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequirementLocalService getControlRequirementLocalService() {
		return controlRequirementLocalService;
	}

	/**
	 * Sets the control requirement local service.
	 *
	 * @param controlRequirementLocalService the control requirement local service
	 */
	public void setControlRequirementLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequirementLocalService controlRequirementLocalService) {
		this.controlRequirementLocalService = controlRequirementLocalService;
	}

	/**
	 * Returns the control requirement remote service.
	 *
	 * @return the control requirement remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequirementService getControlRequirementService() {
		return controlRequirementService;
	}

	/**
	 * Sets the control requirement remote service.
	 *
	 * @param controlRequirementService the control requirement remote service
	 */
	public void setControlRequirementService(
		vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequirementService controlRequirementService) {
		this.controlRequirementService = controlRequirementService;
	}

	/**
	 * Returns the control requirement persistence.
	 *
	 * @return the control requirement persistence
	 */
	public ControlRequirementPersistence getControlRequirementPersistence() {
		return controlRequirementPersistence;
	}

	/**
	 * Sets the control requirement persistence.
	 *
	 * @param controlRequirementPersistence the control requirement persistence
	 */
	public void setControlRequirementPersistence(
		ControlRequirementPersistence controlRequirementPersistence) {
		this.controlRequirementPersistence = controlRequirementPersistence;
	}

	/**
	 * Returns the cop report local service.
	 *
	 * @return the cop report local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CopReportLocalService getCopReportLocalService() {
		return copReportLocalService;
	}

	/**
	 * Sets the cop report local service.
	 *
	 * @param copReportLocalService the cop report local service
	 */
	public void setCopReportLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CopReportLocalService copReportLocalService) {
		this.copReportLocalService = copReportLocalService;
	}

	/**
	 * Returns the cop report remote service.
	 *
	 * @return the cop report remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CopReportService getCopReportService() {
		return copReportService;
	}

	/**
	 * Sets the cop report remote service.
	 *
	 * @param copReportService the cop report remote service
	 */
	public void setCopReportService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CopReportService copReportService) {
		this.copReportService = copReportService;
	}

	/**
	 * Returns the cop report persistence.
	 *
	 * @return the cop report persistence
	 */
	public CopReportPersistence getCopReportPersistence() {
		return copReportPersistence;
	}

	/**
	 * Sets the cop report persistence.
	 *
	 * @param copReportPersistence the cop report persistence
	 */
	public void setCopReportPersistence(
		CopReportPersistence copReportPersistence) {
		this.copReportPersistence = copReportPersistence;
	}

	/**
	 * Returns the corporation attendee local service.
	 *
	 * @return the corporation attendee local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CorporationAttendeeLocalService getCorporationAttendeeLocalService() {
		return corporationAttendeeLocalService;
	}

	/**
	 * Sets the corporation attendee local service.
	 *
	 * @param corporationAttendeeLocalService the corporation attendee local service
	 */
	public void setCorporationAttendeeLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CorporationAttendeeLocalService corporationAttendeeLocalService) {
		this.corporationAttendeeLocalService = corporationAttendeeLocalService;
	}

	/**
	 * Returns the corporation attendee remote service.
	 *
	 * @return the corporation attendee remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CorporationAttendeeService getCorporationAttendeeService() {
		return corporationAttendeeService;
	}

	/**
	 * Sets the corporation attendee remote service.
	 *
	 * @param corporationAttendeeService the corporation attendee remote service
	 */
	public void setCorporationAttendeeService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CorporationAttendeeService corporationAttendeeService) {
		this.corporationAttendeeService = corporationAttendeeService;
	}

	/**
	 * Returns the corporation attendee persistence.
	 *
	 * @return the corporation attendee persistence
	 */
	public CorporationAttendeePersistence getCorporationAttendeePersistence() {
		return corporationAttendeePersistence;
	}

	/**
	 * Sets the corporation attendee persistence.
	 *
	 * @param corporationAttendeePersistence the corporation attendee persistence
	 */
	public void setCorporationAttendeePersistence(
		CorporationAttendeePersistence corporationAttendeePersistence) {
		this.corporationAttendeePersistence = corporationAttendeePersistence;
	}

	/**
	 * Returns the corporation inspector local service.
	 *
	 * @return the corporation inspector local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalService getCorporationInspectorLocalService() {
		return corporationInspectorLocalService;
	}

	/**
	 * Sets the corporation inspector local service.
	 *
	 * @param corporationInspectorLocalService the corporation inspector local service
	 */
	public void setCorporationInspectorLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalService corporationInspectorLocalService) {
		this.corporationInspectorLocalService = corporationInspectorLocalService;
	}

	/**
	 * Returns the corporation inspector remote service.
	 *
	 * @return the corporation inspector remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorService getCorporationInspectorService() {
		return corporationInspectorService;
	}

	/**
	 * Sets the corporation inspector remote service.
	 *
	 * @param corporationInspectorService the corporation inspector remote service
	 */
	public void setCorporationInspectorService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorService corporationInspectorService) {
		this.corporationInspectorService = corporationInspectorService;
	}

	/**
	 * Returns the corporation inspector persistence.
	 *
	 * @return the corporation inspector persistence
	 */
	public CorporationInspectorPersistence getCorporationInspectorPersistence() {
		return corporationInspectorPersistence;
	}

	/**
	 * Sets the corporation inspector persistence.
	 *
	 * @param corporationInspectorPersistence the corporation inspector persistence
	 */
	public void setCorporationInspectorPersistence(
		CorporationInspectorPersistence corporationInspectorPersistence) {
		this.corporationInspectorPersistence = corporationInspectorPersistence;
	}

	/**
	 * Returns the corporation team local service.
	 *
	 * @return the corporation team local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalService getCorporationTeamLocalService() {
		return corporationTeamLocalService;
	}

	/**
	 * Sets the corporation team local service.
	 *
	 * @param corporationTeamLocalService the corporation team local service
	 */
	public void setCorporationTeamLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalService corporationTeamLocalService) {
		this.corporationTeamLocalService = corporationTeamLocalService;
	}

	/**
	 * Returns the corporation team remote service.
	 *
	 * @return the corporation team remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamService getCorporationTeamService() {
		return corporationTeamService;
	}

	/**
	 * Sets the corporation team remote service.
	 *
	 * @param corporationTeamService the corporation team remote service
	 */
	public void setCorporationTeamService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamService corporationTeamService) {
		this.corporationTeamService = corporationTeamService;
	}

	/**
	 * Returns the corporation team persistence.
	 *
	 * @return the corporation team persistence
	 */
	public CorporationTeamPersistence getCorporationTeamPersistence() {
		return corporationTeamPersistence;
	}

	/**
	 * Sets the corporation team persistence.
	 *
	 * @param corporationTeamPersistence the corporation team persistence
	 */
	public void setCorporationTeamPersistence(
		CorporationTeamPersistence corporationTeamPersistence) {
		this.corporationTeamPersistence = corporationTeamPersistence;
	}

	/**
	 * Returns the corporation view local service.
	 *
	 * @return the corporation view local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewLocalService getCorporationViewLocalService() {
		return corporationViewLocalService;
	}

	/**
	 * Sets the corporation view local service.
	 *
	 * @param corporationViewLocalService the corporation view local service
	 */
	public void setCorporationViewLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewLocalService corporationViewLocalService) {
		this.corporationViewLocalService = corporationViewLocalService;
	}

	/**
	 * Returns the corporation view remote service.
	 *
	 * @return the corporation view remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewService getCorporationViewService() {
		return corporationViewService;
	}

	/**
	 * Sets the corporation view remote service.
	 *
	 * @param corporationViewService the corporation view remote service
	 */
	public void setCorporationViewService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewService corporationViewService) {
		this.corporationViewService = corporationViewService;
	}

	/**
	 * Returns the corporation view persistence.
	 *
	 * @return the corporation view persistence
	 */
	public CorporationViewPersistence getCorporationViewPersistence() {
		return corporationViewPersistence;
	}

	/**
	 * Sets the corporation view persistence.
	 *
	 * @param corporationViewPersistence the corporation view persistence
	 */
	public void setCorporationViewPersistence(
		CorporationViewPersistence corporationViewPersistence) {
		this.corporationViewPersistence = corporationViewPersistence;
	}

	/**
	 * Returns the customs declaration local service.
	 *
	 * @return the customs declaration local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationLocalService getCustomsDeclarationLocalService() {
		return customsDeclarationLocalService;
	}

	/**
	 * Sets the customs declaration local service.
	 *
	 * @param customsDeclarationLocalService the customs declaration local service
	 */
	public void setCustomsDeclarationLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationLocalService customsDeclarationLocalService) {
		this.customsDeclarationLocalService = customsDeclarationLocalService;
	}

	/**
	 * Returns the customs declaration remote service.
	 *
	 * @return the customs declaration remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationService getCustomsDeclarationService() {
		return customsDeclarationService;
	}

	/**
	 * Sets the customs declaration remote service.
	 *
	 * @param customsDeclarationService the customs declaration remote service
	 */
	public void setCustomsDeclarationService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationService customsDeclarationService) {
		this.customsDeclarationService = customsDeclarationService;
	}

	/**
	 * Returns the customs declaration persistence.
	 *
	 * @return the customs declaration persistence
	 */
	public CustomsDeclarationPersistence getCustomsDeclarationPersistence() {
		return customsDeclarationPersistence;
	}

	/**
	 * Sets the customs declaration persistence.
	 *
	 * @param customsDeclarationPersistence the customs declaration persistence
	 */
	public void setCustomsDeclarationPersistence(
		CustomsDeclarationPersistence customsDeclarationPersistence) {
		this.customsDeclarationPersistence = customsDeclarationPersistence;
	}

	/**
	 * Returns the debit note local service.
	 *
	 * @return the debit note local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalService getDebitNoteLocalService() {
		return debitNoteLocalService;
	}

	/**
	 * Sets the debit note local service.
	 *
	 * @param debitNoteLocalService the debit note local service
	 */
	public void setDebitNoteLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalService debitNoteLocalService) {
		this.debitNoteLocalService = debitNoteLocalService;
	}

	/**
	 * Returns the debit note remote service.
	 *
	 * @return the debit note remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteService getDebitNoteService() {
		return debitNoteService;
	}

	/**
	 * Sets the debit note remote service.
	 *
	 * @param debitNoteService the debit note remote service
	 */
	public void setDebitNoteService(
		vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteService debitNoteService) {
		this.debitNoteService = debitNoteService;
	}

	/**
	 * Returns the debit note persistence.
	 *
	 * @return the debit note persistence
	 */
	public DebitNotePersistence getDebitNotePersistence() {
		return debitNotePersistence;
	}

	/**
	 * Sets the debit note persistence.
	 *
	 * @param debitNotePersistence the debit note persistence
	 */
	public void setDebitNotePersistence(
		DebitNotePersistence debitNotePersistence) {
		this.debitNotePersistence = debitNotePersistence;
	}

	/**
	 * Returns the debit note details local service.
	 *
	 * @return the debit note details local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsLocalService getDebitNoteDetailsLocalService() {
		return debitNoteDetailsLocalService;
	}

	/**
	 * Sets the debit note details local service.
	 *
	 * @param debitNoteDetailsLocalService the debit note details local service
	 */
	public void setDebitNoteDetailsLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsLocalService debitNoteDetailsLocalService) {
		this.debitNoteDetailsLocalService = debitNoteDetailsLocalService;
	}

	/**
	 * Returns the debit note details remote service.
	 *
	 * @return the debit note details remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsService getDebitNoteDetailsService() {
		return debitNoteDetailsService;
	}

	/**
	 * Sets the debit note details remote service.
	 *
	 * @param debitNoteDetailsService the debit note details remote service
	 */
	public void setDebitNoteDetailsService(
		vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsService debitNoteDetailsService) {
		this.debitNoteDetailsService = debitNoteDetailsService;
	}

	/**
	 * Returns the debit note details persistence.
	 *
	 * @return the debit note details persistence
	 */
	public DebitNoteDetailsPersistence getDebitNoteDetailsPersistence() {
		return debitNoteDetailsPersistence;
	}

	/**
	 * Sets the debit note details persistence.
	 *
	 * @param debitNoteDetailsPersistence the debit note details persistence
	 */
	public void setDebitNoteDetailsPersistence(
		DebitNoteDetailsPersistence debitNoteDetailsPersistence) {
		this.debitNoteDetailsPersistence = debitNoteDetailsPersistence;
	}

	/**
	 * Returns the draft certificate local service.
	 *
	 * @return the draft certificate local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateLocalService getDraftCertificateLocalService() {
		return draftCertificateLocalService;
	}

	/**
	 * Sets the draft certificate local service.
	 *
	 * @param draftCertificateLocalService the draft certificate local service
	 */
	public void setDraftCertificateLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateLocalService draftCertificateLocalService) {
		this.draftCertificateLocalService = draftCertificateLocalService;
	}

	/**
	 * Returns the draft certificate remote service.
	 *
	 * @return the draft certificate remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateService getDraftCertificateService() {
		return draftCertificateService;
	}

	/**
	 * Sets the draft certificate remote service.
	 *
	 * @param draftCertificateService the draft certificate remote service
	 */
	public void setDraftCertificateService(
		vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateService draftCertificateService) {
		this.draftCertificateService = draftCertificateService;
	}

	/**
	 * Returns the draft certificate persistence.
	 *
	 * @return the draft certificate persistence
	 */
	public DraftCertificatePersistence getDraftCertificatePersistence() {
		return draftCertificatePersistence;
	}

	/**
	 * Sets the draft certificate persistence.
	 *
	 * @param draftCertificatePersistence the draft certificate persistence
	 */
	public void setDraftCertificatePersistence(
		DraftCertificatePersistence draftCertificatePersistence) {
		this.draftCertificatePersistence = draftCertificatePersistence;
	}

	/**
	 * Returns the draft certificate spec local service.
	 *
	 * @return the draft certificate spec local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateSpecLocalService getDraftCertificateSpecLocalService() {
		return draftCertificateSpecLocalService;
	}

	/**
	 * Sets the draft certificate spec local service.
	 *
	 * @param draftCertificateSpecLocalService the draft certificate spec local service
	 */
	public void setDraftCertificateSpecLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateSpecLocalService draftCertificateSpecLocalService) {
		this.draftCertificateSpecLocalService = draftCertificateSpecLocalService;
	}

	/**
	 * Returns the draft certificate spec remote service.
	 *
	 * @return the draft certificate spec remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateSpecService getDraftCertificateSpecService() {
		return draftCertificateSpecService;
	}

	/**
	 * Sets the draft certificate spec remote service.
	 *
	 * @param draftCertificateSpecService the draft certificate spec remote service
	 */
	public void setDraftCertificateSpecService(
		vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateSpecService draftCertificateSpecService) {
		this.draftCertificateSpecService = draftCertificateSpecService;
	}

	/**
	 * Returns the draft certificate spec persistence.
	 *
	 * @return the draft certificate spec persistence
	 */
	public DraftCertificateSpecPersistence getDraftCertificateSpecPersistence() {
		return draftCertificateSpecPersistence;
	}

	/**
	 * Sets the draft certificate spec persistence.
	 *
	 * @param draftCertificateSpecPersistence the draft certificate spec persistence
	 */
	public void setDraftCertificateSpecPersistence(
		DraftCertificateSpecPersistence draftCertificateSpecPersistence) {
		this.draftCertificateSpecPersistence = draftCertificateSpecPersistence;
	}

	/**
	 * Returns the emission test report local service.
	 *
	 * @return the emission test report local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestReportLocalService getEmissionTestReportLocalService() {
		return emissionTestReportLocalService;
	}

	/**
	 * Sets the emission test report local service.
	 *
	 * @param emissionTestReportLocalService the emission test report local service
	 */
	public void setEmissionTestReportLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestReportLocalService emissionTestReportLocalService) {
		this.emissionTestReportLocalService = emissionTestReportLocalService;
	}

	/**
	 * Returns the emission test report remote service.
	 *
	 * @return the emission test report remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestReportService getEmissionTestReportService() {
		return emissionTestReportService;
	}

	/**
	 * Sets the emission test report remote service.
	 *
	 * @param emissionTestReportService the emission test report remote service
	 */
	public void setEmissionTestReportService(
		vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestReportService emissionTestReportService) {
		this.emissionTestReportService = emissionTestReportService;
	}

	/**
	 * Returns the emission test report persistence.
	 *
	 * @return the emission test report persistence
	 */
	public EmissionTestReportPersistence getEmissionTestReportPersistence() {
		return emissionTestReportPersistence;
	}

	/**
	 * Sets the emission test report persistence.
	 *
	 * @param emissionTestReportPersistence the emission test report persistence
	 */
	public void setEmissionTestReportPersistence(
		EmissionTestReportPersistence emissionTestReportPersistence) {
		this.emissionTestReportPersistence = emissionTestReportPersistence;
	}

	/**
	 * Returns the emission test request local service.
	 *
	 * @return the emission test request local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequestLocalService getEmissionTestRequestLocalService() {
		return emissionTestRequestLocalService;
	}

	/**
	 * Sets the emission test request local service.
	 *
	 * @param emissionTestRequestLocalService the emission test request local service
	 */
	public void setEmissionTestRequestLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequestLocalService emissionTestRequestLocalService) {
		this.emissionTestRequestLocalService = emissionTestRequestLocalService;
	}

	/**
	 * Returns the emission test request remote service.
	 *
	 * @return the emission test request remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequestService getEmissionTestRequestService() {
		return emissionTestRequestService;
	}

	/**
	 * Sets the emission test request remote service.
	 *
	 * @param emissionTestRequestService the emission test request remote service
	 */
	public void setEmissionTestRequestService(
		vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequestService emissionTestRequestService) {
		this.emissionTestRequestService = emissionTestRequestService;
	}

	/**
	 * Returns the emission test request persistence.
	 *
	 * @return the emission test request persistence
	 */
	public EmissionTestRequestPersistence getEmissionTestRequestPersistence() {
		return emissionTestRequestPersistence;
	}

	/**
	 * Sets the emission test request persistence.
	 *
	 * @param emissionTestRequestPersistence the emission test request persistence
	 */
	public void setEmissionTestRequestPersistence(
		EmissionTestRequestPersistence emissionTestRequestPersistence) {
		this.emissionTestRequestPersistence = emissionTestRequestPersistence;
	}

	/**
	 * Returns the emission test requirement local service.
	 *
	 * @return the emission test requirement local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequirementLocalService getEmissionTestRequirementLocalService() {
		return emissionTestRequirementLocalService;
	}

	/**
	 * Sets the emission test requirement local service.
	 *
	 * @param emissionTestRequirementLocalService the emission test requirement local service
	 */
	public void setEmissionTestRequirementLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequirementLocalService emissionTestRequirementLocalService) {
		this.emissionTestRequirementLocalService = emissionTestRequirementLocalService;
	}

	/**
	 * Returns the emission test requirement remote service.
	 *
	 * @return the emission test requirement remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequirementService getEmissionTestRequirementService() {
		return emissionTestRequirementService;
	}

	/**
	 * Sets the emission test requirement remote service.
	 *
	 * @param emissionTestRequirementService the emission test requirement remote service
	 */
	public void setEmissionTestRequirementService(
		vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequirementService emissionTestRequirementService) {
		this.emissionTestRequirementService = emissionTestRequirementService;
	}

	/**
	 * Returns the emission test requirement persistence.
	 *
	 * @return the emission test requirement persistence
	 */
	public EmissionTestRequirementPersistence getEmissionTestRequirementPersistence() {
		return emissionTestRequirementPersistence;
	}

	/**
	 * Sets the emission test requirement persistence.
	 *
	 * @param emissionTestRequirementPersistence the emission test requirement persistence
	 */
	public void setEmissionTestRequirementPersistence(
		EmissionTestRequirementPersistence emissionTestRequirementPersistence) {
		this.emissionTestRequirementPersistence = emissionTestRequirementPersistence;
	}

	/**
	 * Returns the exchange rate local service.
	 *
	 * @return the exchange rate local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.ExchangeRateLocalService getExchangeRateLocalService() {
		return exchangeRateLocalService;
	}

	/**
	 * Sets the exchange rate local service.
	 *
	 * @param exchangeRateLocalService the exchange rate local service
	 */
	public void setExchangeRateLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.ExchangeRateLocalService exchangeRateLocalService) {
		this.exchangeRateLocalService = exchangeRateLocalService;
	}

	/**
	 * Returns the exchange rate remote service.
	 *
	 * @return the exchange rate remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.ExchangeRateService getExchangeRateService() {
		return exchangeRateService;
	}

	/**
	 * Sets the exchange rate remote service.
	 *
	 * @param exchangeRateService the exchange rate remote service
	 */
	public void setExchangeRateService(
		vn.dtt.gt.dk.dao.nghiepvu.service.ExchangeRateService exchangeRateService) {
		this.exchangeRateService = exchangeRateService;
	}

	/**
	 * Returns the exchange rate persistence.
	 *
	 * @return the exchange rate persistence
	 */
	public ExchangeRatePersistence getExchangeRatePersistence() {
		return exchangeRatePersistence;
	}

	/**
	 * Sets the exchange rate persistence.
	 *
	 * @param exchangeRatePersistence the exchange rate persistence
	 */
	public void setExchangeRatePersistence(
		ExchangeRatePersistence exchangeRatePersistence) {
		this.exchangeRatePersistence = exchangeRatePersistence;
	}

	/**
	 * Returns the inspection common status local service.
	 *
	 * @return the inspection common status local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusLocalService getInspectionCommonStatusLocalService() {
		return inspectionCommonStatusLocalService;
	}

	/**
	 * Sets the inspection common status local service.
	 *
	 * @param inspectionCommonStatusLocalService the inspection common status local service
	 */
	public void setInspectionCommonStatusLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusLocalService inspectionCommonStatusLocalService) {
		this.inspectionCommonStatusLocalService = inspectionCommonStatusLocalService;
	}

	/**
	 * Returns the inspection common status remote service.
	 *
	 * @return the inspection common status remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusService getInspectionCommonStatusService() {
		return inspectionCommonStatusService;
	}

	/**
	 * Sets the inspection common status remote service.
	 *
	 * @param inspectionCommonStatusService the inspection common status remote service
	 */
	public void setInspectionCommonStatusService(
		vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusService inspectionCommonStatusService) {
		this.inspectionCommonStatusService = inspectionCommonStatusService;
	}

	/**
	 * Returns the inspection common status persistence.
	 *
	 * @return the inspection common status persistence
	 */
	public InspectionCommonStatusPersistence getInspectionCommonStatusPersistence() {
		return inspectionCommonStatusPersistence;
	}

	/**
	 * Sets the inspection common status persistence.
	 *
	 * @param inspectionCommonStatusPersistence the inspection common status persistence
	 */
	public void setInspectionCommonStatusPersistence(
		InspectionCommonStatusPersistence inspectionCommonStatusPersistence) {
		this.inspectionCommonStatusPersistence = inspectionCommonStatusPersistence;
	}

	/**
	 * Returns the inspection record local service.
	 *
	 * @return the inspection record local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalService getInspectionRecordLocalService() {
		return inspectionRecordLocalService;
	}

	/**
	 * Sets the inspection record local service.
	 *
	 * @param inspectionRecordLocalService the inspection record local service
	 */
	public void setInspectionRecordLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalService inspectionRecordLocalService) {
		this.inspectionRecordLocalService = inspectionRecordLocalService;
	}

	/**
	 * Returns the inspection record remote service.
	 *
	 * @return the inspection record remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordService getInspectionRecordService() {
		return inspectionRecordService;
	}

	/**
	 * Sets the inspection record remote service.
	 *
	 * @param inspectionRecordService the inspection record remote service
	 */
	public void setInspectionRecordService(
		vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordService inspectionRecordService) {
		this.inspectionRecordService = inspectionRecordService;
	}

	/**
	 * Returns the inspection record persistence.
	 *
	 * @return the inspection record persistence
	 */
	public InspectionRecordPersistence getInspectionRecordPersistence() {
		return inspectionRecordPersistence;
	}

	/**
	 * Sets the inspection record persistence.
	 *
	 * @param inspectionRecordPersistence the inspection record persistence
	 */
	public void setInspectionRecordPersistence(
		InspectionRecordPersistence inspectionRecordPersistence) {
		this.inspectionRecordPersistence = inspectionRecordPersistence;
	}

	/**
	 * Returns the inspection record attach local service.
	 *
	 * @return the inspection record attach local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachLocalService getInspectionRecordAttachLocalService() {
		return inspectionRecordAttachLocalService;
	}

	/**
	 * Sets the inspection record attach local service.
	 *
	 * @param inspectionRecordAttachLocalService the inspection record attach local service
	 */
	public void setInspectionRecordAttachLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachLocalService inspectionRecordAttachLocalService) {
		this.inspectionRecordAttachLocalService = inspectionRecordAttachLocalService;
	}

	/**
	 * Returns the inspection record attach remote service.
	 *
	 * @return the inspection record attach remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachService getInspectionRecordAttachService() {
		return inspectionRecordAttachService;
	}

	/**
	 * Sets the inspection record attach remote service.
	 *
	 * @param inspectionRecordAttachService the inspection record attach remote service
	 */
	public void setInspectionRecordAttachService(
		vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachService inspectionRecordAttachService) {
		this.inspectionRecordAttachService = inspectionRecordAttachService;
	}

	/**
	 * Returns the inspection record attach persistence.
	 *
	 * @return the inspection record attach persistence
	 */
	public InspectionRecordAttachPersistence getInspectionRecordAttachPersistence() {
		return inspectionRecordAttachPersistence;
	}

	/**
	 * Sets the inspection record attach persistence.
	 *
	 * @param inspectionRecordAttachPersistence the inspection record attach persistence
	 */
	public void setInspectionRecordAttachPersistence(
		InspectionRecordAttachPersistence inspectionRecordAttachPersistence) {
		this.inspectionRecordAttachPersistence = inspectionRecordAttachPersistence;
	}

	/**
	 * Returns the inspection record spec local service.
	 *
	 * @return the inspection record spec local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecLocalService getInspectionRecordSpecLocalService() {
		return inspectionRecordSpecLocalService;
	}

	/**
	 * Sets the inspection record spec local service.
	 *
	 * @param inspectionRecordSpecLocalService the inspection record spec local service
	 */
	public void setInspectionRecordSpecLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecLocalService inspectionRecordSpecLocalService) {
		this.inspectionRecordSpecLocalService = inspectionRecordSpecLocalService;
	}

	/**
	 * Returns the inspection record spec remote service.
	 *
	 * @return the inspection record spec remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecService getInspectionRecordSpecService() {
		return inspectionRecordSpecService;
	}

	/**
	 * Sets the inspection record spec remote service.
	 *
	 * @param inspectionRecordSpecService the inspection record spec remote service
	 */
	public void setInspectionRecordSpecService(
		vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecService inspectionRecordSpecService) {
		this.inspectionRecordSpecService = inspectionRecordSpecService;
	}

	/**
	 * Returns the inspection record spec persistence.
	 *
	 * @return the inspection record spec persistence
	 */
	public InspectionRecordSpecPersistence getInspectionRecordSpecPersistence() {
		return inspectionRecordSpecPersistence;
	}

	/**
	 * Sets the inspection record spec persistence.
	 *
	 * @param inspectionRecordSpecPersistence the inspection record spec persistence
	 */
	public void setInspectionRecordSpecPersistence(
		InspectionRecordSpecPersistence inspectionRecordSpecPersistence) {
		this.inspectionRecordSpecPersistence = inspectionRecordSpecPersistence;
	}

	/**
	 * Returns the payment status local service.
	 *
	 * @return the payment status local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.PaymentStatusLocalService getPaymentStatusLocalService() {
		return paymentStatusLocalService;
	}

	/**
	 * Sets the payment status local service.
	 *
	 * @param paymentStatusLocalService the payment status local service
	 */
	public void setPaymentStatusLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.PaymentStatusLocalService paymentStatusLocalService) {
		this.paymentStatusLocalService = paymentStatusLocalService;
	}

	/**
	 * Returns the payment status remote service.
	 *
	 * @return the payment status remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.PaymentStatusService getPaymentStatusService() {
		return paymentStatusService;
	}

	/**
	 * Sets the payment status remote service.
	 *
	 * @param paymentStatusService the payment status remote service
	 */
	public void setPaymentStatusService(
		vn.dtt.gt.dk.dao.nghiepvu.service.PaymentStatusService paymentStatusService) {
		this.paymentStatusService = paymentStatusService;
	}

	/**
	 * Returns the payment status persistence.
	 *
	 * @return the payment status persistence
	 */
	public PaymentStatusPersistence getPaymentStatusPersistence() {
		return paymentStatusPersistence;
	}

	/**
	 * Sets the payment status persistence.
	 *
	 * @param paymentStatusPersistence the payment status persistence
	 */
	public void setPaymentStatusPersistence(
		PaymentStatusPersistence paymentStatusPersistence) {
		this.paymentStatusPersistence = paymentStatusPersistence;
	}

	/**
	 * Returns the production country local service.
	 *
	 * @return the production country local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryLocalService getProductionCountryLocalService() {
		return productionCountryLocalService;
	}

	/**
	 * Sets the production country local service.
	 *
	 * @param productionCountryLocalService the production country local service
	 */
	public void setProductionCountryLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryLocalService productionCountryLocalService) {
		this.productionCountryLocalService = productionCountryLocalService;
	}

	/**
	 * Returns the production country remote service.
	 *
	 * @return the production country remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryService getProductionCountryService() {
		return productionCountryService;
	}

	/**
	 * Sets the production country remote service.
	 *
	 * @param productionCountryService the production country remote service
	 */
	public void setProductionCountryService(
		vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryService productionCountryService) {
		this.productionCountryService = productionCountryService;
	}

	/**
	 * Returns the production country persistence.
	 *
	 * @return the production country persistence
	 */
	public ProductionCountryPersistence getProductionCountryPersistence() {
		return productionCountryPersistence;
	}

	/**
	 * Sets the production country persistence.
	 *
	 * @param productionCountryPersistence the production country persistence
	 */
	public void setProductionCountryPersistence(
		ProductionCountryPersistence productionCountryPersistence) {
		this.productionCountryPersistence = productionCountryPersistence;
	}

	/**
	 * Returns the registered inspection local service.
	 *
	 * @return the registered inspection local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalService getRegisteredInspectionLocalService() {
		return registeredInspectionLocalService;
	}

	/**
	 * Sets the registered inspection local service.
	 *
	 * @param registeredInspectionLocalService the registered inspection local service
	 */
	public void setRegisteredInspectionLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalService registeredInspectionLocalService) {
		this.registeredInspectionLocalService = registeredInspectionLocalService;
	}

	/**
	 * Returns the registered inspection remote service.
	 *
	 * @return the registered inspection remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionService getRegisteredInspectionService() {
		return registeredInspectionService;
	}

	/**
	 * Sets the registered inspection remote service.
	 *
	 * @param registeredInspectionService the registered inspection remote service
	 */
	public void setRegisteredInspectionService(
		vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionService registeredInspectionService) {
		this.registeredInspectionService = registeredInspectionService;
	}

	/**
	 * Returns the registered inspection persistence.
	 *
	 * @return the registered inspection persistence
	 */
	public RegisteredInspectionPersistence getRegisteredInspectionPersistence() {
		return registeredInspectionPersistence;
	}

	/**
	 * Sets the registered inspection persistence.
	 *
	 * @param registeredInspectionPersistence the registered inspection persistence
	 */
	public void setRegisteredInspectionPersistence(
		RegisteredInspectionPersistence registeredInspectionPersistence) {
		this.registeredInspectionPersistence = registeredInspectionPersistence;
	}

	/**
	 * Returns the safetest requirement local service.
	 *
	 * @return the safetest requirement local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.SafetestRequirementLocalService getSafetestRequirementLocalService() {
		return safetestRequirementLocalService;
	}

	/**
	 * Sets the safetest requirement local service.
	 *
	 * @param safetestRequirementLocalService the safetest requirement local service
	 */
	public void setSafetestRequirementLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.SafetestRequirementLocalService safetestRequirementLocalService) {
		this.safetestRequirementLocalService = safetestRequirementLocalService;
	}

	/**
	 * Returns the safetest requirement remote service.
	 *
	 * @return the safetest requirement remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.SafetestRequirementService getSafetestRequirementService() {
		return safetestRequirementService;
	}

	/**
	 * Sets the safetest requirement remote service.
	 *
	 * @param safetestRequirementService the safetest requirement remote service
	 */
	public void setSafetestRequirementService(
		vn.dtt.gt.dk.dao.nghiepvu.service.SafetestRequirementService safetestRequirementService) {
		this.safetestRequirementService = safetestRequirementService;
	}

	/**
	 * Returns the safetest requirement persistence.
	 *
	 * @return the safetest requirement persistence
	 */
	public SafetestRequirementPersistence getSafetestRequirementPersistence() {
		return safetestRequirementPersistence;
	}

	/**
	 * Sets the safetest requirement persistence.
	 *
	 * @param safetestRequirementPersistence the safetest requirement persistence
	 */
	public void setSafetestRequirementPersistence(
		SafetestRequirementPersistence safetestRequirementPersistence) {
		this.safetestRequirementPersistence = safetestRequirementPersistence;
	}

	/**
	 * Returns the safety test report local service.
	 *
	 * @return the safety test report local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestReportLocalService getSafetyTestReportLocalService() {
		return safetyTestReportLocalService;
	}

	/**
	 * Sets the safety test report local service.
	 *
	 * @param safetyTestReportLocalService the safety test report local service
	 */
	public void setSafetyTestReportLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestReportLocalService safetyTestReportLocalService) {
		this.safetyTestReportLocalService = safetyTestReportLocalService;
	}

	/**
	 * Returns the safety test report remote service.
	 *
	 * @return the safety test report remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestReportService getSafetyTestReportService() {
		return safetyTestReportService;
	}

	/**
	 * Sets the safety test report remote service.
	 *
	 * @param safetyTestReportService the safety test report remote service
	 */
	public void setSafetyTestReportService(
		vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestReportService safetyTestReportService) {
		this.safetyTestReportService = safetyTestReportService;
	}

	/**
	 * Returns the safety test report persistence.
	 *
	 * @return the safety test report persistence
	 */
	public SafetyTestReportPersistence getSafetyTestReportPersistence() {
		return safetyTestReportPersistence;
	}

	/**
	 * Sets the safety test report persistence.
	 *
	 * @param safetyTestReportPersistence the safety test report persistence
	 */
	public void setSafetyTestReportPersistence(
		SafetyTestReportPersistence safetyTestReportPersistence) {
		this.safetyTestReportPersistence = safetyTestReportPersistence;
	}

	/**
	 * Returns the safety test request local service.
	 *
	 * @return the safety test request local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestRequestLocalService getSafetyTestRequestLocalService() {
		return safetyTestRequestLocalService;
	}

	/**
	 * Sets the safety test request local service.
	 *
	 * @param safetyTestRequestLocalService the safety test request local service
	 */
	public void setSafetyTestRequestLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestRequestLocalService safetyTestRequestLocalService) {
		this.safetyTestRequestLocalService = safetyTestRequestLocalService;
	}

	/**
	 * Returns the safety test request remote service.
	 *
	 * @return the safety test request remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestRequestService getSafetyTestRequestService() {
		return safetyTestRequestService;
	}

	/**
	 * Sets the safety test request remote service.
	 *
	 * @param safetyTestRequestService the safety test request remote service
	 */
	public void setSafetyTestRequestService(
		vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestRequestService safetyTestRequestService) {
		this.safetyTestRequestService = safetyTestRequestService;
	}

	/**
	 * Returns the safety test request persistence.
	 *
	 * @return the safety test request persistence
	 */
	public SafetyTestRequestPersistence getSafetyTestRequestPersistence() {
		return safetyTestRequestPersistence;
	}

	/**
	 * Sets the safety test request persistence.
	 *
	 * @param safetyTestRequestPersistence the safety test request persistence
	 */
	public void setSafetyTestRequestPersistence(
		SafetyTestRequestPersistence safetyTestRequestPersistence) {
		this.safetyTestRequestPersistence = safetyTestRequestPersistence;
	}

	/**
	 * Returns the satety test report spec local service.
	 *
	 * @return the satety test report spec local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.SatetyTestReportSpecLocalService getSatetyTestReportSpecLocalService() {
		return satetyTestReportSpecLocalService;
	}

	/**
	 * Sets the satety test report spec local service.
	 *
	 * @param satetyTestReportSpecLocalService the satety test report spec local service
	 */
	public void setSatetyTestReportSpecLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.SatetyTestReportSpecLocalService satetyTestReportSpecLocalService) {
		this.satetyTestReportSpecLocalService = satetyTestReportSpecLocalService;
	}

	/**
	 * Returns the satety test report spec remote service.
	 *
	 * @return the satety test report spec remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.SatetyTestReportSpecService getSatetyTestReportSpecService() {
		return satetyTestReportSpecService;
	}

	/**
	 * Sets the satety test report spec remote service.
	 *
	 * @param satetyTestReportSpecService the satety test report spec remote service
	 */
	public void setSatetyTestReportSpecService(
		vn.dtt.gt.dk.dao.nghiepvu.service.SatetyTestReportSpecService satetyTestReportSpecService) {
		this.satetyTestReportSpecService = satetyTestReportSpecService;
	}

	/**
	 * Returns the satety test report spec persistence.
	 *
	 * @return the satety test report spec persistence
	 */
	public SatetyTestReportSpecPersistence getSatetyTestReportSpecPersistence() {
		return satetyTestReportSpecPersistence;
	}

	/**
	 * Sets the satety test report spec persistence.
	 *
	 * @param satetyTestReportSpecPersistence the satety test report spec persistence
	 */
	public void setSatetyTestReportSpecPersistence(
		SatetyTestReportSpecPersistence satetyTestReportSpecPersistence) {
		this.satetyTestReportSpecPersistence = satetyTestReportSpecPersistence;
	}

	/**
	 * Returns the vehicle group local service.
	 *
	 * @return the vehicle group local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalService getVehicleGroupLocalService() {
		return vehicleGroupLocalService;
	}

	/**
	 * Sets the vehicle group local service.
	 *
	 * @param vehicleGroupLocalService the vehicle group local service
	 */
	public void setVehicleGroupLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalService vehicleGroupLocalService) {
		this.vehicleGroupLocalService = vehicleGroupLocalService;
	}

	/**
	 * Returns the vehicle group remote service.
	 *
	 * @return the vehicle group remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupService getVehicleGroupService() {
		return vehicleGroupService;
	}

	/**
	 * Sets the vehicle group remote service.
	 *
	 * @param vehicleGroupService the vehicle group remote service
	 */
	public void setVehicleGroupService(
		vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupService vehicleGroupService) {
		this.vehicleGroupService = vehicleGroupService;
	}

	/**
	 * Returns the vehicle group persistence.
	 *
	 * @return the vehicle group persistence
	 */
	public VehicleGroupPersistence getVehicleGroupPersistence() {
		return vehicleGroupPersistence;
	}

	/**
	 * Sets the vehicle group persistence.
	 *
	 * @param vehicleGroupPersistence the vehicle group persistence
	 */
	public void setVehicleGroupPersistence(
		VehicleGroupPersistence vehicleGroupPersistence) {
		this.vehicleGroupPersistence = vehicleGroupPersistence;
	}

	/**
	 * Returns the vehicle group initial local service.
	 *
	 * @return the vehicle group initial local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialLocalService getVehicleGroupInitialLocalService() {
		return vehicleGroupInitialLocalService;
	}

	/**
	 * Sets the vehicle group initial local service.
	 *
	 * @param vehicleGroupInitialLocalService the vehicle group initial local service
	 */
	public void setVehicleGroupInitialLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialLocalService vehicleGroupInitialLocalService) {
		this.vehicleGroupInitialLocalService = vehicleGroupInitialLocalService;
	}

	/**
	 * Returns the vehicle group initial remote service.
	 *
	 * @return the vehicle group initial remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialService getVehicleGroupInitialService() {
		return vehicleGroupInitialService;
	}

	/**
	 * Sets the vehicle group initial remote service.
	 *
	 * @param vehicleGroupInitialService the vehicle group initial remote service
	 */
	public void setVehicleGroupInitialService(
		vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialService vehicleGroupInitialService) {
		this.vehicleGroupInitialService = vehicleGroupInitialService;
	}

	/**
	 * Returns the vehicle group initial persistence.
	 *
	 * @return the vehicle group initial persistence
	 */
	public VehicleGroupInitialPersistence getVehicleGroupInitialPersistence() {
		return vehicleGroupInitialPersistence;
	}

	/**
	 * Sets the vehicle group initial persistence.
	 *
	 * @param vehicleGroupInitialPersistence the vehicle group initial persistence
	 */
	public void setVehicleGroupInitialPersistence(
		VehicleGroupInitialPersistence vehicleGroupInitialPersistence) {
		this.vehicleGroupInitialPersistence = vehicleGroupInitialPersistence;
	}

	/**
	 * Returns the vehicle group spec local service.
	 *
	 * @return the vehicle group spec local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupSpecLocalService getVehicleGroupSpecLocalService() {
		return vehicleGroupSpecLocalService;
	}

	/**
	 * Sets the vehicle group spec local service.
	 *
	 * @param vehicleGroupSpecLocalService the vehicle group spec local service
	 */
	public void setVehicleGroupSpecLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupSpecLocalService vehicleGroupSpecLocalService) {
		this.vehicleGroupSpecLocalService = vehicleGroupSpecLocalService;
	}

	/**
	 * Returns the vehicle group spec remote service.
	 *
	 * @return the vehicle group spec remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupSpecService getVehicleGroupSpecService() {
		return vehicleGroupSpecService;
	}

	/**
	 * Sets the vehicle group spec remote service.
	 *
	 * @param vehicleGroupSpecService the vehicle group spec remote service
	 */
	public void setVehicleGroupSpecService(
		vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupSpecService vehicleGroupSpecService) {
		this.vehicleGroupSpecService = vehicleGroupSpecService;
	}

	/**
	 * Returns the vehicle group spec persistence.
	 *
	 * @return the vehicle group spec persistence
	 */
	public VehicleGroupSpecPersistence getVehicleGroupSpecPersistence() {
		return vehicleGroupSpecPersistence;
	}

	/**
	 * Sets the vehicle group spec persistence.
	 *
	 * @param vehicleGroupSpecPersistence the vehicle group spec persistence
	 */
	public void setVehicleGroupSpecPersistence(
		VehicleGroupSpecPersistence vehicleGroupSpecPersistence) {
		this.vehicleGroupSpecPersistence = vehicleGroupSpecPersistence;
	}

	/**
	 * Returns the vehicle record local service.
	 *
	 * @return the vehicle record local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalService getVehicleRecordLocalService() {
		return vehicleRecordLocalService;
	}

	/**
	 * Sets the vehicle record local service.
	 *
	 * @param vehicleRecordLocalService the vehicle record local service
	 */
	public void setVehicleRecordLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalService vehicleRecordLocalService) {
		this.vehicleRecordLocalService = vehicleRecordLocalService;
	}

	/**
	 * Returns the vehicle record remote service.
	 *
	 * @return the vehicle record remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordService getVehicleRecordService() {
		return vehicleRecordService;
	}

	/**
	 * Sets the vehicle record remote service.
	 *
	 * @param vehicleRecordService the vehicle record remote service
	 */
	public void setVehicleRecordService(
		vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordService vehicleRecordService) {
		this.vehicleRecordService = vehicleRecordService;
	}

	/**
	 * Returns the vehicle record persistence.
	 *
	 * @return the vehicle record persistence
	 */
	public VehicleRecordPersistence getVehicleRecordPersistence() {
		return vehicleRecordPersistence;
	}

	/**
	 * Sets the vehicle record persistence.
	 *
	 * @param vehicleRecordPersistence the vehicle record persistence
	 */
	public void setVehicleRecordPersistence(
		VehicleRecordPersistence vehicleRecordPersistence) {
		this.vehicleRecordPersistence = vehicleRecordPersistence;
	}

	/**
	 * Returns the vehiclerecord initial local service.
	 *
	 * @return the vehiclerecord initial local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalService getVehiclerecordInitialLocalService() {
		return vehiclerecordInitialLocalService;
	}

	/**
	 * Sets the vehiclerecord initial local service.
	 *
	 * @param vehiclerecordInitialLocalService the vehiclerecord initial local service
	 */
	public void setVehiclerecordInitialLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalService vehiclerecordInitialLocalService) {
		this.vehiclerecordInitialLocalService = vehiclerecordInitialLocalService;
	}

	/**
	 * Returns the vehiclerecord initial remote service.
	 *
	 * @return the vehiclerecord initial remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialService getVehiclerecordInitialService() {
		return vehiclerecordInitialService;
	}

	/**
	 * Sets the vehiclerecord initial remote service.
	 *
	 * @param vehiclerecordInitialService the vehiclerecord initial remote service
	 */
	public void setVehiclerecordInitialService(
		vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialService vehiclerecordInitialService) {
		this.vehiclerecordInitialService = vehiclerecordInitialService;
	}

	/**
	 * Returns the vehiclerecord initial persistence.
	 *
	 * @return the vehiclerecord initial persistence
	 */
	public VehiclerecordInitialPersistence getVehiclerecordInitialPersistence() {
		return vehiclerecordInitialPersistence;
	}

	/**
	 * Sets the vehiclerecord initial persistence.
	 *
	 * @param vehiclerecordInitialPersistence the vehiclerecord initial persistence
	 */
	public void setVehiclerecordInitialPersistence(
		VehiclerecordInitialPersistence vehiclerecordInitialPersistence) {
		this.vehiclerecordInitialPersistence = vehiclerecordInitialPersistence;
	}

	/**
	 * Returns the vehicle specification local service.
	 *
	 * @return the vehicle specification local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationLocalService getVehicleSpecificationLocalService() {
		return vehicleSpecificationLocalService;
	}

	/**
	 * Sets the vehicle specification local service.
	 *
	 * @param vehicleSpecificationLocalService the vehicle specification local service
	 */
	public void setVehicleSpecificationLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationLocalService vehicleSpecificationLocalService) {
		this.vehicleSpecificationLocalService = vehicleSpecificationLocalService;
	}

	/**
	 * Returns the vehicle specification remote service.
	 *
	 * @return the vehicle specification remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationService getVehicleSpecificationService() {
		return vehicleSpecificationService;
	}

	/**
	 * Sets the vehicle specification remote service.
	 *
	 * @param vehicleSpecificationService the vehicle specification remote service
	 */
	public void setVehicleSpecificationService(
		vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationService vehicleSpecificationService) {
		this.vehicleSpecificationService = vehicleSpecificationService;
	}

	/**
	 * Returns the vehicle specification persistence.
	 *
	 * @return the vehicle specification persistence
	 */
	public VehicleSpecificationPersistence getVehicleSpecificationPersistence() {
		return vehicleSpecificationPersistence;
	}

	/**
	 * Sets the vehicle specification persistence.
	 *
	 * @param vehicleSpecificationPersistence the vehicle specification persistence
	 */
	public void setVehicleSpecificationPersistence(
		VehicleSpecificationPersistence vehicleSpecificationPersistence) {
		this.vehicleSpecificationPersistence = vehicleSpecificationPersistence;
	}

	/**
	 * Returns the vehicle statistics local service.
	 *
	 * @return the vehicle statistics local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsLocalService getVehicleStatisticsLocalService() {
		return vehicleStatisticsLocalService;
	}

	/**
	 * Sets the vehicle statistics local service.
	 *
	 * @param vehicleStatisticsLocalService the vehicle statistics local service
	 */
	public void setVehicleStatisticsLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsLocalService vehicleStatisticsLocalService) {
		this.vehicleStatisticsLocalService = vehicleStatisticsLocalService;
	}

	/**
	 * Returns the vehicle statistics remote service.
	 *
	 * @return the vehicle statistics remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsService getVehicleStatisticsService() {
		return vehicleStatisticsService;
	}

	/**
	 * Sets the vehicle statistics remote service.
	 *
	 * @param vehicleStatisticsService the vehicle statistics remote service
	 */
	public void setVehicleStatisticsService(
		vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsService vehicleStatisticsService) {
		this.vehicleStatisticsService = vehicleStatisticsService;
	}

	/**
	 * Returns the vehicle statistics persistence.
	 *
	 * @return the vehicle statistics persistence
	 */
	public VehicleStatisticsPersistence getVehicleStatisticsPersistence() {
		return vehicleStatisticsPersistence;
	}

	/**
	 * Sets the vehicle statistics persistence.
	 *
	 * @param vehicleStatisticsPersistence the vehicle statistics persistence
	 */
	public void setVehicleStatisticsPersistence(
		VehicleStatisticsPersistence vehicleStatisticsPersistence) {
		this.vehicleStatisticsPersistence = vehicleStatisticsPersistence;
	}

	/**
	 * Returns the view dang kiem tim kiem local service.
	 *
	 * @return the view dang kiem tim kiem local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.ViewDangKiemTimKiemLocalService getViewDangKiemTimKiemLocalService() {
		return viewDangKiemTimKiemLocalService;
	}

	/**
	 * Sets the view dang kiem tim kiem local service.
	 *
	 * @param viewDangKiemTimKiemLocalService the view dang kiem tim kiem local service
	 */
	public void setViewDangKiemTimKiemLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.ViewDangKiemTimKiemLocalService viewDangKiemTimKiemLocalService) {
		this.viewDangKiemTimKiemLocalService = viewDangKiemTimKiemLocalService;
	}

	/**
	 * Returns the view dang kiem tim kiem remote service.
	 *
	 * @return the view dang kiem tim kiem remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.ViewDangKiemTimKiemService getViewDangKiemTimKiemService() {
		return viewDangKiemTimKiemService;
	}

	/**
	 * Sets the view dang kiem tim kiem remote service.
	 *
	 * @param viewDangKiemTimKiemService the view dang kiem tim kiem remote service
	 */
	public void setViewDangKiemTimKiemService(
		vn.dtt.gt.dk.dao.nghiepvu.service.ViewDangKiemTimKiemService viewDangKiemTimKiemService) {
		this.viewDangKiemTimKiemService = viewDangKiemTimKiemService;
	}

	/**
	 * Returns the view dang kiem tim kiem persistence.
	 *
	 * @return the view dang kiem tim kiem persistence
	 */
	public ViewDangKiemTimKiemPersistence getViewDangKiemTimKiemPersistence() {
		return viewDangKiemTimKiemPersistence;
	}

	/**
	 * Sets the view dang kiem tim kiem persistence.
	 *
	 * @param viewDangKiemTimKiemPersistence the view dang kiem tim kiem persistence
	 */
	public void setViewDangKiemTimKiemPersistence(
		ViewDangKiemTimKiemPersistence viewDangKiemTimKiemPersistence) {
		this.viewDangKiemTimKiemPersistence = viewDangKiemTimKiemPersistence;
	}

	/**
	 * Returns the view dang kiem tim kiem finder.
	 *
	 * @return the view dang kiem tim kiem finder
	 */
	public ViewDangKiemTimKiemFinder getViewDangKiemTimKiemFinder() {
		return viewDangKiemTimKiemFinder;
	}

	/**
	 * Sets the view dang kiem tim kiem finder.
	 *
	 * @param viewDangKiemTimKiemFinder the view dang kiem tim kiem finder
	 */
	public void setViewDangKiemTimKiemFinder(
		ViewDangKiemTimKiemFinder viewDangKiemTimKiemFinder) {
		this.viewDangKiemTimKiemFinder = viewDangKiemTimKiemFinder;
	}

	/**
	 * Returns the view trung so khung dong co local service.
	 *
	 * @return the view trung so khung dong co local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.ViewTrungSoKhungDongCoLocalService getViewTrungSoKhungDongCoLocalService() {
		return viewTrungSoKhungDongCoLocalService;
	}

	/**
	 * Sets the view trung so khung dong co local service.
	 *
	 * @param viewTrungSoKhungDongCoLocalService the view trung so khung dong co local service
	 */
	public void setViewTrungSoKhungDongCoLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.ViewTrungSoKhungDongCoLocalService viewTrungSoKhungDongCoLocalService) {
		this.viewTrungSoKhungDongCoLocalService = viewTrungSoKhungDongCoLocalService;
	}

	/**
	 * Returns the view trung so khung dong co remote service.
	 *
	 * @return the view trung so khung dong co remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.ViewTrungSoKhungDongCoService getViewTrungSoKhungDongCoService() {
		return viewTrungSoKhungDongCoService;
	}

	/**
	 * Sets the view trung so khung dong co remote service.
	 *
	 * @param viewTrungSoKhungDongCoService the view trung so khung dong co remote service
	 */
	public void setViewTrungSoKhungDongCoService(
		vn.dtt.gt.dk.dao.nghiepvu.service.ViewTrungSoKhungDongCoService viewTrungSoKhungDongCoService) {
		this.viewTrungSoKhungDongCoService = viewTrungSoKhungDongCoService;
	}

	/**
	 * Returns the view trung so khung dong co persistence.
	 *
	 * @return the view trung so khung dong co persistence
	 */
	public ViewTrungSoKhungDongCoPersistence getViewTrungSoKhungDongCoPersistence() {
		return viewTrungSoKhungDongCoPersistence;
	}

	/**
	 * Sets the view trung so khung dong co persistence.
	 *
	 * @param viewTrungSoKhungDongCoPersistence the view trung so khung dong co persistence
	 */
	public void setViewTrungSoKhungDongCoPersistence(
		ViewTrungSoKhungDongCoPersistence viewTrungSoKhungDongCoPersistence) {
		this.viewTrungSoKhungDongCoPersistence = viewTrungSoKhungDongCoPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial",
			vehiclerecordInitialLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return VehiclerecordInitial.class;
	}

	protected String getModelClassName() {
		return VehiclerecordInitial.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = vehiclerecordInitialPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CertificateCircularLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CertificateCircularLocalService certificateCircularLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CertificateCircularService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CertificateCircularService certificateCircularService;
	@BeanReference(type = CertificateCircularPersistence.class)
	protected CertificateCircularPersistence certificateCircularPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalService certificateRecordLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordService certificateRecordService;
	@BeanReference(type = CertificateRecordPersistence.class)
	protected CertificateRecordPersistence certificateRecordPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecLocalService certificateRecordSpecLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecService certificateRecordSpecService;
	@BeanReference(type = CertificateRecordSpecPersistence.class)
	protected CertificateRecordSpecPersistence certificateRecordSpecPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecLocalService cfgTechnicalspecLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecService cfgTechnicalspecService;
	@BeanReference(type = CfgTechnicalspecPersistence.class)
	protected CfgTechnicalspecPersistence cfgTechnicalspecPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalService confirmedInspectionLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionService confirmedInspectionService;
	@BeanReference(type = ConfirmedInspectionPersistence.class)
	protected ConfirmedInspectionPersistence confirmedInspectionPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ControlReportLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ControlReportLocalService controlReportLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ControlReportService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ControlReportService controlReportService;
	@BeanReference(type = ControlReportPersistence.class)
	protected ControlReportPersistence controlReportPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequestLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequestLocalService controlRequestLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequestService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequestService controlRequestService;
	@BeanReference(type = ControlRequestPersistence.class)
	protected ControlRequestPersistence controlRequestPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequirementLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequirementLocalService controlRequirementLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequirementService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequirementService controlRequirementService;
	@BeanReference(type = ControlRequirementPersistence.class)
	protected ControlRequirementPersistence controlRequirementPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CopReportLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CopReportLocalService copReportLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CopReportService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CopReportService copReportService;
	@BeanReference(type = CopReportPersistence.class)
	protected CopReportPersistence copReportPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CorporationAttendeeLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CorporationAttendeeLocalService corporationAttendeeLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CorporationAttendeeService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CorporationAttendeeService corporationAttendeeService;
	@BeanReference(type = CorporationAttendeePersistence.class)
	protected CorporationAttendeePersistence corporationAttendeePersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalService corporationInspectorLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorService corporationInspectorService;
	@BeanReference(type = CorporationInspectorPersistence.class)
	protected CorporationInspectorPersistence corporationInspectorPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalService corporationTeamLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamService corporationTeamService;
	@BeanReference(type = CorporationTeamPersistence.class)
	protected CorporationTeamPersistence corporationTeamPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewLocalService corporationViewLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewService corporationViewService;
	@BeanReference(type = CorporationViewPersistence.class)
	protected CorporationViewPersistence corporationViewPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationLocalService customsDeclarationLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationService customsDeclarationService;
	@BeanReference(type = CustomsDeclarationPersistence.class)
	protected CustomsDeclarationPersistence customsDeclarationPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalService debitNoteLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteService debitNoteService;
	@BeanReference(type = DebitNotePersistence.class)
	protected DebitNotePersistence debitNotePersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsLocalService debitNoteDetailsLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsService debitNoteDetailsService;
	@BeanReference(type = DebitNoteDetailsPersistence.class)
	protected DebitNoteDetailsPersistence debitNoteDetailsPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateLocalService draftCertificateLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateService draftCertificateService;
	@BeanReference(type = DraftCertificatePersistence.class)
	protected DraftCertificatePersistence draftCertificatePersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateSpecLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateSpecLocalService draftCertificateSpecLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateSpecService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateSpecService draftCertificateSpecService;
	@BeanReference(type = DraftCertificateSpecPersistence.class)
	protected DraftCertificateSpecPersistence draftCertificateSpecPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestReportLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestReportLocalService emissionTestReportLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestReportService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestReportService emissionTestReportService;
	@BeanReference(type = EmissionTestReportPersistence.class)
	protected EmissionTestReportPersistence emissionTestReportPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequestLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequestLocalService emissionTestRequestLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequestService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequestService emissionTestRequestService;
	@BeanReference(type = EmissionTestRequestPersistence.class)
	protected EmissionTestRequestPersistence emissionTestRequestPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequirementLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequirementLocalService emissionTestRequirementLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequirementService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequirementService emissionTestRequirementService;
	@BeanReference(type = EmissionTestRequirementPersistence.class)
	protected EmissionTestRequirementPersistence emissionTestRequirementPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ExchangeRateLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ExchangeRateLocalService exchangeRateLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ExchangeRateService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ExchangeRateService exchangeRateService;
	@BeanReference(type = ExchangeRatePersistence.class)
	protected ExchangeRatePersistence exchangeRatePersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusLocalService inspectionCommonStatusLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusService inspectionCommonStatusService;
	@BeanReference(type = InspectionCommonStatusPersistence.class)
	protected InspectionCommonStatusPersistence inspectionCommonStatusPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalService inspectionRecordLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordService inspectionRecordService;
	@BeanReference(type = InspectionRecordPersistence.class)
	protected InspectionRecordPersistence inspectionRecordPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachLocalService inspectionRecordAttachLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachService inspectionRecordAttachService;
	@BeanReference(type = InspectionRecordAttachPersistence.class)
	protected InspectionRecordAttachPersistence inspectionRecordAttachPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecLocalService inspectionRecordSpecLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecService inspectionRecordSpecService;
	@BeanReference(type = InspectionRecordSpecPersistence.class)
	protected InspectionRecordSpecPersistence inspectionRecordSpecPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.PaymentStatusLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.PaymentStatusLocalService paymentStatusLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.PaymentStatusService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.PaymentStatusService paymentStatusService;
	@BeanReference(type = PaymentStatusPersistence.class)
	protected PaymentStatusPersistence paymentStatusPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryLocalService productionCountryLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryService productionCountryService;
	@BeanReference(type = ProductionCountryPersistence.class)
	protected ProductionCountryPersistence productionCountryPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalService registeredInspectionLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionService registeredInspectionService;
	@BeanReference(type = RegisteredInspectionPersistence.class)
	protected RegisteredInspectionPersistence registeredInspectionPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.SafetestRequirementLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.SafetestRequirementLocalService safetestRequirementLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.SafetestRequirementService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.SafetestRequirementService safetestRequirementService;
	@BeanReference(type = SafetestRequirementPersistence.class)
	protected SafetestRequirementPersistence safetestRequirementPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestReportLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestReportLocalService safetyTestReportLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestReportService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestReportService safetyTestReportService;
	@BeanReference(type = SafetyTestReportPersistence.class)
	protected SafetyTestReportPersistence safetyTestReportPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestRequestLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestRequestLocalService safetyTestRequestLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestRequestService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestRequestService safetyTestRequestService;
	@BeanReference(type = SafetyTestRequestPersistence.class)
	protected SafetyTestRequestPersistence safetyTestRequestPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.SatetyTestReportSpecLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.SatetyTestReportSpecLocalService satetyTestReportSpecLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.SatetyTestReportSpecService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.SatetyTestReportSpecService satetyTestReportSpecService;
	@BeanReference(type = SatetyTestReportSpecPersistence.class)
	protected SatetyTestReportSpecPersistence satetyTestReportSpecPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalService vehicleGroupLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupService vehicleGroupService;
	@BeanReference(type = VehicleGroupPersistence.class)
	protected VehicleGroupPersistence vehicleGroupPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialLocalService vehicleGroupInitialLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialService vehicleGroupInitialService;
	@BeanReference(type = VehicleGroupInitialPersistence.class)
	protected VehicleGroupInitialPersistence vehicleGroupInitialPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupSpecLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupSpecLocalService vehicleGroupSpecLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupSpecService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupSpecService vehicleGroupSpecService;
	@BeanReference(type = VehicleGroupSpecPersistence.class)
	protected VehicleGroupSpecPersistence vehicleGroupSpecPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalService vehicleRecordLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordService vehicleRecordService;
	@BeanReference(type = VehicleRecordPersistence.class)
	protected VehicleRecordPersistence vehicleRecordPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalService vehiclerecordInitialLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialService vehiclerecordInitialService;
	@BeanReference(type = VehiclerecordInitialPersistence.class)
	protected VehiclerecordInitialPersistence vehiclerecordInitialPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationLocalService vehicleSpecificationLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationService vehicleSpecificationService;
	@BeanReference(type = VehicleSpecificationPersistence.class)
	protected VehicleSpecificationPersistence vehicleSpecificationPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsLocalService vehicleStatisticsLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsService vehicleStatisticsService;
	@BeanReference(type = VehicleStatisticsPersistence.class)
	protected VehicleStatisticsPersistence vehicleStatisticsPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ViewDangKiemTimKiemLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ViewDangKiemTimKiemLocalService viewDangKiemTimKiemLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ViewDangKiemTimKiemService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ViewDangKiemTimKiemService viewDangKiemTimKiemService;
	@BeanReference(type = ViewDangKiemTimKiemPersistence.class)
	protected ViewDangKiemTimKiemPersistence viewDangKiemTimKiemPersistence;
	@BeanReference(type = ViewDangKiemTimKiemFinder.class)
	protected ViewDangKiemTimKiemFinder viewDangKiemTimKiemFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ViewTrungSoKhungDongCoLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ViewTrungSoKhungDongCoLocalService viewTrungSoKhungDongCoLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ViewTrungSoKhungDongCoService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ViewTrungSoKhungDongCoService viewTrungSoKhungDongCoService;
	@BeanReference(type = ViewTrungSoKhungDongCoPersistence.class)
	protected ViewTrungSoKhungDongCoPersistence viewTrungSoKhungDongCoPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private VehiclerecordInitialLocalServiceClpInvoker _clpInvoker = new VehiclerecordInitialLocalServiceClpInvoker();
}