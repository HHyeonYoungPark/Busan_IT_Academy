let userid = document.getElementById("userid");
let passwd = document.getElementById("passwd");
let passwd2 = document.getElementById("passwd2");
let email = document.getElementById("email");

function checkInputs() {
  let useridValue = userid.value.trim();
  let passwdValue = passwd.value.trim();
  let passwd2Value = passwd2.value.trim();
  let emailValue = email.value.trim();

  if (useridValue === null || useridValue === "") {
    errorCheck(userid, "아이디를 입력해주세요.");
  } else if (useridValue.length < 8) {
    errorCheck(userid, "아이디를 8자리 이상 입력하세요.");
  } else {
    successCheck(userid);
  }

  if (passwdValue === null || passwdValue === "") {
    errorCheck(passwd, "비밀번호를 입력해주세요.");
  } else if (passwdValue.length < 12) {
    errorCheck(passwd, "비밀번호를 12자리 이상 입력하세요.");
  } else {
    successCheck(passwd);
  }

  if (passwd2Value === null || passwd2Value === "") {
    errorCheck(passwd2, "비밀번호를 확인해주세요.");
  } else if (passwdValue !== passwd2Value) {
    errorCheck(passwd2, "비밀번호가 일치하지 않습니다.");
  } else {
    successCheck(passwd2);
  }

  if (emailValue === null || emailValue === "") {
    errorCheck(email, "이메일을 입력해주세요.");
    // 이메일 정규식 체크
    // boolean : name(true) -> name,  name(false) -> !name
  } else if (!isEmailCheck(emailValue)) {
    errorCheck(email, "유효한 이메일 형식이 아닙니다.");
  } else {
    successCheck(email);
  }
}
//이메일 정규식
function isEmailCheck(email) {
  let exp = /^[a-z A-Z 0-9 +-\_.]+@[a-zA-Z0-9]+\.[a-zA-Z0-9]+$/;
  return exp.test(email);
}

document.getElementById("form").addEventListener("submit", (e) => {
  e.preventDefault(); //창이 넘어가지 않게 해주는거
  radioValidate();
});

/*중복되는 코드들을 함수로 처리함 */
function errorCheck(input, msg) {
  const formControl = input.parentElement;
  const small = formControl.querySelector("small");
  formControl.className = "form-control error";
  small.innerHTML = msg;
}
function successCheck(input) {
  const formControl = input.parentElement;
  formControl.className = "form-control success";
}

document.getElementById("form").addEventListener("submit", (e) => {
  e.preventDefault(); //창이 넘어가지 않게 해주는거
  checkInputs();
});
