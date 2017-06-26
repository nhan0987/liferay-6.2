package vn.dtt.gt.dk.dao.common.service.persistence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.common.model.DmDataGroup;
import vn.dtt.gt.dk.dao.common.model.impl.DmDataGroupImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;


public class DmDataGroupFinderImpl extends BasePersistenceImpl<DmDataGroup> implements DmDataGroupFinder {
	
	private Log _log = LogFactoryUtil.getLog(DmDataGroupFinderImpl.class);
	
	public List<DmDataGroup> findDmDataGroupByTenDanhMucTenAnhXa(String tenDanhMuc, String tenAnhXa, int start, int end) {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder("SELECT {dm_datagroup.*} FROM dm_datagroup where 1=1 ");
				
				_log.info("==tenDanhMuc==" + tenDanhMuc + "==tenAnhXa==" + tenAnhXa);
				
				if (Validator.isNotNull(tenDanhMuc) && tenDanhMuc.trim().length() > 0) {
					query.append(" AND description like ").append("'%" + tenDanhMuc.trim() + "%'");
				}
				if (Validator.isNotNull(tenAnhXa) && tenAnhXa.trim().length() > 0) {
					query.append(" AND name like ").append("'%" + tenAnhXa.trim() + "%'");
				}

				SQLQuery q = session.createSQLQuery(query.toString());
				q.setCacheable(false);
				q.addEntity(DmDataGroupImpl.TABLE_NAME, DmDataGroupImpl.class);
				
				QueryPos qPos = QueryPos.getInstance(q);
				
				List<DmDataGroup> list =  (List<DmDataGroup>) QueryUtil.list(q, getDialect(), start, end);

				return list;
				
			} catch (Exception e) {
				_log.error(e);
			} finally {
				closeSession(session);
			}
			
			return new ArrayList<DmDataGroup>();
		}
		
		public int countDmDataGroupByTenDanhMucTenAnhXa(String tenDanhMuc, String tenAnhXa) {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder("SELECT count(*) as total FROM dm_datagroup where 1=1 ");
				
				_log.info("==tenDanhMuc==" + tenDanhMuc + "==tenAnhXa==" + tenAnhXa);
				
				if (Validator.isNotNull(tenDanhMuc) && tenDanhMuc.trim().length() > 0) {
					query.append(" AND description like ").append("'%" + tenDanhMuc.trim() + "%'");
				}
				if (Validator.isNotNull(tenAnhXa) && tenAnhXa.trim().length() > 0) {
					query.append(" AND name like ").append("'%" + tenAnhXa.trim() + "%'");
				}
				
				SQLQuery q = session.createSQLQuery(query.toString());
				q.setCacheable(false);
				q.addScalar("total", Type.LONG);

				QueryPos qPos = QueryPos.getInstance(q);
				
				Iterator<Long> itr = q.list().iterator();
				
				if (itr.hasNext()) {
					Long count = itr.next();

					if (count != null) { return count.intValue(); }
				}
				
			} catch (Exception e) {
				_log.error(e);
			} finally {
				closeSession(session);
			}
			
			return 0;
		}
}
