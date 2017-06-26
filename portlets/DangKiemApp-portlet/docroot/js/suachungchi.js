function onChangeSelLuaChonThongSoKtXe(specificationcode) {
	
	var code = $('select#selLuaChonKetQua' + specificationcode).val();
	
	if (code === '1') {
		
		//gia tri dang ki, gia tri kiem tra
		$('#giaTriKiemTra' + specificationcode).val($('#giaTriDangKi' + specificationcode).val());
		$('#giaTriKiemTra_' + specificationcode).val($('#giaTriDangKi_' + specificationcode).val());
		
		$('#trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + specificationcode).attr('style', 'background-color: white !important');
		$('#selLuaChonKetQua' + specificationcode).attr('style', 'background-color: white !important; color: black !important');
		
		//chinh font chu
		$('#sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe' + specificationcode).attr('style', 'color: black !important');
		$('#sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe' + specificationcode).attr('style', 'color: black !important');
		
		$('#giaTriDangKi_' + specificationcode).attr('style', 'background-color: white !important; color: black !important');
		$('#giaTriKiemTra_' + specificationcode).attr('style', 'background-color: white !important; color: black !important');
	}  else if (code === '2') {
		
		//remove class="textNone"
		$('#giaTriKiemTra' + specificationcode).removeClass("textNone");
		$('#giaTriKiemTra' + specificationcode).prop('readonly', false);
//		$('#giaTriKiemTra' + specificationcode).val($('#giaTriDangKi' + specificationcode).val());
//		$('#giaTriKiemTra_' + specificationcode).val($('#giaTriDangKi_' + specificationcode).val());
		$('#giaTriKiemTra' + specificationcode).on("click", suaThongSoChungChi($('#specificationcode' + specificationcode).val(),$('#giaTriKiemTra' + specificationcode).val()));
		
		//$('.trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + stt).css('background-color', 'rgb(245, 245, 107) !important;');
		$('#trTblKiemTraDoiChieuKetCauVaThongSoKtXe' + specificationcode).attr('style', 'background-color: rgb(245, 245, 107) !important');
		$('#selLuaChonKetQua' + specificationcode).attr('style', 'background-color: rgb(245, 245, 107) !important; color: black !important');
		
		//chinh font chu
		$('#sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe' + specificationcode).attr('style', 'color: black !important');
		$('#sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe' + specificationcode).attr('style', 'color: black !important');
		
		$('#giaTriDangKi_' + specificationcode).attr('style', 'background-color: rgb(245, 245, 107) !important; color: black !important');
		$('#giaTriKiemTra_' + specificationcode).attr('style', 'background-color: rgb(245, 245, 107) !important; color: black !important');
	}
	
}

function func_xacnhanPheDuyet() {
	func_huyPheDuyet();
	var specificationcode = document.getElementById('giaTriNhapStt').value;

	if (isThuocDmDataItem == "0") {
		var giaTriView = document.getElementById('giaTriNhapSuaDoi' + specificationcode).value;
		document.getElementById('giaTriKiemTra_' + specificationcode).value = giaTriView;
		document.getElementById('giaTriKiemTra' + specificationcode).value = giaTriView;
	} else if (isThuocDmDataItem == "1") {
		var giaTriId = document.getElementById('giaTriNhapSuaDoi' + specificationcode).value;
		var giaTriView = $('#giaTriNhapSuaDoi' + specificationcode + ' option[value="'+giaTriId+'"]').text();//document.getElementById('giaTriNhapSuaDoi' + specificationcode).selectedOptions[0].text;

		document.getElementById('giaTriKiemTra_' + specificationcode).value = giaTriView;
		document.getElementById('giaTriKiemTra' + specificationcode).value = giaTriId;
	}

}

var isSelectDouble = '0';

function checkSelLuaChonThongSoKtXe(stt) {
	if (isSelectDouble == '0') {
		isSelectDouble = '1';
	} else if (isSelectDouble == '1') {
		onChangeSelLuaChonThongSoKtXe(stt);
		isSelectDouble = '0';
	}
}

function showThongBaoMsg() {
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

function func_huyPheDuyet() {
	$('#div_WarningMsg').dialog('close');
}

function createGiaTriTraVe(code, name, isSelected) {
	var sCode = "'" + code + "'";
	var duLieu = '<input type="checkbox" id="giaTriNhapSuaDoi' + code + '" value="' + name + '" ' + isSelected + ' onclick="changeState(' + sCode + ')"/>' + name + '<br>';
	duLieu = duLieu + '<input type="hidden" id="hienThiGiaTriState' + code + '" value="' + name + '" />';
	duLieu = duLieu + '<input type="hidden" id="valueGiaTriState' + code + '" value="' + code + '" />';
	return duLieu;
}

function createListGiaTriTraVe(giaTriCode, giaTriDk) {
	var duLieu = '<input type="hidden" id="listValueGiaTriState" name="valueGiaTriState" value="' + giaTriCode + '"/>';
	duLieu = duLieu + '<input type="hidden" id="listHienThiGiaTriState" name="hienThiGiaTriState" value="' + giaTriDk + '"/>';
	return duLieu;
}

function createInput(specificationcode, giaTriDangKi) {
	return '<input type="text" id="giaTriNhapSuaDoi' + specificationcode + '" name="giaTriNhapSuaDoi" value="' + giaTriDangKi + '" style="width: 339px;height: 30px"/>';
}

function createInputGiaTriNhapStt(specificationcode) {
	return '<input type="hidden" id="giaTriNhapStt" name="giaTriNhapStt" value="' + specificationcode + '" />';
}

function showThongBaoMsgNotThongSo() {
	$("#div_WarningMsgNotThongSo").dialog({
		title:'Xác nhận thay đổi',
        resizable: false,
        modal: true,
        width: '400px',
        
        closeOnEscape: false,
        open: function() {
            jQuery('.ui-widget-overlay').bind('click', function() {
                $('#div_WarningMsgNotThongSo').dialog('close');
            });
        }
	});
}
function func_huyPheDuyetNotThongSo() {
	 $('#div_WarningMsgNotThongSo').dialog('close');
}

function func_xacnhanNotThongSo() {
	$('#div_WarningMsgNotThongSo').dialog('close');
	
	if (isThuocDmDataItem == "2") {
		var giaTriId = document.getElementById('giaTriNhapSuaDoi').value;
		var giaTriView = $('#giaTriNhapSuaDoi option[value="'+giaTriId+'"]').text();//document.getElementById('giaTriNhapSuaDoi').selectedOptions[0].text;

		document.getElementById('loaiPhuongTienValue').value = giaTriView;
		document.getElementById('loaiPhuongTienCode').value = giaTriId;
	} else if (isThuocDmDataItem == "3") {
		var giaTriId = document.getElementById('giaTriNhapSuaDoi').value;
		var giaTriView = $('#giaTriNhapSuaDoi option[value="'+giaTriId+'"]').text();//document.getElementById('giaTriNhapSuaDoi').selectedOptions[0].text;

		document.getElementById('nhanHieuValue').value = giaTriView;
		document.getElementById('nhanHieuCode').value = giaTriId;
	}


	
}

function changeState(dataId) {

	var isCheck = document.getElementById('giaTriNhapSuaDoi' + dataId).checked;
	var valueGiaTriState = document.getElementById('listValueGiaTriState').value;
	var hienThiGiaTriState = document.getElementById('listHienThiGiaTriState').value;

	var valueCheck = document.getElementById('giaTriNhapSuaDoi' + dataId).value;

	if (isCheck == true) {
		valueGiaTriState = valueGiaTriState + dataId + ",";
		hienThiGiaTriState = hienThiGiaTriState + valueCheck + ",";
	} else {
		var res = valueGiaTriState.replace(dataId + ",", "");
		valueGiaTriState = res;
		hienThiGiaTriState = hienThiGiaTriState.replace(valueCheck + ",", "");
	}

	document.getElementById('listValueGiaTriState').value = valueGiaTriState;
	document.getElementById('listHienThiGiaTriState').value = hienThiGiaTriState;

	document.getElementById('nuocSanXuatValue').value = hienThiGiaTriState;
	document.getElementById('nuocSanXuatCode').value = valueGiaTriState;
}
