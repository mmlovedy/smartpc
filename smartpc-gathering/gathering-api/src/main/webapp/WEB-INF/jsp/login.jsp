<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<% String contextPath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath(); %>
<head>
    <meta charset="UTF-8" />
    <title>登录</title>
    <link rel="stylesheet" href="<%=contextPath%>/static/css/bootstrap/bootstrap-theme.min.css" />
    <link rel="stylesheet" href="<%=contextPath%>/static/css/bootstrap/bootstrap.min.css" />
</head>
<body>
<h4 id="erro"></h4>
<form class="form-horizontal">
    <div class="form-group">
        <label for="username" class="col-sm-2 control-label">账号：</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="username" placeholder="user" />
        </div>
    </div>

    <div class="form-group">
        <label for="password" class="col-sm-2 control-label">密码：</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" id="password" placeholder="password" />
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="button" id="loginBtn" class="btn btn-default" onclick="login()">登录</button>
        </div>
    </div>
</form>
</body>
<script src="<%=contextPath%>/static/js/md5.min.js"></script>
<script src="<%=contextPath%>/static/js/login.js"></script>
<script src="<%=contextPath%>/static/js/jquery-1.8.3.js"></script>
</html>