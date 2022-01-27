$(document).ready(function () {
       
    $("#myTable").on('input', '.txtCal', function () {
           var sum = 0;
         
        $("#myTable .txtCal").each(function () {
            var values = $(this).val();
            if ($.isNumeric(values)) {
                sum += parseFloat(values);
            }                  
        });
        if(!isNaN(sum)){
          $("#sum").html(sum.toFixed(2));
        }
    });
});