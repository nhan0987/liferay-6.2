package vn.dtt.gt.dk.dao.common.service.persistence;


import java.util.Date;
import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.model.impl.TthcHoSoThuTucImpl;
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

public class TthcHoSoThuTucFinderImpl extends BasePersistenceImpl<TthcHoSoThuTuc> implements TthcHoSoThuTucFinder {

	private static Log log = LogFactoryUtil.getLog(TthcHoSoThuTucFinderImpl.class);
	
	public List<TthcHoSoThuTuc> findDanhSachHoSo(long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int start, int end) throws SystemException {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder();
				
				String sql = "SELECT {tthc_hosothutuc.*} FROM tthc_hosothutuc WHERE 1=1 ";
				
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					query.append(" AND thutuchanhchinhid = ?");
				}	
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					query.append(" AND maSoHoSo like ? ");
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
					query.append(" AND tenchuhoso like ?");
				}
				if (phanNhomHoSoId > 0) {
					query.append(" AND phannhomhosoid = ?");
				}
				if (organizationId > 0) {
					query.append(" AND tochucquanly = ?");
				}
				
				query.append(" ORDER BY ngaytiepnhan desc ");
				
				sql = sql + query.toString();
				
				SQLQuery q = session.createSQLQuery(sql);
				q.setCacheable(false);
				q.addEntity(TthcHoSoThuTucImpl.TABLE_NAME, TthcHoSoThuTucImpl.class);
				
				log.debug("=========find DANH SACH HO SO By MINH HA===" + sql );
				QueryPos qPos = QueryPos.getInstance(q);
				
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					qPos.add(thuTucHanhChinhId.trim());
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					qPos.add("'%" + maSoHoSo + "%'");
				}
				if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
					qPos.add("'%" + tenDoanhNghiep + "%'");
				}
				if (phanNhomHoSoId > 0) {
					qPos.add(phanNhomHoSoId);
				}
				if (organizationId > 0) {
					qPos.add(organizationId);
				}
				
				return (List<TthcHoSoThuTuc>) QueryUtil.list(q, getDialect(), start, end);
				
			} catch (Exception e) {
				throw new SystemException(e);
			} finally {
				closeSession(session);
			}
		}
    
    
    public List<TthcHoSoThuTuc> findDanhSachHoSoAndDoiTuongAndMaSoBienNhan(String doiTuong,String maSoBienNhan,long organizationId, long phanNhomHoSoId, 
    		String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int start, int end) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			String sql = "SELECT {tthc_hosothutuc.*} FROM tthc_hosothutuc WHERE 1=1 ";
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				query.append(" AND thutuchanhchinhid = ?");
			}	
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				query.append(" AND maSoHoSo like ? ");
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
				query.append(" AND tenchuhoso like ?");
			}
			if (phanNhomHoSoId > 0) {
				query.append(" AND phannhomhosoid = ?");
			}
			if (organizationId > 0) {
				query.append(" AND tochucquanly = ?");
			}
			
			query.append(" ORDER BY ngaytiepnhan desc ");
			
			sql = sql + query.toString();
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(TthcHoSoThuTucImpl.TABLE_NAME, TthcHoSoThuTucImpl.class);
			
			log.debug("=========find DANH SACH HO SO By MINH HA===" + sql );
			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				qPos.add(thuTucHanhChinhId.trim());
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				qPos.add("'%" + maSoHoSo + "%'");
			}
			if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
				qPos.add("'%" + tenDoanhNghiep + "%'");
			}
			if (phanNhomHoSoId > 0) {
				qPos.add(phanNhomHoSoId);
			}
			if (organizationId > 0) {
				qPos.add(organizationId);
			}
			
			return (List<TthcHoSoThuTuc>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

    public TthcHoSoThuTuc findByPhieuXuLyPhuId(long phieuXuLyPhuId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT {tthc_hosothutuc.*} FROM tthc_hosothutuc where id in (SELECT HOSOTHUTUCID FROM motcua_phieuxulychinh where id in (SELECT PHIEUXULYCHINHID FROM motcua_phieuxulyphu where id = ?))");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(TthcHoSoThuTucImpl.TABLE_NAME, TthcHoSoThuTucImpl.class);
			
			log.debug("=========find DANH SACH HO SO By MINH HA===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(phieuXuLyPhuId);
			
			return (TthcHoSoThuTuc)q.uniqueResult();
			
		} catch (Exception e) {
			log.error(e);;
		} finally {
			closeSession(session);
		}
		
		return null;
	}

	
		
	public int countDanhSachHoSo(long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep) throws SystemException {
	
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			
			String sql = "SELECT count(*) as total FROM tthc_hosothutuc WHERE 1=1 ";
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				query.append(" AND thutuchanhchinhid = ?");
			}	
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				query.append(" AND maSoHoSo like ? ");
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
				query.append(" AND tenchuhoso like ? ");
			}
			if (phanNhomHoSoId > 0) {
				query.append(" AND phannhomhosoid = ?");
			}
			if (organizationId > 0) {
				query.append(" AND tochucquanly = ?");
			}
			
			sql = sql + query.toString();
			log.debug("=========count DANH SACH HO SO By MINH HA===" + sql );

			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				qPos.add(thuTucHanhChinhId.trim());
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				qPos.add("'%" + maSoHoSo + "%'");
			}
			if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
				qPos.add("'%" + tenDoanhNghiep + "%'");
			}
			if (phanNhomHoSoId > 0) {
				qPos.add(phanNhomHoSoId);
			}
			if (organizationId > 0) {
				qPos.add(organizationId);
			}
			
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	
	public int countDanhSachHoSofindDanhSachHoSoAndDoiTuongAndMaSoBienNhan(String doiTuong,String maSoBienNhan,long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep) throws SystemException {
	
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			
			String sql = "SELECT count(*) as total FROM tthc_hosothutuc WHERE 1=1 ";
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				query.append(" AND thutuchanhchinhid = ?");
			}	
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				query.append(" AND maSoHoSo like ? ");
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
				query.append(" AND tenchuhoso like ? ");
			}
			if (phanNhomHoSoId > 0) {
				query.append(" AND phannhomhosoid = ?");
			}
			if (organizationId > 0) {
				query.append(" AND tochucquanly = ?");
			}
			
			sql = sql + query.toString();
			log.debug("=========count DANH SACH HO SO By MINH HA===" + sql );

			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				qPos.add(thuTucHanhChinhId.trim());
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				qPos.add("'%" + maSoHoSo + "%'");
			}
			if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
				qPos.add("'%" + tenDoanhNghiep + "%'");
			}
			if (phanNhomHoSoId > 0) {
				qPos.add(phanNhomHoSoId);
			}
			if (organizationId > 0) {
				qPos.add(organizationId);
			}
			
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	

	public int countHoSoThuTucByPhanNhomHoSoAndToChucQuanLy(long phannhomhosoid, long tochucquanly) {
		
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT count(*) as total FROM tthc_hosothutuc WHERE phannhomhosoid = ? and tochucquanly = ? ");
			log.debug("=========count countHoSoThuTucByPhanNhomHoSoAndToChucQuanLy===" + query.toString() );

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(phannhomhosoid);
			qPos.add(tochucquanly);
			
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		return 0;
	}
	public int countHoSoThuTucByTinNhanh(long phannhomhosoid) {
		
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT count(*) as total FROM tthc_hosothutuc WHERE phannhomhosoid = ? ");
			log.debug("=========count countHoSoThuTucByTinNhanh===" + query.toString() );

			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(phannhomhosoid);
			
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		return 0;
	}
	
	public List<TthcHoSoThuTuc> searchTraCuuThongTinHoSo(String loaiThuTuc, String soDangKiKiemTra, String ngayCapDangKiFrom, String ngayCapDangKiTo,
		long organizationId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo, String nguoiNhapKhau, int start, int end)
		throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT {tthc_hosothutuc.*} FROM tthc_hosothutuc WHERE 1=1 ");
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				query.append(" AND thutuchanhchinhid = ?");
			}	
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				query.append(" AND maSoHoSo like ? ");
			}
			
			if (Validator.isNotNull(soDangKiKiemTra) && soDangKiKiemTra.trim().length() > 0) {
				query.append(" AND mabiennhan = '" + soDangKiKiemTra + "' ");
			}
			
			if (Validator.isNotNull(ngayCapDangKiFrom) && ngayCapDangKiFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayCapDangKiFrom.trim());
				ngayCapDangKiFrom = FormatData.parseDateToTring(dateFrom);
				query.append(" AND (ngaytiepnhan >= '" + ngayCapDangKiFrom + "' OR ngaytiepnhan IS NULL)");
			}
			
			if (Validator.isNotNull(ngayCapDangKiTo) && ngayCapDangKiTo.trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(ngayCapDangKiTo.trim());
				ngayCapDangKiTo = FormatData.parseDateToTring(dateTo);
				query.append(" AND (ngaytiepnhan <= '" + ngayCapDangKiTo + "' OR ngaytiepnhan IS NULL)");
			}
			
			
			if (Validator.isNotNull(loaiThuTuc) && loaiThuTuc.trim().length() > 0) {
				query.append(" AND tendonvitiepnhan = '" + loaiThuTuc+"' ");
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
			if (Validator.isNotNull(nguoiNhapKhau) && nguoiNhapKhau.trim().length() > 0) {
				query.append(" AND tenchuhoso like ?");
			}
			
			if (organizationId > 0) {
				query.append(" AND tochucquanly = ?");
			}
			
			query.append(" ORDER BY ngaytiepnhan desc ");
			
			int count = end - start;
			if (start >= 0) {
				query.append(" LIMIT " + start + ", " + count);
			}
			
			log.debug("=========searchTraCuuThongTinHoSo==start==" + start + "==count==" + count);
			log.debug("=========searchTraCuuThongTinHoSo===" + query.toString() );
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(TthcHoSoThuTucImpl.TABLE_NAME, TthcHoSoThuTucImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				qPos.add(thuTucHanhChinhId.trim());
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				qPos.add("'%" + maSoHoSo + "%'");
			}
			
			if (Validator.isNotNull(nguoiNhapKhau) && nguoiNhapKhau.trim().length() > 0) {
				qPos.add("'%" + nguoiNhapKhau + "%'");
			}
			
			if (organizationId > 0) {
				qPos.add(organizationId);
			}
			
			return (List<TthcHoSoThuTuc>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public int countSearchTraCuuThongTinHoSo(String loaiThuTuc, String soDangKiKiemTra, String ngayCapDangKiFrom, String ngayCapDangKiTo,
		long organizationId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo, String nguoiNhapKhau) throws SystemException {
		
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			
			String sql = "SELECT count(*) as total FROM tthc_hosothutuc WHERE 1=1 ";
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				query.append(" AND thutuchanhchinhid = ?");
			}	
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				query.append(" AND maSoHoSo like ? ");
			}
			
			if (Validator.isNotNull(soDangKiKiemTra) && soDangKiKiemTra.trim().length() > 0) {
				query.append(" AND mabiennhan = '" + soDangKiKiemTra+"' ");
			}
			
			if (Validator.isNotNull(ngayCapDangKiFrom) && ngayCapDangKiFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayCapDangKiFrom.trim());
				ngayCapDangKiFrom = FormatData.parseDateToTring(dateFrom);
				query.append(" AND (ngaytiepnhan >= '" + ngayCapDangKiFrom + "' OR ngaytiepnhan IS NULL)");
			}
			
			if (Validator.isNotNull(ngayCapDangKiTo) && ngayCapDangKiTo.trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(ngayCapDangKiTo.trim());
				ngayCapDangKiTo = FormatData.parseDateToTring(dateTo);
				query.append(" AND (ngaytiepnhan <= '" + ngayCapDangKiTo + "' OR ngaytiepnhan IS NULL)");
			}
			
			
			if (Validator.isNotNull(loaiThuTuc) && loaiThuTuc.trim().length() > 0) {
				query.append(" AND tendonvitiepnhan = '" + loaiThuTuc+"' ");
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
			if (Validator.isNotNull(nguoiNhapKhau) && nguoiNhapKhau.trim().length() > 0) {
				query.append(" AND tenchuhoso like ? ");
			}
			
			if (organizationId > 0) {
				query.append(" AND tochucquanly = ?");
			}
			
			sql = sql + query.toString();
			
			log.debug("=========countSearchTraCuuThongTinHoSo===" + sql );

			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				qPos.add(thuTucHanhChinhId.trim());
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				qPos.add("'%" + maSoHoSo + "%'");
			}
			if (Validator.isNotNull(nguoiNhapKhau) && nguoiNhapKhau.trim().length() > 0) {
				qPos.add("'%" + nguoiNhapKhau + "%'");
			}
			
			if (organizationId > 0) {
				qPos.add(organizationId);
			}
			
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<TthcHoSoThuTuc> findByDebitNoteId(long idDebitNote) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			String sql = "SELECT {tthc_hosothutuc.*} FROM dkvn_thutuchanhchinh.tthc_hosothutuc, ";
			
				query.append(" (SELECT distinct debDtl.debitnoteid, vr_registeredinspection.dossierid, vr.id, vr.vehiclegroupid  FROM dkvn_nghiepvu.vr_vehiclerecord  vr");
				query.append(" INNER JOIN dkvn_nghiepvu.vr_debitnotedetails debDtl on debDtl.vehiclerecordid = vr.id");
				query.append(" INNER JOIN  dkvn_nghiepvu.vr_vehiclegroup on vr_vehiclegroup.id = vr.vehiclegroupid");
				query.append(" INNER JOIN dkvn_nghiepvu.vr_registeredinspection on");
				query.append(" vr_registeredinspection.id   = vr_vehiclegroup.registeredinspectionid");
				query.append(" where 1=1 and debDtl.debitnoteid = ? Group by dossierid) abc");
				query.append(" where abc.dossierid = tthc_hosothutuc.id;");
			
			
			sql = sql + query.toString();
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(TthcHoSoThuTucImpl.TABLE_NAME, TthcHoSoThuTucImpl.class);
			
			log.debug("=========findByDebitNoteId MINH HA===" + sql );
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(idDebitNote);
			
			return (List<TthcHoSoThuTuc>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<TthcHoSoThuTuc> findByThamsoDongboMTgateway(long lastHosothutucId) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			String sql = "SELECT {tthc_hosothutuc.*} FROM dkvn_thutuchanhchinh.tthc_hosothutuc ";

				query.append(" WHERE tthc_hosothutuc.id > ? order by id asc;");
			
			
			sql = sql + query.toString();
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(TthcHoSoThuTucImpl.TABLE_NAME, TthcHoSoThuTucImpl.class);
			
			log.debug("=========findByThamsoDongboMTgateway===" + sql );
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(lastHosothutucId);
			
			return (List<TthcHoSoThuTuc>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}
