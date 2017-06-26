package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewTrungSoKhungDongCoImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;


public class ViewTrungSoKhungDongCoFinderImpl extends BasePersistenceImpl<ViewTrungSoKhungDongCo> implements ViewTrungSoKhungDongCoFinder {
	
	private Log _log = LogFactoryUtil.getLog(ViewTrungSoKhungDongCoFinderImpl.class);
	
	public List<ViewTrungSoKhungDongCo> findByHoSoThuTucIdTrungSoKhungSoDongCo(long idHoSoThuTuc) {
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder("select a.*, r.registerednumber, r.contactname, r.contactphone, r.inspectiondate, r.importername from vr_vehiclerecord a inner join (select chassisnumber, enginenumber, count(1) from vr_vehiclerecord group by chassisnumber, enginenumber having  count(1) > 1 ) b on a.chassisnumber = b.chassisnumber and a.enginenumber = b.enginenumber inner join vr_vehiclegroup c on a.vehiclegroupid = c.id inner join vr_registeredinspection r on r.id   = c.registeredinspectionid and  r.dossierid = " + idHoSoThuTuc + " order by a.chassisnumber, a.enginenumber");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("ViewTrungSoKhungDongCo", ViewTrungSoKhungDongCoImpl.class);
			
			_log.debug("=========findByHoSoThuTucIdTrungSoKhungSoDongCo===" + query.toString());
			QueryPos qPos = QueryPos.getInstance(q);
			return (List<ViewTrungSoKhungDongCo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<ViewTrungSoKhungDongCo>();
	}
}
