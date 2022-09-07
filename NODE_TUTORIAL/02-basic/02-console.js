/* 클래스 = 객체 = 배열

    1. Object(JavaScript : 화면에 출력할 때, Json : 통신할 때) 출력
                key : "value"                "key":"value"
    
    2. const 객체명 = {};
    3. const 객체들명 = [{},{}];
*/

/* 객체 사용하는 이유
    - 처리해야 할 데이터가 많을 때 데이터를 다루기 쉽게 하기 위해서 
*/
const person = {
  userid: "KIM",
  passwd: "1234",
  username: "부산광역시",
};
//객체 출력

// 객체 1명 출력
console.log(person);
console.log(person.userid);

/*예제
if (person.passwd.length <= 8) {
  console.log("비밀번호는 8자리 이하로 설정하세요");
}

if (person.userid == "" && person.passwd == "") {
  console.log("회원가입 페이지로 이동합니다.");
} else {
  console.log("관리자 페이지로 이동합니다.");
}
*/

// 객체 3명 생성
const persons = [
  {
    userid: "RED",
    regdate: "2022-01-01",
  },
  {
    userid: "BLUE",
    regdate: "2022-08-15",
  },
  {
    userid: "GREEN",
    regdate: "2022-09-01",
  },
];

console.log(persons[0]);
console.log(persons[0].regdate);
console.log(persons[1]);
console.log(persons[1].userid);
console.log(persons[2]);
console.log("");
console.log("");
console.log("");

const jsObjUser = {
  userid: "Busanit",
  passwd: "12345",
};

// 웹 전송 : 문자열로 전송
// 숫자로 전송 : 문자로 -> 숫자로 변환해야 사용
const jsonObjUser = JSON.stringify(jsObjUser, null, 2);
console.log(jsonObjUser); // 서버로 전송

// 서버에서 내 컴퓨터에서 받으려면 js 객체로 바꿔야 함 - JSON.parse
const jsObjParse = JSON.parse(jsonObjUser);
console.log(jsObjParse);

/*
1. 객체 여러 개
    - for
    - sprea operation ... = concat
      (회원1, 회원2) -> (회원1, 회원2, 회원3, 회원4...)
*/

const users = [
  {
    id: 1,
    userid: "Busanit",
    gender: "M",
  },
  {
    id: 2,
    userid: "Seoulit",
    gender: "F",
  },
  {
    id: 3,
    userid: "Daeguit",
    gender: "M",
  },
];

for (let i = 0; i < users.length; i++) {
  /*
  console.log(
    "ID : " +
      users[i].id +
      "아이디 : " +
      users[i].userid +
      "성별 : " +
      users[i].gender
  );
  */
  console.log(
    `ID: ${users[i].id} / 아이디: ${users[i].userid} / 성별: ${users[i].gender}`
  );
}

const user = [
  {
    id: 4,
    userid: "Suwonit",
    gender: "F",
  },
  {
    id: 5,
    userid: "Ulsanit",
    gender: "M",
  },
];

const user1 = {
  id: 6,
  userid: "Incheonit",
  gender: "M",
};

const arr = []; //users+user

console.log("-----------------------------------------------------------");
// 객체명 또는 배열명.push - 배열이나 객체 안에 삽입(맨끝)
// 객체명 또는 배열명.pop - 배열이나 객체 밖으로 빼낼 때(맨끝)
// {...객체명} : 단일 객체를 추가할 때
arr.push(...users, ...user, { ...user1 });
console.log(arr.length);
console.log(arr);
