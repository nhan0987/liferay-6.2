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

package vn.dtt.gt.dk.dao.common.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.service.base.DmDataItemLocalServiceBaseImpl;

/**
 * The implementation of the dm data item local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.common.service.DmDataItemLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.common.service.base.DmDataItemLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil
 */
public class DmDataItemLocalServiceImpl extends DmDataItemLocalServiceBaseImpl {
private Log log = LogFactoryUtil.getLog(DmDataItemLocalServiceImpl.class);
	
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil} to access the dm data item local service.
	 */
	
	public DmDataItem getByDataGroupCodeNameAndDataItemCode0(String groupName, String code_0) {
		try {
			return dmDataItemFinder.getByDataGroupCodeNameAndDataItemCode0(groupName, code_0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public DmDataItem getByDmDataGroupCodeNameAndCode0AndLevel(String dmDataGroupCodeName, String code_0, int level) {
		try {
			return dmDataItemFinder.getByDmDataGroupCodeNameAndCode0AndLevel(dmDataGroupCodeName, code_0, level);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public DmDataItem getByCode0(String code_0) {
		try {
			return dmDataItemPersistence.findByCode0(code_0);
		} catch (Exception e) {
			log.info("");
		}
		return null;
	}
	
	public DmDataItem findDataItemByDataGroupIdAndItemCode(long dataGroupId, String itemCode) {
		DmDataItem result = null;
		try {
			List<DmDataItem> allDmDataItem = dmDataItemPersistence.findByDataGroupIdAndCode0(dataGroupId, itemCode);
			if((allDmDataItem != null) && (allDmDataItem.size() > 0)){
				result = allDmDataItem.get(0);
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return result;
	}

	public List<DmDataItem> findDmDataItemByDataGroupIdAndLevel(long groupId, int level) {
		return dmDataItemFinder.findDmDataItemByDataGroupIdAndLevel(groupId, level);
	}
	
	public List<DmDataItem> findByArrayCode0(String arrayCode0) {
		return dmDataItemFinder.findByArrayCode0(arrayCode0);
	}
	
	public List<DmDataItem> findByDataGroupCodeNameAndDataItemCode0(String groupName, String code_0) {
		try {
			return dmDataItemFinder.findByDataGroupCodeNameAndDataItemCode0(groupName, code_0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<DmDataItem> findByDmDataGroupCode(String dmDataGroupCode) {
		try {
			return dmDataItemFinder.findByDmDataGroupCode(dmDataGroupCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<DmDataItem> findByDataGroupCodeNameAndDataItemAlterName(String groupName, String alterName) {
		return dmDataItemFinder.findByDataGroupCodeNameAndDataItemAlterName(groupName, alterName);
	}
	
	public List<DmDataItem> findByDataGroupIdAndLevelAlterName(String dmDataGroupCode,int level,String alterName) {
		try {
			return dmDataItemFinder.findByDmDataGroupCodeAndLevelAlterName(dmDataGroupCode, level, alterName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public List<DmDataItem> findByDataGroupIdAndLevelAndAlterName(long dmDataGroupId,int level, String alterName) {
		try {
			return dmDataItemPersistence.findByDataGroupIdAndLevelAlterName(dmDataGroupId, level, alterName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public List<DmDataItem> findByDataGroupIdAndLevel(long dataGroupId, int level) {
		try {
			return dmDataItemPersistence.findByDataGroupIdAndLevel(dataGroupId, level);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<DmDataItem>();
	}
	
	public List<DmDataItem> findByDmDataGroupCodeAndLevel(String dmDataGroupCode, int level) {
		try {
			return dmDataItemFinder.findByDmDataGroupCodeAndLevel(dmDataGroupCode, level);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<DmDataItem>();
	}
	
	
	
	public List<DmDataItem> findByDataGroupId(long dataGroupId) {
		try {
			return dmDataItemPersistence.findByDataGroupId(dataGroupId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<DmDataItem>();
	}
	
	public List<DmDataItem> findBySpecificationCode(String specificationcode, String vehicleClass) {
		try {
			return dmDataItemFinder.findBySpecificationCode(specificationcode, vehicleClass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<DmDataItem>();
	}
	
	public List<DmDataItem> findBySpecificationCodeAndspecificationvalue(String specificationcode, String specificationvalue, String vehicleClass) {
		try {
			return dmDataItemFinder.findBySpecificationCodeAndspecificationvalue(specificationcode, specificationvalue, vehicleClass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<DmDataItem> findByDataGroupIdAndAlterName(long DataGroupId, String AlterName) {
		try {
			return dmDataItemPersistence.findByDataGroupIdAndAlterName(DataGroupId, AlterName); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<DmDataItem>();
	}
	
	public List<DmDataItem> findByVehicleClassAndDatagroupid(long datagroupid, String vehicleClass) {
		try {
			return dmDataItemFinder.findByVehicleClassAndDatagroupid(datagroupid, vehicleClass); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public List<DmDataItem> findByVehicleClassAndDatagroupidByLoaiPhuongTien(long datagroupid, String vehicleClass) {
		try {
			return dmDataItemFinder.findByVehicleClassAndDatagroupidByLoaiPhuongTien(datagroupid, vehicleClass); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public List<DmDataItem> findByNameGroupAndMultilAlterName(String groupName, String alterName1, String alterName2) {
		try {
			return dmDataItemFinder.findByNameGroupAndMultilAlterName(groupName, alterName1, alterName2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}