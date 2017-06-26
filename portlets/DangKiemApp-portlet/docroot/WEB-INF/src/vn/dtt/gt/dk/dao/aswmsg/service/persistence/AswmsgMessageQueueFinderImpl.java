package vn.dtt.gt.dk.dao.aswmsg.service.persistence;

import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueImpl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class AswmsgMessageQueueFinderImpl  extends BasePersistenceImpl<AswmsgMessageQueue> implements AswmsgMessageQueueFinder {
	private static Log log = LogFactoryUtil.getLog(AswmsgMessageQueueFinderImpl.class);
	
	public List<AswmsgMessageQueue> getListMessage2Queue(int count){
		Session session = null;
		try {
			session = openSession();
			
			String sql = "SELECT {aswmsg_messagequeue.*} FROM aswmsg_messagequeue where priority > 0 order by priority desc, id asc " ;
			
			log.info("=========getListMessage2Queue===" + sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(AswmsgMessageQueueImpl.TABLE_NAME, AswmsgMessageQueueImpl.class);
			
			return (List<AswmsgMessageQueue>) QueryUtil.list(q, getDialect(), 0, count);
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
		
	}
	
	public boolean updatePriorityAswmsgMessageQueue(long priority, long id) {
		Session session = null;
		//	List<VehicleRecord> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("UPDATE aswmsg_messagequeue SET priority =   "+priority);
			query.append("  where  id = " + id);
			
			log.debug("=========updatePriorityAswmsgMessageQueue===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.executeUpdate();
			//q.setCacheable(false);
			return true;
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return false;
	}
	
}
