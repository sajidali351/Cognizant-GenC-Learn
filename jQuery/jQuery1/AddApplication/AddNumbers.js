$(document).ready(function(){
  $(function(){  
    $("#btn").click(function() { 
          
        if ($("#firstno").val() != null && $("#firstno").val() != '' || $("#secondno") != null && $("#secondno").val() != '' ) {  
            var num1 = parseInt($("#firstno").val());
            var num2 = parseInt($("#secondno").val());
            $("div").text(num1 + num2);
             $("div").css("color","green");
              $("#answer").val(num1 + num2);  
          }
            else{
                $("div").text("Pls. Enter the values");
                $("div").css("color","red"); 
              } 
     })
  }) 
})   