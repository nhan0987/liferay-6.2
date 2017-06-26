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

import vn.dtt.gt.dk.dao.motcua.service.MotCuaDongBoMTgatewayLocalServiceUtil;

import java.util.Arrays;

/**
 * @author win_64
 * @generated
 */
public class MotCuaDongBoMTgatewayLocalServiceClpInvoker {
	public MotCuaDongBoMTgatewayLocalServiceClpInvoker() {
		_methodName0 = "addMotCuaDongBoMTgateway";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway"
			};

		_methodName1 = "createMotCuaDongBoMTgateway";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteMotCuaDongBoMTgateway";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteMotCuaDongBoMTgateway";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway"
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

		_methodName10 = "fetchMotCuaDongBoMTgateway";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getMotCuaDongBoMTgateway";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getMotCuaDongBoMTgatewaies";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getMotCuaDongBoMTgatewaiesCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateMotCuaDongBoMTgateway";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway"
			};

		_methodName146 = "getBeanIdentifier";

		_methodParameterTypes146 = new String[] {  };

		_methodName147 = "setBeanIdentifier";

		_methodParameterTypes147 = new String[] { "java.lang.String" };

		_methodName152 = "findHoSoByPhieuXuLyChinh";

		_methodParameterTypes152 = new String[] { "long", "int", "int" };

		_methodName153 = "countByPhieuXuLyChinh";

		_methodParameterTypes153 = new String[] { "long" };

		_methodName154 = "findByTrangthaiDongbo";

		_methodParameterTypes154 = new String[] { "java.lang.String", "int", "int" };

		_methodName155 = "countByDienbienHosoIdandPhieuXuLyChinhId";

		_methodParameterTypes155 = new String[] { "long", "long" };

		_methodName156 = "findLatestHosoDongboByHosothutucId";

		_methodParameterTypes156 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.addMotCuaDongBoMTgateway((vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.createMotCuaDongBoMTgateway(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.deleteMotCuaDongBoMTgateway(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.deleteMotCuaDongBoMTgateway((vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.fetchMotCuaDongBoMTgateway(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.getMotCuaDongBoMTgateway(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.getMotCuaDongBoMTgatewaies(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.getMotCuaDongBoMTgatewaiesCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.updateMotCuaDongBoMTgateway((vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway)arguments[0]);
		}

		if (_methodName146.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes146, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName147.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes147, parameterTypes)) {
			MotCuaDongBoMTgatewayLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName152.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes152, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.findHoSoByPhieuXuLyChinh(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName153.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes153, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.countByPhieuXuLyChinh(((Long)arguments[0]).longValue());
		}

		if (_methodName154.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes154, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.findByTrangthaiDongbo((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName155.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes155, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.countByDienbienHosoIdandPhieuXuLyChinhId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName156.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes156, parameterTypes)) {
			return MotCuaDongBoMTgatewayLocalServiceUtil.findLatestHosoDongboByHosothutucId(((Long)arguments[0]).longValue());
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
}