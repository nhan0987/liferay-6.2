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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author huymq
 */
public class DebitNoteFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findDebitNote(
		java.lang.String data, int start, int end) {
		return getFinder().findDebitNote(data, start, end);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findDebitNotePAID(
		java.lang.String data, int start, int end) {
		return getFinder().findDebitNotePAID(data, start, end);
	}

	public static int countDebitNotePAID(java.lang.String data) {
		return getFinder().countDebitNotePAID(data);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> thongkeDebitNotePAID(
		java.lang.String data, java.lang.String ngayXacNhanThanhToan,
		int start, int end) {
		return getFinder()
				   .thongkeDebitNotePAID(data, ngayXacNhanThanhToan, start, end);
	}

	public static int countThongKeDebitNotePAID(java.lang.String data,
		java.lang.String ngayXacNhanThanhToan) {
		return getFinder().countThongKeDebitNotePAID(data, ngayXacNhanThanhToan);
	}

	public static int countDebitNote(java.lang.String data) {
		return getFinder().countDebitNote(data);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findDebitNoteByIdCertificateRecord(
		long idCertificateRecord, int markasdelete) {
		return getFinder()
				   .findDebitNoteByIdCertificateRecord(idCertificateRecord,
			markasdelete);
	}

	public static DebitNoteFinder getFinder() {
		if (_finder == null) {
			_finder = (DebitNoteFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					DebitNoteFinder.class.getName());

			ReferenceRegistry.registerReference(DebitNoteFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DebitNoteFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DebitNoteFinderUtil.class, "_finder");
	}

	private static DebitNoteFinder _finder;
}