/* reduce : 합계함수 */

// 객체명.reduce((이전값, 이후값) => {
//     return 이전값 + 이후값;
// }, 초기값);

const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]; // 합계
const result = numbers.reduce((prev, next) => {
  return prev + next;
}, 0);
console.log(result);

// 사원급여의 총합을 출력하시오
const employees = [
  { username: "KIM", salary: 888888888888888880000 },
  { username: "PARK", salary: 90000 },
  { username: "LEE", salary: 30000 },
];
const result2 = employees.reduce((total, empSalary) => {
  return total + empSalary.salary;
}, 0);
console.log(result2);

/* 총합
let sum = 0;
for (let i = 0; i < numbers.length; i++) {
  sum += numbers[i];
}
console.log(sum);
*/
