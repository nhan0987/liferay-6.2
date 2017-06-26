
package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductImpl;

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

public class AssessmentofInspectorFinderImpl extends BasePersistenceImpl<AssessmentofInspector> implements AssessmentofInspectorFinder {
	
	private Log _log = LogFactoryUtil.getLog(AssessmentofInspectorFinderImpl.class);
	
	
	public List<AssessmentofInspector> findDanhSachDanhGiaDangKiemVien(String inspectorcontactcode, String inspectorname, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			String sql =
				"SELECT {vr_assessmentofinspector.*} FROM vr_assessmentofinspector where (inspectorcontactcode IS NOT NULL AND LENGTH(inspectorcontactcode) > 0) AND (inspectorname IS NOT NULL AND LENGTH(inspectorname) > 0)  ";
			if (Validator.isNotNull(inspectorcontactcode) && inspectorcontactcode.trim().length() > 0) {
				sql += " AND  inspectorcontactcode like  '%" + inspectorcontactcode + "%'";
			}
			if (Validator.isNotNull(inspectorname) && inspectorname.trim().length() > 0) {
				sql += " AND  inspectorname like   '%" + inspectorname + "%'";
			}
			
			

			
			int count = end-start;
			if(start>=0){
				sql=sql+ " limit "+start+","+count;
			}			
			SQLQuery q = session.createSQLQuery(sql);
			_log.info("========findDanhSachDanhGiaDangKiemVien====="+sql);
			q.setCacheable(false);
			q.addEntity(AssessmentofInspectorImpl.TABLE_NAME, AssessmentofInspectorImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			return (List<AssessmentofInspector>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<AssessmentofInspector>();
	}
	public int countDanhSachDanhGiaDangKiemVien(String inspectorcontactcode, String inspectorname) throws SystemException {
		
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder("SELECT count(*) as total FROM vr_assessmentofinspector where (inspectorcontactcode IS NOT NULL AND LENGTH(inspectorcontactcode) > 0) AND (inspectorname IS NOT NULL AND LENGTH(inspectorname) > 0)  " );
			if (Validator.isNotNull(inspectorcontactcode) && inspectorcontactcode.trim().length() > 0) {
				query.append(" AND  inspectorcontactcode like  '%" + inspectorcontactcode + "%'");
			}
			if (Validator.isNotNull(inspectorname) && inspectorname.trim().length() > 0) {
				query.append(" AND  inspectorname like   '%" + inspectorname + "%'");
			}
			
			SQLQuery q = session.createSQLQuery(query.toString());
			_log.info("========countDanhSachDanhGiaDangKiemVien====="+query.toString());
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
