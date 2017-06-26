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

import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.ConfirmedInspectionLocalServiceBaseImpl;

/**
 * The implementation of the confirmed inspection local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.ConfirmedInspectionLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil
 */
public class ConfirmedInspectionLocalServiceImpl extends ConfirmedInspectionLocalServiceBaseImpl {
	
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil} to access the confirmed inspection local service.
	 */
	public ConfirmedInspection findByPhieuXuLyPhuId(long phieuXuLyPhuId) {
		try {
			return confirmedInspectionPersistence.findByPhieuXuLyPhuId(phieuXuLyPhuId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public ConfirmedInspection findByCorporationId(java.lang.String corporationId) {
		try {
			return confirmedInspectionPersistence.findByCorporationId(corporationId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public ConfirmedInspection fetchByCorporationId(java.lang.String corporationId) {
		try {
			
			return confirmedInspectionPersistence.fetchByCorporationId(corporationId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<ConfirmedInspection> findByRegisteredInspectionId(long registeredInspectionId) {
		try {
			
			return confirmedInspectionPersistence.findByRegisteredInspectionId(registeredInspectionId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<ConfirmedInspection> findByProvinceCode(String quanHuyen, String tinhThanh, String quocGia) {
		return confirmedInspectionFinder.findByProvinceCode(quanHuyen, tinhThanh, quocGia);
	}
	public List<ConfirmedInspection> findByPhieuXuLyPhuIdAndCorporationId(long idPhieuXuLyPhu, String idCorporation) {
		return confirmedInspectionFinder.findByPhieuXuLyPhuIdAndCorporationId(idPhieuXuLyPhu, idCorporation);
	}
	
	public List<ConfirmedInspection> getListConfirmedInspection(long codeNumber,String	chassisNumber,String	engineNumber, long hoSoThuTucId)  {
		return confirmedInspectionFinder.getListConfirmedInspection(codeNumber, chassisNumber,engineNumber,hoSoThuTucId);
	} 
	
	public List<ConfirmedInspection> findByInspectorIdAndNgayKiemTra(long inspectorId, String corporationid , String ngayKiemTra){
		return confirmedInspectionFinder.findByInspectorIdAndNgayKiemTra(inspectorId, corporationid, ngayKiemTra);
	}
	public List<ConfirmedInspection> findByCorporationIdAndNgayKiemTra(String corporationid , String ngayKiemTra){
		return confirmedInspectionFinder.findByCorporationIdAndNgayKiemTra(corporationid, ngayKiemTra);
	}
	public List<ConfirmedInspection> findConfirmedGroupByInspectorId(String corporationid, String ngayKiemTra){
		return confirmedInspectionFinder.findConfirmedGroupByInspectorId(corporationid, ngayKiemTra);
	}
	
	private static Log _log = LogFactoryUtil.getLog(ConfirmedInspectionLocalServiceImpl.class);
}
