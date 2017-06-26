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

import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusLocalService;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ActionLogFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ActionLogPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.AssessmentPeriodFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.AssessmentPeriodPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.AssessmentSpecificationConfigFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.AssessmentSpecificationConfigPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.AssessmentSpecificationFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.AssessmentSpecificationPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.AssessmentofImporterControlFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.AssessmentofImporterControlPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.AssessmentofImporterFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.AssessmentofImporterPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.AssessmentofInspectionMethodFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.AssessmentofInspectionMethodPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.AssessmentofInspectorFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.AssessmentofInspectorPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.AssessmentofProductFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.AssessmentofProductPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CertificateCircularPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CertificateRecordFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CertificateRecordPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CertificateRecordSpecFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CertificateRecordSpecPersistence;
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
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ImportedXCDFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.ImportedXCDPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.InspectionCommonStatusFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.InspectionCommonStatusPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.InspectionRecordAttachPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.InspectionRecordFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.InspectionRecordPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.InspectionRecordSpecFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.InspectionRecordSpecPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.IssueCategoryFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.IssueCategoryPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.IssueTrackingFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.IssueTrackingPersistence;
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
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.THONGSOCHUNGCHIDONGCOFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.THONGSOCHUNGCHIDONGCOPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.THONGSOCHUNGCHIXEBONBANHFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.THONGSOCHUNGCHIXEBONBANHPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.THONGSOCHUNGCHIXECHUYENDUNGFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.THONGSOCHUNGCHIXECHUYENDUNGPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.THONGSOCHUNGCHIXECOGIOIFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.THONGSOCHUNGCHIXECOGIOIPHAN2Persistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.THONGSOCHUNGCHIXECOGIOIPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.THONGSOCHUNGCHIXEDAPDIENFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.THONGSOCHUNGCHIXEDAPDIENPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.THONGSOCHUNGCHIXEMAYFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.THONGSOCHUNGCHIXEMAYPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehicleCertificateFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehicleCertificatePersistence;
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

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the inspection common status local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.InspectionCommonStatusLocalServiceImpl}.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.impl.InspectionCommonStatusLocalServiceImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusLocalServiceUtil
 * @generated
 */
public abstract class InspectionCommonStatusLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements InspectionCommonStatusLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusLocalServiceUtil} to access the inspection common status local service.
	 */

	/**
	 * Adds the inspection common status to the database. Also notifies the appropriate model listeners.
	 *
	 * @param inspectionCommonStatus the inspection common status
	 * @return the inspection common status that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public InspectionCommonStatus addInspectionCommonStatus(
		InspectionCommonStatus inspectionCommonStatus)
		throws SystemException {
		inspectionCommonStatus.setNew(true);

		return inspectionCommonStatusPersistence.update(inspectionCommonStatus);
	}

	/**
	 * Creates a new inspection common status with the primary key. Does not add the inspection common status to the database.
	 *
	 * @param id the primary key for the new inspection common status
	 * @return the new inspection common status
	 */
	@Override
	public InspectionCommonStatus createInspectionCommonStatus(long id) {
		return inspectionCommonStatusPersistence.create(id);
	}

	/**
	 * Deletes the inspection common status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the inspection common status
	 * @return the inspection common status that was removed
	 * @throws PortalException if a inspection common status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public InspectionCommonStatus deleteInspectionCommonStatus(long id)
		throws PortalException, SystemException {
		return inspectionCommonStatusPersistence.remove(id);
	}

	/**
	 * Deletes the inspection common status from the database. Also notifies the appropriate model listeners.
	 *
	 * @param inspectionCommonStatus the inspection common status
	 * @return the inspection common status that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public InspectionCommonStatus deleteInspectionCommonStatus(
		InspectionCommonStatus inspectionCommonStatus)
		throws SystemException {
		return inspectionCommonStatusPersistence.remove(inspectionCommonStatus);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(InspectionCommonStatus.class,
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
		return inspectionCommonStatusPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return inspectionCommonStatusPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return inspectionCommonStatusPersistence.findWithDynamicQuery(dynamicQuery,
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
		return inspectionCommonStatusPersistence.countWithDynamicQuery(dynamicQuery);
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
		return inspectionCommonStatusPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public InspectionCommonStatus fetchInspectionCommonStatus(long id)
		throws SystemException {
		return inspectionCommonStatusPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the inspection common status with the primary key.
	 *
	 * @param id the primary key of the inspection common status
	 * @return the inspection common status
	 * @throws PortalException if a inspection common status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InspectionCommonStatus getInspectionCommonStatus(long id)
		throws PortalException, SystemException {
		return inspectionCommonStatusPersistence.findByPrimaryKey(id);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return inspectionCommonStatusPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the inspection common statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of inspection common statuses
	 * @param end the upper bound of the range of inspection common statuses (not inclusive)
	 * @return the range of inspection common statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InspectionCommonStatus> getInspectionCommonStatuses(int start,
		int end) throws SystemException {
		return inspectionCommonStatusPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of inspection common statuses.
	 *
	 * @return the number of inspection common statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getInspectionCommonStatusesCount() throws SystemException {
		return inspectionCommonStatusPersistence.countAll();
	}

	/**
	 * Updates the inspection common status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param inspectionCommonStatus the inspection common status
	 * @return the inspection common status that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public InspectionCommonStatus updateInspectionCommonStatus(
		InspectionCommonStatus inspectionCommonStatus)
		throws SystemException {
		return inspectionCommonStatusPersistence.update(inspectionCommonStatus);
	}

	/**
	 * Returns the action log local service.
	 *
	 * @return the action log local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.ActionLogLocalService getActionLogLocalService() {
		return actionLogLocalService;
	}

	/**
	 * Sets the action log local service.
	 *
	 * @param actionLogLocalService the action log local service
	 */
	public void setActionLogLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.ActionLogLocalService actionLogLocalService) {
		this.actionLogLocalService = actionLogLocalService;
	}

	/**
	 * Returns the action log remote service.
	 *
	 * @return the action log remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.ActionLogService getActionLogService() {
		return actionLogService;
	}

	/**
	 * Sets the action log remote service.
	 *
	 * @param actionLogService the action log remote service
	 */
	public void setActionLogService(
		vn.dtt.gt.dk.dao.nghiepvu.service.ActionLogService actionLogService) {
		this.actionLogService = actionLogService;
	}

	/**
	 * Returns the action log persistence.
	 *
	 * @return the action log persistence
	 */
	public ActionLogPersistence getActionLogPersistence() {
		return actionLogPersistence;
	}

	/**
	 * Sets the action log persistence.
	 *
	 * @param actionLogPersistence the action log persistence
	 */
	public void setActionLogPersistence(
		ActionLogPersistence actionLogPersistence) {
		this.actionLogPersistence = actionLogPersistence;
	}

	/**
	 * Returns the action log finder.
	 *
	 * @return the action log finder
	 */
	public ActionLogFinder getActionLogFinder() {
		return actionLogFinder;
	}

	/**
	 * Sets the action log finder.
	 *
	 * @param actionLogFinder the action log finder
	 */
	public void setActionLogFinder(ActionLogFinder actionLogFinder) {
		this.actionLogFinder = actionLogFinder;
	}

	/**
	 * Returns the assessmentof importer local service.
	 *
	 * @return the assessmentof importer local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterLocalService getAssessmentofImporterLocalService() {
		return assessmentofImporterLocalService;
	}

	/**
	 * Sets the assessmentof importer local service.
	 *
	 * @param assessmentofImporterLocalService the assessmentof importer local service
	 */
	public void setAssessmentofImporterLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterLocalService assessmentofImporterLocalService) {
		this.assessmentofImporterLocalService = assessmentofImporterLocalService;
	}

	/**
	 * Returns the assessmentof importer remote service.
	 *
	 * @return the assessmentof importer remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterService getAssessmentofImporterService() {
		return assessmentofImporterService;
	}

	/**
	 * Sets the assessmentof importer remote service.
	 *
	 * @param assessmentofImporterService the assessmentof importer remote service
	 */
	public void setAssessmentofImporterService(
		vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterService assessmentofImporterService) {
		this.assessmentofImporterService = assessmentofImporterService;
	}

	/**
	 * Returns the assessmentof importer persistence.
	 *
	 * @return the assessmentof importer persistence
	 */
	public AssessmentofImporterPersistence getAssessmentofImporterPersistence() {
		return assessmentofImporterPersistence;
	}

	/**
	 * Sets the assessmentof importer persistence.
	 *
	 * @param assessmentofImporterPersistence the assessmentof importer persistence
	 */
	public void setAssessmentofImporterPersistence(
		AssessmentofImporterPersistence assessmentofImporterPersistence) {
		this.assessmentofImporterPersistence = assessmentofImporterPersistence;
	}

	/**
	 * Returns the assessmentof importer finder.
	 *
	 * @return the assessmentof importer finder
	 */
	public AssessmentofImporterFinder getAssessmentofImporterFinder() {
		return assessmentofImporterFinder;
	}

	/**
	 * Sets the assessmentof importer finder.
	 *
	 * @param assessmentofImporterFinder the assessmentof importer finder
	 */
	public void setAssessmentofImporterFinder(
		AssessmentofImporterFinder assessmentofImporterFinder) {
		this.assessmentofImporterFinder = assessmentofImporterFinder;
	}

	/**
	 * Returns the assessmentof importer control local service.
	 *
	 * @return the assessmentof importer control local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterControlLocalService getAssessmentofImporterControlLocalService() {
		return assessmentofImporterControlLocalService;
	}

	/**
	 * Sets the assessmentof importer control local service.
	 *
	 * @param assessmentofImporterControlLocalService the assessmentof importer control local service
	 */
	public void setAssessmentofImporterControlLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterControlLocalService assessmentofImporterControlLocalService) {
		this.assessmentofImporterControlLocalService = assessmentofImporterControlLocalService;
	}

	/**
	 * Returns the assessmentof importer control remote service.
	 *
	 * @return the assessmentof importer control remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterControlService getAssessmentofImporterControlService() {
		return assessmentofImporterControlService;
	}

	/**
	 * Sets the assessmentof importer control remote service.
	 *
	 * @param assessmentofImporterControlService the assessmentof importer control remote service
	 */
	public void setAssessmentofImporterControlService(
		vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterControlService assessmentofImporterControlService) {
		this.assessmentofImporterControlService = assessmentofImporterControlService;
	}

	/**
	 * Returns the assessmentof importer control persistence.
	 *
	 * @return the assessmentof importer control persistence
	 */
	public AssessmentofImporterControlPersistence getAssessmentofImporterControlPersistence() {
		return assessmentofImporterControlPersistence;
	}

	/**
	 * Sets the assessmentof importer control persistence.
	 *
	 * @param assessmentofImporterControlPersistence the assessmentof importer control persistence
	 */
	public void setAssessmentofImporterControlPersistence(
		AssessmentofImporterControlPersistence assessmentofImporterControlPersistence) {
		this.assessmentofImporterControlPersistence = assessmentofImporterControlPersistence;
	}

	/**
	 * Returns the assessmentof importer control finder.
	 *
	 * @return the assessmentof importer control finder
	 */
	public AssessmentofImporterControlFinder getAssessmentofImporterControlFinder() {
		return assessmentofImporterControlFinder;
	}

	/**
	 * Sets the assessmentof importer control finder.
	 *
	 * @param assessmentofImporterControlFinder the assessmentof importer control finder
	 */
	public void setAssessmentofImporterControlFinder(
		AssessmentofImporterControlFinder assessmentofImporterControlFinder) {
		this.assessmentofImporterControlFinder = assessmentofImporterControlFinder;
	}

	/**
	 * Returns the assessmentof inspection method local service.
	 *
	 * @return the assessmentof inspection method local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectionMethodLocalService getAssessmentofInspectionMethodLocalService() {
		return assessmentofInspectionMethodLocalService;
	}

	/**
	 * Sets the assessmentof inspection method local service.
	 *
	 * @param assessmentofInspectionMethodLocalService the assessmentof inspection method local service
	 */
	public void setAssessmentofInspectionMethodLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectionMethodLocalService assessmentofInspectionMethodLocalService) {
		this.assessmentofInspectionMethodLocalService = assessmentofInspectionMethodLocalService;
	}

	/**
	 * Returns the assessmentof inspection method remote service.
	 *
	 * @return the assessmentof inspection method remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectionMethodService getAssessmentofInspectionMethodService() {
		return assessmentofInspectionMethodService;
	}

	/**
	 * Sets the assessmentof inspection method remote service.
	 *
	 * @param assessmentofInspectionMethodService the assessmentof inspection method remote service
	 */
	public void setAssessmentofInspectionMethodService(
		vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectionMethodService assessmentofInspectionMethodService) {
		this.assessmentofInspectionMethodService = assessmentofInspectionMethodService;
	}

	/**
	 * Returns the assessmentof inspection method persistence.
	 *
	 * @return the assessmentof inspection method persistence
	 */
	public AssessmentofInspectionMethodPersistence getAssessmentofInspectionMethodPersistence() {
		return assessmentofInspectionMethodPersistence;
	}

	/**
	 * Sets the assessmentof inspection method persistence.
	 *
	 * @param assessmentofInspectionMethodPersistence the assessmentof inspection method persistence
	 */
	public void setAssessmentofInspectionMethodPersistence(
		AssessmentofInspectionMethodPersistence assessmentofInspectionMethodPersistence) {
		this.assessmentofInspectionMethodPersistence = assessmentofInspectionMethodPersistence;
	}

	/**
	 * Returns the assessmentof inspection method finder.
	 *
	 * @return the assessmentof inspection method finder
	 */
	public AssessmentofInspectionMethodFinder getAssessmentofInspectionMethodFinder() {
		return assessmentofInspectionMethodFinder;
	}

	/**
	 * Sets the assessmentof inspection method finder.
	 *
	 * @param assessmentofInspectionMethodFinder the assessmentof inspection method finder
	 */
	public void setAssessmentofInspectionMethodFinder(
		AssessmentofInspectionMethodFinder assessmentofInspectionMethodFinder) {
		this.assessmentofInspectionMethodFinder = assessmentofInspectionMethodFinder;
	}

	/**
	 * Returns the assessmentof inspector local service.
	 *
	 * @return the assessmentof inspector local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectorLocalService getAssessmentofInspectorLocalService() {
		return assessmentofInspectorLocalService;
	}

	/**
	 * Sets the assessmentof inspector local service.
	 *
	 * @param assessmentofInspectorLocalService the assessmentof inspector local service
	 */
	public void setAssessmentofInspectorLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectorLocalService assessmentofInspectorLocalService) {
		this.assessmentofInspectorLocalService = assessmentofInspectorLocalService;
	}

	/**
	 * Returns the assessmentof inspector remote service.
	 *
	 * @return the assessmentof inspector remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectorService getAssessmentofInspectorService() {
		return assessmentofInspectorService;
	}

	/**
	 * Sets the assessmentof inspector remote service.
	 *
	 * @param assessmentofInspectorService the assessmentof inspector remote service
	 */
	public void setAssessmentofInspectorService(
		vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectorService assessmentofInspectorService) {
		this.assessmentofInspectorService = assessmentofInspectorService;
	}

	/**
	 * Returns the assessmentof inspector persistence.
	 *
	 * @return the assessmentof inspector persistence
	 */
	public AssessmentofInspectorPersistence getAssessmentofInspectorPersistence() {
		return assessmentofInspectorPersistence;
	}

	/**
	 * Sets the assessmentof inspector persistence.
	 *
	 * @param assessmentofInspectorPersistence the assessmentof inspector persistence
	 */
	public void setAssessmentofInspectorPersistence(
		AssessmentofInspectorPersistence assessmentofInspectorPersistence) {
		this.assessmentofInspectorPersistence = assessmentofInspectorPersistence;
	}

	/**
	 * Returns the assessmentof inspector finder.
	 *
	 * @return the assessmentof inspector finder
	 */
	public AssessmentofInspectorFinder getAssessmentofInspectorFinder() {
		return assessmentofInspectorFinder;
	}

	/**
	 * Sets the assessmentof inspector finder.
	 *
	 * @param assessmentofInspectorFinder the assessmentof inspector finder
	 */
	public void setAssessmentofInspectorFinder(
		AssessmentofInspectorFinder assessmentofInspectorFinder) {
		this.assessmentofInspectorFinder = assessmentofInspectorFinder;
	}

	/**
	 * Returns the assessmentof product local service.
	 *
	 * @return the assessmentof product local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofProductLocalService getAssessmentofProductLocalService() {
		return assessmentofProductLocalService;
	}

	/**
	 * Sets the assessmentof product local service.
	 *
	 * @param assessmentofProductLocalService the assessmentof product local service
	 */
	public void setAssessmentofProductLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofProductLocalService assessmentofProductLocalService) {
		this.assessmentofProductLocalService = assessmentofProductLocalService;
	}

	/**
	 * Returns the assessmentof product remote service.
	 *
	 * @return the assessmentof product remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofProductService getAssessmentofProductService() {
		return assessmentofProductService;
	}

	/**
	 * Sets the assessmentof product remote service.
	 *
	 * @param assessmentofProductService the assessmentof product remote service
	 */
	public void setAssessmentofProductService(
		vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofProductService assessmentofProductService) {
		this.assessmentofProductService = assessmentofProductService;
	}

	/**
	 * Returns the assessmentof product persistence.
	 *
	 * @return the assessmentof product persistence
	 */
	public AssessmentofProductPersistence getAssessmentofProductPersistence() {
		return assessmentofProductPersistence;
	}

	/**
	 * Sets the assessmentof product persistence.
	 *
	 * @param assessmentofProductPersistence the assessmentof product persistence
	 */
	public void setAssessmentofProductPersistence(
		AssessmentofProductPersistence assessmentofProductPersistence) {
		this.assessmentofProductPersistence = assessmentofProductPersistence;
	}

	/**
	 * Returns the assessmentof product finder.
	 *
	 * @return the assessmentof product finder
	 */
	public AssessmentofProductFinder getAssessmentofProductFinder() {
		return assessmentofProductFinder;
	}

	/**
	 * Sets the assessmentof product finder.
	 *
	 * @param assessmentofProductFinder the assessmentof product finder
	 */
	public void setAssessmentofProductFinder(
		AssessmentofProductFinder assessmentofProductFinder) {
		this.assessmentofProductFinder = assessmentofProductFinder;
	}

	/**
	 * Returns the assessment period local service.
	 *
	 * @return the assessment period local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentPeriodLocalService getAssessmentPeriodLocalService() {
		return assessmentPeriodLocalService;
	}

	/**
	 * Sets the assessment period local service.
	 *
	 * @param assessmentPeriodLocalService the assessment period local service
	 */
	public void setAssessmentPeriodLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentPeriodLocalService assessmentPeriodLocalService) {
		this.assessmentPeriodLocalService = assessmentPeriodLocalService;
	}

	/**
	 * Returns the assessment period remote service.
	 *
	 * @return the assessment period remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentPeriodService getAssessmentPeriodService() {
		return assessmentPeriodService;
	}

	/**
	 * Sets the assessment period remote service.
	 *
	 * @param assessmentPeriodService the assessment period remote service
	 */
	public void setAssessmentPeriodService(
		vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentPeriodService assessmentPeriodService) {
		this.assessmentPeriodService = assessmentPeriodService;
	}

	/**
	 * Returns the assessment period persistence.
	 *
	 * @return the assessment period persistence
	 */
	public AssessmentPeriodPersistence getAssessmentPeriodPersistence() {
		return assessmentPeriodPersistence;
	}

	/**
	 * Sets the assessment period persistence.
	 *
	 * @param assessmentPeriodPersistence the assessment period persistence
	 */
	public void setAssessmentPeriodPersistence(
		AssessmentPeriodPersistence assessmentPeriodPersistence) {
		this.assessmentPeriodPersistence = assessmentPeriodPersistence;
	}

	/**
	 * Returns the assessment period finder.
	 *
	 * @return the assessment period finder
	 */
	public AssessmentPeriodFinder getAssessmentPeriodFinder() {
		return assessmentPeriodFinder;
	}

	/**
	 * Sets the assessment period finder.
	 *
	 * @param assessmentPeriodFinder the assessment period finder
	 */
	public void setAssessmentPeriodFinder(
		AssessmentPeriodFinder assessmentPeriodFinder) {
		this.assessmentPeriodFinder = assessmentPeriodFinder;
	}

	/**
	 * Returns the assessment specification local service.
	 *
	 * @return the assessment specification local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationLocalService getAssessmentSpecificationLocalService() {
		return assessmentSpecificationLocalService;
	}

	/**
	 * Sets the assessment specification local service.
	 *
	 * @param assessmentSpecificationLocalService the assessment specification local service
	 */
	public void setAssessmentSpecificationLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationLocalService assessmentSpecificationLocalService) {
		this.assessmentSpecificationLocalService = assessmentSpecificationLocalService;
	}

	/**
	 * Returns the assessment specification remote service.
	 *
	 * @return the assessment specification remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationService getAssessmentSpecificationService() {
		return assessmentSpecificationService;
	}

	/**
	 * Sets the assessment specification remote service.
	 *
	 * @param assessmentSpecificationService the assessment specification remote service
	 */
	public void setAssessmentSpecificationService(
		vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationService assessmentSpecificationService) {
		this.assessmentSpecificationService = assessmentSpecificationService;
	}

	/**
	 * Returns the assessment specification persistence.
	 *
	 * @return the assessment specification persistence
	 */
	public AssessmentSpecificationPersistence getAssessmentSpecificationPersistence() {
		return assessmentSpecificationPersistence;
	}

	/**
	 * Sets the assessment specification persistence.
	 *
	 * @param assessmentSpecificationPersistence the assessment specification persistence
	 */
	public void setAssessmentSpecificationPersistence(
		AssessmentSpecificationPersistence assessmentSpecificationPersistence) {
		this.assessmentSpecificationPersistence = assessmentSpecificationPersistence;
	}

	/**
	 * Returns the assessment specification finder.
	 *
	 * @return the assessment specification finder
	 */
	public AssessmentSpecificationFinder getAssessmentSpecificationFinder() {
		return assessmentSpecificationFinder;
	}

	/**
	 * Sets the assessment specification finder.
	 *
	 * @param assessmentSpecificationFinder the assessment specification finder
	 */
	public void setAssessmentSpecificationFinder(
		AssessmentSpecificationFinder assessmentSpecificationFinder) {
		this.assessmentSpecificationFinder = assessmentSpecificationFinder;
	}

	/**
	 * Returns the assessment specification config local service.
	 *
	 * @return the assessment specification config local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationConfigLocalService getAssessmentSpecificationConfigLocalService() {
		return assessmentSpecificationConfigLocalService;
	}

	/**
	 * Sets the assessment specification config local service.
	 *
	 * @param assessmentSpecificationConfigLocalService the assessment specification config local service
	 */
	public void setAssessmentSpecificationConfigLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationConfigLocalService assessmentSpecificationConfigLocalService) {
		this.assessmentSpecificationConfigLocalService = assessmentSpecificationConfigLocalService;
	}

	/**
	 * Returns the assessment specification config remote service.
	 *
	 * @return the assessment specification config remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationConfigService getAssessmentSpecificationConfigService() {
		return assessmentSpecificationConfigService;
	}

	/**
	 * Sets the assessment specification config remote service.
	 *
	 * @param assessmentSpecificationConfigService the assessment specification config remote service
	 */
	public void setAssessmentSpecificationConfigService(
		vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationConfigService assessmentSpecificationConfigService) {
		this.assessmentSpecificationConfigService = assessmentSpecificationConfigService;
	}

	/**
	 * Returns the assessment specification config persistence.
	 *
	 * @return the assessment specification config persistence
	 */
	public AssessmentSpecificationConfigPersistence getAssessmentSpecificationConfigPersistence() {
		return assessmentSpecificationConfigPersistence;
	}

	/**
	 * Sets the assessment specification config persistence.
	 *
	 * @param assessmentSpecificationConfigPersistence the assessment specification config persistence
	 */
	public void setAssessmentSpecificationConfigPersistence(
		AssessmentSpecificationConfigPersistence assessmentSpecificationConfigPersistence) {
		this.assessmentSpecificationConfigPersistence = assessmentSpecificationConfigPersistence;
	}

	/**
	 * Returns the assessment specification config finder.
	 *
	 * @return the assessment specification config finder
	 */
	public AssessmentSpecificationConfigFinder getAssessmentSpecificationConfigFinder() {
		return assessmentSpecificationConfigFinder;
	}

	/**
	 * Sets the assessment specification config finder.
	 *
	 * @param assessmentSpecificationConfigFinder the assessment specification config finder
	 */
	public void setAssessmentSpecificationConfigFinder(
		AssessmentSpecificationConfigFinder assessmentSpecificationConfigFinder) {
		this.assessmentSpecificationConfigFinder = assessmentSpecificationConfigFinder;
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
	 * Returns the imported x c d local service.
	 *
	 * @return the imported x c d local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.ImportedXCDLocalService getImportedXCDLocalService() {
		return importedXCDLocalService;
	}

	/**
	 * Sets the imported x c d local service.
	 *
	 * @param importedXCDLocalService the imported x c d local service
	 */
	public void setImportedXCDLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.ImportedXCDLocalService importedXCDLocalService) {
		this.importedXCDLocalService = importedXCDLocalService;
	}

	/**
	 * Returns the imported x c d remote service.
	 *
	 * @return the imported x c d remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.ImportedXCDService getImportedXCDService() {
		return importedXCDService;
	}

	/**
	 * Sets the imported x c d remote service.
	 *
	 * @param importedXCDService the imported x c d remote service
	 */
	public void setImportedXCDService(
		vn.dtt.gt.dk.dao.nghiepvu.service.ImportedXCDService importedXCDService) {
		this.importedXCDService = importedXCDService;
	}

	/**
	 * Returns the imported x c d persistence.
	 *
	 * @return the imported x c d persistence
	 */
	public ImportedXCDPersistence getImportedXCDPersistence() {
		return importedXCDPersistence;
	}

	/**
	 * Sets the imported x c d persistence.
	 *
	 * @param importedXCDPersistence the imported x c d persistence
	 */
	public void setImportedXCDPersistence(
		ImportedXCDPersistence importedXCDPersistence) {
		this.importedXCDPersistence = importedXCDPersistence;
	}

	/**
	 * Returns the imported x c d finder.
	 *
	 * @return the imported x c d finder
	 */
	public ImportedXCDFinder getImportedXCDFinder() {
		return importedXCDFinder;
	}

	/**
	 * Sets the imported x c d finder.
	 *
	 * @param importedXCDFinder the imported x c d finder
	 */
	public void setImportedXCDFinder(ImportedXCDFinder importedXCDFinder) {
		this.importedXCDFinder = importedXCDFinder;
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
	 * Returns the issue category local service.
	 *
	 * @return the issue category local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.IssueCategoryLocalService getIssueCategoryLocalService() {
		return issueCategoryLocalService;
	}

	/**
	 * Sets the issue category local service.
	 *
	 * @param issueCategoryLocalService the issue category local service
	 */
	public void setIssueCategoryLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.IssueCategoryLocalService issueCategoryLocalService) {
		this.issueCategoryLocalService = issueCategoryLocalService;
	}

	/**
	 * Returns the issue category remote service.
	 *
	 * @return the issue category remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.IssueCategoryService getIssueCategoryService() {
		return issueCategoryService;
	}

	/**
	 * Sets the issue category remote service.
	 *
	 * @param issueCategoryService the issue category remote service
	 */
	public void setIssueCategoryService(
		vn.dtt.gt.dk.dao.nghiepvu.service.IssueCategoryService issueCategoryService) {
		this.issueCategoryService = issueCategoryService;
	}

	/**
	 * Returns the issue category persistence.
	 *
	 * @return the issue category persistence
	 */
	public IssueCategoryPersistence getIssueCategoryPersistence() {
		return issueCategoryPersistence;
	}

	/**
	 * Sets the issue category persistence.
	 *
	 * @param issueCategoryPersistence the issue category persistence
	 */
	public void setIssueCategoryPersistence(
		IssueCategoryPersistence issueCategoryPersistence) {
		this.issueCategoryPersistence = issueCategoryPersistence;
	}

	/**
	 * Returns the issue category finder.
	 *
	 * @return the issue category finder
	 */
	public IssueCategoryFinder getIssueCategoryFinder() {
		return issueCategoryFinder;
	}

	/**
	 * Sets the issue category finder.
	 *
	 * @param issueCategoryFinder the issue category finder
	 */
	public void setIssueCategoryFinder(IssueCategoryFinder issueCategoryFinder) {
		this.issueCategoryFinder = issueCategoryFinder;
	}

	/**
	 * Returns the issue tracking local service.
	 *
	 * @return the issue tracking local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.IssueTrackingLocalService getIssueTrackingLocalService() {
		return issueTrackingLocalService;
	}

	/**
	 * Sets the issue tracking local service.
	 *
	 * @param issueTrackingLocalService the issue tracking local service
	 */
	public void setIssueTrackingLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.IssueTrackingLocalService issueTrackingLocalService) {
		this.issueTrackingLocalService = issueTrackingLocalService;
	}

	/**
	 * Returns the issue tracking remote service.
	 *
	 * @return the issue tracking remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.IssueTrackingService getIssueTrackingService() {
		return issueTrackingService;
	}

	/**
	 * Sets the issue tracking remote service.
	 *
	 * @param issueTrackingService the issue tracking remote service
	 */
	public void setIssueTrackingService(
		vn.dtt.gt.dk.dao.nghiepvu.service.IssueTrackingService issueTrackingService) {
		this.issueTrackingService = issueTrackingService;
	}

	/**
	 * Returns the issue tracking persistence.
	 *
	 * @return the issue tracking persistence
	 */
	public IssueTrackingPersistence getIssueTrackingPersistence() {
		return issueTrackingPersistence;
	}

	/**
	 * Sets the issue tracking persistence.
	 *
	 * @param issueTrackingPersistence the issue tracking persistence
	 */
	public void setIssueTrackingPersistence(
		IssueTrackingPersistence issueTrackingPersistence) {
		this.issueTrackingPersistence = issueTrackingPersistence;
	}

	/**
	 * Returns the issue tracking finder.
	 *
	 * @return the issue tracking finder
	 */
	public IssueTrackingFinder getIssueTrackingFinder() {
		return issueTrackingFinder;
	}

	/**
	 * Sets the issue tracking finder.
	 *
	 * @param issueTrackingFinder the issue tracking finder
	 */
	public void setIssueTrackingFinder(IssueTrackingFinder issueTrackingFinder) {
		this.issueTrackingFinder = issueTrackingFinder;
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
	 * Returns the t h o n g s o c h u n g c h i d o n g c o local service.
	 *
	 * @return the t h o n g s o c h u n g c h i d o n g c o local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIDONGCOLocalService getTHONGSOCHUNGCHIDONGCOLocalService() {
		return thongsochungchidongcoLocalService;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i d o n g c o local service.
	 *
	 * @param thongsochungchidongcoLocalService the t h o n g s o c h u n g c h i d o n g c o local service
	 */
	public void setTHONGSOCHUNGCHIDONGCOLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIDONGCOLocalService thongsochungchidongcoLocalService) {
		this.thongsochungchidongcoLocalService = thongsochungchidongcoLocalService;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i d o n g c o remote service.
	 *
	 * @return the t h o n g s o c h u n g c h i d o n g c o remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIDONGCOService getTHONGSOCHUNGCHIDONGCOService() {
		return thongsochungchidongcoService;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i d o n g c o remote service.
	 *
	 * @param thongsochungchidongcoService the t h o n g s o c h u n g c h i d o n g c o remote service
	 */
	public void setTHONGSOCHUNGCHIDONGCOService(
		vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIDONGCOService thongsochungchidongcoService) {
		this.thongsochungchidongcoService = thongsochungchidongcoService;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i d o n g c o persistence.
	 *
	 * @return the t h o n g s o c h u n g c h i d o n g c o persistence
	 */
	public THONGSOCHUNGCHIDONGCOPersistence getTHONGSOCHUNGCHIDONGCOPersistence() {
		return thongsochungchidongcoPersistence;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i d o n g c o persistence.
	 *
	 * @param thongsochungchidongcoPersistence the t h o n g s o c h u n g c h i d o n g c o persistence
	 */
	public void setTHONGSOCHUNGCHIDONGCOPersistence(
		THONGSOCHUNGCHIDONGCOPersistence thongsochungchidongcoPersistence) {
		this.thongsochungchidongcoPersistence = thongsochungchidongcoPersistence;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i d o n g c o finder.
	 *
	 * @return the t h o n g s o c h u n g c h i d o n g c o finder
	 */
	public THONGSOCHUNGCHIDONGCOFinder getTHONGSOCHUNGCHIDONGCOFinder() {
		return thongsochungchidongcoFinder;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i d o n g c o finder.
	 *
	 * @param thongsochungchidongcoFinder the t h o n g s o c h u n g c h i d o n g c o finder
	 */
	public void setTHONGSOCHUNGCHIDONGCOFinder(
		THONGSOCHUNGCHIDONGCOFinder thongsochungchidongcoFinder) {
		this.thongsochungchidongcoFinder = thongsochungchidongcoFinder;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e b o n b a n h local service.
	 *
	 * @return the t h o n g s o c h u n g c h i x e b o n b a n h local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEBONBANHLocalService getTHONGSOCHUNGCHIXEBONBANHLocalService() {
		return thongsochungchixebonbanhLocalService;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e b o n b a n h local service.
	 *
	 * @param thongsochungchixebonbanhLocalService the t h o n g s o c h u n g c h i x e b o n b a n h local service
	 */
	public void setTHONGSOCHUNGCHIXEBONBANHLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEBONBANHLocalService thongsochungchixebonbanhLocalService) {
		this.thongsochungchixebonbanhLocalService = thongsochungchixebonbanhLocalService;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e b o n b a n h remote service.
	 *
	 * @return the t h o n g s o c h u n g c h i x e b o n b a n h remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEBONBANHService getTHONGSOCHUNGCHIXEBONBANHService() {
		return thongsochungchixebonbanhService;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e b o n b a n h remote service.
	 *
	 * @param thongsochungchixebonbanhService the t h o n g s o c h u n g c h i x e b o n b a n h remote service
	 */
	public void setTHONGSOCHUNGCHIXEBONBANHService(
		vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEBONBANHService thongsochungchixebonbanhService) {
		this.thongsochungchixebonbanhService = thongsochungchixebonbanhService;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e b o n b a n h persistence.
	 *
	 * @return the t h o n g s o c h u n g c h i x e b o n b a n h persistence
	 */
	public THONGSOCHUNGCHIXEBONBANHPersistence getTHONGSOCHUNGCHIXEBONBANHPersistence() {
		return thongsochungchixebonbanhPersistence;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e b o n b a n h persistence.
	 *
	 * @param thongsochungchixebonbanhPersistence the t h o n g s o c h u n g c h i x e b o n b a n h persistence
	 */
	public void setTHONGSOCHUNGCHIXEBONBANHPersistence(
		THONGSOCHUNGCHIXEBONBANHPersistence thongsochungchixebonbanhPersistence) {
		this.thongsochungchixebonbanhPersistence = thongsochungchixebonbanhPersistence;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e b o n b a n h finder.
	 *
	 * @return the t h o n g s o c h u n g c h i x e b o n b a n h finder
	 */
	public THONGSOCHUNGCHIXEBONBANHFinder getTHONGSOCHUNGCHIXEBONBANHFinder() {
		return thongsochungchixebonbanhFinder;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e b o n b a n h finder.
	 *
	 * @param thongsochungchixebonbanhFinder the t h o n g s o c h u n g c h i x e b o n b a n h finder
	 */
	public void setTHONGSOCHUNGCHIXEBONBANHFinder(
		THONGSOCHUNGCHIXEBONBANHFinder thongsochungchixebonbanhFinder) {
		this.thongsochungchixebonbanhFinder = thongsochungchixebonbanhFinder;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c h u y e n d u n g local service.
	 *
	 * @return the t h o n g s o c h u n g c h i x e c h u y e n d u n g local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECHUYENDUNGLocalService getTHONGSOCHUNGCHIXECHUYENDUNGLocalService() {
		return thongsochungchixechuyendungLocalService;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e c h u y e n d u n g local service.
	 *
	 * @param thongsochungchixechuyendungLocalService the t h o n g s o c h u n g c h i x e c h u y e n d u n g local service
	 */
	public void setTHONGSOCHUNGCHIXECHUYENDUNGLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECHUYENDUNGLocalService thongsochungchixechuyendungLocalService) {
		this.thongsochungchixechuyendungLocalService = thongsochungchixechuyendungLocalService;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c h u y e n d u n g remote service.
	 *
	 * @return the t h o n g s o c h u n g c h i x e c h u y e n d u n g remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECHUYENDUNGService getTHONGSOCHUNGCHIXECHUYENDUNGService() {
		return thongsochungchixechuyendungService;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e c h u y e n d u n g remote service.
	 *
	 * @param thongsochungchixechuyendungService the t h o n g s o c h u n g c h i x e c h u y e n d u n g remote service
	 */
	public void setTHONGSOCHUNGCHIXECHUYENDUNGService(
		vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECHUYENDUNGService thongsochungchixechuyendungService) {
		this.thongsochungchixechuyendungService = thongsochungchixechuyendungService;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c h u y e n d u n g persistence.
	 *
	 * @return the t h o n g s o c h u n g c h i x e c h u y e n d u n g persistence
	 */
	public THONGSOCHUNGCHIXECHUYENDUNGPersistence getTHONGSOCHUNGCHIXECHUYENDUNGPersistence() {
		return thongsochungchixechuyendungPersistence;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e c h u y e n d u n g persistence.
	 *
	 * @param thongsochungchixechuyendungPersistence the t h o n g s o c h u n g c h i x e c h u y e n d u n g persistence
	 */
	public void setTHONGSOCHUNGCHIXECHUYENDUNGPersistence(
		THONGSOCHUNGCHIXECHUYENDUNGPersistence thongsochungchixechuyendungPersistence) {
		this.thongsochungchixechuyendungPersistence = thongsochungchixechuyendungPersistence;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c h u y e n d u n g finder.
	 *
	 * @return the t h o n g s o c h u n g c h i x e c h u y e n d u n g finder
	 */
	public THONGSOCHUNGCHIXECHUYENDUNGFinder getTHONGSOCHUNGCHIXECHUYENDUNGFinder() {
		return thongsochungchixechuyendungFinder;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e c h u y e n d u n g finder.
	 *
	 * @param thongsochungchixechuyendungFinder the t h o n g s o c h u n g c h i x e c h u y e n d u n g finder
	 */
	public void setTHONGSOCHUNGCHIXECHUYENDUNGFinder(
		THONGSOCHUNGCHIXECHUYENDUNGFinder thongsochungchixechuyendungFinder) {
		this.thongsochungchixechuyendungFinder = thongsochungchixechuyendungFinder;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c o g i o i local service.
	 *
	 * @return the t h o n g s o c h u n g c h i x e c o g i o i local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOILocalService getTHONGSOCHUNGCHIXECOGIOILocalService() {
		return thongsochungchixecogioiLocalService;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e c o g i o i local service.
	 *
	 * @param thongsochungchixecogioiLocalService the t h o n g s o c h u n g c h i x e c o g i o i local service
	 */
	public void setTHONGSOCHUNGCHIXECOGIOILocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOILocalService thongsochungchixecogioiLocalService) {
		this.thongsochungchixecogioiLocalService = thongsochungchixecogioiLocalService;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c o g i o i remote service.
	 *
	 * @return the t h o n g s o c h u n g c h i x e c o g i o i remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIService getTHONGSOCHUNGCHIXECOGIOIService() {
		return thongsochungchixecogioiService;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e c o g i o i remote service.
	 *
	 * @param thongsochungchixecogioiService the t h o n g s o c h u n g c h i x e c o g i o i remote service
	 */
	public void setTHONGSOCHUNGCHIXECOGIOIService(
		vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIService thongsochungchixecogioiService) {
		this.thongsochungchixecogioiService = thongsochungchixecogioiService;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c o g i o i persistence.
	 *
	 * @return the t h o n g s o c h u n g c h i x e c o g i o i persistence
	 */
	public THONGSOCHUNGCHIXECOGIOIPersistence getTHONGSOCHUNGCHIXECOGIOIPersistence() {
		return thongsochungchixecogioiPersistence;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e c o g i o i persistence.
	 *
	 * @param thongsochungchixecogioiPersistence the t h o n g s o c h u n g c h i x e c o g i o i persistence
	 */
	public void setTHONGSOCHUNGCHIXECOGIOIPersistence(
		THONGSOCHUNGCHIXECOGIOIPersistence thongsochungchixecogioiPersistence) {
		this.thongsochungchixecogioiPersistence = thongsochungchixecogioiPersistence;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c o g i o i finder.
	 *
	 * @return the t h o n g s o c h u n g c h i x e c o g i o i finder
	 */
	public THONGSOCHUNGCHIXECOGIOIFinder getTHONGSOCHUNGCHIXECOGIOIFinder() {
		return thongsochungchixecogioiFinder;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e c o g i o i finder.
	 *
	 * @param thongsochungchixecogioiFinder the t h o n g s o c h u n g c h i x e c o g i o i finder
	 */
	public void setTHONGSOCHUNGCHIXECOGIOIFinder(
		THONGSOCHUNGCHIXECOGIOIFinder thongsochungchixecogioiFinder) {
		this.thongsochungchixecogioiFinder = thongsochungchixecogioiFinder;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 local service.
	 *
	 * @return the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIPHAN2LocalService getTHONGSOCHUNGCHIXECOGIOIPHAN2LocalService() {
		return thongsochungchixecogioiphan2LocalService;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 local service.
	 *
	 * @param thongsochungchixecogioiphan2LocalService the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 local service
	 */
	public void setTHONGSOCHUNGCHIXECOGIOIPHAN2LocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIPHAN2LocalService thongsochungchixecogioiphan2LocalService) {
		this.thongsochungchixecogioiphan2LocalService = thongsochungchixecogioiphan2LocalService;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 remote service.
	 *
	 * @return the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIPHAN2Service getTHONGSOCHUNGCHIXECOGIOIPHAN2Service() {
		return thongsochungchixecogioiphan2Service;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 remote service.
	 *
	 * @param thongsochungchixecogioiphan2Service the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 remote service
	 */
	public void setTHONGSOCHUNGCHIXECOGIOIPHAN2Service(
		vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIPHAN2Service thongsochungchixecogioiphan2Service) {
		this.thongsochungchixecogioiphan2Service = thongsochungchixecogioiphan2Service;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 persistence.
	 *
	 * @return the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 persistence
	 */
	public THONGSOCHUNGCHIXECOGIOIPHAN2Persistence getTHONGSOCHUNGCHIXECOGIOIPHAN2Persistence() {
		return thongsochungchixecogioiphan2Persistence;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 persistence.
	 *
	 * @param thongsochungchixecogioiphan2Persistence the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 persistence
	 */
	public void setTHONGSOCHUNGCHIXECOGIOIPHAN2Persistence(
		THONGSOCHUNGCHIXECOGIOIPHAN2Persistence thongsochungchixecogioiphan2Persistence) {
		this.thongsochungchixecogioiphan2Persistence = thongsochungchixecogioiphan2Persistence;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e d a p d i e n local service.
	 *
	 * @return the t h o n g s o c h u n g c h i x e d a p d i e n local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEDAPDIENLocalService getTHONGSOCHUNGCHIXEDAPDIENLocalService() {
		return thongsochungchixedapdienLocalService;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e d a p d i e n local service.
	 *
	 * @param thongsochungchixedapdienLocalService the t h o n g s o c h u n g c h i x e d a p d i e n local service
	 */
	public void setTHONGSOCHUNGCHIXEDAPDIENLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEDAPDIENLocalService thongsochungchixedapdienLocalService) {
		this.thongsochungchixedapdienLocalService = thongsochungchixedapdienLocalService;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e d a p d i e n remote service.
	 *
	 * @return the t h o n g s o c h u n g c h i x e d a p d i e n remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEDAPDIENService getTHONGSOCHUNGCHIXEDAPDIENService() {
		return thongsochungchixedapdienService;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e d a p d i e n remote service.
	 *
	 * @param thongsochungchixedapdienService the t h o n g s o c h u n g c h i x e d a p d i e n remote service
	 */
	public void setTHONGSOCHUNGCHIXEDAPDIENService(
		vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEDAPDIENService thongsochungchixedapdienService) {
		this.thongsochungchixedapdienService = thongsochungchixedapdienService;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e d a p d i e n persistence.
	 *
	 * @return the t h o n g s o c h u n g c h i x e d a p d i e n persistence
	 */
	public THONGSOCHUNGCHIXEDAPDIENPersistence getTHONGSOCHUNGCHIXEDAPDIENPersistence() {
		return thongsochungchixedapdienPersistence;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e d a p d i e n persistence.
	 *
	 * @param thongsochungchixedapdienPersistence the t h o n g s o c h u n g c h i x e d a p d i e n persistence
	 */
	public void setTHONGSOCHUNGCHIXEDAPDIENPersistence(
		THONGSOCHUNGCHIXEDAPDIENPersistence thongsochungchixedapdienPersistence) {
		this.thongsochungchixedapdienPersistence = thongsochungchixedapdienPersistence;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e d a p d i e n finder.
	 *
	 * @return the t h o n g s o c h u n g c h i x e d a p d i e n finder
	 */
	public THONGSOCHUNGCHIXEDAPDIENFinder getTHONGSOCHUNGCHIXEDAPDIENFinder() {
		return thongsochungchixedapdienFinder;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e d a p d i e n finder.
	 *
	 * @param thongsochungchixedapdienFinder the t h o n g s o c h u n g c h i x e d a p d i e n finder
	 */
	public void setTHONGSOCHUNGCHIXEDAPDIENFinder(
		THONGSOCHUNGCHIXEDAPDIENFinder thongsochungchixedapdienFinder) {
		this.thongsochungchixedapdienFinder = thongsochungchixedapdienFinder;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e m a y local service.
	 *
	 * @return the t h o n g s o c h u n g c h i x e m a y local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEMAYLocalService getTHONGSOCHUNGCHIXEMAYLocalService() {
		return thongsochungchixemayLocalService;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e m a y local service.
	 *
	 * @param thongsochungchixemayLocalService the t h o n g s o c h u n g c h i x e m a y local service
	 */
	public void setTHONGSOCHUNGCHIXEMAYLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEMAYLocalService thongsochungchixemayLocalService) {
		this.thongsochungchixemayLocalService = thongsochungchixemayLocalService;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e m a y remote service.
	 *
	 * @return the t h o n g s o c h u n g c h i x e m a y remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEMAYService getTHONGSOCHUNGCHIXEMAYService() {
		return thongsochungchixemayService;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e m a y remote service.
	 *
	 * @param thongsochungchixemayService the t h o n g s o c h u n g c h i x e m a y remote service
	 */
	public void setTHONGSOCHUNGCHIXEMAYService(
		vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEMAYService thongsochungchixemayService) {
		this.thongsochungchixemayService = thongsochungchixemayService;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e m a y persistence.
	 *
	 * @return the t h o n g s o c h u n g c h i x e m a y persistence
	 */
	public THONGSOCHUNGCHIXEMAYPersistence getTHONGSOCHUNGCHIXEMAYPersistence() {
		return thongsochungchixemayPersistence;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e m a y persistence.
	 *
	 * @param thongsochungchixemayPersistence the t h o n g s o c h u n g c h i x e m a y persistence
	 */
	public void setTHONGSOCHUNGCHIXEMAYPersistence(
		THONGSOCHUNGCHIXEMAYPersistence thongsochungchixemayPersistence) {
		this.thongsochungchixemayPersistence = thongsochungchixemayPersistence;
	}

	/**
	 * Returns the t h o n g s o c h u n g c h i x e m a y finder.
	 *
	 * @return the t h o n g s o c h u n g c h i x e m a y finder
	 */
	public THONGSOCHUNGCHIXEMAYFinder getTHONGSOCHUNGCHIXEMAYFinder() {
		return thongsochungchixemayFinder;
	}

	/**
	 * Sets the t h o n g s o c h u n g c h i x e m a y finder.
	 *
	 * @param thongsochungchixemayFinder the t h o n g s o c h u n g c h i x e m a y finder
	 */
	public void setTHONGSOCHUNGCHIXEMAYFinder(
		THONGSOCHUNGCHIXEMAYFinder thongsochungchixemayFinder) {
		this.thongsochungchixemayFinder = thongsochungchixemayFinder;
	}

	/**
	 * Returns the vehicle certificate local service.
	 *
	 * @return the vehicle certificate local service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.VehicleCertificateLocalService getVehicleCertificateLocalService() {
		return vehicleCertificateLocalService;
	}

	/**
	 * Sets the vehicle certificate local service.
	 *
	 * @param vehicleCertificateLocalService the vehicle certificate local service
	 */
	public void setVehicleCertificateLocalService(
		vn.dtt.gt.dk.dao.nghiepvu.service.VehicleCertificateLocalService vehicleCertificateLocalService) {
		this.vehicleCertificateLocalService = vehicleCertificateLocalService;
	}

	/**
	 * Returns the vehicle certificate remote service.
	 *
	 * @return the vehicle certificate remote service
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.service.VehicleCertificateService getVehicleCertificateService() {
		return vehicleCertificateService;
	}

	/**
	 * Sets the vehicle certificate remote service.
	 *
	 * @param vehicleCertificateService the vehicle certificate remote service
	 */
	public void setVehicleCertificateService(
		vn.dtt.gt.dk.dao.nghiepvu.service.VehicleCertificateService vehicleCertificateService) {
		this.vehicleCertificateService = vehicleCertificateService;
	}

	/**
	 * Returns the vehicle certificate persistence.
	 *
	 * @return the vehicle certificate persistence
	 */
	public VehicleCertificatePersistence getVehicleCertificatePersistence() {
		return vehicleCertificatePersistence;
	}

	/**
	 * Sets the vehicle certificate persistence.
	 *
	 * @param vehicleCertificatePersistence the vehicle certificate persistence
	 */
	public void setVehicleCertificatePersistence(
		VehicleCertificatePersistence vehicleCertificatePersistence) {
		this.vehicleCertificatePersistence = vehicleCertificatePersistence;
	}

	/**
	 * Returns the vehicle certificate finder.
	 *
	 * @return the vehicle certificate finder
	 */
	public VehicleCertificateFinder getVehicleCertificateFinder() {
		return vehicleCertificateFinder;
	}

	/**
	 * Sets the vehicle certificate finder.
	 *
	 * @param vehicleCertificateFinder the vehicle certificate finder
	 */
	public void setVehicleCertificateFinder(
		VehicleCertificateFinder vehicleCertificateFinder) {
		this.vehicleCertificateFinder = vehicleCertificateFinder;
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

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus",
			inspectionCommonStatusLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus");
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
		return InspectionCommonStatus.class;
	}

	protected String getModelClassName() {
		return InspectionCommonStatus.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = inspectionCommonStatusPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ActionLogLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ActionLogLocalService actionLogLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ActionLogService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ActionLogService actionLogService;
	@BeanReference(type = ActionLogPersistence.class)
	protected ActionLogPersistence actionLogPersistence;
	@BeanReference(type = ActionLogFinder.class)
	protected ActionLogFinder actionLogFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterLocalService assessmentofImporterLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterService assessmentofImporterService;
	@BeanReference(type = AssessmentofImporterPersistence.class)
	protected AssessmentofImporterPersistence assessmentofImporterPersistence;
	@BeanReference(type = AssessmentofImporterFinder.class)
	protected AssessmentofImporterFinder assessmentofImporterFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterControlLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterControlLocalService assessmentofImporterControlLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterControlService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterControlService assessmentofImporterControlService;
	@BeanReference(type = AssessmentofImporterControlPersistence.class)
	protected AssessmentofImporterControlPersistence assessmentofImporterControlPersistence;
	@BeanReference(type = AssessmentofImporterControlFinder.class)
	protected AssessmentofImporterControlFinder assessmentofImporterControlFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectionMethodLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectionMethodLocalService assessmentofInspectionMethodLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectionMethodService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectionMethodService assessmentofInspectionMethodService;
	@BeanReference(type = AssessmentofInspectionMethodPersistence.class)
	protected AssessmentofInspectionMethodPersistence assessmentofInspectionMethodPersistence;
	@BeanReference(type = AssessmentofInspectionMethodFinder.class)
	protected AssessmentofInspectionMethodFinder assessmentofInspectionMethodFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectorLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectorLocalService assessmentofInspectorLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectorService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectorService assessmentofInspectorService;
	@BeanReference(type = AssessmentofInspectorPersistence.class)
	protected AssessmentofInspectorPersistence assessmentofInspectorPersistence;
	@BeanReference(type = AssessmentofInspectorFinder.class)
	protected AssessmentofInspectorFinder assessmentofInspectorFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofProductLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofProductLocalService assessmentofProductLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofProductService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofProductService assessmentofProductService;
	@BeanReference(type = AssessmentofProductPersistence.class)
	protected AssessmentofProductPersistence assessmentofProductPersistence;
	@BeanReference(type = AssessmentofProductFinder.class)
	protected AssessmentofProductFinder assessmentofProductFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentPeriodLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentPeriodLocalService assessmentPeriodLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentPeriodService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentPeriodService assessmentPeriodService;
	@BeanReference(type = AssessmentPeriodPersistence.class)
	protected AssessmentPeriodPersistence assessmentPeriodPersistence;
	@BeanReference(type = AssessmentPeriodFinder.class)
	protected AssessmentPeriodFinder assessmentPeriodFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationLocalService assessmentSpecificationLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationService assessmentSpecificationService;
	@BeanReference(type = AssessmentSpecificationPersistence.class)
	protected AssessmentSpecificationPersistence assessmentSpecificationPersistence;
	@BeanReference(type = AssessmentSpecificationFinder.class)
	protected AssessmentSpecificationFinder assessmentSpecificationFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationConfigLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationConfigLocalService assessmentSpecificationConfigLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationConfigService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationConfigService assessmentSpecificationConfigService;
	@BeanReference(type = AssessmentSpecificationConfigPersistence.class)
	protected AssessmentSpecificationConfigPersistence assessmentSpecificationConfigPersistence;
	@BeanReference(type = AssessmentSpecificationConfigFinder.class)
	protected AssessmentSpecificationConfigFinder assessmentSpecificationConfigFinder;
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
	@BeanReference(type = CfgLimitTechnicalSpecPersistence.class)
	protected CfgLimitTechnicalSpecPersistence cfgLimitTechnicalSpecPersistence;
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
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamService corporationTeamService;
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
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteService debitNoteService;
	@BeanReference(type = DebitNotePersistence.class)
	protected DebitNotePersistence debitNotePersistence;
	@BeanReference(type = DebitNoteFinder.class)
	protected DebitNoteFinder debitNoteFinder;
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
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ExchangeRateService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ExchangeRateService exchangeRateService;
	@BeanReference(type = ExchangeRatePersistence.class)
	protected ExchangeRatePersistence exchangeRatePersistence;
	@BeanReference(type = ExchangeRateFinder.class)
	protected ExchangeRateFinder exchangeRateFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ImportedXCDLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ImportedXCDLocalService importedXCDLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ImportedXCDService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ImportedXCDService importedXCDService;
	@BeanReference(type = ImportedXCDPersistence.class)
	protected ImportedXCDPersistence importedXCDPersistence;
	@BeanReference(type = ImportedXCDFinder.class)
	protected ImportedXCDFinder importedXCDFinder;
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
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecLocalService inspectionRecordSpecLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecService inspectionRecordSpecService;
	@BeanReference(type = InspectionRecordSpecPersistence.class)
	protected InspectionRecordSpecPersistence inspectionRecordSpecPersistence;
	@BeanReference(type = InspectionRecordSpecFinder.class)
	protected InspectionRecordSpecFinder inspectionRecordSpecFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.IssueCategoryLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.IssueCategoryLocalService issueCategoryLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.IssueCategoryService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.IssueCategoryService issueCategoryService;
	@BeanReference(type = IssueCategoryPersistence.class)
	protected IssueCategoryPersistence issueCategoryPersistence;
	@BeanReference(type = IssueCategoryFinder.class)
	protected IssueCategoryFinder issueCategoryFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.IssueTrackingLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.IssueTrackingLocalService issueTrackingLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.IssueTrackingService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.IssueTrackingService issueTrackingService;
	@BeanReference(type = IssueTrackingPersistence.class)
	protected IssueTrackingPersistence issueTrackingPersistence;
	@BeanReference(type = IssueTrackingFinder.class)
	protected IssueTrackingFinder issueTrackingFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateLocalService newExchangeRateLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateService newExchangeRateService;
	@BeanReference(type = NewExchangeRatePersistence.class)
	protected NewExchangeRatePersistence newExchangeRatePersistence;
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
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.SatetyTestReportSpecService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.SatetyTestReportSpecService satetyTestReportSpecService;
	@BeanReference(type = SatetyTestReportSpecPersistence.class)
	protected SatetyTestReportSpecPersistence satetyTestReportSpecPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIDONGCOLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIDONGCOLocalService thongsochungchidongcoLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIDONGCOService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIDONGCOService thongsochungchidongcoService;
	@BeanReference(type = THONGSOCHUNGCHIDONGCOPersistence.class)
	protected THONGSOCHUNGCHIDONGCOPersistence thongsochungchidongcoPersistence;
	@BeanReference(type = THONGSOCHUNGCHIDONGCOFinder.class)
	protected THONGSOCHUNGCHIDONGCOFinder thongsochungchidongcoFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEBONBANHLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEBONBANHLocalService thongsochungchixebonbanhLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEBONBANHService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEBONBANHService thongsochungchixebonbanhService;
	@BeanReference(type = THONGSOCHUNGCHIXEBONBANHPersistence.class)
	protected THONGSOCHUNGCHIXEBONBANHPersistence thongsochungchixebonbanhPersistence;
	@BeanReference(type = THONGSOCHUNGCHIXEBONBANHFinder.class)
	protected THONGSOCHUNGCHIXEBONBANHFinder thongsochungchixebonbanhFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECHUYENDUNGLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECHUYENDUNGLocalService thongsochungchixechuyendungLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECHUYENDUNGService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECHUYENDUNGService thongsochungchixechuyendungService;
	@BeanReference(type = THONGSOCHUNGCHIXECHUYENDUNGPersistence.class)
	protected THONGSOCHUNGCHIXECHUYENDUNGPersistence thongsochungchixechuyendungPersistence;
	@BeanReference(type = THONGSOCHUNGCHIXECHUYENDUNGFinder.class)
	protected THONGSOCHUNGCHIXECHUYENDUNGFinder thongsochungchixechuyendungFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOILocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOILocalService thongsochungchixecogioiLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIService thongsochungchixecogioiService;
	@BeanReference(type = THONGSOCHUNGCHIXECOGIOIPersistence.class)
	protected THONGSOCHUNGCHIXECOGIOIPersistence thongsochungchixecogioiPersistence;
	@BeanReference(type = THONGSOCHUNGCHIXECOGIOIFinder.class)
	protected THONGSOCHUNGCHIXECOGIOIFinder thongsochungchixecogioiFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIPHAN2LocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIPHAN2LocalService thongsochungchixecogioiphan2LocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIPHAN2Service.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIPHAN2Service thongsochungchixecogioiphan2Service;
	@BeanReference(type = THONGSOCHUNGCHIXECOGIOIPHAN2Persistence.class)
	protected THONGSOCHUNGCHIXECOGIOIPHAN2Persistence thongsochungchixecogioiphan2Persistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEDAPDIENLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEDAPDIENLocalService thongsochungchixedapdienLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEDAPDIENService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEDAPDIENService thongsochungchixedapdienService;
	@BeanReference(type = THONGSOCHUNGCHIXEDAPDIENPersistence.class)
	protected THONGSOCHUNGCHIXEDAPDIENPersistence thongsochungchixedapdienPersistence;
	@BeanReference(type = THONGSOCHUNGCHIXEDAPDIENFinder.class)
	protected THONGSOCHUNGCHIXEDAPDIENFinder thongsochungchixedapdienFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEMAYLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEMAYLocalService thongsochungchixemayLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEMAYService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEMAYService thongsochungchixemayService;
	@BeanReference(type = THONGSOCHUNGCHIXEMAYPersistence.class)
	protected THONGSOCHUNGCHIXEMAYPersistence thongsochungchixemayPersistence;
	@BeanReference(type = THONGSOCHUNGCHIXEMAYFinder.class)
	protected THONGSOCHUNGCHIXEMAYFinder thongsochungchixemayFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleCertificateLocalService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleCertificateLocalService vehicleCertificateLocalService;
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.VehicleCertificateService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.VehicleCertificateService vehicleCertificateService;
	@BeanReference(type = VehicleCertificatePersistence.class)
	protected VehicleCertificatePersistence vehicleCertificatePersistence;
	@BeanReference(type = VehicleCertificateFinder.class)
	protected VehicleCertificateFinder vehicleCertificateFinder;
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
	@BeanReference(type = vn.dtt.gt.dk.dao.nghiepvu.service.ViewTrungSoKhungDongCoService.class)
	protected vn.dtt.gt.dk.dao.nghiepvu.service.ViewTrungSoKhungDongCoService viewTrungSoKhungDongCoService;
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
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private InspectionCommonStatusLocalServiceClpInvoker _clpInvoker = new InspectionCommonStatusLocalServiceClpInvoker();
}