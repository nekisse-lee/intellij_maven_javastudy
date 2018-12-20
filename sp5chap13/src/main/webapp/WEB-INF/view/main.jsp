<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nekisse
  Date: 2018. 12. 19.
  Time: 오후 4:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>메인</title>
</head>
<body>
<c:if test="${empty authInfo}">
    <p>환영합니다.</p>
    <p><a href="<c:url value="/register/step1"/> "> [회원 가입하기]</a>
        <a href="<c:url value="login"/> ">[로그인]</a>
    </p>
</c:if>

<c:if test="${!empty authInfo}">
    <p>${authInfo.name}님, 환영합니다.</p>
    <p>
        <a href="<c:url value="/edit/changePassword"/> ">[비밀번호 변경]</a>
        <a href="<c:url value="/logout"/> ">[로그 아웃]</a>
    </p>
</c:if>
</body>
</html>
