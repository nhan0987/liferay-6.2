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
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import vn.dtt.gt.dk.dao.nghiepvu.model.ActionLogClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriodClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfigClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControlClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethodClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectorClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProductClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircularClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpecClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpecClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspecClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspectionClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.ControlReportClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequestClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirementClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.CopReportClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendeeClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspectorClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeamClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationViewClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclarationClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetailsClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpecClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReportClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequestClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirementClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRateClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCDClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatusClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttachClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpecClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategoryClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.IssueTrackingClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRateClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatusClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountryClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspectionClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirementClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReportClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequestClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpecClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCOClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEBONBANHClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNGClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2Clp;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEDAPDIENClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAYClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificateClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitialClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupSpecClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecordClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecificationClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatisticsClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitialClp;
import vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCoClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author win_64
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"DangKiemApp-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"DangKiemApp-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "DangKiemApp-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(ActionLogClp.class.getName())) {
			return translateInputActionLog(oldModel);
		}

		if (oldModelClassName.equals(AssessmentofImporterClp.class.getName())) {
			return translateInputAssessmentofImporter(oldModel);
		}

		if (oldModelClassName.equals(
					AssessmentofImporterControlClp.class.getName())) {
			return translateInputAssessmentofImporterControl(oldModel);
		}

		if (oldModelClassName.equals(
					AssessmentofInspectionMethodClp.class.getName())) {
			return translateInputAssessmentofInspectionMethod(oldModel);
		}

		if (oldModelClassName.equals(AssessmentofInspectorClp.class.getName())) {
			return translateInputAssessmentofInspector(oldModel);
		}

		if (oldModelClassName.equals(AssessmentofProductClp.class.getName())) {
			return translateInputAssessmentofProduct(oldModel);
		}

		if (oldModelClassName.equals(AssessmentPeriodClp.class.getName())) {
			return translateInputAssessmentPeriod(oldModel);
		}

		if (oldModelClassName.equals(AssessmentSpecificationClp.class.getName())) {
			return translateInputAssessmentSpecification(oldModel);
		}

		if (oldModelClassName.equals(
					AssessmentSpecificationConfigClp.class.getName())) {
			return translateInputAssessmentSpecificationConfig(oldModel);
		}

		if (oldModelClassName.equals(CertificateCircularClp.class.getName())) {
			return translateInputCertificateCircular(oldModel);
		}

		if (oldModelClassName.equals(CertificateRecordClp.class.getName())) {
			return translateInputCertificateRecord(oldModel);
		}

		if (oldModelClassName.equals(CertificateRecordSpecClp.class.getName())) {
			return translateInputCertificateRecordSpec(oldModel);
		}

		if (oldModelClassName.equals(CfgLimitTechnicalSpecClp.class.getName())) {
			return translateInputCfgLimitTechnicalSpec(oldModel);
		}

		if (oldModelClassName.equals(CfgTechnicalspecClp.class.getName())) {
			return translateInputCfgTechnicalspec(oldModel);
		}

		if (oldModelClassName.equals(ConfirmedInspectionClp.class.getName())) {
			return translateInputConfirmedInspection(oldModel);
		}

		if (oldModelClassName.equals(ControlReportClp.class.getName())) {
			return translateInputControlReport(oldModel);
		}

		if (oldModelClassName.equals(ControlRequestClp.class.getName())) {
			return translateInputControlRequest(oldModel);
		}

		if (oldModelClassName.equals(ControlRequirementClp.class.getName())) {
			return translateInputControlRequirement(oldModel);
		}

		if (oldModelClassName.equals(CopReportClp.class.getName())) {
			return translateInputCopReport(oldModel);
		}

		if (oldModelClassName.equals(CorporationAttendeeClp.class.getName())) {
			return translateInputCorporationAttendee(oldModel);
		}

		if (oldModelClassName.equals(CorporationInspectorClp.class.getName())) {
			return translateInputCorporationInspector(oldModel);
		}

		if (oldModelClassName.equals(CorporationTeamClp.class.getName())) {
			return translateInputCorporationTeam(oldModel);
		}

		if (oldModelClassName.equals(CorporationViewClp.class.getName())) {
			return translateInputCorporationView(oldModel);
		}

		if (oldModelClassName.equals(CustomsDeclarationClp.class.getName())) {
			return translateInputCustomsDeclaration(oldModel);
		}

		if (oldModelClassName.equals(DebitNoteClp.class.getName())) {
			return translateInputDebitNote(oldModel);
		}

		if (oldModelClassName.equals(DebitNoteDetailsClp.class.getName())) {
			return translateInputDebitNoteDetails(oldModel);
		}

		if (oldModelClassName.equals(DraftCertificateClp.class.getName())) {
			return translateInputDraftCertificate(oldModel);
		}

		if (oldModelClassName.equals(DraftCertificateSpecClp.class.getName())) {
			return translateInputDraftCertificateSpec(oldModel);
		}

		if (oldModelClassName.equals(EmissionTestReportClp.class.getName())) {
			return translateInputEmissionTestReport(oldModel);
		}

		if (oldModelClassName.equals(EmissionTestRequestClp.class.getName())) {
			return translateInputEmissionTestRequest(oldModel);
		}

		if (oldModelClassName.equals(EmissionTestRequirementClp.class.getName())) {
			return translateInputEmissionTestRequirement(oldModel);
		}

		if (oldModelClassName.equals(ExchangeRateClp.class.getName())) {
			return translateInputExchangeRate(oldModel);
		}

		if (oldModelClassName.equals(ImportedXCDClp.class.getName())) {
			return translateInputImportedXCD(oldModel);
		}

		if (oldModelClassName.equals(InspectionCommonStatusClp.class.getName())) {
			return translateInputInspectionCommonStatus(oldModel);
		}

		if (oldModelClassName.equals(InspectionRecordClp.class.getName())) {
			return translateInputInspectionRecord(oldModel);
		}

		if (oldModelClassName.equals(InspectionRecordAttachClp.class.getName())) {
			return translateInputInspectionRecordAttach(oldModel);
		}

		if (oldModelClassName.equals(InspectionRecordSpecClp.class.getName())) {
			return translateInputInspectionRecordSpec(oldModel);
		}

		if (oldModelClassName.equals(IssueCategoryClp.class.getName())) {
			return translateInputIssueCategory(oldModel);
		}

		if (oldModelClassName.equals(IssueTrackingClp.class.getName())) {
			return translateInputIssueTracking(oldModel);
		}

		if (oldModelClassName.equals(NewExchangeRateClp.class.getName())) {
			return translateInputNewExchangeRate(oldModel);
		}

		if (oldModelClassName.equals(PaymentStatusClp.class.getName())) {
			return translateInputPaymentStatus(oldModel);
		}

		if (oldModelClassName.equals(ProductionCountryClp.class.getName())) {
			return translateInputProductionCountry(oldModel);
		}

		if (oldModelClassName.equals(RegisteredInspectionClp.class.getName())) {
			return translateInputRegisteredInspection(oldModel);
		}

		if (oldModelClassName.equals(SafetestRequirementClp.class.getName())) {
			return translateInputSafetestRequirement(oldModel);
		}

		if (oldModelClassName.equals(SafetyTestReportClp.class.getName())) {
			return translateInputSafetyTestReport(oldModel);
		}

		if (oldModelClassName.equals(SafetyTestRequestClp.class.getName())) {
			return translateInputSafetyTestRequest(oldModel);
		}

		if (oldModelClassName.equals(SatetyTestReportSpecClp.class.getName())) {
			return translateInputSatetyTestReportSpec(oldModel);
		}

		if (oldModelClassName.equals(THONGSOCHUNGCHIDONGCOClp.class.getName())) {
			return translateInputTHONGSOCHUNGCHIDONGCO(oldModel);
		}

		if (oldModelClassName.equals(
					THONGSOCHUNGCHIXEBONBANHClp.class.getName())) {
			return translateInputTHONGSOCHUNGCHIXEBONBANH(oldModel);
		}

		if (oldModelClassName.equals(
					THONGSOCHUNGCHIXECHUYENDUNGClp.class.getName())) {
			return translateInputTHONGSOCHUNGCHIXECHUYENDUNG(oldModel);
		}

		if (oldModelClassName.equals(THONGSOCHUNGCHIXECOGIOIClp.class.getName())) {
			return translateInputTHONGSOCHUNGCHIXECOGIOI(oldModel);
		}

		if (oldModelClassName.equals(
					THONGSOCHUNGCHIXECOGIOIPHAN2Clp.class.getName())) {
			return translateInputTHONGSOCHUNGCHIXECOGIOIPHAN2(oldModel);
		}

		if (oldModelClassName.equals(
					THONGSOCHUNGCHIXEDAPDIENClp.class.getName())) {
			return translateInputTHONGSOCHUNGCHIXEDAPDIEN(oldModel);
		}

		if (oldModelClassName.equals(THONGSOCHUNGCHIXEMAYClp.class.getName())) {
			return translateInputTHONGSOCHUNGCHIXEMAY(oldModel);
		}

		if (oldModelClassName.equals(VehicleCertificateClp.class.getName())) {
			return translateInputVehicleCertificate(oldModel);
		}

		if (oldModelClassName.equals(VehicleGroupClp.class.getName())) {
			return translateInputVehicleGroup(oldModel);
		}

		if (oldModelClassName.equals(VehicleGroupInitialClp.class.getName())) {
			return translateInputVehicleGroupInitial(oldModel);
		}

		if (oldModelClassName.equals(VehicleGroupSpecClp.class.getName())) {
			return translateInputVehicleGroupSpec(oldModel);
		}

		if (oldModelClassName.equals(VehicleRecordClp.class.getName())) {
			return translateInputVehicleRecord(oldModel);
		}

		if (oldModelClassName.equals(VehiclerecordInitialClp.class.getName())) {
			return translateInputVehiclerecordInitial(oldModel);
		}

		if (oldModelClassName.equals(VehicleSpecificationClp.class.getName())) {
			return translateInputVehicleSpecification(oldModel);
		}

		if (oldModelClassName.equals(VehicleStatisticsClp.class.getName())) {
			return translateInputVehicleStatistics(oldModel);
		}

		if (oldModelClassName.equals(ViewTrungSoKhungDongCoClp.class.getName())) {
			return translateInputViewTrungSoKhungDongCo(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputActionLog(BaseModel<?> oldModel) {
		ActionLogClp oldClpModel = (ActionLogClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getActionLogRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAssessmentofImporter(
		BaseModel<?> oldModel) {
		AssessmentofImporterClp oldClpModel = (AssessmentofImporterClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAssessmentofImporterRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAssessmentofImporterControl(
		BaseModel<?> oldModel) {
		AssessmentofImporterControlClp oldClpModel = (AssessmentofImporterControlClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAssessmentofImporterControlRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAssessmentofInspectionMethod(
		BaseModel<?> oldModel) {
		AssessmentofInspectionMethodClp oldClpModel = (AssessmentofInspectionMethodClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAssessmentofInspectionMethodRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAssessmentofInspector(
		BaseModel<?> oldModel) {
		AssessmentofInspectorClp oldClpModel = (AssessmentofInspectorClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAssessmentofInspectorRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAssessmentofProduct(
		BaseModel<?> oldModel) {
		AssessmentofProductClp oldClpModel = (AssessmentofProductClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAssessmentofProductRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAssessmentPeriod(BaseModel<?> oldModel) {
		AssessmentPeriodClp oldClpModel = (AssessmentPeriodClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAssessmentPeriodRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAssessmentSpecification(
		BaseModel<?> oldModel) {
		AssessmentSpecificationClp oldClpModel = (AssessmentSpecificationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAssessmentSpecificationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAssessmentSpecificationConfig(
		BaseModel<?> oldModel) {
		AssessmentSpecificationConfigClp oldClpModel = (AssessmentSpecificationConfigClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAssessmentSpecificationConfigRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCertificateCircular(
		BaseModel<?> oldModel) {
		CertificateCircularClp oldClpModel = (CertificateCircularClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCertificateCircularRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCertificateRecord(BaseModel<?> oldModel) {
		CertificateRecordClp oldClpModel = (CertificateRecordClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCertificateRecordRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCertificateRecordSpec(
		BaseModel<?> oldModel) {
		CertificateRecordSpecClp oldClpModel = (CertificateRecordSpecClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCertificateRecordSpecRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCfgLimitTechnicalSpec(
		BaseModel<?> oldModel) {
		CfgLimitTechnicalSpecClp oldClpModel = (CfgLimitTechnicalSpecClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCfgLimitTechnicalSpecRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCfgTechnicalspec(BaseModel<?> oldModel) {
		CfgTechnicalspecClp oldClpModel = (CfgTechnicalspecClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCfgTechnicalspecRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputConfirmedInspection(
		BaseModel<?> oldModel) {
		ConfirmedInspectionClp oldClpModel = (ConfirmedInspectionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getConfirmedInspectionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputControlReport(BaseModel<?> oldModel) {
		ControlReportClp oldClpModel = (ControlReportClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getControlReportRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputControlRequest(BaseModel<?> oldModel) {
		ControlRequestClp oldClpModel = (ControlRequestClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getControlRequestRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputControlRequirement(BaseModel<?> oldModel) {
		ControlRequirementClp oldClpModel = (ControlRequirementClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getControlRequirementRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCopReport(BaseModel<?> oldModel) {
		CopReportClp oldClpModel = (CopReportClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCopReportRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCorporationAttendee(
		BaseModel<?> oldModel) {
		CorporationAttendeeClp oldClpModel = (CorporationAttendeeClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCorporationAttendeeRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCorporationInspector(
		BaseModel<?> oldModel) {
		CorporationInspectorClp oldClpModel = (CorporationInspectorClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCorporationInspectorRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCorporationTeam(BaseModel<?> oldModel) {
		CorporationTeamClp oldClpModel = (CorporationTeamClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCorporationTeamRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCorporationView(BaseModel<?> oldModel) {
		CorporationViewClp oldClpModel = (CorporationViewClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCorporationViewRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCustomsDeclaration(BaseModel<?> oldModel) {
		CustomsDeclarationClp oldClpModel = (CustomsDeclarationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCustomsDeclarationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDebitNote(BaseModel<?> oldModel) {
		DebitNoteClp oldClpModel = (DebitNoteClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDebitNoteRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDebitNoteDetails(BaseModel<?> oldModel) {
		DebitNoteDetailsClp oldClpModel = (DebitNoteDetailsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDebitNoteDetailsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDraftCertificate(BaseModel<?> oldModel) {
		DraftCertificateClp oldClpModel = (DraftCertificateClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDraftCertificateRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDraftCertificateSpec(
		BaseModel<?> oldModel) {
		DraftCertificateSpecClp oldClpModel = (DraftCertificateSpecClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDraftCertificateSpecRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEmissionTestReport(BaseModel<?> oldModel) {
		EmissionTestReportClp oldClpModel = (EmissionTestReportClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEmissionTestReportRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEmissionTestRequest(
		BaseModel<?> oldModel) {
		EmissionTestRequestClp oldClpModel = (EmissionTestRequestClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEmissionTestRequestRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEmissionTestRequirement(
		BaseModel<?> oldModel) {
		EmissionTestRequirementClp oldClpModel = (EmissionTestRequirementClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEmissionTestRequirementRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputExchangeRate(BaseModel<?> oldModel) {
		ExchangeRateClp oldClpModel = (ExchangeRateClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getExchangeRateRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputImportedXCD(BaseModel<?> oldModel) {
		ImportedXCDClp oldClpModel = (ImportedXCDClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getImportedXCDRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputInspectionCommonStatus(
		BaseModel<?> oldModel) {
		InspectionCommonStatusClp oldClpModel = (InspectionCommonStatusClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getInspectionCommonStatusRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputInspectionRecord(BaseModel<?> oldModel) {
		InspectionRecordClp oldClpModel = (InspectionRecordClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getInspectionRecordRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputInspectionRecordAttach(
		BaseModel<?> oldModel) {
		InspectionRecordAttachClp oldClpModel = (InspectionRecordAttachClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getInspectionRecordAttachRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputInspectionRecordSpec(
		BaseModel<?> oldModel) {
		InspectionRecordSpecClp oldClpModel = (InspectionRecordSpecClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getInspectionRecordSpecRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputIssueCategory(BaseModel<?> oldModel) {
		IssueCategoryClp oldClpModel = (IssueCategoryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getIssueCategoryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputIssueTracking(BaseModel<?> oldModel) {
		IssueTrackingClp oldClpModel = (IssueTrackingClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getIssueTrackingRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputNewExchangeRate(BaseModel<?> oldModel) {
		NewExchangeRateClp oldClpModel = (NewExchangeRateClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getNewExchangeRateRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPaymentStatus(BaseModel<?> oldModel) {
		PaymentStatusClp oldClpModel = (PaymentStatusClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPaymentStatusRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputProductionCountry(BaseModel<?> oldModel) {
		ProductionCountryClp oldClpModel = (ProductionCountryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getProductionCountryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputRegisteredInspection(
		BaseModel<?> oldModel) {
		RegisteredInspectionClp oldClpModel = (RegisteredInspectionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getRegisteredInspectionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSafetestRequirement(
		BaseModel<?> oldModel) {
		SafetestRequirementClp oldClpModel = (SafetestRequirementClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSafetestRequirementRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSafetyTestReport(BaseModel<?> oldModel) {
		SafetyTestReportClp oldClpModel = (SafetyTestReportClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSafetyTestReportRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSafetyTestRequest(BaseModel<?> oldModel) {
		SafetyTestRequestClp oldClpModel = (SafetyTestRequestClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSafetyTestRequestRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSatetyTestReportSpec(
		BaseModel<?> oldModel) {
		SatetyTestReportSpecClp oldClpModel = (SatetyTestReportSpecClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSatetyTestReportSpecRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTHONGSOCHUNGCHIDONGCO(
		BaseModel<?> oldModel) {
		THONGSOCHUNGCHIDONGCOClp oldClpModel = (THONGSOCHUNGCHIDONGCOClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTHONGSOCHUNGCHIDONGCORemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTHONGSOCHUNGCHIXEBONBANH(
		BaseModel<?> oldModel) {
		THONGSOCHUNGCHIXEBONBANHClp oldClpModel = (THONGSOCHUNGCHIXEBONBANHClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTHONGSOCHUNGCHIXEBONBANHRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTHONGSOCHUNGCHIXECHUYENDUNG(
		BaseModel<?> oldModel) {
		THONGSOCHUNGCHIXECHUYENDUNGClp oldClpModel = (THONGSOCHUNGCHIXECHUYENDUNGClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTHONGSOCHUNGCHIXECHUYENDUNGRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTHONGSOCHUNGCHIXECOGIOI(
		BaseModel<?> oldModel) {
		THONGSOCHUNGCHIXECOGIOIClp oldClpModel = (THONGSOCHUNGCHIXECOGIOIClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTHONGSOCHUNGCHIXECOGIOIRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTHONGSOCHUNGCHIXECOGIOIPHAN2(
		BaseModel<?> oldModel) {
		THONGSOCHUNGCHIXECOGIOIPHAN2Clp oldClpModel = (THONGSOCHUNGCHIXECOGIOIPHAN2Clp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTHONGSOCHUNGCHIXECOGIOIPHAN2RemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTHONGSOCHUNGCHIXEDAPDIEN(
		BaseModel<?> oldModel) {
		THONGSOCHUNGCHIXEDAPDIENClp oldClpModel = (THONGSOCHUNGCHIXEDAPDIENClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTHONGSOCHUNGCHIXEDAPDIENRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTHONGSOCHUNGCHIXEMAY(
		BaseModel<?> oldModel) {
		THONGSOCHUNGCHIXEMAYClp oldClpModel = (THONGSOCHUNGCHIXEMAYClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTHONGSOCHUNGCHIXEMAYRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputVehicleCertificate(BaseModel<?> oldModel) {
		VehicleCertificateClp oldClpModel = (VehicleCertificateClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getVehicleCertificateRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputVehicleGroup(BaseModel<?> oldModel) {
		VehicleGroupClp oldClpModel = (VehicleGroupClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getVehicleGroupRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputVehicleGroupInitial(
		BaseModel<?> oldModel) {
		VehicleGroupInitialClp oldClpModel = (VehicleGroupInitialClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getVehicleGroupInitialRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputVehicleGroupSpec(BaseModel<?> oldModel) {
		VehicleGroupSpecClp oldClpModel = (VehicleGroupSpecClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getVehicleGroupSpecRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputVehicleRecord(BaseModel<?> oldModel) {
		VehicleRecordClp oldClpModel = (VehicleRecordClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getVehicleRecordRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputVehiclerecordInitial(
		BaseModel<?> oldModel) {
		VehiclerecordInitialClp oldClpModel = (VehiclerecordInitialClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getVehiclerecordInitialRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputVehicleSpecification(
		BaseModel<?> oldModel) {
		VehicleSpecificationClp oldClpModel = (VehicleSpecificationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getVehicleSpecificationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputVehicleStatistics(BaseModel<?> oldModel) {
		VehicleStatisticsClp oldClpModel = (VehicleStatisticsClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getVehicleStatisticsRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputViewTrungSoKhungDongCo(
		BaseModel<?> oldModel) {
		ViewTrungSoKhungDongCoClp oldClpModel = (ViewTrungSoKhungDongCoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getViewTrungSoKhungDongCoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogImpl")) {
			return translateOutputActionLog(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterImpl")) {
			return translateOutputAssessmentofImporter(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlImpl")) {
			return translateOutputAssessmentofImporterControl(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectionMethodImpl")) {
			return translateOutputAssessmentofInspectionMethod(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorImpl")) {
			return translateOutputAssessmentofInspector(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductImpl")) {
			return translateOutputAssessmentofProduct(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodImpl")) {
			return translateOutputAssessmentPeriod(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationImpl")) {
			return translateOutputAssessmentSpecification(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigImpl")) {
			return translateOutputAssessmentSpecificationConfig(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateCircularImpl")) {
			return translateOutputCertificateCircular(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordImpl")) {
			return translateOutputCertificateRecord(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecImpl")) {
			return translateOutputCertificateRecordSpec(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgLimitTechnicalSpecImpl")) {
			return translateOutputCfgLimitTechnicalSpec(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecImpl")) {
			return translateOutputCfgTechnicalspec(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionImpl")) {
			return translateOutputConfirmedInspection(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlReportImpl")) {
			return translateOutputControlReport(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequestImpl")) {
			return translateOutputControlRequest(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementImpl")) {
			return translateOutputControlRequirement(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.CopReportImpl")) {
			return translateOutputCopReport(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationAttendeeImpl")) {
			return translateOutputCorporationAttendee(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorImpl")) {
			return translateOutputCorporationInspector(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationTeamImpl")) {
			return translateOutputCorporationTeam(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewImpl")) {
			return translateOutputCorporationView(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.CustomsDeclarationImpl")) {
			return translateOutputCustomsDeclaration(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteImpl")) {
			return translateOutputDebitNote(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteDetailsImpl")) {
			return translateOutputDebitNoteDetails(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateImpl")) {
			return translateOutputDraftCertificate(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateSpecImpl")) {
			return translateOutputDraftCertificateSpec(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestReportImpl")) {
			return translateOutputEmissionTestReport(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequestImpl")) {
			return translateOutputEmissionTestRequest(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequirementImpl")) {
			return translateOutputEmissionTestRequirement(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.ExchangeRateImpl")) {
			return translateOutputExchangeRate(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDImpl")) {
			return translateOutputImportedXCD(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusImpl")) {
			return translateOutputInspectionCommonStatus(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordImpl")) {
			return translateOutputInspectionRecord(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordAttachImpl")) {
			return translateOutputInspectionRecordAttach(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecImpl")) {
			return translateOutputInspectionRecordSpec(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryImpl")) {
			return translateOutputIssueCategory(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingImpl")) {
			return translateOutputIssueTracking(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.NewExchangeRateImpl")) {
			return translateOutputNewExchangeRate(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.PaymentStatusImpl")) {
			return translateOutputPaymentStatus(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryImpl")) {
			return translateOutputProductionCountry(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionImpl")) {
			return translateOutputRegisteredInspection(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetestRequirementImpl")) {
			return translateOutputSafetestRequirement(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetyTestReportImpl")) {
			return translateOutputSafetyTestReport(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetyTestRequestImpl")) {
			return translateOutputSafetyTestRequest(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.SatetyTestReportSpecImpl")) {
			return translateOutputSatetyTestReportSpec(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIDONGCOImpl")) {
			return translateOutputTHONGSOCHUNGCHIDONGCO(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEBONBANHImpl")) {
			return translateOutputTHONGSOCHUNGCHIXEBONBANH(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGImpl")) {
			return translateOutputTHONGSOCHUNGCHIXECHUYENDUNG(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIImpl")) {
			return translateOutputTHONGSOCHUNGCHIXECOGIOI(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIPHAN2Impl")) {
			return translateOutputTHONGSOCHUNGCHIXECOGIOIPHAN2(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEDAPDIENImpl")) {
			return translateOutputTHONGSOCHUNGCHIXEDAPDIEN(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEMAYImpl")) {
			return translateOutputTHONGSOCHUNGCHIXEMAY(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleCertificateImpl")) {
			return translateOutputVehicleCertificate(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupImpl")) {
			return translateOutputVehicleGroup(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupInitialImpl")) {
			return translateOutputVehicleGroupInitial(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupSpecImpl")) {
			return translateOutputVehicleGroupSpec(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordImpl")) {
			return translateOutputVehicleRecord(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehiclerecordInitialImpl")) {
			return translateOutputVehiclerecordInitial(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationImpl")) {
			return translateOutputVehicleSpecification(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleStatisticsImpl")) {
			return translateOutputVehicleStatistics(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewTrungSoKhungDongCoImpl")) {
			return translateOutputViewTrungSoKhungDongCo(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateCircularException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateCircularException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgLimitTechnicalSpecException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgLimitTechnicalSpecException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequestException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequestException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchCopReportException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchCopReportException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestReportException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestReportException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequestException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequestException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchExchangeRateException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchNewExchangeRateException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchNewExchangeRateException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetestRequirementException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetestRequirementException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestReportException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestReportException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestRequestException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestRequestException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIDONGCOException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIDONGCOException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEBONBANHException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEBONBANHException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEDAPDIENException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEDAPDIENException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleCertificateException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleCertificateException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupInitialException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupInitialException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupSpecException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupSpecException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleStatisticsException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleStatisticsException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.nghiepvu.NoSuchViewTrungSoKhungDongCoException")) {
			return new vn.dtt.gt.dk.dao.nghiepvu.NoSuchViewTrungSoKhungDongCoException();
		}

		return throwable;
	}

	public static Object translateOutputActionLog(BaseModel<?> oldModel) {
		ActionLogClp newModel = new ActionLogClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setActionLogRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAssessmentofImporter(
		BaseModel<?> oldModel) {
		AssessmentofImporterClp newModel = new AssessmentofImporterClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAssessmentofImporterRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAssessmentofImporterControl(
		BaseModel<?> oldModel) {
		AssessmentofImporterControlClp newModel = new AssessmentofImporterControlClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAssessmentofImporterControlRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAssessmentofInspectionMethod(
		BaseModel<?> oldModel) {
		AssessmentofInspectionMethodClp newModel = new AssessmentofInspectionMethodClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAssessmentofInspectionMethodRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAssessmentofInspector(
		BaseModel<?> oldModel) {
		AssessmentofInspectorClp newModel = new AssessmentofInspectorClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAssessmentofInspectorRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAssessmentofProduct(
		BaseModel<?> oldModel) {
		AssessmentofProductClp newModel = new AssessmentofProductClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAssessmentofProductRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAssessmentPeriod(BaseModel<?> oldModel) {
		AssessmentPeriodClp newModel = new AssessmentPeriodClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAssessmentPeriodRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAssessmentSpecification(
		BaseModel<?> oldModel) {
		AssessmentSpecificationClp newModel = new AssessmentSpecificationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAssessmentSpecificationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAssessmentSpecificationConfig(
		BaseModel<?> oldModel) {
		AssessmentSpecificationConfigClp newModel = new AssessmentSpecificationConfigClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAssessmentSpecificationConfigRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCertificateCircular(
		BaseModel<?> oldModel) {
		CertificateCircularClp newModel = new CertificateCircularClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCertificateCircularRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCertificateRecord(BaseModel<?> oldModel) {
		CertificateRecordClp newModel = new CertificateRecordClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCertificateRecordRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCertificateRecordSpec(
		BaseModel<?> oldModel) {
		CertificateRecordSpecClp newModel = new CertificateRecordSpecClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCertificateRecordSpecRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCfgLimitTechnicalSpec(
		BaseModel<?> oldModel) {
		CfgLimitTechnicalSpecClp newModel = new CfgLimitTechnicalSpecClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCfgLimitTechnicalSpecRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCfgTechnicalspec(BaseModel<?> oldModel) {
		CfgTechnicalspecClp newModel = new CfgTechnicalspecClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCfgTechnicalspecRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputConfirmedInspection(
		BaseModel<?> oldModel) {
		ConfirmedInspectionClp newModel = new ConfirmedInspectionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setConfirmedInspectionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputControlReport(BaseModel<?> oldModel) {
		ControlReportClp newModel = new ControlReportClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setControlReportRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputControlRequest(BaseModel<?> oldModel) {
		ControlRequestClp newModel = new ControlRequestClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setControlRequestRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputControlRequirement(
		BaseModel<?> oldModel) {
		ControlRequirementClp newModel = new ControlRequirementClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setControlRequirementRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCopReport(BaseModel<?> oldModel) {
		CopReportClp newModel = new CopReportClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCopReportRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCorporationAttendee(
		BaseModel<?> oldModel) {
		CorporationAttendeeClp newModel = new CorporationAttendeeClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCorporationAttendeeRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCorporationInspector(
		BaseModel<?> oldModel) {
		CorporationInspectorClp newModel = new CorporationInspectorClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCorporationInspectorRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCorporationTeam(BaseModel<?> oldModel) {
		CorporationTeamClp newModel = new CorporationTeamClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCorporationTeamRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCorporationView(BaseModel<?> oldModel) {
		CorporationViewClp newModel = new CorporationViewClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCorporationViewRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCustomsDeclaration(
		BaseModel<?> oldModel) {
		CustomsDeclarationClp newModel = new CustomsDeclarationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCustomsDeclarationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDebitNote(BaseModel<?> oldModel) {
		DebitNoteClp newModel = new DebitNoteClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDebitNoteRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDebitNoteDetails(BaseModel<?> oldModel) {
		DebitNoteDetailsClp newModel = new DebitNoteDetailsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDebitNoteDetailsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDraftCertificate(BaseModel<?> oldModel) {
		DraftCertificateClp newModel = new DraftCertificateClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDraftCertificateRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDraftCertificateSpec(
		BaseModel<?> oldModel) {
		DraftCertificateSpecClp newModel = new DraftCertificateSpecClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDraftCertificateSpecRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEmissionTestReport(
		BaseModel<?> oldModel) {
		EmissionTestReportClp newModel = new EmissionTestReportClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEmissionTestReportRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEmissionTestRequest(
		BaseModel<?> oldModel) {
		EmissionTestRequestClp newModel = new EmissionTestRequestClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEmissionTestRequestRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEmissionTestRequirement(
		BaseModel<?> oldModel) {
		EmissionTestRequirementClp newModel = new EmissionTestRequirementClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEmissionTestRequirementRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputExchangeRate(BaseModel<?> oldModel) {
		ExchangeRateClp newModel = new ExchangeRateClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setExchangeRateRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputImportedXCD(BaseModel<?> oldModel) {
		ImportedXCDClp newModel = new ImportedXCDClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setImportedXCDRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputInspectionCommonStatus(
		BaseModel<?> oldModel) {
		InspectionCommonStatusClp newModel = new InspectionCommonStatusClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setInspectionCommonStatusRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputInspectionRecord(BaseModel<?> oldModel) {
		InspectionRecordClp newModel = new InspectionRecordClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setInspectionRecordRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputInspectionRecordAttach(
		BaseModel<?> oldModel) {
		InspectionRecordAttachClp newModel = new InspectionRecordAttachClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setInspectionRecordAttachRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputInspectionRecordSpec(
		BaseModel<?> oldModel) {
		InspectionRecordSpecClp newModel = new InspectionRecordSpecClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setInspectionRecordSpecRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputIssueCategory(BaseModel<?> oldModel) {
		IssueCategoryClp newModel = new IssueCategoryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setIssueCategoryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputIssueTracking(BaseModel<?> oldModel) {
		IssueTrackingClp newModel = new IssueTrackingClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setIssueTrackingRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputNewExchangeRate(BaseModel<?> oldModel) {
		NewExchangeRateClp newModel = new NewExchangeRateClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setNewExchangeRateRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPaymentStatus(BaseModel<?> oldModel) {
		PaymentStatusClp newModel = new PaymentStatusClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPaymentStatusRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputProductionCountry(BaseModel<?> oldModel) {
		ProductionCountryClp newModel = new ProductionCountryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setProductionCountryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputRegisteredInspection(
		BaseModel<?> oldModel) {
		RegisteredInspectionClp newModel = new RegisteredInspectionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setRegisteredInspectionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSafetestRequirement(
		BaseModel<?> oldModel) {
		SafetestRequirementClp newModel = new SafetestRequirementClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSafetestRequirementRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSafetyTestReport(BaseModel<?> oldModel) {
		SafetyTestReportClp newModel = new SafetyTestReportClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSafetyTestReportRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSafetyTestRequest(BaseModel<?> oldModel) {
		SafetyTestRequestClp newModel = new SafetyTestRequestClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSafetyTestRequestRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSatetyTestReportSpec(
		BaseModel<?> oldModel) {
		SatetyTestReportSpecClp newModel = new SatetyTestReportSpecClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSatetyTestReportSpecRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTHONGSOCHUNGCHIDONGCO(
		BaseModel<?> oldModel) {
		THONGSOCHUNGCHIDONGCOClp newModel = new THONGSOCHUNGCHIDONGCOClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTHONGSOCHUNGCHIDONGCORemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTHONGSOCHUNGCHIXEBONBANH(
		BaseModel<?> oldModel) {
		THONGSOCHUNGCHIXEBONBANHClp newModel = new THONGSOCHUNGCHIXEBONBANHClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTHONGSOCHUNGCHIXEBONBANHRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTHONGSOCHUNGCHIXECHUYENDUNG(
		BaseModel<?> oldModel) {
		THONGSOCHUNGCHIXECHUYENDUNGClp newModel = new THONGSOCHUNGCHIXECHUYENDUNGClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTHONGSOCHUNGCHIXECHUYENDUNGRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTHONGSOCHUNGCHIXECOGIOI(
		BaseModel<?> oldModel) {
		THONGSOCHUNGCHIXECOGIOIClp newModel = new THONGSOCHUNGCHIXECOGIOIClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTHONGSOCHUNGCHIXECOGIOIRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTHONGSOCHUNGCHIXECOGIOIPHAN2(
		BaseModel<?> oldModel) {
		THONGSOCHUNGCHIXECOGIOIPHAN2Clp newModel = new THONGSOCHUNGCHIXECOGIOIPHAN2Clp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTHONGSOCHUNGCHIXECOGIOIPHAN2RemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTHONGSOCHUNGCHIXEDAPDIEN(
		BaseModel<?> oldModel) {
		THONGSOCHUNGCHIXEDAPDIENClp newModel = new THONGSOCHUNGCHIXEDAPDIENClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTHONGSOCHUNGCHIXEDAPDIENRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTHONGSOCHUNGCHIXEMAY(
		BaseModel<?> oldModel) {
		THONGSOCHUNGCHIXEMAYClp newModel = new THONGSOCHUNGCHIXEMAYClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTHONGSOCHUNGCHIXEMAYRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputVehicleCertificate(
		BaseModel<?> oldModel) {
		VehicleCertificateClp newModel = new VehicleCertificateClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setVehicleCertificateRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputVehicleGroup(BaseModel<?> oldModel) {
		VehicleGroupClp newModel = new VehicleGroupClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setVehicleGroupRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputVehicleGroupInitial(
		BaseModel<?> oldModel) {
		VehicleGroupInitialClp newModel = new VehicleGroupInitialClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setVehicleGroupInitialRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputVehicleGroupSpec(BaseModel<?> oldModel) {
		VehicleGroupSpecClp newModel = new VehicleGroupSpecClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setVehicleGroupSpecRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputVehicleRecord(BaseModel<?> oldModel) {
		VehicleRecordClp newModel = new VehicleRecordClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setVehicleRecordRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputVehiclerecordInitial(
		BaseModel<?> oldModel) {
		VehiclerecordInitialClp newModel = new VehiclerecordInitialClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setVehiclerecordInitialRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputVehicleSpecification(
		BaseModel<?> oldModel) {
		VehicleSpecificationClp newModel = new VehicleSpecificationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setVehicleSpecificationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputVehicleStatistics(BaseModel<?> oldModel) {
		VehicleStatisticsClp newModel = new VehicleStatisticsClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setVehicleStatisticsRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputViewTrungSoKhungDongCo(
		BaseModel<?> oldModel) {
		ViewTrungSoKhungDongCoClp newModel = new ViewTrungSoKhungDongCoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setViewTrungSoKhungDongCoRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}