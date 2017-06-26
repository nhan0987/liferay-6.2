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

/**
 * @author win_64
 */
public interface DmDataItemFinder {
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDmDataGroupCode(
		java.lang.String dmDataGroupCode);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByArrayCode0(
		java.lang.String arrayCode0);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findBySpecificationCode(
		java.lang.String specificationcode, java.lang.String vehicleClass);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByVehicleClassAndDatagroupid(
		long datagroupid, java.lang.String vehicleClass);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByVehicleClassAndDatagroupidByLoaiPhuongTien(
		long datagroupid, java.lang.String vehicleClass);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findBySpecificationCodeAndspecificationvalue(
		java.lang.String specificationcode,
		java.lang.String specificationvalue, java.lang.String vehicleClass);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDmDataGroupCodeAndLevelAlterName(
		java.lang.String dmDataGroupCode, int level, java.lang.String alterName);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDmDataGroupCodeAndLevel(
		java.lang.String dataGroupCode, int level);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupCodeNameAndDataItemAlterName(
		java.lang.String groupName, java.lang.String alterName);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByNameGroupAndMultilAlterName(
		java.lang.String groupName, java.lang.String alterName1,
		java.lang.String alterName2);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findDmDataItemByDataGroupIdAndLevel(
		long groupId, int level);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupCodeNameAndDataItemCode0(
		java.lang.String groupName, java.lang.String code_0);

	public vn.dtt.gt.dk.dao.common.model.DmDataItem getByDataGroupCodeNameAndDataItemCode0(
		java.lang.String groupName, java.lang.String code_0);

	public vn.dtt.gt.dk.dao.common.model.DmDataItem getByDmDataGroupCodeNameAndCode0AndLevel(
		java.lang.String dmDataGroupCodeName, java.lang.String code_0, int level);
}