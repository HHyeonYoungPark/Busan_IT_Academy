const express = require("express");
const mysql = require("mysql");
const app = express();
const PORT = 3000;

// mysql 연결 => mysql.createconnection();
const db = mysql.createConnection({
  host: "localhost",
  user: "login",
  password: "1234",
  database: "login",
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

//목록
app.get("/", (req, res) => {
  let sql = "SELECT * FROM members ORDER BY id DESC;";
  db.query(sql, (err, result) => {
    if (err) {
      throw err;
    }
    console.log(result);
    res.render("list", { result });
  });
});

//
app.get("/addUser", (req, res) => {
  res.render("addUser");
});

//저장
app.post("/addUser", (req, res) => {
  const user = {
    userid: req.body.userid,
    passwd: req.body.passwd,
    username: req.body.username,
    post: req.body.post,
    addr: req.body.addr,
    hp: req.body.hp,
  };
  //   console.log(user); 디버깅용 node서버로 입력내용이 넘어오는지 console로 확인
  let sql = "INSERT INTO members VALUES(NULL, ?, ?, ?, ?, ?, ?,'일반',now())";
  db.query(
    sql,
    [user.userid, user.passwd, user.username, user.post, user.addr, user.hp],
    (err) => {
      if (err) {
        throw err;
      }
      res.redirect("/");
    }
  );
});

app.post("/gradeUpdate", (req, res) => {
  //   console.log(req.body.gradeValue); 서버로 선택된 내용이 들어오는지 디버깅용
  //   console.log(req.body.idValue);
  let sql = "UPDATE members SET grade = ? WHERE id = ?;";
  db.query(sql, [req.body.gradeValue, req.body.idValue], (err) => {
    if (err) {
      throw err;
    }

    // res.send({ status: "success", grade: req.body.gradeValue });

    const result = {
      status: "success",
      grade: req.body.gradeValue,
    };
    res.send(result);
  });
});

app.listen(PORT, () => console.log(`Server Running : ${PORT}`));
