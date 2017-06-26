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
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.api.bean.CertificateXCG;
import vn.dtt.gt.dk.api.bean.CertificateXMY;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.CertificateRecordLocalServiceBaseImpl;

/**
 * The implementation of the certificate record local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalService}
 * interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.CertificateRecordLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil
 */
public class CertificateRecordLocalServiceImpl extends CertificateRecordLocalServiceBaseImpl {

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findBySafetyTestReportId(
			long safetyTestReportId) {
		try {
			return 	certificateRecordPersistence.findBySafetyTestReportId(safetyTestReportId);
		} catch (Exception e) {
//			_log.error(e);
		}
		return null;
	}

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByEmissionTestReportId(
			long emissionTestReportId) {
		try {
			return 	certificateRecordPersistence.findByEmissionTestReportId(emissionTestReportId);
		} catch (Exception e) {
//			_log.error(e);
		}
		return null;
	}

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByCopReportId(long copReportId) {
		try {
			return 	certificateRecordPersistence.findByCopReportId(copReportId);
		} catch (Exception e) {
//			_log.error(e);
		}
		return null;
	}

	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByCertificateNumber(java.lang.String certificateNumber) {
		try {
	    return 		certificateRecordPersistence.findByCertificateNumber(certificateNumber);
		} catch (Exception e) {
//			_log.error(e);
		}
		return null;
	}
	
	public List<CertificateRecord> findCertificateRecord(String schema, 
			String soChungChi, long organizationId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, int year, int start, int end) {
		return certificateRecordFinder.findCertificateRecord(schema, soChungChi, organizationId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year, start, end);
	}

	public int countCertificateRecord(String schema, String soChungChi, long organizationId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, int year) {
		return certificateRecordFinder.countCertificateRecord(schema, soChungChi, organizationId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year);
	}
	public List<CertificateRecord> findByDossierIdAndInspectionReportId(long dossierId, long inspectionReportId) {
		  try {
		   return certificateRecordPersistence.findByDossierIdAndInspectionReportId(dossierId, inspectionReportId);
		  } catch (Exception e) {
//		   _log.error(e);
		  }
		  return null;
		 }
	
	public List<CertificateRecord> findByDossierIdAndInspectionReportIdAndStampStatus(long dossierId, long inspectionReportId){
		try {
			
			return certificateRecordFinder.findByDossierIdAndInspectionReportIdAndStampStatus(dossierId,inspectionReportId);
		} catch (Exception e) {
//			_log.error(e);
		}
		return null;
	}
	
	public int countSoLuongChoDongDau(long phieuXuLyPhuId) {
		return certificateRecordFinder.countSoLuongChoDongDau(phieuXuLyPhuId);
	}

	public boolean deleteCertificateSpecWithCertificateId(long certificateId) {
		 return certificateRecordFinder.deleteCertificateSpecWithCertificateId(certificateId);
	}
	
	public boolean deleteCertificateCircularWithCertificateId(long certificateId) {
		return certificateRecordFinder.deleteCertificateCircularWithCertificateId(certificateId);
	}
	
	public CertificateXMY findCertificateXMY(long companyId,
			String certificateNumber, ServiceContext serviceContext) {
		
		CertificateXMY certificateXMY = new CertificateXMY();
		
		try {
			certificateXMY = certificateRecordFinder.findCertificateXMY(
					companyId, certificateNumber, serviceContext);
		} catch (SystemException e) {
			_log.error(e);
		}
		
		return certificateXMY;
	}
	
	public CertificateXCG findCertificateXCG(long companyId,
			String certificateNumber, ServiceContext serviceContext) {
		
		CertificateXCG certificateXCG = new CertificateXCG();
		
		try {
			certificateXCG = certificateRecordFinder.findCertificateXCG(
					companyId, certificateNumber, serviceContext);
		} catch (SystemException e) {
			_log.error(e);
		}
		
		return certificateXCG;
	}
	
	private static Log _log = LogFactoryUtil.getLog(CertificateRecordLocalServiceImpl.class);
}