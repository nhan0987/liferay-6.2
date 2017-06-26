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

import vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil;

import java.util.Arrays;

/**
 * @author huymq
 * @generated
 */
public class DmDataItemLocalServiceClpInvoker {
	public DmDataItemLocalServiceClpInvoker() {
		_methodName0 = "addDmDataItem";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.gt.dk.dao.common.model.DmDataItem"
			};

		_methodName1 = "createDmDataItem";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteDmDataItem";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteDmDataItem";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.gt.dk.dao.common.model.DmDataItem"
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

		_methodName10 = "fetchDmDataItem";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getDmDataItem";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getDmDataItems";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getDmDataItemsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateDmDataItem";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.gt.dk.dao.common.model.DmDataItem"
			};

		_methodName264 = "getBeanIdentifier";

		_methodParameterTypes264 = new String[] {  };

		_methodName265 = "setBeanIdentifier";

		_methodParameterTypes265 = new String[] { "java.lang.String" };

		_methodName270 = "getByDataGroupCodeNameAndDataItemCode0";

		_methodParameterTypes270 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName271 = "getByDmDataGroupCodeNameAndCode0AndLevel";

		_methodParameterTypes271 = new String[] {
				"java.lang.String", "java.lang.String", "int"
			};

		_methodName272 = "getByCode0";

		_methodParameterTypes272 = new String[] { "java.lang.String" };

		_methodName273 = "findDataItemByDataGroupIdAndItemCode";

		_methodParameterTypes273 = new String[] { "long", "java.lang.String" };

		_methodName274 = "findDmDataItemByDataGroupIdAndLevel";

		_methodParameterTypes274 = new String[] { "long", "int" };

		_methodName275 = "findByArrayCode0";

		_methodParameterTypes275 = new String[] { "java.lang.String" };

		_methodName276 = "findByDataGroupCodeNameAndDataItemCode0";

		_methodParameterTypes276 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName277 = "findByDmDataGroupCode";

		_methodParameterTypes277 = new String[] { "java.lang.String" };

		_methodName278 = "findByDataGroupCodeNameAndDataItemAlterName";

		_methodParameterTypes278 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName279 = "findByGroupName_AlterName";

		_methodParameterTypes279 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName280 = "findByDataGroupIdAndLevelAlterName";

		_methodParameterTypes280 = new String[] {
				"java.lang.String", "int", "java.lang.String"
			};

		_methodName281 = "findByDataGroupIdAndLevelAndAlterName";

		_methodParameterTypes281 = new String[] {
				"long", "int", "java.lang.String"
			};

		_methodName282 = "findByDataGroupIdAndLevel";

		_methodParameterTypes282 = new String[] { "long", "int" };

		_methodName283 = "findByDmDataGroupCodeAndLevel";

		_methodParameterTypes283 = new String[] { "java.lang.String", "int" };

		_methodName284 = "findByDataGroupId";

		_methodParameterTypes284 = new String[] { "long" };

		_methodName285 = "findBySpecificationCode";

		_methodParameterTypes285 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName286 = "findBySpecificationCodeAndspecificationvalue";

		_methodParameterTypes286 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String"
			};

		_methodName287 = "findByDataGroupIdAndAlterName";

		_methodParameterTypes287 = new String[] { "long", "java.lang.String" };

		_methodName288 = "findByVehicleClassAndDatagroupid";

		_methodParameterTypes288 = new String[] { "long", "java.lang.String" };

		_methodName289 = "findByVehicleClassAndDatagroupidByLoaiPhuongTien";

		_methodParameterTypes289 = new String[] { "long", "java.lang.String" };

		_methodName290 = "findByNameGroupAndMultilAlterName";

		_methodParameterTypes290 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return DmDataItemLocalServiceUtil.addDmDataItem((vn.dtt.gt.dk.dao.common.model.DmDataItem)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return DmDataItemLocalServiceUtil.createDmDataItem(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return DmDataItemLocalServiceUtil.deleteDmDataItem(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return DmDataItemLocalServiceUtil.deleteDmDataItem((vn.dtt.gt.dk.dao.common.model.DmDataItem)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return DmDataItemLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return DmDataItemLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return DmDataItemLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return DmDataItemLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return DmDataItemLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return DmDataItemLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return DmDataItemLocalServiceUtil.fetchDmDataItem(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getDmDataItem(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getDmDataItems(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getDmDataItemsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return DmDataItemLocalServiceUtil.updateDmDataItem((vn.dtt.gt.dk.dao.common.model.DmDataItem)arguments[0]);
		}

		if (_methodName264.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes264, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName265.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes265, parameterTypes)) {
			DmDataItemLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName270.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes270, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName271.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes271, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getByDmDataGroupCodeNameAndCode0AndLevel((java.lang.String)arguments[0],
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue());
		}

		if (_methodName272.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes272, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getByCode0((java.lang.String)arguments[0]);
		}

		if (_methodName273.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes273, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName274.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes274, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevel(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName275.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes275, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByArrayCode0((java.lang.String)arguments[0]);
		}

		if (_methodName276.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes276, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDataGroupCodeNameAndDataItemCode0((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName277.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes277, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDmDataGroupCode((java.lang.String)arguments[0]);
		}

		if (_methodName278.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes278, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDataGroupCodeNameAndDataItemAlterName((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName279.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes279, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByGroupName_AlterName((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName280.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes280, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDataGroupIdAndLevelAlterName((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2]);
		}

		if (_methodName281.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes281, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDataGroupIdAndLevelAndAlterName(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2]);
		}

		if (_methodName282.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes282, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDataGroupIdAndLevel(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName283.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes283, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDmDataGroupCodeAndLevel((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue());
		}

		if (_methodName284.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes284, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDataGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName285.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes285, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findBySpecificationCode((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName286.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes286, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findBySpecificationCodeAndspecificationvalue((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
		}

		if (_methodName287.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes287, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDataGroupIdAndAlterName(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName288.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes288, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByVehicleClassAndDatagroupid(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName289.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes289, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByVehicleClassAndDatagroupidByLoaiPhuongTien(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName290.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes290, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByNameGroupAndMultilAlterName((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
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
	private String _methodName264;
	private String[] _methodParameterTypes264;
	private String _methodName265;
	private String[] _methodParameterTypes265;
	private String _methodName270;
	private String[] _methodParameterTypes270;
	private String _methodName271;
	private String[] _methodParameterTypes271;
	private String _methodName272;
	private String[] _methodParameterTypes272;
	private String _methodName273;
	private String[] _methodParameterTypes273;
	private String _methodName274;
	private String[] _methodParameterTypes274;
	private String _methodName275;
	private String[] _methodParameterTypes275;
	private String _methodName276;
	private String[] _methodParameterTypes276;
	private String _methodName277;
	private String[] _methodParameterTypes277;
	private String _methodName278;
	private String[] _methodParameterTypes278;
	private String _methodName279;
	private String[] _methodParameterTypes279;
	private String _methodName280;
	private String[] _methodParameterTypes280;
	private String _methodName281;
	private String[] _methodParameterTypes281;
	private String _methodName282;
	private String[] _methodParameterTypes282;
	private String _methodName283;
	private String[] _methodParameterTypes283;
	private String _methodName284;
	private String[] _methodParameterTypes284;
	private String _methodName285;
	private String[] _methodParameterTypes285;
	private String _methodName286;
	private String[] _methodParameterTypes286;
	private String _methodName287;
	private String[] _methodParameterTypes287;
	private String _methodName288;
	private String[] _methodParameterTypes288;
	private String _methodName289;
	private String[] _methodParameterTypes289;
	private String _methodName290;
	private String[] _methodParameterTypes290;
}