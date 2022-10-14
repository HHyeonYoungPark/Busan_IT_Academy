const express = require("express");
const cors = require("cors");
const mysql = require("mysql");

const app = express();

// db
const db = mysql.createConnection({
  host: "localhost",
  user: "Grpware",
  password: "Grpware",
  database: "Grpware",
  dateStrings: "date",
});
db.connect();
///////////////////////////////////////////////////////

// middleware
app.use(express.urlencoded({ extended: false }));
app.use(express.json());
app.use(cors());
///////////////////////////////////////////////////////

// url  reactjs -> nodejs 사용할 때ㅣ /api/
app.post("/api/users/addUser", (req, res) => {
  //   console.log("OK"); 확인용
  const { userid, passwd, username } = req.body;
  let sql = "INSERT INTO member3 VALUES(NULL, ?, ?, ?, now());";
  db.query(sql, [userid, passwd, username], (err) => {
    if (err) {
      throw err;
    } else {
      res.json({ msg: "success" });
    }
  });
});

// 전체가져오기
app.get("/api/users", (req, res) => {
  //   console.log("user list"); 확인용
  let sql = "SELECT * FROM member3 ORDER BY id DESC;";
  db.query(sql, (err, result) => {
    if (err) {
      throw err;
    } else {
      res.send(result);
    }
  });
});

app.delete("/api/users/deleteUser/:id", (req, res) => {
  let sql = "DELETE FROM member3 WHERE id =?;";
  db.query(sql, [req.params.id], (err) => {
    if (err) {
      throw err;
    }
  });
});

///////////////////////////////////////////////////////

// listen
app.listen(5000, () => console.log("Server Port 5000 Running..."));
