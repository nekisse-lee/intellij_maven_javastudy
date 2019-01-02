<%--
  Created by IntelliJ IDEA.
  User: Nekisse-window
  Date: 2019-01-01
  Time: 오후 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <title>JS Bin</title>
</head>
<body>


<div id = "app" v-cloak>
    <h1  v-if="value > 5">vlaue값이 5보다 크군요 입력값: {{value}}</h1>
    <h1 v-else-if="value===5"> vlaue값이 5네요 입력값: {{value}}</h1>
    <h1 v-else> value값이 5보다 작아요  입력값: {{value}}</h1>
    <h2 v-once>초기 값: {{ value }}</h2>
    <h2>현재 값: {{ value }}</h2>
    <h1 v-pre> {{이건 그대로 출력}}</h1>
</div>

<jsp:include page="test.js"/>
<script src="https://unpkg.com/vue/dist/vue.js"></script>

</body>
</html>
