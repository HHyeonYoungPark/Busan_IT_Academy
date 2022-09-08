/* 
1. 파일을 사용하기 쉽게 쪼개서 사용
  - custom 모듈을 사용하는 이유는 파일관리를 쉽게 하기 위해서 또는
    파일공유를 하기 위해서
*/

/*
공유
module => 객체, interface
Main은 일반적으로 기본적인 코드만 두고 실행
router, controller
*/

/*
Controller : 주소관리
Model : 자료저장
Service : 예외처리
View : 화면구성

MVC모델 -> Model, View, Controller
*/

/* 1번 방법(제일 쉬운 방법)
const u = require("./users");
console.log(u.person);
console.log(u.color);
*/

/* 2번 방법 - 묶음
const { person, color } = require("./users");
console.log(person);
console.log(color);
 */

/* 3번 방법
const u = require("./users");
console.log(u.p1);
console.log(u.c1);
*/

/* 4번 방법 */
const { p1, c1 } = require("./users");
console.log(p1[0]);
console.log(c1[1]);
