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

import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;

import java.util.Arrays;

/**
 * @author huymq
 * @generated
 */
public class VehicleRecordLocalServiceClpInvoker {
	public VehicleRecordLocalServiceClpInvoker() {
		_methodName0 = "addVehicleRecord";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord"
			};

		_methodName1 = "createVehicleRecord";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteVehicleRecord";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteVehicleRecord";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchVehicleRecord";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getVehicleRecord";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getVehicleRecords";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getVehicleRecordsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateVehicleRecord";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord"
			};

		_methodName312 = "getBeanIdentifier";

		_methodParameterTypes312 = new String[] {  };

		_methodName313 = "setBeanIdentifier";

		_methodParameterTypes313 = new String[] { "java.lang.String" };

		_methodName318 = "findByCodeNumber";

		_methodParameterTypes318 = new String[] { "long" };

		_methodName319 = "findByCertificateRecordId";

		_methodParameterTypes319 = new String[] { "long" };

		_methodName320 = "findByConfirmedInspectionId";

		_methodParameterTypes320 = new String[] { "long" };

		_methodName321 = "findByDraftCertificateId";

		_methodParameterTypes321 = new String[] { "long" };

		_methodName322 = "findVehicleRecordHasSafetestrequirement";

		_methodParameterTypes322 = new String[] { "java.lang.String" };

		_methodName323 = "findVehicleRecordHasEmissiontestrequirement";

		_methodParameterTypes323 = new String[] { "java.lang.String" };

		_methodName324 = "findVehicleRecordHasControlrequirement";

		_methodParameterTypes324 = new String[] { "java.lang.String" };

		_methodName325 = "findVehicleRecordByPhieuXuLyPhuId";

		_methodParameterTypes325 = new String[] { "long" };

		_methodName326 = "findByDossierId";

		_methodParameterTypes326 = new String[] { "long", "long" };

		_methodName327 = "findVehicleGroupByInspectionRecordId";

		_methodParameterTypes327 = new String[] { "long" };

		_methodName328 = "countVehicleRecord";

		_methodParameterTypes328 = new String[] { "long" };

		_methodName329 = "findByInspectionRecordIdOrderbyAsc";

		_methodParameterTypes329 = new String[] { "long" };

		_methodName330 = "findByInspectionRecordId";

		_methodParameterTypes330 = new String[] { "long" };

		_methodName331 = "tongChungChiDaCap";

		_methodParameterTypes331 = new String[] { "long" };

		_methodName332 = "tongDuThaoChungChi";

		_methodParameterTypes332 = new String[] { "long" };

		_methodName333 = "findByVehicleGroupId";

		_methodParameterTypes333 = new String[] { "long" };

		_methodName334 = "findByDossierId";

		_methodParameterTypes334 = new String[] { "long" };

		_methodName335 = "findByArrayId";

		_methodParameterTypes335 = new String[] { "java.lang.String" };

		_methodName336 = "findByCodeNumberAndRegisteredNumber";

		_methodParameterTypes336 = new String[] { "long", "java.lang.String" };

		_methodName337 = "findByCodeNumberAndDossierId";

		_methodParameterTypes337 = new String[] { "long", "long" };

		_methodName338 = "findByConfirmedInspectionIdAndBienBanKiemTra";

		_methodParameterTypes338 = new String[] { "long" };

		_methodName339 = "countByInspectionRecordId";

		_methodParameterTypes339 = new String[] { "long" };

		_methodName340 = "countByConfirmedInspectionIdAndInspectionRecordId";

		_methodParameterTypes340 = new String[] { "long" };

		_methodName341 = "countByConfirmedInspectionIdAndMarkUpStatus";

		_methodParameterTypes341 = new String[] { "long" };

		_methodName342 = "countByConfirmedInspectionId";

		_methodParameterTypes342 = new String[] { "long" };

		_methodName343 = "findByInspectionRecordNumber";

		_methodParameterTypes343 = new String[] { "java.lang.String" };

		_methodName344 = "findByDebitNoteId";

		_methodParameterTypes344 = new String[] { "long" };

		_methodName345 = "findByDebitNoteid";

		_methodParameterTypes345 = new String[] { "long" };

		_methodName346 = "checkConfirmedInspection";

		_methodParameterTypes346 = new String[] { "long", "java.lang.String" };

		_methodName347 = "checkHoanKiemTra";

		_methodParameterTypes347 = new String[] {
				"long", "java.lang.String", "java.lang.String"
			};

		_methodName348 = "getVehicleRecord";

		_methodParameterTypes348 = new String[] {
				"long", "java.lang.String", "java.lang.String"
			};

		_methodName349 = "checkHoanKiemTraDoDaLapBienBanKiemTra";

		_methodParameterTypes349 = new String[] {
				"long", "java.lang.String", "java.lang.String", "long"
			};

		_methodName350 = "checkChuaPhanCongDonViKiemTra";

		_methodParameterTypes350 = new String[] {
				"long", "java.lang.String", "java.lang.String", "long"
			};

		_methodName351 = "checkDaPhanCongDonViKiemTra";

		_methodParameterTypes351 = new String[] {
				"long", "java.lang.String", "java.lang.String"
			};

		_methodName352 = "updateVehicleRecordWithConfirmInspection";

		_methodParameterTypes352 = new String[] { "long" };

		_methodName353 = "updateVehicleRecordWithConfirmedInspectionId";

		_methodParameterTypes353 = new String[] { "long" };

		_methodName354 = "updateVehicleRecordWithInspectionId";

		_methodParameterTypes354 = new String[] { "long" };

		_methodName355 = "checkKeHoachKiemTra";

		_methodParameterTypes355 = new String[] {
				"long", "java.lang.String", "java.lang.String", "long"
			};

		_methodName356 = "findByDossierId";

		_methodParameterTypes356 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String"
			};

		_methodName357 = "searchVehicleRecord";

		_methodParameterTypes357 = new String[] {
				"java.lang.String", "long", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "int", "int"
			};

		_methodName358 = "countSearchVehicleRecord";

		_methodParameterTypes358 = new String[] {
				"java.lang.String", "long", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String"
			};

		_methodName359 = "countVehicleRecordWithInspectionId";

		_methodParameterTypes359 = new String[] { "long" };

		_methodName360 = "countBySoLuongPT";

		_methodParameterTypes360 = new String[] { "java.lang.String" };

		_methodName361 = "countBySoNhomPT";

		_methodParameterTypes361 = new String[] { "java.lang.String" };

		_methodName362 = "findByConfirmedInspectionIdAndVehicleGroupId";

		_methodParameterTypes362 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName363 = "deleteVehicleRecordWithVehicleGroupId";

		_methodParameterTypes363 = new String[] { "long" };

		_methodName364 = "countByIdVehicleGroupAndIdHoSoThuTuc";

		_methodParameterTypes364 = new String[] { "long", "long" };

		_methodName365 = "findByIdVehicleGroupAndIdHoSoThuTuc";

		_methodParameterTypes365 = new String[] { "long", "long" };

		_methodName366 = "checkKyDuyetChungChi";

		_methodParameterTypes366 = new String[] { "long" };

		_methodName367 = "findVehicleRecordByDebitNoteIdGroupbyCertificateRecord";

		_methodParameterTypes367 = new String[] { "long" };

		_methodName368 = "getByCN_CHN_EN";

		_methodParameterTypes368 = new String[] {
				"long", "java.lang.String", "java.lang.String"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.addVehicleRecord((vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.createVehicleRecord(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.deleteVehicleRecord(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.deleteVehicleRecord((vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.fetchVehicleRecord(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.getVehicleRecord(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.getVehicleRecords(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.getVehicleRecordsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.updateVehicleRecord((vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord)arguments[0]);
		}

		if (_methodName312.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes312, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName313.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes313, parameterTypes)) {
			VehicleRecordLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName318.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes318, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByCodeNumber(((Long)arguments[0]).longValue());
		}

		if (_methodName319.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes319, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByCertificateRecordId(((Long)arguments[0]).longValue());
		}

		if (_methodName320.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes320, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByConfirmedInspectionId(((Long)arguments[0]).longValue());
		}

		if (_methodName321.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes321, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByDraftCertificateId(((Long)arguments[0]).longValue());
		}

		if (_methodName322.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes322, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findVehicleRecordHasSafetestrequirement((java.lang.String)arguments[0]);
		}

		if (_methodName323.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes323, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findVehicleRecordHasEmissiontestrequirement((java.lang.String)arguments[0]);
		}

		if (_methodName324.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes324, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findVehicleRecordHasControlrequirement((java.lang.String)arguments[0]);
		}

		if (_methodName325.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes325, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findVehicleRecordByPhieuXuLyPhuId(((Long)arguments[0]).longValue());
		}

		if (_methodName326.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes326, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByDossierId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName327.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes327, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findVehicleGroupByInspectionRecordId(((Long)arguments[0]).longValue());
		}

		if (_methodName328.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes328, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.countVehicleRecord(((Long)arguments[0]).longValue());
		}

		if (_methodName329.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes329, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByInspectionRecordIdOrderbyAsc(((Long)arguments[0]).longValue());
		}

		if (_methodName330.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes330, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByInspectionRecordId(((Long)arguments[0]).longValue());
		}

		if (_methodName331.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes331, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.tongChungChiDaCap(((Long)arguments[0]).longValue());
		}

		if (_methodName332.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes332, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.tongDuThaoChungChi(((Long)arguments[0]).longValue());
		}

		if (_methodName333.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes333, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByVehicleGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName334.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes334, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByDossierId(((Long)arguments[0]).longValue());
		}

		if (_methodName335.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes335, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByArrayId((java.lang.String)arguments[0]);
		}

		if (_methodName336.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes336, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByCodeNumberAndRegisteredNumber(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName337.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes337, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByCodeNumberAndDossierId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName338.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes338, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByConfirmedInspectionIdAndBienBanKiemTra(((Long)arguments[0]).longValue());
		}

		if (_methodName339.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes339, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.countByInspectionRecordId(((Long)arguments[0]).longValue());
		}

		if (_methodName340.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes340, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.countByConfirmedInspectionIdAndInspectionRecordId(((Long)arguments[0]).longValue());
		}

		if (_methodName341.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes341, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.countByConfirmedInspectionIdAndMarkUpStatus(((Long)arguments[0]).longValue());
		}

		if (_methodName342.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes342, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.countByConfirmedInspectionId(((Long)arguments[0]).longValue());
		}

		if (_methodName343.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes343, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByInspectionRecordNumber((java.lang.String)arguments[0]);
		}

		if (_methodName344.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes344, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByDebitNoteId(((Long)arguments[0]).longValue());
		}

		if (_methodName345.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes345, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByDebitNoteid(((Long)arguments[0]).longValue());
		}

		if (_methodName346.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes346, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.checkConfirmedInspection(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName347.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes347, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.checkHoanKiemTra(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
		}

		if (_methodName348.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes348, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.getVehicleRecord(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
		}

		if (_methodName349.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes349, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.checkHoanKiemTraDoDaLapBienBanKiemTra(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Long)arguments[3]).longValue());
		}

		if (_methodName350.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes350, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.checkChuaPhanCongDonViKiemTra(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Long)arguments[3]).longValue());
		}

		if (_methodName351.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes351, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.checkDaPhanCongDonViKiemTra(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
		}

		if (_methodName352.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes352, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.updateVehicleRecordWithConfirmInspection(((Long)arguments[0]).longValue());
		}

		if (_methodName353.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes353, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.updateVehicleRecordWithConfirmedInspectionId(((Long)arguments[0]).longValue());
		}

		if (_methodName354.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes354, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.updateVehicleRecordWithInspectionId(((Long)arguments[0]).longValue());
		}

		if (_methodName355.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes355, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.checkKeHoachKiemTra(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Long)arguments[3]).longValue());
		}

		if (_methodName356.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes356, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByDossierId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3]);
		}

		if (_methodName357.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes357, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.searchVehicleRecord((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4], (java.lang.String)arguments[5],
				(java.lang.String)arguments[6], (java.lang.String)arguments[7],
				((Integer)arguments[8]).intValue(),
				((Integer)arguments[9]).intValue());
		}

		if (_methodName358.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes358, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.countSearchVehicleRecord((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4], (java.lang.String)arguments[5],
				(java.lang.String)arguments[6], (java.lang.String)arguments[7]);
		}

		if (_methodName359.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes359, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.countVehicleRecordWithInspectionId(((Long)arguments[0]).longValue());
		}

		if (_methodName360.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes360, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.countBySoLuongPT((java.lang.String)arguments[0]);
		}

		if (_methodName361.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes361, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.countBySoNhomPT((java.lang.String)arguments[0]);
		}

		if (_methodName362.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes362, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByConfirmedInspectionIdAndVehicleGroupId((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName363.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes363, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.deleteVehicleRecordWithVehicleGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName364.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes364, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.countByIdVehicleGroupAndIdHoSoThuTuc(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName365.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes365, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByIdVehicleGroupAndIdHoSoThuTuc(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName366.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes366, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.checkKyDuyetChungChi(((Long)arguments[0]).longValue());
		}

		if (_methodName367.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes367, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findVehicleRecordByDebitNoteIdGroupbyCertificateRecord(((Long)arguments[0]).longValue());
		}

		if (_methodName368.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes368, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.getByCN_CHN_EN(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName312;
	private String[] _methodParameterTypes312;
	private String _methodName313;
	private String[] _methodParameterTypes313;
	private String _methodName318;
	private String[] _methodParameterTypes318;
	private String _methodName319;
	private String[] _methodParameterTypes319;
	private String _methodName320;
	private String[] _methodParameterTypes320;
	private String _methodName321;
	private String[] _methodParameterTypes321;
	private String _methodName322;
	private String[] _methodParameterTypes322;
	private String _methodName323;
	private String[] _methodParameterTypes323;
	private String _methodName324;
	private String[] _methodParameterTypes324;
	private String _methodName325;
	private String[] _methodParameterTypes325;
	private String _methodName326;
	private String[] _methodParameterTypes326;
	private String _methodName327;
	private String[] _methodParameterTypes327;
	private String _methodName328;
	private String[] _methodParameterTypes328;
	private String _methodName329;
	private String[] _methodParameterTypes329;
	private String _methodName330;
	private String[] _methodParameterTypes330;
	private String _methodName331;
	private String[] _methodParameterTypes331;
	private String _methodName332;
	private String[] _methodParameterTypes332;
	private String _methodName333;
	private String[] _methodParameterTypes333;
	private String _methodName334;
	private String[] _methodParameterTypes334;
	private String _methodName335;
	private String[] _methodParameterTypes335;
	private String _methodName336;
	private String[] _methodParameterTypes336;
	private String _methodName337;
	private String[] _methodParameterTypes337;
	private String _methodName338;
	private String[] _methodParameterTypes338;
	private String _methodName339;
	private String[] _methodParameterTypes339;
	private String _methodName340;
	private String[] _methodParameterTypes340;
	private String _methodName341;
	private String[] _methodParameterTypes341;
	private String _methodName342;
	private String[] _methodParameterTypes342;
	private String _methodName343;
	private String[] _methodParameterTypes343;
	private String _methodName344;
	private String[] _methodParameterTypes344;
	private String _methodName345;
	private String[] _methodParameterTypes345;
	private String _methodName346;
	private String[] _methodParameterTypes346;
	private String _methodName347;
	private String[] _methodParameterTypes347;
	private String _methodName348;
	private String[] _methodParameterTypes348;
	private String _methodName349;
	private String[] _methodParameterTypes349;
	private String _methodName350;
	private String[] _methodParameterTypes350;
	private String _methodName351;
	private String[] _methodParameterTypes351;
	private String _methodName352;
	private String[] _methodParameterTypes352;
	private String _methodName353;
	private String[] _methodParameterTypes353;
	private String _methodName354;
	private String[] _methodParameterTypes354;
	private String _methodName355;
	private String[] _methodParameterTypes355;
	private String _methodName356;
	private String[] _methodParameterTypes356;
	private String _methodName357;
	private String[] _methodParameterTypes357;
	private String _methodName358;
	private String[] _methodParameterTypes358;
	private String _methodName359;
	private String[] _methodParameterTypes359;
	private String _methodName360;
	private String[] _methodParameterTypes360;
	private String _methodName361;
	private String[] _methodParameterTypes361;
	private String _methodName362;
	private String[] _methodParameterTypes362;
	private String _methodName363;
	private String[] _methodParameterTypes363;
	private String _methodName364;
	private String[] _methodParameterTypes364;
	private String _methodName365;
	private String[] _methodParameterTypes365;
	private String _methodName366;
	private String[] _methodParameterTypes366;
	private String _methodName367;
	private String[] _methodParameterTypes367;
	private String _methodName368;
	private String[] _methodParameterTypes368;
}