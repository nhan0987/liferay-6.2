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

package vn.dtt.gt.dk.dao.nghiepvu.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link InspectionRecordAttachService}.
 *
 * @author huymq
 * @see InspectionRecordAttachService
 * @generated
 */
public class InspectionRecordAttachServiceWrapper
	implements InspectionRecordAttachService,
		ServiceWrapper<InspectionRecordAttachService> {
	public InspectionRecordAttachServiceWrapper(
		InspectionRecordAttachService inspectionRecordAttachService) {
		_inspectionRecordAttachService = inspectionRecordAttachService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _inspectionRecordAttachService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_inspectionRecordAttachService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _inspectionRecordAttachService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach> getByHoSoThuTucIds(
		long[] hosothutucids)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _inspectionRecordAttachService.getByHoSoThuTucIds(hosothutucids);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public InspectionRecordAttachService getWrappedInspectionRecordAttachService() {
		return _inspectionRecordAttachService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedInspectionRecordAttachService(
		InspectionRecordAttachService inspectionRecordAttachService) {
		_inspectionRecordAttachService = inspectionRecordAttachService;
	}

	@Override
	public InspectionRecordAttachService getWrappedService() {
		return _inspectionRecordAttachService;
	}

	@Override
	public void setWrappedService(
		InspectionRecordAttachService inspectionRecordAttachService) {
		_inspectionRecordAttachService = inspectionRecordAttachService;
	}

	private InspectionRecordAttachService _inspectionRecordAttachService;
}