package vn.dtt.gt.dk.dynamicquery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

import vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo;
import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dynamicquery.sort.TthcNoidungHoSoSort;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;

public class ThanhPhanHSDynamicQueryUtil {
	

	//for mot cua phiau xu ly chinh
	public static Hashtable<Long,List<TthcNoidungHoSo>> get_NoidungHoSoMaTuSinh(long hosoThuTucId,List<TthcBieuMauHoSo> mList){
		try {
			
			 DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
					 TthcNoidungHoSo.class, PortletClassLoaderUtil.getClassLoader());
			 
			
			 
			 Criterion criterion = RestrictionsFactoryUtil.eq("HoSoThuTucId", hosoThuTucId);
			 List<Long> bieuMauIds = getBieuMauIds(mList);
			 //and
			 Criterion bieuMauCriterion = RestrictionsFactoryUtil.in("BieuMauHoSoId", bieuMauIds);
			 
			
			 criterion=RestrictionsFactoryUtil.and(criterion, bieuMauCriterion);
			 dynamicQuery.add(criterion);
			 List<TthcNoidungHoSo> list= null;
			
			
			if(list != null && list.size()>0){
				
				Hashtable<Long, List<TthcNoidungHoSo>> result = new Hashtable<Long, List<TthcNoidungHoSo>>();
				
				for (TthcBieuMauHoSo bieuMauHoSo : mList) {		
					List<TthcNoidungHoSo> tList=getTthcNoidungHoSo(bieuMauHoSo,list);
					if(tList != null){
						result.put(bieuMauHoSo.getId(),tList );
					}
				}
				return result;
			}else{
				_log.info("null");
			}
			
		} catch (Exception e) {
			_log.error(e);
		}

		return null;

		
	}
	
	private static  List<Long> getBieuMauIds(List<TthcBieuMauHoSo> mList){
		if(mList== null|| mList.size()<=0) return null;
		
		List<Long> ids = new ArrayList<Long>();
	
		return ids;
		
	}
	
	private static  List<TthcNoidungHoSo> getTthcNoidungHoSo(TthcBieuMauHoSo bieuMauHoSo, List<TthcNoidungHoSo> list){
		List<TthcNoidungHoSo> result = new ArrayList<TthcNoidungHoSo>();
		if(list != null){
			for (TthcNoidungHoSo tt : list) {
				if(tt.getBieuMauHoSoId() == bieuMauHoSo.getId()){
					if(!isExist(tt.getId(), result)){
						result.add(tt);
					}
					
				}
			}
		}
		Collections.sort(result,new TthcNoidungHoSoSort());
		return result;
		
	}
	
	private static boolean isExist(long id,List<TthcNoidungHoSo> list){
	
		return false;
	}
	
	private static Log _log = LogFactoryUtil.getLog(ThanhPhanHSDynamicQueryUtil.class);


}
