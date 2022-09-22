const express = require("express");
const fs = require("path");
const mysql = require("mysql");
const path = require("path");
const { get } = require("http");

const app = express();
const PORT = 3000;

// mysql 연결 => mysql.createconnection();
const db = mysql.createConnection({
  host: "localhost",
  user: "login",
  password: "1234",
  database: "login",
});
db.connect((err) => {
  if (!err) {
    console.log("Mysql Success");
  } else {
    console.log(err);
  }
});

// middleware
app.set("view engine", "ejs");
app.use(express.urlencoded({ extended: false })); //url에 있는 정보를 서버로 받게해줌
app.use(express.static(path.join(__dirname, "/assets/css")));

// url
app.get("/", (req, res) => {
  res.render("index");
});

app.get("/userList", (req, res) => {
  let sql = "SELECT regID, username FROM register ORDER BY regID DESC;";
  // db 쿼리문을 실행해서 result값을 userList에 넣어줌
  db.query(sql, (err, result) => {
    if (err) {
      throw err;
    }

    //console.log(result);
    res.render("userList", { result });
  });
});

let title = "Member Management System";
app.get("/addUser", (req, res) => {
  res.render("insert", { title, subTitle: "> Insert" });
});

app.post("/addUser", (req, res) => {
  //   console.log(req.body.username); 데이터가 제대로 넘어오는지 콘솔로 확인 후 sql작업시작
  //   console.log(req.body.passwd);
  let sql = "INSERT INTO register VALUES(NULL, ?, ?, now());"; //insert
  //sql문을 실행 (sql, [?값을 입력(?없으면 []안 써도 됨)], 콜백)
  db.query(sql, [req.body.username, req.body.passwd], (err) => {
    if (err) {
      throw err;
    }
    res.redirect("/userList");
  });
});

app.get("/delUser/:id", (req, res) => {
  // html form 에서 넘어올 때 req.body.name값
  // db pk -> req.params.id
  // console.log(req.params.id);
  let sql = "DELETE FROM register WHERE regID = ?;";
  db.query(sql, [req.params.id], (err) => {
    if (err) {
      throw err;
    }
    console.log(req.params.id + "번 회원이 삭제되었습니다.");
    res.redirect("/userList");
  });
});

app.get("/upUser/:id", (req, res) => {
  //   console.log(req.params.id); 값이 넘어오는 것을 확인 후..
  let sql = "SELECT * FROM register WHERE regID = ?;";
  db.query(sql, [req.params.id], (err, result) => {
    if (err) {
      throw err;
    }
    //console.log(result[0].regID);
    res.render("upUser", { result });
  });
});

app.post("/upUser", (req, res) => {
  // 자료가 url에서 서버로 잘 넘어가는지 확인
  //   console.log(req.body.regID);
  //   console.log(req.body.username);
  //   console.log(req.body.passwd);
  let sql = "UPDATE register SET ";
  sql += "username=?, passwd=?, regdate=now() ";
  sql += "WHERE regID = ?;";

  const user = {
    id: req.body.regID,
    uname: req.body.username,
    pwd: req.body.passwd,
  };

  db.query(sql, [user.uname, user.pwd, user.id], (err) => {
    if (err) {
      throw err;
    }
    console.log(req.body.regID + "번 회원이 수정되었습니다.");
    res.redirect("/userList");
  });
});

app.get("/userView/:id", (req, res) => {
  let viewSQL = "SELECT * FROM register WHERE regID = ?;";
  db.query(viewSQL, [req.params.id], (err, result) => {
    if (err) {
      throw err;
    }
    //console.log(result);
    res.render("userView", { result });
  });
});

app.listen(PORT, () => console.log(`http://localhost:${PORT}`));
