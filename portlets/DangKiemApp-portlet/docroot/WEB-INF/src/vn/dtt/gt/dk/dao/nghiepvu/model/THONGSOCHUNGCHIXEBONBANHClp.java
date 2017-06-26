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
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEBONBANHLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class THONGSOCHUNGCHIXEBONBANHClp extends BaseModelImpl<THONGSOCHUNGCHIXEBONBANH>
	implements THONGSOCHUNGCHIXEBONBANH {
	public THONGSOCHUNGCHIXEBONBANHClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return THONGSOCHUNGCHIXEBONBANH.class;
	}

	@Override
	public String getModelClassName() {
		return THONGSOCHUNGCHIXEBONBANH.class.getName();
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
		attributes.put("XBB0009", getXBB0009());
		attributes.put("XBB0010", getXBB0010());
		attributes.put("XBB0011", getXBB0011());
		attributes.put("XBB0012", getXBB0012());
		attributes.put("XBB0013", getXBB0013());
		attributes.put("XBB0014", getXBB0014());
		attributes.put("XBB1014", getXBB1014());
		attributes.put("XBB1114", getXBB1114());
		attributes.put("XBB0015", getXBB0015());
		attributes.put("XBB1015", getXBB1015());
		attributes.put("XBB1115", getXBB1115());
		attributes.put("XBB0016", getXBB0016());
		attributes.put("XBB1016", getXBB1016());
		attributes.put("XBB1116", getXBB1116());
		attributes.put("XBB0017", getXBB0017());
		attributes.put("XBB1017", getXBB1017());
		attributes.put("XBB1117", getXBB1117());
		attributes.put("XBB0018", getXBB0018());
		attributes.put("XBB0019", getXBB0019());
		attributes.put("XBB0020", getXBB0020());
		attributes.put("XBB0021", getXBB0021());
		attributes.put("XBB0022", getXBB0022());
		attributes.put("XBB1022", getXBB1022());
		attributes.put("XBB0023", getXBB0023());
		attributes.put("XBB0024", getXBB0024());
		attributes.put("XBB0025", getXBB0025());
		attributes.put("XBB0026", getXBB0026());
		attributes.put("XBB1026", getXBB1026());
		attributes.put("XBB0027", getXBB0027());
		attributes.put("XBB1027", getXBB1027());
		attributes.put("XBB0028", getXBB0028());
		attributes.put("XBB0029", getXBB0029());
		attributes.put("XBB1029", getXBB1029());
		attributes.put("XBB0030", getXBB0030());
		attributes.put("XBB0031", getXBB0031());
		attributes.put("XBB0032", getXBB0032());
		attributes.put("XBB0033", getXBB0033());
		attributes.put("XBB1033", getXBB1033());
		attributes.put("XBB0034", getXBB0034());
		attributes.put("XBB1034", getXBB1034());
		attributes.put("XBB0035", getXBB0035());
		attributes.put("XBB0036", getXBB0036());
		attributes.put("XBB1036", getXBB1036());
		attributes.put("XBB0037", getXBB0037());
		attributes.put("XBB0038", getXBB0038());
		attributes.put("XBB0039", getXBB0039());
		attributes.put("XBB0040", getXBB0040());
		attributes.put("XBB0041", getXBB0041());
		attributes.put("XBB0042", getXBB0042());
		attributes.put("XBB0043", getXBB0043());
		attributes.put("XBB0044", getXBB0044());
		attributes.put("XBB1044", getXBB1044());
		attributes.put("XBB0045", getXBB0045());
		attributes.put("XBB0046", getXBB0046());
		attributes.put("XBB0047", getXBB0047());
		attributes.put("XBB0048", getXBB0048());
		attributes.put("XBB0049", getXBB0049());
		attributes.put("XBB0050", getXBB0050());
		attributes.put("XBB0051", getXBB0051());
		attributes.put("XBB0052", getXBB0052());
		attributes.put("XBB0053", getXBB0053());
		attributes.put("XBB0054", getXBB0054());
		attributes.put("XBB0055", getXBB0055());
		attributes.put("XBB0056", getXBB0056());
		attributes.put("XBB0057", getXBB0057());
		attributes.put("XBB0058", getXBB0058());
		attributes.put("XBB0059", getXBB0059());
		attributes.put("XBB0060", getXBB0060());
		attributes.put("XBB0061", getXBB0061());
		attributes.put("XBB0062", getXBB0062());
		attributes.put("XBB0063", getXBB0063());
		attributes.put("XBB0076", getXBB0076());
		attributes.put("XBB0077", getXBB0077());
		attributes.put("XBB0078", getXBB0078());
		attributes.put("XBB0079", getXBB0079());
		attributes.put("XBB0080", getXBB0080());
		attributes.put("XBB1080", getXBB1080());
		attributes.put("XBB0081", getXBB0081());
		attributes.put("XBB1081", getXBB1081());
		attributes.put("XBB1181", getXBB1181());
		attributes.put("XBB0082", getXBB0082());
		attributes.put("XBB1082", getXBB1082());
		attributes.put("XBB1182", getXBB1182());
		attributes.put("XBB0083", getXBB0083());
		attributes.put("XBB1083", getXBB1083());
		attributes.put("XBB1183", getXBB1183());
		attributes.put("XBB0084", getXBB0084());
		attributes.put("XBB0085", getXBB0085());
		attributes.put("XBB0086", getXBB0086());
		attributes.put("XBB0087", getXBB0087());
		attributes.put("XBB0088", getXBB0088());
		attributes.put("XBB0089", getXBB0089());
		attributes.put("XBB0090", getXBB0090());
		attributes.put("XBB0091", getXBB0091());
		attributes.put("XBB0092", getXBB0092());
		attributes.put("XBB0093", getXBB0093());
		attributes.put("XBB0094", getXBB0094());
		attributes.put("XBB0095", getXBB0095());
		attributes.put("XBB0096", getXBB0096());
		attributes.put("XBB0097", getXBB0097());
		attributes.put("XBB0098", getXBB0098());
		attributes.put("XBB0099", getXBB0099());
		attributes.put("XBB0100", getXBB0100());
		attributes.put("XBB0101", getXBB0101());
		attributes.put("XBB0102", getXBB0102());
		attributes.put("XBB0103", getXBB0103());
		attributes.put("XBB0104", getXBB0104());
		attributes.put("XBB2104", getXBB2104());
		attributes.put("XBB0105", getXBB0105());
		attributes.put("XBB2105", getXBB2105());
		attributes.put("XBB0106", getXBB0106());
		attributes.put("XBB2106", getXBB2106());
		attributes.put("XBB0107", getXBB0107());
		attributes.put("XBB2107", getXBB2107());
		attributes.put("XBB0108", getXBB0108());
		attributes.put("XBB2108", getXBB2108());
		attributes.put("XBB0109", getXBB0109());
		attributes.put("XBB2109", getXBB2109());
		attributes.put("XBB0110", getXBB0110());
		attributes.put("XBB2110", getXBB2110());
		attributes.put("XBB0111", getXBB0111());
		attributes.put("XBB2111", getXBB2111());
		attributes.put("XBB0112", getXBB0112());
		attributes.put("XBB2112", getXBB2112());
		attributes.put("XBB0113", getXBB0113());
		attributes.put("XBB2113", getXBB2113());
		attributes.put("XBB0114", getXBB0114());
		attributes.put("XBB2114", getXBB2114());
		attributes.put("XBB0115", getXBB0115());
		attributes.put("XBB2115", getXBB2115());
		attributes.put("XBB0116", getXBB0116());
		attributes.put("XBB2116", getXBB2116());
		attributes.put("XBB0117", getXBB0117());
		attributes.put("XBB2117", getXBB2117());
		attributes.put("XBB0118", getXBB0118());
		attributes.put("XBB0119", getXBB0119());
		attributes.put("XBB2119", getXBB2119());
		attributes.put("XBB0120", getXBB0120());
		attributes.put("XBB0121", getXBB0121());
		attributes.put("XBB0122", getXBB0122());
		attributes.put("XBB0123", getXBB0123());
		attributes.put("XBB0124", getXBB0124());
		attributes.put("XBB0125", getXBB0125());
		attributes.put("XBB0126", getXBB0126());
		attributes.put("XBB1084", getXBB1084());
		attributes.put("XBB1086", getXBB1086());

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

		String XBB0009 = (String)attributes.get("XBB0009");

		if (XBB0009 != null) {
			setXBB0009(XBB0009);
		}

		String XBB0010 = (String)attributes.get("XBB0010");

		if (XBB0010 != null) {
			setXBB0010(XBB0010);
		}

		String XBB0011 = (String)attributes.get("XBB0011");

		if (XBB0011 != null) {
			setXBB0011(XBB0011);
		}

		String XBB0012 = (String)attributes.get("XBB0012");

		if (XBB0012 != null) {
			setXBB0012(XBB0012);
		}

		String XBB0013 = (String)attributes.get("XBB0013");

		if (XBB0013 != null) {
			setXBB0013(XBB0013);
		}

		String XBB0014 = (String)attributes.get("XBB0014");

		if (XBB0014 != null) {
			setXBB0014(XBB0014);
		}

		String XBB1014 = (String)attributes.get("XBB1014");

		if (XBB1014 != null) {
			setXBB1014(XBB1014);
		}

		String XBB1114 = (String)attributes.get("XBB1114");

		if (XBB1114 != null) {
			setXBB1114(XBB1114);
		}

		String XBB0015 = (String)attributes.get("XBB0015");

		if (XBB0015 != null) {
			setXBB0015(XBB0015);
		}

		String XBB1015 = (String)attributes.get("XBB1015");

		if (XBB1015 != null) {
			setXBB1015(XBB1015);
		}

		String XBB1115 = (String)attributes.get("XBB1115");

		if (XBB1115 != null) {
			setXBB1115(XBB1115);
		}

		String XBB0016 = (String)attributes.get("XBB0016");

		if (XBB0016 != null) {
			setXBB0016(XBB0016);
		}

		String XBB1016 = (String)attributes.get("XBB1016");

		if (XBB1016 != null) {
			setXBB1016(XBB1016);
		}

		String XBB1116 = (String)attributes.get("XBB1116");

		if (XBB1116 != null) {
			setXBB1116(XBB1116);
		}

		String XBB0017 = (String)attributes.get("XBB0017");

		if (XBB0017 != null) {
			setXBB0017(XBB0017);
		}

		String XBB1017 = (String)attributes.get("XBB1017");

		if (XBB1017 != null) {
			setXBB1017(XBB1017);
		}

		String XBB1117 = (String)attributes.get("XBB1117");

		if (XBB1117 != null) {
			setXBB1117(XBB1117);
		}

		String XBB0018 = (String)attributes.get("XBB0018");

		if (XBB0018 != null) {
			setXBB0018(XBB0018);
		}

		String XBB0019 = (String)attributes.get("XBB0019");

		if (XBB0019 != null) {
			setXBB0019(XBB0019);
		}

		String XBB0020 = (String)attributes.get("XBB0020");

		if (XBB0020 != null) {
			setXBB0020(XBB0020);
		}

		String XBB0021 = (String)attributes.get("XBB0021");

		if (XBB0021 != null) {
			setXBB0021(XBB0021);
		}

		String XBB0022 = (String)attributes.get("XBB0022");

		if (XBB0022 != null) {
			setXBB0022(XBB0022);
		}

		String XBB1022 = (String)attributes.get("XBB1022");

		if (XBB1022 != null) {
			setXBB1022(XBB1022);
		}

		String XBB0023 = (String)attributes.get("XBB0023");

		if (XBB0023 != null) {
			setXBB0023(XBB0023);
		}

		String XBB0024 = (String)attributes.get("XBB0024");

		if (XBB0024 != null) {
			setXBB0024(XBB0024);
		}

		String XBB0025 = (String)attributes.get("XBB0025");

		if (XBB0025 != null) {
			setXBB0025(XBB0025);
		}

		String XBB0026 = (String)attributes.get("XBB0026");

		if (XBB0026 != null) {
			setXBB0026(XBB0026);
		}

		String XBB1026 = (String)attributes.get("XBB1026");

		if (XBB1026 != null) {
			setXBB1026(XBB1026);
		}

		String XBB0027 = (String)attributes.get("XBB0027");

		if (XBB0027 != null) {
			setXBB0027(XBB0027);
		}

		String XBB1027 = (String)attributes.get("XBB1027");

		if (XBB1027 != null) {
			setXBB1027(XBB1027);
		}

		String XBB0028 = (String)attributes.get("XBB0028");

		if (XBB0028 != null) {
			setXBB0028(XBB0028);
		}

		String XBB0029 = (String)attributes.get("XBB0029");

		if (XBB0029 != null) {
			setXBB0029(XBB0029);
		}

		String XBB1029 = (String)attributes.get("XBB1029");

		if (XBB1029 != null) {
			setXBB1029(XBB1029);
		}

		String XBB0030 = (String)attributes.get("XBB0030");

		if (XBB0030 != null) {
			setXBB0030(XBB0030);
		}

		String XBB0031 = (String)attributes.get("XBB0031");

		if (XBB0031 != null) {
			setXBB0031(XBB0031);
		}

		String XBB0032 = (String)attributes.get("XBB0032");

		if (XBB0032 != null) {
			setXBB0032(XBB0032);
		}

		String XBB0033 = (String)attributes.get("XBB0033");

		if (XBB0033 != null) {
			setXBB0033(XBB0033);
		}

		String XBB1033 = (String)attributes.get("XBB1033");

		if (XBB1033 != null) {
			setXBB1033(XBB1033);
		}

		String XBB0034 = (String)attributes.get("XBB0034");

		if (XBB0034 != null) {
			setXBB0034(XBB0034);
		}

		String XBB1034 = (String)attributes.get("XBB1034");

		if (XBB1034 != null) {
			setXBB1034(XBB1034);
		}

		String XBB0035 = (String)attributes.get("XBB0035");

		if (XBB0035 != null) {
			setXBB0035(XBB0035);
		}

		String XBB0036 = (String)attributes.get("XBB0036");

		if (XBB0036 != null) {
			setXBB0036(XBB0036);
		}

		String XBB1036 = (String)attributes.get("XBB1036");

		if (XBB1036 != null) {
			setXBB1036(XBB1036);
		}

		String XBB0037 = (String)attributes.get("XBB0037");

		if (XBB0037 != null) {
			setXBB0037(XBB0037);
		}

		String XBB0038 = (String)attributes.get("XBB0038");

		if (XBB0038 != null) {
			setXBB0038(XBB0038);
		}

		String XBB0039 = (String)attributes.get("XBB0039");

		if (XBB0039 != null) {
			setXBB0039(XBB0039);
		}

		String XBB0040 = (String)attributes.get("XBB0040");

		if (XBB0040 != null) {
			setXBB0040(XBB0040);
		}

		String XBB0041 = (String)attributes.get("XBB0041");

		if (XBB0041 != null) {
			setXBB0041(XBB0041);
		}

		String XBB0042 = (String)attributes.get("XBB0042");

		if (XBB0042 != null) {
			setXBB0042(XBB0042);
		}

		String XBB0043 = (String)attributes.get("XBB0043");

		if (XBB0043 != null) {
			setXBB0043(XBB0043);
		}

		String XBB0044 = (String)attributes.get("XBB0044");

		if (XBB0044 != null) {
			setXBB0044(XBB0044);
		}

		String XBB1044 = (String)attributes.get("XBB1044");

		if (XBB1044 != null) {
			setXBB1044(XBB1044);
		}

		String XBB0045 = (String)attributes.get("XBB0045");

		if (XBB0045 != null) {
			setXBB0045(XBB0045);
		}

		String XBB0046 = (String)attributes.get("XBB0046");

		if (XBB0046 != null) {
			setXBB0046(XBB0046);
		}

		String XBB0047 = (String)attributes.get("XBB0047");

		if (XBB0047 != null) {
			setXBB0047(XBB0047);
		}

		String XBB0048 = (String)attributes.get("XBB0048");

		if (XBB0048 != null) {
			setXBB0048(XBB0048);
		}

		String XBB0049 = (String)attributes.get("XBB0049");

		if (XBB0049 != null) {
			setXBB0049(XBB0049);
		}

		String XBB0050 = (String)attributes.get("XBB0050");

		if (XBB0050 != null) {
			setXBB0050(XBB0050);
		}

		String XBB0051 = (String)attributes.get("XBB0051");

		if (XBB0051 != null) {
			setXBB0051(XBB0051);
		}

		String XBB0052 = (String)attributes.get("XBB0052");

		if (XBB0052 != null) {
			setXBB0052(XBB0052);
		}

		String XBB0053 = (String)attributes.get("XBB0053");

		if (XBB0053 != null) {
			setXBB0053(XBB0053);
		}

		String XBB0054 = (String)attributes.get("XBB0054");

		if (XBB0054 != null) {
			setXBB0054(XBB0054);
		}

		String XBB0055 = (String)attributes.get("XBB0055");

		if (XBB0055 != null) {
			setXBB0055(XBB0055);
		}

		String XBB0056 = (String)attributes.get("XBB0056");

		if (XBB0056 != null) {
			setXBB0056(XBB0056);
		}

		String XBB0057 = (String)attributes.get("XBB0057");

		if (XBB0057 != null) {
			setXBB0057(XBB0057);
		}

		String XBB0058 = (String)attributes.get("XBB0058");

		if (XBB0058 != null) {
			setXBB0058(XBB0058);
		}

		String XBB0059 = (String)attributes.get("XBB0059");

		if (XBB0059 != null) {
			setXBB0059(XBB0059);
		}

		String XBB0060 = (String)attributes.get("XBB0060");

		if (XBB0060 != null) {
			setXBB0060(XBB0060);
		}

		String XBB0061 = (String)attributes.get("XBB0061");

		if (XBB0061 != null) {
			setXBB0061(XBB0061);
		}

		String XBB0062 = (String)attributes.get("XBB0062");

		if (XBB0062 != null) {
			setXBB0062(XBB0062);
		}

		String XBB0063 = (String)attributes.get("XBB0063");

		if (XBB0063 != null) {
			setXBB0063(XBB0063);
		}

		String XBB0076 = (String)attributes.get("XBB0076");

		if (XBB0076 != null) {
			setXBB0076(XBB0076);
		}

		String XBB0077 = (String)attributes.get("XBB0077");

		if (XBB0077 != null) {
			setXBB0077(XBB0077);
		}

		String XBB0078 = (String)attributes.get("XBB0078");

		if (XBB0078 != null) {
			setXBB0078(XBB0078);
		}

		String XBB0079 = (String)attributes.get("XBB0079");

		if (XBB0079 != null) {
			setXBB0079(XBB0079);
		}

		String XBB0080 = (String)attributes.get("XBB0080");

		if (XBB0080 != null) {
			setXBB0080(XBB0080);
		}

		String XBB1080 = (String)attributes.get("XBB1080");

		if (XBB1080 != null) {
			setXBB1080(XBB1080);
		}

		String XBB0081 = (String)attributes.get("XBB0081");

		if (XBB0081 != null) {
			setXBB0081(XBB0081);
		}

		String XBB1081 = (String)attributes.get("XBB1081");

		if (XBB1081 != null) {
			setXBB1081(XBB1081);
		}

		String XBB1181 = (String)attributes.get("XBB1181");

		if (XBB1181 != null) {
			setXBB1181(XBB1181);
		}

		String XBB0082 = (String)attributes.get("XBB0082");

		if (XBB0082 != null) {
			setXBB0082(XBB0082);
		}

		String XBB1082 = (String)attributes.get("XBB1082");

		if (XBB1082 != null) {
			setXBB1082(XBB1082);
		}

		String XBB1182 = (String)attributes.get("XBB1182");

		if (XBB1182 != null) {
			setXBB1182(XBB1182);
		}

		String XBB0083 = (String)attributes.get("XBB0083");

		if (XBB0083 != null) {
			setXBB0083(XBB0083);
		}

		String XBB1083 = (String)attributes.get("XBB1083");

		if (XBB1083 != null) {
			setXBB1083(XBB1083);
		}

		String XBB1183 = (String)attributes.get("XBB1183");

		if (XBB1183 != null) {
			setXBB1183(XBB1183);
		}

		String XBB0084 = (String)attributes.get("XBB0084");

		if (XBB0084 != null) {
			setXBB0084(XBB0084);
		}

		String XBB0085 = (String)attributes.get("XBB0085");

		if (XBB0085 != null) {
			setXBB0085(XBB0085);
		}

		String XBB0086 = (String)attributes.get("XBB0086");

		if (XBB0086 != null) {
			setXBB0086(XBB0086);
		}

		String XBB0087 = (String)attributes.get("XBB0087");

		if (XBB0087 != null) {
			setXBB0087(XBB0087);
		}

		String XBB0088 = (String)attributes.get("XBB0088");

		if (XBB0088 != null) {
			setXBB0088(XBB0088);
		}

		String XBB0089 = (String)attributes.get("XBB0089");

		if (XBB0089 != null) {
			setXBB0089(XBB0089);
		}

		String XBB0090 = (String)attributes.get("XBB0090");

		if (XBB0090 != null) {
			setXBB0090(XBB0090);
		}

		String XBB0091 = (String)attributes.get("XBB0091");

		if (XBB0091 != null) {
			setXBB0091(XBB0091);
		}

		String XBB0092 = (String)attributes.get("XBB0092");

		if (XBB0092 != null) {
			setXBB0092(XBB0092);
		}

		String XBB0093 = (String)attributes.get("XBB0093");

		if (XBB0093 != null) {
			setXBB0093(XBB0093);
		}

		String XBB0094 = (String)attributes.get("XBB0094");

		if (XBB0094 != null) {
			setXBB0094(XBB0094);
		}

		String XBB0095 = (String)attributes.get("XBB0095");

		if (XBB0095 != null) {
			setXBB0095(XBB0095);
		}

		String XBB0096 = (String)attributes.get("XBB0096");

		if (XBB0096 != null) {
			setXBB0096(XBB0096);
		}

		String XBB0097 = (String)attributes.get("XBB0097");

		if (XBB0097 != null) {
			setXBB0097(XBB0097);
		}

		String XBB0098 = (String)attributes.get("XBB0098");

		if (XBB0098 != null) {
			setXBB0098(XBB0098);
		}

		String XBB0099 = (String)attributes.get("XBB0099");

		if (XBB0099 != null) {
			setXBB0099(XBB0099);
		}

		String XBB0100 = (String)attributes.get("XBB0100");

		if (XBB0100 != null) {
			setXBB0100(XBB0100);
		}

		String XBB0101 = (String)attributes.get("XBB0101");

		if (XBB0101 != null) {
			setXBB0101(XBB0101);
		}

		String XBB0102 = (String)attributes.get("XBB0102");

		if (XBB0102 != null) {
			setXBB0102(XBB0102);
		}

		String XBB0103 = (String)attributes.get("XBB0103");

		if (XBB0103 != null) {
			setXBB0103(XBB0103);
		}

		String XBB0104 = (String)attributes.get("XBB0104");

		if (XBB0104 != null) {
			setXBB0104(XBB0104);
		}

		String XBB2104 = (String)attributes.get("XBB2104");

		if (XBB2104 != null) {
			setXBB2104(XBB2104);
		}

		String XBB0105 = (String)attributes.get("XBB0105");

		if (XBB0105 != null) {
			setXBB0105(XBB0105);
		}

		String XBB2105 = (String)attributes.get("XBB2105");

		if (XBB2105 != null) {
			setXBB2105(XBB2105);
		}

		String XBB0106 = (String)attributes.get("XBB0106");

		if (XBB0106 != null) {
			setXBB0106(XBB0106);
		}

		String XBB2106 = (String)attributes.get("XBB2106");

		if (XBB2106 != null) {
			setXBB2106(XBB2106);
		}

		String XBB0107 = (String)attributes.get("XBB0107");

		if (XBB0107 != null) {
			setXBB0107(XBB0107);
		}

		String XBB2107 = (String)attributes.get("XBB2107");

		if (XBB2107 != null) {
			setXBB2107(XBB2107);
		}

		String XBB0108 = (String)attributes.get("XBB0108");

		if (XBB0108 != null) {
			setXBB0108(XBB0108);
		}

		String XBB2108 = (String)attributes.get("XBB2108");

		if (XBB2108 != null) {
			setXBB2108(XBB2108);
		}

		String XBB0109 = (String)attributes.get("XBB0109");

		if (XBB0109 != null) {
			setXBB0109(XBB0109);
		}

		String XBB2109 = (String)attributes.get("XBB2109");

		if (XBB2109 != null) {
			setXBB2109(XBB2109);
		}

		String XBB0110 = (String)attributes.get("XBB0110");

		if (XBB0110 != null) {
			setXBB0110(XBB0110);
		}

		String XBB2110 = (String)attributes.get("XBB2110");

		if (XBB2110 != null) {
			setXBB2110(XBB2110);
		}

		String XBB0111 = (String)attributes.get("XBB0111");

		if (XBB0111 != null) {
			setXBB0111(XBB0111);
		}

		String XBB2111 = (String)attributes.get("XBB2111");

		if (XBB2111 != null) {
			setXBB2111(XBB2111);
		}

		String XBB0112 = (String)attributes.get("XBB0112");

		if (XBB0112 != null) {
			setXBB0112(XBB0112);
		}

		String XBB2112 = (String)attributes.get("XBB2112");

		if (XBB2112 != null) {
			setXBB2112(XBB2112);
		}

		String XBB0113 = (String)attributes.get("XBB0113");

		if (XBB0113 != null) {
			setXBB0113(XBB0113);
		}

		String XBB2113 = (String)attributes.get("XBB2113");

		if (XBB2113 != null) {
			setXBB2113(XBB2113);
		}

		String XBB0114 = (String)attributes.get("XBB0114");

		if (XBB0114 != null) {
			setXBB0114(XBB0114);
		}

		String XBB2114 = (String)attributes.get("XBB2114");

		if (XBB2114 != null) {
			setXBB2114(XBB2114);
		}

		String XBB0115 = (String)attributes.get("XBB0115");

		if (XBB0115 != null) {
			setXBB0115(XBB0115);
		}

		String XBB2115 = (String)attributes.get("XBB2115");

		if (XBB2115 != null) {
			setXBB2115(XBB2115);
		}

		String XBB0116 = (String)attributes.get("XBB0116");

		if (XBB0116 != null) {
			setXBB0116(XBB0116);
		}

		String XBB2116 = (String)attributes.get("XBB2116");

		if (XBB2116 != null) {
			setXBB2116(XBB2116);
		}

		String XBB0117 = (String)attributes.get("XBB0117");

		if (XBB0117 != null) {
			setXBB0117(XBB0117);
		}

		String XBB2117 = (String)attributes.get("XBB2117");

		if (XBB2117 != null) {
			setXBB2117(XBB2117);
		}

		String XBB0118 = (String)attributes.get("XBB0118");

		if (XBB0118 != null) {
			setXBB0118(XBB0118);
		}

		String XBB0119 = (String)attributes.get("XBB0119");

		if (XBB0119 != null) {
			setXBB0119(XBB0119);
		}

		String XBB2119 = (String)attributes.get("XBB2119");

		if (XBB2119 != null) {
			setXBB2119(XBB2119);
		}

		String XBB0120 = (String)attributes.get("XBB0120");

		if (XBB0120 != null) {
			setXBB0120(XBB0120);
		}

		String XBB0121 = (String)attributes.get("XBB0121");

		if (XBB0121 != null) {
			setXBB0121(XBB0121);
		}

		String XBB0122 = (String)attributes.get("XBB0122");

		if (XBB0122 != null) {
			setXBB0122(XBB0122);
		}

		String XBB0123 = (String)attributes.get("XBB0123");

		if (XBB0123 != null) {
			setXBB0123(XBB0123);
		}

		String XBB0124 = (String)attributes.get("XBB0124");

		if (XBB0124 != null) {
			setXBB0124(XBB0124);
		}

		String XBB0125 = (String)attributes.get("XBB0125");

		if (XBB0125 != null) {
			setXBB0125(XBB0125);
		}

		String XBB0126 = (String)attributes.get("XBB0126");

		if (XBB0126 != null) {
			setXBB0126(XBB0126);
		}

		String XBB1084 = (String)attributes.get("XBB1084");

		if (XBB1084 != null) {
			setXBB1084(XBB1084);
		}

		String XBB1086 = (String)attributes.get("XBB1086");

		if (XBB1086 != null) {
			setXBB1086(XBB1086);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, id);
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

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, hoSoThuTucId);
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

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateRecordId",
						long.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel,
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

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleGroupId", long.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel,
					vehicleGroupId);
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

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchDate", Date.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, SynchDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0009() {
		return _XBB0009;
	}

	@Override
	public void setXBB0009(String XBB0009) {
		_XBB0009 = XBB0009;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0009", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0009);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0010() {
		return _XBB0010;
	}

	@Override
	public void setXBB0010(String XBB0010) {
		_XBB0010 = XBB0010;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0010", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0010);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0011() {
		return _XBB0011;
	}

	@Override
	public void setXBB0011(String XBB0011) {
		_XBB0011 = XBB0011;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0011", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0011);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0012() {
		return _XBB0012;
	}

	@Override
	public void setXBB0012(String XBB0012) {
		_XBB0012 = XBB0012;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0012", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0012);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0013() {
		return _XBB0013;
	}

	@Override
	public void setXBB0013(String XBB0013) {
		_XBB0013 = XBB0013;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0013", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0013);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0014() {
		return _XBB0014;
	}

	@Override
	public void setXBB0014(String XBB0014) {
		_XBB0014 = XBB0014;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0014", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0014);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1014() {
		return _XBB1014;
	}

	@Override
	public void setXBB1014(String XBB1014) {
		_XBB1014 = XBB1014;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1014", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1014);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1114() {
		return _XBB1114;
	}

	@Override
	public void setXBB1114(String XBB1114) {
		_XBB1114 = XBB1114;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1114", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1114);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0015() {
		return _XBB0015;
	}

	@Override
	public void setXBB0015(String XBB0015) {
		_XBB0015 = XBB0015;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0015", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0015);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1015() {
		return _XBB1015;
	}

	@Override
	public void setXBB1015(String XBB1015) {
		_XBB1015 = XBB1015;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1015", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1015);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1115() {
		return _XBB1115;
	}

	@Override
	public void setXBB1115(String XBB1115) {
		_XBB1115 = XBB1115;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1115", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1115);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0016() {
		return _XBB0016;
	}

	@Override
	public void setXBB0016(String XBB0016) {
		_XBB0016 = XBB0016;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0016", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0016);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1016() {
		return _XBB1016;
	}

	@Override
	public void setXBB1016(String XBB1016) {
		_XBB1016 = XBB1016;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1016", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1016);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1116() {
		return _XBB1116;
	}

	@Override
	public void setXBB1116(String XBB1116) {
		_XBB1116 = XBB1116;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1116", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1116);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0017() {
		return _XBB0017;
	}

	@Override
	public void setXBB0017(String XBB0017) {
		_XBB0017 = XBB0017;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0017", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0017);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1017() {
		return _XBB1017;
	}

	@Override
	public void setXBB1017(String XBB1017) {
		_XBB1017 = XBB1017;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1017", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1017);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1117() {
		return _XBB1117;
	}

	@Override
	public void setXBB1117(String XBB1117) {
		_XBB1117 = XBB1117;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1117", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1117);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0018() {
		return _XBB0018;
	}

	@Override
	public void setXBB0018(String XBB0018) {
		_XBB0018 = XBB0018;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0018", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0018);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0019() {
		return _XBB0019;
	}

	@Override
	public void setXBB0019(String XBB0019) {
		_XBB0019 = XBB0019;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0019", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0019);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0020() {
		return _XBB0020;
	}

	@Override
	public void setXBB0020(String XBB0020) {
		_XBB0020 = XBB0020;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0020", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0020);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0021() {
		return _XBB0021;
	}

	@Override
	public void setXBB0021(String XBB0021) {
		_XBB0021 = XBB0021;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0021", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0021);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0022() {
		return _XBB0022;
	}

	@Override
	public void setXBB0022(String XBB0022) {
		_XBB0022 = XBB0022;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0022", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0022);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1022() {
		return _XBB1022;
	}

	@Override
	public void setXBB1022(String XBB1022) {
		_XBB1022 = XBB1022;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1022", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1022);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0023() {
		return _XBB0023;
	}

	@Override
	public void setXBB0023(String XBB0023) {
		_XBB0023 = XBB0023;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0023", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0023);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0024() {
		return _XBB0024;
	}

	@Override
	public void setXBB0024(String XBB0024) {
		_XBB0024 = XBB0024;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0024", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0024);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0025() {
		return _XBB0025;
	}

	@Override
	public void setXBB0025(String XBB0025) {
		_XBB0025 = XBB0025;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0025", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0025);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0026() {
		return _XBB0026;
	}

	@Override
	public void setXBB0026(String XBB0026) {
		_XBB0026 = XBB0026;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0026", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0026);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1026() {
		return _XBB1026;
	}

	@Override
	public void setXBB1026(String XBB1026) {
		_XBB1026 = XBB1026;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1026", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1026);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0027() {
		return _XBB0027;
	}

	@Override
	public void setXBB0027(String XBB0027) {
		_XBB0027 = XBB0027;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0027", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0027);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1027() {
		return _XBB1027;
	}

	@Override
	public void setXBB1027(String XBB1027) {
		_XBB1027 = XBB1027;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1027", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1027);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0028() {
		return _XBB0028;
	}

	@Override
	public void setXBB0028(String XBB0028) {
		_XBB0028 = XBB0028;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0028", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0028);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0029() {
		return _XBB0029;
	}

	@Override
	public void setXBB0029(String XBB0029) {
		_XBB0029 = XBB0029;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0029", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0029);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1029() {
		return _XBB1029;
	}

	@Override
	public void setXBB1029(String XBB1029) {
		_XBB1029 = XBB1029;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1029", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1029);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0030() {
		return _XBB0030;
	}

	@Override
	public void setXBB0030(String XBB0030) {
		_XBB0030 = XBB0030;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0030", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0030);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0031() {
		return _XBB0031;
	}

	@Override
	public void setXBB0031(String XBB0031) {
		_XBB0031 = XBB0031;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0031", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0031);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0032() {
		return _XBB0032;
	}

	@Override
	public void setXBB0032(String XBB0032) {
		_XBB0032 = XBB0032;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0032", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0032);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0033() {
		return _XBB0033;
	}

	@Override
	public void setXBB0033(String XBB0033) {
		_XBB0033 = XBB0033;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0033", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0033);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1033() {
		return _XBB1033;
	}

	@Override
	public void setXBB1033(String XBB1033) {
		_XBB1033 = XBB1033;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1033", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1033);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0034() {
		return _XBB0034;
	}

	@Override
	public void setXBB0034(String XBB0034) {
		_XBB0034 = XBB0034;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0034", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0034);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1034() {
		return _XBB1034;
	}

	@Override
	public void setXBB1034(String XBB1034) {
		_XBB1034 = XBB1034;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1034", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1034);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0035() {
		return _XBB0035;
	}

	@Override
	public void setXBB0035(String XBB0035) {
		_XBB0035 = XBB0035;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0035", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0035);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0036() {
		return _XBB0036;
	}

	@Override
	public void setXBB0036(String XBB0036) {
		_XBB0036 = XBB0036;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0036", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0036);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1036() {
		return _XBB1036;
	}

	@Override
	public void setXBB1036(String XBB1036) {
		_XBB1036 = XBB1036;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1036", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1036);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0037() {
		return _XBB0037;
	}

	@Override
	public void setXBB0037(String XBB0037) {
		_XBB0037 = XBB0037;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0037", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0037);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0038() {
		return _XBB0038;
	}

	@Override
	public void setXBB0038(String XBB0038) {
		_XBB0038 = XBB0038;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0038", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0038);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0039() {
		return _XBB0039;
	}

	@Override
	public void setXBB0039(String XBB0039) {
		_XBB0039 = XBB0039;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0039", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0039);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0040() {
		return _XBB0040;
	}

	@Override
	public void setXBB0040(String XBB0040) {
		_XBB0040 = XBB0040;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0040", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0040);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0041() {
		return _XBB0041;
	}

	@Override
	public void setXBB0041(String XBB0041) {
		_XBB0041 = XBB0041;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0041", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0041);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0042() {
		return _XBB0042;
	}

	@Override
	public void setXBB0042(String XBB0042) {
		_XBB0042 = XBB0042;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0042", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0042);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0043() {
		return _XBB0043;
	}

	@Override
	public void setXBB0043(String XBB0043) {
		_XBB0043 = XBB0043;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0043", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0043);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0044() {
		return _XBB0044;
	}

	@Override
	public void setXBB0044(String XBB0044) {
		_XBB0044 = XBB0044;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0044", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0044);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1044() {
		return _XBB1044;
	}

	@Override
	public void setXBB1044(String XBB1044) {
		_XBB1044 = XBB1044;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1044", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1044);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0045() {
		return _XBB0045;
	}

	@Override
	public void setXBB0045(String XBB0045) {
		_XBB0045 = XBB0045;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0045", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0045);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0046() {
		return _XBB0046;
	}

	@Override
	public void setXBB0046(String XBB0046) {
		_XBB0046 = XBB0046;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0046", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0046);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0047() {
		return _XBB0047;
	}

	@Override
	public void setXBB0047(String XBB0047) {
		_XBB0047 = XBB0047;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0047", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0047);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0048() {
		return _XBB0048;
	}

	@Override
	public void setXBB0048(String XBB0048) {
		_XBB0048 = XBB0048;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0048", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0048);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0049() {
		return _XBB0049;
	}

	@Override
	public void setXBB0049(String XBB0049) {
		_XBB0049 = XBB0049;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0049", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0049);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0050() {
		return _XBB0050;
	}

	@Override
	public void setXBB0050(String XBB0050) {
		_XBB0050 = XBB0050;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0050", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0050);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0051() {
		return _XBB0051;
	}

	@Override
	public void setXBB0051(String XBB0051) {
		_XBB0051 = XBB0051;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0051", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0051);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0052() {
		return _XBB0052;
	}

	@Override
	public void setXBB0052(String XBB0052) {
		_XBB0052 = XBB0052;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0052", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0052);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0053() {
		return _XBB0053;
	}

	@Override
	public void setXBB0053(String XBB0053) {
		_XBB0053 = XBB0053;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0053", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0053);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0054() {
		return _XBB0054;
	}

	@Override
	public void setXBB0054(String XBB0054) {
		_XBB0054 = XBB0054;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0054", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0054);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0055() {
		return _XBB0055;
	}

	@Override
	public void setXBB0055(String XBB0055) {
		_XBB0055 = XBB0055;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0055", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0055);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0056() {
		return _XBB0056;
	}

	@Override
	public void setXBB0056(String XBB0056) {
		_XBB0056 = XBB0056;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0056", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0056);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0057() {
		return _XBB0057;
	}

	@Override
	public void setXBB0057(String XBB0057) {
		_XBB0057 = XBB0057;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0057", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0057);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0058() {
		return _XBB0058;
	}

	@Override
	public void setXBB0058(String XBB0058) {
		_XBB0058 = XBB0058;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0058", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0058);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0059() {
		return _XBB0059;
	}

	@Override
	public void setXBB0059(String XBB0059) {
		_XBB0059 = XBB0059;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0059", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0059);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0060() {
		return _XBB0060;
	}

	@Override
	public void setXBB0060(String XBB0060) {
		_XBB0060 = XBB0060;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0060", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0060);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0061() {
		return _XBB0061;
	}

	@Override
	public void setXBB0061(String XBB0061) {
		_XBB0061 = XBB0061;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0061", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0061);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0062() {
		return _XBB0062;
	}

	@Override
	public void setXBB0062(String XBB0062) {
		_XBB0062 = XBB0062;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0062", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0062);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0063() {
		return _XBB0063;
	}

	@Override
	public void setXBB0063(String XBB0063) {
		_XBB0063 = XBB0063;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0063", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0063);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0076() {
		return _XBB0076;
	}

	@Override
	public void setXBB0076(String XBB0076) {
		_XBB0076 = XBB0076;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0076", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0076);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0077() {
		return _XBB0077;
	}

	@Override
	public void setXBB0077(String XBB0077) {
		_XBB0077 = XBB0077;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0077", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0077);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0078() {
		return _XBB0078;
	}

	@Override
	public void setXBB0078(String XBB0078) {
		_XBB0078 = XBB0078;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0078", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0078);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0079() {
		return _XBB0079;
	}

	@Override
	public void setXBB0079(String XBB0079) {
		_XBB0079 = XBB0079;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0079", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0079);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0080() {
		return _XBB0080;
	}

	@Override
	public void setXBB0080(String XBB0080) {
		_XBB0080 = XBB0080;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0080", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0080);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1080() {
		return _XBB1080;
	}

	@Override
	public void setXBB1080(String XBB1080) {
		_XBB1080 = XBB1080;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1080", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1080);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0081() {
		return _XBB0081;
	}

	@Override
	public void setXBB0081(String XBB0081) {
		_XBB0081 = XBB0081;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0081", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0081);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1081() {
		return _XBB1081;
	}

	@Override
	public void setXBB1081(String XBB1081) {
		_XBB1081 = XBB1081;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1081", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1081);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1181() {
		return _XBB1181;
	}

	@Override
	public void setXBB1181(String XBB1181) {
		_XBB1181 = XBB1181;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1181", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1181);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0082() {
		return _XBB0082;
	}

	@Override
	public void setXBB0082(String XBB0082) {
		_XBB0082 = XBB0082;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0082", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0082);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1082() {
		return _XBB1082;
	}

	@Override
	public void setXBB1082(String XBB1082) {
		_XBB1082 = XBB1082;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1082", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1082);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1182() {
		return _XBB1182;
	}

	@Override
	public void setXBB1182(String XBB1182) {
		_XBB1182 = XBB1182;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1182", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1182);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0083() {
		return _XBB0083;
	}

	@Override
	public void setXBB0083(String XBB0083) {
		_XBB0083 = XBB0083;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0083", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0083);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1083() {
		return _XBB1083;
	}

	@Override
	public void setXBB1083(String XBB1083) {
		_XBB1083 = XBB1083;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1083", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1083);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1183() {
		return _XBB1183;
	}

	@Override
	public void setXBB1183(String XBB1183) {
		_XBB1183 = XBB1183;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1183", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1183);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0084() {
		return _XBB0084;
	}

	@Override
	public void setXBB0084(String XBB0084) {
		_XBB0084 = XBB0084;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0084", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0084);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0085() {
		return _XBB0085;
	}

	@Override
	public void setXBB0085(String XBB0085) {
		_XBB0085 = XBB0085;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0085", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0085);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0086() {
		return _XBB0086;
	}

	@Override
	public void setXBB0086(String XBB0086) {
		_XBB0086 = XBB0086;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0086", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0086);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0087() {
		return _XBB0087;
	}

	@Override
	public void setXBB0087(String XBB0087) {
		_XBB0087 = XBB0087;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0087", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0087);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0088() {
		return _XBB0088;
	}

	@Override
	public void setXBB0088(String XBB0088) {
		_XBB0088 = XBB0088;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0088", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0088);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0089() {
		return _XBB0089;
	}

	@Override
	public void setXBB0089(String XBB0089) {
		_XBB0089 = XBB0089;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0089", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0089);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0090() {
		return _XBB0090;
	}

	@Override
	public void setXBB0090(String XBB0090) {
		_XBB0090 = XBB0090;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0090", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0090);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0091() {
		return _XBB0091;
	}

	@Override
	public void setXBB0091(String XBB0091) {
		_XBB0091 = XBB0091;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0091", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0091);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0092() {
		return _XBB0092;
	}

	@Override
	public void setXBB0092(String XBB0092) {
		_XBB0092 = XBB0092;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0092", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0092);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0093() {
		return _XBB0093;
	}

	@Override
	public void setXBB0093(String XBB0093) {
		_XBB0093 = XBB0093;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0093", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0093);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0094() {
		return _XBB0094;
	}

	@Override
	public void setXBB0094(String XBB0094) {
		_XBB0094 = XBB0094;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0094", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0094);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0095() {
		return _XBB0095;
	}

	@Override
	public void setXBB0095(String XBB0095) {
		_XBB0095 = XBB0095;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0095", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0095);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0096() {
		return _XBB0096;
	}

	@Override
	public void setXBB0096(String XBB0096) {
		_XBB0096 = XBB0096;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0096", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0096);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0097() {
		return _XBB0097;
	}

	@Override
	public void setXBB0097(String XBB0097) {
		_XBB0097 = XBB0097;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0097", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0097);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0098() {
		return _XBB0098;
	}

	@Override
	public void setXBB0098(String XBB0098) {
		_XBB0098 = XBB0098;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0098", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0098);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0099() {
		return _XBB0099;
	}

	@Override
	public void setXBB0099(String XBB0099) {
		_XBB0099 = XBB0099;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0099", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0099);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0100() {
		return _XBB0100;
	}

	@Override
	public void setXBB0100(String XBB0100) {
		_XBB0100 = XBB0100;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0100", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0100);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0101() {
		return _XBB0101;
	}

	@Override
	public void setXBB0101(String XBB0101) {
		_XBB0101 = XBB0101;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0101", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0101);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0102() {
		return _XBB0102;
	}

	@Override
	public void setXBB0102(String XBB0102) {
		_XBB0102 = XBB0102;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0102", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0102);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0103() {
		return _XBB0103;
	}

	@Override
	public void setXBB0103(String XBB0103) {
		_XBB0103 = XBB0103;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0103", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0103);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0104() {
		return _XBB0104;
	}

	@Override
	public void setXBB0104(String XBB0104) {
		_XBB0104 = XBB0104;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0104", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0104);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB2104() {
		return _XBB2104;
	}

	@Override
	public void setXBB2104(String XBB2104) {
		_XBB2104 = XBB2104;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB2104", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB2104);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0105() {
		return _XBB0105;
	}

	@Override
	public void setXBB0105(String XBB0105) {
		_XBB0105 = XBB0105;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0105", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0105);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB2105() {
		return _XBB2105;
	}

	@Override
	public void setXBB2105(String XBB2105) {
		_XBB2105 = XBB2105;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB2105", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB2105);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0106() {
		return _XBB0106;
	}

	@Override
	public void setXBB0106(String XBB0106) {
		_XBB0106 = XBB0106;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0106", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0106);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB2106() {
		return _XBB2106;
	}

	@Override
	public void setXBB2106(String XBB2106) {
		_XBB2106 = XBB2106;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB2106", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB2106);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0107() {
		return _XBB0107;
	}

	@Override
	public void setXBB0107(String XBB0107) {
		_XBB0107 = XBB0107;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0107", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0107);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB2107() {
		return _XBB2107;
	}

	@Override
	public void setXBB2107(String XBB2107) {
		_XBB2107 = XBB2107;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB2107", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB2107);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0108() {
		return _XBB0108;
	}

	@Override
	public void setXBB0108(String XBB0108) {
		_XBB0108 = XBB0108;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0108", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0108);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB2108() {
		return _XBB2108;
	}

	@Override
	public void setXBB2108(String XBB2108) {
		_XBB2108 = XBB2108;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB2108", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB2108);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0109() {
		return _XBB0109;
	}

	@Override
	public void setXBB0109(String XBB0109) {
		_XBB0109 = XBB0109;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0109", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0109);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB2109() {
		return _XBB2109;
	}

	@Override
	public void setXBB2109(String XBB2109) {
		_XBB2109 = XBB2109;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB2109", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB2109);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0110() {
		return _XBB0110;
	}

	@Override
	public void setXBB0110(String XBB0110) {
		_XBB0110 = XBB0110;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0110", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0110);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB2110() {
		return _XBB2110;
	}

	@Override
	public void setXBB2110(String XBB2110) {
		_XBB2110 = XBB2110;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB2110", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB2110);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0111() {
		return _XBB0111;
	}

	@Override
	public void setXBB0111(String XBB0111) {
		_XBB0111 = XBB0111;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0111", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0111);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB2111() {
		return _XBB2111;
	}

	@Override
	public void setXBB2111(String XBB2111) {
		_XBB2111 = XBB2111;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB2111", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB2111);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0112() {
		return _XBB0112;
	}

	@Override
	public void setXBB0112(String XBB0112) {
		_XBB0112 = XBB0112;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0112", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0112);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB2112() {
		return _XBB2112;
	}

	@Override
	public void setXBB2112(String XBB2112) {
		_XBB2112 = XBB2112;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB2112", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB2112);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0113() {
		return _XBB0113;
	}

	@Override
	public void setXBB0113(String XBB0113) {
		_XBB0113 = XBB0113;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0113", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0113);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB2113() {
		return _XBB2113;
	}

	@Override
	public void setXBB2113(String XBB2113) {
		_XBB2113 = XBB2113;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB2113", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB2113);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0114() {
		return _XBB0114;
	}

	@Override
	public void setXBB0114(String XBB0114) {
		_XBB0114 = XBB0114;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0114", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0114);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB2114() {
		return _XBB2114;
	}

	@Override
	public void setXBB2114(String XBB2114) {
		_XBB2114 = XBB2114;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB2114", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB2114);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0115() {
		return _XBB0115;
	}

	@Override
	public void setXBB0115(String XBB0115) {
		_XBB0115 = XBB0115;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0115", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0115);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB2115() {
		return _XBB2115;
	}

	@Override
	public void setXBB2115(String XBB2115) {
		_XBB2115 = XBB2115;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB2115", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB2115);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0116() {
		return _XBB0116;
	}

	@Override
	public void setXBB0116(String XBB0116) {
		_XBB0116 = XBB0116;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0116", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0116);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB2116() {
		return _XBB2116;
	}

	@Override
	public void setXBB2116(String XBB2116) {
		_XBB2116 = XBB2116;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB2116", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB2116);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0117() {
		return _XBB0117;
	}

	@Override
	public void setXBB0117(String XBB0117) {
		_XBB0117 = XBB0117;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0117", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0117);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB2117() {
		return _XBB2117;
	}

	@Override
	public void setXBB2117(String XBB2117) {
		_XBB2117 = XBB2117;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB2117", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB2117);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0118() {
		return _XBB0118;
	}

	@Override
	public void setXBB0118(String XBB0118) {
		_XBB0118 = XBB0118;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0118", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0118);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0119() {
		return _XBB0119;
	}

	@Override
	public void setXBB0119(String XBB0119) {
		_XBB0119 = XBB0119;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0119", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0119);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB2119() {
		return _XBB2119;
	}

	@Override
	public void setXBB2119(String XBB2119) {
		_XBB2119 = XBB2119;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB2119", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB2119);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0120() {
		return _XBB0120;
	}

	@Override
	public void setXBB0120(String XBB0120) {
		_XBB0120 = XBB0120;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0120", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0120);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0121() {
		return _XBB0121;
	}

	@Override
	public void setXBB0121(String XBB0121) {
		_XBB0121 = XBB0121;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0121", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0121);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0122() {
		return _XBB0122;
	}

	@Override
	public void setXBB0122(String XBB0122) {
		_XBB0122 = XBB0122;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0122", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0122);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0123() {
		return _XBB0123;
	}

	@Override
	public void setXBB0123(String XBB0123) {
		_XBB0123 = XBB0123;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0123", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0123);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0124() {
		return _XBB0124;
	}

	@Override
	public void setXBB0124(String XBB0124) {
		_XBB0124 = XBB0124;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0124", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0124);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0125() {
		return _XBB0125;
	}

	@Override
	public void setXBB0125(String XBB0125) {
		_XBB0125 = XBB0125;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0125", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0125);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB0126() {
		return _XBB0126;
	}

	@Override
	public void setXBB0126(String XBB0126) {
		_XBB0126 = XBB0126;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB0126", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB0126);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1084() {
		return _XBB1084;
	}

	@Override
	public void setXBB1084(String XBB1084) {
		_XBB1084 = XBB1084;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1084", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1084);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXBB1086() {
		return _XBB1086;
	}

	@Override
	public void setXBB1086(String XBB1086) {
		_XBB1086 = XBB1086;

		if (_thongsochungchixebonbanhRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixebonbanhRemoteModel.getClass();

				Method method = clazz.getMethod("setXBB1086", String.class);

				method.invoke(_thongsochungchixebonbanhRemoteModel, XBB1086);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTHONGSOCHUNGCHIXEBONBANHRemoteModel() {
		return _thongsochungchixebonbanhRemoteModel;
	}

	public void setTHONGSOCHUNGCHIXEBONBANHRemoteModel(
		BaseModel<?> thongsochungchixebonbanhRemoteModel) {
		_thongsochungchixebonbanhRemoteModel = thongsochungchixebonbanhRemoteModel;
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

		Class<?> remoteModelClass = _thongsochungchixebonbanhRemoteModel.getClass();

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

		Object returnValue = method.invoke(_thongsochungchixebonbanhRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			THONGSOCHUNGCHIXEBONBANHLocalServiceUtil.addTHONGSOCHUNGCHIXEBONBANH(this);
		}
		else {
			THONGSOCHUNGCHIXEBONBANHLocalServiceUtil.updateTHONGSOCHUNGCHIXEBONBANH(this);
		}
	}

	@Override
	public THONGSOCHUNGCHIXEBONBANH toEscapedModel() {
		return (THONGSOCHUNGCHIXEBONBANH)ProxyUtil.newProxyInstance(THONGSOCHUNGCHIXEBONBANH.class.getClassLoader(),
			new Class[] { THONGSOCHUNGCHIXEBONBANH.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		THONGSOCHUNGCHIXEBONBANHClp clone = new THONGSOCHUNGCHIXEBONBANHClp();

		clone.setId(getId());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setCertificateRecordId(getCertificateRecordId());
		clone.setVehicleGroupId(getVehicleGroupId());
		clone.setSynchDate(getSynchDate());
		clone.setXBB0009(getXBB0009());
		clone.setXBB0010(getXBB0010());
		clone.setXBB0011(getXBB0011());
		clone.setXBB0012(getXBB0012());
		clone.setXBB0013(getXBB0013());
		clone.setXBB0014(getXBB0014());
		clone.setXBB1014(getXBB1014());
		clone.setXBB1114(getXBB1114());
		clone.setXBB0015(getXBB0015());
		clone.setXBB1015(getXBB1015());
		clone.setXBB1115(getXBB1115());
		clone.setXBB0016(getXBB0016());
		clone.setXBB1016(getXBB1016());
		clone.setXBB1116(getXBB1116());
		clone.setXBB0017(getXBB0017());
		clone.setXBB1017(getXBB1017());
		clone.setXBB1117(getXBB1117());
		clone.setXBB0018(getXBB0018());
		clone.setXBB0019(getXBB0019());
		clone.setXBB0020(getXBB0020());
		clone.setXBB0021(getXBB0021());
		clone.setXBB0022(getXBB0022());
		clone.setXBB1022(getXBB1022());
		clone.setXBB0023(getXBB0023());
		clone.setXBB0024(getXBB0024());
		clone.setXBB0025(getXBB0025());
		clone.setXBB0026(getXBB0026());
		clone.setXBB1026(getXBB1026());
		clone.setXBB0027(getXBB0027());
		clone.setXBB1027(getXBB1027());
		clone.setXBB0028(getXBB0028());
		clone.setXBB0029(getXBB0029());
		clone.setXBB1029(getXBB1029());
		clone.setXBB0030(getXBB0030());
		clone.setXBB0031(getXBB0031());
		clone.setXBB0032(getXBB0032());
		clone.setXBB0033(getXBB0033());
		clone.setXBB1033(getXBB1033());
		clone.setXBB0034(getXBB0034());
		clone.setXBB1034(getXBB1034());
		clone.setXBB0035(getXBB0035());
		clone.setXBB0036(getXBB0036());
		clone.setXBB1036(getXBB1036());
		clone.setXBB0037(getXBB0037());
		clone.setXBB0038(getXBB0038());
		clone.setXBB0039(getXBB0039());
		clone.setXBB0040(getXBB0040());
		clone.setXBB0041(getXBB0041());
		clone.setXBB0042(getXBB0042());
		clone.setXBB0043(getXBB0043());
		clone.setXBB0044(getXBB0044());
		clone.setXBB1044(getXBB1044());
		clone.setXBB0045(getXBB0045());
		clone.setXBB0046(getXBB0046());
		clone.setXBB0047(getXBB0047());
		clone.setXBB0048(getXBB0048());
		clone.setXBB0049(getXBB0049());
		clone.setXBB0050(getXBB0050());
		clone.setXBB0051(getXBB0051());
		clone.setXBB0052(getXBB0052());
		clone.setXBB0053(getXBB0053());
		clone.setXBB0054(getXBB0054());
		clone.setXBB0055(getXBB0055());
		clone.setXBB0056(getXBB0056());
		clone.setXBB0057(getXBB0057());
		clone.setXBB0058(getXBB0058());
		clone.setXBB0059(getXBB0059());
		clone.setXBB0060(getXBB0060());
		clone.setXBB0061(getXBB0061());
		clone.setXBB0062(getXBB0062());
		clone.setXBB0063(getXBB0063());
		clone.setXBB0076(getXBB0076());
		clone.setXBB0077(getXBB0077());
		clone.setXBB0078(getXBB0078());
		clone.setXBB0079(getXBB0079());
		clone.setXBB0080(getXBB0080());
		clone.setXBB1080(getXBB1080());
		clone.setXBB0081(getXBB0081());
		clone.setXBB1081(getXBB1081());
		clone.setXBB1181(getXBB1181());
		clone.setXBB0082(getXBB0082());
		clone.setXBB1082(getXBB1082());
		clone.setXBB1182(getXBB1182());
		clone.setXBB0083(getXBB0083());
		clone.setXBB1083(getXBB1083());
		clone.setXBB1183(getXBB1183());
		clone.setXBB0084(getXBB0084());
		clone.setXBB0085(getXBB0085());
		clone.setXBB0086(getXBB0086());
		clone.setXBB0087(getXBB0087());
		clone.setXBB0088(getXBB0088());
		clone.setXBB0089(getXBB0089());
		clone.setXBB0090(getXBB0090());
		clone.setXBB0091(getXBB0091());
		clone.setXBB0092(getXBB0092());
		clone.setXBB0093(getXBB0093());
		clone.setXBB0094(getXBB0094());
		clone.setXBB0095(getXBB0095());
		clone.setXBB0096(getXBB0096());
		clone.setXBB0097(getXBB0097());
		clone.setXBB0098(getXBB0098());
		clone.setXBB0099(getXBB0099());
		clone.setXBB0100(getXBB0100());
		clone.setXBB0101(getXBB0101());
		clone.setXBB0102(getXBB0102());
		clone.setXBB0103(getXBB0103());
		clone.setXBB0104(getXBB0104());
		clone.setXBB2104(getXBB2104());
		clone.setXBB0105(getXBB0105());
		clone.setXBB2105(getXBB2105());
		clone.setXBB0106(getXBB0106());
		clone.setXBB2106(getXBB2106());
		clone.setXBB0107(getXBB0107());
		clone.setXBB2107(getXBB2107());
		clone.setXBB0108(getXBB0108());
		clone.setXBB2108(getXBB2108());
		clone.setXBB0109(getXBB0109());
		clone.setXBB2109(getXBB2109());
		clone.setXBB0110(getXBB0110());
		clone.setXBB2110(getXBB2110());
		clone.setXBB0111(getXBB0111());
		clone.setXBB2111(getXBB2111());
		clone.setXBB0112(getXBB0112());
		clone.setXBB2112(getXBB2112());
		clone.setXBB0113(getXBB0113());
		clone.setXBB2113(getXBB2113());
		clone.setXBB0114(getXBB0114());
		clone.setXBB2114(getXBB2114());
		clone.setXBB0115(getXBB0115());
		clone.setXBB2115(getXBB2115());
		clone.setXBB0116(getXBB0116());
		clone.setXBB2116(getXBB2116());
		clone.setXBB0117(getXBB0117());
		clone.setXBB2117(getXBB2117());
		clone.setXBB0118(getXBB0118());
		clone.setXBB0119(getXBB0119());
		clone.setXBB2119(getXBB2119());
		clone.setXBB0120(getXBB0120());
		clone.setXBB0121(getXBB0121());
		clone.setXBB0122(getXBB0122());
		clone.setXBB0123(getXBB0123());
		clone.setXBB0124(getXBB0124());
		clone.setXBB0125(getXBB0125());
		clone.setXBB0126(getXBB0126());
		clone.setXBB1084(getXBB1084());
		clone.setXBB1086(getXBB1086());

		return clone;
	}

	@Override
	public int compareTo(THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh) {
		int value = 0;

		if (getId() < thongsochungchixebonbanh.getId()) {
			value = -1;
		}
		else if (getId() > thongsochungchixebonbanh.getId()) {
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

		if (!(obj instanceof THONGSOCHUNGCHIXEBONBANHClp)) {
			return false;
		}

		THONGSOCHUNGCHIXEBONBANHClp thongsochungchixebonbanh = (THONGSOCHUNGCHIXEBONBANHClp)obj;

		long primaryKey = thongsochungchixebonbanh.getPrimaryKey();

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
		StringBundler sb = new StringBundler(303);

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
		sb.append(", XBB0009=");
		sb.append(getXBB0009());
		sb.append(", XBB0010=");
		sb.append(getXBB0010());
		sb.append(", XBB0011=");
		sb.append(getXBB0011());
		sb.append(", XBB0012=");
		sb.append(getXBB0012());
		sb.append(", XBB0013=");
		sb.append(getXBB0013());
		sb.append(", XBB0014=");
		sb.append(getXBB0014());
		sb.append(", XBB1014=");
		sb.append(getXBB1014());
		sb.append(", XBB1114=");
		sb.append(getXBB1114());
		sb.append(", XBB0015=");
		sb.append(getXBB0015());
		sb.append(", XBB1015=");
		sb.append(getXBB1015());
		sb.append(", XBB1115=");
		sb.append(getXBB1115());
		sb.append(", XBB0016=");
		sb.append(getXBB0016());
		sb.append(", XBB1016=");
		sb.append(getXBB1016());
		sb.append(", XBB1116=");
		sb.append(getXBB1116());
		sb.append(", XBB0017=");
		sb.append(getXBB0017());
		sb.append(", XBB1017=");
		sb.append(getXBB1017());
		sb.append(", XBB1117=");
		sb.append(getXBB1117());
		sb.append(", XBB0018=");
		sb.append(getXBB0018());
		sb.append(", XBB0019=");
		sb.append(getXBB0019());
		sb.append(", XBB0020=");
		sb.append(getXBB0020());
		sb.append(", XBB0021=");
		sb.append(getXBB0021());
		sb.append(", XBB0022=");
		sb.append(getXBB0022());
		sb.append(", XBB1022=");
		sb.append(getXBB1022());
		sb.append(", XBB0023=");
		sb.append(getXBB0023());
		sb.append(", XBB0024=");
		sb.append(getXBB0024());
		sb.append(", XBB0025=");
		sb.append(getXBB0025());
		sb.append(", XBB0026=");
		sb.append(getXBB0026());
		sb.append(", XBB1026=");
		sb.append(getXBB1026());
		sb.append(", XBB0027=");
		sb.append(getXBB0027());
		sb.append(", XBB1027=");
		sb.append(getXBB1027());
		sb.append(", XBB0028=");
		sb.append(getXBB0028());
		sb.append(", XBB0029=");
		sb.append(getXBB0029());
		sb.append(", XBB1029=");
		sb.append(getXBB1029());
		sb.append(", XBB0030=");
		sb.append(getXBB0030());
		sb.append(", XBB0031=");
		sb.append(getXBB0031());
		sb.append(", XBB0032=");
		sb.append(getXBB0032());
		sb.append(", XBB0033=");
		sb.append(getXBB0033());
		sb.append(", XBB1033=");
		sb.append(getXBB1033());
		sb.append(", XBB0034=");
		sb.append(getXBB0034());
		sb.append(", XBB1034=");
		sb.append(getXBB1034());
		sb.append(", XBB0035=");
		sb.append(getXBB0035());
		sb.append(", XBB0036=");
		sb.append(getXBB0036());
		sb.append(", XBB1036=");
		sb.append(getXBB1036());
		sb.append(", XBB0037=");
		sb.append(getXBB0037());
		sb.append(", XBB0038=");
		sb.append(getXBB0038());
		sb.append(", XBB0039=");
		sb.append(getXBB0039());
		sb.append(", XBB0040=");
		sb.append(getXBB0040());
		sb.append(", XBB0041=");
		sb.append(getXBB0041());
		sb.append(", XBB0042=");
		sb.append(getXBB0042());
		sb.append(", XBB0043=");
		sb.append(getXBB0043());
		sb.append(", XBB0044=");
		sb.append(getXBB0044());
		sb.append(", XBB1044=");
		sb.append(getXBB1044());
		sb.append(", XBB0045=");
		sb.append(getXBB0045());
		sb.append(", XBB0046=");
		sb.append(getXBB0046());
		sb.append(", XBB0047=");
		sb.append(getXBB0047());
		sb.append(", XBB0048=");
		sb.append(getXBB0048());
		sb.append(", XBB0049=");
		sb.append(getXBB0049());
		sb.append(", XBB0050=");
		sb.append(getXBB0050());
		sb.append(", XBB0051=");
		sb.append(getXBB0051());
		sb.append(", XBB0052=");
		sb.append(getXBB0052());
		sb.append(", XBB0053=");
		sb.append(getXBB0053());
		sb.append(", XBB0054=");
		sb.append(getXBB0054());
		sb.append(", XBB0055=");
		sb.append(getXBB0055());
		sb.append(", XBB0056=");
		sb.append(getXBB0056());
		sb.append(", XBB0057=");
		sb.append(getXBB0057());
		sb.append(", XBB0058=");
		sb.append(getXBB0058());
		sb.append(", XBB0059=");
		sb.append(getXBB0059());
		sb.append(", XBB0060=");
		sb.append(getXBB0060());
		sb.append(", XBB0061=");
		sb.append(getXBB0061());
		sb.append(", XBB0062=");
		sb.append(getXBB0062());
		sb.append(", XBB0063=");
		sb.append(getXBB0063());
		sb.append(", XBB0076=");
		sb.append(getXBB0076());
		sb.append(", XBB0077=");
		sb.append(getXBB0077());
		sb.append(", XBB0078=");
		sb.append(getXBB0078());
		sb.append(", XBB0079=");
		sb.append(getXBB0079());
		sb.append(", XBB0080=");
		sb.append(getXBB0080());
		sb.append(", XBB1080=");
		sb.append(getXBB1080());
		sb.append(", XBB0081=");
		sb.append(getXBB0081());
		sb.append(", XBB1081=");
		sb.append(getXBB1081());
		sb.append(", XBB1181=");
		sb.append(getXBB1181());
		sb.append(", XBB0082=");
		sb.append(getXBB0082());
		sb.append(", XBB1082=");
		sb.append(getXBB1082());
		sb.append(", XBB1182=");
		sb.append(getXBB1182());
		sb.append(", XBB0083=");
		sb.append(getXBB0083());
		sb.append(", XBB1083=");
		sb.append(getXBB1083());
		sb.append(", XBB1183=");
		sb.append(getXBB1183());
		sb.append(", XBB0084=");
		sb.append(getXBB0084());
		sb.append(", XBB0085=");
		sb.append(getXBB0085());
		sb.append(", XBB0086=");
		sb.append(getXBB0086());
		sb.append(", XBB0087=");
		sb.append(getXBB0087());
		sb.append(", XBB0088=");
		sb.append(getXBB0088());
		sb.append(", XBB0089=");
		sb.append(getXBB0089());
		sb.append(", XBB0090=");
		sb.append(getXBB0090());
		sb.append(", XBB0091=");
		sb.append(getXBB0091());
		sb.append(", XBB0092=");
		sb.append(getXBB0092());
		sb.append(", XBB0093=");
		sb.append(getXBB0093());
		sb.append(", XBB0094=");
		sb.append(getXBB0094());
		sb.append(", XBB0095=");
		sb.append(getXBB0095());
		sb.append(", XBB0096=");
		sb.append(getXBB0096());
		sb.append(", XBB0097=");
		sb.append(getXBB0097());
		sb.append(", XBB0098=");
		sb.append(getXBB0098());
		sb.append(", XBB0099=");
		sb.append(getXBB0099());
		sb.append(", XBB0100=");
		sb.append(getXBB0100());
		sb.append(", XBB0101=");
		sb.append(getXBB0101());
		sb.append(", XBB0102=");
		sb.append(getXBB0102());
		sb.append(", XBB0103=");
		sb.append(getXBB0103());
		sb.append(", XBB0104=");
		sb.append(getXBB0104());
		sb.append(", XBB2104=");
		sb.append(getXBB2104());
		sb.append(", XBB0105=");
		sb.append(getXBB0105());
		sb.append(", XBB2105=");
		sb.append(getXBB2105());
		sb.append(", XBB0106=");
		sb.append(getXBB0106());
		sb.append(", XBB2106=");
		sb.append(getXBB2106());
		sb.append(", XBB0107=");
		sb.append(getXBB0107());
		sb.append(", XBB2107=");
		sb.append(getXBB2107());
		sb.append(", XBB0108=");
		sb.append(getXBB0108());
		sb.append(", XBB2108=");
		sb.append(getXBB2108());
		sb.append(", XBB0109=");
		sb.append(getXBB0109());
		sb.append(", XBB2109=");
		sb.append(getXBB2109());
		sb.append(", XBB0110=");
		sb.append(getXBB0110());
		sb.append(", XBB2110=");
		sb.append(getXBB2110());
		sb.append(", XBB0111=");
		sb.append(getXBB0111());
		sb.append(", XBB2111=");
		sb.append(getXBB2111());
		sb.append(", XBB0112=");
		sb.append(getXBB0112());
		sb.append(", XBB2112=");
		sb.append(getXBB2112());
		sb.append(", XBB0113=");
		sb.append(getXBB0113());
		sb.append(", XBB2113=");
		sb.append(getXBB2113());
		sb.append(", XBB0114=");
		sb.append(getXBB0114());
		sb.append(", XBB2114=");
		sb.append(getXBB2114());
		sb.append(", XBB0115=");
		sb.append(getXBB0115());
		sb.append(", XBB2115=");
		sb.append(getXBB2115());
		sb.append(", XBB0116=");
		sb.append(getXBB0116());
		sb.append(", XBB2116=");
		sb.append(getXBB2116());
		sb.append(", XBB0117=");
		sb.append(getXBB0117());
		sb.append(", XBB2117=");
		sb.append(getXBB2117());
		sb.append(", XBB0118=");
		sb.append(getXBB0118());
		sb.append(", XBB0119=");
		sb.append(getXBB0119());
		sb.append(", XBB2119=");
		sb.append(getXBB2119());
		sb.append(", XBB0120=");
		sb.append(getXBB0120());
		sb.append(", XBB0121=");
		sb.append(getXBB0121());
		sb.append(", XBB0122=");
		sb.append(getXBB0122());
		sb.append(", XBB0123=");
		sb.append(getXBB0123());
		sb.append(", XBB0124=");
		sb.append(getXBB0124());
		sb.append(", XBB0125=");
		sb.append(getXBB0125());
		sb.append(", XBB0126=");
		sb.append(getXBB0126());
		sb.append(", XBB1084=");
		sb.append(getXBB1084());
		sb.append(", XBB1086=");
		sb.append(getXBB1086());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(457);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEBONBANH");
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
			"<column><column-name>XBB0009</column-name><column-value><![CDATA[");
		sb.append(getXBB0009());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0010</column-name><column-value><![CDATA[");
		sb.append(getXBB0010());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0011</column-name><column-value><![CDATA[");
		sb.append(getXBB0011());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0012</column-name><column-value><![CDATA[");
		sb.append(getXBB0012());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0013</column-name><column-value><![CDATA[");
		sb.append(getXBB0013());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0014</column-name><column-value><![CDATA[");
		sb.append(getXBB0014());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1014</column-name><column-value><![CDATA[");
		sb.append(getXBB1014());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1114</column-name><column-value><![CDATA[");
		sb.append(getXBB1114());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0015</column-name><column-value><![CDATA[");
		sb.append(getXBB0015());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1015</column-name><column-value><![CDATA[");
		sb.append(getXBB1015());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1115</column-name><column-value><![CDATA[");
		sb.append(getXBB1115());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0016</column-name><column-value><![CDATA[");
		sb.append(getXBB0016());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1016</column-name><column-value><![CDATA[");
		sb.append(getXBB1016());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1116</column-name><column-value><![CDATA[");
		sb.append(getXBB1116());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0017</column-name><column-value><![CDATA[");
		sb.append(getXBB0017());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1017</column-name><column-value><![CDATA[");
		sb.append(getXBB1017());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1117</column-name><column-value><![CDATA[");
		sb.append(getXBB1117());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0018</column-name><column-value><![CDATA[");
		sb.append(getXBB0018());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0019</column-name><column-value><![CDATA[");
		sb.append(getXBB0019());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0020</column-name><column-value><![CDATA[");
		sb.append(getXBB0020());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0021</column-name><column-value><![CDATA[");
		sb.append(getXBB0021());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0022</column-name><column-value><![CDATA[");
		sb.append(getXBB0022());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1022</column-name><column-value><![CDATA[");
		sb.append(getXBB1022());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0023</column-name><column-value><![CDATA[");
		sb.append(getXBB0023());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0024</column-name><column-value><![CDATA[");
		sb.append(getXBB0024());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0025</column-name><column-value><![CDATA[");
		sb.append(getXBB0025());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0026</column-name><column-value><![CDATA[");
		sb.append(getXBB0026());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1026</column-name><column-value><![CDATA[");
		sb.append(getXBB1026());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0027</column-name><column-value><![CDATA[");
		sb.append(getXBB0027());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1027</column-name><column-value><![CDATA[");
		sb.append(getXBB1027());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0028</column-name><column-value><![CDATA[");
		sb.append(getXBB0028());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0029</column-name><column-value><![CDATA[");
		sb.append(getXBB0029());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1029</column-name><column-value><![CDATA[");
		sb.append(getXBB1029());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0030</column-name><column-value><![CDATA[");
		sb.append(getXBB0030());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0031</column-name><column-value><![CDATA[");
		sb.append(getXBB0031());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0032</column-name><column-value><![CDATA[");
		sb.append(getXBB0032());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0033</column-name><column-value><![CDATA[");
		sb.append(getXBB0033());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1033</column-name><column-value><![CDATA[");
		sb.append(getXBB1033());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0034</column-name><column-value><![CDATA[");
		sb.append(getXBB0034());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1034</column-name><column-value><![CDATA[");
		sb.append(getXBB1034());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0035</column-name><column-value><![CDATA[");
		sb.append(getXBB0035());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0036</column-name><column-value><![CDATA[");
		sb.append(getXBB0036());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1036</column-name><column-value><![CDATA[");
		sb.append(getXBB1036());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0037</column-name><column-value><![CDATA[");
		sb.append(getXBB0037());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0038</column-name><column-value><![CDATA[");
		sb.append(getXBB0038());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0039</column-name><column-value><![CDATA[");
		sb.append(getXBB0039());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0040</column-name><column-value><![CDATA[");
		sb.append(getXBB0040());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0041</column-name><column-value><![CDATA[");
		sb.append(getXBB0041());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0042</column-name><column-value><![CDATA[");
		sb.append(getXBB0042());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0043</column-name><column-value><![CDATA[");
		sb.append(getXBB0043());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0044</column-name><column-value><![CDATA[");
		sb.append(getXBB0044());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1044</column-name><column-value><![CDATA[");
		sb.append(getXBB1044());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0045</column-name><column-value><![CDATA[");
		sb.append(getXBB0045());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0046</column-name><column-value><![CDATA[");
		sb.append(getXBB0046());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0047</column-name><column-value><![CDATA[");
		sb.append(getXBB0047());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0048</column-name><column-value><![CDATA[");
		sb.append(getXBB0048());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0049</column-name><column-value><![CDATA[");
		sb.append(getXBB0049());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0050</column-name><column-value><![CDATA[");
		sb.append(getXBB0050());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0051</column-name><column-value><![CDATA[");
		sb.append(getXBB0051());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0052</column-name><column-value><![CDATA[");
		sb.append(getXBB0052());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0053</column-name><column-value><![CDATA[");
		sb.append(getXBB0053());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0054</column-name><column-value><![CDATA[");
		sb.append(getXBB0054());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0055</column-name><column-value><![CDATA[");
		sb.append(getXBB0055());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0056</column-name><column-value><![CDATA[");
		sb.append(getXBB0056());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0057</column-name><column-value><![CDATA[");
		sb.append(getXBB0057());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0058</column-name><column-value><![CDATA[");
		sb.append(getXBB0058());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0059</column-name><column-value><![CDATA[");
		sb.append(getXBB0059());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0060</column-name><column-value><![CDATA[");
		sb.append(getXBB0060());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0061</column-name><column-value><![CDATA[");
		sb.append(getXBB0061());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0062</column-name><column-value><![CDATA[");
		sb.append(getXBB0062());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0063</column-name><column-value><![CDATA[");
		sb.append(getXBB0063());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0076</column-name><column-value><![CDATA[");
		sb.append(getXBB0076());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0077</column-name><column-value><![CDATA[");
		sb.append(getXBB0077());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0078</column-name><column-value><![CDATA[");
		sb.append(getXBB0078());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0079</column-name><column-value><![CDATA[");
		sb.append(getXBB0079());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0080</column-name><column-value><![CDATA[");
		sb.append(getXBB0080());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1080</column-name><column-value><![CDATA[");
		sb.append(getXBB1080());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0081</column-name><column-value><![CDATA[");
		sb.append(getXBB0081());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1081</column-name><column-value><![CDATA[");
		sb.append(getXBB1081());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1181</column-name><column-value><![CDATA[");
		sb.append(getXBB1181());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0082</column-name><column-value><![CDATA[");
		sb.append(getXBB0082());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1082</column-name><column-value><![CDATA[");
		sb.append(getXBB1082());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1182</column-name><column-value><![CDATA[");
		sb.append(getXBB1182());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0083</column-name><column-value><![CDATA[");
		sb.append(getXBB0083());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1083</column-name><column-value><![CDATA[");
		sb.append(getXBB1083());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1183</column-name><column-value><![CDATA[");
		sb.append(getXBB1183());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0084</column-name><column-value><![CDATA[");
		sb.append(getXBB0084());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0085</column-name><column-value><![CDATA[");
		sb.append(getXBB0085());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0086</column-name><column-value><![CDATA[");
		sb.append(getXBB0086());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0087</column-name><column-value><![CDATA[");
		sb.append(getXBB0087());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0088</column-name><column-value><![CDATA[");
		sb.append(getXBB0088());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0089</column-name><column-value><![CDATA[");
		sb.append(getXBB0089());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0090</column-name><column-value><![CDATA[");
		sb.append(getXBB0090());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0091</column-name><column-value><![CDATA[");
		sb.append(getXBB0091());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0092</column-name><column-value><![CDATA[");
		sb.append(getXBB0092());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0093</column-name><column-value><![CDATA[");
		sb.append(getXBB0093());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0094</column-name><column-value><![CDATA[");
		sb.append(getXBB0094());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0095</column-name><column-value><![CDATA[");
		sb.append(getXBB0095());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0096</column-name><column-value><![CDATA[");
		sb.append(getXBB0096());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0097</column-name><column-value><![CDATA[");
		sb.append(getXBB0097());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0098</column-name><column-value><![CDATA[");
		sb.append(getXBB0098());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0099</column-name><column-value><![CDATA[");
		sb.append(getXBB0099());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0100</column-name><column-value><![CDATA[");
		sb.append(getXBB0100());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0101</column-name><column-value><![CDATA[");
		sb.append(getXBB0101());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0102</column-name><column-value><![CDATA[");
		sb.append(getXBB0102());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0103</column-name><column-value><![CDATA[");
		sb.append(getXBB0103());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0104</column-name><column-value><![CDATA[");
		sb.append(getXBB0104());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB2104</column-name><column-value><![CDATA[");
		sb.append(getXBB2104());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0105</column-name><column-value><![CDATA[");
		sb.append(getXBB0105());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB2105</column-name><column-value><![CDATA[");
		sb.append(getXBB2105());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0106</column-name><column-value><![CDATA[");
		sb.append(getXBB0106());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB2106</column-name><column-value><![CDATA[");
		sb.append(getXBB2106());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0107</column-name><column-value><![CDATA[");
		sb.append(getXBB0107());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB2107</column-name><column-value><![CDATA[");
		sb.append(getXBB2107());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0108</column-name><column-value><![CDATA[");
		sb.append(getXBB0108());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB2108</column-name><column-value><![CDATA[");
		sb.append(getXBB2108());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0109</column-name><column-value><![CDATA[");
		sb.append(getXBB0109());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB2109</column-name><column-value><![CDATA[");
		sb.append(getXBB2109());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0110</column-name><column-value><![CDATA[");
		sb.append(getXBB0110());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB2110</column-name><column-value><![CDATA[");
		sb.append(getXBB2110());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0111</column-name><column-value><![CDATA[");
		sb.append(getXBB0111());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB2111</column-name><column-value><![CDATA[");
		sb.append(getXBB2111());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0112</column-name><column-value><![CDATA[");
		sb.append(getXBB0112());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB2112</column-name><column-value><![CDATA[");
		sb.append(getXBB2112());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0113</column-name><column-value><![CDATA[");
		sb.append(getXBB0113());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB2113</column-name><column-value><![CDATA[");
		sb.append(getXBB2113());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0114</column-name><column-value><![CDATA[");
		sb.append(getXBB0114());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB2114</column-name><column-value><![CDATA[");
		sb.append(getXBB2114());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0115</column-name><column-value><![CDATA[");
		sb.append(getXBB0115());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB2115</column-name><column-value><![CDATA[");
		sb.append(getXBB2115());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0116</column-name><column-value><![CDATA[");
		sb.append(getXBB0116());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB2116</column-name><column-value><![CDATA[");
		sb.append(getXBB2116());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0117</column-name><column-value><![CDATA[");
		sb.append(getXBB0117());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB2117</column-name><column-value><![CDATA[");
		sb.append(getXBB2117());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0118</column-name><column-value><![CDATA[");
		sb.append(getXBB0118());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0119</column-name><column-value><![CDATA[");
		sb.append(getXBB0119());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB2119</column-name><column-value><![CDATA[");
		sb.append(getXBB2119());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0120</column-name><column-value><![CDATA[");
		sb.append(getXBB0120());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0121</column-name><column-value><![CDATA[");
		sb.append(getXBB0121());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0122</column-name><column-value><![CDATA[");
		sb.append(getXBB0122());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0123</column-name><column-value><![CDATA[");
		sb.append(getXBB0123());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0124</column-name><column-value><![CDATA[");
		sb.append(getXBB0124());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0125</column-name><column-value><![CDATA[");
		sb.append(getXBB0125());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB0126</column-name><column-value><![CDATA[");
		sb.append(getXBB0126());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1084</column-name><column-value><![CDATA[");
		sb.append(getXBB1084());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XBB1086</column-name><column-value><![CDATA[");
		sb.append(getXBB1086());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _hoSoThuTucId;
	private long _certificateRecordId;
	private long _vehicleGroupId;
	private Date _SynchDate;
	private String _XBB0009;
	private String _XBB0010;
	private String _XBB0011;
	private String _XBB0012;
	private String _XBB0013;
	private String _XBB0014;
	private String _XBB1014;
	private String _XBB1114;
	private String _XBB0015;
	private String _XBB1015;
	private String _XBB1115;
	private String _XBB0016;
	private String _XBB1016;
	private String _XBB1116;
	private String _XBB0017;
	private String _XBB1017;
	private String _XBB1117;
	private String _XBB0018;
	private String _XBB0019;
	private String _XBB0020;
	private String _XBB0021;
	private String _XBB0022;
	private String _XBB1022;
	private String _XBB0023;
	private String _XBB0024;
	private String _XBB0025;
	private String _XBB0026;
	private String _XBB1026;
	private String _XBB0027;
	private String _XBB1027;
	private String _XBB0028;
	private String _XBB0029;
	private String _XBB1029;
	private String _XBB0030;
	private String _XBB0031;
	private String _XBB0032;
	private String _XBB0033;
	private String _XBB1033;
	private String _XBB0034;
	private String _XBB1034;
	private String _XBB0035;
	private String _XBB0036;
	private String _XBB1036;
	private String _XBB0037;
	private String _XBB0038;
	private String _XBB0039;
	private String _XBB0040;
	private String _XBB0041;
	private String _XBB0042;
	private String _XBB0043;
	private String _XBB0044;
	private String _XBB1044;
	private String _XBB0045;
	private String _XBB0046;
	private String _XBB0047;
	private String _XBB0048;
	private String _XBB0049;
	private String _XBB0050;
	private String _XBB0051;
	private String _XBB0052;
	private String _XBB0053;
	private String _XBB0054;
	private String _XBB0055;
	private String _XBB0056;
	private String _XBB0057;
	private String _XBB0058;
	private String _XBB0059;
	private String _XBB0060;
	private String _XBB0061;
	private String _XBB0062;
	private String _XBB0063;
	private String _XBB0076;
	private String _XBB0077;
	private String _XBB0078;
	private String _XBB0079;
	private String _XBB0080;
	private String _XBB1080;
	private String _XBB0081;
	private String _XBB1081;
	private String _XBB1181;
	private String _XBB0082;
	private String _XBB1082;
	private String _XBB1182;
	private String _XBB0083;
	private String _XBB1083;
	private String _XBB1183;
	private String _XBB0084;
	private String _XBB0085;
	private String _XBB0086;
	private String _XBB0087;
	private String _XBB0088;
	private String _XBB0089;
	private String _XBB0090;
	private String _XBB0091;
	private String _XBB0092;
	private String _XBB0093;
	private String _XBB0094;
	private String _XBB0095;
	private String _XBB0096;
	private String _XBB0097;
	private String _XBB0098;
	private String _XBB0099;
	private String _XBB0100;
	private String _XBB0101;
	private String _XBB0102;
	private String _XBB0103;
	private String _XBB0104;
	private String _XBB2104;
	private String _XBB0105;
	private String _XBB2105;
	private String _XBB0106;
	private String _XBB2106;
	private String _XBB0107;
	private String _XBB2107;
	private String _XBB0108;
	private String _XBB2108;
	private String _XBB0109;
	private String _XBB2109;
	private String _XBB0110;
	private String _XBB2110;
	private String _XBB0111;
	private String _XBB2111;
	private String _XBB0112;
	private String _XBB2112;
	private String _XBB0113;
	private String _XBB2113;
	private String _XBB0114;
	private String _XBB2114;
	private String _XBB0115;
	private String _XBB2115;
	private String _XBB0116;
	private String _XBB2116;
	private String _XBB0117;
	private String _XBB2117;
	private String _XBB0118;
	private String _XBB0119;
	private String _XBB2119;
	private String _XBB0120;
	private String _XBB0121;
	private String _XBB0122;
	private String _XBB0123;
	private String _XBB0124;
	private String _XBB0125;
	private String _XBB0126;
	private String _XBB1084;
	private String _XBB1086;
	private BaseModel<?> _thongsochungchixebonbanhRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.class;
}