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

import vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ActionLog in entity cache.
 *
 * @author win_64
 * @see ActionLog
 * @generated
 */
public class ActionLogCacheModel implements CacheModel<ActionLog>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(id);
		sb.append(", hosothutucid=");
		sb.append(hosothutucid);
		sb.append(", masohoso=");
		sb.append(masohoso);
		sb.append(", mabiennhan=");
		sb.append(mabiennhan);
		sb.append(", ngayxemhoso=");
		sb.append(ngayxemhoso);
		sb.append(", noidungmanhinh=");
		sb.append(noidungmanhinh);
		sb.append(", importername=");
		sb.append(importername);
		sb.append(", corporationid=");
		sb.append(corporationid);
		sb.append(", inspectorid=");
		sb.append(inspectorid);
		sb.append(", inspectorname=");
		sb.append(inspectorname);
		sb.append(", inspectorphone=");
		sb.append(inspectorphone);
		sb.append(", inspectoremail=");
		sb.append(inspectoremail);
		sb.append(", title=");
		sb.append(title);
		sb.append(", contactcode=");
		sb.append(contactcode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ActionLog toEntityModel() {
		ActionLogImpl actionLogImpl = new ActionLogImpl();

		actionLogImpl.setId(id);
		actionLogImpl.setHosothutucid(hosothutucid);

		if (masohoso == null) {
			actionLogImpl.setMasohoso(StringPool.BLANK);
		}
		else {
			actionLogImpl.setMasohoso(masohoso);
		}

		if (mabiennhan == null) {
			actionLogImpl.setMabiennhan(StringPool.BLANK);
		}
		else {
			actionLogImpl.setMabiennhan(mabiennhan);
		}

		if (ngayxemhoso == Long.MIN_VALUE) {
			actionLogImpl.setNgayxemhoso(null);
		}
		else {
			actionLogImpl.setNgayxemhoso(new Date(ngayxemhoso));
		}

		if (noidungmanhinh == null) {
			actionLogImpl.setNoidungmanhinh(StringPool.BLANK);
		}
		else {
			actionLogImpl.setNoidungmanhinh(noidungmanhinh);
		}

		if (importername == null) {
			actionLogImpl.setImportername(StringPool.BLANK);
		}
		else {
			actionLogImpl.setImportername(importername);
		}

		if (corporationid == null) {
			actionLogImpl.setCorporationid(StringPool.BLANK);
		}
		else {
			actionLogImpl.setCorporationid(corporationid);
		}

		actionLogImpl.setInspectorid(inspectorid);

		if (inspectorname == null) {
			actionLogImpl.setInspectorname(StringPool.BLANK);
		}
		else {
			actionLogImpl.setInspectorname(inspectorname);
		}

		if (inspectorphone == null) {
			actionLogImpl.setInspectorphone(StringPool.BLANK);
		}
		else {
			actionLogImpl.setInspectorphone(inspectorphone);
		}

		if (inspectoremail == null) {
			actionLogImpl.setInspectoremail(StringPool.BLANK);
		}
		else {
			actionLogImpl.setInspectoremail(inspectoremail);
		}

		if (title == null) {
			actionLogImpl.setTitle(StringPool.BLANK);
		}
		else {
			actionLogImpl.setTitle(title);
		}

		if (contactcode == null) {
			actionLogImpl.setContactcode(StringPool.BLANK);
		}
		else {
			actionLogImpl.setContactcode(contactcode);
		}

		actionLogImpl.resetOriginalValues();

		return actionLogImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		hosothutucid = objectInput.readLong();
		masohoso = objectInput.readUTF();
		mabiennhan = objectInput.readUTF();
		ngayxemhoso = objectInput.readLong();
		noidungmanhinh = objectInput.readUTF();
		importername = objectInput.readUTF();
		corporationid = objectInput.readUTF();
		inspectorid = objectInput.readLong();
		inspectorname = objectInput.readUTF();
		inspectorphone = objectInput.readUTF();
		inspectoremail = objectInput.readUTF();
		title = objectInput.readUTF();
		contactcode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(hosothutucid);

		if (masohoso == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(masohoso);
		}

		if (mabiennhan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mabiennhan);
		}

		objectOutput.writeLong(ngayxemhoso);

		if (noidungmanhinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(noidungmanhinh);
		}

		if (importername == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importername);
		}

		if (corporationid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationid);
		}

		objectOutput.writeLong(inspectorid);

		if (inspectorname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorname);
		}

		if (inspectorphone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorphone);
		}

		if (inspectoremail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectoremail);
		}

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (contactcode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactcode);
		}
	}

	public long id;
	public long hosothutucid;
	public String masohoso;
	public String mabiennhan;
	public long ngayxemhoso;
	public String noidungmanhinh;
	public String importername;
	public String corporationid;
	public long inspectorid;
	public String inspectorname;
	public String inspectorphone;
	public String inspectoremail;
	public String title;
	public String contactcode;
}