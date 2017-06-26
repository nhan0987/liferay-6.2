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

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException;
import vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.CustomsDeclarationLocalServiceBaseImpl;

/**
 * The implementation of the customs declaration local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.CustomsDeclarationLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationLocalServiceUtil
 */
public class CustomsDeclarationLocalServiceImpl
	extends CustomsDeclarationLocalServiceBaseImpl {
	public CustomsDeclaration findByHoSoThuTucId(long hosothutucId){
		try {
			return customsDeclarationPersistence.findByHoSoThuTucId(hosothutucId);
		} catch (Exception e) {
			//_log.error(e);
		}
		return null;
	}
}