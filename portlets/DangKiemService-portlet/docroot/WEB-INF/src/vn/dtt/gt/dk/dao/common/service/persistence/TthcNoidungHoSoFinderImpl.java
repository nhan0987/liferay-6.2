package vn.dtt.gt.dk.dao.common.service.persistence;

import java.util.List;

import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSoRead;
import vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoReadImpl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class TthcNoidungHoSoFinderImpl extends BasePersistenceImpl<TthcNoidungHoSo> implements TthcNoidungHoSoFinder {
	
	public static String FIND_BY_HO_SO_THU_TUC_IDS = TthcNoidungHoSoFinder.class.getName() + ".findByHoSoThuTucIds";
	
	public List<TthcNoidungHoSoRead> findByHoSoThuTucIds(long[] hoSoThuTucIds, int start, int end) 
		throws SystemException {
		
		Session session = null;
		
		try {
			session = openSession();
			
			String sql = CustomSQLUtil.get(FIND_BY_HO_SO_THU_TUC_IDS);
			
			if(hoSoThuTucIds != null && hoSoThuTucIds.length == 1) {
				sql = StringUtil.replace(sql, "IN ([$HO_SO_THU_TUC_IDS$])", "= " + hoSoThuTucIds[0]);
			} else if(hoSoThuTucIds != null && hoSoThuTucIds.length > 1) {
				sql = StringUtil.replace(sql, "[$HO_SO_THU_TUC_IDS$]", StringUtil.merge(hoSoThuTucIds));
			}
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			
			q.addEntity(TthcNoidungHoSoReadImpl.TABLE_NAME, TthcNoidungHoSoReadImpl.class);
			
			return (List<TthcNoidungHoSoRead>) QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}
