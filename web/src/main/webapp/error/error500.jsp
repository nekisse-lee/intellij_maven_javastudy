<%--
  Created by IntelliJ IDEA.
  User: nekisse
  Date: 2018. 12. 4.
  Time: 오후 6:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>500</title>
</head>
<body>
<h4>심각한 오류 발생 !</h4>
<p>관리자에게 문의하세요    00000-0----0000</p>
<p><%=exception.toString()%></p>
</body>
</html>
