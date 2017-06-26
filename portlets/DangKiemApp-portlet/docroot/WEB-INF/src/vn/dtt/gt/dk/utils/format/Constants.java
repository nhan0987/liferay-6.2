/**
 * 
 */
package vn.dtt.gt.dk.utils.format;

import vn.dtt.gt.dk.utils.config.DKConfigurationManager;

/**
 * @author binhnt
 *
 */
public class Constants {

	public static String CERTIFICATE_TYPE = "certificateType";
	public static String CERTIFICATE_RECORD_ID = "CERTIFICATE_RECORD_ID";
	
	public static String REGISTERED_NUMBER = "REGISTERED_NUMBER";
	
	public static String ID_INSPECTION_RECORD = "ID_INSPECTION_RECORD";
	public static String ID_INSPECTION_RECORD_ATTACH = "ID_INSPECTION_RECORD_ATTACH";
	public static String ID_REGISTERED_INSPECTION = "ID_REGISTERED_INSPECTION";
	public static String ID_CONFIRMED_INSPECTION = "id_confirmed_inspection";
	public static String ID_VEHICLE_GROUP = "id_vehicle_group";
	public static String ID_VEHICLE_GROUP_INITIAL = "id_vehicle_group_initial";
	
	public static String ID_HO_SO_THU_TUC = "ID_HO_SO_THU_TUC";
	public static String ID_PHIEU_XU_LY_CHINH = "ID_PHIEU_XU_LY_CHINH";
	public static String ID_PHIEU_XU_LY_PHU = "ID_PHIEU_XU_LY_PHU";
	
	//dung cho bien ban kiem tra
	public static String BUTTON_TYPE = "buttonType";
	public static String ID_PHIEU_XU_LY_PHU_BBLT = "ID_PHIEU_XU_LY_PHU_BBLT";
	public static String NGUOI_PHAT_HIEN_LOI = "nguoiPhatHienLoi";
	
	
	//TODO Tra cuu ho so
	public static String ID_MOTCUA_TRANGTHAIHOSO = "id_motcua_trangthaihoso";
	public static String SO_DANGKI_KIEMTRA = "soDangKiKiemTra";
	public static String NGAY_CAP_DANG_KI_FROM = "ngayCapDangKiFrom";
	public static String NGAY_CAP_DANG_KI_TO = "ngayCapDangKiTo";
	public static String SO_BIENBAN_KIEMTRA = "soBienBanKt";
	public static String NGAY_KIEM_TRA_FROM = "ngayKiemTraFrom";
	public static String NGAY_KIEM_TRA_TO = "ngayKiemTraTo";
	public static String QUAN_HUYEN = "quan_huyen";
	public static String TINH_THANH = "tinh_thanh";
	public static String ID_DANG_KIEM_VIEN_KIEMTRA = "dangKiemVienKiemTra";
	public static String DON_VI_KIEM_TRA = "donViKiemTra";
	public static String MASO_THUE = "masothue";
	public static String SO_INVOICE = "soInvoice";
	public static String SO_TO_KHAI_HAI_QUAN = "soToKhaiHaiQuan";
	public static String NGAY_TOKHAI_HAIQUAN_FROM = "ngayToKhaiHaiQuanFrom";
	public static String NGAY_TOKHAI_HAIQUAN_TO = "ngayToKhaiHaiQuanTo";
	public static String NGUOI_NHAP_KHAU = "nguoiNhapKhau";
	public static String SO_VIN = "soVin";
	public static String SO_KHUNG = "soKhung";
	public static String SO_DONG_CO = "soDongCo";
	public static String MAU_SON = "mauSon";
	public static String KICH_THUOC_CHUNG = "kichThuocChung";
	public static String SL_KHOI_LUONG = "slKhoiLuong";
	public static String SL_KHOI_LUONG_TOAN_BO = "slKhoiLuongToanBo";
	public static String SL_KHOI_LUONG_BAN_THAN = "slKhoiLuongBanThan";
	public static String OFFSET = "offset";
	public static String CONG_THUC_BANH_XE = "congThucBanhXe";
	public static String SL_KHOI_LUONG_CHUYEN_CHO_TGGT = "klChuyenChoTGGT";
	public static String SL_KHOI_LUONG_CHUYEN_CHO_TTK = "klChuyenChoTTK";
	public static String KY_HIEU_DONG_CO = "kyHieuDongCo";
	public static String LOAI_DONG_CO = "loaiDongCo";
	
	
	public static String MAPHANNHOMHOSO = "ma_phan_nhom_hoso";
	public static String THANH_PHAN_XU_LY = "thanh_phan_xu_ly";
	public static String CAN_BO_SU_LY = "can_bo_su_ly";
	public static String XU_LY_TLHS = "xu_ly_tlhs";
	public static String XU_LY_TPHS = "xu_ly_tphs";
	public static String XU_LY_TPHS2 = "xu_ly_tphs2";
	public static String XU_LY_TT = "xu_ly_tt";
	
	public static String CO_QUAN_QLTT_ID = "coquanqlttid";
	public static String LINH_VUC_THU_TUC_ID = "linhvucthutucid";
	public static String TTHC_NOIDUNGHOSO_ID = "TTHC_NOIDUNGHOSO_ID";
	public static String TTHC_BIEUMAUHOSO_ID = "TTHC_BIEUMAUHOSO_ID";
	public static String TTHC_THUTUCHANHCHINH_ID = "TTHC_THUTUCHANHCHINH_ID";
	public static String ORGANIZATION_ID = "organizationId";
	public static String TTHC_BIEUMAUHOSO_MABIEUMAU = "TTHC_BIEUMAUHOSO_MABIEUMAU";
	
	public static String TTHC_NOIDUNGHOSO_TAILIEUDINHKEM_ID = "TTHC_NOIDUNGHOSO_TAILIEUDINHKEM_ID";
	public static String DIEU_KIEN_CHUYEN_DICH = "DIEU_KIEN_CHUYEN_DICH";
	
	public static String NGAY_PHAN_CONG_KIEM_TRA_FROM = "ngayPhanConKiemTraFrom";
	public static String NGAY_PHAN_CONG_KIEM_TRA_TO = "ngayPhanConKiemTraTo";
	
	public static String MA_THU_TUC = "mathutuc";
	public static String LOAI_THU_TUC = "loaiThuTuc";
	public static String TEN_THU_TUC = "tenThuTuc";
	public static String THU_TUC_HANH_CHINH_ID = "thutuchanhchinhid";
	public static String BIEU_MAU_HO_SO_ID = "bieumauhosoid";
	public static String THU_TU_HIEN_THI = "thutuhienthi";
	public static String LOAI_THANH_PHAN = "loaithanhphan";
	public static String MAU_TRUC_TUYEN = "mautructuyen";
	
	public static String SO_TAI_LIEU_DINHKEM = "sotailieudinhkem";
	public static String SO_HO_SO = "soHoSo";
	public static String SO_CHUNG_CHI = "SO_CHUNG_CHI";
	public static String SO_HO_SO_ORDER = "soHoSoOrder";
	public static String SO_DKKT = "soDKKT";
	
	public static String LOAI_PHUONG_TIEN_NK = "loaiPhuongTienNK";
	public static String NHAN_HIEU = "nhanhieu";
	public static String TEN_THUONG_MAI = "tenthuongmai";
	public static String MA_KIEU_LOAI = "makieuloai";
	public static String NUOC_SAN_XUAT = "nuocsanxuat";
	public static String DOI_DKKT = "doiDKKT_id";
	
	public static String DOANH_NGHIEP = "doanhNghiep";
	public static String LOAD_DATABASE_MOTCUA = "LOAD_DATABASE_MOTCUA";
	public static String RETURN_URL = "RETURN_URL";
	
	public static String NGAY_NOP_HO_SO_FROM = "ngayNopHsFrom";
	public static String NGAY_NOP_HO_SO_TO = "ngayNopHsTo";
	public static String NAM_NHAP = "namNhap";
	public static String NAM_SAN_XUAT = "namSanXuat";
	
	public static String NGAY_TOKHAI_HAIQUAN = "ngayToKhaiHaiQuan";
	public static String THANH_TOAN_TIEN_MAT = "thanhtoantienmat";
	
	public static String NGAY_NOP_TIEN = "ngayNopFrom";
	public static String DAT_NUOC = "dat_nuoc";
	
	public static String LOAI_DIEU_KIEN = "loaiDieuKien";
	//thong tin phuong tien
	
	
	public static String DOI_TUONG_THUC_HIEN = "doiTuongThucHien";
	public static String TRANG_THAI_CUA_XE = "trangThaiCuaXe";
	
	public static String TINH_TRANG_PHUONG_TIEN = "tinhTrangPhuongTien";
	public static String THONGSO_KITHUAT_PHUONGTIEN = "thongSoKiThuatPhuongTien";

	
	public static String MAU_TRUC_TUYEN_BAN_DANG_KY = "BANDANGKY";
	public static String MAU_TRUC_TUYEN_BAN_KE_CHI_TIET = "BANKECHITIET";
	public static String MAU_TRUC_TUYEN_THONG_BAO_HOAN ="THONGBAOHOAN";
	public static String MAU_TRUC_TUYEN_BONG_BAO_LOAI_BO_PT ="THONGBAOLOAIBOPT";
	public static String MAU_TRUC_TUYEN_TB_SUA_DOI_CC="TBSUADOICC";
	public static String MAU_TRUC_TUYEN_XN_SUA_DOI_CC="XNSUADOICC";
	public static String MAU_TRUC_TUYEN_XAC_NHAN_KE_HOACH = "XACNHANKEHOACH";
	public static String MAU_TRUC_TUYEN_THONG_TIN_XE_NK = "THONGTINXENK";
	public static String MAU_TRUC_TUYEN_THONG_TIN_DONG_CO = "THONGTINDONGCO";
	public static String MAU_TRUC_TUYEN_HOA_DON_THUONG_MAI = "HOADONTHUONGMAI";
	public static String MAU_TRUC_TUYEN_GIAY_TO_KHAC = "GIAYTOKHAC";
	
	public static String MAU_TRUC_TUYEN_TAI_LIEU_KY_THUAT = "TAILIEUKYTHUAT";
	public static String MAU_TRUC_TUYEN_TAI_LIEU_KHI_THAI= "TAILIEUKHITHAI";
	public static String MAU_TRUC_TUYEN_GNC_KIEU_LOAI= "GCNKIEULOAI";
	public static String MAU_TRUC_TUYEN_GNC_CHAT_LUONG_NSX= "GCNCHATLUONGNSX";
	public static String MAU_TRUC_TUYEN_GNC_DANG_KY_XE_NSX= "GCNDANGKYXENK";
	
	public static String MAU_TRUC_TUYEN_THONG_TIN_THAM_CHIEU = "THONGTINTHAMCHIEU";	
	public static String MAU_TRUC_TUYEN_CHI_TIET_XE_NK = "CHITIETXENK";
	public static String MAU_TRUC_TUYEN_DANH_SACH_NOP_PHI = "DANHSACHNOPPHI";
	
	public static String MAU_TRUC_TUYEN_GIAY_CHUNG_NHAN = "GIAYCHUNGNHAN";
	public static String MAU_TRUC_TUYEN_TBXNTINHTRANG = "TBXNTINHTRANG";
	public static String MAU_TRUC_TUYEN_GIAYCHUNGNHANDC = "GIAYCHUNGNHANDC";
	public static String MAU_TRUC_TUYEN_TBMIEN = "TBMIEN";
	public static String MAU_TRUC_TUYEN_TBMIENDC = "TBMIENDC";
	public static String MAU_TRUC_TUYEN_TBKHONGDAT = "TBKHONGDAT";
	public static String MAU_TRUC_TUYEN_TBKHONGDATDC = "TBKHONGDATDC";
	public static String MAU_TRUC_TUYEN_TBVIPHAM = "TBVIPHAM";
	public static String MAU_TRUC_TUYEN_TBVIPHAMDC = "TBVIPHAMDC";
	public static String MAU_TRUC_TUYEN_TBPHILEPHI_MAU1 = "TBPHILEPHI_MAU1";
	public static String MAU_TRUC_TUYEN_TBPHILEPHI_MAU2 = "TBPHILEPHI_MAU2";
	public static String MAU_TRUC_TUYEN_XACNHANDANGKY = "XACNHANDANGKY";
	public static String MAU_TRUC_TUYEN_BIENBANKIEMTRA = "BIENBANKIEMTRA";
	public static String MAU_TRUC_TUYEN_BIENBANKIEMTRA_DONGCO = "BIENBANKIEMTRADC";
	public static String MAU_TRUC_TUYEN_LAPDENGHITHUNHIEMANTOAN = "LapDeNghiThuNhiemAnToan";
	public static String MAU_TRUC_TUYEN_LAPDENGHIKHITHAI = "LapDeNghiKhiThai";
	public static String MAU_TRUC_TUYEN_LAPDENGHIGIAMDINH = "LapDeNghiGiamDinh";
	public static int PHIEU_XU_LY_PHU_PHAN_CONG_DON_VI_KIEM_TRA = 14;
	public static int PHIEU_XU_LY_PHU_DE_NGHI_HUY_LICH_KIEM_TRA = 59;
	public static long XAC_NHAN_THANH_TOAN_DU = 20;
	public static long PHIEU_DA_THANH_TOAN = 22;
	public static long CHO_KY_DUYET_CHUNG_CHI = 17;
	
	public static String DIEU_KIEN_DICH_CHUYEN_PHAN_CONG_DKV = DKConfigurationManager.getStrProp("dieukiendichchuyen.phan.cong.dkv", "phan.cong.dkv");
	public static String DIEU_KIEN_DICH_CHUYEN_PHAN_CONG_DON_VI_KT = DKConfigurationManager.getStrProp("dieukiendichchuyen.phan.cong.don.vi.kt", "phan.cong.don.vi.kt");
	public static String DIEU_KIEN_DICH_CHUYEN_XEM_XET = DKConfigurationManager.getStrProp("dieukiendichchuyen.xem.xet", "xem.xet");
	public static String DIEU_KIEN_DICH_CHUYEN_KHONG_PHU_HOP = DKConfigurationManager.getStrProp("dieukiendichchuyen.khong.phu.hop", "khong.phu.hop");
	public static String DIEU_KIEN_DICH_CHUYEN_VI_PHAM_ND187 = DKConfigurationManager.getStrProp("dieukiendichchuyen.vi.pham.nd187", "vi.pham.nd187");
	public static String DIEU_KIEN_DICH_CHUYEN_BO_SUNG = DKConfigurationManager.getStrProp("dieukiendichchuyen.bo.sung", "bo.sung");
	public static String DIEU_KIEN_DICH_CHUYEN_PHU_HOP_QUY_DINH = DKConfigurationManager.getStrProp("dieukiendichchuyen.phu.hop.quy.dinh", "phu.hop.quy.dinh");
	
	
	public static String DIEU_KIEN_DICH_CHUYEN_LANH_DAO_PHONG_KY = DKConfigurationManager.getStrProp("dieukiendichchuyen.lanh.dao.phong.ky", "chuyen.bbkt");
	public static String DIEU_KIEN_DICH_CHUYEN_LANH_DAO_PHONG_YEU_CAU_XEM_XET_LAI = DKConfigurationManager.getStrProp("dieukiendichchuyen.lanh.dao.phong.yeu.cau.xem.xet.lai", "xem.xet");
	
	public static String DIEU_KIEN_DICH_CHUYEN_DONG_Y_CAP_CHUNG_CHI = DKConfigurationManager.getStrProp("dieukiendichchuyen.dong.y.cap.chung.chi", "dong.y.cap.chung.chi");
	public static String DIEU_KIEN_DICH_CHUYEN_DONG_DAU_CHUNG_CHI = DKConfigurationManager.getStrProp("dieukiendichchuyen.dong.dau.chung.chi", "dong.dau");
	
	public static String KET_QUA_DAT = DKConfigurationManager.getStrProp("dk.dat", "dk.dat");
	public static String KET_QUA_KHONG_DAT = DKConfigurationManager.getStrProp("dk.khongdat", "dk.khongdat");
	public static String KET_QUA_SUA_DOI = DKConfigurationManager.getStrProp("dk.suadoi", "dk.suadoi");
	public static String KET_QUA_KHONG_AP_DUNG = DKConfigurationManager.getStrProp("dk.khongapdung", "dk.khongapdung");
	
	public static String VERSION_START = "1.0";
	
	public static String XACNHANKEHOACH = "XACNHANKEHOACH"; 
	public static String BIENBANKIEMTRA = "BIENBANKIEMTRA"; 
	public static String THUNGHIEMANTOAN = "THUNGHIEMANTOAN";
	public static String THUNGHIEMKHITHAI = "THUNGHIEMKHITHAI";
	public static String DENGHIGIAMDINH = "DENGHIGIAMDINH";
	
	public static int LOAIPHIEUXULY_PHIEU_CHINH = 1;
	public static int LOAIPHIEUXULY_PHIEU_PHU = 2;
	public static int TRANG_THAI_DA_THANH_TOAN = 1;

	
	public static int CO_GUI = 1;
	public static int KO_GUI = 0;
	public static int DONG_Y = 1;
	
	public static int HOAN_KIEM_TRA = 0;
	
	
	public static long MARKUP_INSPECTION_RECORD_KHONG_LAP = 0;
	public static long MARKUP_INSPECTION_RECORD_CO_LAP = 1;
	public static long MARKUP_INSPECTION_RECORD_DA_LAP = 2;
	
	
	public static long CERTIFICATE_TYPE_GCN = 1;
	public static long CERTIFICATE_TYPE_TBM = 2;
	public static long CERTIFICATE_TYPE_TBKD = 3;
	public static long CERTIFICATE_TYPE_TBXNTT = 4;
	public static long CERTIFICATE_TYPE_TBVP = 5;
	public static long CERTIFICATE_TYPE_KHAC = 6;
	public static long CERTIFICATE_DIGITAL_ISSSUED_0 = 0;
	public static long CERTIFICATE_DIGITAL_ISSSUED_1 = 1;
	
	public static long LOAI_TAI_LIEU_KET_QUA_DA_KY = 21;
	public static long LOAI_TAI_LIEU_KET_QUA_CHUA_KY = 20;
	public static long LOAI_TAI_LIEU_GIAY_TO_NOP = 10;
	public static long LOAI_TAI_LIEU_GIAY_NOP_DA_DOI_CHIEU = 11;
	public static long LOAI_TAI_LIEU_GIAY_NOP_BAN_CHINH = 12;
	
	public static String SYSTEM = "SYSTEM";
	
	public static String CAP_MOI = "CAP_MOI";
	public static String CAP_LAI = "CAP_LAI";
	public static String CAP_TAM_THOI = "CAP_TAM_THOI";
	
	public static Double FREE = 1.1;
	
	public static int KHAI_BAO_TRUC_TUYEN_THONG_BAO_NOP_PHI_LE_PHI = 1;
	
	public static String Vehicle_Engine_Status_0 = "0";
	public static String Vehicle_Engine_Status_1 = "1";
	public static long DA_CAP_NHAP_DB_NGHIEP_VU = 1;
	public static long CHUA_CAP_NHAP_DB_NGHIEP_VU = 0;
	public static String CORPORATION_ID = "CORPORATION_ID";
	public static String INSPECTOR_ID = "INSPECTOR_ID";
	public static String INSPECTOR_TEAM = "INSPECTOR_TEAM";
	public static String CORPORATION_INSPECTOR = "CORPORATION_INSPECTOR";
	
	public static int MarkUpDelete_da_xoa = 1;
	public static int MarkUpDelete_chua_xoa = 0;
	
	public static int MarkAsDelete_Lon_Hon_0 = 0;
	public static int MarkAsDelete_Lon_Hon_1 = 1;
	
	public static int DangKiemVienChinh = 1;
	public static int DangKiemVienPhoiHop = 2;
	
	public static int MARKUPBOSS_LANH_DAO = 1;
	public static int MARKUPBOSS_NHAN_VIEN = 0;
	public static long BIEU_MAU_HO_SO_209 = 50;
	public static long HO_SO_TTHC_ID_209 = 0;
	
	public static String ASWMSG_SYNDATAHISTORY_ID = "ASWMSG_SYNDATAHISTORY_ID";
	public static String ASWMSG_MESSAGELOG_AUTO_GENERATE_ID = "ASWMSG_MESSAGELOG_AUTO_GENERATE_ID";
	
	public static String ATTACHED_TYPE_CODE = "ATTACHED_TYPE_CODE";
	public static String ATTACHED_FILE_URL_RESULT = "ATTACHED_FILE_URL_RESULT";
	
	public static int ATTACHED_TYPE_CHU_KY = 8;
	public static int ATTACHED_TYPE_CON_DAU = 9;

	public static long FILE_ENTRYID_IMG_CON_DAU = DKConfigurationManager.getLongProp("vn.gt.file.id.con.dau", 28427);
	
	public static String DANG_KIEM_VIEN_CHINH_ID = "DANG_KIEM_VIEN_CHINH_ID";
	public static String DS_DANG_KIEM_VIEN_PHOI_HOP= "DS_DANG_KIEM_VIEN_PHOI_HOP";
	public static String LIST_DANG_KIEM_VIEN_= "LIST_DANG_KIEM_VIEN";

	public static String SPECIFICATION_NAME= "specificationName";
	public static int THANH_TOAN = 1;
	public static int TRA_CHUNG_CHI = 2;
	
	public static String MENU_TRACUU_THONGTIN = "menu_tra_cuu_thong_tin";
	public static String MENU_BAOCAO_THONGKE = "menu_bao_cao_thong_ke";

	
	public static int TRANG_THAI_TAT_CA = 0;
	public static int TRANG_THAI_HO_SO = 1;
	public static int TRANG_THAI_XE = 2;
	
	public static String TRANG_THAI_PHIEU_XU_LY = "TRANG_THAI_PHIEU_XU_LY";
	public static String TRANG_THAI_PHIEU_XU_LY_CHINH = "1";
	public static String TRANG_THAI_PHIEU_XU_LY_PHU = "2";
	
	//dung cho man hinh: Tra cứu thông tin -> Tra cứu hồ sơ
	public static String CURRENT_TAB = "current_tab";
	public static String TAB_THONGTIN_HOSO = "thongtin_hoso";
	public static String TAB_DS_PHUONGTIEN = "danhsach_phuongtien";
	public static String CUR_DS_PHUONGTIEN = "curDS_PHUONGTIEN";
	public static String CUR_THONGTIN_HOSO = "curTHONGTIN_HOSO";
	
	public static int AN_CHI_CHUA_DUOC_DUYET = 0;
	public static int AN_CHI_CAP_MOI_CHUA_IN = 1;
	public static int AN_CHI_CAP_MOI_DA_IN_LIEN_1 = 2;
	public static int AN_CHI_CAP_MOI_DA_IN_LIEN_2 = 3;
	public static int AN_CHI_SUA_DOI_CHUA_IN = 4;
	public static int AN_CHI_SUA_DOI_DA_IN_LIEN_1 = 5;
	public static int AN_CHI_SUA_DOI_DA_IN_LIEN_2 = 6;
	public static int AN_CHI_TAM_THU_HOI = 7;
	public static int AN_CHI_CAP_LAI = 8;
	public static int AN_CHI_HUY = 9;
	public static long DA_KY = 1;
	public static int DA_THANH_TOAN = 1;
	public static int CHON_KY_SO = 0;
	public static int CHON_KY_THUONG = 1;
	
	public static String NewExchangeRate_ID = "newexchangerate_id";
	public static String UNITCODE_VNPT = "VNPT";
	public static String UNITCODE_TCT = "TCT";
	
	public static final String SUA_BIEN_BAN_KIEM_TRA = "SuaBienBanKiemTra";
	
	public static final String BIEN_BAN_LUU_TAM = "BienBanLuuTam";
	
	public static final String LAP_BIEN_BAN_KIEM_TRA = "LapBienBanKiemTra";
	
	public static final int SEL_KQ_CHUA_QUYET_DINH = 0;
	
	public static final int SEL_KQ_DAT = 1;
	
	public static final int SEL_KQ_KHONG_DAT = 2;
	
	public static final int SEL_KQ_SUA_DOI = 3;
	
	public static final int SEL_KQ_KHONG_AP_DUNG = 4;
	
	/*@begin: ap dung cho truong hop gom nhom dong co khi lap/sua bien ban cho loai xe XCG 04/2016 */
	public static final String MA_CONG_THUC_BANH_XE = "XCG0009";
	
	public static final String NHOM_DONG_CO_DOT_TRONG = "XCG051";
	
	public static final String NHOM_DONG_CO_HYBIRD = "XCG052";
	
	public static final String NHOM_DONG_CO_XE_CHAY_DIEN = "XCG053";
	
	public static final String MA_DONG_CO_HYBIRD = "XCG0082";
	
	public static final String MA_DONG_CO_XE_CHAY_DIEN = "XCG0093";
	/*@end*/
	
	public static final String ID_ASSESSMENTOFIMPORTER = "ID_ASSESSMENTOFIMPORTER";
	public static final String ID_ASSESSMENT_PERIOD = "ID_ASSESSMENT_PERIOD";
	public static final String ID_ASSESSMENTOFPRODUCT = "ID_ASSESSMENTOFPRODUCT";
	public static final String ID_ASSESSMENTOFINSPECTOR = "ID_ASSESSMENTOFINSPECTOR";
	public static final String ID_ASSESSMENTOFINSPECTIONMETHOD = "ID_ASSESSMENTOFINSPECTIONMETHOD";
	public static final String ID_ASSESSMENT_ISSUETRACKING = "ID_ASSESSMENT_ISSUETRACKING";
	public static final String ID_ASSESSMENT_ISSUECATEGORY = "ID_ASSESSMENT_ISSUECATEGORY";
	public static final String ID_ACTION_LOG = "ID_ACTION_LOG";
}
