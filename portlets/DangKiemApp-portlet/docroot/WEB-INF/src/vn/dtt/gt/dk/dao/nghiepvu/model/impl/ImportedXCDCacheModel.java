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

package vn.dtt.gt.dk.dao.nghiepvu.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ImportedXCD in entity cache.
 *
 * @author win_64
 * @see ImportedXCD
 * @generated
 */
public class ImportedXCDCacheModel implements CacheModel<ImportedXCD>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(87);

		sb.append("{id=");
		sb.append(id);
		sb.append(", trangthai=");
		sb.append(trangthai);
		sb.append(", IDGCN=");
		sb.append(IDGCN);
		sb.append(", SoToKhai=");
		sb.append(SoToKhai);
		sb.append(", SoDangKy=");
		sb.append(SoDangKy);
		sb.append(", SoBienBan=");
		sb.append(SoBienBan);
		sb.append(", NguoiKT=");
		sb.append(NguoiKT);
		sb.append(", NgayKiemTra=");
		sb.append(NgayKiemTra);
		sb.append(", NoiKiemTra=");
		sb.append(NoiKiemTra);
		sb.append(", MaChu=");
		sb.append(MaChu);
		sb.append(", TenChu=");
		sb.append(TenChu);
		sb.append(", DiaChi=");
		sb.append(DiaChi);
		sb.append(", DienThoai=");
		sb.append(DienThoai);
		sb.append(", SoFAX=");
		sb.append(SoFAX);
		sb.append(", MaChungLoai=");
		sb.append(MaChungLoai);
		sb.append(", MaTenXe=");
		sb.append(MaTenXe);
		sb.append(", NhanHieu=");
		sb.append(NhanHieu);
		sb.append(", SoLoai=");
		sb.append(SoLoai);
		sb.append(", TenThuongMai=");
		sb.append(TenThuongMai);
		sb.append(", SoDongCo=");
		sb.append(SoDongCo);
		sb.append(", SoKhung=");
		sb.append(SoKhung);
		sb.append(", NamSx=");
		sb.append(NamSx);
		sb.append(", NoiSx=");
		sb.append(NoiSx);
		sb.append(", NgayDenHan=");
		sb.append(NgayDenHan);
		sb.append(", NgayCapGCN=");
		sb.append(NgayCapGCN);
		sb.append(", NgayNhap=");
		sb.append(NgayNhap);
		sb.append(", Note=");
		sb.append(Note);
		sb.append(", LoginName=");
		sb.append(LoginName);
		sb.append(", MADV=");
		sb.append(MADV);
		sb.append(", TinhTrang=");
		sb.append(TinhTrang);
		sb.append(", GhiChu=");
		sb.append(GhiChu);
		sb.append(", NguoiSoat=");
		sb.append(NguoiSoat);
		sb.append(", NgaySoat=");
		sb.append(NgaySoat);
		sb.append(", KetQua=");
		sb.append(KetQua);
		sb.append(", STT=");
		sb.append(STT);
		sb.append(", TenXe=");
		sb.append(TenXe);
		sb.append(", TenChungLoai=");
		sb.append(TenChungLoai);
		sb.append(", MaTSKT=");
		sb.append(MaTSKT);
		sb.append(", TenDacTinhV=");
		sb.append(TenDacTinhV);
		sb.append(", TenDacTinhA=");
		sb.append(TenDacTinhA);
		sb.append(", MaNhomDacTinh=");
		sb.append(MaNhomDacTinh);
		sb.append(", ThuNguyen=");
		sb.append(ThuNguyen);
		sb.append(", GiaTri=");
		sb.append(GiaTri);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ImportedXCD toEntityModel() {
		ImportedXCDImpl importedXCDImpl = new ImportedXCDImpl();

		importedXCDImpl.setId(id);
		importedXCDImpl.setTrangthai(trangthai);

		if (IDGCN == null) {
			importedXCDImpl.setIDGCN(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setIDGCN(IDGCN);
		}

		if (SoToKhai == null) {
			importedXCDImpl.setSoToKhai(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setSoToKhai(SoToKhai);
		}

		if (SoDangKy == null) {
			importedXCDImpl.setSoDangKy(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setSoDangKy(SoDangKy);
		}

		if (SoBienBan == null) {
			importedXCDImpl.setSoBienBan(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setSoBienBan(SoBienBan);
		}

		if (NguoiKT == null) {
			importedXCDImpl.setNguoiKT(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setNguoiKT(NguoiKT);
		}

		if (NgayKiemTra == null) {
			importedXCDImpl.setNgayKiemTra(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setNgayKiemTra(NgayKiemTra);
		}

		if (NoiKiemTra == null) {
			importedXCDImpl.setNoiKiemTra(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setNoiKiemTra(NoiKiemTra);
		}

		if (MaChu == null) {
			importedXCDImpl.setMaChu(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setMaChu(MaChu);
		}

		if (TenChu == null) {
			importedXCDImpl.setTenChu(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setTenChu(TenChu);
		}

		if (DiaChi == null) {
			importedXCDImpl.setDiaChi(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setDiaChi(DiaChi);
		}

		if (DienThoai == null) {
			importedXCDImpl.setDienThoai(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setDienThoai(DienThoai);
		}

		if (SoFAX == null) {
			importedXCDImpl.setSoFAX(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setSoFAX(SoFAX);
		}

		if (MaChungLoai == null) {
			importedXCDImpl.setMaChungLoai(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setMaChungLoai(MaChungLoai);
		}

		if (MaTenXe == null) {
			importedXCDImpl.setMaTenXe(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setMaTenXe(MaTenXe);
		}

		if (NhanHieu == null) {
			importedXCDImpl.setNhanHieu(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setNhanHieu(NhanHieu);
		}

		if (SoLoai == null) {
			importedXCDImpl.setSoLoai(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setSoLoai(SoLoai);
		}

		if (TenThuongMai == null) {
			importedXCDImpl.setTenThuongMai(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setTenThuongMai(TenThuongMai);
		}

		if (SoDongCo == null) {
			importedXCDImpl.setSoDongCo(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setSoDongCo(SoDongCo);
		}

		if (SoKhung == null) {
			importedXCDImpl.setSoKhung(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setSoKhung(SoKhung);
		}

		if (NamSx == null) {
			importedXCDImpl.setNamSx(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setNamSx(NamSx);
		}

		if (NoiSx == null) {
			importedXCDImpl.setNoiSx(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setNoiSx(NoiSx);
		}

		if (NgayDenHan == null) {
			importedXCDImpl.setNgayDenHan(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setNgayDenHan(NgayDenHan);
		}

		if (NgayCapGCN == null) {
			importedXCDImpl.setNgayCapGCN(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setNgayCapGCN(NgayCapGCN);
		}

		if (NgayNhap == null) {
			importedXCDImpl.setNgayNhap(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setNgayNhap(NgayNhap);
		}

		if (Note == null) {
			importedXCDImpl.setNote(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setNote(Note);
		}

		if (LoginName == null) {
			importedXCDImpl.setLoginName(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setLoginName(LoginName);
		}

		if (MADV == null) {
			importedXCDImpl.setMADV(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setMADV(MADV);
		}

		if (TinhTrang == null) {
			importedXCDImpl.setTinhTrang(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setTinhTrang(TinhTrang);
		}

		if (GhiChu == null) {
			importedXCDImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setGhiChu(GhiChu);
		}

		if (NguoiSoat == null) {
			importedXCDImpl.setNguoiSoat(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setNguoiSoat(NguoiSoat);
		}

		if (NgaySoat == null) {
			importedXCDImpl.setNgaySoat(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setNgaySoat(NgaySoat);
		}

		if (KetQua == null) {
			importedXCDImpl.setKetQua(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setKetQua(KetQua);
		}

		importedXCDImpl.setSTT(STT);

		if (TenXe == null) {
			importedXCDImpl.setTenXe(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setTenXe(TenXe);
		}

		if (TenChungLoai == null) {
			importedXCDImpl.setTenChungLoai(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setTenChungLoai(TenChungLoai);
		}

		if (MaTSKT == null) {
			importedXCDImpl.setMaTSKT(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setMaTSKT(MaTSKT);
		}

		if (TenDacTinhV == null) {
			importedXCDImpl.setTenDacTinhV(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setTenDacTinhV(TenDacTinhV);
		}

		if (TenDacTinhA == null) {
			importedXCDImpl.setTenDacTinhA(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setTenDacTinhA(TenDacTinhA);
		}

		if (MaNhomDacTinh == null) {
			importedXCDImpl.setMaNhomDacTinh(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setMaNhomDacTinh(MaNhomDacTinh);
		}

		if (ThuNguyen == null) {
			importedXCDImpl.setThuNguyen(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setThuNguyen(ThuNguyen);
		}

		if (GiaTri == null) {
			importedXCDImpl.setGiaTri(StringPool.BLANK);
		}
		else {
			importedXCDImpl.setGiaTri(GiaTri);
		}

		importedXCDImpl.resetOriginalValues();

		return importedXCDImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		trangthai = objectInput.readLong();
		IDGCN = objectInput.readUTF();
		SoToKhai = objectInput.readUTF();
		SoDangKy = objectInput.readUTF();
		SoBienBan = objectInput.readUTF();
		NguoiKT = objectInput.readUTF();
		NgayKiemTra = objectInput.readUTF();
		NoiKiemTra = objectInput.readUTF();
		MaChu = objectInput.readUTF();
		TenChu = objectInput.readUTF();
		DiaChi = objectInput.readUTF();
		DienThoai = objectInput.readUTF();
		SoFAX = objectInput.readUTF();
		MaChungLoai = objectInput.readUTF();
		MaTenXe = objectInput.readUTF();
		NhanHieu = objectInput.readUTF();
		SoLoai = objectInput.readUTF();
		TenThuongMai = objectInput.readUTF();
		SoDongCo = objectInput.readUTF();
		SoKhung = objectInput.readUTF();
		NamSx = objectInput.readUTF();
		NoiSx = objectInput.readUTF();
		NgayDenHan = objectInput.readUTF();
		NgayCapGCN = objectInput.readUTF();
		NgayNhap = objectInput.readUTF();
		Note = objectInput.readUTF();
		LoginName = objectInput.readUTF();
		MADV = objectInput.readUTF();
		TinhTrang = objectInput.readUTF();
		GhiChu = objectInput.readUTF();
		NguoiSoat = objectInput.readUTF();
		NgaySoat = objectInput.readUTF();
		KetQua = objectInput.readUTF();
		STT = objectInput.readLong();
		TenXe = objectInput.readUTF();
		TenChungLoai = objectInput.readUTF();
		MaTSKT = objectInput.readUTF();
		TenDacTinhV = objectInput.readUTF();
		TenDacTinhA = objectInput.readUTF();
		MaNhomDacTinh = objectInput.readUTF();
		ThuNguyen = objectInput.readUTF();
		GiaTri = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(trangthai);

		if (IDGCN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(IDGCN);
		}

		if (SoToKhai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SoToKhai);
		}

		if (SoDangKy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SoDangKy);
		}

		if (SoBienBan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SoBienBan);
		}

		if (NguoiKT == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NguoiKT);
		}

		if (NgayKiemTra == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NgayKiemTra);
		}

		if (NoiKiemTra == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NoiKiemTra);
		}

		if (MaChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaChu);
		}

		if (TenChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenChu);
		}

		if (DiaChi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DiaChi);
		}

		if (DienThoai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DienThoai);
		}

		if (SoFAX == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SoFAX);
		}

		if (MaChungLoai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaChungLoai);
		}

		if (MaTenXe == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaTenXe);
		}

		if (NhanHieu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NhanHieu);
		}

		if (SoLoai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SoLoai);
		}

		if (TenThuongMai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenThuongMai);
		}

		if (SoDongCo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SoDongCo);
		}

		if (SoKhung == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SoKhung);
		}

		if (NamSx == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NamSx);
		}

		if (NoiSx == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NoiSx);
		}

		if (NgayDenHan == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NgayDenHan);
		}

		if (NgayCapGCN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NgayCapGCN);
		}

		if (NgayNhap == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NgayNhap);
		}

		if (Note == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Note);
		}

		if (LoginName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LoginName);
		}

		if (MADV == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MADV);
		}

		if (TinhTrang == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TinhTrang);
		}

		if (GhiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GhiChu);
		}

		if (NguoiSoat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NguoiSoat);
		}

		if (NgaySoat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NgaySoat);
		}

		if (KetQua == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(KetQua);
		}

		objectOutput.writeLong(STT);

		if (TenXe == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenXe);
		}

		if (TenChungLoai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenChungLoai);
		}

		if (MaTSKT == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaTSKT);
		}

		if (TenDacTinhV == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenDacTinhV);
		}

		if (TenDacTinhA == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenDacTinhA);
		}

		if (MaNhomDacTinh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaNhomDacTinh);
		}

		if (ThuNguyen == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ThuNguyen);
		}

		if (GiaTri == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GiaTri);
		}
	}

	public long id;
	public long trangthai;
	public String IDGCN;
	public String SoToKhai;
	public String SoDangKy;
	public String SoBienBan;
	public String NguoiKT;
	public String NgayKiemTra;
	public String NoiKiemTra;
	public String MaChu;
	public String TenChu;
	public String DiaChi;
	public String DienThoai;
	public String SoFAX;
	public String MaChungLoai;
	public String MaTenXe;
	public String NhanHieu;
	public String SoLoai;
	public String TenThuongMai;
	public String SoDongCo;
	public String SoKhung;
	public String NamSx;
	public String NoiSx;
	public String NgayDenHan;
	public String NgayCapGCN;
	public String NgayNhap;
	public String Note;
	public String LoginName;
	public String MADV;
	public String TinhTrang;
	public String GhiChu;
	public String NguoiSoat;
	public String NgaySoat;
	public String KetQua;
	public long STT;
	public String TenXe;
	public String TenChungLoai;
	public String MaTSKT;
	public String TenDacTinhV;
	public String TenDacTinhA;
	public String MaNhomDacTinh;
	public String ThuNguyen;
	public String GiaTri;
}