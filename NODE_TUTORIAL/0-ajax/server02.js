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
app.use(express.json());

//
app.get("/", (req, res) => {
  res.render("ajax02");
});

app.post("/getSi", (req, res) => {
  let sql = "SELECT * FROM si ORDER BY id ASC;";
  db.query(sql, (err, result) => {
    if (err) {
      throw err;
    }
    res.send(result);
  });
});

app.post("/getGu", (req, res) => {
  //   console.log(req.body.si); 디버깅
  let sql = "SELECT gu FROM gu WHERE si = ?;";
  db.query(sql, [req.body.si], (err, result) => {
    if (err) {
      throw err;
    }
    res.send(result);
  });
});

app.listen(PORT, () => console.log(`Server Running : ${PORT}`));
