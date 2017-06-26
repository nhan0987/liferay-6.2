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

import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialServiceUtil;

import java.util.Arrays;

/**
 * @author win_64
 * @generated
 */
public class VehicleGroupInitialServiceClpInvoker {
	public VehicleGroupInitialServiceClpInvoker() {
		_methodName266 = "getBeanIdentifier";

		_methodParameterTypes266 = new String[] {  };

		_methodName267 = "setBeanIdentifier";

		_methodParameterTypes267 = new String[] { "java.lang.String" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName266.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes266, parameterTypes)) {
			return VehicleGroupInitialServiceUtil.getBeanIdentifier();
		}

		if (_methodName267.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes267, parameterTypes)) {
			VehicleGroupInitialServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName266;
	private String[] _methodParameterTypes266;
	private String _methodName267;
	private String[] _methodParameterTypes267;
}