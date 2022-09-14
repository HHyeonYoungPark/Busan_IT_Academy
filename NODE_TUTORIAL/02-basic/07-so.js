/* 
1. Spread Operator : 값을 출력하거나 값을 이어붙이기 = concat
    - (...객체명)
    - ([...old, ...new]) : 배열(index 번호로 저장)
    - ([...old, ...new]) : 객체(key,value)    
*/

const olds = [1, 2, 3, 4, 5];
const news = [6, 7, 8, 9, 0];

/* concat : olds.concat(news) */
console.log(olds.concat(news));
console.log(...olds);
console.log("");
console.log("-------------------------------------------------------------");

/* 연결할 때는 braket 모양을 확인하고 연결 */
console.log([...olds, ...news]);

// 두개의 배열과 추가로 값 하나를 연결해서 출력하기
console.log([...olds, ...news, 11, 12, 13]);
console.log("");
console.log("-------------------------------------------------------------");

/* 더하기 함수 만들어서 값을 출력하는 spread operator */
// 1. 기본적인 방식
function add(x, y) {
  return x + y;
}
console.log(add(10, 20));

// 2. spread operator를 이용한 방식
const numbers = [10, 20];
console.log(...numbers); // 출력되는 값 10 20
console.log(add(...numbers)); // 출력되는 값 30
console.log("");
console.log("-------------------------------------------------------------");

const nums = [10, 20, 30];
function mul(a, b, c) {
  return a * b * c;
}
console.log(mul(...nums));

// {key:value}
const userid = {
  uid: "busan",
};
const passwd = {
  pwd: "12345",
};
const username = {
  uname: "busan",
};

// 3개를 이어붙혀서 key:value 형태로 만들기
console.log({ ...userid, ...passwd, ...username });

// 기존자료 3개({})가 []안에 있는 것에 이어붙일때 {이어붙일객체}를 적어주면 됨
const users = [
  { id: 1, userid: "busan", auth: "Y" },
  { id: 2, userid: "seoul", auth: "N" },
  { id: 3, userid: "suwon", auth: "Y" },
];
const user = { id: 4, userid: "daegu", auth: "Y" };
console.log([...users, { ...user }]);
