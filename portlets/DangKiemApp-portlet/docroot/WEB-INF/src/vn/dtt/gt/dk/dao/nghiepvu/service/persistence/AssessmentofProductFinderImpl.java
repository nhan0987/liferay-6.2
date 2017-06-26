
package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterImpl;
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

public class AssessmentofProductFinderImpl extends BasePersistenceImpl<AssessmentofProduct> implements AssessmentofProductFinder {
	
	private Log _log = LogFactoryUtil.getLog(AssessmentofProductFinderImpl.class);
	
	public List<AssessmentofProduct> findDanhSachDanhGiaSanPham(String productcode, String productname, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			String sql =
				"SELECT {vr_assessmentofproduct.*} FROM vr_assessmentofproduct where (productcode IS NOT NULL AND LENGTH(productcode) > 0) AND (productname IS NOT NULL AND LENGTH(productname) > 0)  ";
			if (Validator.isNotNull(productcode) && productcode.trim().length() > 0) {
				sql += " AND  productcode like  '%" + productcode + "%'";
			}
			if (Validator.isNotNull(productname) && productname.trim().length() > 0) {
				sql += " AND  productname like   '%" + productname + "%'";
			}
			
			

			
			int count = end-start;
			if(start>=0){
				sql=sql+ " limit "+start+","+count;
			}			
			SQLQuery q = session.createSQLQuery(sql);
			_log.info("========findDanhSachDanhGiaSanPham====="+sql);
			q.setCacheable(false);
			q.addEntity(AssessmentofProductImpl.TABLE_NAME, AssessmentofProductImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			return (List<AssessmentofProduct>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<AssessmentofProduct>();
	}
	public int countDanhSachDanhGiaSanPham(String productcode, String productname) throws SystemException {
		
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder("SELECT count(*) as total FROM vr_assessmentofproduct where (productcode IS NOT NULL AND LENGTH(productcode) > 0) AND (productname IS NOT NULL AND LENGTH(productname) > 0)  " );
			if (Validator.isNotNull(productcode) && productcode.trim().length() > 0) {
				query.append(" AND  productcode like  '%" + productcode + "%'");
			}
			if (Validator.isNotNull(productname) && productname.trim().length() > 0) {
				query.append(" AND  productname like   '%" + productname + "%'");
			}
			
			SQLQuery q = session.createSQLQuery(query.toString());
			_log.info("========countDanhSachDanhGiaSanPham====="+query.toString());
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
