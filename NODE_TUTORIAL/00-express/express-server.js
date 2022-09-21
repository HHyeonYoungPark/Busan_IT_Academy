const express = require("express");
const app = express();

// url 설정 : method="post" 보이지 않으면 app.get();
// app.get(주소, 콜백(req,res));

// web : request(내가 요청), response(서버 응답,결과)
app.get("/", (req, res) => {
  console.log("Command NodeJS"); // console에서 체크
  res.send("Welcome NodeJS"); //브라우저에서 체크하는 것
});

app.get("/users", (req, res) => {
  res.send("<h1>Busan it academy</h1>");
});

app.get("/json", (req, res) => {
  res.json({ userid: "busanit" });
});

// url 설정

// app.listen(3000, 콜백);
// http://localhost:3000/users : 사용자가 보여지게 만드는 것
app.listen(3000, () => console.log("Server Running 3000..."));
