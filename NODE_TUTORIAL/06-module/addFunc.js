const x = () => console.log("X 함수를 실행중입니다.");
const y = () => console.log("Y 함수를 실행중입니다.");

function sum(a, b) {
  return a + b;
}

module.exports = {
  x,
  y,
  sum,
};
