let userid = document.getElementById("UserName");
let passwd = document.getElementById("Password");
let passwd2 = document.getElementById("Re-Password");
let name = document.getElementById("name");
let email = document.getElementById("email");

function checkInputs() {
  /*반복되는 코드를 함수로 중복제거 */
  /* 처음 html만들때 똥싸놔서 함수로 못 묶음 */

  let useridValue = userid.value.trim();
  let emailValue = email.value.trim();
  let passwdValue = passwd.value.trim();
  let passwd2Value = passwd2.value.trim();
  let nameValue = name.value.trim();
  /* 아이디 */
  if (useridValue === null || useridValue === "") {
    const formControl = userid.parentElement;
    const small = formControl.querySelector("small");
    formControl.className = "UserName error";
    small.innerHTML = "아이디를 입력해주세요";
  } else if (useridValue.length < 8) {
    const formControl = userid.parentElement;
    const small = formControl.querySelector("small");
    formControl.className = "UserName error";
    small.innerHTML = "아이디를 8자리 이상 넣어주세요.";
  } else {
    const formControl = userid.parentElement;
    formControl.className = "UserName success";
  }
  /* 비밀번호 */
  if (passwdValue === null || passwdValue === "") {
    const formControl = passwd.parentElement;
    const small = formControl.querySelector("small");
    formControl.className = "Password error";
    small.innerHTML = "비밀번호를 입력해주세요";
  } else {
    const formControl = passwd.parentElement;
    formControl.className = "Password success";
  }
  /* 비밀번호 재확인 */
  if (passwd2Value === null || passwd2Value === "") {
    const formControl = passwd2.parentElement;
    const small = formControl.querySelector("small");
    formControl.className = "Re-Password error";
    small.innerHTML = "비밀번호를 확인해주세요";
  } else if (passwdValue !== passwd2Value) {
    const formControl = passwd2.parentElement;
    const small = formControl.querySelector("small");
    formControl.className = "Re-Password error";
    small.innerHTML = "비밀번호가 일치하지 않습니다.";
  } else {
    const formControl = passwd2.parentElement;
    formControl.className = "Re-Password success";
  }
  /* 이름 */
  if (nameValue === null || nameValue === "") {
    const formControl = name.parentElement;
    const small = formControl.querySelector("small");
    formControl.className = "name error";
    small.innerHTML = "이름을 입력해주세요";
  } else {
    const formControl = name.parentElement;
    formControl.className = "name success";
  }
  /* 이메일 */
  if (emailValue === null || emailValue === "") {
    const formControl = email.parentElement;
    const small = formControl.querySelector("small");
    formControl.className = "email error";
    small.innerHTML = "이메일을 입력해주세요";
  } else if (!isEmailCheck(emailValue)) {
    const formControl = email.parentElement;
    const small = formControl.querySelector("small");
    formControl.className = "email error";
    small.innerHTML = "유효한 이메일 형식이 아닙니다.";
  } else {
    const formControl = email.parentElement;
    formControl.className = "email success";
  }
}

function isEmailCheck(email) {
  //^는 시작할때 , [소문자/대문자 알파벳,숫자]
  let exp = /^[a-zA-Z0-9+-\_.]+@[a-zA-Z0-9]+\.[a-zA-Z0-9]+$/;
  return exp.test(email);
}

document.getElementById("form").addEventListener("submit", (e) => {
  e.preventDefault(); //창이 넘어가지 않게 해주는거
  checkInputs();
});
