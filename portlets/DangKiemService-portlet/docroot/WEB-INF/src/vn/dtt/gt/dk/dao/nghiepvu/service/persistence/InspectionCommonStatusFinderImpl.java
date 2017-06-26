package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;


public class InspectionCommonStatusFinderImpl extends BasePersistenceImpl<InspectionCommonStatus> implements InspectionCommonStatusFinder{
	
	private Log log = LogFactoryUtil.getLog(InspectionCommonStatusFinderImpl.class);
	
	public List<InspectionCommonStatus> findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(
		String vehicleClass, long type, long inspectionRecordId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT {vr_inspectioncommonstatus.*} FROM vr_inspectioncommonstatus WHERE ");
			query.append("vehicleclass = '" + vehicleClass + "' AND ");
			query.append("type = '" + type + "' AND ");
			query.append("inspectionrecordid = '" + inspectionRecordId + "' ");
			query.append("order by SequenceNo asc");
			
			log.debug("=====InspectionCommonStatus====VehicleClassAndTypeAndInspectionRecordIdOderBySequenceNo===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("vr_inspectioncommonstatus", InspectionCommonStatusImpl.class);
			
			return (List<InspectionCommonStatus>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		return new ArrayList<InspectionCommonStatus>();
	}
}
