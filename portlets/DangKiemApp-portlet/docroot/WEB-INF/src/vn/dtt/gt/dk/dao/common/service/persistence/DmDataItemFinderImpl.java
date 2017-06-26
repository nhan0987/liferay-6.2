package vn.dtt.gt.dk.dao.common.service.persistence;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.model.impl.DmDataItemImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;


public class DmDataItemFinderImpl extends BasePersistenceImpl<DmDataItem> implements DmDataItemFinder {
	
	private static Log log = LogFactoryUtil.getLog(DmDataItemFinderImpl.class);
	
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
	
	public List<DmDataItem> findDmDataItemByDataGroupIdAndLevelAndCode1(long groupId, int level, String code_1) 
			throws SystemException {
		
		Session session = null;
		
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {dm_dataitem.*} FROM dm_dataitem where datagroupid = ? and Level = ? and Code_1 = ? order by CONVERT(name USING utf8) COLLATE utf8_polish_ci");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========findDmDataItemByDataGroupIdAndLevelAndCode1===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(groupId);
			qPos.add(level);
			qPos.add(code_1);

			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException();
		} finally {
			closeSession(session);
		}
	}
	
	public List<DmDataItem> findDmDataItemByDataGroupIdAndLevelAndCode1OrderByDescription(long groupId, int level, String code_1) 
			throws SystemException {
		
		Session session = null;
		
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {dm_dataitem.*} FROM dm_dataitem where datagroupid = ? and Level = ? and Code_1 = ? order by length(Description), Description");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========findDmDataItemByDataGroupIdAndLevelAndCode1OrderByDescription===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(groupId);
			qPos.add(level);
			qPos.add(code_1);

			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException();
		} finally {
			closeSession(session);
		}
	}
	
	public List<DmDataItem> findByGC_C0_C1_C2_C3_L_AN(long dataGroupId, String code_0, 
			String code_1, String code_2, String code_3, Integer level, String alterName) 
		throws SystemException {
		
		Session session = null;
		
		try {
			session = openSession();
			
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT {dm_dataitem.*} FROM dm_dataitem WHERE status = 1 AND datagroupid = ? ");
			
			if(Validator.isNotNull(code_0)) {
				sb.append(" AND dm_dataitem.code_0 = ? ");
			}
			
			if(Validator.isNotNull(code_1)) {
				sb.append(" AND dm_dataitem.code_1 = ? ");
			}
			
			if(Validator.isNotNull(code_2)) {
				sb.append(" AND dm_dataitem.code_2 = ? ");
			}
			
			if(Validator.isNotNull(code_3)) {
				sb.append(" AND dm_dataitem.code_3 = ? ");
			}
			
			if(Validator.isNotNull(level)) {
				sb.append(" AND dm_dataitem.level = ? ");
			}
			
			if(Validator.isNotNull(alterName)) {
				sb.append(" AND dm_dataitem.alterName = ? ");
			}
			
			SQLQuery q = session.createSQLQuery(sb.toString());
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			log.debug("=========findByDGN_C0_C1_C2_C3_level_AN===" + sb.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			
			qPos.add(dataGroupId);
			
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
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

}
