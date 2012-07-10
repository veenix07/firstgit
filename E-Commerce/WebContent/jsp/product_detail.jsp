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
		<div id="content">
			<s:iterator value="listImages">
				<div id="item_detail">
					<img src="${img_url }" width="200" height="250">
				</div>
			</s:iterator>
			<div class="clear"></div>
			<table>
				<tr>
					<td>Product Code</td>
					<td>:</td>
					<td>${detailProduct.productCode }</td>
				</tr>
				<tr>
					<td>Product Price</td>
					<td>:</td>
					<td>${detailProduct.productPrice }</td>
				</tr>
				<tr>
					<td>Product Description</td>
					<td>:</td>
					<td>${detailProduct.productDesc }</td>
				</tr>
			</table>
			<center>
				<a href="index.html">Back to Product List</a>
			</center>
		</div>
</body>
</html>