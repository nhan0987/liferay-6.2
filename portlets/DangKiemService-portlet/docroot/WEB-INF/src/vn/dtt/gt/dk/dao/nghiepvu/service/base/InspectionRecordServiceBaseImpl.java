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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import vn.dtt.gt.dk.dao.api.service.persistence.ApiPersistence;
import vn.dtt.gt.dk.dao.common.service.persistence.TthcHoSoThuTucPersistence;
import vn.dtt.gt.dk.dao.common.service.persistence.TthcNoidungHoSoFinder;
import vn.dtt.gt.dk.dao.common.service.persistence.TthcNoidungHoSoPersistence;
import vn.dtt.gt.dk.dao.common.service.persistence.TthcPhanNhomHoSoVaiTroFinder;
import vn.dtt.gt.dk.dao.common.service.persistence.TthcPhanNhomHoSoVaiTroPersistence;
import vn.dtt.gt.dk.dao.motcua.service.persistence.MotCuaChuyenDichTrangThaiFinder;
import vn.dtt.gt.dk.dao.motcua.service.persistence.MotCuaChuyenDichTrangThaiPersistence;
import vn.dtt.gt.dk.dao.motcua.service.persistence.MotCuaDienBienHoSoFinder;
import vn.dtt.gt.dk.dao.motcua.service.persistence.MotCuaDienBienHoSoPersistence;
import vn.dtt.gt.dk.dao.motcua.service.persistence.MotCuaPhieuXuLyPhuFinder;
import vn.dtt.gt.dk.dao.motcua.service.persistence.MotCuaPhieuXuLyPhuPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordService;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CertificateCircularPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CertificateRecordFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CertificateRecordPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CertificateRecordSpecFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CertificateRecordSpecPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CfgLimitTechnicalSpecFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CfgLimitTechnicalSpecPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CfgTechnicalspecFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CfgTechnicalspecPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ConfirmedInspectionFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ConfirmedInspectionPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ControlReportPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ControlRequestPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ControlRequirementPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CopReportPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CorporationAttendeePersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CorporationInspectorFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CorporationInspectorPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CorporationTeamFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CorporationTeamPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CorporationViewFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CorporationViewPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CustomsDeclarationPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.DebitNoteDetailsPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.DebitNoteFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.DebitNotePersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.DraftCertificatePersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.DraftCertificateSpecFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.DraftCertificateSpecPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.EmissionTestReportPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.EmissionTestRequestPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.EmissionTestRequirementPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ExchangeRateFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ExchangeRatePersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.InspectionCommonStatusFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.InspectionCommonStatusPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.InspectionRecordAttachFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.InspectionRecordAttachPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.InspectionRecordFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.InspectionRecordPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.InspectionRecordSpecFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.InspectionRecordSpecPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.NewExchangeRatePersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.PaymentStatusPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ProductionCountryFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ProductionCountryPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.RegisteredInspectionFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.RegisteredInspectionPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.SafetestRequirementPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.SafetyTestReportPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.SafetyTestRequestPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.SatetyTestReportSpecPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehicleGroupFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehicleGroupInitialFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehicleGroupInitialPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehicleGroupPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehicleGroupSpecPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehicleRecordFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehicleRecordPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehicleSpecificationFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehicleSpecificationPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehicleStatisticsFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehicleStatisticsPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehiclerecordInitialFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehiclerecordInitialPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ViewTrungSoKhungDongCoFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ViewTrungSoKhungDongCoPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the inspection record remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.InspectionRecordServiceImpl}.
 * </p>
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.impl.InspectionRecordServiceImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordServiceUtil
 * @generated
 */
public abstract class InspectionRecordServiceBaseImpl extends BaseServiceImpl
	implements InspectionRecordService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordServiceUtil} to access the inspection record remote service.
	 */

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
	 * Returns the certificate record finder.
	 *
	 * @return the certificate record finder
	 */
	public CertificateRecordFinder getCertificateRecordFinder() {
		return certificateRecordFinder;
	}

	/**
	 * Sets the certificate record finder.
	 *
	 * @param certificateRecordFinder the certificate record finder
	 */
	public void setCertificateRecordFinder(
		CertificateRecordFinder certificateRecordFinder) {
		this.certificateRecordFinder = certificateRecordFinder;
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
	 * Returns the certificate record spec finder.
	 *
	 * @return the certificate record spec finder
	 */
	public CertificateRecordSpecFinder getCertificateRecordSpecFinder() {
		return certificateRecordSpecFinder;
	}

	/**
	 * Sets the certificate record spec finder.
	 *
	 * @param certificateRecordSpecFinder the certificate record spec finder
	 */
	public void setCertificateRecordSpecFinder(
		CertificateRecordSpecFinder certificateRecordSpecFinder) {
		this.certificateRecordSpecFinder = certificateRecordSpecFinder;
	}

	/**
	 * Returns the cfg limit technical spec local service.
	 *
	 * @return the cfg limit technical spec local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CfgLimitTechnicalSpecLocalService getCfgLimitTechnicalSpecLocalService() {
		return cfgLimitTechnicalSpecLocalService;
	}

	/**
	 * Sets the cfg limit technical spec local service.
	 *
	 * @param cfgLimitTechnicalSpecLocalService the cfg limit technical spec local service
	 */
	public void setCfgLimitTechnicalSpecLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CfgLimitTechnicalSpecLocalService cfgLimitTechnicalSpecLocalService) {
		this.cfgLimitTechnicalSpecLocalService = cfgLimitTechnicalSpecLocalService;
	}

	/**
	 * Returns the cfg limit technical spec remote service.
	 *
	 * @return the cfg limit technical spec remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.CfgLimitTechnicalSpecService getCfgLimitTechnicalSpecService() {
		return cfgLimitTechnicalSpecService;
	}

	/**
	 * Sets the cfg limit technical spec remote service.
	 *
	 * @param cfgLimitTechnicalSpecService the cfg limit technical spec remote service
	 */
	public void setCfgLimitTechnicalSpecService(
		vn.dtt.gt.dk.dao.nghiepvu.service.CfgLimitTechnicalSpecService cfgLimitTechnicalSpecService) {
		this.cfgLimitTechnicalSpecService = cfgLimitTechnicalSpecService;
	}

	/**
	 * Returns the cfg limit technical spec persistence.
	 *
	 * @return the cfg limit technical spec persistence
	 */
	public CfgLimitTechnicalSpecPersistence getCfgLimitTechnicalSpecPersistence() {
		return cfgLimitTechnicalSpecPersistence;
	}

	/**
	 * Sets the cfg limit technical spec persistence.
	 *
	 * @param cfgLimitTechnicalSpecPersistence the cfg limit technical spec persistence
	 */
	public void setCfgLimitTechnicalSpecPersistence(
		CfgLimitTechnicalSpecPersistence cfgLimitTechnicalSpecPersistence) {
		this.cfgLimitTechnicalSpecPersistence = cfgLimitTechnicalSpecPersistence;
	}

	/**
	 * Returns the cfg limit technical spec finder.
	 *
	 * @return the cfg limit technical spec finder
	 */
	public CfgLimitTechnicalSpecFinder getCfgLimitTechnicalSpecFinder() {
		return cfgLimitTechnicalSpecFinder;
	}

	/**
	 * Sets the cfg limit technical spec finder.
	 *
	 * @param cfgLimitTechnicalSpecFinder the cfg limit technical spec finder
	 */
	public void setCfgLimitTechnicalSpecFinder(
		CfgLimitTechnicalSpecFinder cfgLimitTechnicalSpecFinder) {
		this.cfgLimitTechnicalSpecFinder = cfgLimitTechnicalSpecFinder;
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
	 * Returns the cfg technicalspec finder.
	 *
	 * @return the cfg technicalspec finder
	 */
	public CfgTechnicalspecFinder getCfgTechnicalspecFinder() {
		return cfgTechnicalspecFinder;
	}

	/**
	 * Sets the cfg technicalspec finder.
	 *
	 * @param cfgTechnicalspecFinder the cfg technicalspec finder
	 */
	public void setCfgTechnicalspecFinder(
		CfgTechnicalspecFinder cfgTechnicalspecFinder) {
		this.cfgTechnicalspecFinder = cfgTechnicalspecFinder;
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
	 * Returns the confirmed inspection finder.
	 *
	 * @return the confirmed inspection finder
	 */
	public ConfirmedInspectionFinder getConfirmedInspectionFinder() {
		return confirmedInspectionFinder;
	}

	/**
	 * Sets the confirmed inspection finder.
	 *
	 * @param confirmedInspectionFinder the confirmed inspection finder
	 */
	public void setConfirmedInspectionFinder(
		ConfirmedInspectionFinder confirmedInspectionFinder) {
		this.confirmedInspectionFinder = confirmedInspectionFinder;
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
	 * Returns the corporation inspector finder.
	 *
	 * @return the corporation inspector finder
	 */
	public CorporationInspectorFinder getCorporationInspectorFinder() {
		return corporationInspectorFinder;
	}

	/**
	 * Sets the corporation inspector finder.
	 *
	 * @param corporationInspectorFinder the corporation inspector finder
	 */
	public void setCorporationInspectorFinder(
		CorporationInspectorFinder corporationInspectorFinder) {
		this.corporationInspectorFinder = corporationInspectorFinder;
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
	 * Returns the corporation team finder.
	 *
	 * @return the corporation team finder
	 */
	public CorporationTeamFinder getCorporationTeamFinder() {
		return corporationTeamFinder;
	}

	/**
	 * Sets the corporation team finder.
	 *
	 * @param corporationTeamFinder the corporation team finder
	 */
	public void setCorporationTeamFinder(
		CorporationTeamFinder corporationTeamFinder) {
		this.corporationTeamFinder = corporationTeamFinder;
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
	 * Returns the corporation view finder.
	 *
	 * @return the corporation view finder
	 */
	public CorporationViewFinder getCorporationViewFinder() {
		return corporationViewFinder;
	}

	/**
	 * Sets the corporation view finder.
	 *
	 * @param corporationViewFinder the corporation view finder
	 */
	public void setCorporationViewFinder(
		CorporationViewFinder corporationViewFinder) {
		this.corporationViewFinder = corporationViewFinder;
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
	 * Returns the debit note finder.
	 *
	 * @return the debit note finder
	 */
	public DebitNoteFinder getDebitNoteFinder() {
		return debitNoteFinder;
	}

	/**
	 * Sets the debit note finder.
	 *
	 * @param debitNoteFinder the debit note finder
	 */
	public void setDebitNoteFinder(DebitNoteFinder debitNoteFinder) {
		this.debitNoteFinder = debitNoteFinder;
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
	 * Returns the draft certificate spec finder.
	 *
	 * @return the draft certificate spec finder
	 */
	public DraftCertificateSpecFinder getDraftCertificateSpecFinder() {
		return draftCertificateSpecFinder;
	}

	/**
	 * Sets the draft certificate spec finder.
	 *
	 * @param draftCertificateSpecFinder the draft certificate spec finder
	 */
	public void setDraftCertificateSpecFinder(
		DraftCertificateSpecFinder draftCertificateSpecFinder) {
		this.draftCertificateSpecFinder = draftCertificateSpecFinder;
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
	 * Returns the exchange rate finder.
	 *
	 * @return the exchange rate finder
	 */
	public ExchangeRateFinder getExchangeRateFinder() {
		return exchangeRateFinder;
	}

	/**
	 * Sets the exchange rate finder.
	 *
	 * @param exchangeRateFinder the exchange rate finder
	 */
	public void setExchangeRateFinder(ExchangeRateFinder exchangeRateFinder) {
		this.exchangeRateFinder = exchangeRateFinder;
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
	 * Returns the inspection common status finder.
	 *
	 * @return the inspection common status finder
	 */
	public InspectionCommonStatusFinder getInspectionCommonStatusFinder() {
		return inspectionCommonStatusFinder;
	}

	/**
	 * Sets the inspection common status finder.
	 *
	 * @param inspectionCommonStatusFinder the inspection common status finder
	 */
	public void setInspectionCommonStatusFinder(
		InspectionCommonStatusFinder inspectionCommonStatusFinder) {
		this.inspectionCommonStatusFinder = inspectionCommonStatusFinder;
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
	 * Returns the inspection record finder.
	 *
	 * @return the inspection record finder
	 */
	public InspectionRecordFinder getInspectionRecordFinder() {
		return inspectionRecordFinder;
	}

	/**
	 * Sets the inspection record finder.
	 *
	 * @param inspectionRecordFinder the inspection record finder
	 */
	public void setInspectionRecordFinder(
		InspectionRecordFinder inspectionRecordFinder) {
		this.inspectionRecordFinder = inspectionRecordFinder;
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
	 * Returns the inspection record attach finder.
	 *
	 * @return the inspection record attach finder
	 */
	public InspectionRecordAttachFinder getInspectionRecordAttachFinder() {
		return inspectionRecordAttachFinder;
	}

	/**
	 * Sets the inspection record attach finder.
	 *
	 * @param inspectionRecordAttachFinder the inspection record attach finder
	 */
	public void setInspectionRecordAttachFinder(
		InspectionRecordAttachFinder inspectionRecordAttachFinder) {
		this.inspectionRecordAttachFinder = inspectionRecordAttachFinder;
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
	 * Returns the inspection record spec finder.
	 *
	 * @return the inspection record spec finder
	 */
	public InspectionRecordSpecFinder getInspectionRecordSpecFinder() {
		return inspectionRecordSpecFinder;
	}

	/**
	 * Sets the inspection record spec finder.
	 *
	 * @param inspectionRecordSpecFinder the inspection record spec finder
	 */
	public void setInspectionRecordSpecFinder(
		InspectionRecordSpecFinder inspectionRecordSpecFinder) {
		this.inspectionRecordSpecFinder = inspectionRecordSpecFinder;
	}

	/**
	 * Returns the new exchange rate local service.
	 *
	 * @return the new exchange rate local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateLocalService getNewExchangeRateLocalService() {
		return newExchangeRateLocalService;
	}

	/**
	 * Sets the new exchange rate local service.
	 *
	 * @param newExchangeRateLocalService the new exchange rate local service
	 */
	public void setNewExchangeRateLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateLocalService newExchangeRateLocalService) {
		this.newExchangeRateLocalService = newExchangeRateLocalService;
	}

	/**
	 * Returns the new exchange rate remote service.
	 *
	 * @return the new exchange rate remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateService getNewExchangeRateService() {
		return newExchangeRateService;
	}

	/**
	 * Sets the new exchange rate remote service.
	 *
	 * @param newExchangeRateService the new exchange rate remote service
	 */
	public void setNewExchangeRateService(
		vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateService newExchangeRateService) {
		this.newExchangeRateService = newExchangeRateService;
	}

	/**
	 * Returns the new exchange rate persistence.
	 *
	 * @return the new exchange rate persistence
	 */
	public NewExchangeRatePersistence getNewExchangeRatePersistence() {
		return newExchangeRatePersistence;
	}

	/**
	 * Sets the new exchange rate persistence.
	 *
	 * @param newExchangeRatePersistence the new exchange rate persistence
	 */
	public void setNewExchangeRatePersistence(
		NewExchangeRatePersistence newExchangeRatePersistence) {
		this.newExchangeRatePersistence = newExchangeRatePersistence;
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
	 * Returns the production country finder.
	 *
	 * @return the production country finder
	 */
	public ProductionCountryFinder getProductionCountryFinder() {
		return productionCountryFinder;
	}

	/**
	 * Sets the production country finder.
	 *
	 * @param productionCountryFinder the production country finder
	 */
	public void setProductionCountryFinder(
		ProductionCountryFinder productionCountryFinder) {
		this.productionCountryFinder = productionCountryFinder;
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
	 * Returns the registered inspection finder.
	 *
	 * @return the registered inspection finder
	 */
	public RegisteredInspectionFinder getRegisteredInspectionFinder() {
		return registeredInspectionFinder;
	}

	/**
	 * Sets the registered inspection finder.
	 *
	 * @param registeredInspectionFinder the registered inspection finder
	 */
	public void setRegisteredInspectionFinder(
		RegisteredInspectionFinder registeredInspectionFinder) {
		this.registeredInspectionFinder = registeredInspectionFinder;
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
	 * Returns the vehicle group finder.
	 *
	 * @return the vehicle group finder
	 */
	public VehicleGroupFinder getVehicleGroupFinder() {
		return vehicleGroupFinder;
	}

	/**
	 * Sets the vehicle group finder.
	 *
	 * @param vehicleGroupFinder the vehicle group finder
	 */
	public void setVehicleGroupFinder(VehicleGroupFinder vehicleGroupFinder) {
		this.vehicleGroupFinder = vehicleGroupFinder;
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
	 * Returns the vehicle group initial finder.
	 *
	 * @return the vehicle group initial finder
	 */
	public VehicleGroupInitialFinder getVehicleGroupInitialFinder() {
		return vehicleGroupInitialFinder;
	}

	/**
	 * Sets the vehicle group initial finder.
	 *
	 * @param vehicleGroupInitialFinder the vehicle group initial finder
	 */
	public void setVehicleGroupInitialFinder(
		VehicleGroupInitialFinder vehicleGroupInitialFinder) {
		this.vehicleGroupInitialFinder = vehicleGroupInitialFinder;
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
	 * Returns the vehicle record finder.
	 *
	 * @return the vehicle record finder
	 */
	public VehicleRecordFinder getVehicleRecordFinder() {
		return vehicleRecordFinder;
	}

	/**
	 * Sets the vehicle record finder.
	 *
	 * @param vehicleRecordFinder the vehicle record finder
	 */
	public void setVehicleRecordFinder(VehicleRecordFinder vehicleRecordFinder) {
		this.vehicleRecordFinder = vehicleRecordFinder;
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
	 * Returns the vehiclerecord initial finder.
	 *
	 * @return the vehiclerecord initial finder
	 */
	public VehiclerecordInitialFinder getVehiclerecordInitialFinder() {
		return vehiclerecordInitialFinder;
	}

	/**
	 * Sets the vehiclerecord initial finder.
	 *
	 * @param vehiclerecordInitialFinder the vehiclerecord initial finder
	 */
	public void setVehiclerecordInitialFinder(
		VehiclerecordInitialFinder vehiclerecordInitialFinder) {
		this.vehiclerecordInitialFinder = vehiclerecordInitialFinder;
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
	 * Returns the vehicle specification finder.
	 *
	 * @return the vehicle specification finder
	 */
	public VehicleSpecificationFinder getVehicleSpecificationFinder() {
		return vehicleSpecificationFinder;
	}

	/**
	 * Sets the vehicle specification finder.
	 *
	 * @param vehicleSpecificationFinder the vehicle specification finder
	 */
	public void setVehicleSpecificationFinder(
		VehicleSpecificationFinder vehicleSpecificationFinder) {
		this.vehicleSpecificationFinder = vehicleSpecificationFinder;
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
	 * Returns the vehicle statistics finder.
	 *
	 * @return the vehicle statistics finder
	 */
	public VehicleStatisticsFinder getVehicleStatisticsFinder() {
		return vehicleStatisticsFinder;
	}

	/**
	 * Sets the vehicle statistics finder.
	 *
	 * @param vehicleStatisticsFinder the vehicle statistics finder
	 */
	public void setVehicleStatisticsFinder(
		VehicleStatisticsFinder vehicleStatisticsFinder) {
		this.vehicleStatisticsFinder = vehicleStatisticsFinder;
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
	 * Returns the view trung so khung dong co finder.
	 *
	 * @return the view trung so khung dong co finder
	 */
	public ViewTrungSoKhungDongCoFinder getViewTrungSoKhungDongCoFinder() {
		return viewTrungSoKhungDongCoFinder;
	}

	/**
	 * Sets the view trung so khung dong co finder.
	 *
	 * @param viewTrungSoKhungDongCoFinder the view trung so khung dong co finder
	 */
	public void setViewTrungSoKhungDongCoFinder(
		ViewTrungSoKhungDongCoFinder viewTrungSoKhungDongCoFinder) {
		this.viewTrungSoKhungDongCoFinder = viewTrungSoKhungDongCoFinder;
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

	/**
	 * Returns the api local service.
	 *
	 * @return the api local service
	 */
	public vn.dtt.gt.dk.dao.api.service.ApiLocalService getApiLocalService() {
		return apiLocalService;
	}

	/**
	 * Sets the api local service.
	 *
	 * @param apiLocalService the api local service
	 */
	public void setApiLocalService(
		vn.dtt.gt.dk.dao.api.service.ApiLocalService apiLocalService) {
		this.apiLocalService = apiLocalService;
	}

	/**
	 * Returns the api remote service.
	 *
	 * @return the api remote service
	 */
	public vn.dtt.gt.dk.dao.api.service.ApiService getApiService() {
		return apiService;
	}

	/**
	 * Sets the api remote service.
	 *
	 * @param apiService the api remote service
	 */
	public void setApiService(
		vn.dtt.gt.dk.dao.api.service.ApiService apiService) {
		this.apiService = apiService;
	}

	/**
	 * Returns the api persistence.
	 *
	 * @return the api persistence
	 */
	public ApiPersistence getApiPersistence() {
		return apiPersistence;
	}

	/**
	 * Sets the api persistence.
	 *
	 * @param apiPersistence the api persistence
	 */
	public void setApiPersistence(ApiPersistence apiPersistence) {
		this.apiPersistence = apiPersistence;
	}

	/**
	 * Returns the tthc ho so thu tuc local service.
	 *
	 * @return the tthc ho so thu tuc local service
	 */
	public vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalService getTthcHoSoThuTucLocalService() {
		return tthcHoSoThuTucLocalService;
	}

	/**
	 * Sets the tthc ho so thu tuc local service.
	 *
	 * @param tthcHoSoThuTucLocalService the tthc ho so thu tuc local service
	 */
	public void setTthcHoSoThuTucLocalService(
		vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalService tthcHoSoThuTucLocalService) {
		this.tthcHoSoThuTucLocalService = tthcHoSoThuTucLocalService;
	}

	/**
	 * Returns the tthc ho so thu tuc remote service.
	 *
	 * @return the tthc ho so thu tuc remote service
	 */
	public vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucService getTthcHoSoThuTucService() {
		return tthcHoSoThuTucService;
	}

	/**
	 * Sets the tthc ho so thu tuc remote service.
	 *
	 * @param tthcHoSoThuTucService the tthc ho so thu tuc remote service
	 */
	public void setTthcHoSoThuTucService(
		vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucService tthcHoSoThuTucService) {
		this.tthcHoSoThuTucService = tthcHoSoThuTucService;
	}

	/**
	 * Returns the tthc ho so thu tuc persistence.
	 *
	 * @return the tthc ho so thu tuc persistence
	 */
	public TthcHoSoThuTucPersistence getTthcHoSoThuTucPersistence() {
		return tthcHoSoThuTucPersistence;
	}

	/**
	 * Sets the tthc ho so thu tuc persistence.
	 *
	 * @param tthcHoSoThuTucPersistence the tthc ho so thu tuc persistence
	 */
	public void setTthcHoSoThuTucPersistence(
		TthcHoSoThuTucPersistence tthcHoSoThuTucPersistence) {
		this.tthcHoSoThuTucPersistence = tthcHoSoThuTucPersistence;
	}

	/**
	 * Returns the tthc noidung ho so local service.
	 *
	 * @return the tthc noidung ho so local service
	 */
	public vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalService getTthcNoidungHoSoLocalService() {
		return tthcNoidungHoSoLocalService;
	}

	/**
	 * Sets the tthc noidung ho so local service.
	 *
	 * @param tthcNoidungHoSoLocalService the tthc noidung ho so local service
	 */
	public void setTthcNoidungHoSoLocalService(
		vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalService tthcNoidungHoSoLocalService) {
		this.tthcNoidungHoSoLocalService = tthcNoidungHoSoLocalService;
	}

	/**
	 * Returns the tthc noidung ho so remote service.
	 *
	 * @return the tthc noidung ho so remote service
	 */
	public vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoService getTthcNoidungHoSoService() {
		return tthcNoidungHoSoService;
	}

	/**
	 * Sets the tthc noidung ho so remote service.
	 *
	 * @param tthcNoidungHoSoService the tthc noidung ho so remote service
	 */
	public void setTthcNoidungHoSoService(
		vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoService tthcNoidungHoSoService) {
		this.tthcNoidungHoSoService = tthcNoidungHoSoService;
	}

	/**
	 * Returns the tthc noidung ho so persistence.
	 *
	 * @return the tthc noidung ho so persistence
	 */
	public TthcNoidungHoSoPersistence getTthcNoidungHoSoPersistence() {
		return tthcNoidungHoSoPersistence;
	}

	/**
	 * Sets the tthc noidung ho so persistence.
	 *
	 * @param tthcNoidungHoSoPersistence the tthc noidung ho so persistence
	 */
	public void setTthcNoidungHoSoPersistence(
		TthcNoidungHoSoPersistence tthcNoidungHoSoPersistence) {
		this.tthcNoidungHoSoPersistence = tthcNoidungHoSoPersistence;
	}

	/**
	 * Returns the tthc noidung ho so finder.
	 *
	 * @return the tthc noidung ho so finder
	 */
	public TthcNoidungHoSoFinder getTthcNoidungHoSoFinder() {
		return tthcNoidungHoSoFinder;
	}

	/**
	 * Sets the tthc noidung ho so finder.
	 *
	 * @param tthcNoidungHoSoFinder the tthc noidung ho so finder
	 */
	public void setTthcNoidungHoSoFinder(
		TthcNoidungHoSoFinder tthcNoidungHoSoFinder) {
		this.tthcNoidungHoSoFinder = tthcNoidungHoSoFinder;
	}

	/**
	 * Returns the tthc phan nhom ho so vai tro local service.
	 *
	 * @return the tthc phan nhom ho so vai tro local service
	 */
	public vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoVaiTroLocalService getTthcPhanNhomHoSoVaiTroLocalService() {
		return tthcPhanNhomHoSoVaiTroLocalService;
	}

	/**
	 * Sets the tthc phan nhom ho so vai tro local service.
	 *
	 * @param tthcPhanNhomHoSoVaiTroLocalService the tthc phan nhom ho so vai tro local service
	 */
	public void setTthcPhanNhomHoSoVaiTroLocalService(
		vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoVaiTroLocalService tthcPhanNhomHoSoVaiTroLocalService) {
		this.tthcPhanNhomHoSoVaiTroLocalService = tthcPhanNhomHoSoVaiTroLocalService;
	}

	/**
	 * Returns the tthc phan nhom ho so vai tro persistence.
	 *
	 * @return the tthc phan nhom ho so vai tro persistence
	 */
	public TthcPhanNhomHoSoVaiTroPersistence getTthcPhanNhomHoSoVaiTroPersistence() {
		return tthcPhanNhomHoSoVaiTroPersistence;
	}

	/**
	 * Sets the tthc phan nhom ho so vai tro persistence.
	 *
	 * @param tthcPhanNhomHoSoVaiTroPersistence the tthc phan nhom ho so vai tro persistence
	 */
	public void setTthcPhanNhomHoSoVaiTroPersistence(
		TthcPhanNhomHoSoVaiTroPersistence tthcPhanNhomHoSoVaiTroPersistence) {
		this.tthcPhanNhomHoSoVaiTroPersistence = tthcPhanNhomHoSoVaiTroPersistence;
	}

	/**
	 * Returns the tthc phan nhom ho so vai tro finder.
	 *
	 * @return the tthc phan nhom ho so vai tro finder
	 */
	public TthcPhanNhomHoSoVaiTroFinder getTthcPhanNhomHoSoVaiTroFinder() {
		return tthcPhanNhomHoSoVaiTroFinder;
	}

	/**
	 * Sets the tthc phan nhom ho so vai tro finder.
	 *
	 * @param tthcPhanNhomHoSoVaiTroFinder the tthc phan nhom ho so vai tro finder
	 */
	public void setTthcPhanNhomHoSoVaiTroFinder(
		TthcPhanNhomHoSoVaiTroFinder tthcPhanNhomHoSoVaiTroFinder) {
		this.tthcPhanNhomHoSoVaiTroFinder = tthcPhanNhomHoSoVaiTroFinder;
	}

	/**
	 * Returns the mot cua chuyen dich trang thai local service.
	 *
	 * @return the mot cua chuyen dich trang thai local service
	 */
	public vn.dtt.gt.dk.dao.motcua.service.MotCuaChuyenDichTrangThaiLocalService getMotCuaChuyenDichTrangThaiLocalService() {
		return motCuaChuyenDichTrangThaiLocalService;
	}

	/**
	 * Sets the mot cua chuyen dich trang thai local service.
	 *
	 * @param motCuaChuyenDichTrangThaiLocalService the mot cua chuyen dich trang thai local service
	 */
	public void setMotCuaChuyenDichTrangThaiLocalService(
		vn.dtt.gt.dk.dao.motcua.service.MotCuaChuyenDichTrangThaiLocalService motCuaChuyenDichTrangThaiLocalService) {
		this.motCuaChuyenDichTrangThaiLocalService = motCuaChuyenDichTrangThaiLocalService;
	}

	/**
	 * Returns the mot cua chuyen dich trang thai persistence.
	 *
	 * @return the mot cua chuyen dich trang thai persistence
	 */
	public MotCuaChuyenDichTrangThaiPersistence getMotCuaChuyenDichTrangThaiPersistence() {
		return motCuaChuyenDichTrangThaiPersistence;
	}

	/**
	 * Sets the mot cua chuyen dich trang thai persistence.
	 *
	 * @param motCuaChuyenDichTrangThaiPersistence the mot cua chuyen dich trang thai persistence
	 */
	public void setMotCuaChuyenDichTrangThaiPersistence(
		MotCuaChuyenDichTrangThaiPersistence motCuaChuyenDichTrangThaiPersistence) {
		this.motCuaChuyenDichTrangThaiPersistence = motCuaChuyenDichTrangThaiPersistence;
	}

	/**
	 * Returns the mot cua chuyen dich trang thai finder.
	 *
	 * @return the mot cua chuyen dich trang thai finder
	 */
	public MotCuaChuyenDichTrangThaiFinder getMotCuaChuyenDichTrangThaiFinder() {
		return motCuaChuyenDichTrangThaiFinder;
	}

	/**
	 * Sets the mot cua chuyen dich trang thai finder.
	 *
	 * @param motCuaChuyenDichTrangThaiFinder the mot cua chuyen dich trang thai finder
	 */
	public void setMotCuaChuyenDichTrangThaiFinder(
		MotCuaChuyenDichTrangThaiFinder motCuaChuyenDichTrangThaiFinder) {
		this.motCuaChuyenDichTrangThaiFinder = motCuaChuyenDichTrangThaiFinder;
	}

	/**
	 * Returns the mot cua dien bien ho so local service.
	 *
	 * @return the mot cua dien bien ho so local service
	 */
	public vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoLocalService getMotCuaDienBienHoSoLocalService() {
		return motCuaDienBienHoSoLocalService;
	}

	/**
	 * Sets the mot cua dien bien ho so local service.
	 *
	 * @param motCuaDienBienHoSoLocalService the mot cua dien bien ho so local service
	 */
	public void setMotCuaDienBienHoSoLocalService(
		vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoLocalService motCuaDienBienHoSoLocalService) {
		this.motCuaDienBienHoSoLocalService = motCuaDienBienHoSoLocalService;
	}

	/**
	 * Returns the mot cua dien bien ho so remote service.
	 *
	 * @return the mot cua dien bien ho so remote service
	 */
	public vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoService getMotCuaDienBienHoSoService() {
		return motCuaDienBienHoSoService;
	}

	/**
	 * Sets the mot cua dien bien ho so remote service.
	 *
	 * @param motCuaDienBienHoSoService the mot cua dien bien ho so remote service
	 */
	public void setMotCuaDienBienHoSoService(
		vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoService motCuaDienBienHoSoService) {
		this.motCuaDienBienHoSoService = motCuaDienBienHoSoService;
	}

	/**
	 * Returns the mot cua dien bien ho so persistence.
	 *
	 * @return the mot cua dien bien ho so persistence
	 */
	public MotCuaDienBienHoSoPersistence getMotCuaDienBienHoSoPersistence() {
		return motCuaDienBienHoSoPersistence;
	}

	/**
	 * Sets the mot cua dien bien ho so persistence.
	 *
	 * @param motCuaDienBienHoSoPersistence the mot cua dien bien ho so persistence
	 */
	public void setMotCuaDienBienHoSoPersistence(
		MotCuaDienBienHoSoPersistence motCuaDienBienHoSoPersistence) {
		this.motCuaDienBienHoSoPersistence = motCuaDienBienHoSoPersistence;
	}

	/**
	 * Returns the mot cua dien bien ho so finder.
	 *
	 * @return the mot cua dien bien ho so finder
	 */
	public MotCuaDienBienHoSoFinder getMotCuaDienBienHoSoFinder() {
		return motCuaDienBienHoSoFinder;
	}

	/**
	 * Sets the mot cua dien bien ho so finder.
	 *
	 * @param motCuaDienBienHoSoFinder the mot cua dien bien ho so finder
	 */
	public void setMotCuaDienBienHoSoFinder(
		MotCuaDienBienHoSoFinder motCuaDienBienHoSoFinder) {
		this.motCuaDienBienHoSoFinder = motCuaDienBienHoSoFinder;
	}

	/**
	 * Returns the mot cua phieu xu ly phu local service.
	 *
	 * @return the mot cua phieu xu ly phu local service
	 */
	public vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalService getMotCuaPhieuXuLyPhuLocalService() {
		return motCuaPhieuXuLyPhuLocalService;
	}

	/**
	 * Sets the mot cua phieu xu ly phu local service.
	 *
	 * @param motCuaPhieuXuLyPhuLocalService the mot cua phieu xu ly phu local service
	 */
	public void setMotCuaPhieuXuLyPhuLocalService(
		vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalService motCuaPhieuXuLyPhuLocalService) {
		this.motCuaPhieuXuLyPhuLocalService = motCuaPhieuXuLyPhuLocalService;
	}

	/**
	 * Returns the mot cua phieu xu ly phu persistence.
	 *
	 * @return the mot cua phieu xu ly phu persistence
	 */
	public MotCuaPhieuXuLyPhuPersistence getMotCuaPhieuXuLyPhuPersistence() {
		return motCuaPhieuXuLyPhuPersistence;
	}

	/**
	 * Sets the mot cua phieu xu ly phu persistence.
	 *
	 * @param motCuaPhieuXuLyPhuPersistence the mot cua phieu xu ly phu persistence
	 */
	public void setMotCuaPhieuXuLyPhuPersistence(
		MotCuaPhieuXuLyPhuPersistence motCuaPhieuXuLyPhuPersistence) {
		this.motCuaPhieuXuLyPhuPersistence = motCuaPhieuXuLyPhuPersistence;
	}

	/**
	 * Returns the mot cua phieu xu ly phu finder.
	 *
	 * @return the mot cua phieu xu ly phu finder
	 */
	public MotCuaPhieuXuLyPhuFinder getMotCuaPhieuXuLyPhuFinder() {
		return motCuaPhieuXuLyPhuFinder;
	}

	/**
	 * Sets the mot cua phieu xu ly phu finder.
	 *
	 * @param motCuaPhieuXuLyPhuFinder the mot cua phieu xu ly phu finder
	 */
	public void setMotCuaPhieuXuLyPhuFinder(
		MotCuaPhieuXuLyPhuFinder motCuaPhieuXuLyPhuFinder) {
		this.motCuaPhieuXuLyPhuFinder = motCuaPhieuXuLyPhuFinder;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
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
		return InspectionRecord.class;
	}

	protected String getModelClassName() {
		return InspectionRecord.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = inspectionRecordPersistence.getDataSource();

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
	@BeanReference(type = CertificateCircularPersistence.class)
	protected CertificateCircularPersistence certificateCircularPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalService certificateRecordLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordService certificateRecordService;
	@BeanReference(type = CertificateRecordPersistence.class)
	protected CertificateRecordPersistence certificateRecordPersistence;
	@BeanReference(type = CertificateRecordFinder.class)
	protected CertificateRecordFinder certificateRecordFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecLocalService certificateRecordSpecLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecService certificateRecordSpecService;
	@BeanReference(type = CertificateRecordSpecPersistence.class)
	protected CertificateRecordSpecPersistence certificateRecordSpecPersistence;
	@BeanReference(type = CertificateRecordSpecFinder.class)
	protected CertificateRecordSpecFinder certificateRecordSpecFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CfgLimitTechnicalSpecLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CfgLimitTechnicalSpecLocalService cfgLimitTechnicalSpecLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CfgLimitTechnicalSpecService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CfgLimitTechnicalSpecService cfgLimitTechnicalSpecService;
	@BeanReference(type = CfgLimitTechnicalSpecPersistence.class)
	protected CfgLimitTechnicalSpecPersistence cfgLimitTechnicalSpecPersistence;
	@BeanReference(type = CfgLimitTechnicalSpecFinder.class)
	protected CfgLimitTechnicalSpecFinder cfgLimitTechnicalSpecFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecLocalService cfgTechnicalspecLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecService cfgTechnicalspecService;
	@BeanReference(type = CfgTechnicalspecPersistence.class)
	protected CfgTechnicalspecPersistence cfgTechnicalspecPersistence;
	@BeanReference(type = CfgTechnicalspecFinder.class)
	protected CfgTechnicalspecFinder cfgTechnicalspecFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalService confirmedInspectionLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionService confirmedInspectionService;
	@BeanReference(type = ConfirmedInspectionPersistence.class)
	protected ConfirmedInspectionPersistence confirmedInspectionPersistence;
	@BeanReference(type = ConfirmedInspectionFinder.class)
	protected ConfirmedInspectionFinder confirmedInspectionFinder;
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
	@BeanReference(type = CorporationInspectorFinder.class)
	protected CorporationInspectorFinder corporationInspectorFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalService corporationTeamLocalService;
	@BeanReference(type = CorporationTeamPersistence.class)
	protected CorporationTeamPersistence corporationTeamPersistence;
	@BeanReference(type = CorporationTeamFinder.class)
	protected CorporationTeamFinder corporationTeamFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewLocalService corporationViewLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewService corporationViewService;
	@BeanReference(type = CorporationViewPersistence.class)
	protected CorporationViewPersistence corporationViewPersistence;
	@BeanReference(type = CorporationViewFinder.class)
	protected CorporationViewFinder corporationViewFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationLocalService customsDeclarationLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationService customsDeclarationService;
	@BeanReference(type = CustomsDeclarationPersistence.class)
	protected CustomsDeclarationPersistence customsDeclarationPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalService debitNoteLocalService;
	@BeanReference(type = DebitNotePersistence.class)
	protected DebitNotePersistence debitNotePersistence;
	@BeanReference(type = DebitNoteFinder.class)
	protected DebitNoteFinder debitNoteFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsLocalService debitNoteDetailsLocalService;
	@BeanReference(type = DebitNoteDetailsPersistence.class)
	protected DebitNoteDetailsPersistence debitNoteDetailsPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateLocalService draftCertificateLocalService;
	@BeanReference(type = DraftCertificatePersistence.class)
	protected DraftCertificatePersistence draftCertificatePersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateSpecLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateSpecLocalService draftCertificateSpecLocalService;
	@BeanReference(type = DraftCertificateSpecPersistence.class)
	protected DraftCertificateSpecPersistence draftCertificateSpecPersistence;
	@BeanReference(type = DraftCertificateSpecFinder.class)
	protected DraftCertificateSpecFinder draftCertificateSpecFinder;
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
	@BeanReference(type = ExchangeRatePersistence.class)
	protected ExchangeRatePersistence exchangeRatePersistence;
	@BeanReference(type = ExchangeRateFinder.class)
	protected ExchangeRateFinder exchangeRateFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusLocalService inspectionCommonStatusLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusService inspectionCommonStatusService;
	@BeanReference(type = InspectionCommonStatusPersistence.class)
	protected InspectionCommonStatusPersistence inspectionCommonStatusPersistence;
	@BeanReference(type = InspectionCommonStatusFinder.class)
	protected InspectionCommonStatusFinder inspectionCommonStatusFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalService inspectionRecordLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordService inspectionRecordService;
	@BeanReference(type = InspectionRecordPersistence.class)
	protected InspectionRecordPersistence inspectionRecordPersistence;
	@BeanReference(type = InspectionRecordFinder.class)
	protected InspectionRecordFinder inspectionRecordFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachLocalService inspectionRecordAttachLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachService inspectionRecordAttachService;
	@BeanReference(type = InspectionRecordAttachPersistence.class)
	protected InspectionRecordAttachPersistence inspectionRecordAttachPersistence;
	@BeanReference(type = InspectionRecordAttachFinder.class)
	protected InspectionRecordAttachFinder inspectionRecordAttachFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecLocalService inspectionRecordSpecLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecService inspectionRecordSpecService;
	@BeanReference(type = InspectionRecordSpecPersistence.class)
	protected InspectionRecordSpecPersistence inspectionRecordSpecPersistence;
	@BeanReference(type = InspectionRecordSpecFinder.class)
	protected InspectionRecordSpecFinder inspectionRecordSpecFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateLocalService newExchangeRateLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateService newExchangeRateService;
	@BeanReference(type = NewExchangeRatePersistence.class)
	protected NewExchangeRatePersistence newExchangeRatePersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.PaymentStatusLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.PaymentStatusLocalService paymentStatusLocalService;
	@BeanReference(type = PaymentStatusPersistence.class)
	protected PaymentStatusPersistence paymentStatusPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryLocalService productionCountryLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryService productionCountryService;
	@BeanReference(type = ProductionCountryPersistence.class)
	protected ProductionCountryPersistence productionCountryPersistence;
	@BeanReference(type = ProductionCountryFinder.class)
	protected ProductionCountryFinder productionCountryFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalService registeredInspectionLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionService registeredInspectionService;
	@BeanReference(type = RegisteredInspectionPersistence.class)
	protected RegisteredInspectionPersistence registeredInspectionPersistence;
	@BeanReference(type = RegisteredInspectionFinder.class)
	protected RegisteredInspectionFinder registeredInspectionFinder;
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
	@BeanReference(type = SatetyTestReportSpecPersistence.class)
	protected SatetyTestReportSpecPersistence satetyTestReportSpecPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalService vehicleGroupLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupService vehicleGroupService;
	@BeanReference(type = VehicleGroupPersistence.class)
	protected VehicleGroupPersistence vehicleGroupPersistence;
	@BeanReference(type = VehicleGroupFinder.class)
	protected VehicleGroupFinder vehicleGroupFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialLocalService vehicleGroupInitialLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialService vehicleGroupInitialService;
	@BeanReference(type = VehicleGroupInitialPersistence.class)
	protected VehicleGroupInitialPersistence vehicleGroupInitialPersistence;
	@BeanReference(type = VehicleGroupInitialFinder.class)
	protected VehicleGroupInitialFinder vehicleGroupInitialFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupSpecLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupSpecLocalService vehicleGroupSpecLocalService;
	@BeanReference(type = VehicleGroupSpecPersistence.class)
	protected VehicleGroupSpecPersistence vehicleGroupSpecPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalService vehicleRecordLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordService vehicleRecordService;
	@BeanReference(type = VehicleRecordPersistence.class)
	protected VehicleRecordPersistence vehicleRecordPersistence;
	@BeanReference(type = VehicleRecordFinder.class)
	protected VehicleRecordFinder vehicleRecordFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalService vehiclerecordInitialLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialService vehiclerecordInitialService;
	@BeanReference(type = VehiclerecordInitialPersistence.class)
	protected VehiclerecordInitialPersistence vehiclerecordInitialPersistence;
	@BeanReference(type = VehiclerecordInitialFinder.class)
	protected VehiclerecordInitialFinder vehiclerecordInitialFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationLocalService vehicleSpecificationLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationService vehicleSpecificationService;
	@BeanReference(type = VehicleSpecificationPersistence.class)
	protected VehicleSpecificationPersistence vehicleSpecificationPersistence;
	@BeanReference(type = VehicleSpecificationFinder.class)
	protected VehicleSpecificationFinder vehicleSpecificationFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsLocalService vehicleStatisticsLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsService vehicleStatisticsService;
	@BeanReference(type = VehicleStatisticsPersistence.class)
	protected VehicleStatisticsPersistence vehicleStatisticsPersistence;
	@BeanReference(type = VehicleStatisticsFinder.class)
	protected VehicleStatisticsFinder vehicleStatisticsFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ViewTrungSoKhungDongCoLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ViewTrungSoKhungDongCoLocalService viewTrungSoKhungDongCoLocalService;
	@BeanReference(type = ViewTrungSoKhungDongCoPersistence.class)
	protected ViewTrungSoKhungDongCoPersistence viewTrungSoKhungDongCoPersistence;
	@BeanReference(type = ViewTrungSoKhungDongCoFinder.class)
	protected ViewTrungSoKhungDongCoFinder viewTrungSoKhungDongCoFinder;
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
	@BeanReference(type = vn.dtt.gt.dk.dao.api.service.ApiLocalService.class)
	protected vn.dtt.gt.dk.dao.api.service.ApiLocalService apiLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.api.service.ApiService.class)
	protected vn.dtt.gt.dk.dao.api.service.ApiService apiService;
	@BeanReference(type = ApiPersistence.class)
	protected ApiPersistence apiPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalService.class)
	protected vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalService tthcHoSoThuTucLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucService.class)
	protected vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucService tthcHoSoThuTucService;
	@BeanReference(type = TthcHoSoThuTucPersistence.class)
	protected TthcHoSoThuTucPersistence tthcHoSoThuTucPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalService.class)
	protected vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalService tthcNoidungHoSoLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoService.class)
	protected vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoService tthcNoidungHoSoService;
	@BeanReference(type = TthcNoidungHoSoPersistence.class)
	protected TthcNoidungHoSoPersistence tthcNoidungHoSoPersistence;
	@BeanReference(type = TthcNoidungHoSoFinder.class)
	protected TthcNoidungHoSoFinder tthcNoidungHoSoFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoVaiTroLocalService.class)
	protected vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoVaiTroLocalService tthcPhanNhomHoSoVaiTroLocalService;
	@BeanReference(type = TthcPhanNhomHoSoVaiTroPersistence.class)
	protected TthcPhanNhomHoSoVaiTroPersistence tthcPhanNhomHoSoVaiTroPersistence;
	@BeanReference(type = TthcPhanNhomHoSoVaiTroFinder.class)
	protected TthcPhanNhomHoSoVaiTroFinder tthcPhanNhomHoSoVaiTroFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.motcua.service.MotCuaChuyenDichTrangThaiLocalService.class)
	protected vn.dtt.gt.dk.dao.motcua.service.MotCuaChuyenDichTrangThaiLocalService motCuaChuyenDichTrangThaiLocalService;
	@BeanReference(type = MotCuaChuyenDichTrangThaiPersistence.class)
	protected MotCuaChuyenDichTrangThaiPersistence motCuaChuyenDichTrangThaiPersistence;
	@BeanReference(type = MotCuaChuyenDichTrangThaiFinder.class)
	protected MotCuaChuyenDichTrangThaiFinder motCuaChuyenDichTrangThaiFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoLocalService.class)
	protected vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoLocalService motCuaDienBienHoSoLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoService.class)
	protected vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoService motCuaDienBienHoSoService;
	@BeanReference(type = MotCuaDienBienHoSoPersistence.class)
	protected MotCuaDienBienHoSoPersistence motCuaDienBienHoSoPersistence;
	@BeanReference(type = MotCuaDienBienHoSoFinder.class)
	protected MotCuaDienBienHoSoFinder motCuaDienBienHoSoFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalService.class)
	protected vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalService motCuaPhieuXuLyPhuLocalService;
	@BeanReference(type = MotCuaPhieuXuLyPhuPersistence.class)
	protected MotCuaPhieuXuLyPhuPersistence motCuaPhieuXuLyPhuPersistence;
	@BeanReference(type = MotCuaPhieuXuLyPhuFinder.class)
	protected MotCuaPhieuXuLyPhuFinder motCuaPhieuXuLyPhuFinder;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private InspectionRecordServiceClpInvoker _clpInvoker = new InspectionRecordServiceClpInvoker();
}