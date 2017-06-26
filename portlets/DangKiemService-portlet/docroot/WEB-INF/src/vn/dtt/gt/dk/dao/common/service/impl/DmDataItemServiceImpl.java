/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.dtt.gt.dk.dao.common.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.api.util.ApiUtils;
import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.model.impl.DmDataGroupImpl;
import vn.dtt.gt.dk.dao.common.model.impl.DmDataItemImpl;
import vn.dtt.gt.dk.dao.common.model.impl.TthcBieuMauHoSoImpl;
import vn.dtt.gt.dk.dao.common.model.impl.TthcHoSoThuTucImpl;
import vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoReadImpl;
import vn.dtt.gt.dk.dao.common.model.impl.TthcPhanNhomHoSoImpl;
import vn.dtt.gt.dk.dao.common.model.impl.TthcThuTucHanhChinhImpl;
import vn.dtt.gt.dk.dao.common.service.base.DmDataItemServiceBaseImpl;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgLimitTechnicalSpecImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationAttendeeImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CustomsDeclarationImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequirementImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordAttachImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.NewExchangeRateImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetestRequirementImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupInitialImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleStatisticsImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehiclerecordInitialImpl;
import vn.dtt.gt.dk.utils.PortletPropsValues;

/**
 * The implementation of the dm data item remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.common.service.DmDataItemService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.common.service.base.DmDataItemServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.common.service.DmDataItemServiceUtil
 */
public class DmDataItemServiceImpl extends DmDataItemServiceBaseImpl {
	
	@JSONWebService(value = "count_dm_dataitem", method = "GET")
	public int countDmDataItems() throws SystemException {
		return dmDataItemPersistence.countAll();
	}
	
	@JSONWebService(value = "count_dm_dataitem", method = "GET")
	public int countDmDataItems(String synchronizeddate) throws SystemException {
		
		if(Validator.isNotNull(synchronizeddate)) {
			return dmDataItemFinder.countBySynchDate(synchronizeddate);
		} else {
			return 0;
		}
	}
	
	@JSONWebService(value = "get_dm_dataitem", method = "GET")
	public List<DmDataItem> getDmDataItems(int start, int end) 
			throws SystemException {
		return dmDataItemPersistence.findAll(start, end);
	}
	
	@JSONWebService(value = "get_dm_dataitem", method = "GET")
	public List<DmDataItem> getDmDataItems(String synchronizeddate, int start, int end) 
			throws SystemException {
		
		if(Validator.isNotNull(synchronizeddate)) {
			return dmDataItemFinder.findBySynchDate(synchronizeddate, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} else {
			return new ArrayList<DmDataItem>();
		}
	}
	
	@JSONWebService(value = "fetch_dm_dataitem", method = "GET")
	public DmDataItem getByDataGroupIdAndItemCode0(String datagroupid, String code0) 
			throws SystemException {
		
		return dmDataItemFinder.findByDataGroupCodeAndDataItemCode0(datagroupid, code0);
	}
	
	@JSONWebService(value = "fetch_dm_dataitem", method = "GET")
	public List<DmDataItem> getDmDataItemByGroupCode(String datagroupid) 
			throws SystemException {
		
		return dmDataItemFinder.findByDmDataGroupCode(datagroupid, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}
	
	@JSONWebService(value = "get_dm_dataitem", method = "GET")
	public List<DmDataItem> getDmDataItemByValidateFrom(String validatefrom) 
			throws SystemException {
		
		return dmDataItemFinder.findByValidateFrom(validatefrom, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}
	
	@JSONWebService(value = "getByGC_C0_C1_C2_C3_L_AN", method = "GET")
	public List<DmDataItem> getByGC_C0_C1_C2_C3_L_AN(String groupCode, String code0, 
			String code1, String code2, String code3, Integer level, String alterName) 
		throws SystemException {
		
		return dmDataItemFinder.findByGN_C0_C1_C2_C3_L_AN(groupCode, code0, 
				code1, code2, code3, level, alterName, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}
	
	@JSONWebService(value = "getByGN_C0_C1_C2_C3_L_AN", method = "GET")
	public List<DmDataItem> getByGN_C0_C1_C2_C3_L_AN(String groupName, String code0, 
			String code1, String code2, String code3, Integer level, String alterName) 
		throws SystemException {
		
		return dmDataItemFinder.findByGN_C0_C1_C2_C3_L_AN(groupName, code0, 
				code1, code2, code3, level, alterName, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}
	
	@JSONWebService(value = "count_hosonghiepvu", method = "GET")
	public int countHoSoNghiepVuBySynchDate(String tablename, String synchronizeddate) 
		throws SystemException {
		
		if(_log.isInfoEnabled()) {
			_log.info("===countHoSoNghiepVuBySynchDate===" + 
					tablename + "_" + synchronizeddate);
		}
		
		int result = 0;
		
		if(Validator.isNotNull(tablename)) {
			tablename = tablename.toLowerCase();
			
			String column = PortletPropsValues.COLUMN_SYNCH_DATE;
			String schema = PortletPropsValues.SCHEMA_NGHIEPVU;
			
			if(tablename.equals("dm_datagroup")) {
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
			} else if(tablename.equals("dm_dataitem")) {
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
			} else if(tablename.equals("tthc_phannhomhoso")) {
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
			} else if(tablename.equals("tthc_bieumauhoso")) {
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
			} else if(tablename.equals("tthc_hosothutuc")) {
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
			} else if(tablename.equals("tthc_noidunghoso")) {
				column = "ngayguinhan";
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
			} else if(tablename.equals("motcua_dienbienhoso")) {
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
			} else if(tablename.equals("tthc_thutuchanhchinh")) {
				column = "";
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
			}
			
			result = dmDataItemFinder.countHoSoNghiepVuBySynchDate(schema, tablename, column, synchronizeddate);
		}
		
		return result;
	}
	
	@JSONWebService(value = "get_hosonghiepvu", method = "GET")
	public Object getHoSoNghiepVuById(String tablename, long id) 
		throws SystemException, PortalException {
		
		Object result = null;
		
		if(Validator.isNotNull(tablename)) {
			tablename = tablename.toLowerCase();
			
			String column = "id";
			String schema = PortletPropsValues.SCHEMA_NGHIEPVU;
			Class<?> entityClass = null;
			
			if(tablename.equals("dm_datagroup")) {
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
				entityClass = DmDataGroupImpl.class;
			} else if(tablename.equals("dm_dataitem")) {
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
				entityClass = DmDataItemImpl.class;
			} else if(tablename.equals("vr_cfg_technicalspec")) {
				entityClass = CfgTechnicalspecImpl.class;
			} else if(tablename.equals("vr_cfg_limit_technicalspec")) {
				entityClass = CfgLimitTechnicalSpecImpl.class;
			} else if(tablename.equals("tthc_phannhomhoso")) {
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
				entityClass = TthcPhanNhomHoSoImpl.class;
			} else if(tablename.equals("tthc_bieumauhoso")) {
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
				entityClass = TthcBieuMauHoSoImpl.class;
			} else if(tablename.equals("tthc_hosothutuc")) {
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
				entityClass = TthcHoSoThuTucImpl.class;
			} else if(tablename.equals("tthc_noidunghoso")) {
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
				entityClass = TthcNoidungHoSoReadImpl.class;
			} else if(tablename.equals("motcua_dienbienhoso")) {
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
				entityClass = MotCuaDienBienHoSoImpl.class;
			} else if(tablename.equals("tthc_thutuchanhchinh")) {
				column = "";
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
				entityClass = TthcThuTucHanhChinhImpl.class;
			} else if(tablename.equals("vr_registeredinspection")) {
				entityClass = RegisteredInspectionImpl.class;
			} else if(tablename.equals("vr_confirmedinspection")) {
				entityClass = ConfirmedInspectionImpl.class;
			} else if(tablename.equals("vr_vehiclestatistics")) {
				entityClass = VehicleStatisticsImpl.class;
			} else if(tablename.equals("vr_customsdeclaration")) {
				entityClass = CustomsDeclarationImpl.class;
			} else if(tablename.equals("vr_certificaterecord")) {
				entityClass = CertificateRecordImpl.class;
			} else if(tablename.equals("vr_certificaterecordspec")) {
				entityClass = CertificateRecordSpecImpl.class;
			} else if(tablename.equals("vr_controlrequirement")) {
				entityClass = ControlRequirementImpl.class;
			} else if(tablename.equals("vr_corporation_attendee")) {
				entityClass = CorporationAttendeeImpl.class;
			} else if(tablename.equals("vr_corporation_inspector")) {
				entityClass = CorporationInspectorImpl.class;
			} else if(tablename.equals("vr_corporation_view")) {
				entityClass = CorporationViewImpl.class;
			} else if(tablename.equals("vr_emissiontestrequirement")) {
				entityClass = EmissionTestRequirementImpl.class;
			} else if(tablename.equals("vr_inspectioncommonstatus")) {
				entityClass = InspectionCommonStatusImpl.class;
			} else if(tablename.equals("vr_inspectionrecord")) {
				entityClass = InspectionRecordImpl.class;
			} else if(tablename.equals("vr_inspectionrecord_attach")) {
				entityClass = InspectionRecordAttachImpl.class;
			} else if(tablename.equals("vr_inspectionrecordspec")) {
				entityClass = InspectionRecordSpecImpl.class;
			} else if(tablename.equals("vr_new_exchangerate")) {
				entityClass = NewExchangeRateImpl.class;
			} else if(tablename.equals("vr_productioncountry")) {
				entityClass = ProductionCountryImpl.class;
			} else if(tablename.equals("vr_safetestrequirement")) {
				entityClass = SafetestRequirementImpl.class;
			} else if(tablename.equals("vr_vehiclegroup")) {
				entityClass = VehicleGroupImpl.class;
			} else if(tablename.equals("vr_vehiclegroup_initial")) {
				entityClass = VehicleGroupInitialImpl.class;
			} else if(tablename.equals("vr_vehiclerecord")) {
				entityClass = VehicleRecordImpl.class;
			} else if(tablename.equals("vr_vehiclerecord_initial")) {
				entityClass = VehiclerecordInitialImpl.class;
			} else if(tablename.equals("vr_vehiclespecification")) {
				entityClass = VehicleSpecificationImpl.class;
			} 
			
			if(entityClass != null) {
				List<Object> results = dmDataItemFinder.findHoSoNghiepVuBySynchDate(
					schema, tablename, column, entityClass, String.valueOf(id), 0, 1);
				
				ServiceContext serviceContext = ApiUtils.getServiceContext(getUser());
				
				// convert table noidunghoso ra object json co du lieu mong muon
				if(tablename.equals("vr_inspectionrecord_attach")) {
					List<Object> list = new ArrayList<Object>();
					
					for(Object result_ : results) {
						InspectionRecordAttach item = (InspectionRecordAttach) result_;
						
						long oldEntryId = GetterUtil.getLong(item.getEnTryId());
						String urlEntry = ApiUtils.getFileFullURL(getUser().getCompanyId(), 
								oldEntryId, serviceContext);
						
						item.setEnTryId(urlEntry);
						
						list.add(item);
					}
					
					results = list;
				}
				
				if(results != null && results.size() > 0) {
					result = results.get(0);
				}
			}
		}
		
		return result;
	}
	
	@JSONWebService(value = "get_hosonghiepvu", method = "GET")
	public List<Object> getHoSoNghiepVuBySynchDate(String tablename, String synchronizeddate, int start, int end) 
		throws SystemException, PortalException {
		
		if(_log.isInfoEnabled()) {
			_log.info("===getHoSoNghiepVuBySynchDate===" + 
					tablename + "_" + synchronizeddate + "_" + start + "_" + end + "===BEGIN");
		}
		
		List<Object> results = new ArrayList<Object>();
		
		if(Validator.isNotNull(tablename)) {
			tablename = tablename.toLowerCase();
			
			String column = PortletPropsValues.COLUMN_SYNCH_DATE;
			String schema = PortletPropsValues.SCHEMA_NGHIEPVU;
			Class<?> entityClass = null;
			
			if(tablename.equals("dm_datagroup")) {
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
				entityClass = DmDataGroupImpl.class;
			} else if(tablename.equals("dm_dataitem")) {
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
				entityClass = DmDataItemImpl.class;
			} else if(tablename.equals("vr_cfg_technicalspec")) {
				entityClass = CfgTechnicalspecImpl.class;
			} else if(tablename.equals("vr_cfg_limit_technicalspec")) {
				entityClass = CfgLimitTechnicalSpecImpl.class;
			} else if(tablename.equals("tthc_phannhomhoso")) {
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
				entityClass = TthcPhanNhomHoSoImpl.class;
			} else if(tablename.equals("tthc_bieumauhoso")) {
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
				entityClass = TthcBieuMauHoSoImpl.class;
			} else if(tablename.equals("tthc_hosothutuc")) {
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
				entityClass = TthcHoSoThuTucImpl.class;
			} else if(tablename.equals("tthc_noidunghoso")) {
				column = "ngayguinhan";
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
				entityClass = TthcNoidungHoSoReadImpl.class;
			} else if(tablename.equals("tthc_thutuchanhchinh")) {
				column = "";
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
				entityClass = TthcThuTucHanhChinhImpl.class;
			} else if(tablename.equals("motcua_dienbienhoso")) {
				schema = PortletPropsValues.SCHEMA_THUTUCHANHCHINH;
				entityClass = MotCuaDienBienHoSoImpl.class;
			} else if(tablename.equals("vr_registeredinspection")) {
				entityClass = RegisteredInspectionImpl.class;
			} else if(tablename.equals("vr_confirmedinspection")) {
				entityClass = ConfirmedInspectionImpl.class;
			} else if(tablename.equals("vr_vehiclestatistics")) {
				entityClass = VehicleStatisticsImpl.class;
			} else if(tablename.equals("vr_customsdeclaration")) {
				entityClass = CustomsDeclarationImpl.class;
			} else if(tablename.equals("vr_certificaterecord")) {
				entityClass = CertificateRecordImpl.class;
			} else if(tablename.equals("vr_certificaterecordspec")) {
				entityClass = CertificateRecordSpecImpl.class;
			} else if(tablename.equals("vr_controlrequirement")) {
				entityClass = ControlRequirementImpl.class;
			} else if(tablename.equals("vr_corporation_attendee")) {
				entityClass = CorporationAttendeeImpl.class;
			} else if(tablename.equals("vr_corporation_inspector")) {
				entityClass = CorporationInspectorImpl.class;
			} else if(tablename.equals("vr_corporation_view")) {
				entityClass = CorporationViewImpl.class;
			} else if(tablename.equals("vr_emissiontestrequirement")) {
				entityClass = EmissionTestRequirementImpl.class;
			} else if(tablename.equals("vr_inspectioncommonstatus")) {
				entityClass = InspectionCommonStatusImpl.class;
			} else if(tablename.equals("vr_inspectionrecord")) {
				entityClass = InspectionRecordImpl.class;
			} else if(tablename.equals("vr_inspectionrecord_attach")) {
				entityClass = InspectionRecordAttachImpl.class;
			} else if(tablename.equals("vr_inspectionrecordspec")) {
				entityClass = InspectionRecordSpecImpl.class;
			} else if(tablename.equals("vr_new_exchangerate")) {
				entityClass = NewExchangeRateImpl.class;
			} else if(tablename.equals("vr_productioncountry")) {
				entityClass = ProductionCountryImpl.class;
			} else if(tablename.equals("vr_safetestrequirement")) {
				entityClass = SafetestRequirementImpl.class;
			} else if(tablename.equals("vr_vehiclegroup")) {
				entityClass = VehicleGroupImpl.class;
			} else if(tablename.equals("vr_vehiclegroup_initial")) {
				entityClass = VehicleGroupInitialImpl.class;
			} else if(tablename.equals("vr_vehiclerecord")) {
				entityClass = VehicleRecordImpl.class;
			} else if(tablename.equals("vr_vehiclerecord_initial")) {
				entityClass = VehiclerecordInitialImpl.class;
			} else if(tablename.equals("vr_vehiclespecification")) {
				entityClass = VehicleSpecificationImpl.class;
			} 
			
			if(entityClass != null) {
				results = dmDataItemFinder.findHoSoNghiepVuBySynchDate(
					schema, tablename, column, entityClass, synchronizeddate, start, end);
				
				ServiceContext serviceContext = ApiUtils.getServiceContext(getUser());
				
				// convert table noidunghoso ra object json co du lieu mong muon
				if(tablename.equals("vr_inspectionrecord_attach")) {
					List<Object> list = new ArrayList<Object>();
					
					for(Object result_ : results) {
						InspectionRecordAttach item = (InspectionRecordAttach) result_;
						
						long oldEntryId = GetterUtil.getLong(item.getEnTryId());
						String urlEntry = ApiUtils.getFileFullURL(getUser().getCompanyId(), 
								oldEntryId, serviceContext);
						
						item.setEnTryId(urlEntry);
						
						list.add(item);
					}
					
					results = list;
				}
			}
		}
		
		if(_log.isInfoEnabled()) {
			_log.info("===getHoSoNghiepVuBySynchDate===" + 
					tablename + "_" + synchronizeddate + "_" + start + "_" + end + "===END");
		}
		
		return results;
	}
	
	@JSONWebService(value = "get_time", method = "GET")
	public Date getCurrentTime() 
		throws SystemException {
		
		return new Date();
	} 
	
	private static final Log _log = LogFactoryUtil.getLog(DmDataItemServiceImpl.class);
}