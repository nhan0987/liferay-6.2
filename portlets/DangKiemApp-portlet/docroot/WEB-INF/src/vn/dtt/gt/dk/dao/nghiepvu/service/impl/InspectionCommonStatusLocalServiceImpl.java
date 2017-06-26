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

import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.InspectionCommonStatusLocalServiceBaseImpl;

/**
 * The implementation of the inspection common status local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.InspectionCommonStatusLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusLocalServiceUtil
 */
public class InspectionCommonStatusLocalServiceImpl extends InspectionCommonStatusLocalServiceBaseImpl {
	
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusLocalServiceUtil} to access the inspection common status local service.
	 */
	
	public List<InspectionCommonStatus> findByInspectionRecordId(long inspectionRecordId) {
		try {
			return inspectionCommonStatusPersistence.findByInspectionRecordId(inspectionRecordId);
		} catch (Exception e) {
		}
		return null;
	}
	
	public List<InspectionCommonStatus> findByVehicleClassAndTypeAndInspectionRecordId(String vehicleClass, long type, long inspectionRecordId) {
		try {
			return inspectionCommonStatusPersistence.findByVehicleClassAndTypeAndInspectionRecordId(vehicleClass, type, inspectionRecordId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<InspectionCommonStatus>();
	}
	
	public List<InspectionCommonStatus> findByVehicleClassAndInspectionRecordId(String vehicleClass, long inspectionRecordId) {
		try {
			return inspectionCommonStatusPersistence.findByVehicleClassAndInspectionRecordId(vehicleClass, inspectionRecordId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<InspectionCommonStatus>();
	}
	
	public List<InspectionCommonStatus> findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(String vehicleClass, long type, long inspectionRecordId) {
		try {
			return inspectionCommonStatusFinder.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleClass, type, inspectionRecordId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<InspectionCommonStatus>();
	}
	
	private static Log _log = LogFactoryUtil.getLog(InspectionCommonStatusLocalServiceImpl.class);
	
}
