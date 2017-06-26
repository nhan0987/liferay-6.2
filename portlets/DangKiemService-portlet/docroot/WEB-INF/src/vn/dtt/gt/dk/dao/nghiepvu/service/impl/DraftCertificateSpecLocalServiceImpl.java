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
import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.DraftCertificateSpecLocalServiceBaseImpl;

/**
 * The implementation of the draft certificate spec local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateSpecLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.DraftCertificateSpecLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateSpecLocalServiceUtil
 */
public class DraftCertificateSpecLocalServiceImpl
	extends DraftCertificateSpecLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateSpecLocalServiceUtil} to access the draft certificate spec local service.
	 */
	public List<DraftCertificateSpec> findByDraftCertificateId(long draftCertificateId){
		try{
			
			return draftCertificateSpecPersistence.findByDraftCertificateId(draftCertificateId);
			
		}catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<DraftCertificateSpec>();
	}
	public boolean deleteDraftCertificateSpecWithDraftCertificateId(long draftCertificateId) {
		try{
			return draftCertificateSpecFinder.deleteDraftCertificateSpecWithDraftCertificateId(draftCertificateId);
		}catch (Exception e) {
			_log.error(e);
		}
		return false;
	}
	
	private static Log _log = LogFactoryUtil.getLog(DraftCertificateSpecLocalServiceImpl.class);
}