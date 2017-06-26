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

import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuImpl;
import vn.dtt.gt.dk.utils.DanhMucKey;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

/**
 * @author win_64
 */
public class MotCuaPhieuXuLyPhuFinderImpl extends BasePersistenceImpl<MotCuaPhieuXuLyPhu> implements MotCuaPhieuXuLyPhuFinder {
	
	private Log _log = LogFactoryUtil.getLog(MotCuaPhieuXuLyPhuFinderImpl.class);
	
	public List<MotCuaPhieuXuLyPhu> findDanhSachHoSo(
		long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo,
		String tenDoanhNghiep, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();			
			String sql =
				"SELECT {motcua_phieuxulyphu.*} FROM motcua_phieuxulyphu where phieuxulychinhid in(SELECT pxlc.id phieuxulychinhid from motcua_phieuxulychinh pxlc INNER JOIN tthc_hosothutuc hstt ON pxlc.hosothutucid = hstt.id ";
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				query.append(" AND hstt.thutuchanhchinhid = " + thuTucHanhChinhId);
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				query.append(" AND hstt.masohoso = " + maSoHoSo);
			}
			if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(dateFrom);
				query.append(" AND (hstt.ngayguihoso >= '" + ngayNopFrom + "' OR hstt.ngayguihoso IS NULL)");
			}
			
			if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(dateTo);
				query.append(" AND (hstt.ngayguihoso <= '" + ngayNopTo + "' OR hstt.ngayguihoso IS NULL)");
			}
			if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
				query.append(" AND hstt.tenchuhoso LIKE'%" + tenDoanhNghiep + "%')");
			}
			if (phanNhomHoSoId > 0) {
				query.append(" AND hstt.phannhomhosoid = " + phanNhomHoSoId);
			}
			if (organizationId > 0) {
				query.append(" AND hstt.tochucquanly = " + organizationId);
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				query.append(" ORDER BY hstt.masohoso = " + maSoHoSo + " DESC)");
			} else {
				query.append(" ORDER BY hstt.ngaytiepnhan DESC)");
			}
			
			sql = sql + query.toString();
			int count = end-start;
			if(start>=0){
				sql=sql+ " limit "+start+","+count;
			}			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(MotCuaPhieuXuLyPhuImpl.TABLE_NAME, MotCuaPhieuXuLyPhuImpl.class);
			
			_log.debug("=========findDanhSachHoSoMotCuaPhieuXuLyPhu===" + sql);
			QueryPos qPos = QueryPos.getInstance(q);
			
			return (List<MotCuaPhieuXuLyPhu>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<MotCuaPhieuXuLyPhu>();
	}
	
	public int countDanhSachHoSo(
		long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo,
		String tenDoanhNghiep)
		throws SystemException {
		
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			
			String sql =
				"SELECT count(*) as total FROM motcua_phieuxulyphu where phieuxulychinhid in(SELECT pxlc.id phieuxulychinhid from motcua_phieuxulychinh pxlc INNER JOIN tthc_hosothutuc hstt ON pxlc.hosothutucid = hstt.id ";
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				query.append(" AND hstt.thutuchanhchinhid = " + thuTucHanhChinhId);
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				query.append(" AND hstt.masohoso = " + maSoHoSo);
			}
			if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(dateFrom);
				query.append(" AND (hstt.ngayguihoso >= '" + ngayNopFrom + "' OR hstt.ngayguihoso IS NULL)");
			}
			if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(dateTo);
				query.append(" AND (hstt.ngayguihoso <= '" + ngayNopTo + "' OR hstt.ngayguihoso IS NULL)");
			}
			if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
				query.append(" AND hstt.tenchuhoso LIKE'%" + tenDoanhNghiep + "%')");
			}
			if (phanNhomHoSoId > 0) {
				query.append(" AND hstt.phannhomhosoid = " + phanNhomHoSoId);
			}
			if (organizationId > 0) {
				query.append(" AND hstt.tochucquanly = " + organizationId);
			}
			query.append(")");
			
			sql = sql + query.toString();
			_log.debug("=========countDanhSachHoSoMotCuaPhieuXuLyPhu===" + sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSo(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, String maSoHoSoOrDer, int year, String listIdResult, int start, int end) {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder("SELECT id FROM tthc_hosothutuc WHERE 1=1 ");
				int count = end-start;
				_log.debug("==nhomPhieuXuLy==" + nhomPhieuXuLy + "==organizationId==" + organizationId);
				_log.debug("==phanNhomHoSoId==" + phanNhomHoSoId + "==thuTucHanhChinhId==" + thuTucHanhChinhId);
				
				_log.debug("==maSoHoSo==" + maSoHoSo);
				_log.debug("==ngayNopFrom==" + ngayNopFrom + "==ngayNopTo==" + ngayNopTo);
				_log.debug("==tenDoanhNghiep==" + tenDoanhNghiep + "==start==" + start + "==end==" + end);
				
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					query.append(" AND thutuchanhchinhid = " + thuTucHanhChinhId);
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					query.append(" AND maSoHoSo = '" + maSoHoSo+"'");
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
					query.append(" AND tenchuhoso like ").append("'%" + tenDoanhNghiep.trim() + "%'");
//					query.append(" AND tenchuhoso like '%"+tenDoanhNghiep.trim()+"%'");
				}
				if (organizationId > 0) {
					query.append(" AND tochucquanly = "+organizationId);
				}
				if (year > 0) {
					query.append(" AND YEAR(ngayguihoso) = " + year);
				}
				
				String sql = "";
				if(Validator.isNotNull(listIdResult) && listIdResult.trim().length() > 0){
					sql = "SELECT {motcua_phieuxulyphu.*} FROM motcua_phieuxulyphu where phannhomhosoid = " + phanNhomHoSoId + " and nhomphieuxuly in (" + nhomPhieuXuLy +
							") and id not in (" + listIdResult +") and phieuxulychinhid in ( SELECT id FROM motcua_phieuxulychinh  where hosothutucid in (" + query.toString() + ")) ORDER BY ngaytaophieu ASC, id in (SELECT id FROM motcua_phieuxulyphu WHERE phieuxulychinhid in (SELECT id FROM tthc_hosothutuc where masohoso = '" + maSoHoSoOrDer.trim() + "')) DESC ";
				} else {
					sql = "SELECT {motcua_phieuxulyphu.*} FROM motcua_phieuxulyphu where phannhomhosoid = " + phanNhomHoSoId + " and nhomphieuxuly in (" + nhomPhieuXuLy +
							") and phieuxulychinhid in ( SELECT id FROM motcua_phieuxulychinh  where hosothutucid in (" + query.toString() + ")) ORDER BY ngaytaophieu ASC, id in (SELECT id FROM motcua_phieuxulyphu WHERE phieuxulychinhid in (SELECT id FROM tthc_hosothutuc where masohoso = '" + maSoHoSoOrDer.trim() + "')) DESC ";
				}
				if(start>=0){
					sql=sql+ " limit "+start+","+count;
				}	
				SQLQuery q = session.createSQLQuery(sql);
				q.setCacheable(false);
				q.addEntity(MotCuaPhieuXuLyPhuImpl.TABLE_NAME, MotCuaPhieuXuLyPhuImpl.class);
				
				_log.debug("=========findMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSo===" + sql);
				QueryPos qPos = QueryPos.getInstance(q);
				
				return (List<MotCuaPhieuXuLyPhu>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				
			} catch (Exception e) {
				_log.error(e);
			} finally {
				closeSession(session);
			}
			
			return new ArrayList<MotCuaPhieuXuLyPhu>();
		}


	public List<MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSoAndMaSoBiennhanAndDoiTuong(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId,  String doiTuong,String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, String maSoHoSoOrDer, int year, String listIdResult, int start, int end) {
			Session session = null;
			try {
				int count = end-start;
				session = openSession();
				StringBuilder query = new StringBuilder("SELECT id FROM tthc_hosothutuc WHERE 1=1 ");
				
				_log.debug("==nhomPhieuXuLy==" + nhomPhieuXuLy + "==organizationId==" + organizationId);
				_log.debug("==phanNhomHoSoId==" + phanNhomHoSoId + "==thuTucHanhChinhId==" + thuTucHanhChinhId);
				
				_log.debug("==maSoHoSo==" + maSoHoSo);
				_log.debug("==ngayNopFrom==" + ngayNopFrom + "==ngayNopTo==" + ngayNopTo);
				_log.debug("==tenDoanhNghiep==" + tenDoanhNghiep + "==start==" + start + "==end==" + end);
				
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					query.append(" AND thutuchanhchinhid = " + thuTucHanhChinhId);
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					query.append(" AND maSoHoSo = '" + maSoHoSo+"'");
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
					query.append(" AND tenchuhoso like ").append("'%" + tenDoanhNghiep.trim() + "%'");
//					query.append(" AND tenchuhoso like '%"+tenDoanhNghiep.trim()+"%'");
				}
				if (organizationId > 0) {
					query.append(" AND tochucquanly = "+organizationId);
				}
				if (year > 0) {
					query.append(" AND YEAR(ngayguihoso) = " + year);
				}
				
				String sql = "";
				if(Validator.isNotNull(listIdResult) && listIdResult.trim().length() > 0){
					sql = "SELECT {motcua_phieuxulyphu.*} FROM motcua_phieuxulyphu where phannhomhosoid = " + phanNhomHoSoId + " and nhomphieuxuly in (" + nhomPhieuXuLy +
							") and id not in (" + listIdResult +") and phieuxulychinhid in ( SELECT id FROM motcua_phieuxulychinh  where hosothutucid in (" + query.toString() + ")) ORDER BY ngaytaophieu ASC, id in (SELECT id FROM motcua_phieuxulyphu WHERE phieuxulychinhid in (SELECT id FROM tthc_hosothutuc where masohoso = '" + maSoHoSoOrDer.trim() + "')) DESC ";
				} else {
					sql = "SELECT {motcua_phieuxulyphu.*} FROM motcua_phieuxulyphu where phannhomhosoid = " + phanNhomHoSoId + " and nhomphieuxuly in (" + nhomPhieuXuLy +
							") and phieuxulychinhid in ( SELECT id FROM motcua_phieuxulychinh  where hosothutucid in (" + query.toString() + ")) ORDER BY ngaytaophieu ASC, id in (SELECT id FROM motcua_phieuxulyphu WHERE phieuxulychinhid in (SELECT id FROM tthc_hosothutuc where masohoso = '" + maSoHoSoOrDer.trim() + "')) DESC  ";
				}
				if(start>=0){
					sql=sql+ " limit "+start+","+count;
				}
				SQLQuery q = session.createSQLQuery(sql);
				q.setCacheable(false);
				q.addEntity(MotCuaPhieuXuLyPhuImpl.TABLE_NAME, MotCuaPhieuXuLyPhuImpl.class);
				
				_log.debug("=========findMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSo===" + sql);
				QueryPos qPos = QueryPos.getInstance(q);
				
				return (List<MotCuaPhieuXuLyPhu>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				
			} catch (Exception e) {
				_log.error(e);
			} finally {
				closeSession(session);
			}
			
			return new ArrayList<MotCuaPhieuXuLyPhu>();
		}


	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSoAndMaSoBiennhanAndDoiTuong(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String doiTuong,String maSoHoSo, String ngayNopFrom,String maSoBienNhan,
			String ngayNopTo, String tenDoanhNghiep, int year, String listIdResult) {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder("SELECT id FROM tthc_hosothutuc WHERE 1=1 ");
				
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					query.append(" AND thutuchanhchinhid = " + thuTucHanhChinhId);
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					query.append(" AND maSoHoSo = '" + maSoHoSo+"'");
				}
				if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
					Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
					ngayNopFrom = FormatData.parseDateToTring(dateFrom);
					query.append(" AND (ngayguihoso >= '" + ngayNopFrom + "' OR ngayguihoso IS NULL)");
				}
				if (Validator.isNotNull(maSoBienNhan) && maSoBienNhan.trim().length() > 0) {
					query.append(" AND mabiennhan = '" + maSoBienNhan+"' ");
				}
				if (Validator.isNotNull(doiTuong) && doiTuong.trim().length() > 0) {
					query.append(" AND tendonvitiepnhan = '" + doiTuong+"' ");
				}
				
				if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
					Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
					ngayNopTo = FormatData.parseDateToTring(dateTo);
					query.append(" AND (ngayguihoso <= '" + ngayNopTo + "' OR ngayguihoso IS NULL)");
				}
				if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
					query.append(" AND tenchuhoso like ").append("'%" + tenDoanhNghiep.trim() + "%'");
				}
				if (organizationId > 0) {
					query.append(" AND tochucquanly = "+organizationId);
				}
				if (year > 0) {
					query.append(" AND YEAR(ngayguihoso) = " + year);
				}
				
				String sql = "";
				if(Validator.isNotNull(listIdResult) && listIdResult.trim().length() > 0){
				sql = "SELECT count(*) as total FROM motcua_phieuxulyphu where phannhomhosoid = " + phanNhomHoSoId + " and nhomphieuxuly in (" + nhomPhieuXuLy +
						") and id not in (" + listIdResult +") and phieuxulychinhid in ( SELECT id FROM motcua_phieuxulychinh  where hosothutucid in (" + query.toString() + ") )";
				} else {
					sql = "SELECT count(*) as total FROM motcua_phieuxulyphu where phannhomhosoid = " + phanNhomHoSoId + " and nhomphieuxuly in (" + nhomPhieuXuLy +
							") and phieuxulychinhid in ( SELECT id FROM motcua_phieuxulychinh  where hosothutucid in (" + query.toString() + ") )";
				}
				
				SQLQuery q = session.createSQLQuery(sql);
				q.setCacheable(false);
				q.addScalar("total", Type.LONG);
				
				_log.debug("=========countMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSo===" + sql);
				
				QueryPos qPos = QueryPos.getInstance(q);
				
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

	
	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSo(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, int year, String listIdResult) {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder("SELECT id FROM tthc_hosothutuc WHERE 1=1 ");
				
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					query.append(" AND thutuchanhchinhid = " + thuTucHanhChinhId);
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					query.append(" AND maSoHoSo = '" + maSoHoSo+"'");
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
//					query.append(" AND tenchuhoso like '%"+tenDoanhNghiep.trim()+"%'");
					query.append(" AND tenchuhoso like ").append("'%" + tenDoanhNghiep.trim() + "%'");
				}
				if (organizationId > 0) {
					query.append(" AND tochucquanly = "+organizationId);
				}
				if (year > 0) {
					query.append(" AND YEAR(ngayguihoso) = " + year);
				}
				
				String sql = "";
				if(Validator.isNotNull(listIdResult) && listIdResult.trim().length() > 0){
				sql = "SELECT count(*) as total FROM motcua_phieuxulyphu where phannhomhosoid = " + phanNhomHoSoId + " and nhomphieuxuly in (" + nhomPhieuXuLy +
						") and id not in (" + listIdResult +") and phieuxulychinhid in ( SELECT id FROM motcua_phieuxulychinh  where hosothutucid in (" + query.toString() + ") )";
				} else {
					sql = "SELECT count(*) as total FROM motcua_phieuxulyphu where phannhomhosoid = " + phanNhomHoSoId + " and nhomphieuxuly in (" + nhomPhieuXuLy +
							") and phieuxulychinhid in ( SELECT id FROM motcua_phieuxulychinh  where hosothutucid in (" + query.toString() + ") )";
				}
				SQLQuery q = session.createSQLQuery(sql);
				q.setCacheable(false);
				q.addScalar("total", Type.LONG);
				
				_log.debug("=========countMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSo===" + sql);
				
				QueryPos qPos = QueryPos.getInstance(q);
				
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
	public List<MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndCorporationid(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, String corporationId, String soDKKT, int year, String listIdResult, long userId, int start, int end) {
			Session session = null;
			try {
				int count =end-start;
				session = openSession();
				StringBuilder query = new StringBuilder("SELECT id FROM tthc_hosothutuc WHERE 1=1 ");
				
				_log.info("==nhomPhieuXuLy==" + nhomPhieuXuLy + "==organizationId==" + organizationId);
				_log.info("==phanNhomHoSoId==" + phanNhomHoSoId + "==thuTucHanhChinhId==" + thuTucHanhChinhId);
				
				_log.info("==maSoHoSo==" + maSoHoSo + "===soDKKT==" + soDKKT + "===corporationId==="+corporationId);
				_log.info("==ngayNopFrom==" + ngayNopFrom + "==ngayNopTo==" + ngayNopTo);
				_log.info("==tenDoanhNghiep==" + tenDoanhNghiep + "==start==" + start + "==end==" + end);
				
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					query.append(" AND thutuchanhchinhid = " + thuTucHanhChinhId);
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					query.append(" AND maSoHoSo = '" + maSoHoSo+"'");
				}
				if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
					query.append(" AND tenchuhoso like ").append("'%" + tenDoanhNghiep.trim() + "%'");
				}
				if (Validator.isNotNull(soDKKT) && soDKKT.trim().length() > 0) {
					query.append(" AND mabiennhan like ").append("'%" + soDKKT.trim() + "%'");
				}
				if (organizationId > 0) {
					query.append(" AND tochucquanly = "+organizationId);
				}
				if (year > 0) {
					query.append(" AND YEAR(ngayguihoso) = " + year);
				}
				
				StringBuilder querySQL = new StringBuilder("SELECT {mc.*} FROM motcua_phieuxulyphu mc, dkvn_nghiepvu.vr_confirmedinspection vr where vr.phieuxulyphuid = mc.id ");
				if (phanNhomHoSoId > 0) {
					querySQL.append(" AND mc.phannhomhosoid = " + phanNhomHoSoId);
				}
				if(Validator.isNotNull(nhomPhieuXuLy) && nhomPhieuXuLy.trim().length() >0){
					querySQL.append(" AND mc.nhomphieuxuly in (" + nhomPhieuXuLy +")");
				}
				if(Validator.isNotNull(listIdResult) && listIdResult.trim().length() > 0){
					querySQL.append(" AND mc.id not in (" + listIdResult +")");
				}
				if(Validator.isNotNull(corporationId) && corporationId.trim().length() >0){
					//xoa bo dau "," o cuoi
					corporationId = corporationId.substring(0, corporationId.length()-1);
					querySQL.append(" AND vr.corporationid in (" + corporationId +")");
				} else {
					querySQL.append(" AND vr.corporationid in (select corporationid from dkvn_nghiepvu.vr_corporation_view where isleader =1 and inspectorid= "+userId+" )");
				}
				if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
					Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
					ngayNopFrom = FormatData.parseDateToTring(dateFrom);
					querySQL.append(" AND (vr.inspectiondate >= '" + ngayNopFrom + "' OR vr.inspectiondate IS NULL)");
				}
				if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
					Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
					ngayNopTo = FormatData.parseDateToTring(dateTo);
					querySQL.append(" AND (vr.inspectiondate <= '" + ngayNopTo + "' OR vr.inspectiondate IS NULL)");
				}
				
				querySQL.append(" AND mc.phieuxulychinhid in ( " + query.toString() + ") ORDER BY mc.ngaytaophieu ASC");
				String sql =querySQL.toString();
				if(start>=0){
					sql=sql+ " limit "+start+","+count;
				}
				SQLQuery q = session.createSQLQuery(sql);
				q.setCacheable(false);
				q.addEntity("mc", MotCuaPhieuXuLyPhuImpl.class);
				
				_log.info("=========findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndCorporationid===" + querySQL.toString());
				QueryPos qPos = QueryPos.getInstance(q);
				
				return (List<MotCuaPhieuXuLyPhu>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				
			} catch (Exception e) {
				_log.error(e);
			} finally {
				closeSession(session);
			}
			
			return new ArrayList<MotCuaPhieuXuLyPhu>();
		}
	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndCorporationid(String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId,
			String maSoHoSo, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, String corporationId, String soDKKT, int year, String listIdResult, long userId) {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder("SELECT id FROM tthc_hosothutuc WHERE 1=1 ");
				
				_log.debug("==nhomPhieuXuLy==" + nhomPhieuXuLy + "==organizationId==" + organizationId);
				_log.debug("==phanNhomHoSoId==" + phanNhomHoSoId + "==thuTucHanhChinhId==" + thuTucHanhChinhId);
				
				_log.debug("==maSoHoSo==" + maSoHoSo + "==tenDoanhNghiep==" + tenDoanhNghiep);
				_log.debug("==ngayNopFrom==" + ngayNopFrom + "==ngayNopTo==" + ngayNopTo);
				
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					query.append(" AND thutuchanhchinhid = " + thuTucHanhChinhId);
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					query.append(" AND maSoHoSo = '" + maSoHoSo+"'");
				}
				if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
					query.append(" AND tenchuhoso like ").append("'%" + tenDoanhNghiep.trim() + "%'");
				}
				if (Validator.isNotNull(soDKKT) && soDKKT.trim().length() > 0) {
					query.append(" AND mabiennhan like ").append("'%" + soDKKT.trim() + "%'");
				}
				if (organizationId > 0) {
					query.append(" AND tochucquanly = "+organizationId);
				}
				if (year > 0) {
					query.append(" AND YEAR(ngayguihoso) = " + year);
				}
				
				StringBuilder querySQL = new StringBuilder("SELECT count(*) as total FROM motcua_phieuxulyphu mc, dkvn_nghiepvu.vr_confirmedinspection vr where vr.phieuxulyphuid = mc.id ");
				if (phanNhomHoSoId > 0) {
					querySQL.append(" AND mc.phannhomhosoid = " + phanNhomHoSoId);
				}
				if(Validator.isNotNull(nhomPhieuXuLy) && nhomPhieuXuLy.trim().length() >0){
					querySQL.append(" AND mc.nhomphieuxuly in (" + nhomPhieuXuLy +")");
				}
				if(Validator.isNotNull(listIdResult) && listIdResult.trim().length() > 0){
					querySQL.append(" AND mc.id not in (" + listIdResult +")");
				}
				if(Validator.isNotNull(corporationId) && corporationId.trim().length() >0){
					//xoa bo dau "," o cuoi
					corporationId = corporationId.substring(0, corporationId.length()-1);
					querySQL.append(" AND vr.corporationid in (" + corporationId +")");
				} else {
					querySQL.append(" AND vr.corporationid in (select corporationid from dkvn_nghiepvu.vr_corporation_view where isleader =1 and inspectorid= "+userId+" )");
				}
				if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
					Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
					ngayNopFrom = FormatData.parseDateToTring(dateFrom);
					querySQL.append(" AND (vr.inspectiondate >= '" + ngayNopFrom + "' OR vr.inspectiondate IS NULL)");
				}
				if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
					Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
					ngayNopTo = FormatData.parseDateToTring(dateTo);
					querySQL.append(" AND (vr.inspectiondate <= '" + ngayNopTo + "' OR vr.inspectiondate IS NULL)");
				}
				
				querySQL.append(" AND mc.phieuxulychinhid in ( SELECT id FROM motcua_phieuxulychinh  where hosothutucid in (" + query.toString() + ")) ORDER BY mc.ngaytaophieu ASC");
				
				SQLQuery q = session.createSQLQuery(querySQL.toString());
				q.setCacheable(false);
				q.addScalar("total", Type.LONG);
				
				_log.debug("=========countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndCorporationid===" + querySQL.toString());
				
				QueryPos qPos = QueryPos.getInstance(q);
				
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
	public List<MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucId(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo,
			String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int year, int start, int end) {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder("SELECT id FROM tthc_hosothutuc WHERE 1=1 ");
				
				_log.debug("==nhomPhieuXuLy==" + nhomPhieuXuLy + "==organizationId==" + organizationId);
				_log.debug("==phanNhomHoSoId==" + phanNhomHoSoId + "==thuTucHanhChinhId==" + thuTucHanhChinhId);
				
				_log.debug("==maSoHoSo==" + maSoHoSo);
				_log.debug("==ngayNopFrom==" + ngayNopFrom + "==ngayNopTo==" + ngayNopTo);
				_log.debug("==tenDoanhNghiep==" + tenDoanhNghiep + "==start==" + start + "==end==" + end);
				
				
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					query.append(" AND thutuchanhchinhid = ?");
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					query.append(" AND maSoHoSo = ?");
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
					query.append(" AND tenchuhoso like ").append("'%" + tenDoanhNghiep.trim() + "%'");
				}
				if (organizationId > 0) {
					query.append(" AND tochucquanly = ?");
				}
				if (year > 0) {
					query.append(" AND YEAR(ngayguihoso) = ? ");
				}
				
				_log.debug("==findMotCuaPhieuXuLyPhuByHoSoThuTucI==query=tthc_hosothutuc==" + query.toString());
				
				
				String sql =
					"SELECT {motcua_phieuxulyphu.*} FROM motcua_phieuxulyphu where phannhomhosoid = ? and nhomphieuxuly in (" + nhomPhieuXuLy +
						") and phieuxulychinhid in (" + query.toString() + ") order by ngaytaophieu asc";
				int count = end-start;
				if(start>=0){
					sql=sql+ " limit "+start+","+count;
				}
				SQLQuery q = session.createSQLQuery(sql);
				q.setCacheable(false);
				q.addEntity(MotCuaPhieuXuLyPhuImpl.TABLE_NAME, MotCuaPhieuXuLyPhuImpl.class);
				
				_log.debug("==findMotCuaPhieuXuLyPhuByHoSoThuTucId==" + sql);
				QueryPos qPos = QueryPos.getInstance(q);
				
				if (phanNhomHoSoId > 0) {
					qPos.add(phanNhomHoSoId);
				}
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					qPos.add(thuTucHanhChinhId.trim());
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					qPos.add(maSoHoSo);
				}
				if (organizationId > 0) {
					qPos.add(organizationId);
				}
				if (year > 0) {
					qPos.add(year);
				}
				
				return (List<MotCuaPhieuXuLyPhu>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				
			} catch (Exception e) {
				_log.error(e);
			} finally {
				closeSession(session);
			}
			
			return new ArrayList<MotCuaPhieuXuLyPhu>();
		}

	public List<MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanLich( String doiTuong,String maSoBienNhan,long userid,
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo,
			String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int year, int start, int end) {
			Session session = null;
			try {
				boolean check = true;
				//if(doiTuong==null)
				int count = end-start;
				session = openSession();
				StringBuilder query = new StringBuilder("SELECT id FROM tthc_hosothutuc WHERE 1=1 ");
				
				_log.debug("==nhomPhieuXuLy==" + nhomPhieuXuLy + "==organizationId==" + organizationId);
				_log.debug("==phanNhomHoSoId==" + phanNhomHoSoId + "==thuTucHanhChinhId==" + thuTucHanhChinhId);
				
				_log.debug("==maSoHoSo==" + maSoHoSo);
				_log.debug("==ngayNopFrom==" + ngayNopFrom + "==ngayNopTo==" + ngayNopTo);
				_log.debug("==tenDoanhNghiep==" + tenDoanhNghiep + "==start==" + start + "==end==" + end);
				
				
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					query.append(" AND thutuchanhchinhid = ?");
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					query.append(" AND maSoHoSo = ?");
				}
				if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
					Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
					ngayNopFrom = FormatData.parseDateToTring(dateFrom);
					query.append(" AND (ngayguihoso >= '" + ngayNopFrom + "' OR ngayguihoso IS NULL)");
				}
				if (Validator.isNotNull(maSoBienNhan) && maSoBienNhan.trim().length() > 0) {
					query.append(" AND mabiennhan = '" + maSoBienNhan+"' ");
				}
				if (Validator.isNotNull(doiTuong) && doiTuong.trim().length() > 0) {
					query.append(" AND tendonvitiepnhan = '" + doiTuong+"' ");
				}

				if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
					Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
					ngayNopTo = FormatData.parseDateToTring(dateTo);
					query.append(" AND (ngayguihoso <= '" + ngayNopTo + "' OR ngayguihoso IS NULL)");
				}
				if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
					query.append(" AND tenchuhoso like ").append("'%" + tenDoanhNghiep.trim() + "%'");
				}
				if (organizationId > 0) {
					query.append(" AND tochucquanly = ?");
				}
				if (year > 0) {
					query.append(" AND YEAR(ngayguihoso) = ? ");
				}
				
				_log.debug("==findMotCuaPhieuXuLyPhuByHoSoThuTucI==query=tthc_hosothutuc==" + query.toString());
				
				
				String sql =
					"SELECT distinct {motcua_phieuxulyphu.*} FROM motcua_phieuxulyphu,dkvn_nghiepvu.vr_confirmedinspection as vr_confirmedinspection,dkvn_nghiepvu.vr_corporation_view " +
					"  where motcua_phieuxulyphu.phannhomhosoid = ? ";
				
				sql=sql+" and motcua_phieuxulyphu.id = vr_confirmedinspection.phieuxulyphuid ";
				sql=sql+"   and vr_confirmedinspection.corporationid = vr_corporation_view.corporationid ";
				sql=sql+"   and vr_corporation_view.inspectorid= "+userid;	
				sql=sql+" and motcua_phieuxulyphu.nhomphieuxuly in (" + nhomPhieuXuLy +
						") and motcua_phieuxulyphu.phieuxulychinhid in (" + query.toString() + ") ";				
				sql=sql+ "  order by ngaytaophieu asc";
				if(start>=0){
					sql=sql+ " limit "+start+","+count;
				}
				SQLQuery q = session.createSQLQuery(sql);
				q.setCacheable(false);
				q.addEntity(MotCuaPhieuXuLyPhuImpl.TABLE_NAME, MotCuaPhieuXuLyPhuImpl.class);
			
				_log.debug("==findMotCuaPhieuXuLyPhuByHoSoThuTucId==" + sql);
				QueryPos qPos = QueryPos.getInstance(q);
				
				if (phanNhomHoSoId > 0) {
					qPos.add(phanNhomHoSoId);
				}
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					qPos.add(thuTucHanhChinhId.trim());
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					qPos.add(maSoHoSo);
				}
				if (organizationId > 0) {
					qPos.add(organizationId);
				}
				if (year > 0) {
					qPos.add(year);
				}
				
				//return (List<MotCuaPhieuXuLyPhu>) QueryUtil.list(q, getDialect(), start, end);
				return (List<MotCuaPhieuXuLyPhu>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				
			} catch (Exception e) {
				_log.error(e);
			} finally {
				closeSession(session);
			}
			
			return new ArrayList<MotCuaPhieuXuLyPhu>();
		}

	

	public List<MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra( String doiTuong,String maSoBienNhan,long userid,
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo,
			String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int year, int start, int end) {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder("SELECT id FROM tthc_hosothutuc WHERE 1=1 ");
				
//				_log.info("==nhomPhieuXuLy==" + nhomPhieuXuLy + "==organizationId==" + organizationId);
//				_log.info("==phanNhomHoSoId==" + phanNhomHoSoId + "==thuTucHanhChinhId==" + thuTucHanhChinhId);
//				
//				_log.info("==maSoHoSo==" + maSoHoSo);
//				_log.info("==ngayNopFrom==" + ngayNopFrom + "==ngayNopTo==" + ngayNopTo);
//				_log.info("==tenDoanhNghiep==" + tenDoanhNghiep + "==start==" + start + "==end==" + end);
				
				
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					query.append(" AND thutuchanhchinhid = ?");
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					query.append(" AND maSoHoSo = ?");
				}
				if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
					Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
					ngayNopFrom = FormatData.parseDateToTring(dateFrom);
					query.append(" AND (ngayguihoso >= '" + ngayNopFrom + "' OR ngayguihoso IS NULL)");
				}
				if (Validator.isNotNull(maSoBienNhan) && maSoBienNhan.trim().length() > 0) {
					query.append(" AND mabiennhan = '" + maSoBienNhan+"' ");
				}
				if (Validator.isNotNull(doiTuong) && doiTuong.trim().length() > 0) {
					query.append(" AND tendonvitiepnhan = '" + doiTuong+"' ");
				}

				if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
					Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
					ngayNopTo = FormatData.parseDateToTring(dateTo);
					query.append(" AND (ngayguihoso <= '" + ngayNopTo + "' OR ngayguihoso IS NULL)");
				}
				if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
					query.append(" AND tenchuhoso like ").append("'%" + tenDoanhNghiep.trim() + "%'");
				}
				if (organizationId > 0) {
					query.append(" AND tochucquanly = ?");
				}
				if (year > 0) {
					query.append(" AND YEAR(ngayguihoso) = ? ");
				}
				
				_log.debug("==findMotCuaPhieuXuLyPhuByHoSoThuTucI==query=tthc_hosothutuc==" + query.toString());
				
				String sql =
						"SELECT distinct {motcua_phieuxulyphu.*}  FROM motcua_phieuxulyphu,dkvn_nghiepvu.vr_inspectionrecord as vr_inspectionrecord,dkvn_nghiepvu.vr_corporation_view " +
						"  where motcua_phieuxulyphu.phannhomhosoid = ? ";
					
					sql=sql+" and motcua_phieuxulyphu.id = vr_inspectionrecord.phieuxulyphuid ";
					sql=sql+"   and vr_corporation_view.inspectorid= "+userid;	
					sql=sql+"   and vr_inspectionrecord.inspectorid = vr_inspectionrecord.inspectorid ";
					
					sql=sql+" and motcua_phieuxulyphu.nhomphieuxuly in (" + nhomPhieuXuLy +
							") and motcua_phieuxulyphu.phieuxulychinhid in (" + query.toString() + ") ";
				sql=sql+ "  order by ngaytaophieu asc";
				int count = end-start;
				if(start>=0){
					sql=sql+ " limit "+start+","+count;
				}
				//System.out.print(" sql   "+sql);
				SQLQuery q = session.createSQLQuery(sql);
				q.setCacheable(false);
				q.addEntity(MotCuaPhieuXuLyPhuImpl.TABLE_NAME, MotCuaPhieuXuLyPhuImpl.class);
				
				_log.debug("==findMotCuaPhieuXuLyPhuByHoSoThuTucId==" + sql);
				QueryPos qPos = QueryPos.getInstance(q);
				
				if (phanNhomHoSoId > 0) {
					qPos.add(phanNhomHoSoId);
				}
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					qPos.add(thuTucHanhChinhId.trim());
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					qPos.add(maSoHoSo);
				}
				if (organizationId > 0) {
					qPos.add(organizationId);
				}
				if (year > 0) {
					qPos.add(year);
				}
				
				return (List<MotCuaPhieuXuLyPhu>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				
			} catch (Exception e) {
				_log.error(e);
			} finally {
				closeSession(session);
			}
			
			return new ArrayList<MotCuaPhieuXuLyPhu>();
		}

	public List<MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan( String doiTuong,String maSoBienNhan,
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo,
			String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int year, int start, int end) {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder("SELECT id FROM tthc_hosothutuc WHERE 1=1 ");
				
				_log.debug("==nhomPhieuXuLy==" + nhomPhieuXuLy + "==organizationId==" + organizationId);
				_log.debug("==phanNhomHoSoId==" + phanNhomHoSoId + "==thuTucHanhChinhId==" + thuTucHanhChinhId);
				
				_log.debug("==maSoHoSo==" + maSoHoSo);
				_log.debug("==ngayNopFrom==" + ngayNopFrom + "==ngayNopTo==" + ngayNopTo);
				_log.debug("==tenDoanhNghiep==" + tenDoanhNghiep + "==start==" + start + "==end==" + end);
				
				
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					query.append(" AND thutuchanhchinhid = ?");
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					query.append(" AND maSoHoSo = ?");
				}
				if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
					Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
					ngayNopFrom = FormatData.parseDateToTring(dateFrom);
					query.append(" AND (ngayguihoso >= '" + ngayNopFrom + "' OR ngayguihoso IS NULL)");
				}
				if (Validator.isNotNull(maSoBienNhan) && maSoBienNhan.trim().length() > 0) {
					query.append(" AND mabiennhan = '" + maSoBienNhan+"' ");
				}
				if (Validator.isNotNull(doiTuong) && doiTuong.trim().length() > 0) {
					query.append(" AND tendonvitiepnhan = '" + doiTuong+"' ");
				}

				if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
					Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
					ngayNopTo = FormatData.parseDateToTring(dateTo);
					query.append(" AND (ngayguihoso <= '" + ngayNopTo + "' OR ngayguihoso IS NULL)");
				}
				if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
					query.append(" AND tenchuhoso like ").append("'%" + tenDoanhNghiep.trim() + "%'");
				}
				if (organizationId > 0) {
					query.append(" AND tochucquanly = ?");
				}
				if (year > 0) {
					query.append(" AND YEAR(ngayguihoso) = ? ");
				}
				
				_log.debug("==findMotCuaPhieuXuLyPhuByHoSoThuTucI==query=tthc_hosothutuc==" + query.toString());
				String sql = "";
				
				if ((phanNhomHoSoId == 15) || (phanNhomHoSoId == 22) || (phanNhomHoSoId == 57) || (phanNhomHoSoId == 50) || (phanNhomHoSoId == 60))
				{
				sql =
					"SELECT {motcua_phieuxulyphu.*} FROM motcua_phieuxulyphu where phannhomhosoid = ? and nhomphieuxuly in (" + nhomPhieuXuLy +
						") and phieuxulychinhid in (" + query.toString() + ") order by ngaytaophieu desc";				
				}
				else
				{
					sql =
							"SELECT {motcua_phieuxulyphu.*} FROM motcua_phieuxulyphu where phannhomhosoid = ? and nhomphieuxuly in (" + nhomPhieuXuLy +
								") and phieuxulychinhid in (" + query.toString() + ") order by ngaytaophieu asc";					
					
				}
				
				
				int count = end-start;
				if(start>=0){
					sql=sql+ " limit "+start+","+count;
				}
				SQLQuery q = session.createSQLQuery(sql);
				q.setCacheable(false);
				q.addEntity(MotCuaPhieuXuLyPhuImpl.TABLE_NAME, MotCuaPhieuXuLyPhuImpl.class);
				
				_log.debug("==findMotCuaPhieuXuLyPhuByHoSoThuTucId==" + sql);
				QueryPos qPos = QueryPos.getInstance(q);
				
				if (phanNhomHoSoId > 0) {
					qPos.add(phanNhomHoSoId);
				}
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					qPos.add(thuTucHanhChinhId.trim());
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					qPos.add(maSoHoSo);
				}
				if (organizationId > 0) {
					qPos.add(organizationId);
				}
				if (year > 0) {
					qPos.add(year);
				}
				
				return (List<MotCuaPhieuXuLyPhu>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				
			} catch (Exception e) {
				_log.error(e);
			} finally {
				closeSession(session);
			}
			
			return new ArrayList<MotCuaPhieuXuLyPhu>();
		}
	

	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanLich( String doiTuong,String maSoBienNhan,long userid,
		String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
		String ngayNopTo, String tenDoanhNghiep, int year) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT id FROM tthc_hosothutuc WHERE 1=1 ");
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				query.append(" AND thutuchanhchinhid = ?");
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				query.append(" AND maSoHoSo = ?");
			}
			if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(dateFrom);
				query.append(" AND (ngayguihoso >= '" + ngayNopFrom + "' OR ngayguihoso IS NULL)");
			}
			if (Validator.isNotNull(maSoBienNhan) && maSoBienNhan.trim().length() > 0) {
				query.append(" AND mabiennhan = '" + maSoBienNhan+"' ");
			}
			if (Validator.isNotNull(doiTuong) && doiTuong.trim().length() > 0) {
				query.append(" AND tendonvitiepnhan = '" + doiTuong+"' ");
			}
			
			if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(dateTo);
				query.append(" AND (ngayguihoso <= '" + ngayNopTo + "' OR ngayguihoso IS NULL)");
			}
			if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
				query.append(" AND tenchuhoso like ").append("'%" + tenDoanhNghiep.trim() + "%'");
			}
			if (organizationId > 0) {
				query.append(" AND tochucquanly = ?");
			}
			if (year > 0) {
				query.append(" AND YEAR(ngayguihoso) = ? ");
			}
			
			_log.debug("==findMotCuaPhieuXuLyPhuByHoSoThuTucI==query=tthc_hosothutuc==" + query.toString());
			
//			String sql =
//				"SELECT count(*) as total FROM motcua_phieuxulyphu where phannhomhosoid = ? and nhomphieuxuly in (" + nhomPhieuXuLy +
//					") and phieuxulychinhid in (" + query.toString() + ")";
//			
			String sql =
					"SELECT count(distinct motcua_phieuxulyphu.id) as total FROM motcua_phieuxulyphu,dkvn_nghiepvu.vr_confirmedinspection as vr_confirmedinspection,dkvn_nghiepvu.vr_corporation_view " +
					"  where motcua_phieuxulyphu.phannhomhosoid = ? ";
				
				sql=sql+" and motcua_phieuxulyphu.id = vr_confirmedinspection.phieuxulyphuid ";
				sql=sql+"   and vr_confirmedinspection.corporationid = vr_corporation_view.corporationid ";
				sql=sql+"   and vr_corporation_view.inspectorid= "+userid;	
				sql=sql+" and motcua_phieuxulyphu.nhomphieuxuly in (" + nhomPhieuXuLy +
						") and motcua_phieuxulyphu.phieuxulychinhid in (" + query.toString() + ") ";
				//sql=sql+ "  order by ngaytaophieu desc";
				
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);
			
			_log.debug("=========countMotCuaPhieuXuLyPhuByHoSoThuTucId===" + sql);
			QueryPos qPos = QueryPos.getInstance(q);
			if (phanNhomHoSoId > 0) {
				qPos.add(phanNhomHoSoId);
			}
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				qPos.add(thuTucHanhChinhId.trim());
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				qPos.add(maSoHoSo);
			}
			if (organizationId > 0) {
				qPos.add(organizationId);
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


	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra( String doiTuong,String maSoBienNhan,long userid,
		String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
		String ngayNopTo, String tenDoanhNghiep, int year) {
		Session session = null;
		try {
			
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT id FROM tthc_hosothutuc WHERE 1=1 ");
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				query.append(" AND thutuchanhchinhid = ?");
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				query.append(" AND maSoHoSo = ?");
			}
			if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(dateFrom);
				query.append(" AND (ngayguihoso >= '" + ngayNopFrom + "' OR ngayguihoso IS NULL)");
			}
			if (Validator.isNotNull(maSoBienNhan) && maSoBienNhan.trim().length() > 0) {
				query.append(" AND mabiennhan = '" + maSoBienNhan+"' ");
			}
			if (Validator.isNotNull(doiTuong) && doiTuong.trim().length() > 0) {
				query.append(" AND tendonvitiepnhan = '" + doiTuong+"' ");
			}
			
			if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(dateTo);
				query.append(" AND (ngayguihoso <= '" + ngayNopTo + "' OR ngayguihoso IS NULL)");
			}
			if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
				query.append(" AND tenchuhoso like ").append("'%" + tenDoanhNghiep.trim() + "%'");
			}
			if (organizationId > 0) {
				query.append(" AND tochucquanly = ?");
			}
			if (year > 0) {
				query.append(" AND YEAR(ngayguihoso) = ? ");
			}
			
			_log.debug("==findMotCuaPhieuXuLyPhuByHoSoThuTucI==query=tthc_hosothutuc==" + query.toString());
			
//			String sql =
//				"SELECT count(*) as total FROM motcua_phieuxulyphu where phannhomhosoid = ? and nhomphieuxuly in (" + nhomPhieuXuLy +
//					") and phieuxulychinhid in (" + query.toString() + ")";
//			
			String sql =
					"SELECT count( distinct motcua_phieuxulyphu.id) as total FROM motcua_phieuxulyphu,dkvn_nghiepvu.vr_inspectionrecord as vr_inspectionrecord,dkvn_nghiepvu.vr_corporation_view " +
					"  where motcua_phieuxulyphu.phannhomhosoid = ? ";
				
				sql=sql+" and motcua_phieuxulyphu.id = vr_inspectionrecord.phieuxulyphuid ";
				sql=sql+"   and vr_corporation_view.inspectorid= "+userid;	
				sql=sql+"   and vr_inspectionrecord.inspectorid = vr_inspectionrecord.inspectorid ";
				
				sql=sql+" and motcua_phieuxulyphu.nhomphieuxuly in (" + nhomPhieuXuLy +
						") and motcua_phieuxulyphu.phieuxulychinhid in (" + query.toString() + ") ";
				//sql=sql+ "  order by ngaytaophieu desc";
//				System.out.print(" sql   "+sql);

//				_log.info("==nhomPhieuXuLy==" + nhomPhieuXuLy + "==organizationId==" + organizationId);
//				_log.info("==phanNhomHoSoId==" + phanNhomHoSoId + "==thuTucHanhChinhId==" + thuTucHanhChinhId);
//				
//				_log.info("==maSoHoSo==" + maSoHoSo);
//				_log.info("==ngayNopFrom==" + ngayNopFrom + "==ngayNopTo==" + ngayNopTo+" userid  "+userid);
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);
			
			_log.debug("=========countMotCuaPhieuXuLyPhuByHoSoThuTucId===" + sql);
			QueryPos qPos = QueryPos.getInstance(q);
			if (phanNhomHoSoId > 0) {
				qPos.add(phanNhomHoSoId);
			}
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				qPos.add(thuTucHanhChinhId.trim());
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				qPos.add(maSoHoSo);
			}
			if (organizationId > 0) {
				qPos.add(organizationId);
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



	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan( String doiTuong,String maSoBienNhan,
		String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
		String ngayNopTo, String tenDoanhNghiep, int year) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT id FROM tthc_hosothutuc WHERE 1=1 ");
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				query.append(" AND thutuchanhchinhid = ?");
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				query.append(" AND maSoHoSo = ?");
			}
			if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(dateFrom);
				query.append(" AND (ngayguihoso >= '" + ngayNopFrom + "' OR ngayguihoso IS NULL)");
			}
			if (Validator.isNotNull(maSoBienNhan) && maSoBienNhan.trim().length() > 0) {
				query.append(" AND mabiennhan = '" + maSoBienNhan+"' ");
			}
			if (Validator.isNotNull(doiTuong) && doiTuong.trim().length() > 0) {
				query.append(" AND tendonvitiepnhan = '" + doiTuong+"' ");
			}
			
			if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(dateTo);
				query.append(" AND (ngayguihoso <= '" + ngayNopTo + "' OR ngayguihoso IS NULL)");
			}
			if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
				query.append(" AND tenchuhoso like ").append("'%" + tenDoanhNghiep.trim() + "%'");
			}
			if (organizationId > 0) {
				query.append(" AND tochucquanly = ?");
			}
			if (year > 0) {
				query.append(" AND YEAR(ngayguihoso) = ? ");
			}
			
			_log.debug("==findMotCuaPhieuXuLyPhuByHoSoThuTucI==query=tthc_hosothutuc==" + query.toString());
			
			String sql =
				"SELECT count(*) as total FROM motcua_phieuxulyphu where phannhomhosoid = ? and nhomphieuxuly in (" + nhomPhieuXuLy +
					") and phieuxulychinhid in (" + query.toString() + ")";
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);
			
			_log.debug("=========countMotCuaPhieuXuLyPhuByHoSoThuTucId===" + sql);
			QueryPos qPos = QueryPos.getInstance(q);
			if (phanNhomHoSoId > 0) {
				qPos.add(phanNhomHoSoId);
			}
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				qPos.add(thuTucHanhChinhId.trim());
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				qPos.add(maSoHoSo);
			}
			if (organizationId > 0) {
				qPos.add(organizationId);
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

	public int countMotCuaPhieuXuLyPhuByHoSoThuTucId(
		String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
		String ngayNopTo, String tenDoanhNghiep, int year) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT id FROM tthc_hosothutuc WHERE 1=1 ");
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				query.append(" AND thutuchanhchinhid = ?");
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				query.append(" AND maSoHoSo = ?");
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
				query.append(" AND tenchuhoso like ").append("'%" + tenDoanhNghiep.trim() + "%'");
			}
			if (organizationId > 0) {
				query.append(" AND tochucquanly = ?");
			}
			if (year > 0) {
				query.append(" AND YEAR(ngayguihoso) = ? ");
			}
			
			_log.debug("==findMotCuaPhieuXuLyPhuByHoSoThuTucI==query=tthc_hosothutuc==" + query.toString());
			
			String sql =
				"SELECT count(*) as total FROM motcua_phieuxulyphu where phannhomhosoid = ? and nhomphieuxuly in (" + nhomPhieuXuLy +
					") and phieuxulychinhid in (" + query.toString() + ")";
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);
			
			_log.debug("=========countMotCuaPhieuXuLyPhuByHoSoThuTucId===" + sql);
			QueryPos qPos = QueryPos.getInstance(q);
			if (phanNhomHoSoId > 0) {
				qPos.add(phanNhomHoSoId);
			}
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				qPos.add(thuTucHanhChinhId.trim());
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				qPos.add(maSoHoSo);
			}
			if (organizationId > 0) {
				qPos.add(organizationId);
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
	
	public int getHoSoThuTucIdByPhieuXuLyPhuId(long phieuXuLyPhuId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT hosothutucid as total FROM motcua_phieuxulychinh pxlc WHERE ");
			query.append("pxlc.id in (SELECT phieuxulychinhid FROM motcua_phieuxulyphu pxlp WHERE pxlp.id = '" + phieuXuLyPhuId+"')");
			
			String sql = query.toString();
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);
			
			_log.debug("====phieuXuLyPhuId=====" + phieuXuLyPhuId + "=====getHoSoThuTucIdByPhieuXuLyPhuId===" + sql);
			QueryPos qPos = QueryPos.getInstance(q);
			
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
	
	public List<MotCuaPhieuXuLyPhu> searchPhanCongDonViKiemTraByHoSoThuTucId(
		String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
		String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			//tthc_hosothutuc.id  quan he 1 - 1 voi phieuxulychinhid.id
			StringBuilder queryHosothuctuc = new StringBuilder("SELECT id FROM tthc_hosothutuc WHERE 1=1 ");
			
			_log.debug("==nhomPhieuXuLy==" + nhomPhieuXuLy + "==organizationId==" + organizationId);
			_log.debug("==phanNhomHoSoId==" + phanNhomHoSoId + "==thuTucHanhChinhId==" + thuTucHanhChinhId);
			
			_log.debug("==maSoHoSo==" + maSoHoSo + "==ngayNopFrom==" + ngayNopFrom + "==ngayNopTo==" + ngayNopTo);
			_log.debug("==year==" + year + "==quanHuyen==" + quanHuyen + "==tinhThanh==" + tinhThanh + "==quocGia==" + quocGia);
			_log.debug("==start==" + start + "==end==" + end);
			
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				queryHosothuctuc.append(" AND thutuchanhchinhid = ?");
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				queryHosothuctuc.append(" AND maSoHoSo = ?");
			}
			if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(dateFrom);
				queryHosothuctuc.append(" AND (ngayguihoso >= '" + ngayNopFrom + "' OR ngayguihoso IS NULL)");
			}
			
			if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(dateTo);
				queryHosothuctuc.append(" AND (ngayguihoso <= '" + ngayNopTo + "' OR ngayguihoso IS NULL)");
			}
			
			if (organizationId > 0) {
				queryHosothuctuc.append(" AND tochucquanly = ?");
			}
			if (year > 0) {
				queryHosothuctuc.append(" AND YEAR(ngayguihoso) = ? ");
			}
			
			
			
			
			StringBuilder queryDmDataItem = new StringBuilder();
			queryDmDataItem.append("SELECT code_0 FROM dkvn_thutuchanhchinh.dm_dataitem WHERE ");
			
			if (Validator.isNotNull(tinhThanh) && tinhThanh.trim().length() > 0) {
				queryDmDataItem.append(" code_0 = '" + tinhThanh + "' AND ");
			}
			
			queryDmDataItem.append(" level = '1' AND datagroupid in (SELECT code FROM dkvn_thutuchanhchinh.dm_datagroup where name = '" + DanhMucKey.ADMINISTRATIVE_UNITS + "')");
			_log.debug("==countPhanCongDonViKiemTraByHoSoThuTucId==queryDmDataItem==" + queryDmDataItem.toString());
			
			
			
			StringBuilder queryConfirmedInspection = new StringBuilder();
			queryConfirmedInspection.append("SELECT phieuxulyphuid FROM dkvn_nghiepvu.vr_confirmedinspection WHERE ");
			queryConfirmedInspection.append("inspectionprovincecode in (" + queryDmDataItem.toString() +")");
			_log.debug("==countPhanCongDonViKiemTraByHoSoThuTucId==queryConfirmedInspection==" + queryConfirmedInspection.toString());
			
			
			
			StringBuilder queryPhieuXyLyPhu = new StringBuilder();
			queryPhieuXyLyPhu.append("SELECT {motcua_phieuxulyphu.*} FROM motcua_phieuxulyphu where ");
			queryPhieuXyLyPhu.append("phannhomhosoid = ? and ");
			
			if (queryConfirmedInspection.length() > 0) {
				queryPhieuXyLyPhu.append("id in (" + queryConfirmedInspection.toString() + ") and ");
			}
			
			queryPhieuXyLyPhu.append("nhomphieuxuly in (" + nhomPhieuXuLy + ") and phieuxulychinhid in (" + queryHosothuctuc.toString() + ") order by ngaytaophieu asc");
			int count = end - start;
			String sql=queryPhieuXyLyPhu.toString();
			
			if (start >= 0) {
				sql = sql + " limit " + start + ", " + count;
			}
			SQLQuery q = session.createSQLQuery(queryPhieuXyLyPhu.toString());
			q.setCacheable(false);
			q.addEntity(MotCuaPhieuXuLyPhuImpl.TABLE_NAME, MotCuaPhieuXuLyPhuImpl.class);
			
			_log.debug("=========searchPhanCongDonViKiemTraByHoSoThuTucId===" + queryPhieuXyLyPhu.toString());

			QueryPos qPos = QueryPos.getInstance(q);
			
			if (phanNhomHoSoId > 0) {
				qPos.add(phanNhomHoSoId);
			}
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				qPos.add(thuTucHanhChinhId.trim());
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				qPos.add(maSoHoSo);
			}
			if (organizationId > 0) {
				qPos.add(organizationId);
			}
			if (year > 0) {
				qPos.add(year);
			}
			
			return (List<MotCuaPhieuXuLyPhu>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<MotCuaPhieuXuLyPhu>();
	}
	
	public int countPhanCongDonViKiemTraByHoSoThuTucId(
		String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
		String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia) {
		Session session = null;
		try {
			session = openSession();
			//tthc_hosothutuc.id  quan he 1 - 1 voi phieuxulychinhid.id
			StringBuilder queryHosothuctuc = new StringBuilder("SELECT id FROM tthc_hosothutuc WHERE 1=1 ");
			
			_log.debug("==nhomPhieuXuLy==" + nhomPhieuXuLy + "==organizationId==" + organizationId);
			_log.debug("==phanNhomHoSoId==" + phanNhomHoSoId + "==thuTucHanhChinhId==" + thuTucHanhChinhId);
			
			_log.debug("==maSoHoSo==" + maSoHoSo + "==ngayNopFrom==" + ngayNopFrom + "==ngayNopTo==" + ngayNopTo);
			_log.debug("==year==" + year + "==quanHuyen==" + quanHuyen + "==tinhThanh==" + tinhThanh + "==quocGia==" + quocGia);
			
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				queryHosothuctuc.append(" AND thutuchanhchinhid = ?");
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				queryHosothuctuc.append(" AND maSoHoSo = ?");
			}
			if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(dateFrom);
				queryHosothuctuc.append(" AND (ngayguihoso >= '" + ngayNopFrom + "' OR ngayguihoso IS NULL)");
			}
			
			if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(dateTo);
				queryHosothuctuc.append(" AND (ngayguihoso <= '" + ngayNopTo + "' OR ngayguihoso IS NULL)");
			}
			
			if (organizationId > 0) {
				queryHosothuctuc.append(" AND tochucquanly = ?");
			}
			if (year > 0) {
				queryHosothuctuc.append(" AND YEAR(ngayguihoso) = ? ");
			}
			
			
			//tham so chua tim kiem 
			//int quanHuyen, int tinhThanh, int quocGia
			//nhet tham so tim kiem quanHuyen, int tinhThanh, int quocGia
			//String maSoHoSoOrDer trong ho so thu tuc
			
			
			//if (Validator.isNotNull(quanHuyen) && quanHuyen.trim().length() > 0) {
			//queryHosothuctuc.append(" AND thutuchanhchinhid = ?");
			//}
			//if (Validator.isNotNull(quocGia) && quocGia.trim().length() > 0) {
			//queryHosothuctuc.append(" AND thutuchanhchinhid = ?");
			//}
			
			
			
			StringBuilder queryDmDataItem = new StringBuilder();
			queryDmDataItem.append("SELECT code_0 FROM dkvn_thutuchanhchinh.dm_dataitem WHERE ");
			
			if (Validator.isNotNull(tinhThanh) && tinhThanh.trim().length() > 0) {
				queryDmDataItem.append(" code_0 = '" + tinhThanh + "' AND ");
			}
			
			queryDmDataItem.append("level = '1' AND datagroupid in (SELECT code FROM dkvn_thutuchanhchinh.dm_datagroup where name = '" + DanhMucKey.ADMINISTRATIVE_UNITS + "')");
			_log.debug("==countPhanCongDonViKiemTraByHoSoThuTucId==queryDmDataItem==" + queryDmDataItem.toString());
			
			
			
			StringBuilder queryConfirmedInspection = new StringBuilder();
			queryConfirmedInspection.append("SELECT phieuxulyphuid FROM dkvn_nghiepvu.vr_confirmedinspection WHERE ");
			queryConfirmedInspection.append("inspectionprovincecode in (" + queryDmDataItem.toString() +")");
			_log.debug("==countPhanCongDonViKiemTraByHoSoThuTucId====queryConfirmedInspection==" + queryConfirmedInspection.toString());
			
			StringBuilder queryPhieuXyLyPhu = new StringBuilder();
			queryPhieuXyLyPhu.append("SELECT count(*) as total FROM dkvn_thutuchanhchinh.motcua_phieuxulyphu where ");
			queryPhieuXyLyPhu.append("phannhomhosoid = ? and ");
			
			if (queryConfirmedInspection.length() > 0) {
				queryPhieuXyLyPhu.append("id in (" + queryConfirmedInspection.toString() + ") and ");
			}
			
			queryPhieuXyLyPhu.append("nhomphieuxuly in (" + nhomPhieuXuLy + ") and phieuxulychinhid in (" + queryHosothuctuc.toString() + ") order by ngaytaophieu asc");
			
			SQLQuery q = session.createSQLQuery(queryPhieuXyLyPhu.toString());
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);
			
			_log.debug("===countPhanCongDonViKiemTraByHoSoThuTucId===" + queryPhieuXyLyPhu.toString());
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			
			if (phanNhomHoSoId > 0) {
				qPos.add(phanNhomHoSoId);
			}
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				qPos.add(thuTucHanhChinhId.trim());
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				qPos.add(maSoHoSo);
			}
			if (organizationId > 0) {
				qPos.add(organizationId);
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
	
	public List<MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByConfirmedInspection(long idConfirmedInspection) {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder("SELECT {motcua_phieuxulyphu.*} FROM motcua_phieuxulyphu where 1=1 ");
				
				if (Validator.isNotNull(idConfirmedInspection) && idConfirmedInspection > 0) {
					query.append(" AND id in (SELECT phieuxulyphuid FROM dkvn_nghiepvu.vr_confirmedinspection where id = " + idConfirmedInspection + ")");
				}
				
				SQLQuery q = session.createSQLQuery(query.toString());
				q.setCacheable(false);
				q.addEntity(MotCuaPhieuXuLyPhuImpl.TABLE_NAME, MotCuaPhieuXuLyPhuImpl.class);
				
				_log.info("===countPhanCongDonViKiemTraByHoSoThuTucId===" + query.toString());
				
				QueryPos qPos = QueryPos.getInstance(q);
				
				return (List<MotCuaPhieuXuLyPhu>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				
			} catch (Exception e) {
				_log.error(e);
			} finally {
				closeSession(session);
			}
			
			return new ArrayList<MotCuaPhieuXuLyPhu>();
		}
	
}
