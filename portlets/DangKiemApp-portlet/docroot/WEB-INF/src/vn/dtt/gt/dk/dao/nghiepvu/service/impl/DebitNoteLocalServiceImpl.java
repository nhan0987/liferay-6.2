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

import java.util.ArrayList;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.DebitNoteLocalServiceBaseImpl;

/**
 * The implementation of the debit note local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalService} interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.DebitNoteLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalServiceUtil
 */
public class DebitNoteLocalServiceImpl extends DebitNoteLocalServiceBaseImpl {
	
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalServiceUtil} to access
	 * the debit note local service.
	 */
	public DebitNote findByTransactionId(java.lang.String transactionId) {
		try {
			return debitNotePersistence.findByTransactionId(transactionId);
		} catch (Exception e) {
//			_log.error(e);
		}
		return null;
	}
	
	public DebitNote findByDebitNoteNumber(java.lang.String debitNoteNumber) {
		try {
			return debitNotePersistence.findByDebitNoteNumber(debitNoteNumber);
		} catch (Exception e) {
//			_log.error(e);
		}
		return null;
	}
	
	public List<DebitNote> findByMarkAsDeleted(int markAsDeleted) {
		try {
			return debitNotePersistence.findByMarkAsDeleted(markAsDeleted);
		} catch (Exception e) {
//			_log.error(e);
		}
		return new ArrayList<DebitNote>();
	}
	
	public List<DebitNote> findByMarkAsDeleted(int markAsDeleted, int start, int end) {
		try {
			return debitNotePersistence.findByMarkAsDeleted(markAsDeleted, start, end);
		} catch (Exception e) {
//			_log.error(e);
		}
		return new ArrayList<DebitNote>();
	}
	
	public int countByMarkAsDeleted(int markAsDeleted) {
		try {
			return debitNotePersistence.countByMarkAsDeleted(markAsDeleted);
		} catch (Exception e) {
//			_log.error(e);
		}
		return 0;
	}
	public List<DebitNote> findDebitNote(String data, int start, int end) {
		return debitNoteFinder.findDebitNote(data, start, end);
	}
	
	public int countDebitNote(String data) {
		return debitNoteFinder.countDebitNote(data);
	}
	public List<DebitNote> thongkeDebitNotePAID(String data, String ngayXacNhanThanhToan, int start, int end) {
		return debitNoteFinder.thongkeDebitNotePAID(data, ngayXacNhanThanhToan, start, end);
	}
	
	public int countThongKeDebitNotePAID(String data, String ngayXacNhanThanhToan) {
		return debitNoteFinder.countThongKeDebitNotePAID(data, ngayXacNhanThanhToan);
	}
	public List<DebitNote> findDebitNotePAID(String data, int start, int end) {
		return debitNoteFinder.findDebitNotePAID(data, start, end);
	}
	
	public int countDebitNotePAID(String data) {
		return debitNoteFinder.countDebitNotePAID(data);
	}
	public List<DebitNote> findDebitNoteByIdCertificateRecord(long idCertificateRecord, int markasdelete) {
		return debitNoteFinder.findDebitNoteByIdCertificateRecord(idCertificateRecord, markasdelete);
	}
}
