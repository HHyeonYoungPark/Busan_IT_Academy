/*
1. for(let 별명 of 객체명){출력코드}*/
const colors = ["#fff", "#f00", "#0f0", "#00f", "ivory"];
for (let c of colors) {
  console.log(`<table color=${c}></table>`);
}

const str = "Busanit"; // 문자열은 배열(객체)
for (let s of str) {
  console.log(s);
}

// index가 필요없이 값을 출력하는 곳에서
const users = [{ username: "KIM" }, { username: "PARK" }];
for (let user of users) {
  console.log(user);
}
console.log("");
console.log("-------------------------------------------------------------");

// 2. 객체명.forEach((별명) => {출력코드})
const arr = ["Spring", "Summer", "Fall", "Winter"];
const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9];
const evens = []; // 짝수만 저장하는 배열

// 1줄로 표현할 때
arr.forEach((a) => console.log(a));

// 2줄 이상으로 표현할 때
arr.forEach((a) => {
  // 제목 + 내용 : 2줄처리
  console.log("사계절을 출력하시오.");
  console.log(a);
});

// index 사용할 때 - 번호도 출력
arr.forEach((a, index) => {
  // value, index
  console.log(`${index} : ${a}`);
});

// 짝수만 구분해서 배열에 따로 저장할 때(push);
// 값 % 2 == 0 : 짝수 => push
// for => 짝수 검사 => push
numbers.forEach((num) => {
  if (num % 2 == 0) {
    evens.push(num);
  }
});
console.log(evens);
