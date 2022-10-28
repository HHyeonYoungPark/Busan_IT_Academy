const express = require("express");
const multer = require("multer");
const fs = require("fs"); // folder create
const db = require("./db/db");
const moment = require("moment");

const app = express();

//db

// middleware
app.set("view engine", "ejs"); // view 폴더가 있어야함
app.use(express.urlencoded({ extended: false }));
app.use(express.json());
app.use(express.static("uploads")); // 폴더 권한 설정

// multer : multer.diskstorage(저장위치, 파일이름) -> 실행코드 -> url
const storage = multer.diskStorage({
  // req => file -> callback함수에서 처리
  destination: function (req, file, callback) {
    callback(null, "./uploads");
  },
  filename: function (req, file, callback) {
    callback(null, Date.now() + "_" + file.originalname);
  },
});

const upload = multer({
  storage: storage, // key, value 값같으면 한번만 써도 됨
});

//url
app.get("/", (req, res) => {
  let sql = "SELECT * FROM users ORDER BY id DESC;";
  db.query(sql, (err, result) => {
    if (err) {
      throw err;
    }
    res.render("uploadList", { result, status: 201 });
  });
});

app.get("/add", (req, res) => {
  res.render("uploadAdd");
});

app.post("/add", upload.single("attach"), (req, res) => {
  const user = {
    username: req.body.username,
    email: req.body.email,
    phone: req.body.phone,
    image: req.file.filename,
  };

  // moment = 날짜 포맷을 바꿔서 char타입으로 저장 (now()대신 다른거 써봄)
  // moment(현재날짜).format(날짜포맷);
  const today = moment(new Date()).format("YYYY.MM.DD");

  let sql = "INSERT INTO users VALUES(NULL, ?, ?, ?, ?, ?);";
  db.query(
    sql,
    [user.username, user.email, user.phone, user.image, today],
    (err) => {
      if (err) {
        throw err;
      }
      res.redirect("/");
    }
  );
});

app.get("/delete/:id", (req, res) => {
  //req.params.id

  //db : 이미지 파일 검색
  db.query(
    "SELECT image FROM users WHERE id=?;",
    [req.params.id],
    (err, photo) => {
      if (err) {
        throw err;
      }
      db.query("DELETE FROM users WHERE id=?;", [req.params.id], (err) => {
        if (err) {
          throw err;
        }
        fs.unlink("./uploads/" + photo[0].image, (err) => {
          if (err) {
            throw err;
          }
          res.redirect("/");
        });
      });
    }
  );

  //unlink
});

//port
app.listen(5000, () => {
  let folder = "uploads";
  if (!fs.existsSync(folder)) {
    fs.mkdir(folder, (err) => {
      if (err) {
        throw err;
      }
      console.log("Create Folder Completed...");
    });
  }
  console.log("Server Running PORT 5000");
});
