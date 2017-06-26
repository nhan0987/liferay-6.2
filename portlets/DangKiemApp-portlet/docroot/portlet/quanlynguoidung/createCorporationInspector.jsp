<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoAction"%>
<%@page import="java.util.UUID"%>
<%@page import="vn.dtt.gt.dk.utils.VRNghiepVuUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.utils.document.DocumentUtils"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="java.math.BigInteger"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee"%>
<%@page import="java.util.List"%>
<%@ include file="/portlet/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<%
	String inspectorId = ParamUtil.getString(request, Constants.INSPECTOR_ID);
	String corporationId = ParamUtil.getString(request, Constants.CORPORATION_ID);
	String corporationInspectorId = ParamUtil.getString(request, Constants.CORPORATION_INSPECTOR);
	
	String isNewCorporationInspector = ParamUtil.getString(request, "isNewCorporationInspector");
	String returnURL = ParamUtil.getString(request, Constants.RETURN_URL);
	
	LogFactoryUtil.getLog(QuanLyNguoiDungAction.class).info("--/createCorporationInspector.jsp---inspectorId===="+ inspectorId);
	LogFactoryUtil.getLog(QuanLyNguoiDungAction.class).info("--/createCorporationInspector.jsp---corporationId===="+ corporationId);
	LogFactoryUtil.getLog(QuanLyNguoiDungAction.class).info("--/createCorporationInspector.jsp---corporationInspectorId===="+ corporationInspectorId);
	LogFactoryUtil.getLog(QuanLyNguoiDungAction.class).info("--/createCorporationInspector.jsp---isNewCorporationInspector===="+ isNewCorporationInspector);
	
	List<CorporationTeam> lCorporationTeams = null;
	
	int isTeamLeader = 0;
	int isBoss = 0;
	long teamId = 0;
	long _userId = 0;
	long _fileChuKy = 0;
	
	CorporationInspector corporationInspector = null;
	List<Long> lObjects = null;
	
	List<DmDataItem> lstThuocDonVi = DmDataItemLocalServiceUtil.findByNameGroupAndMultilAlterName(DanhMucKey.CORPORATION, "KIEMTRA" , "DANGKIEM");
	if (lstThuocDonVi == null) { lstThuocDonVi = new ArrayList<DmDataItem>(); }
	
	List<DmDataItem> lstDoiKiemTra = DmDataItemLocalServiceUtil.findByDataGroupCodeNameAndDataItemAlterName(DanhMucKey.CORPORATION, "KIEMTRA");
	if (lstDoiKiemTra == null) { lstDoiKiemTra = new ArrayList<DmDataItem>(); }
	
	try {
		lObjects = CorporationInspectorLocalServiceUtil.findUserLiferayNotHaveCorporationInspector("dkvn_liferay");
		lCorporationTeams = CorporationTeamLocalServiceUtil.findByCorporationIdAndTrangThai(corporationId, Constants.MarkUpDelete_chua_xoa);
		if (corporationInspectorId != null && ConvertUtil.convertToLong(corporationInspectorId) > 0 ) {
			
			try {
				corporationInspector = CorporationInspectorLocalServiceUtil.fetchCorporationInspector(ConvertUtil.convertToLong(corporationInspectorId));
			} catch (Exception e) {
				LogFactoryUtil.getLog(QuanLyNguoiDungAction.class).info("--/createCorporationInspector.jsp---corporationInspector====null");
			}
			
			if (corporationInspector != null) {
				isTeamLeader = corporationInspector.getMarkupTeamLeader();
				isBoss = corporationInspector.getMarkUpBoss();
				teamId = corporationInspector.getTeamId();
				_userId = corporationInspector.getInspectorid();
				corporationId = corporationInspector.getCorporationId();
				_fileChuKy=corporationInspector.getFilechukyId();
			}
		}
	} catch (Exception es) {
	}
	
	if (lObjects == null) {
		lObjects = new ArrayList<Long>();
	}
	if (lCorporationTeams == null) {
		lCorporationTeams = new ArrayList<CorporationTeam>();
	}
	
	PortletURL urlThemCorporationTeam = renderResponse.createActionURL();
	urlThemCorporationTeam.setParameter(ActionRequest.ACTION_NAME, "themCorporationInspector");
	//check dieu kien duplicate insert
	urlThemCorporationTeam.setParameter("formDate", UUID.randomUUID().toString());
	//themCorporationTeam.setParameter(Constants.CORPORATION_ID, corporationId);
	if (corporationInspector != null) {
		urlThemCorporationTeam.setParameter(Constants.CORPORATION_INSPECTOR, corporationInspectorId);
	}
	
	
	
	List<CorporationView> lstCorporationView = CorporationViewLocalServiceUtil.findByInspectorId(ConvertUtil.convertToLong(inspectorId));
	if (lstCorporationView == null) { lstCorporationView = new ArrayList<CorporationView>(); }
	LogFactoryUtil.getLog(QuanLyNguoiDungAction.class).info("--createCorporationInspector.jsp---lstCorporationView==size==" + lstCorporationView.size());
	
	// Ghi actionlog
	String noidungthaotac = "Vào chức năng Tạo mới đăng kiểm viên thời điểm "+ DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
	String tenmanhinhdaidien = "Màn hình Tạo mới tài khoản người dùng";
	if (isNewCorporationInspector.equalsIgnoreCase("false") ) {
		noidungthaotac = "Vào chức năng Sửa tài khoản đăng kiểm viên thời điểm "+ DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date());
		tenmanhinhdaidien = "Màn hình Chỉnh sửa tài khoản người dùng";
	}
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<div class="" style="padding-top: 1%;color: #777;text-align: left;font-size: 20px;padding-left: 10px;"><%=isNewCorporationInspector.equalsIgnoreCase("true") ? "Tạo mới tài khoản người dùng" : "Chỉnh sửa tài khoản người dùng"%></div>
		<div class="col-xs-12 col-sm-12 col-md-12" id="cot2"><br>
			<div class="col-md-12" id="main">
				<aui:form action="<%=urlThemCorporationTeam%>" name="myForm" id="myForm" method="POST" enctype="multipart/form-data">
					<br>
						<div class="CollapsiblePanelContent" style="display: block; margin-top: 15px;" >
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.tendangkiemvien"/> (<span style="color: red;">*</span>)</label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<aui:input  maxlength="200" style="width: 400px" min="1" id="INSPECTORNAME" cssClass="form-control-find" name="INSPECTORNAME" type="text" size="30" value='<%=Validator.isNotNull(corporationInspector) ? corporationInspector.getInspectorName() : ""%>' label="">
                                	<aui:validator name="required" errorMessage="Cần nhập tên đăng kiểm viên"/>
                            	</aui:input>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.sodienthoai"/> (<span style="color: red;">*</span>)</label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<aui:input maxlength="20" style="width: 400px" min="1" id="INSPECTORPHONE" cssClass="form-control-find" name="INSPECTORPHONE" type="text" size="30" value='<%=Validator.isNotNull(corporationInspector) ? corporationInspector.getInspectorPhone() : ""%>' label="">
									<aui:validator name="required" errorMessage="Cần nhập số điện thoại"/>
									<aui:validator name="number" errorMessage="Số điện thoại phải là số"/>
								</aui:input>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel">Email</label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
                            	<input type="text" style="width: 400px" disabled class="form-control-find" name="INSPECTOREMAIL_DISABLE" id="INSPECTOREMAIL_DISABLE" value="<%=Validator.isNotNull(corporationInspector) ? corporationInspector.getInspectorEmail() : ""%>" />
                            	<input type="hidden" style="width: 400px" class="form-control-find" name="INSPECTOREMAIL" id="INSPECTOREMAIL" value="<%=Validator.isNotNull(corporationInspector) ? corporationInspector.getInspectorEmail() : ""%>" />
							</div>
						</div>
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel">Contact code (<span style="color: red;">*</span>)</label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<aui:input maxlength="20" style="width: 400px" min="1" id="CONTACTCODE" cssClass="form-control-find" name="CONTACTCODE" type="text" size="30" value='<%=Validator.isNotNull(corporationInspector) ? corporationInspector.getContactcode() : ""%>' label="">
                                	<aui:validator name="required" errorMessage="Cần nhập contact code"/>
                            	</aui:input>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.diadiem"/> (<span style="color: red;">*</span>)</label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<aui:input maxlength="20" style="width: 400px" min="1" id="PLACE" cssClass="form-control-find" name="PLACE" type="text" size="30" value='<%=Validator.isNotNull(corporationInspector) ? corporationInspector.getPlace() : ""%>' label="">
                                	<aui:validator name="required" errorMessage="Cần nhập địa điểm"/>
                            	</aui:input>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.tieude"/> (<span style="color: red;">*</span>)</label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<aui:input  maxlength="20" style="width: 400px" min="1" id="TITLE" cssClass="form-control-find" name="TITLE" type="text" size="30" value='<%=Validator.isNotNull(corporationInspector) ? corporationInspector.getTitle() : ""%>' label="">
                                	<aui:validator name="required" errorMessage="Cần nhập tiêu đề"/>
                            	</aui:input>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.vaitrotrongnhom"/></label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<select id="MARKUPTEAMLEADER" name="MARKUPTEAMLEADER" style="width: 400px" class="form-control-find">
		                             <option <%=(isTeamLeader == Constants.DangKiemVienChinh) ? "selected" : ""%> value="<%=Constants.DangKiemVienChinh %>"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.dangkiemvienchinh"/></option>
		                             <option <%=(isTeamLeader == Constants.DangKiemVienPhoiHop) ? "selected" : ""%> value="<%=Constants.DangKiemVienPhoiHop %>"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.dangkiemvienphoihop"/></option>
		                        </select>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel">Thuộc đơn vị</label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<select id="<%=Constants.CORPORATION_ID %>" name="<%=Constants.CORPORATION_ID %>" style="width: 400px" class="form-control-find">
								<%
								LogFactoryUtil.getLog(QuanLyNguoiDungAction.class).debug( "==/createCorporationId.jsp=corporationId===" + corporationId);
								if (isNewCorporationInspector.equalsIgnoreCase("true")) {
									corporationId = "";
								}
								for (DmDataItem dmDataItem : lstThuocDonVi) {
									%>
									<option <%=corporationId.equalsIgnoreCase(dmDataItem.getCode0()) ? "selected" : ""%> value="<%=dmDataItem.getCode0() %>"><%=dmDataItem.getName() %></option>
								<%}%>
								</select>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.chucvu"/></label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<select id="MARKUPBOSS" name="MARKUPBOSS" style="width: 400px" class="form-control-find">
		                             <option <%=(isBoss == Constants.MARKUPBOSS_LANH_DAO) ? "selected" : ""%> value="<%=Constants.MARKUPBOSS_LANH_DAO %>"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.lanhdaodonvikiemtra"/></option>
		                             <option <%=(isBoss == Constants.MARKUPBOSS_NHAN_VIEN) ? "selected" : ""%> value="<%=Constants.MARKUPBOSS_NHAN_VIEN %>"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.dangkiemvienkiemtra"/></option>
		                        </select>
							</div>
						</div>
						
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.nhom"/></label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<select id="TEAMID" name="TEAMID" style="width: 400px" class="form-control-find">
								<%for (CorporationTeam corporationTeam : lCorporationTeams) {%>
									<option <%=(teamId == corporationTeam.getId()) ? "selected" : ""%> value="<%=corporationTeam.getId()%>"><%=corporationTeam.getTeamName()%></option>
								<%}%>
		                        </select>
							</div>
						</div>
						
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.taikhoandangnhap"/></label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<select id="INSPECTORID" name="INSPECTORID" style="width: 400px" onchange="javascript: changData();" class="form-control-find">
									<%
									if (lObjects.size() > 0) {
										for (Object obj : lObjects) {
			                            	BigInteger id = BigInteger.class.cast(obj);
			                            	try {
			                            		
			                            		String name =null;
			                            		User user2 = UserLocalServiceUtil.fetchUserById(id.longValue());
			                            		if(user2!=null){
			                            			name =user2.getEmailAddress();
			                            		}
			                            		%>
			                            		<option <%=(_userId == id.longValue()) ? "selected" : ""%> value="<%=id.longValue()%>"><%=name%></option>
			                            		<%
			                            	} catch (Exception es1) {
			                            		//es1.printStackTrace();
			                            	}
			                            }
									}
									if (_userId > 0) {
										%>
										<%
										User userOfLogin = UserLocalServiceUtil.fetchUserById(_userId);
										%>
										<option selected value="<%=_userId%>"><%=Validator.isNotNull(userOfLogin) ? (Validator.isNotNull(userOfLogin.getEmailAddress()) ? userOfLogin.getEmailAddress() : "") : ""%></option>
									<%}%>
		                        </select>
		                        <%
		                        if (_userId > 0) {
		                           %>
		                            <script type="text/javascript">
		                            	document.getElementById('INSPECTOREMAIL').value = '<%=UserLocalServiceUtil.fetchUserById(_userId).getEmailAddress()%>';
		                            </script>
		                        <%
		                        } else if (_userId <= 0) {
		                            if (lObjects != null && lObjects.size() > 0) {
		                            %>
		                            <script type="text/javascript">
		                            	document.getElementById('INSPECTOREMAIL').value = '<%=UserLocalServiceUtil.fetchUserById(BigInteger.class.cast(lObjects.get(0)).longValue()).getEmailAddress()%>';
		                            </script>
		                            <%
		                            }
		                        }
		                      %>
							</div>
						</div>
						
						
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2"><label class="textlabel">File ảnh ký số</label></div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<%
								if (_fileChuKy > 0) {
									String urlFileChuKy="";
									try {
										urlFileChuKy = DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(_fileChuKy);
									} catch (Exception e) {
									}
									if (urlFileChuKy.trim().length() > 0) {
									%>
										<a href="<%=urlFileChuKy%>">Ảnh chữ ký</a> <br>
									<%}
								}%>
								<input type="file" accept="image/*" name="fileDinhKem_" id="fileDinhKem_" class="user"  onchange="loadFile(event)">
	                            <br>
								<img id="output"/>
								<script>
									var loadFile = function(event) {
										var reader = new FileReader();
										reader.onload = function(){
											var output = document.getElementById('output');
											output.src = reader.result;
										};
										reader.readAsDataURL(event.target.files[0]);
									};
								</script>
							</div>
						</div>
						
						<div class="row">
							<table class="wd-table table" style="margin-left: 15px; width: 55%">
								<thead>
									<tr>
										<td class="text-center thTblDoi">Lãnh đạo</td>
										<td class="text-center thTblDoi">Xem dữ liệu</td>
										<td class="text-center thTblDoi">Tên đội</td>
									</tr>
								</thead>
								<tbody>
									<%
									int index = 1;
									//neu la them moi
									LogFactoryUtil.getLog(QuanLyNguoiDungAction.class).info("--createCorporationInspector.jsp---corporationInspector===="+ (Validator.isNull(corporationInspector) ? "==null==" : "==not null=="));
									if (Validator.isNull(corporationInspector)) {
										for (DmDataItem item : lstDoiKiemTra) {
											%>
											<tr>
												<td class="text-center">
													<input type="checkbox" id="lanhDao<%=item.getCode0()%>" name="lanhDao<%=item.getCode0()%>" onchange="checkLanhDao('<%=item.getCode0()%>')"/>
												</td>
												<td class="text-center">
													<input type="checkbox" id="xemDuLieu<%=item.getCode0()%>" name="xemDuLieu<%=item.getCode0()%>" onchange="checkDuLieu('<%=item.getCode0()%>')"/>
												</td>
												<td class="text-center">
													<input type="hidden" id="doiKiemTra<%=item.getCode0()%>" name="doiKiemTra<%=item.getCode0()%>" value="<%=item.getCode0()%>" />
													<%=item.getName()%>
												</td>
											</tr>
											<%
										}
									//neu la sua
									} else {
										for (DmDataItem item : lstDoiKiemTra) {
											%>
											<tr>
												<td class="text-center">
													<input type="checkbox" id="lanhDao<%=item.getCode0()%>" name="lanhDao<%=item.getCode0()%>" onchange="checkLanhDao('<%=item.getCode0()%>')" 
															<%=VRNghiepVuUtils.checkIsLeader(lstCorporationView, item.getCode0())%> />
												</td>
														
												<td class="text-center">
													<input type="checkbox" id="xemDuLieu<%=item.getCode0()%>" name="xemDuLieu<%=item.getCode0()%>"
															onchange="checkDuLieu('<%=item.getCode0()%>')" 
															<%=VRNghiepVuUtils.checkIsXemDL(lstCorporationView, item.getCode0())%> />
												</td>
												
												<td class="text-center">
													<input type="hidden" id="doiKiemTra<%=item.getCode0()%>" name="doiKiemTra<%=item.getCode0()%>" value="<%=item.getCode0()%>" />
													<%=item.getName()%>
												</td>
											</tr>
											<%
										}
									}
									%>
								</tbody>
							</table>
							
						</div>
						
						
						
						<div class="row">
							<div class="col-xs-10 col-sm-10 col-md-10">
							<%
							if (isNewCorporationInspector.equalsIgnoreCase("true")) {
								if (lObjects.size() == 0) {
									%>
									<div class="row">
										<div class="" style="padding-bottom: 1%;color: #F00F0F;text-align: left;font-size: 14px;padding-left: 15px;">Không thể cấp tài khoản đăng kiểm viên (Tài khoản đăng nhập đã sử dụng hết)</div>
									</div>
									<div class="row">
										<button type="button" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px" onclick="javascript: window.location = '<%=returnURL%>'">
											<liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.quaylai"/>
										</button>
									</div>
								<%} else {%>
									<div class="row">
										<button type="submit" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.ghilai"/></button>
										<button type="button" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px" onclick="javascript: window.location = '<%=returnURL%>'">
											<liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.quaylai"/>
										</button>
									</div>
									<%
								}
							} else {
								%>
								<div class="row">
									<button type="submit" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.ghilai"/></button>
									<button type="button" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px" onclick="javascript: window.location = '<%=returnURL%>'">
										<liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.quaylai"/>
									</button>
								</div>
							<%}%>
							</div>
						</div>
					</div>
				</aui:form>
				<br>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
	function checkLanhDao(codeDoiKiemTra) {
		console.log('--checkLanhDao--' + codeDoiKiemTra);
		var giaTri = $("#lanhDao" + codeDoiKiemTra).is(':checked');
		if (giaTri == true) {
			$("#xemDuLieu" + codeDoiKiemTra).prop("checked", true);
		} else if (giaTri == false) {
			
		}
	}

	function checkDuLieu(codeDoiKiemTra) {
		console.log('--checkDuLieu--' + codeDoiKiemTra);
		var giaTri = $("#lanhDao" + codeDoiKiemTra).is(':checked');
		if (giaTri == true) {
			alert('Nhả quyền lãnh đạo trước khi nhả quyền xem dữ liệu');
			$("#xemDuLieu" + codeDoiKiemTra).prop("checked", true);
		}
	}
	function changData() {
		var index = document.getElementById("INSPECTORID").selectedIndex;
		var INSPECTORID = document.getElementById('INSPECTORID').options[index].text;
		document.getElementById('INSPECTOREMAIL').value = INSPECTORID;
		document.getElementById('INSPECTOREMAIL_DISABLE').value = INSPECTORID;
	}
</script>

<style>
.thTblDoi {background-color: #f4f4f4;border: 1.5px solid #d5d5d5;font-weight: bold;border-bottom: 2px solid #ddd;}
</style>