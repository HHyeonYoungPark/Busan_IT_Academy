const mysql = require("mysql");
require("dotenv").config();

// db분리
// react 처럼 import - 함수 - export 해주면 됨
// mysql 연결 => mysql.createconnection();

const db = mysql.createConnection({
  // process.env 환경변수를 이용하여 노출될 수 있는 정보들을 분리 보관 - 보안성 높임
  host: process.env.HOST,
  port: process.env.PORT,
  user: process.env.USER,
  password: process.env.PASSWORD,
  database: process.env.DATABASE,
  multipleStatements: true, // db.query안에 또 db.query를 쓸때
});

// db.connect()
db.connect((err) => {
  if (!err) {
    console.log("Mysql DB Success");
  } else {
    console.log(err);
  }
});

module.exports = db;
