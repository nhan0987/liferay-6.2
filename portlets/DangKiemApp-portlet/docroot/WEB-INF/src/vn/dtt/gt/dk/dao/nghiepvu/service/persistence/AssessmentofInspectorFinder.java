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
 * @author win_64
 */
public interface AssessmentofInspectorFinder {
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> findDanhSachDanhGiaDangKiemVien(
		java.lang.String inspectorcontactcode, java.lang.String inspectorname,
		int start, int end);

	public int countDanhSachDanhGiaDangKiemVien(
		java.lang.String inspectorcontactcode, java.lang.String inspectorname)
		throws com.liferay.portal.kernel.exception.SystemException;
}