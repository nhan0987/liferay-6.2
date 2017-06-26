package vn.dtt.gt.dk.dao.motcua.service.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra;
import vn.dtt.gt.dk.dao.motcua.model.impl.PhanCongDonViKiemTraImpl;
import vn.dtt.gt.dk.utils.DanhMucKey;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class PhanCongDonViKiemTraFinderImpl  extends BasePersistenceImpl<PhanCongDonViKiemTra> implements PhanCongDonViKiemTraFinder {
	private static Log _log = LogFactoryUtil.getLog(PhanCongDonViKiemTraFinderImpl.class);
	
	public static final String COUNT_PHANCONGDONVIKIEMTRA = 
		PhanCongDonViKiemTraFinder.class.getName() + ".countPhanCongDonViKiemTra";
	
	public static final String COUNT_PHANCONGDONVIKIEMTRAHIENTRUONG = 
		PhanCongDonViKiemTraFinder.class.getName() + ".countPhanCongDonViKiemTraHienTruong";
	
	public static final String COUNT_LICHKIEMTRAHIENTRUONG = 
		PhanCongDonViKiemTraFinder.class.getName() + ".countLichKiemTraHienTruong";
	
	public static final String FIND_PHANCONGDONVIKIEMTRA = 
		PhanCongDonViKiemTraFinder.class.getName() + ".findPhanCongDonViKiemTra";
	
	public static final String FIND_PHANCONGDONVIKIEMTRAHIENTRUONG = 
		PhanCongDonViKiemTraFinder.class.getName() + ".findPhanCongDonViKiemTraHienTruong";
	
	public static final String FIND_LICHKIEMTRAHIENTRUONG = 
		PhanCongDonViKiemTraFinder.class.getName() + ".findLichKiemTraHienTruong";
	
	public long countPhanCongDonViKiemTra(String nhomPhieuXuLy,
			long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId,
			String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
			String ngayNopTo, int year, String quanHuyen, String tinhThanh,
			String quocGia) {
		
		Session session = null;
		
		try {
			session = openSession();
			//tthc_hosothutuc.id  quan he 1 - 1 voi phieuxulychinhid.id
			
			String sql = CustomSQLUtil.get(COUNT_PHANCONGDONVIKIEMTRA);
			
			if(phanNhomHoSoId == 0) {
				sql = StringUtil.replace(sql, "AND motcua_phieuxulyphu.phannhomhosoid = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(thuTucHanhChinhId)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.thutuchanhchinhid = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(maSoHoSo)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.masohoso = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(ngayNopFrom)) {
				sql = StringUtil.replace(sql, "AND (tthc_hosothutuc.ngayguihoso >= ? OR tthc_hosothutuc.ngayguihoso IS NULL)", StringPool.BLANK);
			}
			
			if(Validator.isNull(maSoBienNhan)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.mabiennhan = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(ngayNopTo)) {
				sql = StringUtil.replace(sql, "AND (tthc_hosothutuc.ngayguihoso <= ? OR tthc_hosothutuc.ngayguihoso IS NULL)", StringPool.BLANK);
			}
			
			if (organizationId == 0) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.tochucquanly = ?", StringPool.BLANK);
			}
			
			if (year == 0) {
				sql = StringUtil.replace(sql, "AND YEAR(tthc_hosothutuc.ngayguihoso) = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(nhomPhieuXuLy)){
				sql = StringUtil.replace(sql, "AND motcua_phieuxulyphu.nhomphieuxuly IN ([$NHOM_PHIEU_XU_LY$])", StringPool.BLANK);
			} else {
				sql = StringUtil.replace(sql, "[$NHOM_PHIEU_XU_LY$]", nhomPhieuXuLy);
			}
			
			if(Validator.isNull(tinhThanh)) {
				sql = StringUtil.replace(sql, "AND vr_confirmedinspection.inspectionprovincecode = ?", StringPool.BLANK);
			}
			
			_log.debug("===countPhanCongDonViKiemTra==="+sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			q.setCacheable(false);

			QueryPos qPos = QueryPos.getInstance(q);
			
			if(phanNhomHoSoId > 0) {
				qPos.add(phanNhomHoSoId);
			}
			
			if(Validator.isNotNull(thuTucHanhChinhId)) {
				qPos.add(thuTucHanhChinhId);
			}
			
			if(Validator.isNotNull(maSoHoSo)) {
				qPos.add(maSoHoSo);
			}
			
			if(Validator.isNotNull(ngayNopFrom)) {
				Date date = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(date);
				qPos.add(ngayNopFrom);
			}
			
			if(Validator.isNotNull(maSoBienNhan)) {
				qPos.add(maSoBienNhan);
			}
			
			if(Validator.isNotNull(ngayNopTo)) {
				Date date = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(date);
				qPos.add(ngayNopTo);
			}
			
			if (organizationId > 0) {
				qPos.add(organizationId);
			}
			
			if (year > 0) {
				qPos.add(year);
			}
			
			if (Validator.isNotNull(tinhThanh)) {
				qPos.add(tinhThanh);
			}

			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long toal = itr.next();
				if (toal != null) {
					return toal.intValue(); 
				}
			}
			return 0;
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
	
	public List<PhanCongDonViKiemTra> findPhanCongDonViKiemTra(
		String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
		String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia, int start, int end) {
		
		Session session = null;
		
		try {
			session = openSession();
			//tthc_hosothutuc.id  quan he 1 - 1 voi phieuxulychinhid.id
			
			String sql = CustomSQLUtil.get(FIND_PHANCONGDONVIKIEMTRA);
			
			if(phanNhomHoSoId == 0) {
				sql = StringUtil.replace(sql, "AND motcua_phieuxulyphu.phannhomhosoid = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(thuTucHanhChinhId)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.thutuchanhchinhid = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(maSoHoSo)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.masohoso = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(ngayNopFrom)) {
				sql = StringUtil.replace(sql, "AND (tthc_hosothutuc.ngayguihoso >= ? OR tthc_hosothutuc.ngayguihoso IS NULL)", StringPool.BLANK);
			}
			
			if(Validator.isNull(maSoBienNhan)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.mabiennhan = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(ngayNopTo)) {
				sql = StringUtil.replace(sql, "AND (tthc_hosothutuc.ngayguihoso <= ? OR tthc_hosothutuc.ngayguihoso IS NULL)", StringPool.BLANK);
			}
			
			if (organizationId == 0) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.tochucquanly = ?", StringPool.BLANK);
			}
			
			if (year == 0) {
				sql = StringUtil.replace(sql, "AND YEAR(tthc_hosothutuc.ngayguihoso) = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(nhomPhieuXuLy)){
				sql = StringUtil.replace(sql, "AND motcua_phieuxulyphu.nhomphieuxuly IN ([$NHOM_PHIEU_XU_LY$])", StringPool.BLANK);
			} else {
				sql = StringUtil.replace(sql, "[$NHOM_PHIEU_XU_LY$]", nhomPhieuXuLy);
			}
			
			if(Validator.isNull(tinhThanh)) {
				sql = StringUtil.replace(sql, "AND vr_confirmedinspection.inspectionprovincecode = ?", StringPool.BLANK);
			}
			
			_log.debug("===findPhanCongDonViKiemTra==="+sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("PhanCongDonViKiemTra", PhanCongDonViKiemTraImpl.class);
			q.setCacheable(false);

			QueryPos qPos = QueryPos.getInstance(q);
			
			if(phanNhomHoSoId > 0) {
				qPos.add(phanNhomHoSoId);
			}
			
			if(Validator.isNotNull(thuTucHanhChinhId)) {
				qPos.add(thuTucHanhChinhId);
			}
			
			if(Validator.isNotNull(maSoHoSo)) {
				qPos.add(maSoHoSo);
			}
			
			if(Validator.isNotNull(ngayNopFrom)) {
				Date date = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(date);
				qPos.add(ngayNopFrom);
			}
			
			if(Validator.isNotNull(maSoBienNhan)) {
				qPos.add(maSoBienNhan);
			}
			
			if(Validator.isNotNull(ngayNopTo)) {
				Date date = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(date);
				qPos.add(ngayNopTo);
			}
			
			if (organizationId > 0) {
				qPos.add(organizationId);
			}
			
			if (year > 0) {
				qPos.add(year);
			}
			
			if (Validator.isNotNull(tinhThanh)) {
				qPos.add(tinhThanh);
			}
			
			return (List<PhanCongDonViKiemTra>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<PhanCongDonViKiemTra>();
	}
	
	public long countPhanCongDonViKiemTraHienTruong(String nhomPhieuXuLy,
			long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId,
			String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
			String ngayNopTo, int year, String quanHuyen, String tinhThanh,
			String quocGia, long userId) {
		
		Session session = null;
		
		try {
			session = openSession();
			//tthc_hosothutuc.id  quan he 1 - 1 voi phieuxulychinhid.id
			
			String sql = CustomSQLUtil.get(COUNT_PHANCONGDONVIKIEMTRAHIENTRUONG);
			
			if(phanNhomHoSoId == 0) {
				sql = StringUtil.replace(sql, "AND motcua_phieuxulyphu.phannhomhosoid = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(thuTucHanhChinhId)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.thutuchanhchinhid = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(maSoHoSo)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.masohoso = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(ngayNopFrom)) {
				sql = StringUtil.replace(sql, "AND (tthc_hosothutuc.ngayguihoso >= ? OR tthc_hosothutuc.ngayguihoso IS NULL)", StringPool.BLANK);
			}
			
			if(Validator.isNull(maSoBienNhan)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.mabiennhan = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(ngayNopTo)) {
				sql = StringUtil.replace(sql, "AND (tthc_hosothutuc.ngayguihoso <= ? OR tthc_hosothutuc.ngayguihoso IS NULL)", StringPool.BLANK);
			}
			
			if (organizationId == 0) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.tochucquanly = ?", StringPool.BLANK);
			}
			
			if (year == 0) {
				sql = StringUtil.replace(sql, "AND YEAR(tthc_hosothutuc.ngayguihoso) = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(nhomPhieuXuLy)){
				sql = StringUtil.replace(sql, "AND motcua_phieuxulyphu.nhomphieuxuly IN ([$NHOM_PHIEU_XU_LY$])", StringPool.BLANK);
			} else {
				sql = StringUtil.replace(sql, "[$NHOM_PHIEU_XU_LY$]", nhomPhieuXuLy);
			}
			
			if(Validator.isNull(tinhThanh)) {
				sql = StringUtil.replace(sql, "AND vr_confirmedinspection.inspectionprovincecode = ?", StringPool.BLANK);
			}
			
			_log.debug("===countPhanCongDonViKiemTraHienTruong==="+sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			q.setCacheable(false);

			QueryPos qPos = QueryPos.getInstance(q);
			
			if(phanNhomHoSoId > 0) {
				qPos.add(phanNhomHoSoId);
			}
			
			if(Validator.isNotNull(thuTucHanhChinhId)) {
				qPos.add(thuTucHanhChinhId);
			}
			
			if(Validator.isNotNull(maSoHoSo)) {
				qPos.add(maSoHoSo);
			}
			
			if(Validator.isNotNull(ngayNopFrom)) {
				Date date = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(date);
				qPos.add(ngayNopFrom);
			}
			
			if(Validator.isNotNull(maSoBienNhan)) {
				qPos.add(maSoBienNhan);
			}
			
			if(Validator.isNotNull(ngayNopTo)) {
				Date date = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(date);
				qPos.add(ngayNopTo);
			}
			
			if (organizationId > 0) {
				qPos.add(organizationId);
			}
			
			if (year > 0) {
				qPos.add(year);
			}
			
			if (Validator.isNotNull(tinhThanh)) {
				qPos.add(tinhThanh);
			}
			
			qPos.add(userId);

			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long toal = itr.next();
				if (toal != null) {
					return toal.intValue(); 
				}
			}
			return 0;
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
	
	public List<PhanCongDonViKiemTra> findPhanCongDonViKiemTraHienTruong(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId,
			String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan,
			String ngayNopFrom, String ngayNopTo, int year, String quanHuyen,
			String tinhThanh, String quocGia, long userId, int start, int end) {
		
		Session session = null;
		
		try {
			session = openSession();
			//tthc_hosothutuc.id  quan he 1 - 1 voi phieuxulychinhid.id
			
			String sql = CustomSQLUtil.get(FIND_PHANCONGDONVIKIEMTRAHIENTRUONG);
			
			if(phanNhomHoSoId == 0) {
				sql = StringUtil.replace(sql, "AND motcua_phieuxulyphu.phannhomhosoid = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(thuTucHanhChinhId)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.thutuchanhchinhid = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(maSoHoSo)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.masohoso = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(ngayNopFrom)) {
				sql = StringUtil.replace(sql, "AND (tthc_hosothutuc.ngayguihoso >= ? OR tthc_hosothutuc.ngayguihoso IS NULL)", StringPool.BLANK);
			}
			
			if(Validator.isNull(maSoBienNhan)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.mabiennhan = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(ngayNopTo)) {
				sql = StringUtil.replace(sql, "AND (tthc_hosothutuc.ngayguihoso <= ? OR tthc_hosothutuc.ngayguihoso IS NULL)", StringPool.BLANK);
			}
			
			if (organizationId == 0) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.tochucquanly = ?", StringPool.BLANK);
			}
			
			if (year == 0) {
				sql = StringUtil.replace(sql, "AND YEAR(tthc_hosothutuc.ngayguihoso) = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(nhomPhieuXuLy)){
				sql = StringUtil.replace(sql, "AND motcua_phieuxulyphu.nhomphieuxuly IN ([$NHOM_PHIEU_XU_LY$])", StringPool.BLANK);
			} else {
				sql = StringUtil.replace(sql, "[$NHOM_PHIEU_XU_LY$]", nhomPhieuXuLy);
			}
			
			if(Validator.isNull(tinhThanh)) {
				sql = StringUtil.replace(sql, "AND vr_confirmedinspection.inspectionprovincecode = ?", StringPool.BLANK);
			}
			
			_log.debug("===findPhanCongDonViKiemTraHienTruong==="+sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("PhanCongDonViKiemTra", PhanCongDonViKiemTraImpl.class);
			q.setCacheable(false);

			QueryPos qPos = QueryPos.getInstance(q);
			
			if(phanNhomHoSoId > 0) {
				qPos.add(phanNhomHoSoId);
			}
			
			if(Validator.isNotNull(thuTucHanhChinhId)) {
				qPos.add(thuTucHanhChinhId);
			}
			
			if(Validator.isNotNull(maSoHoSo)) {
				qPos.add(maSoHoSo);
			}
			
			if(Validator.isNotNull(ngayNopFrom)) {
				Date date = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(date);
				qPos.add(ngayNopFrom);
			}
			
			if(Validator.isNotNull(maSoBienNhan)) {
				qPos.add(maSoBienNhan);
			}
			
			if(Validator.isNotNull(ngayNopTo)) {
				Date date = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(date);
				qPos.add(ngayNopTo);
			}
			
			if (organizationId > 0) {
				qPos.add(organizationId);
			}
			
			if (year > 0) {
				qPos.add(year);
			}
			
			if (Validator.isNotNull(tinhThanh)) {
				qPos.add(tinhThanh);
			}
			
			qPos.add(userId);
			
			return (List<PhanCongDonViKiemTra>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<PhanCongDonViKiemTra>();
	}
	
	public long countLichKiemTraHienTruong(String nhomPhieuXuLy,
			long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId,
			String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
			String ngayNopTo, int year, String quanHuyen, String tinhThanh,
			String quocGia, long userId) {
		
		Session session = null;
		
		try {
			
			session = openSession();
			//tthc_hosothutuc.id  quan he 1 - 1 voi phieuxulychinhid.id
			
			String sql = CustomSQLUtil.get(COUNT_LICHKIEMTRAHIENTRUONG);
			
			if(phanNhomHoSoId == 0) {
				sql = StringUtil.replace(sql, "AND motcua_phieuxulyphu.phannhomhosoid = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(thuTucHanhChinhId)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.thutuchanhchinhid = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(maSoHoSo)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.masohoso = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(ngayNopFrom)) {
				sql = StringUtil.replace(sql, "AND (tthc_hosothutuc.ngayguihoso >= ? OR tthc_hosothutuc.ngayguihoso IS NULL)", StringPool.BLANK);
			}
			
			if(Validator.isNull(maSoBienNhan)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.mabiennhan = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(ngayNopTo)) {
				sql = StringUtil.replace(sql, "AND (tthc_hosothutuc.ngayguihoso <= ? OR tthc_hosothutuc.ngayguihoso IS NULL)", StringPool.BLANK);
			}
			
			if (organizationId == 0) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.tochucquanly = ?", StringPool.BLANK);
			}
			
			if (year == 0) {
				sql = StringUtil.replace(sql, "AND YEAR(tthc_hosothutuc.ngayguihoso) = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(nhomPhieuXuLy)){
				sql = StringUtil.replace(sql, "AND motcua_phieuxulyphu.nhomphieuxuly IN ([$NHOM_PHIEU_XU_LY$])", StringPool.BLANK);
			} else {
				sql = StringUtil.replace(sql, "[$NHOM_PHIEU_XU_LY$]", nhomPhieuXuLy);
			}
			
			if(Validator.isNull(tinhThanh)) {
				sql = StringUtil.replace(sql, "AND vr_confirmedinspection.inspectionprovincecode = ?", StringPool.BLANK);
			}
			
			_log.debug("===countLichKiemTraHienTruong==="+sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			q.setCacheable(false);

			QueryPos qPos = QueryPos.getInstance(q);
			
			if(phanNhomHoSoId > 0) {
				qPos.add(phanNhomHoSoId);
			}
			
			if(Validator.isNotNull(thuTucHanhChinhId)) {
				qPos.add(thuTucHanhChinhId);
			}
			
			if(Validator.isNotNull(maSoHoSo)) {
				qPos.add(maSoHoSo);
			}
			
			if(Validator.isNotNull(ngayNopFrom)) {
				Date date = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(date);
				qPos.add(ngayNopFrom);
			}
			
			if(Validator.isNotNull(maSoBienNhan)) {
				qPos.add(maSoBienNhan);
			}
			
			if(Validator.isNotNull(ngayNopTo)) {
				Date date = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(date);
				qPos.add(ngayNopTo);
			}
			
			if (organizationId > 0) {
				qPos.add(organizationId);
			}
			
			if (year > 0) {
				qPos.add(year);
			}
			
			if (Validator.isNotNull(tinhThanh)) {
				qPos.add(tinhThanh);
			}
			
			qPos.add(userId);
			
			// union
			
			if(phanNhomHoSoId > 0) {
				qPos.add(phanNhomHoSoId);
			}
			
			if(Validator.isNotNull(thuTucHanhChinhId)) {
				qPos.add(thuTucHanhChinhId);
			}
			
			if(Validator.isNotNull(maSoHoSo)) {
				qPos.add(maSoHoSo);
			}
			
			if(Validator.isNotNull(ngayNopFrom)) {
				Date date = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(date);
				qPos.add(ngayNopFrom);
			}
			
			if(Validator.isNotNull(maSoBienNhan)) {
				qPos.add(maSoBienNhan);
			}
			
			if(Validator.isNotNull(ngayNopTo)) {
				Date date = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(date);
				qPos.add(ngayNopTo);
			}
			
			if (organizationId > 0) {
				qPos.add(organizationId);
			}
			
			if (year > 0) {
				qPos.add(year);
			}
			
			if (Validator.isNotNull(tinhThanh)) {
				qPos.add(tinhThanh);
			}
			
			qPos.add(userId);
			qPos.add(userId);
			
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long toal = itr.next();
				if (toal != null) { return toal.intValue(); }
			}
			
			return 0;
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
	
	public List<PhanCongDonViKiemTra> findLichKiemTraHienTruong(
		String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
		String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia,long userId, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			//tthc_hosothutuc.id  quan he 1 - 1 voi phieuxulychinhid.id
			
			String sql = CustomSQLUtil.get(FIND_LICHKIEMTRAHIENTRUONG);
			
			if(phanNhomHoSoId == 0) {
				sql = StringUtil.replace(sql, "AND motcua_phieuxulyphu.phannhomhosoid = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(thuTucHanhChinhId)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.thutuchanhchinhid = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(maSoHoSo)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.masohoso = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(ngayNopFrom)) {
				sql = StringUtil.replace(sql, "AND (tthc_hosothutuc.ngayguihoso >= ? OR tthc_hosothutuc.ngayguihoso IS NULL)", StringPool.BLANK);
			}
			
			if(Validator.isNull(maSoBienNhan)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.mabiennhan = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(ngayNopTo)) {
				sql = StringUtil.replace(sql, "AND (tthc_hosothutuc.ngayguihoso <= ? OR tthc_hosothutuc.ngayguihoso IS NULL)", StringPool.BLANK);
			}
			
			if (organizationId == 0) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.tochucquanly = ?", StringPool.BLANK);
			}
			
			if (year == 0) {
				sql = StringUtil.replace(sql, "AND YEAR(tthc_hosothutuc.ngayguihoso) = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(nhomPhieuXuLy)){
				sql = StringUtil.replace(sql, "AND motcua_phieuxulyphu.nhomphieuxuly IN ([$NHOM_PHIEU_XU_LY$])", StringPool.BLANK);
			} else {
				sql = StringUtil.replace(sql, "[$NHOM_PHIEU_XU_LY$]", nhomPhieuXuLy);
			}
			
			if(Validator.isNull(tinhThanh)) {
				sql = StringUtil.replace(sql, "AND vr_confirmedinspection.inspectionprovincecode = ?", StringPool.BLANK);
			}
			
			_log.debug("===findLichKiemTraHienTruong==="+sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("PhanCongDonViKiemTra", PhanCongDonViKiemTraImpl.class);
			q.setCacheable(false);

			QueryPos qPos = QueryPos.getInstance(q);
			
			if(phanNhomHoSoId > 0) {
				qPos.add(phanNhomHoSoId);
			}
			
			if(Validator.isNotNull(thuTucHanhChinhId)) {
				qPos.add(thuTucHanhChinhId);
			}
			
			if(Validator.isNotNull(maSoHoSo)) {
				qPos.add(maSoHoSo);
			}
			
			if(Validator.isNotNull(ngayNopFrom)) {
				Date date = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(date);
				qPos.add(ngayNopFrom);
			}
			
			if(Validator.isNotNull(maSoBienNhan)) {
				qPos.add(maSoBienNhan);
			}
			
			if(Validator.isNotNull(ngayNopTo)) {
				Date date = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(date);
				qPos.add(ngayNopTo);
			}
			
			if (organizationId > 0) {
				qPos.add(organizationId);
			}
			
			if (year > 0) {
				qPos.add(year);
			}
			
			if (Validator.isNotNull(tinhThanh)) {
				qPos.add(tinhThanh);
			}
			
			qPos.add(userId);
			
			// union
			
			if(phanNhomHoSoId > 0) {
				qPos.add(phanNhomHoSoId);
			}
			
			if(Validator.isNotNull(thuTucHanhChinhId)) {
				qPos.add(thuTucHanhChinhId);
			}
			
			if(Validator.isNotNull(maSoHoSo)) {
				qPos.add(maSoHoSo);
			}
			
			if(Validator.isNotNull(ngayNopFrom)) {
				Date date = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(date);
				qPos.add(ngayNopFrom);
			}
			
			if(Validator.isNotNull(maSoBienNhan)) {
				qPos.add(maSoBienNhan);
			}
			
			if(Validator.isNotNull(ngayNopTo)) {
				Date date = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(date);
				qPos.add(ngayNopTo);
			}
			
			if (organizationId > 0) {
				qPos.add(organizationId);
			}
			
			if (year > 0) {
				qPos.add(year);
			}
			
			if (Validator.isNotNull(tinhThanh)) {
				qPos.add(tinhThanh);
			}
			
			qPos.add(userId);
			qPos.add(userId);
			
			return (List<PhanCongDonViKiemTra>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<PhanCongDonViKiemTra>();
	}
	
	@Deprecated
	public List<PhanCongDonViKiemTra> searchPhanCongDonViKiemTraByHoSoThuTucId(
		String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
		String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia, int start, int end) {
		
		Session session = null;
		
		try {
			session = openSession();
			//tthc_hosothutuc.id  quan he 1 - 1 voi phieuxulychinhid.id
			StringBuilder queryData = new StringBuilder("SELECT {view_phancongdonvikiemtra.*} FROM view_phancongdonvikiemtra WHERE 1=1 ");
			
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				queryData.append(" AND thutuchanhchinhid = "+thuTucHanhChinhId);
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				queryData.append(" AND maSoHoSo = '"+maSoHoSo+"'");
			}
			if (Validator.isNotNull(maSoBienNhan) && maSoBienNhan.trim().length() > 0) {
				queryData.append(" AND mabiennhan = '" + maSoBienNhan+"' ");
			}
			if (phanNhomHoSoId > 0) {
				queryData.append(" AND phannhomhosoid = "+phanNhomHoSoId);
			}
			if (Validator.isNotNull(nhomPhieuXuLy) && nhomPhieuXuLy.trim().length() > 0) {
				queryData.append(" AND nhomphieuxuly in( "+nhomPhieuXuLy+")  ");
			}
			if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(dateFrom);
				queryData.append(" AND (ngayguihoso >= '" + ngayNopFrom + "' OR ngayguihoso IS NULL)");
			}
			
			if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(dateTo);
				queryData.append(" AND (ngayguihoso <= '" + ngayNopTo + "' OR ngayguihoso IS NULL)");
			}
			
			if (organizationId > 0) {
				queryData.append(" AND tochucquanly = "+organizationId);
			}
			if (year > 0) {
				queryData.append(" AND YEAR(ngayguihoso) =  "+year);
			}								
			
			StringBuilder queryDmDataItem = new StringBuilder();
			if (Validator.isNotNull(tinhThanh) && tinhThanh.trim().length() > 0) {
				queryDmDataItem.append("SELECT code_0 FROM dkvn_thutuchanhchinh.dm_dataitem WHERE ");
				queryDmDataItem.append(" code_0 = '" + tinhThanh + "' AND ");
				queryDmDataItem.append(" level = '1' AND datagroupid in (SELECT code FROM dkvn_thutuchanhchinh.dm_datagroup where name = '" + DanhMucKey.ADMINISTRATIVE_UNITS + "')");
			}
			
			if(queryDmDataItem.toString()!=null&&queryDmDataItem.toString().length()>2){
				queryData.append(" AND inspectionprovincecode in (" + queryDmDataItem.toString() +")" +"  order by ngaytaophieu asc");
			}
			
			int count = end - start;
			String sql=queryData.toString();
			
			if (start >= 0) {
				sql = sql + " limit " + start + ", " + count;
			}
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(PhanCongDonViKiemTraImpl.TABLE_NAME, PhanCongDonViKiemTraImpl.class);
			
			_log.debug("===searchPhanCongDonViKiemTraByHoSoThuTucId==="+sql);

			QueryPos qPos = QueryPos.getInstance(q);
			
			return (List<PhanCongDonViKiemTra>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<PhanCongDonViKiemTra>();
	}
	
	@Deprecated
	public long countPhanCongDonViKiemTraByHoSoThuTucId(
		String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
		String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia) {
		Session session = null;
		try {
			session = openSession();
			//tthc_hosothutuc.id  quan he 1 - 1 voi phieuxulychinhid.id
			StringBuilder queryData = new StringBuilder("SELECT count(*) as total FROM view_phancongdonvikiemtra WHERE 1=1 ");
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				queryData.append(" AND thutuchanhchinhid = "+thuTucHanhChinhId);
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				queryData.append(" AND maSoHoSo = '"+maSoHoSo+"'");
			}
			if (Validator.isNotNull(maSoBienNhan) && maSoBienNhan.trim().length() > 0) {
				queryData.append(" AND mabiennhan = '" + maSoBienNhan+"' ");
			}
			if (phanNhomHoSoId > 0) {
				queryData.append(" AND phannhomhosoid = "+phanNhomHoSoId);
			}
			if (Validator.isNotNull(nhomPhieuXuLy) && nhomPhieuXuLy.trim().length() > 0) {
				queryData.append(" AND nhomphieuxuly in( "+nhomPhieuXuLy+")  ");
			}
			if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(dateFrom);
				queryData.append(" AND (ngayguihoso >= '" + ngayNopFrom + "' OR ngayguihoso IS NULL)");
			}
			
			if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(dateTo);
				queryData.append(" AND (ngayguihoso <= '" + ngayNopTo + "' OR ngayguihoso IS NULL)");
			}
			
			if (organizationId > 0) {
				queryData.append(" AND tochucquanly = "+organizationId);
			}
			if (year > 0) {
				queryData.append(" AND YEAR(ngayguihoso) =  "+year);
			}				
							
			
			StringBuilder queryDmDataItem = new StringBuilder();
			if (Validator.isNotNull(tinhThanh) && tinhThanh.trim().length() > 0) {
				queryDmDataItem.append("SELECT code_0 FROM dkvn_thutuchanhchinh.dm_dataitem WHERE ");
				queryDmDataItem.append(" code_0 = '" + tinhThanh + "' AND ");
				queryDmDataItem.append(" level = '1' AND datagroupid in (SELECT code FROM dkvn_thutuchanhchinh.dm_datagroup where name = '" + DanhMucKey.ADMINISTRATIVE_UNITS + "')");
			}
			
			if(queryDmDataItem.toString()!=null&&queryDmDataItem.toString().length()>2){
				queryData.append(" AND inspectionprovincecode in (" + queryDmDataItem.toString() +")");
			}
			
			
			//int count = end - start;
			String sql=queryData.toString();
			
			_log.debug("===countPhanCongDonViKiemTraByHoSoThuTucId==="+sql);
			
			
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			QueryPos qPos = QueryPos.getInstance(q);

			
//				QueryPos qPos = QueryPos.getInstance(q);
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long toal = itr.next();
				if (toal != null) {
					return toal.intValue(); 
				}
			}
			return 0;
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
	
	@Deprecated
	public List<PhanCongDonViKiemTra> searchPhanCongKiemTraKiemTraHienTruong(
		String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
		String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia,long userId, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			//tthc_hosothutuc.id  quan he 1 - 1 voi phieuxulychinhid.id
			StringBuilder queryData = new StringBuilder("SELECT {view_phancongdonvikiemtra.*} FROM view_phancongdonvikiemtra WHERE 1=1 ");
			
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				queryData.append(" AND thutuchanhchinhid = "+thuTucHanhChinhId);
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				queryData.append(" AND maSoHoSo = '"+maSoHoSo+"'");
			}
			if (Validator.isNotNull(maSoBienNhan) && maSoBienNhan.trim().length() > 0) {
				queryData.append(" AND mabiennhan = '" + maSoBienNhan+"' ");
			}
			if (phanNhomHoSoId > 0) {
				queryData.append(" AND phannhomhosoid = "+phanNhomHoSoId);
			}
			if (Validator.isNotNull(nhomPhieuXuLy) && nhomPhieuXuLy.trim().length() > 0) {
				queryData.append(" AND nhomphieuxuly in( "+nhomPhieuXuLy+")  ");
			}
			if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(dateFrom);
				queryData.append(" AND (ngayguihoso >= '" + ngayNopFrom + "' OR ngayguihoso IS NULL)");
			}
			
			if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(dateTo);
				queryData.append(" AND (ngayguihoso <= '" + ngayNopTo + "' OR ngayguihoso IS NULL)");
			}
			
			if (organizationId > 0) {
				queryData.append(" AND tochucquanly = "+organizationId);
			}
			if (year > 0) {
				queryData.append(" AND YEAR(ngayguihoso) =  "+year);
			}								
			
			
			
			StringBuilder queryDmDataItem = new StringBuilder();
			if (Validator.isNotNull(tinhThanh) && tinhThanh.trim().length() > 0) {
				queryDmDataItem.append("SELECT code_0 FROM dm_dataitem WHERE ");
				queryDmDataItem.append(" code_0 = '" + tinhThanh + "' AND ");
				queryDmDataItem.append(" level = '1' AND datagroupid in (SELECT code FROM dm_datagroup where name = '" + DanhMucKey.ADMINISTRATIVE_UNITS + "')");
			}
			
			if(queryDmDataItem.toString()!=null&&queryDmDataItem.toString().length()>2){
				queryData.append(" and inspectionprovincecode in (" + queryDmDataItem.toString() +")");
			}
			
			
			int count = end - start;
			String sql=queryData.toString();
			sql =sql+" and corporationid in (select corporationid from dkvn_nghiepvu.vr_corporation_view where isleader =1 and inspectorid= "+userId+" )";
			if (start >= 0) {
				sql = sql + " limit " + start + ", " + count;
			}
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(PhanCongDonViKiemTraImpl.TABLE_NAME, PhanCongDonViKiemTraImpl.class);
			
			_log.debug("===searchPhanCongKiemTraKiemTraHienTruong==="+sql);

			QueryPos qPos = QueryPos.getInstance(q);
			
			return (List<PhanCongDonViKiemTra>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<PhanCongDonViKiemTra>();
	}
	
	@Deprecated
	public long countPhanCongKiemTraHienTruong(
		String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
		String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia,long userId) {
		Session session = null;
		try {
			session = openSession();
			//tthc_hosothutuc.id  quan he 1 - 1 voi phieuxulychinhid.id
			StringBuilder queryData = new StringBuilder("SELECT count(*) as total FROM view_phancongdonvikiemtra WHERE 1=1 ");
			
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				queryData.append(" AND thutuchanhchinhid = "+thuTucHanhChinhId);
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				queryData.append(" AND maSoHoSo = '"+maSoHoSo+"'");
			}
			if (Validator.isNotNull(maSoBienNhan) && maSoBienNhan.trim().length() > 0) {
				queryData.append(" AND mabiennhan = '" + maSoBienNhan+"' ");
			}
			if (phanNhomHoSoId > 0) {
				queryData.append(" AND phannhomhosoid = "+phanNhomHoSoId);
			}
			if (Validator.isNotNull(nhomPhieuXuLy) && nhomPhieuXuLy.trim().length() > 0) {
				queryData.append(" AND nhomphieuxuly in( "+nhomPhieuXuLy+")  ");
			}
			if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(dateFrom);
				queryData.append(" AND (ngayguihoso >= '" + ngayNopFrom + "' OR ngayguihoso IS NULL)");
			}
			
			if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(dateTo);
				queryData.append(" AND (ngayguihoso <= '" + ngayNopTo + "' OR ngayguihoso IS NULL)");
			}
			
			if (organizationId > 0) {
				queryData.append(" AND tochucquanly = "+organizationId);
			}
			if (year > 0) {
				queryData.append(" AND YEAR(ngayguihoso) =  "+year);
			}				
							
			
			StringBuilder queryDmDataItem = new StringBuilder();
			if (Validator.isNotNull(tinhThanh) && tinhThanh.trim().length() > 0) {
				queryDmDataItem.append("SELECT code_0 FROM dkvn_thutuchanhchinh.dm_dataitem WHERE ");
				queryDmDataItem.append(" code_0 = '" + tinhThanh + "' AND ");
				queryDmDataItem.append(" level = '1' AND datagroupid in (SELECT code FROM dkvn_thutuchanhchinh.dm_datagroup where name = '" + DanhMucKey.ADMINISTRATIVE_UNITS + "')");
			}
			
			if(queryDmDataItem.toString()!=null&&queryDmDataItem.toString().length()>2){
				queryData.append(" and inspectionprovincecode in (" + queryDmDataItem.toString() +")");
			}
			
			
			//int count = end - start;
			String sql=queryData.toString();
			sql =sql+" and corporationid in (select corporationid from dkvn_nghiepvu.vr_corporation_view where isleader =1 and inspectorid= "+userId+" )";

			_log.debug("===countPhanCongKiemTraHienTruong==="+sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			QueryPos qPos = QueryPos.getInstance(q);

			
//				QueryPos qPos = QueryPos.getInstance(q);
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long toal = itr.next();
				if (toal != null) { return toal.intValue(); }
			}
			return 0;
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
	
	@Deprecated
	public List<PhanCongDonViKiemTra> searchLichKiemTraHienTruong(
		String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
		String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia,long userId, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			//tthc_hosothutuc.id  quan he 1 - 1 voi phieuxulychinhid.id
			StringBuilder queryData = new StringBuilder("SELECT * FROM view_phancongdonvikiemtra WHERE 1=1 ");
			
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				queryData.append(" AND thutuchanhchinhid = "+thuTucHanhChinhId);
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				queryData.append(" AND maSoHoSo = '"+maSoHoSo+"'");
			}
			if (Validator.isNotNull(maSoBienNhan) && maSoBienNhan.trim().length() > 0) {
				queryData.append(" AND mabiennhan = '" + maSoBienNhan+"' ");
			}
			if (phanNhomHoSoId > 0) {
				queryData.append(" AND phannhomhosoid = "+phanNhomHoSoId);
			}
			if (Validator.isNotNull(nhomPhieuXuLy) && nhomPhieuXuLy.trim().length() > 0) {
				queryData.append(" AND nhomphieuxuly in( "+nhomPhieuXuLy+")  ");
			}
			if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(dateFrom);
				queryData.append(" AND (ngayguihoso >= '" + ngayNopFrom + "' OR ngayguihoso IS NULL)");
			}
			
			if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(dateTo);
				queryData.append(" AND (ngayguihoso <= '" + ngayNopTo + "' OR ngayguihoso IS NULL)");
			}
			
			if (organizationId > 0) {
				queryData.append(" AND tochucquanly = "+organizationId);
			}
			if (year > 0) {
				queryData.append(" AND YEAR(ngayguihoso) =  "+year);
			}								
			
			
			
			StringBuilder queryDmDataItem = new StringBuilder();
			if (Validator.isNotNull(tinhThanh) && tinhThanh.trim().length() > 0) {
				queryDmDataItem.append("SELECT code_0 FROM dm_dataitem WHERE ");
				queryDmDataItem.append(" code_0 = '" + tinhThanh + "' AND ");
				queryDmDataItem.append(" level = '1' AND datagroupid in (SELECT code FROM dm_datagroup where name = '" + DanhMucKey.ADMINISTRATIVE_UNITS + "')");
			}
			
			if(queryDmDataItem.toString()!=null&&queryDmDataItem.toString().length()>2){
				queryData.append(" and inspectionprovincecode in (" + queryDmDataItem.toString() +")");
			}
			
			
			int count = end - start;
			
			String sql1 =queryData.toString() ;
			sql1 =sql1+" and corporationid in (select corporationid from dkvn_nghiepvu.vr_corporation_view where isleader =1 and inspectorid= "+userId+" )";
			
			
			String sql2 =queryData.toString() ;
			sql2 =sql2+" and corporationid in (select corporationid from dkvn_nghiepvu.vr_corporation_view where isleader =0 and inspectorid= "+userId+" )";				
			sql2 =sql2 +" and inspectorid= "+userId;
			String sql=   sql1 +"  union  " + sql2 ;
			sql="select  DISTINCT {dakiemtra.*} from (  "+sql+"  ) as dakiemtra "+"  order by ngaytaophieu asc";
			
			if (start >= 0) {
				sql = sql + " limit " + start + ", " + count;
			}
			
			_log.debug("===searchLichKiemTraHienTruong==="+sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("dakiemtra", PhanCongDonViKiemTraImpl.class);
			


			QueryPos qPos = QueryPos.getInstance(q);
			
			return (List<PhanCongDonViKiemTra>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<PhanCongDonViKiemTra>();
	}
	
	@Deprecated
	public long countLichKiemTraHienTruong1(
		String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
		String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia,long userId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder queryData = new StringBuilder("SELECT  DISTINCT * FROM view_phancongdonvikiemtra WHERE 1=1 ");
			
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				queryData.append(" AND thutuchanhchinhid = "+thuTucHanhChinhId);
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				queryData.append(" AND maSoHoSo = '"+maSoHoSo+"'");
			}
			if (Validator.isNotNull(maSoBienNhan) && maSoBienNhan.trim().length() > 0) {
				queryData.append(" AND mabiennhan = '" + maSoBienNhan+"' ");
			}
			if (phanNhomHoSoId > 0) {
				queryData.append(" AND phannhomhosoid = "+phanNhomHoSoId);
			}
			if (Validator.isNotNull(nhomPhieuXuLy) && nhomPhieuXuLy.trim().length() > 0) {
				queryData.append(" AND nhomphieuxuly in( "+nhomPhieuXuLy+")  ");
			}
			if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(dateFrom);
				queryData.append(" AND (ngayguihoso >= '" + ngayNopFrom + "' OR ngayguihoso IS NULL)");
			}
			
			if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(dateTo);
				queryData.append(" AND (ngayguihoso <= '" + ngayNopTo + "' OR ngayguihoso IS NULL)");
			}
			
			if (organizationId > 0) {
				queryData.append(" AND tochucquanly = "+organizationId);
			}
			if (year > 0) {
				queryData.append(" AND YEAR(ngayguihoso) =  "+year);
			}				
							
			
			StringBuilder queryDmDataItem = new StringBuilder();
			if (Validator.isNotNull(tinhThanh) && tinhThanh.trim().length() > 0) {
				queryDmDataItem.append("SELECT code_0 FROM dkvn_thutuchanhchinh.dm_dataitem WHERE ");
				queryDmDataItem.append(" code_0 = '" + tinhThanh + "' AND ");
				queryDmDataItem.append(" level = '1' AND datagroupid in (SELECT code FROM dkvn_thutuchanhchinh.dm_datagroup where name = '" + DanhMucKey.ADMINISTRATIVE_UNITS + "')");
			}
			
			if(queryDmDataItem.toString()!=null&&queryDmDataItem.toString().length()>2){
				queryData.append(" and inspectionprovincecode in (" + queryDmDataItem.toString() +")");
			}
			
			String sql1 =queryData.toString() ;
			sql1 =sql1+" and corporationid in (select corporationid from dkvn_nghiepvu.vr_corporation_view where isleader =1 and inspectorid= "+userId+" )";
			
			
			String sql2 =queryData.toString() ;
			sql2 =sql2+" and corporationid in (select corporationid from dkvn_nghiepvu.vr_corporation_view where isleader =0 and inspectorid= "+userId+" )";				
			sql2 =sql2 +" and inspectorid= "+userId;
			String sql=   sql1 +"  union  " + sql2 ;
			sql="select count( DISTINCT dakiemtra.id) as total from (  "+sql+"  ) as dakiemtra ";

			_log.debug("===countLichKiemTraHienTruong==="+sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);

			QueryPos qPos = QueryPos.getInstance(q);

			
//				QueryPos qPos = QueryPos.getInstance(q);
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long toal = itr.next();
				if (toal != null) { return toal.intValue(); }
			}
			return 0;
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
}
