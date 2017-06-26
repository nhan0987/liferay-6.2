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

package vn.dtt.gt.dk.dao.motcua.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MotCuaQuyTrinhThuTucService}.
 *
 * @author win_64
 * @see MotCuaQuyTrinhThuTucService
 * @generated
 */
public class MotCuaQuyTrinhThuTucServiceWrapper
	implements MotCuaQuyTrinhThuTucService,
		ServiceWrapper<MotCuaQuyTrinhThuTucService> {
	public MotCuaQuyTrinhThuTucServiceWrapper(
		MotCuaQuyTrinhThuTucService motCuaQuyTrinhThuTucService) {
		_motCuaQuyTrinhThuTucService = motCuaQuyTrinhThuTucService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _motCuaQuyTrinhThuTucService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_motCuaQuyTrinhThuTucService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _motCuaQuyTrinhThuTucService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc> findByThuTucHanhChinhIdAndToChucXuLy(
		long thuTucHanhChinhId, long toChucXuLy) {
		return _motCuaQuyTrinhThuTucService.findByThuTucHanhChinhIdAndToChucXuLy(thuTucHanhChinhId,
			toChucXuLy);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MotCuaQuyTrinhThuTucService getWrappedMotCuaQuyTrinhThuTucService() {
		return _motCuaQuyTrinhThuTucService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMotCuaQuyTrinhThuTucService(
		MotCuaQuyTrinhThuTucService motCuaQuyTrinhThuTucService) {
		_motCuaQuyTrinhThuTucService = motCuaQuyTrinhThuTucService;
	}

	@Override
	public MotCuaQuyTrinhThuTucService getWrappedService() {
		return _motCuaQuyTrinhThuTucService;
	}

	@Override
	public void setWrappedService(
		MotCuaQuyTrinhThuTucService motCuaQuyTrinhThuTucService) {
		_motCuaQuyTrinhThuTucService = motCuaQuyTrinhThuTucService;
	}

	private MotCuaQuyTrinhThuTucService _motCuaQuyTrinhThuTucService;
}