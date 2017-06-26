package vn.dtt.gt.dk.message;


public class FunctionType {
	
	/**Khai báo hồ sơ/chứng từ, gửi sang Bộ GTVT*/
	public static final String FUNCTION_KHAI_MOI = "01";
	
	/**Khai sửa nội dung hồ sơ/chứng từ, gửi sang Bộ GTVT*/
	public static final String FUNCTION_KHAI_SUA = "02";
	
	/**Khai hủy hồ sơ, gửi sang Bộ GTVT*/
	public static final String FUNCTION_KHAI_HUY = "03";
	
	/**Khai bổ sung chứng từ*/
	public static final String FUNCTION_KHAI_BO_SUNG_CHUNG_TU = "04";
	
	/**Thông báo của Cơ quan xử lý chuyên ngành yêu cầu sửa đổi, bổ sung hồ sơ, gửi NSW*/
	public static final String FUNCTION_KHAI_THONG_BAO_YEU_CAU_BO_SUNG_CHUNG_TU = "20";
	
	/**Xác nhận của cơ quan xử lý chuyên ngành từ chối tiếp nhận hồ sơ; hoặc hệ thống xác định lỗi validation*/
	public static final String FUNCTION_THONG_BAO_TIEP_NHAN = "21";
	
	public static final String FUNCTION_XAC_NHAN_TU_CHOI_HO_SO = "22";
	public static final String FUNCTION_XAC_NHAN_CHAP_NHAN_HO_SO = "23";
	public static final String FUNCTION_XAC_NHAN_HUY_HO_SO = "24";
	public static final String FUNCTION_XAC_NHAN_HOAN_THANH_THU_TUC = "25";
	public static final String FUNCTION_HOI_KET_QUA = "26";
	public static final String FUNCTION_XAC_NHAN_HOAN_THANH = "11";
	public static final String FUNCTION_PHE_DUYET_HO_SO_CAC_BO_NGANH = "27";
	public static final String FUNCTION_GUI_KET_QUA_XU_LY_HO_SO = "30";
	public static final String FUNCTION_PHAN_HOI_KET_QUA_XU_LY_HO_SO = "29";
	public static final String FUNCTION_THONG_BAO_TIEP_NHAN_CUA_HE_THONG = "99";
	
	/**Thông báo yêu cầu sửa đổi, bổ sung hồ sơ của CQXLCN = */
	public static final String FUNCTION_SUADOI_BOSUNG_CQXLCN = "20";
	
	/**Thông báo sửa đổi bổ sung của Doanh nghiệp = */
	public static final String FUNCTION_SUADOI_BOSUNG_DOANHNGIEP = "04";
	
	/**Thông báo hủy hồ sơ của Doanh nghiệp = */
	public static final String FUNCTION_HUY_HO_SO_DOANHNGHIEP = "03";
	
	/**Xác nhận hủy hồ sơ của CQXLCN = */
	public static final String FUNCTION_HUY_SO_SO_CQXLCN = "24";
	
	/**Thông báo tiếp nhận của hệ thống = */
	public static final String FUNCTION_TIEP_NHAP_HE_THONG = "99";
}
