<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: nekisse
  Date: 28/12/2018
  Time: 4:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><spring:message code="member.register"/></title>
</head>
<body>
<h2><spring:message code="member.info"/></h2>
<form:form action="step3" modelAttribute="regReq">
    <p>
        <label><spring:message code="email"/>: <br/>
            <form:input path="email"/>
        </label>
    </p>
    <p>
        <label><spring:message code="name"/>: <br/>
            <form:input path="name"/>
        </label>
    </p>
    <p>
        <label><spring:message code="password"/> : <br/>
            <form:input path="password"/>
        </label>
    </p>
    <p>
        <label><spring:message code="password.confirm"/>: <br/>
            <form:input path="confirmPassword"/>
        </label>
    </p>
    <input type="submit" value="가입 완료"/>

</form:form>

</body>
</html>