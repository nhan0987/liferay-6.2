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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.InspectionRecordLocalServiceBaseImpl;

/**
 * The implementation of the inspection record local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.InspectionRecordLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil
 */
public class InspectionRecordLocalServiceImpl
	extends InspectionRecordLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil} to access the inspection record local service.
	 */
	public List<InspectionRecord> findByRegisteredInspectionId(long registeredInspectionId){
		List<InspectionRecord> result = null;
		try{
			
			result = inspectionRecordPersistence.findByRegisteredInspectionId(registeredInspectionId);
		}catch (Exception e) {
//			_log.error(e);
		}
		return result;
	}
	
	public InspectionRecord findByPhieuXuLyPhuId(long phieuXuLyPhuId){
		try{
			
			return inspectionRecordPersistence.findByPhieuXuLyPhuId(phieuXuLyPhuId);
		}catch (Exception e) {
//			_log.error(e);
		}
		return null;
	}
	
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> findByConfirmedinspectionid(
			long confirmedInspectionId){
		try{
			
			return inspectionRecordPersistence.findByConfirmedinspectionid(confirmedInspectionId);
		}catch (Exception e) {
//			_log.error(e);
		}
		return null;
	}

	public List<InspectionRecord> findByPhieuXuLyPhuIdAndCorporationId(
			long idPhieuXuLyPhu, String idCorporation) {
		return inspectionRecordFinder.findByPhieuXuLyPhuIdAndCorporationId(
				idPhieuXuLyPhu, idCorporation);
	}

	public List<InspectionRecord> findByPhieuXuLyPhuIdAndCorporationIdAndMarkUp(
			long idPhieuXuLyPhu, String idCorporation, int markupSafeTest,
			int markupEmissionTest, int markupControl) {
		return inspectionRecordFinder
				.findByPhieuXuLyPhuIdAndCorporationIdAndMarkUp(idPhieuXuLyPhu,
						idCorporation, markupSafeTest, markupEmissionTest,
						markupControl);
	}

	public boolean deleteInspectionRecordSpec(long inspectionId) {
		return inspectionRecordFinder.deleteInspectionRecordSpec(inspectionId);
	}

	public boolean deleteInspectionCommonstatus(long inspectionId) {
		return inspectionRecordFinder
				.deleteInspectionCommonstatus(inspectionId);
	}

	public List<InspectionRecord> findByBienBanLuuTam(long confirmedInspectionId) {
		return inspectionRecordFinder
				.findByBienBanLuuTam(confirmedInspectionId);
	}

	public List<InspectionRecord> findByAttachedFileID(long idAttachedFile) {
		return inspectionRecordFinder.findByAttachedFileID(idAttachedFile);
	}
	
	public InspectionRecord getByR_I(long registeredInspectionId, String inspectionRecordNumber) 
			throws PortalException, SystemException {
		
		return inspectionRecordPersistence.findByR_I(registeredInspectionId, inspectionRecordNumber);
	}
}