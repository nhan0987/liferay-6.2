<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/portlet/init.jsp"%>
<%
String pdfURL="";
String urlFile = "";

System.out.println("FORM-TICH_HOP--------");

// Xoa session.
 HttpSession sHttpSession = PortalUtil.getHttpServletRequest(renderRequest).getSession();

	
	pdfURL="http://hanoi.dtt.vn:8045/DangKiemApp-portlet/export/TT442012BM09_28345.pdf";
	System.out.println("FORM----pdfURL---"+pdfURL);
	
	/* File Chu Ky */
	String signature ="/DangKiemApp-portlet/applet/nguyenthanhphong@vfa.gov.vn.png";
	int ATTPStatus=1;
%>

<style>
.portlet-layout {
border-collapse: collapse;
clear: both;
display: inline-table;
border-spacing: 0;
table-layout: fixed;
width: 100%;
}
.aui-w7-10, .aui-w70 {
  width: 100%;
  position: absolute;
  padding-left: 246px;
}
</style>

<portlet:actionURL name="signPDF" var="signPDFURL"/>
 <div class="egov-container">
 <div class="wd-main-content wd-page-staff">


<div id="viewFile">
	
</div>



<form action='<%=signPDFURL %>' method="POST" id='signedPDFForm'>


<input type='hidden' name='fileContent' id='fileContent' />
</form>

</div></div>
<body onload="Javascript:callApplet()">
</body>


<div>
<input type='button' hidden="true" value='Test' class="egov-button-normal" id='button-submit' style="border-radius: 5px; font-weight: bold;  height: 30px;  border: none;display: 'none'" onclick="Javascript:document.getElementById('signedPDFForm').submit()" />
	<applet name='caApplet' id='caApplet' width="0" height="0"
		code='com.ecoit.asia.EcoitApplet.class'
		archive='CAAppletSimple.jar,bcprov-jdk15on-1.48.jar,bcpkix-jdk15on-1.48.jar,commons-codec-1.5.jar,commons-io-2.4.jar,commons-lang3-3.1.jar,commons-logging-1.1.jar,commons-net-3.2.jar,dom4j-1.6.1.jar,itextpdf-5.4.2.jar,jacob-1.14.3.jar,jaxen-1.1.jar,log4j-1.2.13.jar,fontbox-1.8.10.jar,pdfbox-1.8.10.jar,xalan-2.7.1.jar,xmlsec-1.5.1.jar'
		codebase='/DangKiemApp-portlet/applet/'> </applet>

</div>

<script>
	function callApplet() {	
	 	try {
    		var content = document.caApplet.signPDF(location.protocol+'//'+location.hostname+(location.port ? ':'+location.port: '')+ "/DangKiemApp-portlet"+"/applet/uploadfile.jsp", '<%=pdfURL%>',location.protocol+'//'+location.hostname+(location.port ? ':'+location.port: '')+'<%=signature%>',<%=ATTPStatus%>);
		
			//alert("---data content=="+content);
			if (content==''){
				//alert("---data content=="+content);
				document.getElementById("viewFile").innerHTML = "Không thể ký số cho văn bản này !";
			}else{
				//var newElement = " <iframe src='https://docs.google.com/viewer?url="+content+"&embedded=true' width=\"100%\" height=\"500px\"  />";
				var newElement = " <iframe src='"+content+"' width=\"100%\" height=\"500px\"  />";
				
				document.getElementById("viewFile").innerHTML = newElement;
	    	
	   			document.getElementById('fileContent').value = content;
	   		
	   			//window.open("data:application/pdf;base64," + content,'_blank');
	   			document.getElementById('button-submit').hidden = '';
			}
   		
    	} catch(ex) { 
        	return false;
    	}
	}
</script>
