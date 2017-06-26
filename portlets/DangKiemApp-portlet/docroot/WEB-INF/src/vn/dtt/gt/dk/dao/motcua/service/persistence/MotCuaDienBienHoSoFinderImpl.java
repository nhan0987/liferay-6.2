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

package vn.dtt.gt.dk.dao.motcua.service.persistence;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The persistence implementation for the mot cua dien bien ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaDienBienHoSoPersistence
 * @see MotCuaDienBienHoSoUtil
 * @generated
 */
public class MotCuaDienBienHoSoFinderImpl extends BasePersistenceImpl<MotCuaDienBienHoSo> implements MotCuaDienBienHoSoFinder {
	
	private Log _log = LogFactoryUtil.getLog(MotCuaDienBienHoSoFinderImpl.class);
	
	
	public List<MotCuaDienBienHoSo> findMotCuaDienBienHoSoByPhieuXuLyChinh(long phieuXuLyChinhId, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT {motcua_dienbienhoso.*} FROM motcua_dienbienhoso where phieuxulychinhid = ? order by Phieuxulychinhid, ngayxuly asc");
			_log.debug("=========findMotCuaDienBienHoSoByPhieuXuLyChinh===Phieuxulychinhid===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(MotCuaDienBienHoSoImpl.TABLE_NAME, MotCuaDienBienHoSoImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(phieuXuLyChinhId);
			
			return  (List<MotCuaDienBienHoSo>) QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<MotCuaDienBienHoSo>();
	}
	
	public int countMotCuaDienBienHoSoByPhieuXuLyChinh(long phieuXuLyChinhId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT count(*) as total FROM motcua_dienbienhoso m where phieuxulychinhid = ? order by Phieuxulychinhid, ngayxuly asc");
			_log.debug("=========countMotCuaDienBienHoSoByPhieuXuLyChinh===Phieuxulychinhid===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(phieuXuLyChinhId);
			
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			return 0;
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
	
	public List<MotCuaDienBienHoSo> findMotCuaDienBienHoSoByLatest10day(int start, int end) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT {motcua_dienbienhoso.*} FROM motcua_dienbienhoso " +
									" WHERE synchdate >= (CURRENT_TIMESTAMP - INTERVAL 10 DAY ) " + 
									" AND id = (Select max(id)  from dkvn_thutuchanhchinh.motcua_dienbienhoso abc where abc.synchdate >= (CURRENT_TIMESTAMP - INTERVAL 10 DAY )  and abc.phieuxulychinhid =  motcua_dienbienhoso.phieuxulychinhid) " + 
									" GROUP BY phieuxulychinhid order by id desc ");
			_log.debug("=========findMotCuaDienBienHoSoByLatest10day======" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(MotCuaDienBienHoSoImpl.TABLE_NAME, MotCuaDienBienHoSoImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			
			return  (List<MotCuaDienBienHoSo>) QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<MotCuaDienBienHoSo>();
	}
}