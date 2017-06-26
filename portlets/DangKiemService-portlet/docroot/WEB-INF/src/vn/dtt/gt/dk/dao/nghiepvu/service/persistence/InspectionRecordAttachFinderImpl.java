package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordAttachImpl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class InspectionRecordAttachFinderImpl extends BasePersistenceImpl<InspectionRecordAttach> implements InspectionRecordAttachFinder {
	
	public static String FIND_BY_HO_SO_THU_TUC_IDS = InspectionRecordAttachFinder.class.getName() + ".findByHoSoThuTucIds";
	
	public List<InspectionRecordAttach> findByHoSoThuTucIds(long[] hoSoThuTucIds, int start, int end) 
		throws SystemException {
		
		Session session = null;
		
		try {
			session = openSession();
			
			String sql = CustomSQLUtil.get(FIND_BY_HO_SO_THU_TUC_IDS);
			StringUtil.replace(sql, "[$HO_SO_THU_TUC_IDS$]", StringUtil.merge(hoSoThuTucIds));
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(InspectionRecordAttachImpl.TABLE_NAME, InspectionRecordAttachImpl.class);
			
			return (List<InspectionRecordAttach>) QueryUtil.list(q, getDialect(), start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}
