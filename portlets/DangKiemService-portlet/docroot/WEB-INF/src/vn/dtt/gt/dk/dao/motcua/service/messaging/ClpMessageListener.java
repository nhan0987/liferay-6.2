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

package vn.dtt.gt.dk.dao.motcua.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import vn.dtt.gt.dk.dao.motcua.service.ClpSerializer;
import vn.dtt.gt.dk.dao.motcua.service.DaKiemTraLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.DaKiemTraServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.LichKiemTraHienTruongLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.LichKiemTraHienTruongServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaChuyenDichTrangThaiLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaKetQuaDienBienLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaNotificationLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhanCongXuLyLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyChinhLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaQuyTrinhThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.PhanCongDonViKiemTraLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.PhanCongDonViKiemTraServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.PhieuXuLyChinhHoSoThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.PhieuXuLyPhuHoSoThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.ThamSoHeThongLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.ThamSoHeThongServiceUtil;

/**
 * @author huymq
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			DaKiemTraLocalServiceUtil.clearService();

			DaKiemTraServiceUtil.clearService();
			LichKiemTraHienTruongLocalServiceUtil.clearService();

			LichKiemTraHienTruongServiceUtil.clearService();
			MotCuaChuyenDichTrangThaiLocalServiceUtil.clearService();

			MotCuaDienBienHoSoLocalServiceUtil.clearService();

			MotCuaDienBienHoSoServiceUtil.clearService();
			MotCuaKetQuaDienBienLocalServiceUtil.clearService();

			MotCuaNotificationLocalServiceUtil.clearService();

			MotCuaPhanCongXuLyLocalServiceUtil.clearService();

			MotCuaPhieuXuLyChinhLocalServiceUtil.clearService();

			MotCuaPhieuXuLyPhuLocalServiceUtil.clearService();

			MotCuaQuyTrinhThuTucLocalServiceUtil.clearService();

			MotCuaTrangThaiHoSoLocalServiceUtil.clearService();

			PhanCongDonViKiemTraLocalServiceUtil.clearService();

			PhanCongDonViKiemTraServiceUtil.clearService();
			PhieuXuLyChinhHoSoThuTucLocalServiceUtil.clearService();

			PhieuXuLyPhuHoSoThuTucLocalServiceUtil.clearService();

			ThamSoHeThongLocalServiceUtil.clearService();

			ThamSoHeThongServiceUtil.clearService();
		}
	}
}