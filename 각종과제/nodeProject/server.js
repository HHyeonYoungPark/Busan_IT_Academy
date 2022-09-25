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
  res.render("index");
});

app.get("/userList", (req, res) => {
  res.render("userList");
});

app.get("/boardList", (req, res) => {
  res.render("boardList");
});

app.listen(PORT, () => console.log(`Server Running...localhost:${PORT}`));
