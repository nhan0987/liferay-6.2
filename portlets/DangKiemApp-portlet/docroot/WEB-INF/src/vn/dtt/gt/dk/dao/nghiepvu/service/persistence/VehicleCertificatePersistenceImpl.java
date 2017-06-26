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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleCertificateException;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleCertificateImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleCertificateModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the vehicle certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see VehicleCertificatePersistence
 * @see VehicleCertificateUtil
 * @generated
 */
public class VehicleCertificatePersistenceImpl extends BasePersistenceImpl<VehicleCertificate>
	implements VehicleCertificatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VehicleCertificateUtil} to access the vehicle certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VehicleCertificateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VehicleCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VehicleCertificateModelImpl.FINDER_CACHE_ENABLED,
			VehicleCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VehicleCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VehicleCertificateModelImpl.FINDER_CACHE_ENABLED,
			VehicleCertificateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VehicleCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VehicleCertificateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public VehicleCertificatePersistenceImpl() {
		setModelClass(VehicleCertificate.class);
	}

	/**
	 * Caches the vehicle certificate in the entity cache if it is enabled.
	 *
	 * @param vehicleCertificate the vehicle certificate
	 */
	@Override
	public void cacheResult(VehicleCertificate vehicleCertificate) {
		EntityCacheUtil.putResult(VehicleCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VehicleCertificateImpl.class, vehicleCertificate.getPrimaryKey(),
			vehicleCertificate);

		vehicleCertificate.resetOriginalValues();
	}

	/**
	 * Caches the vehicle certificates in the entity cache if it is enabled.
	 *
	 * @param vehicleCertificates the vehicle certificates
	 */
	@Override
	public void cacheResult(List<VehicleCertificate> vehicleCertificates) {
		for (VehicleCertificate vehicleCertificate : vehicleCertificates) {
			if (EntityCacheUtil.getResult(
						VehicleCertificateModelImpl.ENTITY_CACHE_ENABLED,
						VehicleCertificateImpl.class,
						vehicleCertificate.getPrimaryKey()) == null) {
				cacheResult(vehicleCertificate);
			}
			else {
				vehicleCertificate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vehicle certificates.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(VehicleCertificateImpl.class.getName());
		}

		EntityCacheUtil.clearCache(VehicleCertificateImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vehicle certificate.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VehicleCertificate vehicleCertificate) {
		EntityCacheUtil.removeResult(VehicleCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VehicleCertificateImpl.class, vehicleCertificate.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VehicleCertificate> vehicleCertificates) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VehicleCertificate vehicleCertificate : vehicleCertificates) {
			EntityCacheUtil.removeResult(VehicleCertificateModelImpl.ENTITY_CACHE_ENABLED,
				VehicleCertificateImpl.class, vehicleCertificate.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vehicle certificate with the primary key. Does not add the vehicle certificate to the database.
	 *
	 * @param id the primary key for the new vehicle certificate
	 * @return the new vehicle certificate
	 */
	@Override
	public VehicleCertificate create(long id) {
		VehicleCertificate vehicleCertificate = new VehicleCertificateImpl();

		vehicleCertificate.setNew(true);
		vehicleCertificate.setPrimaryKey(id);

		return vehicleCertificate;
	}

	/**
	 * Removes the vehicle certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vehicle certificate
	 * @return the vehicle certificate that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleCertificateException if a vehicle certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleCertificate remove(long id)
		throws NoSuchVehicleCertificateException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vehicle certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vehicle certificate
	 * @return the vehicle certificate that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleCertificateException if a vehicle certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleCertificate remove(Serializable primaryKey)
		throws NoSuchVehicleCertificateException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VehicleCertificate vehicleCertificate = (VehicleCertificate)session.get(VehicleCertificateImpl.class,
					primaryKey);

			if (vehicleCertificate == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVehicleCertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vehicleCertificate);
		}
		catch (NoSuchVehicleCertificateException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected VehicleCertificate removeImpl(
		VehicleCertificate vehicleCertificate) throws SystemException {
		vehicleCertificate = toUnwrappedModel(vehicleCertificate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vehicleCertificate)) {
				vehicleCertificate = (VehicleCertificate)session.get(VehicleCertificateImpl.class,
						vehicleCertificate.getPrimaryKeyObj());
			}

			if (vehicleCertificate != null) {
				session.delete(vehicleCertificate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vehicleCertificate != null) {
			clearCache(vehicleCertificate);
		}

		return vehicleCertificate;
	}

	@Override
	public VehicleCertificate updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate vehicleCertificate)
		throws SystemException {
		vehicleCertificate = toUnwrappedModel(vehicleCertificate);

		boolean isNew = vehicleCertificate.isNew();

		Session session = null;

		try {
			session = openSession();

			if (vehicleCertificate.isNew()) {
				session.save(vehicleCertificate);

				vehicleCertificate.setNew(false);
			}
			else {
				session.merge(vehicleCertificate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(VehicleCertificateModelImpl.ENTITY_CACHE_ENABLED,
			VehicleCertificateImpl.class, vehicleCertificate.getPrimaryKey(),
			vehicleCertificate);

		return vehicleCertificate;
	}

	protected VehicleCertificate toUnwrappedModel(
		VehicleCertificate vehicleCertificate) {
		if (vehicleCertificate instanceof VehicleCertificateImpl) {
			return vehicleCertificate;
		}

		VehicleCertificateImpl vehicleCertificateImpl = new VehicleCertificateImpl();

		vehicleCertificateImpl.setNew(vehicleCertificate.isNew());
		vehicleCertificateImpl.setPrimaryKey(vehicleCertificate.getPrimaryKey());

		vehicleCertificateImpl.setId(vehicleCertificate.getId());
		vehicleCertificateImpl.setMtGateway(vehicleCertificate.getMtGateway());
		vehicleCertificateImpl.setHoSoThuTucId(vehicleCertificate.getHoSoThuTucId());
		vehicleCertificateImpl.setSequenceNo(vehicleCertificate.getSequenceNo());
		vehicleCertificateImpl.setVehicleRecordid(vehicleCertificate.getVehicleRecordid());
		vehicleCertificateImpl.setDraftCertificateid(vehicleCertificate.getDraftCertificateid());
		vehicleCertificateImpl.setCertificateRecordid(vehicleCertificate.getCertificateRecordid());
		vehicleCertificateImpl.setDebitNoteId(vehicleCertificate.getDebitNoteId());
		vehicleCertificateImpl.setVehicleGroupId(vehicleCertificate.getVehicleGroupId());
		vehicleCertificateImpl.setVehicleClass(vehicleCertificate.getVehicleClass());
		vehicleCertificateImpl.setTechnicalSpecCode(vehicleCertificate.getTechnicalSpecCode());
		vehicleCertificateImpl.setReferenceCertificateNo(vehicleCertificate.getReferenceCertificateNo());
		vehicleCertificateImpl.setSafetytestreportNo(vehicleCertificate.getSafetytestreportNo());
		vehicleCertificateImpl.setEmissiontestreportNo(vehicleCertificate.getEmissiontestreportNo());
		vehicleCertificateImpl.setCopreportNo(vehicleCertificate.getCopreportNo());
		vehicleCertificateImpl.setControlreportNo(vehicleCertificate.getControlreportNo());
		vehicleCertificateImpl.setVehicletypeDescription(vehicleCertificate.getVehicletypeDescription());
		vehicleCertificateImpl.setVehicleType(vehicleCertificate.getVehicleType());
		vehicleCertificateImpl.setEnginetypeDescription(vehicleCertificate.getEnginetypeDescription());
		vehicleCertificateImpl.setEngineType(vehicleCertificate.getEngineType());
		vehicleCertificateImpl.setMarkAsVehicle(vehicleCertificate.getMarkAsVehicle());
		vehicleCertificateImpl.setTrademarkDescription(vehicleCertificate.getTrademarkDescription());
		vehicleCertificateImpl.setTradeMark(vehicleCertificate.getTradeMark());
		vehicleCertificateImpl.setCommercialName(vehicleCertificate.getCommercialName());
		vehicleCertificateImpl.setModelCode(vehicleCertificate.getModelCode());
		vehicleCertificateImpl.setProductionPlant(vehicleCertificate.getProductionPlant());
		vehicleCertificateImpl.setAddressOfProductionPlant(vehicleCertificate.getAddressOfProductionPlant());
		vehicleCertificateImpl.setEmissionStandard(vehicleCertificate.getEmissionStandard());
		vehicleCertificateImpl.setCodeNumber(vehicleCertificate.getCodeNumber());
		vehicleCertificateImpl.setChassisNumber(vehicleCertificate.getChassisNumber());
		vehicleCertificateImpl.setEngineNumber(vehicleCertificate.getEngineNumber());
		vehicleCertificateImpl.setProductionYear(vehicleCertificate.getProductionYear());
		vehicleCertificateImpl.setCountryCode(vehicleCertificate.getCountryCode());
		vehicleCertificateImpl.setCountryName(vehicleCertificate.getCountryName());
		vehicleCertificateImpl.setCurrentStatus(vehicleCertificate.getCurrentStatus());
		vehicleCertificateImpl.setVehicleEngineUsage(vehicleCertificate.getVehicleEngineUsage());
		vehicleCertificateImpl.setVehicleColor(vehicleCertificate.getVehicleColor());
		vehicleCertificateImpl.setUnitPrice(vehicleCertificate.getUnitPrice());
		vehicleCertificateImpl.setCurrency(vehicleCertificate.getCurrency());
		vehicleCertificateImpl.setRemarks(vehicleCertificate.getRemarks());
		vehicleCertificateImpl.setMarkUpStatus(vehicleCertificate.getMarkUpStatus());
		vehicleCertificateImpl.setMarkAsSample(vehicleCertificate.getMarkAsSample());
		vehicleCertificateImpl.setVehicleengineStatus(vehicleCertificate.getVehicleengineStatus());
		vehicleCertificateImpl.setVehicleengineFolder(vehicleCertificate.getVehicleengineFolder());
		vehicleCertificateImpl.setVehicleGroupInitialId(vehicleCertificate.getVehicleGroupInitialId());
		vehicleCertificateImpl.setRegisteredInspectionId(vehicleCertificate.getRegisteredInspectionId());
		vehicleCertificateImpl.setRegisteredNumber(vehicleCertificate.getRegisteredNumber());
		vehicleCertificateImpl.setImporterCode(vehicleCertificate.getImporterCode());
		vehicleCertificateImpl.setImporterName(vehicleCertificate.getImporterName());
		vehicleCertificateImpl.setImporterAddress(vehicleCertificate.getImporterAddress());
		vehicleCertificateImpl.setRepresentative(vehicleCertificate.getRepresentative());
		vehicleCertificateImpl.setPhone(vehicleCertificate.getPhone());
		vehicleCertificateImpl.setFax(vehicleCertificate.getFax());
		vehicleCertificateImpl.setEmail(vehicleCertificate.getEmail());
		vehicleCertificateImpl.setInspectionDate(vehicleCertificate.getInspectionDate());
		vehicleCertificateImpl.setInspectionSite(vehicleCertificate.getInspectionSite());
		vehicleCertificateImpl.setInspectionDistrictCode(vehicleCertificate.getInspectionDistrictCode());
		vehicleCertificateImpl.setInspectionProvinceCode(vehicleCertificate.getInspectionProvinceCode());
		vehicleCertificateImpl.setInspectionDistrict(vehicleCertificate.getInspectionDistrict());
		vehicleCertificateImpl.setInspectionProvince(vehicleCertificate.getInspectionProvince());
		vehicleCertificateImpl.setConfirmedInspectionId(vehicleCertificate.getConfirmedInspectionId());
		vehicleCertificateImpl.setInspectionRecordId(vehicleCertificate.getInspectionRecordId());
		vehicleCertificateImpl.setInspectionRecordNo(vehicleCertificate.getInspectionRecordNo());
		vehicleCertificateImpl.setInspectionDateFrom(vehicleCertificate.getInspectionDateFrom());
		vehicleCertificateImpl.setInspectionDateTo(vehicleCertificate.getInspectionDateTo());
		vehicleCertificateImpl.setInspectionMode(vehicleCertificate.getInspectionMode());
		vehicleCertificateImpl.setInspectionModeDescription(vehicleCertificate.getInspectionModeDescription());
		vehicleCertificateImpl.setConfirmedResult(vehicleCertificate.getConfirmedResult());
		vehicleCertificateImpl.setConfirmedResultDescription(vehicleCertificate.getConfirmedResultDescription());
		vehicleCertificateImpl.setImportCustomDeclareDate(vehicleCertificate.getImportCustomDeclareDate());
		vehicleCertificateImpl.setImportCustomDeclareNo(vehicleCertificate.getImportCustomDeclareNo());
		vehicleCertificateImpl.setCorporationCode(vehicleCertificate.getCorporationCode());
		vehicleCertificateImpl.setCorporationName(vehicleCertificate.getCorporationName());
		vehicleCertificateImpl.setInspectorContactCode(vehicleCertificate.getInspectorContactCode());
		vehicleCertificateImpl.setInspectorName(vehicleCertificate.getInspectorName());
		vehicleCertificateImpl.setCertificateType(vehicleCertificate.getCertificateType());
		vehicleCertificateImpl.setCertificateNumber(vehicleCertificate.getCertificateNumber());
		vehicleCertificateImpl.setOldcertificateNumber(vehicleCertificate.getOldcertificateNumber());
		vehicleCertificateImpl.setSignDate(vehicleCertificate.getSignDate());
		vehicleCertificateImpl.setStampStatus(vehicleCertificate.getStampStatus());
		vehicleCertificateImpl.setCertificateStatus(vehicleCertificate.getCertificateStatus());
		vehicleCertificateImpl.setDigitalIssued(vehicleCertificate.getDigitalIssued());
		vehicleCertificateImpl.setMarkupSafeTest(vehicleCertificate.getMarkupSafeTest());
		vehicleCertificateImpl.setMarkupEmissionTest(vehicleCertificate.getMarkupEmissionTest());
		vehicleCertificateImpl.setMarkupControl(vehicleCertificate.getMarkupControl());
		vehicleCertificateImpl.setAttachedFile(vehicleCertificate.getAttachedFile());
		vehicleCertificateImpl.setInspectorOrganization(vehicleCertificate.getInspectorOrganization());
		vehicleCertificateImpl.setInspectorDivision(vehicleCertificate.getInspectorDivision());
		vehicleCertificateImpl.setInspectorSignName(vehicleCertificate.getInspectorSignName());
		vehicleCertificateImpl.setInspectorSignTitle(vehicleCertificate.getInspectorSignTitle());
		vehicleCertificateImpl.setInspectorSignPlace(vehicleCertificate.getInspectorSignPlace());
		vehicleCertificateImpl.setInspectorSignDate(vehicleCertificate.getInspectorSignDate());
		vehicleCertificateImpl.setDossierDate(vehicleCertificate.getDossierDate());
		vehicleCertificateImpl.setFiledangkykiemtraId(vehicleCertificate.getFiledangkykiemtraId());
		vehicleCertificateImpl.setFilebienbankiemtraId(vehicleCertificate.getFilebienbankiemtraId());
		vehicleCertificateImpl.setFilechungchiId(vehicleCertificate.getFilechungchiId());
		vehicleCertificateImpl.setFilebaocaotnantoanId(vehicleCertificate.getFilebaocaotnantoanId());
		vehicleCertificateImpl.setFilebaocaotnkhithaiId(vehicleCertificate.getFilebaocaotnkhithaiId());
		vehicleCertificateImpl.setFileketluangiamdinhId(vehicleCertificate.getFileketluangiamdinhId());
		vehicleCertificateImpl.setSynchDate(vehicleCertificate.getSynchDate());

		return vehicleCertificateImpl;
	}

	/**
	 * Returns the vehicle certificate with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vehicle certificate
	 * @return the vehicle certificate
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleCertificateException if a vehicle certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleCertificate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVehicleCertificateException, SystemException {
		VehicleCertificate vehicleCertificate = fetchByPrimaryKey(primaryKey);

		if (vehicleCertificate == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVehicleCertificateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vehicleCertificate;
	}

	/**
	 * Returns the vehicle certificate with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleCertificateException} if it could not be found.
	 *
	 * @param id the primary key of the vehicle certificate
	 * @return the vehicle certificate
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleCertificateException if a vehicle certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleCertificate findByPrimaryKey(long id)
		throws NoSuchVehicleCertificateException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vehicle certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vehicle certificate
	 * @return the vehicle certificate, or <code>null</code> if a vehicle certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleCertificate fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		VehicleCertificate vehicleCertificate = (VehicleCertificate)EntityCacheUtil.getResult(VehicleCertificateModelImpl.ENTITY_CACHE_ENABLED,
				VehicleCertificateImpl.class, primaryKey);

		if (vehicleCertificate == _nullVehicleCertificate) {
			return null;
		}

		if (vehicleCertificate == null) {
			Session session = null;

			try {
				session = openSession();

				vehicleCertificate = (VehicleCertificate)session.get(VehicleCertificateImpl.class,
						primaryKey);

				if (vehicleCertificate != null) {
					cacheResult(vehicleCertificate);
				}
				else {
					EntityCacheUtil.putResult(VehicleCertificateModelImpl.ENTITY_CACHE_ENABLED,
						VehicleCertificateImpl.class, primaryKey,
						_nullVehicleCertificate);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(VehicleCertificateModelImpl.ENTITY_CACHE_ENABLED,
					VehicleCertificateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vehicleCertificate;
	}

	/**
	 * Returns the vehicle certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vehicle certificate
	 * @return the vehicle certificate, or <code>null</code> if a vehicle certificate with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VehicleCertificate fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the vehicle certificates.
	 *
	 * @return the vehicle certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleCertificate> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicle certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehicle certificates
	 * @param end the upper bound of the range of vehicle certificates (not inclusive)
	 * @return the range of vehicle certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleCertificate> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicle certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehicle certificates
	 * @param end the upper bound of the range of vehicle certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vehicle certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VehicleCertificate> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<VehicleCertificate> list = (List<VehicleCertificate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VEHICLECERTIFICATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VEHICLECERTIFICATE;

				if (pagination) {
					sql = sql.concat(VehicleCertificateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VehicleCertificate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VehicleCertificate>(list);
				}
				else {
					list = (List<VehicleCertificate>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the vehicle certificates from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (VehicleCertificate vehicleCertificate : findAll()) {
			remove(vehicleCertificate);
		}
	}

	/**
	 * Returns the number of vehicle certificates.
	 *
	 * @return the number of vehicle certificates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VEHICLECERTIFICATE);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the vehicle certificate persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VehicleCertificate>> listenersList = new ArrayList<ModelListener<VehicleCertificate>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VehicleCertificate>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(VehicleCertificateImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VEHICLECERTIFICATE = "SELECT vehicleCertificate FROM VehicleCertificate vehicleCertificate";
	private static final String _SQL_COUNT_VEHICLECERTIFICATE = "SELECT COUNT(vehicleCertificate) FROM VehicleCertificate vehicleCertificate";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vehicleCertificate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VehicleCertificate exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(VehicleCertificatePersistenceImpl.class);
	private static VehicleCertificate _nullVehicleCertificate = new VehicleCertificateImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<VehicleCertificate> toCacheModel() {
				return _nullVehicleCertificateCacheModel;
			}
		};

	private static CacheModel<VehicleCertificate> _nullVehicleCertificateCacheModel =
		new CacheModel<VehicleCertificate>() {
			@Override
			public VehicleCertificate toEntityModel() {
				return _nullVehicleCertificate;
			}
		};
}