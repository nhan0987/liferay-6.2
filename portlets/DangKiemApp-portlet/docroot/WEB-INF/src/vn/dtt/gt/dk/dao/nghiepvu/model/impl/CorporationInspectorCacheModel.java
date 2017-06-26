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

import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CorporationInspector in entity cache.
 *
 * @author win_64
 * @see CorporationInspector
 * @generated
 */
public class CorporationInspectorCacheModel implements CacheModel<CorporationInspector>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(id);
		sb.append(", corporationId=");
		sb.append(corporationId);
		sb.append(", inspectorid=");
		sb.append(inspectorid);
		sb.append(", inspectorName=");
		sb.append(inspectorName);
		sb.append(", inspectorPhone=");
		sb.append(inspectorPhone);
		sb.append(", inspectorEmail=");
		sb.append(inspectorEmail);
		sb.append(", contactcode=");
		sb.append(contactcode);
		sb.append(", regularTthc=");
		sb.append(regularTthc);
		sb.append(", searchVehicle=");
		sb.append(searchVehicle);
		sb.append(", teamId=");
		sb.append(teamId);
		sb.append(", markupTeamLeader=");
		sb.append(markupTeamLeader);
		sb.append(", markUpBoss=");
		sb.append(markUpBoss);
		sb.append(", place=");
		sb.append(place);
		sb.append(", title=");
		sb.append(title);
		sb.append(", filechukyId=");
		sb.append(filechukyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CorporationInspector toEntityModel() {
		CorporationInspectorImpl corporationInspectorImpl = new CorporationInspectorImpl();

		corporationInspectorImpl.setId(id);

		if (corporationId == null) {
			corporationInspectorImpl.setCorporationId(StringPool.BLANK);
		}
		else {
			corporationInspectorImpl.setCorporationId(corporationId);
		}

		corporationInspectorImpl.setInspectorid(inspectorid);

		if (inspectorName == null) {
			corporationInspectorImpl.setInspectorName(StringPool.BLANK);
		}
		else {
			corporationInspectorImpl.setInspectorName(inspectorName);
		}

		if (inspectorPhone == null) {
			corporationInspectorImpl.setInspectorPhone(StringPool.BLANK);
		}
		else {
			corporationInspectorImpl.setInspectorPhone(inspectorPhone);
		}

		if (inspectorEmail == null) {
			corporationInspectorImpl.setInspectorEmail(StringPool.BLANK);
		}
		else {
			corporationInspectorImpl.setInspectorEmail(inspectorEmail);
		}

		if (contactcode == null) {
			corporationInspectorImpl.setContactcode(StringPool.BLANK);
		}
		else {
			corporationInspectorImpl.setContactcode(contactcode);
		}

		corporationInspectorImpl.setRegularTthc(regularTthc);
		corporationInspectorImpl.setSearchVehicle(searchVehicle);
		corporationInspectorImpl.setTeamId(teamId);
		corporationInspectorImpl.setMarkupTeamLeader(markupTeamLeader);
		corporationInspectorImpl.setMarkUpBoss(markUpBoss);

		if (place == null) {
			corporationInspectorImpl.setPlace(StringPool.BLANK);
		}
		else {
			corporationInspectorImpl.setPlace(place);
		}

		if (title == null) {
			corporationInspectorImpl.setTitle(StringPool.BLANK);
		}
		else {
			corporationInspectorImpl.setTitle(title);
		}

		corporationInspectorImpl.setFilechukyId(filechukyId);

		corporationInspectorImpl.resetOriginalValues();

		return corporationInspectorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		corporationId = objectInput.readUTF();
		inspectorid = objectInput.readLong();
		inspectorName = objectInput.readUTF();
		inspectorPhone = objectInput.readUTF();
		inspectorEmail = objectInput.readUTF();
		contactcode = objectInput.readUTF();
		regularTthc = objectInput.readLong();
		searchVehicle = objectInput.readInt();
		teamId = objectInput.readLong();
		markupTeamLeader = objectInput.readInt();
		markUpBoss = objectInput.readInt();
		place = objectInput.readUTF();
		title = objectInput.readUTF();
		filechukyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (corporationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationId);
		}

		objectOutput.writeLong(inspectorid);

		if (inspectorName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorName);
		}

		if (inspectorPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorPhone);
		}

		if (inspectorEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorEmail);
		}

		if (contactcode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactcode);
		}

		objectOutput.writeLong(regularTthc);
		objectOutput.writeInt(searchVehicle);
		objectOutput.writeLong(teamId);
		objectOutput.writeInt(markupTeamLeader);
		objectOutput.writeInt(markUpBoss);

		if (place == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(place);
		}

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		objectOutput.writeLong(filechukyId);
	}

	public long id;
	public String corporationId;
	public long inspectorid;
	public String inspectorName;
	public String inspectorPhone;
	public String inspectorEmail;
	public String contactcode;
	public long regularTthc;
	public int searchVehicle;
	public long teamId;
	public int markupTeamLeader;
	public int markUpBoss;
	public String place;
	public String title;
	public long filechukyId;
}