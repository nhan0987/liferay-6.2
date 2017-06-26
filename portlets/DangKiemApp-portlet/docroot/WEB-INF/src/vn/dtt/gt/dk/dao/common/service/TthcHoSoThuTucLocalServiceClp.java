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

import com.liferay.portal.service.InvokableLocalService;

/**
 * @author win_64
 * @generated
 */
public class TthcHoSoThuTucLocalServiceClp implements TthcHoSoThuTucLocalService {
	public TthcHoSoThuTucLocalServiceClp(
		InvokableLocalService invokableLocalService) {
		_invokableLocalService = invokableLocalService;

		_methodName0 = "addTthcHoSoThuTuc";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"
			};

		_methodName1 = "createTthcHoSoThuTuc";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteTthcHoSoThuTuc";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteTthcHoSoThuTuc";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchTthcHoSoThuTuc";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getTthcHoSoThuTuc";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getTthcHoSoThuTucs";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getTthcHoSoThuTucsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateTthcHoSoThuTuc";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"
			};

		_methodName16 = "getBeanIdentifier";

		_methodParameterTypes16 = new String[] {  };

		_methodName17 = "setBeanIdentifier";

		_methodParameterTypes17 = new String[] { "java.lang.String" };

		_methodName19 = "findDanhSachHoSo";

		_methodParameterTypes19 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"int", "int"
			};

		_methodName20 = "countDanhSachHoSo";

		_methodParameterTypes20 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String"
			};

		_methodName21 = "findDanhSachHoSoAndDoiTuongAndMaSoBienNhan";

		_methodParameterTypes21 = new String[] {
				"java.lang.String", "java.lang.String", "long", "long",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "int", "int"
			};

		_methodName22 = "countDanhSachHoSoAndDoiTuongAndMaSoBienNhan";

		_methodParameterTypes22 = new String[] {
				"java.lang.String", "java.lang.String", "long", "long",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String"
			};

		_methodName23 = "countHoSoThuTucByPhanNhomHoSoAndToChucQuanLy";

		_methodParameterTypes23 = new String[] { "long", "long" };

		_methodName24 = "countHoSoThuTucByTinNhanh";

		_methodParameterTypes24 = new String[] { "long" };

		_methodName25 = "fetchByMaSoHoSo";

		_methodParameterTypes25 = new String[] { "java.lang.String" };

		_methodName26 = "findByPhieuXuLyPhuId";

		_methodParameterTypes26 = new String[] { "long" };

		_methodName27 = "searchTraCuuThongTinHoSo";

		_methodParameterTypes27 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "long", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "int", "int"
			};

		_methodName28 = "countSearchTraCuuThongTinHoSo";

		_methodParameterTypes28 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "long", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String"
			};

		_methodName29 = "findByDebitNoteId";

		_methodParameterTypes29 = new String[] { "long" };

		_methodName30 = "findByThamsoDongboMTgateway";

		_methodParameterTypes30 = new String[] { "long" };
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc addTthcHoSoThuTuc(
		vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc tthcHoSoThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName0,
					_methodParameterTypes0,
					new Object[] { ClpSerializer.translateInput(tthcHoSoThuTuc) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc createTthcHoSoThuTuc(
		long Id) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName1,
					_methodParameterTypes1, new Object[] { Id });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc deleteTthcHoSoThuTuc(
		long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName2,
					_methodParameterTypes2, new Object[] { Id });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc deleteTthcHoSoThuTuc(
		vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc tthcHoSoThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName3,
					_methodParameterTypes3,
					new Object[] { ClpSerializer.translateInput(tthcHoSoThuTuc) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName4,
					_methodParameterTypes4, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.kernel.dao.orm.DynamicQuery)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName5,
					_methodParameterTypes5,
					new Object[] { ClpSerializer.translateInput(dynamicQuery) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName6,
					_methodParameterTypes6,
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName7,
					_methodParameterTypes7,
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName8,
					_methodParameterTypes8,
					new Object[] { ClpSerializer.translateInput(dynamicQuery) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName9,
					_methodParameterTypes9,
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					ClpSerializer.translateInput(projection)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc fetchTthcHoSoThuTuc(
		long Id) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName10,
					_methodParameterTypes10, new Object[] { Id });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc getTthcHoSoThuTuc(
		long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName11,
					_methodParameterTypes11, new Object[] { Id });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName12,
					_methodParameterTypes12,
					new Object[] { ClpSerializer.translateInput(primaryKeyObj) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.model.PersistedModel)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc> getTthcHoSoThuTucs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName13,
					_methodParameterTypes13, new Object[] { start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int getTthcHoSoThuTucsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName14,
					_methodParameterTypes14, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc updateTthcHoSoThuTuc(
		vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc tthcHoSoThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName15,
					_methodParameterTypes15,
					new Object[] { ClpSerializer.translateInput(tthcHoSoThuTuc) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName16,
					_methodParameterTypes16, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		try {
			_invokableLocalService.invokeMethod(_methodName17,
				_methodParameterTypes17,
				new Object[] { ClpSerializer.translateInput(beanIdentifier) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		throw new UnsupportedOperationException();
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc> findDanhSachHoSo(
		long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName19,
					_methodParameterTypes19,
					new Object[] {
						organizationId,
						
					phanNhomHoSoId,
						
					ClpSerializer.translateInput(thuTucHanhChinhId),
						
					ClpSerializer.translateInput(maSoHoSo),
						
					ClpSerializer.translateInput(ngayNopFrom),
						
					ClpSerializer.translateInput(ngayNopTo),
						
					ClpSerializer.translateInput(tenDoanhNghiep),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int countDanhSachHoSo(long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName20,
					_methodParameterTypes20,
					new Object[] {
						organizationId,
						
					phanNhomHoSoId,
						
					ClpSerializer.translateInput(thuTucHanhChinhId),
						
					ClpSerializer.translateInput(maSoHoSo),
						
					ClpSerializer.translateInput(ngayNopFrom),
						
					ClpSerializer.translateInput(ngayNopTo),
						
					ClpSerializer.translateInput(tenDoanhNghiep)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc> findDanhSachHoSoAndDoiTuongAndMaSoBienNhan(
		java.lang.String doiTuong, java.lang.String maSoBienNhan,
		long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName21,
					_methodParameterTypes21,
					new Object[] {
						ClpSerializer.translateInput(doiTuong),
						
					ClpSerializer.translateInput(maSoBienNhan),
						
					organizationId,
						
					phanNhomHoSoId,
						
					ClpSerializer.translateInput(thuTucHanhChinhId),
						
					ClpSerializer.translateInput(maSoHoSo),
						
					ClpSerializer.translateInput(ngayNopFrom),
						
					ClpSerializer.translateInput(ngayNopTo),
						
					ClpSerializer.translateInput(tenDoanhNghiep),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int countDanhSachHoSoAndDoiTuongAndMaSoBienNhan(
		java.lang.String doiTuong, java.lang.String maSoBienNhan,
		long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName22,
					_methodParameterTypes22,
					new Object[] {
						ClpSerializer.translateInput(doiTuong),
						
					ClpSerializer.translateInput(maSoBienNhan),
						
					organizationId,
						
					phanNhomHoSoId,
						
					ClpSerializer.translateInput(thuTucHanhChinhId),
						
					ClpSerializer.translateInput(maSoHoSo),
						
					ClpSerializer.translateInput(ngayNopFrom),
						
					ClpSerializer.translateInput(ngayNopTo),
						
					ClpSerializer.translateInput(tenDoanhNghiep)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public int countHoSoThuTucByPhanNhomHoSoAndToChucQuanLy(
		long phannhomhosoid, long tochucquanly) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName23,
					_methodParameterTypes23,
					new Object[] { phannhomhosoid, tochucquanly });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public int countHoSoThuTucByTinNhanh(long phannhomhosoid) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName24,
					_methodParameterTypes24, new Object[] { phannhomhosoid });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc fetchByMaSoHoSo(
		java.lang.String maSoHoSo) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName25,
					_methodParameterTypes25,
					new Object[] { ClpSerializer.translateInput(maSoHoSo) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc findByPhieuXuLyPhuId(
		long phieuXuLyPhuId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName26,
					_methodParameterTypes26, new Object[] { phieuXuLyPhuId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc> searchTraCuuThongTinHoSo(
		java.lang.String loaiThuTuc, java.lang.String soDangKiKiemTra,
		java.lang.String ngayCapDangKiFrom, java.lang.String ngayCapDangKiTo,
		long organizationId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String nguoiNhapKhau, int start,
		int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName27,
					_methodParameterTypes27,
					new Object[] {
						ClpSerializer.translateInput(loaiThuTuc),
						
					ClpSerializer.translateInput(soDangKiKiemTra),
						
					ClpSerializer.translateInput(ngayCapDangKiFrom),
						
					ClpSerializer.translateInput(ngayCapDangKiTo),
						
					organizationId,
						
					ClpSerializer.translateInput(thuTucHanhChinhId),
						
					ClpSerializer.translateInput(maSoHoSo),
						
					ClpSerializer.translateInput(ngayNopFrom),
						
					ClpSerializer.translateInput(ngayNopTo),
						
					ClpSerializer.translateInput(nguoiNhapKhau),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int countSearchTraCuuThongTinHoSo(java.lang.String loaiThuTuc,
		java.lang.String soDangKiKiemTra, java.lang.String ngayCapDangKiFrom,
		java.lang.String ngayCapDangKiTo, long organizationId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String nguoiNhapKhau)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName28,
					_methodParameterTypes28,
					new Object[] {
						ClpSerializer.translateInput(loaiThuTuc),
						
					ClpSerializer.translateInput(soDangKiKiemTra),
						
					ClpSerializer.translateInput(ngayCapDangKiFrom),
						
					ClpSerializer.translateInput(ngayCapDangKiTo),
						
					organizationId,
						
					ClpSerializer.translateInput(thuTucHanhChinhId),
						
					ClpSerializer.translateInput(maSoHoSo),
						
					ClpSerializer.translateInput(ngayNopFrom),
						
					ClpSerializer.translateInput(ngayNopTo),
						
					ClpSerializer.translateInput(nguoiNhapKhau)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc> findByDebitNoteId(
		long idDebitNote)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName29,
					_methodParameterTypes29, new Object[] { idDebitNote });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc> findByThamsoDongboMTgateway(
		long lastHosothutucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName30,
					_methodParameterTypes30, new Object[] { lastHosothutucId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc>)ClpSerializer.translateOutput(returnObj);
	}

	private InvokableLocalService _invokableLocalService;
	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName19;
	private String[] _methodParameterTypes19;
	private String _methodName20;
	private String[] _methodParameterTypes20;
	private String _methodName21;
	private String[] _methodParameterTypes21;
	private String _methodName22;
	private String[] _methodParameterTypes22;
	private String _methodName23;
	private String[] _methodParameterTypes23;
	private String _methodName24;
	private String[] _methodParameterTypes24;
	private String _methodName25;
	private String[] _methodParameterTypes25;
	private String _methodName26;
	private String[] _methodParameterTypes26;
	private String _methodName27;
	private String[] _methodParameterTypes27;
	private String _methodName28;
	private String[] _methodParameterTypes28;
	private String _methodName29;
	private String[] _methodParameterTypes29;
	private String _methodName30;
	private String[] _methodParameterTypes30;
}