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

package vn.dtt.gt.dk.dao.common.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author win_64
 */
public class DmDataItemFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDmDataGroupCode(
		java.lang.String dmDataGroupCode) {
		return getFinder().findByDmDataGroupCode(dmDataGroupCode);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByArrayCode0(
		java.lang.String arrayCode0) {
		return getFinder().findByArrayCode0(arrayCode0);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findBySpecificationCode(
		java.lang.String specificationcode, java.lang.String vehicleClass) {
		return getFinder()
				   .findBySpecificationCode(specificationcode, vehicleClass);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByVehicleClassAndDatagroupid(
		long datagroupid, java.lang.String vehicleClass) {
		return getFinder()
				   .findByVehicleClassAndDatagroupid(datagroupid, vehicleClass);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByVehicleClassAndDatagroupidByLoaiPhuongTien(
		long datagroupid, java.lang.String vehicleClass) {
		return getFinder()
				   .findByVehicleClassAndDatagroupidByLoaiPhuongTien(datagroupid,
			vehicleClass);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findBySpecificationCodeAndspecificationvalue(
		java.lang.String specificationcode,
		java.lang.String specificationvalue, java.lang.String vehicleClass) {
		return getFinder()
				   .findBySpecificationCodeAndspecificationvalue(specificationcode,
			specificationvalue, vehicleClass);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDmDataGroupCodeAndLevelAlterName(
		java.lang.String dmDataGroupCode, int level, java.lang.String alterName) {
		return getFinder()
				   .findByDmDataGroupCodeAndLevelAlterName(dmDataGroupCode,
			level, alterName);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDmDataGroupCodeAndLevel(
		java.lang.String dataGroupCode, int level) {
		return getFinder().findByDmDataGroupCodeAndLevel(dataGroupCode, level);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupCodeNameAndDataItemAlterName(
		java.lang.String groupName, java.lang.String alterName) {
		return getFinder()
				   .findByDataGroupCodeNameAndDataItemAlterName(groupName,
			alterName);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByGroupName_AlterName(
		java.lang.String groupName, java.lang.String alterName) {
		return getFinder().findByGroupName_AlterName(groupName, alterName);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByNameGroupAndMultilAlterName(
		java.lang.String groupName, java.lang.String alterName1,
		java.lang.String alterName2) {
		return getFinder()
				   .findByNameGroupAndMultilAlterName(groupName, alterName1,
			alterName2);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findDmDataItemByDataGroupIdAndLevel(
		long groupId, int level) {
		return getFinder().findDmDataItemByDataGroupIdAndLevel(groupId, level);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupCodeNameAndDataItemCode0(
		java.lang.String groupName, java.lang.String code_0) {
		return getFinder()
				   .findByDataGroupCodeNameAndDataItemCode0(groupName, code_0);
	}

	public static vn.dtt.gt.dk.dao.common.model.DmDataItem getByDataGroupCodeNameAndDataItemCode0(
		java.lang.String groupName, java.lang.String code_0) {
		return getFinder()
				   .getByDataGroupCodeNameAndDataItemCode0(groupName, code_0);
	}

	public static vn.dtt.gt.dk.dao.common.model.DmDataItem getByDmDataGroupCodeNameAndCode0AndLevel(
		java.lang.String dmDataGroupCodeName, java.lang.String code_0, int level) {
		return getFinder()
				   .getByDmDataGroupCodeNameAndCode0AndLevel(dmDataGroupCodeName,
			code_0, level);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findDmDataItemByDataGroupIdAndLevelAndCode1(
		long groupId, int level, java.lang.String code_1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findDmDataItemByDataGroupIdAndLevelAndCode1(groupId, level,
			code_1);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findDmDataItemByDataGroupIdAndLevelAndCode1OrderByDescription(
		long groupId, int level, java.lang.String code_1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findDmDataItemByDataGroupIdAndLevelAndCode1OrderByDescription(groupId,
			level, code_1);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByGC_C0_C1_C2_C3_L_AN(
		long dataGroupId, java.lang.String code_0, java.lang.String code_1,
		java.lang.String code_2, java.lang.String code_3,
		java.lang.Integer level, java.lang.String alterName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByGC_C0_C1_C2_C3_L_AN(dataGroupId, code_0, code_1,
			code_2, code_3, level, alterName);
	}

	public static DmDataItemFinder getFinder() {
		if (_finder == null) {
			_finder = (DmDataItemFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.common.service.ClpSerializer.getServletContextName(),
					DmDataItemFinder.class.getName());

			ReferenceRegistry.registerReference(DmDataItemFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DmDataItemFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DmDataItemFinderUtil.class,
			"_finder");
	}

	private static DmDataItemFinder _finder;
}