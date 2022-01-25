// $(document).ready(function(){
//     $("").find("span").css({"font-weight": "bold", "font-style":"italic", "text-shadow": "2px 2px pink"});
//   });

  $(document).ready(function(){
    $("span").hover(function(){
      $(this).css("background-color", "bisque");
      }, function(){
      $(this).css("background-color", "white");
    });
  });


