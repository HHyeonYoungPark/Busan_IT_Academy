const express = require("express");
const router = express.Router();
let title = "Bit Groupware";

// 메인 페이지
router.get("/", (req, res) => {
  res.render("main", { title, subTitle: " > Main" });
});

module.exports = router;
