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

import vn.dtt.gt.dk.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil;

import java.util.Arrays;

/**
 * @author win_64
 * @generated
 */
public class TthcThanhPhanHoSoLocalServiceClpInvoker {
	public TthcThanhPhanHoSoLocalServiceClpInvoker() {
		_methodName0 = "addTthcThanhPhanHoSo";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo"
			};

		_methodName1 = "createTthcThanhPhanHoSo";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteTthcThanhPhanHoSo";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteTthcThanhPhanHoSo";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo"
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

		_methodName10 = "fetchTthcThanhPhanHoSo";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getTthcThanhPhanHoSo";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getTthcThanhPhanHoSos";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getTthcThanhPhanHoSosCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateTthcThanhPhanHoSo";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo"
			};

		_methodName114 = "getBeanIdentifier";

		_methodParameterTypes114 = new String[] {  };

		_methodName115 = "setBeanIdentifier";

		_methodParameterTypes115 = new String[] { "java.lang.String" };

		_methodName120 = "findByLinhVuc";

		_methodParameterTypes120 = new String[] { "long" };

		_methodName121 = "findByThuTucHanhChinhIdAndBieuMauHoSoId";

		_methodParameterTypes121 = new String[] { "long", "long" };

		_methodName122 = "findByThuTucHanhChinhIdAndMauTrucTuyen";

		_methodParameterTypes122 = new String[] { "long", "java.lang.String" };

		_methodName123 = "searchTthcThanhPhanHoSo";

		_methodParameterTypes123 = new String[] {
				"long", "long", "int", "int", "java.lang.String", "long", "int",
				"int"
			};

		_methodName124 = "countTthcThanhPhanHoSo";

		_methodParameterTypes124 = new String[] {
				"long", "long", "int", "int", "java.lang.String", "long"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.addTthcThanhPhanHoSo((vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.createTthcThanhPhanHoSo(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.deleteTthcThanhPhanHoSo(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.deleteTthcThanhPhanHoSo((vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.fetchTthcThanhPhanHoSo(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.getTthcThanhPhanHoSo(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.getTthcThanhPhanHoSos(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.getTthcThanhPhanHoSosCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.updateTthcThanhPhanHoSo((vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo)arguments[0]);
		}

		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName115.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
			TthcThanhPhanHoSoLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName120.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.findByLinhVuc(((Long)arguments[0]).longValue());
		}

		if (_methodName121.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.findByThuTucHanhChinhIdAndBieuMauHoSoId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName122.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.findByThuTucHanhChinhIdAndMauTrucTuyen(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName123.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes123, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.searchTthcThanhPhanHoSo(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(java.lang.String)arguments[4],
				((Long)arguments[5]).longValue(),
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue());
		}

		if (_methodName124.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
			return TthcThanhPhanHoSoLocalServiceUtil.countTthcThanhPhanHoSo(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(java.lang.String)arguments[4], ((Long)arguments[5]).longValue());
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
}