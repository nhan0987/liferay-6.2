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

import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordServiceUtil;

import java.util.Arrays;

/**
 * @author huymq
 * @generated
 */
public class InspectionRecordServiceClpInvoker {
	public InspectionRecordServiceClpInvoker() {
		_methodName342 = "getBeanIdentifier";

		_methodParameterTypes342 = new String[] {  };

		_methodName343 = "setBeanIdentifier";

		_methodParameterTypes343 = new String[] { "java.lang.String" };

		_methodName348 = "doImportInspectionRecord";

		_methodParameterTypes348 = new String[] { "java.lang.String" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName342.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes342, parameterTypes)) {
			return InspectionRecordServiceUtil.getBeanIdentifier();
		}

		if (_methodName343.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes343, parameterTypes)) {
			InspectionRecordServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName348.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes348, parameterTypes)) {
			return InspectionRecordServiceUtil.doImportInspectionRecord((java.lang.String)arguments[0]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName342;
	private String[] _methodParameterTypes342;
	private String _methodName343;
	private String[] _methodParameterTypes343;
	private String _methodName348;
	private String[] _methodParameterTypes348;
}