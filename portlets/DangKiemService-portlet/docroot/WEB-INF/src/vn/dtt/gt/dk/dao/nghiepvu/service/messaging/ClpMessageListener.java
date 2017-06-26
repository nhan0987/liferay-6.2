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

import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateCircularLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CfgLimitTechnicalSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CfgLimitTechnicalSpecServiceUtil;
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
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestReportLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestReportServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequestLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequestServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequirementLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequirementServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ExchangeRateLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.PaymentStatusLocalServiceUtil;
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
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ViewTrungSoKhungDongCoLocalServiceUtil;

/**
 * @author huymq
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
			CertificateCircularLocalServiceUtil.clearService();

			CertificateRecordLocalServiceUtil.clearService();

			CertificateRecordServiceUtil.clearService();
			CertificateRecordSpecLocalServiceUtil.clearService();

			CertificateRecordSpecServiceUtil.clearService();
			CfgLimitTechnicalSpecLocalServiceUtil.clearService();

			CfgLimitTechnicalSpecServiceUtil.clearService();
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

			CorporationViewLocalServiceUtil.clearService();

			CorporationViewServiceUtil.clearService();
			CustomsDeclarationLocalServiceUtil.clearService();

			CustomsDeclarationServiceUtil.clearService();
			DebitNoteLocalServiceUtil.clearService();

			DebitNoteDetailsLocalServiceUtil.clearService();

			DraftCertificateLocalServiceUtil.clearService();

			DraftCertificateSpecLocalServiceUtil.clearService();

			EmissionTestReportLocalServiceUtil.clearService();

			EmissionTestReportServiceUtil.clearService();
			EmissionTestRequestLocalServiceUtil.clearService();

			EmissionTestRequestServiceUtil.clearService();
			EmissionTestRequirementLocalServiceUtil.clearService();

			EmissionTestRequirementServiceUtil.clearService();
			ExchangeRateLocalServiceUtil.clearService();

			InspectionCommonStatusLocalServiceUtil.clearService();

			InspectionCommonStatusServiceUtil.clearService();
			InspectionRecordLocalServiceUtil.clearService();

			InspectionRecordServiceUtil.clearService();
			InspectionRecordAttachLocalServiceUtil.clearService();

			InspectionRecordAttachServiceUtil.clearService();
			InspectionRecordSpecLocalServiceUtil.clearService();

			InspectionRecordSpecServiceUtil.clearService();
			NewExchangeRateLocalServiceUtil.clearService();

			NewExchangeRateServiceUtil.clearService();
			PaymentStatusLocalServiceUtil.clearService();

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

			VehicleGroupLocalServiceUtil.clearService();

			VehicleGroupServiceUtil.clearService();
			VehicleGroupInitialLocalServiceUtil.clearService();

			VehicleGroupInitialServiceUtil.clearService();
			VehicleGroupSpecLocalServiceUtil.clearService();

			VehicleRecordLocalServiceUtil.clearService();

			VehicleRecordServiceUtil.clearService();
			VehiclerecordInitialLocalServiceUtil.clearService();

			VehiclerecordInitialServiceUtil.clearService();
			VehicleSpecificationLocalServiceUtil.clearService();

			VehicleSpecificationServiceUtil.clearService();
			VehicleStatisticsLocalServiceUtil.clearService();

			VehicleStatisticsServiceUtil.clearService();
			ViewTrungSoKhungDongCoLocalServiceUtil.clearService();
		}
	}
}