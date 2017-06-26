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

package vn.dtt.gt.dk.dao.motcua.service.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyChinhImpl;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

/**
 * @author win_64
 */
public class MotCuaPhieuXuLyChinhFinderImpl extends BasePersistenceImpl<MotCuaPhieuXuLyChinh> 
	implements MotCuaPhieuXuLyChinhFinder {
	
	private Log _log = LogFactoryUtil.getLog(MotCuaPhieuXuLyChinhFinderImpl.class);
		
	public static final String FIND_MOTCUAPHIEUXULYCHINH_CHUAKIEMTRA = MotCuaPhieuXuLyChinhFinder.class.getName() + ".findMotCuaPhieuXuLyChinh_ChuaKiemTra";
	public static final String FIND_MOTCUAPHIEUXULYCHINH_DAKIEMTRACHUAHET = MotCuaPhieuXuLyChinhFinder.class.getName() + ".findMotCuaPhieuXuLyChinh_KiemTraChuaHet";
	public static final String FIND_MOTCUAPHIEUXULYCHINH_CHUAKIEMTRATOANBO = MotCuaPhieuXuLyChinhFinder.class.getName() + ".findMotCuaPhieuXuLyChinh_ChuaKiemTraToanBo";
	public static final String FIND_MOTCUAPHIEUXULYCHINH_DAKIEMTRATOANBO = MotCuaPhieuXuLyChinhFinder.class.getName() + ".findMotCuaPhieuXuLyChinh_DaKiemTraToanBo";
	
	
	public List<MotCuaPhieuXuLyChinh> findMotCuaPhieuXuLyChinhByHoSoThuTucId(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId,
			String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, int year, int start, int end) {
		
		Session session = null;
		
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT id FROM tthc_hosothutuc where 1=1 ");
			
			_log.debug("==nhomPhieuXuLy==" + nhomPhieuXuLy + "==organizationId==" + organizationId);
			_log.debug("==phanNhomHoSoId==" + phanNhomHoSoId + "==thuTucHanhChinhId==" + thuTucHanhChinhId);
			
			_log.debug("==hoSoThuTucId==" + maSoHoSo);
			_log.debug("==ngayNopFrom==" + ngayNopFrom + "==ngayNopTo==" + ngayNopTo);
			_log.debug("==tenDoanhNghiep==" + tenDoanhNghiep + "==start==" + start + "==end==" + end);
			
			if (phanNhomHoSoId > 0) {
				query.append(" AND phannhomhosoid = ?");
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

			String sql = "SELECT {motcua_phieuxulychinh.*} FROM motcua_phieuxulychinh where hosothutucid in (" + query.toString() + ") order by ngaytaophieu asc" ;
			
			if (start >= 0) {
				int count = end - start;
				sql = sql + " limit " + start + "," + count;
			}
			
			_log.debug("=========findMotCuaPhieuXuLyChinhByHoSoThuTucId===" + sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(MotCuaPhieuXuLyChinhImpl.TABLE_NAME, MotCuaPhieuXuLyChinhImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			if (phanNhomHoSoId > 0) {
				qPos.add(phanNhomHoSoId);
			}
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				qPos.add(thuTucHanhChinhId);
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				qPos.add(maSoHoSo);
			}
			if (year > 0) {
				qPos.add(year);
			}
			List<MotCuaPhieuXuLyChinh> list =null;
			if(start>=0){
				list =  (List<MotCuaPhieuXuLyChinh>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS,  QueryUtil.ALL_POS);
			}else{
				list =  (List<MotCuaPhieuXuLyChinh>) QueryUtil.list(q, getDialect(), start, end);
			}

			return list;
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<MotCuaPhieuXuLyChinh>();
	}
	

	public List<MotCuaPhieuXuLyChinh> findMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(String doiTuong,String maSoBienNhan,
		String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
		String ngayNopTo, String tenDoanhNghiep, int year, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT id FROM tthc_hosothutuc where 1=1 ");
			
			_log.debug("==nhomPhieuXuLy==" + nhomPhieuXuLy + "==organizationId==" + organizationId);
			_log.debug("==phanNhomHoSoId==" + phanNhomHoSoId + "==thuTucHanhChinhId==" + thuTucHanhChinhId);
			
			_log.debug("==hoSoThuTucId==" + maSoHoSo);
			_log.debug("==ngayNopFrom==" + ngayNopFrom + "==ngayNopTo==" + ngayNopTo);
			_log.debug("==tenDoanhNghiep==" + tenDoanhNghiep + "==start==" + start + "==end==" + end);
			
			if (phanNhomHoSoId > 0) {
				if ((phanNhomHoSoId == 15) || (phanNhomHoSoId == 71) || (phanNhomHoSoId == 72) || (phanNhomHoSoId == 73) || (phanNhomHoSoId == 74)) {
					query.append(" AND length(mabiennhan)> 0 AND (phannhomhosoid = ? OR phannhomhosoid = ? ) ");						
				} else {
					query.append(" AND phannhomhosoid = ?");
				}
			}
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				query.append(" AND thutuchanhchinhid = ?");
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				query.append(" AND maSoHoSo = ? ");
			}
			if (Validator.isNotNull(maSoBienNhan) && maSoBienNhan.trim().length() > 0) {
				query.append(" AND mabiennhan = '" + maSoBienNhan+"' ");
			}
			if (Validator.isNotNull(doiTuong) && doiTuong.trim().length() > 0) {
				query.append(" AND tendonvitiepnhan = '" + doiTuong+"' ");
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

			String sql = "SELECT {motcua_phieuxulychinh.*} FROM motcua_phieuxulychinh where hosothutucid in (" + query.toString() + ") order by ngaytaophieu desc" ;
			// HSDKKT da cap so DKKT, da huy, da ycbs hien thi theo danh sach thoi gian giam dan.
			// HSDKKT chua cap so DKKT hien thi theo danh sach thoi gian tang dan 
			if ((phanNhomHoSoId != 15) && (phanNhomHoSoId != 57) && (phanNhomHoSoId != 12)) {
				sql = "SELECT {motcua_phieuxulychinh.*} FROM motcua_phieuxulychinh where hosothutucid in (" + query.toString() + ") order by ngaytaophieu asc" ;
			}
			
			// HSDKKT da cap so DKKT, Chua kiem tra; Da kiem tra chua het; Chua kiem tra het phuong tien; hoac Da kiem tra het phuong tien.
			if ((phanNhomHoSoId == 71) || (phanNhomHoSoId == 72) || (phanNhomHoSoId == 73) || (phanNhomHoSoId == 74)) {
			
				String sql71 = CustomSQLUtil.get(FIND_MOTCUAPHIEUXULYCHINH_CHUAKIEMTRA);
				String sql72 = CustomSQLUtil.get(FIND_MOTCUAPHIEUXULYCHINH_DAKIEMTRACHUAHET);
				String sql73 = CustomSQLUtil.get(FIND_MOTCUAPHIEUXULYCHINH_CHUAKIEMTRATOANBO);
				String sql74 = CustomSQLUtil.get(FIND_MOTCUAPHIEUXULYCHINH_DAKIEMTRATOANBO);
				
				if (phanNhomHoSoId == 71) {
					sql = "SELECT {motcua_phieuxulychinh.*} FROM motcua_phieuxulychinh where hosothutucid in (" + query.toString() + ") " + " and hosothutucid in (" + sql71 + ") " + " order by ngaytaophieu asc" ;
				}
				
				if (phanNhomHoSoId == 72) {
					sql = "SELECT {motcua_phieuxulychinh.*} FROM motcua_phieuxulychinh where hosothutucid in (" + query.toString() + ") " + " and hosothutucid in (" + sql72 + ") " + " order by ngaytaophieu asc" ;					
				}
				
				if (phanNhomHoSoId == 73) {
					sql = "SELECT {motcua_phieuxulychinh.*} FROM motcua_phieuxulychinh where hosothutucid in (" + query.toString() + ") " + " and hosothutucid in (" + sql73 + ") " + " order by ngaytaophieu asc" ;
				}
				
				if (phanNhomHoSoId == 74) {
					sql = "SELECT {motcua_phieuxulychinh.*} FROM motcua_phieuxulychinh where hosothutucid in (" + query.toString() + ") " + " and hosothutucid in (" + sql74 + ") " + " order by ngaytaophieu asc" ;
				}				
				
				
			}
			_log.debug("=========findMotCuaPhieuXuLyChinhByHoSoThuTucId===" + sql);
			int count = end-start;
			if(start>=0){
				sql=sql+ " limit "+start+","+count;
			}
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(MotCuaPhieuXuLyChinhImpl.TABLE_NAME, MotCuaPhieuXuLyChinhImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			if (phanNhomHoSoId > 0) {
				if ((phanNhomHoSoId == 15) || (phanNhomHoSoId == 71) || (phanNhomHoSoId == 72) || (phanNhomHoSoId == 73) || (phanNhomHoSoId == 74)) {
					// reset phanNhomHoSoId cho nhom ho so Da cap dang ky kiem tra
					phanNhomHoSoId = 15;
					long phanNhomThongBaoHuyHoSoId = 56; // chua huy 
					qPos.add(phanNhomHoSoId);						
					qPos.add(phanNhomThongBaoHuyHoSoId);
				}
				else {
					qPos.add(phanNhomHoSoId);
				}
			}
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				qPos.add(thuTucHanhChinhId);
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				qPos.add(maSoHoSo);
			}
			if (year > 0) {
				qPos.add(year);
			}
			
			List<MotCuaPhieuXuLyChinh> list =  (List<MotCuaPhieuXuLyChinh>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			return list;
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<MotCuaPhieuXuLyChinh>();
	}
	
	public int countMotCuaPhieuXuLyChinhByHoSoThuTucId(String nhomPhieuXuLy,
			long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId,
			String maSoHoSo, String ngayNopFrom, String ngayNopTo,
			String tenDoanhNghiep, int year) {
		
		Session session = null;
		
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder("SELECT id FROM tthc_hosothutuc where 1=1 ");
			
			if (phanNhomHoSoId > 0) {
				query.append(" AND phannhomhosoid = ?");
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
			
			//String sql = "SELECT count(*) as total FROM motcua_phieuxulyphu where nhomphieuxuly in (" + nhomPhieuXuLy + ") and phieuxulychinhid in ( SELECT id FROM motcua_phieuxulychinh  where hosothutucid in (" + query.toString() + ") )";
			String sql = "SELECT count(*) as total FROM motcua_phieuxulychinh where hosothutucid in (" + query.toString() + ")";
			_log.debug("=========countMotCuaPhieuXuLyChinhByHoSoThuTucId===" + sql);
			_log.debug("===countMotCuaPhieuXuLyChinhByHoSoThuTucId==maSoHoSo==" + maSoHoSo);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
		
			if (phanNhomHoSoId > 0) {
				qPos.add(phanNhomHoSoId);
			}
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
	
	public int countMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(
			String doiTuong, String maSoBienNhan, String nhomPhieuXuLy,
			long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId,
			String maSoHoSo, String ngayNopFrom, String ngayNopTo,
			String tenDoanhNghiep, int year) {
		
		Session session = null;
		
			try {
				session = openSession();
				StringBuilder query = new StringBuilder("SELECT id FROM tthc_hosothutuc where 1=1 ");
				
				if (phanNhomHoSoId > 0) {
					if ((phanNhomHoSoId == 15) || (phanNhomHoSoId == 71) || (phanNhomHoSoId == 72) || (phanNhomHoSoId == 73) || (phanNhomHoSoId == 74)) {
						query.append(" AND length(mabiennhan)> 0 AND (phannhomhosoid = ? OR phannhomhosoid = ? ) ");						
					} else {
						query.append(" AND phannhomhosoid = ?");
					}					
				}
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					query.append(" AND thutuchanhchinhid = ?");
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					query.append(" AND maSoHoSo = ? ");
				}
				if (Validator.isNotNull(maSoBienNhan) && maSoBienNhan.trim().length() > 0) {
					query.append(" AND mabiennhan = '" + maSoBienNhan+"' ");
				}
				if (Validator.isNotNull(doiTuong) && doiTuong.trim().length() > 0) {
					query.append(" AND tendonvitiepnhan = '" + doiTuong+"' ");
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
				
				//String sql = "SELECT count(*) as total FROM motcua_phieuxulyphu where nhomphieuxuly in (" + nhomPhieuXuLy + ") and phieuxulychinhid in ( SELECT id FROM motcua_phieuxulychinh  where hosothutucid in (" + query.toString() + ") )";
				String sql = "SELECT count(*) as total FROM motcua_phieuxulychinh where hosothutucid in (" + query.toString() + ")";
				_log.debug("=========countMotCuaPhieuXuLyChinhByHoSoThuTucId===" + sql);
				_log.debug("===countMotCuaPhieuXuLyChinhByHoSoThuTucId==maSoHoSo==" + maSoHoSo);
				
				// HSDKKT da cap so DKKT, Chua kiem tra; Da kiem tra chua het; Chua kiem tra het phuong tien; hoac Da kiem tra het phuong tien.
				if ((phanNhomHoSoId == 71) || (phanNhomHoSoId == 72) || (phanNhomHoSoId == 73) || (phanNhomHoSoId == 74)) {
				
					String sql71 = CustomSQLUtil.get(FIND_MOTCUAPHIEUXULYCHINH_CHUAKIEMTRA);
					String sql72 = CustomSQLUtil.get(FIND_MOTCUAPHIEUXULYCHINH_DAKIEMTRACHUAHET);
					String sql73 = CustomSQLUtil.get(FIND_MOTCUAPHIEUXULYCHINH_CHUAKIEMTRATOANBO);
					String sql74 = CustomSQLUtil.get(FIND_MOTCUAPHIEUXULYCHINH_DAKIEMTRATOANBO);
					
					if (phanNhomHoSoId == 71) {
						sql = "SELECT count(*) as total FROM motcua_phieuxulychinh where hosothutucid in (" + query.toString() + ") " + " and hosothutucid in (" + sql71 + ") "  ;
					}
					
					if (phanNhomHoSoId == 72) {
						sql = "SELECT count(*) as total FROM motcua_phieuxulychinh where hosothutucid in (" + query.toString() + ") " + " and hosothutucid in (" + sql72 + ") "  ;					
					}
					
					if (phanNhomHoSoId == 73) {
						sql = "SELECT count(*) as total FROM motcua_phieuxulychinh where hosothutucid in (" + query.toString() + ") " + " and hosothutucid in (" + sql73 + ") "  ;
					}
					
					if (phanNhomHoSoId == 74) {
						sql = "SELECT count(*) as total FROM motcua_phieuxulychinh where hosothutucid in (" + query.toString() + ") " + " and hosothutucid in (" + sql74 + ") "  ;
					}				
					
					
				}
				
				SQLQuery q = session.createSQLQuery(sql);
				q.setCacheable(false);
				q.addScalar("total", Type.LONG);

				QueryPos qPos = QueryPos.getInstance(q);
			
				if (phanNhomHoSoId > 0) {
					if ((phanNhomHoSoId == 15) || (phanNhomHoSoId == 71) || (phanNhomHoSoId == 72) || (phanNhomHoSoId == 73) || (phanNhomHoSoId == 74)) {
						// reset phanNhomHoSoId cho nhom ho so Da cap dang ky kiem tra
						phanNhomHoSoId = 15;
						long phanNhomThongBaoHuyHoSoId = 56; // chua huy 
						qPos.add(phanNhomHoSoId);						
						qPos.add(phanNhomThongBaoHuyHoSoId);
					}
					else {
						qPos.add(phanNhomHoSoId);
					}
					
				}
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
}
