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

package vn.dtt.gt.dk.dao.aswmsg.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLogClp;
import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueueClp;
import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistoryClp;
import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLogClp;
import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebserviceClp;
import vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueueClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author win_64
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"DangKiemApp-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"DangKiemApp-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "DangKiemApp-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(AswmsgMessageLogClp.class.getName())) {
			return translateInputAswmsgMessageLog(oldModel);
		}

		if (oldModelClassName.equals(AswmsgMessageQueueClp.class.getName())) {
			return translateInputAswmsgMessageQueue(oldModel);
		}

		if (oldModelClassName.equals(AswmsgSyndatahistoryClp.class.getName())) {
			return translateInputAswmsgSyndatahistory(oldModel);
		}

		if (oldModelClassName.equals(AswmsgValidationLogClp.class.getName())) {
			return translateInputAswmsgValidationLog(oldModel);
		}

		if (oldModelClassName.equals(AswmsgWebserviceClp.class.getName())) {
			return translateInputAswmsgWebservice(oldModel);
		}

		if (oldModelClassName.equals(MonitorMessageQueueClp.class.getName())) {
			return translateInputMonitorMessageQueue(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputAswmsgMessageLog(BaseModel<?> oldModel) {
		AswmsgMessageLogClp oldClpModel = (AswmsgMessageLogClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAswmsgMessageLogRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAswmsgMessageQueue(BaseModel<?> oldModel) {
		AswmsgMessageQueueClp oldClpModel = (AswmsgMessageQueueClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAswmsgMessageQueueRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAswmsgSyndatahistory(
		BaseModel<?> oldModel) {
		AswmsgSyndatahistoryClp oldClpModel = (AswmsgSyndatahistoryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAswmsgSyndatahistoryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAswmsgValidationLog(
		BaseModel<?> oldModel) {
		AswmsgValidationLogClp oldClpModel = (AswmsgValidationLogClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAswmsgValidationLogRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputAswmsgWebservice(BaseModel<?> oldModel) {
		AswmsgWebserviceClp oldClpModel = (AswmsgWebserviceClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAswmsgWebserviceRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMonitorMessageQueue(
		BaseModel<?> oldModel) {
		MonitorMessageQueueClp oldClpModel = (MonitorMessageQueueClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMonitorMessageQueueRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageLogImpl")) {
			return translateOutputAswmsgMessageLog(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueImpl")) {
			return translateOutputAswmsgMessageQueue(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgSyndatahistoryImpl")) {
			return translateOutputAswmsgSyndatahistory(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogImpl")) {
			return translateOutputAswmsgValidationLog(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgWebserviceImpl")) {
			return translateOutputAswmsgWebservice(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.aswmsg.model.impl.MonitorMessageQueueImpl")) {
			return translateOutputMonitorMessageQueue(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException")) {
			return new vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException")) {
			return new vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException")) {
			return new vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException")) {
			return new vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgWebserviceException")) {
			return new vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgWebserviceException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.aswmsg.NoSuchMonitorMessageQueueException")) {
			return new vn.dtt.gt.dk.dao.aswmsg.NoSuchMonitorMessageQueueException();
		}

		return throwable;
	}

	public static Object translateOutputAswmsgMessageLog(BaseModel<?> oldModel) {
		AswmsgMessageLogClp newModel = new AswmsgMessageLogClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAswmsgMessageLogRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAswmsgMessageQueue(
		BaseModel<?> oldModel) {
		AswmsgMessageQueueClp newModel = new AswmsgMessageQueueClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAswmsgMessageQueueRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAswmsgSyndatahistory(
		BaseModel<?> oldModel) {
		AswmsgSyndatahistoryClp newModel = new AswmsgSyndatahistoryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAswmsgSyndatahistoryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAswmsgValidationLog(
		BaseModel<?> oldModel) {
		AswmsgValidationLogClp newModel = new AswmsgValidationLogClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAswmsgValidationLogRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputAswmsgWebservice(BaseModel<?> oldModel) {
		AswmsgWebserviceClp newModel = new AswmsgWebserviceClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAswmsgWebserviceRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMonitorMessageQueue(
		BaseModel<?> oldModel) {
		MonitorMessageQueueClp newModel = new MonitorMessageQueueClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMonitorMessageQueueRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}