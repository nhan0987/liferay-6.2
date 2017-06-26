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

import vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoLocalServiceUtil;

import java.util.Arrays;

/**
 * @author huymq
 * @generated
 */
public class MotCuaDienBienHoSoLocalServiceClpInvoker {
	public MotCuaDienBienHoSoLocalServiceClpInvoker() {
		_methodName0 = "addMotCuaDienBienHoSo";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo"
			};

		_methodName1 = "createMotCuaDienBienHoSo";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteMotCuaDienBienHoSo";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteMotCuaDienBienHoSo";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo"
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

		_methodName10 = "fetchMotCuaDienBienHoSo";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getMotCuaDienBienHoSo";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getMotCuaDienBienHoSos";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getMotCuaDienBienHoSosCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateMotCuaDienBienHoSo";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo"
			};

		_methodName118 = "getBeanIdentifier";

		_methodParameterTypes118 = new String[] {  };

		_methodName119 = "setBeanIdentifier";

		_methodParameterTypes119 = new String[] { "java.lang.String" };

		_methodName124 = "findByTrangThaiTruocId";

		_methodParameterTypes124 = new String[] { "long" };

		_methodName125 = "findMotCuaDienBienHoSoByPhieuXuLyChinh";

		_methodParameterTypes125 = new String[] { "long", "int", "int" };

		_methodName126 = "countMotCuaDienBienHoSoByPhieuXuLyChinh";

		_methodParameterTypes126 = new String[] { "long" };

		_methodName127 = "findByTrangThaiSauId";

		_methodParameterTypes127 = new String[] { "long" };

		_methodName128 = "findByPhieuXuLyChinhId";

		_methodParameterTypes128 = new String[] { "long" };

		_methodName129 = "findByPhieuXuLyPhuId";

		_methodParameterTypes129 = new String[] { "long" };

		_methodName130 = "findByPhieuXuLyChinhIdTrangThaiTruocId";

		_methodParameterTypes130 = new String[] { "long", "long" };

		_methodName131 = "findByPhieuXuLyChinhIdTrangThaiSauId";

		_methodParameterTypes131 = new String[] { "long", "long" };

		_methodName132 = "findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauId";

		_methodParameterTypes132 = new String[] { "long", "long", "long" };

		_methodName133 = "fetchByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy";

		_methodParameterTypes133 = new String[] { "long", "long", "long", "long" };

		_methodName134 = "findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy";

		_methodParameterTypes134 = new String[] { "long", "long", "long", "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.addMotCuaDienBienHoSo((vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.createMotCuaDienBienHoSo(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.deleteMotCuaDienBienHoSo(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.deleteMotCuaDienBienHoSo((vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.fetchMotCuaDienBienHoSo(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.getMotCuaDienBienHoSo(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.getMotCuaDienBienHoSos(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.getMotCuaDienBienHoSosCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.updateMotCuaDienBienHoSo((vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo)arguments[0]);
		}

		if (_methodName118.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName119.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
			MotCuaDienBienHoSoLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName124.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.findByTrangThaiTruocId(((Long)arguments[0]).longValue());
		}

		if (_methodName125.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.findMotCuaDienBienHoSoByPhieuXuLyChinh(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName126.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.countMotCuaDienBienHoSoByPhieuXuLyChinh(((Long)arguments[0]).longValue());
		}

		if (_methodName127.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes127, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.findByTrangThaiSauId(((Long)arguments[0]).longValue());
		}

		if (_methodName128.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.findByPhieuXuLyChinhId(((Long)arguments[0]).longValue());
		}

		if (_methodName129.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.findByPhieuXuLyPhuId(((Long)arguments[0]).longValue());
		}

		if (_methodName130.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes130, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.findByPhieuXuLyChinhIdTrangThaiTruocId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName131.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes131, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.findByPhieuXuLyChinhIdTrangThaiSauId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName132.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes132, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName133.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes133, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.fetchByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Long)arguments[3]).longValue());
		}

		if (_methodName134.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes134, parameterTypes)) {
			return MotCuaDienBienHoSoLocalServiceUtil.findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Long)arguments[3]).longValue());
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
	private String _methodName118;
	private String[] _methodParameterTypes118;
	private String _methodName119;
	private String[] _methodParameterTypes119;
	private String _methodName124;
	private String[] _methodParameterTypes124;
	private String _methodName125;
	private String[] _methodParameterTypes125;
	private String _methodName126;
	private String[] _methodParameterTypes126;
	private String _methodName127;
	private String[] _methodParameterTypes127;
	private String _methodName128;
	private String[] _methodParameterTypes128;
	private String _methodName129;
	private String[] _methodParameterTypes129;
	private String _methodName130;
	private String[] _methodParameterTypes130;
	private String _methodName131;
	private String[] _methodParameterTypes131;
	private String _methodName132;
	private String[] _methodParameterTypes132;
	private String _methodName133;
	private String[] _methodParameterTypes133;
	private String _methodName134;
	private String[] _methodParameterTypes134;
}