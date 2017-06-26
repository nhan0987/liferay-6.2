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

package vn.dtt.gt.dk.dao.common.service.persistence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoImpl;
import vn.dtt.gt.dk.utils.format.Constants;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

/**
 * The persistence interface for the tthc noidung ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcNoidungHoSoPersistenceImpl
 * @see TthcNoidungHoSoUtil
 * @generated
 */
public class TthcNoidungHoSoFinderImpl extends BasePersistenceImpl<TthcNoidungHoSo> implements TthcNoidungHoSoFinder {

	private static Log _log = LogFactoryUtil.getLog(TthcNoidungHoSoFinderImpl.class);

	public TthcNoidungHoSo findLastByHoSoThuTucIdAndMaBieuMau(long hoSoThuTucId, String maBieuMau) {
		Session session = null;
		
		List<TthcNoidungHoSo> allTThNoidungHoSo = null;
		
		TthcNoidungHoSo result = null;
		
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {tthc_noidunghoso.*} FROM tthc_noidunghoso ");
			query.append(" where 1=1 ");
			if (hoSoThuTucId > 0) {
				query.append(" and hosothutucid = " + hoSoThuTucId );
			}
			if (maBieuMau != null && maBieuMau.trim().length() > 0) {
				query.append(" and bieumauhosoid in (SELECT id FROM tthc_bieumauhoso where mabieumau = '" + maBieuMau + "') order by ngaytao desc");
			}
			
			SQLQuery q = session.createSQLQuery(query.toString());
			_log.debug("=======findLastByHoSoThuTucIdAndMaBieuMau==========" + query.toString());
			q.setCacheable(false);
			q.addEntity(TthcNoidungHoSoImpl.TABLE_NAME, TthcNoidungHoSoImpl.class);
			
			allTThNoidungHoSo =  (List<TthcNoidungHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
			if(allTThNoidungHoSo != null && allTThNoidungHoSo.size() > 0){
				result = allTThNoidungHoSo.get(0);
			}
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return result;
	}

	public TthcNoidungHoSo findBDKByHoSoThuTucIdAndTthcId(String hoSoThuTucId, String tthcId) {
		Session session = null;
		List<TthcNoidungHoSo> allTThNoidungHoSo = null;
		TthcNoidungHoSo result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {tthc_noidunghoso.*} FROM tthc_noidunghoso ");
			query.append(" where 1=1 ");
			if (hoSoThuTucId != null && hoSoThuTucId.trim().length() > 0) {
				query.append(" and hosothutucid = " + hoSoThuTucId );
			}
			if (tthcId != null && tthcId.trim().length() > 0) {
				query.append(" and bieumauhosoid in (SELECT bieumauhosoid FROM tthc_thanhphanhoso ts ");
				query.append(" where 1=1 ");
				query.append(" and ts.thutuchanhchinhid = " + tthcId );
				query.append(" and ts.mautructuyen ='" + Constants.MAU_TRUC_TUYEN_BAN_DANG_KY + "')" );
			}
			query.append(" order by ngaytao desc" );
			SQLQuery q = session.createSQLQuery(query.toString());
			_log.debug("=======findBDKByHoSoThuTucIdAndTthcId==========" + query.toString());
			q.setCacheable(false);
			q.addEntity(TthcNoidungHoSoImpl.TABLE_NAME, TthcNoidungHoSoImpl.class);
			
			allTThNoidungHoSo =  (List<TthcNoidungHoSo>) QueryUtil.list(q, getDialect(), 0, 1);
			
			if(allTThNoidungHoSo != null && allTThNoidungHoSo.size() > 0){
				result = allTThNoidungHoSo.get(0);
			}
			
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return result;
	}
    
    public List<TthcNoidungHoSo> findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucId(long hoSoThuTucId, long bieuMauHoSoId) {
    	Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT {tthc_noidunghoso.*} FROM tthc_noidunghoso where hosothutucid = ? and bieumauhosoid= ? group by matusinh ORDER BY ngaytao ASC");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(TthcNoidungHoSoImpl.TABLE_NAME, TthcNoidungHoSoImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(hoSoThuTucId);
			qPos.add(bieuMauHoSoId);
			_log.debug("=========findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucId===" + query.toString() );
			
			return (List<TthcNoidungHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return new ArrayList<TthcNoidungHoSo>();
	}
    
    public List<TthcNoidungHoSo> findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucIdLanCuoi(long hoSoThuTucId, long bieuMauHoSoId) {
    	Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT {tthc_noidunghoso.*} FROM tthc_noidunghoso where hosothutucid = ? and bieumauhosoid= ? group by matusinh ORDER BY ngaytao DESC");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(TthcNoidungHoSoImpl.TABLE_NAME, TthcNoidungHoSoImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(hoSoThuTucId);
			qPos.add(bieuMauHoSoId);
			_log.debug("=========findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucId===" + query.toString() );
			
			return (List<TthcNoidungHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return new ArrayList<TthcNoidungHoSo>();
	}

    public List<TthcNoidungHoSo> findTthcBieuMauHoSoByThuTucHanhChinhIdFinder(long hoSoThuTucId, long bieuMauHoSoId) {
    	Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT {tthc_noidunghoso.*} FROM tthc_noidunghoso where hosothutucid = ? and bieumauhosoid= ? ORDER BY ngaytao ASC");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(TthcNoidungHoSoImpl.TABLE_NAME, TthcNoidungHoSoImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(hoSoThuTucId);
			qPos.add(bieuMauHoSoId);
			_log.debug("=========findTthcBieuMauHoSoByThuTucHanhChinhIdFinder===" + query.toString() );
			
			return (List<TthcNoidungHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return new ArrayList<TthcNoidungHoSo>();
	}
    
    public List<TthcNoidungHoSo> findTthcBieuMauHoSoByThuTucHanhChinhIdFinderEnd(long hoSoThuTucId, long bieuMauHoSoId) {
    	Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT {tthc_noidunghoso.*} FROM tthc_noidunghoso where hosothutucid = ? and bieumauhosoid= ? ORDER BY ngaytao DESC");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(TthcNoidungHoSoImpl.TABLE_NAME, TthcNoidungHoSoImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(hoSoThuTucId);
			qPos.add(bieuMauHoSoId);
			_log.debug("=========findTthcBieuMauHoSoByThuTucHanhChinhIdFinder===" + query.toString() );
			
			return (List<TthcNoidungHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return new ArrayList<TthcNoidungHoSo>();
	}
    public List<TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinder(long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh) {
    	Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT {tthc_noidunghoso.*} FROM tthc_noidunghoso where  hosothutucid = ? and bieumauhosoid= ? and matusinh = ? ORDER BY ngaytao ASC");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(TthcNoidungHoSoImpl.TABLE_NAME, TthcNoidungHoSoImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(hoSoThuTucId);
			qPos.add(bieuMauHoSoId);
			qPos.add(maTuSinh);
			_log.debug("=========findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinder===" + query.toString() );
			
			return (List<TthcNoidungHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return new ArrayList<TthcNoidungHoSo>();
	}

	public List<TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinderEnd(long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT {tthc_noidunghoso.*} FROM tthc_noidunghoso where hosothutucid = ? and bieumauhosoid= ? and matusinh = ? ORDER BY ngaytao DESC");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(TthcNoidungHoSoImpl.TABLE_NAME, TthcNoidungHoSoImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(hoSoThuTucId);
			qPos.add(bieuMauHoSoId);
			qPos.add(maTuSinh);
			_log.debug("=========findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinder===" + query.toString() );
			
			return (List<TthcNoidungHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return new ArrayList<TthcNoidungHoSo>();
	}
    public List<TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucId(long hoSoThuTucId, String mauTrucTuyen) {
    	Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT {tthc_noidunghoso.*} FROM tthc_noidunghoso where dacapnhat < 1 and hosothutucid = ? ");
			query.append(" and bieumauhosoid in (SELECT bieumauhosoid FROM tthc_thanhphanhoso where   mautructuyen = ?) order by id desc");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(TthcNoidungHoSoImpl.TABLE_NAME, TthcNoidungHoSoImpl.class);
			
			_log.debug("=========findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucId===" + query.toString() );
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(hoSoThuTucId);
			qPos.add(mauTrucTuyen);
			
			return (List<TthcNoidungHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return new ArrayList<TthcNoidungHoSo>();
	}
    
    public List<TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucId(long hoSoThuTucId, String mauTrucTuyen1, String mauTrucTuyen2) {
    	Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT {tthc_noidunghoso.*} FROM tthc_noidunghoso where  dacapnhat < 1 and hosothutucid = ? ");
			query.append(" and bieumauhosoid in (SELECT bieumauhosoid FROM tthc_thanhphanhoso where mautructuyen = ? or mautructuyen = ? ) order by id asc");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(TthcNoidungHoSoImpl.TABLE_NAME, TthcNoidungHoSoImpl.class);
			
			_log.debug("=========findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucId===" + query.toString() );
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(hoSoThuTucId);
			qPos.add(mauTrucTuyen1);
			qPos.add(mauTrucTuyen2);
			
			return (List<TthcNoidungHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return new ArrayList<TthcNoidungHoSo>();
	}

	public int countSoLuongKySo(long phieuXuLyPhuId) {
		Session session = null;
		
		try {
			session = openSession();
			StringBuilder query = new StringBuilder("SELECT count(*) as total from dkvn_thutuchanhchinh.tthc_noidunghoso ");
			query.append(" where tailieudinhkem = 0 and ");
			query.append("  id in ( Select attachedfile from dkvn_nghiepvu.vr_certificaterecord where id  ");
			query.append("  in ( Select certificaterecordid from dkvn_nghiepvu.vr_vehiclerecord where inspectionrecordid in ");
			query.append("   ( Select id from dkvn_nghiepvu.vr_inspectionrecord where phieuxulyphuid = ").append(phieuXuLyPhuId).append(")))");
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addScalar("total", Type.LONG);
			
			Iterator<Long> itr = q.list().iterator();
			
			if (itr.hasNext()) {
				Long count = itr.next();

				if (count != null) { return count.intValue(); }
			}
		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}
		
		return 0;
	}
    
    public int countSoLuongDaDongDau(long phieuXuLyPhuId) {
  		Session session = null;
  		try {
  			session = openSession();
  			StringBuilder query = new StringBuilder("SELECT count(*) as total from dkvn_thutuchanhchinh.tthc_noidunghoso ");
  			query.append(" where dacapnhat = 0 and ");
  			query.append("  id in ( Select attachedfile from dkvn_nghiepvu.vr_certificaterecord where id  ");
  			query.append("  in ( Select certificaterecordid from dkvn_nghiepvu.vr_vehiclerecord where inspectionrecordid in ");
  			query.append("   ( Select id from dkvn_nghiepvu.vr_inspectionrecord where phieuxulyphuid = ").append(phieuXuLyPhuId).append(")))");
  			
  			SQLQuery q = session.createSQLQuery(query.toString());
  			q.setCacheable(false);
  			q.addScalar("total", Type.LONG);
  			
  			Iterator<Long> itr = q.list().iterator();
  			
  			if (itr.hasNext()) {
  				Long count = itr.next();

  				if (count != null) { return count.intValue(); }
  			}
  		} catch (Exception e) {
  			_log.error(e);
  		} finally {
  			closeSession(session);
  		}
  		
  		return 0;
  	}
}