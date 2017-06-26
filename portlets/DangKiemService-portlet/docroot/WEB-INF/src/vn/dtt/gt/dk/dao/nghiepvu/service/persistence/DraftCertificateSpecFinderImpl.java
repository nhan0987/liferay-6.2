package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec;

import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class DraftCertificateSpecFinderImpl  extends BasePersistenceImpl<DraftCertificateSpec> implements DraftCertificateSpecFinder {
	
	private Log log = LogFactoryUtil.getLog(DraftCertificateSpecFinderImpl.class);

	public boolean deleteDraftCertificateSpecWithDraftCertificateId(long draftCertificateId) {
		Session session = null;
		
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("delete from vr_draftcertificatespec where draftcertificateid=  " + draftCertificateId);
			
			log.info("=========updateVehicleRecordWithConfirmedInspectionId===" + query.toString());
			
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
