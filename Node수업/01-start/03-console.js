/* 1. 회원이 여러명일 때 [{},{},{}] */
const users = [
  { id: 1, userid: "busanit", passwd: "12345", username: "KIM", gender: "M" }, //배열0번
  { id: 2, userid: "seoulit", passwd: "12345", username: "LEE", gender: "F" }, //배열1번
  { id: 3, userid: "suwonit", passwd: "12345", username: "PARK", gender: "F" }, //배열2번
];

console.log(users[1].id);
console.log(users[2].gender);
console.log("");
console.log("----------------------------------------");

for (let i = 0; i < users.length; i++) {
  console.log(users[i].userid);
}
console.log("");
console.log("----------------------------------------");

/*
객체값.forEach((별명) => {
  출력코드;
});

객체값.forEach((value, index) => {
  출력코드;
});
*/
users.forEach((user) => {
  console.log(user);
});
console.log("----------------------------------------");

users.forEach((user, idx) => {
  console.log(`${idx} : ${user}`);
});
console.log("----------------------------------------");

users.forEach((user) => console.log(user));
console.log("----------------------------------------");

/* 2. push - 배열에 삽입 */
const arr = [];
arr.push({ id: 4, userid: "busanit" }, { id: 5, userid: "busanit" });
console.log(arr.length + "명 입니다");
