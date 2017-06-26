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

import vn.dtt.gt.dk.dao.common.service.DmDataItemServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link vn.dtt.gt.dk.dao.common.service.DmDataItemServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link vn.dtt.gt.dk.dao.common.model.DmDataItemSoap}.
 * If the method in the service utility returns a
 * {@link vn.dtt.gt.dk.dao.common.model.DmDataItem}, that is translated to a
 * {@link vn.dtt.gt.dk.dao.common.model.DmDataItemSoap}. Methods that SOAP cannot
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
 * @see DmDataItemServiceHttp
 * @see vn.dtt.gt.dk.dao.common.model.DmDataItemSoap
 * @see vn.dtt.gt.dk.dao.common.service.DmDataItemServiceUtil
 * @generated
 */
public class DmDataItemServiceSoap {
	public static int countDmDataItems() throws RemoteException {
		try {
			int returnValue = DmDataItemServiceUtil.countDmDataItems();

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countDmDataItems(java.lang.String synchronizeddate)
		throws RemoteException {
		try {
			int returnValue = DmDataItemServiceUtil.countDmDataItems(synchronizeddate);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static vn.dtt.gt.dk.dao.common.model.DmDataItemSoap[] getDmDataItems(
		int start, int end) throws RemoteException {
		try {
			java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> returnValue =
				DmDataItemServiceUtil.getDmDataItems(start, end);

			return vn.dtt.gt.dk.dao.common.model.DmDataItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static vn.dtt.gt.dk.dao.common.model.DmDataItemSoap[] getDmDataItems(
		java.lang.String synchronizeddate, int start, int end)
		throws RemoteException {
		try {
			java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> returnValue =
				DmDataItemServiceUtil.getDmDataItems(synchronizeddate, start,
					end);

			return vn.dtt.gt.dk.dao.common.model.DmDataItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static vn.dtt.gt.dk.dao.common.model.DmDataItemSoap getByDataGroupIdAndItemCode0(
		java.lang.String datagroupid, java.lang.String code0)
		throws RemoteException {
		try {
			vn.dtt.gt.dk.dao.common.model.DmDataItem returnValue = DmDataItemServiceUtil.getByDataGroupIdAndItemCode0(datagroupid,
					code0);

			return vn.dtt.gt.dk.dao.common.model.DmDataItemSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static vn.dtt.gt.dk.dao.common.model.DmDataItemSoap[] getDmDataItemByGroupCode(
		java.lang.String datagroupid) throws RemoteException {
		try {
			java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> returnValue =
				DmDataItemServiceUtil.getDmDataItemByGroupCode(datagroupid);

			return vn.dtt.gt.dk.dao.common.model.DmDataItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static vn.dtt.gt.dk.dao.common.model.DmDataItemSoap[] getDmDataItemByValidateFrom(
		java.lang.String validatefrom) throws RemoteException {
		try {
			java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> returnValue =
				DmDataItemServiceUtil.getDmDataItemByValidateFrom(validatefrom);

			return vn.dtt.gt.dk.dao.common.model.DmDataItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static vn.dtt.gt.dk.dao.common.model.DmDataItemSoap[] getByGC_C0_C1_C2_C3_L_AN(
		java.lang.String groupCode, java.lang.String code0,
		java.lang.String code1, java.lang.String code2, java.lang.String code3,
		java.lang.Integer level, java.lang.String alterName)
		throws RemoteException {
		try {
			java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> returnValue =
				DmDataItemServiceUtil.getByGC_C0_C1_C2_C3_L_AN(groupCode,
					code0, code1, code2, code3, level, alterName);

			return vn.dtt.gt.dk.dao.common.model.DmDataItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static vn.dtt.gt.dk.dao.common.model.DmDataItemSoap[] getByGN_C0_C1_C2_C3_L_AN(
		java.lang.String groupName, java.lang.String code0,
		java.lang.String code1, java.lang.String code2, java.lang.String code3,
		java.lang.Integer level, java.lang.String alterName)
		throws RemoteException {
		try {
			java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> returnValue =
				DmDataItemServiceUtil.getByGN_C0_C1_C2_C3_L_AN(groupName,
					code0, code1, code2, code3, level, alterName);

			return vn.dtt.gt.dk.dao.common.model.DmDataItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countHoSoNghiepVuBySynchDate(java.lang.String tablename,
		java.lang.String synchronizeddate) throws RemoteException {
		try {
			int returnValue = DmDataItemServiceUtil.countHoSoNghiepVuBySynchDate(tablename,
					synchronizeddate);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.Object getHoSoNghiepVuById(
		java.lang.String tablename, long id) throws RemoteException {
		try {
			java.lang.Object returnValue = DmDataItemServiceUtil.getHoSoNghiepVuById(tablename,
					id);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.util.Date getCurrentTime() throws RemoteException {
		try {
			java.util.Date returnValue = DmDataItemServiceUtil.getCurrentTime();

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(DmDataItemServiceSoap.class);
}