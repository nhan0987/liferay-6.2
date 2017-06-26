package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingImpl;

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

public class IssueTrackingFinderImpl extends BasePersistenceImpl<IssueTracking> implements IssueTrackingFinder {
	Log _log = LogFactoryUtil.getLog(IssueTrackingFinderImpl.class);

	public List<IssueTracking> findIssueTrackingByDate(String maSoHoSo, String soBBKT, String motaNoiDungLoi, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, String tenSanPham, int start, int end) throws SystemException {
		Session session = null;
		List<IssueTracking> lstIssueTracking = null;
		List<IssueTracking> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {vr_assessmentissuetracking.*} FROM vr_assessmentissuetracking ");
			query.append(" WHERE 1=1 ");

			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				query.append(" AND registerednumber like  " + "'%" + maSoHoSo + "%'");
			}
			if (Validator.isNotNull(soBBKT) && soBBKT.trim().length() > 0) {
				query.append(" AND inspectionrecordno like  " + "'%" + soBBKT + "%'");
			}
			if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(dateFrom);
				query.append(" AND (createddate >= '" + ngayNopFrom + "' OR createddate IS NULL)");
			}
			
			if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(dateTo);
				query.append(" AND (createddate <= '" + ngayNopTo + "' OR createddate IS NULL)");
			} 
			if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
				query.append(" AND importername like  " + "'%" + tenDoanhNghiep + "%'");
			}
			if (Validator.isNotNull(motaNoiDungLoi) && motaNoiDungLoi.trim().length() > 0) {
				query.append(" AND issuedescription like  " + "'%" + motaNoiDungLoi + "%'");
			}
			if (Validator.isNotNull(tenSanPham) && tenSanPham.trim().length() > 0) {
				query.append(" AND productname like  " + "'%" + tenSanPham + "%'");
			}

			SQLQuery q = session.createSQLQuery(query.toString());
			_log.info("=======findIssueTrackingByDate==========" + query.toString());

			q.setCacheable(false);
			q.addEntity(IssueTrackingImpl.TABLE_NAME, IssueTrackingImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			
			lstIssueTracking = (List<IssueTracking>) QueryUtil.list(q, getDialect(), start, end);

			if (lstIssueTracking != null && lstIssueTracking.size() > 0) {
				result = lstIssueTracking;
			}

		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return result;
	}

	public int countIssueTrackingListByDate(String maSoHoSo, String soBBKT, String motaNoiDungLoi, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, String tenSanPham) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT count(*) as total FROM vr_assessmentissuetracking ");
			query.append(" WHERE 1=1 ");

			if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
				query.append(" AND registerednumber like  " + "'%" + maSoHoSo + "%'");
			}
			if (Validator.isNotNull(soBBKT) && soBBKT.trim().length() > 0) {
				query.append(" AND inspectionrecordno like  " + "'%" + soBBKT + "%'");
			}
			if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(dateFrom);
				query.append(" AND (createddate >= '" + ngayNopFrom + "' OR createddate IS NULL)");
			}
			
			if (Validator.isNotNull(ngayNopTo) && ngayNopTo.trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(ngayNopTo.trim());
				ngayNopTo = FormatData.parseDateToTring(dateTo);
				query.append(" AND (createddate <= '" + ngayNopTo + "' OR createddate IS NULL)");
			} 
			if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
				query.append(" AND importername like  " + "'%" + tenDoanhNghiep + "%'");
			}
			if (Validator.isNotNull(motaNoiDungLoi) && motaNoiDungLoi.trim().length() > 0) {
				query.append(" AND issuedescription like  " + "'%" + motaNoiDungLoi + "%'");
			}
			if (Validator.isNotNull(tenSanPham) && tenSanPham.trim().length() > 0) {
				query.append(" AND productname like  " + "'%" + tenSanPham + "%'");
			}

			SQLQuery q = session.createSQLQuery(query.toString());
			_log.info("=======findIssueTrackingByDate==========" + query.toString());

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

