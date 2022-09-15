/*
 1. 정규식(reExp) : Regular Expression
    - 필요한 내용이나 단어를 검색해서 수정/삭제 처리
 */

/* 정규식 사용 방법 */
const str = "This is NodeJS"; // 이메일, 전화번호, 우편번호: 형식에 맞는지 체크

// 검색어 설정
const regEx01 = /nodejs/;

// 검색 : 검색어.test(str); - console.log(); -> return true OR false: 영어 대소문자 구분함
console.log(regEx01.test(str));

/* g옵션 : 문장 전체, i 대소문자 구분없이 */
const regEx02 = /nodejs/gi; //검색어를 지정하고 뒤에 옵션을 지정하면 됨
console.log(regEx02.test(str));

/* 
    Server Node
     - Mysql에 INSERT INTO 테이블명 VALUES(); - 자료 등록
     - 웹주소를 이용해서 삭제해야 되는 경우
     - id int not null
       http://localhost:5000/delete/6
*/

const str01 = "NodeJS";
const regEx03 = /[0-9]/; // 숫자로 되어있는지 확인...
const regEx3 = /[^0-9]/; // 대괄호 안에 ^(반전)를 붙여서 글자로 되어 있는지 확인,,, ^ -> 반전 또는 시작으로 쓸수도 있음
console.log(regEx03.test(str01));

/* white space(공백) 체크 */
const str02 = "1 ";
const regEx04 = /\s/; /* 공백체크 : \s(space) */
console.log(regEx04.test(str02));

// 시작을 체크하는 ^, 마지막 내용을 체크하는 $
const str03 = "01064364837";
// 0~9 숫자로 시작하고 숫자로 끝나는 검색어 체크
const regEx05 = /^[0-9]+$/; // 대괄호 밖(앞쪽)에 ^ , +$ -> 여러개의 숫자로 끝난다
console.log(regEx05.test(str03));

// 전화번호 : 집(02...051) or 휴대전화(010)
// 숫자로 되어 있는지 확인 방법은 \d{2,3}
// 지역번호(통신사) : /^\d{2,3}/  =>  2자리(서울:02)가 될수도 있고 3자리가 될수도 있음
// 폰번호 가운데 3,4, 자리 : /\d{3,4}/
// 폰번호 끝자리 4 : /\d{4}$/
console.log("");
const str04 = "010-1234-5678";
const regEx06 = /^\d{2,3}-\d{3,4}-\d{4}$/;
console.log(regEx06.test(str04));

/* 주민번호 */
// 앞6자리, 뒤7자리
// 8번째 자리 : 1,2,3,4 중 하나
const str05 = "001234-1156231";
const regEx07 = /\d{6}-[1-4]\d{6}/; //6자리보다 적게 적으면 false 나오는데 많이 적으면 true나옴...
console.log(regEx07.test(str05));

/* 우편번호 5자리 : 3-2 */
const str06 = "183-94";
const regEx08 = /\d{3}-\d{2}$/;
console.log(regEx08.test(str06));

/* 이메일 : 기본타입 @ 체크 : indexOf('@', str07); */
// .com - 상업적인 도메인 ... .co.kr - 국가 도메인
//  계정(시작 숫자, 글자) @ 도메인(.com, .co.kr)$
const str07 = "busanit@busanit.co.kr";
const regEx09 = /@/g; // 단순하게 @만으로 이메일임을 체크하는 경우
console.log(regEx09.test(str07));

/* 이메일 실제 정규식 */
const regEx10 =
  /^[0-9a-zA-Z]+@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])+\.[a-zA-Z]{2,3}$/;
// 시작 -> 숫자, 영어 소대문자 + @ 숫자, 영어 소대문자 + \.(그냥.쓰면 프로그램으로 인식)
console.log(regEx10.test(str07));

/*
정규식 (체크) -> 다시 입력, 불필요한 내용을 바꾸거나 삭제
                - trim, replace
*/
