package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehiclerecordInitialImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class VehiclerecordInitialFinderImpl extends BasePersistenceImpl<VehiclerecordInitial> implements VehiclerecordInitialFinder {

	private Log _log = LogFactoryUtil.getLog(VehiclerecordInitialFinderImpl.class);
    
    public List<VehiclerecordInitial> findVehiclerecordInitialByPhieuXuLyPhuId(long phieuXuLyPhuId) {
		Session session = null;
		List<VehiclerecordInitial> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT {vr_VehiclerecordInitial.*} FROM vr_VehiclerecordInitial where inspectionrecordid = (SELECT distinct id FROM vr_inspectionrecord where phieuxulyphuid = ?)");

			_log.debug("=========findDanhSachHoSoMotCuaPhieuXuLyPhu===" + query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehiclerecordInitialImpl.TABLE_NAME, VehiclerecordInitialImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(phieuXuLyPhuId);
			result = (List<VehiclerecordInitial>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}
    public List<VehiclerecordInitial> findByDossierId(long dossierId) {
  		Session session = null;
  		List<VehiclerecordInitial> result = null;
  		try {
  			session = openSession();
  			//StringBuilder query = new StringBuilder();
  			
  			String sql = "SELECT {vr_VehiclerecordInitial.*} FROM vr_VehiclerecordInitial INNER JOIN vr_vehiclegroup on " +
  					"vr_vehiclegroup.id = vr_VehiclerecordInitial.vehiclegroupid INNER JOIN vr_registeredinspection on " +
  					" vr_registeredinspection.id = vr_vehiclegroup.registeredinspectionid and vr_registeredinspection.dossierid = " + dossierId;
  			sql = sql + " order by vr_VehiclerecordInitial.id desc ";
  			

  			_log.info("=========findByDossierId===" + sql);

  			SQLQuery q = session.createSQLQuery(sql);
  			q.setCacheable(false);
  			q.addEntity(VehiclerecordInitialImpl.TABLE_NAME, VehiclerecordInitialImpl.class);
  			QueryPos qPos = QueryPos.getInstance(q);
  			result = (List<VehiclerecordInitial>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
  			
  		} catch (Exception e) {
  			_log.error(e);
  		} finally {
  			closeSession(session);
  		}
  		
  		return result;
  	}
    
    public List<VehiclerecordInitial> findByDossierId(long dossierId,long codeNumber,String	chassisNumber,String	engineNumber) {
  		Session session = null;
  		List<VehiclerecordInitial> result = null;
  		try {
  			session = openSession();
  			//StringBuilder query = new StringBuilder();
  			
  			String sql = "SELECT {vr_VehiclerecordInitial.*} FROM vr_VehiclerecordInitial INNER JOIN vr_vehiclegroup on" +
  					" vr_vehiclegroup.id = vr_VehiclerecordInitial.vehiclegroupid INNER JOIN vr_registeredinspection on vr_registeredinspection.id " +
  					" = vr_vehiclegroup.registeredinspectionid and  vr_registeredinspection.dossierid = " + dossierId;
  			sql = sql + " where vr_VehiclerecordInitial.codeNumber="+codeNumber;
  			sql = sql + " and vr_VehiclerecordInitial.chassisNumber='"+chassisNumber+"'";
  			sql = sql + " and vr_VehiclerecordInitial.engineNumber='"+engineNumber+"'";
  			
  			sql = sql + " order by vr_VehiclerecordInitial.id desc ";
  			

  			_log.info("=========findByDossierId===" + sql);

  			SQLQuery q = session.createSQLQuery(sql);
  			q.setCacheable(false);
  			q.addEntity(VehiclerecordInitialImpl.TABLE_NAME, VehiclerecordInitialImpl.class);
  			QueryPos qPos = QueryPos.getInstance(q);
  			result = (List<VehiclerecordInitial>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
  			
  		} catch (Exception e) {
  			_log.error(e);
  		} finally {
  			closeSession(session);
  		}
  		
  		return result;
  	}
    
    public List<VehiclerecordInitial> findByDebitNoteid(long debitNoteid) {
  		Session session = null;
  		List<VehiclerecordInitial> result = null;
  		try {
  			session = openSession();
  			StringBuilder query = new StringBuilder();
  			
  			
  			String sql = "SELECT {vr_VehiclerecordInitial.*} FROM vr_VehiclerecordInitial inner JOIN vr_debitnotedetails de on vr_VehiclerecordInitial.id = de.VehiclerecordInitialid and de.debitnoteid = " + debitNoteid + " order by vehiclegroupid asc";

  			_log.debug("=========findByDossierId===" + sql);
  			_log.info("=========findByDebitNoteid===" + sql);

  			SQLQuery q = session.createSQLQuery(sql);
  			q.setCacheable(false);
  			q.addEntity(VehiclerecordInitialImpl.TABLE_NAME, VehiclerecordInitialImpl.class);
  			QueryPos qPos = QueryPos.getInstance(q);
  			result = (List<VehiclerecordInitial>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
  			
  		} catch (Exception e) {
  			_log.error(e);
  		} finally {
  			closeSession(session);
  		}
  		
  		return result;
  	}
    
    public VehiclerecordInitial findByCodeNumberAndRegisteredNumber(long codeNumber, String registeredNumber) {
  		Session session = null;
  		List<VehiclerecordInitial> result = null;
  		try {
  			session = openSession();
  			StringBuilder query = new StringBuilder();
  			query.append("SELECT {vr_VehiclerecordInitial.*} FROM vr_VehiclerecordInitial INNER JOIN vr_vehiclegroup on vr_vehiclegroup.id = vr_VehiclerecordInitial.vehiclegroupid INNER JOIN vr_registeredinspection on vr_registeredinspection.id = vr_vehiclegroup.registeredinspectionid ");
  			query.append( "where vr_registeredinspection.registerednumber = ");
  			query.append(registeredNumber);
  			query.append(" and  vr_VehiclerecordInitial.codenumber = ");
  			query.append( codeNumber);
//  			
//  			String sql = "SELECT {vr_VehiclerecordInitial.*} FROM vr_VehiclerecordInitial LEFT JOIN vr_vehiclegroup on vr_vehiclegroup.id = vr_VehiclerecordInitial.vehiclegroupid LEFT JOIN vr_registeredinspection on vr_registeredinspection.id = vr_vehiclegroup.registeredinspectionid where vr_registeredinspection.dossierid = " + dossierId;

  			_log.debug("=========findByCodeNumberAndRegisteredNumber===" + query.toString());

  			SQLQuery q = session.createSQLQuery(query.toString());
  			q.setCacheable(false);
  			q.addEntity(VehiclerecordInitialImpl.TABLE_NAME, VehiclerecordInitialImpl.class);
  			QueryPos qPos = QueryPos.getInstance(q);
  			result = (List<VehiclerecordInitial>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
  			if(result != null && result.size()>0){
  				return result.get(0);
  			}
  		} catch (Exception e) {
  			_log.error(e);
  		} finally {
  			closeSession(session);
  		}
  		
  		return null;
  	}

    public boolean updateVehiclerecordInitialWithConfirmInspection(long confirmInspectionId) {
  		Session session = null;
  	//	List<VehiclerecordInitial> result = null;
  		try {
  			session = openSession();
  			StringBuilder query = new StringBuilder();
  			query.append("UPDATE vr_VehiclerecordInitial SET confirmedinspectionid = 0  ");
  			query.append( "where vr_VehiclerecordInitial.confirmedinspectionid = "+confirmInspectionId);
  			
//  			
//  			String sql = "SELECT {vr_VehiclerecordInitial.*} FROM vr_VehiclerecordInitial LEFT JOIN vr_vehiclegroup on vr_vehiclegroup.id = vr_VehiclerecordInitial.vehiclegroupid LEFT JOIN vr_registeredinspection on vr_registeredinspection.id = vr_vehiclegroup.registeredinspectionid where vr_registeredinspection.dossierid = " + dossierId;

  			_log.debug("=========findByCodeNumberAndDossierId===" + query.toString());

  			SQLQuery q = session.createSQLQuery(query.toString());
  			
  			//q.setCacheable(false);
  		  return true;
  		} catch (Exception e) {
  			_log.error(e);
  		} finally {
  			closeSession(session);
  		}
  		
  		return false;
  	}


    public VehiclerecordInitial findByCodeNumberAndDossierId(long codeNumber, long dossierId) {
  		Session session = null;
  		List<VehiclerecordInitial> result = null;
  		try {
  			session = openSession();
  			StringBuilder query = new StringBuilder();
  			query.append("SELECT {vr_VehiclerecordInitial.*} FROM vr_VehiclerecordInitial INNER JOIN vr_vehiclegroup on vr_vehiclegroup.id = vr_VehiclerecordInitial.vehiclegroupid INNER JOIN vr_registeredinspection on vr_registeredinspection.id = vr_vehiclegroup.registeredinspectionid ");
  			query.append( "where vr_registeredinspection.dossierid = ");
  			query.append(dossierId);
  			query.append(" and  vr_VehiclerecordInitial.codenumber = ");
  			query.append( codeNumber);
//  			
//  			String sql = "SELECT {vr_VehiclerecordInitial.*} FROM vr_VehiclerecordInitial LEFT JOIN vr_vehiclegroup on vr_vehiclegroup.id = vr_VehiclerecordInitial.vehiclegroupid LEFT JOIN vr_registeredinspection on vr_registeredinspection.id = vr_vehiclegroup.registeredinspectionid where vr_registeredinspection.dossierid = " + dossierId;

  			_log.debug("=========findByCodeNumberAndDossierId===" + query.toString());

  			SQLQuery q = session.createSQLQuery(query.toString());
  			q.setCacheable(false);
  			q.addEntity(VehiclerecordInitialImpl.TABLE_NAME, VehiclerecordInitialImpl.class);
  			QueryPos qPos = QueryPos.getInstance(q);
  			result = (List<VehiclerecordInitial>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
  			if(result != null && result.size()>0){
  				return result.get(0);
  			}
  		} catch (Exception e) {
  			_log.error(e);
  		} finally {
  			closeSession(session);
  		}
  		
  		return null;
  	}


    public List<VehiclerecordInitial> findByInspectionRecordNumber(String inspectionRecordNumber) {
    	Session session = null;
		List<VehiclerecordInitial> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT {vr_VehiclerecordInitial.*} FROM vr_VehiclerecordInitial where inspectionrecordid = (SELECT distinct id FROM vr_inspectionrecord where inspectionrecordno = ?)");

			_log.debug("=========findByInspectionRecordNumber===" + query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehiclerecordInitialImpl.TABLE_NAME, VehiclerecordInitialImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(inspectionRecordNumber);
			result = (List<VehiclerecordInitial>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
  	}

    public List<VehiclerecordInitial> findVehiclerecordInitialHasSafetestrequirement(String inspectionRecordId) {
		Session session = null;
		List<VehiclerecordInitial> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select {vr_VehiclerecordInitial.*} from vr_VehiclerecordInitial");
			query.append(" where 1=1 ");
			if (Validator.isNotNull(inspectionRecordId) && inspectionRecordId.trim().length() > 0) {
				query.append(" AND inspectionRecordId = " + inspectionRecordId);
			}	
			query.append(" and safetestrequirementid is not null and safetestrequirementid > 0 ");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehiclerecordInitialImpl.TABLE_NAME, VehiclerecordInitialImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			result = (List<VehiclerecordInitial>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}
    
    public List<VehiclerecordInitial> findVehiclerecordInitialHasEmissiontestrequirement(String inspectionRecordId) {
		Session session = null;
		List<VehiclerecordInitial> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select {vr_VehiclerecordInitial.*} from vr_VehiclerecordInitial");
			query.append(" where 1=1 ");
			if (Validator.isNotNull(inspectionRecordId) && inspectionRecordId.trim().length() > 0) {
				query.append(" AND inspectionRecordId = " + inspectionRecordId);
			}	
			query.append(" and emissiontestrequirementid is not null and emissiontestrequirementid > 0 ");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehiclerecordInitialImpl.TABLE_NAME, VehiclerecordInitialImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			result = (List<VehiclerecordInitial>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}
    
    public List<VehiclerecordInitial> findVehiclerecordInitialHasControlrequirement(String inspectionRecordId) {
		Session session = null;
		List<VehiclerecordInitial> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select {vr_VehiclerecordInitial.*} from vr_VehiclerecordInitial");
			query.append(" where 1=1 ");
			if (Validator.isNotNull(inspectionRecordId) && inspectionRecordId.trim().length() > 0) {
				query.append(" AND inspectionRecordId = " + inspectionRecordId);
			}	
			query.append(" and controlrequirementid is not null and controlrequirementid > 0 ");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehiclerecordInitialImpl.TABLE_NAME, VehiclerecordInitialImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			result = (List<VehiclerecordInitial>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}
    
	public long tongChungChiDaCap(long vehiclegroupId) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("select sum(certificaterecordid) as total FROM vr_VehiclerecordInitial where vehiclegroupid="+vehiclegroupId);

			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
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
    
	public long tongDuThaoChungChi(long vehiclegroupId) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("select sum(draftcertificateid) as total FROM vr_VehiclerecordInitial where vehiclegroupid="+vehiclegroupId);

			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
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
	
	public List<VehiclerecordInitial> findByConfirmedInspectionIdAndBienBanKiemTra(long confirmedInspectionId) {
		Session session = null;
		List<VehiclerecordInitial> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select {vr_VehiclerecordInitial.*} from vr_VehiclerecordInitial");
			query.append(" where 1=1 ");
			if (confirmedInspectionId > 0) {
				query.append(" AND confirmedInspectionId = " + confirmedInspectionId);
			}	
			query.append(" AND inspectionrecordid = 0");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehiclerecordInitialImpl.TABLE_NAME, VehiclerecordInitialImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			result = (List<VehiclerecordInitial>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}
	
	public long countByConfirmedInspectionIdAndMarkUpStatus(long confirmedInspectionId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select count(*)  as total from vr_VehiclerecordInitial");
			query.append(" where 1=1 ");
			if (confirmedInspectionId > 0) {
				query.append(" AND confirmedInspectionId = " + confirmedInspectionId);
			}	
			query.append(" AND markupstatus > 0 " );

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
			return 0;

			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
	
	public long countByConfirmedInspectionIdAndInspectionRecordId(long confirmedInspectionId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select count(*)  as total from vr_VehiclerecordInitial");
			query.append(" where 1=1 ");
			if (confirmedInspectionId > 0) {
				query.append(" AND confirmedInspectionId = " + confirmedInspectionId);
			}	
			query.append(" AND inspectionrecordid > 0 " );

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
			return 0;

			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	}

	public long checkConfirmedInspection(long registeredinspectionid,String technicalspeccode) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("select count(*)  as total from vr_vehiclegroup,vr_VehiclerecordInitial ");
			query.append(" where  vr_vehiclegroup.technicalspeccode = '"+technicalspeccode+"'");
			query.append(" and vr_vehiclegroup.registeredinspectionid="+registeredinspectionid);
			query.append(" and vr_vehiclegroup.id = vr_VehiclerecordInitial.vehiclegroupid and  vr_VehiclerecordInitial.confirmedinspectionid>0 ");

			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
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

	public long checkHoanKiemTraDoDaLapBienBanKiemTra(long codeNumber,String	chassisNumber,String	engineNumber, long hoSoThuTucId)  {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("select count(vr_VehiclerecordInitial.id)  as total from vr_VehiclerecordInitial,vr_vehiclegroup, vr_registeredinspection");
			query.append(" where  0 = 0 ");
			query.append(" and vr_VehiclerecordInitial.codeNumber="+codeNumber);
			query.append(" and vr_VehiclerecordInitial.chassisNumber='"+chassisNumber+"'");
			query.append(" and vr_VehiclerecordInitial.engineNumber='"+engineNumber+"'");
			
			query.append(" and vr_VehiclerecordInitial.inspectionRecordId > 0  ");
			
			query.append(" and vr_VehiclerecordInitial.vehiclegroupid = vr_vehiclegroup.id  ");
			query.append(" and vr_registeredinspection.id = vr_vehiclegroup.registeredinspectionid  ");
			query.append(" and vr_registeredinspection.dossierid =  "+hoSoThuTucId);
			
				

			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return 0;
	}


	public long checkChuaPhanCongDonViKiemTra(long codeNumber,String	chassisNumber,String	engineNumber, long hoSoThuTucId)  {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("select count(vr_VehiclerecordInitial.id)  as total from vr_VehiclerecordInitial,vr_vehiclegroup, vr_registeredinspection,vr_confirmedinspection");
			query.append(" where  0 = 0 ");
			query.append(" and vr_VehiclerecordInitial.codeNumber="+codeNumber);
			query.append(" and vr_VehiclerecordInitial.chassisNumber='"+chassisNumber+"'");
			query.append(" and vr_VehiclerecordInitial.engineNumber='"+engineNumber+"'");
			
			query.append(" and vr_VehiclerecordInitial.confirmedInspectionId > 0  ");
			
			query.append(" and vr_VehiclerecordInitial.vehiclegroupid = vr_vehiclegroup.id  ");
			query.append(" and vr_registeredinspection.id = vr_vehiclegroup.registeredinspectionid  ");
			query.append(" and vr_registeredinspection.dossierid =  "+hoSoThuTucId);
			query.append(" and vr_VehiclerecordInitial.confirmedInspectionId = vr_confirmedinspection.id ");
			query.append(" and length(vr_confirmedinspection.corporationid) >0 ");
			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return 0;
	}
	
	public long checkKeHoachKiemTra(long codeNumber,String	chassisNumber,String	engineNumber, long hoSoThuTucId)  {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("select count(vr_VehiclerecordInitial.id)  as total from vr_VehiclerecordInitial,vr_vehiclegroup, vr_registeredinspection");
			query.append(" where  0 = 0 ");
			query.append(" and vr_VehiclerecordInitial.codeNumber="+codeNumber);
			query.append(" and vr_VehiclerecordInitial.chassisNumber='"+chassisNumber+"'");
			query.append(" and vr_VehiclerecordInitial.engineNumber='"+engineNumber+"'");
			
			query.append(" and vr_VehiclerecordInitial.confirmedInspectionId > 0  ");
			
			query.append(" and vr_VehiclerecordInitial.vehiclegroupid = vr_vehiclegroup.id  ");
			query.append(" and vr_registeredinspection.id = vr_vehiclegroup.registeredinspectionid  ");
			query.append(" and vr_registeredinspection.dossierid =  "+hoSoThuTucId);
			
			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return 0;
	}
	

	
	
	public long checkDaPhanCongDonViKiemTra(long codeNumber,String	chassisNumber,String	engineNumber)  {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("select count(*)  as total from vr_VehiclerecordInitial ");
			query.append(" where  0 = 0 ");
			query.append(" and codeNumber="+codeNumber);
			query.append(" and chassisNumber='"+chassisNumber+"'");
			query.append(" and engineNumber='"+engineNumber+"'");

			query.append(" and  inspectionRecordId =0  ");
			
			query.append(" and confirmedInspectionId > 0  ");
			

			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return 0;
	}
	
	public long checkHoanKiemTra(long codeNumber,String	chassisNumber,String	engineNumber)  {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("select count(*)  as total from vr_VehiclerecordInitial ");
			query.append(" where  markUpStatus = 0 ");
			query.append(" and codeNumber="+codeNumber);
			query.append(" and chassisNumber='"+chassisNumber+"'");
			query.append(" and engineNumber='"+engineNumber+"'");
			
			query.append(" confirmedInspectionId >0  ");
			

			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return 0;
	}

	public VehiclerecordInitial getVehiclerecordInitial(long codeNumber,String	chassisNumber,String	engineNumber)  {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("select *   from vr_VehiclerecordInitial ");
			query.append(" where  markUpStatus = 0 ");
			query.append(" and codeNumber="+codeNumber);
			query.append(" and chassisNumber='"+chassisNumber+"'");
			query.append(" and engineNumber='"+engineNumber+"'");
			

			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			_log.info(" sql   "+sql);
			q.addEntity(VehiclerecordInitialImpl.TABLE_NAME, VehiclerecordInitialImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			List<VehiclerecordInitial> result = (List<VehiclerecordInitial>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if(result!=null&&result.size()>0){
				return result.get(0);
			}
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public VehiclerecordInitial getVehiclerecordInitialConfirmedInspectionId(long codeNumber,String	chassisNumber,String	engineNumber)  {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();

			query.append("select *   from vr_VehiclerecordInitial ");
			query.append(" where  markUpStatus = 0 ");
			query.append(" and codeNumber="+codeNumber);
			query.append(" and chassisNumber='"+chassisNumber+"'");
			query.append(" and engineNumber='"+engineNumber+"'");
			
			
			

			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity(VehiclerecordInitialImpl.TABLE_NAME, VehiclerecordInitialImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			List<VehiclerecordInitial> result = (List<VehiclerecordInitial>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if(result!=null&&result.size()>0){
				return result.get(0);
			}
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return null;
	}
	
    public boolean updateVehiclerecordInitialWithConfirmedInspectionId(long confirmedInspectionId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("UPDATE  vr_VehiclerecordInitial SET  confirmedinspectionid = 0  where confirmedinspectionid = "+confirmedInspectionId);

			_log.info("=========updateVehiclerecordInitialWithConfirmedInspectionId===" + query.toString());

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
	public List<VehiclerecordInitial> findByArrayId(String arrayId) {
		Session session = null;
		List<VehiclerecordInitial> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT {vr_vehiclerecord_initial.*} FROM vr_vehiclerecord_initial ");
			
			if(Validator.isNotNull(arrayId) && arrayId.trim().length() > 0){
				query.append(" WHERE id in (" + arrayId +")");
			}
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehiclerecordInitialImpl.TABLE_NAME, VehiclerecordInitialImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			result = (List<VehiclerecordInitial>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		}catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return result;
		
	
	}
	
	public boolean deleteVehicleRecordInitialWithVehicleGroupId(long vehicleGroupId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" delete from vr_vehiclerecord_initial where vehiclegroupid= " + vehicleGroupId);
			
			_log.info("=========deleteVehicleRecordWithVehicleGroupId===" + query.toString());
			
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