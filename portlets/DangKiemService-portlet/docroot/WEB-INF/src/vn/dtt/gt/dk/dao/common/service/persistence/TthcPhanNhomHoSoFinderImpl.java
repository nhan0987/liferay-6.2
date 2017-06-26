package vn.dtt.gt.dk.dao.common.service.persistence;


import java.util.ArrayList;
import java.util.List;

import vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo;
import vn.dtt.gt.dk.dao.common.model.impl.TthcPhanNhomHoSoImpl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class TthcPhanNhomHoSoFinderImpl extends BasePersistenceImpl<TthcPhanNhomHoSo> implements TthcPhanNhomHoSoFinder {

	 Log _log = LogFactoryUtil.getLog(TthcPhanNhomHoSoFinderImpl.class);

    public List<TthcPhanNhomHoSo> findTthcPhanNhomHoSoByVaTroXuLy(String vaiTroXuLy) {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder();
				
				query.append("SELECT {tthc_phannhomhoso.*} FROM tthc_phannhomhoso where id in (SELECT phannhomhosoid FROM tthc_phannhomhoso_vaitro where vaitroxuly in (" + vaiTroXuLy + ") ) ORDER BY sothutu ASC ");
				
				SQLQuery q = session.createSQLQuery(query.toString());
				q.setCacheable(false);
				q.addEntity(TthcPhanNhomHoSoImpl.TABLE_NAME, TthcPhanNhomHoSoImpl.class);
				
				_log.debug("=========findTthcPhanNhomHoSoByVaTroXuLy===" + query.toString() );
				
				return (List<TthcPhanNhomHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				
			} catch (Exception e) {
				_log.error(e);
				_log.error(e);
			} finally {
				closeSession(session);
			}
			
			return new ArrayList<TthcPhanNhomHoSo>();
		}
    
    public List<TthcPhanNhomHoSo> findTinNhanh(String soThuTu) {
			Session session = null;
			try {
				session = openSession();
				StringBuilder query = new StringBuilder();
				
				query.append("SELECT {tthc_phannhomhoso.*} FROM tthc_phannhomhoso where sothutu in  (" + soThuTu + ") ORDER BY sothutu ASC ");
				
				SQLQuery q = session.createSQLQuery(query.toString());
				q.setCacheable(false);
				q.addEntity(TthcPhanNhomHoSoImpl.TABLE_NAME, TthcPhanNhomHoSoImpl.class);
				
				_log.debug("=========findTthcPhanNhomHoSoByVaTroXuLy===" + query.toString() );
				
				return (List<TthcPhanNhomHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				
			} catch (Exception e) {
				_log.error(e);
				_log.error(e);
			} finally {
				closeSession(session);
			}
			
			return new ArrayList<TthcPhanNhomHoSo>();
		}
}
