package vn.dtt.gt.dk.dynamicquery.sort;

import java.util.Comparator;

import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;

public class TthcNoidungHoSoSort  implements Comparator<TthcNoidungHoSo>{

	@Override
	public int compare(TthcNoidungHoSo o1, TthcNoidungHoSo o2) {
		// TODO Auto-generated method stub
		if(o1 == null || o2== null) return 0;
		return o1.getNgayTao().compareTo(o2.getNgayTao());
	}

	

}
