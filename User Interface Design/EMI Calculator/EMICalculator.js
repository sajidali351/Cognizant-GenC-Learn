
/* 
    Fill with appropriate javascript code here 
*/

function calculateEMI(){
    
    var P = document.getElementById('principalAmount').value;
    var r = document.getElementById('interestRate').value;
    var N = document.getElementById('tenure').value;
    var R = (r/100) / 12;
    var EMI=(P*R*Math.pow((1+R),N)/(Math.pow((1+R),N)-1)).toFixed(2);
    
    document.getElementById('result').innerHTML = "EMI is Rs."+EMI;
    /*P * R * ( (1 + R)^N / ((1 + R)^N - 1) )*/
    return false;
}