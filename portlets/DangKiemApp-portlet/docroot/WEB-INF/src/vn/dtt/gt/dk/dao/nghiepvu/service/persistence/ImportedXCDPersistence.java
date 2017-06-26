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

import vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD;

/**
 * The persistence interface for the imported x c d service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ImportedXCDPersistenceImpl
 * @see ImportedXCDUtil
 * @generated
 */
public interface ImportedXCDPersistence extends BasePersistence<ImportedXCD> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ImportedXCDUtil} to access the imported x c d persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the imported x c ds where IDGCN = &#63; and trangthai = &#63;.
	*
	* @param IDGCN the i d g c n
	* @param trangthai the trangthai
	* @return the matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findByIDGCN(
		java.lang.String IDGCN, long trangthai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the imported x c ds where IDGCN = &#63; and trangthai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param IDGCN the i d g c n
	* @param trangthai the trangthai
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @return the range of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findByIDGCN(
		java.lang.String IDGCN, long trangthai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the imported x c ds where IDGCN = &#63; and trangthai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param IDGCN the i d g c n
	* @param trangthai the trangthai
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findByIDGCN(
		java.lang.String IDGCN, long trangthai, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first imported x c d in the ordered set where IDGCN = &#63; and trangthai = &#63;.
	*
	* @param IDGCN the i d g c n
	* @param trangthai the trangthai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD findByIDGCN_First(
		java.lang.String IDGCN, long trangthai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException;

	/**
	* Returns the first imported x c d in the ordered set where IDGCN = &#63; and trangthai = &#63;.
	*
	* @param IDGCN the i d g c n
	* @param trangthai the trangthai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD fetchByIDGCN_First(
		java.lang.String IDGCN, long trangthai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last imported x c d in the ordered set where IDGCN = &#63; and trangthai = &#63;.
	*
	* @param IDGCN the i d g c n
	* @param trangthai the trangthai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD findByIDGCN_Last(
		java.lang.String IDGCN, long trangthai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException;

	/**
	* Returns the last imported x c d in the ordered set where IDGCN = &#63; and trangthai = &#63;.
	*
	* @param IDGCN the i d g c n
	* @param trangthai the trangthai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD fetchByIDGCN_Last(
		java.lang.String IDGCN, long trangthai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the imported x c ds before and after the current imported x c d in the ordered set where IDGCN = &#63; and trangthai = &#63;.
	*
	* @param id the primary key of the current imported x c d
	* @param IDGCN the i d g c n
	* @param trangthai the trangthai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a imported x c d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD[] findByIDGCN_PrevAndNext(
		long id, java.lang.String IDGCN, long trangthai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException;

	/**
	* Removes all the imported x c ds where IDGCN = &#63; and trangthai = &#63; from the database.
	*
	* @param IDGCN the i d g c n
	* @param trangthai the trangthai
	* @throws SystemException if a system exception occurred
	*/
	public void removeByIDGCN(java.lang.String IDGCN, long trangthai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of imported x c ds where IDGCN = &#63; and trangthai = &#63;.
	*
	* @param IDGCN the i d g c n
	* @param trangthai the trangthai
	* @return the number of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public int countByIDGCN(java.lang.String IDGCN, long trangthai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the imported x c ds where SoDangKy = &#63;.
	*
	* @param SoDangKy the so dang ky
	* @return the matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoDangKy(
		java.lang.String SoDangKy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the imported x c ds where SoDangKy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SoDangKy the so dang ky
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @return the range of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoDangKy(
		java.lang.String SoDangKy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the imported x c ds where SoDangKy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SoDangKy the so dang ky
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoDangKy(
		java.lang.String SoDangKy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first imported x c d in the ordered set where SoDangKy = &#63;.
	*
	* @param SoDangKy the so dang ky
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD findBySoDangKy_First(
		java.lang.String SoDangKy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException;

	/**
	* Returns the first imported x c d in the ordered set where SoDangKy = &#63;.
	*
	* @param SoDangKy the so dang ky
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD fetchBySoDangKy_First(
		java.lang.String SoDangKy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last imported x c d in the ordered set where SoDangKy = &#63;.
	*
	* @param SoDangKy the so dang ky
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD findBySoDangKy_Last(
		java.lang.String SoDangKy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException;

	/**
	* Returns the last imported x c d in the ordered set where SoDangKy = &#63;.
	*
	* @param SoDangKy the so dang ky
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD fetchBySoDangKy_Last(
		java.lang.String SoDangKy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the imported x c ds before and after the current imported x c d in the ordered set where SoDangKy = &#63;.
	*
	* @param id the primary key of the current imported x c d
	* @param SoDangKy the so dang ky
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a imported x c d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD[] findBySoDangKy_PrevAndNext(
		long id, java.lang.String SoDangKy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException;

	/**
	* Removes all the imported x c ds where SoDangKy = &#63; from the database.
	*
	* @param SoDangKy the so dang ky
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySoDangKy(java.lang.String SoDangKy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of imported x c ds where SoDangKy = &#63;.
	*
	* @param SoDangKy the so dang ky
	* @return the number of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public int countBySoDangKy(java.lang.String SoDangKy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the imported x c ds where SoBienBan = &#63;.
	*
	* @param SoBienBan the so bien ban
	* @return the matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoBienBan(
		java.lang.String SoBienBan)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the imported x c ds where SoBienBan = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SoBienBan the so bien ban
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @return the range of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoBienBan(
		java.lang.String SoBienBan, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the imported x c ds where SoBienBan = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SoBienBan the so bien ban
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoBienBan(
		java.lang.String SoBienBan, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first imported x c d in the ordered set where SoBienBan = &#63;.
	*
	* @param SoBienBan the so bien ban
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD findBySoBienBan_First(
		java.lang.String SoBienBan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException;

	/**
	* Returns the first imported x c d in the ordered set where SoBienBan = &#63;.
	*
	* @param SoBienBan the so bien ban
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD fetchBySoBienBan_First(
		java.lang.String SoBienBan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last imported x c d in the ordered set where SoBienBan = &#63;.
	*
	* @param SoBienBan the so bien ban
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD findBySoBienBan_Last(
		java.lang.String SoBienBan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException;

	/**
	* Returns the last imported x c d in the ordered set where SoBienBan = &#63;.
	*
	* @param SoBienBan the so bien ban
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD fetchBySoBienBan_Last(
		java.lang.String SoBienBan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the imported x c ds before and after the current imported x c d in the ordered set where SoBienBan = &#63;.
	*
	* @param id the primary key of the current imported x c d
	* @param SoBienBan the so bien ban
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a imported x c d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD[] findBySoBienBan_PrevAndNext(
		long id, java.lang.String SoBienBan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException;

	/**
	* Removes all the imported x c ds where SoBienBan = &#63; from the database.
	*
	* @param SoBienBan the so bien ban
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySoBienBan(java.lang.String SoBienBan)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of imported x c ds where SoBienBan = &#63;.
	*
	* @param SoBienBan the so bien ban
	* @return the number of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public int countBySoBienBan(java.lang.String SoBienBan)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the imported x c ds where SoToKhai = &#63;.
	*
	* @param SoToKhai the so to khai
	* @return the matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoToKhai(
		java.lang.String SoToKhai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the imported x c ds where SoToKhai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SoToKhai the so to khai
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @return the range of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoToKhai(
		java.lang.String SoToKhai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the imported x c ds where SoToKhai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SoToKhai the so to khai
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoToKhai(
		java.lang.String SoToKhai, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first imported x c d in the ordered set where SoToKhai = &#63;.
	*
	* @param SoToKhai the so to khai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD findBySoToKhai_First(
		java.lang.String SoToKhai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException;

	/**
	* Returns the first imported x c d in the ordered set where SoToKhai = &#63;.
	*
	* @param SoToKhai the so to khai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD fetchBySoToKhai_First(
		java.lang.String SoToKhai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last imported x c d in the ordered set where SoToKhai = &#63;.
	*
	* @param SoToKhai the so to khai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD findBySoToKhai_Last(
		java.lang.String SoToKhai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException;

	/**
	* Returns the last imported x c d in the ordered set where SoToKhai = &#63;.
	*
	* @param SoToKhai the so to khai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD fetchBySoToKhai_Last(
		java.lang.String SoToKhai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the imported x c ds before and after the current imported x c d in the ordered set where SoToKhai = &#63;.
	*
	* @param id the primary key of the current imported x c d
	* @param SoToKhai the so to khai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a imported x c d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD[] findBySoToKhai_PrevAndNext(
		long id, java.lang.String SoToKhai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException;

	/**
	* Removes all the imported x c ds where SoToKhai = &#63; from the database.
	*
	* @param SoToKhai the so to khai
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySoToKhai(java.lang.String SoToKhai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of imported x c ds where SoToKhai = &#63;.
	*
	* @param SoToKhai the so to khai
	* @return the number of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public int countBySoToKhai(java.lang.String SoToKhai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the imported x c d in the entity cache if it is enabled.
	*
	* @param importedXCD the imported x c d
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD importedXCD);

	/**
	* Caches the imported x c ds in the entity cache if it is enabled.
	*
	* @param importedXCDs the imported x c ds
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> importedXCDs);

	/**
	* Creates a new imported x c d with the primary key. Does not add the imported x c d to the database.
	*
	* @param id the primary key for the new imported x c d
	* @return the new imported x c d
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD create(long id);

	/**
	* Removes the imported x c d with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the imported x c d
	* @return the imported x c d that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a imported x c d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD importedXCD)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the imported x c d with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException} if it could not be found.
	*
	* @param id the primary key of the imported x c d
	* @return the imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a imported x c d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException;

	/**
	* Returns the imported x c d with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the imported x c d
	* @return the imported x c d, or <code>null</code> if a imported x c d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the imported x c ds.
	*
	* @return the imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the imported x c ds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @return the range of imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the imported x c ds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the imported x c ds from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of imported x c ds.
	*
	* @return the number of imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}