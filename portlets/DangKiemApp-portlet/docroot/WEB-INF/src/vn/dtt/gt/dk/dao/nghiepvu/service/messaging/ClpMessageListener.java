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

package vn.dtt.gt.dk.dao.nghiepvu.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import vn.dtt.gt.dk.dao.nghiepvu.service.ActionLogLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ActionLogServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentPeriodLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentPeriodServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationConfigLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationConfigServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterControlLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterControlServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectionMethodLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectionMethodServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectorLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectorServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofProductLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofProductServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateCircularLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateCircularServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CfgLimitTechnicalSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;
import vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ControlReportLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ControlReportServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequestLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequestServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequirementLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequirementServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CopReportLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CopReportServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationAttendeeLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationAttendeeServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateSpecServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestReportLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestReportServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequestLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequestServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequirementLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequirementServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ExchangeRateLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ExchangeRateServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ImportedXCDLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ImportedXCDServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.IssueCategoryLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.IssueCategoryServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.IssueTrackingLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.IssueTrackingServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.PaymentStatusLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.PaymentStatusServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.SafetestRequirementLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.SafetestRequirementServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestReportLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestReportServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestRequestLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestRequestServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.SatetyTestReportSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.SatetyTestReportSpecServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIDONGCOLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIDONGCOServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEBONBANHLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEBONBANHServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECHUYENDUNGLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECHUYENDUNGServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOILocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIPHAN2ServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEDAPDIENLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEDAPDIENServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEMAYLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEMAYServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleCertificateLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleCertificateServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupSpecServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ViewTrungSoKhungDongCoLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ViewTrungSoKhungDongCoServiceUtil;

/**
 * @author win_64
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			ActionLogLocalServiceUtil.clearService();

			ActionLogServiceUtil.clearService();
			AssessmentofImporterLocalServiceUtil.clearService();

			AssessmentofImporterServiceUtil.clearService();
			AssessmentofImporterControlLocalServiceUtil.clearService();

			AssessmentofImporterControlServiceUtil.clearService();
			AssessmentofInspectionMethodLocalServiceUtil.clearService();

			AssessmentofInspectionMethodServiceUtil.clearService();
			AssessmentofInspectorLocalServiceUtil.clearService();

			AssessmentofInspectorServiceUtil.clearService();
			AssessmentofProductLocalServiceUtil.clearService();

			AssessmentofProductServiceUtil.clearService();
			AssessmentPeriodLocalServiceUtil.clearService();

			AssessmentPeriodServiceUtil.clearService();
			AssessmentSpecificationLocalServiceUtil.clearService();

			AssessmentSpecificationServiceUtil.clearService();
			AssessmentSpecificationConfigLocalServiceUtil.clearService();

			AssessmentSpecificationConfigServiceUtil.clearService();
			CertificateCircularLocalServiceUtil.clearService();

			CertificateCircularServiceUtil.clearService();
			CertificateRecordLocalServiceUtil.clearService();

			CertificateRecordServiceUtil.clearService();
			CertificateRecordSpecLocalServiceUtil.clearService();

			CertificateRecordSpecServiceUtil.clearService();
			CfgLimitTechnicalSpecLocalServiceUtil.clearService();

			CfgTechnicalspecLocalServiceUtil.clearService();

			CfgTechnicalspecServiceUtil.clearService();
			ConfirmedInspectionLocalServiceUtil.clearService();

			ConfirmedInspectionServiceUtil.clearService();
			ControlReportLocalServiceUtil.clearService();

			ControlReportServiceUtil.clearService();
			ControlRequestLocalServiceUtil.clearService();

			ControlRequestServiceUtil.clearService();
			ControlRequirementLocalServiceUtil.clearService();

			ControlRequirementServiceUtil.clearService();
			CopReportLocalServiceUtil.clearService();

			CopReportServiceUtil.clearService();
			CorporationAttendeeLocalServiceUtil.clearService();

			CorporationAttendeeServiceUtil.clearService();
			CorporationInspectorLocalServiceUtil.clearService();

			CorporationInspectorServiceUtil.clearService();
			CorporationTeamLocalServiceUtil.clearService();

			CorporationTeamServiceUtil.clearService();
			CorporationViewLocalServiceUtil.clearService();

			CorporationViewServiceUtil.clearService();
			CustomsDeclarationLocalServiceUtil.clearService();

			CustomsDeclarationServiceUtil.clearService();
			DebitNoteLocalServiceUtil.clearService();

			DebitNoteServiceUtil.clearService();
			DebitNoteDetailsLocalServiceUtil.clearService();

			DebitNoteDetailsServiceUtil.clearService();
			DraftCertificateLocalServiceUtil.clearService();

			DraftCertificateServiceUtil.clearService();
			DraftCertificateSpecLocalServiceUtil.clearService();

			DraftCertificateSpecServiceUtil.clearService();
			EmissionTestReportLocalServiceUtil.clearService();

			EmissionTestReportServiceUtil.clearService();
			EmissionTestRequestLocalServiceUtil.clearService();

			EmissionTestRequestServiceUtil.clearService();
			EmissionTestRequirementLocalServiceUtil.clearService();

			EmissionTestRequirementServiceUtil.clearService();
			ExchangeRateLocalServiceUtil.clearService();

			ExchangeRateServiceUtil.clearService();
			ImportedXCDLocalServiceUtil.clearService();

			ImportedXCDServiceUtil.clearService();
			InspectionCommonStatusLocalServiceUtil.clearService();

			InspectionCommonStatusServiceUtil.clearService();
			InspectionRecordLocalServiceUtil.clearService();

			InspectionRecordServiceUtil.clearService();
			InspectionRecordAttachLocalServiceUtil.clearService();

			InspectionRecordAttachServiceUtil.clearService();
			InspectionRecordSpecLocalServiceUtil.clearService();

			InspectionRecordSpecServiceUtil.clearService();
			IssueCategoryLocalServiceUtil.clearService();

			IssueCategoryServiceUtil.clearService();
			IssueTrackingLocalServiceUtil.clearService();

			IssueTrackingServiceUtil.clearService();
			NewExchangeRateLocalServiceUtil.clearService();

			NewExchangeRateServiceUtil.clearService();
			PaymentStatusLocalServiceUtil.clearService();

			PaymentStatusServiceUtil.clearService();
			ProductionCountryLocalServiceUtil.clearService();

			ProductionCountryServiceUtil.clearService();
			RegisteredInspectionLocalServiceUtil.clearService();

			RegisteredInspectionServiceUtil.clearService();
			SafetestRequirementLocalServiceUtil.clearService();

			SafetestRequirementServiceUtil.clearService();
			SafetyTestReportLocalServiceUtil.clearService();

			SafetyTestReportServiceUtil.clearService();
			SafetyTestRequestLocalServiceUtil.clearService();

			SafetyTestRequestServiceUtil.clearService();
			SatetyTestReportSpecLocalServiceUtil.clearService();

			SatetyTestReportSpecServiceUtil.clearService();
			THONGSOCHUNGCHIDONGCOLocalServiceUtil.clearService();

			THONGSOCHUNGCHIDONGCOServiceUtil.clearService();
			THONGSOCHUNGCHIXEBONBANHLocalServiceUtil.clearService();

			THONGSOCHUNGCHIXEBONBANHServiceUtil.clearService();
			THONGSOCHUNGCHIXECHUYENDUNGLocalServiceUtil.clearService();

			THONGSOCHUNGCHIXECHUYENDUNGServiceUtil.clearService();
			THONGSOCHUNGCHIXECOGIOILocalServiceUtil.clearService();

			THONGSOCHUNGCHIXECOGIOIServiceUtil.clearService();
			THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.clearService();

			THONGSOCHUNGCHIXECOGIOIPHAN2ServiceUtil.clearService();
			THONGSOCHUNGCHIXEDAPDIENLocalServiceUtil.clearService();

			THONGSOCHUNGCHIXEDAPDIENServiceUtil.clearService();
			THONGSOCHUNGCHIXEMAYLocalServiceUtil.clearService();

			THONGSOCHUNGCHIXEMAYServiceUtil.clearService();
			VehicleCertificateLocalServiceUtil.clearService();

			VehicleCertificateServiceUtil.clearService();
			VehicleGroupLocalServiceUtil.clearService();

			VehicleGroupServiceUtil.clearService();
			VehicleGroupInitialLocalServiceUtil.clearService();

			VehicleGroupInitialServiceUtil.clearService();
			VehicleGroupSpecLocalServiceUtil.clearService();

			VehicleGroupSpecServiceUtil.clearService();
			VehicleRecordLocalServiceUtil.clearService();

			VehicleRecordServiceUtil.clearService();
			VehiclerecordInitialLocalServiceUtil.clearService();

			VehiclerecordInitialServiceUtil.clearService();
			VehicleSpecificationLocalServiceUtil.clearService();

			VehicleSpecificationServiceUtil.clearService();
			VehicleStatisticsLocalServiceUtil.clearService();

			VehicleStatisticsServiceUtil.clearService();
			ViewTrungSoKhungDongCoLocalServiceUtil.clearService();

			ViewTrungSoKhungDongCoServiceUtil.clearService();
		}
	}
}