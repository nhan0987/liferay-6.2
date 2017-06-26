
package vn.dtt.gt.dk.dao.motcua.service.persistence;

import java.util.List;

import vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaTrangThaiHoSoImpl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class MotCuaTrangThaiHoSoFinderImpl extends BasePersistenceImpl<MotCuaTrangThaiHoSo> implements MotCuaTrangThaiHoSoFinder {
	
	private static Log log = LogFactoryUtil.getLog(MotCuaTrangThaiHoSoFinderImpl.class);
	
	public List<MotCuaTrangThaiHoSo> getAllTrangThaiHoSoByKieuTrangThai(int kieuTrangThai) {
		List<MotCuaTrangThaiHoSo> result = null;
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			query.append("SELECT {motcua_trangthaihoso.*} FROM motcua_trangthaihoso ");
			
			if (kieuTrangThai > 0) {
				query.append(" Where kieutrangthai = " + kieuTrangThai);
			}
			
			query.append(" ORDER BY CONVERT(tentrangthai USING utf8) COLLATE utf8_polish_ci");
			
			log.debug("==getAllTrangThaiHoSo==" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(MotCuaTrangThaiHoSoImpl.TABLE_NAME, MotCuaTrangThaiHoSoImpl.class);
			
			result = (List<MotCuaTrangThaiHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}
	
}
