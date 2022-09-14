/*
1. 사용자 객체
    - [{배열1},{배열2},{배열3}]
2. 권한 있는 사람만 따로 객체 저장 : 권한 Y 표시된 사람만 따로 저장
*/

const users = [
  { id: 1, userid: "busan", auth: "Y" },
  { id: 2, userid: "seoul", auth: "N" },
  { id: 3, userid: "suwon", auth: "Y" },
];
const auth = [];

// 권한Y인 사람만 auth에 담아서 표시
for (let i = 0; i < users.length; i++) {
  if (users[i].auth == "Y") {
    auth.push(users[i]);
  }
}
// 전송해야한다면 JSON.stringify()로 변환
// console.log(JSON.stringify(auth));

console.log(auth); // 객체 전체를 출력
console.log(auth[0]); // 배열번호 0번인 사람 출력(실제 데이터는 1번인 사람)
console.log(auth[0].userid);
if (auth[0].auth == "Y") {
  console.log("관리자 페이지에 접속합니다.");
}

console.log(auth[0]["userid"]);
console.log(auth[0]["auth"]);

const user = { id: 4, userid: "daejeon", auth: "Y" };
console.log(auth);
console.log(user);
// 기존자료에 새자료 합치기
// console.log({ ...auth, ...user });
console.log(user["auth"]);
