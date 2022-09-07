/*
fs : File System I/O -> 예외처리
    - 필요하다면 require 가져와서 사용
    - directory 생성/삭제, file 쓰기/삭제/이어붙이기
    - file 입출력 시
        - 동기화(sync) : 1(글자만 출력) 2(파일업로드) 3(글자만 출력)
                         1,2,3 : 2번 작업이 끝날 때까지 기다렸다가 3번 작업
        - 비동기화(async)
                         1,2,3 동시작업
*/
const fs = require("fs"); // nodejs 설치할 때 같이 설치되는 모듈
/*
fs.mkdir("만들이름", 콜백함수()); // 디렉토리 만들기 -> 콜백함수를 이용해서 예외처리 무조건 해야함
fs.writeFile("만들파일이름", 콜백함수()); // 파일 만들기 -> 콜백함수를 이용해서 예외처리 무조건 해야함
*/

// files 폴더
/*
fs.mkdir("files", function (err) {
  // arrow function
  if (err) {
    throw err; //예외가 생기면 출력
  }
  console.log("폴더 생성완료");
});

fs.mkdir("./json", (err) => {
  if (err) throw err;

  console.log("Make Directory Completed...");
});

// // remove dir
// fs.rmdir("./json", (err) => {
//   if (err) throw err;

//   console.log("Remove Directory Completed...");
// });
*/

/*
    상대경로 : 위에서 작업했던 내용은 ./file, ./json
    절대경로 : 실무 또는 프로젝트 path
    -  현재 위치, 현재 파일이름, 현재 파일이름의 확장자를 관리하는 모듈
*/

/* 내가 있는 디렉토리 위치 */
console.log(__dirname);
console.log(__filename);

const path = require("path"); // 파일을 상세하게 관리할 때
console.log(path.parse(__filename).name); // 파일이름만 나옴
console.log(path.extname(__filename)); // 파일 확장자명이 나옴

/* path.join(디렉토리, 파일명) 경로 + 파일을 연결해서 절대경로로 표시할 때 */
const curDir = __dirname;
//console.log(curDir);
const filename = "index.html";

/* 디렉토리 + 파일 연결 : 절대경로 */
const result = path.join(curDir, filename);
console.log(result);
