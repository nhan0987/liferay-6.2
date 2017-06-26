/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.dtt.gt.dk.dao.nghiepvu.service.impl;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.service.base.DebitNoteDetailsLocalServiceBaseImpl;

/**
 * The implementation of the debit note details local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsLocalService}
 * interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.DebitNoteDetailsLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsLocalServiceUtil
 */
public class DebitNoteDetailsLocalServiceImpl extends DebitNoteDetailsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsLocalServiceUtil} to
	 * access the debit note details local service.
	 */
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails findByVehicleRecordId(long vehicleRecordId) {
		try {

			return debitNoteDetailsPersistence.findByVehicleRecordId(vehicleRecordId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails> findByDebitNoteId(long debitNoteId) {
		try {

			return debitNoteDetailsPersistence.findByDebitNoteId(debitNoteId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public int countByDebitNoteId(long debitNoteId){
		try{
			return debitNoteDetailsPersistence.countByDebitNoteId(debitNoteId);
		}catch (Exception e) {
			_log.error(e);
		}
		return 0;
	}
	
	private static Log _log = LogFactoryUtil.getLog(DebitNoteDetailsLocalServiceImpl.class);

}