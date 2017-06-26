package vn.dtt.gt.dk.dao.motcua.service.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.motcua.model.DaKiemTra;
import vn.dtt.gt.dk.dao.motcua.model.impl.DaKiemTraImpl;
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

public class DaKiemTraFinderImpl  extends BasePersistenceImpl<DaKiemTra> implements DaKiemTraFinder {
	
	private static Log _log = LogFactoryUtil.getLog(DaKiemTraFinderImpl.class);
	
	public static final String COUNT_MOTCUAPHIEUXULYPHU = DaKiemTraFinder.class.getName() + ".countMotCuaPhieuXuLyPhu";
	
	public static final String FIND_MOTCUAPHIEUXULYPHU = DaKiemTraFinder.class.getName() + ".findMotCuaPhieuXuLyPhu";
	
	public int countByMotCuaPhieuXuLyPhu (
			String doiTuong, String maSoBienNhan, long userid,
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId,
			String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, int year) {
			
		Session session = null;
		
		try {
			
			session = openSession();
			
			String sql = CustomSQLUtil.get(COUNT_MOTCUAPHIEUXULYPHU);
			
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
			
			if(Validator.isNull(doiTuong)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.tendonvitiepnhan = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(ngayNopTo)) {
				sql = StringUtil.replace(sql, "AND (tthc_hosothutuc.ngayguihoso <= ? OR tthc_hosothutuc.ngayguihoso IS NULL)", StringPool.BLANK);
			}
			
			if(Validator.isNull(tenDoanhNghiep)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.tenchuhoso LIKE ?", StringPool.BLANK);
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
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			
			_log.debug("==countByMotCuaPhieuXuLyPhu==" + sql);
			
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
			
			if(Validator.isNotNull(doiTuong)) {
				qPos.add(doiTuong);
			}
			
			if(Validator.isNotNull(ngayNopTo)) {
				Date date = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(date);
				qPos.add(ngayNopTo);
			}
			
			if(Validator.isNotNull(tenDoanhNghiep)) {
				qPos.add("%" + tenDoanhNghiep + "%");
			}
			
			if (organizationId > 0) {
				qPos.add(organizationId);
			}
			
			if (year > 0) {
				qPos.add(year);
			}
			
			qPos.add(userid);
			
			//union
			
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
			
			if(Validator.isNotNull(doiTuong)) {
				qPos.add(doiTuong);
			}
			
			if(Validator.isNotNull(ngayNopTo)) {
				Date date = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(date);
				qPos.add(ngayNopTo);
			}
			
			if(Validator.isNotNull(tenDoanhNghiep)) {
				qPos.add("%" + tenDoanhNghiep + "%");
			}
			
			if (organizationId > 0) {
				qPos.add(organizationId);
			}
			
			if (year > 0) {
				qPos.add(year);
			}
			
			qPos.add(userid);
			qPos.add(userid);

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
	
	public List findByMotCuaPhieuXuLyPhu(
			String doiTuong, String maSoBienNhan, long userid,
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId,
			String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, int year, int start, int end) {
		
		Session session = null;
		
		try {
			session = openSession();
			
			String sql = CustomSQLUtil.get(FIND_MOTCUAPHIEUXULYPHU);
			
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
			
			if(Validator.isNull(doiTuong)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.tendonvitiepnhan = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(ngayNopTo)) {
				sql = StringUtil.replace(sql, "AND (tthc_hosothutuc.ngayguihoso <= ? OR tthc_hosothutuc.ngayguihoso IS NULL)", StringPool.BLANK);
			}
			
			if(Validator.isNull(tenDoanhNghiep)) {
				sql = StringUtil.replace(sql, "AND tthc_hosothutuc.tenchuhoso LIKE ?", StringPool.BLANK);
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
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("DaKiemTra", DaKiemTraImpl.class);
			
			_log.debug("==findByMotCuaPhieuXuLyPhu==" + sql);
			
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
			
			if(Validator.isNotNull(doiTuong)) {
				qPos.add(doiTuong);
			}
			
			if(Validator.isNotNull(ngayNopTo)) {
				Date date = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(date);
				qPos.add(ngayNopTo);
			}
			
			if(Validator.isNotNull(tenDoanhNghiep)) {
				qPos.add("%" + tenDoanhNghiep + "%");
			}
			
			if (organizationId > 0) {
				qPos.add(organizationId);
			}
			
			if (year > 0) {
				qPos.add(year);
			}
			
			qPos.add(userid);
			
			//union
			
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
			
			if(Validator.isNotNull(doiTuong)) {
				qPos.add(doiTuong);
			}
			
			if(Validator.isNotNull(ngayNopTo)) {
				Date date = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(date);
				qPos.add(ngayNopTo);
			}
			
			if(Validator.isNotNull(tenDoanhNghiep)) {
				qPos.add("%" + tenDoanhNghiep + "%");
			}
			
			if (organizationId > 0) {
				qPos.add(organizationId);
			}
			
			if (year > 0) {
				qPos.add(year);
			}
			
			qPos.add(userid);
			qPos.add(userid);
			
			return  QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<>();
	}
	
	@Deprecated
	public List<DaKiemTra> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(
			String doiTuong, String maSoBienNhan, long userid,
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId,
			String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, int year, int start, int end) {
		
		Session session = null;
		
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT distinct * FROM view_dakiemtra WHERE 1=1 ");
			
			if(phanNhomHoSoId>0){
				query.append(" AND phannhomhosoid = "+phanNhomHoSoId);
			}
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				query.append(" AND thutuchanhchinhid = "+thuTucHanhChinhId);
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				query.append(" AND maSoHoSo = '"+maSoHoSo.trim()+"'");
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
				query.append(" AND YEAR(ngayguihoso) =  "+year);
			}
			
			
			if(nhomPhieuXuLy!=null&&nhomPhieuXuLy.length()>0){
				query.append(" AND nhomphieuxuly in ( "+nhomPhieuXuLy+") ");
			}
			
			String sql1 =query.toString() ;
			sql1 =sql1+" and corporationid in (select corporationid from dkvn_nghiepvu.vr_corporation_view where isleader =1 and inspectorid= "+userid+" )";
			
			
			String sql2 =query.toString() ;
			sql2 =sql2+" and corporationid in (select corporationid from dkvn_nghiepvu.vr_corporation_view where isleader =0 and inspectorid= "+userid+" )";				
			sql2 =sql2 +" and inspectorid= "+userid;
			String sql=   sql1 +"  union  " + sql2 ;
			sql="select  DISTINCT {dakiemtra.*} from (  "+sql+"  ) as dakiemtra "+"  order by ngaytaophieu asc";
			int count = end-start;
			if(start>=0){
				sql=sql+ " limit "+start+","+count;
			}
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("dakiemtra", DaKiemTraImpl.class);
			
			_log.debug("==findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra==" + sql);
			QueryPos qPos = QueryPos.getInstance(q);
			
			return (List<DaKiemTra>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DaKiemTra>();
	}

	@Deprecated
	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(
			String doiTuong, String maSoBienNhan, long userid,
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId,
			String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, int year) {
			
		Session session = null;
		
		try {
			
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT distinct id FROM view_dakiemtra WHERE 1=1 ");
			
			if(phanNhomHoSoId>0){
				query.append(" AND phannhomhosoid = "+phanNhomHoSoId);
			}
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				query.append(" AND thutuchanhchinhid = "+thuTucHanhChinhId);
			}
			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				query.append(" AND maSoHoSo = '"+maSoHoSo.trim()+"'");
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
				query.append(" AND YEAR(ngayguihoso) =  "+year);
			}
			
			if(nhomPhieuXuLy!=null&&nhomPhieuXuLy.length()>0){
				query.append(" AND nhomphieuxuly in ( "+nhomPhieuXuLy+") ");
			}
			
			String sql1 =query.toString() ;
			sql1 =sql1+" and corporationid in (select corporationid from dkvn_nghiepvu.vr_corporation_view where isleader =1 and inspectorid= "+userid+" )";
			
			
			String sql2 =query.toString() ;
			sql2 =sql2+" and corporationid in (select corporationid from dkvn_nghiepvu.vr_corporation_view where isleader =0 and inspectorid= "+userid+" )";				
			sql2 =sql2 +" and inspectorid= "+userid;
			String sql=   sql1 +"  union  " + sql2 ;
			sql="select count( DISTINCT dakiemtra.id) as total from (  "+sql+"  ) as dakiemtra ";

			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);
			
			_log.debug("==countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra==" + sql);
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
}
