$(document).ready(function(){
    $("button").click(function(){
        var content = $("#text").val();
        $("div").text(content);
    });

    $("div").click(function(){
            var img = document.createElement("IMG");
            img.src = "emote.png";
            $('.img').html(img); 
        
    });

});