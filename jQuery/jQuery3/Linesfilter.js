$(document).ready(function(){
    $("#submitBtn").click(function(){
        var givenText = $("#givenText").val();
        var wordToFind = $("#searchText").val();
        const searchWords = wordToFind.split(",");
        var firstWord = searchWords[0];
        var secondWord = searchWords[1];
        var finalString = "";
        const splitArr = givenText.split(".");
        for(var i =0;i<splitArr.length;i++){
            if(splitArr[i].includes(firstWord)){
                const firstPart = splitArr[i].split(firstWord);
                finalString += firstPart[0] + "<b>" + firstWord + "</b>";
                const secondPart = firstPart[1].split(secondWord);
                finalString += secondPart[0] + "<b>" + secondWord + "</b>" + secondPart[1];
            } 
        }
         $("#outputText").text(finalString);
    })
})

