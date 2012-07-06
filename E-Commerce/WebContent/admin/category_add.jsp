<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="/common/header.jsp" />
</head>
<body>
	<div id="header"></div>
	<div id="global">
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
	</div>
</body>
</html>