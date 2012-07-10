<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
.errorblock {
	color: #ff0000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body onload="document.form1.j_username.focus();">
	<h3>Login With Username and Password (Custom)</h3>
	<s:actionmessage/>
	<s:actionerror/>
	${error }
	<c:if test="${not empty error }">
		<div class="errorblock">
			Your login attempt was not successful, try again.<br /> Caused :
			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message }
		</div>
	</c:if>
	<s:form name="form1" action="welcome" method="POST">
		<table>
			<tbody>
				<tr>
					<td>Username</td>
					<td>:</td>
					<td><s:textfield name="j_username" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><s:password name="j_password" /></td>
				</tr>
				<tr>
					<td colspan="2">&nbsp;</td>
					<td><s:reset /> <s:submit /></td>
				</tr>
			</tbody>
		</table>
	</s:form>
</body>
</html>