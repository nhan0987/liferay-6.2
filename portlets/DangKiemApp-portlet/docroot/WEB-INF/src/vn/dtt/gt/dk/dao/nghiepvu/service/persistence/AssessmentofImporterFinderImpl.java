
package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterImpl;

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

public class AssessmentofImporterFinderImpl extends BasePersistenceImpl<AssessmentofImporter> implements AssessmentofImporterFinder {
	
	private Log _log = LogFactoryUtil.getLog(AssessmentofImporterFinderImpl.class);
	
	public List<AssessmentofImporter> findDanhSachDanhGiaDoanhNghiep(String importercode, String importername, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			String sql =
				"SELECT {vr_assessmentofimporter.*} FROM vr_assessmentofimporter where (importercode IS NOT NULL AND LENGTH(importercode) > 0) AND (importername IS NOT NULL AND LENGTH(importername) > 0)  ";
			if (Validator.isNotNull(importercode) && importercode.trim().length() > 0) {
				sql += " AND  importercode like  '%" + importercode + "%'";
			}
			if (Validator.isNotNull(importername) && importername.trim().length() > 0) {
				sql += " AND  importername like   '%" + importername + "%'";
			}
			
			int count = end-start;
			if(start>=0){
				sql=sql+ " limit "+start+","+count;
			}			
			SQLQuery q = session.createSQLQuery(sql);
			_log.info("========findDanhSachDanhGiaDoanhNghiep====="+sql);
			q.setCacheable(false);
			q.addEntity(AssessmentofImporterImpl.TABLE_NAME, AssessmentofImporterImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			return (List<AssessmentofImporter>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<AssessmentofImporter>();
	}
	
	public int countDanhSachDanhGiaDoanhNghiep(String importercode, String importername) throws SystemException {
		
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder("SELECT count(*) as total FROM vr_assessmentofimporter where (importercode IS NOT NULL AND LENGTH(importercode) > 0) AND (importername IS NOT NULL AND LENGTH(importername) > 0)  " );
			if (Validator.isNotNull(importercode) && importercode.trim().length() > 0) {
				query.append(" AND  importercode like  '%" + importercode + "%'");
			}
			if (Validator.isNotNull(importername) && importername.trim().length() > 0) {
				query.append(" AND  importername like   '%" + importername + "%'");
			}
			
			SQLQuery q = session.createSQLQuery(query.toString());
			_log.info("========countDanhSachDanhGiaDoanhNghiep====="+query.toString());
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
	
	public List<AssessmentofImporter> findByIC_IN_AI_AY(String importercode,
			String importername, String assessmentid, String assessmentyear,
			int start, int end) throws SystemException {
		
		Session session = null;
		
		try {
			session = openSession();
			
			String sql = "SELECT {vr_assessmentofimporter.*} FROM vr_assessmentofimporter where 1 = 1 ";
			
			if (Validator.isNotNull(importercode)) {
				sql += " AND importercode LIKE ? ";
			}
			
			if (Validator.isNotNull(importername)) {
				sql += " AND importername LIKE ? ";
			}
			
			if (Validator.isNotNull(assessmentid)) {
				sql += " AND assessmentid = ? ";
			}
			
			if (Validator.isNotNull(assessmentyear)) {
				sql += " AND assessmentyear = ? ";
			}
			
			SQLQuery q = session.createSQLQuery(sql);
			_log.debug("========findByIC_IN_AI_AY====="+sql);
			q.setCacheable(false);
			q.addEntity(AssessmentofImporterImpl.TABLE_NAME, AssessmentofImporterImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(importercode)) {
				qPos.add("%" + importercode + "%");
			}
			
			if (Validator.isNotNull(importername)) {
				qPos.add("%" + importername + "%");
			}
			
			if (Validator.isNotNull(assessmentid)) {
				qPos.add(assessmentid);
			}
			
			if (Validator.isNotNull(assessmentyear)) {
				qPos.add(assessmentyear);
			}
			
			return (List<AssessmentofImporter>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public int countByIC_IN_AI_AY(String importercode, String importername,
			String assessmentid, String assessmentyear) throws SystemException {
		
		Session session = null;
		
		try {
			session = openSession();
			
			String sql = "SELECT COUNT(*) AS COUNT_VALUE FROM vr_assessmentofimporter where 1 = 1 ";
			
			if (Validator.isNotNull(importercode)) {
				sql += " AND importercode LIKE ? ";
			}
			
			if (Validator.isNotNull(importername)) {
				sql += " AND importername LIKE ? ";
			}
			
			if (Validator.isNotNull(assessmentid)) {
				sql += " AND assessmentid = ? ";
			}
			
			if (Validator.isNotNull(assessmentyear)) {
				sql += " AND assessmentyear = ? ";
			}
			
			SQLQuery q = session.createSQLQuery(sql);
			_log.debug("========countByIC_IN_AI_AY=====" + sql);
			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(importercode)) {
				qPos.add("%" + importercode + "%");
			}
			
			if (Validator.isNotNull(importername)) {
				qPos.add("%" + importername + "%");
			}
			
			if (Validator.isNotNull(assessmentid)) {
				qPos.add(assessmentid);
			}
			
			if (Validator.isNotNull(assessmentyear)) {
				qPos.add(assessmentyear);
			}
			
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
}
