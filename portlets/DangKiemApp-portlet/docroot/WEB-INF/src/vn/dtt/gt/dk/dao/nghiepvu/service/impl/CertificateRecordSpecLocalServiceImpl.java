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

import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.CertificateRecordSpecLocalServiceBaseImpl;

/**
 * The implementation of the certificate record spec local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.CertificateRecordSpecLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecLocalServiceUtil
 */
public class CertificateRecordSpecLocalServiceImpl
	extends CertificateRecordSpecLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecLocalServiceUtil} to access the certificate record spec local service.
	 */
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec> findByCertificateRecordId(
			long certificateRecordId){
		try{
			return certificateRecordSpecPersistence.findByCertificateRecordId(certificateRecordId);
		}catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	public List<CertificateRecordSpec> findByIdCertificateRecordAndVehicleTypeCode(long idCertificateRecord, String vehicleClass, String vehicleType) {
		try{
			return certificateRecordSpecFinder.findByIdCertificateRecordAndVehicleTypeCode(idCertificateRecord, vehicleClass, vehicleType);
		}catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<CertificateRecordSpec>();
	}
	
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec findByCertificateRecordIdAndSpecificationCode(
			long certificateRecordId, java.lang.String specificationCode){
		try{
			return certificateRecordSpecPersistence.findByCertificateRecordIdAndSpecificationCode(certificateRecordId, specificationCode);
		}catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	private static Log _log = LogFactoryUtil.getLog(CertificateRecordSpecLocalServiceImpl.class);
	
	
}