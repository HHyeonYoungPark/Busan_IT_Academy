require("dotenv").config();
const express = require("express");
const app = express();

const mysql = require("mysql");
const cors = require("cors");
const fs = require("fs");
const multer = require("multer");
const moment = require("moment");

//db
const db = mysql.createConnection({
  // process.env 환경변수를 이용하여 노출될 수 있는 정보들을 분리 보관 - 보안성 높임
  host: process.env.DB_HOST,
  port: process.env.DB_PORT,
  user: process.env.DB_USER,
  password: process.env.DB_PASSWORD,
  database: process.env.DB_DATABASE,
});

// db.connect()
db.connect((err) => {
  if (!err) {
    console.log("Mysql DB Success");
  } else {
    console.log(err);
  }
});

//multer : 저장함수(저장위치, 파일) -> 실행 -> url 붙이기
const storage = multer.diskStorage({
  destination: function (req, file, callback) {
    callback(null, "./uploads");
  },
  filename: function (req, file, callback) {
    callback(null, Date.now() + "_" + file.originalname);
  },
});

//option 이미지만 업로드 - 나중에 하기로 함...

const upload = multer({
  storage,
});

//middleware
app.use(express.urlencoded({ extended: false }));
app.use(express.json());
app.use(cors());
app.use(express.static("uploads")); // 폴더 접근권한 해제

//Virtual Folder - 이름을 바꿔서 쓰는구나....
// use.app("img", express.static("원본 폴더"));

//url
app.post("/register", upload.single("attach"), (req, res) => {
  const { username } = req.body;
  const { position } = req.body;
  const { filename } = req.file;

  const today = moment(new Date()).format("YYYY.MM.DD");

  let sql = "INSERT INTO users VALUES(NULL,?,?,?,?);";
  db.query(sql, [username, position, filename, today], (err) => {
    if (err) {
      throw err;
    }

    // json(상대코드,메세지)를 사용할 필요가 있을때(register.js)
    res.send({ status: 201, message: "Insert Completed" });
  });
});

//main -call
app.get("/getAllData", (req, res) => {
  let sql = "SELECT * FROM users ORDER BY id DESC";
  db.query(sql, (err, users) => {
    if (err) {
      throw err;
    }
    res.send({ users, status: 201, message: "Get Data Done" });
  });
});

//delete
app.delete("/delete/:id", (req, res) => {
  let sql = "DELETE FROM users WHERE id=?;";
  db.query(sql, [req.params.id], (err) => {
    if (err) {
      throw err;
    }
    res.send({ status: 201, message: "Delete Completed" });
  });
});

//listen
app.listen(process.env.PORT, () => {
  const dir = "uploads";
  if (!fs.existsSync(dir)) {
    fs.mkdir(dir, (err) => {
      if (err) {
        throw err;
      }
    });
  }
  console.log("Server Running Port : " + process.env.PORT);
});
