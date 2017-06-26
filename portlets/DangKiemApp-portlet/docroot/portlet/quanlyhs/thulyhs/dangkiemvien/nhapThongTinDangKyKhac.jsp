<%@page import="com.liferay.portal.kernel.util.ArrayUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<div id="div_uploadDocOther_<%=wildcard%>">
	<br/>			
	<fieldset style="border:1px solid #ccc; margin-left: 10px; margin-right: 10px; padding-left: 10px; padding-right: 10px; padding-bottom: 10px;">
	<p style="clear: both"></p>
		<div style="float: left; width: 48%; margin-right: 4%">
		<table style="width: 100%;" border="0px">
			<tr>
				<td>
					<img id="imgAddOther_<%=wildcard%>" onclick="func_addDmOther('<%=wildcard%>')"  class="hastipsy" style="display: inline;" 
							title="Click vào đây để thêm mới file khác." src="<%=request.getContextPath()%>/img/icon_add.png"/>
				</td>
				<td>
					<img id="imgRemoveOther_<%=wildcard%>" onclick="func_removeDmOther('<%=wildcard%>')" class="hastipsy" style="display: inline;" 
							title="Click vào đây để loại bỏ file khác này." src="<%=request.getContextPath()%>/img/icon_remove.png"/>
				</td>
				<td>
					<input type="file" class="validatorOtherFile" id="attachment_<%=wildcard%>" name="attachment_<%=wildcard%>">
				</td>
			</tr>
		</table>
		</div>
	</fieldset>
</div>	










