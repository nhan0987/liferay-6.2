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

package vn.dtt.gt.dk.dao.common.service;

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

import vn.dtt.gt.dk.dao.common.model.DmDataGroupClp;
import vn.dtt.gt.dk.dao.common.model.DmDataItemClp;
import vn.dtt.gt.dk.dao.common.model.DmDataVersionClp;
import vn.dtt.gt.dk.dao.common.model.DmMetaDataClp;
import vn.dtt.gt.dk.dao.common.model.TimKiemHoSoClp;
import vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSoClp;
import vn.dtt.gt.dk.dao.common.model.TthcCoQuanQlttClp;
import vn.dtt.gt.dk.dao.common.model.TthcDonViThucHienClp;
import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTucClp;
import vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDichClp;
import vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTucClp;
import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSoClp;
import vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoClp;
import vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTroClp;
import vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSoClp;
import vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinhClp;

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
						"DangKiemTimKiem-portlet-deployment-context");

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
							"DangKiemTimKiem-portlet-deployment-context");

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
				_servletContextName = "DangKiemTimKiem-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(DmDataGroupClp.class.getName())) {
			return translateInputDmDataGroup(oldModel);
		}

		if (oldModelClassName.equals(DmDataItemClp.class.getName())) {
			return translateInputDmDataItem(oldModel);
		}

		if (oldModelClassName.equals(DmDataVersionClp.class.getName())) {
			return translateInputDmDataVersion(oldModel);
		}

		if (oldModelClassName.equals(DmMetaDataClp.class.getName())) {
			return translateInputDmMetaData(oldModel);
		}

		if (oldModelClassName.equals(TimKiemHoSoClp.class.getName())) {
			return translateInputTimKiemHoSo(oldModel);
		}

		if (oldModelClassName.equals(TthcBieuMauHoSoClp.class.getName())) {
			return translateInputTthcBieuMauHoSo(oldModel);
		}

		if (oldModelClassName.equals(TthcCoQuanQlttClp.class.getName())) {
			return translateInputTthcCoQuanQltt(oldModel);
		}

		if (oldModelClassName.equals(TthcDonViThucHienClp.class.getName())) {
			return translateInputTthcDonViThucHien(oldModel);
		}

		if (oldModelClassName.equals(TthcHoSoThuTucClp.class.getName())) {
			return translateInputTthcHoSoThuTuc(oldModel);
		}

		if (oldModelClassName.equals(TthcKeHoachChuyenDichClp.class.getName())) {
			return translateInputTthcKeHoachChuyenDich(oldModel);
		}

		if (oldModelClassName.equals(TthcLinhVucThuTucClp.class.getName())) {
			return translateInputTthcLinhVucThuTuc(oldModel);
		}

		if (oldModelClassName.equals(TthcNoidungHoSoClp.class.getName())) {
			return translateInputTthcNoidungHoSo(oldModel);
		}

		if (oldModelClassName.equals(TthcPhanNhomHoSoClp.class.getName())) {
			return translateInputTthcPhanNhomHoSo(oldModel);
		}

		if (oldModelClassName.equals(TthcPhanNhomHoSoVaiTroClp.class.getName())) {
			return translateInputTthcPhanNhomHoSoVaiTro(oldModel);
		}

		if (oldModelClassName.equals(TthcThanhPhanHoSoClp.class.getName())) {
			return translateInputTthcThanhPhanHoSo(oldModel);
		}

		if (oldModelClassName.equals(TthcThuTucHanhChinhClp.class.getName())) {
			return translateInputTthcThuTucHanhChinh(oldModel);
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

	public static Object translateInputDmDataGroup(BaseModel<?> oldModel) {
		DmDataGroupClp oldClpModel = (DmDataGroupClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmDataGroupRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmDataItem(BaseModel<?> oldModel) {
		DmDataItemClp oldClpModel = (DmDataItemClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmDataItemRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmDataVersion(BaseModel<?> oldModel) {
		DmDataVersionClp oldClpModel = (DmDataVersionClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmDataVersionRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDmMetaData(BaseModel<?> oldModel) {
		DmMetaDataClp oldClpModel = (DmMetaDataClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDmMetaDataRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTimKiemHoSo(BaseModel<?> oldModel) {
		TimKiemHoSoClp oldClpModel = (TimKiemHoSoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTimKiemHoSoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcBieuMauHoSo(BaseModel<?> oldModel) {
		TthcBieuMauHoSoClp oldClpModel = (TthcBieuMauHoSoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcBieuMauHoSoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcCoQuanQltt(BaseModel<?> oldModel) {
		TthcCoQuanQlttClp oldClpModel = (TthcCoQuanQlttClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcCoQuanQlttRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcDonViThucHien(BaseModel<?> oldModel) {
		TthcDonViThucHienClp oldClpModel = (TthcDonViThucHienClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcDonViThucHienRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcHoSoThuTuc(BaseModel<?> oldModel) {
		TthcHoSoThuTucClp oldClpModel = (TthcHoSoThuTucClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcHoSoThuTucRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcKeHoachChuyenDich(
		BaseModel<?> oldModel) {
		TthcKeHoachChuyenDichClp oldClpModel = (TthcKeHoachChuyenDichClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcKeHoachChuyenDichRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcLinhVucThuTuc(BaseModel<?> oldModel) {
		TthcLinhVucThuTucClp oldClpModel = (TthcLinhVucThuTucClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcLinhVucThuTucRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcNoidungHoSo(BaseModel<?> oldModel) {
		TthcNoidungHoSoClp oldClpModel = (TthcNoidungHoSoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcNoidungHoSoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcPhanNhomHoSo(BaseModel<?> oldModel) {
		TthcPhanNhomHoSoClp oldClpModel = (TthcPhanNhomHoSoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcPhanNhomHoSoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcPhanNhomHoSoVaiTro(
		BaseModel<?> oldModel) {
		TthcPhanNhomHoSoVaiTroClp oldClpModel = (TthcPhanNhomHoSoVaiTroClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcPhanNhomHoSoVaiTroRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcThanhPhanHoSo(BaseModel<?> oldModel) {
		TthcThanhPhanHoSoClp oldClpModel = (TthcThanhPhanHoSoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcThanhPhanHoSoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTthcThuTucHanhChinh(
		BaseModel<?> oldModel) {
		TthcThuTucHanhChinhClp oldClpModel = (TthcThuTucHanhChinhClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTthcThuTucHanhChinhRemoteModel();

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
					"vn.dtt.gt.dk.dao.common.model.impl.DmDataGroupImpl")) {
			return translateOutputDmDataGroup(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.common.model.impl.DmDataItemImpl")) {
			return translateOutputDmDataItem(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.common.model.impl.DmDataVersionImpl")) {
			return translateOutputDmDataVersion(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.common.model.impl.DmMetaDataImpl")) {
			return translateOutputDmMetaData(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.common.model.impl.TimKiemHoSoImpl")) {
			return translateOutputTimKiemHoSo(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.common.model.impl.TthcBieuMauHoSoImpl")) {
			return translateOutputTthcBieuMauHoSo(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.common.model.impl.TthcCoQuanQlttImpl")) {
			return translateOutputTthcCoQuanQltt(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.common.model.impl.TthcDonViThucHienImpl")) {
			return translateOutputTthcDonViThucHien(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.common.model.impl.TthcHoSoThuTucImpl")) {
			return translateOutputTthcHoSoThuTuc(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichImpl")) {
			return translateOutputTthcKeHoachChuyenDich(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.common.model.impl.TthcLinhVucThuTucImpl")) {
			return translateOutputTthcLinhVucThuTuc(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoImpl")) {
			return translateOutputTthcNoidungHoSo(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.common.model.impl.TthcPhanNhomHoSoImpl")) {
			return translateOutputTthcPhanNhomHoSo(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.common.model.impl.TthcPhanNhomHoSoVaiTroImpl")) {
			return translateOutputTthcPhanNhomHoSoVaiTro(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.common.model.impl.TthcThanhPhanHoSoImpl")) {
			return translateOutputTthcThanhPhanHoSo(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dtt.gt.dk.dao.common.model.impl.TthcThuTucHanhChinhImpl")) {
			return translateOutputTthcThuTucHanhChinh(oldModel);
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
					"vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException")) {
			return new vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException")) {
			return new vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.common.NoSuchDmDataVersionException")) {
			return new vn.dtt.gt.dk.dao.common.NoSuchDmDataVersionException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.common.NoSuchDmMetaDataException")) {
			return new vn.dtt.gt.dk.dao.common.NoSuchDmMetaDataException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.common.NoSuchTimKiemHoSoException")) {
			return new vn.dtt.gt.dk.dao.common.NoSuchTimKiemHoSoException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.common.NoSuchTthcBieuMauHoSoException")) {
			return new vn.dtt.gt.dk.dao.common.NoSuchTthcBieuMauHoSoException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.common.NoSuchTthcCoQuanQlttException")) {
			return new vn.dtt.gt.dk.dao.common.NoSuchTthcCoQuanQlttException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.common.NoSuchTthcDonViThucHienException")) {
			return new vn.dtt.gt.dk.dao.common.NoSuchTthcDonViThucHienException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.common.NoSuchTthcHoSoThuTucException")) {
			return new vn.dtt.gt.dk.dao.common.NoSuchTthcHoSoThuTucException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException")) {
			return new vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.common.NoSuchTthcLinhVucThuTucException")) {
			return new vn.dtt.gt.dk.dao.common.NoSuchTthcLinhVucThuTucException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException")) {
			return new vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoException")) {
			return new vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException")) {
			return new vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException")) {
			return new vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException();
		}

		if (className.equals(
					"vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException")) {
			return new vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException();
		}

		return throwable;
	}

	public static Object translateOutputDmDataGroup(BaseModel<?> oldModel) {
		DmDataGroupClp newModel = new DmDataGroupClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmDataGroupRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmDataItem(BaseModel<?> oldModel) {
		DmDataItemClp newModel = new DmDataItemClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmDataItemRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmDataVersion(BaseModel<?> oldModel) {
		DmDataVersionClp newModel = new DmDataVersionClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmDataVersionRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDmMetaData(BaseModel<?> oldModel) {
		DmMetaDataClp newModel = new DmMetaDataClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDmMetaDataRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTimKiemHoSo(BaseModel<?> oldModel) {
		TimKiemHoSoClp newModel = new TimKiemHoSoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTimKiemHoSoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcBieuMauHoSo(BaseModel<?> oldModel) {
		TthcBieuMauHoSoClp newModel = new TthcBieuMauHoSoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcBieuMauHoSoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcCoQuanQltt(BaseModel<?> oldModel) {
		TthcCoQuanQlttClp newModel = new TthcCoQuanQlttClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcCoQuanQlttRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcDonViThucHien(BaseModel<?> oldModel) {
		TthcDonViThucHienClp newModel = new TthcDonViThucHienClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcDonViThucHienRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcHoSoThuTuc(BaseModel<?> oldModel) {
		TthcHoSoThuTucClp newModel = new TthcHoSoThuTucClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcHoSoThuTucRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcKeHoachChuyenDich(
		BaseModel<?> oldModel) {
		TthcKeHoachChuyenDichClp newModel = new TthcKeHoachChuyenDichClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcKeHoachChuyenDichRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcLinhVucThuTuc(BaseModel<?> oldModel) {
		TthcLinhVucThuTucClp newModel = new TthcLinhVucThuTucClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcLinhVucThuTucRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcNoidungHoSo(BaseModel<?> oldModel) {
		TthcNoidungHoSoClp newModel = new TthcNoidungHoSoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcNoidungHoSoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcPhanNhomHoSo(BaseModel<?> oldModel) {
		TthcPhanNhomHoSoClp newModel = new TthcPhanNhomHoSoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcPhanNhomHoSoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcPhanNhomHoSoVaiTro(
		BaseModel<?> oldModel) {
		TthcPhanNhomHoSoVaiTroClp newModel = new TthcPhanNhomHoSoVaiTroClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcPhanNhomHoSoVaiTroRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcThanhPhanHoSo(BaseModel<?> oldModel) {
		TthcThanhPhanHoSoClp newModel = new TthcThanhPhanHoSoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcThanhPhanHoSoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTthcThuTucHanhChinh(
		BaseModel<?> oldModel) {
		TthcThuTucHanhChinhClp newModel = new TthcThuTucHanhChinhClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTthcThuTucHanhChinhRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}