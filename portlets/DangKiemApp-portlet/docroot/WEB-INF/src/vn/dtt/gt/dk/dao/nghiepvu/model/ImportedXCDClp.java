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

package vn.dtt.gt.dk.dao.nghiepvu.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;
import vn.dtt.gt.dk.dao.nghiepvu.service.ImportedXCDLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class ImportedXCDClp extends BaseModelImpl<ImportedXCD>
	implements ImportedXCD {
	public ImportedXCDClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ImportedXCD.class;
	}

	@Override
	public String getModelClassName() {
		return ImportedXCD.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("trangthai", getTrangthai());
		attributes.put("IDGCN", getIDGCN());
		attributes.put("SoToKhai", getSoToKhai());
		attributes.put("SoDangKy", getSoDangKy());
		attributes.put("SoBienBan", getSoBienBan());
		attributes.put("NguoiKT", getNguoiKT());
		attributes.put("NgayKiemTra", getNgayKiemTra());
		attributes.put("NoiKiemTra", getNoiKiemTra());
		attributes.put("MaChu", getMaChu());
		attributes.put("TenChu", getTenChu());
		attributes.put("DiaChi", getDiaChi());
		attributes.put("DienThoai", getDienThoai());
		attributes.put("SoFAX", getSoFAX());
		attributes.put("MaChungLoai", getMaChungLoai());
		attributes.put("MaTenXe", getMaTenXe());
		attributes.put("NhanHieu", getNhanHieu());
		attributes.put("SoLoai", getSoLoai());
		attributes.put("TenThuongMai", getTenThuongMai());
		attributes.put("SoDongCo", getSoDongCo());
		attributes.put("SoKhung", getSoKhung());
		attributes.put("NamSx", getNamSx());
		attributes.put("NoiSx", getNoiSx());
		attributes.put("NgayDenHan", getNgayDenHan());
		attributes.put("NgayCapGCN", getNgayCapGCN());
		attributes.put("NgayNhap", getNgayNhap());
		attributes.put("Note", getNote());
		attributes.put("LoginName", getLoginName());
		attributes.put("MADV", getMADV());
		attributes.put("TinhTrang", getTinhTrang());
		attributes.put("GhiChu", getGhiChu());
		attributes.put("NguoiSoat", getNguoiSoat());
		attributes.put("NgaySoat", getNgaySoat());
		attributes.put("KetQua", getKetQua());
		attributes.put("STT", getSTT());
		attributes.put("TenXe", getTenXe());
		attributes.put("TenChungLoai", getTenChungLoai());
		attributes.put("MaTSKT", getMaTSKT());
		attributes.put("TenDacTinhV", getTenDacTinhV());
		attributes.put("TenDacTinhA", getTenDacTinhA());
		attributes.put("MaNhomDacTinh", getMaNhomDacTinh());
		attributes.put("ThuNguyen", getThuNguyen());
		attributes.put("GiaTri", getGiaTri());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long trangthai = (Long)attributes.get("trangthai");

		if (trangthai != null) {
			setTrangthai(trangthai);
		}

		String IDGCN = (String)attributes.get("IDGCN");

		if (IDGCN != null) {
			setIDGCN(IDGCN);
		}

		String SoToKhai = (String)attributes.get("SoToKhai");

		if (SoToKhai != null) {
			setSoToKhai(SoToKhai);
		}

		String SoDangKy = (String)attributes.get("SoDangKy");

		if (SoDangKy != null) {
			setSoDangKy(SoDangKy);
		}

		String SoBienBan = (String)attributes.get("SoBienBan");

		if (SoBienBan != null) {
			setSoBienBan(SoBienBan);
		}

		String NguoiKT = (String)attributes.get("NguoiKT");

		if (NguoiKT != null) {
			setNguoiKT(NguoiKT);
		}

		String NgayKiemTra = (String)attributes.get("NgayKiemTra");

		if (NgayKiemTra != null) {
			setNgayKiemTra(NgayKiemTra);
		}

		String NoiKiemTra = (String)attributes.get("NoiKiemTra");

		if (NoiKiemTra != null) {
			setNoiKiemTra(NoiKiemTra);
		}

		String MaChu = (String)attributes.get("MaChu");

		if (MaChu != null) {
			setMaChu(MaChu);
		}

		String TenChu = (String)attributes.get("TenChu");

		if (TenChu != null) {
			setTenChu(TenChu);
		}

		String DiaChi = (String)attributes.get("DiaChi");

		if (DiaChi != null) {
			setDiaChi(DiaChi);
		}

		String DienThoai = (String)attributes.get("DienThoai");

		if (DienThoai != null) {
			setDienThoai(DienThoai);
		}

		String SoFAX = (String)attributes.get("SoFAX");

		if (SoFAX != null) {
			setSoFAX(SoFAX);
		}

		String MaChungLoai = (String)attributes.get("MaChungLoai");

		if (MaChungLoai != null) {
			setMaChungLoai(MaChungLoai);
		}

		String MaTenXe = (String)attributes.get("MaTenXe");

		if (MaTenXe != null) {
			setMaTenXe(MaTenXe);
		}

		String NhanHieu = (String)attributes.get("NhanHieu");

		if (NhanHieu != null) {
			setNhanHieu(NhanHieu);
		}

		String SoLoai = (String)attributes.get("SoLoai");

		if (SoLoai != null) {
			setSoLoai(SoLoai);
		}

		String TenThuongMai = (String)attributes.get("TenThuongMai");

		if (TenThuongMai != null) {
			setTenThuongMai(TenThuongMai);
		}

		String SoDongCo = (String)attributes.get("SoDongCo");

		if (SoDongCo != null) {
			setSoDongCo(SoDongCo);
		}

		String SoKhung = (String)attributes.get("SoKhung");

		if (SoKhung != null) {
			setSoKhung(SoKhung);
		}

		String NamSx = (String)attributes.get("NamSx");

		if (NamSx != null) {
			setNamSx(NamSx);
		}

		String NoiSx = (String)attributes.get("NoiSx");

		if (NoiSx != null) {
			setNoiSx(NoiSx);
		}

		String NgayDenHan = (String)attributes.get("NgayDenHan");

		if (NgayDenHan != null) {
			setNgayDenHan(NgayDenHan);
		}

		String NgayCapGCN = (String)attributes.get("NgayCapGCN");

		if (NgayCapGCN != null) {
			setNgayCapGCN(NgayCapGCN);
		}

		String NgayNhap = (String)attributes.get("NgayNhap");

		if (NgayNhap != null) {
			setNgayNhap(NgayNhap);
		}

		String Note = (String)attributes.get("Note");

		if (Note != null) {
			setNote(Note);
		}

		String LoginName = (String)attributes.get("LoginName");

		if (LoginName != null) {
			setLoginName(LoginName);
		}

		String MADV = (String)attributes.get("MADV");

		if (MADV != null) {
			setMADV(MADV);
		}

		String TinhTrang = (String)attributes.get("TinhTrang");

		if (TinhTrang != null) {
			setTinhTrang(TinhTrang);
		}

		String GhiChu = (String)attributes.get("GhiChu");

		if (GhiChu != null) {
			setGhiChu(GhiChu);
		}

		String NguoiSoat = (String)attributes.get("NguoiSoat");

		if (NguoiSoat != null) {
			setNguoiSoat(NguoiSoat);
		}

		String NgaySoat = (String)attributes.get("NgaySoat");

		if (NgaySoat != null) {
			setNgaySoat(NgaySoat);
		}

		String KetQua = (String)attributes.get("KetQua");

		if (KetQua != null) {
			setKetQua(KetQua);
		}

		Long STT = (Long)attributes.get("STT");

		if (STT != null) {
			setSTT(STT);
		}

		String TenXe = (String)attributes.get("TenXe");

		if (TenXe != null) {
			setTenXe(TenXe);
		}

		String TenChungLoai = (String)attributes.get("TenChungLoai");

		if (TenChungLoai != null) {
			setTenChungLoai(TenChungLoai);
		}

		String MaTSKT = (String)attributes.get("MaTSKT");

		if (MaTSKT != null) {
			setMaTSKT(MaTSKT);
		}

		String TenDacTinhV = (String)attributes.get("TenDacTinhV");

		if (TenDacTinhV != null) {
			setTenDacTinhV(TenDacTinhV);
		}

		String TenDacTinhA = (String)attributes.get("TenDacTinhA");

		if (TenDacTinhA != null) {
			setTenDacTinhA(TenDacTinhA);
		}

		String MaNhomDacTinh = (String)attributes.get("MaNhomDacTinh");

		if (MaNhomDacTinh != null) {
			setMaNhomDacTinh(MaNhomDacTinh);
		}

		String ThuNguyen = (String)attributes.get("ThuNguyen");

		if (ThuNguyen != null) {
			setThuNguyen(ThuNguyen);
		}

		String GiaTri = (String)attributes.get("GiaTri");

		if (GiaTri != null) {
			setGiaTri(GiaTri);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_importedXCDRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTrangthai() {
		return _trangthai;
	}

	@Override
	public void setTrangthai(long trangthai) {
		_trangthai = trangthai;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangthai", long.class);

				method.invoke(_importedXCDRemoteModel, trangthai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIDGCN() {
		return _IDGCN;
	}

	@Override
	public void setIDGCN(String IDGCN) {
		_IDGCN = IDGCN;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setIDGCN", String.class);

				method.invoke(_importedXCDRemoteModel, IDGCN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoToKhai() {
		return _SoToKhai;
	}

	@Override
	public void setSoToKhai(String SoToKhai) {
		_SoToKhai = SoToKhai;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setSoToKhai", String.class);

				method.invoke(_importedXCDRemoteModel, SoToKhai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoDangKy() {
		return _SoDangKy;
	}

	@Override
	public void setSoDangKy(String SoDangKy) {
		_SoDangKy = SoDangKy;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setSoDangKy", String.class);

				method.invoke(_importedXCDRemoteModel, SoDangKy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoBienBan() {
		return _SoBienBan;
	}

	@Override
	public void setSoBienBan(String SoBienBan) {
		_SoBienBan = SoBienBan;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setSoBienBan", String.class);

				method.invoke(_importedXCDRemoteModel, SoBienBan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNguoiKT() {
		return _NguoiKT;
	}

	@Override
	public void setNguoiKT(String NguoiKT) {
		_NguoiKT = NguoiKT;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiKT", String.class);

				method.invoke(_importedXCDRemoteModel, NguoiKT);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNgayKiemTra() {
		return _NgayKiemTra;
	}

	@Override
	public void setNgayKiemTra(String NgayKiemTra) {
		_NgayKiemTra = NgayKiemTra;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayKiemTra", String.class);

				method.invoke(_importedXCDRemoteModel, NgayKiemTra);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoiKiemTra() {
		return _NoiKiemTra;
	}

	@Override
	public void setNoiKiemTra(String NoiKiemTra) {
		_NoiKiemTra = NoiKiemTra;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiKiemTra", String.class);

				method.invoke(_importedXCDRemoteModel, NoiKiemTra);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaChu() {
		return _MaChu;
	}

	@Override
	public void setMaChu(String MaChu) {
		_MaChu = MaChu;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setMaChu", String.class);

				method.invoke(_importedXCDRemoteModel, MaChu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenChu() {
		return _TenChu;
	}

	@Override
	public void setTenChu(String TenChu) {
		_TenChu = TenChu;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setTenChu", String.class);

				method.invoke(_importedXCDRemoteModel, TenChu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaChi() {
		return _DiaChi;
	}

	@Override
	public void setDiaChi(String DiaChi) {
		_DiaChi = DiaChi;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChi", String.class);

				method.invoke(_importedXCDRemoteModel, DiaChi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDienThoai() {
		return _DienThoai;
	}

	@Override
	public void setDienThoai(String DienThoai) {
		_DienThoai = DienThoai;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setDienThoai", String.class);

				method.invoke(_importedXCDRemoteModel, DienThoai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoFAX() {
		return _SoFAX;
	}

	@Override
	public void setSoFAX(String SoFAX) {
		_SoFAX = SoFAX;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setSoFAX", String.class);

				method.invoke(_importedXCDRemoteModel, SoFAX);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaChungLoai() {
		return _MaChungLoai;
	}

	@Override
	public void setMaChungLoai(String MaChungLoai) {
		_MaChungLoai = MaChungLoai;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setMaChungLoai", String.class);

				method.invoke(_importedXCDRemoteModel, MaChungLoai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTenXe() {
		return _MaTenXe;
	}

	@Override
	public void setMaTenXe(String MaTenXe) {
		_MaTenXe = MaTenXe;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTenXe", String.class);

				method.invoke(_importedXCDRemoteModel, MaTenXe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNhanHieu() {
		return _NhanHieu;
	}

	@Override
	public void setNhanHieu(String NhanHieu) {
		_NhanHieu = NhanHieu;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setNhanHieu", String.class);

				method.invoke(_importedXCDRemoteModel, NhanHieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoLoai() {
		return _SoLoai;
	}

	@Override
	public void setSoLoai(String SoLoai) {
		_SoLoai = SoLoai;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLoai", String.class);

				method.invoke(_importedXCDRemoteModel, SoLoai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenThuongMai() {
		return _TenThuongMai;
	}

	@Override
	public void setTenThuongMai(String TenThuongMai) {
		_TenThuongMai = TenThuongMai;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setTenThuongMai", String.class);

				method.invoke(_importedXCDRemoteModel, TenThuongMai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoDongCo() {
		return _SoDongCo;
	}

	@Override
	public void setSoDongCo(String SoDongCo) {
		_SoDongCo = SoDongCo;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setSoDongCo", String.class);

				method.invoke(_importedXCDRemoteModel, SoDongCo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSoKhung() {
		return _SoKhung;
	}

	@Override
	public void setSoKhung(String SoKhung) {
		_SoKhung = SoKhung;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setSoKhung", String.class);

				method.invoke(_importedXCDRemoteModel, SoKhung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNamSx() {
		return _NamSx;
	}

	@Override
	public void setNamSx(String NamSx) {
		_NamSx = NamSx;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setNamSx", String.class);

				method.invoke(_importedXCDRemoteModel, NamSx);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoiSx() {
		return _NoiSx;
	}

	@Override
	public void setNoiSx(String NoiSx) {
		_NoiSx = NoiSx;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiSx", String.class);

				method.invoke(_importedXCDRemoteModel, NoiSx);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNgayDenHan() {
		return _NgayDenHan;
	}

	@Override
	public void setNgayDenHan(String NgayDenHan) {
		_NgayDenHan = NgayDenHan;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayDenHan", String.class);

				method.invoke(_importedXCDRemoteModel, NgayDenHan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNgayCapGCN() {
		return _NgayCapGCN;
	}

	@Override
	public void setNgayCapGCN(String NgayCapGCN) {
		_NgayCapGCN = NgayCapGCN;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayCapGCN", String.class);

				method.invoke(_importedXCDRemoteModel, NgayCapGCN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNgayNhap() {
		return _NgayNhap;
	}

	@Override
	public void setNgayNhap(String NgayNhap) {
		_NgayNhap = NgayNhap;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayNhap", String.class);

				method.invoke(_importedXCDRemoteModel, NgayNhap);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNote() {
		return _Note;
	}

	@Override
	public void setNote(String Note) {
		_Note = Note;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setNote", String.class);

				method.invoke(_importedXCDRemoteModel, Note);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLoginName() {
		return _LoginName;
	}

	@Override
	public void setLoginName(String LoginName) {
		_LoginName = LoginName;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setLoginName", String.class);

				method.invoke(_importedXCDRemoteModel, LoginName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMADV() {
		return _MADV;
	}

	@Override
	public void setMADV(String MADV) {
		_MADV = MADV;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setMADV", String.class);

				method.invoke(_importedXCDRemoteModel, MADV);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTinhTrang() {
		return _TinhTrang;
	}

	@Override
	public void setTinhTrang(String TinhTrang) {
		_TinhTrang = TinhTrang;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setTinhTrang", String.class);

				method.invoke(_importedXCDRemoteModel, TinhTrang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGhiChu() {
		return _GhiChu;
	}

	@Override
	public void setGhiChu(String GhiChu) {
		_GhiChu = GhiChu;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_importedXCDRemoteModel, GhiChu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNguoiSoat() {
		return _NguoiSoat;
	}

	@Override
	public void setNguoiSoat(String NguoiSoat) {
		_NguoiSoat = NguoiSoat;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiSoat", String.class);

				method.invoke(_importedXCDRemoteModel, NguoiSoat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNgaySoat() {
		return _NgaySoat;
	}

	@Override
	public void setNgaySoat(String NgaySoat) {
		_NgaySoat = NgaySoat;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setNgaySoat", String.class);

				method.invoke(_importedXCDRemoteModel, NgaySoat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKetQua() {
		return _KetQua;
	}

	@Override
	public void setKetQua(String KetQua) {
		_KetQua = KetQua;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setKetQua", String.class);

				method.invoke(_importedXCDRemoteModel, KetQua);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSTT() {
		return _STT;
	}

	@Override
	public void setSTT(long STT) {
		_STT = STT;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setSTT", long.class);

				method.invoke(_importedXCDRemoteModel, STT);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenXe() {
		return _TenXe;
	}

	@Override
	public void setTenXe(String TenXe) {
		_TenXe = TenXe;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setTenXe", String.class);

				method.invoke(_importedXCDRemoteModel, TenXe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenChungLoai() {
		return _TenChungLoai;
	}

	@Override
	public void setTenChungLoai(String TenChungLoai) {
		_TenChungLoai = TenChungLoai;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setTenChungLoai", String.class);

				method.invoke(_importedXCDRemoteModel, TenChungLoai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTSKT() {
		return _MaTSKT;
	}

	@Override
	public void setMaTSKT(String MaTSKT) {
		_MaTSKT = MaTSKT;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTSKT", String.class);

				method.invoke(_importedXCDRemoteModel, MaTSKT);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenDacTinhV() {
		return _TenDacTinhV;
	}

	@Override
	public void setTenDacTinhV(String TenDacTinhV) {
		_TenDacTinhV = TenDacTinhV;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setTenDacTinhV", String.class);

				method.invoke(_importedXCDRemoteModel, TenDacTinhV);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenDacTinhA() {
		return _TenDacTinhA;
	}

	@Override
	public void setTenDacTinhA(String TenDacTinhA) {
		_TenDacTinhA = TenDacTinhA;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setTenDacTinhA", String.class);

				method.invoke(_importedXCDRemoteModel, TenDacTinhA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaNhomDacTinh() {
		return _MaNhomDacTinh;
	}

	@Override
	public void setMaNhomDacTinh(String MaNhomDacTinh) {
		_MaNhomDacTinh = MaNhomDacTinh;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setMaNhomDacTinh", String.class);

				method.invoke(_importedXCDRemoteModel, MaNhomDacTinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getThuNguyen() {
		return _ThuNguyen;
	}

	@Override
	public void setThuNguyen(String ThuNguyen) {
		_ThuNguyen = ThuNguyen;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setThuNguyen", String.class);

				method.invoke(_importedXCDRemoteModel, ThuNguyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGiaTri() {
		return _GiaTri;
	}

	@Override
	public void setGiaTri(String GiaTri) {
		_GiaTri = GiaTri;

		if (_importedXCDRemoteModel != null) {
			try {
				Class<?> clazz = _importedXCDRemoteModel.getClass();

				Method method = clazz.getMethod("setGiaTri", String.class);

				method.invoke(_importedXCDRemoteModel, GiaTri);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getImportedXCDRemoteModel() {
		return _importedXCDRemoteModel;
	}

	public void setImportedXCDRemoteModel(BaseModel<?> importedXCDRemoteModel) {
		_importedXCDRemoteModel = importedXCDRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _importedXCDRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_importedXCDRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ImportedXCDLocalServiceUtil.addImportedXCD(this);
		}
		else {
			ImportedXCDLocalServiceUtil.updateImportedXCD(this);
		}
	}

	@Override
	public ImportedXCD toEscapedModel() {
		return (ImportedXCD)ProxyUtil.newProxyInstance(ImportedXCD.class.getClassLoader(),
			new Class[] { ImportedXCD.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ImportedXCDClp clone = new ImportedXCDClp();

		clone.setId(getId());
		clone.setTrangthai(getTrangthai());
		clone.setIDGCN(getIDGCN());
		clone.setSoToKhai(getSoToKhai());
		clone.setSoDangKy(getSoDangKy());
		clone.setSoBienBan(getSoBienBan());
		clone.setNguoiKT(getNguoiKT());
		clone.setNgayKiemTra(getNgayKiemTra());
		clone.setNoiKiemTra(getNoiKiemTra());
		clone.setMaChu(getMaChu());
		clone.setTenChu(getTenChu());
		clone.setDiaChi(getDiaChi());
		clone.setDienThoai(getDienThoai());
		clone.setSoFAX(getSoFAX());
		clone.setMaChungLoai(getMaChungLoai());
		clone.setMaTenXe(getMaTenXe());
		clone.setNhanHieu(getNhanHieu());
		clone.setSoLoai(getSoLoai());
		clone.setTenThuongMai(getTenThuongMai());
		clone.setSoDongCo(getSoDongCo());
		clone.setSoKhung(getSoKhung());
		clone.setNamSx(getNamSx());
		clone.setNoiSx(getNoiSx());
		clone.setNgayDenHan(getNgayDenHan());
		clone.setNgayCapGCN(getNgayCapGCN());
		clone.setNgayNhap(getNgayNhap());
		clone.setNote(getNote());
		clone.setLoginName(getLoginName());
		clone.setMADV(getMADV());
		clone.setTinhTrang(getTinhTrang());
		clone.setGhiChu(getGhiChu());
		clone.setNguoiSoat(getNguoiSoat());
		clone.setNgaySoat(getNgaySoat());
		clone.setKetQua(getKetQua());
		clone.setSTT(getSTT());
		clone.setTenXe(getTenXe());
		clone.setTenChungLoai(getTenChungLoai());
		clone.setMaTSKT(getMaTSKT());
		clone.setTenDacTinhV(getTenDacTinhV());
		clone.setTenDacTinhA(getTenDacTinhA());
		clone.setMaNhomDacTinh(getMaNhomDacTinh());
		clone.setThuNguyen(getThuNguyen());
		clone.setGiaTri(getGiaTri());

		return clone;
	}

	@Override
	public int compareTo(ImportedXCD importedXCD) {
		int value = 0;

		if (getId() < importedXCD.getId()) {
			value = -1;
		}
		else if (getId() > importedXCD.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ImportedXCDClp)) {
			return false;
		}

		ImportedXCDClp importedXCD = (ImportedXCDClp)obj;

		long primaryKey = importedXCD.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(87);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", trangthai=");
		sb.append(getTrangthai());
		sb.append(", IDGCN=");
		sb.append(getIDGCN());
		sb.append(", SoToKhai=");
		sb.append(getSoToKhai());
		sb.append(", SoDangKy=");
		sb.append(getSoDangKy());
		sb.append(", SoBienBan=");
		sb.append(getSoBienBan());
		sb.append(", NguoiKT=");
		sb.append(getNguoiKT());
		sb.append(", NgayKiemTra=");
		sb.append(getNgayKiemTra());
		sb.append(", NoiKiemTra=");
		sb.append(getNoiKiemTra());
		sb.append(", MaChu=");
		sb.append(getMaChu());
		sb.append(", TenChu=");
		sb.append(getTenChu());
		sb.append(", DiaChi=");
		sb.append(getDiaChi());
		sb.append(", DienThoai=");
		sb.append(getDienThoai());
		sb.append(", SoFAX=");
		sb.append(getSoFAX());
		sb.append(", MaChungLoai=");
		sb.append(getMaChungLoai());
		sb.append(", MaTenXe=");
		sb.append(getMaTenXe());
		sb.append(", NhanHieu=");
		sb.append(getNhanHieu());
		sb.append(", SoLoai=");
		sb.append(getSoLoai());
		sb.append(", TenThuongMai=");
		sb.append(getTenThuongMai());
		sb.append(", SoDongCo=");
		sb.append(getSoDongCo());
		sb.append(", SoKhung=");
		sb.append(getSoKhung());
		sb.append(", NamSx=");
		sb.append(getNamSx());
		sb.append(", NoiSx=");
		sb.append(getNoiSx());
		sb.append(", NgayDenHan=");
		sb.append(getNgayDenHan());
		sb.append(", NgayCapGCN=");
		sb.append(getNgayCapGCN());
		sb.append(", NgayNhap=");
		sb.append(getNgayNhap());
		sb.append(", Note=");
		sb.append(getNote());
		sb.append(", LoginName=");
		sb.append(getLoginName());
		sb.append(", MADV=");
		sb.append(getMADV());
		sb.append(", TinhTrang=");
		sb.append(getTinhTrang());
		sb.append(", GhiChu=");
		sb.append(getGhiChu());
		sb.append(", NguoiSoat=");
		sb.append(getNguoiSoat());
		sb.append(", NgaySoat=");
		sb.append(getNgaySoat());
		sb.append(", KetQua=");
		sb.append(getKetQua());
		sb.append(", STT=");
		sb.append(getSTT());
		sb.append(", TenXe=");
		sb.append(getTenXe());
		sb.append(", TenChungLoai=");
		sb.append(getTenChungLoai());
		sb.append(", MaTSKT=");
		sb.append(getMaTSKT());
		sb.append(", TenDacTinhV=");
		sb.append(getTenDacTinhV());
		sb.append(", TenDacTinhA=");
		sb.append(getTenDacTinhA());
		sb.append(", MaNhomDacTinh=");
		sb.append(getMaNhomDacTinh());
		sb.append(", ThuNguyen=");
		sb.append(getThuNguyen());
		sb.append(", GiaTri=");
		sb.append(getGiaTri());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(133);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangthai</column-name><column-value><![CDATA[");
		sb.append(getTrangthai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IDGCN</column-name><column-value><![CDATA[");
		sb.append(getIDGCN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SoToKhai</column-name><column-value><![CDATA[");
		sb.append(getSoToKhai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SoDangKy</column-name><column-value><![CDATA[");
		sb.append(getSoDangKy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SoBienBan</column-name><column-value><![CDATA[");
		sb.append(getSoBienBan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NguoiKT</column-name><column-value><![CDATA[");
		sb.append(getNguoiKT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayKiemTra</column-name><column-value><![CDATA[");
		sb.append(getNgayKiemTra());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NoiKiemTra</column-name><column-value><![CDATA[");
		sb.append(getNoiKiemTra());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaChu</column-name><column-value><![CDATA[");
		sb.append(getMaChu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenChu</column-name><column-value><![CDATA[");
		sb.append(getTenChu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DiaChi</column-name><column-value><![CDATA[");
		sb.append(getDiaChi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DienThoai</column-name><column-value><![CDATA[");
		sb.append(getDienThoai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SoFAX</column-name><column-value><![CDATA[");
		sb.append(getSoFAX());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaChungLoai</column-name><column-value><![CDATA[");
		sb.append(getMaChungLoai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaTenXe</column-name><column-value><![CDATA[");
		sb.append(getMaTenXe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NhanHieu</column-name><column-value><![CDATA[");
		sb.append(getNhanHieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SoLoai</column-name><column-value><![CDATA[");
		sb.append(getSoLoai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenThuongMai</column-name><column-value><![CDATA[");
		sb.append(getTenThuongMai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SoDongCo</column-name><column-value><![CDATA[");
		sb.append(getSoDongCo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SoKhung</column-name><column-value><![CDATA[");
		sb.append(getSoKhung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NamSx</column-name><column-value><![CDATA[");
		sb.append(getNamSx());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NoiSx</column-name><column-value><![CDATA[");
		sb.append(getNoiSx());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayDenHan</column-name><column-value><![CDATA[");
		sb.append(getNgayDenHan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayCapGCN</column-name><column-value><![CDATA[");
		sb.append(getNgayCapGCN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgayNhap</column-name><column-value><![CDATA[");
		sb.append(getNgayNhap());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Note</column-name><column-value><![CDATA[");
		sb.append(getNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LoginName</column-name><column-value><![CDATA[");
		sb.append(getLoginName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MADV</column-name><column-value><![CDATA[");
		sb.append(getMADV());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TinhTrang</column-name><column-value><![CDATA[");
		sb.append(getTinhTrang());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>GhiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NguoiSoat</column-name><column-value><![CDATA[");
		sb.append(getNguoiSoat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NgaySoat</column-name><column-value><![CDATA[");
		sb.append(getNgaySoat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>KetQua</column-name><column-value><![CDATA[");
		sb.append(getKetQua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>STT</column-name><column-value><![CDATA[");
		sb.append(getSTT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenXe</column-name><column-value><![CDATA[");
		sb.append(getTenXe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenChungLoai</column-name><column-value><![CDATA[");
		sb.append(getTenChungLoai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaTSKT</column-name><column-value><![CDATA[");
		sb.append(getMaTSKT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenDacTinhV</column-name><column-value><![CDATA[");
		sb.append(getTenDacTinhV());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenDacTinhA</column-name><column-value><![CDATA[");
		sb.append(getTenDacTinhA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MaNhomDacTinh</column-name><column-value><![CDATA[");
		sb.append(getMaNhomDacTinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ThuNguyen</column-name><column-value><![CDATA[");
		sb.append(getThuNguyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>GiaTri</column-name><column-value><![CDATA[");
		sb.append(getGiaTri());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _trangthai;
	private String _IDGCN;
	private String _SoToKhai;
	private String _SoDangKy;
	private String _SoBienBan;
	private String _NguoiKT;
	private String _NgayKiemTra;
	private String _NoiKiemTra;
	private String _MaChu;
	private String _TenChu;
	private String _DiaChi;
	private String _DienThoai;
	private String _SoFAX;
	private String _MaChungLoai;
	private String _MaTenXe;
	private String _NhanHieu;
	private String _SoLoai;
	private String _TenThuongMai;
	private String _SoDongCo;
	private String _SoKhung;
	private String _NamSx;
	private String _NoiSx;
	private String _NgayDenHan;
	private String _NgayCapGCN;
	private String _NgayNhap;
	private String _Note;
	private String _LoginName;
	private String _MADV;
	private String _TinhTrang;
	private String _GhiChu;
	private String _NguoiSoat;
	private String _NgaySoat;
	private String _KetQua;
	private long _STT;
	private String _TenXe;
	private String _TenChungLoai;
	private String _MaTSKT;
	private String _TenDacTinhV;
	private String _TenDacTinhA;
	private String _MaNhomDacTinh;
	private String _ThuNguyen;
	private String _GiaTri;
	private BaseModel<?> _importedXCDRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.class;
}