package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogImpl;

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

public class ActionLogFinderImpl extends BasePersistenceImpl<ActionLog> implements ActionLogFinder {
	Log _log = LogFactoryUtil.getLog(ActionLogFinderImpl.class);

	public List<ActionLog> findActionLogByDate(String maSoHoSo, String soBBKT, String motaNoiDungThaoTac, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, String tenDangKiemVien, String tenManHinhDaiDien, int start, int end) throws SystemException {
		Session session = null;
		List<ActionLog> lstActionLog = null;
		List<ActionLog> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {vr_action_log.*} FROM vr_action_log ");
			query.append(" WHERE 1=1 ");

			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				query.append(" AND masohoso like  " + "'%" + maSoHoSo + "%'");
			}
			if (Validator.isNotNull(soBBKT) && soBBKT.trim().length() > 0) {
				query.append(" AND mabiennhan like  " + "'%" + soBBKT + "%'");
			}
			if (Validator.isNotNull(motaNoiDungThaoTac) && motaNoiDungThaoTac.trim().length() > 0) {
				query.append(" AND noidungmanhinh like  " + "'%" + motaNoiDungThaoTac + "%'");
			}
			if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(dateFrom);
				query.append(" AND (ngayxemhoso >= '" + ngayNopFrom + "' OR ngayxemhoso IS NULL)");
			}			
			if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(dateTo);
				query.append(" AND (ngayxemhoso <= '" + ngayNopTo + "' OR ngayxemhoso IS NULL)");
			} 
			if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
				query.append(" AND importername like  " + "'%" + tenDoanhNghiep + "%'");
			}
			
			if (Validator.isNotNull(tenDangKiemVien) && tenDangKiemVien.trim().length() > 0) {
				query.append(" AND inspectorname like  " + "'%" + tenDangKiemVien + "%'");
			}
			if (Validator.isNotNull(tenManHinhDaiDien) && tenManHinhDaiDien.trim().length() > 0) {
				query.append(" AND title like  " + "'%" + tenManHinhDaiDien + "%'");
			}

			SQLQuery q = session.createSQLQuery(query.toString());
			_log.info("=======findActionLogByDate==========" + query.toString());

			q.setCacheable(false);
			q.addEntity(ActionLogImpl.TABLE_NAME, ActionLogImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			
			lstActionLog = (List<ActionLog>) QueryUtil.list(q, getDialect(), start, end);

			if (lstActionLog != null && lstActionLog.size() > 0) {
				result = lstActionLog;
			}

		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return result;
	}

	public int countActionLogListByDate(String maSoHoSo, String soBBKT, String motaNoiDungThaoTac, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, String tenDangKiemVien, String tenManHinhDaiDien) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT count(*) as total FROM vr_action_log ");
			query.append(" WHERE 1=1 ");

			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				query.append(" AND masohoso like  " + "'%" + maSoHoSo + "%'");
			}
			if (Validator.isNotNull(soBBKT) && soBBKT.trim().length() > 0) {
				query.append(" AND mabiennhan like  " + "'%" + soBBKT + "%'");
			}
			if (Validator.isNotNull(motaNoiDungThaoTac) && motaNoiDungThaoTac.trim().length() > 0) {
				query.append(" AND noidungmanhinh like  " + "'%" + motaNoiDungThaoTac + "%'");
			}
			if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(dateFrom);
				query.append(" AND (ngayxemhoso >= '" + ngayNopFrom + "' OR ngayxemhoso IS NULL)");
			}			
			if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(dateTo);
				query.append(" AND (ngayxemhoso <= '" + ngayNopTo + "' OR ngayxemhoso IS NULL)");
			} 
			if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
				query.append(" AND importername like  " + "'%" + tenDoanhNghiep + "%'");
			}
			
			if (Validator.isNotNull(tenDangKiemVien) && tenDangKiemVien.trim().length() > 0) {
				query.append(" AND inspectorname like  " + "'%" + tenDangKiemVien + "%'");
			}
			if (Validator.isNotNull(tenManHinhDaiDien) && tenManHinhDaiDien.trim().length() > 0) {
				query.append(" AND title like  " + "'%" + tenManHinhDaiDien + "%'");
			}

			SQLQuery q = session.createSQLQuery(query.toString());
			_log.info("=======countActionLogListByDate==========" + query.toString());

			q.addScalar("total", Type.LONG);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
		

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
}

