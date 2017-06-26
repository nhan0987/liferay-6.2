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

package vn.dtt.gt.dk.dao.aswmsg.service.impl;

import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue;
import vn.dtt.gt.dk.dao.aswmsg.service.base.MonitorMessageQueueLocalServiceBaseImpl;

/**
 * The implementation of the monitor message queue local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.aswmsg.service.MonitorMessageQueueLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.aswmsg.service.base.MonitorMessageQueueLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.aswmsg.service.MonitorMessageQueueLocalServiceUtil
 */
public class MonitorMessageQueueLocalServiceImpl
	extends MonitorMessageQueueLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.aswmsg.service.MonitorMessageQueueLocalServiceUtil} to access the monitor message queue local service.
	 */
	
	public boolean updatePriorityMessageQueue(long idMonitorMessage) {
		return monitorMessageQueueFinder.updatePriorityMessageQueue(idMonitorMessage);
	}
	
	public List<MonitorMessageQueue> findMonitorMessageQueue() {
		return monitorMessageQueueFinder.findMonitorMessageQueue();
	}
	
	public List<MonitorMessageQueue> findByMessageId(String messageId){
		try{
			return monitorMessageQueuePersistence.findByMessageId(messageId);
		}catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<MonitorMessageQueue> findAll(){
		try{
			return monitorMessageQueuePersistence.findAll();
		}catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<MonitorMessageQueue> findByLayPhieuXuLyPhuId(
			long phieuXuLyPhuId){
		try{
			return monitorMessageQueuePersistence.findByLayPhieuXuLyPhuId(phieuXuLyPhuId);
		}catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<MonitorMessageQueue> findByLayMessageId(
			java.lang.String documentType){
		try{
			return monitorMessageQueuePersistence.findByLayMessageId(documentType);
		}catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public int countByHoSoThuTucId(long hoSoThuTucId){
		try{
			return monitorMessageQueuePersistence.countByHoSoThuTucId(hoSoThuTucId);
		}catch (Exception e) {
			_log.error(e);
		}
		return 0;
	}
	
	public int countByLayPhieuXuLyPhuId(long phieuXuLyPhuId){
		try{
			return monitorMessageQueuePersistence.countByLayPhieuXuLyPhuId(phieuXuLyPhuId);
		}catch (Exception e) {
			_log.error(e);
		}
		return 0;
	}
	
	private static Log _log = LogFactoryUtil.getLog(MonitorMessageQueueLocalServiceImpl.class);
}