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

package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

/**
 * @author huymq
 */
public interface DebitNoteFinder {
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findDebitNote(
		java.lang.String data, int start, int end);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findDebitNotePAID(
		java.lang.String data, int start, int end);

	public int countDebitNotePAID(java.lang.String data);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> thongkeDebitNotePAID(
		java.lang.String data, java.lang.String ngayXacNhanThanhToan,
		int start, int end);

	public int countThongKeDebitNotePAID(java.lang.String data,
		java.lang.String ngayXacNhanThanhToan);

	public int countDebitNote(java.lang.String data);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findDebitNoteByIdCertificateRecord(
		long idCertificateRecord, int markasdelete);
}