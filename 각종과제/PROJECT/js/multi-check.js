// 체크를 안하면 alert창이 뜸
function multiCheckboxValidate() {
  let chk = document.querySelector("input[name='agree[]']:checked");
  if (!chk) {
    alert("동의하셔야 다음단계로 넘어갑니다.");
    return flase;
  } else {
    alert("다음단계로 넘어갑니다.");
    location.href = "agree.do";
  }
}

// 전체 선택
// 실수한거 : html -> form에 onclick="selectAll(); 를 꼭 넣는다
function selectAll(selectAll) {
  let arrays = document.querySelectorAll("input[name='agree[]']");
  arrays.forEach((array) => {
    array.checked = selectAll.checked;
  });
}

document.getElementById("frm").addEventListener("submit", (e) => {
  e.preventDefault(); // 페이지 전환X
  multiCheckboxValidate();
});
