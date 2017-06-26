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

package vn.dtt.gt.dk.dao.common.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.gt.dk.dao.common.model.TthcCoQuanQltt;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TthcCoQuanQltt in entity cache.
 *
 * @author win_64
 * @see TthcCoQuanQltt
 * @generated
 */
public class TthcCoQuanQlttCacheModel implements CacheModel<TthcCoQuanQltt>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", TenCoQuanQltt=");
		sb.append(TenCoQuanQltt);
		sb.append(", TenTiengAnh=");
		sb.append(TenTiengAnh);
		sb.append(", IdCha=");
		sb.append(IdCha);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TthcCoQuanQltt toEntityModel() {
		TthcCoQuanQlttImpl tthcCoQuanQlttImpl = new TthcCoQuanQlttImpl();

		tthcCoQuanQlttImpl.setId(Id);

		if (TenCoQuanQltt == null) {
			tthcCoQuanQlttImpl.setTenCoQuanQltt(StringPool.BLANK);
		}
		else {
			tthcCoQuanQlttImpl.setTenCoQuanQltt(TenCoQuanQltt);
		}

		if (TenTiengAnh == null) {
			tthcCoQuanQlttImpl.setTenTiengAnh(StringPool.BLANK);
		}
		else {
			tthcCoQuanQlttImpl.setTenTiengAnh(TenTiengAnh);
		}

		tthcCoQuanQlttImpl.setIdCha(IdCha);

		tthcCoQuanQlttImpl.resetOriginalValues();

		return tthcCoQuanQlttImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		TenCoQuanQltt = objectInput.readUTF();
		TenTiengAnh = objectInput.readUTF();
		IdCha = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		if (TenCoQuanQltt == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenCoQuanQltt);
		}

		if (TenTiengAnh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenTiengAnh);
		}

		objectOutput.writeLong(IdCha);
	}

	public long Id;
	public String TenCoQuanQltt;
	public String TenTiengAnh;
	public long IdCha;
}