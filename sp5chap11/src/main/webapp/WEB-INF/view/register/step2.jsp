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
    <title>회원 가입</title>
</head>
<body>
<h2>회원 정보 입력</h2>
<form action="step3" method="post">
    <p>
        <label>이메일: <br/>
            <input type="text" name="email" id="email"/>
        </label>
    </p>
    <p>
        <label>이름: <br/>
            <input type="text" name="name" id="name"/>
        </label>
    </p>
    <p>
        <label>비밀번호: <br/>
            <input type="text" name="password" id="password"/>
        </label>
    </p>
    <p>
        <label>비밀번호 확인: <br/>
            <input type="text" name="confirmPassword" id="confirmPassword"/>
        </label>
    </p>
    <input type="submit" value="가입 완료"/>

</form>

</body>
</html>
