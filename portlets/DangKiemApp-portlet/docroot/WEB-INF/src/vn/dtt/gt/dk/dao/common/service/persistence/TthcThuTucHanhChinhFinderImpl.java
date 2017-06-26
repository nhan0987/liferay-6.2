package vn.dtt.gt.dk.dao.common.service.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh;
import vn.dtt.gt.dk.dao.common.model.impl.TthcThuTucHanhChinhImpl;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyChinhImpl;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;


public class TthcThuTucHanhChinhFinderImpl extends BasePersistenceImpl<TthcThuTucHanhChinh> implements TthcThuTucHanhChinhFinder {
	
	private Log _log = LogFactoryUtil.getLog(TthcThuTucHanhChinhFinderImpl.class);
	
	public List<TthcThuTucHanhChinh> searchThuTucHanhChinh(String mathutuc, String tenthutuc, int coquanqlttid, int linhvucthutucid, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT {tthc_thutuchanhchinh.*} FROM tthc_thutuchanhchinh where 1=1 ");
			
			_log.debug("==maThuTuc==" + mathutuc + "==tenThuTuc==" + tenthutuc);
			_log.debug("==coQuanQuanLyId==" + coquanqlttid + "==linhVucThucTucId==" + linhvucthutucid);
			
			
			
			if (Validator.isNotNull(mathutuc) && mathutuc.trim().length() > 0) {
				query.append(" AND mathutuc = ?");
			}
			
			if (Validator.isNotNull(tenthutuc) && tenthutuc.trim().length() > 0) {
				query.append(" AND tenthutuc like  ").append("'%" + tenthutuc.trim() + "%'");
			}
			
			if (coquanqlttid > 0) {
				query.append(" AND coquanqlttid = ?");
			}
			if (linhvucthutucid > 0) {
				query.append(" AND linhvucthutucid = ?");
			}
			
			/*if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(dateFrom);
				query.append(" AND (ngayguihoso >= '" + ngayNopFrom + "' OR ngayguihoso IS NULL)");
			}*/
			
			_log.debug("=========searchThuTucHanhChinh===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(TthcThuTucHanhChinhImpl.TABLE_NAME, TthcThuTucHanhChinhImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(mathutuc) && mathutuc.trim().length() > 0) {
				qPos.add(mathutuc);
			}
			if (coquanqlttid > 0) {
				qPos.add(coquanqlttid);
			}
			if (linhvucthutucid > 0) {
				qPos.add(linhvucthutucid);
			}
			List<TthcThuTucHanhChinh> list =  (List<TthcThuTucHanhChinh>) QueryUtil.list(q, getDialect(), start, end);
			return list;
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<TthcThuTucHanhChinh>();
	}
	
	public int countThuTucHanhChinh(String mathutuc, String tenthutuc, int coquanqlttid, int linhvucthutucid) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT count(*) as total FROM tthc_thutuchanhchinh where 1=1 ");
			
			_log.debug("==maThuTuc==" + mathutuc + "==tenThuTuc==" + tenthutuc);
			_log.debug("==coQuanQuanLyId==" + coquanqlttid + "==linhVucThucTucId==" + linhvucthutucid);
			
			
			
			if (Validator.isNotNull(mathutuc) && mathutuc.trim().length() > 0) {
				query.append(" AND mathutuc = ?");
			}
			
			if (Validator.isNotNull(tenthutuc) && tenthutuc.trim().length() > 0) {
				query.append(" AND tenthutuc like  ").append("'%" + tenthutuc.trim() + "%'");
			}
			
			if (coquanqlttid > 0) {
				query.append(" AND coquanqlttid = ?");
			}
			if (linhvucthutucid > 0) {
				query.append(" AND linhvucthutucid = ?");
			}
			
			_log.debug("=========countThuTucHanhChinh===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
		
			if (Validator.isNotNull(mathutuc) && mathutuc.trim().length() > 0) {
				qPos.add(mathutuc);
			}
			if (coquanqlttid > 0) {
				qPos.add(coquanqlttid);
			}
			if (linhvucthutucid > 0) {
				qPos.add(linhvucthutucid);
			}
			
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) { return count.intValue(); }
			}
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return 0;
	}
}
