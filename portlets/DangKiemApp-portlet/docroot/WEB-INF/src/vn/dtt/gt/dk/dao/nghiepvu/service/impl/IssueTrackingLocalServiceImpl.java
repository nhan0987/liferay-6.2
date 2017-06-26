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

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod;
import vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.IssueTrackingLocalServiceBaseImpl;

/**
 * The implementation of the issue tracking local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.IssueTrackingLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.IssueTrackingLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.IssueTrackingLocalServiceUtil
 */
public class IssueTrackingLocalServiceImpl
	extends IssueTrackingLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.IssueTrackingLocalServiceUtil} to access the issue tracking local service.
	 */
	private static Log _log = LogFactoryUtil.getLog(IssueTrackingLocalServiceImpl.class);
	public List<IssueTracking> findIssueTrackingByDate(String maSoHoSo, String soBBKT, String motaNoiDungLoi, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, String tenSanPham, int start, int end) {			
			try {
				return issueTrackingFinder.findIssueTrackingByDate(maSoHoSo, soBBKT, motaNoiDungLoi, ngayNopFrom, ngayNopTo, tenDoanhNghiep, tenSanPham, start, end);
			} catch (SystemException e) {
				_log.error(e);
			}
			
			return null;
		}
		
		public int countIssueTrackingListByDate(String maSoHoSo, String soBBKT, String motaNoiDungLoi, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, String tenSanPham) throws SystemException {
		
			return issueTrackingFinder.countIssueTrackingListByDate(maSoHoSo, soBBKT, motaNoiDungLoi, ngayNopFrom, ngayNopTo, tenDoanhNghiep, tenSanPham);
		}
		
		public List<IssueTracking> findByDefectStatus(int defectStatus, String inspectionrecordno, String registerednumber) {
			try {
				return issueTrackingPersistence.findByDefectStatus(defectStatus, inspectionrecordno, registerednumber);
			} catch (Exception e) {
				_log.error(e);
			}
			
			return new ArrayList<IssueTracking>();
		}
		
		public List<IssueTracking> findByProductCode(String productcode) {
			try {
				return issueTrackingPersistence.findByProductCode(productcode);
			} catch (Exception e) {
				_log.error(e);
			}
			
			return new ArrayList<IssueTracking>();
		}
		
		public List<IssueTracking> findByImporterName(String importername) {
			try {
				return issueTrackingPersistence.findByImporterName(importername);
			} catch (Exception e) {
				_log.error(e);
			}
			
			return new ArrayList<IssueTracking>();
		}
		
		public List<IssueTracking> findByImporterCode(String importercode) {
			try {
				return issueTrackingPersistence.findByImporterCode(importercode);
			} catch (Exception e) {
				_log.error(e);
			}
			
			return new ArrayList<IssueTracking>();
		}
		
		public List<IssueTracking> findByRegisteredNumber(String registerednumber) {
			try {
				return issueTrackingPersistence.findByRegisteredNumber(registerednumber);
			} catch (Exception e) {
				_log.error(e);
			}
			
			return new ArrayList<IssueTracking>();
		}
		
		public List<IssueTracking> findByInspectionRecordno(String inspectionrecordno, String registerednumber) {
			try {
				return issueTrackingPersistence.findByInspectionRecordno(inspectionrecordno, registerednumber);
			} catch (Exception e) {
				_log.error(e);
			}
			
			return new ArrayList<IssueTracking>();
		}
	
}