
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="vn.dtt.gt.dk.report.ReportUtils"%>
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
String vehicleClass = ParamUtil.getString(request, "vehicleClass");
String vehicleType = ParamUtil.getString(request, "vehicleType");
long congThucBanhXeId = ParamUtil.getLong(request, "congThucBanhXeId");
long type = ParamUtil.getLong(request, "type");

List<VehicleSpecification> lstVehicleSpecification = null;

List<DmDataItem> lstLuaChonKetQua = DmDataItemLocalServiceUtil.findByDmDataGroupCode(DanhMucKey.EVALUATION_RESULT);
if (lstLuaChonKetQua == null) { lstLuaChonKetQua = new ArrayList<DmDataItem>(); }
%>

<%
// Chi ap dung cho loai xe ca gioi XCG
boolean b_specCategory = "XCG".equalsIgnoreCase(vehicleClass) ? true : false;

int stt = 0;
%>
<c:choose>
	<c:when test="<%= b_specCategory %>">
		<% 
		String congThucBanhXeCode = Constants.MA_CONG_THUC_BANH_XE;
		
		if(congThucBanhXeId == 0) {
			// Fix cung load dong thong so ky thuat theo cong thuc banh xe
			VehicleSpecification vehicleSpecification = VehicleSpecificationLocalServiceUtil.findByVehicleGroupIdSpecificationCode(vehicleGroupId, congThucBanhXeCode);
			
			congThucBanhXeId = vehicleSpecification != null ? GetterUtil.getLong(vehicleSpecification.getSpecificationValue()) : 0;
		}
		
		lstVehicleSpecification = VehicleSpecificationLocalServiceUtil.findByVehicleSpecificationWithVehicleGroupIdAndVehicleTypeCode(vehicleGroupId, vehicleClass , vehicleType);
		
		if (lstVehicleSpecification == null) { lstVehicleSpecification = new ArrayList<VehicleSpecification>(); }
		
		_log.info("==lstVehicleSpecification==" + lstVehicleSpecification.size());
		
		// Lay danh sach danh muc specification
		List<DmDataItem> listSpecCategory = DmDataItemLocalServiceUtil.findByGroupName_AlterName(DanhMucKey.SpecCategory, vehicleClass);
		
		if (listSpecCategory == null) { listSpecCategory = new ArrayList<DmDataItem>(); }
		
		_log.info("==listSpecCategory==" + listSpecCategory.size());
		
		int sttEvent = 0;
		
		// Chia tap 3 loai dong co, dong co dot trong, dong co hybird, dong co xe chay dien
		// Kiem tra gia tri kiem tra, gia tri mac dinh tu ben DN gui sang (VehicleSpecification) neu loai dong co nao co gia tri 
		// thi focus specCategory cua loai dong co day
		// dang fix cung cac specCode cua cac thong so
		
		VehicleSpecification loaiDongCoHybird = VehicleSpecificationLocalServiceUtil.
			findByVehicleGroupIdSpecificationCode(vehicleGroupId, Constants.MA_DONG_CO_HYBIRD);
		
		VehicleSpecification loaiDongCoDoXeChayDien = VehicleSpecificationLocalServiceUtil.
			findByVehicleGroupIdSpecificationCode(vehicleGroupId, Constants.MA_DONG_CO_XE_CHAY_DIEN);
		
		String[] specCategoryRadio = new String[]{Constants.NHOM_DONG_CO_DOT_TRONG, 
				Constants.NHOM_DONG_CO_HYBIRD, Constants.NHOM_DONG_CO_XE_CHAY_DIEN};	//TODO:fix cung
		
		String specCategorySeld = Constants.NHOM_DONG_CO_DOT_TRONG;
		
		if(loaiDongCoHybird != null && Validator.isNotNull(loaiDongCoHybird.getSpecificationValue())) {
			specCategorySeld = Constants.NHOM_DONG_CO_HYBIRD;
		} else if(loaiDongCoDoXeChayDien != null && Validator.isNotNull(loaiDongCoDoXeChayDien.getSpecificationValue())) {
			specCategorySeld = Constants.NHOM_DONG_CO_XE_CHAY_DIEN;
		}
		
		for(DmDataItem specCategoryItem : listSpecCategory) {
			String specCategory = specCategoryItem.getCode0();
			String bullet = specCategoryItem.getCode3();
			
			lstVehicleSpecification = VehicleSpecificationLocalServiceUtil.findByVehicleSpecificationWithVehicleGroupIdAndVehicleTypeCode(vehicleGroupId, vehicleClass, vehicleType, "XCG", specCategory, congThucBanhXeId);
			
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
					stt = 0;
					
					for (VehicleSpecification itemVSpecification: lstVehicleSpecification) {
						if (!itemVSpecification.getSpecificationName().trim().equalsIgnoreCase(Constants.SPECIFICATION_NAME)) {
						stt++;
						sttEvent++;
						String giaTriHienthi = "";
						long typeCode = 1;
						String specValue = itemVSpecification.getSpecificationValue();
						
						String giaTriDangKy = ReportUtils.getNameForVehicleSpecification(itemVSpecification.getSpecificationValue(), itemVSpecification.getSpecificationCode(), vehicleClass);
						if(itemVSpecification.getSpecificationCode().equalsIgnoreCase(congThucBanhXeCode)) {
							giaTriHienthi = ReportUtils.getNameForVehicleSpecification(String.valueOf(congThucBanhXeId), congThucBanhXeCode, vehicleClass);
							specValue = String.valueOf(congThucBanhXeId);
							
							if(type > -1) {
								typeCode = type;
							}
						} else {
							giaTriHienthi = giaTriDangKy;
						}
					%>			
						<tr id="trTblKiemTraDoiChieuKetCauVaThongSoKtXe<%= sttEvent%>" <%=BienBanKiemTraBusiness.checkColorTab2TrTable(typeCode)%>>
							<td class="text-center"><span class="black" id="sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe<%=sttEvent%>"><%=bullet + stt %></span></td>
							<td class="text-left paddingLeft05"><span id="sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe<%=sttEvent%>"><%=itemVSpecification.getSpecificationName() %></span></td>
							
							<!-- Gia tri dang kie -->
							<td class="text-center">
								<c:choose>
									<c:when test='<%= itemVSpecification.getSpecificationCode().equalsIgnoreCase("XCG0237") %>'>
										<textarea class="textNone textBound txtarea h-200" readonly="readonly" <%=BienBanKiemTraBusiness.checkColorTab2GTdangki(typeCode)%>
											id="giaTriDangKi_<%=sttEvent%>" name="giaTriDangKiKetCauVaThongSoKtXe<%=itemVSpecification.getSpecificationCode()%>" ><%=giaTriDangKy%></textarea>
									</c:when>
									
									<c:otherwise>
										<input type="text" class="textNone textBound" readonly="readonly" <%=BienBanKiemTraBusiness.checkColorTab2GTdangki(typeCode)%>
											id="giaTriDangKi_<%=sttEvent%>" name="giaTriDangKiKetCauVaThongSoKtXe<%=itemVSpecification.getSpecificationCode()%>" value="<%=giaTriDangKy%>" />
									</c:otherwise>
								</c:choose>
									
								<input type="hidden" id="specificationname<%=sttEvent%>" name="specificationname" value="<%=itemVSpecification.getSpecificationName() %>" />
								<input type="hidden" id="specificationcode<%=sttEvent%>" name="specificationcode" value="<%=itemVSpecification.getSpecificationCode() %>" />
								<input type="hidden" id="giaTriDangKi<%=sttEvent%>" name="giaTriDangKiKtXe" value="<%=itemVSpecification.getSpecificationValue() %>"/>
							</td>
							
							<!-- Gia tri kiem tra -->
							<td class="text-center">
								<% // Fix cung thiet bi chuyen dung su dung textarea %>
								<c:choose>
									<c:when test='<%= itemVSpecification.getSpecificationCode().equalsIgnoreCase("XCG0237") %>'>
										<textarea class="textNone textBound txtarea h-200" readonly="readonly" 
											<%=BienBanKiemTraBusiness.checkColorTab2GTdangki(typeCode)%>
											id="giaTriKiemTra_<%=sttEvent%>" name="giaTriSuaDoiKetCauVaThongSoKtXe_<%=itemVSpecification.getSpecificationCode()%>"><%= giaTriHienthi %></textarea>
									</c:when>
									
									<c:otherwise>
										<input type="text" class="textNone textBound" readonly="readonly" <%=BienBanKiemTraBusiness.checkColorTab2GTdangki(typeCode)%>
											id="giaTriKiemTra_<%=sttEvent%>" name="giaTriSuaDoiKetCauVaThongSoKtXe_<%=itemVSpecification.getSpecificationCode()%>" value="<%=giaTriHienthi%>"/>
									</c:otherwise>
								</c:choose>
										
								<input type="hidden" id="giaTriKiemTra<%=sttEvent%>" name="giaTriSuaDoiKetCauVaThongSoKtXe<%=itemVSpecification.getSpecificationCode()%>" value="<%=specValue%>"/>
							</td>
							
							<td class="text-center">
								<input type="hidden" id="thamChieu<%=itemVSpecification.getSpecificationCode()%>" data-thamchieucode="giaTriKiemTra<%=sttEvent%>" data-thamchieuvalue="giaTriKiemTra_<%=sttEvent%>"/>
								
								<select id="selLuaChonKetQua<%=sttEvent%>" name="selLuaChonDangKiKetCauVaThongSoKtXe<%=itemVSpecification.getSpecificationCode()%>"
									<%=BienBanKiemTraBusiness.checkColorTab2GTdangki(typeCode)%>
									class="form-control-find selectLuaChonKetQua thamChieuAct" style="height: 30px" onclick="checkSelLuaChonThongSoKtXe('<%=sttEvent%>')">
									
									<option value="0" >Chưa quyết định</option>
									<%for (DmDataItem item : lstLuaChonKetQua) {
										String seld = BienBanKiemTraBusiness.defaultIsDat(item.getCode0());
										
										if(itemVSpecification.getSpecificationCode().equalsIgnoreCase(congThucBanhXeCode)) {
											seld = BienBanKiemTraBusiness.checkIsDat(typeCode + "", item.getCode0());
										}
									%>
										<option value="<%=item.getCode0()%>" <%=seld %> ><%=item.getName()%></option>
									<%}%>
								</select>
							</td>
						</tr>
					<%	
						}
					}
					%>
					</tbody>
				</table>
			</div>
		<% } %>
	</c:when>
	<c:otherwise>
		<%
		lstVehicleSpecification = VehicleSpecificationLocalServiceUtil.findByVehicleSpecificationWithVehicleGroupIdAndVehicleTypeCode(vehicleGroupId, vehicleClass , vehicleType);
		
		if (lstVehicleSpecification == null) { lstVehicleSpecification = new ArrayList<VehicleSpecification>(); }
		
		_log.info("==lstVehicleSpecification==" + lstVehicleSpecification.size());
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
			
			for (VehicleSpecification itemVSpecification: lstVehicleSpecification) {
				if (!itemVSpecification.getSpecificationName().trim().equalsIgnoreCase(Constants.SPECIFICATION_NAME)) {
				stt++;
				String giaTriHienthi = ReportUtils.getNameForVehicleSpecification(itemVSpecification.getSpecificationValue(), itemVSpecification.getSpecificationCode(), vehicleClass); 
			%>			
				<tr id="trTblKiemTraDoiChieuKetCauVaThongSoKtXe<%=stt%>">
					<td class="text-center"><span class="black" id="sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe<%=stt%>">3.<%=stt %></span></td>
					<td class="text-left paddingLeft05"><span id="sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe<%=stt%>"><%=itemVSpecification.getSpecificationName() %></span></td>
					
					<!-- Gia tri dang ky -->
					<td class="text-center">
						<input type="text" class="textNone textBound" readonly="readonly"
								id="giaTriDangKi_<%=stt%>" name="giaTriDangKiKetCauVaThongSoKtXe<%=itemVSpecification.getSpecificationCode()%>" value="<%=giaTriHienthi%>" />
							
						<input type="hidden" id="specificationname<%=stt%>" name="specificationname" value="<%=itemVSpecification.getSpecificationName() %>" />
						<input type="hidden" id="specificationcode<%=stt%>" name="specificationcode" value="<%=itemVSpecification.getSpecificationCode() %>" />
						<input type="hidden" id="giaTriDangKi<%=stt%>" name="giaTriDangKiKtXe" value="<%=itemVSpecification.getSpecificationValue() %>"/>
					</td>
					
					<!-- Gia tri kiem tra -->
					<td class="text-center">
						<input type="text" class="textNone textBound" readonly="readonly"
								id="giaTriKiemTra_<%=stt%>" name="giaTriSuaDoiKetCauVaThongSoKtXe_<%=itemVSpecification.getSpecificationCode()%>" value="<%=giaTriHienthi%>"/>
								
						<input type="hidden" id="giaTriKiemTra<%=stt%>" name="giaTriSuaDoiKetCauVaThongSoKtXe<%=itemVSpecification.getSpecificationCode()%>" value="<%=itemVSpecification.getSpecificationValue()%>"/>
					</td>
					
					<td class="text-center">
						<input type="hidden" id="thamChieu<%=itemVSpecification.getSpecificationCode()%>" data-thamchieucode="giaTriKiemTra<%=stt%>" data-thamchieuvalue="giaTriKiemTra_<%=stt%>"/>
						
						<select id="selLuaChonKetQua<%=stt%>" name="selLuaChonDangKiKetCauVaThongSoKtXe<%=itemVSpecification.getSpecificationCode()%>" class="form-control-find selectLuaChonKetQua thamChieuAct" style="height: 30px" onclick="checkSelLuaChonThongSoKtXe('<%=stt%>')">
							<option value="0" >Chưa quyết định</option>
							<%for (DmDataItem item : lstLuaChonKetQua) {%>
								<option value="<%=item.getCode0()%>"  <%=BienBanKiemTraBusiness.defaultIsDat(item.getCode0())%> ><%=item.getName()%></option>
							<%}%>
						</select>
					</td>
				</tr>
			<%	
				}
			}
			%>
			</tbody>
		</table>
	</c:otherwise>
</c:choose>