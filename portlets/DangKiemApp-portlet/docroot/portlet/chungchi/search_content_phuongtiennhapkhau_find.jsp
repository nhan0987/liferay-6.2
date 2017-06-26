<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.impl.DmDataItemImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecImpl"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="vn.dtt.gt.dk.utils.format.CommonUtils"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalService"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcLinhVucThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTuc"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="com.lowagie.text.pdf.PRAcroForm"%>

<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ include file="/portlet/init.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


<script type="text/javascript"> var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";
</script>

	

<div class="col-xs-12 col-sm-12 col-md-12" id="abc">
	<div id="xyz">
	<%
	try {
		TthcLinhVucThuTuc curentLinhVucThuTuc = null;
		List<TthcLinhVucThuTuc> allLoaiThuTuc = new ArrayList<TthcLinhVucThuTuc>();
		allLoaiThuTuc = TthcLinhVucThuTucLocalServiceUtil.getTthcLinhVucThuTucs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		
		TthcThuTucHanhChinh curentThuTucHanhChinh = null;
		List<TthcThuTucHanhChinh> allThuTucHanhChinh = null;
		allThuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.getTthcThuTucHanhChinhs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		List<String> allYears = CommonUtils.getTenYearRecently();
		
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
		
		
		long idMotCuaTrangThaiXe = 0;
		String sTrangThaiCuaXe = request.getParameter(Constants.TRANG_THAI_CUA_XE);
		if (Validator.isNull(sTrangThaiCuaXe)) {
			idMotCuaTrangThaiXe = -1;
		} else {
			idMotCuaTrangThaiXe = ConvertUtil.convertToLong(sTrangThaiCuaXe);
		}
		
		long userId = PortalUtil.getUserId(request);
		CorporationInspector corporationInspectorOnline = CorporationInspectorLocalServiceUtil.fetchByInspectorId(userId);
		List<CorporationInspector> lstDangKiemVienKt = CorporationInspectorLocalServiceUtil.findDanhSachDangKiemVien(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		if (lstDangKiemVienKt == null) {
			lstDangKiemVienKt = new ArrayList<CorporationInspector>();
		}
		
		
		List<MotCuaTrangThaiHoSo> lstMotCuaTrangThaiHoSo = MotCuaTrangThaiHoSoLocalServiceUtil.getAllTrangThaiHoSoByKieuTrangThai(Constants.TRANG_THAI_TAT_CA);
		if (lstMotCuaTrangThaiHoSo == null) { lstMotCuaTrangThaiHoSo = new ArrayList<MotCuaTrangThaiHoSo>(); }
		
		List<MotCuaTrangThaiHoSo> lstMotCuaTrangThaiXe = MotCuaTrangThaiHoSoLocalServiceUtil.getAllTrangThaiHoSoByKieuTrangThai(Constants.TRANG_THAI_XE);
		if (lstMotCuaTrangThaiXe == null) { lstMotCuaTrangThaiXe = new ArrayList<MotCuaTrangThaiHoSo>(); }
		
		List<DmDataItem> lstDonViKiemTra = DmDataItemLocalServiceUtil.findByDataGroupCodeNameAndDataItemAlterName(DanhMucKey.CORPORATION, "KIEMTRA");
		if (lstDonViKiemTra == null) { lstDonViKiemTra = new ArrayList<DmDataItem>(); }
		
		List<DmDataItem> lstTinhTrangPhuongTien = DmDataItemLocalServiceUtil.findByDmDataGroupCode(DanhMucKey.USAGE);
		if (lstTinhTrangPhuongTien == null) { lstTinhTrangPhuongTien = new ArrayList<DmDataItem>(); }
		
		List<DmDataItem> liDmDataItems = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevel(2, 0);
		List<DmDataItem> lstDoiTuong = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevel(2, 0);		
		
		List<DmDataItem> specificCategory = DmDataItemLocalServiceUtil.findByDataGroupId(2);
		if (Validator.isNull(specificCategory)) { specificCategory = new ArrayList<DmDataItem>(); }
		
		List<DmDataItem> specCategory = DmDataItemLocalServiceUtil.findByDataGroupIdAndAlterName(28, loaiThuTuc);
		if (Validator.isNull(specCategory)) { specCategory = new ArrayList<DmDataItem>(); }
		
		List<DmDataItem> likecondition = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevel(70, 2);
		if (Validator.isNull(likecondition)) { likecondition = new ArrayList<DmDataItem>(); }
		
		List<DmDataItem> andorcondition = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevel(70, 1);
		if (Validator.isNull(andorcondition)) { andorcondition = new ArrayList<DmDataItem>(); }
		
		List<CfgTechnicalspec> technicalspecCode = CfgTechnicalspecLocalServiceUtil.getCfgTechnicalspecs(-1, -1);
		if (Validator.isNull(technicalspecCode)) { technicalspecCode = new ArrayList<CfgTechnicalspec>(); }
		List<Map<String, String>> listCargoItems = null;
		
		int indexInc = 0;
		if ((Validator.isNull(listCargoItems)) || (listCargoItems.size() == 0)	)	
		{
			listCargoItems = new ArrayList<Map<String, String>>();
			indexInc += 1;
			
			Map<String, String> mHangHoa = new HashMap<String, String>();
			mHangHoa.put("index", String.valueOf(indexInc));
			mHangHoa.put("CARGO_TYPE" + indexInc, "");
			mHangHoa.put("CARGO_CATEGORY" + indexInc, "");
			mHangHoa.put("CARGO_NAME" + indexInc, "");
			mHangHoa.put("CARGO_DESCRIPTION" + indexInc, "");
			mHangHoa.put("CARGO_QUANTITY" + indexInc, "");
			mHangHoa.put("CARGO_UNIT" + indexInc, "");
			
			listCargoItems.add(mHangHoa);
		}
		
		PortletURL actionUrltimKiemPhuongTienNhapKhau = renderResponse.createActionURL();
		actionUrltimKiemPhuongTienNhapKhau.setParameter(ActionRequest.ACTION_NAME, "timKiemPhuongTienNhapKhau");
		
		PortletURL actionUrlExportExcelPhuongTienNhapKhau = renderResponse.createActionURL();
		actionUrlExportExcelPhuongTienNhapKhau.setParameter(ActionRequest.ACTION_NAME, "exportExcelPhuongTienNhapKhau");
		
		
		
		// Ghi actionlog
		String noidungthaotac = "Mở xem Tra cứu Phương tiện nhập khẩu thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo Mã số hồ sơ " + soHoSo; 
		String tenmanhinhdaidien = "Tra cứu phương tiện nhập khẩu";
		String importername = "";
		String inspectorname = user.getScreenName();
		long inspectorid = user.getUserId();
		QuanLyNguoiDungAction.insertActionLog(0, soHoSo, soBienBanKiemTra, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

	%>
		
<aui:form action="<%=actionUrltimKiemPhuongTienNhapKhau.toString()%>" name="myForm" id="myForm" method="POST">
	<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" >
		<div tabindex="0" class="CollapsiblePanelTab">
			<h5 class="tieude">
				<liferay-ui:message key="vn.dtt.chungchu.trucuu.phuongtiennhapkhau" />
				<i class="fa-right fa fa-angle-down"></i>
			</h5>
			<h5></h5>
		</div>
		<div class="CollapsiblePanelContent" style="display: block;">
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;"><liferay-ui:message key="vn.gt.dk.qlhs.doituong" /></label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10" style="height: 30px">
					<select name="loaiThuTuc" id="loaiThuTuc" size="1" class="form-control-find" onchange="onClickDeleteRow('<portlet:namespace/>dataTable', '<portlet:namespace />rowLengthId')">
						<option style="width: 100%" selected value="1"><liferay-ui:message key="vn.gt.dk.qlhs.luachon" /></option>
						<%for (DmDataItem linhVucThuTuc : liDmDataItems) {
						%>
						<option <%=linhVucThuTuc.getCode0().equals(loaiThuTuc.trim()) ? "selected" : ""%> value="<%=linhVucThuTuc.getCode0()%>"><%=linhVucThuTuc.getName()%></option>
						<%}%>
					</select>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;"><liferay-ui:message key="vn.gt.dk.qlhs.tenthutuc" /></label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10" style="height: 30px">
					<select name="tenThuTuc" id="tenThuTuc" size="1" class="form-control-find">
						<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.qlhs.luachon" /></option>
						<% 
							for (TthcThuTucHanhChinh thuTucHanhChinh : allThuTucHanhChinh) {%>
						<option <%=thuTucHanhChinh.getId() == ConvertUtil.convertToLong(tenThuTuc) ? "selected" : ""%> value="<%=thuTucHanhChinh.getId()%>"><%=thuTucHanhChinh.getTenThuTuc()%></option>
						<%}%>
					</select>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;"><liferay-ui:message key="vn.gt.dk.qlhs.sohoso" /></label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10" style="height: 30px">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">
							<input type="text" name="soHoSo" id="soHoSo" value="<%=soHoSo%>" placeholder="Nhập mã số hồ sơ" class="form-control-find" />
						</div>
						<div class="col-xs-3 col-sm-3 col-md-14">
							<label class="textlabel" style="margin-top: -5px;"><liferay-ui:message key="vn.gt.dk.qlhs.searchcontentfind.ngaynophoso"/></label>
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
						<div class="col-xs-3 col-sm-3 col-md-16" style="margin-left: 7px;">
							<select name="namNhap" id="namNhap" size="1" class="form-control-find">
								<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.qlhs.nam" /></option>
								<%for (String year : allYears) {%>
								<option <%=year.trim().equals(namNhap) ? "selected" : ""%> value="<%=year%>"><%=year%></option>
								<%}%>
							</select>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Số ĐKKT</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10" style="height: 30px">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">							
							<input type="text" name="<%=Constants.SO_DANGKI_KIEMTRA%>" id="<%=Constants.SO_DANGKI_KIEMTRA%>" value="<%=soDangKiKiemTra%>" placeholder="Nhập số đăng kí kiểm tra" class="form-control-find">
						</div>
						<div class="col-xs-3 col-sm-3 col-md-14">
							<label class="textlabel" style="margin-top: -5px;"><liferay-ui:message key="vn.gt.dk.qlhs.searchcontentfind.ngaycapdkkt"/></label>
						</div>
						<div class="col-xs-3 col-sm-3 col-md-15" style="margin-left: -35px;">
							<div class="input-group">
								<input type="text" placeholder="Từ ngày" name="ngayCapDangKiFrom" id="ngayCapDangKiFrom" value="<%=ngayCapDangKiFrom%>"
									onclick="gtCalendar('ngayCapDangKiFrom')" class="form-control-find-calendar"> <span class="input-group-btn">
									<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayCapDangKiFrom')">
										<i class="fa fa-calendar"></i>
									</button>
								</span>
							</div>
						</div>
						<div class="col-xs-3 col-sm-3 col-md-15">
							<div class="input-group">
								<input type="text" placeholder="Đến ngày" name="ngayCapDangKiTo" id="ngayCapDangKiTo" value="<%=ngayCapDangKiTo%>"
									onclick="gtCalendar('ngayCapDangKiTo')" class="form-control-find-calendar"> <span class="input-group-btn">
									<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayCapDangKiTo')">
										<i class="fa fa-calendar"></i>
									</button>
								</span>
							</div>

						</div>
						<div class="col-xs-3 col-sm-3 col-md-16" style="margin-left: 7px;">
							<select name="namNhap2" id="namNhap2" size="1" class="form-control-find">
								<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.qlhs.nam" /></option>
								<%for (String year : allYears) {%>
								<option <%=year.trim().equals(namNhap) ? "selected" : ""%> value="<%=year%>"><%=year%></option>
								<%}%>
							</select>
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
						<div class="col-xs-3 col-sm-3 col-md-14">
							<label class="textlabel" style="margin-top: -5px;">Ngày kiểm tra</label>
						</div>
						<div class="col-xs-3 col-sm-3 col-md-15" style="margin-left: -35px;">
							<div class="input-group">
								<input type="text" placeholder="Từ ngày" name="ngayKiemTraFrom" id="ngayKiemTraFrom" value="<%=ngayKiemTraFrom%>"
									onclick="gtCalendar('ngayKiemTraFrom')" class="form-control-find-calendar"> <span class="input-group-btn">
									<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayKiemTraFrom')">
										<i class="fa fa-calendar"></i>
									</button>
								</span>
							</div>
						</div>
						<div class="col-xs-3 col-sm-3 col-md-15">
							<div class="input-group">
								<input type="text" placeholder="Đến ngày" name="ngayKiemTraTo" id="ngayKiemTraTo" value="<%=ngayKiemTraTo%>"
									onclick="gtCalendar('ngayKiemTraTo')" class="form-control-find-calendar"> <span class="input-group-btn">
									<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayKiemTraTo')">
										<i class="fa fa-calendar"></i>
									</button>
								</span>
							</div>

						</div>
						<div class="col-xs-3 col-sm-3 col-md-16" style="margin-left: 7px;">
							<select name="namNhap3" id="namNhap3" size="1" class="form-control-find">
								<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.qlhs.nam" /></option>
								<%for (String year : allYears) {%>
								<option <%=year.trim().equals(namNhap) ? "selected" : ""%> value="<%=year%>"><%=year%></option>
								<%}%>
							</select>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;"><liferay-ui:message key="vn.gt.dk.qlhs.searchcontentfind.sochungchi"/></label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10" style="height: 30px">
					<div class="row">
					
						<div class="col-xs-3 col-sm-3 col-md-3">
							<input type="text" placeholder="Nhập số chứng chỉ" class="form-control-find" name="<%=Constants.SO_CHUNG_CHI%>" id="<%=Constants.SO_CHUNG_CHI%>" value="<%=soChungChi%>" />
						</div>
						<div class="col-xs-3 col-sm-3 col-md-14">
							<label class="textlabel" style="margin-top: -5px;"><liferay-ui:message key="vn.gt.dk.qlhs.searchcontentfind.chassissnumber"/></label>
						</div>
						<div class="col-xs-3 col-sm-3 col-md-15" style="margin-left: -35px;">
							<input type="text" name="soKhung" id="soKhung" value="<%=soKhung%>" placeholder="Nhập số khung" class="form-control-find" >
						</div>
						<div class="col-xs-3 col-sm-3 col-md-15">
							<input type="text" name="soDongCo" id="soDongCo" value="<%=soDongCo%>" placeholder="Nhập số động cơ" class="form-control-find">
						</div>
						<div class="col-xs-3 col-sm-3 col-md-16" style="margin-left: 7px;">
						<input type="text" name="soVin" id="soVin" value="<%=soVin%>" placeholder="Nhập số VIN" class="form-control-find">
						</div>
					</div>
				</div>
			</div>			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Số tờ khai HQ</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10" style="height: 30px">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">							
							<input type="text" name="soToKhaiHaiQuan" id="soToKhaiHaiQuan" value="<%=soToKhaiHaiQuan%>" placeholder="Nhập số tờ khai hải quan" class="form-control-find">
						</div>
						<div class="col-xs-3 col-sm-3 col-md-14">
							<label class="textlabel" style="margin-top: -5px;">Ngày tờ khai HQ</label>
						</div>
						<div class="col-xs-3 col-sm-3 col-md-15" style="margin-left: -35px;">
							<div class="input-group">
								<input type="text" placeholder="Từ ngày" name="ngayToKhaiHaiQuanFrom" id="ngayToKhaiHaiQuanFrom" value="<%=ngayToKhaiHaiQuanFrom%>"
									onclick="gtCalendar('ngayToKhaiHaiQuanFrom')" class="form-control-find-calendar"> <span class="input-group-btn">
									<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayToKhaiHaiQuanFrom')">
										<i class="fa fa-calendar"></i>
									</button>
								</span>
							</div>
						</div>
						<div class="col-xs-3 col-sm-3 col-md-15">
							<div class="input-group">
								<input type="text" placeholder="Đến ngày" name="ngayToKhaiHaiQuanTo" id="ngayToKhaiHaiQuanTo" value="<%=ngayToKhaiHaiQuanTo%>"
									onclick="gtCalendar('ngayToKhaiHaiQuanTo')" class="form-control-find-calendar"> <span class="input-group-btn">
									<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayToKhaiHaiQuanTo')">
										<i class="fa fa-calendar"></i>
									</button>
								</span>
							</div>

						</div>
						<div class="col-xs-3 col-sm-3 col-md-16" style="margin-left: 7px;">
							
						</div>
					</div>
				</div>
			</div>
			
		<div class="AccordionPanelContent"><div >

		
		<!------------------Thông tin tìm kiếm hồ sơ bên trái  ---------------->
		<div class="CollapsiblePanelContent" id="LeftPanelConditions" style="width: 48%; float:left; margin-top: 1.5%">
			<!--  -->
						
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Địa điểm ĐKKT</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right" style="height: 30px">
					<div class="row">
						<!----------------- tinh thanh ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 51.5% !important" >
							<div class="input-group" style="width: 100%;">
								<select name="<%=Constants.TINH_THANH%>" id="<%=Constants.TINH_THANH%>" size="1" class="form-control-find">
									<option style="width: 100%" <%=tinhThanh.equalsIgnoreCase("") ? "selected" : "" %> value="">Tỉnh/Thành</option>
									<%
									List<DmDataItem> allTinhThanhs = DmDataItemLocalServiceUtil.findByDmDataGroupCodeAndLevel(DanhMucKey.ADMINISTRATIVE_UNITS, 1);
									for (DmDataItem item : allTinhThanhs) {
										%>
										<option <%=item.getCode0().equals(tinhThanh) ? "selected" : ""%> value="<%=item.getCode0()%>"><%=item.getName()%></option>
										<%
									}%>
								</select>
							</div>
						</div>
						
						<!----------------- quan huyen ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 48.5% !important; padding-left: 0%">
							<div class="input-group" style="width: 100%;">
								<select name="<%=Constants.QUAN_HUYEN%>" id="<%=Constants.QUAN_HUYEN%>" size="1" class="form-control-find">
									<option style="width: 100%" <%=quanHuyen.equalsIgnoreCase("") ? "selected" : ""%> value="">Quận/Huyện</option>
									<%
									List<String> allQuanHuyens = new ArrayList<String>();
									for (String name : allQuanHuyens) {
										%>
										<option <%=name.trim().equals(quanHuyen) ? "selected" : ""%> value="<%=name%>"><%=name%></option>
										<%
									}%>
								</select>
							</div>
						</div>
						
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Đơn vị kiểm tra</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<select name="donViKiemTra" id="donViKiemTra" size="1" class="form-control-find">
						<option style="width: 100%" selected value="">---- Lựa chọn ------</option>
						<%for (DmDataItem item : lstDonViKiemTra) {%>
							<option <%=item.getCode0().equals(donViKiemTra) ? "selected" : ""%> value="<%=item.getCode0()%>"><%=item.getName()%></option>
						<%}%>
					</select>
				</div>
			</div>
			
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Đăng kiểm viên</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<select name="dangKiemVienKiemTra" id="dangKiemVienKiemTra" size="1" class="form-control-find">
						<option style="width: 100%" selected value="">---- Lựa chọn ------</option>
						<%for (CorporationInspector item : lstDangKiemVienKt) {
							%>
							<option <%=(item.getContactcode().trim().equals(dangKiemVienKiemTra)) ? "selected" : ""%> value="<%=item.getContactcode()%>"><%=item.getInspectorName()%></option>
							<%
							}
						%>
					</select>
				</div>
			</div>
			
			
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;"><liferay-ui:message key="vn.gt.dk.qlhs.doanhnghiep" /></label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<input type="text" name="doanhNghiep" id="doanhNghiep" value="<%=doanhNghiep %>" placeholder="Nhập tên doanh nghiệp" class="form-control-find">
				</div>
			</div>
			
							
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Mã số thuế</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right" style="height: 30px">
					<!----------------- Số tờ khai HQ ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 42.5%; padding-left: 0%" >
							<div class="input-group" style="width: 100%;">
								<input type="text" placeholder="Nhập mã số thuế" class="form-control-find" name="masothue" id="masothue" value="<%=masothue%>" />								
							</div>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%; padding-right: 0%; margin-left: -28px;" >
							<label class="textlabel" style="margin-top: -5px;" style="margin-top: -5px;">Số hóa đơn</label>
						</div>
					<!----------------- Số hóa đơn ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 39.5%; padding-left: 1%; padding-right: 0%;">
							<div class="input-group" style="width: 100%;">
							<input type="text" name="<%=Constants.SO_INVOICE %>" id="<%=Constants.SO_INVOICE %>" value="<%=soInvoice%>" placeholder="Nhập số hóa đơn" class="form-control-find">
							</div>
						</div>	
				</div>
			</div>
			
			
		</div>
		
		<!-- Duong line doc -->
		<div class="CollapsiblePanelContent" id="CentralPanelLine" style="width: 1%; float:left; margin-top: 1.5%; height:150px; border-right: 1px solid #d8d8d8;"/></div>
		
		<!------------------Thông tin tìm kiếm phương tiện bên phải display: none;  ---------------->
		<div class="CollapsiblePanelContent" id="RightPanelConditions" style="width: 48%; float: left; margin-top: 1.5%; margin-left: 1%;">
			<!-- title Thong tin phuong tien 
			<div class="row">
				<div class="col-xs-10 col-sm-10 col-md-10">
					<label class="textlabel" style="margin-top: -5px;" style="font-weight: bold;font-size: 13px;">Tra cứu phương tiện</label>
				</div>
			</div>
			-->
			
				
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Tình trạng SD</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right" style="height: 30px">
					<div class="row">
						<select name="tinhTrangPhuongTien" id="tinhTrangPhuongTien" size="1" class="form-control-find">
							<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.qlhs.luachon" /></option>
							<%for (DmDataItem item : lstTinhTrangPhuongTien) {%>
								<option <%=(item.getCode0() == tinhTrangPhuongTien) ? "selected" : ""%> value="<%=item.getCode0()%>"><%=item.getName()%></option>
							<%}%>
						</select>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Loại phương tiện</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right" style="height: 30px">
					<div class="row">
						<select name="loaiPhuongTienNK" id="loaiPhuongTienNK" size="1" class="form-control-find">
							<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.qlhs.luachon" /></option>
							<%for (DmDataItem item : specificCategory) {%>
								<option <%=item.getCode0().trim().equalsIgnoreCase(loaiPhuongTienNK) ? "selected" : ""%> value="<%=item.getCode0()%>"><%=item.getName()%></option>
							<%}%>
						</select>						
						
					</div>
				</div>
			</div>
						
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Nhãn hiệu</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right" style="height: 30px">
					<div class="row">
						<!----------------- Mã kiểu loại ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 42.5% !important; padding-left: 0%" >							
							<div class="input-group" style="width: 100%;">
							<input type="text" name="nhanhieu" id="nhanhieu" value="<%=nhanhieu%>" placeholder="Nhập nhãn hiệu" class="form-control-find">
							</div>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%; padding-right: 0%; margin-left: -28px;" >
							<label class="textlabel" style="margin-top: -5px;">Tên thươngmại</label>
						</div>
						<!----------------- Màu sơn ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 38.5% !important; padding-left: 1%; padding-right: 0%;">
							<div class="input-group" style="width: 100%;">
							<input type="text" name="tenthuongmai" id="tenthuongmai" value="<%=tenthuongmai%>" placeholder="Nhập tên thương mại" class="form-control-find">
							</div>
						</div>						
					</div>																		
				</div>
				
			</div>
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Mã kiểu loại</label>
				</div>				
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right" style="height: 30px">
					<div class="row">
						<!----------------- Mã kiểu loại ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 42.5% !important; padding-left: 0%" >
							<div class="input-group" style="width: 100%;">
								<input type="text" name="makieuloai" id="makieuloai" value="<%=makieuloai%>" placeholder="Nhập mã kiểu loại" class="form-control-find">								
							</div>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%; padding-right: 0%; margin-left: -28px;" >
							<label class="textlabel" style="margin-top: -5px;">Màu sơn</label>
						</div>
						<!----------------- Màu sơn ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 38.5% !important; padding-left: 1%; padding-right: 0%;">
							<div class="input-group" style="width: 100%;">
							<input type="text" name="mauSon" id="mauSon" value="<%=mauSon%>" placeholder="Nhập màu sơn" class="form-control-find">
							</div>
						</div>						
					</div>																		
				</div>
			</div>
			
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Nước sản xuất</label>
				</div>				
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right" style="height: 30px">
					<div class="row">
						<!----------------- Nước sản xuất ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 42.5% !important; padding-left: 0%" >
							<div class="input-group" style="width: 100%;">
								<input name="nuocsanxuat" id="nuocsanxuat" value="<%=nuocsanxuat%>" placeholder="Nhập nước sản xuất" class="form-control-find">								
							</div>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%; padding-right: 0%; margin-left: -28px;" >
							<label class="textlabel" style="margin-top: -5px;">Năm sản xuất</label>
						</div>
						<!----------------- Năm sản xuất ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 38.5% !important; padding-left: 1%; padding-right: 0%">
							<div class="input-group" style="width: 100%;">
								<select size="1" class="form-control-find" style="wisdth: 100%"
									name="namSanXuat" id="namSanXuat">
									<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.qlhs.luachon" /></option>
									<%for (String year : allYears) {%>
										<option <%=year.trim().equals(namSanXuat) ? "selected" : ""%> value="<%=year%>"><%=year%></option>
									<%}%>
								</select>
							</div>
						</div>						
					</div>																		
				</div>
			</div>	
	
		</div>
		

			<input type="hidden" id="<portlet:namespace />rowLengthId" name="<portlet:namespace />rowLengthId" value="<%= listCargoItems.size() %>">
			
			<table class="table table-condensed table-hover table-bordered hh-table" id="<portlet:namespace/>dataTable"> 
				<thead>
					<tr>
						<th width="5%">STT</th>
						<th width="15%">Loại phương tiện</th>
						<th width="30%">Nhóm thông số kỹ thuật<br>Tên thông số kỹ thuật</th>
						<th width="15%">So sánh</th>
						<th width="20%">Giá trị</th>
						<th width="12%">Điều kiện</th>
						<th width="5%"><input type="button" class="btn btn-sm" 
							onclick="addRow('<portlet:namespace/>dataTable', '<portlet:namespace />rowLengthId', '<portlet:namespace/>rowIndex')" 
							value="Thêm điều kiện" /></th>
					</tr>
				</thead>
				<tbody>
					<% 
						for(int i = 0; i < listCargoItems.size(); i++) { 
							Map<String, String> mlistCargoItems = listCargoItems.get(i);
							
							String index = mlistCargoItems.get("index");
					%>
						<tr>
							<td>
								<input type="hidden" name='<portlet:namespace/>rowIndex' value="<%= i+1 %>">
								<input type="text" class="noBorder text-center form-control" 
									readonly="readonly" name='stt' value="<%= i+1 %>">
								
							</td>
							<td>
								<div style="height: 30px">
								<select class="general_cargo " style="height: 25px; width: 90%" 
									id='<%= "CARGO_TYPE" + (i + 1) %>'
									name='<%= "CARGO_TYPE" + (i + 1) %>'>
										<option value="">--- Lựa chọn ---</option>
										
										<% for(DmDataItem item : specificCategory) {%>
											<option value="<%= item.getCode0() %>" <%=item.getCode0().trim().equalsIgnoreCase(mlistCargoItems.get("CARGO_TYPE" + index)) ? "selected" : "" %>><%= item.getName() %></option>
										<%} %>
								</select>
								</div>
							</td>
							<td>
								<div style="height: 30px">
								<select class="general_cargo " style="height: 25px; width: 90%" 
									id='<%= "CARGO_CATEGORY" + (i + 1) %>'
									name='<%= "CARGO_CATEGORY" + (i + 1) %>'>
										<option value="">--- Lựa chọn đối tượng trước tiên ---</option>
										
										<% for(DmDataItem item : specCategory) {%>
											<option value="<%= item.getCode0() %>" <%=item.getCode0().trim().equalsIgnoreCase(mlistCargoItems.get("CARGO_CATEGORY" + index)) ? "selected" : "" %>><%= item.getAlterName() %><%= item.getName() %></option>
										<%} %>
								</select>
								<br>
								<select class="col-xs-3 col-sm-3 col-md-3" style="height: 25px; width: 90%" 
									id='<%= "CARGO_NAME" + (i + 1) %>'
									name='<%= "CARGO_NAME" + (i + 1) %>'>
										<option value="">--- Lựa chọn ---</option>
										
										<% for(CfgTechnicalspec item : technicalspecCode) {%>
											<option value="<%= item.getSpecificationCode() %>" <%=item.getSpecificationCode().trim().equalsIgnoreCase(mlistCargoItems.get("CARGO_NAME" + index)) ? "selected" : "" %>><%= item.getSpecDescription() %></option>
										<%} %>
								</select>
								</div>
							</td>
							
							<td>
								<div style="height: 30px">							
								<select class="col-xs-3 col-sm-3 col-md-3" style="height: 25px; width: 90%"
									id='<%= "CARGO_QUANTITY" + (i + 1) %>' 
									name='<%= "CARGO_QUANTITY" + (i + 1) %>' 
									<option value="">--- Lựa chọn ---</option>
										
										<% for(DmDataItem item : likecondition) {%>
											<option value="<%= item.getCode0() %>" <%=item.getCode0().trim().equalsIgnoreCase(mlistCargoItems.get("CARGO_QUANTITY" + index)) ? "selected" : "" %>><%= item.getName() %></option>
										<%} %>
								</select>	
								</div>								
							</td>
							<td>
								<div style="height: 30px">							
								<input class="col-xs-3 col-sm-3 col-md-3" style="height: 25px; width: 90%"
									id='<%= "CARGO_DESCRIPTION" + (i + 1) %>' 
									name='<%= "CARGO_DESCRIPTION" + (i + 1) %>' 
									value="<%= mlistCargoItems.get("CARGO_DESCRIPTION" + index) %>">
								</div>
							</td>
							
							<td>
								<div style="height: 30px">							
								<select class="col-xs-3 col-sm-3 col-md-3" style="height: 25px; width: 90%"
									id='<%= "CARGO_UNIT" + (i + 1) %>'
									name='<%= "CARGO_UNIT" + (i + 1) %>'>
										<option value="">--- Lựa chọn ---</option>
										
										<% for(DmDataItem item : andorcondition) {%>
											<option value="<%= item.getCode0() %>" <%=item.getCode0().trim().equalsIgnoreCase(mlistCargoItems.get("CARGO_UNIT" + index)) ? "selected" : "" %>><%= item.getName() %></option>
										<%} %>
								</select>
								</div>
							</td>
		
							<td>
							
								<input type="button" class="btn btn-sm" 
									onclick="deleteRow('<portlet:namespace/>dataTable', this)" value="Xóa" />
							</td>
						</tr>
					<%} %>
				</tbody>
			</table>
		</div>
		
				<div class="row">
					<div class="col-xs-6 col-sm-6 col-md-6">
						<button type="button" class="bt btxanhduong btn btn-default" 
							onclick="summitForm('myForm', '<%= actionUrltimKiemPhuongTienNhapKhau.toString() %>')"><i class="fa-left fa fa-angle-down"></i> <liferay-ui:message key="vn.gt.dk.qlhs.button.timkiem" /></button>
						
						<button type="button" class="bt btxanhduong btn btn-default" 
							onclick="summitForm('myForm', '<%= actionUrlExportExcelPhuongTienNhapKhau.toString() %>')">
							<i class="fa-left fa fa-angle-down"></i> 
							Xuất excel
						</button>
						
						<select name="exportVehicleClass" id="exportVehicleClass">
							<option value="">-- Chọn loại phương tiện --</option>
							<option value="DCX">Động cơ</option>
							<option value="XBB">Xe bốn bánh</option>
							<option value="XCD">Xe chuyên dùng</option>
							<option value="XCG">Xe cơ giới</option>
							<option value="XDD">Xe đạp điện</option>
							<option value="XMY">Xe máy</option>
						</select>
					</div>
				</div>
			</div>
		</div>
</aui:form>		

<script type="text/javascript">
function summitForm(idForm, url) {
	var urlAction = document.getElementById('<portlet:namespace/>' + idForm).action;
	
	document.getElementById('<portlet:namespace/>' + idForm).action = url;
	document.getElementById('<portlet:namespace/>' + idForm).submit(); 
}
</script>
		
		<%
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	%>
	</div>
</div>


<script type="text/javascript">
function validatorThuNhoMoRong(){
	var valid = true;
	if (document.getElementById('CentralPanelLine').style.display == "block") {	
		document.getElementById('LeftPanelConditions').style.display = "none";
		document.getElementById('RightPanelConditions').style.display = "none";
		document.getElementById('CentralPanelLine').style.display = "none";
		document.getElementById('setThuNho').style.display = "none";
		document.getElementById('setMoRong').style.display = "block";
		
		return valid;	
	} else {
		document.getElementById('LeftPanelConditions').style.display = "block";
		document.getElementById('RightPanelConditions').style.display = "block";
		document.getElementById('CentralPanelLine').style.display = "block";	
		document.getElementById('setMoRong').style.display = "none";
		document.getElementById('setThuNho').style.display = "block";
		setOpen = true;	
		return valid;	
	}

	return valid;	
}
</script>

<portlet:resourceURL var="updateThuTucURL" >
</portlet:resourceURL>

<script>
	$(document).ready(function() {
		$('#loaiThuTuc').change(function(event) {
			var code = $("select#loaiThuTuc").val();
			
			console.log(code);
			
			if (code == "") {
				return;
			}
			
			$.ajax({
				url: '<%=updateThuTucURL%>',
				dataType: "json",
				data: { 
					codeLoaiThuTuc : code,
					type : 'getTenThuTuc'
				},
				
				type: "get",
				success : function (data) {
					console.log(data);
					var select = $('#tenThuTuc');
					select.find('option').remove();

					$('<option>').val("").text("---- Lựa chọn ------").appendTo(select);
					$.each(data, function(idx, obj) {
						console.log(obj);
						$('<option>').val(obj.id).text(obj.name).appendTo(select);
					});
				}, beforeSend: function() {
					console.log("===beforeSend==");					
				}, complete: function() {
					console.log("===complete==");				
				}, error: function() {
					console.log("==error==");
					
				}
			});
		});
	});
</script>

<portlet:resourceURL var="CapNhatThongSoKyThuatURL" ></portlet:resourceURL>

<script type="text/javascript">

$(document).ready(function() {
		var setTenHangHoa = function(selLoaiHangHoa) {
		var loaiHangHoaId = selLoaiHangHoa.attr('id');
		var suff = loaiHangHoaId.substr('CARGO_TYPE'.length, loaiHangHoaId.length);
		var selTenHangHoa = $('#CARGO_NAME' + suff);
		
		if(selTenHangHoa.length > 0) {
			var valueSelected = selTenHangHoa.val();
			
			$.ajax({
				url: '<%=CapNhatThongSoKyThuatURL%>',
				dataType: 'json',
				data : {
					loaiPhuongTien : selLoaiHangHoa.val(),
					type: 'findThongSoKyThuatByLoaiPhuongTien'
				},
				type: 'get',
				success : function(data) {
					selTenHangHoa.find('option').remove();
					
					$('<option>').val("").text("--- Lựa chọn ---").appendTo(selTenHangHoa);
					
					$.each(data, function(idx, obj) {
						if(valueSelected == obj.specCode) {
							$('<option>').val(obj.specCode).text(obj.specDescription).attr("selected","selected").appendTo(selTenHangHoa);
						} else {
							$('<option>').val(obj.specCode).text(obj.specDescription).appendTo(selTenHangHoa);
						}
						
					});
				}
			});
		}
	}
	
	$('.general_cargo').each(function(){
		if($(this).val() != '') {
			setTenHangHoa($(this));
		}
	})
	
	$(document.body).delegate('.general_cargo', "change", function(){
		setTenHangHoa($(this));
	});
	
	$(document.body).delegate('.general_cargo', "change", function(){
		setTenHangHoa($(this));
	});
	
})
</script>

<script type="text/javascript">	
	function onClickDeleteRow(tableID, rowLengthId){
		var table = document.getElementById(tableID);
		var tbody = table.getElementsByTagName('tbody')[0];
		var rowCount = tbody.rows.length;
		if (rowCount <= 1) {
			// alert("Reset giá trị Thông số kỹ thuật dòng 1.");
		} else {
			//alert("Clear giá trị Thông số kỹ thuật từ dòng 1 trở đi, trừ dòng cuối cùng.");
			while(table.rows.length > 2) {
				  table.deleteRow(1);
				}						
		};		
		rowCount = tbody.rows.length;
		if (rowCount <= 1) {
			var selTenHangHoa = $('#CARGO_CATEGORY' + parseInt(document.getElementById(rowLengthId).value));
			selTenHangHoa.find('option').remove();
			
			$('<option>').val("").text("--- Reset lựa chọn ---").appendTo(selTenHangHoa);
			//alert("Reset giá trị Thông số kỹ thuật dòng 1.");
		}; 
			
	}
	function deleteRow(tableID, el) {
		var table = document.getElementById(tableID);
		var tbody = table.getElementsByTagName('tbody')[0];
		var rowCount = tbody.rows.length;
		
		if (rowCount <= 1) {
			alert("Không thể xóa tất cả các dòng.");
		} else {
			var i = el.parentNode.parentNode.rowIndex;
			table.deleteRow(i);
		}
	}
	
	function addRow(tableID, rowLengthId, rowIndexName) {
		var table = document.getElementById(tableID);
		var tbody = table.getElementsByTagName('tbody')[0];
		
		var old_row_inc = "";
		
		// Lay gia tri rowIndex cua row duoc clone
		for(var k = 0; k < tbody.rows[0].getElementsByTagName('input').length; k++) {
			var input = tbody.rows[0].getElementsByTagName('input')[k];
			var nameInput = tbody.rows[0].getElementsByTagName('input')[k].getAttribute('name');
			
			if(nameInput === rowIndexName) {
				old_row_inc = input.value;
				break;
			}
		}
		
		var new_row_inc = parseInt(document.getElementById(rowLengthId).value) + 1;
		
		document.getElementById(rowLengthId).value = new_row_inc;
		
		var newRow = tbody.rows[0].cloneNode(true);
		
		// Set lai name cho input theo dinh dang name = NAME + rowIndex
		for(var k = 0; k < newRow.getElementsByTagName('input').length; k++) {
			var input = newRow.getElementsByTagName('input')[k];
			
			var nameInput = input.getAttribute('name');
			var idInput = input.getAttribute('id');
			
			if(nameInput) {
				if(nameInput === rowIndexName || nameInput === 'stt') {
					input.value = new_row_inc;
				} else {
					var defaultName = nameInput;
					
					if(nameInput.lastIndexOf(old_row_inc) > 0) {
						defaultName = nameInput.slice(0, nameInput.lastIndexOf(old_row_inc));
						nameInput = defaultName + new_row_inc;
						
						if(idInput != undefined && idInput != null) {
							idInput = idInput.slice(0, idInput.lastIndexOf(old_row_inc)) + new_row_inc;
						}
					}
					
					input.setAttribute("name", nameInput);
					
					if(idInput != undefined && idInput != null) {
						input.setAttribute('id', idInput);
					}
				}
			}
		}
		
		// Set lai name cho textarea theo dinh dang name = NAME + rowIndex
		for(var k = 0; k < newRow.getElementsByTagName('textarea').length; k++) {
			var input = newRow.getElementsByTagName('textarea')[k];
			
			var nameInput = input.getAttribute('name');
			var idInput = input.getAttribute('id');
			
			if(nameInput) {
				var defaultName = nameInput;
				
				if(nameInput.lastIndexOf(old_row_inc) > 0) {
					defaultName = nameInput.slice(0, nameInput.lastIndexOf(old_row_inc));
					nameInput = defaultName + new_row_inc;
					
					if(idInput != undefined && idInput != null) {
						idInput = idInput.slice(0, idInput.lastIndexOf(old_row_inc)) + new_row_inc;
					}
				}
				
				input.setAttribute("name", nameInput);
				
				if(idInput != undefined && idInput != null) {
					input.setAttribute('id', idInput);
				}
			}
		}
		
		// Set lai name cho textarea theo dinh dang name = NAME + rowIndex
		for(var k = 0; k < newRow.getElementsByTagName('select').length; k++) {
			var input = newRow.getElementsByTagName('select')[k];
			
			var nameInput = input.getAttribute('name');
			var idInput = input.getAttribute('id');
			
			if(nameInput) {
				var defaultName = nameInput;
				
				if(nameInput.lastIndexOf(old_row_inc) > 0) {
					defaultName = nameInput.slice(0, nameInput.lastIndexOf(old_row_inc));
					nameInput = defaultName + new_row_inc;
					
					if(idInput != undefined && idInput != null) {
						idInput = idInput.slice(0, idInput.lastIndexOf(old_row_inc)) + new_row_inc;
					}
				}
				
				input.setAttribute("name", nameInput);
				
				if(idInput != undefined && idInput != null) {
					input.setAttribute('id', idInput);
				}
			}
		}
		
		tbody.appendChild(newRow);
	}
</script>

<style>
.table {
    margin-bottom: 10px;
    margin-top: 10px;
    max-width: 100%;
    width: 100%;
}
.table th {
    background-color: #e9e9e9;
    font-weight: bold;
    text-align: center;
}
.table-bordered {
    border: 1px solid #ddd;
}
.table-bordered > thead > tr > th, .table-bordered > tbody > tr > th, .table-bordered > tfoot > tr > th, .table-bordered > thead > tr > td, .table-bordered > tbody > tr > td, .table-bordered > tfoot > tr > td {
    border: 1px solid #ddd;
}
.table-condensed > thead > tr > th, .table-condensed > tbody > tr > th, .table-condensed > tfoot > tr > th, .table-condensed > thead > tr > td, .table-condensed > tbody > tr > td, .table-condensed > tfoot > tr > td {
    padding: 5px;
}
.table > thead > tr > th {
    border-bottom: 2px solid #ddd;
    vertical-align: bottom;
}
.table > thead > tr > th, .table > tbody > tr > th, .table > tfoot > tr > th, .table > thead > tr > td, .table > tbody > tr > td, .table > tfoot > tr > td {
    border-top: 1px solid #ddd;
    line-height: 1.42857;
    padding: 8px;
    vertical-align: top;
}

.noBorder {
	border: medium none !important;
    box-shadow: none !important;
    background: #FFF !important;
}

.form-control {
	display: block;
    height: 30px;
    line-height: 1.42857;
    padding: 4px 10px;
    width: 100%;
}

.radio, .checkbox {
    display: block;
    margin-bottom: 10px;
    margin-top: 10px;
    position: relative;
}

.radio-inline, .checkbox-inline {
    cursor: pointer;
    display: inline-block;
    font-weight: normal;
    margin-bottom: 0;
    padding-left: 20px;
    position: relative;
    vertical-align: middle;
}

.radio label, .checkbox label {
    cursor: pointer;
    font-weight: normal;
    margin-bottom: 0;
    min-height: 20px;
    padding-left: 20px;
}
label.toggleRadio {
	font-weight: bold !important;
}

.col-xs-12 {
	width: 100%;
}

.col-xs-1, .col-xs-2, .col-xs-3, .col-xs-4, .col-xs-5, .col-xs-6, .col-xs-7, .col-xs-8, .col-xs-9, .col-xs-10, .col-xs-11, .col-xs-12 {
	float: left;
}

.col-xs-1, .col-sm-1, .col-md-1, .col-lg-1, .col-xs-2, .col-sm-2, .col-md-2, .col-lg-2, .col-xs-3, .col-sm-3, .col-md-3, .col-lg-3, .col-xs-4, .col-sm-4, .col-md-4, .col-lg-4, .col-xs-5, .col-sm-5, .col-md-5, .col-lg-5, .col-xs-6, .col-sm-6, .col-md-6, .col-lg-6, .col-xs-7, .col-sm-7, .col-md-7, .col-lg-7, .col-xs-8, .col-sm-8, .col-md-8, .col-lg-8, .col-xs-9, .col-sm-9, .col-md-9, .col-lg-9, .col-xs-10, .col-sm-10, .col-md-10, .col-lg-10, .col-xs-11, .col-sm-11, .col-md-11, .col-lg-11, .col-xs-12, .col-sm-12, .col-md-12, .col-lg-12 {
	min-height: 1px;
	padding-left: 15px;
	padding-right: 15px;
	position: relative;
}

.PA0 {
    padding-left: 0;
    padding-right: 0;
}
.textlabel {
    margin-top: 8px;
    padding-right: 0;
}
label {
    display: inline-block;
    font-weight: bold;
    margin-bottom: 5px;
    max-width: 100%;
}
p {
    margin: 0 0 10px;
}
.radio input[type="radio"], .radio-inline input[type="radio"], .checkbox input[type="checkbox"], .checkbox-inline input[type="checkbox"] {
    margin-left: -20px;
    position: absolute;
}
.col-xs-12{width:100%}.col-xs-11{width:91.66666667%}.col-xs-10{width:83.33333333%}.col-xs-9{width:75%}.col-xs-8{width:66.66666667%}.col-xs-7{width:58.33333333%}.col-xs-6{width:50%}.col-xs-5{width:41.66666667%}.col-xs-4{width:33.33333333%}.col-xs-3{width:25%}.col-xs-2{width:16.66666667%}.col-xs-1{width:8.33333333%}

.col-md-14 { width: 14%; }
.col-md-15 { width: 24%; }
.col-md-16 { width: 16%; }

.col-md-left {padding-right: 0%;width: 22% !important;}

.col-md-right { width: 78% !important; }
.col-calender {width: 90%;float: left;}

.box {
	border: 1px solid #ccc;
	background-color: white;
	height: 290px;
	margin-left: 3%;
	overflow-y: scroll;
}
.bold { font-weight: bold;}
.dateFrom { margin-left: -15px; width: 51.6%; padding-right: 0px;}
 
.dateTo { width: 52%; padding-right: 0px;}

.divItemBox { float: left; width: 100%; padding: 0 0 0 0; margin: 0 0 0.5% 0;}
.itemBox1 {width: 66%;float: left;}
.itemBox2 {width: 20%;float: left;}
.itemBox3 {width: 9%;float: left;}
.itemBox4 {margin: 1% 0% 0% 0.5%;}

.ui-widget-header {background-color: #5f8ae0;}


</style>


