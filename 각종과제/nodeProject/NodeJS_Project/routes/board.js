const express = require("express");
const router = express.Router();
const db = require("./db");
let title = "Bit Groupware";

// 게시판관리 페이지 (게시글 목록)
router.get("/board", (req, res) => {
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
router.get("/addPost", (req, res) => {
  res.render("addPost", { title, subTitle: " > Board > AddPost" });
});

router.post("/addPost", (req, res) => {
  let sql = "INSERT INTO board VALUES(NULL, ?, ?, ?, 1, now())";
  db.query(
    sql,
    [req.body.title, req.body.username, req.body.content],
    (err) => {
      if (err) {
        throw err;
      }
      res.redirect("/board/board");
    }
  );
});

// 게시글 삭제
router.get("/delPost/:idx", (req, res) => {
  let sql = "DELETE FROM board WHERE idx = ?;";
  db.query(sql, [req.params.idx], (err) => {
    if (err) {
      throw err;
    }
    console.log(req.params.idx + "번 게시글이 삭제되었습니다.");
    res.redirect("/board/board");
  });
});

// 게시글 수정
router.get("/upPost/:idx", (req, res) => {
  let sql = "SELECT * FROM board WHERE idx = ?;";
  db.query(sql, [req.params.idx], (err, result) => {
    if (err) {
      throw err;
    }
    res.render("upPost", { result, title, subTitle: " > Board > Update" });
  });
});

router.post("/upPost", (req, res) => {
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
    res.redirect("/board/board");
  });
});

// 게시글 상세보기
router.get("/postView/:idx", (req, res) => {
  let viewSQL = "SELECT * FROM board WHERE idx = ?;";
  db.query(viewSQL, [req.params.idx], (err, result) => {
    if (err) {
      throw err;
    }
    res.render("postView", { result, title, subTitle: " > Board > View" });
  });
});

// 게시글 검색
router.get("/postSearch", (req, res) => {
  // 제목 검색시
  if (req.query.selSearch2 == "title") {
    let sql =
      "SELECT idx, title, username, visit, regdate FROM board WHERE title like ? ORDER BY idx DESC;";
    db.query(sql, ["%" + req.query.search + "%"], (err, result) => {
      if (err) {
        throw err;
      }
      res.render("postSearch", {
        result,
        title,
        subTitle: " > Board > Search",
      });
    });
  }
  // 작성자검색시
  else if (req.query.selSearch2 == "username") {
    let sql =
      "SELECT idx, title, username, visit, regdate FROM board WHERE username like ? ORDER BY idx DESC;";
    db.query(sql, ["%" + req.query.search + "%"], (err, result) => {
      if (err) {
        throw err;
      }
      res.render("postSearch", {
        result,
        title,
        subTitle: " > Board > Search",
      });
    });
  }
  // 내용검색시
  else if (req.query.selSearch2 == "content") {
    let sql =
      "SELECT idx, title, username, visit, regdate FROM board WHERE content like ? ORDER BY idx DESC;";
    db.query(sql, ["%" + req.query.search + "%"], (err, result) => {
      if (err) {
        throw err;
      }
      res.render("postSearch", {
        result,
        title,
        subTitle: " > Board > Search",
      });
    });
  }
  // 등록일검색시
  else if (req.query.selSearch2 == "regdate") {
    let sql =
      "SELECT idx, title, username, visit, regdate FROM board WHERE regdate like ? ORDER BY idx DESC;";
    db.query(sql, ["%" + req.query.search + "%"], (err, result) => {
      if (err) {
        throw err;
      }
      res.render("postSearch", {
        result,
        title,
        subTitle: " > Board > Search",
      });
    });
  }
});

module.exports = router;
