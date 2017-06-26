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

import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

/**
 * @author win_64
 */
public class RegisteredInspectionFinderImpl extends BasePersistenceImpl<RegisteredInspection> implements RegisteredInspectionFinder {

	private Log _log = LogFactoryUtil.getLog(RegisteredInspectionFinderImpl.class);
    
    public RegisteredInspection findDanhSachHoSo(long phieuXuLyPhuId) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT {vr_registeredinspection.*} FROM vr_registeredinspection where dossierid in (SELECT pxlc.hosothutucid from dkvn_thutuchanhchinh.motcua_phieuxulychinh pxlc where pxlc.id = " + phieuXuLyPhuId + ")");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(RegisteredInspectionImpl.TABLE_NAME, RegisteredInspectionImpl.class);
			
			_log.debug("=========findDanhSachHoSoRegisteredInspection===" + query.toString());
			QueryPos qPos = QueryPos.getInstance(q);
			
			return (RegisteredInspection)q.uniqueResult();
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
    
	public int countSoHoSoDangKyKiemTra(long idRegisteredInspection)
			throws SystemException {
			
			Session session = null;
			try {
				session = openSession();
				
				StringBuilder query = new StringBuilder("select count(*) as total from dkvn_nghiepvu.vr_registeredinspection as a join dkvn_nghiepvu.vr_confirmedinspection as b on a.id = b.registeredinspectionid where b.registeredinspectionid = '" + idRegisteredInspection+"' ");
				
				
				SQLQuery q = session.createSQLQuery(query.toString());
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
}