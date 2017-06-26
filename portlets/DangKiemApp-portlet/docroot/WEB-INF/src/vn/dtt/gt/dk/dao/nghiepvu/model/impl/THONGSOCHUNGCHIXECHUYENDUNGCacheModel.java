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

package vn.dtt.gt.dk.dao.nghiepvu.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing THONGSOCHUNGCHIXECHUYENDUNG in entity cache.
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXECHUYENDUNG
 * @generated
 */
public class THONGSOCHUNGCHIXECHUYENDUNGCacheModel implements CacheModel<THONGSOCHUNGCHIXECHUYENDUNG>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(119);

		sb.append("{id=");
		sb.append(id);
		sb.append(", hoSoThuTucId=");
		sb.append(hoSoThuTucId);
		sb.append(", certificateRecordId=");
		sb.append(certificateRecordId);
		sb.append(", vehicleGroupId=");
		sb.append(vehicleGroupId);
		sb.append(", SynchDate=");
		sb.append(SynchDate);
		sb.append(", XCD0009=");
		sb.append(XCD0009);
		sb.append(", XCD0010=");
		sb.append(XCD0010);
		sb.append(", XCD0011=");
		sb.append(XCD0011);
		sb.append(", XCD0012=");
		sb.append(XCD0012);
		sb.append(", XCD0013=");
		sb.append(XCD0013);
		sb.append(", XCD0014=");
		sb.append(XCD0014);
		sb.append(", XCD0015=");
		sb.append(XCD0015);
		sb.append(", XCD0016=");
		sb.append(XCD0016);
		sb.append(", XCD0017=");
		sb.append(XCD0017);
		sb.append(", XCD1017=");
		sb.append(XCD1017);
		sb.append(", XCD0018=");
		sb.append(XCD0018);
		sb.append(", XCD0019=");
		sb.append(XCD0019);
		sb.append(", XCD0020=");
		sb.append(XCD0020);
		sb.append(", XCD0021=");
		sb.append(XCD0021);
		sb.append(", XCD0022=");
		sb.append(XCD0022);
		sb.append(", XCD0023=");
		sb.append(XCD0023);
		sb.append(", XCD1023=");
		sb.append(XCD1023);
		sb.append(", XCD0024=");
		sb.append(XCD0024);
		sb.append(", XCDCODE001=");
		sb.append(XCDCODE001);
		sb.append(", XCDNAME001=");
		sb.append(XCDNAME001);
		sb.append(", XCDVALU001=");
		sb.append(XCDVALU001);
		sb.append(", XCDCODE002=");
		sb.append(XCDCODE002);
		sb.append(", XCDNAME002=");
		sb.append(XCDNAME002);
		sb.append(", XCDVALU002=");
		sb.append(XCDVALU002);
		sb.append(", XCDCODE003=");
		sb.append(XCDCODE003);
		sb.append(", XCDNAME003=");
		sb.append(XCDNAME003);
		sb.append(", XCDVALU003=");
		sb.append(XCDVALU003);
		sb.append(", XCDCODE004=");
		sb.append(XCDCODE004);
		sb.append(", XCDNAME004=");
		sb.append(XCDNAME004);
		sb.append(", XCDVALU004=");
		sb.append(XCDVALU004);
		sb.append(", XCDCODE005=");
		sb.append(XCDCODE005);
		sb.append(", XCDNAME005=");
		sb.append(XCDNAME005);
		sb.append(", XCDVALU005=");
		sb.append(XCDVALU005);
		sb.append(", XCDCODE006=");
		sb.append(XCDCODE006);
		sb.append(", XCDNAME006=");
		sb.append(XCDNAME006);
		sb.append(", XCDVALU006=");
		sb.append(XCDVALU006);
		sb.append(", XCDCODE007=");
		sb.append(XCDCODE007);
		sb.append(", XCDNAME007=");
		sb.append(XCDNAME007);
		sb.append(", XCDVALU007=");
		sb.append(XCDVALU007);
		sb.append(", XCDCODE008=");
		sb.append(XCDCODE008);
		sb.append(", XCDNAME008=");
		sb.append(XCDNAME008);
		sb.append(", XCDVALU008=");
		sb.append(XCDVALU008);
		sb.append(", XCDCODE009=");
		sb.append(XCDCODE009);
		sb.append(", XCDNAME009=");
		sb.append(XCDNAME009);
		sb.append(", XCDVALU009=");
		sb.append(XCDVALU009);
		sb.append(", XCDCODE010=");
		sb.append(XCDCODE010);
		sb.append(", XCDNAME010=");
		sb.append(XCDNAME010);
		sb.append(", XCDVALU010=");
		sb.append(XCDVALU010);
		sb.append(", XCDCODE011=");
		sb.append(XCDCODE011);
		sb.append(", XCDNAME011=");
		sb.append(XCDNAME011);
		sb.append(", XCDVALU011=");
		sb.append(XCDVALU011);
		sb.append(", XCDCODE012=");
		sb.append(XCDCODE012);
		sb.append(", XCDNAME012=");
		sb.append(XCDNAME012);
		sb.append(", XCDVALU012=");
		sb.append(XCDVALU012);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG toEntityModel() {
		THONGSOCHUNGCHIXECHUYENDUNGImpl thongsochungchixechuyendungImpl = new THONGSOCHUNGCHIXECHUYENDUNGImpl();

		thongsochungchixechuyendungImpl.setId(id);
		thongsochungchixechuyendungImpl.setHoSoThuTucId(hoSoThuTucId);
		thongsochungchixechuyendungImpl.setCertificateRecordId(certificateRecordId);
		thongsochungchixechuyendungImpl.setVehicleGroupId(vehicleGroupId);

		if (SynchDate == Long.MIN_VALUE) {
			thongsochungchixechuyendungImpl.setSynchDate(null);
		}
		else {
			thongsochungchixechuyendungImpl.setSynchDate(new Date(SynchDate));
		}

		if (XCD0009 == null) {
			thongsochungchixechuyendungImpl.setXCD0009(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCD0009(XCD0009);
		}

		if (XCD0010 == null) {
			thongsochungchixechuyendungImpl.setXCD0010(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCD0010(XCD0010);
		}

		if (XCD0011 == null) {
			thongsochungchixechuyendungImpl.setXCD0011(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCD0011(XCD0011);
		}

		if (XCD0012 == null) {
			thongsochungchixechuyendungImpl.setXCD0012(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCD0012(XCD0012);
		}

		if (XCD0013 == null) {
			thongsochungchixechuyendungImpl.setXCD0013(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCD0013(XCD0013);
		}

		if (XCD0014 == null) {
			thongsochungchixechuyendungImpl.setXCD0014(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCD0014(XCD0014);
		}

		if (XCD0015 == null) {
			thongsochungchixechuyendungImpl.setXCD0015(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCD0015(XCD0015);
		}

		if (XCD0016 == null) {
			thongsochungchixechuyendungImpl.setXCD0016(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCD0016(XCD0016);
		}

		if (XCD0017 == null) {
			thongsochungchixechuyendungImpl.setXCD0017(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCD0017(XCD0017);
		}

		if (XCD1017 == null) {
			thongsochungchixechuyendungImpl.setXCD1017(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCD1017(XCD1017);
		}

		if (XCD0018 == null) {
			thongsochungchixechuyendungImpl.setXCD0018(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCD0018(XCD0018);
		}

		if (XCD0019 == null) {
			thongsochungchixechuyendungImpl.setXCD0019(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCD0019(XCD0019);
		}

		if (XCD0020 == null) {
			thongsochungchixechuyendungImpl.setXCD0020(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCD0020(XCD0020);
		}

		if (XCD0021 == null) {
			thongsochungchixechuyendungImpl.setXCD0021(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCD0021(XCD0021);
		}

		if (XCD0022 == null) {
			thongsochungchixechuyendungImpl.setXCD0022(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCD0022(XCD0022);
		}

		if (XCD0023 == null) {
			thongsochungchixechuyendungImpl.setXCD0023(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCD0023(XCD0023);
		}

		if (XCD1023 == null) {
			thongsochungchixechuyendungImpl.setXCD1023(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCD1023(XCD1023);
		}

		if (XCD0024 == null) {
			thongsochungchixechuyendungImpl.setXCD0024(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCD0024(XCD0024);
		}

		if (XCDCODE001 == null) {
			thongsochungchixechuyendungImpl.setXCDCODE001(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDCODE001(XCDCODE001);
		}

		if (XCDNAME001 == null) {
			thongsochungchixechuyendungImpl.setXCDNAME001(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDNAME001(XCDNAME001);
		}

		if (XCDVALU001 == null) {
			thongsochungchixechuyendungImpl.setXCDVALU001(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDVALU001(XCDVALU001);
		}

		if (XCDCODE002 == null) {
			thongsochungchixechuyendungImpl.setXCDCODE002(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDCODE002(XCDCODE002);
		}

		if (XCDNAME002 == null) {
			thongsochungchixechuyendungImpl.setXCDNAME002(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDNAME002(XCDNAME002);
		}

		if (XCDVALU002 == null) {
			thongsochungchixechuyendungImpl.setXCDVALU002(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDVALU002(XCDVALU002);
		}

		if (XCDCODE003 == null) {
			thongsochungchixechuyendungImpl.setXCDCODE003(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDCODE003(XCDCODE003);
		}

		if (XCDNAME003 == null) {
			thongsochungchixechuyendungImpl.setXCDNAME003(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDNAME003(XCDNAME003);
		}

		if (XCDVALU003 == null) {
			thongsochungchixechuyendungImpl.setXCDVALU003(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDVALU003(XCDVALU003);
		}

		if (XCDCODE004 == null) {
			thongsochungchixechuyendungImpl.setXCDCODE004(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDCODE004(XCDCODE004);
		}

		if (XCDNAME004 == null) {
			thongsochungchixechuyendungImpl.setXCDNAME004(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDNAME004(XCDNAME004);
		}

		if (XCDVALU004 == null) {
			thongsochungchixechuyendungImpl.setXCDVALU004(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDVALU004(XCDVALU004);
		}

		if (XCDCODE005 == null) {
			thongsochungchixechuyendungImpl.setXCDCODE005(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDCODE005(XCDCODE005);
		}

		if (XCDNAME005 == null) {
			thongsochungchixechuyendungImpl.setXCDNAME005(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDNAME005(XCDNAME005);
		}

		if (XCDVALU005 == null) {
			thongsochungchixechuyendungImpl.setXCDVALU005(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDVALU005(XCDVALU005);
		}

		if (XCDCODE006 == null) {
			thongsochungchixechuyendungImpl.setXCDCODE006(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDCODE006(XCDCODE006);
		}

		if (XCDNAME006 == null) {
			thongsochungchixechuyendungImpl.setXCDNAME006(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDNAME006(XCDNAME006);
		}

		if (XCDVALU006 == null) {
			thongsochungchixechuyendungImpl.setXCDVALU006(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDVALU006(XCDVALU006);
		}

		if (XCDCODE007 == null) {
			thongsochungchixechuyendungImpl.setXCDCODE007(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDCODE007(XCDCODE007);
		}

		if (XCDNAME007 == null) {
			thongsochungchixechuyendungImpl.setXCDNAME007(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDNAME007(XCDNAME007);
		}

		if (XCDVALU007 == null) {
			thongsochungchixechuyendungImpl.setXCDVALU007(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDVALU007(XCDVALU007);
		}

		if (XCDCODE008 == null) {
			thongsochungchixechuyendungImpl.setXCDCODE008(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDCODE008(XCDCODE008);
		}

		if (XCDNAME008 == null) {
			thongsochungchixechuyendungImpl.setXCDNAME008(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDNAME008(XCDNAME008);
		}

		if (XCDVALU008 == null) {
			thongsochungchixechuyendungImpl.setXCDVALU008(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDVALU008(XCDVALU008);
		}

		if (XCDCODE009 == null) {
			thongsochungchixechuyendungImpl.setXCDCODE009(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDCODE009(XCDCODE009);
		}

		if (XCDNAME009 == null) {
			thongsochungchixechuyendungImpl.setXCDNAME009(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDNAME009(XCDNAME009);
		}

		if (XCDVALU009 == null) {
			thongsochungchixechuyendungImpl.setXCDVALU009(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDVALU009(XCDVALU009);
		}

		if (XCDCODE010 == null) {
			thongsochungchixechuyendungImpl.setXCDCODE010(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDCODE010(XCDCODE010);
		}

		if (XCDNAME010 == null) {
			thongsochungchixechuyendungImpl.setXCDNAME010(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDNAME010(XCDNAME010);
		}

		if (XCDVALU010 == null) {
			thongsochungchixechuyendungImpl.setXCDVALU010(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDVALU010(XCDVALU010);
		}

		if (XCDCODE011 == null) {
			thongsochungchixechuyendungImpl.setXCDCODE011(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDCODE011(XCDCODE011);
		}

		if (XCDNAME011 == null) {
			thongsochungchixechuyendungImpl.setXCDNAME011(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDNAME011(XCDNAME011);
		}

		if (XCDVALU011 == null) {
			thongsochungchixechuyendungImpl.setXCDVALU011(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDVALU011(XCDVALU011);
		}

		if (XCDCODE012 == null) {
			thongsochungchixechuyendungImpl.setXCDCODE012(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDCODE012(XCDCODE012);
		}

		if (XCDNAME012 == null) {
			thongsochungchixechuyendungImpl.setXCDNAME012(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDNAME012(XCDNAME012);
		}

		if (XCDVALU012 == null) {
			thongsochungchixechuyendungImpl.setXCDVALU012(StringPool.BLANK);
		}
		else {
			thongsochungchixechuyendungImpl.setXCDVALU012(XCDVALU012);
		}

		thongsochungchixechuyendungImpl.resetOriginalValues();

		return thongsochungchixechuyendungImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		hoSoThuTucId = objectInput.readLong();
		certificateRecordId = objectInput.readLong();
		vehicleGroupId = objectInput.readLong();
		SynchDate = objectInput.readLong();
		XCD0009 = objectInput.readUTF();
		XCD0010 = objectInput.readUTF();
		XCD0011 = objectInput.readUTF();
		XCD0012 = objectInput.readUTF();
		XCD0013 = objectInput.readUTF();
		XCD0014 = objectInput.readUTF();
		XCD0015 = objectInput.readUTF();
		XCD0016 = objectInput.readUTF();
		XCD0017 = objectInput.readUTF();
		XCD1017 = objectInput.readUTF();
		XCD0018 = objectInput.readUTF();
		XCD0019 = objectInput.readUTF();
		XCD0020 = objectInput.readUTF();
		XCD0021 = objectInput.readUTF();
		XCD0022 = objectInput.readUTF();
		XCD0023 = objectInput.readUTF();
		XCD1023 = objectInput.readUTF();
		XCD0024 = objectInput.readUTF();
		XCDCODE001 = objectInput.readUTF();
		XCDNAME001 = objectInput.readUTF();
		XCDVALU001 = objectInput.readUTF();
		XCDCODE002 = objectInput.readUTF();
		XCDNAME002 = objectInput.readUTF();
		XCDVALU002 = objectInput.readUTF();
		XCDCODE003 = objectInput.readUTF();
		XCDNAME003 = objectInput.readUTF();
		XCDVALU003 = objectInput.readUTF();
		XCDCODE004 = objectInput.readUTF();
		XCDNAME004 = objectInput.readUTF();
		XCDVALU004 = objectInput.readUTF();
		XCDCODE005 = objectInput.readUTF();
		XCDNAME005 = objectInput.readUTF();
		XCDVALU005 = objectInput.readUTF();
		XCDCODE006 = objectInput.readUTF();
		XCDNAME006 = objectInput.readUTF();
		XCDVALU006 = objectInput.readUTF();
		XCDCODE007 = objectInput.readUTF();
		XCDNAME007 = objectInput.readUTF();
		XCDVALU007 = objectInput.readUTF();
		XCDCODE008 = objectInput.readUTF();
		XCDNAME008 = objectInput.readUTF();
		XCDVALU008 = objectInput.readUTF();
		XCDCODE009 = objectInput.readUTF();
		XCDNAME009 = objectInput.readUTF();
		XCDVALU009 = objectInput.readUTF();
		XCDCODE010 = objectInput.readUTF();
		XCDNAME010 = objectInput.readUTF();
		XCDVALU010 = objectInput.readUTF();
		XCDCODE011 = objectInput.readUTF();
		XCDNAME011 = objectInput.readUTF();
		XCDVALU011 = objectInput.readUTF();
		XCDCODE012 = objectInput.readUTF();
		XCDNAME012 = objectInput.readUTF();
		XCDVALU012 = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(hoSoThuTucId);
		objectOutput.writeLong(certificateRecordId);
		objectOutput.writeLong(vehicleGroupId);
		objectOutput.writeLong(SynchDate);

		if (XCD0009 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCD0009);
		}

		if (XCD0010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCD0010);
		}

		if (XCD0011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCD0011);
		}

		if (XCD0012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCD0012);
		}

		if (XCD0013 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCD0013);
		}

		if (XCD0014 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCD0014);
		}

		if (XCD0015 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCD0015);
		}

		if (XCD0016 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCD0016);
		}

		if (XCD0017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCD0017);
		}

		if (XCD1017 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCD1017);
		}

		if (XCD0018 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCD0018);
		}

		if (XCD0019 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCD0019);
		}

		if (XCD0020 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCD0020);
		}

		if (XCD0021 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCD0021);
		}

		if (XCD0022 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCD0022);
		}

		if (XCD0023 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCD0023);
		}

		if (XCD1023 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCD1023);
		}

		if (XCD0024 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCD0024);
		}

		if (XCDCODE001 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDCODE001);
		}

		if (XCDNAME001 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDNAME001);
		}

		if (XCDVALU001 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDVALU001);
		}

		if (XCDCODE002 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDCODE002);
		}

		if (XCDNAME002 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDNAME002);
		}

		if (XCDVALU002 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDVALU002);
		}

		if (XCDCODE003 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDCODE003);
		}

		if (XCDNAME003 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDNAME003);
		}

		if (XCDVALU003 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDVALU003);
		}

		if (XCDCODE004 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDCODE004);
		}

		if (XCDNAME004 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDNAME004);
		}

		if (XCDVALU004 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDVALU004);
		}

		if (XCDCODE005 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDCODE005);
		}

		if (XCDNAME005 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDNAME005);
		}

		if (XCDVALU005 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDVALU005);
		}

		if (XCDCODE006 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDCODE006);
		}

		if (XCDNAME006 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDNAME006);
		}

		if (XCDVALU006 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDVALU006);
		}

		if (XCDCODE007 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDCODE007);
		}

		if (XCDNAME007 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDNAME007);
		}

		if (XCDVALU007 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDVALU007);
		}

		if (XCDCODE008 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDCODE008);
		}

		if (XCDNAME008 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDNAME008);
		}

		if (XCDVALU008 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDVALU008);
		}

		if (XCDCODE009 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDCODE009);
		}

		if (XCDNAME009 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDNAME009);
		}

		if (XCDVALU009 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDVALU009);
		}

		if (XCDCODE010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDCODE010);
		}

		if (XCDNAME010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDNAME010);
		}

		if (XCDVALU010 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDVALU010);
		}

		if (XCDCODE011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDCODE011);
		}

		if (XCDNAME011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDNAME011);
		}

		if (XCDVALU011 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDVALU011);
		}

		if (XCDCODE012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDCODE012);
		}

		if (XCDNAME012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDNAME012);
		}

		if (XCDVALU012 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(XCDVALU012);
		}
	}

	public long id;
	public long hoSoThuTucId;
	public long certificateRecordId;
	public long vehicleGroupId;
	public long SynchDate;
	public String XCD0009;
	public String XCD0010;
	public String XCD0011;
	public String XCD0012;
	public String XCD0013;
	public String XCD0014;
	public String XCD0015;
	public String XCD0016;
	public String XCD0017;
	public String XCD1017;
	public String XCD0018;
	public String XCD0019;
	public String XCD0020;
	public String XCD0021;
	public String XCD0022;
	public String XCD0023;
	public String XCD1023;
	public String XCD0024;
	public String XCDCODE001;
	public String XCDNAME001;
	public String XCDVALU001;
	public String XCDCODE002;
	public String XCDNAME002;
	public String XCDVALU002;
	public String XCDCODE003;
	public String XCDNAME003;
	public String XCDVALU003;
	public String XCDCODE004;
	public String XCDNAME004;
	public String XCDVALU004;
	public String XCDCODE005;
	public String XCDNAME005;
	public String XCDVALU005;
	public String XCDCODE006;
	public String XCDNAME006;
	public String XCDVALU006;
	public String XCDCODE007;
	public String XCDNAME007;
	public String XCDVALU007;
	public String XCDCODE008;
	public String XCDNAME008;
	public String XCDVALU008;
	public String XCDCODE009;
	public String XCDNAME009;
	public String XCDVALU009;
	public String XCDCODE010;
	public String XCDNAME010;
	public String XCDVALU010;
	public String XCDCODE011;
	public String XCDNAME011;
	public String XCDVALU011;
	public String XCDCODE012;
	public String XCDNAME012;
	public String XCDVALU012;
}