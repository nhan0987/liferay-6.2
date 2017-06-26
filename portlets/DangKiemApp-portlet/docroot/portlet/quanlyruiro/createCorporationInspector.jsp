<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoAction"%>
<%@page import="java.util.UUID"%>
<%@page import="vn.dtt.gt.dk.utils.VRNghiepVuUtils"%>
<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.utils.document.DocumentUtils"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="java.math.BigInteger"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
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
	
	String isNewIssueTracking = ParamUtil.getString(request, "isNewIssueTracking");
	String returnURL = ParamUtil.getString(request, Constants.RETURN_URL);
	
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
    ngayNopHsFrom = DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date());
    String ngayNopHsTo = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_TO);
    String soBienBanKiemTra = ParamUtil.getString(request, Constants.SO_BIENBAN_KIEMTRA);
    String soDangKiKiemTra = ParamUtil.getString(request, Constants.SO_DANGKI_KIEMTRA);
    String donViKiemTra = ParamUtil.getString(request, Constants.DON_VI_KIEM_TRA);
    String nguoiPhatHienLoi = "";// ParamUtil.getString(request, Constants.NGUOI_PHAT_HIEN_LOI);
    
	LogFactoryUtil.getLog(QuanLyNguoiDungAction.class).info("--/createCorporationInspector.jsp---inspectorId===="+ inspectorId);
	LogFactoryUtil.getLog(QuanLyNguoiDungAction.class).info("--/createCorporationInspector.jsp---corporationId===="+ corporationId);
	LogFactoryUtil.getLog(QuanLyNguoiDungAction.class).info("--/createCorporationInspector.jsp---corporationInspectorId===="+ corporationInspectorId);
	LogFactoryUtil.getLog(QuanLyNguoiDungAction.class).info("--/createCorporationInspector.jsp---isNewIssueTracking===="+ isNewIssueTracking);
	
	List<CorporationTeam> lCorporationTeams = null;
	
	int isTeamLeader = 0;
	int isBoss = 0;
	long teamId = 0;
	long _userId = 0;
	long _fileChuKy = 0;
	
	CorporationInspector corporationInspector = null;
	List<Long> lObjects = null;
	
	List<DmDataItem> lstThuocDonVi = DmDataItemLocalServiceUtil.findByNameGroupAndMultilAlterName(DanhMucKey.CORPORATION, "KIEMTRA" , "DANGKIEM");
	if (lstThuocDonVi == null) { lstThuocDonVi = new ArrayList<DmDataItem>(); }
	
	List<DmDataItem> lstDoiKiemTra = DmDataItemLocalServiceUtil.findByDataGroupCodeNameAndDataItemAlterName(DanhMucKey.CORPORATION, "KIEMTRA");
	if (lstDoiKiemTra == null) { lstDoiKiemTra = new ArrayList<DmDataItem>(); }
	
	try {
		lObjects = CorporationInspectorLocalServiceUtil.findUserLiferayNotHaveCorporationInspector("dkvn_liferay");
		lCorporationTeams = CorporationTeamLocalServiceUtil.findByCorporationIdAndTrangThai(corporationId, Constants.MarkUpDelete_chua_xoa);
		if (corporationInspectorId != null && ConvertUtil.convertToLong(corporationInspectorId) > 0 ) {
			
			try {
				corporationInspector = CorporationInspectorLocalServiceUtil.fetchCorporationInspector(ConvertUtil.convertToLong(corporationInspectorId));
			} catch (Exception e) {
				LogFactoryUtil.getLog(QuanLyNguoiDungAction.class).info("--/createCorporationInspector.jsp---corporationInspector====null");
			}
			
			if (corporationInspector != null) {
				isTeamLeader = corporationInspector.getMarkupTeamLeader();
				isBoss = corporationInspector.getMarkUpBoss();
				teamId = corporationInspector.getTeamId();
				_userId = corporationInspector.getInspectorid();
				corporationId = corporationInspector.getCorporationId();
				_fileChuKy=corporationInspector.getFilechukyId();
			}
		}
	} catch (Exception es) {
	}
	
	if (lObjects == null) {
		lObjects = new ArrayList<Long>();
	}
	if (lCorporationTeams == null) {
		lCorporationTeams = new ArrayList<CorporationTeam>();
	}
	
	PortletURL urlAddNewIssueTracking = renderResponse.createActionURL();
	urlAddNewIssueTracking.setParameter(ActionRequest.ACTION_NAME, "addNewIssueTracking");
	//check dieu kien duplicate insert
	urlAddNewIssueTracking.setParameter("formDate", UUID.randomUUID().toString());
	if (corporationInspector != null) {
		urlAddNewIssueTracking.setParameter(Constants.CORPORATION_INSPECTOR, corporationInspectorId);
	}
	
	
	
	List<CorporationView> lstCorporationView = CorporationViewLocalServiceUtil.findByInspectorId(ConvertUtil.convertToLong(inspectorId));
	if (lstCorporationView == null) { lstCorporationView = new ArrayList<CorporationView>(); }
	LogFactoryUtil.getLog(QuanLyNguoiDungAction.class).info("--createCorporationInspector.jsp---lstCorporationView==size==" + lstCorporationView.size());
	
	// Ghi actionlog
	String noidungthaotac = "Vào chức năng Tạo mới phiếu ghi nhận lỗi thời điểm "+ DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
	String tenmanhinhdaidien = "Màn hình Tạo mới phiếu ghi nhận lỗi";
	if (isNewIssueTracking.equalsIgnoreCase("false") ) {
		noidungthaotac = "Vào chức năng Sửa nội dung phiếu ghi nhận lỗi thời điểm "+ DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date());
		tenmanhinhdaidien = "Màn hình Chỉnh sửa phiếu ghi nhận lỗi";
	}
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);


%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<div class="" style="padding-top: 1%;color: #777;text-align: left;font-size: 20px;padding-left: 10px;"><%=isNewIssueTracking.equalsIgnoreCase("true") ? "TẠO MỚI PHIẾU GHI NHẬN LỖI" : "CHỈNH SỬA PHIẾU GHI NHẬN LỖI - KHẮC PHỤC - PHÒNG NGỪA"%></div>
		<div class="col-xs-12 col-sm-12 col-md-12" id="cot2"><br>
			<div class="col-md-12" id="main">
				<aui:form action="<%=urlAddNewIssueTracking%>" name="myForm" id="myForm" method="POST" enctype="multipart/form-data">
					<br>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Số biên bản KT (<span style="color: red;">*</span>) </label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10" style="height: 30px">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">							
							<input type="text" name="<%=Constants.SO_BIENBAN_KIEMTRA%>" id="<%=Constants.SO_BIENBAN_KIEMTRA%>" value="<%=soBienBanKiemTra%>" placeholder="Nhập số biên bản kiểm tra" class="form-control-find">
						</div>
						<div class="col-xs-3 col-sm-3 col-md-14">
							<label class="textlabel" style="margin-top: -5px;">Ngày nhập phiếu (<span style="color: red;">*</span>) </label>
						</div>
						<div class="col-xs-3 col-sm-3 col-md-15" style="margin-left: -35px;">
							<div class="input-group">
								<input type="text" placeholder="Nhập ngày" name="ngayNopHsFrom" id="ngayNopHsFrom" value="<%=ngayNopHsFrom%>"
									onclick="gtCalendar('ngayNopHsFrom')" class="form-control-find-calendar"> <span class="input-group-btn">
									<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayNopHsFrom')">
										<i class="fa fa-calendar"></i>
									</button>
								</span>
							</div>
						</div>
						<div class="col-xs-3 col-sm-3 col-md-15" style="margin-left: -35px;">
							<div class="input-group">
							<button type="button" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px" onclick="javascript: window.location = '<%=returnURL%>'">
								Xác nhận số BBKT
							</button>
							</div>
						</div>
				</div>
			</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Số ĐKKT (<span style="color: red;">*</span>) </label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10" style="height: 30px">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">
							<input type="text" name="<%=Constants.SO_DANGKI_KIEMTRA%>" id="<%=Constants.SO_DANGKI_KIEMTRA%>" value="<%=soDangKiKiemTra%>" placeholder="Nhập số đăng kí kiểm tra" class="form-control-find">
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="height: 30px">
							<label class="textlabel" style="margin-top: -5px;">Doanh nghiệp (<span style="color: red;">*</span>) </label>
						</div>
						<div class="col-xs-6 col-sm-6 col-md-6 col-md-right" style="margin-left: 40px;">
							<input type="text" name="doanhNghiep" id="doanhNghiep" value="<%=doanhNghiep %>" placeholder="Nhập tên doanh nghiệp" class="form-control-find">
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
						<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="height: 30px">
							<label class="textlabel" style="margin-top: -5px;">Nội dung lỗi (<span style="color: red;">*</span>) </label>
						</div>
						<div class="col-xs-6 col-sm-6 col-md-6 col-md-right" style="margin-left: 40px;">
							<input type="text" name="<%=Constants.LOAI_DIEU_KIEN%>" id="<%=Constants.LOAI_DIEU_KIEN%>" value="<%=motaNoiDungLoi %>" placeholder="Nhập nội dung lỗi" class="form-control-find">
						</div>
						

					</div>
				</div>
			</div>		
			
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.tendangkiemvien"/></label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10" style="height: 30px">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">
							<aui:input placeholder="Nhập tên đăng kiểm viên"  class="form-control-find" maxlength="200" min="1" id="INSPECTORNAME" cssClass="form-control-find" name="INSPECTORNAME" type="text" size="30" value='<%=Validator.isNotNull(corporationInspector) ? corporationInspector.getInspectorName() : ""%>' label="">                                	
                           	</aui:input>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="height: 30px">
							<label class="textlabel" style="margin-top: -5px;">Loại lỗi (<span style="color: red;">*</span>) </label>
						</div>
						<div class="col-xs-6 col-sm-6 col-md-6 col-md-right" style="margin-left: 40px;">
							<select name="loaiThuTuc" id="loaiThuTuc" size="1" class="form-control-find">
								<option style="width: 100%" selected value="">---- Lựa chọn ------</option>
								<%for (DmDataItem itemLoi : lstLoaiLoi) {
								%>
								<option <%=itemLoi.getCode0().equals(loaiLoi.trim()) ? "selected" : ""%> value="<%=itemLoi.getCode0()%>"><%=itemLoi.getCode3()%> <%=itemLoi.getName()%></option>
								<%}%>
							</select>
						</div>
						
						
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Contact code</label>
				</div>
										

				<div class="col-xs-10 col-sm-10 col-md-10" style="height: 30px">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">
								<aui:input placeholder="Nhập contact code" class="form-control-find" maxlength="20" min="1" id="CONTACTCODE" cssClass="form-control-find" name="CONTACTCODE" type="text" size="30" value='<%=Validator.isNotNull(corporationInspector) ? corporationInspector.getContactcode() : ""%>' label="">                                	
                            	</aui:input>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="height: 30px">
							<label class="textlabel" style="margin-top: -5px;">Nguyên nhân (<span style="color: red;">*</span>) </label>
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
					<label class="textlabel" style="margin-top: -5px;">Thuộc đơn vị</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10" style="height: 30px">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">
							<select id="<%=Constants.CORPORATION_ID %>" name="<%=Constants.CORPORATION_ID %>" placeholder="Nhập đơn vị" class="form-control-find">
								<%
								LogFactoryUtil.getLog(QuanLyNguoiDungAction.class).debug( "==/createCorporationId.jsp=corporationId===" + corporationId);
								if (isNewIssueTracking.equalsIgnoreCase("true")) {
									corporationId = "";
								}
								for (DmDataItem dmDataItem : lstThuocDonVi) {
									%>
									<option <%=corporationId.equalsIgnoreCase(dmDataItem.getCode0()) ? "selected" : ""%> value="<%=dmDataItem.getCode0() %>"><%=dmDataItem.getName() %></option>
								<%}%>
								</select>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="height: 30px">
							<label class="textlabel" style="margin-top: -5px;">Hệ số (<span style="color: red;">*</span>) </label>
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
			<br><label class="textlabel" style="margin-top: -5px;">Ghi chú: Thông tin có dấu (<span style="color: red;">*</span>) bắt buộc nhập.</label>
						<br>
						<br>
						
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2" style="height: 30px">
					&nbsp;
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10" style="height: 30px">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">
							&nbsp;
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="height: 20px">
							<label class="textlabel" style="margin-top: -5px;">Phát hiện lỗi: (<span style="color: red;">*</span>) </label>
<%-- 							<input type="text" name="<%=Constants.NGUOI_PHAT_HIEN_LOI%>" id="<%=Constants.NGUOI_PHAT_HIEN_LOI%>" value="<%=nguoiPhatHienLoi%>" placeholder="Nhập tên người ghi nhận lỗi" class="form-control-find"> --%>							
						</div>
						<div class="col-xs-6 col-sm-6 col-md-6 col-md-right" style="margin-left: 40px;">
							<table class="wd-table table" style="margin-right: 15px; width: 100%">
								<thead>
									<tr>										
										<td class="text-center thTblDoi"><input type="checkbox" id="xemDuLieu<%=lstDoiKiemTra.get(0).getCode0()%>" name="xemDuLieu<%=lstDoiKiemTra.get(0).getCode0()%>" onchange="checkDuLieu('<%=lstDoiKiemTra.get(0).getCode0()%>')"/>
											<label for="xemDuLieu<%=lstDoiKiemTra.get(0).getCode0()%>" title="Khách hàng">Khách hàng</label></td>
										<td class="text-center thTblDoi"><input type="checkbox" id="lanhDao<%=lstDoiKiemTra.get(0).getCode0()%>" name="lanhDao<%=lstDoiKiemTra.get(0).getCode0()%>" onchange="lanhDao('<%=lstDoiKiemTra.get(0).getCode0()%>')"/>
											<label for="lanhDao<%=lstDoiKiemTra.get(0).getCode0()%>" title="Tổ nghiệp vụ">Tổ nghiệp vụ</label></td></td>
										<td class="text-center thTblDoi"><input type="checkbox" id="doiKiemTra<%=lstDoiKiemTra.get(0).getCode0()%>" name="doiKiemTra<%=lstDoiKiemTra.get(0).getCode0()%>" onchange="doiKiemTra('<%=lstDoiKiemTra.get(0).getCode0()%>')"/>
											<label for="doiKiemTra<%=lstDoiKiemTra.get(0).getCode0()%>" title="Đội kiểm tra">Đội kiểm tra</label></td></td>
									</tr>
								</thead>
								<tbody>
									
								</tbody>
							</table>
							
						</div>
						
					</div>
				</div>
						
			</div>
			<br>			
						<div class="row">
							<div class="col-xs-10 col-sm-10 col-md-10">
							<%
							if (isNewIssueTracking.equalsIgnoreCase("true")) {
								if (lObjects.size() == 0) {
									%>
									<div class="row">
										<div class="" style="padding-bottom: 1%;color: #F00F0F;text-align: left;font-size: 14px;padding-left: 15px;">Không thể cấp tài khoản đăng kiểm viên (Tài khoản đăng nhập đã sử dụng hết)</div>
									</div>
									<div class="row">
										<button type="button" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px" onclick="javascript: window.location = '<%=returnURL%>'">
											<liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.quaylai"/>
										</button>
									</div>
								<%} else {%>
									<div class="row">
										<button type="submit" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.ghilai"/></button>
										<button type="button" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px" onclick="javascript: window.location = '<%=returnURL%>'">
											<liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.quaylai"/>
										</button>
									</div>
									<%
								}
							} else {
								%>
								<div class="row">
									<button type="submit" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px">Ghi lại</button>
									<button type="button" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px" onclick="javascript: window.location = '<%=returnURL%>'">
										Quay lại
									</button>
								</div>
							<%}%>
							</div>
						</div>
						</aui:form>
				<br>
					</div>
					</div>
				
			
		</div>
</div>
<portlet:resourceURL var="validateIssueTrackingOnlineURL"></portlet:resourceURL>
<script type="text/javascript">
	function checkDuLieu(codeDoiKiemTra) {
		console.log('--checkDuLieu--' + codeDoiKiemTra);
		var giaTri2 = $("#xemDuLieu" + codeDoiKiemTra).is(':checked');
		if (giaTri2 == true) {			
			$("#lanhDao" + codeDoiKiemTra).prop("checked", false);
			$("#doiKiemTra" + codeDoiKiemTra).prop("checked", false);
		}
	}
	
	function doiKiemTra(codeDoiKiemTra) {
		console.log('--checkDuLieu--' + codeDoiKiemTra);
		var giaTri3 = $("#doiKiemTra" + codeDoiKiemTra).is(':checked');
		if (giaTri3 == true) {			
			$("#lanhDao" + codeDoiKiemTra).prop("checked", false);
			$("#xemDuLieu" + codeDoiKiemTra).prop("checked", false);
		}
	}
	
	function lanhDao(codeDoiKiemTra) {
		console.log('--checkDuLieu--' + codeDoiKiemTra);
		var giaTri = $("#lanhDao" + codeDoiKiemTra).is(':checked');
		if (giaTri == true) {			
			$("#xemDuLieu" + codeDoiKiemTra).prop("checked", false);
			$("#doiKiemTra" + codeDoiKiemTra).prop("checked", false);
		}
	}
	
	var completeValidateIssueTrackingOnlineURL = '<%=validateIssueTrackingOnlineURL%>';
	var inspectionrecordno='<%=soBienBanKiemTra%>';
	
	function completeValidateIssueTrackingOnline(inspectionrecordno) {		
		$.ajax({
			type : 'POST',
			url : completeValidateIssueTrackingOnlineURL,
			data : {
				type : 'validateIssueTrackingOnline',
				inspectionrecordno : inspectionrecordno				
			},
			success : function(data) {
				if(data){
					var msg = data.msg;
					if(msg == 'success'){
						// donothing
					}else{
						console.log('=msg=failed=' + msg);
					}
					
				}
			}
		});
	}

</script>

<style>
.thTblDoi {background-color: #f4f4f4;border: 1.5px solid #d5d5d5;font-weight: bold;border-bottom: 2px solid #ddd;}
</style>