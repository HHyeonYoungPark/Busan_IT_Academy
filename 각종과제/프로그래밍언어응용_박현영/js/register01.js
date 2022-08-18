let userid = document.getElementById("userid");
let passwd = document.getElementById("passwd");
let passwd2 = document.getElementById("passwd2");
let email = document.getElementById("email");
let gender = document.querySelectorAll("input[type=radio]");
let sel = document.getElementById("sel");
let hobby = document.querySelectorAll("input[type=checkbox]");
let intro = document.getElementById("intro");

document.querySelector("form").addEventListener("submit", (e) => {
  e.preventDefault();

  let useridValue = userid.value.trim();
  let passwdValue = passwd.value.trim();
  let passwd2Value = passwd2.value.trim();
  let emailValue = email.value.trim();
  let selValue = sel.value;
  let introValue = intro.value.trim();

  //아이디체크
  if (useridValue === null || useridValue === "") {
    errorCheck(userid, "아이디를 입력해주세요.");
  } else if (useridValue.length < 8) {
    errorCheck(userid, "아이디를 8자리 이상 입력하세요.");
  } else {
    successCheck(userid);
  }
  //비밀번호 체크
  if (passwdValue === null || passwdValue === "") {
    errorCheck(passwd, "비밀번호를 입력해주세요.");
  } else if (passwdValue.length < 12) {
    errorCheck(passwd, "비밀번호를 12자리 이상 입력하세요.");
  } else {
    successCheck(passwd);
  }
  //비밀번호 확인
  if (passwd2Value === null || passwd2Value === "") {
    errorCheck(passwd2, "비밀번호를 확인해주세요.");
  } else if (passwdValue !== passwd2Value) {
    errorCheck(passwd2, "비밀번호가 일치하지 않습니다.");
  } else {
    successCheck(passwd2);
  }
  //이메일 체크
  if (emailValue === null || emailValue === "") {
    errorCheck(email, "이메일을 입력해주세요.");
    // 이메일 정규식 체크
    // boolean : name(true) -> name,  name(false) -> !name
  } else if (!isEmailCheck(emailValue)) {
    errorCheck(email, "유효한 이메일 형식이 아닙니다.");
  } else {
    successCheck(email);
  }

  //성별체크
  for (let i = 0; i < gender.length; i++) {
    if (gender[i].checked) {
      successCheck(document.querySelector(".gender"));
      return true;
    } else {
      errorCheck(document.querySelector(".gender"), "성별을 선택하세요.");
    }
  }

  // //성별체크
  // let isChecked = "";

  // for (let i = 0; i < gender.length; i++) {
  //   if (document.form.gender[i].checked) {
  //     isChecked = document.form.gender[i].value;
  //   }
  // }
  // if (isChecked === "") {
  //   alert("성별을 체크하세요");
  //   //errorCheck(gender, "성별을 선택하세요.");
  // } //else {
  // //successCheck(gender);
  // //}
  // //}

  //지역셀렉트 체크
  if (selValue === "") {
    errorCheck(sel, "지역을 선택하세요.");
  } else {
    successCheck(sel);
  }

  //취미 체크
  for (let i = 0; i < hobby.length; i++) {
    if (hobby[i].checked) {
      successCheck(document.querySelector(".hobby"));
      return true;
    } else {
      errorCheck(document.querySelector(".hobby"), "취미를 선택하세요.");
    }
  }

  // //취미 체크
  // if (
  //   !hobby1.checked &&
  //   !hobby2.checked &&
  //   !hobby3.checked &&
  //   !hobby4.checked
  // ) {
  //   alert("취미를 선택하세요.");
  //   // errorCheck(hobby, "취미를 선택하세요.");
  // } //else {
  // //successCheck(hobby);
  // //}

  //자기소개서 글자수, 체크
  const textarea = document.querySelector("textarea");
  const p = document.querySelector("p");

  if (introValue === "") {
    errorCheck(intro, "자기소개서를 입력하세요.");
  } else {
    successCheck(intro);
  }

  textarea.addEventListener("keyup", () => {
    p.textContent = `입력한 글자수 : ${textarea.value.length}`;
  });
});

//이메일 정규식
function isEmailCheck(email) {
  let exp = /^[a-z A-Z 0-9 +-\_.]+@[a-zA-Z0-9]+\.[a-zA-Z0-9]+$/;
  return exp.test(email);
}

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
