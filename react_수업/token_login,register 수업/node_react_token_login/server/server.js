//import(require)
require("dotenv").config(); // .env에 있는 정보를 읽어옴
const express = require("express");
const cors = require("cors");
const bcrypt = require("bcrypt"); // HashCode generate
const mysql = require("mysql");
const app = express();

const saltRounds = 10; // hash 암호화 횟수(npmjs.com 참고)

//db
const db = mysql.createConnection({
  // process.env 환경변수를 이용하여 노출될 수 있는 정보들을 분리 보관 - 보안성 높임
  host: process.env.DB_HOST,
  port: process.env.DB_PORT,
  user: process.env.DB_USER,
  password: process.env.DB_PASSWORD,
  database: process.env.DB_DATABASE,
  multipleStatements: true,
});

// db.connect()
db.connect((err) => {
  if (!err) {
    console.log("Mysql DB Success");
  } else {
    console.log(err);
  }
});

//middle : server 실행 -> port -> (체크-미들웨어) -> url
// 중간에 넘기기 전에 에러가 있는지 체크하려고..?
app.use(express.urlencoded({ extended: false }));
app.use(express.json());
// cors() -> origin... 이거 나오면 cprs를 안써서 그런거임..
app.use(
  cors({
    // 사이트 신뢰성 옵션
    origin: ["http://localhost:3000"],
    methods: ["GET", "POST"],
    credentials: true,
  })
);

//url

// 회원가입
app.post("/register", (req, res) => {
  let sql = "INSERT INTO login(email, passwd) VALUES(?,?);";
  bcrypt.hash(req.body.passwd, saltRounds, (err, hash_passwd) => {
    db.query(sql, [req.body.email, hash_passwd], (err) => {
      if (err) {
        throw err;
      }
      res.send({
        email: req.body.email,
        token: hash_passwd,
        status: 201,
        message: "Insert Completed",
      });
    });
  });
  //   console.log(req.body.email);
  //   console.log(req.body.passwd);

  //hash
  //1.import
  //2.bcrypt.hash(formData, round, function(err, 겴과)=> {})
  //   console.log(req.body.passwd);
  //   bcrypt.hash(req.body.passwd, saltRounds, (err, result) => {
  //     if (err) {
  //       throw err;
  //     }
  //     res.send({ status: 201, message: "Insert Completed", token: result });
  //   });
});

app.post("/login", (req, res) => {
  //email이 등록된 사용자인지 아닌지
  // true > 비밀번호 비교
  // false . 등록된 사용자가 아닙니다
  //   console.log(req.body.email);
  //   console.log(req.body.passwd);
  ///////////////////////////////////////////////////
  let sql = "SELECT * FROM login WHERE email=?;";
  db.query(sql, [req.body.email], (err, user) => {
    if (user[0] === undefined) {
      // RowDataPacket(값이 없으면) ===undefined
      res.send({
        status: 404,
        message: "존재하지 않는 사용자",
      });
    } else {
      // db(암호화) <=> req.body.passwd 비교 : bcrypt.compare 로 비교
      // 암호화된 것과 입력받은 값을 bcrypt.compare를 통해 비교함
      // bcrypt.compare(login데이터, db암호화된 데이터, 콜백()=>{})
      bcrypt.compare(req.body.passwd, user[0].passwd, (err, result) => {
        if (result) {
          console.log("로그인 성공");
          res.send({
            status: 201,
            message: "로그인 성공",
            token: user[0].passwd,
            email: user[0].email,
          });
        } else {
          console.log("비밀번호 틀림");
          res.send({
            status: 400,
            message: "비밀번호 틀림",
          });
        }
      });
    }
  });
});

//listen
// // 앞에꺼 쓰다가 안되면 뒤에거 포트 쓰셈..
// const PORT = 7777 || process.env.SERVER_PORT;

app.listen(process.env.SERVER_PORT, () =>
  console.log("server running : " + process.env.SERVER_PORT)
);
