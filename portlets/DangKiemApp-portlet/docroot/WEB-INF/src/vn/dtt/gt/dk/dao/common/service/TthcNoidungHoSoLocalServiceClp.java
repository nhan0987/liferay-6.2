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
public class TthcNoidungHoSoLocalServiceClp
	implements TthcNoidungHoSoLocalService {
	public TthcNoidungHoSoLocalServiceClp(
		InvokableLocalService invokableLocalService) {
		_invokableLocalService = invokableLocalService;

		_methodName0 = "addTthcNoidungHoSo";

		_methodParameterTypes0 = new String[] {
				"vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo"
			};

		_methodName1 = "createTthcNoidungHoSo";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteTthcNoidungHoSo";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteTthcNoidungHoSo";

		_methodParameterTypes3 = new String[] {
				"vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo"
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

		_methodName10 = "fetchTthcNoidungHoSo";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getTthcNoidungHoSo";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getTthcNoidungHoSos";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getTthcNoidungHoSosCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateTthcNoidungHoSo";

		_methodParameterTypes15 = new String[] {
				"vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo"
			};

		_methodName16 = "getBeanIdentifier";

		_methodParameterTypes16 = new String[] {  };

		_methodName17 = "setBeanIdentifier";

		_methodParameterTypes17 = new String[] { "java.lang.String" };

		_methodName19 = "findTthcBieuMauHoSoByThuTucHanhChinhId";

		_methodParameterTypes19 = new String[] { "long", "long" };

		_methodName20 = "findByVehicleRecordId";

		_methodParameterTypes20 = new String[] { "long" };

		_methodName21 = "findTthcBieuMauHoSoByThuTucHanhChinhIdFinder";

		_methodParameterTypes21 = new String[] { "long", "long" };

		_methodName22 = "findTthcBieuMauHoSoByThuTucHanhChinhIdFinderEnd";

		_methodParameterTypes22 = new String[] { "long", "long" };

		_methodName23 = "findLastByHoSoThuTucIdAndMaBieuMau";

		_methodParameterTypes23 = new String[] { "long", "java.lang.String" };

		_methodName24 = "findBDKByHoSoThuTucIdAndTthcId";

		_methodParameterTypes24 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName25 = "countByBieuMauHoSoIdAndHoSoThuTucId";

		_methodParameterTypes25 = new String[] { "long", "long" };

		_methodName26 = "findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh";

		_methodParameterTypes26 = new String[] {
				"long", "long", "java.lang.String"
			};

		_methodName27 = "findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinder";

		_methodParameterTypes27 = new String[] {
				"long", "long", "java.lang.String"
			};

		_methodName28 = "findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinderEnd";

		_methodParameterTypes28 = new String[] {
				"long", "long", "java.lang.String"
			};

		_methodName29 = "findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucId";

		_methodParameterTypes29 = new String[] { "long", "long" };

		_methodName30 = "findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucIdLanCuoi";

		_methodParameterTypes30 = new String[] { "long", "long" };

		_methodName31 = "findBieuMauHoSoIdAndHoSoThuTucId";

		_methodParameterTypes31 = new String[] { "long", "java.lang.String" };

		_methodName32 = "findBieuMauHoSoIdAndHoSoThuTucId";

		_methodParameterTypes32 = new String[] {
				"long", "java.lang.String", "java.lang.String"
			};

		_methodName33 = "countSoLuongKySo";

		_methodParameterTypes33 = new String[] { "long" };

		_methodName34 = "countSoLuongDaDongDau";

		_methodParameterTypes34 = new String[] { "long" };
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo addTthcNoidungHoSo(
		vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo tthcNoidungHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName0,
					_methodParameterTypes0,
					new Object[] { ClpSerializer.translateInput(tthcNoidungHoSo) });
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

		return (vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo createTthcNoidungHoSo(
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

		return (vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo deleteTthcNoidungHoSo(
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

		return (vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo deleteTthcNoidungHoSo(
		vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo tthcNoidungHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName3,
					_methodParameterTypes3,
					new Object[] { ClpSerializer.translateInput(tthcNoidungHoSo) });
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

		return (vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo)ClpSerializer.translateOutput(returnObj);
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
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo fetchTthcNoidungHoSo(
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

		return (vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo getTthcNoidungHoSo(
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

		return (vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo)ClpSerializer.translateOutput(returnObj);
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
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> getTthcNoidungHoSos(
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

		return (java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int getTthcNoidungHoSosCount()
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
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo updateTthcNoidungHoSo(
		vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo tthcNoidungHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName15,
					_methodParameterTypes15,
					new Object[] { ClpSerializer.translateInput(tthcNoidungHoSo) });
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

		return (vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo)ClpSerializer.translateOutput(returnObj);
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
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findTthcBieuMauHoSoByThuTucHanhChinhId(
		long hoSoThuTucId, long bieuMauHoSoId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName19,
					_methodParameterTypes19,
					new Object[] { hoSoThuTucId, bieuMauHoSoId });
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

		return (java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo findByVehicleRecordId(
		long vehicleRecordId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName20,
					_methodParameterTypes20, new Object[] { vehicleRecordId });
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

		return (vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findTthcBieuMauHoSoByThuTucHanhChinhIdFinder(
		long hoSoThuTucId, long bieuMauHoSoId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName21,
					_methodParameterTypes21,
					new Object[] { hoSoThuTucId, bieuMauHoSoId });
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

		return (java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findTthcBieuMauHoSoByThuTucHanhChinhIdFinderEnd(
		long hoSoThuTucId, long bieuMauHoSoId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName22,
					_methodParameterTypes22,
					new Object[] { hoSoThuTucId, bieuMauHoSoId });
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

		return (java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo findLastByHoSoThuTucIdAndMaBieuMau(
		long hoSoThuTucId, java.lang.String maBieuMau) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName23,
					_methodParameterTypes23,
					new Object[] {
						hoSoThuTucId,
						
					ClpSerializer.translateInput(maBieuMau)
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

		return (vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo findBDKByHoSoThuTucIdAndTthcId(
		java.lang.String hoSoThuTucId, java.lang.String tthcId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName24,
					_methodParameterTypes24,
					new Object[] {
						ClpSerializer.translateInput(hoSoThuTucId),
						
					ClpSerializer.translateInput(tthcId)
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

		return (vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int countByBieuMauHoSoIdAndHoSoThuTucId(long hoSoThuTucId,
		long bieuMauHoSoId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName25,
					_methodParameterTypes25,
					new Object[] { hoSoThuTucId, bieuMauHoSoId });
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
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName26,
					_methodParameterTypes26,
					new Object[] {
						hoSoThuTucId,
						
					bieuMauHoSoId,
						
					ClpSerializer.translateInput(maTuSinh)
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

		return (java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinder(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName27,
					_methodParameterTypes27,
					new Object[] {
						hoSoThuTucId,
						
					bieuMauHoSoId,
						
					ClpSerializer.translateInput(maTuSinh)
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

		return (java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinderEnd(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName28,
					_methodParameterTypes28,
					new Object[] {
						hoSoThuTucId,
						
					bieuMauHoSoId,
						
					ClpSerializer.translateInput(maTuSinh)
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

		return (java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucId(
		long hoSoThuTucId, long bieuMauHoSoId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName29,
					_methodParameterTypes29,
					new Object[] { hoSoThuTucId, bieuMauHoSoId });
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

		return (java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucIdLanCuoi(
		long hoSoThuTucId, long bieuMauHoSoId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName30,
					_methodParameterTypes30,
					new Object[] { hoSoThuTucId, bieuMauHoSoId });
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

		return (java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucId(
		long hoSoThuTucId, java.lang.String mauTrucTuyen) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName31,
					_methodParameterTypes31,
					new Object[] {
						hoSoThuTucId,
						
					ClpSerializer.translateInput(mauTrucTuyen)
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

		return (java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucId(
		long hoSoThuTucId, java.lang.String mauTrucTuyen1,
		java.lang.String mauTrucTuyen2) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName32,
					_methodParameterTypes32,
					new Object[] {
						hoSoThuTucId,
						
					ClpSerializer.translateInput(mauTrucTuyen1),
						
					ClpSerializer.translateInput(mauTrucTuyen2)
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

		return (java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int countSoLuongKySo(long phieuXuLyPhuId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName33,
					_methodParameterTypes33, new Object[] { phieuXuLyPhuId });
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
	public int countSoLuongDaDongDau(long phieuXuLyPhuId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName34,
					_methodParameterTypes34, new Object[] { phieuXuLyPhuId });
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
	private String _methodName31;
	private String[] _methodParameterTypes31;
	private String _methodName32;
	private String[] _methodParameterTypes32;
	private String _methodName33;
	private String[] _methodParameterTypes33;
	private String _methodName34;
	private String[] _methodParameterTypes34;
}