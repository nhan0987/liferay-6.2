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

import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote;

/**
 * The persistence interface for the debit note service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see DebitNotePersistenceImpl
 * @see DebitNoteUtil
 * @generated
 */
public interface DebitNotePersistence extends BasePersistence<DebitNote> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DebitNoteUtil} to access the debit note persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the debit note where transactionId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException} if it could not be found.
	*
	* @param transactionId the transaction ID
	* @return the matching debit note
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a matching debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote findByTransactionId(
		java.lang.String transactionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException;

	/**
	* Returns the debit note where transactionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param transactionId the transaction ID
	* @return the matching debit note, or <code>null</code> if a matching debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote fetchByTransactionId(
		java.lang.String transactionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the debit note where transactionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param transactionId the transaction ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching debit note, or <code>null</code> if a matching debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote fetchByTransactionId(
		java.lang.String transactionId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the debit note where transactionId = &#63; from the database.
	*
	* @param transactionId the transaction ID
	* @return the debit note that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote removeByTransactionId(
		java.lang.String transactionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException;

	/**
	* Returns the number of debit notes where transactionId = &#63;.
	*
	* @param transactionId the transaction ID
	* @return the number of matching debit notes
	* @throws SystemException if a system exception occurred
	*/
	public int countByTransactionId(java.lang.String transactionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the debit note where debitNoteNumber = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException} if it could not be found.
	*
	* @param debitNoteNumber the debit note number
	* @return the matching debit note
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a matching debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote findByDebitNoteNumber(
		java.lang.String debitNoteNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException;

	/**
	* Returns the debit note where debitNoteNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param debitNoteNumber the debit note number
	* @return the matching debit note, or <code>null</code> if a matching debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote fetchByDebitNoteNumber(
		java.lang.String debitNoteNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the debit note where debitNoteNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param debitNoteNumber the debit note number
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching debit note, or <code>null</code> if a matching debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote fetchByDebitNoteNumber(
		java.lang.String debitNoteNumber, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the debit note where debitNoteNumber = &#63; from the database.
	*
	* @param debitNoteNumber the debit note number
	* @return the debit note that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote removeByDebitNoteNumber(
		java.lang.String debitNoteNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException;

	/**
	* Returns the number of debit notes where debitNoteNumber = &#63;.
	*
	* @param debitNoteNumber the debit note number
	* @return the number of matching debit notes
	* @throws SystemException if a system exception occurred
	*/
	public int countByDebitNoteNumber(java.lang.String debitNoteNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the debit notes where markAsDeleted = &#63;.
	*
	* @param markAsDeleted the mark as deleted
	* @return the matching debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findByMarkAsDeleted(
		int markAsDeleted)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findByMarkAsDeleted(
		int markAsDeleted, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findByMarkAsDeleted(
		int markAsDeleted, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first debit note in the ordered set where markAsDeleted = &#63;.
	*
	* @param markAsDeleted the mark as deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching debit note
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a matching debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote findByMarkAsDeleted_First(
		int markAsDeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException;

	/**
	* Returns the first debit note in the ordered set where markAsDeleted = &#63;.
	*
	* @param markAsDeleted the mark as deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching debit note, or <code>null</code> if a matching debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote fetchByMarkAsDeleted_First(
		int markAsDeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last debit note in the ordered set where markAsDeleted = &#63;.
	*
	* @param markAsDeleted the mark as deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching debit note
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a matching debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote findByMarkAsDeleted_Last(
		int markAsDeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException;

	/**
	* Returns the last debit note in the ordered set where markAsDeleted = &#63;.
	*
	* @param markAsDeleted the mark as deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching debit note, or <code>null</code> if a matching debit note could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote fetchByMarkAsDeleted_Last(
		int markAsDeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote[] findByMarkAsDeleted_PrevAndNext(
		long id, int markAsDeleted,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException;

	/**
	* Removes all the debit notes where markAsDeleted = &#63; from the database.
	*
	* @param markAsDeleted the mark as deleted
	* @throws SystemException if a system exception occurred
	*/
	public void removeByMarkAsDeleted(int markAsDeleted)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of debit notes where markAsDeleted = &#63;.
	*
	* @param markAsDeleted the mark as deleted
	* @return the number of matching debit notes
	* @throws SystemException if a system exception occurred
	*/
	public int countByMarkAsDeleted(int markAsDeleted)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the debit note in the entity cache if it is enabled.
	*
	* @param debitNote the debit note
	*/
	public void cacheResult(vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote);

	/**
	* Caches the debit notes in the entity cache if it is enabled.
	*
	* @param debitNotes the debit notes
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> debitNotes);

	/**
	* Creates a new debit note with the primary key. Does not add the debit note to the database.
	*
	* @param id the primary key for the new debit note
	* @return the new debit note
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote create(long id);

	/**
	* Removes the debit note with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the debit note
	* @return the debit note that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the debit note with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException} if it could not be found.
	*
	* @param id the primary key of the debit note
	* @return the debit note
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException if a debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteException;

	/**
	* Returns the debit note with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the debit note
	* @return the debit note, or <code>null</code> if a debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the debit notes.
	*
	* @return the debit notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the debit notes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of debit notes.
	*
	* @return the number of debit notes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}