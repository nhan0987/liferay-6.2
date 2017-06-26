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

package vn.dtt.gt.dk.dao.aswmsg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AswmsgMessageQueueLocalService}.
 *
 * @author win_64
 * @see AswmsgMessageQueueLocalService
 * @generated
 */
public class AswmsgMessageQueueLocalServiceWrapper
	implements AswmsgMessageQueueLocalService,
		ServiceWrapper<AswmsgMessageQueueLocalService> {
	public AswmsgMessageQueueLocalServiceWrapper(
		AswmsgMessageQueueLocalService aswmsgMessageQueueLocalService) {
		_aswmsgMessageQueueLocalService = aswmsgMessageQueueLocalService;
	}

	/**
	* Adds the aswmsg message queue to the database. Also notifies the appropriate model listeners.
	*
	* @param aswmsgMessageQueue the aswmsg message queue
	* @return the aswmsg message queue that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue addAswmsgMessageQueue(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue aswmsgMessageQueue)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _aswmsgMessageQueueLocalService.addAswmsgMessageQueue(aswmsgMessageQueue);
	}

	/**
	* Creates a new aswmsg message queue with the primary key. Does not add the aswmsg message queue to the database.
	*
	* @param id the primary key for the new aswmsg message queue
	* @return the new aswmsg message queue
	*/
	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue createAswmsgMessageQueue(
		long id) {
		return _aswmsgMessageQueueLocalService.createAswmsgMessageQueue(id);
	}

	/**
	* Deletes the aswmsg message queue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the aswmsg message queue
	* @return the aswmsg message queue that was removed
	* @throws PortalException if a aswmsg message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue deleteAswmsgMessageQueue(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _aswmsgMessageQueueLocalService.deleteAswmsgMessageQueue(id);
	}

	/**
	* Deletes the aswmsg message queue from the database. Also notifies the appropriate model listeners.
	*
	* @param aswmsgMessageQueue the aswmsg message queue
	* @return the aswmsg message queue that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue deleteAswmsgMessageQueue(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue aswmsgMessageQueue)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _aswmsgMessageQueueLocalService.deleteAswmsgMessageQueue(aswmsgMessageQueue);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _aswmsgMessageQueueLocalService.dynamicQuery();
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
		return _aswmsgMessageQueueLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _aswmsgMessageQueueLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _aswmsgMessageQueueLocalService.dynamicQuery(dynamicQuery,
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
		return _aswmsgMessageQueueLocalService.dynamicQueryCount(dynamicQuery);
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
		return _aswmsgMessageQueueLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchAswmsgMessageQueue(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _aswmsgMessageQueueLocalService.fetchAswmsgMessageQueue(id);
	}

	/**
	* Returns the aswmsg message queue with the primary key.
	*
	* @param id the primary key of the aswmsg message queue
	* @return the aswmsg message queue
	* @throws PortalException if a aswmsg message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue getAswmsgMessageQueue(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _aswmsgMessageQueueLocalService.getAswmsgMessageQueue(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _aswmsgMessageQueueLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the aswmsg message queues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of aswmsg message queues
	* @param end the upper bound of the range of aswmsg message queues (not inclusive)
	* @return the range of aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> getAswmsgMessageQueues(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _aswmsgMessageQueueLocalService.getAswmsgMessageQueues(start, end);
	}

	/**
	* Returns the number of aswmsg message queues.
	*
	* @return the number of aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAswmsgMessageQueuesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _aswmsgMessageQueueLocalService.getAswmsgMessageQueuesCount();
	}

	/**
	* Updates the aswmsg message queue in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param aswmsgMessageQueue the aswmsg message queue
	* @return the aswmsg message queue that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue updateAswmsgMessageQueue(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue aswmsgMessageQueue)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _aswmsgMessageQueueLocalService.updateAswmsgMessageQueue(aswmsgMessageQueue);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _aswmsgMessageQueueLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_aswmsgMessageQueueLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _aswmsgMessageQueueLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> getListMessage2Queue(
		int count) {
		return _aswmsgMessageQueueLocalService.getListMessage2Queue(count);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByHoSoThuTucId(
		long hoSoThuTucId, int type, java.lang.String function) {
		return _aswmsgMessageQueueLocalService.findByHoSoThuTucId(hoSoThuTucId,
			type, function);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId, int type, java.lang.String function) {
		return _aswmsgMessageQueueLocalService.findByPhieuXuLyPhuId(phieuXuLyPhuId,
			type, function);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId) {
		return _aswmsgMessageQueueLocalService.findByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByHoSoThuTucId(
		long hoSoThuTucId) {
		return _aswmsgMessageQueueLocalService.findByHoSoThuTucId(hoSoThuTucId);
	}

	@Override
	public boolean updatePriorityAswmsgMessageQueue(long priority, long id) {
		return _aswmsgMessageQueueLocalService.updatePriorityAswmsgMessageQueue(priority,
			id);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByMessageId(
		java.lang.String messageId) {
		return _aswmsgMessageQueueLocalService.findByMessageId(messageId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AswmsgMessageQueueLocalService getWrappedAswmsgMessageQueueLocalService() {
		return _aswmsgMessageQueueLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAswmsgMessageQueueLocalService(
		AswmsgMessageQueueLocalService aswmsgMessageQueueLocalService) {
		_aswmsgMessageQueueLocalService = aswmsgMessageQueueLocalService;
	}

	@Override
	public AswmsgMessageQueueLocalService getWrappedService() {
		return _aswmsgMessageQueueLocalService;
	}

	@Override
	public void setWrappedService(
		AswmsgMessageQueueLocalService aswmsgMessageQueueLocalService) {
		_aswmsgMessageQueueLocalService = aswmsgMessageQueueLocalService;
	}

	private AswmsgMessageQueueLocalService _aswmsgMessageQueueLocalService;
}