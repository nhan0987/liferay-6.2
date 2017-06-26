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

package vn.dtt.gt.dk.dao.common.service.base;

import vn.dtt.gt.dk.dao.common.service.DmDataItemServiceUtil;

import java.util.Arrays;

/**
 * @author huymq
 * @generated
 */
public class DmDataItemServiceClpInvoker {
	public DmDataItemServiceClpInvoker() {
		_methodName248 = "getBeanIdentifier";

		_methodParameterTypes248 = new String[] {  };

		_methodName249 = "setBeanIdentifier";

		_methodParameterTypes249 = new String[] { "java.lang.String" };

		_methodName254 = "countDmDataItems";

		_methodParameterTypes254 = new String[] {  };

		_methodName255 = "countDmDataItems";

		_methodParameterTypes255 = new String[] { "java.lang.String" };

		_methodName256 = "getDmDataItems";

		_methodParameterTypes256 = new String[] { "int", "int" };

		_methodName257 = "getDmDataItems";

		_methodParameterTypes257 = new String[] { "java.lang.String", "int", "int" };

		_methodName258 = "getByDataGroupIdAndItemCode0";

		_methodParameterTypes258 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName259 = "getDmDataItemByGroupCode";

		_methodParameterTypes259 = new String[] { "java.lang.String" };

		_methodName260 = "getDmDataItemByValidateFrom";

		_methodParameterTypes260 = new String[] { "java.lang.String" };

		_methodName261 = "getByGC_C0_C1_C2_C3_L_AN";

		_methodParameterTypes261 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.Integer",
				"java.lang.String"
			};

		_methodName262 = "getByGN_C0_C1_C2_C3_L_AN";

		_methodParameterTypes262 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.Integer",
				"java.lang.String"
			};

		_methodName263 = "countHoSoNghiepVuBySynchDate";

		_methodParameterTypes263 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName264 = "getHoSoNghiepVuById";

		_methodParameterTypes264 = new String[] { "java.lang.String", "long" };

		_methodName265 = "getHoSoNghiepVuBySynchDate";

		_methodParameterTypes265 = new String[] {
				"java.lang.String", "java.lang.String", "int", "int"
			};

		_methodName266 = "getCurrentTime";

		_methodParameterTypes266 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName248.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes248, parameterTypes)) {
			return DmDataItemServiceUtil.getBeanIdentifier();
		}

		if (_methodName249.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes249, parameterTypes)) {
			DmDataItemServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName254.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes254, parameterTypes)) {
			return DmDataItemServiceUtil.countDmDataItems();
		}

		if (_methodName255.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes255, parameterTypes)) {
			return DmDataItemServiceUtil.countDmDataItems((java.lang.String)arguments[0]);
		}

		if (_methodName256.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes256, parameterTypes)) {
			return DmDataItemServiceUtil.getDmDataItems(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName257.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes257, parameterTypes)) {
			return DmDataItemServiceUtil.getDmDataItems((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName258.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes258, parameterTypes)) {
			return DmDataItemServiceUtil.getByDataGroupIdAndItemCode0((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName259.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes259, parameterTypes)) {
			return DmDataItemServiceUtil.getDmDataItemByGroupCode((java.lang.String)arguments[0]);
		}

		if (_methodName260.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes260, parameterTypes)) {
			return DmDataItemServiceUtil.getDmDataItemByValidateFrom((java.lang.String)arguments[0]);
		}

		if (_methodName261.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes261, parameterTypes)) {
			return DmDataItemServiceUtil.getByGC_C0_C1_C2_C3_L_AN((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.Integer)arguments[5], (java.lang.String)arguments[6]);
		}

		if (_methodName262.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes262, parameterTypes)) {
			return DmDataItemServiceUtil.getByGN_C0_C1_C2_C3_L_AN((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.Integer)arguments[5], (java.lang.String)arguments[6]);
		}

		if (_methodName263.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes263, parameterTypes)) {
			return DmDataItemServiceUtil.countHoSoNghiepVuBySynchDate((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName264.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes264, parameterTypes)) {
			return DmDataItemServiceUtil.getHoSoNghiepVuById((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName265.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes265, parameterTypes)) {
			return DmDataItemServiceUtil.getHoSoNghiepVuBySynchDate((java.lang.String)arguments[0],
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName266.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes266, parameterTypes)) {
			return DmDataItemServiceUtil.getCurrentTime();
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName248;
	private String[] _methodParameterTypes248;
	private String _methodName249;
	private String[] _methodParameterTypes249;
	private String _methodName254;
	private String[] _methodParameterTypes254;
	private String _methodName255;
	private String[] _methodParameterTypes255;
	private String _methodName256;
	private String[] _methodParameterTypes256;
	private String _methodName257;
	private String[] _methodParameterTypes257;
	private String _methodName258;
	private String[] _methodParameterTypes258;
	private String _methodName259;
	private String[] _methodParameterTypes259;
	private String _methodName260;
	private String[] _methodParameterTypes260;
	private String _methodName261;
	private String[] _methodParameterTypes261;
	private String _methodName262;
	private String[] _methodParameterTypes262;
	private String _methodName263;
	private String[] _methodParameterTypes263;
	private String _methodName264;
	private String[] _methodParameterTypes264;
	private String _methodName265;
	private String[] _methodParameterTypes265;
	private String _methodName266;
	private String[] _methodParameterTypes266;
}