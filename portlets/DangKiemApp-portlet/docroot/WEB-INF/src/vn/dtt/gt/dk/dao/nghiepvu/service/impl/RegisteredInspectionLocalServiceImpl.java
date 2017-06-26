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

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.RegisteredInspectionLocalServiceBaseImpl;

/**
 * The implementation of the registered inspection local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.RegisteredInspectionLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil
 */
public class RegisteredInspectionLocalServiceImpl
	extends RegisteredInspectionLocalServiceBaseImpl {
	public RegisteredInspection findByDossierId(long dossierId) {
		List<RegisteredInspection> liRegisteredInspections;
		try {
			liRegisteredInspections = registeredInspectionPersistence.findByDossierId(dossierId);
			if(liRegisteredInspections != null && liRegisteredInspections.size() > 0){
				return liRegisteredInspections.get(0);
			}
		} catch (Exception e) {
			try{
			liRegisteredInspections = registeredInspectionPersistence.findByDossierId(dossierId);
			if(liRegisteredInspections != null && liRegisteredInspections.size() > 0){
				return liRegisteredInspections.get(0);
			}
			}catch (Exception e1) {
				// TODO: handle exception
			}
		}
		return null;
	}
	public RegisteredInspection findDanhSachHoSo(long phieuXuLyPhuId) {
		try {
			return registeredInspectionFinder.findDanhSachHoSo(phieuXuLyPhuId);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return null;
	}
	
	
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection findByRegisteredNumber(
			java.lang.String registeredNumber){
		try {
			return registeredInspectionPersistence.findByRegisteredNumber(registeredNumber);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return null;
	}
	
	public int countSoHoSoDangKyKiemTra(long idRegisteredInspection)
			throws SystemException {
		return registeredInspectionFinder.countSoHoSoDangKyKiemTra(idRegisteredInspection);
	}
	
	private static Log _log = LogFactoryUtil.getLog(RegisteredInspectionServiceImpl.class);
}