<%@include file="/common/taglib.jsp"%>
<jsp:include page="admin_navigator.jsp" />
<div id="content">
	<s:form action="category_add" method="post">
		<table>
			<tr>
				<td>Category Name</td>
				<td>:</td>
				<td><s:textfield name="category_name" size="20" maxlength="18" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td colspan=2><s:submit /></td>
			</tr>
		</table>
	</s:form>
</div>