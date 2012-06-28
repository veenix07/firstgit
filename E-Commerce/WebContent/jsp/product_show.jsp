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
	<h1 align="center">Products View</h1>
	<div id="content">
		<s:iterator value="listProduct">
			<div id="item">
				<img width="150" height="150"
					src="<s:property value="coverImage.img_url"/>" />
				<center>
					<s:property value="productCode" />
				</center>
			</div>
		</s:iterator>
		<p align="center" class="clear">${fn:length(listProduct) }
			product(s) available..</p>
	</div>
	<!-- <div id="navigator">
		<span><a href="product_add_form.html">Add Product</a></span> <span><a
			href="category_add_form.html">Add Category</a></span>
	</div> -->
</body>
</html>