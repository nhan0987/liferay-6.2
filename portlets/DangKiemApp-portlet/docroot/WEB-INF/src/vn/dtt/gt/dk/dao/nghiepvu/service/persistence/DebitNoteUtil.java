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

import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote;

import java.util.List;

/**
 * The persistence utility for the debit note service. This utility wraps {@link DebitNotePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DebitNotePersistence
 * @see DebitNotePersistenceImpl
 * @generated
 */
public class DebitNoteUtil {
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
	public static void clearCache(DebitNote debitNote) {
		getPersistence().clearCache(debitNote);
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
	public static List<DebitNote> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DebitNote> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DebitNote> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DebitNote update(DebitNote debitNote)
		throws SystemException {
		return getPersistence().update(debitNote);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DebitNote update(DebitNote debitNote,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(debitNote, serviceContext);
	}

	/**
	* Returns the debit note where transactionId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException} if it could not be found.
	*
	* @param transactionId the transaction ID
	* @return the matching debit note
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a matching debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote findByTransactionId(
		java.lang.String transactionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException {
		return getPersistence().findByTransactionId(transactionId);
	}

	/**
	* Returns the debit note where transactionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param transactionId the transaction ID
	* @return the matching debit note, or <code>null</code> if a matching debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote fetchByTransactionId(
		java.lang.String transactionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTransactionId(transactionId);
	}

	/**
	* Returns the debit note where transactionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param transactionId the transaction ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching debit note, or <code>null</code> if a matching debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote fetchByTransactionId(
		java.lang.String transactionId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTransactionId(transactionId, retrieveFromCache);
	}

	/**
	* Removes the debit note where transactionId = &#63; from the database.
	*
	* @param transactionId the transaction ID
	* @return the debit note that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote removeByTransactionId(
		java.lang.String transactionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException {
		return getPersistence().removeByTransactionId(transactionId);
	}

	/**
	* Returns the number of debit notes where transactionId = &#63;.
	*
	* @param transactionId the transaction ID
	* @return the number of matching debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTransactionId(java.lang.String transactionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTransactionId(transactionId);
	}

	/**
	* Returns the debit note where debitNoteNumber = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException} if it could not be found.
	*
	* @param debitNoteNumber the debit note number
	* @return the matching debit note
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a matching debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote findByDebitNoteNumber(
		java.lang.String debitNoteNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException {
		return getPersistence().findByDebitNoteNumber(debitNoteNumber);
	}

	/**
	* Returns the debit note where debitNoteNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param debitNoteNumber the debit note number
	* @return the matching debit note, or <code>null</code> if a matching debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote fetchByDebitNoteNumber(
		java.lang.String debitNoteNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByDebitNoteNumber(debitNoteNumber);
	}

	/**
	* Returns the debit note where debitNoteNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param debitNoteNumber the debit note number
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching debit note, or <code>null</code> if a matching debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote fetchByDebitNoteNumber(
		java.lang.String debitNoteNumber, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDebitNoteNumber(debitNoteNumber, retrieveFromCache);
	}

	/**
	* Removes the debit note where debitNoteNumber = &#63; from the database.
	*
	* @param debitNoteNumber the debit note number
	* @return the debit note that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote removeByDebitNoteNumber(
		java.lang.String debitNoteNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException {
		return getPersistence().removeByDebitNoteNumber(debitNoteNumber);
	}

	/**
	* Returns the number of debit notes where debitNoteNumber = &#63;.
	*
	* @param debitNoteNumber the debit note number
	* @return the number of matching debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDebitNoteNumber(java.lang.String debitNoteNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDebitNoteNumber(debitNoteNumber);
	}

	/**
	* Returns all the debit notes where markAsDeleted = &#63;.
	*
	* @param markAsDeleted the mark as deleted
	* @return the matching debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findByMarkAsDeleted(
		int markAsDeleted)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMarkAsDeleted(markAsDeleted);
	}

	/**
	* Returns a range of all the debit notes where markAsDeleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param markAsDeleted the mark as deleted
	* @param start the lower bound of the range of debit notes
	* @param end the upper bound of the range of debit notes (not inclusive)
	* @return the range of matching debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findByMarkAsDeleted(
		int markAsDeleted, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMarkAsDeleted(markAsDeleted, start, end);
	}

	/**
	* Returns an ordered range of all the debit notes where markAsDeleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param markAsDeleted the mark as deleted
	* @param start the lower bound of the range of debit notes
	* @param end the upper bound of the range of debit notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findByMarkAsDeleted(
		int markAsDeleted, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMarkAsDeleted(markAsDeleted, start, end,
			orderByComparator);
	}

	/**
	* Returns the first debit note in the ordered set where markAsDeleted = &#63;.
	*
	* @param markAsDeleted the mark as deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching debit note
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a matching debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote findByMarkAsDeleted_First(
		int markAsDeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException {
		return getPersistence()
				   .findByMarkAsDeleted_First(markAsDeleted, orderByComparator);
	}

	/**
	* Returns the first debit note in the ordered set where markAsDeleted = &#63;.
	*
	* @param markAsDeleted the mark as deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching debit note, or <code>null</code> if a matching debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote fetchByMarkAsDeleted_First(
		int markAsDeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMarkAsDeleted_First(markAsDeleted, orderByComparator);
	}

	/**
	* Returns the last debit note in the ordered set where markAsDeleted = &#63;.
	*
	* @param markAsDeleted the mark as deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching debit note
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a matching debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote findByMarkAsDeleted_Last(
		int markAsDeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException {
		return getPersistence()
				   .findByMarkAsDeleted_Last(markAsDeleted, orderByComparator);
	}

	/**
	* Returns the last debit note in the ordered set where markAsDeleted = &#63;.
	*
	* @param markAsDeleted the mark as deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching debit note, or <code>null</code> if a matching debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote fetchByMarkAsDeleted_Last(
		int markAsDeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMarkAsDeleted_Last(markAsDeleted, orderByComparator);
	}

	/**
	* Returns the debit notes before and after the current debit note in the ordered set where markAsDeleted = &#63;.
	*
	* @param id the primary key of the current debit note
	* @param markAsDeleted the mark as deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next debit note
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote[] findByMarkAsDeleted_PrevAndNext(
		long id, int markAsDeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException {
		return getPersistence()
				   .findByMarkAsDeleted_PrevAndNext(id, markAsDeleted,
			orderByComparator);
	}

	/**
	* Removes all the debit notes where markAsDeleted = &#63; from the database.
	*
	* @param markAsDeleted the mark as deleted
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByMarkAsDeleted(int markAsDeleted)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByMarkAsDeleted(markAsDeleted);
	}

	/**
	* Returns the number of debit notes where markAsDeleted = &#63;.
	*
	* @param markAsDeleted the mark as deleted
	* @return the number of matching debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMarkAsDeleted(int markAsDeleted)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMarkAsDeleted(markAsDeleted);
	}

	/**
	* Caches the debit note in the entity cache if it is enabled.
	*
	* @param debitNote the debit note
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote) {
		getPersistence().cacheResult(debitNote);
	}

	/**
	* Caches the debit notes in the entity cache if it is enabled.
	*
	* @param debitNotes the debit notes
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> debitNotes) {
		getPersistence().cacheResult(debitNotes);
	}

	/**
	* Creates a new debit note with the primary key. Does not add the debit note to the database.
	*
	* @param id the primary key for the new debit note
	* @return the new debit note
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the debit note with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the debit note
	* @return the debit note that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(debitNote);
	}

	/**
	* Returns the debit note with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException} if it could not be found.
	*
	* @param id the primary key of the debit note
	* @return the debit note
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the debit note with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the debit note
	* @return the debit note, or <code>null</code> if a debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the debit notes.
	*
	* @return the debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the debit notes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of debit notes
	* @param end the upper bound of the range of debit notes (not inclusive)
	* @return the range of debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the debit notes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of debit notes
	* @param end the upper bound of the range of debit notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the debit notes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of debit notes.
	*
	* @return the number of debit notes
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DebitNotePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DebitNotePersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					DebitNotePersistence.class.getName());

			ReferenceRegistry.registerReference(DebitNoteUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DebitNotePersistence persistence) {
	}

	private static DebitNotePersistence _persistence;
}