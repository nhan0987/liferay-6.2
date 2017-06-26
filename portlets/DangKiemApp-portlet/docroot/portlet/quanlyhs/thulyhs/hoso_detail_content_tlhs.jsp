<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.business.ProcessUtils"%>
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoAction"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoVaiTroLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu"%>
<%@page import="vn.dtt.gt.dk.utils.format.CommonUtils"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyChinhLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaQuyTrinhThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ include file="/portlet/init.jsp"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%! private static Log _log = LogFactoryUtil.getLog("portlet_quanlyhs_thulyhs_hoso_detail_content_tlhs_jsp"); %>

<%
	HttpSession httpSession = null;
	try {
		httpSession = PortalUtil.getHttpServletRequest(renderRequest).getSession();
	} catch (Exception es) {
	}
	String idPhanNhomHoSo = "";
	if (httpSession != null) {
		Object obj = httpSession.getAttribute(Constants.MAPHANNHOMHOSO);
		if (obj != null) {
			idPhanNhomHoSo = obj.toString();
		} else {
			idPhanNhomHoSo = "";
		}
	}
	MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = null;
	String hoSoThuTucId = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
	String phieuXuLyPhuId = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY_PHU);
	ProcessUtils processUtils = new ProcessUtils();
	boolean check = processUtils.checkMessageQueue(ConvertUtil.convertToLong(hoSoThuTucId), ConvertUtil.convertToLong(phieuXuLyPhuId));
	
	long organizationId = 0;
	if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
		organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
	}
	
	_log.debug("==hoso_detail_content_tlhs.jsp==hoSoThuTucId===" + hoSoThuTucId);
	_log.debug("==hoso_detail_content_tlhs.jsp==idthuTucHanhChinh===" + idthuTucHanhChinh);
	_log.debug("==hoso_detail_content_tlhs.jsp==organizationId===" + organizationId);
	
	List<MotCuaQuyTrinhThuTuc> motCuaQuyTrinhThuTuc = MotCuaQuyTrinhThuTucLocalServiceUtil.findByThuTucHanhChinhIdAndToChucXuLy(ConvertUtil.convertToLong(idthuTucHanhChinh), organizationId);

if (motCuaQuyTrinhThuTuc != null && motCuaQuyTrinhThuTuc.size() > 0) {
	long idTrangThai = 0;
	if (phieuXuLyPhuId != null && phieuXuLyPhuId.trim().length() > 0) {
		motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(ConvertUtil.convertToLong(phieuXuLyPhuId));
		idTrangThai = motCuaPhieuXuLyPhu.getTrangThaiHienTaiId();
		_log.debug("===motCuaPhieuXuLyPhu===" + motCuaPhieuXuLyPhu);
		
	} else {
		MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.findByHoSoThuTucIdAndQuyTrinhThuTucId(ConvertUtil.convertToLong(hoSoThuTucId), motCuaQuyTrinhThuTuc.get(0).getId());
		idTrangThai = motCuaPhieuXuLyChinh.getTrangThaiHienTaiId();
		_log.debug("===motCuaPhieuXuLyChinh===" + motCuaPhieuXuLyChinh);
	}
	
	MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = MotCuaTrangThaiHoSoLocalServiceUtil.fetchMotCuaTrangThaiHoSo(idTrangThai);
	
	_log.debug("===motCuaTrangThaiHoSo===" + motCuaTrangThaiHoSo);
	_log.debug("=====hoso_detail_content_tlhs.jsp======motCuaTrangThaiHoSo==" + motCuaTrangThaiHoSo);
	if(idPhanNhomHoSo!=null&&idPhanNhomHoSo.length()>0&&idPhanNhomHoSo.equals("58")){
		check=false;	
	}
	if (motCuaTrangThaiHoSo != null && CommonUtils.checkRole(themeDisplay, motCuaTrangThaiHoSo)) {
		if(!check){
			try {
				String jspPage = "/portlet/quanlyhs/" + motCuaTrangThaiHoSo.getFormXuLy();
				
				_log.info("=====jspPage.jsp======jspPage==" + jspPage);
				
				if (phieuXuLyPhuId != null && phieuXuLyPhuId.trim().length() > 0) {
					String liRoleSelected = CommonUtils.checkRole(themeDisplay);
					
					LogFactoryUtil.getLog(DangKiemAction.class).debug("==========liRoleSelected======" + liRoleSelected);
					
					List<TthcPhanNhomHoSoVaiTro> liTthcPhanNhomHoSoVaiTros = TthcPhanNhomHoSoVaiTroLocalServiceUtil.findTthcPhanNhomHoSoVaiTroByPhanNhomHoSoAndVaiTroXuLy(ConvertUtil.convertToLong(idPhanNhomHoSo), liRoleSelected);
					
					for (TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro : liTthcPhanNhomHoSoVaiTros) {
						if (tthcPhanNhomHoSoVaiTro.getNhomPhieuXuLy().compareToIgnoreCase(motCuaPhieuXuLyPhu.getNhomPhieuXuLy()) == 0) {
							%>
							<jsp:include page="<%=jspPage %>"></jsp:include>
							<%
							break;
						}
					}
				} else {
				%>
				<jsp:include page="<%=jspPage %>"></jsp:include>
				<%
				}
			} catch (Exception e) {
				_log.error(e);
			}
		}else{
			String jspPage = "/portlet/quanlyhs/hosodangchosuly.jsp" ;
			%>
			<jsp:include page="<%=jspPage %>"></jsp:include>
			<%
		}
	}
}
%>
