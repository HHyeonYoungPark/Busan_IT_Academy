function selectAll(selectAll) {
  let arrays = document.querySelectorAll("input[name='delete[]']");
  arrays.forEach((array) => {
    array.checked = selectAll.checked;
  });
}

document.getElementById("form").addEventListener("submit", (e) => {
  e.preventDefault(); //
  selectAll();
});
