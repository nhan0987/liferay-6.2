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
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich;
import vn.dtt.gt.dk.dao.common.service.base.TthcKeHoachChuyenDichLocalServiceBaseImpl;

/**
 * The implementation of the tthc ke hoach chuyen dich local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.common.service.TthcKeHoachChuyenDichLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.common.service.base.TthcKeHoachChuyenDichLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.common.service.TthcKeHoachChuyenDichLocalServiceUtil
 */
public class TthcKeHoachChuyenDichLocalServiceImpl
	extends TthcKeHoachChuyenDichLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.common.service.TthcKeHoachChuyenDichLocalServiceUtil} to access the tthc ke hoach chuyen dich local service.
	 */
	
	public List<TthcKeHoachChuyenDich> findByPhieuXuLyChinhId(
			long phieuXuLyChinhId){
		try{
			return tthcKeHoachChuyenDichPersistence.findByPhieuXuLyChinhId(phieuXuLyChinhId);
		}catch (SystemException e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<TthcKeHoachChuyenDich> findByPhieuXuLyPhuId(
			long phieuXuLyPhuId){
		try{
			return tthcKeHoachChuyenDichPersistence.findByPhieuXuLyPhuId(phieuXuLyPhuId);
		}catch (SystemException e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<TthcKeHoachChuyenDich> findByMessageId(
			String messageId){
		try{
			return tthcKeHoachChuyenDichPersistence.findByMessageId(messageId);
		}catch (SystemException e) {
			_log.error(e);
		}
		return null;
	}
	
	public  List<TthcKeHoachChuyenDich> findByDebitnoteNumber(
			String debitnoteNumber){
		try{
			return tthcKeHoachChuyenDichPersistence.findByDebitnoteNumber(debitnoteNumber);
		}catch (SystemException e) {
			_log.error(e);
		}
		
		return null;
	}
	public List<TthcKeHoachChuyenDich> findByCertificateId(
			String ghiChu){
		try{
			return tthcKeHoachChuyenDichPersistence.findByCertificateId(ghiChu);
		}catch (SystemException e) {
			_log.error(e);
		}
		return null;
	}
	
	private static Log _log = LogFactoryUtil.getLog(TthcKeHoachChuyenDichLocalServiceImpl.class);
}