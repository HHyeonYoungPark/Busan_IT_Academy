console.log("Hello World~~");
/*

let year = "2022";
let month = "07";
let day = "15";

let today = year + "." + month + "." + day;
console.log(today);

let date = `${year}-${month}-${day}`;
console.log(date);

// console.log(date.length);
// for (let i = 0; i < date.length; i++) {
//   console.log(date[i]);
// }

let str = "busan it academy";
console.log(str.toUpperCase()); // ->메소드는 뒤에 ()가 붙어야 한다.

//
let myEmail = "aud8637282@naver.com";
// 있으면 값이(숫자)가 나오고 없으면 -1이 나옴
console.log(myEmail.indexOf("@")); //이런식으로 이메일형식인지 확인할 수 있음
if (myEmail < 0) {
  console.log("이메일 형식이 틀립니다.");
} else {
  console.log("사용 가능합니다.");
}
//

let myEmail2 = "aud8637282@naver.com";
let result = myEmail2.indexOf("@");
if (result < 0) {
  console.log("사용할 수 없습니다");
} else {
  console.log("사용할 수 있습니다");
}

// 들어가 있는 내용을 없앨 수 있음
let yourEmail = "aud8637282?naver.com";
let result1 = yourEmail.replace("?", "");
console.log(result1);

//ex
const pi = 3.14;
let radius = 10;
console.log(pi * radius * radius);
console.log(pi * radius ** 2); //거듭제곱

//  /-> 나누기, % ->나머지 구하기
console.log(10 / 3); //몫 3.33333333~
console.log(10 % 3); //나머지 1

*/

//증감연산자 ++
let likes = 10;
likes = likes + 1;
console.log(likes);

likes -= 1;
console.log(likes);

console.log(++likes); // 1 증감시키고 출력
console.log(likes++); // 출력하고 나중에 증감
console.log(likes);

//NaN : 글자로 나눌 때(잘못 나눴을 때)
//defined : 값이 x
console.log(10 / "한글");

//html 화면에 출력 -> 변수를 사용할 때는 백틱(``);
let title = "Busan It";
let content = "Busan Metropolitan..";
let html = `
    <h2>${title}</h2>
    <p>${content}</p>
`;
console.log(html);

let array = ["one", "two", "three", "four", "five", 100, false];

//
// 배열이름.forEach(별명 => 출력)
// 배열이름.forEach((별명) => {출력})
//array.forEach((arr) => console.log(arr));

array.forEach((arr) => {
  console.log(arr);
});

console.log(array.join(","));
// let arrResult = array.concat(["four", "five"]);
// console.log(arrResult);

// let pushResult = array.push("1", "2", "3");
// console.log(array);

// let popResult = array.pop();
// console.log(array);

// let board = "1번 게시물입니다.";
// let res = board.includes("1");
// console.log(res);

// let arrays = ["java", "python", "vue", "angular", "react"];
// console.log(arrays.includes("react"));

//비교연산자 ===
// let num1, num2;
// num1 = 10;
// num2 = "10";
// console.log(typeof num1);
// console.log(typeof num2);

// if (num1 === num2) {
//   console.log("같음");
// }

// console.log(Boolean(-1));   //true는 0을 제외한 모든수(1만이 아님,,,)
// console.log(Boolean(0));    //false는 0

let names = ["kim", "lee", "park", "choi", "jung"];
console.log(`가입된 총 회원은 ${names.length}명 입니다.`);
names.forEach((name) => {
  console.log(name);
});
let passwd = "dsfsds";
if (passwd.length > 12 && passwd.includes("@")) {
  console.log("very strong!");
} else if (passwd.length >= 8) {
  console.log("normal");
} else {
  console.log("it is too short. again...");
}
