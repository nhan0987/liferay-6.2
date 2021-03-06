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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the THONGSOCHUNGCHIXEDAPDIEN service. Represents a row in the &quot;thongsochungchi_xedapdien&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEDAPDIENModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEDAPDIENImpl}.
 * </p>
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXEDAPDIEN
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEDAPDIENImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEDAPDIENModelImpl
 * @generated
 */
public interface THONGSOCHUNGCHIXEDAPDIENModel extends BaseModel<THONGSOCHUNGCHIXEDAPDIEN> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a t h o n g s o c h u n g c h i x e d a p d i e n model instance should use the {@link THONGSOCHUNGCHIXEDAPDIEN} interface instead.
	 */

	/**
	 * Returns the primary key of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the primary key of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param primaryKey the primary key of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the ID of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public long getId();

	/**
	 * Sets the ID of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param id the ID of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setId(long id);

	/**
	 * Returns the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public long getHoSoThuTucId();

	/**
	 * Sets the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setHoSoThuTucId(long hoSoThuTucId);

	/**
	 * Returns the certificate record ID of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the certificate record ID of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public long getCertificateRecordId();

	/**
	 * Sets the certificate record ID of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param certificateRecordId the certificate record ID of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setCertificateRecordId(long certificateRecordId);

	/**
	 * Returns the vehicle group ID of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the vehicle group ID of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public long getVehicleGroupId();

	/**
	 * Sets the vehicle group ID of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param vehicleGroupId the vehicle group ID of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setVehicleGroupId(long vehicleGroupId);

	/**
	 * Returns the synch date of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the synch date of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public Date getSynchDate();

	/**
	 * Sets the synch date of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param SynchDate the synch date of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setSynchDate(Date SynchDate);

	/**
	 * Returns the x d d0008 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0008 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0008();

	/**
	 * Sets the x d d0008 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0008 the x d d0008 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0008(String XDD0008);

	/**
	 * Returns the x d d0009 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0009 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0009();

	/**
	 * Sets the x d d0009 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0009 the x d d0009 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0009(String XDD0009);

	/**
	 * Returns the x d d0010 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0010 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0010();

	/**
	 * Sets the x d d0010 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0010 the x d d0010 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0010(String XDD0010);

	/**
	 * Returns the x d d0011 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0011 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0011();

	/**
	 * Sets the x d d0011 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0011 the x d d0011 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0011(String XDD0011);

	/**
	 * Returns the x d d0012 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0012 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0012();

	/**
	 * Sets the x d d0012 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0012 the x d d0012 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0012(String XDD0012);

	/**
	 * Returns the x d d0013 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0013 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0013();

	/**
	 * Sets the x d d0013 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0013 the x d d0013 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0013(String XDD0013);

	/**
	 * Returns the x d d0014 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0014 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0014();

	/**
	 * Sets the x d d0014 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0014 the x d d0014 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0014(String XDD0014);

	/**
	 * Returns the x d d0015 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0015 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0015();

	/**
	 * Sets the x d d0015 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0015 the x d d0015 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0015(String XDD0015);

	/**
	 * Returns the x d d0016 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0016 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0016();

	/**
	 * Sets the x d d0016 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0016 the x d d0016 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0016(String XDD0016);

	/**
	 * Returns the x d d0017 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0017 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0017();

	/**
	 * Sets the x d d0017 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0017 the x d d0017 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0017(String XDD0017);

	/**
	 * Returns the x d d0018 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0018 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0018();

	/**
	 * Sets the x d d0018 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0018 the x d d0018 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0018(String XDD0018);

	/**
	 * Returns the x d d0019 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0019 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0019();

	/**
	 * Sets the x d d0019 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0019 the x d d0019 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0019(String XDD0019);

	/**
	 * Returns the x d d0020 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0020 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0020();

	/**
	 * Sets the x d d0020 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0020 the x d d0020 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0020(String XDD0020);

	/**
	 * Returns the x d d0021 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0021 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0021();

	/**
	 * Sets the x d d0021 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0021 the x d d0021 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0021(String XDD0021);

	/**
	 * Returns the x d d0022 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0022 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0022();

	/**
	 * Sets the x d d0022 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0022 the x d d0022 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0022(String XDD0022);

	/**
	 * Returns the x d d0023 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0023 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0023();

	/**
	 * Sets the x d d0023 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0023 the x d d0023 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0023(String XDD0023);

	/**
	 * Returns the x d d0024 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0024 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0024();

	/**
	 * Sets the x d d0024 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0024 the x d d0024 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0024(String XDD0024);

	/**
	 * Returns the x d d0025 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0025 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0025();

	/**
	 * Sets the x d d0025 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0025 the x d d0025 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0025(String XDD0025);

	/**
	 * Returns the x d d0026 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0026 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0026();

	/**
	 * Sets the x d d0026 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0026 the x d d0026 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0026(String XDD0026);

	/**
	 * Returns the x d d0027 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0027 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0027();

	/**
	 * Sets the x d d0027 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0027 the x d d0027 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0027(String XDD0027);

	/**
	 * Returns the x d d1027 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d1027 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD1027();

	/**
	 * Sets the x d d1027 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD1027 the x d d1027 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD1027(String XDD1027);

	/**
	 * Returns the x d d0028 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0028 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0028();

	/**
	 * Sets the x d d0028 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0028 the x d d0028 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0028(String XDD0028);

	/**
	 * Returns the x d d1028 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d1028 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD1028();

	/**
	 * Sets the x d d1028 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD1028 the x d d1028 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD1028(String XDD1028);

	/**
	 * Returns the x d d1128 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d1128 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD1128();

	/**
	 * Sets the x d d1128 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD1128 the x d d1128 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD1128(String XDD1128);

	/**
	 * Returns the x d d0029 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0029 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0029();

	/**
	 * Sets the x d d0029 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0029 the x d d0029 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0029(String XDD0029);

	/**
	 * Returns the x d d1029 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d1029 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD1029();

	/**
	 * Sets the x d d1029 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD1029 the x d d1029 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD1029(String XDD1029);

	/**
	 * Returns the x d d1129 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d1129 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD1129();

	/**
	 * Sets the x d d1129 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD1129 the x d d1129 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD1129(String XDD1129);

	/**
	 * Returns the x d d0030 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0030 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0030();

	/**
	 * Sets the x d d0030 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0030 the x d d0030 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0030(String XDD0030);

	/**
	 * Returns the x d d0031 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0031 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0031();

	/**
	 * Sets the x d d0031 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0031 the x d d0031 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0031(String XDD0031);

	/**
	 * Returns the x d d0032 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0032 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0032();

	/**
	 * Sets the x d d0032 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0032 the x d d0032 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0032(String XDD0032);

	/**
	 * Returns the x d d0033 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0033 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0033();

	/**
	 * Sets the x d d0033 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0033 the x d d0033 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0033(String XDD0033);

	/**
	 * Returns the x d d0034 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0034 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0034();

	/**
	 * Sets the x d d0034 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0034 the x d d0034 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0034(String XDD0034);

	/**
	 * Returns the x d d1034 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d1034 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD1034();

	/**
	 * Sets the x d d1034 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD1034 the x d d1034 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD1034(String XDD1034);

	/**
	 * Returns the x d d0035 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0035 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0035();

	/**
	 * Sets the x d d0035 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0035 the x d d0035 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0035(String XDD0035);

	/**
	 * Returns the x d d1035 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d1035 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD1035();

	/**
	 * Sets the x d d1035 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD1035 the x d d1035 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD1035(String XDD1035);

	/**
	 * Returns the x d d0036 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0036 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0036();

	/**
	 * Sets the x d d0036 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0036 the x d d0036 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0036(String XDD0036);

	/**
	 * Returns the x d d0037 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0037 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0037();

	/**
	 * Sets the x d d0037 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0037 the x d d0037 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0037(String XDD0037);

	/**
	 * Returns the x d d0038 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @return the x d d0038 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	@AutoEscape
	public String getXDD0038();

	/**
	 * Sets the x d d0038 of this t h o n g s o c h u n g c h i x e d a p d i e n.
	 *
	 * @param XDD0038 the x d d0038 of this t h o n g s o c h u n g c h i x e d a p d i e n
	 */
	public void setXDD0038(String XDD0038);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEDAPDIEN thongsochungchixedapdien);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEDAPDIEN> toCacheModel();

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEDAPDIEN toEscapedModel();

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEDAPDIEN toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}