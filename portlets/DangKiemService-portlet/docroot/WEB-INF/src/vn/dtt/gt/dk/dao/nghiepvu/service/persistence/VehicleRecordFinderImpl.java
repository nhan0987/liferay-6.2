/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

/**
 * @author win_64
 */
public class VehicleRecordFinderImpl extends BasePersistenceImpl<VehicleRecord> implements VehicleRecordFinder {
	
	private Log log = LogFactoryUtil.getLog(VehicleRecordFinderImpl.class);
	
	public boolean updateVehicleRecordWithConfirmInspection(long confirmInspectionId) {
		Session session = null;
		//	List<VehicleRecord> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("UPDATE vr_vehiclerecord SET confirmedinspectionid = 0  ");
			query.append("where vr_vehiclerecord.confirmedinspectionid = " + confirmInspectionId);
			
			log.debug("=========findByCodeNumberAndDossierId===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			
			//q.setCacheable(false);
			return true;
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return false;
	}
	
	public List<VehicleRecord> findVehicleRecordByPhieuXuLyPhuId(long phieuXuLyPhuId) {
		Session session = null;
		List<VehicleRecord> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT {vr_vehiclerecord.*} FROM vr_vehiclerecord where inspectionrecordid in (SELECT distinct id FROM vr_inspectionrecord where phieuxulyphuid = ?)");
			
			log.debug("=========findDanhSachHoSoMotCuaPhieuXuLyPhu===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehicleRecordImpl.TABLE_NAME, VehicleRecordImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(phieuXuLyPhuId);
			result = (List<VehicleRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}
	
	public List<VehicleRecord> findVehicleRecordByDebitNoteIdGroupbyCertificateRecord(long debitNoteid) {
		Session session = null;
		List<VehicleRecord> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT {vr_vehiclerecord.*} FROM vr_vehiclerecord WHERE debitnoteid = ? GROUP BY certificaterecordid");
			
			log.debug("=========findVehicleRecordByDebitNoteIdGroupbyCertificateRecord===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehicleRecordImpl.TABLE_NAME, VehicleRecordImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(debitNoteid);
			result = (List<VehicleRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}
	
	
	public List<VehicleRecord> findByInspectionRecordIdOrderbyAsc(long inspectionRecordId) {
		Session session = null;
		List<VehicleRecord> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT {vr_vehiclerecord.*} FROM vr_vehiclerecord where inspectionrecordid = " + inspectionRecordId + " ORDER BY id ASC");
			
			log.debug("=========findByInspectionRecordIdOrderbyAsc===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehicleRecordImpl.TABLE_NAME, VehicleRecordImpl.class);
			result = (List<VehicleRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}
	public List<VehicleRecord> findByDossierId(long dossierId) {
		Session session = null;
		List<VehicleRecord> result = null;
		try {
			session = openSession();
			String sql =
				"SELECT {vr_vehiclerecord.*} FROM vr_vehiclerecord INNER JOIN vr_vehiclegroup on " +
					"vr_vehiclegroup.id = vr_vehiclerecord.vehiclegroupid INNER JOIN vr_registeredinspection on " +
					" vr_registeredinspection.id = vr_vehiclegroup.registeredinspectionid and vr_registeredinspection.dossierid = " + dossierId;
			sql = sql + " order by vr_vehiclerecord.id desc ";
			
			log.info("=========findByDossierId===" + sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(VehicleRecordImpl.TABLE_NAME, VehicleRecordImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			result = (List<VehicleRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}
	
	public List<VehicleRecord> findByDossierId(long dossierId, long codeNumber) {
		Session session = null;
		List<VehicleRecord> result = null;
		try {
			session = openSession();
			//StringBuilder query = new StringBuilder();
			
			String sql =
				"SELECT {vr_vehiclerecord.*} FROM vr_vehiclerecord INNER JOIN vr_vehiclegroup on" +
					" vr_vehiclegroup.id = vr_vehiclerecord.vehiclegroupid INNER JOIN vr_registeredinspection on vr_registeredinspection.id " +
					" = vr_vehiclegroup.registeredinspectionid and  vr_registeredinspection.dossierid = " + dossierId;
			sql = sql + " where vr_vehiclerecord.codeNumber=" + codeNumber;
			
			sql = sql + " order by vr_vehiclerecord.id desc ";
			
			log.info("=========findByDossierId===" + sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(VehicleRecordImpl.TABLE_NAME, VehicleRecordImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			result = (List<VehicleRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}
	
	public List<VehicleRecord> findByDossierId(long dossierId, long codeNumber, String chassisNumber, String engineNumber) {
		Session session = null;
		List<VehicleRecord> result = null;
		try {
			session = openSession();
			//StringBuilder query = new StringBuilder();
			
			String sql =
				"SELECT {vr_vehiclerecord.*} FROM vr_vehiclerecord INNER JOIN vr_vehiclegroup on" +
					" vr_vehiclegroup.id = vr_vehiclerecord.vehiclegroupid INNER JOIN vr_registeredinspection on vr_registeredinspection.id " +
					" = vr_vehiclegroup.registeredinspectionid and  vr_registeredinspection.dossierid = " + dossierId;
			sql = sql + " where vr_vehiclerecord.codeNumber=" + codeNumber;
			sql = sql + " and vr_vehiclerecord.chassisNumber='" + chassisNumber + "'";
			sql = sql + " and vr_vehiclerecord.engineNumber='" + engineNumber + "'";
			
			sql = sql + " order by vr_vehiclerecord.id desc ";
			
			log.info("=========findByDossierId===" + sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(VehicleRecordImpl.TABLE_NAME, VehicleRecordImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			result = (List<VehicleRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}
	
	public List<VehicleRecord> findByDebitNoteid(long debitNoteid) {
		Session session = null;
		List<VehicleRecord> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			String sql =
				"SELECT {vr_vehiclerecord.*} FROM vr_vehiclerecord inner JOIN vr_debitnotedetails de on vr_vehiclerecord.id = de.vehiclerecordid and de.debitnoteid = " +
					debitNoteid + " order by vehiclegroupid asc";
			
			log.debug("=========findByDossierId===" + sql);
			log.info("=========findByDebitNoteid===" + sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(VehicleRecordImpl.TABLE_NAME, VehicleRecordImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			result = (List<VehicleRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}
	
	public VehicleRecord findByCodeNumberAndRegisteredNumber(long codeNumber, String registeredNumber) {
		Session session = null;
		List<VehicleRecord> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {vr_vehiclerecord.*} FROM vr_vehiclerecord INNER JOIN vr_vehiclegroup on vr_vehiclegroup.id = vr_vehiclerecord.vehiclegroupid INNER JOIN vr_registeredinspection on vr_registeredinspection.id = vr_vehiclegroup.registeredinspectionid ");
			query.append("where vr_registeredinspection.registerednumber = ");
			query.append(registeredNumber);
			query.append(" and  vr_vehiclerecord.codenumber = ");
			query.append(codeNumber);
			
			log.debug("=========findByCodeNumberAndRegisteredNumber===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehicleRecordImpl.TABLE_NAME, VehicleRecordImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			result = (List<VehicleRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if (result != null && result.size() > 0) { return result.get(0); }
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	
	
	public VehicleRecord findByCodeNumberAndDossierId(long codeNumber, long dossierId) {
		Session session = null;
		List<VehicleRecord> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {vr_vehiclerecord.*} FROM vr_vehiclerecord INNER JOIN vr_vehiclegroup on vr_vehiclegroup.id = vr_vehiclerecord.vehiclegroupid INNER JOIN vr_registeredinspection on vr_registeredinspection.id = vr_vehiclegroup.registeredinspectionid ");
			query.append("where vr_registeredinspection.dossierid = ");
			query.append(dossierId);
			query.append(" and  vr_vehiclerecord.codenumber = ");
			query.append(codeNumber);
			
			log.debug("=========findByCodeNumberAndDossierId===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehicleRecordImpl.TABLE_NAME, VehicleRecordImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			result = (List<VehicleRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if (result != null && result.size() > 0) { return result.get(0); }
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public List<VehicleRecord> findByInspectionRecordNumber(String inspectionRecordNumber) {
		Session session = null;
		List<VehicleRecord> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT {vr_vehiclerecord.*} FROM vr_vehiclerecord where inspectionrecordid = (SELECT distinct id FROM vr_inspectionrecord where inspectionrecordno = ?)");
			
			log.debug("=========findByInspectionRecordNumber===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehicleRecordImpl.TABLE_NAME, VehicleRecordImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(inspectionRecordNumber);
			result = (List<VehicleRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}
	
	public List<VehicleRecord> findVehicleRecordHasSafetestrequirement(String inspectionRecordId) {
		Session session = null;
		List<VehicleRecord> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select {vr_vehiclerecord.*} from vr_vehiclerecord");
			query.append(" where 1=1 ");
			if (Validator.isNotNull(inspectionRecordId) && inspectionRecordId.trim().length() > 0) {
				query.append(" AND inspectionRecordId = " + inspectionRecordId);
			}
			query.append(" and safetestrequirementid is not null and safetestrequirementid > 0 ");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehicleRecordImpl.TABLE_NAME, VehicleRecordImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			result = (List<VehicleRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}
	
	public List<VehicleRecord> findVehicleRecordHasEmissiontestrequirement(String inspectionRecordId) {
		Session session = null;
		List<VehicleRecord> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select {vr_vehiclerecord.*} from vr_vehiclerecord");
			query.append(" where 1=1 ");
			if (Validator.isNotNull(inspectionRecordId) && inspectionRecordId.trim().length() > 0) {
				query.append(" AND inspectionRecordId = " + inspectionRecordId);
			}
			query.append(" and emissiontestrequirementid is not null and emissiontestrequirementid > 0 ");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehicleRecordImpl.TABLE_NAME, VehicleRecordImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			result = (List<VehicleRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}
	
	public List<VehicleRecord> findVehicleRecordHasControlrequirement(String inspectionRecordId) {
		Session session = null;
		List<VehicleRecord> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select {vr_vehiclerecord.*} from vr_vehiclerecord");
			query.append(" where 1=1 ");
			if (Validator.isNotNull(inspectionRecordId) && inspectionRecordId.trim().length() > 0) {
				query.append(" AND inspectionRecordId = " + inspectionRecordId);
			}
			query.append(" and controlrequirementid is not null and controlrequirementid > 0 ");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehicleRecordImpl.TABLE_NAME, VehicleRecordImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			result = (List<VehicleRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}
	
	public long tongChungChiDaCap(long vehiclegroupId)
		throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select sum(certificaterecordid) as total FROM vr_vehiclerecord where vehiclegroupid=" + vehiclegroupId);
			
			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public long tongDuThaoChungChi(long vehiclegroupId)
		throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select sum(draftcertificateid) as total FROM vr_vehiclerecord where vehiclegroupid=" + vehiclegroupId);
			
			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<VehicleRecord> findByConfirmedInspectionIdAndBienBanKiemTra(long confirmedInspectionId) {
		Session session = null;
		List<VehicleRecord> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select {vr_vehiclerecord.*} from vr_vehiclerecord");
			query.append(" where 1=1 ");
			if (confirmedInspectionId > 0) {
				query.append(" AND confirmedInspectionId = " + confirmedInspectionId);
			}
			query.append(" AND inspectionrecordid = 0");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehicleRecordImpl.TABLE_NAME, VehicleRecordImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			result = (List<VehicleRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			log.error(e);
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
			
			query.append("select count(*)  as total from vr_vehiclerecord");
			query.append(" where 1=1 ");
			if (confirmedInspectionId > 0) {
				query.append(" AND confirmedInspectionId = " + confirmedInspectionId);
			}
			query.append(" AND markupstatus > 0 ");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			return 0;
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
	
	public long checkKyDuyetChungChi(long verhicleGroupId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select count(*) as total from vr_vehiclerecord,vr_certificaterecord ");
			query.append(" where 1=1 ");
			if (verhicleGroupId > 0) {
				query.append(" AND vr_vehiclerecord.vehiclegroupid = " + verhicleGroupId);
			}
			query.append(" and vr_certificaterecord.certificatenumber='DRAFT' ");
			query.append(" and vr_vehiclerecord.certificaterecordid=vr_certificaterecord.id ");
			log.info("query.toString()  "+query.toString());
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();
//			log.info("query.toString()  "+query.toString());
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			return 0;
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 1;
	}
	
	public long countByConfirmedInspectionIdAndInspectionRecordId(long confirmedInspectionId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select count(*)  as total from vr_vehiclerecord");
			query.append(" where 1=1 ");
			if (confirmedInspectionId > 0) {
				query.append(" AND confirmedInspectionId = " + confirmedInspectionId);
			}
			query.append(" AND inspectionrecordid > 0 ");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			return 0;
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
	
	public long checkConfirmedInspection(long registeredinspectionid, String technicalspeccode)
		throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select count(*)  as total from vr_vehiclegroup,vr_vehiclerecord ");
			query.append(" where  vr_vehiclegroup.technicalspeccode = '" + technicalspeccode + "'");
			query.append(" and vr_vehiclegroup.registeredinspectionid=" + registeredinspectionid);
			query.append(" and vr_vehiclegroup.id = vr_vehiclerecord.vehiclegroupid and  vr_vehiclerecord.confirmedinspectionid>0 ");
			
			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public long checkHoanKiemTraDoDaLapBienBanKiemTra(long codeNumber, String chassisNumber, String engineNumber, long hoSoThuTucId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select count(vr_vehiclerecord.id)  as total from vr_vehiclerecord,vr_vehiclegroup, vr_registeredinspection");
			query.append(" where  0 = 0 ");
			query.append(" and vr_vehiclerecord.codeNumber=" + codeNumber);
			query.append(" and vr_vehiclerecord.chassisNumber='" + chassisNumber + "'");
			query.append(" and vr_vehiclerecord.engineNumber='" + engineNumber + "'");
			
			query.append(" and vr_vehiclerecord.inspectionRecordId > 0  ");
			
			query.append(" and vr_vehiclerecord.vehiclegroupid = vr_vehiclegroup.id  ");
			query.append(" and vr_registeredinspection.id = vr_vehiclegroup.registeredinspectionid  ");
			query.append(" and vr_registeredinspection.dossierid =  " + hoSoThuTucId);
			
			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		return 0;
	}
	
	public long checkChuaPhanCongDonViKiemTra(long codeNumber, String chassisNumber, String engineNumber, long hoSoThuTucId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("select count(vr_vehiclerecord.id)  as total from vr_vehiclerecord,vr_vehiclegroup, vr_registeredinspection,vr_confirmedinspection");
			query.append(" where  0 = 0 ");
			query.append(" and vr_vehiclerecord.codeNumber=" + codeNumber);
			query.append(" and vr_vehiclerecord.chassisNumber='" + chassisNumber + "'");
			query.append(" and vr_vehiclerecord.engineNumber='" + engineNumber + "'");
			
			query.append(" and vr_vehiclerecord.confirmedInspectionId > 0  ");
			
			query.append(" and vr_vehiclerecord.vehiclegroupid = vr_vehiclegroup.id  ");
			query.append(" and vr_registeredinspection.id = vr_vehiclegroup.registeredinspectionid  ");
			query.append(" and vr_registeredinspection.dossierid =  " + hoSoThuTucId);
			query.append(" and vr_vehiclerecord.confirmedInspectionId = vr_confirmedinspection.id ");
			query.append(" and length(vr_confirmedinspection.corporationid) >0 ");
			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		return 0;
	}
	
	public long checkKeHoachKiemTra(long codeNumber, String chassisNumber, String engineNumber, long hoSoThuTucId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("select count(vr_vehiclerecord.id)  as total from vr_vehiclerecord,vr_vehiclegroup, vr_registeredinspection");
			query.append(" where  0 = 0 ");
			query.append(" and vr_vehiclerecord.codeNumber=" + codeNumber);
			query.append(" and vr_vehiclerecord.chassisNumber='" + chassisNumber + "'");
			query.append(" and vr_vehiclerecord.engineNumber='" + engineNumber + "'");
			
			query.append(" and vr_vehiclerecord.confirmedInspectionId > 0  ");
			
			query.append(" and vr_vehiclerecord.vehiclegroupid = vr_vehiclegroup.id  ");
			query.append(" and vr_registeredinspection.id = vr_vehiclegroup.registeredinspectionid  ");
			query.append(" and vr_registeredinspection.dossierid =  " + hoSoThuTucId);
			
			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		return 0;
	}
	
	public long checkDaPhanCongDonViKiemTra(long codeNumber, String chassisNumber, String engineNumber) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select count(*)  as total from vr_vehiclerecord ");
			query.append(" where  0 = 0 ");
			query.append(" and codeNumber=" + codeNumber);
			query.append(" and chassisNumber='" + chassisNumber + "'");
			query.append(" and engineNumber='" + engineNumber + "'");
			
			query.append(" and  inspectionRecordId =0  ");
			
			query.append(" and confirmedInspectionId > 0  ");
			
			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		return 0;
	}
	
	public long checkHoanKiemTra(long codeNumber, String chassisNumber, String engineNumber) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select count(*)  as total from vr_vehiclerecord ");
			query.append(" where  markUpStatus = 0 ");
			query.append(" and codeNumber=" + codeNumber);
			query.append(" and chassisNumber='" + chassisNumber + "'");
			query.append(" and engineNumber='" + engineNumber + "'");
			
			query.append(" confirmedInspectionId >0  ");
			
			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		return 0;
	}
	
	public VehicleRecord getVehicleRecord(long codeNumber, String chassisNumber, String engineNumber) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select *   from vr_vehiclerecord ");
			query.append(" where  markUpStatus = 0 ");
			query.append(" and codeNumber=" + codeNumber);
			query.append(" and chassisNumber='" + chassisNumber + "'");
			query.append(" and engineNumber='" + engineNumber + "'");
			
			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			log.info(" sql   " + sql);
			q.addEntity("VehicleRecord", VehicleRecordImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			List<VehicleRecord> result = (List<VehicleRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if (result != null && result.size() > 0) { return result.get(0); }
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public VehicleRecord getVehicleRecordConfirmedInspectionId(long codeNumber, String chassisNumber, String engineNumber) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select *   from vr_vehiclerecord ");
			query.append(" where  markUpStatus = 0 ");
			query.append(" and codeNumber=" + codeNumber);
			query.append(" and chassisNumber='" + chassisNumber + "'");
			query.append(" and engineNumber='" + engineNumber + "'");
			
			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("VehicleRecord", VehicleRecordImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			List<VehicleRecord> result = (List<VehicleRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if (result != null && result.size() > 0) { return result.get(0); }
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public boolean updateVehicleRecordWithConfirmedInspectionId(long confirmedInspectionId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("UPDATE  vr_vehiclerecord SET  confirmedinspectionid = 0  where confirmedinspectionid = " + confirmedInspectionId);
			
			log.info("=========updateVehicleRecordWithConfirmedInspectionId===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.executeUpdate();
			return true;
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return false;
	}
	

	public boolean updateVehicleRecordWithInspectionId(long inspectionId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("UPDATE  vr_vehiclerecord SET  inspectionrecordid = 0  where inspectionrecordid = " + inspectionId);
			
			log.info("=========updateVehicleRecordWithConfirmedInspectionId===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.executeUpdate();
			return true;
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return false;
	}

	public long countVehicleRecordWithInspectionId(long inspectionId)  {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("select count(*)  as total from vr_vehiclerecord ");
			query.append(" where  markUpStatus = 0 ");
			query.append(" and inspectionrecordid=" + inspectionId);
			
			String sql = query.toString();
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		return 0;
	}
	
	public List<VehicleRecord> searchVehicleRecord(String vehicleclass, long trangThaiCuaXe, String soKhung, 
			String soDongCo, String mauSon, String tinhTrangPhuongTien, String namSanXuat, String queryViewTimKiemHS,
		int start, int end) {
		Session session = null;
		List<VehicleRecord> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT DISTINCT dkvn_nghiepvu.vr_vehiclerecord.*  FROM dkvn_nghiepvu.vr_vehiclerecord " +
						 " INNER JOIN dkvn_nghiepvu.vr_vehiclegroup " + 
						 " ON dkvn_nghiepvu.vr_vehiclerecord.vehiclegroupid = dkvn_nghiepvu.vr_vehiclegroup.id ");
			
			query.append(" INNER JOIN ").append(StringPool.OPEN_PARENTHESIS).append(queryViewTimKiemHS).append(StringPool.CLOSE_PARENTHESIS);
			
			query.append(" AS viewloc ON dkvn_nghiepvu.vr_vehiclegroup.hosothutucid = viewloc.id");
			
			query.append(" Where 1=1 ");
			
			if (Validator.isNotNull(vehicleclass) && vehicleclass.trim().length() > 0) {
				query.append(" AND vehiclegroupid in (SELECT id FROM vr_vehiclegroup where vehicleclass = '" + vehicleclass + "') ");
			}
			
			if (trangThaiCuaXe > 0) {
				//query.append(" AND hstt.thutuchanhchinhid = " + thuTucHanhChinhId);
			}
			
			if (Validator.isNotNull(soKhung) && soKhung.trim().length() > 0) {
				query.append(" AND chassisnumber LIKE '%" + soKhung + "%'");
			}
			
			if (Validator.isNotNull(soDongCo) && soDongCo.trim().length() > 0) {
				query.append(" AND enginenumber LIKE '%" + soDongCo + "%'");
			}
			
			if (Validator.isNotNull(mauSon) && mauSon.trim().length() > 0) {
				query.append(" AND vehiclecolor LIKE '%" + mauSon + "%'");
			}
			
			if (Validator.isNotNull(tinhTrangPhuongTien) && tinhTrangPhuongTien.trim().length() > 0) {
				query.append(" AND vehicleenginestatus = " + tinhTrangPhuongTien);
			}
			
			if (Validator.isNotNull(namSanXuat) && namSanXuat.trim().length() > 0) {
				query.append(" AND productionyear = " + namSanXuat);
			}
			
			int count = end - start;
			if (start >= 0) {
				query.append(" LIMIT " + start + ", " + count);
			}
			
			log.info("=========searchVehicleRecord==start==" + start + "==count==" + count);
			log.info("=========searchVehicleRecord===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("VehicleRecord", VehicleRecordImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			result = (List<VehicleRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}
	
	public long countSearchVehicleRecord(String vehicleclass, long trangThaiCuaXe, String soKhung, String soDongCo, 
			String mauSon, String tinhTrangPhuongTien, String namSanXuat, String queryViewTimKiemHS) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			//query.append("select count(*) as total from vr_vehiclerecord where 1=1 ");
			
			query.append("SELECT count(DISTINCT  dkvn_nghiepvu.vr_vehiclerecord.id,dkvn_nghiepvu.vr_vehiclegroup.id) AS total  FROM dkvn_nghiepvu.vr_vehiclerecord " +
					 " INNER JOIN dkvn_nghiepvu.vr_vehiclegroup " + 
					 " ON dkvn_nghiepvu.vr_vehiclerecord.vehiclegroupid = dkvn_nghiepvu.vr_vehiclegroup.id ");
		
			query.append(" INNER JOIN ").append(StringPool.OPEN_PARENTHESIS).append(queryViewTimKiemHS).append(StringPool.CLOSE_PARENTHESIS);
			
			query.append(" AS viewloc ON dkvn_nghiepvu.vr_vehiclegroup.hosothutucid = viewloc.id");
			
			query.append(" Where 1=1 ");
			
			if (Validator.isNotNull(vehicleclass) && vehicleclass.trim().length() > 0) {
				query.append(" AND vehiclegroupid in (SELECT id FROM vr_vehiclegroup where vehicleclass = '" + vehicleclass.trim() + "') ");
			}
			
			if (Validator.isNotNull(soKhung) && soKhung.trim().length() > 0) {
				query.append(" AND chassisnumber LIKE'%" + soKhung + "%'");
			}
			
			if (Validator.isNotNull(soDongCo) && soDongCo.trim().length() > 0) {
				query.append(" AND enginenumber LIKE'%" + soDongCo + "%'");
			}
			
			if (Validator.isNotNull(mauSon) && mauSon.trim().length() > 0) {
				query.append(" AND vehiclecolor LIKE'%" + mauSon + "%'");
			}
			
			if (Validator.isNotNull(tinhTrangPhuongTien) && tinhTrangPhuongTien.trim().length() > 0) {
				query.append(" AND vehicleenginestatus = " + tinhTrangPhuongTien);
			}
			
			if (Validator.isNotNull(namSanXuat) && namSanXuat.trim().length() > 0) {
				query.append(" AND productionyear = " + namSanXuat);
			}
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			return 0;
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
	
	public long countBySoLuongPT(String phieuxulyphuid) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT Count(*) as total FROM dkvn_nghiepvu.vr_vehiclerecord where vr_vehiclerecord.confirmedinspectionid in (SELECT id FROM dkvn_nghiepvu.vr_confirmedinspection where vr_confirmedinspection.phieuxulyphuid in ("+ phieuxulyphuid + "))");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			return 0;
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
	public long countBySoNhomPT(String phieuxulyphuid) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT Count(Distinct vehiclegroupid) as total FROM dkvn_nghiepvu.vr_vehiclerecord where vr_vehiclerecord.confirmedinspectionid in (SELECT id FROM dkvn_nghiepvu.vr_confirmedinspection where vr_confirmedinspection.phieuxulyphuid in (" + phieuxulyphuid + "))");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			return 0;
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
	
	public List<VehicleRecord> findByConfirmedInspectionIdAndVehicleGroupId(String confirmedInspectionId, String lstVehicleGroupId){
		Session session = null;
		List<VehicleRecord> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT {vr_vehiclerecord.*} FROM vr_vehiclerecord ");
			query.append(" WHERE 1=1 ");
			if(Validator.isNotNull(confirmedInspectionId) && confirmedInspectionId.trim().length() > 0){
				query.append(" and confirmedinspectionid = '"+confirmedInspectionId+"' ");
			}
			if(Validator.isNotNull(lstVehicleGroupId) && lstVehicleGroupId.trim().length() > 0){
				query.append(" and vehiclegroupid in ("+lstVehicleGroupId+") ");
			}
			
			log.info("=========findByConfirmedInspectionIdAndVehicleGroupId==confirmedInspectionId==" + confirmedInspectionId + "==lstVehicleGroupId==" + lstVehicleGroupId);
			log.debug("=========findByConfirmedInspectionIdAndVehicleGroupId===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehicleRecordImpl.TABLE_NAME, VehicleRecordImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			result = (List<VehicleRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		}catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		return result;
	}
	
	public List<VehicleRecord> findByArrayId(String arrayId) {
		Session session = null;
		List<VehicleRecord> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT {vr_vehiclerecord.*} FROM vr_vehiclerecord ");
			
			if(Validator.isNotNull(arrayId) && arrayId.trim().length() > 0){
				query.append(" WHERE id in (" + arrayId +")");
			}
			
			log.info("=========findByArrayId==arrayId==" + arrayId);
			log.debug("=========findByArrayId===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehicleRecordImpl.TABLE_NAME, VehicleRecordImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			result = (List<VehicleRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		}catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		return result;
		
	}
	
	public boolean deleteVehicleRecordWithVehicleGroupId(long vehicleGroupId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("delete from vr_vehiclerecord where vehiclegroupid= " + vehicleGroupId);
			
			log.info("=========deleteVehicleRecordWithVehicleGroupId===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.executeUpdate();
			return true;
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return false;
	}
	public long countByIdVehicleGroupAndIdHoSoThuTuc(long idVehicleGroup, long idHoSoThuTuc) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT Count(*) as total FROM vr_vehiclerecord");
			query.append(" INNER JOIN  vr_vehiclegroup on vr_vehiclegroup.id = vr_vehiclerecord.vehiclegroupid and vr_vehiclegroup.id = " + idVehicleGroup);
			query.append(" INNER JOIN vr_registeredinspection on vr_registeredinspection.id = vr_vehiclegroup.registeredinspectionid");
			query.append(" and vr_registeredinspection.dossierid = " + idHoSoThuTuc);
			query.append(" and vr_vehiclerecord.inspectionrecordid > 0 Order by vr_vehiclerecord.id asc");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			return 0;
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
	public List<VehicleRecord> findByIdVehicleGroupAndIdHoSoThuTuc(long idVehicleGroup, long idHoSoThuTuc) {
		Session session = null;
		List<VehicleRecord> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {vr_vehiclerecord.*} FROM vr_vehiclerecord");
			query.append(" INNER JOIN  vr_vehiclegroup on vr_vehiclegroup.id = vr_vehiclerecord.vehiclegroupid and vr_vehiclegroup.id = " + idVehicleGroup);
			query.append(" INNER JOIN vr_registeredinspection on vr_registeredinspection.id = vr_vehiclegroup.registeredinspectionid");
			query.append(" and vr_registeredinspection.dossierid = " + idHoSoThuTuc);
			query.append(" Order by vr_vehiclerecord.id asc");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(VehicleRecordImpl.TABLE_NAME, VehicleRecordImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			result = (List<VehicleRecord>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		}catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		return result;
	}
}
