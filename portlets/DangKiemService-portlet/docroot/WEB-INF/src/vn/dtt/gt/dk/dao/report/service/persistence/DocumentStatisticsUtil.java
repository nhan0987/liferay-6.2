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

package vn.dtt.gt.dk.dao.report.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.dao.report.model.DocumentStatistics;

import java.util.List;

/**
 * The persistence utility for the document statistics service. This utility wraps {@link DocumentStatisticsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DocumentStatisticsPersistence
 * @see DocumentStatisticsPersistenceImpl
 * @generated
 */
public class DocumentStatisticsUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(DocumentStatistics documentStatistics) {
		getPersistence().clearCache(documentStatistics);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DocumentStatistics> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DocumentStatistics> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DocumentStatistics> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DocumentStatistics update(
		DocumentStatistics documentStatistics) throws SystemException {
		return getPersistence().update(documentStatistics);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DocumentStatistics update(
		DocumentStatistics documentStatistics, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(documentStatistics, serviceContext);
	}

	/**
	* Returns all the document statisticses where documentTypeCode = &#63;.
	*
	* @param documentTypeCode the document type code
	* @return the matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByDocumentTypeCode(
		java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDocumentTypeCode(documentTypeCode);
	}

	/**
	* Returns a range of all the document statisticses where documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentTypeCode the document type code
	* @param start the lower bound of the range of document statisticses
	* @param end the upper bound of the range of document statisticses (not inclusive)
	* @return the range of matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByDocumentTypeCode(
		java.lang.String documentTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentTypeCode(documentTypeCode, start, end);
	}

	/**
	* Returns an ordered range of all the document statisticses where documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param documentTypeCode the document type code
	* @param start the lower bound of the range of document statisticses
	* @param end the upper bound of the range of document statisticses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByDocumentTypeCode(
		java.lang.String documentTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentTypeCode(documentTypeCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first document statistics in the ordered set where documentTypeCode = &#63;.
	*
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document statistics
	* @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics findByDocumentTypeCode_First(
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException {
		return getPersistence()
				   .findByDocumentTypeCode_First(documentTypeCode,
			orderByComparator);
	}

	/**
	* Returns the first document statistics in the ordered set where documentTypeCode = &#63;.
	*
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document statistics, or <code>null</code> if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByDocumentTypeCode_First(
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentTypeCode_First(documentTypeCode,
			orderByComparator);
	}

	/**
	* Returns the last document statistics in the ordered set where documentTypeCode = &#63;.
	*
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document statistics
	* @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics findByDocumentTypeCode_Last(
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException {
		return getPersistence()
				   .findByDocumentTypeCode_Last(documentTypeCode,
			orderByComparator);
	}

	/**
	* Returns the last document statistics in the ordered set where documentTypeCode = &#63;.
	*
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document statistics, or <code>null</code> if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByDocumentTypeCode_Last(
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentTypeCode_Last(documentTypeCode,
			orderByComparator);
	}

	/**
	* Returns the document statisticses before and after the current document statistics in the ordered set where documentTypeCode = &#63;.
	*
	* @param id the primary key of the current document statistics
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next document statistics
	* @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a document statistics with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics[] findByDocumentTypeCode_PrevAndNext(
		long id, java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException {
		return getPersistence()
				   .findByDocumentTypeCode_PrevAndNext(id, documentTypeCode,
			orderByComparator);
	}

	/**
	* Removes all the document statisticses where documentTypeCode = &#63; from the database.
	*
	* @param documentTypeCode the document type code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocumentTypeCode(
		java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDocumentTypeCode(documentTypeCode);
	}

	/**
	* Returns the number of document statisticses where documentTypeCode = &#63;.
	*
	* @param documentTypeCode the document type code
	* @return the number of matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumentTypeCode(java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDocumentTypeCode(documentTypeCode);
	}

	/**
	* Returns the document statistics where documentTypeCode = &#63; and year = &#63; and month = &#63; or throws a {@link vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException} if it could not be found.
	*
	* @param documentTypeCode the document type code
	* @param year the year
	* @param month the month
	* @return the matching document statistics
	* @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics findByDTC_Y_M(
		java.lang.String documentTypeCode, int year, int month)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException {
		return getPersistence().findByDTC_Y_M(documentTypeCode, year, month);
	}

	/**
	* Returns the document statistics where documentTypeCode = &#63; and year = &#63; and month = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param documentTypeCode the document type code
	* @param year the year
	* @param month the month
	* @return the matching document statistics, or <code>null</code> if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByDTC_Y_M(
		java.lang.String documentTypeCode, int year, int month)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByDTC_Y_M(documentTypeCode, year, month);
	}

	/**
	* Returns the document statistics where documentTypeCode = &#63; and year = &#63; and month = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param documentTypeCode the document type code
	* @param year the year
	* @param month the month
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching document statistics, or <code>null</code> if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByDTC_Y_M(
		java.lang.String documentTypeCode, int year, int month,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDTC_Y_M(documentTypeCode, year, month,
			retrieveFromCache);
	}

	/**
	* Removes the document statistics where documentTypeCode = &#63; and year = &#63; and month = &#63; from the database.
	*
	* @param documentTypeCode the document type code
	* @param year the year
	* @param month the month
	* @return the document statistics that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics removeByDTC_Y_M(
		java.lang.String documentTypeCode, int year, int month)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException {
		return getPersistence().removeByDTC_Y_M(documentTypeCode, year, month);
	}

	/**
	* Returns the number of document statisticses where documentTypeCode = &#63; and year = &#63; and month = &#63;.
	*
	* @param documentTypeCode the document type code
	* @param year the year
	* @param month the month
	* @return the number of matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDTC_Y_M(java.lang.String documentTypeCode,
		int year, int month)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDTC_Y_M(documentTypeCode, year, month);
	}

	/**
	* Returns all the document statisticses where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @return the matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByYear_Month(
		int year, int month)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByYear_Month(year, month);
	}

	/**
	* Returns a range of all the document statisticses where year = &#63; and month = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param year the year
	* @param month the month
	* @param start the lower bound of the range of document statisticses
	* @param end the upper bound of the range of document statisticses (not inclusive)
	* @return the range of matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByYear_Month(
		int year, int month, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByYear_Month(year, month, start, end);
	}

	/**
	* Returns an ordered range of all the document statisticses where year = &#63; and month = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param year the year
	* @param month the month
	* @param start the lower bound of the range of document statisticses
	* @param end the upper bound of the range of document statisticses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByYear_Month(
		int year, int month, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByYear_Month(year, month, start, end, orderByComparator);
	}

	/**
	* Returns the first document statistics in the ordered set where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document statistics
	* @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics findByYear_Month_First(
		int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException {
		return getPersistence()
				   .findByYear_Month_First(year, month, orderByComparator);
	}

	/**
	* Returns the first document statistics in the ordered set where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document statistics, or <code>null</code> if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByYear_Month_First(
		int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByYear_Month_First(year, month, orderByComparator);
	}

	/**
	* Returns the last document statistics in the ordered set where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document statistics
	* @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics findByYear_Month_Last(
		int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException {
		return getPersistence()
				   .findByYear_Month_Last(year, month, orderByComparator);
	}

	/**
	* Returns the last document statistics in the ordered set where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document statistics, or <code>null</code> if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByYear_Month_Last(
		int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByYear_Month_Last(year, month, orderByComparator);
	}

	/**
	* Returns the document statisticses before and after the current document statistics in the ordered set where year = &#63; and month = &#63;.
	*
	* @param id the primary key of the current document statistics
	* @param year the year
	* @param month the month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next document statistics
	* @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a document statistics with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics[] findByYear_Month_PrevAndNext(
		long id, int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException {
		return getPersistence()
				   .findByYear_Month_PrevAndNext(id, year, month,
			orderByComparator);
	}

	/**
	* Removes all the document statisticses where year = &#63; and month = &#63; from the database.
	*
	* @param year the year
	* @param month the month
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByYear_Month(int year, int month)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByYear_Month(year, month);
	}

	/**
	* Returns the number of document statisticses where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @return the number of matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByYear_Month(int year, int month)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByYear_Month(year, month);
	}

	/**
	* Returns all the document statisticses where year = &#63; and month = &#63; and status = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param status the status
	* @return the matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByYear_Month_Status(
		int year, int month, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByYear_Month_Status(year, month, status);
	}

	/**
	* Returns a range of all the document statisticses where year = &#63; and month = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param year the year
	* @param month the month
	* @param status the status
	* @param start the lower bound of the range of document statisticses
	* @param end the upper bound of the range of document statisticses (not inclusive)
	* @return the range of matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByYear_Month_Status(
		int year, int month, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByYear_Month_Status(year, month, status, start, end);
	}

	/**
	* Returns an ordered range of all the document statisticses where year = &#63; and month = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param year the year
	* @param month the month
	* @param status the status
	* @param start the lower bound of the range of document statisticses
	* @param end the upper bound of the range of document statisticses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByYear_Month_Status(
		int year, int month, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByYear_Month_Status(year, month, status, start, end,
			orderByComparator);
	}

	/**
	* Returns the first document statistics in the ordered set where year = &#63; and month = &#63; and status = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document statistics
	* @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics findByYear_Month_Status_First(
		int year, int month, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException {
		return getPersistence()
				   .findByYear_Month_Status_First(year, month, status,
			orderByComparator);
	}

	/**
	* Returns the first document statistics in the ordered set where year = &#63; and month = &#63; and status = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document statistics, or <code>null</code> if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByYear_Month_Status_First(
		int year, int month, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByYear_Month_Status_First(year, month, status,
			orderByComparator);
	}

	/**
	* Returns the last document statistics in the ordered set where year = &#63; and month = &#63; and status = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document statistics
	* @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics findByYear_Month_Status_Last(
		int year, int month, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException {
		return getPersistence()
				   .findByYear_Month_Status_Last(year, month, status,
			orderByComparator);
	}

	/**
	* Returns the last document statistics in the ordered set where year = &#63; and month = &#63; and status = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document statistics, or <code>null</code> if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByYear_Month_Status_Last(
		int year, int month, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByYear_Month_Status_Last(year, month, status,
			orderByComparator);
	}

	/**
	* Returns the document statisticses before and after the current document statistics in the ordered set where year = &#63; and month = &#63; and status = &#63;.
	*
	* @param id the primary key of the current document statistics
	* @param year the year
	* @param month the month
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next document statistics
	* @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a document statistics with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics[] findByYear_Month_Status_PrevAndNext(
		long id, int year, int month, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException {
		return getPersistence()
				   .findByYear_Month_Status_PrevAndNext(id, year, month,
			status, orderByComparator);
	}

	/**
	* Removes all the document statisticses where year = &#63; and month = &#63; and status = &#63; from the database.
	*
	* @param year the year
	* @param month the month
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByYear_Month_Status(int year, int month, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByYear_Month_Status(year, month, status);
	}

	/**
	* Returns the number of document statisticses where year = &#63; and month = &#63; and status = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param status the status
	* @return the number of matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByYear_Month_Status(int year, int month, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByYear_Month_Status(year, month, status);
	}

	/**
	* Returns all the document statisticses where status = &#63;.
	*
	* @param status the status
	* @return the matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByStatus(
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStatus(status);
	}

	/**
	* Returns a range of all the document statisticses where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of document statisticses
	* @param end the upper bound of the range of document statisticses (not inclusive)
	* @return the range of matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByStatus(
		int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStatus(status, start, end);
	}

	/**
	* Returns an ordered range of all the document statisticses where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of document statisticses
	* @param end the upper bound of the range of document statisticses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator);
	}

	/**
	* Returns the first document statistics in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document statistics
	* @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics findByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException {
		return getPersistence().findByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the first document statistics in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document statistics, or <code>null</code> if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the last document statistics in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document statistics
	* @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics findByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException {
		return getPersistence().findByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the last document statistics in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document statistics, or <code>null</code> if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the document statisticses before and after the current document statistics in the ordered set where status = &#63;.
	*
	* @param id the primary key of the current document statistics
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next document statistics
	* @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a document statistics with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics[] findByStatus_PrevAndNext(
		long id, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException {
		return getPersistence()
				   .findByStatus_PrevAndNext(id, status, orderByComparator);
	}

	/**
	* Removes all the document statisticses where status = &#63; from the database.
	*
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByStatus(int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByStatus(status);
	}

	/**
	* Returns the number of document statisticses where status = &#63;.
	*
	* @param status the status
	* @return the number of matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByStatus(int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByStatus(status);
	}

	/**
	* Caches the document statistics in the entity cache if it is enabled.
	*
	* @param documentStatistics the document statistics
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.report.model.DocumentStatistics documentStatistics) {
		getPersistence().cacheResult(documentStatistics);
	}

	/**
	* Caches the document statisticses in the entity cache if it is enabled.
	*
	* @param documentStatisticses the document statisticses
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> documentStatisticses) {
		getPersistence().cacheResult(documentStatisticses);
	}

	/**
	* Creates a new document statistics with the primary key. Does not add the document statistics to the database.
	*
	* @param id the primary key for the new document statistics
	* @return the new document statistics
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the document statistics with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the document statistics
	* @return the document statistics that was removed
	* @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a document statistics with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics updateImpl(
		vn.dtt.gt.dk.dao.report.model.DocumentStatistics documentStatistics)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(documentStatistics);
	}

	/**
	* Returns the document statistics with the primary key or throws a {@link vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException} if it could not be found.
	*
	* @param id the primary key of the document statistics
	* @return the document statistics
	* @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a document statistics with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the document statistics with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the document statistics
	* @return the document statistics, or <code>null</code> if a document statistics with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the document statisticses.
	*
	* @return the document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the document statisticses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of document statisticses
	* @param end the upper bound of the range of document statisticses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the document statisticses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of document statisticses.
	*
	* @return the number of document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DocumentStatisticsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DocumentStatisticsPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.report.service.ClpSerializer.getServletContextName(),
					DocumentStatisticsPersistence.class.getName());

			ReferenceRegistry.registerReference(DocumentStatisticsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DocumentStatisticsPersistence persistence) {
	}

	private static DocumentStatisticsPersistence _persistence;
}