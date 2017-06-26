//ca ham thuc thi o man hinh chua doi chieu

//bien o? man hinh duoc phan cong
var nhom = '';
var nhanHieu = '';
var soLoai = '';
var vehicleGroupId = '';
var vehicleGroupIdOld = '';
var vehicleGroupIdPdfOld = '';

var lstIdVehicleRecord = new Array();
var lstSoKhung = new Array();
var lstSoDongCo = new Array();
var lstTinhTrang = new Array();
var lstSoThamChieu = new Array();
var lstNamSanXua = new Array();
var lstMauSon = new Array();

var vehicleGroup = {
	id: '', referenceCertificateNo: '', safetyTestReportId: '', emissionTestReportId: '', copReportId: '',
	vehicleType: '', tradeMark: '', commercialName: '', modelCode: '', countryCode: '', productionPlant: '',
	addressofProductionPlant: '', emissionStandard: ''
};

var inspectionCommonStatus = {
	id: '', vehicleclass: '', sequenceno: '', type: '', groupname: '', itemname: '', commonstatus: '', inspectionrecordid: ''
};



var vehicleClass = '';

//bien o? man hinh lap bien ban kiem tra
// mang doi tuong dinh nghia de truyen di sang form lap bien ban kiem tra
var bienBanVehicleRecord = [];
var danhSachVehicleRecord = "";
var soXeDaChon=0;
/**
 * xmy xe may
 * dcx dong co xe may
 * xdd xd dap dien
 * xcg xe co gioi
 * xcd xd chuyen dung'
 * xbb xe bon banh
 * 
 * doi kiem tra khu vu vr_confirmedinspection.corporationid
 * 
 * dkv chinh vr_corporation_inspector inspectorname(contactcode)
 * 
 * dkv phoi hop vr_corporation_attendee confirmedinspectionid inspectorrole = 2
 * 
 * ngay kiem tra, tu ngay den ngay confirmedinspection lay tu confirmedInfrom to, cho phep sua
 * check dateFrom, to, neu <= ngay he thong thi lay ngay he thong
 * 
 * dia diem kiem tra, inspecteSite, districode, provinCode.
 * */

var xmy = 'Biên Bản Kiểm Tra Xe Mô Tô – Xe Gắn Máy Nhập Khẩu';
var dcx = 'Biên Bản Kiểm Tra Động Cơ Xe Mô Tô – Xe Gắn Máy Nhập Khẩu';
var xdd = 'Biên Bản Kiểm Tra Xe Đạp Điện Nhập Khẩu';
var xcg = 'Biên Bản Kiểm Tra Xe Cơ Giới Nhập Khẩu';
var xcd = 'Biên Bản Kiểm Tra Xe Máy Chuyên Dùng Nhập Khẩu';
var xbb = 'Biên Bản Kiểm Tra Xe Bốn Bánh Có Gắn Động Cơ Nhập Khẩu';

$(function() {
	//-----man hinh 1
	$('#divDuocPhanCOng').show();
	
	$('#divNoiDungKiemTra').show();
	

	//3 chuc nang nho
	$('#divYeuCauBoSung').hide();
	$('#divHoanKiemTra').hide();
	$('#divTraLaiDoiTuongPhanCong').hide();
	
	
	$('#divThongTinNhomXeNhapKhau').show();
	
	$('#divBusinnessDoiChieuHoSo').hide();
	
	$('#divButtonXacNhanDoiChieu').hide();
	//----- man hinh 2
	//$('#divLapBienBanKiemTra').hide();
	
	$('#theDem').hide();
	
	$('#soatXetHoSo').hide();
	$('#noiDungChiTiet').hide();
	$('#divButton').hide();
	
	caculatoTongSoKetQua();
});

function businessDoiChieuHoSo(row) {
	
	//------START------Boi backgroudColor mau vang vao TR click va mau trang cac TR con lai
	$('#trIdTblTTinNhomXeNk' + row).attr('style', 'background-color: yellow !important');
	//console.log($('#trIdTblTTinNhomXeNk' + row));
	
	$('.elementTblTTinNhomXeNk').each(function(index, element) { //loop through each checkbox. class="elementTblTTinNhomXeNk"
		var idTr = element.id;
		if (idTr !== ('trIdTblTTinNhomXeNk' + row)) {
			//console.log(idTr);
			//error $('.trTblTTinNhomXeNk' + row).css('background-color', '');
			$('#' + idTr).attr('style', 'background-color: white !important');
		}
	});
	//------END------Boi backgroudColor mau vang vao TR click va mau trang cac TR con lai
	
	//---------START------Truong hop test
/*	vehicleGroupId = $('#vehicleGroupTblTTinNhomXeNk' + row).val();//vehicle Group TblTTinNhomXeNk
	resultCallAjaxFindVehicleSpecification = false;
	//console.log('businessDoiChieuHoSo==vehicleGroupId==' + vehicleGroupId);
	//set gia tri vao
	$('#id_vehicle_group').val(vehicleGroupId);
	$('#lap_bien_ban_kt_id_vehicle_group').val(vehicleGroupId);
	//console.log('businessDoiChieuHoSo==vehicleGroupId==after==' + $('#id_vehicle_group').val());
	//console.log('businessDoiChieuHoSo==vehicleGroupId==after==' + $('#lap_bien_ban_kt_id_vehicle_group').val());*/
	//---------END--------Truong hop test
	
	//---------START create Objct VehicleGroup
	vehicleGroup.id = vehicleGroupId;
	vehicleGroup.referenceCertificateNo = $('#referenceCertificateNo' + row).val();
	vehicleGroup.safetyTestReportId = $('#safetyTestReportId' + row).val();
	vehicleGroup.emissionTestReportId = $('#emissionTestReportId' + row).val();
	vehicleGroup.copReportId = $('#copReportId' + row).val();
	vehicleGroup.vehicleType = $('#vehicleType' + row).val();
	vehicleGroup.tradeMark = $('#tradeMark' + row).val();
	vehicleGroup.commercialName = $('#commercialName' + row).val();
	vehicleGroup.modelCode = $('#modelCode' + row).val();
	vehicleGroup.countryCode = $('#countryCode' + row).val();
	vehicleGroup.productionPlant = $('#productionPlant' + row).val();
	vehicleGroup.addressofProductionPlant = $('#addressofProductionPlant' + row).val();
	vehicleGroup.emissionStandard = $('#emissionStandard' + row).val();
	//console.log('Thong tin Vehicle Group');
	//console.log(vehicleGroup);
	//---------END create Objct VehicleGroup
	
	//---------Set title cho ban khai
	vehicleClass = $('#vehicleClass' + row).val();
	
	
	//---------START---------Chuc nang call ajax xuat pdf view len giao dien
	//dieu kien kiem tra truong hop chon row Xem chi tiet, ko co j moi
	//console.log('==vehicleGroupIdPdfOld===' + vehicleGroupIdPdfOld  + "===vehicleGroupId===" + vehicleGroupId + "==vehicleClass===" + vehicleClass);
	var checkPDF = jQuery.inArray(vehicleGroupId, lstFileGroupId);//kiem tra xem trong danh sach file pdf, co ton tai 1 lan sussesful ko
	if (!(vehicleGroupIdPdfOld === vehicleGroupId) && checkPDF === -1) {
		vehicleGroupIdPdfOld = callAjaxHienThiBaoCaoReport(vehicleGroupId, vehicleClass);
	} else {
		loadDocument(path + lstFileThongSoKiThuat[checkPDF], 'viewFileThongSoKiThuat', 'fileContentThongSoKiThuat');
	}
	//---------END-----------Chuc nang call ajax xuat pdf view len giao dien
	
	nhom = $('#nhomTblTTinNhomXeNk' + row).val();//nhom
	nhanHieu = $('#nhanHieuTblTTinNhomXeNk' + row).val();//nhan hieu
	soLoai = $('#soLoaiTblTTinNhomXeNk' + row).val();//, so loai
	
	//console.log('businessDoiChieuHoSo=row=' + row + '=nhom=' + nhom + '=nhanHieu=' + nhanHieu + '=soLoai=' + soLoai);
	
	//idVehicleRecord
	lstIdVehicleRecord = new Array();
	$("input[name='idVehicleRecordTblTTinNhomXeNk" + row + "']").each(function() {
		lstIdVehicleRecord.push($(this).val());
		//console.log('idVehicleRecord==' + $(this).val());
	});
	
	//so khung
	lstSoKhung = new Array();
	$("input[name='soKhungTblTTinNhomXeNk" + row + "']").each(function() {
		lstSoKhung.push($(this).val());
	});
	// so dong co
	lstSoDongCo = new Array();
	$("input[name='soDongCoTblTTinNhomXeNk" + row + "']").each(function() {
		lstSoDongCo.push($(this).val());
	});

	
	
	//tinh trang, 
	lstTinhTrang = new Array();
	$("input[name='tinhTrangTblTTinNhomXeNk" + row + "']").each(function() {
		lstTinhTrang.push($(this).val());
	});
	
	//so tham chieu
	lstSoThamChieu = new Array();
	$("input[name='soThamChieuTblTTinNhomXeNk" + row + "']").each(function() {
		lstSoThamChieu.push($(this).val());
	});
	
	//nam suan xuat
	lstNamSanXua = new Array();
	$("input[name='namSanXuatTblTTinNhomXeNk" + row + "']").each(function() {
		lstNamSanXua.push($(this).val());
	});
	
	//mau son
	lstMauSon = new Array();
	$("input[name='mauSonTblTTinNhomXeNk" + row + "']").each(function() {
		lstMauSon.push($(this).val());
	});

	//console.log('lstSoKhung==' + lstSoKhung.length + '==lstSoDongCo==' + lstSoDongCo.length +
	//		'==lstIdVehicleRecord==' + lstIdVehicleRecord.length + 'lstTinhTrang==' + lstTinhTrang.length +
	//		'==lstSoThamChieu==' + lstSoThamChieu.length + '==lstNamSanXua==' + lstNamSanXua.length + '==lstMauSon==' + lstMauSon);
	
	//uncheck checkbox id='checkAllTblDanhSachVehicleRecord'
	$('#checkAllTblDanhSachVehicleRecord').prop('checked', false); // Unchecks it
	
	//delete all row table
	clearAllRowTable('tblDanhSachVehicleRecord');
	
	for (var i = 0; i < lstSoKhung.length; i++) {
		$('#tblDanhSachVehicleRecord tr:last').after(
			createRowOfTblDanhSachVehicleRecord(
				i, lstIdVehicleRecord[i], nhom, nhanHieu, soLoai,
				lstSoKhung[i], lstSoDongCo[i], lstTinhTrang[i], lstSoThamChieu[i], lstNamSanXua[i], lstMauSon[i]
			)
		);
	}
	
	//set so luong Tong so PT
	$("#tongSoPtDnKt").text(lstSoKhung.length);
	
	

	//hai nut button lap bien ban kiem tra, va  quay lai
	$('#divButtonXacNhanDoiChieu').show();
	//hien danh sach Phuong Tien Đinh Ngia Kiem Tra
	$('#divBusinnessDoiChieuHoSo').show();
	$('#theDem').show();
	
	
	
	//moi lan click vao check box, thi phai khoi tao lai mang, VehicleRecord trong Thong tin chung
	bienBanVehicleRecord = [];
}

function createRowOfTblDanhSachVehicleRecord(count, idVehicleRecord, nhom, nhanHieu, soLoai, soKhung, soDongCo , tinhTrang, 
	soThamChieu, namSanXuat, mauSon) {
	
	//console.log('count=' + count + '=idVehicleRecord=' + idVehicleRecord + '=nhom=' + nhom +
	//	'=nhanHieu=' + nhanHieu + '=soLoai=' + soLoai + '=soKhung=' + soKhung + '=soDongCo=' + soDongCo +
	//	'=tinhTrang=' + tinhTrang + '=soThamChieu=' + soThamChieu + '=namSanXuat=' + namSanXuat + '=mauSon=' + mauSon);
	
	var text = '<tr>';
	text = text + '<td class="text-center">' + (count + 1) + '</td>';
	text = text + '<td class="text-center">';
	//cac id la khac nhau, ten checkbox cung nhau
	text = text + '<input type="checkbox" id="cbVehicleRecord' + count + '" name="cbVehicleRecord" class="cbVehicleRecord"';
	text = text + 'onchange="changeValueTblDanhSachVehicleRecord(' + count + ')"/>';
	text = text + '&nbsp' + nhom;
	text = text + '</td>';
	text = text + '<td class="text-center">' + nhanHieu + '<br>' + soLoai + '</td>';
	text = text + '<td class="text-center">' + soKhung + '<br>' + soDongCo + '</td>';
	text = text + '<td class="text-center">' + tinhTrang + '<br>' + soThamChieu + '</td>';
	
	text = text + '<td class="text-center" hidden="true">';

	text = text + '<input type="text" hidden="true" id="idDsVehicleRecord' + count + '" name="idDsVehicleRecord" value="' + idVehicleRecord + '"/>';
	text = text + '<input type="text" hidden="true" id="nhomDsVehicleRecord' + count + '" name="nhomDsVehicleRecord" value="' + nhom + '"/>';
	text = text + '<input type="text" hidden="true" id="nhanHieuDsVehicleRecord' + count + '" name="nhanHieuDsVehicleRecord" value="' + nhanHieu + '"/>';
	text = text + '<input type="text" hidden="true" id="soLoaiDsVehicleRecord' + count + '" name="soLoaiDsVehicleRecord" value="' + soLoai + '"/>';
	text = text + '<input type="text" hidden="true" id="soKhungDsVehicleRecord' + count + '" name="soKhungDsVehicleRecord" value="' + soKhung + '"/>';
	text = text + '<input type="text" hidden="true" id="soDongCoDsVehicleRecord' + count + '" name="soDongCoDsVehicleRecord" value="' + soDongCo + '"/>';
	text = text + '<input type="text" hidden="true" id="tinhTrangDsVehicleRecord' + count + '" name="tinhTrangDsVehicleRecord" value="' + tinhTrang + '"/>';
	text = text + '<input type="text" hidden="true" id="soThamChieuDsVehicleRecord' + count + '" name="soThamChieuDsVehicleRecord" value="' + soThamChieu + '"/>';
	text = text + '<input type="text" hidden="true" id="namSanXuatDsVehicleRecord' + count + '" name="namSanXuatDsVehicleRecord" value="' + namSanXuat + '"/>';
	text = text + '<input type="text" hidden="true" id="mauSonDsVehicleRecord' + count + '" name="mauSonDsVehicleRecord" value="' + mauSon + '"/>';
	text = text + '</td>';
	text = text + '</tr>';
	text = text + '';
	return text;
}

/**ham chuc nang thuc hien chon all Danh sách PT ĐN KT :*/
function onChangeCheckAllTblDanhSachVehicleRecord() {
	//console.log('--START--checkAllTblDanhSachVehicleRecord');
	
	var giaTri = $("#checkAllTblDanhSachVehicleRecord").is(':checked') ? 1 : 0;
	if (giaTri === 1) {
		soXeDaChon=0;
		danhSachVehicleRecord = '';
		//console.log('checkAllTblDanhSachVehicleRecord === true');
		$('.cbVehicleRecord').each(function(index, element) { //loop through each checkbox. class="cbVehicleRecord"
			this.checked = true;//select all checkboxes with class "cbPXLphu"
			
			var idChecked = element.id;
			//console.log('=checkAllTblDanhSachVehicleRecord=idChecked=' + idChecked);
			
			var numBerIdChecked = idChecked.substring(15, idChecked.length);
			//console.log('=checkAllTblDanhSachVehicleRecord=numBerIdChecked=' + numBerIdChecked);
			//convert kieu so,
			var numBerIdChecked = parseInt(numBerIdChecked);
			
			//kiem tra xem id cua checkbox Vehicle Record tồn tại trong list chưa, nếu chưa thì  thêm mới, có rồi thì thôi
			var idDsVehicleRecord = $('#idDsVehicleRecord' + numBerIdChecked).val();
			var nhom = $('#nhomDsVehicleRecord' + numBerIdChecked).val();
			var nhanHieu = $('#nhanHieuDsVehicleRecord' + numBerIdChecked).val();
			var soLoai = $('#soLoaiDsVehicleRecord' + numBerIdChecked).val();
			var soKhung = $('#soKhungDsVehicleRecord' + numBerIdChecked).val();
			var soDongCo = $('#soDongCoDsVehicleRecord' + numBerIdChecked).val();
			var tinhTrang = $('#tinhTrangDsVehicleRecord' + numBerIdChecked).val();
			var soThamChieu = $('#soThamChieuDsVehicleRecord' + numBerIdChecked).val();
			var namSanXuat = $('#namSanXuatDsVehicleRecord' + numBerIdChecked).val();
			var mauSon = $('#mauSonDsVehicleRecord' + numBerIdChecked).val();
			
			//console.log('idDsVehicleRecord=' + idDsVehicleRecord +'=nhom=' + nhom + '=nhanHieu=' + nhanHieu + '=soLoai=' + soLoai + '=soKhung=' + soKhung + 
			//		'=soDongCo=' + soDongCo + '=tinhTrang=' + tinhTrang + '=soThamChieu=' + soThamChieu + '=namSanXuat=' + namSanXuat + '=mauSon=' + mauSon);
			
			var vehicleRecore = {
				row: numBerIdChecked, id: idDsVehicleRecord, nhom: nhom,
				nhanHieu: nhanHieu, soLoai: soLoai,
				soKhung: soKhung, soDongCo: soDongCo,
				tinhTrang: tinhTrang, soThamChieu: soThamChieu, namSanXuat: namSanXuat, mauSon: mauSon
			}
			//console.log(vehicleRecore);
			
			//add object index of last array if it not exist
			var added = false;
			$.map(bienBanVehicleRecord, function(elementOfArray, indexInArray) {
				if (elementOfArray.row == numBerIdChecked) {
					added = true;
				}
			});
			if (!added) {
				bienBanVehicleRecord.push(vehicleRecore);
			}
			danhSachVehicleRecord = danhSachVehicleRecord + idDsVehicleRecord + ', ';
			soXeDaChon++;
			//console.log('SIZE : bien Ban ? VehicleRecord=' + bienBanVehicleRecord.length);
		});
	} else if (giaTri === 0) {
		//console.log('checkAllTblDanhSachVehicleRecord === false');
		$('.cbVehicleRecord').each(function() { // loop through each checkbox
			this.checked = false;// deselect all checkboxes with class "checkbox1"
		});
		// remove all elemvent VehicleRecord in bienBanVehicleRecord
		bienBanVehicleRecord = [];
		danhSachVehicleRecord = '';
		soXeDaChon = 0;
	}
	$('#danhSachVehicleRecord').val(danhSachVehicleRecord);
	$('#soXeDaChon').html('Đã chọn: '+soXeDaChon);

}



/**su kien onchange cua bang danh sach vehicleRecore*/
function changeValueTblDanhSachVehicleRecord(idCheckBox) {
	//idChecbox type of number
	
	//console.log('idCheckBox=' + idCheckBox);
	
	var giaTri = $('#cbVehicleRecord' + idCheckBox).is(':checked');
	if (giaTri == true) {
		
		var idDsVehicleRecord = $('#idDsVehicleRecord' + idCheckBox).val();
		var nhom = $('#nhomDsVehicleRecord' + idCheckBox).val();
		var nhanHieu = $('#nhanHieuDsVehicleRecord' + idCheckBox).val();
		var soLoai = $('#soLoaiDsVehicleRecord' + idCheckBox).val();
		var soKhung = $('#soKhungDsVehicleRecord' + idCheckBox).val();
		var soDongCo = $('#soDongCoDsVehicleRecord' + idCheckBox).val();
		var tinhTrang = $('#tinhTrangDsVehicleRecord' + idCheckBox).val();
		var soThamChieu = $('#soThamChieuDsVehicleRecord' + idCheckBox).val();
		var namSanXuat = $('#namSanXuatDsVehicleRecord' + idCheckBox).val();
		var mauSon = $('#mauSonDsVehicleRecord' + idCheckBox).val();
		
		//console.log('idDsVehicleRecord=' + idDsVehicleRecord +'=nhom=' + nhom + '=nhanHieu=' + nhanHieu + '=soLoai=' + soLoai + '=soKhung=' + soKhung + 
		//		'=soDongCo=' + soDongCo + '=tinhTrang=' + tinhTrang + '=soThamChieu=' + soThamChieu + '=namSanXuat=' + namSanXuat + '=mauSon=' + mauSon);
		
		var vehicleRecore = {
			row: idCheckBox, id: idDsVehicleRecord, nhom: nhom,
			nhanHieu: nhanHieu, soLoai: soLoai,
			soKhung: soKhung, soDongCo: soDongCo,
			tinhTrang: tinhTrang, soThamChieu: soThamChieu, namSanXuat: namSanXuat, mauSon: mauSon
		};
		//console.log(vehicleRecore);
		
		//add object index of last array
		bienBanVehicleRecord.push(vehicleRecore);
		danhSachVehicleRecord=danhSachVehicleRecord+idDsVehicleRecord+', ';
		soXeDaChon++;
		//console.log('SIZE : bien Ban ? VehicleRecord=' + bienBanVehicleRecord.length);
		//console.log('changeValueSubmit==' + giaTri);
		
	} else if (giaTri == false) {
		
		var idDsVehicleRecord = $('#idDsVehicleRecord' + idCheckBox).val();
		var nhom = $('#nhomDsVehicleRecord' + idCheckBox).val();
		var nhanHieu = $('#nhanHieuDsVehicleRecord' + idCheckBox).val();
		var soLoai = $('#soLoaiDsVehicleRecord' + idCheckBox).val();
		var soKhung = $('#soKhungDsVehicleRecord' + idCheckBox).val();
		var soDongCo = $('#soDongCoDsVehicleRecord' + idCheckBox).val();
		var tinhTrang = $('#tinhTrangDsVehicleRecord' + idCheckBox).val();
		var soThamChieu = $('#soThamChieuDsVehicleRecord' + idCheckBox).val();
		var namSanXuat = $('#namSanXuatDsVehicleRecord' + idCheckBox).val();
		var mauSon = $('#mauSonDsVehicleRecord' + idCheckBox).val();
		
		//console.log('=idDsVehicleRecord=' + idDsVehicleRecord+ '=nhom=' + nhom + '=nhanHieu=' + nhanHieu + '=soLoai=' + soLoai + '=soKhung=' + soKhung +
		//		'=soDongCo=' + soDongCo + '=tinhTrang=' + tinhTrang + '=soThamChieu=' + soThamChieu + '=namSanXuat=' + namSanXuat + '=mauSon=' + mauSon);
		
		var vehicleRecore = {
			row: idCheckBox, id: idDsVehicleRecord, nhom: nhom,
			nhanHieu: nhanHieu, soLoai: soLoai,
			soKhung: soKhung, soDongCo: soDongCo,
			tinhTrang: tinhTrang, soThamChieu: soThamChieu, namSanXuat: namSanXuat, mauSon: mauSon
		};
		//console.log(vehicleRecore);
		//remove object, remove element at position x, use: someArray.splice(x,1);
		for (var i = 0; i < bienBanVehicleRecord.length; i++ ) {
			//console.log('vehicleRecore.row=' + vehicleRecore.row + "=bienBanVehicleRecord[i].row=" + bienBanVehicleRecord[i].row);
			if (vehicleRecore.row === bienBanVehicleRecord[i].row) {
				bienBanVehicleRecord.splice(i, 1);
				//console.log('remove sucessfull');
			}
		}
		
		danhSachVehicleRecord=danhSachVehicleRecord.replace(idDsVehicleRecord+', ','');
		soXeDaChon--;
		//console.log('SIZE : bien Ban ? VehicleRecord=' + bienBanVehicleRecord.length);
		//console.log('changeValueSubmit==' + giaTri);
	}
	
	$('#danhSachVehicleRecord').val(danhSachVehicleRecord);
	$('#soXeDaChon').html('Đã chọn: '+soXeDaChon);
	
	kiemTraTrangThaiCheckAllTblDanhSachVehicleRecord();
}

//II. Danh sách phương tiện kiểm tra : chon xe mẫu , checkED

//Kiem tra toan bo cac checkbox trong bang Danh sách PT ĐN KT (tblDanhSachVehicleRecord), neu check all, thi checked nhom, nguoc lai
function kiemTraTrangThaiCheckAllTblDanhSachVehicleRecord() {
	
	var kiemTra = true;
	
	$('.cbVehicleRecord').each(function() { //loop through each checkbox, class list checkbox
		var result = this.checked;
		if (result === true) {
			
		} else if (result === false) {
			//1 cai ko check thoat khoi vong lap
			kiemTra = false;
			return false;
		}
	});
	
	if (kiemTra === true) {
		$("#checkAllTblDanhSachVehicleRecord").prop("checked", true);//"none checked" = false, true = checked
	} else {
		$("#checkAllTblDanhSachVehicleRecord").prop("checked", false);//"none checked" = false, true = checked
	}
	
	//console.log(kiemTra);
	
}

//----------------------ham chuc nang thuc hien duoc phan cong, da doi chieu----------------------
//click button Lập biên bản Kiểm Tra thi thuc thi ham nay
function valBeforClickLapBienBanKiemTra() {
	
	if (bienBanVehicleRecord.length === 0) {
		alert("Đề nghị chọn phương tiện đăng kí để lập biên bản kiểm tra !");
		return false;
	}
	return true;
}


//2. KIỂM TRA CHẤT LƯỢNG AN TOÀN KỸ THUẬT VÀ BẢO VỆ MÔI TRƯỜNG
function createRowOfTblKiemTraChatLuongATKTVaBaoVeMoiTruong(stt, inspectionCommonStatus) {
	var sText = '<tr>';
	sText = sText + '<td class="text-center"><span id="">2.' + (stt + 1) +'</span></td>';
	sText = sText + '<td class="text-left paddingLeft05"><span id="">' + inspectionCommonStatus.groupname + '</span></td>';
	sText = sText + '<td class="text-left paddingLeft05"><span id="">' + inspectionCommonStatus.itemname + '</span></td>';
	sText = sText + '<td class="text-left paddingLeft05">';
	sText = sText + '<select id="selChatLuongAnToanKt' + stt + '" name="selChatLuongAnToanKt" class="form-control-find width100">';
	sText = sText + '<option value="1">Đạt</option>';
	sText = sText + '<option value="2">Không đạt</option>';
	sText = sText + '<option value="3">Nghi ngờ</option>';
	sText = sText + '<option value="4">Không áp dụng</option>';
	sText = sText + '</select>';
	sText = sText + '</td>';
	sText = sText + '</tr>';
	return sText;
}

//4. KIỂM TRA ĐỐI CHIẾU KẾT CẤU KHÍ THẢI
function createRowOfTblKiemTraDoiChieuKetCauKhiThai(stt, inspectionCommonStatus) {
	var sText = '<tr>';
	sText = sText + '<td class="text-center">4.' + (stt + 1) + '</td>';
	sText = sText + '<td class="text-left paddingLeft05">' + inspectionCommonStatus.groupname + '</td>';
	sText = sText + '<td class="text-left paddingLeft05"></td>';
	sText = sText + '<td class="text-left paddingLeft05"></td>';
	sText = sText + '<td class="text-left paddingLeft05">';
	sText = sText + '<select id="selKiemTraDoiChieuKhiThai' + stt + '" name="selKiemTraDoiChieuKhiThai" class="form-control-find width100">';
	sText = sText + '<option value="1">Phù hợp</option>';
	sText = sText + '<option value="2">Không phù hợp </option>';
	sText = sText + '<option value="3">Không áp dụng</option>';
	sText = sText + '</select>';
	sText = sText + '</td>';
	sText = sText + '</tr>';
	sText = sText + '';
	return sText;
}

//1. THÔNG TIN CHUNG
function createRowOftblThongTinChungRegisteredInspection(stt, inspectionCommonStatus) {
	var sText = '<tr>';
	sText = sText + '<td class="text-center"><span id="">1.' + (stt + 1) +'</span></td>';
	sText = sText + '<td class="text-left paddingLeft05"><span id="">' + inspectionCommonStatus.groupname + '</span></td>';
	sText = sText + '<td class="text-left paddingLeft05"><span id="">' + inspectionCommonStatus.itemname + '</span></td>';
	sText = sText + '<td class="text-left paddingLeft05"><div id="txtThongTinSuaDoi_'+stt+'">' + inspectionCommonStatus.itemname + '</div></td>';
	sText = sText + '<td class="text-left paddingLeft05">';
	sText = sText +  createOptionKetLuanThongTinChung(stt, inspectionCommonStatus);

	sText = sText + '<input type="hidden" id="gtTTC_itemcode_' + stt+ '" name="gtTTC_itemcode_' + stt + '" value="' + inspectionCommonStatus.itemcode +'" />';
	sText = sText + '<input type="hidden" id="gtTTC_itemname_' + stt+ '" name="gtTTC_itemname_' + stt + '" value="' + inspectionCommonStatus.itemname +'" />';
	sText = sText + '<input type="hidden" id="gtTTC_isDm_' + stt+ '" name="gtTTC_isDm_' + stt + '" value="' + inspectionCommonStatus.itemgroupid +'" />';

	sText = sText + '</td>';
	sText = sText + '</tr>';
	return sText;
}

function createOptionKetLuanThongTinChung(stt, inspectionCommonStatus){
	var sText="";
	if (inspectionCommonStatus.allowedit=='1'){
		sText = sText + '<select id="selKetLuanThongTinChung' + stt + '" name="selChatLuongAnToanKt" class="form-control-find width100" onchange="suaGiaTriNhapTTChung('+stt+')">';
		sText = sText + '<option value="1">Đạt</option>';
		sText = sText + '<option value="2">Sửa đổi</option>';
		sText = sText + '<option value="3">Không áp dụng</option>';
		sText = sText + '</select>';		
	}
	return sText;
}

function createRowOfTblXyLyKetQua(stt, inspectionCommonStatus) {
	var sText = '<tr>';
	sText = sText + '<td class="text-left paddingLeft05">' + inspectionCommonStatus.groupname +'</td>';
	sText = sText + '<td class="text-left paddingLeft05">';
	sText = sText + '<select id="selXuLyKetQua' + stt + '" name="selXuLyKetQua" class="form-control-find width100">';
	sText = sText + '<option value="1">Cấp thông báo miễn</option>';
	sText = sText + '<option value="2">Cấp giấy chứng nhận</option>';
	sText = sText + '<option value="3">Cấp thông báo không đạt</option>';
	sText = sText + '<option value="4">Cấp thông báo xác nhận tình trạng</option>';
	sText = sText + '<option value="0">Không kết luận</option>';
	sText = sText + '</select>';
	sText = sText + '</td>';
	sText = sText + '</tr>';
	sText = sText + '';
	return sText;
}

/**Tao dong moi trong bang KIỂM TRA ĐỐI CHIẾU KẾT CẤU VÀ THÔNG SỐ KỸ THUẬT CỦA XE */
function createRowOfTblKiemTraDoiChieuKetCauVaThongSoKtXe(stt, vehicleSpecification) {
	var id = vehicleSpecification.id;
	var specificationName = vehicleSpecification.specificationName;
	var specificationcode = vehicleSpecification.specificationCode;
	var specificationValue = vehicleSpecification.specificationValue;
	var specificationHienThi = vehicleSpecification.hienThiSpecificationValue;
	//rgb(91, 220, 231) la chua dua ra quyet dinh
	
	var sText = '<tr style="background-color: white !important;" id="trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt + '" class="trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt + '">';
	//hidde
	sText = sText + '<td class="text-center" hidden="true">';
	sText = sText + '<input type="text" id="idVehicleSpecificationTblKiemTraChatLuong' + stt + '" name="idVehicleSpecificationTblKiemTraChatLuong" value="' + id + '" />';
	sText = sText + '<input type="text" id="specificationcode' + stt + '" name="specificationcode" value="' + specificationcode +'" />';
	sText = sText + '<input type="text" id="specificationname' + stt + '" name="specificationname" value="' + specificationName +'" />';
	sText = sText + '';
	sText = sText + '</td>';
	
	//sText = sText + '<td class="text-center white" id="sSttTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt + '">' + (stt + 1) + '</td>';
	sText = sText + '<td class="text-center"><span class="black" id="sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt + '">' + specificationcode +'</span></td>';
	sText = sText + '<td class="text-center"><span class="black" id="sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt + '">' + specificationName + '</span></td>';
	
	sText = sText + '<td class="text-center">';
	sText = sText + '<input type="text" class="textNone textBound form-control-find black giaTriDangKi' + stt + '" id="giaTriDangKi_' + stt + '" name="giaTriDangKi" value="' + specificationHienThi + '" readonly="readonly" onclick="onClickGiaTriDangKi(' + stt + ')" style="background-color: white !important;"/>';
	sText = sText + '<input type="hidden" class="textNone textBound form-control-find black giaTriDangKi' + stt + '" id="giaTriDangKi' + stt + '" name="giaTriDangKi" value="' + specificationValue + '" readonly="readonly" onclick="onClickGiaTriDangKi(' + stt + ')" style="background-color: white !important;"/>';
	sText = sText + '</td>';
	
	sText = sText + '<td class="text-center">';
	sText = sText + '<input type="text" class="textNone textBound form-control-find black giaTriKiemTra' + stt + '" id="giaTriKiemTra_' + stt + '" name="giaTriKiemTra" value="' + specificationHienThi + '" readonly="readonly" style="background-color: white !important;"/>';
	sText = sText + '<input type="hidden" class="textNone textBound form-control-find black giaTriKiemTra' + stt + '" id="giaTriKiemTra' + stt + '" name="giaTriKiemTra" value="' + specificationValue + '" readonly="readonly" style="background-color: white !important;"/>';
	sText = sText + '</td>';
	
	sText = sText + '<td class="text-center">';
	sText = sText + '<select id="selLuaChonKetQua' + stt + '" name="selLuaChonKetQua" ';
	sText = sText + 'class="form-control-find width100 black selectLuaChonKetQua"';
	sText = sText + 'style="height: 30px; background-color: white !important;"';
	sText = sText + 'onchange="onChangeSelLuaChonKetQua(' + stt + ')">';
	sText = sText + '<option value="0">Chưa quyết định</option>';
	sText = sText + '<option value="1" selected="selected">Đạt</option>';
	sText = sText + '<option value="2">Không đạt</option>';
	sText = sText + '<option value="3">Sửa đổi</option>';
	sText = sText + '<option value="4">Không áp dụng</option>';
	sText = sText + '</select>';
	sText = sText + '</td>';
	sText = sText + '';
	sText = sText + '</tr>';
	return sText;
}

/**
 * ham thuc hien chuc nang Ấn 1 lần vào cell Giá trị đăng ký thì kết quả chuyển thành Đạt, ấn 1 lần nữa thì kết quả chuyển thành Chưa quyết định
 * */
function onClickGiaTriDangKi(stt) {
	var code = $('select#selLuaChonKetQua' + stt).val();
	if (code === '0') {
		//console.log(stt + 'Trang thai (0) Chua dua ra quyet dinh chuyen ve --> (1) Dat - copy (1) vao (2) khong sua--' + ('giaTriDangKi=' + $('#giaTriDangKi' + stt).val()) + ('GiaTriKiemTra=' + $('#giaTriKiemTra' + stt).val()));
		
		$('#giaTriKiemTra' + stt).val($('#giaTriDangKi' + stt).val());
		
		$('#trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'background-color: white !important');
		$('#selLuaChonKetQua' + stt).attr('style', 'background-color: white !important; color: black !important');
		//chinh font chu
		$('#sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		$('#sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		
		$('#giaTriDangKi' + stt).attr('style', 'background-color: white !important; color: black !important');
		$('#giaTriKiemTra' + stt).attr('style', 'background-color: white !important; color: black !important');
		
		//selected option ve dat
		$('select#selLuaChonKetQua' + stt).val('1');
	} else if (code == '1') {
		//console.log(stt + 'Trang thai (1) Dat chuyen ve --> (0) Chua dua ra quyet dinh - (2) de chong, khong nhap, khong lam j' + ('giaTriDangKi=' + $('#giaTriDangKi' + stt).val()) + ('GiaTriKiemTra=' + $('#giaTriKiemTra' + stt).val()));
		
		//remove class="textNone", readOnly = false
		$('#giaTriKiemTra' + stt).val('');
		$('#giaTriKiemTra' + stt).addClass("textNone");
		$('#giaTriKiemTra' + stt).prop('readonly', true);
		
		//class of element
		$('#trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'background-color: rgb(91, 220, 231) !important');
		$('#selLuaChonKetQua' + stt).attr('style', 'background-color: rgb(91, 220, 231) !important; color: black !important');
		
		//chinh font chu
		$('#sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		$('#sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		
		$('#giaTriDangKi' + stt).attr('style', 'background-color: rgb(91, 220, 231) !important; color: black !important');
		$('#giaTriKiemTra' + stt).attr('style', 'background-color: rgb(91, 220, 231) !important; color: black !important');
		
		//selected option ve khong dat
		$('select#selLuaChonKetQua' + stt).val('0');
	}
	
	caculatoTongSoKetQua();
}

//var divTgSoKqLast = '';
//var firstSelect = '0';
//0 la lan lua chon dau tien, 1 la lan sua chon sau do
/**Su kien thay doi change TblDanhSachPhuongTienKiemTra*/
//ham chuc nang lua chon EvaluationResult (Dat, Sua doi, Khong dat, Khong ap dung, Chua dua ra quyet dinh)


function onChangeSelLuaChonKetQua(stt) {
	
	//$('#selLuaChonKetQua' + stt).on('change', function() {
	var code = $('select#selLuaChonKetQua' + stt).val();
	//console.log("==onChangeSelLuaChonKetQua==" + stt + "=code=" + code);
	
	if (code === '0') {
		//console.log(stt + '(0) Chua dua ra quyet dinh - (2) de chong, khong nhap, khong lam j' + ('giaTriDangKi=' + $('#giaTriDangKi' + stt).val()) + ('GiaTriKiemTra=' + $('#giaTriKiemTra' + stt).val()));
		
		$('#giaTriKiemTra' + stt).val('');
		$('#giaTriKiemTra' + stt).addClass("textNone");
		$('#giaTriKiemTra' + stt).prop('readonly', true);
		
		//class of element
		$('#trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'background-color: rgb(91, 220, 231) !important');
		$('#selLuaChonKetQua' + stt).attr('style', 'background-color: rgb(91, 220, 231) !important; color: black !important');
		
		//chinh font chu
		$('#sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		$('#sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		
		$('#giaTriDangKi_' + stt).attr('style', 'background-color: rgb(91, 220, 231) !important; color: black !important');
		$('#giaTriKiemTra_' + stt).attr('style', 'background-color: rgb(91, 220, 231) !important; color: black !important');
		
	} else if (code === '1') {
		//console.log(stt + '(1) Dat - copy (1) vao (2) khong sua' + 'gia tri dang ki:' + ($('#giaTriDangKi' + stt).val()) + 'gia tri kiem tra:' + ($('#giaTriKiemTra' + stt).val()));
		
		//gia tri dang ki, gia tri kiem tra
		$('#giaTriKiemTra' + stt).val($('#giaTriDangKi' + stt).val());
		$('#giaTriKiemTra_' + stt).attr('value',$('#giaTriDangKi_' + stt).val());
		
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
	} else if (code === '2') {
		//console.log(stt + '(2) Ko Dat - text box, nhap chu~' + ('giaTriDangKi=' + $('#giaTriDangKi' + stt).val()) + ('GiaTriKiemTra=' + $('#giaTriKiemTra' + stt).val()));
		
		//remove class="textNone", readOnly = false
		$('#giaTriKiemTra' + stt).removeClass("textNone");
		$('#giaTriKiemTra' + stt).val('');
		$('#giaTriKiemTra' + stt).prop('readonly', false);
		
		//$('.trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).css('background-color', 'rgb(237, 108, 108) !important;');
		$('#trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'background-color: rgb(237, 108, 108) !important');
		$('#selLuaChonKetQua' + stt).attr('style', 'background-color: rgb(237, 108, 108) !important; color: black !important');
	
		//chinh font chu
		$('#sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		$('#sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		
		$('#giaTriDangKi' + stt).attr('style', 'background-color: rgb(237, 108, 108) !important; color: black !important');
		$('#giaTriKiemTra' + stt).attr('style', 'background-color: rgb(237, 108, 108) !important; color: black !important');
	} else if (code === '3') {
		//console.log(stt + '(3) Sua doi - copy (1) -> (2) sua tren text box' + ('giaTriDangKi=' + $('#giaTriDangKi' + stt).val()) + ('GiaTriKiemTra=' + $('#giaTriKiemTra' + stt).val()));
		
		//remove class="textNone"
		$('#giaTriKiemTra' + stt).removeClass("textNone");
		$('#giaTriKiemTra' + stt).prop('readonly', false);
		$('#giaTriKiemTra' + stt).val($('#giaTriDangKi' + stt).val());
		$('#giaTriKiemTra_' + stt).attr('value',$('#giaTriDangKi_' + stt).val());
		$('#giaTriKiemTra' + stt).on("click", suaGiaTriNhap($('#specificationname' + stt).val(),$('#giaTriDangKi' + stt).val(),stt,'THONGTINCHUNG', ''));
		
		//$('.trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).css('background-color', 'rgb(245, 245, 107) !important;');
		$('#trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'background-color: rgb(245, 245, 107) !important');
		$('#selLuaChonKetQua' + stt).attr('style', 'background-color: rgb(245, 245, 107) !important; color: black !important');
		
		//chinh font chu
		$('#sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		$('#sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		
		$('#giaTriDangKi_' + stt).attr('style', 'background-color: rgb(245, 245, 107) !important; color: black !important');
		$('#giaTriKiemTra_' + stt).attr('style', 'background-color: rgb(245, 245, 107) !important; color: black !important');
	} else if (code === '4') {
		//console.log(stt + '(0) Khong ap dung (2) de chong, khong ap dung ' + 'gia tri dang ki:' + ($('#giaTriDangKi' + stt).val()) + 'gia tri kiem tra:' + ($('#giaTriKiemTra' + stt).val()));
		
		$('#giaTriKiemTra' + stt).val('');
		$('#giaTriKiemTra' + stt).addClass("textNone");
		$('#giaTriKiemTra' + stt).prop('readonly', true);
		
		//$('.trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).css('background-color', 'rgb(42, 203, 42) !important;');
		$('#trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'background-color: rgb(42, 203, 42) !important');
		$('#selLuaChonKetQua' + stt).attr('style', 'background-color: rgb(42, 203, 42) !important; color: black !important');
		
		
		//chinh font chu
		$('#sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		$('#sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		
		$('#giaTriDangKi_' + stt).attr('style', 'background-color: rgb(42, 203, 42) !important; color: black !important');
		$('#giaTriKiemTra_' + stt).attr('style', 'background-color: rgb(42, 203, 42) !important; color: black !important');
	}
	
	//for all tag. phan tinh toan cac gia tri tong ket
	caculatoTongSoKetQua();
}


function onChangeSelLuaChonThongTinChung(stt, commonCode) {
	
	//$('#selLuaChonKetQua' + stt).on('change', function() {
	var code = $('select#selLuaChonTTC' + stt).val();
	//console.log("==onChange selLuaChonTTC==" + stt + "=code=" + code);
	//console.log('==InspectionCommonStatus==commonCode==' + commonCode);
	
	if (code === '0') {
		//Chưa quyết định
		
		$('#giaTriKiemTraTTC' + stt).attr('value','');
		$('#giaTriKiemTraTTC' + stt).val('');
		$('#giaTriCodeTTC_SuaDoi' + commonCode).val('');
		$('#giaTriKiemTraTTC' + stt).addClass("textNone");
		$('#giaTriKiemTraTTC' + stt).prop('readonly', true);
		$('#giaTriCodeTTC' + stt).val('');
		
		//class of element
		$('#trtblThongTinChung' + stt).attr('style', 'background-color: rgb(91, 220, 231) !important');
		$('#selLuaChonTTC' + stt).attr('style', 'background-color: rgb(91, 220, 231) !important; color: black !important');
		
		//hidden input neu la ds xe mau
		if((document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_21")) || (document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_22")) ||
			(document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_23")) || (document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_24")) ||
			(document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_25")) || (document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_26"))) {
			
			$('#giaTriDangKiTTC' + stt).attr('style', 'display: none !important');
			$('#giaTriKiemTraTTC' + stt).attr('style', 'display: none !important');
		} else {
			$('#giaTriDangKiTTC' + stt).attr('style', 'background-color: rgb(91, 220, 231) !important; color: black !important');
			$('#giaTriKiemTraTTC' + stt).attr('style', 'background-color: rgb(91, 220, 231) !important; color: black !important');
		}
		
	} else if (code === '1') {
		// Đạt 
		//gia tri dang ki, gia tri kiem tra
		$('#giaTriKiemTraTTC' + stt).attr('value',$('#giaTriDangKiTTC' + stt).val());
		$('#giaTriKiemTraTTC' + stt).val($('#giaTriDangKiTTC' + stt).val());
		$('#giaTriCodeTTC_SuaDoi' + commonCode).val($('#giaTriDangKyCodeTTC' + stt).val());
		$('#giaTriCodeTTC' + stt).val($('#giaTriDangKyCodeTTC' + stt).val());
		
		$('#trtblThongTinChung' + stt).attr('style', 'background-color: white !important');
		$('#selLuaChonTTC' + stt).attr('style', 'background-color: white !important; color: black !important');
		
		//hidden input neu la ds xe mau
		if((document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_21")) ||
				(document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_22")) ||
				(document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_23")) ||
				(document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_24")) ||
				(document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_25")) ||
				(document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_26"))){
			
			$('#giaTriDangKiTTC' + stt).attr('style', 'display: none !important');
			$('#giaTriKiemTraTTC' + stt).attr('style', 'display: none !important');
		} else {
			$('#giaTriDangKiTTC' + stt).attr('style', 'background-color: white !important; color: black !important');
			$('#giaTriKiemTraTTC' + stt).attr('style', 'background-color: white !important; color: black !important');
		}
		
	} else if (code === '2') {
		// Không đạt 
		//remove class="textNone", readOnly = false
		$('#giaTriKiemTraTTC' + stt).attr('value',$('#giaTriDangKiTTC' + stt).val());
		$('#giaTriKiemTraTTC' + stt).val($('#giaTriDangKiTTC' + stt).val());
		$('#giaTriCodeTTC_SuaDoi' + commonCode).val($('#giaTriDangKyCodeTTC' + stt).val());
		
		$('#giaTriKiemTraTTC' + stt).prop('readonly', false);
		$('#giaTriKiemTraTTC' + stt).on("click", suaGiaTriNhap($('#giaTriDmTTC' + stt).val(), $('#giaTriCodeTTC' + stt).val(), stt, '1', commonCode));
		
		$('#trtblThongTinChung' + stt).attr('style', 'background-color: rgb(237, 108, 108) !important');
		$('#selLuaChonTTC' + stt).attr('style', 'background-color: rgb(237, 108, 108) !important; color: black !important');
	
		//chinh font chu
		$('#sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		$('#sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		
		$('#giaTriDangKiTTC' + stt).attr('style', 'background-color: rgb(237, 108, 108) !important; color: black !important');
		$('#giaTriKiemTraTTC' + stt).attr('style', 'background-color: rgb(237, 108, 108) !important; color: black !important');
	} else if (code === '3') {
		// Sửa đổi 
		//remove class="textNone"
		$('#giaTriKiemTraTTC' + stt).prop('readonly', true);
		//$('#giaTriKiemTraTTC' + stt).val($('#giaTriDangKiTTC' + stt).val());
		//$('#giaTriCodeTTC_SuaDoi' + commonCode).val($('#giaTriDangKyCodeTTC' + stt).val());
		$('#giaTriKiemTraTTC' + stt).on("click", suaGiaTriNhap($('#giaTriDmTTC' + stt).val(), $('#giaTriCodeTTC' + stt).val(), stt, '1', commonCode));
		
		//$('.trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).css('background-color', 'rgb(245, 245, 107) !important;');
		$('#trtblThongTinChung' + stt).attr('style', 'background-color: rgb(245, 245, 107) !important');
		$('#selLuaChonTTC' + stt).attr('style', 'background-color: rgb(245, 245, 107) !important; color: black !important');
		
		$('#giaTriDangKiTTC' + stt).attr('style', 'background-color: rgb(245, 245, 107) !important; color: black !important');
		$('#giaTriKiemTraTTC' + stt).attr('style', 'background-color: rgb(245, 245, 107) !important; color: black !important');
	} else if (code === '4') {
		
		//console.log(stt + '(0) Khong ap dung (2) de chong, khong ap dung ' + 'gia tri dang ki:' + ($('#giaTriDangKi' + stt).val()) + 'gia tri kiem tra:' + ($('#giaTriKiemTra' + stt).val()));
		
		$('#giaTriKiemTraTTC' + stt).attr('value','');
		$('#giaTriKiemTraTTC' + stt).val('');
		$('#giaTriCodeTTC_SuaDoi' + commonCode).val('');
		
		$('#giaTriKiemTraTTC' + stt).addClass("textNone");
		$('#giaTriKiemTraTTC' + stt).prop('readonly', true);
		
		$('#giaTriCodeTTC' + stt).val('');
		
		//$('.trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).css('background-color', 'rgb(42, 203, 42) !important;');
		$('#trtblThongTinChung' + stt).attr('style', 'background-color: rgb(42, 203, 42) !important');
		$('#selLuaChonTTC' + stt).attr('style', 'background-color: rgb(42, 203, 42) !important; color: black !important');
		
		//hidden input neu la ds xe mau
		if((document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_21")) ||
				(document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_22")) ||
				(document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_23")) ||
				(document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_24")) ||
				(document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_25")) ||
				(document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_26"))){
			
			$('#giaTriDangKiTTC' + stt).attr('style', 'display: none !important');
			$('#giaTriKiemTraTTC' + stt).attr('style', 'display: none !important');
		} else {
			$('#giaTriDangKiTTC' + stt).attr('style', 'background-color: rgb(42, 203, 42) !important; color: black !important');
			$('#giaTriKiemTraTTC' + stt).attr('style', 'background-color: rgb(42, 203, 42) !important; color: black !important');
		}
		
	}
	
	//for all tag. phan tinh toan cac gia tri tong ket
}





//ham chuc nang thuc hien tinh toan tong so ket qua, bn kq Dat, bn kq Khong dat, bn Sua doi, bn khong ap dung, bn chua dua ra quyet dinh
function caculatoTongSoKetQua() {
	/**
	 * Tổng số kết quả: 0  Đạt      0  Không đạt 0  Sửa đổi 0   Không áp dụng 14  Chưa đưa ra quyết định
	 * */
	var numberDat = 0;
	var numberKhongDat = 0;
	var numberSuaDoi = 0;
	var numberKhongApDung = 0;
	var numberChuaDuaRaQuyetDinh = 0;
	$('.selectLuaChonKetQua').each(function(index, element) {//all tag select with class="selectLuaChonKetQua"
		//console.log(index);
		//console.log(($(element)).val());
		var valElement = ($(element)).val();
		
		if (valElement === '0') {
			numberChuaDuaRaQuyetDinh = numberChuaDuaRaQuyetDinh + 1;
		} else if (valElement === '1') {//Dat
			numberDat = numberDat + 1;
		} else if (valElement === '2') {//Khong dat
			numberKhongDat = numberKhongDat + 1;
		} else if (valElement === '3') {//Sua doi
			numberSuaDoi = numberSuaDoi + 1;
		} else if (valElement === '4') {//Khong ap dung
			numberKhongApDung = numberKhongApDung + 1;
		}
		
		
		$('#divTgsoKqDat').text(numberDat);
		$('#divTgsoKqKhongDat').text(numberKhongDat);
		$('#divTgsoKqSuaDoi').text(numberSuaDoi);
		$('#divTgsoKqKhongApDung').text(numberKhongApDung);
		$('#divTgsoKqChuaDuaRaQuyetDinh').text(numberChuaDuaRaQuyetDinh);
	});
	/**
	* Thông báo kết quả :1:Đạt, 2:Không đạt, 3:Chưa kết luận
	* showThongBaoKetQua, thongBaoKetQua
	* */
	if (numberKhongDat > 0) {
		$('#showThongBaoKetQua').val('Không đạt');
		$('#thongBaoKetQua').val('2');
	} else if (numberChuaDuaRaQuyetDinh > 0) {
		$('#showThongBaoKetQua').val('Chưa kết luận');
		$('#thongBaoKetQua').val('3');
	} else {
		$('#showThongBaoKetQua').val('Đạt');
		$('#thongBaoKetQua').val('1');
	}
}


function creatTblThongTinChungRegisteredInspection(registeredInspection, vehicleGroup, productionCountry, customsDeclaration) {
	//
	//var nguoiNhapKhau = registeredInspection.importercode + ' ' + registeredInspection.importername;
	//var diaChi = registeredInspection.importeraddress;
	//var nguoiDaiDien = registeredInspection.representative;
	//var soDienThoai = registeredInspection.phone;
	//var thuDienTu = registeredInspection.email;
	
	var soThamChieu = vehicleGroup.referenceCertificateNo;
	$('#spanSoThamChieu').text(soThamChieu);
	
	var soBcThuNghiemAnToan = vehicleGroup.safetyTestReportId;
	$('#spanSoBcThuNghiemAnToan').text(soBcThuNghiemAnToan);
	
	var soBcThuNghiemKhiThai = vehicleGroup.emissionTestReportId;
	$('#').text();
	
	var soBcCOP = vehicleGroup.copReportId;
	$('#spanSoBcCOP').text(soBcCOP);
	
	var loaiPhuongTien = vehicleGroup.vehicleType;
	$('#spanLoaiPhuongTien').text(loaiPhuongTien);
	
	var nhanHieu = vehicleGroup.tradeMark;
	$('#spanNhanHieu').text(nhanHieu);
	
	var tenThuongMai = vehicleGroup.commercialName;
	$('#spanTenThuongMai').text(tenThuongMai);
	
	var maKieuLoai = vehicleGroup.modelCode;
	$('#spanMaKieuLoai').text(maKieuLoai);
	
	var nuocSanXuat = productionCountry.countryCode;
	$('#spanNuocSanXuat').text(nuocSanXuat);
	
	var nhaMaySanXuat = vehicleGroup.productionplant;
	$('#spanNhaMaySanXuat').text(nhaMaySanXuat);
	
	var diaChiNhaMaySx = vehicleGroup.addressOfProductionplant;
	$('#spanDiaChiNhaMaySx').text(diaChiNhaMaySx);
	
	var tenTieuChuanKhiThai = vehicleGroup.emissionStandard;
	$('#spanTenTieuChuanKhiThai').text(tenTieuChuanKhiThai);
	
	//var soDangKiKiemTra = registeredInspection.registeredNumber;
	
	var soToKhaiHhnk = customsDeclaration.importCustomDeclareNo;
	$('#spanSoToKhaiHhnk').text(soToKhaiHhnk);
	
	var ngayToKhaiHhnk = customsDeclaration.importCustomdeclareDate;
	$('#spanNgayToKhaiHhnk').text(ngayToKhaiHhnk);
	
	var soVin = '';
	$('#spanSoVin').text(soVin);
	
	var soKhung = '';
	$('#spanSoKhung').text(soKhung);
	
	var soDongCo = '';
	$('#spanSoDongCo').text(soDongCo);
	
	var tinhTrangPhuongTien = '';
	$('#spanTinhTrangPhuongTien').text(tinhTrangPhuongTien);
}


//hanh dong bo chon, remove tr o dong bo chon
function clearOneRowTblDanhSachPhuongTienKiemTra(rowIndex) {
	var status = confirm('Bạn có muốn bỏ chọn ?');
	if (status === true) { 
		var danhSachVehicleRecord = $('#danhSachVehicleRecord').val();
		var danhSachVehicleRecordBoChon = $('#danhSachVehicleRecordBoChon').val();
		var idVehicleRecordRemove = $('#idVehicleRecordMau' + rowIndex).val();
		
		//hiddenRowTableByClassRow
		var id = '.rowTblDanhSachPhuongTienKiemTra' + rowIndex;
		//$('#rowTblDanhSachPhuongTienKiemTra' + rowIndex).remove();
		$(id).remove();
		//disable cac gia input da hidden, va remove obj vehicleRecord trong danh sach
		//disable gia tri input name="idVehicleRecordDanhSachPhuongTienKiemTra"
		$('#idVehicleRecordDanhSachPhuongTienKiemTra' + rowIndex).prop('disabled', true);
		var soLgPtDnkt = $('#soLgPtDnkt').text();
		var intsoLgPtDnkt = parseInt(soLgPtDnkt);
		$('#soLgPtDnkt').text(intsoLgPtDnkt - 1);
		
		// xoa id vehicle
		//console.log('danhSachVehicleRecord==='+danhSachVehicleRecord);
		//console.log('idVehicleRecordRemove==='+idVehicleRecordRemove);
		danhSachVehicleRecordBoChon = danhSachVehicleRecordBoChon + idVehicleRecordRemove + ",";
		danhSachVehicleRecord=danhSachVehicleRecord.replace(idVehicleRecordRemove+',','');
		
		//console.log('==end======danhSachVehicleRecord==='+danhSachVehicleRecord);

		
		$('#danhSachVehicleRecord').val(danhSachVehicleRecord);
		$('#danhSachVehicleRecordBoChon').val(danhSachVehicleRecordBoChon);
		//console.log('==end=1=====danhSachVehicleRecord==='+ $('#danhSachVehicleRecord').val());

	}
}

function onChangeRequiredGhiChuGcc() {
	var selXuLyKetQua = $('select#selXuLyKetQua').val();
	if (selXuLyKetQua === '1' || selXuLyKetQua === '0') {
		$('#spanGhiChuInVaoGcc').text('');
	} else {
		$('#spanGhiChuInVaoGcc').text('');
	}
}

//validator du lieu truoc khi submit
function validatorBeforDataLapBienBanKiemTra() {
	
	if (($('#ngayKiemTraTuNgay').val().length) === 0) {
		$('#ngayKiemTraTuNgay').focus();
		alert("Đề nghị nhập ngày kiểm tra thực tế Từ Ngày !");
		return false;
	}
	
	if (($('#ngayKiemTraDenNgay').val().length) === 0) {
		$('#ngayKiemTraDenNgay').focus();
		alert("Đề nghị nhập ngày kiểm tra thực tế Đến Ngày !");
		return false;
	}
	
	var phuongThucKiemTra = $('select#chonPhuongThucKT').val();
	if (phuongThucKiemTra === '-1') {
		$('select#chonPhuongThucKT').focus();
		alert("Đề nghị chọn Phương thức kiểm tra !");
		return false;
	}

	/* format date trong javascript nguoc voi format date trong input date */
	/*new Date(year, month, day, hour, minute)*/
	
	var arr_ngayKiemTraTuNgayDate = $('#ngayKiemTraTuNgay').val().substring(0, 10).split("/");
	var arr_ngayKiemTraTuNgayTime = $('#ngayKiemTraTuNgay').val().substring(11, $('#ngayKiemTraTuNgay').val().length).split(":");
	var js_ngayKiemTraTuNgay = new Date(arr_ngayKiemTraTuNgayDate[2], arr_ngayKiemTraTuNgayDate[1]-1, arr_ngayKiemTraTuNgayDate[0], arr_ngayKiemTraTuNgayTime[0], arr_ngayKiemTraTuNgayTime[1]);
	var js_ngayKiemTraTuNgayDate = new Date(arr_ngayKiemTraTuNgayDate[2], arr_ngayKiemTraTuNgayDate[1]-1, arr_ngayKiemTraTuNgayDate[0]);
	
	var arr_ngayKiemTraDenNgayDate = $('#ngayKiemTraDenNgay').val().substring(0, 10).split("/");
	var arr_ngayKiemTraDenNgayTime = $('#ngayKiemTraDenNgay').val().substring(11, $('#ngayKiemTraDenNgay').val().length).split(":");
	var js_ngayKiemTraDenNgay = new Date(arr_ngayKiemTraDenNgayDate[2], arr_ngayKiemTraDenNgayDate[1]-1, arr_ngayKiemTraDenNgayDate[0], arr_ngayKiemTraDenNgayTime[0], arr_ngayKiemTraDenNgayTime[1]);
	var js_ngayKiemTraDenNgayDate = new Date(arr_ngayKiemTraDenNgayDate[2], arr_ngayKiemTraDenNgayDate[1]-1, arr_ngayKiemTraDenNgayDate[0]);
	
	if (js_ngayKiemTraDenNgay < js_ngayKiemTraTuNgay) {
		$('#ngayKiemTraTuNgay').focus();
		alert("Ngày kiểm tra thực tế Đến ngày không được nhỏ hơn Từ ngày !");
		return false;
	}
	
	if (js_ngayKiemTraTuNgayDate > new Date()) {
		$('#ngayKiemTraTuNgay').focus();
		alert("Ngày kiểm tra thực tế Từ ngày không được lớn hơn ngày hiện tại!");
		return false;
	}
	
	if (js_ngayKiemTraDenNgayDate > new Date()) {
		$('#ngayKiemTraDenNgay').focus();
		alert("Ngày kiểm tra thực tế Đến ngày không được lớn hơn ngày hiện tại!");
		return false;
	}

	var soLuongXeBBKT = document.getElementById('soLgPtDnkt').textContent;

	//console.log('==selChonPhuongThucKT===' + phuongThucKiemTra + '----soLuongXeBBKT---' + soLuongXeBBKT);
	if (phuongThucKiemTra === '3' && soLuongXeBBKT > 1) {
		$('select#chonPhuongThucKT').focus();
		alert("Phương thức kiểm tra từng chiếc chỉ cho 1 phương tiện trong biên bản !");
		return false;
	}
	
	if (soLuongXeBBKT < 1) {
		alert("Chưa có phương tiện trong Biên bản kiểm tra !");
		return false;
	}
	
	// var startDateObj = $('#ngayKiemTraTuNgay').val();
	//var startDate;
	//var result = false;
	
	//case when end date is blank, no validation required then
	//if (val == "") { return true; }
	
	//if (startDateObj) {
		//startDate = new Date(Date.parse(startDateObj.value));
		//var parts = startDateObj.value.split("/");
		//var startDate = new Date(parseInt(parts[2], 10), parseInt(parts[1], 10), parseInt(parts[0], 10));
	//} else {
		//result = false;
	//}
	//var endDate = new Date(Date.parse(val));
	//var endDateparts = val.split("/");
	//var endDate = new Date(parseInt(endDateparts[2], 10), parseInt(endDateparts[1], 10), parseInt(endDateparts[0], 10));
	
	//result = endDate.getTime() >= startDate.getTime();
	//return result;
	
	//validate ngay bat dau < ngay ket thuc
	
	//if (($('#yKienDangKiemVien').val().length) === 0) {
	//	alert("Đề nghị nhập ý kiến đăng kiểm viên !");
	//	return false;
	//}
	
	
	var selXuLyKetQua = $('select#selXuLyKetQua').val();
	if (selXuLyKetQua === '1' || selXuLyKetQua === '0') {
		//nếu đề xuất là GCN thì ko cần nhập vào chứng chỉ
	} else {
		//chỉ có tb ko đạt, vi phạm,... thì mới bắt buộc phải nhập
//		if (($('#ghiChuInVaoGiayChungChi').val().length) === 0) {
//			if (selXuLyKetQua === '2') {
//				alert("Đề nghị nhập Ghi chú in vào giấy chứng chỉ do  XỬ LÝ KẾT QUẢ Đề xuất: Cấp thông báo miễn !");
//			} else if (selXuLyKetQua === '3') {
//				alert("Đề nghị nhập Ghi chú in vào giấy chứng chỉ do  XỬ LÝ KẾT QUẢ Đề xuất: Cấp thông báo không đạt !");
//			} else if (selXuLyKetQua === '4') {
//				alert("Đề nghị nhập Ghi chú in vào giấy chứng chỉ do  XỬ LÝ KẾT QUẢ Đề xuất: Cấp thông báo xác nhận tình trạng !");
//			} else if (selXuLyKetQua === '5') {
//				alert("Đề nghị nhập Ghi chú in vào giấy chứng chỉ do  XỬ LÝ KẾT QUẢ Đề xuất: Cấp thông báo vi phạm !");
//			}
//			return false;
//		}
	}
	
	//validator file
	var invalidFile = false;
	var invalidFileMsg = "";
	$('input.validatorOtherFile').each(function () {
		var maxFile = maxOtherFileSize;
		if($(this).val().length != 0 && maxFile > 0 && this.files[0].size > maxFile) {
			invalidFile = true;
			invalidFileMsg += "File " + this.files[0].name + " quá dung lượng cho phép là " + maxFile/1024/1024 + "MB \n";
		}
	})
	
	if(invalidFile) {
		alert(invalidFileMsg);
		return false;
	}
	
	return true;
}

//button thuc thi nut huy kiem tra o? man hinh Lap bien ban kiem tra. clear cac thong so da nhap o man hinh Lap bien ban kiem tra
function btnHuyKiemTraLapBienBanKiemTra() {
	//console.log('');
	//console.log('=START =btnHuyKiemTraLapBienBanKt=');
	clearAllRowTable('tblDanhSachPhuongTienKiemTra');
	
	//check truong hop ton tai du lieu roi, resert default, ko phai load lai. hien tai, chua lam
	//Truong huoc huy, khong can kiem tra dieu kien clear tblKiemTraDoiChieuKetCauVaThongSoKtXe
	//clearAllRowTable('tblKiemTraDoiChieuKetCauVaThongSoKtXe');
	
	//checkAllTblDanhSachVehicleRecord
	$("#checkAllTblDanhSachVehicleRecord" ).prop( "checked", false );//"none checked" = false, true = checked
	$('.cbVehicleRecord').each(function() { //loop through each checkbox, class list checkbox
		this.checked = false;//deselect all checkboxes with class "checkbox1"
	});
	//list trong danh sach khoi tao moi
	bienBanVehicleRecord = [];
}

//button thuc thi quay lai o? man hinh lap bien ban kiem tra
function btnQuayLaiLapBienBanKt() {
	//console.log('');
	//console.log('=btnQuayLaiLapBienBanKt=');
}


function clearAllRowTable(tableName) {
	//console.log('');
	//console.log('=clearAllRowTable=' + tableName);
	var table = document.getElementById(tableName);
	//console.log(table);
	var length = table.rows.length;
	for (var i = table.rows.length - 1; i > 0; i--) {
		table.deleteRow(i);
	}
}

function clearRowTableByIndex(idElementTbl, index) {
	//console.log('');
	//console.log('=clearRowTableByIndex=');
	//console.log('=clearRowTableByIndex=' + idElementTbl + ' ' + index);
	//remove row thi  man hinh tro ve toa do 0, 0;
	//bay gio lam hidden by class, va disable gia tri input
	$('#' + idElementTbl + ' tr:eq(' + index + ')').remove();
}


//chuc nang hien thi tab
$(document).ready(function() {
	$('ul.tabs li').click(function() {
		var tab_id = $(this).attr('data-tab');
		$('ul.tabs li').removeClass('current');
		$('.tab-content').removeClass('current');
		$(this).addClass('current');
		$("#" + tab_id).addClass('current');
	})
})


$(document).ready(function() {
	$('ul.reportTabs li').click(function() {
		//console.log('event click reportTabs');
		//console.log(this);
		//lay ra id cua tab, duoc de trong data-tab
		var tab_id = $(this).attr('data-tab');
		//console.log('tab_id==' + tab_id);
		$('ul.reportTabs li').removeClass('current');
		$('.tab-content-report').removeClass('current');
		$(this).addClass('current');
		$("#" + tab_id).addClass('current');
	})
})

function reLoadTabpdf(id) {
	//console.log('tab Link pdf===' + id + '=chua thuc hien==');
	//$('#' + id).replaceWith($('#' + id));
}

//chuc nang load lai tai lieu khi truyen mot url src moi cua tai lieu vao the embed, trong mot the div
function loadDocument(url, idDiv, idEmbed) {
	var doc = $('<embed src="' + url + '" type="application/pdf" style="width: 100%; height: 400px;" id="' + idEmbed + '"/>');
	$('#' + idDiv).empty().append(doc);
}

function eventHideOrShowDiv(idElement1, isHide1, idElement2, isHide2, idElement3, isHide3, idElement4, isHide4) {
	//console.log(idElement1 + ' - ' + isHide1);
	//console.log(idElement2 + ' - ' + isHide2);
	//console.log(idElement3 + ' - ' + isHide3);
	//the div so 1
	if (isHide1 === 'false') {
		$('#' + idElement1).hide();
	} else if (isHide1 === 'true') { 
		$('#' + idElement1).show();
	}

	//the? div so 2
	if (isHide2 === 'false') {
		$('#' + idElement2).hide();
	} else if (isHide2 === 'true') { 
		$('#' + idElement2).show();
	}

	//the? div so 3
	if (isHide3 === 'false') {
		$('#' + idElement3).hide();
	} else if (isHide3 === 'true') {
		$('#' + idElement3).show();
	}
	
	
	//the? div so 4
	if (isHide4 === 'false') {
		$('#' + idElement4).hide();
	} else if (isHide3 === 'true') {
		$('#' + idElement4).show();
	}
}

function onMouseOverTblTTinNhomXeNk(row) {
	$('.trTblTTinNhomXeNk' + row).css('cursor','pointer');
	//$('.trTblTTinNhomXeNk' + row).css('background-color', 'yellow');
}

function onMouseOutTblTTinNhomXeNk(row) {
	$('.trTblTTinNhomXeNk' + row).css('cursor','');
	//$('.trTblTTinNhomXeNk' + row).css('background-color', '');
}

function onMouseOverTblDanhSachPhuongTienKiemTra(id) {
	$('#' + id).attr('style', 'text-decoration: underline; color: rgb(21, 47, 221);cursor: pointer;');
}

function onMouseOutTblDanhSachPhuongTienKiemTra(id) {
	$('#' + id).attr('style', 'text-decoration: none; color: #000;cursor: pointer;');
}

function func_xacnhanPheDuyet() {
	func_huyPheDuyet();
	var stt = $('#giaTriNhapStt').val();

	var giaTriNhapSuaDoi = $('#giaTriNhapSuaDoi' + stt);
	
	if (isThuocDmDataItem == "0") {
		var giaTriView = giaTriNhapSuaDoi.val();
		$('#giaTriKiemTra_' + stt).val(giaTriView);
		$('#giaTriKiemTra' + stt).val(giaTriView);
	} else if (isThuocDmDataItem == "1") {
		var giaTriId = giaTriNhapSuaDoi.val();
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
		}
	}
	
	func_huyPheDuyet();
	
	var stt = $('#giaTriNhapStt').val();
	var commonCode = $('#giaTriCommonCode').val();
	
	//0 la ko thuoc danh muc
	if (isThuocDmDataItem == "0") {
		var giaTriView = document.getElementById('giaTriNhapSuaDoi' + stt).value;
		
		document.getElementById('giaTriKiemTraTTC' + stt).value = giaTriView;
		$('#giaTriCodeTTC' + stt).val(giaTriView);
		document.getElementById('giaTriCodeTTC_SuaDoi' + commonCode).value = giaTriView;
	
	//1 la select box
	} else if (isThuocDmDataItem == "1") {
		var giaTriId = document.getElementById('giaTriNhapSuaDoi' + stt).value;
		var giaTriView = $('#giaTriNhapSuaDoi' + stt + ' option[value="'+giaTriId+'"]').text();//document.getElementById('giaTriNhapSuaDoi' + stt).selectedOptions[0].text;

		document.getElementById('giaTriKiemTraTTC' + stt).value = giaTriView;
		
		$('#giaTriCodeTTC' + stt).val(giaTriId);
		document.getElementById('giaTriCodeTTC_SuaDoi' + commonCode).value = giaTriId;
	
	//2 la checkbox, dung cho truong hop Nuoc san xuat cua TTC
	} else if (isThuocDmDataItem == "2") {
		var listStateCode = "";
		var listStateValue = "";
		
		$('#listValueGiaTriNhap .changeState').each(function(){
			if($(this).is(":checked")) {
				listStateCode += $(this).data("statecode") + ",";
				listStateValue += $(this).data("statevalue") + ",";
			}
		});
		
		/*$('#giaTriKiemTraTTC' + stt).val(listStateValue);
		$('#giaTriKiemTraTTC' + stt).attr('value', listStateValue);
		
		$('#giaTriCodeTTC' + stt).val(listStateCode);
		
		$('#giaTriCodeTTC_SuaDoi' + commonCode).val(listStateCode);
		$('#giaTriCodeTTC_SuaDoi' + commonCode).attr('value', listStateCode);*/
	}
}

function func_xacnhanChiPhiPhatSinh() {
	var stt = document.getElementById('giaTriNhapStt').value;
	//console.log("===func_xacnhanPheDuyetTTChung==");

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






function newtblDanhSachPhuongTienKiemTra(soXe, nhanHieu, soLoai, soVinMau, soKhungMau, soDongCoMau, tinhTrangPhuongTienMau, namSXXeMau, mauXeMau) {
	
	var duLieu="<table style=\"width: 100%;\" class=\"wd-table table\">";
	duLieu=duLieu+"<thead>";
	duLieu=duLieu+"<tr>";
	duLieu=duLieu+"<th class=\"text-center bold\" style=\"font-size: 13px;\">Nhãn hiệu<br>Số loại</th>";
	duLieu=duLieu+"<th class=\"text-center bold\" style=\"font-size: 13px;\">Số VIN</th>";
	duLieu=duLieu+"<th class=\"text-center bold\" style=\"font-size: 13px;\">Số khung<br>Số động cơ</th>";
	duLieu=duLieu+"<th class=\"text-center bold\" style=\"font-size: 13px;\">Tình trạng</th>";
	duLieu=duLieu+"<th class=\"text-center bold\" style=\"font-size: 13px;\">Năm sản xuất</th>";
	duLieu=duLieu+"<th class=\"text-center bold\" style=\"font-size: 13px;\">Màu xe</th>";
	duLieu=duLieu+"</tr>";
	duLieu=duLieu+"</thead>";
	duLieu=duLieu+"<tbody>";
	duLieu=duLieu+"<tr>";
	duLieu=duLieu+ "<td align='center'><input type='text' disabled=\"disabled\" value='" + nhanHieu +"' /><br><input type='text' disabled=\"disabled\" value='" + soLoai +"' /></td>";
	duLieu=duLieu+ "<td align='center'><input type='text' disabled=\"disabled\" value='" + soVinMau +"'  /></td>";
	duLieu=duLieu+ "<td align='center'><input type='text' disabled=\"disabled\" value='" + soKhungMau +"'  /><br><input type='text' id='soDongCoMauDSXeSuaDoi" + soXe + "' value='" + soDongCoMau +"' /></td>";
	duLieu=duLieu+ "<td align='center'><select id='tinhTrangPhuongTienMauDSXeSuaDoi" + soXe + "' class=\"form-control-find\" style=\"height: 30px\">";
	if(tinhTrangPhuongTienMau=='0'){
		duLieu=duLieu+ "<option value=\"0\" selected >Chưa qua sử dụng</option>";
		duLieu=duLieu+ "<option value=\"1\">Đã qua sử dụng</option>";
		duLieu=duLieu+ "<option value=\"2\">Xem ghi chú</option></select>";
	} else if (tinhTrangPhuongTienMau=='1'){
		duLieu=duLieu+ "<option value=\"0\">Chưa qua sử dụng</option>";
		duLieu=duLieu+ "<option value=\"1\" selected >Đã qua sử dụng</option>";
		duLieu=duLieu+ "<option value=\"2\">Xem ghi chú</option></select>";
	} else if (tinhTrangPhuongTienMau=='2'){
		duLieu=duLieu+ "<option value=\"0\">Chưa qua sử dụng</option>";
		duLieu=duLieu+ "<option value=\"1\">Đã qua sử dụng</option>";
		duLieu=duLieu+ "<option value=\"2\" selected >Xem ghi chú</option></select>";
	}
	
	duLieu=duLieu+ "<td align='center'><input type='text' id='namSXXeMauDSXeSuaDoi" + soXe + "' value='" + namSXXeMau +"'  /></td>";
	duLieu=duLieu+ "<td align='center'><input type='text' id='mauXeMauDSXeSuaDoi" + soXe + "' value='" + mauXeMau +"'  /></td>";
	duLieu=duLieu+"</tr>";
	duLieu=duLieu+"</tbody>";
	duLieu=duLieu+"</table>";
	return duLieu;
}

function func_xacnhanPheDuyetDSXe() {
	func_huyPheDuyetDSXe();
	
	//tham so input nay xuat hien sau khi hien dialog
	//tham so tren dialog
	var soXe = document.getElementById('giaTriNhapSttDSXe').value;
	var soKhungMauDSXeSuaDoiView = document.getElementById('soKhungMauDSXeSuaDoi' + soXe).value;
	var soDongCoMauDSXeSuaDoiView = document.getElementById('soDongCoMauDSXeSuaDoi' + soXe).value;
	var tinhTrangPhuongTienMauDSXeSuaDoiView = document.getElementById('tinhTrangPhuongTienMauDSXeSuaDoi' + soXe).value;
	var namSXXeMauDSXeSuaDoiView = document.getElementById('namSXXeMauDSXeSuaDoi' + soXe).value;
	var mauXeMauDSXeSuaDoiView = document.getElementById('mauXeMauDSXeSuaDoi' + soXe).value;

	//console.log("===soKhungMauDSXeSuaDoiView==" + soKhungMauDSXeSuaDoiView);
	//console.log("===soDongCoMauDSXeSuaDoiView==" + soDongCoMauDSXeSuaDoiView);
	//console.log("===tinhTrangPhuongTienMauDSXeSuaDoiView==" + tinhTrangPhuongTienMauDSXeSuaDoiView);
	//console.log("===namSXXeMauDSXeSuaDoiView==" + namSXXeMauDSXeSuaDoiView);
	//console.log("===mauXeMauDSXeSuaDoiView==" + mauXeMauDSXeSuaDoiView);

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

//chuc nang 
var isSelectDouble = '0';

var arr_selectionThongTinChung2 = [];
var arr_selectionThongSoKtXe2 = [];

/*kiem tra xem co phai la trinh duyet safari hay khong*/
var dkUA = navigator.userAgent.toLowerCase();
var isSafariBrowser = false; 
if (dkUA.indexOf('safari') != -1 && dkUA.indexOf('chrome') == -1) { 
	isSafariBrowser = true;
}

//o man hinh TAB thong tin chung
function checkSelLuaChonThongTinChung(stt, commonCode) {
	//console.log("==checkSelLuaChonThongTinChung====" + arr_selectionThongTinChung2[stt]);
	/*if (isSelectDouble == '0') {
		isSelectDouble = '1';
	} else if (isSelectDouble == '1') {
		onChangeSelLuaChonThongTinChung(stt, commonCode);
		isSelectDouble = '0';
	}*/
	
	// Neu la trinh duyet safari thi khi click select khong goi onclick luon nhu trinh duyet chrome, firefox, ie
	//console.log('checkSelLuaChonThongTinChung: ' + stt + '-' + commonCode);
	if(isSafariBrowser) {
		arr_selectionThongTinChung2[stt] = 1;
	}
	
	if(arr_selectionThongTinChung2[stt]) {
		onChangeSelLuaChonThongTinChung(stt, commonCode);
		arr_selectionThongTinChung2.splice(stt, 1);
	} else {
		arr_selectionThongTinChung2[stt] = 1;
	}
}
//Lua chon thong so ki thuat xe
function checkSelLuaChonThongSoKtXe(stt) {
	//console.log("==checkSelLuaChonThongSoKtXe====" + arr_selectionThongSoKtXe2[stt]);
	/*if (isSelectDouble == '0') {
		isSelectDouble = '1';
	} else if (isSelectDouble == '1') {
		onChangeSelLuaChonThongSoKtXe(stt);
		isSelectDouble = '0';
	}*/
	console.log('checkSelLuaChonThongSoKtXe: ' + stt);
	// Neu la trinh duyet safari thi khi click select khong goi onclick luon nhu trinh duyet chrome, firefox, ie
	if(isSafariBrowser) {
		arr_selectionThongSoKtXe2[stt] = 1;
	}
	
	if(arr_selectionThongSoKtXe2[stt]) {
		onChangeSelLuaChonThongSoKtXe(stt);
		arr_selectionThongSoKtXe2.splice(stt, 1);
	} else {
		arr_selectionThongSoKtXe2[stt] = 1;
	}
}



//II. Danh sách phương tiện kiểm tra : Chọn xe mẫu CLICK
function onChangeValueVehicleRecordMau(row) {
	//console.log('==changevaluevehiclerecordmau====dong=============' + row);
	
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
	
	//console.log('==changevaluevehiclerecordmau====namSanXuatXeSuaDoi==' + namSanXuatXeSuaDoi + '==tinhTrangPhuongTienSuaDoi==' + tinhTrangPhuongTienSuaDoi);
	
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
		
		if (soKhungSuaDoi != '') { listSoKhungSuaDoi = listSoKhungSuaDoi + "#" + row + "--" + soKhungSuaDoi + ","; }
		if (soDongCoSuaDoi != '') { listSoDongCoSuaDoi = listSoDongCoSuaDoi + "#" + row + "--" + soDongCoSuaDoi + ","; }
		if (mauXeSuaDoi != '') { listMauXeSuaDoi = listMauXeSuaDoi + "#" + row + "--" + mauXeSuaDoi + ","; }
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
	
	$("#div_view_TTC_1_21").html(listSoVinMau.replace(/\,/g, '<br>'));
	$("#div_view_TTC_1_22").html(listSoKhungMau.replace(/\,/g, '<br>'));
	$("#div_view_TTC_1_23").html(listSoDongCoMau.replace(/\,/g, '<br>'));
	$("#div_view_TTC_1_24").html(listTinhTrangPhuongTienMau.replace(/\,/g, '<br>'));
	$("#div_view_TTC_1_25").html(listNamSXXeMau.replace(/\,/g, '<br>'));
	$("#div_view_TTC_1_26").html(listMauXeMau.replace(/\,/g, '<br>'));
	
	$('input[name="giaTriKiemTraTTCTTC_1_21"]').attr('style', 'display: none !important');
	$('input[name="giaTriKiemTraTTCTTC_1_22"]').attr('style', 'display: none !important');
	$('input[name="giaTriKiemTraTTCTTC_1_23"]').attr('style', 'display: none !important');
	$('input[name="giaTriKiemTraTTCTTC_1_24"]').attr('style', 'display: none !important');
	$('input[name="giaTriKiemTraTTCTTC_1_25"]').attr('style', 'display: none !important');
	$('input[name="giaTriKiemTraTTCTTC_1_26"]').attr('style', 'display: none !important');
	
	$("#div_view_giaTriKiemTraTTCTTC_1_21").html(listSoVinMau.replace(/\,/g, '<br>'));
	$("#div_view_giaTriKiemTraTTCTTC_1_22").html(listSoKhungSuaDoi.replace(/\,/g, '<br>'));
	$("#div_view_giaTriKiemTraTTCTTC_1_23").html(listSoDongCoSuaDoi.replace(/\,/g, '<br>'));
	$("#div_view_giaTriKiemTraTTCTTC_1_24").html(listTinhTrangPhuongTienSuaDoi.replace(/\,/g, '<br>'));
	$("#div_view_giaTriKiemTraTTCTTC_1_25").html(listNamSanXuatXeSuaDoi.replace(/\,/g, '<br>'));
	$("#div_view_giaTriKiemTraTTCTTC_1_26").html(listMauXeSuaDoi.replace(/\,/g, '<br>'));
	
	$('#listVehicleRecordMau').val(listVehicleRecordMau);
	$('#listSoKhungMau').val(listSoKhungMau);
	$('#listSoDongCoMau').val(listSoDongCoMau);
	$('#listSoVinMau').val(listSoVinMau);
	$('#listTinhTrangPhuongTienMau').val(listTinhTrangPhuongTienMau);
	$('#listNamSXXeMau').val(listNamSXXeMau);
	$('#listMauXeMau').val(listMauXeMau);
	
	$('#giaTriCodeTTC_SuaDoiTTC_1_21').val(listSoVinMau);
	$('#giaTriCodeTTC_SuaDoiTTC_1_22').val(listSoKhungSuaDoi);
	$('#giaTriCodeTTC_SuaDoiTTC_1_23').val(listSoDongCoSuaDoi);
	$('#giaTriCodeTTC_SuaDoiTTC_1_24').val(listTinhTrangPhuongTienSuaDoi);
	$('#giaTriCodeTTC_SuaDoiTTC_1_25').val(listNamSanXuatXeSuaDoi);
	$('#giaTriCodeTTC_SuaDoiTTC_1_26').val(listMauXeSuaDoi);
	
	$('#listSoKhungSuaDoi').val(listSoKhungSuaDoi);
	$('#listSoDongCoSuaDoi').val(listSoDongCoSuaDoi);
	$('#listMauXeSuaDoi').val(listMauXeSuaDoi);
	$('#listNamSanXuatXeSuaDoi').val(listNamSanXuatXeSuaDoi);
	$('#listTinhTrangPhuongTienSuaDoi').val(listTinhTrangPhuongTienSuaDoi);
	
	
}


//ham thuc thi lua chon ket qua
function onChangeSelLuaChonThongSoKtXe(stt) {
	
	//$('#selLuaChonKetQua' + stt).on('change', function() {
	var code = $('select#selLuaChonKetQua' + stt).val();
	//console.log("==onChangeSelLuaChonKetQua==" + stt + "=code=" + code);
	
	var specificationcode = $('#specificationcode' + stt).val();
	var specificationvalue = "";
	
	if (code === '0') {
		//Chưa quyết định
		//console.log(stt + '(0) Chua dua ra quyet dinh - (2) de chong, khong nhap, khong lam j' + ('giaTriDangKi=' + $('#giaTriDangKi' + stt).val()) + ('GiaTriKiemTra=' + $('#giaTriKiemTra' + stt).val()));
		
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
		//Đạt
		//console.log(stt + '(1) Dat - copy (1) vao (2) khong sua' + 'gia tri dang ki:' + ($('#giaTriDangKi' + stt).val()) + 'gia tri kiem tra:' + ($('#giaTriKiemTra' + stt).val()));
		
		//gia tri dang ki, gia tri kiem tra
		//var giaTriDangKi = $('#giaTriDangKi' + stt).val();
		//var giaTriDangKi_ = $('#giaTriDangKi_' + stt).val();
		
		$('#giaTriKiemTra' + stt).val($('#giaTriDangKi' + stt).val());
		$('#giaTriKiemTra_' + stt).attr('value',$('#giaTriDangKi_' + stt).val());
		$('#giaTriKiemTra_' + stt).val($('#giaTriDangKi_' + stt).val());
		
		//$('.trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).css('background-color', '');
		$('#trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'background-color: white !important');
		$('#selLuaChonKetQua' + stt).attr('style', 'background-color: white !important; color: black !important');
		
		//chinh font chu
		$('#sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		$('#sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		
		$('#giaTriDangKi_' + stt).attr('style', 'background-color: white !important; color: black !important');
		$('#giaTriKiemTra_' + stt).attr('style', 'background-color: white !important; color: black !important');
		
		specificationvalue = $('#giaTriDangKi' + stt).val();
		
	} else if (code === '2') {
		//Không đạt
		//console.log(stt + '(2) Ko Dat - text box, nhap chu~' + ('giaTriDangKi=' + $('#giaTriDangKi' + stt).val()) + ('GiaTriKiemTra=' + $('#giaTriKiemTra' + stt).val()));
		
		//remove class="textNone", readOnly = false
		//$('#giaTriKiemTra' + stt).val('');
		//$('#giaTriKiemTra_' + stt).removeClass("textNone");
		//$('#giaTriKiemTra_' + stt).attr('value','');
		//$('#giaTriKiemTra_' + stt).val('');
		//$('#giaTriKiemTra_' + stt).prop('readonly', false);
		//chon khong dat thuc hien luon ham suaGiaTriNhap
		$('#giaTriKiemTra' + stt).on("click", suaGiaTriNhap($('#specificationcode' + stt).val(), $('#giaTriKiemTra' + stt).val(), stt, 'THONGSOXE', ''));

		//$('.trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).css('background-color', 'rgb(237, 108, 108) !important;');
		$('#trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'background-color: rgb(237, 108, 108) !important');
		$('#selLuaChonKetQua' + stt).attr('style', 'background-color: rgb(237, 108, 108) !important; color: black !important');
	
		//chinh font chu
		$('#sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		$('#sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		
		$('#giaTriDangKi_' + stt).attr('style', 'background-color: rgb(237, 108, 108) !important; color: black !important');
		$('#giaTriKiemTra_' + stt).attr('style', 'background-color: rgb(237, 108, 108) !important; color: black !important');
		
	} else if (code === '3') {
		//Sửa đổi
		//console.log(stt + '(3) Sua doi - copy (1) -> (2) sua tren text box' + ('giaTriDangKi=' + $('#giaTriDangKi' + stt).val()) + ('GiaTriKiemTra=' + $('#giaTriKiemTra' + stt).val()));
		
		//remove class="textNone"
		//$('#giaTriKiemTra_' + stt).removeClass("textNone");
		//$('#giaTriKiemTra_' + stt).prop('readonly', false);
		
		//$('#giaTriKiemTra' + stt).val($('#giaTriDangKi' + stt).val());
		//$('#giaTriKiemTra_' + stt).val($('#giaTriDangKi_' + stt).val());
		
		$('#giaTriKiemTra' + stt).on("click", suaGiaTriNhap($('#specificationcode' + stt).val(), $('#giaTriKiemTra' + stt).val(), stt, 'THONGSOXE', ''));
		
		//$('.trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).css('background-color', 'rgb(245, 245, 107) !important;');
		$('#trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'background-color: rgb(245, 245, 107) !important');
		$('#selLuaChonKetQua' + stt).attr('style', 'background-color: rgb(245, 245, 107) !important; color: black !important');
		
		//chinh font chu
		$('#sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		$('#sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		
		$('#giaTriDangKi_' + stt).attr('style', 'background-color: rgb(245, 245, 107) !important; color: black !important');
		$('#giaTriKiemTra_' + stt).attr('style', 'background-color: rgb(245, 245, 107) !important; color: black !important');
		
	} else if (code === '4') {
		//Không áp dụng
		//console.log(stt + '(0) Khong ap dung (2) de chong, khong ap dung ' + 'gia tri dang ki:' + ($('#giaTriDangKi' + stt).val()) + 'gia tri kiem tra:' + ($('#giaTriKiemTra' + stt).val()));
		
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

function validatorHoanKiemTra() {
	var lyDoHoanKiemTra = $('#lyDoHoanKiemTra').val();
	if (lyDoHoanKiemTra.trim().length == 0) {
		alert("Đề nghị nhập lý do Hoãn kiểm tra !");
		return false;
	}
	return true;
}

function showThongBaoMsg() {
	//console.log("==showThongBaoMsg ==");
	//resetGiaTriNhapSuaDoi();
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
	var stt = $('#giaTriNhapStt').val();
	var result = document.getElementById('selLuaChonKetQua'+stt).value;
	// khong dat
	//if (result == "2") {
	//	document.getElementById('giaTriNhapSuaDoi' + stt).value = "";
	//	document.getElementById('giaTriKiemTra_' + stt).value = "";
	//} else {
		//if (isThuocDmDataItem == "0") {
		//	$('#giaTriNhapSuaDoi' + stt).val($('#giaTriDangKyCodeTTC' + stt).val());
			//document.getElementById('giaTriNhapSuaDoi' + stt).value = document.getElementById('giaTriDangKiTTC' + stt).value;		
		//} else if (isThuocDmDataItem == "1") {
			$('#giaTriNhapSuaDoi' + stt).val($('#giaTriDangKyCodeTTC' + stt).val());
			//document.getElementById('giaTriNhapSuaDoi' + stt).selectedOptions[0].text = document.getElementById('giaTriDangKiTTC' + stt).value;
		//}	
	//}	
	$('#giaTriNhapSuaDoi' + stt).val($('#giaTriDangKyCodeTTC' + stt).val());
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

function showThongBaoMsgDSXe() {
	//console.log("==showThongBaoMsgDSXe ==");
	$("#div_WarningMsgDSXe").dialog({
		title : 'Xác nhận thay đổi',
		resizable : false,
		modal : true,
		width : '1000px',
		closeOnEscape : false,
		open : function() {
			jQuery('.ui-widget-overlay').bind('click', function() {
				$('#div_WarningMsgDSXe').dialog('close');
			});
		}
	});
}
function func_huyPheDuyet() {
	// truong hop la nuoc san xuat thi reset lai gia tri ban dau
	// ton tai id #listValueGiaTriState cua nuoc san xuat
	
	if($('#giaTriCommonCode').length > 0 && $('#giaTriCommonCode').val() == 'TTC_1_14') {
		if($("#listValueGiaTriState").length > 0) {	
			$("#listValueGiaTriState").val($("#listValueGiaTriStateInitial").val());
			$("#listHienThiGiaTriState").val($("#listHienThiGiaTriStateInitial").val());
		}
		
		setGiaTriKhiChonNuocSanXuat($("#listValueGiaTriState").val(), $("#listHienThiGiaTriState").val());
	}
	
	$('#div_WarningMsg').dialog('close');
}
function func_huyPheDuyetDSXe() {
	$('#div_WarningMsgDSXe').dialog('close');
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
	//var soLoai = $('#giaTriKiemTraTTC12').val();//ten thuong mai
	var soLoai = $('#giaTriDangKiTTC12').val();
	
	var soVinMau = $('#soVinMau' + soXe).val();
	var soKhungMau = $('#soKhungMauEdit' + soXe).val();
	var soDongCoMau = $('#soDongCoMauEdit' + soXe).val();
	var tinhTrangPhuongTienMau = $('#tinhTrangPhuongTienMauEdit' + soXe).val();
	var namSXXeMau = $('#namSXXeMauEdit' + soXe).val();
	var mauXeMau = $('#mauXeMauEdit' + soXe).val();
	
	document.getElementById("listValueGiaTriNhapDSXe").style.overflowX = "";
	//document.getElementById("listValueGiaTriNhapDSXe").style.height = "30px";
	
	var giaTriTraVe = newtblDanhSachPhuongTienKiemTra(soXe, nhanHieu, soLoai, soVinMau, soKhungMau, soDongCoMau, tinhTrangPhuongTienMau, namSXXeMau, mauXeMau);
	
	if (giaTriTraVe != '') {
		document.getElementById("valueGiaTriNhapSttDSXe").innerHTML = "<input type='hidden' id='giaTriNhapSttDSXe' name='giaTriNhapSttDSXe' value='" + soXe + "' /> ";
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

function createGiaTriTraVe(code, name, isSelected) {
	var duLieu = '<input type="checkbox" id="giaTriNhapSuaDoi' + code + '" data-statecode="' + code + '"data-statevalue="' + name + '" value="' + name + '" ' + isSelected + ' onclick="changeState(\'' + code + '\')"/>'; /*class="changeState" */
	duLieu = duLieu + '<label style="font-weight:normal;cursor:pointer;padding-left:3px;" for="giaTriNhapSuaDoi' + code + '">' + name + '</label><br>';
	//duLieu = duLieu + '<input type="hidden" id="hienThiGiaTriState' + code + '" value="' + name + '" />';
	//duLieu = duLieu + '<input type="hidden" id="valueGiaTriState' + code + '" value="' + code + '" />';
	return duLieu;
}

function createListGiaTriTraVe(giaTriCode, giaTriKiemTra) {
	var duLieu = '<input type="hidden" id="listValueGiaTriState" name="valueGiaTriState" value="' + giaTriCode + '"/>';
	duLieu = duLieu + '<input type="hidden" id="listHienThiGiaTriState" name="hienThiGiaTriState" value="' + giaTriKiemTra + '"/>';
	duLieu = duLieu + '<input type="hidden" id="listValueGiaTriStateInitial" name="listValueGiaTriStateInitial" value="' + giaTriCode + '"/>';
	duLieu = duLieu + '<input type="hidden" id="listHienThiGiaTriStateInitial" name="listHienThiGiaTriStateInitial" value="' + giaTriKiemTra + '"/>';
	return duLieu;
}

function createInput(stt, giaTriDangKi) {
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

	$('#giaTriKiemTraTTC' + stt).val(hienThiGiaTriState);
	$('#giaTriKiemTraTTC' + stt).attr('value', hienThiGiaTriState);
	
	$('#giaTriCodeTTC' + stt).val(valueGiaTriState);
	$('#giaTriCodeTTC' + stt).attr('value', valueGiaTriState);
	
	$('#giaTriCodeTTC_SuaDoi' + commonCode).val(valueGiaTriState);
	$('#giaTriCodeTTC_SuaDoi' + commonCode).attr('value', valueGiaTriState);
}

function createRow(i, url, name, idinspectionrecordattach, idinspectionrecord) {
	var duLieu = '';
	duLieu = duLieu + '<tr>';
	duLieu = duLieu + '<td class="text-center">' + (i + 1) + '</td>';
	duLieu = duLieu + '<td>';
	duLieu = duLieu + '<a href="' + url + '">' + name + '</a>';
	duLieu = duLieu + '</td>';
	duLieu = duLieu + '<td class="text-center"><img onclick="deleteFileUploadBBKT(' + idinspectionrecordattach + ', ' + idinspectionrecord + ')" src="/DangKiemApp-portlet/img/huy.png" /></td>';
	duLieu = duLieu + '</tr>';
	return duLieu;
}


