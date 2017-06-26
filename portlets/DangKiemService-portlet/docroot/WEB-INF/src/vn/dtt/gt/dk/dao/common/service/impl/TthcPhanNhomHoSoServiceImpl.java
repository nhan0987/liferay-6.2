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

package vn.dtt.gt.dk.dao.common.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;

import vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo;
import vn.dtt.gt.dk.dao.common.service.base.TthcPhanNhomHoSoServiceBaseImpl;

/**
 * The implementation of the tthc phan nhom ho so remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.common.service.base.TthcPhanNhomHoSoServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoServiceUtil
 */
public class TthcPhanNhomHoSoServiceImpl extends TthcPhanNhomHoSoServiceBaseImpl {
	
	@JSONWebService(value = "count_tthc_phannhomhoso", method = "GET")
	public int countTthcPhanNhomHoSos() 
		throws SystemException {
		
		return tthcPhanNhomHoSoPersistence.countAll();
	}
	
	@JSONWebService(value = "get_tthc_phannhomhoso", method = "GET")
	public List<TthcPhanNhomHoSo> getTthcPhanNhomHoSos(int start, int end) 
		throws SystemException {
		
		return tthcPhanNhomHoSoPersistence.findAll(start, end);
	}
}