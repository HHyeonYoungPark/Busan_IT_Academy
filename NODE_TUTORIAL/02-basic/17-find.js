/* find */

const employees = [
  { id: 1, username: "KIM", salary: 888888888888888880000 },
  { id: 2, username: "PARK", salary: 90000 },
  { id: 3, username: "LEE", salary: 30000 },
];

// 인덱스 번호로 찾기 : findIndex() : 숫자로 된 id를 이용하여 검색
const result3 = employees.findIndex((em) => em.id == 1);
console.log(result3 + "입니다");

// 수정 : UPDATE 테이블이름 SET 바꿀컬럼명1 ="값", ... WHERE id = 바꿀pk;
// 삭제 : DELETE FROM 테이블이름 WHERE id = 삭제할 pk;
// 상세보기 : SELECT * FROM 테이블명 WHERE id = 상세보기 할 pk;

// id 2번인 사람의 정보를 삭제
const result = employees.find((emp) => emp.id == 2); // 결과값을 return
console.log(result);

const result1 = employees.filter((emp) => emp.id == 3);
console.log(result1);

const result2 = employees.find((emp) => {
  /*
    if (emp.username == "PARK") {
    return true; // 참인 배열을 return
  }
  */
  return emp.username == "PARK";
});
console.log(result2);
