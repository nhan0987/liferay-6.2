function dongDauChungChi() {
	func_huyPheDuyetDongDau();
	
	var listVehicleRecordId=document.getElementById('listVehicleRecordId').value;
	var list = listVehicleRecordId.trim().split(",").filter(function(item){return item !== '';});
	
	if(list.length > 0) {
		//disable the button after user submitted
		document.getElementById('divXacNhan').style.display = "none";
		document.getElementById("thongBaoLoading").innerHTML = "<b>Đang thực hiện. Vui lòng chờ........</b>";

		var check = 0;
		for (var i = 0; i < list.length; i ++) {
			
			dongDauBCYChungChiTungCai1(list[i],check,idPhieuXuLyPhu,idHoSoThuTuc,dieuKienChuyenDich);	
			var j=i+1;
			document.getElementById("thongBaoLoading").innerHTML = "<b>Đã ký "+j+"/"+list.length+". Vui lòng chờ........</b>";
		}
		if(check==0){
			checkRewrite=1;
		}
	} else {
		alert('Không có hồ sơ để thực hiện !');
	}
}

function dongDauBCYChungChiTungCai1(listVehicleRecordId,check,idPhieuXuLyPhu,idHoSoThuTuc,dieuKienChuyenDich) {

	$.ajax({
		type : 'POST',
		url : url,
		async: false,//bat dong bo = fale, dong bo voi client
		cache : false,
		data : {
			vehicleRecordId : listVehicleRecordId, type: 'dongDauBCYChungChi'
		},
		success : function(data) {
			var jsonData = JSON.parse(data);
			var hashComputers = jsonData.hashComputers;
			var signFieldNames = jsonData.signFieldNames;
			var fileNames = jsonData.fileNames;
			var msgs = jsonData.msg;
			var arrVehicleId = jsonData.idvehicle;
			
			if(plugin().valid) {
											
				for ( var i = 0; i < hashComputers.length; i++) {
									
					var hashComputer = hashComputers[i];
					var code = plugin().Sign(hashComputer);
					if(code===0 || code===7){			
						var sign = plugin().Signature;
						var signFieldName = signFieldNames[i];
						var fileName = fileNames[i];
						var msg = msgs[i];
						var vehicleId = arrVehicleId[i];
						if(msg == 'success') {
							try {

								kyKhongSubmitCho1(sign, signFieldName, fileName, vehicleId,idPhieuXuLyPhu,idHoSoThuTuc,dieuKienChuyenDich);
								}
								catch(err) {
								   alert("err.message:::::::::::::::::::" + err.message);
								  check =1;
								}
						}else{
							check =1;
							alert(msg);
						}	
					}else{
						check =1;
						alert("loi::::::::::::::" + plugin().ErrorMessage);
					}
				}
			} else {
				check =1;
				alert("Plugin is not working");
			}
		}
	});
}


function kyKhongSubmitCho1(sign, signFieldName, fileName, id,idPhieuXuLyPhu,idHoSoThuTuc,dieuKienChuyenDich) {		
	$.ajax({
		type : 'POST',
		url : url,
		async: false,//bat dong bo = fale, dong bo voi client
		cache : false,
		data : {
			type:'signatureDongDauComplete',
			sign:sign,
			signFieldName:signFieldName,
			fileName:fileName,
			vehicleRecordId:id,
			idPhieuXuLyPhu:idPhieuXuLyPhu,
			idHoSoThuTuc:idHoSoThuTuc,
			dieuKienChuyenDich:dieuKienChuyenDich
		},
		success : function(data) {
			
			var jsonData = JSON.parse(data);
			var msg = jsonData.msg;
			if(msg == 'success'){
				
			}else{
				showThongBaoMsgKySo();
			}
		},
		error: function(){
			alert('ky so false');
		}
	});
}