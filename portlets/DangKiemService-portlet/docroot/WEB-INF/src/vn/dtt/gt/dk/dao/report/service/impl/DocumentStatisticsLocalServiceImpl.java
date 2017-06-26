/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package vn.dtt.gt.dk.dao.report.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import vn.dtt.gt.dk.dao.report.model.DocumentStatistics;
import vn.dtt.gt.dk.dao.report.service.base.DocumentStatisticsLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the document statistics local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.report.service.DocumentStatisticsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.report.service.base.DocumentStatisticsLocalServiceBaseImpl
 * @see vn.gt.dao.report.service.DocumentStatisticsLocalServiceUtil
 */
public class DocumentStatisticsLocalServiceImpl
	extends DocumentStatisticsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.report.service.DocumentStatisticsLocalServiceUtil} to access the document statistics local service.
	 */
	
	public List<DocumentStatistics> getListDocumentStatistics(int status) 
		throws SystemException {
		
		return documentStatisticsPersistence.findByStatus(status);
	}
	
	public DocumentStatistics fetchByDocumentTypeCodeYearMonth(String documentTypeCode, 
			int year, int month) 
		throws SystemException {
		
		return documentStatisticsPersistence.fetchByDTC_Y_M(documentTypeCode, year, month);
	}
	
	public List<DocumentStatistics> getByYear_Month(int year, int month) 
		throws SystemException {
		
		return documentStatisticsPersistence.findByYear_Month(year, month);
	}
	
	public List<DocumentStatistics> getByYear_Month_Status(int year, int month, int status) 
			throws SystemException {
			
			return documentStatisticsPersistence.findByYear_Month_Status(year, month, status);
		}
	
	public DocumentStatistics getByDocumentTypeCodeYearMonth(String documentTypeCode, 
			int year, int month) 
		throws SystemException, PortalException {
		
		return documentStatisticsPersistence.findByDTC_Y_M(documentTypeCode, year, month);
	}
	
	public DocumentStatistics updateStatus(DocumentStatistics documentStatistics, int status) 
		throws SystemException {
	
		if(documentStatistics != null) {
			documentStatistics.setStatus(status);
			documentStatistics.setModifiedDate(new Date());
			
			documentStatisticsPersistence.update(documentStatistics, false);
		}
		
		return documentStatistics;
	}
	
	public DocumentStatistics updateDocumentStatistics(int year, int month,
			String documentTypeCode, long remainingNumber, long receivedNumber,
			long processingNumber, long ontimeNumber, long overtimeNumber,
			long delayingNumber) 
		throws SystemException {
		
		DocumentStatistics documentStatistics = documentStatisticsPersistence.fetchByDTC_Y_M(
				documentTypeCode, year, month);
		
		Date now = new Date();
		
		if(documentStatistics == null) {
			long id = counterLocalService.increment(DocumentStatistics.class.getName());
			
			documentStatistics = documentStatisticsPersistence.create(id);
			documentStatistics.setCreateDate(now);
		}
		
		documentStatistics.setModifiedDate(now);
		
		documentStatistics.setYear(year);
		documentStatistics.setMonth(month);
		
		/*if(remainingNumber == 0) {
			Calendar calBefore = Calendar.getInstance();
			calBefore.set(Calendar.YEAR, year);
			calBefore.set(Calendar.MONTH, month - 2);
			
			// lui lai 1 thang
			DocumentStatistics documentBefore = documentStatisticsPersistence.fetchByDTC_Y_M(
					documentTypeCode, calBefore.get(Calendar.YEAR), calBefore.get(Calendar.MONTH) + 1);
			
			if(documentBefore != null) {
				remainingNumber = documentBefore.getProcessingNumber();
			}
		}
		
		if(processingNumber == 0) {
			processingNumber = remainingNumber + receivedNumber- ontimeNumber;
		}*/
		
		documentStatistics.setRemainingNumber(remainingNumber);
		documentStatistics.setDocumentTypeCode(documentTypeCode);
		documentStatistics.setReceivedNumber(receivedNumber);
		documentStatistics.setProcessingNumber(processingNumber);
		documentStatistics.setOntimeNumber(ontimeNumber);
		documentStatistics.setOvertimeNumber(overtimeNumber);
		documentStatistics.setDelayingNumber(delayingNumber);
		documentStatistics.setStatus(0);
		
		return documentStatisticsPersistence.update(documentStatistics, false);
	}
}