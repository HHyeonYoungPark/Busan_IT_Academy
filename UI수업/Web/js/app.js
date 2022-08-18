//동작()을 먼저 만든다 -> 메소드
//이벤트 처리() -> 메소드와 버튼을 연결해줌

/*
    function showBox1() {
      //   alert("ok");
      //   console.log("ok"); 되는지 확인해봄
      //document.getElementById("box1").classList.remove("onOff");
      document.querySelector("#box1").classList.remove("onOff");
    }
    function closeBox1() {
      //   alert("ok");
      document.getElementById("box1").classList.add("onOff");
    }
    */

// const closeBox1 = () => {
//   document.getElementById("box1").classList.add("onOff");
// };
// document.getElementById("box1Open").addEventListener("click", closeBox1);

// let boxTwo = document.getElementById("box2");
// let boxTwoBtn = document.getElementById("box2Toggle");

// const toggleFn = () => {
//   document.getElementById("box2").classList.toggle("onOff");
// };

// boxTwoBtn.addEventListener("click", toggleFn);

//

let UID = document.getElementById("userid");
let IDBtn = document.getElementById("idBtn");
let DomText = document.getElementById("text");

const chkID = () => {
  //alert("ok");
  //alert(UID.value);
  if (UID.value == "부산it12345") {
    alert("로그인되었습니다.");
    location.href = "https://www.naver.com";
  } else if (UID.value == "") {
    DomText.innerHTML = "<b>아이디를 입력하세요!</b>";
    UID.value = "";
    UID.focus();
  } else {
    //alert("아이디를 확인하세요.");
    DomText.innerHTML = "<b>아이디가 틀렸어요!</b>";
    UID.value = "";
    UID.focus();
  }
};

IDBtn.addEventListener("click", chkID);
