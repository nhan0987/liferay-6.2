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

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.tracuthongtin.ThongTinTimKiemHoSo;
import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.service.impl.TthcHoSoThuTucLocalServiceImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate;
import vn.dtt.gt.dk.dao.nghiepvu.service.impl.VehicleCertificateLocalServiceImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.VehicleCertificateLocalServiceBaseImpl;

/**
 * The implementation of the vehicle certificate local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.VehicleCertificateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.VehicleCertificateLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.VehicleCertificateLocalServiceUtil
 */
public class VehicleCertificateLocalServiceImpl
	extends VehicleCertificateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.VehicleCertificateLocalServiceUtil} to access the vehicle certificate local service.
	 */
	public boolean deleteVehicleCertificateSpecWithHosothutucId(long hosothutucId) throws SystemException {
		return vehicleCertificateFinder.deleteVehicleCertificateSpecWithHosothutucId(hosothutucId);
	}
	
	public boolean deleteVehicleCertificateOutOfMTGateway(long outofMTgateway, String soChungChi, String soDangKyKiemTra) throws SystemException {
		return vehicleCertificateFinder.deleteVehicleCertificateOutOfMTGateway(outofMTgateway, soChungChi, soDangKyKiemTra);
	}
	
	public List<VehicleCertificate> findVehicleCertificateByHosothutucId(long hosothutucId) {
		return vehicleCertificateFinder.findVehicleCertificateByHosothutucId(hosothutucId);
	}
	
	public List<VehicleCertificate> findVehicleCertificate(
			String soChungChi, long organizationId, String thuTucHanhChinhId, String doiTuong, String maSoHoSo, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, int year, ThongTinTimKiemHoSo thongTinTimKiemHoSo, int start, int end) {
		return vehicleCertificateFinder.findVehicleCertificate(soChungChi, organizationId, thuTucHanhChinhId, doiTuong, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year, thongTinTimKiemHoSo, start, end);
	}

	public int countVehicleCertificate(
			String soChungChi, long organizationId, String thuTucHanhChinhId, String doiTuong, String maSoHoSo, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, int year, ThongTinTimKiemHoSo thongTinTimKiemHoSo) {
		return vehicleCertificateFinder.countVehicleCertificate(soChungChi, organizationId, thuTucHanhChinhId, doiTuong, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year, thongTinTimKiemHoSo);
	}

	private static Log _log = LogFactoryUtil.getLog(VehicleCertificateLocalServiceImpl.class);
}