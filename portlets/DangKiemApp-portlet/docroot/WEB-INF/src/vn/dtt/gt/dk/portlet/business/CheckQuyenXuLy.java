package vn.dtt.gt.dk.portlet.business;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoLocalServiceUtil;

public class CheckQuyenXuLy {

	public boolean kiemTraQuyenXuLy(long phieuXuLyChinhId, long phieuXuLyPhuId,int trangThaiSauId,long userId){
		boolean kq = true;
		try{
		MotCuaDienBienHoSo motCuaDienBienHoSo = MotCuaDienBienHoSoLocalServiceUtil.findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy(phieuXuLyChinhId, trangThaiSauId, phieuXuLyPhuId,userId);
		if(motCuaDienBienHoSo==null){
			List<MotCuaDienBienHoSo> motCuaDienBienHoSos =  MotCuaDienBienHoSoLocalServiceUtil.findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauId(phieuXuLyChinhId, trangThaiSauId, phieuXuLyPhuId);
			if(motCuaDienBienHoSos!=null&&motCuaDienBienHoSos.size()>0){
				 motCuaDienBienHoSo =motCuaDienBienHoSos.get(0);
				 motCuaDienBienHoSo.setNguoiXuLy(userId);
				 motCuaDienBienHoSo.setSynchDate(new Date());
				 MotCuaDienBienHoSoLocalServiceUtil.updateMotCuaDienBienHoSo(motCuaDienBienHoSo);
				 
			}
			
		}
		}catch (Exception e) {
			_log.error(e);
		}
		return kq;
	}
	
	private static Log _log = LogFactoryUtil.getLog(CheckQuyenXuLy.class);
}
