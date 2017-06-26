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

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecImpl;
import vn.dtt.gt.dk.utils.DanhMucKey;

import java.util.List;

/**
 * The persistence implementation for the certificate record service.
 *
 * <p>
 * Caching debugrmation and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see InspectionRecordSpecPersistence
 * @see InspectionRecordSpecUtil
 * @generated
 */
public class InspectionRecordSpecFinderImpl extends BasePersistenceImpl<InspectionRecordSpec> implements InspectionRecordSpecFinder {
	
	private static Log _log = LogFactoryUtil.getLog(InspectionRecordSpecFinderImpl.class);
	
	/**
	 * Ham hien tai chi su dung voi vehicleClass=XCG
	 */
	public List<InspectionRecordSpec> findByInspectionRecordIdAndSpecCategory(long inspectionRecordId, String specCategory, String vehicleType, String vehicleTypeCode, long congThucBanhXeId) throws SystemException {
		Session session = null;
		
		try {
			session = openSession();
			
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT {vr_inspectionrecordspec.*} FROM vr_inspectionrecordspec ");
			sb.append(" LEFT JOIN vr_cfg_technicalspec ON vr_inspectionrecordspec.specificationcode=vr_cfg_technicalspec.specificationcode ");
			sb.append(" WHERE vr_inspectionrecordspec.inspectionrecordid = ? AND vr_cfg_technicalspec.spec_category = ?");
			sb.append(" AND vr_cfg_technicalspec.specificationcode NOT IN (SELECT specificationcode FROM vr_cfg_limit_technicalspec WHERE vehicletypecode = ? AND searching_drive_config = ?");
			sb.append(" AND reference_code_3 IN (SELECT code_3 FROM dkvn_thutuchanhchinh.dm_dataitem WHERE datagroupid = ? AND code_0 = ?)");
			sb.append(" AND spec_category =? ");
			sb.append(" ORDER BY vr_cfg_technicalspec.sequenceno ASC, vr_cfg_technicalspec.id ASC)");
			
			_log.debug("==findByInspectionRecordIdAndSpecCategory==" + sb.toString());
			
			SQLQuery q = session.createSQLQuery(sb.toString());
			q.setCacheable(false);
			q.addEntity("vr_inspectionrecordspec", InspectionRecordSpecImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			qPos.add(inspectionRecordId);
			qPos.add(specCategory);
			qPos.add(vehicleTypeCode);
			qPos.add(congThucBanhXeId);
			qPos.add(2);
			qPos.add(vehicleType);
			qPos.add(specCategory);
			
			return (List<InspectionRecordSpec>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}