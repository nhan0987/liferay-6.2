<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Arrays"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo"%>
<%@page import="vn.dtt.gt.dk.utils.format.FormatData"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcBieuMauHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"%>
<%@ include file="/portlet/init.jsp"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
String hoSoThuTucId = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
String phieuXuLyPhuId = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY_PHU);
TthcHoSoThuTuc hoSoThuTuc = null;
hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(ConvertUtil.convertToLong(hoSoThuTucId));

List<TthcBieuMauHoSo> lBieuMauHoSos = null;
if (Validator.isNotNull(hoSoThuTuc)) {
	lBieuMauHoSos = TthcBieuMauHoSoLocalServiceUtil.findTthcBieuMauHoSoByThuTucHanhChinhId(hoSoThuTuc.getThuTucHanhChinhId());
}

if (lBieuMauHoSos != null && lBieuMauHoSos.size() > 0) {
%>
	<ul class="hs1">
	<%
	int soTaiLieu = 0;
	List<TthcNoidungHoSo> liNoidungHoSos = null;
	List<TthcNoidungHoSo> liNoidungHoSoMaTuSinh = null;
	for (TthcBieuMauHoSo bieuMauHoSo : lBieuMauHoSos) {
		List<String> toppings = Arrays.asList("THONGTINXENK", "THONGTINDONGCO", "BANKECHITIET", "XACNHANDANGKY", "HOADONTHUONGMAI", "GIAYTOKHAC", "TAILIEUKYTHUAT", 
				"TAILIEUKHITHAI", "GCNKIEULOAI", "GCNCHATLUONGNSX", "GCNDANGKYXENK","BANDANGKY","XACNHANKEHOACH");
		TthcThanhPhanHoSo tthcThanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.findByThuTucHanhChinhIdAndBieuMauHoSoId(hoSoThuTuc.getThuTucHanhChinhId(), bieuMauHoSo.getId());
		if(toppings.contains(tthcThanhPhanHoSo.getMauTrucTuyen())){
		
		liNoidungHoSoMaTuSinh =  TthcNoidungHoSoLocalServiceUtil.findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucIdLanCuoi(ConvertUtil.convertToLong(hoSoThuTucId), bieuMauHoSo.getId());

		if (liNoidungHoSoMaTuSinh.size() == 1) {
			soTaiLieu = TthcNoidungHoSoLocalServiceUtil.countByBieuMauHoSoIdAndHoSoThuTucId(ConvertUtil.convertToLong(hoSoThuTucId), bieuMauHoSo.getId());
			liNoidungHoSos = TthcNoidungHoSoLocalServiceUtil.findTthcBieuMauHoSoByThuTucHanhChinhIdFinderEnd(ConvertUtil.convertToLong(hoSoThuTucId), bieuMauHoSo.getId());
			LogFactoryUtil.getLog(DangKiemAction.class).debug("-===========soTaiLieu::" + soTaiLieu);
			LogFactoryUtil.getLog(DangKiemAction.class).debug("-===========liNoidungHoSos::" + liNoidungHoSos.size());
			if(liNoidungHoSos!=null&&liNoidungHoSos.size()>0){
			if (soTaiLieu > 1) {
				%>
					
					<li class="xanh bgtb1"><a href="#" class="textdanhap"><i
						class="boder1_xl mar_r10 xanhla fa fa-check"></i><i
						class="mar_r10 xanh fa fa-circle"></i><%=bieuMauHoSo.getTenBieuMau() %><span
						class="m5 badge pull-right"><%=soTaiLieu %></span></a>
					<ul class="marl20">
						<li>
							<table class="wd-table table">
								<thead>
									<tr>
										<th><liferay-ui:message key="vn.gt.dk.qlhs.hoso.detail.content.tphs.lan" /></th>
										<th><liferay-ui:message key="vn.gt.dk.qlhs.hoso.detail.content.tphs.noidungthanhphanhoso" /></th>
										<th><liferay-ui:message key="vn.gt.dk.qlhs.hoso.detail.content.tphs.ngaynop" /></th>
										<th><liferay-ui:message key="vn.gt.dk.qlhs.hoso.detail.content.tphs.ngaythongbao" /></th>
									</tr>
								</thead>
								<tbody>
									<%
									int index = 1;
									for (TthcNoidungHoSo tthcNoidungHoSo : liNoidungHoSos) {
										%>
										<portlet:renderURL var="xemNoiDungHoSoURL">
								            <portlet:param name="jspPage" value="/portlet/quanlyhs/hoso_detail.jsp" />
								            <portlet:param name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%=hoSoThuTucId%>" />
								            <portlet:param name="<%=Constants.TTHC_NOIDUNGHOSO_ID %>" value="<%=String.valueOf(tthcNoidungHoSo.getId())%>" />
								            <portlet:param name="<%=Constants.TTHC_BIEUMAUHOSO_ID %>" value="<%=String.valueOf(bieuMauHoSo.getId())%>" />
								            <portlet:param name="<%=Constants.TTHC_THUTUCHANHCHINH_ID %>" value="<%=String.valueOf(hoSoThuTuc.getThuTucHanhChinhId())%>" />
								            <portlet:param name="<%=Constants.TTHC_BIEUMAUHOSO_MABIEUMAU %>" value="<%=String.valueOf(bieuMauHoSo.getMaBieuMau())%>" />
								            <portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TPHS2 %>" />
								            <portlet:param name="<%=Constants.ID_PHIEU_XU_LY_PHU %>" value="<%=phieuXuLyPhuId %>" />
								            <portlet:param name="TAB_CLICK" value="TAB_LAST" />
								        </portlet:renderURL>
										<tr>
											<td class="text-center"><%=index++ %></td>
											<td class="text-center"><a href="<%=xemNoiDungHoSoURL.toString()%>"><span class="textxanhduong"><%=tthcNoidungHoSo.getTenTaiLieu() %></span></a></td>
											<td class="text-center"><%=FormatData.parseDateToTringType3(tthcNoidungHoSo.getNgayTao()) %></td>
											<td class="text-center"><%=FormatData.parseDateToTringType3(tthcNoidungHoSo.getNgayGuiNhan()) %></td>
										</tr>
										<%
									}
									%>
								</tbody>
							</table>
						</li>
					</ul>
				</li>
				<%
				} else {
					LogFactoryUtil.getLog(DangKiemAction.class).debug("====soTaiLieu===" + soTaiLieu);
					if (soTaiLieu == 1) {
					%>
					<portlet:renderURL var="xemNoiDungHoSoURL1">
			            <portlet:param name="jspPage" value="/portlet/quanlyhs/hoso_detail.jsp" />
			            <portlet:param name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%=hoSoThuTucId%>" />
			            <portlet:param name="<%=Constants.TTHC_NOIDUNGHOSO_ID %>" value="<%=String.valueOf(liNoidungHoSos.get(0).getId())%>" />
			            <portlet:param name="<%=Constants.TTHC_BIEUMAUHOSO_ID %>" value="<%=String.valueOf(bieuMauHoSo.getId())%>" />
			            <portlet:param name="<%=Constants.TTHC_THUTUCHANHCHINH_ID %>" value="<%=String.valueOf(hoSoThuTuc.getThuTucHanhChinhId())%>" />
			            <portlet:param name="<%=Constants.TTHC_BIEUMAUHOSO_MABIEUMAU %>" value="<%=String.valueOf(bieuMauHoSo.getMaBieuMau())%>" />
			            <portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TPHS2 %>" />
			            <portlet:param name="<%=Constants.ID_PHIEU_XU_LY_PHU %>" value="<%=phieuXuLyPhuId %>" />
			            <portlet:param name="TAB_CLICK" value="TAB_LAST" />
			        </portlet:renderURL>
					<li><a href="<%=xemNoiDungHoSoURL1.toString()%>" class="textdanhap"><i class="boder1_xl mar_r10 xanhla fa fa-check"></i><i class="mar_r10 xanh fa fa-circle"></i>
							<%=bieuMauHoSo.getTenBieuMau() %>
						</a>
					</li>
					<%
					} else {
						%>
						<li class="xanh">
							<a class="textacti"><i class="boder1_xam mar_r10 xam fa fa-check"></i>
							<i class="mar_r10 xam fa fa-circle"></i>
								<%=bieuMauHoSo.getTenBieuMau() %>
							</a>
						</li>
						<%
					}
				}
			}
		} else {
			//Bieu mau.
			if (liNoidungHoSoMaTuSinh.size() > 1) {
				%>
				<li class="xanh bgtb1"><a href="#" class="textdanhap">
				<i class="boder1_xl mar_r10 xanhla fa fa-check"></i><i class="mar_r10 xanh fa fa-circle"></i>
				<%=bieuMauHoSo.getTenBieuMau() %>
					<span
						class="m5 badge pull-right"></span></a>
					<ul class="marl20">
				<%  
				
			} else {
			%>
			<li class="xanh bgtb1"><a href="#" class="textacti"><i
						class="boder1_xam mar_r10 xam fa fa-check"></i><i
						class="mar_r10 xam fa fa-circle"></i><%=bieuMauHoSo.getTenBieuMau() %><span
						class="m5 badge pull-right"></span></a>
					<ul class="marl20">
			<%  
			}
			%>
			
			<%
					// Duyet tung ma tu sinh.
					for (TthcNoidungHoSo tthcNoidungHoSo : liNoidungHoSoMaTuSinh) {
						liNoidungHoSos = TthcNoidungHoSoLocalServiceUtil.findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinder(ConvertUtil.convertToLong(hoSoThuTucId), bieuMauHoSo.getId(), tthcNoidungHoSo.getMaTuSinh());
					    if (liNoidungHoSos.size() > 1) {
						%>
							<li><a href="#"><i class="mar_r10 xanh fa fa-circle"></i><%=tthcNoidungHoSo.getTenTaiLieu() %></a><span class="m5 badge pull-right"><%=liNoidungHoSos.size() %></span></li>
						    	<ul class="marl20">
									<li>
										<table class="wd-table table">
											<thead>
												<tr>
													<th><liferay-ui:message key="vn.gt.dk.qlhs.hoso.detail.content.tphs.lan" /></th>
													<th><liferay-ui:message key="vn.gt.dk.qlhs.hoso.detail.content.tphs.noidungthanhphanhoso" /></th>
													<th><liferay-ui:message key="vn.gt.dk.qlhs.hoso.detail.content.tphs.ngaynop" /></th>
													<th><liferay-ui:message key="vn.gt.dk.qlhs.hoso.detail.content.tphs.ngaythongbao" /></th>
												</tr>
											</thead>
											<tbody>
											<%
											int index2 = 1;
											for (TthcNoidungHoSo tthcNoidungHoSo2 : liNoidungHoSos) {
												%>
												<portlet:renderURL var="xemNoiDungHoSoURL4">
										            <portlet:param name="jspPage" value="/portlet/quanlyhs/hoso_detail.jsp" />
										            <portlet:param name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%=hoSoThuTucId%>" />
										            <portlet:param name="<%=Constants.TTHC_NOIDUNGHOSO_ID %>" value="<%=String.valueOf(tthcNoidungHoSo2.getId())%>" />
										            <portlet:param name="<%=Constants.TTHC_BIEUMAUHOSO_ID %>" value="<%=String.valueOf(bieuMauHoSo.getId())%>" />
										            <portlet:param name="<%=Constants.TTHC_THUTUCHANHCHINH_ID %>" value="<%=String.valueOf(hoSoThuTuc.getThuTucHanhChinhId())%>" />
										            <portlet:param name="<%=Constants.TTHC_BIEUMAUHOSO_MABIEUMAU %>" value="<%=String.valueOf(bieuMauHoSo.getMaBieuMau())%>" />
										            <portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TPHS2 %>" />
										            <portlet:param name="<%=Constants.ID_PHIEU_XU_LY_PHU %>" value="<%=phieuXuLyPhuId %>" />
										            <portlet:param name="TAB_CLICK" value="TAB_LAST" />
										        </portlet:renderURL>
												<tr>
													<td class="text-center"><%=index2++ %></td>
													<td class="text-center"><a href="<%=xemNoiDungHoSoURL4.toString()%>"><span class="textxanhduong"><%=tthcNoidungHoSo2.getTenTaiLieu() %></span></a></td>
													<td class="text-center"><%=FormatData.parseDateToTringType3(tthcNoidungHoSo2.getNgayTao()) %></td>
													<td class="text-center"><%=FormatData.parseDateToTringType3(tthcNoidungHoSo2.getNgayGuiNhan()) %></td>
													
												</tr>
												<%
											}
											%>
											</tbody>
										</table>
									</li>
								</ul>
						    	<%
					    } else {
					    	if (liNoidungHoSos.size() == 1) {
					    		%>
					    		<portlet:renderURL var="xemNoiDungHoSoURL2">
						            <portlet:param name="jspPage" value="/portlet/quanlyhs/hoso_detail.jsp" />
						            <portlet:param name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%=hoSoThuTucId%>" />
						            <portlet:param name="<%=Constants.TTHC_NOIDUNGHOSO_ID %>" value="<%=String.valueOf(liNoidungHoSos.get(0).getId())%>" />
						            <portlet:param name="<%=Constants.TTHC_BIEUMAUHOSO_ID %>" value="<%=String.valueOf(bieuMauHoSo.getId())%>" />
						            <portlet:param name="<%=Constants.TTHC_THUTUCHANHCHINH_ID %>" value="<%=String.valueOf(hoSoThuTuc.getThuTucHanhChinhId())%>" />
						            <portlet:param name="<%=Constants.TTHC_BIEUMAUHOSO_MABIEUMAU %>" value="<%=String.valueOf(bieuMauHoSo.getMaBieuMau())%>" />
						            <portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TPHS2 %>" />
						            <portlet:param name="<%=Constants.ID_PHIEU_XU_LY_PHU %>" value="<%=phieuXuLyPhuId %>" />
						            <portlet:param name="TAB_CLICK" value="TAB_LAST" />
						        </portlet:renderURL>
								<li><a href="<%=xemNoiDungHoSoURL2 %>" class="textdanhap"><i class="mar_r10 xanh fa fa-circle"></i><%=tthcNoidungHoSo.getTenTaiLieu() %></a></li>
								<%
					    	} else {
					    		%>
								<li><a href="#"><i class="mar_r10 xanh fa fa-circle"></i><%=tthcNoidungHoSo.getTenTaiLieu() %></a></li>
								<%
					    	}
					    }
					}
			%>
					</ul>
			<%
		}
	}
	}
	%>
	</ul>
	<div class="boxnoidung">
		<h5 class="tieude"><liferay-ui:message key="vn.gt.dk.qlhs.hoso.detail.content.tphs.noidung.chitiet" /></h5>
		<div class="vungxuly">
			<%
		String tabclick = ParamUtil.getString(request, "TAB_CLICK");
		if (tabclick.compareToIgnoreCase("TAB_LAST") == 0) {
		%>
			<jsp:include page="/portlet/report_export.jsp"/>
			<%
		}
			%>
		</div>
	</div>
<%
}
%>
