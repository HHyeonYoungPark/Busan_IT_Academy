// db 또는 file에 회원가입한 사용자가 저장되어 있다고 가정
const p1 = ["KIM", "LEE", "PARK", "CHOI"];
const c1 = ["RED", "GREEN", "BLUE"];

// module.exports.쓰고싶은 변수이름 = 내보낼 변수

/* module 1번 방법
module.exports.person = p1;
module.exports.color = c1;
*/

/* 2번 방법
module.exports = {
    person: p1,
    color: c1
}
*/

module.exports = {
  // 변수 = 값 이름이 동일하다면 한번만 적으면 된다
  p1, // 변수명 : 값
  c1, // 변수명 : 값
};
