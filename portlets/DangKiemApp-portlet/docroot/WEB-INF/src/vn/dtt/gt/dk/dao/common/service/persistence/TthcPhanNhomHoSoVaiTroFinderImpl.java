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

package vn.dtt.gt.dk.dao.common.service.persistence;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro;
import vn.dtt.gt.dk.dao.common.model.impl.TthcPhanNhomHoSoVaiTroImpl;


/**
 * The persistence implementation for the tthc phan nhom ho so vai tro service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcPhanNhomHoSoVaiTroPersistence
 * @see TthcPhanNhomHoSoVaiTroUtil
 * @generated
 */
public class TthcPhanNhomHoSoVaiTroFinderImpl extends BasePersistenceImpl<TthcPhanNhomHoSoVaiTro> implements TthcPhanNhomHoSoVaiTroFinder {

	 Log _log = LogFactoryUtil.getLog(TthcPhanNhomHoSoVaiTroFinderImpl.class);
    
    public List<TthcPhanNhomHoSoVaiTro> findTthcPhanNhomHoSoVaiTroByPhanNhomHoSoAndVaiTroXuLy(long phanNhomHoSoId, String vaitroxuly) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT {tthc_phannhomhoso_vaitro.*} FROM tthc_phannhomhoso_vaitro where phannhomhosoid = " + phanNhomHoSoId + " and vaitroxuly in (" + vaitroxuly + ")");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(TthcPhanNhomHoSoVaiTroImpl.TABLE_NAME, TthcPhanNhomHoSoVaiTroImpl.class);
			
			_log.debug("=========findTthcPhanNhomHoSoVaiTroByPhanNhomHoSoAndVaiTroXuLy===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
 
			return (List<TthcPhanNhomHoSoVaiTro>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<TthcPhanNhomHoSoVaiTro>();
	}
}