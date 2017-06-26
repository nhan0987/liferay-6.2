package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class VehicleSpecificationFinderImpl  extends BasePersistenceImpl<VehicleSpecification> implements VehicleSpecificationFinder {

	private static Log _log = LogFactoryUtil.getLog(VehicleSpecificationFinderImpl.class);

	public List<VehicleSpecification> finderVehicleSpecificationWithVehicleGroupId(long vehiclegroupid) {
		Session session = null;
		List<VehicleSpecification> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select {vr_vehiclespecification.*} from vr_vehiclespecification,vr_cfg_technicalspec ");
			query.append(" where   vr_vehiclespecification.vehiclegroupid=? and vr_vehiclespecification.specificationcode = vr_cfg_technicalspec.specificationcode");
			query.append(" order by vr_cfg_technicalspec.sequenceno asc ;");

			_log.debug("=========findDanhSachHoSoMotCuaPhieuXuLyPhu===" + query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehicleSpecificationImpl.TABLE_NAME, VehicleSpecificationImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(vehiclegroupid);
			result = (List<VehicleSpecification>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}

	public List<VehicleSpecification> findByVehicleSpecificationWithVehicleGroupIdAndVehicleTypeCode(long vehiclegroupid, String vehicleClass, String vehicleType) {
		Session session = null;
		List<VehicleSpecification> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" (SELECT DISTINCT vr_cfg_technicalspec.id,vr_vehiclespecification.vehiclegroupid,vr_vehiclespecification.specificationversion,");
			query.append(" vr_vehiclespecification.specificationsourcecode, vr_cfg_technicalspec.specificationcode,vr_cfg_technicalspec.spec_description AS specificationname,");
			query.append(" vr_vehiclespecification.specificationvalue, vr_vehiclespecification.safetytestreportid, vr_vehiclespecification.inspectionrecordid,");
			query.append(" vr_vehiclespecification.specificresult");
			query.append(" FROM vr_cfg_technicalspec LEFT JOIN vr_vehiclespecification ");
			query.append(" ON vr_cfg_technicalspec.specificationcode =vr_vehiclespecification.specificationcode AND vr_vehiclespecification.vehiclegroupid = " + vehiclegroupid );
			query.append(" WHERE vr_cfg_technicalspec.vehicletypecode= '" + vehicleClass + "' ORDER BY vr_cfg_technicalspec.sequenceno ASC ,  vr_cfg_technicalspec.id ASC)");
			
			if (Validator.isNotNull(vehicleClass) && vehicleClass.trim().equalsIgnoreCase("XCD")) {
				query.append(" UNION ( SELECT DISTINCT  vr_cfg_technicalspec.id,vr_vehiclespecification.vehiclegroupid,vr_vehiclespecification.specificationversion,");
				query.append(" vr_vehiclespecification.specificationsourcecode, vr_cfg_technicalspec.specificationcode,vr_cfg_technicalspec.spec_description AS specificationname,");
				query.append(" vr_vehiclespecification.specificationvalue, vr_vehiclespecification.safetytestreportid, vr_vehiclespecification.inspectionrecordid,");
				query.append(" vr_vehiclespecification.specificresult FROM vr_cfg_technicalspec  LEFT JOIN vr_vehiclespecification ");
				query.append(" ON vr_cfg_technicalspec.specificationcode =vr_vehiclespecification.specificationcode AND vr_vehiclespecification.vehiclegroupid = " + vehiclegroupid );
				query.append(" WHERE vehicletypecode = '" + vehicleType + "' ORDER BY vr_cfg_technicalspec.sequenceno ASC , vr_cfg_technicalspec.id ASC);");
			} 
		
			_log.debug("=========findByVehicleSpecificationWithVehicleGroupIdAndVehicleTypeCode===" + query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("VehicleSpecification", VehicleSpecificationImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			result = (List<VehicleSpecification>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}
	
	/**
	 * Ham hien tai chi su dung voi vehicleClass=XCG
	 * 
	 * @param vehicleGroupId
	 * @param vehicleClass
	 * @param vehicleType
	 * @param vehicleTypeCode
	 * @param specCategory
	 * @param congThucBanhXeId
	 * @return
	 */
	public List<VehicleSpecification> findByVehicleSpecificationWithVehicleGroupIdAndVehicleTypeCode(long vehicleGroupId, String vehicleClass, String vehicleType, String vehicleTypeCode, String specCategory, long congThucBanhXeId) {
		Session session = null;
		List<VehicleSpecification> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" (SELECT DISTINCT vr_cfg_technicalspec.id,vr_vehiclespecification.vehiclegroupid,vr_vehiclespecification.specificationversion,");
			query.append(" vr_vehiclespecification.specificationsourcecode, vr_cfg_technicalspec.specificationcode,vr_cfg_technicalspec.spec_description AS specificationname,");
			query.append(" vr_vehiclespecification.specificationvalue, vr_vehiclespecification.safetytestreportid, vr_vehiclespecification.inspectionrecordid,");
			query.append(" vr_vehiclespecification.specificresult");
			query.append(" FROM vr_cfg_technicalspec LEFT JOIN vr_vehiclespecification ");
			query.append(" ON vr_cfg_technicalspec.specificationcode =vr_vehiclespecification.specificationcode AND vr_vehiclespecification.vehicleGroupId = " + vehicleGroupId );
			query.append(" WHERE vr_cfg_technicalspec.vehicletypecode= '" + vehicleClass + "' AND vr_cfg_technicalspec.spec_category= '" + specCategory + "'");
			query.append(" AND vr_cfg_technicalspec.specificationcode NOT IN (SELECT specificationcode FROM vr_cfg_limit_technicalspec WHERE vehicletypecode = ? AND searching_drive_config = ?");
			query.append(" AND reference_code_3 IN (SELECT code_3 FROM dkvn_thutuchanhchinh.dm_dataitem WHERE datagroupid = ? AND code_0 = ?)");
			query.append(" AND spec_category =?) ");
			query.append(" ORDER BY vr_cfg_technicalspec.sequenceno ASC, vr_cfg_technicalspec.id ASC)");
			
			/*if (Validator.isNotNull(vehicleClass) && vehicleClass.trim().equalsIgnoreCase("XCD")) {
				query.append(" UNION ( SELECT DISTINCT  vr_cfg_technicalspec.id,vr_vehiclespecification.vehiclegroupid,vr_vehiclespecification.specificationversion,");
				query.append(" vr_vehiclespecification.specificationsourcecode, vr_cfg_technicalspec.specificationcode,vr_cfg_technicalspec.spec_description AS specificationname,");
				query.append(" vr_vehiclespecification.specificationvalue, vr_vehiclespecification.safetytestreportid, vr_vehiclespecification.inspectionrecordid,");
				query.append(" vr_vehiclespecification.specificresult FROM vr_cfg_technicalspec  LEFT JOIN vr_vehiclespecification ");
				query.append(" ON vr_cfg_technicalspec.specificationcode =vr_vehiclespecification.specificationcode AND vr_vehiclespecification.vehicleGroupId = " + vehicleGroupId );
				query.append(" WHERE vehicletypecode = '" + vehicleType + "' AND vr_cfg_technicalspec.spec_category = '" + specCategory + "' ORDER BY vr_cfg_technicalspec.sequenceno ASC , vr_cfg_technicalspec.id ASC);");
			} */
		
			_log.debug("=========findByVehicleSpecificationWithVehicleGroupIdAndVehicleTypeCode===" + query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("VehicleSpecification", VehicleSpecificationImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			
			qPos.add(vehicleTypeCode);
			qPos.add(congThucBanhXeId);
			qPos.add(2);
			qPos.add(vehicleType);
			qPos.add(specCategory);
			
			result = (List<VehicleSpecification>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}
	
	public boolean deleteVehicleSpecificationInitialWithVehicleGroupId(long vehicleGroupId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" delete from vr_vehiclespecification where vehiclegroupid= " + vehicleGroupId);
			
			_log.info("===deleteVehicleRecordWithVehicleGroupId===" + query.toString());
			
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
}