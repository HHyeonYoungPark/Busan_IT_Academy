function checkboxValidate() {
  if (!document.getElementById("agree").checked) {
    alert("동의하셔야 회원가입이 가능합니다.");
    return false;
  } else {
    alert("약관에 동의하셨습니다.\n다음 단계로 넘어갑니다.");
    location.href = "https://nid.naver.com/nidlogin.login";
  }
}

document.getElementById("frm").addEventListener("submit", (e) => {
  e.preventDefault(); // 페이지 전환X
  checkboxValidate();
});
