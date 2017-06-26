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

import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil;

import java.util.Arrays;

/**
 * @author huymq
 * @generated
 */
public class CorporationInspectorLocalServiceClpInvoker {
	public CorporationInspectorLocalServiceClpInvoker() {
		_methodName0 = "addCorporationInspector";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"
			};

		_methodName1 = "createCorporationInspector";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteCorporationInspector";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteCorporationInspector";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"
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

		_methodName10 = "fetchCorporationInspector";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getCorporationInspector";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getCorporationInspectors";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getCorporationInspectorsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateCorporationInspector";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"
			};

		_methodName312 = "getBeanIdentifier";

		_methodParameterTypes312 = new String[] {  };

		_methodName313 = "setBeanIdentifier";

		_methodParameterTypes313 = new String[] { "java.lang.String" };

		_methodName318 = "findByCorporationId";

		_methodParameterTypes318 = new String[] { "java.lang.String" };

		_methodName319 = "countByCorporationId";

		_methodParameterTypes319 = new String[] { "java.lang.String" };

		_methodName320 = "findByCorporationId";

		_methodParameterTypes320 = new String[] { "java.lang.String", "int", "int" };

		_methodName321 = "fetchByInspectorId";

		_methodParameterTypes321 = new String[] { "long" };

		_methodName322 = "findByTeamId";

		_methodParameterTypes322 = new String[] { "long" };

		_methodName323 = "findUserLiferayNotHaveCorporationInspector";

		_methodParameterTypes323 = new String[] { "java.lang.String" };

		_methodName324 = "findByInspectorId";

		_methodParameterTypes324 = new String[] { "long" };

		_methodName325 = "deleteDangKiemVien";

		_methodParameterTypes325 = new String[] { "long" };

		_methodName326 = "findDanhSachDangKiemVien";

		_methodParameterTypes326 = new String[] { "int", "int" };

		_methodName327 = "countDanhSachDangKiemVien";

		_methodParameterTypes327 = new String[] {  };

		_methodName328 = "findDanhSachDangKiemVienByTeam";

		_methodParameterTypes328 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.addCorporationInspector((vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.createCorporationInspector(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.deleteCorporationInspector(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.deleteCorporationInspector((vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.fetchCorporationInspector(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.getCorporationInspector(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.getCorporationInspectors(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.getCorporationInspectorsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.updateCorporationInspector((vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector)arguments[0]);
		}

		if (_methodName312.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes312, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName313.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes313, parameterTypes)) {
			CorporationInspectorLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName318.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes318, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.findByCorporationId((java.lang.String)arguments[0]);
		}

		if (_methodName319.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes319, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.countByCorporationId((java.lang.String)arguments[0]);
		}

		if (_methodName320.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes320, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.findByCorporationId((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName321.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes321, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.fetchByInspectorId(((Long)arguments[0]).longValue());
		}

		if (_methodName322.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes322, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.findByTeamId(((Long)arguments[0]).longValue());
		}

		if (_methodName323.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes323, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.findUserLiferayNotHaveCorporationInspector((java.lang.String)arguments[0]);
		}

		if (_methodName324.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes324, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.findByInspectorId(((Long)arguments[0]).longValue());
		}

		if (_methodName325.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes325, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.deleteDangKiemVien(((Long)arguments[0]).longValue());
		}

		if (_methodName326.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes326, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.findDanhSachDangKiemVien(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName327.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes327, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.countDanhSachDangKiemVien();
		}

		if (_methodName328.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes328, parameterTypes)) {
			return CorporationInspectorLocalServiceUtil.findDanhSachDangKiemVienByTeam(((Long)arguments[0]).longValue());
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
}