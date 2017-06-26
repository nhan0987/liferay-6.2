package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class CertificateRecordSpecFinderImpl  extends BasePersistenceImpl<CertificateRecordSpec> implements CertificateRecordSpecFinder {

	private Log _log = LogFactoryUtil.getLog(CertificateRecordSpecFinderImpl.class);
    
    
	public List<CertificateRecordSpec> findByIdCertificateRecordAndVehicleTypeCode(long idCertificateRecord, String vehicleClass, String vehicleType) {
		Session session = null;
		List<CertificateRecordSpec> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" (SELECT DISTINCT vr_cfg_technicalspec.id, vr_certificaterecordspec.certificaterecordid, vr_cfg_technicalspec.specificationcode, vr_cfg_technicalspec.spec_description ");
			query.append(" AS specificationname, vr_certificaterecordspec.specificationvalue, vr_certificaterecordspec.version FROM vr_cfg_technicalspec LEFT JOIN vr_certificaterecordspec ");
			query.append(" ON vr_certificaterecordspec.specificationcode = vr_cfg_technicalspec.specificationcode AND vr_certificaterecordspec.certificaterecordid = " + idCertificateRecord );
			query.append(" WHERE vr_cfg_technicalspec.vehicletypecode= '" + vehicleClass + "' ORDER BY vr_cfg_technicalspec.sequenceno ASC ,  vr_cfg_technicalspec.id ASC)");

			if (Validator.isNotNull(vehicleClass) && vehicleClass.trim().equalsIgnoreCase("XCD")) {
				query.append(" UNION (SELECT DISTINCT vr_cfg_technicalspec.id, vr_certificaterecordspec.certificaterecordid, vr_cfg_technicalspec.specificationcode, vr_cfg_technicalspec.spec_description ");
				query.append(" AS specificationname, vr_certificaterecordspec.specificationvalue, vr_certificaterecordspec.version FROM vr_cfg_technicalspec LEFT JOIN vr_certificaterecordspec ");
				query.append(" ON vr_certificaterecordspec.specificationcode = vr_cfg_technicalspec.specificationcode AND vr_certificaterecordspec.certificaterecordid = " + idCertificateRecord );
				query.append(" WHERE vehicletypecode= '" + vehicleType + "' ORDER BY vr_cfg_technicalspec.sequenceno ASC ,  vr_cfg_technicalspec.id ASC)");
			} 
			_log.debug("=========findByIdCertificateRecordAndVehicleTypeCode===" + query.toString());

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("CertificateRecordSpec", CertificateRecordSpecImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			result = (List<CertificateRecordSpec>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return result;
	}
}