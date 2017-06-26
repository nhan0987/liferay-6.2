
package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleCertificateImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class AssessmentSpecificationConfigFinderImpl extends BasePersistenceImpl<AssessmentSpecificationConfig> implements AssessmentSpecificationConfigFinder {
	
	private Log _log = LogFactoryUtil.getLog(AssessmentSpecificationConfigFinderImpl.class);
	
public List<AssessmentSpecificationConfig> findAssessmentSpecificationConfigByKehoach(String assessmentid, String assessmentyear) {
		
		Session session = null;
		List<AssessmentSpecificationConfig> result = new ArrayList<AssessmentSpecificationConfig>();
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			query.append("SELECT * FROM dkvn_nghiepvu.vr_assessmentspecificationconfig  WHERE 1=1  ");
			query.append(" AND assessmentid = '" +  assessmentid + "' ");
			query.append(" AND assessmentyear = '" +  assessmentyear + "' ");
			String sql = query + " order by specificationsequence desc";
			_log.info("=========findAssessmentSpecificationConfigByKehoach===" + sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(AssessmentSpecificationConfigImpl.TABLE_NAME, AssessmentSpecificationConfigImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);		
			
			
			
			result = (List<AssessmentSpecificationConfig>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}	
}
