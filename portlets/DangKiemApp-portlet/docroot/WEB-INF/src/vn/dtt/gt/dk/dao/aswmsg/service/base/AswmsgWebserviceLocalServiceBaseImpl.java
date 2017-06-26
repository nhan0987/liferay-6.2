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

package vn.dtt.gt.dk.dao.aswmsg.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice;
import vn.dtt.gt.dk.dao.aswmsg.service.AswmsgWebserviceLocalService;
import vn.dtt.gt.dk.dao.aswmsg.service.persistence.AswmsgMessageLogPersistence;
import vn.dtt.gt.dk.dao.aswmsg.service.persistence.AswmsgMessageQueueFinder;
import vn.dtt.gt.dk.dao.aswmsg.service.persistence.AswmsgMessageQueuePersistence;
import vn.dtt.gt.dk.dao.aswmsg.service.persistence.AswmsgSyndatahistoryPersistence;
import vn.dtt.gt.dk.dao.aswmsg.service.persistence.AswmsgValidationLogFinder;
import vn.dtt.gt.dk.dao.aswmsg.service.persistence.AswmsgValidationLogPersistence;
import vn.dtt.gt.dk.dao.aswmsg.service.persistence.AswmsgWebservicePersistence;
import vn.dtt.gt.dk.dao.aswmsg.service.persistence.MonitorMessageQueueFinder;
import vn.dtt.gt.dk.dao.aswmsg.service.persistence.MonitorMessageQueuePersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the aswmsg webservice local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link vn.dtt.gt.dk.dao.aswmsg.service.impl.AswmsgWebserviceLocalServiceImpl}.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.aswmsg.service.impl.AswmsgWebserviceLocalServiceImpl
 * @see vn.dtt.gt.dk.dao.aswmsg.service.AswmsgWebserviceLocalServiceUtil
 * @generated
 */
public abstract class AswmsgWebserviceLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements AswmsgWebserviceLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vn.dtt.gt.dk.dao.aswmsg.service.AswmsgWebserviceLocalServiceUtil} to access the aswmsg webservice local service.
	 */

	/**
	 * Adds the aswmsg webservice to the database. Also notifies the appropriate model listeners.
	 *
	 * @param aswmsgWebservice the aswmsg webservice
	 * @return the aswmsg webservice that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AswmsgWebservice addAswmsgWebservice(
		AswmsgWebservice aswmsgWebservice) throws SystemException {
		aswmsgWebservice.setNew(true);

		return aswmsgWebservicePersistence.update(aswmsgWebservice);
	}

	/**
	 * Creates a new aswmsg webservice with the primary key. Does not add the aswmsg webservice to the database.
	 *
	 * @param Id the primary key for the new aswmsg webservice
	 * @return the new aswmsg webservice
	 */
	@Override
	public AswmsgWebservice createAswmsgWebservice(long Id) {
		return aswmsgWebservicePersistence.create(Id);
	}

	/**
	 * Deletes the aswmsg webservice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the aswmsg webservice
	 * @return the aswmsg webservice that was removed
	 * @throws PortalException if a aswmsg webservice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AswmsgWebservice deleteAswmsgWebservice(long Id)
		throws PortalException, SystemException {
		return aswmsgWebservicePersistence.remove(Id);
	}

	/**
	 * Deletes the aswmsg webservice from the database. Also notifies the appropriate model listeners.
	 *
	 * @param aswmsgWebservice the aswmsg webservice
	 * @return the aswmsg webservice that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AswmsgWebservice deleteAswmsgWebservice(
		AswmsgWebservice aswmsgWebservice) throws SystemException {
		return aswmsgWebservicePersistence.remove(aswmsgWebservice);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(AswmsgWebservice.class,
			clazz.getClassLoader());
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
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return aswmsgWebservicePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgWebserviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return aswmsgWebservicePersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgWebserviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return aswmsgWebservicePersistence.findWithDynamicQuery(dynamicQuery,
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return aswmsgWebservicePersistence.countWithDynamicQuery(dynamicQuery);
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return aswmsgWebservicePersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public AswmsgWebservice fetchAswmsgWebservice(long Id)
		throws SystemException {
		return aswmsgWebservicePersistence.fetchByPrimaryKey(Id);
	}

	/**
	 * Returns the aswmsg webservice with the primary key.
	 *
	 * @param Id the primary key of the aswmsg webservice
	 * @return the aswmsg webservice
	 * @throws PortalException if a aswmsg webservice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgWebservice getAswmsgWebservice(long Id)
		throws PortalException, SystemException {
		return aswmsgWebservicePersistence.findByPrimaryKey(Id);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return aswmsgWebservicePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the aswmsg webservices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgWebserviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of aswmsg webservices
	 * @param end the upper bound of the range of aswmsg webservices (not inclusive)
	 * @return the range of aswmsg webservices
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgWebservice> getAswmsgWebservices(int start, int end)
		throws SystemException {
		return aswmsgWebservicePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of aswmsg webservices.
	 *
	 * @return the number of aswmsg webservices
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getAswmsgWebservicesCount() throws SystemException {
		return aswmsgWebservicePersistence.countAll();
	}

	/**
	 * Updates the aswmsg webservice in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param aswmsgWebservice the aswmsg webservice
	 * @return the aswmsg webservice that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AswmsgWebservice updateAswmsgWebservice(
		AswmsgWebservice aswmsgWebservice) throws SystemException {
		return aswmsgWebservicePersistence.update(aswmsgWebservice);
	}

	/**
	 * Returns the aswmsg message log local service.
	 *
	 * @return the aswmsg message log local service
	 */
	public vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageLogLocalService getAswmsgMessageLogLocalService() {
		return aswmsgMessageLogLocalService;
	}

	/**
	 * Sets the aswmsg message log local service.
	 *
	 * @param aswmsgMessageLogLocalService the aswmsg message log local service
	 */
	public void setAswmsgMessageLogLocalService(
		vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageLogLocalService aswmsgMessageLogLocalService) {
		this.aswmsgMessageLogLocalService = aswmsgMessageLogLocalService;
	}

	/**
	 * Returns the aswmsg message log persistence.
	 *
	 * @return the aswmsg message log persistence
	 */
	public AswmsgMessageLogPersistence getAswmsgMessageLogPersistence() {
		return aswmsgMessageLogPersistence;
	}

	/**
	 * Sets the aswmsg message log persistence.
	 *
	 * @param aswmsgMessageLogPersistence the aswmsg message log persistence
	 */
	public void setAswmsgMessageLogPersistence(
		AswmsgMessageLogPersistence aswmsgMessageLogPersistence) {
		this.aswmsgMessageLogPersistence = aswmsgMessageLogPersistence;
	}

	/**
	 * Returns the aswmsg message queue local service.
	 *
	 * @return the aswmsg message queue local service
	 */
	public vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageQueueLocalService getAswmsgMessageQueueLocalService() {
		return aswmsgMessageQueueLocalService;
	}

	/**
	 * Sets the aswmsg message queue local service.
	 *
	 * @param aswmsgMessageQueueLocalService the aswmsg message queue local service
	 */
	public void setAswmsgMessageQueueLocalService(
		vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageQueueLocalService aswmsgMessageQueueLocalService) {
		this.aswmsgMessageQueueLocalService = aswmsgMessageQueueLocalService;
	}

	/**
	 * Returns the aswmsg message queue persistence.
	 *
	 * @return the aswmsg message queue persistence
	 */
	public AswmsgMessageQueuePersistence getAswmsgMessageQueuePersistence() {
		return aswmsgMessageQueuePersistence;
	}

	/**
	 * Sets the aswmsg message queue persistence.
	 *
	 * @param aswmsgMessageQueuePersistence the aswmsg message queue persistence
	 */
	public void setAswmsgMessageQueuePersistence(
		AswmsgMessageQueuePersistence aswmsgMessageQueuePersistence) {
		this.aswmsgMessageQueuePersistence = aswmsgMessageQueuePersistence;
	}

	/**
	 * Returns the aswmsg message queue finder.
	 *
	 * @return the aswmsg message queue finder
	 */
	public AswmsgMessageQueueFinder getAswmsgMessageQueueFinder() {
		return aswmsgMessageQueueFinder;
	}

	/**
	 * Sets the aswmsg message queue finder.
	 *
	 * @param aswmsgMessageQueueFinder the aswmsg message queue finder
	 */
	public void setAswmsgMessageQueueFinder(
		AswmsgMessageQueueFinder aswmsgMessageQueueFinder) {
		this.aswmsgMessageQueueFinder = aswmsgMessageQueueFinder;
	}

	/**
	 * Returns the aswmsg syndatahistory local service.
	 *
	 * @return the aswmsg syndatahistory local service
	 */
	public vn.dtt.gt.dk.dao.aswmsg.service.AswmsgSyndatahistoryLocalService getAswmsgSyndatahistoryLocalService() {
		return aswmsgSyndatahistoryLocalService;
	}

	/**
	 * Sets the aswmsg syndatahistory local service.
	 *
	 * @param aswmsgSyndatahistoryLocalService the aswmsg syndatahistory local service
	 */
	public void setAswmsgSyndatahistoryLocalService(
		vn.dtt.gt.dk.dao.aswmsg.service.AswmsgSyndatahistoryLocalService aswmsgSyndatahistoryLocalService) {
		this.aswmsgSyndatahistoryLocalService = aswmsgSyndatahistoryLocalService;
	}

	/**
	 * Returns the aswmsg syndatahistory persistence.
	 *
	 * @return the aswmsg syndatahistory persistence
	 */
	public AswmsgSyndatahistoryPersistence getAswmsgSyndatahistoryPersistence() {
		return aswmsgSyndatahistoryPersistence;
	}

	/**
	 * Sets the aswmsg syndatahistory persistence.
	 *
	 * @param aswmsgSyndatahistoryPersistence the aswmsg syndatahistory persistence
	 */
	public void setAswmsgSyndatahistoryPersistence(
		AswmsgSyndatahistoryPersistence aswmsgSyndatahistoryPersistence) {
		this.aswmsgSyndatahistoryPersistence = aswmsgSyndatahistoryPersistence;
	}

	/**
	 * Returns the aswmsg validation log local service.
	 *
	 * @return the aswmsg validation log local service
	 */
	public vn.dtt.gt.dk.dao.aswmsg.service.AswmsgValidationLogLocalService getAswmsgValidationLogLocalService() {
		return aswmsgValidationLogLocalService;
	}

	/**
	 * Sets the aswmsg validation log local service.
	 *
	 * @param aswmsgValidationLogLocalService the aswmsg validation log local service
	 */
	public void setAswmsgValidationLogLocalService(
		vn.dtt.gt.dk.dao.aswmsg.service.AswmsgValidationLogLocalService aswmsgValidationLogLocalService) {
		this.aswmsgValidationLogLocalService = aswmsgValidationLogLocalService;
	}

	/**
	 * Returns the aswmsg validation log persistence.
	 *
	 * @return the aswmsg validation log persistence
	 */
	public AswmsgValidationLogPersistence getAswmsgValidationLogPersistence() {
		return aswmsgValidationLogPersistence;
	}

	/**
	 * Sets the aswmsg validation log persistence.
	 *
	 * @param aswmsgValidationLogPersistence the aswmsg validation log persistence
	 */
	public void setAswmsgValidationLogPersistence(
		AswmsgValidationLogPersistence aswmsgValidationLogPersistence) {
		this.aswmsgValidationLogPersistence = aswmsgValidationLogPersistence;
	}

	/**
	 * Returns the aswmsg validation log finder.
	 *
	 * @return the aswmsg validation log finder
	 */
	public AswmsgValidationLogFinder getAswmsgValidationLogFinder() {
		return aswmsgValidationLogFinder;
	}

	/**
	 * Sets the aswmsg validation log finder.
	 *
	 * @param aswmsgValidationLogFinder the aswmsg validation log finder
	 */
	public void setAswmsgValidationLogFinder(
		AswmsgValidationLogFinder aswmsgValidationLogFinder) {
		this.aswmsgValidationLogFinder = aswmsgValidationLogFinder;
	}

	/**
	 * Returns the aswmsg webservice local service.
	 *
	 * @return the aswmsg webservice local service
	 */
	public vn.dtt.gt.dk.dao.aswmsg.service.AswmsgWebserviceLocalService getAswmsgWebserviceLocalService() {
		return aswmsgWebserviceLocalService;
	}

	/**
	 * Sets the aswmsg webservice local service.
	 *
	 * @param aswmsgWebserviceLocalService the aswmsg webservice local service
	 */
	public void setAswmsgWebserviceLocalService(
		vn.dtt.gt.dk.dao.aswmsg.service.AswmsgWebserviceLocalService aswmsgWebserviceLocalService) {
		this.aswmsgWebserviceLocalService = aswmsgWebserviceLocalService;
	}

	/**
	 * Returns the aswmsg webservice persistence.
	 *
	 * @return the aswmsg webservice persistence
	 */
	public AswmsgWebservicePersistence getAswmsgWebservicePersistence() {
		return aswmsgWebservicePersistence;
	}

	/**
	 * Sets the aswmsg webservice persistence.
	 *
	 * @param aswmsgWebservicePersistence the aswmsg webservice persistence
	 */
	public void setAswmsgWebservicePersistence(
		AswmsgWebservicePersistence aswmsgWebservicePersistence) {
		this.aswmsgWebservicePersistence = aswmsgWebservicePersistence;
	}

	/**
	 * Returns the monitor message queue local service.
	 *
	 * @return the monitor message queue local service
	 */
	public vn.dtt.gt.dk.dao.aswmsg.service.MonitorMessageQueueLocalService getMonitorMessageQueueLocalService() {
		return monitorMessageQueueLocalService;
	}

	/**
	 * Sets the monitor message queue local service.
	 *
	 * @param monitorMessageQueueLocalService the monitor message queue local service
	 */
	public void setMonitorMessageQueueLocalService(
		vn.dtt.gt.dk.dao.aswmsg.service.MonitorMessageQueueLocalService monitorMessageQueueLocalService) {
		this.monitorMessageQueueLocalService = monitorMessageQueueLocalService;
	}

	/**
	 * Returns the monitor message queue persistence.
	 *
	 * @return the monitor message queue persistence
	 */
	public MonitorMessageQueuePersistence getMonitorMessageQueuePersistence() {
		return monitorMessageQueuePersistence;
	}

	/**
	 * Sets the monitor message queue persistence.
	 *
	 * @param monitorMessageQueuePersistence the monitor message queue persistence
	 */
	public void setMonitorMessageQueuePersistence(
		MonitorMessageQueuePersistence monitorMessageQueuePersistence) {
		this.monitorMessageQueuePersistence = monitorMessageQueuePersistence;
	}

	/**
	 * Returns the monitor message queue finder.
	 *
	 * @return the monitor message queue finder
	 */
	public MonitorMessageQueueFinder getMonitorMessageQueueFinder() {
		return monitorMessageQueueFinder;
	}

	/**
	 * Sets the monitor message queue finder.
	 *
	 * @param monitorMessageQueueFinder the monitor message queue finder
	 */
	public void setMonitorMessageQueueFinder(
		MonitorMessageQueueFinder monitorMessageQueueFinder) {
		this.monitorMessageQueueFinder = monitorMessageQueueFinder;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice",
			aswmsgWebserviceLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return AswmsgWebservice.class;
	}

	protected String getModelClassName() {
		return AswmsgWebservice.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = aswmsgWebservicePersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageLogLocalService.class)
	protected vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageLogLocalService aswmsgMessageLogLocalService;
	@BeanReference(type = AswmsgMessageLogPersistence.class)
	protected AswmsgMessageLogPersistence aswmsgMessageLogPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageQueueLocalService.class)
	protected vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageQueueLocalService aswmsgMessageQueueLocalService;
	@BeanReference(type = AswmsgMessageQueuePersistence.class)
	protected AswmsgMessageQueuePersistence aswmsgMessageQueuePersistence;
	@BeanReference(type = AswmsgMessageQueueFinder.class)
	protected AswmsgMessageQueueFinder aswmsgMessageQueueFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.aswmsg.service.AswmsgSyndatahistoryLocalService.class)
	protected vn.dtt.gt.dk.dao.aswmsg.service.AswmsgSyndatahistoryLocalService aswmsgSyndatahistoryLocalService;
	@BeanReference(type = AswmsgSyndatahistoryPersistence.class)
	protected AswmsgSyndatahistoryPersistence aswmsgSyndatahistoryPersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.aswmsg.service.AswmsgValidationLogLocalService.class)
	protected vn.dtt.gt.dk.dao.aswmsg.service.AswmsgValidationLogLocalService aswmsgValidationLogLocalService;
	@BeanReference(type = AswmsgValidationLogPersistence.class)
	protected AswmsgValidationLogPersistence aswmsgValidationLogPersistence;
	@BeanReference(type = AswmsgValidationLogFinder.class)
	protected AswmsgValidationLogFinder aswmsgValidationLogFinder;
	@BeanReference(type = vn.dtt.gt.dk.dao.aswmsg.service.AswmsgWebserviceLocalService.class)
	protected vn.dtt.gt.dk.dao.aswmsg.service.AswmsgWebserviceLocalService aswmsgWebserviceLocalService;
	@BeanReference(type = AswmsgWebservicePersistence.class)
	protected AswmsgWebservicePersistence aswmsgWebservicePersistence;
	@BeanReference(type = vn.dtt.gt.dk.dao.aswmsg.service.MonitorMessageQueueLocalService.class)
	protected vn.dtt.gt.dk.dao.aswmsg.service.MonitorMessageQueueLocalService monitorMessageQueueLocalService;
	@BeanReference(type = MonitorMessageQueuePersistence.class)
	protected MonitorMessageQueuePersistence monitorMessageQueuePersistence;
	@BeanReference(type = MonitorMessageQueueFinder.class)
	protected MonitorMessageQueueFinder monitorMessageQueueFinder;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private AswmsgWebserviceLocalServiceClpInvoker _clpInvoker = new AswmsgWebserviceLocalServiceClpInvoker();
}