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
        var bno = 4;

        function getAllList() {
            $.getJSON("/replies/all/" + bno, function (data) {
                // alert(data.length);

                var str = "";
                console.log(data.length);

                $(data)
                    .each(
                        function () {
                            str += "<li data-rno='" + this.rno + "' class='replyLi'>"
                                + this.rno
                                + ":"
                                + this.replytext
                                + "</li>";
                        });

                $("#replies").html(str);
            });
        }

        $(window).load()(function () {
            $('#replyAddBtn').click(function () {
                var replyer = $('#newReplyWriter').val();
                var replytext = $('#newReplyText').val();

                $.ajax({
                    type: 'POST',
                    url: "/repliyes",
                    header: {
                        'contentType': 'application/json',
                        'X-HTTP-Method-Override': 'POST'
                    },
                    dataType: 'text',
                    data: JSON.stringify({
                        bno: bno,
                        replyer: replyer,
                        replytext: replytext
                    }),
                    success: function (result) {

                    }
                });

            });
        });

    </script>
</head>
<body>
<h2>Ajax Test Page</h2>

<%--<ul id="replies">
</ul>--%>
<div>
    <div>
        REPLYER <input type="text" name="replyer" id="newReplyWriter">
    </div>
    <div>
        REPLY TEXT<input type="text" name="replytext" id="newReplyText"/>
    </div>
    <button id="replyAddBtn">ADD REPLY</button>
</div>
</body>
</html>
