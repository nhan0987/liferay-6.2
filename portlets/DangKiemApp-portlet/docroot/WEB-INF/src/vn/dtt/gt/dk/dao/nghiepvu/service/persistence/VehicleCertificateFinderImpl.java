
package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoImpl;
import vn.dtt.gt.dk.dao.motcua.model.DaKiemTra;
import vn.dtt.gt.dk.dao.motcua.model.impl.DaKiemTraImpl;
import vn.dtt.gt.dk.dao.motcua.service.persistence.DaKiemTraFinder;
import vn.dtt.gt.dk.dao.nghiepvu.service.persistence.VehicleCertificateFinder;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleCertificateImpl;
import vn.dtt.gt.dk.tracuthongtin.ThongTinTimKiemHoSo;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class VehicleCertificateFinderImpl extends BasePersistenceImpl<VehicleCertificate> implements VehicleCertificateFinder {
	
	private Log _log = LogFactoryUtil.getLog(VehicleCertificateFinderImpl.class);
	public static final String FIND_VEHICLERECORD = VehicleCertificateFinder.class.getName() + ".findVehicleCertificateByHosothutucId";
	
	public List<VehicleCertificate> findVehicleCertificateByHosothutucId(long hosothutucid) {
		
		Session session = null;
		List<VehicleCertificate> result = new ArrayList<VehicleCertificate>();
		try {
			session = openSession();
			
			String sql = CustomSQLUtil.get(FIND_VEHICLERECORD);
			
						
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addEntity("VehicleCertificate", VehicleCertificateImpl.class);
			//_log.info(sql);			
			//_log.debug("==findVehicleCertificateByHosothutucId==" + sql);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			if(hosothutucid > 0) {
				qPos.add(hosothutucid);
			}
			
			result = (List<VehicleCertificate>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return result;
	}	
	
	public boolean deleteVehicleCertificateSpecWithHosothutucId(long hosothutucId) {
		Session session = null;
		
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("Delete from dkvn_nghiepvu.vr_vehicle_certificate where hosothutucid =  " + hosothutucId);
								
//			log.info("=========deleteVehicleCertificateSpecWithHosothutucId===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.executeUpdate();
			return true;
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return false;
	}
	
	public boolean deleteVehicleCertificateOutOfMTGateway(long outofMTgateway, String soChungChi, String soDangKyKiemTra) {
		Session session = null;
		
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("Delete from dkvn_nghiepvu.vr_vehicle_certificate where mtgateway =  " + outofMTgateway);
			query.append(" AND certificatenumber = '" + soChungChi + "' ");
			query.append(" AND registerednumber = '" + soDangKyKiemTra + "' ");
								
//			log.info("=========deleteVehicleCertificateSpecWithHosothutucId===" + query.toString());
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.executeUpdate();
			return true;
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return false;
	}
	
	public List<VehicleCertificate> findVehicleCertificate(
			String soChungChi, long organizationId, String thuTucHanhChinhId, String doiTuong, String maSoHoSo, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, int year, ThongTinTimKiemHoSo thongTinTimKiemHoSo, int start, int end) {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder();
				query.append("SELECT * FROM dkvn_nghiepvu.vr_vehicle_certificate  WHERE 1=1  ");


								
				if(Validator.isNotNull(thongTinTimKiemHoSo.getSoToKhaiHaiQuan()) && thongTinTimKiemHoSo.getSoToKhaiHaiQuan().trim().length() > 0){
					query.append(" AND importcustomdeclareno = '" + thongTinTimKiemHoSo.getSoToKhaiHaiQuan() + "' ");
				}
				
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom()) && thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom().trim().length() > 0) {
					Date dateFrom = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom().trim());
					thongTinTimKiemHoSo.setNgayToKhaiHaiQuanFrom( FormatData.parseDateToTring(dateFrom));
					query.append(" AND (importcustomdeclaredate >= '" + thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom() + "' OR importcustomdeclaredate IS NULL)");
				}
				
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo()) && thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo().trim().length() > 0) {
					Date dateTo = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo().trim());
					thongTinTimKiemHoSo.setNgayToKhaiHaiQuanTo( FormatData.parseDateToTring(dateTo));
					query.append(" AND (importcustomdeclaredate <= '" + thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo() + "' OR importcustomdeclaredate IS NULL)");
				}
					
				if(Validator.isNotNull(thongTinTimKiemHoSo.getSoBienBanKiemTra()) && thongTinTimKiemHoSo.getSoBienBanKiemTra().trim().length() > 0){
					query.append(" AND inspectionrecordno like '%" + thongTinTimKiemHoSo.getSoBienBanKiemTra() +"%' ");
				}
				
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayKiemTraFrom()) && thongTinTimKiemHoSo.getNgayKiemTraFrom().trim().length() > 0) {
					Date dateFrom = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayKiemTraFrom().trim());
					thongTinTimKiemHoSo.setNgayKiemTraFrom( FormatData.parseDateToTring(dateFrom));
					query.append(" AND (inspectiondatefrom >= '" + thongTinTimKiemHoSo.getNgayKiemTraFrom() + "' OR inspectiondatefrom IS NULL) ");
				}
				
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayKiemTraTo()) && thongTinTimKiemHoSo.getNgayKiemTraTo().trim().length() > 0) {
					Date dateTo = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayKiemTraTo().trim());
					thongTinTimKiemHoSo.setNgayKiemTraTo( FormatData.parseDateToTring(dateTo));
					query.append(" AND (inspectiondateto <= '" + thongTinTimKiemHoSo.getNgayKiemTraTo() + "' OR inspectiondateto IS NULL) ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getTinhThanh()) && thongTinTimKiemHoSo.getTinhThanh().trim().length() > 0){
					query.append(" AND inspectionprovincecode = " + thongTinTimKiemHoSo.getTinhThanh());
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getQuanHuyen()) && thongTinTimKiemHoSo.getQuanHuyen().trim().length() > 0){
					query.append(" AND inspectiondistrictcode = " + thongTinTimKiemHoSo.getQuanHuyen());
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getDangKiemVienKiemTra()) && thongTinTimKiemHoSo.getDangKiemVienKiemTra().trim().length() > 0){
					query.append(" AND inspectorcontactcode = " + thongTinTimKiemHoSo.getDangKiemVienKiemTra());
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getDonViKiemTra()) && thongTinTimKiemHoSo.getDonViKiemTra().trim().length() > 0){
					query.append(" AND corporationcode = " + thongTinTimKiemHoSo.getDonViKiemTra());
				}

				if(Validator.isNotNull(thongTinTimKiemHoSo.getSoDangKiKiemTra()) && thongTinTimKiemHoSo.getSoDangKiKiemTra().trim().length() > 0){
					query.append(" AND registerednumber like '%" + thongTinTimKiemHoSo.getSoDangKiKiemTra() +"%' ");
				}			
				
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayCapDangKiFrom()) && thongTinTimKiemHoSo.getNgayCapDangKiFrom().trim().length() > 0) {
					Date dateFrom = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayCapDangKiFrom().trim());
					thongTinTimKiemHoSo.setNgayCapDangKiFrom( FormatData.parseDateToTring(dateFrom));
					query.append(" AND (inspectorsigndate >= '" + thongTinTimKiemHoSo.getNgayCapDangKiFrom() + "' OR inspectorsigndate IS NULL)");
				}
					
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayCapDangKiTo()) && thongTinTimKiemHoSo.getNgayCapDangKiTo().trim().length() > 0) {
					Date dateTo = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayCapDangKiTo().trim());
					thongTinTimKiemHoSo.setNgayCapDangKiTo( FormatData.parseDateToTring(dateTo));
					query.append(" AND (inspectorsigndate <= '" + thongTinTimKiemHoSo.getNgayCapDangKiTo() + "' OR inspectorsigndate IS NULL)");
				}
				
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayNopFrom()) && thongTinTimKiemHoSo.getNgayNopFrom().trim().length() > 0) {
					Date dateFrom = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayNopFrom().trim());
					thongTinTimKiemHoSo.setNgayNopFrom( FormatData.parseDateToTring(dateFrom));
					query.append(" AND (dossierdate >= '" + thongTinTimKiemHoSo.getNgayNopFrom() + "' OR dossierdate IS NULL)");
				}
					
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayNopTo()) && thongTinTimKiemHoSo.getNgayNopTo().trim().length() > 0) {
					Date dateTo = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayNopTo().trim());
					thongTinTimKiemHoSo.setNgayNopTo(FormatData.parseDateToTring(dateTo));
					query.append(" AND (dossierdate <= '" + thongTinTimKiemHoSo.getNgayNopTo() + "' OR dossierdate IS NULL)");
				} 
				
				
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getSoVin()) && thongTinTimKiemHoSo.getSoVin().trim().length() > 0){
					query.append(" AND chassisnumber like '%" + thongTinTimKiemHoSo.getSoVin() +"%' ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getSoKhung()) && thongTinTimKiemHoSo.getSoKhung().trim().length() > 0){
					query.append(" AND chassisnumber like '%" + thongTinTimKiemHoSo.getSoKhung() +"%' ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getSoDongCo()) && thongTinTimKiemHoSo.getSoDongCo().trim().length() > 0){
					query.append(" AND enginenumber like '%" + thongTinTimKiemHoSo.getSoDongCo() +"%' ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getMauSon()) && thongTinTimKiemHoSo.getMauSon().trim().length() > 0){
					query.append(" AND vehiclecolor like '%" + thongTinTimKiemHoSo.getMauSon() +"%' ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getTinhTrangPhuongTien()) && thongTinTimKiemHoSo.getTinhTrangPhuongTien().trim().length() > 0){
					query.append(" AND currentstatus like '%" + thongTinTimKiemHoSo.getTinhTrangPhuongTien() +"%' ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getThongSoKiThuatPhuongTien()) && thongTinTimKiemHoSo.getThongSoKiThuatPhuongTien().trim().length() > 0){
					//query.append(" AND " + thongTinTimKiemHoSo.getThongSoKiThuatPhuongTien() +" ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getNamSanXuat()) && thongTinTimKiemHoSo.getNamSanXuat().trim().length() > 0){
					query.append(" AND productionyear like '%" + thongTinTimKiemHoSo.getNamSanXuat() +"%' ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getLoaiPhuongTienNK()) && thongTinTimKiemHoSo.getLoaiPhuongTienNK().trim().length() > 0){
					query.append(" AND vehicletypedescription like '%" + thongTinTimKiemHoSo.getLoaiPhuongTienNK() +"%' OR vehicletype like '%" + thongTinTimKiemHoSo.getLoaiPhuongTienNK() +"%' ");
					query.append(" OR enginetypedescription like '%" + thongTinTimKiemHoSo.getLoaiPhuongTienNK() +"%' OR enginetype like '%" + thongTinTimKiemHoSo.getLoaiPhuongTienNK() +"%' ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getNhanhieu()) && thongTinTimKiemHoSo.getNhanhieu().trim().length() > 0){
					query.append(" AND trademarkdescription like '%" + thongTinTimKiemHoSo.getNhanhieu() +"%' ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getTenThuongMai()) && thongTinTimKiemHoSo.getTenThuongMai().trim().length() > 0){
					query.append(" AND commercialname like '%" + thongTinTimKiemHoSo.getTenThuongMai() +"%' ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getMaKieuLoai()) && thongTinTimKiemHoSo.getMaKieuLoai().trim().length() > 0){
					query.append(" AND modelcode like '%" + thongTinTimKiemHoSo.getMaKieuLoai() +"%' ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getNuocSanXuat()) && thongTinTimKiemHoSo.getNuocSanXuat().trim().length() > 0){
					query.append(" AND countryname like '%" + thongTinTimKiemHoSo.getNuocSanXuat() +"%' ");
				}
				
				
				
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					if (thuTucHanhChinhId.contains("1")) {
						query.append(" AND vehicleclass in ('"+ "XMY" + "', '" + "DCX" + "') ");
					}
					if (thuTucHanhChinhId.contains("2")) {
						query.append(" AND vehicleclass in ('"+ "XCG" + "') ");
					}
					if (thuTucHanhChinhId.contains("3")) {
						query.append(" AND vehicleclass in ('"+ "XCD" + "') ");
					}
					if (thuTucHanhChinhId.contains("4")) {
						query.append(" AND vehicleclass in ('"+ "XDD" + "') ");
					}
					if (thuTucHanhChinhId.contains("5")) {
						query.append(" AND vehicleclass in ('"+ "XBB" + "') ");
					}
					
				}
				if (Validator.isNotNull(doiTuong) && doiTuong.trim().length() > 0) {
					query.append(" AND vehicleclass like '%" + doiTuong.trim() + "%' ");
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					query.append(" AND registerednumber like '%" + maSoHoSo.trim() + "%' ");
				}
			
				if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
					query.append(" AND importername like  ").append("'%" + tenDoanhNghiep.trim() + "%'");
				}				
				if (Validator.isNotNull(soChungChi) && soChungChi.trim().length() > 0) {
					query.append(" AND certificatenumber like  ").append("'%" + soChungChi.trim() + "%'");
				}
				
				if (year > 0) {
					query.append(" AND (YEAR(inspectorsigndate) = " + year + " OR YEAR(inspectiondatefrom) = " + year + " OR YEAR(inspectiondateto) = " + year + " ) " );
				}


				String sql = query + " order by vr_vehicle_certificate.hosothutucid desc, vr_vehicle_certificate.sequenceno asc";
				_log.info("=========findVehicleCertificate===" + sql);
				
				SQLQuery q = session.createSQLQuery(sql);
				q.setCacheable(false);
				q.addEntity(VehicleCertificateImpl.TABLE_NAME, VehicleCertificateImpl.class);
				
				QueryPos qPos = QueryPos.getInstance(q);
				
				
				List<VehicleCertificate> list =  (List<VehicleCertificate>) QueryUtil.list(q, getDialect(), start, end);

				return list;
				
			} catch (Exception e) {
				_log.error(e);
			} finally {
				closeSession(session);
			}
			
			return new ArrayList<VehicleCertificate>();
		}
	
		public int countVehicleCertificate(
			String soChungChi, long organizationId, String thuTucHanhChinhId, String doiTuong, String maSoHoSo, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, int year, ThongTinTimKiemHoSo thongTinTimKiemHoSo) {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder();
				query.append("SELECT * FROM dkvn_nghiepvu.vr_vehicle_certificate  WHERE 1=1  ");


				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getSoToKhaiHaiQuan()) && thongTinTimKiemHoSo.getSoToKhaiHaiQuan().trim().length() > 0){
					query.append(" AND importcustomdeclareno = '" + thongTinTimKiemHoSo.getSoToKhaiHaiQuan() + "' ");
				}
				
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom()) && thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom().trim().length() > 0) {
					Date dateFrom = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom().trim());
					thongTinTimKiemHoSo.setNgayToKhaiHaiQuanFrom( FormatData.parseDateToTring(dateFrom));
					query.append(" AND (importcustomdeclaredate >= '" + thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom() + "' OR importcustomdeclaredate IS NULL)");
				}
				
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo()) && thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo().trim().length() > 0) {
					Date dateTo = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo().trim());
					thongTinTimKiemHoSo.setNgayToKhaiHaiQuanTo( FormatData.parseDateToTring(dateTo));
					query.append(" AND (importcustomdeclaredate <= '" + thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo() + "' OR importcustomdeclaredate IS NULL)");
				}
					
				if(Validator.isNotNull(thongTinTimKiemHoSo.getSoBienBanKiemTra()) && thongTinTimKiemHoSo.getSoBienBanKiemTra().trim().length() > 0){
					query.append(" AND inspectionrecordno like '%" + thongTinTimKiemHoSo.getSoBienBanKiemTra() +"%' ");
				}
				
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayKiemTraFrom()) && thongTinTimKiemHoSo.getNgayKiemTraFrom().trim().length() > 0) {
					Date dateFrom = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayKiemTraFrom().trim());
					thongTinTimKiemHoSo.setNgayKiemTraFrom( FormatData.parseDateToTring(dateFrom));
					query.append(" AND (inspectiondatefrom >= '" + thongTinTimKiemHoSo.getNgayKiemTraFrom() + "' OR inspectiondatefrom IS NULL) ");
				}
				
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayKiemTraTo()) && thongTinTimKiemHoSo.getNgayKiemTraTo().trim().length() > 0) {
					Date dateTo = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayKiemTraTo().trim());
					thongTinTimKiemHoSo.setNgayKiemTraTo( FormatData.parseDateToTring(dateTo));
					query.append(" AND (inspectiondateto <= '" + thongTinTimKiemHoSo.getNgayKiemTraTo() + "' OR inspectiondateto IS NULL) ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getTinhThanh()) && thongTinTimKiemHoSo.getTinhThanh().trim().length() > 0){
					query.append(" AND inspectionprovincecode = " + thongTinTimKiemHoSo.getTinhThanh());
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getQuanHuyen()) && thongTinTimKiemHoSo.getQuanHuyen().trim().length() > 0){
					query.append(" AND inspectiondistrictcode = " + thongTinTimKiemHoSo.getQuanHuyen());
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getDangKiemVienKiemTra()) && thongTinTimKiemHoSo.getDangKiemVienKiemTra().trim().length() > 0){
					query.append(" AND inspectorcontactcode = " + thongTinTimKiemHoSo.getDangKiemVienKiemTra());
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getDonViKiemTra()) && thongTinTimKiemHoSo.getDonViKiemTra().trim().length() > 0){
					query.append(" AND corporationcode = " + thongTinTimKiemHoSo.getDonViKiemTra());
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getSoDangKiKiemTra()) && thongTinTimKiemHoSo.getSoDangKiKiemTra().trim().length() > 0){
					query.append(" AND registerednumber like '%" + thongTinTimKiemHoSo.getSoDangKiKiemTra() +"%' ");
				}			
				
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayCapDangKiFrom()) && thongTinTimKiemHoSo.getNgayCapDangKiFrom().trim().length() > 0) {
					Date dateFrom = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayCapDangKiFrom().trim());
					thongTinTimKiemHoSo.setNgayCapDangKiFrom( FormatData.parseDateToTring(dateFrom));
					query.append(" AND (inspectorsigndate >= '" + thongTinTimKiemHoSo.getNgayCapDangKiFrom() + "' OR inspectorsigndate IS NULL)");
				}
					
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayCapDangKiTo()) && thongTinTimKiemHoSo.getNgayCapDangKiTo().trim().length() > 0) {
					Date dateTo = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayCapDangKiTo().trim());
					thongTinTimKiemHoSo.setNgayCapDangKiTo( FormatData.parseDateToTring(dateTo));
					query.append(" AND (inspectorsigndate <= '" + thongTinTimKiemHoSo.getNgayCapDangKiTo() + "' OR inspectorsigndate IS NULL)");
				}
				
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayNopFrom()) && thongTinTimKiemHoSo.getNgayNopFrom().trim().length() > 0) {
					Date dateFrom = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayNopFrom().trim());
					thongTinTimKiemHoSo.setNgayNopFrom( FormatData.parseDateToTring(dateFrom));
					query.append(" AND (dossierdate >= '" + thongTinTimKiemHoSo.getNgayNopFrom() + "' OR dossierdate IS NULL)");
				}
					
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayNopTo()) && thongTinTimKiemHoSo.getNgayNopTo().trim().length() > 0) {
					Date dateTo = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayNopTo().trim());
					thongTinTimKiemHoSo.setNgayNopTo(FormatData.parseDateToTring(dateTo));
					query.append(" AND (dossierdate <= '" + thongTinTimKiemHoSo.getNgayNopTo() + "' OR dossierdate IS NULL)");
				} 
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getSoVin()) && thongTinTimKiemHoSo.getSoVin().trim().length() > 0){
					query.append(" AND chassisnumber like '%" + thongTinTimKiemHoSo.getSoVin() +"%' ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getSoKhung()) && thongTinTimKiemHoSo.getSoKhung().trim().length() > 0){
					query.append(" AND chassisnumber like '%" + thongTinTimKiemHoSo.getSoKhung() +"%' ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getSoDongCo()) && thongTinTimKiemHoSo.getSoDongCo().trim().length() > 0){
					query.append(" AND enginenumber like '%" + thongTinTimKiemHoSo.getSoDongCo() +"%' ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getMauSon()) && thongTinTimKiemHoSo.getMauSon().trim().length() > 0){
					query.append(" AND vehiclecolor like '%" + thongTinTimKiemHoSo.getMauSon() +"%' ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getTinhTrangPhuongTien()) && thongTinTimKiemHoSo.getTinhTrangPhuongTien().trim().length() > 0){
					query.append(" AND currentstatus like '%" + thongTinTimKiemHoSo.getTinhTrangPhuongTien() +"%' ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getThongSoKiThuatPhuongTien()) && thongTinTimKiemHoSo.getThongSoKiThuatPhuongTien().trim().length() > 0){
					//query.append(" AND " + thongTinTimKiemHoSo.getThongSoKiThuatPhuongTien() +" ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getNamSanXuat()) && thongTinTimKiemHoSo.getNamSanXuat().trim().length() > 0){
					query.append(" AND productionyear like '%" + thongTinTimKiemHoSo.getNamSanXuat() +"%' ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getLoaiPhuongTienNK()) && thongTinTimKiemHoSo.getLoaiPhuongTienNK().trim().length() > 0){
					query.append(" AND vehicletypedescription like '%" + thongTinTimKiemHoSo.getLoaiPhuongTienNK() +"%' OR vehicletype like '%" + thongTinTimKiemHoSo.getLoaiPhuongTienNK() +"%' ");
					query.append(" OR enginetypedescription like '%" + thongTinTimKiemHoSo.getLoaiPhuongTienNK() +"%' OR enginetype like '%" + thongTinTimKiemHoSo.getLoaiPhuongTienNK() +"%' ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getNhanhieu()) && thongTinTimKiemHoSo.getNhanhieu().trim().length() > 0){
					query.append(" AND trademarkdescription like '%" + thongTinTimKiemHoSo.getNhanhieu() +"%' ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getTenThuongMai()) && thongTinTimKiemHoSo.getTenThuongMai().trim().length() > 0){
					query.append(" AND commercialname like '%" + thongTinTimKiemHoSo.getTenThuongMai() +"%' ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getMaKieuLoai()) && thongTinTimKiemHoSo.getMaKieuLoai().trim().length() > 0){
					query.append(" AND modelcode like '%" + thongTinTimKiemHoSo.getMaKieuLoai() +"%' ");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getNuocSanXuat()) && thongTinTimKiemHoSo.getNuocSanXuat().trim().length() > 0){
					query.append(" AND countryname like '%" + thongTinTimKiemHoSo.getNuocSanXuat() +"%' ");
				}
				
				
				if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
					if (thuTucHanhChinhId.contains("1")) {
						query.append(" AND vehicleclass in ('"+ "XMY" + "', '" + "DCX" + "') ");
					}
					if (thuTucHanhChinhId.contains("2")) {
						query.append(" AND vehicleclass in ('"+ "XCG" + "') ");
					}
					if (thuTucHanhChinhId.contains("3")) {
						query.append(" AND vehicleclass in ('"+ "XCD" + "') ");
					}
					if (thuTucHanhChinhId.contains("4")) {
						query.append(" AND vehicleclass in ('"+ "XDD" + "') ");
					}
					if (thuTucHanhChinhId.contains("5")) {
						query.append(" AND vehicleclass in ('"+ "XBB" + "') ");
					}
					
				}
				if (Validator.isNotNull(doiTuong) && doiTuong.trim().length() > 0) {
					query.append(" AND vehicleclass like '%" + doiTuong.trim() + "%' ");
				}
				if (Validator.isNotNull(maSoHoSo) && maSoHoSo.trim().length() > 0) {
					query.append(" AND registerednumber like '%" + maSoHoSo.trim() + "%' ");
				}
			
				if (Validator.isNotNull(tenDoanhNghiep) && tenDoanhNghiep.trim().length() > 0) {
					query.append(" AND importername like  ").append("'%" + tenDoanhNghiep.trim() + "%'");
				}				
				if (Validator.isNotNull(soChungChi) && soChungChi.trim().length() > 0) {
					query.append(" AND certificatenumber like  ").append("'%" + soChungChi.trim() + "%'");
				}

				if (year > 0) {
					query.append(" AND (YEAR(inspectorsigndate) = " + year + " OR YEAR(inspectiondatefrom) = " + year + " OR YEAR(inspectiondateto) = " + year + " ) " );
				}

							

				String sql = "SELECT count(*) as total FROM (" + query.toString() + ") as VehicleCertificate";
//				
				_log.debug("=========findVehicleCertificate===" + sql);
				
				SQLQuery q = session.createSQLQuery(sql);
				q.setCacheable(false);
				q.addScalar("total", Type.LONG);
				
				QueryPos qPos = QueryPos.getInstance(q);
				
				
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
