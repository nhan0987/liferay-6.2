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

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteImpl;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

/**
 * The persistence implementation for the debit note service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DebitNotePersistence
 * @see DebitNoteUtil
 * @generated
 */
public class DebitNoteFinderImpl extends BasePersistenceImpl<DebitNote> implements DebitNoteFinder {
	
	private Log _log = LogFactoryUtil.getLog(DebitNoteFinderImpl.class);
	
	public List<DebitNote> findDebitNote(String data, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT {vr_debitnote.*} FROM vr_debitnote where ( debitnotenumber like ").append("'%" + data.trim() + "%'").append(
				" or transactionid like ").append("'%" + data.trim() + "%'").append(") AND markasdeleted=" + Constants.MarkUpDelete_chua_xoa);
			
			_log.info("===Vinh==DebitNote====findDebitNote===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DebitNoteImpl.TABLE_NAME, DebitNoteImpl.class);
			return (List<DebitNote>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DebitNote>();
	}
	
	public List<DebitNote> findDebitNotePAID(String data, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT {vr_debitnote.*} FROM vr_debitnote where ( debitnotenumber like ").append("'%" + data.trim() + "%'").append(
				" or transactionid like ").append("'%" + data.trim() + "%'").append(") AND markasdeleted=" + Constants.MarkUpDelete_da_xoa);
			
			_log.info("===Vinh==DebitNote====findDebitNote===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DebitNoteImpl.TABLE_NAME, DebitNoteImpl.class);
			return (List<DebitNote>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DebitNote>();
	}
	
	public int countDebitNotePAID(String data) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT count(*) as total FROM vr_debitnote v where ( debitnotenumber like ").append("'%" + data.trim() + "%'").append(
				" or transactionid like ").append("'%" + data.trim() + "%'").append(" ) AND markasdeleted=" + Constants.MarkUpDelete_da_xoa);
			
			_log.info("===Vinh==DebitNote====countDebitNote===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);
			
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				
				if (count != null) { return count.intValue(); }
			}
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
	
	public List<DebitNote> thongkeDebitNotePAID(String data, String ngayXacNhanThanhToan, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT {vr_debitnote.*} FROM vr_debitnote where ( debitnotenumber like ").append("'%" + data.trim() + "%'").append(
				" or transactionid like ").append("'%" + data.trim() + "%'").append(") AND markasdeleted > " + Constants.MarkUpDelete_chua_xoa);
			if (Validator.isNotNull(ngayXacNhanThanhToan) && ngayXacNhanThanhToan.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayXacNhanThanhToan.trim());
				ngayXacNhanThanhToan = FormatData.parseDateToTring(dateFrom);
				query.append(" AND (fromdate >= '" + ngayXacNhanThanhToan + "' OR fromdate IS NULL)");
			}
			query.append(" ORDER BY fromdate desc");
			_log.info("=====DebitNote====thongkeDebitNotePAID===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DebitNoteImpl.TABLE_NAME, DebitNoteImpl.class);
			return (List<DebitNote>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DebitNote>();
	}
	
	public int countThongKeDebitNotePAID(String data, String ngayXacNhanThanhToan) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT count(*) as total FROM vr_debitnote v where ( debitnotenumber like ").append("'%" + data.trim() + "%'").append(
				" or transactionid like ").append("'%" + data.trim() + "%'").append(" ) AND markasdeleted > " + Constants.MarkUpDelete_chua_xoa);
			if (Validator.isNotNull(ngayXacNhanThanhToan) && ngayXacNhanThanhToan.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayXacNhanThanhToan.trim());
				ngayXacNhanThanhToan = FormatData.parseDateToTring(dateFrom);
				query.append(" AND (fromdate >= '" + ngayXacNhanThanhToan + "' OR fromdate IS NULL)");
			}
			_log.info("=====DebitNote====countThongKeDebitNote===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);
			
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				
				if (count != null) { return count.intValue(); }
			}
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
	
	public int countDebitNote(String data) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT count(*) as total FROM vr_debitnote v where ( debitnotenumber like ").append("'%" + data.trim() + "%'").append(
				" or transactionid like ").append("'%" + data.trim() + "%'").append(" ) AND markasdeleted=" + Constants.MarkUpDelete_chua_xoa);
			
			_log.info("===Vinh==DebitNote====countDebitNote===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);
			
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				
				if (count != null) { return count.intValue(); }
			}
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
	public List<DebitNote> findDebitNoteByIdCertificateRecord(long idCertificateRecord, int markasdelete) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("Select {vr_debitnote.*} from dkvn_nghiepvu.vr_debitnote");
			query.append(" INNER JOIN dkvn_nghiepvu.vr_debitnotedetails on vr_debitnotedetails.debitnoteid = vr_debitnote.id");
			query.append(" INNER JOIN dkvn_nghiepvu.vr_vehiclerecord on vr_debitnotedetails.vehiclerecordid = vr_vehiclerecord.id");
			query.append(" and vr_vehiclerecord.certificaterecordid = " + idCertificateRecord);
			query.append(" where dkvn_nghiepvu.vr_debitnote.markasdeleted > " + markasdelete);
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DebitNoteImpl.TABLE_NAME, DebitNoteImpl.class);
			return (List<DebitNote>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DebitNote>();
	}
}
