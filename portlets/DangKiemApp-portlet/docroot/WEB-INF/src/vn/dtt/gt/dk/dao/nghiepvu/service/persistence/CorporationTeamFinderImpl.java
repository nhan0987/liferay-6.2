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

import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationTeamImpl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

/**
 * @author win_64
 */
public class CorporationTeamFinderImpl extends BasePersistenceImpl<CorporationTeam> implements CorporationTeamFinder {

	private Log _log = LogFactoryUtil.getLog(CorporationTeamFinderImpl.class);
    
    public List<CorporationTeam> findByInspectorId(long inspectorId) {
  		Session session = null;
  		List<CorporationTeam> result = null;
  		try {
  			session = openSession();
  			
  			String sql = "SELECT {vr_corporation_team.*} FROM vr_corporation_team where corporationid in(SELECT corporationid FROM vr_corporation_inspector where inspectorid = '"+ inspectorId +"')";

  			_log.debug("=====CorporationTeam====findByInspectorId===" + sql);

  			SQLQuery q = session.createSQLQuery(sql);
  			q.setCacheable(false);
  			q.addEntity(CorporationTeamImpl.TABLE_NAME, CorporationTeamImpl.class);
  			result = (List<CorporationTeam>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
  			
  		} catch (Exception e) {
  			_log.error(e);
  		} finally {
  			closeSession(session);
  		}
  		
  		return result;
  	}
}