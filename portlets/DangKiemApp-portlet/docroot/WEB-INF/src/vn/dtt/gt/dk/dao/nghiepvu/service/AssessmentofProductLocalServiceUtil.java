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
 * Provides the local service utility for AssessmentofProduct. This utility wraps
 * {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.AssessmentofProductLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author win_64
 * @see AssessmentofProductLocalService
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.AssessmentofProductLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.impl.AssessmentofProductLocalServiceImpl
 * @generated
 */
public class AssessmentofProductLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.AssessmentofProductLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the assessmentof product to the database. Also notifies the appropriate model listeners.
	*
	* @param assessmentofProduct the assessmentof product
	* @return the assessmentof product that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct addAssessmentofProduct(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct assessmentofProduct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addAssessmentofProduct(assessmentofProduct);
	}

	/**
	* Creates a new assessmentof product with the primary key. Does not add the assessmentof product to the database.
	*
	* @param id the primary key for the new assessmentof product
	* @return the new assessmentof product
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct createAssessmentofProduct(
		long id) {
		return getService().createAssessmentofProduct(id);
	}

	/**
	* Deletes the assessmentof product with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessmentof product
	* @return the assessmentof product that was removed
	* @throws PortalException if a assessmentof product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct deleteAssessmentofProduct(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAssessmentofProduct(id);
	}

	/**
	* Deletes the assessmentof product from the database. Also notifies the appropriate model listeners.
	*
	* @param assessmentofProduct the assessmentof product
	* @return the assessmentof product that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct deleteAssessmentofProduct(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct assessmentofProduct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAssessmentofProduct(assessmentofProduct);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchAssessmentofProduct(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAssessmentofProduct(id);
	}

	/**
	* Returns the assessmentof product with the primary key.
	*
	* @param id the primary key of the assessmentof product
	* @return the assessmentof product
	* @throws PortalException if a assessmentof product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct getAssessmentofProduct(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssessmentofProduct(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the assessmentof products.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @return the range of assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> getAssessmentofProducts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssessmentofProducts(start, end);
	}

	/**
	* Returns the number of assessmentof products.
	*
	* @return the number of assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static int getAssessmentofProductsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssessmentofProductsCount();
	}

	/**
	* Updates the assessmentof product in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assessmentofProduct the assessmentof product
	* @return the assessmentof product that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct updateAssessmentofProduct(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct assessmentofProduct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAssessmentofProduct(assessmentofProduct);
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

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductCode(
		java.lang.String productcode, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return getService()
				   .findByProductCode(productcode, assessmentid, assessmentyear);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductName(
		java.lang.String productname, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return getService()
				   .findByProductName(productname, assessmentid, assessmentyear);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductCodeReference(
		java.lang.String productcodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return getService()
				   .findByProductCodeReference(productcodereference,
			assessmentid, assessmentyear);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductNameReference(
		java.lang.String productnamereference, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return getService()
				   .findByProductNameReference(productnamereference,
			assessmentid, assessmentyear);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductDescription(
		java.lang.String productdescription, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return getService()
				   .findByProductDescription(productdescription, assessmentid,
			assessmentyear);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductCode(
		java.lang.String productcode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear) {
		return getService()
				   .findByNextPeriodByProductCode(productcode,
			nextassessmentid, nextassessmentyear);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductName(
		java.lang.String productname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear) {
		return getService()
				   .findByNextPeriodByProductName(productname,
			nextassessmentid, nextassessmentyear);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductCodeReference(
		java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear) {
		return getService()
				   .findByNextPeriodByProductCodeReference(productcodereference,
			nextassessmentid, nextassessmentyear);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductNameReference(
		java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear) {
		return getService()
				   .findByNextPeriodByProductNameReference(productnamereference,
			nextassessmentid, nextassessmentyear);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductDescription(
		java.lang.String productdescription, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear) {
		return getService()
				   .findByNextPeriodByProductDescription(productdescription,
			nextassessmentid, nextassessmentyear);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findDanhSachDanhGiaSanPham(
		java.lang.String productcode, java.lang.String productname, int start,
		int end) {
		return getService()
				   .findDanhSachDanhGiaSanPham(productcode, productname, start,
			end);
	}

	public static int countDanhSachDanhGiaSanPham(
		java.lang.String productcode, java.lang.String productname) {
		return getService().countDanhSachDanhGiaSanPham(productcode, productname);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByAssessmentId_AssessmentYear(
		java.lang.String assessmentid, java.lang.String assessmentyear) {
		return getService()
				   .findByAssessmentId_AssessmentYear(assessmentid,
			assessmentyear);
	}

	public static void clearService() {
		_service = null;
	}

	public static AssessmentofProductLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					AssessmentofProductLocalService.class.getName());

			if (invokableLocalService instanceof AssessmentofProductLocalService) {
				_service = (AssessmentofProductLocalService)invokableLocalService;
			}
			else {
				_service = new AssessmentofProductLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(AssessmentofProductLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(AssessmentofProductLocalService service) {
	}

	private static AssessmentofProductLocalService _service;
}