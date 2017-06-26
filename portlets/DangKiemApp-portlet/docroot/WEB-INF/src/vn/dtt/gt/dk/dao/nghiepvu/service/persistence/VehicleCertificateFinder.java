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

/**
 * @author win_64
 */
public interface VehicleCertificateFinder {
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate> findVehicleCertificateByHosothutucId(
		long hosothutucid);

	public boolean deleteVehicleCertificateSpecWithHosothutucId(
		long hosothutucId);

	public boolean deleteVehicleCertificateOutOfMTGateway(long outofMTgateway,
		java.lang.String soChungChi, java.lang.String soDangKyKiemTra);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate> findVehicleCertificate(
		java.lang.String soChungChi, long organizationId,
		java.lang.String thuTucHanhChinhId, java.lang.String doiTuong,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		vn.dtt.gt.dk.tracuthongtin.ThongTinTimKiemHoSo thongTinTimKiemHoSo,
		int start, int end);

	public int countVehicleCertificate(java.lang.String soChungChi,
		long organizationId, java.lang.String thuTucHanhChinhId,
		java.lang.String doiTuong, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep, int year,
		vn.dtt.gt.dk.tracuthongtin.ThongTinTimKiemHoSo thongTinTimKiemHoSo);
}