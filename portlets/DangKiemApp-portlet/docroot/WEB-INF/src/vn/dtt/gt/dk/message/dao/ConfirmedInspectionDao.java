package vn.dtt.gt.dk.message.dao;

import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionImpl;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.nsw.model.RequestForChangingDateSite;


public class ConfirmedInspectionDao {
	
	/**
	 * @isNew true nghia la install 1 new record moi, false thuc thi update
	 * */
	public void insertOrUpdate(RequestForChangingDateSite model, Header header, boolean isNew) {
		try {
			ConfirmedInspection dao = new ConfirmedInspectionImpl();
			
			/*dao.setRegisteredInspectionId(registeredInspectionId);*/
			
		} catch (Exception e) {
		}
	}
}
