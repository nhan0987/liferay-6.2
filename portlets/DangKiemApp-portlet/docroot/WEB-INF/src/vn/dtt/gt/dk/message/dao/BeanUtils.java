
package vn.dtt.gt.dk.message.dao;

import java.util.Date;
import java.util.List;
import java.util.Set;

import vn.dtt.gt.dk.utils.format.DateUtils;

public class BeanUtils {
	
	public static <K, V> V copyBean(K resource, List<Object> lst, V destination) {
		BeanInspector<K> beanRes = BeanInspector.get(resource.getClass());
		BeanInspector<V> beanDes = BeanInspector.get(destination.getClass());
		
		Set<String> proRes = beanRes.getPropertyNames();
		Set<String> proDes = beanDes.getPropertyNames();
		
		for (String s : proRes) {
			
			Class type = beanRes.getPropertyType(s.toString());
			
			if (type == Integer.class || type == int.class || type == Long.class || type == long.class ||
				type == Short.class || type == short.class || type == Float.class || type == Double.class ||
				type == float.class || type == double.class) {
				Object value =  beanRes.getValue(resource, s.toString());
				if (value != null) { beanDes.setValue(destination, s.toString(), value); };
			}
			
			if (type == String.class) {
				if (DateUtils.isDate((String) beanRes.getValue(resource, s.toString()), "yyyy-MM-dd HH:mm:ss") == true) {
					Date toDate = DateUtils.stringToDate((String) beanRes.getValue(resource, s.toString()), "yyyy-MM-dd HH:mm:ss");
					beanDes.setValue(destination, s.toString(), toDate);
				} else {
					beanDes.setValue(destination, s.toString(), (String) beanRes.getValue(resource, s.toString()));
				}
			}
			
			if (lst != null) {
				for (int i = 0; i < lst.size(); i++) {
					if (lst.get(i) != null) {
						if (lst.get(i).getClass() == type) {
							BeanInspector beanObj = BeanInspector.get(lst.get(i).getClass());
							Set<String> propertyNames = beanObj.getPropertyNames();
							for (String sSub : propertyNames) {
								
								Class typeSub = beanObj.getPropertyType(sSub);
								
								if (typeSub == Integer.class || typeSub == int.class || typeSub == Long.class || typeSub == long.class ||
									typeSub == Short.class || typeSub == short.class || typeSub == Float.class || typeSub == Double.class ||
									typeSub == float.class || typeSub == double.class) {
									Object value = beanObj.getValue(lst.get(i), sSub);
									if (value != null) { beanDes.setValue(destination, sSub, value); };
									
								}
								
								if (typeSub == String.class) {
									if (DateUtils.isDate((String) beanObj.getValue(lst.get(i), sSub), "yyyy-MM-dd HH:mm:ss") == true) {
										Date toDate = DateUtils.stringToDate((String) beanObj.getValue(lst.get(i), sSub), "yyyy-MM-dd HH:mm:ss");
										beanDes.setValue(destination, sSub, toDate);
									} else {
										beanDes.setValue(destination, sSub, beanObj.getValue(lst.get(i), sSub));
									}
								}
							}
							break;
						}
					}
				}
			}
		}
		return destination;
	}
}
