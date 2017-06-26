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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for MonitorMessageQueue. This utility wraps
 * {@link vn.dtt.gt.dk.dao.aswmsg.service.impl.MonitorMessageQueueLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author win_64
 * @see MonitorMessageQueueLocalService
 * @see vn.dtt.gt.dk.dao.aswmsg.service.base.MonitorMessageQueueLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.aswmsg.service.impl.MonitorMessageQueueLocalServiceImpl
 * @generated
 */
public class MonitorMessageQueueLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.aswmsg.service.impl.MonitorMessageQueueLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the monitor message queue to the database. Also notifies the appropriate model listeners.
	*
	* @param monitorMessageQueue the monitor message queue
	* @return the monitor message queue that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue addMonitorMessageQueue(
		vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue monitorMessageQueue)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addMonitorMessageQueue(monitorMessageQueue);
	}

	/**
	* Creates a new monitor message queue with the primary key. Does not add the monitor message queue to the database.
	*
	* @param id the primary key for the new monitor message queue
	* @return the new monitor message queue
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue createMonitorMessageQueue(
		long id) {
		return getService().createMonitorMessageQueue(id);
	}

	/**
	* Deletes the monitor message queue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the monitor message queue
	* @return the monitor message queue that was removed
	* @throws PortalException if a monitor message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue deleteMonitorMessageQueue(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMonitorMessageQueue(id);
	}

	/**
	* Deletes the monitor message queue from the database. Also notifies the appropriate model listeners.
	*
	* @param monitorMessageQueue the monitor message queue
	* @return the monitor message queue that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue deleteMonitorMessageQueue(
		vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue monitorMessageQueue)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMonitorMessageQueue(monitorMessageQueue);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.MonitorMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.MonitorMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue fetchMonitorMessageQueue(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMonitorMessageQueue(id);
	}

	/**
	* Returns the monitor message queue with the primary key.
	*
	* @param id the primary key of the monitor message queue
	* @return the monitor message queue
	* @throws PortalException if a monitor message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue getMonitorMessageQueue(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMonitorMessageQueue(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the monitor message queues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.MonitorMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of monitor message queues
	* @param end the upper bound of the range of monitor message queues (not inclusive)
	* @return the range of monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue> getMonitorMessageQueues(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMonitorMessageQueues(start, end);
	}

	/**
	* Returns the number of monitor message queues.
	*
	* @return the number of monitor message queues
	* @throws SystemException if a system exception occurred
	*/
	public static int getMonitorMessageQueuesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMonitorMessageQueuesCount();
	}

	/**
	* Updates the monitor message queue in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param monitorMessageQueue the monitor message queue
	* @return the monitor message queue that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue updateMonitorMessageQueue(
		vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue monitorMessageQueue)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMonitorMessageQueue(monitorMessageQueue);
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

	public static boolean updatePriorityMessageQueue(long idMonitorMessage) {
		return getService().updatePriorityMessageQueue(idMonitorMessage);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue> findMonitorMessageQueue() {
		return getService().findMonitorMessageQueue();
	}

	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue> findByMessageId(
		java.lang.String messageId) {
		return getService().findByMessageId(messageId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue> findAll() {
		return getService().findAll();
	}

	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue> findByLayPhieuXuLyPhuId(
		long phieuXuLyPhuId) {
		return getService().findByLayPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue> findByLayMessageId(
		java.lang.String documentType) {
		return getService().findByLayMessageId(documentType);
	}

	public static int countByHoSoThuTucId(long hoSoThuTucId) {
		return getService().countByHoSoThuTucId(hoSoThuTucId);
	}

	public static int countByLayPhieuXuLyPhuId(long phieuXuLyPhuId) {
		return getService().countByLayPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	public static void clearService() {
		_service = null;
	}

	public static MonitorMessageQueueLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MonitorMessageQueueLocalService.class.getName());

			if (invokableLocalService instanceof MonitorMessageQueueLocalService) {
				_service = (MonitorMessageQueueLocalService)invokableLocalService;
			}
			else {
				_service = new MonitorMessageQueueLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(MonitorMessageQueueLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(MonitorMessageQueueLocalService service) {
	}

	private static MonitorMessageQueueLocalService _service;
}