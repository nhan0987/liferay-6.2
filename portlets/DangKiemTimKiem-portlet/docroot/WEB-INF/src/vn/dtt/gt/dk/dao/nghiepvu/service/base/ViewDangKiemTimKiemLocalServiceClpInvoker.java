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

import vn.dtt.gt.dk.dao.nghiepvu.service.ViewDangKiemTimKiemLocalServiceUtil;

import java.util.Arrays;

/**
 * @author win_64
 * @generated
 */
public class ViewDangKiemTimKiemLocalServiceClpInvoker {
	public ViewDangKiemTimKiemLocalServiceClpInvoker() {
		_methodName0 = "addViewDangKiemTimKiem";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem"
			};

		_methodName1 = "createViewDangKiemTimKiem";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteViewDangKiemTimKiem";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteViewDangKiemTimKiem";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem"
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

		_methodName10 = "fetchViewDangKiemTimKiem";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getViewDangKiemTimKiem";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getViewDangKiemTimKiems";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getViewDangKiemTimKiemsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateViewDangKiemTimKiem";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem"
			};

		_methodName282 = "getBeanIdentifier";

		_methodParameterTypes282 = new String[] {  };

		_methodName283 = "setBeanIdentifier";

		_methodParameterTypes283 = new String[] { "java.lang.String" };

		_methodName288 = "searchDangKiemTimKiem";

		_methodParameterTypes288 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"long", "int", "int"
			};

		_methodName289 = "countDangKiemTimKiem";

		_methodParameterTypes289 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"long"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return ViewDangKiemTimKiemLocalServiceUtil.addViewDangKiemTimKiem((vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return ViewDangKiemTimKiemLocalServiceUtil.createViewDangKiemTimKiem(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return ViewDangKiemTimKiemLocalServiceUtil.deleteViewDangKiemTimKiem(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return ViewDangKiemTimKiemLocalServiceUtil.deleteViewDangKiemTimKiem((vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return ViewDangKiemTimKiemLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return ViewDangKiemTimKiemLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return ViewDangKiemTimKiemLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return ViewDangKiemTimKiemLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return ViewDangKiemTimKiemLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return ViewDangKiemTimKiemLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return ViewDangKiemTimKiemLocalServiceUtil.fetchViewDangKiemTimKiem(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return ViewDangKiemTimKiemLocalServiceUtil.getViewDangKiemTimKiem(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return ViewDangKiemTimKiemLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return ViewDangKiemTimKiemLocalServiceUtil.getViewDangKiemTimKiems(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return ViewDangKiemTimKiemLocalServiceUtil.getViewDangKiemTimKiemsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return ViewDangKiemTimKiemLocalServiceUtil.updateViewDangKiemTimKiem((vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem)arguments[0]);
		}

		if (_methodName282.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes282, parameterTypes)) {
			return ViewDangKiemTimKiemLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName283.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes283, parameterTypes)) {
			ViewDangKiemTimKiemLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName288.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes288, parameterTypes)) {
			return ViewDangKiemTimKiemLocalServiceUtil.searchDangKiemTimKiem((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Long)arguments[3]).longValue(),
				((Integer)arguments[4]).intValue(),
				((Integer)arguments[5]).intValue());
		}

		if (_methodName289.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes289, parameterTypes)) {
			return ViewDangKiemTimKiemLocalServiceUtil.countDangKiemTimKiem((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
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
	private String _methodName282;
	private String[] _methodParameterTypes282;
	private String _methodName283;
	private String[] _methodParameterTypes283;
	private String _methodName288;
	private String[] _methodParameterTypes288;
	private String _methodName289;
	private String[] _methodParameterTypes289;
}