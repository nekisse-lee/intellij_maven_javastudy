<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
 Created by IntelliJ IDEA.
 User: nekisse
 Date: 29/12/2018
 Time: 9:41 PM
 To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><spring:message code="member.register"/></title>
</head>
<body>


<p>
    <spring:message code="register.done"
                    arguments="${regReq.name}"/>
</p>
<p><a href="<c:url value="/main"/>">
    [<spring:message code="go.main"/>]
</a>
</p>

</body>
</html>
