package vn.dtt.gt.dk.utils;

import java.util.Date;

import vn.dtt.gt.dk.tracuthongtin.ThongTinTimKiemHoSo;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class QueryStringUtil {
	public static String getQueryViewTimKIemHoSo(ThongTinTimKiemHoSo thongTinTimKiemHoSo){
	
		StringBuilder query = new StringBuilder();
				
		query.append("SELECT Distinct id FROM dkvn_thutuchanhchinh.view_timkiemhoso ");
				
		if ((Validator.isNotNull(thongTinTimKiemHoSo.getSoInvoice()) && thongTinTimKiemHoSo.getSoInvoice().trim().length() > 0)
				|| (Validator.isNotNull(thongTinTimKiemHoSo.getSoBienBanKiemTra()) && thongTinTimKiemHoSo.getSoBienBanKiemTra().trim().length() > 0)
				||	(Validator.isNotNull(thongTinTimKiemHoSo.getNgayKiemTraFrom()) && thongTinTimKiemHoSo.getNgayKiemTraFrom().trim().length() > 0)
				|| (Validator.isNotNull(thongTinTimKiemHoSo.getNgayKiemTraTo()) && thongTinTimKiemHoSo.getNgayKiemTraTo().trim().length() > 0)
				||	(Validator.isNotNull(thongTinTimKiemHoSo.getTinhThanh()) && thongTinTimKiemHoSo.getTinhThanh().trim().length() > 0)
				|| (Validator.isNotNull(thongTinTimKiemHoSo.getQuanHuyen()) && thongTinTimKiemHoSo.getQuanHuyen().trim().length() > 0)
				|| (Validator.isNotNull(thongTinTimKiemHoSo.getDangKiemVienKiemTra()) && thongTinTimKiemHoSo.getDangKiemVienKiemTra().trim().length() > 0)
				|| (Validator.isNotNull(thongTinTimKiemHoSo.getSoToKhaiHaiQuan()) && thongTinTimKiemHoSo.getSoToKhaiHaiQuan().trim().length() > 0)
				|| (Validator.isNotNull(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom()) && thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom().trim().length() > 0)
				|| (Validator.isNotNull(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo()) && thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo().trim().length() > 0)
				|| (Validator.isNotNull(thongTinTimKiemHoSo.getTrangThaiPhieuXuLy()) && thongTinTimKiemHoSo.getTrangThaiPhieuXuLy().trim().length() > 0)
			) {
					
				if(Validator.isNotNull(thongTinTimKiemHoSo.getTrangThaiPhieuXuLy()) && thongTinTimKiemHoSo.getTrangThaiPhieuXuLy().trim().length() > 0){
					if(thongTinTimKiemHoSo.getTrangThaiPhieuXuLy().equals(Constants.TRANG_THAI_PHIEU_XU_LY_CHINH)){
						query.append(" INNER join dkvn_thutuchanhchinh.motcua_phieuxulychinh phieuxulychinh on phieuxulychinh.id = view_timkiemhoso.id ");
					} else if (thongTinTimKiemHoSo.getTrangThaiPhieuXuLy().equals(Constants.TRANG_THAI_PHIEU_XU_LY_PHU)){
							query.append(" INNER join dkvn_thutuchanhchinh.motcua_phieuxulyphu phieuxulyphu on phieuxulyphu.phieuxulychinhid = view_timkiemhoso.id ");
					}
				}
					
				if (Validator.isNotNull(thongTinTimKiemHoSo.getSoInvoice()) && thongTinTimKiemHoSo.getSoInvoice().trim().length() > 0){
					query.append(" INNER join tthc_noidunghoso noidunghoso on noidunghoso.hosothutucid = view_timkiemhoso.id ");
				}
				if((Validator.isNotNull(thongTinTimKiemHoSo.getSoBienBanKiemTra()) && thongTinTimKiemHoSo.getSoBienBanKiemTra().trim().length() > 0)
					||	(Validator.isNotNull(thongTinTimKiemHoSo.getNgayKiemTraFrom()) && thongTinTimKiemHoSo.getNgayKiemTraFrom().trim().length() > 0)
					|| (Validator.isNotNull(thongTinTimKiemHoSo.getNgayKiemTraTo()) && thongTinTimKiemHoSo.getNgayKiemTraTo().trim().length() > 0)
						){
					query.append(" INNER join dkvn_nghiepvu.vr_inspectionrecord inspectionrecord on inspectionrecord.hosothutucid = view_timkiemhoso.id ");	
				}
				if((Validator.isNotNull(thongTinTimKiemHoSo.getTinhThanh()) && thongTinTimKiemHoSo.getTinhThanh().trim().length() > 0)
						||	(Validator.isNotNull(thongTinTimKiemHoSo.getQuanHuyen()) && thongTinTimKiemHoSo.getQuanHuyen().trim().length() > 0)
						|| (Validator.isNotNull(thongTinTimKiemHoSo.getDangKiemVienKiemTra()) && thongTinTimKiemHoSo.getDangKiemVienKiemTra().trim().length() > 0)){
				query.append(" INNER join dkvn_nghiepvu.vr_confirmedinspection confirmedinspection on confirmedinspection.hosothutucid = view_timkiemhoso.id ");	
				}
				if(Validator.isNotNull(thongTinTimKiemHoSo.getDangKiemVienKiemTra()) && thongTinTimKiemHoSo.getDangKiemVienKiemTra().trim().length() > 0){
					query.append(" INNER join dkvn_nghiepvu.vr_corporation_attendee corporationattendee on corporationattendee.confirmedinspectionId = confirmedinspection.id ");
				}
				if((Validator.isNotNull(thongTinTimKiemHoSo.getSoToKhaiHaiQuan()) && thongTinTimKiemHoSo.getSoToKhaiHaiQuan().trim().length() > 0)
						|| (Validator.isNotNull(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom()) && thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom().trim().length() > 0)
						||	(Validator.isNotNull(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo()) && thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo().trim().length() > 0)
						){
					query.append(" INNER join dkvn_nghiepvu.vr_customsdeclaration customsdeclaration on customsdeclaration.hosothutucid = view_timkiemhoso.id ");
				}
					
				query.append(" where 1=1 ");
					
				if(Validator.isNotNull(thongTinTimKiemHoSo.getTrangThaiPhieuXuLy()) && thongTinTimKiemHoSo.getTrangThaiPhieuXuLy().trim().length() > 0){
					if(thongTinTimKiemHoSo.getTrangThaiPhieuXuLy().equals(Constants.TRANG_THAI_PHIEU_XU_LY_CHINH)){
						query.append(" and phieuxulychinh.trangthaihientaiid = " + thongTinTimKiemHoSo.getTrangThaiHoSoId());
					} else if (thongTinTimKiemHoSo.getTrangThaiPhieuXuLy().equals(Constants.TRANG_THAI_PHIEU_XU_LY_PHU)){
						query.append(" and phieuxulyphu.trangthaihientaiid = " + thongTinTimKiemHoSo.getTrangThaiHoSoId());
					}
				}
						
				if (Validator.isNotNull(thongTinTimKiemHoSo.getSoInvoice()) && thongTinTimKiemHoSo.getSoInvoice().trim().length() > 0){
					query.append(" and noidunghoso.bieumauhosoid=57 ");
					query.append(" and noidunghoso.tentailieu = '"+thongTinTimKiemHoSo.getSoInvoice()+"' ");
				}
					
				if(Validator.isNotNull(thongTinTimKiemHoSo.getSoBienBanKiemTra()) && thongTinTimKiemHoSo.getSoBienBanKiemTra().trim().length() > 0){
					query.append(" and inspectionrecord.inspectionrecordno like '%" + thongTinTimKiemHoSo.getSoBienBanKiemTra() +"%' ");
				}
				
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayKiemTraFrom()) && thongTinTimKiemHoSo.getNgayKiemTraFrom().trim().length() > 0) {
					Date dateFrom = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayKiemTraFrom().trim());
					thongTinTimKiemHoSo.setNgayKiemTraFrom( FormatData.parseDateToTring(dateFrom));
					query.append(" AND (inspectionrecord.inspectiondatefrom >= '" + thongTinTimKiemHoSo.getNgayKiemTraFrom() + "' OR inspectionrecord.inspectiondatefrom IS NULL)");
				}
				
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayKiemTraTo()) && thongTinTimKiemHoSo.getNgayKiemTraTo().trim().length() > 0) {
					Date dateTo = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayKiemTraTo().trim());
					thongTinTimKiemHoSo.setNgayKiemTraTo( FormatData.parseDateToTring(dateTo));
					query.append(" AND (inspectionrecord.inspectiondateto <= '" + thongTinTimKiemHoSo.getNgayKiemTraTo() + "' OR inspectionrecord.inspectiondateto IS NULL)");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getTinhThanh()) && thongTinTimKiemHoSo.getTinhThanh().trim().length() > 0){
					query.append(" and confirmedinspection.inspectionprovincecode = " + thongTinTimKiemHoSo.getTinhThanh());
				}
				if(Validator.isNotNull(thongTinTimKiemHoSo.getQuanHuyen()) && thongTinTimKiemHoSo.getQuanHuyen().trim().length() > 0){
					query.append(" and confirmedinspection.inspectiondistrictcode = " + thongTinTimKiemHoSo.getQuanHuyen());
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getDangKiemVienKiemTra()) && thongTinTimKiemHoSo.getDangKiemVienKiemTra().trim().length() > 0){
					query.append(" and corporationattendee.inspectorid = " + thongTinTimKiemHoSo.getDangKiemVienKiemTra());
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getSoToKhaiHaiQuan()) && thongTinTimKiemHoSo.getSoToKhaiHaiQuan().trim().length() > 0){
					query.append(" and customsdeclaration.importcustomdeclareno = '" + thongTinTimKiemHoSo.getSoToKhaiHaiQuan() + "' ");
				}
				
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom()) && thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom().trim().length() > 0) {
					Date dateFrom = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom().trim());
					thongTinTimKiemHoSo.setNgayToKhaiHaiQuanFrom( FormatData.parseDateToTring(dateFrom));
					query.append(" AND (customsdeclaration.importcustomdeclaredate >= '" + thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom() + "' OR customsdeclaration.importcustomdeclaredate IS NULL)");
				}
				
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo()) && thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo().trim().length() > 0) {
					Date dateTo = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo().trim());
					thongTinTimKiemHoSo.setNgayToKhaiHaiQuanTo( FormatData.parseDateToTring(dateTo));
					query.append(" AND (customsdeclaration.importcustomdeclaredate <= '" + thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo() + "' OR customsdeclaration.importcustomdeclaredate IS NULL)");
				}
					
			}else{
				query.append(" WHERE 1=1 ");
			}
				
			if (Validator.isNotNull(thongTinTimKiemHoSo.getDonViKiemTra()) && thongTinTimKiemHoSo.getDonViKiemTra().trim().length() > 0 && thongTinTimKiemHoSo.getDonViKiemTra().compareTo("-1") != 0) {
				query.append(" AND corporationid = " + thongTinTimKiemHoSo.getDonViKiemTra());
			}	
			if (Validator.isNotNull(thongTinTimKiemHoSo.getThuTucHanhChinhId()) && thongTinTimKiemHoSo.getThuTucHanhChinhId().trim().length() > 0) {
				query.append(" AND thutuchanhchinhid = " + thongTinTimKiemHoSo.getThuTucHanhChinhId());
			}	
			
			if (Validator.isNotNull(thongTinTimKiemHoSo.getMaSoHoSo()) && thongTinTimKiemHoSo.getMaSoHoSo().trim().length() > 0) {
				query.append(" AND masohoso like '%" + thongTinTimKiemHoSo.getMaSoHoSo() + "%'");
			}
				
			if (Validator.isNotNull(thongTinTimKiemHoSo.getSoDangKiKiemTra()) && thongTinTimKiemHoSo.getSoDangKiKiemTra().trim().length() > 0) {
				query.append(" AND mabiennhan = '" + thongTinTimKiemHoSo.getSoDangKiKiemTra() + "' ");
			}
				
			if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayCapDangKiFrom()) && thongTinTimKiemHoSo.getNgayCapDangKiFrom().trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayCapDangKiFrom().trim());
				thongTinTimKiemHoSo.setNgayCapDangKiFrom( FormatData.parseDateToTring(dateFrom));
				query.append(" AND (ngaytiepnhan >= '" + thongTinTimKiemHoSo.getNgayCapDangKiFrom() + "' OR ngaytiepnhan IS NULL)");
			}
				
			if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayCapDangKiTo()) && thongTinTimKiemHoSo.getNgayCapDangKiTo().trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayCapDangKiTo().trim());
				thongTinTimKiemHoSo.setNgayCapDangKiTo( FormatData.parseDateToTring(dateTo));
				query.append(" AND (ngaytiepnhan <= '" + thongTinTimKiemHoSo.getNgayCapDangKiTo() + "' OR ngaytiepnhan IS NULL)");
			}
				
				
			if (Validator.isNotNull(thongTinTimKiemHoSo.getLoaiThuTuc()) && thongTinTimKiemHoSo.getLoaiThuTuc().trim().length() > 0) {
				query.append(" AND tendonvitiepnhan = '" + thongTinTimKiemHoSo.getLoaiThuTuc()+"' ");
			}
			if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayNopFrom()) && thongTinTimKiemHoSo.getNgayNopFrom().trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayNopFrom().trim());
				thongTinTimKiemHoSo.setNgayNopFrom( FormatData.parseDateToTring(dateFrom));
				query.append(" AND (ngayguihoso >= '" + thongTinTimKiemHoSo.getNgayNopFrom() + "' OR ngayguihoso IS NULL)");
			}
				
			if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayNopTo()) && thongTinTimKiemHoSo.getNgayNopTo().trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayNopTo().trim());
				thongTinTimKiemHoSo.setNgayNopTo(FormatData.parseDateToTring(dateTo));
				query.append(" AND (ngayguihoso <= '" + thongTinTimKiemHoSo.getNgayNopTo() + "' OR ngayguihoso IS NULL)");
			} 
			
			if (Validator.isNotNull(thongTinTimKiemHoSo.getNguoiNhapKhau()) && thongTinTimKiemHoSo.getNguoiNhapKhau().trim().length() > 0) {
				query.append(" AND tenchuhoso like ?");
			}
				
			if ( thongTinTimKiemHoSo.getOrganizationId() > 0) {
				query.append(" AND tochucquanly = " + thongTinTimKiemHoSo.getOrganizationId());
			}
				
			query.append(" ORDER BY inspectiondate desc ");
				
			/*int count = thongTinTimKiemHoSo.getEnd() - thongTinTimKiemHoSo.getStart();
			if (thongTinTimKiemHoSo.getStart() >= 0) {
				query.append(" LIMIT " + thongTinTimKiemHoSo.getStart() + ", " + count);
			}*/
				
			log.info("=========searchTraCuuThongTinHoSo===" + query.toString() );
				
			return query.toString();
				
			/*SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("TimKiemHoSo", TimKiemHoSoImpl.class);
				
			QueryPos qPos = QueryPos.getInstance(q);
				
			if (Validator.isNotNull(thongTinTimKiemHoSo.getDonViKiemTra()) && thongTinTimKiemHoSo.getDonViKiemTra().trim().length() > 0 && thongTinTimKiemHoSo.getDonViKiemTra().compareTo("-1") != 0) {
				qPos.add(thongTinTimKiemHoSo.getDonViKiemTra());
			}
			if (Validator.isNotNull(thongTinTimKiemHoSo.getThuTucHanhChinhId()) && thongTinTimKiemHoSo.getThuTucHanhChinhId().trim().length() > 0) {
				qPos.add(thongTinTimKiemHoSo.getThuTucHanhChinhId().trim());
			}
			if (Validator.isNotNull(thongTinTimKiemHoSo.getNguoiNhapKhau()) && thongTinTimKiemHoSo.getNguoiNhapKhau().trim().length() > 0) {
				qPos.add("'%" + thongTinTimKiemHoSo.getNguoiNhapKhau() + "%'");
			}
				
			if (thongTinTimKiemHoSo.getOrganizationId() > 0) {
				qPos.add(thongTinTimKiemHoSo.getOrganizationId());
			}*/
				
	}
	
	
	
	public static String getQueryCountViewTimKIemHoSo(ThongTinTimKiemHoSo thongTinTimKiemHoSo){
		
		StringBuilder query = new StringBuilder();
				
		query.append("SELECT Distinct id FROM dkvn_thutuchanhchinh.view_timkiemhoso ");
				
		if ((Validator.isNotNull(thongTinTimKiemHoSo.getSoInvoice()) && thongTinTimKiemHoSo.getSoInvoice().trim().length() > 0)
				|| (Validator.isNotNull(thongTinTimKiemHoSo.getSoBienBanKiemTra()) && thongTinTimKiemHoSo.getSoBienBanKiemTra().trim().length() > 0)
				||	(Validator.isNotNull(thongTinTimKiemHoSo.getNgayKiemTraFrom()) && thongTinTimKiemHoSo.getNgayKiemTraFrom().trim().length() > 0)
				|| (Validator.isNotNull(thongTinTimKiemHoSo.getNgayKiemTraTo()) && thongTinTimKiemHoSo.getNgayKiemTraTo().trim().length() > 0)
				||	(Validator.isNotNull(thongTinTimKiemHoSo.getTinhThanh()) && thongTinTimKiemHoSo.getTinhThanh().trim().length() > 0)
				|| (Validator.isNotNull(thongTinTimKiemHoSo.getQuanHuyen()) && thongTinTimKiemHoSo.getQuanHuyen().trim().length() > 0)
				|| (Validator.isNotNull(thongTinTimKiemHoSo.getDangKiemVienKiemTra()) && thongTinTimKiemHoSo.getDangKiemVienKiemTra().trim().length() > 0)
				|| (Validator.isNotNull(thongTinTimKiemHoSo.getSoToKhaiHaiQuan()) && thongTinTimKiemHoSo.getSoToKhaiHaiQuan().trim().length() > 0)
				|| (Validator.isNotNull(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom()) && thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom().trim().length() > 0)
				|| (Validator.isNotNull(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo()) && thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo().trim().length() > 0)
				|| (Validator.isNotNull(thongTinTimKiemHoSo.getTrangThaiPhieuXuLy()) && thongTinTimKiemHoSo.getTrangThaiPhieuXuLy().trim().length() > 0)
			) {
					
				if(Validator.isNotNull(thongTinTimKiemHoSo.getTrangThaiPhieuXuLy()) && thongTinTimKiemHoSo.getTrangThaiPhieuXuLy().trim().length() > 0){
					if(thongTinTimKiemHoSo.getTrangThaiPhieuXuLy().equals(Constants.TRANG_THAI_PHIEU_XU_LY_CHINH)){
						query.append(" INNER join dkvn_thutuchanhchinh.motcua_phieuxulychinh phieuxulychinh on phieuxulychinh.id = view_timkiemhoso.id ");
					} else if (thongTinTimKiemHoSo.getTrangThaiPhieuXuLy().equals(Constants.TRANG_THAI_PHIEU_XU_LY_PHU)){
							query.append(" INNER join dkvn_thutuchanhchinh.motcua_phieuxulyphu phieuxulyphu on phieuxulyphu.phieuxulychinhid = view_timkiemhoso.id ");
					}
				}
					
				if (Validator.isNotNull(thongTinTimKiemHoSo.getSoInvoice()) && thongTinTimKiemHoSo.getSoInvoice().trim().length() > 0){
					query.append(" INNER join tthc_noidunghoso noidunghoso on noidunghoso.hosothutucid = view_timkiemhoso.id ");
				}
				if((Validator.isNotNull(thongTinTimKiemHoSo.getSoBienBanKiemTra()) && thongTinTimKiemHoSo.getSoBienBanKiemTra().trim().length() > 0)
					||	(Validator.isNotNull(thongTinTimKiemHoSo.getNgayKiemTraFrom()) && thongTinTimKiemHoSo.getNgayKiemTraFrom().trim().length() > 0)
					|| (Validator.isNotNull(thongTinTimKiemHoSo.getNgayKiemTraTo()) && thongTinTimKiemHoSo.getNgayKiemTraTo().trim().length() > 0)
						){
					query.append(" INNER join dkvn_nghiepvu.vr_inspectionrecord inspectionrecord on inspectionrecord.hosothutucid = view_timkiemhoso.id ");	
				}
				if((Validator.isNotNull(thongTinTimKiemHoSo.getTinhThanh()) && thongTinTimKiemHoSo.getTinhThanh().trim().length() > 0)
						||	(Validator.isNotNull(thongTinTimKiemHoSo.getQuanHuyen()) && thongTinTimKiemHoSo.getQuanHuyen().trim().length() > 0)
						|| (Validator.isNotNull(thongTinTimKiemHoSo.getDangKiemVienKiemTra()) && thongTinTimKiemHoSo.getDangKiemVienKiemTra().trim().length() > 0)){
				query.append(" INNER join dkvn_nghiepvu.vr_confirmedinspection confirmedinspection on confirmedinspection.hosothutucid = view_timkiemhoso.id ");	
				}
				if(Validator.isNotNull(thongTinTimKiemHoSo.getDangKiemVienKiemTra()) && thongTinTimKiemHoSo.getDangKiemVienKiemTra().trim().length() > 0){
					query.append(" INNER join dkvn_nghiepvu.vr_corporation_attendee corporationattendee on corporationattendee.confirmedinspectionId = confirmedinspection.id ");
				}
				if((Validator.isNotNull(thongTinTimKiemHoSo.getSoToKhaiHaiQuan()) && thongTinTimKiemHoSo.getSoToKhaiHaiQuan().trim().length() > 0)
						|| (Validator.isNotNull(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom()) && thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom().trim().length() > 0)
						||	(Validator.isNotNull(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo()) && thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo().trim().length() > 0)
						){
					query.append(" INNER join dkvn_nghiepvu.vr_customsdeclaration customsdeclaration on customsdeclaration.hosothutucid = view_timkiemhoso.id ");
				}
					
				query.append(" where 1=1 ");
					
				if(Validator.isNotNull(thongTinTimKiemHoSo.getTrangThaiPhieuXuLy()) && thongTinTimKiemHoSo.getTrangThaiPhieuXuLy().trim().length() > 0){
					if(thongTinTimKiemHoSo.getTrangThaiPhieuXuLy().equals(Constants.TRANG_THAI_PHIEU_XU_LY_CHINH)){
						query.append(" and phieuxulychinh.trangthaihientaiid = " + thongTinTimKiemHoSo.getTrangThaiHoSoId());
					} else if (thongTinTimKiemHoSo.getTrangThaiPhieuXuLy().equals(Constants.TRANG_THAI_PHIEU_XU_LY_PHU)){
						query.append(" and phieuxulyphu.trangthaihientaiid = " + thongTinTimKiemHoSo.getTrangThaiHoSoId());
					}
				}
						
				if (Validator.isNotNull(thongTinTimKiemHoSo.getSoInvoice()) && thongTinTimKiemHoSo.getSoInvoice().trim().length() > 0){
					query.append(" and noidunghoso.bieumauhosoid=57 ");
					query.append(" and noidunghoso.tentailieu = '"+thongTinTimKiemHoSo.getSoInvoice()+"' ");
				}
					
				if(Validator.isNotNull(thongTinTimKiemHoSo.getSoBienBanKiemTra()) && thongTinTimKiemHoSo.getSoBienBanKiemTra().trim().length() > 0){
					query.append(" and inspectionrecord.inspectionrecordno like '%" + thongTinTimKiemHoSo.getSoBienBanKiemTra() +"%' ");
				}
				
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayKiemTraFrom()) && thongTinTimKiemHoSo.getNgayKiemTraFrom().trim().length() > 0) {
					Date dateFrom = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayKiemTraFrom().trim());
					thongTinTimKiemHoSo.setNgayCapDangKiFrom( FormatData.parseDateToTring(dateFrom));
					query.append(" AND (inspectionrecord.inspectiondatefrom >= '" + thongTinTimKiemHoSo.getNgayKiemTraFrom() + "' OR inspectionrecord.inspectiondatefrom IS NULL)");
				}
				
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayKiemTraTo()) && thongTinTimKiemHoSo.getNgayKiemTraTo().trim().length() > 0) {
					Date dateTo = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayKiemTraTo().trim());
					thongTinTimKiemHoSo.setNgayCapDangKiTo( FormatData.parseDateToTring(dateTo));
					query.append(" AND (inspectionrecord.inspectiondateto <= '" + thongTinTimKiemHoSo.getNgayKiemTraTo() + "' OR inspectionrecord.inspectiondateto IS NULL)");
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getTinhThanh()) && thongTinTimKiemHoSo.getTinhThanh().trim().length() > 0){
					query.append(" and confirmedinspection.inspectionprovincecode = " + thongTinTimKiemHoSo.getTinhThanh());
				}
				if(Validator.isNotNull(thongTinTimKiemHoSo.getQuanHuyen()) && thongTinTimKiemHoSo.getQuanHuyen().trim().length() > 0){
					query.append(" and confirmedinspection.inspectiondistrictcode = " + thongTinTimKiemHoSo.getQuanHuyen());
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getDangKiemVienKiemTra()) && thongTinTimKiemHoSo.getDangKiemVienKiemTra().trim().length() > 0){
					query.append(" and corporationattendee.inspectorid = " + thongTinTimKiemHoSo.getDangKiemVienKiemTra());
				}
				
				if(Validator.isNotNull(thongTinTimKiemHoSo.getSoToKhaiHaiQuan()) && thongTinTimKiemHoSo.getSoToKhaiHaiQuan().trim().length() > 0){
					query.append(" and customsdeclaration.importcustomdeclareno = '" + thongTinTimKiemHoSo.getSoToKhaiHaiQuan() + "' ");
				}
				
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom()) && thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom().trim().length() > 0) {
					Date dateFrom = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom().trim());
					thongTinTimKiemHoSo.setNgayCapDangKiFrom( FormatData.parseDateToTring(dateFrom));
					query.append(" AND (customsdeclaration.importcustomdeclaredate >= '" + thongTinTimKiemHoSo.getNgayToKhaiHaiQuanFrom() + "' OR customsdeclaration.importcustomdeclaredate IS NULL)");
				}
				
				if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo()) && thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo().trim().length() > 0) {
					Date dateTo = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo().trim());
					thongTinTimKiemHoSo.setNgayCapDangKiTo( FormatData.parseDateToTring(dateTo));
					query.append(" AND (customsdeclaration.importcustomdeclaredate <= '" + thongTinTimKiemHoSo.getNgayToKhaiHaiQuanTo() + "' OR customsdeclaration.importcustomdeclaredate IS NULL)");
				}
					
			}else{
				query.append(" WHERE 1=1 ");
			}
				
			if (Validator.isNotNull(thongTinTimKiemHoSo.getDonViKiemTra()) && thongTinTimKiemHoSo.getDonViKiemTra().trim().length() > 0 && thongTinTimKiemHoSo.getDonViKiemTra().compareTo("-1") != 0) {
				query.append(" AND corporationid = " + thongTinTimKiemHoSo.getDonViKiemTra());
			}	
			if (Validator.isNotNull(thongTinTimKiemHoSo.getThuTucHanhChinhId()) && thongTinTimKiemHoSo.getThuTucHanhChinhId().trim().length() > 0) {
				query.append(" AND thutuchanhchinhid = " + thongTinTimKiemHoSo.getThuTucHanhChinhId());
			}	
			
			if (Validator.isNotNull(thongTinTimKiemHoSo.getMaSoHoSo()) && thongTinTimKiemHoSo.getMaSoHoSo().trim().length() > 0) {
				query.append(" AND masohoso like '%" + thongTinTimKiemHoSo.getMaSoHoSo() + "%'");
			}
				
			if (Validator.isNotNull(thongTinTimKiemHoSo.getSoDangKiKiemTra()) && thongTinTimKiemHoSo.getSoDangKiKiemTra().trim().length() > 0) {
				query.append(" AND mabiennhan = '" + thongTinTimKiemHoSo.getSoDangKiKiemTra() + "' ");
			}
				
			if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayCapDangKiFrom()) && thongTinTimKiemHoSo.getNgayCapDangKiFrom().trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayCapDangKiFrom().trim());
				thongTinTimKiemHoSo.setNgayCapDangKiFrom( FormatData.parseDateToTring(dateFrom));
				query.append(" AND (ngaytiepnhan >= '" + thongTinTimKiemHoSo.getNgayCapDangKiFrom() + "' OR ngaytiepnhan IS NULL)");
			}
				
			if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayCapDangKiTo()) && thongTinTimKiemHoSo.getNgayCapDangKiTo().trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayCapDangKiTo().trim());
				thongTinTimKiemHoSo.setNgayCapDangKiTo( FormatData.parseDateToTring(dateTo));
				query.append(" AND (ngaytiepnhan <= '" + thongTinTimKiemHoSo.getNgayCapDangKiTo() + "' OR ngaytiepnhan IS NULL)");
			}
				
				
			if (Validator.isNotNull(thongTinTimKiemHoSo.getLoaiThuTuc()) && thongTinTimKiemHoSo.getLoaiThuTuc().trim().length() > 0) {
				query.append(" AND tendonvitiepnhan = '" + thongTinTimKiemHoSo.getLoaiThuTuc()+"' ");
			}
			if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayNopFrom()) && thongTinTimKiemHoSo.getNgayNopFrom().trim().length() > 0) {
				Date dateFrom = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayNopFrom().trim());
				thongTinTimKiemHoSo.setNgayNopFrom( FormatData.parseDateToTring(dateFrom));
				query.append(" AND (ngayguihoso >= '" + thongTinTimKiemHoSo.getNgayNopFrom() + "' OR ngayguihoso IS NULL)");
			}
				
			if (Validator.isNotNull(thongTinTimKiemHoSo.getNgayNopTo()) && thongTinTimKiemHoSo.getNgayNopTo().trim().length() > 0) {
				Date dateTo = FormatData.parseDateShort3StringToDate(thongTinTimKiemHoSo.getNgayNopTo().trim());
				thongTinTimKiemHoSo.setNgayNopTo(FormatData.parseDateToTring(dateTo));
				query.append(" AND (ngayguihoso <= '" + thongTinTimKiemHoSo.getNgayNopTo() + "' OR ngayguihoso IS NULL)");
			} 
			
			if (Validator.isNotNull(thongTinTimKiemHoSo.getNguoiNhapKhau()) && thongTinTimKiemHoSo.getNguoiNhapKhau().trim().length() > 0) {
				query.append(" AND tenchuhoso like ?");
			}
				
			if ( thongTinTimKiemHoSo.getOrganizationId() > 0) {
				query.append(" AND tochucquanly = " + thongTinTimKiemHoSo.getOrganizationId());
			}
				
			query.append(" ORDER BY inspectiondate desc ");
				
			log.info("=========searchTraCuuThongTinHoSo===" + query.toString() );
				
			return query.toString();
	
	}
	
	private static Log log = LogFactoryUtil.getLog(QueryStringUtil.class);
}
