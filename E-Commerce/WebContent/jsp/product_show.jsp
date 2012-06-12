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
	<table>
		<s:iterator value="listProduct">
			<tr>
				<td><s:property value="productCode" /></td>
				<td><s:property value="productDesc" /></td>
				<td><s:property value="productPrice" /></td>
				<td><s:iterator value="images"><s:property value="img_url"/>;</s:iterator></td>
				<!-- <td><a href="product_delete.html?id_del=${id }">Delete</a></td> -->
			</tr>
		</s:iterator>
	</table>
	<a href="product_add_form.html">Add Product</a>
</body>
</html>