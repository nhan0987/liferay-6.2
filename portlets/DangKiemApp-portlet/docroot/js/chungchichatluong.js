// signing digital
	function kyBCYChungChi() {
		//disable the button after user submitted
		document.getElementById('kyBanCoYeu').disabled = true;
		document.getElementById('divXacNhan').style.display = "none";
		document.getElementById("thongBaoLoading").innerHTML = "<b>Đang thực hiện. Vui lòng chờ........</b>";
		
		//var listHoSoThuTucId=idHoSoThuTuc+",";
		var listVehicleRecordId=document.getElementById('listVehicleRecordId').value;
		$.ajax({
			type : 'POST',
			url : url,
			async: false,//bat dong bo = fale, dong bo voi client
			cache : false,
			data : {
				vehicleRecordId : listVehicleRecordId, type: 'kyBCYChungChi',
				idPhieuXuLyPhu : idPhieuXuLyPhu, idHoSoThuTuc : idHoSoThuTuc, dieuKienChuyenDich : dieuKienChuyenDich				
			},
			success : function(data) {
				//if(true){
					var jsonData = JSON.parse(data);
					var hashComputers = jsonData.hashComputers;
					var signFieldNames = jsonData.signFieldNames;
					var fileNames = jsonData.fileNames;
					var msgs = jsonData.msg;					
					var arrVehicleId = jsonData.idvehicle;	
					var check =0;
					if(plugin().valid) {
						document.getElementById("thongBaoLoading").innerHTML = "<b>Đã tạo xong phôi biên bản. Vui lòng chờ........</b>";
						for ( var i = 0; i < hashComputers.length; i++) {						
							var j=i+1;
							document.getElementById("thongBaoLoading").innerHTML = "<b>Đã ký "+j+"/"+hashComputers.length+". Vui lòng chờ........</b>";	
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
										
										kyKhongSubmit(sign, signFieldName, fileName, vehicleId);
										
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
		
					if(check==0){
						checkRewrite=1;
						/*document.getElementById('<portlet:namespace/>kyXacNhanKiemTra').submit();*/
						//summitKySo();
						
						 //document.getElementById('_quanlyhosoaction_WAR_DangKiemAppportlet_myForm').submit();
					}
					
	
				//}
			}
		});
	}
	
	function xoaCCsuadoi() {
		
	}
	
	function kySoChungChi() {
		//disable the button after user submitted
		document.getElementById('kyBanCoYeu').disabled = true;
		document.getElementById('divXacNhan').style.display = "none";
		document.getElementById("thongBaoLoading").innerHTML = "<b>Đang thực hiện. Vui lòng chờ........</b>";
		
		var list = $('#listVehicleRecordId').val().trim().split(",").filter(function(item){return item !== '';});
		
		var check =0;
		for (var i = 0; i < list.length; i ++) {
			
			kyBCYChungChiTungCai1(list[i],check);	
			var j=i+1;
			document.getElementById("thongBaoLoading").innerHTML = "<b>Đã ký "+j+"/"+list.length+". Vui lòng chờ........</b>";
		}
		if(check==0){
			checkRewrite=1;
		}
		
	}
	
	function kyBCYChungChiTungCai1(listVehicleRecordId,check) {
		//disable the button after user submitted
		
		$.ajax({
			type : 'POST',
			url : url,
			async: false,//bat dong bo = fale, dong bo voi client
			cache : false,
			data : {
				vehicleRecordId : listVehicleRecordId, type: 'kyBCYChungChi',
				idPhieuXuLyPhu : idPhieuXuLyPhu, idHoSoThuTuc : idHoSoThuTuc, dieuKienChuyenDich : dieuKienChuyenDich				
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
						var j=i+1;
					
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
									
									kySoUpdateLuon(sign, signFieldName, fileName, vehicleId);
									
									}
									catch(err) {
									   alert("err.message:::::::::::::::::::" + err.message);
									   check=1;
									}
							}else{
								check=1;
								alert(msg);
							}	
						}else{
							check=1;
							alert("loi::::::::::::::" + plugin().ErrorMessage);
			            }
		        
					}
				} else {
					check=1;	
					alert("Plugin is not working");
				}
			}
		});
	}
	
	

	function kySoUpdateLuon(sign, signFieldName, fileName, id) {		
		$.ajax({
			type : 'POST',
			url : url,
			async: false,//bat dong bo = fale, dong bo voi client
			cache : false,
			data : {
				type:'signatureComplete',
				sign:sign,
				signFieldName:signFieldName,
				fileName:fileName,
				vehicleRecordId:id
			},
			success : function(data) {
				
				//if(data){
					var jsonData = JSON.parse(data);
					var msg = jsonData.msg;
					if(msg == 'success'){
				
						//var signerURL = jsonData.signerURL;
					//	document.getElementById("vehicleRecord_kySo_" + id).value = signerURL;
						
					}else{
						/* console.log("______ky So RESULT= HAMINH KO KY SO DC="); */
						showThongBaoMsgKySo();
					}
					
				//}
			},
			  error: function(){
			    alert('ky so false');
			  }
		  
	});
}
	
	function kyKhongSubmit(sign, signFieldName, fileName, id) {		
		$.ajax({
			type : 'POST',
			url : url,
			async: false,//bat dong bo = fale, dong bo voi client
			cache : false,
			data : {
				type:'signature',
				sign:sign,
				signFieldName:signFieldName,
				fileName:fileName
			},
			success : function(data) {
				
				//if(data){
					var jsonData = JSON.parse(data);
					var msg = jsonData.msg;
					if(msg == 'success'){
				
						var signerURL = jsonData.signerURL;
						document.getElementById("vehicleRecord_kySo_" + id).value = signerURL;
						
					}else{
						/* console.log("______ky So RESULT= HAMINH KO KY SO DC="); */
						showThongBaoMsgKySo();
					}
					
				//}
			},
			  error: function(){
			    alert('ky so false');
			  }
		  
	});
}


	