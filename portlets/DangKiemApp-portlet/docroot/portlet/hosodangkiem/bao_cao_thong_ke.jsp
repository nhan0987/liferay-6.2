<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectorLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.gt.dk.utils.VRNghiepVuUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView"%>

<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.IssueCategoryLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory"%>

<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.IssueTrackingLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentPeriodLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee"%>
<%@page import="java.util.List"%>
<%@ include file="/portlet/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<%
String inspectorId = ParamUtil.getString(request, Constants.INSPECTOR_ID);
String corporationId = ParamUtil.getString(request, Constants.CORPORATION_ID);
String corporationInspectorId = ParamUtil.getString(request, Constants.CORPORATION_INSPECTOR);

	CorporationInspector corporationInspectorLogin = null;
	String corporationIdLogin = "";
	String corporationInspectorName = "";
	try {
		corporationInspectorLogin = CorporationInspectorLocalServiceUtil.fetchByInspectorId(user.getUserId());
		if (Validator.isNull(corporationInspectorLogin)) {
			corporationIdLogin = corporationInspectorLogin.getCorporationId();
			corporationInspectorName = corporationInspectorLogin.getInspectorName();
		}
	} catch (Exception es) {
		//es.printStackTrace();
	}
	if (Validator.isNull(corporationInspectorLogin)) { corporationInspectorLogin = new CorporationInspectorImpl(); } 
	
	String returnURL = ParamUtil.getString(request, Constants.RETURN_URL);
	
	if (Validator.isNull(returnURL) || (Validator.isNotNull(returnURL) && !returnURL.trim().contains("group"))) {
		PortletURL returnUrlB =  renderResponse.createRenderURL();
		returnUrlB.setParameter("jspPage", "/portlet/quanlyruiro/view.jsp");
		returnURL = returnUrlB.toString();
	}
	String specificationgroupcode = DanhMucKey.A3_CODE;
	long groupId = ConvertUtil.convertToLong(specificationgroupcode);
	int level = 0;
	String code_1 = "A301"; // fix Loại lỗi - Nguy cơ rủi ro sản phẩm
	List<DmDataItem> lstLoaiLoi = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevelAndCode1OrderByDescription(groupId, level, code_1);
	
	level = 0;
	code_1 = "A306"; // fix Phân nhóm nghiệp vụ
	List<DmDataItem> lstPhanLoaiNghiepVu = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevelAndCode1OrderByDescription(groupId, level, code_1);
		
	level = 0;
	code_1 = "A302"; // fix A-Mục đích nhập khẩu
	List<DmDataItem> lstMucDichNhapKhau = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevelAndCode1OrderByDescription(groupId, level, code_1);
	
	level = 0;
	code_1 = "A303"; // fix B-Tình trạng phương tiện
	List<DmDataItem> lstTinhTrangPhuongTien = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevelAndCode1OrderByDescription(groupId, level, code_1);
	
	level = 0;
	code_1 = "A304"; // fix C-Tình trạng chứng nhận
	List<DmDataItem> lstTinhTrangChungNhan = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevelAndCode1OrderByDescription(groupId, level, code_1);
	

	level = 0;
	code_1 = "A305"; // fix D-Phạm vi hoạt động
	List<DmDataItem> lstPhamViHoatDong = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevelAndCode1OrderByDescription(groupId, level, code_1);

	List<DmDataItem> lstDonViKiemTra = DmDataItemLocalServiceUtil.findByDataGroupCodeNameAndDataItemAlterName(DanhMucKey.CORPORATION, "KIEMTRA");
	if (lstDonViKiemTra == null) { lstDonViKiemTra = new ArrayList<DmDataItem>(); }
	
	List<DmDataItem> lstThuocDonVi = DmDataItemLocalServiceUtil.findByNameGroupAndMultilAlterName(DanhMucKey.CORPORATION, "KIEMTRA" , "DANGKIEM");
	if (lstThuocDonVi == null) { lstThuocDonVi = new ArrayList<DmDataItem>(); }
	
	List<DmDataItem> lstDoiKiemTra = DmDataItemLocalServiceUtil.findByDataGroupCodeNameAndDataItemAlterName(DanhMucKey.CORPORATION, "KIEMTRA");
	if (lstDoiKiemTra == null) { lstDoiKiemTra = new ArrayList<DmDataItem>(); }
	
	List<CorporationView> lstCorporationView = CorporationViewLocalServiceUtil.findByInspectorId(ConvertUtil.convertToLong(inspectorId));
	if (lstCorporationView == null) { lstCorporationView = new ArrayList<CorporationView>(); }
	
    String doanhNghiep = ParamUtil.getString(request, Constants.DOANH_NGHIEP);
    String loaiLoi = ParamUtil.getString(request, Constants.LOAI_THU_TUC);
    String motaNoiDungLoi = ParamUtil.getString(request, Constants.LOAI_DIEU_KIEN);
    String tenSanPham = ParamUtil.getString(request, Constants.LOAI_PHUONG_TIEN_NK);
    String ngayNopHsFrom = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_FROM);
    String ngayNopHsTo = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_TO);
    String soBienBanKiemTra = ParamUtil.getString(request, Constants.SO_BIENBAN_KIEMTRA);
    String soDangKiKiemTra = ParamUtil.getString(request, Constants.SO_DANGKI_KIEMTRA);
    String donViKiemTra = ParamUtil.getString(request, Constants.DON_VI_KIEM_TRA);
    
	PortletURL viewURL = renderResponse.createRenderURL();
	viewURL.setParameter(Constants.CORPORATION_ID, corporationIdLogin);
	viewURL.setParameter("jspPage", "/portlet/quanlyruiro/viewkiemsoatloivaq.jsp");
	
	if (doanhNghiep != null) {
		viewURL.setParameter(Constants.DOANH_NGHIEP, doanhNghiep);
	}
	if (loaiLoi != null) {
		viewURL.setParameter(Constants.LOAI_THU_TUC, loaiLoi);
	}
	if (motaNoiDungLoi != null) {
		viewURL.setParameter(Constants.LOAI_DIEU_KIEN, motaNoiDungLoi);
	}
	if (tenSanPham != null) {
		viewURL.setParameter(Constants.LOAI_PHUONG_TIEN_NK, tenSanPham);
	}
	if (ngayNopHsFrom != null) {
		viewURL.setParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFrom);
	}
	if (ngayNopHsTo != null) {
		viewURL.setParameter(Constants.NGAY_NOP_HO_SO_TO, ngayNopHsTo);
	}
	if (soDangKiKiemTra != null) {
		viewURL.setParameter(Constants.SO_DANGKI_KIEMTRA, soDangKiKiemTra);
	}
	if (soBienBanKiemTra != null) {
		viewURL.setParameter(Constants.SO_BIENBAN_KIEMTRA, soBienBanKiemTra);
	}	
	if (donViKiemTra != null) {
		viewURL.setParameter(Constants.DON_VI_KIEM_TRA, donViKiemTra);
	}
	
// 	if (Validator.isNotNull(lstPhanLoaiNghiepVu) && lstPhanLoaiNghiepVu.size() > 0) {
// 		for (DmDataItem item : lstPhanLoaiNghiepVu) {xemDuLieu + item.getCode0()}
// 	}
	
	SearchContainer<IssueTracking> searchContainer = new SearchContainer<IssueTracking>(renderRequest, 
			null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, viewURL, null, "");
	
	List<IssueTracking> list = IssueTrackingLocalServiceUtil.findIssueTrackingByDate(soDangKiKiemTra, soBienBanKiemTra, motaNoiDungLoi, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, tenSanPham, searchContainer.getStart(), searchContainer.getEnd());
	int total = IssueTrackingLocalServiceUtil.countIssueTrackingListByDate(soDangKiKiemTra, soBienBanKiemTra, motaNoiDungLoi, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, tenSanPham);
	
	searchContainer.setTotal(total);
	searchContainer.setResults(list);
	
	PortletURL urlThemPhieuGhiNhanLoi = renderResponse.createRenderURL();
	urlThemPhieuGhiNhanLoi.setParameter(Constants.INSPECTOR_ID, corporationInspectorLogin.getInspectorid() + "");
	urlThemPhieuGhiNhanLoi.setParameter(Constants.CORPORATION_ID, corporationIdLogin);
	urlThemPhieuGhiNhanLoi.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
	urlThemPhieuGhiNhanLoi.setParameter("isNewIssueTracking", "true");
	urlThemPhieuGhiNhanLoi.setParameter("jspPage", "/portlet/quanlyruiro/createCorporationInspector.jsp");

	
	// Ghi actionlog
	String noidungthaotac = "Mở xem Báo cáo thống kê thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
	String tenmanhinhdaidien = "Nội dung Báo cáo thống kê";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);


%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
	<aui:form action="" name="myForm" id="myForm" method="POST">
		<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" >
		<div tabindex="0" class="CollapsiblePanelTab">
			<h5 class="tieude">
				Báo cáo thống kê
				<i class="fa-right fa fa-angle-down"></i>
			</h5>
			<h5></h5>
		</div>
		<br>
		<div class="row" id="xemLoiVAQ" style="display: block;margin-left: 0px;margin-right: 0px;">
					<a onclick="defectON('<%=StringPool.BLANK%>')"><label>[---Đội/Phòng---]</label></a>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<a onclick="defectIGNORE('<%=StringPool.BLANK%>')"><label>[---Báo cáo tổng hợp---]</label></a>
					&nbsp</div>	
		<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2" style="height: 320px; width: 300px">
					
					
					<div class="row" id = "doiKiemTraVAQ" style="display: block;
							    overflow-y: scroll;
							    overflow-x: hidden;
							    max-width:320px;
							    max-height:300px;">
					<table class="wd-table table" style="margin-left: 15px;">
								<thead>
									<tr>
										<td class="text-center thTblDoi">Chọn</td>										
										<td class="text-center thTblDoi">Tên đội</td>
									</tr>
								</thead>
								<tbody>
									<%
									int index = 1;
									//neu la them moi
									LogFactoryUtil.getLog(QuanLyNguoiDungAction.class).info("--createCorporationInspector.jsp---corporationInspector===="+ (Validator.isNull(corporationInspectorLogin) ? "==null==" : "==not null=="));
									if (Validator.isNull(corporationInspectorLogin)) {
										for (DmDataItem item : lstDoiKiemTra) {
											%>
											<tr>
												<td class="text-center; width : 30px">
													<input type="checkbox" id="lanhDao<%=item.getCode0()%>" name="lanhDao<%=item.getCode0()%>" onchange="checkLanhDao('<%=item.getCode0()%>')"/>
												</td>												
												<td class="text-center">
													<input type="hidden" id="doiKiemTra<%=item.getCode0()%>" name="doiKiemTra<%=item.getCode0()%>" value="<%=item.getCode0()%>" />
													<%=item.getName()%>
												</td>
											</tr>
											<%
										}
									//neu la sua
									} else {
										for (DmDataItem item : lstDoiKiemTra) {
											%>
											<tr>
												<td class="text-center">
													<input type="checkbox" id="lanhDao<%=item.getCode0()%>" name="lanhDao<%=item.getCode0()%>" onchange="checkLanhDao('<%=item.getCode0()%>')" 
															<%=VRNghiepVuUtils.checkIsLeader(lstCorporationView, item.getCode0())%> />
												</td>
												
												<td class="text-center">
													<input type="hidden" id="doiKiemTra<%=item.getCode0()%>" name="doiKiemTra<%=item.getCode0()%>" value="<%=item.getCode0()%>" />
													<%=item.getName()%>
												</td>
											</tr>
											<%
										}
									}
									%>
								</tbody>
							</table>
					</div>
					
					
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10" style="height: 320px; width: 600px">
					<div class="row" id = "mauBaoCaoThongKeVAQ" style="display: block;								
							    overflow: auto;
							    overflow-y: scroll;
							    max-width:620px;
							    max-height:300px; margin-left: 15px;">
					<a href="<%= StringPool.BLANK %>" class="aicon"><i class="mar_r10 xanh fa fa-circle" style="font-size: 13x;"></i><b>Báo cáo Kết quả hoạt động Tổ Ô tô VAQ</b></a><br>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">Đăng ký, đề nghị và kiểm tra hiện trường</a><br>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">Cấp Chứng chỉ chất lượng, thông báo vi phạm Nghị định 187</a><br>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">Xe phải khắc phục để chứng nhận lại, tái xuất trước kiểm tra</a><br>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">Báo cáo về việc đề nghị kiểm tra không đúng với địa điểm đăng ký</a><br>
						                    
                    <a href="<%= StringPool.BLANK %>" class="aicon"><i class="mar_r10 xanh fa fa-circle" style="font-size: 13x;"></i><b>Báo cáo Kết quả hoạt động Tổ Xe máy VAQ</b></a><br>
                    	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">Đăng ký, đề nghị và kiểm tra hiện trường</a><br>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">Cấp Chứng chỉ chất lượng, thông báo vi phạm Nghị định 187</a><br>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">Xe phải khắc phục để chứng nhận lại, tái xuất trước kiểm tra</a><br>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">Báo cáo về việc đề nghị kiểm tra không đúng với địa điểm đăng ký</a><br>
                    <a href="<%= StringPool.BLANK %>" class="aicon"><i class="mar_r10 xanh fa fa-circle" style="font-size: 13x;"></i><b>Báo cáo Kết quả hoạt động Tổ Xe máy chuyên dùng VAQ</b></a><br>
                    	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">Đăng ký, đề nghị và kiểm tra hiện trường</a><br>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">Cấp Chứng chỉ chất lượng, thông báo vi phạm Nghị định 187</a><br>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">Xe được yêu cầu khắc phục trước khi kiểm tra, tái xuất trước kiểm tra</a><br>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">Báo cáo về việc đề nghị kiểm tra không đúng với địa điểm đăng ký</a><br>
						
                    
                    <a href="<%= StringPool.BLANK %>" class="aicon"><i class="mar_r10 xanh fa fa-circle" style="font-size: 13x;"></i><b>Báo cáo Phòng VAQ</b></a><br>
                       	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">TRƯNG CẦU GIÁM ĐỊNH, XE VI PHẠM NGHỊ ĐỊNH 187, XE ĐƯỢC KIỂM TRA THEO YÊU CẦU</a><br>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">ĐỊA ĐIỂM ĐỀ NGHỊ KIỂM TRA KHÁC VỚI ĐỊA ĐIỂM ĐĂNG KÝ KIỂM TRA</a><br>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">BÁO CÁO THỰC HIỆN THỦ TỤC HÀNH CHÍN</a><br>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">BÁO CÁO TỔNG HỢP TÌNH HÌNH ĐIỀU CHỈNH CHỨNG CHỈ CHẤT LƯỢNG</a><br>
                    
                    <a href="<%= StringPool.BLANK %>" class="aicon"><i class="mar_r10 xanh fa fa-circle" style="font-size: 13x;"></i><b>Báo cáo Tổ nghiệp vụ VAQ</b></a><br>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">TỔNG HỢP SỐ LIỆU NHẬP KHẨU</a><br>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">SỐ LIỆU XE CƠ GIỚI NHẬP KHẨU THEO PHÂN KHÚC</a><br>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">SỐ LIỆU XE CƠ GIỚI NHẬP KHẨU THEO NHÓM PHƯƠNG TIỆN</a><br>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">TỔNG HỢP SỐ LIỆU THỰC HIỆN CÁC THỦ TỤC TRỰC TUYẾN</a><br>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">BÁO CÁO TỔNG HỢP TÌNH HÌNH ĐIỀU CHỈNH CHỨNG CHỈ CHẤT LƯỢNG</a><br>
                    
                    <a href="<%= StringPool.BLANK %>" class="aicon"><i class="mar_r10 xanh fa fa-circle" style="font-size: 13x;"></i><b>Báo cáo của Đội kiểm tra</b></a><br>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">BÁO CÁO TỔNG HỢP TÌNH HÌNH ĐIỀU CHỈNH CHỨNG CHỈ CHẤT LƯỢNG</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">BÁO CÁO TỔNG HỢP CỦA ĐỘI KIỂM TRA</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">DANH SÁCH HỒ SƠ ĐĂNG KÝ KIỂM TRA</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">DANH SÁCH HỒ SƠ ĐỀ NGHỊ KIỂM TRA</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">DANH SÁCH HỒ SƠ ĐĂNG KÝ CHƯA ĐỀ NGHỊ KIỂM TRA</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">DANH SÁCH HỒ SƠ ĐĂNG KÝ KIỂM TRA CHƯA HOÀN TẤT ĐỀ NGHỊ KIỂM TRA</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">DANH SÁCH CÁC PHƯƠNG TIỆN CHƯA ĐỀ NGHỊ KIỂM TRA</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">DANH SÁCH CÁC PHƯƠNG TIỆN BỊ TỪ CHỐI KIỂM TRA</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">DANH SÁCH CÁC PHƯƠNG TIỆN ĐĂNG KÝ KIỂM TRA</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">BẢNG PHÂN CÔNG KIỂM TRA</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">DANH SÁCH PHƯƠNG TIỆN ĐƯỢC PHÂN CÔNG KIỂM TRA CHO ĐKV</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">DANH SÁCH PHƯƠNG TIỆN HOÃN KIỂM TRA</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">BÁO CÁO TÌNH HÌNH KIỂM TRA</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">BÁO CÁO TỔNG HỢP CÔNG TÁC KIỂM TRA</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">DANH SÁCH BẢN THẢO CHỨNG CHỈ CHƯA HOÀN TẤT</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">DANH SÁCH BẢN THẢO CHỨNG CHỈ CHƯA HOÀN TẤT TẠI VAQ</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">DANH SÁCH CHỨNG CHỈ XE CƠ GIỚI NHẬP KHẨU ĐÃ CẤP</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">BÁO CÁO CẤP CHỨNG CHỈ THEO ĐƠN VỊ NHẬP KHẨU</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">THỐNG KÊ SỐ LƯỢNG PHƯƠNG TIỆN NHẬP KHẨU THEO LOẠI PHƯƠNG TIỆN</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">THỐNG KÊ SỐ LƯỢNG PHƯƠNG TIỆN NHẬP KHẨU THEO NHÃN HIỆU, SỐ LOẠI</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">THỐNG KÊ LỖI SỬA ĐỔI CHỨNG CHỈ</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">DANH SÁCH HỒ SƠ ĐKKT ĐÃ HOÀN TẤT CẤP CHỨNG CHỈ</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">DANH SÁCH CÁC XE VI PHẠM NGHỊ ĐỊNH 187</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">THỐNG KÊ SỐ LƯỢNG XE VI PHẠM NGHỊ ĐỊNH 187</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">BÁO CÁO VỀ CÁC TRƯỜNG HỢP CẤP CHỨNG CHỈ VƯỢT QUÁ THỜI GIAN QUY ĐỊNH</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">BÁO CÁO TÌNH HÌNH, KẾT QUẢ GIẢI QUYẾT THỦ TỤC HÀNH CHÍNH</a><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--&nbsp;&nbsp;&nbsp;
						<a href="<%= StringPool.BLANK %>" class="aicon">BÁO CÁO TỔNG HỢP SỐ LƯỢNG ẤN CHỈ SỬ DỤNG</a><br>
					</div>
					
					
				</div>
			</div>
		</div>
		<br>
			


		<p style="text-align:center;">
			<button type="submit" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 5px" >Chạy báo cáo</button>
						
			<button type="button" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px" onclick="javascript: window.location = '<%=returnURL%>'">
				Quay lại
			</button>
		</p>	
			<table class="wd-table table">
				<caption style = "font-size: 20px">Nội dung báo cáo thống kê</caption>
			</table>
			
		</aui:form>
	</div>
</div>
<script type="text/javascript">

function beforSummitForm(idForm, url) {
	var urlAction = document.getElementById('<portlet:namespace/>' + idForm).action;
	
	if (urlAction == '') {
		document.getElementById('<portlet:namespace/>' + idForm).action = url;
	}
	
	var status = confirm("Bạn có muốn tiếp tục xử lý?");
	
	if (status) {
		document.getElementById('<portlet:namespace/>' + idForm).submit(); 
	} else {
		document.getElementById('<portlet:namespace/>' + idForm).action = '';
	}
}

function defectON(urlFile) {
	$('#doiKiemTraVAQ').show();
	$('#mauBaoCaoThongKeVAQ').hide();
	//window.open(urlFile);
};

function defectIGNORE(urlFile) {
	$('#doiKiemTraVAQ').hide();
	$('#mauBaoCaoThongKeVAQ').show();
	//window.open(urlFile);
};
</script>