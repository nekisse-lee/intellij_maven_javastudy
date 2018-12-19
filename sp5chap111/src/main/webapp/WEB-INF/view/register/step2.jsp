<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
<h2>회원 정보 입력</h2>

<form:form action="step3" modelAttribute="registerRequest">
    <p>
        <label><spring:message code="email"/> : <br>
            <form:input path="email" />
            <form:errors path="email" element="div"/>
        </label>
    </p>
    <p>
        <label>이름:<br>
            <form:input path="name" />
            <form:errors path="name"/>
        </label>
    </p>
    <p>
        <label>비밀번호:<br>
            <form:password path="password" />
            <form:errors path="password"/>
        </label>
    </p>
    <p>
        <label>비밀번호 확인:<br>
            <form:password path="confirmPassword" />
            <form:errors path="confirmPassword"/>
        </label>
    </p>
    <input type="submit" value="<spring:message code="register.btn"/>">

</form:form>

</body>
</html>
