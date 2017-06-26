
package vn.dtt.gt.dk.utils;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.ConvertUtil;


public class CorporationUtils {
	
	private static Log _log = LogFactoryUtil.getLog(CorporationUtils.class);
	
	public static String getDangKiemVienChinh(long corporationId) {
		String tenDangKiemVienChinh = "";
		List<CorporationInspector> liCorporationInspectors = CorporationInspectorLocalServiceUtil.findByTeamId(corporationId);
		if (liCorporationInspectors != null && liCorporationInspectors.size() > 0) {
			for (CorporationInspector corporationInspector : liCorporationInspectors) {
				if (corporationInspector.getMarkupTeamLeader() == Constants.DangKiemVienChinh) {
					tenDangKiemVienChinh = corporationInspector.getInspectorName();
				}
			}
		}
		return tenDangKiemVienChinh;
	}
	
	public static String getDangKiemVienChinhAndCode(long corporationId) {
		String tenDangKiemVienChinh = "";
		List<CorporationInspector> liCorporationInspectors = CorporationInspectorLocalServiceUtil.findByTeamId(corporationId);
		if (liCorporationInspectors != null && liCorporationInspectors.size() > 0) {
			for (CorporationInspector corporationInspector : liCorporationInspectors) {
				if (corporationInspector.getMarkupTeamLeader() == Constants.DangKiemVienChinh) {
					tenDangKiemVienChinh = corporationInspector.getInspectorName() + "(" + corporationInspector.getContactcode() + ")";
				}
			}
		}
		return tenDangKiemVienChinh;
	}
	
	public static long getIdDangKiemVienChinh(long corporationId) {
		long id = 0;
		List<CorporationInspector> liCorporationInspectors = CorporationInspectorLocalServiceUtil.findByTeamId(corporationId);
		if(liCorporationInspectors != null && liCorporationInspectors.size() > 0){
			for(CorporationInspector corporationInspector : liCorporationInspectors){
				if(corporationInspector.getMarkupTeamLeader() == Constants.DangKiemVienChinh){
					id = corporationInspector.getInspectorid();
				}
			}
		}
		return id;
	}
	public static String getDangKiemVienPhu(long corporationId) {
		String tenDangKiemVienPhu = "";
		List<CorporationInspector> liCorporationInspectors = CorporationInspectorLocalServiceUtil.findByTeamId(corporationId);
		if(liCorporationInspectors != null && liCorporationInspectors.size() > 0){
			for(CorporationInspector corporationInspector : liCorporationInspectors){
				if(corporationInspector.getMarkupTeamLeader() == Constants.DangKiemVienPhoiHop){
					tenDangKiemVienPhu = tenDangKiemVienPhu + corporationInspector.getInspectorName() + ", ";
				}
			}
		}
		return tenDangKiemVienPhu;
	}
	
	public static String findDangKiemVienPhuAndCode(long corporationId) {
		StringBuilder builder = new StringBuilder();
		List<CorporationInspector> liCorporationInspectors = CorporationInspectorLocalServiceUtil.findByTeamId(corporationId);
		if (liCorporationInspectors != null && liCorporationInspectors.size() > 0) {
			
			boolean firstCheck = true;
			for (CorporationInspector item : liCorporationInspectors) {
				if (item.getMarkupTeamLeader() == Constants.DangKiemVienPhoiHop) {
					
					if (firstCheck) {
						item = CorporationInspectorLocalServiceUtil.findByInspectorId(item.getInspectorid());
						builder.append(item.getInspectorName() + "(" + item.getContactcode() + ")");
						firstCheck = false;
					} else {
						builder.append(",");
						item = CorporationInspectorLocalServiceUtil.findByInspectorId(item.getInspectorid());
						builder.append(item.getInspectorName() + "(" + item.getContactcode() + ")");
					}
					
				}
			}
		}
		return builder.toString();
	}
	
	public static String getListTenDangKiemVien(String listDkvId) {
		//_log.info("--getListTenDangKiemVien==========="+listDkvId);
		String tenDanhSach="";
		if (listDkvId!=null && listDkvId.trim().length()>0){
			String[] dkvId = listDkvId.split(",");
			for (String item:dkvId){
				//_log.info("--item==========="+item);
				if (item!=null && item.trim().length()>0){
					CorporationInspector corporationInspector=null;
					try{
						corporationInspector=CorporationInspectorLocalServiceUtil.fetchCorporationInspector(ConvertUtil.convertToLong(item));
						//_log.info("--corporationInspector==========="+corporationInspector);
						if (corporationInspector!=null){
							tenDanhSach=tenDanhSach+corporationInspector.getInspectorName()+", ";
						}
					}catch (Exception e) {
						_log.error(e);
					}
				}
			}
		}
		return tenDanhSach;
	}
	
	public static String getListDKVPhoiHopId(String[] listDangKiemVienKey) {
		String listDKVPhoiHopId="";
		int i=listDangKiemVienKey.length;
//		_log.info("--listDangKiemVienKey.length============="+i);
		if (i==2){
			listDKVPhoiHopId=listDangKiemVienKey[1];
		}
		return listDKVPhoiHopId;
	}
	
	public List<CorporationInspector> getListCorporationInspector(String key) throws SystemException{
		List<CorporationInspector> corporationInspectors=new ArrayList<CorporationInspector>();
		
		if (key!=null && key.trim().length()>0){
			String[] listDangKiemVienKey = key.split("-");
			
			if (listDangKiemVienKey[0].trim().length()>0){
				CorporationInspector corporationInspector=null;
				try{
					corporationInspector=CorporationInspectorLocalServiceUtil.fetchCorporationInspector(ConvertUtil.convertToLong(listDangKiemVienKey[0]));
					if (corporationInspector!=null){
						corporationInspectors.add(corporationInspector);
					}
				}catch (Exception e) {
					_log.error(e);
				}
			}
			///
			String listDKVphoiHop=getListDKVPhoiHopId(listDangKiemVienKey);
			if (listDKVphoiHop!=null && listDKVphoiHop.trim().length()>0){
				String[] dkvId = listDKVphoiHop.split(",");
				for (String item:dkvId){
					if (item!=null && item.trim().length()>0){
						CorporationInspector corporationInspector=null;
						try{
							corporationInspector=CorporationInspectorLocalServiceUtil.fetchCorporationInspector(ConvertUtil.convertToLong(item));
							if (corporationInspector!=null){
								corporationInspectors.add(corporationInspector);
							}
						}catch (Exception e) {
							_log.error(e);
						}
					}
				}
			}
		}
		return corporationInspectors;
	}
	
}
