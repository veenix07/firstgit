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
			<div align="center">
				Select Category : <select name="categoryId"
					onchange="window.open('category_post.html?cat_id='+this.options[this.selectedIndex].value,'_top')">
					<option value="-1">- Please Select Category -</option>
					<s:iterator value="listCategory">
						<option value="${id }">${categoryName }</option>
					</s:iterator>
				</select>
			</div>
			<br />
			<textarea rows="40" cols="83">${catPost }</textarea>
		</div>
	</div>
</body>
</html>