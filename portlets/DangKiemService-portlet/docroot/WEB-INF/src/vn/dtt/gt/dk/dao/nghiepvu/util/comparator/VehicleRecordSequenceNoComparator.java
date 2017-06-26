package vn.dtt.gt.dk.dao.nghiepvu.util.comparator;

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;

import com.liferay.portal.kernel.util.OrderByComparator;

public class VehicleRecordSequenceNoComparator extends OrderByComparator {
	
	public static final String ORDER_BY_ASC = "sequenceNo ASC";

	public static final String ORDER_BY_DESC = "sequenceNo DESC";

	public static final String[] ORDER_BY_FIELDS = {"sequenceNo"};

	public VehicleRecordSequenceNoComparator() {
		this(true);
	}

	public VehicleRecordSequenceNoComparator(boolean asc) {
		_asc = asc;
	}

	public int compare(Object arg0, Object arg1) {
		VehicleRecord vehicleRecord1 = (VehicleRecord) arg0;
		VehicleRecord vehicleRecord2 = (VehicleRecord) arg1;
		
		Long sequenceNo1 = vehicleRecord1.getSequenceNo();
		Long sequenceNo2 = vehicleRecord2.getSequenceNo();
		
		int value = sequenceNo1.compareTo(sequenceNo2);
		
		if (_asc) {
			return value;
		} else {
			return -value;
		}
	}

	public String getOrderBy() {
		if (_asc) {
			return ORDER_BY_ASC;
		}
		else {
			return ORDER_BY_DESC;
		}
	}

	public String[] getOrderByFields() {
		return ORDER_BY_FIELDS;
	}

	public boolean isAscending() {
		return _asc;
	}

	private boolean _asc;
}
