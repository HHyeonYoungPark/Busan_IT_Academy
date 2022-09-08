function one() {
  //   시간이 오래 걸리는 작업
  //   setTimeout(작업내용, 시간);
  // setTimeout(() => console.log("One..."), 3000); // 1초 ->1000
  console.log("One...");
}

function two() {
  // 시간이 적게 걸리는 작업
  console.log("Two...");
}

one();
two();
