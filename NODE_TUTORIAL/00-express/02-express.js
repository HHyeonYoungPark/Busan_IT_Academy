const express = require("express");
const app = express();
const usersRoute = require("./routes/usersRoute");
const itmesRoute = require("./routes/itemsRoute");

// middleware =>  요청을 하면(추가적인 작업을 해주는 s/w) 서버에서 응답
// middleware(app.use(), app.set())

//app.use(공통경로, require변수명);
app.use("/users", usersRoute);
app.use("/items", itmesRoute);

app.listen(3000);
