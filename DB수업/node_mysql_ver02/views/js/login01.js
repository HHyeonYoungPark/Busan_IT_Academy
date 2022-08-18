let userid = document.getElementById("userid");
let passwd = document.getElementById("passwd");

function loginCheck() {
  let useridValue = userid.value.trim();
  let passwdValue = passwd.value.trim();

  if (useridValue === null || useridValue === "") {
    alert("아이디를 입력해주세요.");
    return false;
  } else if (useridValue.length < 8) {
    alert("아이디를 8자리 이상 넣어주세요.");
    return false;
  }

  if (passwdValue === null || passwdValue === "") {
    alert("비밀번호를 입력해주세요.");
    return false;
  } else if (passwdValue.length < 12) {
    alert("비밀번호를 12자리 이상 넣어주세요.");
    return false;
  }
  location.href = "https://nid.naver.com/nidlogin.login";
}

document.getElementById("form").addEventListener("submit", (e) => {
  e.preventDefault(); //창이 넘어가지 않게 해주는거
  loginCheck();
});
