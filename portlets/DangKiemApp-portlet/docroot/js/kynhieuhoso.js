
	function kyBanCoYeuNhieuHS() {
		//disable the button after user submitted
		document.getElementById('kyBanCoYeu').disabled = true;
		
		var list = $('#listHoSoThuTucId').val().trim().split(",").filter(function(item){return item !== '';});
		
		if(list.length > 0) {
			//disable the button after user submitted
			document.getElementById('divXacNhan').style.display = "none";
			document.getElementById("thongBaoLoading").innerHTML = "<b>Đang thực hiện. Vui lòng chờ........</b>";

			var check = 0;
			for (var i = 0; i < list.length; i ++) {
				
				kyBanCoYeu1HS(list[i]);
				var j=i+1;
				document.getElementById("thongBaoLoading").innerHTML = "<b>Đã ký "+j+"/"+list.length+". Vui lòng chờ........</b>";
			}
			
			if(check==0){
				kyNhieuHoSo=1;
			}
		} else {
			alert("Chưa lựa chọn hồ sơ ký duyệt .");
			return;
		}
	}
	
	function kyBanCoYeu1HS(hoSoThuTucId) {
		$.ajax({
			type : 'POST',
			url : url,
			async: false,//bat dong bo = fale, dong bo voi client
			cache : false,
			data : {
				listHoSoThuTucId : hoSoThuTucId, type: 'getComputerHash',
				DIEU_KIEN_CHUYEN_DICH : dieuKienChuyenDich, TTHC_THUTUCHANHCHINH_ID : idthuTucHanhChinh
			},
			success : function(data) {
				var jsonData = JSON.parse(data);
				var hashComputers = jsonData.hashComputers;
				var signFieldNames = jsonData.signFieldNames;
				var fileNames = jsonData.fileNames;
				var msgs = jsonData.msg;
				
				if(plugin().valid){
					for ( var i = 0; i < hashComputers.length; i++) {
						var hashComputer = hashComputers[i];
						var signFieldName = signFieldNames[i];
						var fileName = fileNames[i];
						var msg = msgs[i];
						if(msg == 'success') {
							var code = plugin().Sign(hashComputer);
							if(code ===0 || code === 7){
								var sign = plugin().Signature;
								completeSignature(sign, signFieldName, fileName, hoSoThuTucId);
							}else{
								alert(plugin().ErrorMessage);
							}
						}else{
							alert(msg);
						}
					}
				} else {
					alert("Plugin is not working");
				}
			}
		});
	}
	
	function completeSignature(sign, signFieldName, fileName, hoSoThuTucId) {
		$.ajax({
			type : 'POST',
			url : complateSignatureURL,
			async: false,//bat dong bo = fale, dong bo voi client
			cache : false,
			data : {
				sign : sign,
				signFieldName : signFieldName,
				fileName : fileName,
				hoSoThuTucId: hoSoThuTucId
			},
			success : function(data) {
				if(data.msg == 'success'){
					var signerURL = data.signerURL;
					$("#fileContent_" + data.hoSoThuTucId).val(signerURL);
				} else {
					alert(data.msg);
				}
			}
		});
	}
	