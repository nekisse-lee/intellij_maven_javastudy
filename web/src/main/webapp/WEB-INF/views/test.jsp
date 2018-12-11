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
    <%--<script src="../../resources/jquery/2.1.4/jquery.min.js"></script>--%>
    <script src="webjars/jquery/2.1.4/jquery.min.js"></script>
        <style>
            #modDiv {
                width: 300px;
                height: 100px;
                background-color: gray;
                position: absolute;
                top: 50%;
                left: 50%;
                margin-top: -50px;
                margin-left: -150px;
                padding: 10px;
                z-index: 1000;
            }
        </style>


        <title>Title</title>
</head>
<body>

<h2>Ajax Test Page</h2>



<div>
    <div>
        REPLYER <input type="text" name="replyer" id="newReplyWriter">
    </div>
    <div>
        REPLY TEXT<input type="text" name="replytext" id="newReplyText"/>
    </div>
    <button id="replyAddBtn">ADD REPLY</button>

</div>


<ul id="replies">
</ul>

<div id="modDiv" style="display: none;">
    <div class="modal-title"></div>
    <div>
        <input type="text" id="replytext"/>
    </div>
    <div>
        <button type="button" id="replyModBtn">Modify</button>
        <button type="button" id="replyDelBtn">Delete</button>
        <button type="button" id="closeBtn">Close</button>
    </div>
</div>


</body>
<script>
    var bno = 4;


    function getAllList() {

        $.getJSON(
                "/replies/all/" + bno,
                function(data) {

                    //console.log(data.length);

                    var str = "";

                    $(data)
                        .each(
                            function() {
                                str += "<li data-rno='"+this.rno+"' class='replyLi'>"
                                    + this.rno
                                    + ":"
                                    + this.replytext
                                    + "<button>MOD</button></li>";
                            });
                    $("#replies").html(str);
                });
    }

    $("#replyAddBtn").on("click", function() {

        var replyer = $("#newReplyWriter").val();
        var replytext = $("#newReplyText").val();

        $.ajax({
            type : 'post',
            url : '/replies',
            headers : {
                "Content-Type" : "application/json",
                "X-HTTP-Method-Override" : "POST"
            },
            dataType : 'text',
            data : JSON.stringify({
                bno : bno,
                replyer : replyer,
                replytext : replytext
            }),
            success : function(result) {

                if (result == 'SUCCESS') {
                    alert("등록 되었습니다.");
                    getAllList();
                }
            }
        });
    });

    $('#replies').on('click', '.replyLi button', function () {
        var reply = $(this).parent();

        var rno = reply.attr("data-rno");
        var replytext = reply.text();
        // alert(rno + " : " + replytext);

        $('.modal-title').html(rno);
        $('#replytext').val(replytext);
        $('#modDiv').show("slow");
    });



</script>

</html>
