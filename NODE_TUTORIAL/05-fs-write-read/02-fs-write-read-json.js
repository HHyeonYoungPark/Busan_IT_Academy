/*
    1. Json 파일
    2. 절대경로
    3. 디렉토리 설정
    4. jsObject -> JsonObject -> fs.writeFile();
 */
const fs = require("fs");
const path = require("path");

/* JS -> JSON */

if (!fs.existsSync(path.join(__dirname, "db"))) {
  fs.mkdir(path.join(__dirname, "db"), (err) => {
    if (err) {
      throw err;
    }
  });
}

const users = [
  {
    id: 1,
    userid: "busanit",
    passwd: "12345",
    gender: "M",
    regdate: "2022-09-01",
  },
  {
    id: 2,
    userid: "seoulit",
    passwd: "12345",
    gender: "F",
    regdate: "2022-09-08",
  },
  {
    id: 3,
    userid: "suwonit",
    passwd: "77777",
    gender: "M",
    regdate: "2022-07-01",
  },
];

const user = {
  id: 4,
  userid: "osanit",
  passwd: "99999",
  gender: "M",
  regdate: "2022-05-01",
};

fs.readFile(path.join(__dirname, "db", "users.json"), "utf8", (err, data) => {
  if (err) {
    throw err;
  } else {
    //기존자료 읽어오기
    const jsObj = JSON.parse(data); // 프로그래밍 처리하 때는 parse()
    //console.log(jsObj);

    // 기존 + 새자료 = 기존자료 메모리
    jsObj.push({ ...user }); // jsObj(기존자료).(안에)push(제일 마지막에 새자료를 추가)

    //fs.writeFile(파일이름, 자료, 콜백);
    fs.writeFile("./db/users.json", JSON.stringify(jsObj, null, 2), (err) => {
      if (err) {
        throw err;
      }
    });
  }
});

const result = JSON.stringify(users, null, 2);
// console.log(result);

fs.writeFile(path.join(__dirname, "db", "users.json"), result, (err) => {
  if (err) {
    throw err;
  }
  console.log("json file이 생성되었습니다.");
});

// fs.readFile(파일이름, 파일포맷, 콜백(err, data));
// text -> "utf8"
fs.readFile(path.join(__dirname, "db", "users.json"), "utf8", (err, data) => {
  if (err) {
    throw err;
  }
  // js로 쓰기 할때는 -> json으로 변환 작업
  // json을 화면에 출력할 때는 -> js로 역변환
  console.log(JSON.parse(data));
});
