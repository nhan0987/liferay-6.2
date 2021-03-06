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

package vn.dtt.gt.dk.dao.common.service.base;

import vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil;

import java.util.Arrays;

/**
 * @author win_64
 * @generated
 */
public class TthcNoidungHoSoLocalServiceClpInvoker {
	public TthcNoidungHoSoLocalServiceClpInvoker() {
		_methodName0 = "addTthcNoidungHoSo";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo"
			};

		_methodName1 = "createTthcNoidungHoSo";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteTthcNoidungHoSo";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteTthcNoidungHoSo";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo"
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

		_methodName10 = "fetchTthcNoidungHoSo";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getTthcNoidungHoSo";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getTthcNoidungHoSos";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getTthcNoidungHoSosCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateTthcNoidungHoSo";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo"
			};

		_methodName114 = "getBeanIdentifier";

		_methodParameterTypes114 = new String[] {  };

		_methodName115 = "setBeanIdentifier";

		_methodParameterTypes115 = new String[] { "java.lang.String" };

		_methodName120 = "findTthcBieuMauHoSoByThuTucHanhChinhId";

		_methodParameterTypes120 = new String[] { "long", "long" };

		_methodName121 = "findByVehicleRecordId";

		_methodParameterTypes121 = new String[] { "long" };

		_methodName122 = "findTthcBieuMauHoSoByThuTucHanhChinhIdFinder";

		_methodParameterTypes122 = new String[] { "long", "long" };

		_methodName123 = "findTthcBieuMauHoSoByThuTucHanhChinhIdFinderEnd";

		_methodParameterTypes123 = new String[] { "long", "long" };

		_methodName124 = "findLastByHoSoThuTucIdAndMaBieuMau";

		_methodParameterTypes124 = new String[] { "long", "java.lang.String" };

		_methodName125 = "findBDKByHoSoThuTucIdAndTthcId";

		_methodParameterTypes125 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName126 = "countByBieuMauHoSoIdAndHoSoThuTucId";

		_methodParameterTypes126 = new String[] { "long", "long" };

		_methodName127 = "findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh";

		_methodParameterTypes127 = new String[] {
				"long", "long", "java.lang.String"
			};

		_methodName128 = "findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinder";

		_methodParameterTypes128 = new String[] {
				"long", "long", "java.lang.String"
			};

		_methodName129 = "findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinderEnd";

		_methodParameterTypes129 = new String[] {
				"long", "long", "java.lang.String"
			};

		_methodName130 = "findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucId";

		_methodParameterTypes130 = new String[] { "long", "long" };

		_methodName131 = "findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucIdLanCuoi";

		_methodParameterTypes131 = new String[] { "long", "long" };

		_methodName132 = "findBieuMauHoSoIdAndHoSoThuTucId";

		_methodParameterTypes132 = new String[] { "long", "java.lang.String" };

		_methodName133 = "findBieuMauHoSoIdAndHoSoThuTucId";

		_methodParameterTypes133 = new String[] {
				"long", "java.lang.String", "java.lang.String"
			};

		_methodName134 = "countSoLuongKySo";

		_methodParameterTypes134 = new String[] { "long" };

		_methodName135 = "countSoLuongDaDongDau";

		_methodParameterTypes135 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.addTthcNoidungHoSo((vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.createTthcNoidungHoSo(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.deleteTthcNoidungHoSo(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.deleteTthcNoidungHoSo((vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.getTthcNoidungHoSo(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.getTthcNoidungHoSos(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.getTthcNoidungHoSosCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.updateTthcNoidungHoSo((vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo)arguments[0]);
		}

		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName115.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
			TthcNoidungHoSoLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName120.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.findTthcBieuMauHoSoByThuTucHanhChinhId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName121.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.findByVehicleRecordId(((Long)arguments[0]).longValue());
		}

		if (_methodName122.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.findTthcBieuMauHoSoByThuTucHanhChinhIdFinder(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName123.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes123, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.findTthcBieuMauHoSoByThuTucHanhChinhIdFinderEnd(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName124.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.findLastByHoSoThuTucIdAndMaBieuMau(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName125.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.findBDKByHoSoThuTucIdAndTthcId((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName126.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.countByBieuMauHoSoIdAndHoSoThuTucId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName127.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes127, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(), (java.lang.String)arguments[2]);
		}

		if (_methodName128.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinder(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(), (java.lang.String)arguments[2]);
		}

		if (_methodName129.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinderEnd(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(), (java.lang.String)arguments[2]);
		}

		if (_methodName130.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes130, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName131.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes131, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucIdLanCuoi(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName132.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes132, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.findBieuMauHoSoIdAndHoSoThuTucId(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName133.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes133, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.findBieuMauHoSoIdAndHoSoThuTucId(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
		}

		if (_methodName134.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes134, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.countSoLuongKySo(((Long)arguments[0]).longValue());
		}

		if (_methodName135.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes135, parameterTypes)) {
			return TthcNoidungHoSoLocalServiceUtil.countSoLuongDaDongDau(((Long)arguments[0]).longValue());
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
	private String _methodName114;
	private String[] _methodParameterTypes114;
	private String _methodName115;
	private String[] _methodParameterTypes115;
	private String _methodName120;
	private String[] _methodParameterTypes120;
	private String _methodName121;
	private String[] _methodParameterTypes121;
	private String _methodName122;
	private String[] _methodParameterTypes122;
	private String _methodName123;
	private String[] _methodParameterTypes123;
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
	private String _methodName135;
	private String[] _methodParameterTypes135;
}