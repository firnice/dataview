<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<div id="leftbar" class="col-md-2">
	<h1>综合演示</h1>
	<div class="submenu">
		<a id="account-tab"href="${ctx}/account/user/">帐号管理</a>
	</div>
	<h1>独立演示</h1>
	<div class="submenu">
		<a id="monitor-tab" href="${ctx}/story/monitor">数据库管理</a>
		<a id="angular-tab" href="${ctx}/story/angular">angular演示</a>
	</div>
</div>