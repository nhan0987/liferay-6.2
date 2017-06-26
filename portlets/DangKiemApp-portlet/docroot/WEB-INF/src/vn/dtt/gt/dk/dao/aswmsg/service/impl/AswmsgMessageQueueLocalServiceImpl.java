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

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue;
import vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageQueueLocalServiceUtil;
import vn.dtt.gt.dk.dao.aswmsg.service.base.AswmsgMessageQueueLocalServiceBaseImpl;

/**
 * The implementation of the aswmsg message queue local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageQueueLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.aswmsg.service.base.AswmsgMessageQueueLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageQueueLocalServiceUtil
 */
public class AswmsgMessageQueueLocalServiceImpl
	extends AswmsgMessageQueueLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageQueueLocalServiceUtil} to access the aswmsg message queue local service.
	 */
	public List<AswmsgMessageQueue> getListMessage2Queue(int count){
		try{
			return aswmsgMessageQueueFinder.getListMessage2Queue(count);
		}catch (Exception e) {
//			_log.error(e);
		} 
		return null;
	}
	
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByHoSoThuTucId(
			long hoSoThuTucId, int type, java.lang.String function){
		try{
			return aswmsgMessageQueuePersistence.findByHoSoThuTucId(hoSoThuTucId, type, function);
		}catch (Exception e) {
//			_log.error(e);
		}
		return null;
	}
	
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByPhieuXuLyPhuId(
			long phieuXuLyPhuId, int type, java.lang.String function){
		try{
			return aswmsgMessageQueuePersistence.findByPhieuXuLyPhuId(phieuXuLyPhuId, type, function);
		}catch (Exception e) {
//			_log.error(e);
		}
		return null;
	}
	
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByPhieuXuLyPhuId(long phieuXuLyPhuId){
		try{
			return aswmsgMessageQueuePersistence.findByLayPhieuXuLyPhuId(phieuXuLyPhuId);
		}catch (Exception e) {
//			_log.error(e);
		}
		return null;
	}
		
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByHoSoThuTucId(
			long hoSoThuTucId){
		try{
			return aswmsgMessageQueuePersistence.findByLayHoSoThuTucId(hoSoThuTucId);
		}catch (Exception e) {
//			_log.error(e);
		}
		return null;
	}
			
	
	public boolean updatePriorityAswmsgMessageQueue(long priority, long id) {
		try{
			
			return aswmsgMessageQueueFinder.updatePriorityAswmsgMessageQueue(priority,id);
		}catch (Exception e) {
//			_log.error(e);
		}
		return false;
	}
	
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByMessageId(
			java.lang.String messageId){
		try{
			return aswmsgMessageQueuePersistence.findByMessageId(messageId);
		}catch (Exception e) {
//			_log.error(e);
		}
		return null;
	}
}