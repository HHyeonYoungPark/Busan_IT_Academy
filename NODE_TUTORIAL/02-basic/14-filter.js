/*
1. 데이터를 걸러내어 배열로 return
2. 사용방법은 forEach와 거의 동일
3. filter + forEach
*/

const array = [1, 2, 3, 4, 5, 6, 7, 8, 9];
/*
const result = array.filter((arr) => {
  //걸러낼 조건
  return arr % 2 == 0;
});
console.log(result);
result.forEach((res) => console.log(res));
*/

// channing 방법
const result = array
  .filter((arr) => {
    return arr % 2 == 0;
  })
  .forEach((arr) => console.log(arr));

/* jsObj + filter */
/* 권한(auth)이 false인 것만 출력 */
const users = [
  { id: 1, username: "KIM", auth: false },
  { id: 2, username: "PARK", auth: true },
  { id: 3, username: "LEE", auth: false },
];
const result02 = users.filter((user) => {
  return user.auth == false; // false 내용이 array
});
result02.forEach((res) =>
  console.log(res.username + "님은 웹사이트에 접근 불가합니다!")
);
console.log("---------------------------------");
users
  .filter((user) => user.auth == false)
  .forEach((u) => console.log(u.username + "님은 웹사이트에 접근 불가합니다!"));

/*
1. filter + push + spread Operator : 다른 배열에 저장
*/
console.log("---------------------------------");
const members = [
  { id: 1, nation: "Korea", auth: 3 },
  { id: 2, nation: "U.S.A", auth: 1 },
  { id: 3, nation: "Japan", auth: 1 },
];
const guest = []; //[sp]

// auth 1인 값을 filtering 한 후 새로운 배열에 저장하시오.
members.filter((member) => {
  if (member.auth < 3) {
    guest.push(member);
  }
});
console.log(guest);
