<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nekisse
  Date: 03/01/2019
  Time: 6:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><spring:message code="login.title"/></title>
</head>
<body>
<form:form modelAttribute="loginCommand">
    <form:errors />
    <p>
        <label><spring:message code="email"/>: <br>
            <form:input path="email"/>
            <form:errors path="email"/>
        </label>
    </p>
    <p>
        <label> <spring:message code="password"/>:<br>
            <form:password path="password"/>
            <form:errors path="password"/>
        </label>
    </p>
    <input type="submit" value="<spring:message code="login.btn"/> "/>
</form:form>

</body>
</html>
