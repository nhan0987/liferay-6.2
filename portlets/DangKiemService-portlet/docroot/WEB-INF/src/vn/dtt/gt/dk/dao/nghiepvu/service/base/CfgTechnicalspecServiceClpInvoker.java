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

import vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecServiceUtil;

import java.util.Arrays;

/**
 * @author huymq
 * @generated
 */
public class CfgTechnicalspecServiceClpInvoker {
	public CfgTechnicalspecServiceClpInvoker() {
		_methodName296 = "getBeanIdentifier";

		_methodParameterTypes296 = new String[] {  };

		_methodName297 = "setBeanIdentifier";

		_methodParameterTypes297 = new String[] { "java.lang.String" };

		_methodName302 = "countCfgTechnicalSpec";

		_methodParameterTypes302 = new String[] {  };

		_methodName303 = "countBySyncDate";

		_methodParameterTypes303 = new String[] { "java.lang.String" };

		_methodName304 = "getCfgTechnicalSpecs";

		_methodParameterTypes304 = new String[] { "int", "int" };

		_methodName305 = "getBySpecificationCode";

		_methodParameterTypes305 = new String[] { "java.lang.String" };

		_methodName306 = "getBySynchDate";

		_methodParameterTypes306 = new String[] { "java.lang.String" };

		_methodName307 = "getBySynchDate";

		_methodParameterTypes307 = new String[] { "java.lang.String", "int", "int" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName296.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes296, parameterTypes)) {
			return CfgTechnicalspecServiceUtil.getBeanIdentifier();
		}

		if (_methodName297.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes297, parameterTypes)) {
			CfgTechnicalspecServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName302.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes302, parameterTypes)) {
			return CfgTechnicalspecServiceUtil.countCfgTechnicalSpec();
		}

		if (_methodName303.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes303, parameterTypes)) {
			return CfgTechnicalspecServiceUtil.countBySyncDate((java.lang.String)arguments[0]);
		}

		if (_methodName304.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes304, parameterTypes)) {
			return CfgTechnicalspecServiceUtil.getCfgTechnicalSpecs(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName305.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes305, parameterTypes)) {
			return CfgTechnicalspecServiceUtil.getBySpecificationCode((java.lang.String)arguments[0]);
		}

		if (_methodName306.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes306, parameterTypes)) {
			return CfgTechnicalspecServiceUtil.getBySynchDate((java.lang.String)arguments[0]);
		}

		if (_methodName307.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes307, parameterTypes)) {
			return CfgTechnicalspecServiceUtil.getBySynchDate((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName296;
	private String[] _methodParameterTypes296;
	private String _methodName297;
	private String[] _methodParameterTypes297;
	private String _methodName302;
	private String[] _methodParameterTypes302;
	private String _methodName303;
	private String[] _methodParameterTypes303;
	private String _methodName304;
	private String[] _methodParameterTypes304;
	private String _methodName305;
	private String[] _methodParameterTypes305;
	private String _methodName306;
	private String[] _methodParameterTypes306;
	private String _methodName307;
	private String[] _methodParameterTypes307;
}