package vn.dtt.gt.dk.dynamicquery;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyChinhLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;

public class DynamicQueryUtil {
	// for mot cua phiau xu ly phu
	// for mot cua phiau xu ly chinh
	public static Hashtable<Long, TthcHoSoThuTuc> getTT_MotCuaPhieuXuLyPhu(
			List<MotCuaPhieuXuLyPhu> mList) {
		if (mList == null || mList.size() <= 5) {
			return null;
		}
		try {
			List<Long> idsPhieuXuLyChinhs = getIdsPhieuXulyChinh_By_PhieuXulyPhu(mList);
			List<MotCuaPhieuXuLyChinh> xuLyChinhList = getMotCuaPhieuXuLyChinh_By_Ids(idsPhieuXuLyChinhs);
			return getTT_MotCuaPhieuXuLyChinh(xuLyChinhList);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;

	}

	private static List<Long> getIdsPhieuXulyChinh_By_PhieuXulyPhu(
			List<MotCuaPhieuXuLyPhu> mList) {
		List<Long> result = new ArrayList<Long>();
		for (MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu : mList) {
			result.add(motCuaPhieuXuLyPhu.getPhieuXuLyChinhId());
		}
		return result;
	}

	private static List<MotCuaPhieuXuLyChinh> getMotCuaPhieuXuLyChinh_By_Ids(
			List<Long> idList) {

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
				MotCuaPhieuXuLyChinh.class,
				PortletClassLoaderUtil.getClassLoader());

		Criterion criterion = RestrictionsFactoryUtil.in("id", idList);
		dynamicQuery.add(criterion);
		try {
			List<MotCuaPhieuXuLyChinh> list = MotCuaPhieuXuLyChinhLocalServiceUtil
					.dynamicQuery(dynamicQuery);
			return list;
		} catch (SystemException e) {
			_log.error(e);
		}
		return null;

	}

	// for mot cua phiau xu ly chinh
	public static Hashtable<Long, TthcHoSoThuTuc> getTT_MotCuaPhieuXuLyChinh(
			List<MotCuaPhieuXuLyChinh> mList) {
		try {

			DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
					TthcHoSoThuTuc.class,
					PortletClassLoaderUtil.getClassLoader());

			Criterion criterion = null;
			criterion = RestrictionsFactoryUtil.eq("Id", mList.get(0)
					.getHoSoThuTucId());

			dynamicQuery.add(criterion);

			List<TthcHoSoThuTuc> list = TthcHoSoThuTucLocalServiceUtil
					.dynamicQuery(dynamicQuery);

			if (list != null && list.size() > 0) {
				_log.info("list:" + list.size());
				Hashtable<Long, TthcHoSoThuTuc> result = new Hashtable<Long, TthcHoSoThuTuc>();

				for (MotCuaPhieuXuLyChinh motcua : mList) {
					TthcHoSoThuTuc tt = getTthcHoSoThuTuc(motcua, list);
					if (tt != null) {
						result.put(motcua.getId(), tt);
					}
				}
				return result;
			} else {
				_log.info("null");
			}

		} catch (SystemException e) {
			_log.error(e);
		}

		return null;

	}

	private static TthcHoSoThuTuc getTthcHoSoThuTuc(
			MotCuaPhieuXuLyChinh motcua, List<TthcHoSoThuTuc> list) {

		return null;
	}

	private static Log _log = LogFactoryUtil.getLog(DynamicQueryUtil.class);
}
