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

import vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.CfgTechnicalspecServiceBaseImpl;

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
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.CfgTechnicalspecServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecServiceUtil
 */
public class CfgTechnicalspecServiceImpl
	extends CfgTechnicalspecServiceBaseImpl {
	
	@JSONWebService(value = "count_vr_cfg_technicalspec", method = "GET")
	public int countCfgTechnicalSpec() 
		throws SystemException {
		
		return cfgTechnicalspecPersistence.countAll();
	}
	
	@JSONWebService(value = "count_vr_cfg_technicalspec", method = "GET")
	public int countBySyncDate(String validatefrom) 
		throws SystemException {
		
		return cfgTechnicalspecFinder.countBySynchDate(validatefrom);
	}
	
	@JSONWebService(value = "get_vr_cfg_technicalspec", method = "GET")
	public List<CfgTechnicalspec> getCfgTechnicalSpecs(int start, int end) 
		throws SystemException {
		
		return cfgTechnicalspecPersistence.findAll(start, end);
	}
	
	@JSONWebService(value = "fetch_vr_cfg_technicalspec", method = "GET")
	public CfgTechnicalspec getBySpecificationCode(String specificationcode) 
		throws SystemException, PortalException {
		
		return cfgTechnicalspecPersistence.findBySpecificationCode(specificationcode);
	}
	
	@JSONWebService(value = "get_vr_cfg_technicalspec", method = "GET")
	public List<CfgTechnicalspec> getBySynchDate(String validatefrom) 
		throws SystemException {
		
		return cfgTechnicalspecService.getBySynchDate(validatefrom, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}
	
	@JSONWebService(value = "get_vr_cfg_technicalspec", method = "GET")
	public List<CfgTechnicalspec> getBySynchDate(String validatefrom, int start, int end) 
		throws SystemException {
		
		return cfgTechnicalspecFinder.findBySynchDate(validatefrom, start, end);
	}
}