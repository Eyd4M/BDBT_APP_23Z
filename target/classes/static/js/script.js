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

// $('#myInput').on("keydown", function(e) {
//     if (e.shiftKey && e.keyCode === 192) {
//         e.preventDefault();
//         console.log(e.keyCode);
//     }
// })

window.onload = () => {
    const myInput = document.getElementById('myInput');
    myInput.onpaste = e => e.preventDefault();
}

datePickerId.max = new Date().toLocaleDateString('fr-ca')
//datePickerId.value = "1999-01-01";