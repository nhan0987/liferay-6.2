
package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectionMethodImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class AssessmentofInspectionMethodFinderImpl extends BasePersistenceImpl<AssessmentofInspectionMethod> implements AssessmentofInspectionMethodFinder {
	
	private static Log _log = LogFactoryUtil.getLog(AssessmentofInspectionMethodFinderImpl.class);
	
	public List<AssessmentofInspectionMethod> findByAssessmentYear_EvaluationPeriod(
			String assessmentyear, String evaluationperiod, int start, int end)
			throws SystemException {
		
		Session session = null;
		
		try {
			session = openSession();
			
			String sql =
				"SELECT {vr_assessmentofinspectionmethod.*} FROM vr_assessmentofinspectionmethod WHERE 1=1 ";
			sql += " AND assessmentyear LIKE ?";
			sql += " AND evaluationperiod LIKE ?";
					
			SQLQuery q = session.createSQLQuery(sql);
			_log.debug("========findByAssessmentYear_EvaluationPeriod====="+sql);
			q.setCacheable(false);
			q.addEntity(AssessmentofInspectionMethodImpl.TABLE_NAME, AssessmentofInspectionMethodImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add("%" + assessmentyear + "%");
			qPos.add("%" + evaluationperiod + "%");
			
			return (List<AssessmentofInspectionMethod>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public int countByAssessmentYear_EvaluationPeriod(String assessmentyear, String evaluationperiod) throws SystemException {
		
		Session session = null;
		try {
			session = openSession();
			
			String sql =
					"SELECT count(*) as COUNT_VALUE FROM vr_assessmentofinspectionmethod WHERE 1=1 ";
				sql += " AND assessmentyear LIKE ?";
				sql += " AND evaluationperiod LIKE ?";
			
			SQLQuery q = session.createSQLQuery(sql);
			
			_log.debug("========countByAssessmentYear_EvaluationPeriod====="+sql);
			
			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add("%" + assessmentyear + "%");
			qPos.add("%" + evaluationperiod + "%");
			
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
	
	public List<AssessmentofInspectionMethod> findByA1Mark_A301Mark(
			double A1Mark, double A301Mark, String assessmentid,
			String assessmentyear, int start, int end)
		throws SystemException {
		
		Session session = null;
		
		try {
			session = openSession();
			
			String sql =
				"SELECT {vr_assessmentofinspectionmethod.*} FROM vr_assessmentofinspectionmethod WHERE 1=1 ";
			sql += " AND (assessmentid = ?)";
			sql += " AND (assessmentyear = ?)";
			
			if(A1Mark > 0) {
				sql += " AND (A1MarkFloor <= " + A1Mark + ")";
				sql += " AND (A1MarkCeil >= " + A1Mark + ")";
			}
			
			if(A301Mark > 0) {
				sql += " AND (A301MarkFloor <= " + A301Mark + ")";
				sql += " AND (A301MarkCeil >= " + A301Mark + ")";
			}
			
			SQLQuery q = session.createSQLQuery(sql);
			_log.info("========findByA1Mark_A301Mark_A302Mark_A304Mark_A303Mark_A305Mark====="+sql);
			q.setCacheable(false);
			q.addEntity(AssessmentofInspectionMethodImpl.TABLE_NAME, AssessmentofInspectionMethodImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(assessmentid);
			qPos.add(assessmentyear);
			
			return (List<AssessmentofInspectionMethod>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public int countByA1Mark_A301Mark(double A1Mark, double A301Mark,
			String assessmentid, String assessmentyear) 
		throws SystemException {
		
		Session session = null;
		try {
			session = openSession();
			
			String sql =
					"SELECT COUNT(*) AS COUNT_VALUE FROM vr_assessmentofinspectionmethod WHERE 1=1 ";
			sql += " AND (assessmentid = ?)";
			sql += " AND (assessmentyear = ?)";
			
			if(A1Mark > 0) {
				sql += " AND (A1MarkFloor <= " + A1Mark + ")";
				sql += " AND (A1MarkCeil >= " + A1Mark + ")";
			}
			
			if(A301Mark > 0) {
				sql += " AND (A301MarkFloor <= " + A301Mark + ")";
				sql += " AND (A301MarkCeil >= " + A301Mark + ")";
			}
			
			SQLQuery q = session.createSQLQuery(sql);
			
			_log.debug("========countByA1Mark_A301Mark_A302Mark_A304Mark_A303Mark_A305Mark====="+sql);
			
			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(assessmentid);
			qPos.add(assessmentyear);
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
