<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
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
			<s:form action="product_add" method="post">
				<table>
					<tr>
						<td>Product Code</td>
						<td>:</td>
						<td><s:textfield name="inputProduct.productCode"
								onkeyup="this.value=this.value.toUpperCase()" /></td>
					</tr>
					<tr>
						<td>Product Category</td>
						<td>:</td>
						<td><s:select name="categoryId" list="listCategory"
								headerKey="-1" headerValue="- Please Select Category -"
								listKey="id" listValue="categoryName" /></td>
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
						<td>Images URL<br /> <small>(Separate Each URL <br />By
								';')
						</small></td>
						<td>:</td>
						<td><s:textarea name="inputImages" cols="30" rows="5"></s:textarea></td>
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