package vn.dtt.gt.dk.portlet.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vn.dtt.gt.dk.api.bean.xacnhanhoankiemtra.ImportedVehicle;
import vn.dtt.gt.dk.api.util.ApiUtils;
import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaNotification;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaNotificationImpl;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaNotificationLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics;
import vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationAttendeeLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsLocalServiceUtil;
import vn.dtt.gt.dk.message.MessageType;
import vn.dtt.gt.dk.message.MessageUtils;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.nsw.message.xml.MessageFactory;
import vn.dtt.gt.dk.nsw.model.ConfirmCancellation;
import vn.dtt.gt.dk.nsw.model.ConfirmOfRemovedSchedule;
import vn.dtt.gt.dk.nsw.model.NoticeCertificateEndorsement;
import vn.dtt.gt.dk.nsw.model.NoticeOfCancellation;
import vn.dtt.gt.dk.nsw.model.RemovedSchedule;
import vn.dtt.gt.dk.sendmessage.SendMessgaeFunctions;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.ConvertUtil;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;

public class NghiepVuBoSungBusiness {
	private static Log _log = LogFactoryUtil.getLog(NghiepVuBoSungBusiness.class);
	MotCuaBusiness motCuaBusiness = new MotCuaBusiness();
	CallWebserviceNSWBusiness callWebserviceNSWBusiness = new CallWebserviceNSWBusiness();
	FunctionNghiepVu functionNghiepVu  = new FunctionNghiepVu();
	SendMessgaeFunctions messgaeFunctions = new  SendMessgaeFunctions();
	
	public boolean tuDongHuyHoSo(Header header,long tthcHoSoThuTucId,long userId,NoticeOfCancellation noticeOfCancellation,long idMotCuaNotification ) {
		// tao message 99 function 24 cua system
//		_log.info("tuDongHuyHoSo");
//		callWebserviceNSWBusiness.sendMessageCompleteMessageId(header, header.getReference().getMessageId());
		try{
		
			
		String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.tu.dong.huy.thu.tuc", "tu.dong.huy.thu.tuc");
		String messageId =functionNghiepVu.getRamdomMessage();
		messgaeFunctions.insertKeHoachChuyenDich(null,tthcHoSoThuTucId, dieuKienChuyenDich, null, messageId,null,"24", "99" );
		long kq = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyChinh(tthcHoSoThuTucId, dieuKienChuyenDich, userId);
		String ghiChu =  DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK: [ ") + FormatData.parseDateToTringType3(new Date())+" ] ";
		ghiChu = ghiChu + DKConfigurationManager.getStrProp("hethongxacnhanhuythutuc","He thong xac nhan huy thu tuc" )+"<br>";
		TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(tthcHoSoThuTucId);
//		_log.info("tthcHoSoThuTuc.getPhanNhomHoSoId()    "+tthcHoSoThuTuc.getPhanNhomHoSoId());
		ghiChu = ghiChu + tthcHoSoThuTuc.getGhiChu();
		tthcHoSoThuTuc.setGhiChu(ghiChu);
		MotCuaTrangThaiHoSo trangThaiHoSo = MotCuaTrangThaiHoSoLocalServiceUtil.fetchMotCuaTrangThaiHoSo(kq);
		tthcHoSoThuTuc.setTrangThaiHoSo("<b>"+trangThaiHoSo.getTenTrangThai()+"</b>");
		TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
		
		MotCuaNotification motCuaNotificationUdate = MotCuaNotificationLocalServiceUtil.fetchMotCuaNotification(idMotCuaNotification);
		motCuaNotificationUdate.setIsReply(1);
		MotCuaNotificationLocalServiceUtil.updateMotCuaNotification(motCuaNotificationUdate);
	//	String messageId =functionNghiepVu.getRamdomMessage();
		MotCuaNotification motCuaNotification = new MotCuaNotificationImpl();
		 idMotCuaNotification = CounterLocalServiceUtil.increment(MotCuaNotification.class.getName());
		motCuaNotification.setId(idMotCuaNotification);
		motCuaNotification.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
		motCuaNotification.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
		motCuaNotification.setMessageID(messageId);
		motCuaNotification.setDossierid(tthcHoSoThuTuc.getId());
		motCuaNotification.setRequestContent(noticeOfCancellation.getReason());
		motCuaNotification.setIsReply(0);
		motCuaNotification.setMessageType(MessageType.HO_SO);

		motCuaNotification.setResponse(DKConfigurationManager.getStrProp("hethongxacnhanhuythutuc","He thong xac nhan huy thu tuc" ));
		motCuaNotification.setResponseTime(new Date());
		motCuaNotification.setOfficerName(userId+"");
		
		MotCuaNotificationLocalServiceUtil.addMotCuaNotification(motCuaNotification);
		
		ConfirmCancellation confirmCancellation = new ConfirmCancellation();
		confirmCancellation.setCancelDate(noticeOfCancellation.getCancelDate());
		confirmCancellation.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
		confirmCancellation.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
		confirmCancellation.setName(userId+"");
		confirmCancellation.setRegisteredNumber(noticeOfCancellation.getRegisteredNumber());		
		confirmCancellation.setReason(DKConfigurationManager.getStrProp("hethongxacnhanhuythutuc","He thong xac nhan huy thu tuc" ));
		confirmCancellation.setResult(1);
		
		callWebserviceNSWBusiness.message99va24MessageId(userId+"", tthcHoSoThuTuc,messageId, confirmCancellation,header.getReference().getMessageId());
		}catch (Exception e) {
			_log.error(e);
		}
		
		
		return true;
	}

	public boolean boSungDoiChieuThieuTaiLieu(long hoSoThuTucId, long phieuXuLyPhuId, long userId,String reason,String ngayHanChotBoSung) {
		// ko message
		String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.doi.chieu.thieu.tai.lieu", "doi.chieu.thieu.tai.lieu");
		_log.info("dieuKienChuyenDich  "+dieuKienChuyenDich);
		String messageIdSentToNSW = functionNghiepVu.getRamdomMessage();
		messgaeFunctions.insertKeHoachChuyenDich(phieuXuLyPhuId, hoSoThuTucId, dieuKienChuyenDich, reason, messageIdSentToNSW,null,"20", "99" );
		long kq = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich, userId);
		
		
		callWebserviceNSWBusiness.messageSuaDoiBoSung(hoSoThuTucId, messageIdSentToNSW, "01", userId + "", reason, ngayHanChotBoSung);
		
		return true;
	}
	


public boolean boSungHSDKKTSauHoan(long hoSoThuTucId,long userId) {
		// ko message
		String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.bo.sung.hskt", "bo.sung.hskt");
		_log.info("dieuKienChuyenDich  "+dieuKienChuyenDich);
		long kq = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyChinh(hoSoThuTucId, dieuKienChuyenDich, userId);
		
		return true;
	}
	
public boolean choXacNhanHuyHoSo(Header header,long tthcHoSoThuTucId,long userId,NoticeOfCancellation noticeOfCancellation,long idMotCuaNotification ) {
		
		try{
		// ko message
		String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.de.nghi.huy.thu.tuc", "de.nghi.huy.thu.tuc");
//		callWebserviceNSWBusiness.sendMessageComplete(header,null);
		long kq = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyChinh(tthcHoSoThuTucId, dieuKienChuyenDich, userId);
		TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(tthcHoSoThuTucId);
		String ghiChu ="<font color='blue'> "+  DKConfigurationManager.getStrProp("denghihuythutuc", "KH: [ ") + FormatData.parseDateToTringType3( FormatData.parseStringToDate(noticeOfCancellation.getCancelDate()))+" ]";
		ghiChu = ghiChu + noticeOfCancellation.getReason()+" </font>"+"<br>";
		ghiChu = ghiChu + tthcHoSoThuTuc.getGhiChu();
		tthcHoSoThuTuc.setGhiChu(ghiChu);
		TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
		
		List<MotCuaPhieuXuLyPhu> lstMotCuaPhieuXuLyPhus = MotCuaPhieuXuLyPhuLocalServiceUtil.findByThuTucHanhChinhIdAndToChucXuLy(tthcHoSoThuTucId);
		if(lstMotCuaPhieuXuLyPhus != null && lstMotCuaPhieuXuLyPhus.size() >0){
			for(MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu : lstMotCuaPhieuXuLyPhus){
				if((motCuaPhieuXuLyPhu.getPhanNhomHoSoId() == 14) ||
						(motCuaPhieuXuLyPhu.getPhanNhomHoSoId() == 16) ||
						(motCuaPhieuXuLyPhu.getPhanNhomHoSoId() == 24)){
					String ghiChu2 ="<font color='blue'> "+  DKConfigurationManager.getStrProp("denghihuythutuc", "KH: [ ") + FormatData.parseDateToTringType3( FormatData.parseStringToDate(noticeOfCancellation.getCancelDate()))+" ]";
					ghiChu2 = ghiChu2 + noticeOfCancellation.getReason()+" </font>"+"<br>";
					ghiChu2 = ghiChu2 + motCuaPhieuXuLyPhu.getGhiChu();
					
					motCuaPhieuXuLyPhu.setGhiChu(ghiChu2);
					MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
					
				}
			}
		}
	
		}catch (Exception e) {
			_log.error(e);
		}
		return true;
	}

	public boolean canBoXacNhanHuyHoSo(long tthcHoSoThuTucId,long userId,int dongYHayKhongDongY,String lyDo) {
		try{
		// tao message 99 function 24 cua can bo
			long kq = 0;
			TthcHoSoThuTuc tthcHoSoThuTuc =null;
			String messageId =functionNghiepVu.getRamdomMessage();
			if(dongYHayKhongDongY==1){
				
				String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.dong.y.huy.thu.tuc", "dong.y.huy.thu.tuc");
				
				messgaeFunctions.insertKeHoachChuyenDich(null,tthcHoSoThuTucId, dieuKienChuyenDich, null, messageId,null,"24", "99" );
				 kq = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyChinh(tthcHoSoThuTucId, dieuKienChuyenDich, userId);
				 
				 tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(tthcHoSoThuTucId);
					 MotCuaTrangThaiHoSo cuaTrangThaiHoSo = MotCuaTrangThaiHoSoLocalServiceUtil.fetchMotCuaTrangThaiHoSo(kq);
					String ghiChu ="<font color='red'> "+ DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK: [ ") + FormatData.parseDateToTringType3(new Date())+" ] ";
					 
					ghiChu = ghiChu + lyDo+" </font>"+"<br>";
					ghiChu = ghiChu + tthcHoSoThuTuc.getGhiChu();
					tthcHoSoThuTuc.setGhiChu(ghiChu);
					tthcHoSoThuTuc.setTrangThaiHoSo("<b>"+ cuaTrangThaiHoSo.getTenTrangThai()+"</b>");
					TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
				
	
				 
			}else{
				 tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(tthcHoSoThuTucId);
				String ghiChu = DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK: [ ") + FormatData.parseDateToTringType3(new Date())+" ] ";
				ghiChu = ghiChu + lyDo+"<br>";
				ghiChu = ghiChu + tthcHoSoThuTuc.getGhiChu();
				tthcHoSoThuTuc.setGhiChu(ghiChu);
				TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
			
	
				String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.tu.choi.huy.thu.tuc", "tu.choi.huy.thu.tuc");
				messgaeFunctions.insertKeHoachChuyenDich(null,tthcHoSoThuTucId, dieuKienChuyenDich, null, messageId,null,"24", "99" );
				 kq = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyChinh(tthcHoSoThuTuc.getId(), dieuKienChuyenDich, userId);
			}
			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(tthcHoSoThuTuc.getId());
	 
	
			ConfirmCancellation confirmCancellation = new ConfirmCancellation();
			confirmCancellation.setCancelDate(FormatData.parseDateToTring(new Date()));
			confirmCancellation.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
			confirmCancellation.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
			confirmCancellation.setName(userId+"");
			confirmCancellation.setRegisteredNumber(registeredInspection.getRegisteredNumber());		
			confirmCancellation.setReason(lyDo);
			confirmCancellation.setResult(dongYHayKhongDongY);
//			String messageId =functionNghiepVu.getRamdomMessage();
			callWebserviceNSWBusiness.message99va24(userId+"", tthcHoSoThuTuc,messageId, confirmCancellation);
		}catch (Exception e) {
			_log.error(e);
			return false;
		}
		return true;
	}

	public boolean tuDongKhongChoHuyHoSo(Header header,TthcHoSoThuTuc tthcHoSoThuTuc,long userId,NoticeOfCancellation noticeOfCancellation,long idMotCuaNotification ) {
		// tao message 99 function 24 cua system
		try{
//			callWebserviceNSWBusiness.sendMessageCompleteMessageId(header, header.getReference().getMessageId());
		MotCuaNotification motCuaNotificationUdate = MotCuaNotificationLocalServiceUtil.fetchMotCuaNotification(idMotCuaNotification);
		motCuaNotificationUdate.setIsReply(1);
		MotCuaNotificationLocalServiceUtil.updateMotCuaNotification(motCuaNotificationUdate);
		String messageId =functionNghiepVu.getRamdomMessage();
		MotCuaNotification motCuaNotification = new MotCuaNotificationImpl();
		 idMotCuaNotification = CounterLocalServiceUtil.increment(MotCuaNotification.class.getName());
		motCuaNotification.setId(idMotCuaNotification);
		motCuaNotification.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
		motCuaNotification.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
		motCuaNotification.setMessageID(messageId);
		motCuaNotification.setDossierid(tthcHoSoThuTuc.getId());
		motCuaNotification.setRequestContent(noticeOfCancellation.getReason());
		motCuaNotification.setIsReply(0);
		motCuaNotification.setMessageType(MessageType.HO_SO);

		motCuaNotification.setResponse(DKConfigurationManager.getStrProp("hethongkhongchohuythutuc","He thong khong cho huy thu tuc" ));
		motCuaNotification.setResponseTime(new Date());
		motCuaNotification.setOfficerName(userId+"");
		
		MotCuaNotificationLocalServiceUtil.addMotCuaNotification(motCuaNotification);
		
		
		ConfirmCancellation confirmCancellation = new ConfirmCancellation();
		confirmCancellation.setCancelDate(noticeOfCancellation.getCancelDate());
		confirmCancellation.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
		confirmCancellation.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
		confirmCancellation.setName(userId+"");
		confirmCancellation.setRegisteredNumber(noticeOfCancellation.getRegisteredNumber());		
		confirmCancellation.setReason(DKConfigurationManager.getStrProp("hethongkhongchohuythutuc","He thong khong cho huy thu tuc" ));
		confirmCancellation.setResult(0);
		callWebserviceNSWBusiness.message99va24MessageId(userId+"", tthcHoSoThuTuc,messageId, confirmCancellation,header.getReference().getMessageId());
		}catch (Exception e) {
			_log.error(e);
		}
		
		
		return true;
	}

	
	public void deNghiSuaDoiGCN(Header header, String data, List<Object> liObjects) {
		// chi chuyen dich trang thai
		try{
			
			NoticeCertificateEndorsement noticeCertificateEndorsement = null;
			
//			TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.findByMaThuTuc(header.getSubject()
//					.getDocumentType());

//			TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchByMaSoHoSo(String.valueOf(header
//					.getSubject().getReference()));
//			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(tthcHoSoThuTuc.getId());
//			if (!( registeredInspection!=null&&registeredInspection.getRegisteredNumber()!=null&&	registeredInspection.getRegisteredNumber().length()>0)){
//				tuDongGui106(header, noticeCertificateEndorsement, tthcHoSoThuTuc);
//				return;
//			}

			long check =0;
			for (Object object : liObjects) {
				if (object instanceof NoticeCertificateEndorsement) {
					noticeCertificateEndorsement = NoticeCertificateEndorsement.class.cast(object);
					List<NoticeCertificateEndorsement.CertificateDetails> certificateDatails= noticeCertificateEndorsement.getCertificateDetails();
					if(certificateDatails!=null){
					int size = certificateDatails.size();
					for(int k=0;k<size;k++){
						NoticeCertificateEndorsement.CertificateDetails details = certificateDatails.get(k);
						//check=VehicleRecordLocalServiceUtil.checkHoanKiemTra(vehicle.getCodeNumber(), vehicle.getChassisNumber(),vehicle.getEngineNumber());
						if(check>0){
							break;
						}
					}
					}
				}
				if(check>0){
					break;
				}
			}
			
			
			
			if (check > 0) {
				//tuDongGui106(header, noticeCertificateEndorsement, tthcHoSoThuTuc);
				return;
			}


			_log.info("xuLyHoSoType105Function30 vao day");
//			xuLyHoSoType105Function30(header, liObjects, data,
//					thuTucHanhChinh, tthcHoSoThuTuc);
		
			
		}catch (Exception e) {
			_log.error(e);
		}
	
	//	return true;
	}
	
	public void message104function30(RemovedSchedule removedSchedule,String userName,TthcHoSoThuTuc hoSoThuTuc,String lyDo,int markedAsDelete,vn.dtt.gt.dk.nsw.Header header){
//		RemovedSchedule removedSchedule = RemovedSchedule.class.cast(object);
		
		ConfirmOfRemovedSchedule confirmOfRemovedSchedule = new ConfirmOfRemovedSchedule();
		confirmOfRemovedSchedule.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
		confirmOfRemovedSchedule.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
		confirmOfRemovedSchedule.setRequestDate(FormatData.parseDateToTring( new Date()));
		confirmOfRemovedSchedule.setName(userName);
		confirmOfRemovedSchedule.setRequestId(removedSchedule.getRequestId());
		//String lyDo= DKConfigurationManager.getStrProp("lydohethongtuchoidenghihoankiemtra", "He thong tu choi de nghi hoan kiem tra");
		confirmOfRemovedSchedule.setReasonForRemoving(lyDo);
		List<ConfirmOfRemovedSchedule.ImportedVehicle> importedVehicles = new ArrayList<ConfirmOfRemovedSchedule.ImportedVehicle>();
		int size = removedSchedule.getImportedVehicle().size();
		_log.info("removedSchedule.getImportedVehicle()  "+size);
		for(int i=0;i<size;i++){
			RemovedSchedule.ImportedVehicle importedVehicle =  removedSchedule.getImportedVehicle().get(i);
			ConfirmOfRemovedSchedule.ImportedVehicle vehicle  = new ConfirmOfRemovedSchedule.ImportedVehicle();
			vehicle.setMarkedAsDelete(markedAsDelete);
			vehicle.setChassisNumber(importedVehicle.getChassisNumber());
			vehicle.setCodeNumber(importedVehicle.getCodeNumber());
			vehicle.setEngineNumber(importedVehicle.getEngineNumber());
			vehicle.setProductionYear(importedVehicle.getProductionYear());
			vehicle.setSequenceNo(importedVehicle.getSequenceNo());
			vehicle.setVehicleColor(importedVehicle.getVehicleColor());
			vehicle.setVehicleEngineStatus(importedVehicle.getVehicleEngineStatus());
			importedVehicles.add(vehicle);
					
		}
		if(importedVehicles!=null&&importedVehicles.size()>0){
			confirmOfRemovedSchedule.getImportedVehicle().addAll(importedVehicles);
		}
//		callWebserviceNSWBusiness.sendMessageCompleteMessageId(header, header.getReference().getMessageId());
		callWebserviceNSWBusiness.message104va30MessageId(userName, hoSoThuTuc, functionNghiepVu.getRamdomMessage(),
				Constants.VERSION_START, confirmOfRemovedSchedule,header.getReference().getMessageId());
	}
	
	
	public boolean xacNhanThongBaoHoanKiemTra(long hoSoThuTucId, long phieuXuLyPhuId,int dongYHoan,String userName,String lyDo) {
		boolean result = true;
		try {
			_log.info("xacNhanThongBaoHoanKiemTra");
			TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(hoSoThuTucId);
			TthcNoidungHoSo noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(motCuaPhieuXuLyPhu.getNoiDungHoSoId());
			int check =0;
			boolean check2=false;
			String vehicleRecordIdList="";
			String vehicleRecordIdList2="";
			
			String messageId=functionNghiepVu.getRamdomMessage();
			if (null != noidungHoSo ) {
				
				String data = MessageUtils.replaceXML(noidungHoSo.getNoiDungXml());
				List<Object> liObjects = MessageFactory.converXMLMessagesContentToObject(data);
				List<ConfirmedInspection> confirmedInspections =null;
				for (Object object : liObjects) {
					// update
					if (object instanceof RemovedSchedule) {
						RemovedSchedule removedSchedule = RemovedSchedule.class.cast(object);
					
						ConfirmOfRemovedSchedule confirmOfRemovedSchedule = new ConfirmOfRemovedSchedule();
						confirmOfRemovedSchedule.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
						confirmOfRemovedSchedule.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
						confirmOfRemovedSchedule.setRequestDate(FormatData.parseDateToTring( new Date()));
						confirmOfRemovedSchedule.setName(userName);
						confirmOfRemovedSchedule.setReasonForRemoving(lyDo);
						List<ConfirmOfRemovedSchedule.ImportedVehicle> importedVehicles = new ArrayList<ConfirmOfRemovedSchedule.ImportedVehicle>();

						ConfirmedInspection confirmedInspection =null;
						for(RemovedSchedule.ImportedVehicle importedVehicle : removedSchedule.getImportedVehicle()){
						
							ConfirmOfRemovedSchedule.ImportedVehicle vehicle  = new ConfirmOfRemovedSchedule.ImportedVehicle();
							
							vehicle.setMarkedAsDelete(dongYHoan);
							vehicle.setChassisNumber(importedVehicle.getChassisNumber());
							vehicle.setCodeNumber(importedVehicle.getCodeNumber());
							vehicle.setEngineNumber(importedVehicle.getEngineNumber());
							vehicle.setProductionYear(importedVehicle.getProductionYear());
							vehicle.setSequenceNo(importedVehicle.getSequenceNo());
							vehicle.setVehicleColor(importedVehicle.getVehicleColor());
							vehicle.setVehicleEngineStatus(importedVehicle.getVehicleEngineStatus());
							importedVehicles.add(vehicle);
							List<VehicleRecord> vehicleRecords  = VehicleRecordLocalServiceUtil.findByDossierId(hoSoThuTucId,importedVehicle.getCodeNumber());
//							for()
							if(dongYHoan==Constants.DONG_Y){
								if(confirmedInspections==null&&confirmedInspection==null){
									
									confirmedInspections = ConfirmedInspectionLocalServiceUtil.getListConfirmedInspection(vehicle.getCodeNumber(), vehicle.getChassisNumber(),vehicle.getEngineNumber(),hoSoThuTuc.getId());
									
									if(confirmedInspections!=null&&confirmedInspections.size()>0){
										long sizeConfirmedInspection = confirmedInspections.size();
										_log.info(" sizeConfirmedInspection  "+sizeConfirmedInspection);
										for(int i=0;i<sizeConfirmedInspection;i++){
											 confirmedInspection = confirmedInspections.get(i);
											
											confirmOfRemovedSchedule.setRequestId(confirmedInspection.getConfirmationCode());
											VehicleRecordLocalServiceUtil.updateVehicleRecordWithConfirmedInspectionId(confirmedInspection.getId());
										
											//MotCuaPhieuXuLyPhuLocalServiceUtil.deleteMotCuaPhieuXuLyPhu(confirmedInspection.getPhieuXuLyPhuId());
											//ConfirmedInspectionLocalServiceUtil.deleteConfirmedInspection(confirmedInspection.getId());
							
										}
									}
								}
								
								
								if(vehicleRecords!=null && vehicleRecords.size()>0){
									VehicleRecord vehicleRecord = vehicleRecords.get(0);
									vehicleRecordIdList=vehicleRecordIdList+vehicleRecord.getId()+",";
									if(vehicleRecord.getInspectionRecordId() == 0){
										check = check+1;
										vehicleRecordIdList2=vehicleRecordIdList+vehicleRecord.getId()+",";
										_log.info("vehicleRecord  "+vehicleRecord.getCodeNumber());
										vehicleRecord.setConfirmedInspectionId(0);
										vehicleRecord.setMarkUpStatus(1);
										VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
									} else if (vehicleRecord.getInspectionRecordId() > 0){
										importedVehicles.remove(vehicle);
									}
								}
								_log.info(" sizeConfirmedInspection  ");
							}else{
								if(confirmedInspections==null){
									confirmedInspections = ConfirmedInspectionLocalServiceUtil.getListConfirmedInspection(vehicle.getCodeNumber(), vehicle.getChassisNumber(),vehicle.getEngineNumber(),hoSoThuTuc.getId());
									if(confirmedInspections!=null&&confirmedInspections.size()>0){
										long sizeConfirmedInspection = confirmedInspections.size();
										_log.info(" sizeConfirmedInspection  "+sizeConfirmedInspection);
										for(int i=0;i<sizeConfirmedInspection;i++){
											confirmedInspection = confirmedInspections.get(i);
											confirmOfRemovedSchedule.setRequestId(confirmedInspection.getConfirmationCode());
											MotCuaPhieuXuLyPhu phieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(confirmedInspection.getPhieuXuLyPhuId());
											String ghiChu = motCuaPhieuXuLyPhu.getGhiChu()+ "<br><b>"+"<font color='red'> "+DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK: [ ")  + FormatData.parseDateToTringType3( new Date())+" ]"+lyDo+" </font>"+"</b><br>";
											phieuXuLyPhu.setGhiChu(ghiChu);
											MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(phieuXuLyPhu);
										}
									}
								}
								
							}
							
						}
						if(importedVehicles!=null&&importedVehicles.size()>0){
							confirmOfRemovedSchedule.getImportedVehicle().addAll(importedVehicles);
						}
						if(dongYHoan==Constants.DONG_Y){
								
							updateVehicleStatisticsAfterRemoveSchedules(
									hoSoThuTuc, registeredInspection,
									importedVehicles.size());
							if(check>0&&confirmedInspection!=null){
								String	lyDoTruoc = "<b>"+ DKConfigurationManager.getStrProp("dongyhoankiemtra", "dong y hoan kiem tra")+ "</b><br>"+"<font color='red'> "+
										DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK: [ ") + FormatData.parseDateToTringType3(new Date())+" ] "+lyDo
										+" </font>"+"</b><br>" + motCuaPhieuXuLyPhu.getGhiChu();
								long phieuXuLyPhuLichCuId =confirmedInspection.getPhieuXuLyPhuId();
								MotCuaPhieuXuLyPhu cuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuLichCuId);
								cuaPhieuXuLyPhu.setGhiChu(lyDoTruoc);
								
								MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(cuaPhieuXuLyPhu);
								
								String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.chua.du.phuong.tien", "chua.du.phuong.tien");
								long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
								messgaeFunctions.insertKeHoachChuyenDich(phieuXuLyPhuLichCuId, hoSoThuTucId, dieuKienChuyenDich, vehicleRecordIdList2, messageId,null,"30", "104");
								check2=true;
								motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuLichCuId, dieuKienChuyenDich, userSystem);
								callWebserviceNSWBusiness.message104va30(userName, hoSoThuTuc, messageId,
										Constants.VERSION_START, confirmOfRemovedSchedule,phieuXuLyPhuId);
							}
						}else{								
							callWebserviceNSWBusiness.message104va30(userName, hoSoThuTuc, messageId,
								Constants.VERSION_START, confirmOfRemovedSchedule,phieuXuLyPhuId);
						}
						
					}
				}
			
			}
			if(dongYHoan==Constants.DONG_Y){
				lyDo = "<b>"+ DKConfigurationManager.getStrProp("dongyhoankiemtra", "dong y hoan kiem tra")+ "</b><br>"+"<font color='red'> "+
						DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK: [ ") + FormatData.parseDateToTringType3(new Date())+" ] "+lyDo
						+" </font>"+"</b><br>" + motCuaPhieuXuLyPhu.getGhiChu();
			}else{
				lyDo ="<b>"+ DKConfigurationManager.getStrProp("tuchoihoankiemtra", "Tu choi hoan kiem tra")+ "</b><br>"+  " <b>"+"<font color='red'> "+DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK: [ ")  + FormatData.parseDateToTringType3( new Date())+" ]"+lyDo+" </font>"+"</b><br>"+motCuaPhieuXuLyPhu.getGhiChu();	
			}
			motCuaPhieuXuLyPhu.setGhiChu(lyDo);
			
			MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
			
			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.chua.du.phuong.tien", "chua.du.phuong.tien");
			long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
			if((dongYHoan==Constants.DONG_Y)  )
			{
				if(check>0 && check2==true){
					messgaeFunctions.insertKeHoachChuyenDich(phieuXuLyPhuId, hoSoThuTucId, dieuKienChuyenDich, null, messageId,null,"30", "104");
				}
			} else
			{
				messgaeFunctions.insertKeHoachChuyenDich(phieuXuLyPhuId, hoSoThuTucId, dieuKienChuyenDich, null, messageId,null,"30", "104");
			}
			motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich, userSystem);

		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public void updateVehicleStatisticsAfterRemoveSchedules(
			TthcHoSoThuTuc hoSoThuTuc, RegisteredInspection registeredInspection, long size)
			throws SystemException {
		
		VehicleStatistics vehicleStatistics = VehicleStatisticsLocalServiceUtil.findByRegisteredInspectionId(registeredInspection.getId());
		
		if (vehicleStatistics != null) {
			vehicleStatistics.setTotalCancelledVehicle(vehicleStatistics.getTotalCancelledVehicle()+size);
			vehicleStatistics.setTotalRequestedVehicle(vehicleStatistics.getTotalRequestedVehicle()-size);
			vehicleStatistics.setTotalNotYetRequestedVehicle(vehicleStatistics.getTotalNotYetRequestedVehicle()+size);
			vehicleStatistics.setSynchdate(new Date());
			VehicleStatisticsLocalServiceUtil.updateVehicleStatistics(vehicleStatistics);
		}
		
		String trichYeuNoiDung = DKConfigurationManager.getStrProp("TONG_SO_DANG_KY_KIEM_TRA",
				"Tong So Dang Ky Kiem Tra");
		trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRegisteredVehicle() + "<br>";
		trichYeuNoiDung = trichYeuNoiDung
				+ DKConfigurationManager.getStrProp("SO_PHUONG_TIEN_CHUA_DE_NGHI_KIEM_TRA",
						"So Phuong Tien Chua De Nghi Kiem Tra");
		trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalNotYetRequestedVehicle() + "<br>";

		trichYeuNoiDung = trichYeuNoiDung
				+ DKConfigurationManager.getStrProp("SO_PT_DN_KT", "So Phuong Tien De Nghi Kiem Tra");
		trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRequestedVehicle() + "<br>";

		trichYeuNoiDung = trichYeuNoiDung
				+ DKConfigurationManager.getStrProp("SO_PT_DA_KT", "So Phuong Tien da Kiem Tra");
		trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalInspectedVehicle() + "<br>";

		trichYeuNoiDung = trichYeuNoiDung
				+ DKConfigurationManager.getStrProp("SO_PT_HOAN_KT", "So Phuong Tien hoan Kiem Tra");
		trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalCancelledVehicle() + "<br>";
		
		hoSoThuTuc.setTrichYeuNoiDung(trichYeuNoiDung);
		hoSoThuTuc.setSynchdate(new Date());
		TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(hoSoThuTuc);
	}
	
	public void thongBaoHoanKiemTra(
			TthcHoSoThuTuc hoSoThuTuc, RegisteredInspection registeredInspection,
			ConfirmedInspection confirmedInspection,
			vn.dtt.gt.dk.api.bean.xacnhanhoankiemtra.ConfirmOfRemovedSchedule apiObject)
		throws Exception {
		
		String userName = apiObject.getName();
		String lyDo = apiObject.getReasonForRemoving();
		int dongYHoan = Constants.DONG_Y;
		
		long phieuXuLyPhuId = confirmedInspection.getPhieuXuLyPhuId();
		long hoSoThuTucId = hoSoThuTuc.getId();
		
		/*_log.info("xacNhanThongBaoHoanKiemTra");
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
		int check = 0;
		boolean check2 = false;
		String vehicleRecordIdList = "";
		String vehicleRecordIdList2 = "";
		
		String messageId = functionNghiepVu.getRamdomMessage();
				
		ConfirmOfRemovedSchedule confirmOfRemovedSchedule = new ConfirmOfRemovedSchedule();
		confirmOfRemovedSchedule.setDivision(apiObject.getDivision());
		confirmOfRemovedSchedule.setOrganization(apiObject.getOrganization());
		confirmOfRemovedSchedule.setRequestDate(ApiUtils.apiDateToMsgDate(apiObject.getRequestDate()));
		confirmOfRemovedSchedule.setName(userName);
		confirmOfRemovedSchedule.setReasonForRemoving(lyDo);
		List<ConfirmOfRemovedSchedule.ImportedVehicle> importedVehicles = new ArrayList<ConfirmOfRemovedSchedule.ImportedVehicle>();

		for(ImportedVehicle importedVehicle : apiObject.getImportedVehicle()){
		
			ConfirmOfRemovedSchedule.ImportedVehicle vehicle  = new ConfirmOfRemovedSchedule.ImportedVehicle();
			
			vehicle.setMarkedAsDelete(dongYHoan);
			vehicle.setChassisNumber(importedVehicle.getChassisNumber());
			vehicle.setCodeNumber(GetterUtil.getLong(importedVehicle.getCodeNumber()));
			vehicle.setEngineNumber(importedVehicle.getEngineNumber());
//			vehicle.setProductionYear(importedVehicle.getP);
			vehicle.setSequenceNo(GetterUtil.getInteger(importedVehicle.getSequenceNo()));
			//vehicle.setVehicleColor(importedVehicle.getVehicleColor());
			//vehicle.setVehicleEngineStatus(importedVehicle.getVehicleEngineStatus());
			importedVehicles.add(vehicle);
			//List<VehicleRecord> vehicleRecords  = VehicleRecordLocalServiceUtil.findByDossierId(hoSoThuTucId,importedVehicle.getCodeNumber());
//							for()
			if(dongYHoan==Constants.DONG_Y){
				confirmOfRemovedSchedule.setRequestId(confirmedInspection.getConfirmationCode());
				//VehicleRecordLocalServiceUtil.updateVehicleRecordWithConfirmedInspectionId(confirmedInspection.getId());
				
				
				//if(vehicleRecords!=null && vehicleRecords.size()>0){
				VehicleRecord vehicleRecord = VehicleRecordLocalServiceUtil
						.getByCN_CHN_EN(GetterUtil.getLong(importedVehicle.getCodeNumber()), importedVehicle.getChassisNumber(), importedVehicle.getEngineNumber());
				
				vehicleRecord.setConfirmedInspectionId(0);
				vehicleRecord.setSynchdate(new Date());
				VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
				
				vehicleRecordIdList = vehicleRecordIdList
						+ vehicleRecord.getId() + ",";
				if(vehicleRecord.getInspectionRecordId() == 0){
					check = check+1;
					vehicleRecordIdList2=vehicleRecordIdList+vehicleRecord.getId()+",";
					_log.info("vehicleRecord  "+vehicleRecord.getCodeNumber());
					vehicleRecord.setMarkUpStatus(1);
					vehicleRecord.setSynchdate(new Date());
					VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
				} else if (vehicleRecord.getInspectionRecordId() > 0){
					importedVehicles.remove(vehicle);
				}
				//}
				_log.info(" sizeConfirmedInspection  ");
			}else{
				confirmOfRemovedSchedule.setRequestId(confirmedInspection.getConfirmationCode());
				MotCuaPhieuXuLyPhu phieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(confirmedInspection.getPhieuXuLyPhuId());
				String ghiChu = motCuaPhieuXuLyPhu.getGhiChu()+ "<br><b>"+"<font color='red'> "+DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK: [ ")  + FormatData.parseDateToTringType3( new Date())+" ]"+lyDo+" </font>"+"</b><br>";
				phieuXuLyPhu.setGhiChu(ghiChu);
				MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(phieuXuLyPhu);
				
			}
			
		}
		if(importedVehicles!=null&&importedVehicles.size()>0){
			confirmOfRemovedSchedule.getImportedVehicle().addAll(importedVehicles);
		}
		if(dongYHoan==Constants.DONG_Y){
				
			updateVehicleStatisticsAfterRemoveSchedules(hoSoThuTuc, registeredInspection,
					importedVehicles.size());
			
			if (check > 0 && confirmedInspection != null) {
				String	lyDoTruoc = "<b>"+ DKConfigurationManager.getStrProp("dongyhoankiemtra", "dong y hoan kiem tra")+ "</b><br>"+"<font color='red'> "+
						DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK: [ ") + FormatData.parseDateToTringType3(new Date())+" ] "+lyDo
						+" </font>"+"</b><br>" + motCuaPhieuXuLyPhu.getGhiChu();
				long phieuXuLyPhuLichCuId =confirmedInspection.getPhieuXuLyPhuId();
				MotCuaPhieuXuLyPhu cuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuLichCuId);
				cuaPhieuXuLyPhu.setGhiChu(lyDoTruoc);
				
				MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(cuaPhieuXuLyPhu);
				
				String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.chua.du.phuong.tien", "chua.du.phuong.tien");
				long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
				messgaeFunctions.insertKeHoachChuyenDich(phieuXuLyPhuLichCuId, hoSoThuTucId, dieuKienChuyenDich, vehicleRecordIdList2, messageId,null,"30", "104");
				check2=true;
				motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuLichCuId, dieuKienChuyenDich, userSystem);
				callWebserviceNSWBusiness.message104va30(userName, hoSoThuTuc, messageId,
						Constants.VERSION_START, confirmOfRemovedSchedule,phieuXuLyPhuId);
			}
		}else{								
			callWebserviceNSWBusiness.message104va30(userName, hoSoThuTuc, messageId,
				Constants.VERSION_START, confirmOfRemovedSchedule,phieuXuLyPhuId);
		}
					
		if(dongYHoan==Constants.DONG_Y){
			lyDo = "<b>"+ DKConfigurationManager.getStrProp("dongyhoankiemtra", "dong y hoan kiem tra")+ "</b><br>"+"<font color='red'> "+
					DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK: [ ") + FormatData.parseDateToTringType3(new Date())+" ] "+lyDo
					+" </font>"+"</b><br>" + motCuaPhieuXuLyPhu.getGhiChu();
		}else{
			lyDo ="<b>"+ DKConfigurationManager.getStrProp("tuchoihoankiemtra", "Tu choi hoan kiem tra")+ "</b><br>"+  " <b>"+"<font color='red'> "+DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK: [ ")  + FormatData.parseDateToTringType3( new Date())+" ]"+lyDo+" </font>"+"</b><br>"+motCuaPhieuXuLyPhu.getGhiChu();	
		}
		motCuaPhieuXuLyPhu.setGhiChu(lyDo);
		
		MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
		
		String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.chua.du.phuong.tien", "chua.du.phuong.tien");
		long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
		if((dongYHoan==Constants.DONG_Y)  )
		{
			if(check>0 && check2==true){
				messgaeFunctions.insertKeHoachChuyenDich(phieuXuLyPhuId, hoSoThuTucId, dieuKienChuyenDich, null, messageId,null,"30", "104");
			}
		} else
		{
			messgaeFunctions.insertKeHoachChuyenDich(phieuXuLyPhuId, hoSoThuTucId, dieuKienChuyenDich, null, messageId,null,"30", "104");
		}
		
		motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich, userSystem);
		
		callWebserviceNSWBusiness.message104va30(userName, hoSoThuTuc, messageId,
				Constants.VERSION_START, confirmOfRemovedSchedule,phieuXuLyPhuId);*/
		
		ConfirmOfRemovedSchedule confirmOfRemovedSchedule = new ConfirmOfRemovedSchedule();
		confirmOfRemovedSchedule.setDivision(apiObject.getDivision());
		confirmOfRemovedSchedule.setOrganization(apiObject.getOrganization());
		confirmOfRemovedSchedule.setRequestDate(ApiUtils.apiDateToMsgDate(apiObject.getRequestDate()));
		confirmOfRemovedSchedule.setName(apiObject.getName());
		confirmOfRemovedSchedule.setReasonForRemoving(lyDo);
		confirmOfRemovedSchedule.setRequestId(confirmedInspection.getConfirmationCode());
		
		List<ConfirmOfRemovedSchedule.ImportedVehicle> importedVehicles = new ArrayList<ConfirmOfRemovedSchedule.ImportedVehicle>();
		String vehicleRecordIdList ="";
		
		for (ImportedVehicle importedVehicle : apiObject.getImportedVehicle()) {
			VehicleRecord vehicleRecord = VehicleRecordLocalServiceUtil
					.getByCN_CHN_EN(GetterUtil.getLong(importedVehicle.getCodeNumber()),
							importedVehicle.getChassisNumber(),
							importedVehicle.getEngineNumber());
			
			if(vehicleRecord.getInspectionRecordId() == 0){
				
				ConfirmOfRemovedSchedule.ImportedVehicle vehicle  = new ConfirmOfRemovedSchedule.ImportedVehicle();
				vehicle.setMarkedAsDelete(dongYHoan);
				vehicle.setChassisNumber(vehicleRecord.getChassisNumber());
				vehicle.setCodeNumber(vehicleRecord.getCodeNumber());
				vehicle.setEngineNumber(vehicleRecord.getEngineNumber());
				vehicle.setProductionYear(vehicleRecord.getProductionYear());
				vehicle.setSequenceNo(vehicleRecord.getSequenceNo());
				vehicle.setVehicleColor(vehicleRecord.getVehicleColor());
				vehicle.setVehicleEngineStatus((new Long(vehicleRecord.getVehicleEngineStatus())).intValue());
				importedVehicles.add(vehicle);
				
				vehicleRecord.setMarkUpStatus(1);
				
				_log.info("====vehicleRecord.getConfirmedInspectionId()===" + vehicleRecord.getConfirmedInspectionId());
				
				vehicleRecordIdList = vehicleRecordIdList + vehicleRecord.getId() + ",";
			} 
			
			vehicleRecord.setConfirmedInspectionId(0);
			vehicleRecord.setSynchdate(new Date());
			
			VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
		}
		
		if (importedVehicles != null && importedVehicles.size() > 0) {
			confirmOfRemovedSchedule.getImportedVehicle().addAll(importedVehicles);
		}
			
		updateVehicleStatisticsAfterRemoveSchedules(hoSoThuTuc, registeredInspection, importedVehicles.size());
		
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.getMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
		
		if(dongYHoan==Constants.DONG_Y){
			lyDo = "<b>"+ DKConfigurationManager.getStrProp("dongyhoankiemtra", "dong y hoan kiem tra")+ "</b>" +"<br><b><font color='red'>"+lyDo+"</font></b><br>" + motCuaPhieuXuLyPhu.getGhiChu();
		}else{
			lyDo = "<b>"+ DKConfigurationManager.getStrProp("tuchoihoankiemtra", "tu choi hoan kiem tra")+ "</b>" +"<br><b><font color='red'>"+lyDo+"</font></b><br>" + motCuaPhieuXuLyPhu.getGhiChu();	
		}
		
		motCuaPhieuXuLyPhu.setGhiChu(lyDo);
		
		MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
		
		String dieuKienChuyenDich = DKConfigurationManager.getStrProp(
				"dieukiendichchuyen.chua.du.phuong.tien", "chua.du.phuong.tien");
		
		String messageId = functionNghiepVu.getRamdomMessage();
		
		messgaeFunctions.insertKeHoachChuyenDich(phieuXuLyPhuId, hoSoThuTucId,
				dieuKienChuyenDich, vehicleRecordIdList, messageId, null, "30",
				"104");
		
		motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId,
				phieuXuLyPhuId, dieuKienChuyenDich,
				ConvertUtil.convertToLong(userName));
	 
		callWebserviceNSWBusiness.message104va30(userName, hoSoThuTuc, messageId,
				Constants.VERSION_START, confirmOfRemovedSchedule,phieuXuLyPhuId);
		
		thongBaoHoanKiemTra_DongYHoan(hoSoThuTucId,
				confirmOfRemovedSchedule.getRequestId(), dongYHoan, userName,
				lyDo, confirmedInspection.getId(), messageId);
	}
	
	public boolean thongBaoHoanKiemTra_DongYHoan(long hoSoThuTucId, long confirmationCode, int dongYHoan,String userName,String lyDo,long confirmedInspectionId, String messageId) {
		boolean result = true;
		try {
			if ((hoSoThuTucId == 0) || (confirmationCode == 0) || (dongYHoan == 0) || (confirmedInspectionId == 0) )
			{
				_log.info("hoSoThuTucId == " + hoSoThuTucId +" ) || (confirmationCode == " + confirmationCode +" ) || (dongYHoan == " + dongYHoan +" ) || (confirmedInspectionId == " + confirmedInspectionId);
				return false;
			}
			List<MotCuaPhieuXuLyPhu> listOfMotCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.findByPhieuXuLyChinhId(hoSoThuTucId);
			MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = null;
			TthcNoidungHoSo noidungHoSo = null;
			if(listOfMotCuaPhieuXuLyPhu!=null && listOfMotCuaPhieuXuLyPhu.size()>0){
				long sizeOfMotCuaPhieuXuLyPhu = listOfMotCuaPhieuXuLyPhu.size();
				_log.info(" sizeOfMotCuaPhieuXuLyPhu  "+ sizeOfMotCuaPhieuXuLyPhu);
				for(int i=0;i<sizeOfMotCuaPhieuXuLyPhu;i++){
					motCuaPhieuXuLyPhu = listOfMotCuaPhieuXuLyPhu.get(i);
					if (motCuaPhieuXuLyPhu.getPhanNhomHoSoId()==Constants.PHIEU_XU_LY_PHU_DE_NGHI_HUY_LICH_KIEM_TRA)
					{
						noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(motCuaPhieuXuLyPhu.getNoiDungHoSoId());
						if (null != noidungHoSo ) {
							
							String data = MessageUtils.replaceXML(noidungHoSo.getNoiDungXml());
							List<Object> liObjects = MessageFactory.converXMLMessagesContentToObject(data);
							
							for (Object object : liObjects) {
								// update
								if (object instanceof RemovedSchedule) {
									RemovedSchedule removedSchedule = RemovedSchedule.class.cast(object);
									if ((removedSchedule.getRequestId() == confirmationCode) && (dongYHoan==Constants.DONG_Y))
									{
										lyDo = "<b>"+ DKConfigurationManager.getStrProp("dongyhoankiemtra", "dong y hoan kiem tra")+ "</b><br>"+"<font color='red'> "+
												DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK: [ ") + FormatData.parseDateToTringType3(new Date())+" ] "+lyDo
												+" </font>"+"</b><br>" + motCuaPhieuXuLyPhu.getGhiChu();
										_log.info("lyDo  "+lyDo);
										motCuaPhieuXuLyPhu.setGhiChu(lyDo);	
										MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
										
										long phieuXuLyPhuId = 0;
										phieuXuLyPhuId = motCuaPhieuXuLyPhu.getId();
										String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.chua.du.phuong.tien", "chua.du.phuong.tien");
										long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
										messgaeFunctions.insertKeHoachChuyenDich(phieuXuLyPhuId, hoSoThuTucId, dieuKienChuyenDich, null, messageId,null,"30", "104");
										motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich, userSystem);										
									}
								
								}
							}
						}
					}
				}
			}			
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public boolean xacNhanLoaiBoPhuongTienKiemTra(long hoSoThuTucId, long phieuXuLyPhuId,int dongYHoan,String userName,String lyDo) {
		boolean result = true;
		/*try {
			if(lyDo==null||lyDo.length()==0){
				lyDo="---";
			}
			_log.info("==========xacNhanLoaiBoPhuongTienKiemTra=============");
			vn.dtt.gt.dk.gate.business.BusinessUtils businessUtils = new vn.dtt.gt.dk.gate.business.BusinessUtils();
			result = businessUtils.messageType106AndFunction30(hoSoThuTucId, phieuXuLyPhuId, dongYHoan, userName, lyDo);			
			
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}*/
		return result;
	}

	public void traLichKiemTraChoLanhDao(long hoSoThuTucId,
			ConfirmedInspection confirmedInspection, long userId,
			vn.dtt.gt.dk.api.bean.tbtralai.RemovedSchedule apiRemovedSchedule) 
			throws Exception {
			
		long phieuXuLyPhuId = confirmedInspection.getPhieuXuLyPhuId();
		
		String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.tra.lich.kt.cho.lanh.dao", "tra.lich.kt.cho.lanh.dao");

		motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich, userId);
		CorporationAttendeeLocalServiceUtil.removeByConfirmedInspectionId(confirmedInspection.getId());
	
		confirmedInspection.setInspectorId(0);
		confirmedInspection.setSynchdate(new Date());
		ConfirmedInspectionLocalServiceUtil.updateConfirmedInspection(confirmedInspection);
		
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil
				.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
		
		if(motCuaPhieuXuLyPhu !=null ){
			String ghiChu = "<font color='red'> "
					+ DKConfigurationManager.getStrProp("xacnhanhuythutuc",
							"DK: [ ")
					+ FormatData.parseDateToTringType3(new Date()) + " ]"
					+ apiRemovedSchedule.getReasonForRemoving() + " </font>"
					+ "<br>";
			;
			
			motCuaPhieuXuLyPhu.setGhiChu(ghiChu
					+ motCuaPhieuXuLyPhu.getGhiChu());
			
			MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
		}
	}
	
	public boolean traLichKiemTraChoToTiepNhan(long hoSoThuTucId, long phieuXuLyPhuId,int dongYHoan,long userName, String lyDo) {
		boolean result = true;
		try {
			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.tra.lich.kt.cho.totn", "tra.lich.kt.cho.totn");
			_log.info("traLichKiemTraChoToTiepNhan  dieuKienChuyenDich  "+dieuKienChuyenDich+"  phieuXuLyPhuId   "+phieuXuLyPhuId+" hoSoThuTucId "+hoSoThuTucId);
			motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich, userName);
			
			ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil.findByPhieuXuLyPhuId(phieuXuLyPhuId);	
			
			confirmedInspection.setCorporationId("");
			ConfirmedInspectionLocalServiceUtil.updateConfirmedInspection(confirmedInspection);
			

			MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
			if(motCuaPhieuXuLyPhu!=null){
				String ghiChu = "<font color='red'> "+  DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK: [ ") + FormatData.parseDateToTringType3( new Date())+" ]"+lyDo+" </font>"+"<br>";;
				motCuaPhieuXuLyPhu.setGhiChu(ghiChu+motCuaPhieuXuLyPhu.getGhiChu());
				MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
			}
			
		}catch (Exception e) {
			_log.error(e);
		}
		return result;
	}

	
	
	
	public boolean traBienBanKiemTraChoDangKiemVien(long hoSoThuTucId, long phieuXuLyPhuId,int dongYHoan,long userName,String lyDo) {
		boolean result = true;
		try {
			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.tra.bbkt.dkv", "tra.bbkt.dkv");
			_log.info("traBienBanKiemTraChoDangKiemVien  dieuKienChuyenDich   "+dieuKienChuyenDich+"  phieuXuLyPhuId   "+phieuXuLyPhuId+" hoSoThuTucId "+hoSoThuTucId);
			motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich, userName);
			

			MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
			if(motCuaPhieuXuLyPhu!=null){
				String ghiChu = "<font color='red'> "+  DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK: [ ") + FormatData.parseDateToTringType3( new Date())+" ]"+lyDo+" </font>"+"<br>";;
				motCuaPhieuXuLyPhu.setGhiChu(ghiChu+motCuaPhieuXuLyPhu.getGhiChu());
				
				MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
			}
		}catch (Exception e) {
			_log.error(e);
		}
		return result;
	}
	

	public boolean traBienBanKiemTraChoLanhDaoDonVi(long hoSoThuTucId, long phieuXuLyPhuId,int dongYHoan,long userName,String lyDo) {
		boolean result = true;
		try {
			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.tra.bbkt.lddv", "tra.bbkt.lddv");
			_log.info("traBienBanKiemTraChoLanhDaoDonVi  dieuKienChuyenDich   "+dieuKienChuyenDich+"  phieuXuLyPhuId   "+phieuXuLyPhuId+" hoSoThuTucId "+hoSoThuTucId);
			motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich, userName);

			MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
			if(motCuaPhieuXuLyPhu!=null){
				String ghiChuOld = motCuaPhieuXuLyPhu.getGhiChu().replace("<b>" + DKConfigurationManager.getStrProp("CHO_XAC_NHAN", "Cho xac nhan") + "</b><br>", "");
				ghiChuOld = ghiChuOld.replace("<b>" + DKConfigurationManager.getStrProp("CHO_THAM_DINH", "Cho tham dinh") + "</b><br>", "");
				
				String ghiChu = "<font color='red'>"+  DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK: [ ") + FormatData.parseDateToTringType3( new Date())+" ]" + lyDo + "</font>" + "<br>";
				motCuaPhieuXuLyPhu.setGhiChu(ghiChu + ghiChuOld);
				MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
			}
		}catch (Exception e) {
			_log.error(e);
		}
		return result;
	}
	
	public boolean traHoSoThamDinhLai(long hoSoThuTucId, long phieuXuLyPhuId, String lsVehicleRecordId, int dongYHoan,long userName,String lyDo) {
		boolean result = true;
		/*try {			
			_log.info("listVehicleRecordId===" + lsVehicleRecordId);
			if (lsVehicleRecordId != null) {
				
				List<VehicleRecord> vehicleRecords = LanhDaoPhongBusiness.getListVehicleRecord(lsVehicleRecordId);
								
				// Update DS PT
				if (vehicleRecords != null && vehicleRecords.size() > 0) {	
					int size = vehicleRecords.size();
					VehicleRecord vehicleRecord = null;
					CertificateRecord certificateRecord = null;
					for (int i = 0; i < size; i++) {
						vehicleRecord = vehicleRecords.get(i);
						try{
							certificateRecord = CertificateRecordLocalServiceUtil.fetchCertificateRecord(vehicleRecord.getCertificateRecordId());
						}catch(Exception exception){
							certificateRecord =null;
						}
						
						if(certificateRecord !=null){
							try{
								if((certificateRecord !=null) && (certificateRecord.getAttachedFile()>0)){
									TthcNoidungHoSoLocalServiceUtil.deleteTthcNoidungHoSo(certificateRecord.getAttachedFile());
								}
								
								CertificateRecordLocalServiceUtil.deleteCertificateCircularWithCertificateId(vehicleRecord.getCertificateRecordId());
								CertificateRecordLocalServiceUtil.deleteCertificateSpecWithCertificateId(vehicleRecord.getCertificateRecordId());
								CertificateRecordLocalServiceUtil.deleteCertificateRecord(vehicleRecord.getCertificateRecordId());
								if (i ==0)
								{
									
										DraftCertificateSpecLocalServiceUtil.deleteDraftCertificateSpecWithDraftCertificateId(vehicleRecord.getDraftCertificateId());
										DraftCertificateLocalServiceUtil.deleteDraftCertificate(vehicleRecord.getDraftCertificateId());
								
								}
								
							}catch(Exception exception){
								certificateRecord =null;
							}
						}
						vehicleRecord.setCertificateRecordId(0);
						vehicleRecord.setDraftCertificateId(0);
						VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);	
				
					}
				}
			}
			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.tra.lai.cc", "tra.lai.cc");
			_log.info("traHoSoThamDinhLai  dieuKienChuyenDich   "+dieuKienChuyenDich+"  phieuXuLyPhuId   "+phieuXuLyPhuId+" hoSoThuTucId "+hoSoThuTucId);
			
			motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich, userName);
			_log.info("----------lanhDaoPhongTraHoSoYeuCauThamDinhLai---------tra.lai.cc----");
			
			dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.soan.lai.cc", "soan.lai.cc");			
			motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich, userName);
			_log.info("----------lanhDaoPhongTraHoSoYeuCauThamDinhLai---------soan.lai.cc----");
			
			
			MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
			if(motCuaPhieuXuLyPhu!=null){
				String ghiChuOld = motCuaPhieuXuLyPhu.getGhiChu().replace("<b>" + DKConfigurationManager.getStrProp("CHO_XAC_NHAN", "Cho xac nhan") + "</b><br>", "");
				ghiChuOld = ghiChuOld.replace("<b>" + DKConfigurationManager.getStrProp("CHO_THAM_DINH", "Cho tham dinh") + "</b><br>", "");
				ghiChuOld = ghiChuOld.replace("<b>"+DKConfigurationManager.getStrProp("CHO_PHE_DUYET", "Cho phe duyet")+"</b><br>", "");
				String ghiChu = "<b>" + DKConfigurationManager.getStrProp("CHO_THAM_DINH", "Cho tham dinh") + "</b><br>" + "<font color='red'>"+  DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK: [ ") + FormatData.parseDateToTringType3( new Date())+" ]" + lyDo + "</font>" + "<br>";
				motCuaPhieuXuLyPhu.setGhiChu(ghiChu + ghiChuOld);
				MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
			}
		}catch (Exception e) {
			_log.error(e);
		}*/
		return result;
	}

	public boolean quayLai(long hoSoThuTucId, long phieuXuLyPhuId,int dongYHoan,long userName,String lyDo,String dieuKienChuyenDich) {
		boolean result = true;
		try {
			//String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.tra.bbkt.lddv", "tra.bbkt.lddv");
			//long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
			motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich, userName);

			MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
			if(motCuaPhieuXuLyPhu!=null){
				String ghiChu = "<font color='blue'> "+ DKConfigurationManager.getStrProp("bosunghoso", "KH: [ ") + FormatData.parseDateToTringType3( new Date())+" ]"+lyDo+" </font>"+"<br>";
				motCuaPhieuXuLyPhu.setGhiChu(ghiChu+motCuaPhieuXuLyPhu.getGhiChu());
				MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
			}
		}catch (Exception e) {
			_log.error(e);
		}
		return result;
	}
	
}
