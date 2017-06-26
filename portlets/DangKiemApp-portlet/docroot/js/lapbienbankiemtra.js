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
	vehicleGroupId = $('#vehicleGroupTblTTinNhomXeNk' + row).val();//vehicle Group TblTTinNhomXeNk
	resultCallAjaxFindVehicleSpecification = false;
	//console.log('businessDoiChieuHoSo==vehicleGroupId==' + vehicleGroupId);
	//set gia tri vao
	$('#id_vehicle_group').val(vehicleGroupId);
	$('#lap_bien_ban_kt_id_vehicle_group').val(vehicleGroupId);
	//console.log('businessDoiChieuHoSo==vehicleGroupId==after==' + $('#id_vehicle_group').val());
	//console.log('businessDoiChieuHoSo==vehicleGroupId==after==' + $('#lap_bien_ban_kt_id_vehicle_group').val());
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
		danhSachVehicleRecord='';
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
			danhSachVehicleRecord=danhSachVehicleRecord+idDsVehicleRecord+', ';
			soXeDaChon++;
			//console.log('SIZE : bien Ban ? VehicleRecord=' + bienBanVehicleRecord.length);
		});
	} else if (giaTri === 0) {
		//console.log('checkAllTblDanhSachVehicleRecord === false');
		$('.cbVehicleRecord').each(function() { //loop through each checkbox
			this.checked = false;//deselect all checkboxes with class "checkbox1"
		});
		//remove all elemvent VehicleRecord in bienBanVehicleRecord
		bienBanVehicleRecord = [];
		danhSachVehicleRecord='';
		soXeDaChon=0;
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
		$('#giaTriKiemTra_' + stt).val($('#giaTriDangKi_' + stt).val());
		$('#giaTriKiemTra' + stt).on("click", suaGiaTriNhap($('#specificationname' + stt).val(),$('#giaTriDangKi' + stt).val(),stt,'THONGTINCHUNG',''));
		
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
	
	if (code === '0') {
		//Chưa quyết định
		
		$('#giaTriKiemTraTTC' + commonCode).attr('value','');
		$('#giaTriKiemTraTTC' + commonCode).val('');
		$('#giaTriCodeTTC_SuaDoi' + commonCode).val('');
		$('#giaTriKiemTraTTC' + commonCode).addClass("textNone");
		$('#giaTriKiemTraTTC' + commonCode).prop('readonly', true);
		$('#giaTriCodeTTC' + stt).val('');
		
		//class of element
		$('#trtblThongTinChung' + stt).attr('style', 'background-color: rgb(91, 220, 231) !important');
		$('#selLuaChonTTC' + stt).attr('style', 'background-color: rgb(91, 220, 231) !important; color: black !important');
		
		//hidden input neu la ds xe mau
		if((document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_21")) || (document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_22")) ||
			(document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_23")) || (document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_24")) ||
			(document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_25")) || (document.getElementById('giaTriDangKiTTC' + stt).name == ("TTC_1_26"))) {
			
			$('#giaTriDangKiTTC' + stt).attr('style', 'display: none !important');
			$('#giaTriKiemTraTTC' + commonCode).attr('style', 'display: none !important');
		} else {
			$('#giaTriDangKiTTC' + stt).attr('style', 'background-color: rgb(91, 220, 231) !important; color: black !important');
			$('#giaTriKiemTraTTC' + commonCode).attr('style', 'background-color: rgb(91, 220, 231) !important; color: black !important');
		}
		
	} else if (code === '1') {
		// Đạt 
		//gia tri dang ki, gia tri kiem tra
		$('#giaTriKiemTraTTC' + commonCode).attr('value',$('#giaTriDangKiTTC' + stt).val());
		$('#giaTriKiemTraTTC' + commonCode).val($('#giaTriDangKiTTC' + stt).val());
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
			$('#giaTriKiemTraTTC' + commonCode).attr('style', 'display: none !important');
		} else {
			$('#giaTriDangKiTTC' + stt).attr('style', 'background-color: white !important; color: black !important');
			$('#giaTriKiemTraTTC' + commonCode).attr('style', 'background-color: white !important; color: black !important');
		}
		
	} else if (code === '2') {
		// Không đạt 
		//remove class="textNone", readOnly = false
		$('#giaTriKiemTraTTC' + commonCode).attr('value',$('#giaTriDangKiTTC' + stt).val());
		$('#giaTriKiemTraTTC' + commonCode).val($('#giaTriDangKiTTC' + stt).val());
		$('#giaTriCodeTTC_SuaDoi' + commonCode).val($('#giaTriDangKyCodeTTC' + stt).val());
		
		$('#giaTriKiemTraTTC' + commonCode).prop('readonly', false);
		$('#giaTriKiemTraTTC' + commonCode).on("click", suaGiaTriNhap($('#giaTriDmTTC' + stt).val(),$('#giaTriCodeTTC' + stt).val(),stt,'1',commonCode));
		
		$('#trtblThongTinChung' + stt).attr('style', 'background-color: rgb(237, 108, 108) !important');
		$('#selLuaChonTTC' + stt).attr('style', 'background-color: rgb(237, 108, 108) !important; color: black !important');
	
		//chinh font chu
		$('#sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		$('#sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).attr('style', 'color: black !important');
		
		$('#giaTriDangKiTTC' + stt).attr('style', 'background-color: rgb(237, 108, 108) !important; color: black !important');
		$('#giaTriKiemTraTTC' + commonCode).attr('style', 'background-color: rgb(237, 108, 108) !important; color: black !important');
	} else if (code === '3') {
		// Sửa đổi 
		//remove class="textNone"
		$('#giaTriKiemTraTTC' + commonCode).prop('readonly', true);
		//$('#giaTriKiemTraTTC' + commonCode).attr('value',$('#giaTriDangKiTTC' + stt).val());
		//$('#giaTriKiemTraTTC' + commonCode).val($('#giaTriDangKiTTC' + stt).val());
		//$('#giaTriCodeTTC_SuaDoi' + commonCode).val($('#giaTriDangKyCodeTTC' + stt).val());
		$('#giaTriKiemTraTTC' + commonCode).on("click", suaGiaTriNhap($('#giaTriDmTTC' + stt).val(), $('#giaTriCodeTTC' + stt).val(), stt, '1', commonCode));
		
		//$('.trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).css('background-color', 'rgb(245, 245, 107) !important;');
		$('#trtblThongTinChung' + stt).attr('style', 'background-color: rgb(245, 245, 107) !important');
		$('#selLuaChonTTC' + stt).attr('style', 'background-color: rgb(245, 245, 107) !important; color: black !important');
		
		$('#giaTriDangKiTTC' + stt).attr('style', 'background-color: rgb(245, 245, 107) !important; color: black !important');
		$('#giaTriKiemTraTTC' + commonCode).attr('style', 'background-color: rgb(245, 245, 107) !important; color: black !important');
	} else if (code === '4') {
		
		//console.log(stt + '(0) Khong ap dung (2) de chong, khong ap dung ' + 'gia tri dang ki:' + ($('#giaTriDangKi' + stt).val()) + 'gia tri kiem tra:' + ($('#giaTriKiemTra' + stt).val()));
		
		$('#giaTriKiemTraTTC' + commonCode).attr('value','');
		$('#giaTriKiemTraTTC' + commonCode).val('');
		$('#giaTriCodeTTC_SuaDoi' + commonCode).val('');
		$('#giaTriCodeTTC' + stt).val('');
		
		$('#giaTriKiemTraTTC' + commonCode).addClass("textNone");
		$('#giaTriKiemTraTTC' + commonCode).prop('readonly', true);
		
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
			$('#giaTriKiemTraTTC' + commonCode).attr('style', 'display: none !important');
		} else {
			$('#giaTriDangKiTTC' + stt).attr('style', 'background-color: rgb(42, 203, 42) !important; color: black !important');
			$('#giaTriKiemTraTTC' + commonCode).attr('style', 'background-color: rgb(42, 203, 42) !important; color: black !important');
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
		////console.log(index);
		////console.log(($(element)).val());
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
		
		danhSachVehicleRecord=danhSachVehicleRecord.replace(idVehicleRecordRemove+',','');
		
		//console.log('==end======danhSachVehicleRecord==='+danhSachVehicleRecord);

		
		$('#danhSachVehicleRecord').val(danhSachVehicleRecord);
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
	var js_ngayKiemTraTuNgay = new Date(arr_ngayKiemTraTuNgayDate[2], arr_ngayKiemTraTuNgayDate[1]-1, arr_ngayKiemTraTuNgayDate[0], arr_ngayKiemTraTuNgayTime[0], arr_ngayKiemTraTuNgayTime[1]);/*new Date(year, month, day, hour, minute)*/
	var js_ngayKiemTraTuNgayDate = new Date(arr_ngayKiemTraTuNgayDate[2], arr_ngayKiemTraTuNgayDate[1]-1, arr_ngayKiemTraTuNgayDate[0]);
	
	var arr_ngayKiemTraDenNgayDate = $('#ngayKiemTraDenNgay').val().substring(0, 10).split("/");
	var arr_ngayKiemTraDenNgayTime = $('#ngayKiemTraDenNgay').val().substring(11, $('#ngayKiemTraDenNgay').val().length).split(":");
	var js_ngayKiemTraDenNgay = new Date(arr_ngayKiemTraDenNgayDate[2], arr_ngayKiemTraDenNgayDate[1]-1, arr_ngayKiemTraDenNgayDate[0], arr_ngayKiemTraDenNgayTime[0], arr_ngayKiemTraDenNgayTime[1]); /*new Date(year, month, day, hour, minute)*/
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
