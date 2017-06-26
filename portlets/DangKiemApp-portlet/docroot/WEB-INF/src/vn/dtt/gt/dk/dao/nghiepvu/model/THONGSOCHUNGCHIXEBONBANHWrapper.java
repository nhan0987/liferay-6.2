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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link THONGSOCHUNGCHIXEBONBANH}.
 * </p>
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXEBONBANH
 * @generated
 */
public class THONGSOCHUNGCHIXEBONBANHWrapper implements THONGSOCHUNGCHIXEBONBANH,
	ModelWrapper<THONGSOCHUNGCHIXEBONBANH> {
	public THONGSOCHUNGCHIXEBONBANHWrapper(
		THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh) {
		_thongsochungchixebonbanh = thongsochungchixebonbanh;
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

	/**
	* Returns the primary key of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the primary key of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public long getPrimaryKey() {
		return _thongsochungchixebonbanh.getPrimaryKey();
	}

	/**
	* Sets the primary key of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param primaryKey the primary key of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_thongsochungchixebonbanh.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the ID of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public long getId() {
		return _thongsochungchixebonbanh.getId();
	}

	/**
	* Sets the ID of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param id the ID of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setId(long id) {
		_thongsochungchixebonbanh.setId(id);
	}

	/**
	* Returns the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public long getHoSoThuTucId() {
		return _thongsochungchixebonbanh.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_thongsochungchixebonbanh.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the certificate record ID of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the certificate record ID of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public long getCertificateRecordId() {
		return _thongsochungchixebonbanh.getCertificateRecordId();
	}

	/**
	* Sets the certificate record ID of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param certificateRecordId the certificate record ID of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_thongsochungchixebonbanh.setCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns the vehicle group ID of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the vehicle group ID of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public long getVehicleGroupId() {
		return _thongsochungchixebonbanh.getVehicleGroupId();
	}

	/**
	* Sets the vehicle group ID of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param vehicleGroupId the vehicle group ID of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_thongsochungchixebonbanh.setVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns the synch date of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the synch date of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.util.Date getSynchDate() {
		return _thongsochungchixebonbanh.getSynchDate();
	}

	/**
	* Sets the synch date of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param SynchDate the synch date of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setSynchDate(java.util.Date SynchDate) {
		_thongsochungchixebonbanh.setSynchDate(SynchDate);
	}

	/**
	* Returns the x b b0009 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0009 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0009() {
		return _thongsochungchixebonbanh.getXBB0009();
	}

	/**
	* Sets the x b b0009 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0009 the x b b0009 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0009(java.lang.String XBB0009) {
		_thongsochungchixebonbanh.setXBB0009(XBB0009);
	}

	/**
	* Returns the x b b0010 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0010 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0010() {
		return _thongsochungchixebonbanh.getXBB0010();
	}

	/**
	* Sets the x b b0010 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0010 the x b b0010 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0010(java.lang.String XBB0010) {
		_thongsochungchixebonbanh.setXBB0010(XBB0010);
	}

	/**
	* Returns the x b b0011 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0011 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0011() {
		return _thongsochungchixebonbanh.getXBB0011();
	}

	/**
	* Sets the x b b0011 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0011 the x b b0011 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0011(java.lang.String XBB0011) {
		_thongsochungchixebonbanh.setXBB0011(XBB0011);
	}

	/**
	* Returns the x b b0012 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0012 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0012() {
		return _thongsochungchixebonbanh.getXBB0012();
	}

	/**
	* Sets the x b b0012 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0012 the x b b0012 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0012(java.lang.String XBB0012) {
		_thongsochungchixebonbanh.setXBB0012(XBB0012);
	}

	/**
	* Returns the x b b0013 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0013 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0013() {
		return _thongsochungchixebonbanh.getXBB0013();
	}

	/**
	* Sets the x b b0013 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0013 the x b b0013 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0013(java.lang.String XBB0013) {
		_thongsochungchixebonbanh.setXBB0013(XBB0013);
	}

	/**
	* Returns the x b b0014 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0014 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0014() {
		return _thongsochungchixebonbanh.getXBB0014();
	}

	/**
	* Sets the x b b0014 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0014 the x b b0014 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0014(java.lang.String XBB0014) {
		_thongsochungchixebonbanh.setXBB0014(XBB0014);
	}

	/**
	* Returns the x b b1014 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1014 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1014() {
		return _thongsochungchixebonbanh.getXBB1014();
	}

	/**
	* Sets the x b b1014 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1014 the x b b1014 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1014(java.lang.String XBB1014) {
		_thongsochungchixebonbanh.setXBB1014(XBB1014);
	}

	/**
	* Returns the x b b1114 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1114 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1114() {
		return _thongsochungchixebonbanh.getXBB1114();
	}

	/**
	* Sets the x b b1114 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1114 the x b b1114 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1114(java.lang.String XBB1114) {
		_thongsochungchixebonbanh.setXBB1114(XBB1114);
	}

	/**
	* Returns the x b b0015 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0015 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0015() {
		return _thongsochungchixebonbanh.getXBB0015();
	}

	/**
	* Sets the x b b0015 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0015 the x b b0015 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0015(java.lang.String XBB0015) {
		_thongsochungchixebonbanh.setXBB0015(XBB0015);
	}

	/**
	* Returns the x b b1015 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1015 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1015() {
		return _thongsochungchixebonbanh.getXBB1015();
	}

	/**
	* Sets the x b b1015 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1015 the x b b1015 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1015(java.lang.String XBB1015) {
		_thongsochungchixebonbanh.setXBB1015(XBB1015);
	}

	/**
	* Returns the x b b1115 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1115 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1115() {
		return _thongsochungchixebonbanh.getXBB1115();
	}

	/**
	* Sets the x b b1115 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1115 the x b b1115 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1115(java.lang.String XBB1115) {
		_thongsochungchixebonbanh.setXBB1115(XBB1115);
	}

	/**
	* Returns the x b b0016 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0016 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0016() {
		return _thongsochungchixebonbanh.getXBB0016();
	}

	/**
	* Sets the x b b0016 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0016 the x b b0016 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0016(java.lang.String XBB0016) {
		_thongsochungchixebonbanh.setXBB0016(XBB0016);
	}

	/**
	* Returns the x b b1016 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1016 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1016() {
		return _thongsochungchixebonbanh.getXBB1016();
	}

	/**
	* Sets the x b b1016 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1016 the x b b1016 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1016(java.lang.String XBB1016) {
		_thongsochungchixebonbanh.setXBB1016(XBB1016);
	}

	/**
	* Returns the x b b1116 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1116 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1116() {
		return _thongsochungchixebonbanh.getXBB1116();
	}

	/**
	* Sets the x b b1116 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1116 the x b b1116 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1116(java.lang.String XBB1116) {
		_thongsochungchixebonbanh.setXBB1116(XBB1116);
	}

	/**
	* Returns the x b b0017 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0017 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0017() {
		return _thongsochungchixebonbanh.getXBB0017();
	}

	/**
	* Sets the x b b0017 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0017 the x b b0017 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0017(java.lang.String XBB0017) {
		_thongsochungchixebonbanh.setXBB0017(XBB0017);
	}

	/**
	* Returns the x b b1017 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1017 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1017() {
		return _thongsochungchixebonbanh.getXBB1017();
	}

	/**
	* Sets the x b b1017 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1017 the x b b1017 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1017(java.lang.String XBB1017) {
		_thongsochungchixebonbanh.setXBB1017(XBB1017);
	}

	/**
	* Returns the x b b1117 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1117 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1117() {
		return _thongsochungchixebonbanh.getXBB1117();
	}

	/**
	* Sets the x b b1117 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1117 the x b b1117 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1117(java.lang.String XBB1117) {
		_thongsochungchixebonbanh.setXBB1117(XBB1117);
	}

	/**
	* Returns the x b b0018 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0018 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0018() {
		return _thongsochungchixebonbanh.getXBB0018();
	}

	/**
	* Sets the x b b0018 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0018 the x b b0018 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0018(java.lang.String XBB0018) {
		_thongsochungchixebonbanh.setXBB0018(XBB0018);
	}

	/**
	* Returns the x b b0019 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0019 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0019() {
		return _thongsochungchixebonbanh.getXBB0019();
	}

	/**
	* Sets the x b b0019 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0019 the x b b0019 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0019(java.lang.String XBB0019) {
		_thongsochungchixebonbanh.setXBB0019(XBB0019);
	}

	/**
	* Returns the x b b0020 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0020 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0020() {
		return _thongsochungchixebonbanh.getXBB0020();
	}

	/**
	* Sets the x b b0020 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0020 the x b b0020 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0020(java.lang.String XBB0020) {
		_thongsochungchixebonbanh.setXBB0020(XBB0020);
	}

	/**
	* Returns the x b b0021 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0021 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0021() {
		return _thongsochungchixebonbanh.getXBB0021();
	}

	/**
	* Sets the x b b0021 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0021 the x b b0021 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0021(java.lang.String XBB0021) {
		_thongsochungchixebonbanh.setXBB0021(XBB0021);
	}

	/**
	* Returns the x b b0022 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0022 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0022() {
		return _thongsochungchixebonbanh.getXBB0022();
	}

	/**
	* Sets the x b b0022 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0022 the x b b0022 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0022(java.lang.String XBB0022) {
		_thongsochungchixebonbanh.setXBB0022(XBB0022);
	}

	/**
	* Returns the x b b1022 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1022 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1022() {
		return _thongsochungchixebonbanh.getXBB1022();
	}

	/**
	* Sets the x b b1022 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1022 the x b b1022 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1022(java.lang.String XBB1022) {
		_thongsochungchixebonbanh.setXBB1022(XBB1022);
	}

	/**
	* Returns the x b b0023 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0023 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0023() {
		return _thongsochungchixebonbanh.getXBB0023();
	}

	/**
	* Sets the x b b0023 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0023 the x b b0023 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0023(java.lang.String XBB0023) {
		_thongsochungchixebonbanh.setXBB0023(XBB0023);
	}

	/**
	* Returns the x b b0024 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0024 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0024() {
		return _thongsochungchixebonbanh.getXBB0024();
	}

	/**
	* Sets the x b b0024 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0024 the x b b0024 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0024(java.lang.String XBB0024) {
		_thongsochungchixebonbanh.setXBB0024(XBB0024);
	}

	/**
	* Returns the x b b0025 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0025 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0025() {
		return _thongsochungchixebonbanh.getXBB0025();
	}

	/**
	* Sets the x b b0025 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0025 the x b b0025 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0025(java.lang.String XBB0025) {
		_thongsochungchixebonbanh.setXBB0025(XBB0025);
	}

	/**
	* Returns the x b b0026 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0026 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0026() {
		return _thongsochungchixebonbanh.getXBB0026();
	}

	/**
	* Sets the x b b0026 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0026 the x b b0026 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0026(java.lang.String XBB0026) {
		_thongsochungchixebonbanh.setXBB0026(XBB0026);
	}

	/**
	* Returns the x b b1026 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1026 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1026() {
		return _thongsochungchixebonbanh.getXBB1026();
	}

	/**
	* Sets the x b b1026 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1026 the x b b1026 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1026(java.lang.String XBB1026) {
		_thongsochungchixebonbanh.setXBB1026(XBB1026);
	}

	/**
	* Returns the x b b0027 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0027 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0027() {
		return _thongsochungchixebonbanh.getXBB0027();
	}

	/**
	* Sets the x b b0027 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0027 the x b b0027 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0027(java.lang.String XBB0027) {
		_thongsochungchixebonbanh.setXBB0027(XBB0027);
	}

	/**
	* Returns the x b b1027 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1027 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1027() {
		return _thongsochungchixebonbanh.getXBB1027();
	}

	/**
	* Sets the x b b1027 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1027 the x b b1027 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1027(java.lang.String XBB1027) {
		_thongsochungchixebonbanh.setXBB1027(XBB1027);
	}

	/**
	* Returns the x b b0028 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0028 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0028() {
		return _thongsochungchixebonbanh.getXBB0028();
	}

	/**
	* Sets the x b b0028 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0028 the x b b0028 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0028(java.lang.String XBB0028) {
		_thongsochungchixebonbanh.setXBB0028(XBB0028);
	}

	/**
	* Returns the x b b0029 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0029 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0029() {
		return _thongsochungchixebonbanh.getXBB0029();
	}

	/**
	* Sets the x b b0029 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0029 the x b b0029 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0029(java.lang.String XBB0029) {
		_thongsochungchixebonbanh.setXBB0029(XBB0029);
	}

	/**
	* Returns the x b b1029 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1029 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1029() {
		return _thongsochungchixebonbanh.getXBB1029();
	}

	/**
	* Sets the x b b1029 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1029 the x b b1029 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1029(java.lang.String XBB1029) {
		_thongsochungchixebonbanh.setXBB1029(XBB1029);
	}

	/**
	* Returns the x b b0030 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0030 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0030() {
		return _thongsochungchixebonbanh.getXBB0030();
	}

	/**
	* Sets the x b b0030 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0030 the x b b0030 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0030(java.lang.String XBB0030) {
		_thongsochungchixebonbanh.setXBB0030(XBB0030);
	}

	/**
	* Returns the x b b0031 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0031 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0031() {
		return _thongsochungchixebonbanh.getXBB0031();
	}

	/**
	* Sets the x b b0031 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0031 the x b b0031 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0031(java.lang.String XBB0031) {
		_thongsochungchixebonbanh.setXBB0031(XBB0031);
	}

	/**
	* Returns the x b b0032 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0032 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0032() {
		return _thongsochungchixebonbanh.getXBB0032();
	}

	/**
	* Sets the x b b0032 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0032 the x b b0032 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0032(java.lang.String XBB0032) {
		_thongsochungchixebonbanh.setXBB0032(XBB0032);
	}

	/**
	* Returns the x b b0033 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0033 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0033() {
		return _thongsochungchixebonbanh.getXBB0033();
	}

	/**
	* Sets the x b b0033 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0033 the x b b0033 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0033(java.lang.String XBB0033) {
		_thongsochungchixebonbanh.setXBB0033(XBB0033);
	}

	/**
	* Returns the x b b1033 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1033 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1033() {
		return _thongsochungchixebonbanh.getXBB1033();
	}

	/**
	* Sets the x b b1033 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1033 the x b b1033 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1033(java.lang.String XBB1033) {
		_thongsochungchixebonbanh.setXBB1033(XBB1033);
	}

	/**
	* Returns the x b b0034 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0034 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0034() {
		return _thongsochungchixebonbanh.getXBB0034();
	}

	/**
	* Sets the x b b0034 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0034 the x b b0034 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0034(java.lang.String XBB0034) {
		_thongsochungchixebonbanh.setXBB0034(XBB0034);
	}

	/**
	* Returns the x b b1034 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1034 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1034() {
		return _thongsochungchixebonbanh.getXBB1034();
	}

	/**
	* Sets the x b b1034 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1034 the x b b1034 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1034(java.lang.String XBB1034) {
		_thongsochungchixebonbanh.setXBB1034(XBB1034);
	}

	/**
	* Returns the x b b0035 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0035 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0035() {
		return _thongsochungchixebonbanh.getXBB0035();
	}

	/**
	* Sets the x b b0035 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0035 the x b b0035 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0035(java.lang.String XBB0035) {
		_thongsochungchixebonbanh.setXBB0035(XBB0035);
	}

	/**
	* Returns the x b b0036 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0036 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0036() {
		return _thongsochungchixebonbanh.getXBB0036();
	}

	/**
	* Sets the x b b0036 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0036 the x b b0036 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0036(java.lang.String XBB0036) {
		_thongsochungchixebonbanh.setXBB0036(XBB0036);
	}

	/**
	* Returns the x b b1036 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1036 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1036() {
		return _thongsochungchixebonbanh.getXBB1036();
	}

	/**
	* Sets the x b b1036 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1036 the x b b1036 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1036(java.lang.String XBB1036) {
		_thongsochungchixebonbanh.setXBB1036(XBB1036);
	}

	/**
	* Returns the x b b0037 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0037 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0037() {
		return _thongsochungchixebonbanh.getXBB0037();
	}

	/**
	* Sets the x b b0037 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0037 the x b b0037 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0037(java.lang.String XBB0037) {
		_thongsochungchixebonbanh.setXBB0037(XBB0037);
	}

	/**
	* Returns the x b b0038 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0038 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0038() {
		return _thongsochungchixebonbanh.getXBB0038();
	}

	/**
	* Sets the x b b0038 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0038 the x b b0038 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0038(java.lang.String XBB0038) {
		_thongsochungchixebonbanh.setXBB0038(XBB0038);
	}

	/**
	* Returns the x b b0039 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0039 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0039() {
		return _thongsochungchixebonbanh.getXBB0039();
	}

	/**
	* Sets the x b b0039 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0039 the x b b0039 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0039(java.lang.String XBB0039) {
		_thongsochungchixebonbanh.setXBB0039(XBB0039);
	}

	/**
	* Returns the x b b0040 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0040 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0040() {
		return _thongsochungchixebonbanh.getXBB0040();
	}

	/**
	* Sets the x b b0040 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0040 the x b b0040 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0040(java.lang.String XBB0040) {
		_thongsochungchixebonbanh.setXBB0040(XBB0040);
	}

	/**
	* Returns the x b b0041 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0041 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0041() {
		return _thongsochungchixebonbanh.getXBB0041();
	}

	/**
	* Sets the x b b0041 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0041 the x b b0041 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0041(java.lang.String XBB0041) {
		_thongsochungchixebonbanh.setXBB0041(XBB0041);
	}

	/**
	* Returns the x b b0042 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0042 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0042() {
		return _thongsochungchixebonbanh.getXBB0042();
	}

	/**
	* Sets the x b b0042 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0042 the x b b0042 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0042(java.lang.String XBB0042) {
		_thongsochungchixebonbanh.setXBB0042(XBB0042);
	}

	/**
	* Returns the x b b0043 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0043 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0043() {
		return _thongsochungchixebonbanh.getXBB0043();
	}

	/**
	* Sets the x b b0043 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0043 the x b b0043 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0043(java.lang.String XBB0043) {
		_thongsochungchixebonbanh.setXBB0043(XBB0043);
	}

	/**
	* Returns the x b b0044 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0044 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0044() {
		return _thongsochungchixebonbanh.getXBB0044();
	}

	/**
	* Sets the x b b0044 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0044 the x b b0044 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0044(java.lang.String XBB0044) {
		_thongsochungchixebonbanh.setXBB0044(XBB0044);
	}

	/**
	* Returns the x b b1044 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1044 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1044() {
		return _thongsochungchixebonbanh.getXBB1044();
	}

	/**
	* Sets the x b b1044 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1044 the x b b1044 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1044(java.lang.String XBB1044) {
		_thongsochungchixebonbanh.setXBB1044(XBB1044);
	}

	/**
	* Returns the x b b0045 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0045 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0045() {
		return _thongsochungchixebonbanh.getXBB0045();
	}

	/**
	* Sets the x b b0045 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0045 the x b b0045 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0045(java.lang.String XBB0045) {
		_thongsochungchixebonbanh.setXBB0045(XBB0045);
	}

	/**
	* Returns the x b b0046 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0046 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0046() {
		return _thongsochungchixebonbanh.getXBB0046();
	}

	/**
	* Sets the x b b0046 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0046 the x b b0046 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0046(java.lang.String XBB0046) {
		_thongsochungchixebonbanh.setXBB0046(XBB0046);
	}

	/**
	* Returns the x b b0047 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0047 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0047() {
		return _thongsochungchixebonbanh.getXBB0047();
	}

	/**
	* Sets the x b b0047 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0047 the x b b0047 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0047(java.lang.String XBB0047) {
		_thongsochungchixebonbanh.setXBB0047(XBB0047);
	}

	/**
	* Returns the x b b0048 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0048 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0048() {
		return _thongsochungchixebonbanh.getXBB0048();
	}

	/**
	* Sets the x b b0048 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0048 the x b b0048 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0048(java.lang.String XBB0048) {
		_thongsochungchixebonbanh.setXBB0048(XBB0048);
	}

	/**
	* Returns the x b b0049 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0049 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0049() {
		return _thongsochungchixebonbanh.getXBB0049();
	}

	/**
	* Sets the x b b0049 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0049 the x b b0049 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0049(java.lang.String XBB0049) {
		_thongsochungchixebonbanh.setXBB0049(XBB0049);
	}

	/**
	* Returns the x b b0050 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0050 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0050() {
		return _thongsochungchixebonbanh.getXBB0050();
	}

	/**
	* Sets the x b b0050 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0050 the x b b0050 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0050(java.lang.String XBB0050) {
		_thongsochungchixebonbanh.setXBB0050(XBB0050);
	}

	/**
	* Returns the x b b0051 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0051 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0051() {
		return _thongsochungchixebonbanh.getXBB0051();
	}

	/**
	* Sets the x b b0051 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0051 the x b b0051 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0051(java.lang.String XBB0051) {
		_thongsochungchixebonbanh.setXBB0051(XBB0051);
	}

	/**
	* Returns the x b b0052 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0052 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0052() {
		return _thongsochungchixebonbanh.getXBB0052();
	}

	/**
	* Sets the x b b0052 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0052 the x b b0052 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0052(java.lang.String XBB0052) {
		_thongsochungchixebonbanh.setXBB0052(XBB0052);
	}

	/**
	* Returns the x b b0053 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0053 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0053() {
		return _thongsochungchixebonbanh.getXBB0053();
	}

	/**
	* Sets the x b b0053 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0053 the x b b0053 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0053(java.lang.String XBB0053) {
		_thongsochungchixebonbanh.setXBB0053(XBB0053);
	}

	/**
	* Returns the x b b0054 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0054 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0054() {
		return _thongsochungchixebonbanh.getXBB0054();
	}

	/**
	* Sets the x b b0054 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0054 the x b b0054 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0054(java.lang.String XBB0054) {
		_thongsochungchixebonbanh.setXBB0054(XBB0054);
	}

	/**
	* Returns the x b b0055 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0055 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0055() {
		return _thongsochungchixebonbanh.getXBB0055();
	}

	/**
	* Sets the x b b0055 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0055 the x b b0055 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0055(java.lang.String XBB0055) {
		_thongsochungchixebonbanh.setXBB0055(XBB0055);
	}

	/**
	* Returns the x b b0056 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0056 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0056() {
		return _thongsochungchixebonbanh.getXBB0056();
	}

	/**
	* Sets the x b b0056 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0056 the x b b0056 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0056(java.lang.String XBB0056) {
		_thongsochungchixebonbanh.setXBB0056(XBB0056);
	}

	/**
	* Returns the x b b0057 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0057 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0057() {
		return _thongsochungchixebonbanh.getXBB0057();
	}

	/**
	* Sets the x b b0057 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0057 the x b b0057 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0057(java.lang.String XBB0057) {
		_thongsochungchixebonbanh.setXBB0057(XBB0057);
	}

	/**
	* Returns the x b b0058 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0058 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0058() {
		return _thongsochungchixebonbanh.getXBB0058();
	}

	/**
	* Sets the x b b0058 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0058 the x b b0058 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0058(java.lang.String XBB0058) {
		_thongsochungchixebonbanh.setXBB0058(XBB0058);
	}

	/**
	* Returns the x b b0059 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0059 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0059() {
		return _thongsochungchixebonbanh.getXBB0059();
	}

	/**
	* Sets the x b b0059 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0059 the x b b0059 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0059(java.lang.String XBB0059) {
		_thongsochungchixebonbanh.setXBB0059(XBB0059);
	}

	/**
	* Returns the x b b0060 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0060 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0060() {
		return _thongsochungchixebonbanh.getXBB0060();
	}

	/**
	* Sets the x b b0060 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0060 the x b b0060 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0060(java.lang.String XBB0060) {
		_thongsochungchixebonbanh.setXBB0060(XBB0060);
	}

	/**
	* Returns the x b b0061 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0061 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0061() {
		return _thongsochungchixebonbanh.getXBB0061();
	}

	/**
	* Sets the x b b0061 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0061 the x b b0061 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0061(java.lang.String XBB0061) {
		_thongsochungchixebonbanh.setXBB0061(XBB0061);
	}

	/**
	* Returns the x b b0062 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0062 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0062() {
		return _thongsochungchixebonbanh.getXBB0062();
	}

	/**
	* Sets the x b b0062 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0062 the x b b0062 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0062(java.lang.String XBB0062) {
		_thongsochungchixebonbanh.setXBB0062(XBB0062);
	}

	/**
	* Returns the x b b0063 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0063 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0063() {
		return _thongsochungchixebonbanh.getXBB0063();
	}

	/**
	* Sets the x b b0063 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0063 the x b b0063 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0063(java.lang.String XBB0063) {
		_thongsochungchixebonbanh.setXBB0063(XBB0063);
	}

	/**
	* Returns the x b b0076 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0076 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0076() {
		return _thongsochungchixebonbanh.getXBB0076();
	}

	/**
	* Sets the x b b0076 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0076 the x b b0076 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0076(java.lang.String XBB0076) {
		_thongsochungchixebonbanh.setXBB0076(XBB0076);
	}

	/**
	* Returns the x b b0077 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0077 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0077() {
		return _thongsochungchixebonbanh.getXBB0077();
	}

	/**
	* Sets the x b b0077 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0077 the x b b0077 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0077(java.lang.String XBB0077) {
		_thongsochungchixebonbanh.setXBB0077(XBB0077);
	}

	/**
	* Returns the x b b0078 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0078 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0078() {
		return _thongsochungchixebonbanh.getXBB0078();
	}

	/**
	* Sets the x b b0078 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0078 the x b b0078 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0078(java.lang.String XBB0078) {
		_thongsochungchixebonbanh.setXBB0078(XBB0078);
	}

	/**
	* Returns the x b b0079 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0079 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0079() {
		return _thongsochungchixebonbanh.getXBB0079();
	}

	/**
	* Sets the x b b0079 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0079 the x b b0079 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0079(java.lang.String XBB0079) {
		_thongsochungchixebonbanh.setXBB0079(XBB0079);
	}

	/**
	* Returns the x b b0080 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0080 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0080() {
		return _thongsochungchixebonbanh.getXBB0080();
	}

	/**
	* Sets the x b b0080 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0080 the x b b0080 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0080(java.lang.String XBB0080) {
		_thongsochungchixebonbanh.setXBB0080(XBB0080);
	}

	/**
	* Returns the x b b1080 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1080 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1080() {
		return _thongsochungchixebonbanh.getXBB1080();
	}

	/**
	* Sets the x b b1080 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1080 the x b b1080 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1080(java.lang.String XBB1080) {
		_thongsochungchixebonbanh.setXBB1080(XBB1080);
	}

	/**
	* Returns the x b b0081 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0081 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0081() {
		return _thongsochungchixebonbanh.getXBB0081();
	}

	/**
	* Sets the x b b0081 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0081 the x b b0081 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0081(java.lang.String XBB0081) {
		_thongsochungchixebonbanh.setXBB0081(XBB0081);
	}

	/**
	* Returns the x b b1081 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1081 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1081() {
		return _thongsochungchixebonbanh.getXBB1081();
	}

	/**
	* Sets the x b b1081 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1081 the x b b1081 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1081(java.lang.String XBB1081) {
		_thongsochungchixebonbanh.setXBB1081(XBB1081);
	}

	/**
	* Returns the x b b1181 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1181 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1181() {
		return _thongsochungchixebonbanh.getXBB1181();
	}

	/**
	* Sets the x b b1181 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1181 the x b b1181 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1181(java.lang.String XBB1181) {
		_thongsochungchixebonbanh.setXBB1181(XBB1181);
	}

	/**
	* Returns the x b b0082 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0082 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0082() {
		return _thongsochungchixebonbanh.getXBB0082();
	}

	/**
	* Sets the x b b0082 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0082 the x b b0082 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0082(java.lang.String XBB0082) {
		_thongsochungchixebonbanh.setXBB0082(XBB0082);
	}

	/**
	* Returns the x b b1082 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1082 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1082() {
		return _thongsochungchixebonbanh.getXBB1082();
	}

	/**
	* Sets the x b b1082 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1082 the x b b1082 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1082(java.lang.String XBB1082) {
		_thongsochungchixebonbanh.setXBB1082(XBB1082);
	}

	/**
	* Returns the x b b1182 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1182 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1182() {
		return _thongsochungchixebonbanh.getXBB1182();
	}

	/**
	* Sets the x b b1182 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1182 the x b b1182 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1182(java.lang.String XBB1182) {
		_thongsochungchixebonbanh.setXBB1182(XBB1182);
	}

	/**
	* Returns the x b b0083 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0083 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0083() {
		return _thongsochungchixebonbanh.getXBB0083();
	}

	/**
	* Sets the x b b0083 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0083 the x b b0083 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0083(java.lang.String XBB0083) {
		_thongsochungchixebonbanh.setXBB0083(XBB0083);
	}

	/**
	* Returns the x b b1083 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1083 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1083() {
		return _thongsochungchixebonbanh.getXBB1083();
	}

	/**
	* Sets the x b b1083 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1083 the x b b1083 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1083(java.lang.String XBB1083) {
		_thongsochungchixebonbanh.setXBB1083(XBB1083);
	}

	/**
	* Returns the x b b1183 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1183 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1183() {
		return _thongsochungchixebonbanh.getXBB1183();
	}

	/**
	* Sets the x b b1183 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1183 the x b b1183 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1183(java.lang.String XBB1183) {
		_thongsochungchixebonbanh.setXBB1183(XBB1183);
	}

	/**
	* Returns the x b b0084 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0084 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0084() {
		return _thongsochungchixebonbanh.getXBB0084();
	}

	/**
	* Sets the x b b0084 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0084 the x b b0084 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0084(java.lang.String XBB0084) {
		_thongsochungchixebonbanh.setXBB0084(XBB0084);
	}

	/**
	* Returns the x b b0085 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0085 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0085() {
		return _thongsochungchixebonbanh.getXBB0085();
	}

	/**
	* Sets the x b b0085 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0085 the x b b0085 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0085(java.lang.String XBB0085) {
		_thongsochungchixebonbanh.setXBB0085(XBB0085);
	}

	/**
	* Returns the x b b0086 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0086 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0086() {
		return _thongsochungchixebonbanh.getXBB0086();
	}

	/**
	* Sets the x b b0086 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0086 the x b b0086 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0086(java.lang.String XBB0086) {
		_thongsochungchixebonbanh.setXBB0086(XBB0086);
	}

	/**
	* Returns the x b b0087 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0087 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0087() {
		return _thongsochungchixebonbanh.getXBB0087();
	}

	/**
	* Sets the x b b0087 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0087 the x b b0087 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0087(java.lang.String XBB0087) {
		_thongsochungchixebonbanh.setXBB0087(XBB0087);
	}

	/**
	* Returns the x b b0088 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0088 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0088() {
		return _thongsochungchixebonbanh.getXBB0088();
	}

	/**
	* Sets the x b b0088 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0088 the x b b0088 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0088(java.lang.String XBB0088) {
		_thongsochungchixebonbanh.setXBB0088(XBB0088);
	}

	/**
	* Returns the x b b0089 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0089 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0089() {
		return _thongsochungchixebonbanh.getXBB0089();
	}

	/**
	* Sets the x b b0089 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0089 the x b b0089 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0089(java.lang.String XBB0089) {
		_thongsochungchixebonbanh.setXBB0089(XBB0089);
	}

	/**
	* Returns the x b b0090 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0090 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0090() {
		return _thongsochungchixebonbanh.getXBB0090();
	}

	/**
	* Sets the x b b0090 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0090 the x b b0090 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0090(java.lang.String XBB0090) {
		_thongsochungchixebonbanh.setXBB0090(XBB0090);
	}

	/**
	* Returns the x b b0091 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0091 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0091() {
		return _thongsochungchixebonbanh.getXBB0091();
	}

	/**
	* Sets the x b b0091 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0091 the x b b0091 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0091(java.lang.String XBB0091) {
		_thongsochungchixebonbanh.setXBB0091(XBB0091);
	}

	/**
	* Returns the x b b0092 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0092 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0092() {
		return _thongsochungchixebonbanh.getXBB0092();
	}

	/**
	* Sets the x b b0092 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0092 the x b b0092 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0092(java.lang.String XBB0092) {
		_thongsochungchixebonbanh.setXBB0092(XBB0092);
	}

	/**
	* Returns the x b b0093 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0093 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0093() {
		return _thongsochungchixebonbanh.getXBB0093();
	}

	/**
	* Sets the x b b0093 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0093 the x b b0093 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0093(java.lang.String XBB0093) {
		_thongsochungchixebonbanh.setXBB0093(XBB0093);
	}

	/**
	* Returns the x b b0094 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0094 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0094() {
		return _thongsochungchixebonbanh.getXBB0094();
	}

	/**
	* Sets the x b b0094 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0094 the x b b0094 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0094(java.lang.String XBB0094) {
		_thongsochungchixebonbanh.setXBB0094(XBB0094);
	}

	/**
	* Returns the x b b0095 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0095 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0095() {
		return _thongsochungchixebonbanh.getXBB0095();
	}

	/**
	* Sets the x b b0095 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0095 the x b b0095 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0095(java.lang.String XBB0095) {
		_thongsochungchixebonbanh.setXBB0095(XBB0095);
	}

	/**
	* Returns the x b b0096 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0096 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0096() {
		return _thongsochungchixebonbanh.getXBB0096();
	}

	/**
	* Sets the x b b0096 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0096 the x b b0096 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0096(java.lang.String XBB0096) {
		_thongsochungchixebonbanh.setXBB0096(XBB0096);
	}

	/**
	* Returns the x b b0097 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0097 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0097() {
		return _thongsochungchixebonbanh.getXBB0097();
	}

	/**
	* Sets the x b b0097 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0097 the x b b0097 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0097(java.lang.String XBB0097) {
		_thongsochungchixebonbanh.setXBB0097(XBB0097);
	}

	/**
	* Returns the x b b0098 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0098 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0098() {
		return _thongsochungchixebonbanh.getXBB0098();
	}

	/**
	* Sets the x b b0098 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0098 the x b b0098 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0098(java.lang.String XBB0098) {
		_thongsochungchixebonbanh.setXBB0098(XBB0098);
	}

	/**
	* Returns the x b b0099 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0099 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0099() {
		return _thongsochungchixebonbanh.getXBB0099();
	}

	/**
	* Sets the x b b0099 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0099 the x b b0099 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0099(java.lang.String XBB0099) {
		_thongsochungchixebonbanh.setXBB0099(XBB0099);
	}

	/**
	* Returns the x b b0100 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0100 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0100() {
		return _thongsochungchixebonbanh.getXBB0100();
	}

	/**
	* Sets the x b b0100 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0100 the x b b0100 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0100(java.lang.String XBB0100) {
		_thongsochungchixebonbanh.setXBB0100(XBB0100);
	}

	/**
	* Returns the x b b0101 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0101 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0101() {
		return _thongsochungchixebonbanh.getXBB0101();
	}

	/**
	* Sets the x b b0101 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0101 the x b b0101 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0101(java.lang.String XBB0101) {
		_thongsochungchixebonbanh.setXBB0101(XBB0101);
	}

	/**
	* Returns the x b b0102 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0102 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0102() {
		return _thongsochungchixebonbanh.getXBB0102();
	}

	/**
	* Sets the x b b0102 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0102 the x b b0102 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0102(java.lang.String XBB0102) {
		_thongsochungchixebonbanh.setXBB0102(XBB0102);
	}

	/**
	* Returns the x b b0103 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0103 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0103() {
		return _thongsochungchixebonbanh.getXBB0103();
	}

	/**
	* Sets the x b b0103 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0103 the x b b0103 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0103(java.lang.String XBB0103) {
		_thongsochungchixebonbanh.setXBB0103(XBB0103);
	}

	/**
	* Returns the x b b0104 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0104 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0104() {
		return _thongsochungchixebonbanh.getXBB0104();
	}

	/**
	* Sets the x b b0104 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0104 the x b b0104 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0104(java.lang.String XBB0104) {
		_thongsochungchixebonbanh.setXBB0104(XBB0104);
	}

	/**
	* Returns the x b b2104 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b2104 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB2104() {
		return _thongsochungchixebonbanh.getXBB2104();
	}

	/**
	* Sets the x b b2104 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB2104 the x b b2104 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB2104(java.lang.String XBB2104) {
		_thongsochungchixebonbanh.setXBB2104(XBB2104);
	}

	/**
	* Returns the x b b0105 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0105 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0105() {
		return _thongsochungchixebonbanh.getXBB0105();
	}

	/**
	* Sets the x b b0105 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0105 the x b b0105 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0105(java.lang.String XBB0105) {
		_thongsochungchixebonbanh.setXBB0105(XBB0105);
	}

	/**
	* Returns the x b b2105 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b2105 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB2105() {
		return _thongsochungchixebonbanh.getXBB2105();
	}

	/**
	* Sets the x b b2105 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB2105 the x b b2105 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB2105(java.lang.String XBB2105) {
		_thongsochungchixebonbanh.setXBB2105(XBB2105);
	}

	/**
	* Returns the x b b0106 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0106 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0106() {
		return _thongsochungchixebonbanh.getXBB0106();
	}

	/**
	* Sets the x b b0106 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0106 the x b b0106 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0106(java.lang.String XBB0106) {
		_thongsochungchixebonbanh.setXBB0106(XBB0106);
	}

	/**
	* Returns the x b b2106 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b2106 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB2106() {
		return _thongsochungchixebonbanh.getXBB2106();
	}

	/**
	* Sets the x b b2106 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB2106 the x b b2106 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB2106(java.lang.String XBB2106) {
		_thongsochungchixebonbanh.setXBB2106(XBB2106);
	}

	/**
	* Returns the x b b0107 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0107 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0107() {
		return _thongsochungchixebonbanh.getXBB0107();
	}

	/**
	* Sets the x b b0107 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0107 the x b b0107 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0107(java.lang.String XBB0107) {
		_thongsochungchixebonbanh.setXBB0107(XBB0107);
	}

	/**
	* Returns the x b b2107 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b2107 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB2107() {
		return _thongsochungchixebonbanh.getXBB2107();
	}

	/**
	* Sets the x b b2107 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB2107 the x b b2107 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB2107(java.lang.String XBB2107) {
		_thongsochungchixebonbanh.setXBB2107(XBB2107);
	}

	/**
	* Returns the x b b0108 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0108 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0108() {
		return _thongsochungchixebonbanh.getXBB0108();
	}

	/**
	* Sets the x b b0108 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0108 the x b b0108 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0108(java.lang.String XBB0108) {
		_thongsochungchixebonbanh.setXBB0108(XBB0108);
	}

	/**
	* Returns the x b b2108 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b2108 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB2108() {
		return _thongsochungchixebonbanh.getXBB2108();
	}

	/**
	* Sets the x b b2108 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB2108 the x b b2108 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB2108(java.lang.String XBB2108) {
		_thongsochungchixebonbanh.setXBB2108(XBB2108);
	}

	/**
	* Returns the x b b0109 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0109 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0109() {
		return _thongsochungchixebonbanh.getXBB0109();
	}

	/**
	* Sets the x b b0109 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0109 the x b b0109 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0109(java.lang.String XBB0109) {
		_thongsochungchixebonbanh.setXBB0109(XBB0109);
	}

	/**
	* Returns the x b b2109 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b2109 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB2109() {
		return _thongsochungchixebonbanh.getXBB2109();
	}

	/**
	* Sets the x b b2109 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB2109 the x b b2109 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB2109(java.lang.String XBB2109) {
		_thongsochungchixebonbanh.setXBB2109(XBB2109);
	}

	/**
	* Returns the x b b0110 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0110 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0110() {
		return _thongsochungchixebonbanh.getXBB0110();
	}

	/**
	* Sets the x b b0110 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0110 the x b b0110 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0110(java.lang.String XBB0110) {
		_thongsochungchixebonbanh.setXBB0110(XBB0110);
	}

	/**
	* Returns the x b b2110 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b2110 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB2110() {
		return _thongsochungchixebonbanh.getXBB2110();
	}

	/**
	* Sets the x b b2110 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB2110 the x b b2110 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB2110(java.lang.String XBB2110) {
		_thongsochungchixebonbanh.setXBB2110(XBB2110);
	}

	/**
	* Returns the x b b0111 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0111 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0111() {
		return _thongsochungchixebonbanh.getXBB0111();
	}

	/**
	* Sets the x b b0111 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0111 the x b b0111 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0111(java.lang.String XBB0111) {
		_thongsochungchixebonbanh.setXBB0111(XBB0111);
	}

	/**
	* Returns the x b b2111 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b2111 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB2111() {
		return _thongsochungchixebonbanh.getXBB2111();
	}

	/**
	* Sets the x b b2111 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB2111 the x b b2111 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB2111(java.lang.String XBB2111) {
		_thongsochungchixebonbanh.setXBB2111(XBB2111);
	}

	/**
	* Returns the x b b0112 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0112 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0112() {
		return _thongsochungchixebonbanh.getXBB0112();
	}

	/**
	* Sets the x b b0112 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0112 the x b b0112 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0112(java.lang.String XBB0112) {
		_thongsochungchixebonbanh.setXBB0112(XBB0112);
	}

	/**
	* Returns the x b b2112 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b2112 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB2112() {
		return _thongsochungchixebonbanh.getXBB2112();
	}

	/**
	* Sets the x b b2112 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB2112 the x b b2112 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB2112(java.lang.String XBB2112) {
		_thongsochungchixebonbanh.setXBB2112(XBB2112);
	}

	/**
	* Returns the x b b0113 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0113 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0113() {
		return _thongsochungchixebonbanh.getXBB0113();
	}

	/**
	* Sets the x b b0113 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0113 the x b b0113 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0113(java.lang.String XBB0113) {
		_thongsochungchixebonbanh.setXBB0113(XBB0113);
	}

	/**
	* Returns the x b b2113 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b2113 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB2113() {
		return _thongsochungchixebonbanh.getXBB2113();
	}

	/**
	* Sets the x b b2113 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB2113 the x b b2113 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB2113(java.lang.String XBB2113) {
		_thongsochungchixebonbanh.setXBB2113(XBB2113);
	}

	/**
	* Returns the x b b0114 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0114 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0114() {
		return _thongsochungchixebonbanh.getXBB0114();
	}

	/**
	* Sets the x b b0114 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0114 the x b b0114 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0114(java.lang.String XBB0114) {
		_thongsochungchixebonbanh.setXBB0114(XBB0114);
	}

	/**
	* Returns the x b b2114 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b2114 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB2114() {
		return _thongsochungchixebonbanh.getXBB2114();
	}

	/**
	* Sets the x b b2114 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB2114 the x b b2114 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB2114(java.lang.String XBB2114) {
		_thongsochungchixebonbanh.setXBB2114(XBB2114);
	}

	/**
	* Returns the x b b0115 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0115 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0115() {
		return _thongsochungchixebonbanh.getXBB0115();
	}

	/**
	* Sets the x b b0115 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0115 the x b b0115 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0115(java.lang.String XBB0115) {
		_thongsochungchixebonbanh.setXBB0115(XBB0115);
	}

	/**
	* Returns the x b b2115 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b2115 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB2115() {
		return _thongsochungchixebonbanh.getXBB2115();
	}

	/**
	* Sets the x b b2115 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB2115 the x b b2115 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB2115(java.lang.String XBB2115) {
		_thongsochungchixebonbanh.setXBB2115(XBB2115);
	}

	/**
	* Returns the x b b0116 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0116 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0116() {
		return _thongsochungchixebonbanh.getXBB0116();
	}

	/**
	* Sets the x b b0116 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0116 the x b b0116 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0116(java.lang.String XBB0116) {
		_thongsochungchixebonbanh.setXBB0116(XBB0116);
	}

	/**
	* Returns the x b b2116 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b2116 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB2116() {
		return _thongsochungchixebonbanh.getXBB2116();
	}

	/**
	* Sets the x b b2116 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB2116 the x b b2116 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB2116(java.lang.String XBB2116) {
		_thongsochungchixebonbanh.setXBB2116(XBB2116);
	}

	/**
	* Returns the x b b0117 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0117 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0117() {
		return _thongsochungchixebonbanh.getXBB0117();
	}

	/**
	* Sets the x b b0117 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0117 the x b b0117 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0117(java.lang.String XBB0117) {
		_thongsochungchixebonbanh.setXBB0117(XBB0117);
	}

	/**
	* Returns the x b b2117 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b2117 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB2117() {
		return _thongsochungchixebonbanh.getXBB2117();
	}

	/**
	* Sets the x b b2117 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB2117 the x b b2117 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB2117(java.lang.String XBB2117) {
		_thongsochungchixebonbanh.setXBB2117(XBB2117);
	}

	/**
	* Returns the x b b0118 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0118 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0118() {
		return _thongsochungchixebonbanh.getXBB0118();
	}

	/**
	* Sets the x b b0118 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0118 the x b b0118 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0118(java.lang.String XBB0118) {
		_thongsochungchixebonbanh.setXBB0118(XBB0118);
	}

	/**
	* Returns the x b b0119 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0119 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0119() {
		return _thongsochungchixebonbanh.getXBB0119();
	}

	/**
	* Sets the x b b0119 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0119 the x b b0119 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0119(java.lang.String XBB0119) {
		_thongsochungchixebonbanh.setXBB0119(XBB0119);
	}

	/**
	* Returns the x b b2119 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b2119 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB2119() {
		return _thongsochungchixebonbanh.getXBB2119();
	}

	/**
	* Sets the x b b2119 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB2119 the x b b2119 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB2119(java.lang.String XBB2119) {
		_thongsochungchixebonbanh.setXBB2119(XBB2119);
	}

	/**
	* Returns the x b b0120 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0120 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0120() {
		return _thongsochungchixebonbanh.getXBB0120();
	}

	/**
	* Sets the x b b0120 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0120 the x b b0120 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0120(java.lang.String XBB0120) {
		_thongsochungchixebonbanh.setXBB0120(XBB0120);
	}

	/**
	* Returns the x b b0121 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0121 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0121() {
		return _thongsochungchixebonbanh.getXBB0121();
	}

	/**
	* Sets the x b b0121 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0121 the x b b0121 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0121(java.lang.String XBB0121) {
		_thongsochungchixebonbanh.setXBB0121(XBB0121);
	}

	/**
	* Returns the x b b0122 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0122 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0122() {
		return _thongsochungchixebonbanh.getXBB0122();
	}

	/**
	* Sets the x b b0122 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0122 the x b b0122 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0122(java.lang.String XBB0122) {
		_thongsochungchixebonbanh.setXBB0122(XBB0122);
	}

	/**
	* Returns the x b b0123 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0123 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0123() {
		return _thongsochungchixebonbanh.getXBB0123();
	}

	/**
	* Sets the x b b0123 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0123 the x b b0123 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0123(java.lang.String XBB0123) {
		_thongsochungchixebonbanh.setXBB0123(XBB0123);
	}

	/**
	* Returns the x b b0124 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0124 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0124() {
		return _thongsochungchixebonbanh.getXBB0124();
	}

	/**
	* Sets the x b b0124 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0124 the x b b0124 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0124(java.lang.String XBB0124) {
		_thongsochungchixebonbanh.setXBB0124(XBB0124);
	}

	/**
	* Returns the x b b0125 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0125 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0125() {
		return _thongsochungchixebonbanh.getXBB0125();
	}

	/**
	* Sets the x b b0125 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0125 the x b b0125 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0125(java.lang.String XBB0125) {
		_thongsochungchixebonbanh.setXBB0125(XBB0125);
	}

	/**
	* Returns the x b b0126 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b0126 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB0126() {
		return _thongsochungchixebonbanh.getXBB0126();
	}

	/**
	* Sets the x b b0126 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB0126 the x b b0126 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB0126(java.lang.String XBB0126) {
		_thongsochungchixebonbanh.setXBB0126(XBB0126);
	}

	/**
	* Returns the x b b1084 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1084 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1084() {
		return _thongsochungchixebonbanh.getXBB1084();
	}

	/**
	* Sets the x b b1084 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1084 the x b b1084 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1084(java.lang.String XBB1084) {
		_thongsochungchixebonbanh.setXBB1084(XBB1084);
	}

	/**
	* Returns the x b b1086 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @return the x b b1086 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public java.lang.String getXBB1086() {
		return _thongsochungchixebonbanh.getXBB1086();
	}

	/**
	* Sets the x b b1086 of this t h o n g s o c h u n g c h i x e b o n b a n h.
	*
	* @param XBB1086 the x b b1086 of this t h o n g s o c h u n g c h i x e b o n b a n h
	*/
	@Override
	public void setXBB1086(java.lang.String XBB1086) {
		_thongsochungchixebonbanh.setXBB1086(XBB1086);
	}

	@Override
	public boolean isNew() {
		return _thongsochungchixebonbanh.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_thongsochungchixebonbanh.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _thongsochungchixebonbanh.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_thongsochungchixebonbanh.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _thongsochungchixebonbanh.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _thongsochungchixebonbanh.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_thongsochungchixebonbanh.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _thongsochungchixebonbanh.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_thongsochungchixebonbanh.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_thongsochungchixebonbanh.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_thongsochungchixebonbanh.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new THONGSOCHUNGCHIXEBONBANHWrapper((THONGSOCHUNGCHIXEBONBANH)_thongsochungchixebonbanh.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEBONBANH thongsochungchixebonbanh) {
		return _thongsochungchixebonbanh.compareTo(thongsochungchixebonbanh);
	}

	@Override
	public int hashCode() {
		return _thongsochungchixebonbanh.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEBONBANH> toCacheModel() {
		return _thongsochungchixebonbanh.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEBONBANH toEscapedModel() {
		return new THONGSOCHUNGCHIXEBONBANHWrapper(_thongsochungchixebonbanh.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEBONBANH toUnescapedModel() {
		return new THONGSOCHUNGCHIXEBONBANHWrapper(_thongsochungchixebonbanh.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _thongsochungchixebonbanh.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _thongsochungchixebonbanh.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_thongsochungchixebonbanh.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof THONGSOCHUNGCHIXEBONBANHWrapper)) {
			return false;
		}

		THONGSOCHUNGCHIXEBONBANHWrapper thongsochungchixebonbanhWrapper = (THONGSOCHUNGCHIXEBONBANHWrapper)obj;

		if (Validator.equals(_thongsochungchixebonbanh,
					thongsochungchixebonbanhWrapper._thongsochungchixebonbanh)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public THONGSOCHUNGCHIXEBONBANH getWrappedTHONGSOCHUNGCHIXEBONBANH() {
		return _thongsochungchixebonbanh;
	}

	@Override
	public THONGSOCHUNGCHIXEBONBANH getWrappedModel() {
		return _thongsochungchixebonbanh;
	}

	@Override
	public void resetOriginalValues() {
		_thongsochungchixebonbanh.resetOriginalValues();
	}

	private THONGSOCHUNGCHIXEBONBANH _thongsochungchixebonbanh;
}