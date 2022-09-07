/* 
1. Log(방문기록)... : 날짜로 파일이름
    - 하루 한번 : 년월일
    - 자주 기록 : gettime(); 1/1000초 기록
*/
const fs = require("fs");
const path = require("path");

// new Date() : 년월일
// 가공 : getFullYear(), getMonth(), getDay() 메소드
// fs.mkdir(파일이름, 콜백)

// 날짜를 이용해서 폴더 생성
let yy = new Date().getFullYear();
let mm = new Date().getMonth() + 1;
if (mm < 10) {
  mm = "0" + mm;
}
let dd = new Date().getDate();
if (dd < 10) {
  dd = "0" + dd;
}

let yymmdd = `${yy}${mm}${dd}`;
/*
console.log(yymmdd);

fs.mkdir(yymmdd, (err) => {
  if (err) {
    throw err;
  }
  console.log(yymmdd + "폴더가 생성되었습니다.");
});
*/

/* 파일생성 : 시간 밀리타임 세컨즈 */
function UNIX_TIMESTAMP() {
  // 1/1000초 단위로 변환
  return Math.floor(new Date().getTime()); //혹시나 소수점이 나오면 버림
}
// console.log(UNIX_TIMESTAMP());

// fs.writeFile(절대경로(__dirname, "추가할 폴더이름", "파일이름"), "내용", "콜백"){}

let str = "Login information write....";

// fs.writeFile(파일이름, 내용, 콜백);
fs.writeFile(
  path.join(__dirname, yymmdd, UNIX_TIMESTAMP() + ".txt"),
  str,
  (err) => {
    if (err) {
      throw err;
    }
    console.log(UNIX_TIMESTAMP() + "파일이 생성되었습니다.");
  }
);
