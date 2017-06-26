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
	String noidungthaotac = "Mở xem Tra cứu Phiếu ghi nhận lỗi - Khắc phục - Phòng ngừa thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
	String tenmanhinhdaidien = "Danh sách Tra cứu Phiếu ghi nhận lỗi - Khắc phục - Phòng ngừa";
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
				Tra cứu Phiếu ghi nhận lỗi - Khắc phục - Phòng ngừa
				<i class="fa-right fa fa-angle-down"></i>
			</h5>
			<h5></h5>
		</div>
		<br>
		<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Số ĐKKT</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10" style="height: 30px">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">
							<input type="text" name="<%=Constants.SO_DANGKI_KIEMTRA%>" id="<%=Constants.SO_DANGKI_KIEMTRA%>" value="<%=soDangKiKiemTra%>" placeholder="Nhập số đăng kí kiểm tra" class="form-control-find">
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="height: 30px">
							<label class="textlabel" style="margin-top: -5px;">Doanh nghiệp</label>
						</div>
						<div class="col-xs-6 col-sm-6 col-md-6 col-md-right" style="margin-left: 40px;">
							<input type="text" name="doanhNghiep" id="doanhNghiep" value="<%=doanhNghiep %>" placeholder="Nhập tên doanh nghiệp" class="form-control-find">
						</div>
						
						
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Số biên bản KT</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10" style="height: 30px">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">							
							<input type="text" name="<%=Constants.SO_BIENBAN_KIEMTRA%>" id="<%=Constants.SO_BIENBAN_KIEMTRA%>" value="<%=soBienBanKiemTra%>" placeholder="Nhập số biên bản kiểm tra" class="form-control-find">
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="height: 30px">
							<label class="textlabel" style="margin-top: -5px;">Nội dung lỗi</label>
						</div>
						<div class="col-xs-6 col-sm-6 col-md-6 col-md-right" style="margin-left: 40px;">
							<input type="text" name="<%=Constants.LOAI_DIEU_KIEN%>" id="<%=Constants.LOAI_DIEU_KIEN%>" value="<%=motaNoiDungLoi %>" placeholder="Nhập nội dung lỗi" class="form-control-find">
						</div>
						
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Tên sản phẩm</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10" style="height: 30px">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">							
							<input type="text" name="<%=Constants.LOAI_PHUONG_TIEN_NK%>" id="<%=Constants.LOAI_PHUONG_TIEN_NK%>" value="<%=tenSanPham%>" placeholder="Nhập tên sản phẩm NK" class="form-control-find">
						</div>
						
						<div class="col-xs-3 col-sm-3 col-md-14">
							<label class="textlabel" style="margin-top: -5px;">Ngày nhập phiếu </label>
						</div>
						<div class="col-xs-3 col-sm-3 col-md-15" style="margin-left: -35px;">
							<div class="input-group">
								<input type="text" placeholder="Từ ngày" name="ngayNopHsFrom" id="ngayNopHsFrom" value="<%=ngayNopHsFrom%>"
									onclick="gtCalendar('ngayNopHsFrom')" class="form-control-find-calendar"> <span class="input-group-btn">
									<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayNopHsFrom')">
										<i class="fa fa-calendar"></i>
									</button>
								</span>
							</div>
						</div>
						<div class="col-xs-3 col-sm-3 col-md-15">
							<div class="input-group">
								<input type="text" placeholder="Đến ngày" name="ngayNopHsTo" id="ngayNopHsTo" value="<%=ngayNopHsTo%>"
									onclick="gtCalendar('ngayNopHsTo')" class="form-control-find-calendar"> <span class="input-group-btn">
									<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayNopHsTo')">
										<i class="fa fa-calendar"></i>
									</button>
								</span>
							</div>

						</div>
<!-- 						<div class="col-xs-3 col-sm-3 col-md-16" style="margin-left: 7px;"> -->
<!-- 							<select name="namNhap" id="namNhap" size="1" class="form-control-find"> -->
<%-- 								<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.qlhs.nam" /></option> --%>
<%-- 								<%for (String year : allYears) {%> --%>
<%-- 								<option <%=year.trim().equals(namNhap) ? "selected" : ""%> value="<%=year%>"><%=year%></option> --%>
<%-- 								<%}%> --%>
<!-- 							</select> -->
<!-- 						</div> -->
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Loại lỗi</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10" style="height: 30px">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">							
							<select name="loaiThuTuc" id="loaiThuTuc" size="1" class="form-control-find">
						<option style="width: 100%" selected value="">---- Lựa chọn ------</option>
						<%for (DmDataItem itemLoi : lstLoaiLoi) {
						%>
						<option <%=itemLoi.getCode0().equals(loaiLoi.trim()) ? "selected" : ""%> value="<%=itemLoi.getCode0()%>"><%=itemLoi.getCode3()%> <%=itemLoi.getName()%></option>
						<%}%>
					</select>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="height: 30px">
							<label class="textlabel" style="margin-top: -5px;">Nguyên nhân</label>
						</div>
						<div class="col-xs-6 col-sm-6 col-md-6 col-md-right" style="margin-left: 40px;">
							<tr>
							<%if (Validator.isNotNull(lstPhanLoaiNghiepVu) && lstPhanLoaiNghiepVu.size() > 0) {
								for (DmDataItem item : lstPhanLoaiNghiepVu) {							
							%>
							<td class="text-center">
								<input type="checkbox" id="xemDuLieu<%=item.getCode0()%>" name="xemDuLieu<%=item.getCode0()%>" onchange="checkDuLieu('<%=item.getCode0()%>')" title="<%=item.getName()%>"/>
								<label for="xemDuLieu<%=item.getCode0()%>"><%=item.getName()%></label> &nbsp;&nbsp;&nbsp;&nbsp;
							</td>
							
							<%} }%>
							</tr>
						</div>
						
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Đơn vị kiểm tra</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10" style="height: 30px">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">							
							<select name="donViKiemTra" id="donViKiemTra" size="1" class="form-control-find">
						<option style="width: 100%" selected value="">---- Lựa chọn ------</option>
						<%for (DmDataItem item : lstDonViKiemTra) {
						%>
						<option <%=item.getCode0().equals(donViKiemTra.trim()) ? "selected" : ""%> value="<%=item.getCode0()%>"><%=item.getName()%></option>
						<%}%>
					</select>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="height: 30px">
							<label class="textlabel" style="margin-top: -5px;">Hệ số</label>
						</div>
						<div class="col-xs-6 col-sm-6 col-md-6 col-md-right" style="margin-left: 40px;">
							<tr>
							<%if (Validator.isNotNull(lstMucDichNhapKhau) && lstMucDichNhapKhau.size() > 0) {
								for (DmDataItem item : lstMucDichNhapKhau) {							
							%>
							<td class="text-center">
								<input type="checkbox" id="xemDuLieu<%=item.getCode0()%>" name="xemDuLieu<%=item.getCode0()%>" onchange="checkDuLieu('<%=item.getCode0()%>')" title="<%=item.getName()%>"/>
								<label for="xemDuLieu<%=item.getCode0()%>" title="<%=item.getName()%>"><%=item.getCode3()%></label> &nbsp;&nbsp;&nbsp;&nbsp;
							</td>
							
							<%} }%>
							
							<%if (Validator.isNotNull(lstTinhTrangPhuongTien) && lstTinhTrangPhuongTien.size() > 0) {
								for (DmDataItem item : lstTinhTrangPhuongTien) {							
							%>
							<td class="text-center">
								<input type="checkbox" id="xemDuLieu<%=item.getCode0()%>" name="xemDuLieu<%=item.getCode0()%>" onchange="checkDuLieu('<%=item.getCode0()%>')" title="<%=item.getName()%>"/>
								<label for="xemDuLieu<%=item.getCode0()%>" title="<%=item.getName()%>"><%=item.getCode3()%></label> &nbsp;&nbsp;&nbsp;&nbsp;
							</td>
							
							<%} }%>
							
							<%if (Validator.isNotNull(lstTinhTrangChungNhan) && lstTinhTrangChungNhan.size() > 0) {
								for (DmDataItem item : lstTinhTrangChungNhan) {							
							%>
							<td class="text-center">
								<input type="checkbox" id="xemDuLieu<%=item.getCode0()%>" name="xemDuLieu<%=item.getCode0()%>" onchange="checkDuLieu('<%=item.getCode0()%>')" title="<%=item.getName()%>"/>
								<label for="xemDuLieu<%=item.getCode0()%>" title="<%=item.getName()%>"><%=item.getCode3()%></label> &nbsp;&nbsp;&nbsp;&nbsp;
							</td>
							
							<%} }%>
							
							<%if (Validator.isNotNull(lstPhamViHoatDong) && lstPhamViHoatDong.size() > 0) {
								for (DmDataItem item : lstPhamViHoatDong) {							
							%>
							<td class="text-center">
								<input type="checkbox" id="xemDuLieu<%=item.getCode0()%>" name="xemDuLieu<%=item.getCode0()%>" onchange="checkDuLieu('<%=item.getCode0()%>')" title="<%=item.getName()%>"/>
								<label for="xemDuLieu<%=item.getCode0()%>" title="<%=item.getName()%>"><%=item.getCode3()%></label> &nbsp;&nbsp;&nbsp;&nbsp;
							</td>
							
							<%} }%>
							</tr>
						</div>
						
					</div>
				</div>
			</div>
			<br>     

		</div>		
				


		<p style="text-align:center;">
			<button type="submit" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 5px" >Tìm kiếm</button>
			<button type="button" class="fa-left bt btxanhduong btn btn-default" onclick="javascript: window.location = '<%=urlThemPhieuGhiNhanLoi%>'">
				Tạo mới
			</button>
			
			<button type="button" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px" onclick="javascript: window.location = '<%=returnURL%>'">
				Quay lại
			</button>
		</p>	
			<table class="wd-table table">
			
			<%
				if (list != null && list.size() > 0) {
				
					%>
				<caption style = "font-size: 20px">Danh sách Phiếu ghi nhận lỗi hàng ngày</caption>
				<thead>
					<tr>
						<th>STT</th>
						<th>Ngày lập phiếu</th>
						<th>Mô tả lỗi</th>
						<th>Sản phẩm /Loại lỗi /Hệ số</th>
						<th>Nguyên nhân</th>						
						<th>Số BBKT</th>
						<th>Người nhập khẩu</th>
						<th>Người lập phiếu</th>
						<th>Khắc phục</th>
						<th>Thao tác</th>
					</tr>
				</thead>
				
							
					<%
				} else {
					%>
					<caption style = "font-size: 12px">Không có Phiếu ghi nhận lỗi</caption>
					<%
				} 
					%>
				<tbody>
				<%
				int index = 1;
				if (list != null && list.size() > 0) {
				for (IssueTracking item : list) {
					%>
					<tr>
						<td class="text-center"><%=(index++) + searchContainer.getStart() %></td>
						<td class="text-left"><%=DateUtils.dateToString("dd/MM/yyyy HH:mm", item.getCreateddate())%></td>
						<td class="text-center"><%=item.getIssuedescription() %></td>
						<td class="text-center"><%=item.getProductname() %></td>
						<td class="text-center"><%=item.getIssueVAQ1reason() %></td>
						<td class="text-center"><%=item.getInspectionrecordno() %></td>
						<td class="text-center"><%=item.getImportername() %></td>
						<td class="text-center"><%=item.getCreator() %></td>
						<td class="text-center">
						<%
						if(item.getMarkupissueVAQ1() == 1) {
							%>
							<%="Phân tích nguyên nhân: " %><span style="color:blue">Có</span><br>
							<%
						} else {
							%>
							<%="Phân tích nguyên nhân: " %> <span style="color:red">Không</span><br>
							<%
						} 
							%>
							
							<%
						if(item.getMarkupissueVAQ2() == 1) {
							%>
							<%="Biện pháp khắc phục tạm thời: " %><span style="color:blue">Có</span><br>
							<%
						} else {
							%>
							<%="Biện pháp khắc phục tạm thời: " %> <span style="color:red">Không</span><br>
							<%
						} 
							%>
							
							<%
						if(item.getMarkupissueVAQ3() == 1) {
							%>
							<%="Biện pháp khắc phục lâu dài : " %><span style="color:blue">Có</span><br>
							<%
						} else {
							%>
							<%="Biện pháp khắc phục lâu dài: " %> <span style="color:red">Không</span><br>
							<%
						} 
							%>
								
							<%
						if(item.getMarkupissueVAQ4() == 1) {
							%>
							<%="Biện pháp phòng ngừa: " %><span style="color:blue">Có</span><br>
							<%
						} else {
							%>
							<%="Biện pháp phòng ngừa: " %><span style="color:red">Không</span><br>
							<%
						} 
							%>
						</td>
						<td class="text-center">
							<%							
							
							PortletURL urlSuaPhieuGhiNhanLoi = renderResponse.createRenderURL();
							urlSuaPhieuGhiNhanLoi.setParameter(Constants.INSPECTOR_ID, corporationInspectorLogin.getInspectorid() + "");
							urlSuaPhieuGhiNhanLoi.setParameter(Constants.CORPORATION_ID, corporationIdLogin);
							urlSuaPhieuGhiNhanLoi.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
							urlSuaPhieuGhiNhanLoi.setParameter("isNewIssueTracking", "false");
							urlSuaPhieuGhiNhanLoi.setParameter("jspPage", "/portlet/quanlyruiro/edit_issue_tracking.jsp");
																		

							PortletURL urlXoaPhieu = renderResponse.createActionURL();
							urlXoaPhieu.setParameter(ActionRequest.ACTION_NAME, "deleteIssueTracking");
							urlXoaPhieu.setParameter(Constants.INSPECTOR_ID, corporationInspectorLogin.getInspectorid() + "");
							urlXoaPhieu.setParameter(Constants.CORPORATION_ID, corporationIdLogin);
							urlXoaPhieu.setParameter(Constants.ID_ASSESSMENT_ISSUETRACKING, String.valueOf(item.getId()));
							%>
							
							<a href="<%=urlSuaPhieuGhiNhanLoi.toString() %>" class="aicon" title="Sửa"><i class="icon20 iconm5 fa fa-pencil"></i></a>
							<a onclick="beforSummitForm('myForm', '<%=urlXoaPhieu.toString()%>')" class="aicon" title="Xóa"><img src="<%=request.getContextPath()%>/img/huy.png"></a>
						</td>
					</tr>
					<%
				} } 
					%>
					
					<%
								%>
				</tbody>
			</table>
			<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
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
</script>