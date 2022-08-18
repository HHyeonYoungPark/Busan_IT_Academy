/* 1. 사용을 위한 import ------------------------------------------------ */
/* 사용해야 할 프로그램을 설치 후 사용하기 위한 require 처리 부분 */
/* npmjs.com에 사용 방법은 간략하게 나옴 */
const ejs = require("ejs");
const mysql = require("mysql");
const express = require("express");
const app = express();
/* 1. end --------------------------------------------------------------- */

/* 3. ------------------------------------------------------------------- */
// 사용할 데이터베이스 정보(url, userid, password, database 설정) 및 데이터베이스 연결정보 등록 */
const dbconnect = mysql.createConnection({
  host: "localhost",
  port: 3306,
  user: "busanit",
  password: "1234",
  database: "busanit",
  dateStrings: "date",
});

dbconnect.connect((err) => {
  if (!err) {
    console.log("데이터베이스 연결에 성공했습니다.");
  } else {
    console.log(err); //err 문서를 보여줌
  }
});
/* 3. end --------------------------------------------------------------- */

let PORT = 5000;
/* 2. ------------------------------------------------------------------- */
// 서버에서 사용할 포트 번호를 설정 : 3000, 4000, 5000
app.listen(5000, () => console.log("서버 시작 완료..."));
/* 2. end --------------------------------------------------------------- */

/* 4. ------------------------------------------------------------------- */
/*  어떤 html 구현 방식을 사용할 건지 : ejs 설정 : app.set(); */
app.set("view engine", "ejs");
// html -> views 폴더에 있어야 함
// 확장자명.ejs 로 해줘야 함.
/* 4. end --------------------------------------------------------------- */

/* 5. ------------------------------------------------------------------- */
/* 사용할 middleware 설정 : json 처리 - app.use();
    : Server와 Client 사이에서 데이터를 전송할 때 필요한 작업 */
app.use(express.urlencoded({ extended: false }));
app.use(express.json());
app.use("/views", express.static("views"));

/* 5. end --------------------------------------------------------------- */

/* 6. ------------------------------------------------------------------- */
/*  주소관리 : rest api
    - get : 입력화면, 수정화면을 가지고 오거나 삭제할 때  ex) get : /register
	  - 정확하게는 get 방식 : url(주소)를 보여 주면서 처리해야 할 때
    - post : 저장, 수정할 때 ex) post : /register
      - 정확하게는 post 방식 : url(주소)를 보여주지 않고 처리해야 할 때 */

app.get("/", (req, res) => {
  //console.log("콘솔에서 보이는 글자");
  //res.send("브라우저에서 글자보임");
  res.render("index", { title: "Home" }); // 렌더-html이나 파일을 보여주는거,, 파일 이름을 적어주면 됨(확장자X)
});

app.get("/register", (req, res) => {
  res.render("register", { title: "Home > Register" }); // 렌더-html이나 파일을 보여주는거,, 파일 이름을 적어주면 됨(확장자X)
});

app.post("/register", (req, res) => {
  const sql = "INSERT INTO tb_users VALUES(null, ?, ?, ?, now());";
  // db 접속 -> insert를 실행하기 위한 코드
  dbconnect.query(
    sql,
    [req.body.userid, req.body.passwd, req.body.username],
    (err) => {
      //입출력 : 예외처리를 꼭 해줘야 한다
      if (!err) {
        console.log("회원가입이 완료되었습니다.");
        res.redirect("/list"); //회원리스트페이지로 보내줌
      } else {
        console.log("관리자에게 문의하세요.\n" + err);
        res.redirect("/register"); //저장이 안됐으니까 다시 회원가입창으로
      }
    }
  );
  // 특정하나만 서버에 저장하고 싶다면 (req.body.변수명)

  // 이렇게 쓸수도 있음
  //const { userid, passwd, username } = req.body;
});

app.get("/list", (req, res) => {
  //res.render("list", { title: "Home > List" }); // 렌더-html이나 파일을 보여주는거,, 파일 이름을 적어주면 됨(확장자X)
  const sql = "SELECT * FROM tb_users ORDER BY num DESC";
  dbconnect.query(sql, (err, results) => {
    res.render("list", { title: "Home > List", users: results }); //저장된 결과를 가지고 list로 넘어간다
    console.log(results);
  });
});
/* 6. end --------------------------------------------------------------- */
