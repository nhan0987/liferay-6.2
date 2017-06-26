package vn.dtt.gt.dk.dao.motcua.service.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong;
import vn.dtt.gt.dk.dao.motcua.model.impl.LichKiemTraHienTruongImpl;
import vn.dtt.gt.dk.utils.DanhMucKey;
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

public class LichKiemTraHienTruongFinderImpl  extends BasePersistenceImpl<LichKiemTraHienTruong> implements LichKiemTraHienTruongFinder {
	public List<LichKiemTraHienTruong> searchPhanCongDonViKiemTraByHoSoThuTucId(
		String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
		String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia, long userid, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			//tthc_hosothutuc.id  quan he 1 - 1 voi phieuxulychinhid.id
			StringBuilder queryData = new StringBuilder("SELECT {view_lichkiemtrahientruong.*} FROM view_lichkiemtrahientruong WHERE 1=1 ");
			
			if(userid>0){
				queryData.append(" AND inspectorid= "+userid);
			}
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
			
			
			int count = end - start;
			String sql=queryData.toString();
			
			if (start >= 0) {
				sql = sql + " limit " + start + ", " + count;
			}
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(LichKiemTraHienTruongImpl.TABLE_NAME, LichKiemTraHienTruongImpl.class);
			

			QueryPos qPos = QueryPos.getInstance(q);
			

			return (List<LichKiemTraHienTruong>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<LichKiemTraHienTruong>();
	}
	
	public long countPhanCongDonViKiemTraByHoSoThuTucId(
		String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
		String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia,long userid) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder queryData = new StringBuilder("SELECT count(*) as total FROM view_lichkiemtrahientruong WHERE 1=1 ");
			
			if(userid>0){
				
				queryData.append(" AND inspectorid= "+userid);
				
			}
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
			
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);


			QueryPos qPos = QueryPos.getInstance(q);
			
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
	
	private static Log _log = LogFactoryUtil.getLog(LichKiemTraHienTruongFinderImpl.class);


}
