<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nekisse
  Date: 04/01/2019
  Time: 2:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><spring:message code="change.pwd.title"/></title>
</head>
<body>

<form:form>
    <p>
        <label><spring:message code="currentPassword"/>
            <form:input path="currentPassword"/>
            <form:errors path="currentPassword"/>
        </label>
    </p>
    <p>
        <label><spring:message code="newPassword"/>
            <form:input path="newPassword"/>
            <form:errors path="newPassword"/>
        </label>
    </p>
    <input type="submit" value="<spring:message code="change.btn"/> "/>
</form:form>

</body>
</html>
