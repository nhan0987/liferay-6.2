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
import vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway;
import vn.dtt.gt.dk.dao.motcua.service.base.MotCuaDongBoMTgatewayLocalServiceBaseImpl;

/**
 * The implementation of the mot cua dong bo m tgateway local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.motcua.service.MotCuaDongBoMTgatewayLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.motcua.service.base.MotCuaDongBoMTgatewayLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.motcua.service.MotCuaDongBoMTgatewayLocalServiceUtil
 */
public class MotCuaDongBoMTgatewayLocalServiceImpl
	extends MotCuaDongBoMTgatewayLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.motcua.service.MotCuaDongBoMTgatewayLocalServiceUtil} to access the mot cua dong bo m tgateway local service.
	 */
	
	private static Log _log = LogFactoryUtil.getLog(MotCuaDongBoMTgatewayLocalServiceImpl.class);
	
	public List<MotCuaDongBoMTgateway> findHoSoByPhieuXuLyChinh(long phieuXuLyChinhId, int start, int end) {
		return motCuaDongBoMTgatewayFinder.findHoSoByPhieuXuLyChinh(phieuXuLyChinhId, start, end);
	}

	public int countByPhieuXuLyChinh(long phieuXuLyChinhId) {
		return motCuaDongBoMTgatewayFinder.countByPhieuXuLyChinh(phieuXuLyChinhId);
	}
	
	public List<MotCuaDongBoMTgateway> findByTrangthaiDongbo(String trangthai, int start, int end) {
		return motCuaDongBoMTgatewayFinder.findByTrangthaiDongbo(trangthai, start, end);
	}

	public int countByDienbienHosoIdandPhieuXuLyChinhId(long dienBienHoSoId, long phieuXuLyChinhId) {
		return motCuaDongBoMTgatewayFinder.countByDienbienHosoIdandPhieuXuLyChinhId(dienBienHoSoId, phieuXuLyChinhId);
	}
	
	public MotCuaDongBoMTgateway findLatestHosoDongboByHosothutucId(long phieuXuLyChinhId) {
		return motCuaDongBoMTgatewayFinder.findLatestHosoDongboByHosothutucId(phieuXuLyChinhId);
	}
}