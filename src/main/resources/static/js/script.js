function successfullyLogout(){
    alert("Nastąpiło poprawne wylogowanie");
}

var newForm = document.getElementById('newFormId');
var editForm = document.getElementById('editFormId');

function myFunction() {
    if (newForm.checkValidity()) {
        alert("Zwierzę zostało poprawnie dodane do bazy danych");
    }
}
function successfullyEdit(){
    if (editForm.checkValidity()) {
        alert("Dane zwierzęcia zostały poprawnie zedytowane");
    }
}

datePickerId.max = new Date().toLocaleDateString('fr-ca')
//datePickerId.value = "1999-01-01";