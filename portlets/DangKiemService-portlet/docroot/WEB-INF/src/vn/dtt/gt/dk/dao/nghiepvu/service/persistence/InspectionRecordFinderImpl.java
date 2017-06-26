package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;


public class InspectionRecordFinderImpl extends BasePersistenceImpl<InspectionRecord> implements InspectionRecordFinder {
	
	private Log _log = LogFactoryUtil.getLog(InspectionRecordFinderImpl.class);
	
	public List<InspectionRecord> findByPhieuXuLyPhuIdAndCorporationId(long idPhieuXuLyPhu, String idCorporation) {
		Session session = null;
		try {
			session = openSession();
			String sql = "SELECT {vr_inspectionrecord.*} FROM vr_inspectionrecord where phieuxulyphuid in (SELECT id FROM dkvn_thutuchanhchinh.motcua_phieuxulyphu where phannhomhosoid = " + idPhieuXuLyPhu + ") AND corporationid = '" + idCorporation + "'";
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(InspectionRecordImpl.TABLE_NAME, InspectionRecordImpl.class);
			
			_log.debug("=========findByPhieuXuLyPhuIdAndCorporationId===" + sql);
			QueryPos qPos = QueryPos.getInstance(q);
			return (List<InspectionRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<InspectionRecord>();
	}
	public List<InspectionRecord> findByPhieuXuLyPhuIdAndCorporationIdAndMarkUp(long idPhieuXuLyPhu, String idCorporation, int markupSafeTest, int markupEmissionTest, int markupControl) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			String sql = "SELECT {vr_inspectionrecord.*} FROM vr_inspectionrecord where phieuxulyphuid in (SELECT id FROM dkvn_thutuchanhchinh.motcua_phieuxulyphu where phannhomhosoid = " + idPhieuXuLyPhu + ") AND corporationid = '" + idCorporation + "'";
			
			if (markupSafeTest > 0) {
				query.append(" AND markupsafetest = " + markupSafeTest);
			}
			if (markupEmissionTest > 0) {
				query.append(" AND markupemissiontest = " + markupEmissionTest);
			}
			if (markupControl > 0) {
				query.append(" AND markupcontrol = " + markupControl);
			}
			sql = sql + query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(InspectionRecordImpl.TABLE_NAME, InspectionRecordImpl.class);
			
			_log.debug("=========findByPhieuXuLyPhuIdAndCorporationId===" + sql);
			QueryPos qPos = QueryPos.getInstance(q);
			return (List<InspectionRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<InspectionRecord>();
	}
	
	  public boolean deleteInspectionRecordSpec(long inspectionId) {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder();
				
				query.append("Delete from  vr_inspectionrecordspec where inspectionrecordid = "+inspectionId);

				_log.info("=========updateVehicleRecordWithConfirmedInspectionId===" + query.toString());

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
	  
	  public boolean deleteInspectionCommonstatus(long inspectionId) {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder();
				
				query.append("Delete from  vr_inspectioncommonstatus where inspectionrecordid = "+inspectionId);

				_log.info("=========updateVehicleRecordWithConfirmedInspectionId===" + query.toString());

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
		public List<InspectionRecord> findByBienBanLuuTam(long confirmedInspectionId) {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder("SELECT {vr_inspectionrecord.*} FROM vr_inspectionrecord where confirmedinspectionid = '" + confirmedInspectionId + "' and phieuxulyphuid = 0 ");
				
				SQLQuery q = session.createSQLQuery(query.toString());
				q.setCacheable(false);
				q.addEntity(InspectionRecordImpl.TABLE_NAME, InspectionRecordImpl.class);
				
				_log.debug("=========findByPhieuXuLyPhuIdAndCorporationId===" + query.toString());
				QueryPos qPos = QueryPos.getInstance(q);
				return (List<InspectionRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				
			} catch (Exception e) {
				_log.error(e);
			} finally {
				closeSession(session);
			}
			
			return new ArrayList<InspectionRecord>();
		}
		
		public List<InspectionRecord> findByAttachedFileID(long idAttachedFile) {
			Session session = null;
			try {
				session = openSession();
				String sql = "SELECT {vr_inspectionrecord.*} FROM vr_inspectionrecord where attachedfile = " + idAttachedFile;
				
				SQLQuery q = session.createSQLQuery(sql);
				q.setCacheable(false);
				q.addEntity(InspectionRecordImpl.TABLE_NAME, InspectionRecordImpl.class);
				
				_log.debug("=========findByAttachedFileID===" + sql);
				QueryPos qPos = QueryPos.getInstance(q);
				return (List<InspectionRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				
			} catch (Exception e) {
				_log.error(e);
			} finally {
				closeSession(session);
			}
			
			return new ArrayList<InspectionRecord>();
		}
}
