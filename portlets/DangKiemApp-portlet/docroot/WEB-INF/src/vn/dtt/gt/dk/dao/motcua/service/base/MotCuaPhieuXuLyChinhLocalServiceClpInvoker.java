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

package vn.dtt.gt.dk.dao.motcua.service.base;

import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyChinhLocalServiceUtil;

import java.util.Arrays;

/**
 * @author win_64
 * @generated
 */
public class MotCuaPhieuXuLyChinhLocalServiceClpInvoker {
	public MotCuaPhieuXuLyChinhLocalServiceClpInvoker() {
		_methodName0 = "addMotCuaPhieuXuLyChinh";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh"
			};

		_methodName1 = "createMotCuaPhieuXuLyChinh";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteMotCuaPhieuXuLyChinh";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteMotCuaPhieuXuLyChinh";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh"
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

		_methodName10 = "fetchMotCuaPhieuXuLyChinh";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getMotCuaPhieuXuLyChinh";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getMotCuaPhieuXuLyChinhs";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getMotCuaPhieuXuLyChinhsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateMotCuaPhieuXuLyChinh";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh"
			};

		_methodName146 = "getBeanIdentifier";

		_methodParameterTypes146 = new String[] {  };

		_methodName147 = "setBeanIdentifier";

		_methodParameterTypes147 = new String[] { "java.lang.String" };

		_methodName152 = "findByHoSoThuTucIdAndQuyTrinhThuTucId";

		_methodParameterTypes152 = new String[] { "long", "long" };

		_methodName153 = "findByHoSoThuTucId";

		_methodParameterTypes153 = new String[] { "long" };

		_methodName154 = "findMotCuaPhieuXuLyChinhByHoSoThuTucId";

		_methodParameterTypes154 = new String[] {
				"java.lang.String", "long", "long", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "int", "int", "int"
			};

		_methodName155 = "countMotCuaPhieuXuLyChinhByHoSoThuTucId";

		_methodParameterTypes155 = new String[] {
				"java.lang.String", "long", "long", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "int"
			};

		_methodName156 = "findMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan";

		_methodParameterTypes156 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"int", "int", "int"
			};

		_methodName157 = "countMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan";

		_methodParameterTypes157 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"int"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.addMotCuaPhieuXuLyChinh((vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.createMotCuaPhieuXuLyChinh(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.deleteMotCuaPhieuXuLyChinh(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.deleteMotCuaPhieuXuLyChinh((vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.fetchMotCuaPhieuXuLyChinh(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.getMotCuaPhieuXuLyChinh(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.getMotCuaPhieuXuLyChinhs(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.getMotCuaPhieuXuLyChinhsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.updateMotCuaPhieuXuLyChinh((vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh)arguments[0]);
		}

		if (_methodName146.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes146, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName147.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes147, parameterTypes)) {
			MotCuaPhieuXuLyChinhLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName152.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes152, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.findByHoSoThuTucIdAndQuyTrinhThuTucId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName153.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes153, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.findByHoSoThuTucId(((Long)arguments[0]).longValue());
		}

		if (_methodName154.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes154, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.findMotCuaPhieuXuLyChinhByHoSoThuTucId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7],
				((Integer)arguments[8]).intValue(),
				((Integer)arguments[9]).intValue(),
				((Integer)arguments[10]).intValue());
		}

		if (_methodName155.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes155, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.countMotCuaPhieuXuLyChinhByHoSoThuTucId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7],
				((Integer)arguments[8]).intValue());
		}

		if (_methodName156.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes156, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.findMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Long)arguments[3]).longValue(),
				((Long)arguments[4]).longValue(),
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7], (java.lang.String)arguments[8],
				(java.lang.String)arguments[9],
				((Integer)arguments[10]).intValue(),
				((Integer)arguments[11]).intValue(),
				((Integer)arguments[12]).intValue());
		}

		if (_methodName157.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes157, parameterTypes)) {
			return MotCuaPhieuXuLyChinhLocalServiceUtil.countMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Long)arguments[3]).longValue(),
				((Long)arguments[4]).longValue(),
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7], (java.lang.String)arguments[8],
				(java.lang.String)arguments[9],
				((Integer)arguments[10]).intValue());
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
	private String _methodName146;
	private String[] _methodParameterTypes146;
	private String _methodName147;
	private String[] _methodParameterTypes147;
	private String _methodName152;
	private String[] _methodParameterTypes152;
	private String _methodName153;
	private String[] _methodParameterTypes153;
	private String _methodName154;
	private String[] _methodParameterTypes154;
	private String _methodName155;
	private String[] _methodParameterTypes155;
	private String _methodName156;
	private String[] _methodParameterTypes156;
	private String _methodName157;
	private String[] _methodParameterTypes157;
}