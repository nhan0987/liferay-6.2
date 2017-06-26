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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig;

/**
 * The persistence interface for the assessment specification config service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AssessmentSpecificationConfigPersistenceImpl
 * @see AssessmentSpecificationConfigUtil
 * @generated
 */
public interface AssessmentSpecificationConfigPersistence
	extends BasePersistence<AssessmentSpecificationConfig> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssessmentSpecificationConfigUtil} to access the assessment specification config persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> findByAssessmentidAndAssessmentyear(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessment specification configs
	* @param end the upper bound of the range of assessment specification configs (not inclusive)
	* @return the range of matching assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> findByAssessmentidAndAssessmentyear(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessment specification configs
	* @param end the upper bound of the range of assessment specification configs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> findByAssessmentidAndAssessmentyear(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment specification config
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a matching assessment specification config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig findByAssessmentidAndAssessmentyear_First(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException;

	/**
	* Returns the first assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment specification config, or <code>null</code> if a matching assessment specification config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig fetchByAssessmentidAndAssessmentyear_First(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment specification config
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a matching assessment specification config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig findByAssessmentidAndAssessmentyear_Last(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException;

	/**
	* Returns the last assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment specification config, or <code>null</code> if a matching assessment specification config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig fetchByAssessmentidAndAssessmentyear_Last(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment specification configs before and after the current assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessment specification config
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment specification config
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a assessment specification config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig[] findByAssessmentidAndAssessmentyear_PrevAndNext(
		long id, java.lang.String specificationgroupcode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException;

	/**
	* Removes all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAssessmentidAndAssessmentyear(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public int countByAssessmentidAndAssessmentyear(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param specificationcode the specificationcode
	* @return the matching assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> findByAssessmentidAndAssessmentyearWithSpecificationcode(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, java.lang.String specificationcode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param specificationcode the specificationcode
	* @param start the lower bound of the range of assessment specification configs
	* @param end the upper bound of the range of assessment specification configs (not inclusive)
	* @return the range of matching assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> findByAssessmentidAndAssessmentyearWithSpecificationcode(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, java.lang.String specificationcode,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param specificationcode the specificationcode
	* @param start the lower bound of the range of assessment specification configs
	* @param end the upper bound of the range of assessment specification configs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> findByAssessmentidAndAssessmentyearWithSpecificationcode(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, java.lang.String specificationcode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param specificationcode the specificationcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment specification config
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a matching assessment specification config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig findByAssessmentidAndAssessmentyearWithSpecificationcode_First(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, java.lang.String specificationcode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException;

	/**
	* Returns the first assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param specificationcode the specificationcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment specification config, or <code>null</code> if a matching assessment specification config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig fetchByAssessmentidAndAssessmentyearWithSpecificationcode_First(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, java.lang.String specificationcode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param specificationcode the specificationcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment specification config
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a matching assessment specification config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig findByAssessmentidAndAssessmentyearWithSpecificationcode_Last(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, java.lang.String specificationcode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException;

	/**
	* Returns the last assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param specificationcode the specificationcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment specification config, or <code>null</code> if a matching assessment specification config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig fetchByAssessmentidAndAssessmentyearWithSpecificationcode_Last(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, java.lang.String specificationcode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment specification configs before and after the current assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	*
	* @param id the primary key of the current assessment specification config
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param specificationcode the specificationcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment specification config
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a assessment specification config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig[] findByAssessmentidAndAssessmentyearWithSpecificationcode_PrevAndNext(
		long id, java.lang.String specificationgroupcode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		java.lang.String specificationcode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException;

	/**
	* Removes all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63; from the database.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param specificationcode the specificationcode
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAssessmentidAndAssessmentyearWithSpecificationcode(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, java.lang.String specificationcode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param specificationcode the specificationcode
	* @return the number of matching assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public int countByAssessmentidAndAssessmentyearWithSpecificationcode(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, java.lang.String specificationcode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the assessment specification config in the entity cache if it is enabled.
	*
	* @param assessmentSpecificationConfig the assessment specification config
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig assessmentSpecificationConfig);

	/**
	* Caches the assessment specification configs in the entity cache if it is enabled.
	*
	* @param assessmentSpecificationConfigs the assessment specification configs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> assessmentSpecificationConfigs);

	/**
	* Creates a new assessment specification config with the primary key. Does not add the assessment specification config to the database.
	*
	* @param id the primary key for the new assessment specification config
	* @return the new assessment specification config
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig create(
		long id);

	/**
	* Removes the assessment specification config with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessment specification config
	* @return the assessment specification config that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a assessment specification config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig assessmentSpecificationConfig)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment specification config with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException} if it could not be found.
	*
	* @param id the primary key of the assessment specification config
	* @return the assessment specification config
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a assessment specification config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException;

	/**
	* Returns the assessment specification config with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the assessment specification config
	* @return the assessment specification config, or <code>null</code> if a assessment specification config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessment specification configs.
	*
	* @return the assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessment specification configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessment specification configs
	* @param end the upper bound of the range of assessment specification configs (not inclusive)
	* @return the range of assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessment specification configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessment specification configs
	* @param end the upper bound of the range of assessment specification configs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the assessment specification configs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessment specification configs.
	*
	* @return the number of assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}