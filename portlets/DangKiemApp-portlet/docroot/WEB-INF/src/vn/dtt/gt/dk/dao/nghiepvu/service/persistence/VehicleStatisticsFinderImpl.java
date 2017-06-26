package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics;

import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class VehicleStatisticsFinderImpl  extends BasePersistenceImpl<VehicleStatistics> implements VehicleStatisticsFinder {
	
	public boolean deleteVehicleStatisticsWithRegisteredInspectionId(long registeredInspectionId)  {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" delete from vr_vehiclestatistics where registeredinspectionid=" + registeredInspectionId);
			
			//_log.info("=========deleteVehicleGroupWithRegisteredInspectionId===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.executeUpdate();
			return true;
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return false;
	}
	
	private static Log _log = LogFactoryUtil.getLog(VehicleStatisticsFinderImpl.class);
}
