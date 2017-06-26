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

import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CorporationTeam in entity cache.
 *
 * @author win_64
 * @see CorporationTeam
 * @generated
 */
public class CorporationTeamCacheModel implements CacheModel<CorporationTeam>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", corporationId=");
		sb.append(corporationId);
		sb.append(", teamName=");
		sb.append(teamName);
		sb.append(", markUpDelete=");
		sb.append(markUpDelete);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CorporationTeam toEntityModel() {
		CorporationTeamImpl corporationTeamImpl = new CorporationTeamImpl();

		corporationTeamImpl.setId(id);

		if (corporationId == null) {
			corporationTeamImpl.setCorporationId(StringPool.BLANK);
		}
		else {
			corporationTeamImpl.setCorporationId(corporationId);
		}

		if (teamName == null) {
			corporationTeamImpl.setTeamName(StringPool.BLANK);
		}
		else {
			corporationTeamImpl.setTeamName(teamName);
		}

		corporationTeamImpl.setMarkUpDelete(markUpDelete);

		corporationTeamImpl.resetOriginalValues();

		return corporationTeamImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		corporationId = objectInput.readUTF();
		teamName = objectInput.readUTF();
		markUpDelete = objectInput.readInt();
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

		if (teamName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(teamName);
		}

		objectOutput.writeInt(markUpDelete);
	}

	public long id;
	public String corporationId;
	public String teamName;
	public int markUpDelete;
}