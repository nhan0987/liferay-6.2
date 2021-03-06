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
 * Provides the local service utility for CfgTechnicalspec. This utility wraps
 * {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.CfgTechnicalspecLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author huymq
 * @see CfgTechnicalspecLocalService
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.CfgTechnicalspecLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.impl.CfgTechnicalspecLocalServiceImpl
 * @generated
 */
public class CfgTechnicalspecLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.CfgTechnicalspecLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the cfg technicalspec to the database. Also notifies the appropriate model listeners.
	*
	* @param cfgTechnicalspec the cfg technicalspec
	* @return the cfg technicalspec that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec addCfgTechnicalspec(
		vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec cfgTechnicalspec)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addCfgTechnicalspec(cfgTechnicalspec);
	}

	/**
	* Creates a new cfg technicalspec with the primary key. Does not add the cfg technicalspec to the database.
	*
	* @param id the primary key for the new cfg technicalspec
	* @return the new cfg technicalspec
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec createCfgTechnicalspec(
		long id) {
		return getService().createCfgTechnicalspec(id);
	}

	/**
	* Deletes the cfg technicalspec with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the cfg technicalspec
	* @return the cfg technicalspec that was removed
	* @throws PortalException if a cfg technicalspec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec deleteCfgTechnicalspec(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCfgTechnicalspec(id);
	}

	/**
	* Deletes the cfg technicalspec from the database. Also notifies the appropriate model listeners.
	*
	* @param cfgTechnicalspec the cfg technicalspec
	* @return the cfg technicalspec that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec deleteCfgTechnicalspec(
		vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec cfgTechnicalspec)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCfgTechnicalspec(cfgTechnicalspec);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec fetchCfgTechnicalspec(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCfgTechnicalspec(id);
	}

	/**
	* Returns the cfg technicalspec with the primary key.
	*
	* @param id the primary key of the cfg technicalspec
	* @return the cfg technicalspec
	* @throws PortalException if a cfg technicalspec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec getCfgTechnicalspec(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCfgTechnicalspec(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the cfg technicalspecs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cfg technicalspecs
	* @param end the upper bound of the range of cfg technicalspecs (not inclusive)
	* @return the range of cfg technicalspecs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> getCfgTechnicalspecs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCfgTechnicalspecs(start, end);
	}

	/**
	* Returns the number of cfg technicalspecs.
	*
	* @return the number of cfg technicalspecs
	* @throws SystemException if a system exception occurred
	*/
	public static int getCfgTechnicalspecsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCfgTechnicalspecsCount();
	}

	/**
	* Updates the cfg technicalspec in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cfgTechnicalspec the cfg technicalspec
	* @return the cfg technicalspec that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec updateCfgTechnicalspec(
		vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec cfgTechnicalspec)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCfgTechnicalspec(cfgTechnicalspec);
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

	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec findBySpecificationCode(
		java.lang.String specificationCode) {
		return getService().findBySpecificationCode(specificationCode);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> findByLikeVehicleTypeCode(
		java.lang.String likeVehicleTypeCode, int start, int end) {
		return getService()
				   .findByLikeVehicleTypeCode(likeVehicleTypeCode, start, end);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> findByVehicleTypeCode(
		java.lang.String vehicleTypeCode) {
		return getService().findByVehicleTypeCode(vehicleTypeCode);
	}

	public static java.util.List<java.lang.String> getSpecCategoryByVehicleTypeCode(
		java.lang.String vehicleTypeCode) {
		return getService().getSpecCategoryByVehicleTypeCode(vehicleTypeCode);
	}

	public static java.util.List<java.lang.String> getSpecificationCodeBySpecCategory(
		java.lang.String[] specCategorys) {
		return getService().getSpecificationCodeBySpecCategory(specCategorys);
	}

	public static void clearService() {
		_service = null;
	}

	public static CfgTechnicalspecLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CfgTechnicalspecLocalService.class.getName());

			if (invokableLocalService instanceof CfgTechnicalspecLocalService) {
				_service = (CfgTechnicalspecLocalService)invokableLocalService;
			}
			else {
				_service = new CfgTechnicalspecLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(CfgTechnicalspecLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CfgTechnicalspecLocalService service) {
	}

	private static CfgTechnicalspecLocalService _service;
}