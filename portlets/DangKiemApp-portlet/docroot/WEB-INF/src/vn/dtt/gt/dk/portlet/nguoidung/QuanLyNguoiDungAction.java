
package vn.dtt.gt.dk.portlet.nguoidung;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationTeamImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectionMethodLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.ActionLogLocalServiceUtil;
import vn.dtt.gt.dk.portlet.DangKiemAction;
import vn.dtt.gt.dk.utils.DanhMucKey;
import vn.dtt.gt.dk.utils.VRNghiepVuUtils;
import vn.dtt.gt.dk.utils.document.DocumentUtils;
import vn.dtt.gt.dk.utils.format.CommonUtils;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.ConvertUtil;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;

/**
 * Portlet implementation class QuanLyNguoiDungAction
 */
public class QuanLyNguoiDungAction extends DangKiemAction {
	
	private static Log _log = LogFactoryUtil.getLog(QuanLyNguoiDungAction.class);
	
	public QuanLyNguoiDungAction() {
	}
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, PortletException {
	}
	
	public void themCorporationTeam(ActionRequest resourceRequest, ActionResponse httpReq)
		throws SystemException {
		String tenNhom = ParamUtil.getString(resourceRequest, "tenNhom");
		String trangThai = ParamUtil.getString(resourceRequest, "MarkUpDelete");
		String corporationId = ParamUtil.getString(resourceRequest, Constants.CORPORATION_ID);
		String inspectorTeam = ParamUtil.getString(resourceRequest, Constants.INSPECTOR_TEAM);
		
		String fromDate = ParamUtil.getString(resourceRequest, "formDate").trim();
		if (CommonUtils.checkFromDate(resourceRequest, fromDate)) { return; }
		
		try {
			if (inspectorTeam != null && inspectorTeam.trim().length() > 0) {
				CorporationTeam corporationTeam = CorporationTeamLocalServiceUtil.fetchCorporationTeam(ConvertUtil.convertToLong(inspectorTeam));
				corporationTeam.setTeamName(tenNhom.trim());
				corporationTeam.setMarkUpDelete(ConvertUtil.convertToInt(trangThai));
				corporationTeam.setCorporationId(corporationId);
				
				CorporationTeamLocalServiceUtil.updateCorporationTeam(corporationTeam);
			} else {
				CorporationTeam corporationTeam = new CorporationTeamImpl();
				corporationTeam.setTeamName(tenNhom.trim());
				corporationTeam.setMarkUpDelete(ConvertUtil.convertToInt(trangThai));
				corporationTeam.setCorporationId(corporationId);
				
				CorporationTeamLocalServiceUtil.addCorporationTeam(corporationTeam);
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
	
	public void editCorporationTeam(ActionRequest resourceRequest, ActionResponse httpReq)
		throws SystemException {
		String trangThai = ParamUtil.getString(resourceRequest, "MarkUpDelete");
		String inspectorTeam = ParamUtil.getString(resourceRequest, Constants.INSPECTOR_TEAM);
		
		String fromDate = ParamUtil.getString(resourceRequest, "formDate").trim();
		if (CommonUtils.checkFromDate(resourceRequest, fromDate)) { return; }
		
		try {
			if (inspectorTeam != null && inspectorTeam.trim().length() > 0) {
				CorporationTeam corporationTeam = CorporationTeamLocalServiceUtil.fetchCorporationTeam(ConvertUtil.convertToLong(inspectorTeam));
				corporationTeam.setMarkUpDelete(ConvertUtil.convertToInt(trangThai));
				
				CorporationTeamLocalServiceUtil.updateCorporationTeam(corporationTeam);
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
	
	public void editCorporationInspector(ActionRequest resourceRequest, ActionResponse httpReq)
		throws SystemException {
		String inspectorTeam = ParamUtil.getString(resourceRequest, Constants.INSPECTOR_TEAM);
		String CORPORATION_ID = ParamUtil.getString(resourceRequest, Constants.CORPORATION_ID);
		String CORPORATION_INSPECTOR = ParamUtil.getString(resourceRequest, Constants.CORPORATION_INSPECTOR);
		
		String fromDate = ParamUtil.getString(resourceRequest, "formDate").trim();
		if (CommonUtils.checkFromDate(resourceRequest, fromDate)) { return; }
		
		try {
			if (CORPORATION_INSPECTOR != null && CORPORATION_INSPECTOR.trim().length() > 0) {
				CorporationInspector corporationInspector =
					CorporationInspectorLocalServiceUtil.fetchCorporationInspector(ConvertUtil.convertToLong(CORPORATION_INSPECTOR));
				corporationInspector.setTeamId(0);
				
				CorporationInspectorLocalServiceUtil.updateCorporationInspector(corporationInspector);
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		httpReq.setRenderParameter(Constants.INSPECTOR_TEAM, inspectorTeam);
		httpReq.setRenderParameter(Constants.CORPORATION_ID, CORPORATION_ID);
		httpReq.setRenderParameter(Constants.CORPORATION_INSPECTOR, CORPORATION_INSPECTOR);
		
		httpReq.setRenderParameter("jspPage", "/portlet/quanlynguoidung/editCorporationTeam.jsp");
		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
	
	public void themCorporationInspectorToCorporationTeam(ActionRequest resourceRequest, ActionResponse httpReq) throws SystemException {
		
		String inspectorTeam = ParamUtil.getString(resourceRequest, Constants.INSPECTOR_TEAM);
		String CORPORATION_ID = ParamUtil.getString(resourceRequest, Constants.CORPORATION_ID);
		String corporationInspector = ParamUtil.getString(resourceRequest, "corporationInspector");
		String fromDate = ParamUtil.getString(resourceRequest, "formDate").trim();
		
		if (CommonUtils.checkFromDate(resourceRequest, fromDate)) { return; }
		
		try {
			if (corporationInspector != null && corporationInspector.trim().length() > 0) {
				String[] corporationInspectors = corporationInspector.trim().split(",");
				for (String value : corporationInspectors) {
					if (value != null && value.trim().length() > 0) {
						CorporationInspector corporationInspectorEdit =
							CorporationInspectorLocalServiceUtil.fetchCorporationInspector(ConvertUtil.convertToLong(value));
						corporationInspectorEdit.setTeamId(ConvertUtil.convertToLong(inspectorTeam));
						
						CorporationInspectorLocalServiceUtil.updateCorporationInspector(corporationInspectorEdit);
					}
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		httpReq.setRenderParameter(Constants.INSPECTOR_TEAM, inspectorTeam);
		httpReq.setRenderParameter(Constants.CORPORATION_ID, CORPORATION_ID);
		
		httpReq.setRenderParameter("jspPage", "/portlet/quanlynguoidung/editCorporationTeam.jsp");
		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
	
	/**them hoac sua, dang kiem vien*/
	public void themCorporationInspector(ActionRequest actionRequest, ActionResponse actionResponse)
		throws IOException {
		
		_log.info("---themCorporationInspector---");
		
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		
		String corporationId = uploadRequest.getParameter(Constants.CORPORATION_ID);
		String corporationInspectorId = uploadRequest.getParameter(Constants.CORPORATION_INSPECTOR);
		
		_log.info("---corporationId--" + (Validator.isNull(corporationId) ? "_null" : "not_not"));
		_log.info("---corporationInspectorId--" + (Validator.isNull(corporationInspectorId) ? "_null" : "not_not"));
		
		
		
		String INSPECTORNAME = uploadRequest.getParameter("INSPECTORNAME");
		String INSPECTORPHONE = uploadRequest.getParameter("INSPECTORPHONE");
		String INSPECTOREMAIL = uploadRequest.getParameter("INSPECTOREMAIL");
		String CONTACTCODE = uploadRequest.getParameter("CONTACTCODE");
		
		String INSPECTORID = uploadRequest.getParameter("INSPECTORID");
		String TEAMID = uploadRequest.getParameter("TEAMID");
		
		String PLACE = uploadRequest.getParameter("PLACE");
		String TITLE = uploadRequest.getParameter("TITLE");
		
		String MARKUPBOSS = uploadRequest.getParameter("MARKUPBOSS");
		String MARKUPTEAMLEADER = uploadRequest.getParameter("MARKUPTEAMLEADER");
		
		String fromDate = uploadRequest.getParameter("formDate").trim();
		
		
		
		
		long fileEntryId = 0;
		String fileDinhKemUpload = "fileDinhKem_";
		String fileName = String.valueOf(uploadRequest.getFileName(fileDinhKemUpload));
		InputStream inputStream = uploadRequest.getFileAsStream(fileDinhKemUpload); // upload file
		byte[] fileContext = DocumentUtils.getByteFromInputStream(inputStream);
		//_log.info("--fileContext-"+fileContext);
		
		if (fileContext != null) {
			try {
				fileEntryId = DocumentUtils.uploadTaiLieu(fileContext, PortalUtil.getUserId(actionRequest), fileName);
			} catch (Exception e) {
				_log.error(e);
			}
		}
		
		//lay du lieu dang ki
		List<DmDataItem> lstDoiKiemTra = DmDataItemLocalServiceUtil.findByDataGroupCodeNameAndDataItemAlterName(DanhMucKey.CORPORATION, "KIEMTRA");
		if (lstDoiKiemTra == null) { lstDoiKiemTra = new ArrayList<DmDataItem>(); }
		Hashtable<String, String> hashLanhDao = new Hashtable<String, String>();
		Hashtable<String, String> hashDuLieu = new Hashtable<String, String>();
		
		for (DmDataItem item : lstDoiKiemTra) {
			String attLanhDao = uploadRequest.getParameter("lanhDao" + item.getCode0().trim());
			if (Validator.isNotNull(attLanhDao)) {
				hashLanhDao.put(item.getCode0().trim(), attLanhDao.trim());
			} else {
				hashLanhDao.put(item.getCode0().trim(), "");
			}
			
			String attXemDuLieu = uploadRequest.getParameter("xemDuLieu" + item.getCode0().trim());
			
			if (Validator.isNotNull(attXemDuLieu)) {
				hashDuLieu.put(item.getCode0().trim(), attXemDuLieu.trim());
			} else {
				hashDuLieu.put(item.getCode0().trim(), "");
			}
			
			String attDoiKiemTra = uploadRequest.getParameter("doiKiemTra" + item.getCode0().trim());
			_log.info("--attXemDuLieu--" + attXemDuLieu + "--attDoiKiemTra--" + attDoiKiemTra);
		}
		
		//show dulieu demo
		/*log.info("---LanhDao---" + hashLanhDao.size());
		for (Entry<String, String> entry : hashLanhDao.entrySet()) {
			log.info("code--" + entry.getKey() + "--value---" + entry.getValue());
		}
		
		log.info("---Du lieu---" + hashDuLieu.size());
		for (Entry<String, String> entry : hashDuLieu.entrySet()) {
			log.info("code--" + entry.getKey() + "--value---" + entry.getValue());
		}*/
		
		if (CommonUtils.checkFromDate(actionRequest, fromDate)) { return; }
		
		try {
			if (corporationInspectorId != null && corporationInspectorId.trim().length() > 0) {
				CorporationInspector corpInspector = CorporationInspectorLocalServiceUtil.fetchCorporationInspector(ConvertUtil.convertToLong(corporationInspectorId));
				
				corpInspector.setInspectorEmail(INSPECTOREMAIL);
				corpInspector.setInspectorName(INSPECTORNAME);
				corpInspector.setInspectorPhone(INSPECTORPHONE);
				corpInspector.setContactcode(CONTACTCODE);
				corpInspector.setCorporationId(corporationId);
				corpInspector.setMarkUpBoss(ConvertUtil.convertToInt(MARKUPBOSS));
				corpInspector.setMarkupTeamLeader(ConvertUtil.convertToInt(MARKUPTEAMLEADER));
				corpInspector.setInspectorid(ConvertUtil.convertToLong(INSPECTORID));
				corpInspector.setTitle(TITLE.trim());
				corpInspector.setPlace(PLACE.trim());
				corpInspector.setTeamId(ConvertUtil.convertToLong(TEAMID));
				
				if (fileEntryId > 0) {
					corpInspector.setFilechukyId(fileEntryId);
				}
				
				CorporationInspectorLocalServiceUtil.updateCorporationInspector(corpInspector);
			} else {
				CorporationInspector corpInspector = new CorporationInspectorImpl();
				
				corpInspector.setInspectorEmail(INSPECTOREMAIL);
				corpInspector.setInspectorName(INSPECTORNAME);
				corpInspector.setInspectorPhone(INSPECTORPHONE);
				corpInspector.setContactcode(CONTACTCODE);
				corpInspector.setCorporationId(corporationId);
				corpInspector.setMarkUpBoss(ConvertUtil.convertToInt(MARKUPBOSS));
				corpInspector.setMarkupTeamLeader(ConvertUtil.convertToInt(MARKUPTEAMLEADER));
				corpInspector.setInspectorid(ConvertUtil.convertToLong(INSPECTORID));
				corpInspector.setTeamId(ConvertUtil.convertToLong(TEAMID));
				corpInspector.setTitle(TITLE.trim());
				corpInspector.setPlace(PLACE.trim());
				
				if (fileEntryId > 0) {
					corpInspector.setFilechukyId(fileEntryId);
				}
				
				CorporationInspectorLocalServiceUtil.addCorporationInspector(corpInspector);
			}
			
			
			//them moi
			List<CorporationView> lstViewDb = CorporationViewLocalServiceUtil.findByInspectorId(ConvertUtil.convertToLong(INSPECTORID));
			if (lstViewDb == null) { lstViewDb = new ArrayList<CorporationView>(); }
			
			CorporationView tempView = null;
			List<CorporationView> viewEntrys = new ArrayList<CorporationView>();
			
			for (Entry<String, String> entryLanhDao : hashLanhDao.entrySet()) {
				tempView = new CorporationViewImpl();
				tempView.setCorporationId(entryLanhDao.getKey());
				tempView.setCorporationName(VRNghiepVuUtils.nameDoiKiemTra(lstDoiKiemTra, entryLanhDao.getKey()));
				tempView.setInspectorId(ConvertUtil.convertToLong(INSPECTORID));
				
				if (entryLanhDao.getValue().length() > 0) {
					tempView.setIsLeader(1);
				} else if (entryLanhDao.getValue().length() == 0 && hashDuLieu.get(entryLanhDao.getKey()).length() > 0) {
					tempView.setIsLeader(0);
				} else if (entryLanhDao.getValue().length() == 0 && hashDuLieu.get(entryLanhDao.getKey()).length() == 0) {
					tempView.setIsLeader(-1);
				}
				viewEntrys.add(tempView);
			}
			
			for (CorporationView item : lstViewDb) {
				_log.info("view db--" + item.getCorporationId());;
			}
			
			for (CorporationView view : viewEntrys) {
				boolean check = checkListContains(lstViewDb, view.getCorporationId().trim());
				if (check == true) {
					//update
					view.setId(getIdFormList(lstViewDb, view.getCorporationId()));
					if (view.getIsLeader() == -1) {
						//delete
						CorporationViewLocalServiceUtil.deleteCorporationView(view.getId());
					} else {
						//update
						CorporationViewLocalServiceUtil.updateCorporationView(view);
					}
					
				} else {
					_log.info("isLeader--" + view.getIsLeader() + "--code-" + view.getCorporationId());
					if (view.getIsLeader() != -1) {
						CorporationViewLocalServiceUtil.addCorporationView(view);
					}
					
				}
			}
			
			//CollectionUtils.exists(collection, predicate)
		} catch (Exception e) {
			_log.error(e);
		}
		
		//Chá»— nÃ y cÃ³ thá»ƒ null hoáº·c ko, tÃ¹y trÆ°á»�ng há»£p add, edit
		//actionResponse.setRenderParameter(Constants.CORPORATION_ID, corporationId);
		//actionResponse.setRenderParameter(Constants.CORPORATION_INSPECTOR, corporationInspectorId);
		
		actionResponse.setRenderParameter("jspPage", "/portlet/quanlynguoidung/quanlyDangKiemVien.jsp");
		PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
	
	public static boolean checkListContains(List<CorporationView> lstCorporationView, final String code) {
		for (CorporationView view : lstCorporationView) {
			if (view.getCorporationId().equalsIgnoreCase(code)) {
				return true;
			}
		}
		return false;
	}
	
	public static long getIdFormList(List<CorporationView> corporationView, String code) {
		for (CorporationView view : corporationView) {
			if (view.getCorporationId().equalsIgnoreCase(code)) {
				return view.getId();
			}
		}
		return 0;
	}
	public void deleteDangKiemVien(ActionRequest resourceRequest, ActionResponse httpReq)throws SystemException {
		long corporationInspectorId = ParamUtil.getLong(resourceRequest, "CORPORATION_INSPECTORID");
		_log.info("===============corporationInspectorId======"+corporationInspectorId);
		CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.fetchCorporationInspector(corporationInspectorId);
		if(corporationInspector != null){
			CorporationInspectorLocalServiceUtil.deleteDangKiemVien(corporationInspectorId);
		}
		
		httpReq.setRenderParameter("jspPage", "/portlet/quanlynguoidung/quanlyDangKiemVien.jsp");
			
		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		}
	
	public static long insertActionLog(long hosothutucid, String masohoso, String mabiennhan, String noidungthaotac, String tenmanhinhdaidien, String importername, long inspectorid, String inspectorname) {
		try {
			ActionLog newAction = null;
			long actionlogID = CounterLocalServiceUtil.increment(ActionLog.class.getName());
			newAction = ActionLogLocalServiceUtil.createActionLog(actionlogID);
			newAction.setNgayxemhoso(new Date());
			newAction.setHosothutucid(hosothutucid);
			newAction.setMabiennhan(mabiennhan);
			newAction.setMasohoso(masohoso);
			newAction.setNoidungmanhinh(noidungthaotac);
			newAction.setTitle(tenmanhinhdaidien);
			newAction.setImportername(importername);
			newAction.setInspectorid(inspectorid);
			newAction.setInspectorname(inspectorname);
			
			
			if (inspectorid > 0) {
				ActionLogLocalServiceUtil.updateActionLog(newAction);
				CorporationInspector corpInspector = CorporationInspectorLocalServiceUtil.findByInspectorId(inspectorid);
				if (corpInspector != null && corpInspector.getInspectorid() > 0){
					newAction.setCorporationid(corpInspector.getCorporationId());
					newAction.setContactcode(corpInspector.getContactcode());
					newAction.setInspectoremail(corpInspector.getInspectorEmail());
					newAction.setInspectorphone(corpInspector.getInspectorPhone());
					ActionLogLocalServiceUtil.updateActionLog(newAction);
				}
			}
			
		} catch (Exception e) {
			_log.error(e);
		}
		return 0;
	}
}
