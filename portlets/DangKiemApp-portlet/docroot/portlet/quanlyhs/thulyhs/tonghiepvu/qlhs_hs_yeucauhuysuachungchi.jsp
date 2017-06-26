<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcKeHoachChuyenDichLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich"%>
<%@page import="vn.dtt.gt.dk.utils.config.DKConfigurationManager"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote"%>
<%@page import="vn.dtt.gt.dk.portlet.business.NghiepVuBusiness"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection"%>
<%@ include file="/portlet/init.jsp"%>
<%@ include file="/portlet/quanlyhs/thulyhs/totiepnhan/initToTiepNhan.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String idHoSoThuTuc = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	String idPhieuXuLyPhu = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY_PHU);
	
	//quay lai trang
	PortletURL renderBackURL = renderResponse.createRenderURL();
	renderBackURL.setParameter("jspPage", "/portlet/quanlyhs/search_content.jsp");
	int canBoSuLy =1;	
	InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuId(ConvertUtil.convertToLong(idPhieuXuLyPhu));
	List<CertificateRecord> reCertificateRecords = new ArrayList<CertificateRecord>();
	if(inspectionRecord != null){
		System.out.println("ok inspectionRecord");
		reCertificateRecords = CertificateRecordLocalServiceUtil.findByDossierIdAndInspectionReportIdAndStampStatus(ConvertUtil.convertToLong(idHoSoThuTuc), inspectionRecord.getId());
	}else{
		System.out.println(" not inspectionRecord");
		NghiepVuBusiness nghiepVuBusiness = new NghiepVuBusiness();
		reCertificateRecords = nghiepVuBusiness.getListSuaDoiGNC(ConvertUtil.convertToLong(idPhieuXuLyPhu));
		if(reCertificateRecords.size() ==1){
			canBoSuLy = 2;
		}
	}
	HttpSession httpSession = null;
	try {
		httpSession = PortalUtil.getHttpServletRequest(renderRequest).getSession();
	} catch (Exception es) { }

	//-------------- phan nhom ho so
	String idPhanNhomHoSo = "";
	if (httpSession != null) {
		Object obj = httpSession.getAttribute(Constants.MAPHANNHOMHOSO);
		if (obj != null) {
			idPhanNhomHoSo = obj.toString();
		} else {
			idPhanNhomHoSo = "";
		}
	}
	
	// Ghi actionlog
	String noidungthaotac = "Mở xem Danh sách yêu cầu sửa, hủy chứng chỉ thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo hoSoThuTucId " + idHoSoThuTuc; 
	String tenmanhinhdaidien = "Danh sách yêu cầu sửa, hủy chứng chỉ";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(ConvertUtil.convertToLong(idHoSoThuTuc), null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<script type="text/javascript">
var hoSoThuTucList = new Array();
</script>
<aui:form action="" method="post" name="myForm" id="myForm">
<table class="wd-table table">
	<thead>
		<tr>
			<th>STT</th>
			<th>Chọn<br><input id = 'check_all' name = 'check_all' type='checkbox' onclick="checkAll();"/></th>
			<th>Số chứng chỉ</th>
			<th>Ngày ký</th>
			<th>Tên doanh nghiệp</th>
			<th>Thao tác</th>
		</tr>
	</thead>
	<tbody>
	<%
	
		RegisteredInspection registeredInspection = null;
		CertificateRecord certificateRecord = null;
		if(reCertificateRecords != null && reCertificateRecords.size() > 0){
			int k=0;
		for (int i = 0; i < reCertificateRecords.size(); i++) {
			certificateRecord = (CertificateRecord)reCertificateRecords.get(i);
			registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(certificateRecord.getDossierId());
			
			List<DebitNote> lstDebitNotes = DebitNoteLocalServiceUtil.findDebitNoteByIdCertificateRecord(certificateRecord.getId(), Constants.MarkAsDelete_Lon_Hon_0);
			List<DebitNote> lstDebitNoteDaTraChungChi = DebitNoteLocalServiceUtil.findDebitNoteByIdCertificateRecord(certificateRecord.getId(), Constants.MarkAsDelete_Lon_Hon_1);
			
			PortletURL urlSuaChungChi = renderResponse.createRenderURL();
			urlSuaChungChi.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
			urlSuaChungChi.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
			urlSuaChungChi.setParameter(Constants.CERTIFICATE_RECORD_ID, String.valueOf(certificateRecord.getId()));
			urlSuaChungChi.setParameter(Constants.ID_PHIEU_XU_LY_PHU, idPhieuXuLyPhu);
			urlSuaChungChi.setParameter(Constants.CAN_BO_SU_LY, String.valueOf(canBoSuLy));
			urlSuaChungChi.setParameter("jspPage", "/portlet/quanlyhs/thulyhs/suachungchi/suachungchi.jsp");
			
			PortletURL urlSuaChungChiChoDuyetLanN = renderResponse.createRenderURL();
			urlSuaChungChiChoDuyetLanN.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
			urlSuaChungChiChoDuyetLanN.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
			urlSuaChungChiChoDuyetLanN.setParameter(Constants.CERTIFICATE_RECORD_ID, String.valueOf(certificateRecord.getId()));
			urlSuaChungChiChoDuyetLanN.setParameter(Constants.ID_PHIEU_XU_LY_PHU, idPhieuXuLyPhu);
			urlSuaChungChiChoDuyetLanN.setParameter(Constants.CAN_BO_SU_LY, String.valueOf(canBoSuLy));
			urlSuaChungChiChoDuyetLanN.setParameter("jspPage", "/portlet/quanlyhs/thulyhs/suachungchi/suachungchichoduyetlanN.jsp");
			
			%>
			<tr>
				<td class="text-center"><%= i + 1%></td>
				<td class="text-center"><input type='checkbox' id='<%=certificateRecord.getId()%>'  class="user" onclick="changeajax('<%=certificateRecord.getId() %>');" /></td>
				<td class="text-center"><%=certificateRecord.getCertificateNumber() %></td>
				<td class="text-center"><%=DateUtils.dateToString("dd/MM/yyyy HH:mm", certificateRecord.getSignDate())%></td>
				<td><span class="text-left"><%=Validator.isNotNull(registeredInspection) ? registeredInspection.getImporterName() : ""%></span></td>
				<%
				if(lstDebitNotes != null && lstDebitNotes.size() > 0){
					if(lstDebitNoteDaTraChungChi != null && lstDebitNoteDaTraChungChi.size() >0){
						DebitNote debitNote = lstDebitNoteDaTraChungChi.get(0);
						List<TthcKeHoachChuyenDich> keHoachChuyenDich = TthcKeHoachChuyenDichLocalServiceUtil.findByCertificateId(certificateRecord.getId()+"");
						if(keHoachChuyenDich==null||keHoachChuyenDich.size()==0){	
				%>
								<td class="text-center"><a href="<%=urlSuaChungChi%>">Sửa</a></td>
					<%
						}else{
						%>
							<td class="text-center"><i>Chờ trả chứng chỉ</i></td>
						<%	
						}
					} else {
					%>
					<td class="text-center"><i>Chờ trả chứng chỉ</i></td>
					<%
					}
					%>
				<%
				} else {
					List<TthcKeHoachChuyenDich> keHoachChuyenDich = TthcKeHoachChuyenDichLocalServiceUtil.findByCertificateId(certificateRecord.getId()+"");
					if(certificateRecord.getCertificateNumber().trim().length() > DKConfigurationManager.getIntProp("VR_SIZE_SO_TU_TANG_CHUNG_CHI_GCN", 12)
							&&(keHoachChuyenDich==null||keHoachChuyenDich.size()==0)){
						if(certificateRecord != null && certificateRecord.getDigitalIssued() ==0){	
							%>
										<td class="text-center"><a href="<%=urlSuaChungChiChoDuyetLanN%>">Sửa</a></td>
								<%
									}else{
									%>
										<td class="text-center"><a href="<%=urlSuaChungChi%>">Sửa</a></td>
									<%	
									}
							%>					
					<%
					} else {
					%>
					<td class="text-center"><i>Chưa thanh toán</i></td>
				<%
					}
				}
				%>
			</tr>
			<script type="text/javascript">
					hoSoThuTucList[<%=i%>] = "<%=certificateRecord.getId()%>";
			</script>
			<%
			}
		}
	%>
	<input type="hidden" name="listId" id="listId" value=""/>
	</tbody> 
</table>


<div id="divButton">
	<aui:button-row>
		<button type="button" onclick="eventHideOrShowDiv('divXacNhanHuy', 'true')" class=" btnThuLyHS form-control">Xác nhận hủy chứng chỉ</button>
		<!-- <button type="button" onclick="eventHideOrShowDiv('divDongYSua', 'true')" class=" btnThuLyHS form-control">Đồng ý sửa chứng chỉ</button> -->
		<%
		if(idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("50") != 0){
		%>
		<button type="button" onclick="eventHideOrShowDiv('divTuChoiSua', 'true')" class=" btnThuLyHS form-control">Từ chối sửa chứng chỉ</button>
		<%
		}
		%>
		<a href="<%=renderBackURL.toString()%>"><button type="button" class=" btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button></a>
	</aui:button-row>
</div>
<div style="height: 15px" id="theDem"></div>


<%
PortletURL xacNhanHuy = renderResponse.createActionURL();
xacNhanHuy.setParameter(ActionRequest.ACTION_NAME, "toNghiepVu_XacNhanHuyChungChi");
xacNhanHuy.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
xacNhanHuy.setParameter(Constants.ID_PHIEU_XU_LY_PHU, idPhieuXuLyPhu);

%>
<div id="divXacNhanHuy">
	<p style="text-align: left;"><span>Lý do<span style="color: red;">*</span> :</span></p>
	<textarea class="textAreaAutosize" id="xacNhanHuy" name="xacNhanHuy"><%=StringPool.BLANK%></textarea>
	
	<aui:button-row cssClass="width100">
		<button type="button" onclick="if(validatorXacNhanHuy()) summitForm('<%=xacNhanHuy%>')" class="btnThuLyHS form-control" style="width: 200px">Xác nhận hủy chứng chỉ</button>
		<button type="button" onclick="eventHideOrShowDiv('divXacNhanHuy', 'false')" class="btnThuLyHS form-control" style="width: 150px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button>
	</aui:button-row>
</div>

<%
PortletURL dongYSua = renderResponse.createActionURL();
dongYSua.setParameter(ActionRequest.ACTION_NAME, "toNghiepVu_DongYSuaChungChi");
dongYSua.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
dongYSua.setParameter(Constants.ID_PHIEU_XU_LY_PHU, idPhieuXuLyPhu);
dongYSua.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
dongYSua.setParameter(Constants.CAN_BO_SU_LY, canBoSuLy+"");
%>
<div id="divDongYSua">
	<p style="text-align: left;"><span>Lý do<span style="color: red;">*</span> :</span></p>
	<textarea class="textAreaAutosize" id="dongYSua" name="dongYSua"><%=StringPool.BLANK%></textarea>
	
	<aui:button-row cssClass="width100">
		<button type="button" onclick="if(validatorDongYSua()) summitForm('<%=dongYSua%>')" class="btnThuLyHS form-control" style="width: 200px">Đồng ý sửa chứng chỉ</button>
		<button type="button" onclick="eventHideOrShowDiv('divDongYSua', 'false')" class="btnThuLyHS form-control" style="width: 150px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button>
	</aui:button-row>
</div>

<%
PortletURL tuChoiSua = renderResponse.createActionURL();
tuChoiSua.setParameter(ActionRequest.ACTION_NAME, "toNghiepVu_TuChoiSuaChungChi");
tuChoiSua.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
tuChoiSua.setParameter(Constants.ID_PHIEU_XU_LY_PHU, idPhieuXuLyPhu);
tuChoiSua.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
tuChoiSua.setParameter(Constants.CAN_BO_SU_LY, canBoSuLy+"");
%>
<div id="divTuChoiSua">
	<p style="text-align: left;"><span>Lý do<span style="color: red;">*</span> :</span></p>
	<textarea class="textAreaAutosize" id="tuChoiSua" name="tuChoiSua"><%=StringPool.BLANK%></textarea>
	
	<aui:button-row cssClass="width100">
		<button type="button" onclick="if(validatorTuChoiSua()) summitForm('<%=tuChoiSua%>')" class="btnThuLyHS form-control" style="width: 200px">Từ chối sửa chứng chỉ</button>
		<button type="button" onclick="eventHideOrShowDiv('divTuChoiSua', 'false')" class="btnThuLyHS form-control" style="width: 150px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button>
	</aui:button-row>
</div>
</aui:form>

<script type="text/javascript">

	$(function(){
		$('#divXacNhanHuy').hide();
		$('#divDongYSua').hide();
		$('#divTuChoiSua').hide();
		$('#theDem').hide();
	});

	function changeajax(dataId) {
		
		var isCheck=document.getElementById(dataId).checked;
		var isCheckInternal = true;
		var listId=document.getElementById('listId').value;
		if (isCheck==true){
			//alert("--true");
			listId=listId+dataId+",";
			for ( var i = 0; i < hoSoThuTucList.length; i++) {
				isCheckInternal = document.getElementById(hoSoThuTucList[i]).checked;
				if(isCheckInternal == false){
					break;
				}
			}
			document.getElementById("check_all").checked = isCheckInternal;
		}else{
			//alert("--false");
			var res = listId.replace(dataId+",", "");
			document.getElementById("check_all").checked = false;
			listId=res;
		}
		document.getElementById('listId').value=listId;
	}

	function checkAll() {
		var isCheck1=document.getElementById('check_all').checked;
		var listId="";

		if (isCheck1==true){
			for ( var i = 0; i < hoSoThuTucList.length; i++) {
				document.getElementById(hoSoThuTucList[i]).checked = "checked";
				listId = listId + hoSoThuTucList[i] + ",";
			}
			document.getElementById('listId').value = listId;
		} else {
			for ( var i = 0; i < hoSoThuTucList.length; i++) {
				document.getElementById(hoSoThuTucList[i]).checked = '';
			}
			document.getElementById('listId').value = '';
		}
	}
	//de ve file js, ko an doan code: <portlet:namespace/>
	function summitForm(url) {
		var listId=document.getElementById('listId').value;
		if (listId.trim()==''){
			alert("Chưa lựa chứng chỉ.");
			return;
		} else {
			document.getElementById('<portlet:namespace/>myForm').action = url;
			var status = confirm("Bạn có muốn tiếp tục xử lý?");
		    if (status) {
		    	document.getElementById('<portlet:namespace/>myForm').submit(); 
			} else {
				document.getElementById('<portlet:namespace/>myForm').action = '';
			}
		}
	}

	
	function validatorXacNhanHuy() {
		var xacNhanHuy = $('#xacNhanHuy').val();
		if (xacNhanHuy.trim().length == 0) {
			alert("Đề nghị nhập lý do Xác nhận hủy !");
			return false;
		}
		return true;
	}
	function validatorDongYSua() {
		var dongYSua = $('#dongYSua').val();
		if (dongYSua.trim().length == 0) {
			alert("Đề nghị nhập lý do Đồng ý sửa !");
			return false;
		}
		return true;
	}
	function validatorTuChoiSua() {
		var tuChoiSua = $('#tuChoiSua').val();
		if (tuChoiSua.trim().length == 0) {
			alert("Đề nghị nhập lý do Từ chối sửa !");
			return false;
		}
		return true;
	}
</script>