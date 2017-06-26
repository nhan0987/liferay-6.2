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

import vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo;
import vn.dtt.gt.dk.dao.common.model.impl.TthcBieuMauHoSoImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

/**
 * @author win_64
 */
public class TthcBieuMauHoSoFinderImpl extends BasePersistenceImpl<TthcBieuMauHoSo> implements TthcBieuMauHoSoFinder {
	
	private Log _log = LogFactoryUtil.getLog(TthcBieuMauHoSoFinderImpl.class);
	
	public List<TthcBieuMauHoSo> findTthcBieuMauHoSoByThuTucHanhChinhId(long thuTucHanhChinhId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT {tthc_bieumauhoso.*} FROM tthc_bieumauhoso where id in (SELECT bieumauhosoid FROM tthc_thanhphanhoso where thutuchanhchinhid = ? )  ");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(TthcBieuMauHoSoImpl.TABLE_NAME, TthcBieuMauHoSoImpl.class);
			
			_log.debug("=========findTthcBieuMauHoSoByThuTucHanhChinhId===" + query.toString());
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(thuTucHanhChinhId);
			
			return (List<TthcBieuMauHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<TthcBieuMauHoSo>();
	}
}
