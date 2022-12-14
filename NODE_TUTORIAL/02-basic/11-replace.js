// str.replace(정규식, "바꿀단어")
const str = "This is NodeJS"; // NodeJS => ReactJS 로 바꾸고 싶다면...
const regExp = /nodejs/gi; // 정규식 g는 global, i는 대소문자구분x하게
const result = str.replace(regExp, "ReactJS!"); // repalce
console.log(result);

const str01 = "2022-09-15"; // 20220915, 2022/09/15로 바꾸기
const regExp02 = /-/g;
const regExp03 = /-/g;
const result02 = str01.replace(regExp02, "");
const result03 = str01.replace(regExp03, "/");
console.log(result02);
console.log(result03);

// 숫자를 찾아서 This is Javascript로 바꾸기
const str02 = "This9is1Javascript";
const regEx04 = /[0-9]/g;
const result04 = str02.replace(regEx04, " ");
console.log(result04);

/* 다중변경 : /검색어1 | 검색어2 | 검색어3/gi */
// 바꾼 후 대문자로 변경 : toUpperCase();
const str03 = "red house and green house and blue house";
const regEx05 = /red|green|blue/gi;
const result05 = str03.replace(regEx05, "Colors");
console.log(result05.toUpperCase());
