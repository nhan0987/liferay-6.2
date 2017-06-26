function showThongBaoMsg(){
		console.log("==showThongBaoMsg ==");
		$("#div_WarningMsg").dialog({
			title:'Xác nhận phê duyệt',
	        resizable: false,
	        modal: true,
	        width: '400px',
	        
	        closeOnEscape: false,
	        open: function() {
	            jQuery('.ui-widget-overlay').bind('click', function() {
	                $('#div_WarningMsg').dialog('close');
	            });
	        }
		});
	}
	function func_xacnhanPheDuyet()
	{
		func_huyPheDuyet();
		var listVehicleRecordId=document.getElementById('listVehicleRecordId').value;
		if (listVehicleRecordId.trim()==''){
			alert("Chưa lựa chọn xe .");
			return;
		}else {
			console.log("==Danh sach==Ký số =="+listVehicleRecordId);
			getFileContentKySo(listVehicleRecordId);
			var arr = listVehicleRecordId.split(",");
			var length=arr.length;
			for (var i = 0; i < length; i++) {
			    if (arr[i].trim()!=''){
			    	//console.log("===================Cac Phan tu===================="+arr[i]);
				    //getDataKySo(arr[i]);
			    }
			}

		}
	}
	
	function func_huyPheDuyet()
	{
		 $('#div_WarningMsg').dialog('close');;
	}

	
	
	function getFileContentKySo(listVehicleRecordId) {
		
		$.ajax({
			type : 'POST',
			url : url,
			data : {
				vehicleRecordId : listVehicleRecordId, type: 'lanhDaoPhongKySo'
			},
			success : function(data) {
				// preferred
				var data2 = JSON.parse(data);
				// Xoa cac old item in select
				for ( var i = 0; i < data2.idvehicle.length; i++) {
					 console.log("******getDataKySo ==id vehicle====="+data2.idvehicle[i]);
					 console.log("******getDataKySo ==url vehicle====="+data2.urlvehicle[i]);

					 var urlFileResult=data2.urlvehicle[i];
				    if (urlFileResult.includes("default.pdf")){
				    	console.log("______urlFile KySo==default====="+urlFileKySo+"===== not set============");
						//document.getElementById("vehicleRecord_kySo_").innerHTML = data2.urlFile;
					}else {
						//console.log("Ky So cho file pdf=="+dataId);
						var urlFileKySo=location.protocol+'//'+location.hostname+(location.port ? ':'+location.port: '')+urlFileResult;
						//console.log("Ky So cho file pdf=="+dataId);
						console.log("______urlFile KySo=="+urlFileKySo);
					 	try {
				    		var content = document.caApplet.signPDF(location.protocol+'//'+location.hostname+(location.port ? ':'+location.port: '')+ "/DangKiemApp-portlet"+"/applet/uploadfile.jsp", urlFileKySo,location.protocol+'//'+location.hostname+(location.port ? ':'+location.port: '')+fileChuKy,typeKySo);
						
				    		console.log("______data content result=="+content);
				    		document.getElementById("vehicleRecord_kySo_"+data2.idvehicle[i]).value = content;
							if (content==''){
							}else{
							}
				    	} catch(ex) { 
				    		console.log("co loi xay ra==");
				    	}
					}

					 
				}
			}
		});
	}