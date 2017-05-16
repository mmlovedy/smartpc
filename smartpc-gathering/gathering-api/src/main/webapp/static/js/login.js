function login () {
    var username = $("#username").val();
    var password = md5($("#password").val());
    $.ajax({
        type : "POST",
        data : {
            "username" : username,
            "password" : password
        },
        dataType : "json",
        url : "/gathering/v1/login",
        success : function(result) {
            if (result.responseStatus == "SUCCESS") {
                location.href = "/gathering/index";
            } else {
                $("#erro").html(result.erroMessage);
            }
        }
    });
}

