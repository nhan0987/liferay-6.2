function changevaluevehiclerecordmau(row) {
	//console.log(('==changevaluevehiclerecordmau====dong=============' + row);
	
	var giaTri = $('#vehicleRecordMau' + row).is(':checked');
	
	var idVehicleRecordMau = $('#idVehicleRecordMau' + row).val();
	
	var soKhungMau = $('#soKhungMau' + row).val();//Số VIN, ChassisNumber
	var soVinMau = $('#soVinMau' + row).val();
	var soDongCoMau = $('#soDongCoMau' + row).val();//soDongCoMauSuaDoi
	var tinhTrangPhuongTienMau = $('#tinhTrangPhuongTienMau' + row).val();
	var mauXeMau = $('#mauXeMau' + row).val();//mauXeMauSuaDoi
	var namSXXeMau = $('#namSXXeMau' + row).val();//namSXXeMauSuaDoi
	
	
	var soKhungSuaDoi = $('#soKhungMauSuaDoi' + row).text();//
	var soDongCoSuaDoi = $('#soDongCoMauSuaDoi' + row).text();//
	var mauXeSuaDoi = $('#mauXeMauSuaDoi' + row).text();
	var namSanXuatXeSuaDoi = $('#namSXXeMauSuaDoi' + row).text();
	var tinhTrangPhuongTienSuaDoi = $('#tinhTrangPhuongTienMauSuaDoi' + row).text();
	
	//console.log(('==changevaluevehiclerecordmau====namSanXuatXeSuaDoi==' + namSanXuatXeSuaDoi + '==tinhTrangPhuongTienSuaDoi==' + tinhTrangPhuongTienSuaDoi);
	
	var listVehicleRecordMau = $('#listVehicleRecordMau').val();//id cua cac xe mẫu đã chọn
	var listSoKhungMau = $('#listSoKhungMau').val();//số khung cua cac xe mẫu đã chọn
	var listSoDongCoMau = $('#listSoDongCoMau').val();//số động cơ cac xe mẫu đã chọn
	var listSoVinMau = $('#listSoVinMau').val();//số vin cac xe mẫu đã chọn
	var listTinhTrangPhuongTienMau = $('#listTinhTrangPhuongTienMau').val();//tình trạng xe mẫu đã chọn
	var listNamSXXeMau = $('#listNamSXXeMau').val();//năm sản xuất xe mẫu đã chọn
	var listMauXeMau = $('#listMauXeMau').val();//màu xe xe mẫu đã chọn
	
	var listSoKhungSuaDoi = $('#listSoKhungSuaDoi').val();
	var listSoDongCoSuaDoi = $('#listSoDongCoSuaDoi').val();
	var listMauXeSuaDoi = $('#listMauXeSuaDoi').val();
	var listNamSanXuatXeSuaDoi = $('#listNamSanXuatXeSuaDoi').val();
	var listTinhTrangPhuongTienSuaDoi = $('#listTinhTrangPhuongTienSuaDoi').val();

	if (giaTri == true) {
		if (idVehicleRecordMau != '') {
			listVehicleRecordMau = listVehicleRecordMau + idVehicleRecordMau + ",";
		}
		if (soKhungMau != '') {
			listSoKhungMau = listSoKhungMau + "#" + row + "--" + soKhungMau + ",";
		}
		if (soDongCoMau != '') {
			listSoDongCoMau = listSoDongCoMau + "#" + row + "--" + soDongCoMau + ",";
		}
		if (soVinMau != '') {
			listSoVinMau = listSoVinMau + "#" + row + "--" + soVinMau + ",";
		}
		if (tinhTrangPhuongTienMau != '') {
			listTinhTrangPhuongTienMau = listTinhTrangPhuongTienMau + "#" + row + "--" + tinhTrangPhuongTienMau + ",";
		}
		if (namSXXeMau != '') {
			listNamSXXeMau = listNamSXXeMau + "#" + row + "--" + namSXXeMau + ",";
		}
		if (mauXeMau != '') {
			listMauXeMau = listMauXeMau + "#" + row + "--" + mauXeMau + ",";
		}
		
		if (soKhungSuaDoi != '') {
			listSoKhungSuaDoi = listSoKhungSuaDoi + "#" + row + "--" + soKhungSuaDoi + ",";
		}
		if (soDongCoSuaDoi != '') { 
			listSoDongCoSuaDoi = listSoDongCoSuaDoi + "#" + row + "--" + soDongCoSuaDoi + ","; 
		}
		if (mauXeSuaDoi != '') {
			listMauXeSuaDoi = listMauXeSuaDoi + "#" + row + "--" + mauXeSuaDoi + ","; 
		}
		if (namSanXuatXeSuaDoi != '') {
			listNamSanXuatXeSuaDoi = listNamSanXuatXeSuaDoi + "#" + row + "--" + namSanXuatXeSuaDoi + ",";
		}
		if (tinhTrangPhuongTienSuaDoi != '') {
			listTinhTrangPhuongTienSuaDoi = listTinhTrangPhuongTienSuaDoi + "#" + row + "--" + tinhTrangPhuongTienSuaDoi + ",";
		}
		
		
		//the <a> Bỏ chọn, sửa đổi
		$("#isDisplayPhuongTien" + row).hide();
		$("#isDisplaySuaDoi" + row).hide();
	} else if (giaTri == false) {
		listVehicleRecordMau = listVehicleRecordMau.replace(idVehicleRecordMau + ',', '');
		listSoKhungMau = listSoKhungMau.replace("#" + row + "--" + soKhungMau + ',', '');
		listSoDongCoMau = listSoDongCoMau.replace("#" + row + "--" + soDongCoMau + ',', '');
		listSoVinMau = listSoVinMau.replace("#" + row + "--" + soVinMau + ',', '');
		listTinhTrangPhuongTienMau = listTinhTrangPhuongTienMau.replace("#" + row + "--" + tinhTrangPhuongTienMau + ',', '');
		listNamSXXeMau = listNamSXXeMau.replace("#" + row + "--" + namSXXeMau + ',', '');
		listMauXeMau = listMauXeMau.replace("#" + row + "--" + mauXeMau + ',', '');
		
		listSoKhungSuaDoi = listSoKhungSuaDoi.replace("#" + row + "--" + soKhungSuaDoi + ',', '');
		listSoDongCoSuaDoi = listSoDongCoSuaDoi.replace("#" + row + "--" + soDongCoSuaDoi + ',', '');
		listMauXeSuaDoi = listMauXeSuaDoi.replace("#" + row + "--" + mauXeSuaDoi + ',', '');
		listNamSanXuatXeSuaDoi = listNamSanXuatXeSuaDoi.replace("#" + row + "--" + namSanXuatXeSuaDoi + ',', '');
		listTinhTrangPhuongTienSuaDoi = listTinhTrangPhuongTienSuaDoi.replace("#" + row + "--" + tinhTrangPhuongTienSuaDoi + ',', '');
		//the <a> Bỏ chọn, sửa đổi
		$("#isDisplayPhuongTien" + row).show();
		$("#isDisplaySuaDoi" + row).show();
	}
	//1.19	Số VIN xe mẫu
	$('input[name="TTC_1_21"]').val(listSoVinMau);
	$('input[name="TTC_1_22"]').val(listSoKhungMau);
	$('input[name="TTC_1_23"]').val(listSoDongCoMau);
	$('input[name="TTC_1_24"]').val(listTinhTrangPhuongTienMau);
	$('input[name="TTC_1_25"]').val(listNamSXXeMau);
	$('input[name="TTC_1_26"]').val(listMauXeMau);
	//1.24	Màu sơn xe mẫu

	$('input[name="giaTriKiemTraTTCTTC_1_21"]').val(listSoVinMau);
	$('input[name="giaTriKiemTraTTCTTC_1_22"]').val(listSoKhungSuaDoi);
	$('input[name="giaTriKiemTraTTCTTC_1_23"]').val(listSoDongCoSuaDoi);
	$('input[name="giaTriKiemTraTTCTTC_1_24"]').val(listTinhTrangPhuongTienSuaDoi);
	$('input[name="giaTriKiemTraTTCTTC_1_25"]').val(listNamSanXuatXeSuaDoi);
	$('input[name="giaTriKiemTraTTCTTC_1_26"]').val(listMauXeSuaDoi);

	$('input[name="TTC_1_21"]').attr('style', 'display: none !important');
	$('input[name="TTC_1_22"]').attr('style', 'display: none !important');
	$('input[name="TTC_1_23"]').attr('style', 'display: none !important');
	$('input[name="TTC_1_24"]').attr('style', 'display: none !important');
	$('input[name="TTC_1_25"]').attr('style', 'display: none !important');
	$('input[name="TTC_1_26"]').attr('style', 'display: none !important');
	
	$("#div_view_TTC_1_21").html(listSoVinMau.replace(/,/g, '<br>'));
	$("#div_view_TTC_1_22").html(listSoKhungMau.replace(/,/g, '<br>'));
	$("#div_view_TTC_1_23").html(listSoDongCoMau.replace(/,/g, '<br>'));
	$("#div_view_TTC_1_24").html(listTinhTrangPhuongTienMau.replace(/,/g, '<br>'));
	$("#div_view_TTC_1_25").html(listNamSXXeMau.replace(/,/g, '<br>'));
	$("#div_view_TTC_1_26").html(listMauXeMau.replace(/,/g, '<br>'));
	
	$('input[name="giaTriKiemTraTTCTTC_1_21"]').attr('style', 'display: none !important');
	$('input[name="giaTriKiemTraTTCTTC_1_22"]').attr('style', 'display: none !important');
	$('input[name="giaTriKiemTraTTCTTC_1_23"]').attr('style', 'display: none !important');
	$('input[name="giaTriKiemTraTTCTTC_1_24"]').attr('style', 'display: none !important');
	$('input[name="giaTriKiemTraTTCTTC_1_25"]').attr('style', 'display: none !important');
	$('input[name="giaTriKiemTraTTCTTC_1_26"]').attr('style', 'display: none !important');
	
	$("#div_view_giaTriKiemTraTTCTTC_1_21").html(listSoVinMau.replace(/,/g, '<br>'));
	$("#div_view_giaTriKiemTraTTCTTC_1_22").html(listSoKhungSuaDoi.replace(/,/g, '<br>'));
	$("#div_view_giaTriKiemTraTTCTTC_1_23").html(listSoDongCoSuaDoi.replace(/,/g, '<br>'));
	$("#div_view_giaTriKiemTraTTCTTC_1_24").html(listTinhTrangPhuongTienSuaDoi.replace(/,/g, '<br>'));
	$("#div_view_giaTriKiemTraTTCTTC_1_25").html(listNamSanXuatXeSuaDoi.replace(/,/g, '<br>'));
	$("#div_view_giaTriKiemTraTTCTTC_1_26").html(listMauXeSuaDoi.replace(/,/g, '<br>'));
	
	$('#listVehicleRecordMau').val(listVehicleRecordMau);
	$('#listSoKhungMau').val(listSoKhungMau);
	$('#listSoDongCoMau').val(listSoDongCoMau);
	$('#listSoVinMau').val(listSoVinMau);
	$('#listTinhTrangPhuongTienMau').val(listTinhTrangPhuongTienMau);
	$('#listNamSXXeMau').val(listNamSXXeMau);
	$('#listMauXeMau').val(listMauXeMau);
	
	$('#listSoKhungSuaDoi').val(listSoKhungSuaDoi);
	$('#listSoDongCoSuaDoi').val(listSoDongCoSuaDoi);
	$('#listMauXeSuaDoi').val(listMauXeSuaDoi);
	$('#listNamSanXuatXeSuaDoi').val(listNamSanXuatXeSuaDoi);
	$('#listTinhTrangPhuongTienSuaDoi').val(listTinhTrangPhuongTienSuaDoi);
}


function onChangeSelLuaChonThongSoKtXe(stt) {
	
	//$('#selLuaChonKetQua' + stt).on('change', function() {
	var code = $('select#selLuaChonKetQua' + stt).val();
	//console.log(("==onChangeSelLuaChonKetQua==" + stt + "=code=" + code);
	
	var specificationcode = $('#specificationcode' + stt).val();
	var specificationvalue = "";
	
	if (code === '0') {
		//console.log((stt + '(0) Chua dua ra quyet dinh - (2) de chong, khong nhap, khong lam j' + ('giaTriDangKi=' + $('#giaTriDangKi' + stt).val()) + ('GiaTriKiemTra=' + $('#giaTriKiemTra' + stt).val()));
		
		$('#giaTriKiemTra' + stt).val('');
		
		$('#giaTriKiemTra_' + stt).attr('value','');
		$('#giaTriKiemTra_' + stt).val('');
		$('#giaTriKiemTra_' + stt).addClass("textNone");
		$('#giaTriKiemTra_' + stt).prop('readonly', true);
		
		//class of element
		$('#trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'background-color: rgb(91, 220, 231) !important');
		$('#selLuaChonKetQua' + stt).attr('style', 'background-color: rgb(91, 220, 231) !important; color: black !important');
		
		//chinh font chu
		$('#sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		$('#sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		
		$('#giaTriDangKi_' + stt).attr('style', 'background-color: rgb(91, 220, 231) !important; color: black !important');
		$('#giaTriKiemTra_' + stt).attr('style', 'background-color: rgb(91, 220, 231) !important; color: black !important');
		
	} else if (code === '1') {
		//console.log((stt + '(1) Dat - copy (1) vao (2) khong sua' + 'gia tri dang ki:' + ($('#giaTriDangKi' + stt).val()) + 'gia tri kiem tra:' + ($('#giaTriKiemTra' + stt).val()));
		
		//gia tri dang ki, gia tri kiem tra
		$('#giaTriKiemTra' + stt).val($('#giaTriDangKi' + stt).val());
		$('#giaTriKiemTra_' + stt).attr('value',$('#giaTriDangKi_' + stt).val());
		$('#giaTriKiemTra_' + stt).val($('#giaTriDangKi_' + stt).val());
		
		//var numberDat = parseInt($('#divTgsoKqDat').text(), 10);
		//var numberKhongDat = parseInt($('#divTgsoKqKhongDat').text(), 10);
		//var numberSuaDoi = parseInt($('#divTgsoKqSuaDoi').text(), 10);
		//var numberChuaDuaRaQuyetDinh = parseInt($('#divTgsoKqChuaDuaRaQuyetDinh').text(), 10);
		
		//$('#divTgsoKqDat').text(numberDat + 1);
		//$('#divTgsoKqKhongDat').text('0');
		//$('#divTgsoKqSuaDoi').text('0');
		//$('#divTgsoKqChuaDuaRaQuyetDinh').text(numberChuaDuaRaQuyetDinh - 1);
		
		//$('.trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).css('background-color', '');
		$('#trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'background-color: white !important');
		$('#selLuaChonKetQua' + stt).attr('style', 'background-color: white !important; color: black !important');
		
		//chinh font chu
		$('#sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		$('#sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		
		$('#giaTriDangKi_' + stt).attr('style', 'background-color: white !important; color: black !important');
		$('#giaTriKiemTra_' + stt).attr('style', 'background-color: white !important; color: black !important');
		
		specificationvalue = $('#giaTriDangKi_' + stt).val();
	} else if (code === '2') {
		//console.log((stt + '(2) Ko Dat - text box, nhap chu~' + ('giaTriDangKi=' + $('#giaTriDangKi' + stt).val()) + ('GiaTriKiemTra=' + $('#giaTriKiemTra' + stt).val()));
		
		//remove class="textNone", readOnly = false
		//$('#giaTriKiemTra' + stt).removeClass("textNone");
		//$('#giaTriKiemTra' + stt).val('');
		//$('#giaTriKiemTra' + stt).prop('readonly', false);
		$('#giaTriKiemTra' + stt).on("click", suaGiaTriNhap($('#specificationcode' + stt).val(),$('#giaTriDangKi' + stt).val(),stt,'THONGSOXE',''));

		//$('.trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).css('background-color', 'rgb(237, 108, 108) !important;');
		$('#trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'background-color: rgb(237, 108, 108) !important');
		$('#selLuaChonKetQua' + stt).attr('style', 'background-color: rgb(237, 108, 108) !important; color: black !important');
	
		//chinh font chu
		$('#sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		$('#sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		
		$('#giaTriDangKi_' + stt).attr('style', 'background-color: rgb(237, 108, 108) !important; color: black !important');
		$('#giaTriKiemTra_' + stt).attr('style', 'background-color: rgb(237, 108, 108) !important; color: black !important');
	} else if (code === '3') {
		//console.log((stt + '(3) Sua doi - copy (1) -> (2) sua tren text box' + ('giaTriDangKi=' + $('#giaTriDangKi' + stt).val()) + ('GiaTriKiemTra=' + $('#giaTriKiemTra' + stt).val()));
		
		//remove class="textNone"
		//$('#giaTriKiemTra' + stt).removeClass("textNone");
		//$('#giaTriKiemTra' + stt).prop('readonly', false);
//		$('#giaTriKiemTra' + stt).val($('#giaTriDangKi' + stt).val());
//		$('#giaTriKiemTra_' + stt).val($('#giaTriDangKi_' + stt).val());
		$('#giaTriKiemTra' + stt).on("click", suaGiaTriNhap($('#specificationcode' + stt).val(),$('#giaTriDangKi' + stt).val(),stt,'THONGSOXE',''));
		
		//$('.trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).css('background-color', 'rgb(245, 245, 107) !important;');
		$('#trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'background-color: rgb(245, 245, 107) !important');
		$('#selLuaChonKetQua' + stt).attr('style', 'background-color: rgb(245, 245, 107) !important; color: black !important');
		
		//chinh font chu
		$('#sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		$('#sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		
		$('#giaTriDangKi_' + stt).attr('style', 'background-color: rgb(245, 245, 107) !important; color: black !important');
		$('#giaTriKiemTra_' + stt).attr('style', 'background-color: rgb(245, 245, 107) !important; color: black !important');
	} else if (code === '4') {
		//console.log((stt + '(0) Khong ap dung (2) de chong, khong ap dung ' + 'gia tri dang ki:' + ($('#giaTriDangKi' + stt).val()) + 'gia tri kiem tra:' + ($('#giaTriKiemTra' + stt).val()));
		
		$('#giaTriKiemTra' + stt).attr('value','');
		
		$('#giaTriKiemTra_' + stt).attr('value','');
		$('#giaTriKiemTra_' + stt).val('');
		$('#giaTriKiemTra_' + stt).addClass("textNone");
		$('#giaTriKiemTra_' + stt).prop('readonly', true);
		
		//$('.trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).css('background-color', 'rgb(42, 203, 42) !important;');
		$('#trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'background-color: rgb(42, 203, 42) !important');
		$('#selLuaChonKetQua' + stt).attr('style', 'background-color: rgb(42, 203, 42) !important; color: black !important');
		
		
		//chinh font chu
		$('#sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		$('#sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		
		$('#giaTriDangKi_' + stt).attr('style', 'background-color: rgb(42, 203, 42) !important; color: black !important');
		$('#giaTriKiemTra_' + stt).attr('style', 'background-color: rgb(42, 203, 42) !important; color: black !important');
	}
	
	if(specificationcode === "XCG0009" && code != '3'){	// TODO: Fix cung cong thuc banh xe cua XCG
		loadThongSoKyThuat(0, false, code);
	}
	
	//for all tag. phan tinh toan cac gia tri tong ket
	caculatoTongSoKetQua();
}

function func_xacnhanPheDuyet() {
	func_huyPheDuyet();
	var stt = $('#giaTriNhapStt').val();
	
	var giaTriNhapSuaDoi = $('#giaTriNhapSuaDoi' + stt);

	if (isThuocDmDataItem == "0") {
		var giaTriView = $('#giaTriNhapSuaDoi' + stt).val();
		$('#giaTriKiemTra_' + stt).val(giaTriView);
		$('#giaTriKiemTra' + stt).val(giaTriView);
	} else if (isThuocDmDataItem == "1") {
		var giaTriId = $('#giaTriNhapSuaDoi' + stt).val();
		var giaTriView = $('#giaTriNhapSuaDoi' + stt + ' option[value="'+giaTriId+'"]').text();

		$('#giaTriKiemTra_' + stt).val(giaTriView);
		$('#giaTriKiemTra' + stt).val(giaTriId);
	}

	// cong thuc banh xe
	if(giaTriNhapSuaDoi.data("specificationcode") == 'XCG0009') {
		loadThongSoKyThuat(giaTriNhapSuaDoi.val(), false, 3);
	}
}

function func_xacnhanPheDuyetTTChung() {
	// truong hop la nuoc san xuat thi set gia tri initial = gia tri da chon
	// ton tai id #listValueGiaTriState cua nuoc san xuat
	
	if($('#giaTriCommonCode').length > 0 && $('#giaTriCommonCode').val() == 'TTC_1_14') {
		if($("#listValueGiaTriState").length > 0) {	
			$("#listValueGiaTriStateInitial").val($("#listValueGiaTriState").val());
			$("#listHienThiGiaTriStateInitial").val($("#listHienThiGiaTriState").val());
			
			/*console.log("listValueGiaTriState: "+$("#listValueGiaTriState").val());
			console.log("listHienThiGiaTriState: "+$("#listHienThiGiaTriState").val());
			console.log("listValueGiaTriStateInitial: "+$("#listValueGiaTriStateInitial").val());
			console.log("listHienThiGiaTriStateInitial: "+$("#listHienThiGiaTriStateInitial").val());*/
		}
		
		setGiaTriKhiChonNuocSanXuat($("#listValueGiaTriState").val(), $("#listHienThiGiaTriState").val());
	}
	
	func_huyPheDuyet();
	var stt = document.getElementById('giaTriNhapStt').value;
	var commonCode = document.getElementById('commonCode' + stt).value;

	if (isThuocDmDataItem == "0") {
		var giaTriView = document.getElementById('giaTriNhapSuaDoi' + stt).value;
		document.getElementById('giaTriCodeTTC_SuaDoi' + commonCode).value = giaTriView;
		$('#giaTriCodeTTC' + stt).val(giaTriView);
		document.getElementById('giaTriKiemTraTTC' + commonCode).value = giaTriView;
	} else if (isThuocDmDataItem == "1") {
		var giaTriId = document.getElementById('giaTriNhapSuaDoi' + stt).value;
		var giaTriView = $('#giaTriNhapSuaDoi' + stt + ' option[value="'+giaTriId+'"]').text();//document.getElementById('giaTriNhapSuaDoi' + stt).selectedOptions[0].text;

		document.getElementById('giaTriKiemTraTTC' + commonCode).value = giaTriView;
		$('#giaTriCodeTTC' + stt).val(giaTriId);
		document.getElementById('giaTriCodeTTC_SuaDoi' + commonCode).value = giaTriId;
		
		//2 la checkbox, dung cho truong hop Nuoc san xuat cua TTC
	} else if (isThuocDmDataItem == "2") {
		/*var listStateCode = "";
		var listStateValue = "";
		
		$('#listValueGiaTriNhap .changeState').each(function(){
			if($(this).is(":checked")) {
				listStateCode += $(this).data("statecode") + ",";
				listStateValue += $(this).data("statevalue") + ",";
			}
		});
		
		$('#giaTriKiemTraTTC' + commonCode).val(listStateValue);
		$('#giaTriKiemTraTTC' + commonCode).attr('value', listStateValue);
		
		$('#giaTriCodeTTC' + stt).val(listStateCode);
		
		$('#giaTriCodeTTC_SuaDoi' + commonCode).val(listStateCode);
		$('#giaTriCodeTTC_SuaDoi' + commonCode).attr('value', listStateCode);*/
	}
}

function changeState(dataId) {

	var isCheck = $('#giaTriNhapSuaDoi' + dataId).is(':checked');
	var valueGiaTriState = $('#listValueGiaTriState').val();
	var hienThiGiaTriState = $('#listHienThiGiaTriState').val();

	var valueCheck = $('#giaTriNhapSuaDoi' + dataId).val();

	if (isCheck == true) {
		valueGiaTriState = valueGiaTriState + dataId + ",";
		hienThiGiaTriState = hienThiGiaTriState + valueCheck + ",";
	} else {
		valueGiaTriState = valueGiaTriState.replace(dataId + ",", "");
		hienThiGiaTriState = hienThiGiaTriState.replace(valueCheck + ",", "");
	}
	
	$('#listValueGiaTriState').val(valueGiaTriState);
	$('#listValueGiaTriState').attr('value', valueGiaTriState);
	
	$('#listHienThiGiaTriState').val(hienThiGiaTriState);
	$('#listHienThiGiaTriState').attr('value', hienThiGiaTriState);
	
	setGiaTriKhiChonNuocSanXuat(valueGiaTriState, hienThiGiaTriState);
}

function setGiaTriKhiChonNuocSanXuat(valueGiaTriState, hienThiGiaTriState) {
	var stt = $('#giaTriNhapStt').val();
	var commonCode = $('#giaTriCommonCode').val();
	
	$('#giaTriKiemTraTTC' + commonCode).val(hienThiGiaTriState);
	$('#giaTriKiemTraTTC' + commonCode).attr('value', hienThiGiaTriState);
	
	$('#giaTriCodeTTC' + stt).val(valueGiaTriState);
	
	$('#giaTriCodeTTC_SuaDoi' + commonCode).val(valueGiaTriState);
	$('#giaTriCodeTTC_SuaDoi' + commonCode).attr('value', valueGiaTriState);
}

function func_xacnhanChiPhiPhatSinh() {
	var stt = document.getElementById('giaTriNhapStt').value;

	if (isThuocDmDataItem == "0") {
		var giaTriView = document.getElementById('giaTriNhapSuaDoi' + stt).value;
		document.getElementById('giaTriCodeTTC_SuaDoi' + stt).value = giaTriView;
		document.getElementById('giaTriKiemTraTTC' + stt).value = giaTriView;
	} else if (isThuocDmDataItem == "1") {
		var giaTriId = document.getElementById('giaTriNhapSuaDoi' + stt).value;
		var giaTriView = $('#giaTriNhapSuaDoi' + stt + ' option[value="'+giaTriId+'"]').text();//document.getElementById('giaTriNhapSuaDoi' + stt).selectedOptions[0].text;

		document.getElementById('giaTriKiemTraTTC' + stt).value = giaTriView;
		document.getElementById('giaTriCodeTTC_SuaDoi' + stt).value = giaTriId;
	}
}

$(function() {
	$('#divQuangDuongPhatSinh').hide();
	$('#divGhiChuChiPhiPhatSinh').hide();
});

function eventHideOrShowDivXNTP(idElement, idElementHide) {
	$('#' + idElement).show();
	$('#' + idElementHide).hide();
}

//II. Danh sách phương tiện kiểm tra : click Suả đổi
function changeDanhSachPhuongTienKiemTra(soXe) {
	//var nhanHieu = $('#giaTriKiemTraTTC11').val();
	var nhanHieu = $('#giaTriDangKiTTC11').val();
	//var soLoai = $('#giaTriKiemTraTTC12').val();
	var soLoai = $('#giaTriDangKiTTC12').val();
	
	var soVinMau = $('#soVinMau' + soXe).val();
	var soKhungMau = $('#soKhungMauEdit' + soXe).val();
	var soDongCoMau = $('#soDongCoMauEdit' + soXe).val();
	var tinhTrangPhuongTienMau = $('#tinhTrangPhuongTienMauEdit' + soXe).val();
	var namSXXeMau = $('#namSXXeMauEdit' + soXe).val();
	var mauXeMau = $('#mauXeMauEdit' + soXe).val();

	document.getElementById("listValueGiaTriNhapDSXe").style.overflowX = "";
	//document.getElementById("listValueGiaTriNhapDSXe").style.height = "30px";

	giaTriTraVe = newtblDanhSachPhuongTienKiemTra(soXe, nhanHieu, soLoai, soVinMau, soKhungMau, soDongCoMau, tinhTrangPhuongTienMau, namSXXeMau, mauXeMau);

	if (giaTriTraVe != '') {
		document.getElementById("valueGiaTriNhapSttDSXe").innerHTML = "<input type='hidden' id='giaTriNhapSttDSXe' name='giaTriNhapSttDSXe' value='"+ soXe + "' /> ";
		document.getElementById("listValueGiaTriNhapDSXe").innerHTML = giaTriTraVe;
		showThongBaoMsgDSXe();
	}
}

//II. Danh sách phương tiện kiểm tra : click Suả đổi create Table Sửa đổi
function newtblDanhSachPhuongTienKiemTra(soXe, nhanHieu, soLoai, soVinMau, soKhungMau, soDongCoMau, tinhTrangPhuongTienMau, namSXXeMau, mauXeMau) {

	var duLieu = "<table style=\"width: 100%;\"";
	duLieu = duLieu + "<tr>";
	duLieu = duLieu + "<td class=\"text-center bold\" style=\"font-size: 13px; text-align: left;width: 20%;\">Nhãn hiệu, Số loại</td>";
	duLieu = duLieu + "<td >";
	duLieu = duLieu + "<input type='text' disabled=\"disabled\" value='" + nhanHieu + "' style=\"width: 50%;float: left;\" class=\"form-control-find\"/>";
	duLieu = duLieu + "<input type='text' disabled=\"disabled\" value='" + soLoai + "' style=\"width: 50%;float: left;\" class=\"form-control-find\"/>";
	duLieu = duLieu + "</td>";
	duLieu = duLieu + "</tr>";
	
	
	duLieu = duLieu + "<tr>";
	duLieu = duLieu + "<td class=\"text-center bold\" style=\"font-size: 13px; text-align: left;\">Số VIN</td>";
	duLieu = duLieu + "<td ><input type='text' disabled=\"disabled\" value='" + soVinMau + "' style=\"width: 100%;\" class=\"form-control-find\"/>";
	duLieu = duLieu + "</td>";
	duLieu = duLieu + "</tr>";
	
	duLieu = duLieu + "<tr>";
	duLieu = duLieu + "<td class=\"text-center bold\" style=\"font-size: 13px; text-align: left;\">Số khung, Số động cơ</td>";
	duLieu = duLieu + "<td >";
	duLieu = duLieu + "<input type='text' id='soKhungMauDSXeSuaDoi" + soXe + "' value='" + soKhungMau + "' style=\"width: 50%;float: left;\" class=\"form-control-find\"/>";
	duLieu = duLieu + "<input type='text' id='soDongCoMauDSXeSuaDoi" + soXe + "' value='" + soDongCoMau + "' style=\"width: 50%;float: left;\" class=\"form-control-find\"/>";
	duLieu = duLieu + "</td>";
	duLieu = duLieu + "</tr>";
	
	duLieu = duLieu + "<tr>";
	duLieu = duLieu + "<td class=\"text-center bold\" style=\"font-size: 13px; text-align: left;\">Tình trạng</td>";
	duLieu = duLieu + "<td >";
	duLieu = duLieu + "<select id='tinhTrangPhuongTienMauDSXeSuaDoi" + soXe + "' class=\"form-control-find\" style=\"height: 30px\">";
	if (tinhTrangPhuongTienMau == '0') {
		duLieu = duLieu + "<option value=\"0\" selected >Chưa qua sử dụng</option>";
		duLieu = duLieu + "<option value=\"1\">Đã qua sử dụng</option>";
		duLieu = duLieu + "<option value=\"2\">Xem ghi chú</option>";
	} else if (tinhTrangPhuongTienMau == '1') {
		duLieu = duLieu + "<option value=\"0\">Chưa qua sử dụng</option>";
		duLieu = duLieu + "<option value=\"1\" selected >Đã qua sử dụng</option>";
		duLieu = duLieu + "<option value=\"2\">Xem ghi chú</option>";
	} else if (tinhTrangPhuongTienMau == '2') {
		duLieu = duLieu + "<option value=\"0\">Chưa qua sử dụng</option>";
		duLieu = duLieu + "<option value=\"1\">Đã qua sử dụng</option>";
		duLieu = duLieu + "<option value=\"2\" selected >Xem ghi chú</option>";
	}
	duLieu = duLieu + "</select>";
	duLieu = duLieu + "</td>"
	duLieu = duLieu + "</tr>";
	
	duLieu = duLieu + "<tr>";
	duLieu = duLieu + "<td class=\"text-center bold\" style=\"font-size: 13px; text-align: left;\">Năm sản xuất</td>";
	duLieu = duLieu + "<td ><input type='text' id='namSXXeMauDSXeSuaDoi" + soXe + "' value='" + namSXXeMau + "' style=\"width: 100%;\" class=\"form-control-find\"/></td>";
	duLieu = duLieu + "</tr>";
	
	duLieu = duLieu + "<tr>";
	duLieu = duLieu + "<td class=\"text-center bold\" style=\"font-size: 13px; text-align: left;\">Màu xe</td>";
	duLieu = duLieu + "<td ><input type='text' id='mauXeMauDSXeSuaDoi" + soXe + "' value='" + mauXeMau + "' style=\"width: 100%;\" class=\"form-control-find\"/></td>";
	duLieu = duLieu + "</tr>";
	
	duLieu = duLieu + "</table>";
	return duLieu;
}

function func_xacnhanPheDuyetDSXe() {
	func_huyPheDuyetDSXe();
	var soXe = document.getElementById('giaTriNhapSttDSXe').value;
	var soKhungMauDSXeSuaDoiView = document.getElementById('soKhungMauDSXeSuaDoi' + soXe).value;
	var soDongCoMauDSXeSuaDoiView = document.getElementById('soDongCoMauDSXeSuaDoi' + soXe).value;
	var tinhTrangPhuongTienMauDSXeSuaDoiView = document.getElementById('tinhTrangPhuongTienMauDSXeSuaDoi' + soXe).value;
	var namSXXeMauDSXeSuaDoiView = document.getElementById('namSXXeMauDSXeSuaDoi' + soXe).value;
	var mauXeMauDSXeSuaDoiView = document.getElementById('mauXeMauDSXeSuaDoi' + soXe).value;

	//console.log(("===soKhungMauDSXeSuaDoiView==" + soKhungMauDSXeSuaDoiView);
	//console.log(("===soDongCoMauDSXeSuaDoiView==" + soDongCoMauDSXeSuaDoiView);
	//console.log(("===tinhTrangPhuongTienMauDSXeSuaDoiView==" + tinhTrangPhuongTienMauDSXeSuaDoiView);
	//console.log(("===namSXXeMauDSXeSuaDoiView==" + namSXXeMauDSXeSuaDoiView);
	//console.log(("===mauXeMauDSXeSuaDoiView==" + mauXeMauDSXeSuaDoiView);

	document.getElementById('soKhungMauSuaDoi' + soXe).textContent = soKhungMauDSXeSuaDoiView;
	document.getElementById('soDongCoMauSuaDoi' + soXe).textContent = soDongCoMauDSXeSuaDoiView;
	if (tinhTrangPhuongTienMauDSXeSuaDoiView == '0') {
		document.getElementById('tinhTrangPhuongTienMauSuaDoi' + soXe).textContent = 'Chưa qua sử dụng';
	} else if (tinhTrangPhuongTienMauDSXeSuaDoiView == '1') {
		document.getElementById('tinhTrangPhuongTienMauSuaDoi' + soXe).textContent = 'Đã qua sử dụng';
	} else if (tinhTrangPhuongTienMauDSXeSuaDoiView == '2') {
		document.getElementById('tinhTrangPhuongTienMauSuaDoi' + soXe).textContent = 'Xem ghi chú';
	}
	document.getElementById('namSXXeMauSuaDoi' + soXe).textContent = namSXXeMauDSXeSuaDoiView;
	document.getElementById('mauXeMauSuaDoi' + soXe).textContent = mauXeMauDSXeSuaDoiView;

	document.getElementById('soKhungMauEdit' + soXe).value = soKhungMauDSXeSuaDoiView;
	document.getElementById('soDongCoMauEdit' + soXe).value = soDongCoMauDSXeSuaDoiView;
	document.getElementById('tinhTrangPhuongTienMauEdit' + soXe).value = tinhTrangPhuongTienMauDSXeSuaDoiView;
	document.getElementById('mauXeMauEdit' + soXe).value = mauXeMauDSXeSuaDoiView;
	document.getElementById('namSXXeMauEdit' + soXe).value = namSXXeMauDSXeSuaDoiView;
}

var isSelectDouble = '0';

var arr_selectionThongTinChung = [];
var arr_selectionThongSoKtXe = [];

/*kiem tra xem co phai la trinh duyet safari hay khong*/
var dkUA = navigator.userAgent.toLowerCase();
var isSafariBrowser = false; 
if (dkUA.indexOf('safari') != -1 && dkUA.indexOf('chrome') == -1) { 
	isSafariBrowser = true;
}

function checkSelLuaChonThongTinChung(stt, commonCode) {
	//console.log(("==checkSelLuaChonThongTinChung====" + arr_selectionThongTinChung[stt]);
	/*if (isSelectDouble == '0') {
		isSelectDouble = '1';
	} else if (isSelectDouble == '1') {
		onChangeSelLuaChonThongTinChung(stt);
		isSelectDouble = '0';
	}*/
	
	// Neu la trinh duyet safari thi khi click select khong goi onclick luon nhu trinh duyet chrome, firefox, ie
	if(isSafariBrowser) {
		arr_selectionThongTinChung[stt] = 1;
	}
	
	if(arr_selectionThongTinChung[stt]) {
		onChangeSelLuaChonThongTinChung(stt, commonCode);
		arr_selectionThongTinChung.splice(stt, 1);
	} else {
		arr_selectionThongTinChung[stt] = 1;
	}
}
function checkSelLuaChonThongSoKtXe(stt) {
	//console.log(("==checkSelLuaChonThongSoKtXe====" + arr_selectionThongSoKtXe[stt]);
	/*if (isSelectDouble == '0') {
		isSelectDouble = '1';
	} else if (isSelectDouble == '1') {
		onChangeSelLuaChonThongSoKtXe(stt);
		isSelectDouble = '0';
	}*/
	
	// Neu la trinh duyet safari thi khi click select khong goi onclick luon nhu trinh duyet chrome, firefox, ie
	if(isSafariBrowser) {
		arr_selectionThongSoKtXe[stt] = 1;
	}
	
	if(arr_selectionThongSoKtXe[stt]) {
		onChangeSelLuaChonThongSoKtXe(stt);
		arr_selectionThongSoKtXe.splice(stt, 1);
	} else {
		arr_selectionThongSoKtXe[stt] = 1;
	}
}

/**Dialog tag Thông tin chung*/
function showThongBaoMsgDSXe() {
	//console.log(("==showThongBaoMsgDSXe ==");
	$("#div_WarningMsgDSXe").dialog({
		title : 'Xác nhận thay đổi',
		resizable : false,
		modal : true,
		width : '900px',
		closeOnEscape : false,
		open : function() {
			jQuery('.ui-widget-overlay').bind('click', function() {
				$('#div_WarningMsgDSXe').dialog('close');
			});
		}
	});
}

/**Dialog tag Kiểm tra Chất lượng an toàn KTVBVMT, chon danh muc*/
function showThongBaoMsg() {
	//resetGiaTriNhapSuaDoi();
	//console.log(("==showThongBaoMsg ==");
	$("#div_WarningMsg").dialog({
		title : 'Xác nhận thay đổi',
		resizable : false,
		modal : true,
		width : '400px',
		closeOnEscape : false,
		open : function() {
			jQuery('.ui-widget-overlay').bind('click', function() {
				$('#div_WarningMsg').dialog('close');
			});
		}
	});
}

/**
 * This method used to reset value of "GiaTriNhapSuaDoi" 
 * */
function resetGiaTriNhapSuaDoiTTC() {
	var stt = document.getElementById('giaTriNhapStt').value;
	var result = document.getElementById('selLuaChonKetQua'+stt).value;
	// ko dat
	//if (result == "2") {
	//	document.getElementById('giaTriNhapSuaDoi' + stt).value = "";
	//	document.getElementById('giaTriKiemTra_' + stt).value = "";
	//} else {
		if (isThuocDmDataItem == "0") {
			$('#giaTriNhapSuaDoi' + stt).val($('#giaTriDangKyCodeTTC' + stt).val());
			//document.getElementById('giaTriNhapSuaDoi' + stt).value = document.getElementById('giaTriDangKiTTC' + stt).value;		
		} else if (isThuocDmDataItem == "1") {
			$('#giaTriNhapSuaDoi' + stt).val($('#giaTriDangKyCodeTTC' + stt).val());
			//document.getElementById('giaTriNhapSuaDoi' + stt).selectedOptions[0].text = document.getElementById('giaTriDangKiTTC' + stt).value;
		}
	//}
}

function resetGiaTriNhapSuaDoiKTCLAT() {
	var stt = document.getElementById('giaTriNhapStt').value;
	if (isThuocDmDataItem == "0") {
		$('#giaTriNhapSuaDoi' + stt).val($('#giaTriDangKi' + stt).val());
		//document.getElementById('giaTriNhapSuaDoi' + stt).value = document.getElementById('giaTriDangKi_' + stt).value;
	} else if (isThuocDmDataItem == "1") {
		$('#giaTriNhapSuaDoi' + stt).val($('#giaTriDangKi' + stt).val());
		//document.getElementById('giaTriNhapSuaDoi' + stt).selectedOptions[0].text = document.getElementById('giaTriDangKi_' + stt).value;
	}
}

function func_huyPheDuyet() {
	// truong hop la nuoc san xuat thi reset lai gia tri ban dau
	// ton tai id #listValueGiaTriState cua nuoc san xuat
	
	if($('#giaTriCommonCode').length > 0 && $('#giaTriCommonCode').val() == 'TTC_1_14') {
		if($("#listValueGiaTriState").length > 0) {	
			$("#listValueGiaTriState").val($("#listValueGiaTriStateInitial").val());
			$("#listHienThiGiaTriState").val($("#listHienThiGiaTriStateInitial").val());
			
			/*console.log("listValueGiaTriState: "+$("#listValueGiaTriState").val());
			console.log("listHienThiGiaTriState: "+$("#listHienThiGiaTriState").val());
			console.log("listValueGiaTriStateInitial: "+$("#listValueGiaTriStateInitial").val());
			console.log("listHienThiGiaTriStateInitial: "+$("#listHienThiGiaTriStateInitial").val());*/
		}
		
		setGiaTriKhiChonNuocSanXuat($("#listValueGiaTriState").val(), $("#listHienThiGiaTriState").val());
	}
	
	$('#div_WarningMsg').dialog('close');
}
function func_huyPheDuyetDSXe() {
	$('#div_WarningMsgDSXe').dialog('close');
}


function createGiaTriTraVe(code, name, isSelected) {
	var duLieu = '<input type="checkbox" id="giaTriNhapSuaDoi' + code + '" data-statecode="' + code + '"data-statevalue="' + name + '" value="' + name + '" ' + isSelected + ' onclick="changeState(\'' + code + '\')"/>'; /*class="changeState" */
	duLieu = duLieu + '<label style="font-weight:normal;cursor:pointer;padding-left:3px;" for="giaTriNhapSuaDoi' + code + '">' + name + '</label><br>';
	return duLieu;
}

function createListGiaTriTraVe(giaTriCode, giaTriView) {
	var duLieu = '<input type="hidden" id="listValueGiaTriState" name="valueGiaTriState" value="' + giaTriCode + '"/>';
	duLieu = duLieu + '<input type="hidden" id="listHienThiGiaTriState" name="hienThiGiaTriState" value="' + giaTriView + '"/>';
	duLieu = duLieu + '<input type="hidden" id="listValueGiaTriStateInitial" name="listValueGiaTriStateInitial" value="' + giaTriCode + '"/>';
	duLieu = duLieu + '<input type="hidden" id="listHienThiGiaTriStateInitial" name="listHienThiGiaTriStateInitial" value="' + giaTriView + '"/>';
	return duLieu;
}

function createInput(stt, giaTriDangKi) {
	//giaTriTraVe = "<input type='text' id='giaTriNhapSuaDoi" + stt + "' name='giaTriNhapSuaDoi' value='" + giaTriDangKi + "' style='width: 339px;height: 30px' /> ";
	//giaTriTraVe = "<input type='text' id='giaTriNhapSuaDoi" + stt + "' name='giaTriNhapSuaDoi' value='" + giaTriDangKi + "' style='width: 339px;height: 30px' /> ";
	return '<input type="text" id="giaTriNhapSuaDoi' + stt + '" name="giaTriNhapSuaDoi" value="' + giaTriDangKi + '" style="width: 339px;height: 30px"/>';
}

function createInputDate(stt, giaTriDangKi) {
	var html = '';
	
	html += '<input type="text" onclick="gtCalendar(\'giaTriNhapSuaDoi' + stt + '\')" value="' + giaTriDangKi + '" name="giaTriNhapSuaDoi" id="giaTriNhapSuaDoi' + stt + '" readonly="readonly" class="form-control-find-calendar" style="width: 150px; float: left; background-color: white; cursor: pointer;">';
	html += '<span class="input-group-btn" style="float: left;">';
	html += '<button class="btn_calendar btn-default" type="button" style="font-size: 14px !important;" onclick="gtCalendar(\'giaTriNhapSuaDoi' + stt + '\')"><i class="fa fa-calendar"></i></button>';
	html += '</span>';
	
	return html;
}

function createTextArea(stt, giaTriDangKi) {
	return '<textarea id="giaTriNhapSuaDoi' + stt + '" name="giaTriNhapSuaDoi" style="width: 339px;height: 200px">' + giaTriDangKi + '</textarea>';
}

function createInputGiaTriNhapStt(stt) {
	/*return '<input type="hidden" id="giaTriNhapStt" name="giaTriNhapStt" value="' + stt + '" />';*/
}


