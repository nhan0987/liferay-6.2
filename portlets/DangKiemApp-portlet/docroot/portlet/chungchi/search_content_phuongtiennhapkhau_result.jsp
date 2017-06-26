<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="vn.dtt.gt.dk.utils.format.CommonUtils"%>
<%@page import="vn.dtt.gt.dk.report.ReportConstant"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoConfiguration"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleCertificateLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEBONBANH"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEBONBANHLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOILocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIDONGCOLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEMAYLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECHUYENDUNGLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEDAPDIEN"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEDAPDIENLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.utils.QueryStringUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TimKiemHoSo"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TimKiemHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.tracuthongtin.ThongTinTimKiemHoSo"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ include file="/portlet/init.jsp"%>


<%

		long organizationId = 0;
		if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
			organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
		}
		
		
		String loaiThuTuc = ParamUtil.getString(request, Constants.LOAI_THU_TUC);
		String tenThuTuc = ParamUtil.getString(request, Constants.TEN_THU_TUC);
	    String soHoSo = ParamUtil.getString(request, Constants.SO_HO_SO);
	    String soChungChi = ParamUtil.getString(request, Constants.SO_CHUNG_CHI);
	    String doanhNghiep = ParamUtil.getString(request, Constants.DOANH_NGHIEP);
	    String ngayNopHsFrom = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_FROM);
	    String ngayNopHsTo = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_TO);
	    String namNhap = ParamUtil.getString(request, Constants.NAM_NHAP);
	    
	    
	    String trangThaiPhieuXuLy = ParamUtil.getString(request, Constants.TRANG_THAI_PHIEU_XU_LY);
		String soDangKiKiemTra = ParamUtil.getString(request, Constants.SO_DANGKI_KIEMTRA);
		String ngayCapDangKiFrom = ParamUtil.getString(request, Constants.NGAY_CAP_DANG_KI_FROM);
		String ngayCapDangKiTo = ParamUtil.getString(request, Constants.NGAY_CAP_DANG_KI_TO);
		
		String soBienBanKiemTra = ParamUtil.getString(request, Constants.SO_BIENBAN_KIEMTRA);
		String ngayKiemTraFrom = ParamUtil.getString(request, Constants.NGAY_KIEM_TRA_FROM);
		String ngayKiemTraTo = ParamUtil.getString(request, Constants.NGAY_KIEM_TRA_TO);
		String donViKiemTra = ParamUtil.getString(request, Constants.DON_VI_KIEM_TRA);
		String dangKiemVienKiemTra = ParamUtil.getString(request, Constants.ID_DANG_KIEM_VIEN_KIEMTRA);
		String quanHuyen = ParamUtil.getString(request, Constants.QUAN_HUYEN);
		String tinhThanh = ParamUtil.getString(request, Constants.TINH_THANH);
		
		String masothue = ParamUtil.getString(request, Constants.MASO_THUE);
		String soInvoice = ParamUtil.getString(request, Constants.SO_INVOICE);
		String nguoiNhapKhau = ParamUtil.getString(request, Constants.NGUOI_NHAP_KHAU);
		String soToKhaiHaiQuan = ParamUtil.getString(request, Constants.SO_TO_KHAI_HAI_QUAN);
		String ngayToKhaiHaiQuanFrom = ParamUtil.getString(request, Constants.NGAY_TOKHAI_HAIQUAN_FROM);
		String ngayToKhaiHaiQuanTo = ParamUtil.getString(request, Constants.NGAY_TOKHAI_HAIQUAN_TO);
		
		String soVin = ParamUtil.getString(request, Constants.SO_VIN);
		String soKhung = ParamUtil.getString(request, Constants.SO_KHUNG);
		String soDongCo = ParamUtil.getString(request, Constants.SO_DONG_CO);
		String mauSon = ParamUtil.getString(request, Constants.MAU_SON);
		String tinhTrangPhuongTien = ParamUtil.getString(request, Constants.TINH_TRANG_PHUONG_TIEN);
		String thongSoKiThuatPhuongTien = ParamUtil.getString(request, Constants.THONGSO_KITHUAT_PHUONGTIEN);
		String namSanXuat = ParamUtil.getString(request, Constants.NAM_SAN_XUAT);
		
		String loaiPhuongTienNK = ParamUtil.getString(request, Constants.LOAI_PHUONG_TIEN_NK);
		String nhanhieu = ParamUtil.getString(request, Constants.NHAN_HIEU);
		String tenthuongmai = ParamUtil.getString(request, Constants.TEN_THUONG_MAI);		
		String makieuloai = ParamUtil.getString(request, Constants.MA_KIEU_LOAI);
		String nuocsanxuat = ParamUtil.getString(request, Constants.NUOC_SAN_XUAT);
		
		String kichThuocChung = ParamUtil.getString(request, Constants.KICH_THUOC_CHUNG); 
		String slKhoiLuong = ParamUtil.getString(request, Constants.SL_KHOI_LUONG);
		String slKhoiLuongToanBo = ParamUtil.getString(request, Constants.SL_KHOI_LUONG_TOAN_BO);
		String slKhoiLuongBanThan = ParamUtil.getString(request, Constants.SL_KHOI_LUONG_BAN_THAN);	 
		String offset = ParamUtil.getString(request, Constants.OFFSET);
		String congThucBanhXe = ParamUtil.getString(request, Constants.CONG_THUC_BANH_XE);
		String klChuyenChoTTK = ParamUtil.getString(request, Constants.SL_KHOI_LUONG_CHUYEN_CHO_TTK);
		String klChuyenChoTGGT = ParamUtil.getString(request, Constants.SL_KHOI_LUONG_CHUYEN_CHO_TGGT);
		String kyHieuDongCo = ParamUtil.getString(request, Constants.KY_HIEU_DONG_CO);
		String loaiDongCo = ParamUtil.getString(request, Constants.LOAI_DONG_CO);
		
		PortletURL portletUrl = renderResponse.createRenderURL();
		if (loaiThuTuc != null) {
			portletUrl.setParameter(Constants.LOAI_THU_TUC, loaiThuTuc);
		}
		if (tenThuTuc != null) {
			portletUrl.setParameter(Constants.TEN_THU_TUC, tenThuTuc);
		}
		if (soHoSo != null) {
			portletUrl.setParameter(Constants.SO_HO_SO, soHoSo);
		}
		if (doanhNghiep != null) {
			portletUrl.setParameter(Constants.DOANH_NGHIEP, doanhNghiep);
		}
		if (ngayNopHsFrom != null) {
			portletUrl.setParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFrom);
		}
		if (ngayNopHsTo != null) {
			portletUrl.setParameter(Constants.NGAY_NOP_HO_SO_TO, ngayNopHsTo);
		}
		if (namNhap != null) {
			portletUrl.setParameter(Constants.NAM_NHAP, namNhap);
		}
		if (soChungChi != null) {
			portletUrl.setParameter(Constants.SO_CHUNG_CHI, soChungChi);
		}
	    
	    if (trangThaiPhieuXuLy != null) {
			portletUrl.setParameter(Constants.TRANG_THAI_PHIEU_XU_LY, trangThaiPhieuXuLy);
		}
		
		if (soDangKiKiemTra != null) {
			portletUrl.setParameter(Constants.SO_DANGKI_KIEMTRA, soDangKiKiemTra);
		}
		
		if (ngayCapDangKiFrom != null) {
			portletUrl.setParameter(Constants.NGAY_CAP_DANG_KI_FROM, ngayCapDangKiFrom);
		}
		
		if (ngayCapDangKiTo != null) {
			portletUrl.setParameter(Constants.NGAY_CAP_DANG_KI_TO, ngayCapDangKiTo);
		}
		
		if (soBienBanKiemTra != null) {
			portletUrl.setParameter(Constants.SO_BIENBAN_KIEMTRA, soBienBanKiemTra);
		}
		
		if (ngayKiemTraFrom != null) {
			portletUrl.setParameter(Constants.NGAY_KIEM_TRA_FROM, ngayKiemTraFrom);
		}
		
		if (ngayKiemTraTo != null) {
			portletUrl.setParameter(Constants.NGAY_KIEM_TRA_TO, ngayKiemTraTo);
		}
		
		if (donViKiemTra != null) {
			portletUrl.setParameter(Constants.DON_VI_KIEM_TRA, donViKiemTra);
		}
		
		if (dangKiemVienKiemTra != null) {
			portletUrl.setParameter(Constants.ID_DANG_KIEM_VIEN_KIEMTRA, dangKiemVienKiemTra);
		}
		
		if (quanHuyen != null) {
			portletUrl.setParameter(Constants.QUAN_HUYEN, quanHuyen);
		}
		
		if (tinhThanh != null) {
			portletUrl.setParameter(Constants.TINH_THANH, tinhThanh);
		}
		
		
		if (masothue != null) {
			portletUrl.setParameter(Constants.MASO_THUE, masothue);
		}
		
		if (soInvoice != null) {
			portletUrl.setParameter(Constants.SO_INVOICE, soInvoice);
		}
		
		if (nguoiNhapKhau != null) {
			portletUrl.setParameter(Constants.NGUOI_NHAP_KHAU, nguoiNhapKhau);
		}
		
		if (soToKhaiHaiQuan != null) {
			portletUrl.setParameter(Constants.SO_TO_KHAI_HAI_QUAN, soToKhaiHaiQuan);
		}
		
		if (ngayToKhaiHaiQuanFrom != null) {
			portletUrl.setParameter(Constants.NGAY_TOKHAI_HAIQUAN_FROM, ngayToKhaiHaiQuanFrom);
		}
		
		if (ngayToKhaiHaiQuanTo != null) {
			portletUrl.setParameter(Constants.NGAY_TOKHAI_HAIQUAN_TO, ngayToKhaiHaiQuanTo);
		}		
		
		if (soVin != null) {
			portletUrl.setParameter(Constants.SO_VIN, soVin);
		}
		
		if (soKhung != null) {
			portletUrl.setParameter(Constants.SO_KHUNG, soKhung);
		}
		
		if (soDongCo != null) {
			portletUrl.setParameter(Constants.SO_DONG_CO, soDongCo);
		}
		
		if (mauSon != null) {
			portletUrl.setParameter(Constants.MAU_SON, mauSon);
		}
		
		if (tinhTrangPhuongTien != null) {
			portletUrl.setParameter(Constants.TINH_TRANG_PHUONG_TIEN, tinhTrangPhuongTien);
		}
		
		if (thongSoKiThuatPhuongTien != null) {
			portletUrl.setParameter(Constants.THONGSO_KITHUAT_PHUONGTIEN, thongSoKiThuatPhuongTien);
		}
		
		if (namSanXuat != null) {
			portletUrl.setParameter(Constants.NAM_SAN_XUAT, namSanXuat);
		}
		
		if (loaiPhuongTienNK != null) {
			portletUrl.setParameter(Constants.LOAI_PHUONG_TIEN_NK, loaiPhuongTienNK);
		}
		
		if (nhanhieu != null) {
			portletUrl.setParameter(Constants.NHAN_HIEU, nhanhieu);
		}
		
		if (tenthuongmai != null) {
			portletUrl.setParameter(Constants.TEN_THUONG_MAI, tenthuongmai);
		}
		
		if (makieuloai != null) {
			portletUrl.setParameter(Constants.MA_KIEU_LOAI, makieuloai);
		}
		
		if (nuocsanxuat != null) {
			portletUrl.setParameter(Constants.NUOC_SAN_XUAT, nuocsanxuat);
		}
		
		if (kichThuocChung != null) {
			portletUrl.setParameter(Constants.KICH_THUOC_CHUNG, kichThuocChung);
		}
		
		if (slKhoiLuong != null) {
			portletUrl.setParameter(Constants.SL_KHOI_LUONG, slKhoiLuong);
		}
		
		if (slKhoiLuongToanBo != null) {
			portletUrl.setParameter(Constants.SL_KHOI_LUONG_TOAN_BO, slKhoiLuongToanBo);
		}
		
		if (slKhoiLuongBanThan != null) {
			portletUrl.setParameter(Constants.SL_KHOI_LUONG_BAN_THAN, slKhoiLuongBanThan);
		}
		
		if (offset != null) {
			portletUrl.setParameter(Constants.OFFSET, offset);
		}
		
		if (congThucBanhXe != null) {
			portletUrl.setParameter(Constants.CONG_THUC_BANH_XE, congThucBanhXe);
		}
		
		if (klChuyenChoTTK != null) {
			portletUrl.setParameter(Constants.SL_KHOI_LUONG_CHUYEN_CHO_TTK, klChuyenChoTTK);
		}
		
		if (klChuyenChoTGGT != null) {
			portletUrl.setParameter(Constants.SL_KHOI_LUONG_CHUYEN_CHO_TGGT, klChuyenChoTGGT);
		}
		
		if (kyHieuDongCo != null) {
			portletUrl.setParameter(Constants.KY_HIEU_DONG_CO, kyHieuDongCo);
		}
		
		if (loaiDongCo != null) {
			portletUrl.setParameter(Constants.LOAI_DONG_CO, loaiDongCo);
		}
		
		String doiTuong = null;
		if (loaiThuTuc.contains("DCX")
				|| loaiThuTuc.contains("XDD")
				|| loaiThuTuc.contains("XCD")
				|| loaiThuTuc.contains("XCG")
				|| loaiThuTuc.contains("XBB")
				|| loaiThuTuc.contains("XMY"))
		{
			doiTuong = loaiThuTuc;
		}
		
		
		
				
		SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, portletUrl, null, "");
		long longTotal = 0;
		List<VehicleCertificate> lstVehicleCertificate = new ArrayList<VehicleCertificate>();
		
		ThongTinTimKiemHoSo	thongTinTimKiemHoSo = new ThongTinTimKiemHoSo();
		
		thongTinTimKiemHoSo.setLoaiThuTuc(loaiThuTuc);
		thongTinTimKiemHoSo.setMaSoHoSo(soHoSo);
		thongTinTimKiemHoSo.setNgayNopFrom(ngayNopHsFrom);
		thongTinTimKiemHoSo.setNgayNopTo(ngayNopHsTo);
		thongTinTimKiemHoSo.setSoDangKiKiemTra(soDangKiKiemTra);
		thongTinTimKiemHoSo.setNgayCapDangKiFrom(ngayCapDangKiFrom);
		thongTinTimKiemHoSo.setNgayCapDangKiTo(ngayCapDangKiTo);
		thongTinTimKiemHoSo.setSoBienBanKiemTra(soBienBanKiemTra);
		thongTinTimKiemHoSo.setNgayKiemTraFrom(ngayKiemTraFrom);
		thongTinTimKiemHoSo.setNgayKiemTraTo(ngayKiemTraTo);
		thongTinTimKiemHoSo.setTinhThanh(tinhThanh);
		thongTinTimKiemHoSo.setQuanHuyen(quanHuyen);
		
		thongTinTimKiemHoSo.setNguoiNhapKhau(doanhNghiep);
		thongTinTimKiemHoSo.setDonViKiemTra(donViKiemTra);
		thongTinTimKiemHoSo.setDangKiemVienKiemTra(dangKiemVienKiemTra);
		thongTinTimKiemHoSo.setSoToKhaiHaiQuan(soToKhaiHaiQuan);
		thongTinTimKiemHoSo.setNgayToKhaiHaiQuanFrom(ngayToKhaiHaiQuanFrom);
		thongTinTimKiemHoSo.setNgayToKhaiHaiQuanTo(ngayToKhaiHaiQuanTo);
		
		thongTinTimKiemHoSo.setStart(searchContainer.getStart());
		thongTinTimKiemHoSo.setEnd(searchContainer.getEnd());
		thongTinTimKiemHoSo.setSoInvoice(soInvoice);
		
		thongTinTimKiemHoSo.setOrganizationId(organizationId);
		thongTinTimKiemHoSo.setThuTucHanhChinhId(tenThuTuc);
		
		thongTinTimKiemHoSo.setSoVin(soVin);
		thongTinTimKiemHoSo.setSoKhung(soKhung);
		thongTinTimKiemHoSo.setSoDongCo(soDongCo);
		thongTinTimKiemHoSo.setMauSon(mauSon);
		thongTinTimKiemHoSo.setTinhTrangPhuongTien(tinhTrangPhuongTien);
		thongTinTimKiemHoSo.setThongSoKiThuatPhuongTien(thongSoKiThuatPhuongTien);
		thongTinTimKiemHoSo.setNamSanXuat(namSanXuat);
		thongTinTimKiemHoSo.setLoaiPhuongTienNK(loaiPhuongTienNK);
		thongTinTimKiemHoSo.setNhanhieu(nhanhieu);
		thongTinTimKiemHoSo.setTenThuongMai(tenthuongmai);
		thongTinTimKiemHoSo.setMaKieuLoai(makieuloai);
		thongTinTimKiemHoSo.setNuocSanXuat(nuocsanxuat);
		
		
		if(organizationId > 0) {
			lstVehicleCertificate = VehicleCertificateLocalServiceUtil.findVehicleCertificate(soChungChi, organizationId, tenThuTuc, doiTuong, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep,  ConvertUtil.convertToInt(namNhap), thongTinTimKiemHoSo, searchContainer.getStart(), searchContainer.getEnd());
			longTotal = VehicleCertificateLocalServiceUtil.countVehicleCertificate(soChungChi, organizationId, tenThuTuc, doiTuong, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep,  ConvertUtil.convertToInt(namNhap), thongTinTimKiemHoSo);

			searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
			searchContainer.setResults(lstVehicleCertificate);
		}
		if (lstVehicleCertificate == null) { 
			lstVehicleCertificate = new ArrayList<VehicleCertificate>(); 
		}
		
			
		

%>

<table class="wd-table table">
	<thead>
		<tr>
			<th>STT</th>
			<th>Số ĐKKT<br>Ngày ĐKKT</th>
			<th>Số BBKT<br>Ngày BBKT</th>
			<th>Số chứng chỉ<br>Ngày cấp</th>
			<th>Số khung</th>
			<th>Số động cơ</th>
			<th>Màu sơn<br>Năm sản xuất</th>
			<th>Tình trạng<br>phương tiện/ sử dung </th>
			<th><liferay-ui:message key="vn.gt.dk.chungchi.searchcontentfind.tendoanhnghiep" /></th>
			<th><liferay-ui:message key="vn.gt.dk.chungchi.searchcontentfind.thaotac" /> xem</th>
		</tr>
	</thead>
	

<tbody>
	<%
		int index = 1;
		for (VehicleCertificate oneVehicleCertificate : lstVehicleCertificate) {
			PortletURL viewHoSoUrl_filedangkykiemtraid = renderResponse.createRenderURL();
			viewHoSoUrl_filedangkykiemtraid.setParameter("jspPage", "/portlet/chungchi/certificate_phuongtiennhapkhau_report_export.jsp");
			viewHoSoUrl_filedangkykiemtraid.setParameter(Constants.TTHC_NOIDUNGHOSO_TAILIEUDINHKEM_ID, String.valueOf(oneVehicleCertificate.getFiledangkykiemtraId()));
			
			PortletURL viewHoSoUrl_filebienbankiemtraid = renderResponse.createRenderURL();
			viewHoSoUrl_filebienbankiemtraid.setParameter("jspPage", "/portlet/chungchi/certificate_phuongtiennhapkhau_report_export.jsp");
			viewHoSoUrl_filebienbankiemtraid.setParameter(Constants.TTHC_NOIDUNGHOSO_TAILIEUDINHKEM_ID, String.valueOf(oneVehicleCertificate.getFilebienbankiemtraId()));
			
			PortletURL viewHoSoUrl_filechungchiid = renderResponse.createRenderURL();
			viewHoSoUrl_filechungchiid.setParameter("jspPage", "/portlet/chungchi/certificate_phuongtiennhapkhau_report_export.jsp");
			viewHoSoUrl_filechungchiid.setParameter(Constants.TTHC_NOIDUNGHOSO_TAILIEUDINHKEM_ID, String.valueOf(oneVehicleCertificate.getFilechungchiId()));
			
			PortletURL viewHoSoUrl_filebaocaotnantoanid = renderResponse.createRenderURL();
			viewHoSoUrl_filebaocaotnantoanid.setParameter("jspPage", "/portlet/chungchi/certificate_phuongtiennhapkhau_report_export.jsp");
			viewHoSoUrl_filebaocaotnantoanid.setParameter(Constants.TTHC_NOIDUNGHOSO_TAILIEUDINHKEM_ID, String.valueOf(oneVehicleCertificate.getFilebaocaotnantoanId()));
			
			PortletURL viewHoSoUrl_filebaocaotnkhithaiid = renderResponse.createRenderURL();
			viewHoSoUrl_filebaocaotnkhithaiid.setParameter("jspPage", "/portlet/chungchi/certificate_phuongtiennhapkhau_report_export.jsp");
			viewHoSoUrl_filebaocaotnkhithaiid.setParameter(Constants.TTHC_NOIDUNGHOSO_TAILIEUDINHKEM_ID, String.valueOf(oneVehicleCertificate.getFilebaocaotnkhithaiId()));
			
			PortletURL viewHoSoUrl_fileketluangiamdinhid = renderResponse.createRenderURL();
			viewHoSoUrl_fileketluangiamdinhid.setParameter("jspPage", "/portlet/chungchi/certificate_phuongtiennhapkhau_report_export.jsp");
			viewHoSoUrl_fileketluangiamdinhid.setParameter(Constants.TTHC_NOIDUNGHOSO_TAILIEUDINHKEM_ID, String.valueOf(oneVehicleCertificate.getFileketluangiamdinhId()));
			
			PortletURL viewHoSoUrl_ViewBBKTBackup = renderResponse.createRenderURL();
			viewHoSoUrl_ViewBBKTBackup.setParameter("jspPage", "/portlet/chungchi/certificate_phuongtiennhapkhau_report_export.jsp");
			viewHoSoUrl_ViewBBKTBackup.setParameter(Constants.TTHC_NOIDUNGHOSO_ID, String.valueOf(oneVehicleCertificate.getAttachedFile()));
			String NgayDKKT = Validator.isNotNull(oneVehicleCertificate.getInspectionDate()) ? DateUtils.dateToString("dd/MM/yyyy", oneVehicleCertificate.getInspectionDate()) : "";
			String NgayBBKT = Validator.isNotNull(oneVehicleCertificate.getInspectionDateFrom()) ? DateUtils.dateToString("dd/MM/yyyy", oneVehicleCertificate.getInspectionDateFrom()) : "";
			String NgayKyCC = Validator.isNotNull(oneVehicleCertificate.getSignDate()) ? DateUtils.dateToString("dd/MM/yyyy", oneVehicleCertificate.getSignDate()) : "";
			String TrangThaiPT = "";
			MotCuaTrangThaiHoSo trangthai = MotCuaTrangThaiHoSoLocalServiceUtil.getMotCuaTrangThaiHoSo(oneVehicleCertificate.getVehicleengineStatus());
			if ((trangthai != null) && (trangthai.getTenTrangThai().length() > 0)){
				TrangThaiPT = trangthai.getTenTrangThai();
			}
			%>
			<tr>
				<td class="text-center" style="width: 25px;"><%= (index++) + searchContainer.getStart() %></td>
				<%
				if ((oneVehicleCertificate.getRegisteredNumber().length() > 0)) {
				%>
				<td class="text-center" style="width: 100px;"><%=oneVehicleCertificate.getRegisteredNumber()%><br><%= NgayDKKT %></td>
				<%
				} else {
				%>
				<td class="text-center" style="width: 100px;">---</td>
				<%
				} 
				%>
				
				<%
				if ((oneVehicleCertificate.getInspectionRecordNo().length() > 0)) {
				%>
				<td class="text-center" style="width: 100px;"><%=oneVehicleCertificate.getInspectionRecordNo()%><br><%= NgayBBKT %></td>
				<%
				} else {
				%>
				<td class="text-center" style="width: 100px;">---</td>
				<%
				} 
				%>
				
				<%
				if ((oneVehicleCertificate.getCertificateNumber().length() > 0)) {
				%>
				<td class="text-center" style="width: 100px;"><%=oneVehicleCertificate.getCertificateNumber()%><br><%= NgayKyCC %></td>
				<%
				} else {
				%>
				<td class="text-center" style="width: 100px;">---</td>
				<%
				} 
				%>			
				
				
				<td class="text-center" style="width: 100px;"><%=oneVehicleCertificate.getChassisNumber()%></td>
				<td class="text-center" style="width: 100px;"><%=oneVehicleCertificate.getEngineNumber()%></td>
				<td class="text-center" style="width: 70px;"><%=oneVehicleCertificate.getVehicleColor()%> <br> <%=oneVehicleCertificate.getProductionYear()%></td>
				<td class="text-center" style="width: 80px;"><i ><%=TrangThaiPT%> </i><br> <%=oneVehicleCertificate.getVehicleEngineUsage()%></td>					
				<td><span class="text-left" style="width: 120px;"><%=Validator.isNotNull(oneVehicleCertificate) ? oneVehicleCertificate.getImporterName() : ""%></span></td>
				<td class="text-left" style="width: 230px;">
				<a href="<%=viewHoSoUrl_filedangkykiemtraid.toString() %>" class="aicon"><i class="icon20 iconm5 xanh fa fa-pencil" style="font-size: 12px;"></i>Thông số kỹ thuật PT nhập khẩu</a>
				<br>
				<%
				if ((oneVehicleCertificate.getFiledangkykiemtraId() > 0)) {
				%>
				<a href="<%=viewHoSoUrl_filedangkykiemtraid.toString() %>" class="aicon"><i class="mar_r10 xanh fa fa-circle" style="font-size: 11px;"></i>Xác nhận cấp giấy ĐKKT</a>
				<%
				} else {
				%>
				<a href="<%= "" %>" class="aicon xam"><i class="mar_r10 xam fa fa-circle" style="font-size: 11px;">&nbsp;&nbsp;&nbsp;Xác nhận cấp giấy ĐKKT</i></a>
				<%
				} 
				%>
				<br>
				<%
				if ((oneVehicleCertificate.getFilebienbankiemtraId() > 0)) {
				%>
				<a href="<%=viewHoSoUrl_filebienbankiemtraid.toString() %>" class="aicon"><i class="mar_r10 xanh fa fa-circle" style="font-size: 11px;"></i>Biên bản kiểm tra hiện trường</a>
				<%
				} else {
				%>
				<a href="<%= "" %>" class="aicon xam"><i class="mar_r10 xam fa fa-circle" style="font-size: 11px;">&nbsp;&nbsp;&nbsp;Biên bản kiểm tra hiện trường</i></a>
				<%
				} 
				%>
				<br>
				<%
				if ((oneVehicleCertificate.getFilechungchiId() >0)) {
				%>
				
				<a href="<%=viewHoSoUrl_filechungchiid.toString() %>" class="aicon"><i class="mar_r10 xanh fa fa-circle" style="font-size: 11px;"></i>Chứng chỉ ATKT&&BVMT</a>
				<%
				} else {
				%>
				<a href="<%= "" %>" class="aicon"><i class="mar_r10 xam fa fa-circle" style="font-size: 11px;">&nbsp;&nbsp;&nbsp;Chứng chỉ ATKT&&BVMT</i></a>
				<%
				} 
				%>
				
				<%
				if ((oneVehicleCertificate.getFilebaocaotnantoanId() >0)) {
				%>
				<br>
				<a href="<%=viewHoSoUrl_filebaocaotnantoanid.toString() %>" class="aicon"><i class="mar_r10 xanh fa fa-circle" style="font-size: 11px;"></i>Báo cáo thử nghiệm an toàn</a>
				<%
				} else {
				%>
				
				<%
				} 
				%>
				
				<%
				if ((oneVehicleCertificate.getFilebaocaotnkhithaiId() >0)) {
				%>
				<br>
				<a href="<%=viewHoSoUrl_filebaocaotnkhithaiid.toString() %>" class="aicon"><i class="icon20 iconm5 fa fa-pencil" style="font-size: 11px;"></i>Báo cáo thử nghiệm khí thải</a>
				<%
				} else {
				%>
				
				<%
				} 
				%>				
				<%
				if ((oneVehicleCertificate.getFileketluangiamdinhId() >0)) {
				%>
				<br>
				<a href="<%=viewHoSoUrl_fileketluangiamdinhid.toString() %>" class="aicon"><i class="icon20 iconm5 fa fa-pencil" style="font-size: 11px;"></i>Kết luận giám định</a> 
				<%
				} else {
				%>
				
				<%
				} 
				%>
				</td>
			</tr>
			<%
		}
	%>
	</tbody> 
</table>
<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />

<br><br><br>