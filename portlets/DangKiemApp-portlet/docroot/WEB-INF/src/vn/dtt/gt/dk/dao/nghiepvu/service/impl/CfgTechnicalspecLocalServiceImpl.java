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

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException;
import vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.CfgTechnicalspecLocalServiceBaseImpl;

/**
 * The implementation of the cfg technicalspec local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.CfgTechnicalspecLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecLocalServiceUtil
 */
public class CfgTechnicalspecLocalServiceImpl extends CfgTechnicalspecLocalServiceBaseImpl {
	
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecLocalServiceUtil} to access the cfg technicalspec local service.
	 */
	public CfgTechnicalspec findBySpecificationCode(String specificationCode) {
		try {
			return cfgTechnicalspecPersistence.findBySpecificationCode(specificationCode);
		} catch (Exception e) {
			if(!(e instanceof NoSuchCfgTechnicalspecException)) {
				_log.error(e);
			}
		}
		
		return null;
	}
	
	public List<CfgTechnicalspec> findByLikeVehicleTypeCode(String likeVehicleTypeCode, int start, int end) {
		return cfgTechnicalspecFinder.findByLikeVehicleTypeCode(likeVehicleTypeCode, start, end);
	}
	
	public List<CfgTechnicalspec> findByVehicleTypeCode(String vehicleTypeCode) {
		return cfgTechnicalspecFinder.findByVehicleTypeCode(vehicleTypeCode);
	}
	
	public List<String> getSpecCategoryByVehicleTypeCode(String vehicleTypeCode) {
		return cfgTechnicalspecFinder.getSpecCategoryByVehicleTypeCode(vehicleTypeCode);
	}
	
	public List<String> getSpecificationCodeBySpecCategory(String[] specCategorys) {
		return cfgTechnicalspecFinder.getSpecificationCodeBySpecCategory(specCategorys);
	}
	
	private static Log _log = LogFactoryUtil.getLog(CfgTechnicalspecLocalServiceImpl.class);
}
