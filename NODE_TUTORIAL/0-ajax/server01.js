const express = require("express");
const mysql = require("mysql");

const app = express();
const PORT = 3000;

// middleware
app.set("view engine", "ejs");

app.use(express.json());

app.get("/", (req, res) => {
  res.render("ajax01");
});

app.post("/checkID", (req, res) => {
  // db(json)에 busanit가 저장되어 있다고 가정
  const users = {
    userid: "busanit",
    passwd: "12345",
    username: "busan",
  };
  //:id -> req.params
  // form -> req.body
  // console.log(req.body.userid); 디버깅용
  let msg = "";
  if (users.userid == req.body.userid) {
    msg = "No";
  }
  res.send(msg); // server -> ajax => 결과값을 전송
});

app.listen(PORT, () => console.log(`Server Running : ${PORT}`));
