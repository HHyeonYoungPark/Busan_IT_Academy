function radioValidate() {
  let isChecked = "";

  for (let i = 0; i < document.getElementsByName("satisfaction").length; i++) {
    if (document.frm1.satisfaction[i].checked) {
      isChecked = document.frm1.satisfaction[i].value;
    }
  }

  if (isChecked === "") {
    alert("만족도를 선택하세요.");
    return false;
  } else {
    alert("만족도가 반영되었습니다.");
    return true;
  }
}

document.getElementById("frm1").addEventListener("submit", (e) => {
  e.preventDefault(); // 페이지 전환X
  radioValidate();
});
