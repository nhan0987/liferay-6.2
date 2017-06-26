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
 * @author win_64
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

		_methodName114 = "getBeanIdentifier";

		_methodParameterTypes114 = new String[] {  };

		_methodName115 = "setBeanIdentifier";

		_methodParameterTypes115 = new String[] { "java.lang.String" };

		_methodName120 = "getByDataGroupCodeNameAndDataItemCode0";

		_methodParameterTypes120 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName121 = "getByDmDataGroupCodeNameAndCode0AndLevel";

		_methodParameterTypes121 = new String[] {
				"java.lang.String", "java.lang.String", "int"
			};

		_methodName122 = "getByCode0";

		_methodParameterTypes122 = new String[] { "java.lang.String" };

		_methodName123 = "findDataItemByDataGroupIdAndItemCode";

		_methodParameterTypes123 = new String[] { "long", "java.lang.String" };

		_methodName124 = "findDmDataItemByDataGroupIdAndLevel";

		_methodParameterTypes124 = new String[] { "long", "int" };

		_methodName125 = "findByArrayCode0";

		_methodParameterTypes125 = new String[] { "java.lang.String" };

		_methodName126 = "findByDataGroupCodeNameAndDataItemCode0";

		_methodParameterTypes126 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName127 = "findByDmDataGroupCode";

		_methodParameterTypes127 = new String[] { "java.lang.String" };

		_methodName128 = "findByDataGroupCodeNameAndDataItemAlterName";

		_methodParameterTypes128 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName129 = "findByGroupName_AlterName";

		_methodParameterTypes129 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName130 = "findByDataGroupIdAndLevelAlterName";

		_methodParameterTypes130 = new String[] {
				"java.lang.String", "int", "java.lang.String"
			};

		_methodName131 = "findByDataGroupIdAndLevelAndAlterName";

		_methodParameterTypes131 = new String[] {
				"long", "int", "java.lang.String"
			};

		_methodName132 = "findByDataGroupIdAndLevel";

		_methodParameterTypes132 = new String[] { "long", "int" };

		_methodName133 = "findByDmDataGroupCodeAndLevel";

		_methodParameterTypes133 = new String[] { "java.lang.String", "int" };

		_methodName134 = "findByDataGroupId";

		_methodParameterTypes134 = new String[] { "long" };

		_methodName135 = "findBySpecificationCode";

		_methodParameterTypes135 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName136 = "findBySpecificationCodeAndspecificationvalue";

		_methodParameterTypes136 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String"
			};

		_methodName137 = "findByDataGroupIdAndAlterName";

		_methodParameterTypes137 = new String[] { "long", "java.lang.String" };

		_methodName138 = "findByVehicleClassAndDatagroupid";

		_methodParameterTypes138 = new String[] { "long", "java.lang.String" };

		_methodName139 = "findByVehicleClassAndDatagroupidByLoaiPhuongTien";

		_methodParameterTypes139 = new String[] { "long", "java.lang.String" };

		_methodName140 = "findByNameGroupAndMultilAlterName";

		_methodParameterTypes140 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String"
			};

		_methodName141 = "findDmDataItemByDataGroupIdAndLevelAndCode1";

		_methodParameterTypes141 = new String[] {
				"long", "int", "java.lang.String"
			};

		_methodName142 = "findDmDataItemByDataGroupIdAndLevelAndCode1OrderByDescription";

		_methodParameterTypes142 = new String[] {
				"long", "int", "java.lang.String"
			};

		_methodName143 = "findByGC_C0_C1_C2_C3_L_AN";

		_methodParameterTypes143 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.Integer",
				"java.lang.String"
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

		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName115.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
			DmDataItemLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName120.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName121.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getByDmDataGroupCodeNameAndCode0AndLevel((java.lang.String)arguments[0],
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue());
		}

		if (_methodName122.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getByCode0((java.lang.String)arguments[0]);
		}

		if (_methodName123.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes123, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName124.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevel(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName125.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByArrayCode0((java.lang.String)arguments[0]);
		}

		if (_methodName126.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDataGroupCodeNameAndDataItemCode0((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName127.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes127, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDmDataGroupCode((java.lang.String)arguments[0]);
		}

		if (_methodName128.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDataGroupCodeNameAndDataItemAlterName((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName129.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByGroupName_AlterName((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName130.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes130, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDataGroupIdAndLevelAlterName((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2]);
		}

		if (_methodName131.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes131, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDataGroupIdAndLevelAndAlterName(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2]);
		}

		if (_methodName132.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes132, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDataGroupIdAndLevel(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName133.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes133, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDmDataGroupCodeAndLevel((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue());
		}

		if (_methodName134.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes134, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDataGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName135.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes135, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findBySpecificationCode((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName136.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes136, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findBySpecificationCodeAndspecificationvalue((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
		}

		if (_methodName137.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes137, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDataGroupIdAndAlterName(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName138.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes138, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByVehicleClassAndDatagroupid(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName139.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes139, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByVehicleClassAndDatagroupidByLoaiPhuongTien(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName140.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes140, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByNameGroupAndMultilAlterName((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
		}

		if (_methodName141.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes141, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevelAndCode1(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2]);
		}

		if (_methodName142.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes142, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevelAndCode1OrderByDescription(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2]);
		}

		if (_methodName143.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes143, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByGC_C0_C1_C2_C3_L_AN(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.Integer)arguments[5], (java.lang.String)arguments[6]);
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
	private String _methodName114;
	private String[] _methodParameterTypes114;
	private String _methodName115;
	private String[] _methodParameterTypes115;
	private String _methodName120;
	private String[] _methodParameterTypes120;
	private String _methodName121;
	private String[] _methodParameterTypes121;
	private String _methodName122;
	private String[] _methodParameterTypes122;
	private String _methodName123;
	private String[] _methodParameterTypes123;
	private String _methodName124;
	private String[] _methodParameterTypes124;
	private String _methodName125;
	private String[] _methodParameterTypes125;
	private String _methodName126;
	private String[] _methodParameterTypes126;
	private String _methodName127;
	private String[] _methodParameterTypes127;
	private String _methodName128;
	private String[] _methodParameterTypes128;
	private String _methodName129;
	private String[] _methodParameterTypes129;
	private String _methodName130;
	private String[] _methodParameterTypes130;
	private String _methodName131;
	private String[] _methodParameterTypes131;
	private String _methodName132;
	private String[] _methodParameterTypes132;
	private String _methodName133;
	private String[] _methodParameterTypes133;
	private String _methodName134;
	private String[] _methodParameterTypes134;
	private String _methodName135;
	private String[] _methodParameterTypes135;
	private String _methodName136;
	private String[] _methodParameterTypes136;
	private String _methodName137;
	private String[] _methodParameterTypes137;
	private String _methodName138;
	private String[] _methodParameterTypes138;
	private String _methodName139;
	private String[] _methodParameterTypes139;
	private String _methodName140;
	private String[] _methodParameterTypes140;
	private String _methodName141;
	private String[] _methodParameterTypes141;
	private String _methodName142;
	private String[] _methodParameterTypes142;
	private String _methodName143;
	private String[] _methodParameterTypes143;
}