$(document).ready(function(){
    $("#div1").click(function(){
      $(this).toggleClass("yellow");
    });

    $("#div2").click(function(){
        $(this).toggleClass("green");
    });
      
      $("#div3").click(function(){
        $(this).toggleClass("red");
    });

      $("#div4").click(function(){
        $(this).toggleClass("pink");
    });

        var table;
        $("button").click(function() {
          if (table) {
            table.appendTo("body");
            table = null;
          } else {
            table = $("div").detach();
          } 
    
    });
   
});
