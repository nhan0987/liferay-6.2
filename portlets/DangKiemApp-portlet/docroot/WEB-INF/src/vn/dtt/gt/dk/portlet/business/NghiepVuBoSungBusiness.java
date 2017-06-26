package vn.dtt.gt.dk.portlet.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.lang.*;

import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh;
import vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaNotification;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaNotificationImpl;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaNotificationLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationAttendeeLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsLocalServiceUtil;
import vn.dtt.gt.dk.message.MessageReturnUtils;
import vn.dtt.gt.dk.message.MessageType;
import vn.dtt.gt.dk.message.MessageUtils;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.nsw.message.xml.MessageFactory;
import vn.dtt.gt.dk.nsw.model.ConfirmCancellation;
import vn.dtt.gt.dk.nsw.model.ConfirmOfRemovedSchedule;
import vn.dtt.gt.dk.nsw.model.ConfirmOfRemovedVehicle;
import vn.dtt.gt.dk.nsw.model.ImportedVehicleList;
import vn.dtt.gt.dk.nsw.model.NoticeCertificateEndorsement;
import vn.dtt.gt.dk.nsw.model.NoticeOfCancellation;
import vn.dtt.gt.dk.nsw.model.RemovedSchedule;
import vn.dtt.gt.dk.nsw.model.RemovedVehicle;
import vn.dtt.gt.dk.sendmessage.SendMessgaeFunctions;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.ConvertUtil;
import vn.dtt.gt.dk.utils.format.FormatData;
import vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong;
import vn.dtt.gt.dk.dao.motcua.model.impl.ThamSoHeThongImpl;
import vn.dtt.gt.dk.dao.motcua.service.ThamSoHeThongLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDongBoMTgatewayImpl;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaDongBoMTgatewayLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.model.impl.DmDataItemImpl;
import vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleCertificateImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleCertificateLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEMAYImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEMAYLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEBONBANH;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEBONBANHImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEBONBANHLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECHUYENDUNGLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOILocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIPHAN2Impl;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEDAPDIEN;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEDAPDIENImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEDAPDIENLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIDONGCOImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIDONGCOLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.ImportedXCDLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

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
		String dieuKienChuyenDichDuPhong = DKConfigurationManager.getStrProp("dieukiendichchuyen.de.nghi.huy.thu.tuc", "de.nghi.huy.thu.tuc");
		long kqDuPhong = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyChinh(tthcHoSoThuTucId, dieuKienChuyenDichDuPhong, userId);
			
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
		tthcHoSoThuTuc.setSynchDate(new Date());
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
		tthcHoSoThuTuc.setSynchDate(new Date());
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
					tthcHoSoThuTuc.setSynchDate(new Date());
					TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
				
	
				 
			}else{
				 tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(tthcHoSoThuTucId);
				String ghiChu = DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK: [ ") + FormatData.parseDateToTringType3(new Date())+" ] ";
				ghiChu = ghiChu + lyDo+"<br>";
				ghiChu = ghiChu + tthcHoSoThuTuc.getGhiChu();
				tthcHoSoThuTuc.setGhiChu(ghiChu);
				tthcHoSoThuTuc.setSynchDate(new Date());
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
										vehicleRecord.setSynchDate(new Date());										
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
			TthcHoSoThuTuc hoSoThuTuc,
			RegisteredInspection registeredInspection,
			long size)
			throws SystemException {
		VehicleStatistics vehicleStatistics = VehicleStatisticsLocalServiceUtil.findByRegisteredInspectionId(registeredInspection.getId());
		if(vehicleStatistics!=null){
			vehicleStatistics.setTotalCancelledVehicle(vehicleStatistics.getTotalCancelledVehicle()+size);
			vehicleStatistics.setTotalRequestedVehicle(vehicleStatistics.getTotalRequestedVehicle()-size);
			vehicleStatistics.setTotalNotYetRequestedVehicle(vehicleStatistics.getTotalNotYetRequestedVehicle()+size);
			vehicleStatistics.setSynchDate(new Date());
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
		hoSoThuTuc.setSynchDate(new Date());
		TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(hoSoThuTuc);
	}

	
	public boolean thongBaoHoanKiemTra(long hoSoThuTucId, long phieuXuLyPhuId,int dongYHoan,String userName,String lyDo,long confirmedInspectionId) {
		boolean result = true;
		try {
			TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(hoSoThuTucId);
			List<VehicleRecord> vehicleRecords = VehicleRecordLocalServiceUtil.findByConfirmedInspectionId(confirmedInspectionId);
			ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil.fetchConfirmedInspection(confirmedInspectionId);
			
			ConfirmOfRemovedSchedule confirmOfRemovedSchedule = new ConfirmOfRemovedSchedule();
			confirmOfRemovedSchedule.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
			confirmOfRemovedSchedule.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
			confirmOfRemovedSchedule.setRequestDate(FormatData.parseDateToTring( new Date()));
			confirmOfRemovedSchedule.setName(userName);
			confirmOfRemovedSchedule.setReasonForRemoving(lyDo);
			if(confirmedInspection != null){
				confirmOfRemovedSchedule.setRequestId(confirmedInspection.getConfirmationCode());
			} else {
				confirmOfRemovedSchedule.setRequestId(0);
			}
			
			List<ConfirmOfRemovedSchedule.ImportedVehicle> importedVehicles = new ArrayList<ConfirmOfRemovedSchedule.ImportedVehicle>();
			String vehicleRecordIdList ="";
			for (VehicleRecord vehicleRecord : vehicleRecords) {
				if(vehicleRecord.getInspectionRecordId() == 0){
				// update
					vehicleRecordIdList=vehicleRecordIdList+vehicleRecord.getId()+",";
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
					
					if(dongYHoan==Constants.DONG_Y){
						
						vehicleRecord.setConfirmedInspectionId(0);
						vehicleRecord.setMarkUpStatus(1);
						vehicleRecord.setSynchDate(new Date());
						VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
					}
				}
			}
				if(importedVehicles!=null&&importedVehicles.size()>0){
					confirmOfRemovedSchedule.getImportedVehicle().addAll(importedVehicles);
				}
			if(dongYHoan==Constants.DONG_Y){
				updateVehicleStatisticsAfterRemoveSchedules(hoSoThuTuc,
						registeredInspection, importedVehicles.size());
			}
			_log.info("lyDo  "+lyDo);
			MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
			if(dongYHoan==Constants.DONG_Y){
				lyDo = "<b>"+ DKConfigurationManager.getStrProp("dongyhoankiemtra", "dong y hoan kiem tra")+ "</b>" +"<br><b><font color='red'>"+lyDo+"</font></b><br>" + motCuaPhieuXuLyPhu.getGhiChu();
			}else{
				lyDo = "<b>"+ DKConfigurationManager.getStrProp("tuchoihoankiemtra", "tu choi hoan kiem tra")+ "</b>" +"<br><b><font color='red'>"+lyDo+"</font></b><br>" + motCuaPhieuXuLyPhu.getGhiChu();	
			}
			motCuaPhieuXuLyPhu.setGhiChu(lyDo);
			_log.info("lyDo  "+lyDo);
			MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.chua.du.phuong.tien", "chua.du.phuong.tien");
			String messageId=functionNghiepVu.getRamdomMessage();
			messgaeFunctions.insertKeHoachChuyenDich(phieuXuLyPhuId, hoSoThuTucId, dieuKienChuyenDich, vehicleRecordIdList, messageId,null,"30", "104");
			motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich, ConvertUtil.convertToLong(userName));
		 
			callWebserviceNSWBusiness.message104va30(userName, hoSoThuTuc, messageId,
					Constants.VERSION_START, confirmOfRemovedSchedule,phieuXuLyPhuId);
			thongBaoHoanKiemTra_DongYHoan(hoSoThuTucId, confirmOfRemovedSchedule.getRequestId(), dongYHoan,userName, lyDo,confirmedInspectionId, messageId);

		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
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
		try {
			if(lyDo==null||lyDo.length()==0){
				lyDo="---";
			}
			_log.info("==========xacNhanLoaiBoPhuongTienKiemTra=============");
			vn.dtt.gt.dk.gate.business.BusinessUtils businessUtils = new vn.dtt.gt.dk.gate.business.BusinessUtils();
			result = businessUtils.messageType106AndFunction30(hoSoThuTucId, phieuXuLyPhuId, dongYHoan, userName, lyDo);			
			
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}
	
	

	public boolean traLichKiemTraChoLanhDao(long hoSoThuTucId, long phieuXuLyPhuId,int dongYHoan,long userName,String lyDo) {
		boolean result = true;
		try {
			
			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.tra.lich.kt.cho.lanh.dao", "tra.lich.kt.cho.lanh.dao");
			_log.info("traLichKiemTraChoLanhDao  dieuKienChuyenDich  "+dieuKienChuyenDich+"  phieuXuLyPhuId   "+phieuXuLyPhuId+" hoSoThuTucId "+hoSoThuTucId);
			//long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
			motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich, userName);
			ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil.findByPhieuXuLyPhuId(phieuXuLyPhuId);	
			CorporationAttendeeLocalServiceUtil.removeByConfirmedInspectionId(confirmedInspection.getId());
			
		
			confirmedInspection.setInspectorId(0);
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
	
	public boolean traLichKiemTraChoToTiepNhan(long hoSoThuTucId, long phieuXuLyPhuId,int dongYHoan,long userName,String lyDo) {
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
		try {			
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
						vehicleRecord.setSynchDate(new Date());
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
		}
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
	
	public String DongboMT() throws SystemException {
		String xmlResult = "";
		try{
			// 3 Steps for synchronizing data
			// Picking one hosothutucid from tthcHosothutuc for insert; 
			String dongbomt = DKConfigurationManager.getStrProp("dong.bo.mtgateway", "DONGBOMTGATEWAY");
			ThamSoHeThong thamSoHeThong = ThamSoHeThongLocalServiceUtil.findByKeyData(dongbomt);
			Long lastHosothutucId = 0L;
			if (thamSoHeThong != null && thamSoHeThong.getValueData().length() > 0) 
			{
				lastHosothutucId = Long.valueOf(thamSoHeThong.getValueData());
			}
			List<TthcHoSoThuTuc> listHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.findByThamsoDongboMTgateway(lastHosothutucId);
			TthcHoSoThuTuc tthcHoSoThuTuc = null;
			
			if ((listHoSoThuTuc != null ) && (listHoSoThuTuc.size() > 0) )
			{
				tthcHoSoThuTuc = listHoSoThuTuc.get(0);
				// Them vehiclrecord vao bang vehiclecertificate theo hosothutucid...
				InsertUpdateVehicleCertificateByHosothutucid(tthcHoSoThuTuc.getId());
				
				_log.info("----------Them vao vehiclecertificate---------tthcHoSoThuTuc----" + tthcHoSoThuTuc.getId());
			}
			
			if ((tthcHoSoThuTuc != null) && (tthcHoSoThuTuc.getId() > 0) && (thamSoHeThong != null))
			{
				thamSoHeThong.setValueData(String.valueOf(tthcHoSoThuTuc.getId()));
				ThamSoHeThongLocalServiceUtil.updateThamSoHeThong(thamSoHeThong);
			}
			
			// Updating MotCuaDongBoMTgateway since latest 15 days  
			List<MotCuaDienBienHoSo> listMotCuaDienBienHoSo =  MotCuaDienBienHoSoLocalServiceUtil.findMotCuaDienBienHoSoByLatest10day(-1,-1);
			MotCuaDongBoMTgateway latestDongBoMTgateway = null;
			if ((listMotCuaDienBienHoSo != null) && (listMotCuaDienBienHoSo.size() > 0))
			{				
				for(MotCuaDienBienHoSo objMotCuaDienBienHoSo : listMotCuaDienBienHoSo){
					latestDongBoMTgateway = MotCuaDongBoMTgatewayLocalServiceUtil.findLatestHosoDongboByHosothutucId(objMotCuaDienBienHoSo.getPhieuXuLyChinhId());
					if (((latestDongBoMTgateway != null) && (objMotCuaDienBienHoSo.getId() > latestDongBoMTgateway.getDienBienHoSoId()))
						|| (latestDongBoMTgateway == null))
					{
						MotCuaDongBoMTgateway objDongBoMTgateway = new MotCuaDongBoMTgatewayImpl();
						objDongBoMTgateway.setDienBienHoSoId(objMotCuaDienBienHoSo.getId());
						objDongBoMTgateway.setPhieuXuLyChinhId(objMotCuaDienBienHoSo.getPhieuXuLyChinhId());
						objDongBoMTgateway.setTrangThai("0");
						objDongBoMTgateway.setModifyDate(new Date());
						MotCuaDongBoMTgatewayLocalServiceUtil.addMotCuaDongBoMTgateway(objDongBoMTgateway);
					}
				}
			}
		// Picking one hosothutucid from MotCuaDongBoMTgateway for update (delete first then insert)	
			
			List<MotCuaDongBoMTgateway> listMotCuaDongBoMTgateway = MotCuaDongBoMTgatewayLocalServiceUtil.findByTrangthaiDongbo("0", 0, 1);
			MotCuaDongBoMTgateway motCuaDongBoMTgateway = null;
			if ((listMotCuaDongBoMTgateway != null) && (listMotCuaDongBoMTgateway.size() > 0))
			{
				motCuaDongBoMTgateway = listMotCuaDongBoMTgateway.get(0);
			}
			if ((motCuaDongBoMTgateway != null) && (motCuaDongBoMTgateway.getPhieuXuLyChinhId() > 0))
			{				
				// Them lai vehiclrecord vao bang vehiclecertificate theo hosothutucid...
				InsertUpdateVehicleCertificateByHosothutucid(motCuaDongBoMTgateway.getPhieuXuLyChinhId());
				
				_log.info("----------Cap nhat vehiclecertificate---------tthcHoSoThuTuc----" + motCuaDongBoMTgateway.getPhieuXuLyChinhId());
				// Cap nhat trang thai motCuaDongBoMTgateway
				List<MotCuaDongBoMTgateway> listHosoMTgateway = MotCuaDongBoMTgatewayLocalServiceUtil.findHoSoByPhieuXuLyChinh(motCuaDongBoMTgateway.getPhieuXuLyChinhId(), -1, -1);
				for(MotCuaDongBoMTgateway objMotCuaDongBoMTgateway : listHosoMTgateway){
					objMotCuaDongBoMTgateway.setTrangThai("1");					
					MotCuaDongBoMTgatewayLocalServiceUtil.updateMotCuaDongBoMTgateway(objMotCuaDongBoMTgateway);
				}
					
			}
			// Picking one by one Certificate from vr_importedxcd, vr_importedxcg, vr_importedxmy, vr_importedxdd, vr_importeddcx for update
			InsertUpdateVehicleCertificate_vr_importedxcd();
			InsertUpdateVehicleCertificate_vr_importedxcg();
			InsertUpdateVehicleCertificate_vr_importedxmy();
			InsertUpdateVehicleCertificate_vr_importedxdd();
			InsertUpdateVehicleCertificate_vr_importeddcx();
			
		}catch (Exception e) {
			_log.error(e);
		}
		return xmlResult;
	}
	
	public boolean InsertUpdateVehicleCertificateByHosothutucid(long hosothutucId) {
		boolean result = true;
		try {
			// 7 Steps for synchronizing step by step
			// Xoa toan bo vehiclrecord trong bang vehiclecertificate, theo hosothutucid
			VehicleCertificateLocalServiceUtil.deleteVehicleCertificateSpecWithHosothutucId(hosothutucId);

			//1.1 Insert VehicleCertificate
			List<VehicleCertificate> lstVehicleCertificate = VehicleCertificateLocalServiceUtil.findVehicleCertificateByHosothutucId(hosothutucId);
			String VehicleClass = ""; 
			
			
			if ((lstVehicleCertificate != null) && (lstVehicleCertificate.size() > 0))
			{
				for(int i=0;i<lstVehicleCertificate.size();i++){
					VehicleCertificate objVehicleCertificate = lstVehicleCertificate.get(i);
					objVehicleCertificate.setId(CounterLocalServiceUtil.increment(VehicleCertificate.class.getName()));
					objVehicleCertificate.setMtGateway(1);
					VehicleCertificateLocalServiceUtil.addVehicleCertificate(objVehicleCertificate);
					//_log.info("----------Cap nhat vehiclecertificate STT ----" + objVehicleCertificate.getSequenceNo() + "----------VehicleRecordId----" + objVehicleCertificate.getVehicleRecordid() + "*****");
				}				
				VehicleClass = lstVehicleCertificate.get(0).getVehicleClass().toUpperCase();
				_log.info("----------Cap nhat vehiclecertificate ----SoluongPT----" + lstVehicleCertificate.size() + "----LoaiPT----" + VehicleClass);
			}
			//1.2 In case of VehicleClass = XCD, Insert thongsochungchi_xechuyendung 
			if (VehicleClass.equalsIgnoreCase("XCD"))
			{
				THONGSOCHUNGCHIXECHUYENDUNGLocalServiceUtil.deleteXCDVehicleCertificateSpecWithHosothutucId(hosothutucId);
				List<THONGSOCHUNGCHIXECHUYENDUNG> lstTHONGSOCHUNGCHIXECHUYENDUNG = THONGSOCHUNGCHIXECHUYENDUNGLocalServiceUtil.findByVehicleGroupInitialAndHosothutucId(hosothutucId);
				if ((lstTHONGSOCHUNGCHIXECHUYENDUNG != null) && (lstTHONGSOCHUNGCHIXECHUYENDUNG.size() > 0))
				{
					for(THONGSOCHUNGCHIXECHUYENDUNG objTHONGSOKYTHUAT : lstTHONGSOCHUNGCHIXECHUYENDUNG){
						
						objTHONGSOKYTHUAT.setId(CounterLocalServiceUtil.increment(THONGSOCHUNGCHIXECHUYENDUNG.class.getName()));
						objTHONGSOKYTHUAT.setHoSoThuTucId(hosothutucId);
						objTHONGSOKYTHUAT.setCertificateRecordId(0);
						if (objTHONGSOKYTHUAT.getVehicleGroupId() > 0)
						{							
							List<VehicleSpecification> lstVehicleSpecification = null;
							lstVehicleSpecification = VehicleSpecificationLocalServiceUtil.findByVehicleGroupId(objTHONGSOKYTHUAT.getVehicleGroupId());
							
							for(VehicleSpecification objVehicleSpecification : lstVehicleSpecification){

								CfgTechnicalspec objCfgTechnicalspec = null;
								if (objVehicleSpecification.getSpecificationCode().equalsIgnoreCase("XCD0001")
										|| objVehicleSpecification.getSpecificationCode().equalsIgnoreCase("XCD0002")
										|| objVehicleSpecification.getSpecificationCode().equalsIgnoreCase("XCD0003")
										|| objVehicleSpecification.getSpecificationCode().equalsIgnoreCase("XCD0004")
										|| objVehicleSpecification.getSpecificationCode().equalsIgnoreCase("XCD0005")
										|| objVehicleSpecification.getSpecificationCode().equalsIgnoreCase("XCD0006")
										|| objVehicleSpecification.getSpecificationCode().equalsIgnoreCase("XCD0007")
										|| objVehicleSpecification.getSpecificationCode().equalsIgnoreCase("XCD0008")										
										)
								{
									// bo qua
								}
								else
								{
									objCfgTechnicalspec = CfgTechnicalspecLocalServiceUtil.findBySpecificationCode(objVehicleSpecification.getSpecificationCode());
								}
								
								if ((objCfgTechnicalspec != null) && (objCfgTechnicalspec.getSequenceno() > 0) && (objCfgTechnicalspec.getSpecificationGroup() == 2))
								{
									if (objCfgTechnicalspec.getSequenceno() == 1)
									{
										if (objCfgTechnicalspec.getDatagroupid() > 0)
										{
											DmDataItem objDmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(objCfgTechnicalspec.getDatagroupid(), objVehicleSpecification.getSpecificationValue());
											if (objDmDataItem != null){
												objTHONGSOKYTHUAT.setXCDVALU001(objDmDataItem.getName());
											}
											else{
												objTHONGSOKYTHUAT.setXCDVALU001(objVehicleSpecification.getSpecificationValue());
											}												
										}
										else
										{
											objTHONGSOKYTHUAT.setXCDVALU001(objVehicleSpecification.getSpecificationValue());
										}
										
										objTHONGSOKYTHUAT.setXCDCODE001(objVehicleSpecification.getSpecificationCode());
										objTHONGSOKYTHUAT.setXCDNAME001(objVehicleSpecification.getSpecificationName());
										
									}
									
									if (objCfgTechnicalspec.getSequenceno() == 2)
									{
										if (objCfgTechnicalspec.getDatagroupid() > 0)
										{
											DmDataItem objDmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(objCfgTechnicalspec.getDatagroupid(), objVehicleSpecification.getSpecificationValue());
											if (objDmDataItem != null){
												objTHONGSOKYTHUAT.setXCDVALU002(objDmDataItem.getName());
											}
											else{
												objTHONGSOKYTHUAT.setXCDVALU002(objVehicleSpecification.getSpecificationValue());
											}												
										}
										else
										{
											objTHONGSOKYTHUAT.setXCDVALU002(objVehicleSpecification.getSpecificationValue());
										}
										
										objTHONGSOKYTHUAT.setXCDCODE002(objVehicleSpecification.getSpecificationCode());
										objTHONGSOKYTHUAT.setXCDNAME002(objVehicleSpecification.getSpecificationName());
										
									}
									
									if (objCfgTechnicalspec.getSequenceno() == 3)
									{
										if (objCfgTechnicalspec.getDatagroupid() > 0)
										{
											DmDataItem objDmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(objCfgTechnicalspec.getDatagroupid(), objVehicleSpecification.getSpecificationValue());
											if (objDmDataItem != null){
												objTHONGSOKYTHUAT.setXCDVALU003(objDmDataItem.getName());
											}
											else{
												objTHONGSOKYTHUAT.setXCDVALU003(objVehicleSpecification.getSpecificationValue());
											}												
										}
										else
										{
											objTHONGSOKYTHUAT.setXCDVALU003(objVehicleSpecification.getSpecificationValue());
										}
										
										objTHONGSOKYTHUAT.setXCDCODE003(objVehicleSpecification.getSpecificationCode());
										objTHONGSOKYTHUAT.setXCDNAME003(objVehicleSpecification.getSpecificationName());
										
									}
									
									if (objCfgTechnicalspec.getSequenceno() == 4)
									{
										if (objCfgTechnicalspec.getDatagroupid() > 0)
										{
											DmDataItem objDmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(objCfgTechnicalspec.getDatagroupid(), objVehicleSpecification.getSpecificationValue());
											if (objDmDataItem != null){
												objTHONGSOKYTHUAT.setXCDVALU004(objDmDataItem.getName());
											}
											else{
												objTHONGSOKYTHUAT.setXCDVALU004(objVehicleSpecification.getSpecificationValue());
											}												
										}
										else
										{
											objTHONGSOKYTHUAT.setXCDVALU004(objVehicleSpecification.getSpecificationValue());
										}
										
										objTHONGSOKYTHUAT.setXCDCODE004(objVehicleSpecification.getSpecificationCode());
										objTHONGSOKYTHUAT.setXCDNAME004(objVehicleSpecification.getSpecificationName());
										
									}
									
									if (objCfgTechnicalspec.getSequenceno() == 5)
									{
										if (objCfgTechnicalspec.getDatagroupid() > 0)
										{
											DmDataItem objDmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(objCfgTechnicalspec.getDatagroupid(), objVehicleSpecification.getSpecificationValue());
											if (objDmDataItem != null){
												objTHONGSOKYTHUAT.setXCDVALU005(objDmDataItem.getName());
											}
											else{
												objTHONGSOKYTHUAT.setXCDVALU005(objVehicleSpecification.getSpecificationValue());
											}												
										}
										else
										{
											objTHONGSOKYTHUAT.setXCDVALU005(objVehicleSpecification.getSpecificationValue());
										}
										
										objTHONGSOKYTHUAT.setXCDCODE005(objVehicleSpecification.getSpecificationCode());
										objTHONGSOKYTHUAT.setXCDNAME005(objVehicleSpecification.getSpecificationName());
										
									}
									
									if (objCfgTechnicalspec.getSequenceno() == 6)
									{
										if (objCfgTechnicalspec.getDatagroupid() > 0)
										{
											DmDataItem objDmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(objCfgTechnicalspec.getDatagroupid(), objVehicleSpecification.getSpecificationValue());
											if (objDmDataItem != null){
												objTHONGSOKYTHUAT.setXCDVALU006(objDmDataItem.getName());
											}
											else{
												objTHONGSOKYTHUAT.setXCDVALU006(objVehicleSpecification.getSpecificationValue());
											}												
										}
										else
										{
											objTHONGSOKYTHUAT.setXCDVALU006(objVehicleSpecification.getSpecificationValue());
										}
										
										objTHONGSOKYTHUAT.setXCDCODE006(objVehicleSpecification.getSpecificationCode());
										objTHONGSOKYTHUAT.setXCDNAME006(objVehicleSpecification.getSpecificationName());
										
									}
									
									if (objCfgTechnicalspec.getSequenceno() == 7)
									{
										if (objCfgTechnicalspec.getDatagroupid() > 0)
										{
											DmDataItem objDmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(objCfgTechnicalspec.getDatagroupid(), objVehicleSpecification.getSpecificationValue());
											if (objDmDataItem != null){
												objTHONGSOKYTHUAT.setXCDVALU007(objDmDataItem.getName());
											}
											else{
												objTHONGSOKYTHUAT.setXCDVALU007(objVehicleSpecification.getSpecificationValue());
											}												
										}
										else
										{
											objTHONGSOKYTHUAT.setXCDVALU007(objVehicleSpecification.getSpecificationValue());
										}
										
										objTHONGSOKYTHUAT.setXCDCODE007(objVehicleSpecification.getSpecificationCode());
										objTHONGSOKYTHUAT.setXCDNAME007(objVehicleSpecification.getSpecificationName());
										
									}
									
									if (objCfgTechnicalspec.getSequenceno() == 8)
									{
										if (objCfgTechnicalspec.getDatagroupid() > 0)
										{
											DmDataItem objDmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(objCfgTechnicalspec.getDatagroupid(), objVehicleSpecification.getSpecificationValue());
											if (objDmDataItem != null){
												objTHONGSOKYTHUAT.setXCDVALU008(objDmDataItem.getName());
											}
											else{
												objTHONGSOKYTHUAT.setXCDVALU008(objVehicleSpecification.getSpecificationValue());
											}												
										}
										else
										{
											objTHONGSOKYTHUAT.setXCDVALU008(objVehicleSpecification.getSpecificationValue());
										}
										
										objTHONGSOKYTHUAT.setXCDCODE008(objVehicleSpecification.getSpecificationCode());
										objTHONGSOKYTHUAT.setXCDNAME008(objVehicleSpecification.getSpecificationName());
										
									}
								
										
									if (objCfgTechnicalspec.getSequenceno() == 9)
									{
										if (objCfgTechnicalspec.getDatagroupid() > 0)
										{
											DmDataItem objDmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(objCfgTechnicalspec.getDatagroupid(), objVehicleSpecification.getSpecificationValue());
											if (objDmDataItem != null){
												objTHONGSOKYTHUAT.setXCDVALU009(objDmDataItem.getName());
											}
											else{
												objTHONGSOKYTHUAT.setXCDVALU009(objVehicleSpecification.getSpecificationValue());
											}												
										}
										else
										{
											objTHONGSOKYTHUAT.setXCDVALU009(objVehicleSpecification.getSpecificationValue());
										}
										
										objTHONGSOKYTHUAT.setXCDCODE009(objVehicleSpecification.getSpecificationCode());
										objTHONGSOKYTHUAT.setXCDNAME009(objVehicleSpecification.getSpecificationName());
										
									}
								}
							}
							
							THONGSOCHUNGCHIXECHUYENDUNGLocalServiceUtil.addTHONGSOCHUNGCHIXECHUYENDUNG(objTHONGSOKYTHUAT);									
						
						}
						
					}
				}
				
				
				List<THONGSOCHUNGCHIXECHUYENDUNG> lstCertificateXECHUYENDUNG = THONGSOCHUNGCHIXECHUYENDUNGLocalServiceUtil.findByCertificateRecordAndHosothutucId(hosothutucId);
				if ((lstCertificateXECHUYENDUNG != null) && (lstCertificateXECHUYENDUNG.size() > 0))
				{
					for(THONGSOCHUNGCHIXECHUYENDUNG objTHONGSOKYTHUAT : lstCertificateXECHUYENDUNG){
						
						objTHONGSOKYTHUAT.setId(CounterLocalServiceUtil.increment(THONGSOCHUNGCHIXECHUYENDUNG.class.getName()));
						objTHONGSOKYTHUAT.setHoSoThuTucId(hosothutucId);
						if (objTHONGSOKYTHUAT.getCertificateRecordId() > 0)
						{
							
							List<CertificateRecordSpec> lstCertificateRecordSpec = null;
							lstCertificateRecordSpec = CertificateRecordSpecLocalServiceUtil.findByCertificateRecordId(objTHONGSOKYTHUAT.getCertificateRecordId());
							
							for(CertificateRecordSpec objCertificateRecordSpec : lstCertificateRecordSpec){
								CfgTechnicalspec objCfgTechnicalspec = null;
								if (objCertificateRecordSpec.getSpecificationCode().equalsIgnoreCase("XCD0001")
										|| objCertificateRecordSpec.getSpecificationCode().equalsIgnoreCase("XCD0002")
										|| objCertificateRecordSpec.getSpecificationCode().equalsIgnoreCase("XCD0003")
										|| objCertificateRecordSpec.getSpecificationCode().equalsIgnoreCase("XCD0004")
										|| objCertificateRecordSpec.getSpecificationCode().equalsIgnoreCase("XCD0005")
										|| objCertificateRecordSpec.getSpecificationCode().equalsIgnoreCase("XCD0006")
										|| objCertificateRecordSpec.getSpecificationCode().equalsIgnoreCase("XCD0007")
										|| objCertificateRecordSpec.getSpecificationCode().equalsIgnoreCase("XCD0008")										
										)
								{
									// bo qua
								}
								else
								{
									objCfgTechnicalspec = CfgTechnicalspecLocalServiceUtil.findBySpecificationCode(objCertificateRecordSpec.getSpecificationCode());
								}
								if ((objCfgTechnicalspec != null) && (objCfgTechnicalspec.getSequenceno() > 0) && (objCfgTechnicalspec.getSpecificationGroup() == 2))
								{
									if (objCfgTechnicalspec.getSequenceno() == 1)
									{
										if (objCfgTechnicalspec.getDatagroupid() > 0)
										{
											DmDataItem objDmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(objCfgTechnicalspec.getDatagroupid(), objCertificateRecordSpec.getSpecificationValue());
											if (objDmDataItem != null){
												objTHONGSOKYTHUAT.setXCDVALU001(objDmDataItem.getName());
											}
											else{
												objTHONGSOKYTHUAT.setXCDVALU001(objCertificateRecordSpec.getSpecificationValue());
											}												
										}
										else
										{
											objTHONGSOKYTHUAT.setXCDVALU001(objCertificateRecordSpec.getSpecificationValue());
										}
										
										objTHONGSOKYTHUAT.setXCDCODE001(objCertificateRecordSpec.getSpecificationCode());
										objTHONGSOKYTHUAT.setXCDNAME001(objCertificateRecordSpec.getSpecificationName());
										
									}
									
									if (objCfgTechnicalspec.getSequenceno() == 2)
									{
										if (objCfgTechnicalspec.getDatagroupid() > 0)
										{
											DmDataItem objDmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(objCfgTechnicalspec.getDatagroupid(), objCertificateRecordSpec.getSpecificationValue());
											if (objDmDataItem != null){
												objTHONGSOKYTHUAT.setXCDVALU002(objDmDataItem.getName());
											}
											else{
												objTHONGSOKYTHUAT.setXCDVALU002(objCertificateRecordSpec.getSpecificationValue());
											}												
										}
										else
										{
											objTHONGSOKYTHUAT.setXCDVALU002(objCertificateRecordSpec.getSpecificationValue());
										}
										
										objTHONGSOKYTHUAT.setXCDCODE002(objCertificateRecordSpec.getSpecificationCode());
										objTHONGSOKYTHUAT.setXCDNAME002(objCertificateRecordSpec.getSpecificationName());
										
									}
									
									if (objCfgTechnicalspec.getSequenceno() == 3)
									{
										if (objCfgTechnicalspec.getDatagroupid() > 0)
										{
											DmDataItem objDmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(objCfgTechnicalspec.getDatagroupid(), objCertificateRecordSpec.getSpecificationValue());
											if (objDmDataItem != null){
												objTHONGSOKYTHUAT.setXCDVALU003(objDmDataItem.getName());
											}
											else{
												objTHONGSOKYTHUAT.setXCDVALU003(objCertificateRecordSpec.getSpecificationValue());
											}												
										}
										else
										{
											objTHONGSOKYTHUAT.setXCDVALU003(objCertificateRecordSpec.getSpecificationValue());
										}
										
										objTHONGSOKYTHUAT.setXCDCODE003(objCertificateRecordSpec.getSpecificationCode());
										objTHONGSOKYTHUAT.setXCDNAME003(objCertificateRecordSpec.getSpecificationName());
										
									}
									
									if (objCfgTechnicalspec.getSequenceno() == 4)
									{
										if (objCfgTechnicalspec.getDatagroupid() > 0)
										{
											DmDataItem objDmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(objCfgTechnicalspec.getDatagroupid(), objCertificateRecordSpec.getSpecificationValue());
											if (objDmDataItem != null){
												objTHONGSOKYTHUAT.setXCDVALU004(objDmDataItem.getName());
											}
											else{
												objTHONGSOKYTHUAT.setXCDVALU004(objCertificateRecordSpec.getSpecificationValue());
											}												
										}
										else
										{
											objTHONGSOKYTHUAT.setXCDVALU004(objCertificateRecordSpec.getSpecificationValue());
										}
										
										objTHONGSOKYTHUAT.setXCDCODE004(objCertificateRecordSpec.getSpecificationCode());
										objTHONGSOKYTHUAT.setXCDNAME004(objCertificateRecordSpec.getSpecificationName());
										
									}
									
									if (objCfgTechnicalspec.getSequenceno() == 5)
									{
										if (objCfgTechnicalspec.getDatagroupid() > 0)
										{
											DmDataItem objDmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(objCfgTechnicalspec.getDatagroupid(), objCertificateRecordSpec.getSpecificationValue());
											if (objDmDataItem != null){
												objTHONGSOKYTHUAT.setXCDVALU005(objDmDataItem.getName());
											}
											else{
												objTHONGSOKYTHUAT.setXCDVALU005(objCertificateRecordSpec.getSpecificationValue());
											}												
										}
										else
										{
											objTHONGSOKYTHUAT.setXCDVALU005(objCertificateRecordSpec.getSpecificationValue());
										}
										
										objTHONGSOKYTHUAT.setXCDCODE005(objCertificateRecordSpec.getSpecificationCode());
										objTHONGSOKYTHUAT.setXCDNAME005(objCertificateRecordSpec.getSpecificationName());
										
									}
									
									if (objCfgTechnicalspec.getSequenceno() == 6)
									{
										if (objCfgTechnicalspec.getDatagroupid() > 0)
										{
											DmDataItem objDmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(objCfgTechnicalspec.getDatagroupid(), objCertificateRecordSpec.getSpecificationValue());
											if (objDmDataItem != null){
												objTHONGSOKYTHUAT.setXCDVALU006(objDmDataItem.getName());
											}
											else{
												objTHONGSOKYTHUAT.setXCDVALU006(objCertificateRecordSpec.getSpecificationValue());
											}												
										}
										else
										{
											objTHONGSOKYTHUAT.setXCDVALU006(objCertificateRecordSpec.getSpecificationValue());
										}
										
										objTHONGSOKYTHUAT.setXCDCODE006(objCertificateRecordSpec.getSpecificationCode());
										objTHONGSOKYTHUAT.setXCDNAME006(objCertificateRecordSpec.getSpecificationName());
										
									}
									
									if (objCfgTechnicalspec.getSequenceno() == 7)
									{
										if (objCfgTechnicalspec.getDatagroupid() > 0)
										{
											DmDataItem objDmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(objCfgTechnicalspec.getDatagroupid(), objCertificateRecordSpec.getSpecificationValue());
											if (objDmDataItem != null){
												objTHONGSOKYTHUAT.setXCDVALU007(objDmDataItem.getName());
											}
											else{
												objTHONGSOKYTHUAT.setXCDVALU007(objCertificateRecordSpec.getSpecificationValue());
											}												
										}
										else
										{
											objTHONGSOKYTHUAT.setXCDVALU007(objCertificateRecordSpec.getSpecificationValue());
										}
										
										objTHONGSOKYTHUAT.setXCDCODE007(objCertificateRecordSpec.getSpecificationCode());
										objTHONGSOKYTHUAT.setXCDNAME007(objCertificateRecordSpec.getSpecificationName());
										
									}
									
									if (objCfgTechnicalspec.getSequenceno() == 8)
									{
										if (objCfgTechnicalspec.getDatagroupid() > 0)
										{
											DmDataItem objDmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(objCfgTechnicalspec.getDatagroupid(), objCertificateRecordSpec.getSpecificationValue());
											if (objDmDataItem != null){
												objTHONGSOKYTHUAT.setXCDVALU008(objDmDataItem.getName());
											}
											else{
												objTHONGSOKYTHUAT.setXCDVALU008(objCertificateRecordSpec.getSpecificationValue());
											}												
										}
										else
										{
											objTHONGSOKYTHUAT.setXCDVALU008(objCertificateRecordSpec.getSpecificationValue());
										}
										
										objTHONGSOKYTHUAT.setXCDCODE008(objCertificateRecordSpec.getSpecificationCode());
										objTHONGSOKYTHUAT.setXCDNAME008(objCertificateRecordSpec.getSpecificationName());
										
									}
								
										
									if (objCfgTechnicalspec.getSequenceno() == 9)
									{
										if (objCfgTechnicalspec.getDatagroupid() > 0)
										{
											DmDataItem objDmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(objCfgTechnicalspec.getDatagroupid(), objCertificateRecordSpec.getSpecificationValue());
											if (objDmDataItem != null){
												objTHONGSOKYTHUAT.setXCDVALU009(objDmDataItem.getName());
											}
											else{
												objTHONGSOKYTHUAT.setXCDVALU009(objCertificateRecordSpec.getSpecificationValue());
											}												
										}
										else
										{
											objTHONGSOKYTHUAT.setXCDVALU009(objCertificateRecordSpec.getSpecificationValue());
										}
										
										objTHONGSOKYTHUAT.setXCDCODE009(objCertificateRecordSpec.getSpecificationCode());
										objTHONGSOKYTHUAT.setXCDNAME009(objCertificateRecordSpec.getSpecificationName());
										
									}
								}
							}
							
							THONGSOCHUNGCHIXECHUYENDUNGLocalServiceUtil.addTHONGSOCHUNGCHIXECHUYENDUNG(objTHONGSOKYTHUAT);
									
						}
						
					}
				}
			}
			//1.3 In case of VehicleClass = XCG, Insert thongsochungchi_xecogioi 
			if (VehicleClass.equalsIgnoreCase("XCG"))
			{
				THONGSOCHUNGCHIXECOGIOILocalServiceUtil.deleteXCGVehicleCertificateSpecWithHosothutucId(hosothutucId);
				List<THONGSOCHUNGCHIXECOGIOI> lstTHONGSOCHUNGCHIXECOGIOI = THONGSOCHUNGCHIXECOGIOILocalServiceUtil.findByVehicleGroupInitialAndHosothutucId(hosothutucId);
				if ((lstTHONGSOCHUNGCHIXECOGIOI != null) && (lstTHONGSOCHUNGCHIXECOGIOI.size() > 0))
				{
					for(THONGSOCHUNGCHIXECOGIOI objTHONGSOKYTHUAT : lstTHONGSOCHUNGCHIXECOGIOI){
						
						objTHONGSOKYTHUAT.setId(CounterLocalServiceUtil.increment(THONGSOCHUNGCHIXECOGIOI.class.getName()));
						objTHONGSOKYTHUAT.setHoSoThuTucId(hosothutucId);
						objTHONGSOKYTHUAT.setCertificateRecordId(0);
						if (objTHONGSOKYTHUAT.getVehicleGroupId() > 0)
						{
							THONGSOCHUNGCHIXECOGIOILocalServiceUtil.addTHONGSOCHUNGCHIXECOGIOI(objTHONGSOKYTHUAT);
						}
						
					}
				}
				
				List<THONGSOCHUNGCHIXECOGIOIPHAN2> lstTHONGSOCHUNGCHIXECOGIOIPHAN2 = THONGSOCHUNGCHIXECOGIOILocalServiceUtil.findPart2ByVehicleGroupInitialAndHosothutucId(hosothutucId);
				if ((lstTHONGSOCHUNGCHIXECOGIOIPHAN2 != null) && (lstTHONGSOCHUNGCHIXECOGIOIPHAN2.size() > 0))
				{
					for(THONGSOCHUNGCHIXECOGIOIPHAN2 objTHONGSOKYTHUAT : lstTHONGSOCHUNGCHIXECOGIOIPHAN2){
						List<THONGSOCHUNGCHIXECOGIOI> objCAPNHATTHONGSOKYTHUAT = THONGSOCHUNGCHIXECOGIOILocalServiceUtil.findByVehicleGroupId(objTHONGSOKYTHUAT.getVehicleGroupId());
						if ((objTHONGSOKYTHUAT.getVehicleGroupId() > 0) && (objCAPNHATTHONGSOKYTHUAT != null) && (objCAPNHATTHONGSOKYTHUAT.size() > 0))
						{	
							objTHONGSOKYTHUAT.setId(objCAPNHATTHONGSOKYTHUAT.get(objCAPNHATTHONGSOKYTHUAT.size() -1).getId());
							objTHONGSOKYTHUAT.setHoSoThuTucId(hosothutucId);
							objTHONGSOKYTHUAT.setCertificateRecordId(0);
						
							THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.updateTHONGSOCHUNGCHIXECOGIOIPHAN2(objTHONGSOKYTHUAT);
						}
						
					}
				}
				
				List<THONGSOCHUNGCHIXECOGIOI> lstCertificateXECOGIOI = THONGSOCHUNGCHIXECOGIOILocalServiceUtil.findByCertificateRecordAndHosothutucId(hosothutucId);
				if ((lstCertificateXECOGIOI != null) && (lstCertificateXECOGIOI.size() > 0))
				{
					for(THONGSOCHUNGCHIXECOGIOI objTHONGSOKYTHUAT : lstCertificateXECOGIOI){						
						
						objTHONGSOKYTHUAT.setId(CounterLocalServiceUtil.increment(THONGSOCHUNGCHIXECOGIOI.class.getName()));
						objTHONGSOKYTHUAT.setHoSoThuTucId(hosothutucId);
						if (objTHONGSOKYTHUAT.getCertificateRecordId() > 0)
						{
							THONGSOCHUNGCHIXECOGIOILocalServiceUtil.addTHONGSOCHUNGCHIXECOGIOI(objTHONGSOKYTHUAT);
						}
					}
				}
				
				List<THONGSOCHUNGCHIXECOGIOIPHAN2> lstCertificateXECOGIOIPHAN2 = THONGSOCHUNGCHIXECOGIOILocalServiceUtil.findPart2ByCertificateRecordAndHosothutucId(hosothutucId);
				if ((lstCertificateXECOGIOIPHAN2 != null) && (lstCertificateXECOGIOIPHAN2.size() > 0))
				{
					for(THONGSOCHUNGCHIXECOGIOIPHAN2 objTHONGSOKYTHUAT : lstCertificateXECOGIOIPHAN2){
						List<THONGSOCHUNGCHIXECOGIOI> objCAPNHATTHONGSOKYTHUAT = THONGSOCHUNGCHIXECOGIOILocalServiceUtil.findByCertificateRecordId(objTHONGSOKYTHUAT.getCertificateRecordId());
						if ((objTHONGSOKYTHUAT.getCertificateRecordId() > 0) && (objCAPNHATTHONGSOKYTHUAT != null) && (objCAPNHATTHONGSOKYTHUAT.size() > 0))
						{	
							objTHONGSOKYTHUAT.setId(objCAPNHATTHONGSOKYTHUAT.get(objCAPNHATTHONGSOKYTHUAT.size() -1).getId());
							objTHONGSOKYTHUAT.setHoSoThuTucId(hosothutucId);
													
							THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil.updateTHONGSOCHUNGCHIXECOGIOIPHAN2(objTHONGSOKYTHUAT);
						}
						
					}
				}
			}
			//1.4 In case of VehicleClass = XMY, Insert thongsochungchi_xemay 
			if (VehicleClass.equalsIgnoreCase("XMY"))
			{
				THONGSOCHUNGCHIXEMAYLocalServiceUtil.deleteXMYVehicleCertificateSpecWithHosothutucId(hosothutucId);
				List<THONGSOCHUNGCHIXEMAY> lstTHONGSOCHUNGCHIXEMAY = THONGSOCHUNGCHIXEMAYLocalServiceUtil.findByVehicleGroupInitialAndHosothutucId(hosothutucId);
				if ((lstTHONGSOCHUNGCHIXEMAY != null) && (lstTHONGSOCHUNGCHIXEMAY.size() > 0))
				{
					for(THONGSOCHUNGCHIXEMAY objTHONGSOKYTHUAT : lstTHONGSOCHUNGCHIXEMAY){
						
						objTHONGSOKYTHUAT.setId(CounterLocalServiceUtil.increment(THONGSOCHUNGCHIXEMAY.class.getName()));
						objTHONGSOKYTHUAT.setHoSoThuTucId(hosothutucId);
						objTHONGSOKYTHUAT.setCertificateRecordId(0);
						if (objTHONGSOKYTHUAT.getVehicleGroupId() > 0)
						{
							THONGSOCHUNGCHIXEMAYLocalServiceUtil.addTHONGSOCHUNGCHIXEMAY(objTHONGSOKYTHUAT);
						}
						
					}
				}
				
				List<THONGSOCHUNGCHIXEMAY> lstCertificateXEMAY = THONGSOCHUNGCHIXEMAYLocalServiceUtil.findByCertificateRecordAndHosothutucId(hosothutucId);
				if ((lstCertificateXEMAY != null) && (lstCertificateXEMAY.size() > 0))
				{
					for(THONGSOCHUNGCHIXEMAY objTHONGSOKYTHUAT : lstCertificateXEMAY){						
						
						objTHONGSOKYTHUAT.setId(CounterLocalServiceUtil.increment(THONGSOCHUNGCHIXEMAY.class.getName()));
						objTHONGSOKYTHUAT.setHoSoThuTucId(hosothutucId);
						if (objTHONGSOKYTHUAT.getCertificateRecordId() > 0)
						{
							THONGSOCHUNGCHIXEMAYLocalServiceUtil.addTHONGSOCHUNGCHIXEMAY(objTHONGSOKYTHUAT);
						}
					}
				}
			}
			//1.5 In case of VehicleClass = DCX, Insert thongsochungchi_dongco 
			if (VehicleClass.equalsIgnoreCase("DCX"))
			{
				THONGSOCHUNGCHIDONGCOLocalServiceUtil.deleteDCXVehicleCertificateSpecWithHosothutucId(hosothutucId);
				List<THONGSOCHUNGCHIDONGCO> lstTHONGSOCHUNGCHIDONGCO = THONGSOCHUNGCHIDONGCOLocalServiceUtil.findByVehicleGroupInitialAndHosothutucId(hosothutucId);
				if ((lstTHONGSOCHUNGCHIDONGCO != null) && (lstTHONGSOCHUNGCHIDONGCO.size() > 0))
				{
					for(THONGSOCHUNGCHIDONGCO objTHONGSOKYTHUAT : lstTHONGSOCHUNGCHIDONGCO){
						
						objTHONGSOKYTHUAT.setId(CounterLocalServiceUtil.increment(THONGSOCHUNGCHIDONGCO.class.getName()));
						objTHONGSOKYTHUAT.setHoSoThuTucId(hosothutucId);
						objTHONGSOKYTHUAT.setCertificateRecordId(0);
						if (objTHONGSOKYTHUAT.getVehicleGroupId() > 0)
						{
							THONGSOCHUNGCHIDONGCOLocalServiceUtil.addTHONGSOCHUNGCHIDONGCO(objTHONGSOKYTHUAT);
						}
						
					}
				}
				
				List<THONGSOCHUNGCHIDONGCO> lstCertificateDONGCO = THONGSOCHUNGCHIDONGCOLocalServiceUtil.findByCertificateRecordAndHosothutucId(hosothutucId);
				if ((lstCertificateDONGCO != null) && (lstCertificateDONGCO.size() > 0))
				{
					for(THONGSOCHUNGCHIDONGCO objTHONGSOKYTHUAT : lstCertificateDONGCO){						
						
						objTHONGSOKYTHUAT.setId(CounterLocalServiceUtil.increment(THONGSOCHUNGCHIDONGCO.class.getName()));
						objTHONGSOKYTHUAT.setHoSoThuTucId(hosothutucId);
						if (objTHONGSOKYTHUAT.getCertificateRecordId() > 0)
						{
							THONGSOCHUNGCHIDONGCOLocalServiceUtil.addTHONGSOCHUNGCHIDONGCO(objTHONGSOKYTHUAT);
						}
					}
				}
			}
			//1.6 In case of VehicleClass = XDD, Insert thongsochungchi_xedapdien
			if (VehicleClass.equalsIgnoreCase("XDD"))
			{
				THONGSOCHUNGCHIXEDAPDIENLocalServiceUtil.deleteXDDVehicleCertificateSpecWithHosothutucId(hosothutucId);
				List<THONGSOCHUNGCHIXEDAPDIEN> lstTHONGSOCHUNGCHIXEDAPDIEN = THONGSOCHUNGCHIXEDAPDIENLocalServiceUtil.findByVehicleGroupInitialAndHosothutucId(hosothutucId);
				if ((lstTHONGSOCHUNGCHIXEDAPDIEN != null) && (lstTHONGSOCHUNGCHIXEDAPDIEN.size() > 0))
				{
					for(THONGSOCHUNGCHIXEDAPDIEN objTHONGSOKYTHUAT : lstTHONGSOCHUNGCHIXEDAPDIEN){
						
						objTHONGSOKYTHUAT.setId(CounterLocalServiceUtil.increment(THONGSOCHUNGCHIXEDAPDIEN.class.getName()));
						objTHONGSOKYTHUAT.setHoSoThuTucId(hosothutucId);
						objTHONGSOKYTHUAT.setCertificateRecordId(0);
						if (objTHONGSOKYTHUAT.getVehicleGroupId() > 0)
						{
							THONGSOCHUNGCHIXEDAPDIENLocalServiceUtil.addTHONGSOCHUNGCHIXEDAPDIEN(objTHONGSOKYTHUAT);
						}
						
					}
				}
				
				List<THONGSOCHUNGCHIXEDAPDIEN> lstCertificateXEDAPDIEN = THONGSOCHUNGCHIXEDAPDIENLocalServiceUtil.findByCertificateRecordAndHosothutucId(hosothutucId);
				if ((lstCertificateXEDAPDIEN != null) && (lstCertificateXEDAPDIEN.size() > 0))
				{
					for(THONGSOCHUNGCHIXEDAPDIEN objTHONGSOKYTHUAT : lstCertificateXEDAPDIEN){						
						
						objTHONGSOKYTHUAT.setId(CounterLocalServiceUtil.increment(THONGSOCHUNGCHIXEDAPDIEN.class.getName()));
						objTHONGSOKYTHUAT.setHoSoThuTucId(hosothutucId);
						if (objTHONGSOKYTHUAT.getCertificateRecordId() > 0)
						{
							THONGSOCHUNGCHIXEDAPDIENLocalServiceUtil.addTHONGSOCHUNGCHIXEDAPDIEN(objTHONGSOKYTHUAT);
						}
					}
				}
			}
			//1.7 In case of VehicleClass = XBB, Insert thongsochungchi_xebonbanh
			if (VehicleClass.equalsIgnoreCase("XBB"))
			{
				THONGSOCHUNGCHIXEBONBANHLocalServiceUtil.deleteXBBVehicleCertificateSpecWithHosothutucId(hosothutucId);
				List<THONGSOCHUNGCHIXEBONBANH> lstTHONGSOCHUNGCHIXEBONBANH = THONGSOCHUNGCHIXEBONBANHLocalServiceUtil.findByVehicleGroupInitialAndHosothutucId(hosothutucId);
				if ((lstTHONGSOCHUNGCHIXEBONBANH != null) && (lstTHONGSOCHUNGCHIXEBONBANH.size() > 0))
				{
					for(THONGSOCHUNGCHIXEBONBANH objTHONGSOKYTHUAT : lstTHONGSOCHUNGCHIXEBONBANH){
						
						objTHONGSOKYTHUAT.setId(CounterLocalServiceUtil.increment(THONGSOCHUNGCHIXEBONBANH.class.getName()));
						objTHONGSOKYTHUAT.setHoSoThuTucId(hosothutucId);
						objTHONGSOKYTHUAT.setCertificateRecordId(0);
						if (objTHONGSOKYTHUAT.getVehicleGroupId() > 0)
						{
							THONGSOCHUNGCHIXEBONBANHLocalServiceUtil.addTHONGSOCHUNGCHIXEBONBANH(objTHONGSOKYTHUAT);
						}
						
					}
				}
				
				List<THONGSOCHUNGCHIXEBONBANH> lstCertificateXEBONBANH = THONGSOCHUNGCHIXEBONBANHLocalServiceUtil.findByCertificateRecordAndHosothutucId(hosothutucId);
				if ((lstCertificateXEBONBANH != null) && (lstCertificateXEBONBANH.size() > 0))
				{
					for(THONGSOCHUNGCHIXEBONBANH objTHONGSOKYTHUAT : lstCertificateXEBONBANH){						
						
						objTHONGSOKYTHUAT.setId(CounterLocalServiceUtil.increment(THONGSOCHUNGCHIXEBONBANH.class.getName()));
						objTHONGSOKYTHUAT.setHoSoThuTucId(hosothutucId);
						if (objTHONGSOKYTHUAT.getCertificateRecordId() > 0)
						{
							THONGSOCHUNGCHIXEBONBANHLocalServiceUtil.addTHONGSOCHUNGCHIXEBONBANH(objTHONGSOKYTHUAT);
						}
						
					}
				}
			}
			
		}catch (Exception e) {
			_log.error(e);
		}
		return result;
	}
	
	public boolean InsertUpdateVehicleCertificate_vr_importedxcd() {
		boolean result = true;
		try {	
			List<ImportedXCD> listImportedXCD = ImportedXCDLocalServiceUtil.findByTrangthaiDongbo("0", 0, 1);
			ImportedXCD synchronizedImportedXCD = null;
			if ((listImportedXCD != null) && (listImportedXCD.size() > 0))
			{
				synchronizedImportedXCD = listImportedXCD.get(0);
			}
			if ((synchronizedImportedXCD != null) && (synchronizedImportedXCD.getIDGCN().length() > 0) && (synchronizedImportedXCD.getSoDangKy().length() > 0))
			{	
				// Xoa toan bo vehiclrecord trong bang vehiclecertificate, theo hosothutucid
				VehicleCertificateLocalServiceUtil.deleteVehicleCertificateOutOfMTGateway(0, synchronizedImportedXCD.getIDGCN(), synchronizedImportedXCD.getSoDangKy());

				String VehicleClass = "XCD"; 
				long tmpLong = 0;
				VehicleCertificate objVehicleCertificate = new VehicleCertificateImpl();
				objVehicleCertificate.setId(CounterLocalServiceUtil.increment(VehicleCertificate.class.getName()));
				objVehicleCertificate.setMtGateway(0);
				objVehicleCertificate.setHoSoThuTucId(objVehicleCertificate.getId());
				objVehicleCertificate.setSequenceNo(1);
				objVehicleCertificate.setVehicleRecordid(tmpLong);
				objVehicleCertificate.setDraftCertificateid(tmpLong);
				objVehicleCertificate.setCertificateRecordid(objVehicleCertificate.getId());
				objVehicleCertificate.setDebitNoteId(tmpLong);
				
				objVehicleCertificate.setVehicleGroupId(tmpLong);
				objVehicleCertificate.setVehicleClass(VehicleClass);
				objVehicleCertificate.setTechnicalSpecCode(synchronizedImportedXCD.getMaChu());
				objVehicleCertificate.setReferenceCertificateNo("");
				objVehicleCertificate.setSafetytestreportNo("");
				objVehicleCertificate.setEmissiontestreportNo("");
				objVehicleCertificate.setCopreportNo("");
				objVehicleCertificate.setControlreportNo("");			
				objVehicleCertificate.setVehicletypeDescription(synchronizedImportedXCD.getTenXe());
				objVehicleCertificate.setVehicleType(synchronizedImportedXCD.getMaTenXe());
				objVehicleCertificate.setEngineType("");
				objVehicleCertificate.setEnginetypeDescription("");
				objVehicleCertificate.setMarkAsVehicle(1);
				objVehicleCertificate.setTradeMark("1");
				objVehicleCertificate.setTrademarkDescription(synchronizedImportedXCD.getNhanHieu());
				objVehicleCertificate.setCommercialName(synchronizedImportedXCD.getTenThuongMai());
				objVehicleCertificate.setModelCode(synchronizedImportedXCD.getSoLoai());
				
				objVehicleCertificate.setProductionPlant(synchronizedImportedXCD.getNoiSx());
				objVehicleCertificate.setAddressOfProductionPlant("");
				objVehicleCertificate.setEmissionStandard("");
				objVehicleCertificate.setCodeNumber(objVehicleCertificate.getId());
				objVehicleCertificate.setChassisNumber(synchronizedImportedXCD.getSoKhung());
				objVehicleCertificate.setEngineNumber(synchronizedImportedXCD.getSoDongCo());
				objVehicleCertificate.setProductionYear(synchronizedImportedXCD.getNamSx());
				objVehicleCertificate.setCountryName(synchronizedImportedXCD.getNoiSx());
				objVehicleCertificate.setVehicleColor("");
				objVehicleCertificate.setCurrentStatus("2");
				objVehicleCertificate.setVehicleEngineUsage("---");
				objVehicleCertificate.setMarkUpStatus(tmpLong);
				objVehicleCertificate.setMarkAsSample(0);
				
				objVehicleCertificate.setVehicleengineStatus(22);
				objVehicleCertificate.setVehicleengineFolder(50);
				objVehicleCertificate.setVehicleGroupInitialId(tmpLong);
				objVehicleCertificate.setRegisteredInspectionId(objVehicleCertificate.getId());
				objVehicleCertificate.setRegisteredNumber(synchronizedImportedXCD.getSoDangKy());
				objVehicleCertificate.setImporterCode("");
				objVehicleCertificate.setImporterName(synchronizedImportedXCD.getTenChu());
				objVehicleCertificate.setImporterAddress(synchronizedImportedXCD.getDiaChi());
				objVehicleCertificate.setRepresentative(synchronizedImportedXCD.getNguoiKT());
				objVehicleCertificate.setEmail(synchronizedImportedXCD.getNgayKiemTra());
				objVehicleCertificate.setPhone(synchronizedImportedXCD.getDienThoai());
				objVehicleCertificate.setFax(synchronizedImportedXCD.getSoFAX());				
				objVehicleCertificate.setInspectionProvince(synchronizedImportedXCD.getNoiKiemTra());
				
				objVehicleCertificate.setConfirmedInspectionId(tmpLong);
				objVehicleCertificate.setInspectionRecordId(tmpLong);
				objVehicleCertificate.setInspectionRecordNo(synchronizedImportedXCD.getSoBienBan());
				objVehicleCertificate.setInspectionModeDescription("");
				
				objVehicleCertificate.setImportCustomDeclareNo(synchronizedImportedXCD.getSoToKhai());
				objVehicleCertificate.setImportCustomDeclareDate(null);
				
				objVehicleCertificate.setInspectorName(synchronizedImportedXCD.getNguoiKT() + " ngay " + synchronizedImportedXCD.getNgayKiemTra());
				objVehicleCertificate.setConfirmedResultDescription(synchronizedImportedXCD.getKetQua()  + " ngay " + synchronizedImportedXCD.getNgayCapGCN());
				objVehicleCertificate.setRemarks(synchronizedImportedXCD.getNote());
				objVehicleCertificate.setCertificateNumber(synchronizedImportedXCD.getIDGCN());
				if (synchronizedImportedXCD.getIDGCN().contains("KMC")) {
					objVehicleCertificate.setCertificateType(1);					
				}

				
				
				VehicleCertificateLocalServiceUtil.addVehicleCertificate(objVehicleCertificate);
				_log.info("----------Cap nhat vehiclecertificate ----SoChungChi----" + synchronizedImportedXCD.getIDGCN() + "----LoaiPT----" + VehicleClass);

				if (VehicleClass.equalsIgnoreCase("XCD"))	{
					THONGSOCHUNGCHIXECHUYENDUNGLocalServiceUtil.deleteXCDVehicleCertificateSpecWithXCD0009(synchronizedImportedXCD.getIDGCN());
					
					THONGSOCHUNGCHIXECHUYENDUNG objTHONGSOKYTHUAT = new THONGSOCHUNGCHIXECHUYENDUNGImpl();
					objTHONGSOKYTHUAT.setId(CounterLocalServiceUtil.increment(THONGSOCHUNGCHIXECHUYENDUNG.class.getName()));
					objTHONGSOKYTHUAT.setHoSoThuTucId(0);
					objTHONGSOKYTHUAT.setCertificateRecordId(0); 
					objTHONGSOKYTHUAT.setVehicleGroupId(0);
					objTHONGSOKYTHUAT.setXCD0009(synchronizedImportedXCD.getIDGCN());
					
					List<ImportedXCD> lstImportedXCD = ImportedXCDLocalServiceUtil.findByIDGCN(synchronizedImportedXCD.getIDGCN(), 0);
					if ((lstImportedXCD != null) && (lstImportedXCD.size() > 0))
					{
						for(ImportedXCD objImportedXCD : lstImportedXCD){	
							
							
							if (objImportedXCD.getSTT() == 1)
							{
								objTHONGSOKYTHUAT.setXCDVALU001(objImportedXCD.getGiaTri() + "  " + objImportedXCD.getThuNguyen());
								objTHONGSOKYTHUAT.setXCDCODE001(objImportedXCD.getMaTSKT());	
								objTHONGSOKYTHUAT.setXCDNAME001(objImportedXCD.getTenDacTinhV());
							}
							if (objImportedXCD.getSTT() == 2)
							{
								objTHONGSOKYTHUAT.setXCDVALU002(objImportedXCD.getGiaTri() + "  " + objImportedXCD.getThuNguyen());
								objTHONGSOKYTHUAT.setXCDCODE002(objImportedXCD.getMaTSKT());	
								objTHONGSOKYTHUAT.setXCDNAME002(objImportedXCD.getTenDacTinhV());
							}
							if (objImportedXCD.getSTT() == 3)
							{
								objTHONGSOKYTHUAT.setXCDVALU003(objImportedXCD.getGiaTri() + "  " + objImportedXCD.getThuNguyen());
								objTHONGSOKYTHUAT.setXCDCODE003(objImportedXCD.getMaTSKT());	
								objTHONGSOKYTHUAT.setXCDNAME003(objImportedXCD.getTenDacTinhV());
							}
							if (objImportedXCD.getSTT() == 4)
							{
								objTHONGSOKYTHUAT.setXCDVALU004(objImportedXCD.getGiaTri() + "  " + objImportedXCD.getThuNguyen());
								objTHONGSOKYTHUAT.setXCDCODE004(objImportedXCD.getMaTSKT());	
								objTHONGSOKYTHUAT.setXCDNAME004(objImportedXCD.getTenDacTinhV());
							}
							if (objImportedXCD.getSTT() == 5)
							{
								objTHONGSOKYTHUAT.setXCDVALU005(objImportedXCD.getGiaTri() + "  " + objImportedXCD.getThuNguyen());
								objTHONGSOKYTHUAT.setXCDCODE005(objImportedXCD.getMaTSKT());	
								objTHONGSOKYTHUAT.setXCDNAME005(objImportedXCD.getTenDacTinhV());
							}
							if (objImportedXCD.getSTT() == 6)
							{
								objTHONGSOKYTHUAT.setXCDVALU006(objImportedXCD.getGiaTri() + "  " + objImportedXCD.getThuNguyen());
								objTHONGSOKYTHUAT.setXCDCODE006(objImportedXCD.getMaTSKT());	
								objTHONGSOKYTHUAT.setXCDNAME006(objImportedXCD.getTenDacTinhV());
							}
							if (objImportedXCD.getSTT() == 7)
							{
								objTHONGSOKYTHUAT.setXCDVALU007(objImportedXCD.getGiaTri() + "  " + objImportedXCD.getThuNguyen());
								objTHONGSOKYTHUAT.setXCDCODE007(objImportedXCD.getMaTSKT());	
								objTHONGSOKYTHUAT.setXCDNAME007(objImportedXCD.getTenDacTinhV());
							}
							if (objImportedXCD.getSTT() == 8)
							{
								objTHONGSOKYTHUAT.setXCDVALU008(objImportedXCD.getGiaTri() + "  " + objImportedXCD.getThuNguyen());
								objTHONGSOKYTHUAT.setXCDCODE008(objImportedXCD.getMaTSKT());	
								objTHONGSOKYTHUAT.setXCDNAME008(objImportedXCD.getTenDacTinhV());
							}
							if (objImportedXCD.getSTT() == 9)
							{
								objTHONGSOKYTHUAT.setXCDVALU009(objImportedXCD.getGiaTri() + "  " + objImportedXCD.getThuNguyen());
								objTHONGSOKYTHUAT.setXCDCODE009(objImportedXCD.getMaTSKT());	
								objTHONGSOKYTHUAT.setXCDNAME009(objImportedXCD.getTenDacTinhV());
							}
							if (objImportedXCD.getSTT() == 10)
							{
								objTHONGSOKYTHUAT.setXCDVALU010(objImportedXCD.getGiaTri() + "  " + objImportedXCD.getThuNguyen());
								objTHONGSOKYTHUAT.setXCDCODE010(objImportedXCD.getMaTSKT());	
								objTHONGSOKYTHUAT.setXCDNAME010(objImportedXCD.getTenDacTinhV());
							}
							if (objImportedXCD.getSTT() == 11)
							{
								objTHONGSOKYTHUAT.setXCDVALU011(objImportedXCD.getGiaTri() + "  " + objImportedXCD.getThuNguyen());
								objTHONGSOKYTHUAT.setXCDCODE011(objImportedXCD.getMaTSKT());	
								objTHONGSOKYTHUAT.setXCDNAME011(objImportedXCD.getTenDacTinhV());
							}
							if (objImportedXCD.getSTT() == 12)
							{
								objTHONGSOKYTHUAT.setXCDVALU012(objImportedXCD.getGiaTri() + "  " + objImportedXCD.getThuNguyen());
								objTHONGSOKYTHUAT.setXCDCODE012(objImportedXCD.getMaTSKT());	
								objTHONGSOKYTHUAT.setXCDNAME012(objImportedXCD.getTenDacTinhV());
							}
							
						
							
							objImportedXCD.setTrangthai(1);
							ImportedXCDLocalServiceUtil.updateImportedXCD(objImportedXCD);
						}
					}

					
					THONGSOCHUNGCHIXECHUYENDUNGLocalServiceUtil.addTHONGSOCHUNGCHIXECHUYENDUNG(objTHONGSOKYTHUAT);
								
							
				}
			}			
		}catch (Exception e) {
			_log.error(e);
		}
		return result;
	}
	public boolean InsertUpdateVehicleCertificate_vr_importedxcg() {
		boolean result = true;
		try {	
		
		}catch (Exception e) {
			_log.error(e);
		}
		return result;
	}
	public boolean InsertUpdateVehicleCertificate_vr_importedxmy() {
		boolean result = true;
		try {	
		
		}catch (Exception e) {
			_log.error(e);
		}
		return result;
	}
	public boolean InsertUpdateVehicleCertificate_vr_importedxdd() {
		boolean result = true;
		try {	
		
		}catch (Exception e) {
			_log.error(e);
		}
		return result;
	}
	public boolean InsertUpdateVehicleCertificate_vr_importeddcx() {
		boolean result = true;
		try {	
		
		}catch (Exception e) {
			_log.error(e);
		}
		return result;
	}
}
