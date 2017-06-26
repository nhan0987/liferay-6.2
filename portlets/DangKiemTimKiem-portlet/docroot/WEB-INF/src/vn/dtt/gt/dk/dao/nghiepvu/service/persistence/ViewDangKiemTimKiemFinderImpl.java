package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.Iterator;
import java.util.List;

import vn.dtt.gt.dk.dao.common.model.TimKiemHoSo;
import vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewDangKiemTimKiemImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class ViewDangKiemTimKiemFinderImpl extends BasePersistenceImpl<TimKiemHoSo> implements ViewDangKiemTimKiemFinder {
	private Log log = LogFactoryUtil.getLog(ViewDangKiemTimKiemFinderImpl.class);

	public List<ViewDangKiemTimKiem> searchDangKiemTimKiem(String soChungChi, String soKhung, String soDongCo, long guestId, int start, int end)
		throws SystemException {
		
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT Distinct {view_dangkiemtimkiem.*} FROM view_dangkiemtimkiem WHERE 1=1 ");
			
			if (Validator.isNotNull(soChungChi)) {
				log.info("===soChungChi===" + soChungChi);
				query.append(" AND certificatenumber = ?");
			}
			
				
			if ((Validator.isNotNull(soKhung)) && (guestId==0)) {
				log.info("===soKhung===" + soKhung);
				query.append(" AND chassisnumber = ?");
			} else if ((Validator.isNotNull(soKhung)) && (guestId >0)) {
				log.info("===soKhung===" + soKhung);
				query.append(" AND chassisnumber LIKE ?");
			}	
			
			
			if ((Validator.isNotNull(soDongCo)) && (guestId==0)) {
				log.info("===soDongCo===" + soDongCo);
				query.append(" AND enginenumber = ?");
			} else if ((Validator.isNotNull(soDongCo)) && (guestId >0))  {
				log.info("===soDongCo===" + soDongCo);
				query.append(" AND enginenumber LIKE ?");
			}	
			
			if ((Validator.isNull(soChungChi) || soChungChi.trim().length() == 0 )
				    && (Validator.isNull(soKhung) || soKhung.trim().length() == 0 )
				    && (Validator.isNull(soDongCo) || soDongCo.trim().length() == 0 )){
					log.info("===khong cho tim kiem===" + soDongCo);					
					query.append(" AND 0>1 ");
				}
			
			query.append(" ORDER BY signdate DESC");
			
			
			
			/*int count = end - start;
			if (start >= 0) {
				query.append(" LIMIT " + start + ", " + count);
			}*/
			
			log.info("=========searchDangKiemTimKiem===" + query.toString() );
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("view_dangkiemtimkiem", ViewDangKiemTimKiemImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			
			if (Validator.isNotNull(soChungChi)) {
				qPos.add(soChungChi);
			}
			
			if ((Validator.isNotNull(soDongCo)) && (guestId==0)) {
				qPos.add(soKhung);
			} else if ((Validator.isNotNull(soKhung))  && (guestId >0)) {
				qPos.add("%" + soKhung + "%");
			}	
			
			if ((Validator.isNotNull(soDongCo)) && (guestId==0)) {
				qPos.add(soDongCo);
			} else if ((Validator.isNotNull(soDongCo))  && (guestId >0)) {
				qPos.add("%" + soDongCo + "%");
			}
			
			return (List<ViewDangKiemTimKiem>) QueryUtil.list(q, getDialect(), start, end);
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public long countDangKiemTimKiem(String soChungChi, String soKhung, String soDongCo, long guestId)
			throws SystemException {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder();
				
				query.append("SELECT count(Distinct view_dangkiemtimkiem.id) as total FROM view_dangkiemtimkiem WHERE 1=1 ");
				
				if (Validator.isNotNull(soChungChi)) {
					log.info("===soChungChi===" + soChungChi);
					query.append(" AND certificatenumber = ?");
				}
				
				
				if ((Validator.isNotNull(soKhung)) && (guestId==0)) {
					log.info("===soKhung===" + soKhung);
					query.append(" AND chassisnumber = ?");
				} else if ((Validator.isNotNull(soKhung)) && (guestId >0)) {
					log.info("===soKhung===" + soKhung);
					query.append(" AND chassisnumber LIKE ?");
				}	
				
				
				if ((Validator.isNotNull(soDongCo)) && (guestId==0)) {
					log.info("===soDongCo===" + soDongCo);
					query.append(" AND enginenumber = ?");
				} else if ((Validator.isNotNull(soDongCo)) && (guestId >0))  {
					log.info("===soDongCo===" + soDongCo);
					query.append(" AND enginenumber LIKE ?");
				}	
				
				
				if ((Validator.isNull(soChungChi) || soChungChi.trim().length() == 0 )
				    && (Validator.isNull(soKhung) || soKhung.trim().length() == 0 )
				    && (Validator.isNull(soDongCo) || soDongCo.trim().length() == 0 )){
					log.info("===khong cho tim kiem===" + soDongCo);
					query.append(" AND 0>1 ");
				}
				SQLQuery q = session.createSQLQuery(query.toString());
				q.addScalar("total", Type.LONG);
				q.setCacheable(false);
				
				QueryPos qPos = QueryPos.getInstance(q);
				
				if (Validator.isNotNull(soChungChi)) {
					qPos.add(soChungChi);
				}
				
				if ((Validator.isNotNull(soDongCo)) && (guestId==0)) {
					qPos.add(soKhung);
				} else if ((Validator.isNotNull(soKhung))  && (guestId >0)) {
					qPos.add("%" + soKhung + "%");
				}	
				
				if ((Validator.isNotNull(soDongCo)) && (guestId==0)) {
					qPos.add(soDongCo);
				} else if ((Validator.isNotNull(soDongCo))  && (guestId >0)) {
					qPos.add("%" + soDongCo + "%");
				}
				
				Iterator<Long> itr = q.list().iterator();
				
				if (itr.hasNext()) {
					Long count1 = itr.next();
					if (count1 != null) {
						return count1.intValue();
					}
				}
				return 0;
				
			} catch (Exception e) {
				throw new SystemException(e);
			} finally {
				closeSession(session);
			}
		}

}
