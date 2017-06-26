//select box chon thong so ki thuat
function businessChonThongSoKiThuat() {
	console.log("==showDialogThongBaoMsgDSXe ==");
	//xet các gia tri vào dialog
	var selectOption = $("select#thongSoKiThuatPhuongTien");
	if (selectOption.val() == "") {
		return;
	}
	
	//clear text
	$('#nameRowMessage').text('');
	
	var arrayValue = selectOption.val().split(",");
	
	//set label cua dialog
	$('#nameThongSoKiThuat').text($("#thongSoKiThuatPhuongTien option:selected").text());
	
	//khong thuoc danh muc
	if (arrayValue[1] === '-1') {
		console.log('Không thuộc danh mục');
		//an danh sach,
		$('#rowDanhSach').hide();
		
		var selectDieuKiem = $('#dieuKienTimKiem');
		selectDieuKiem.find('option').remove();
		//<option id="like">like</option>
		$('<option>').val("=").text("=").appendTo(selectDieuKiem);
		$('<option>').val("like").text("like").appendTo(selectDieuKiem);
		
		//hien gia tri nhap
		$('#giaTriTimKiem').show();
		
		//thông số ẩn cho dialog
		$('#thuocDanhMuc').val('khong');
	} else {
		//thuoc danh muc
		var alterName = $("select#loaiThuTuc").val();
		
		console.log('Thuộc danh mục thông số kĩ thuật dataGroupId==' + arrayValue[1] + "==alterName==" + alterName);
		//thuc hien ajax, load cac thong so
		callAjaxThongSoKiThuatDanhMuc(arrayValue[1], alterName);
		//
		$('#rowDanhSach').show();
		
		//dieu kien tim kiem la bang. disable gia tri nhap vao
		var selectDieuKiem = $('#dieuKienTimKiem');
		selectDieuKiem.find('option').remove();
		//<option id="like">like</option>
		$('<option>').val("=").text("=").appendTo(selectDieuKiem);
		
		//an gia tri nhap
		$('#giaTriTimKiem').hide();
		
		//thông số ẩn cho dialog
		$('#thuocDanhMuc').val('co');
	}
	showDialog();
}



function showDialog() {
	//bat dialog cach thanh phan trong dialog can giua cua window
	//$("#dialogChonDanhMucThongSoKt").position({
	//	my: "center",
	//	at: "center",
	//	of: window
	//});
	
	$("#dialogChonDanhMucThongSoKt").dialog({
		title:'Thông số kĩ thuật',
		resizable: false,
		modal: true,
		width: '500px',
		closeOnEscape: false,
		open: function() {
			jQuery('.ui-widget-overlay').bind('click', function() {
				$('#dialogChonDanhMucThongSoKt').dialog('close');
			});
		}
	});
}

var index = 0;


//xac nhan chon thong so ki thuat
function xacNhanChonThongSoKiThuat() {
	console.log("==xacNhanChonThongSoKiThuat ==");
	
	var box = $('#divCfgTechnicalspec');
	
	var isThuocDanhMuc = $('#thuocDanhMuc').val();
	var cfgName = $('#nameThongSoKiThuat').text();
	var valDanhSachDm = $("select#danhSachThongSoKiThuat").val();
	
	var cfgDieuKien = $("select#dieuKienTimKiem").val();
	var cgfValue = '';
	
	if (isThuocDanhMuc === 'co') {
		if (valDanhSachDm.length === 0) {
			cgfValue = $('#giaTriTimKiem').val();
			var textHtml = createItemBox(index, cfgName, cgfValue, cfgDieuKien);
			$(textHtml).appendTo(box);
		} else {
			cgfValue = valDanhSachDm;
			var textHtml = createItemBox(index, cfgName, cgfValue, cfgDieuKien);
			$(textHtml).appendTo(box);
		}
	} else if (isThuocDanhMuc === 'khong') {
		cgfValue = $('#giaTriTimKiem').val();
		var textHtml = createItemBox(index, cfgName, cgfValue, cfgDieuKien);
		$(textHtml).appendTo(box);
	}
	index = index + 1;
	closeDialog();
}

//ham kiem tra, xoa thong so ki thuat da chon
function kiemTraItemBox(idItemBox) {
	console.log('kiemTraItemBox---' + idItemBox);
	var box = $('#itemBox_' + idItemBox);
	box.remove();
}

//close dialog chon thong so ki thuat
function closeDialog() {
	$('#dialogChonDanhMucThongSoKt').dialog('close');
	//clear dialog
	$('#thuocDanhMuc').val('');
}

function createItemBox(index, cfgName, cgfValue, cfgDieuKien) {
	var text = '';
	text = text + '<div id="itemBox_'+index+'" class="divItemBox">';
	text = text + '<input type="text" id="cfgName'+index+'" name="cfgName'+index+'" class="form-control-find itemBox1" value="'+cfgName+'"/>';
	text = text + '<input type="text" id="cfgValue'+index+'" name="cfgValue'+index+'" class="form-control-find itemBox2" value="'+cgfValue+'">';
	text = text + '<input type="text" id="cfgDieuKien'+index+'" name="cfgDieuKien'+index+'" class="form-control-find itemBox3" value="'+cfgDieuKien+'">';
	text = text + '<img src="/DangKiemApp-portlet/img/s4.png" class="itemBox4" onclick="kiemTraItemBox('+index+')">';
	text = text + '</div>';
	return text;
}