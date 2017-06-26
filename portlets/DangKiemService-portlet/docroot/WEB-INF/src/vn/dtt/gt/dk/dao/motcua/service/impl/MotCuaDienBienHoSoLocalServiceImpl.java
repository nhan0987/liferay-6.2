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

package vn.dtt.gt.dk.dao.motcua.service.impl;

import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo;
import vn.dtt.gt.dk.dao.motcua.service.base.MotCuaDienBienHoSoLocalServiceBaseImpl;

/**
 * The implementation of the mot cua dien bien ho so local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoLocalService}
 * interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author win_64
 * @see vn.dtt.gt.dk.dao.motcua.service.base.MotCuaDienBienHoSoLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoLocalServiceUtil
 */
public class MotCuaDienBienHoSoLocalServiceImpl extends
		MotCuaDienBienHoSoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoLocalServiceUtil} to
	 * access the mot cua dien bien ho so local service.
	 */
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByTrangThaiTruocId(
			long trangThaiTruocId) {
		try {
			return motCuaDienBienHoSoPersistence
					.findByTrangThaiTruocId(trangThaiTruocId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}

	public List<MotCuaDienBienHoSo> findMotCuaDienBienHoSoByPhieuXuLyChinh(long phieuXuLyChinhId, int start, int end) {
		return motCuaDienBienHoSoFinder.findMotCuaDienBienHoSoByPhieuXuLyChinh(phieuXuLyChinhId, start, end);
	}

	public int countMotCuaDienBienHoSoByPhieuXuLyChinh(long phieuXuLyChinhId) {
		return motCuaDienBienHoSoFinder.countMotCuaDienBienHoSoByPhieuXuLyChinh(phieuXuLyChinhId);
	}
	
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByTrangThaiSauId(
			long trangThaiSauId) {
		try {
			return motCuaDienBienHoSoPersistence
					.findByTrangThaiSauId(trangThaiSauId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}

	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhId(
			long phieuXuLyChinhId) {
		try {
			return motCuaDienBienHoSoPersistence
					.findByPhieuXuLyChinhId(phieuXuLyChinhId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}

	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyPhuId(
			long phieuXuLyPhuId) {
		try {
			return motCuaDienBienHoSoPersistence
					.findByPhieuXuLyPhuId(phieuXuLyPhuId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhIdTrangThaiTruocId(
			long phieuXuLyChinhId, long trangThaiTruocId){
		try{
			return motCuaDienBienHoSoPersistence.findByPhieuXuLyChinhIdTrangThaiTruocId(phieuXuLyChinhId,trangThaiTruocId);
		}catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhIdTrangThaiSauId(
			long phieuXuLyChinhId, long trangThaiSauId){
		try{
			return motCuaDienBienHoSoPersistence.findByPhieuXuLyChinhIdTrangThaiSauId(phieuXuLyChinhId,trangThaiSauId);
		}catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauId(
			long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId){
		try{
			return motCuaDienBienHoSoPersistence.findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauId(phieuXuLyChinhId,trangThaiSauId,phieuXuLyPhuId);
		}catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy(
			long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId,
			long nguoiXuLy){
		try{
			return motCuaDienBienHoSoPersistence.fetchByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy(phieuXuLyChinhId,trangThaiSauId,phieuXuLyPhuId,nguoiXuLy);
		}catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy(
			long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId,
			long nguoiXuLy){
		try{
			return motCuaDienBienHoSoPersistence.findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy(phieuXuLyChinhId,trangThaiSauId,phieuXuLyPhuId,nguoiXuLy);
		}catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	private static Log _log = LogFactoryUtil.getLog(MotCuaDienBienHoSoLocalServiceImpl.class);

}