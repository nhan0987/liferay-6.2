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

import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorImpl;
import vn.dtt.gt.dk.utils.format.FormatData;

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

/**
 * The persistence implementation for the corporation inspector service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see CorporationInspectorPersistence
 * @see CorporationInspectorUtil
 * @generated
 */
public class CorporationInspectorFinderImpl extends BasePersistenceImpl<CorporationInspector> implements CorporationInspectorFinder {
	
	private Log _log = LogFactoryUtil.getLog(CorporationInspectorFinderImpl.class);
	
	public List<Long> findUserLiferayNotHaveCorporationInspector(String schemaLifeay) {
		Session session = null;
		try {
			session = openSession();
			
			String sql = "SELECT userId FROM user_ u where emailAddress not like '%liferay.com%' and userId not in (SELECT inspectorid FROM vr_corporation_inspector v)";
			
			if (schemaLifeay != null && schemaLifeay.trim().length() > 0) {
				//sql = "SELECT userId FROM " + schemaLifeay + ".user_ u where emailAddress not like '%liferay.com%' and userId not in (SELECT inspectorid FROM vr_corporation_inspector v)";
				sql = "select p.userId from (SELECT u.userId, c.inspectorid  FROM " + schemaLifeay + ".user_ u left join vr_corporation_inspector c ";
				sql += " on u.userId = c.inspectorid where u.emailAddress not like '%liferay.com%' and c.inspectorid is null) p";
			}
			
			_log.info("========findUserLiferayNotHaveCorporationInspector===" + sql);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			
			return (List<Long>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return new ArrayList<Long>();
	}
	public boolean deleteDangKiemVien(long corporationInspectorId) {
		Session session = null;
		//	List<VehicleRecord> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("UPDATE dkvn_nghiepvu.vr_corporation_inspector vr SET vr.inspectorid = NULL, vr.inspectoremail = NULL ");
			query.append("where vr.id = " + corporationInspectorId);
			
			SQLQuery q = session.createSQLQuery(query.toString());
			_log.info("========deleteDangKiemVien====="+query.toString());
			q.setCacheable(false);
			q.executeUpdate();
			//q.setCacheable(false);
			return true;
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return false;
	}
	public List<CorporationInspector> findDanhSachDangKiemVien(int start, int end) {
			Session session = null;
			try {
				session = openSession();
				String sql =
					"SELECT {vr_corporation_inspector.*} FROM vr_corporation_inspector where (inspectorid IS NOT NULL) AND (inspectoremail IS NOT NULL AND LENGTH(inspectoremail) > 0)";
				
				int count = end-start;
				if(start>=0){
					sql=sql+ " limit "+start+","+count;
				}			
				SQLQuery q = session.createSQLQuery(sql);
				_log.info("========findDanhSachDangKiemVien====="+sql);
				q.setCacheable(false);
				q.addEntity(CorporationInspectorImpl.TABLE_NAME, CorporationInspectorImpl.class);
				
				QueryPos qPos = QueryPos.getInstance(q);
				
				return (List<CorporationInspector>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				
			} catch (Exception e) {
				_log.error(e);
			} finally {
				closeSession(session);
			}
			
			return new ArrayList<CorporationInspector>();
		}
	public int countDanhSachDangKiemVien() throws SystemException {
			
			Session session = null;
			try {
				session = openSession();
				
				StringBuilder query = new StringBuilder("SELECT count(*) as total FROM dkvn_nghiepvu.vr_corporation_inspector where (inspectorid IS NOT NULL) AND (inspectoremail IS NOT NULL AND LENGTH(inspectoremail) > 0)");
				
				SQLQuery q = session.createSQLQuery(query.toString());
				_log.info("========countDanhSachDangKiemVien====="+query.toString());
				q.addScalar("total", Type.LONG);
				q.setCacheable(false);
				
				QueryPos qPos = QueryPos.getInstance(q);
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
	public List<CorporationInspector> findDanhSachDangKiemVienByTeam(long userId) {
		Session session = null;
		try {
			session = openSession();
			String sql =
				"SELECT {vr_corporation_inspector.*} FROM vr_corporation_inspector where (inspectorid IS NOT NULL) AND (inspectoremail IS NOT NULL AND LENGTH(inspectoremail) > 0) AND corporationid in (select corporationid from dkvn_nghiepvu.vr_corporation_view where isleader =1 and inspectorid = " + userId + " ) order by corporationid, REVERSE( SUBSTRING( REVERSE( inspectorname ), 1, LOCATE( ' ', REVERSE(inspectorname ))))";
			
			SQLQuery q = session.createSQLQuery(sql);
			_log.info("========findDanhSachDangKiemVienByTeam====="+sql);
			q.setCacheable(false);
			q.addEntity(CorporationInspectorImpl.TABLE_NAME, CorporationInspectorImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			return (List<CorporationInspector>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<CorporationInspector>();
	}
}
