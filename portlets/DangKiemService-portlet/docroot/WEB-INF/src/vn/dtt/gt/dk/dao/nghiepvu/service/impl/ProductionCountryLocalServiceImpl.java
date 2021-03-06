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

import vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.ProductionCountryLocalServiceBaseImpl;

/**
 * The implementation of the production country local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.ProductionCountryLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryLocalServiceUtil
 */
public class ProductionCountryLocalServiceImpl extends ProductionCountryLocalServiceBaseImpl {
	
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryLocalServiceUtil} to access the production country local service.
	 */
	public List<ProductionCountry> findByVehicleGroupId(long vehicleGroupId) {
		try {
			return productionCountryPersistence.findByVehicleGroupId(vehicleGroupId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<ProductionCountry> findByVehicleGroupIdCountryCode(long vehicleGroupId, String countryCode) {
		try {
			return productionCountryPersistence.findByVehicleGroupIdCountryCode(vehicleGroupId, countryCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<ProductionCountry> findByArrayCountryCode(String arrayCountryCode) {
		try {
			return productionCountryFinder.findByArrayCountryCode(arrayCountryCode);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public boolean deleteProductionCountryWithVehicleGroupId(long vehicleGroupId) {
		try{
			return productionCountryFinder.deleteProductionCountry(vehicleGroupId);
		}catch (Exception e) {
			_log.error(e);
			return false;
		}
		
	}
	
	private static Log _log = LogFactoryUtil.getLog(ProductionCountryLocalServiceImpl.class);
}
