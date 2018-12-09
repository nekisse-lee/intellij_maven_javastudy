<%--
  Created by IntelliJ IDEA.
  User: nekisse
  Date: 2018. 12. 9.
  Time: 오후 5:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="webjars/jquery/2.1.4/jquery.min.js"></script>
    <title>Title</title>
<script>
    var bno =  4;
    $.getJSON("/replies/all/" + bno, function (data) {
        // console.log(data.length);
        alert(data.length);
        });
</script>
</head>
<body>
        <h2>Ajax Test Page</h2>

<ul id="replies">

</ul>
</body>
</html>
