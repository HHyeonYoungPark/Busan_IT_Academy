const express = require("express");
const mysql = require("mysql");
const cors = require("cors");

const app = express();

//database
const db = mysql.createConnection({
  host: "localhost",
  user: "Grpware",
  password: "Grpware",
  port: "3306",
  database: "Grpware",
  dateString: "date",
});

db.connect();

// middleware
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cors()); // nodejs <- 통신가능 -> reactjs

// url
app.post("/setUserid", (req, res) => {
  //   console.log(req.body.userid); 확인용
  let sql = "INSERT INTO uid VALUES(?);";
  db.query(sql, [req.body.userid], (err) => {
    if (err) {
      throw err;
    } else {
      res.send({ msg: "Insert Completed." }); // 리엑트 쪽으로 데이터를 전송
    }
  });
});

// listen
app.listen(5000, () => console.log("Server Running...port 5000"));
