const express = require("express");
const router = express.Router();
const db = require("./db");
let title = "Bit Groupware";

// 회원관리 페이지 (회원목록)
router.get("/member", (req, res) => {
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
router.post("/gradeUpdate", (req, res) => {
  let sql = "UPDATE member SET grade = ? WHERE idx = ?;";
  db.query(sql, [req.body.gradeValue, req.body.idValue], (err) => {
    if (err) {
      throw err;
    }
    res.send({ status: "success", grade: req.body.gradeValue });
  });
});

// 회원 추가
router.get("/addUser", (req, res) => {
  res.render("insert", { title, subTitle: " > Member > Insert" });
});

router.post("/addUser", (req, res) => {
  let sql = "INSERT INTO member VALUES(NULL, ?, ?, ?, ?, '일반', now());";
  db.query(
    sql,
    [req.body.username, req.body.userid, req.body.pw, req.body.email],
    (err) => {
      if (err) {
        throw err;
      }
      res.redirect("/member/member");
    }
  );
});

// 회원 삭제
router.get("/delUser/:idx", (req, res) => {
  let sql = "DELETE FROM member WHERE idx = ?;";
  db.query(sql, [req.params.idx], (err) => {
    if (err) {
      throw err;
    }
    console.log(req.params.idx + "번 회원이 삭제되었습니다.");
    res.redirect("/member/member");
  });
});

// 회원 수정
router.get("/upUser/:idx", (req, res) => {
  let sql = "SELECT * FROM member WHERE idx = ?;";
  db.query(sql, [req.params.idx], (err, result) => {
    if (err) {
      throw err;
    }
    res.render("upUser", { result, title, subTitle: " > Member > Update" });
  });
});

router.post("/upUser", (req, res) => {
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
      res.redirect("/member/member");
    }
  );
});

// 회원 상세보기
router.get("/userView/:idx", (req, res) => {
  let viewSQL = "SELECT * FROM member WHERE idx = ?;";
  db.query(viewSQL, [req.params.idx], (err, result) => {
    if (err) {
      throw err;
    }
    res.render("userView", { result, title, subTitle: " > Member > View" });
  });
});

// //회원 검색(test용)
// router.get("/member/userSearch", (req, res) => {
//   let sql =
//     "SELECT idx, username, userid, email, grade, regdate FROM member WHERE, CASE WHEN (req.query.selSearch == 'username') THEN 'username' CASE WHEN (req.query.selSearch == 'email') THEN 'email' CASE WHEN (req.query.selSearch == 'regdate') THEN 'regdate' like ? ORDER BY idx DESC;";
//   db.query(sql, ["%" + req.query.search + "%"], (err, result) => {
//     if (err) {
//       throw err;
//     }
//     console.log(req, query.selSearch);
//     console.log(req.query.search);
//     console.log(result);
//     res.render("userSearch", { result, title, subTitle: " > Member > Search" });
//   });
// });

// 회원 검색결과
router.get("/userSearch", (req, res) => {
  // 이름검색시
  if (req.query.selSearch == "username") {
    let sql =
      "SELECT idx, username, userid, email, grade, regdate FROM member WHERE username like ? ORDER BY idx DESC;";
    db.query(sql, ["%" + req.query.search + "%"], (err, result) => {
      if (err) {
        throw err;
      }
      res.render("userSearch", {
        result,
        title,
        subTitle: " > Member > Search",
      });
    });
  }
  // 이메일검색시
  else if (req.query.selSearch == "email") {
    let sql =
      "SELECT idx, username, userid, email, grade, regdate FROM member WHERE email like ? ORDER BY idx DESC;";
    db.query(sql, ["%" + req.query.search + "%"], (err, result) => {
      if (err) {
        throw err;
      }
      res.render("userSearch", {
        result,
        title,
        subTitle: " > Member > Search",
      });
    });
  }
  // 가입일검색시
  else if (req.query.selSearch == "regdate") {
    let sql =
      "SELECT idx, username, userid, email, grade, regdate FROM member WHERE regdate like ? ORDER BY idx DESC;";
    db.query(sql, ["%" + req.query.search + "%"], (err, result) => {
      if (err) {
        throw err;
      }
      res.render("userSearch", {
        result,
        title,
        subTitle: " > Member > Search",
      });
    });
  }
});

module.exports = router;
