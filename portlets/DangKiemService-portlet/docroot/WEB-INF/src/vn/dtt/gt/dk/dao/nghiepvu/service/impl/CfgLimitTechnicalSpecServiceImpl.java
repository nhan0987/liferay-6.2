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

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;

import vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.CfgLimitTechnicalSpecServiceBaseImpl;

/**
 * The implementation of the cfg limit technical spec local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.CfgLimitTechnicalSpecLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.CfgLimitTechnicalSpecServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.CfgLimitTechnicalSpecServiceUtil
 */
public class CfgLimitTechnicalSpecServiceImpl
	extends CfgLimitTechnicalSpecServiceBaseImpl {
	
	@JSONWebService(value = "count_ vr_cfg_limit_technicalspec", method = "GET")
	public int countCfgLimitTechnicalSpec() 
		throws SystemException {
		
		return cfgLimitTechnicalSpecPersistence.countAll();
	}
	
	@JSONWebService(value = "count_ vr_cfg_limit_technicalspec", method = "GET")
	public int countBySyncDate(String validatefrom) 
		throws SystemException {
		
		return cfgLimitTechnicalSpecFinder.countBySynchDate(validatefrom);
	}
	
	@JSONWebService(value = "get_vr_cfg_limit_technicalspec", method = "GET")
	public List<CfgLimitTechnicalSpec> getCfgLimitTechnicalSpecs(int start, int end) 
		throws SystemException {
		
		return cfgLimitTechnicalSpecPersistence.findAll(start, end);
	}
	
	@JSONWebService(value = "fetch_vr_cfg_limit_technicalspec", method = "GET")
	public CfgLimitTechnicalSpec getBySpecificationCode(String specificationcode) 
		throws SystemException, PortalException {
		
		return cfgLimitTechnicalSpecPersistence.findBySpecificationCode(specificationcode);
	}
	
	@JSONWebService(value = "get_vr_cfg_limit_technicalspec", method = "GET")
	public List<CfgLimitTechnicalSpec> getBySynchDate(String validatefrom) 
		throws SystemException {
		
		return cfgLimitTechnicalSpecService.getBySynchDate(validatefrom, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}
	
	@JSONWebService(value = "get_vr_cfg_limit_technicalspec", method = "GET")
	public List<CfgLimitTechnicalSpec> getBySynchDate(String validatefrom, int start, int end) 
		throws SystemException {
		
		return cfgLimitTechnicalSpecFinder.findBySynchDate(validatefrom, start, end);
	}
}