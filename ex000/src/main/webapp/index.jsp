<%--
  Created by IntelliJ IDEA.
  User: nekisse
  Date: 2018. 11. 27.
  Time: 오후 5:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3CDTD HTML 4.01 Transitionl//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF8">
    <title>HOME</title>
    <script src="https://code.jquery.com/jquery-1.11.3.js"></script>
  </head>

  <script >
      $.ajax({
          method: "GET",
          url: "doJSON",
          dataType: "JSON",
          success: function (result) {
              alert(result.name);
              alert(result["name"]);
              alert(result['name']);
          }
      });

      $.ajax({
          method: "GET",
          url: "doD",
          dataType: "JSON",
          success: function (result) {
              alert(result.name);
              alert(result["name"]);
              alert(result['name']);
          }
      });

  </script>
  <body>
  hello world~
  </body>
</html>
