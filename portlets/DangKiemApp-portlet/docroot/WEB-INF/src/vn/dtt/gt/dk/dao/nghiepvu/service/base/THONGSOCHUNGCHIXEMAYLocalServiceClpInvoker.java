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

import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEMAYLocalServiceUtil;

import java.util.Arrays;

/**
 * @author win_64
 * @generated
 */
public class THONGSOCHUNGCHIXEMAYLocalServiceClpInvoker {
	public THONGSOCHUNGCHIXEMAYLocalServiceClpInvoker() {
		_methodName0 = "addTHONGSOCHUNGCHIXEMAY";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY"
			};

		_methodName1 = "createTHONGSOCHUNGCHIXEMAY";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteTHONGSOCHUNGCHIXEMAY";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteTHONGSOCHUNGCHIXEMAY";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY"
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

		_methodName10 = "fetchTHONGSOCHUNGCHIXEMAY";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getTHONGSOCHUNGCHIXEMAY";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getTHONGSOCHUNGCHIXEMAYs";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getTHONGSOCHUNGCHIXEMAYsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateTHONGSOCHUNGCHIXEMAY";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY"
			};

		_methodName486 = "getBeanIdentifier";

		_methodParameterTypes486 = new String[] {  };

		_methodName487 = "setBeanIdentifier";

		_methodParameterTypes487 = new String[] { "java.lang.String" };

		_methodName492 = "deleteXMYVehicleCertificateSpecWithHosothutucId";

		_methodParameterTypes492 = new String[] { "long" };

		_methodName493 = "findByCertificateRecordAndHosothutucId";

		_methodParameterTypes493 = new String[] { "long" };

		_methodName494 = "findByVehicleGroupInitialAndHosothutucId";

		_methodParameterTypes494 = new String[] { "long" };

		_methodName495 = "findByCertificateRecordId";

		_methodParameterTypes495 = new String[] { "long" };

		_methodName496 = "findByVehicleGroupId";

		_methodParameterTypes496 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.addTHONGSOCHUNGCHIXEMAY((vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.createTHONGSOCHUNGCHIXEMAY(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.deleteTHONGSOCHUNGCHIXEMAY(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.deleteTHONGSOCHUNGCHIXEMAY((vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.fetchTHONGSOCHUNGCHIXEMAY(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.getTHONGSOCHUNGCHIXEMAY(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.getTHONGSOCHUNGCHIXEMAYs(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.getTHONGSOCHUNGCHIXEMAYsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.updateTHONGSOCHUNGCHIXEMAY((vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY)arguments[0]);
		}

		if (_methodName486.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes486, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName487.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes487, parameterTypes)) {
			THONGSOCHUNGCHIXEMAYLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName492.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes492, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.deleteXMYVehicleCertificateSpecWithHosothutucId(((Long)arguments[0]).longValue());
		}

		if (_methodName493.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes493, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.findByCertificateRecordAndHosothutucId(((Long)arguments[0]).longValue());
		}

		if (_methodName494.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes494, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.findByVehicleGroupInitialAndHosothutucId(((Long)arguments[0]).longValue());
		}

		if (_methodName495.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes495, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.findByCertificateRecordId(((Long)arguments[0]).longValue());
		}

		if (_methodName496.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes496, parameterTypes)) {
			return THONGSOCHUNGCHIXEMAYLocalServiceUtil.findByVehicleGroupId(((Long)arguments[0]).longValue());
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
}