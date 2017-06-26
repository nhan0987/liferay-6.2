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

package vn.dtt.gt.dk.dao.aswmsg.service.persistence;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * The persistence implementation for the aswmsg validation log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AswmsgValidationLogPersistence
 * @see AswmsgValidationLogUtil
 * @generated
 */
public class AswmsgValidationLogFinderImpl extends BasePersistenceImpl<AswmsgValidationLog> implements AswmsgValidationLogFinder {
	private Log _log = LogFactoryUtil.getLog(AswmsgValidationLogFinderImpl.class);
	
	public List<AswmsgValidationLog> findByMaSoHoSo(String maSoHoSo) {
  		Session session = null;
  		try {
  			if(maSoHoSo != null && maSoHoSo.trim().length() > 0) {
	  			session = openSession();
	  			
	  			String sql = "SELECT {aswmsg_validationlog.*} FROM aswmsg_validationlog where messagelogid in (SELECT id FROM aswmsg_messagelog a where reference like '%" + maSoHoSo.trim() + "%' or prereference like '%" + maSoHoSo.trim() + "%')";
	
	  			_log.debug("=====findByMaSoHoSo======" + sql);
	
	  			SQLQuery q = session.createSQLQuery(sql);
	  			q.setCacheable(false);
	  			q.addEntity(AswmsgValidationLogImpl.TABLE_NAME, AswmsgValidationLogImpl.class);
	  			return (List<AswmsgValidationLog>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
  			}
  		} catch (Exception e) {
  			_log.error(e);
  		} finally {
  			closeSession(session);
  		}
  		
  		return new ArrayList();
  	}
}