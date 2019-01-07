<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tf" tagdir="/WEB-INF/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: nekisse
  Date: 2019-01-07
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><spring:message code="member.info"/></title>
</head>
<body>

<p>아이디: ${member.id}</p>
<p>이메일: ${member.email}</p>
<p>이름:${member.name}</p>
<p>가입일 : <tf:formatDateTime value="${member.registerDateTime}" pattern="yyyy-MM-dd"/> </p>

</body>
</html>
