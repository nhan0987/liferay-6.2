<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	RegisteredInspection registeredInspection = new RegisteredInspectionImpl();
	VehicleGroup vehicleGroup = new VehicleGroupImpl();
%>
<thead>
	<tr>
		<th class="text-center bold" style="font-size: 13px; height: 40px;">TT</th>
		<th class="text-center bold" style="font-size: 13px;">Nội dung</th>
		<th class="text-center bold" style="font-size: 13px;">Thông tin khai báo/đề nghị/tham chiếu</th>
		<th class="text-center bold" style="font-size: 13px;">Thông tin bổ sung sửa đổi</th>
	</tr>
</thead>
<tbody>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.1</span></th>
		<th class="text-left paddingLeft05"><span>Người nhập khẩu</span></th>
		<th class="text-left paddingLeft05"><span id="spanNguoiNhapKhau"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.2</span></th>
		<th class="text-left paddingLeft05"><span>Địa chỉ</span></th>
		<th class="text-left paddingLeft05"><span id="spanDiaChi"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.3</span></th>
		<th class="text-left paddingLeft05"><span>Người đại diện</span></th>
		<th class="text-left paddingLeft05"><span id="spanNguoiDaiDien"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.4</span></th>
		<th class="text-left paddingLeft05"><span>Số điện thoại</span></th>
		<th class="text-left paddingLeft05"><span></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.5</span></th>
		<th class="text-left paddingLeft05"><span>Thư điện tử</span></th>
		<th class="text-left paddingLeft05"><span id="spanThuDienTu"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.6</span></th>
		<th class="text-left paddingLeft05"><span>Số tham chiếu</span></th>
		<th class="text-left paddingLeft05"><span id="spanSoThamChieu"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.7</span></th>
		<th class="text-left paddingLeft05"><span>Số báo cáo thử nghiệm an toàn</span></th>
		<th class="text-left paddingLeft05"><span id="spanSoBcThuNghiemAnToan"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.8</span></th>
		<th class="text-left paddingLeft05"><span>Số báo cáo thử nghiệm khí thải</span></th>
		<th class="text-left paddingLeft05"><span id="spanSoBcThuNghiemKhiThai"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.9</span></th>
		<th class="text-left paddingLeft05"><span>Số báo cáo COP</span></th>
		<th class="text-left paddingLeft05"><span id="spanSoBcCOP"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.10</span></th>
		<th class="text-left paddingLeft05"><span>Loại phương tiện</span></th>
		<th class="text-left paddingLeft05"><span id="spanLoaiPhuongTien"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.11</span></th>
		<th class="text-left paddingLeft05"><span>Nhãn hiệu</span></th>
		<th class="text-left paddingLeft05"><span id="spanNhanHieu"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.12</span></th>
		<th class="text-left paddingLeft05"><span>Tên thương mại</span></th>
		<th class="text-left paddingLeft05"><span id="spanTenThuongMai"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.13</span></th>
		<th class="text-left paddingLeft05"><span>Mã kiểu loại</span></th>
		<th class="text-left paddingLeft05"><span id="spanMaKieuLoai"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.14</span></th>
		<th class="text-left paddingLeft05"><span>Nước sản xuất</span></th>
		<th class="text-left paddingLeft05"><span id="spanNuocSanXuat"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.15</span></th>
		<th class="text-left paddingLeft05"><span>Nhà máy sản xuất</span></th>
		<th class="text-left paddingLeft05"><span id="spanNhaMaySanXuat"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.16</span></th>
		<th class="text-left paddingLeft05"><span>Địa chỉ nhà máy sản xuất</span></th>
		<th class="text-left paddingLeft05"><span id="spanDiaChiNhaMaySx"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.17</span></th>
		<th class="text-left paddingLeft05"><span>Tiêu chuẩn khí thải</span></th>
		<th class="text-left paddingLeft05"><span id="spanTenTieuChuanKhiThai"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.18</span></th>
		<th class="text-left paddingLeft05"><span>Số đăng ký kiểm tra</span></th>
		<th class="text-left paddingLeft05"><span id="spanSoDangKiKt"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.19</span></th>
		<th class="text-left paddingLeft05"><span>Số Tờ khai hàng hóa nhập khẩu</span></th>
		<th class="text-left paddingLeft05"><span id="spanSoToKhaiHhnk"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.20</span></th>
		<th class="text-left paddingLeft05"><span>Ngày Tờ khai hàng hóa nhập khẩu</span></th>
		<th class="text-left paddingLeft05"><span id="spanNgayToKhaiHhnk"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.21</span></th>
		<th class="text-left paddingLeft05"><span>Số VIN</span></th>
		<th class="text-left paddingLeft05"><span id="spanSoVin"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.22</span></th>
		<th class="text-left paddingLeft05"><span>Số khung</span></th>
		<th class="text-left paddingLeft05"><span id="spanSoKhung"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.23</span></th>
		<th class="text-left paddingLeft05"><span>Số động cơ</span></th>
		<th class="text-left paddingLeft05"><span id="spanSoDongCo"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
	<tr>
		<th class="text-center" style="height: 30px;"><span>1.24</span></th>
		<th class="text-left paddingLeft05"><span>Tình trạng phương tiện</span></th>
		<th class="text-left paddingLeft05"><span id="spanTinhTrangPhuongTien"></span></th>
		<th class="text-left paddingLeft05"><input type="text" class="form-control width100" /></th>
	</tr>
</tbody>