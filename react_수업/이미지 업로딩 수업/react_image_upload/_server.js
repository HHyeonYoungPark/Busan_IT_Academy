const express = require("express");
const multer = require("multer");
const fs = require("fs"); // folder create

const app = express();

//db

// middleware
app.set("view engine", "ejs"); // view 폴더가 있어야함
app.use(express.urlencoded({ extended: false }));
app.use(express.json());
app.use(express.static("uploads")); // 폴더 권한 설정

// multer
// 1. multer함수 : 저장위치(destination), 파일이름(filename)
// multer.diskStorage(저장위치, 파일명);
// 원본 파일이름 : file.originalname
const storage = multer.diskStorage({
  destination: function (req, file, callback) {
    //저장위치
    callback(null, "./uploads");
  },
  filename: function (req, file, callback) {
    // callback(null, 날짜_file.originalname); 날짜처리를 하면 중복으로 덮어쓰기가 되지 않는다..
    callback(null, Date.now() + "_" + file.originalname);
  },
});

// 2. multer 실행 코드 : multer();
const upload = multer({
  storage: storage,
});
// multer({
//     storage: storage,
//     limits: "용량" // 업로드 용량 제한가능
// });

//url
app.get("/", (req, res) => {
  res.render("upload"); // view > upload.ejs 실행해주세요
});

app.get("/multi", (req, res) => {
  res.render("uploads");
});

// 파일 하나만 업로드
// app.post("/uploadFile", 업로드 or JWT(token처리)등, (req, res) => {
// app.post("/uploadFile", upload.single(html name값), (req, res) => {
app.post("/uploadFile", upload.single("attach"), (req, res) => {
  // text, pw -> req.body로 받지만
  // file -> req.file 로 받는다
  res.render("info01", { file: req.file });
});
// 파일 여러개 업로드
app.post("/uploadsFile", upload.array("attach"), (req, res) => {
  console.log(req.files);
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
