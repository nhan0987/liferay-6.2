
package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryImpl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class ProductionCountryFinderImpl extends BasePersistenceImpl<ProductionCountry> implements ProductionCountryFinder {
	
	private Log log = LogFactoryUtil.getLog(ProductionCountryFinderImpl.class);
	
	public List<ProductionCountry> findByArrayCountryCode(String arrayCountryCode) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {vr_productioncountry.*} FROM vr_productioncountry ");
			
			if (Validator.isNotNull(arrayCountryCode) && arrayCountryCode.length() > 0) {
				query.append("where countrycode in (" + arrayCountryCode + ")");
			}
			
			log.debug("=====ProductionCountry====findByArrayCountryCode===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(ProductionCountryImpl.TABLE_NAME, ProductionCountryImpl.class);
			return (List<ProductionCountry>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public boolean deleteProductionCountry(long vehicleGroupId) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("delete from vr_productioncountry where vehiclegroupid= " + vehicleGroupId);
			
			log.info("=========deleteProductionCountry===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.executeUpdate();
			return true;
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return false;
	}
}
