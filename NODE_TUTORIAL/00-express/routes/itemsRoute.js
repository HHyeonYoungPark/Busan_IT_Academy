const express = require("express");
const router = express.Router();

// /items/상품전체보기, 수정, 삭제
// 상품 전체 목록보기
route.get("/", (req, res) => {
  res.send("상품 전체 목록 보기");
});
// 상품 수정
route.get("/update/3", (req, res) => {
  res.send("3번 상품 수정하기");
});
// 상품 삭제
route.get("/delete/3", (req, res) => {
  res.send("3번 상품 삭제하기");
});

module.exports = router;
