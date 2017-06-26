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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AssessmentofProductLocalService}.
 *
 * @author win_64
 * @see AssessmentofProductLocalService
 * @generated
 */
public class AssessmentofProductLocalServiceWrapper
	implements AssessmentofProductLocalService,
		ServiceWrapper<AssessmentofProductLocalService> {
	public AssessmentofProductLocalServiceWrapper(
		AssessmentofProductLocalService assessmentofProductLocalService) {
		_assessmentofProductLocalService = assessmentofProductLocalService;
	}

	/**
	* Adds the assessmentof product to the database. Also notifies the appropriate model listeners.
	*
	* @param assessmentofProduct the assessmentof product
	* @return the assessmentof product that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct addAssessmentofProduct(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct assessmentofProduct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofProductLocalService.addAssessmentofProduct(assessmentofProduct);
	}

	/**
	* Creates a new assessmentof product with the primary key. Does not add the assessmentof product to the database.
	*
	* @param id the primary key for the new assessmentof product
	* @return the new assessmentof product
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct createAssessmentofProduct(
		long id) {
		return _assessmentofProductLocalService.createAssessmentofProduct(id);
	}

	/**
	* Deletes the assessmentof product with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessmentof product
	* @return the assessmentof product that was removed
	* @throws PortalException if a assessmentof product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct deleteAssessmentofProduct(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofProductLocalService.deleteAssessmentofProduct(id);
	}

	/**
	* Deletes the assessmentof product from the database. Also notifies the appropriate model listeners.
	*
	* @param assessmentofProduct the assessmentof product
	* @return the assessmentof product that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct deleteAssessmentofProduct(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct assessmentofProduct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofProductLocalService.deleteAssessmentofProduct(assessmentofProduct);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assessmentofProductLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofProductLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofProductLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofProductLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofProductLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofProductLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchAssessmentofProduct(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofProductLocalService.fetchAssessmentofProduct(id);
	}

	/**
	* Returns the assessmentof product with the primary key.
	*
	* @param id the primary key of the assessmentof product
	* @return the assessmentof product
	* @throws PortalException if a assessmentof product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct getAssessmentofProduct(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofProductLocalService.getAssessmentofProduct(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofProductLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> getAssessmentofProducts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofProductLocalService.getAssessmentofProducts(start,
			end);
	}

	/**
	* Returns the number of assessmentof products.
	*
	* @return the number of assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAssessmentofProductsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofProductLocalService.getAssessmentofProductsCount();
	}

	/**
	* Updates the assessmentof product in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assessmentofProduct the assessmentof product
	* @return the assessmentof product that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct updateAssessmentofProduct(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct assessmentofProduct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofProductLocalService.updateAssessmentofProduct(assessmentofProduct);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _assessmentofProductLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_assessmentofProductLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _assessmentofProductLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductCode(
		java.lang.String productcode, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return _assessmentofProductLocalService.findByProductCode(productcode,
			assessmentid, assessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductName(
		java.lang.String productname, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return _assessmentofProductLocalService.findByProductName(productname,
			assessmentid, assessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductCodeReference(
		java.lang.String productcodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return _assessmentofProductLocalService.findByProductCodeReference(productcodereference,
			assessmentid, assessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductNameReference(
		java.lang.String productnamereference, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return _assessmentofProductLocalService.findByProductNameReference(productnamereference,
			assessmentid, assessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductDescription(
		java.lang.String productdescription, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return _assessmentofProductLocalService.findByProductDescription(productdescription,
			assessmentid, assessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductCode(
		java.lang.String productcode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear) {
		return _assessmentofProductLocalService.findByNextPeriodByProductCode(productcode,
			nextassessmentid, nextassessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductName(
		java.lang.String productname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear) {
		return _assessmentofProductLocalService.findByNextPeriodByProductName(productname,
			nextassessmentid, nextassessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductCodeReference(
		java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear) {
		return _assessmentofProductLocalService.findByNextPeriodByProductCodeReference(productcodereference,
			nextassessmentid, nextassessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductNameReference(
		java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear) {
		return _assessmentofProductLocalService.findByNextPeriodByProductNameReference(productnamereference,
			nextassessmentid, nextassessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductDescription(
		java.lang.String productdescription, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear) {
		return _assessmentofProductLocalService.findByNextPeriodByProductDescription(productdescription,
			nextassessmentid, nextassessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findDanhSachDanhGiaSanPham(
		java.lang.String productcode, java.lang.String productname, int start,
		int end) {
		return _assessmentofProductLocalService.findDanhSachDanhGiaSanPham(productcode,
			productname, start, end);
	}

	@Override
	public int countDanhSachDanhGiaSanPham(java.lang.String productcode,
		java.lang.String productname) {
		return _assessmentofProductLocalService.countDanhSachDanhGiaSanPham(productcode,
			productname);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByAssessmentId_AssessmentYear(
		java.lang.String assessmentid, java.lang.String assessmentyear) {
		return _assessmentofProductLocalService.findByAssessmentId_AssessmentYear(assessmentid,
			assessmentyear);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AssessmentofProductLocalService getWrappedAssessmentofProductLocalService() {
		return _assessmentofProductLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAssessmentofProductLocalService(
		AssessmentofProductLocalService assessmentofProductLocalService) {
		_assessmentofProductLocalService = assessmentofProductLocalService;
	}

	@Override
	public AssessmentofProductLocalService getWrappedService() {
		return _assessmentofProductLocalService;
	}

	@Override
	public void setWrappedService(
		AssessmentofProductLocalService assessmentofProductLocalService) {
		_assessmentofProductLocalService = assessmentofProductLocalService;
	}

	private AssessmentofProductLocalService _assessmentofProductLocalService;
}