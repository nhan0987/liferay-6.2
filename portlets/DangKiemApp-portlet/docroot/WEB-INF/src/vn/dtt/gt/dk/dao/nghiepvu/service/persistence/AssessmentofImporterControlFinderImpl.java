
package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlImpl;

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

public class AssessmentofImporterControlFinderImpl extends BasePersistenceImpl<AssessmentofImporterControl> implements AssessmentofImporterControlFinder {
	
	private Log _log = LogFactoryUtil.getLog(AssessmentofImporterControlFinderImpl.class);
	
	public List<AssessmentofImporterControl> findDanhSachKiemSoatDoanhNghiep(String importercode, String importername, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			String sql =
				"SELECT {vr_assessmentofimportercontrol.*} FROM vr_assessmentofimportercontrol where (importercode IS NOT NULL AND LENGTH(importercode) > 0) AND (importername IS NOT NULL AND LENGTH(importername) > 0)  ";
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
			_log.info("========findDanhSachKiemSoatDoanhNghiep====="+sql);
			q.setCacheable(false);
			q.addEntity(AssessmentofImporterControlImpl.TABLE_NAME, AssessmentofImporterControlImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			return (List<AssessmentofImporterControl>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<AssessmentofImporterControl>();
	}
public int countDanhSachKiemSoatDoanhNghiep(String importercode, String importername) throws SystemException {
		
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder("SELECT count(*) as total FROM vr_assessmentofimportercontrol where (importercode IS NOT NULL AND LENGTH(importercode) > 0) AND (importername IS NOT NULL AND LENGTH(importername) > 0)  " );
			if (Validator.isNotNull(importercode) && importercode.trim().length() > 0) {
				query.append(" AND  importercode like  '%" + importercode + "%'");
			}
			if (Validator.isNotNull(importername) && importername.trim().length() > 0) {
				query.append(" AND  importername like   '%" + importername + "%'");
			}
			
			SQLQuery q = session.createSQLQuery(query.toString());
			_log.info("========countDanhSachKiemSoatDoanhNghiep====="+query.toString());
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
}
