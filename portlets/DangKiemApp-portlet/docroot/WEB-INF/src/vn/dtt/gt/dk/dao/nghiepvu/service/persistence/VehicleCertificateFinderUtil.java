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

package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author win_64
 */
public class VehicleCertificateFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate> findVehicleCertificateByHosothutucId(
		long hosothutucid) {
		return getFinder().findVehicleCertificateByHosothutucId(hosothutucid);
	}

	public static boolean deleteVehicleCertificateSpecWithHosothutucId(
		long hosothutucId) {
		return getFinder()
				   .deleteVehicleCertificateSpecWithHosothutucId(hosothutucId);
	}

	public static boolean deleteVehicleCertificateOutOfMTGateway(
		long outofMTgateway, java.lang.String soChungChi,
		java.lang.String soDangKyKiemTra) {
		return getFinder()
				   .deleteVehicleCertificateOutOfMTGateway(outofMTgateway,
			soChungChi, soDangKyKiemTra);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate> findVehicleCertificate(
		java.lang.String soChungChi, long organizationId,
		java.lang.String thuTucHanhChinhId, java.lang.String doiTuong,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		vn.dtt.gt.dk.tracuthongtin.ThongTinTimKiemHoSo thongTinTimKiemHoSo,
		int start, int end) {
		return getFinder()
				   .findVehicleCertificate(soChungChi, organizationId,
			thuTucHanhChinhId, doiTuong, maSoHoSo, ngayNopFrom, ngayNopTo,
			tenDoanhNghiep, year, thongTinTimKiemHoSo, start, end);
	}

	public static int countVehicleCertificate(java.lang.String soChungChi,
		long organizationId, java.lang.String thuTucHanhChinhId,
		java.lang.String doiTuong, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep, int year,
		vn.dtt.gt.dk.tracuthongtin.ThongTinTimKiemHoSo thongTinTimKiemHoSo) {
		return getFinder()
				   .countVehicleCertificate(soChungChi, organizationId,
			thuTucHanhChinhId, doiTuong, maSoHoSo, ngayNopFrom, ngayNopTo,
			tenDoanhNghiep, year, thongTinTimKiemHoSo);
	}

	public static VehicleCertificateFinder getFinder() {
		if (_finder == null) {
			_finder = (VehicleCertificateFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					VehicleCertificateFinder.class.getName());

			ReferenceRegistry.registerReference(VehicleCertificateFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(VehicleCertificateFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(VehicleCertificateFinderUtil.class,
			"_finder");
	}

	private static VehicleCertificateFinder _finder;
}