<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	sfHover = function() {
		var sfEls = document.getElementById("navbar")
				.getElementsByTagName("li");
		for ( var i = 0; i < sfEls.length; i++) {
			sfEls[i].onmouseover = function() {
				this.className += " hover";
			}
			sfEls[i].onmouseout = function() {
				this.className = this.className.replace(
						new RegExp(" hover\\b"), "");
			}
		}
	}
	if (window.attachEvent)
		window.attachEvent("onload", sfHover);
</script>
<style type="text/css">
#navbar li:hover ul, #navbar li.hover ul {
	display: block;
	position: absolute;
	margin: 0;
	padding: 0; }
#navbar li:hover li, #navbar li.hover li {
	float: none; }
#navbar li:hover li a, #navbar li.hover li a {
	background-color: #69f;
	border-bottom: 1px solid #fff;
	color: #000; }
</style>
</head>
<body>
<ul id="navbar">
	<li><a href="#">Item One</a><ul>
		<li><a href="#">Subitem One</a></li>
		<li><a href="#">Second Subitem</a></li>
		<li><a href="#">Numero Tres</a></li></ul>
	</li>
	<li><a href="#">Item One</a><ul>
		<li><a href="#">Subitem One</a></li>
		<li><a href="#">Second Subitem</a></li>
		<li><a href="#">Numero Tres</a></li></ul>
	</li>
	<li><a href="#">Item One</a><ul>
		<li><a href="#">Subitem One</a></li>
		<li><a href="#">Second Subitem</a></li>
		<li><a href="#">Numero Tres</a></li></ul>
	</li>
</ul>
</body>
</html>