
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="vn.dtt.gt.dk.portlet.business.BienBanKiemTraBusiness"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec"%>
<%@page import="com.liferay.portal.kernel.util.ArrayUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@ include file="/portlet/init.jsp"%>

<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%! private static Log _log = LogFactoryUtil.getLog("portlet_quanlyhs_thulyhs_dangkiemvien_suabienbanktra_loadthongsokythuat_jsp"); %>

<%
long vehicleGroupId = ParamUtil.getLong(request, Constants.ID_VEHICLE_GROUP);
long vehicleGroupInitialId = ParamUtil.getLong(request, Constants.ID_VEHICLE_GROUP_INITIAL);
long inspectionRecordId = ParamUtil.getLong(request, Constants.ID_INSPECTION_RECORD);
long congThucBanhXeId = ParamUtil.getLong(request, "congThucBanhXeId");
long type = ParamUtil.getLong(request, "type");

String vehicleClass = ParamUtil.getString(request, "vehicleClass");
String vehicleType = ParamUtil.getString(request, "vehicleType");

List<VehicleSpecification> lstVehicleSpecification = VehicleSpecificationLocalServiceUtil.findByVehicleSpecificationWithVehicleGroupIdAndVehicleTypeCode(vehicleGroupInitialId, vehicleClass , vehicleType);

if (lstVehicleSpecification == null) { lstVehicleSpecification = new ArrayList<VehicleSpecification>(); }

_log.info("==lstVehicleSpecification==" + lstVehicleSpecification.size());

Map<String, VehicleSpecification> mapVehicleSpecification = new HashMap<String, VehicleSpecification>();
for(VehicleSpecification vehicleSpecification : lstVehicleSpecification) {
	mapVehicleSpecification.put(StringUtil.toLowerCase(vehicleSpecification.getSpecificationCode()), vehicleSpecification);
}

List<DmDataItem> lstLuaChonKetQua = DmDataItemLocalServiceUtil.findByDmDataGroupCode(DanhMucKey.EVALUATION_RESULT);
if (lstLuaChonKetQua == null) { lstLuaChonKetQua = new ArrayList<DmDataItem>(); }
%>

<%
// Chi ap dung cho loai xe ca gioi XCG
boolean b_specCategory = "XCG".equalsIgnoreCase(vehicleClass) ? true : false;
%>

<c:choose>
	<c:when test="<%= b_specCategory %>">
		<% 
		String congThucBanhXeCode = Constants.MA_CONG_THUC_BANH_XE;
		InspectionRecordSpec inspectionRecordSpec = null;
		
		if(congThucBanhXeId == 0) {
			inspectionRecordSpec = InspectionRecordSpecLocalServiceUtil.findByInspectionRecordId_SpecificationCode(inspectionRecordId, congThucBanhXeCode);
			
			congThucBanhXeId = inspectionRecordSpec != null ? GetterUtil.getLong(inspectionRecordSpec.getSpecificationValue()) : 0;
		}
		
		// Lay danh sach danh muc specification
		List<DmDataItem> listSpecCategory = DmDataItemLocalServiceUtil.findByGroupName_AlterName(DanhMucKey.SpecCategory, vehicleClass);
		
		_log.info("==listSpecCategory==" + listSpecCategory.size());
		
		int sttEvent = 0;
		
		// Chia tap 3 loai dong co, dong co dot trong, dong co hybird, dong co xe chay dien
		// Kiem tra gia tri kiem tra, gia tri mac dinh tu ben DN gui sang (VehicleSpecification) neu loai dong co nao co gia tri 
		// thi focus specCategory cua loai dong co day
		// dang fix cung cac specCode cua cac thong so
				
		//InspectionRecordSpec loaiDongCoDotTrong = InspectionRecordSpecLocalServiceUtil.findByInspectionRecordId_SpecificationCode(inspectionRecordId, "XCG0074");
		
		InspectionRecordSpec loaiDongCoHybird= InspectionRecordSpecLocalServiceUtil.findByInspectionRecordId_SpecificationCode(inspectionRecordId, Constants.MA_DONG_CO_HYBIRD);
		InspectionRecordSpec loaiDongCoDoXeChayDien = InspectionRecordSpecLocalServiceUtil.findByInspectionRecordId_SpecificationCode(inspectionRecordId, Constants.MA_DONG_CO_XE_CHAY_DIEN);
		
		String[] specCategoryRadio = new String[]{Constants.NHOM_DONG_CO_DOT_TRONG, Constants.NHOM_DONG_CO_HYBIRD, Constants.NHOM_DONG_CO_XE_CHAY_DIEN};
		String specCategorySeld = Constants.NHOM_DONG_CO_DOT_TRONG;
		
		if(loaiDongCoHybird != null && Validator.isNotNull(loaiDongCoHybird.getSpecificationValue())) {
			specCategorySeld = Constants.NHOM_DONG_CO_HYBIRD;
		} else if(loaiDongCoDoXeChayDien != null && Validator.isNotNull(loaiDongCoDoXeChayDien.getSpecificationValue())) {
			specCategorySeld = Constants.NHOM_DONG_CO_XE_CHAY_DIEN;
		}
		
		for(DmDataItem specCategoryItem : listSpecCategory) {
			String specCategory = specCategoryItem.getCode0();
			
			List<InspectionRecordSpec> lstInspectionRecordSpec = InspectionRecordSpecLocalServiceUtil.findByInspectionRecordIdAndSpecCategory(inspectionRecordId, specCategory, vehicleType, "XCG", congThucBanhXeId);
			String bullet = specCategoryItem.getCode3();
			
			String chked = "";
			String tblHidden = "";
			String tblClass = "";
		%>
		<div class="itemSpecCategory">
			<div class="specCategory clearfix" style="padding: 1% 1% 1% 0;">
				<c:choose>
					<c:when test="<%= ArrayUtil.contains(specCategoryRadio, specCategory) %>">
						<a href="javascript:void(0);" style="font-weight: bold;" onclick="chooseSpecCategory('<%= specCategory %>');" title="<%= "3." + specCategoryItem.getName() %>">
							<%= "3." + specCategoryItem.getName() %>
						</a>
						
						<%
						tblClass = "tblSpecCategoryChoose";
						
						if(specCategorySeld.equalsIgnoreCase(specCategory)) {
							chked = "checked";
						} else {
							tblHidden = "display:none;";
						}
						%>
						<input type="radio" <%= chked %> id="specCategoryChoose<%= specCategory %>" name="specCategoryChoose" class="chk specCategoryChoose" value="<%= specCategory %>" />
					</c:when>
					<c:otherwise>
						<span style="font-weight: bold;">
							<%= "3." + specCategoryItem.getName() %>
						</span>
					</c:otherwise>
				</c:choose>
			</div>
				
			<table id="tblKiemTraDoiChieuKetCauVaThongSoKtXe_<%= specCategory %>" class="<%= tblClass %>" style="width: 100%; <%= tblHidden %>" border="1">
				<thead>
					<tr>
						<td class="text-center" style="height:40px;background-color:#f4f4f4;width:6%;"><span class="bold">Hạng mục</span></td>
						<td class="text-center" style="background-color: #f4f4f4;"><span class="bold">Thông tin kiểm tra</span></td>
						<td class="text-center" style="background-color: #f4f4f4;width:17%;"><span class="bold">Giá trị đăng ký</span></td>
						<td class="text-center" style="background-color: #f4f4f4;width:17%;"><span class="bold">Giá trị kiểm tra</span></td>
						<td class="text-center" style="background-color: #f4f4f4;width:17%;"><span class="bold">Kết quả</span></td>
					</tr>
				</thead>
				<tbody>
				<%
				//_log.info("==lstInspectionRecordSpec==" + lstInspectionRecordSpec.size());
				int stt = 0;
				for (InspectionRecordSpec inspecRecordSpec: lstInspectionRecordSpec) {
					stt++;
					sttEvent++;
					
					String giaTriDangKi = BienBanKiemTraBusiness.getGiaTriDangKi(vehicleClass, mapVehicleSpecification, inspecRecordSpec);
					String giaTriKiemTra = "";
					long typeCode = inspecRecordSpec.getEvaluationResult();
					String specValue = inspecRecordSpec.getSpecificationValue();
					
					if(inspecRecordSpec.getSpecificationCode().equalsIgnoreCase(congThucBanhXeCode)) {
						giaTriKiemTra = BienBanKiemTraBusiness.getGiaTriKiemTra(String.valueOf(congThucBanhXeId), congThucBanhXeCode, vehicleClass);
						specValue = String.valueOf(congThucBanhXeId);
						
						if(type > -1) {
							typeCode = type;
						}
					} else {
						giaTriKiemTra = BienBanKiemTraBusiness.getGiaTriKiemTra(vehicleClass, inspecRecordSpec);
					}
				%>
					<tr id="trTblKiemTraDoiChieuKetCauVaThongSoKtXe<%= sttEvent%>" <%=BienBanKiemTraBusiness.checkColorTab2TrTable(typeCode)%>>
						<td class="text-center"><span class="black" id="sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe<%=sttEvent%>"><%=bullet + stt %></span></td>
						<!-- Thông tin kiểm tra -->
						<td class="text-left paddingLeft05"><span id="sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe<%=sttEvent%>"><%=inspecRecordSpec.getSpecificationName() %></span></td>
						
						<td class="text-center">
							<!-- Gia tri dang ki -->
							<% // Fix cung thiet bi chuyen dung su dung textarea %>
							<c:choose>
								<c:when test='<%= inspecRecordSpec.getSpecificationCode().equalsIgnoreCase("XCG0237") %>'>
									<textarea class="textNone textBound txtarea h-200" 
										readonly="readonly" <%=BienBanKiemTraBusiness.checkColorTab2GTdangki(typeCode)%>
										id="giaTriDangKi_<%=sttEvent%>" name="giaTriDangKiKetCauVaThongSoKtXe<%=inspecRecordSpec.getSpecificationCode()%>" ><%=giaTriDangKi%></textarea>
								</c:when>
								
								<c:otherwise>
									<input type="text" class="textNone textBound" readonly="readonly" <%=BienBanKiemTraBusiness.checkColorTab2GTdangki(typeCode)%>
										id="giaTriDangKi_<%=sttEvent%>" name="giaTriDangKiKetCauVaThongSoKtXe<%=inspecRecordSpec.getSpecificationCode()%>" value="<%=giaTriDangKi%>"/>
								</c:otherwise>
							</c:choose>
								
							<input type="hidden" id="checkDmThongTinKiemTra<%=sttEvent%>" name="checkDmThongTinKiemTra<%=sttEvent%>" value="<%=BienBanKiemTraBusiness.checkTonTaiDanhMuc(vehicleClass, inspecRecordSpec)%>"/>
							<input type="hidden" name="specificationcode" value="<%=inspecRecordSpec.getSpecificationCode() %>" />
							<%
							String[] arrayGiaTriSpecification = BienBanKiemTraBusiness.getCodeNameValueGiaTriDangKi(mapVehicleSpecification, inspecRecordSpec);
							if (arrayGiaTriSpecification.length > 1) {
								%>
								<input type="hidden" id="specificationname<%=sttEvent%>" value="<%=arrayGiaTriSpecification[0]%>"/>
								<input type="hidden" id="specificationcode<%=sttEvent%>" value="<%=arrayGiaTriSpecification[1]%>"/>
								<input type="hidden" id="giaTriDangKi<%=sttEvent%>"  value="<%=(arrayGiaTriSpecification.length > 2) ? arrayGiaTriSpecification[2] : ""%>"/>
								<%
							} else {
								%>
								<input type="hidden" id="specificationname<%=sttEvent%>" name="specificationname" value=""/>
								<input type="hidden" id="specificationcode<%=sttEvent%>" value=""/>
								<input type="hidden" id="giaTriDangKi<%=sttEvent%>" name="giaTriDangKiKtXe" value=""/>
								<%
							}
							%>
						</td>
						
						<td class="text-center">
							<!-- Gia tri kiem tra -->
							<% // Fix cung thiet bi chuyen dung cho XCG su dung textarea %>
							<c:choose>
								<c:when test='<%= inspecRecordSpec.getSpecificationCode().equalsIgnoreCase("XCG0237") %>'>
									<textarea class="textNone textBound txtarea h-200" readonly="readonly" 
										<%=BienBanKiemTraBusiness.checkColorTab2GTkiemtra(typeCode)%>
										id="giaTriKiemTra_<%=sttEvent%>" name="giaTriSuaDoiKetCauVaThongSoKtXe_<%=inspecRecordSpec.getSpecificationCode()%>" 
										data-thamchieutsktxvalue="<%= inspecRecordSpec.getSpecificationCode() %>"><%= giaTriKiemTra %></textarea>
								</c:when>
								
								<c:otherwise>
									<input type="text" class="textNone textBound" readonly="readonly"
										<%=BienBanKiemTraBusiness.checkColorTab2GTkiemtra(typeCode)%>
										id="giaTriKiemTra_<%=sttEvent%>" name="giaTriSuaDoiKetCauVaThongSoKtXe_<%=inspecRecordSpec.getSpecificationCode()%>" 
										data-thamchieutsktxvalue="<%= inspecRecordSpec.getSpecificationCode() %>" value="<%=giaTriKiemTra %>"/>
								</c:otherwise>
							</c:choose>
								
							<input type="hidden" id="giaTriKiemTra<%=sttEvent%>" name="giaTriSuaDoiKetCauVaThongSoKtXe<%=inspecRecordSpec.getSpecificationCode()%>" 
								data-thamchieutsktx="<%= inspecRecordSpec.getSpecificationCode() %>" 
								value="<%=specValue%>"/>
						</td>
						
						<td class="text-center">
							<input type="hidden" id="thamChieu<%=inspecRecordSpec.getSpecificationCode()%>" data-thamchieucode="giaTriKiemTra<%=sttEvent%>" data-thamchieuvalue="giaTriKiemTra_<%=sttEvent%>"/>
							
							<select id="selLuaChonKetQua<%=sttEvent%>" name="selLuaChonDangKiKetCauVaThongSoKtXe<%=inspecRecordSpec.getSpecificationCode()%>" class="form-control-find selectLuaChonKetQua thamChieuAct"
									onclick="checkSelLuaChonThongSoKtXe('<%=sttEvent%>')"
									<%=BienBanKiemTraBusiness.checkColorTab2KetQua(typeCode)%>>
								<option value="0" >Chưa quyết định</option>
								<% for (DmDataItem item : lstLuaChonKetQua) { %>
									<option value="<%=item.getCode0()%>"  <%=BienBanKiemTraBusiness.checkIsDat(typeCode + "", item.getCode0())%> ><%=item.getName()%></option>
								<% } %>
							</select>
							</td>
						</tr>
					<%
					}
					%>
				</tbody>
			</table>
		</div>
		<%
		}
		%>
	</c:when> 
	<c:otherwise>
		<%
		//lstVehicleSpecification = VehicleSpecificationLocalServiceUtil.findByVehicleSpecificationWithVehicleGroupIdAndVehicleTypeCode(vehicleGroupInitialId, vehicleClass , vehicleType);

		List<InspectionRecordSpec> lstInspectionRecordSpec = InspectionRecordSpecLocalServiceUtil.findByInspectionRecordId(inspectionRecordId);
		
		//if (lstVehicleSpecification == null) { lstVehicleSpecification = new ArrayList<VehicleSpecification>(); }
		if (lstInspectionRecordSpec == null) { lstInspectionRecordSpec = new ArrayList<InspectionRecordSpec>(); }
		
		//_log.info("==lstVehicleSpecification==" + lstVehicleSpecification.size());
		_log.info("==lstInspectionRecordSpec==" + lstInspectionRecordSpec.size());
		%>
		<table id="tblKiemTraDoiChieuKetCauVaThongSoKtXe" style="width: 100%" border="1">
			<thead>
				<tr>
					<td class="text-center" style="height:40px;background-color:#f4f4f4;width:6%;"><span class="bold">Hạng mục</span></td>
					<td class="text-center" style="background-color: #f4f4f4;"><span class="bold">Thông tin kiểm tra</span></td>
					<td class="text-center" style="background-color: #f4f4f4;width:17%;"><span class="bold">Giá trị đăng ký</span></td>
					<td class="text-center" style="background-color: #f4f4f4;width:17%;"><span class="bold">Giá trị kiểm tra</span></td>
					<td class="text-center" style="background-color: #f4f4f4;width:17%;"><span class="bold">Kết quả</span></td>
				</tr>
			</thead>
			<tbody>
			<%
			int stt = 0;
			for (InspectionRecordSpec inspecRecordSpec: lstInspectionRecordSpec) {
				stt++;
				String giaTriDangKi = BienBanKiemTraBusiness.getGiaTriDangKi(vehicleClass, mapVehicleSpecification, inspecRecordSpec);
			%>
				<tr id="trTblKiemTraDoiChieuKetCauVaThongSoKtXe<%=stt%>" <%=BienBanKiemTraBusiness.checkColorTab2TrTable(inspecRecordSpec.getEvaluationResult())%>>
					<td class="text-center"><span class="black" id="sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe<%=stt%>">3.<%=stt %></span></td>
					<!-- Thông tin kiểm tra -->
					<td class="text-left paddingLeft05"><span id="sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe<%=stt%>"><%=inspecRecordSpec.getSpecificationName() %></span></td>
					
					<td class="text-center">
						<!-- Gia tri dang ki -->
						<input type="text" class="textNone textBound" readonly="readonly" <%=BienBanKiemTraBusiness.checkColorTab2GTdangki(inspecRecordSpec.getEvaluationResult())%>
							id="giaTriDangKi_<%=stt%>" name="giaTriDangKiKetCauVaThongSoKtXe<%=inspecRecordSpec.getSpecificationCode()%>" value="<%=giaTriDangKi%>"/>
							
						<input type="hidden" id="checkDmThongTinKiemTra<%=stt%>" name="checkDmThongTinKiemTra<%=stt%>" value="<%=BienBanKiemTraBusiness.checkTonTaiDanhMuc(vehicleClass, inspecRecordSpec)%>"/>
						<input type="hidden" name="specificationcode" value="<%=inspecRecordSpec.getSpecificationCode() %>" />
						<%
						String[] arrayGiaTriSpecification = BienBanKiemTraBusiness.getCodeNameValueGiaTriDangKi(mapVehicleSpecification, inspecRecordSpec);
						if (arrayGiaTriSpecification.length > 1) {
							%>
							<input type="hidden" id="specificationname<%=stt%>" value="<%=arrayGiaTriSpecification[0]%>"/>
							<input type="hidden" id="specificationcode<%=stt%>" value="<%=arrayGiaTriSpecification[1]%>"/>
							<input type="hidden" id="giaTriDangKi<%=stt%>"  value="<%=(arrayGiaTriSpecification.length > 2) ? arrayGiaTriSpecification[2] : ""%>"/>
							<%
						} else {
							%>
							<input type="hidden" id="specificationname<%=stt%>" name="specificationname" value=""/>
							<input type="hidden" id="specificationcode<%=stt%>" name="" value=""/>
							<input type="hidden" id="giaTriDangKi<%=stt%>" name="giaTriDangKiKtXe" value=""/>
							<%
						}
						%>
					</td>
					
					<td class="text-center">
						<!-- Gia tri kiem tra -->
						<input type="text" class="textNone textBound" readonly="readonly"
								<%=BienBanKiemTraBusiness.checkColorTab2GTkiemtra(inspecRecordSpec.getEvaluationResult())%>
								id="giaTriKiemTra_<%=stt%>" name="giaTriSuaDoiKetCauVaThongSoKtXe_<%=inspecRecordSpec.getSpecificationCode()%>" data-thamchieutsktxvalue="<%= inspecRecordSpec.getSpecificationCode() %>" value="<%=BienBanKiemTraBusiness.getGiaTriKiemTra(vehicleClass, inspecRecordSpec)%>"/>
								<!-- name="giaTriSuaDoiKetCauVaThongSoKtXe_"  -->
							
						<input type="hidden" id="giaTriKiemTra<%=stt%>" name="giaTriSuaDoiKetCauVaThongSoKtXe<%=inspecRecordSpec.getSpecificationCode()%>" data-thamchieutsktx="<%= inspecRecordSpec.getSpecificationCode() %>" value="<%=inspecRecordSpec.getSpecificationValue()%>"/>
					</td>
					
					<td class="text-center">
						<input type="hidden" id="thamChieu<%=inspecRecordSpec.getSpecificationCode()%>" data-thamchieucode="giaTriKiemTra<%=stt%>" data-thamchieuvalue="giaTriKiemTra_<%=stt%>"/>
						
						<select id="selLuaChonKetQua<%=stt%>" name="selLuaChonDangKiKetCauVaThongSoKtXe<%=inspecRecordSpec.getSpecificationCode()%>" class="form-control-find selectLuaChonKetQua thamChieuAct"
								onclick="checkSelLuaChonThongSoKtXe('<%=stt%>')"
								<%=BienBanKiemTraBusiness.checkColorTab2KetQua(inspecRecordSpec.getEvaluationResult())%>>
							<option value="0" >Chưa quyết định</option>
							<% for (DmDataItem item : lstLuaChonKetQua) { %>
								<option value="<%=item.getCode0()%>"  <%=BienBanKiemTraBusiness.checkIsDat(inspecRecordSpec.getEvaluationResult() + "", item.getCode0())%> ><%=item.getName()%></option>
							<% } %>
						</select>
					</td>
				</tr>
			<%
			}
			%>
			</tbody>
		</table>
	</c:otherwise>
</c:choose>
