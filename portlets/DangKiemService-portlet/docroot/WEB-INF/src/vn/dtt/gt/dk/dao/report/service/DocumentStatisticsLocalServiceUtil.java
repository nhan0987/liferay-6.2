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

package vn.dtt.gt.dk.dao.report.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for DocumentStatistics. This utility wraps
 * {@link vn.dtt.gt.dk.dao.report.service.impl.DocumentStatisticsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author win_64
 * @see DocumentStatisticsLocalService
 * @see vn.dtt.gt.dk.dao.report.service.base.DocumentStatisticsLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.report.service.impl.DocumentStatisticsLocalServiceImpl
 * @generated
 */
public class DocumentStatisticsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.report.service.impl.DocumentStatisticsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the document statistics to the database. Also notifies the appropriate model listeners.
	*
	* @param documentStatistics the document statistics
	* @return the document statistics that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics addDocumentStatistics(
		vn.dtt.gt.dk.dao.report.model.DocumentStatistics documentStatistics)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDocumentStatistics(documentStatistics);
	}

	/**
	* Creates a new document statistics with the primary key. Does not add the document statistics to the database.
	*
	* @param id the primary key for the new document statistics
	* @return the new document statistics
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics createDocumentStatistics(
		long id) {
		return getService().createDocumentStatistics(id);
	}

	/**
	* Deletes the document statistics with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the document statistics
	* @return the document statistics that was removed
	* @throws PortalException if a document statistics with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics deleteDocumentStatistics(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDocumentStatistics(id);
	}

	/**
	* Deletes the document statistics from the database. Also notifies the appropriate model listeners.
	*
	* @param documentStatistics the document statistics
	* @return the document statistics that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics deleteDocumentStatistics(
		vn.dtt.gt.dk.dao.report.model.DocumentStatistics documentStatistics)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDocumentStatistics(documentStatistics);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchDocumentStatistics(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDocumentStatistics(id);
	}

	/**
	* Returns the document statistics with the primary key.
	*
	* @param id the primary key of the document statistics
	* @return the document statistics
	* @throws PortalException if a document statistics with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics getDocumentStatistics(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocumentStatistics(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the document statisticses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of document statisticses
	* @param end the upper bound of the range of document statisticses (not inclusive)
	* @return the range of document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> getDocumentStatisticses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocumentStatisticses(start, end);
	}

	/**
	* Returns the number of document statisticses.
	*
	* @return the number of document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static int getDocumentStatisticsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocumentStatisticsesCount();
	}

	/**
	* Updates the document statistics in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param documentStatistics the document statistics
	* @return the document statistics that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics updateDocumentStatistics(
		vn.dtt.gt.dk.dao.report.model.DocumentStatistics documentStatistics)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDocumentStatistics(documentStatistics);
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

	public static java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> getListDocumentStatistics(
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getListDocumentStatistics(status);
	}

	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByDocumentTypeCodeYearMonth(
		java.lang.String documentTypeCode, int year, int month)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchByDocumentTypeCodeYearMonth(documentTypeCode, year,
			month);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> getByYear_Month(
		int year, int month)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByYear_Month(year, month);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> getByYear_Month_Status(
		int year, int month, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByYear_Month_Status(year, month, status);
	}

	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics getByDocumentTypeCodeYearMonth(
		java.lang.String documentTypeCode, int year, int month)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByDocumentTypeCodeYearMonth(documentTypeCode, year, month);
	}

	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics updateStatus(
		vn.dtt.gt.dk.dao.report.model.DocumentStatistics documentStatistics,
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateStatus(documentStatistics, status);
	}

	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics updateDocumentStatistics(
		int year, int month, java.lang.String documentTypeCode,
		long remainingNumber, long receivedNumber, long processingNumber,
		long ontimeNumber, long overtimeNumber, long delayingNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDocumentStatistics(year, month, documentTypeCode,
			remainingNumber, receivedNumber, processingNumber, ontimeNumber,
			overtimeNumber, delayingNumber);
	}

	public static void clearService() {
		_service = null;
	}

	public static DocumentStatisticsLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DocumentStatisticsLocalService.class.getName());

			if (invokableLocalService instanceof DocumentStatisticsLocalService) {
				_service = (DocumentStatisticsLocalService)invokableLocalService;
			}
			else {
				_service = new DocumentStatisticsLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DocumentStatisticsLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DocumentStatisticsLocalService service) {
	}

	private static DocumentStatisticsLocalService _service;
}