<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.utils.CorporationUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalServiceUtil"%>
<%@page import="java.util.Calendar"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashMap"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu"%>
<%@page import="java.util.Map"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.util.Hashtable"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page pageEncoding="UTF-8"%>
<%@ include file="/portlet/init.jsp"%>

<script type="text/javascript"> var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";
</script>
<%
//System.out.println("===============/portlet/quanlyhs/thulyhs/lanhdaodonvi/lanhdao_phancong_kiemtra.jsp===========");
liCorporationTeams = CorporationTeamLocalServiceUtil.findByInspectorId(userId);
if(renderRequest.getPortletSession().getAttribute("listMap") != null){
listMap=(Map<String,String>)renderRequest.getPortletSession().getAttribute("listMap");
}

//quay lai trang
PortletURL renderBackURL = renderResponse.createRenderURL();
renderBackURL.setParameter("jspPage", "/portlet/quanlyhs/search_content.jsp");

PortletURL urlBoPhanCongKiemTra = renderResponse.createActionURL();
urlBoPhanCongKiemTra.setParameter(ActionRequest.ACTION_NAME, "boPhanCongKiemTra");
urlBoPhanCongKiemTra.setParameter(Constants.TEN_THU_TUC, tenThuTuc);
urlBoPhanCongKiemTra.setParameter(Constants.SO_HO_SO, soHoSo);
urlBoPhanCongKiemTra.setParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFrom);
urlBoPhanCongKiemTra.setParameter(Constants.NGAY_NOP_HO_SO_TO , ngayNopHsTo);
urlBoPhanCongKiemTra.setParameter(Constants.NAM_NHAP, namNhap);
urlBoPhanCongKiemTra.setParameter(Constants.SO_DKKT, soDKKT);
urlBoPhanCongKiemTra.setParameter(Constants.DOI_DKKT, doiDKKT);
urlBoPhanCongKiemTra.setParameter(Constants.LIST_DANG_KIEM_VIEN_, listMapDangKiemVien);

PortletURL urlXacNhanPhanCongKiemTra = renderResponse.createActionURL();
urlXacNhanPhanCongKiemTra.setParameter(ActionRequest.ACTION_NAME, "xacNhanPhanCongKiemTra");
urlXacNhanPhanCongKiemTra.setParameter(Constants.TEN_THU_TUC, tenThuTuc);
urlXacNhanPhanCongKiemTra.setParameter(Constants.SO_HO_SO, soHoSo);
urlXacNhanPhanCongKiemTra.setParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFrom);
urlXacNhanPhanCongKiemTra.setParameter(Constants.NGAY_NOP_HO_SO_TO , ngayNopHsTo);
urlXacNhanPhanCongKiemTra.setParameter(Constants.NAM_NHAP, namNhap);
urlXacNhanPhanCongKiemTra.setParameter(Constants.SO_DKKT, soDKKT);
urlXacNhanPhanCongKiemTra.setParameter(Constants.DOI_DKKT, doiDKKT);
urlXacNhanPhanCongKiemTra.setParameter(Constants.LIST_DANG_KIEM_VIEN_, listMapDangKiemVien);

%>
<aui:form  method="POST" name="formXacNhanPhanCong" id="formXacNhanPhanCong"  action="<%=urlBoPhanCongKiemTra.toString()%>" >
<h5 class="tieude">
	<liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaophancongkiemtra.danhsachdangkiemvienxuly"/>
	<i class="fa-right fa fa-angle-down"></i>
</h5>
<table class="wd-table table">
	<thead>
		<tr>
			<th width="20px"><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.don.vi.stt" /></th>
			<th width="160px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaophancongkiemtra.dangkiemvienchinh"/></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaophancongkiemtra.danhsachdangkiemvienphoihop"/></th>
			<th width="160px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaophancongkiemtra.sohosoduocphancong"/></th>
			<th width="100px">Số lượng PT/Nhóm NK</th>
		</tr>
	</thead>
	<tbody>
	<%
		int k = 0;
		for(CorporationTeam corporationTeam : liCorporationTeams){
			k++;
			if(listMap.get(String.valueOf(corporationTeam.getId())) != null && listMap.get(String.valueOf(corporationTeam.getId())).trim().length() > 0){
			String listIdKiemTra[] = listMap.get(String.valueOf(corporationTeam.getId())).split(",");
	%>
		<tr>
			<td class="text-center"><%=k%>.map</td>
			<td class="text-center"><%=CorporationUtils.getDangKiemVienChinh(corporationTeam.getId()) %><font color="red">(*)</font></td>
			<td class="text-center"><%=CorporationUtils.getDangKiemVienPhu(corporationTeam.getId()) %></td>
			<td class="text-center"><%=listIdKiemTra.length%></td>
			<td class="text-center"><%=listMap.get(String.valueOf(corporationTeam.getId()))%></td>
		</tr>
		<%
			}
		}
		%>
		
		<%
		if (listMapDangKiemVien.trim().length()>0){
			String[] listKeyMapDangKiemVien = listMapDangKiemVien.split(";");
			int dem=0;
			for (String item : listKeyMapDangKiemVien) {
				dem++;
				String listHoSo=listMap.get(item);
				String []listHoSoid = listHoSo.trim().split(",");
				String[] listDangKiemVienKey = item.split("-");
				//System.out.println("--listDangKiemVienKey==========="+listDangKiemVienKey);

				String dkvChinhId=CorporationInspectorLocalServiceUtil.fetchCorporationInspector(ConvertUtil.convertToLong(listDangKiemVienKey[0])).getInspectorName();
				String listDkvPhoiHop=CorporationUtils.getListTenDangKiemVien(CorporationUtils.getListDKVPhoiHopId(listDangKiemVienKey));
				long soLuongPT = 0;
				long soNhomPT = 0;
				if(listHoSo != null && listHoSo.trim().length() >0){
					soLuongPT =	VehicleRecordLocalServiceUtil.countBySoLuongPT(listHoSo.trim().substring(0, listHoSo.trim().length() -1));
					soNhomPT = VehicleRecordLocalServiceUtil.countBySoNhomPT(listHoSo.trim().substring(0, listHoSo.trim().length() -1));
				}
				
		%>
			<tr>
				<td class="text-center"><%=dem%></td>
				<td class="text-center"><%=dkvChinhId %><font color="red">(*)</font></td>
				<td class="text-center"><%=listDkvPhoiHop%></td>
				<td class="text-center"><b><%=listHoSoid.length%></b></td>
				<td class="text-center"><b><%=soLuongPT%>/<%=soNhomPT %></b></td>
			</tr>
			<%
		}
		}
		%>
		
		
	</tbody>
</table>
<br>
<br>
<br>

<h5 class="tieude">
	<liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaophancongkiemtra.hosoduocphancongkiemtra"/>
	<i class="fa-right fa fa-angle-down"></i>
</h5>
<%
Calendar ngayPhanConKiemTra = Calendar.getInstance();
ngayPhanConKiemTra.add(Calendar.DATE, +1);
%>
<div class="row">
	<div class="col-xs-2 col-sm-2 col-md-2">
	</div>
	<div class="col-xs-10 col-sm-10 col-md-10">
		<div class="row">
			<div class="col-xs-3 col-sm-3 col-md-3">
				<label class="textlabel">Ngày phân công kiểm tra : </label>
			</div>
			<div class="col-xs-3 col-sm-3 col-md-3">
				<div class="input-group">
					<input type="text" placeholder="Ngày phân công kiểm tra" name="ngayPhanConKiemTra" id="ngayPhanConKiemTra" value="<%=ConvertUtil.parseDateToString(ngayPhanConKiemTra.getTime()) %>"
						onclick="gtCalendar('ngayPhanConKiemTra')" class="form-control-find-calendar"> <span class="input-group-btn">
						<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayPhanConKiemTra')">
							<i class="fa fa-calendar"></i>
						</button>
					</span>
				</div>
			</div>
		</div>
	</div>
</div>
<br>
<table class="wd-table table">
	<thead>
		<tr>
			<th width="25px"><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.don.vi.stt" /></th>
			<th width="250px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaophancongkiemtra.dangkiemvienchinh"/></th>
			<th width="250px">Đăng kiểm viên phối hợp</th>
			<th width="50px"><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.don.vi.chon" /><br><i>	<liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaophancongkiemtra.bophancong"/></i></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.don.vi.so.ngay.dkkt" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.don.vi.noidung" /></th>
			<th width="170px"><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.don.vi.ghichu" /></th>
		</tr>
	</thead>
	<tbody>
	<%
	int i = 0;
	RegisteredInspection registeredInspection = null;
		for(CorporationTeam corporationTeam : liCorporationTeams){
			if(listMap.get(String.valueOf(corporationTeam.getId())) != null && listMap.get(String.valueOf(corporationTeam.getId())).trim().length() > 0){
			String listIdKiemTra[] = listMap.get(String.valueOf(corporationTeam.getId())).split(",");
			for(int j = 0 ; j < listIdKiemTra.length; j ++){
				//i ++;
			 phieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(ConvertUtil.convertToLong(listIdKiemTra[j]));
			 registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(phieuXuLyPhu.getPhieuXuLyChinhId());
	%>
		<tr style="display: none;">
			<td class="text-center"><%=i %></td>
			<td class="text-center"><%=CorporationUtils.getDangKiemVienChinh(corporationTeam.getId()) %><font color="red">(*)</font></td>
			<td class="text-center"><input type="checkbox" value="<%=phieuXuLyPhu.getId()%>" name="check_<%=i%>" id="check_<%=i%>"/>
			<input type="text" hidden="true" name="<%=Constants.DIEU_KIEN_CHUYEN_DICH%>" value="<%=Constants.DIEU_KIEN_DICH_CHUYEN_PHAN_CONG_DKV%>" />
			<input type="hidden" name="phieuXuLyPhuId_<%=i %>" id="phieuXuLyPhuId_<%=i %>" value="<%=phieuXuLyPhu.getId()%>"/>
			<input type="hidden" name="userGroupId_<%=i %>" id="userGroupId_<%=i %>" value="<%=corporationTeam.getId()%>"/>
			</td>
			<td class="text-center"><%=Validator.isNotNull(registeredInspection) ? registeredInspection.getRegisteredNumber() : StringPool.BLANK%><br><%=Validator.isNotNull(registeredInspection) ? ConvertUtil.parseDateToString(registeredInspection.getInspectionDate()) : StringPool.BLANK%></td>
			<td class="text-center"><%=Validator.isNotNull(phieuXuLyPhu) ? phieuXuLyPhu.getTrichYeuNoiDung() : StringPool.BLANK%></td>
			<td class="text-center"><%=Validator.isNotNull(phieuXuLyPhu) ? phieuXuLyPhu.getGhiChu() : StringPool.BLANK%></td>
		</tr>
		<%
			}
			}
		}
		%>
		
		<%
		if (listMapDangKiemVien.trim().length()>0){
			String[] listKeyMapDangKiemVien = listMapDangKiemVien.split(";");
			if(listKeyMapDangKiemVien != null && listKeyMapDangKiemVien.length > 0){
			for (String item : listKeyMapDangKiemVien) {
				
				String[] listDangKiemVienKey = item.split("-");
				//System.out.println("--listDangKiemVienKey ==========="+listDangKiemVienKey);

				String dkvChinhId=CorporationInspectorLocalServiceUtil.fetchCorporationInspector(ConvertUtil.convertToLong(listDangKiemVienKey[0])).getInspectorName();
				String listDkvPhoiHop=CorporationUtils.getListTenDangKiemVien(CorporationUtils.getListDKVPhoiHopId(listDangKiemVienKey));

				String listHoSo=listMap.get(item);
				String[] listIdHoSo = listHoSo.split(",");
				
				
				//System.out.println("--listIdHoSo ==========="+listIdHoSo);
				if(listIdHoSo != null && listIdHoSo.length > 0){
				for (String itemhoSo : listIdHoSo) {
					if(itemhoSo != null && itemhoSo.trim().length() >0){
					//System.out.println("--itemhoSo ==========="+itemhoSo);
					i++;
					phieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(ConvertUtil.convertToLong(itemhoSo));
					 registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(phieuXuLyPhu.getPhieuXuLyChinhId());
		%>
		<tr>
			<td class="text-center"><%=i %></td>
			<td class="text-center"><%=dkvChinhId%><font color="red">(*)</font></td>
			<td class="text-center"><%=listDkvPhoiHop.replace(",", "<br>")%></td>
			<td class="text-center"><input type="checkbox" value="<%=phieuXuLyPhu.getId()%>" name="check_<%=i%>" id="check_<%=i%>"/>
			<input type="text" hidden="true" name="<%=Constants.DIEU_KIEN_CHUYEN_DICH%>" value="<%=Constants.DIEU_KIEN_DICH_CHUYEN_PHAN_CONG_DKV%>" />
			<input type="hidden" name="phieuXuLyPhuId_<%=i %>" id="phieuXuLyPhuId_<%=i %>" value="<%=phieuXuLyPhu.getId()%>"/>
			<input type="hidden" name="userGroupId_<%=i %>" id="userGroupId_<%=i %>" value="<%=item%>"/>
			</td>
			<td class="text-center"><%=Validator.isNotNull(registeredInspection) ? registeredInspection.getRegisteredNumber() : StringPool.BLANK%><br><%=Validator.isNotNull(registeredInspection) ? ConvertUtil.parseDateToString(registeredInspection.getInspectionDate()) : StringPool.BLANK%></td>
			<td class="text-center"><%=Validator.isNotNull(phieuXuLyPhu) ? phieuXuLyPhu.getTrichYeuNoiDung() : StringPool.BLANK%></td>
			<td class="text-center"><%=Validator.isNotNull(phieuXuLyPhu) ? phieuXuLyPhu.getGhiChu() : StringPool.BLANK%></td>
		</tr>			
			
			<%
							}
						}
					} 
				}
			}
		}
		%>		
		
		
		
		
		<input type="hidden" value="<%=i%>" name="docCount" id="docCount"/>
	</tbody>
</table>
<aui:button-row>
	<button type="button" id="boPhanCongKiemTra" onclick="beforSummitFormXacNhanPhanCong('formXacNhanPhanCong','<%=urlBoPhanCongKiemTra.toString()%>')" class="btnThuLyHS form-control" style="width: 200px;float: left;">Bỏ phân công</button>
	<button type="button" id="xacNhanPhanCong" onclick="beforSummitFormXacNhanPhanCong('formXacNhanPhanCong','<%=urlXacNhanPhanCongKiemTra.toString()%>')" class="btnThuLyHS form-control" style="width: 200px;float: left;">Xác nhận phân công</button>
	<a href="<%=renderBackURL.toString()%>"><button id="quayLai" class="btnThuLyHS form-control" type="button" style="width: 200px;float: left;">Quay lại</button></a>
</aui:button-row>
</aui:form>
<script type="text/javascript">
function beforSummitFormXacNhanPhanCong(idForm, url) {
	console.log('=beforSummitForm=' + idForm);
	var status = confirm("Bạn có muốn tiếp tục xử lý?");
	if (status) {
		document.getElementById('<portlet:namespace/>' + idForm).action = url;
		document.getElementById('<portlet:namespace/>' + idForm).submit();

		document.getElementById('boPhanCongKiemTra').disabled = true;
		document.getElementById('xacNhanPhanCong').disabled = true;
		document.getElementById('quayLai').disabled = true;

	} else {
		document.getElementById('<portlet:namespace/>' + idForm).action = '';
	}
}
</script>