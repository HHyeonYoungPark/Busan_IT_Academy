const fs = require("fs");
const path = require("path");

//폴더 만들기
if (fs.existsSync("20220907")) {
  console.log("폴더가 이미 존재합니다.");
} else {
  fs.mkdir("20220907", (err) => {
    if (err) {
      throw err;
    }
    console.log("20220907 폴더가 생성되었습니다.");
  });
}

// 파일 생성
let str = "Welcome Busan it Academy";
fs.writeFile("./20220907/20220907.txt", str, (err) => {
  if (err) {
    throw err;
  }
  console.log("파일이 생성되었습니다.");
});

// 파일 내용 이어붙이기(추가내용)
let appendStr = "\nHello NodeJS";
fs.appendFile("./20220907/20220907.txt", appendStr, (err) => {
  if (err) {
    throw err;
  }
  console.log("내용이 추가되었습니다.");
});

// // 파일 삭제
// fs.unlink("./20220907.txt", (err) => {
//   if (err) {
//     throw err;
//   }
//   console.log("선택하신 파일이 삭제되었습니다.");
// });

// // 디렉토리 삭제
// fs.rmdir(
//   path.join(__dirname, "20220907"),
//   { recursive: true, force: true },
//   (err) => {
//     if (err) {
//       throw err;
//     }
//     console.log("폴더가 삭제되었습니다.");
//   }
// );
