package vn.dtt.gt.dk.portlet.menu.cache;

import java.util.Hashtable;

import vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoLocalServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class MenuCacheUtil {
	private static Log log = LogFactoryUtil.getLog(MenuCacheUtil.class);
	public static Hashtable<Long, UserMenu> mCache = new Hashtable<Long, UserMenu>();
	
	public static UserMenu getCache(Long userId){
		UserMenu menu =MenuCacheUtil.mCache.get(userId);
		if(menu == null){
			//not set menu
			menu = new UserMenu();
			
			
		}
		return menu;
	}
	
	public static boolean isReset(long userId){
		boolean isReset =false;
		UserMenu  menu = MenuCacheUtil.mCache.get(userId);
		if(menu == null){
			//not set menu
			log.info("a.=======reset is null cache");
			menu = new UserMenu();
			isReset= false;
		}
		
		long count;
		try {
			count = MotCuaDienBienHoSoLocalServiceUtil.getMotCuaDienBienHoSosCount();
			log.info("count="+count);
		} catch (Exception e) {
			count=0;
			log.error(e);
		}
		
		if(menu.getReset().longValue()<=0){
			//null list nhom
			log.info("b.=======reset count ==0");
			
			isReset= false;
		}else if(menu.getReset().longValue() != count){
			log.info("b.=======reset value change menu="+menu.getReset()+",cache="+count);
			isReset= true;
		}
		long t =System.currentTimeMillis();
		long reset = t-menu.getTime();
		long s = (reset/1000)/60;
		//if timeout menu
		
		if(s>=60){
			log.info("b.=======reset time >=60s");
			isReset=false;
		}
		
		
		if(isReset){
			menu.setTime(System.currentTimeMillis());
			menu.setReset(count);
			MenuCacheUtil.mCache.put(userId, menu);
			log.info("A.====== reset menu");
		}else{
			log.info("B.====== not reset");
		}
		return isReset;
		
	}

}
