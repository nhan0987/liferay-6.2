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

import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil;

import java.util.Arrays;

/**
 * @author huymq
 * @generated
 */
public class InspectionRecordLocalServiceClpInvoker {
	public InspectionRecordLocalServiceClpInvoker() {
		_methodName0 = "addInspectionRecord";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord"
			};

		_methodName1 = "createInspectionRecord";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteInspectionRecord";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteInspectionRecord";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord"
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

		_methodName10 = "fetchInspectionRecord";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getInspectionRecord";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getInspectionRecords";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getInspectionRecordsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateInspectionRecord";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord"
			};

		_methodName358 = "getBeanIdentifier";

		_methodParameterTypes358 = new String[] {  };

		_methodName359 = "setBeanIdentifier";

		_methodParameterTypes359 = new String[] { "java.lang.String" };

		_methodName364 = "findByRegisteredInspectionId";

		_methodParameterTypes364 = new String[] { "long" };

		_methodName365 = "findByPhieuXuLyPhuId";

		_methodParameterTypes365 = new String[] { "long" };

		_methodName366 = "findByConfirmedinspectionid";

		_methodParameterTypes366 = new String[] { "long" };

		_methodName367 = "findByPhieuXuLyPhuIdAndCorporationId";

		_methodParameterTypes367 = new String[] { "long", "java.lang.String" };

		_methodName368 = "findByPhieuXuLyPhuIdAndCorporationIdAndMarkUp";

		_methodParameterTypes368 = new String[] {
				"long", "java.lang.String", "int", "int", "int"
			};

		_methodName369 = "deleteInspectionRecordSpec";

		_methodParameterTypes369 = new String[] { "long" };

		_methodName370 = "deleteInspectionCommonstatus";

		_methodParameterTypes370 = new String[] { "long" };

		_methodName371 = "findByBienBanLuuTam";

		_methodParameterTypes371 = new String[] { "long" };

		_methodName372 = "findByAttachedFileID";

		_methodParameterTypes372 = new String[] { "long" };

		_methodName373 = "getByR_I";

		_methodParameterTypes373 = new String[] { "long", "java.lang.String" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.addInspectionRecord((vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.createInspectionRecord(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.deleteInspectionRecord(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.deleteInspectionRecord((vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.fetchInspectionRecord(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.getInspectionRecord(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.getInspectionRecords(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.getInspectionRecordsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.updateInspectionRecord((vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord)arguments[0]);
		}

		if (_methodName358.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes358, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName359.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes359, parameterTypes)) {
			InspectionRecordLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName364.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes364, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.findByRegisteredInspectionId(((Long)arguments[0]).longValue());
		}

		if (_methodName365.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes365, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuId(((Long)arguments[0]).longValue());
		}

		if (_methodName366.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes366, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.findByConfirmedinspectionid(((Long)arguments[0]).longValue());
		}

		if (_methodName367.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes367, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuIdAndCorporationId(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName368.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes368, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuIdAndCorporationIdAndMarkUp(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue());
		}

		if (_methodName369.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes369, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.deleteInspectionRecordSpec(((Long)arguments[0]).longValue());
		}

		if (_methodName370.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes370, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.deleteInspectionCommonstatus(((Long)arguments[0]).longValue());
		}

		if (_methodName371.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes371, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.findByBienBanLuuTam(((Long)arguments[0]).longValue());
		}

		if (_methodName372.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes372, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.findByAttachedFileID(((Long)arguments[0]).longValue());
		}

		if (_methodName373.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes373, parameterTypes)) {
			return InspectionRecordLocalServiceUtil.getByR_I(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
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
	private String _methodName358;
	private String[] _methodParameterTypes358;
	private String _methodName359;
	private String[] _methodParameterTypes359;
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
	private String _methodName369;
	private String[] _methodParameterTypes369;
	private String _methodName370;
	private String[] _methodParameterTypes370;
	private String _methodName371;
	private String[] _methodParameterTypes371;
	private String _methodName372;
	private String[] _methodParameterTypes372;
	private String _methodName373;
	private String[] _methodParameterTypes373;
}