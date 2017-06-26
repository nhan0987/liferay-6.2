package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionImpl;
import vn.dtt.gt.dk.utils.DanhMucKey;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;


public class ConfirmedInspectionFinderImpl extends BasePersistenceImpl<ConfirmedInspection> implements ConfirmedInspectionFinder {
	
	private Log _log = LogFactoryUtil.getLog(ConfirmedInspectionFinderImpl.class);
	
	public List<ConfirmedInspection> findByProvinceCode(String quanHuyen, String tinhThanh, String quocGia) {
		Session session = null;
		try {
			session = openSession();
			
			
			StringBuilder queryDmDataItem = new StringBuilder();
			queryDmDataItem.append("SELECT code_0 FROM dm_dataitem WHERE ");
			
			if (Validator.isNotNull(tinhThanh) && tinhThanh.trim().length() > 0) {
				queryDmDataItem.append(" code_0 = '" + tinhThanh + "' AND ");
			}
			
			queryDmDataItem.append("level = '1' AND datagroupid in (SELECT code FROM dm_datagroup where name = '" + DanhMucKey.ADMINISTRATIVE_UNITS + "')");
			
			StringBuilder queryConfirmedInspection = new StringBuilder();
			queryConfirmedInspection.append("SELECT {vr_confirmedinspection.*} FROM vr_confirmedinspection WHERE ");
			queryConfirmedInspection.append("inspectionprovincecode in (" + queryDmDataItem.toString() +")");
			
			
			SQLQuery q = session.createSQLQuery(queryConfirmedInspection.toString());
			q.setCacheable(false);
			q.addEntity(ConfirmedInspectionImpl.TABLE_NAME, ConfirmedInspectionImpl.class);
			
			_log.debug("=========findByProvinceCode===" + queryConfirmedInspection.toString());
			QueryPos qPos = QueryPos.getInstance(q);
			return (List<ConfirmedInspection>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<ConfirmedInspection>();
	}
	public List<ConfirmedInspection> findByPhieuXuLyPhuIdAndCorporationId(long idPhieuXuLyPhu, String idCorporation) {
		Session session = null;
		try {
			session = openSession();
			String sql = "SELECT {vr_confirmedinspection.*} FROM vr_confirmedinspection where phieuxulyphuid in (SELECT id FROM dkvn_thutuchanhchinh.motcua_phieuxulyphu where phannhomhosoid = " + idPhieuXuLyPhu + ") AND corporationid = '" + idCorporation + "'";
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity(ConfirmedInspectionImpl.TABLE_NAME, ConfirmedInspectionImpl.class);
			
			_log.debug("=========findByPhieuXuLyPhuIdAndCorporationId===" + sql);
			QueryPos qPos = QueryPos.getInstance(q);
			return (List<ConfirmedInspection>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<ConfirmedInspection>();
	}
	

	public List<ConfirmedInspection> getListConfirmedInspection(long codeNumber,String	chassisNumber,String	engineNumber, long hoSoThuTucId)  {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("select *   from vr_confirmedinspection where id in  ");
			query.append(" ( select distinct vr_vehiclerecord.confirmedInspectionId  from vr_vehiclerecord,vr_vehiclegroup, vr_registeredinspection");
			query.append(" where  0 = 0 ");
			query.append(" and vr_vehiclerecord.codeNumber="+codeNumber);
			query.append(" and vr_vehiclerecord.chassisNumber='"+chassisNumber+"'");
			query.append(" and vr_vehiclerecord.engineNumber='"+engineNumber+"'");
			
			query.append(" and vr_vehiclerecord.confirmedInspectionId > 0  ");
			
			query.append(" and vr_vehiclerecord.vehiclegroupid = vr_vehiclegroup.id  ");
			query.append(" and vr_registeredinspection.id = vr_vehiclegroup.registeredinspectionid  ");
			query.append(" and vr_registeredinspection.dossierid =  "+hoSoThuTucId);
			
			
			query.append(" ) ");
			
			
			String sql = query.toString();
			_log.info(" sql =  "+sql);
			SQLQuery q = session.createSQLQuery(sql);
			q.addEntity("ConfirmedInspection", ConfirmedInspectionImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			List<ConfirmedInspection> result = (List<ConfirmedInspection>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if(result!=null&&result.size()>0){
				return result;
			}			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public List<ConfirmedInspection> findByInspectorIdAndNgayKiemTra(long inspectorId, String corporationid , String ngayKiemTra){
		Session session = null;
		
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append(" select {vr_confirmedinspection.*} from vr_confirmedinspection  where 1=1 ");
			if (inspectorId > 0) {
				query.append(" and inspectorid = '" + inspectorId+"' ");
			}
			if (Validator.isNotNull(corporationid) && corporationid.trim().length() >0) {
				query.append(" and corporationid = '" + corporationid+"' ");
			}
//			if (Validator.isNotNull(ngayKiemTra) && ngayKiemTra.trim().length() > 0) {
//				Date dateFrom = FormatData.parseDateShort3StringToDate(ngayKiemTra.trim());
//				ngayKiemTra = FormatData.parseDateToTring(dateFrom);
//				query.append(" AND (datefrom >= '" + ngayKiemTra + "' OR datefrom IS NULL)");
//				query.append(" AND (dateto <= '" + ngayKiemTra + "' OR dateto IS NULL)");
//			}
			
			if(Validator.isNotNull(ngayKiemTra) && ngayKiemTra.trim().length() > 0){
				Date dateNgayKiemTra = FormatData.parseDateShort3StringToDate(ngayKiemTra.trim());
				ngayKiemTra = FormatData.parseDateToStringType6(dateNgayKiemTra);				
				query.append(" AND (datefrom >= '" + ngayKiemTra + "') ");
				query.append(" AND (dateto <= '" + ngayKiemTra + "') ");
			}
			
			SQLQuery q = session.createSQLQuery(query.toString());
			
			_log.info("------------------findByInspectorIdAndNgayKiemTra---------" + query.toString());
			
			q.addEntity(ConfirmedInspectionImpl.TABLE_NAME, ConfirmedInspectionImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			return (List<ConfirmedInspection>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return new ArrayList<ConfirmedInspection>();
		
	}
	public List<ConfirmedInspection> findByCorporationIdAndNgayKiemTra(String corporationid , String ngayKiemTra){
		Session session = null;
		
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append(" select {vr_confirmedinspection.*} from vr_confirmedinspection  where 1=1 ");
			if (Validator.isNotNull(corporationid) && corporationid.trim().length() >0) {
				query.append(" and corporationid = '" + corporationid+"' ");
			}
			
			if(Validator.isNotNull(ngayKiemTra) && ngayKiemTra.trim().length() > 0){
				Date dateNgayKiemTra = FormatData.parseDateShort3StringToDate(ngayKiemTra.trim());
				ngayKiemTra = FormatData.parseDateToStringType6(dateNgayKiemTra);				
				query.append(" AND (datefrom >= '" + ngayKiemTra + "') ");
				query.append(" AND (dateto <= '" + ngayKiemTra + "') ");
			}
			
			SQLQuery q = session.createSQLQuery(query.toString());
			
			_log.info("------------------findByCorporationIdAndNgayKiemTra---------" + query.toString());
			
			q.addEntity(ConfirmedInspectionImpl.TABLE_NAME, ConfirmedInspectionImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			return (List<ConfirmedInspection>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return new ArrayList<ConfirmedInspection>();
		
	}
	public List<ConfirmedInspection> findConfirmedGroupByInspectorId(String corporationid, String ngayKiemTra){
		Session session = null;
		
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append(" select {vr_confirmedinspection.*} from vr_confirmedinspection  where 1=1 and inspectorid >0 ");
			if (Validator.isNotNull(corporationid) && corporationid.trim().length() >0) {
				query.append(" and corporationid = '" + corporationid+"' ");
			}
			if(Validator.isNotNull(ngayKiemTra) && ngayKiemTra.trim().length() > 0){
				Date dateNgayKiemTra = FormatData.parseDateShort3StringToDate(ngayKiemTra.trim());
				ngayKiemTra = FormatData.parseDateToStringType6(dateNgayKiemTra);				
				query.append(" AND (datefrom >= '" + ngayKiemTra + "') ");
				query.append(" AND (dateto <= '" + ngayKiemTra + "') ");
			}
			query.append(" group by inspectorid");
			SQLQuery q = session.createSQLQuery(query.toString());
			
			_log.info("------------------findConfirmedGroupByInspectorId---------" + query.toString());
			
			q.addEntity(ConfirmedInspectionImpl.TABLE_NAME, ConfirmedInspectionImpl.class);
			QueryPos qPos = QueryPos.getInstance(q);
			return (List<ConfirmedInspection>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		return new ArrayList<ConfirmedInspection>();
		
	}
}
