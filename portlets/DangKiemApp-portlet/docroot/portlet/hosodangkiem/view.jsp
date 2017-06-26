<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu"%>
<%@page import="vn.dtt.gt.dk.report.ReportConstant"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="java.util.List"%>
<%@ include file="/portlet/init.jsp"%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java"%>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/style.css">
<%
	int countHoSo = 0;
	List<TthcPhanNhomHoSo> liPhanNhomHoSos = new ArrayList<TthcPhanNhomHoSo>();
	
		liPhanNhomHoSos = TthcPhanNhomHoSoLocalServiceUtil.findTinNhanh("1,2,3,4,5,6,7,8,9,10");
	
%>
	<h2>HỒ SƠ TRỰC TUYẾN</h2>
	<div class="w30">
		<div class="box">
			<h3><i class="icon1"></i>Tổ hành chính công trực tuyến</h3>
			<ul>
				<%
					for (TthcPhanNhomHoSo tthcPhanNhomHoSo : liPhanNhomHoSos) {
						
						if (tthcPhanNhomHoSo.getLoaiPhieuXuLy() == Constants.LOAIPHIEUXULY_PHIEU_CHINH) {
							countHoSo = TthcHoSoThuTucLocalServiceUtil.countHoSoThuTucByTinNhanh(tthcPhanNhomHoSo.getId());
						} else if (tthcPhanNhomHoSo.getLoaiPhieuXuLy() == Constants.LOAIPHIEUXULY_PHIEU_PHU) {
							countHoSo = MotCuaPhieuXuLyPhuLocalServiceUtil.findByPhanNhomHoSoId(tthcPhanNhomHoSo.getId()).size();
						}
							%>
							<li><%=tthcPhanNhomHoSo.getTenPhanNhom() %><span><%=countHoSo %></span></li>	
							<%
						}
				%>
			</ul>
		</div>
	</div>
	
	<div class="w30">
	<%
	
	List<DmDataItem> lstDataItems = DmDataItemLocalServiceUtil.findByDataGroupIdAndLevelAndAlterName(ReportConstant.CORPORATION, 1, "KIEMTRA");
	if(lstDataItems != null && lstDataItems.size() > 0){
		for(DmDataItem dataItem : lstDataItems){
			%>
		<div class="box" id="doi_<%=dataItem.getName().replace("Đội", "").trim()%>" <%=dataItem.getCode0().equals("02") ? "style='display:'" : "style='display: none'" %>>
		<h3><i class="icon2"></i>Đội kiểm tra <%=dataItem.getName().replace("Đội", "").trim()%></h3>
			<ul>
				<li>Phân công kiểm tra<span><%=ConfirmedInspectionLocalServiceUtil.findByPhieuXuLyPhuIdAndCorporationId(16, dataItem.getCode0()).size() %></span></li>
				<li>Đề nghị thử nghiệm an toàn<span><%=InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuIdAndCorporationIdAndMarkUp(17, dataItem.getCode0(), 2, 0, 0).size() %></span></li>
				<li>Đề nghị thử nghiệm khi thải<span><%=InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuIdAndCorporationIdAndMarkUp(27, dataItem.getCode0(), 0, 2, 0).size() %></span></li>
				<li>Đề nghị giám định<span><%=InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuIdAndCorporationIdAndMarkUp(18, dataItem.getCode0(), 0, 0, 2).size() %></span></li>
				<li>Đề nghị soát xét<span><%=InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuIdAndCorporationId(19, dataItem.getCode0()).size() %></span></li>
				<li>Yêu cầu soát xét lại<span><%=InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuIdAndCorporationId(20, dataItem.getCode0()).size() %></span></li>
				<li>Tổ nghiệp vụ trả về<span><%=InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuIdAndCorporationId(21, dataItem.getCode0()).size() %></span></li>
				<li>Sửa đổi bổ sung GCN<span>0</span></li>
				<li>Kết quả giải quyết HS theo lĩnh vực (1)<span>0</span></li>
				<li>Được phân công<span><%=ConfirmedInspectionLocalServiceUtil.findByPhieuXuLyPhuIdAndCorporationId(24, dataItem.getCode0()).size() %></span></li>
				<li>Đã kiểm tra<span><%=InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuIdAndCorporationId(25, dataItem.getCode0()).size() %></span></li>
				<li>Hồ sơ trả lại<span><%=InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuIdAndCorporationId(26, dataItem.getCode0()).size() %></span></li>
				<li>Đã hoàn thiện<span><%=InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuIdAndCorporationId(29, dataItem.getCode0()).size() %></span></li>
			</ul>
		</div>
	<%
		}
	}
	%>
	</div>
		<%
		liPhanNhomHoSos = TthcPhanNhomHoSoLocalServiceUtil.findTinNhanh("61,62,63,64,65,66");
		%>
	<div class="w30">
		<div class="box">
			<h3><i class="icon3"></i>Tổ nghiệp vụ</h3>
			<ul>
				<%
					for (TthcPhanNhomHoSo tthcPhanNhomHoSo : liPhanNhomHoSos) {
						
						if (tthcPhanNhomHoSo.getLoaiPhieuXuLy() == Constants.LOAIPHIEUXULY_PHIEU_CHINH) {
							countHoSo = TthcHoSoThuTucLocalServiceUtil.countHoSoThuTucByTinNhanh(tthcPhanNhomHoSo.getId());
						} else if (tthcPhanNhomHoSo.getLoaiPhieuXuLy() == Constants.LOAIPHIEUXULY_PHIEU_PHU) {
							countHoSo = MotCuaPhieuXuLyPhuLocalServiceUtil.findByPhanNhomHoSoId(tthcPhanNhomHoSo.getId()).size();
						}
							%>
							<li><%=tthcPhanNhomHoSo.getTenPhanNhom() %><span><%=countHoSo %></span></li>	
							<%
						}
				%>
			</ul>
		</div>
		<%
		liPhanNhomHoSos = TthcPhanNhomHoSoLocalServiceUtil.findTinNhanh("71,72");
		%>
		<div class="mt20 box">
			<h3><i class="icon4"></i>Lãnh đạo phòng</h3>
			<ul>
				<%
					for (TthcPhanNhomHoSo tthcPhanNhomHoSo : liPhanNhomHoSos) {
						
						if (tthcPhanNhomHoSo.getLoaiPhieuXuLy() == Constants.LOAIPHIEUXULY_PHIEU_CHINH) {
							countHoSo = TthcHoSoThuTucLocalServiceUtil.countHoSoThuTucByTinNhanh(tthcPhanNhomHoSo.getId());
						} else if (tthcPhanNhomHoSo.getLoaiPhieuXuLy() == Constants.LOAIPHIEUXULY_PHIEU_PHU) {
							countHoSo = MotCuaPhieuXuLyPhuLocalServiceUtil.findByPhanNhomHoSoId(tthcPhanNhomHoSo.getId()).size();
						}
							%>
							<li><%=tthcPhanNhomHoSo.getTenPhanNhom() %><span><%=countHoSo %></span></li>	
							<%
						}
				%>
			</ul>
		</div>
		<%
		liPhanNhomHoSos = TthcPhanNhomHoSoLocalServiceUtil.findTinNhanh("6,7");
		%>
		<div class="mt20 box">
			<h3><i class="icon5"></i>Hồ sơ đóng dấu, tính phí</h3>
			<ul>
				<%
					for (TthcPhanNhomHoSo tthcPhanNhomHoSo : liPhanNhomHoSos) {
						
						if (tthcPhanNhomHoSo.getLoaiPhieuXuLy() == Constants.LOAIPHIEUXULY_PHIEU_CHINH) {
							countHoSo = TthcHoSoThuTucLocalServiceUtil.countHoSoThuTucByTinNhanh(tthcPhanNhomHoSo.getId());
						} else if (tthcPhanNhomHoSo.getLoaiPhieuXuLy() == Constants.LOAIPHIEUXULY_PHIEU_PHU) {
							countHoSo = MotCuaPhieuXuLyPhuLocalServiceUtil.findByPhanNhomHoSoId(tthcPhanNhomHoSo.getId()).size();
						}
							%>
							<li><%=tthcPhanNhomHoSo.getTenPhanNhom() %><span><%=countHoSo %></span></li>	
							<%
						}
				%>
			</ul>
		</div>
		
	</div>
<body>
</body>
<script type="text/javascript">

	var divView=1;
    var refreshId = setInterval( function() 
    {
       	document.getElementById("doi_"+divView).style.display = "none";
		divView=divView+1;
		if (divView==6){
		divView=1;
		}
		document.getElementById("doi_"+divView).style.display = "";
		
    }, 12000);

	
	 var refreshPage = setInterval( function() 
    {
		console.log("______reload content result==");
       	window.location.reload();
		
    }, 60000);
</script>
</html>


