
package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class CfgTechnicalspecFinderImpl extends BasePersistenceImpl<CfgTechnicalspec> implements CfgTechnicalspecFinder {
	
	private static Log _log = LogFactoryUtil.getLog(CfgTechnicalspecFinderImpl.class);
	
	public static String COUNT_BY_SYNCH_DATE = CfgTechnicalspecFinder.class.getName() + ".countBySynchDate";
	
	public static String FIND_BY_SYNCH_DATE = CfgTechnicalspecFinder.class.getName() + ".findBySynchDate";
	
	public int countBySynchDate(String synchDate) 
			throws SystemException {
		
		Session session = null;
		
		try {
			session = openSession();
			
			String sql = CustomSQLUtil.get(COUNT_BY_SYNCH_DATE);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			
			_log.debug("=========countBySynchDate===" + sql);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(synchDate);
			
			Iterator itr = q.iterate();
			
			if(itr.hasNext()) {
				Long count = (Long)itr.next();
				
				if(count != null) {
					return count.intValue();
				}
			}
			
			return 0;
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<CfgTechnicalspec> findBySynchDate(String synchDate, int start, int end) 
			throws SystemException {
		
		Session session = null;
		
		try {
			session = openSession();
			
			String sql = CustomSQLUtil.get(FIND_BY_SYNCH_DATE);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(CfgTechnicalspecImpl.TABLE_NAME, CfgTechnicalspecImpl.class);
			
			_log.debug("=========findBySynchDate===" + sql);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(synchDate);
			
			return (List<CfgTechnicalspec>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<CfgTechnicalspec> findByLikeVehicleTypeCode(String likeVehicleTypeCode, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			
			if (Validator.isNotNull(likeVehicleTypeCode) && likeVehicleTypeCode.length() > 0) {
				StringBuilder sql = new StringBuilder();
				sql.append("SELECT {vr_cfg_technicalspec.*} FROM vr_cfg_technicalspec where VehicleTypeCode LIKE '" + likeVehicleTypeCode + "%'");
				sql.append(" order by CONVERT(spec_description USING utf8) COLLATE utf8_polish_ci");
				sql.append("");
				
				_log.debug("=========findByLikeVehicleTypeCode===" + sql);
				
				SQLQuery q = session.createSQLQuery(sql.toString());
				q.setCacheable(false);
				q.addEntity("vr_cfg_technicalspec", CfgTechnicalspecImpl.class);
				
				return (List<CfgTechnicalspec>) QueryUtil.list(q, getDialect(), start, end);
			}
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public List<CfgTechnicalspec> findByVehicleTypeCode(String vehicleTypeCode) {
		Session session = null;
		
		try {
			session = openSession();
			
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT {vr_cfg_technicalspec.*} FROM vr_cfg_technicalspec where VehicleTypeCode = ? ");
			sql.append(" ORDER BY sequenceno, CONVERT(spec_description USING utf8) COLLATE utf8_polish_ci");
			
			_log.debug("=========findByVehicleTypeCode===" + sql);
			
			SQLQuery q = session.createSQLQuery(sql.toString());
			q.setCacheable(false);
			q.addEntity(CfgTechnicalspecImpl.TABLE_NAME, CfgTechnicalspecImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(vehicleTypeCode);
			
			return (List<CfgTechnicalspec>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public List<String> getSpecCategoryByVehicleTypeCode(String vehicleTypeCode) {
		Session session = null;
		
		try {
			session = openSession();
			
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT spec_category FROM vr_cfg_technicalspec WHERE vehicleTypeCode = ? GROUP BY spec_category");
			sql.append(" ORDER BY sequenceno, CONVERT(spec_category USING utf8) COLLATE utf8_polish_ci");
			
			_log.debug("=========getSpecCategoryByVehicleTypeCode===" + sql);
			
			SQLQuery q = session.createSQLQuery(sql.toString());
			q.setCacheable(false);
			q.addScalar("spec_category", Type.STRING);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(vehicleTypeCode);
			
			return (List<String>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public List<String> getSpecificationCodeBySpecCategory(String[] specCategorys) {
		Session session = null;
		
		try {
			session = openSession();
			
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT specificationcode FROM vr_cfg_technicalspec WHERE 1 = 1 ");
			
			if(specCategorys != null && specCategorys.length == 1) {
				sql.append("AND spec_category = ?");
			} else if(specCategorys != null && specCategorys.length > 1) {
				sql.append("AND spec_category IN (" + StringUtil.merge(specCategorys) + ") ");
			}
			
			sql.append(" ORDER BY sequenceno, CONVERT(spec_description USING utf8) COLLATE utf8_polish_ci ");
			
			_log.debug("=========getSpecificationCodeBySpecCategory===" + sql);
			
			SQLQuery q = session.createSQLQuery(sql.toString());
			q.setCacheable(false);
			q.addScalar("specificationcode", Type.STRING);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			if(specCategorys != null && specCategorys.length == 1) {
				qPos.add(specCategorys[0]);
			}
			
			return (List<String>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
	}
}
