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

package vn.dtt.gt.dk.dao.common.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import vn.dtt.gt.dk.dao.common.service.ClpSerializer;
import vn.dtt.gt.dk.dao.common.service.DmDataGroupLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.DmDataVersionLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.DmMetaDataLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TimKiemHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcBieuMauHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcCoQuanQlttLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcDonViThucHienLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcKeHoachChuyenDichLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcLinhVucThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoVaiTroLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil;

/**
 * @author win_64
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
			DmDataGroupLocalServiceUtil.clearService();

			DmDataItemLocalServiceUtil.clearService();

			DmDataVersionLocalServiceUtil.clearService();

			DmMetaDataLocalServiceUtil.clearService();

			TimKiemHoSoLocalServiceUtil.clearService();

			TthcBieuMauHoSoLocalServiceUtil.clearService();

			TthcCoQuanQlttLocalServiceUtil.clearService();

			TthcDonViThucHienLocalServiceUtil.clearService();

			TthcHoSoThuTucLocalServiceUtil.clearService();

			TthcKeHoachChuyenDichLocalServiceUtil.clearService();

			TthcLinhVucThuTucLocalServiceUtil.clearService();

			TthcNoidungHoSoLocalServiceUtil.clearService();

			TthcPhanNhomHoSoLocalServiceUtil.clearService();

			TthcPhanNhomHoSoVaiTroLocalServiceUtil.clearService();

			TthcThanhPhanHoSoLocalServiceUtil.clearService();

			TthcThuTucHanhChinhLocalServiceUtil.clearService();
		}
	}
}