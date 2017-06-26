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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.gt.dk.dao.report.model.DocumentStatistics;

/**
 * The persistence interface for the document statistics service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DocumentStatisticsPersistenceImpl
 * @see DocumentStatisticsUtil
 * @generated
 */
public interface DocumentStatisticsPersistence extends BasePersistence<DocumentStatistics> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DocumentStatisticsUtil} to access the document statistics persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the document statisticses where documentTypeCode = &#63;.
	*
	* @param documentTypeCode the document type code
	* @return the matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByDocumentTypeCode(
		java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByDocumentTypeCode(
		java.lang.String documentTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByDocumentTypeCode(
		java.lang.String documentTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first document statistics in the ordered set where documentTypeCode = &#63;.
	*
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document statistics
	* @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics findByDocumentTypeCode_First(
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException;

	/**
	* Returns the first document statistics in the ordered set where documentTypeCode = &#63;.
	*
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document statistics, or <code>null</code> if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByDocumentTypeCode_First(
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last document statistics in the ordered set where documentTypeCode = &#63;.
	*
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document statistics
	* @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics findByDocumentTypeCode_Last(
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException;

	/**
	* Returns the last document statistics in the ordered set where documentTypeCode = &#63;.
	*
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document statistics, or <code>null</code> if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByDocumentTypeCode_Last(
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics[] findByDocumentTypeCode_PrevAndNext(
		long id, java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException;

	/**
	* Removes all the document statisticses where documentTypeCode = &#63; from the database.
	*
	* @param documentTypeCode the document type code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocumentTypeCode(java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of document statisticses where documentTypeCode = &#63;.
	*
	* @param documentTypeCode the document type code
	* @return the number of matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumentTypeCode(java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics findByDTC_Y_M(
		java.lang.String documentTypeCode, int year, int month)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException;

	/**
	* Returns the document statistics where documentTypeCode = &#63; and year = &#63; and month = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param documentTypeCode the document type code
	* @param year the year
	* @param month the month
	* @return the matching document statistics, or <code>null</code> if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByDTC_Y_M(
		java.lang.String documentTypeCode, int year, int month)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByDTC_Y_M(
		java.lang.String documentTypeCode, int year, int month,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the document statistics where documentTypeCode = &#63; and year = &#63; and month = &#63; from the database.
	*
	* @param documentTypeCode the document type code
	* @param year the year
	* @param month the month
	* @return the document statistics that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics removeByDTC_Y_M(
		java.lang.String documentTypeCode, int year, int month)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException;

	/**
	* Returns the number of document statisticses where documentTypeCode = &#63; and year = &#63; and month = &#63;.
	*
	* @param documentTypeCode the document type code
	* @param year the year
	* @param month the month
	* @return the number of matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public int countByDTC_Y_M(java.lang.String documentTypeCode, int year,
		int month) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the document statisticses where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @return the matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByYear_Month(
		int year, int month)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByYear_Month(
		int year, int month, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByYear_Month(
		int year, int month, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics findByYear_Month_First(
		int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException;

	/**
	* Returns the first document statistics in the ordered set where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document statistics, or <code>null</code> if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByYear_Month_First(
		int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics findByYear_Month_Last(
		int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException;

	/**
	* Returns the last document statistics in the ordered set where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document statistics, or <code>null</code> if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByYear_Month_Last(
		int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics[] findByYear_Month_PrevAndNext(
		long id, int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException;

	/**
	* Removes all the document statisticses where year = &#63; and month = &#63; from the database.
	*
	* @param year the year
	* @param month the month
	* @throws SystemException if a system exception occurred
	*/
	public void removeByYear_Month(int year, int month)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of document statisticses where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @return the number of matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public int countByYear_Month(int year, int month)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the document statisticses where year = &#63; and month = &#63; and status = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param status the status
	* @return the matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByYear_Month_Status(
		int year, int month, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByYear_Month_Status(
		int year, int month, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByYear_Month_Status(
		int year, int month, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics findByYear_Month_Status_First(
		int year, int month, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException;

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
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByYear_Month_Status_First(
		int year, int month, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics findByYear_Month_Status_Last(
		int year, int month, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException;

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
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByYear_Month_Status_Last(
		int year, int month, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics[] findByYear_Month_Status_PrevAndNext(
		long id, int year, int month, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException;

	/**
	* Removes all the document statisticses where year = &#63; and month = &#63; and status = &#63; from the database.
	*
	* @param year the year
	* @param month the month
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByYear_Month_Status(int year, int month, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of document statisticses where year = &#63; and month = &#63; and status = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param status the status
	* @return the number of matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public int countByYear_Month_Status(int year, int month, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the document statisticses where status = &#63;.
	*
	* @param status the status
	* @return the matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByStatus(
		int status) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByStatus(
		int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first document statistics in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document statistics
	* @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics findByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException;

	/**
	* Returns the first document statistics in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching document statistics, or <code>null</code> if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last document statistics in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document statistics
	* @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics findByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException;

	/**
	* Returns the last document statistics in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching document statistics, or <code>null</code> if a matching document statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics[] findByStatus_PrevAndNext(
		long id, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException;

	/**
	* Removes all the document statisticses where status = &#63; from the database.
	*
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByStatus(int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of document statisticses where status = &#63;.
	*
	* @param status the status
	* @return the number of matching document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public int countByStatus(int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the document statistics in the entity cache if it is enabled.
	*
	* @param documentStatistics the document statistics
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.report.model.DocumentStatistics documentStatistics);

	/**
	* Caches the document statisticses in the entity cache if it is enabled.
	*
	* @param documentStatisticses the document statisticses
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> documentStatisticses);

	/**
	* Creates a new document statistics with the primary key. Does not add the document statistics to the database.
	*
	* @param id the primary key for the new document statistics
	* @return the new document statistics
	*/
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics create(long id);

	/**
	* Removes the document statistics with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the document statistics
	* @return the document statistics that was removed
	* @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a document statistics with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException;

	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics updateImpl(
		vn.dtt.gt.dk.dao.report.model.DocumentStatistics documentStatistics)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the document statistics with the primary key or throws a {@link vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException} if it could not be found.
	*
	* @param id the primary key of the document statistics
	* @return the document statistics
	* @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a document statistics with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException;

	/**
	* Returns the document statistics with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the document statistics
	* @return the document statistics, or <code>null</code> if a document statistics with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the document statisticses.
	*
	* @return the document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the document statisticses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of document statisticses.
	*
	* @return the number of document statisticses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}