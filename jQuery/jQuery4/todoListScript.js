function appendText() {
    if ($("#task").val() != null && $("#task").val() != '') {
        var input = $("#task").val();
        var txt1 = $("<p></p>").text(input); 
        $("body").append(txt1); 
    }
    else{
        
        alert("Enter task details!!");
    }

}
  