const express = require("express");
const app = express();
const path = require("path");

// ejs 사용을 위한 middleware
// ejs 기본 폴더 위치는 views이므로 views 폴더 생성 후 html 파일은 여기에 담음
app.set("view engine", "ejs"); // ejs 사용하기 위한 설정(set)
app.use(express.urlencoded({ extended: false })); // html form value 값을 req.body로부터 불러올 때 필요한 middleware
// app.use(express.static("절대경로")); 폴더 보안 해제
app.use(express.static(path.join(__dirname, "/views/css"))); // 폴더 보안해제 한후 쓰고 싶은 폴더 지정해서 사용
app.use(express.static(path.join(__dirname, "/views/js")));

let title = "Busan IT Academy";

// url
// Busan IT Academy > Main
// Busan IT Academy > UserList
// Busan IT Academy > Contact
app.get("/", (req, res) => {
  res.render("index", { title, sub: " > Home" }); // key:value 이름이 같으면 한번만 사용
  //res.render("index"); // render("파일이름만", {전달할 내용})
});

app.get("/addUser", (req, res) => {
  res.render("users", { title, sub: " > Add User" });
}); // form을 통한 사용자 저장하기

app.post("/addUser", (req, res) => {
  console.log(req.body.userid);
  console.log(req.body.passwd);

  res.send({
    userid: req.body.userid,
    passwd: req.body.passwd,
  });
});

app.get("/contact", (req, res) => {
  res.render("contact", { title, sub: " > Contact" });
});

// * => 내가 만든 url을 제외한 나머지 전부
// url 부분 제일 마지막에...
app.get("*", (req, res) => {
  res.render("404", { title, sub: " > 404 Page" });
});

app.listen(3000, () => console.log("Server Running..."));
