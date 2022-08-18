let gender = document.getElementsByName("gender");
let hobby = document.getElementById("hobby");

document.querySelector("form").addEventListener("submit", (e) => {
  e.preventDefault();

  let isChecked = "";

  for (let i = 0; i < gender.length; i++) {
    if (document.form.gender[i].checked) {
      isChecked = document.form.gender[i].value;
    }
  }

  if (isChecked === "") {
    alert("성별을 체크하세요");
    //errorCheck(gender, "성별을 선택하세요.");
  } //else {
  //successCheck(gender);
  //}

  //취미 체크
  if (!hobby.checked) {
    alert("취미를 선택하세요.");
    // errorCheck(hobby, "취미를 선택하세요.");
  } //else {
  //successCheck(hobby);
  //}
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
