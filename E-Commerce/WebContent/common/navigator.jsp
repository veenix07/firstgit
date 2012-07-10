<%@include file="/common/taglib.jsp"%>

<div id="navigator">
	<span style="font-weight: bold; font-size: 1.5em;">&nbsp;Categories</span>
	<s:iterator value="listCategory">
		<span valign="middle"><a href="?cat_id=${id }">${categoryName
				}</a></span>
	</s:iterator>
</div>