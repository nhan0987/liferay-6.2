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

package vn.dtt.gt.dk.dao.motcua.service;

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

import vn.dtt.gt.dk.dao.motcua.model.DaKiemTraClp;
import vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruongClp;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThaiClp;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSoClp;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgatewayClp;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBienClp;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaNotificationClp;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLyClp;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinhClp;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhuClp;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTucClp;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSoClp;
import vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTraClp;
import vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyChinhHoSoThuTucClp;
import vn.dtt.gt.dk.dao.motcua.model.PhieuXuLyPhuHoSoThuTucClp;
import vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThongClp;

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

		if (oldModelClassName.equals(DaKiemTraClp.class.getName())) {
			return translateInputDaKiemTra(oldModel);
		}

		if (oldModelClassName.equals(LichKiemTraHienTruongClp.class.getName())) {
			return translateInputLichKiemTraHienTruong(oldModel);
		}

		if (oldModelClassName.equals(
					MotCuaChuyenDichTrangThaiClp.class.getName())) {
			return translateInputMotCuaChuyenDichTrangThai(oldModel);
		}

		if (oldModelClassName.equals(MotCuaDienBienHoSoClp.class.getName())) {
			return translateInputMotCuaDienBienHoSo(oldModel);
		}

		if (oldModelClassName.equals(MotCuaDongBoMTgatewayClp.class.getName())) {
			return translateInputMotCuaDongBoMTgateway(oldModel);
		}

		if (oldModelClassName.equals(MotCuaKetQuaDienBienClp.class.getName())) {
			return translateInputMotCuaKetQuaDienBien(oldModel);
		}

		if (oldModelClassName.equals(MotCuaNotificationClp.class.getName())) {
			return translateInputMotCuaNotification(oldModel);
		}

		if (oldModelClassName.equals(MotCuaPhanCongXuLyClp.class.getName())) {
			return translateInputMotCuaPhanCongXuLy(oldModel);
		}

		if (oldModelClassName.equals(MotCuaPhieuXuLyChinhClp.class.getName())) {
			return translateInputMotCuaPhieuXuLyChinh(oldModel);
		}

		if (oldModelClassName.equals(MotCuaPhieuXuLyPhuClp.class.getName())) {
			return translateInputMotCuaPhieuXuLyPhu(oldModel);
		}

		if (oldModelClassName.equals(MotCuaQuyTrinhThuTucClp.class.getName())) {
			return translateInputMotCuaQuyTrinhThuTuc(oldModel);
		}

		if (oldModelClassName.equals(MotCuaTrangThaiHoSoClp.class.getName())) {
			return translateInputMotCuaTrangThaiHoSo(oldModel);
		}

		if (oldModelClassName.equals(PhanCongDonViKiemTraClp.class.getName())) {
			return translateInputPhanCongDonViKiemTra(oldModel);
		}

		if (oldModelClassName.equals(
					PhieuXuLyChinhHoSoThuTucClp.class.getName())) {
			return translateInputPhieuXuLyChinhHoSoThuTuc(oldModel);
		}

		if (oldModelClassName.equals(PhieuXuLyPhuHoSoThuTucClp.class.getName())) {
			return translateInputPhieuXuLyPhuHoSoThuTuc(oldModel);
		}

		if (oldModelClassName.equals(ThamSoHeThongClp.class.getName())) {
			return translateInputThamSoHeThong(oldModel);
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

	public static Object translateInputDaKiemTra(BaseModel<?> oldModel) {
		DaKiemTraClp oldClpModel = (DaKiemTraClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDaKiemTraRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputLichKiemTraHienTruong(
		BaseModel<?> oldModel) {
		LichKiemTraHienTruongClp oldClpModel = (LichKiemTraHienTruongClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLichKiemTraHienTruongRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMotCuaChuyenDichTrangThai(
		BaseModel<?> oldModel) {
		MotCuaChuyenDichTrangThaiClp oldClpModel = (MotCuaChuyenDichTrangThaiClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMotCuaChuyenDichTrangThaiRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMotCuaDienBienHoSo(BaseModel<?> oldModel) {
		MotCuaDienBienHoSoClp oldClpModel = (MotCuaDienBienHoSoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMotCuaDienBienHoSoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMotCuaDongBoMTgateway(
		BaseModel<?> oldModel) {
		MotCuaDongBoMTgatewayClp oldClpModel = (MotCuaDongBoMTgatewayClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMotCuaDongBoMTgatewayRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMotCuaKetQuaDienBien(
		BaseModel<?> oldModel) {
		MotCuaKetQuaDienBienClp oldClpModel = (MotCuaKetQuaDienBienClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMotCuaKetQuaDienBienRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMotCuaNotification(BaseModel<?> oldModel) {
		MotCuaNotificationClp oldClpModel = (MotCuaNotificationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMotCuaNotificationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMotCuaPhanCongXuLy(BaseModel<?> oldModel) {
		MotCuaPhanCongXuLyClp oldClpModel = (MotCuaPhanCongXuLyClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMotCuaPhanCongXuLyRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMotCuaPhieuXuLyChinh(
		BaseModel<?> oldModel) {
		MotCuaPhieuXuLyChinhClp oldClpModel = (MotCuaPhieuXuLyChinhClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMotCuaPhieuXuLyChinhRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMotCuaPhieuXuLyPhu(BaseModel<?> oldModel) {
		MotCuaPhieuXuLyPhuClp oldClpModel = (MotCuaPhieuXuLyPhuClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMotCuaPhieuXuLyPhuRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMotCuaQuyTrinhThuTuc(
		BaseModel<?> oldModel) {
		MotCuaQuyTrinhThuTucClp oldClpModel = (MotCuaQuyTrinhThuTucClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMotCuaQuyTrinhThuTucRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMotCuaTrangThaiHoSo(
		BaseModel<?> oldModel) {
		MotCuaTrangThaiHoSoClp oldClpModel = (MotCuaTrangThaiHoSoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMotCuaTrangThaiHoSoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPhanCongDonViKiemTra(
		BaseModel<?> oldModel) {
		PhanCongDonViKiemTraClp oldClpModel = (PhanCongDonViKiemTraClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPhanCongDonViKiemTraRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPhieuXuLyChinhHoSoThuTuc(
		BaseModel<?> oldModel) {
		PhieuXuLyChinhHoSoThuTucClp oldClpModel = (PhieuXuLyChinhHoSoThuTucClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPhieuXuLyChinhHoSoThuTucRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPhieuXuLyPhuHoSoThuTuc(
		BaseModel<?> oldModel) {
		PhieuXuLyPhuHoSoThuTucClp oldClpModel = (PhieuXuLyPhuHoSoThuTucClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPhieuXuLyPhuHoSoThuTucRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputThamSoHeThong(BaseModel<?> oldModel) {
		ThamSoHeThongClp oldClpModel = (ThamSoHeThongClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getThamSoHeThongRemoteModel();

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
					"vn.dtt.gt.dk.dao.motcua.model.impl.DaKiemTraImpl")) {
			return translateOutputDaKiemTra(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.motcua.model.impl.LichKiemTraHienTruongImpl")) {
			return translateOutputLichKiemTraHienTruong(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiImpl")) {
			return translateOutputMotCuaChuyenDichTrangThai(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoImpl")) {
			return translateOutputMotCuaDienBienHoSo(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDongBoMTgatewayImpl")) {
			return translateOutputMotCuaDongBoMTgateway(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaKetQuaDienBienImpl")) {
			return translateOutputMotCuaKetQuaDienBien(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaNotificationImpl")) {
			return translateOutputMotCuaNotification(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhanCongXuLyImpl")) {
			return translateOutputMotCuaPhanCongXuLy(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyChinhImpl")) {
			return translateOutputMotCuaPhieuXuLyChinh(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuImpl")) {
			return translateOutputMotCuaPhieuXuLyPhu(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaQuyTrinhThuTucImpl")) {
			return translateOutputMotCuaQuyTrinhThuTuc(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaTrangThaiHoSoImpl")) {
			return translateOutputMotCuaTrangThaiHoSo(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.motcua.model.impl.PhanCongDonViKiemTraImpl")) {
			return translateOutputPhanCongDonViKiemTra(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.motcua.model.impl.PhieuXuLyChinhHoSoThuTucImpl")) {
			return translateOutputPhieuXuLyChinhHoSoThuTuc(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.motcua.model.impl.PhieuXuLyPhuHoSoThuTucImpl")) {
			return translateOutputPhieuXuLyPhuHoSoThuTuc(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.motcua.model.impl.ThamSoHeThongImpl")) {
			return translateOutputThamSoHeThong(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
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

		if (className.equals("vn.dtt.gt.dk.dao.motcua.NoSuchDaKiemTraException")) {
			return new vn.dtt.gt.dk.dao.motcua.NoSuchDaKiemTraException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.motcua.NoSuchLichKiemTraHienTruongException")) {
			return new vn.dtt.gt.dk.dao.motcua.NoSuchLichKiemTraHienTruongException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException")) {
			return new vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException")) {
			return new vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException")) {
			return new vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException")) {
			return new vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaNotificationException")) {
			return new vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaNotificationException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException")) {
			return new vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException")) {
			return new vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException")) {
			return new vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException")) {
			return new vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException")) {
			return new vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.motcua.NoSuchPhanCongDonViKiemTraException")) {
			return new vn.dtt.gt.dk.dao.motcua.NoSuchPhanCongDonViKiemTraException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.motcua.NoSuchPhieuXuLyChinhHoSoThuTucException")) {
			return new vn.dtt.gt.dk.dao.motcua.NoSuchPhieuXuLyChinhHoSoThuTucException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.motcua.NoSuchPhieuXuLyPhuHoSoThuTucException")) {
			return new vn.dtt.gt.dk.dao.motcua.NoSuchPhieuXuLyPhuHoSoThuTucException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.motcua.NoSuchThamSoHeThongException")) {
			return new vn.dtt.gt.dk.dao.motcua.NoSuchThamSoHeThongException();
		}

		return throwable;
	}

	public static Object translateOutputDaKiemTra(BaseModel<?> oldModel) {
		DaKiemTraClp newModel = new DaKiemTraClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDaKiemTraRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputLichKiemTraHienTruong(
		BaseModel<?> oldModel) {
		LichKiemTraHienTruongClp newModel = new LichKiemTraHienTruongClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLichKiemTraHienTruongRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMotCuaChuyenDichTrangThai(
		BaseModel<?> oldModel) {
		MotCuaChuyenDichTrangThaiClp newModel = new MotCuaChuyenDichTrangThaiClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMotCuaChuyenDichTrangThaiRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMotCuaDienBienHoSo(
		BaseModel<?> oldModel) {
		MotCuaDienBienHoSoClp newModel = new MotCuaDienBienHoSoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMotCuaDienBienHoSoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMotCuaDongBoMTgateway(
		BaseModel<?> oldModel) {
		MotCuaDongBoMTgatewayClp newModel = new MotCuaDongBoMTgatewayClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMotCuaDongBoMTgatewayRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMotCuaKetQuaDienBien(
		BaseModel<?> oldModel) {
		MotCuaKetQuaDienBienClp newModel = new MotCuaKetQuaDienBienClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMotCuaKetQuaDienBienRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMotCuaNotification(
		BaseModel<?> oldModel) {
		MotCuaNotificationClp newModel = new MotCuaNotificationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMotCuaNotificationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMotCuaPhanCongXuLy(
		BaseModel<?> oldModel) {
		MotCuaPhanCongXuLyClp newModel = new MotCuaPhanCongXuLyClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMotCuaPhanCongXuLyRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMotCuaPhieuXuLyChinh(
		BaseModel<?> oldModel) {
		MotCuaPhieuXuLyChinhClp newModel = new MotCuaPhieuXuLyChinhClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMotCuaPhieuXuLyChinhRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMotCuaPhieuXuLyPhu(
		BaseModel<?> oldModel) {
		MotCuaPhieuXuLyPhuClp newModel = new MotCuaPhieuXuLyPhuClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMotCuaPhieuXuLyPhuRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMotCuaQuyTrinhThuTuc(
		BaseModel<?> oldModel) {
		MotCuaQuyTrinhThuTucClp newModel = new MotCuaQuyTrinhThuTucClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMotCuaQuyTrinhThuTucRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMotCuaTrangThaiHoSo(
		BaseModel<?> oldModel) {
		MotCuaTrangThaiHoSoClp newModel = new MotCuaTrangThaiHoSoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMotCuaTrangThaiHoSoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPhanCongDonViKiemTra(
		BaseModel<?> oldModel) {
		PhanCongDonViKiemTraClp newModel = new PhanCongDonViKiemTraClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPhanCongDonViKiemTraRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPhieuXuLyChinhHoSoThuTuc(
		BaseModel<?> oldModel) {
		PhieuXuLyChinhHoSoThuTucClp newModel = new PhieuXuLyChinhHoSoThuTucClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPhieuXuLyChinhHoSoThuTucRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPhieuXuLyPhuHoSoThuTuc(
		BaseModel<?> oldModel) {
		PhieuXuLyPhuHoSoThuTucClp newModel = new PhieuXuLyPhuHoSoThuTucClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPhieuXuLyPhuHoSoThuTucRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputThamSoHeThong(BaseModel<?> oldModel) {
		ThamSoHeThongClp newModel = new ThamSoHeThongClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setThamSoHeThongRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}