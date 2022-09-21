const express = require("express");
const mysql = require("mysql");
const app = express();

/* mysql db connect : mysql.createConnection() */
// db : 연결되면 true, false
const db = mysql.createConnection({
  host: "localhost",
  user: "login",
  password: "1234",
  database: "login",
});

if (
  db.connect((err) => {
    if (!err) {
      console.log("Database Connection Success.");
    } else {
      console.log(err);
    }
  })
);

app.set("view engine", "ejs"); // ejs middleware

app.get("/", (req, res) => {
  // 버튼 보여주기 위한 url
  res.render("create");
});

app.get("/createTB", (req, res) => {
  // 클릭했을때 실행하는 url
  //   console.log("create url success");
  let sql = "CREATE TABLE login(userid varchar(30),passwd varchar(20));";
  // 실행시키는 방법 : db.query(변수명, 콜백)
  db.query(sql, (err) => {
    if (err) {
      throw err;
    }
    console.log("테이블 생성 완료");
    res.redirect("/"); // 첫페이지로 가라! localhost:3000
  });
});

app.get("/dropTB", (req, res) => {
  //   console.log("drop url success");
  let sql = "DROP TABLE login;";
  db.query(sql, (err) => {
    if (err) {
      throw err;
    }
    console.log("테이블 삭제 완료");
    res.redirect("/"); // 첫페이지로 가라! localhost:3000
  });
});

app.get("/selectAll", (req, res) => {
  let sql = "SELECT * FROM login ORDER BY userid DESC;";
  db.query(sql, (err, result) => {
    if (err) {
      throw err;
    }
    console.log(result);
    res.render("list", { result });
  });
});

app.listen(3000, () => console.log("Server Running...3000"));
