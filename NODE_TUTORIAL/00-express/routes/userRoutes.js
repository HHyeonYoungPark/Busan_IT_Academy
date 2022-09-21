const express = require("express");
const router = express.Router();
// shopping Mall : users, items => url 만들기

// users : 전체보기, 상세보기, 입력, 수정, 삭제, 검색
router.get("/", (req, res) => {
  res.send("사용자 전체 보기"); // localhost:3000/users
});
// 사용자 상세보기(1명)
router.get("/getOne/5", (req, res) => {
  res.send("5번 사용자 상세 보기"); //localhost:3000/users/getOne/5
});
// 입력
router.get("/insert", (req, res) => {
  res.send("사용자 등록하기");
});
// 수정
router.get("/update/5", (req, res) => {
  res.send("5번 사용자 수정하기");
});
// 삭제
router.get("/delete/5", (req, res) => {
  res.send("5번 사용자 삭제하기");
});
// 검색
router.get("/search/busanit", (req, res) => {
  res.send("검색단어 busanit 검색하기");
});

//분리시킨 파일을 다른 곳에서 사용할 수 있게 module.exports
module.exports = router;
