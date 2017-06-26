package vn.dtt.gt.dk.report.model.thongbaotrungsokhungsodongco;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.ViewTrungSoKhungDongCoLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class ThongBaoTrungSoKhungSoDongCoExport {
	
	private static Log log = LogFactoryUtil.getLog(ThongBaoTrungSoKhungSoDongCo.class);
	
	public static ThongBaoTrungSoKhungSoDongCo getModel(long idHoSoThuTuc) throws SystemException {
		ThongBaoTrungSoKhungSoDongCo result = new ThongBaoTrungSoKhungSoDongCo();
		List<ViewTrungSoKhungDongCo> lstViewTrungSoKhungDongCos = ViewTrungSoKhungDongCoLocalServiceUtil.findByHoSoThuTucIdTrungSoKhungSoDongCo(idHoSoThuTuc);
		TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(idHoSoThuTuc);
		List<VehicleRecord> allVehicleRecords = new ArrayList<VehicleRecord>();
			if(lstViewTrungSoKhungDongCos != null && lstViewTrungSoKhungDongCos.size() >0){
				for(ViewTrungSoKhungDongCo viewTrungSoKhungDongCo : lstViewTrungSoKhungDongCos){
					if(hoSoThuTuc != null){
						result.setSoHoSo(hoSoThuTuc.getMaSoHoSo());
					}
					result.setSoDKKT(viewTrungSoKhungDongCo.getRegisteredNumber());
					result.setNguoiNhapKhau(viewTrungSoKhungDongCo.getImporterName());
					result.setNguoiLienHe(viewTrungSoKhungDongCo.getContactName());
					result.setSoDienThoai(viewTrungSoKhungDongCo.getContactPhone());
					result.setSoKhungSoDongCoBiTrung(lstViewTrungSoKhungDongCos.size());
					
					VehicleRecord vehicleRecord = new VehicleRecordImpl();
					vehicleRecord.setId(viewTrungSoKhungDongCo.getId());
					vehicleRecord.setVehicleGroupId(viewTrungSoKhungDongCo.getVehicleGroupId());
					vehicleRecord.setSequenceNo(viewTrungSoKhungDongCo.getSequenceNo());
					vehicleRecord.setCodeNumber(viewTrungSoKhungDongCo.getCodeNumber());
					vehicleRecord.setChassisNumber(viewTrungSoKhungDongCo.getChassisNumber());
					vehicleRecord.setEngineNumber(viewTrungSoKhungDongCo.getEngineNumber());
					vehicleRecord.setProductionYear(viewTrungSoKhungDongCo.getProductionYear()+"");
					vehicleRecord.setVehicleEngineStatus(viewTrungSoKhungDongCo.getVehicleEngineStatus());
					vehicleRecord.setUnitPrice(viewTrungSoKhungDongCo.getUnitPrice());
					vehicleRecord.setCurrency(viewTrungSoKhungDongCo.getCurrency());
					vehicleRecord.setRemarks(viewTrungSoKhungDongCo.getRemarks());
					//con nua nhung chua het
					allVehicleRecords.add(vehicleRecord);
				}
			}
			result.setLstVehicleRecords(allVehicleRecords);
		return result;
	}
	

	
}
