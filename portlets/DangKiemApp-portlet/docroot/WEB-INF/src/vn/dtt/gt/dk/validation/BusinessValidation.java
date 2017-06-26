/**
 * 
 */
package vn.dtt.gt.dk.validation;


import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;
import vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue;
import vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl;
import vn.dtt.gt.dk.dao.aswmsg.service.MonitorMessageQueueLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh;
import vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;
import vn.dtt.gt.dk.message.FunctionType;
import vn.dtt.gt.dk.message.MessageType;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.nsw.model.NoticeOfCancellation;
import vn.dtt.gt.dk.nsw.model.RequestChanges;
import vn.dtt.gt.dk.nsw.model.RequestForChangingDateSite;
import vn.dtt.gt.dk.nsw.model.RequestForQualityInspection;
import vn.dtt.gt.dk.nsw.model.StateList;
import vn.dtt.gt.dk.nsw.model.TechnicalSpecification;



/**
 * @author win_64
 *
 */
public class BusinessValidation {

	public static boolean validation(Header header, long idMessageLog, List<Object> lstObject) throws Exception {
		
		AswmsgValidationLog logMessageValidation = new AswmsgValidationLogImpl();
		logMessageValidation.setMessageLogId(idMessageLog);
		
		boolean status = true;
		if(header != null){
			List<MonitorMessageQueue> monitorMessageQueues = MonitorMessageQueueLocalServiceUtil.findByMessageId(header.getReference().getMessageId());
			if(monitorMessageQueues!=null&&monitorMessageQueues.size()>0){
				status = false;
				logMessageValidation.setTagName("He thong BGTVT chua su ly song messsage truoc " + header.getReference().getMessageId());
				ValidationUtils.addLogMessageValidation(logMessageValidation);
			}
			
			if(header.getSubject() != null){
				if(header.getSubject().getFunction().equals(FunctionType.FUNCTION_KHAI_MOI)){
					TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.findByMaThuTuc(header.getSubject().getDocumentType());
					if(thuTucHanhChinh==null){
						status = false;
						logMessageValidation.setTagName("Ma thu tuc khong ton tai" + header.getSubject().getDocumentType());
						ValidationUtils.addLogMessageValidation(logMessageValidation);
						return status;
					}
					TthcHoSoThuTuc hoSoThuTuc =TthcHoSoThuTucLocalServiceUtil.fetchByMaSoHoSo(header.getSubject().getReference()+"");
					if(hoSoThuTuc!=null){
						status = false;
						logMessageValidation.setTagName("Ma so ho so da ton tai" + header.getSubject().getReference());
						ValidationUtils.addLogMessageValidation(logMessageValidation);
					}
					if(status){
						RequestForChangingDateSite requestForChangingDateSite = null;
	
						for (Object object : lstObject) {
	
							if (object instanceof RequestForChangingDateSite) {
								requestForChangingDateSite = RequestForChangingDateSite.class.cast(object);
								if(requestForChangingDateSite!=null&&requestForChangingDateSite.getImportedVehicle()!=null){
									if(requestForChangingDateSite.getTotalNumberVehicle()!=requestForChangingDateSite.getImportedVehicle().size()){
										status = false;
										logMessageValidation.setTagName("TotalNumberVehicle khong bang so xe trong mesage" + header.getSubject().getReference());
										ValidationUtils.addLogMessageValidation(logMessageValidation);
									}
								}
								break;
							}
						}
					}
					if (header.getSubject().getType() == MessageType.HO_SO
							&& FunctionType.FUNCTION_KHAI_MOI.compareToIgnoreCase(header.getSubject().getFunction()) == 0) {
						TechnicalSpecification technicalSpecification = null;
						RequestForQualityInspection requestForQualityInspection = null;
						long technicalSpecificationSize = 0;
						long totalNumberVehicle = 0;
						if(lstObject != null && lstObject.size() > 0){
							for(Object object : lstObject){
								if(object instanceof TechnicalSpecification){
									technicalSpecification = TechnicalSpecification.class.cast(object);
									technicalSpecificationSize = technicalSpecificationSize + technicalSpecification.getImportedVehicle().size();
									if(technicalSpecification != null &&  technicalSpecification.getImportedVehicle().size() == 0){
//										_log.info("-----BusinessValidation-FUNCTION_KHAI_MOI--TechnicalSpecification khong co ImportedVehicle");
										status = false;
										logMessageValidation.setTagName("Ban tin 99-01 TechnicalSpecification khong co xe ImportedVehicle" + header.getSubject().getReference());
										ValidationUtils.addLogMessageValidation(logMessageValidation);
									}
								} else if (object instanceof RequestForQualityInspection){
									requestForQualityInspection = RequestForQualityInspection.class.cast(object);
									totalNumberVehicle = requestForQualityInspection.getTotalNumberVehicle();
								}
							}
						}
//						_log.info("-----ImportedVehicle().size()------------ " + technicalSpecificationSize);
//						_log.info("-----TotalNumberVehicle()------------ " + totalNumberVehicle);
						if(technicalSpecification==null){
//							_log.info("-----BusinessValidation--FUNCTION_KHAI_MOI----khong co object TechnicalSpecification");
							status = false;
							logMessageValidation.setTagName("Ban tin 99-01 khong co TechnicalSpecification " + header.getSubject().getReference());
							ValidationUtils.addLogMessageValidation(logMessageValidation);
						} else if(technicalSpecificationSize != totalNumberVehicle){
//							_log.info("-----BusinessValidation--FUNCTION_KHAI_MOI----tong so phuong tien khong dung");
							status = false;
							logMessageValidation.setTagName("TotalNumberVehicle khong dung " + header.getSubject().getReference());
							ValidationUtils.addLogMessageValidation(logMessageValidation);
						}
					}
					

				} else if(header.getSubject().getFunction().equals(FunctionType.FUNCTION_KHAI_SUA)){
					if (header.getSubject().getType() == MessageType.HO_SO
							&& FunctionType.FUNCTION_KHAI_SUA.compareToIgnoreCase(header.getSubject().getFunction()) == 0) {
						TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.findByMaThuTuc(header.getSubject().getDocumentType());
						if(thuTucHanhChinh==null){
							status = false;
							logMessageValidation.setTagName("Ma thu tuc khong ton tai" + header.getSubject().getDocumentType());
							ValidationUtils.addLogMessageValidation(logMessageValidation);
							return status;
						}
						TechnicalSpecification technicalSpecification = null;
						if(lstObject != null && lstObject.size() > 0){
							for(Object object : lstObject){
								if(object instanceof TechnicalSpecification){
									technicalSpecification = TechnicalSpecification.class.cast(object);
									if(technicalSpecification != null && technicalSpecification.getImportedVehicle().size() == 0){
//										_log.info("-----BusinessValidation-FUNCTION_KHAI_SUA--TechnicalSpecification khong co ImportedVehicle");
										status = false;
										logMessageValidation.setTagName("Ban tin 99-02 TechnicalSpecification khong co xe ImportedVehicle" + header.getSubject().getReference());
										ValidationUtils.addLogMessageValidation(logMessageValidation);
									}
								} 
							}
						}
						if(technicalSpecification==null){
//							_log.info("-----BusinessValidation--FUNCTION_KHAI_SUA----khong co object TechnicalSpecification");
							status = false;
							logMessageValidation.setTagName("Ban tin 99-02 khong co TechnicalSpecification " + header.getSubject().getReference());
							ValidationUtils.addLogMessageValidation(logMessageValidation);
						}
					}
				} else if(header.getSubject().getFunction().equals(FunctionType.FUNCTION_KHAI_HUY)){
					
					if (header.getSubject().getType() == MessageType.HO_SO
							&& FunctionType.FUNCTION_KHAI_HUY.compareToIgnoreCase(header.getSubject().getFunction()) == 0) {
						TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.findByMaThuTuc(header.getSubject().getDocumentType());
						if(thuTucHanhChinh==null){
							status = false;
							logMessageValidation.setTagName("Ma thu tuc khong ton tai" + header.getSubject().getDocumentType());
							ValidationUtils.addLogMessageValidation(logMessageValidation);
							return status;
						}
//						_log.info("---------BusinessValidation---------FUNCTION_KHAI_HUY----");
						if(lstObject != null && lstObject.size() > 0){
							for(Object object : lstObject){
								if(!(object instanceof NoticeOfCancellation)){
//									_log.info("---------BusinessValidation---------FUNCTION_KHAI_HUY----khong co object NoticeOfCancellation");
									status = false;
									logMessageValidation.setTagName("Ban tin 99-03 khong co NoticeOfCancellation " + header.getSubject().getReference());
									ValidationUtils.addLogMessageValidation(logMessageValidation);
								}
							}
						}
					}
					
				} else if(header.getSubject().getFunction().equals(FunctionType.FUNCTION_KHAI_BO_SUNG_CHUNG_TU)){
					
					if (header.getSubject().getType() == MessageType.XN_THOI_GIAN_VA_DIA_DIEM_KIEM_TRA
							&& FunctionType.FUNCTION_KHAI_BO_SUNG_CHUNG_TU.compareToIgnoreCase(header.getSubject()
									.getFunction()) == 0) {
						RequestForChangingDateSite requestForChangingDateSite = null;

						for (Object object : lstObject) {

							if (object instanceof RequestForChangingDateSite) {
								requestForChangingDateSite = RequestForChangingDateSite.class.cast(object);
								if(requestForChangingDateSite.getRegisteredNumber()==null||requestForChangingDateSite.getRegisteredNumber().length()==0){
									status = false;
									logMessageValidation.setTagName("RegisteredNumber chua ton tai" + header.getSubject().getReference());
									ValidationUtils.addLogMessageValidation(logMessageValidation);
								}else{
									RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByRegisteredNumber(requestForChangingDateSite.getRegisteredNumber());									
									if(registeredInspection==null){
										status = false;
										logMessageValidation.setTagName("RegisteredNumber chua ton tai" + header.getSubject().getReference());
										ValidationUtils.addLogMessageValidation(logMessageValidation);
									}
								}
								break;
							}
						}
					} else if ((header.getSubject().getType() == MessageType.HO_SO
							|| header.getSubject().getType() == MessageType.GDK_KTCL_ATKT_BVMT_XE_NHAP_KHAU || header
							.getSubject().getType() == MessageType.BAN_KE_CHI_TIET_SO_KHUNG_SO_DONG_CO)
							&& FunctionType.FUNCTION_KHAI_BO_SUNG_CHUNG_TU.compareToIgnoreCase(header.getSubject()
									.getFunction()) == 0) {
//						_log.info("---------BusinessValidation---------FUNCTION_KHAI_BO_SUNG_CHUNG_TU----");
						if(lstObject != null && lstObject.size() > 0){
							for(Object object : lstObject){
								if(!(object instanceof RequestChanges)){
//									_log.info("---------BusinessValidation---------FUNCTION_KHAI_BO_SUNG_CHUNG_TU----khong co object RequestChanges");
									status = false;
									logMessageValidation.setTagName("Ban tin 99-04 khong co RequestChanges" + header.getSubject().getReference());
									ValidationUtils.addLogMessageValidation(logMessageValidation);
								}
							}
						}
					
					} else if (header.getSubject().getType() == MessageType.XN_THOI_GIAN_VA_DIA_DIEM_KIEM_TRA
							&& FunctionType.FUNCTION_KHAI_BO_SUNG_CHUNG_TU.compareToIgnoreCase(header.getSubject()
									.getFunction()) == 0) {
						
						RequestForChangingDateSite requestForChangingDateSite = null;

						for (Object object : lstObject) {

							if (object instanceof RequestForChangingDateSite) {
								requestForChangingDateSite = RequestForChangingDateSite.class.cast(object);
								
								break;
							}
						}
					
						// long hoSoThuTucId = updateHoSo(header, requestForQualityInspection,
						// thuTucHanhChinh);
						TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchByMaSoHoSo(String.valueOf(header
								.getSubject().getReference()));
						long hoSoThuTucId = tthcHoSoThuTuc.getId();
						
						if(requestForChangingDateSite!=null&&requestForChangingDateSite.getImportedVehicle()!=null &&requestForChangingDateSite.getImportedVehicle().size()>0){
							long check =0;
							int size = requestForChangingDateSite.getImportedVehicle().size();
							for(int i=0;i<size;i++){
								RequestForChangingDateSite.ImportedVehicle importedVehicle = requestForChangingDateSite.getImportedVehicle().get(i);
								
								check = VehicleRecordLocalServiceUtil.checkKeHoachKiemTra(importedVehicle.getCodeNumber(),importedVehicle.getChassisNumber(), importedVehicle.getEngineNumber(), hoSoThuTucId);
								if(check>0){
									status = false;
									break;
								}
							}
							
							if(!status){
								logMessageValidation.setTagName("Xe da duoc phan cong kiem tra nen ko duoc quen" + header.getSubject().getReference());
								ValidationUtils.addLogMessageValidation(logMessageValidation);
							}
						}else{
							status = false;
							if(!status){
								logMessageValidation.setTagName("Khong co xe " + header.getSubject().getReference());
								ValidationUtils.addLogMessageValidation(logMessageValidation);
							}
						}
					}					
					
					
				}
			}
		}
		return status;
	}
}