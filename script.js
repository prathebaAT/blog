var today = new Date();
    var dd = String(today.getDate()).padStart(2, '0');
    var mm = String(today.getMonth() + 1).padStart(2, '0'); 
    var yyyy = today.getFullYear();

    today = yyyy + '-' + mm + '-' + dd;

    
    var dateFields = document.getElementsByClassName("dateField"); 
    for (var i = 0; i < dateFields.length; i++) {
        dateFields[i].value = today;
    }