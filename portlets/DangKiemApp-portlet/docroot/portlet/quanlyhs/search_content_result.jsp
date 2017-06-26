<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Hashtable"%>
<%@page import="vn.dtt.gt.dk.dynamicquery.DynamicQueryUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.DaKiemTraLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.DaKiemTra"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.LichKiemTraHienTruongLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.utils.CollectionUtils"%>
<%@page import="vn.dtt.gt.dk.utils.format.FormatData"%>
<%@page import="java.util.Calendar"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.PhanCongDonViKiemTraLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo"%>
<%@page import="vn.dtt.gt.dk.utils.format.CommonUtils"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoVaiTroLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro"%>
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoPermission"%>
<%@page import="vn.dtt.gt.dk.report.ReportConstant"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoConfiguration"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyChinhLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ include file="/portlet/init.jsp"%>
<%


//-------------- Organization
long organizationId = 0;
if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
	organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
}


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
if (soDKKT != null) {
	portletUrl.setParameter(Constants.SO_DKKT, soDKKT);
}

SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, portletUrl, null, "");



List<TthcHoSoThuTuc> results = null;
List<MotCuaPhieuXuLyPhu> resultsCuaPhieuXuLyPhus = null; 
List<MotCuaPhieuXuLyChinh> resultMcPhieuXyLyChinhs = null;
List<PhanCongDonViKiemTra> resultsPhanCongDonViKiemTras = null;

List<LichKiemTraHienTruong> resultsLichKiemTraHienTruongs = null;
List<DaKiemTra> resultsDaKiemTras = null;
String lstConfirmedInspectionId = "";

long longTotal = 0;

if(organizationId > 0) {
	// Load phieu xy ly phu
	if (Constants.LOAIPHIEUXULY_PHIEU_PHU == tthcPhanNhomHoSo.getLoaiPhieuXuLy()) {
		if ((idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("24") == 0)
				||(idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("29") == 0)){
			String liRoleSelected = CommonUtils.checkRole(themeDisplay);
			
			//truong hop lay trong key phannhomhosoid
			List<TthcPhanNhomHoSoVaiTro> liTthcPhanNhomHoSoVaiTros = TthcPhanNhomHoSoVaiTroLocalServiceUtil.findTthcPhanNhomHoSoVaiTroByPhanNhomHoSoAndVaiTroXuLy(ConvertUtil.convertToLong(idPhanNhomHoSo), liRoleSelected);
			String listNhomPhieuXuLy =  CommonUtils.getNhomPhieuXuLy(liTthcPhanNhomHoSoVaiTros);
	
			resultsPhanCongDonViKiemTras=PhanCongDonViKiemTraLocalServiceUtil.searchLichKiemTraHienTruong(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, soDKKT, ngayNopHsFrom, ngayNopHsTo, ConvertUtil.convertToInt(namNhap), null, null, null,PortalUtil.getUserId(request), searchContainer.getStart(), searchContainer.getEnd());
			longTotal = PhanCongDonViKiemTraLocalServiceUtil.countLichKiemTraHienTruong(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, soDKKT, ngayNopHsFrom, ngayNopHsTo, ConvertUtil.convertToInt(namNhap), null, null, null,PortalUtil.getUserId(request));
			
			//lay id cho Bien Ban ghi nhan
			List<PhanCongDonViKiemTra> resultsBienBanGhiNhans = PhanCongDonViKiemTraLocalServiceUtil.searchLichKiemTraHienTruong(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, soDKKT, ngayNopHsFrom, ngayNopHsTo, ConvertUtil.convertToInt(namNhap), null, null, null,PortalUtil.getUserId(request), 0, Integer.parseInt(String.valueOf(longTotal)));
			lstConfirmedInspectionId = CollectionUtils.getListIdBienBanKiemTra2(resultsBienBanGhiNhans);
			
			searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
			System.out.println("Vao=========================1");
		//	searchContainer.setResults(resultsPhanCongDonViKiemTras);
		} else if ((idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("25") == 0)
				||(idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("26") == 0)
				||(idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("20") == 0)
				||(idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("21") == 0)
				||(idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("19") == 0)){
			String liRoleSelected = CommonUtils.checkRole(themeDisplay);
			
			//truong hop lay trong key phannhomhosoid
			List<TthcPhanNhomHoSoVaiTro> liTthcPhanNhomHoSoVaiTros = TthcPhanNhomHoSoVaiTroLocalServiceUtil.findTthcPhanNhomHoSoVaiTroByPhanNhomHoSoAndVaiTroXuLy(ConvertUtil.convertToLong(idPhanNhomHoSo), liRoleSelected);
			String listNhomPhieuXuLy =  CommonUtils.getNhomPhieuXuLy(liTthcPhanNhomHoSoVaiTros);
	
			//resultsCuaPhieuXuLyPhus = MotCuaPhieuXuLyPhuLocalServiceUtil.findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(loaiThuTuc, soDKKT,PortalUtil.getUserId(request), listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap), searchContainer.getStart(), searchContainer.getEnd());
			//longTotal = MotCuaPhieuXuLyPhuLocalServiceUtil.countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(loaiThuTuc, soDKKT, PortalUtil.getUserId(request),listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap));
			//resultsDaKiemTras = DaKiemTraLocalServiceUtil.findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(loaiThuTuc, soDKKT,PortalUtil.getUserId(request), listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap), searchContainer.getStart(), searchContainer.getEnd());
			resultsDaKiemTras = DaKiemTraLocalServiceUtil.findByMotCuaPhieuXuLyPhu(loaiThuTuc, soDKKT,PortalUtil.getUserId(request), listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap), searchContainer.getStart(), searchContainer.getEnd());
			//longTotal = DaKiemTraLocalServiceUtil.countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(loaiThuTuc, soDKKT, PortalUtil.getUserId(request),listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap));
			longTotal = DaKiemTraLocalServiceUtil.countByMotCuaPhieuXuLyPhu(loaiThuTuc, soDKKT, PortalUtil.getUserId(request),listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap));
			//longTotal = longTotal +DaKiemTraLocalServiceUtil.countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra2(loaiThuTuc, soDKKT, PortalUtil.getUserId(request),listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap));
			searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
			System.out.println("Vao=========================2");
		//	searchContainer.setResults(resultsCuaPhieuXuLyPhus);
		} else if ((idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("59") == 0)
				||(idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("60") == 0)) {
			
			String liRoleSelected = CommonUtils.checkRole(themeDisplay);
			
			//truong hop lay trong key phannhomhosoid
			List<TthcPhanNhomHoSoVaiTro> liTthcPhanNhomHoSoVaiTros = TthcPhanNhomHoSoVaiTroLocalServiceUtil.findTthcPhanNhomHoSoVaiTroByPhanNhomHoSoAndVaiTroXuLy(ConvertUtil.convertToLong(idPhanNhomHoSo), liRoleSelected);
			String listNhomPhieuXuLy =  CommonUtils.getNhomPhieuXuLy(liTthcPhanNhomHoSoVaiTros);
	
			resultsCuaPhieuXuLyPhus = MotCuaPhieuXuLyPhuLocalServiceUtil.findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(loaiThuTuc, soDKKT, listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap), searchContainer.getStart(), searchContainer.getEnd());
			longTotal = MotCuaPhieuXuLyPhuLocalServiceUtil.countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(loaiThuTuc, soDKKT, listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap));
			searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
			//searchContainer.setResults(resultsCuaPhieuXuLyPhus);
			System.out.println("Vao=========================3");
		}else if ((idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("14") == 0)) {
			
			String liRoleSelected = CommonUtils.checkRole(themeDisplay);
			
			//truong hop lay trong key phannhomhosoid
			List<TthcPhanNhomHoSoVaiTro> liTthcPhanNhomHoSoVaiTros = TthcPhanNhomHoSoVaiTroLocalServiceUtil.findTthcPhanNhomHoSoVaiTroByPhanNhomHoSoAndVaiTroXuLy(ConvertUtil.convertToLong(idPhanNhomHoSo), liRoleSelected);
			String listNhomPhieuXuLy =  CommonUtils.getNhomPhieuXuLy(liTthcPhanNhomHoSoVaiTros);
	
			//resultsCuaPhieuXuLyPhus = MotCuaPhieuXuLyPhuLocalServiceUtil.findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(loaiThuTuc, soDKKT, listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap), searchContainer.getStart(), searchContainer.getEnd());
			//longTotal = MotCuaPhieuXuLyPhuLocalServiceUtil.countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(loaiThuTuc, soDKKT, listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap));
			
			resultsPhanCongDonViKiemTras =PhanCongDonViKiemTraLocalServiceUtil.searchPhanCongDonViKiemTraByHoSoThuTucId(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, soDKKT, ngayNopHsFrom, ngayNopHsTo, ConvertUtil.convertToInt(namNhap), null, null, null, searchContainer.getStart(), searchContainer.getEnd());
		
		//	resultsPhanCongDonViKiemTras =LichKiemTraHienTruongLocalServiceUtil.searchPhanCongDonViKiemTraByHoSoThuTucId(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, soDKKT, ngayNopHsFrom, ngayNopHsTo, ConvertUtil.convertToInt(namNhap), null, null, null,PortalUtil.getUserId(request), searchContainer.getStart(), searchContainer.getEnd());
			//longTotal = LichKiemTraHienTruongLocalServiceUtil.countPhanCongDonViKiemTraByHoSoThuTucId(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, soDKKT, ngayNopHsFrom, ngayNopHsTo, ConvertUtil.convertToInt(namNhap), null, null, null,PortalUtil.getUserId(request));
			longTotal = PhanCongDonViKiemTraLocalServiceUtil.countPhanCongDonViKiemTraByHoSoThuTucId(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, soDKKT, ngayNopHsFrom, ngayNopHsTo, ConvertUtil.convertToInt(namNhap), null, null, null);
			
			
			searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
			System.out.println("Vao=========================4");
			//searchContainer.setResults(resultsCuaPhieuXuLyPhus);
		}else if ((idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("16") == 0)) {
			
			String liRoleSelected = CommonUtils.checkRole(themeDisplay);
			
			//truong hop lay trong key phannhomhosoid
			List<TthcPhanNhomHoSoVaiTro> liTthcPhanNhomHoSoVaiTros = TthcPhanNhomHoSoVaiTroLocalServiceUtil.findTthcPhanNhomHoSoVaiTroByPhanNhomHoSoAndVaiTroXuLy(ConvertUtil.convertToLong(idPhanNhomHoSo), liRoleSelected);
			String listNhomPhieuXuLy =  CommonUtils.getNhomPhieuXuLy(liTthcPhanNhomHoSoVaiTros);
	
			//resultsCuaPhieuXuLyPhus = MotCuaPhieuXuLyPhuLocalServiceUtil.findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(loaiThuTuc, soDKKT, listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap), searchContainer.getStart(), searchContainer.getEnd());
			//longTotal = MotCuaPhieuXuLyPhuLocalServiceUtil.countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(loaiThuTuc, soDKKT, listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap));
			
			resultsPhanCongDonViKiemTras =PhanCongDonViKiemTraLocalServiceUtil.searchPhanCongKiemTraKiemTraHienTruong(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, soDKKT, ngayNopHsFrom, ngayNopHsTo, ConvertUtil.convertToInt(namNhap), null, null, null,PortalUtil.getUserId(request) , searchContainer.getStart(), searchContainer.getEnd());
		
		//	resultsPhanCongDonViKiemTras =LichKiemTraHienTruongLocalServiceUtil.searchPhanCongDonViKiemTraByHoSoThuTucId(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, soDKKT, ngayNopHsFrom, ngayNopHsTo, ConvertUtil.convertToInt(namNhap), null, null, null,PortalUtil.getUserId(request), searchContainer.getStart(), searchContainer.getEnd());
			//longTotal = LichKiemTraHienTruongLocalServiceUtil.countPhanCongDonViKiemTraByHoSoThuTucId(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, soDKKT, ngayNopHsFrom, ngayNopHsTo, ConvertUtil.convertToInt(namNhap), null, null, null,PortalUtil.getUserId(request));
			longTotal = PhanCongDonViKiemTraLocalServiceUtil.countPhanCongKiemTraHienTruong(listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, soDKKT, ngayNopHsFrom, ngayNopHsTo, ConvertUtil.convertToInt(namNhap), null, null, null,PortalUtil.getUserId(request));
			
			
			searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
			//searchContainer.setResults(resultsCuaPhieuXuLyPhus);
			System.out.println("Vao=========================5");
		}
	
		else{
			
			String liRoleSelected = CommonUtils.checkRole(themeDisplay);
			
			//truong hop lay trong key phannhomhosoid
			List<TthcPhanNhomHoSoVaiTro> liTthcPhanNhomHoSoVaiTros = TthcPhanNhomHoSoVaiTroLocalServiceUtil.findTthcPhanNhomHoSoVaiTroByPhanNhomHoSoAndVaiTroXuLy(ConvertUtil.convertToLong(idPhanNhomHoSo), liRoleSelected);
			String listNhomPhieuXuLy =  CommonUtils.getNhomPhieuXuLy(liTthcPhanNhomHoSoVaiTros);
	
			resultsCuaPhieuXuLyPhus = MotCuaPhieuXuLyPhuLocalServiceUtil.findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(loaiThuTuc, soDKKT, listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap), searchContainer.getStart(), searchContainer.getEnd());
			longTotal = MotCuaPhieuXuLyPhuLocalServiceUtil.countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(loaiThuTuc, soDKKT, listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap));
			searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
			//searchContainer.setResults(resultsCuaPhieuXuLyPhus);
			System.out.println("Vao=========================6");
		}
		
	//Load phieu xy ly chinh
	} else if (Constants.LOAIPHIEUXULY_PHIEU_CHINH == tthcPhanNhomHoSo.getLoaiPhieuXuLy()) {
		String liRoleSelected = CommonUtils.checkRole(themeDisplay);

		List<TthcPhanNhomHoSoVaiTro> liTthcPhanNhomHoSoVaiTros = TthcPhanNhomHoSoVaiTroLocalServiceUtil.findTthcPhanNhomHoSoVaiTroByPhanNhomHoSoAndVaiTroXuLy(ConvertUtil.convertToLong(idPhanNhomHoSo), liRoleSelected);
		String listNhomPhieuXuLy =  CommonUtils.getNhomPhieuXuLy(liTthcPhanNhomHoSoVaiTros);
		
		resultMcPhieuXyLyChinhs = MotCuaPhieuXuLyChinhLocalServiceUtil.findMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(loaiThuTuc, soDKKT, listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep,  ConvertUtil.convertToInt(namNhap), searchContainer.getStart(), searchContainer.getEnd());
		longTotal = MotCuaPhieuXuLyChinhLocalServiceUtil.countMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(loaiThuTuc, soDKKT, listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep,  ConvertUtil.convertToInt(namNhap));

		searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
		//searchContainer.setResults(resultMcPhieuXyLyChinhs);
		System.out.println("Vao=========================7");
	//Ho so thu tuc
	} else {
		results = TthcHoSoThuTucLocalServiceUtil.findDanhSachHoSoAndDoiTuongAndMaSoBienNhan(loaiThuTuc, soDKKT, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, searchContainer.getStart(), searchContainer.getEnd());
		longTotal = TthcHoSoThuTucLocalServiceUtil.countDanhSachHoSoAndDoiTuongAndMaSoBienNhan(loaiThuTuc, soDKKT, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep);
		
		searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
		//searchContainer.setResults(results);
		System.out.println("Vao=========================9");
	}
}
if (results == null) { 
	results = new ArrayList<TthcHoSoThuTuc>(); 
}

PortletPreferences resourcePrefs = PortletPreferencesFactoryUtil.getPortletSetup(renderRequest);
String loadDataBaseMotCua = resourcePrefs.getValue(Constants.LOAD_DATABASE_MOTCUA, "");



%>
<table class="wd-table table">
	<thead>
		<tr>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.stt" /></th>
			<%
			if (Constants.LOAIPHIEUXULY_PHIEU_PHU == tthcPhanNhomHoSo.getLoaiPhieuXuLy()) {
				%>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.maso.biennhan" /></th>
				<%
			} else {
				%>
				<th width="15%"><liferay-ui:message key="vn.gt.dk.qlhs.tthc" /></th>
				<%
			}
			%>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.maso" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.ngaynop" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.tendoanhnghiep" /></th>
			<th width="15%"><liferay-ui:message key="vn.gt.dk.qlhs.noidung" /></th>
			<th width="30%"><liferay-ui:message key="vn.gt.dk.qlhs.ghichu" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.thaotac" /></th>
		</tr>
	</thead>
	<tbody>
	<%
	if (Constants.LOAIPHIEUXULY_PHIEU_PHU == tthcPhanNhomHoSo.getLoaiPhieuXuLy()) {
		if((idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("16") == 0)||(idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("14") == 0)){
			if(resultsPhanCongDonViKiemTras!=null&&resultsPhanCongDonViKiemTras.size()>0){
				int index = 1;
				for (PhanCongDonViKiemTra motCuaPhieuXuLyPhu : resultsPhanCongDonViKiemTras) {
					
					//hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.findByPhieuXuLyPhuId(motCuaPhieuXuLyPhu.getId());
					PortletURL viewHoSoUrl4 = renderResponse.createRenderURL();
					viewHoSoUrl4.setParameter("jspPage", "/portlet/quanlyhs/hoso_detail.jsp");
					viewHoSoUrl4.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(motCuaPhieuXuLyPhu.getPhieuXuLyChinhId()));
					viewHoSoUrl4.setParameter(Constants.ID_PHIEU_XU_LY_PHU, String.valueOf(motCuaPhieuXuLyPhu.getId()));
					viewHoSoUrl4.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TPHS);
					viewHoSoUrl4.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, String.valueOf(motCuaPhieuXuLyPhu.getThuTucHanhChinhId()));
					%>
					<tr>
						<td class="text-center"><%= (index++) + searchContainer.getStart() %></td>
						<td class="text-center"><%=motCuaPhieuXuLyPhu.getMaBienNhan() %></td>
						<td class="text-center"><%=motCuaPhieuXuLyPhu.getMaSoHoSo() %></td>
						<td class="text-center"><%=DateUtils.dateToString("dd/MM/yyyy HH:mm", motCuaPhieuXuLyPhu.getNgayGuiHoSo())%></td>
						<td><span class="text-left"><%=motCuaPhieuXuLyPhu.getTenChuHoSo()%></span></td>
						<td class="text-left"><%=motCuaPhieuXuLyPhu.getTrichYeuNoiDung() %></td>
						<td class="text-left"><%=motCuaPhieuXuLyPhu.getGhiChu() %></td>
						<td class="text-center"><a href="<%=viewHoSoUrl4.toString() %>" class="aicon"><i class="icon20 iconm5 fa fa-pencil"></i></a></td>
					</tr>
					<%
				}
			}
		}
		
		else if ((idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("25") == 0)
				||(idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("26") == 0)
				||(idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("20") == 0)
				||(idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("21") == 0)
				||(idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("19") == 0)){
			if(resultsDaKiemTras!=null&&resultsDaKiemTras.size()>0){
				int index = 1;
				for (DaKiemTra motCuaPhieuXuLyPhu : resultsDaKiemTras) {
					
					//hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.findByPhieuXuLyPhuId(motCuaPhieuXuLyPhu.getId());
					PortletURL viewHoSoUrl4 = renderResponse.createRenderURL();
					viewHoSoUrl4.setParameter("jspPage", "/portlet/quanlyhs/hoso_detail.jsp");
					viewHoSoUrl4.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(motCuaPhieuXuLyPhu.getPhieuXuLyChinhId()));
					viewHoSoUrl4.setParameter(Constants.ID_PHIEU_XU_LY_PHU, String.valueOf(motCuaPhieuXuLyPhu.getId()));
					viewHoSoUrl4.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TPHS);
					viewHoSoUrl4.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, String.valueOf(motCuaPhieuXuLyPhu.getThuTucHanhChinhId()));
					%>
					<tr>
						<td class="text-center"><%= (index++) + searchContainer.getStart() %></td>
						<td class="text-center"><%=motCuaPhieuXuLyPhu.getMaBienNhan() %></td>
						<td class="text-center"><%=motCuaPhieuXuLyPhu.getMaSoHoSo() %></td>
						<td class="text-center"><%=DateUtils.dateToString("dd/MM/yyyy HH:mm", motCuaPhieuXuLyPhu.getNgayGuiHoSo())%></td>
						<td><span class="text-left"><%=motCuaPhieuXuLyPhu.getTenChuHoSo()%></span></td>
						<td class="text-left"><%=motCuaPhieuXuLyPhu.getTrichYeuNoiDung() %></td>
						<td class="text-left"><%=motCuaPhieuXuLyPhu.getGhiChu() %></td>
						<td class="text-center"><a href="<%=viewHoSoUrl4.toString() %>" class="aicon"><i class="icon20 iconm5 fa fa-pencil"></i></a></td>
					</tr>
					<%
				}
			}	
		}
		else if((idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("24") == 0)||(idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("29") == 0)){
			if(resultsPhanCongDonViKiemTras!=null&&resultsPhanCongDonViKiemTras.size()>0){
				int index = 1;
				for (PhanCongDonViKiemTra motCuaPhieuXuLyPhu : resultsPhanCongDonViKiemTras) {
					
					//hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.findByPhieuXuLyPhuId(motCuaPhieuXuLyPhu.getId());
					PortletURL viewHoSoUrl4 = renderResponse.createRenderURL();
					viewHoSoUrl4.setParameter("jspPage", "/portlet/quanlyhs/hoso_detail.jsp");
					viewHoSoUrl4.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(motCuaPhieuXuLyPhu.getPhieuXuLyChinhId()));
					viewHoSoUrl4.setParameter(Constants.ID_PHIEU_XU_LY_PHU, String.valueOf(motCuaPhieuXuLyPhu.getId()));
					viewHoSoUrl4.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TPHS);
					viewHoSoUrl4.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, String.valueOf(motCuaPhieuXuLyPhu.getThuTucHanhChinhId()));
					%>
					<tr>
						<td class="text-center"><%= (index++) + searchContainer.getStart() %></td>
						<td class="text-center"><%=motCuaPhieuXuLyPhu.getMaBienNhan() %></td>
						<td class="text-center"><%=motCuaPhieuXuLyPhu.getMaSoHoSo() %></td>
						<td class="text-center"><%=DateUtils.dateToString("dd/MM/yyyy HH:mm", motCuaPhieuXuLyPhu.getNgayGuiHoSo())%></td>
						<td><span class="text-left"><%=motCuaPhieuXuLyPhu.getTenChuHoSo()%></span></td>
						<td class="text-left"><%=motCuaPhieuXuLyPhu.getTrichYeuNoiDung() %></td>
						<td class="text-left"><%=motCuaPhieuXuLyPhu.getGhiChu() %></td>
						<td class="text-center"><a href="<%=viewHoSoUrl4.toString() %>" class="aicon"><i class="icon20 iconm5 fa fa-pencil"></i></a></td>
					</tr>
					<%
				}
			}
		}else{
			TthcHoSoThuTuc hoSoThuTuc = null;
			int index = 1;
			Hashtable<Long,TthcHoSoThuTuc> hMap = null;
			//TODO:
			//if(resultsCuaPhieuXuLyPhus.size()>5){
				//hMap =DynamicQueryUtil.getTT_MotCuaPhieuXuLyPhu(resultsCuaPhieuXuLyPhus);
			//}
			
			for (MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu : resultsCuaPhieuXuLyPhus) {
				//if(hMap ==null || hMap.get(motCuaPhieuXuLyPhu.getPhieuXuLyChinhId())== null){
					hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.findByPhieuXuLyPhuId(motCuaPhieuXuLyPhu.getId());	
				//}else{
					//hoSoThuTuc = hMap.get(motCuaPhieuXuLyPhu.getPhieuXuLyChinhId());
					//System.out.println("-----Phieu xu ly phu");
				//}
				
				PortletURL viewHoSoUrl4 = renderResponse.createRenderURL();
				viewHoSoUrl4.setParameter("jspPage", "/portlet/quanlyhs/hoso_detail.jsp");
				viewHoSoUrl4.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTuc.getId()));
				viewHoSoUrl4.setParameter(Constants.ID_PHIEU_XU_LY_PHU, String.valueOf(motCuaPhieuXuLyPhu.getId()));
				viewHoSoUrl4.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TPHS);
				viewHoSoUrl4.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, String.valueOf(hoSoThuTuc.getThuTucHanhChinhId()));
				%>
				<tr>
					<td class="text-center"><%= (index++) + searchContainer.getStart() %></td>
					<td class="text-center"><%=hoSoThuTuc.getMaBienNhan() %></td>
					<td class="text-center"><%=hoSoThuTuc.getMaSoHoSo() %></td>
					<td class="text-center"><%=DateUtils.dateToString("dd/MM/yyyy HH:mm", hoSoThuTuc.getNgayGuiHoSo())%></td>
					<td><span class="text-left"><%=hoSoThuTuc.getTenChuHoSo()%></span></td>
					<td class="text-left"><%=motCuaPhieuXuLyPhu.getTrichYeuNoiDung() %></td>
					<td class="text-left"><%=motCuaPhieuXuLyPhu.getGhiChu() %></td>
					<td class="text-center"><a href="<%=viewHoSoUrl4.toString() %>" class="aicon"><i class="icon20 iconm5 fa fa-pencil"></i></a></td>
				</tr>
				<%
			}
		}
	//phieu xu ly chinh
	} else if (Constants.LOAIPHIEUXULY_PHIEU_CHINH == tthcPhanNhomHoSo.getLoaiPhieuXuLy()) {
		TthcHoSoThuTuc hoSoThuTuc = null;
		TthcThuTucHanhChinh tthcThuTucHanhChinh = null;
		int index = 1;
		Hashtable<Long,TthcHoSoThuTuc> hMap = null;
		//TODO:
		//if(resultMcPhieuXyLyChinhs.size()>5){
			//hMap =DynamicQueryUtil.getTT_MotCuaPhieuXuLyChinh(resultMcPhieuXyLyChinhs);
		//}
		
		for (MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh : resultMcPhieuXyLyChinhs) {
			//fix performance get 1 query all 
			//if(hMap == null || hMap.get(motCuaPhieuXuLyChinh.getId())==null){
				
				hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(motCuaPhieuXuLyChinh.getHoSoThuTucId());
			//}else{
			//	hoSoThuTuc =hMap.get(motCuaPhieuXuLyChinh.getId());
				//System.out.println("gooo..............");
			//}
			tthcThuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(hoSoThuTuc.getThuTucHanhChinhId());
			
			PortletURL viewHoSoUrl5 = renderResponse.createRenderURL();
			viewHoSoUrl5.setParameter("jspPage", "/portlet/quanlyhs/hoso_detail.jsp");
			viewHoSoUrl5.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTuc.getId()));
			viewHoSoUrl5.setParameter(Constants.ID_PHIEU_XU_LY_CHINH, String.valueOf(motCuaPhieuXuLyChinh.getId()));
			viewHoSoUrl5.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TPHS);
			viewHoSoUrl5.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, String.valueOf(hoSoThuTuc.getThuTucHanhChinhId()));
			%>
			<tr>
				<td class="text-center"><%= (index++) + searchContainer.getStart() %></td>
				<td class="text-left"><%=tthcThuTucHanhChinh.getTenThuTuc() %></td>
				<td class="text-center">
					<%=hoSoThuTuc.getMaSoHoSo() %>
					<%
					if (hoSoThuTuc.getMaBienNhan() != null && hoSoThuTuc.getMaBienNhan().trim().length() > 0) {
						%>
						<br><%=hoSoThuTuc.getMaBienNhan().trim() %>
						<%
					}
					%>
				</td>
				<td class="text-center"><%=ConvertUtil.parsefulldateToString(hoSoThuTuc.getNgayGuiHoSo()) %></td>
				<td><span class="text-left"><%=hoSoThuTuc.getTenChuHoSo() %></span></td>
				<td class="text-left"><%=hoSoThuTuc.getTrichYeuNoiDung()%></td>
				<td class="text-left"><%=hoSoThuTuc.getGhiChu()%></td>
				<td class="text-center"><a href="<%=viewHoSoUrl5.toString() %>" class="aicon"><i class="icon20 iconm5 fa fa-pencil"></i></a></td>
			</tr>
		<%
		}
	} else {
			TthcHoSoThuTuc hoSoThuTuc = null;
			TthcThuTucHanhChinh tthcThuTucHanhChinh = null;
			int index = 1;
			for (int i=0; i < results.size(); i++) {
				hoSoThuTuc = (TthcHoSoThuTuc)results.get(i);
				tthcThuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(hoSoThuTuc.getThuTucHanhChinhId());
					
				PortletURL viewHoSoUrl = renderResponse.createRenderURL();
				viewHoSoUrl.setParameter("jspPage", "/portlet/quanlyhs/hoso_detail.jsp");
				viewHoSoUrl.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTuc.getId()));
				viewHoSoUrl.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TPHS);
				viewHoSoUrl.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, String.valueOf(hoSoThuTuc.getThuTucHanhChinhId()));
				
				MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = null;
				List<MotCuaPhieuXuLyPhu> liCuaPhieuXuLyPhus = null;
				if (QuanLyHoSoConfiguration.LOAD_DATABASE_MOTCUA_TRUE.compareToIgnoreCase(loadDataBaseMotCua) == 0) {
					 motCuaPhieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.findByHoSoThuTucId(hoSoThuTuc.getId());
				     liCuaPhieuXuLyPhus = MotCuaPhieuXuLyPhuLocalServiceUtil.findByThuTucHanhChinhIdAndToChucXuLy(motCuaPhieuXuLyChinh.getId());
				}
			%>
		<tr>
			<td class="text-center"><%= (index++) +  searchContainer.getStart() %></td>
			<td class="text-left"><%=tthcThuTucHanhChinh.getTenThuTuc() %></td>
			<td class="text-center"><%=hoSoThuTuc.getMaSoHoSo() %></td>
			<td class="text-center"><%=ConvertUtil.parsefulldateToString(hoSoThuTuc.getNgayGuiHoSo()) %></td>
			<td><span class="text-left"><%=hoSoThuTuc.getTenChuHoSo() %></span></td>
			<td class="text-left"><%=hoSoThuTuc.getTrichYeuNoiDung() %></td>
			<td class="text-left"><%=hoSoThuTuc.getGhiChu() %></td>
			<td class="text-center"><a href="<%=viewHoSoUrl.toString() %>" class="aicon"><i class="icon20 iconm5 fa fa-pencil"></i></a></td>
		</tr>
			<%
			}
		}
	%>
	</tbody> 
</table>
<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
<%
Calendar cal = Calendar.getInstance();

String ngayKiemTra = DateUtils.dateToString("dd/MM/yyyy HH:mm", cal.getTime());
%>
<portlet:actionURL var="phieuPhanCongDKVKiemTra" name="phieuPhanCongDKVKiemTra">
	<portlet:param name="<%=Constants.NAM_NHAP %>" value="<%=namNhap %>"/>
</portlet:actionURL>
	
<div id="div_WarningMsg" style="display: none;min-height: 130px !important;">
	<aui:form action="<%=phieuPhanCongDKVKiemTra.toString()%>" name="formDuocPhanCongDangKiemVien" id="formDuocPhanCongDangKiemVien" method="POST">
	<table width="100%">
		<tr>
			<td>
			<input type="text" name="ngayKiemTra" id="ngayKiemTra" value="<%=ngayKiemTra%>"
				onclick="gtCalendar('ngayKiemTra')" class="form-control-find-calendar"> 
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="button" class="egov-button-normal" value="Đồng ý" id="btnXacNhanThongTinDSXe"
					onclick="beforSummitForm('formDuocPhanCongDangKiemVien','<%=phieuPhanCongDKVKiemTra.toString()%>')">
				&nbsp;&nbsp; 
				<input type="button" class="egov-button-normal" value="Hủy" onclick="javascript: func_huyPheDuyet();" >
			</td>
		</tr>
	</table>
	</aui:form>
</div>

<portlet:renderURL var="urlPhanCongLanhDaoDonVi">
	<portlet:param name="<%=Constants.TEN_THU_TUC %>" value="<%=tenThuTuc %>"/>
	<portlet:param name="<%=Constants.LOAI_THU_TUC %>" value="<%=loaiThuTuc %>"/>
	<portlet:param name="<%=Constants.SO_HO_SO %>" value="<%=soHoSo %>"/>
	<portlet:param name="<%=Constants.NGAY_NOP_HO_SO_FROM %>" value="<%=ngayNopHsFrom %>"/>
	<portlet:param name="<%=Constants.NGAY_NOP_HO_SO_TO %>" value="<%=ngayNopHsTo %>"/>
	<portlet:param name="<%=Constants.DOANH_NGHIEP %>" value="<%=doanhNghiep %>"/>
	<portlet:param name="<%=Constants.NAM_NHAP %>" value="<%=namNhap %>"/>
	<portlet:param name="jspPage" value="/portlet/quanlyhs/thulyhs/lanhdaodonvi/lanhdao_phancongkiemtra.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="urlPhanCongToTiepNHan">
	<portlet:param name="<%=Constants.TEN_THU_TUC %>" value="<%=tenThuTuc %>"/>
	<portlet:param name="<%=Constants.LOAI_THU_TUC %>" value="<%=loaiThuTuc %>"/>
	<portlet:param name="<%=Constants.SO_HO_SO %>" value="<%=soHoSo %>"/>
	<portlet:param name="<%=Constants.NGAY_NOP_HO_SO_FROM %>" value="<%=ngayNopHsFrom %>"/>
	<portlet:param name="<%=Constants.NGAY_NOP_HO_SO_TO %>" value="<%=ngayNopHsTo %>"/>
	<portlet:param name="<%=Constants.DOANH_NGHIEP %>" value="<%=doanhNghiep %>"/>
	<portlet:param name="<%=Constants.NAM_NHAP %>" value="<%=namNhap %>"/>
	<portlet:param name="jspPage" value="/portlet/quanlyhs/thulyhs/totiepnhan/hs_phancong_nhieu_donvi_kt.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="urlKyXacNhanNhieuHoSo">
	<portlet:param name="<%=Constants.TEN_THU_TUC %>" value="<%=tenThuTuc %>"/>
	<portlet:param name="<%=Constants.LOAI_THU_TUC %>" value="<%=loaiThuTuc %>"/>
	<portlet:param name="<%=Constants.SO_HO_SO %>" value="<%=soHoSo %>"/>
	<portlet:param name="<%=Constants.NGAY_NOP_HO_SO_FROM %>" value="<%=ngayNopHsFrom %>"/>
	<portlet:param name="<%=Constants.NGAY_NOP_HO_SO_TO %>" value="<%=ngayNopHsTo %>"/>
	<portlet:param name="<%=Constants.DOANH_NGHIEP %>" value="<%=doanhNghiep %>"/>
	<portlet:param name="<%=Constants.NAM_NHAP %>" value="<%=namNhap %>"/>
	<portlet:param name="jspPage" value="/portlet/quanlyhs/thulyhs/truongbophantiepnhan/qlhs_hs_chocapgiaynhieuhs.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="urlThanhToanNhieuHoSo">
	<portlet:param name="<%=Constants.TEN_THU_TUC %>" value="<%=tenThuTuc %>"/>
	<portlet:param name="<%=Constants.LOAI_THU_TUC %>" value="<%=loaiThuTuc %>"/>
	<portlet:param name="<%=Constants.SO_HO_SO %>" value="<%=soHoSo %>"/>
	<portlet:param name="<%=Constants.NGAY_NOP_HO_SO_FROM %>" value="<%=ngayNopHsFrom %>"/>
	<portlet:param name="<%=Constants.NGAY_NOP_HO_SO_TO %>" value="<%=ngayNopHsTo %>"/>
	<portlet:param name="<%=Constants.DOANH_NGHIEP %>" value="<%=doanhNghiep %>"/>
	<portlet:param name="<%=Constants.NAM_NHAP %>" value="<%=namNhap %>"/>
	<portlet:param name="jspPage" value="/portlet/quanlyhs/thulyhs/tonghiepvu/thongbaonopphi.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="urlThanhToanDebitNote">
	<portlet:param name="<%=Constants.TEN_THU_TUC %>" value="<%=tenThuTuc %>"/>
	<portlet:param name="<%=Constants.LOAI_THU_TUC %>" value="<%=loaiThuTuc %>"/>
	<portlet:param name="<%=Constants.SO_HO_SO %>" value="<%=soHoSo %>"/>
	<portlet:param name="<%=Constants.NGAY_NOP_HO_SO_FROM %>" value="<%=ngayNopHsFrom %>"/>
	<portlet:param name="<%=Constants.NGAY_NOP_HO_SO_TO %>" value="<%=ngayNopHsTo %>"/>
	<portlet:param name="<%=Constants.DOANH_NGHIEP %>" value="<%=doanhNghiep %>"/>
	<portlet:param name="<%=Constants.NAM_NHAP %>" value="<%=namNhap %>"/>
	<portlet:param name="jspPage" value="/portlet/quanlyhs/thulyhs/tonghiepvu/listDebitNote.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="urlThongKeThanhToanDebitNote">
	<portlet:param name="<%=Constants.TEN_THU_TUC %>" value="<%=tenThuTuc %>"/>
	<portlet:param name="<%=Constants.LOAI_THU_TUC %>" value="<%=loaiThuTuc %>"/>
	<portlet:param name="<%=Constants.SO_HO_SO %>" value="<%=soHoSo %>"/>
	<portlet:param name="<%=Constants.NGAY_NOP_HO_SO_FROM %>" value="<%=ngayNopHsFrom %>"/>
	<portlet:param name="<%=Constants.NGAY_NOP_HO_SO_TO %>" value="<%=ngayNopHsTo %>"/>
	<portlet:param name="<%=Constants.DOANH_NGHIEP %>" value="<%=doanhNghiep %>"/>
	<portlet:param name="<%=Constants.NAM_NHAP %>" value="<%=namNhap %>"/>
	<portlet:param name="jspPage" value="/portlet/quanlyhs/thulyhs/tonghiepvu/thongkePhieuThu.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="urlGuiChungChiTheoPhieuThu">
	<portlet:param name="<%=Constants.TEN_THU_TUC %>" value="<%=tenThuTuc %>"/>
	<portlet:param name="<%=Constants.LOAI_THU_TUC %>" value="<%=loaiThuTuc %>"/>
	<portlet:param name="<%=Constants.SO_HO_SO %>" value="<%=soHoSo %>"/>
	<portlet:param name="<%=Constants.NGAY_NOP_HO_SO_FROM %>" value="<%=ngayNopHsFrom %>"/>
	<portlet:param name="<%=Constants.NGAY_NOP_HO_SO_TO %>" value="<%=ngayNopHsTo %>"/>
	<portlet:param name="<%=Constants.DOANH_NGHIEP %>" value="<%=doanhNghiep %>"/>
	<portlet:param name="<%=Constants.NAM_NHAP %>" value="<%=namNhap %>"/>
	<portlet:param name="jspPage" value="/portlet/quanlyhs/thulyhs/tonghiepvu/guiChungChiTheoPhieuThu.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="urlSoatXetNhieuHoSo">
	<portlet:param name="<%=Constants.TEN_THU_TUC %>" value="<%=tenThuTuc %>"/>
	<portlet:param name="<%=Constants.LOAI_THU_TUC %>" value="<%=loaiThuTuc %>"/>
	<portlet:param name="<%=Constants.SO_HO_SO %>" value="<%=soHoSo %>"/>
	<portlet:param name="<%=Constants.NGAY_NOP_HO_SO_FROM %>" value="<%=ngayNopHsFrom %>"/>
	<portlet:param name="<%=Constants.NGAY_NOP_HO_SO_TO %>" value="<%=ngayNopHsTo %>"/>
	<portlet:param name="<%=Constants.DOANH_NGHIEP %>" value="<%=doanhNghiep %>"/>
	<portlet:param name="<%=Constants.NAM_NHAP %>" value="<%=namNhap %>"/>
	<portlet:param name="jspPage" value="/portlet/quanlyhs/thulyhs/lanhdaodonvi/lanhdao_hoso_soatxet_nhieubbkt.jsp"/>
</portlet:renderURL>
		<%
		LogFactoryUtil.getLog(DangKiemAction.class).info( "===idPhanNhomHoSo===" + idPhanNhomHoSo);
		
		if (idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("14") == 0) {
		%>
			<div class="col-xs-3 col-sm-3 col-md-2" style="margin-left: 26px">
				<button type="button" class="fa-right bt btxanhduong btn btn-default" onclick="window.location.href = '<%=urlPhanCongToTiepNHan%>'"><liferay-ui:message key="vn.gt.dk.qlhs.button.to.tiep.nhan.phancong" /></button>
			</div>			
		<%
		} else if (idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("16") == 0) {
			
			Map<String,String> listMap= new HashMap<String,String>();
			renderRequest.getPortletSession().setAttribute("listMap", listMap);			
		%>
			<div class="col-xs-3 col-sm-3 col-md-4">
				<button type="button" class="btnThuLyHS form-control" onclick="window.location.href = '<%=urlPhanCongLanhDaoDonVi%>'"><liferay-ui:message key="vn.gt.dk.qlhs.button.lanhdao.donvi.phancong" /></button>
				<button type="button" class="btnThuLyHS form-control" onclick="showThongBaoMsg()">Xem lịch đã phân công</button>
			</div>
			<%
		} else if (idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("13") == 0) {
			%>
			<div class="col-xs-3 col-sm-3 col-md-2" style="margin-left: -34px">
				<button type="button" class="fa-right bt btxanhduong btn btn-default" onclick="window.location.href = '<%=urlKyXacNhanNhieuHoSo%>'"><liferay-ui:message key="vn.gt.dk.qlhs.button.truongbophantiepnhan.phancongnhieuhoso" /></button>
			</div>
			<%
		} else if (idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("51") == 0) {
			%>
			<div class="col-xs-3 col-sm-3 col-md-10">
				<button type="button" class="fa-right bt btxanhduong btn btn-default" onclick="window.location.href = '<%=urlThanhToanNhieuHoSo%>'" style="display: none;"><liferay-ui:message key="vn.gt.dk.qlhs.button.tonghiepvu.thongbaonopphi.nhieuhoso" /></button>
			
				<button type="button" class="btnThuLyHS form-control" onclick="window.location.href = '<%=urlThanhToanDebitNote%>'">Thanh toán theo phiếu</button>
			
				<button type="button" class="btnThuLyHS form-control" onclick="window.location.href = '<%=urlThongKeThanhToanDebitNote%>'">Thống kê HĐĐT theo phiếu</button>				
			</div>			
			<%
		} else if (idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("47") == 0) {
			//Chờ cấp chứng chỉ chất lượng
			%>
			<div class="col-xs-3 col-sm-3 col-md-2" style="margin-left: 16px">
				<button type="button" class="fa-right bt btxanhduong btn btn-default" onclick="window.location.href = '<%=urlGuiChungChiTheoPhieuThu%>'"><liferay-ui:message key="vn.gt.dk.qlhs.button.tonghiepvu.guichungchi.xemdanhsach" /></button>
			</div>
			<%
		} else if (idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("24") == 0) {
			
			PortletURL viewHoSoUrl5 = renderResponse.createRenderURL();
			viewHoSoUrl5.setParameter("jspPage", "/portlet/report_export_themmoi.jsp");
			viewHoSoUrl5.setParameter("lstConfirmedInspectionId", lstConfirmedInspectionId);
			viewHoSoUrl5.setParameter("type", "BienBanGhiNhanKetQuaKiemTraList");
			
			%>
			<a href="<%=viewHoSoUrl5.toString()%>"><button class="btnThuLyHS form-control" type="button">Biên bản ghi nhận kết quả kiểm tra</button></a>
			<%
		} else if (idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("19") == 0) {
			%>
			<a href="<%=urlSoatXetNhieuHoSo.toString()%>"><button class="btnThuLyHS form-control" type="button">Soát xét nhiều BBKT</button></a>
			<%
		}
		%>
    <br><br><br>
<script type="text/javascript">
function showThongBaoMsg() {
	console.log("==showThongBaoMsg ==");
	$("#div_WarningMsg").dialog({
		title:'Chọn ngày dự kiến kiểm tra',
        resizable: false,
        modal: true,
        width: '400px',
        
        closeOnEscape: false,
        open: function() {
            jQuery('.ui-widget-overlay').bind('click', function() {
                $('#div_WarningMsg').dialog('close');
            });
        }
	});
}

function func_huyPheDuyet() {
	 $('#div_WarningMsg').dialog('close');
}
function func_xacnhanPheDuyet() {
	func_huyPheDuyet();
}

function beforSummitForm(idForm, url) {
	console.log('=beforSummitForm=' + idForm);
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

function reportNewPage(urlFile) {
	window.open(urlFile);
};
</script>