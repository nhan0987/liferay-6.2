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

package vn.dtt.gt.dk.dao.nghiepvu.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspecSoap}.
 * If the method in the service utility returns a
 * {@link vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec}, that is translated to a
 * {@link vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspecSoap}. Methods that SOAP cannot
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
 * @see CfgTechnicalspecServiceHttp
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspecSoap
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecServiceUtil
 * @generated
 */
public class CfgTechnicalspecServiceSoap {
	public static int countCfgTechnicalSpec() throws RemoteException {
		try {
			int returnValue = CfgTechnicalspecServiceUtil.countCfgTechnicalSpec();

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countBySyncDate(java.lang.String validatefrom)
		throws RemoteException {
		try {
			int returnValue = CfgTechnicalspecServiceUtil.countBySyncDate(validatefrom);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspecSoap[] getCfgTechnicalSpecs(
		int start, int end) throws RemoteException {
		try {
			java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> returnValue =
				CfgTechnicalspecServiceUtil.getCfgTechnicalSpecs(start, end);

			return vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspecSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspecSoap getBySpecificationCode(
		java.lang.String specificationcode) throws RemoteException {
		try {
			vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec returnValue = CfgTechnicalspecServiceUtil.getBySpecificationCode(specificationcode);

			return vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspecSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspecSoap[] getBySynchDate(
		java.lang.String validatefrom) throws RemoteException {
		try {
			java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> returnValue =
				CfgTechnicalspecServiceUtil.getBySynchDate(validatefrom);

			return vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspecSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspecSoap[] getBySynchDate(
		java.lang.String validatefrom, int start, int end)
		throws RemoteException {
		try {
			java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> returnValue =
				CfgTechnicalspecServiceUtil.getBySynchDate(validatefrom, start,
					end);

			return vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspecSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CfgTechnicalspecServiceSoap.class);
}