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

import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoImpl;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDongBoMTgatewayImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The persistence implementation for the mot cua dong bo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaDongBoMTgatewayPersistence
 * @see MotCuaDongBoMTgatewayUtil
 * @generated
 */
public class MotCuaDongBoMTgatewayFinderImpl extends BasePersistenceImpl<MotCuaDongBoMTgateway> implements MotCuaDongBoMTgatewayFinder {
	
	private Log _log = LogFactoryUtil.getLog(MotCuaDongBoMTgatewayFinderImpl.class);
	
	
	public List<MotCuaDongBoMTgateway> findHoSoByPhieuXuLyChinh(long phieuXuLyChinhId, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT {motcua_dongbomtgateway.*} FROM dkvn_thutuchanhchinh.motcua_dongbomtgateway where phieuxulychinhid = ? order by modifydate asc");
			_log.debug("=========findHoSoByPhieuXuLyChinh===Phieuxulychinhid===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(MotCuaDongBoMTgatewayImpl.TABLE_NAME, MotCuaDongBoMTgatewayImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(phieuXuLyChinhId);
			
			return  (List<MotCuaDongBoMTgateway>) QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<MotCuaDongBoMTgateway>();
	}
	
	public List<MotCuaDongBoMTgateway> findByTrangthaiDongbo(String trangthai, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT {motcua_dongbomtgateway.*} FROM dkvn_thutuchanhchinh.motcua_dongbomtgateway where trangthai = ? order by modifydate asc");
			_log.debug("=========findByTrangthaiDongbo===trangthai===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(MotCuaDongBoMTgatewayImpl.TABLE_NAME, MotCuaDongBoMTgatewayImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(trangthai);
			
			return  (List<MotCuaDongBoMTgateway>) QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<MotCuaDongBoMTgateway>();
	}
	
	public MotCuaDongBoMTgateway findLatestHosoDongboByHosothutucId(long phieuXuLyChinhId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT {motcua_dongbomtgateway.*} FROM dkvn_thutuchanhchinh.motcua_dongbomtgateway where phieuxulychinhid = ? AND dienbienhosoid = (Select max(dienbienhosoid)  from dkvn_thutuchanhchinh.motcua_dongbomtgateway where phieuxulychinhid = ? ) ");
			_log.debug("=========findLatestHosoDongboByHosothutucId===trangthai===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(MotCuaDongBoMTgatewayImpl.TABLE_NAME, MotCuaDongBoMTgatewayImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(phieuXuLyChinhId);
			qPos.add(phieuXuLyChinhId);
			List<MotCuaDongBoMTgateway> lstDongBoMTGATEWAY = (List<MotCuaDongBoMTgateway>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if ((lstDongBoMTGATEWAY != null ) && (lstDongBoMTGATEWAY.size() > 0)) {
				return lstDongBoMTGATEWAY.get(0);
			} else {
				return null;
			}			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	
	public int countByPhieuXuLyChinh(long phieuXuLyChinhId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT count(*) as total FROM dkvn_thutuchanhchinh.motcua_dongbomtgateway m where phieuxulychinhid = ? order by dienbienhosoid asc");
			_log.debug("=========countMotCuaDongBoMTgatewayByPhieuXuLyChinh===Phieuxulychinhid===" + query.toString());
			
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
	
	public int countByDienbienHosoIdandPhieuXuLyChinhId(long dienBienHoSoId, long phieuXuLyChinhId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT count(*) as total FROM motcua_dongbomtgateway m where dienBienHoSoId = ? and phieuxulychinhid = ? order by dienBienHoSoId asc");
			_log.debug("=========countMotCuaDongBoMTgatewayByDienbienHosoIdandPhieuXuLyChinhId======" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.addScalar("total", Type.LONG);
			q.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(dienBienHoSoId);
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
}