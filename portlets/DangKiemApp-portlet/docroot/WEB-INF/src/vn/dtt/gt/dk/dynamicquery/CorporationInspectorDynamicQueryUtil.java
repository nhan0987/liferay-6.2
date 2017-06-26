package vn.dtt.gt.dk.dynamicquery;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;

public class CorporationInspectorDynamicQueryUtil {
	

	//for mot cua phiau xu ly chinh
	public static Hashtable<Long,CorporationInspector> get_CorporationInspector(List<MotCuaDienBienHoSo> mList){
		/*try {
			
			 DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
					 CorporationInspector.class, PortletClassLoaderUtil.getClassLoader());
			 
			
			 CorporationInspector inspector;
			 
			 System.out.println("go.....");
			 Criterion criterion = RestrictionsFactoryUtil.in("inspectorid", getMotCuaDienBienHoSoListIds(mList));
			 dynamicQuery.add(criterion);
			 List<CorporationInspector> list= null;
			 try {
				list=CorporationInspectorLocalServiceUtil.dynamicQuery(dynamicQuery);
				System.out.println("Size:"+list.size());
				
			} catch (SystemException e) {
				// TODO Auto-generated catch block
			}
			
			if(list != null && list.size()>0){
				
				Hashtable<Long, CorporationInspector> result = new Hashtable<Long, CorporationInspector>();
				
			
				return result;
			}else{
				System.out.println("null");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}*/

		return null;

		
	}
	
	private static  List<Long> getMotCuaDienBienHoSoListIds(List<MotCuaDienBienHoSo> mList){
		if(mList== null|| mList.size()<=0) return null;
		
		List<Long> ids = new ArrayList<Long>();
		
		return ids;
		
	}
	
	private static  CorporationInspector getCorporationInspector(MotCuaDienBienHoSo motcua, List<CorporationInspector> list){
		
		return null;
		
	}
}
