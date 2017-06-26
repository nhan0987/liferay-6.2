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

String doiTuong = null;
if (loaiThuTuc.contains("DCX"))
{
	doiTuong = "DC";
}
else if (loaiThuTuc.contains("XDD"))
{
	doiTuong = "XD";
}
else if (loaiThuTuc.contains("XBB"))
{
	doiTuong = "BN";
} 
else if (loaiThuTuc.contains("XCG"))
{
	doiTuong = "OT";
}
else if (loaiThuTuc.contains("XCD"))
{
	doiTuong = "MC";
}
else if (loaiThuTuc.contains("XMY"))
{
	doiTuong = "XM";
}	
SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, portletUrl, null, "");

List<CertificateRecord> reCertificateRecords = null;

long longTotal = 0;

if(organizationId > 0) {
	reCertificateRecords = CertificateRecordLocalServiceUtil.findCertificateRecord("dkvn_thutuchanhchinh", soChungChi, organizationId, tenThuTuc, doiTuong, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep,  ConvertUtil.convertToInt(namNhap), searchContainer.getStart(), searchContainer.getEnd());
	longTotal = CertificateRecordLocalServiceUtil.countCertificateRecord("dkvn_thutuchanhchinh", soChungChi, organizationId, tenThuTuc, doiTuong, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep,  ConvertUtil.convertToInt(namNhap));

	searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
	searchContainer.setResults(reCertificateRecords);
}
if (reCertificateRecords == null) { 
	reCertificateRecords = new ArrayList<CertificateRecord>(); 
}
%>
<table class="wd-table table">
	<thead>
		<tr>
			<th>STT</th>
			<th><liferay-ui:message key="vn.gt.dk.chungchi.searchcontentfind.sochungchi" /></th>
			<th><liferay-ui:message key="vn.gt.dk.chungchi.searchcontentfind.ngayky" /></th>
			<th><liferay-ui:message key="vn.gt.dk.chungchi.searchcontentfind.tendoanhnghiep" /></th>
			<th><liferay-ui:message key="vn.gt.dk.chungchi.searchcontentfind.thaotac" /></th>
		</tr>
	</thead>
	<tbody>
	<%
	
		RegisteredInspection registeredInspection = null;
		int index = 1;
		for (CertificateRecord certificateRecord : reCertificateRecords) {
			
			registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(certificateRecord.getDossierId());
			PortletURL viewHoSoUrl4 = renderResponse.createRenderURL();
			viewHoSoUrl4.setParameter("jspPage", "/portlet/chungchi/certificate_report_export.jsp");
			viewHoSoUrl4.setParameter(Constants.TTHC_NOIDUNGHOSO_ID, String.valueOf(certificateRecord.getAttachedFile()));
			viewHoSoUrl4.setParameter(Constants.CERTIFICATE_RECORD_ID, String.valueOf(certificateRecord.getId()));
			%>
			<tr>
				<td class="text-center"><%= (index++) + searchContainer.getStart() %></td>
				<td class="text-center"><%=certificateRecord.getCertificateNumber() %></td>
				<td class="text-center"><%=DateUtils.dateToString("dd/MM/yyyy HH:mm", certificateRecord.getSignDate())%></td>
				<td><span class="text-left"><%=Validator.isNotNull(registeredInspection) ? registeredInspection.getImporterName() : ""%></span></td>
				<td class="text-center"><a href="<%=viewHoSoUrl4.toString() %>" class="aicon"><i class="icon20 iconm5 fa fa-pencil"></i></a></td>
			</tr>
			<%
		}
	%>
	</tbody> 
</table>
<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
<br><br><br>
