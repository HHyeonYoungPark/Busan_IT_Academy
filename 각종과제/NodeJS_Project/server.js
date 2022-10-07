const express = require("express");
const mysql = require("mysql");
const path = require("path");
const app = express();
const main = require("./routes/main");
const member = require("./routes/member");
const board = require("./routes/board");
const PORT = 3000;

// middleware
app.set("view engine", "ejs");
app.use(express.json()); //ajax쪽에서 사용
app.use(express.urlencoded({ extended: false }));
app.use(express.static(path.join(__dirname, "/views")));
app.use(express.static(path.join(__dirname, "/assets/css")));
app.use(express.static(path.join(__dirname, "/assets/icons")));

// routes 사용
app.use("/", main);
app.use("/member", member);
app.use("/board", board);

///////////////////////////////////////////////////////////////////////////////////////////////

app.listen(PORT, () => console.log(`Server Running...localhost:${PORT}`));
