const express = require("express");
const fs = require("path");
const mysql = require("mysql");
const alert = require("alert");

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

app.set("view engine", "ejs"); // ejs middleware - views 폴더에 있는 파일 읽어오기
app.use(express.urlencoded({ extended: false }));

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
    alert("사용자가 추가되었습니다."); //alert - 좀 느림
    res.redirect("/list");
  });
});

app.listen(PORT, () => console.log(`http://localhost:${PORT}`));
