package vn.dtt.gt.dk.portlet.menu.cache;

import java.util.Hashtable;

public class UserMenu {
	
	private Long userId;
	private Long reset=0L;
	private long time;
	private Hashtable<String, Long> menuValue = new Hashtable<String, Long>();
	
	public long getValue(String key){
		Long value = menuValue.get(key);
		if(value != null) {
			return value.longValue();
		}else{
			
			return 0;
		}
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getReset() {
		return reset;
	}
	public void setReset(Long reset) {
		this.reset = reset;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public Hashtable<String, Long> getMenuValue() {
		return menuValue;
	}
	public void setMenuValue(Hashtable<String, Long> menuValue) {
		this.menuValue = menuValue;
	}
	
	
	
	
}
