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

package vn.dtt.gt.dk.dao.common.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.common.service.DmDataGroupServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link vn.dtt.gt.dk.dao.common.service.DmDataGroupServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link vn.dtt.gt.dk.dao.common.model.DmDataGroupSoap}.
 * If the method in the service utility returns a
 * {@link vn.dtt.gt.dk.dao.common.model.DmDataGroup}, that is translated to a
 * {@link vn.dtt.gt.dk.dao.common.model.DmDataGroupSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author huymq
 * @see DmDataGroupServiceHttp
 * @see vn.dtt.gt.dk.dao.common.model.DmDataGroupSoap
 * @see vn.dtt.gt.dk.dao.common.service.DmDataGroupServiceUtil
 * @generated
 */
public class DmDataGroupServiceSoap {
	public static int countDmDataGroup() throws RemoteException {
		try {
			int returnValue = DmDataGroupServiceUtil.countDmDataGroup();

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static vn.dtt.gt.dk.dao.common.model.DmDataGroupSoap getByCode(
		java.lang.String code) throws RemoteException {
		try {
			vn.dtt.gt.dk.dao.common.model.DmDataGroup returnValue = DmDataGroupServiceUtil.getByCode(code);

			return vn.dtt.gt.dk.dao.common.model.DmDataGroupSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static vn.dtt.gt.dk.dao.common.model.DmDataGroupSoap[] getDmDataGroups(
		int start, int end) throws RemoteException {
		try {
			java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataGroup> returnValue =
				DmDataGroupServiceUtil.getDmDataGroups(start, end);

			return vn.dtt.gt.dk.dao.common.model.DmDataGroupSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(DmDataGroupServiceSoap.class);
}