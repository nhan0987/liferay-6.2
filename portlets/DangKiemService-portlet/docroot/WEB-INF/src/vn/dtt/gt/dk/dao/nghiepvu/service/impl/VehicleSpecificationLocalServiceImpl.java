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

package vn.dtt.gt.dk.dao.nghiepvu.service.impl;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.VehicleSpecificationLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * The implementation of the vehicle specification local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.VehicleSpecificationLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationLocalServiceUtil
 */
public class VehicleSpecificationLocalServiceImpl
	extends VehicleSpecificationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationLocalServiceUtil} to access the vehicle specification local service.
	 */
	
	private Log _log = LogFactoryUtil.getLog(VehicleSpecificationLocalServiceImpl.class);
	
	public VehicleSpecification findBySpecificationCode(String specificationCode) {
		List<VehicleSpecification> allSpec = null;
		VehicleSpecification result = null;
		try {
			
			allSpec = vehicleSpecificationPersistence.findBySpecificationCode(specificationCode, 0, 1);
			if (allSpec != null && allSpec.size() > 0) {
				result = allSpec.get(0);
			}
		} catch (SystemException e) {
			_log.error(e);
		}
		
		return result;
	}
	
	public List<VehicleSpecification> findByInspectionRecordId(long inspectionRecordId) {
		try {
			
			return vehicleSpecificationPersistence.findByInspectionRecordId(inspectionRecordId);
			
		} catch (SystemException e) {
			_log.error(e);
		}
		
		return new ArrayList<VehicleSpecification>();
	}
	
	public List<VehicleSpecification> findByVehicleGroupId(long vehicleGroupId) {
		try {
			return vehicleSpecificationPersistence.findByVehicleGroupId(vehicleGroupId);
		} catch (SystemException e) {
			_log.error(e);
		}
		
		return new ArrayList<VehicleSpecification>();
	}

	public List<VehicleSpecification> finderVehicleSpecificationWithVehicleGroupId(long vehicleGroupId) {
		return vehicleSpecificationFinder.finderVehicleSpecificationWithVehicleGroupId(vehicleGroupId);
		
	}
	
	public List<VehicleSpecification> findByVehicleSpecificationWithVehicleGroupIdAndVehicleTypeCode(long vehiclegroupid,String vehicleClass, String vehicleType) {
		return vehicleSpecificationFinder.findByVehicleSpecificationWithVehicleGroupIdAndVehicleTypeCode(vehiclegroupid, vehicleClass, vehicleType);
	}
	
	public List<VehicleSpecification> findByVehicleSpecificationWithVehicleGroupIdAndVehicleTypeCode(long vehicleGroupId, String vehicleClass, String vehicleType, String vehicleTypeCode, String specCategory, long congThucBanhXeId) {
		return vehicleSpecificationFinder.findByVehicleSpecificationWithVehicleGroupIdAndVehicleTypeCode(vehicleGroupId, vehicleClass, vehicleType, vehicleTypeCode, specCategory, congThucBanhXeId);
	}
	
	public VehicleSpecification findByVehicleGroupIdSpecificationCode(
			long vehicleGroupId, String specificationCode){
		try{
			return vehicleSpecificationPersistence.fetchByVehicleGroupIdSpecificationCode(vehicleGroupId,specificationCode);
		}catch (SystemException e) {
			_log.error(e);
		}
		
		return null;
	}
	
	public boolean deleteVehicleSpecificationInitialWithVehicleGroupId(long vehicleGroupId) {
		return vehicleSpecificationFinder.deleteVehicleSpecificationInitialWithVehicleGroupId(vehicleGroupId);
	}
}