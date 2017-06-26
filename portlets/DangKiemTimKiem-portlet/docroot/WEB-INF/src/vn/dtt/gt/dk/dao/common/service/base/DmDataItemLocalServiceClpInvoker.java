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

		_methodName94 = "getBeanIdentifier";

		_methodParameterTypes94 = new String[] {  };

		_methodName95 = "setBeanIdentifier";

		_methodParameterTypes95 = new String[] { "java.lang.String" };

		_methodName100 = "getByDataGroupCodeNameAndDataItemCode0";

		_methodParameterTypes100 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName101 = "getByDmDataGroupCodeNameAndCode0AndLevel";

		_methodParameterTypes101 = new String[] {
				"java.lang.String", "java.lang.String", "int"
			};

		_methodName102 = "getByCode0";

		_methodParameterTypes102 = new String[] { "java.lang.String" };

		_methodName103 = "findDataItemByDataGroupIdAndItemCode";

		_methodParameterTypes103 = new String[] { "long", "java.lang.String" };

		_methodName104 = "findDmDataItemByDataGroupIdAndLevel";

		_methodParameterTypes104 = new String[] { "long", "int" };

		_methodName105 = "findByArrayCode0";

		_methodParameterTypes105 = new String[] { "java.lang.String" };

		_methodName106 = "findByDataGroupCodeNameAndDataItemCode0";

		_methodParameterTypes106 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName107 = "findByDmDataGroupCode";

		_methodParameterTypes107 = new String[] { "java.lang.String" };

		_methodName108 = "findByDataGroupCodeNameAndDataItemAlterName";

		_methodParameterTypes108 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName109 = "findByDataGroupIdAndLevelAlterName";

		_methodParameterTypes109 = new String[] {
				"java.lang.String", "int", "java.lang.String"
			};

		_methodName110 = "findByDataGroupIdAndLevelAndAlterName";

		_methodParameterTypes110 = new String[] {
				"long", "int", "java.lang.String"
			};

		_methodName111 = "findByDataGroupIdAndLevel";

		_methodParameterTypes111 = new String[] { "long", "int" };

		_methodName112 = "findByDmDataGroupCodeAndLevel";

		_methodParameterTypes112 = new String[] { "java.lang.String", "int" };

		_methodName113 = "findByDataGroupId";

		_methodParameterTypes113 = new String[] { "long" };

		_methodName114 = "findBySpecificationCode";

		_methodParameterTypes114 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName115 = "findBySpecificationCodeAndspecificationvalue";

		_methodParameterTypes115 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String"
			};

		_methodName116 = "findByDataGroupIdAndAlterName";

		_methodParameterTypes116 = new String[] { "long", "java.lang.String" };

		_methodName117 = "findByVehicleClassAndDatagroupid";

		_methodParameterTypes117 = new String[] { "long", "java.lang.String" };

		_methodName118 = "findByVehicleClassAndDatagroupidByLoaiPhuongTien";

		_methodParameterTypes118 = new String[] { "long", "java.lang.String" };

		_methodName119 = "findByNameGroupAndMultilAlterName";

		_methodParameterTypes119 = new String[] {
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

		if (_methodName94.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName95.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
			DmDataItemLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getByDmDataGroupCodeNameAndCode0AndLevel((java.lang.String)arguments[0],
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue());
		}

		if (_methodName102.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
			return DmDataItemLocalServiceUtil.getByCode0((java.lang.String)arguments[0]);
		}

		if (_methodName103.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName104.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevel(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName105.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByArrayCode0((java.lang.String)arguments[0]);
		}

		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDataGroupCodeNameAndDataItemCode0((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName107.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDmDataGroupCode((java.lang.String)arguments[0]);
		}

		if (_methodName108.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDataGroupCodeNameAndDataItemAlterName((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName109.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDataGroupIdAndLevelAlterName((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2]);
		}

		if (_methodName110.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDataGroupIdAndLevelAndAlterName(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2]);
		}

		if (_methodName111.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDataGroupIdAndLevel(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName112.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDmDataGroupCodeAndLevel((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue());
		}

		if (_methodName113.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDataGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findBySpecificationCode((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName115.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findBySpecificationCodeAndspecificationvalue((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
		}

		if (_methodName116.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByDataGroupIdAndAlterName(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName117.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByVehicleClassAndDatagroupid(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName118.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
			return DmDataItemLocalServiceUtil.findByVehicleClassAndDatagroupidByLoaiPhuongTien(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName119.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
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
	private String _methodName94;
	private String[] _methodParameterTypes94;
	private String _methodName95;
	private String[] _methodParameterTypes95;
	private String _methodName100;
	private String[] _methodParameterTypes100;
	private String _methodName101;
	private String[] _methodParameterTypes101;
	private String _methodName102;
	private String[] _methodParameterTypes102;
	private String _methodName103;
	private String[] _methodParameterTypes103;
	private String _methodName104;
	private String[] _methodParameterTypes104;
	private String _methodName105;
	private String[] _methodParameterTypes105;
	private String _methodName106;
	private String[] _methodParameterTypes106;
	private String _methodName107;
	private String[] _methodParameterTypes107;
	private String _methodName108;
	private String[] _methodParameterTypes108;
	private String _methodName109;
	private String[] _methodParameterTypes109;
	private String _methodName110;
	private String[] _methodParameterTypes110;
	private String _methodName111;
	private String[] _methodParameterTypes111;
	private String _methodName112;
	private String[] _methodParameterTypes112;
	private String _methodName113;
	private String[] _methodParameterTypes113;
	private String _methodName114;
	private String[] _methodParameterTypes114;
	private String _methodName115;
	private String[] _methodParameterTypes115;
	private String _methodName116;
	private String[] _methodParameterTypes116;
	private String _methodName117;
	private String[] _methodParameterTypes117;
	private String _methodName118;
	private String[] _methodParameterTypes118;
	private String _methodName119;
	private String[] _methodParameterTypes119;
}