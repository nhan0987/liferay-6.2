package vn.dtt.gt.dk.dao.aswmsg.service.persistence;

import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.MonitorMessageQueueImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class MonitorMessageQueueFinderImpl extends BasePersistenceImpl<MonitorMessageQueue> implements MonitorMessageQueueFinder {
	
	private Log log = LogFactoryUtil.getLog(MonitorMessageQueueFinderImpl.class);
	
	public List<MonitorMessageQueue> findMonitorMessageQueue() {
		Session session = null;
		
		try {
			session = openSession();
			
			String sql = "SELECT {aswmsg_messagequeue.*} FROM aswmsg_messagequeue order by type desc, function asc ";
			
			log.info("=========findMotCuaPhieuXuLyChinhByHoSoThuTucId===" + sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(MonitorMessageQueueImpl.TABLE_NAME, MonitorMessageQueueImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			return (List<MonitorMessageQueue>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
		
	}
	
	public boolean updatePriorityMessageQueue(long idMonitorMessage) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("UPDATE aswmsg_messagequeue SET solangui = ? and priority = ? ");
			query.append("where id = ?");
			
			log.info("====updatePriorityMessageQueue===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(0);
			qPos.add(15);
			qPos.add(idMonitorMessage);
			
			
			int executeUpdate = q.executeUpdate();
			log.info("updatePriorityMessageQueue--result--" + executeUpdate);
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
