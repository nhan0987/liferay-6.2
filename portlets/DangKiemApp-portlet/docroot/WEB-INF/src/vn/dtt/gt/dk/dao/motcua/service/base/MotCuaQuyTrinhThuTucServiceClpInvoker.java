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

import vn.dtt.gt.dk.dao.motcua.service.MotCuaQuyTrinhThuTucServiceUtil;

import java.util.Arrays;

/**
 * @author win_64
 * @generated
 */
public class MotCuaQuyTrinhThuTucServiceClpInvoker {
	public MotCuaQuyTrinhThuTucServiceClpInvoker() {
		_methodName130 = "getBeanIdentifier";

		_methodParameterTypes130 = new String[] {  };

		_methodName131 = "setBeanIdentifier";

		_methodParameterTypes131 = new String[] { "java.lang.String" };

		_methodName136 = "findByThuTucHanhChinhIdAndToChucXuLy";

		_methodParameterTypes136 = new String[] { "long", "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName130.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes130, parameterTypes)) {
			return MotCuaQuyTrinhThuTucServiceUtil.getBeanIdentifier();
		}

		if (_methodName131.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes131, parameterTypes)) {
			MotCuaQuyTrinhThuTucServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName136.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes136, parameterTypes)) {
			return MotCuaQuyTrinhThuTucServiceUtil.findByThuTucHanhChinhIdAndToChucXuLy(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName130;
	private String[] _methodParameterTypes130;
	private String _methodName131;
	private String[] _methodParameterTypes131;
	private String _methodName136;
	private String[] _methodParameterTypes136;
}