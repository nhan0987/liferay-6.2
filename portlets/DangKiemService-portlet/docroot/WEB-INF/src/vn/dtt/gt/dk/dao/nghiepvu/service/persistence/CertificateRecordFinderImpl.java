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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

import vn.dtt.gt.dk.api.bean.CertificateXCG;
import vn.dtt.gt.dk.api.bean.CertificateXMY;
import vn.dtt.gt.dk.api.util.ApiUtils;
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
	
	public static String FIND_CERTIFICATE_XMY = CertificateRecordFinder.class.getName() + ".findCertificateXMY";
	
	public static String FIND_CERTIFICATE_XCG = CertificateRecordFinder.class.getName() + ".findCertificateXCG";
	
	public CertificateXMY findCertificateXMY(long companyId, String certificateNumber, ServiceContext serviceContext) 
		throws SystemException {
		
		Session session = null;
		
		try {
			session = openSession();
			
			String sql = CustomSQLUtil.get(FIND_CERTIFICATE_XMY);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addScalar("sochungchi", Type.STRING);
			q.addScalar("maloaiphuongtien", Type.STRING);
			q.addScalar("tenloaiphuongtien", Type.STRING);
			q.addScalar("manuocsanxuat", Type.STRING);
			q.addScalar("tennuocsanxuat", Type.STRING);
			q.addScalar("manhanhieu", Type.STRING);
			q.addScalar("tenthuongmai", Type.STRING);
			q.addScalar("namsanxuat", Type.STRING);
			q.addScalar("thetichlamviec", Type.STRING);
			q.addScalar("sochongoi", Type.STRING);
			q.addScalar("sokhung", Type.STRING);
			q.addScalar("somay", Type.STRING);
			q.addScalar("tinhtrangphuongtien", Type.STRING);
			q.addScalar("filechungchiid", Type.LONG);
			q.addScalar("manhomphuongtien", Type.STRING);
			q.addScalar("tennhomphuongtien", Type.STRING);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(certificateNumber);
			
			Iterator itr = QueryUtil.iterate(q, getDialect(), 0, 1);
			
			CertificateXMY cert = null;

			if(itr.hasNext()) {
				Object[] obj = (Object[]) itr.next();
				
				if(obj != null) {
					String soChungChi = GetterUtil.getString(obj[0]);
					String maLoaiPhuongTien = GetterUtil.getString(obj[1]);
					String tenLoaiPhuongTien = GetterUtil.getString(obj[2]);
					String maNuocSanXuat = GetterUtil.getString(obj[3]);
					String tenNuocSanXuat = GetterUtil.getString(obj[4]);
					String maNhanHieu = GetterUtil.getString(obj[5]);
					String tenThuongMai = GetterUtil.getString(obj[6]);
					String namSanXuat = GetterUtil.getString(obj[7]);
					String theTichLamViec = GetterUtil.getString(obj[8]);
					String soChoNgoi = GetterUtil.getString(obj[9]);
					String soKhung = GetterUtil.getString(obj[10]);
					String soMay = GetterUtil.getString(obj[11]);
					String tinhTrangPhuongTien = GetterUtil.getString(obj[12]); 
					long fileChungChiId = GetterUtil.getLong(obj[13]);
					String maNhomPhuongTien = GetterUtil.getString(obj[14]);
					String tenNhomPhuongTien = GetterUtil.getString(obj[15]);
					
					String fileChungChi = ApiUtils.getFileFullURL(companyId, 
							fileChungChiId, serviceContext);
					
					cert = new CertificateXMY();
					cert.setSoChungChi(HtmlUtil.escape(soChungChi));
					cert.setMaLoaiPhuongTien(HtmlUtil.escape(maLoaiPhuongTien));
					cert.setTenLoaiPhuongTien(HtmlUtil.escape(tenLoaiPhuongTien));
					cert.setMaNuocSanXuat(HtmlUtil.escape(maNuocSanXuat));
					cert.setTenNuocSanXuat(HtmlUtil.escape(tenNuocSanXuat));
					cert.setMaNhanHieu(HtmlUtil.escape(maNhanHieu));
					cert.setTenNhanHieu(HtmlUtil.escape(maNhanHieu));
					cert.setTenThuongMai(HtmlUtil.escape(tenThuongMai));
					cert.setNamSanXuat(HtmlUtil.escape(namSanXuat));
					cert.setTheTichLamViec(HtmlUtil.escape(theTichLamViec));
					cert.setSoChoNgoi(HtmlUtil.escape(soChoNgoi));
					cert.setSoKhung(HtmlUtil.escape(soKhung));
					cert.setSoMay(HtmlUtil.escape(soMay));
					cert.setTinhTrangPhuongTien(HtmlUtil.escape(tinhTrangPhuongTien));
					cert.setFileChungChi(HtmlUtil.escape(fileChungChi));
					cert.setMaNhomPhuongTien(HtmlUtil.escape(maNhomPhuongTien));
					cert.setTenNhomPhuongTien(HtmlUtil.escape(tenNhomPhuongTien));
				}
			}
			
			return cert;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public CertificateXCG findCertificateXCG(long companyId, String certificateNumber, ServiceContext serviceContext) 
		throws SystemException {
		
		Session session = null;
		
		try {
			session = openSession();
			
			String sql = CustomSQLUtil.get(FIND_CERTIFICATE_XCG);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addScalar("sochungchi", Type.STRING);
			q.addScalar("maloaiphuongtien", Type.STRING);
			q.addScalar("tenloaiphuongtien", Type.STRING);
			q.addScalar("manuocsanxuat", Type.STRING);
			q.addScalar("tennuocsanxuat", Type.STRING);
			q.addScalar("manhanhieu", Type.STRING);
			q.addScalar("tenthuongmai", Type.STRING);
			q.addScalar("makieuloai", Type.STRING);
			q.addScalar("namsanxuat", Type.STRING);
			q.addScalar("thetichlamviec", Type.STRING);
			q.addScalar("macongthucbanhxe", Type.STRING);
			q.addScalar("loaihopso", Type.STRING);	
			q.addScalar("sochongoi", Type.STRING);
			q.addScalar("trongtai", Type.STRING);
			q.addScalar("sokhung", Type.STRING);
			q.addScalar("somay", Type.STRING);
			q.addScalar("tinhtrangphuongtien", Type.STRING);
			q.addScalar("filechungchiid", Type.LONG);
			q.addScalar("manhomphuongtien", Type.STRING);
			q.addScalar("tennhomphuongtien", Type.STRING);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(certificateNumber);
			
			Iterator itr = QueryUtil.iterate(q, getDialect(), 0, 1);
			CertificateXCG cert = null;
			
			if(itr.hasNext()) {
				Object[] obj = (Object[]) itr.next();
				
				if(obj != null) {
					String soChungChi = GetterUtil.getString(obj[0]);
					String maLoaiPhuongTien = GetterUtil.getString(obj[1]);
					String tenLoaiPhuongTien = GetterUtil.getString(obj[2]);
					String maNuocSanXuat = GetterUtil.getString(obj[3]);
					String tenNuocSanXuat = GetterUtil.getString(obj[4]);
					String maNhanHieu = GetterUtil.getString(obj[5]);
					String tenThuongMai = GetterUtil.getString(obj[6]);
					String maKieuLoai = GetterUtil.getString(obj[7]);
					String namSanXuat = GetterUtil.getString(obj[8]);
					String theTichLamViec = GetterUtil.getString(obj[9]);
					String maCongThucBanhXe = GetterUtil.getString(obj[10]);
					String loaiHopSo = GetterUtil.getString(obj[11]);
					String soChoNgoi = GetterUtil.getString(obj[12]);
					String trongTai = GetterUtil.getString(obj[13]);
					String soKhung = GetterUtil.getString(obj[14]);
					String soMay = GetterUtil.getString(obj[15]);
					String tinhTrangPhuongTien = GetterUtil.getString(obj[16]); 
					long fileChungChiId = GetterUtil.getLong(obj[17]); 
					String maNhomPhuongTien = GetterUtil.getString(obj[18]);
					String tenNhomPhuongTien = GetterUtil.getString(obj[19]);
					
					String fileChungChi = ApiUtils.getFileFullURL(companyId, 
							fileChungChiId, serviceContext);
					
					cert = new CertificateXCG();
					cert.setSoChungChi(HtmlUtil.escape(soChungChi));
					cert.setMaLoaiPhuongTien(HtmlUtil.escape(maLoaiPhuongTien));
					cert.setTenLoaiPhuongTien(HtmlUtil.escape(tenLoaiPhuongTien));
					cert.setMaNuocSanXuat(HtmlUtil.escape(maNuocSanXuat));
					cert.setTenNuocSanXuat(HtmlUtil.escape(tenNuocSanXuat));
					cert.setMaNhanHieu(HtmlUtil.escape(maNhanHieu));
					cert.setTenNhanHieu(HtmlUtil.escape(maNhanHieu));
					cert.setTenThuongMai(HtmlUtil.escape(tenThuongMai));
					cert.setMaKieuLoai(HtmlUtil.escape(maKieuLoai));
					cert.setNamSanXuat(HtmlUtil.escape(namSanXuat));
					cert.setTheTichLamViec(HtmlUtil.escape(theTichLamViec));
					cert.setMaCongThucBanhXe(HtmlUtil.escape(maCongThucBanhXe));
					cert.setTenCongThucBanhXe(HtmlUtil.escape(maCongThucBanhXe));
					cert.setLoaiHopSo(HtmlUtil.escape(loaiHopSo));
					cert.setSoChoNgoi(HtmlUtil.escape(soChoNgoi));
					cert.setTrongTai(HtmlUtil.escape(trongTai));
					cert.setSoKhung(HtmlUtil.escape(soKhung));
					cert.setSoMay(HtmlUtil.escape(soMay));
					cert.setTinhTrangPhuongTien(HtmlUtil.escape(tinhTrangPhuongTien));
					cert.setFileChungChi(HtmlUtil.escape(fileChungChi));
					cert.setMaNhomPhuongTien(HtmlUtil.escape(maNhomPhuongTien));
					cert.setTenNhomPhuongTien(HtmlUtil.escape(tenNhomPhuongTien));
				}
			}
			
			return cert;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
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
			String soChungChi, long organizationId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
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
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					query.append(" AND maSoHoSo = ? ");
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
			String soChungChi, long organizationId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
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
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					query.append(" AND maSoHoSo = ? ");
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