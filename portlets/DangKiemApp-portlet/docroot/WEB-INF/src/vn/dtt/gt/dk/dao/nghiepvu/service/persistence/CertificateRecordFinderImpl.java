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

package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordImpl;
import vn.dtt.gt.dk.utils.format.FormatData;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * The persistence implementation for the certificate record service.
 *
 * <p>
 * Caching debugrmation and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see CertificateRecordPersistence
 * @see CertificateRecordUtil
 * @generated
 */
public class CertificateRecordFinderImpl extends BasePersistenceImpl<CertificateRecord> implements CertificateRecordFinder {
	
	private Log _log = LogFactoryUtil.getLog(CertificateRecordFinderImpl.class);
	public CertificateRecord getCertificateRecord(String certificateNumber){
		Session session = null;
		try {
			session = openSession();
			
			String sql = "SELECT {vr_certificaterecord.*} FROM vr_certificaterecord where stampStatus!=9   AND certificatenumber != 'DRAFT' ";
			sql += " and  certificatenumber =   '"+certificateNumber+"'";
			//sql += " and  inspectionreportid =   "+inspectionReportId;
			//sql += " order by signdate desc";
			_log.debug("=========findCertificateRecord===" + sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(CertificateRecordImpl.TABLE_NAME, CertificateRecordImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			List<CertificateRecord> list =  (List<CertificateRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			if(list!=null&&list.size()>0){
				return list.get(0);
			}
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public List<CertificateRecord> findCertificateRecord(String schema,
			String soChungChi, long organizationId, String thuTucHanhChinhId, String doiTuong, String maSoHoSo, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, int year, int start, int end) {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder();
				if (Validator.isNotNull(schema) && schema.trim().length() > 0) {
					query.append("SELECT id FROM ").append(schema).append(".tthc_hosothutuc where 1=1 ");
				} else {
					query.append("SELECT id FROM tthc_hosothutuc where 1=1 ");
				}

				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					query.append(" AND thutuchanhchinhid = ?");
				}
				if (Validator.isNotNull(doiTuong) && doiTuong.trim().length() > 0) {
					query.append(" AND certificatenumber like '%" + doiTuong.trim() + "%' ");
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					query.append(" AND (maSoHoSo = ? OR mabiennhan = ?) ");
				}
				if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
					Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
					ngayNopFrom = FormatData.parseDateToTring(dateFrom);
					query.append(" AND (ngayguihoso >= '" + ngayNopFrom + "' OR ngayguihoso IS NULL)");
				}
				if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
					Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
					ngayNopTo = FormatData.parseDateToTring(dateTo);
					query.append(" AND (ngayguihoso <= '" + ngayNopTo + "' OR ngayguihoso IS NULL)");
				}
				if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
					query.append(" AND tenchuhoso like  ").append("'%" + tenDoanhNghiep.trim() + "%'");
				}
				if (organizationId > 0) {
					query.append(" AND tochucquanly = ").append(organizationId);
				}
				if (year > 0) {
					query.append(" AND YEAR(ngayguihoso) = ? ");
				}

				String sql = "SELECT {vr_certificaterecord.*} FROM vr_certificaterecord where stampStatus!=9 and  dossierid in (" + query.toString() + ") ";
				if (Validator.isNotNull(soChungChi) && soChungChi.trim().length() > 0) {
					sql += " AND certificatenumber != 'DRAFT' AND certificatenumber like '%" + soChungChi.trim() + "%' ";
				} else {
					sql += " AND certificatenumber != 'DRAFT'";
				}
				
				sql += " order by signdate desc";
				_log.debug("=========findCertificateRecord===" + sql);
				
				SQLQuery q = session.createSQLQuery(sql);
				q.setCacheable(false);
				q.addEntity(CertificateRecordImpl.TABLE_NAME, CertificateRecordImpl.class);
				
				QueryPos qPos = QueryPos.getInstance(q);
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					qPos.add(thuTucHanhChinhId);
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					qPos.add(maSoHoSo);
					qPos.add(maSoHoSo);
				}
				if (year > 0) {
					qPos.add(year);
				}
				
				List<CertificateRecord> list =  (List<CertificateRecord>) QueryUtil.list(q, getDialect(), start, end);

				return list;
				
			} catch (Exception e) {
				_log.error(e);
			} finally {
				closeSession(session);
			}
			
			return new ArrayList<CertificateRecord>();
		}
	
		public int countCertificateRecord(String schema, 
			String soChungChi, long organizationId, String thuTucHanhChinhId, String doiTuong, String maSoHoSo, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, int year) {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder();
				if (Validator.isNotNull(schema) && schema.trim().length() > 0) {
					query.append("SELECT id FROM ").append(schema).append(".tthc_hosothutuc where 1=1 ");
				} else {
					query.append("SELECT id FROM tthc_hosothutuc where 1=1 ");
				}

				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					query.append(" AND thutuchanhchinhid = ?");
				}
				if (Validator.isNotNull(doiTuong) && doiTuong.trim().length() > 0) {
					query.append(" AND certificatenumber like '%" + doiTuong.trim() + "%' ");
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					query.append(" AND (maSoHoSo = ? OR mabiennhan = ?) ");
				}
				if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
					Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
					ngayNopFrom = FormatData.parseDateToTring(dateFrom);
					query.append(" AND (ngayguihoso >= '" + ngayNopFrom + "' OR ngayguihoso IS NULL)");
				}
				if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
					Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
					ngayNopTo = FormatData.parseDateToTring(dateTo);
					query.append(" AND (ngayguihoso <= '" + ngayNopTo + "' OR ngayguihoso IS NULL)");
				}
				if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
					query.append(" AND tenchuhoso like  ").append("'%" + tenDoanhNghiep.trim() + "%'");
				}
				if (organizationId > 0) {
					query.append(" AND tochucquanly = ").append(organizationId);
				}
				if (year > 0) {
					query.append(" AND YEAR(ngayguihoso) = ? ");
				}

				String sql = "SELECT count(*) as total FROM vr_certificaterecord where stampStatus!=9 and dossierid in (" + query.toString() + ") ";
//				if (Validator.isNotNull(soChungChi) && soChungChi.trim().length() > 0) {
//					sql += " AND certificatenumber like '%" + soChungChi.trim() + "%' ";
//				}
				
				if (Validator.isNotNull(soChungChi) && soChungChi.trim().length() > 0) {
					sql += " AND certificatenumber != 'DRAFT' AND certificatenumber like '%" + soChungChi.trim() + "%' ";
				} else {
					sql += " AND certificatenumber != 'DRAFT'";
				}
				
				sql += " order by signdate desc";
				_log.debug("=========findCertificateRecord===" + sql);
				
				SQLQuery q = session.createSQLQuery(sql);
				q.setCacheable(false);
				q.addScalar("total", Type.LONG);
				
				QueryPos qPos = QueryPos.getInstance(q);
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					qPos.add(thuTucHanhChinhId);
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					qPos.add(maSoHoSo);
					qPos.add(maSoHoSo);
				}
				if (year > 0) {
					qPos.add(year);
				}
				
				Iterator<Long> itr = q.list().iterator();
				
				if (itr.hasNext()) {
					Long count = itr.next();

					if (count != null) { return count.intValue(); }
				}
			} catch (Exception e) {
				_log.error(e);
			} finally {
				closeSession(session);
			}
			
			return 0;
		}
		
		
		public List<CertificateRecord> findByDossierIdAndInspectionReportIdAndStampStatus(long dossierId, long inspectionReportId) {
				Session session = null;
				try {
					session = openSession();
					
					String sql = "SELECT {vr_certificaterecord.*} FROM vr_certificaterecord where stampStatus!=9   AND certificatenumber != 'DRAFT' ";
					sql += " and  dossierid =   "+dossierId;
					sql += " and  inspectionreportid =   "+inspectionReportId;
					sql += " order by signdate desc";
					_log.debug("=========findCertificateRecord===" + sql);
					
					SQLQuery q = session.createSQLQuery(sql);
					q.setCacheable(false);
					q.addEntity(CertificateRecordImpl.TABLE_NAME, CertificateRecordImpl.class);
					
					QueryPos qPos = QueryPos.getInstance(q);
					
					List<CertificateRecord> list =  (List<CertificateRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);

					return list;
					
				} catch (Exception e) {
					_log.error(e);
				} finally {
					closeSession(session);
				}
				
				return new ArrayList<CertificateRecord>();
			}
		
		 public int countSoLuongChoDongDau(long phieuXuLyPhuId) {
				Session session = null;
				try {
					session = openSession();
					StringBuilder query = new StringBuilder("Select count(*) as total from dkvn_nghiepvu.vr_certificaterecord ");
					query.append(" where  stampstatus = 0  and ");
					query.append(" id in ( Select certificaterecordid from dkvn_nghiepvu.vr_vehiclerecord where inspectionrecordid in   ");
					
					query.append("   ( Select id from dkvn_nghiepvu.vr_inspectionrecord where phieuxulyphuid = ").append(phieuXuLyPhuId).append("))");
//					Select count(*) as total from dkvn_nghiepvu.vr_certificaterecord where  stampstatus = 0 and id  
//							in ( Select certificaterecordid from dkvn_nghiepvu.vr_vehiclerecord where inspectionrecordid in 
//							 ( Select id from dkvn_nghiepvu.vr_inspectionrecord where phieuxulyphuid = 27914));
					SQLQuery q = session.createSQLQuery(query.toString());
					q.setCacheable(false);
					q.addScalar("total", Type.LONG);
					
					Iterator<Long> itr = q.list().iterator();
					
					if (itr.hasNext()) {
						Long count = itr.next();

						if (count != null) { return count.intValue(); }
					}
				} catch (Exception e) {
					_log.error(e);
				} finally {
					closeSession(session);
				}
				
				return 0;
			}
		 public boolean deleteCertificateSpecWithCertificateId(long certificateId) {
				Session session = null;
				
				try {
					session = openSession();
					StringBuilder query = new StringBuilder();
					
					query.append("Delete from dkvn_nghiepvu.vr_certificaterecordspec where certificaterecordid =  " + certificateId);
										
//					log.info("=========updateVehicleRecordWithConfirmedInspectionId===" + query.toString());
					
					SQLQuery q = session.createSQLQuery(query.toString());
					q.setCacheable(false);
					q.executeUpdate();
					return true;
				} catch (Exception e) {
					_log.error(e);
				} finally {
					closeSession(session);
				}
				
				return false;
			}
		 
		 public boolean deleteCertificateCircularWithCertificateId(long certificateId) {
				Session session = null;
				
				try {
					session = openSession();
					StringBuilder query = new StringBuilder();
					
					
					query.append("Delete from dkvn_nghiepvu.vr_certificatecircular where certificaterecordid =  " + certificateId);
					
//					log.info("=========updateVehicleRecordWithConfirmedInspectionId===" + query.toString());
					
					SQLQuery q = session.createSQLQuery(query.toString());
					q.setCacheable(false);
					q.executeUpdate();
					return true;
				} catch (Exception e) {
					_log.error(e);
				} finally {
					closeSession(session);
				}
				
				return false;
			}
}