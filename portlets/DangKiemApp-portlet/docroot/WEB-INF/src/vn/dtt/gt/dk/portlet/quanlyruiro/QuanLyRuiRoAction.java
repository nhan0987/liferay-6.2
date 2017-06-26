package vn.dtt.gt.dk.portlet.quanlyruiro;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentPeriodLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationConfigLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectionMethodLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterControlLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofProductLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectorLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter;
import vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterLocalServiceUtil;

import vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking;
import vn.dtt.gt.dk.dao.nghiepvu.service.IssueTrackingLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory;
import vn.dtt.gt.dk.dao.nghiepvu.service.IssueTrackingLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog;
import vn.dtt.gt.dk.dao.nghiepvu.service.ActionLogLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate;
import vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateLocalServiceUtil;
import vn.dtt.gt.dk.portlet.DangKiemAction;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.ConvertUtil;
import vn.dtt.gt.dk.utils.format.DateUtils;

/**
 * Portlet implementation class QuanLyRuiRoAction
 */
public class QuanLyRuiRoAction extends DangKiemAction {
	
private static Log _log = LogFactoryUtil.getLog(QuanLyRuiRoAction.class);
	
	public void deleteNewExchangeRate(ActionRequest request, ActionResponse httpReq) {
		try {
			long iDNewEx = ParamUtil.getLong(request, Constants.NewExchangeRate_ID);
			_log.info("NewExchangeRate_ID---" + iDNewEx);
			
			if (iDNewEx > 0) {
				NewExchangeRateLocalServiceUtil.deleteNewExchangeRate(iDNewEx);
			}
			
		} catch (Exception e) {
			_log.error(e);
		}
		
		PortletConfig portletConfig = (PortletConfig)request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request,  portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(request,  portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public void editNewExchangeRate(ActionRequest request, ActionResponse httpReq) {
		try {
			long id = ParamUtil.getLong(request, Constants.NewExchangeRate_ID);
			String originalcurrency = ParamUtil.getString(request, "originalcurrency");
			String basiccurrency = ParamUtil.getString(request, "basiccurrency");
			String exchangerate = ParamUtil.getString(request, "exchangerate");
			String publishdate = ParamUtil.getString(request, "publishdate");
			String validfrom = ParamUtil.getString(request, "validfrom");
			String validuntil = ParamUtil.getString(request, "validuntil");
			
			if (id > 0) {
				NewExchangeRate newExchangeRate = NewExchangeRateLocalServiceUtil.getNewExchangeRate(id);
				newExchangeRate.setExchangeRate(ConvertUtil.convertToDouble(exchangerate));
				newExchangeRate.setPublishDate(DateUtils.stringToDate(publishdate, "dd/MM/yyyy HH:mm"));
				newExchangeRate.setValidFrom(DateUtils.stringToDate(validfrom, "dd/MM/yyyy HH:mm"));
				newExchangeRate.setValidUntil(DateUtils.stringToDate(validuntil, "dd/MM/yyyy HH:mm"));
				NewExchangeRateLocalServiceUtil.updateNewExchangeRate(newExchangeRate);
			}
			
		} catch (Exception e) {
			_log.error(e);
		}
		
		PortletConfig portletConfig = (PortletConfig)request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request,  portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(request,  portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public void deleteDanhGiaDoanhNghiep(ActionRequest actionRequest, ActionResponse actionResponse) 
			throws Exception {
		
		String specificationgroupcode = ParamUtil.getString(actionRequest, "specificationgroupcode");
		long assessmentOfImporterId = ParamUtil.getLong(actionRequest, Constants.ID_ASSESSMENTOFIMPORTER);
		String assessmentid = ParamUtil.getString(actionRequest, "assessmentid");
		String assessmentyear = ParamUtil.getString(actionRequest, "assessmentyear");
		
		AssessmentofImporter assessmentOfImporter = AssessmentofImporterLocalServiceUtil.getAssessmentofImporter(assessmentOfImporterId);
		
		assessmentOfImporter.setAssessmentid("");
		assessmentOfImporter.setAssessmentyear("");
		assessmentOfImporter.setSynchdate(new Date());
		
		AssessmentofImporterLocalServiceUtil.updateAssessmentofImporter(assessmentOfImporter);
		
		List<AssessmentSpecification> listAssessmentSpecification = 
			AssessmentSpecificationLocalServiceUtil.findByImporterCode(
				specificationgroupcode, assessmentOfImporter.getImportercode(), 
				assessmentid, assessmentyear);
		
		for(AssessmentSpecification assessmentSpecification : listAssessmentSpecification) {
			AssessmentSpecificationLocalServiceUtil.deleteAssessmentSpecification(assessmentSpecification);
		}
	}
	
	public void updateDanhGiaDoanhNghiep(ActionRequest actionRequest, ActionResponse actionResponse) 
		throws Exception {
		
		String specificationgroupcode = ParamUtil.getString(actionRequest, "specificationgroupcode");
		long assessmentOfImporterId = ParamUtil.getLong(actionRequest, Constants.ID_ASSESSMENTOFIMPORTER);
		String assessmentid = ParamUtil.getString(actionRequest, "assessmentid");
		String assessmentyear = ParamUtil.getString(actionRequest, "assessmentyear");
		String evaluationperiod = ParamUtil.getString(actionRequest, "evaluationperiod");
		
		String RETURN_URL = ParamUtil.getString(actionRequest, Constants.RETURN_URL);
		
		AssessmentofImporter assessmentOfImporter = null;
		
		try {
		
			if(assessmentOfImporterId > 0) {
				assessmentOfImporter = AssessmentofImporterLocalServiceUtil.getAssessmentofImporter(assessmentOfImporterId);
			}
			
			if(assessmentOfImporter != null) {
				int[] rowIndexs = ParamUtil.getIntegerValues(actionRequest, "rowIndex");
				
				double sumMark = 0;
				
				for(int rowIndex : rowIndexs) {
					String specificationcode = ParamUtil.getString(actionRequest, "specificationcode" + rowIndex);
					String specificationvalue = ParamUtil.getString(actionRequest, "specificationvalue" + rowIndex);
					String specificationname = ParamUtil.getString(actionRequest, "specificationname" + rowIndex);
					String specificationdescription = ParamUtil.getString(actionRequest, "specificationdescription" + rowIndex);
					
					double assessmentindex = ParamUtil.getDouble(actionRequest, "assessmentindex" + rowIndex);
					double assessmentcoefficient = ParamUtil.getDouble(actionRequest, "assessmentcoefficient" + rowIndex);
					
					double assessmentmark = assessmentindex * assessmentcoefficient;
					sumMark = sumMark + assessmentmark;
					
					List<AssessmentSpecification> listAssessmentSpecification = 
						AssessmentSpecificationLocalServiceUtil.findByImporterCodeAndSpecificationCode(
								specificationgroupcode, assessmentOfImporter.getImportercode(), specificationcode, assessmentid, assessmentyear);
					
					AssessmentSpecification assessmentSpecification = null;
					
					if(listAssessmentSpecification != null && listAssessmentSpecification.size() > 0) {
						// update
						assessmentSpecification = listAssessmentSpecification.get(0);
					} else {
						// add
						long assessmentSpecificationId = CounterLocalServiceUtil.increment(AssessmentSpecification.class.getName());
						assessmentSpecification = AssessmentSpecificationLocalServiceUtil.createAssessmentSpecification(assessmentSpecificationId);
					}
					
					assessmentSpecification.setSynchdate(new Date());
					assessmentSpecification.setAssessmentid(assessmentid);
					assessmentSpecification.setAssessmentyear(assessmentyear);
					assessmentSpecification.setImportercode(assessmentOfImporter.getImportercode());
					assessmentSpecification.setAssessmenttype(String.valueOf(1));
					assessmentSpecification.setSpecificationgroupcode(specificationgroupcode);
					assessmentSpecification.setSpecificationcode(specificationcode);
					assessmentSpecification.setSpecificationvalue(specificationvalue);
					assessmentSpecification.setSpecificationname(specificationname);
					assessmentSpecification.setSpecificationdescription(specificationdescription);
					assessmentSpecification.setAssessmentindex(assessmentindex);
					assessmentSpecification.setAssessmentcoefficient(assessmentcoefficient);
					assessmentSpecification.setAssessmentmark(assessmentmark);
					
					AssessmentSpecificationLocalServiceUtil.updateAssessmentSpecification(assessmentSpecification);
				}
				
				assessmentOfImporter.setSumMark(sumMark);
				assessmentOfImporter.setAssessmentid(assessmentid);
				assessmentOfImporter.setAssessmentyear(assessmentyear);
				assessmentOfImporter.setEvaluationperiod(evaluationperiod);
				assessmentOfImporter.setLatestassessment(new Date());
				assessmentOfImporter.setSynchdate(new Date());
				AssessmentofImporterLocalServiceUtil.updateAssessmentofImporter(assessmentOfImporter);
			}
		} catch(Exception e) {
			_log.error(e);
			SessionErrors.add(actionRequest, e.getClass());
		}
		
		if(Validator.isNotNull(RETURN_URL)) {
			actionResponse.sendRedirect(RETURN_URL);
		}
	}
	
	
	public void deleteTieuChiKiemSoatDoanhNghiep(ActionRequest actionRequest, ActionResponse actionResponse) 
			throws Exception {
		
		String specificationgroupcode = ParamUtil.getString(actionRequest, "specificationgroupcode");
		long assessmentOfImporterId = ParamUtil.getLong(actionRequest, Constants.ID_ASSESSMENTOFIMPORTER);
		String assessmentid = ParamUtil.getString(actionRequest, "assessmentid");
		String assessmentyear = ParamUtil.getString(actionRequest, "assessmentyear");
		
		AssessmentofImporterControl assessmentOfImporter = AssessmentofImporterControlLocalServiceUtil.getAssessmentofImporterControl(assessmentOfImporterId);
		
		assessmentOfImporter.setAssessmentid("");
		assessmentOfImporter.setAssessmentyear("");
		assessmentOfImporter.setSynchdate(new Date());
		
		AssessmentofImporterControlLocalServiceUtil.updateAssessmentofImporterControl(assessmentOfImporter);
		
		List<AssessmentSpecification> listAssessmentSpecification = 
			AssessmentSpecificationLocalServiceUtil.findByImporterCode(
				specificationgroupcode, assessmentOfImporter.getImportercode(), 
				assessmentid, assessmentyear);
		
		for(AssessmentSpecification assessmentSpecification : listAssessmentSpecification) {
			AssessmentSpecificationLocalServiceUtil.deleteAssessmentSpecification(assessmentSpecification);
		}
	}
	
	public void updateTieuChiKiemSoatDoanhNghiep(ActionRequest actionRequest, ActionResponse actionResponse) 
		throws Exception {
		
		String specificationgroupcode = ParamUtil.getString(actionRequest, "specificationgroupcode");
		long assessmentOfImporterId = ParamUtil.getLong(actionRequest, Constants.ID_ASSESSMENTOFIMPORTER);
		String assessmentid = ParamUtil.getString(actionRequest, "assessmentid");
		String assessmentyear = ParamUtil.getString(actionRequest, "assessmentyear");
		String evaluationperiod = ParamUtil.getString(actionRequest, "evaluationperiod");
		
		String RETURN_URL = ParamUtil.getString(actionRequest, Constants.RETURN_URL);
		
		AssessmentofImporterControl assessmentOfImporter = null;
		
		try {
		
			if(assessmentOfImporterId > 0) {
				assessmentOfImporter = AssessmentofImporterControlLocalServiceUtil.getAssessmentofImporterControl(assessmentOfImporterId);
			}
			
			if(assessmentOfImporter != null) {
				int[] rowIndexs = ParamUtil.getIntegerValues(actionRequest, "rowIndex");
				
				double sumMark = 0;
				
				for(int rowIndex : rowIndexs) {
					String specificationcode = ParamUtil.getString(actionRequest, "specificationcode" + rowIndex);
					String specificationvalue = ParamUtil.getString(actionRequest, "specificationvalue" + rowIndex);
					String specificationname = ParamUtil.getString(actionRequest, "specificationname" + rowIndex);
					String specificationdescription = ParamUtil.getString(actionRequest, "specificationdescription" + rowIndex);
					
					double assessmentindex = ParamUtil.getDouble(actionRequest, "assessmentindex" + rowIndex);
					double assessmentcoefficient = ParamUtil.getDouble(actionRequest, "assessmentcoefficient" + rowIndex);
					
					double assessmentmark = assessmentindex * assessmentcoefficient;
					sumMark = sumMark + assessmentmark;
					
					List<AssessmentSpecification> listAssessmentSpecification = 
						AssessmentSpecificationLocalServiceUtil.findByImporterCodeAndSpecificationCode(
								specificationgroupcode, assessmentOfImporter.getImportercode(), specificationcode, assessmentid, assessmentyear);
					
					AssessmentSpecification assessmentSpecification = null;
					
					if(listAssessmentSpecification != null && listAssessmentSpecification.size() > 0) {
						// update
						assessmentSpecification = listAssessmentSpecification.get(0);
					} else {
						// add
						long assessmentSpecificationId = CounterLocalServiceUtil.increment(AssessmentSpecification.class.getName());
						assessmentSpecification = AssessmentSpecificationLocalServiceUtil.createAssessmentSpecification(assessmentSpecificationId);
					}
					
					assessmentSpecification.setSynchdate(new Date());
					assessmentSpecification.setLatestassessment(new Date());
					assessmentSpecification.setAssessmentid(assessmentid);
					assessmentSpecification.setAssessmentyear(assessmentyear);
					assessmentSpecification.setImportercode(assessmentOfImporter.getImportercode());
					assessmentSpecification.setAssessmenttype(String.valueOf(2));
					assessmentSpecification.setSpecificationgroupcode(specificationgroupcode);
					assessmentSpecification.setSpecificationcode(specificationcode);
					assessmentSpecification.setSpecificationvalue(specificationvalue);
					assessmentSpecification.setSpecificationname(specificationname);
					assessmentSpecification.setSpecificationdescription(specificationdescription);
					assessmentSpecification.setAssessmentindex(assessmentindex);
					assessmentSpecification.setAssessmentcoefficient(assessmentcoefficient);
					assessmentSpecification.setAssessmentmark(assessmentmark);
					
					AssessmentSpecificationLocalServiceUtil.updateAssessmentSpecification(assessmentSpecification);
				}
				
				assessmentOfImporter.setSumMark(sumMark);
				assessmentOfImporter.setAssessmentid(assessmentid);
				assessmentOfImporter.setAssessmentyear(assessmentyear);
				assessmentOfImporter.setEvaluationperiod(evaluationperiod);
				assessmentOfImporter.setLatestassessment(new Date());
				assessmentOfImporter.setSynchdate(new Date());
				AssessmentofImporterControlLocalServiceUtil.updateAssessmentofImporterControl(assessmentOfImporter);
			}
		} catch(Exception e) {
			_log.error(e);
			SessionErrors.add(actionRequest, e.getClass());
		}
		
		if(Validator.isNotNull(RETURN_URL)) {
			actionResponse.sendRedirect(RETURN_URL);
		}
	}
	
	
	public void deleteTieuChiKiemSoatRuiRoSanPham(ActionRequest actionRequest, ActionResponse actionResponse) 
			throws Exception {
		
		String specificationgroupcode = ParamUtil.getString(actionRequest, "specificationgroupcode");
		long assessmentOfProductId = ParamUtil.getLong(actionRequest, Constants.ID_ASSESSMENTOFPRODUCT);
		String assessmentid = ParamUtil.getString(actionRequest, "assessmentid");
		String assessmentyear = ParamUtil.getString(actionRequest, "assessmentyear");
		
		AssessmentofProduct assessmentOfProduct = AssessmentofProductLocalServiceUtil.getAssessmentofProduct(assessmentOfProductId);
		
		assessmentOfProduct.setAssessmentid("");
		assessmentOfProduct.setAssessmentyear("");
		assessmentOfProduct.setSynchdate(new Date());
		
		AssessmentofProductLocalServiceUtil.updateAssessmentofProduct(assessmentOfProduct);
		
		List<AssessmentSpecification> listAssessmentSpecification = 
			AssessmentSpecificationLocalServiceUtil.findByProductionCode(
				specificationgroupcode, assessmentOfProduct.getProductcode(), 
				assessmentid, assessmentyear);
		
		for(AssessmentSpecification assessmentSpecification : listAssessmentSpecification) {
			AssessmentSpecificationLocalServiceUtil.deleteAssessmentSpecification(assessmentSpecification);
		}
	}
	
	public void updateTieuChiKiemSoatRuiRoSanPham(ActionRequest actionRequest, ActionResponse actionResponse) 
		throws Exception {
		
		String specificationgroupcode = ParamUtil.getString(actionRequest, "specificationgroupcode");
		long assessmentOfProductID = ParamUtil.getLong(actionRequest, Constants.ID_ASSESSMENTOFPRODUCT);
		String assessmentid = ParamUtil.getString(actionRequest, "assessmentid");
		String assessmentyear = ParamUtil.getString(actionRequest, "assessmentyear");
		String evaluationperiod = ParamUtil.getString(actionRequest, "evaluationperiod");
		
		String RETURN_URL = ParamUtil.getString(actionRequest, Constants.RETURN_URL);
		
		AssessmentofProduct assessmentOfProduct = null;
		
		try {
		
			if(assessmentOfProductID > 0) {
				assessmentOfProduct = AssessmentofProductLocalServiceUtil.getAssessmentofProduct(assessmentOfProductID);
			}
			
			if(assessmentOfProduct != null) {
				int[] rowIndexs = ParamUtil.getIntegerValues(actionRequest, "rowIndex");
				
				double sumMark = 0;
				
				for(int rowIndex : rowIndexs) {
					String specificationcode = ParamUtil.getString(actionRequest, "specificationcode" + rowIndex);
					String specificationvalue = ParamUtil.getString(actionRequest, "specificationvalue" + rowIndex);
					String specificationname = ParamUtil.getString(actionRequest, "specificationname" + rowIndex);
					String specificationdescription = ParamUtil.getString(actionRequest, "specificationdescription" + rowIndex);
					
					double assessmentindex = ParamUtil.getDouble(actionRequest, "assessmentindex" + rowIndex);
					double assessmentcoefficient = ParamUtil.getDouble(actionRequest, "assessmentcoefficient" + rowIndex);
					
					double assessmentmark = assessmentindex * assessmentcoefficient;
					sumMark = sumMark + assessmentmark;
					
					List<AssessmentSpecification> listAssessmentSpecification = 
						AssessmentSpecificationLocalServiceUtil.findByProductionCodeAndSpecificationCode(
								specificationgroupcode, assessmentOfProduct.getProductcode(), specificationcode, assessmentid, assessmentyear);
					
					AssessmentSpecification assessmentSpecification = null;
					
					if(listAssessmentSpecification != null && listAssessmentSpecification.size() > 0) {
						// update
						assessmentSpecification = listAssessmentSpecification.get(0);
					} else {
						// add
						long assessmentSpecificationId = CounterLocalServiceUtil.increment(AssessmentSpecification.class.getName());
						assessmentSpecification = AssessmentSpecificationLocalServiceUtil.createAssessmentSpecification(assessmentSpecificationId);
					}
					
					assessmentSpecification.setSynchdate(new Date());
					assessmentSpecification.setLatestassessment(new Date());
					assessmentSpecification.setAssessmentid(assessmentid);
					assessmentSpecification.setAssessmentyear(assessmentyear);
					assessmentSpecification.setProductioncode(assessmentOfProduct.getProductcode());
					assessmentSpecification.setAssessmenttype(String.valueOf(3));
					assessmentSpecification.setSpecificationgroupcode(specificationgroupcode);
					assessmentSpecification.setSpecificationcode(specificationcode);
					assessmentSpecification.setSpecificationvalue(specificationvalue);
					assessmentSpecification.setSpecificationname(specificationname);
					assessmentSpecification.setSpecificationdescription(specificationdescription);
					assessmentSpecification.setAssessmentindex(assessmentindex);
					assessmentSpecification.setAssessmentcoefficient(assessmentcoefficient);
					assessmentSpecification.setAssessmentmark(assessmentmark);
					
					AssessmentSpecificationLocalServiceUtil.updateAssessmentSpecification(assessmentSpecification);
				}
				
				assessmentOfProduct.setSumMark(sumMark);
				assessmentOfProduct.setAssessmentid(assessmentid);
				assessmentOfProduct.setAssessmentyear(assessmentyear);
				assessmentOfProduct.setEvaluationperiod(evaluationperiod);
				assessmentOfProduct.setLatestassessment(new Date());
				assessmentOfProduct.setSynchdate(new Date());
				AssessmentofProductLocalServiceUtil.updateAssessmentofProduct(assessmentOfProduct);
			}
		} catch(Exception e) {
			_log.error(e);
			SessionErrors.add(actionRequest, e.getClass());
		}
		
		if(Validator.isNotNull(RETURN_URL)) {
			actionResponse.sendRedirect(RETURN_URL);
		}
	}
	
	public void deleteTieuChiDanhGiaNhanSu(ActionRequest actionRequest, ActionResponse actionResponse) 
			throws Exception {
		
		String specificationgroupcode = ParamUtil.getString(actionRequest, "specificationgroupcode");
		long assessmentOfInspectorID = ParamUtil.getLong(actionRequest, Constants.ID_ASSESSMENTOFINSPECTOR);
		String assessmentid = ParamUtil.getString(actionRequest, "assessmentid");
		String assessmentyear = ParamUtil.getString(actionRequest, "assessmentyear");
		
		AssessmentofInspector assessmentOfInspector = AssessmentofInspectorLocalServiceUtil.getAssessmentofInspector(assessmentOfInspectorID);
		
		assessmentOfInspector.setAssessmentid("");
		assessmentOfInspector.setAssessmentyear("");
		assessmentOfInspector.setSynchdate(new Date());
		
		AssessmentofInspectorLocalServiceUtil.updateAssessmentofInspector(assessmentOfInspector);
		
		List<AssessmentSpecification> listAssessmentSpecification = 
			AssessmentSpecificationLocalServiceUtil.findByInspectorContactcode(
				specificationgroupcode, assessmentOfInspector.getInspectorcontactcode(), 
				assessmentid, assessmentyear);
		
		for(AssessmentSpecification assessmentSpecification : listAssessmentSpecification) {
			AssessmentSpecificationLocalServiceUtil.deleteAssessmentSpecification(assessmentSpecification);
		}
	}
	
	public void updateTieuChiDanhGiaNhanSu(ActionRequest actionRequest, ActionResponse actionResponse) 
		throws Exception {
		
		String specificationgroupcode = ParamUtil.getString(actionRequest, "specificationgroupcode");
		long assessmentOfInspectorID = ParamUtil.getLong(actionRequest, Constants.ID_ASSESSMENTOFINSPECTOR);
		String assessmentid = ParamUtil.getString(actionRequest, "assessmentid");
		String assessmentyear = ParamUtil.getString(actionRequest, "assessmentyear");
		String evaluationperiod = ParamUtil.getString(actionRequest, "evaluationperiod");
		
		String RETURN_URL = ParamUtil.getString(actionRequest, Constants.RETURN_URL);
		
		AssessmentofInspector assessmentOfInspector = null;
		
		try {
		
			if(assessmentOfInspectorID > 0) {
				assessmentOfInspector = AssessmentofInspectorLocalServiceUtil.getAssessmentofInspector(assessmentOfInspectorID);
			}
			
			if(assessmentOfInspector != null) {
				int[] rowIndexs = ParamUtil.getIntegerValues(actionRequest, "rowIndex");
				
				double sumMark = 0;
				
				for(int rowIndex : rowIndexs) {
					String specificationcode = ParamUtil.getString(actionRequest, "specificationcode" + rowIndex);
					String specificationvalue = ParamUtil.getString(actionRequest, "specificationvalue" + rowIndex);
					String specificationname = ParamUtil.getString(actionRequest, "specificationname" + rowIndex);
					String specificationdescription = ParamUtil.getString(actionRequest, "specificationdescription" + rowIndex);
					
					double assessmentindex = ParamUtil.getDouble(actionRequest, "assessmentindex" + rowIndex);
					double assessmentcoefficient = ParamUtil.getDouble(actionRequest, "assessmentcoefficient" + rowIndex);
					
					double assessmentmark = assessmentindex * assessmentcoefficient;
					sumMark = sumMark + assessmentmark;
					
					List<AssessmentSpecification> listAssessmentSpecification = 
						AssessmentSpecificationLocalServiceUtil.findByInspectorContactcodeAndSpecificationCode(
								specificationgroupcode, assessmentOfInspector.getInspectorcontactcode(), specificationcode, assessmentid, assessmentyear);
					
					AssessmentSpecification assessmentSpecification = null;
					
					if(listAssessmentSpecification != null && listAssessmentSpecification.size() > 0) {
						// update
						assessmentSpecification = listAssessmentSpecification.get(0);
					} else {
						// add
						long assessmentSpecificationId = CounterLocalServiceUtil.increment(AssessmentSpecification.class.getName());
						assessmentSpecification = AssessmentSpecificationLocalServiceUtil.createAssessmentSpecification(assessmentSpecificationId);
					}
					
					assessmentSpecification.setSynchdate(new Date());
					assessmentSpecification.setLatestassessment(new Date());
					assessmentSpecification.setAssessmentid(assessmentid);
					assessmentSpecification.setAssessmentyear(assessmentyear);
					assessmentSpecification.setInspectorcontactcode(assessmentOfInspector.getInspectorcontactcode());
					assessmentSpecification.setAssessmenttype(String.valueOf(4));
					assessmentSpecification.setSpecificationgroupcode(specificationgroupcode);
					assessmentSpecification.setSpecificationcode(specificationcode);
					assessmentSpecification.setSpecificationvalue(specificationvalue);
					assessmentSpecification.setSpecificationname(specificationname);
					assessmentSpecification.setSpecificationdescription(specificationdescription);
					assessmentSpecification.setAssessmentindex(assessmentindex);
					assessmentSpecification.setAssessmentcoefficient(assessmentcoefficient);
					assessmentSpecification.setAssessmentmark(assessmentmark);
					
					AssessmentSpecificationLocalServiceUtil.updateAssessmentSpecification(assessmentSpecification);
				}
				
				assessmentOfInspector.setSumMark(sumMark);
				assessmentOfInspector.setAssessmentid(assessmentid);
				assessmentOfInspector.setAssessmentyear(assessmentyear);
				assessmentOfInspector.setEvaluationperiod(evaluationperiod);
				assessmentOfInspector.setLatestassessment(new Date());
				assessmentOfInspector.setSynchdate(new Date());
				AssessmentofInspectorLocalServiceUtil.updateAssessmentofInspector(assessmentOfInspector);
			}
		} catch(Exception e) {
			_log.error(e);
			SessionErrors.add(actionRequest, e.getClass());
		}
		
		if(Validator.isNotNull(RETURN_URL)) {
			actionResponse.sendRedirect(RETURN_URL);
		}
	}
	
	public void deleteAssessmentofInspectionMethod(ActionRequest actionRequest, ActionResponse actionResponse) 
			throws Exception {
		
		long assessmentofInspectionMethodId = ParamUtil.getLong(
				actionRequest, Constants.ID_ASSESSMENTOFINSPECTIONMETHOD);
		
		String RETURN_URL = ParamUtil.getString(actionRequest, Constants.RETURN_URL);
		
		try {
			AssessmentofInspectionMethodLocalServiceUtil.deleteAssessmentofInspectionMethod(
				assessmentofInspectionMethodId);
		} catch(Exception e) {
			_log.error(e);
			SessionErrors.add(actionRequest, e.getClass());
		}
		
		if(Validator.isNotNull(RETURN_URL)) {
			actionResponse.sendRedirect(RETURN_URL);
		}
	}
	
	public void updateAssessmentofInspectionMethod(ActionRequest actionRequest, ActionResponse actionResponse) 
		throws Exception {
		
		long assessmentofInspectionMethodId = ParamUtil.getLong(
				actionRequest, Constants.ID_ASSESSMENTOFINSPECTIONMETHOD);
		String assessmentid = ParamUtil.getString(actionRequest, "assessmentid");
		String assessmentyear = ParamUtil.getString(actionRequest, "assessmentyear");
		String evaluationperiod = ParamUtil.getString(actionRequest, "evaluationperiod");
		String methodcode = ParamUtil.getString(actionRequest, "methodcode");
		String methodname = ParamUtil.getString(actionRequest, "methodname");
		int methodsequenceno = ParamUtil.getInteger(actionRequest, "methodsequenceno");
		String methoddescription = ParamUtil.getString(actionRequest, "methoddescription");
		String ImporterRiskDescription = ParamUtil.getString(actionRequest, "ImporterRiskDescription");
		double A1MarkFloor = ParamUtil.getDouble(actionRequest, "A1MarkFloor");
		double A1MarkCeil = ParamUtil.getDouble(actionRequest, "A1MarkCeil");
		String ProductRiskDescription = ParamUtil.getString(actionRequest, "ProductRiskDescription");
		double A301MarkFloor = ParamUtil.getDouble(actionRequest, "A301MarkFloor");
		double A301MarkCeil = ParamUtil.getDouble(actionRequest, "A301MarkCeil");
		String PurposeRiskDescription = ParamUtil.getString(actionRequest, "PurposeRiskDescription");
		double A302Mark = ParamUtil.getDouble(actionRequest, "A302Mark");
		String CertifiedRiskDescription = ParamUtil.getString(actionRequest, "CertifiedRiskDescription");
		double A304Mark = ParamUtil.getDouble(actionRequest, "A304Mark");
		String UsageRiskDescription = ParamUtil.getString(actionRequest, "UsageRiskDescription");
		double A303Mark = ParamUtil.getDouble(actionRequest, "A303Mark");
		String TransportRiskDescription = ParamUtil.getString(actionRequest, "TransportRiskDescription");
		double A305Mark = ParamUtil.getDouble(actionRequest, "A305Mark");
		
		String RETURN_URL = ParamUtil.getString(actionRequest, Constants.RETURN_URL);
		
		AssessmentofInspectionMethod assessmentofInspectionMethod = null;
		
		try {
		
			if(assessmentofInspectionMethodId > 0) {
				assessmentofInspectionMethod = AssessmentofInspectionMethodLocalServiceUtil.
					getAssessmentofInspectionMethod(assessmentofInspectionMethodId);
			}
			
			if(assessmentofInspectionMethod == null) {
				assessmentofInspectionMethodId = CounterLocalServiceUtil.increment(AssessmentofInspectionMethod.class.getName());
				assessmentofInspectionMethod = AssessmentofInspectionMethodLocalServiceUtil.createAssessmentofInspectionMethod(assessmentofInspectionMethodId);
			}
			
			assessmentofInspectionMethod.setSynchdate(new Date());
			assessmentofInspectionMethod.setAssessmentid(assessmentid);
			assessmentofInspectionMethod.setAssessmentyear(assessmentyear);
			assessmentofInspectionMethod.setEvaluationperiod(evaluationperiod);
			assessmentofInspectionMethod.setMethodcode(methodcode);
			assessmentofInspectionMethod.setMethodname(methodname);
			assessmentofInspectionMethod.setMethodsequenceno(methodsequenceno);
			assessmentofInspectionMethod.setMethoddescription(methoddescription);
			assessmentofInspectionMethod.setImporterRiskDescription(ImporterRiskDescription);
			assessmentofInspectionMethod.setA1MarkFloor(A1MarkFloor);
			assessmentofInspectionMethod.setA1MarkCeil(A1MarkCeil);
			assessmentofInspectionMethod.setProductRiskDescription(ProductRiskDescription);
			assessmentofInspectionMethod.setA301MarkFloor(A301MarkFloor);
			assessmentofInspectionMethod.setA301MarkCeil(A301MarkCeil);
			assessmentofInspectionMethod.setPurposeRiskDescription(PurposeRiskDescription);
			assessmentofInspectionMethod.setA302Mark(A302Mark);
			assessmentofInspectionMethod.setCertifiedRiskDescription(CertifiedRiskDescription);
			assessmentofInspectionMethod.setA304Mark(A304Mark);
			assessmentofInspectionMethod.setUsageRiskDescription(UsageRiskDescription);
			assessmentofInspectionMethod.setA303Mark(A303Mark);
			assessmentofInspectionMethod.setTransportRiskDescription(TransportRiskDescription);
			assessmentofInspectionMethod.setA305Mark(A305Mark);
			
			AssessmentofInspectionMethodLocalServiceUtil.updateAssessmentofInspectionMethod(assessmentofInspectionMethod);
		} catch(Exception e) {
			_log.error(e);
			SessionErrors.add(actionRequest, e.getClass());
		}
		
		if(Validator.isNotNull(RETURN_URL)) {
			actionResponse.sendRedirect(RETURN_URL);
		}
	}
	
	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) 
		throws IOException, PortletException {
		
		String type = ParamUtil.getString(resourceRequest, "type");
		
		if(type.equalsIgnoreCase("findAssessmentofProduct")) {
			findAssessmentofProduct(resourceRequest, resourceResponse);
		} else if(type.equalsIgnoreCase("validateIssueTrackingOnline")) {
			validateIssueTrackingOnline(resourceRequest, resourceResponse);
		}
	}
	
	private void findAssessmentofProduct(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		try {
			
			long assessmentPeriodId = ParamUtil.getLong(resourceRequest, Constants.ID_ASSESSMENT_PERIOD);
			
			String assessmentid = "";
			String assessmentyear = "";
			
			if(assessmentPeriodId > 0) {
				AssessmentPeriod assessmentPeriod = AssessmentPeriodLocalServiceUtil.getAssessmentPeriod(assessmentPeriodId);
				assessmentid = assessmentPeriod.getAssessmentid();
				assessmentyear = assessmentPeriod.getAssessmentyear();
			}
			
			List<AssessmentofProduct> listAssessmentofProduct = new ArrayList<AssessmentofProduct>(); 
			
			if(Validator.isNotNull(assessmentid) && Validator.isNotNull(assessmentyear)) {
				listAssessmentofProduct = AssessmentofProductLocalServiceUtil.findByAssessmentId_AssessmentYear(assessmentid, assessmentyear);
			}
			
			JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
			JSONObject obj = null;
			
			if (listAssessmentofProduct != null && listAssessmentofProduct.size() > 0) {
				for (AssessmentofProduct assessmentofProduct : listAssessmentofProduct) {
					obj = JSONFactoryUtil.createJSONObject();
					obj.put("id", assessmentofProduct.getId());
					obj.put("name", assessmentofProduct.getProductcode() + " - " + assessmentofProduct.getProductname());
					jsonArray.put(obj);
				}
			}
			
			PrintWriter out = resourceResponse.getWriter();
			out.print(jsonArray.toString());
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void deleteKehoachDanhgiaRuiro(ActionRequest actionRequest, ActionResponse actionResponse) 
			throws Exception {
		try {
			String specificationgroupcode = ParamUtil.getString(actionRequest, "specificationgroupcode");
			long assessmentOfPeriodId = ParamUtil.getLong(actionRequest, Constants.ID_ASSESSMENT_PERIOD);
			String assessmentid = ParamUtil.getString(actionRequest, "assessmentid");
			String assessmentyear = ParamUtil.getString(actionRequest, "assessmentyear");
			
			List<AssessmentSpecificationConfig> assessmentSpecificationConfig = AssessmentSpecificationConfigLocalServiceUtil.findAssessmentSpecificationConfigByKehoach(assessmentid, assessmentyear); 
			AssessmentPeriod assessmentOfPeriod = AssessmentPeriodLocalServiceUtil.getAssessmentPeriod(assessmentOfPeriodId);
			if (assessmentOfPeriod != null){
				AssessmentPeriodLocalServiceUtil.deleteAssessmentPeriod(assessmentOfPeriodId);
				for (AssessmentSpecificationConfig item: assessmentSpecificationConfig){
					AssessmentSpecificationConfigLocalServiceUtil.deleteAssessmentSpecificationConfig(item);
				}			
			}	
		} catch (Exception e) {
		_log.error(e);
		}
	}
	
	
	public void deleteIssueTracking(ActionRequest actionRequest, ActionResponse actionResponse) 
			throws Exception {
		try {
//			String specificationgroupcode = ParamUtil.getString(actionRequest, "specificationgroupcode");
//			long issueTrackingId = ParamUtil.getLong(actionRequest, Constants.ID_ASSESSMENT_ISSUETRACKING);
//			
//			List<IssueCategory> lstIssueCategory = IssueCategoryLocalServiceUtil.
//			
//			IssueTracking itemIssueTracking = IssueTrackingLocalServiceUtil.getIssueTracking(issueTrackingId);
//			if (itemIssueTracking != null){
//				
//				for (AssessmentSpecificationConfig item: assessmentSpecificationConfig){
//					AssessmentSpecificationConfigLocalServiceUtil.deleteAssessmentSpecificationConfig(item);
//				}		
				
				
		} catch (Exception e) {
		_log.error(e);
		}
	}
	private void validateIssueTrackingOnline(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		try {
	
			
			
			
			} catch (Exception e) {
			_log.error(e);
			}
	}
	
	public void addNewIssueTracking(ActionRequest actionRequest, ActionResponse actionResponse) {
		try {
	
			
			
			
			} catch (Exception e) {
			_log.error(e);
			}
	}
}
