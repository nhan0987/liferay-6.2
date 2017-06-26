package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgLimitTechnicalSpecImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class CfgLimitTechnicalSpecFinderImpl extends BasePersistenceImpl<CfgLimitTechnicalSpec> implements CfgLimitTechnicalSpecFinder {
	
	public static String COUNT_BY_SYNCH_DATE = CfgLimitTechnicalSpecFinder.class.getName() + ".countBySynchDate";
	
	public static String FIND_BY_SYNCH_DATE = CfgLimitTechnicalSpecFinder.class.getName() + ".findBySynchDate";
	
	public int countBySynchDate(String synchDate) 
			throws SystemException {
		
		Session session = null;
		
		try {
			session = openSession();
			
			String sql = CustomSQLUtil.get(COUNT_BY_SYNCH_DATE);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			
			_log.debug("=========findBySynchDate===" + sql);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(synchDate);
			
			Iterator itr = q.iterate();
			
			if(itr.hasNext()) {
				Long count = (Long)itr.next();
				
				if(count != null) {
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
	
	public List<CfgLimitTechnicalSpec> findBySynchDate(String synchDate, int start, int end) 
			throws SystemException {
		
		Session session = null;
		
		try {
			session = openSession();
			
			String sql = CustomSQLUtil.get(FIND_BY_SYNCH_DATE);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(CfgLimitTechnicalSpecImpl.TABLE_NAME, CfgLimitTechnicalSpecImpl.class);
			
			_log.debug("=========findBySynchDate===" + sql);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(synchDate);
			
			return (List<CfgLimitTechnicalSpec>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	private static final Log _log = LogFactoryUtil.getLog(CfgLimitTechnicalSpecFinderImpl.class);
}
