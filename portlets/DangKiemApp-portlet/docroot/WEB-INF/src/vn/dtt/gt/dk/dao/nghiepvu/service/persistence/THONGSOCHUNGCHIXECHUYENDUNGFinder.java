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
public interface THONGSOCHUNGCHIXECHUYENDUNGFinder {
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByCertificateRecordAndHosothutucId(
		long hosothutucid);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByVehicleGroupInitialAndHosothutucId(
		long hosothutucid);

	public boolean deleteXCDVehicleCertificateSpecWithHosothutucId(
		long hosothutucId);

	public boolean deleteXCDVehicleCertificateSpecWithXCD0009(
		java.lang.String XCD0009);
}