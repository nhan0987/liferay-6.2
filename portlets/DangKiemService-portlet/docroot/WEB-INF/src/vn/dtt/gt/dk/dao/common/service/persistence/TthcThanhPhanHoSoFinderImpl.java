package vn.dtt.gt.dk.dao.common.service.persistence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo;
import vn.dtt.gt.dk.dao.common.model.impl.TthcThanhPhanHoSoImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;


public class TthcThanhPhanHoSoFinderImpl extends BasePersistenceImpl<TthcThanhPhanHoSo> implements TthcThanhPhanHoSoFinder {

	private Log _log = LogFactoryUtil.getLog(TthcThanhPhanHoSoFinderImpl.class);
	
	public List<TthcThanhPhanHoSo> searchTthcThanhPhanHoSo(long thutuchanhchinhid, long bieumauhosoid, int thutuhienthi, int loaithanhphan, String mautructuyen, long sotailieudinhkem, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT {tthc_thutuchanhchinh.*} FROM tthc_thutuchanhchinh where 1=1 ");
			
			_log.debug("==thutuchanhchinhid==" + thutuchanhchinhid + "==bieumauhosoid==" + bieumauhosoid);
			_log.debug("==thutuhienthi=======" + thutuhienthi + "==loaithanhphan=======" + loaithanhphan);
			_log.debug("==mautructuyen=======" + mautructuyen + "==sotailieudinhkem====" + sotailieudinhkem);
			
			if (thutuchanhchinhid > 0) {
				query.append(" AND thutuchanhchinhid = ?");
			}
			if (bieumauhosoid > 0) {
				query.append(" AND bieumauhosoid = ?");
			}
			
			if (thutuhienthi > 0) {
				query.append(" AND thutuhienthi = ?");
			}
			if (loaithanhphan > 0) {
				query.append(" AND loaithanhphan = ?");
			}
			
			if (Validator.isNotNull(mautructuyen) && mautructuyen.trim().length() > 0) {
				query.append(" AND mautructuyen like  ").append("'%" + mautructuyen.trim() + "%'");
			}
			
			if (sotailieudinhkem > 0) {
				query.append(" AND sotailieudinhkem = ?");
			}
			
			/*if (Validator.isNotNull(ngayNopFrom) && ngayNopFrom.trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayNopFrom.trim());
				ngayNopFrom = FormatData.parseDateToTring(dateFrom);
				query.append(" AND (ngayguihoso >= '" + ngayNopFrom + "' OR ngayguihoso IS NULL)");
			}*/
			
			_log.debug("=========searchTthcThanhPhanHoSo===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(TthcThanhPhanHoSoImpl.TABLE_NAME, TthcThanhPhanHoSoImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			if (thutuchanhchinhid > 0) {
				qPos.add(thutuchanhchinhid);
			}
			if (bieumauhosoid > 0) {
				query.append(" AND bieumauhosoid = ?");
			}
			
			if (thutuhienthi > 0) {
				qPos.add(thutuhienthi);
			}
			if (loaithanhphan > 0) {
				qPos.add(loaithanhphan);
			}
			
			if (sotailieudinhkem > 0) {
				qPos.add(sotailieudinhkem);
			}
			
			List<TthcThanhPhanHoSo> list =  (List<TthcThanhPhanHoSo>) QueryUtil.list(q, getDialect(), start, end);
			return list;
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return new ArrayList<TthcThanhPhanHoSo>();
	}
	
	public int countTthcThanhPhanHoSo(long thutuchanhchinhid, long bieumauhosoid, int thutuhienthi, int loaithanhphan, String mautructuyen, long sotailieudinhkem) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT count(*) as total FROM tthc_thanhphanhoso where 1=1 ");
			
			_log.debug("==thutuchanhchinhid==" + thutuchanhchinhid + "==bieumauhosoid==" + bieumauhosoid);
			_log.debug("==thutuhienthi=======" + thutuhienthi + "==loaithanhphan=======" + loaithanhphan);
			_log.debug("==mautructuyen=======" + mautructuyen + "==sotailieudinhkem====" + sotailieudinhkem);
			
			if (thutuchanhchinhid > 0) {
				query.append(" AND thutuchanhchinhid = ?");
			}
			if (bieumauhosoid > 0) {
				query.append(" AND bieumauhosoid = ?");
			}
			
			if (thutuhienthi > 0) {
				query.append(" AND thutuhienthi = ?");
			}
			if (loaithanhphan > 0) {
				query.append(" AND loaithanhphan = ?");
			}
			
			if (Validator.isNotNull(mautructuyen) && mautructuyen.trim().length() > 0) {
				query.append(" AND mautructuyen like  ").append("'%" + mautructuyen.trim() + "%'");
			}
			
			if (sotailieudinhkem > 0) {
				query.append(" AND sotailieudinhkem = ?");
			}
			
			_log.debug("=========countTthcThanhPhanHoSo===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);
		
			if (thutuchanhchinhid > 0) {
				qPos.add(thutuchanhchinhid);
			}
			if (bieumauhosoid > 0) {
				query.append(" AND bieumauhosoid = ?");
			}
			
			if (thutuhienthi > 0) {
				qPos.add(thutuhienthi);
			}
			if (loaithanhphan > 0) {
				qPos.add(loaithanhphan);
			}
			
			if (sotailieudinhkem > 0) {
				qPos.add(sotailieudinhkem);
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
