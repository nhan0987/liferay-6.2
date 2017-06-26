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

package vn.dtt.gt.dk.dao.common.service.persistence;

/**
 * @author win_64
 */
public interface TthcNoidungHoSoFinder {
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo findLastByHoSoThuTucIdAndMaBieuMau(
		long hoSoThuTucId, java.lang.String maBieuMau);

	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo findBDKByHoSoThuTucIdAndTthcId(
		java.lang.String hoSoThuTucId, java.lang.String tthcId);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucId(
		long hoSoThuTucId, long bieuMauHoSoId);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucIdLanCuoi(
		long hoSoThuTucId, long bieuMauHoSoId);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findTthcBieuMauHoSoByThuTucHanhChinhIdFinder(
		long hoSoThuTucId, long bieuMauHoSoId);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findTthcBieuMauHoSoByThuTucHanhChinhIdFinderEnd(
		long hoSoThuTucId, long bieuMauHoSoId);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinder(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinderEnd(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucId(
		long hoSoThuTucId, java.lang.String mauTrucTuyen);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucId(
		long hoSoThuTucId, java.lang.String mauTrucTuyen1,
		java.lang.String mauTrucTuyen2);

	public int countSoLuongKySo(long phieuXuLyPhuId);

	public int countSoLuongDaDongDau(long phieuXuLyPhuId);
}