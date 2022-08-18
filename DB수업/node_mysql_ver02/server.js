//1
const ejs = require("ejs");
const mysql = require("mysql");
const express = require("express");
const app = express();

//2
app.listen(3000, () => console.log("서버 작동, port 3000"));

//3
const dbconnection = mysql.createConnection({
  host: "localhost",
  port: 3306,
  user: "busanit",
  password: "1234",
  database: "busanit",
  dateStrings: "date",
});

dbconnection.connect((err) => {
  if (!err) {
    console.log("데이터베이스 연결에 성공했습니다.");
  } else {
    console.log(err); //err 문서를 보여줌
  }
});

//4
app.set("view engine", "ejs");

//5
app.use(express.urlencoded({ extended: false }));
app.use(express.json());
app.use("/views", express.static("views"));

//6
app.get("/", (req, res) => {
  res.render("home", { title: "Home" });
});

app.get("/login", (req, res) => {
  res.render("login", { title: "Home > 로그인" });
});

app.get("/register", (req, res) => {
  res.render("register", { title: "Home > 회원가입" });
});

app.post("/register", (req, res) => {
  const sql = "INSERT INTO tb_users VALUES(null, ?, ? ,?, ?, now())";
  dbconnection.query(
    sql,
    [req.body.userid, req.body.passwd, req.body.eamil, req.body.username],
    (err) => {
      if (!err) {
        console.log("회원가입이 완료되었습니다.");
        res.redirect("/memberList");
      } else {
        console.log("관리자에게 문의하세요.");
        res.redirect("/register");
      }
    }
  );
});

app.get("/memberList", (req, res) => {
  const sql = "SELECT * FROM tb_users ORDER BY num DESC";
  dbconnection.query(sql, (err, results) => {
    res.render("memberList", { title: "Home > 회원목록", users: results }); //저장된 결과를 가지고 list로 넘어간다
    console.log(results);
  });
});
