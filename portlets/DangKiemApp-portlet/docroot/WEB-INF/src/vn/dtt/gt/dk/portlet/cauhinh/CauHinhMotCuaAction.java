package vn.dtt.gt.dk.portlet.cauhinh;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh;
import vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiImpl;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaChuyenDichTrangThaiLocalServiceUtil;
import vn.dtt.gt.dk.utils.format.Constants;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class CauHinhMotCuaAction
 */
public class CauHinhMotCuaAction extends MVCPortlet {
 
	private static Log _log = LogFactoryUtil.getLog(CauHinhMotCuaAction.class);

	@Override
	public void serveResource(ResourceRequest request, ResourceResponse response) throws IOException, PortletException {

		String type = ParamUtil.getString(request, "type");
		_log.debug("START==serveResource==TYPE==" + type);

		if ((type != null) && (type.trim().equals("GetTenThuTuc"))) {
			String linhVucThuTucId = ParamUtil.getString(request, "codeLoaiThuTuc");

			List<TthcThuTucHanhChinh> lstTthc = TthcThuTucHanhChinhLocalServiceUtil.findByLinhVuc(Long.parseLong(linhVucThuTucId));
			if (lstTthc == null) {
				lstTthc = new ArrayList<TthcThuTucHanhChinh>();
			}

			JSONArray usersJsonArray = JSONFactoryUtil.createJSONArray();
			JSONObject json = null;

			for (TthcThuTucHanhChinh item : lstTthc) {
				json = JSONFactoryUtil.createJSONObject();
				json.put("id", item.getId());
				json.put("name", item.getTenThuTuc());
				usersJsonArray.put(json);
			}
			PrintWriter out = response.getWriter();
			_log.debug(usersJsonArray.toString());
			out.print(usersJsonArray.toString());
		}

	}

	public void timKiemChuyenDichTrangThai(ActionRequest resourceRequest, ActionResponse httpReq) {
		String loaiThuTuc = ParamUtil.getString(resourceRequest, Constants.LOAI_THU_TUC).trim();
		String dieuKienDichChuyen = ParamUtil.getString(resourceRequest, "dieuKienDichChuyen").trim();
		String tenThuTuc = ParamUtil.getString(resourceRequest, Constants.TEN_THU_TUC).trim();
		
		httpReq.setRenderParameter(Constants.LOAI_THU_TUC, loaiThuTuc);
		httpReq.setRenderParameter(Constants.TEN_THU_TUC, tenThuTuc);
		httpReq.setRenderParameter("dieuKienDichChuyen", dieuKienDichChuyen);

		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void themMoiChuyenDichTrangThai(ActionRequest resourceRequest, ActionResponse httpReq) {
		_log.info("begin themMoiChuyenDichTrangThai");
		String loaiThuTuc = ParamUtil.getString(resourceRequest, Constants.LOAI_THU_TUC);
		String dieuKienDichChuyen = ParamUtil.getString(resourceRequest, "dieuKienDichChuyen").trim();
		String tenThuTuc = ParamUtil.getString(resourceRequest, Constants.TEN_THU_TUC);
		String trangThaiNguon = ParamUtil.getString(resourceRequest, "trangThaiNguon");
		String trangThaiDich = ParamUtil.getString(resourceRequest, "trangThaiDich");
		String nguoiXoa = ParamUtil.getString(resourceRequest, "nguoiXoa").trim();
		String ngayXoa = ParamUtil.getString(resourceRequest, "ngayXoa");
		String phanNhomHoSo = ParamUtil.getString(resourceRequest, "phanNhomHoSo");
		String soNgayXuLy = ParamUtil.getString(resourceRequest, "soNgayXuLy");
		String hanhDongXuLy = ParamUtil.getString(resourceRequest, "hanhDongXuLy");
		
		Long id;
		try {
			id = CounterLocalServiceUtil.increment(MotCuaChuyenDichTrangThai.class.getName());
			MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = new MotCuaChuyenDichTrangThaiImpl();
			motCuaChuyenDichTrangThai.setId(id);
			motCuaChuyenDichTrangThai.setDieuKienChuyenDich(dieuKienDichChuyen);
			motCuaChuyenDichTrangThai.setTrangThaiNguonId(Long.parseLong(trangThaiNguon));
			motCuaChuyenDichTrangThai.setTrangThaiDichId(Long.parseLong(trangThaiDich));
			motCuaChuyenDichTrangThai.setHanhDongXuLy(hanhDongXuLy);
			motCuaChuyenDichTrangThai.setPhanNhomHoSoId(Long.parseLong(phanNhomHoSo));
			motCuaChuyenDichTrangThai.setSoNgayXuLy(Integer.parseInt(soNgayXuLy));
			
			MotCuaChuyenDichTrangThaiLocalServiceUtil.addMotCuaChuyenDichTrangThai(motCuaChuyenDichTrangThai);
		} catch (SystemException e) {
			_log.error(e);
		}
		
		httpReq.setRenderParameter("jspPage", "/portlet/cauhinhmotcua/chuyendichtrangthai/chuyen_dich_trang_thai.jsp");
		httpReq.setRenderParameter("dieuKienDichChuyen", dieuKienDichChuyen);
		_log.info("begin themMoiChuyenDichTrangThai");
		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
	
	public void updateChuyenDichTrangThai(ActionRequest resourceRequest, ActionResponse httpReq) {
		
		long chuyenDichTrangThaiId = ParamUtil.getLong(resourceRequest, "chuyenDichTrangThaiId");
		_log.info("begin updateChuyenDichTrangThai");
		_log.info("chuyenDichTrangThaiId" + chuyenDichTrangThaiId);
		
		String loaiThuTuc = ParamUtil.getString(resourceRequest, Constants.LOAI_THU_TUC);
		String dieuKienDichChuyen = ParamUtil.getString(resourceRequest, "dieuKienDichChuyen").trim();
		String tenThuTuc = ParamUtil.getString(resourceRequest, Constants.TEN_THU_TUC);
		String trangThaiNguon = ParamUtil.getString(resourceRequest, "trangThaiNguon");
		String trangThaiDich = ParamUtil.getString(resourceRequest, "trangThaiDich");
		String nguoiXoa = ParamUtil.getString(resourceRequest, "nguoiXoa").trim();
		String ngayXoa = ParamUtil.getString(resourceRequest, "ngayXoa");
		String phanNhomHoSo = ParamUtil.getString(resourceRequest, "phanNhomHoSo");
		String soNgayXuLy = ParamUtil.getString(resourceRequest, "soNgayXuLy");
		String hanhDongXuLy = ParamUtil.getString(resourceRequest, "hanhDongXuLy");
		
		Long id;
		try {
			MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai = MotCuaChuyenDichTrangThaiLocalServiceUtil.fetchMotCuaChuyenDichTrangThai(chuyenDichTrangThaiId);
			if(motCuaChuyenDichTrangThai != null){
				motCuaChuyenDichTrangThai.setDieuKienChuyenDich(dieuKienDichChuyen);
				motCuaChuyenDichTrangThai.setTrangThaiNguonId(Long.parseLong(trangThaiNguon));
				motCuaChuyenDichTrangThai.setTrangThaiDichId(Long.parseLong(trangThaiDich));
				motCuaChuyenDichTrangThai.setHanhDongXuLy(hanhDongXuLy);
				motCuaChuyenDichTrangThai.setPhanNhomHoSoId(Long.parseLong(phanNhomHoSo));
				motCuaChuyenDichTrangThai.setSoNgayXuLy(Integer.parseInt(soNgayXuLy));
				MotCuaChuyenDichTrangThaiLocalServiceUtil.updateMotCuaChuyenDichTrangThai(motCuaChuyenDichTrangThai);
			}
			
		} catch (SystemException e) {
			_log.error(e);
		}
		
		
		httpReq.setRenderParameter("jspPage", "/portlet/cauhinhmotcua/chuyendichtrangthai/chuyen_dich_trang_thai.jsp");
		_log.info("end updateChuyenDichTrangThai");
		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
	
	
	/**ham tim kiem thuc tuc hanh chinh, phan cau hinh mot cua*/
	public void timKiemThuTucHanhChinhCauHinhMotCua(ActionRequest request, ActionResponse response) {
		try {
			response.setRenderParameter(Constants.MA_THU_TUC, ParamUtil.getString(request, Constants.MA_THU_TUC).trim());
			response.setRenderParameter(Constants.TEN_THU_TUC, ParamUtil.getString(request, Constants.TEN_THU_TUC).trim());
			response.setRenderParameter(Constants.CO_QUAN_QLTT_ID, ParamUtil.getString(request, Constants.CO_QUAN_QLTT_ID));
			response.setRenderParameter(Constants.LINH_VUC_THU_TUC_ID, ParamUtil.getString(request, Constants.LINH_VUC_THU_TUC_ID));
			
			response.setRenderParameter("jspPage", "/portlet/cauhinhmotcua/tthc_thu_tuc_hanh_chinh.jsp");
			
			PortletConfig portletConfig = (PortletConfig) request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(request, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void timKiemThanhPhanHoSoCauHinhMotCua(ActionRequest request, ActionResponse response) {
		try {
			response.setRenderParameter(Constants.THU_TUC_HANH_CHINH_ID, ParamUtil.getString(request, Constants.THU_TUC_HANH_CHINH_ID).trim());
			response.setRenderParameter(Constants.BIEU_MAU_HO_SO_ID, ParamUtil.getString(request, Constants.BIEU_MAU_HO_SO_ID).trim());
			response.setRenderParameter(Constants.THU_TU_HIEN_THI, ParamUtil.getString(request, Constants.THU_TU_HIEN_THI));
			response.setRenderParameter(Constants.LOAI_THANH_PHAN, ParamUtil.getString(request, Constants.LOAI_THANH_PHAN));
			
			response.setRenderParameter(Constants.MAU_TRUC_TUYEN, ParamUtil.getString(request, Constants.MAU_TRUC_TUYEN));
			response.setRenderParameter(Constants.SO_TAI_LIEU_DINHKEM, ParamUtil.getString(request, Constants.SO_TAI_LIEU_DINHKEM));
			
			response.setRenderParameter("jspPage", "/portlet/cauhinhmotcua/tthc_thanhphanhoso.jsp");
			
			PortletConfig portletConfig = (PortletConfig) request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(request, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void searchNhomDanhMuc(ActionRequest resourceRequest, ActionResponse httpReq) throws SystemException {
		String tenDanhMuc = ParamUtil.getString(resourceRequest, "tenDanhMuc");
		String tenAnhXa = ParamUtil.getString(resourceRequest, "tenAnhXa");
		
		httpReq.setRenderParameter("tenDanhMuc", tenDanhMuc);
		httpReq.setRenderParameter("tenAnhXa", tenAnhXa);
		
		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		
	}
}
