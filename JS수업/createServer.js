// 설정
const http = require("http"); // server ready
const PORT = 5000;
// req(해주세요), res(해줄게요)라는...
const server = http.createServer((req, res) => {
  // localhost:5000/login
  if (req.url === "/login") {
    // res.writeHead(200, { "Content -type": "text/html" }); 없어도 돌아가더라
    res.write("<h1>Busan IT Academy</h1>");
    res.end();
  } else {
    res.write("페이지를 찾을 수 없습니다.");
    res.end();
  }
});

server.listen(PORT, () => console.log(`서버를 실행합니다. 포트번호는 ${PORT}`));
