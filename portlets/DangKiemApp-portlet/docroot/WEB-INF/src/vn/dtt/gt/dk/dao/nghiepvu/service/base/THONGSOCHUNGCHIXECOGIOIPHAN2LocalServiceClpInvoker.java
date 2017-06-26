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

import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil;

import java.util.Arrays;

/**
 * @author win_64
 * @generated
 */
public class THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceClpInvoker {
	public THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceClpInvoker() {
		_methodName0 = "addTHONGSOCHUNGCHIXECOGIOIPHAN2";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2"
			};

		_methodName1 = "createTHONGSOCHUNGCHIXECOGIOIPHAN2";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteTHONGSOCHUNGCHIXECOGIOIPHAN2";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteTHONGSOCHUNGCHIXECOGIOIPHAN2";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2"
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

		_methodName10 = "fetchTHONGSOCHUNGCHIXECOGIOIPHAN2";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getTHONGSOCHUNGCHIXECOGIOIPHAN2";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getTHONGSOCHUNGCHIXECOGIOIPHAN2s";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getTHONGSOCHUNGCHIXECOGIOIPHAN2sCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateTHONGSOCHUNGCHIXECOGIOIPHAN2";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2"
			};

		_methodName486 = "getBeanIdentifier";

		_methodParameterTypes486 = new String[] {  };

		_methodName487 = "setBeanIdentifier";

		_methodParameterTypes487 = new String[] { "java.lang.String" };

		_methodName492 = "findByCertificateRecordId";

		_methodParameterTypes492 = new String[] { "long" };

		_methodName493 = "findByVehicleGroupId";

		_methodParameterTypes493 = new String[] { "long" };

		_methodName494 = "findByHoSoThuTucId";

		_methodParameterTypes494 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.addTHONGSOCHUNGCHIXECOGIOIPHAN2((vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.createTHONGSOCHUNGCHIXECOGIOIPHAN2(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.deleteTHONGSOCHUNGCHIXECOGIOIPHAN2(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.deleteTHONGSOCHUNGCHIXECOGIOIPHAN2((vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.fetchTHONGSOCHUNGCHIXECOGIOIPHAN2(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.getTHONGSOCHUNGCHIXECOGIOIPHAN2(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.getTHONGSOCHUNGCHIXECOGIOIPHAN2s(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.getTHONGSOCHUNGCHIXECOGIOIPHAN2sCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.updateTHONGSOCHUNGCHIXECOGIOIPHAN2((vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2)arguments[0]);
		}

		if (_methodName486.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes486, parameterTypes)) {
			return THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName487.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes487, parameterTypes)) {
			THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName492.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes492, parameterTypes)) {
			return THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.findByCertificateRecordId(((Long)arguments[0]).longValue());
		}

		if (_methodName493.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes493, parameterTypes)) {
			return THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.findByVehicleGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName494.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes494, parameterTypes)) {
			return THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.findByHoSoThuTucId(((Long)arguments[0]).longValue());
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
}