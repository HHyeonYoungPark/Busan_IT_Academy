document.querySelector("form").addEventListener("submit", (e) => {
  e.preventDefault();
  if (document.getElementById("sel").value === "") {
    alert("검색카테고리를 선택하세요.");
    return false;
  }
  if (document.getElementById("search").value.trim() === "") {
    alert("검색어를 입력하세요.");
    document.getElementById("search").focus();
    return false;
  }

  return true;
});
