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

package vn.dtt.gt.dk.dao.api.service.base;

import vn.dtt.gt.dk.dao.api.service.ApiServiceUtil;

import java.util.Arrays;

/**
 * @author huymq
 * @generated
 */
public class ApiServiceClpInvoker {
	public ApiServiceClpInvoker() {
		_methodName224 = "getBeanIdentifier";

		_methodParameterTypes224 = new String[] {  };

		_methodName225 = "setBeanIdentifier";

		_methodParameterTypes225 = new String[] { "java.lang.String" };

		_methodName230 = "userAuthenticate";

		_methodParameterTypes230 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName231 = "processData";

		_methodParameterTypes231 = new String[] {
				"java.lang.String", "java.lang.String"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName224.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes224, parameterTypes)) {
			return ApiServiceUtil.getBeanIdentifier();
		}

		if (_methodName225.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes225, parameterTypes)) {
			ApiServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName230.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes230, parameterTypes)) {
			return ApiServiceUtil.userAuthenticate((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName231.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes231, parameterTypes)) {
			return ApiServiceUtil.processData((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName224;
	private String[] _methodParameterTypes224;
	private String _methodName225;
	private String[] _methodParameterTypes225;
	private String _methodName230;
	private String[] _methodParameterTypes230;
	private String _methodName231;
	private String[] _methodParameterTypes231;
}