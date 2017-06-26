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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.dao.api.model.Api;

import java.util.List;

/**
 * The persistence utility for the api service. This utility wraps {@link ApiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see ApiPersistence
 * @see ApiPersistenceImpl
 * @generated
 */
public class ApiUtil {
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
	public static void clearCache(Api api) {
		getPersistence().clearCache(api);
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
	public static List<Api> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Api> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Api> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Api update(Api api) throws SystemException {
		return getPersistence().update(api);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Api update(Api api, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(api, serviceContext);
	}

	/**
	* Returns all the apis where ip = &#63;.
	*
	* @param ip the ip
	* @return the matching apis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByIP(
		java.lang.String ip)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByIP(ip);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByIP(
		java.lang.String ip, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByIP(ip, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByIP(
		java.lang.String ip, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByIP(ip, start, end, orderByComparator);
	}

	/**
	* Returns the first api in the ordered set where ip = &#63;.
	*
	* @param ip the ip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.api.model.Api findByIP_First(
		java.lang.String ip,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException {
		return getPersistence().findByIP_First(ip, orderByComparator);
	}

	/**
	* Returns the first api in the ordered set where ip = &#63;.
	*
	* @param ip the ip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api, or <code>null</code> if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.api.model.Api fetchByIP_First(
		java.lang.String ip,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByIP_First(ip, orderByComparator);
	}

	/**
	* Returns the last api in the ordered set where ip = &#63;.
	*
	* @param ip the ip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.api.model.Api findByIP_Last(
		java.lang.String ip,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException {
		return getPersistence().findByIP_Last(ip, orderByComparator);
	}

	/**
	* Returns the last api in the ordered set where ip = &#63;.
	*
	* @param ip the ip
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api, or <code>null</code> if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.api.model.Api fetchByIP_Last(
		java.lang.String ip,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByIP_Last(ip, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.api.model.Api[] findByIP_PrevAndNext(
		long id, java.lang.String ip,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException {
		return getPersistence().findByIP_PrevAndNext(id, ip, orderByComparator);
	}

	/**
	* Removes all the apis where ip = &#63; from the database.
	*
	* @param ip the ip
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByIP(java.lang.String ip)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByIP(ip);
	}

	/**
	* Returns the number of apis where ip = &#63;.
	*
	* @param ip the ip
	* @return the number of matching apis
	* @throws SystemException if a system exception occurred
	*/
	public static int countByIP(java.lang.String ip)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByIP(ip);
	}

	/**
	* Returns all the apis where code = &#63;.
	*
	* @param code the code
	* @return the matching apis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCode(code);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByCode(
		java.lang.String code, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCode(code, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByCode(
		java.lang.String code, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCode(code, start, end, orderByComparator);
	}

	/**
	* Returns the first api in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.api.model.Api findByCode_First(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException {
		return getPersistence().findByCode_First(code, orderByComparator);
	}

	/**
	* Returns the first api in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api, or <code>null</code> if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.api.model.Api fetchByCode_First(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCode_First(code, orderByComparator);
	}

	/**
	* Returns the last api in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.api.model.Api findByCode_Last(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException {
		return getPersistence().findByCode_Last(code, orderByComparator);
	}

	/**
	* Returns the last api in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api, or <code>null</code> if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.api.model.Api fetchByCode_Last(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCode_Last(code, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.api.model.Api[] findByCode_PrevAndNext(
		long id, java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException {
		return getPersistence()
				   .findByCode_PrevAndNext(id, code, orderByComparator);
	}

	/**
	* Removes all the apis where code = &#63; from the database.
	*
	* @param code the code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCode(java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCode(code);
	}

	/**
	* Returns the number of apis where code = &#63;.
	*
	* @param code the code
	* @return the number of matching apis
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCode(java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCode(code);
	}

	/**
	* Returns all the apis where registeredNumber = &#63;.
	*
	* @param registeredNumber the registered number
	* @return the matching apis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByRegisteredNumber(
		java.lang.String registeredNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRegisteredNumber(registeredNumber);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByRegisteredNumber(
		java.lang.String registeredNumber, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRegisteredNumber(registeredNumber, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByRegisteredNumber(
		java.lang.String registeredNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRegisteredNumber(registeredNumber, start, end,
			orderByComparator);
	}

	/**
	* Returns the first api in the ordered set where registeredNumber = &#63;.
	*
	* @param registeredNumber the registered number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.api.model.Api findByRegisteredNumber_First(
		java.lang.String registeredNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException {
		return getPersistence()
				   .findByRegisteredNumber_First(registeredNumber,
			orderByComparator);
	}

	/**
	* Returns the first api in the ordered set where registeredNumber = &#63;.
	*
	* @param registeredNumber the registered number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api, or <code>null</code> if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.api.model.Api fetchByRegisteredNumber_First(
		java.lang.String registeredNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRegisteredNumber_First(registeredNumber,
			orderByComparator);
	}

	/**
	* Returns the last api in the ordered set where registeredNumber = &#63;.
	*
	* @param registeredNumber the registered number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.api.model.Api findByRegisteredNumber_Last(
		java.lang.String registeredNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException {
		return getPersistence()
				   .findByRegisteredNumber_Last(registeredNumber,
			orderByComparator);
	}

	/**
	* Returns the last api in the ordered set where registeredNumber = &#63;.
	*
	* @param registeredNumber the registered number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api, or <code>null</code> if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.api.model.Api fetchByRegisteredNumber_Last(
		java.lang.String registeredNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRegisteredNumber_Last(registeredNumber,
			orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.api.model.Api[] findByRegisteredNumber_PrevAndNext(
		long id, java.lang.String registeredNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException {
		return getPersistence()
				   .findByRegisteredNumber_PrevAndNext(id, registeredNumber,
			orderByComparator);
	}

	/**
	* Removes all the apis where registeredNumber = &#63; from the database.
	*
	* @param registeredNumber the registered number
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRegisteredNumber(
		java.lang.String registeredNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByRegisteredNumber(registeredNumber);
	}

	/**
	* Returns the number of apis where registeredNumber = &#63;.
	*
	* @param registeredNumber the registered number
	* @return the number of matching apis
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRegisteredNumber(java.lang.String registeredNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRegisteredNumber(registeredNumber);
	}

	/**
	* Returns all the apis where code = &#63; and registeredNumber = &#63;.
	*
	* @param code the code
	* @param registeredNumber the registered number
	* @return the matching apis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByC_R(
		java.lang.String code, java.lang.String registeredNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_R(code, registeredNumber);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByC_R(
		java.lang.String code, java.lang.String registeredNumber, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_R(code, registeredNumber, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByC_R(
		java.lang.String code, java.lang.String registeredNumber, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_R(code, registeredNumber, start, end,
			orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.api.model.Api findByC_R_First(
		java.lang.String code, java.lang.String registeredNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException {
		return getPersistence()
				   .findByC_R_First(code, registeredNumber, orderByComparator);
	}

	/**
	* Returns the first api in the ordered set where code = &#63; and registeredNumber = &#63;.
	*
	* @param code the code
	* @param registeredNumber the registered number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api, or <code>null</code> if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.api.model.Api fetchByC_R_First(
		java.lang.String code, java.lang.String registeredNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_R_First(code, registeredNumber, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.api.model.Api findByC_R_Last(
		java.lang.String code, java.lang.String registeredNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException {
		return getPersistence()
				   .findByC_R_Last(code, registeredNumber, orderByComparator);
	}

	/**
	* Returns the last api in the ordered set where code = &#63; and registeredNumber = &#63;.
	*
	* @param code the code
	* @param registeredNumber the registered number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api, or <code>null</code> if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.api.model.Api fetchByC_R_Last(
		java.lang.String code, java.lang.String registeredNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_R_Last(code, registeredNumber, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.api.model.Api[] findByC_R_PrevAndNext(
		long id, java.lang.String code, java.lang.String registeredNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException {
		return getPersistence()
				   .findByC_R_PrevAndNext(id, code, registeredNumber,
			orderByComparator);
	}

	/**
	* Removes all the apis where code = &#63; and registeredNumber = &#63; from the database.
	*
	* @param code the code
	* @param registeredNumber the registered number
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_R(java.lang.String code,
		java.lang.String registeredNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_R(code, registeredNumber);
	}

	/**
	* Returns the number of apis where code = &#63; and registeredNumber = &#63;.
	*
	* @param code the code
	* @param registeredNumber the registered number
	* @return the number of matching apis
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_R(java.lang.String code,
		java.lang.String registeredNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_R(code, registeredNumber);
	}

	/**
	* Returns all the apis where ip = &#63; and code = &#63;.
	*
	* @param ip the ip
	* @param code the code
	* @return the matching apis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByI_C(
		java.lang.String ip, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByI_C(ip, code);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByI_C(
		java.lang.String ip, java.lang.String code, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByI_C(ip, code, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findByI_C(
		java.lang.String ip, java.lang.String code, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByI_C(ip, code, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.api.model.Api findByI_C_First(
		java.lang.String ip, java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException {
		return getPersistence().findByI_C_First(ip, code, orderByComparator);
	}

	/**
	* Returns the first api in the ordered set where ip = &#63; and code = &#63;.
	*
	* @param ip the ip
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching api, or <code>null</code> if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.api.model.Api fetchByI_C_First(
		java.lang.String ip, java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByI_C_First(ip, code, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.api.model.Api findByI_C_Last(
		java.lang.String ip, java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException {
		return getPersistence().findByI_C_Last(ip, code, orderByComparator);
	}

	/**
	* Returns the last api in the ordered set where ip = &#63; and code = &#63;.
	*
	* @param ip the ip
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching api, or <code>null</code> if a matching api could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.api.model.Api fetchByI_C_Last(
		java.lang.String ip, java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByI_C_Last(ip, code, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.api.model.Api[] findByI_C_PrevAndNext(
		long id, java.lang.String ip, java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException {
		return getPersistence()
				   .findByI_C_PrevAndNext(id, ip, code, orderByComparator);
	}

	/**
	* Removes all the apis where ip = &#63; and code = &#63; from the database.
	*
	* @param ip the ip
	* @param code the code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByI_C(java.lang.String ip, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByI_C(ip, code);
	}

	/**
	* Returns the number of apis where ip = &#63; and code = &#63;.
	*
	* @param ip the ip
	* @param code the code
	* @return the number of matching apis
	* @throws SystemException if a system exception occurred
	*/
	public static int countByI_C(java.lang.String ip, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByI_C(ip, code);
	}

	/**
	* Caches the api in the entity cache if it is enabled.
	*
	* @param api the api
	*/
	public static void cacheResult(vn.dtt.gt.dk.dao.api.model.Api api) {
		getPersistence().cacheResult(api);
	}

	/**
	* Caches the apis in the entity cache if it is enabled.
	*
	* @param apis the apis
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.api.model.Api> apis) {
		getPersistence().cacheResult(apis);
	}

	/**
	* Creates a new api with the primary key. Does not add the api to the database.
	*
	* @param id the primary key for the new api
	* @return the new api
	*/
	public static vn.dtt.gt.dk.dao.api.model.Api create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the api with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the api
	* @return the api that was removed
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a api with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.api.model.Api remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.api.model.Api updateImpl(
		vn.dtt.gt.dk.dao.api.model.Api api)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(api);
	}

	/**
	* Returns the api with the primary key or throws a {@link vn.dtt.gt.dk.dao.api.NoSuchApiException} if it could not be found.
	*
	* @param id the primary key of the api
	* @return the api
	* @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a api with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.api.model.Api findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.api.NoSuchApiException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the api with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the api
	* @return the api, or <code>null</code> if a api with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.api.model.Api fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the apis.
	*
	* @return the apis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.api.model.Api> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the apis from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of apis.
	*
	* @return the number of apis
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ApiPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ApiPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.api.service.ClpSerializer.getServletContextName(),
					ApiPersistence.class.getName());

			ReferenceRegistry.registerReference(ApiUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ApiPersistence persistence) {
	}

	private static ApiPersistence _persistence;
}