package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import java.util.Date;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.ExchangeRate;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ExchangeRateImpl;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class ExchangeRateFinderImpl extends BasePersistenceImpl<ExchangeRate> implements ExchangeRateFinder {
	Log _log = LogFactoryUtil.getLog(ExchangeRateFinderImpl.class);

	public List<ExchangeRate> findLastByOriginalCurrencyAndBasicCurrency(String originalCurrency, String basicCurrency,
			Date currentDate) {
		Session session = null;
		List<ExchangeRate> exchangeRates = null;
		List<ExchangeRate> result = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			query.append("SELECT {vr_exchangerate.*} FROM vr_exchangerate ");
			query.append(" where 1=1 ");
			if (originalCurrency != null && originalCurrency.length() > 0) {
				query.append(" and originalcurrency = '" + originalCurrency);
			}
			if (originalCurrency != null && originalCurrency.length() > 0) {
				query.append("' and basiccurrency = '" + basicCurrency);
			}
			

			query.append("' and validfrom <= '" + FormatData.parseDateToStringType6( currentDate));
			query.append("' and validuntil >= '" +FormatData.parseDateToStringType6( currentDate)+"'");
			query.append(" order by id desc ");

			SQLQuery q = session.createSQLQuery(query.toString());
			_log.debug("=======findLastByHoSoThuTucIdAndMaBieuMau==========" + query.toString());
			_log.info("----------------------findLastByOriginalCurrencyAndBasicCurrency-----------------:"
					+ query.toString());
			q.setCacheable(false);
			q.addEntity(ExchangeRateImpl.TABLE_NAME, ExchangeRateImpl.class);

			exchangeRates = (List<ExchangeRate>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			if (exchangeRates != null && exchangeRates.size() > 0) {
				result = exchangeRates;
			}

		} catch (Exception e) {
			_log.error(e);
		} finally {
			closeSession(session);
		}

		return result;
	}

}

