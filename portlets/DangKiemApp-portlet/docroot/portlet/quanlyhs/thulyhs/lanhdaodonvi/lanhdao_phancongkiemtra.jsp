<%@page import="vn.dtt.gt.dk.utils.DataKeyItems"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam"%>
<%
System.out.println("===============/portlet/quanlyhs/thulyhs/lanhdaodonvi/lanhdao_phancongkiemtra.jsp===========");
String loaiThuTuc = ParamUtil.getString(request, Constants.LOAI_THU_TUC);
String tenThuTuc = ParamUtil.getString(request, Constants.TEN_THU_TUC);
String soHoSo = ParamUtil.getString(request, Constants.SO_HO_SO);
String doanhNghiep = ParamUtil.getString(request, Constants.DOANH_NGHIEP);
String ngayNopHsFrom = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_FROM);
String ngayNopHsTo = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_TO);
String namNhap = ParamUtil.getString(request, Constants.NAM_NHAP);
String soDKKT = ParamUtil.getString(request, Constants.SO_DKKT);
String doiDKKT = ParamUtil.getString(request, Constants.DOI_DKKT);

long userId = 0;
userId = PortalUtil.getUserId(request);
List<CorporationTeam> liCorporationTeams = new ArrayList<CorporationTeam>();
List<CorporationInspector> lCorporationInspectors= new ArrayList<CorporationInspector>();
List<DmDataItem> dmDataItemDKVs=DmDataItemLocalServiceUtil.findByDataGroupCodeNameAndDataItemAlterName(DanhMucKey.CORPORATION, DataKeyItems.KIEM_TRA);

String listMapDangKiemVien = ParamUtil.getString(request, Constants.LIST_DANG_KIEM_VIEN_);

%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<%@ include file="/portlet/quanlyhs/thulyhs/lanhdaodonvi/lanhdao_phancong_find.jsp"%>
		<%@ include file="/portlet/quanlyhs/thulyhs/lanhdaodonvi/lanhdao_phancong_result.jsp"%>
		<%@ include file="/portlet/quanlyhs/thulyhs/lanhdaodonvi/lanhdao_phancong_kiemtra.jsp"%>
	</div>
</div>