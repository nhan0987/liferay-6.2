
package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;



public class AssessmentPeriodFinderImpl extends BasePersistenceImpl<AssessmentPeriod> implements AssessmentPeriodFinder {
	
	private Log _log = LogFactoryUtil.getLog(AssessmentPeriodFinderImpl.class);
	
	public List<AssessmentPeriod> findDanhSachKehoachdanhgiaruiro(String assessmentyear, String evaluationperiod, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			String sql =
				"SELECT {vr_assessmentperiod.*} FROM vr_assessmentperiod where (assessmentid IS NOT NULL AND LENGTH(assessmentid) > 0) AND (assessmentyear IS NOT NULL AND LENGTH(assessmentyear) > 0)  ";
			sql += " AND  assessmentyear like  '%" + assessmentyear + "%'";
			sql += " AND  evaluationperiod like   '%" + evaluationperiod + "%'";
			int count = end-start;
			if(start>=0){
				sql=sql+ " limit "+start+","+count;
			}			
			SQLQuery q = session.createSQLQuery(sql);
			_log.info("========findDanhSachKehoachDanhgiaruiro====="+sql);
			q.setCacheable(false);
			q.addEntity(AssessmentPeriodImpl.TABLE_NAME, AssessmentPeriodImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			return (List<AssessmentPeriod>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<AssessmentPeriod>();
	}
public int countDanhSachKehoachdanhgiaruiro(String assessmentyear, String evaluationperiod) throws SystemException {
		
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder("SELECT count(*) as total FROM vr_assessmentperiod where (assessmentid IS NOT NULL AND LENGTH(assessmentid) > 0) AND (assessmentyear IS NOT NULL AND LENGTH(assessmentyear) > 0)" );
			if (Validator.isNotNull(assessmentyear) && assessmentyear.trim().length() > 0) {
				query.append(" AND  assessmentyear like  '%" + assessmentyear + "%'");
			}
			if (Validator.isNotNull(evaluationperiod) && evaluationperiod.trim().length() > 0) {
				query.append(" AND  evaluationperiod like   '%" + evaluationperiod + "%'");
			}
			
			SQLQuery q = session.createSQLQuery(query.toString());
			_log.info("========countDanhSachKehoachDanhgiaruiro====="+query.toString());
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
	
	public AssessmentPeriod findLatestAssessmentPeriod() throws SystemException {
		Session session = null;
		
		try {
			session = openSession();
			
			String sql = "SELECT {vr_assessmentperiod.*} FROM vr_assessmentperiod ORDER BY ID DESC LIMIT 1";
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(AssessmentPeriodImpl.TABLE_NAME, AssessmentPeriodImpl.class);
			
			Iterator itr = q.iterate();
			
			if(itr.hasNext()) {
				AssessmentPeriod assessmentPeriod = (AssessmentPeriod)itr.next();
				
				if(assessmentPeriod != null) {
					return assessmentPeriod;
				}
			}
			
			return null;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}
