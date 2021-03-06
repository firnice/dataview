<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
    <title>应用监控演示</title>
    <script>
        $(document).ready(function () {
            $("#manager-tab").addClass("active");
        });
    </script>
</head>


<body>


<!-- Button trigger modal -->

<form class="form-search" action="#">
    <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
        添加
    </button>
    <button type="submit" id="query_btn" class="btn btn-primary btn-lg">
        查询
    </button>
</form>

<table class="table table-striped">
    <thead>
    <tr>
        <td>
            driver
        </td>
        <td>
            url
        </td>
        <td>
            username
        </td>
        <td>
            password
        </td>

    </tr>
    </thead>
    <tbody>

    <c:forEach items="${databases}" var="database">
        <tr>
            <td>${database.driver}&nbsp;</td>
            <td>${database.urlstr}&nbsp;</td>
            <td>${database.username}&nbsp;</td>
            <td>${database.userpassword}&nbsp;</td>
        </tr>
    </c:forEach>
    </tbody>
</table>


<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">Modal title</h4>
            </div>
            <form id="form" modelAttribute="dataSourceFactoryDto" action="${ctx}/database/manager/save" method="post"
                  class="form-horizontal">
                <div class="modal-body">

                    <div class="form-group">
                        <label for="input_driver" class="col-sm-2 control-label">driver</label>

                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="input_driver" name="driver"
                                   placeholder="driver">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="input_urlstr" class="col-sm-2 control-label">urlstr</label>

                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="input_urlstr" name="urlstr"
                                   placeholder="urlstr">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="input_username" class="col-sm-2 control-label">username</label>

                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="input_username" name="username"
                                   placeholder="username">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="input_userpassword" class="col-sm-2 control-label">userpassword</label>

                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="input_userpassword" name="userpassword"
                                   placeholder="userpassword">
                        </div>
                    </div>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" onclick="save()">Save changes</button>
                </div>
            </form>
        </div>
    </div>
    L
</div>


<script>
    function save() {
        $.post('${ctx}/database/manager/save', $("#form").serialize(), function (data) {
            if (data == 'sucess') {
                $('#myModal').modal('hide')
                alert("sucess!")
                $("#query_btn").click();
            }})


    }


    $(function () {

        $("#query_btn").bind("click", function () {

        })

    });
</script>
</body>
</html>