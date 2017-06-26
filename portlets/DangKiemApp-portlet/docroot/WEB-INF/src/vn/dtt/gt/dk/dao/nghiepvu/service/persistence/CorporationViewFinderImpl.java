
package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewImpl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class CorporationViewFinderImpl extends BasePersistenceImpl<CorporationView> implements CorporationViewFinder {
	
	private Log log = LogFactoryUtil.getLog(CorporationViewFinderImpl.class);
	
	public List<CorporationView> findCorporationView(long inspectorid, int isleader) {
		Session session = null;
		List<CorporationView> lstView = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {vr_corporation_view.*} FROM vr_corporation_view ");
			query.append(" where 1=1 ");
			if (inspectorid > 0) {
				query.append(" and inspectorid = " + inspectorid);
			}
			
			query.append(" and isleader = " + isleader);
			
			SQLQuery q = session.createSQLQuery(query.toString());
			
			log.debug("=======findCorporationView==========" + query.toString());
			
			q.setCacheable(false);
			q.addEntity(CorporationViewImpl.TABLE_NAME, CorporationViewImpl.class);
			
			lstView = (List<CorporationView>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return lstView;
	}
	
	public List<CorporationView> findCorporationView(long inspectorid) {
		Session session = null;
		List<CorporationView> lstView = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {vr_corporation_view.*} FROM vr_corporation_view ");
			query.append(" where 1=1 ");
			if (inspectorid > 0) {
				query.append(" and inspectorid = " + inspectorid);
			}
			
			SQLQuery q = session.createSQLQuery(query.toString());
			log.debug("=======findCorporationView==========" + query.toString());
			q.setCacheable(false);
			q.addEntity(CorporationViewImpl.TABLE_NAME, CorporationViewImpl.class);
			
			lstView = (List<CorporationView>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return lstView;
	}
	
	public List<CorporationView> findByDanhSachDangKiemVienTheoDoi(String corporationId) {
		Session session = null;
		List<CorporationView> lstView = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {vr_corporation_view.*} FROM vr_corporation_view INNER join dkvn_nghiepvu.vr_corporation_inspector corporationinspector on corporationinspector.inspectorid = vr_corporation_view.inspectorid ");
			query.append(" where 1=1 ");
			if (Validator.isNotNull(corporationId) && corporationId.trim().length() >0) {
				query.append(" and vr_corporation_view.corporationid = " + corporationId);
			}
			query.append(" and (corporationinspector.inspectoremail IS NOT NULL AND LENGTH(corporationinspector.inspectoremail) > 0) ");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			
			log.debug("=======findByDanhSachDangKiemVienTheoDoi==========" + query.toString());
			
			q.setCacheable(false);
			q.addEntity(CorporationViewImpl.TABLE_NAME, CorporationViewImpl.class);
			
			lstView = (List<CorporationView>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return lstView;
	}
}
