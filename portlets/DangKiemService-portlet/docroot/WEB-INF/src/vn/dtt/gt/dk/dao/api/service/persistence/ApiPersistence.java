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

package vn.dtt.gt.dk.dao.api.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.gt.dk.dao.api.model.Api;

/**
 * The persistence interface for the api service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see ApiPersistenceImpl
 * @see ApiUtil
 * @generated
 */
public interface ApiPersistence extends BasePersistence<Api> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ApiUtil} to access the api persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the apis where ip = &#63;.
	*
	* @param ip the ip
	* @return the matching apis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByIP(
		java.lang.String ip)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the apis where ip = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ip the ip
	* @param start the lower bound of the range of apis
	* @param end the upper bound of the range of apis (not inclusive)
	* @return the range of matching apis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByIP(
		java.lang.String ip, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the apis where ip = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ip the ip
	* @param start the lower bound of the range of apis
	* @param end the upper bound of the range of apis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching apis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByIP(
		java.lang.String ip, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first api in the ordered set where ip = &#63;.
	*
	* @param ip the ip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api findByIP_First(java.lang.String ip,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException;

	/**
	* Returns the first api in the ordered set where ip = &#63;.
	*
	* @param ip the ip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api, or <code>null</code> if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api fetchByIP_First(java.lang.String ip,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last api in the ordered set where ip = &#63;.
	*
	* @param ip the ip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api findByIP_Last(java.lang.String ip,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException;

	/**
	* Returns the last api in the ordered set where ip = &#63;.
	*
	* @param ip the ip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api, or <code>null</code> if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api fetchByIP_Last(java.lang.String ip,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the apis before and after the current api in the ordered set where ip = &#63;.
	*
	* @param id the primary key of the current api
	* @param ip the ip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a api with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api[] findByIP_PrevAndNext(long id,
		java.lang.String ip,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException;

	/**
	* Removes all the apis where ip = &#63; from the database.
	*
	* @param ip the ip
	* @throws SystemException if a system exception occurred
	*/
	public void removeByIP(java.lang.String ip)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of apis where ip = &#63;.
	*
	* @param ip the ip
	* @return the number of matching apis
	* @throws SystemException if a system exception occurred
	*/
	public int countByIP(java.lang.String ip)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the apis where code = &#63;.
	*
	* @param code the code
	* @return the matching apis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the apis where code = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param start the lower bound of the range of apis
	* @param end the upper bound of the range of apis (not inclusive)
	* @return the range of matching apis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByCode(
		java.lang.String code, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the apis where code = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param start the lower bound of the range of apis
	* @param end the upper bound of the range of apis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching apis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByCode(
		java.lang.String code, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first api in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api findByCode_First(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException;

	/**
	* Returns the first api in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api, or <code>null</code> if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api fetchByCode_First(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last api in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api findByCode_Last(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException;

	/**
	* Returns the last api in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api, or <code>null</code> if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api fetchByCode_Last(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the apis before and after the current api in the ordered set where code = &#63;.
	*
	* @param id the primary key of the current api
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a api with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api[] findByCode_PrevAndNext(long id,
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException;

	/**
	* Removes all the apis where code = &#63; from the database.
	*
	* @param code the code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCode(java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of apis where code = &#63;.
	*
	* @param code the code
	* @return the number of matching apis
	* @throws SystemException if a system exception occurred
	*/
	public int countByCode(java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the apis where registeredNumber = &#63;.
	*
	* @param registeredNumber the registered number
	* @return the matching apis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByRegisteredNumber(
		java.lang.String registeredNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the apis where registeredNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param registeredNumber the registered number
	* @param start the lower bound of the range of apis
	* @param end the upper bound of the range of apis (not inclusive)
	* @return the range of matching apis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByRegisteredNumber(
		java.lang.String registeredNumber, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the apis where registeredNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param registeredNumber the registered number
	* @param start the lower bound of the range of apis
	* @param end the upper bound of the range of apis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching apis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByRegisteredNumber(
		java.lang.String registeredNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first api in the ordered set where registeredNumber = &#63;.
	*
	* @param registeredNumber the registered number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api findByRegisteredNumber_First(
		java.lang.String registeredNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException;

	/**
	* Returns the first api in the ordered set where registeredNumber = &#63;.
	*
	* @param registeredNumber the registered number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api, or <code>null</code> if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api fetchByRegisteredNumber_First(
		java.lang.String registeredNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last api in the ordered set where registeredNumber = &#63;.
	*
	* @param registeredNumber the registered number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api findByRegisteredNumber_Last(
		java.lang.String registeredNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException;

	/**
	* Returns the last api in the ordered set where registeredNumber = &#63;.
	*
	* @param registeredNumber the registered number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api, or <code>null</code> if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api fetchByRegisteredNumber_Last(
		java.lang.String registeredNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the apis before and after the current api in the ordered set where registeredNumber = &#63;.
	*
	* @param id the primary key of the current api
	* @param registeredNumber the registered number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a api with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api[] findByRegisteredNumber_PrevAndNext(
		long id, java.lang.String registeredNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException;

	/**
	* Removes all the apis where registeredNumber = &#63; from the database.
	*
	* @param registeredNumber the registered number
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRegisteredNumber(java.lang.String registeredNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of apis where registeredNumber = &#63;.
	*
	* @param registeredNumber the registered number
	* @return the number of matching apis
	* @throws SystemException if a system exception occurred
	*/
	public int countByRegisteredNumber(java.lang.String registeredNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the apis where code = &#63; and registeredNumber = &#63;.
	*
	* @param code the code
	* @param registeredNumber the registered number
	* @return the matching apis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByC_R(
		java.lang.String code, java.lang.String registeredNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the apis where code = &#63; and registeredNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param registeredNumber the registered number
	* @param start the lower bound of the range of apis
	* @param end the upper bound of the range of apis (not inclusive)
	* @return the range of matching apis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByC_R(
		java.lang.String code, java.lang.String registeredNumber, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the apis where code = &#63; and registeredNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param registeredNumber the registered number
	* @param start the lower bound of the range of apis
	* @param end the upper bound of the range of apis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching apis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByC_R(
		java.lang.String code, java.lang.String registeredNumber, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first api in the ordered set where code = &#63; and registeredNumber = &#63;.
	*
	* @param code the code
	* @param registeredNumber the registered number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api findByC_R_First(
		java.lang.String code, java.lang.String registeredNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException;

	/**
	* Returns the first api in the ordered set where code = &#63; and registeredNumber = &#63;.
	*
	* @param code the code
	* @param registeredNumber the registered number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api, or <code>null</code> if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api fetchByC_R_First(
		java.lang.String code, java.lang.String registeredNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last api in the ordered set where code = &#63; and registeredNumber = &#63;.
	*
	* @param code the code
	* @param registeredNumber the registered number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api findByC_R_Last(
		java.lang.String code, java.lang.String registeredNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException;

	/**
	* Returns the last api in the ordered set where code = &#63; and registeredNumber = &#63;.
	*
	* @param code the code
	* @param registeredNumber the registered number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api, or <code>null</code> if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api fetchByC_R_Last(
		java.lang.String code, java.lang.String registeredNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the apis before and after the current api in the ordered set where code = &#63; and registeredNumber = &#63;.
	*
	* @param id the primary key of the current api
	* @param code the code
	* @param registeredNumber the registered number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a api with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api[] findByC_R_PrevAndNext(long id,
		java.lang.String code, java.lang.String registeredNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException;

	/**
	* Removes all the apis where code = &#63; and registeredNumber = &#63; from the database.
	*
	* @param code the code
	* @param registeredNumber the registered number
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_R(java.lang.String code,
		java.lang.String registeredNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of apis where code = &#63; and registeredNumber = &#63;.
	*
	* @param code the code
	* @param registeredNumber the registered number
	* @return the number of matching apis
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_R(java.lang.String code,
		java.lang.String registeredNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the apis where ip = &#63; and code = &#63;.
	*
	* @param ip the ip
	* @param code the code
	* @return the matching apis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByI_C(
		java.lang.String ip, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the apis where ip = &#63; and code = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ip the ip
	* @param code the code
	* @param start the lower bound of the range of apis
	* @param end the upper bound of the range of apis (not inclusive)
	* @return the range of matching apis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByI_C(
		java.lang.String ip, java.lang.String code, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the apis where ip = &#63; and code = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ip the ip
	* @param code the code
	* @param start the lower bound of the range of apis
	* @param end the upper bound of the range of apis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching apis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByI_C(
		java.lang.String ip, java.lang.String code, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first api in the ordered set where ip = &#63; and code = &#63;.
	*
	* @param ip the ip
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api findByI_C_First(java.lang.String ip,
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException;

	/**
	* Returns the first api in the ordered set where ip = &#63; and code = &#63;.
	*
	* @param ip the ip
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api, or <code>null</code> if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api fetchByI_C_First(
		java.lang.String ip, java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last api in the ordered set where ip = &#63; and code = &#63;.
	*
	* @param ip the ip
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api findByI_C_Last(java.lang.String ip,
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException;

	/**
	* Returns the last api in the ordered set where ip = &#63; and code = &#63;.
	*
	* @param ip the ip
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api, or <code>null</code> if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api fetchByI_C_Last(java.lang.String ip,
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the apis before and after the current api in the ordered set where ip = &#63; and code = &#63;.
	*
	* @param id the primary key of the current api
	* @param ip the ip
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a api with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api[] findByI_C_PrevAndNext(long id,
		java.lang.String ip, java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException;

	/**
	* Removes all the apis where ip = &#63; and code = &#63; from the database.
	*
	* @param ip the ip
	* @param code the code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByI_C(java.lang.String ip, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of apis where ip = &#63; and code = &#63;.
	*
	* @param ip the ip
	* @param code the code
	* @return the number of matching apis
	* @throws SystemException if a system exception occurred
	*/
	public int countByI_C(java.lang.String ip, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the api in the entity cache if it is enabled.
	*
	* @param api the api
	*/
	public void cacheResult(vn.dtt.gt.dk.dao.api.model.Api api);

	/**
	* Caches the apis in the entity cache if it is enabled.
	*
	* @param apis the apis
	*/
	public void cacheResult(java.util.List<vn.dtt.gt.dk.dao.api.model.Api> apis);

	/**
	* Creates a new api with the primary key. Does not add the api to the database.
	*
	* @param id the primary key for the new api
	* @return the new api
	*/
	public vn.dtt.gt.dk.dao.api.model.Api create(long id);

	/**
	* Removes the api with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the api
	* @return the api that was removed
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a api with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException;

	public vn.dtt.gt.dk.dao.api.model.Api updateImpl(
		vn.dtt.gt.dk.dao.api.model.Api api)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the api with the primary key or throws a {@link vn.dtt.gt.dk.dao.api.NoSuchApiException} if it could not be found.
	*
	* @param id the primary key of the api
	* @return the api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a api with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException;

	/**
	* Returns the api with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the api
	* @return the api, or <code>null</code> if a api with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.api.model.Api fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the apis.
	*
	* @return the apis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the apis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of apis
	* @param end the upper bound of the range of apis (not inclusive)
	* @return the range of apis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the apis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of apis
	* @param end the upper bound of the range of apis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of apis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the apis from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of apis.
	*
	* @return the number of apis
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}