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
		<div id="navigator">
			<span style="font-weight: bold;font-size: 1.5em;">&nbsp;Categories</span>
			<s:iterator value="listCategory">
				<span valign="middle"><a href="?cat_id=${id }">${categoryName }</a></span>
			</s:iterator>
		</div>
		<div id="content">
			<!-- div align="center">
				Select Category : <select name="categoryId"
					onchange="window.open('index.html?cat_id='+this.options[this.selectedIndex].value,'_top')">
					<option value="-1">- Please Select Category -</option>
					<option value="0">All Categories</option>
					<s:iterator value="listCategory">
						<option value="${id }">${categoryName }</option>
					</s:iterator>
				</select>
			</div -->
			<br />
			<s:iterator value="listProduct">
				<div id="item">
					<a href="show_details.html?prod_id=${id }"><img width="150"
						height="150" src="<s:property value="coverImage.img_url"/>" /></a>
					<center>
						<s:property value="productCode" />
					</center>
				</div>
			</s:iterator>
			<br />
			<p align="center" class="clear">${fn:length(listProduct) }
				product(s) available..</p>
		</div>
</body>
</html>