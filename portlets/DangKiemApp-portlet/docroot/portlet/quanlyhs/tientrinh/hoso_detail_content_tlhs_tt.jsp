<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Hashtable"%>
<%@page import="vn.dtt.gt.dk.dynamicquery.CorporationInspectorDynamicQueryUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.FormatData"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@ include file="/portlet/init.jsp"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<div id="soatXetHoSoDiv" style="display: block;background: #ffffff;">
	<%
	String hoSoThuTucId = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	PortletURL portletUrl = renderResponse.createRenderURL();
	portletUrl.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
	portletUrl.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TT);
	
	TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(ConvertUtil.convertToLong(hoSoThuTucId));
	
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 1000, portletUrl, null, "");
	List<MotCuaDienBienHoSo> liMotCuaDienBienHoSos = MotCuaDienBienHoSoLocalServiceUtil.findMotCuaDienBienHoSoByPhieuXuLyChinh(ConvertUtil.convertToLong(hoSoThuTucId), 0, 1000);
	int total = MotCuaDienBienHoSoLocalServiceUtil.countMotCuaDienBienHoSoByPhieuXuLyChinh(ConvertUtil.convertToLong(hoSoThuTucId));
	searchContainer.setResults(liMotCuaDienBienHoSos);
	searchContainer.setTotal(total);
	%>
	<p style="text-align: left;"><span>Tiến trình xử lý hồ sơ <%=Validator.isNotNull(hoSoThuTuc) ? hoSoThuTuc.getMaSoHoSo() : "" %></span></p>
	<table class="wd-table table">
		<thead>
			<tr>
				<th>STT</th>
				<th width="20%">Người xử lý</th>
				<th width="20%">Ngày xử lý</th>
				<th width="50%">Nội dung xử lý</th>
			</tr>
		</thead>
		<tbody>
			<%
			int i = 1;
			CorporationInspector corporationInspector = null;
			String data = "Hệ thống";
			 Hashtable<Long,CorporationInspector> corMap=null;
			 //System.out.println("get cache....+"+liMotCuaDienBienHoSos.size());
			 if(liMotCuaDienBienHoSos != null && liMotCuaDienBienHoSos.size()>5){
				 //System.out.println("ádgasgget cache....+"+liMotCuaDienBienHoSos.size());
				 //corMap = CorporationInspectorDynamicQueryUtil.get_CorporationInspector(liMotCuaDienBienHoSos);
			 }
			
			for (MotCuaDienBienHoSo motCuaDienBienHoSo : liMotCuaDienBienHoSos) {
				if(motCuaDienBienHoSo.getTrangThaiTruocId()>0){
					if(corMap != null && corMap.get(motCuaDienBienHoSo.getNguoiXuLy()) != null){
						corporationInspector =corMap.get(motCuaDienBienHoSo.getNguoiXuLy());
						//System.out.println("cache....");
					}else{
						corporationInspector = CorporationInspectorLocalServiceUtil.findByInspectorId(motCuaDienBienHoSo.getNguoiXuLy());
						//System.out.println("NOT cache....");
					}
					if (corporationInspector != null) {
						data = corporationInspector.getContactcode() + "=" + corporationInspector.getInspectorName();
					}else{
					data = "Hệ thống";
					}
				%>
					<tr>
						<td class="text-center"><%=(searchContainer.getStart() + i) %></td>
						<td class="text-left"><%=data %></td>
						<td class="text-center"><%=FormatData.parseDateToTring(motCuaDienBienHoSo.getNgayXuLy()) %></td>
						<td class="text-left"><%=motCuaDienBienHoSo.getHanhDongXuLy() %></td>
					</tr>
					<%
					i++;
				}
			}
			%>
		</tbody>
	</table>

</div>