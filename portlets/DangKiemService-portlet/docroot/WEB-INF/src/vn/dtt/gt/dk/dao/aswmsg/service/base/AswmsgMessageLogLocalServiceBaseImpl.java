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

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog;
import vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageLogLocalService;
import vn.dtt.gt.dk.dao.aswmsg.service.persistence.AswmsgMessageLogPersistence;
import vn.dtt.gt.dk.dao.aswmsg.service.persistence.AswmsgMessageQueuePersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the aswmsg message log local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link vn.dtt.gt.dk.dao.aswmsg.service.impl.AswmsgMessageLogLocalServiceImpl}.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.aswmsg.service.impl.AswmsgMessageLogLocalServiceImpl
 * @see vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageLogLocalServiceUtil
 * @generated
 */
public abstract class AswmsgMessageLogLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements AswmsgMessageLogLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageLogLocalServiceUtil} to access the aswmsg message log local service.
	 */

	/**
	 * Adds the aswmsg message log to the database. Also notifies the appropriate model listeners.
	 *
	 * @param aswmsgMessageLog the aswmsg message log
	 * @return the aswmsg message log that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AswmsgMessageLog addAswmsgMessageLog(
		AswmsgMessageLog aswmsgMessageLog) throws SystemException {
		aswmsgMessageLog.setNew(true);

		return aswmsgMessageLogPersistence.update(aswmsgMessageLog);
	}

	/**
	 * Creates a new aswmsg message log with the primary key. Does not add the aswmsg message log to the database.
	 *
	 * @param Id the primary key for the new aswmsg message log
	 * @return the new aswmsg message log
	 */
	@Override
	public AswmsgMessageLog createAswmsgMessageLog(long Id) {
		return aswmsgMessageLogPersistence.create(Id);
	}

	/**
	 * Deletes the aswmsg message log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the aswmsg message log
	 * @return the aswmsg message log that was removed
	 * @throws PortalException if a aswmsg message log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AswmsgMessageLog deleteAswmsgMessageLog(long Id)
		throws PortalException, SystemException {
		return aswmsgMessageLogPersistence.remove(Id);
	}

	/**
	 * Deletes the aswmsg message log from the database. Also notifies the appropriate model listeners.
	 *
	 * @param aswmsgMessageLog the aswmsg message log
	 * @return the aswmsg message log that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AswmsgMessageLog deleteAswmsgMessageLog(
		AswmsgMessageLog aswmsgMessageLog) throws SystemException {
		return aswmsgMessageLogPersistence.remove(aswmsgMessageLog);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(AswmsgMessageLog.class,
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
		return aswmsgMessageLogPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return aswmsgMessageLogPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return aswmsgMessageLogPersistence.findWithDynamicQuery(dynamicQuery,
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
		return aswmsgMessageLogPersistence.countWithDynamicQuery(dynamicQuery);
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
		return aswmsgMessageLogPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public AswmsgMessageLog fetchAswmsgMessageLog(long Id)
		throws SystemException {
		return aswmsgMessageLogPersistence.fetchByPrimaryKey(Id);
	}

	/**
	 * Returns the aswmsg message log with the primary key.
	 *
	 * @param Id the primary key of the aswmsg message log
	 * @return the aswmsg message log
	 * @throws PortalException if a aswmsg message log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AswmsgMessageLog getAswmsgMessageLog(long Id)
		throws PortalException, SystemException {
		return aswmsgMessageLogPersistence.findByPrimaryKey(Id);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return aswmsgMessageLogPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the aswmsg message logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of aswmsg message logs
	 * @param end the upper bound of the range of aswmsg message logs (not inclusive)
	 * @return the range of aswmsg message logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AswmsgMessageLog> getAswmsgMessageLogs(int start, int end)
		throws SystemException {
		return aswmsgMessageLogPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of aswmsg message logs.
	 *
	 * @return the number of aswmsg message logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getAswmsgMessageLogsCount() throws SystemException {
		return aswmsgMessageLogPersistence.countAll();
	}

	/**
	 * Updates the aswmsg message log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param aswmsgMessageLog the aswmsg message log
	 * @return the aswmsg message log that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AswmsgMessageLog updateAswmsgMessageLog(
		AswmsgMessageLog aswmsgMessageLog) throws SystemException {
		return aswmsgMessageLogPersistence.update(aswmsgMessageLog);
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

		PersistedModelLocalServiceRegistryUtil.register("vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog",
			aswmsgMessageLogLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog");
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
		return AswmsgMessageLog.class;
	}

	protected String getModelClassName() {
		return AswmsgMessageLog.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = aswmsgMessageLogPersistence.getDataSource();

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
	private AswmsgMessageLogLocalServiceClpInvoker _clpInvoker = new AswmsgMessageLogLocalServiceClpInvoker();
}