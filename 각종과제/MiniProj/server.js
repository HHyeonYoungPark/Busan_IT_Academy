const express = require("express");
const mysql = require("mysql");
const path = require("path");

const app = express();
const PORT = 3000;

// mysql 연결 => mysql.createconnection();
const db = mysql.createConnection({
  host: "localhost",
  user: "Grpware",
  password: "Grpware",
  database: "Grpware",
  dateStrings: "date",
});
// db.connect()
db.connect((err) => {
  if (!err) {
    console.log("Mysql Success");
  } else {
    console.log(err);
  }
});

// middleware
app.set("view engine", "ejs");
app.use(express.json()); //ajax쪽에서 사용
app.use(express.urlencoded({ extended: false }));
app.use(express.static(path.join(__dirname, "/assets/css")));

// 메인 페이지
let title = "Bit Groupware";
app.get("/", (req, res) => {
  res.render("main", { title, subTitle: " > Main" });
});

// 회원관리 페이지(회원목록)
app.get("/member", (req, res) => {
  let sql =
    "SELECT idx, username, userid, email, grade, regdate FROM member ORDER BY idx DESC;";
  db.query(sql, (err, result) => {
    if (err) {
      throw err;
    }
    res.render("member", { result });
  });
});

// 회원 추가
app.get("/addUser", (req, res) => {
  res.render("insert", { title, subTitle: " > Member > Insert" });
});

app.post("/addUser", (req, res) => {
  let sql = "INSERT INTO member VALUES(NULL, ?, ?, ?, ?, '일반', now());";
  db.query(
    sql,
    [req.body.username, req.body.userid, req.body.pw, req.body.email],
    (err) => {
      if (err) {
        throw err;
      }
      res.redirect("/member");
    }
  );
});

// 회원 삭제
app.get("/delUser/:idx", (req, res) => {
  let sql = "DELETE FROM member WHERE idx = ?;";
  db.query(sql, [req.params.idx], (err) => {
    if (err) {
      throw err;
    }
    console.log(req.params.idx + "번 회원이 삭제되었습니다.");
    res.redirect("/member");
  });
});

// 회원 수정
app.get("/upUser/:idx", (req, res) => {
  let sql = "SELECT * FROM member WHERE idx = ?;";
  db.query(sql, [req.params.idx], (err, result) => {
    if (err) {
      throw err;
    }
    res.render("upUser", { result });
  });
});

app.post("/upUser", (req, res) => {
  let sql = "UPDATE member SET ";
  sql += "username=?, userid=?, pw=?, email=?, regdate=now() ";
  sql += "WHERE idx = ?;";

  const user = {
    idx: req.body.idx,
    username: req.body.username,
    userid: req.body.userid,
    pw: req.body.pw,
    email: req.body.email,
  };

  db.query(
    sql,
    [user.username, user.userid, user.pw, user.email, user.idx],
    (err) => {
      if (err) {
        throw err;
      }
      console.log(req.body.idx + "번 회원이 수정되었습니다.");
      res.redirect("/member");
    }
  );
});

// 회원 상세보기
app.get("/userView/:idx", (req, res) => {
  let viewSQL = "SELECT * FROM member WHERE idx = ?;";
  db.query(viewSQL, [req.params.idx], (err, result) => {
    if (err) {
      throw err;
    }
    res.render("userView", { result });
  });
});

// 게시판관리 페이지
app.get("/board", (req, res) => {
  res.render("board", { title, subTitle: " > Board" });
});

app.listen(PORT, () => console.log(`Server Running...localhost:${PORT}`));
