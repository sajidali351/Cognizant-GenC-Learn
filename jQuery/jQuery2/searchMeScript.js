
  $(document).ready(function(){
    $("span").hover(function(){
      $(this).css("background-color", "bisque");
      $(".shadow").addClass("shadowClass"); 
      }, function(){
      $(this).css("background-color", "white");
    });
  });


