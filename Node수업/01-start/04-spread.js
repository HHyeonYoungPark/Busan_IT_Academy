const olds = [1, 2, 3, 4, 5];
const news = [5, 6, 7, 8, 9, 10];

/* 기존 자료를 출력 */
console.log(olds);
console.log(...olds);
console.log("----------------------------------------");

/* concat 이어 붙이기 */
const concatResult = olds.concat(news);
console.log(concatResult);
console.log("----------------------------------------");

/* spread operator 이어 붙이기 */
const soResult = [...olds, ...news]; // concat보다 빠름..?
console.log(soResult);
console.log("----------------------------------------");

const soResult2 = [...olds, ...news, 11, 12]; // 추가하고 싶으면 뒤에 이어쓰면 됨
console.log(soResult2);
