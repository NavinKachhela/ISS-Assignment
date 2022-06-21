var status = document.getElementById("status").value;
console.log(status);

function setError(id, error) {
    element = document.getElementById(id);
    element.innerHTML = error;
}

function formValidation() {

    var userName = document.forms['registration']['name'].value;
    var email = document.forms['registration']['email'].value;
    var password = document.forms['registration']['pass'].value;
    var repass = document.forms['registration']['re_pass'].value;
    var contact = document.forms['registration']['contact'].value;
    var regEmail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/g; //Javascript reGex for Email Validation.
    var regPhone = /^\d{10}$/; // Javascript reGex for Phone Number validation.
    var regName = /\d+$/g;
    var returnVal = true;

    if (userName.length < 3 || userName.length == 0 || regName.test(userName)) {
        setError("formerror_name", "Length of name is too short or accepted alphabets only");
        returnVal = false;
    }

    if (email == "" || !regEmail.test(email)) {
        setError("formerror_email", "Please enter a valid e-mail address.");
        returnVal = false;
    }

    if (password == "") {
        setError("formerror_pass", "Please enter your password");
        returnVal = false;
    }

    if (password.length < 6) {
        setError("formerror_pass", "Password should be atleast 6 character long");
        returnVal = false;
    }

    if (repass != password) {
        setError("formerror_repass", "Password does not match");
        returnVal = false;
    }

    if (contact == "" || !regPhone.test(contact)) {
        setError("formerror_contact", "Please enter valid phone number.");
        returnVal = false;
    }

    return returnVal;
}

if (status == "success") {
    swal("Congrats", "Account Created Successfully", "success");
}

if (status == "failed") {
    swal("Sorry", "Wrong UserName or Password", "error");
}

if (window.history.replaceState) {
    window.history.replaceState(null, null, window.location.href);
}