/*1. console.log(커맨드 출력) : debugging */
console.log("Welcome NodeJs"); // Browswe -> res.send(); 브라우저에서 출력
console.log("----------------------------------------");

/* 2. variable :
      let : 값을 재할당할 수 있다. - 반복문
      const : x - 나머지는 전부 const씀
*/
const number = 10;
console.log(number);
console.log("변수값은 " + number);
console.log(`변수값은 ${number}`);
console.log("변수값은 %d", number);
console.log("변수값은 %i", number);
console.log("----------------------------------------");

/* 3. function */
function sum(num1, num2) {
  return num1 + num2;
}
console.log(sum(10, 20));

const calc = (num3, num4) => num3 + num4;
console.log(calc(50, 50));

const add = (num5, num6) => {
  return num5 + num6;
};
console.log(add(100, 200));
console.log("----------------------------------------");

/* 4. Object : JavaScript Object <-> JSON Object
      (1) JavaScript Object : 화면에 출력할 때 - key 따옴표x
      (2) JSON Object : 인터넷으로 주고 받을 때 - Stringify, parse - key 따옴표o
*/
/* 객체 하나만 사용할 때는 {}, 객체를 여러개 사용할 때는 [{},{}] */
const jsObj = {
  id: 1,
  userid: "busanit",
  passwd: "12345",
  username: "Busan it Academy",
  gender: "M",
};
/* jsObj -> JsonObj : JSON.stringify(객체명) */
console.log("");
const jsonResult = JSON.stringify(jsObj, null, 2);
console.log(jsonResult);

/* JsonObj -> jsObj */
const jsResult = JSON.parse(jsonResult);
console.log(jsResult);

console.log(jsObj.userid);
console.log(jsObj.passwd);
