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

package vn.dtt.gt.dk.dao.nghiepvu.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for ImportedXCD. This utility wraps
 * {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.ImportedXCDLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author win_64
 * @see ImportedXCDLocalService
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.ImportedXCDLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.impl.ImportedXCDLocalServiceImpl
 * @generated
 */
public class ImportedXCDLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.ImportedXCDLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the imported x c d to the database. Also notifies the appropriate model listeners.
	*
	* @param importedXCD the imported x c d
	* @return the imported x c d that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD addImportedXCD(
		vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD importedXCD)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addImportedXCD(importedXCD);
	}

	/**
	* Creates a new imported x c d with the primary key. Does not add the imported x c d to the database.
	*
	* @param id the primary key for the new imported x c d
	* @return the new imported x c d
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD createImportedXCD(
		long id) {
		return getService().createImportedXCD(id);
	}

	/**
	* Deletes the imported x c d with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the imported x c d
	* @return the imported x c d that was removed
	* @throws PortalException if a imported x c d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD deleteImportedXCD(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteImportedXCD(id);
	}

	/**
	* Deletes the imported x c d from the database. Also notifies the appropriate model listeners.
	*
	* @param importedXCD the imported x c d
	* @return the imported x c d that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD deleteImportedXCD(
		vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD importedXCD)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteImportedXCD(importedXCD);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD fetchImportedXCD(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchImportedXCD(id);
	}

	/**
	* Returns the imported x c d with the primary key.
	*
	* @param id the primary key of the imported x c d
	* @return the imported x c d
	* @throws PortalException if a imported x c d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD getImportedXCD(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getImportedXCD(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the imported x c ds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @return the range of imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> getImportedXCDs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getImportedXCDs(start, end);
	}

	/**
	* Returns the number of imported x c ds.
	*
	* @return the number of imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static int getImportedXCDsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getImportedXCDsCount();
	}

	/**
	* Updates the imported x c d in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param importedXCD the imported x c d
	* @return the imported x c d that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD updateImportedXCD(
		vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD importedXCD)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateImportedXCD(importedXCD);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findByTrangthaiDongbo(
		java.lang.String trangthai, int start, int end) {
		return getService().findByTrangthaiDongbo(trangthai, start, end);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findByIDGCN(
		java.lang.String IDGCN, long trangthai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByIDGCN(IDGCN, trangthai);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoDangKy(
		java.lang.String SoDangKy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySoDangKy(SoDangKy);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoBienBan(
		java.lang.String SoBienBan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySoBienBan(SoBienBan);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoToKhai(
		java.lang.String SoToKhai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBySoToKhai(SoToKhai);
	}

	public static void clearService() {
		_service = null;
	}

	public static ImportedXCDLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ImportedXCDLocalService.class.getName());

			if (invokableLocalService instanceof ImportedXCDLocalService) {
				_service = (ImportedXCDLocalService)invokableLocalService;
			}
			else {
				_service = new ImportedXCDLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ImportedXCDLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ImportedXCDLocalService service) {
	}

	private static ImportedXCDLocalService _service;
}