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

package vn.dtt.gt.dk.utils;

import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.util.portlet.PortletProps;

public class PortletPropsValues {
	public static final String API_DOMAIN_FILE = PortletPropsUtil.getString(PortletPropsKeys.API_DOMAIN_FILE);
	
	public static final String SCHEMA_THUTUCHANHCHINH = PortletProps.get(PortletPropsKeys.SCHEMA_THUTUCHANHCHINH);
	
	public static final String SCHEMA_NGHIEPVU = PortletProps.get(PortletPropsKeys.SCHEMA_NGHIEPVU);
	
	public static final String COLUMN_SYNCH_DATE = PortletProps.get(PortletPropsKeys.COLUMN_SYNCH_DATE);
	
	public static final long USER_SYSTEM_UPLOAD_FILE = GetterUtil.getLong(PortletProps.get(PortletPropsKeys.USER_SYSTEM_UPLOAD_FILE));
}
