package vn.dtt.gt.dk.portlet.business;

import java.util.Date;
import java.util.List;

import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich;
import vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro;
import vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcKeHoachChuyenDichLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoVaiTroLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoImpl;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyChinhImpl;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuImpl;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaChuyenDichTrangThaiLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyChinhLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote;
import vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalServiceUtil;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.dk.utils.format.Constants;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class MotCuaBusiness {

	private static Log _log = LogFactoryUtil.getLog(MotCuaBusiness.class);
	CallWebserviceNSWBusiness callWebserviceNSWBusiness  = new CallWebserviceNSWBusiness();
	public long dichChuyenTrangThaiPhieuSuLyChinh(Long hoSoThuTucId, String dieuKienChuyenDich, Long userId) {
		long result = 2;
		try {
//			_log.info("dichChuyenTrangThaiPhieuSuLyChinh  " + hoSoThuTucId);
			MotCuaPhieuXuLyChinh phieuXuLyChinh = MotCuaPhieuXuLyChinhLocalServiceUtil.findByHoSoThuTucId(hoSoThuTucId);
			List<MotCuaChuyenDichTrangThai> chuyenDichTrangThais = MotCuaChuyenDichTrangThaiLocalServiceUtil
					.findByDieuKienChuyenDichAndTrangThaiNguonId(dieuKienChuyenDich,
							phieuXuLyChinh.getTrangThaiHienTaiId());

			if (chuyenDichTrangThais != null && chuyenDichTrangThais.size() > 0) {
				
//				_log.info("dichChuyenTrangThaiPhieuSuLyChinh " + chuyenDichTrangThais.size()+" phieuXuLyChinh  "+phieuXuLyChinh.getTrangThaiHienTaiId()+"  hoSoThuTucId "+hoSoThuTucId);

				MotCuaChuyenDichTrangThai chuyenDichTrangThai = chuyenDichTrangThais.get(0);
				result = chuyenDichTrangThai.getTrangThaiDichId();

				
				MotCuaDienBienHoSo motCuaDienBienHoSo = new MotCuaDienBienHoSoImpl();
				long  id = CounterLocalServiceUtil.increment(MotCuaDienBienHoSo.class.getName());
				 motCuaDienBienHoSo.setId(id);
				motCuaDienBienHoSo.setNgayXuLy(new Date());
				motCuaDienBienHoSo.setNguoiXuLy(userId);
				motCuaDienBienHoSo.setPhieuXuLyChinhId(phieuXuLyChinh.getId());
				motCuaDienBienHoSo.setTrangThaiSauId(chuyenDichTrangThai.getTrangThaiDichId());
				motCuaDienBienHoSo.setTrangThaiTruocId(chuyenDichTrangThai.getTrangThaiNguonId());
				motCuaDienBienHoSo.setHanhDongXuLy(chuyenDichTrangThai.getHanhDongXuLy());
				motCuaDienBienHoSo.setSoNgayQuaHan(chuyenDichTrangThai.getSoNgayXuLy());
				motCuaDienBienHoSo.setSynchdate(new Date());
				MotCuaDienBienHoSoLocalServiceUtil.addMotCuaDienBienHoSo(motCuaDienBienHoSo);

				phieuXuLyChinh.setTrangThaiHienTaiId(chuyenDichTrangThai.getTrangThaiDichId());				
				phieuXuLyChinh.setChiemQuyenXuLy(0);
				phieuXuLyChinh.setNguoiTaoPhieu(userId);
				MotCuaPhieuXuLyChinhLocalServiceUtil.updateMotCuaPhieuXuLyChinh(phieuXuLyChinh);
				
//				_log.info("--MotCuaChuyenDichTrangThai-==================================chuyenDichTrangThai===="+chuyenDichTrangThai);

				TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);				
				
				if ((tthcHoSoThuTuc != null) && (chuyenDichTrangThai.getPhanNhomHoSoId() > 0)) {
					
					_log.info("--MotCuaChuyenDichTrangThai-==================================chuyenDichTrangThai.getPhanNhomHoSoId()===="+chuyenDichTrangThai.getPhanNhomHoSoId());
					
					tthcHoSoThuTuc.setPhanNhomHoSoId(chuyenDichTrangThai.getPhanNhomHoSoId());
					TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
				}
			}

			
		} catch (Exception e) {
			_log.error(e);
			result = 0;
		}
		_log.info("dichChuyenTrangThaiPhieuSuLyChinh  out");
		return result;
	}

	public long dichChuyenTrangThaiPhieuSuLyPhu(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich, long userId) {
		long result = 2;
		try {
			MotCuaPhieuXuLyPhu phieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
			
			List<MotCuaChuyenDichTrangThai> chuyenDichTrangThais = MotCuaChuyenDichTrangThaiLocalServiceUtil
					.findByDieuKienChuyenDichAndTrangThaiNguonId(dieuKienChuyenDich,
							phieuXuLyPhu.getTrangThaiHienTaiId());
			
			if (chuyenDichTrangThais != null && chuyenDichTrangThais.size() > 0) {
				MotCuaChuyenDichTrangThai chuyenDichTrangThai = chuyenDichTrangThais.get(0);
				MotCuaDienBienHoSo motCuaDienBienHoSo = new MotCuaDienBienHoSoImpl();
				long  id = CounterLocalServiceUtil.increment(MotCuaDienBienHoSo.class.getName());
				 motCuaDienBienHoSo.setId(id);
				motCuaDienBienHoSo.setNgayXuLy(new Date());
				motCuaDienBienHoSo.setNguoiXuLy(userId);
				motCuaDienBienHoSo.setPhieuXuLyChinhId(phieuXuLyPhu.getPhieuXuLyChinhId());
				motCuaDienBienHoSo.setPhieuXuLyPhuId(phieuXuLyPhu.getId());
				motCuaDienBienHoSo.setTrangThaiSauId(chuyenDichTrangThai.getTrangThaiDichId());
				motCuaDienBienHoSo.setTrangThaiTruocId(chuyenDichTrangThai.getTrangThaiNguonId());
				motCuaDienBienHoSo.setHanhDongXuLy(chuyenDichTrangThai.getHanhDongXuLy());
				motCuaDienBienHoSo.setSoNgayQuaHan(chuyenDichTrangThai.getSoNgayXuLy());
				motCuaDienBienHoSo.setSynchdate(new Date());
				MotCuaDienBienHoSoLocalServiceUtil.addMotCuaDienBienHoSo(motCuaDienBienHoSo);
				phieuXuLyPhu.setPhanNhomHoSoId(chuyenDichTrangThai.getPhanNhomHoSoId());
				List<TthcPhanNhomHoSoVaiTro> hoSoVaiTros = TthcPhanNhomHoSoVaiTroLocalServiceUtil.findByPhanNhomHoSoId(chuyenDichTrangThai.getPhanNhomHoSoId());
				if(hoSoVaiTros!=null&&hoSoVaiTros.size()>0){
					TthcPhanNhomHoSoVaiTro hoSoVaiTro = hoSoVaiTros.get(0);
					phieuXuLyPhu.setNhomPhieuXuLy(hoSoVaiTro.getNhomPhieuXuLy());
				}
				result =chuyenDichTrangThai.getTrangThaiDichId();
				phieuXuLyPhu.setTrangThaiHienTaiId(chuyenDichTrangThai.getTrangThaiDichId());
				phieuXuLyPhu.setNgayTaoPhieu(new Date());
				MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(phieuXuLyPhu);
				

				
			}

		} catch (Exception e) {
			_log.error(e);
			return result;
		}
		return result;
	}

	public boolean putHoSo2PhieuChinh(Long hoSoThuTucId) {
		boolean result = true;
		try {
			TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			MotCuaPhieuXuLyChinh phieuXuLyChinh = new MotCuaPhieuXuLyChinhImpl();
			phieuXuLyChinh.setId(hoSoThuTucId);
			phieuXuLyChinh.setTrangThaiHienTaiId(TrangThaiConstains.TAO_MOI);
			// phieuXuLyChinh.setCmndNguoiNop(hoSoThuTuc.get)

			MotCuaPhieuXuLyChinhLocalServiceUtil.addMotCuaPhieuXuLyChinh(phieuXuLyChinh);

		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public long insertPhieuXuLyPhu(long phieuXuLyChinhId, long noiDungHoSoId,int trangThaiHienTai,String nhomPhieuXuLy,String trichYeuNoiDung,String ghiChu) {
		try {
			MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = new MotCuaPhieuXuLyPhuImpl();
			long idMotCuaPhieuXuLyPhu = CounterLocalServiceUtil.increment(MotCuaPhieuXuLyPhu.class.getName());
			motCuaPhieuXuLyPhu.setId(idMotCuaPhieuXuLyPhu);
			motCuaPhieuXuLyPhu.setPhieuXuLyChinhId(phieuXuLyChinhId);
			if(noiDungHoSoId>0){
			motCuaPhieuXuLyPhu.setNoiDungHoSoId(noiDungHoSoId);
			}
			motCuaPhieuXuLyPhu.setNhomPhieuXuLy(nhomPhieuXuLy);
			motCuaPhieuXuLyPhu.setTrichYeuNoiDung(trichYeuNoiDung);
			motCuaPhieuXuLyPhu.setGhiChu(ghiChu);
			motCuaPhieuXuLyPhu.setTrangThaiHienTaiId(trangThaiHienTai);
			motCuaPhieuXuLyPhu.setPhanNhomHoSoId(Constants.PHIEU_XU_LY_PHU_PHAN_CONG_DON_VI_KIEM_TRA);

			motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.addMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);

			return idMotCuaPhieuXuLyPhu;
		} catch (Exception e) {
			_log.error(e);
			_log.error(e);
		}
		return 0;
	}
	
	public long putHoSo2PhieuPhu(Long hoSoThuTucId, int trangThaiHienTai,Long userId) {
			try {
				MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = new MotCuaPhieuXuLyPhuImpl();
				long idMotCuaPhieuXuLyPhu = CounterLocalServiceUtil.increment(MotCuaPhieuXuLyPhu.class.getName());
				motCuaPhieuXuLyPhu.setId(idMotCuaPhieuXuLyPhu);
				motCuaPhieuXuLyPhu.setPhieuXuLyChinhId(hoSoThuTucId);
				//motCuaPhieuXuLyPhu.setNoiDungHoSoId(noiDungHoSoId);
				motCuaPhieuXuLyPhu.setTrangThaiHienTaiId(TrangThaiConstains.TAO_MOI);
				motCuaPhieuXuLyPhu.setNhomPhieuXuLy("XACNHANKEHOACH");
				motCuaPhieuXuLyPhu.setTrangThaiHienTaiId(trangThaiHienTai);
				motCuaPhieuXuLyPhu.setPhanNhomHoSoId(Constants.PHIEU_XU_LY_PHU_PHAN_CONG_DON_VI_KIEM_TRA);

//				motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.addMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
				String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.du.dieu.kien.kt",
						"du.dieu.kien.kt");
				List<MotCuaChuyenDichTrangThai> chuyenDichTrangThais = MotCuaChuyenDichTrangThaiLocalServiceUtil
						.findByDieuKienChuyenDichAndTrangThaiNguonId(dieuKienChuyenDich,
								TrangThaiConstains.TAO_MOI);
				
				if (chuyenDichTrangThais != null && chuyenDichTrangThais.size() > 0) {
					MotCuaChuyenDichTrangThai chuyenDichTrangThai = chuyenDichTrangThais.get(0);
					MotCuaDienBienHoSo motCuaDienBienHoSo = new MotCuaDienBienHoSoImpl();
					long  id = CounterLocalServiceUtil.increment(MotCuaDienBienHoSo.class.getName());
					 motCuaDienBienHoSo.setId(id);
					motCuaDienBienHoSo.setNgayXuLy(new Date());
					motCuaDienBienHoSo.setNguoiXuLy(userId);
					motCuaDienBienHoSo.setPhieuXuLyChinhId(hoSoThuTucId);
					motCuaDienBienHoSo.setPhieuXuLyPhuId(idMotCuaPhieuXuLyPhu);
					motCuaDienBienHoSo.setTrangThaiSauId(chuyenDichTrangThai.getTrangThaiDichId());
					motCuaDienBienHoSo.setTrangThaiTruocId(chuyenDichTrangThai.getTrangThaiNguonId());
					motCuaDienBienHoSo.setHanhDongXuLy(chuyenDichTrangThai.getHanhDongXuLy());
					motCuaDienBienHoSo.setSoNgayQuaHan(chuyenDichTrangThai.getSoNgayXuLy());
					motCuaDienBienHoSo.setSynchdate(new Date());
					MotCuaDienBienHoSoLocalServiceUtil.addMotCuaDienBienHoSo(motCuaDienBienHoSo);
					motCuaPhieuXuLyPhu.setPhanNhomHoSoId(chuyenDichTrangThai.getPhanNhomHoSoId());
					List<TthcPhanNhomHoSoVaiTro> hoSoVaiTros = TthcPhanNhomHoSoVaiTroLocalServiceUtil.findByPhanNhomHoSoId(chuyenDichTrangThai.getPhanNhomHoSoId());
					if(hoSoVaiTros!=null&&hoSoVaiTros.size()>0){
						TthcPhanNhomHoSoVaiTro hoSoVaiTro = hoSoVaiTros.get(0);
						motCuaPhieuXuLyPhu.setNhomPhieuXuLy(hoSoVaiTro.getNhomPhieuXuLy());
					}
					//result =chuyenDichTrangThai.getTrangThaiDichId();
					motCuaPhieuXuLyPhu.setTrangThaiHienTaiId(chuyenDichTrangThai.getTrangThaiDichId());
					//MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(phieuXuLyPhu);
					

					
				}
				motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.addMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
				
				return idMotCuaPhieuXuLyPhu;
			} catch (Exception e) {

				_log.error(e);
			}
			return 0;
		}
	public boolean capHoSo(long hoSoThuTucId, long bieuMauHoSoId) {
		boolean result = true;
		try {
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public void tuDongChuyenDichTrangThai(String messageId, Header header ){
		try{
			List<TthcKeHoachChuyenDich> tthcKeHoachChuyenDichs = TthcKeHoachChuyenDichLocalServiceUtil.findByMessageId(messageId);
			if(tthcKeHoachChuyenDichs!=null&&tthcKeHoachChuyenDichs.size()>0){
				int size =tthcKeHoachChuyenDichs.size();
				for(int i=0;i<size;i++){
					TthcKeHoachChuyenDich tthcKeHoachChuyenDich = tthcKeHoachChuyenDichs.get(i);
					if(tthcKeHoachChuyenDich!=null&&tthcKeHoachChuyenDich.getId()>0){
						 
						if(tthcKeHoachChuyenDich.getPhieuXuLyPhuId()>0){
							MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(tthcKeHoachChuyenDich.getPhieuXuLyPhuId());
							String ghiChu =motCuaPhieuXuLyPhu.getGhiChu() ;
							String replace ="<br>" +DKConfigurationManager.getStrProp("dangxuly", "Dang cho xu ly....") ;
							ghiChu = ghiChu.replace(replace,
									"");
							motCuaPhieuXuLyPhu.setGhiChu(ghiChu);
							MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
						}else if(tthcKeHoachChuyenDich.getPhieuXuLyChinhId()>0){
							TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(tthcKeHoachChuyenDich.getPhieuXuLyChinhId());
							
							String ghiChu =tthcHoSoThuTuc.getGhiChu() ;
							String replace ="<br>" +DKConfigurationManager.getStrProp("dangxuly", "Dang cho xu ly....") ;
							ghiChu = ghiChu.replace(replace,
									"");
							tthcHoSoThuTuc.setGhiChu(ghiChu);
						
							TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
			
						}
		
						TthcKeHoachChuyenDichLocalServiceUtil.deleteTthcKeHoachChuyenDich(tthcKeHoachChuyenDich.getId());
					}
				}
			}
			
			
		//callWebserviceNSWBusiness.sendMessageComplete(header);
			
			
		}catch (Exception e) {
			_log.error(e);
		}
		
		
	}

}
