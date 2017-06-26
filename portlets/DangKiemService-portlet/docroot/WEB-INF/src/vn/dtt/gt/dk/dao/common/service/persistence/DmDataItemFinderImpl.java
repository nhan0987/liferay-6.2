package vn.dtt.gt.dk.dao.common.service.persistence;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.model.impl.DmDataItemImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class DmDataItemFinderImpl extends BasePersistenceImpl<DmDataItem> implements DmDataItemFinder {
	
	private static Log log = LogFactoryUtil.getLog(DmDataItemFinderImpl.class);
	
	public static String COUNT_BY_SYNCH_DATE = DmDataItemFinder.class.getName() + ".countBySynchDate";
	
	public static String FIND_BY_SYNCH_DATE = DmDataItemFinder.class.getName() + ".findBySynchDate";
	
	public static String FIND_BY_GROUP_CODE = DmDataItemFinder.class.getName() + ".findByGroupCode";
	
	public static String FIND_BY_GC_C0_S = DmDataItemFinder.class.getName() + ".findByGC_C0_S";
	
	public static String FIND_BY_VALIDATE_FROM = DmDataItemFinder.class.getName() + ".findByValidateFrom";
	
	public static String FIND_BY_GN_C0_C1_C2_C3_L_AN = DmDataItemFinder.class.getName() + ".findByGN_C0_C1_C2_C3_L_AN";
	
	public static String FIND_BY_GC_C0_C1_C2_C3_L_AN = DmDataItemFinder.class.getName() + ".findByGC_C0_C1_C2_C3_L_AN";
	
	public static String COUNT_HO_SO_NGHIEP_VU_BY_SYNCH_DATE = DmDataItemFinder.class.getName() + ".count_HO_SO_NGHIEP_VU_BySynchDate";
	
	public static String FIND_HO_SO_NGHIEP_VU_BY_SYNCH_DATE = DmDataItemFinder.class.getName() + ".find_HO_SO_NGHIEP_VU_BySynchDate";
	
	public int countBySynchDate(String synchDate) 
			throws SystemException {
		
		Session session = null;
		
		try {
			Date date = new Date();
			date.setTime(GetterUtil.getLong(synchDate));
			Timestamp synchDateGT_TS = CalendarUtil.getTimestamp(date);
			
			session = openSession();
			
			String sql = CustomSQLUtil.get(COUNT_BY_SYNCH_DATE);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			
			log.debug("=========countBySynchDate===" + sql);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(synchDateGT_TS);
			
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
	
	public int countHoSoNghiepVuBySynchDate(String schema, String tableName, String column, String synchDate) 
			throws SystemException {
		
		Session session = null;
		
		try {
			Date date = new Date();
			date.setTime(GetterUtil.getLong(synchDate));
			Timestamp synchDateGT_TS = CalendarUtil.getTimestamp(date);
			
			session = openSession();
			
			String sql = CustomSQLUtil.get(COUNT_HO_SO_NGHIEP_VU_BY_SYNCH_DATE);
			
			if(Validator.isNotNull(schema)) {
				sql = StringUtil.replace(sql, "[$SCHEMA$]", schema);
			} else {
				sql = StringUtil.replace(sql, "[$SCHEMA$].", StringPool.BLANK);
			}
			
			sql = StringUtil.replace(sql, "[$TABLE_NAME$]", tableName);
			
			if(Validator.isNotNull(column)) {
				sql = StringUtil.replace(sql, "[$COLUMN$]", column);
			} else {
				sql = StringUtil.replace(sql, "AND [$COLUMN$] >= ?", StringPool.BLANK);
			}
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			
			log.debug("=========countHoSoNghiepVuBySynchDate===" + sql);
			QueryPos qPos = QueryPos.getInstance(q);
			
			if(Validator.isNotNull(column)) {
				qPos.add(synchDateGT_TS);
			}
			
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
	
	public List<DmDataItem> findByDmDataGroupCode(String dmDataGroupCode, int start, int end) 
		throws SystemException {
		
		Session session = null;
		
		try {
			session = openSession();
			
			String sql = CustomSQLUtil.get(FIND_BY_GROUP_CODE);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(dmDataGroupCode);
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<DmDataItem> findBySynchDate(String synchDate, int start, int end) 
			throws SystemException {
		
		Session session = null;
		
		try {
			Date date = new Date();
			date.setTime(GetterUtil.getLong(synchDate));
			Timestamp synchDateGT_TS = CalendarUtil.getTimestamp(date);
			
			session = openSession();
			
			String sql = CustomSQLUtil.get(FIND_BY_SYNCH_DATE);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========findByValidateFrom===" + sql);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(synchDateGT_TS);
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<Object> findHoSoNghiepVuBySynchDate(String schema, String tableName, 
			String column, Class<?> entityClass, String synchDate, int start, int end) 
		throws SystemException {
		
		Session session = null;
		
		try {
			Date date = new Date();
			date.setTime(GetterUtil.getLong(synchDate));
			Timestamp synchDateGT_TS = CalendarUtil.getTimestamp(date);
			
			session = openSession();
			
			String sql = CustomSQLUtil.get(FIND_HO_SO_NGHIEP_VU_BY_SYNCH_DATE);
			
			if(Validator.isNotNull(schema)) {
				sql = StringUtil.replace(sql, "[$SCHEMA$]", schema);
			} else {
				sql = StringUtil.replace(sql, "[$SCHEMA$].", StringPool.BLANK);
			}
			
			sql = StringUtil.replace(sql, "[$TABLE_NAME$]", tableName);
			
			if(Validator.isNotNull(column)) {
				sql = StringUtil.replace(sql, "[$COLUMN$]", column);
			} else {
				sql = StringUtil.replace(sql, "AND [$COLUMN$] >= ?", StringPool.BLANK);
			}
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(tableName, entityClass);
			
			log.debug("=========findHoSoNghiepVuBySynchDate===" + sql);
			QueryPos qPos = QueryPos.getInstance(q);
			
			if(Validator.isNotNull(column)) {
				qPos.add(synchDateGT_TS);
			}
			
			return (List<Object>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<DmDataItem> findByValidateFrom(String validatefrom, int start, int end) 
			throws SystemException {
		
		Session session = null;
		
		try {
			session = openSession();
			
			String sql = CustomSQLUtil.get(FIND_BY_VALIDATE_FROM);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========findByValidateFrom===" + sql);
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(validatefrom);
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	/**
	 * Ham tra ve ban ghi duy nhat va moi nhat theo dataGroupCode, va code_0
	 * 
	 * @param groupCode
	 * @param code_0
	 * @return
	 * @throws SystemException
	 */
	public DmDataItem findByDataGroupCodeAndDataItemCode0(String groupCode, String code_0) 
			throws SystemException {
		
		Session session = null;
		
		try {
			session = openSession();
			
			String sql = CustomSQLUtil.get(FIND_BY_GC_C0_S);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========findByDataGroupCodeAndDataItemCode0===" + sql.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(groupCode);
			qPos.add(code_0);
			
			Iterator itr = q.iterate();
			
			DmDataItem dataItem = null;
			
			if(itr.hasNext()) {
				dataItem = (DmDataItem) itr.next();
			}
			
			return dataItem;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<DmDataItem> findByGN_C0_C1_C2_C3_L_AN(String dataGroupName, String code_0, 
			String code_1, String code_2, String code_3, Integer level, String alterName, int start, int end) 
		throws SystemException {
		
		Session session = null;
		
		try {
			session = openSession();
			
			String sql = CustomSQLUtil.get(FIND_BY_GN_C0_C1_C2_C3_L_AN);
			
			if(Validator.isNull(code_0)) {
				sql = StringUtil.replace(sql, "AND dm_dataitem.code_0 = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(code_1)) {
				sql = StringUtil.replace(sql, "AND dm_dataitem.code_1 = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(code_2)) {
				sql = StringUtil.replace(sql, "AND dm_dataitem.code_2 = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(code_3)) {
				sql = StringUtil.replace(sql, "AND dm_dataitem.code_3 = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(level)) {
				sql = StringUtil.replace(sql, "AND dm_dataitem.level = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(alterName)) {
				sql = StringUtil.replace(sql, "AND dm_dataitem.alterName = ?", StringPool.BLANK);
			}
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========findByDGN_C0_C1_C2_C3_level_AN===" + sql );
			QueryPos qPos = QueryPos.getInstance(q);
			
			qPos.add(StringUtil.lowerCase(dataGroupName));
			
			if(Validator.isNotNull(code_0)) {
				qPos.add(code_0);
			}
			
			if(Validator.isNotNull(code_1)) {
				qPos.add(code_1);
			}
			
			if(Validator.isNotNull(code_2)) {
				qPos.add(code_2);
			}
			
			if(Validator.isNotNull(code_3)) {
				qPos.add(code_3);
			}
			
			if(Validator.isNotNull(level)) {
				qPos.add(level);
			}
			
			if(Validator.isNotNull(alterName)) {
				qPos.add(alterName);
			}
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<DmDataItem> findByGC_C0_C1_C2_C3_L_AN(String dataGroupCode, String code_0, 
			String code_1, String code_2, String code_3, Integer level, String alterName, int start, int end) 
		throws SystemException {
		
		Session session = null;
		
		try {
			session = openSession();
			
			String sql = CustomSQLUtil.get(FIND_BY_GC_C0_C1_C2_C3_L_AN);
			
			if(Validator.isNull(code_0)) {
				sql = StringUtil.replace(sql, "AND dm_dataitem.code_0 = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(code_1)) {
				sql = StringUtil.replace(sql, "AND dm_dataitem.code_1 = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(code_2)) {
				sql = StringUtil.replace(sql, "AND dm_dataitem.code_2 = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(code_3)) {
				sql = StringUtil.replace(sql, "AND dm_dataitem.code_3 = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(level)) {
				sql = StringUtil.replace(sql, "AND dm_dataitem.level = ?", StringPool.BLANK);
			}
			
			if(Validator.isNull(alterName)) {
				sql = StringUtil.replace(sql, "AND dm_dataitem.alterName = ?", StringPool.BLANK);
			}
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========findByGC_C0_C1_C2_C3_L_AN===" + sql );
			QueryPos qPos = QueryPos.getInstance(q);
			
			qPos.add(StringUtil.lowerCase(dataGroupCode));
			
			if(Validator.isNotNull(code_0)) {
				qPos.add(code_0);
			}
			
			if(Validator.isNotNull(code_1)) {
				qPos.add(code_1);
			}
			
			if(Validator.isNotNull(code_2)) {
				qPos.add(code_2);
			}
			
			if(Validator.isNotNull(code_3)) {
				qPos.add(code_3);
			}
			
			if(Validator.isNotNull(level)) {
				qPos.add(level);
			}
			
			if(Validator.isNotNull(alterName)) {
				qPos.add(alterName);
			}
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public List<DmDataItem> findByDmDataGroupCode(String dmDataGroupCode) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {dm_dataitem.*} FROM dm_dataitem where datagroupid in ");
			query.append("(SELECT code FROM dm_datagroup where name = '" + dmDataGroupCode + "') order by CONVERT(name USING utf8) COLLATE utf8_polish_ci");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========findByDmDataGroupCode===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public List<DmDataItem> findByArrayCode0(String arrayCode0) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {dm_dataitem.*} FROM dm_dataitem where code_0 in (" + arrayCode0 + ")");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========findByArrayCode0===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public List<DmDataItem> findBySpecificationCode(String specificationcode, String vehicleClass) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {dm_dataitem.*} FROM dm_dataitem where ( altername='"+vehicleClass.trim()+"' or altername is null or altername='' ) and datagroupid in ");
			query.append("(SELECT datagroupid FROM dkvn_nghiepvu.vr_cfg_technicalspec where specificationcode = '" + specificationcode + "') order by CONVERT(name USING utf8) COLLATE utf8_polish_ci");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========findBySpecificationCode===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DmDataItem>();
	}
	
	public List<DmDataItem> findByVehicleClassAndDatagroupid(long datagroupid, String vehicleClass) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {dm_dataitem.*} FROM dm_dataitem where ( altername like '"+vehicleClass.trim()+"%' or altername is null or altername='' ) and datagroupid= "+datagroupid);
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========findByVehicleClassAndDatagroupid===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DmDataItem>();
	}
	public List<DmDataItem> findByVehicleClassAndDatagroupidByLoaiPhuongTien(long datagroupid, String vehicleClass) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {dm_dataitem.*} FROM dm_dataitem where ( altername like '%"+vehicleClass.trim()+"%' and level > 1 ) and datagroupid= "+datagroupid);
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========findByVehicleClassAndDatagroupid===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DmDataItem>();
	}
	
	public List<DmDataItem> findBySpecificationCodeAndspecificationvalue(String specificationcode, String specificationvalue, String vehicleClass) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {dm_dataitem.*} FROM dm_dataitem where ");
			//query.append("( altername='" + vehicleClass.trim() + "' or altername is null or altername='' ) ");
			//query.append("and code_0='" + specificationvalue + "' ");
			query.append("code_0 = ? ");
			query.append("and datagroupid in ");
			query.append("");
			query.append("( SELECT datagroupid FROM dkvn_nghiepvu.vr_cfg_technicalspec where specificationcode = ?) order by CONVERT(name USING utf8) COLLATE utf8_polish_ci");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========findBySpecificationCodeAndspecificationvalue===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(specificationvalue);
			qPos.add(specificationcode);
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DmDataItem>();
	}
	
	public List<DmDataItem> findByDmDataGroupCodeAndLevelAlterName(String dmDataGroupCode, int level, String alterName) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {dm_dataitem.*} FROM dm_dataitem where ");
			query.append("level = '" + level + "' and ");
			query.append("altername = '" + alterName + "' and ");
			query.append("datagroupid in ");
			query.append("(SELECT code FROM dm_datagroup where name = '" + dmDataGroupCode + "') order by CONVERT(name USING utf8) COLLATE utf8_polish_ci");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========findByDmDataGroupCodeAndLevelAlterName===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public List<DmDataItem> findByDmDataGroupCodeAndLevel(String dataGroupCode, int level) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {dm_dataitem.*} FROM dm_dataitem where ");
			query.append("level = '" + level + "' and ");
			query.append("datagroupid in ");
			query.append("(SELECT code FROM dm_datagroup where name = '" + dataGroupCode + "') order by CONVERT(name USING utf8) COLLATE utf8_polish_ci");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========findByDataGroupCodeAndLevel===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);

			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DmDataItem>();
	}
	
	public List<DmDataItem> findByDataGroupCodeNameAndDataItemAlterName(String groupName, String alterName) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {dm_dataitem.*} FROM dm_dataitem where altername = ? and datagroupid in (SELECT code FROM dm_datagroup where name = ?) order by CONVERT(name USING utf8) COLLATE utf8_polish_ci");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========findByDataGroupCodeNameAndDataItemAlterName===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(alterName);
			qPos.add(groupName);
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DmDataItem>();
	}
	
	public List<DmDataItem> findByGroupName_AlterName(String groupName, String alterName) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {dm_dataitem.*} FROM dm_dataitem where altername = ? and datagroupid in (SELECT code FROM dm_datagroup where name = ?) ORDER BY CAST(code_1 as unsigned)");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========findByGroupCode_AlterName===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(alterName);
			qPos.add(groupName);
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DmDataItem>();
	}
	
	
	public List<DmDataItem> findByNameGroupAndMultilAlterName(String groupName, String alterName1, String alterName2) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {dm_dataitem.*} FROM dm_dataitem where altername in ('" + alterName1+"', '" + alterName2 + "') and datagroupid in (SELECT code FROM dm_datagroup where name = ?) order by CONVERT(name USING utf8) COLLATE utf8_polish_ci");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========findByDataGroupCodeNameAndDataItemAlterName===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(groupName);
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DmDataItem>();
	}
	

	
	public List<DmDataItem> findDmDataItemByDataGroupIdAndLevel(long groupId, int level) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {dm_dataitem.*} FROM dm_dataitem where datagroupid = ? and Level = ? order by CONVERT(name USING utf8) COLLATE utf8_polish_ci");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========findDmDataItemByDataGroupIdAndLevel===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(groupId);
			qPos.add(level);

			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DmDataItem>();
	}
	
	public List<DmDataItem> findByDataGroupCodeNameAndDataItemCode0(String groupName, String code_0) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {dm_dataitem.*} FROM dm_dataitem where code_0 = ? and datagroupid in (SELECT code FROM dm_datagroup where name = ?) order by CONVERT(name USING utf8) COLLATE utf8_polish_ci");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========findByDataGroupCodeNameAndDataItemCode0===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(code_0);
			qPos.add(groupName);
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DmDataItem>();
	}

	
	public DmDataItem getByDataGroupCodeNameAndDataItemCode0(String groupName, String code_0) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {dm_dataitem.*} FROM dm_dataitem where code_0 = ? and datagroupid in (SELECT code FROM dm_datagroup where name = ?) order by CONVERT(name USING utf8) COLLATE utf8_polish_ci");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========getByDataGroupCodeNameAndDataItemCode0===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(code_0);
			qPos.add(groupName);
			
			List<DmDataItem> lst = (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if (lst != null && lst.size() > 0) {
				return lst.get(0);
			}
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public DmDataItem getByDmDataGroupCodeNameAndCode0AndLevel(String dmDataGroupCodeName, String code_0, int level) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {dm_dataitem.*} FROM dm_dataitem ");
			query.append("where code_0 = ? and level = ? and datagroupid in (SELECT code FROM dm_datagroup where name = ?) order by CONVERT(name USING utf8) COLLATE utf8_polish_ci");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========getByDmDataGroupCodeNameAndCode0AndLevel===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(code_0);
			qPos.add(level);
			qPos.add(dmDataGroupCodeName);
			
			List<DmDataItem> lst = (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if (lst != null && lst.size() > 0) {
				return lst.get(0);
			}
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		return null;
	}

}
