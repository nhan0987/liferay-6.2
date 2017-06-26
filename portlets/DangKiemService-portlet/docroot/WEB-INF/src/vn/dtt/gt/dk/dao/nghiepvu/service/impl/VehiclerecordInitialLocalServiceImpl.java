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

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.VehiclerecordInitialLocalServiceBaseImpl;

/**
 * The implementation of the vehiclerecord initial local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.VehiclerecordInitialLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalServiceUtil
 */
public class VehiclerecordInitialLocalServiceImpl extends VehiclerecordInitialLocalServiceBaseImpl {
	
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalServiceUtil} to access the vehiclerecord initial local service.
	 */
	
	public VehiclerecordInitial findByCodeNumber(long codeNumber) {
		try {
			return vehiclerecordInitialPersistence.findByCodeNumber(codeNumber);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return null;
	}
	
	public List<VehiclerecordInitial> findByVehicleGroupId(long vehicleGroupId) {
		try {
			return vehiclerecordInitialPersistence.findByVehicleGroupId(vehicleGroupId);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return null;
	}
	
	public List<VehiclerecordInitial> findByArrayId(String arrayId) {
		try {
			return vehiclerecordInitialFinder.findByArrayId(arrayId);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<VehiclerecordInitial>();
	}
	
	public boolean deleteVehicleRecordInitialWithVehicleGroupId(long vehicleGroupId) {
		try{
			return vehiclerecordInitialFinder.deleteVehicleRecordInitialWithVehicleGroupId(vehicleGroupId);
		}catch (Exception e) {
			return true;
		}
	}
	
	private static Log _log = LogFactoryUtil.getLog(VehiclerecordInitialLocalServiceImpl.class);
}
