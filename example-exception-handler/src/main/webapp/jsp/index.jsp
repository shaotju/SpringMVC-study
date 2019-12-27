<%--
  Created by IntelliJ IDEA.
  User: shao
  Date: 2019/12/10
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="<%=basePath%>/userInfo" method="post">
        Name:<input type="text" id="name" name="name">
        <br>
        Age:<input type="text" name="age" id="age">
        <br>
        Birth:<input type="text" id="birth" name="birth">
        <br>
        <input type="submit">
    </form>
</body>
</html>
