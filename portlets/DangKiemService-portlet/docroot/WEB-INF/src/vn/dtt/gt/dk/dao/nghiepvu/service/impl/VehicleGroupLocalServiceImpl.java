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

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;

import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.VehicleGroupLocalServiceBaseImpl;

/**
 * The implementation of the vehicle group local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.VehicleGroupLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil
 */
public class VehicleGroupLocalServiceImpl
	extends VehicleGroupLocalServiceBaseImpl {
	
	public List<VehicleGroup> findByRegisteredInspectionId(long registeredInspectionId) {
		try {
			return vehicleGroupPersistence.findByRegisteredInspectionId(registeredInspectionId);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<VehicleGroup>();
	}
	
	public TthcNoidungHoSo getThtcNoiDungHoSoByVehicleGroupId(long vehicleGroupId) {
		return vehicleGroupFinder.getThtcNoiDungHoSoByVehicleGroupId(vehicleGroupId);
	}
	
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup> findByTechnicalSpecCode(
			java.lang.String technicalSpecCode){
		try {
			return vehicleGroupPersistence.findByTechnicalSpecCode(technicalSpecCode);
		} catch (SystemException e) {
			_log.error(e);
		}
		
		return null;
	}
	
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup findByTechnicalSpecCodeAndRegisteredInspectionId(
			java.lang.String technicalSpecCode, long registeredInspectionId){
		
		try {
			return vehicleGroupPersistence.fetchByTechnicalSpecCodeAndRegisteredInspectionId(technicalSpecCode,registeredInspectionId);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return null;
	}
	
	public boolean deleteVehicleGroupWithRegisteredInspectionId(long registeredInspectionId) {
		return vehicleGroupFinder.deleteVehicleGroupWithRegisteredInspectionId(registeredInspectionId);
		
	}
	
	public List<VehicleGroup> findByIdHoSoThuTuc(long idHoSoThuTuc) {
		return vehicleGroupFinder.findByIdHoSoThuTuc(idHoSoThuTuc);
	}
	
	private static Log _log = LogFactoryUtil.getLog(VehicleGroupLocalServiceImpl.class);
}