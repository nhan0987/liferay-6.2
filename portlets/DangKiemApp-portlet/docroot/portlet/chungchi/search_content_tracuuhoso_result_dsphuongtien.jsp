<%@page import="vn.dtt.gt.dk.utils.QueryStringUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TimKiemHoSo"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TimKiemHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.tracuthongtin.ThongTinTimKiemHoSo"%>
<%@page import="vn.dtt.gt.dk.utils.format.FormatData"%>
<%@page import="vn.dtt.gt.dk.portlet.chungchi.TraCuuChungChiAction"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="vn.dtt.gt.dk.utils.VRNghiepVuUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord"%>
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
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ include file="/portlet/init.jsp"%>



<%
	//-------------- Organization
	long organizationId = 0;
	if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
		organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
	}
	
	//Thanh phan ben trai
	String idMotCuaTrangThaiHoSoPT = ParamUtil.getString(request, Constants.ID_MOTCUA_TRANGTHAIHOSO);
	String soDangKiKiemTraPT = ParamUtil.getString(request, Constants.SO_DANGKI_KIEMTRA);
	String ngayCapDangKiFromPT = ParamUtil.getString(request, Constants.NGAY_CAP_DANG_KI_FROM);
	String ngayCapDangKiToPT = ParamUtil.getString(request, Constants.NGAY_CAP_DANG_KI_TO);
	
	String soBienBanKiemTraPT = ParamUtil.getString(request, Constants.SO_BIENBAN_KIEMTRA);
	String ngayKiemTraFromPT = ParamUtil.getString(request, Constants.NGAY_KIEM_TRA_FROM);
	String ngayKiemTraToPT = ParamUtil.getString(request, Constants.NGAY_KIEM_TRA_TO);
	String donViKiemTraPT = ParamUtil.getString(request, Constants.DON_VI_KIEM_TRA);
	String dangKiemVienKiemTraPT = ParamUtil.getString(request, Constants.ID_DANG_KIEM_VIEN_KIEMTRA);
	
	String soToKhaiHaiQuanPT = ParamUtil.getString(request, Constants.SO_TO_KHAI_HAI_QUAN);
	String ngayToKhaiHaiQuanFromPT = ParamUtil.getString(request, Constants.NGAY_TOKHAI_HAIQUAN_FROM);
	String ngayToKhaiHaiQuanToPT = ParamUtil.getString(request, Constants.NGAY_TOKHAI_HAIQUAN_TO);
	
	String nguoiNhapKhauPT = ParamUtil.getString(request, Constants.NGUOI_NHAP_KHAU);
	
	String soHoSoPT = ParamUtil.getString(request, Constants.SO_HO_SO);
	String ngayNopHsFromPT = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_FROM);
	String ngayNopHsToPT = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_TO);
	String doiTuongThucHienPT = ParamUtil.getString(request, Constants.DOI_TUONG_THUC_HIEN);
	
	String tenThuTucPT = ParamUtil.getString(request, Constants.TEN_THU_TUC);
	//add new
	
	String tinhThanhPT = ParamUtil.getString(request, Constants.TINH_THANH);
	String quanHuyenPT = ParamUtil.getString(request, Constants.QUAN_HUYEN);
	String soInvoicePT = ParamUtil.getString(request, Constants.SO_INVOICE);
	
	//thanh phan ben phai
	long idMotCuaTrangThaiXePT = ParamUtil.getLong(request, Constants.TRANG_THAI_CUA_XE);
	
	String vehicleClassPT = ParamUtil.getString(request, Constants.LOAI_THU_TUC);
	String soKhungPT = ParamUtil.getString(request, Constants.SO_KHUNG);
	String soDongCoPT = ParamUtil.getString(request, Constants.SO_DONG_CO);
	String mauSonPT = ParamUtil.getString(request, Constants.MAU_SON);
	String tinhTrangPhuongTienPT = ParamUtil.getString(request, Constants.TINH_TRANG_PHUONG_TIEN);
	String namNhapPT = ParamUtil.getString(request, Constants.NAM_NHAP);
	String thongSoKiThuatPT = ParamUtil.getString(request, Constants.THONGSO_KITHUAT_PHUONGTIEN);
	
	//-------------------------------portlet url
	PortletURL portletUrlPhuongTien = renderResponse.createRenderURL();
	portletUrlPhuongTien.setParameter("mvcPath", "/portlet/chungchi/search_content_tracuuhoso_dsphuongtien.jsp");
	portletUrlPhuongTien.setParameter("pathTab", "/portlet/chungchi/search_content_tracuuhoso_dsphuongtien.jsp");
	portletUrlPhuongTien.setParameter(SearchContainer.DEFAULT_CUR_PARAM, ParamUtil.getString(request, Constants.CUR_DS_PHUONGTIEN));
	
	LogFactoryUtil.getLog(TraCuuChungChiAction.class).info("==dsphuongtien.jsp==cur==" + ParamUtil.getString(request, SearchContainer.DEFAULT_CUR_PARAM));
		
	
	//ben trai
	portletUrlPhuongTien.setParameter(Constants.ID_MOTCUA_TRANGTHAIHOSO, idMotCuaTrangThaiHoSoPT + "");
	portletUrlPhuongTien.setParameter(Constants.SO_DANGKI_KIEMTRA, soDangKiKiemTraPT);
	portletUrlPhuongTien.setParameter(Constants.NGAY_CAP_DANG_KI_FROM, ngayCapDangKiFromPT);
	portletUrlPhuongTien.setParameter(Constants.NGAY_KIEM_TRA_TO, ngayCapDangKiToPT);
	portletUrlPhuongTien.setParameter(Constants.DON_VI_KIEM_TRA, donViKiemTraPT);
	portletUrlPhuongTien.setParameter(Constants.ID_DANG_KIEM_VIEN_KIEMTRA, dangKiemVienKiemTraPT);
	
	portletUrlPhuongTien.setParameter(Constants.SO_TO_KHAI_HAI_QUAN, soToKhaiHaiQuanPT);
	portletUrlPhuongTien.setParameter(Constants.NGAY_TOKHAI_HAIQUAN_FROM, ngayToKhaiHaiQuanFromPT);
	portletUrlPhuongTien.setParameter(Constants.NGAY_TOKHAI_HAIQUAN_TO, ngayToKhaiHaiQuanToPT);
	
	portletUrlPhuongTien.setParameter(Constants.NGUOI_NHAP_KHAU, nguoiNhapKhauPT);
	
	portletUrlPhuongTien.setParameter(Constants.SO_HO_SO, soHoSoPT);
	portletUrlPhuongTien.setParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFromPT);
	portletUrlPhuongTien.setParameter(Constants.NGAY_NOP_HO_SO_TO, ngayNopHsToPT);
	portletUrlPhuongTien.setParameter(Constants.DOI_TUONG_THUC_HIEN, doiTuongThucHienPT);
	portletUrlPhuongTien.setParameter(Constants.TEN_THU_TUC, tenThuTucPT);
	
	
	//ben phai
	portletUrlPhuongTien.setParameter(Constants.TRANG_THAI_CUA_XE, idMotCuaTrangThaiXePT + "");
	
	if (soKhungPT != null) { portletUrlPhuongTien.setParameter(Constants.SO_KHUNG, soKhungPT); }
	if (soDongCoPT != null) { portletUrlPhuongTien.setParameter(Constants.SO_DONG_CO, soDongCoPT); }
	if (mauSonPT != null) { portletUrlPhuongTien.setParameter(Constants.MAU_SON, mauSonPT); }
	if (tinhTrangPhuongTienPT != null) { portletUrlPhuongTien.setParameter(Constants.TINH_TRANG_PHUONG_TIEN, tinhTrangPhuongTienPT); }
	if (namNhapPT != null) { portletUrlPhuongTien.setParameter(Constants.NAM_NHAP, namNhapPT); }
	if (thongSoKiThuatPT != null) { portletUrlPhuongTien.setParameter(Constants.THONGSO_KITHUAT_PHUONGTIEN, thongSoKiThuatPT); }
	
	String cur_Param = ParamUtil.getString(request, Constants.CUR_DS_PHUONGTIEN);
	if (cur_Param.length() == 0) {
		cur_Param = SearchContainer.DEFAULT_CUR_PARAM;
	}
	
	SearchContainer<VehicleRecord> searchContainerPhuongTien = new SearchContainer<VehicleRecord>(
			renderRequest, 						//PortletRequest portletRequest
			null, 								//DisplayTerms displayTerms
			null, 								//DisplayTerms searchTerms,
			SearchContainer.DEFAULT_CUR_PARAM,	//String curParam
			5, 					//int delta
			portletUrlPhuongTien, 	//PortletURL iteratorURL,
			null, 					//List<String> headerNames
			""						//String emptyResultsMessage
			);
	
	
	//List<DmDataItem> lstTinhTrangPhuongTien = DmDataItemLocalServiceUtil.findByDmDataGroupCode(DanhMucKey.USAGE);
	//if (lstTinhTrangPhuongTien == null) { lstTinhTrangPhuongTien = new ArrayList<DmDataItem>(); }
	
	List<VehicleRecord> lstVehicleRecord = null;
	
	long totalVehicleRecord = 0;
	
	if (organizationId > 0) {
		/*lstHoSoThuTuc= TthcHoSoThuTucLocalServiceUtil.searchTraCuuThongTinHoSo("", soDangKiKiemTraHS, ngayCapDangKiFromHS, ngayCapDangKiToHS,
			organizationId, tenThuTucHS, soHoSoHS, ngayNopHsFromHS, ngayNopHsToHS, nguoiNhapKhauHS, searchContainerHoSo.getStart(), searchContainerHoSo.getEnd());
		*/
		ThongTinTimKiemHoSo	thongTinTimKiemHoSo = new ThongTinTimKiemHoSo();
		
		thongTinTimKiemHoSo.setTrangThaiPhieuXuLy(idMotCuaTrangThaiHoSoPT);
		thongTinTimKiemHoSo.setMaSoHoSo(soHoSoPT);
		thongTinTimKiemHoSo.setNgayNopFrom(ngayNopHsFromPT);
		thongTinTimKiemHoSo.setNgayNopTo(ngayNopHsToPT);
		thongTinTimKiemHoSo.setSoDangKiKiemTra(soDangKiKiemTraPT);
		thongTinTimKiemHoSo.setNgayCapDangKiFrom(ngayCapDangKiFromPT);
		thongTinTimKiemHoSo.setNgayCapDangKiTo(ngayCapDangKiToPT);
		thongTinTimKiemHoSo.setSoBienBanKiemTra(soBienBanKiemTraPT);
		thongTinTimKiemHoSo.setNgayKiemTraFrom(ngayKiemTraFromPT);
		thongTinTimKiemHoSo.setNgayKiemTraTo(ngayKiemTraToPT);
		thongTinTimKiemHoSo.setTinhThanh(tinhThanhPT);
		thongTinTimKiemHoSo.setQuanHuyen(quanHuyenPT);
		
		thongTinTimKiemHoSo.setNguoiNhapKhau(nguoiNhapKhauPT);
		thongTinTimKiemHoSo.setDonViKiemTra(donViKiemTraPT);
		thongTinTimKiemHoSo.setDangKiemVienKiemTra(dangKiemVienKiemTraPT);
		thongTinTimKiemHoSo.setSoToKhaiHaiQuan(soToKhaiHaiQuanPT);
		thongTinTimKiemHoSo.setNgayToKhaiHaiQuanFrom(ngayToKhaiHaiQuanFromPT);
		thongTinTimKiemHoSo.setNgayToKhaiHaiQuanTo(ngayToKhaiHaiQuanToPT);
		
		thongTinTimKiemHoSo.setStart(searchContainerPhuongTien.getStart());
		thongTinTimKiemHoSo.setEnd(searchContainerPhuongTien.getEnd());
		thongTinTimKiemHoSo.setSoInvoice(soInvoicePT);
		
		thongTinTimKiemHoSo.setOrganizationId(organizationId);
		thongTinTimKiemHoSo.setThuTucHanhChinhId(tenThuTucPT);
		
		if(idMotCuaTrangThaiHoSoPT!=null&&idMotCuaTrangThaiHoSoPT.length()>0&& Long.valueOf(idMotCuaTrangThaiHoSoPT)>0){
			thongTinTimKiemHoSo.setTrangThaiHoSoId(idMotCuaTrangThaiHoSoPT);
		}
		
		//lstHoSoThuTuc= TimKiemHoSoLocalServiceUtil.searchTraCuuThongTinHoSo(thongTinTimKiemHoSo);
			
		
		//totalHoSoThuTuc = TimKiemHoSoLocalServiceUtil.countTraCuuThongTinHoSo(thongTinTimKiemHoSo);
		
		String queryViewTimKiemHoSo = QueryStringUtil.getQueryViewTimKIemHoSo(thongTinTimKiemHoSo);
		String queryCountViewTimKiemHoSo = QueryStringUtil.getQueryCountViewTimKIemHoSo(thongTinTimKiemHoSo);
		
		lstVehicleRecord = VehicleRecordLocalServiceUtil.searchVehicleRecord(vehicleClassPT, idMotCuaTrangThaiXePT, soKhungPT, soDongCoPT, mauSonPT, tinhTrangPhuongTienPT, namNhapPT, queryViewTimKiemHoSo,
		searchContainerPhuongTien.getStart(), searchContainerPhuongTien.getEnd());
				
		totalVehicleRecord = VehicleRecordLocalServiceUtil.countSearchVehicleRecord(vehicleClassPT, idMotCuaTrangThaiXePT, soKhungPT, soDongCoPT, mauSonPT, tinhTrangPhuongTienPT, namNhapPT, queryCountViewTimKiemHoSo);
				
		searchContainerPhuongTien.setResults(lstVehicleRecord);
		searchContainerPhuongTien.setTotal(Integer.parseInt(String.valueOf(totalVehicleRecord)));
				
		if (lstVehicleRecord == null) { 
			lstVehicleRecord = new ArrayList<VehicleRecord>(); 
		}
	}
	
%>

<liferay-util:include page='<%="/portlet/chungchi/search_content_tracuuhoso_tabs.jsp"%>' servletContext="<%=application%>" />
<table class="wd-table table">
	<thead>
		<tr>
			<th>STT</th>
			<th>Số chứng chỉ<br>Ngày ký</th>
			<th>Số khung(số VIN)</th>
			<th>Số động cơ</th>
			<th style="width: 30px;">Năm sản xuất</th>
			<th>Màu sơn<br>Tình trạng phương tiện</th>
			<th>Giá NK</th>
			
			

		</tr>
	</thead>
	<tbody>
	<%
	int index = 1;
	for (VehicleRecord item : lstVehicleRecord) {
			CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil.fetchCertificateRecord(item.getCertificateRecordId());
		%>
		<tr>
			<td class="text-center"><%= (index++) + searchContainerPhuongTien.getStart() %></td>
			<td class="text-center"><%=Validator.isNotNull(certificateRecord) ? certificateRecord.getCertificateNumber() : "---"%><br><%=Validator.isNotNull(certificateRecord) ? FormatData.parseDateToTringDDMMYYY(certificateRecord.getSignDate()) : StringPool.BLANK %></td>
			<td class="text-center"><%=item.getChassisNumber()%></td>
			<td class="text-center"><%=item.getEngineNumber()%></td>
			<td><span class="text-left"><%=item.getProductionYear()%></span></td>
			<td><span class="text-left"><%=item.getVehicleColor()%> <br><%=VRNghiepVuUtils.getVehicleEngineStatusFromList(lstTinhTrangPhuongTien, item.getVehicleEngineStatus())%></span></td>
			<td class="text-right"><%=item.getCurrency()%>&nbsp;&nbsp;<%=new BigDecimal(item.getUnitPrice()).toPlainString()%></td>
			
			
		</tr>
		<%
	}
	%>
	</tbody>
</table>
<liferay-ui:search-paginator searchContainer="<%=searchContainerPhuongTien%>"/>

<br><br><br>
