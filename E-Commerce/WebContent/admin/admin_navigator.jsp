<%@include file="/common/taglib.jsp" %>
<div id="navigator">
	<span><a href="index.html"><img src="${pageContext.request.contextPath }/resources/images/home.png" width="25" height="25" />Home</a></span>
	<span><a href="product_add_form.html"><img src="${pageContext.request.contextPath }/resources/images/add.png" width="25" height="25" />Add Product</a></span>
	<span><a href="product_edit.html"><img src="${pageContext.request.contextPath }/resources/images/edit.png" width="25" height="25" />Edit Product</a></span>
	<span><a href="category_add_form.html"><img src="${pageContext.request.contextPath }/resources/images/add.png" width="25" height="25" />Add Category</a></span>
	<span><a href="category_post.html"><img src="${pageContext.request.contextPath }/resources/images/edit.png" width="25" height="25" />Get Post</a></span>
	<span><a href="<c:url value="/j_spring_security_logout" />"><img src="${pageContext.request.contextPath }/resources/images/exit.png" width="25" height="25" />Logout</a></span>
</div>