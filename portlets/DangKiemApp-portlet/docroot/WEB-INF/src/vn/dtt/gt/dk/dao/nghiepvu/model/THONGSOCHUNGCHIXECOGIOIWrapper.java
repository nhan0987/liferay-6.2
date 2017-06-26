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
 * This class is a wrapper for {@link THONGSOCHUNGCHIXECOGIOI}.
 * </p>
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXECOGIOI
 * @generated
 */
public class THONGSOCHUNGCHIXECOGIOIWrapper implements THONGSOCHUNGCHIXECOGIOI,
	ModelWrapper<THONGSOCHUNGCHIXECOGIOI> {
	public THONGSOCHUNGCHIXECOGIOIWrapper(
		THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi) {
		_thongsochungchixecogioi = thongsochungchixecogioi;
	}

	@Override
	public Class<?> getModelClass() {
		return THONGSOCHUNGCHIXECOGIOI.class;
	}

	@Override
	public String getModelClassName() {
		return THONGSOCHUNGCHIXECOGIOI.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("certificateRecordId", getCertificateRecordId());
		attributes.put("vehicleGroupId", getVehicleGroupId());
		attributes.put("SynchDate", getSynchDate());
		attributes.put("XCG0009", getXCG0009());
		attributes.put("XCG0010", getXCG0010());
		attributes.put("XCG0011", getXCG0011());
		attributes.put("XCG0012", getXCG0012());
		attributes.put("XCG0013", getXCG0013());
		attributes.put("XCG0014", getXCG0014());
		attributes.put("XCG0015", getXCG0015());
		attributes.put("XCG0016", getXCG0016());
		attributes.put("XCG0017", getXCG0017());
		attributes.put("XCG0018", getXCG0018());
		attributes.put("XCG0019", getXCG0019());
		attributes.put("XCG0020", getXCG0020());
		attributes.put("XCG0021", getXCG0021());
		attributes.put("XCG1021", getXCG1021());
		attributes.put("XCG1121", getXCG1121());
		attributes.put("XCG0022", getXCG0022());
		attributes.put("XCG1022", getXCG1022());
		attributes.put("XCG1122", getXCG1122());
		attributes.put("XCG0023", getXCG0023());
		attributes.put("XCG1023", getXCG1023());
		attributes.put("XCG1123", getXCG1123());
		attributes.put("XCG0024", getXCG0024());
		attributes.put("XCG1024", getXCG1024());
		attributes.put("XCG1124", getXCG1124());
		attributes.put("XCG0025", getXCG0025());
		attributes.put("XCG1025", getXCG1025());
		attributes.put("XCG1125", getXCG1125());
		attributes.put("XCG0026", getXCG0026());
		attributes.put("XCG1026", getXCG1026());
		attributes.put("XCG1126", getXCG1126());
		attributes.put("XCG0027", getXCG0027());
		attributes.put("XCG1027", getXCG1027());
		attributes.put("XCG1127", getXCG1127());
		attributes.put("XCG0028", getXCG0028());
		attributes.put("XCG1028", getXCG1028());
		attributes.put("XCG1128", getXCG1128());
		attributes.put("XCG0029", getXCG0029());
		attributes.put("XCG1029", getXCG1029());
		attributes.put("XCG1129", getXCG1129());
		attributes.put("XCG0030", getXCG0030());
		attributes.put("XCG1030", getXCG1030());
		attributes.put("XCG1130", getXCG1130());
		attributes.put("XCG0031", getXCG0031());
		attributes.put("XCG1031", getXCG1031());
		attributes.put("XCG1131", getXCG1131());
		attributes.put("XCG0032", getXCG0032());
		attributes.put("XCG1032", getXCG1032());
		attributes.put("XCG1132", getXCG1132());
		attributes.put("XCG0033", getXCG0033());
		attributes.put("XCG1033", getXCG1033());
		attributes.put("XCG1133", getXCG1133());
		attributes.put("XCG0034", getXCG0034());
		attributes.put("XCG1034", getXCG1034());
		attributes.put("XCG1134", getXCG1134());
		attributes.put("XCG0035", getXCG0035());
		attributes.put("XCG1035", getXCG1035());
		attributes.put("XCG1135", getXCG1135());
		attributes.put("XCG0036", getXCG0036());
		attributes.put("XCG1036", getXCG1036());
		attributes.put("XCG1136", getXCG1136());
		attributes.put("XCG0037", getXCG0037());
		attributes.put("XCG1037", getXCG1037());
		attributes.put("XCG1137", getXCG1137());
		attributes.put("XCG0038", getXCG0038());
		attributes.put("XCG1038", getXCG1038());
		attributes.put("XCG1138", getXCG1138());
		attributes.put("XCG0039", getXCG0039());
		attributes.put("XCG1039", getXCG1039());
		attributes.put("XCG1139", getXCG1139());
		attributes.put("XCG0040", getXCG0040());
		attributes.put("XCG1040", getXCG1040());
		attributes.put("XCG1140", getXCG1140());
		attributes.put("XCG0041", getXCG0041());
		attributes.put("XCG1041", getXCG1041());
		attributes.put("XCG1141", getXCG1141());
		attributes.put("XCG0042", getXCG0042());
		attributes.put("XCG1042", getXCG1042());
		attributes.put("XCG1142", getXCG1142());
		attributes.put("XCG0043", getXCG0043());
		attributes.put("XCG1043", getXCG1043());
		attributes.put("XCG1143", getXCG1143());
		attributes.put("XCG0044", getXCG0044());
		attributes.put("XCG1044", getXCG1044());
		attributes.put("XCG1144", getXCG1144());
		attributes.put("XCG0045", getXCG0045());
		attributes.put("XCG0046", getXCG0046());
		attributes.put("XCG1047", getXCG1047());
		attributes.put("XCG0047", getXCG0047());
		attributes.put("XCG0048", getXCG0048());
		attributes.put("XCG0049", getXCG0049());
		attributes.put("XCG0050", getXCG0050());
		attributes.put("XCG0051", getXCG0051());
		attributes.put("XCG0052", getXCG0052());
		attributes.put("XCG0053", getXCG0053());
		attributes.put("XCG0054", getXCG0054());
		attributes.put("XCG1054", getXCG1054());
		attributes.put("XCG1154", getXCG1154());
		attributes.put("XCG1254", getXCG1254());
		attributes.put("XCG1354", getXCG1354());
		attributes.put("XCG1454", getXCG1454());
		attributes.put("XCG1554", getXCG1554());
		attributes.put("XCG1654", getXCG1654());
		attributes.put("XCG1754", getXCG1754());
		attributes.put("XCG0055", getXCG0055());
		attributes.put("XCG0056", getXCG0056());
		attributes.put("XCG0057", getXCG0057());
		attributes.put("XCG0058", getXCG0058());
		attributes.put("XCG0059", getXCG0059());
		attributes.put("XCG1059", getXCG1059());
		attributes.put("XCG0060", getXCG0060());
		attributes.put("XCG0061", getXCG0061());
		attributes.put("XCG0062", getXCG0062());
		attributes.put("XCG0063", getXCG0063());
		attributes.put("XCG0064", getXCG0064());
		attributes.put("XCG0065", getXCG0065());
		attributes.put("XCG0066", getXCG0066());
		attributes.put("XCG1066", getXCG1066());
		attributes.put("XCG0067", getXCG0067());
		attributes.put("XCG0068", getXCG0068());
		attributes.put("XCG0069", getXCG0069());
		attributes.put("XCG0070", getXCG0070());
		attributes.put("XCG0071", getXCG0071());
		attributes.put("XCG0072", getXCG0072());
		attributes.put("XCG1072", getXCG1072());
		attributes.put("XCG0073", getXCG0073());
		attributes.put("XCG0074", getXCG0074());
		attributes.put("XCG0075", getXCG0075());
		attributes.put("XCG0076", getXCG0076());
		attributes.put("XCG0077", getXCG0077());
		attributes.put("XCG1077", getXCG1077());
		attributes.put("XCG0078", getXCG0078());
		attributes.put("XCG1078", getXCG1078());
		attributes.put("XCG0079", getXCG0079());
		attributes.put("XCG0080", getXCG0080());
		attributes.put("XCG1080", getXCG1080());
		attributes.put("XCG0081", getXCG0081());
		attributes.put("XCG0082", getXCG0082());
		attributes.put("XCG0083", getXCG0083());
		attributes.put("XCG0084", getXCG0084());
		attributes.put("XCG0085", getXCG0085());
		attributes.put("XCG1085", getXCG1085());
		attributes.put("XCG0086", getXCG0086());
		attributes.put("XCG1086", getXCG1086());
		attributes.put("XCG0087", getXCG0087());
		attributes.put("XCG0088", getXCG0088());
		attributes.put("XCG1088", getXCG1088());
		attributes.put("XCG0089", getXCG0089());
		attributes.put("XCG0090", getXCG0090());
		attributes.put("XCG0091", getXCG0091());
		attributes.put("XCG0092", getXCG0092());
		attributes.put("XCG0093", getXCG0093());
		attributes.put("XCG0094", getXCG0094());
		attributes.put("XCG0095", getXCG0095());
		attributes.put("XCG0096", getXCG0096());
		attributes.put("XCG0097", getXCG0097());
		attributes.put("XCG1097", getXCG1097());
		attributes.put("XCG0098", getXCG0098());
		attributes.put("XCG0099", getXCG0099());
		attributes.put("XCG0100", getXCG0100());
		attributes.put("XCG0101", getXCG0101());
		attributes.put("XCG0102", getXCG0102());
		attributes.put("XCG0103", getXCG0103());
		attributes.put("XCG0104", getXCG0104());
		attributes.put("XCG0105", getXCG0105());
		attributes.put("XCG0106", getXCG0106());
		attributes.put("XCG0107", getXCG0107());
		attributes.put("XCG0108", getXCG0108());
		attributes.put("XCG0109", getXCG0109());
		attributes.put("XCG0110", getXCG0110());
		attributes.put("XCG0111", getXCG0111());
		attributes.put("XCG0112", getXCG0112());
		attributes.put("XCG0113", getXCG0113());
		attributes.put("XCG0114", getXCG0114());
		attributes.put("XCG0115", getXCG0115());
		attributes.put("XCG0116", getXCG0116());
		attributes.put("XCG0117", getXCG0117());
		attributes.put("XCG0118", getXCG0118());
		attributes.put("XCG0119", getXCG0119());
		attributes.put("XCG0120", getXCG0120());
		attributes.put("XCG0121", getXCG0121());
		attributes.put("XCG0122", getXCG0122());
		attributes.put("XCG0123", getXCG0123());
		attributes.put("XCG0124", getXCG0124());
		attributes.put("XCG0125", getXCG0125());
		attributes.put("XCG0126", getXCG0126());
		attributes.put("XCG0127", getXCG0127());
		attributes.put("XCG0128", getXCG0128());
		attributes.put("XCG0238", getXCG0238());
		attributes.put("XCG0239", getXCG0239());
		attributes.put("XCG0240", getXCG0240());
		attributes.put("XCG0241", getXCG0241());

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

		String XCG0009 = (String)attributes.get("XCG0009");

		if (XCG0009 != null) {
			setXCG0009(XCG0009);
		}

		String XCG0010 = (String)attributes.get("XCG0010");

		if (XCG0010 != null) {
			setXCG0010(XCG0010);
		}

		String XCG0011 = (String)attributes.get("XCG0011");

		if (XCG0011 != null) {
			setXCG0011(XCG0011);
		}

		String XCG0012 = (String)attributes.get("XCG0012");

		if (XCG0012 != null) {
			setXCG0012(XCG0012);
		}

		String XCG0013 = (String)attributes.get("XCG0013");

		if (XCG0013 != null) {
			setXCG0013(XCG0013);
		}

		String XCG0014 = (String)attributes.get("XCG0014");

		if (XCG0014 != null) {
			setXCG0014(XCG0014);
		}

		String XCG0015 = (String)attributes.get("XCG0015");

		if (XCG0015 != null) {
			setXCG0015(XCG0015);
		}

		String XCG0016 = (String)attributes.get("XCG0016");

		if (XCG0016 != null) {
			setXCG0016(XCG0016);
		}

		String XCG0017 = (String)attributes.get("XCG0017");

		if (XCG0017 != null) {
			setXCG0017(XCG0017);
		}

		String XCG0018 = (String)attributes.get("XCG0018");

		if (XCG0018 != null) {
			setXCG0018(XCG0018);
		}

		String XCG0019 = (String)attributes.get("XCG0019");

		if (XCG0019 != null) {
			setXCG0019(XCG0019);
		}

		String XCG0020 = (String)attributes.get("XCG0020");

		if (XCG0020 != null) {
			setXCG0020(XCG0020);
		}

		String XCG0021 = (String)attributes.get("XCG0021");

		if (XCG0021 != null) {
			setXCG0021(XCG0021);
		}

		String XCG1021 = (String)attributes.get("XCG1021");

		if (XCG1021 != null) {
			setXCG1021(XCG1021);
		}

		String XCG1121 = (String)attributes.get("XCG1121");

		if (XCG1121 != null) {
			setXCG1121(XCG1121);
		}

		String XCG0022 = (String)attributes.get("XCG0022");

		if (XCG0022 != null) {
			setXCG0022(XCG0022);
		}

		String XCG1022 = (String)attributes.get("XCG1022");

		if (XCG1022 != null) {
			setXCG1022(XCG1022);
		}

		String XCG1122 = (String)attributes.get("XCG1122");

		if (XCG1122 != null) {
			setXCG1122(XCG1122);
		}

		String XCG0023 = (String)attributes.get("XCG0023");

		if (XCG0023 != null) {
			setXCG0023(XCG0023);
		}

		String XCG1023 = (String)attributes.get("XCG1023");

		if (XCG1023 != null) {
			setXCG1023(XCG1023);
		}

		String XCG1123 = (String)attributes.get("XCG1123");

		if (XCG1123 != null) {
			setXCG1123(XCG1123);
		}

		String XCG0024 = (String)attributes.get("XCG0024");

		if (XCG0024 != null) {
			setXCG0024(XCG0024);
		}

		String XCG1024 = (String)attributes.get("XCG1024");

		if (XCG1024 != null) {
			setXCG1024(XCG1024);
		}

		String XCG1124 = (String)attributes.get("XCG1124");

		if (XCG1124 != null) {
			setXCG1124(XCG1124);
		}

		String XCG0025 = (String)attributes.get("XCG0025");

		if (XCG0025 != null) {
			setXCG0025(XCG0025);
		}

		String XCG1025 = (String)attributes.get("XCG1025");

		if (XCG1025 != null) {
			setXCG1025(XCG1025);
		}

		String XCG1125 = (String)attributes.get("XCG1125");

		if (XCG1125 != null) {
			setXCG1125(XCG1125);
		}

		String XCG0026 = (String)attributes.get("XCG0026");

		if (XCG0026 != null) {
			setXCG0026(XCG0026);
		}

		String XCG1026 = (String)attributes.get("XCG1026");

		if (XCG1026 != null) {
			setXCG1026(XCG1026);
		}

		String XCG1126 = (String)attributes.get("XCG1126");

		if (XCG1126 != null) {
			setXCG1126(XCG1126);
		}

		String XCG0027 = (String)attributes.get("XCG0027");

		if (XCG0027 != null) {
			setXCG0027(XCG0027);
		}

		String XCG1027 = (String)attributes.get("XCG1027");

		if (XCG1027 != null) {
			setXCG1027(XCG1027);
		}

		String XCG1127 = (String)attributes.get("XCG1127");

		if (XCG1127 != null) {
			setXCG1127(XCG1127);
		}

		String XCG0028 = (String)attributes.get("XCG0028");

		if (XCG0028 != null) {
			setXCG0028(XCG0028);
		}

		String XCG1028 = (String)attributes.get("XCG1028");

		if (XCG1028 != null) {
			setXCG1028(XCG1028);
		}

		String XCG1128 = (String)attributes.get("XCG1128");

		if (XCG1128 != null) {
			setXCG1128(XCG1128);
		}

		String XCG0029 = (String)attributes.get("XCG0029");

		if (XCG0029 != null) {
			setXCG0029(XCG0029);
		}

		String XCG1029 = (String)attributes.get("XCG1029");

		if (XCG1029 != null) {
			setXCG1029(XCG1029);
		}

		String XCG1129 = (String)attributes.get("XCG1129");

		if (XCG1129 != null) {
			setXCG1129(XCG1129);
		}

		String XCG0030 = (String)attributes.get("XCG0030");

		if (XCG0030 != null) {
			setXCG0030(XCG0030);
		}

		String XCG1030 = (String)attributes.get("XCG1030");

		if (XCG1030 != null) {
			setXCG1030(XCG1030);
		}

		String XCG1130 = (String)attributes.get("XCG1130");

		if (XCG1130 != null) {
			setXCG1130(XCG1130);
		}

		String XCG0031 = (String)attributes.get("XCG0031");

		if (XCG0031 != null) {
			setXCG0031(XCG0031);
		}

		String XCG1031 = (String)attributes.get("XCG1031");

		if (XCG1031 != null) {
			setXCG1031(XCG1031);
		}

		String XCG1131 = (String)attributes.get("XCG1131");

		if (XCG1131 != null) {
			setXCG1131(XCG1131);
		}

		String XCG0032 = (String)attributes.get("XCG0032");

		if (XCG0032 != null) {
			setXCG0032(XCG0032);
		}

		String XCG1032 = (String)attributes.get("XCG1032");

		if (XCG1032 != null) {
			setXCG1032(XCG1032);
		}

		String XCG1132 = (String)attributes.get("XCG1132");

		if (XCG1132 != null) {
			setXCG1132(XCG1132);
		}

		String XCG0033 = (String)attributes.get("XCG0033");

		if (XCG0033 != null) {
			setXCG0033(XCG0033);
		}

		String XCG1033 = (String)attributes.get("XCG1033");

		if (XCG1033 != null) {
			setXCG1033(XCG1033);
		}

		String XCG1133 = (String)attributes.get("XCG1133");

		if (XCG1133 != null) {
			setXCG1133(XCG1133);
		}

		String XCG0034 = (String)attributes.get("XCG0034");

		if (XCG0034 != null) {
			setXCG0034(XCG0034);
		}

		String XCG1034 = (String)attributes.get("XCG1034");

		if (XCG1034 != null) {
			setXCG1034(XCG1034);
		}

		String XCG1134 = (String)attributes.get("XCG1134");

		if (XCG1134 != null) {
			setXCG1134(XCG1134);
		}

		String XCG0035 = (String)attributes.get("XCG0035");

		if (XCG0035 != null) {
			setXCG0035(XCG0035);
		}

		String XCG1035 = (String)attributes.get("XCG1035");

		if (XCG1035 != null) {
			setXCG1035(XCG1035);
		}

		String XCG1135 = (String)attributes.get("XCG1135");

		if (XCG1135 != null) {
			setXCG1135(XCG1135);
		}

		String XCG0036 = (String)attributes.get("XCG0036");

		if (XCG0036 != null) {
			setXCG0036(XCG0036);
		}

		String XCG1036 = (String)attributes.get("XCG1036");

		if (XCG1036 != null) {
			setXCG1036(XCG1036);
		}

		String XCG1136 = (String)attributes.get("XCG1136");

		if (XCG1136 != null) {
			setXCG1136(XCG1136);
		}

		String XCG0037 = (String)attributes.get("XCG0037");

		if (XCG0037 != null) {
			setXCG0037(XCG0037);
		}

		String XCG1037 = (String)attributes.get("XCG1037");

		if (XCG1037 != null) {
			setXCG1037(XCG1037);
		}

		String XCG1137 = (String)attributes.get("XCG1137");

		if (XCG1137 != null) {
			setXCG1137(XCG1137);
		}

		String XCG0038 = (String)attributes.get("XCG0038");

		if (XCG0038 != null) {
			setXCG0038(XCG0038);
		}

		String XCG1038 = (String)attributes.get("XCG1038");

		if (XCG1038 != null) {
			setXCG1038(XCG1038);
		}

		String XCG1138 = (String)attributes.get("XCG1138");

		if (XCG1138 != null) {
			setXCG1138(XCG1138);
		}

		String XCG0039 = (String)attributes.get("XCG0039");

		if (XCG0039 != null) {
			setXCG0039(XCG0039);
		}

		String XCG1039 = (String)attributes.get("XCG1039");

		if (XCG1039 != null) {
			setXCG1039(XCG1039);
		}

		String XCG1139 = (String)attributes.get("XCG1139");

		if (XCG1139 != null) {
			setXCG1139(XCG1139);
		}

		String XCG0040 = (String)attributes.get("XCG0040");

		if (XCG0040 != null) {
			setXCG0040(XCG0040);
		}

		String XCG1040 = (String)attributes.get("XCG1040");

		if (XCG1040 != null) {
			setXCG1040(XCG1040);
		}

		String XCG1140 = (String)attributes.get("XCG1140");

		if (XCG1140 != null) {
			setXCG1140(XCG1140);
		}

		String XCG0041 = (String)attributes.get("XCG0041");

		if (XCG0041 != null) {
			setXCG0041(XCG0041);
		}

		String XCG1041 = (String)attributes.get("XCG1041");

		if (XCG1041 != null) {
			setXCG1041(XCG1041);
		}

		String XCG1141 = (String)attributes.get("XCG1141");

		if (XCG1141 != null) {
			setXCG1141(XCG1141);
		}

		String XCG0042 = (String)attributes.get("XCG0042");

		if (XCG0042 != null) {
			setXCG0042(XCG0042);
		}

		String XCG1042 = (String)attributes.get("XCG1042");

		if (XCG1042 != null) {
			setXCG1042(XCG1042);
		}

		String XCG1142 = (String)attributes.get("XCG1142");

		if (XCG1142 != null) {
			setXCG1142(XCG1142);
		}

		String XCG0043 = (String)attributes.get("XCG0043");

		if (XCG0043 != null) {
			setXCG0043(XCG0043);
		}

		String XCG1043 = (String)attributes.get("XCG1043");

		if (XCG1043 != null) {
			setXCG1043(XCG1043);
		}

		String XCG1143 = (String)attributes.get("XCG1143");

		if (XCG1143 != null) {
			setXCG1143(XCG1143);
		}

		String XCG0044 = (String)attributes.get("XCG0044");

		if (XCG0044 != null) {
			setXCG0044(XCG0044);
		}

		String XCG1044 = (String)attributes.get("XCG1044");

		if (XCG1044 != null) {
			setXCG1044(XCG1044);
		}

		String XCG1144 = (String)attributes.get("XCG1144");

		if (XCG1144 != null) {
			setXCG1144(XCG1144);
		}

		String XCG0045 = (String)attributes.get("XCG0045");

		if (XCG0045 != null) {
			setXCG0045(XCG0045);
		}

		String XCG0046 = (String)attributes.get("XCG0046");

		if (XCG0046 != null) {
			setXCG0046(XCG0046);
		}

		String XCG1047 = (String)attributes.get("XCG1047");

		if (XCG1047 != null) {
			setXCG1047(XCG1047);
		}

		String XCG0047 = (String)attributes.get("XCG0047");

		if (XCG0047 != null) {
			setXCG0047(XCG0047);
		}

		String XCG0048 = (String)attributes.get("XCG0048");

		if (XCG0048 != null) {
			setXCG0048(XCG0048);
		}

		String XCG0049 = (String)attributes.get("XCG0049");

		if (XCG0049 != null) {
			setXCG0049(XCG0049);
		}

		String XCG0050 = (String)attributes.get("XCG0050");

		if (XCG0050 != null) {
			setXCG0050(XCG0050);
		}

		String XCG0051 = (String)attributes.get("XCG0051");

		if (XCG0051 != null) {
			setXCG0051(XCG0051);
		}

		String XCG0052 = (String)attributes.get("XCG0052");

		if (XCG0052 != null) {
			setXCG0052(XCG0052);
		}

		String XCG0053 = (String)attributes.get("XCG0053");

		if (XCG0053 != null) {
			setXCG0053(XCG0053);
		}

		String XCG0054 = (String)attributes.get("XCG0054");

		if (XCG0054 != null) {
			setXCG0054(XCG0054);
		}

		String XCG1054 = (String)attributes.get("XCG1054");

		if (XCG1054 != null) {
			setXCG1054(XCG1054);
		}

		String XCG1154 = (String)attributes.get("XCG1154");

		if (XCG1154 != null) {
			setXCG1154(XCG1154);
		}

		String XCG1254 = (String)attributes.get("XCG1254");

		if (XCG1254 != null) {
			setXCG1254(XCG1254);
		}

		String XCG1354 = (String)attributes.get("XCG1354");

		if (XCG1354 != null) {
			setXCG1354(XCG1354);
		}

		String XCG1454 = (String)attributes.get("XCG1454");

		if (XCG1454 != null) {
			setXCG1454(XCG1454);
		}

		String XCG1554 = (String)attributes.get("XCG1554");

		if (XCG1554 != null) {
			setXCG1554(XCG1554);
		}

		String XCG1654 = (String)attributes.get("XCG1654");

		if (XCG1654 != null) {
			setXCG1654(XCG1654);
		}

		String XCG1754 = (String)attributes.get("XCG1754");

		if (XCG1754 != null) {
			setXCG1754(XCG1754);
		}

		String XCG0055 = (String)attributes.get("XCG0055");

		if (XCG0055 != null) {
			setXCG0055(XCG0055);
		}

		String XCG0056 = (String)attributes.get("XCG0056");

		if (XCG0056 != null) {
			setXCG0056(XCG0056);
		}

		String XCG0057 = (String)attributes.get("XCG0057");

		if (XCG0057 != null) {
			setXCG0057(XCG0057);
		}

		String XCG0058 = (String)attributes.get("XCG0058");

		if (XCG0058 != null) {
			setXCG0058(XCG0058);
		}

		String XCG0059 = (String)attributes.get("XCG0059");

		if (XCG0059 != null) {
			setXCG0059(XCG0059);
		}

		String XCG1059 = (String)attributes.get("XCG1059");

		if (XCG1059 != null) {
			setXCG1059(XCG1059);
		}

		String XCG0060 = (String)attributes.get("XCG0060");

		if (XCG0060 != null) {
			setXCG0060(XCG0060);
		}

		String XCG0061 = (String)attributes.get("XCG0061");

		if (XCG0061 != null) {
			setXCG0061(XCG0061);
		}

		String XCG0062 = (String)attributes.get("XCG0062");

		if (XCG0062 != null) {
			setXCG0062(XCG0062);
		}

		String XCG0063 = (String)attributes.get("XCG0063");

		if (XCG0063 != null) {
			setXCG0063(XCG0063);
		}

		String XCG0064 = (String)attributes.get("XCG0064");

		if (XCG0064 != null) {
			setXCG0064(XCG0064);
		}

		String XCG0065 = (String)attributes.get("XCG0065");

		if (XCG0065 != null) {
			setXCG0065(XCG0065);
		}

		String XCG0066 = (String)attributes.get("XCG0066");

		if (XCG0066 != null) {
			setXCG0066(XCG0066);
		}

		String XCG1066 = (String)attributes.get("XCG1066");

		if (XCG1066 != null) {
			setXCG1066(XCG1066);
		}

		String XCG0067 = (String)attributes.get("XCG0067");

		if (XCG0067 != null) {
			setXCG0067(XCG0067);
		}

		String XCG0068 = (String)attributes.get("XCG0068");

		if (XCG0068 != null) {
			setXCG0068(XCG0068);
		}

		String XCG0069 = (String)attributes.get("XCG0069");

		if (XCG0069 != null) {
			setXCG0069(XCG0069);
		}

		String XCG0070 = (String)attributes.get("XCG0070");

		if (XCG0070 != null) {
			setXCG0070(XCG0070);
		}

		String XCG0071 = (String)attributes.get("XCG0071");

		if (XCG0071 != null) {
			setXCG0071(XCG0071);
		}

		String XCG0072 = (String)attributes.get("XCG0072");

		if (XCG0072 != null) {
			setXCG0072(XCG0072);
		}

		String XCG1072 = (String)attributes.get("XCG1072");

		if (XCG1072 != null) {
			setXCG1072(XCG1072);
		}

		String XCG0073 = (String)attributes.get("XCG0073");

		if (XCG0073 != null) {
			setXCG0073(XCG0073);
		}

		String XCG0074 = (String)attributes.get("XCG0074");

		if (XCG0074 != null) {
			setXCG0074(XCG0074);
		}

		String XCG0075 = (String)attributes.get("XCG0075");

		if (XCG0075 != null) {
			setXCG0075(XCG0075);
		}

		String XCG0076 = (String)attributes.get("XCG0076");

		if (XCG0076 != null) {
			setXCG0076(XCG0076);
		}

		String XCG0077 = (String)attributes.get("XCG0077");

		if (XCG0077 != null) {
			setXCG0077(XCG0077);
		}

		String XCG1077 = (String)attributes.get("XCG1077");

		if (XCG1077 != null) {
			setXCG1077(XCG1077);
		}

		String XCG0078 = (String)attributes.get("XCG0078");

		if (XCG0078 != null) {
			setXCG0078(XCG0078);
		}

		String XCG1078 = (String)attributes.get("XCG1078");

		if (XCG1078 != null) {
			setXCG1078(XCG1078);
		}

		String XCG0079 = (String)attributes.get("XCG0079");

		if (XCG0079 != null) {
			setXCG0079(XCG0079);
		}

		String XCG0080 = (String)attributes.get("XCG0080");

		if (XCG0080 != null) {
			setXCG0080(XCG0080);
		}

		String XCG1080 = (String)attributes.get("XCG1080");

		if (XCG1080 != null) {
			setXCG1080(XCG1080);
		}

		String XCG0081 = (String)attributes.get("XCG0081");

		if (XCG0081 != null) {
			setXCG0081(XCG0081);
		}

		String XCG0082 = (String)attributes.get("XCG0082");

		if (XCG0082 != null) {
			setXCG0082(XCG0082);
		}

		String XCG0083 = (String)attributes.get("XCG0083");

		if (XCG0083 != null) {
			setXCG0083(XCG0083);
		}

		String XCG0084 = (String)attributes.get("XCG0084");

		if (XCG0084 != null) {
			setXCG0084(XCG0084);
		}

		String XCG0085 = (String)attributes.get("XCG0085");

		if (XCG0085 != null) {
			setXCG0085(XCG0085);
		}

		String XCG1085 = (String)attributes.get("XCG1085");

		if (XCG1085 != null) {
			setXCG1085(XCG1085);
		}

		String XCG0086 = (String)attributes.get("XCG0086");

		if (XCG0086 != null) {
			setXCG0086(XCG0086);
		}

		String XCG1086 = (String)attributes.get("XCG1086");

		if (XCG1086 != null) {
			setXCG1086(XCG1086);
		}

		String XCG0087 = (String)attributes.get("XCG0087");

		if (XCG0087 != null) {
			setXCG0087(XCG0087);
		}

		String XCG0088 = (String)attributes.get("XCG0088");

		if (XCG0088 != null) {
			setXCG0088(XCG0088);
		}

		String XCG1088 = (String)attributes.get("XCG1088");

		if (XCG1088 != null) {
			setXCG1088(XCG1088);
		}

		String XCG0089 = (String)attributes.get("XCG0089");

		if (XCG0089 != null) {
			setXCG0089(XCG0089);
		}

		String XCG0090 = (String)attributes.get("XCG0090");

		if (XCG0090 != null) {
			setXCG0090(XCG0090);
		}

		String XCG0091 = (String)attributes.get("XCG0091");

		if (XCG0091 != null) {
			setXCG0091(XCG0091);
		}

		String XCG0092 = (String)attributes.get("XCG0092");

		if (XCG0092 != null) {
			setXCG0092(XCG0092);
		}

		String XCG0093 = (String)attributes.get("XCG0093");

		if (XCG0093 != null) {
			setXCG0093(XCG0093);
		}

		String XCG0094 = (String)attributes.get("XCG0094");

		if (XCG0094 != null) {
			setXCG0094(XCG0094);
		}

		String XCG0095 = (String)attributes.get("XCG0095");

		if (XCG0095 != null) {
			setXCG0095(XCG0095);
		}

		String XCG0096 = (String)attributes.get("XCG0096");

		if (XCG0096 != null) {
			setXCG0096(XCG0096);
		}

		String XCG0097 = (String)attributes.get("XCG0097");

		if (XCG0097 != null) {
			setXCG0097(XCG0097);
		}

		String XCG1097 = (String)attributes.get("XCG1097");

		if (XCG1097 != null) {
			setXCG1097(XCG1097);
		}

		String XCG0098 = (String)attributes.get("XCG0098");

		if (XCG0098 != null) {
			setXCG0098(XCG0098);
		}

		String XCG0099 = (String)attributes.get("XCG0099");

		if (XCG0099 != null) {
			setXCG0099(XCG0099);
		}

		String XCG0100 = (String)attributes.get("XCG0100");

		if (XCG0100 != null) {
			setXCG0100(XCG0100);
		}

		String XCG0101 = (String)attributes.get("XCG0101");

		if (XCG0101 != null) {
			setXCG0101(XCG0101);
		}

		String XCG0102 = (String)attributes.get("XCG0102");

		if (XCG0102 != null) {
			setXCG0102(XCG0102);
		}

		String XCG0103 = (String)attributes.get("XCG0103");

		if (XCG0103 != null) {
			setXCG0103(XCG0103);
		}

		String XCG0104 = (String)attributes.get("XCG0104");

		if (XCG0104 != null) {
			setXCG0104(XCG0104);
		}

		String XCG0105 = (String)attributes.get("XCG0105");

		if (XCG0105 != null) {
			setXCG0105(XCG0105);
		}

		String XCG0106 = (String)attributes.get("XCG0106");

		if (XCG0106 != null) {
			setXCG0106(XCG0106);
		}

		String XCG0107 = (String)attributes.get("XCG0107");

		if (XCG0107 != null) {
			setXCG0107(XCG0107);
		}

		String XCG0108 = (String)attributes.get("XCG0108");

		if (XCG0108 != null) {
			setXCG0108(XCG0108);
		}

		String XCG0109 = (String)attributes.get("XCG0109");

		if (XCG0109 != null) {
			setXCG0109(XCG0109);
		}

		String XCG0110 = (String)attributes.get("XCG0110");

		if (XCG0110 != null) {
			setXCG0110(XCG0110);
		}

		String XCG0111 = (String)attributes.get("XCG0111");

		if (XCG0111 != null) {
			setXCG0111(XCG0111);
		}

		String XCG0112 = (String)attributes.get("XCG0112");

		if (XCG0112 != null) {
			setXCG0112(XCG0112);
		}

		String XCG0113 = (String)attributes.get("XCG0113");

		if (XCG0113 != null) {
			setXCG0113(XCG0113);
		}

		String XCG0114 = (String)attributes.get("XCG0114");

		if (XCG0114 != null) {
			setXCG0114(XCG0114);
		}

		String XCG0115 = (String)attributes.get("XCG0115");

		if (XCG0115 != null) {
			setXCG0115(XCG0115);
		}

		String XCG0116 = (String)attributes.get("XCG0116");

		if (XCG0116 != null) {
			setXCG0116(XCG0116);
		}

		String XCG0117 = (String)attributes.get("XCG0117");

		if (XCG0117 != null) {
			setXCG0117(XCG0117);
		}

		String XCG0118 = (String)attributes.get("XCG0118");

		if (XCG0118 != null) {
			setXCG0118(XCG0118);
		}

		String XCG0119 = (String)attributes.get("XCG0119");

		if (XCG0119 != null) {
			setXCG0119(XCG0119);
		}

		String XCG0120 = (String)attributes.get("XCG0120");

		if (XCG0120 != null) {
			setXCG0120(XCG0120);
		}

		String XCG0121 = (String)attributes.get("XCG0121");

		if (XCG0121 != null) {
			setXCG0121(XCG0121);
		}

		String XCG0122 = (String)attributes.get("XCG0122");

		if (XCG0122 != null) {
			setXCG0122(XCG0122);
		}

		String XCG0123 = (String)attributes.get("XCG0123");

		if (XCG0123 != null) {
			setXCG0123(XCG0123);
		}

		String XCG0124 = (String)attributes.get("XCG0124");

		if (XCG0124 != null) {
			setXCG0124(XCG0124);
		}

		String XCG0125 = (String)attributes.get("XCG0125");

		if (XCG0125 != null) {
			setXCG0125(XCG0125);
		}

		String XCG0126 = (String)attributes.get("XCG0126");

		if (XCG0126 != null) {
			setXCG0126(XCG0126);
		}

		String XCG0127 = (String)attributes.get("XCG0127");

		if (XCG0127 != null) {
			setXCG0127(XCG0127);
		}

		String XCG0128 = (String)attributes.get("XCG0128");

		if (XCG0128 != null) {
			setXCG0128(XCG0128);
		}

		String XCG0238 = (String)attributes.get("XCG0238");

		if (XCG0238 != null) {
			setXCG0238(XCG0238);
		}

		String XCG0239 = (String)attributes.get("XCG0239");

		if (XCG0239 != null) {
			setXCG0239(XCG0239);
		}

		String XCG0240 = (String)attributes.get("XCG0240");

		if (XCG0240 != null) {
			setXCG0240(XCG0240);
		}

		String XCG0241 = (String)attributes.get("XCG0241");

		if (XCG0241 != null) {
			setXCG0241(XCG0241);
		}
	}

	/**
	* Returns the primary key of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the primary key of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public long getPrimaryKey() {
		return _thongsochungchixecogioi.getPrimaryKey();
	}

	/**
	* Sets the primary key of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param primaryKey the primary key of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_thongsochungchixecogioi.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the ID of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public long getId() {
		return _thongsochungchixecogioi.getId();
	}

	/**
	* Sets the ID of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param id the ID of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setId(long id) {
		_thongsochungchixecogioi.setId(id);
	}

	/**
	* Returns the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public long getHoSoThuTucId() {
		return _thongsochungchixecogioi.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_thongsochungchixecogioi.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the certificate record ID of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the certificate record ID of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public long getCertificateRecordId() {
		return _thongsochungchixecogioi.getCertificateRecordId();
	}

	/**
	* Sets the certificate record ID of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param certificateRecordId the certificate record ID of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setCertificateRecordId(long certificateRecordId) {
		_thongsochungchixecogioi.setCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns the vehicle group ID of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the vehicle group ID of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public long getVehicleGroupId() {
		return _thongsochungchixecogioi.getVehicleGroupId();
	}

	/**
	* Sets the vehicle group ID of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param vehicleGroupId the vehicle group ID of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setVehicleGroupId(long vehicleGroupId) {
		_thongsochungchixecogioi.setVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns the synch date of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the synch date of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.util.Date getSynchDate() {
		return _thongsochungchixecogioi.getSynchDate();
	}

	/**
	* Sets the synch date of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param SynchDate the synch date of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setSynchDate(java.util.Date SynchDate) {
		_thongsochungchixecogioi.setSynchDate(SynchDate);
	}

	/**
	* Returns the x c g0009 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0009 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0009() {
		return _thongsochungchixecogioi.getXCG0009();
	}

	/**
	* Sets the x c g0009 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0009 the x c g0009 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0009(java.lang.String XCG0009) {
		_thongsochungchixecogioi.setXCG0009(XCG0009);
	}

	/**
	* Returns the x c g0010 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0010 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0010() {
		return _thongsochungchixecogioi.getXCG0010();
	}

	/**
	* Sets the x c g0010 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0010 the x c g0010 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0010(java.lang.String XCG0010) {
		_thongsochungchixecogioi.setXCG0010(XCG0010);
	}

	/**
	* Returns the x c g0011 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0011 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0011() {
		return _thongsochungchixecogioi.getXCG0011();
	}

	/**
	* Sets the x c g0011 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0011 the x c g0011 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0011(java.lang.String XCG0011) {
		_thongsochungchixecogioi.setXCG0011(XCG0011);
	}

	/**
	* Returns the x c g0012 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0012 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0012() {
		return _thongsochungchixecogioi.getXCG0012();
	}

	/**
	* Sets the x c g0012 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0012 the x c g0012 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0012(java.lang.String XCG0012) {
		_thongsochungchixecogioi.setXCG0012(XCG0012);
	}

	/**
	* Returns the x c g0013 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0013 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0013() {
		return _thongsochungchixecogioi.getXCG0013();
	}

	/**
	* Sets the x c g0013 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0013 the x c g0013 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0013(java.lang.String XCG0013) {
		_thongsochungchixecogioi.setXCG0013(XCG0013);
	}

	/**
	* Returns the x c g0014 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0014 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0014() {
		return _thongsochungchixecogioi.getXCG0014();
	}

	/**
	* Sets the x c g0014 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0014 the x c g0014 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0014(java.lang.String XCG0014) {
		_thongsochungchixecogioi.setXCG0014(XCG0014);
	}

	/**
	* Returns the x c g0015 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0015 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0015() {
		return _thongsochungchixecogioi.getXCG0015();
	}

	/**
	* Sets the x c g0015 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0015 the x c g0015 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0015(java.lang.String XCG0015) {
		_thongsochungchixecogioi.setXCG0015(XCG0015);
	}

	/**
	* Returns the x c g0016 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0016 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0016() {
		return _thongsochungchixecogioi.getXCG0016();
	}

	/**
	* Sets the x c g0016 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0016 the x c g0016 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0016(java.lang.String XCG0016) {
		_thongsochungchixecogioi.setXCG0016(XCG0016);
	}

	/**
	* Returns the x c g0017 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0017 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0017() {
		return _thongsochungchixecogioi.getXCG0017();
	}

	/**
	* Sets the x c g0017 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0017 the x c g0017 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0017(java.lang.String XCG0017) {
		_thongsochungchixecogioi.setXCG0017(XCG0017);
	}

	/**
	* Returns the x c g0018 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0018 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0018() {
		return _thongsochungchixecogioi.getXCG0018();
	}

	/**
	* Sets the x c g0018 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0018 the x c g0018 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0018(java.lang.String XCG0018) {
		_thongsochungchixecogioi.setXCG0018(XCG0018);
	}

	/**
	* Returns the x c g0019 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0019 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0019() {
		return _thongsochungchixecogioi.getXCG0019();
	}

	/**
	* Sets the x c g0019 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0019 the x c g0019 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0019(java.lang.String XCG0019) {
		_thongsochungchixecogioi.setXCG0019(XCG0019);
	}

	/**
	* Returns the x c g0020 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0020 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0020() {
		return _thongsochungchixecogioi.getXCG0020();
	}

	/**
	* Sets the x c g0020 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0020 the x c g0020 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0020(java.lang.String XCG0020) {
		_thongsochungchixecogioi.setXCG0020(XCG0020);
	}

	/**
	* Returns the x c g0021 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0021 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0021() {
		return _thongsochungchixecogioi.getXCG0021();
	}

	/**
	* Sets the x c g0021 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0021 the x c g0021 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0021(java.lang.String XCG0021) {
		_thongsochungchixecogioi.setXCG0021(XCG0021);
	}

	/**
	* Returns the x c g1021 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1021 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1021() {
		return _thongsochungchixecogioi.getXCG1021();
	}

	/**
	* Sets the x c g1021 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1021 the x c g1021 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1021(java.lang.String XCG1021) {
		_thongsochungchixecogioi.setXCG1021(XCG1021);
	}

	/**
	* Returns the x c g1121 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1121 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1121() {
		return _thongsochungchixecogioi.getXCG1121();
	}

	/**
	* Sets the x c g1121 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1121 the x c g1121 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1121(java.lang.String XCG1121) {
		_thongsochungchixecogioi.setXCG1121(XCG1121);
	}

	/**
	* Returns the x c g0022 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0022 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0022() {
		return _thongsochungchixecogioi.getXCG0022();
	}

	/**
	* Sets the x c g0022 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0022 the x c g0022 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0022(java.lang.String XCG0022) {
		_thongsochungchixecogioi.setXCG0022(XCG0022);
	}

	/**
	* Returns the x c g1022 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1022 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1022() {
		return _thongsochungchixecogioi.getXCG1022();
	}

	/**
	* Sets the x c g1022 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1022 the x c g1022 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1022(java.lang.String XCG1022) {
		_thongsochungchixecogioi.setXCG1022(XCG1022);
	}

	/**
	* Returns the x c g1122 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1122 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1122() {
		return _thongsochungchixecogioi.getXCG1122();
	}

	/**
	* Sets the x c g1122 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1122 the x c g1122 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1122(java.lang.String XCG1122) {
		_thongsochungchixecogioi.setXCG1122(XCG1122);
	}

	/**
	* Returns the x c g0023 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0023 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0023() {
		return _thongsochungchixecogioi.getXCG0023();
	}

	/**
	* Sets the x c g0023 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0023 the x c g0023 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0023(java.lang.String XCG0023) {
		_thongsochungchixecogioi.setXCG0023(XCG0023);
	}

	/**
	* Returns the x c g1023 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1023 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1023() {
		return _thongsochungchixecogioi.getXCG1023();
	}

	/**
	* Sets the x c g1023 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1023 the x c g1023 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1023(java.lang.String XCG1023) {
		_thongsochungchixecogioi.setXCG1023(XCG1023);
	}

	/**
	* Returns the x c g1123 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1123 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1123() {
		return _thongsochungchixecogioi.getXCG1123();
	}

	/**
	* Sets the x c g1123 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1123 the x c g1123 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1123(java.lang.String XCG1123) {
		_thongsochungchixecogioi.setXCG1123(XCG1123);
	}

	/**
	* Returns the x c g0024 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0024 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0024() {
		return _thongsochungchixecogioi.getXCG0024();
	}

	/**
	* Sets the x c g0024 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0024 the x c g0024 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0024(java.lang.String XCG0024) {
		_thongsochungchixecogioi.setXCG0024(XCG0024);
	}

	/**
	* Returns the x c g1024 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1024 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1024() {
		return _thongsochungchixecogioi.getXCG1024();
	}

	/**
	* Sets the x c g1024 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1024 the x c g1024 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1024(java.lang.String XCG1024) {
		_thongsochungchixecogioi.setXCG1024(XCG1024);
	}

	/**
	* Returns the x c g1124 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1124 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1124() {
		return _thongsochungchixecogioi.getXCG1124();
	}

	/**
	* Sets the x c g1124 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1124 the x c g1124 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1124(java.lang.String XCG1124) {
		_thongsochungchixecogioi.setXCG1124(XCG1124);
	}

	/**
	* Returns the x c g0025 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0025 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0025() {
		return _thongsochungchixecogioi.getXCG0025();
	}

	/**
	* Sets the x c g0025 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0025 the x c g0025 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0025(java.lang.String XCG0025) {
		_thongsochungchixecogioi.setXCG0025(XCG0025);
	}

	/**
	* Returns the x c g1025 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1025 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1025() {
		return _thongsochungchixecogioi.getXCG1025();
	}

	/**
	* Sets the x c g1025 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1025 the x c g1025 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1025(java.lang.String XCG1025) {
		_thongsochungchixecogioi.setXCG1025(XCG1025);
	}

	/**
	* Returns the x c g1125 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1125 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1125() {
		return _thongsochungchixecogioi.getXCG1125();
	}

	/**
	* Sets the x c g1125 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1125 the x c g1125 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1125(java.lang.String XCG1125) {
		_thongsochungchixecogioi.setXCG1125(XCG1125);
	}

	/**
	* Returns the x c g0026 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0026 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0026() {
		return _thongsochungchixecogioi.getXCG0026();
	}

	/**
	* Sets the x c g0026 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0026 the x c g0026 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0026(java.lang.String XCG0026) {
		_thongsochungchixecogioi.setXCG0026(XCG0026);
	}

	/**
	* Returns the x c g1026 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1026 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1026() {
		return _thongsochungchixecogioi.getXCG1026();
	}

	/**
	* Sets the x c g1026 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1026 the x c g1026 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1026(java.lang.String XCG1026) {
		_thongsochungchixecogioi.setXCG1026(XCG1026);
	}

	/**
	* Returns the x c g1126 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1126 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1126() {
		return _thongsochungchixecogioi.getXCG1126();
	}

	/**
	* Sets the x c g1126 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1126 the x c g1126 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1126(java.lang.String XCG1126) {
		_thongsochungchixecogioi.setXCG1126(XCG1126);
	}

	/**
	* Returns the x c g0027 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0027 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0027() {
		return _thongsochungchixecogioi.getXCG0027();
	}

	/**
	* Sets the x c g0027 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0027 the x c g0027 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0027(java.lang.String XCG0027) {
		_thongsochungchixecogioi.setXCG0027(XCG0027);
	}

	/**
	* Returns the x c g1027 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1027 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1027() {
		return _thongsochungchixecogioi.getXCG1027();
	}

	/**
	* Sets the x c g1027 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1027 the x c g1027 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1027(java.lang.String XCG1027) {
		_thongsochungchixecogioi.setXCG1027(XCG1027);
	}

	/**
	* Returns the x c g1127 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1127 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1127() {
		return _thongsochungchixecogioi.getXCG1127();
	}

	/**
	* Sets the x c g1127 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1127 the x c g1127 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1127(java.lang.String XCG1127) {
		_thongsochungchixecogioi.setXCG1127(XCG1127);
	}

	/**
	* Returns the x c g0028 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0028 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0028() {
		return _thongsochungchixecogioi.getXCG0028();
	}

	/**
	* Sets the x c g0028 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0028 the x c g0028 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0028(java.lang.String XCG0028) {
		_thongsochungchixecogioi.setXCG0028(XCG0028);
	}

	/**
	* Returns the x c g1028 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1028 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1028() {
		return _thongsochungchixecogioi.getXCG1028();
	}

	/**
	* Sets the x c g1028 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1028 the x c g1028 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1028(java.lang.String XCG1028) {
		_thongsochungchixecogioi.setXCG1028(XCG1028);
	}

	/**
	* Returns the x c g1128 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1128 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1128() {
		return _thongsochungchixecogioi.getXCG1128();
	}

	/**
	* Sets the x c g1128 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1128 the x c g1128 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1128(java.lang.String XCG1128) {
		_thongsochungchixecogioi.setXCG1128(XCG1128);
	}

	/**
	* Returns the x c g0029 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0029 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0029() {
		return _thongsochungchixecogioi.getXCG0029();
	}

	/**
	* Sets the x c g0029 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0029 the x c g0029 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0029(java.lang.String XCG0029) {
		_thongsochungchixecogioi.setXCG0029(XCG0029);
	}

	/**
	* Returns the x c g1029 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1029 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1029() {
		return _thongsochungchixecogioi.getXCG1029();
	}

	/**
	* Sets the x c g1029 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1029 the x c g1029 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1029(java.lang.String XCG1029) {
		_thongsochungchixecogioi.setXCG1029(XCG1029);
	}

	/**
	* Returns the x c g1129 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1129 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1129() {
		return _thongsochungchixecogioi.getXCG1129();
	}

	/**
	* Sets the x c g1129 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1129 the x c g1129 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1129(java.lang.String XCG1129) {
		_thongsochungchixecogioi.setXCG1129(XCG1129);
	}

	/**
	* Returns the x c g0030 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0030 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0030() {
		return _thongsochungchixecogioi.getXCG0030();
	}

	/**
	* Sets the x c g0030 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0030 the x c g0030 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0030(java.lang.String XCG0030) {
		_thongsochungchixecogioi.setXCG0030(XCG0030);
	}

	/**
	* Returns the x c g1030 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1030 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1030() {
		return _thongsochungchixecogioi.getXCG1030();
	}

	/**
	* Sets the x c g1030 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1030 the x c g1030 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1030(java.lang.String XCG1030) {
		_thongsochungchixecogioi.setXCG1030(XCG1030);
	}

	/**
	* Returns the x c g1130 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1130 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1130() {
		return _thongsochungchixecogioi.getXCG1130();
	}

	/**
	* Sets the x c g1130 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1130 the x c g1130 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1130(java.lang.String XCG1130) {
		_thongsochungchixecogioi.setXCG1130(XCG1130);
	}

	/**
	* Returns the x c g0031 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0031 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0031() {
		return _thongsochungchixecogioi.getXCG0031();
	}

	/**
	* Sets the x c g0031 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0031 the x c g0031 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0031(java.lang.String XCG0031) {
		_thongsochungchixecogioi.setXCG0031(XCG0031);
	}

	/**
	* Returns the x c g1031 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1031 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1031() {
		return _thongsochungchixecogioi.getXCG1031();
	}

	/**
	* Sets the x c g1031 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1031 the x c g1031 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1031(java.lang.String XCG1031) {
		_thongsochungchixecogioi.setXCG1031(XCG1031);
	}

	/**
	* Returns the x c g1131 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1131 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1131() {
		return _thongsochungchixecogioi.getXCG1131();
	}

	/**
	* Sets the x c g1131 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1131 the x c g1131 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1131(java.lang.String XCG1131) {
		_thongsochungchixecogioi.setXCG1131(XCG1131);
	}

	/**
	* Returns the x c g0032 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0032 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0032() {
		return _thongsochungchixecogioi.getXCG0032();
	}

	/**
	* Sets the x c g0032 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0032 the x c g0032 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0032(java.lang.String XCG0032) {
		_thongsochungchixecogioi.setXCG0032(XCG0032);
	}

	/**
	* Returns the x c g1032 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1032 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1032() {
		return _thongsochungchixecogioi.getXCG1032();
	}

	/**
	* Sets the x c g1032 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1032 the x c g1032 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1032(java.lang.String XCG1032) {
		_thongsochungchixecogioi.setXCG1032(XCG1032);
	}

	/**
	* Returns the x c g1132 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1132 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1132() {
		return _thongsochungchixecogioi.getXCG1132();
	}

	/**
	* Sets the x c g1132 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1132 the x c g1132 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1132(java.lang.String XCG1132) {
		_thongsochungchixecogioi.setXCG1132(XCG1132);
	}

	/**
	* Returns the x c g0033 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0033 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0033() {
		return _thongsochungchixecogioi.getXCG0033();
	}

	/**
	* Sets the x c g0033 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0033 the x c g0033 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0033(java.lang.String XCG0033) {
		_thongsochungchixecogioi.setXCG0033(XCG0033);
	}

	/**
	* Returns the x c g1033 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1033 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1033() {
		return _thongsochungchixecogioi.getXCG1033();
	}

	/**
	* Sets the x c g1033 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1033 the x c g1033 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1033(java.lang.String XCG1033) {
		_thongsochungchixecogioi.setXCG1033(XCG1033);
	}

	/**
	* Returns the x c g1133 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1133 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1133() {
		return _thongsochungchixecogioi.getXCG1133();
	}

	/**
	* Sets the x c g1133 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1133 the x c g1133 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1133(java.lang.String XCG1133) {
		_thongsochungchixecogioi.setXCG1133(XCG1133);
	}

	/**
	* Returns the x c g0034 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0034 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0034() {
		return _thongsochungchixecogioi.getXCG0034();
	}

	/**
	* Sets the x c g0034 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0034 the x c g0034 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0034(java.lang.String XCG0034) {
		_thongsochungchixecogioi.setXCG0034(XCG0034);
	}

	/**
	* Returns the x c g1034 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1034 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1034() {
		return _thongsochungchixecogioi.getXCG1034();
	}

	/**
	* Sets the x c g1034 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1034 the x c g1034 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1034(java.lang.String XCG1034) {
		_thongsochungchixecogioi.setXCG1034(XCG1034);
	}

	/**
	* Returns the x c g1134 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1134 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1134() {
		return _thongsochungchixecogioi.getXCG1134();
	}

	/**
	* Sets the x c g1134 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1134 the x c g1134 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1134(java.lang.String XCG1134) {
		_thongsochungchixecogioi.setXCG1134(XCG1134);
	}

	/**
	* Returns the x c g0035 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0035 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0035() {
		return _thongsochungchixecogioi.getXCG0035();
	}

	/**
	* Sets the x c g0035 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0035 the x c g0035 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0035(java.lang.String XCG0035) {
		_thongsochungchixecogioi.setXCG0035(XCG0035);
	}

	/**
	* Returns the x c g1035 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1035 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1035() {
		return _thongsochungchixecogioi.getXCG1035();
	}

	/**
	* Sets the x c g1035 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1035 the x c g1035 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1035(java.lang.String XCG1035) {
		_thongsochungchixecogioi.setXCG1035(XCG1035);
	}

	/**
	* Returns the x c g1135 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1135 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1135() {
		return _thongsochungchixecogioi.getXCG1135();
	}

	/**
	* Sets the x c g1135 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1135 the x c g1135 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1135(java.lang.String XCG1135) {
		_thongsochungchixecogioi.setXCG1135(XCG1135);
	}

	/**
	* Returns the x c g0036 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0036 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0036() {
		return _thongsochungchixecogioi.getXCG0036();
	}

	/**
	* Sets the x c g0036 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0036 the x c g0036 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0036(java.lang.String XCG0036) {
		_thongsochungchixecogioi.setXCG0036(XCG0036);
	}

	/**
	* Returns the x c g1036 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1036 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1036() {
		return _thongsochungchixecogioi.getXCG1036();
	}

	/**
	* Sets the x c g1036 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1036 the x c g1036 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1036(java.lang.String XCG1036) {
		_thongsochungchixecogioi.setXCG1036(XCG1036);
	}

	/**
	* Returns the x c g1136 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1136 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1136() {
		return _thongsochungchixecogioi.getXCG1136();
	}

	/**
	* Sets the x c g1136 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1136 the x c g1136 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1136(java.lang.String XCG1136) {
		_thongsochungchixecogioi.setXCG1136(XCG1136);
	}

	/**
	* Returns the x c g0037 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0037 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0037() {
		return _thongsochungchixecogioi.getXCG0037();
	}

	/**
	* Sets the x c g0037 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0037 the x c g0037 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0037(java.lang.String XCG0037) {
		_thongsochungchixecogioi.setXCG0037(XCG0037);
	}

	/**
	* Returns the x c g1037 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1037 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1037() {
		return _thongsochungchixecogioi.getXCG1037();
	}

	/**
	* Sets the x c g1037 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1037 the x c g1037 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1037(java.lang.String XCG1037) {
		_thongsochungchixecogioi.setXCG1037(XCG1037);
	}

	/**
	* Returns the x c g1137 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1137 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1137() {
		return _thongsochungchixecogioi.getXCG1137();
	}

	/**
	* Sets the x c g1137 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1137 the x c g1137 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1137(java.lang.String XCG1137) {
		_thongsochungchixecogioi.setXCG1137(XCG1137);
	}

	/**
	* Returns the x c g0038 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0038 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0038() {
		return _thongsochungchixecogioi.getXCG0038();
	}

	/**
	* Sets the x c g0038 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0038 the x c g0038 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0038(java.lang.String XCG0038) {
		_thongsochungchixecogioi.setXCG0038(XCG0038);
	}

	/**
	* Returns the x c g1038 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1038 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1038() {
		return _thongsochungchixecogioi.getXCG1038();
	}

	/**
	* Sets the x c g1038 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1038 the x c g1038 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1038(java.lang.String XCG1038) {
		_thongsochungchixecogioi.setXCG1038(XCG1038);
	}

	/**
	* Returns the x c g1138 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1138 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1138() {
		return _thongsochungchixecogioi.getXCG1138();
	}

	/**
	* Sets the x c g1138 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1138 the x c g1138 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1138(java.lang.String XCG1138) {
		_thongsochungchixecogioi.setXCG1138(XCG1138);
	}

	/**
	* Returns the x c g0039 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0039 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0039() {
		return _thongsochungchixecogioi.getXCG0039();
	}

	/**
	* Sets the x c g0039 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0039 the x c g0039 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0039(java.lang.String XCG0039) {
		_thongsochungchixecogioi.setXCG0039(XCG0039);
	}

	/**
	* Returns the x c g1039 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1039 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1039() {
		return _thongsochungchixecogioi.getXCG1039();
	}

	/**
	* Sets the x c g1039 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1039 the x c g1039 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1039(java.lang.String XCG1039) {
		_thongsochungchixecogioi.setXCG1039(XCG1039);
	}

	/**
	* Returns the x c g1139 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1139 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1139() {
		return _thongsochungchixecogioi.getXCG1139();
	}

	/**
	* Sets the x c g1139 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1139 the x c g1139 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1139(java.lang.String XCG1139) {
		_thongsochungchixecogioi.setXCG1139(XCG1139);
	}

	/**
	* Returns the x c g0040 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0040 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0040() {
		return _thongsochungchixecogioi.getXCG0040();
	}

	/**
	* Sets the x c g0040 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0040 the x c g0040 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0040(java.lang.String XCG0040) {
		_thongsochungchixecogioi.setXCG0040(XCG0040);
	}

	/**
	* Returns the x c g1040 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1040 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1040() {
		return _thongsochungchixecogioi.getXCG1040();
	}

	/**
	* Sets the x c g1040 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1040 the x c g1040 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1040(java.lang.String XCG1040) {
		_thongsochungchixecogioi.setXCG1040(XCG1040);
	}

	/**
	* Returns the x c g1140 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1140 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1140() {
		return _thongsochungchixecogioi.getXCG1140();
	}

	/**
	* Sets the x c g1140 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1140 the x c g1140 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1140(java.lang.String XCG1140) {
		_thongsochungchixecogioi.setXCG1140(XCG1140);
	}

	/**
	* Returns the x c g0041 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0041 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0041() {
		return _thongsochungchixecogioi.getXCG0041();
	}

	/**
	* Sets the x c g0041 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0041 the x c g0041 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0041(java.lang.String XCG0041) {
		_thongsochungchixecogioi.setXCG0041(XCG0041);
	}

	/**
	* Returns the x c g1041 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1041 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1041() {
		return _thongsochungchixecogioi.getXCG1041();
	}

	/**
	* Sets the x c g1041 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1041 the x c g1041 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1041(java.lang.String XCG1041) {
		_thongsochungchixecogioi.setXCG1041(XCG1041);
	}

	/**
	* Returns the x c g1141 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1141 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1141() {
		return _thongsochungchixecogioi.getXCG1141();
	}

	/**
	* Sets the x c g1141 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1141 the x c g1141 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1141(java.lang.String XCG1141) {
		_thongsochungchixecogioi.setXCG1141(XCG1141);
	}

	/**
	* Returns the x c g0042 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0042 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0042() {
		return _thongsochungchixecogioi.getXCG0042();
	}

	/**
	* Sets the x c g0042 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0042 the x c g0042 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0042(java.lang.String XCG0042) {
		_thongsochungchixecogioi.setXCG0042(XCG0042);
	}

	/**
	* Returns the x c g1042 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1042 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1042() {
		return _thongsochungchixecogioi.getXCG1042();
	}

	/**
	* Sets the x c g1042 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1042 the x c g1042 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1042(java.lang.String XCG1042) {
		_thongsochungchixecogioi.setXCG1042(XCG1042);
	}

	/**
	* Returns the x c g1142 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1142 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1142() {
		return _thongsochungchixecogioi.getXCG1142();
	}

	/**
	* Sets the x c g1142 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1142 the x c g1142 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1142(java.lang.String XCG1142) {
		_thongsochungchixecogioi.setXCG1142(XCG1142);
	}

	/**
	* Returns the x c g0043 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0043 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0043() {
		return _thongsochungchixecogioi.getXCG0043();
	}

	/**
	* Sets the x c g0043 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0043 the x c g0043 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0043(java.lang.String XCG0043) {
		_thongsochungchixecogioi.setXCG0043(XCG0043);
	}

	/**
	* Returns the x c g1043 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1043 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1043() {
		return _thongsochungchixecogioi.getXCG1043();
	}

	/**
	* Sets the x c g1043 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1043 the x c g1043 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1043(java.lang.String XCG1043) {
		_thongsochungchixecogioi.setXCG1043(XCG1043);
	}

	/**
	* Returns the x c g1143 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1143 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1143() {
		return _thongsochungchixecogioi.getXCG1143();
	}

	/**
	* Sets the x c g1143 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1143 the x c g1143 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1143(java.lang.String XCG1143) {
		_thongsochungchixecogioi.setXCG1143(XCG1143);
	}

	/**
	* Returns the x c g0044 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0044 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0044() {
		return _thongsochungchixecogioi.getXCG0044();
	}

	/**
	* Sets the x c g0044 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0044 the x c g0044 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0044(java.lang.String XCG0044) {
		_thongsochungchixecogioi.setXCG0044(XCG0044);
	}

	/**
	* Returns the x c g1044 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1044 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1044() {
		return _thongsochungchixecogioi.getXCG1044();
	}

	/**
	* Sets the x c g1044 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1044 the x c g1044 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1044(java.lang.String XCG1044) {
		_thongsochungchixecogioi.setXCG1044(XCG1044);
	}

	/**
	* Returns the x c g1144 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1144 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1144() {
		return _thongsochungchixecogioi.getXCG1144();
	}

	/**
	* Sets the x c g1144 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1144 the x c g1144 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1144(java.lang.String XCG1144) {
		_thongsochungchixecogioi.setXCG1144(XCG1144);
	}

	/**
	* Returns the x c g0045 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0045 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0045() {
		return _thongsochungchixecogioi.getXCG0045();
	}

	/**
	* Sets the x c g0045 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0045 the x c g0045 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0045(java.lang.String XCG0045) {
		_thongsochungchixecogioi.setXCG0045(XCG0045);
	}

	/**
	* Returns the x c g0046 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0046 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0046() {
		return _thongsochungchixecogioi.getXCG0046();
	}

	/**
	* Sets the x c g0046 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0046 the x c g0046 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0046(java.lang.String XCG0046) {
		_thongsochungchixecogioi.setXCG0046(XCG0046);
	}

	/**
	* Returns the x c g1047 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1047 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1047() {
		return _thongsochungchixecogioi.getXCG1047();
	}

	/**
	* Sets the x c g1047 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1047 the x c g1047 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1047(java.lang.String XCG1047) {
		_thongsochungchixecogioi.setXCG1047(XCG1047);
	}

	/**
	* Returns the x c g0047 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0047 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0047() {
		return _thongsochungchixecogioi.getXCG0047();
	}

	/**
	* Sets the x c g0047 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0047 the x c g0047 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0047(java.lang.String XCG0047) {
		_thongsochungchixecogioi.setXCG0047(XCG0047);
	}

	/**
	* Returns the x c g0048 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0048 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0048() {
		return _thongsochungchixecogioi.getXCG0048();
	}

	/**
	* Sets the x c g0048 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0048 the x c g0048 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0048(java.lang.String XCG0048) {
		_thongsochungchixecogioi.setXCG0048(XCG0048);
	}

	/**
	* Returns the x c g0049 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0049 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0049() {
		return _thongsochungchixecogioi.getXCG0049();
	}

	/**
	* Sets the x c g0049 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0049 the x c g0049 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0049(java.lang.String XCG0049) {
		_thongsochungchixecogioi.setXCG0049(XCG0049);
	}

	/**
	* Returns the x c g0050 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0050 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0050() {
		return _thongsochungchixecogioi.getXCG0050();
	}

	/**
	* Sets the x c g0050 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0050 the x c g0050 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0050(java.lang.String XCG0050) {
		_thongsochungchixecogioi.setXCG0050(XCG0050);
	}

	/**
	* Returns the x c g0051 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0051 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0051() {
		return _thongsochungchixecogioi.getXCG0051();
	}

	/**
	* Sets the x c g0051 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0051 the x c g0051 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0051(java.lang.String XCG0051) {
		_thongsochungchixecogioi.setXCG0051(XCG0051);
	}

	/**
	* Returns the x c g0052 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0052 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0052() {
		return _thongsochungchixecogioi.getXCG0052();
	}

	/**
	* Sets the x c g0052 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0052 the x c g0052 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0052(java.lang.String XCG0052) {
		_thongsochungchixecogioi.setXCG0052(XCG0052);
	}

	/**
	* Returns the x c g0053 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0053 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0053() {
		return _thongsochungchixecogioi.getXCG0053();
	}

	/**
	* Sets the x c g0053 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0053 the x c g0053 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0053(java.lang.String XCG0053) {
		_thongsochungchixecogioi.setXCG0053(XCG0053);
	}

	/**
	* Returns the x c g0054 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0054 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0054() {
		return _thongsochungchixecogioi.getXCG0054();
	}

	/**
	* Sets the x c g0054 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0054 the x c g0054 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0054(java.lang.String XCG0054) {
		_thongsochungchixecogioi.setXCG0054(XCG0054);
	}

	/**
	* Returns the x c g1054 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1054 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1054() {
		return _thongsochungchixecogioi.getXCG1054();
	}

	/**
	* Sets the x c g1054 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1054 the x c g1054 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1054(java.lang.String XCG1054) {
		_thongsochungchixecogioi.setXCG1054(XCG1054);
	}

	/**
	* Returns the x c g1154 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1154 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1154() {
		return _thongsochungchixecogioi.getXCG1154();
	}

	/**
	* Sets the x c g1154 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1154 the x c g1154 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1154(java.lang.String XCG1154) {
		_thongsochungchixecogioi.setXCG1154(XCG1154);
	}

	/**
	* Returns the x c g1254 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1254 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1254() {
		return _thongsochungchixecogioi.getXCG1254();
	}

	/**
	* Sets the x c g1254 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1254 the x c g1254 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1254(java.lang.String XCG1254) {
		_thongsochungchixecogioi.setXCG1254(XCG1254);
	}

	/**
	* Returns the x c g1354 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1354 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1354() {
		return _thongsochungchixecogioi.getXCG1354();
	}

	/**
	* Sets the x c g1354 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1354 the x c g1354 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1354(java.lang.String XCG1354) {
		_thongsochungchixecogioi.setXCG1354(XCG1354);
	}

	/**
	* Returns the x c g1454 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1454 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1454() {
		return _thongsochungchixecogioi.getXCG1454();
	}

	/**
	* Sets the x c g1454 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1454 the x c g1454 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1454(java.lang.String XCG1454) {
		_thongsochungchixecogioi.setXCG1454(XCG1454);
	}

	/**
	* Returns the x c g1554 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1554 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1554() {
		return _thongsochungchixecogioi.getXCG1554();
	}

	/**
	* Sets the x c g1554 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1554 the x c g1554 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1554(java.lang.String XCG1554) {
		_thongsochungchixecogioi.setXCG1554(XCG1554);
	}

	/**
	* Returns the x c g1654 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1654 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1654() {
		return _thongsochungchixecogioi.getXCG1654();
	}

	/**
	* Sets the x c g1654 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1654 the x c g1654 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1654(java.lang.String XCG1654) {
		_thongsochungchixecogioi.setXCG1654(XCG1654);
	}

	/**
	* Returns the x c g1754 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1754 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1754() {
		return _thongsochungchixecogioi.getXCG1754();
	}

	/**
	* Sets the x c g1754 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1754 the x c g1754 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1754(java.lang.String XCG1754) {
		_thongsochungchixecogioi.setXCG1754(XCG1754);
	}

	/**
	* Returns the x c g0055 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0055 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0055() {
		return _thongsochungchixecogioi.getXCG0055();
	}

	/**
	* Sets the x c g0055 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0055 the x c g0055 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0055(java.lang.String XCG0055) {
		_thongsochungchixecogioi.setXCG0055(XCG0055);
	}

	/**
	* Returns the x c g0056 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0056 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0056() {
		return _thongsochungchixecogioi.getXCG0056();
	}

	/**
	* Sets the x c g0056 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0056 the x c g0056 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0056(java.lang.String XCG0056) {
		_thongsochungchixecogioi.setXCG0056(XCG0056);
	}

	/**
	* Returns the x c g0057 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0057 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0057() {
		return _thongsochungchixecogioi.getXCG0057();
	}

	/**
	* Sets the x c g0057 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0057 the x c g0057 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0057(java.lang.String XCG0057) {
		_thongsochungchixecogioi.setXCG0057(XCG0057);
	}

	/**
	* Returns the x c g0058 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0058 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0058() {
		return _thongsochungchixecogioi.getXCG0058();
	}

	/**
	* Sets the x c g0058 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0058 the x c g0058 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0058(java.lang.String XCG0058) {
		_thongsochungchixecogioi.setXCG0058(XCG0058);
	}

	/**
	* Returns the x c g0059 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0059 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0059() {
		return _thongsochungchixecogioi.getXCG0059();
	}

	/**
	* Sets the x c g0059 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0059 the x c g0059 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0059(java.lang.String XCG0059) {
		_thongsochungchixecogioi.setXCG0059(XCG0059);
	}

	/**
	* Returns the x c g1059 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1059 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1059() {
		return _thongsochungchixecogioi.getXCG1059();
	}

	/**
	* Sets the x c g1059 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1059 the x c g1059 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1059(java.lang.String XCG1059) {
		_thongsochungchixecogioi.setXCG1059(XCG1059);
	}

	/**
	* Returns the x c g0060 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0060 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0060() {
		return _thongsochungchixecogioi.getXCG0060();
	}

	/**
	* Sets the x c g0060 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0060 the x c g0060 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0060(java.lang.String XCG0060) {
		_thongsochungchixecogioi.setXCG0060(XCG0060);
	}

	/**
	* Returns the x c g0061 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0061 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0061() {
		return _thongsochungchixecogioi.getXCG0061();
	}

	/**
	* Sets the x c g0061 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0061 the x c g0061 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0061(java.lang.String XCG0061) {
		_thongsochungchixecogioi.setXCG0061(XCG0061);
	}

	/**
	* Returns the x c g0062 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0062 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0062() {
		return _thongsochungchixecogioi.getXCG0062();
	}

	/**
	* Sets the x c g0062 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0062 the x c g0062 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0062(java.lang.String XCG0062) {
		_thongsochungchixecogioi.setXCG0062(XCG0062);
	}

	/**
	* Returns the x c g0063 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0063 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0063() {
		return _thongsochungchixecogioi.getXCG0063();
	}

	/**
	* Sets the x c g0063 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0063 the x c g0063 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0063(java.lang.String XCG0063) {
		_thongsochungchixecogioi.setXCG0063(XCG0063);
	}

	/**
	* Returns the x c g0064 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0064 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0064() {
		return _thongsochungchixecogioi.getXCG0064();
	}

	/**
	* Sets the x c g0064 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0064 the x c g0064 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0064(java.lang.String XCG0064) {
		_thongsochungchixecogioi.setXCG0064(XCG0064);
	}

	/**
	* Returns the x c g0065 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0065 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0065() {
		return _thongsochungchixecogioi.getXCG0065();
	}

	/**
	* Sets the x c g0065 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0065 the x c g0065 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0065(java.lang.String XCG0065) {
		_thongsochungchixecogioi.setXCG0065(XCG0065);
	}

	/**
	* Returns the x c g0066 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0066 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0066() {
		return _thongsochungchixecogioi.getXCG0066();
	}

	/**
	* Sets the x c g0066 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0066 the x c g0066 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0066(java.lang.String XCG0066) {
		_thongsochungchixecogioi.setXCG0066(XCG0066);
	}

	/**
	* Returns the x c g1066 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1066 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1066() {
		return _thongsochungchixecogioi.getXCG1066();
	}

	/**
	* Sets the x c g1066 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1066 the x c g1066 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1066(java.lang.String XCG1066) {
		_thongsochungchixecogioi.setXCG1066(XCG1066);
	}

	/**
	* Returns the x c g0067 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0067 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0067() {
		return _thongsochungchixecogioi.getXCG0067();
	}

	/**
	* Sets the x c g0067 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0067 the x c g0067 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0067(java.lang.String XCG0067) {
		_thongsochungchixecogioi.setXCG0067(XCG0067);
	}

	/**
	* Returns the x c g0068 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0068 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0068() {
		return _thongsochungchixecogioi.getXCG0068();
	}

	/**
	* Sets the x c g0068 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0068 the x c g0068 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0068(java.lang.String XCG0068) {
		_thongsochungchixecogioi.setXCG0068(XCG0068);
	}

	/**
	* Returns the x c g0069 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0069 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0069() {
		return _thongsochungchixecogioi.getXCG0069();
	}

	/**
	* Sets the x c g0069 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0069 the x c g0069 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0069(java.lang.String XCG0069) {
		_thongsochungchixecogioi.setXCG0069(XCG0069);
	}

	/**
	* Returns the x c g0070 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0070 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0070() {
		return _thongsochungchixecogioi.getXCG0070();
	}

	/**
	* Sets the x c g0070 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0070 the x c g0070 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0070(java.lang.String XCG0070) {
		_thongsochungchixecogioi.setXCG0070(XCG0070);
	}

	/**
	* Returns the x c g0071 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0071 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0071() {
		return _thongsochungchixecogioi.getXCG0071();
	}

	/**
	* Sets the x c g0071 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0071 the x c g0071 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0071(java.lang.String XCG0071) {
		_thongsochungchixecogioi.setXCG0071(XCG0071);
	}

	/**
	* Returns the x c g0072 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0072 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0072() {
		return _thongsochungchixecogioi.getXCG0072();
	}

	/**
	* Sets the x c g0072 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0072 the x c g0072 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0072(java.lang.String XCG0072) {
		_thongsochungchixecogioi.setXCG0072(XCG0072);
	}

	/**
	* Returns the x c g1072 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1072 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1072() {
		return _thongsochungchixecogioi.getXCG1072();
	}

	/**
	* Sets the x c g1072 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1072 the x c g1072 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1072(java.lang.String XCG1072) {
		_thongsochungchixecogioi.setXCG1072(XCG1072);
	}

	/**
	* Returns the x c g0073 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0073 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0073() {
		return _thongsochungchixecogioi.getXCG0073();
	}

	/**
	* Sets the x c g0073 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0073 the x c g0073 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0073(java.lang.String XCG0073) {
		_thongsochungchixecogioi.setXCG0073(XCG0073);
	}

	/**
	* Returns the x c g0074 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0074 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0074() {
		return _thongsochungchixecogioi.getXCG0074();
	}

	/**
	* Sets the x c g0074 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0074 the x c g0074 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0074(java.lang.String XCG0074) {
		_thongsochungchixecogioi.setXCG0074(XCG0074);
	}

	/**
	* Returns the x c g0075 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0075 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0075() {
		return _thongsochungchixecogioi.getXCG0075();
	}

	/**
	* Sets the x c g0075 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0075 the x c g0075 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0075(java.lang.String XCG0075) {
		_thongsochungchixecogioi.setXCG0075(XCG0075);
	}

	/**
	* Returns the x c g0076 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0076 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0076() {
		return _thongsochungchixecogioi.getXCG0076();
	}

	/**
	* Sets the x c g0076 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0076 the x c g0076 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0076(java.lang.String XCG0076) {
		_thongsochungchixecogioi.setXCG0076(XCG0076);
	}

	/**
	* Returns the x c g0077 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0077 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0077() {
		return _thongsochungchixecogioi.getXCG0077();
	}

	/**
	* Sets the x c g0077 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0077 the x c g0077 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0077(java.lang.String XCG0077) {
		_thongsochungchixecogioi.setXCG0077(XCG0077);
	}

	/**
	* Returns the x c g1077 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1077 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1077() {
		return _thongsochungchixecogioi.getXCG1077();
	}

	/**
	* Sets the x c g1077 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1077 the x c g1077 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1077(java.lang.String XCG1077) {
		_thongsochungchixecogioi.setXCG1077(XCG1077);
	}

	/**
	* Returns the x c g0078 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0078 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0078() {
		return _thongsochungchixecogioi.getXCG0078();
	}

	/**
	* Sets the x c g0078 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0078 the x c g0078 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0078(java.lang.String XCG0078) {
		_thongsochungchixecogioi.setXCG0078(XCG0078);
	}

	/**
	* Returns the x c g1078 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1078 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1078() {
		return _thongsochungchixecogioi.getXCG1078();
	}

	/**
	* Sets the x c g1078 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1078 the x c g1078 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1078(java.lang.String XCG1078) {
		_thongsochungchixecogioi.setXCG1078(XCG1078);
	}

	/**
	* Returns the x c g0079 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0079 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0079() {
		return _thongsochungchixecogioi.getXCG0079();
	}

	/**
	* Sets the x c g0079 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0079 the x c g0079 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0079(java.lang.String XCG0079) {
		_thongsochungchixecogioi.setXCG0079(XCG0079);
	}

	/**
	* Returns the x c g0080 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0080 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0080() {
		return _thongsochungchixecogioi.getXCG0080();
	}

	/**
	* Sets the x c g0080 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0080 the x c g0080 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0080(java.lang.String XCG0080) {
		_thongsochungchixecogioi.setXCG0080(XCG0080);
	}

	/**
	* Returns the x c g1080 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1080 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1080() {
		return _thongsochungchixecogioi.getXCG1080();
	}

	/**
	* Sets the x c g1080 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1080 the x c g1080 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1080(java.lang.String XCG1080) {
		_thongsochungchixecogioi.setXCG1080(XCG1080);
	}

	/**
	* Returns the x c g0081 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0081 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0081() {
		return _thongsochungchixecogioi.getXCG0081();
	}

	/**
	* Sets the x c g0081 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0081 the x c g0081 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0081(java.lang.String XCG0081) {
		_thongsochungchixecogioi.setXCG0081(XCG0081);
	}

	/**
	* Returns the x c g0082 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0082 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0082() {
		return _thongsochungchixecogioi.getXCG0082();
	}

	/**
	* Sets the x c g0082 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0082 the x c g0082 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0082(java.lang.String XCG0082) {
		_thongsochungchixecogioi.setXCG0082(XCG0082);
	}

	/**
	* Returns the x c g0083 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0083 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0083() {
		return _thongsochungchixecogioi.getXCG0083();
	}

	/**
	* Sets the x c g0083 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0083 the x c g0083 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0083(java.lang.String XCG0083) {
		_thongsochungchixecogioi.setXCG0083(XCG0083);
	}

	/**
	* Returns the x c g0084 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0084 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0084() {
		return _thongsochungchixecogioi.getXCG0084();
	}

	/**
	* Sets the x c g0084 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0084 the x c g0084 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0084(java.lang.String XCG0084) {
		_thongsochungchixecogioi.setXCG0084(XCG0084);
	}

	/**
	* Returns the x c g0085 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0085 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0085() {
		return _thongsochungchixecogioi.getXCG0085();
	}

	/**
	* Sets the x c g0085 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0085 the x c g0085 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0085(java.lang.String XCG0085) {
		_thongsochungchixecogioi.setXCG0085(XCG0085);
	}

	/**
	* Returns the x c g1085 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1085 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1085() {
		return _thongsochungchixecogioi.getXCG1085();
	}

	/**
	* Sets the x c g1085 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1085 the x c g1085 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1085(java.lang.String XCG1085) {
		_thongsochungchixecogioi.setXCG1085(XCG1085);
	}

	/**
	* Returns the x c g0086 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0086 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0086() {
		return _thongsochungchixecogioi.getXCG0086();
	}

	/**
	* Sets the x c g0086 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0086 the x c g0086 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0086(java.lang.String XCG0086) {
		_thongsochungchixecogioi.setXCG0086(XCG0086);
	}

	/**
	* Returns the x c g1086 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1086 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1086() {
		return _thongsochungchixecogioi.getXCG1086();
	}

	/**
	* Sets the x c g1086 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1086 the x c g1086 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1086(java.lang.String XCG1086) {
		_thongsochungchixecogioi.setXCG1086(XCG1086);
	}

	/**
	* Returns the x c g0087 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0087 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0087() {
		return _thongsochungchixecogioi.getXCG0087();
	}

	/**
	* Sets the x c g0087 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0087 the x c g0087 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0087(java.lang.String XCG0087) {
		_thongsochungchixecogioi.setXCG0087(XCG0087);
	}

	/**
	* Returns the x c g0088 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0088 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0088() {
		return _thongsochungchixecogioi.getXCG0088();
	}

	/**
	* Sets the x c g0088 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0088 the x c g0088 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0088(java.lang.String XCG0088) {
		_thongsochungchixecogioi.setXCG0088(XCG0088);
	}

	/**
	* Returns the x c g1088 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1088 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1088() {
		return _thongsochungchixecogioi.getXCG1088();
	}

	/**
	* Sets the x c g1088 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1088 the x c g1088 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1088(java.lang.String XCG1088) {
		_thongsochungchixecogioi.setXCG1088(XCG1088);
	}

	/**
	* Returns the x c g0089 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0089 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0089() {
		return _thongsochungchixecogioi.getXCG0089();
	}

	/**
	* Sets the x c g0089 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0089 the x c g0089 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0089(java.lang.String XCG0089) {
		_thongsochungchixecogioi.setXCG0089(XCG0089);
	}

	/**
	* Returns the x c g0090 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0090 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0090() {
		return _thongsochungchixecogioi.getXCG0090();
	}

	/**
	* Sets the x c g0090 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0090 the x c g0090 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0090(java.lang.String XCG0090) {
		_thongsochungchixecogioi.setXCG0090(XCG0090);
	}

	/**
	* Returns the x c g0091 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0091 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0091() {
		return _thongsochungchixecogioi.getXCG0091();
	}

	/**
	* Sets the x c g0091 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0091 the x c g0091 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0091(java.lang.String XCG0091) {
		_thongsochungchixecogioi.setXCG0091(XCG0091);
	}

	/**
	* Returns the x c g0092 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0092 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0092() {
		return _thongsochungchixecogioi.getXCG0092();
	}

	/**
	* Sets the x c g0092 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0092 the x c g0092 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0092(java.lang.String XCG0092) {
		_thongsochungchixecogioi.setXCG0092(XCG0092);
	}

	/**
	* Returns the x c g0093 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0093 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0093() {
		return _thongsochungchixecogioi.getXCG0093();
	}

	/**
	* Sets the x c g0093 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0093 the x c g0093 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0093(java.lang.String XCG0093) {
		_thongsochungchixecogioi.setXCG0093(XCG0093);
	}

	/**
	* Returns the x c g0094 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0094 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0094() {
		return _thongsochungchixecogioi.getXCG0094();
	}

	/**
	* Sets the x c g0094 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0094 the x c g0094 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0094(java.lang.String XCG0094) {
		_thongsochungchixecogioi.setXCG0094(XCG0094);
	}

	/**
	* Returns the x c g0095 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0095 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0095() {
		return _thongsochungchixecogioi.getXCG0095();
	}

	/**
	* Sets the x c g0095 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0095 the x c g0095 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0095(java.lang.String XCG0095) {
		_thongsochungchixecogioi.setXCG0095(XCG0095);
	}

	/**
	* Returns the x c g0096 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0096 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0096() {
		return _thongsochungchixecogioi.getXCG0096();
	}

	/**
	* Sets the x c g0096 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0096 the x c g0096 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0096(java.lang.String XCG0096) {
		_thongsochungchixecogioi.setXCG0096(XCG0096);
	}

	/**
	* Returns the x c g0097 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0097 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0097() {
		return _thongsochungchixecogioi.getXCG0097();
	}

	/**
	* Sets the x c g0097 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0097 the x c g0097 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0097(java.lang.String XCG0097) {
		_thongsochungchixecogioi.setXCG0097(XCG0097);
	}

	/**
	* Returns the x c g1097 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g1097 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG1097() {
		return _thongsochungchixecogioi.getXCG1097();
	}

	/**
	* Sets the x c g1097 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG1097 the x c g1097 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG1097(java.lang.String XCG1097) {
		_thongsochungchixecogioi.setXCG1097(XCG1097);
	}

	/**
	* Returns the x c g0098 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0098 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0098() {
		return _thongsochungchixecogioi.getXCG0098();
	}

	/**
	* Sets the x c g0098 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0098 the x c g0098 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0098(java.lang.String XCG0098) {
		_thongsochungchixecogioi.setXCG0098(XCG0098);
	}

	/**
	* Returns the x c g0099 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0099 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0099() {
		return _thongsochungchixecogioi.getXCG0099();
	}

	/**
	* Sets the x c g0099 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0099 the x c g0099 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0099(java.lang.String XCG0099) {
		_thongsochungchixecogioi.setXCG0099(XCG0099);
	}

	/**
	* Returns the x c g0100 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0100 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0100() {
		return _thongsochungchixecogioi.getXCG0100();
	}

	/**
	* Sets the x c g0100 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0100 the x c g0100 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0100(java.lang.String XCG0100) {
		_thongsochungchixecogioi.setXCG0100(XCG0100);
	}

	/**
	* Returns the x c g0101 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0101 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0101() {
		return _thongsochungchixecogioi.getXCG0101();
	}

	/**
	* Sets the x c g0101 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0101 the x c g0101 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0101(java.lang.String XCG0101) {
		_thongsochungchixecogioi.setXCG0101(XCG0101);
	}

	/**
	* Returns the x c g0102 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0102 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0102() {
		return _thongsochungchixecogioi.getXCG0102();
	}

	/**
	* Sets the x c g0102 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0102 the x c g0102 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0102(java.lang.String XCG0102) {
		_thongsochungchixecogioi.setXCG0102(XCG0102);
	}

	/**
	* Returns the x c g0103 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0103 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0103() {
		return _thongsochungchixecogioi.getXCG0103();
	}

	/**
	* Sets the x c g0103 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0103 the x c g0103 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0103(java.lang.String XCG0103) {
		_thongsochungchixecogioi.setXCG0103(XCG0103);
	}

	/**
	* Returns the x c g0104 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0104 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0104() {
		return _thongsochungchixecogioi.getXCG0104();
	}

	/**
	* Sets the x c g0104 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0104 the x c g0104 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0104(java.lang.String XCG0104) {
		_thongsochungchixecogioi.setXCG0104(XCG0104);
	}

	/**
	* Returns the x c g0105 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0105 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0105() {
		return _thongsochungchixecogioi.getXCG0105();
	}

	/**
	* Sets the x c g0105 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0105 the x c g0105 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0105(java.lang.String XCG0105) {
		_thongsochungchixecogioi.setXCG0105(XCG0105);
	}

	/**
	* Returns the x c g0106 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0106 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0106() {
		return _thongsochungchixecogioi.getXCG0106();
	}

	/**
	* Sets the x c g0106 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0106 the x c g0106 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0106(java.lang.String XCG0106) {
		_thongsochungchixecogioi.setXCG0106(XCG0106);
	}

	/**
	* Returns the x c g0107 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0107 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0107() {
		return _thongsochungchixecogioi.getXCG0107();
	}

	/**
	* Sets the x c g0107 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0107 the x c g0107 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0107(java.lang.String XCG0107) {
		_thongsochungchixecogioi.setXCG0107(XCG0107);
	}

	/**
	* Returns the x c g0108 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0108 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0108() {
		return _thongsochungchixecogioi.getXCG0108();
	}

	/**
	* Sets the x c g0108 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0108 the x c g0108 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0108(java.lang.String XCG0108) {
		_thongsochungchixecogioi.setXCG0108(XCG0108);
	}

	/**
	* Returns the x c g0109 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0109 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0109() {
		return _thongsochungchixecogioi.getXCG0109();
	}

	/**
	* Sets the x c g0109 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0109 the x c g0109 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0109(java.lang.String XCG0109) {
		_thongsochungchixecogioi.setXCG0109(XCG0109);
	}

	/**
	* Returns the x c g0110 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0110 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0110() {
		return _thongsochungchixecogioi.getXCG0110();
	}

	/**
	* Sets the x c g0110 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0110 the x c g0110 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0110(java.lang.String XCG0110) {
		_thongsochungchixecogioi.setXCG0110(XCG0110);
	}

	/**
	* Returns the x c g0111 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0111 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0111() {
		return _thongsochungchixecogioi.getXCG0111();
	}

	/**
	* Sets the x c g0111 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0111 the x c g0111 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0111(java.lang.String XCG0111) {
		_thongsochungchixecogioi.setXCG0111(XCG0111);
	}

	/**
	* Returns the x c g0112 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0112 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0112() {
		return _thongsochungchixecogioi.getXCG0112();
	}

	/**
	* Sets the x c g0112 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0112 the x c g0112 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0112(java.lang.String XCG0112) {
		_thongsochungchixecogioi.setXCG0112(XCG0112);
	}

	/**
	* Returns the x c g0113 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0113 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0113() {
		return _thongsochungchixecogioi.getXCG0113();
	}

	/**
	* Sets the x c g0113 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0113 the x c g0113 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0113(java.lang.String XCG0113) {
		_thongsochungchixecogioi.setXCG0113(XCG0113);
	}

	/**
	* Returns the x c g0114 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0114 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0114() {
		return _thongsochungchixecogioi.getXCG0114();
	}

	/**
	* Sets the x c g0114 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0114 the x c g0114 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0114(java.lang.String XCG0114) {
		_thongsochungchixecogioi.setXCG0114(XCG0114);
	}

	/**
	* Returns the x c g0115 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0115 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0115() {
		return _thongsochungchixecogioi.getXCG0115();
	}

	/**
	* Sets the x c g0115 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0115 the x c g0115 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0115(java.lang.String XCG0115) {
		_thongsochungchixecogioi.setXCG0115(XCG0115);
	}

	/**
	* Returns the x c g0116 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0116 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0116() {
		return _thongsochungchixecogioi.getXCG0116();
	}

	/**
	* Sets the x c g0116 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0116 the x c g0116 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0116(java.lang.String XCG0116) {
		_thongsochungchixecogioi.setXCG0116(XCG0116);
	}

	/**
	* Returns the x c g0117 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0117 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0117() {
		return _thongsochungchixecogioi.getXCG0117();
	}

	/**
	* Sets the x c g0117 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0117 the x c g0117 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0117(java.lang.String XCG0117) {
		_thongsochungchixecogioi.setXCG0117(XCG0117);
	}

	/**
	* Returns the x c g0118 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0118 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0118() {
		return _thongsochungchixecogioi.getXCG0118();
	}

	/**
	* Sets the x c g0118 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0118 the x c g0118 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0118(java.lang.String XCG0118) {
		_thongsochungchixecogioi.setXCG0118(XCG0118);
	}

	/**
	* Returns the x c g0119 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0119 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0119() {
		return _thongsochungchixecogioi.getXCG0119();
	}

	/**
	* Sets the x c g0119 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0119 the x c g0119 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0119(java.lang.String XCG0119) {
		_thongsochungchixecogioi.setXCG0119(XCG0119);
	}

	/**
	* Returns the x c g0120 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0120 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0120() {
		return _thongsochungchixecogioi.getXCG0120();
	}

	/**
	* Sets the x c g0120 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0120 the x c g0120 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0120(java.lang.String XCG0120) {
		_thongsochungchixecogioi.setXCG0120(XCG0120);
	}

	/**
	* Returns the x c g0121 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0121 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0121() {
		return _thongsochungchixecogioi.getXCG0121();
	}

	/**
	* Sets the x c g0121 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0121 the x c g0121 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0121(java.lang.String XCG0121) {
		_thongsochungchixecogioi.setXCG0121(XCG0121);
	}

	/**
	* Returns the x c g0122 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0122 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0122() {
		return _thongsochungchixecogioi.getXCG0122();
	}

	/**
	* Sets the x c g0122 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0122 the x c g0122 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0122(java.lang.String XCG0122) {
		_thongsochungchixecogioi.setXCG0122(XCG0122);
	}

	/**
	* Returns the x c g0123 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0123 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0123() {
		return _thongsochungchixecogioi.getXCG0123();
	}

	/**
	* Sets the x c g0123 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0123 the x c g0123 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0123(java.lang.String XCG0123) {
		_thongsochungchixecogioi.setXCG0123(XCG0123);
	}

	/**
	* Returns the x c g0124 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0124 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0124() {
		return _thongsochungchixecogioi.getXCG0124();
	}

	/**
	* Sets the x c g0124 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0124 the x c g0124 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0124(java.lang.String XCG0124) {
		_thongsochungchixecogioi.setXCG0124(XCG0124);
	}

	/**
	* Returns the x c g0125 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0125 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0125() {
		return _thongsochungchixecogioi.getXCG0125();
	}

	/**
	* Sets the x c g0125 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0125 the x c g0125 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0125(java.lang.String XCG0125) {
		_thongsochungchixecogioi.setXCG0125(XCG0125);
	}

	/**
	* Returns the x c g0126 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0126 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0126() {
		return _thongsochungchixecogioi.getXCG0126();
	}

	/**
	* Sets the x c g0126 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0126 the x c g0126 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0126(java.lang.String XCG0126) {
		_thongsochungchixecogioi.setXCG0126(XCG0126);
	}

	/**
	* Returns the x c g0127 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0127 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0127() {
		return _thongsochungchixecogioi.getXCG0127();
	}

	/**
	* Sets the x c g0127 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0127 the x c g0127 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0127(java.lang.String XCG0127) {
		_thongsochungchixecogioi.setXCG0127(XCG0127);
	}

	/**
	* Returns the x c g0128 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0128 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0128() {
		return _thongsochungchixecogioi.getXCG0128();
	}

	/**
	* Sets the x c g0128 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0128 the x c g0128 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0128(java.lang.String XCG0128) {
		_thongsochungchixecogioi.setXCG0128(XCG0128);
	}

	/**
	* Returns the x c g0238 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0238 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0238() {
		return _thongsochungchixecogioi.getXCG0238();
	}

	/**
	* Sets the x c g0238 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0238 the x c g0238 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0238(java.lang.String XCG0238) {
		_thongsochungchixecogioi.setXCG0238(XCG0238);
	}

	/**
	* Returns the x c g0239 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0239 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0239() {
		return _thongsochungchixecogioi.getXCG0239();
	}

	/**
	* Sets the x c g0239 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0239 the x c g0239 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0239(java.lang.String XCG0239) {
		_thongsochungchixecogioi.setXCG0239(XCG0239);
	}

	/**
	* Returns the x c g0240 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0240 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0240() {
		return _thongsochungchixecogioi.getXCG0240();
	}

	/**
	* Sets the x c g0240 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0240 the x c g0240 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0240(java.lang.String XCG0240) {
		_thongsochungchixecogioi.setXCG0240(XCG0240);
	}

	/**
	* Returns the x c g0241 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @return the x c g0241 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public java.lang.String getXCG0241() {
		return _thongsochungchixecogioi.getXCG0241();
	}

	/**
	* Sets the x c g0241 of this t h o n g s o c h u n g c h i x e c o g i o i.
	*
	* @param XCG0241 the x c g0241 of this t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public void setXCG0241(java.lang.String XCG0241) {
		_thongsochungchixecogioi.setXCG0241(XCG0241);
	}

	@Override
	public boolean isNew() {
		return _thongsochungchixecogioi.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_thongsochungchixecogioi.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _thongsochungchixecogioi.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_thongsochungchixecogioi.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _thongsochungchixecogioi.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _thongsochungchixecogioi.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_thongsochungchixecogioi.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _thongsochungchixecogioi.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_thongsochungchixecogioi.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_thongsochungchixecogioi.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_thongsochungchixecogioi.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new THONGSOCHUNGCHIXECOGIOIWrapper((THONGSOCHUNGCHIXECOGIOI)_thongsochungchixecogioi.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi) {
		return _thongsochungchixecogioi.compareTo(thongsochungchixecogioi);
	}

	@Override
	public int hashCode() {
		return _thongsochungchixecogioi.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI> toCacheModel() {
		return _thongsochungchixecogioi.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI toEscapedModel() {
		return new THONGSOCHUNGCHIXECOGIOIWrapper(_thongsochungchixecogioi.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI toUnescapedModel() {
		return new THONGSOCHUNGCHIXECOGIOIWrapper(_thongsochungchixecogioi.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _thongsochungchixecogioi.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _thongsochungchixecogioi.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_thongsochungchixecogioi.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof THONGSOCHUNGCHIXECOGIOIWrapper)) {
			return false;
		}

		THONGSOCHUNGCHIXECOGIOIWrapper thongsochungchixecogioiWrapper = (THONGSOCHUNGCHIXECOGIOIWrapper)obj;

		if (Validator.equals(_thongsochungchixecogioi,
					thongsochungchixecogioiWrapper._thongsochungchixecogioi)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public THONGSOCHUNGCHIXECOGIOI getWrappedTHONGSOCHUNGCHIXECOGIOI() {
		return _thongsochungchixecogioi;
	}

	@Override
	public THONGSOCHUNGCHIXECOGIOI getWrappedModel() {
		return _thongsochungchixecogioi;
	}

	@Override
	public void resetOriginalValues() {
		_thongsochungchixecogioi.resetOriginalValues();
	}

	private THONGSOCHUNGCHIXECOGIOI _thongsochungchixecogioi;
}