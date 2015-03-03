<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html ng-app>
<head>
    <title>应用监控演示</title>
    <script>
        $(document).ready(function() {
            $("#angular-tab").addClass("active");
        });
    </script>
</head>

<body>
<h1>应用监控演示</h1>

<h2>用户故事</h2>

<p>Nothing here {{'yet' + '!'}}</p>
Hello {{'World'}}!
</body>
</html>