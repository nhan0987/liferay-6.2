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

package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog;

import java.util.List;

/**
 * The persistence utility for the action log service. This utility wraps {@link ActionLogPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ActionLogPersistence
 * @see ActionLogPersistenceImpl
 * @generated
 */
public class ActionLogUtil {
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
	public static void clearCache(ActionLog actionLog) {
		getPersistence().clearCache(actionLog);
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
	public static List<ActionLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ActionLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ActionLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ActionLog update(ActionLog actionLog)
		throws SystemException {
		return getPersistence().update(actionLog);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ActionLog update(ActionLog actionLog,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(actionLog, serviceContext);
	}

	/**
	* Returns all the action logs where hosothutucid = &#63;.
	*
	* @param hosothutucid the hosothutucid
	* @return the matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findByhosothutucid(
		long hosothutucid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByhosothutucid(hosothutucid);
	}

	/**
	* Returns a range of all the action logs where hosothutucid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hosothutucid the hosothutucid
	* @param start the lower bound of the range of action logs
	* @param end the upper bound of the range of action logs (not inclusive)
	* @return the range of matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findByhosothutucid(
		long hosothutucid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByhosothutucid(hosothutucid, start, end);
	}

	/**
	* Returns an ordered range of all the action logs where hosothutucid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hosothutucid the hosothutucid
	* @param start the lower bound of the range of action logs
	* @param end the upper bound of the range of action logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findByhosothutucid(
		long hosothutucid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByhosothutucid(hosothutucid, start, end,
			orderByComparator);
	}

	/**
	* Returns the first action log in the ordered set where hosothutucid = &#63;.
	*
	* @param hosothutucid the hosothutucid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog findByhosothutucid_First(
		long hosothutucid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence()
				   .findByhosothutucid_First(hosothutucid, orderByComparator);
	}

	/**
	* Returns the first action log in the ordered set where hosothutucid = &#63;.
	*
	* @param hosothutucid the hosothutucid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching action log, or <code>null</code> if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog fetchByhosothutucid_First(
		long hosothutucid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByhosothutucid_First(hosothutucid, orderByComparator);
	}

	/**
	* Returns the last action log in the ordered set where hosothutucid = &#63;.
	*
	* @param hosothutucid the hosothutucid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog findByhosothutucid_Last(
		long hosothutucid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence()
				   .findByhosothutucid_Last(hosothutucid, orderByComparator);
	}

	/**
	* Returns the last action log in the ordered set where hosothutucid = &#63;.
	*
	* @param hosothutucid the hosothutucid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching action log, or <code>null</code> if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog fetchByhosothutucid_Last(
		long hosothutucid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByhosothutucid_Last(hosothutucid, orderByComparator);
	}

	/**
	* Returns the action logs before and after the current action log in the ordered set where hosothutucid = &#63;.
	*
	* @param id the primary key of the current action log
	* @param hosothutucid the hosothutucid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a action log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog[] findByhosothutucid_PrevAndNext(
		long id, long hosothutucid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence()
				   .findByhosothutucid_PrevAndNext(id, hosothutucid,
			orderByComparator);
	}

	/**
	* Removes all the action logs where hosothutucid = &#63; from the database.
	*
	* @param hosothutucid the hosothutucid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByhosothutucid(long hosothutucid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByhosothutucid(hosothutucid);
	}

	/**
	* Returns the number of action logs where hosothutucid = &#63;.
	*
	* @param hosothutucid the hosothutucid
	* @return the number of matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByhosothutucid(long hosothutucid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByhosothutucid(hosothutucid);
	}

	/**
	* Returns all the action logs where masohoso = &#63;.
	*
	* @param masohoso the masohoso
	* @return the matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findByMaSoHoSo(
		java.lang.String masohoso)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMaSoHoSo(masohoso);
	}

	/**
	* Returns a range of all the action logs where masohoso = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param masohoso the masohoso
	* @param start the lower bound of the range of action logs
	* @param end the upper bound of the range of action logs (not inclusive)
	* @return the range of matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findByMaSoHoSo(
		java.lang.String masohoso, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMaSoHoSo(masohoso, start, end);
	}

	/**
	* Returns an ordered range of all the action logs where masohoso = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param masohoso the masohoso
	* @param start the lower bound of the range of action logs
	* @param end the upper bound of the range of action logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findByMaSoHoSo(
		java.lang.String masohoso, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMaSoHoSo(masohoso, start, end, orderByComparator);
	}

	/**
	* Returns the first action log in the ordered set where masohoso = &#63;.
	*
	* @param masohoso the masohoso
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog findByMaSoHoSo_First(
		java.lang.String masohoso,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence().findByMaSoHoSo_First(masohoso, orderByComparator);
	}

	/**
	* Returns the first action log in the ordered set where masohoso = &#63;.
	*
	* @param masohoso the masohoso
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching action log, or <code>null</code> if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog fetchByMaSoHoSo_First(
		java.lang.String masohoso,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMaSoHoSo_First(masohoso, orderByComparator);
	}

	/**
	* Returns the last action log in the ordered set where masohoso = &#63;.
	*
	* @param masohoso the masohoso
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog findByMaSoHoSo_Last(
		java.lang.String masohoso,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence().findByMaSoHoSo_Last(masohoso, orderByComparator);
	}

	/**
	* Returns the last action log in the ordered set where masohoso = &#63;.
	*
	* @param masohoso the masohoso
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching action log, or <code>null</code> if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog fetchByMaSoHoSo_Last(
		java.lang.String masohoso,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMaSoHoSo_Last(masohoso, orderByComparator);
	}

	/**
	* Returns the action logs before and after the current action log in the ordered set where masohoso = &#63;.
	*
	* @param id the primary key of the current action log
	* @param masohoso the masohoso
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a action log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog[] findByMaSoHoSo_PrevAndNext(
		long id, java.lang.String masohoso,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence()
				   .findByMaSoHoSo_PrevAndNext(id, masohoso, orderByComparator);
	}

	/**
	* Removes all the action logs where masohoso = &#63; from the database.
	*
	* @param masohoso the masohoso
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByMaSoHoSo(java.lang.String masohoso)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByMaSoHoSo(masohoso);
	}

	/**
	* Returns the number of action logs where masohoso = &#63;.
	*
	* @param masohoso the masohoso
	* @return the number of matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMaSoHoSo(java.lang.String masohoso)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMaSoHoSo(masohoso);
	}

	/**
	* Returns all the action logs where mabiennhan = &#63;.
	*
	* @param mabiennhan the mabiennhan
	* @return the matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findByMaBienNhan(
		java.lang.String mabiennhan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMaBienNhan(mabiennhan);
	}

	/**
	* Returns a range of all the action logs where mabiennhan = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mabiennhan the mabiennhan
	* @param start the lower bound of the range of action logs
	* @param end the upper bound of the range of action logs (not inclusive)
	* @return the range of matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findByMaBienNhan(
		java.lang.String mabiennhan, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMaBienNhan(mabiennhan, start, end);
	}

	/**
	* Returns an ordered range of all the action logs where mabiennhan = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mabiennhan the mabiennhan
	* @param start the lower bound of the range of action logs
	* @param end the upper bound of the range of action logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findByMaBienNhan(
		java.lang.String mabiennhan, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMaBienNhan(mabiennhan, start, end, orderByComparator);
	}

	/**
	* Returns the first action log in the ordered set where mabiennhan = &#63;.
	*
	* @param mabiennhan the mabiennhan
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog findByMaBienNhan_First(
		java.lang.String mabiennhan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence()
				   .findByMaBienNhan_First(mabiennhan, orderByComparator);
	}

	/**
	* Returns the first action log in the ordered set where mabiennhan = &#63;.
	*
	* @param mabiennhan the mabiennhan
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching action log, or <code>null</code> if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog fetchByMaBienNhan_First(
		java.lang.String mabiennhan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMaBienNhan_First(mabiennhan, orderByComparator);
	}

	/**
	* Returns the last action log in the ordered set where mabiennhan = &#63;.
	*
	* @param mabiennhan the mabiennhan
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog findByMaBienNhan_Last(
		java.lang.String mabiennhan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence()
				   .findByMaBienNhan_Last(mabiennhan, orderByComparator);
	}

	/**
	* Returns the last action log in the ordered set where mabiennhan = &#63;.
	*
	* @param mabiennhan the mabiennhan
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching action log, or <code>null</code> if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog fetchByMaBienNhan_Last(
		java.lang.String mabiennhan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMaBienNhan_Last(mabiennhan, orderByComparator);
	}

	/**
	* Returns the action logs before and after the current action log in the ordered set where mabiennhan = &#63;.
	*
	* @param id the primary key of the current action log
	* @param mabiennhan the mabiennhan
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a action log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog[] findByMaBienNhan_PrevAndNext(
		long id, java.lang.String mabiennhan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence()
				   .findByMaBienNhan_PrevAndNext(id, mabiennhan,
			orderByComparator);
	}

	/**
	* Removes all the action logs where mabiennhan = &#63; from the database.
	*
	* @param mabiennhan the mabiennhan
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByMaBienNhan(java.lang.String mabiennhan)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByMaBienNhan(mabiennhan);
	}

	/**
	* Returns the number of action logs where mabiennhan = &#63;.
	*
	* @param mabiennhan the mabiennhan
	* @return the number of matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMaBienNhan(java.lang.String mabiennhan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMaBienNhan(mabiennhan);
	}

	/**
	* Returns all the action logs where importername = &#63;.
	*
	* @param importername the importername
	* @return the matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findByImporterName(
		java.lang.String importername)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByImporterName(importername);
	}

	/**
	* Returns a range of all the action logs where importername = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importername the importername
	* @param start the lower bound of the range of action logs
	* @param end the upper bound of the range of action logs (not inclusive)
	* @return the range of matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findByImporterName(
		java.lang.String importername, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByImporterName(importername, start, end);
	}

	/**
	* Returns an ordered range of all the action logs where importername = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importername the importername
	* @param start the lower bound of the range of action logs
	* @param end the upper bound of the range of action logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findByImporterName(
		java.lang.String importername, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterName(importername, start, end,
			orderByComparator);
	}

	/**
	* Returns the first action log in the ordered set where importername = &#63;.
	*
	* @param importername the importername
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog findByImporterName_First(
		java.lang.String importername,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence()
				   .findByImporterName_First(importername, orderByComparator);
	}

	/**
	* Returns the first action log in the ordered set where importername = &#63;.
	*
	* @param importername the importername
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching action log, or <code>null</code> if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog fetchByImporterName_First(
		java.lang.String importername,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterName_First(importername, orderByComparator);
	}

	/**
	* Returns the last action log in the ordered set where importername = &#63;.
	*
	* @param importername the importername
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog findByImporterName_Last(
		java.lang.String importername,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence()
				   .findByImporterName_Last(importername, orderByComparator);
	}

	/**
	* Returns the last action log in the ordered set where importername = &#63;.
	*
	* @param importername the importername
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching action log, or <code>null</code> if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog fetchByImporterName_Last(
		java.lang.String importername,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterName_Last(importername, orderByComparator);
	}

	/**
	* Returns the action logs before and after the current action log in the ordered set where importername = &#63;.
	*
	* @param id the primary key of the current action log
	* @param importername the importername
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a action log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog[] findByImporterName_PrevAndNext(
		long id, java.lang.String importername,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence()
				   .findByImporterName_PrevAndNext(id, importername,
			orderByComparator);
	}

	/**
	* Removes all the action logs where importername = &#63; from the database.
	*
	* @param importername the importername
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByImporterName(java.lang.String importername)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByImporterName(importername);
	}

	/**
	* Returns the number of action logs where importername = &#63;.
	*
	* @param importername the importername
	* @return the number of matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByImporterName(java.lang.String importername)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByImporterName(importername);
	}

	/**
	* Returns all the action logs where corporationid = &#63;.
	*
	* @param corporationid the corporationid
	* @return the matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findByCorporationId(
		java.lang.String corporationid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCorporationId(corporationid);
	}

	/**
	* Returns a range of all the action logs where corporationid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationid the corporationid
	* @param start the lower bound of the range of action logs
	* @param end the upper bound of the range of action logs (not inclusive)
	* @return the range of matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findByCorporationId(
		java.lang.String corporationid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCorporationId(corporationid, start, end);
	}

	/**
	* Returns an ordered range of all the action logs where corporationid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationid the corporationid
	* @param start the lower bound of the range of action logs
	* @param end the upper bound of the range of action logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findByCorporationId(
		java.lang.String corporationid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCorporationId(corporationid, start, end,
			orderByComparator);
	}

	/**
	* Returns the first action log in the ordered set where corporationid = &#63;.
	*
	* @param corporationid the corporationid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog findByCorporationId_First(
		java.lang.String corporationid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence()
				   .findByCorporationId_First(corporationid, orderByComparator);
	}

	/**
	* Returns the first action log in the ordered set where corporationid = &#63;.
	*
	* @param corporationid the corporationid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching action log, or <code>null</code> if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog fetchByCorporationId_First(
		java.lang.String corporationid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCorporationId_First(corporationid, orderByComparator);
	}

	/**
	* Returns the last action log in the ordered set where corporationid = &#63;.
	*
	* @param corporationid the corporationid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog findByCorporationId_Last(
		java.lang.String corporationid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence()
				   .findByCorporationId_Last(corporationid, orderByComparator);
	}

	/**
	* Returns the last action log in the ordered set where corporationid = &#63;.
	*
	* @param corporationid the corporationid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching action log, or <code>null</code> if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog fetchByCorporationId_Last(
		java.lang.String corporationid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCorporationId_Last(corporationid, orderByComparator);
	}

	/**
	* Returns the action logs before and after the current action log in the ordered set where corporationid = &#63;.
	*
	* @param id the primary key of the current action log
	* @param corporationid the corporationid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a action log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog[] findByCorporationId_PrevAndNext(
		long id, java.lang.String corporationid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence()
				   .findByCorporationId_PrevAndNext(id, corporationid,
			orderByComparator);
	}

	/**
	* Removes all the action logs where corporationid = &#63; from the database.
	*
	* @param corporationid the corporationid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCorporationId(java.lang.String corporationid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCorporationId(corporationid);
	}

	/**
	* Returns the number of action logs where corporationid = &#63;.
	*
	* @param corporationid the corporationid
	* @return the number of matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCorporationId(java.lang.String corporationid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCorporationId(corporationid);
	}

	/**
	* Returns all the action logs where inspectorid = &#63;.
	*
	* @param inspectorid the inspectorid
	* @return the matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findByInspectorId(
		long inspectorid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByInspectorId(inspectorid);
	}

	/**
	* Returns a range of all the action logs where inspectorid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorid the inspectorid
	* @param start the lower bound of the range of action logs
	* @param end the upper bound of the range of action logs (not inclusive)
	* @return the range of matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findByInspectorId(
		long inspectorid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByInspectorId(inspectorid, start, end);
	}

	/**
	* Returns an ordered range of all the action logs where inspectorid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorid the inspectorid
	* @param start the lower bound of the range of action logs
	* @param end the upper bound of the range of action logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findByInspectorId(
		long inspectorid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectorId(inspectorid, start, end, orderByComparator);
	}

	/**
	* Returns the first action log in the ordered set where inspectorid = &#63;.
	*
	* @param inspectorid the inspectorid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog findByInspectorId_First(
		long inspectorid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence()
				   .findByInspectorId_First(inspectorid, orderByComparator);
	}

	/**
	* Returns the first action log in the ordered set where inspectorid = &#63;.
	*
	* @param inspectorid the inspectorid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching action log, or <code>null</code> if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog fetchByInspectorId_First(
		long inspectorid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectorId_First(inspectorid, orderByComparator);
	}

	/**
	* Returns the last action log in the ordered set where inspectorid = &#63;.
	*
	* @param inspectorid the inspectorid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog findByInspectorId_Last(
		long inspectorid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence()
				   .findByInspectorId_Last(inspectorid, orderByComparator);
	}

	/**
	* Returns the last action log in the ordered set where inspectorid = &#63;.
	*
	* @param inspectorid the inspectorid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching action log, or <code>null</code> if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog fetchByInspectorId_Last(
		long inspectorid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectorId_Last(inspectorid, orderByComparator);
	}

	/**
	* Returns the action logs before and after the current action log in the ordered set where inspectorid = &#63;.
	*
	* @param id the primary key of the current action log
	* @param inspectorid the inspectorid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a action log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog[] findByInspectorId_PrevAndNext(
		long id, long inspectorid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence()
				   .findByInspectorId_PrevAndNext(id, inspectorid,
			orderByComparator);
	}

	/**
	* Removes all the action logs where inspectorid = &#63; from the database.
	*
	* @param inspectorid the inspectorid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByInspectorId(long inspectorid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByInspectorId(inspectorid);
	}

	/**
	* Returns the number of action logs where inspectorid = &#63;.
	*
	* @param inspectorid the inspectorid
	* @return the number of matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByInspectorId(long inspectorid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByInspectorId(inspectorid);
	}

	/**
	* Returns all the action logs where contactcode = &#63;.
	*
	* @param contactcode the contactcode
	* @return the matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findByContactCode(
		java.lang.String contactcode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByContactCode(contactcode);
	}

	/**
	* Returns a range of all the action logs where contactcode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactcode the contactcode
	* @param start the lower bound of the range of action logs
	* @param end the upper bound of the range of action logs (not inclusive)
	* @return the range of matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findByContactCode(
		java.lang.String contactcode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByContactCode(contactcode, start, end);
	}

	/**
	* Returns an ordered range of all the action logs where contactcode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactcode the contactcode
	* @param start the lower bound of the range of action logs
	* @param end the upper bound of the range of action logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findByContactCode(
		java.lang.String contactcode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByContactCode(contactcode, start, end, orderByComparator);
	}

	/**
	* Returns the first action log in the ordered set where contactcode = &#63;.
	*
	* @param contactcode the contactcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog findByContactCode_First(
		java.lang.String contactcode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence()
				   .findByContactCode_First(contactcode, orderByComparator);
	}

	/**
	* Returns the first action log in the ordered set where contactcode = &#63;.
	*
	* @param contactcode the contactcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching action log, or <code>null</code> if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog fetchByContactCode_First(
		java.lang.String contactcode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByContactCode_First(contactcode, orderByComparator);
	}

	/**
	* Returns the last action log in the ordered set where contactcode = &#63;.
	*
	* @param contactcode the contactcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog findByContactCode_Last(
		java.lang.String contactcode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence()
				   .findByContactCode_Last(contactcode, orderByComparator);
	}

	/**
	* Returns the last action log in the ordered set where contactcode = &#63;.
	*
	* @param contactcode the contactcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching action log, or <code>null</code> if a matching action log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog fetchByContactCode_Last(
		java.lang.String contactcode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByContactCode_Last(contactcode, orderByComparator);
	}

	/**
	* Returns the action logs before and after the current action log in the ordered set where contactcode = &#63;.
	*
	* @param id the primary key of the current action log
	* @param contactcode the contactcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a action log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog[] findByContactCode_PrevAndNext(
		long id, java.lang.String contactcode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence()
				   .findByContactCode_PrevAndNext(id, contactcode,
			orderByComparator);
	}

	/**
	* Removes all the action logs where contactcode = &#63; from the database.
	*
	* @param contactcode the contactcode
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByContactCode(java.lang.String contactcode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByContactCode(contactcode);
	}

	/**
	* Returns the number of action logs where contactcode = &#63;.
	*
	* @param contactcode the contactcode
	* @return the number of matching action logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByContactCode(java.lang.String contactcode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByContactCode(contactcode);
	}

	/**
	* Caches the action log in the entity cache if it is enabled.
	*
	* @param actionLog the action log
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog actionLog) {
		getPersistence().cacheResult(actionLog);
	}

	/**
	* Caches the action logs in the entity cache if it is enabled.
	*
	* @param actionLogs the action logs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> actionLogs) {
		getPersistence().cacheResult(actionLogs);
	}

	/**
	* Creates a new action log with the primary key. Does not add the action log to the database.
	*
	* @param id the primary key for the new action log
	* @return the new action log
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the action log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the action log
	* @return the action log that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a action log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog actionLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(actionLog);
	}

	/**
	* Returns the action log with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException} if it could not be found.
	*
	* @param id the primary key of the action log
	* @return the action log
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a action log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the action log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the action log
	* @return the action log, or <code>null</code> if a action log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the action logs.
	*
	* @return the action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the action logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of action logs
	* @param end the upper bound of the range of action logs (not inclusive)
	* @return the range of action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the action logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of action logs
	* @param end the upper bound of the range of action logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of action logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the action logs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of action logs.
	*
	* @return the number of action logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ActionLogPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ActionLogPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					ActionLogPersistence.class.getName());

			ReferenceRegistry.registerReference(ActionLogUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ActionLogPersistence persistence) {
	}

	private static ActionLogPersistence _persistence;
}