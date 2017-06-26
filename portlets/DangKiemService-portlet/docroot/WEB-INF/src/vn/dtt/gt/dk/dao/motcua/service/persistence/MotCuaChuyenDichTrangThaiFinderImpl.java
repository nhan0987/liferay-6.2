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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CertificateRecordPersistence;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.CertificateRecordUtil;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

/**
 * The persistence implementation for the certificate record service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see CertificateRecordPersistence
 * @see CertificateRecordUtil
 * @generated
 */
public class MotCuaChuyenDichTrangThaiFinderImpl extends BasePersistenceImpl<MotCuaChuyenDichTrangThai> implements MotCuaChuyenDichTrangThaiFinder {
	
	private Log _log = LogFactoryUtil.getLog(MotCuaChuyenDichTrangThaiFinderImpl.class);
	
	public List<MotCuaChuyenDichTrangThai> findChuyenDichTrangThai(String dieuKienDichchuyen, int start, int end) {
			Session session = null;
			try {
				session = openSession();
				String sql = "SELECT {motcua_chuyendichtrangthai.*} FROM motcua_chuyendichtrangthai where 1 = 1 ";
				if (Validator.isNotNull(dieuKienDichchuyen) && dieuKienDichchuyen.trim().length() > 0) {
					sql += " AND dieukienchuyendich like '%" + dieuKienDichchuyen.trim() + "%' ";
				} 
				
				_log.info("=========findChuyenDichTrangThai===" + sql);
				_log.info("sql in  findChuyenDichTrangThai: " + sql);
				
				SQLQuery q = session.createSQLQuery(sql);
				q.setCacheable(false);
				q.addEntity(MotCuaChuyenDichTrangThaiImpl.TABLE_NAME, MotCuaChuyenDichTrangThaiImpl.class);
				
				List<MotCuaChuyenDichTrangThai> list =  (List<MotCuaChuyenDichTrangThai>) QueryUtil.list(q, getDialect(), start, end);

				return list;
				
			} catch (Exception e) {
				_log.error(e);
			} finally {
				closeSession(session);
			}
			
			return new ArrayList<MotCuaChuyenDichTrangThai>();
		}
	
		public int countChuyenDichTrangThai(String dieuKienDichchuyen) {
			Session session = null;
			try {
				session = openSession();

				String sql = "SELECT count(*) as total FROM dkvn_thutuchanhchinh.motcua_chuyendichtrangthai where 1=1 ";
				if (Validator.isNotNull(dieuKienDichchuyen) && dieuKienDichchuyen.trim().length() > 0) {
					sql += " AND dieukienchuyendich like '%" + dieuKienDichchuyen.trim() + "%' ";
				} 
				
				_log.info("=========countChuyenDichTrangThai===" + sql);
				_log.info("sql in  countChuyenDichTrangThai: " + sql);
				
				SQLQuery q = session.createSQLQuery(sql);
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
}