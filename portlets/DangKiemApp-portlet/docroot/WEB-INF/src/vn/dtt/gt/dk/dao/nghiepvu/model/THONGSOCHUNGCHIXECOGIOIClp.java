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
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOILocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class THONGSOCHUNGCHIXECOGIOIClp extends BaseModelImpl<THONGSOCHUNGCHIXECOGIOI>
	implements THONGSOCHUNGCHIXECOGIOI {
	public THONGSOCHUNGCHIXECOGIOIClp() {
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, id);
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

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, hoSoThuTucId);
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

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateRecordId",
						long.class);

				method.invoke(_thongsochungchixecogioiRemoteModel,
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

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleGroupId", long.class);

				method.invoke(_thongsochungchixecogioiRemoteModel,
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

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchDate", Date.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, SynchDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0009() {
		return _XCG0009;
	}

	@Override
	public void setXCG0009(String XCG0009) {
		_XCG0009 = XCG0009;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0009", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0009);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0010() {
		return _XCG0010;
	}

	@Override
	public void setXCG0010(String XCG0010) {
		_XCG0010 = XCG0010;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0010", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0010);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0011() {
		return _XCG0011;
	}

	@Override
	public void setXCG0011(String XCG0011) {
		_XCG0011 = XCG0011;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0011", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0011);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0012() {
		return _XCG0012;
	}

	@Override
	public void setXCG0012(String XCG0012) {
		_XCG0012 = XCG0012;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0012", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0012);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0013() {
		return _XCG0013;
	}

	@Override
	public void setXCG0013(String XCG0013) {
		_XCG0013 = XCG0013;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0013", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0013);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0014() {
		return _XCG0014;
	}

	@Override
	public void setXCG0014(String XCG0014) {
		_XCG0014 = XCG0014;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0014", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0014);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0015() {
		return _XCG0015;
	}

	@Override
	public void setXCG0015(String XCG0015) {
		_XCG0015 = XCG0015;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0015", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0015);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0016() {
		return _XCG0016;
	}

	@Override
	public void setXCG0016(String XCG0016) {
		_XCG0016 = XCG0016;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0016", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0016);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0017() {
		return _XCG0017;
	}

	@Override
	public void setXCG0017(String XCG0017) {
		_XCG0017 = XCG0017;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0017", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0017);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0018() {
		return _XCG0018;
	}

	@Override
	public void setXCG0018(String XCG0018) {
		_XCG0018 = XCG0018;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0018", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0018);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0019() {
		return _XCG0019;
	}

	@Override
	public void setXCG0019(String XCG0019) {
		_XCG0019 = XCG0019;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0019", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0019);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0020() {
		return _XCG0020;
	}

	@Override
	public void setXCG0020(String XCG0020) {
		_XCG0020 = XCG0020;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0020", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0020);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0021() {
		return _XCG0021;
	}

	@Override
	public void setXCG0021(String XCG0021) {
		_XCG0021 = XCG0021;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0021", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0021);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1021() {
		return _XCG1021;
	}

	@Override
	public void setXCG1021(String XCG1021) {
		_XCG1021 = XCG1021;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1021", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1021);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1121() {
		return _XCG1121;
	}

	@Override
	public void setXCG1121(String XCG1121) {
		_XCG1121 = XCG1121;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1121", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1121);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0022() {
		return _XCG0022;
	}

	@Override
	public void setXCG0022(String XCG0022) {
		_XCG0022 = XCG0022;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0022", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0022);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1022() {
		return _XCG1022;
	}

	@Override
	public void setXCG1022(String XCG1022) {
		_XCG1022 = XCG1022;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1022", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1022);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1122() {
		return _XCG1122;
	}

	@Override
	public void setXCG1122(String XCG1122) {
		_XCG1122 = XCG1122;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1122", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1122);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0023() {
		return _XCG0023;
	}

	@Override
	public void setXCG0023(String XCG0023) {
		_XCG0023 = XCG0023;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0023", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0023);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1023() {
		return _XCG1023;
	}

	@Override
	public void setXCG1023(String XCG1023) {
		_XCG1023 = XCG1023;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1023", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1023);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1123() {
		return _XCG1123;
	}

	@Override
	public void setXCG1123(String XCG1123) {
		_XCG1123 = XCG1123;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1123", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1123);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0024() {
		return _XCG0024;
	}

	@Override
	public void setXCG0024(String XCG0024) {
		_XCG0024 = XCG0024;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0024", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0024);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1024() {
		return _XCG1024;
	}

	@Override
	public void setXCG1024(String XCG1024) {
		_XCG1024 = XCG1024;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1024", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1024);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1124() {
		return _XCG1124;
	}

	@Override
	public void setXCG1124(String XCG1124) {
		_XCG1124 = XCG1124;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1124", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1124);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0025() {
		return _XCG0025;
	}

	@Override
	public void setXCG0025(String XCG0025) {
		_XCG0025 = XCG0025;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0025", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0025);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1025() {
		return _XCG1025;
	}

	@Override
	public void setXCG1025(String XCG1025) {
		_XCG1025 = XCG1025;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1025", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1025);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1125() {
		return _XCG1125;
	}

	@Override
	public void setXCG1125(String XCG1125) {
		_XCG1125 = XCG1125;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1125", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1125);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0026() {
		return _XCG0026;
	}

	@Override
	public void setXCG0026(String XCG0026) {
		_XCG0026 = XCG0026;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0026", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0026);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1026() {
		return _XCG1026;
	}

	@Override
	public void setXCG1026(String XCG1026) {
		_XCG1026 = XCG1026;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1026", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1026);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1126() {
		return _XCG1126;
	}

	@Override
	public void setXCG1126(String XCG1126) {
		_XCG1126 = XCG1126;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1126", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1126);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0027() {
		return _XCG0027;
	}

	@Override
	public void setXCG0027(String XCG0027) {
		_XCG0027 = XCG0027;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0027", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0027);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1027() {
		return _XCG1027;
	}

	@Override
	public void setXCG1027(String XCG1027) {
		_XCG1027 = XCG1027;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1027", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1027);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1127() {
		return _XCG1127;
	}

	@Override
	public void setXCG1127(String XCG1127) {
		_XCG1127 = XCG1127;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1127", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1127);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0028() {
		return _XCG0028;
	}

	@Override
	public void setXCG0028(String XCG0028) {
		_XCG0028 = XCG0028;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0028", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0028);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1028() {
		return _XCG1028;
	}

	@Override
	public void setXCG1028(String XCG1028) {
		_XCG1028 = XCG1028;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1028", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1028);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1128() {
		return _XCG1128;
	}

	@Override
	public void setXCG1128(String XCG1128) {
		_XCG1128 = XCG1128;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1128", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1128);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0029() {
		return _XCG0029;
	}

	@Override
	public void setXCG0029(String XCG0029) {
		_XCG0029 = XCG0029;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0029", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0029);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1029() {
		return _XCG1029;
	}

	@Override
	public void setXCG1029(String XCG1029) {
		_XCG1029 = XCG1029;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1029", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1029);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1129() {
		return _XCG1129;
	}

	@Override
	public void setXCG1129(String XCG1129) {
		_XCG1129 = XCG1129;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1129", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1129);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0030() {
		return _XCG0030;
	}

	@Override
	public void setXCG0030(String XCG0030) {
		_XCG0030 = XCG0030;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0030", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0030);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1030() {
		return _XCG1030;
	}

	@Override
	public void setXCG1030(String XCG1030) {
		_XCG1030 = XCG1030;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1030", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1030);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1130() {
		return _XCG1130;
	}

	@Override
	public void setXCG1130(String XCG1130) {
		_XCG1130 = XCG1130;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1130", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1130);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0031() {
		return _XCG0031;
	}

	@Override
	public void setXCG0031(String XCG0031) {
		_XCG0031 = XCG0031;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0031", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0031);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1031() {
		return _XCG1031;
	}

	@Override
	public void setXCG1031(String XCG1031) {
		_XCG1031 = XCG1031;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1031", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1031);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1131() {
		return _XCG1131;
	}

	@Override
	public void setXCG1131(String XCG1131) {
		_XCG1131 = XCG1131;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1131", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1131);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0032() {
		return _XCG0032;
	}

	@Override
	public void setXCG0032(String XCG0032) {
		_XCG0032 = XCG0032;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0032", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0032);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1032() {
		return _XCG1032;
	}

	@Override
	public void setXCG1032(String XCG1032) {
		_XCG1032 = XCG1032;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1032", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1032);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1132() {
		return _XCG1132;
	}

	@Override
	public void setXCG1132(String XCG1132) {
		_XCG1132 = XCG1132;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1132", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1132);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0033() {
		return _XCG0033;
	}

	@Override
	public void setXCG0033(String XCG0033) {
		_XCG0033 = XCG0033;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0033", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0033);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1033() {
		return _XCG1033;
	}

	@Override
	public void setXCG1033(String XCG1033) {
		_XCG1033 = XCG1033;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1033", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1033);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1133() {
		return _XCG1133;
	}

	@Override
	public void setXCG1133(String XCG1133) {
		_XCG1133 = XCG1133;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1133", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1133);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0034() {
		return _XCG0034;
	}

	@Override
	public void setXCG0034(String XCG0034) {
		_XCG0034 = XCG0034;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0034", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0034);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1034() {
		return _XCG1034;
	}

	@Override
	public void setXCG1034(String XCG1034) {
		_XCG1034 = XCG1034;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1034", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1034);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1134() {
		return _XCG1134;
	}

	@Override
	public void setXCG1134(String XCG1134) {
		_XCG1134 = XCG1134;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1134", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1134);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0035() {
		return _XCG0035;
	}

	@Override
	public void setXCG0035(String XCG0035) {
		_XCG0035 = XCG0035;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0035", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0035);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1035() {
		return _XCG1035;
	}

	@Override
	public void setXCG1035(String XCG1035) {
		_XCG1035 = XCG1035;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1035", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1035);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1135() {
		return _XCG1135;
	}

	@Override
	public void setXCG1135(String XCG1135) {
		_XCG1135 = XCG1135;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1135", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1135);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0036() {
		return _XCG0036;
	}

	@Override
	public void setXCG0036(String XCG0036) {
		_XCG0036 = XCG0036;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0036", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0036);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1036() {
		return _XCG1036;
	}

	@Override
	public void setXCG1036(String XCG1036) {
		_XCG1036 = XCG1036;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1036", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1036);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1136() {
		return _XCG1136;
	}

	@Override
	public void setXCG1136(String XCG1136) {
		_XCG1136 = XCG1136;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1136", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1136);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0037() {
		return _XCG0037;
	}

	@Override
	public void setXCG0037(String XCG0037) {
		_XCG0037 = XCG0037;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0037", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0037);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1037() {
		return _XCG1037;
	}

	@Override
	public void setXCG1037(String XCG1037) {
		_XCG1037 = XCG1037;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1037", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1037);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1137() {
		return _XCG1137;
	}

	@Override
	public void setXCG1137(String XCG1137) {
		_XCG1137 = XCG1137;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1137", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1137);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0038() {
		return _XCG0038;
	}

	@Override
	public void setXCG0038(String XCG0038) {
		_XCG0038 = XCG0038;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0038", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0038);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1038() {
		return _XCG1038;
	}

	@Override
	public void setXCG1038(String XCG1038) {
		_XCG1038 = XCG1038;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1038", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1038);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1138() {
		return _XCG1138;
	}

	@Override
	public void setXCG1138(String XCG1138) {
		_XCG1138 = XCG1138;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1138", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1138);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0039() {
		return _XCG0039;
	}

	@Override
	public void setXCG0039(String XCG0039) {
		_XCG0039 = XCG0039;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0039", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0039);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1039() {
		return _XCG1039;
	}

	@Override
	public void setXCG1039(String XCG1039) {
		_XCG1039 = XCG1039;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1039", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1039);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1139() {
		return _XCG1139;
	}

	@Override
	public void setXCG1139(String XCG1139) {
		_XCG1139 = XCG1139;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1139", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1139);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0040() {
		return _XCG0040;
	}

	@Override
	public void setXCG0040(String XCG0040) {
		_XCG0040 = XCG0040;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0040", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0040);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1040() {
		return _XCG1040;
	}

	@Override
	public void setXCG1040(String XCG1040) {
		_XCG1040 = XCG1040;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1040", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1040);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1140() {
		return _XCG1140;
	}

	@Override
	public void setXCG1140(String XCG1140) {
		_XCG1140 = XCG1140;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1140", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1140);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0041() {
		return _XCG0041;
	}

	@Override
	public void setXCG0041(String XCG0041) {
		_XCG0041 = XCG0041;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0041", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0041);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1041() {
		return _XCG1041;
	}

	@Override
	public void setXCG1041(String XCG1041) {
		_XCG1041 = XCG1041;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1041", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1041);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1141() {
		return _XCG1141;
	}

	@Override
	public void setXCG1141(String XCG1141) {
		_XCG1141 = XCG1141;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1141", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1141);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0042() {
		return _XCG0042;
	}

	@Override
	public void setXCG0042(String XCG0042) {
		_XCG0042 = XCG0042;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0042", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0042);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1042() {
		return _XCG1042;
	}

	@Override
	public void setXCG1042(String XCG1042) {
		_XCG1042 = XCG1042;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1042", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1042);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1142() {
		return _XCG1142;
	}

	@Override
	public void setXCG1142(String XCG1142) {
		_XCG1142 = XCG1142;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1142", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1142);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0043() {
		return _XCG0043;
	}

	@Override
	public void setXCG0043(String XCG0043) {
		_XCG0043 = XCG0043;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0043", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0043);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1043() {
		return _XCG1043;
	}

	@Override
	public void setXCG1043(String XCG1043) {
		_XCG1043 = XCG1043;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1043", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1043);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1143() {
		return _XCG1143;
	}

	@Override
	public void setXCG1143(String XCG1143) {
		_XCG1143 = XCG1143;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1143", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1143);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0044() {
		return _XCG0044;
	}

	@Override
	public void setXCG0044(String XCG0044) {
		_XCG0044 = XCG0044;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0044", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0044);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1044() {
		return _XCG1044;
	}

	@Override
	public void setXCG1044(String XCG1044) {
		_XCG1044 = XCG1044;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1044", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1044);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1144() {
		return _XCG1144;
	}

	@Override
	public void setXCG1144(String XCG1144) {
		_XCG1144 = XCG1144;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1144", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1144);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0045() {
		return _XCG0045;
	}

	@Override
	public void setXCG0045(String XCG0045) {
		_XCG0045 = XCG0045;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0045", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0045);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0046() {
		return _XCG0046;
	}

	@Override
	public void setXCG0046(String XCG0046) {
		_XCG0046 = XCG0046;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0046", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0046);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1047() {
		return _XCG1047;
	}

	@Override
	public void setXCG1047(String XCG1047) {
		_XCG1047 = XCG1047;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1047", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1047);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0047() {
		return _XCG0047;
	}

	@Override
	public void setXCG0047(String XCG0047) {
		_XCG0047 = XCG0047;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0047", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0047);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0048() {
		return _XCG0048;
	}

	@Override
	public void setXCG0048(String XCG0048) {
		_XCG0048 = XCG0048;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0048", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0048);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0049() {
		return _XCG0049;
	}

	@Override
	public void setXCG0049(String XCG0049) {
		_XCG0049 = XCG0049;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0049", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0049);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0050() {
		return _XCG0050;
	}

	@Override
	public void setXCG0050(String XCG0050) {
		_XCG0050 = XCG0050;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0050", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0050);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0051() {
		return _XCG0051;
	}

	@Override
	public void setXCG0051(String XCG0051) {
		_XCG0051 = XCG0051;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0051", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0051);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0052() {
		return _XCG0052;
	}

	@Override
	public void setXCG0052(String XCG0052) {
		_XCG0052 = XCG0052;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0052", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0052);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0053() {
		return _XCG0053;
	}

	@Override
	public void setXCG0053(String XCG0053) {
		_XCG0053 = XCG0053;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0053", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0053);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0054() {
		return _XCG0054;
	}

	@Override
	public void setXCG0054(String XCG0054) {
		_XCG0054 = XCG0054;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0054", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0054);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1054() {
		return _XCG1054;
	}

	@Override
	public void setXCG1054(String XCG1054) {
		_XCG1054 = XCG1054;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1054", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1054);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1154() {
		return _XCG1154;
	}

	@Override
	public void setXCG1154(String XCG1154) {
		_XCG1154 = XCG1154;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1154", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1154);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1254() {
		return _XCG1254;
	}

	@Override
	public void setXCG1254(String XCG1254) {
		_XCG1254 = XCG1254;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1254", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1254);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1354() {
		return _XCG1354;
	}

	@Override
	public void setXCG1354(String XCG1354) {
		_XCG1354 = XCG1354;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1354", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1354);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1454() {
		return _XCG1454;
	}

	@Override
	public void setXCG1454(String XCG1454) {
		_XCG1454 = XCG1454;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1454", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1454);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1554() {
		return _XCG1554;
	}

	@Override
	public void setXCG1554(String XCG1554) {
		_XCG1554 = XCG1554;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1554", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1554);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1654() {
		return _XCG1654;
	}

	@Override
	public void setXCG1654(String XCG1654) {
		_XCG1654 = XCG1654;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1654", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1654);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1754() {
		return _XCG1754;
	}

	@Override
	public void setXCG1754(String XCG1754) {
		_XCG1754 = XCG1754;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1754", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1754);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0055() {
		return _XCG0055;
	}

	@Override
	public void setXCG0055(String XCG0055) {
		_XCG0055 = XCG0055;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0055", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0055);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0056() {
		return _XCG0056;
	}

	@Override
	public void setXCG0056(String XCG0056) {
		_XCG0056 = XCG0056;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0056", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0056);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0057() {
		return _XCG0057;
	}

	@Override
	public void setXCG0057(String XCG0057) {
		_XCG0057 = XCG0057;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0057", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0057);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0058() {
		return _XCG0058;
	}

	@Override
	public void setXCG0058(String XCG0058) {
		_XCG0058 = XCG0058;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0058", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0058);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0059() {
		return _XCG0059;
	}

	@Override
	public void setXCG0059(String XCG0059) {
		_XCG0059 = XCG0059;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0059", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0059);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1059() {
		return _XCG1059;
	}

	@Override
	public void setXCG1059(String XCG1059) {
		_XCG1059 = XCG1059;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1059", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1059);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0060() {
		return _XCG0060;
	}

	@Override
	public void setXCG0060(String XCG0060) {
		_XCG0060 = XCG0060;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0060", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0060);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0061() {
		return _XCG0061;
	}

	@Override
	public void setXCG0061(String XCG0061) {
		_XCG0061 = XCG0061;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0061", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0061);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0062() {
		return _XCG0062;
	}

	@Override
	public void setXCG0062(String XCG0062) {
		_XCG0062 = XCG0062;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0062", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0062);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0063() {
		return _XCG0063;
	}

	@Override
	public void setXCG0063(String XCG0063) {
		_XCG0063 = XCG0063;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0063", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0063);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0064() {
		return _XCG0064;
	}

	@Override
	public void setXCG0064(String XCG0064) {
		_XCG0064 = XCG0064;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0064", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0064);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0065() {
		return _XCG0065;
	}

	@Override
	public void setXCG0065(String XCG0065) {
		_XCG0065 = XCG0065;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0065", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0065);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0066() {
		return _XCG0066;
	}

	@Override
	public void setXCG0066(String XCG0066) {
		_XCG0066 = XCG0066;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0066", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0066);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1066() {
		return _XCG1066;
	}

	@Override
	public void setXCG1066(String XCG1066) {
		_XCG1066 = XCG1066;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1066", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1066);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0067() {
		return _XCG0067;
	}

	@Override
	public void setXCG0067(String XCG0067) {
		_XCG0067 = XCG0067;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0067", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0067);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0068() {
		return _XCG0068;
	}

	@Override
	public void setXCG0068(String XCG0068) {
		_XCG0068 = XCG0068;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0068", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0068);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0069() {
		return _XCG0069;
	}

	@Override
	public void setXCG0069(String XCG0069) {
		_XCG0069 = XCG0069;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0069", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0069);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0070() {
		return _XCG0070;
	}

	@Override
	public void setXCG0070(String XCG0070) {
		_XCG0070 = XCG0070;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0070", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0070);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0071() {
		return _XCG0071;
	}

	@Override
	public void setXCG0071(String XCG0071) {
		_XCG0071 = XCG0071;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0071", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0071);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0072() {
		return _XCG0072;
	}

	@Override
	public void setXCG0072(String XCG0072) {
		_XCG0072 = XCG0072;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0072", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0072);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1072() {
		return _XCG1072;
	}

	@Override
	public void setXCG1072(String XCG1072) {
		_XCG1072 = XCG1072;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1072", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1072);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0073() {
		return _XCG0073;
	}

	@Override
	public void setXCG0073(String XCG0073) {
		_XCG0073 = XCG0073;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0073", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0073);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0074() {
		return _XCG0074;
	}

	@Override
	public void setXCG0074(String XCG0074) {
		_XCG0074 = XCG0074;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0074", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0074);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0075() {
		return _XCG0075;
	}

	@Override
	public void setXCG0075(String XCG0075) {
		_XCG0075 = XCG0075;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0075", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0075);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0076() {
		return _XCG0076;
	}

	@Override
	public void setXCG0076(String XCG0076) {
		_XCG0076 = XCG0076;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0076", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0076);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0077() {
		return _XCG0077;
	}

	@Override
	public void setXCG0077(String XCG0077) {
		_XCG0077 = XCG0077;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0077", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0077);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1077() {
		return _XCG1077;
	}

	@Override
	public void setXCG1077(String XCG1077) {
		_XCG1077 = XCG1077;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1077", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1077);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0078() {
		return _XCG0078;
	}

	@Override
	public void setXCG0078(String XCG0078) {
		_XCG0078 = XCG0078;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0078", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0078);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1078() {
		return _XCG1078;
	}

	@Override
	public void setXCG1078(String XCG1078) {
		_XCG1078 = XCG1078;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1078", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1078);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0079() {
		return _XCG0079;
	}

	@Override
	public void setXCG0079(String XCG0079) {
		_XCG0079 = XCG0079;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0079", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0079);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0080() {
		return _XCG0080;
	}

	@Override
	public void setXCG0080(String XCG0080) {
		_XCG0080 = XCG0080;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0080", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0080);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1080() {
		return _XCG1080;
	}

	@Override
	public void setXCG1080(String XCG1080) {
		_XCG1080 = XCG1080;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1080", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1080);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0081() {
		return _XCG0081;
	}

	@Override
	public void setXCG0081(String XCG0081) {
		_XCG0081 = XCG0081;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0081", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0081);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0082() {
		return _XCG0082;
	}

	@Override
	public void setXCG0082(String XCG0082) {
		_XCG0082 = XCG0082;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0082", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0082);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0083() {
		return _XCG0083;
	}

	@Override
	public void setXCG0083(String XCG0083) {
		_XCG0083 = XCG0083;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0083", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0083);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0084() {
		return _XCG0084;
	}

	@Override
	public void setXCG0084(String XCG0084) {
		_XCG0084 = XCG0084;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0084", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0084);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0085() {
		return _XCG0085;
	}

	@Override
	public void setXCG0085(String XCG0085) {
		_XCG0085 = XCG0085;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0085", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0085);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1085() {
		return _XCG1085;
	}

	@Override
	public void setXCG1085(String XCG1085) {
		_XCG1085 = XCG1085;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1085", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1085);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0086() {
		return _XCG0086;
	}

	@Override
	public void setXCG0086(String XCG0086) {
		_XCG0086 = XCG0086;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0086", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0086);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1086() {
		return _XCG1086;
	}

	@Override
	public void setXCG1086(String XCG1086) {
		_XCG1086 = XCG1086;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1086", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1086);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0087() {
		return _XCG0087;
	}

	@Override
	public void setXCG0087(String XCG0087) {
		_XCG0087 = XCG0087;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0087", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0087);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0088() {
		return _XCG0088;
	}

	@Override
	public void setXCG0088(String XCG0088) {
		_XCG0088 = XCG0088;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0088", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0088);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1088() {
		return _XCG1088;
	}

	@Override
	public void setXCG1088(String XCG1088) {
		_XCG1088 = XCG1088;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1088", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1088);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0089() {
		return _XCG0089;
	}

	@Override
	public void setXCG0089(String XCG0089) {
		_XCG0089 = XCG0089;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0089", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0089);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0090() {
		return _XCG0090;
	}

	@Override
	public void setXCG0090(String XCG0090) {
		_XCG0090 = XCG0090;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0090", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0090);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0091() {
		return _XCG0091;
	}

	@Override
	public void setXCG0091(String XCG0091) {
		_XCG0091 = XCG0091;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0091", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0091);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0092() {
		return _XCG0092;
	}

	@Override
	public void setXCG0092(String XCG0092) {
		_XCG0092 = XCG0092;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0092", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0092);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0093() {
		return _XCG0093;
	}

	@Override
	public void setXCG0093(String XCG0093) {
		_XCG0093 = XCG0093;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0093", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0093);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0094() {
		return _XCG0094;
	}

	@Override
	public void setXCG0094(String XCG0094) {
		_XCG0094 = XCG0094;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0094", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0094);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0095() {
		return _XCG0095;
	}

	@Override
	public void setXCG0095(String XCG0095) {
		_XCG0095 = XCG0095;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0095", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0095);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0096() {
		return _XCG0096;
	}

	@Override
	public void setXCG0096(String XCG0096) {
		_XCG0096 = XCG0096;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0096", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0096);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0097() {
		return _XCG0097;
	}

	@Override
	public void setXCG0097(String XCG0097) {
		_XCG0097 = XCG0097;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0097", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0097);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG1097() {
		return _XCG1097;
	}

	@Override
	public void setXCG1097(String XCG1097) {
		_XCG1097 = XCG1097;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG1097", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG1097);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0098() {
		return _XCG0098;
	}

	@Override
	public void setXCG0098(String XCG0098) {
		_XCG0098 = XCG0098;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0098", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0098);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0099() {
		return _XCG0099;
	}

	@Override
	public void setXCG0099(String XCG0099) {
		_XCG0099 = XCG0099;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0099", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0099);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0100() {
		return _XCG0100;
	}

	@Override
	public void setXCG0100(String XCG0100) {
		_XCG0100 = XCG0100;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0100", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0100);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0101() {
		return _XCG0101;
	}

	@Override
	public void setXCG0101(String XCG0101) {
		_XCG0101 = XCG0101;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0101", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0101);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0102() {
		return _XCG0102;
	}

	@Override
	public void setXCG0102(String XCG0102) {
		_XCG0102 = XCG0102;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0102", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0102);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0103() {
		return _XCG0103;
	}

	@Override
	public void setXCG0103(String XCG0103) {
		_XCG0103 = XCG0103;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0103", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0103);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0104() {
		return _XCG0104;
	}

	@Override
	public void setXCG0104(String XCG0104) {
		_XCG0104 = XCG0104;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0104", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0104);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0105() {
		return _XCG0105;
	}

	@Override
	public void setXCG0105(String XCG0105) {
		_XCG0105 = XCG0105;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0105", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0105);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0106() {
		return _XCG0106;
	}

	@Override
	public void setXCG0106(String XCG0106) {
		_XCG0106 = XCG0106;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0106", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0106);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0107() {
		return _XCG0107;
	}

	@Override
	public void setXCG0107(String XCG0107) {
		_XCG0107 = XCG0107;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0107", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0107);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0108() {
		return _XCG0108;
	}

	@Override
	public void setXCG0108(String XCG0108) {
		_XCG0108 = XCG0108;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0108", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0108);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0109() {
		return _XCG0109;
	}

	@Override
	public void setXCG0109(String XCG0109) {
		_XCG0109 = XCG0109;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0109", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0109);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0110() {
		return _XCG0110;
	}

	@Override
	public void setXCG0110(String XCG0110) {
		_XCG0110 = XCG0110;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0110", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0110);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0111() {
		return _XCG0111;
	}

	@Override
	public void setXCG0111(String XCG0111) {
		_XCG0111 = XCG0111;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0111", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0111);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0112() {
		return _XCG0112;
	}

	@Override
	public void setXCG0112(String XCG0112) {
		_XCG0112 = XCG0112;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0112", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0112);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0113() {
		return _XCG0113;
	}

	@Override
	public void setXCG0113(String XCG0113) {
		_XCG0113 = XCG0113;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0113", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0113);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0114() {
		return _XCG0114;
	}

	@Override
	public void setXCG0114(String XCG0114) {
		_XCG0114 = XCG0114;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0114", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0114);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0115() {
		return _XCG0115;
	}

	@Override
	public void setXCG0115(String XCG0115) {
		_XCG0115 = XCG0115;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0115", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0115);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0116() {
		return _XCG0116;
	}

	@Override
	public void setXCG0116(String XCG0116) {
		_XCG0116 = XCG0116;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0116", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0116);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0117() {
		return _XCG0117;
	}

	@Override
	public void setXCG0117(String XCG0117) {
		_XCG0117 = XCG0117;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0117", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0117);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0118() {
		return _XCG0118;
	}

	@Override
	public void setXCG0118(String XCG0118) {
		_XCG0118 = XCG0118;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0118", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0118);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0119() {
		return _XCG0119;
	}

	@Override
	public void setXCG0119(String XCG0119) {
		_XCG0119 = XCG0119;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0119", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0119);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0120() {
		return _XCG0120;
	}

	@Override
	public void setXCG0120(String XCG0120) {
		_XCG0120 = XCG0120;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0120", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0120);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0121() {
		return _XCG0121;
	}

	@Override
	public void setXCG0121(String XCG0121) {
		_XCG0121 = XCG0121;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0121", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0121);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0122() {
		return _XCG0122;
	}

	@Override
	public void setXCG0122(String XCG0122) {
		_XCG0122 = XCG0122;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0122", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0122);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0123() {
		return _XCG0123;
	}

	@Override
	public void setXCG0123(String XCG0123) {
		_XCG0123 = XCG0123;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0123", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0123);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0124() {
		return _XCG0124;
	}

	@Override
	public void setXCG0124(String XCG0124) {
		_XCG0124 = XCG0124;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0124", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0124);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0125() {
		return _XCG0125;
	}

	@Override
	public void setXCG0125(String XCG0125) {
		_XCG0125 = XCG0125;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0125", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0125);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0126() {
		return _XCG0126;
	}

	@Override
	public void setXCG0126(String XCG0126) {
		_XCG0126 = XCG0126;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0126", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0126);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0127() {
		return _XCG0127;
	}

	@Override
	public void setXCG0127(String XCG0127) {
		_XCG0127 = XCG0127;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0127", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0127);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0128() {
		return _XCG0128;
	}

	@Override
	public void setXCG0128(String XCG0128) {
		_XCG0128 = XCG0128;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0128", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0128);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0238() {
		return _XCG0238;
	}

	@Override
	public void setXCG0238(String XCG0238) {
		_XCG0238 = XCG0238;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0238", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0238);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0239() {
		return _XCG0239;
	}

	@Override
	public void setXCG0239(String XCG0239) {
		_XCG0239 = XCG0239;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0239", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0239);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0240() {
		return _XCG0240;
	}

	@Override
	public void setXCG0240(String XCG0240) {
		_XCG0240 = XCG0240;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0240", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0240);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getXCG0241() {
		return _XCG0241;
	}

	@Override
	public void setXCG0241(String XCG0241) {
		_XCG0241 = XCG0241;

		if (_thongsochungchixecogioiRemoteModel != null) {
			try {
				Class<?> clazz = _thongsochungchixecogioiRemoteModel.getClass();

				Method method = clazz.getMethod("setXCG0241", String.class);

				method.invoke(_thongsochungchixecogioiRemoteModel, XCG0241);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTHONGSOCHUNGCHIXECOGIOIRemoteModel() {
		return _thongsochungchixecogioiRemoteModel;
	}

	public void setTHONGSOCHUNGCHIXECOGIOIRemoteModel(
		BaseModel<?> thongsochungchixecogioiRemoteModel) {
		_thongsochungchixecogioiRemoteModel = thongsochungchixecogioiRemoteModel;
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

		Class<?> remoteModelClass = _thongsochungchixecogioiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_thongsochungchixecogioiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			THONGSOCHUNGCHIXECOGIOILocalServiceUtil.addTHONGSOCHUNGCHIXECOGIOI(this);
		}
		else {
			THONGSOCHUNGCHIXECOGIOILocalServiceUtil.updateTHONGSOCHUNGCHIXECOGIOI(this);
		}
	}

	@Override
	public THONGSOCHUNGCHIXECOGIOI toEscapedModel() {
		return (THONGSOCHUNGCHIXECOGIOI)ProxyUtil.newProxyInstance(THONGSOCHUNGCHIXECOGIOI.class.getClassLoader(),
			new Class[] { THONGSOCHUNGCHIXECOGIOI.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		THONGSOCHUNGCHIXECOGIOIClp clone = new THONGSOCHUNGCHIXECOGIOIClp();

		clone.setId(getId());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setCertificateRecordId(getCertificateRecordId());
		clone.setVehicleGroupId(getVehicleGroupId());
		clone.setSynchDate(getSynchDate());
		clone.setXCG0009(getXCG0009());
		clone.setXCG0010(getXCG0010());
		clone.setXCG0011(getXCG0011());
		clone.setXCG0012(getXCG0012());
		clone.setXCG0013(getXCG0013());
		clone.setXCG0014(getXCG0014());
		clone.setXCG0015(getXCG0015());
		clone.setXCG0016(getXCG0016());
		clone.setXCG0017(getXCG0017());
		clone.setXCG0018(getXCG0018());
		clone.setXCG0019(getXCG0019());
		clone.setXCG0020(getXCG0020());
		clone.setXCG0021(getXCG0021());
		clone.setXCG1021(getXCG1021());
		clone.setXCG1121(getXCG1121());
		clone.setXCG0022(getXCG0022());
		clone.setXCG1022(getXCG1022());
		clone.setXCG1122(getXCG1122());
		clone.setXCG0023(getXCG0023());
		clone.setXCG1023(getXCG1023());
		clone.setXCG1123(getXCG1123());
		clone.setXCG0024(getXCG0024());
		clone.setXCG1024(getXCG1024());
		clone.setXCG1124(getXCG1124());
		clone.setXCG0025(getXCG0025());
		clone.setXCG1025(getXCG1025());
		clone.setXCG1125(getXCG1125());
		clone.setXCG0026(getXCG0026());
		clone.setXCG1026(getXCG1026());
		clone.setXCG1126(getXCG1126());
		clone.setXCG0027(getXCG0027());
		clone.setXCG1027(getXCG1027());
		clone.setXCG1127(getXCG1127());
		clone.setXCG0028(getXCG0028());
		clone.setXCG1028(getXCG1028());
		clone.setXCG1128(getXCG1128());
		clone.setXCG0029(getXCG0029());
		clone.setXCG1029(getXCG1029());
		clone.setXCG1129(getXCG1129());
		clone.setXCG0030(getXCG0030());
		clone.setXCG1030(getXCG1030());
		clone.setXCG1130(getXCG1130());
		clone.setXCG0031(getXCG0031());
		clone.setXCG1031(getXCG1031());
		clone.setXCG1131(getXCG1131());
		clone.setXCG0032(getXCG0032());
		clone.setXCG1032(getXCG1032());
		clone.setXCG1132(getXCG1132());
		clone.setXCG0033(getXCG0033());
		clone.setXCG1033(getXCG1033());
		clone.setXCG1133(getXCG1133());
		clone.setXCG0034(getXCG0034());
		clone.setXCG1034(getXCG1034());
		clone.setXCG1134(getXCG1134());
		clone.setXCG0035(getXCG0035());
		clone.setXCG1035(getXCG1035());
		clone.setXCG1135(getXCG1135());
		clone.setXCG0036(getXCG0036());
		clone.setXCG1036(getXCG1036());
		clone.setXCG1136(getXCG1136());
		clone.setXCG0037(getXCG0037());
		clone.setXCG1037(getXCG1037());
		clone.setXCG1137(getXCG1137());
		clone.setXCG0038(getXCG0038());
		clone.setXCG1038(getXCG1038());
		clone.setXCG1138(getXCG1138());
		clone.setXCG0039(getXCG0039());
		clone.setXCG1039(getXCG1039());
		clone.setXCG1139(getXCG1139());
		clone.setXCG0040(getXCG0040());
		clone.setXCG1040(getXCG1040());
		clone.setXCG1140(getXCG1140());
		clone.setXCG0041(getXCG0041());
		clone.setXCG1041(getXCG1041());
		clone.setXCG1141(getXCG1141());
		clone.setXCG0042(getXCG0042());
		clone.setXCG1042(getXCG1042());
		clone.setXCG1142(getXCG1142());
		clone.setXCG0043(getXCG0043());
		clone.setXCG1043(getXCG1043());
		clone.setXCG1143(getXCG1143());
		clone.setXCG0044(getXCG0044());
		clone.setXCG1044(getXCG1044());
		clone.setXCG1144(getXCG1144());
		clone.setXCG0045(getXCG0045());
		clone.setXCG0046(getXCG0046());
		clone.setXCG1047(getXCG1047());
		clone.setXCG0047(getXCG0047());
		clone.setXCG0048(getXCG0048());
		clone.setXCG0049(getXCG0049());
		clone.setXCG0050(getXCG0050());
		clone.setXCG0051(getXCG0051());
		clone.setXCG0052(getXCG0052());
		clone.setXCG0053(getXCG0053());
		clone.setXCG0054(getXCG0054());
		clone.setXCG1054(getXCG1054());
		clone.setXCG1154(getXCG1154());
		clone.setXCG1254(getXCG1254());
		clone.setXCG1354(getXCG1354());
		clone.setXCG1454(getXCG1454());
		clone.setXCG1554(getXCG1554());
		clone.setXCG1654(getXCG1654());
		clone.setXCG1754(getXCG1754());
		clone.setXCG0055(getXCG0055());
		clone.setXCG0056(getXCG0056());
		clone.setXCG0057(getXCG0057());
		clone.setXCG0058(getXCG0058());
		clone.setXCG0059(getXCG0059());
		clone.setXCG1059(getXCG1059());
		clone.setXCG0060(getXCG0060());
		clone.setXCG0061(getXCG0061());
		clone.setXCG0062(getXCG0062());
		clone.setXCG0063(getXCG0063());
		clone.setXCG0064(getXCG0064());
		clone.setXCG0065(getXCG0065());
		clone.setXCG0066(getXCG0066());
		clone.setXCG1066(getXCG1066());
		clone.setXCG0067(getXCG0067());
		clone.setXCG0068(getXCG0068());
		clone.setXCG0069(getXCG0069());
		clone.setXCG0070(getXCG0070());
		clone.setXCG0071(getXCG0071());
		clone.setXCG0072(getXCG0072());
		clone.setXCG1072(getXCG1072());
		clone.setXCG0073(getXCG0073());
		clone.setXCG0074(getXCG0074());
		clone.setXCG0075(getXCG0075());
		clone.setXCG0076(getXCG0076());
		clone.setXCG0077(getXCG0077());
		clone.setXCG1077(getXCG1077());
		clone.setXCG0078(getXCG0078());
		clone.setXCG1078(getXCG1078());
		clone.setXCG0079(getXCG0079());
		clone.setXCG0080(getXCG0080());
		clone.setXCG1080(getXCG1080());
		clone.setXCG0081(getXCG0081());
		clone.setXCG0082(getXCG0082());
		clone.setXCG0083(getXCG0083());
		clone.setXCG0084(getXCG0084());
		clone.setXCG0085(getXCG0085());
		clone.setXCG1085(getXCG1085());
		clone.setXCG0086(getXCG0086());
		clone.setXCG1086(getXCG1086());
		clone.setXCG0087(getXCG0087());
		clone.setXCG0088(getXCG0088());
		clone.setXCG1088(getXCG1088());
		clone.setXCG0089(getXCG0089());
		clone.setXCG0090(getXCG0090());
		clone.setXCG0091(getXCG0091());
		clone.setXCG0092(getXCG0092());
		clone.setXCG0093(getXCG0093());
		clone.setXCG0094(getXCG0094());
		clone.setXCG0095(getXCG0095());
		clone.setXCG0096(getXCG0096());
		clone.setXCG0097(getXCG0097());
		clone.setXCG1097(getXCG1097());
		clone.setXCG0098(getXCG0098());
		clone.setXCG0099(getXCG0099());
		clone.setXCG0100(getXCG0100());
		clone.setXCG0101(getXCG0101());
		clone.setXCG0102(getXCG0102());
		clone.setXCG0103(getXCG0103());
		clone.setXCG0104(getXCG0104());
		clone.setXCG0105(getXCG0105());
		clone.setXCG0106(getXCG0106());
		clone.setXCG0107(getXCG0107());
		clone.setXCG0108(getXCG0108());
		clone.setXCG0109(getXCG0109());
		clone.setXCG0110(getXCG0110());
		clone.setXCG0111(getXCG0111());
		clone.setXCG0112(getXCG0112());
		clone.setXCG0113(getXCG0113());
		clone.setXCG0114(getXCG0114());
		clone.setXCG0115(getXCG0115());
		clone.setXCG0116(getXCG0116());
		clone.setXCG0117(getXCG0117());
		clone.setXCG0118(getXCG0118());
		clone.setXCG0119(getXCG0119());
		clone.setXCG0120(getXCG0120());
		clone.setXCG0121(getXCG0121());
		clone.setXCG0122(getXCG0122());
		clone.setXCG0123(getXCG0123());
		clone.setXCG0124(getXCG0124());
		clone.setXCG0125(getXCG0125());
		clone.setXCG0126(getXCG0126());
		clone.setXCG0127(getXCG0127());
		clone.setXCG0128(getXCG0128());
		clone.setXCG0238(getXCG0238());
		clone.setXCG0239(getXCG0239());
		clone.setXCG0240(getXCG0240());
		clone.setXCG0241(getXCG0241());

		return clone;
	}

	@Override
	public int compareTo(THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi) {
		int value = 0;

		if (getId() < thongsochungchixecogioi.getId()) {
			value = -1;
		}
		else if (getId() > thongsochungchixecogioi.getId()) {
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

		if (!(obj instanceof THONGSOCHUNGCHIXECOGIOIClp)) {
			return false;
		}

		THONGSOCHUNGCHIXECOGIOIClp thongsochungchixecogioi = (THONGSOCHUNGCHIXECOGIOIClp)obj;

		long primaryKey = thongsochungchixecogioi.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(393);

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
		sb.append(", XCG0009=");
		sb.append(getXCG0009());
		sb.append(", XCG0010=");
		sb.append(getXCG0010());
		sb.append(", XCG0011=");
		sb.append(getXCG0011());
		sb.append(", XCG0012=");
		sb.append(getXCG0012());
		sb.append(", XCG0013=");
		sb.append(getXCG0013());
		sb.append(", XCG0014=");
		sb.append(getXCG0014());
		sb.append(", XCG0015=");
		sb.append(getXCG0015());
		sb.append(", XCG0016=");
		sb.append(getXCG0016());
		sb.append(", XCG0017=");
		sb.append(getXCG0017());
		sb.append(", XCG0018=");
		sb.append(getXCG0018());
		sb.append(", XCG0019=");
		sb.append(getXCG0019());
		sb.append(", XCG0020=");
		sb.append(getXCG0020());
		sb.append(", XCG0021=");
		sb.append(getXCG0021());
		sb.append(", XCG1021=");
		sb.append(getXCG1021());
		sb.append(", XCG1121=");
		sb.append(getXCG1121());
		sb.append(", XCG0022=");
		sb.append(getXCG0022());
		sb.append(", XCG1022=");
		sb.append(getXCG1022());
		sb.append(", XCG1122=");
		sb.append(getXCG1122());
		sb.append(", XCG0023=");
		sb.append(getXCG0023());
		sb.append(", XCG1023=");
		sb.append(getXCG1023());
		sb.append(", XCG1123=");
		sb.append(getXCG1123());
		sb.append(", XCG0024=");
		sb.append(getXCG0024());
		sb.append(", XCG1024=");
		sb.append(getXCG1024());
		sb.append(", XCG1124=");
		sb.append(getXCG1124());
		sb.append(", XCG0025=");
		sb.append(getXCG0025());
		sb.append(", XCG1025=");
		sb.append(getXCG1025());
		sb.append(", XCG1125=");
		sb.append(getXCG1125());
		sb.append(", XCG0026=");
		sb.append(getXCG0026());
		sb.append(", XCG1026=");
		sb.append(getXCG1026());
		sb.append(", XCG1126=");
		sb.append(getXCG1126());
		sb.append(", XCG0027=");
		sb.append(getXCG0027());
		sb.append(", XCG1027=");
		sb.append(getXCG1027());
		sb.append(", XCG1127=");
		sb.append(getXCG1127());
		sb.append(", XCG0028=");
		sb.append(getXCG0028());
		sb.append(", XCG1028=");
		sb.append(getXCG1028());
		sb.append(", XCG1128=");
		sb.append(getXCG1128());
		sb.append(", XCG0029=");
		sb.append(getXCG0029());
		sb.append(", XCG1029=");
		sb.append(getXCG1029());
		sb.append(", XCG1129=");
		sb.append(getXCG1129());
		sb.append(", XCG0030=");
		sb.append(getXCG0030());
		sb.append(", XCG1030=");
		sb.append(getXCG1030());
		sb.append(", XCG1130=");
		sb.append(getXCG1130());
		sb.append(", XCG0031=");
		sb.append(getXCG0031());
		sb.append(", XCG1031=");
		sb.append(getXCG1031());
		sb.append(", XCG1131=");
		sb.append(getXCG1131());
		sb.append(", XCG0032=");
		sb.append(getXCG0032());
		sb.append(", XCG1032=");
		sb.append(getXCG1032());
		sb.append(", XCG1132=");
		sb.append(getXCG1132());
		sb.append(", XCG0033=");
		sb.append(getXCG0033());
		sb.append(", XCG1033=");
		sb.append(getXCG1033());
		sb.append(", XCG1133=");
		sb.append(getXCG1133());
		sb.append(", XCG0034=");
		sb.append(getXCG0034());
		sb.append(", XCG1034=");
		sb.append(getXCG1034());
		sb.append(", XCG1134=");
		sb.append(getXCG1134());
		sb.append(", XCG0035=");
		sb.append(getXCG0035());
		sb.append(", XCG1035=");
		sb.append(getXCG1035());
		sb.append(", XCG1135=");
		sb.append(getXCG1135());
		sb.append(", XCG0036=");
		sb.append(getXCG0036());
		sb.append(", XCG1036=");
		sb.append(getXCG1036());
		sb.append(", XCG1136=");
		sb.append(getXCG1136());
		sb.append(", XCG0037=");
		sb.append(getXCG0037());
		sb.append(", XCG1037=");
		sb.append(getXCG1037());
		sb.append(", XCG1137=");
		sb.append(getXCG1137());
		sb.append(", XCG0038=");
		sb.append(getXCG0038());
		sb.append(", XCG1038=");
		sb.append(getXCG1038());
		sb.append(", XCG1138=");
		sb.append(getXCG1138());
		sb.append(", XCG0039=");
		sb.append(getXCG0039());
		sb.append(", XCG1039=");
		sb.append(getXCG1039());
		sb.append(", XCG1139=");
		sb.append(getXCG1139());
		sb.append(", XCG0040=");
		sb.append(getXCG0040());
		sb.append(", XCG1040=");
		sb.append(getXCG1040());
		sb.append(", XCG1140=");
		sb.append(getXCG1140());
		sb.append(", XCG0041=");
		sb.append(getXCG0041());
		sb.append(", XCG1041=");
		sb.append(getXCG1041());
		sb.append(", XCG1141=");
		sb.append(getXCG1141());
		sb.append(", XCG0042=");
		sb.append(getXCG0042());
		sb.append(", XCG1042=");
		sb.append(getXCG1042());
		sb.append(", XCG1142=");
		sb.append(getXCG1142());
		sb.append(", XCG0043=");
		sb.append(getXCG0043());
		sb.append(", XCG1043=");
		sb.append(getXCG1043());
		sb.append(", XCG1143=");
		sb.append(getXCG1143());
		sb.append(", XCG0044=");
		sb.append(getXCG0044());
		sb.append(", XCG1044=");
		sb.append(getXCG1044());
		sb.append(", XCG1144=");
		sb.append(getXCG1144());
		sb.append(", XCG0045=");
		sb.append(getXCG0045());
		sb.append(", XCG0046=");
		sb.append(getXCG0046());
		sb.append(", XCG1047=");
		sb.append(getXCG1047());
		sb.append(", XCG0047=");
		sb.append(getXCG0047());
		sb.append(", XCG0048=");
		sb.append(getXCG0048());
		sb.append(", XCG0049=");
		sb.append(getXCG0049());
		sb.append(", XCG0050=");
		sb.append(getXCG0050());
		sb.append(", XCG0051=");
		sb.append(getXCG0051());
		sb.append(", XCG0052=");
		sb.append(getXCG0052());
		sb.append(", XCG0053=");
		sb.append(getXCG0053());
		sb.append(", XCG0054=");
		sb.append(getXCG0054());
		sb.append(", XCG1054=");
		sb.append(getXCG1054());
		sb.append(", XCG1154=");
		sb.append(getXCG1154());
		sb.append(", XCG1254=");
		sb.append(getXCG1254());
		sb.append(", XCG1354=");
		sb.append(getXCG1354());
		sb.append(", XCG1454=");
		sb.append(getXCG1454());
		sb.append(", XCG1554=");
		sb.append(getXCG1554());
		sb.append(", XCG1654=");
		sb.append(getXCG1654());
		sb.append(", XCG1754=");
		sb.append(getXCG1754());
		sb.append(", XCG0055=");
		sb.append(getXCG0055());
		sb.append(", XCG0056=");
		sb.append(getXCG0056());
		sb.append(", XCG0057=");
		sb.append(getXCG0057());
		sb.append(", XCG0058=");
		sb.append(getXCG0058());
		sb.append(", XCG0059=");
		sb.append(getXCG0059());
		sb.append(", XCG1059=");
		sb.append(getXCG1059());
		sb.append(", XCG0060=");
		sb.append(getXCG0060());
		sb.append(", XCG0061=");
		sb.append(getXCG0061());
		sb.append(", XCG0062=");
		sb.append(getXCG0062());
		sb.append(", XCG0063=");
		sb.append(getXCG0063());
		sb.append(", XCG0064=");
		sb.append(getXCG0064());
		sb.append(", XCG0065=");
		sb.append(getXCG0065());
		sb.append(", XCG0066=");
		sb.append(getXCG0066());
		sb.append(", XCG1066=");
		sb.append(getXCG1066());
		sb.append(", XCG0067=");
		sb.append(getXCG0067());
		sb.append(", XCG0068=");
		sb.append(getXCG0068());
		sb.append(", XCG0069=");
		sb.append(getXCG0069());
		sb.append(", XCG0070=");
		sb.append(getXCG0070());
		sb.append(", XCG0071=");
		sb.append(getXCG0071());
		sb.append(", XCG0072=");
		sb.append(getXCG0072());
		sb.append(", XCG1072=");
		sb.append(getXCG1072());
		sb.append(", XCG0073=");
		sb.append(getXCG0073());
		sb.append(", XCG0074=");
		sb.append(getXCG0074());
		sb.append(", XCG0075=");
		sb.append(getXCG0075());
		sb.append(", XCG0076=");
		sb.append(getXCG0076());
		sb.append(", XCG0077=");
		sb.append(getXCG0077());
		sb.append(", XCG1077=");
		sb.append(getXCG1077());
		sb.append(", XCG0078=");
		sb.append(getXCG0078());
		sb.append(", XCG1078=");
		sb.append(getXCG1078());
		sb.append(", XCG0079=");
		sb.append(getXCG0079());
		sb.append(", XCG0080=");
		sb.append(getXCG0080());
		sb.append(", XCG1080=");
		sb.append(getXCG1080());
		sb.append(", XCG0081=");
		sb.append(getXCG0081());
		sb.append(", XCG0082=");
		sb.append(getXCG0082());
		sb.append(", XCG0083=");
		sb.append(getXCG0083());
		sb.append(", XCG0084=");
		sb.append(getXCG0084());
		sb.append(", XCG0085=");
		sb.append(getXCG0085());
		sb.append(", XCG1085=");
		sb.append(getXCG1085());
		sb.append(", XCG0086=");
		sb.append(getXCG0086());
		sb.append(", XCG1086=");
		sb.append(getXCG1086());
		sb.append(", XCG0087=");
		sb.append(getXCG0087());
		sb.append(", XCG0088=");
		sb.append(getXCG0088());
		sb.append(", XCG1088=");
		sb.append(getXCG1088());
		sb.append(", XCG0089=");
		sb.append(getXCG0089());
		sb.append(", XCG0090=");
		sb.append(getXCG0090());
		sb.append(", XCG0091=");
		sb.append(getXCG0091());
		sb.append(", XCG0092=");
		sb.append(getXCG0092());
		sb.append(", XCG0093=");
		sb.append(getXCG0093());
		sb.append(", XCG0094=");
		sb.append(getXCG0094());
		sb.append(", XCG0095=");
		sb.append(getXCG0095());
		sb.append(", XCG0096=");
		sb.append(getXCG0096());
		sb.append(", XCG0097=");
		sb.append(getXCG0097());
		sb.append(", XCG1097=");
		sb.append(getXCG1097());
		sb.append(", XCG0098=");
		sb.append(getXCG0098());
		sb.append(", XCG0099=");
		sb.append(getXCG0099());
		sb.append(", XCG0100=");
		sb.append(getXCG0100());
		sb.append(", XCG0101=");
		sb.append(getXCG0101());
		sb.append(", XCG0102=");
		sb.append(getXCG0102());
		sb.append(", XCG0103=");
		sb.append(getXCG0103());
		sb.append(", XCG0104=");
		sb.append(getXCG0104());
		sb.append(", XCG0105=");
		sb.append(getXCG0105());
		sb.append(", XCG0106=");
		sb.append(getXCG0106());
		sb.append(", XCG0107=");
		sb.append(getXCG0107());
		sb.append(", XCG0108=");
		sb.append(getXCG0108());
		sb.append(", XCG0109=");
		sb.append(getXCG0109());
		sb.append(", XCG0110=");
		sb.append(getXCG0110());
		sb.append(", XCG0111=");
		sb.append(getXCG0111());
		sb.append(", XCG0112=");
		sb.append(getXCG0112());
		sb.append(", XCG0113=");
		sb.append(getXCG0113());
		sb.append(", XCG0114=");
		sb.append(getXCG0114());
		sb.append(", XCG0115=");
		sb.append(getXCG0115());
		sb.append(", XCG0116=");
		sb.append(getXCG0116());
		sb.append(", XCG0117=");
		sb.append(getXCG0117());
		sb.append(", XCG0118=");
		sb.append(getXCG0118());
		sb.append(", XCG0119=");
		sb.append(getXCG0119());
		sb.append(", XCG0120=");
		sb.append(getXCG0120());
		sb.append(", XCG0121=");
		sb.append(getXCG0121());
		sb.append(", XCG0122=");
		sb.append(getXCG0122());
		sb.append(", XCG0123=");
		sb.append(getXCG0123());
		sb.append(", XCG0124=");
		sb.append(getXCG0124());
		sb.append(", XCG0125=");
		sb.append(getXCG0125());
		sb.append(", XCG0126=");
		sb.append(getXCG0126());
		sb.append(", XCG0127=");
		sb.append(getXCG0127());
		sb.append(", XCG0128=");
		sb.append(getXCG0128());
		sb.append(", XCG0238=");
		sb.append(getXCG0238());
		sb.append(", XCG0239=");
		sb.append(getXCG0239());
		sb.append(", XCG0240=");
		sb.append(getXCG0240());
		sb.append(", XCG0241=");
		sb.append(getXCG0241());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(592);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI");
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
			"<column><column-name>XCG0009</column-name><column-value><![CDATA[");
		sb.append(getXCG0009());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0010</column-name><column-value><![CDATA[");
		sb.append(getXCG0010());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0011</column-name><column-value><![CDATA[");
		sb.append(getXCG0011());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0012</column-name><column-value><![CDATA[");
		sb.append(getXCG0012());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0013</column-name><column-value><![CDATA[");
		sb.append(getXCG0013());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0014</column-name><column-value><![CDATA[");
		sb.append(getXCG0014());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0015</column-name><column-value><![CDATA[");
		sb.append(getXCG0015());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0016</column-name><column-value><![CDATA[");
		sb.append(getXCG0016());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0017</column-name><column-value><![CDATA[");
		sb.append(getXCG0017());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0018</column-name><column-value><![CDATA[");
		sb.append(getXCG0018());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0019</column-name><column-value><![CDATA[");
		sb.append(getXCG0019());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0020</column-name><column-value><![CDATA[");
		sb.append(getXCG0020());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0021</column-name><column-value><![CDATA[");
		sb.append(getXCG0021());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1021</column-name><column-value><![CDATA[");
		sb.append(getXCG1021());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1121</column-name><column-value><![CDATA[");
		sb.append(getXCG1121());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0022</column-name><column-value><![CDATA[");
		sb.append(getXCG0022());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1022</column-name><column-value><![CDATA[");
		sb.append(getXCG1022());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1122</column-name><column-value><![CDATA[");
		sb.append(getXCG1122());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0023</column-name><column-value><![CDATA[");
		sb.append(getXCG0023());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1023</column-name><column-value><![CDATA[");
		sb.append(getXCG1023());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1123</column-name><column-value><![CDATA[");
		sb.append(getXCG1123());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0024</column-name><column-value><![CDATA[");
		sb.append(getXCG0024());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1024</column-name><column-value><![CDATA[");
		sb.append(getXCG1024());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1124</column-name><column-value><![CDATA[");
		sb.append(getXCG1124());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0025</column-name><column-value><![CDATA[");
		sb.append(getXCG0025());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1025</column-name><column-value><![CDATA[");
		sb.append(getXCG1025());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1125</column-name><column-value><![CDATA[");
		sb.append(getXCG1125());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0026</column-name><column-value><![CDATA[");
		sb.append(getXCG0026());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1026</column-name><column-value><![CDATA[");
		sb.append(getXCG1026());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1126</column-name><column-value><![CDATA[");
		sb.append(getXCG1126());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0027</column-name><column-value><![CDATA[");
		sb.append(getXCG0027());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1027</column-name><column-value><![CDATA[");
		sb.append(getXCG1027());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1127</column-name><column-value><![CDATA[");
		sb.append(getXCG1127());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0028</column-name><column-value><![CDATA[");
		sb.append(getXCG0028());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1028</column-name><column-value><![CDATA[");
		sb.append(getXCG1028());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1128</column-name><column-value><![CDATA[");
		sb.append(getXCG1128());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0029</column-name><column-value><![CDATA[");
		sb.append(getXCG0029());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1029</column-name><column-value><![CDATA[");
		sb.append(getXCG1029());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1129</column-name><column-value><![CDATA[");
		sb.append(getXCG1129());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0030</column-name><column-value><![CDATA[");
		sb.append(getXCG0030());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1030</column-name><column-value><![CDATA[");
		sb.append(getXCG1030());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1130</column-name><column-value><![CDATA[");
		sb.append(getXCG1130());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0031</column-name><column-value><![CDATA[");
		sb.append(getXCG0031());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1031</column-name><column-value><![CDATA[");
		sb.append(getXCG1031());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1131</column-name><column-value><![CDATA[");
		sb.append(getXCG1131());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0032</column-name><column-value><![CDATA[");
		sb.append(getXCG0032());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1032</column-name><column-value><![CDATA[");
		sb.append(getXCG1032());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1132</column-name><column-value><![CDATA[");
		sb.append(getXCG1132());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0033</column-name><column-value><![CDATA[");
		sb.append(getXCG0033());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1033</column-name><column-value><![CDATA[");
		sb.append(getXCG1033());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1133</column-name><column-value><![CDATA[");
		sb.append(getXCG1133());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0034</column-name><column-value><![CDATA[");
		sb.append(getXCG0034());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1034</column-name><column-value><![CDATA[");
		sb.append(getXCG1034());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1134</column-name><column-value><![CDATA[");
		sb.append(getXCG1134());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0035</column-name><column-value><![CDATA[");
		sb.append(getXCG0035());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1035</column-name><column-value><![CDATA[");
		sb.append(getXCG1035());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1135</column-name><column-value><![CDATA[");
		sb.append(getXCG1135());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0036</column-name><column-value><![CDATA[");
		sb.append(getXCG0036());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1036</column-name><column-value><![CDATA[");
		sb.append(getXCG1036());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1136</column-name><column-value><![CDATA[");
		sb.append(getXCG1136());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0037</column-name><column-value><![CDATA[");
		sb.append(getXCG0037());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1037</column-name><column-value><![CDATA[");
		sb.append(getXCG1037());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1137</column-name><column-value><![CDATA[");
		sb.append(getXCG1137());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0038</column-name><column-value><![CDATA[");
		sb.append(getXCG0038());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1038</column-name><column-value><![CDATA[");
		sb.append(getXCG1038());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1138</column-name><column-value><![CDATA[");
		sb.append(getXCG1138());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0039</column-name><column-value><![CDATA[");
		sb.append(getXCG0039());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1039</column-name><column-value><![CDATA[");
		sb.append(getXCG1039());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1139</column-name><column-value><![CDATA[");
		sb.append(getXCG1139());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0040</column-name><column-value><![CDATA[");
		sb.append(getXCG0040());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1040</column-name><column-value><![CDATA[");
		sb.append(getXCG1040());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1140</column-name><column-value><![CDATA[");
		sb.append(getXCG1140());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0041</column-name><column-value><![CDATA[");
		sb.append(getXCG0041());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1041</column-name><column-value><![CDATA[");
		sb.append(getXCG1041());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1141</column-name><column-value><![CDATA[");
		sb.append(getXCG1141());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0042</column-name><column-value><![CDATA[");
		sb.append(getXCG0042());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1042</column-name><column-value><![CDATA[");
		sb.append(getXCG1042());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1142</column-name><column-value><![CDATA[");
		sb.append(getXCG1142());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0043</column-name><column-value><![CDATA[");
		sb.append(getXCG0043());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1043</column-name><column-value><![CDATA[");
		sb.append(getXCG1043());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1143</column-name><column-value><![CDATA[");
		sb.append(getXCG1143());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0044</column-name><column-value><![CDATA[");
		sb.append(getXCG0044());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1044</column-name><column-value><![CDATA[");
		sb.append(getXCG1044());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1144</column-name><column-value><![CDATA[");
		sb.append(getXCG1144());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0045</column-name><column-value><![CDATA[");
		sb.append(getXCG0045());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0046</column-name><column-value><![CDATA[");
		sb.append(getXCG0046());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1047</column-name><column-value><![CDATA[");
		sb.append(getXCG1047());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0047</column-name><column-value><![CDATA[");
		sb.append(getXCG0047());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0048</column-name><column-value><![CDATA[");
		sb.append(getXCG0048());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0049</column-name><column-value><![CDATA[");
		sb.append(getXCG0049());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0050</column-name><column-value><![CDATA[");
		sb.append(getXCG0050());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0051</column-name><column-value><![CDATA[");
		sb.append(getXCG0051());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0052</column-name><column-value><![CDATA[");
		sb.append(getXCG0052());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0053</column-name><column-value><![CDATA[");
		sb.append(getXCG0053());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0054</column-name><column-value><![CDATA[");
		sb.append(getXCG0054());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1054</column-name><column-value><![CDATA[");
		sb.append(getXCG1054());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1154</column-name><column-value><![CDATA[");
		sb.append(getXCG1154());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1254</column-name><column-value><![CDATA[");
		sb.append(getXCG1254());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1354</column-name><column-value><![CDATA[");
		sb.append(getXCG1354());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1454</column-name><column-value><![CDATA[");
		sb.append(getXCG1454());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1554</column-name><column-value><![CDATA[");
		sb.append(getXCG1554());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1654</column-name><column-value><![CDATA[");
		sb.append(getXCG1654());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1754</column-name><column-value><![CDATA[");
		sb.append(getXCG1754());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0055</column-name><column-value><![CDATA[");
		sb.append(getXCG0055());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0056</column-name><column-value><![CDATA[");
		sb.append(getXCG0056());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0057</column-name><column-value><![CDATA[");
		sb.append(getXCG0057());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0058</column-name><column-value><![CDATA[");
		sb.append(getXCG0058());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0059</column-name><column-value><![CDATA[");
		sb.append(getXCG0059());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1059</column-name><column-value><![CDATA[");
		sb.append(getXCG1059());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0060</column-name><column-value><![CDATA[");
		sb.append(getXCG0060());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0061</column-name><column-value><![CDATA[");
		sb.append(getXCG0061());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0062</column-name><column-value><![CDATA[");
		sb.append(getXCG0062());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0063</column-name><column-value><![CDATA[");
		sb.append(getXCG0063());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0064</column-name><column-value><![CDATA[");
		sb.append(getXCG0064());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0065</column-name><column-value><![CDATA[");
		sb.append(getXCG0065());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0066</column-name><column-value><![CDATA[");
		sb.append(getXCG0066());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1066</column-name><column-value><![CDATA[");
		sb.append(getXCG1066());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0067</column-name><column-value><![CDATA[");
		sb.append(getXCG0067());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0068</column-name><column-value><![CDATA[");
		sb.append(getXCG0068());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0069</column-name><column-value><![CDATA[");
		sb.append(getXCG0069());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0070</column-name><column-value><![CDATA[");
		sb.append(getXCG0070());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0071</column-name><column-value><![CDATA[");
		sb.append(getXCG0071());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0072</column-name><column-value><![CDATA[");
		sb.append(getXCG0072());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1072</column-name><column-value><![CDATA[");
		sb.append(getXCG1072());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0073</column-name><column-value><![CDATA[");
		sb.append(getXCG0073());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0074</column-name><column-value><![CDATA[");
		sb.append(getXCG0074());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0075</column-name><column-value><![CDATA[");
		sb.append(getXCG0075());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0076</column-name><column-value><![CDATA[");
		sb.append(getXCG0076());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0077</column-name><column-value><![CDATA[");
		sb.append(getXCG0077());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1077</column-name><column-value><![CDATA[");
		sb.append(getXCG1077());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0078</column-name><column-value><![CDATA[");
		sb.append(getXCG0078());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1078</column-name><column-value><![CDATA[");
		sb.append(getXCG1078());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0079</column-name><column-value><![CDATA[");
		sb.append(getXCG0079());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0080</column-name><column-value><![CDATA[");
		sb.append(getXCG0080());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1080</column-name><column-value><![CDATA[");
		sb.append(getXCG1080());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0081</column-name><column-value><![CDATA[");
		sb.append(getXCG0081());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0082</column-name><column-value><![CDATA[");
		sb.append(getXCG0082());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0083</column-name><column-value><![CDATA[");
		sb.append(getXCG0083());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0084</column-name><column-value><![CDATA[");
		sb.append(getXCG0084());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0085</column-name><column-value><![CDATA[");
		sb.append(getXCG0085());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1085</column-name><column-value><![CDATA[");
		sb.append(getXCG1085());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0086</column-name><column-value><![CDATA[");
		sb.append(getXCG0086());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1086</column-name><column-value><![CDATA[");
		sb.append(getXCG1086());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0087</column-name><column-value><![CDATA[");
		sb.append(getXCG0087());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0088</column-name><column-value><![CDATA[");
		sb.append(getXCG0088());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1088</column-name><column-value><![CDATA[");
		sb.append(getXCG1088());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0089</column-name><column-value><![CDATA[");
		sb.append(getXCG0089());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0090</column-name><column-value><![CDATA[");
		sb.append(getXCG0090());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0091</column-name><column-value><![CDATA[");
		sb.append(getXCG0091());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0092</column-name><column-value><![CDATA[");
		sb.append(getXCG0092());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0093</column-name><column-value><![CDATA[");
		sb.append(getXCG0093());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0094</column-name><column-value><![CDATA[");
		sb.append(getXCG0094());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0095</column-name><column-value><![CDATA[");
		sb.append(getXCG0095());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0096</column-name><column-value><![CDATA[");
		sb.append(getXCG0096());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0097</column-name><column-value><![CDATA[");
		sb.append(getXCG0097());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG1097</column-name><column-value><![CDATA[");
		sb.append(getXCG1097());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0098</column-name><column-value><![CDATA[");
		sb.append(getXCG0098());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0099</column-name><column-value><![CDATA[");
		sb.append(getXCG0099());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0100</column-name><column-value><![CDATA[");
		sb.append(getXCG0100());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0101</column-name><column-value><![CDATA[");
		sb.append(getXCG0101());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0102</column-name><column-value><![CDATA[");
		sb.append(getXCG0102());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0103</column-name><column-value><![CDATA[");
		sb.append(getXCG0103());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0104</column-name><column-value><![CDATA[");
		sb.append(getXCG0104());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0105</column-name><column-value><![CDATA[");
		sb.append(getXCG0105());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0106</column-name><column-value><![CDATA[");
		sb.append(getXCG0106());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0107</column-name><column-value><![CDATA[");
		sb.append(getXCG0107());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0108</column-name><column-value><![CDATA[");
		sb.append(getXCG0108());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0109</column-name><column-value><![CDATA[");
		sb.append(getXCG0109());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0110</column-name><column-value><![CDATA[");
		sb.append(getXCG0110());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0111</column-name><column-value><![CDATA[");
		sb.append(getXCG0111());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0112</column-name><column-value><![CDATA[");
		sb.append(getXCG0112());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0113</column-name><column-value><![CDATA[");
		sb.append(getXCG0113());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0114</column-name><column-value><![CDATA[");
		sb.append(getXCG0114());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0115</column-name><column-value><![CDATA[");
		sb.append(getXCG0115());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0116</column-name><column-value><![CDATA[");
		sb.append(getXCG0116());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0117</column-name><column-value><![CDATA[");
		sb.append(getXCG0117());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0118</column-name><column-value><![CDATA[");
		sb.append(getXCG0118());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0119</column-name><column-value><![CDATA[");
		sb.append(getXCG0119());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0120</column-name><column-value><![CDATA[");
		sb.append(getXCG0120());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0121</column-name><column-value><![CDATA[");
		sb.append(getXCG0121());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0122</column-name><column-value><![CDATA[");
		sb.append(getXCG0122());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0123</column-name><column-value><![CDATA[");
		sb.append(getXCG0123());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0124</column-name><column-value><![CDATA[");
		sb.append(getXCG0124());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0125</column-name><column-value><![CDATA[");
		sb.append(getXCG0125());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0126</column-name><column-value><![CDATA[");
		sb.append(getXCG0126());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0127</column-name><column-value><![CDATA[");
		sb.append(getXCG0127());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0128</column-name><column-value><![CDATA[");
		sb.append(getXCG0128());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0238</column-name><column-value><![CDATA[");
		sb.append(getXCG0238());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0239</column-name><column-value><![CDATA[");
		sb.append(getXCG0239());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0240</column-name><column-value><![CDATA[");
		sb.append(getXCG0240());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>XCG0241</column-name><column-value><![CDATA[");
		sb.append(getXCG0241());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _hoSoThuTucId;
	private long _certificateRecordId;
	private long _vehicleGroupId;
	private Date _SynchDate;
	private String _XCG0009;
	private String _XCG0010;
	private String _XCG0011;
	private String _XCG0012;
	private String _XCG0013;
	private String _XCG0014;
	private String _XCG0015;
	private String _XCG0016;
	private String _XCG0017;
	private String _XCG0018;
	private String _XCG0019;
	private String _XCG0020;
	private String _XCG0021;
	private String _XCG1021;
	private String _XCG1121;
	private String _XCG0022;
	private String _XCG1022;
	private String _XCG1122;
	private String _XCG0023;
	private String _XCG1023;
	private String _XCG1123;
	private String _XCG0024;
	private String _XCG1024;
	private String _XCG1124;
	private String _XCG0025;
	private String _XCG1025;
	private String _XCG1125;
	private String _XCG0026;
	private String _XCG1026;
	private String _XCG1126;
	private String _XCG0027;
	private String _XCG1027;
	private String _XCG1127;
	private String _XCG0028;
	private String _XCG1028;
	private String _XCG1128;
	private String _XCG0029;
	private String _XCG1029;
	private String _XCG1129;
	private String _XCG0030;
	private String _XCG1030;
	private String _XCG1130;
	private String _XCG0031;
	private String _XCG1031;
	private String _XCG1131;
	private String _XCG0032;
	private String _XCG1032;
	private String _XCG1132;
	private String _XCG0033;
	private String _XCG1033;
	private String _XCG1133;
	private String _XCG0034;
	private String _XCG1034;
	private String _XCG1134;
	private String _XCG0035;
	private String _XCG1035;
	private String _XCG1135;
	private String _XCG0036;
	private String _XCG1036;
	private String _XCG1136;
	private String _XCG0037;
	private String _XCG1037;
	private String _XCG1137;
	private String _XCG0038;
	private String _XCG1038;
	private String _XCG1138;
	private String _XCG0039;
	private String _XCG1039;
	private String _XCG1139;
	private String _XCG0040;
	private String _XCG1040;
	private String _XCG1140;
	private String _XCG0041;
	private String _XCG1041;
	private String _XCG1141;
	private String _XCG0042;
	private String _XCG1042;
	private String _XCG1142;
	private String _XCG0043;
	private String _XCG1043;
	private String _XCG1143;
	private String _XCG0044;
	private String _XCG1044;
	private String _XCG1144;
	private String _XCG0045;
	private String _XCG0046;
	private String _XCG1047;
	private String _XCG0047;
	private String _XCG0048;
	private String _XCG0049;
	private String _XCG0050;
	private String _XCG0051;
	private String _XCG0052;
	private String _XCG0053;
	private String _XCG0054;
	private String _XCG1054;
	private String _XCG1154;
	private String _XCG1254;
	private String _XCG1354;
	private String _XCG1454;
	private String _XCG1554;
	private String _XCG1654;
	private String _XCG1754;
	private String _XCG0055;
	private String _XCG0056;
	private String _XCG0057;
	private String _XCG0058;
	private String _XCG0059;
	private String _XCG1059;
	private String _XCG0060;
	private String _XCG0061;
	private String _XCG0062;
	private String _XCG0063;
	private String _XCG0064;
	private String _XCG0065;
	private String _XCG0066;
	private String _XCG1066;
	private String _XCG0067;
	private String _XCG0068;
	private String _XCG0069;
	private String _XCG0070;
	private String _XCG0071;
	private String _XCG0072;
	private String _XCG1072;
	private String _XCG0073;
	private String _XCG0074;
	private String _XCG0075;
	private String _XCG0076;
	private String _XCG0077;
	private String _XCG1077;
	private String _XCG0078;
	private String _XCG1078;
	private String _XCG0079;
	private String _XCG0080;
	private String _XCG1080;
	private String _XCG0081;
	private String _XCG0082;
	private String _XCG0083;
	private String _XCG0084;
	private String _XCG0085;
	private String _XCG1085;
	private String _XCG0086;
	private String _XCG1086;
	private String _XCG0087;
	private String _XCG0088;
	private String _XCG1088;
	private String _XCG0089;
	private String _XCG0090;
	private String _XCG0091;
	private String _XCG0092;
	private String _XCG0093;
	private String _XCG0094;
	private String _XCG0095;
	private String _XCG0096;
	private String _XCG0097;
	private String _XCG1097;
	private String _XCG0098;
	private String _XCG0099;
	private String _XCG0100;
	private String _XCG0101;
	private String _XCG0102;
	private String _XCG0103;
	private String _XCG0104;
	private String _XCG0105;
	private String _XCG0106;
	private String _XCG0107;
	private String _XCG0108;
	private String _XCG0109;
	private String _XCG0110;
	private String _XCG0111;
	private String _XCG0112;
	private String _XCG0113;
	private String _XCG0114;
	private String _XCG0115;
	private String _XCG0116;
	private String _XCG0117;
	private String _XCG0118;
	private String _XCG0119;
	private String _XCG0120;
	private String _XCG0121;
	private String _XCG0122;
	private String _XCG0123;
	private String _XCG0124;
	private String _XCG0125;
	private String _XCG0126;
	private String _XCG0127;
	private String _XCG0128;
	private String _XCG0238;
	private String _XCG0239;
	private String _XCG0240;
	private String _XCG0241;
	private BaseModel<?> _thongsochungchixecogioiRemoteModel;
}