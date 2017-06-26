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

package vn.dtt.gt.dk.dao.nghiepvu.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEMAYLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class THONGSOCHUNGCHIXEMAYClp extends BaseModelImpl<THONGSOCHUNGCHIXEMAY>
	implements THONGSOCHUNGCHIXEMAY {
	public THONGSOCHUNGCHIXEMAYClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return THONGSOCHUNGCHIXEMAY.class;
	}

	@Override
	public String getModelClassName() {
		return THONGSOCHUNGCHIXEMAY.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("certificateRecordId", getCertificateRecordId());
		attributes.put("vehicleGroupId", getVehicleGroupId());
		attributes.put("SynchDate", getSynchDate());
		attributes.put("XMY0009", getXMY0009());
		attributes.put("XMY0010", getXMY0010());
		attributes.put("XMY0011", getXMY0011());
		attributes.put("XMY0012", getXMY0012());
		attributes.put("XMY0013", getXMY0013());
		attributes.put("XMY0014", getXMY0014());
		attributes.put("XMY0015", getXMY0015());
		attributes.put("XMY0016", getXMY0016());
		attributes.put("XMY0017", getXMY0017());
		attributes.put("XMY0018", getXMY0018());
		attributes.put("XMY0019", getXMY0019());
		attributes.put("XMY0020", getXMY0020());
		attributes.put("XMY0021", getXMY0021());
		attributes.put("XMY0022", getXMY0022());
		attributes.put("XMY1022", getXMY1022());
		attributes.put("XMY0023", getXMY0023());
		attributes.put("XMY0024", getXMY0024());
		attributes.put("XMY0025", getXMY0025());
		attributes.put("XMY0026", getXMY0026());
		attributes.put("XMY0027", getXMY0027());
		attributes.put("XMY0028", getXMY0028());
		attributes.put("XMY0029", getXMY0029());
		attributes.put("XMY0030", getXMY0030());
		attributes.put("XMY0031", getXMY0031());
		attributes.put("XMY0032", getXMY0032());
		attributes.put("XMY1032", getXMY1032());
		attributes.put("XMY0033", getXMY0033());
		attributes.put("XMY1033", getXMY1033());
		attributes.put("XMY0034", getXMY0034());
		attributes.put("XMY0035", getXMY0035());
		attributes.put("XMY1035", getXMY1035());
		attributes.put("XMY0036", getXMY0036());
		attributes.put("XMY0037", getXMY0037());
		attributes.put("XMY0038", getXMY0038());
		attributes.put("XMY0039", getXMY0039());
		attributes.put("XMY1039", getXMY1039());
		attributes.put("XMY0040", getXMY0040());
		attributes.put("XMY1040", getXMY1040());
		attributes.put("XMY0041", getXMY0041());
		attributes.put("XMY0042", getXMY0042());
		attributes.put("XMY1042", getXMY1042());
		attributes.put("XMY0043", getXMY0043());
		attributes.put("XMY0044", getXMY0044());
		attributes.put("XMY0045", getXMY0045());
		attributes.put("XMY0046", getXMY0046());
		attributes.put("XMY0047", getXMY0047());
		attributes.put("XMY0048", getXMY0048());
		attributes.put("XMY0049", getXMY0049());
		attributes.put("XMY0050", getXMY0050());
		attributes.put("XMY1050", getXMY1050());
		attributes.put("XMY0051", getXMY0051());
		attributes.put("XMY0052", getXMY0052());
		attributes.put("XMY0053", getXMY0053());
		attributes.put("XMY0054", getXMY0054());
		attributes.put("XMY0055", getXMY0055());
		attributes.put("XMY0056", getXMY0056());
		attributes.put("XMY0057", getXMY0057());
		attributes.put("XMY0058", getXMY0058());
		attributes.put("XMY0059", getXMY0059());
		attributes.put("XMY0060", getXMY0060());
		attributes.put("XMY0061", getXMY0061());
		attributes.put("XMY0062", getXMY0062());
		attributes.put("XMY0063", getXMY0063());
		attributes.put("XMY0064", getXMY0064());
		attributes.put("XMY0065", getXMY0065());
		attributes.put("XMY0066", getXMY0066());
		attributes.put("XMY0067", getXMY0067());
		attributes.put("XMY0068", getXMY0068());
		attributes.put("XMY0069", getXMY0069());
		attributes.put("XMY0082", getXMY0082());
		attributes.put("XMY0083", getXMY0083());
		attributes.put("XMY0084", getXMY0084());
		attributes.put("XMY0085", getXMY0085());
		attributes.put("XMY0086", getXMY0086());
		attributes.put("XMY1086", getXMY1086());
		attributes.put("XMY0087", getXMY0087());
		attributes.put("XMY1087", getXMY1087());
		attributes.put("XMY1187", getXMY1187());
		attributes.put("XMY0088", getXMY0088());
		attributes.put("XMY1088", getXMY1088());
		attributes.put("XMY1188", getXMY1188());
		attributes.put("XMY0089", getXMY0089());
		attributes.put("XMY1089", getXMY1089());
		attributes.put("XMY1189", getXMY1189());
		attributes.put("XMY0090", getXMY0090());
		attributes.put("XMY0091", getXMY0091());
		attributes.put("XMY0092", getXMY0092());
		attributes.put("XMY0093", getXMY0093());
		attributes.put("XMY0094", getXMY0094());
		attributes.put("XMY0095", getXMY0095());
		attributes.put("XMY0096", getXMY0096());
		attributes.put("XMY0097", getXMY0097());
		attributes.put("XMY0098", getXMY0098());
		attributes.put("XMY0099", getXMY0099());
		attributes.put("XMY0100", getXMY0100());
		attributes.put("XMY0101", getXMY0101());
		attributes.put("XMY0102", getXMY0102());
		attributes.put("XMY0103", getXMY0103());
		attributes.put("XMY0104", getXMY0104());
		attributes.put("XMY0105", getXMY0105());
		attributes.put("XMY0106", getXMY0106());
		attributes.put("XMY2106", getXMY2106());
		attributes.put("XMY0107", getXMY0107());
		attributes.put("XMY2107", getXMY2107());
		attributes.put("XMY0108", getXMY0108());
		attributes.put("XMY2108", getXMY2108());
		attributes.put("XMY0109", getXMY0109());
		attributes.put("XMY2109", getXMY2109());
		attributes.put("XMY0110", getXMY0110());
		attributes.put("XMY2110", getXMY2110());
		attributes.put("XMY0111", getXMY0111());
		attributes.put("XMY2111", getXMY2111());
		attributes.put("XMY0112", getXMY0112());
		attributes.put("XMY2112", getXMY2112());
		attributes.put("XMY0113", getXMY0113());
		attributes.put("XMY2113", getXMY2113());
		attributes.put("XMY0114", getXMY0114());
		attributes.put("XMY2114", getXMY2114());
		attributes.put("XMY0115", getXMY0115());
		attributes.put("XMY2115", getXMY2115());
		attributes.put("XMY0116", getXMY0116());
		attributes.put("XMY2116", getXMY2116());
		attributes.put("XMY0117", getXMY0117());
		attributes.put("XMY2117", getXMY2117());
		attributes.put("XMY0118", getXMY0118());
		attributes.put("XMY2118", getXMY2118());
		attributes.put("XMY0119", getXMY0119());
		attributes.put("XMY2119", getXMY2119());
		attributes.put("XMY0120", getXMY0120());
		attributes.put("XMY0121", getXMY0121());
		attributes.put("XMY2121", getXMY2121());
		attributes.put("XMY0122", getXMY0122());
		attributes.put("XMY0198", getXMY0198());
		attributes.put("XMY1098", getXMY1098());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		Long certificateRecordId = (Long)attributes.get("certificateRecordId");

		if (certificateRecordId != null) {
			setCertificateRecordId(certificateRecordId);
		}

		Long vehicleGroupId = (Long)attributes.get("vehicleGroupId");

		if (vehicleGroupId != null) {
			setVehicleGroupId(vehicleGroupId);
		}

		Date SynchDate = (Date)attributes.get("SynchDate");

		if (SynchDate != null) {
			setSynchDate(SynchDate);
		}

		String XMY0009 = (String)attributes.get("XMY0009");

		if (XMY0009 != null) {
			setXMY0009(XMY0009);
		}

		String XMY0010 = (String)attributes.get("XMY0010");

		if (XMY0010 != null) {
			setXMY0010(XMY0010);
		}

		String XMY0011 = (String)attributes.get("XMY0011");

		if (XMY0011 != null) {
			setXMY0011(XMY0011);
		}

		String XMY0012 = (String)attributes.get("XMY0012");

		if (XMY0012 != null) {
			setXMY0012(XMY0012);
		}

		String XMY0013 = (String)attributes.get("XMY0013");

		if (XMY0013 != null) {
			setXMY0013(XMY0013);
		}

		String XMY0014 = (String)attributes.get("XMY0014");

		if (XMY0014 != null) {
			setXMY0014(XMY0014);
		}

		String XMY0015 = (String)attributes.get("XMY0015");

		if (XMY0015 != null) {
			setXMY0015(XMY0015);
		}

		String XMY0016 = (String)attributes.get("XMY0016");

		if (XMY0016 != null) {
			setXMY0016(XMY0016);
		}

		String XMY0017 = (String)attributes.get("XMY0017");

		if (XMY0017 != null) {
			setXMY0017(XMY0017);
		}

		String XMY0018 = (String)attributes.get("XMY0018");

		if (XMY0018 != null) {
			setXMY0018(XMY0018);
		}

		String XMY0019 = (String)attributes.get("XMY0019");

		if (XMY0019 != null) {
			setXMY0019(XMY0019);
		}

		String XMY0020 = (String)attributes.get("XMY0020");

		if (XMY0020 != null) {
			setXMY0020(XMY0020);
		}

		String XMY0021 = (String)attributes.get("XMY0021");

		if (XMY0021 != null) {
			setXMY0021(XMY0021);
		}

		String XMY0022 = (String)attributes.get("XMY0022");

		if (XMY0022 != null) {
			setXMY0022(XMY0022);
		}

		String XMY1022 = (String)attributes.get("XMY1022");

		if (XMY1022 != null) {
			setXMY1022(XMY1022);
		}

		String XMY0023 = (String)attributes.get("XMY0023");

		if (XMY0023 != null) {
			setXMY0023(XMY0023);
		}

		String XMY0024 = (String)attributes.get("XMY0024");

		if (XMY0024 != null) {
			setXMY0024(XMY0024);
		}

		String XMY0025 = (String)attributes.get("XMY0025");

		if (XMY0025 != null) {
			setXMY0025(XMY0025);
		}

		String XMY0026 = (String)attributes.get("XMY0026");

		if (XMY0026 != null) {
			setXMY0026(XMY0026);
		}

		String XMY0027 = (String)attributes.get("XMY0027");

		if (XMY0027 != null) {
			setXMY0027(XMY0027);
		}

		String XMY0028 = (String)attributes.get("XMY0028");

		if (XMY0028 != null) {
			setXMY0028(XMY0028);
		}

		String XMY0029 = (String)attributes.get("XMY0029");

		if (XMY0029 != null) {
			setXMY0029(XMY0029);
		}

		String XMY0030 = (String)attributes.get("XMY0030");

		if (XMY0030 != null) {
			setXMY0030(XMY0030);
		}

		String XMY0031 = (String)attributes.get("XMY0031");

		if (XMY0031 != null) {
			setXMY0031(XMY0031);
		}

		String XMY0032 = (String)attributes.get("XMY0032");

		if (XMY0032 != null) {
			setXMY0032(XMY0032);
		}

		String XMY1032 = (String)attributes.get("XMY1032");

		if (XMY1032 != null) {
			setXMY1032(XMY1032);
		}

		String XMY0033 = (String)attributes.get("XMY0033");

		if (XMY0033 != null) {
			setXMY0033(XMY0033);
		}

		String XMY1033 = (String)attributes.get("XMY1033");

		if (XMY1033 != null) {
			setXMY1033(XMY1033);
		}

		String XMY0034 = (String)attributes.get("XMY0034");

		if (XMY0034 != null) {
			setXMY0034(XMY0034);
		}

		String XMY0035 = (String)attributes.get("XMY0035");

		if (XMY0035 != null) {
			setXMY0035(XMY0035);
		}

		String XMY1035 = (String)attributes.get("XMY1035");

		if (XMY1035 != null) {
			setXMY1035(XMY1035);
		}

		String XMY0036 = (String)attributes.get("XMY0036");

		if (XMY0036 != null) {
			setXMY0036(XMY0036);
		}

		String XMY0037 = (String)attributes.get("XMY0037");

		if (XMY0037 != null) {
			setXMY0037(XMY0037);
		}

		String XMY0038 = (String)attributes.get("XMY0038");

		if (XMY0038 != null) {
			setXMY0038(XMY0038);
		}

		String XMY0039 = (String)attributes.get("XMY0039");

		if (XMY0039 != null) {
			setXMY0039(XMY0039);
		}

		String XMY1039 = (String)attributes.get("XMY1039");

		if (XMY1039 != null) {
			setXMY1039(XMY1039);
		}

		String XMY0040 = (String)attributes.get("XMY0040");

		if (XMY0040 != null) {
			setXMY0040(XMY0040);
		}

		String XMY1040 = (String)attributes.get("XMY1040");

		if (XMY1040 != null) {
			setXMY1040(XMY1040);
		}

		String XMY0041 = (String)attributes.get("XMY0041");

		if (XMY0041 != null) {
			setXMY0041(XMY0041);
		}

		String XMY0042 = (String)attributes.get("XMY0042");

		if (XMY0042 != null) {
			setXMY0042(XMY0042);
		}

		String XMY1042 = (String)attributes.get("XMY1042");

		if (XMY1042 != null) {
			setXMY1042(XMY1042);
		}

		String XMY0043 = (String)attributes.get("XMY0043");

		if (XMY0043 != null) {
			setXMY0043(XMY0043);
		}

		String XMY0044 = (String)attributes.get("XMY0044");

		if (XMY0044 != null) {
			setXMY0044(XMY0044);
		}

		String XMY0045 = (String)attributes.get("XMY0045");

		if (XMY0045 != null) {
			setXMY0045(XMY0045);
		}

		String XMY0046 = (String)attributes.get("XMY0046");

		if (XMY0046 != null) {
			setXMY0046(XMY0046);
		}

		String XMY0047 = (String)attributes.get("XMY0047");

		if (XMY0047 != null) {
			setXMY0047(XMY0047);
		}

		String XMY0048 = (String)attributes.get("XMY0048");

		if (XMY0048 != null) {
			setXMY0048(XMY0048);
		}

		String XMY0049 = (String)attributes.get("XMY0049");

		if (XMY0049 != null) {
			setXMY0049(XMY0049);
		}

		String XMY0050 = (String)attributes.get("XMY0050");

		if (XMY0050 != null) {
			setXMY0050(XMY0050);
		}

		String XMY1050 = (String)attributes.get("XMY1050");

		if (XMY1050 != null) {
			setXMY1050(XMY1050);
		}

		String XMY0051 = (String)attributes.get("XMY0051");

		if (XMY0051 != null) {
			setXMY0051(XMY0051);
		}

		String XMY0052 = (String)attributes.get("XMY0052");

		if (XMY0052 != null) {
			setXMY0052(XMY0052);
		}

		String XMY0053 = (String)attributes.get("XMY0053");

		if (XMY0053 != null) {
			setXMY0053(XMY0053);
		}

		String XMY0054 = (String)attributes.get("XMY0054");

		if (XMY0054 != null) {
			setXMY0054(XMY0054);
		}

		String XMY0055 = (String)attributes.get("XMY0055");

		if (XMY0055 != null) {
			setXMY0055(XMY0055);
		}

		String XMY0056 = (String)attributes.get("XMY0056");

		if (XMY0056 != null) {
			setXMY0056(XMY0056);
		}

		String XMY0057 = (String)attributes.get("XMY0057");

		if (XMY0057 != null) {
			setXMY0057(XMY0057);
		}

		String XMY0058 = (String)attributes.get("XMY0058");

		if (XMY0058 != null) {
			setXMY0058(XMY0058);
		}

		String XMY0059 = (String)attributes.get("XMY0059");

		if (XMY0059 != null) {
			setXMY0059(XMY0059);
		}

		String XMY0060 = (String)attributes.get("XMY0060");

		if (XMY0060 != null) {
			setXMY0060(XMY0060);
		}

		String XMY0061 = (String)attributes.get("XMY0061");

		if (XMY0061 != null) {
			setXMY0061(XMY0061);
		}

		String XMY0062 = (String)attributes.get("XMY0062");

		if (XMY0062 != null) {
			setXMY0062(XMY0062);
		}

		String XMY0063 = (String)attributes.get("XMY0063");

		if (XMY0063 != null) {
			setXMY0063(XMY0063);
		}

		String XMY0064 = (String)attributes.get("XMY0064");

		if (XMY0064 != null) {
			setXMY0064(XMY0064);
		}

		String XMY0065 = (String)attributes.get("XMY0065");

		if (XMY0065 != null) {
			setXMY0065(XMY0065);
		}

		String XMY0066 = (String)attributes.get("XMY0066");

		if (XMY0066 != null) {
			setXMY0066(XMY0066);
		}

		String XMY0067 = (String)attributes.get("XMY0067");

		if (XMY0067 != null) {
			setXMY0067(XMY0067);
		}

		String XMY0068 = (String)attributes.get("XMY0068");

		if (XMY0068 != null) {
			setXMY0068(XMY0068);
		}

		String XMY0069 = (String)attributes.get("XMY0069");

		if (XMY0069 != null) {
			setXMY0069(XMY0069);
		}

		String XMY0082 = (String)attributes.get("XMY0082");

		if (XMY0082 != null) {
			setXMY0082(XMY0082);
		}

		String XMY0083 = (String)attributes.get("XMY0083");

		if (XMY0083 != null) {
			setXMY0083(XMY0083);
		}

		String XMY0084 = (String)attributes.get("XMY0084");

		if (XMY0084 != null) {
			setXMY0084(XMY0084);
		}

		String XMY0085 = (String)attributes.get("XMY0085");

		if (XMY0085 != null) {
			setXMY0085(XMY0085);
		}

		String XMY0086 = (String)attributes.get("XMY0086");

		if (XMY0086 != null) {
			setXMY0086(XMY0086);
		}

		String XMY1086 = (String)attributes.get("XMY1086");

		if (XMY1086 != null) {
			setXMY1086(XMY1086);
		}

		String XMY0087 = (String)attributes.get("XMY0087");

		if (XMY0087 != null) {
			setXMY0087(XMY0087);
		}

		String XMY1087 = (String)attributes.get("XMY1087");

		if (XMY1087 != null) {
			setXMY1087(XMY1087);
		}

		String XMY1187 = (String)attributes.get("XMY1187");

		if (XMY1187 != null) {
			setXMY1187(XMY1187);
		}

		String XMY0088 = (String)attributes.get("XMY0088");

		if (XMY0088 != null) {
			setXMY0088(XMY0088);
		}

		String XMY1088 = (String)attributes.get("XMY1088");

		if (XMY1088 != null) {
			setXMY1088(XMY1088);
		}

		String XMY1188 = (String)attributes.get("XMY1188");

		if (XMY1188 != null) {
			setXMY1188(XMY1188);
		}

		String XMY0089 = (String)attributes.get("XMY0089");

		if (XMY0089 != null) {
			setXMY0089(XMY0089);
		}

		String XMY1089 = (String)attributes.get("XMY1089");

		if (XMY1089 != null) {
			setXMY1089(XMY1089);
		}

		String XMY1189 = (String)attributes.get("XMY1189");

		if (XMY1189 != null) {
			setXMY1189(XMY1189);
		}

		String XMY0090 = (String)attributes.get("XMY0090");

		if (XMY0090 != null) {
			setXMY0090(XMY0090);
		}

		String XMY0091 = (String)attributes.get("XMY0091");

		if (XMY0091 != null) {
			setXMY0091(XMY0091);
		}

		String XMY0092 = (String)attributes.get("XMY0092");

		if (XMY0092 != null) {
			setXMY0092(XMY0092);
		}

		String XMY0093 = (String)attributes.get("XMY0093");

		if (XMY0093 != null) {
			setXMY0093(XMY0093);
		}

		String XMY0094 = (String)attributes.get("XMY0094");

		if (XMY0094 != null) {
			setXMY0094(XMY0094);
		}

		String XMY0095 = (String)attributes.get("XMY0095");

		if (XMY0095 != null) {
			setXMY0095(XMY0095);
		}

		String XMY0096 = (String)attributes.get("XMY0096");

		if (XMY0096 != null) {
			setXMY0096(XMY0096);
		}

		String XMY0097 = (String)attributes.get("XMY0097");

		if (XMY0097 != null) {
			setXMY0097(XMY0097);
		}

		String XMY0098 = (String)attributes.get("XMY0098");

		if (XMY0098 != null) {
			setXMY0098(XMY0098);
		}

		String XMY0099 = (String)attributes.get("XMY0099");

		if (XMY0099 != null) {
			setXMY0099(XMY0099);
		}

		String XMY0100 = (String)attributes.get("XMY0100");

		if (XMY0100 != null) {
			setXMY0100(XMY0100);
		}

		String XMY0101 = (String)attributes.get("XMY0101");

		if (XMY0101 != null) {
			setXMY0101(XMY0101);
		}

		String XMY0102 = (String)attributes.get("XMY0102");

		if (XMY0102 != null) {
			setXMY0102(XMY0102);
		}

		String XMY0103 = (String)attributes.get("XMY0103");

		if (XMY0103 != null) {
			setXMY0103(XMY0103);
		}

		String XMY0104 = (String)attributes.get("XMY0104");

		if (XMY0104 != null) {
			setXMY0104(XMY0104);
		}

		String XMY0105 = (String)attributes.get("XMY0105");

		if (XMY0105 != null) {
			setXMY0105(XMY0105);
		}

		String XMY0106 = (String)attributes.get("XMY0106");

		if (XMY0106 != null) {
			setXMY0106(XMY0106);
		}

		String XMY2106 = (String)attributes.get("XMY2106");

		if (XMY2106 != null) {
			setXMY2106(XMY2106);
		}

		String XMY0107 = (String)attributes.get("XMY0107");

		if (XMY0107 != null) {
			setXMY0107(XMY0107);
		}

		String XMY2107 = (String)attributes.get("XMY2107");

		if (XMY2107 != null) {
			setXMY2107(XMY2107);
		}

		String XMY0108 = (String)attributes.get("XMY0108");

		if (XMY0108 != null) {
			setXMY0108(XMY0108);
		}

		String XMY2108 = (String)attributes.get("XMY2108");

		if (XMY2108 != null) {
			setXMY2108(XMY2108);
		}

		String XMY0109 = (String)attributes.get("XMY0109");

		if (XMY0109 != null) {
			setXMY0109(XMY0109);
		}

		String XMY2109 = (String)attributes.get("XMY2109");

		if (XMY2109 != null) {
			setXMY2109(XMY2109);
		}

		String XMY0110 = (String)attributes.get("XMY0110");

		if (XMY0110 != null) {
			setXMY0110(XMY0110);
		}

		String XMY2110 = (String)attributes.get("XMY2110");

		if (XMY2110 != null) {
			setXMY2110(XMY2110);
		}

		String XMY0111 = (String)attributes.get("XMY0111");

		if (XMY0111 != null) {
			setXMY0111(XMY0111);
		}

		String XMY2111 = (String)attributes.get("XMY2111");

		if (XMY2111 != null) {
			setXMY2111(XMY2111);
		}

		String XMY0112 = (String)attributes.get("XMY0112");

		if (XMY0112 != null) {
			setXMY0112(XMY0112);
		}

		String XMY2112 = (String)attributes.get("XMY2112");

		if (XMY2112 != null) {
			setXMY2112(XMY2112);
		}

		String XMY0113 = (String)attributes.get("XMY0113");

		if (XMY0113 != null) {
			setXMY0113(XMY0113);
		}

		String XMY2113 = (String)attributes.get("XMY2113");

		if (XMY2113 != null) {
			setXMY2113(XMY2113);
		}

		String XMY0114 = (String)attributes.get("XMY0114");

		if (XMY0114 != null) {
			setXMY0114(XMY0114);
		}

		String XMY2114 = (String)attributes.get("XMY2114");

		if (XMY2114 != null) {
			setXMY2114(XMY2114);
		}

		String XMY0115 = (String)attributes.get("XMY0115");

		if (XMY0115 != null) {
			setXMY0115(XMY0115);
		}

		String XMY2115 = (String)attributes.get("XMY2115");

		if (XMY2115 != null) {
			setXMY2115(XMY2115);
		}

		String XMY0116 = (String)attributes.get("XMY0116");

		if (XMY0116 != null) {
			setXMY0116(XMY0116);
		}

		String XMY2116 = (String)attributes.get("XMY2116");

		if (XMY2116 != null) {
			setXMY2116(XMY2116);
		}

		String XMY0117 = (String)attributes.get("XMY0117");

		if (XMY0117 != null) {
			setXMY0117(XMY0117);
		}

		String XMY2117 = (String)attributes.get("XMY2117");

		if (XMY2117 != null) {
			setXMY2117(XMY2117);
		}

		String XMY0118 = (String)attributes.get("XMY0118");

		if (XMY0118 != null) {
			setXMY0118(XMY0118);
		}

		String XMY2118 = (String)attributes.get("XMY2118");

		if (XMY2118 != null) {
			setXMY2118(XMY2118);
		}

		String XMY0119 = (String)attributes.get("XMY0119");

		if (XMY0119 != null) {
			setXMY0119(XMY0119);
		}

		String XMY2119 = (String)attributes.get("XMY2119");

		if (XMY2119 != null) {
			setXMY2119(XMY2119);
		}

		String XMY0120 = (String)attributes.get("XMY0120");

		if (XMY0120 != null) {
			setXMY0120(XMY0120);
		}

		String XMY0121 = (String)attributes.get("XMY0121");

		if (XMY0121 != null) {
			setXMY0121(XMY0121);
		}

		String XMY2121 = (String)attributes.get("XMY2121");

		if (XMY2121 != null) {
			setXMY2121(XMY2121);
		}

		String XMY0122 = (String)attributes.get("XMY0122");

		if (XMY0122 != null) {
			setXMY0122(XMY0122);
		}

		String XMY0198 = (String)attributes.get("XMY0198");

		if (XMY0198 != null) {
			setXMY0198(XMY0198);
		}

		String XMY1098 = (String)attributes.get("XMY1098");

		if (XMY1098 != null) {
			setXMY1098(XMY1098);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_thongsochungchixemayRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_thongsochungchixemayRemoteModel, hoSoThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCertificateRecordId() {
		return _certificateRecordId;
	}

	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_certificateRecordId = certificateRecordId;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateRecordId",
						long.class);

				method.invoke(_thongsochungchixemayRemoteModel,
					certificateRecordId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVehicleGroupId() {
		return _vehicleGroupId;
	}

	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_vehicleGroupId = vehicleGroupId;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleGroupId", long.class);

				method.invoke(_thongsochungchixemayRemoteModel, vehicleGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSynchDate() {
		return _SynchDate;
	}

	@Override
	public void setSynchDate(Date SynchDate) {
		_SynchDate = SynchDate;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchDate", Date.class);

				method.invoke(_thongsochungchixemayRemoteModel, SynchDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0009() {
		return _XMY0009;
	}

	@Override
	public void setXMY0009(String XMY0009) {
		_XMY0009 = XMY0009;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0009", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0009);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0010() {
		return _XMY0010;
	}

	@Override
	public void setXMY0010(String XMY0010) {
		_XMY0010 = XMY0010;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0010", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0010);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0011() {
		return _XMY0011;
	}

	@Override
	public void setXMY0011(String XMY0011) {
		_XMY0011 = XMY0011;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0011", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0011);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0012() {
		return _XMY0012;
	}

	@Override
	public void setXMY0012(String XMY0012) {
		_XMY0012 = XMY0012;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0012", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0012);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0013() {
		return _XMY0013;
	}

	@Override
	public void setXMY0013(String XMY0013) {
		_XMY0013 = XMY0013;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0013", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0013);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0014() {
		return _XMY0014;
	}

	@Override
	public void setXMY0014(String XMY0014) {
		_XMY0014 = XMY0014;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0014", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0014);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0015() {
		return _XMY0015;
	}

	@Override
	public void setXMY0015(String XMY0015) {
		_XMY0015 = XMY0015;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0015", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0015);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0016() {
		return _XMY0016;
	}

	@Override
	public void setXMY0016(String XMY0016) {
		_XMY0016 = XMY0016;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0016", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0016);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0017() {
		return _XMY0017;
	}

	@Override
	public void setXMY0017(String XMY0017) {
		_XMY0017 = XMY0017;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0017", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0017);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0018() {
		return _XMY0018;
	}

	@Override
	public void setXMY0018(String XMY0018) {
		_XMY0018 = XMY0018;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0018", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0018);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0019() {
		return _XMY0019;
	}

	@Override
	public void setXMY0019(String XMY0019) {
		_XMY0019 = XMY0019;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0019", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0019);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0020() {
		return _XMY0020;
	}

	@Override
	public void setXMY0020(String XMY0020) {
		_XMY0020 = XMY0020;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0020", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0020);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0021() {
		return _XMY0021;
	}

	@Override
	public void setXMY0021(String XMY0021) {
		_XMY0021 = XMY0021;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0021", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0021);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0022() {
		return _XMY0022;
	}

	@Override
	public void setXMY0022(String XMY0022) {
		_XMY0022 = XMY0022;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0022", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0022);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY1022() {
		return _XMY1022;
	}

	@Override
	public void setXMY1022(String XMY1022) {
		_XMY1022 = XMY1022;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY1022", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY1022);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0023() {
		return _XMY0023;
	}

	@Override
	public void setXMY0023(String XMY0023) {
		_XMY0023 = XMY0023;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0023", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0023);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0024() {
		return _XMY0024;
	}

	@Override
	public void setXMY0024(String XMY0024) {
		_XMY0024 = XMY0024;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0024", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0024);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0025() {
		return _XMY0025;
	}

	@Override
	public void setXMY0025(String XMY0025) {
		_XMY0025 = XMY0025;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0025", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0025);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0026() {
		return _XMY0026;
	}

	@Override
	public void setXMY0026(String XMY0026) {
		_XMY0026 = XMY0026;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0026", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0026);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0027() {
		return _XMY0027;
	}

	@Override
	public void setXMY0027(String XMY0027) {
		_XMY0027 = XMY0027;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0027", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0027);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0028() {
		return _XMY0028;
	}

	@Override
	public void setXMY0028(String XMY0028) {
		_XMY0028 = XMY0028;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0028", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0028);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0029() {
		return _XMY0029;
	}

	@Override
	public void setXMY0029(String XMY0029) {
		_XMY0029 = XMY0029;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0029", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0029);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0030() {
		return _XMY0030;
	}

	@Override
	public void setXMY0030(String XMY0030) {
		_XMY0030 = XMY0030;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0030", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0030);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0031() {
		return _XMY0031;
	}

	@Override
	public void setXMY0031(String XMY0031) {
		_XMY0031 = XMY0031;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0031", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0031);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0032() {
		return _XMY0032;
	}

	@Override
	public void setXMY0032(String XMY0032) {
		_XMY0032 = XMY0032;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0032", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0032);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY1032() {
		return _XMY1032;
	}

	@Override
	public void setXMY1032(String XMY1032) {
		_XMY1032 = XMY1032;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY1032", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY1032);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0033() {
		return _XMY0033;
	}

	@Override
	public void setXMY0033(String XMY0033) {
		_XMY0033 = XMY0033;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0033", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0033);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY1033() {
		return _XMY1033;
	}

	@Override
	public void setXMY1033(String XMY1033) {
		_XMY1033 = XMY1033;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY1033", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY1033);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0034() {
		return _XMY0034;
	}

	@Override
	public void setXMY0034(String XMY0034) {
		_XMY0034 = XMY0034;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0034", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0034);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0035() {
		return _XMY0035;
	}

	@Override
	public void setXMY0035(String XMY0035) {
		_XMY0035 = XMY0035;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0035", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0035);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY1035() {
		return _XMY1035;
	}

	@Override
	public void setXMY1035(String XMY1035) {
		_XMY1035 = XMY1035;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY1035", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY1035);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0036() {
		return _XMY0036;
	}

	@Override
	public void setXMY0036(String XMY0036) {
		_XMY0036 = XMY0036;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0036", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0036);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0037() {
		return _XMY0037;
	}

	@Override
	public void setXMY0037(String XMY0037) {
		_XMY0037 = XMY0037;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0037", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0037);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0038() {
		return _XMY0038;
	}

	@Override
	public void setXMY0038(String XMY0038) {
		_XMY0038 = XMY0038;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0038", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0038);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0039() {
		return _XMY0039;
	}

	@Override
	public void setXMY0039(String XMY0039) {
		_XMY0039 = XMY0039;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0039", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0039);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY1039() {
		return _XMY1039;
	}

	@Override
	public void setXMY1039(String XMY1039) {
		_XMY1039 = XMY1039;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY1039", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY1039);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0040() {
		return _XMY0040;
	}

	@Override
	public void setXMY0040(String XMY0040) {
		_XMY0040 = XMY0040;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0040", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0040);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY1040() {
		return _XMY1040;
	}

	@Override
	public void setXMY1040(String XMY1040) {
		_XMY1040 = XMY1040;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY1040", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY1040);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0041() {
		return _XMY0041;
	}

	@Override
	public void setXMY0041(String XMY0041) {
		_XMY0041 = XMY0041;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0041", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0041);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0042() {
		return _XMY0042;
	}

	@Override
	public void setXMY0042(String XMY0042) {
		_XMY0042 = XMY0042;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0042", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0042);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY1042() {
		return _XMY1042;
	}

	@Override
	public void setXMY1042(String XMY1042) {
		_XMY1042 = XMY1042;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY1042", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY1042);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0043() {
		return _XMY0043;
	}

	@Override
	public void setXMY0043(String XMY0043) {
		_XMY0043 = XMY0043;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0043", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0043);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0044() {
		return _XMY0044;
	}

	@Override
	public void setXMY0044(String XMY0044) {
		_XMY0044 = XMY0044;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0044", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0044);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0045() {
		return _XMY0045;
	}

	@Override
	public void setXMY0045(String XMY0045) {
		_XMY0045 = XMY0045;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0045", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0045);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0046() {
		return _XMY0046;
	}

	@Override
	public void setXMY0046(String XMY0046) {
		_XMY0046 = XMY0046;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0046", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0046);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0047() {
		return _XMY0047;
	}

	@Override
	public void setXMY0047(String XMY0047) {
		_XMY0047 = XMY0047;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0047", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0047);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0048() {
		return _XMY0048;
	}

	@Override
	public void setXMY0048(String XMY0048) {
		_XMY0048 = XMY0048;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0048", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0048);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0049() {
		return _XMY0049;
	}

	@Override
	public void setXMY0049(String XMY0049) {
		_XMY0049 = XMY0049;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0049", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0049);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0050() {
		return _XMY0050;
	}

	@Override
	public void setXMY0050(String XMY0050) {
		_XMY0050 = XMY0050;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0050", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0050);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY1050() {
		return _XMY1050;
	}

	@Override
	public void setXMY1050(String XMY1050) {
		_XMY1050 = XMY1050;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY1050", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY1050);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0051() {
		return _XMY0051;
	}

	@Override
	public void setXMY0051(String XMY0051) {
		_XMY0051 = XMY0051;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0051", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0051);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0052() {
		return _XMY0052;
	}

	@Override
	public void setXMY0052(String XMY0052) {
		_XMY0052 = XMY0052;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0052", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0052);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0053() {
		return _XMY0053;
	}

	@Override
	public void setXMY0053(String XMY0053) {
		_XMY0053 = XMY0053;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0053", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0053);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0054() {
		return _XMY0054;
	}

	@Override
	public void setXMY0054(String XMY0054) {
		_XMY0054 = XMY0054;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0054", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0054);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0055() {
		return _XMY0055;
	}

	@Override
	public void setXMY0055(String XMY0055) {
		_XMY0055 = XMY0055;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0055", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0055);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0056() {
		return _XMY0056;
	}

	@Override
	public void setXMY0056(String XMY0056) {
		_XMY0056 = XMY0056;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0056", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0056);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0057() {
		return _XMY0057;
	}

	@Override
	public void setXMY0057(String XMY0057) {
		_XMY0057 = XMY0057;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0057", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0057);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0058() {
		return _XMY0058;
	}

	@Override
	public void setXMY0058(String XMY0058) {
		_XMY0058 = XMY0058;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0058", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0058);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0059() {
		return _XMY0059;
	}

	@Override
	public void setXMY0059(String XMY0059) {
		_XMY0059 = XMY0059;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0059", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0059);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0060() {
		return _XMY0060;
	}

	@Override
	public void setXMY0060(String XMY0060) {
		_XMY0060 = XMY0060;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0060", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0060);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0061() {
		return _XMY0061;
	}

	@Override
	public void setXMY0061(String XMY0061) {
		_XMY0061 = XMY0061;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0061", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0061);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0062() {
		return _XMY0062;
	}

	@Override
	public void setXMY0062(String XMY0062) {
		_XMY0062 = XMY0062;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0062", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0062);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0063() {
		return _XMY0063;
	}

	@Override
	public void setXMY0063(String XMY0063) {
		_XMY0063 = XMY0063;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0063", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0063);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0064() {
		return _XMY0064;
	}

	@Override
	public void setXMY0064(String XMY0064) {
		_XMY0064 = XMY0064;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0064", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0064);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0065() {
		return _XMY0065;
	}

	@Override
	public void setXMY0065(String XMY0065) {
		_XMY0065 = XMY0065;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0065", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0065);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0066() {
		return _XMY0066;
	}

	@Override
	public void setXMY0066(String XMY0066) {
		_XMY0066 = XMY0066;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0066", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0066);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0067() {
		return _XMY0067;
	}

	@Override
	public void setXMY0067(String XMY0067) {
		_XMY0067 = XMY0067;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0067", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0067);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0068() {
		return _XMY0068;
	}

	@Override
	public void setXMY0068(String XMY0068) {
		_XMY0068 = XMY0068;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0068", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0068);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0069() {
		return _XMY0069;
	}

	@Override
	public void setXMY0069(String XMY0069) {
		_XMY0069 = XMY0069;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0069", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0069);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0082() {
		return _XMY0082;
	}

	@Override
	public void setXMY0082(String XMY0082) {
		_XMY0082 = XMY0082;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0082", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0082);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0083() {
		return _XMY0083;
	}

	@Override
	public void setXMY0083(String XMY0083) {
		_XMY0083 = XMY0083;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0083", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0083);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0084() {
		return _XMY0084;
	}

	@Override
	public void setXMY0084(String XMY0084) {
		_XMY0084 = XMY0084;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0084", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0084);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0085() {
		return _XMY0085;
	}

	@Override
	public void setXMY0085(String XMY0085) {
		_XMY0085 = XMY0085;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0085", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0085);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0086() {
		return _XMY0086;
	}

	@Override
	public void setXMY0086(String XMY0086) {
		_XMY0086 = XMY0086;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0086", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0086);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY1086() {
		return _XMY1086;
	}

	@Override
	public void setXMY1086(String XMY1086) {
		_XMY1086 = XMY1086;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY1086", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY1086);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0087() {
		return _XMY0087;
	}

	@Override
	public void setXMY0087(String XMY0087) {
		_XMY0087 = XMY0087;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0087", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0087);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY1087() {
		return _XMY1087;
	}

	@Override
	public void setXMY1087(String XMY1087) {
		_XMY1087 = XMY1087;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY1087", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY1087);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY1187() {
		return _XMY1187;
	}

	@Override
	public void setXMY1187(String XMY1187) {
		_XMY1187 = XMY1187;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY1187", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY1187);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0088() {
		return _XMY0088;
	}

	@Override
	public void setXMY0088(String XMY0088) {
		_XMY0088 = XMY0088;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0088", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0088);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY1088() {
		return _XMY1088;
	}

	@Override
	public void setXMY1088(String XMY1088) {
		_XMY1088 = XMY1088;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY1088", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY1088);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY1188() {
		return _XMY1188;
	}

	@Override
	public void setXMY1188(String XMY1188) {
		_XMY1188 = XMY1188;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY1188", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY1188);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0089() {
		return _XMY0089;
	}

	@Override
	public void setXMY0089(String XMY0089) {
		_XMY0089 = XMY0089;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0089", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0089);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY1089() {
		return _XMY1089;
	}

	@Override
	public void setXMY1089(String XMY1089) {
		_XMY1089 = XMY1089;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY1089", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY1089);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY1189() {
		return _XMY1189;
	}

	@Override
	public void setXMY1189(String XMY1189) {
		_XMY1189 = XMY1189;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY1189", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY1189);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0090() {
		return _XMY0090;
	}

	@Override
	public void setXMY0090(String XMY0090) {
		_XMY0090 = XMY0090;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0090", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0090);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0091() {
		return _XMY0091;
	}

	@Override
	public void setXMY0091(String XMY0091) {
		_XMY0091 = XMY0091;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0091", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0091);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0092() {
		return _XMY0092;
	}

	@Override
	public void setXMY0092(String XMY0092) {
		_XMY0092 = XMY0092;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0092", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0092);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0093() {
		return _XMY0093;
	}

	@Override
	public void setXMY0093(String XMY0093) {
		_XMY0093 = XMY0093;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0093", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0093);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0094() {
		return _XMY0094;
	}

	@Override
	public void setXMY0094(String XMY0094) {
		_XMY0094 = XMY0094;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0094", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0094);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0095() {
		return _XMY0095;
	}

	@Override
	public void setXMY0095(String XMY0095) {
		_XMY0095 = XMY0095;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0095", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0095);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0096() {
		return _XMY0096;
	}

	@Override
	public void setXMY0096(String XMY0096) {
		_XMY0096 = XMY0096;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0096", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0096);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0097() {
		return _XMY0097;
	}

	@Override
	public void setXMY0097(String XMY0097) {
		_XMY0097 = XMY0097;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0097", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0097);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0098() {
		return _XMY0098;
	}

	@Override
	public void setXMY0098(String XMY0098) {
		_XMY0098 = XMY0098;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0098", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0098);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0099() {
		return _XMY0099;
	}

	@Override
	public void setXMY0099(String XMY0099) {
		_XMY0099 = XMY0099;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0099", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0099);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0100() {
		return _XMY0100;
	}

	@Override
	public void setXMY0100(String XMY0100) {
		_XMY0100 = XMY0100;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0100", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0100);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0101() {
		return _XMY0101;
	}

	@Override
	public void setXMY0101(String XMY0101) {
		_XMY0101 = XMY0101;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0101", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0101);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0102() {
		return _XMY0102;
	}

	@Override
	public void setXMY0102(String XMY0102) {
		_XMY0102 = XMY0102;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0102", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0102);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0103() {
		return _XMY0103;
	}

	@Override
	public void setXMY0103(String XMY0103) {
		_XMY0103 = XMY0103;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0103", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0103);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0104() {
		return _XMY0104;
	}

	@Override
	public void setXMY0104(String XMY0104) {
		_XMY0104 = XMY0104;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0104", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0104);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0105() {
		return _XMY0105;
	}

	@Override
	public void setXMY0105(String XMY0105) {
		_XMY0105 = XMY0105;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0105", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0105);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0106() {
		return _XMY0106;
	}

	@Override
	public void setXMY0106(String XMY0106) {
		_XMY0106 = XMY0106;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0106", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0106);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY2106() {
		return _XMY2106;
	}

	@Override
	public void setXMY2106(String XMY2106) {
		_XMY2106 = XMY2106;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY2106", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY2106);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0107() {
		return _XMY0107;
	}

	@Override
	public void setXMY0107(String XMY0107) {
		_XMY0107 = XMY0107;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0107", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0107);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY2107() {
		return _XMY2107;
	}

	@Override
	public void setXMY2107(String XMY2107) {
		_XMY2107 = XMY2107;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY2107", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY2107);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0108() {
		return _XMY0108;
	}

	@Override
	public void setXMY0108(String XMY0108) {
		_XMY0108 = XMY0108;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0108", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0108);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY2108() {
		return _XMY2108;
	}

	@Override
	public void setXMY2108(String XMY2108) {
		_XMY2108 = XMY2108;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY2108", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY2108);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0109() {
		return _XMY0109;
	}

	@Override
	public void setXMY0109(String XMY0109) {
		_XMY0109 = XMY0109;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0109", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0109);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY2109() {
		return _XMY2109;
	}

	@Override
	public void setXMY2109(String XMY2109) {
		_XMY2109 = XMY2109;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY2109", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY2109);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0110() {
		return _XMY0110;
	}

	@Override
	public void setXMY0110(String XMY0110) {
		_XMY0110 = XMY0110;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0110", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0110);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY2110() {
		return _XMY2110;
	}

	@Override
	public void setXMY2110(String XMY2110) {
		_XMY2110 = XMY2110;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY2110", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY2110);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0111() {
		return _XMY0111;
	}

	@Override
	public void setXMY0111(String XMY0111) {
		_XMY0111 = XMY0111;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0111", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0111);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY2111() {
		return _XMY2111;
	}

	@Override
	public void setXMY2111(String XMY2111) {
		_XMY2111 = XMY2111;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY2111", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY2111);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0112() {
		return _XMY0112;
	}

	@Override
	public void setXMY0112(String XMY0112) {
		_XMY0112 = XMY0112;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0112", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0112);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY2112() {
		return _XMY2112;
	}

	@Override
	public void setXMY2112(String XMY2112) {
		_XMY2112 = XMY2112;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY2112", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY2112);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0113() {
		return _XMY0113;
	}

	@Override
	public void setXMY0113(String XMY0113) {
		_XMY0113 = XMY0113;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0113", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0113);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY2113() {
		return _XMY2113;
	}

	@Override
	public void setXMY2113(String XMY2113) {
		_XMY2113 = XMY2113;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY2113", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY2113);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0114() {
		return _XMY0114;
	}

	@Override
	public void setXMY0114(String XMY0114) {
		_XMY0114 = XMY0114;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0114", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0114);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY2114() {
		return _XMY2114;
	}

	@Override
	public void setXMY2114(String XMY2114) {
		_XMY2114 = XMY2114;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY2114", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY2114);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0115() {
		return _XMY0115;
	}

	@Override
	public void setXMY0115(String XMY0115) {
		_XMY0115 = XMY0115;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0115", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0115);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY2115() {
		return _XMY2115;
	}

	@Override
	public void setXMY2115(String XMY2115) {
		_XMY2115 = XMY2115;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY2115", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY2115);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0116() {
		return _XMY0116;
	}

	@Override
	public void setXMY0116(String XMY0116) {
		_XMY0116 = XMY0116;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0116", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0116);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY2116() {
		return _XMY2116;
	}

	@Override
	public void setXMY2116(String XMY2116) {
		_XMY2116 = XMY2116;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY2116", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY2116);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0117() {
		return _XMY0117;
	}

	@Override
	public void setXMY0117(String XMY0117) {
		_XMY0117 = XMY0117;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0117", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0117);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY2117() {
		return _XMY2117;
	}

	@Override
	public void setXMY2117(String XMY2117) {
		_XMY2117 = XMY2117;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY2117", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY2117);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0118() {
		return _XMY0118;
	}

	@Override
	public void setXMY0118(String XMY0118) {
		_XMY0118 = XMY0118;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0118", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0118);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY2118() {
		return _XMY2118;
	}

	@Override
	public void setXMY2118(String XMY2118) {
		_XMY2118 = XMY2118;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY2118", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY2118);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0119() {
		return _XMY0119;
	}

	@Override
	public void setXMY0119(String XMY0119) {
		_XMY0119 = XMY0119;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0119", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0119);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY2119() {
		return _XMY2119;
	}

	@Override
	public void setXMY2119(String XMY2119) {
		_XMY2119 = XMY2119;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY2119", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY2119);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0120() {
		return _XMY0120;
	}

	@Override
	public void setXMY0120(String XMY0120) {
		_XMY0120 = XMY0120;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0120", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0120);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0121() {
		return _XMY0121;
	}

	@Override
	public void setXMY0121(String XMY0121) {
		_XMY0121 = XMY0121;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0121", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0121);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY2121() {
		return _XMY2121;
	}

	@Override
	public void setXMY2121(String XMY2121) {
		_XMY2121 = XMY2121;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY2121", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY2121);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0122() {
		return _XMY0122;
	}

	@Override
	public void setXMY0122(String XMY0122) {
		_XMY0122 = XMY0122;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0122", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0122);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY0198() {
		return _XMY0198;
	}

	@Override
	public void setXMY0198(String XMY0198) {
		_XMY0198 = XMY0198;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY0198", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY0198);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXMY1098() {
		return _XMY1098;
	}

	@Override
	public void setXMY1098(String XMY1098) {
		_XMY1098 = XMY1098;

		if (_thongsochungchixemayRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixemayRemoteModel.getClass();

				Method method = clazz.getMethod("setXMY1098", String.class);

				method.invoke(_thongsochungchixemayRemoteModel, XMY1098);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTHONGSOCHUNGCHIXEMAYRemoteModel() {
		return _thongsochungchixemayRemoteModel;
	}

	public void setTHONGSOCHUNGCHIXEMAYRemoteModel(
		BaseModel<?> thongsochungchixemayRemoteModel) {
		_thongsochungchixemayRemoteModel = thongsochungchixemayRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _thongsochungchixemayRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_thongsochungchixemayRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			THONGSOCHUNGCHIXEMAYLocalServiceUtil.addTHONGSOCHUNGCHIXEMAY(this);
		}
		else {
			THONGSOCHUNGCHIXEMAYLocalServiceUtil.updateTHONGSOCHUNGCHIXEMAY(this);
		}
	}

	@Override
	public THONGSOCHUNGCHIXEMAY toEscapedModel() {
		return (THONGSOCHUNGCHIXEMAY)ProxyUtil.newProxyInstance(THONGSOCHUNGCHIXEMAY.class.getClassLoader(),
			new Class[] { THONGSOCHUNGCHIXEMAY.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		THONGSOCHUNGCHIXEMAYClp clone = new THONGSOCHUNGCHIXEMAYClp();

		clone.setId(getId());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setCertificateRecordId(getCertificateRecordId());
		clone.setVehicleGroupId(getVehicleGroupId());
		clone.setSynchDate(getSynchDate());
		clone.setXMY0009(getXMY0009());
		clone.setXMY0010(getXMY0010());
		clone.setXMY0011(getXMY0011());
		clone.setXMY0012(getXMY0012());
		clone.setXMY0013(getXMY0013());
		clone.setXMY0014(getXMY0014());
		clone.setXMY0015(getXMY0015());
		clone.setXMY0016(getXMY0016());
		clone.setXMY0017(getXMY0017());
		clone.setXMY0018(getXMY0018());
		clone.setXMY0019(getXMY0019());
		clone.setXMY0020(getXMY0020());
		clone.setXMY0021(getXMY0021());
		clone.setXMY0022(getXMY0022());
		clone.setXMY1022(getXMY1022());
		clone.setXMY0023(getXMY0023());
		clone.setXMY0024(getXMY0024());
		clone.setXMY0025(getXMY0025());
		clone.setXMY0026(getXMY0026());
		clone.setXMY0027(getXMY0027());
		clone.setXMY0028(getXMY0028());
		clone.setXMY0029(getXMY0029());
		clone.setXMY0030(getXMY0030());
		clone.setXMY0031(getXMY0031());
		clone.setXMY0032(getXMY0032());
		clone.setXMY1032(getXMY1032());
		clone.setXMY0033(getXMY0033());
		clone.setXMY1033(getXMY1033());
		clone.setXMY0034(getXMY0034());
		clone.setXMY0035(getXMY0035());
		clone.setXMY1035(getXMY1035());
		clone.setXMY0036(getXMY0036());
		clone.setXMY0037(getXMY0037());
		clone.setXMY0038(getXMY0038());
		clone.setXMY0039(getXMY0039());
		clone.setXMY1039(getXMY1039());
		clone.setXMY0040(getXMY0040());
		clone.setXMY1040(getXMY1040());
		clone.setXMY0041(getXMY0041());
		clone.setXMY0042(getXMY0042());
		clone.setXMY1042(getXMY1042());
		clone.setXMY0043(getXMY0043());
		clone.setXMY0044(getXMY0044());
		clone.setXMY0045(getXMY0045());
		clone.setXMY0046(getXMY0046());
		clone.setXMY0047(getXMY0047());
		clone.setXMY0048(getXMY0048());
		clone.setXMY0049(getXMY0049());
		clone.setXMY0050(getXMY0050());
		clone.setXMY1050(getXMY1050());
		clone.setXMY0051(getXMY0051());
		clone.setXMY0052(getXMY0052());
		clone.setXMY0053(getXMY0053());
		clone.setXMY0054(getXMY0054());
		clone.setXMY0055(getXMY0055());
		clone.setXMY0056(getXMY0056());
		clone.setXMY0057(getXMY0057());
		clone.setXMY0058(getXMY0058());
		clone.setXMY0059(getXMY0059());
		clone.setXMY0060(getXMY0060());
		clone.setXMY0061(getXMY0061());
		clone.setXMY0062(getXMY0062());
		clone.setXMY0063(getXMY0063());
		clone.setXMY0064(getXMY0064());
		clone.setXMY0065(getXMY0065());
		clone.setXMY0066(getXMY0066());
		clone.setXMY0067(getXMY0067());
		clone.setXMY0068(getXMY0068());
		clone.setXMY0069(getXMY0069());
		clone.setXMY0082(getXMY0082());
		clone.setXMY0083(getXMY0083());
		clone.setXMY0084(getXMY0084());
		clone.setXMY0085(getXMY0085());
		clone.setXMY0086(getXMY0086());
		clone.setXMY1086(getXMY1086());
		clone.setXMY0087(getXMY0087());
		clone.setXMY1087(getXMY1087());
		clone.setXMY1187(getXMY1187());
		clone.setXMY0088(getXMY0088());
		clone.setXMY1088(getXMY1088());
		clone.setXMY1188(getXMY1188());
		clone.setXMY0089(getXMY0089());
		clone.setXMY1089(getXMY1089());
		clone.setXMY1189(getXMY1189());
		clone.setXMY0090(getXMY0090());
		clone.setXMY0091(getXMY0091());
		clone.setXMY0092(getXMY0092());
		clone.setXMY0093(getXMY0093());
		clone.setXMY0094(getXMY0094());
		clone.setXMY0095(getXMY0095());
		clone.setXMY0096(getXMY0096());
		clone.setXMY0097(getXMY0097());
		clone.setXMY0098(getXMY0098());
		clone.setXMY0099(getXMY0099());
		clone.setXMY0100(getXMY0100());
		clone.setXMY0101(getXMY0101());
		clone.setXMY0102(getXMY0102());
		clone.setXMY0103(getXMY0103());
		clone.setXMY0104(getXMY0104());
		clone.setXMY0105(getXMY0105());
		clone.setXMY0106(getXMY0106());
		clone.setXMY2106(getXMY2106());
		clone.setXMY0107(getXMY0107());
		clone.setXMY2107(getXMY2107());
		clone.setXMY0108(getXMY0108());
		clone.setXMY2108(getXMY2108());
		clone.setXMY0109(getXMY0109());
		clone.setXMY2109(getXMY2109());
		clone.setXMY0110(getXMY0110());
		clone.setXMY2110(getXMY2110());
		clone.setXMY0111(getXMY0111());
		clone.setXMY2111(getXMY2111());
		clone.setXMY0112(getXMY0112());
		clone.setXMY2112(getXMY2112());
		clone.setXMY0113(getXMY0113());
		clone.setXMY2113(getXMY2113());
		clone.setXMY0114(getXMY0114());
		clone.setXMY2114(getXMY2114());
		clone.setXMY0115(getXMY0115());
		clone.setXMY2115(getXMY2115());
		clone.setXMY0116(getXMY0116());
		clone.setXMY2116(getXMY2116());
		clone.setXMY0117(getXMY0117());
		clone.setXMY2117(getXMY2117());
		clone.setXMY0118(getXMY0118());
		clone.setXMY2118(getXMY2118());
		clone.setXMY0119(getXMY0119());
		clone.setXMY2119(getXMY2119());
		clone.setXMY0120(getXMY0120());
		clone.setXMY0121(getXMY0121());
		clone.setXMY2121(getXMY2121());
		clone.setXMY0122(getXMY0122());
		clone.setXMY0198(getXMY0198());
		clone.setXMY1098(getXMY1098());

		return clone;
	}

	@Override
	public int compareTo(THONGSOCHUNGCHIXEMAY thongsochungchixemay) {
		int value = 0;

		if (getId() < thongsochungchixemay.getId()) {
			value = -1;
		}
		else if (getId() > thongsochungchixemay.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof THONGSOCHUNGCHIXEMAYClp)) {
			return false;
		}

		THONGSOCHUNGCHIXEMAYClp thongsochungchixemay = (THONGSOCHUNGCHIXEMAYClp)obj;

		long primaryKey = thongsochungchixemay.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(279);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", certificateRecordId=");
		sb.append(getCertificateRecordId());
		sb.append(", vehicleGroupId=");
		sb.append(getVehicleGroupId());
		sb.append(", SynchDate=");
		sb.append(getSynchDate());
		sb.append(", XMY0009=");
		sb.append(getXMY0009());
		sb.append(", XMY0010=");
		sb.append(getXMY0010());
		sb.append(", XMY0011=");
		sb.append(getXMY0011());
		sb.append(", XMY0012=");
		sb.append(getXMY0012());
		sb.append(", XMY0013=");
		sb.append(getXMY0013());
		sb.append(", XMY0014=");
		sb.append(getXMY0014());
		sb.append(", XMY0015=");
		sb.append(getXMY0015());
		sb.append(", XMY0016=");
		sb.append(getXMY0016());
		sb.append(", XMY0017=");
		sb.append(getXMY0017());
		sb.append(", XMY0018=");
		sb.append(getXMY0018());
		sb.append(", XMY0019=");
		sb.append(getXMY0019());
		sb.append(", XMY0020=");
		sb.append(getXMY0020());
		sb.append(", XMY0021=");
		sb.append(getXMY0021());
		sb.append(", XMY0022=");
		sb.append(getXMY0022());
		sb.append(", XMY1022=");
		sb.append(getXMY1022());
		sb.append(", XMY0023=");
		sb.append(getXMY0023());
		sb.append(", XMY0024=");
		sb.append(getXMY0024());
		sb.append(", XMY0025=");
		sb.append(getXMY0025());
		sb.append(", XMY0026=");
		sb.append(getXMY0026());
		sb.append(", XMY0027=");
		sb.append(getXMY0027());
		sb.append(", XMY0028=");
		sb.append(getXMY0028());
		sb.append(", XMY0029=");
		sb.append(getXMY0029());
		sb.append(", XMY0030=");
		sb.append(getXMY0030());
		sb.append(", XMY0031=");
		sb.append(getXMY0031());
		sb.append(", XMY0032=");
		sb.append(getXMY0032());
		sb.append(", XMY1032=");
		sb.append(getXMY1032());
		sb.append(", XMY0033=");
		sb.append(getXMY0033());
		sb.append(", XMY1033=");
		sb.append(getXMY1033());
		sb.append(", XMY0034=");
		sb.append(getXMY0034());
		sb.append(", XMY0035=");
		sb.append(getXMY0035());
		sb.append(", XMY1035=");
		sb.append(getXMY1035());
		sb.append(", XMY0036=");
		sb.append(getXMY0036());
		sb.append(", XMY0037=");
		sb.append(getXMY0037());
		sb.append(", XMY0038=");
		sb.append(getXMY0038());
		sb.append(", XMY0039=");
		sb.append(getXMY0039());
		sb.append(", XMY1039=");
		sb.append(getXMY1039());
		sb.append(", XMY0040=");
		sb.append(getXMY0040());
		sb.append(", XMY1040=");
		sb.append(getXMY1040());
		sb.append(", XMY0041=");
		sb.append(getXMY0041());
		sb.append(", XMY0042=");
		sb.append(getXMY0042());
		sb.append(", XMY1042=");
		sb.append(getXMY1042());
		sb.append(", XMY0043=");
		sb.append(getXMY0043());
		sb.append(", XMY0044=");
		sb.append(getXMY0044());
		sb.append(", XMY0045=");
		sb.append(getXMY0045());
		sb.append(", XMY0046=");
		sb.append(getXMY0046());
		sb.append(", XMY0047=");
		sb.append(getXMY0047());
		sb.append(", XMY0048=");
		sb.append(getXMY0048());
		sb.append(", XMY0049=");
		sb.append(getXMY0049());
		sb.append(", XMY0050=");
		sb.append(getXMY0050());
		sb.append(", XMY1050=");
		sb.append(getXMY1050());
		sb.append(", XMY0051=");
		sb.append(getXMY0051());
		sb.append(", XMY0052=");
		sb.append(getXMY0052());
		sb.append(", XMY0053=");
		sb.append(getXMY0053());
		sb.append(", XMY0054=");
		sb.append(getXMY0054());
		sb.append(", XMY0055=");
		sb.append(getXMY0055());
		sb.append(", XMY0056=");
		sb.append(getXMY0056());
		sb.append(", XMY0057=");
		sb.append(getXMY0057());
		sb.append(", XMY0058=");
		sb.append(getXMY0058());
		sb.append(", XMY0059=");
		sb.append(getXMY0059());
		sb.append(", XMY0060=");
		sb.append(getXMY0060());
		sb.append(", XMY0061=");
		sb.append(getXMY0061());
		sb.append(", XMY0062=");
		sb.append(getXMY0062());
		sb.append(", XMY0063=");
		sb.append(getXMY0063());
		sb.append(", XMY0064=");
		sb.append(getXMY0064());
		sb.append(", XMY0065=");
		sb.append(getXMY0065());
		sb.append(", XMY0066=");
		sb.append(getXMY0066());
		sb.append(", XMY0067=");
		sb.append(getXMY0067());
		sb.append(", XMY0068=");
		sb.append(getXMY0068());
		sb.append(", XMY0069=");
		sb.append(getXMY0069());
		sb.append(", XMY0082=");
		sb.append(getXMY0082());
		sb.append(", XMY0083=");
		sb.append(getXMY0083());
		sb.append(", XMY0084=");
		sb.append(getXMY0084());
		sb.append(", XMY0085=");
		sb.append(getXMY0085());
		sb.append(", XMY0086=");
		sb.append(getXMY0086());
		sb.append(", XMY1086=");
		sb.append(getXMY1086());
		sb.append(", XMY0087=");
		sb.append(getXMY0087());
		sb.append(", XMY1087=");
		sb.append(getXMY1087());
		sb.append(", XMY1187=");
		sb.append(getXMY1187());
		sb.append(", XMY0088=");
		sb.append(getXMY0088());
		sb.append(", XMY1088=");
		sb.append(getXMY1088());
		sb.append(", XMY1188=");
		sb.append(getXMY1188());
		sb.append(", XMY0089=");
		sb.append(getXMY0089());
		sb.append(", XMY1089=");
		sb.append(getXMY1089());
		sb.append(", XMY1189=");
		sb.append(getXMY1189());
		sb.append(", XMY0090=");
		sb.append(getXMY0090());
		sb.append(", XMY0091=");
		sb.append(getXMY0091());
		sb.append(", XMY0092=");
		sb.append(getXMY0092());
		sb.append(", XMY0093=");
		sb.append(getXMY0093());
		sb.append(", XMY0094=");
		sb.append(getXMY0094());
		sb.append(", XMY0095=");
		sb.append(getXMY0095());
		sb.append(", XMY0096=");
		sb.append(getXMY0096());
		sb.append(", XMY0097=");
		sb.append(getXMY0097());
		sb.append(", XMY0098=");
		sb.append(getXMY0098());
		sb.append(", XMY0099=");
		sb.append(getXMY0099());
		sb.append(", XMY0100=");
		sb.append(getXMY0100());
		sb.append(", XMY0101=");
		sb.append(getXMY0101());
		sb.append(", XMY0102=");
		sb.append(getXMY0102());
		sb.append(", XMY0103=");
		sb.append(getXMY0103());
		sb.append(", XMY0104=");
		sb.append(getXMY0104());
		sb.append(", XMY0105=");
		sb.append(getXMY0105());
		sb.append(", XMY0106=");
		sb.append(getXMY0106());
		sb.append(", XMY2106=");
		sb.append(getXMY2106());
		sb.append(", XMY0107=");
		sb.append(getXMY0107());
		sb.append(", XMY2107=");
		sb.append(getXMY2107());
		sb.append(", XMY0108=");
		sb.append(getXMY0108());
		sb.append(", XMY2108=");
		sb.append(getXMY2108());
		sb.append(", XMY0109=");
		sb.append(getXMY0109());
		sb.append(", XMY2109=");
		sb.append(getXMY2109());
		sb.append(", XMY0110=");
		sb.append(getXMY0110());
		sb.append(", XMY2110=");
		sb.append(getXMY2110());
		sb.append(", XMY0111=");
		sb.append(getXMY0111());
		sb.append(", XMY2111=");
		sb.append(getXMY2111());
		sb.append(", XMY0112=");
		sb.append(getXMY0112());
		sb.append(", XMY2112=");
		sb.append(getXMY2112());
		sb.append(", XMY0113=");
		sb.append(getXMY0113());
		sb.append(", XMY2113=");
		sb.append(getXMY2113());
		sb.append(", XMY0114=");
		sb.append(getXMY0114());
		sb.append(", XMY2114=");
		sb.append(getXMY2114());
		sb.append(", XMY0115=");
		sb.append(getXMY0115());
		sb.append(", XMY2115=");
		sb.append(getXMY2115());
		sb.append(", XMY0116=");
		sb.append(getXMY0116());
		sb.append(", XMY2116=");
		sb.append(getXMY2116());
		sb.append(", XMY0117=");
		sb.append(getXMY0117());
		sb.append(", XMY2117=");
		sb.append(getXMY2117());
		sb.append(", XMY0118=");
		sb.append(getXMY0118());
		sb.append(", XMY2118=");
		sb.append(getXMY2118());
		sb.append(", XMY0119=");
		sb.append(getXMY0119());
		sb.append(", XMY2119=");
		sb.append(getXMY2119());
		sb.append(", XMY0120=");
		sb.append(getXMY0120());
		sb.append(", XMY0121=");
		sb.append(getXMY0121());
		sb.append(", XMY2121=");
		sb.append(getXMY2121());
		sb.append(", XMY0122=");
		sb.append(getXMY0122());
		sb.append(", XMY0198=");
		sb.append(getXMY0198());
		sb.append(", XMY1098=");
		sb.append(getXMY1098());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(421);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateRecordId</column-name><column-value><![CDATA[");
		sb.append(getCertificateRecordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleGroupId</column-name><column-value><![CDATA[");
		sb.append(getVehicleGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SynchDate</column-name><column-value><![CDATA[");
		sb.append(getSynchDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0009</column-name><column-value><![CDATA[");
		sb.append(getXMY0009());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0010</column-name><column-value><![CDATA[");
		sb.append(getXMY0010());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0011</column-name><column-value><![CDATA[");
		sb.append(getXMY0011());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0012</column-name><column-value><![CDATA[");
		sb.append(getXMY0012());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0013</column-name><column-value><![CDATA[");
		sb.append(getXMY0013());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0014</column-name><column-value><![CDATA[");
		sb.append(getXMY0014());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0015</column-name><column-value><![CDATA[");
		sb.append(getXMY0015());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0016</column-name><column-value><![CDATA[");
		sb.append(getXMY0016());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0017</column-name><column-value><![CDATA[");
		sb.append(getXMY0017());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0018</column-name><column-value><![CDATA[");
		sb.append(getXMY0018());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0019</column-name><column-value><![CDATA[");
		sb.append(getXMY0019());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0020</column-name><column-value><![CDATA[");
		sb.append(getXMY0020());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0021</column-name><column-value><![CDATA[");
		sb.append(getXMY0021());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0022</column-name><column-value><![CDATA[");
		sb.append(getXMY0022());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY1022</column-name><column-value><![CDATA[");
		sb.append(getXMY1022());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0023</column-name><column-value><![CDATA[");
		sb.append(getXMY0023());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0024</column-name><column-value><![CDATA[");
		sb.append(getXMY0024());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0025</column-name><column-value><![CDATA[");
		sb.append(getXMY0025());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0026</column-name><column-value><![CDATA[");
		sb.append(getXMY0026());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0027</column-name><column-value><![CDATA[");
		sb.append(getXMY0027());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0028</column-name><column-value><![CDATA[");
		sb.append(getXMY0028());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0029</column-name><column-value><![CDATA[");
		sb.append(getXMY0029());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0030</column-name><column-value><![CDATA[");
		sb.append(getXMY0030());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0031</column-name><column-value><![CDATA[");
		sb.append(getXMY0031());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0032</column-name><column-value><![CDATA[");
		sb.append(getXMY0032());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY1032</column-name><column-value><![CDATA[");
		sb.append(getXMY1032());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0033</column-name><column-value><![CDATA[");
		sb.append(getXMY0033());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY1033</column-name><column-value><![CDATA[");
		sb.append(getXMY1033());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0034</column-name><column-value><![CDATA[");
		sb.append(getXMY0034());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0035</column-name><column-value><![CDATA[");
		sb.append(getXMY0035());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY1035</column-name><column-value><![CDATA[");
		sb.append(getXMY1035());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0036</column-name><column-value><![CDATA[");
		sb.append(getXMY0036());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0037</column-name><column-value><![CDATA[");
		sb.append(getXMY0037());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0038</column-name><column-value><![CDATA[");
		sb.append(getXMY0038());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0039</column-name><column-value><![CDATA[");
		sb.append(getXMY0039());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY1039</column-name><column-value><![CDATA[");
		sb.append(getXMY1039());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0040</column-name><column-value><![CDATA[");
		sb.append(getXMY0040());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY1040</column-name><column-value><![CDATA[");
		sb.append(getXMY1040());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0041</column-name><column-value><![CDATA[");
		sb.append(getXMY0041());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0042</column-name><column-value><![CDATA[");
		sb.append(getXMY0042());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY1042</column-name><column-value><![CDATA[");
		sb.append(getXMY1042());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0043</column-name><column-value><![CDATA[");
		sb.append(getXMY0043());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0044</column-name><column-value><![CDATA[");
		sb.append(getXMY0044());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0045</column-name><column-value><![CDATA[");
		sb.append(getXMY0045());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0046</column-name><column-value><![CDATA[");
		sb.append(getXMY0046());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0047</column-name><column-value><![CDATA[");
		sb.append(getXMY0047());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0048</column-name><column-value><![CDATA[");
		sb.append(getXMY0048());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0049</column-name><column-value><![CDATA[");
		sb.append(getXMY0049());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0050</column-name><column-value><![CDATA[");
		sb.append(getXMY0050());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY1050</column-name><column-value><![CDATA[");
		sb.append(getXMY1050());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0051</column-name><column-value><![CDATA[");
		sb.append(getXMY0051());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0052</column-name><column-value><![CDATA[");
		sb.append(getXMY0052());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0053</column-name><column-value><![CDATA[");
		sb.append(getXMY0053());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0054</column-name><column-value><![CDATA[");
		sb.append(getXMY0054());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0055</column-name><column-value><![CDATA[");
		sb.append(getXMY0055());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0056</column-name><column-value><![CDATA[");
		sb.append(getXMY0056());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0057</column-name><column-value><![CDATA[");
		sb.append(getXMY0057());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0058</column-name><column-value><![CDATA[");
		sb.append(getXMY0058());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0059</column-name><column-value><![CDATA[");
		sb.append(getXMY0059());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0060</column-name><column-value><![CDATA[");
		sb.append(getXMY0060());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0061</column-name><column-value><![CDATA[");
		sb.append(getXMY0061());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0062</column-name><column-value><![CDATA[");
		sb.append(getXMY0062());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0063</column-name><column-value><![CDATA[");
		sb.append(getXMY0063());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0064</column-name><column-value><![CDATA[");
		sb.append(getXMY0064());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0065</column-name><column-value><![CDATA[");
		sb.append(getXMY0065());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0066</column-name><column-value><![CDATA[");
		sb.append(getXMY0066());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0067</column-name><column-value><![CDATA[");
		sb.append(getXMY0067());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0068</column-name><column-value><![CDATA[");
		sb.append(getXMY0068());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0069</column-name><column-value><![CDATA[");
		sb.append(getXMY0069());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0082</column-name><column-value><![CDATA[");
		sb.append(getXMY0082());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0083</column-name><column-value><![CDATA[");
		sb.append(getXMY0083());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0084</column-name><column-value><![CDATA[");
		sb.append(getXMY0084());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0085</column-name><column-value><![CDATA[");
		sb.append(getXMY0085());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0086</column-name><column-value><![CDATA[");
		sb.append(getXMY0086());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY1086</column-name><column-value><![CDATA[");
		sb.append(getXMY1086());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0087</column-name><column-value><![CDATA[");
		sb.append(getXMY0087());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY1087</column-name><column-value><![CDATA[");
		sb.append(getXMY1087());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY1187</column-name><column-value><![CDATA[");
		sb.append(getXMY1187());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0088</column-name><column-value><![CDATA[");
		sb.append(getXMY0088());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY1088</column-name><column-value><![CDATA[");
		sb.append(getXMY1088());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY1188</column-name><column-value><![CDATA[");
		sb.append(getXMY1188());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0089</column-name><column-value><![CDATA[");
		sb.append(getXMY0089());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY1089</column-name><column-value><![CDATA[");
		sb.append(getXMY1089());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY1189</column-name><column-value><![CDATA[");
		sb.append(getXMY1189());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0090</column-name><column-value><![CDATA[");
		sb.append(getXMY0090());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0091</column-name><column-value><![CDATA[");
		sb.append(getXMY0091());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0092</column-name><column-value><![CDATA[");
		sb.append(getXMY0092());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0093</column-name><column-value><![CDATA[");
		sb.append(getXMY0093());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0094</column-name><column-value><![CDATA[");
		sb.append(getXMY0094());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0095</column-name><column-value><![CDATA[");
		sb.append(getXMY0095());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0096</column-name><column-value><![CDATA[");
		sb.append(getXMY0096());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0097</column-name><column-value><![CDATA[");
		sb.append(getXMY0097());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0098</column-name><column-value><![CDATA[");
		sb.append(getXMY0098());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0099</column-name><column-value><![CDATA[");
		sb.append(getXMY0099());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0100</column-name><column-value><![CDATA[");
		sb.append(getXMY0100());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0101</column-name><column-value><![CDATA[");
		sb.append(getXMY0101());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0102</column-name><column-value><![CDATA[");
		sb.append(getXMY0102());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0103</column-name><column-value><![CDATA[");
		sb.append(getXMY0103());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0104</column-name><column-value><![CDATA[");
		sb.append(getXMY0104());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0105</column-name><column-value><![CDATA[");
		sb.append(getXMY0105());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0106</column-name><column-value><![CDATA[");
		sb.append(getXMY0106());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY2106</column-name><column-value><![CDATA[");
		sb.append(getXMY2106());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0107</column-name><column-value><![CDATA[");
		sb.append(getXMY0107());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY2107</column-name><column-value><![CDATA[");
		sb.append(getXMY2107());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0108</column-name><column-value><![CDATA[");
		sb.append(getXMY0108());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY2108</column-name><column-value><![CDATA[");
		sb.append(getXMY2108());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0109</column-name><column-value><![CDATA[");
		sb.append(getXMY0109());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY2109</column-name><column-value><![CDATA[");
		sb.append(getXMY2109());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0110</column-name><column-value><![CDATA[");
		sb.append(getXMY0110());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY2110</column-name><column-value><![CDATA[");
		sb.append(getXMY2110());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0111</column-name><column-value><![CDATA[");
		sb.append(getXMY0111());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY2111</column-name><column-value><![CDATA[");
		sb.append(getXMY2111());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0112</column-name><column-value><![CDATA[");
		sb.append(getXMY0112());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY2112</column-name><column-value><![CDATA[");
		sb.append(getXMY2112());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0113</column-name><column-value><![CDATA[");
		sb.append(getXMY0113());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY2113</column-name><column-value><![CDATA[");
		sb.append(getXMY2113());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0114</column-name><column-value><![CDATA[");
		sb.append(getXMY0114());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY2114</column-name><column-value><![CDATA[");
		sb.append(getXMY2114());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0115</column-name><column-value><![CDATA[");
		sb.append(getXMY0115());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY2115</column-name><column-value><![CDATA[");
		sb.append(getXMY2115());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0116</column-name><column-value><![CDATA[");
		sb.append(getXMY0116());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY2116</column-name><column-value><![CDATA[");
		sb.append(getXMY2116());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0117</column-name><column-value><![CDATA[");
		sb.append(getXMY0117());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY2117</column-name><column-value><![CDATA[");
		sb.append(getXMY2117());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0118</column-name><column-value><![CDATA[");
		sb.append(getXMY0118());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY2118</column-name><column-value><![CDATA[");
		sb.append(getXMY2118());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0119</column-name><column-value><![CDATA[");
		sb.append(getXMY0119());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY2119</column-name><column-value><![CDATA[");
		sb.append(getXMY2119());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0120</column-name><column-value><![CDATA[");
		sb.append(getXMY0120());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0121</column-name><column-value><![CDATA[");
		sb.append(getXMY0121());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY2121</column-name><column-value><![CDATA[");
		sb.append(getXMY2121());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0122</column-name><column-value><![CDATA[");
		sb.append(getXMY0122());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY0198</column-name><column-value><![CDATA[");
		sb.append(getXMY0198());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XMY1098</column-name><column-value><![CDATA[");
		sb.append(getXMY1098());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _hoSoThuTucId;
	private long _certificateRecordId;
	private long _vehicleGroupId;
	private Date _SynchDate;
	private String _XMY0009;
	private String _XMY0010;
	private String _XMY0011;
	private String _XMY0012;
	private String _XMY0013;
	private String _XMY0014;
	private String _XMY0015;
	private String _XMY0016;
	private String _XMY0017;
	private String _XMY0018;
	private String _XMY0019;
	private String _XMY0020;
	private String _XMY0021;
	private String _XMY0022;
	private String _XMY1022;
	private String _XMY0023;
	private String _XMY0024;
	private String _XMY0025;
	private String _XMY0026;
	private String _XMY0027;
	private String _XMY0028;
	private String _XMY0029;
	private String _XMY0030;
	private String _XMY0031;
	private String _XMY0032;
	private String _XMY1032;
	private String _XMY0033;
	private String _XMY1033;
	private String _XMY0034;
	private String _XMY0035;
	private String _XMY1035;
	private String _XMY0036;
	private String _XMY0037;
	private String _XMY0038;
	private String _XMY0039;
	private String _XMY1039;
	private String _XMY0040;
	private String _XMY1040;
	private String _XMY0041;
	private String _XMY0042;
	private String _XMY1042;
	private String _XMY0043;
	private String _XMY0044;
	private String _XMY0045;
	private String _XMY0046;
	private String _XMY0047;
	private String _XMY0048;
	private String _XMY0049;
	private String _XMY0050;
	private String _XMY1050;
	private String _XMY0051;
	private String _XMY0052;
	private String _XMY0053;
	private String _XMY0054;
	private String _XMY0055;
	private String _XMY0056;
	private String _XMY0057;
	private String _XMY0058;
	private String _XMY0059;
	private String _XMY0060;
	private String _XMY0061;
	private String _XMY0062;
	private String _XMY0063;
	private String _XMY0064;
	private String _XMY0065;
	private String _XMY0066;
	private String _XMY0067;
	private String _XMY0068;
	private String _XMY0069;
	private String _XMY0082;
	private String _XMY0083;
	private String _XMY0084;
	private String _XMY0085;
	private String _XMY0086;
	private String _XMY1086;
	private String _XMY0087;
	private String _XMY1087;
	private String _XMY1187;
	private String _XMY0088;
	private String _XMY1088;
	private String _XMY1188;
	private String _XMY0089;
	private String _XMY1089;
	private String _XMY1189;
	private String _XMY0090;
	private String _XMY0091;
	private String _XMY0092;
	private String _XMY0093;
	private String _XMY0094;
	private String _XMY0095;
	private String _XMY0096;
	private String _XMY0097;
	private String _XMY0098;
	private String _XMY0099;
	private String _XMY0100;
	private String _XMY0101;
	private String _XMY0102;
	private String _XMY0103;
	private String _XMY0104;
	private String _XMY0105;
	private String _XMY0106;
	private String _XMY2106;
	private String _XMY0107;
	private String _XMY2107;
	private String _XMY0108;
	private String _XMY2108;
	private String _XMY0109;
	private String _XMY2109;
	private String _XMY0110;
	private String _XMY2110;
	private String _XMY0111;
	private String _XMY2111;
	private String _XMY0112;
	private String _XMY2112;
	private String _XMY0113;
	private String _XMY2113;
	private String _XMY0114;
	private String _XMY2114;
	private String _XMY0115;
	private String _XMY2115;
	private String _XMY0116;
	private String _XMY2116;
	private String _XMY0117;
	private String _XMY2117;
	private String _XMY0118;
	private String _XMY2118;
	private String _XMY0119;
	private String _XMY2119;
	private String _XMY0120;
	private String _XMY0121;
	private String _XMY2121;
	private String _XMY0122;
	private String _XMY0198;
	private String _XMY1098;
	private BaseModel<?> _thongsochungchixemayRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.class;
}