const express = require("express");
const fs = require("path");
const board = require("./routes/board");

const app = express();
const PORT = 3000;

// 사용 - app.use(공통이름, require변수명) middleware
app.use("/board", require("./routes/board"));

app.listen(PORT, () => console.log(`http://localhost:${PORT}`));
