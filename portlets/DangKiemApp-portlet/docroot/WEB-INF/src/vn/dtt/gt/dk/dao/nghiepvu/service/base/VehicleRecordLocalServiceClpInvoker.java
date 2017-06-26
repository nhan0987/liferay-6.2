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
 * @author win_64
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

		_methodName486 = "getBeanIdentifier";

		_methodParameterTypes486 = new String[] {  };

		_methodName487 = "setBeanIdentifier";

		_methodParameterTypes487 = new String[] { "java.lang.String" };

		_methodName492 = "findByCodeNumber";

		_methodParameterTypes492 = new String[] { "long" };

		_methodName493 = "findByCertificateRecordId";

		_methodParameterTypes493 = new String[] { "long" };

		_methodName494 = "findByConfirmedInspectionId";

		_methodParameterTypes494 = new String[] { "long" };

		_methodName495 = "findByDraftCertificateId";

		_methodParameterTypes495 = new String[] { "long" };

		_methodName496 = "findVehicleRecordHasSafetestrequirement";

		_methodParameterTypes496 = new String[] { "java.lang.String" };

		_methodName497 = "findVehicleRecordHasEmissiontestrequirement";

		_methodParameterTypes497 = new String[] { "java.lang.String" };

		_methodName498 = "findVehicleRecordHasControlrequirement";

		_methodParameterTypes498 = new String[] { "java.lang.String" };

		_methodName499 = "findVehicleRecordByPhieuXuLyPhuId";

		_methodParameterTypes499 = new String[] { "long" };

		_methodName500 = "findByDossierId";

		_methodParameterTypes500 = new String[] { "long", "long" };

		_methodName501 = "findVehicleGroupByInspectionRecordId";

		_methodParameterTypes501 = new String[] { "long" };

		_methodName502 = "countVehicleRecord";

		_methodParameterTypes502 = new String[] { "long" };

		_methodName503 = "findByInspectionRecordIdOrderbyAsc";

		_methodParameterTypes503 = new String[] { "long" };

		_methodName504 = "findByInspectionRecordId";

		_methodParameterTypes504 = new String[] { "long" };

		_methodName505 = "tongChungChiDaCap";

		_methodParameterTypes505 = new String[] { "long" };

		_methodName506 = "tongDuThaoChungChi";

		_methodParameterTypes506 = new String[] { "long" };

		_methodName507 = "findByVehicleGroupId";

		_methodParameterTypes507 = new String[] { "long" };

		_methodName508 = "findByDossierId";

		_methodParameterTypes508 = new String[] { "long" };

		_methodName509 = "findByArrayId";

		_methodParameterTypes509 = new String[] { "java.lang.String" };

		_methodName510 = "findByCodeNumberAndRegisteredNumber";

		_methodParameterTypes510 = new String[] { "long", "java.lang.String" };

		_methodName511 = "findByCodeNumberAndDossierId";

		_methodParameterTypes511 = new String[] { "long", "long" };

		_methodName512 = "findByConfirmedInspectionIdAndBienBanKiemTra";

		_methodParameterTypes512 = new String[] { "long" };

		_methodName513 = "countByInspectionRecordId";

		_methodParameterTypes513 = new String[] { "long" };

		_methodName514 = "countByConfirmedInspectionIdAndInspectionRecordId";

		_methodParameterTypes514 = new String[] { "long" };

		_methodName515 = "countByConfirmedInspectionIdAndMarkUpStatus";

		_methodParameterTypes515 = new String[] { "long" };

		_methodName516 = "countByConfirmedInspectionId";

		_methodParameterTypes516 = new String[] { "long" };

		_methodName517 = "findByInspectionRecordNumber";

		_methodParameterTypes517 = new String[] { "java.lang.String" };

		_methodName518 = "findByDebitNoteId";

		_methodParameterTypes518 = new String[] { "long" };

		_methodName519 = "findByDebitNoteid";

		_methodParameterTypes519 = new String[] { "long" };

		_methodName520 = "checkConfirmedInspection";

		_methodParameterTypes520 = new String[] { "long", "java.lang.String" };

		_methodName521 = "checkHoanKiemTra";

		_methodParameterTypes521 = new String[] {
				"long", "java.lang.String", "java.lang.String"
			};

		_methodName522 = "getVehicleRecord";

		_methodParameterTypes522 = new String[] {
				"long", "java.lang.String", "java.lang.String"
			};

		_methodName523 = "checkHoanKiemTraDoDaLapBienBanKiemTra";

		_methodParameterTypes523 = new String[] {
				"long", "java.lang.String", "java.lang.String", "long"
			};

		_methodName524 = "checkChuaPhanCongDonViKiemTra";

		_methodParameterTypes524 = new String[] {
				"long", "java.lang.String", "java.lang.String", "long"
			};

		_methodName525 = "checkDaPhanCongDonViKiemTra";

		_methodParameterTypes525 = new String[] {
				"long", "java.lang.String", "java.lang.String"
			};

		_methodName526 = "updateVehicleRecordWithConfirmInspection";

		_methodParameterTypes526 = new String[] { "long" };

		_methodName527 = "updateVehicleRecordWithConfirmedInspectionId";

		_methodParameterTypes527 = new String[] { "long" };

		_methodName528 = "updateVehicleRecordWithInspectionId";

		_methodParameterTypes528 = new String[] { "long" };

		_methodName529 = "checkKeHoachKiemTra";

		_methodParameterTypes529 = new String[] {
				"long", "java.lang.String", "java.lang.String", "long"
			};

		_methodName530 = "findByDossierId";

		_methodParameterTypes530 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String"
			};

		_methodName531 = "searchVehicleRecord";

		_methodParameterTypes531 = new String[] {
				"java.lang.String", "long", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "int", "int"
			};

		_methodName532 = "countSearchVehicleRecord";

		_methodParameterTypes532 = new String[] {
				"java.lang.String", "long", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String"
			};

		_methodName533 = "countVehicleRecordWithInspectionId";

		_methodParameterTypes533 = new String[] { "long" };

		_methodName534 = "countBySoLuongPT";

		_methodParameterTypes534 = new String[] { "java.lang.String" };

		_methodName535 = "countBySoNhomPT";

		_methodParameterTypes535 = new String[] { "java.lang.String" };

		_methodName536 = "findByConfirmedInspectionIdAndVehicleGroupId";

		_methodParameterTypes536 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName537 = "deleteVehicleRecordWithVehicleGroupId";

		_methodParameterTypes537 = new String[] { "long" };

		_methodName538 = "countByIdVehicleGroupAndIdHoSoThuTuc";

		_methodParameterTypes538 = new String[] { "long", "long" };

		_methodName539 = "findByIdVehicleGroupAndIdHoSoThuTuc";

		_methodParameterTypes539 = new String[] { "long", "long" };

		_methodName540 = "checkKyDuyetChungChi";

		_methodParameterTypes540 = new String[] { "long" };

		_methodName541 = "findVehicleRecordByDebitNoteIdGroupbyCertificateRecord";

		_methodParameterTypes541 = new String[] { "long" };
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

		if (_methodName486.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes486, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName487.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes487, parameterTypes)) {
			VehicleRecordLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName492.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes492, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByCodeNumber(((Long)arguments[0]).longValue());
		}

		if (_methodName493.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes493, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByCertificateRecordId(((Long)arguments[0]).longValue());
		}

		if (_methodName494.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes494, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByConfirmedInspectionId(((Long)arguments[0]).longValue());
		}

		if (_methodName495.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes495, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByDraftCertificateId(((Long)arguments[0]).longValue());
		}

		if (_methodName496.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes496, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findVehicleRecordHasSafetestrequirement((java.lang.String)arguments[0]);
		}

		if (_methodName497.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes497, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findVehicleRecordHasEmissiontestrequirement((java.lang.String)arguments[0]);
		}

		if (_methodName498.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes498, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findVehicleRecordHasControlrequirement((java.lang.String)arguments[0]);
		}

		if (_methodName499.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes499, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findVehicleRecordByPhieuXuLyPhuId(((Long)arguments[0]).longValue());
		}

		if (_methodName500.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes500, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByDossierId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName501.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes501, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findVehicleGroupByInspectionRecordId(((Long)arguments[0]).longValue());
		}

		if (_methodName502.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes502, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.countVehicleRecord(((Long)arguments[0]).longValue());
		}

		if (_methodName503.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes503, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByInspectionRecordIdOrderbyAsc(((Long)arguments[0]).longValue());
		}

		if (_methodName504.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes504, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByInspectionRecordId(((Long)arguments[0]).longValue());
		}

		if (_methodName505.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes505, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.tongChungChiDaCap(((Long)arguments[0]).longValue());
		}

		if (_methodName506.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes506, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.tongDuThaoChungChi(((Long)arguments[0]).longValue());
		}

		if (_methodName507.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes507, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByVehicleGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName508.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes508, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByDossierId(((Long)arguments[0]).longValue());
		}

		if (_methodName509.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes509, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByArrayId((java.lang.String)arguments[0]);
		}

		if (_methodName510.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes510, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByCodeNumberAndRegisteredNumber(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName511.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes511, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByCodeNumberAndDossierId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName512.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes512, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByConfirmedInspectionIdAndBienBanKiemTra(((Long)arguments[0]).longValue());
		}

		if (_methodName513.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes513, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.countByInspectionRecordId(((Long)arguments[0]).longValue());
		}

		if (_methodName514.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes514, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.countByConfirmedInspectionIdAndInspectionRecordId(((Long)arguments[0]).longValue());
		}

		if (_methodName515.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes515, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.countByConfirmedInspectionIdAndMarkUpStatus(((Long)arguments[0]).longValue());
		}

		if (_methodName516.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes516, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.countByConfirmedInspectionId(((Long)arguments[0]).longValue());
		}

		if (_methodName517.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes517, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByInspectionRecordNumber((java.lang.String)arguments[0]);
		}

		if (_methodName518.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes518, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByDebitNoteId(((Long)arguments[0]).longValue());
		}

		if (_methodName519.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes519, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByDebitNoteid(((Long)arguments[0]).longValue());
		}

		if (_methodName520.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes520, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.checkConfirmedInspection(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName521.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes521, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.checkHoanKiemTra(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
		}

		if (_methodName522.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes522, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.getVehicleRecord(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
		}

		if (_methodName523.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes523, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.checkHoanKiemTraDoDaLapBienBanKiemTra(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Long)arguments[3]).longValue());
		}

		if (_methodName524.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes524, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.checkChuaPhanCongDonViKiemTra(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Long)arguments[3]).longValue());
		}

		if (_methodName525.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes525, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.checkDaPhanCongDonViKiemTra(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
		}

		if (_methodName526.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes526, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.updateVehicleRecordWithConfirmInspection(((Long)arguments[0]).longValue());
		}

		if (_methodName527.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes527, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.updateVehicleRecordWithConfirmedInspectionId(((Long)arguments[0]).longValue());
		}

		if (_methodName528.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes528, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.updateVehicleRecordWithInspectionId(((Long)arguments[0]).longValue());
		}

		if (_methodName529.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes529, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.checkKeHoachKiemTra(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Long)arguments[3]).longValue());
		}

		if (_methodName530.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes530, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByDossierId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3]);
		}

		if (_methodName531.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes531, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.searchVehicleRecord((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4], (java.lang.String)arguments[5],
				(java.lang.String)arguments[6], (java.lang.String)arguments[7],
				((Integer)arguments[8]).intValue(),
				((Integer)arguments[9]).intValue());
		}

		if (_methodName532.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes532, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.countSearchVehicleRecord((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4], (java.lang.String)arguments[5],
				(java.lang.String)arguments[6], (java.lang.String)arguments[7]);
		}

		if (_methodName533.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes533, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.countVehicleRecordWithInspectionId(((Long)arguments[0]).longValue());
		}

		if (_methodName534.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes534, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.countBySoLuongPT((java.lang.String)arguments[0]);
		}

		if (_methodName535.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes535, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.countBySoNhomPT((java.lang.String)arguments[0]);
		}

		if (_methodName536.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes536, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByConfirmedInspectionIdAndVehicleGroupId((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName537.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes537, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.deleteVehicleRecordWithVehicleGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName538.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes538, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.countByIdVehicleGroupAndIdHoSoThuTuc(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName539.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes539, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findByIdVehicleGroupAndIdHoSoThuTuc(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName540.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes540, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.checkKyDuyetChungChi(((Long)arguments[0]).longValue());
		}

		if (_methodName541.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes541, parameterTypes)) {
			return VehicleRecordLocalServiceUtil.findVehicleRecordByDebitNoteIdGroupbyCertificateRecord(((Long)arguments[0]).longValue());
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
	private String _methodName486;
	private String[] _methodParameterTypes486;
	private String _methodName487;
	private String[] _methodParameterTypes487;
	private String _methodName492;
	private String[] _methodParameterTypes492;
	private String _methodName493;
	private String[] _methodParameterTypes493;
	private String _methodName494;
	private String[] _methodParameterTypes494;
	private String _methodName495;
	private String[] _methodParameterTypes495;
	private String _methodName496;
	private String[] _methodParameterTypes496;
	private String _methodName497;
	private String[] _methodParameterTypes497;
	private String _methodName498;
	private String[] _methodParameterTypes498;
	private String _methodName499;
	private String[] _methodParameterTypes499;
	private String _methodName500;
	private String[] _methodParameterTypes500;
	private String _methodName501;
	private String[] _methodParameterTypes501;
	private String _methodName502;
	private String[] _methodParameterTypes502;
	private String _methodName503;
	private String[] _methodParameterTypes503;
	private String _methodName504;
	private String[] _methodParameterTypes504;
	private String _methodName505;
	private String[] _methodParameterTypes505;
	private String _methodName506;
	private String[] _methodParameterTypes506;
	private String _methodName507;
	private String[] _methodParameterTypes507;
	private String _methodName508;
	private String[] _methodParameterTypes508;
	private String _methodName509;
	private String[] _methodParameterTypes509;
	private String _methodName510;
	private String[] _methodParameterTypes510;
	private String _methodName511;
	private String[] _methodParameterTypes511;
	private String _methodName512;
	private String[] _methodParameterTypes512;
	private String _methodName513;
	private String[] _methodParameterTypes513;
	private String _methodName514;
	private String[] _methodParameterTypes514;
	private String _methodName515;
	private String[] _methodParameterTypes515;
	private String _methodName516;
	private String[] _methodParameterTypes516;
	private String _methodName517;
	private String[] _methodParameterTypes517;
	private String _methodName518;
	private String[] _methodParameterTypes518;
	private String _methodName519;
	private String[] _methodParameterTypes519;
	private String _methodName520;
	private String[] _methodParameterTypes520;
	private String _methodName521;
	private String[] _methodParameterTypes521;
	private String _methodName522;
	private String[] _methodParameterTypes522;
	private String _methodName523;
	private String[] _methodParameterTypes523;
	private String _methodName524;
	private String[] _methodParameterTypes524;
	private String _methodName525;
	private String[] _methodParameterTypes525;
	private String _methodName526;
	private String[] _methodParameterTypes526;
	private String _methodName527;
	private String[] _methodParameterTypes527;
	private String _methodName528;
	private String[] _methodParameterTypes528;
	private String _methodName529;
	private String[] _methodParameterTypes529;
	private String _methodName530;
	private String[] _methodParameterTypes530;
	private String _methodName531;
	private String[] _methodParameterTypes531;
	private String _methodName532;
	private String[] _methodParameterTypes532;
	private String _methodName533;
	private String[] _methodParameterTypes533;
	private String _methodName534;
	private String[] _methodParameterTypes534;
	private String _methodName535;
	private String[] _methodParameterTypes535;
	private String _methodName536;
	private String[] _methodParameterTypes536;
	private String _methodName537;
	private String[] _methodParameterTypes537;
	private String _methodName538;
	private String[] _methodParameterTypes538;
	private String _methodName539;
	private String[] _methodParameterTypes539;
	private String _methodName540;
	private String[] _methodParameterTypes540;
	private String _methodName541;
	private String[] _methodParameterTypes541;
}