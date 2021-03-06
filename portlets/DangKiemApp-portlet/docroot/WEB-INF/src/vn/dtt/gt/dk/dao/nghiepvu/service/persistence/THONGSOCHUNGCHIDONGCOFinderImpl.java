
package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIDONGCOImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.THONGSOCHUNGCHIDONGCOFinder;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleCertificateImpl;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class THONGSOCHUNGCHIDONGCOFinderImpl extends BasePersistenceImpl<THONGSOCHUNGCHIDONGCO> implements THONGSOCHUNGCHIDONGCOFinder {
	
	private Log _log = LogFactoryUtil.getLog(THONGSOCHUNGCHIDONGCOFinderImpl.class);
	public static final String FIND_THONGSOCHUNGCHIDONGCO = THONGSOCHUNGCHIDONGCOFinder.class.getName() + ".findByCertificateRecordAndHosothutucId";
	
	
	public List<THONGSOCHUNGCHIDONGCO> findByCertificateRecordAndHosothutucId(long hosothutucid) {
		
		Session session = null;
		
		try {
			session = openSession();
			
			String sql = CustomSQLUtil.get(FIND_THONGSOCHUNGCHIDONGCO);
			
			if(hosothutucid > 0) {
				sql = StringUtil.replace(sql, "SELECT DISTINCT certificaterecordid AS ID, 0 AS hosothutucid, certificaterecordid, 0 AS vehiclegroupid,", "SELECT DISTINCT certificaterecordid AS ID, ? AS hosothutucid, certificaterecordid, 0 AS vehiclegroupid,");
				sql = StringUtil.replace(sql, "FROM dkvn_nghiepvu.vr_certificaterecordspec  where certificaterecordid in (?)  group by certificaterecordid", "FROM vr_certificaterecordspec  where certificaterecordid in (?)  group by certificaterecordid");
				sql = StringUtil.replace(sql, "where certificaterecordid in (?)", "where certificaterecordid in (Select id from dkvn_nghiepvu.vr_certificaterecord where dossierid = ?) ");
			}
			
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("THONGSOCHUNGCHIDONGCO", THONGSOCHUNGCHIDONGCOImpl.class);
			
			_log.debug("==findByCertificateRecordAndHosothutucId==" + sql);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			if(hosothutucid > 0) {
				qPos.add(hosothutucid);
				qPos.add(hosothutucid);
			}
			
			return (List<THONGSOCHUNGCHIDONGCO>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<THONGSOCHUNGCHIDONGCO>();
	}	
	
public List<THONGSOCHUNGCHIDONGCO> findByVehicleGroupInitialAndHosothutucId(long hosothutucid) {
		
		Session session = null;
		
		try {
			session = openSession();
			
			String sql = CustomSQLUtil.get(FIND_THONGSOCHUNGCHIDONGCO);
			
			if(hosothutucid > 0) {
				sql = StringUtil.replace(sql, "SELECT DISTINCT certificaterecordid AS ID, 0 AS hosothutucid, certificaterecordid, 0 AS vehiclegroupid,", "SELECT DISTINCT vehiclegroupid AS ID, ? AS hosothutucid, 0 AS certificaterecordid, vehiclegroupid,");
				sql = StringUtil.replace(sql, "FROM dkvn_nghiepvu.vr_certificaterecordspec  where certificaterecordid in (?)  group by certificaterecordid", "FROM vr_vehiclespecification where vehiclegroupid in (?)  group by vehiclegroupid");
				sql = StringUtil.replace(sql, "where vehiclegroupid in (?)", "where vehiclegroupid in (Select distinct vehiclegroupinitialid from dkvn_nghiepvu.vr_vehicle_certificate where hosothutucid = ?) ");
			}
			
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("THONGSOCHUNGCHIDONGCO", THONGSOCHUNGCHIDONGCOImpl.class);
			
			_log.debug("==findByVehicleGroupInitialAndHosothutucId==" + sql);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			if(hosothutucid > 0) {
				qPos.add(hosothutucid);
				qPos.add(hosothutucid);
			}
			
			return (List<THONGSOCHUNGCHIDONGCO>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<THONGSOCHUNGCHIDONGCO>();
	}

	public boolean deleteDCXVehicleCertificateSpecWithHosothutucId(long hosothutucId) {
		Session session = null;
		
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("Delete from dkvn_nghiepvu.thongsochungchi_dongco where hosothutucid =  " + hosothutucId);
								
//			log.info("=========deleteDCXVehicleCertificateSpecWithHosothutucId===" + query.toString());
			
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
