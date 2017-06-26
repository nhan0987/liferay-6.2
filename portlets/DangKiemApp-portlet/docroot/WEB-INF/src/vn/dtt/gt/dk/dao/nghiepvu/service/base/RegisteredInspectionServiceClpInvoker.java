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

import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionServiceUtil;

import java.util.Arrays;

/**
 * @author win_64
 * @generated
 */
public class RegisteredInspectionServiceClpInvoker {
	public RegisteredInspectionServiceClpInvoker() {
		_methodName470 = "getBeanIdentifier";

		_methodParameterTypes470 = new String[] {  };

		_methodName471 = "setBeanIdentifier";

		_methodParameterTypes471 = new String[] { "java.lang.String" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName470.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes470, parameterTypes)) {
			return RegisteredInspectionServiceUtil.getBeanIdentifier();
		}

		if (_methodName471.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes471, parameterTypes)) {
			RegisteredInspectionServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName470;
	private String[] _methodParameterTypes470;
	private String _methodName471;
	private String[] _methodParameterTypes471;
}