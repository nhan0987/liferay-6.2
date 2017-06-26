package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDongBoMTgatewayImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class ImportedXCDFinderImpl  extends BasePersistenceImpl<ImportedXCD> implements ImportedXCDFinder {
	
	
	private static Log _log = LogFactoryUtil.getLog(ImportedXCDFinderImpl.class);
	
	public List<ImportedXCD> findByTrangthaiDongbo(String trangthai, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT {vr_importedxcd.*} FROM dkvn_nghiepvu.vr_importedxcd where trangthai = ? order by id asc  ");
			_log.debug("=========findByTrangthaiDongbo===trangthai===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(ImportedXCDImpl.TABLE_NAME, ImportedXCDImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(trangthai);
			
			return  (List<ImportedXCD>) QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<ImportedXCD>();
	}
	
}
