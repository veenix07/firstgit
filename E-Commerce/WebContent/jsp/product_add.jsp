<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="product_add" method="post">
		<table>
			<tr>
				<td>Product Code</td>
				<td>:</td>
				<td><s:textfield name="inputProduct.productCode" /></td>
			</tr>
			<tr>
				<td>Product Description</td>
				<td>:</td>
				<td><s:textarea name="inputProduct.productDesc" cols="30"
						rows="5"></s:textarea></td>
			</tr>
			<tr>
				<td>Product Price</td>
				<td>:</td>
				<td><s:textfield name="inputProduct.productPrice" /></td>
			</tr>
			<tr>
				<td>Images</td>
				<td></td>
				<td><s:textarea name="inputImages" cols="30" rows="5"></s:textarea></td>
			</tr>
		</table>
		<s:submit />
	</s:form>
</body>
</html>