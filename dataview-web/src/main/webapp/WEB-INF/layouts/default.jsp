<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Showcase示例:<sitemesh:title/></title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <meta http-equiv="Cache-Control" content="no-store"/>
    <meta http-equiv="Pragma" content="no-cache"/>
    <meta http-equiv="Expires" content="0"/>

    <link href="${ctx}/static/bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet"/>
    <link href="${ctx}/static/styles/default.min.css" type="text/css" rel="stylesheet"/>
    <script src="${ctx}/static/jquery/jquery-1.9.1.min.js" type="text/javascript"></script>
    <%--<script type="text/javascript" src="${ctx}/static/angular/angular.js"></script>       ÷--%>
    <script src="http://code.angularjs.org/angular-1.0.1.min.js"></script>
    <sitemesh:head/>

</head>

<body>
<div class="container">
    <%@ include file="/WEB-INF/layouts/header.jsp" %>
    <div class="row">
        <%@ include file="/WEB-INF/layouts/left.jsp" %>
        <div id="main" class="col-md-10">
            <sitemesh:body/>
        </div>
    </div>
    <%@ include file="/WEB-INF/layouts/footer.jsp" %>
</div>
<script src="${ctx}/static/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>