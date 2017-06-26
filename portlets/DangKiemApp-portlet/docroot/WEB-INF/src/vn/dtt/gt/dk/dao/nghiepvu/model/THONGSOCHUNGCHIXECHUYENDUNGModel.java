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
 * The base model interface for the THONGSOCHUNGCHIXECHUYENDUNG service. Represents a row in the &quot;thongsochungchi_xechuyendung&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGImpl}.
 * </p>
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXECHUYENDUNG
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl
 * @generated
 */
public interface THONGSOCHUNGCHIXECHUYENDUNGModel extends BaseModel<THONGSOCHUNGCHIXECHUYENDUNG> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a t h o n g s o c h u n g c h i x e c h u y e n d u n g model instance should use the {@link THONGSOCHUNGCHIXECHUYENDUNG} interface instead.
	 */

	/**
	 * Returns the primary key of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the primary key of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param primaryKey the primary key of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public long getId();

	/**
	 * Sets the ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param id the ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setId(long id);

	/**
	 * Returns the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public long getHoSoThuTucId();

	/**
	 * Sets the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setHoSoThuTucId(long hoSoThuTucId);

	/**
	 * Returns the certificate record ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the certificate record ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public long getCertificateRecordId();

	/**
	 * Sets the certificate record ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param certificateRecordId the certificate record ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setCertificateRecordId(long certificateRecordId);

	/**
	 * Returns the vehicle group ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the vehicle group ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public long getVehicleGroupId();

	/**
	 * Sets the vehicle group ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param vehicleGroupId the vehicle group ID of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setVehicleGroupId(long vehicleGroupId);

	/**
	 * Returns the synch date of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the synch date of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public Date getSynchDate();

	/**
	 * Sets the synch date of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param SynchDate the synch date of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setSynchDate(Date SynchDate);

	/**
	 * Returns the x c d0009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d0009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCD0009();

	/**
	 * Sets the x c d0009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCD0009 the x c d0009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCD0009(String XCD0009);

	/**
	 * Returns the x c d0010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d0010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCD0010();

	/**
	 * Sets the x c d0010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCD0010 the x c d0010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCD0010(String XCD0010);

	/**
	 * Returns the x c d0011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d0011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCD0011();

	/**
	 * Sets the x c d0011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCD0011 the x c d0011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCD0011(String XCD0011);

	/**
	 * Returns the x c d0012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d0012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCD0012();

	/**
	 * Sets the x c d0012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCD0012 the x c d0012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCD0012(String XCD0012);

	/**
	 * Returns the x c d0013 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d0013 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCD0013();

	/**
	 * Sets the x c d0013 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCD0013 the x c d0013 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCD0013(String XCD0013);

	/**
	 * Returns the x c d0014 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d0014 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCD0014();

	/**
	 * Sets the x c d0014 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCD0014 the x c d0014 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCD0014(String XCD0014);

	/**
	 * Returns the x c d0015 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d0015 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCD0015();

	/**
	 * Sets the x c d0015 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCD0015 the x c d0015 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCD0015(String XCD0015);

	/**
	 * Returns the x c d0016 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d0016 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCD0016();

	/**
	 * Sets the x c d0016 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCD0016 the x c d0016 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCD0016(String XCD0016);

	/**
	 * Returns the x c d0017 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d0017 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCD0017();

	/**
	 * Sets the x c d0017 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCD0017 the x c d0017 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCD0017(String XCD0017);

	/**
	 * Returns the x c d1017 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d1017 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCD1017();

	/**
	 * Sets the x c d1017 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCD1017 the x c d1017 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCD1017(String XCD1017);

	/**
	 * Returns the x c d0018 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d0018 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCD0018();

	/**
	 * Sets the x c d0018 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCD0018 the x c d0018 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCD0018(String XCD0018);

	/**
	 * Returns the x c d0019 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d0019 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCD0019();

	/**
	 * Sets the x c d0019 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCD0019 the x c d0019 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCD0019(String XCD0019);

	/**
	 * Returns the x c d0020 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d0020 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCD0020();

	/**
	 * Sets the x c d0020 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCD0020 the x c d0020 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCD0020(String XCD0020);

	/**
	 * Returns the x c d0021 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d0021 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCD0021();

	/**
	 * Sets the x c d0021 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCD0021 the x c d0021 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCD0021(String XCD0021);

	/**
	 * Returns the x c d0022 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d0022 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCD0022();

	/**
	 * Sets the x c d0022 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCD0022 the x c d0022 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCD0022(String XCD0022);

	/**
	 * Returns the x c d0023 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d0023 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCD0023();

	/**
	 * Sets the x c d0023 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCD0023 the x c d0023 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCD0023(String XCD0023);

	/**
	 * Returns the x c d1023 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d1023 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCD1023();

	/**
	 * Sets the x c d1023 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCD1023 the x c d1023 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCD1023(String XCD1023);

	/**
	 * Returns the x c d0024 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d0024 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCD0024();

	/**
	 * Sets the x c d0024 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCD0024 the x c d0024 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCD0024(String XCD0024);

	/**
	 * Returns the x c d c o d e001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d c o d e001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDCODE001();

	/**
	 * Sets the x c d c o d e001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDCODE001 the x c d c o d e001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDCODE001(String XCDCODE001);

	/**
	 * Returns the x c d n a m e001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d n a m e001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDNAME001();

	/**
	 * Sets the x c d n a m e001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDNAME001 the x c d n a m e001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDNAME001(String XCDNAME001);

	/**
	 * Returns the x c d v a l u001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d v a l u001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDVALU001();

	/**
	 * Sets the x c d v a l u001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDVALU001 the x c d v a l u001 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDVALU001(String XCDVALU001);

	/**
	 * Returns the x c d c o d e002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d c o d e002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDCODE002();

	/**
	 * Sets the x c d c o d e002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDCODE002 the x c d c o d e002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDCODE002(String XCDCODE002);

	/**
	 * Returns the x c d n a m e002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d n a m e002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDNAME002();

	/**
	 * Sets the x c d n a m e002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDNAME002 the x c d n a m e002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDNAME002(String XCDNAME002);

	/**
	 * Returns the x c d v a l u002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d v a l u002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDVALU002();

	/**
	 * Sets the x c d v a l u002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDVALU002 the x c d v a l u002 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDVALU002(String XCDVALU002);

	/**
	 * Returns the x c d c o d e003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d c o d e003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDCODE003();

	/**
	 * Sets the x c d c o d e003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDCODE003 the x c d c o d e003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDCODE003(String XCDCODE003);

	/**
	 * Returns the x c d n a m e003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d n a m e003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDNAME003();

	/**
	 * Sets the x c d n a m e003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDNAME003 the x c d n a m e003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDNAME003(String XCDNAME003);

	/**
	 * Returns the x c d v a l u003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d v a l u003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDVALU003();

	/**
	 * Sets the x c d v a l u003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDVALU003 the x c d v a l u003 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDVALU003(String XCDVALU003);

	/**
	 * Returns the x c d c o d e004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d c o d e004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDCODE004();

	/**
	 * Sets the x c d c o d e004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDCODE004 the x c d c o d e004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDCODE004(String XCDCODE004);

	/**
	 * Returns the x c d n a m e004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d n a m e004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDNAME004();

	/**
	 * Sets the x c d n a m e004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDNAME004 the x c d n a m e004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDNAME004(String XCDNAME004);

	/**
	 * Returns the x c d v a l u004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d v a l u004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDVALU004();

	/**
	 * Sets the x c d v a l u004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDVALU004 the x c d v a l u004 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDVALU004(String XCDVALU004);

	/**
	 * Returns the x c d c o d e005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d c o d e005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDCODE005();

	/**
	 * Sets the x c d c o d e005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDCODE005 the x c d c o d e005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDCODE005(String XCDCODE005);

	/**
	 * Returns the x c d n a m e005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d n a m e005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDNAME005();

	/**
	 * Sets the x c d n a m e005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDNAME005 the x c d n a m e005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDNAME005(String XCDNAME005);

	/**
	 * Returns the x c d v a l u005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d v a l u005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDVALU005();

	/**
	 * Sets the x c d v a l u005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDVALU005 the x c d v a l u005 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDVALU005(String XCDVALU005);

	/**
	 * Returns the x c d c o d e006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d c o d e006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDCODE006();

	/**
	 * Sets the x c d c o d e006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDCODE006 the x c d c o d e006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDCODE006(String XCDCODE006);

	/**
	 * Returns the x c d n a m e006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d n a m e006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDNAME006();

	/**
	 * Sets the x c d n a m e006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDNAME006 the x c d n a m e006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDNAME006(String XCDNAME006);

	/**
	 * Returns the x c d v a l u006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d v a l u006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDVALU006();

	/**
	 * Sets the x c d v a l u006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDVALU006 the x c d v a l u006 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDVALU006(String XCDVALU006);

	/**
	 * Returns the x c d c o d e007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d c o d e007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDCODE007();

	/**
	 * Sets the x c d c o d e007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDCODE007 the x c d c o d e007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDCODE007(String XCDCODE007);

	/**
	 * Returns the x c d n a m e007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d n a m e007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDNAME007();

	/**
	 * Sets the x c d n a m e007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDNAME007 the x c d n a m e007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDNAME007(String XCDNAME007);

	/**
	 * Returns the x c d v a l u007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d v a l u007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDVALU007();

	/**
	 * Sets the x c d v a l u007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDVALU007 the x c d v a l u007 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDVALU007(String XCDVALU007);

	/**
	 * Returns the x c d c o d e008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d c o d e008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDCODE008();

	/**
	 * Sets the x c d c o d e008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDCODE008 the x c d c o d e008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDCODE008(String XCDCODE008);

	/**
	 * Returns the x c d n a m e008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d n a m e008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDNAME008();

	/**
	 * Sets the x c d n a m e008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDNAME008 the x c d n a m e008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDNAME008(String XCDNAME008);

	/**
	 * Returns the x c d v a l u008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d v a l u008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDVALU008();

	/**
	 * Sets the x c d v a l u008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDVALU008 the x c d v a l u008 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDVALU008(String XCDVALU008);

	/**
	 * Returns the x c d c o d e009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d c o d e009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDCODE009();

	/**
	 * Sets the x c d c o d e009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDCODE009 the x c d c o d e009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDCODE009(String XCDCODE009);

	/**
	 * Returns the x c d n a m e009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d n a m e009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDNAME009();

	/**
	 * Sets the x c d n a m e009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDNAME009 the x c d n a m e009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDNAME009(String XCDNAME009);

	/**
	 * Returns the x c d v a l u009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d v a l u009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDVALU009();

	/**
	 * Sets the x c d v a l u009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDVALU009 the x c d v a l u009 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDVALU009(String XCDVALU009);

	/**
	 * Returns the x c d c o d e010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d c o d e010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDCODE010();

	/**
	 * Sets the x c d c o d e010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDCODE010 the x c d c o d e010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDCODE010(String XCDCODE010);

	/**
	 * Returns the x c d n a m e010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d n a m e010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDNAME010();

	/**
	 * Sets the x c d n a m e010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDNAME010 the x c d n a m e010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDNAME010(String XCDNAME010);

	/**
	 * Returns the x c d v a l u010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d v a l u010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDVALU010();

	/**
	 * Sets the x c d v a l u010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDVALU010 the x c d v a l u010 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDVALU010(String XCDVALU010);

	/**
	 * Returns the x c d c o d e011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d c o d e011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDCODE011();

	/**
	 * Sets the x c d c o d e011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDCODE011 the x c d c o d e011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDCODE011(String XCDCODE011);

	/**
	 * Returns the x c d n a m e011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d n a m e011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDNAME011();

	/**
	 * Sets the x c d n a m e011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDNAME011 the x c d n a m e011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDNAME011(String XCDNAME011);

	/**
	 * Returns the x c d v a l u011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d v a l u011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDVALU011();

	/**
	 * Sets the x c d v a l u011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDVALU011 the x c d v a l u011 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDVALU011(String XCDVALU011);

	/**
	 * Returns the x c d c o d e012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d c o d e012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDCODE012();

	/**
	 * Sets the x c d c o d e012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDCODE012 the x c d c o d e012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDCODE012(String XCDCODE012);

	/**
	 * Returns the x c d n a m e012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d n a m e012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDNAME012();

	/**
	 * Sets the x c d n a m e012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDNAME012 the x c d n a m e012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDNAME012(String XCDNAME012);

	/**
	 * Returns the x c d v a l u012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @return the x c d v a l u012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	@AutoEscape
	public String getXCDVALU012();

	/**
	 * Sets the x c d v a l u012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g.
	 *
	 * @param XCDVALU012 the x c d v a l u012 of this t h o n g s o c h u n g c h i x e c h u y e n d u n g
	 */
	public void setXCDVALU012(String XCDVALU012);

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
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung);

	@Override
	public int hashCode();

	@Override
	public CacheModel<THONGSOCHUNGCHIXECHUYENDUNG> toCacheModel();

	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG toEscapedModel();

	@Override
	public THONGSOCHUNGCHIXECHUYENDUNG toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}