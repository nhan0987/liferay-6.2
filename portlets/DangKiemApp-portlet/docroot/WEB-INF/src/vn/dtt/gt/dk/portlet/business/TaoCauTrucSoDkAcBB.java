package vn.dtt.gt.dk.portlet.business;

import java.util.Date;

import vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong;
import vn.dtt.gt.dk.dao.motcua.model.impl.ThamSoHeThongImpl;
import vn.dtt.gt.dk.dao.motcua.service.ThamSoHeThongLocalServiceUtil;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.dk.utils.format.Constants;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class TaoCauTrucSoDkAcBB {
	private static Log _log = LogFactoryUtil.getLog(TaoCauTrucSoDkAcBB.class);
	// public static int VR_SIZE_SO_DANG_KY_KIEM_TRA =
	// DKConfigurationManager.getIntProp("VR_SIZE_SO_DANG_KY_KIEM_TRA",6);
	// Quy Dinh So Dang Ky Kiem Tra

	public static String XE_CO_GIOI = "XCG";
	// public static final String TYPE_XE_CO_GIOI =
	// PortletProps.get("vr_xe_co_gioi");

	public static String XE_MAY_CHUYEN_DUNG = "XCD";
	// public static final String TYPE_XE_MAY_CHUYEN_DUNG =
	// PortletProps.get("vr_xe_may_chuyen_dung");

	public static String XE_BON_BANH_CHO_NGUOI = "XBB";
	// public static final String TYPE_XE_BON_BANH_CHO_NGUOI =
	// PortletProps.get("vr_xe_bon_banh_cho_nguoi");

	public static String MO_TO_XE_GAN_MAY = "XMY";
	// public static final String TYPE_XE_GAN_MAY =
	// PortletProps.get("vr_mo_to_xe_gan_may");

	public static String DONG_CO = "DCX";
	// public static final String TYPE_DONG_CO = PortletProps.get("vr_dong_co");

	public static String XE_DAP_DIEN = "XDD";

	// public static final String TYPE_XE_DAP_DIEN =
	// PortletProps.get("vr_xe_dap_dien");

	// Quy Dinh So Bien Ban Kiem Tra
	public String quyDinhSoDangKyKiemTra(String loaiXe) {
		String ketQua = taoSo(loaiXe, DKConfigurationManager.getIntProp("VR_SIZE_SO_DANG_KY_KIEM_TRA", 6));
		ketQua = ketQua + "/" + getYear(new Date());
//		_log.info("quyDinhSoDangKyKiemTra  " + ketQua);
		if (loaiXe.equalsIgnoreCase(XE_CO_GIOI) == true) {
			ketQua = ketQua + DKConfigurationManager.getStrProp("vr_xe_co_gioi", "OT");

		} else if (loaiXe.equalsIgnoreCase(XE_MAY_CHUYEN_DUNG) == true) {
			ketQua = ketQua + DKConfigurationManager.getStrProp("vr_xe_may_chuyen_dung", "MC");

		} else if (loaiXe.equalsIgnoreCase(XE_BON_BANH_CHO_NGUOI) == true) {
			ketQua = ketQua + DKConfigurationManager.getStrProp("vr_xe_bon_banh_cho_nguoi", "BN");

		} else if (loaiXe.equalsIgnoreCase(MO_TO_XE_GAN_MAY) == true) {
			ketQua = ketQua + DKConfigurationManager.getStrProp("vr_mo_to_xe_gan_may", "XM");

		} else if (loaiXe.equalsIgnoreCase(DONG_CO) == true) {
			ketQua = ketQua + DKConfigurationManager.getStrProp("vr_dong_co", "DC");

		} else if (loaiXe.equalsIgnoreCase(XE_DAP_DIEN) == true) {
			ketQua = ketQua + DKConfigurationManager.getStrProp("vr_xe_dap_dien", "XD");
		}
//		_log.info("quyDinhSoDangKyKiemTra  " + ketQua);
		return ketQua;
	}

	public String quyDinhSoBienBanKiemTra(String soDangKyKiemtra, String maNV) {
//		_log.info("quyDinhSoBienBanKiemTra MaNV");
		String ketQua = soDangKyKiemtra;
		// VR_SIZE_SO_TU_TANG_NHAN_VIEN
		String nam= getYear(new Date())+"";
		if(soDangKyKiemtra!=null&&soDangKyKiemtra.length()>0){
//			nam = soDangKyKiemtra.substring(soDangKyKiemtra.length()-4,soDangKyKiemtra.length()-2);
			nam = soDangKyKiemtra.substring(soDangKyKiemtra.lastIndexOf("/")+1,soDangKyKiemtra.lastIndexOf("/")+3);
		}
//		_log.info("soDangKyKiemtra  "+soDangKyKiemtra);
		ketQua = ketQua + "-" + maNV + "/"
//				+ taoSo(soDangKyKiemtra, DKConfigurationManager.getIntProp("VR_SIZE_SO_TU_TANG_NHAN_VIEN", 3));
				+ taoSoKhongTheoNam(soDangKyKiemtra, DKConfigurationManager.getIntProp("VR_SIZE_SO_TU_TANG_NHAN_VIEN", 3),nam);
		return ketQua;
	}
	public String quyDinhSoBienBanKiemTraKhiChuaLapBBKT(String soDangKyKiemtra, String maNV) {
		String ketQua = soDangKyKiemtra;
		// VR_SIZE_SO_TU_TANG_NHAN_VIEN
		ketQua = ketQua + "-" + maNV + "/" + "0000";
		return ketQua;
	}
	public String quyDinhSoBienBanKiemTraTheoThuTuXeMau(String soDangKyKiemtra, String maNV, long soThuTuXeMau) throws SystemException {
		
		// update vao thamSoHeThong
		String loaiXe = soDangKyKiemtra + getYear(new Date());
		ThamSoHeThong thamSoHeThong = ThamSoHeThongLocalServiceUtil.findByKeyData(loaiXe);
		long count = 1;
		if (thamSoHeThong == null) {
			thamSoHeThong = new ThamSoHeThongImpl();
			long id = CounterLocalServiceUtil.increment(ThamSoHeThong.class.getName());
			thamSoHeThong.setId(id);
			thamSoHeThong.setDescription(loaiXe);
			thamSoHeThong.setKeyData(loaiXe);
			if (count < soThuTuXeMau) {
				count = soThuTuXeMau;
			}
			thamSoHeThong.setValueData(count + "");
			ThamSoHeThongLocalServiceUtil.addThamSoHeThong(thamSoHeThong);

		} else {
			count = Long.valueOf(thamSoHeThong.getValueData());
			if (count < soThuTuXeMau) {
				count = soThuTuXeMau;
				thamSoHeThong.setValueData(count + "");
				ThamSoHeThongLocalServiceUtil.updateThamSoHeThong(thamSoHeThong);
			}			
		}
//		_log.info("quyDinhSoBienBanKiemTra MaNV");
		String ketQua = soDangKyKiemtra;
		
		if(soDangKyKiemtra!=null&&soDangKyKiemtra.length()>0 && soThuTuXeMau > 0){
			int size = DKConfigurationManager.getIntProp("VR_SIZE_SO_TU_TANG_NHAN_VIEN", 3) - (soThuTuXeMau+"").length();
			String taoSo = soThuTuXeMau+"";
			if (size > 0) {
				for (int i = 0; i < size; i++) {
					taoSo = "0" + taoSo;
				}
			} else if (size < 0) {
				// do nothing
			}
			ketQua = ketQua + "-" + maNV + "/" + taoSo;
		
		}
		return ketQua;
	}
	public String quyDinhSoChungChiChatLuong(String loaiXe, long loaiChungChi) {
//		System.out.print("quyDinhSoChungChiChatLuong   " + loaiXe);
		String ma = loaiXe;// DKConfigurationManager.getStrProp(loaiXeChungChi,
							// loaiXeChungChi);

		if (loaiXe.equalsIgnoreCase(XE_CO_GIOI) == true) {
			if (loaiChungChi == Constants.CERTIFICATE_TYPE_GCN) {
				ma = "KOT";
			}else if (loaiChungChi == Constants.CERTIFICATE_TYPE_TBM) {
				ma = "MOT";
			}else if (loaiChungChi == Constants.CERTIFICATE_TYPE_TBKD) {
				ma = "TOT";
			}else if (loaiChungChi == Constants.CERTIFICATE_TYPE_TBVP) {
				ma = "VOT";
			} 

		} else if (loaiXe.equalsIgnoreCase(XE_MAY_CHUYEN_DUNG) == true) {
			if (loaiChungChi == Constants.CERTIFICATE_TYPE_GCN) {
				ma = "KMC";
			}else if (loaiChungChi == Constants.CERTIFICATE_TYPE_TBM) {
				ma = "MMC";
			}else if (loaiChungChi == Constants.CERTIFICATE_TYPE_TBKD) {
				ma = "TMC";
			}else if (loaiChungChi == Constants.CERTIFICATE_TYPE_TBVP) {
				ma = "VMC";
			}

		} else if (loaiXe.equalsIgnoreCase(XE_BON_BANH_CHO_NGUOI) == true) {
			if (loaiChungChi == Constants.CERTIFICATE_TYPE_GCN) {
				ma = "KBN";
			}else if (loaiChungChi == Constants.CERTIFICATE_TYPE_TBKD) {
				ma = "TBN";
			}else if (loaiChungChi == Constants.CERTIFICATE_TYPE_TBVP) {
				ma = "VBN";
			}

		} else if (loaiXe.equalsIgnoreCase(MO_TO_XE_GAN_MAY) == true) {
			if (loaiChungChi == Constants.CERTIFICATE_TYPE_GCN) {
				ma = "KXM";
			}else if (loaiChungChi == Constants.CERTIFICATE_TYPE_TBXNTT) {
				ma = "HXM";
			}else if (loaiChungChi == Constants.CERTIFICATE_TYPE_TBKD) {
				ma = "TXM";
			}else if (loaiChungChi == Constants.CERTIFICATE_TYPE_TBVP) {
				ma = "VXM";
			}

		} else if (loaiXe.equalsIgnoreCase(DONG_CO) == true) {
			if (loaiChungChi == Constants.CERTIFICATE_TYPE_GCN) {
				ma = "KDC";
			}else if (loaiChungChi == Constants.CERTIFICATE_TYPE_TBKD) {
				ma = "TDC";
			}else if (loaiChungChi == Constants.CERTIFICATE_TYPE_TBVP) {
				ma = "VDC";
			}


		} else if (loaiXe.equalsIgnoreCase(XE_DAP_DIEN) == true) {
			if (loaiChungChi == Constants.CERTIFICATE_TYPE_GCN) {
				ma = "KXD";
			}else if (loaiChungChi == Constants.CERTIFICATE_TYPE_TBKD) {
				ma = "TXD";
			}else if (loaiChungChi == Constants.CERTIFICATE_TYPE_TBVP) {
				ma = "VXD";
			}

		}

		String ketQua = getYear(new Date())
				+ ma
				+ "/"
				+ taoSo(loaiXe+loaiChungChi, DKConfigurationManager.getIntProp("VR_SIZE_SO_TU_TANG_CHUNG_CHI_CHAT_LUONG", 6));
		System.out.print("quyDinhSoChungChiChatLuong   " + ketQua);
		return ketQua;

	}

	public String taoSo(String loaiXe, int soBanDau) {

		String taoSo = "";
		try {
			loaiXe = loaiXe + getYear(new Date());
			long count = taoGiaTriThamSo(loaiXe);
			taoSo = count + "";
			// int VR_SIZE_SO_DANG_KY_KIEM_TRA =
			// DKConfigurationManager.getIntProp("VR_SIZE_SO_DANG_KY_KIEM_TRA",
			// 6);
			int size = soBanDau - taoSo.length();
			if (size > 0) {
				for (int i = 0; i < size; i++) {
					taoSo = "0" + taoSo;
				}
			} else if (size < 0) {

				ThamSoHeThong thamSoHeThong = ThamSoHeThongLocalServiceUtil.findByKeyData(loaiXe);
				taoSo = "1";
				thamSoHeThong.setValueData(taoSo);
				ThamSoHeThongLocalServiceUtil.updateThamSoHeThong(thamSoHeThong);
				for (int i = 1; i < soBanDau; i++) {
					taoSo = "0" + taoSo;
				}
				taoSo = "0" + taoSo;

			}

		} catch (Exception e) {
			_log.error(e);
		}
		return taoSo;
	}
	public String taoSoKhongTheoNam(String loaiXe, int soBanDau,String nam) {

		String taoSo = "";
		try {
			loaiXe = loaiXe + nam;
			long count = taoGiaTriThamSo(loaiXe);
			taoSo = count + "";
			// int VR_SIZE_SO_DANG_KY_KIEM_TRA =
			// DKConfigurationManager.getIntProp("VR_SIZE_SO_DANG_KY_KIEM_TRA",
			// 6);
			int size = soBanDau - taoSo.length();
			if (size > 0) {
				for (int i = 0; i < size; i++) {
					taoSo = "0" + taoSo;
				}
			} else if (size < 0) {

				ThamSoHeThong thamSoHeThong = ThamSoHeThongLocalServiceUtil.findByKeyData(loaiXe);
				taoSo = "1";
				thamSoHeThong.setValueData(taoSo);
				ThamSoHeThongLocalServiceUtil.updateThamSoHeThong(thamSoHeThong);
				for (int i = 1; i < soBanDau; i++) {
					taoSo = "0" + taoSo;
				}
				taoSo = "0" + taoSo;

			}

		} catch (Exception e) {
			_log.error(e);
		}
		return taoSo;
	}

	private long taoGiaTriThamSo(String loaiXe) throws SystemException {
		ThamSoHeThong thamSoHeThong = ThamSoHeThongLocalServiceUtil.findByKeyData(loaiXe);
		long count = 1;
		if (thamSoHeThong == null) {
			thamSoHeThong = new ThamSoHeThongImpl();
			long id = CounterLocalServiceUtil.increment(ThamSoHeThong.class.getName());
			// long valueData = 0;
			thamSoHeThong.setId(id);
			thamSoHeThong.setDescription(loaiXe);
			thamSoHeThong.setKeyData(loaiXe);
			thamSoHeThong.setValueData(count + "");

			ThamSoHeThongLocalServiceUtil.addThamSoHeThong(thamSoHeThong);

		} else {
			count = Long.valueOf(thamSoHeThong.getValueData()) + 1;
			thamSoHeThong.setValueData(count + "");
			ThamSoHeThongLocalServiceUtil.updateThamSoHeThong(thamSoHeThong);
		}
		return count;
	}
	public String taoSoSuaChungChiGCN(String soChungChi, int soBanDau) {
		try{
		String soChungChiBanDau = soChungChi.substring(0, soBanDau);
		long count = taoGiaTriThamSo(soChungChiBanDau);
		soChungChi = soChungChiBanDau + "-" + count;
		
		} catch (Exception e) {
			_log.error(e);
		}
		return soChungChi;
	}
	public int getYear(Date date) {
		return date.getYear() - 100;
	}
}
