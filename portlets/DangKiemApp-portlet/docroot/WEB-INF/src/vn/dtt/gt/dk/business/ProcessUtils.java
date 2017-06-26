/**
 * 
 */
package vn.dtt.gt.dk.business;

import java.util.List;

import vn.dtt.gt.dk.dao.aswmsg.service.MonitorMessageQueueLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich;
import vn.dtt.gt.dk.dao.common.service.TthcKeHoachChuyenDichLocalServiceUtil;

/**
 * @author binhnt
 * 
 */
public class ProcessUtils {

	public boolean checkMessageQueue(Long phieuXuLyChinhId, Long phieuXuLyPhuId) {
//		System.out.println("phieuXuLyChinhId   "+phieuXuLyChinhId);
//		System.out.println("phieuXuLyPhuId   "+phieuXuLyPhuId);
		
		boolean result = false;
		if(phieuXuLyChinhId>0){
			int  countPhieuXuLyChinh  = MonitorMessageQueueLocalServiceUtil.countByHoSoThuTucId(phieuXuLyChinhId);
//			List<AswmsgMessageQueue> aswmsgMessageQueue2 = AswmsgMessageQueueLocalServiceUtil
//					.findByHoSoThuTucId(phieuXuLyChinhId);
			if (countPhieuXuLyChinh > 0) {
				return true;
			}
			List<TthcKeHoachChuyenDich> keHoachChuyenDichs = TthcKeHoachChuyenDichLocalServiceUtil.findByPhieuXuLyChinhId(phieuXuLyChinhId); 
			if(keHoachChuyenDichs!=null &&keHoachChuyenDichs.size()>0){
				return true;
			}
		}
		if (phieuXuLyPhuId > 0) {
//			List<AswmsgMessageQueue> aswmsgMessageQueue2 = AswmsgMessageQueueLocalServiceUtil
//					.findByPhieuXuLyPhuId(phieuXuLyPhuId);
//			if (aswmsgMessageQueue2 != null && aswmsgMessageQueue2.size() > 0) {
			int  countPhieuXuLyPhu  = MonitorMessageQueueLocalServiceUtil.countByLayPhieuXuLyPhuId(phieuXuLyPhuId);
			if(countPhieuXuLyPhu>0){
//				System.out.println("phieuXuLyPhuId   TRUE");
				return true;
			}
			List<TthcKeHoachChuyenDich> keHoachChuyenDichs = TthcKeHoachChuyenDichLocalServiceUtil.findByPhieuXuLyPhuId(phieuXuLyPhuId); 
			if(keHoachChuyenDichs!=null &&keHoachChuyenDichs.size()>0){
				return true;
			}
//			System.out.println("phieuXuLyPhuId   FALSE");
		}
		
//		else{
//			List<AswmsgMessageQueue> aswmsgMessageQueue2 = AswmsgMessageQueueLocalServiceUtil
//					.findByHoSoThuTucId(phieuXuLyChinhId);
//			if (aswmsgMessageQueue2 != null && aswmsgMessageQueue2.size() > 0) {
//				return true;
//			}
//		}
//		System.out.println("phieuXuLyPhuId   FALSE");
		return result;
	}
}
