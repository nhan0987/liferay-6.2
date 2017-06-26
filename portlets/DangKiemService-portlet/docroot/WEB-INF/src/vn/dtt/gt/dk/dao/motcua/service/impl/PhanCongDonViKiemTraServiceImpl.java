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

package vn.dtt.gt.dk.dao.motcua.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextThreadLocal;

import vn.dtt.gt.dk.dao.motcua.service.base.PhanCongDonViKiemTraServiceBaseImpl;
import vn.dtt.gt.dk.utils.OrganizationUtils;
import vn.dtt.gt.dk.utils.format.CommonUtils;

/**
 * The implementation of the phan cong don vi kiem tra remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.motcua.service.PhanCongDonViKiemTraService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.motcua.service.base.PhanCongDonViKiemTraServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.motcua.service.PhanCongDonViKiemTraServiceUtil
 */
public class PhanCongDonViKiemTraServiceImpl
	extends PhanCongDonViKiemTraServiceBaseImpl {
	
	@JSONWebService(value = "countLichKiemTraHienTruong", method = "GET")
	public long countLichKiemTraHienTruong(String emailAddress, long phanNhomHoSoId) 
			throws SystemException, PortalException {
		
		long count = 0;
		
		ServiceContext serviceContext = getServiceContext();
		
		User user = userPersistence.findByC_EA(serviceContext.getCompanyId(), emailAddress);
		
		long organizationId = OrganizationUtils.getOrgIdOfUser(user.getUserId());
		
		String listNhomPhieuXuLy = CommonUtils.getNhomPhieuXuLyByUser(user, phanNhomHoSoId);
		
		if(phanNhomHoSoId == 24 || phanNhomHoSoId == 29)  {
			count = phanCongDonViKiemTraLocalService.countLichKiemTraHienTruong(
					listNhomPhieuXuLy, organizationId, phanNhomHoSoId
					, null, null, null, null, null, 0, null, null, null, user.getUserId());
		} else if(phanNhomHoSoId == 25 || phanNhomHoSoId == 26) {
			count = daKiemTraLocalService.countByMotCuaPhieuXuLyPhu(
					null, null, user.getUserId(),listNhomPhieuXuLy, 
					organizationId, phanNhomHoSoId, null, null, null, null, null,0);
		}
		
		return count;
	}
	
	@SuppressWarnings("unchecked")
	@JSONWebService(value = "getLichKiemTraHienTruong", method = "GET")
	public List<Object> getLichKiemTraHienTruong(String emailAddress, 
			long phanNhomHoSoId, int start, int end) 
			throws SystemException, PortalException {
		
		List<Object> results = new ArrayList<Object>();
		
		ServiceContext serviceContext = getServiceContext();
		
		User user = userPersistence.findByC_EA(serviceContext.getCompanyId(), emailAddress);
		
		long organizationId = OrganizationUtils.getOrgIdOfUser(user.getUserId());
		
		String listNhomPhieuXuLy = CommonUtils.getNhomPhieuXuLyByUser(user, phanNhomHoSoId);
		
		if(phanNhomHoSoId == 24 || phanNhomHoSoId == 29)  {
			results = phanCongDonViKiemTraFinder.findLichKiemTraHienTruong(
					listNhomPhieuXuLy, organizationId, phanNhomHoSoId
					, null, null, null, null, null, 0, null, null, null, user.getUserId(), start, end);
		} else if(phanNhomHoSoId == 25 || phanNhomHoSoId == 26) {
			results = daKiemTraFinder.findByMotCuaPhieuXuLyPhu(
					null, null, user.getUserId(),listNhomPhieuXuLy, 
					organizationId, phanNhomHoSoId, null, null, null, null, null, 0, start, end);
		}
		
		return results;
	}
	
	private ServiceContext getServiceContext() {
		
		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
		
		try {
			if(serviceContext == null) {
				serviceContext = new ServiceContext();
				
				if(getUser() != null) {
					serviceContext.setUserId(getUser().getUserId());
					serviceContext.setScopeGroupId(getUser().getGroupId());
					serviceContext.setCompanyId(getUser().getCompanyId());
				}
			}
		} catch(Exception e) {
			_log.error(e);
		}
		
		serviceContext.setAddGroupPermissions(true);
		serviceContext.setAddGuestPermissions(true);
		
		return serviceContext;
	}
	
	private static Log _log = LogFactoryUtil.getLog(PhanCongDonViKiemTraServiceImpl.class);
}