
package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.List;

import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class VehicleGroupFinderImpl extends BasePersistenceImpl<VehicleGroup> implements VehicleGroupFinder {
	
	private Log _log = LogFactoryUtil.getLog(VehicleGroupFinderImpl.class);
	
	public TthcNoidungHoSo getThtcNoiDungHoSoByVehicleGroupId(long vehicleGroupId) {
		Session session = null;
		List<TthcNoidungHoSo> result = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			query.append("SELECT {tthc_noidunghoso.*} FROM dkvn_thutuchanhchinh.tthc_noidunghoso ");
			query.append("WHERE id in ");
			query.append("(");
			query.append("SELECT attachedfile FROM dkvn_nghiepvu.vr_vehiclegroup WHERE id = ?");
			query.append(")");
			
			_log.debug("=========getThtcNoiDungHoSoByVehicleGroupId===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(TthcNoidungHoSoImpl.TABLE_NAME, TthcNoidungHoSoImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(vehicleGroupId);
			
			result = (List<TthcNoidungHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
			if (result != null && result.size() > 0) { return result.get(0); }
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	
	public boolean deleteVehicleGroupWithRegisteredInspectionId(long registeredInspectionId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" delete from vr_vehiclegroup where registeredinspectionid= " + registeredInspectionId);
			
			_log.info("=========deleteVehicleGroupWithRegisteredInspectionId===" + query.toString());
			
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
	public List<VehicleGroup> findByIdHoSoThuTuc(long idHoSoThuTuc) {
		Session session = null;
		List<VehicleGroup> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {vr_vehiclegroup.*} FROM vr_vehiclegroup");
			query.append(" INNER JOIN vr_registeredinspection on vr_registeredinspection.id = vr_vehiclegroup.registeredinspectionid ");
			query.append(" and vr_registeredinspection.dossierid = " + idHoSoThuTuc);
			query.append(" order by vr_vehiclegroup.id asc");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehicleGroupImpl.TABLE_NAME, VehicleGroupImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			result = (List<VehicleGroup>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		}catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return result;
	}
}
