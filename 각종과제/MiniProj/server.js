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

// 회원관리 페이지 (회원목록)
app.get("/member", (req, res) => {
  let sql =
    "SELECT idx, username, userid, email, grade, regdate FROM member ORDER BY idx DESC;";
  db.query(sql, (err, result) => {
    if (err) {
      throw err;
    }
    res.render("member", { result, title, subTitle: " > Member" });
  });
});

// 회원 등급 변경
app.post("/gradeUpdate", (req, res) => {
  let sql = "UPDATE member SET grade = ? WHERE idx = ?;";
  db.query(sql, [req.body.gradeValue, req.body.idValue], (err) => {
    if (err) {
      throw err;
    }
    res.send({ status: "success", grade: req.body.gradeValue });
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
    res.render("upUser", { result, title, subTitle: " > Member > Update" });
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
    res.render("userView", { result, title, subTitle: " > Member > View" });
  });
});

// 회원 검색

///////////////////////////////////////////////////////////////////////////////////////////////

// 게시판관리 페이지 (게시글 목록)
app.get("/board", (req, res) => {
  let sql =
    "SELECT idx, title, username, visit, regdate FROM board ORDER BY idx DESC;";
  db.query(sql, (err, result) => {
    if (err) {
      throw err;
    }
    res.render("board", { result, title, subTitle: " > Board" });
  });
});

// 게시글 작성
app.get("/addPost", (req, res) => {
  res.render("addPost", { title, subTitle: " > Board > AddPost" });
});

app.post("/addPost", (req, res) => {
  let sql = "INSERT INTO board VALUES(NULL, ?, ?, ?, 1, now())";
  db.query(
    sql,
    [req.body.title, req.body.username, req.body.content],
    (err) => {
      if (err) {
        throw err;
      }
      res.redirect("/board");
    }
  );
});

// 게시글 삭제
app.get("/delPost/:idx", (req, res) => {
  let sql = "DELETE FROM board WHERE idx = ?;";
  db.query(sql, [req.params.idx], (err) => {
    if (err) {
      throw err;
    }
    console.log(req.params.idx + "번 게시글이 삭제되었습니다.");
    res.redirect("/board");
  });
});

// 게시글 수정
app.get("/upPost/:idx", (req, res) => {
  let sql = "SELECT * FROM board WHERE idx = ?;";
  db.query(sql, [req.params.idx], (err, result) => {
    if (err) {
      throw err;
    }
    res.render("upPost", { result, title, subTitle: " > Board > Update" });
  });
});

app.post("/upPost", (req, res) => {
  let sql = "UPDATE board SET ";
  sql += "title=?, username=?, content=?, regdate=now() ";
  sql += "WHERE idx = ?;";

  const post = {
    idx: req.body.idx,
    title: req.body.title,
    username: req.body.username,
    content: req.body.content,
  };

  db.query(sql, [post.title, post.username, post.content, post.idx], (err) => {
    if (err) {
      throw err;
    }
    console.log(req.body.idx + "번 게시글이 수정되었습니다.");
    res.redirect("/board");
  });
});

// 게시글 상세보기
app.get("/postView/:idx", (req, res) => {
  let viewSQL = "SELECT * FROM board WHERE idx = ?;";
  db.query(viewSQL, [req.params.idx], (err, result) => {
    if (err) {
      throw err;
    }
    res.render("postView", { result, title, subTitle: " > Board > View" });
  });
});

// 게시글 검색

app.listen(PORT, () => console.log(`Server Running...localhost:${PORT}`));
