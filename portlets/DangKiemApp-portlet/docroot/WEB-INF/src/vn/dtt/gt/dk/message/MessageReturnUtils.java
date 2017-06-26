/**
 * 
 */

package vn.dtt.gt.dk.message;

import java.util.Date;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh;
import vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.nsw.Header.From;
import vn.dtt.gt.dk.nsw.Header.Reference;
import vn.dtt.gt.dk.nsw.Header.Subject;
import vn.dtt.gt.dk.nsw.Header.To;
import vn.dtt.gt.dk.utils.format.FormatData;

/**
 * @author binhnt
 * 
 */
public class MessageReturnUtils {
	
	private static Log log = LogFactoryUtil.getLog(MessageReturnUtils.class);
	
	/**
	* @param function
	* @param messageType
	* @param userName
	* @param messageIdSentToNSW
	* @param hoSoThuTuc
	* @return Header
	*/
	public static Header crateHeader( String function, int messageType, String userName, String messageIdSentToNSW, String version,TthcHoSoThuTuc hoSoThuTuc) {
		try {
			
			TthcThuTucHanhChinh tthcThuTucHanhChinh =  TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(hoSoThuTuc.getThuTucHanhChinhId());
			Header header = new Header();
			Subject subject = new Subject();
			subject.setDocumentType(tthcThuTucHanhChinh.getMaThuTuc());//matthc
			
			subject.setDocumentYear(Integer.parseInt( FormatData.getYear(hoSoThuTuc.getNgayGuiHoSo())));
			subject.setPreReference(Long.valueOf( hoSoThuTuc.getMaSoHoSo()));
			subject.setReference(Long.valueOf( hoSoThuTuc.getMaSoHoSo()));
			
			subject.setFunction(function);
			subject.setSendDate(FormatData.parseDateToTring(new Date()));
			subject.setType(messageType);
			
			From from = new From();
			//TODO chua biet lay dau
			from.setIdentity("System");
			from.setName(userName);
			from.setCountryCode("VN");
			from.setMinistryCode("BGTVT");
			from.setOrganizationCode("BGTVT");
			from.setUnitCode(hoSoThuTuc.getMaDonViTiepNhan());
			
			To to = new To();
			to.setIdentity(hoSoThuTuc.getMaSoChuHoSo());
			to.setName(hoSoThuTuc.getTenChuHoSo());
			to.setCountryCode("VN");
			to.setMinistryCode("BTC");
			to.setOrganizationCode("BTC");
			to.setUnitCode("");
			
			Reference ref = new Reference();
			ref.setMessageId(messageIdSentToNSW);
			ref.setVersion(version);
			
			header.setFrom(from);
			header.setTo(to);
			header.setReference(ref);
			header.setSubject(subject);
			
			return header;
		} catch (Exception e) {
			log.error(e);
		}
		return null;
	}
	
	
	
	public static Header crateHeader( String function, int messageType, String userName, String messageIdSentToNSW, 
			String version,Header hoSoThuTuc) {
		try {
			
//			TthcThuTucHanhChinh tthcThuTucHanhChinh =  TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(hoSoThuTuc.getThuTucHanhChinhId());
			Header header = new Header();
			Subject subject = new Subject();
			subject.setDocumentType(hoSoThuTuc.getSubject().getDocumentType());//matthc
			
			subject.setDocumentYear(Integer.parseInt( FormatData.getYear(new Date())));
			subject.setPreReference(Long.valueOf( hoSoThuTuc.getSubject().getPreReference()));
			subject.setReference(Long.valueOf(  hoSoThuTuc.getSubject().getReference()));
			
			subject.setFunction(function);
			subject.setSendDate(FormatData.parseDateToTring(new Date()));
			subject.setType(messageType);
			
			From from = new From();
			//TODO chua biet lay dau
			from.setIdentity("System");
			from.setName(userName);
			from.setCountryCode("VN");
			from.setMinistryCode("BGTVT");
			from.setOrganizationCode("BGTVT");
			from.setUnitCode( hoSoThuTuc.getFrom().getUnitCode());
			
			To to = new To();
			to.setIdentity(hoSoThuTuc.getTo().getIdentity());
			to.setName(hoSoThuTuc.getTo().getName());
			to.setCountryCode("VN");
			to.setMinistryCode("BTC");
			to.setOrganizationCode("BTC");
			to.setUnitCode("");
			
			Reference ref = new Reference();
			ref.setMessageId(messageIdSentToNSW);
			ref.setVersion(version);
			
			header.setFrom(from);
			header.setTo(to);
			header.setReference(ref);
			header.setSubject(subject);
			
			return header;
		} catch (Exception e) {
			log.error(e);
		}
		return null;
	}
	
	
	
	
	public static Header crateHeader( String function, int messageType, String userName, String messageIdSentToNSW, 
			String version,TthcHoSoThuTuc hoSoThuTuc,TthcThuTucHanhChinh tthcThuTucHanhChinh) {
		try {
			
			//TthcThuTucHanhChinh tthcThuTucHanhChinh = TthcThuTucHanhChinhUtil.fetchByPrimaryKey(hoSoThuTuc.getThuTucHanhChinhId());
			
			Header header = new Header();
			Subject subject = new Subject();
			subject.setDocumentType(tthcThuTucHanhChinh.getMaThuTuc());//matthc
			
			subject.setDocumentYear(Integer.parseInt( FormatData.getYear(hoSoThuTuc.getNgayGuiHoSo())));
			subject.setPreReference(Long.valueOf( hoSoThuTuc.getMaSoHoSo()));
			subject.setReference(Long.valueOf( hoSoThuTuc.getMaSoHoSo()));
			
			subject.setFunction(function);
			subject.setSendDate(FormatData.parseDateToTring(new Date()));
			subject.setType(messageType);
			
			From from = new From();
			//TODO chua biet lay dau
			from.setIdentity("System");
			from.setName(userName);
			from.setCountryCode("VN");
			from.setMinistryCode("BGTVT");
			from.setOrganizationCode("BGTVT");
			from.setUnitCode(hoSoThuTuc.getMaDonViTiepNhan());
			
			To to = new To();
			to.setIdentity(hoSoThuTuc.getMaSoChuHoSo());
			to.setName(hoSoThuTuc.getTenChuHoSo());
			to.setCountryCode("VN");
			to.setMinistryCode("BTC");
			to.setOrganizationCode("BTC");
			to.setUnitCode("");
			
			Reference ref = new Reference();
			ref.setMessageId(messageIdSentToNSW);
			ref.setVersion(version);
			
			header.setFrom(from);
			header.setTo(to);
			header.setReference(ref);
			header.setSubject(subject);
			
			return header;
		} catch (Exception e) {
			log.error(e);
		}
		return null;
	}
}
