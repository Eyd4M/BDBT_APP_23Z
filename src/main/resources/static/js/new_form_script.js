var newForm = document.getElementById('newFormId');
function successfullyAddAnimal() {
    if (newForm.checkValidity()) {
        alert("Zwierzę zostało poprawnie dodane do bazy danych");
    }
}

function successfullyAddWorker() {
    if (newForm.checkValidity()) {
        alert("Pracownik został poprawnie dodany do bazy danych");
    }
}
function validateAccountNumber(input) {
    // Usuń wszystkie znaki niebędące cyframi
    input.value = input.value.replace(/\D/g, '');
}


