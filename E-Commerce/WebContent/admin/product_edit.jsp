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
	<jsp:include page="admin_navigator.jsp" />
	<div id="content">
		<div align="center">
			Select Category : <select name="categoryId"
				onchange="window.open('product_edit.html?cat_id='+this.options[this.selectedIndex].value,'_top')">
				<option value="-1">- Please Select Category -</option>
				<option value="0">All Categories</option>
				<s:iterator value="listCategory">
					<option value="${id }">${categoryName }</option>
				</s:iterator>
			</select>
		</div>
		<br />
		<table cellspacing="10px">
			<tr>
				<th>Product Code</th>
				<th>Update Item</th>
				<th>Delete Item</th>
				<th>Sold Out</th>
			</tr>
			<s:iterator value="listProduct">
				<tr>
					<td><s:property value="productCode" /></td>
					<td><a href="product_upd.html?prod_id=${id }">Update</a></td>
					<td><a href="product_del.html?prod_id=${id }">Delete</a></td>
					<td><a href="product_sold.html?prod_id=${id }">Sold Out</a></td>
				</tr>
			</s:iterator>
		</table>
		<p align="center" class="clear">${fn:length(listProduct) }
			product(s) available..</p>
	</div>
</body>
</html>