var editForm = document.getElementById('editFormId');

function successfullyEditAnimal(){
    if (editForm.checkValidity()) {
        alert("Dane zwierzęcia zostały poprawnie zedytowane");
    }
}

function successfullyEditWorker(){
    if (editForm.checkValidity()) {
        alert("Dane pracownika zostały poprawnie zedytowane");
    }
}

function successfullyEditYourData(){
    if (editForm.checkValidity()) {
        alert("Twoje dane zostały poprawnie zedytowane");
    }
}

function validateAccountNumber(input) {
    // Usuń wszystkie znaki niebędące cyframi
    input.value = input.value.replace(/\D/g, '');
}