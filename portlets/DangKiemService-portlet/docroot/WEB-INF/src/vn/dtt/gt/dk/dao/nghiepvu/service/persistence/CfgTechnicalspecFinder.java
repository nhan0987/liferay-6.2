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
public interface CfgTechnicalspecFinder {
	public int countBySynchDate(java.lang.String synchDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> findBySynchDate(
		java.lang.String synchDate, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> findByLikeVehicleTypeCode(
		java.lang.String likeVehicleTypeCode, int start, int end);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> findByVehicleTypeCode(
		java.lang.String vehicleTypeCode);

	public java.util.List<java.lang.String> getSpecCategoryByVehicleTypeCode(
		java.lang.String vehicleTypeCode);

	public java.util.List<java.lang.String> getSpecificationCodeBySpecCategory(
		java.lang.String[] specCategorys);
}