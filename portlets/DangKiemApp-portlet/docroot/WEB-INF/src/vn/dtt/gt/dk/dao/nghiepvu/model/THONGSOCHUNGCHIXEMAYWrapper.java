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
 * This class is a wrapper for {@link THONGSOCHUNGCHIXEMAY}.
 * </p>
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXEMAY
 * @generated
 */
public class THONGSOCHUNGCHIXEMAYWrapper implements THONGSOCHUNGCHIXEMAY,
	ModelWrapper<THONGSOCHUNGCHIXEMAY> {
	public THONGSOCHUNGCHIXEMAYWrapper(
		THONGSOCHUNGCHIXEMAY thongsochungchixemay) {
		_thongsochungchixemay = thongsochungchixemay;
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

	/**
	* Returns the primary key of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the primary key of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public long getPrimaryKey() {
		return _thongsochungchixemay.getPrimaryKey();
	}

	/**
	* Sets the primary key of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param primaryKey the primary key of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_thongsochungchixemay.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the ID of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public long getId() {
		return _thongsochungchixemay.getId();
	}

	/**
	* Sets the ID of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param id the ID of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setId(long id) {
		_thongsochungchixemay.setId(id);
	}

	/**
	* Returns the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public long getHoSoThuTucId() {
		return _thongsochungchixemay.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_thongsochungchixemay.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the certificate record ID of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the certificate record ID of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public long getCertificateRecordId() {
		return _thongsochungchixemay.getCertificateRecordId();
	}

	/**
	* Sets the certificate record ID of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param certificateRecordId the certificate record ID of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_thongsochungchixemay.setCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns the vehicle group ID of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the vehicle group ID of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public long getVehicleGroupId() {
		return _thongsochungchixemay.getVehicleGroupId();
	}

	/**
	* Sets the vehicle group ID of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param vehicleGroupId the vehicle group ID of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_thongsochungchixemay.setVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns the synch date of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the synch date of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.util.Date getSynchDate() {
		return _thongsochungchixemay.getSynchDate();
	}

	/**
	* Sets the synch date of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param SynchDate the synch date of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setSynchDate(java.util.Date SynchDate) {
		_thongsochungchixemay.setSynchDate(SynchDate);
	}

	/**
	* Returns the x m y0009 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0009 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0009() {
		return _thongsochungchixemay.getXMY0009();
	}

	/**
	* Sets the x m y0009 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0009 the x m y0009 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0009(java.lang.String XMY0009) {
		_thongsochungchixemay.setXMY0009(XMY0009);
	}

	/**
	* Returns the x m y0010 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0010 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0010() {
		return _thongsochungchixemay.getXMY0010();
	}

	/**
	* Sets the x m y0010 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0010 the x m y0010 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0010(java.lang.String XMY0010) {
		_thongsochungchixemay.setXMY0010(XMY0010);
	}

	/**
	* Returns the x m y0011 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0011 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0011() {
		return _thongsochungchixemay.getXMY0011();
	}

	/**
	* Sets the x m y0011 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0011 the x m y0011 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0011(java.lang.String XMY0011) {
		_thongsochungchixemay.setXMY0011(XMY0011);
	}

	/**
	* Returns the x m y0012 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0012 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0012() {
		return _thongsochungchixemay.getXMY0012();
	}

	/**
	* Sets the x m y0012 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0012 the x m y0012 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0012(java.lang.String XMY0012) {
		_thongsochungchixemay.setXMY0012(XMY0012);
	}

	/**
	* Returns the x m y0013 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0013 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0013() {
		return _thongsochungchixemay.getXMY0013();
	}

	/**
	* Sets the x m y0013 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0013 the x m y0013 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0013(java.lang.String XMY0013) {
		_thongsochungchixemay.setXMY0013(XMY0013);
	}

	/**
	* Returns the x m y0014 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0014 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0014() {
		return _thongsochungchixemay.getXMY0014();
	}

	/**
	* Sets the x m y0014 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0014 the x m y0014 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0014(java.lang.String XMY0014) {
		_thongsochungchixemay.setXMY0014(XMY0014);
	}

	/**
	* Returns the x m y0015 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0015 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0015() {
		return _thongsochungchixemay.getXMY0015();
	}

	/**
	* Sets the x m y0015 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0015 the x m y0015 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0015(java.lang.String XMY0015) {
		_thongsochungchixemay.setXMY0015(XMY0015);
	}

	/**
	* Returns the x m y0016 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0016 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0016() {
		return _thongsochungchixemay.getXMY0016();
	}

	/**
	* Sets the x m y0016 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0016 the x m y0016 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0016(java.lang.String XMY0016) {
		_thongsochungchixemay.setXMY0016(XMY0016);
	}

	/**
	* Returns the x m y0017 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0017 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0017() {
		return _thongsochungchixemay.getXMY0017();
	}

	/**
	* Sets the x m y0017 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0017 the x m y0017 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0017(java.lang.String XMY0017) {
		_thongsochungchixemay.setXMY0017(XMY0017);
	}

	/**
	* Returns the x m y0018 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0018 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0018() {
		return _thongsochungchixemay.getXMY0018();
	}

	/**
	* Sets the x m y0018 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0018 the x m y0018 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0018(java.lang.String XMY0018) {
		_thongsochungchixemay.setXMY0018(XMY0018);
	}

	/**
	* Returns the x m y0019 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0019 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0019() {
		return _thongsochungchixemay.getXMY0019();
	}

	/**
	* Sets the x m y0019 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0019 the x m y0019 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0019(java.lang.String XMY0019) {
		_thongsochungchixemay.setXMY0019(XMY0019);
	}

	/**
	* Returns the x m y0020 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0020 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0020() {
		return _thongsochungchixemay.getXMY0020();
	}

	/**
	* Sets the x m y0020 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0020 the x m y0020 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0020(java.lang.String XMY0020) {
		_thongsochungchixemay.setXMY0020(XMY0020);
	}

	/**
	* Returns the x m y0021 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0021 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0021() {
		return _thongsochungchixemay.getXMY0021();
	}

	/**
	* Sets the x m y0021 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0021 the x m y0021 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0021(java.lang.String XMY0021) {
		_thongsochungchixemay.setXMY0021(XMY0021);
	}

	/**
	* Returns the x m y0022 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0022 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0022() {
		return _thongsochungchixemay.getXMY0022();
	}

	/**
	* Sets the x m y0022 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0022 the x m y0022 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0022(java.lang.String XMY0022) {
		_thongsochungchixemay.setXMY0022(XMY0022);
	}

	/**
	* Returns the x m y1022 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y1022 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY1022() {
		return _thongsochungchixemay.getXMY1022();
	}

	/**
	* Sets the x m y1022 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY1022 the x m y1022 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY1022(java.lang.String XMY1022) {
		_thongsochungchixemay.setXMY1022(XMY1022);
	}

	/**
	* Returns the x m y0023 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0023 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0023() {
		return _thongsochungchixemay.getXMY0023();
	}

	/**
	* Sets the x m y0023 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0023 the x m y0023 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0023(java.lang.String XMY0023) {
		_thongsochungchixemay.setXMY0023(XMY0023);
	}

	/**
	* Returns the x m y0024 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0024 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0024() {
		return _thongsochungchixemay.getXMY0024();
	}

	/**
	* Sets the x m y0024 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0024 the x m y0024 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0024(java.lang.String XMY0024) {
		_thongsochungchixemay.setXMY0024(XMY0024);
	}

	/**
	* Returns the x m y0025 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0025 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0025() {
		return _thongsochungchixemay.getXMY0025();
	}

	/**
	* Sets the x m y0025 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0025 the x m y0025 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0025(java.lang.String XMY0025) {
		_thongsochungchixemay.setXMY0025(XMY0025);
	}

	/**
	* Returns the x m y0026 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0026 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0026() {
		return _thongsochungchixemay.getXMY0026();
	}

	/**
	* Sets the x m y0026 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0026 the x m y0026 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0026(java.lang.String XMY0026) {
		_thongsochungchixemay.setXMY0026(XMY0026);
	}

	/**
	* Returns the x m y0027 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0027 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0027() {
		return _thongsochungchixemay.getXMY0027();
	}

	/**
	* Sets the x m y0027 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0027 the x m y0027 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0027(java.lang.String XMY0027) {
		_thongsochungchixemay.setXMY0027(XMY0027);
	}

	/**
	* Returns the x m y0028 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0028 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0028() {
		return _thongsochungchixemay.getXMY0028();
	}

	/**
	* Sets the x m y0028 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0028 the x m y0028 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0028(java.lang.String XMY0028) {
		_thongsochungchixemay.setXMY0028(XMY0028);
	}

	/**
	* Returns the x m y0029 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0029 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0029() {
		return _thongsochungchixemay.getXMY0029();
	}

	/**
	* Sets the x m y0029 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0029 the x m y0029 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0029(java.lang.String XMY0029) {
		_thongsochungchixemay.setXMY0029(XMY0029);
	}

	/**
	* Returns the x m y0030 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0030 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0030() {
		return _thongsochungchixemay.getXMY0030();
	}

	/**
	* Sets the x m y0030 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0030 the x m y0030 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0030(java.lang.String XMY0030) {
		_thongsochungchixemay.setXMY0030(XMY0030);
	}

	/**
	* Returns the x m y0031 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0031 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0031() {
		return _thongsochungchixemay.getXMY0031();
	}

	/**
	* Sets the x m y0031 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0031 the x m y0031 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0031(java.lang.String XMY0031) {
		_thongsochungchixemay.setXMY0031(XMY0031);
	}

	/**
	* Returns the x m y0032 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0032 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0032() {
		return _thongsochungchixemay.getXMY0032();
	}

	/**
	* Sets the x m y0032 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0032 the x m y0032 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0032(java.lang.String XMY0032) {
		_thongsochungchixemay.setXMY0032(XMY0032);
	}

	/**
	* Returns the x m y1032 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y1032 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY1032() {
		return _thongsochungchixemay.getXMY1032();
	}

	/**
	* Sets the x m y1032 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY1032 the x m y1032 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY1032(java.lang.String XMY1032) {
		_thongsochungchixemay.setXMY1032(XMY1032);
	}

	/**
	* Returns the x m y0033 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0033 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0033() {
		return _thongsochungchixemay.getXMY0033();
	}

	/**
	* Sets the x m y0033 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0033 the x m y0033 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0033(java.lang.String XMY0033) {
		_thongsochungchixemay.setXMY0033(XMY0033);
	}

	/**
	* Returns the x m y1033 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y1033 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY1033() {
		return _thongsochungchixemay.getXMY1033();
	}

	/**
	* Sets the x m y1033 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY1033 the x m y1033 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY1033(java.lang.String XMY1033) {
		_thongsochungchixemay.setXMY1033(XMY1033);
	}

	/**
	* Returns the x m y0034 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0034 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0034() {
		return _thongsochungchixemay.getXMY0034();
	}

	/**
	* Sets the x m y0034 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0034 the x m y0034 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0034(java.lang.String XMY0034) {
		_thongsochungchixemay.setXMY0034(XMY0034);
	}

	/**
	* Returns the x m y0035 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0035 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0035() {
		return _thongsochungchixemay.getXMY0035();
	}

	/**
	* Sets the x m y0035 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0035 the x m y0035 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0035(java.lang.String XMY0035) {
		_thongsochungchixemay.setXMY0035(XMY0035);
	}

	/**
	* Returns the x m y1035 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y1035 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY1035() {
		return _thongsochungchixemay.getXMY1035();
	}

	/**
	* Sets the x m y1035 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY1035 the x m y1035 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY1035(java.lang.String XMY1035) {
		_thongsochungchixemay.setXMY1035(XMY1035);
	}

	/**
	* Returns the x m y0036 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0036 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0036() {
		return _thongsochungchixemay.getXMY0036();
	}

	/**
	* Sets the x m y0036 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0036 the x m y0036 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0036(java.lang.String XMY0036) {
		_thongsochungchixemay.setXMY0036(XMY0036);
	}

	/**
	* Returns the x m y0037 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0037 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0037() {
		return _thongsochungchixemay.getXMY0037();
	}

	/**
	* Sets the x m y0037 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0037 the x m y0037 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0037(java.lang.String XMY0037) {
		_thongsochungchixemay.setXMY0037(XMY0037);
	}

	/**
	* Returns the x m y0038 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0038 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0038() {
		return _thongsochungchixemay.getXMY0038();
	}

	/**
	* Sets the x m y0038 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0038 the x m y0038 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0038(java.lang.String XMY0038) {
		_thongsochungchixemay.setXMY0038(XMY0038);
	}

	/**
	* Returns the x m y0039 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0039 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0039() {
		return _thongsochungchixemay.getXMY0039();
	}

	/**
	* Sets the x m y0039 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0039 the x m y0039 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0039(java.lang.String XMY0039) {
		_thongsochungchixemay.setXMY0039(XMY0039);
	}

	/**
	* Returns the x m y1039 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y1039 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY1039() {
		return _thongsochungchixemay.getXMY1039();
	}

	/**
	* Sets the x m y1039 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY1039 the x m y1039 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY1039(java.lang.String XMY1039) {
		_thongsochungchixemay.setXMY1039(XMY1039);
	}

	/**
	* Returns the x m y0040 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0040 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0040() {
		return _thongsochungchixemay.getXMY0040();
	}

	/**
	* Sets the x m y0040 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0040 the x m y0040 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0040(java.lang.String XMY0040) {
		_thongsochungchixemay.setXMY0040(XMY0040);
	}

	/**
	* Returns the x m y1040 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y1040 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY1040() {
		return _thongsochungchixemay.getXMY1040();
	}

	/**
	* Sets the x m y1040 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY1040 the x m y1040 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY1040(java.lang.String XMY1040) {
		_thongsochungchixemay.setXMY1040(XMY1040);
	}

	/**
	* Returns the x m y0041 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0041 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0041() {
		return _thongsochungchixemay.getXMY0041();
	}

	/**
	* Sets the x m y0041 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0041 the x m y0041 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0041(java.lang.String XMY0041) {
		_thongsochungchixemay.setXMY0041(XMY0041);
	}

	/**
	* Returns the x m y0042 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0042 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0042() {
		return _thongsochungchixemay.getXMY0042();
	}

	/**
	* Sets the x m y0042 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0042 the x m y0042 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0042(java.lang.String XMY0042) {
		_thongsochungchixemay.setXMY0042(XMY0042);
	}

	/**
	* Returns the x m y1042 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y1042 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY1042() {
		return _thongsochungchixemay.getXMY1042();
	}

	/**
	* Sets the x m y1042 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY1042 the x m y1042 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY1042(java.lang.String XMY1042) {
		_thongsochungchixemay.setXMY1042(XMY1042);
	}

	/**
	* Returns the x m y0043 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0043 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0043() {
		return _thongsochungchixemay.getXMY0043();
	}

	/**
	* Sets the x m y0043 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0043 the x m y0043 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0043(java.lang.String XMY0043) {
		_thongsochungchixemay.setXMY0043(XMY0043);
	}

	/**
	* Returns the x m y0044 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0044 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0044() {
		return _thongsochungchixemay.getXMY0044();
	}

	/**
	* Sets the x m y0044 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0044 the x m y0044 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0044(java.lang.String XMY0044) {
		_thongsochungchixemay.setXMY0044(XMY0044);
	}

	/**
	* Returns the x m y0045 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0045 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0045() {
		return _thongsochungchixemay.getXMY0045();
	}

	/**
	* Sets the x m y0045 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0045 the x m y0045 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0045(java.lang.String XMY0045) {
		_thongsochungchixemay.setXMY0045(XMY0045);
	}

	/**
	* Returns the x m y0046 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0046 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0046() {
		return _thongsochungchixemay.getXMY0046();
	}

	/**
	* Sets the x m y0046 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0046 the x m y0046 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0046(java.lang.String XMY0046) {
		_thongsochungchixemay.setXMY0046(XMY0046);
	}

	/**
	* Returns the x m y0047 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0047 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0047() {
		return _thongsochungchixemay.getXMY0047();
	}

	/**
	* Sets the x m y0047 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0047 the x m y0047 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0047(java.lang.String XMY0047) {
		_thongsochungchixemay.setXMY0047(XMY0047);
	}

	/**
	* Returns the x m y0048 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0048 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0048() {
		return _thongsochungchixemay.getXMY0048();
	}

	/**
	* Sets the x m y0048 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0048 the x m y0048 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0048(java.lang.String XMY0048) {
		_thongsochungchixemay.setXMY0048(XMY0048);
	}

	/**
	* Returns the x m y0049 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0049 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0049() {
		return _thongsochungchixemay.getXMY0049();
	}

	/**
	* Sets the x m y0049 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0049 the x m y0049 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0049(java.lang.String XMY0049) {
		_thongsochungchixemay.setXMY0049(XMY0049);
	}

	/**
	* Returns the x m y0050 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0050 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0050() {
		return _thongsochungchixemay.getXMY0050();
	}

	/**
	* Sets the x m y0050 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0050 the x m y0050 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0050(java.lang.String XMY0050) {
		_thongsochungchixemay.setXMY0050(XMY0050);
	}

	/**
	* Returns the x m y1050 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y1050 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY1050() {
		return _thongsochungchixemay.getXMY1050();
	}

	/**
	* Sets the x m y1050 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY1050 the x m y1050 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY1050(java.lang.String XMY1050) {
		_thongsochungchixemay.setXMY1050(XMY1050);
	}

	/**
	* Returns the x m y0051 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0051 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0051() {
		return _thongsochungchixemay.getXMY0051();
	}

	/**
	* Sets the x m y0051 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0051 the x m y0051 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0051(java.lang.String XMY0051) {
		_thongsochungchixemay.setXMY0051(XMY0051);
	}

	/**
	* Returns the x m y0052 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0052 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0052() {
		return _thongsochungchixemay.getXMY0052();
	}

	/**
	* Sets the x m y0052 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0052 the x m y0052 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0052(java.lang.String XMY0052) {
		_thongsochungchixemay.setXMY0052(XMY0052);
	}

	/**
	* Returns the x m y0053 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0053 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0053() {
		return _thongsochungchixemay.getXMY0053();
	}

	/**
	* Sets the x m y0053 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0053 the x m y0053 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0053(java.lang.String XMY0053) {
		_thongsochungchixemay.setXMY0053(XMY0053);
	}

	/**
	* Returns the x m y0054 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0054 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0054() {
		return _thongsochungchixemay.getXMY0054();
	}

	/**
	* Sets the x m y0054 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0054 the x m y0054 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0054(java.lang.String XMY0054) {
		_thongsochungchixemay.setXMY0054(XMY0054);
	}

	/**
	* Returns the x m y0055 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0055 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0055() {
		return _thongsochungchixemay.getXMY0055();
	}

	/**
	* Sets the x m y0055 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0055 the x m y0055 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0055(java.lang.String XMY0055) {
		_thongsochungchixemay.setXMY0055(XMY0055);
	}

	/**
	* Returns the x m y0056 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0056 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0056() {
		return _thongsochungchixemay.getXMY0056();
	}

	/**
	* Sets the x m y0056 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0056 the x m y0056 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0056(java.lang.String XMY0056) {
		_thongsochungchixemay.setXMY0056(XMY0056);
	}

	/**
	* Returns the x m y0057 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0057 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0057() {
		return _thongsochungchixemay.getXMY0057();
	}

	/**
	* Sets the x m y0057 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0057 the x m y0057 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0057(java.lang.String XMY0057) {
		_thongsochungchixemay.setXMY0057(XMY0057);
	}

	/**
	* Returns the x m y0058 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0058 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0058() {
		return _thongsochungchixemay.getXMY0058();
	}

	/**
	* Sets the x m y0058 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0058 the x m y0058 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0058(java.lang.String XMY0058) {
		_thongsochungchixemay.setXMY0058(XMY0058);
	}

	/**
	* Returns the x m y0059 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0059 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0059() {
		return _thongsochungchixemay.getXMY0059();
	}

	/**
	* Sets the x m y0059 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0059 the x m y0059 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0059(java.lang.String XMY0059) {
		_thongsochungchixemay.setXMY0059(XMY0059);
	}

	/**
	* Returns the x m y0060 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0060 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0060() {
		return _thongsochungchixemay.getXMY0060();
	}

	/**
	* Sets the x m y0060 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0060 the x m y0060 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0060(java.lang.String XMY0060) {
		_thongsochungchixemay.setXMY0060(XMY0060);
	}

	/**
	* Returns the x m y0061 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0061 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0061() {
		return _thongsochungchixemay.getXMY0061();
	}

	/**
	* Sets the x m y0061 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0061 the x m y0061 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0061(java.lang.String XMY0061) {
		_thongsochungchixemay.setXMY0061(XMY0061);
	}

	/**
	* Returns the x m y0062 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0062 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0062() {
		return _thongsochungchixemay.getXMY0062();
	}

	/**
	* Sets the x m y0062 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0062 the x m y0062 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0062(java.lang.String XMY0062) {
		_thongsochungchixemay.setXMY0062(XMY0062);
	}

	/**
	* Returns the x m y0063 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0063 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0063() {
		return _thongsochungchixemay.getXMY0063();
	}

	/**
	* Sets the x m y0063 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0063 the x m y0063 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0063(java.lang.String XMY0063) {
		_thongsochungchixemay.setXMY0063(XMY0063);
	}

	/**
	* Returns the x m y0064 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0064 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0064() {
		return _thongsochungchixemay.getXMY0064();
	}

	/**
	* Sets the x m y0064 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0064 the x m y0064 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0064(java.lang.String XMY0064) {
		_thongsochungchixemay.setXMY0064(XMY0064);
	}

	/**
	* Returns the x m y0065 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0065 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0065() {
		return _thongsochungchixemay.getXMY0065();
	}

	/**
	* Sets the x m y0065 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0065 the x m y0065 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0065(java.lang.String XMY0065) {
		_thongsochungchixemay.setXMY0065(XMY0065);
	}

	/**
	* Returns the x m y0066 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0066 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0066() {
		return _thongsochungchixemay.getXMY0066();
	}

	/**
	* Sets the x m y0066 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0066 the x m y0066 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0066(java.lang.String XMY0066) {
		_thongsochungchixemay.setXMY0066(XMY0066);
	}

	/**
	* Returns the x m y0067 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0067 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0067() {
		return _thongsochungchixemay.getXMY0067();
	}

	/**
	* Sets the x m y0067 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0067 the x m y0067 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0067(java.lang.String XMY0067) {
		_thongsochungchixemay.setXMY0067(XMY0067);
	}

	/**
	* Returns the x m y0068 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0068 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0068() {
		return _thongsochungchixemay.getXMY0068();
	}

	/**
	* Sets the x m y0068 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0068 the x m y0068 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0068(java.lang.String XMY0068) {
		_thongsochungchixemay.setXMY0068(XMY0068);
	}

	/**
	* Returns the x m y0069 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0069 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0069() {
		return _thongsochungchixemay.getXMY0069();
	}

	/**
	* Sets the x m y0069 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0069 the x m y0069 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0069(java.lang.String XMY0069) {
		_thongsochungchixemay.setXMY0069(XMY0069);
	}

	/**
	* Returns the x m y0082 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0082 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0082() {
		return _thongsochungchixemay.getXMY0082();
	}

	/**
	* Sets the x m y0082 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0082 the x m y0082 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0082(java.lang.String XMY0082) {
		_thongsochungchixemay.setXMY0082(XMY0082);
	}

	/**
	* Returns the x m y0083 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0083 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0083() {
		return _thongsochungchixemay.getXMY0083();
	}

	/**
	* Sets the x m y0083 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0083 the x m y0083 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0083(java.lang.String XMY0083) {
		_thongsochungchixemay.setXMY0083(XMY0083);
	}

	/**
	* Returns the x m y0084 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0084 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0084() {
		return _thongsochungchixemay.getXMY0084();
	}

	/**
	* Sets the x m y0084 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0084 the x m y0084 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0084(java.lang.String XMY0084) {
		_thongsochungchixemay.setXMY0084(XMY0084);
	}

	/**
	* Returns the x m y0085 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0085 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0085() {
		return _thongsochungchixemay.getXMY0085();
	}

	/**
	* Sets the x m y0085 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0085 the x m y0085 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0085(java.lang.String XMY0085) {
		_thongsochungchixemay.setXMY0085(XMY0085);
	}

	/**
	* Returns the x m y0086 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0086 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0086() {
		return _thongsochungchixemay.getXMY0086();
	}

	/**
	* Sets the x m y0086 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0086 the x m y0086 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0086(java.lang.String XMY0086) {
		_thongsochungchixemay.setXMY0086(XMY0086);
	}

	/**
	* Returns the x m y1086 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y1086 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY1086() {
		return _thongsochungchixemay.getXMY1086();
	}

	/**
	* Sets the x m y1086 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY1086 the x m y1086 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY1086(java.lang.String XMY1086) {
		_thongsochungchixemay.setXMY1086(XMY1086);
	}

	/**
	* Returns the x m y0087 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0087 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0087() {
		return _thongsochungchixemay.getXMY0087();
	}

	/**
	* Sets the x m y0087 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0087 the x m y0087 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0087(java.lang.String XMY0087) {
		_thongsochungchixemay.setXMY0087(XMY0087);
	}

	/**
	* Returns the x m y1087 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y1087 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY1087() {
		return _thongsochungchixemay.getXMY1087();
	}

	/**
	* Sets the x m y1087 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY1087 the x m y1087 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY1087(java.lang.String XMY1087) {
		_thongsochungchixemay.setXMY1087(XMY1087);
	}

	/**
	* Returns the x m y1187 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y1187 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY1187() {
		return _thongsochungchixemay.getXMY1187();
	}

	/**
	* Sets the x m y1187 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY1187 the x m y1187 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY1187(java.lang.String XMY1187) {
		_thongsochungchixemay.setXMY1187(XMY1187);
	}

	/**
	* Returns the x m y0088 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0088 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0088() {
		return _thongsochungchixemay.getXMY0088();
	}

	/**
	* Sets the x m y0088 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0088 the x m y0088 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0088(java.lang.String XMY0088) {
		_thongsochungchixemay.setXMY0088(XMY0088);
	}

	/**
	* Returns the x m y1088 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y1088 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY1088() {
		return _thongsochungchixemay.getXMY1088();
	}

	/**
	* Sets the x m y1088 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY1088 the x m y1088 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY1088(java.lang.String XMY1088) {
		_thongsochungchixemay.setXMY1088(XMY1088);
	}

	/**
	* Returns the x m y1188 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y1188 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY1188() {
		return _thongsochungchixemay.getXMY1188();
	}

	/**
	* Sets the x m y1188 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY1188 the x m y1188 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY1188(java.lang.String XMY1188) {
		_thongsochungchixemay.setXMY1188(XMY1188);
	}

	/**
	* Returns the x m y0089 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0089 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0089() {
		return _thongsochungchixemay.getXMY0089();
	}

	/**
	* Sets the x m y0089 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0089 the x m y0089 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0089(java.lang.String XMY0089) {
		_thongsochungchixemay.setXMY0089(XMY0089);
	}

	/**
	* Returns the x m y1089 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y1089 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY1089() {
		return _thongsochungchixemay.getXMY1089();
	}

	/**
	* Sets the x m y1089 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY1089 the x m y1089 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY1089(java.lang.String XMY1089) {
		_thongsochungchixemay.setXMY1089(XMY1089);
	}

	/**
	* Returns the x m y1189 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y1189 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY1189() {
		return _thongsochungchixemay.getXMY1189();
	}

	/**
	* Sets the x m y1189 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY1189 the x m y1189 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY1189(java.lang.String XMY1189) {
		_thongsochungchixemay.setXMY1189(XMY1189);
	}

	/**
	* Returns the x m y0090 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0090 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0090() {
		return _thongsochungchixemay.getXMY0090();
	}

	/**
	* Sets the x m y0090 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0090 the x m y0090 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0090(java.lang.String XMY0090) {
		_thongsochungchixemay.setXMY0090(XMY0090);
	}

	/**
	* Returns the x m y0091 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0091 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0091() {
		return _thongsochungchixemay.getXMY0091();
	}

	/**
	* Sets the x m y0091 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0091 the x m y0091 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0091(java.lang.String XMY0091) {
		_thongsochungchixemay.setXMY0091(XMY0091);
	}

	/**
	* Returns the x m y0092 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0092 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0092() {
		return _thongsochungchixemay.getXMY0092();
	}

	/**
	* Sets the x m y0092 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0092 the x m y0092 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0092(java.lang.String XMY0092) {
		_thongsochungchixemay.setXMY0092(XMY0092);
	}

	/**
	* Returns the x m y0093 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0093 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0093() {
		return _thongsochungchixemay.getXMY0093();
	}

	/**
	* Sets the x m y0093 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0093 the x m y0093 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0093(java.lang.String XMY0093) {
		_thongsochungchixemay.setXMY0093(XMY0093);
	}

	/**
	* Returns the x m y0094 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0094 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0094() {
		return _thongsochungchixemay.getXMY0094();
	}

	/**
	* Sets the x m y0094 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0094 the x m y0094 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0094(java.lang.String XMY0094) {
		_thongsochungchixemay.setXMY0094(XMY0094);
	}

	/**
	* Returns the x m y0095 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0095 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0095() {
		return _thongsochungchixemay.getXMY0095();
	}

	/**
	* Sets the x m y0095 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0095 the x m y0095 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0095(java.lang.String XMY0095) {
		_thongsochungchixemay.setXMY0095(XMY0095);
	}

	/**
	* Returns the x m y0096 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0096 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0096() {
		return _thongsochungchixemay.getXMY0096();
	}

	/**
	* Sets the x m y0096 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0096 the x m y0096 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0096(java.lang.String XMY0096) {
		_thongsochungchixemay.setXMY0096(XMY0096);
	}

	/**
	* Returns the x m y0097 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0097 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0097() {
		return _thongsochungchixemay.getXMY0097();
	}

	/**
	* Sets the x m y0097 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0097 the x m y0097 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0097(java.lang.String XMY0097) {
		_thongsochungchixemay.setXMY0097(XMY0097);
	}

	/**
	* Returns the x m y0098 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0098 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0098() {
		return _thongsochungchixemay.getXMY0098();
	}

	/**
	* Sets the x m y0098 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0098 the x m y0098 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0098(java.lang.String XMY0098) {
		_thongsochungchixemay.setXMY0098(XMY0098);
	}

	/**
	* Returns the x m y0099 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0099 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0099() {
		return _thongsochungchixemay.getXMY0099();
	}

	/**
	* Sets the x m y0099 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0099 the x m y0099 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0099(java.lang.String XMY0099) {
		_thongsochungchixemay.setXMY0099(XMY0099);
	}

	/**
	* Returns the x m y0100 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0100 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0100() {
		return _thongsochungchixemay.getXMY0100();
	}

	/**
	* Sets the x m y0100 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0100 the x m y0100 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0100(java.lang.String XMY0100) {
		_thongsochungchixemay.setXMY0100(XMY0100);
	}

	/**
	* Returns the x m y0101 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0101 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0101() {
		return _thongsochungchixemay.getXMY0101();
	}

	/**
	* Sets the x m y0101 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0101 the x m y0101 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0101(java.lang.String XMY0101) {
		_thongsochungchixemay.setXMY0101(XMY0101);
	}

	/**
	* Returns the x m y0102 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0102 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0102() {
		return _thongsochungchixemay.getXMY0102();
	}

	/**
	* Sets the x m y0102 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0102 the x m y0102 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0102(java.lang.String XMY0102) {
		_thongsochungchixemay.setXMY0102(XMY0102);
	}

	/**
	* Returns the x m y0103 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0103 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0103() {
		return _thongsochungchixemay.getXMY0103();
	}

	/**
	* Sets the x m y0103 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0103 the x m y0103 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0103(java.lang.String XMY0103) {
		_thongsochungchixemay.setXMY0103(XMY0103);
	}

	/**
	* Returns the x m y0104 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0104 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0104() {
		return _thongsochungchixemay.getXMY0104();
	}

	/**
	* Sets the x m y0104 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0104 the x m y0104 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0104(java.lang.String XMY0104) {
		_thongsochungchixemay.setXMY0104(XMY0104);
	}

	/**
	* Returns the x m y0105 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0105 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0105() {
		return _thongsochungchixemay.getXMY0105();
	}

	/**
	* Sets the x m y0105 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0105 the x m y0105 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0105(java.lang.String XMY0105) {
		_thongsochungchixemay.setXMY0105(XMY0105);
	}

	/**
	* Returns the x m y0106 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0106 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0106() {
		return _thongsochungchixemay.getXMY0106();
	}

	/**
	* Sets the x m y0106 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0106 the x m y0106 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0106(java.lang.String XMY0106) {
		_thongsochungchixemay.setXMY0106(XMY0106);
	}

	/**
	* Returns the x m y2106 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y2106 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY2106() {
		return _thongsochungchixemay.getXMY2106();
	}

	/**
	* Sets the x m y2106 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY2106 the x m y2106 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY2106(java.lang.String XMY2106) {
		_thongsochungchixemay.setXMY2106(XMY2106);
	}

	/**
	* Returns the x m y0107 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0107 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0107() {
		return _thongsochungchixemay.getXMY0107();
	}

	/**
	* Sets the x m y0107 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0107 the x m y0107 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0107(java.lang.String XMY0107) {
		_thongsochungchixemay.setXMY0107(XMY0107);
	}

	/**
	* Returns the x m y2107 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y2107 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY2107() {
		return _thongsochungchixemay.getXMY2107();
	}

	/**
	* Sets the x m y2107 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY2107 the x m y2107 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY2107(java.lang.String XMY2107) {
		_thongsochungchixemay.setXMY2107(XMY2107);
	}

	/**
	* Returns the x m y0108 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0108 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0108() {
		return _thongsochungchixemay.getXMY0108();
	}

	/**
	* Sets the x m y0108 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0108 the x m y0108 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0108(java.lang.String XMY0108) {
		_thongsochungchixemay.setXMY0108(XMY0108);
	}

	/**
	* Returns the x m y2108 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y2108 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY2108() {
		return _thongsochungchixemay.getXMY2108();
	}

	/**
	* Sets the x m y2108 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY2108 the x m y2108 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY2108(java.lang.String XMY2108) {
		_thongsochungchixemay.setXMY2108(XMY2108);
	}

	/**
	* Returns the x m y0109 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0109 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0109() {
		return _thongsochungchixemay.getXMY0109();
	}

	/**
	* Sets the x m y0109 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0109 the x m y0109 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0109(java.lang.String XMY0109) {
		_thongsochungchixemay.setXMY0109(XMY0109);
	}

	/**
	* Returns the x m y2109 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y2109 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY2109() {
		return _thongsochungchixemay.getXMY2109();
	}

	/**
	* Sets the x m y2109 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY2109 the x m y2109 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY2109(java.lang.String XMY2109) {
		_thongsochungchixemay.setXMY2109(XMY2109);
	}

	/**
	* Returns the x m y0110 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0110 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0110() {
		return _thongsochungchixemay.getXMY0110();
	}

	/**
	* Sets the x m y0110 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0110 the x m y0110 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0110(java.lang.String XMY0110) {
		_thongsochungchixemay.setXMY0110(XMY0110);
	}

	/**
	* Returns the x m y2110 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y2110 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY2110() {
		return _thongsochungchixemay.getXMY2110();
	}

	/**
	* Sets the x m y2110 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY2110 the x m y2110 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY2110(java.lang.String XMY2110) {
		_thongsochungchixemay.setXMY2110(XMY2110);
	}

	/**
	* Returns the x m y0111 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0111 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0111() {
		return _thongsochungchixemay.getXMY0111();
	}

	/**
	* Sets the x m y0111 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0111 the x m y0111 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0111(java.lang.String XMY0111) {
		_thongsochungchixemay.setXMY0111(XMY0111);
	}

	/**
	* Returns the x m y2111 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y2111 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY2111() {
		return _thongsochungchixemay.getXMY2111();
	}

	/**
	* Sets the x m y2111 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY2111 the x m y2111 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY2111(java.lang.String XMY2111) {
		_thongsochungchixemay.setXMY2111(XMY2111);
	}

	/**
	* Returns the x m y0112 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0112 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0112() {
		return _thongsochungchixemay.getXMY0112();
	}

	/**
	* Sets the x m y0112 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0112 the x m y0112 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0112(java.lang.String XMY0112) {
		_thongsochungchixemay.setXMY0112(XMY0112);
	}

	/**
	* Returns the x m y2112 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y2112 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY2112() {
		return _thongsochungchixemay.getXMY2112();
	}

	/**
	* Sets the x m y2112 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY2112 the x m y2112 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY2112(java.lang.String XMY2112) {
		_thongsochungchixemay.setXMY2112(XMY2112);
	}

	/**
	* Returns the x m y0113 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0113 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0113() {
		return _thongsochungchixemay.getXMY0113();
	}

	/**
	* Sets the x m y0113 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0113 the x m y0113 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0113(java.lang.String XMY0113) {
		_thongsochungchixemay.setXMY0113(XMY0113);
	}

	/**
	* Returns the x m y2113 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y2113 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY2113() {
		return _thongsochungchixemay.getXMY2113();
	}

	/**
	* Sets the x m y2113 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY2113 the x m y2113 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY2113(java.lang.String XMY2113) {
		_thongsochungchixemay.setXMY2113(XMY2113);
	}

	/**
	* Returns the x m y0114 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0114 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0114() {
		return _thongsochungchixemay.getXMY0114();
	}

	/**
	* Sets the x m y0114 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0114 the x m y0114 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0114(java.lang.String XMY0114) {
		_thongsochungchixemay.setXMY0114(XMY0114);
	}

	/**
	* Returns the x m y2114 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y2114 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY2114() {
		return _thongsochungchixemay.getXMY2114();
	}

	/**
	* Sets the x m y2114 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY2114 the x m y2114 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY2114(java.lang.String XMY2114) {
		_thongsochungchixemay.setXMY2114(XMY2114);
	}

	/**
	* Returns the x m y0115 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0115 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0115() {
		return _thongsochungchixemay.getXMY0115();
	}

	/**
	* Sets the x m y0115 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0115 the x m y0115 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0115(java.lang.String XMY0115) {
		_thongsochungchixemay.setXMY0115(XMY0115);
	}

	/**
	* Returns the x m y2115 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y2115 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY2115() {
		return _thongsochungchixemay.getXMY2115();
	}

	/**
	* Sets the x m y2115 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY2115 the x m y2115 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY2115(java.lang.String XMY2115) {
		_thongsochungchixemay.setXMY2115(XMY2115);
	}

	/**
	* Returns the x m y0116 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0116 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0116() {
		return _thongsochungchixemay.getXMY0116();
	}

	/**
	* Sets the x m y0116 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0116 the x m y0116 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0116(java.lang.String XMY0116) {
		_thongsochungchixemay.setXMY0116(XMY0116);
	}

	/**
	* Returns the x m y2116 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y2116 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY2116() {
		return _thongsochungchixemay.getXMY2116();
	}

	/**
	* Sets the x m y2116 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY2116 the x m y2116 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY2116(java.lang.String XMY2116) {
		_thongsochungchixemay.setXMY2116(XMY2116);
	}

	/**
	* Returns the x m y0117 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0117 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0117() {
		return _thongsochungchixemay.getXMY0117();
	}

	/**
	* Sets the x m y0117 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0117 the x m y0117 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0117(java.lang.String XMY0117) {
		_thongsochungchixemay.setXMY0117(XMY0117);
	}

	/**
	* Returns the x m y2117 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y2117 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY2117() {
		return _thongsochungchixemay.getXMY2117();
	}

	/**
	* Sets the x m y2117 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY2117 the x m y2117 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY2117(java.lang.String XMY2117) {
		_thongsochungchixemay.setXMY2117(XMY2117);
	}

	/**
	* Returns the x m y0118 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0118 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0118() {
		return _thongsochungchixemay.getXMY0118();
	}

	/**
	* Sets the x m y0118 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0118 the x m y0118 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0118(java.lang.String XMY0118) {
		_thongsochungchixemay.setXMY0118(XMY0118);
	}

	/**
	* Returns the x m y2118 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y2118 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY2118() {
		return _thongsochungchixemay.getXMY2118();
	}

	/**
	* Sets the x m y2118 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY2118 the x m y2118 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY2118(java.lang.String XMY2118) {
		_thongsochungchixemay.setXMY2118(XMY2118);
	}

	/**
	* Returns the x m y0119 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0119 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0119() {
		return _thongsochungchixemay.getXMY0119();
	}

	/**
	* Sets the x m y0119 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0119 the x m y0119 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0119(java.lang.String XMY0119) {
		_thongsochungchixemay.setXMY0119(XMY0119);
	}

	/**
	* Returns the x m y2119 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y2119 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY2119() {
		return _thongsochungchixemay.getXMY2119();
	}

	/**
	* Sets the x m y2119 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY2119 the x m y2119 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY2119(java.lang.String XMY2119) {
		_thongsochungchixemay.setXMY2119(XMY2119);
	}

	/**
	* Returns the x m y0120 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0120 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0120() {
		return _thongsochungchixemay.getXMY0120();
	}

	/**
	* Sets the x m y0120 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0120 the x m y0120 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0120(java.lang.String XMY0120) {
		_thongsochungchixemay.setXMY0120(XMY0120);
	}

	/**
	* Returns the x m y0121 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0121 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0121() {
		return _thongsochungchixemay.getXMY0121();
	}

	/**
	* Sets the x m y0121 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0121 the x m y0121 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0121(java.lang.String XMY0121) {
		_thongsochungchixemay.setXMY0121(XMY0121);
	}

	/**
	* Returns the x m y2121 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y2121 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY2121() {
		return _thongsochungchixemay.getXMY2121();
	}

	/**
	* Sets the x m y2121 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY2121 the x m y2121 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY2121(java.lang.String XMY2121) {
		_thongsochungchixemay.setXMY2121(XMY2121);
	}

	/**
	* Returns the x m y0122 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0122 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0122() {
		return _thongsochungchixemay.getXMY0122();
	}

	/**
	* Sets the x m y0122 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0122 the x m y0122 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0122(java.lang.String XMY0122) {
		_thongsochungchixemay.setXMY0122(XMY0122);
	}

	/**
	* Returns the x m y0198 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y0198 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY0198() {
		return _thongsochungchixemay.getXMY0198();
	}

	/**
	* Sets the x m y0198 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY0198 the x m y0198 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY0198(java.lang.String XMY0198) {
		_thongsochungchixemay.setXMY0198(XMY0198);
	}

	/**
	* Returns the x m y1098 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @return the x m y1098 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public java.lang.String getXMY1098() {
		return _thongsochungchixemay.getXMY1098();
	}

	/**
	* Sets the x m y1098 of this t h o n g s o c h u n g c h i x e m a y.
	*
	* @param XMY1098 the x m y1098 of this t h o n g s o c h u n g c h i x e m a y
	*/
	@Override
	public void setXMY1098(java.lang.String XMY1098) {
		_thongsochungchixemay.setXMY1098(XMY1098);
	}

	@Override
	public boolean isNew() {
		return _thongsochungchixemay.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_thongsochungchixemay.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _thongsochungchixemay.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_thongsochungchixemay.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _thongsochungchixemay.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _thongsochungchixemay.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_thongsochungchixemay.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _thongsochungchixemay.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_thongsochungchixemay.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_thongsochungchixemay.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_thongsochungchixemay.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new THONGSOCHUNGCHIXEMAYWrapper((THONGSOCHUNGCHIXEMAY)_thongsochungchixemay.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY thongsochungchixemay) {
		return _thongsochungchixemay.compareTo(thongsochungchixemay);
	}

	@Override
	public int hashCode() {
		return _thongsochungchixemay.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY> toCacheModel() {
		return _thongsochungchixemay.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY toEscapedModel() {
		return new THONGSOCHUNGCHIXEMAYWrapper(_thongsochungchixemay.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY toUnescapedModel() {
		return new THONGSOCHUNGCHIXEMAYWrapper(_thongsochungchixemay.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _thongsochungchixemay.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _thongsochungchixemay.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_thongsochungchixemay.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof THONGSOCHUNGCHIXEMAYWrapper)) {
			return false;
		}

		THONGSOCHUNGCHIXEMAYWrapper thongsochungchixemayWrapper = (THONGSOCHUNGCHIXEMAYWrapper)obj;

		if (Validator.equals(_thongsochungchixemay,
					thongsochungchixemayWrapper._thongsochungchixemay)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public THONGSOCHUNGCHIXEMAY getWrappedTHONGSOCHUNGCHIXEMAY() {
		return _thongsochungchixemay;
	}

	@Override
	public THONGSOCHUNGCHIXEMAY getWrappedModel() {
		return _thongsochungchixemay;
	}

	@Override
	public void resetOriginalValues() {
		_thongsochungchixemay.resetOriginalValues();
	}

	private THONGSOCHUNGCHIXEMAY _thongsochungchixemay;
}