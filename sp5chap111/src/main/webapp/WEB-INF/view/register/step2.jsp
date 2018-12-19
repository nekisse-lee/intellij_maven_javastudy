<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
<h2>회원 정보 입력</h2>

<form:form action="step3" modelAttribute="registerRequest">
    <p>
        <label>이메일:<br>
            <form:input path="email" />
        </label>
    </p>
    <p>
        <label>이름:<br>
            <form:input path="name" />
        </label>
    </p>
    <p>
        <label>비밀번호:<br>
            <form:password path="password" />
        </label>
    </p>
    <p>
        <label>비밀번호 확인:<br>
            <form:password path="confirmPassword" />
        </label>
    </p>
    <input type="submit" value="가입 완료">
</form:form>

</body>
</html>
