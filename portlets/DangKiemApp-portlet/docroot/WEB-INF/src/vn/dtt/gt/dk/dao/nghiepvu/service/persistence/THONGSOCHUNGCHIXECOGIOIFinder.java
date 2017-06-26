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
public interface THONGSOCHUNGCHIXECOGIOIFinder {
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI> findByCertificateRecordAndHosothutucId(
		long hosothutucid);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI> findByVehicleGroupInitialAndHosothutucId(
		long hosothutucid);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> findPart2ByCertificateRecordAndHosothutucId(
		long hosothutucid);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> findPart2ByVehicleGroupInitialAndHosothutucId(
		long hosothutucid);

	public boolean deleteXCGVehicleCertificateSpecWithHosothutucId(
		long hosothutucId);
}