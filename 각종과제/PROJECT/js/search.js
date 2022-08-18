//맨 위 메뉴 검색창
function searchValidate() {
  if (document.getElementById("search").value.trim() === "") {
    alert("검색어를 입력하세요.");
    document.getElementById("search").focus();
    return false;
  }

  return true;
}

document.getElementById("frm0").addEventListener("submit", (e) => {
  e.preventDefault();
  searchValidate();
});
