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

import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalServiceUtil;

import java.util.Arrays;

/**
 * @author win_64
 * @generated
 */
public class CorporationTeamLocalServiceClpInvoker {
	public CorporationTeamLocalServiceClpInvoker() {
		_methodName0 = "addCorporationTeam";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam"
			};

		_methodName1 = "createCorporationTeam";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteCorporationTeam";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteCorporationTeam";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam"
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

		_methodName10 = "fetchCorporationTeam";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getCorporationTeam";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getCorporationTeams";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getCorporationTeamsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateCorporationTeam";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam"
			};

		_methodName486 = "getBeanIdentifier";

		_methodParameterTypes486 = new String[] {  };

		_methodName487 = "setBeanIdentifier";

		_methodParameterTypes487 = new String[] { "java.lang.String" };

		_methodName492 = "findByCorporationId";

		_methodParameterTypes492 = new String[] { "java.lang.String" };

		_methodName493 = "countByCorporationId";

		_methodParameterTypes493 = new String[] { "java.lang.String" };

		_methodName494 = "findByCorporationId";

		_methodParameterTypes494 = new String[] { "java.lang.String", "int", "int" };

		_methodName495 = "findByCorporationIdAndTrangThai";

		_methodParameterTypes495 = new String[] { "java.lang.String", "int" };

		_methodName496 = "findByInspectorId";

		_methodParameterTypes496 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.addCorporationTeam((vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.createCorporationTeam(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.deleteCorporationTeam(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.deleteCorporationTeam((vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.fetchCorporationTeam(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.getCorporationTeam(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.getCorporationTeams(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.getCorporationTeamsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.updateCorporationTeam((vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam)arguments[0]);
		}

		if (_methodName486.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes486, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName487.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes487, parameterTypes)) {
			CorporationTeamLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName492.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes492, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.findByCorporationId((java.lang.String)arguments[0]);
		}

		if (_methodName493.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes493, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.countByCorporationId((java.lang.String)arguments[0]);
		}

		if (_methodName494.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes494, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.findByCorporationId((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName495.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes495, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.findByCorporationIdAndTrangThai((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue());
		}

		if (_methodName496.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes496, parameterTypes)) {
			return CorporationTeamLocalServiceUtil.findByInspectorId(((Long)arguments[0]).longValue());
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